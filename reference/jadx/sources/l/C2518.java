package l;

import android.graphics.Color;

/* JADX INFO: renamed from: l.ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HB1L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2518 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f9995;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f9996;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f9997;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f9998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f9999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f10000;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m7816() {
        return this.f9995;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m7814() {
        return this.f9998;
    }

    public C2518(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f9995 = f;
        this.f9998 = f2;
        this.f9997 = f3;
        this.f10000 = f4;
        this.f9996 = f5;
        this.f9999 = f6;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Code duplicated, block: B:38:0x0134  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m7813(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        C17336 c17336 = C17336.f55151;
        float f8 = f2;
        if (f8 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return C5341.m14822(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f9 = f8;
        C2518 c2518 = null;
        float f10 = 0.0f;
        boolean z = true;
        while (Math.abs(f10 - f8) >= 0.4f) {
            float f11 = 100.0f;
            float f12 = 1000.0f;
            float f13 = 1000.0f;
            float f14 = 0.0f;
            float f15 = 100.0f;
            C2518 c2519 = null;
            while (true) {
                if (Math.abs(f14 - f15) <= 0.01f) {
                    f4 = fMin;
                    f5 = f9;
                    break;
                }
                float f16 = ((f15 - f14) / 2.0f) + f14;
                int iM7815 = m7811(f16, f9, fMin).m7815(C17336.f55151);
                float fM14821 = C5341.m14821(Color.red(iM7815));
                float fM14822 = C5341.m14821(Color.green(iM7815));
                float fM14823 = C5341.m14821(Color.blue(iM7815));
                float[] fArr = C5341.f18447[1];
                float f17 = ((fM14823 * fArr[2]) + ((fM14822 * fArr[1]) + (fM14821 * fArr[0]))) / f11;
                float fCbrt = f17 <= 0.008856452f ? f17 * 903.2963f : (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                float fAbs = Math.abs(f3 - fCbrt);
                if (fAbs < 0.2f) {
                    C2518 c2518M7812 = m7812(iM7815);
                    f5 = f9;
                    C2518 c2518M7811 = m7811(c2518M7812.f9997, c2518M7812.f9998, fMin);
                    f4 = fMin;
                    float f18 = c2518M7812.f10000 - c2518M7811.f10000;
                    float f19 = c2518M7812.f9996 - c2518M7811.f9996;
                    float f20 = c2518M7812.f9999 - c2518M7811.f9999;
                    double dSqrt = Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18));
                    f6 = f14;
                    f7 = f15;
                    float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                    if (fPow <= 1.0f) {
                        f13 = fPow;
                        c2519 = c2518M7812;
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
                if (c2519 == null) {
                    f8 = f5;
                } else {
                    c2518 = c2519;
                    f10 = f5;
                }
                f9 = ((f8 - f10) / 2.0f) + f10;
            } else {
                if (c2519 != null) {
                    return c2519.m7815(c17336);
                }
                f9 = ((f8 - f10) / 2.0f) + f10;
                z = false;
            }
            fMin = f4;
        }
        if (c2518 == null) {
            return C5341.m14822(f3);
        }
        return c2518.m7815(c17336);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2518 m7812(int i) {
        C17336 c17336 = C17336.f55151;
        float fM14821 = C5341.m14821(Color.red(i));
        float fM14822 = C5341.m14821(Color.green(i));
        float fM14823 = C5341.m14821(Color.blue(i));
        float[][] fArr = C5341.f18447;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM14823) + (fArr2[1] * fM14822) + (fArr2[0] * fM14821);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM14823) + (fArr3[1] * fM14822) + (fArr3[0] * fM14821);
        float[] fArr4 = fArr[2];
        float f3 = (fM14823 * fArr4[2]) + (fM14822 * fArr4[1]) + (fM14821 * fArr4[0]);
        float[][] fArr5 = C5341.f18444;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float f7 = c17336.m40309()[0] * f4;
        float f8 = c17336.m40309()[1] * f5;
        float f9 = c17336.m40309()[2] * f6;
        float fPow = (float) Math.pow(((double) (Math.abs(f7) * c17336.m40313())) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f8) * c17336.m40313())) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f9) * c17336.m40313())) / 100.0d, 0.42d);
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
        float fPow4 = ((float) Math.pow((f14 * c17336.m40316()) / c17336.m40310(), c17336.m40315() * c17336.m40312())) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c17336.m40311()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f15) < 20.14d ? 360.0f + f15 : f15)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c17336.m40307()) * c17336.m40314()) * ((float) Math.sqrt((f11 * f11) + (f10 * f10)))) / (f13 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fM40308 = c17336.m40308() * fSqrt;
        Math.sqrt((fPow5 * c17336.m40315()) / (c17336.m40310() + 4.0f));
        float f17 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((fM40308 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f16;
        return new C2518(f15, fSqrt, fPow4, f17, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2518 m7811(float f, float f2, float f3) {
        C17336 c17336 = C17336.f55151;
        c17336.m40315();
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float fM40308 = c17336.m40308() * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * c17336.m40315()) / (c17336.m40310() + 4.0f));
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fM40308) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C2518(f3, f2, f, f4, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7815(C17336 c17336) {
        float fSqrt;
        float f = this.f9998;
        double d = f;
        float f2 = this.f9997;
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
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, c17336.m40311()), 0.73d), 1.1111111111111112d);
        double d3 = (this.f9995 * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fM40310 = c17336.m40310() * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) c17336.m40315())) / ((double) c17336.m40312())));
        float fM40307 = fCos * 3846.1538f * c17336.m40307() * c17336.m40314();
        float fM40316 = fM40310 / c17336.m40316();
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f3 = (((0.305f + fM40316) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (fM40307 * 23.0f)));
        float f4 = fCos2 * f3;
        float f5 = f3 * fSin;
        float f6 = fM40316 * 460.0f;
        float f7 = ((288.0f * f5) + ((451.0f * f4) + f6)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        float fM40313 = (100.0f / c17336.m40313()) * Math.signum(f7) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fM40314 = (100.0f / c17336.m40313()) * Math.signum(f8) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8)))), 2.380952380952381d));
        float fM40315 = (100.0f / c17336.m40313()) * Math.signum(f9) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9)))), 2.380952380952381d));
        float f10 = fM40313 / c17336.m40309()[0];
        float f11 = fM40314 / c17336.m40309()[1];
        float f12 = fM40315 / c17336.m40309()[2];
        float[][] fArr = C5341.f18445;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * f12) + (fArr2[1] * f11) + (fArr2[0] * f10);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * f12) + (fArr3[1] * f11) + (fArr3[0] * f10);
        float[] fArr4 = fArr[2];
        return C3224.m9660(f13, f14, (f12 * fArr4[2]) + (f11 * fArr4[1]) + (f10 * fArr4[0]));
    }
}
