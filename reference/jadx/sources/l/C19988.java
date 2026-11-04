package l;

import android.graphics.Color;

/* JADX INFO: renamed from: l.ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G55Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C19988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f64245 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m45966(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i3, m45959(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), m45959(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), m45959(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45959(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m45954(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException(C4791.m14766(new StringBuilder("background can not be translucent: #"), i2));
        }
        if (Color.alpha(i) < 255) {
            i = m45966(i, i2);
        }
        double dM45953 = m45953(i) + 0.05d;
        double dM45954 = m45953(i2) + 0.05d;
        return Math.max(dM45953, dM45954) / Math.min(dM45953, dM45954);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45957(int i, float f, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException(C4791.m14766(new StringBuilder("background can not be translucent: #"), i2));
        }
        double d = f;
        if (m45954(m45964(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (m45954(m45964(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45962(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                f = fMax == f3 ? ((f4 - f2) / f5) + 2.0f : ((f2 - f3) / f5) + 4.0f;
            }
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = f7 < 0.0f ? 0.0f : Math.min(f7, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f6 >= 0.0f ? Math.min(f6, 1.0f) : 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45963(int i, float[] fArr) {
        m45962(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45960(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fAbs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                iRound3 = Math.round(f4 * 255.0f);
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            case 3:
                iRound3 = Math.round(f4 * 255.0f);
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 4:
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            default:
                iRound2 = 0;
                iRound = 0;
                break;
        }
        return Color.rgb(m45965(iRound3), m45965(iRound), m45965(iRound2));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m45964(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45961(int i, int i2, int i3, double[] dArr) {
        m45967(i, i2, i3, dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dM45952 = m45952(d / 95.047d);
        double dM45953 = m45952(d2 / 100.0d);
        double dM45954 = m45952(d3 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * dM45953) - 16.0d);
        dArr[1] = (dM45952 - dM45953) * 500.0d;
        dArr[2] = (dM45953 - dM45954) * 200.0d;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m45967(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45956(double d, double d2, double d3) {
        double dM51847 = C22972.m51847(d3, -0.4986d, ((-1.5372d) * d2) + (3.2406d * d), 100.0d);
        double dM51848 = C22972.m51847(d3, 0.0415d, (1.8758d * d2) + ((-0.9689d) * d), 100.0d);
        double dM51849 = C22972.m51847(d3, 1.057d, ((-0.204d) * d2) + (0.0557d * d), 100.0d);
        return Color.rgb(m45965((int) Math.round((dM51847 > 0.0031308d ? (Math.pow(dM51847, 0.4166666666666667d) * 1.055d) - 0.055d : dM51847 * 12.92d) * 255.0d)), m45965((int) Math.round((dM51848 > 0.0031308d ? (Math.pow(dM51848, 0.4166666666666667d) * 1.055d) - 0.055d : dM51848 * 12.92d) * 255.0d)), m45965((int) Math.round((dM51849 > 0.0031308d ? (Math.pow(dM51849, 0.4166666666666667d) * 1.055d) - 0.055d : dM51849 * 12.92d) * 255.0d)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m45965(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m45952(double d) {
        if (d > 0.008856d) {
            return Math.pow(d, 0.3333333333333333d);
        }
        return C22972.m51847(d, 903.3d, 16.0d, 116.0d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45958(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m45953(int i) {
        ThreadLocal threadLocal = f64245;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        m45967(Color.red(i), Color.green(i), Color.blue(i), dArr);
        return dArr[1] / 100.0d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45955(double d, double d2) {
        ThreadLocal threadLocal = f64245;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        double d3 = (d / 500.0d) + 0.9137931034482759d;
        double d4 = 0.9137931034482759d - (d2 / 200.0d);
        double dPow = Math.pow(d3, 3.0d);
        if (dPow <= 0.008856d) {
            dPow = ((d3 * 116.0d) - 16.0d) / 903.3d;
        }
        double dPow2 = Math.pow(0.9137931034482759d, 3.0d);
        double dPow3 = Math.pow(d4, 3.0d);
        if (dPow3 <= 0.008856d) {
            dPow3 = ((d4 * 116.0d) - 16.0d) / 903.3d;
        }
        double d5 = dPow * 95.047d;
        dArr[0] = d5;
        double d6 = dPow2 * 100.0d;
        dArr[1] = d6;
        double d7 = dPow3 * 108.883d;
        dArr[2] = d7;
        return m45956(d5, d6, d7);
    }
}
