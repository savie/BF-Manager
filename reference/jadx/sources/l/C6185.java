package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۛۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6185 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Iterator f21070;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f21071 = C12150.f39059;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Iterator f21072;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayDeque f21073;

    public C6185(Iterator it) {
        this.f21070 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f21071;
            C17359.requireNonNull(it2);
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f21070;
                if (it3 == null || !it3.hasNext()) {
                    ArrayDeque arrayDeque = this.f21073;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        it = null;
                        break;
                    }
                    this.f21070 = (Iterator) this.f21073.removeFirst();
                } else {
                    it = this.f21070;
                    break;
                }
            }
            this.f21070 = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f21071 = it4;
            if (it4 instanceof C6185) {
                C6185 c6185 = (C6185) it4;
                this.f21071 = c6185.f21071;
                if (this.f21073 == null) {
                    this.f21073 = new ArrayDeque();
                }
                this.f21073.addFirst(this.f21070);
                if (c6185.f21073 != null) {
                    while (!c6185.f21073.isEmpty()) {
                        this.f21073.addFirst((Iterator) c6185.f21073.removeLast());
                    }
                }
                this.f21070 = c6185.f21070;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Iterator it = this.f21071;
            this.f21072 = it;
            C17359.requireNonNull(it);
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f21072;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f21072 = null;
    }
}
