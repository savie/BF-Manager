package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5VI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0538 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f2253;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7996 f2254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2255;

    public C0538(C7996 c7996) {
        this.f2254 = c7996;
        long j = c7996.f48050;
        this.f2253 = j == 0 ? 0 : (int) (c7996.f48052 / j);
        this.f2255 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2255 < this.f2253;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2255;
        this.f2255 = i + 1;
        return this.f2254.m21802(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
