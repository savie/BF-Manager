package l;

/* JADX INFO: renamed from: l.ۗܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I5VL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3579 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12256;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f12257;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f12258;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f12259;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f12260;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f12261;

    public C3579(float f, float f2, float f3, float f4, int i, float f5) {
        this.f12259 = f;
        this.f12258 = f2;
        this.f12257 = f3;
        this.f12261 = f4;
        int i2 = f <= ((float) i) / 2.0f ? -1 : 1;
        if (i2 < 0 && f3 > f5) {
            this.f12256 = 1;
        } else if (i2 > 0 && f3 < (-f5)) {
            this.f12256 = -1;
        } else {
            this.f12256 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11632(int i, float f, int i2) {
        if (this.f12260) {
            return true;
        }
        this.f12257 = (this.f12256 * i * 6.0f * f) + this.f12257;
        float fExp = (float) Math.exp((-3.5f) * f);
        float f2 = this.f12257 * fExp;
        this.f12257 = f2;
        float f3 = this.f12261 * fExp;
        this.f12261 = f3;
        float f4 = (f2 * f) + this.f12259;
        this.f12259 = f4;
        float f5 = (f3 * f) + this.f12258;
        this.f12258 = f5;
        if (f4 <= 0.0f || f4 >= i) {
            this.f12259 = f4 <= 0.0f ? 0.0f : i;
            this.f12257 = 0.0f;
            this.f12261 = 0.0f;
            this.f12260 = true;
        }
        if (f5 <= 0.0f) {
            this.f12258 = 0.0f;
            this.f12261 = 0.0f;
        } else {
            float f6 = i2;
            if (f5 >= f6) {
                this.f12258 = f6;
                this.f12261 = 0.0f;
            }
        }
        return this.f12260;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11631(int i) {
        this.f12259 = this.f12256 < 0 ? 0.0f : i;
        this.f12257 = 0.0f;
        this.f12261 = 0.0f;
        this.f12260 = true;
    }
}
