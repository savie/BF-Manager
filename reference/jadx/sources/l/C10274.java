package l;

/* JADX INFO: renamed from: l.ۤۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBH2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10274 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f35016;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f35017;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f35018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6143 f35019;

    public C10274(int i, int i2, int i3, C6143 c6143) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endPc < startPc");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("handlerPc < 0");
        }
        this.f35016 = i;
        this.f35017 = i2;
        this.f35018 = i3;
        this.f35019 = c6143;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m26059() {
        return this.f35016;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26060() {
        return this.f35017;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m26062() {
        return this.f35018;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6143 m26063() {
        C6143 c6143 = this.f35019;
        return c6143 != null ? c6143 : C6143.f20966;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26061(int i) {
        return i >= this.f35016 && i < this.f35017;
    }
}
