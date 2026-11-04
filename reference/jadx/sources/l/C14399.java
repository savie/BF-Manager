package l;

import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܰۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14399 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f45378 = {0, 0, 0, 1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final float[] f45376 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object f45379 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int[] f45377 = new int[10];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34821(int i, byte[] bArr) {
        int i2;
        synchronized (f45379) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f45377;
                    if (iArr.length <= i4) {
                        f45377 = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f45377[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f45377[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34822(C15648 c15648) {
        if (C17359.equals(c15648.f50848, "video/avc")) {
            return 1;
        }
        return (C17359.equals(c15648.f50848, "video/hevc") || C9681.m25262(c15648.f50836, "video/hevc") != null) ? 2 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34829(byte[] bArr, int i, C15648 c15648) {
        int i2;
        if (C17359.equals(c15648.f50848, "video/avc")) {
            byte b = bArr[4];
            if (((b & UTF8.S_P4B) >> 5) == 0 && ((i2 = b & bo.j) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (C17359.equals(c15648.f50848, "video/hevc")) {
            C11416 c11416M34825 = m34825(new C21113(bArr, 4, i + 4));
            int i3 = c11416M34825.f35896;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && c11416M34825.f35895 == c15648.f50827 - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:128:0x0201  */
    /* JADX WARN: Code duplicated, block: B:131:0x020a  */
    /* JADX WARN: Code duplicated, block: B:133:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0211  */
    /* JADX WARN: Code duplicated, block: B:137:0x021d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0234  */
    /* JADX WARN: Code duplicated, block: B:140:0x0240  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0178  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0188  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C3959 m34830(int i, int i2, byte[] bArr) {
        int iM48205;
        boolean z;
        int i3;
        int i4;
        int iM48206;
        boolean z2;
        int i5;
        boolean zM48203;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM4561;
        float f;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM4559;
        int i15;
        boolean zM48204;
        boolean zM48205;
        int iM48207;
        int iM48208;
        int iM48209;
        int iM482010;
        int i16;
        int i17;
        int i18;
        C21113 c21113 = new C21113(bArr, i + 1, i2);
        int iM482011 = c21113.m48206(8);
        int iM482012 = c21113.m48206(8);
        int iM482013 = c21113.m48206(8);
        int iM482014 = c21113.m48205();
        if (iM482011 == 100 || iM482011 == 110 || iM482011 == 122 || iM482011 == 244 || iM482011 == 44 || iM482011 == 83 || iM482011 == 86 || iM482011 == 118 || iM482011 == 128 || iM482011 == 138) {
            iM48205 = c21113.m48205();
            boolean zM48206 = iM48205 == 3 ? c21113.m48203() : false;
            int iM482015 = c21113.m48205();
            int iM482016 = c21113.m48205();
            c21113.m48204();
            if (c21113.m48203()) {
                int i19 = iM48205 != 3 ? 8 : 12;
                int i20 = 0;
                while (i20 < i19) {
                    if (c21113.m48203()) {
                        int i21 = i20 < 6 ? 16 : 64;
                        int iM482017 = 8;
                        int i22 = 8;
                        for (int i23 = 0; i23 < i21; i23++) {
                            if (iM482017 != 0) {
                                iM482017 = ((c21113.m48208() + i22) + 256) % 256;
                            }
                            if (iM482017 != 0) {
                                i22 = iM482017;
                            }
                        }
                    }
                    i20++;
                }
            }
            z = zM48206;
            i3 = iM482015;
            i4 = iM482016;
        } else {
            i3 = 0;
            iM48205 = 1;
            i4 = 0;
            z = false;
        }
        int iM482018 = c21113.m48205() + 4;
        int iM482019 = c21113.m48205();
        if (iM482019 != 0) {
            if (iM482019 == 1) {
                boolean zM48207 = c21113.m48203();
                c21113.m48208();
                c21113.m48208();
                long jM48205 = c21113.m48205();
                i3 = i3;
                for (int i24 = 0; i24 < jM48205; i24++) {
                    c21113.m48205();
                }
                z2 = zM48207;
                i5 = 0;
            } else {
                iM48206 = 0;
            }
            c21113.m48205();
            c21113.m48204();
            int iM482020 = c21113.m48205() + 1;
            int iM482021 = c21113.m48205() + 1;
            zM48203 = c21113.m48203();
            i6 = 2 - (zM48203 ? 1 : 0);
            int i25 = iM482021 * i6;
            if (!zM48203) {
                c21113.m48204();
            }
            c21113.m48204();
            i7 = iM482020 * 16;
            i8 = i25 * 16;
            if (c21113.m48203()) {
                int iM482022 = c21113.m48205();
                int iM482023 = c21113.m48205();
                int iM482024 = c21113.m48205();
                int iM482025 = c21113.m48205();
                if (iM48205 == 0) {
                    i18 = 1;
                } else {
                    if (iM48205 == 3) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                    if (iM48205 == 1) {
                        i17 = 2;
                    } else {
                        i17 = 1;
                    }
                    i6 *= i17;
                    i18 = i16;
                }
                i7 -= (iM482022 + iM482023) * i18;
                i8 -= (iM482024 + iM482025) * i6;
            } else {
                iM482019 = iM482019;
            }
            int i26 = i7;
            int i27 = i8;
            i9 = ((iM482011 != 44 || iM482011 == 86 || iM482011 == 100 || iM482011 == 110 || iM482011 == 122 || iM482011 == 244) && (iM482012 & 16) != 0) ? 0 : 16;
            iM4561 = -1;
            f = 1.0f;
            if (c21113.m48203()) {
                if (c21113.m48203()) {
                    iM48208 = c21113.m48206(8);
                    if (iM48208 == 255) {
                        iM48209 = c21113.m48206(16);
                        iM482010 = c21113.m48206(16);
                        if (iM48209 != 0 && iM482010 != 0) {
                            f = iM48209 / iM482010;
                        }
                    } else if (iM48208 < 17) {
                        f = f45376[iM48208];
                    } else {
                        j$$ExternalSyntheticOutline0.m(iM48208, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (c21113.m48203()) {
                    c21113.m48204();
                }
                if (c21113.m48203()) {
                    c21113.m48202(3);
                    if (c21113.m48203()) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (c21113.m48203()) {
                        int iM482026 = c21113.m48206(8);
                        int iM482027 = c21113.m48206(8);
                        c21113.m48202(8);
                        iM4561 = C1259.m4561(iM482026);
                        iM4559 = C1259.m4559(iM482027);
                    }
                    if (c21113.m48203()) {
                        c21113.m48205();
                        c21113.m48205();
                    }
                    i15 = i9;
                    if (c21113.m48203()) {
                        c21113.m48202(65);
                    }
                    zM48204 = c21113.m48203();
                    if (zM48204) {
                        m34832(c21113);
                    }
                    zM48205 = c21113.m48203();
                    if (zM48205) {
                        m34832(c21113);
                    }
                    if (zM48204 || zM48205) {
                        c21113.m48204();
                    }
                    c21113.m48204();
                    if (c21113.m48203()) {
                        c21113.m48204();
                        c21113.m48205();
                        c21113.m48205();
                        c21113.m48205();
                        c21113.m48205();
                        iM48207 = c21113.m48205();
                        c21113.m48205();
                    } else {
                        iM48207 = i15;
                    }
                    i10 = iM48207;
                    i12 = i14;
                    i11 = iM4561;
                    f2 = f;
                    i13 = iM4559;
                } else {
                    i14 = -1;
                }
                iM4559 = -1;
                if (c21113.m48203()) {
                    c21113.m48205();
                    c21113.m48205();
                }
                i15 = i9;
                if (c21113.m48203()) {
                    c21113.m48202(65);
                }
                zM48204 = c21113.m48203();
                if (zM48204) {
                    m34832(c21113);
                }
                zM48205 = c21113.m48203();
                if (zM48205) {
                    m34832(c21113);
                }
                if (zM48204) {
                    c21113.m48204();
                } else {
                    c21113.m48204();
                }
                c21113.m48204();
                if (c21113.m48203()) {
                    c21113.m48204();
                    c21113.m48205();
                    c21113.m48205();
                    c21113.m48205();
                    c21113.m48205();
                    iM48207 = c21113.m48205();
                    c21113.m48205();
                } else {
                    iM48207 = i15;
                }
                i10 = iM48207;
                i12 = i14;
                i11 = iM4561;
                f2 = f;
                i13 = iM4559;
            } else {
                i10 = i9;
                f2 = 1.0f;
                i11 = -1;
                i12 = -1;
                i13 = -1;
            }
            return new C3959(iM482011, iM482012, iM482013, iM482014, i26, i27, f2, i3, i4, z, zM48203, iM482018, iM482019, i5, z2, i11, i12, i13, i10);
        }
        iM48206 = c21113.m48205() + 4;
        i5 = iM48206;
        z2 = false;
        c21113.m48205();
        c21113.m48204();
        int iM482028 = c21113.m48205() + 1;
        int iM482029 = c21113.m48205() + 1;
        zM48203 = c21113.m48203();
        i6 = 2 - (zM48203 ? 1 : 0);
        int i28 = iM482029 * i6;
        if (!zM48203) {
            c21113.m48204();
        }
        c21113.m48204();
        i7 = iM482028 * 16;
        i8 = i28 * 16;
        if (c21113.m48203()) {
            int iM4820210 = c21113.m48205();
            int iM4820211 = c21113.m48205();
            int iM4820212 = c21113.m48205();
            int iM4820213 = c21113.m48205();
            if (iM48205 == 0) {
                i18 = 1;
            } else {
                if (iM48205 == 3) {
                    i16 = 1;
                } else {
                    i16 = 2;
                }
                if (iM48205 == 1) {
                    i17 = 2;
                } else {
                    i17 = 1;
                }
                i6 *= i17;
                i18 = i16;
            }
            i7 -= (iM4820210 + iM4820211) * i18;
            i8 -= (iM4820212 + iM4820213) * i6;
        } else {
            iM482019 = iM482019;
        }
        int i29 = i7;
        int i210 = i8;
        if (iM482011 != 44) {
        }
        iM4561 = -1;
        f = 1.0f;
        if (c21113.m48203()) {
            if (c21113.m48203()) {
                iM48208 = c21113.m48206(8);
                if (iM48208 == 255) {
                    iM48209 = c21113.m48206(16);
                    iM482010 = c21113.m48206(16);
                    if (iM48209 != 0) {
                        f = iM48209 / iM482010;
                    }
                } else if (iM48208 < 17) {
                    f = f45376[iM48208];
                } else {
                    j$$ExternalSyntheticOutline0.m(iM48208, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (c21113.m48203()) {
                c21113.m48204();
            }
            if (c21113.m48203()) {
                c21113.m48202(3);
                if (c21113.m48203()) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (c21113.m48203()) {
                    int iM4820214 = c21113.m48206(8);
                    int iM4820215 = c21113.m48206(8);
                    c21113.m48202(8);
                    iM4561 = C1259.m4561(iM4820214);
                    iM4559 = C1259.m4559(iM4820215);
                }
                if (c21113.m48203()) {
                    c21113.m48205();
                    c21113.m48205();
                }
                i15 = i9;
                if (c21113.m48203()) {
                    c21113.m48202(65);
                }
                zM48204 = c21113.m48203();
                if (zM48204) {
                    m34832(c21113);
                }
                zM48205 = c21113.m48203();
                if (zM48205) {
                    m34832(c21113);
                }
                if (zM48204) {
                    c21113.m48204();
                } else {
                    c21113.m48204();
                }
                c21113.m48204();
                if (c21113.m48203()) {
                    c21113.m48204();
                    c21113.m48205();
                    c21113.m48205();
                    c21113.m48205();
                    c21113.m48205();
                    iM48207 = c21113.m48205();
                    c21113.m48205();
                } else {
                    iM48207 = i15;
                }
                i10 = iM48207;
                i12 = i14;
                i11 = iM4561;
                f2 = f;
                i13 = iM4559;
            } else {
                i14 = -1;
            }
            iM4559 = -1;
            if (c21113.m48203()) {
                c21113.m48205();
                c21113.m48205();
            }
            i15 = i9;
            if (c21113.m48203()) {
                c21113.m48202(65);
            }
            zM48204 = c21113.m48203();
            if (zM48204) {
                m34832(c21113);
            }
            zM48205 = c21113.m48203();
            if (zM48205) {
                m34832(c21113);
            }
            if (zM48204) {
                c21113.m48204();
            } else {
                c21113.m48204();
            }
            c21113.m48204();
            if (c21113.m48203()) {
                c21113.m48204();
                c21113.m48205();
                c21113.m48205();
                c21113.m48205();
                c21113.m48205();
                iM48207 = c21113.m48205();
                c21113.m48205();
            } else {
                iM48207 = i15;
            }
            i10 = iM48207;
            i12 = i14;
            i11 = iM4561;
            f2 = f;
            i13 = iM4559;
        } else {
            i10 = i9;
            f2 = 1.0f;
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new C3959(iM482011, iM482012, iM482013, iM482014, i29, i210, f2, i3, i4, z, zM48203, iM482018, iM482019, i5, z2, i11, i12, i13, i10);
    }

    /* JADX WARN: Code duplicated, block: B:309:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:312:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:468:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6197 m34831(int i, int i2, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        int i3;
        C12162 c12162;
        boolean zM48203;
        int iM48206;
        int i4;
        int iM48207;
        int i5;
        boolean[][] zArr;
        int i6;
        int i7;
        boolean[][] zArr2;
        int i8;
        int[] iArr3;
        boolean z;
        int[] iArr4;
        boolean zM48204;
        int i9;
        int i10;
        int i11;
        boolean zM48205;
        boolean zM48206;
        int iM48205;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        C21113 c21113 = new C21113(bArr, i, i2);
        m34825(c21113);
        c21113.m48202(4);
        boolean zM48207 = c21113.m48203();
        boolean zM48208 = c21113.m48203();
        int iM48208 = c21113.m48206(6);
        int i15 = iM48208 + 1;
        int iM48209 = c21113.m48206(3);
        c21113.m48202(17);
        C24843 c24843M34827 = m34827(c21113, true, iM48209, (C24843) null);
        for (int i16 = c21113.m48203() ? 0 : iM48209; i16 <= iM48209; i16++) {
            c21113.m48205();
            c21113.m48205();
            c21113.m48205();
        }
        int iM482010 = c21113.m48206(6);
        int iM482011 = c21113.m48205() + 1;
        C16637 c16637 = new C16637(AbstractC1928.of((Object) c24843M34827), new int[1]);
        boolean z4 = i15 >= 2 && iM482011 >= 2;
        boolean z5 = zM48207 && zM48208;
        int i17 = iM482010 + 1;
        boolean z6 = i17 >= i15;
        if (!z4 || !z5 || !z6) {
            return new C6197(null, c16637, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iM482011, i17);
        int[] iArr6 = new int[iM482011];
        int[] iArr7 = new int[iM482011];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i18 = 1; i18 < iM482011; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iM482010; i20++) {
                if (c21113.m48203()) {
                    iArr5[i18][i19] = i20;
                    iArr7[i18] = i20;
                    i19++;
                }
                iArr6[i18] = i19;
            }
        }
        if (c21113.m48203()) {
            c21113.m48202(64);
            if (c21113.m48203()) {
                c21113.m48205();
            }
            int iM482012 = c21113.m48205();
            for (int i21 = 0; i21 < iM482012; i21++) {
                c21113.m48205();
                if (i21 == 0 || c21113.m48203()) {
                    boolean zM48209 = c21113.m48203();
                    boolean zM482010 = c21113.m48203();
                    z3 = zM48209;
                    z2 = zM482010;
                    if (zM48209 || zM482010) {
                        zM48204 = c21113.m48203();
                        if (zM48204) {
                            c21113.m48202(19);
                        }
                        c21113.m48202(8);
                        if (zM48204) {
                            c21113.m48202(4);
                        }
                        c21113.m48202(15);
                        i10 = zM48209;
                        i9 = zM482010;
                    }
                    i11 = 0;
                    while (i11 <= iM48209) {
                        zM48205 = c21113.m48203();
                        if (!zM48205) {
                            zM48205 = c21113.m48203();
                        }
                        if (zM48205) {
                            c21113.m48205();
                            zM48206 = false;
                        } else {
                            zM48206 = c21113.m48203();
                        }
                        if (zM48206) {
                            iM48205 = 0;
                        } else {
                            iM48205 = c21113.m48205();
                        }
                        int[] iArr8 = iArr7;
                        i12 = i10 + i9;
                        int[][] iArr9 = iArr5;
                        i13 = 0;
                        while (i13 < i12) {
                            int i22 = i12;
                            for (i14 = 0; i14 <= iM48205; i14++) {
                                c21113.m48205();
                                c21113.m48205();
                                if (zM48204) {
                                    c21113.m48205();
                                    c21113.m48205();
                                }
                                c21113.m48204();
                            }
                            i13++;
                            i12 = i22;
                        }
                        i11++;
                        iM482012 = iM482012;
                        iArr7 = iArr8;
                        iArr5 = iArr9;
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                zM48204 = false;
                i10 = z3;
                i9 = z2;
                i11 = 0;
                while (i11 <= iM48209) {
                    zM48205 = c21113.m48203();
                    if (!zM48205) {
                        zM48205 = c21113.m48203();
                    }
                    if (zM48205) {
                        c21113.m48205();
                        zM48206 = false;
                    } else {
                        zM48206 = c21113.m48203();
                    }
                    if (zM48206) {
                        iM48205 = c21113.m48205();
                    } else {
                        iM48205 = 0;
                    }
                    int[] iArr10 = iArr7;
                    i12 = i10 + i9;
                    int[][] iArr11 = iArr5;
                    i13 = 0;
                    while (i13 < i12) {
                        int i23 = i12;
                        while (i14 <= iM48205) {
                            c21113.m48205();
                            c21113.m48205();
                            if (zM48204) {
                                c21113.m48205();
                                c21113.m48205();
                            }
                            c21113.m48204();
                        }
                        i13++;
                        i12 = i23;
                    }
                    i11++;
                    iM482012 = iM482012;
                    iArr7 = iArr10;
                    iArr5 = iArr11;
                }
            }
        }
        int[][] iArr12 = iArr5;
        int[] iArr13 = iArr7;
        if (!c21113.m48203()) {
            return new C6197(null, c16637, null, null);
        }
        c21113.m48199();
        C24843 c24843M34828 = m34827(c21113, false, iM48209, c24843M34827);
        boolean zM482011 = c21113.m48203();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zM482012 = c21113.m48203();
            zArr3[i25] = zM482012;
            if (zM482012) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new C6197(null, c16637, null, null);
        }
        int[] iArr14 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zM482011 ? 1 : 0); i26++) {
            iArr14[i26] = c21113.m48206(3);
        }
        int[] iArr15 = new int[i24 + 1];
        if (zM482011) {
            int i27 = 1;
            while (i27 < i24) {
                int[] iArr16 = iArr6;
                for (int i28 = 0; i28 < i27; i28++) {
                    iArr15[i27] = iArr14[i28] + 1 + iArr15[i27];
                }
                i27++;
                iArr6 = iArr16;
            }
            iArr = iArr6;
            iArr15[i24] = 6;
        } else {
            iArr = iArr6;
        }
        int[][] iArr17 = (int[][]) Array.newInstance((Class<?>) cls, i15, i24);
        int[] iArr18 = new int[i15];
        iArr18[0] = 0;
        boolean zM482013 = c21113.m48203();
        int i29 = 1;
        while (i29 < i15) {
            if (zM482013) {
                iArr18[i29] = c21113.m48206(6);
            } else {
                iArr18[i29] = i29;
            }
            if (zM482011) {
                iArr4 = iArr14;
                int i30 = 0;
                while (i30 < i24) {
                    int i31 = i30 + 1;
                    iArr17[i29][i30] = (iArr18[i29] & ((1 << iArr15[i31]) - 1)) >> iArr15[i30];
                    i30 = i31;
                }
            } else {
                int i32 = 0;
                while (i32 < i24) {
                    iArr17[i29][i32] = c21113.m48206(iArr14[i32] + 1);
                    i32++;
                    iArr14 = iArr14;
                }
                iArr4 = iArr14;
            }
            i29++;
            zM482013 = zM482013;
            iArr14 = iArr4;
        }
        int[] iArr19 = new int[i17];
        int i33 = 1;
        for (int i34 = 0; i34 < i15; i34++) {
            iArr19[iArr18[i34]] = -1;
            int i35 = 0;
            for (int i36 = 0; i36 < 16; i36++) {
                if (zArr3[i36]) {
                    if (i36 == 1) {
                        iArr19[iArr18[i34]] = iArr17[i34][i35];
                    }
                    i35++;
                }
            }
            if (i34 > 0) {
                int i37 = 0;
                while (true) {
                    if (i37 >= i34) {
                        z = true;
                        break;
                    }
                    if (iArr19[iArr18[i34]] == iArr19[iArr18[i37]]) {
                        z = false;
                        break;
                    }
                    i37++;
                }
                if (z) {
                    i33++;
                }
            }
        }
        int iM482013 = c21113.m48206(4);
        if (i33 < 2 || iM482013 == 0) {
            return new C6197(null, c16637, null, null);
        }
        int[] iArr20 = new int[i33];
        for (int i38 = 0; i38 < i33; i38++) {
            iArr20[i38] = c21113.m48206(iM482013);
        }
        int[] iArr21 = new int[i17];
        for (int i39 = 0; i39 < i15; i39++) {
            iArr21[Math.min(iArr18[i39], iM482010)] = i39;
        }
        C22811 c22811 = new C22811();
        int i40 = 0;
        while (i40 <= iM482010) {
            int iMin = Math.min(iArr19[i40], i33 - 1);
            c22811.m19807(new C1722(iArr21[i40], iMin >= 0 ? iArr20[iMin] : -1));
            i40++;
            iArr19 = iArr19;
        }
        AbstractC1928 abstractC1928M51441 = c22811.m51441();
        if (((C1722) abstractC1928M51441.get(0)).f5877 == -1) {
            return new C6197(null, c16637, null, null);
        }
        int i41 = 1;
        while (true) {
            if (i41 > iM482010) {
                i41 = -1;
                break;
            }
            if (((C1722) abstractC1928M51441.get(i41)).f5877 != -1) {
                break;
            }
            i41++;
        }
        if (i41 == -1) {
            return new C6197(null, c16637, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        for (int i42 = 1; i42 < i15; i42++) {
            for (int i43 = 0; i43 < i42; i43++) {
                boolean[] zArr6 = zArr4[i42];
                boolean[] zArr7 = zArr5[i42];
                boolean zM482014 = c21113.m48203();
                zArr7[i43] = zM482014;
                zArr6[i43] = zM482014;
            }
        }
        for (int i44 = 1; i44 < i15; i44++) {
            for (int i45 = 0; i45 < iM48208; i45++) {
                for (int i46 = 0; i46 < i44; i46++) {
                    boolean[] zArr8 = zArr5[i44];
                    if (zArr8[i46] && zArr5[i46][i45]) {
                        zArr8[i45] = true;
                        break;
                    }
                }
            }
        }
        int[] iArr22 = new int[i17];
        for (int i47 = 0; i47 < i15; i47++) {
            int i48 = 0;
            for (int i49 = 0; i49 < i47; i49++) {
                i48 += zArr4[i47][i49] ? 1 : 0;
            }
            iArr22[iArr18[i47]] = i48;
        }
        int i50 = 0;
        for (int i51 = 0; i51 < i15; i51++) {
            if (iArr22[iArr18[i51]] == 0) {
                i50++;
            }
        }
        if (i50 > 1) {
            return new C6197(null, c16637, null, null);
        }
        int[] iArr23 = new int[i15];
        int[] iArr24 = new int[iM482011];
        if (c21113.m48203()) {
            int i52 = 0;
            while (true) {
                iArr2 = iArr18;
                if (i52 >= i15) {
                    break;
                }
                iArr23[i52] = c21113.m48206(3);
                i52++;
                iArr18 = iArr2;
            }
            i3 = iM48209;
        } else {
            iArr2 = iArr18;
            i3 = iM48209;
            Arrays.fill(iArr23, 0, i15, i3);
        }
        int i53 = 0;
        while (i53 < iM482011) {
            boolean[][] zArr9 = zArr5;
            int i54 = i41;
            int[] iArr25 = iArr22;
            int iMax = 0;
            for (int i55 = 0; i55 < iArr[i53]; i55++) {
                iMax = Math.max(iMax, iArr23[((C1722) abstractC1928M51441.get(iArr12[i53][i55])).f5876]);
            }
            iArr24[i53] = iMax + 1;
            i53++;
            zArr5 = zArr9;
            i41 = i54;
            iArr22 = iArr25;
        }
        boolean[][] zArr10 = zArr5;
        int i56 = i41;
        int[] iArr26 = iArr22;
        if (c21113.m48203()) {
            int i57 = 0;
            while (i57 < iM48208) {
                int i58 = i57 + 1;
                for (int i59 = i58; i59 < i15; i59++) {
                    if (zArr4[i59][i57]) {
                        c21113.m48202(3);
                    }
                }
                i57 = i58;
            }
        }
        c21113.m48204();
        int iM482014 = c21113.m48205() + 1;
        C22811 c22812 = new C22811();
        c22812.m19807(c24843M34827);
        if (iM482014 > 1) {
            C24843 c24843M34829 = c24843M34828;
            c22812.m19807(c24843M34829);
            for (int i60 = 2; i60 < iM482014; i60++) {
                c24843M34829 = m34827(c21113, c21113.m48203(), i3, c24843M34829);
                c22812.m19807(c24843M34829);
            }
        }
        AbstractC1928 abstractC1928M51442 = c22812.m51441();
        int iM482015 = c21113.m48205() + iM482011;
        if (iM482015 > iM482011) {
            return new C6197(null, c16637, null, null);
        }
        int iM482016 = c21113.m48206(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM482015, i17);
        int[] iArr27 = new int[iM482015];
        int[] iArr28 = new int[iM482015];
        int i61 = 0;
        int i62 = 0;
        while (i61 < iM482011) {
            iArr27[i61] = i62;
            iArr28[i61] = iArr13[i61];
            if (iM482016 == 0) {
                i8 = iM482011;
                zArr2 = zArr4;
                iArr3 = iArr24;
                i7 = i15;
                Arrays.fill(zArr11[i61], 0, iArr[i61], true);
                iArr27[i61] = iArr[i61];
            } else {
                i7 = i15;
                zArr2 = zArr4;
                i8 = iM482011;
                iArr3 = iArr24;
                if (iM482016 == 1) {
                    int i63 = iArr13[i61];
                    for (int i64 = 0; i64 < iArr[i61]; i64++) {
                        zArr11[i61][i64] = iArr12[i61][i64] == i63;
                    }
                    iArr27[i61] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr27[0] = 1;
                }
                i62 = 0;
                i61++;
                iM482011 = i8;
                zArr4 = zArr2;
                iArr24 = iArr3;
                i15 = i7;
            }
            i62 = 0;
            i61++;
            iM482011 = i8;
            zArr4 = zArr2;
            iArr24 = iArr3;
            i15 = i7;
        }
        int i65 = i15;
        boolean[][] zArr12 = zArr4;
        int i66 = iM482011;
        int[] iArr29 = iArr24;
        int i67 = 1;
        int[] iArr30 = new int[i17];
        int i68 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i17;
        iArr31[i62] = iM482015;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr31);
        int i69 = 0;
        while (i67 < iM482015) {
            if (iM482016 == i68) {
                for (int i70 = 0; i70 < iArr[i67]; i70++) {
                    zArr11[i67][i70] = c21113.m48203();
                    int i71 = iArr27[i67];
                    boolean z7 = zArr11[i67][i70];
                    iArr27[i67] = i71 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr28[i67] = iArr12[i67][i70];
                    }
                }
            }
            if (i69 == 0 && iArr12[i67][0] == 0 && zArr11[i67][0]) {
                int i72 = 1;
                while (i72 < iArr[i67]) {
                    int i73 = i56;
                    if (iArr12[i67][i72] == i73 && zArr11[i67][i73]) {
                        i69 = i67;
                    }
                    i72++;
                    i56 = i73;
                }
            }
            int i74 = i56;
            int i75 = 0;
            while (i75 < iArr[i67]) {
                if (iM482014 > 1) {
                    zArr13[i67][i75] = zArr11[i67][i75];
                    zArr = zArr11;
                    int i76 = iM482016;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM39928 = C16952.m39928(iM482014);
                    if (zArr13[i67][i75]) {
                        i5 = iM482014;
                    } else {
                        int i77 = ((C1722) abstractC1928M51441.get(iArr12[i67][i75])).f5876;
                        i5 = iM482014;
                        int i78 = 0;
                        while (true) {
                            if (i78 < i75) {
                                i6 = i76;
                                if (zArr10[i77][((C1722) abstractC1928M51441.get(iArr12[i67][i78])).f5876]) {
                                    zArr13[i67][i75] = true;
                                    break;
                                }
                                i78++;
                                i76 = i6;
                            }
                        }
                        if (!zArr13[i67][i75]) {
                            if (i69 <= 0 && i67 == i69) {
                                iArr30[i75] = c21113.m48206(iM39928);
                            } else {
                                c21113.m48202(iM39928);
                            }
                        }
                    }
                    i6 = i76;
                    if (!zArr13[i67][i75]) {
                        if (i69 <= 0) {
                            c21113.m48202(iM39928);
                        } else {
                            c21113.m48202(iM39928);
                        }
                    }
                } else {
                    i5 = iM482014;
                    zArr = zArr11;
                    i6 = iM482016;
                }
                i75++;
                zArr11 = zArr;
                iM482014 = i5;
                iM482016 = i6;
            }
            int i79 = iM482014;
            boolean[][] zArr14 = zArr11;
            int i80 = iM482016;
            if (iArr27[i67] == 1 && iArr26[iArr28[i67]] > 0) {
                c21113.m48204();
            }
            i67++;
            i68 = 2;
            zArr11 = zArr14;
            iM482014 = i79;
            iM482016 = i80;
            i56 = i74;
        }
        if (i69 == 0) {
            return new C6197(null, c16637, null, null);
        }
        int iM482017 = c21113.m48205();
        int i81 = iM482017 + 1;
        C22811 c22811M6616 = AbstractC1928.m6616(i81);
        int[] iArr32 = new int[i65];
        int i82 = 0;
        while (i82 < i81) {
            int iM482018 = c21113.m48206(16);
            int iM482019 = c21113.m48206(16);
            if (c21113.m48203()) {
                iM48206 = c21113.m48206(2);
                if (iM48206 == 3) {
                    c21113.m48204();
                }
                int iM482020 = c21113.m48206(4);
                iM48207 = c21113.m48206(4);
                i4 = iM482020;
            } else {
                iM48206 = 0;
                i4 = 0;
                iM48207 = 0;
            }
            if (c21113.m48203()) {
                int iM482021 = c21113.m48205();
                int iM482022 = c21113.m48205();
                int iM482023 = c21113.m48205();
                int iM482024 = c21113.m48205();
                iM482018 -= (iM482021 + iM482022) * ((iM48206 == 1 || iM48206 == 2) ? 2 : 1);
                iM482019 -= (iM482023 + iM482024) * (iM48206 == 1 ? 2 : 1);
            }
            c22811M6616.m19807(new C17383(iM48206, i4, iM48207, iM482018, iM482019));
            i82++;
            abstractC1928M51441 = abstractC1928M51441;
        }
        AbstractC1928 abstractC1928 = abstractC1928M51441;
        if (i81 <= 1 || !c21113.m48203()) {
            for (int i83 = 1; i83 < i65; i83++) {
                iArr32[i83] = Math.min(i83, iM482017);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM39929 = C16952.m39928(i81);
            for (int i84 = 1; i84 < i65; i84++) {
                iArr32[i84] = c21113.m48206(iM39929);
            }
        }
        C15891 c15891 = new C15891(c22811M6616.m51441(), iArr32);
        c21113.m48202(2);
        for (int i85 = 1; i85 < i65; i85++) {
            if (iArr26[iArr2[i85]] == 0) {
                c21113.m48204();
            }
        }
        for (int i86 = 1; i86 < iM482015; i86++) {
            boolean zM482015 = c21113.m48203();
            int i87 = 0;
            while (i87 < iArr29[i86]) {
                if (i87 <= 0 || !zM482015) {
                    zM48203 = i87 == 0;
                } else {
                    zM48203 = c21113.m48203();
                }
                if (zM48203) {
                    for (int i88 = 0; i88 < iArr[i86]; i88++) {
                        if (zArr13[i86][i88]) {
                            c21113.m48205();
                        }
                    }
                    c21113.m48205();
                    c21113.m48205();
                }
                i87++;
            }
        }
        int iM482025 = c21113.m48205() + 2;
        if (c21113.m48203()) {
            c21113.m48202(iM482025);
        } else {
            for (int i89 = 1; i89 < i65; i89++) {
                for (int i90 = 0; i90 < i89; i90++) {
                    if (zArr12[i89][i90]) {
                        c21113.m48202(iM482025);
                    }
                }
            }
        }
        int iM482026 = c21113.m48205();
        for (int i91 = 1; i91 <= iM482026; i91++) {
            c21113.m48202(8);
        }
        if (c21113.m48203()) {
            c21113.m48199();
            if (!c21113.m48203() ? c21113.m48203() : true) {
                c21113.m48204();
            }
            boolean zM482016 = c21113.m48203();
            boolean zM482017 = c21113.m48203();
            if (zM482016 || zM482017) {
                for (int i92 = 0; i92 < i66; i92++) {
                    for (int i93 = 0; i93 < iArr29[i92]; i93++) {
                        boolean zM482018 = zM482016 ? c21113.m48203() : false;
                        boolean zM482019 = zM482017 ? c21113.m48203() : false;
                        if (zM482018) {
                            c21113.m48202(32);
                        }
                        if (zM482019) {
                            c21113.m48202(18);
                        }
                    }
                }
            }
            boolean zM482020 = c21113.m48203();
            int iM482027 = zM482020 ? c21113.m48206(4) + 1 : i65;
            C22811 c22811M6617 = AbstractC1928.m6616(iM482027);
            int[] iArr33 = new int[i65];
            for (int i94 = 0; i94 < iM482027; i94++) {
                c21113.m48202(3);
                int i95 = c21113.m48203() ? 1 : 2;
                int iM4561 = C1259.m4561(c21113.m48206(8));
                int iM4559 = C1259.m4559(c21113.m48206(8));
                c21113.m48202(8);
                c22811M6617.m19807(new C20367(iM4561, i95, iM4559));
            }
            if (zM482020 && iM482027 > 1) {
                for (int i96 = 0; i96 < i65; i96++) {
                    iArr33[i96] = c21113.m48206(4);
                }
            }
            c12162 = new C12162(c22811M6617.m51441(), iArr33);
        } else {
            c12162 = null;
        }
        return new C6197(abstractC1928, new C16637(abstractC1928M51442, iArr30), c15891, c12162);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11416 m34825(C21113 c21113) {
        c21113.m48204();
        return new C11416(c21113.m48206(6), c21113.m48206(6), c21113.m48206(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:204:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3213 m34824(byte[] bArr, int i, int i2, C6197 c6197) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM48205;
        int i9;
        int iM48206;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM4559;
        int iM4561;
        int i14;
        C12162 c12162;
        int i15;
        C15891 c15891;
        C11416 c11416M34825 = m34825(new C21113(bArr, i, i2));
        C21113 c21113 = new C21113(bArr, i + 2, i2);
        c21113.m48202(4);
        int iM48207 = c21113.m48206(3);
        int i16 = c11416M34825.f35894;
        boolean z = i16 != 0 && iM48207 == 7;
        if (c6197 != null) {
            AbstractC1928 abstractC1928 = c6197.f21095;
            if (abstractC1928.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((C1722) abstractC1928.get(Math.min(i16, abstractC1928.size() - 1))).f5876;
            }
        } else {
            i3 = 0;
        }
        C24843 c24843M34827 = null;
        if (!z) {
            c21113.m48204();
            c24843M34827 = m34827(c21113, true, iM48207, (C24843) null);
        } else if (c6197 != null) {
            C16637 c16637 = c6197.f21097;
            int[] iArr = c16637.f53779;
            AbstractC1928 abstractC1929 = c16637.f53780;
            int i17 = iArr[i3];
            if (abstractC1929.size() > i17) {
                c24843M34827 = (C24843) abstractC1929.get(i17);
            }
        }
        c21113.m48205();
        if (z) {
            int iM48208 = c21113.m48203() ? c21113.m48206(8) : -1;
            if (c6197 == null || (c15891 = c6197.f21096) == null) {
                i8 = 0;
                iM48205 = 0;
                iM48206 = 0;
                i7 = 0;
                i9 = 0;
                i6 = 0;
            } else {
                AbstractC1928 abstractC19210 = c15891.f51652;
                if (iM48208 == -1) {
                    iM48208 = c15891.f51651[i3];
                }
                if (iM48208 == -1 || abstractC19210.size() <= iM48208) {
                    i8 = 0;
                    iM48205 = 0;
                    iM48206 = 0;
                    i7 = 0;
                    i9 = 0;
                    i6 = 0;
                } else {
                    C17383 c17383 = (C17383) abstractC19210.get(iM48208);
                    int i18 = c17383.f56527;
                    int i19 = c17383.f56528;
                    int i20 = c17383.f56530;
                    int i21 = c17383.f56529;
                    i9 = i19;
                    i8 = i20;
                    i6 = i8;
                    iM48206 = c17383.f56526;
                    iM48205 = i21;
                    i7 = i9;
                }
            }
        } else {
            int iM48209 = c21113.m48205();
            if (iM48209 == 3) {
                c21113.m48204();
            }
            int iM482010 = c21113.m48205();
            int iM482011 = c21113.m48205();
            if (c21113.m48203()) {
                int iM482012 = c21113.m48205();
                int iM482013 = c21113.m48205();
                int iM482014 = c21113.m48205();
                int iM482015 = c21113.m48205();
                i4 = iM482010 - ((iM482012 + iM482013) * ((iM48209 == 1 || iM48209 == 2) ? 2 : 1));
                i5 = iM482011 - ((iM482014 + iM482015) * (iM48209 == 1 ? 2 : 1));
            } else {
                i4 = iM482010;
                i5 = iM482011;
            }
            i6 = iM482011;
            i7 = i4;
            i8 = i5;
            iM48205 = c21113.m48205();
            i9 = iM482010;
            iM48206 = c21113.m48205();
        }
        int iM482016 = c21113.m48205();
        if (z) {
            i10 = -1;
        } else {
            int iMax = -1;
            for (int i22 = c21113.m48203() ? 0 : iM48207; i22 <= iM48207; i22++) {
                c21113.m48205();
                iMax = Math.max(c21113.m48205(), iMax);
                c21113.m48205();
            }
            i10 = iMax;
        }
        c21113.m48205();
        c21113.m48205();
        c21113.m48205();
        c21113.m48205();
        c21113.m48205();
        c21113.m48205();
        if (c21113.m48203()) {
            if (z ? c21113.m48203() : false) {
                c21113.m48202(6);
            } else if (c21113.m48203()) {
                int i23 = 0;
                int i24 = 4;
                int i25 = 6;
                while (i23 < i24) {
                    int i26 = 0;
                    while (i26 < i25) {
                        if (c21113.m48203()) {
                            int iMin = Math.min(64, 1 << ((i23 << 1) + 4));
                            if (i23 > 1) {
                                c21113.m48208();
                            }
                            for (int i27 = 0; i27 < iMin; i27++) {
                                c21113.m48208();
                            }
                            i15 = 3;
                        } else {
                            c21113.m48205();
                            i15 = 3;
                        }
                        i26 += i23 == i15 ? 3 : 1;
                        i25 = 6;
                        i6 = i6;
                    }
                    i23++;
                    i24 = 4;
                    i25 = 6;
                    i6 = i6;
                }
            }
        }
        int i28 = i6;
        c21113.m48202(2);
        if (c21113.m48203()) {
            c21113.m48202(8);
            c21113.m48205();
            c21113.m48205();
            c21113.m48204();
        }
        int iM482017 = c21113.m48205();
        int i29 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i30 = -1;
        int i31 = i9;
        int i32 = -1;
        while (i29 < iM482017) {
            if (i29 == 0 || !c21113.m48203()) {
                int iM482018 = c21113.m48205();
                int iM482019 = c21113.m48205();
                int[] iArr3 = new int[iM482018];
                int i33 = 0;
                while (i33 < iM482018) {
                    iArr3[i33] = (i33 > 0 ? iArr3[i33 - 1] : 0) - (c21113.m48205() + 1);
                    c21113.m48204();
                    i33++;
                }
                int[] iArr4 = new int[iM482019];
                int i34 = 0;
                while (i34 < iM482019) {
                    iArr4[i34] = c21113.m48205() + 1 + (i34 > 0 ? iArr4[i34 - 1] : 0);
                    c21113.m48204();
                    i34++;
                }
                i30 = iM482018;
                i32 = iM482019;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i35 = i30 + i32;
                int iM55770 = C24966.m55770(c21113.m48203() ? 1 : 0, 2, 1, c21113.m48205() + 1);
                int i36 = i35 + 1;
                boolean[] zArr = new boolean[i36];
                for (int i37 = 0; i37 <= i35; i37++) {
                    if (c21113.m48203()) {
                        zArr[i37] = true;
                    } else {
                        zArr[i37] = c21113.m48203();
                    }
                }
                int[] iArr5 = new int[i36];
                int[] iArr6 = new int[i36];
                int i38 = 0;
                for (int i39 = i32 - 1; i39 >= 0; i39--) {
                    int i40 = iArrCopyOf[i39] + iM55770;
                    if (i40 < 0 && zArr[i30 + i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                if (iM55770 < 0 && zArr[i35]) {
                    iArr5[i38] = iM55770;
                    i38++;
                }
                int i41 = i38;
                for (int i42 = 0; i42 < i30; i42++) {
                    int i43 = iArr2[i42] + iM55770;
                    if (i43 < 0 && zArr[i42]) {
                        iArr5[i41] = i43;
                        i41++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i41);
                int i44 = 0;
                for (int i45 = i30 - 1; i45 >= 0; i45--) {
                    int i46 = iArr2[i45] + iM55770;
                    if (i46 > 0 && zArr[i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                if (iM55770 > 0 && zArr[i35]) {
                    iArr6[i44] = iM55770;
                    i44++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < i32; i48++) {
                    int i49 = iArrCopyOf[i48] + iM55770;
                    if (i49 > 0 && zArr[i30 + i48]) {
                        iArr6[i47] = i49;
                        i47++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i47);
                i32 = i47;
                iArr2 = iArrCopyOf2;
                i30 = i41;
            }
            i29++;
            iM482017 = iM482017;
            i7 = i7;
            iM48205 = iM48205;
            iM48206 = iM48206;
            c24843M34827 = c24843M34827;
            i8 = i8;
            iM48207 = iM48207;
        }
        int i50 = iM48207;
        C24843 c24843 = c24843M34827;
        int i51 = iM48205;
        int i52 = iM48206;
        int i53 = i7;
        int i54 = i8;
        if (c21113.m48203()) {
            int iM482020 = c21113.m48205();
            for (int i55 = 0; i55 < iM482020; i55++) {
                c21113.m48202(iM482016 + 5);
            }
        }
        c21113.m48202(2);
        float f = 1.0f;
        if (c21113.m48203()) {
            if (c21113.m48203()) {
                int iM482021 = c21113.m48206(8);
                if (iM482021 == 255) {
                    int iM482022 = c21113.m48206(16);
                    int iM482023 = c21113.m48206(16);
                    if (iM482022 != 0 && iM482023 != 0) {
                        f = iM482022 / iM482023;
                    }
                } else if (iM482021 < 17) {
                    f = f45376[iM482021];
                } else {
                    j$$ExternalSyntheticOutline0.m(iM482021, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (c21113.m48203()) {
                c21113.m48204();
            }
            if (c21113.m48203()) {
                c21113.m48202(3);
                i14 = c21113.m48203() ? 1 : 2;
                if (c21113.m48203()) {
                    int iM482024 = c21113.m48206(8);
                    int iM482025 = c21113.m48206(8);
                    c21113.m48202(8);
                    iM4561 = C1259.m4561(iM482024);
                    iM4559 = C1259.m4559(iM482025);
                } else {
                    iM4561 = -1;
                    iM4559 = -1;
                }
            } else if (c6197 == null || (c12162 = c6197.f21098) == null) {
                iM4561 = -1;
                iM4559 = -1;
                i14 = -1;
            } else {
                AbstractC1928 abstractC19211 = c12162.f39090;
                int i56 = c12162.f39089[i3];
                if (abstractC19211.size() > i56) {
                    C20367 c20367 = (C20367) abstractC19211.get(i56);
                    iM4561 = c20367.f65321;
                    int i57 = c20367.f65319;
                    iM4559 = c20367.f65320;
                    i14 = i57;
                } else {
                    iM4561 = -1;
                    iM4559 = -1;
                    i14 = -1;
                }
            }
            if (c21113.m48203()) {
                c21113.m48205();
                c21113.m48205();
            }
            c21113.m48204();
            i12 = c21113.m48203() ? i54 * 2 : i54;
            int i58 = iM4561;
            i13 = i14;
            i11 = i58;
        } else {
            i11 = -1;
            i12 = i54;
            f = 1.0f;
            i13 = -1;
            iM4559 = -1;
        }
        return new C3213(i50, c24843, i51, i52, i53, i12, i31, i28, f, i10, i11, i13, iM4559);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23351 m34826(int i, int i2, byte[] bArr) {
        byte b;
        int iMax;
        int iMax2;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b == 0 || i2 <= i3) {
            return null;
        }
        C21113 c21113 = new C21113(bArr, i3, i2 + 1);
        while (c21113.m48201(16)) {
            int iM48206 = c21113.m48206(8);
            int i4 = 0;
            while (iM48206 == 255) {
                i4 += 255;
                iM48206 = c21113.m48206(8);
            }
            int i5 = i4 + iM48206;
            int iM48207 = c21113.m48206(8);
            int i6 = 0;
            while (iM48207 == 255) {
                i6 += 255;
                iM48207 = c21113.m48206(8);
            }
            int i7 = i6 + iM48207;
            if (i7 == 0 || !c21113.m48201(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iM48205 = c21113.m48205();
                boolean zM48203 = c21113.m48203();
                int iM48208 = zM48203 ? c21113.m48205() : 0;
                int iM48209 = c21113.m48205();
                int iM482010 = -1;
                for (int i8 = 0; i8 <= iM48209; i8++) {
                    iM482010 = c21113.m48205();
                    c21113.m48205();
                    int iM482011 = c21113.m48206(6);
                    if (iM482011 == 63) {
                        return null;
                    }
                    if (iM482011 == 0) {
                        iMax = Math.max(0, iM48205 - 30);
                    } else {
                        iMax = Math.max(0, (iM482011 + iM48205) - 31);
                    }
                    c21113.m48206(iMax);
                    if (zM48203) {
                        int iM482012 = c21113.m48206(6);
                        if (iM482012 == 63) {
                            return null;
                        }
                        if (iM482012 == 0) {
                            iMax2 = Math.max(0, iM48208 - 30);
                        } else {
                            iMax2 = Math.max(0, (iM482012 + iM48208) - 31);
                        }
                        c21113.m48206(iMax2);
                    }
                    if (c21113.m48203()) {
                        c21113.m48202(10);
                    }
                }
                return new C23351(iM482010);
            }
            c21113.m48202(i7 * 8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34820(int i, int i2, byte[] bArr, boolean[] zArr) {
        int i3 = i2 - i;
        C20782.m47568(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m34828(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m34828(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m34828(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & UTF8.S_ERR) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m34828(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34828(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34823(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = AbstractC1928.f6477;
                C22811 c22811 = new C22811();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iM34820 = m34820(i3, bArr.length, bArr, zArr);
                    if (iM34820 != bArr.length) {
                        c22811.m19807(Integer.valueOf(iM34820));
                    }
                    i3 = iM34820 + 3;
                }
                AbstractC1928 abstractC1928M51441 = c22811.m51441();
                for (int i4 = 0; i4 < abstractC1928M51441.size(); i4++) {
                    if (((Integer) abstractC1928M51441.get(i4)).intValue() + 3 < length) {
                        C21113 c21113 = new C21113(bArr, ((Integer) abstractC1928M51441.get(i4)).intValue() + 3, length);
                        C11416 c11416M34825 = m34825(c21113);
                        if (c11416M34825.f35896 == 33 && c11416M34825.f35894 == 0) {
                            c21113.m48202(4);
                            int iM48206 = c21113.m48206(3);
                            c21113.m48204();
                            C24843 c24843M34827 = m34827(c21113, true, iM48206, (C24843) null);
                            return C21528.m48971(c24843M34827.f80339, c24843M34827.f80341, c24843M34827.f80337, c24843M34827.f80336, c24843M34827.f80338, c24843M34827.f80340);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24843 m34827(C21113 c21113, boolean z, int i, C24843 c24843) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean zM48203;
        int iM48206;
        int i5;
        int iM48207;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            iM48207 = c21113.m48206(2);
            zM48203 = c21113.m48203();
            iM48206 = c21113.m48206(5);
            i5 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (c21113.m48203()) {
                    i5 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = c21113.m48206(8);
            }
        } else {
            if (c24843 != null) {
                int i9 = c24843.f80339;
                zM48203 = c24843.f80338;
                iM48206 = c24843.f80341;
                i5 = c24843.f80337;
                iArr2 = c24843.f80336;
                iM48207 = i9;
            } else {
                iArr = iArr2;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                z2 = false;
            }
            int iM48208 = c21113.m48206(8);
            i6 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                if (c21113.m48203()) {
                    i6 += 88;
                }
                if (c21113.m48203()) {
                    i6 += 8;
                }
            }
            c21113.m48202(i6);
            if (i > 0) {
                c21113.m48202((8 - i) * 2);
            }
            return new C24843(i2, i3, i4, iArr, z2, iM48208);
        }
        i2 = iM48207;
        iArr = iArr2;
        z2 = zM48203;
        i3 = iM48206;
        i4 = i5;
        int iM48209 = c21113.m48206(8);
        i6 = 0;
        while (i10 < i) {
            if (c21113.m48203()) {
                i6 += 88;
            }
            if (c21113.m48203()) {
                i6 += 8;
            }
        }
        c21113.m48202(i6);
        if (i > 0) {
            c21113.m48202((8 - i) * 2);
        }
        return new C24843(i2, i3, i4, iArr, z2, iM48209);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m34832(C21113 c21113) {
        int iM48205 = c21113.m48205() + 1;
        c21113.m48202(8);
        for (int i = 0; i < iM48205; i++) {
            c21113.m48205();
            c21113.m48205();
            c21113.m48204();
        }
        c21113.m48202(20);
    }
}
