package l;

/* JADX INFO: renamed from: l.ۙ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K6W6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4904 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final double f17192 = Math.sqrt(0.85d);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f17193;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f17194;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17195;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f17196;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f17197;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f17198;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f17199;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13631(float f, float f2) {
        this.f17198 += f;
        this.f17197 += f2;
        this.f17195 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13630(float f) {
        float fMax = Math.max(f * 60.0f, 0.001f);
        if (this.f17195) {
            this.f17194 = this.f17198 / fMax;
            this.f17196 = this.f17197 / fMax;
            this.f17197 = 0.0f;
            this.f17198 = 0.0f;
            this.f17195 = false;
            this.f17193 = 0.0f;
            this.f17199 = 0.0f;
            return;
        }
        double d = f17192;
        double dPow = Math.pow(d, fMax);
        float f2 = (float) (((1.0d - dPow) * d) / (1.0d - d));
        float f3 = this.f17194;
        this.f17199 = f3 * f2;
        float f4 = this.f17196;
        this.f17193 = f2 * f4;
        this.f17194 = (float) (((double) f3) * dPow);
        this.f17196 = (float) (((double) f4) * dPow);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13632() {
        return this.f17195 || Math.hypot((double) this.f17194, (double) this.f17196) >= 0.004999999888241291d;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13633() {
        this.f17195 = false;
        this.f17193 = 0.0f;
        this.f17199 = 0.0f;
        this.f17196 = 0.0f;
        this.f17194 = 0.0f;
        this.f17197 = 0.0f;
        this.f17198 = 0.0f;
    }
}
