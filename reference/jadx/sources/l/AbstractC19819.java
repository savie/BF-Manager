package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩴ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: K60O */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19819 implements ListIterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f63708;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f63709;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f63710;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f63711;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63712;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo14867(C8565 c8565, int i);

    public AbstractC19819(C24975 c24975, int i, int i2) {
        this.f63710 = c24975;
        this.f63709 = i;
        this.f63711 = i;
        this.f63708 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45585() {
        return this.f63711;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f63712 < this.f63708;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (this.f63712 >= this.f63708) {
            throw new NoSuchElementException();
        }
        C8565 c8565M8724 = this.f63710.m55818().m8724(this.f63711);
        int i = this.f63712;
        this.f63712 = i + 1;
        Object objMo14867 = mo14867(c8565M8724, i);
        this.f63711 = c8565M8724.m23001();
        c8565M8724.m22995();
        return objMo14867;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f63712 > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f63712 - 1;
        C8565 c8565M8724 = this.f63710.m55818().m8724(this.f63709);
        this.f63712 = 0;
        while (true) {
            int i2 = this.f63712;
            if (i2 < i) {
                this.f63712 = i2 + 1;
                mo14867(c8565M8724, i2);
            } else {
                this.f63712 = i2 + 1;
                Object objMo14867 = mo14867(c8565M8724, i2);
                this.f63711 = c8565M8724.m23001();
                c8565M8724.m22995();
                return objMo14867;
            }
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f63712;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f63712 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
