package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܶۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68JR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15882 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f51645 = {1, 2, 3, 6};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f51646 = {48000, 44100, 32000};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f51644 = {24000, 22050, 16000};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f51642 = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f51641 = {32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes, 448, 512, 576, 640};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f51643 = {69, 87, IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15648 m37860(C21287 c21287, String str, String str2, C22362 c22362) {
        C14573 c14573 = new C14573();
        c14573.m35155(c21287);
        int i = f51646[c14573.m35163(2)];
        c14573.m35161(8);
        int i2 = f51642[c14573.m35163(3)];
        if (c14573.m35163(1) != 0) {
            i2++;
        }
        int i3 = f51641[c14573.m35163(5)] * 1000;
        c14573.m35164();
        c21287.m48510(c14573.m35156());
        C20124 c20124 = new C20124();
        c20124.m46309(str);
        c20124.m46315("audio/ac3");
        c20124.m46329(i2);
        c20124.m46332(i);
        c20124.m46304(c22362);
        c20124.m46321(str2);
        c20124.m46308(i3);
        c20124.m46322(i3);
        return c20124.m46295();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C15648 m37862(C21287 c21287, String str, String str2, C22362 c22362) {
        String str3;
        C14573 c14573 = new C14573();
        c14573.m35155(c21287);
        int iM35163 = c14573.m35163(13) * 1000;
        c14573.m35161(3);
        int i = f51646[c14573.m35163(2)];
        c14573.m35161(10);
        int i2 = f51642[c14573.m35163(3)];
        if (c14573.m35163(1) != 0) {
            i2++;
        }
        c14573.m35161(3);
        int iM35164 = c14573.m35163(4);
        c14573.m35161(1);
        if (iM35164 > 0) {
            c14573.m35161(6);
            if (c14573.m35163(1) != 0) {
                i2 += 2;
            }
            c14573.m35161(1);
        }
        if (c14573.m35152() > 7) {
            c14573.m35161(7);
            if (c14573.m35163(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        c14573.m35164();
        c21287.m48510(c14573.m35156());
        C20124 c20124 = new C20124();
        c20124.m46309(str);
        c20124.m46315(str3);
        c20124.m46329(i2);
        c20124.m46332(i);
        c20124.m46304(c22362);
        c20124.m46321(str2);
        c20124.m46322(iM35163);
        return c20124.m46295();
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
    public static C17374 m37861(C14573 c14573) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM35163;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM35166 = c14573.m35166();
        c14573.m35161(40);
        boolean z = c14573.m35163(5) > 10;
        c14573.m35167(iM35166);
        int[] iArr = f51642;
        int[] iArr2 = f51646;
        int i15 = -1;
        if (z) {
            c14573.m35161(16);
            int iM35164 = c14573.m35163(2);
            if (iM35164 == 0) {
                i15 = 0;
            } else if (iM35164 == 1) {
                i15 = 1;
            } else if (iM35164 == 2) {
                i15 = 2;
            }
            c14573.m35161(3);
            int iM35165 = (c14573.m35163(11) + 1) * 2;
            int iM35167 = c14573.m35163(2);
            if (iM35167 == 3) {
                i8 = f51644[c14573.m35163(2)];
                i7 = 6;
                iM35163 = 3;
            } else {
                iM35163 = c14573.m35163(2);
                i7 = f51645[iM35163];
                i8 = iArr2[iM35167];
            }
            int i16 = i7 * 256;
            int i17 = (iM35165 * i8) / (i7 * 32);
            int iM35168 = c14573.m35163(3);
            boolean zM35162 = c14573.m35162();
            int i18 = iArr[iM35168] + (zM35162 ? 1 : 0);
            c14573.m35161(10);
            if (c14573.m35162()) {
                c14573.m35161(8);
            }
            if (iM35168 == 0) {
                c14573.m35161(5);
                if (c14573.m35162()) {
                    c14573.m35161(8);
                }
            }
            if (i15 == 1 && c14573.m35162()) {
                c14573.m35161(16);
            }
            if (c14573.m35162()) {
                if (iM35168 > 2) {
                    c14573.m35161(2);
                }
                if ((iM35168 & 1) == 0 || iM35168 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    c14573.m35161(6);
                }
                if ((iM35168 & 4) != 0) {
                    c14573.m35161(i10);
                }
                if (zM35162 && c14573.m35162()) {
                    c14573.m35161(5);
                }
                if (i15 == 0) {
                    if (c14573.m35162()) {
                        i11 = 6;
                        c14573.m35161(6);
                    } else {
                        i11 = 6;
                    }
                    if (iM35168 == 0 && c14573.m35162()) {
                        c14573.m35161(i11);
                    }
                    if (c14573.m35162()) {
                        c14573.m35161(i11);
                    }
                    int iM35169 = c14573.m35163(2);
                    if (iM35169 == 1) {
                        c14573.m35161(5);
                    } else if (iM35169 == 2) {
                        c14573.m35161(12);
                    } else {
                        if (iM35169 == 3) {
                            int iM351610 = c14573.m35163(5);
                            if (c14573.m35162()) {
                                c14573.m35161(5);
                                if (c14573.m35162()) {
                                    i13 = 4;
                                    c14573.m35161(4);
                                } else {
                                    i13 = 4;
                                }
                                if (c14573.m35162()) {
                                    c14573.m35161(i13);
                                }
                                if (c14573.m35162()) {
                                    c14573.m35161(i13);
                                }
                                if (c14573.m35162()) {
                                    c14573.m35161(i13);
                                }
                                if (c14573.m35162()) {
                                    c14573.m35161(i13);
                                }
                                if (c14573.m35162()) {
                                    c14573.m35161(i13);
                                }
                                if (c14573.m35162()) {
                                    c14573.m35161(i13);
                                }
                                if (c14573.m35162()) {
                                    if (c14573.m35162()) {
                                        c14573.m35161(i13);
                                    }
                                    if (c14573.m35162()) {
                                        c14573.m35161(i13);
                                    }
                                }
                            }
                            if (c14573.m35162()) {
                                c14573.m35161(5);
                                if (c14573.m35162()) {
                                    c14573.m35161(7);
                                    if (c14573.m35162()) {
                                        c14573.m35161(8);
                                    }
                                }
                            }
                            i12 = 2;
                            c14573.m35161((iM351610 + 2) * 8);
                            c14573.m35164();
                        }
                        if (iM35168 < i12) {
                            if (c14573.m35162()) {
                                c14573.m35161(14);
                            }
                            if (iM35168 == 0 && c14573.m35162()) {
                                c14573.m35161(14);
                            }
                        }
                        if (c14573.m35162()) {
                            if (iM35163 == 0) {
                                c14573.m35161(5);
                            } else {
                                for (i14 = 0; i14 < i7; i14++) {
                                    if (c14573.m35162()) {
                                        c14573.m35161(5);
                                    }
                                }
                            }
                        }
                    }
                    i12 = 2;
                    if (iM35168 < i12) {
                        if (c14573.m35162()) {
                            c14573.m35161(14);
                        }
                        if (iM35168 == 0) {
                            c14573.m35161(14);
                        }
                    }
                    if (c14573.m35162()) {
                        if (iM35163 == 0) {
                            c14573.m35161(5);
                        } else {
                            while (i14 < i7) {
                                if (c14573.m35162()) {
                                    c14573.m35161(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c14573.m35162()) {
                c14573.m35161(5);
                if (iM35168 == 2) {
                    c14573.m35161(4);
                }
                if (iM35168 >= 6) {
                    c14573.m35161(2);
                }
                if (c14573.m35162()) {
                    c14573.m35161(8);
                }
                if (iM35168 == 0 && c14573.m35162()) {
                    c14573.m35161(8);
                }
                if (iM35167 < 3) {
                    c14573.m35159();
                }
            }
            if (i15 == 0 && iM35163 != 3) {
                c14573.m35159();
            }
            if (i15 == 2 && (iM35163 == 3 || c14573.m35162())) {
                i9 = 6;
                c14573.m35161(6);
            } else {
                i9 = 6;
            }
            str = (c14573.m35162() && c14573.m35163(i9) == 1 && c14573.m35163(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i18;
            i3 = i8;
            i4 = iM35165;
            i6 = i16;
            i5 = i17;
        } else {
            c14573.m35161(32);
            int iM351611 = c14573.m35163(2);
            String str2 = iM351611 == 3 ? null : "audio/ac3";
            int iM351612 = c14573.m35163(6);
            int i19 = f51641[iM351612 / 2] * 1000;
            int iM37857 = m37857(iM351611, iM351612);
            c14573.m35161(8);
            int iM351613 = c14573.m35163(3);
            if ((iM351613 & 1) == 0 || iM351613 == 1) {
                i = 2;
            } else {
                i = 2;
                c14573.m35161(2);
            }
            if ((iM351613 & 4) != 0) {
                c14573.m35161(i);
            }
            if (iM351613 == i) {
                c14573.m35161(i);
            }
            i15 = iM351611 < 3 ? iArr2[iM351611] : -1;
            i2 = iArr[iM351613] + (c14573.m35162() ? 1 : 0);
            str = str2;
            i3 = i15;
            i4 = iM37857;
            i5 = i19;
            i6 = 1536;
        }
        return new C17374(str, i2, i3, i4, i6, i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37859(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m37857((b & 192) >> 6, b & 63);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37858(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f51645[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & UTF8.S_P3A) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37857(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f51646[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f51643[i3]) * 2;
        }
        int i5 = f51641[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
