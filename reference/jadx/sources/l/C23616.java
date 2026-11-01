package l;

/* JADX INFO: renamed from: l.᩻ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MI */
/* JADX INFO: loaded from: classes.dex */
public final class C23616 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f76519;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double f76520;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final double f76521;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f76522;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double f76523;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f76524;

    public C23616(int i, int i2, double d, double d2, double d3, float f) {
        this.f76519 = i;
        this.f76522 = i2;
        this.f76521 = d;
        this.f76520 = d2;
        this.f76523 = d3;
        this.f76524 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52087() {
        int i;
        int i2 = this.f76519;
        if (i2 <= 0 || (i = this.f76522) <= 0) {
            return false;
        }
        double d = this.f76521;
        if (d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) {
            return false;
        }
        double d2 = this.f76520 * ((double) i2) * 8.0d * 2.0d;
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return false;
        }
        double d3 = this.f76523 * ((double) i) * 8.0d * 2.0d;
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            return false;
        }
        float f = this.f76524;
        return f >= -180.0f && f < 180.0f;
    }
}
