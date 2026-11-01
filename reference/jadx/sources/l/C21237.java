package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.᩸֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: ABJA */
/* JADX INFO: loaded from: classes4.dex */
public final class C21237 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float[] f69167;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char f69168;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char m47716() {
        return this.f69168;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] m47715() {
        return this.f69167;
    }

    public C21237(char c, float[] fArr) {
        this.f69168 = c;
        this.f69167 = fArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47714(C21237[] c21237Arr) {
        char c = ' ';
        for (C21237 c21237 : c21237Arr) {
            if ((c == 'z' || c == 'Z') && c21237.f69168 == 'm') {
                return true;
            }
            c = c21237.f69168;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47710(C21237[] c21237Arr, C6420 c6420) {
        char c;
        boolean z;
        StringBuilder sb = new StringBuilder();
        for (C21237 c21237 : c21237Arr) {
            sb.append(c21237.f69168);
            int length = c21237.f69167.length;
            char c2 = c21237.f69168;
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
                float f = c21237.f69167[i];
                if (Math.abs(f) > Float.MAX_VALUE) {
                    throw new IllegalArgumentException("Invalid number: " + f);
                }
                sb.append(c6420.m17573(f));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47712(C19121 c19121, C21237[] c21237Arr) {
        C21237 c21237;
        float f;
        float f2;
        float f3;
        int i;
        C21237 c21238;
        int i2;
        C21237[] c21237Arr2 = c21237Arr;
        C20532 c20532 = new C20532();
        C20532 c20533 = new C20532();
        int length = c21237Arr2.length;
        char c = ' ';
        int i3 = 0;
        while (i3 < length) {
            C21237 c21239 = c21237Arr2[i3];
            int length2 = c21239.f69167.length;
            int i4 = length2 * 2;
            float[] fArr = new float[i4];
            float f4 = c20532.f66514;
            float f5 = c20532.f66515;
            float f6 = c20533.f66514;
            float f7 = c20533.f66515;
            int i5 = i3;
            int iIntValue = ((Integer) C17709.f56234.get(Character.valueOf(c21239.f69168))).intValue();
            switch (c21239.f69168) {
                case 'A':
                    f7 = f7;
                    f6 = f6;
                    c20533 = c20533;
                    length = length;
                    c21237 = c21239;
                    float f8 = f4;
                    f7 = f5;
                    int i6 = 0;
                    while (i6 < (length2 - iIntValue) + 1) {
                        if (!m47713(c19121)) {
                            float[] fArr2 = c21237.f69167;
                            int i7 = i6 + 1;
                            int i8 = i6 + 2;
                            int i9 = i6 + 4;
                            C15468 c15468 = new C15468(c19121, f8, f7, fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i6 + 3], fArr2[i9], fArr2[i6 + 5], fArr2[i6 + 6]);
                            c21237.f69167[i6] = c15468.m36999();
                            c21237.f69167[i7] = c15468.m36998();
                            c21237.f69167[i8] = c15468.m36996();
                            if (c15468.m36997()) {
                                float[] fArr3 = c21237.f69167;
                                fArr3[i9] = 1.0f - fArr3[i9];
                            }
                        }
                        float[] fArr4 = c21237.f69167;
                        int i10 = i6 + 5;
                        float f9 = fArr4[i10];
                        float f10 = fArr4[i6 + 6];
                        c19121.m43929(fArr4, i10, fArr4, i10, 1);
                        i6 += iIntValue;
                        f8 = f9;
                        f7 = f10;
                    }
                    f6 = f8;
                    f2 = f7;
                    f3 = f6;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c20534 = c20533;
                    c20534.f66514 = f3;
                    c20534.f66515 = f2;
                    char c2 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c20534;
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
                    c21237 = c21239;
                    float[] fArr5 = c21237.f69167;
                    float f11 = fArr5[length2 - 2];
                    float f12 = fArr5[length2 - 1];
                    c19121.m43929(fArr5, 0, fArr5, 0, length2 / 2);
                    f6 = f11;
                    f7 = f12;
                    f2 = f7;
                    f3 = f6;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c20535 = c20533;
                    c20535.f66514 = f3;
                    c20535.f66515 = f2;
                    char c3 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c20535;
                    c = c3;
                    length = length;
                    break;
                case 'H':
                    c21237 = c21239;
                    c21237.f69168 = 'L';
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = i11 * 2;
                        float[] fArr6 = c21237.f69167;
                        fArr[i12] = fArr6[i11];
                        fArr[i12 + 1] = f5;
                        f4 = fArr6[i11];
                    }
                    f = f5;
                    c19121.m43929(fArr, 0, fArr, 0, length2);
                    c21237.f69167 = fArr;
                    f7 = f;
                    f6 = f4;
                    f2 = f7;
                    f3 = f6;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c20536 = c20533;
                    c20536.f66514 = f3;
                    c20536.f66515 = f2;
                    char c4 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c20536;
                    c = c4;
                    length = length;
                    break;
                case 'M':
                    c21237 = c21239;
                    float[] fArr7 = c21237.f69167;
                    float f13 = fArr7[0];
                    f7 = fArr7[1];
                    f6 = f13;
                    float[] fArr8 = c21237.f69167;
                    float f14 = fArr8[length2 - 2];
                    float f15 = fArr8[length2 - 1];
                    c19121.m43929(fArr8, 0, fArr8, 0, length2 / 2);
                    f6 = f14;
                    f7 = f15;
                    f2 = f7;
                    f3 = f6;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c20537 = c20533;
                    c20537.f66514 = f3;
                    c20537.f66515 = f2;
                    char c5 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c20537;
                    c = c5;
                    length = length;
                    break;
                case HRSS1373Polynomial.K /* 86 */:
                    c21237 = c21239;
                    c21237.f69168 = 'L';
                    f = f5;
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = i13 * 2;
                        fArr[i14] = f4;
                        float[] fArr9 = c21237.f69167;
                        fArr[i14 + 1] = fArr9[i13];
                        f = fArr9[i13];
                    }
                    c19121.m43929(fArr, 0, fArr, 0, length2);
                    c21237.f69167 = fArr;
                    f7 = f;
                    f6 = f4;
                    f2 = f7;
                    f3 = f6;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c20538 = c20533;
                    c20538.f66514 = f3;
                    c20538.f66515 = f2;
                    char c6 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c20538;
                    c = c6;
                    length = length;
                    break;
                case 'Z':
                case 'z':
                    c20533 = c20533;
                    length = length;
                    c21237 = c21239;
                    f2 = f7;
                    f3 = f6;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c20539 = c20533;
                    c20539.f66514 = f3;
                    c20539.f66515 = f2;
                    char c7 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c20539;
                    c = c7;
                    length = length;
                    break;
                case 'a':
                    float f16 = f4;
                    C19121 c19122 = c19121;
                    int i15 = 0;
                    while (i15 < (length2 - iIntValue) + 1) {
                        float[] fArr10 = c21239.f69167;
                        int i16 = i15 + 5;
                        float f17 = f16 + fArr10[i16];
                        int i17 = i15 + 6;
                        float f18 = f5 + fArr10[i17];
                        if (m47713(c19122)) {
                            i = i15;
                            c21238 = c21239;
                        } else {
                            float[] fArr11 = c21239.f69167;
                            int i18 = i15 + 1;
                            int i19 = i15 + 2;
                            int i20 = i15 + 4;
                            c21238 = c21239;
                            i = i15;
                            C15468 c15469 = new C15468(c19121, f16, f5, fArr11[i15], fArr11[i18], fArr11[i19], fArr11[i15 + 3], fArr11[i20], f16 + fArr11[i16], f5 + fArr11[i17]);
                            m47711(c19121, c21238.f69167, i16, 2);
                            c21238.f69167[i] = c15469.m36999();
                            c21238.f69167[i18] = c15469.m36998();
                            c21238.f69167[i19] = c15469.m36996();
                            if (c15469.m36997()) {
                                float[] fArr12 = c21238.f69167;
                                fArr12[i20] = 1.0f - fArr12[i20];
                            }
                            c19122 = c19121;
                        }
                        i15 = i + iIntValue;
                        c21239 = c21238;
                        length2 = length2;
                        f16 = f17;
                        f5 = f18;
                        length = length;
                        c20533 = c20533;
                        f7 = f7;
                        f6 = f6;
                    }
                    f7 = f7;
                    f6 = f6;
                    c20533 = c20533;
                    length = length;
                    c21237 = c21239;
                    f6 = f16;
                    f7 = f5;
                    f2 = f7;
                    f3 = f6;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c205310 = c20533;
                    c205310.f66514 = f3;
                    c205310.f66515 = f2;
                    char c8 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c205310;
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
                        float[] fArr13 = c21239.f69167;
                        i21 += iIntValue;
                        f4 += fArr13[i21 - 2];
                        f5 += fArr13[i21 - 1];
                    }
                    if (!m47713(c19121)) {
                        m47711(c19121, c21239.f69167, 0, length2);
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c21237 = c21239;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c205311 = c20533;
                    c205311.f66514 = f3;
                    c205311.f66515 = f2;
                    char c9 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c205311;
                    c = c9;
                    length = length;
                    break;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    for (int i22 = 0; i22 < length2; i22++) {
                        float f19 = c21239.f69167[i22];
                        f4 += f19;
                        int i23 = i22 * 2;
                        fArr[i23] = f19;
                        fArr[i23 + 1] = 0.0f;
                    }
                    if (!m47713(c19121)) {
                        c21239.f69168 = 'l';
                        m47711(c19121, fArr, 0, i4);
                        c21239.f69167 = fArr;
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c21237 = c21239;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c205312 = c20533;
                    c205312.f66514 = f3;
                    c205312.f66515 = f2;
                    char c10 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c205312;
                    c = c10;
                    length = length;
                    break;
                case 'm':
                    if (c == 'z' || c == 'Z') {
                        c21239.f69168 = 'M';
                        float[] fArr14 = c21239.f69167;
                        f3 = fArr14[0] + f6;
                        fArr14[0] = f3;
                        f2 = f7 + fArr14[1];
                        fArr14[1] = f2;
                        for (int i24 = iIntValue; i24 < length2; i24 += iIntValue) {
                            float[] fArr15 = c21239.f69167;
                            fArr15[i24] = fArr15[i24] + fArr15[i24 - iIntValue];
                            int i25 = i24 + 1;
                            fArr15[i25] = fArr15[i25] + fArr15[i25 - iIntValue];
                        }
                        float[] fArr16 = c21239.f69167;
                        float f20 = fArr16[length2 - 2];
                        float f21 = fArr16[length2 - 1];
                        c19121.m43929(fArr16, 0, fArr16, 0, length2 / 2);
                        f6 = f20;
                        f7 = f21;
                    } else {
                        float[] fArr17 = c21239.f69167;
                        float f22 = f4 + fArr17[0];
                        float f23 = f5 + fArr17[1];
                        if (c == ' ') {
                            i2 = 2;
                            c19121.m43929(fArr17, 0, fArr17, 0, 1);
                        } else {
                            i2 = 2;
                            if (!m47713(c19121)) {
                                m47711(c19121, c21239.f69167, 0, 2);
                            }
                        }
                        float f24 = f22;
                        float f25 = f23;
                        for (int i26 = 2; i26 < length2; i26 += iIntValue) {
                            float[] fArr18 = c21239.f69167;
                            f24 += fArr18[i26];
                            f25 += fArr18[i26 + 1];
                        }
                        if (!m47713(c19121)) {
                            m47711(c19121, c21239.f69167, i2, length2 - 2);
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
                    c21237 = c21239;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c205313 = c20533;
                    c205313.f66514 = f3;
                    c205313.f66515 = f2;
                    char c11 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c205313;
                    c = c11;
                    length = length;
                    break;
                case 'v':
                    for (int i27 = 0; i27 < length2; i27++) {
                        int i28 = i27 * 2;
                        fArr[i28] = 0.0f;
                        float[] fArr19 = c21239.f69167;
                        fArr[i28 + 1] = fArr19[i27];
                        f5 += fArr19[i27];
                    }
                    if (!m47713(c19121)) {
                        c21239.f69168 = 'l';
                        m47711(c19121, fArr, 0, i4);
                        c21239.f69167 = fArr;
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c21237 = c21239;
                    c20532.f66514 = f6;
                    c20532.f66515 = f7;
                    C20532 c205314 = c20533;
                    c205314.f66514 = f3;
                    c205314.f66515 = f2;
                    char c12 = c21237.f69168;
                    i3 = i5 + 1;
                    c21237Arr2 = c21237Arr;
                    c20533 = c205314;
                    c = c12;
                    length = length;
                    break;
                default:
                    throw new IllegalStateException("Unexpected type " + c21239.f69168);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47713(C19121 c19121) {
        int iM43931 = c19121.m43931();
        return iM43931 == 0 || iM43931 == 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47711(C19121 c19121, float[] fArr, int i, int i2) {
        double[] dArr = new double[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dArr[i3] = fArr[i3 + i];
        }
        c19121.m43928(dArr, dArr, i2 / 2);
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4 + i] = (float) dArr[i4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f69168);
        float[] fArr = this.f69167;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            sb.append(i2 % 2 == 0 ? ' ' : ',');
            sb.append(C1323.m4721(f));
            i++;
            i2 = i3;
        }
        return sb.toString();
    }
}
