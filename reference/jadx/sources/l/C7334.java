package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes3.dex */
public final class C7334 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f24372;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16507 f24373;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f24374 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24375;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24376;

    public C7334(AbstractC16507 abstractC16507, int i) {
        this.f24373 = abstractC16507;
        this.f24372 = i;
        this.f24375 = abstractC16507.mo36175();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24376 < this.f24375;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo36170 = this.f24373.mo36170(this.f24376, this.f24372);
        this.f24376++;
        this.f24374 = true;
        return objMo36170;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f24374) {
            throw new IllegalStateException();
        }
        int i = this.f24376 - 1;
        this.f24376 = i;
        this.f24375--;
        this.f24374 = false;
        this.f24373.mo36173(i);
    }
}
