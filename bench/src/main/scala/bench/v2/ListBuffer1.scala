package bench.v2

import scala.annotation.tailrec
import scala.collection.generic.DefaultSerializable
import scala.collection.{IterableFactoryDefaults, IterableOnce, Iterator, SeqFactory, StrictOptimizedSeqFactory, StrictOptimizedSeqOps, immutable}
import scala.collection.mutable.{AbstractBuffer, Builder, GrowableBuilder, ReusableBuilder, SeqOps}
import scala.runtime.Statics.releaseFence

class ListBuffer[A]
  extends AbstractBuffer[A]
    with SeqOps[A, ListBuffer, ListBuffer[A]]
    with StrictOptimizedSeqOps[A, ListBuffer, ListBuffer[A]]
    with ReusableBuilder[A, List[A]]
    with IterableFactoryDefaults[A, ListBuffer]
    with DefaultSerializable {

  private var first: List[A] = Nil
  private var last0: ::[A] = null
  private[this] var aliased = false
  private[this] var len = 0

  private type Predecessor[A0] = ::[A0] /*| Null*/

  def iterator = first.iterator

  override def iterableFactory: SeqFactory[ListBuffer] = ListBuffer

  @throws[IndexOutOfBoundsException]
  def apply(i: Int) = first.apply(i)

  def length = len
  override def knownSize = len

  override def isEmpty: Boolean = len == 0

  private def copyElems(): Unit = {
    val buf = ListBuffer.from(this)
    first = buf.first
    last0 = buf.last0
    aliased = false
  }

  private def ensureUnaliased() = if (aliased) copyElems()

  def result(): List[A] = {
    aliased = nonEmpty
    // We've accumulated a number of mutations to `List.tail` by this stage.
    // Make sure they are visible to threads that the client of this ListBuffer might be about
    // to share this List with.
    releaseFence()
    first
  }


  def clear(): Unit = {
    first = Nil
    len = 0
    last0 = null
    aliased = false
  }

  final def addOne(elem: A): this.type = {
    ensureUnaliased()
    val last1 = new ::[A](elem, Nil)
    if (len == 0) first = last1 else last0.next = last1
    last0 = last1
    len += 1
    this
  }

  def update(idx: Int, elem: A): Unit = ???
  def insert(idx: Int, elem: A): Unit = ???
  def insertAll(idx: Int, elems: scala.collection.IterableOnce[A]): Unit = ???
  def patchInPlace(from: Int, patch: scala.collection.IterableOnce[A], replaced: Int): this.type = ???
  def prepend(elem: A): this.type = ???
  def remove(idx: Int, count: Int): Unit = ???
  def remove(idx: Int): A = ???

  /**
    * Selects the last element.
    *
    * Runs in constant time.
    *
    * @return The last element of this $coll.
    * @throws NoSuchElementException If the $coll is empty.
    */
  override def last: A = if (last0 eq null) throw new NoSuchElementException("last of empty ListBuffer") else last0.head

  /**
    * Optionally selects the last element.
    *
    * Runs in constant time.
    *
    * @return the last element of this $coll$ if it is nonempty, `None` if it is empty.
    */
  override def lastOption: Option[A] = if (last0 eq null) None else Some(last0.head)

  @deprecatedOverriding("Compatibility override", since="2.13.0")
  override protected[this] def stringPrefix = "ListBuffer"

}

@SerialVersionUID(3L)
object ListBuffer extends StrictOptimizedSeqFactory[ListBuffer] {

  def from[A](coll: collection.IterableOnce[A]): ListBuffer[A] = new ListBuffer[A] ++= coll

  def newBuilder[A]: Builder[A, ListBuffer[A]] = new GrowableBuilder(empty[A])

  def empty[A]: ListBuffer[A] = new ListBuffer[A]
}
