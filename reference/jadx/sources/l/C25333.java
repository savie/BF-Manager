package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.᩻᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABJA */
/* JADX INFO: loaded from: classes.dex */
public final class C25333 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float[] f81802;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char f81803;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char m56616() {
        return this.f81803;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] m56615() {
        return this.f81802;
    }

    public C25333(char c, float[] fArr) {
        this.f81803 = c;
        this.f81802 = fArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56614(C25333[] c25333Arr) {
        char c = ' ';
        for (C25333 c25333 : c25333Arr) {
            if ((c == 'z' || c == 'Z') && c25333.f81803 == 'm') {
                return true;
            }
            c = c25333.f81803;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56610(C25333[] c25333Arr, C5941 c5941) {
        char c;
        boolean z;
        StringBuilder sb = new StringBuilder();
        for (C25333 c25333 : c25333Arr) {
            sb.append(c25333.f81803);
            int length = c25333.f81802.length;
            char c2 = c25333.f81803;
            if ((c2 == 'm' || c2 == 'M') && length > 2) {
                c = c2 == 'm' ? 'l' : 'L';
                z = true;
            } else {
                c = ' ';
                z = false;
            }
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(i % 2 != 0 ? "," : " ");
                }
                if (z && i == 2) {
                    sb.append(c);
                }
                float f = c25333.f81802[i];
                if (Math.abs(f) > Float.MAX_VALUE) {
                    throw new IllegalArgumentException("Invalid number: " + f);
                }
                sb.append(c5941.m17262(f));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56612(C23841 c23841, C25333[] c25333Arr) {
        C25333 c25333;
        float f;
        float f2;
        float f3;
        int i;
        C25333 c25334;
        int i2;
        C25333[] c25333Arr2 = c25333Arr;
        C6687 c6687 = new C6687();
        C6687 c6688 = new C6687();
        int length = c25333Arr2.length;
        char c = ' ';
        int i3 = 0;
        while (i3 < length) {
            C25333 c25335 = c25333Arr2[i3];
            int length2 = c25335.f81802.length;
            int i4 = length2 * 2;
            float[] fArr = new float[i4];
            float f4 = c6687.f22278;
            float f5 = c6687.f22279;
            float f6 = c6688.f22278;
            float f7 = c6688.f22279;
            int i5 = i3;
            int iIntValue = ((Integer) C17127.f55876.get(Character.valueOf(c25335.f81803))).intValue();
            switch (c25335.f81803) {
                case 'A':
                    f7 = f7;
                    f6 = f6;
                    c6688 = c6688;
                    length = length;
                    c25333 = c25335;
                    float f8 = f4;
                    f7 = f5;
                    int i6 = 0;
                    while (i6 < (length2 - iIntValue) + 1) {
                        if (!m56613(c23841)) {
                            float[] fArr2 = c25333.f81802;
                            int i7 = i6 + 1;
                            int i8 = i6 + 2;
                            int i9 = i6 + 4;
                            C24982 c24982 = new C24982(c23841, f8, f7, fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i6 + 3], fArr2[i9], fArr2[i6 + 5], fArr2[i6 + 6]);
                            c25333.f81802[i6] = c24982.m55829();
                            c25333.f81802[i7] = c24982.m55828();
                            c25333.f81802[i8] = c24982.m55830();
                            if (c24982.m55827()) {
                                float[] fArr3 = c25333.f81802;
                                fArr3[i9] = 1.0f - fArr3[i9];
                            }
                        }
                        float[] fArr4 = c25333.f81802;
                        int i10 = i6 + 5;
                        float f9 = fArr4[i10];
                        float f10 = fArr4[i6 + 6];
                        c23841.m53181(fArr4, i10, fArr4, i10, 1);
                        i6 += iIntValue;
                        f8 = f9;
                        f7 = f10;
                    }
                    f6 = f8;
                    f2 = f7;
                    f3 = f6;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c6689 = c6688;
                    c6689.f22278 = f3;
                    c6689.f22279 = f2;
                    char c2 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c6689;
                    c = c2;
                    length = length;
                    break;
                case 'C':
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                case 'Q':
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                case 'T':
                    f7 = f7;
                    f6 = f6;
                    c25333 = c25335;
                    float[] fArr5 = c25333.f81802;
                    float f11 = fArr5[length2 - 2];
                    float f12 = fArr5[length2 - 1];
                    c23841.m53181(fArr5, 0, fArr5, 0, length2 / 2);
                    f6 = f11;
                    f7 = f12;
                    f2 = f7;
                    f3 = f6;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66810 = c6688;
                    c66810.f22278 = f3;
                    c66810.f22279 = f2;
                    char c3 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66810;
                    c = c3;
                    length = length;
                    break;
                case 'H':
                    c25333 = c25335;
                    c25333.f81803 = 'L';
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = i11 * 2;
                        float[] fArr6 = c25333.f81802;
                        fArr[i12] = fArr6[i11];
                        fArr[i12 + 1] = f5;
                        f4 = fArr6[i11];
                    }
                    f = f5;
                    c23841.m53181(fArr, 0, fArr, 0, length2);
                    c25333.f81802 = fArr;
                    f7 = f;
                    f6 = f4;
                    f2 = f7;
                    f3 = f6;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66811 = c6688;
                    c66811.f22278 = f3;
                    c66811.f22279 = f2;
                    char c4 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66811;
                    c = c4;
                    length = length;
                    break;
                case 'M':
                    c25333 = c25335;
                    float[] fArr7 = c25333.f81802;
                    float f13 = fArr7[0];
                    f7 = fArr7[1];
                    f6 = f13;
                    float[] fArr8 = c25333.f81802;
                    float f14 = fArr8[length2 - 2];
                    float f15 = fArr8[length2 - 1];
                    c23841.m53181(fArr8, 0, fArr8, 0, length2 / 2);
                    f6 = f14;
                    f7 = f15;
                    f2 = f7;
                    f3 = f6;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66812 = c6688;
                    c66812.f22278 = f3;
                    c66812.f22279 = f2;
                    char c5 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66812;
                    c = c5;
                    length = length;
                    break;
                case HRSS1373Polynomial.K /* 86 */:
                    c25333 = c25335;
                    c25333.f81803 = 'L';
                    f = f5;
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = i13 * 2;
                        fArr[i14] = f4;
                        float[] fArr9 = c25333.f81802;
                        fArr[i14 + 1] = fArr9[i13];
                        f = fArr9[i13];
                    }
                    c23841.m53181(fArr, 0, fArr, 0, length2);
                    c25333.f81802 = fArr;
                    f7 = f;
                    f6 = f4;
                    f2 = f7;
                    f3 = f6;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66813 = c6688;
                    c66813.f22278 = f3;
                    c66813.f22279 = f2;
                    char c6 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66813;
                    c = c6;
                    length = length;
                    break;
                case 'Z':
                case 'z':
                    c6688 = c6688;
                    length = length;
                    c25333 = c25335;
                    f2 = f7;
                    f3 = f6;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66814 = c6688;
                    c66814.f22278 = f3;
                    c66814.f22279 = f2;
                    char c7 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66814;
                    c = c7;
                    length = length;
                    break;
                case 'a':
                    float f16 = f4;
                    C23841 c23842 = c23841;
                    int i15 = 0;
                    while (i15 < (length2 - iIntValue) + 1) {
                        float[] fArr10 = c25335.f81802;
                        int i16 = i15 + 5;
                        float f17 = f16 + fArr10[i16];
                        int i17 = i15 + 6;
                        float f18 = f5 + fArr10[i17];
                        if (m56613(c23842)) {
                            i = i15;
                            c25334 = c25335;
                        } else {
                            float[] fArr11 = c25335.f81802;
                            int i18 = i15 + 1;
                            int i19 = i15 + 2;
                            int i20 = i15 + 4;
                            c25334 = c25335;
                            i = i15;
                            C24982 c24983 = new C24982(c23841, f16, f5, fArr11[i15], fArr11[i18], fArr11[i19], fArr11[i15 + 3], fArr11[i20], f16 + fArr11[i16], f5 + fArr11[i17]);
                            m56611(c23841, c25334.f81802, i16, 2);
                            c25334.f81802[i] = c24983.m55829();
                            c25334.f81802[i18] = c24983.m55828();
                            c25334.f81802[i19] = c24983.m55830();
                            if (c24983.m55827()) {
                                float[] fArr12 = c25334.f81802;
                                fArr12[i20] = 1.0f - fArr12[i20];
                            }
                            c23842 = c23841;
                        }
                        i15 = i + iIntValue;
                        c25335 = c25334;
                        length2 = length2;
                        f16 = f17;
                        f5 = f18;
                        length = length;
                        c6688 = c6688;
                        f7 = f7;
                        f6 = f6;
                    }
                    f7 = f7;
                    f6 = f6;
                    c6688 = c6688;
                    length = length;
                    c25333 = c25335;
                    f6 = f16;
                    f7 = f5;
                    f2 = f7;
                    f3 = f6;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66815 = c6688;
                    c66815.f22278 = f3;
                    c66815.f22279 = f2;
                    char c8 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66815;
                    c = c8;
                    length = length;
                    break;
                case q.f /* 99 */:
                case 'l':
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case 's':
                case 't':
                    int i21 = 0;
                    while (i21 < (length2 - iIntValue) + 1) {
                        float[] fArr13 = c25335.f81802;
                        i21 += iIntValue;
                        f4 += fArr13[i21 - 2];
                        f5 += fArr13[i21 - 1];
                    }
                    if (!m56613(c23841)) {
                        m56611(c23841, c25335.f81802, 0, length2);
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c25333 = c25335;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66816 = c6688;
                    c66816.f22278 = f3;
                    c66816.f22279 = f2;
                    char c9 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66816;
                    c = c9;
                    length = length;
                    break;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    for (int i22 = 0; i22 < length2; i22++) {
                        float f19 = c25335.f81802[i22];
                        f4 += f19;
                        int i23 = i22 * 2;
                        fArr[i23] = f19;
                        fArr[i23 + 1] = 0.0f;
                    }
                    if (!m56613(c23841)) {
                        c25335.f81803 = 'l';
                        m56611(c23841, fArr, 0, i4);
                        c25335.f81802 = fArr;
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c25333 = c25335;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66817 = c6688;
                    c66817.f22278 = f3;
                    c66817.f22279 = f2;
                    char c10 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66817;
                    c = c10;
                    length = length;
                    break;
                case 'm':
                    if (c == 'z' || c == 'Z') {
                        c25335.f81803 = 'M';
                        float[] fArr14 = c25335.f81802;
                        f3 = fArr14[0] + f6;
                        fArr14[0] = f3;
                        f2 = f7 + fArr14[1];
                        fArr14[1] = f2;
                        for (int i24 = iIntValue; i24 < length2; i24 += iIntValue) {
                            float[] fArr15 = c25335.f81802;
                            fArr15[i24] = fArr15[i24] + fArr15[i24 - iIntValue];
                            int i25 = i24 + 1;
                            fArr15[i25] = fArr15[i25] + fArr15[i25 - iIntValue];
                        }
                        float[] fArr16 = c25335.f81802;
                        float f20 = fArr16[length2 - 2];
                        float f21 = fArr16[length2 - 1];
                        c23841.m53181(fArr16, 0, fArr16, 0, length2 / 2);
                        f6 = f20;
                        f7 = f21;
                    } else {
                        float[] fArr17 = c25335.f81802;
                        float f22 = f4 + fArr17[0];
                        float f23 = f5 + fArr17[1];
                        if (c == ' ') {
                            i2 = 2;
                            c23841.m53181(fArr17, 0, fArr17, 0, 1);
                        } else {
                            i2 = 2;
                            if (!m56613(c23841)) {
                                m56611(c23841, c25335.f81802, 0, 2);
                            }
                        }
                        float f24 = f22;
                        float f25 = f23;
                        for (int i26 = 2; i26 < length2; i26 += iIntValue) {
                            float[] fArr18 = c25335.f81802;
                            f24 += fArr18[i26];
                            f25 += fArr18[i26 + 1];
                        }
                        if (!m56613(c23841)) {
                            m56611(c23841, c25335.f81802, i2, length2 - 2);
                        }
                        f5 = f25;
                        f6 = f22;
                        f7 = f23;
                        f4 = f24;
                        f3 = f6;
                        f6 = f4;
                        f2 = f7;
                        f7 = f5;
                    }
                    c25333 = c25335;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66818 = c6688;
                    c66818.f22278 = f3;
                    c66818.f22279 = f2;
                    char c11 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66818;
                    c = c11;
                    length = length;
                    break;
                case 'v':
                    for (int i27 = 0; i27 < length2; i27++) {
                        int i28 = i27 * 2;
                        fArr[i28] = 0.0f;
                        float[] fArr19 = c25335.f81802;
                        fArr[i28 + 1] = fArr19[i27];
                        f5 += fArr19[i27];
                    }
                    if (!m56613(c23841)) {
                        c25335.f81803 = 'l';
                        m56611(c23841, fArr, 0, i4);
                        c25335.f81802 = fArr;
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c25333 = c25335;
                    c6687.f22278 = f6;
                    c6687.f22279 = f7;
                    C6687 c66819 = c6688;
                    c66819.f22278 = f3;
                    c66819.f22279 = f2;
                    char c12 = c25333.f81803;
                    i3 = i5 + 1;
                    c25333Arr2 = c25333Arr;
                    c6688 = c66819;
                    c = c12;
                    length = length;
                    break;
                default:
                    throw new IllegalStateException("Unexpected type " + c25335.f81803);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56613(C23841 c23841) {
        int iM53187 = c23841.m53187();
        return iM53187 == 0 || iM53187 == 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56611(C23841 c23841, float[] fArr, int i, int i2) {
        double[] dArr = new double[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dArr[i3] = fArr[i3 + i];
        }
        c23841.m53180(dArr, dArr, i2 / 2);
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4 + i] = (float) dArr[i4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f81803);
        float[] fArr = this.f81802;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            sb.append(i2 % 2 == 0 ? ' ' : ',');
            sb.append(C5306.m15932(f));
            i++;
            i2 = i3;
        }
        return sb.toString();
    }
}
