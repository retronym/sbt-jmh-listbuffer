package skala.collection.mutable;

public interface Growable extends skala.collection.mutable.Clearable {
  public static void $init$(skala.collection.mutable.Growable self) {
  }

  static Growable plusEq$(Growable self, Object elem) {
    return self.plusEq(elem);
  }

  default Growable plusEq(Object elem) {
    return addOne(elem);
  }
  Growable addOne(Object elem);
}