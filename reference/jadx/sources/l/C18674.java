package l;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩻ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18674 implements Iterator, InterfaceC19597 {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public C18674(C8233 c8233) {
        this.b = c8233.a.iterator();
    }

    public C18674(C22162 c22162) {
        this.b = c22162.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C8978((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                C22581.forEachRemaining(this.b, consumer);
                break;
            default:
                C22581.forEachRemaining(this.b, new C16765(consumer, 2));
                break;
        }
    }
}
