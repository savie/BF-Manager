package l;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.ۡۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9315 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f30266;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f30267;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f30268;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f30269;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f30270;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f30274;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f30275;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f30276;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f30277;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30278;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f30279;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f30280;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static float f30263 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final float[] f30265 = new float[101];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final float[] f30264 = new float[101];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f30271 = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f30273 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f30272 = true;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i = 0;
        while (true) {
            float f13 = 1.0f;
            if (i < 100) {
                float f14 = i / 100.0f;
                float f15 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f15 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = f13 - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f16 = (((f2 * 0.35000002f) + (f4 * 0.175f)) * f5) + f6;
                    if (Math.abs(f16 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f16 > f14) {
                        f15 = f2;
                    } else {
                        f11 = f2;
                    }
                    f13 = 1.0f;
                }
                f30265[i] = (((f4 * 0.5f) + f2) * f5) + f6;
                float f17 = 1.0f;
                while (true) {
                    f7 = ((f17 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f18 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f18 > f14) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                    f = 2.0f;
                    f3 = 3.0f;
                }
                f30264[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
                i++;
            } else {
                float[] fArr = f30265;
                f30264[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public C9315(Context context) {
        this.f30266 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24547(float f) {
        long j = this.f30274;
        this.f30277 = j + ((long) Math.round(f * (this.f30276 - j)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24540(long j, long j2, long j3) {
        float fAbs = Math.abs((j3 - j) / (j2 - j));
        int i = (int) (fAbs * 100.0f);
        if (i < 100) {
            float f = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = f30264;
            float f2 = fArr[i];
            this.f30278 = (int) (this.f30278 * C19967.m45884(fArr[i2], f2, (fAbs - f) / ((i2 / 100.0f) - f), f2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24548(long j, long j2) {
        this.f30272 = false;
        this.f30274 = j;
        this.f30277 = j;
        this.f30276 = j + j2;
        this.f30275 = AnimationUtils.currentAnimationTimeMillis();
        this.f30278 = 250;
        this.f30269 = 0.0f;
        this.f30279 = 0L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24552() {
        this.f30277 = this.f30276;
        this.f30272 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m24544(long j, long j2) {
        this.f30272 = false;
        this.f30273 = 1;
        this.f30274 = j;
        this.f30277 = j;
        this.f30276 = j2;
        long j3 = j - j2;
        this.f30269 = j3 > 0 ? -2000.0f : 2000.0f;
        this.f30279 = -j3;
        this.f30268 = Math.abs(j3);
        this.f30278 = (int) (Math.sqrt((j3 * (-2.0d)) / ((double) this.f30269)) * 1000.0d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24549(long j, long j2, long j3, long j4, long j5) {
        double dExp;
        long j6 = j4;
        this.f30268 = j5;
        this.f30272 = false;
        this.f30279 = j2;
        float f = j2;
        this.f30267 = f;
        this.f30280 = 0;
        this.f30278 = 0;
        this.f30275 = AnimationUtils.currentAnimationTimeMillis();
        this.f30274 = j;
        this.f30277 = j;
        float f2 = f30263;
        float f3 = this.f30266;
        float f4 = this.f30271;
        if (j <= j6 && j >= j3) {
            this.f30273 = 0;
            if (j2 != 0) {
                int iExp = (int) (Math.exp(Math.log((Math.abs(j2) * 0.35f) / (f4 * f3)) / (((double) f2) - 1.0d)) * 1000.0d);
                this.f30280 = iExp;
                this.f30278 = iExp;
                float f5 = f4 * f3;
                double d = f2;
                dExp = Math.exp((d / (d - 1.0d)) * Math.log((Math.abs(j2) * 0.35f) / f5)) * ((double) f5);
            } else {
                dExp = 0.0d;
            }
            long jSignum = (int) (dExp * ((double) Math.signum(f)));
            this.f30270 = jSignum;
            long j7 = jSignum + j;
            this.f30276 = j7;
            if (j7 < j3) {
                m24540(this.f30274, j7, j3);
                this.f30276 = j3;
            }
            long j8 = this.f30276;
            if (j8 > j4) {
                m24540(this.f30274, j8, j4);
                this.f30276 = j4;
                return;
            }
            return;
        }
        if (j > j3 && j < j6) {
            this.f30272 = true;
            return;
        }
        boolean z = j > j6;
        long j9 = z ? j6 : j3;
        long j10 = j - j9;
        if (j10 * j2 < 0) {
            float f6 = f4 * f3;
            double d2 = f2;
            if (Math.exp((d2 / (d2 - 1.0d)) * Math.log((Math.abs(j2) * 0.35f) / f6)) * ((double) f6) > Math.abs(j10)) {
                long j11 = z ? j3 : j;
                if (z) {
                    j6 = j;
                }
                m24549(j, j2, j11, j6, this.f30268);
                return;
            }
            m24544(j, j9);
            return;
        }
        if (j2 != 0) {
            j10 = j2;
        }
        float f7 = j10 > 0 ? -2000.0f : 2000.0f;
        this.f30269 = f7;
        float f8 = (-j2) / f7;
        float fSqrt = (float) Math.sqrt((((double) ((((f * f) / 2.0f) / Math.abs(f7)) + Math.abs(j9 - j))) * 2.0d) / ((double) Math.abs(this.f30269)));
        this.f30275 -= (long) ((int) ((fSqrt - f8) * 1000.0f));
        this.f30274 = j9;
        this.f30277 = j9;
        this.f30279 = (int) ((-this.f30269) * fSqrt);
        m24545();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m24545() {
        long j = this.f30279;
        float f = j * j;
        float fAbs = f / (Math.abs(this.f30269) * 2.0f);
        float fSignum = Math.signum(this.f30279);
        long j2 = this.f30268;
        if (fAbs > j2) {
            this.f30269 = ((-fSignum) * f) / (j2 * 2.0f);
            fAbs = j2;
        }
        this.f30268 = (int) fAbs;
        this.f30273 = 2;
        long j3 = this.f30274;
        long j4 = this.f30279;
        if (j4 <= 0) {
            fAbs = -fAbs;
        }
        this.f30276 = j3 + ((long) ((int) fAbs));
        this.f30278 = -((int) ((j4 * 1000.0f) / this.f30269));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24550() {
        int i = this.f30273;
        if (i == 0) {
            int i2 = this.f30278;
            if (i2 >= this.f30280) {
                return false;
            }
            long j = this.f30276;
            this.f30274 = j;
            this.f30277 = j;
            long j2 = (int) this.f30267;
            this.f30279 = j2;
            this.f30269 = j2 > 0 ? -2000.0f : 2000.0f;
            this.f30275 += (long) i2;
            m24545();
        } else {
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                this.f30275 += (long) this.f30278;
                m24544(this.f30276, this.f30274);
            }
        }
        m24551();
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m24551() {
        float fM45884;
        float f;
        double d;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f30275;
        if (jCurrentAnimationTimeMillis == 0) {
            return this.f30278 > 0;
        }
        int i = this.f30278;
        if (jCurrentAnimationTimeMillis > i) {
            return false;
        }
        int i2 = this.f30273;
        if (i2 == 0) {
            float f2 = this.f30280;
            float f3 = jCurrentAnimationTimeMillis / f2;
            int i3 = (int) (f3 * 100.0f);
            if (i3 < 100) {
                float f4 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = f30265;
                float f5 = fArr[i3];
                f = (fArr[i4] - f5) / ((i4 / 100.0f) - f4);
                fM45884 = C19967.m45884(f3, f4, f, f5);
            } else {
                fM45884 = 1.0f;
                f = 0.0f;
            }
            float f6 = this.f30270;
            this.f30267 = ((f * f6) / f2) * 1000.0f;
            d = fM45884 * f6;
        } else if (i2 == 1) {
            float f7 = jCurrentAnimationTimeMillis / i;
            float f8 = f7 * f7;
            float fSignum = Math.signum(this.f30279) * this.f30268;
            this.f30267 = ((-f7) + f8) * fSignum * 6.0f;
            d = ((3.0f * f8) - ((2.0f * f7) * f8)) * fSignum;
        } else if (i2 != 2) {
            d = 0.0d;
        } else {
            float f9 = jCurrentAnimationTimeMillis / 1000.0f;
            float f10 = this.f30279;
            float f11 = this.f30269 * f9;
            this.f30267 = f11 + f10;
            d = ((f11 * f9) / 2.0f) + (f10 * f9);
        }
        this.f30277 = this.f30274 + ((long) ((int) Math.round(d)));
        return true;
    }
}
