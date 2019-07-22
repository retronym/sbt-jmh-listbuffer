/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2013, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

package bench.v2

import java.io.{ObjectInputStream, ObjectOutputStream}

import scala.annotation.tailrec
import scala.collection.generic._
import scala.collection.immutable.LinearSeq
import scala.collection.mutable.Builder
import scala.collection.{AbstractSeq, GenTraversableOnce, LinearSeqOptimized}

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
sealed abstract class List1[+A] {

  def isEmpty: Boolean
  def head: A
  def tail: List1[A]

  // New methods in List1

  /** Adds an element at the beginning of this list.
    *
    * @param x the element to prepend.
    * @return a list which contains `x` as first element and
    *         which continues with this list.
    * @usecase def ::(x: A): List1[A]
    * @inheritdoc
    *
    * Example:
    * {{{1 :: List1(2, 3) = List1(2, 3).::(1) = List1(1, 2, 3)}}}
    */
  def ::[B >: A](x: B): List1[B] =
    new ::(x, this)


  /** Builds a new list by applying a function to all elements of this list.
    * Like `xs map f`, but returns `xs` unchanged if function
    * `f` maps all elements to themselves (as determined by `eq`).
    *
    * @param f the function to apply to each element.
    * @tparam B the element type of the returned collection.
    * @return a list resulting from applying the given function
    *         `f` to each element of this list and collecting the results.
    * @usecase def mapConserve(f: A => A): List1[A]
    * @inheritdoc
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
object List1 {
  def newBuilder[A]: Builder[A, List1[A]] = new ListBuffer1[A]

  def empty[A]: List1[A] = Nil1
  def apply[A](xs: A*): List1[A] = ???

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
