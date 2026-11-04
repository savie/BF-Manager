package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: B19H */
/* JADX INFO: loaded from: classes3.dex */
public final class C10666 implements Comparable {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static String[] f33831 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C12573 f33832;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f33834;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f33835;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f33836;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f33838;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f33841;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f33845;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f33843 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f33840 = Float.NaN;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f33844 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f33842 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f33837 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double[] f33839 = new double[18];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double[] f33833 = new double[18];

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f33834, ((C10666) obj).f33834);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27177(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27179(C10666 c10666, boolean[] zArr, boolean z) {
        zArr[0] = zArr[0] | m27177(this.f33834, c10666.f33834);
        zArr[1] = zArr[1] | m27177(this.f33841, c10666.f33841) | z;
        zArr[2] = z | m27177(this.f33835, c10666.f33835) | zArr[2];
        zArr[3] = zArr[3] | m27177(this.f33836, c10666.f33836);
        zArr[4] = m27177(this.f33845, c10666.f33845) | zArr[4];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27180(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f33841;
        float f2 = this.f33835;
        float f3 = this.f33836;
        float f4 = this.f33845;
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
    public static void m27176(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
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
    public final void m27178(C3448 c3448) {
        this.f33832 = C12573.m31287(c3448.f11246.f39885);
        C12397 c12397 = c3448.f11246;
        this.f33844 = c12397.f39887;
        this.f33840 = c12397.f39886;
        this.f33843 = c12397.f39884;
        float f = c3448.f11244.f21663;
        for (String str : c3448.f11245.keySet()) {
            C15380 c15380 = (C15380) c3448.f11245.get(str);
            if (c15380.m36840() != EnumC19856.STRING_TYPE) {
                this.f33842.put(str, c15380);
            }
        }
    }
}
