package l;

/* JADX INFO: renamed from: l.ܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: YAYY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17336 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C17336 f55151;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f55152;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f55153;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float[] f55154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f55155;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f55156;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f55157;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f55158;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float f55159;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f55160;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f55161;

    static {
        float fM14820 = (float) ((((double) C5341.m14820()) * 63.66197723675813d) / 100.0d);
        float[] fArr = C5341.f18446;
        float f = fArr[0];
        float[][] fArr2 = C5341.f18444;
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM14820) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f10 = 1.0f / ((5.0f * fM14820) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(((double) fM14820) * 5.0d))) + (f11 * fM14820);
        float fM14821 = C5341.m14820() / fArr[1];
        double d2 = fM14821;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f55151 = new C17336(fM14821, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f9, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m40310() {
        return this.f55155;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m40311() {
        return this.f55156;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m40316() {
        return this.f55161;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float m40314() {
        return this.f55159;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m40315() {
        return this.f55160;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float m40307() {
        return this.f55152;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float[] m40309() {
        return this.f55154;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m40313() {
        return this.f55158;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m40308() {
        return this.f55153;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m40312() {
        return this.f55157;
    }

    public C17336(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f55156 = f;
        this.f55155 = f2;
        this.f55161 = f3;
        this.f55159 = f4;
        this.f55160 = f5;
        this.f55152 = f6;
        this.f55154 = fArr;
        this.f55158 = f7;
        this.f55153 = f8;
        this.f55157 = f9;
    }
}
