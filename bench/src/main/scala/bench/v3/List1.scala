package bench.v3

import java.lang.invoke.VarHandle

sealed abstract class List1[+A] {
  def isEmpty: Boolean
  def head: A
  def tail: List1[A]

  def ::[B >: A](x: B): List1[B] =
    new ::(x, this)
}

case object Nil1 extends List1[Nothing] {
  override def isEmpty = true
  override def head: Nothing = throw new NoSuchElementException("head of empty list")
  override def tail: List1[Nothing] = throw new UnsupportedOperationException("tail of empty list")
}

final case class ::[B](override val head: B, private[bench] var tl: List1[B]) extends List1[B] {
  VarHandle.releaseFence()

  override def tail : List1[B] = tl
  override def isEmpty: Boolean = false
}
