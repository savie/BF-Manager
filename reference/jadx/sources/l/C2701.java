package l;

/* JADX INFO: renamed from: l.ۖ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K6W6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2701 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final double f8578 = Math.sqrt(0.85d);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f8579;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f8580;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f8581;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f8582;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f8583;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f8584;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f8585;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8868(float f, float f2) {
        this.f8584 += f;
        this.f8580 += f2;
        this.f8579 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8867(float f) {
        float fMax = Math.max(f * 60.0f, 0.001f);
        if (this.f8579) {
            this.f8585 = this.f8584 / fMax;
            this.f8583 = this.f8580 / fMax;
            this.f8580 = 0.0f;
            this.f8584 = 0.0f;
            this.f8579 = false;
            this.f8581 = 0.0f;
            this.f8582 = 0.0f;
            return;
        }
        double d = f8578;
        double dPow = Math.pow(d, fMax);
        float f2 = (float) (((1.0d - dPow) * d) / (1.0d - d));
        float f3 = this.f8585;
        this.f8582 = f3 * f2;
        float f4 = this.f8583;
        this.f8581 = f2 * f4;
        this.f8585 = (float) (((double) f3) * dPow);
        this.f8583 = (float) (((double) f4) * dPow);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8869() {
        return this.f8579 || Math.hypot((double) this.f8585, (double) this.f8583) >= 0.004999999888241291d;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8870() {
        this.f8579 = false;
        this.f8581 = 0.0f;
        this.f8582 = 0.0f;
        this.f8583 = 0.0f;
        this.f8585 = 0.0f;
        this.f8580 = 0.0f;
        this.f8584 = 0.0f;
    }
}
