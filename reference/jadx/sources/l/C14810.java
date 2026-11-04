package l;

/* JADX INFO: renamed from: l.ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E1AS */
/* JADX INFO: loaded from: classes5.dex */
public final class C14810 extends AbstractInterpolatorC0400 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f48432;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48433 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f48434;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f48435;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f48436;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f48437;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f48438;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f48439;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f48440;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f48441;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f48442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f48443;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f48444;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m35660(float f) {
        float f2;
        float f3;
        float f4 = this.f48443;
        if (f <= f4) {
            f2 = this.f48438;
            f3 = this.f48432;
        } else {
            int i = this.f48435;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f48437;
            if (f >= f4) {
                if (i == 2) {
                    return this.f48434;
                }
                float f5 = f - f4;
                float f6 = this.f48436;
                if (f5 < f6) {
                    float f7 = this.f48439;
                    return f7 - ((f5 * f7) / f6);
                }
                return this.f48444;
            }
            f2 = this.f48432;
            f3 = this.f48439;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f48443;
        if (f <= f3) {
            float f4 = this.f48438;
            f2 = ((((this.f48432 - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f48435;
            if (i == 1) {
                f2 = this.f48441;
            } else {
                float f5 = f - f3;
                float f6 = this.f48437;
                if (f5 < f6) {
                    float f7 = this.f48441;
                    float f8 = this.f48432;
                    f2 = ((((this.f48439 - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f48434;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f48436;
                    if (f9 < f10) {
                        float f11 = this.f48434;
                        float f12 = this.f48439 * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f48444;
                    }
                }
            }
        }
        this.f48442 = f;
        return this.f48433 ? this.f48440 - f2 : this.f48440 + f2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35661(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f48440 = f;
        boolean z = f > f2;
        this.f48433 = z;
        if (z) {
            m35659(-f3, f - f2, f5, f6, f4);
        } else {
            m35659(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // l.AbstractInterpolatorC0400
    /* JADX INFO: renamed from: ۙ */
    public final float mo2206() {
        return this.f48433 ? -m35660(this.f48442) : m35660(this.f48442);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35659(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f48438 = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f48435 = 2;
                this.f48438 = f;
                this.f48432 = fSqrt;
                this.f48439 = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f48443 = f8;
                this.f48437 = fSqrt / f3;
                this.f48441 = ((f + fSqrt) * f8) / 2.0f;
                this.f48434 = f2;
                this.f48444 = f2;
                return;
            }
            this.f48435 = 3;
            this.f48438 = f;
            this.f48432 = f4;
            this.f48439 = f4;
            float f9 = (f4 - f) / f3;
            this.f48443 = f9;
            float f10 = f4 / f3;
            this.f48436 = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f48437 = ((f2 - f11) - f12) / f4;
            this.f48441 = f11;
            this.f48434 = f2 - f12;
            this.f48444 = f2;
            return;
        }
        if (f7 >= f2) {
            this.f48435 = 1;
            this.f48438 = f;
            this.f48432 = 0.0f;
            this.f48441 = f2;
            this.f48443 = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f48435 = 2;
            this.f48438 = f;
            this.f48432 = f;
            this.f48439 = 0.0f;
            this.f48441 = f13;
            this.f48434 = f2;
            this.f48443 = f14;
            this.f48437 = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.f48443 = f15;
        float f16 = fSqrt2 / f3;
        this.f48437 = f16;
        if (fSqrt2 < f4) {
            this.f48435 = 2;
            this.f48438 = f;
            this.f48432 = fSqrt2;
            this.f48439 = 0.0f;
            this.f48443 = f15;
            this.f48437 = f16;
            this.f48441 = ((f + fSqrt2) * f15) / 2.0f;
            this.f48434 = f2;
            return;
        }
        this.f48435 = 3;
        this.f48438 = f;
        this.f48432 = f4;
        this.f48439 = f4;
        float f17 = (f4 - f) / f3;
        this.f48443 = f17;
        float f18 = f4 / f3;
        this.f48436 = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f48437 = ((f2 - f19) - f20) / f4;
        this.f48441 = f19;
        this.f48434 = f2 - f20;
        this.f48444 = f2;
    }
}
