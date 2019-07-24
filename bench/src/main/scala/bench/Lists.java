package bench;

import scala.*;
import scala.collection.*;
import scala.collection.Iterable;
import scala.collection.immutable.*;
import scala.collection.immutable.IndexedSeq;
import scala.collection.immutable.LinearSeq;
import scala.collection.immutable.Seq;
import scala.collection.immutable.Set;
import scala.collection.mutable.Buffer;
import scala.collection.mutable.Builder;
import scala.collection.mutable.Map;
import scala.collection.mutable.StringBuilder;
import scala.math.Numeric;
import scala.math.Ordering;
import scala.reflect.ClassTag;
import scala.util.Either;

import java.lang.invoke.VarHandle;

class Lists {

  static class List {
  }

  static class Nil extends List {
    private Nil() {
    }

    static final Nil instance = new Nil();
  }

  static class Cons extends List {
    final Object head;
    List next;

    Cons(Object head, List next) {
      this.head = head;
      this.next = next;
      // Implicit releaseFence
    }

    private Cons(Object head, List next, int dummy) {
      this.head = head;
      this.next = next;
      VarHandle.releaseFence();
      // Implicit releaseFence
    }

    static Cons applyFenced(Object head, List next) {
      return new Cons(head, next, 0);
    }
  }

  static class ListBuffer {
    private List start = Nil.instance;
    private Cons last0 = null;
    private boolean aliased = false;
    private int len = 0;

    void addOne(Object elem) {
      ensureUnaliased();
      var last1 = Cons.applyFenced(elem, Nil.instance);
      if (len == 0) start = last1; else last0.next = last1;
      last0 = last1;
      len += 1;
    }

    List result() {
      aliased = len > 0;
      VarHandle.releaseFence();
      return start;
    }

    private void ensureUnaliased() {
      if (aliased) copyElems();
    }

    private void copyElems() {
      if (start instanceof Cons) {
        Cons rest = (Cons) this.start;
        ListBuffer buf = new ListBuffer();
        do {
          buf.addOne(rest.head);
        } while (rest.next != Nil.instance && ((rest = (Cons) rest.next) == rest));
        this.start = buf.start;
        this.last0 = buf.last0;
      }
    }
  }
}
