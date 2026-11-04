package l;

import android.graphics.Color;

/* JADX INFO: renamed from: l.ۧ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: HB1L */
/* JADX INFO: loaded from: classes3.dex */
public final class C11455 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f35979;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f35980;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f35981;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float f35982;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f35983;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f35984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m28816() {
        return this.f35984;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m28814() {
        return this.f35980;
    }

    public C11455(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f35984 = f;
        this.f35980 = f2;
        this.f35982 = f3;
        this.f35981 = f4;
        this.f35979 = f5;
        this.f35983 = f6;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Code duplicated, block: B:38:0x0134  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m28813(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        C8472 c8472 = C8472.f27749;
        float f8 = f2;
        if (f8 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return C24882.m55413(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f9 = f8;
        C11455 c11455 = null;
        float f10 = 0.0f;
        boolean z = true;
        while (Math.abs(f10 - f8) >= 0.4f) {
            float f11 = 100.0f;
            float f12 = 1000.0f;
            float f13 = 1000.0f;
            float f14 = 0.0f;
            float f15 = 100.0f;
            C11455 c11456 = null;
            while (true) {
                if (Math.abs(f14 - f15) <= 0.01f) {
                    f4 = fMin;
                    f5 = f9;
                    break;
                }
                float f16 = ((f15 - f14) / 2.0f) + f14;
                int iM28815 = m28811(f16, f9, fMin).m28815(C8472.f27749);
                float fM55412 = C24882.m55412(Color.red(iM28815));
                float fM55413 = C24882.m55412(Color.green(iM28815));
                float fM55414 = C24882.m55412(Color.blue(iM28815));
                float[] fArr = C24882.f80516[1];
                float f17 = ((fM55414 * fArr[2]) + ((fM55413 * fArr[1]) + (fM55412 * fArr[0]))) / f11;
                float fCbrt = f17 <= 0.008856452f ? f17 * 903.2963f : (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                float fAbs = Math.abs(f3 - fCbrt);
                if (fAbs < 0.2f) {
                    C11455 c11455M28812 = m28812(iM28815);
                    f5 = f9;
                    C11455 c11455M28811 = m28811(c11455M28812.f35982, c11455M28812.f35980, fMin);
                    f4 = fMin;
                    float f18 = c11455M28812.f35981 - c11455M28811.f35981;
                    float f19 = c11455M28812.f35979 - c11455M28811.f35979;
                    float f20 = c11455M28812.f35983 - c11455M28811.f35983;
                    double dSqrt = Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18));
                    f6 = f14;
                    f7 = f15;
                    float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                    if (fPow <= 1.0f) {
                        f13 = fPow;
                        c11456 = c11455M28812;
                        f12 = fAbs;
                    }
                    if (f12 != 0.0f && f13 == 0.0f) {
                        break;
                    }
                    if (fCbrt < f3) {
                        f14 = f16;
                        f15 = f7;
                    } else {
                        f14 = f6;
                        f15 = f16;
                    }
                    f11 = 100.0f;
                    f9 = f5;
                    fMin = f4;
                } else {
                    f4 = fMin;
                    f5 = f9;
                    f6 = f14;
                    f7 = f15;
                }
                f12 = f12;
                f13 = f13;
                if (f12 != 0.0f) {
                }
                if (fCbrt < f3) {
                    f14 = f16;
                    f15 = f7;
                } else {
                    f14 = f6;
                    f15 = f16;
                }
                f11 = 100.0f;
                f9 = f5;
                fMin = f4;
            }
            if (!z) {
                if (c11456 == null) {
                    f8 = f5;
                } else {
                    c11455 = c11456;
                    f10 = f5;
                }
                f9 = ((f8 - f10) / 2.0f) + f10;
            } else {
                if (c11456 != null) {
                    return c11456.m28815(c8472);
                }
                f9 = ((f8 - f10) / 2.0f) + f10;
                z = false;
            }
            fMin = f4;
        }
        if (c11455 == null) {
            return C24882.m55413(f3);
        }
        return c11455.m28815(c8472);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11455 m28812(int i) {
        C8472 c8472 = C8472.f27749;
        float fM55412 = C24882.m55412(Color.red(i));
        float fM55413 = C24882.m55412(Color.green(i));
        float fM55414 = C24882.m55412(Color.blue(i));
        float[][] fArr = C24882.f80516;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM55414) + (fArr2[1] * fM55413) + (fArr2[0] * fM55412);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM55414) + (fArr3[1] * fM55413) + (fArr3[0] * fM55412);
        float[] fArr4 = fArr[2];
        float f3 = (fM55414 * fArr4[2]) + (fM55413 * fArr4[1]) + (fM55412 * fArr4[0]);
        float[][] fArr5 = C24882.f80517;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float f7 = c8472.m22781()[0] * f4;
        float f8 = c8472.m22781()[1] * f5;
        float f9 = c8472.m22781()[2] * f6;
        float fPow = (float) Math.pow(((double) (Math.abs(f7) * c8472.m22784())) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f8) * c8472.m22784())) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f9) * c8472.m22784())) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f10 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f11 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f12 = fSignum2 * 20.0f;
        float f13 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f12)) / 20.0f;
        float f14 = (((fSignum * 40.0f) + f12) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f11, f10)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f15 = fAtan2;
        float f16 = (3.1415927f * f15) / 180.0f;
        float fPow4 = ((float) Math.pow((f14 * c8472.m22787()) / c8472.m22782(), c8472.m22789() * c8472.m22785())) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c8472.m22788()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f15) < 20.14d ? 360.0f + f15 : f15)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c8472.m22786()) * c8472.m22783()) * ((float) Math.sqrt((f11 * f11) + (f10 * f10)))) / (f13 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fM22790 = c8472.m22790() * fSqrt;
        Math.sqrt((fPow5 * c8472.m22789()) / (c8472.m22782() + 4.0f));
        float f17 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((fM22790 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f16;
        return new C11455(f15, fSqrt, fPow4, f17, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11455 m28811(float f, float f2, float f3) {
        C8472 c8472 = C8472.f27749;
        c8472.m22789();
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float fM22790 = c8472.m22790() * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * c8472.m22789()) / (c8472.m22782() + 4.0f));
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fM22790) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C11455(f3, f2, f, f4, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28815(C8472 c8472) {
        float fSqrt;
        float f = this.f35980;
        double d = f;
        float f2 = this.f35982;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, c8472.m22788()), 0.73d), 1.1111111111111112d);
        double d3 = (this.f35984 * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fM22782 = c8472.m22782() * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) c8472.m22789())) / ((double) c8472.m22785())));
        float fM22786 = fCos * 3846.1538f * c8472.m22786() * c8472.m22783();
        float fM22787 = fM22782 / c8472.m22787();
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f3 = (((0.305f + fM22787) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (fM22786 * 23.0f)));
        float f4 = fCos2 * f3;
        float f5 = f3 * fSin;
        float f6 = fM22787 * 460.0f;
        float f7 = ((288.0f * f5) + ((451.0f * f4) + f6)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        float fM22784 = (100.0f / c8472.m22784()) * Math.signum(f7) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fM22785 = (100.0f / c8472.m22784()) * Math.signum(f8) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8)))), 2.380952380952381d));
        float fM22788 = (100.0f / c8472.m22784()) * Math.signum(f9) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9)))), 2.380952380952381d));
        float f10 = fM22784 / c8472.m22781()[0];
        float f11 = fM22785 / c8472.m22781()[1];
        float f12 = fM22788 / c8472.m22781()[2];
        float[][] fArr = C24882.f80514;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * f12) + (fArr2[1] * f11) + (fArr2[0] * f10);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * f12) + (fArr3[1] * f11) + (fArr3[0] * f10);
        float[] fArr4 = fArr[2];
        return C19988.m45956(f13, f14, (f12 * fArr4[2]) + (f11 * fArr4[1]) + (f10 * fArr4[0]));
    }
}
