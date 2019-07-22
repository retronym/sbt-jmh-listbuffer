/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2013, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

package bench

import scala.collection.generic._
import scala.collection.mutable.Builder
import scala.annotation.tailrec
import java.io.{ObjectInputStream, ObjectOutputStream}
import java.lang.invoke.VarHandle

import scala.collection.{AbstractSeq, GenTraversableOnce, LinearSeqOptimized}
import scala.collection.immutable.LinearSeq

/** A class for immutable linked lists representing ordered collections
  *  of elements of type `A`.
  *
  *  This class comes with two implementing case classes `scala.Nil1`
  *  and `scala.::` that implement the abstract members `isEmpty`,
  *  `head` and `tail`.
  *
  *  This class is optimal for last-in-first-out (LIFO), stack-like access patterns. If you need another access
  *  pattern, for example, random access or FIFO, consider using a collection more suited to this than `List1`.
  *
  *  $usesMutableState
  *
  *  ==Performance==
  *  '''Time:''' `List1` has `O(1)` prepend and head/tail access. Most other operations are `O(n)` on the number of elements in the list.
  *  This includes the index-based lookup of elements, `length`, `append` and `reverse`.
  *
  *  '''Space:''' `List1` implements '''structural sharing''' of the tail list. This means that many operations are either
  *  zero- or constant-memory cost.
  *  {{{
  *  val mainList = List1(3, 2, 1)
  *  val with4 =    4 :: mainList  // re-uses mainList, costs one :: instance
  *  val with42 =   42 :: mainList // also re-uses mainList, cost one :: instance
  *  val shorter =  mainList.tail  // costs nothing as it uses the same 2::1::Nil1 instances as mainList
  *  }}}
  *
  *  @example {{{
  *  // Make a list via the companion object factory
  *  val days = List1("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
  *
  *  // Make a list element-by-element
  *  val when = "AM" :: "PM" :: List1()
  *
  *  // Pattern match
  *  days match {
  *    case firstDay :: otherDays =>
  *      println("The first day of the week is: " + firstDay)
  *    case List1() =>
  *      println("There don't seem to be any week days.")
  *  }
  *  }}}
  *
  *  @note The functional list is characterized by persistence and structural sharing, thus offering considerable
  *        performance and space consumption benefits in some scenarios if used correctly.
  *        However, note that objects having multiple references into the same functional list (that is,
  *        objects that rely on structural sharing), will be serialized and deserialized with multiple lists, one for
  *        each reference to it. I.e. structural sharing is lost after serialization/deserialization.
  *
  *  @author  Martin Odersky and others
  *  @since   1.0
  *  @see  [[http://docs.scala-lang.org/overviews/collections/concrete-immutable-collection-classes.html#lists "Scala's Collection Library overview"]]
  *  section on `Lists` for more information.
  *
  *  @define coll list
  *  @define Coll `List1`
  *  @define thatinfo the class of the returned collection. In the standard library configuration,
  *    `That` is always `List1[B]` because an implicit of type `CanBuildFrom[List1, B, That]`
  *    is defined in object `List1`.
  *  @define bfinfo an implicit value of class `CanBuildFrom` which determines the
  *    result class `That` from the current representation type `Repr`
  *    and the new element type `B`. This is usually the `canBuildFrom` value
  *    defined in object `List1`.
  *  @define orderDependent
  *  @define orderDependentFold
  *  @define mayNotTerminateInf
  *  @define willNotTerminateInf
  */
@SerialVersionUID(-6084104484083858598L) // value computed by serialver for 2.11.2, annotation added in 2.11.4
sealed abstract class List1[+A] extends AbstractSeq[A]
  with LinearSeq[A]
  with Product
  with GenericTraversableTemplate[A, List1]
  with LinearSeqOptimized[A, List1[A]]
  with scala.Serializable {
  override def companion: GenericCompanion[List1] = List1

  def isEmpty: Boolean
  def head: A
  def tail: List1[A]

  // New methods in List1

  /** Adds an element at the beginning of this list.
    *  @param x the element to prepend.
    *  @return  a list which contains `x` as first element and
    *           which continues with this list.
    *
    *  @usecase def ::(x: A): List1[A]
    *    @inheritdoc
    *
    *    Example:
    *    {{{1 :: List1(2, 3) = List1(2, 3).::(1) = List1(1, 2, 3)}}}
    */
  def ::[B >: A] (x: B): List1[B] =
    new bench.::(x, this)

  /** Adds the elements of a given list in front of this list.
    *  @param prefix  The list elements to prepend.
    *  @return a list resulting from the concatenation of the given
    *    list `prefix` and this list.
    *
    *  @usecase def :::(prefix: List1[A]): List1[A]
    *    @inheritdoc
    *
    *    Example:
    *    {{{List1(1, 2) ::: List1(3, 4) = List1(3, 4).:::(List1(1, 2)) = List1(1, 2, 3, 4)}}}
    */
  def :::[B >: A](prefix: List1[B]): List1[B] =
    if (isEmpty) prefix
    else if (prefix.isEmpty) this
    else (new ListBuffer1[B] ++= prefix).prependToList(this)

  /** Adds the elements of a given list in reverse order in front of this list.
    *  `xs reverse_::: ys` is equivalent to
    *  `xs.reverse ::: ys` but is more efficient.
    *
    *  @param prefix the prefix to reverse and then prepend
    *  @return       the concatenation of the reversed prefix and the current list.
    *
    *  @usecase def reverse_:::(prefix: List1[A]): List1[A]
    *    @inheritdoc
    */
  def reverse_:::[B >: A](prefix: List1[B]): List1[B] = {
    var these: List1[B] = this
    var pres = prefix
    while (!pres.isEmpty) {
      these = pres.head :: these
      pres = pres.tail
    }
    these
  }

  /** Builds a new list by applying a function to all elements of this list.
    *  Like `xs map f`, but returns `xs` unchanged if function
    *  `f` maps all elements to themselves (as determined by `eq`).
    *
    *  @param f      the function to apply to each element.
    *  @tparam B     the element type of the returned collection.
    *  @return       a list resulting from applying the given function
    *                `f` to each element of this list and collecting the results.
    *
    *  @usecase def mapConserve(f: A => A): List1[A]
    *    @inheritdoc
    */
  @inline final def mapConserve[B >: A <: AnyRef](f: A => B): List1[B] = {
    // Note to developers: there exists a duplication between this function and `reflect.internal.util.Collections#map2Conserve`.
    // If any successful optimization attempts or other changes are made, please rehash them there too.
    @tailrec
    def loop(mappedHead: List1[B] = Nil1, mappedLast: ::[B], unchanged: List1[A], pending: List1[A]): List1[B] =
      if (pending.isEmpty) {
        if (mappedHead eq null) unchanged
        else {
          mappedLast.tl = unchanged
          mappedHead
        }
      }
      else {
        val head0 = pending.head
        val head1 = f(head0)

        if (head1 eq head0.asInstanceOf[AnyRef])
          loop(mappedHead, mappedLast, unchanged, pending.tail)
        else {
          var xc = unchanged
          var mappedHead1: List1[B] = mappedHead
          var mappedLast1: ::[B] = mappedLast
          while (xc ne pending) {
            val next = new ::[B](xc.head, Nil1)
            if (mappedHead1 eq null) mappedHead1 = next
            if (mappedLast1 ne null) mappedLast1.tl = next
            mappedLast1 = next
            xc = xc.tail
          }
          val next = new ::(head1, Nil1)
          if (mappedHead1 eq null) mappedHead1 = next
          if (mappedLast1 ne null) mappedLast1.tl = next
          mappedLast1 = next
          val tail0 = pending.tail
          loop(mappedHead1, mappedLast1, tail0, tail0)

        }
      }
    loop(null, null, this, this)
  }

  // Overridden methods from IterableLike and SeqLike or overloaded variants of such methods

  override def ++[B >: A, That](that: GenTraversableOnce[B])(implicit bf: CanBuildFrom[List1[A], B, That]): That = ???

  override def +:[B >: A, That](elem: B)(implicit bf: CanBuildFrom[List1[A], B, That]): That = bf match {
    case _: List1.GenericCanBuildFrom[_] => (elem :: this).asInstanceOf[That]
    case _ => super.+:(elem)(bf)
  }

  override def toList: List[A] = ???

  override def take(n: Int): List1[A] = if (isEmpty || n <= 0) Nil1 else {
    val h = new ::(head, Nil1)
    var t = h
    var rest = tail
    var i = 1
    while ({if (rest.isEmpty) return this; i < n}) {
      i += 1
      val nx = new ::(rest.head, Nil1)
      t.tl = nx
      t = nx
      rest = rest.tail
    }
    h
  }

  override def drop(n: Int): List1[A] = {
    var these = this
    var count = n
    while (!these.isEmpty && count > 0) {
      these = these.tail
      count -= 1
    }
    these
  }

  /**
    *  @example {{{
    *  // Given a list
    *  val letters = List1('a','b','c','d','e')
    *
    *  // `slice` returns all elements beginning at index `from` and afterwards,
    *  // up until index `until` (excluding index `until`.)
    *  letters.slice(1,3) // Returns List1('b','c')
    *  }}}
    */
  override def slice(from: Int, until: Int): List1[A] = {
    val lo = scala.math.max(from, 0)
    if (until <= lo || isEmpty) Nil1    else this drop lo take (until - lo)
  }

  override def takeRight(n: Int): List1[A] = {
    @tailrec
    def loop(lead: List1[A], lag: List1[A]): List1[A] = lead match {
      case Nil1 => lag
      case _ :: tail => loop(tail, lag.tail)
    }
    loop(drop(n), this)
  }

  // dropRight is inherited from LinearSeq

  override def splitAt(n: Int): (List1[A], List1[A]) = ???

  final override def map[B, That](f: A => B)(implicit bf: CanBuildFrom[List1[A], B, That]): That = {
    if (bf eq List1.ReusableCBF) {
      if (this eq Nil1) Nil1.asInstanceOf[That] else {
        val h = new ::[B](f(head), Nil1)
        var t: ::[B] = h
        var rest = tail
        while (rest ne Nil1) {
          val nx = new ::(f(rest.head), Nil1)
          t.tl = nx
          t = nx
          rest = rest.tail
        }
        h.asInstanceOf[That]
      }
    }
    else super.map(f)
  }

  final override def collect[B, That](pf: PartialFunction[A, B])(implicit bf: CanBuildFrom[List1[A], B, That]): That = {
    if (bf eq List1.ReusableCBF) {
      if (this eq Nil1) Nil1.asInstanceOf[That] else {
        var rest = this
        var h: ::[B] = null
        // Special case for first element
        do {
          val x: Any = pf.applyOrElse(rest.head, List1.partialNotApplied)
          if (x.asInstanceOf[AnyRef] ne List1.partialNotApplied) h = new ::(x.asInstanceOf[B], Nil1)
          rest = rest.tail
          if (rest eq Nil1) return (if (h eq null ) Nil1 else h).asInstanceOf[That]
        } while (h eq null)
        var t = h
        // Remaining elements
        do {
          val x: Any = pf.applyOrElse(rest.head, List1.partialNotApplied)
          if (x.asInstanceOf[AnyRef] ne List1.partialNotApplied) {
            val nx = new ::(x.asInstanceOf[B], Nil1)
            t.tl = nx
            t = nx
          }
          rest = rest.tail
        } while (rest ne Nil1)
        h.asInstanceOf[That]
      }
    }
    else super.collect(pf)
  }

  final override def flatMap[B, That](f: A => GenTraversableOnce[B])(implicit bf: CanBuildFrom[List1[A], B, That]): That = {
    if (bf eq List1.ReusableCBF) {
      if (this eq Nil1) Nil1.asInstanceOf[That] else {
        var rest = this
        var found = false
        var h: ::[B] = null
        var t: ::[B] = null
        while (rest ne Nil1) {
          f(rest.head).seq.foreach{ b =>
            if (!found) {
              h = new ::(b, Nil1)
              t = h
              found = true
            }
            else {
              val nx = new ::(b, Nil1)
              t.tl = nx
              t = nx
            }
          }
          rest = rest.tail
        }
        (if (!found) Nil1 else h).asInstanceOf[That]
      }
    }
    else super.flatMap(f)
  }

  @inline final override def takeWhile(p: A => Boolean): List1[A] = ???

  @inline final override def dropWhile(p: A => Boolean): List1[A] = {
    @tailrec
    def loop(xs: List1[A]): List1[A] =
      if (xs.isEmpty || !p(xs.head)) xs
      else loop(xs.tail)

    loop(this)
  }

  @inline final override def span(p: A => Boolean): (List1[A], List1[A]) = {
    val b = new ListBuffer1[A]
    var these = this
    while (!these.isEmpty && p(these.head)) {
      b += these.head
      these = these.tail
    }
    (???, these)
  }

  // Overridden with an implementation identical to the inherited one (at this time)
  // solely so it can be finalized and thus inlinable.
  @inline final override def foreach[U](f: A => U) {
    var these = this
    while (!these.isEmpty) {
      f(these.head)
      these = these.tail
    }
  }

  override def reverse: List1[A] = {
    var result: List1[A] = Nil1
    var these = this
    while (!these.isEmpty) {
      result = these.head :: result
      these = these.tail
    }
    result
  }

  override def foldRight[B](z: B)(op: (A, B) => B): B =
    reverse.foldLeft(z)((right, left) => op(left, right))

  override def stringPrefix = "List1"

  override def toStream : Stream[A] =
    if (isEmpty) Stream.Empty
    else new Stream.Cons(head, tail.toStream)

  // Create a proxy for Java serialization that allows us to avoid mutation
  // during deserialization.  This is the Serialization Proxy Pattern.
  protected final def writeReplace(): AnyRef = new List1.SerializationProxy(this)
}

/** The empty list.
  *
  *  @author  Martin Odersky
  *  @since   2.8
  */
@SerialVersionUID(0 - 8256821097970055419L)
case object Nil1 extends List1[Nothing] {
  override def isEmpty = true
  override def head: Nothing =
    throw new NoSuchElementException("head of empty list")
  override def tail: List1[Nothing] =
    throw new UnsupportedOperationException("tail of empty list")
  // Removal of equals method here might lead to an infinite recursion similar to IntMap.equals.
  override def equals(that: Any) = that match {
    case that1: scala.collection.GenSeq[_] => that1.isEmpty
    case _ => false
  }
}

/** A non empty list characterized by a head and a tail.
  *  @param head the first element of the list
  *  @param tl   the list containing the remaining elements of this list after the first one.
  *  @tparam B   the type of the list elements.
  *  @author  Martin Odersky
  *  @since   2.8
  */
@SerialVersionUID(509929039250432923L) // value computed by serialver for 2.11.2, annotation added in 2.11.4
final case class ::[B](override val head: B, private[bench] var tl: List1[B]) extends List1[B] {
  override def tail : List1[B] = tl
  override def isEmpty: Boolean = false
}

/** $factoryInfo
  *  @define coll list
  *  @define Coll `List1`
  */
object List1 extends SeqFactory[List1] {
  /** $genericCanBuildFromInfo */
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, List1[A]] =
    ReusableCBF.asInstanceOf[GenericCanBuildFrom[A]]

  def newBuilder[A]: Builder[A, List1[A]] = new ListBuffer1[A]

  override def empty[A]: List1[A] = Nil1
  override def apply[A](xs: A*): List1[A] = ???

  val partialNotApplied = new Function1[Any, Any] { def apply(x: Any): Any = this }

  @SerialVersionUID(1L)
  private class SerializationProxy[A](@transient private var orig: List1[A]) extends Serializable {

    private def writeObject(out: ObjectOutputStream) {
      out.defaultWriteObject()
      var xs: List1[A] = orig
      while (!xs.isEmpty) {
        out.writeObject(xs.head)
        xs = xs.tail
      }
      out.writeObject(ListSerializeEnd)
    }

    // Java serialization calls this before readResolve during deserialization.
    // Read the whole list and store it in `orig`.
    private def readObject(in: ObjectInputStream) {
      in.defaultReadObject()
      val builder = List1.newBuilder[A]
      while (true) in.readObject match {
        case ListSerializeEnd =>
          orig = builder.result()
          return
        case a =>
          builder += a.asInstanceOf[A]
      }
    }

    // Provide the result stored in `orig` for Java serialization
    private def readResolve(): AnyRef = orig
  }
}

/** Only used for list serialization */
@SerialVersionUID(0L - 8476791151975527571L)
private[bench] case object ListSerializeEnd
