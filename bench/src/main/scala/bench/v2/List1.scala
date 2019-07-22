package bench.v2


import scala.annotation.unchecked.uncheckedVariance
import scala.runtime.Statics.releaseFence

sealed abstract class List[+A] {

  def :: [B >: A](elem: B): List[B] =  new ::(elem, this)


  final def isEmpty: Boolean = this eq Nil

}

// Internal code that mutates `next` _must_ call `Statics.releaseFence()` if either immediately, or
// before a newly-allocated, thread-local :: instance is aliased (e.g. in ListBuffer.toList)
final case class :: [+A](val head: A, private[v2] var next: List[A @uncheckedVariance]) // sound because `next` is used only locally
  extends List[A] {
  releaseFence()
  def tail: List[A] = next
}

case object Nil extends List[Nothing] {
}

object List  {

  def from[B](coll: collection.IterableOnce[B]): List[B] = ???

  def newBuilder[A]: ListBuffer[A] = new ListBuffer()

  def empty[A]: List[A] = Nil

}
