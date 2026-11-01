package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04TC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14759 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f48271;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9820 f48273;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48272 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2057 f48274 = new C2057();

    @Override // java.util.Iterator
    public final void remove() {
    }

    public C14759(C9820 c9820) {
        this.f48273 = c9820;
        this.f48271 = c9820.m24921();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48272 < this.f48271;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C9820 c9820 = this.f48273;
        int i = c9820.f33567[this.f48272];
        C2057 c2057 = this.f48274;
        c2057.f7635 = i;
        int[] iArr = c9820.f33566;
        int i2 = this.f48272;
        c2057.f7636 = iArr[i2];
        this.f48272 = i2 + 1;
        return c2057;
    }
}
