
package skala.collection.immutable;

public final class $colon$colon
extends List
implements skala.Product {
    private final Object head;
    private List next;

    public List next$access$1() {
        return this.next;
    }

    public Object head() {
        return this.head;
    }

    public List next() {
        return this.next;
    }

    public void next_$eq(List x$1) {
        this.next = x$1;
    }

    public $colon$colon(Object head, List next) {
        this.head = head;
        this.next = next;
        try {
            scala.runtime.Statics.releaseFence();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
    