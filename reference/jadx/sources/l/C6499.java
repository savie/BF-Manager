package l;

/* JADX INFO: renamed from: l.ۛܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6499 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double f21825;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f21826;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f21827;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double f21828;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final double f21829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f21830;

    public C6499(int i, int i2, double d, double d2, double d3, float f) {
        this.f21830 = i;
        this.f21826 = i2;
        this.f21828 = d;
        this.f21825 = d2;
        this.f21829 = d3;
        this.f21827 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18351() {
        int i;
        int i2 = this.f21830;
        if (i2 <= 0 || (i = this.f21826) <= 0) {
            return false;
        }
        double d = this.f21828;
        if (d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) {
            return false;
        }
        double d2 = this.f21825 * ((double) i2) * 8.0d * 2.0d;
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return false;
        }
        double d3 = this.f21829 * ((double) i) * 8.0d * 2.0d;
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            return false;
        }
        float f = this.f21827;
        return f >= -180.0f && f < 180.0f;
    }
}
