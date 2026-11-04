package l;

import android.os.Build;
import com.alipay.sdk.m.p.a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.bouncycastle.math.ec.custom.sec.SecP192K1Field;

/* JADX INFO: renamed from: l.ۡۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 96NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9303 {

    /* JADX INFO: renamed from: ֡᩻۠, reason: not valid java name and contains not printable characters */
    private static final short[] f30236 = {7892, 22889, 22907, 22892, 22902, 22889, 22898, 22906, 22896, 890, -18953, -18959, -18969, -18960, -18979, -18964, -18973, -18961, -18969, -18953, -18959, -18969, -18960, -18979, -18961, -18973, -18975, -18966, -19024, -19007, -18973, -18964, -18964, -18963, -18954, -19038, -18959, -18973, -18956, -18969, -19038, -18962, -18963, -18975, -18973, -18962, -19038, -18962, -18963, -18971, -18965, -18964, -19038, -18965, -18970, -18969, -18964, -18954, -18965, -18954, -18949, 5020, -25459, -25461, -25443, -25462, -25433, -25451, -25447, -25445, -25456, -25398};

    /* JADX WARN: Code duplicated, block: B:62:0x025f A[PHI: r1 r6 r7 r11 r13 r14 r15 r19
      0x025f: PHI (r1v4 l.ᩳ֫ܺ) = (r1v2 l.ᩳ֫ܺ), (r1v3 l.ᩳ֫ܺ), (r1v2 l.ᩳ֫ܺ), (r1v2 l.ᩳ֫ܺ) binds: [B:61:0x025d, B:46:0x01a0, B:34:0x010b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:61:0x025d, B:46:0x01a0, B:34:0x010b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:61:0x025d, B:46:0x01a0, B:34:0x010b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:61:0x025d, B:46:0x01a0, B:34:0x010b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:61:0x025d, B:46:0x01a0, B:34:0x010b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:61:0x025d, B:46:0x01a0, B:34:0x010b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:61:0x025d, B:46:0x01a0, B:34:0x010b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r19v14 char) = (r19v3 char), (r19v9 char), (r19v11 char), (r19v16 char) binds: [B:61:0x025d, B:46:0x01a0, B:34:0x010b, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24530(String str) throws IOException {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        char c;
        int iM2762;
        int i5;
        int i6;
        int iM2763;
        int i7;
        int i8 = AbstractC0641.f2496;
        int i9 = C4282.f15546;
        int iM2764 = (C0619.m2761("᩺᩵") ^ i8) * (-61);
        int i10 = ((iM2764 ^ i9) * 7243) ^ (-899282990);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = iM2764 ^ 1898323265;
        char c2 = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        short s3 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -871704842;
        String strM2361 = null;
        InterfaceC18752 interfaceC18752M9665 = null;
        InterfaceC18752 interfaceC18752M11489 = null;
        while (true) {
            i17 = i11 ^ (i10 & (((i17 ^ i9) * (-13549)) >> 31));
            switch (i17) {
                case -2140155998:
                case 748823610:
                    C2702.m8876();
                    return;
                case -2086204455:
                case 1833304766:
                    c2 = c2;
                    interfaceC18752M11489 = C3492.m11489(C21576.f68931);
                    sArr2 = f30236;
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0619.m2761("ܽ᩸") ^ i9;
                        i = ((iM2761 ^ i8) * (-3941)) ^ (-757881280);
                        i2 = 1476365716;
                    } else {
                        iM2761 = C0619.m2761("᩸ᩴ") ^ i9;
                        i = ((iM2761 ^ i8) * (-19667)) ^ (-1862958549);
                        i2 = -1630329631;
                    }
                    char c3 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c3;
                    break;
                case -1788659122:
                case 1935460442:
                    C4238.m13540();
                    if (C2375.f7641 <= 0) {
                        interfaceC18752M11489 = interfaceC18752M11489;
                        c = c2;
                        iM2762 = (i8 - C0773.m3169("ۧ۬")) * (-47);
                        i5 = ((iM2762 ^ i9) * 8175) ^ (-626714332);
                        i6 = -844320249;
                        int i18 = iM2762 ^ i6;
                        c2 = c;
                        i11 = i18;
                        i10 = i5;
                        interfaceC18752M11489 = interfaceC18752M11489;
                    }
                    iM2763 = C0773.m3169("ۢۜ") ^ i8;
                    i5 = ((iM2763 ^ i9) * 21935) ^ (-298939895);
                    i7 = -271888671;
                    i11 = iM2763 ^ i7;
                    i10 = i5;
                    interfaceC18752M11489 = interfaceC18752M11489;
                    break;
                case -1679047846:
                case -578931822:
                    interfaceC18752M11489 = interfaceC18752M11489;
                    c = c2;
                    sArr = f30236;
                    if (C1564.f5401 <= 0) {
                        iM2762 = (i8 - C0773.m3169("ۧ۬")) * (-47);
                        i5 = ((iM2762 ^ i9) * 8175) ^ (-626714332);
                        i6 = -844320249;
                    } else {
                        iM2762 = C0619.m2761("ۗ᩹") ^ i8;
                        i5 = ((iM2762 ^ i9) * (-16613)) ^ 44273997;
                        i6 = 1691368571;
                    }
                    int i19 = iM2762 ^ i6;
                    c2 = c;
                    i11 = i19;
                    i10 = i5;
                    interfaceC18752M11489 = interfaceC18752M11489;
                    break;
                case -1627168655:
                case -1441589520:
                    i13 = 20047;
                    iM2761 = C0773.m3169("ۨ֫") ^ i8;
                    i = ((iM2761 ^ i9) * (-31389)) ^ (-1128006261);
                    i2 = 158483944;
                    char c4 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c4;
                    break;
                case -1516415708:
                case 1319195753:
                    c2 = c2;
                    strM2361 = C0487.m2361(sArr3, i15, i16, i13);
                    if (C2375.f7641 > 0) {
                        iM3169 = C0619.m2761("ܳ۫") ^ i8;
                        i3 = ((iM3169 ^ i9) * 10823) ^ (-548120883);
                        i4 = -953918667;
                        int i20 = iM3169 ^ i4;
                        c2 = c2;
                        i11 = i20;
                        i10 = i3;
                    } else {
                        iM2761 = C0619.m2761("ܺ۠") ^ i9;
                        i = ((iM2761 ^ i8) * (-22343)) ^ 1264357727;
                        i2 = -1712775734;
                        char c5 = c2;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        c2 = c5;
                    }
                    break;
                case -1479785222:
                case -417644115:
                    i13 = 46466;
                    iM2761 = C0773.m3169("ۨ֫") ^ i8;
                    i = ((iM2761 ^ i9) * (-31389)) ^ (-1128006261);
                    i2 = 158483944;
                    char c6 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c6;
                    break;
                case -1399846007:
                case -1166815607:
                    c2 = c2;
                    s = sArr[c2];
                    s2 = 17396;
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ܽ᩸") ^ i9;
                        i = ((iM2761 ^ i8) * (-3941)) ^ (-757881280);
                        i2 = 1476365716;
                    } else {
                        iM2761 = (C0619.m2761("᩻ܺ") + i9) * (-25);
                        i = ((iM2761 ^ i8) * (-17419)) ^ 146089776;
                        i2 = 622144130;
                    }
                    char c7 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c7;
                    break;
                case -1166813944:
                case 1895837340:
                    c2 = c2;
                    i14 = 10;
                    if (!C1146.m4231()) {
                        c2 = c2;
                        iM2763 = C0773.m3169("ۢۜ") ^ i8;
                        i5 = ((iM2763 ^ i9) * 21935) ^ (-298939895);
                        i7 = -271888671;
                        i11 = iM2763 ^ i7;
                        i10 = i5;
                        interfaceC18752M11489 = interfaceC18752M11489;
                    } else {
                        iM2761 = C0619.m2761("ۖۧ") ^ i8;
                        i = ((iM2761 ^ i9) * (-1517)) ^ (-1850712215);
                        i2 = -392052304;
                        char c8 = c2;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        c2 = c8;
                    }
                    break;
                case -1119206343:
                case -877674017:
                    C3448.m11248();
                    if (C1826.m6301() >= 0) {
                        c2 = c2;
                        iM2761 = C0619.m2761("ܽ᩸") ^ i9;
                        i = ((iM2761 ^ i8) * (-3941)) ^ (-757881280);
                        i2 = 1476365716;
                        char c9 = c2;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        c2 = c9;
                    }
                    c2 = c2;
                    iM2761 = C0619.m2761("᩺ۧ") ^ i9;
                    i = ((iM2761 ^ i8) * 6051) ^ 903496582;
                    i2 = -1529918694;
                    char c10 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c10;
                    break;
                case -1103626170:
                case 1331606682:
                    RunnableC3055.m9933();
                    if (C23916.m53419() != 0) {
                        iM2763 = C0773.m3169("ۢۜ") ^ i8;
                        i5 = ((iM2763 ^ i9) * 21935) ^ (-298939895);
                        i7 = -271888671;
                        i11 = iM2763 ^ i7;
                        i10 = i5;
                        interfaceC18752M11489 = interfaceC18752M11489;
                    } else {
                        c2 = c2;
                        iM2761 = C0619.m2761("᩺ۧ") ^ i9;
                        i = ((iM2761 ^ i8) * 6051) ^ 903496582;
                        i2 = -1529918694;
                        char c11 = c2;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        c2 = c11;
                    }
                    break;
                case -1031066904:
                case 1319394670:
                    c2 = c2;
                    int i21 = s + s2;
                    i12 = i21 * i21;
                    s3 = 69584;
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("᩺ۧ") ^ i9;
                        i = ((iM2761 ^ i8) * 6051) ^ 903496582;
                        i2 = -1529918694;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i8;
                        i = ((iM2761 ^ i9) * 575) ^ (-1769148104);
                        i2 = -1698461701;
                    }
                    char c12 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c12;
                    break;
                case -770717727:
                case -301644021:
                    c2 = '\t';
                    if (C2834.f9334 <= 0) {
                        iM2763 = C0773.m3169("ۢۜ") ^ i8;
                        i5 = ((iM2763 ^ i9) * 21935) ^ (-298939895);
                        i7 = -271888671;
                    } else {
                        iM2763 = C0619.m2761("ܽۜ") ^ i9;
                        i5 = ((iM2763 ^ i8) * (-14863)) ^ (-897268392);
                        i7 = -2009902173;
                    }
                    i11 = iM2763 ^ i7;
                    i10 = i5;
                    interfaceC18752M11489 = interfaceC18752M11489;
                    break;
                case -621395464:
                case 1651805843:
                    c2 = c2;
                    interfaceC18752M9665 = C2966.m9665(interfaceC18752M11489, C3779.m12266(sArr2, i14, 9, i13), str);
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ܺ۠") ^ i9;
                        i = ((iM2761 ^ i8) * (-22343)) ^ 1264357727;
                        i2 = -1712775734;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩻") ^ i9;
                        i = ((iM2761 ^ i8) * 24621) ^ 776150503;
                        i2 = 1179002349;
                    }
                    char c13 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c13;
                    break;
                case -18438767:
                case 1245980671:
                    return;
                case 269942038:
                case 1516020774:
                    c2 = c2;
                    if (i12 - (s * s3) < 0) {
                        iM2761 = C0773.m3169("ܶ᩵") ^ i8;
                        i = ((iM2761 ^ i9) * (-29139)) ^ (-168682055);
                        i2 = 549878525;
                    } else {
                        iM2761 = (C0773.m3169("ۗ᩵") + i9) * (-9);
                        i = ((iM2761 ^ i8) * (-10875)) ^ (-1391152620);
                        i2 = 301572399;
                    }
                    char c14 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c14;
                    break;
                case 1215999795:
                case 1696466729:
                    C4282.m13644();
                    c2 = c2;
                    iM2761 = C0619.m2761("᩺ۧ") ^ i9;
                    i = ((iM2761 ^ i8) * 6051) ^ 903496582;
                    i2 = -1529918694;
                    char c15 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c15;
                    break;
                case 1307650271:
                case 1915866795:
                    c2 = c2;
                    if (C3077.m10040(interfaceC18752M9665, strM2361, m24529()).commit()) {
                        iM3169 = (C0773.m3169("᩵֡") + i9) * 65;
                        i3 = ((iM3169 ^ i8) * 23285) ^ (-497194623);
                        i4 = -1333554000;
                    } else {
                        iM3169 = C0773.m3169("ۖܺ") ^ i8;
                        i3 = ((iM3169 ^ i9) * (-9697)) ^ 254958885;
                        i4 = 2122373713;
                    }
                    int i22 = iM3169 ^ i4;
                    c2 = c2;
                    i11 = i22;
                    i10 = i3;
                    break;
                case 1659204765:
                case 2016879520:
                    c2 = c2;
                    sArr3 = f30236;
                    i15 = 19;
                    i16 = 10;
                    if (C0269.m1775() > 0) {
                        iM3169 = (i9 - C0773.m3169("᩹۬")) * 11;
                        i3 = ((iM3169 ^ i8) * 8883) ^ (-1145358431);
                        i4 = -599461121;
                        int i23 = iM3169 ^ i4;
                        c2 = c2;
                        i11 = i23;
                        i10 = i3;
                    } else {
                        iM2761 = C0619.m2761("ܽ᩸") ^ i9;
                        i = ((iM2761 ^ i8) * (-3941)) ^ (-757881280);
                        i2 = 1476365716;
                        char c16 = c2;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        c2 = c16;
                    }
                    break;
                default:
                    short[] sArr4 = f30236;
                    c2 = c2;
                    if (!RunnableC1848.f6235) {
                        throw new IOException(C1146.m4222(sArr4, 29, 32, i13));
                    }
                    iM2761 = C0619.m2761("᩺ۧ") ^ i9;
                    i = ((iM2761 ^ i8) * 6051) ^ 903496582;
                    i2 = -1529918694;
                    char c17 = c2;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    c2 = c17;
                    break;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[PHI: r14 r15
      0x00c2: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:28:0x00c0, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:28:0x00c0, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ae A[PHI: r1 r2 r3 r4 r10
      0x01ae: PHI (r1v4 java.lang.String) = 
      (r1v2 java.lang.String)
      (r1v3 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
     binds: [B:51:0x01ac, B:36:0x0118, B:24:0x00a0, B:18:0x0080, B:16:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r2v4 l.ۢ֫ܺ) = (r2v2 l.ۢ֫ܺ), (r2v3 l.ۢ֫ܺ), (r2v2 l.ۢ֫ܺ), (r2v2 l.ۢ֫ܺ), (r2v2 l.ۢ֫ܺ) binds: [B:51:0x01ac, B:36:0x0118, B:24:0x00a0, B:18:0x0080, B:16:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:51:0x01ac, B:36:0x0118, B:24:0x00a0, B:18:0x0080, B:16:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r4v4 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:51:0x01ac, B:36:0x0118, B:24:0x00a0, B:18:0x0080, B:16:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:51:0x01ac, B:36:0x0118, B:24:0x00a0, B:18:0x0080, B:16:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01e2 A[PHI: r9 r11 r13
      0x01e2: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:55:0x01e0, B:47:0x018d, B:32:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:55:0x01e0, B:47:0x018d, B:32:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:55:0x01e0, B:47:0x018d, B:32:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024e A[PHI: r6 r7 r8 r20
      0x024e: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:64:0x024c, B:60:0x022c, B:16:0x007c, B:12:0x0060, B:9:0x005a, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:64:0x024c, B:60:0x022c, B:16:0x007c, B:12:0x0060, B:9:0x005a, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r8v3 short) = (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v5 short) binds: [B:64:0x024c, B:60:0x022c, B:16:0x007c, B:12:0x0060, B:9:0x005a, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x024c, B:60:0x022c, B:16:0x007c, B:12:0x0060, B:9:0x005a, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m24531() {
        int iM2761;
        int i;
        int i2;
        int i3 = C1519.f5300;
        int i4 = C3033.f9831;
        int iM2762 = (C0619.m2761("ۙᩴ") + i3) * 51;
        int i5 = ((iM2762 ^ i4) * (-28159)) ^ 393417088;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ 724300724;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1119024859;
        String str = null;
        String strM2049 = null;
        InterfaceC9801 interfaceC9801 = null;
        String strM24529 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 20441) >> 31));
            switch (i13) {
                case -2057156143:
                case -1970463220:
                    i10 = 59715;
                    iM2761 = (i4 - C0619.m2761("ۗ᩶")) * (-11);
                    i = ((iM2761 ^ i3) * 28153) ^ (-1199714807);
                    i2 = 644333363;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1957890147:
                case 1206233052:
                    sArr2 = f30236;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("۫۬") + i3) * 7;
                        i = ((iM2761 ^ i4) * 24885) ^ 588273249;
                        i2 = -1198206488;
                    } else {
                        iM2761 = (C0619.m2761("۫ۨ") + i3) * (-55);
                        i = ((iM2761 ^ i4) * (-27997)) ^ (-1267885885);
                        i2 = -1364929329;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1953085637:
                case -1527828856:
                    C23916.m53419();
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("᩻ۙ") + i4) * (-95);
                        i = ((iM2761 ^ i3) * 5249) ^ 698098253;
                        i2 = 767903145;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩹᩷")) * 91;
                        i = ((iM2761 ^ i3) * (-30545)) ^ 1565429216;
                        i2 = 1081529710;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1745680364:
                case -1142163387:
                    strM24529 = m24529();
                    interfaceC9801 = C21576.f68931;
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("᩵ᩴ") ^ i3;
                        i = ((iM2761 ^ i4) * (-31185)) ^ (-103968299);
                        i2 = -771536675;
                    } else {
                        iM2761 = C0773.m3169("ܰܽ") ^ i3;
                        i = ((iM2761 ^ i4) * 14601) ^ 376080921;
                        i2 = 1412596143;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1743724924:
                case -553805341:
                    s = sArr[c];
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("᩻ۙ") + i4) * (-95);
                        i = ((iM2761 ^ i3) * 5249) ^ 698098253;
                        i2 = 767903145;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ۫") + i3) * 9;
                        i = ((iM2761 ^ i4) * (-27497)) ^ 670479571;
                        i2 = -1197261921;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1710812105:
                case -1083277682:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("᩵ᩴ") ^ i3;
                        i = ((iM2761 ^ i4) * (-31185)) ^ (-103968299);
                        i2 = -771536675;
                    } else {
                        iM2761 = (C0773.m3169("᩻ۙ") + i4) * (-95);
                        i = ((iM2761 ^ i3) * 5249) ^ 698098253;
                        i2 = 767903145;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1387415430:
                case -354297442:
                    sArr = f30236;
                    c = a.h;
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("᩻ۙ") + i4) * (-95);
                        i = ((iM2761 ^ i3) * 5249) ^ 698098253;
                        i2 = 767903145;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩸") ^ i4;
                        i = ((iM2761 ^ i3) * (-8595)) ^ 2008103258;
                        i2 = 2010100650;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1357271000:
                case 1791730454:
                    int i14 = s + s2;
                    i7 = i14 * i14;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("۫۬") + i3) * 7;
                        i = ((iM2761 ^ i4) * 24885) ^ 588273249;
                        i2 = -1198206488;
                    } else {
                        iM2761 = (C0773.m3169("ܽᩴ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i4) * (-7671)) ^ (-1083861108);
                        i2 = 1466874577;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1084991395:
                case 1134872095:
                    return C2419.m8175(strM24529, C2702.m8877(interfaceC9801, strM2049, str));
                case -957409924:
                case 938735406:
                    i9 = 1;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0773.m3169("۫۬") + i3) * 7;
                        i = ((iM2761 ^ i4) * 24885) ^ 588273249;
                        i2 = -1198206488;
                    } else {
                        iM2761 = (C0773.m3169("֨۟") ^ i4) * 55;
                        i = ((iM2761 ^ i3) * 18125) ^ 429686434;
                        i2 = -178574584;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -773923391:
                case 1120731227:
                    RunnableC3646.m11813();
                    iM2761 = C0773.m3169("᩵ᩴ") ^ i3;
                    i = ((iM2761 ^ i4) * (-31185)) ^ (-103968299);
                    i2 = -771536675;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -335905257:
                case -266150297:
                    i8 = s * 2;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("᩵ᩴ") ^ i3;
                        i = ((iM2761 ^ i4) * (-31185)) ^ (-103968299);
                        i2 = -771536675;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩻") ^ i3;
                        i = ((iM2761 ^ i4) * 2773) ^ 1018537575;
                        i2 = -393373851;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 40196266:
                case 681706463:
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("᩻ۙ") + i4) * (-95);
                        i = ((iM2761 ^ i3) * 5249) ^ 698098253;
                        i2 = 767903145;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩸") ^ i3;
                        i = ((iM2761 ^ i4) * 7321) ^ (-194833018);
                        i2 = 1611666611;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 122113319:
                case 1849546132:
                    strM2049 = RunnableC0334.m2049(sArr2, i11, i12, i10);
                    str = "";
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("ܶۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-1115)) ^ (-805050124);
                        i2 = -1401420834;
                    } else {
                        iM2761 = C0773.m3169("᩵ᩴ") ^ i3;
                        i = ((iM2761 ^ i4) * (-31185)) ^ (-103968299);
                        i2 = -771536675;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 226399869:
                case 1335211902:
                    C0619.m2763();
                    RunnableC3055.m9933();
                    return false;
                case 230948529:
                case 307548476:
                    i10 = 40184;
                    iM2761 = (i4 - C0619.m2761("ۗ᩶")) * (-11);
                    i = ((iM2761 ^ i3) * 28153) ^ (-1199714807);
                    i2 = 644333363;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 460766002:
                case 1429972915:
                    i11 = 62;
                    i12 = 10;
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ۢܺ") ^ i4;
                        i = ((iM2761 ^ i3) * 30703) ^ (-2143412080);
                        i2 = -392449515;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩹᩷")) * 91;
                        i = ((iM2761 ^ i3) * (-30545)) ^ 1565429216;
                        i2 = 1081529710;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1763562661:
                case 2101284787:
                    if ((i8 + i9) - i7 <= 0) {
                        iM2761 = C0773.m3169("ܳۘ") ^ i3;
                        i = ((iM2761 ^ i4) * (-7991)) ^ (-78380643);
                        i2 = -852842746;
                    } else {
                        iM2761 = (C0619.m2761("۟᩵") + i4) * 55;
                        i = ((iM2761 ^ i3) * (-14793)) ^ 1481363764;
                        i2 = 220025393;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    s2 = 1;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("᩻ۙ") + i4) * (-95);
                        i = ((iM2761 ^ i3) * 5249) ^ 698098253;
                        i2 = 767903145;
                    } else {
                        iM2761 = (C0619.m2761("֫ᩴ") ^ i4) * (-15);
                        i = ((iM2761 ^ i3) * 21885) ^ 1704287874;
                        i2 = 1561846139;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24529() {
        int iM2761;
        int i;
        int i2;
        String str;
        String str2;
        StringBuilder sb;
        int iM2762;
        int i3;
        int i4;
        int iM2763;
        int i5;
        int i6;
        int iM3169;
        int i7;
        int i8;
        AbstractC22044 abstractC22044;
        AbstractC22044 abstractC22044M1774 = null;
        StringBuilder sb2 = null;
        String str3 = null;
        String strM23910 = null;
        Charset charset = null;
        String strM36173 = null;
        int i9 = 0;
        int i10 = 0;
        String upperCase = null;
        String strM49871 = null;
        int i11 = 0;
        int i12 = -1518811789;
        int i13 = C2702.f8586;
        int i14 = C3033.f9831;
        int iM31610 = C0773.m3169("ۖۤ") ^ i14;
        int i15 = ((iM31610 ^ i13) * (-7595)) ^ 1650447456;
        int i16 = iM31610 ^ 1876387641;
        String str4 = null;
        String str5 = null;
        short[] sArr = null;
        int i17 = 0;
        int i18 = 0;
        short s = 0;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * (-30453)) >> 31));
            switch (i12) {
                case -2146722211:
                case 752002949:
                    abstractC22044M1774 = abstractC22044M1774;
                    StringBuilder sb3 = sb2;
                    str5 = str5;
                    short s2 = f30236[0];
                    if (C3077.f9998) {
                        int iM2764 = C0619.m2761("ᩳۖ") ^ i13;
                        str5 = str5;
                        s = s2;
                        i15 = ((iM2764 ^ i14) * 12035) ^ (-282875129);
                        sb2 = sb3;
                        i16 = iM2764 ^ 1548061456;
                        abstractC22044M1774 = abstractC22044M1774;
                    } else {
                        sb2 = sb3;
                        s = s2;
                        iM2763 = C0619.m2761("᩸۬") ^ i14;
                        i5 = ((iM2763 ^ i13) * (-25339)) ^ (-842298570);
                        i6 = 1449540534;
                        int i21 = iM2763 ^ i6;
                        str5 = str5;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i21;
                        i15 = i5;
                        abstractC22044M1774 = abstractC22044;
                    }
                    break;
                case -2030161823:
                case -1698902716:
                    strM36173 = C15022.m36173(C3779.m12260(strM23910, charset));
                    i9 = 0;
                    i10 = 16;
                    if (C1783.f6087 > 0) {
                        iM2761 = C0619.m2761("ܽۛ") ^ i13;
                        i = ((iM2761 ^ i14) * (-12557)) ^ 759684153;
                        i2 = 395964928;
                        i16 = iM2761 ^ i2;
                        i15 = i;
                    } else {
                        str2 = str5;
                        sb = sb2;
                        iM2762 = C0619.m2761("ۧᩳ") ^ i14;
                        i3 = ((iM2762 ^ i13) * 7961) ^ (-797674772);
                        i4 = 1385585535;
                        int i22 = iM2762 ^ i4;
                        str5 = str2;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i22;
                        i15 = i3;
                        sb2 = sb;
                        s = s;
                        abstractC22044M1774 = abstractC22044;
                    }
                    break;
                case -1980317415:
                case 1802364072:
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    int i23 = C21576.m49056().uid * 321;
                    if (C2288.f7433 > 0) {
                        iM3169 = (i13 - C0773.m3169("ۛܺ")) * (-5);
                        i20 = i23;
                        i15 = ((iM3169 ^ i14) * (-29435)) ^ 1801469271;
                        i7 = 1275815633;
                        i8 = iM3169 ^ i7;
                        str5 = str5;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i8;
                        abstractC22044M1774 = abstractC22044;
                    } else {
                        i20 = i23;
                        iM2763 = (i13 - C0619.m2761("ܿ᩸")) * (-109);
                        i5 = ((iM2763 ^ i14) * 3915) ^ (-198283890);
                        i6 = -1028143822;
                        int i24 = iM2763 ^ i6;
                        str5 = str5;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i24;
                        i15 = i5;
                        abstractC22044M1774 = abstractC22044;
                    }
                    break;
                case -1711333441:
                case -1119188807:
                    RunnableC0334.m2063();
                    C1321.m4852();
                    return null;
                case -1623434129:
                case 746721419:
                    str5 = str5;
                    C3779.m12258(sb2, Build.DEVICE);
                    C1783.m6234(sb2, Build.DISPLAY);
                    if (C1826.f6190 <= 0) {
                        abstractC22044M1774 = abstractC22044M1774;
                        iM2763 = (i13 - C0619.m2761("ܿ᩸")) * (-109);
                        i5 = ((iM2763 ^ i14) * 3915) ^ (-198283890);
                        i6 = -1028143822;
                    } else {
                        iM2763 = (C0619.m2761("ᩳ᩹") + i14) * (-29);
                        abstractC22044M1774 = abstractC22044M1774;
                        i5 = ((iM2763 ^ i13) * (-9453)) ^ 30069571;
                        i6 = 1968285074;
                    }
                    int i25 = iM2763 ^ i6;
                    str5 = str5;
                    abstractC22044 = abstractC22044M1774;
                    i16 = i25;
                    i15 = i5;
                    abstractC22044M1774 = abstractC22044;
                    break;
                case -1538135099:
                case 565927205:
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    sb2 = new StringBuilder();
                    C3779.m12258(sb2, Build.BOARD);
                    str4 = Build.BRAND;
                    if (C3077.f9998) {
                        iM2763 = C0773.m3169("ۛ֨") ^ i14;
                        i5 = ((iM2763 ^ i13) * 525) ^ (-1018461438);
                        i6 = 124993751;
                    } else {
                        iM2763 = C0619.m2761("᩸۬") ^ i14;
                        i5 = ((iM2763 ^ i13) * (-25339)) ^ (-842298570);
                        i6 = 1449540534;
                    }
                    int i26 = iM2763 ^ i6;
                    str5 = str5;
                    abstractC22044 = abstractC22044M1774;
                    i16 = i26;
                    i15 = i5;
                    abstractC22044M1774 = abstractC22044;
                    break;
                case -1495158366:
                case -9194107:
                    C3779.m12258(sb2, Build.TAGS);
                    str5 = Build.ID;
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = (C0619.m2761("ܿ᩻") ^ i13) * (-123);
                        i = ((iM2761 ^ i14) * (-24915)) ^ 1555342018;
                        i2 = 319202414;
                        i16 = iM2761 ^ i2;
                        i15 = i;
                    } else {
                        abstractC22044M1774 = abstractC22044M1774;
                        str = str4;
                        int iM31611 = (C0773.m3169("۬᩶") ^ i13) * (-115);
                        int i27 = ((iM31611 ^ i14) * 9047) ^ 231887024;
                        i8 = iM31611 ^ (-1594845728);
                        str4 = str;
                        i15 = i27;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i8;
                        abstractC22044M1774 = abstractC22044;
                    }
                    break;
                case -1378709912:
                case 1650475426:
                    abstractC22044M1774 = abstractC22044M1774;
                    str2 = str5;
                    s = s;
                    sb = sb2;
                    if ((i19 * i19) - (s * 9300) >= 0) {
                        iM2762 = (i14 - C0773.m3169("᩵᩶")) * 71;
                        i3 = ((iM2762 ^ i13) * 18475) ^ 1783026475;
                        i4 = -323611795;
                    } else {
                        iM2762 = (C0619.m2761("᩸ۧ") ^ i13) * 119;
                        i3 = ((iM2762 ^ i14) * (-30647)) ^ (-1428077971);
                        i4 = -1521945932;
                    }
                    int i28 = iM2762 ^ i4;
                    str5 = str2;
                    abstractC22044 = abstractC22044M1774;
                    i16 = i28;
                    i15 = i3;
                    sb2 = sb;
                    s = s;
                    abstractC22044M1774 = abstractC22044;
                    break;
                case -1179049112:
                case 80068276:
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0773.m3169("֡۫") ^ i13) * (-81);
                        i = ((iM2761 ^ i14) * (-4413)) ^ (-148160551);
                        i2 = 434587497;
                        i16 = iM2761 ^ i2;
                        i15 = i;
                    } else {
                        str2 = str5;
                        sb = sb2;
                        iM2762 = C0619.m2761("ۧᩳ") ^ i14;
                        i3 = ((iM2762 ^ i13) * 7961) ^ (-797674772);
                        i4 = 1385585535;
                        int i29 = iM2762 ^ i4;
                        str5 = str2;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i29;
                        i15 = i3;
                        sb2 = sb;
                        s = s;
                        abstractC22044M1774 = abstractC22044;
                    }
                    break;
                case -1012677459:
                case -391136944:
                    abstractC22044M1774 = abstractC22044M1774;
                    str = str4;
                    str5 = str5;
                    C3779.m12258(sb2, str);
                    C3779.m12258(sb2, Build.CPU_ABI);
                    if (C1343.f4799 == 0) {
                        iM3169 = C0773.m3169("᩺᩺") ^ i13;
                        str4 = str;
                        i15 = ((iM3169 ^ i14) * 25647) ^ (-1749524434);
                        i7 = 1693431927;
                        i8 = iM3169 ^ i7;
                        str5 = str5;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i8;
                        abstractC22044M1774 = abstractC22044;
                    } else {
                        str5 = str5;
                        int iM31612 = (C0773.m3169("۬᩶") ^ i13) * (-115);
                        int i210 = ((iM31612 ^ i14) * 9047) ^ 231887024;
                        i8 = iM31612 ^ (-1594845728);
                        str4 = str;
                        i15 = i210;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i8;
                        abstractC22044M1774 = abstractC22044;
                    }
                    break;
                case -985321116:
                case 582959911:
                    try {
                        abstractC22044M1774.m49879(upperCase);
                        break;
                    } catch (IOException unused) {
                    }
                    iM2761 = C0619.m2761("ۘ᩶") ^ i13;
                    i = ((iM2761 ^ i14) * 31879) ^ 1605799001;
                    i2 = -1810796349;
                    i16 = iM2761 ^ i2;
                    i15 = i;
                    break;
                case -696559138:
                case -116740574:
                    if (C2310.f7472 < 0) {
                        abstractC22044M1774 = abstractC22044M1774;
                        str5 = str5;
                        iM2763 = C0619.m2761("᩸۬") ^ i14;
                        i5 = ((iM2763 ^ i13) * (-25339)) ^ (-842298570);
                        i6 = 1449540534;
                        int i211 = iM2763 ^ i6;
                        str5 = str5;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i211;
                        i15 = i5;
                        abstractC22044M1774 = abstractC22044;
                    } else {
                        iM2761 = (C0773.m3169("֡۫") ^ i13) * (-81);
                        i = ((iM2761 ^ i14) * (-4413)) ^ (-148160551);
                        i2 = 434587497;
                        i16 = iM2761 ^ i2;
                        i15 = i;
                    }
                    break;
                case -640507170:
                case 163379376:
                    str5 = str5;
                    abstractC22044M1774 = C0269.m1774(C6382.f21568, Integer.toString(i20));
                    if (C3998.m12930(abstractC22044M1774)) {
                        iM2763 = (C0773.m3169("ܺۖ") + i13) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        abstractC22044M1774 = abstractC22044M1774;
                        i5 = ((iM2763 ^ i14) * 7299) ^ (-1835464185);
                        i6 = -1396713142;
                    } else {
                        iM2763 = C0619.m2761("ܰۘ") ^ i13;
                        abstractC22044M1774 = abstractC22044M1774;
                        i5 = ((iM2763 ^ i14) * 13807) ^ (-173842302);
                        i6 = -331355695;
                    }
                    int i212 = iM2763 ^ i6;
                    str5 = str5;
                    abstractC22044 = abstractC22044M1774;
                    i16 = i212;
                    i15 = i5;
                    abstractC22044M1774 = abstractC22044;
                    break;
                case -595625503:
                case 944224256:
                    return upperCase;
                case -481194565:
                case 240735393:
                    i11 = 19391;
                    iM2763 = (i14 - C0619.m2761("ۢۡ")) * (-75);
                    i5 = ((iM2763 ^ i13) * SecP192K1Field.PInv33) ^ (-459648638);
                    i6 = 859099838;
                    int i213 = iM2763 ^ i6;
                    str5 = str5;
                    abstractC22044 = abstractC22044M1774;
                    i16 = i213;
                    i15 = i5;
                    abstractC22044M1774 = abstractC22044;
                    break;
                case -343540821:
                case 617815252:
                    C3077.m10041();
                    C1321.m4852();
                    str2 = str5;
                    sb = sb2;
                    iM2762 = C0619.m2761("ۧᩳ") ^ i14;
                    i3 = ((iM2762 ^ i13) * 7961) ^ (-797674772);
                    i4 = 1385585535;
                    int i214 = iM2762 ^ i4;
                    str5 = str2;
                    abstractC22044 = abstractC22044M1774;
                    i16 = i214;
                    i15 = i3;
                    sb2 = sb;
                    s = s;
                    abstractC22044M1774 = abstractC22044;
                    break;
                case -136582333:
                case 1441130578:
                    try {
                        strM49871 = abstractC22044M1774.m49871();
                        iM2761 = (C0773.m3169("۟֨") ^ i14) * (-69);
                        i = ((iM2761 ^ i13) * (-22469)) ^ (-887598516);
                        i2 = 1258914949;
                        i16 = iM2761 ^ i2;
                        i15 = i;
                    } catch (IOException unused2) {
                        str5 = str5;
                        iM2763 = C0619.m2761("ܰۘ") ^ i13;
                        abstractC22044M1774 = abstractC22044M1774;
                        i5 = ((iM2763 ^ i14) * 13807) ^ (-173842302);
                        i6 = -331355695;
                        int i215 = iM2763 ^ i6;
                        str5 = str5;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i215;
                        i15 = i5;
                        abstractC22044M1774 = abstractC22044;
                    }
                    break;
                case 217091363:
                case 1228592986:
                    C1519.m5403();
                    if (C20932.m47848() != 0) {
                        abstractC22044M1774 = abstractC22044M1774;
                        str5 = str5;
                        iM2763 = (i13 - C0619.m2761("ܿ᩸")) * (-109);
                        i5 = ((iM2763 ^ i14) * 3915) ^ (-198283890);
                        i6 = -1028143822;
                        int i216 = iM2763 ^ i6;
                        str5 = str5;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i216;
                        i15 = i5;
                        abstractC22044M1774 = abstractC22044;
                    }
                    str2 = str5;
                    sb = sb2;
                    iM2762 = C0619.m2761("ۧᩳ") ^ i14;
                    i3 = ((iM2762 ^ i13) * 7961) ^ (-797674772);
                    i4 = 1385585535;
                    int i217 = iM2762 ^ i4;
                    str5 = str2;
                    abstractC22044 = abstractC22044M1774;
                    i16 = i217;
                    i15 = i3;
                    sb2 = sb;
                    s = s;
                    abstractC22044M1774 = abstractC22044;
                    break;
                case 294232131:
                case 1610084994:
                    upperCase = AbstractC3624.m11770(strM36173, i9, i10).toUpperCase(Locale.ROOT);
                    iM2761 = C0619.m2761("۬ۡ") ^ i14;
                    i = ((iM2761 ^ i13) * 23233) ^ (-305429536);
                    i2 = -849101320;
                    i16 = iM2761 ^ i2;
                    i15 = i;
                    break;
                case 309946036:
                case 2036595591:
                    return strM49871;
                case 338187887:
                case 1607789079:
                    abstractC22044M1774 = abstractC22044M1774;
                    s = s;
                    str2 = str5;
                    sb = sb2;
                    int i30 = s + 2325;
                    if (C1080.f3865 >= 0) {
                        i19 = i30;
                        iM2762 = C0619.m2761("ۧᩳ") ^ i14;
                        i3 = ((iM2762 ^ i13) * 7961) ^ (-797674772);
                        i4 = 1385585535;
                        int i218 = iM2762 ^ i4;
                        str5 = str2;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i218;
                        i15 = i3;
                        sb2 = sb;
                        s = s;
                        abstractC22044M1774 = abstractC22044;
                    } else {
                        int iM31613 = (i14 - C0773.m3169("᩻۠")) * 93;
                        i19 = i30;
                        i15 = ((iM31613 ^ i13) * 11065) ^ 276811951;
                        str5 = str2;
                        s = s;
                        abstractC22044M1774 = abstractC22044M1774;
                        i16 = iM31613 ^ 1135378323;
                        sb2 = sb;
                    }
                    break;
                case 538876750:
                case 1630555342:
                    str2 = str5;
                    C3779.m12258(sb2, str2);
                    str3 = Build.BOOTLOADER;
                    sArr = f30236;
                    i18 = 1;
                    if (C4238.m13540() <= 0) {
                        i17 = 8;
                        sb = sb2;
                        iM2762 = C0619.m2761("ۧᩳ") ^ i14;
                        i3 = ((iM2762 ^ i13) * 7961) ^ (-797674772);
                        i4 = 1385585535;
                        int i219 = iM2762 ^ i4;
                        str5 = str2;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i219;
                        i15 = i3;
                        sb2 = sb;
                        s = s;
                        abstractC22044M1774 = abstractC22044;
                    } else {
                        int iM2765 = C0619.m2761("ܽ֫") ^ i14;
                        i16 = iM2765 ^ 385268600;
                        i15 = ((iM2765 ^ i13) * 5787) ^ (-574394874);
                        str5 = str2;
                        i17 = 8;
                    }
                    break;
                case 1771374098:
                case 1804422136:
                    i11 = 22815;
                    iM2763 = (i14 - C0619.m2761("ۢۡ")) * (-75);
                    i5 = ((iM2763 ^ i13) * SecP192K1Field.PInv33) ^ (-459648638);
                    i6 = 859099838;
                    int i2110 = iM2763 ^ i6;
                    str5 = str5;
                    abstractC22044 = abstractC22044M1774;
                    i16 = i2110;
                    i15 = i5;
                    abstractC22044M1774 = abstractC22044;
                    break;
                default:
                    strM23910 = C8947.m23910(sb2, str3, C3099.m10092(sArr, i18, i17, i11));
                    charset = StandardCharsets.UTF_8;
                    if (!C13473.m33144()) {
                        abstractC22044M1774 = abstractC22044M1774;
                        str5 = str5;
                        iM2763 = C0619.m2761("᩸۬") ^ i14;
                        i5 = ((iM2763 ^ i13) * (-25339)) ^ (-842298570);
                        i6 = 1449540534;
                        int i2111 = iM2763 ^ i6;
                        str5 = str5;
                        abstractC22044 = abstractC22044M1774;
                        i16 = i2111;
                        i15 = i5;
                        abstractC22044M1774 = abstractC22044;
                    } else {
                        iM2761 = (i14 - C0619.m2761("۟ۙ")) * 119;
                        i = ((iM2761 ^ i13) * 1647) ^ (-1197696495);
                        i2 = -133148207;
                        i16 = iM2761 ^ i2;
                        i15 = i;
                    }
                    break;
            }
        }
    }
}
