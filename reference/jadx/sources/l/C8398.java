package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.o;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۠ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8398 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char[] f27512;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f27513;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m22568(int i) {
        if (65 <= i && i <= 90) {
            return true;
        }
        if (97 <= i && i <= 122) {
            return true;
        }
        if ((48 <= i && i <= 57) || i == 36 || i == 45 || i == 95) {
            return true;
        }
        if (161 <= i && i <= 8191) {
            return true;
        }
        if (8208 <= i && i <= 8231) {
            return true;
        }
        if (8240 <= i && i <= 55295) {
            return true;
        }
        if (57344 <= i && i < 65279) {
            return true;
        }
        if (65279 >= i || i > 65519) {
            return 65536 <= i && i <= 1114111;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22563(Bitmap bitmap) {
        if (f27513) {
            m22564(bitmap);
            return;
        }
        try {
            m22567(bitmap);
        } catch (Exception unused) {
            f27513 = true;
            m22564(bitmap);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m22564(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float[] fArr = new float[131];
        int i = 0;
        float f = 0.0f;
        for (int i2 = -65; i2 <= 65; i2++) {
            float fExp = (float) (Math.exp((-(i2 * i2)) / 2112.5f) * (1.0d / (Math.sqrt(6.283185307179586d) * ((double) 32.5f))));
            fArr[i] = fExp;
            f += fExp;
            i++;
        }
        for (int i3 = 0; i3 < 131; i3++) {
            fArr[i3] = fArr[i3] / f;
        }
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i4 = 0; i4 < height; i4++) {
            for (int i5 = 0; i5 < width; i5++) {
                int i6 = i5 - 65;
                int i7 = i5 + 65;
                float fRed = 0.0f;
                float fGreen = 0.0f;
                float fBlue = 0.0f;
                int i8 = 0;
                while (i6 <= i7) {
                    int i9 = iArr[(i4 * width) + (i6 >= width ? width - 1 : i6 < 0 ? 0 : i6)];
                    fRed += fArr[i8] * Color.red(i9);
                    fGreen += fArr[i8] * Color.green(i9);
                    fBlue += fArr[i8] * Color.blue(i9);
                    i8++;
                    i6++;
                }
                iArr[(i4 * width) + i5] = Color.rgb((int) fRed, (int) fGreen, (int) fBlue);
            }
        }
        for (int i10 = 0; i10 < width; i10++) {
            for (int i11 = 0; i11 < height; i11++) {
                int i12 = i11 - 65;
                int i13 = i11 + 65;
                float fRed2 = 0.0f;
                float fGreen2 = 0.0f;
                float fBlue2 = 0.0f;
                int i14 = 0;
                while (i12 <= i13) {
                    int i15 = iArr[((i12 >= height ? height - 1 : i12 < 0 ? 0 : i12) * width) + i10];
                    fRed2 += fArr[i14] * Color.red(i15);
                    fGreen2 += fArr[i14] * Color.green(i15);
                    fBlue2 += fArr[i14] * Color.blue(i15);
                    i14++;
                    i12++;
                }
                iArr[(i11 * width) + i10] = Color.rgb((int) fRed2, (int) fGreen2, (int) fBlue2);
            }
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m22565(String str) {
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m22558(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22559(int i) {
        if (i == Integer.MIN_VALUE) {
            return "not-attempted";
        }
        if (i == 0) {
            return "enabled";
        }
        if (i == 1) {
            return "disabled-by-user";
        }
        if (i == -1) {
            return "unsupported-kernel";
        }
        if (i == -2) {
            return "unsupported-tsync";
        }
        if (i <= -200000) {
            return "fatal-tsync-thread-" + ((-i) - 200000);
        }
        if (i > -1000) {
            return C13645.m33382(i, "unknown-");
        }
        StringBuilder sb = new StringBuilder("fatal-errno-");
        sb.append((-i) - 1000);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22560(int i, int i2, byte[] bArr) {
        char c;
        char[] cArr = f27512;
        if (cArr == null || cArr.length < i2) {
            f27512 = new char[i2];
        }
        char[] cArr2 = f27512;
        int i3 = 0;
        while (i2 > 0) {
            byte b = bArr[i];
            int i4 = b & 255;
            switch (i4 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i2--;
                    if (i4 == 0) {
                        m22562(i4, i);
                        throw null;
                    }
                    c = (char) i4;
                    i++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m22562(i4, i);
                    throw null;
                case 12:
                case 13:
                    i2 -= 2;
                    if (i2 < 0) {
                        m22562(i4, i);
                        throw null;
                    }
                    int i5 = i + 1;
                    byte b2 = bArr[i5];
                    int i6 = b2 & 255;
                    if ((b2 & 192) != 128) {
                        m22562(i6, i5);
                        throw null;
                    }
                    int i7 = ((b & bo.j) << 6) | (b2 & 63);
                    if (i7 != 0 && i7 < 128) {
                        m22562(i6, i5);
                        throw null;
                    }
                    c = (char) i7;
                    i += 2;
                    break;
                    break;
                case 14:
                    i2 -= 3;
                    if (i2 < 0) {
                        m22562(i4, i);
                        throw null;
                    }
                    int i8 = i + 1;
                    byte b3 = bArr[i8];
                    int i9 = b3 & 255;
                    int i10 = b3 & 192;
                    if (i10 != 128) {
                        m22562(i9, i8);
                        throw null;
                    }
                    int i11 = i + 2;
                    byte b4 = bArr[i11];
                    int i12 = b4 & 255;
                    if (i10 != 128) {
                        m22562(i12, i11);
                        throw null;
                    }
                    int i13 = ((b & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    if (i13 < 2048) {
                        m22562(i12, i11);
                        throw null;
                    }
                    c = (char) i13;
                    i += 3;
                    break;
                    break;
            }
            cArr2[i3] = c;
            i3++;
        }
        return new String(cArr2, 0, i3);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22567(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = width - 1;
        int i3 = height - 1;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int[] iArr4 = new int[i];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[1115136];
        int i4 = 0;
        for (int i5 = 0; i5 < 1115136; i5++) {
            iArr6[i5] = i5 / o.a.o;
        }
        int i6 = 131;
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 131, 3);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < height) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = height;
            int i20 = i6;
            int i21 = -65;
            for (int i22 = 65; i21 <= i22; i22 = 65) {
                int i23 = iArr[Math.min(i2, Math.max(i21, i4)) + i8];
                int[] iArr8 = iArr7[i21 + 65];
                iArr8[i4] = (i23 & 16711680) >> 16;
                iArr8[1] = (i23 & 65280) >> 8;
                iArr8[2] = i23 & 255;
                int iAbs = 66 - Math.abs(i21);
                int i24 = iArr8[i4];
                i10 = (i24 * iAbs) + i10;
                int i25 = iArr8[1];
                i11 = (i25 * iAbs) + i11;
                int i26 = iArr8[2];
                i12 = (iAbs * i26) + i12;
                if (i21 > 0) {
                    i16 += i24;
                    i17 += i25;
                    i18 += i26;
                } else {
                    i13 += i24;
                    i14 += i25;
                    i15 += i26;
                }
                i21++;
            }
            int i27 = 65;
            int i28 = 0;
            int i29 = i20;
            while (i28 < width) {
                iArr2[i8] = iArr6[i10];
                iArr3[i8] = iArr6[i11];
                iArr4[i8] = iArr6[i12];
                int i30 = i10 - i13;
                int i31 = i11 - i14;
                int i32 = i12 - i15;
                int[] iArr9 = iArr7[(i27 + 66) % i29];
                int i33 = i13 - iArr9[0];
                int i34 = i14 - iArr9[1];
                int i35 = i15 - iArr9[2];
                if (i7 == 0) {
                    iArr5[i28] = Math.min(i28 + 66, i2);
                }
                int i36 = iArr[iArr5[i28] + i9];
                int i37 = (i36 & 16711680) >> 16;
                iArr9[0] = i37;
                int i38 = (i36 & 65280) >> 8;
                iArr9[1] = i38;
                int i39 = i36 & 255;
                iArr9[2] = i39;
                int i40 = i16 + i37;
                int i41 = i17 + i38;
                int i42 = i18 + i39;
                i10 = i30 + i40;
                i11 = i31 + i41;
                i12 = i32 + i42;
                i27 = (i27 + 1) % 131;
                int[] iArr10 = iArr7[i27 % 131];
                int i43 = iArr10[0];
                i13 = i33 + i43;
                int i44 = iArr10[1];
                i14 = i34 + i44;
                int i45 = iArr10[2];
                i15 = i35 + i45;
                i16 = i40 - i43;
                i17 = i41 - i44;
                i18 = i42 - i45;
                i8++;
                i28++;
                i29 = 131;
                iArr6 = iArr6;
            }
            i9 += width;
            i7++;
            i4 = 0;
            i6 = 131;
            height = i19;
        }
        int[] iArr11 = iArr6;
        int i46 = height;
        int i47 = 0;
        while (i47 < width) {
            int i48 = (-65) * width;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            for (int i58 = -65; i58 <= 65; i58++) {
                int iMax = Math.max(0, i48) + i47;
                int[] iArr12 = iArr7[i58 + 65];
                iArr12[0] = iArr2[iMax];
                iArr12[1] = iArr3[iMax];
                iArr12[2] = iArr4[iMax];
                int iAbs2 = 66 - Math.abs(i58);
                i49 = (iArr2[iMax] * iAbs2) + i49;
                i50 = (iArr3[iMax] * iAbs2) + i50;
                i51 = (iArr4[iMax] * iAbs2) + i51;
                if (i58 > 0) {
                    i55 += iArr12[0];
                    i56 += iArr12[1];
                    i57 += iArr12[2];
                } else {
                    i52 += iArr12[0];
                    i53 += iArr12[1];
                    i54 += iArr12[2];
                }
                if (i58 < i3) {
                    i48 += width;
                }
            }
            int i59 = 0;
            int i60 = 65;
            int i61 = i46;
            int i62 = i47;
            while (i59 < i61) {
                iArr[i62] = (iArr[i62] & (-16777216)) | (iArr11[i49] << 16) | (iArr11[i50] << 8) | iArr11[i51];
                int i63 = i49 - i52;
                int i64 = i50 - i53;
                int i65 = i51 - i54;
                int i66 = i61;
                int[] iArr13 = iArr7[(i60 + 66) % 131];
                int i67 = i52 - iArr13[0];
                int i68 = i53 - iArr13[1];
                int i69 = i54 - iArr13[2];
                if (i47 == 0) {
                    iArr5[i59] = Math.min(i59 + 66, i3) * width;
                }
                int i70 = iArr5[i59] + i47;
                int i71 = iArr2[i70];
                iArr13[0] = i71;
                int i72 = iArr3[i70];
                iArr13[1] = i72;
                int i73 = iArr4[i70];
                iArr13[2] = i73;
                int i74 = i55 + i71;
                int i75 = i56 + i72;
                int i76 = i57 + i73;
                i49 = i63 + i74;
                i50 = i64 + i75;
                i51 = i65 + i76;
                i60 = (i60 + 1) % 131;
                int[] iArr14 = iArr7[i60];
                int i77 = iArr14[0];
                i52 = i67 + i77;
                int i78 = iArr14[1];
                i53 = i68 + i78;
                int i79 = iArr14[2];
                i54 = i69 + i79;
                i55 = i74 - i77;
                i56 = i75 - i78;
                i57 = i76 - i79;
                i62 += width;
                i59++;
                i61 = i66;
                iArr = iArr;
            }
            i47++;
            i46 = i61;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, i46);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22562(int i, int i2) {
        StringBuilder sb = new StringBuilder("bad utf-8 byte ");
        sb.append(C14301.m34740(i));
        sb.append(" at offset ");
        char[] cArr = new char[8];
        for (int i3 = 0; i3 < 8; i3++) {
            cArr[7 - i3] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        sb.append(new String(cArr));
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m22566(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt > 127) {
                sb.append(cCharAt);
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22561(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else {
                if (i >= length - 1) {
                    throw new IllegalArgumentException("escape Sequence error: " + cCharAt);
                }
                int i2 = i + 1;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == '\"') {
                    sb.append('\"');
                } else if (cCharAt2 == '\'') {
                    sb.append('\'');
                } else if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else if (cCharAt2 == 'b') {
                    sb.append('\b');
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else {
                    if (cCharAt2 != 'u') {
                        throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m(i, str, new StringBuilder("escape Sequence error: ")));
                    }
                    int i3 = i + 2;
                    if (i3 > length - 4) {
                        throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m(i, str, new StringBuilder("unicode error: ")));
                    }
                    int i4 = i + 4;
                    int iM22557 = (m22557(str.charAt(i3)) << 12) | (m22557(str.charAt(i + 3)) << 8);
                    i += 5;
                    sb.append((char) (iM22557 | (m22557(str.charAt(i4)) << 4) | m22557(str.charAt(i))));
                }
                i = i2;
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22557(char c) {
        int iDigit = Character.digit(c, 16);
        if (iDigit >= 0 && iDigit <= 15) {
            return iDigit;
        }
        throw new IllegalArgumentException("illegal not hex character: " + c);
    }
}
