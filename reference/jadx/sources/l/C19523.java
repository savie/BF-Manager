package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩴۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19523 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15047 f62995;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator f62996;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62997 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f62998;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C19523(C15047 c15047) {
        this.f62995 = c15047;
        this.f62996 = new C23999((C3861) c15047.f49111);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m45068() {
        Object next;
        do {
            Iterator it = this.f62996;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f62997 = 0;
                return;
            }
        } while (((Boolean) ((C12064) this.f62995.f49110).invoke(next)).booleanValue());
        this.f62998 = next;
        this.f62997 = 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f62997 == -1) {
            m45068();
        }
        if (this.f62997 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f62998;
        this.f62998 = null;
        this.f62997 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f62997 == -1) {
            m45068();
        }
        return this.f62997 == 1;
    }
}
