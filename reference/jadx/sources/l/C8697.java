package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8697 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Iterator f29915;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f29916 = C19280.f62237;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Iterator f29917;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayDeque f29918;

    public C8697(Iterator it) {
        this.f29917 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f29916;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f29917;
                if (it3 == null || !it3.hasNext()) {
                    ArrayDeque arrayDeque = this.f29918;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        it = null;
                        break;
                    }
                    this.f29917 = (Iterator) this.f29918.removeFirst();
                } else {
                    it = this.f29917;
                    break;
                }
            }
            this.f29917 = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f29916 = it4;
            if (it4 instanceof C8697) {
                C8697 c8697 = (C8697) it4;
                this.f29916 = c8697.f29916;
                if (this.f29918 == null) {
                    this.f29918 = new ArrayDeque();
                }
                this.f29918.addFirst(this.f29917);
                if (c8697.f29918 != null) {
                    while (!c8697.f29918.isEmpty()) {
                        this.f29918.addFirst((Iterator) c8697.f29918.removeLast());
                    }
                }
                this.f29917 = c8697.f29917;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Iterator it = this.f29916;
            this.f29915 = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f29915;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f29915 = null;
    }
}
