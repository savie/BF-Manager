package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۤۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2661 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10028 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f34237;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34238;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18825 f34239;

    public AbstractC10028(C18825 c18825, int i) {
        this.f34239 = c18825;
        this.f34237 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34238 < this.f34237;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f34238;
        if (i >= this.f34237) {
            throw new NoSuchElementException();
        }
        this.f34238 = i + 1;
        return ((C22022) this).f71387.f3505.m41164(this.f34239.m43449() - 1);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
