package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩻۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68JR */
/* JADX INFO: loaded from: classes.dex */
public final class C23720 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f76764 = {1, 2, 3, 6};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f76760 = {48000, 44100, 32000};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f76762 = {24000, 22050, 16000};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f76763 = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f76761 = {32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes, 448, 512, 576, 640};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int[] f76765 = {69, 87, IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7648 m52240(C2460 c2460, String str, String str2, C8354 c8354) {
        C11634 c11634 = new C11634();
        c11634.m29033(c2460);
        int i = f76760[c11634.m29039(2)];
        c11634.m29034(8);
        int i2 = f76763[c11634.m29039(3)];
        if (c11634.m29039(1) != 0) {
            i2++;
        }
        int i3 = f76761[c11634.m29039(5)] * 1000;
        c11634.m29040();
        c2460.m7510(c11634.m29036());
        C10471 c10471 = new C10471();
        c10471.m26516(str);
        c10471.m26533("audio/ac3");
        c10471.m26494(i2);
        c10471.m26511(i);
        c10471.m26506(c8354);
        c10471.m26509(str2);
        c10471.m26515(i3);
        c10471.m26528(i3);
        return c10471.m26497();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7648 m52242(C2460 c2460, String str, String str2, C8354 c8354) {
        String str3;
        C11634 c11634 = new C11634();
        c11634.m29033(c2460);
        int iM29039 = c11634.m29039(13) * 1000;
        c11634.m29034(3);
        int i = f76760[c11634.m29039(2)];
        c11634.m29034(10);
        int i2 = f76763[c11634.m29039(3)];
        if (c11634.m29039(1) != 0) {
            i2++;
        }
        c11634.m29034(3);
        int iM290310 = c11634.m29039(4);
        c11634.m29034(1);
        if (iM290310 > 0) {
            c11634.m29034(6);
            if (c11634.m29039(1) != 0) {
                i2 += 2;
            }
            c11634.m29034(1);
        }
        if (c11634.m29030() > 7) {
            c11634.m29034(7);
            if (c11634.m29039(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        c11634.m29040();
        c2460.m7510(c11634.m29036());
        C10471 c10471 = new C10471();
        c10471.m26516(str);
        c10471.m26533(str3);
        c10471.m26494(i2);
        c10471.m26511(i);
        c10471.m26506(c8354);
        c10471.m26509(str2);
        c10471.m26528(iM29039);
        return c10471.m26497();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0193  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    /* JADX WARN: Code duplicated, block: B:117:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01be  */
    /* JADX WARN: Code duplicated, block: B:182:0x01c1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11020 m52241(C11634 c11634) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM29039;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM29028 = c11634.m29028();
        c11634.m29034(40);
        boolean z = c11634.m29039(5) > 10;
        c11634.m29029(iM29028);
        int[] iArr = f76763;
        int[] iArr2 = f76760;
        int i15 = -1;
        if (z) {
            c11634.m29034(16);
            int iM290310 = c11634.m29039(2);
            if (iM290310 == 0) {
                i15 = 0;
            } else if (iM290310 == 1) {
                i15 = 1;
            } else if (iM290310 == 2) {
                i15 = 2;
            }
            c11634.m29034(3);
            int iM290311 = (c11634.m29039(11) + 1) * 2;
            int iM290312 = c11634.m29039(2);
            if (iM290312 == 3) {
                i8 = f76762[c11634.m29039(2)];
                i7 = 6;
                iM29039 = 3;
            } else {
                iM29039 = c11634.m29039(2);
                i7 = f76764[iM29039];
                i8 = iArr2[iM290312];
            }
            int i16 = i7 * 256;
            int i17 = (iM290311 * i8) / (i7 * 32);
            int iM290313 = c11634.m29039(3);
            boolean zM29035 = c11634.m29035();
            int i18 = iArr[iM290313] + (zM29035 ? 1 : 0);
            c11634.m29034(10);
            if (c11634.m29035()) {
                c11634.m29034(8);
            }
            if (iM290313 == 0) {
                c11634.m29034(5);
                if (c11634.m29035()) {
                    c11634.m29034(8);
                }
            }
            if (i15 == 1 && c11634.m29035()) {
                c11634.m29034(16);
            }
            if (c11634.m29035()) {
                if (iM290313 > 2) {
                    c11634.m29034(2);
                }
                if ((iM290313 & 1) == 0 || iM290313 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    c11634.m29034(6);
                }
                if ((iM290313 & 4) != 0) {
                    c11634.m29034(i10);
                }
                if (zM29035 && c11634.m29035()) {
                    c11634.m29034(5);
                }
                if (i15 == 0) {
                    if (c11634.m29035()) {
                        i11 = 6;
                        c11634.m29034(6);
                    } else {
                        i11 = 6;
                    }
                    if (iM290313 == 0 && c11634.m29035()) {
                        c11634.m29034(i11);
                    }
                    if (c11634.m29035()) {
                        c11634.m29034(i11);
                    }
                    int iM290314 = c11634.m29039(2);
                    if (iM290314 == 1) {
                        c11634.m29034(5);
                    } else if (iM290314 == 2) {
                        c11634.m29034(12);
                    } else {
                        if (iM290314 == 3) {
                            int iM290315 = c11634.m29039(5);
                            if (c11634.m29035()) {
                                c11634.m29034(5);
                                if (c11634.m29035()) {
                                    i13 = 4;
                                    c11634.m29034(4);
                                } else {
                                    i13 = 4;
                                }
                                if (c11634.m29035()) {
                                    c11634.m29034(i13);
                                }
                                if (c11634.m29035()) {
                                    c11634.m29034(i13);
                                }
                                if (c11634.m29035()) {
                                    c11634.m29034(i13);
                                }
                                if (c11634.m29035()) {
                                    c11634.m29034(i13);
                                }
                                if (c11634.m29035()) {
                                    c11634.m29034(i13);
                                }
                                if (c11634.m29035()) {
                                    c11634.m29034(i13);
                                }
                                if (c11634.m29035()) {
                                    if (c11634.m29035()) {
                                        c11634.m29034(i13);
                                    }
                                    if (c11634.m29035()) {
                                        c11634.m29034(i13);
                                    }
                                }
                            }
                            if (c11634.m29035()) {
                                c11634.m29034(5);
                                if (c11634.m29035()) {
                                    c11634.m29034(7);
                                    if (c11634.m29035()) {
                                        c11634.m29034(8);
                                    }
                                }
                            }
                            i12 = 2;
                            c11634.m29034((iM290315 + 2) * 8);
                            c11634.m29040();
                        }
                        if (iM290313 < i12) {
                            if (c11634.m29035()) {
                                c11634.m29034(14);
                            }
                            if (iM290313 == 0 && c11634.m29035()) {
                                c11634.m29034(14);
                            }
                        }
                        if (c11634.m29035()) {
                            if (iM29039 == 0) {
                                c11634.m29034(5);
                            } else {
                                for (i14 = 0; i14 < i7; i14++) {
                                    if (c11634.m29035()) {
                                        c11634.m29034(5);
                                    }
                                }
                            }
                        }
                    }
                    i12 = 2;
                    if (iM290313 < i12) {
                        if (c11634.m29035()) {
                            c11634.m29034(14);
                        }
                        if (iM290313 == 0) {
                            c11634.m29034(14);
                        }
                    }
                    if (c11634.m29035()) {
                        if (iM29039 == 0) {
                            c11634.m29034(5);
                        } else {
                            while (i14 < i7) {
                                if (c11634.m29035()) {
                                    c11634.m29034(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c11634.m29035()) {
                c11634.m29034(5);
                if (iM290313 == 2) {
                    c11634.m29034(4);
                }
                if (iM290313 >= 6) {
                    c11634.m29034(2);
                }
                if (c11634.m29035()) {
                    c11634.m29034(8);
                }
                if (iM290313 == 0 && c11634.m29035()) {
                    c11634.m29034(8);
                }
                if (iM290312 < 3) {
                    c11634.m29042();
                }
            }
            if (i15 == 0 && iM29039 != 3) {
                c11634.m29042();
            }
            if (i15 == 2 && (iM29039 == 3 || c11634.m29035())) {
                i9 = 6;
                c11634.m29034(6);
            } else {
                i9 = 6;
            }
            str = (c11634.m29035() && c11634.m29039(i9) == 1 && c11634.m29039(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i18;
            i3 = i8;
            i4 = iM290311;
            i6 = i16;
            i5 = i17;
        } else {
            c11634.m29034(32);
            int iM290316 = c11634.m29039(2);
            String str2 = iM290316 == 3 ? null : "audio/ac3";
            int iM290317 = c11634.m29039(6);
            int i19 = f76761[iM290317 / 2] * 1000;
            int iM52237 = m52237(iM290316, iM290317);
            c11634.m29034(8);
            int iM290318 = c11634.m29039(3);
            if ((iM290318 & 1) == 0 || iM290318 == 1) {
                i = 2;
            } else {
                i = 2;
                c11634.m29034(2);
            }
            if ((iM290318 & 4) != 0) {
                c11634.m29034(i);
            }
            if (iM290318 == i) {
                c11634.m29034(i);
            }
            i15 = iM290316 < 3 ? iArr2[iM290316] : -1;
            i2 = iArr[iM290318] + (c11634.m29035() ? 1 : 0);
            str = str2;
            i3 = i15;
            i4 = iM52237;
            i5 = i19;
            i6 = 1536;
        }
        return new C11020(str, i2, i3, i4, i6, i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52239(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m52237((b & 192) >> 6, b & 63);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52238(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f76764[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & UTF8.S_P3A) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52237(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f76760[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f76765[i3]) * 2;
        }
        int i5 = f76761[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
