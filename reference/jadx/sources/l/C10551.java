package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۤ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88T8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10551 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f33531 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f33533 = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f33538 = {64, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 192, BERTags.FLAGS, 256, MLKEMEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f33537 = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f33534 = {5, 8, 10, 12};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f33530 = {6, 9, 12, 15};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f33536 = {2, 4, 6, 8};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f33535 = {9, 11, 13, 16};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f33532 = {5, 8, 10, 12};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15648 m26999(int i, String str, String str2, String str3, byte[] bArr) {
        C14573 c14573M26998 = m26998(bArr);
        c14573M26998.m35161(60);
        int i2 = f33531[c14573M26998.m35163(6)];
        int i3 = f33533[c14573M26998.m35163(4)];
        int iM35163 = c14573M26998.m35163(5);
        int i4 = iM35163 >= 29 ? -1 : (f33538[iM35163] * 1000) / 2;
        c14573M26998.m35161(10);
        int i5 = i2 + (c14573M26998.m35163(2) > 0 ? 1 : 0);
        C20124 c20124 = new C20124();
        c20124.m46309(str);
        c20124.m46327(str3);
        c20124.m46315("audio/vnd.dts");
        c20124.m46308(i4);
        c20124.m46329(i5);
        c20124.m46332(i3);
        c20124.m46304((C22362) null);
        c20124.m46321(str2);
        c20124.m46311(i);
        return c20124.m46295();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21740 m27002(byte[] bArr) throws C2970 {
        int i;
        int i2;
        int iM35163;
        int iM35164;
        int i3;
        long jM19477;
        int i4;
        C14573 c14573M26998 = m26998(bArr);
        c14573M26998.m35161(40);
        int iM35165 = c14573M26998.m35163(2);
        if (c14573M26998.m35162()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        c14573M26998.m35161(i2);
        int iM35166 = c14573M26998.m35163(i) + 1;
        boolean zM35162 = c14573M26998.m35162();
        int i5 = 0;
        if (zM35162) {
            iM35163 = c14573M26998.m35163(2);
            int iM35167 = (c14573M26998.m35163(3) + 1) * 512;
            if (c14573M26998.m35162()) {
                c14573M26998.m35161(36);
            }
            int iM35168 = c14573M26998.m35163(3) + 1;
            int iM35169 = c14573M26998.m35163(3) + 1;
            if (iM35168 != 1 || iM35169 != 1) {
                throw C2970.m9689("Multiple audio presentations or assets not supported");
            }
            int i6 = iM35165 + 1;
            int iM351610 = c14573M26998.m35163(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((iM351610 >> i7) & 1) == 1) {
                    c14573M26998.m35161(8);
                }
            }
            if (c14573M26998.m35162()) {
                c14573M26998.m35161(2);
                int iM351611 = (c14573M26998.m35163(2) + 1) << 2;
                int iM351612 = c14573M26998.m35163(2) + 1;
                while (i5 < iM351612) {
                    c14573M26998.m35161(iM351611);
                    i5++;
                }
            }
            i5 = iM35167;
        } else {
            iM35163 = -1;
        }
        c14573M26998.m35161(i);
        c14573M26998.m35161(12);
        if (zM35162) {
            if (c14573M26998.m35162()) {
                c14573M26998.m35161(4);
            }
            if (c14573M26998.m35162()) {
                c14573M26998.m35161(24);
            }
            if (c14573M26998.m35162()) {
                c14573M26998.m35160(c14573M26998.m35163(10) + 1);
            }
            c14573M26998.m35161(5);
            i3 = f33537[c14573M26998.m35163(4)];
            iM35164 = c14573M26998.m35163(8) + 1;
        } else {
            iM35164 = -1;
            i3 = SecP160R1Field.PInv;
        }
        if (zM35162) {
            if (iM35163 == 0) {
                i4 = 32000;
            } else if (iM35163 == 1) {
                i4 = 44100;
            } else {
                if (iM35163 != 2) {
                    throw C2970.m9688("Unsupported reference clock code in DTS HD header: " + iM35163, (Throwable) null);
                }
                i4 = 48000;
            }
            long j = i4;
            String str = C7116.f23455;
            jM19477 = C7116.m19477(i5, 1000000L, j, RoundingMode.DOWN);
        } else {
            jM19477 = -9223372036854775807L;
        }
        return new C21740(iM35164, i3, iM35166, jM19477, "audio/vnd.dts.hd;profile=lbr");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m27001(byte[] bArr) {
        C14573 c14573M26998 = m26998(bArr);
        c14573M26998.m35161(42);
        return c14573M26998.m35163(c14573M26998.m35162() ? 12 : 8) + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21740 m27000(byte[] bArr, AtomicInteger atomicInteger) throws C2970 {
        long jM19477;
        int iM35163;
        int i;
        int i2;
        C14573 c14573M26998 = m26998(bArr);
        int i3 = c14573M26998.m35163(32) == 1078008818 ? 1 : 0;
        int iM26997 = m26997(c14573M26998, f33534);
        int i4 = iM26997 + 1;
        if (i3 == 0) {
            jM19477 = -9223372036854775807L;
            iM35163 = SecP160R1Field.PInv;
        } else {
            if (!c14573M26998.m35162()) {
                throw C2970.m9689("Only supports full channel mask-based audio presentation");
            }
            int i5 = iM26997 - 1;
            if (((bArr[iM26997] & 255) | ((bArr[i5] << 8) & 65535)) == C7116.m19464(i5, bArr)) {
                int iM35164 = c14573M26998.m35163(2);
                if (iM35164 == 0) {
                    i = 512;
                } else if (iM35164 == 1) {
                    i = 480;
                } else {
                    if (iM35164 != 2) {
                        throw C2970.m9688("Unsupported base duration index in DTS UHD header: " + iM35164, (Throwable) null);
                    }
                    i = MLKEMEngine.KyberPolyBytes;
                }
                int iM35165 = (c14573M26998.m35163(3) + 1) * i;
                int iM35166 = c14573M26998.m35163(2);
                if (iM35166 == 0) {
                    i2 = 32000;
                } else if (iM35166 == 1) {
                    i2 = 44100;
                } else {
                    if (iM35166 != 2) {
                        throw C2970.m9688("Unsupported clock rate index in DTS UHD header: " + iM35166, (Throwable) null);
                    }
                    i2 = 48000;
                }
                if (c14573M26998.m35162()) {
                    c14573M26998.m35161(36);
                }
                iM35163 = (1 << c14573M26998.m35163(2)) * i2;
                jM19477 = C7116.m19477(iM35165, 1000000L, i2, RoundingMode.DOWN);
            } else {
                throw C2970.m9688("CRC check failed", (Throwable) null);
            }
        }
        int iM26998 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            iM26998 += m26997(c14573M26998, f33530);
        }
        if (i3 != 0) {
            atomicInteger.set(m26997(c14573M26998, f33536));
        }
        return new C21740(2, iM35163, iM26998 + (atomicInteger.get() != 0 ? m26997(c14573M26998, f33535) : 0) + i4, jM19477, "audio/vnd.dts.uhd;profile=p2");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m27003(byte[] bArr) {
        C14573 c14573M26998 = m26998(bArr);
        c14573M26998.m35161(32);
        return m26997(c14573M26998, f33532) + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26997(C14573 c14573, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c14573.m35162(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c14573.m35163(iArr[i]) + i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14573 m26998(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C14573(bArr, bArr.length);
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
        C14573 c14573 = new C14573(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C14573 c14574 = new C14573(bArrCopyOf, bArrCopyOf.length);
            while (c14574.m35152() >= 16) {
                c14574.m35161(2);
                c14573.m35153(c14574.m35163(14));
            }
        }
        c14573.m35158(bArrCopyOf.length, bArrCopyOf);
        return c14573;
    }
}
