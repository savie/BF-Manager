package l;

/* JADX INFO: renamed from: l.ܺۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I5VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15780 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f51099;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f51100;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f51101;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f51102;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f51103;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f51104;

    public C15780(float f, float f2, float f3, float f4, int i, float f5) {
        this.f51101 = f;
        this.f51104 = f2;
        this.f51102 = f3;
        this.f51099 = f4;
        int i2 = f <= ((float) i) / 2.0f ? -1 : 1;
        if (i2 < 0 && f3 > f5) {
            this.f51100 = 1;
        } else if (i2 > 0 && f3 < (-f5)) {
            this.f51100 = -1;
        } else {
            this.f51100 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37520(int i, float f, int i2) {
        if (this.f51103) {
            return true;
        }
        this.f51102 = (this.f51100 * i * 6.0f * f) + this.f51102;
        float fExp = (float) Math.exp((-3.5f) * f);
        float f2 = this.f51102 * fExp;
        this.f51102 = f2;
        float f3 = this.f51099 * fExp;
        this.f51099 = f3;
        float f4 = (f2 * f) + this.f51101;
        this.f51101 = f4;
        float f5 = (f3 * f) + this.f51104;
        this.f51104 = f5;
        if (f4 <= 0.0f || f4 >= i) {
            this.f51101 = f4 <= 0.0f ? 0.0f : i;
            this.f51102 = 0.0f;
            this.f51099 = 0.0f;
            this.f51103 = true;
        }
        if (f5 <= 0.0f) {
            this.f51104 = 0.0f;
            this.f51099 = 0.0f;
        } else {
            float f6 = i2;
            if (f5 >= f6) {
                this.f51104 = f6;
                this.f51099 = 0.0f;
            }
        }
        return this.f51103;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37519(int i) {
        this.f51101 = this.f51100 < 0 ? 0.0f : i;
        this.f51102 = 0.0f;
        this.f51099 = 0.0f;
        this.f51103 = true;
    }
}
