package l;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.᩸ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21305 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f69316;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f69317;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f69318;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f69319;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f69320;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f69321;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f69322;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f69323;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f69324;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f69326;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f69327;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f69329;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static float f69312 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final float[] f69314 = new float[101];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final float[] f69313 = new float[101];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f69315 = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f69325 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f69328 = true;

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
                f69314[i] = (((f4 * 0.5f) + f2) * f5) + f6;
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
                f69313[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
                i++;
            } else {
                float[] fArr = f69314;
                f69313[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public C21305(Context context) {
        this.f69317 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47770(float f) {
        long j = this.f69324;
        this.f69323 = j + ((long) Math.round(f * (this.f69319 - j)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47765(long j, long j2, long j3) {
        float fAbs = Math.abs((j3 - j) / (j2 - j));
        int i = (int) (fAbs * 100.0f);
        if (i < 100) {
            float f = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = f69313;
            float f2 = fArr[i];
            this.f69316 = (int) (this.f69316 * C0280.m1792(fArr[i2], f2, (fAbs - f) / ((i2 / 100.0f) - f), f2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47771(long j, long j2) {
        this.f69328 = false;
        this.f69324 = j;
        this.f69323 = j;
        this.f69319 = j + j2;
        this.f69327 = AnimationUtils.currentAnimationTimeMillis();
        this.f69316 = 250;
        this.f69321 = 0.0f;
        this.f69326 = 0L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47775() {
        this.f69323 = this.f69319;
        this.f69328 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m47769(long j, long j2) {
        this.f69328 = false;
        this.f69325 = 1;
        this.f69324 = j;
        this.f69323 = j;
        this.f69319 = j2;
        long j3 = j - j2;
        this.f69321 = j3 > 0 ? -2000.0f : 2000.0f;
        this.f69326 = -j3;
        this.f69322 = Math.abs(j3);
        this.f69316 = (int) (Math.sqrt((j3 * (-2.0d)) / ((double) this.f69321)) * 1000.0d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47772(long j, long j2, long j3, long j4, long j5) {
        double dExp;
        long j6 = j4;
        this.f69322 = j5;
        this.f69328 = false;
        this.f69326 = j2;
        float f = j2;
        this.f69318 = f;
        this.f69329 = 0;
        this.f69316 = 0;
        this.f69327 = AnimationUtils.currentAnimationTimeMillis();
        this.f69324 = j;
        this.f69323 = j;
        float f2 = f69312;
        float f3 = this.f69317;
        float f4 = this.f69315;
        if (j <= j6 && j >= j3) {
            this.f69325 = 0;
            if (j2 != 0) {
                int iExp = (int) (Math.exp(Math.log((Math.abs(j2) * 0.35f) / (f4 * f3)) / (((double) f2) - 1.0d)) * 1000.0d);
                this.f69329 = iExp;
                this.f69316 = iExp;
                float f5 = f4 * f3;
                double d = f2;
                dExp = Math.exp((d / (d - 1.0d)) * Math.log((Math.abs(j2) * 0.35f) / f5)) * ((double) f5);
            } else {
                dExp = 0.0d;
            }
            long jSignum = (int) (dExp * ((double) Math.signum(f)));
            this.f69320 = jSignum;
            long j7 = jSignum + j;
            this.f69319 = j7;
            if (j7 < j3) {
                m47765(this.f69324, j7, j3);
                this.f69319 = j3;
            }
            long j8 = this.f69319;
            if (j8 > j4) {
                m47765(this.f69324, j8, j4);
                this.f69319 = j4;
                return;
            }
            return;
        }
        if (j > j3 && j < j6) {
            this.f69328 = true;
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
                m47772(j, j2, j11, j6, this.f69322);
                return;
            }
            m47769(j, j9);
            return;
        }
        if (j2 != 0) {
            j10 = j2;
        }
        float f7 = j10 > 0 ? -2000.0f : 2000.0f;
        this.f69321 = f7;
        float f8 = (-j2) / f7;
        float fSqrt = (float) Math.sqrt((((double) ((((f * f) / 2.0f) / Math.abs(f7)) + Math.abs(j9 - j))) * 2.0d) / ((double) Math.abs(this.f69321)));
        this.f69327 -= (long) ((int) ((fSqrt - f8) * 1000.0f));
        this.f69324 = j9;
        this.f69323 = j9;
        this.f69326 = (int) ((-this.f69321) * fSqrt);
        m47762();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m47762() {
        long j = this.f69326;
        float f = j * j;
        float fAbs = f / (Math.abs(this.f69321) * 2.0f);
        float fSignum = Math.signum(this.f69326);
        long j2 = this.f69322;
        if (fAbs > j2) {
            this.f69321 = ((-fSignum) * f) / (j2 * 2.0f);
            fAbs = j2;
        }
        this.f69322 = (int) fAbs;
        this.f69325 = 2;
        long j3 = this.f69324;
        long j4 = this.f69326;
        if (j4 <= 0) {
            fAbs = -fAbs;
        }
        this.f69319 = j3 + ((long) ((int) fAbs));
        this.f69316 = -((int) ((j4 * 1000.0f) / this.f69321));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47773() {
        int i = this.f69325;
        if (i == 0) {
            int i2 = this.f69316;
            if (i2 >= this.f69329) {
                return false;
            }
            long j = this.f69319;
            this.f69324 = j;
            this.f69323 = j;
            long j2 = (int) this.f69318;
            this.f69326 = j2;
            this.f69321 = j2 > 0 ? -2000.0f : 2000.0f;
            this.f69327 += (long) i2;
            m47762();
        } else {
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                this.f69327 += (long) this.f69316;
                m47769(this.f69319, this.f69324);
            }
        }
        m47774();
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m47774() {
        float fM1792;
        float f;
        double d;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f69327;
        if (jCurrentAnimationTimeMillis == 0) {
            return this.f69316 > 0;
        }
        int i = this.f69316;
        if (jCurrentAnimationTimeMillis > i) {
            return false;
        }
        int i2 = this.f69325;
        if (i2 == 0) {
            float f2 = this.f69329;
            float f3 = jCurrentAnimationTimeMillis / f2;
            int i3 = (int) (f3 * 100.0f);
            if (i3 < 100) {
                float f4 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = f69314;
                float f5 = fArr[i3];
                f = (fArr[i4] - f5) / ((i4 / 100.0f) - f4);
                fM1792 = C0280.m1792(f3, f4, f, f5);
            } else {
                fM1792 = 1.0f;
                f = 0.0f;
            }
            float f6 = this.f69320;
            this.f69318 = ((f * f6) / f2) * 1000.0f;
            d = fM1792 * f6;
        } else if (i2 == 1) {
            float f7 = jCurrentAnimationTimeMillis / i;
            float f8 = f7 * f7;
            float fSignum = Math.signum(this.f69326) * this.f69322;
            this.f69318 = ((-f7) + f8) * fSignum * 6.0f;
            d = ((3.0f * f8) - ((2.0f * f7) * f8)) * fSignum;
        } else if (i2 != 2) {
            d = 0.0d;
        } else {
            float f9 = jCurrentAnimationTimeMillis / 1000.0f;
            float f10 = this.f69326;
            float f11 = this.f69321 * f9;
            this.f69318 = f11 + f10;
            d = ((f11 * f9) / 2.0f) + (f10 * f9);
        }
        this.f69323 = this.f69324 + ((long) ((int) Math.round(d)));
        return true;
    }
}
