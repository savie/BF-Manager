package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04TC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3304 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12253 f10805;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f10807;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10806 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20458 f10808 = new C20458();

    @Override // java.util.Iterator
    public final void remove() {
    }

    public C3304(C12253 c12253) {
        this.f10805 = c12253;
        this.f10807 = c12253.m30631();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10806 < this.f10807;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C12253 c12253 = this.f10805;
        int i = c12253.f39415[this.f10806];
        C20458 c20458 = this.f10808;
        c20458.f65550 = i;
        int[] iArr = c12253.f39414;
        int i2 = this.f10806;
        c20458.f65551 = iArr[i2];
        this.f10806 = i2 + 1;
        return c20458;
    }
}
