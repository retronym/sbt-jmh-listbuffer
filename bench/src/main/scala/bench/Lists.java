package bench;

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
    private List first = Nil.instance;
    private Cons last0 = null;
    private boolean aliased = false;
    private int len = 0;

    void addOne(Object elem) {
      ensureUnaliased();
      Cons last1 = new Cons(elem, Nil.instance);
      if (len == 0) first = last1;
      else last0.next = last1;
      last0 = last1;
      len += 1;
    }

    List result() {
      aliased = len > 0;
      return first;
    }

    private void ensureUnaliased() {
      if (aliased) copyElems();
    }

    private void copyElems() {
      if (first instanceof Cons) {
        Cons rest = (Cons) this.first;
        ListBufferResultFence buf = new ListBufferResultFence();
        do {
          buf.addOne(rest.head);
        } while (rest.next != Nil.instance && ((rest = (Cons) rest.next) == rest));
        this.first = buf.first;
        this.last0 = buf.last0;
      }
    }
  }

  static class ListBufferConstructorAndResultFence {
    private List first = Nil.instance;
    private Cons last0 = null;
    private boolean aliased = false;
    private int len = 0;

    void addOne(Object elem) {
      ensureUnaliased();
      Cons last1 = Cons.applyFenced(elem, Nil.instance);
      if (len == 0) first = last1;
      else last0.next = last1;
      last0 = last1;
      len += 1;
    }

    List result() {
      aliased = len > 0;
      VarHandle.releaseFence();
      return first;
    }

    private void ensureUnaliased() {
      if (aliased) copyElems();
    }

    private void copyElems() {
      if (first instanceof Cons) {
        Cons rest = (Cons) this.first;
        ListBufferResultFence buf = new ListBufferResultFence();
        do {
          buf.addOne(rest.head);
        } while (rest.next != Nil.instance && ((rest = (Cons) rest.next) == rest));
        this.first = buf.first;
        this.last0 = buf.last0;
      }
    }
  }

  static class ListBufferResultFence {
    private List first = Nil.instance;
    private Cons last0 = null;
    private boolean aliased = false;
    private int len = 0;

    void addOne(Object elem) {
      ensureUnaliased();
      Cons last1 = new Cons(elem, Nil.instance);
      if (len == 0) first = last1;
      else last0.next = last1;
      last0 = last1;
      len += 1;
    }

    List result() {
      aliased = len > 0;
      VarHandle.releaseFence();
      return first;
    }

    private void ensureUnaliased() {
      if (aliased) copyElems();
    }

    private void copyElems() {
      if (first instanceof Cons) {
        Cons rest = (Cons) this.first;
        ListBufferResultFence buf = new ListBufferResultFence();
        do {
          buf.addOne(rest.head);
        } while (rest.next != Nil.instance && ((rest = (Cons) rest.next) == rest));
        this.first = buf.first;
        this.last0 = buf.last0;
      }
    }
  }
}
