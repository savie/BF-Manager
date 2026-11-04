package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ܺܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16973 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m40018(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40019(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40020(int i) {
        double d = ((double) ((i >> 16) & 255)) * 0.2126d;
        return (int) ((((double) (i & 255)) * 0.0722d) + (((double) ((i >> 8) & 255)) * 0.7152d) + d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40021(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m40025(String str) {
        return str.endsWith(".apk") || str.endsWith(".apk.bak") || str.endsWith(".apk.1") || str.endsWith(".jar");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m40024(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Hex input must contain an even number of digits");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iM40019 = m40019(str.charAt(i2));
            int iM400110 = m40019(str.charAt(i2 + 1));
            if (iM40019 < 0 || iM400110 < 0) {
                throw new IllegalArgumentException("Hex input contains a non-hexadecimal digit");
            }
            bArr[i] = (byte) (iM400110 | (iM40019 << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40022(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr[i2] = charArray[(b & 255) >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40023(Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap;
        ?? r9;
        ?? r10;
        boolean z;
        if (bitmap == null) {
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 100 || height > 100) {
            float f = 100;
            float f2 = width;
            float f3 = height;
            float fMin = Math.min(f / f2, f / f3);
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(f2 * fMin), Math.round(f3 * fMin), true);
        } else {
            bitmapCreateScaledBitmap = bitmap;
        }
        int width2 = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int i = width2 * height2;
        int[] iArr = new int[i];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < width2 - 1; i4++) {
            for (int i5 = 0; i5 < height2 - 1; i5++) {
                int i6 = (i5 * width2) + i4;
                int i7 = iArr[i6];
                int i8 = iArr[i6 + 1];
                int i9 = iArr[i6 + width2];
                if ((i7 >>> 24) >= 128) {
                    int iM40020 = m40020(i7);
                    int iM40021 = m40020(i8);
                    int iM40022 = m40020(i9);
                    int iAbs = Math.abs(iM40020 - iM40021);
                    int iAbs2 = Math.abs(iM40020 - iM40022);
                    if (iAbs > 100 || iAbs2 > 100) {
                        i2++;
                    }
                    i3++;
                }
            }
        }
        boolean z2 = ((float) i2) / ((float) i3) > 0.2f;
        int iMin = Math.min(width2, height2) / 4;
        if (iMin < 3) {
            iMin = 3;
        }
        int i10 = 0;
        loop2: while (true) {
            if (i10 > width2 - iMin) {
                r9 = 0;
                r10 = 1;
                z = false;
                break;
            }
            for (int i11 = 0; i11 <= height2 - iMin; i11 += iMin / 2) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = i10; i14 < Math.min(i10 + iMin, width2); i14++) {
                    for (int i15 = i11; i15 < Math.min(i11 + iMin, height2); i15++) {
                        int i16 = iArr[(i15 * width2) + i14];
                        if ((i16 >>> 24) >= 128) {
                            i12++;
                            if (m40020(i16) > 200) {
                                i13++;
                            }
                        }
                    }
                }
                r9 = 0;
                r10 = 1;
                if (i12 > 0 && i13 / i12 > 0.5f) {
                    z = true;
                    break loop2;
                }
            }
            i10 += iMin / 2;
        }
        float[] fArr = new float[3];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i; i19++) {
            int i20 = iArr[i19];
            if ((i20 >>> 24) >= 128) {
                i17++;
                C8420.m22613(i20, fArr);
                float f4 = fArr[r9];
                float f5 = fArr[r10];
                float f6 = fArr[2];
                if ((f5 > 0.7f && f6 > 0.8f) || f6 > 0.9f || (f4 >= 50.0f && f4 <= 70.0f && f5 > 0.8f && f6 > 0.7f)) {
                    i18++;
                }
            }
        }
        return (z2 || z || (i17 > 0 && ((((float) i18) / ((float) i17)) > 0.15f ? 1 : ((((float) i18) / ((float) i17)) == 0.15f ? 0 : -1)) > 0)) ? r10 : r9;
    }
}
