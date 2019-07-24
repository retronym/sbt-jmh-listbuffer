package skala.collection.mutable; public abstract class AbstractBuffer extends skala.collection.mutable.AbstractSeq implements skala.collection.mutable.Buffer {
  public AbstractBuffer() { super();  }
  public Growable plusEq1(Object elem) {
    return Growable.plusEq$(this, elem);
  }
}