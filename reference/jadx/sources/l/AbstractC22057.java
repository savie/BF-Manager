package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2661 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22057 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71130;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f71131;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8565 f71132;

    public AbstractC22057(C8565 c8565, int i) {
        this.f71132 = c8565;
        this.f71131 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71130 < this.f71131;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f71130;
        if (i >= this.f71131) {
            throw new NoSuchElementException();
        }
        this.f71130 = i + 1;
        return ((C21376) this).f68074.f59910.m55803(this.f71132.m22996() - 1);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
