
package skala.collection.mutable;


import scala.runtime.Statics;

public class ListBuffer
    extends skala.collection.mutable.AbstractBuffer
    implements skala.collection.StrictOptimizedSeqOps,
    skala.collection.mutable.ReusableBuilder/*, /*DefaultSerializable */ {
  private skala.collection.immutable.List first = skala.collection.immutable.Nil$.MODULE$;
  private skala.collection.immutable.$colon$colon last0 = null;
  private boolean aliased = false;
  private int len = 0;


  private skala.collection.immutable.List first() {
    return this.first;
  }

  private void first_$eq(skala.collection.immutable.List x$1) {
    this.first = x$1;
  }

  private skala.collection.immutable.$colon$colon last0() {
    return this.last0;
  }

  private void last0_$eq(skala.collection.immutable.$colon$colon x$1) {
    this.last0 = x$1;
  }

  public boolean isEmpty() {
    return this.len == 0;
  }

  private void copyElems() {
    throw new UnsupportedOperationException();
//    Object buf = ListBuffer$.MODULE$.from((IterableOnce) this);
//    this.first_$eq(ListBuffer.super.first());
//    this.last0_$eq(ListBuffer.super.last0());
//    this.aliased = false;
  }

  private void ensureUnaliased() {
    if (this.aliased) {
      this.copyElems();
    }
  }

  public skala.collection.immutable.List toList() {
    this.aliased = this.len != 0;
    try {
      Statics.releaseFence();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
    return this.first();
  }

  public skala.collection.immutable.List result() {
    return this.toList();
  }


  public final ListBuffer addOne(Object elem) {
    this.ensureUnaliased();
    skala.collection.immutable.$colon$colon last1 = new skala.collection.immutable.$colon$colon(elem, skala.collection.immutable.Nil$.MODULE$);
    if (this.len == 0) {
      this.first_$eq(last1);
    } else {
      this.last0().next_$eq(last1);
    }
    this.last0_$eq(last1);
    ++this.len;
    return this;
  }

}
  