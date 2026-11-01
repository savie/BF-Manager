package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5VI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1906 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9669 f7185;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f7186;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f7187;

    public C1906(C9669 c9669) {
        this.f7185 = c9669;
        long j = c9669.f37607;
        this.f7186 = j == 0 ? 0 : (int) (c9669.f37609 / j);
        this.f7187 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7187 < this.f7186;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f7187;
        this.f7187 = i + 1;
        return this.f7185.m24573(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
