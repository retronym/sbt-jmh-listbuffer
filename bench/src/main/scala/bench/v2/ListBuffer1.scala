package bench.v2

final class ListBuffer1[A] {
  private var start: List1[A] = Nil1
  private var last0: ::[A] = _
  private[this] var exported: Boolean = false
  private[this] var len = 0

  def isEmpty: Boolean = len == 0
  def nonEmpty: Boolean = len > 0

  /** Appends a single element to this buffer. This operation takes constant time.
    *
    *  @param x  the element to append.
    *  @return   this $coll.
    */
  def += (x: A): Unit = {
    ensureUnaliased()
    val last1 = new :: (x, Nil1)
    if (isEmpty) {
      last0 = last1
      start = last0
    } else {
      val last1 = last0
      last0 = last1
      last1.tl = last0
    }
    len += 1
  }

  private def ensureUnaliased() = {
    if (exported) copy()
  }
  /** Clears the buffer contents.
    */
  def clear() {
    start = Nil1
    last0 = null
    exported = false
    len = 0
  }

  def result: List1[A] = {
    exported = !isEmpty
    start
  }

  private def copy() {
    if (isEmpty) return
    var cursor = start
    val limit = last0.tail
    clear()
    while (cursor ne limit) {
      this += cursor.head
      cursor = cursor.tail
    }
  }
}
