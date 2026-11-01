package l;

/* JADX INFO: renamed from: l.ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E1AS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18954 extends AbstractInterpolatorC8767 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f61370;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f61371;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f61372;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61373 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f61374;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f61375;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f61376;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f61377;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f61378;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f61379;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f61380;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f61381;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f61382;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m43660(float f) {
        float f2;
        float f3;
        float f4 = this.f61371;
        if (f <= f4) {
            f2 = this.f61381;
            f3 = this.f61372;
        } else {
            int i = this.f61376;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f61370;
            if (f >= f4) {
                if (i == 2) {
                    return this.f61377;
                }
                float f5 = f - f4;
                float f6 = this.f61375;
                if (f5 < f6) {
                    float f7 = this.f61379;
                    return f7 - ((f5 * f7) / f6);
                }
                return this.f61382;
            }
            f2 = this.f61372;
            f3 = this.f61379;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f61371;
        if (f <= f3) {
            float f4 = this.f61381;
            f2 = ((((this.f61372 - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f61376;
            if (i == 1) {
                f2 = this.f61374;
            } else {
                float f5 = f - f3;
                float f6 = this.f61370;
                if (f5 < f6) {
                    float f7 = this.f61374;
                    float f8 = this.f61372;
                    f2 = ((((this.f61379 - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f61377;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f61375;
                    if (f9 < f10) {
                        float f11 = this.f61377;
                        float f12 = this.f61379 * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f61382;
                    }
                }
            }
        }
        this.f61378 = f;
        return this.f61373 ? this.f61380 - f2 : this.f61380 + f2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43661(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f61380 = f;
        boolean z = f > f2;
        this.f61373 = z;
        if (z) {
            m43659(-f3, f - f2, f5, f6, f4);
        } else {
            m43659(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // l.AbstractInterpolatorC8767
    /* JADX INFO: renamed from: ۙ */
    public final float mo22816() {
        return this.f61373 ? -m43660(this.f61378) : m43660(this.f61378);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43659(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f61381 = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f61376 = 2;
                this.f61381 = f;
                this.f61372 = fSqrt;
                this.f61379 = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f61371 = f8;
                this.f61370 = fSqrt / f3;
                this.f61374 = ((f + fSqrt) * f8) / 2.0f;
                this.f61377 = f2;
                this.f61382 = f2;
                return;
            }
            this.f61376 = 3;
            this.f61381 = f;
            this.f61372 = f4;
            this.f61379 = f4;
            float f9 = (f4 - f) / f3;
            this.f61371 = f9;
            float f10 = f4 / f3;
            this.f61375 = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f61370 = ((f2 - f11) - f12) / f4;
            this.f61374 = f11;
            this.f61377 = f2 - f12;
            this.f61382 = f2;
            return;
        }
        if (f7 >= f2) {
            this.f61376 = 1;
            this.f61381 = f;
            this.f61372 = 0.0f;
            this.f61374 = f2;
            this.f61371 = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f61376 = 2;
            this.f61381 = f;
            this.f61372 = f;
            this.f61379 = 0.0f;
            this.f61374 = f13;
            this.f61377 = f2;
            this.f61371 = f14;
            this.f61370 = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.f61371 = f15;
        float f16 = fSqrt2 / f3;
        this.f61370 = f16;
        if (fSqrt2 < f4) {
            this.f61376 = 2;
            this.f61381 = f;
            this.f61372 = fSqrt2;
            this.f61379 = 0.0f;
            this.f61371 = f15;
            this.f61370 = f16;
            this.f61374 = ((f + fSqrt2) * f15) / 2.0f;
            this.f61377 = f2;
            return;
        }
        this.f61376 = 3;
        this.f61381 = f;
        this.f61372 = f4;
        this.f61379 = f4;
        float f17 = (f4 - f) / f3;
        this.f61371 = f17;
        float f18 = f4 / f3;
        this.f61375 = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f61370 = ((f2 - f19) - f20) / f4;
        this.f61374 = f19;
        this.f61377 = f2 - f20;
        this.f61382 = f2;
    }
}
