package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C13941 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f45886 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator f45887;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11824 f45888;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f45889;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C13941(C11824 c11824) {
        this.f45888 = c11824;
        this.f45887 = new C19585((C9002) c11824.f39715);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m33774() {
        Object next;
        do {
            Iterator it = this.f45887;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f45886 = 0;
                return;
            }
        } while (((Boolean) ((C18879) this.f45888.f39714).invoke(next)).booleanValue());
        this.f45889 = next;
        this.f45886 = 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f45886 == -1) {
            m33774();
        }
        if (this.f45886 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f45889;
        this.f45889 = null;
        this.f45886 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45886 == -1) {
            m33774();
        }
        return this.f45886 == 1;
    }
}
