package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۡۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88T8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8634 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f29789 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f29791 = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f29787 = {64, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 192, BERTags.FLAGS, 256, MLKEMEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f29793 = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f29786 = {5, 8, 10, 12};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f29788 = {6, 9, 12, 15};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f29790 = {2, 4, 6, 8};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int[] f29794 = {9, 11, 13, 16};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int[] f29792 = {5, 8, 10, 12};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7648 m22430(int i, String str, String str2, String str3, byte[] bArr) {
        C11634 c11634M22431 = m22431(bArr);
        c11634M22431.m29034(60);
        int i2 = f29789[c11634M22431.m29039(6)];
        int i3 = f29791[c11634M22431.m29039(4)];
        int iM29039 = c11634M22431.m29039(5);
        int i4 = iM29039 >= 29 ? -1 : (f29787[iM29039] * 1000) / 2;
        c11634M22431.m29034(10);
        int i5 = i2 + (c11634M22431.m29039(2) > 0 ? 1 : 0);
        C10471 c10471 = new C10471();
        c10471.m26516(str);
        c10471.m26521(str3);
        c10471.m26533("audio/vnd.dts");
        c10471.m26515(i4);
        c10471.m26494(i5);
        c10471.m26511(i3);
        c10471.m26506((C8354) null);
        c10471.m26509(str2);
        c10471.m26513(i);
        return c10471.m26497();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C19217 m22434(byte[] bArr) throws C22861 {
        int i;
        int i2;
        int iM29039;
        int iM290310;
        int i3;
        long jM41830;
        int i4;
        C11634 c11634M22431 = m22431(bArr);
        c11634M22431.m29034(40);
        int iM290311 = c11634M22431.m29039(2);
        if (c11634M22431.m29035()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        c11634M22431.m29034(i2);
        int iM290312 = c11634M22431.m29039(i) + 1;
        boolean zM29035 = c11634M22431.m29035();
        int i5 = 0;
        if (zM29035) {
            iM29039 = c11634M22431.m29039(2);
            int iM290313 = (c11634M22431.m29039(3) + 1) * 512;
            if (c11634M22431.m29035()) {
                c11634M22431.m29034(36);
            }
            int iM290314 = c11634M22431.m29039(3) + 1;
            int iM290315 = c11634M22431.m29039(3) + 1;
            if (iM290314 != 1 || iM290315 != 1) {
                throw C22861.m50611("Multiple audio presentations or assets not supported");
            }
            int i6 = iM290311 + 1;
            int iM290316 = c11634M22431.m29039(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((iM290316 >> i7) & 1) == 1) {
                    c11634M22431.m29034(8);
                }
            }
            if (c11634M22431.m29035()) {
                c11634M22431.m29034(2);
                int iM290317 = (c11634M22431.m29039(2) + 1) << 2;
                int iM290318 = c11634M22431.m29039(2) + 1;
                while (i5 < iM290318) {
                    c11634M22431.m29034(iM290317);
                    i5++;
                }
            }
            i5 = iM290313;
        } else {
            iM29039 = -1;
        }
        c11634M22431.m29034(i);
        c11634M22431.m29034(12);
        if (zM29035) {
            if (c11634M22431.m29035()) {
                c11634M22431.m29034(4);
            }
            if (c11634M22431.m29035()) {
                c11634M22431.m29034(24);
            }
            if (c11634M22431.m29035()) {
                c11634M22431.m29043(c11634M22431.m29039(10) + 1);
            }
            c11634M22431.m29034(5);
            i3 = f29793[c11634M22431.m29039(4)];
            iM290310 = c11634M22431.m29039(8) + 1;
        } else {
            iM290310 = -1;
            i3 = SecP160R1Field.PInv;
        }
        if (zM29035) {
            if (iM29039 == 0) {
                i4 = 32000;
            } else if (iM29039 == 1) {
                i4 = 44100;
            } else {
                if (iM29039 != 2) {
                    throw C22861.m50610("Unsupported reference clock code in DTS HD header: " + iM29039, (Throwable) null);
                }
                i4 = 48000;
            }
            long j = i4;
            String str = C17983.f57504;
            jM41830 = C17983.m41830(i5, 1000000L, j, RoundingMode.DOWN);
        } else {
            jM41830 = -9223372036854775807L;
        }
        return new C19217(iM290310, i3, iM290312, jM41830, "audio/vnd.dts.hd;profile=lbr");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m22433(byte[] bArr) {
        C11634 c11634M22431 = m22431(bArr);
        c11634M22431.m29034(42);
        return c11634M22431.m29039(c11634M22431.m29035() ? 12 : 8) + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19217 m22432(byte[] bArr, AtomicInteger atomicInteger) throws C22861 {
        long jM41830;
        int iM29039;
        int i;
        int i2;
        C11634 c11634M22431 = m22431(bArr);
        int i3 = c11634M22431.m29039(32) == 1078008818 ? 1 : 0;
        int iM22429 = m22429(c11634M22431, f29786);
        int i4 = iM22429 + 1;
        if (i3 == 0) {
            jM41830 = -9223372036854775807L;
            iM29039 = SecP160R1Field.PInv;
        } else {
            if (!c11634M22431.m29035()) {
                throw C22861.m50611("Only supports full channel mask-based audio presentation");
            }
            int i5 = iM22429 - 1;
            if (((bArr[iM22429] & 255) | ((bArr[i5] << 8) & 65535)) == C17983.m41817(i5, bArr)) {
                int iM290310 = c11634M22431.m29039(2);
                if (iM290310 == 0) {
                    i = 512;
                } else if (iM290310 == 1) {
                    i = 480;
                } else {
                    if (iM290310 != 2) {
                        throw C22861.m50610("Unsupported base duration index in DTS UHD header: " + iM290310, (Throwable) null);
                    }
                    i = MLKEMEngine.KyberPolyBytes;
                }
                int iM290311 = (c11634M22431.m29039(3) + 1) * i;
                int iM290312 = c11634M22431.m29039(2);
                if (iM290312 == 0) {
                    i2 = 32000;
                } else if (iM290312 == 1) {
                    i2 = 44100;
                } else {
                    if (iM290312 != 2) {
                        throw C22861.m50610("Unsupported clock rate index in DTS UHD header: " + iM290312, (Throwable) null);
                    }
                    i2 = 48000;
                }
                if (c11634M22431.m29035()) {
                    c11634M22431.m29034(36);
                }
                iM29039 = (1 << c11634M22431.m29039(2)) * i2;
                jM41830 = C17983.m41830(iM290311, 1000000L, i2, RoundingMode.DOWN);
            } else {
                throw C22861.m50610("CRC check failed", (Throwable) null);
            }
        }
        int iM224210 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            iM224210 += m22429(c11634M22431, f29788);
        }
        if (i3 != 0) {
            atomicInteger.set(m22429(c11634M22431, f29790));
        }
        return new C19217(2, iM29039, iM224210 + (atomicInteger.get() != 0 ? m22429(c11634M22431, f29794) : 0) + i4, jM41830, "audio/vnd.dts.uhd;profile=p2");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m22428(byte[] bArr) {
        C11634 c11634M22431 = m22431(bArr);
        c11634M22431.m29034(32);
        return m22429(c11634M22431, f29792) + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22429(C11634 c11634, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c11634.m29035(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c11634.m29039(iArr[i]) + i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11634 m22431(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C11634(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        C11634 c11634 = new C11634(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C11634 c11635 = new C11634(bArrCopyOf, bArrCopyOf.length);
            while (c11635.m29030() >= 16) {
                c11635.m29034(2);
                c11634.m29031(c11635.m29039(14));
            }
        }
        c11634.m29038(bArrCopyOf.length, bArrCopyOf);
        return c11634;
    }
}
