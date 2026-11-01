package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B19H */
/* JADX INFO: loaded from: classes.dex */
public final class C23584 implements Comparable {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static String[] f76390 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f76392;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f76393;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f76394;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f76396;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f76399;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23188 f76401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f76403;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f76391 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f76395 = Float.NaN;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f76402 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f76400 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f76398 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double[] f76404 = new double[18];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double[] f76397 = new double[18];

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f76399, ((C23584) obj).f76399);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52011(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52013(C23584 c23584, boolean[] zArr, boolean z) {
        zArr[0] = zArr[0] | m52011(this.f76399, c23584.f76399);
        zArr[1] = zArr[1] | m52011(this.f76393, c23584.f76393) | z;
        zArr[2] = z | m52011(this.f76394, c23584.f76394) | zArr[2];
        zArr[3] = zArr[3] | m52011(this.f76396, c23584.f76396);
        zArr[4] = m52011(this.f76403, c23584.f76403) | zArr[4];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52014(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f76393;
        float f2 = this.f76394;
        float f3 = this.f76396;
        float f4 = this.f76403;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52010(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52012(C4032 c4032) {
        this.f76401 = C23188.m51213(c4032.f14902.f75003);
        C23084 c23084 = c4032.f14902;
        this.f76402 = c23084.f75006;
        this.f76395 = c23084.f75009;
        this.f76391 = c23084.f75007;
        float f = c4032.f14904.f49911;
        for (String str : c4032.f14906.keySet()) {
            C9824 c9824 = (C9824) c4032.f14906.get(str);
            if (c9824.m24927() != EnumC2061.STRING_TYPE) {
                this.f76400.put(str, c9824);
            }
        }
    }
}
