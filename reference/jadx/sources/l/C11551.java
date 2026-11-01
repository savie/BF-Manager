package l;

import com.umeng.analytics.pro.bo;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۨ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11551 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f38845 = {0, 0, 0, 1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final float[] f38843 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Object f38842 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int[] f38844 = new int[10];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28848(int i, byte[] bArr) {
        int i2;
        synchronized (f38842) {
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
                    int[] iArr = f38844;
                    if (iArr.length <= i4) {
                        f38844 = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f38844[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f38844[i7] - i6;
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
    public static int m28849(C7648 c7648) {
        if (C13638.equals(c7648.f25265, "video/avc")) {
            return 1;
        }
        return (C13638.equals(c7648.f25265, "video/hevc") || C6632.m17987(c7648.f25277, "video/hevc") != null) ? 2 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28856(byte[] bArr, int i, C7648 c7648) {
        int i2;
        if (C13638.equals(c7648.f25265, "video/avc")) {
            byte b = bArr[4];
            if (((b & UTF8.S_P4B) >> 5) == 0 && ((i2 = b & bo.j) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (C13638.equals(c7648.f25265, "video/hevc")) {
            C16573 c16573M28853 = m28853(new C2377(bArr, 4, i + 4));
            int i3 = c16573M28853.f53211;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && c16573M28853.f53210 == c7648.f25251 - 1) {
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C13668 m28857(int i, int i2, byte[] bArr) {
        int iM7231;
        boolean z;
        int i3;
        int i4;
        int iM7232;
        boolean z2;
        int i5;
        boolean zM7233;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM11700;
        float f;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM11703;
        int i15;
        boolean zM7234;
        boolean zM7235;
        int iM7233;
        int iM7234;
        int iM7235;
        int iM7236;
        int i16;
        int i17;
        int i18;
        C2377 c2377 = new C2377(bArr, i + 1, i2);
        int iM7237 = c2377.m7234(8);
        int iM7238 = c2377.m7234(8);
        int iM7239 = c2377.m7234(8);
        int iM72310 = c2377.m7231();
        if (iM7237 == 100 || iM7237 == 110 || iM7237 == 122 || iM7237 == 244 || iM7237 == 44 || iM7237 == 83 || iM7237 == 86 || iM7237 == 118 || iM7237 == 128 || iM7237 == 138) {
            iM7231 = c2377.m7231();
            boolean zM7236 = iM7231 == 3 ? c2377.m7233() : false;
            int iM72311 = c2377.m7231();
            int iM72312 = c2377.m7231();
            c2377.m7236();
            if (c2377.m7233()) {
                int i19 = iM7231 != 3 ? 8 : 12;
                int i20 = 0;
                while (i20 < i19) {
                    if (c2377.m7233()) {
                        int i21 = i20 < 6 ? 16 : 64;
                        int iM7227 = 8;
                        int i22 = 8;
                        for (int i23 = 0; i23 < i21; i23++) {
                            if (iM7227 != 0) {
                                iM7227 = ((c2377.m7227() + i22) + 256) % 256;
                            }
                            if (iM7227 != 0) {
                                i22 = iM7227;
                            }
                        }
                    }
                    i20++;
                }
            }
            z = zM7236;
            i3 = iM72311;
            i4 = iM72312;
        } else {
            i3 = 0;
            iM7231 = 1;
            i4 = 0;
            z = false;
        }
        int iM72313 = c2377.m7231() + 4;
        int iM72314 = c2377.m7231();
        if (iM72314 != 0) {
            if (iM72314 == 1) {
                boolean zM7237 = c2377.m7233();
                c2377.m7227();
                c2377.m7227();
                long jM7231 = c2377.m7231();
                i3 = i3;
                for (int i24 = 0; i24 < jM7231; i24++) {
                    c2377.m7231();
                }
                z2 = zM7237;
                i5 = 0;
            } else {
                iM7232 = 0;
            }
            c2377.m7231();
            c2377.m7236();
            int iM72315 = c2377.m7231() + 1;
            int iM72316 = c2377.m7231() + 1;
            zM7233 = c2377.m7233();
            i6 = 2 - (zM7233 ? 1 : 0);
            int i25 = iM72316 * i6;
            if (!zM7233) {
                c2377.m7236();
            }
            c2377.m7236();
            i7 = iM72315 * 16;
            i8 = i25 * 16;
            if (c2377.m7233()) {
                int iM72317 = c2377.m7231();
                int iM72318 = c2377.m7231();
                int iM72319 = c2377.m7231();
                int iM72320 = c2377.m7231();
                if (iM7231 == 0) {
                    i18 = 1;
                } else {
                    if (iM7231 == 3) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                    if (iM7231 == 1) {
                        i17 = 2;
                    } else {
                        i17 = 1;
                    }
                    i6 *= i17;
                    i18 = i16;
                }
                i7 -= (iM72317 + iM72318) * i18;
                i8 -= (iM72319 + iM72320) * i6;
            } else {
                iM72314 = iM72314;
            }
            int i26 = i7;
            int i27 = i8;
            i9 = ((iM7237 != 44 || iM7237 == 86 || iM7237 == 100 || iM7237 == 110 || iM7237 == 122 || iM7237 == 244) && (iM7238 & 16) != 0) ? 0 : 16;
            iM11700 = -1;
            f = 1.0f;
            if (c2377.m7233()) {
                if (c2377.m7233()) {
                    iM7234 = c2377.m7234(8);
                    if (iM7234 == 255) {
                        iM7235 = c2377.m7234(16);
                        iM7236 = c2377.m7234(16);
                        if (iM7235 != 0 && iM7236 != 0) {
                            f = iM7235 / iM7236;
                        }
                    } else if (iM7234 < 17) {
                        f = f38843[iM7234];
                    } else {
                        C7309.m19506(iM7234, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (c2377.m7233()) {
                    c2377.m7236();
                }
                if (c2377.m7233()) {
                    c2377.m7232(3);
                    if (c2377.m7233()) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (c2377.m7233()) {
                        int iM72321 = c2377.m7234(8);
                        int iM72322 = c2377.m7234(8);
                        c2377.m7232(8);
                        iM11700 = C4119.m11700(iM72321);
                        iM11703 = C4119.m11703(iM72322);
                    }
                    if (c2377.m7233()) {
                        c2377.m7231();
                        c2377.m7231();
                    }
                    i15 = i9;
                    if (c2377.m7233()) {
                        c2377.m7232(65);
                    }
                    zM7234 = c2377.m7233();
                    if (zM7234) {
                        m28859(c2377);
                    }
                    zM7235 = c2377.m7233();
                    if (zM7235) {
                        m28859(c2377);
                    }
                    if (zM7234 || zM7235) {
                        c2377.m7236();
                    }
                    c2377.m7236();
                    if (c2377.m7233()) {
                        c2377.m7236();
                        c2377.m7231();
                        c2377.m7231();
                        c2377.m7231();
                        c2377.m7231();
                        iM7233 = c2377.m7231();
                        c2377.m7231();
                    } else {
                        iM7233 = i15;
                    }
                    i10 = iM7233;
                    i12 = i14;
                    i11 = iM11700;
                    f2 = f;
                    i13 = iM11703;
                } else {
                    i14 = -1;
                }
                iM11703 = -1;
                if (c2377.m7233()) {
                    c2377.m7231();
                    c2377.m7231();
                }
                i15 = i9;
                if (c2377.m7233()) {
                    c2377.m7232(65);
                }
                zM7234 = c2377.m7233();
                if (zM7234) {
                    m28859(c2377);
                }
                zM7235 = c2377.m7233();
                if (zM7235) {
                    m28859(c2377);
                }
                if (zM7234) {
                    c2377.m7236();
                } else {
                    c2377.m7236();
                }
                c2377.m7236();
                if (c2377.m7233()) {
                    c2377.m7236();
                    c2377.m7231();
                    c2377.m7231();
                    c2377.m7231();
                    c2377.m7231();
                    iM7233 = c2377.m7231();
                    c2377.m7231();
                } else {
                    iM7233 = i15;
                }
                i10 = iM7233;
                i12 = i14;
                i11 = iM11700;
                f2 = f;
                i13 = iM11703;
            } else {
                i10 = i9;
                f2 = 1.0f;
                i11 = -1;
                i12 = -1;
                i13 = -1;
            }
            return new C13668(iM7237, iM7238, iM7239, iM72310, i26, i27, f2, i3, i4, z, zM7233, iM72313, iM72314, i5, z2, i11, i12, i13, i10);
        }
        iM7232 = c2377.m7231() + 4;
        i5 = iM7232;
        z2 = false;
        c2377.m7231();
        c2377.m7236();
        int iM723110 = c2377.m7231() + 1;
        int iM723111 = c2377.m7231() + 1;
        zM7233 = c2377.m7233();
        i6 = 2 - (zM7233 ? 1 : 0);
        int i28 = iM723111 * i6;
        if (!zM7233) {
            c2377.m7236();
        }
        c2377.m7236();
        i7 = iM723110 * 16;
        i8 = i28 * 16;
        if (c2377.m7233()) {
            int iM723112 = c2377.m7231();
            int iM723113 = c2377.m7231();
            int iM723114 = c2377.m7231();
            int iM72323 = c2377.m7231();
            if (iM7231 == 0) {
                i18 = 1;
            } else {
                if (iM7231 == 3) {
                    i16 = 1;
                } else {
                    i16 = 2;
                }
                if (iM7231 == 1) {
                    i17 = 2;
                } else {
                    i17 = 1;
                }
                i6 *= i17;
                i18 = i16;
            }
            i7 -= (iM723112 + iM723113) * i18;
            i8 -= (iM723114 + iM72323) * i6;
        } else {
            iM72314 = iM72314;
        }
        int i29 = i7;
        int i210 = i8;
        if (iM7237 != 44) {
        }
        iM11700 = -1;
        f = 1.0f;
        if (c2377.m7233()) {
            if (c2377.m7233()) {
                iM7234 = c2377.m7234(8);
                if (iM7234 == 255) {
                    iM7235 = c2377.m7234(16);
                    iM7236 = c2377.m7234(16);
                    if (iM7235 != 0) {
                        f = iM7235 / iM7236;
                    }
                } else if (iM7234 < 17) {
                    f = f38843[iM7234];
                } else {
                    C7309.m19506(iM7234, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (c2377.m7233()) {
                c2377.m7236();
            }
            if (c2377.m7233()) {
                c2377.m7232(3);
                if (c2377.m7233()) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (c2377.m7233()) {
                    int iM72324 = c2377.m7234(8);
                    int iM72325 = c2377.m7234(8);
                    c2377.m7232(8);
                    iM11700 = C4119.m11700(iM72324);
                    iM11703 = C4119.m11703(iM72325);
                }
                if (c2377.m7233()) {
                    c2377.m7231();
                    c2377.m7231();
                }
                i15 = i9;
                if (c2377.m7233()) {
                    c2377.m7232(65);
                }
                zM7234 = c2377.m7233();
                if (zM7234) {
                    m28859(c2377);
                }
                zM7235 = c2377.m7233();
                if (zM7235) {
                    m28859(c2377);
                }
                if (zM7234) {
                    c2377.m7236();
                } else {
                    c2377.m7236();
                }
                c2377.m7236();
                if (c2377.m7233()) {
                    c2377.m7236();
                    c2377.m7231();
                    c2377.m7231();
                    c2377.m7231();
                    c2377.m7231();
                    iM7233 = c2377.m7231();
                    c2377.m7231();
                } else {
                    iM7233 = i15;
                }
                i10 = iM7233;
                i12 = i14;
                i11 = iM11700;
                f2 = f;
                i13 = iM11703;
            } else {
                i14 = -1;
            }
            iM11703 = -1;
            if (c2377.m7233()) {
                c2377.m7231();
                c2377.m7231();
            }
            i15 = i9;
            if (c2377.m7233()) {
                c2377.m7232(65);
            }
            zM7234 = c2377.m7233();
            if (zM7234) {
                m28859(c2377);
            }
            zM7235 = c2377.m7233();
            if (zM7235) {
                m28859(c2377);
            }
            if (zM7234) {
                c2377.m7236();
            } else {
                c2377.m7236();
            }
            c2377.m7236();
            if (c2377.m7233()) {
                c2377.m7236();
                c2377.m7231();
                c2377.m7231();
                c2377.m7231();
                c2377.m7231();
                iM7233 = c2377.m7231();
                c2377.m7231();
            } else {
                iM7233 = i15;
            }
            i10 = iM7233;
            i12 = i14;
            i11 = iM11700;
            f2 = f;
            i13 = iM11703;
        } else {
            i10 = i9;
            f2 = 1.0f;
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new C13668(iM7237, iM7238, iM7239, iM72310, i29, i210, f2, i3, i4, z, zM7233, iM72313, iM72314, i5, z2, i11, i12, i13, i10);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3166 m28858(int i, int i2, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        int i3;
        C9518 c9518;
        boolean zM7233;
        int iM7234;
        int i4;
        int iM7235;
        int i5;
        boolean[][] zArr;
        int i6;
        int i7;
        boolean[][] zArr2;
        int i8;
        int[] iArr3;
        boolean z;
        int[] iArr4;
        boolean zM7234;
        int i9;
        int i10;
        int i11;
        boolean zM7235;
        boolean zM7236;
        int iM7231;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        C2377 c2377 = new C2377(bArr, i, i2);
        m28853(c2377);
        c2377.m7232(4);
        boolean zM7237 = c2377.m7233();
        boolean zM7238 = c2377.m7233();
        int iM7236 = c2377.m7234(6);
        int i15 = iM7236 + 1;
        int iM7237 = c2377.m7234(3);
        c2377.m7232(17);
        C12340 c12340M28851 = m28851(c2377, true, iM7237, (C12340) null);
        for (int i16 = c2377.m7233() ? 0 : iM7237; i16 <= iM7237; i16++) {
            c2377.m7231();
            c2377.m7231();
            c2377.m7231();
        }
        int iM7238 = c2377.m7234(6);
        int iM7232 = c2377.m7231() + 1;
        C17278 c17278 = new C17278(AbstractC22433.of((Object) c12340M28851), new int[1]);
        boolean z4 = i15 >= 2 && iM7232 >= 2;
        boolean z5 = zM7237 && zM7238;
        int i17 = iM7238 + 1;
        boolean z6 = i17 >= i15;
        if (!z4 || !z5 || !z6) {
            return new C3166(null, c17278, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iM7232, i17);
        int[] iArr6 = new int[iM7232];
        int[] iArr7 = new int[iM7232];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i18 = 1; i18 < iM7232; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iM7238; i20++) {
                if (c2377.m7233()) {
                    iArr5[i18][i19] = i20;
                    iArr7[i18] = i20;
                    i19++;
                }
                iArr6[i18] = i19;
            }
        }
        if (c2377.m7233()) {
            c2377.m7232(64);
            if (c2377.m7233()) {
                c2377.m7231();
            }
            int iM7233 = c2377.m7231();
            for (int i21 = 0; i21 < iM7233; i21++) {
                c2377.m7231();
                if (i21 == 0 || c2377.m7233()) {
                    boolean zM7239 = c2377.m7233();
                    boolean zM72310 = c2377.m7233();
                    z3 = zM7239;
                    z2 = zM72310;
                    if (zM7239 || zM72310) {
                        zM7234 = c2377.m7233();
                        if (zM7234) {
                            c2377.m7232(19);
                        }
                        c2377.m7232(8);
                        if (zM7234) {
                            c2377.m7232(4);
                        }
                        c2377.m7232(15);
                        i10 = zM7239;
                        i9 = zM72310;
                    }
                    i11 = 0;
                    while (i11 <= iM7237) {
                        zM7235 = c2377.m7233();
                        if (!zM7235) {
                            zM7235 = c2377.m7233();
                        }
                        if (zM7235) {
                            c2377.m7231();
                            zM7236 = false;
                        } else {
                            zM7236 = c2377.m7233();
                        }
                        if (zM7236) {
                            iM7231 = 0;
                        } else {
                            iM7231 = c2377.m7231();
                        }
                        int[] iArr8 = iArr7;
                        i12 = i10 + i9;
                        int[][] iArr9 = iArr5;
                        i13 = 0;
                        while (i13 < i12) {
                            int i22 = i12;
                            for (i14 = 0; i14 <= iM7231; i14++) {
                                c2377.m7231();
                                c2377.m7231();
                                if (zM7234) {
                                    c2377.m7231();
                                    c2377.m7231();
                                }
                                c2377.m7236();
                            }
                            i13++;
                            i12 = i22;
                        }
                        i11++;
                        iM7233 = iM7233;
                        iArr7 = iArr8;
                        iArr5 = iArr9;
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                zM7234 = false;
                i10 = z3;
                i9 = z2;
                i11 = 0;
                while (i11 <= iM7237) {
                    zM7235 = c2377.m7233();
                    if (!zM7235) {
                        zM7235 = c2377.m7233();
                    }
                    if (zM7235) {
                        c2377.m7231();
                        zM7236 = false;
                    } else {
                        zM7236 = c2377.m7233();
                    }
                    if (zM7236) {
                        iM7231 = c2377.m7231();
                    } else {
                        iM7231 = 0;
                    }
                    int[] iArr10 = iArr7;
                    i12 = i10 + i9;
                    int[][] iArr11 = iArr5;
                    i13 = 0;
                    while (i13 < i12) {
                        int i23 = i12;
                        while (i14 <= iM7231) {
                            c2377.m7231();
                            c2377.m7231();
                            if (zM7234) {
                                c2377.m7231();
                                c2377.m7231();
                            }
                            c2377.m7236();
                        }
                        i13++;
                        i12 = i23;
                    }
                    i11++;
                    iM7233 = iM7233;
                    iArr7 = iArr10;
                    iArr5 = iArr11;
                }
            }
        }
        int[][] iArr12 = iArr5;
        int[] iArr13 = iArr7;
        if (!c2377.m7233()) {
            return new C3166(null, c17278, null, null);
        }
        c2377.m7228();
        C12340 c12340M28852 = m28851(c2377, false, iM7237, c12340M28851);
        boolean zM72311 = c2377.m7233();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zM72312 = c2377.m7233();
            zArr3[i25] = zM72312;
            if (zM72312) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new C3166(null, c17278, null, null);
        }
        int[] iArr14 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zM72311 ? 1 : 0); i26++) {
            iArr14[i26] = c2377.m7234(3);
        }
        int[] iArr15 = new int[i24 + 1];
        if (zM72311) {
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
        boolean zM72313 = c2377.m7233();
        int i29 = 1;
        while (i29 < i15) {
            if (zM72313) {
                iArr18[i29] = c2377.m7234(6);
            } else {
                iArr18[i29] = i29;
            }
            if (zM72311) {
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
                    iArr17[i29][i32] = c2377.m7234(iArr14[i32] + 1);
                    i32++;
                    iArr14 = iArr14;
                }
                iArr4 = iArr14;
            }
            i29++;
            zM72313 = zM72313;
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
        int iM7239 = c2377.m7234(4);
        if (i33 < 2 || iM7239 == 0) {
            return new C3166(null, c17278, null, null);
        }
        int[] iArr20 = new int[i33];
        for (int i38 = 0; i38 < i33; i38++) {
            iArr20[i38] = c2377.m7234(iM7239);
        }
        int[] iArr21 = new int[i17];
        for (int i39 = 0; i39 < i15; i39++) {
            iArr21[Math.min(iArr18[i39], iM7238)] = i39;
        }
        C4793 c4793 = new C4793();
        int i40 = 0;
        while (i40 <= iM7238) {
            int iMin = Math.min(iArr19[i40], i33 - 1);
            c4793.m52163(new C0344(iArr21[i40], iMin >= 0 ? iArr20[iMin] : -1));
            i40++;
            iArr19 = iArr19;
        }
        AbstractC22433 abstractC22433M13309 = c4793.m13309();
        if (((C0344) abstractC22433M13309.get(0)).f1758 == -1) {
            return new C3166(null, c17278, null, null);
        }
        int i41 = 1;
        while (true) {
            if (i41 > iM7238) {
                i41 = -1;
                break;
            }
            if (((C0344) abstractC22433M13309.get(i41)).f1758 != -1) {
                break;
            }
            i41++;
        }
        if (i41 == -1) {
            return new C3166(null, c17278, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        for (int i42 = 1; i42 < i15; i42++) {
            for (int i43 = 0; i43 < i42; i43++) {
                boolean[] zArr6 = zArr4[i42];
                boolean[] zArr7 = zArr5[i42];
                boolean zM72314 = c2377.m7233();
                zArr7[i43] = zM72314;
                zArr6[i43] = zM72314;
            }
        }
        for (int i44 = 1; i44 < i15; i44++) {
            for (int i45 = 0; i45 < iM7236; i45++) {
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
            return new C3166(null, c17278, null, null);
        }
        int[] iArr23 = new int[i15];
        int[] iArr24 = new int[iM7232];
        if (c2377.m7233()) {
            int i52 = 0;
            while (true) {
                iArr2 = iArr18;
                if (i52 >= i15) {
                    break;
                }
                iArr23[i52] = c2377.m7234(3);
                i52++;
                iArr18 = iArr2;
            }
            i3 = iM7237;
        } else {
            iArr2 = iArr18;
            i3 = iM7237;
            Arrays.fill(iArr23, 0, i15, i3);
        }
        int i53 = 0;
        while (i53 < iM7232) {
            boolean[][] zArr9 = zArr5;
            int i54 = i41;
            int[] iArr25 = iArr22;
            int iMax = 0;
            for (int i55 = 0; i55 < iArr[i53]; i55++) {
                iMax = Math.max(iMax, iArr23[((C0344) abstractC22433M13309.get(iArr12[i53][i55])).f1757]);
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
        if (c2377.m7233()) {
            int i57 = 0;
            while (i57 < iM7236) {
                int i58 = i57 + 1;
                for (int i59 = i58; i59 < i15; i59++) {
                    if (zArr4[i59][i57]) {
                        c2377.m7232(3);
                    }
                }
                i57 = i58;
            }
        }
        c2377.m7236();
        int iM72310 = c2377.m7231() + 1;
        C4793 c4794 = new C4793();
        c4794.m52163(c12340M28851);
        if (iM72310 > 1) {
            C12340 c12340M28853 = c12340M28852;
            c4794.m52163(c12340M28853);
            for (int i60 = 2; i60 < iM72310; i60++) {
                c12340M28853 = m28851(c2377, c2377.m7233(), i3, c12340M28853);
                c4794.m52163(c12340M28853);
            }
        }
        AbstractC22433 abstractC22433M133010 = c4794.m13309();
        int iM72311 = c2377.m7231() + iM7232;
        if (iM72311 > iM7232) {
            return new C3166(null, c17278, null, null);
        }
        int iM72312 = c2377.m7234(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM72311, i17);
        int[] iArr27 = new int[iM72311];
        int[] iArr28 = new int[iM72311];
        int i61 = 0;
        int i62 = 0;
        while (i61 < iM7232) {
            iArr27[i61] = i62;
            iArr28[i61] = iArr13[i61];
            if (iM72312 == 0) {
                i8 = iM7232;
                zArr2 = zArr4;
                iArr3 = iArr24;
                i7 = i15;
                Arrays.fill(zArr11[i61], 0, iArr[i61], true);
                iArr27[i61] = iArr[i61];
            } else {
                i7 = i15;
                zArr2 = zArr4;
                i8 = iM7232;
                iArr3 = iArr24;
                if (iM72312 == 1) {
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
                iM7232 = i8;
                zArr4 = zArr2;
                iArr24 = iArr3;
                i15 = i7;
            }
            i62 = 0;
            i61++;
            iM7232 = i8;
            zArr4 = zArr2;
            iArr24 = iArr3;
            i15 = i7;
        }
        int i65 = i15;
        boolean[][] zArr12 = zArr4;
        int i66 = iM7232;
        int[] iArr29 = iArr24;
        int i67 = 1;
        int[] iArr30 = new int[i17];
        int i68 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i17;
        iArr31[i62] = iM72311;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr31);
        int i69 = 0;
        while (i67 < iM72311) {
            if (iM72312 == i68) {
                for (int i70 = 0; i70 < iArr[i67]; i70++) {
                    zArr11[i67][i70] = c2377.m7233();
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
                if (iM72310 > 1) {
                    zArr13[i67][i75] = zArr11[i67][i75];
                    zArr = zArr11;
                    int i76 = iM72312;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM42799 = C18450.m42799(iM72310);
                    if (zArr13[i67][i75]) {
                        i5 = iM72310;
                    } else {
                        int i77 = ((C0344) abstractC22433M13309.get(iArr12[i67][i75])).f1757;
                        i5 = iM72310;
                        int i78 = 0;
                        while (true) {
                            if (i78 < i75) {
                                i6 = i76;
                                if (zArr10[i77][((C0344) abstractC22433M13309.get(iArr12[i67][i78])).f1757]) {
                                    zArr13[i67][i75] = true;
                                    break;
                                }
                                i78++;
                                i76 = i6;
                            }
                        }
                        if (!zArr13[i67][i75]) {
                            if (i69 <= 0 && i67 == i69) {
                                iArr30[i75] = c2377.m7234(iM42799);
                            } else {
                                c2377.m7232(iM42799);
                            }
                        }
                    }
                    i6 = i76;
                    if (!zArr13[i67][i75]) {
                        if (i69 <= 0) {
                            c2377.m7232(iM42799);
                        } else {
                            c2377.m7232(iM42799);
                        }
                    }
                } else {
                    i5 = iM72310;
                    zArr = zArr11;
                    i6 = iM72312;
                }
                i75++;
                zArr11 = zArr;
                iM72310 = i5;
                iM72312 = i6;
            }
            int i79 = iM72310;
            boolean[][] zArr14 = zArr11;
            int i80 = iM72312;
            if (iArr27[i67] == 1 && iArr26[iArr28[i67]] > 0) {
                c2377.m7236();
            }
            i67++;
            i68 = 2;
            zArr11 = zArr14;
            iM72310 = i79;
            iM72312 = i80;
            i56 = i74;
        }
        if (i69 == 0) {
            return new C3166(null, c17278, null, null);
        }
        int iM72313 = c2377.m7231();
        int i81 = iM72313 + 1;
        C4793 c4793M49796 = AbstractC22433.m49796(i81);
        int[] iArr32 = new int[i65];
        int i82 = 0;
        while (i82 < i81) {
            int iM72314 = c2377.m7234(16);
            int iM72315 = c2377.m7234(16);
            if (c2377.m7233()) {
                iM7234 = c2377.m7234(2);
                if (iM7234 == 3) {
                    c2377.m7236();
                }
                int iM72316 = c2377.m7234(4);
                iM7235 = c2377.m7234(4);
                i4 = iM72316;
            } else {
                iM7234 = 0;
                i4 = 0;
                iM7235 = 0;
            }
            if (c2377.m7233()) {
                int iM72317 = c2377.m7231();
                int iM72318 = c2377.m7231();
                int iM72319 = c2377.m7231();
                int iM72320 = c2377.m7231();
                iM72314 -= (iM72317 + iM72318) * ((iM7234 == 1 || iM7234 == 2) ? 2 : 1);
                iM72315 -= (iM72319 + iM72320) * (iM7234 == 1 ? 2 : 1);
            }
            c4793M49796.m52163(new C5989(iM7234, i4, iM7235, iM72314, iM72315));
            i82++;
            abstractC22433M13309 = abstractC22433M13309;
        }
        AbstractC22433 abstractC22433 = abstractC22433M13309;
        if (i81 <= 1 || !c2377.m7233()) {
            for (int i83 = 1; i83 < i65; i83++) {
                iArr32[i83] = Math.min(i83, iM72313);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM427910 = C18450.m42799(i81);
            for (int i84 = 1; i84 < i65; i84++) {
                iArr32[i84] = c2377.m7234(iM427910);
            }
        }
        C10929 c10929 = new C10929(c4793M49796.m13309(), iArr32);
        c2377.m7232(2);
        for (int i85 = 1; i85 < i65; i85++) {
            if (iArr26[iArr2[i85]] == 0) {
                c2377.m7236();
            }
        }
        for (int i86 = 1; i86 < iM72311; i86++) {
            boolean zM72315 = c2377.m7233();
            int i87 = 0;
            while (i87 < iArr29[i86]) {
                if (i87 <= 0 || !zM72315) {
                    zM7233 = i87 == 0;
                } else {
                    zM7233 = c2377.m7233();
                }
                if (zM7233) {
                    for (int i88 = 0; i88 < iArr[i86]; i88++) {
                        if (zArr13[i86][i88]) {
                            c2377.m7231();
                        }
                    }
                    c2377.m7231();
                    c2377.m7231();
                }
                i87++;
            }
        }
        int iM72321 = c2377.m7231() + 2;
        if (c2377.m7233()) {
            c2377.m7232(iM72321);
        } else {
            for (int i89 = 1; i89 < i65; i89++) {
                for (int i90 = 0; i90 < i89; i90++) {
                    if (zArr12[i89][i90]) {
                        c2377.m7232(iM72321);
                    }
                }
            }
        }
        int iM72322 = c2377.m7231();
        for (int i91 = 1; i91 <= iM72322; i91++) {
            c2377.m7232(8);
        }
        if (c2377.m7233()) {
            c2377.m7228();
            if (!c2377.m7233() ? c2377.m7233() : true) {
                c2377.m7236();
            }
            boolean zM72316 = c2377.m7233();
            boolean zM72317 = c2377.m7233();
            if (zM72316 || zM72317) {
                for (int i92 = 0; i92 < i66; i92++) {
                    for (int i93 = 0; i93 < iArr29[i92]; i93++) {
                        boolean zM72318 = zM72316 ? c2377.m7233() : false;
                        boolean zM72319 = zM72317 ? c2377.m7233() : false;
                        if (zM72318) {
                            c2377.m7232(32);
                        }
                        if (zM72319) {
                            c2377.m7232(18);
                        }
                    }
                }
            }
            boolean zM72320 = c2377.m7233();
            int iM72323 = zM72320 ? c2377.m7234(4) + 1 : i65;
            C4793 c4793M49797 = AbstractC22433.m49796(iM72323);
            int[] iArr33 = new int[i65];
            for (int i94 = 0; i94 < iM72323; i94++) {
                c2377.m7232(3);
                int i95 = c2377.m7233() ? 1 : 2;
                int iM11700 = C4119.m11700(c2377.m7234(8));
                int iM11703 = C4119.m11703(c2377.m7234(8));
                c2377.m7232(8);
                c4793M49797.m52163(new C1755(iM11700, i95, iM11703));
            }
            if (zM72320 && iM72323 > 1) {
                for (int i96 = 0; i96 < i65; i96++) {
                    iArr33[i96] = c2377.m7234(4);
                }
            }
            c9518 = new C9518(c4793M49797.m13309(), iArr33);
        } else {
            c9518 = null;
        }
        return new C3166(abstractC22433, new C17278(abstractC22433M133010, iArr30), c10929, c9518);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16573 m28853(C2377 c2377) {
        c2377.m7236();
        return new C16573(c2377.m7234(6), c2377.m7234(6), c2377.m7234(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:204:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14457 m28852(byte[] bArr, int i, int i2, C3166 c3166) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM7231;
        int i9;
        int iM7232;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM11703;
        int iM11700;
        int i14;
        C9518 c9518;
        int i15;
        C10929 c10929;
        C16573 c16573M28853 = m28853(new C2377(bArr, i, i2));
        C2377 c2377 = new C2377(bArr, i + 2, i2);
        c2377.m7232(4);
        int iM7234 = c2377.m7234(3);
        int i16 = c16573M28853.f53209;
        boolean z = i16 != 0 && iM7234 == 7;
        if (c3166 != null) {
            AbstractC22433 abstractC22433 = c3166.f11912;
            if (abstractC22433.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((C0344) abstractC22433.get(Math.min(i16, abstractC22433.size() - 1))).f1757;
            }
        } else {
            i3 = 0;
        }
        C12340 c12340M28851 = null;
        if (!z) {
            c2377.m7236();
            c12340M28851 = m28851(c2377, true, iM7234, (C12340) null);
        } else if (c3166 != null) {
            C17278 c17278 = c3166.f11914;
            int[] iArr = c17278.f55025;
            AbstractC22433 abstractC22434 = c17278.f55026;
            int i17 = iArr[i3];
            if (abstractC22434.size() > i17) {
                c12340M28851 = (C12340) abstractC22434.get(i17);
            }
        }
        c2377.m7231();
        if (z) {
            int iM7235 = c2377.m7233() ? c2377.m7234(8) : -1;
            if (c3166 == null || (c10929 = c3166.f11913) == null) {
                i8 = 0;
                iM7231 = 0;
                iM7232 = 0;
                i7 = 0;
                i9 = 0;
                i6 = 0;
            } else {
                AbstractC22433 abstractC22435 = c10929.f37174;
                if (iM7235 == -1) {
                    iM7235 = c10929.f37173[i3];
                }
                if (iM7235 == -1 || abstractC22435.size() <= iM7235) {
                    i8 = 0;
                    iM7231 = 0;
                    iM7232 = 0;
                    i7 = 0;
                    i9 = 0;
                    i6 = 0;
                } else {
                    C5989 c5989 = (C5989) abstractC22435.get(iM7235);
                    int i18 = c5989.f20361;
                    int i19 = c5989.f20360;
                    int i20 = c5989.f20358;
                    int i21 = c5989.f20362;
                    i9 = i19;
                    i8 = i20;
                    i6 = i8;
                    iM7232 = c5989.f20359;
                    iM7231 = i21;
                    i7 = i9;
                }
            }
        } else {
            int iM7233 = c2377.m7231();
            if (iM7233 == 3) {
                c2377.m7236();
            }
            int iM7236 = c2377.m7231();
            int iM7237 = c2377.m7231();
            if (c2377.m7233()) {
                int iM7238 = c2377.m7231();
                int iM7239 = c2377.m7231();
                int iM72310 = c2377.m7231();
                int iM72311 = c2377.m7231();
                i4 = iM7236 - ((iM7238 + iM7239) * ((iM7233 == 1 || iM7233 == 2) ? 2 : 1));
                i5 = iM7237 - ((iM72310 + iM72311) * (iM7233 == 1 ? 2 : 1));
            } else {
                i4 = iM7236;
                i5 = iM7237;
            }
            i6 = iM7237;
            i7 = i4;
            i8 = i5;
            iM7231 = c2377.m7231();
            i9 = iM7236;
            iM7232 = c2377.m7231();
        }
        int iM72312 = c2377.m7231();
        if (z) {
            i10 = -1;
        } else {
            int iMax = -1;
            for (int i22 = c2377.m7233() ? 0 : iM7234; i22 <= iM7234; i22++) {
                c2377.m7231();
                iMax = Math.max(c2377.m7231(), iMax);
                c2377.m7231();
            }
            i10 = iMax;
        }
        c2377.m7231();
        c2377.m7231();
        c2377.m7231();
        c2377.m7231();
        c2377.m7231();
        c2377.m7231();
        if (c2377.m7233()) {
            if (z ? c2377.m7233() : false) {
                c2377.m7232(6);
            } else if (c2377.m7233()) {
                int i23 = 0;
                int i24 = 4;
                int i25 = 6;
                while (i23 < i24) {
                    int i26 = 0;
                    while (i26 < i25) {
                        if (c2377.m7233()) {
                            int iMin = Math.min(64, 1 << ((i23 << 1) + 4));
                            if (i23 > 1) {
                                c2377.m7227();
                            }
                            for (int i27 = 0; i27 < iMin; i27++) {
                                c2377.m7227();
                            }
                            i15 = 3;
                        } else {
                            c2377.m7231();
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
        c2377.m7232(2);
        if (c2377.m7233()) {
            c2377.m7232(8);
            c2377.m7231();
            c2377.m7231();
            c2377.m7236();
        }
        int iM72313 = c2377.m7231();
        int i29 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i30 = -1;
        int i31 = i9;
        int i32 = -1;
        while (i29 < iM72313) {
            if (i29 == 0 || !c2377.m7233()) {
                int iM72314 = c2377.m7231();
                int iM72315 = c2377.m7231();
                int[] iArr3 = new int[iM72314];
                int i33 = 0;
                while (i33 < iM72314) {
                    iArr3[i33] = (i33 > 0 ? iArr3[i33 - 1] : 0) - (c2377.m7231() + 1);
                    c2377.m7236();
                    i33++;
                }
                int[] iArr4 = new int[iM72315];
                int i34 = 0;
                while (i34 < iM72315) {
                    iArr4[i34] = c2377.m7231() + 1 + (i34 > 0 ? iArr4[i34 - 1] : 0);
                    c2377.m7236();
                    i34++;
                }
                i30 = iM72314;
                i32 = iM72315;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i35 = i30 + i32;
                int iM38346 = C16236.m38346(c2377.m7233() ? 1 : 0, 2, 1, c2377.m7231() + 1);
                int i36 = i35 + 1;
                boolean[] zArr = new boolean[i36];
                for (int i37 = 0; i37 <= i35; i37++) {
                    if (c2377.m7233()) {
                        zArr[i37] = true;
                    } else {
                        zArr[i37] = c2377.m7233();
                    }
                }
                int[] iArr5 = new int[i36];
                int[] iArr6 = new int[i36];
                int i38 = 0;
                for (int i39 = i32 - 1; i39 >= 0; i39--) {
                    int i40 = iArrCopyOf[i39] + iM38346;
                    if (i40 < 0 && zArr[i30 + i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                if (iM38346 < 0 && zArr[i35]) {
                    iArr5[i38] = iM38346;
                    i38++;
                }
                int i41 = i38;
                for (int i42 = 0; i42 < i30; i42++) {
                    int i43 = iArr2[i42] + iM38346;
                    if (i43 < 0 && zArr[i42]) {
                        iArr5[i41] = i43;
                        i41++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i41);
                int i44 = 0;
                for (int i45 = i30 - 1; i45 >= 0; i45--) {
                    int i46 = iArr2[i45] + iM38346;
                    if (i46 > 0 && zArr[i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                if (iM38346 > 0 && zArr[i35]) {
                    iArr6[i44] = iM38346;
                    i44++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < i32; i48++) {
                    int i49 = iArrCopyOf[i48] + iM38346;
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
            iM72313 = iM72313;
            i7 = i7;
            iM7231 = iM7231;
            iM7232 = iM7232;
            c12340M28851 = c12340M28851;
            i8 = i8;
            iM7234 = iM7234;
        }
        int i50 = iM7234;
        C12340 c12340 = c12340M28851;
        int i51 = iM7231;
        int i52 = iM7232;
        int i53 = i7;
        int i54 = i8;
        if (c2377.m7233()) {
            int iM72316 = c2377.m7231();
            for (int i55 = 0; i55 < iM72316; i55++) {
                c2377.m7232(iM72312 + 5);
            }
        }
        c2377.m7232(2);
        float f = 1.0f;
        if (c2377.m7233()) {
            if (c2377.m7233()) {
                int iM72317 = c2377.m7234(8);
                if (iM72317 == 255) {
                    int iM72318 = c2377.m7234(16);
                    int iM72319 = c2377.m7234(16);
                    if (iM72318 != 0 && iM72319 != 0) {
                        f = iM72318 / iM72319;
                    }
                } else if (iM72317 < 17) {
                    f = f38843[iM72317];
                } else {
                    C7309.m19506(iM72317, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (c2377.m7233()) {
                c2377.m7236();
            }
            if (c2377.m7233()) {
                c2377.m7232(3);
                i14 = c2377.m7233() ? 1 : 2;
                if (c2377.m7233()) {
                    int iM72320 = c2377.m7234(8);
                    int iM72321 = c2377.m7234(8);
                    c2377.m7232(8);
                    iM11700 = C4119.m11700(iM72320);
                    iM11703 = C4119.m11703(iM72321);
                } else {
                    iM11700 = -1;
                    iM11703 = -1;
                }
            } else if (c3166 == null || (c9518 = c3166.f11911) == null) {
                iM11700 = -1;
                iM11703 = -1;
                i14 = -1;
            } else {
                AbstractC22433 abstractC22436 = c9518.f32196;
                int i56 = c9518.f32195[i3];
                if (abstractC22436.size() > i56) {
                    C1755 c1755 = (C1755) abstractC22436.get(i56);
                    iM11700 = c1755.f6889;
                    int i57 = c1755.f6887;
                    iM11703 = c1755.f6888;
                    i14 = i57;
                } else {
                    iM11700 = -1;
                    iM11703 = -1;
                    i14 = -1;
                }
            }
            if (c2377.m7233()) {
                c2377.m7231();
                c2377.m7231();
            }
            c2377.m7236();
            i12 = c2377.m7233() ? i54 * 2 : i54;
            int i58 = iM11700;
            i13 = i14;
            i11 = i58;
        } else {
            i11 = -1;
            i12 = i54;
            f = 1.0f;
            i13 = -1;
            iM11703 = -1;
        }
        return new C14457(i50, c12340, i51, i52, i53, i12, i31, i28, f, i10, i11, i13, iM11703);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23629 m28854(int i, int i2, byte[] bArr) {
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
        C2377 c2377 = new C2377(bArr, i3, i2 + 1);
        while (c2377.m7230(16)) {
            int iM7234 = c2377.m7234(8);
            int i4 = 0;
            while (iM7234 == 255) {
                i4 += 255;
                iM7234 = c2377.m7234(8);
            }
            int i5 = i4 + iM7234;
            int iM7235 = c2377.m7234(8);
            int i6 = 0;
            while (iM7235 == 255) {
                i6 += 255;
                iM7235 = c2377.m7234(8);
            }
            int i7 = i6 + iM7235;
            if (i7 == 0 || !c2377.m7230(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iM7231 = c2377.m7231();
                boolean zM7233 = c2377.m7233();
                int iM7232 = zM7233 ? c2377.m7231() : 0;
                int iM7233 = c2377.m7231();
                int iM7236 = -1;
                for (int i8 = 0; i8 <= iM7233; i8++) {
                    iM7236 = c2377.m7231();
                    c2377.m7231();
                    int iM7237 = c2377.m7234(6);
                    if (iM7237 == 63) {
                        return null;
                    }
                    if (iM7237 == 0) {
                        iMax = Math.max(0, iM7231 - 30);
                    } else {
                        iMax = Math.max(0, (iM7237 + iM7231) - 31);
                    }
                    c2377.m7234(iMax);
                    if (zM7233) {
                        int iM7238 = c2377.m7234(6);
                        if (iM7238 == 63) {
                            return null;
                        }
                        if (iM7238 == 0) {
                            iMax2 = Math.max(0, iM7232 - 30);
                        } else {
                            iMax2 = Math.max(0, (iM7238 + iM7232) - 31);
                        }
                        c2377.m7234(iMax2);
                    }
                    if (c2377.m7233()) {
                        c2377.m7232(10);
                    }
                }
                return new C23629(iM7236);
            }
            c2377.m7232(i7 * 8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28847(int i, int i2, byte[] bArr, boolean[] zArr) {
        int i3 = i2 - i;
        C2023.m6510(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m28855(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m28855(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m28855(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & UTF8.S_ERR) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m28855(zArr);
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
    public static void m28855(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28850(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = AbstractC22433.f73217;
                C4793 c4793 = new C4793();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iM28847 = m28847(i3, bArr.length, bArr, zArr);
                    if (iM28847 != bArr.length) {
                        c4793.m52163(Integer.valueOf(iM28847));
                    }
                    i3 = iM28847 + 3;
                }
                AbstractC22433 abstractC22433M13309 = c4793.m13309();
                for (int i4 = 0; i4 < abstractC22433M13309.size(); i4++) {
                    if (((Integer) abstractC22433M13309.get(i4)).intValue() + 3 < length) {
                        C2377 c2377 = new C2377(bArr, ((Integer) abstractC22433M13309.get(i4)).intValue() + 3, length);
                        C16573 c16573M28853 = m28853(c2377);
                        if (c16573M28853.f53211 == 33 && c16573M28853.f53209 == 0) {
                            c2377.m7232(4);
                            int iM7234 = c2377.m7234(3);
                            c2377.m7236();
                            C12340 c12340M28851 = m28851(c2377, true, iM7234, (C12340) null);
                            return C2419.m7350(c12340M28851.f41238, c12340M28851.f41236, c12340M28851.f41239, c12340M28851.f41237, c12340M28851.f41241, c12340M28851.f41240);
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
    public static C12340 m28851(C2377 c2377, boolean z, int i, C12340 c12340) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean zM7233;
        int iM7234;
        int i5;
        int iM7235;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            iM7235 = c2377.m7234(2);
            zM7233 = c2377.m7233();
            iM7234 = c2377.m7234(5);
            i5 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (c2377.m7233()) {
                    i5 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = c2377.m7234(8);
            }
        } else {
            if (c12340 != null) {
                int i9 = c12340.f41238;
                zM7233 = c12340.f41241;
                iM7234 = c12340.f41236;
                i5 = c12340.f41239;
                iArr2 = c12340.f41237;
                iM7235 = i9;
            } else {
                iArr = iArr2;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                z2 = false;
            }
            int iM7236 = c2377.m7234(8);
            i6 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                if (c2377.m7233()) {
                    i6 += 88;
                }
                if (c2377.m7233()) {
                    i6 += 8;
                }
            }
            c2377.m7232(i6);
            if (i > 0) {
                c2377.m7232((8 - i) * 2);
            }
            return new C12340(i2, i3, i4, iArr, z2, iM7236);
        }
        i2 = iM7235;
        iArr = iArr2;
        z2 = zM7233;
        i3 = iM7234;
        i4 = i5;
        int iM7237 = c2377.m7234(8);
        i6 = 0;
        while (i10 < i) {
            if (c2377.m7233()) {
                i6 += 88;
            }
            if (c2377.m7233()) {
                i6 += 8;
            }
        }
        c2377.m7232(i6);
        if (i > 0) {
            c2377.m7232((8 - i) * 2);
        }
        return new C12340(i2, i3, i4, iArr, z2, iM7237);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28859(C2377 c2377) {
        int iM7231 = c2377.m7231() + 1;
        c2377.m7232(8);
        for (int i = 0; i < iM7231; i++) {
            c2377.m7231();
            c2377.m7231();
            c2377.m7236();
        }
        c2377.m7232(20);
    }
}
