package l;

import android.graphics.Bitmap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۖܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K99K */
/* JADX INFO: loaded from: classes2.dex */
public final class C2641 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8148(int i) {
        double d = ((double) ((i >> 16) & 255)) * 0.2126d;
        return (int) ((((double) (i & 255)) * 0.0722d) + (((double) ((i >> 8) & 255)) * 0.7152d) + d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8151(Throwable th) {
        String message = th.getMessage();
        return (message == null || message.isEmpty()) ? th.toString() : message;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8150(String str, String str2) {
        LinkedHashSet<String> linkedHashSetM18399 = C6795.m18399(str);
        if (linkedHashSetM18399 != null && !linkedHashSetM18399.isEmpty()) {
            for (String str3 : linkedHashSetM18399) {
                String strM8152 = m8152(Pattern.compile(C17874.m41459("％" + str3.replace("$", " $ ").substring(1)), 66), str2, str3);
                if (strM8152 == null) {
                    strM8152 = m8152(Pattern.compile(C17874.m41459("％" + str3.replace("$", "个$ ").substring(1)), 66), str2, str3);
                }
                if (strM8152 == null) {
                    int iIndexOf = str3.indexOf(36);
                    if (iIndexOf > 1) {
                        String strM8153 = m8152(Pattern.compile(C17874.m41459("% " + str3.substring(1, iIndexOf) + " " + str3.substring(iIndexOf)), 66), str2, str3);
                        strM8152 = strM8153 == null ? m8152(Pattern.compile(C17874.m41459("% " + str3.substring(1, iIndexOf) + " $ " + str3.substring(iIndexOf + 1)), 66), str2, str3) : strM8153;
                    } else {
                        strM8152 = m8152(Pattern.compile(C17874.m41459("% " + str3.substring(1)), 66), str2, str3);
                    }
                }
                if (strM8152 != null) {
                    str2 = strM8152;
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8149(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m8155(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8154(Bitmap bitmap) {
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
                    int iM8148 = m8148(i7);
                    int iM8149 = m8148(i8);
                    int iM81410 = m8148(i9);
                    int iAbs = Math.abs(iM8148 - iM8149);
                    int iAbs2 = Math.abs(iM8148 - iM81410);
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
                            if (m8148(i16) > 200) {
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
                C3057.m9161(i20, fArr);
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8153(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8152(Pattern pattern, String str, String str2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(str2);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd < str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m8156(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }
}
