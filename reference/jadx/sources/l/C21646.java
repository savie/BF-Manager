package l;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21646 implements Iterator, InterfaceC6206 {
    public final /* synthetic */ int a = 1;
    public final Iterator b;

    public C21646(C18824 c18824) {
        this.b = c18824.a.iterator();
    }

    public C21646(C16708 c16708) {
        this.b = c16708.a.iterator();
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
                return new C20941((Map.Entry) this.b.next());
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

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                C17495.forEachRemaining(this.b, consumer);
                break;
            default:
                C17495.forEachRemaining(this.b, new C4879(consumer, 2));
                break;
        }
    }
}
