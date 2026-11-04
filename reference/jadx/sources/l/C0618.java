package l;

import android.content.SharedPreferences;
import bin.mt.json.JSONArray;
import com.alipay.sdk.m.t0.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;

/* JADX INFO: renamed from: l.֡ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S3XU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0618 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2435 = 0;

    /* JADX INFO: renamed from: ۜۡ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f2436 = {4070, 13675, 13671, 13669, 13688, 13693, 13692, 13677, 13633, 13678, 13641, 13674, 13691, 13677, 13670, 13692, 13600, 13606, 13606, 13606, 13601, 7436, 30719, 30680, 30656, 30679, 30682, 30687, 30674, 30614, 30661, 30675, 30658, 30658, 30687, 30680, 30673, 30661, 30614, 30679, 30676, 30661, 30675, 30680, 30677, 30675, 30614, 30676, 30682, 30681, 30677, 30685, 30614, 30661, 30687, 30668, 30675, 9462, -19956, 17437, 22481, -13348, -13346, -13361, -13327, -13336, -13324, -13323, -13318, -13367, -13367, -13350, -13374, -13421, -13419, -13419, -13419, -13422, -13429, -13430, -13348, -13346, -13361, -13327, -13336, -13324, -13323, -13324, -13351, -13359, -13346, -13352, -13361, -13421, -13419, -13419, -13419, -13422, -13425, -13432, -13431, -13355, -13346, -13373, -13361, -13421, -13419, -13419, -13419, -13422, -13358, -13361, -13346, -13367, -13350, -13361, -13356, -13367, -13421, -13419, -13419, -13419, -13422, -13351, -13350, -13352, -13360, -13362, -13365, -13418, -13433, -13348, -13346, -13361, -13418, -13363, -13350, -13353, -13362, -13346, -13368, -13435, -13421, -13419, -13419, -13419, -13422, -13353, -13358, -13368, -13361, -13315, -13358, -13353, -13346, -13368, -13421, -13419, -13419, -13419, -13422, 607, 425, 430, 425, 423, 421, 436, 386, 441, 436, 421, 435, 488, 494, 494, 494, 489, 405, 430, 435, 437, 432, 432, 431, 434, 436, 421, 420, 480, 432, 434, 421, 422, 421, 434, 421, 430, 419, 421, 480, 436, 441, 432, 421, 506, 480, 429, 425, 430, 425, 387, 424, 421, 419, 427, 480, 422, 417, 425, 428, 421, 420, 494, 25575, -27625, 22569, -29090, -25881, 28882, 425, 436, 421, 434, 417, 436, 431, 434, 488, 494, 494, 494, 489, 430, 421, 440, 436, 488, 494, 494, 494, 489, 4751, 23218, 23189, 23181, 23194, 23191, 23186, 23199, 23259, 23176, 23198, 23183, 23183, 23186, 23189, 23196, 23176, 23259, 23194, 23193, 23176, 23198, 23189, 23192, 23198, 23259, 23193, 23186, 23183, 23190, 23194, 23179, 23259, 23176, 23186, 23169, 23198, 4220, 29770, 29779, 29717, 29816, 29783, 29766, 29779, 29775, 29704, 29780, 29763, 29764, 29766, 29781, 29763, 29704, 29802, 29811, 29717};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0812 f2437;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0812 f2438;

    /* JADX WARN: Code duplicated, block: B:50:0x019e A[PHI: r4
      0x019e: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:48:0x0184, B:39:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0249 A[PHI: r17
      0x0249: PHI (r17v4 int) = (r17v3 int), (r17v2 int) binds: [B:64:0x0247, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02a0 A[PHI: r5 r20 r25
      0x02a0: PHI (r5v2 long) = (r5v1 long), (r5v3 long) binds: [B:72:0x029e, B:42:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r20v4 short) = (r20v3 short), (r20v2 short) binds: [B:72:0x029e, B:42:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r25v5 short) = (r25v4 short), (r25v3 short) binds: [B:72:0x029e, B:42:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02d4 A[PHI: r7 r8 r9 r19
      0x02d4: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:76:0x02d2, B:31:0x00e6, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r8v4 byte[]) = (r8v2 byte[]), (r8v3 byte[]), (r8v2 byte[]) binds: [B:76:0x02d2, B:31:0x00e6, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:76:0x02d2, B:31:0x00e6, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r19v4 char) = (r19v3 char), (r19v2 char), (r19v2 char) binds: [B:76:0x02d2, B:31:0x00e6, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0307 A[PHI: r15 r16 r18
      0x0307: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:80:0x0305, B:68:0x027d, B:15:0x007c, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:80:0x0305, B:68:0x027d, B:15:0x007c, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:80:0x0305, B:68:0x027d, B:15:0x007c, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0339 A[PHI: r3 r12 r13
      0x0339: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:84:0x0337, B:53:0x01d2, B:17:0x0080, B:15:0x007c, B:9:0x006b, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0339: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:84:0x0337, B:53:0x01d2, B:17:0x0080, B:15:0x007c, B:9:0x006b, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0339: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:84:0x0337, B:53:0x01d2, B:17:0x0080, B:15:0x007c, B:9:0x006b, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21501 m2740(C20348 c20348, int i) {
        int iM3169;
        int i2;
        int i3;
        int i4 = C3690.f12684;
        int i5 = C2288.f7433;
        int iM2761 = C0619.m2761("۠ᩳ") ^ i4;
        int i6 = ((iM2761 ^ i5) * 5291) ^ (-1109560369);
        long jM46744 = 0;
        byte[] bArrM2745 = null;
        short[] sArr = null;
        int i7 = iM2761 ^ 1940923425;
        int iM46741 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 364042339;
        short s2 = 0;
        String strM53420 = null;
        short[] sArr2 = null;
        int iM46744 = 0;
        byte[] bArrM2746 = null;
        int iM46742 = 0;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * 14925) >> 31));
            switch (i13) {
                case -2138121818:
                case -623117099:
                    sArr2 = f2436;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ᩴۗ") + i5) * (-47);
                        i2 = ((iM3169 ^ i4) * 13751) ^ 406327122;
                        i3 = -550612176;
                    } else {
                        iM3169 = (C0619.m2761("ۖۨ") + i4) * (-109);
                        i2 = ((iM3169 ^ i5) * (-30635)) ^ 369065629;
                        i3 = -1940296996;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -2068953727:
                case -1311837628:
                    C23916.m53419();
                    return null;
                case -2066115097:
                case -1260349820:
                    s = sArr2[c];
                    s2 = 38526;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ܿۢ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 11101) ^ 436110570;
                        i3 = -847630153;
                    } else {
                        iM3169 = (C0619.m2761("ۚۘ") ^ i4) * (-93);
                        i2 = ((iM3169 ^ i5) * 20123) ^ (-2078462919);
                        i3 = 324116180;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1986847006:
                case 171395085:
                    return new C21501(iM46741, iM46742, bArrM2745, bArrM2746);
                case -1909033433:
                case 1296272082:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-29029)) ^ 976589830;
                        i3 = -1891800864;
                    } else {
                        iM3169 = (C0773.m3169("ۘۨ") ^ i5) * 17;
                        i2 = ((iM3169 ^ i4) * (-21751)) ^ (-1895750122);
                        i3 = 118233275;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1356271511:
                case 1906407557:
                    if (C3448.m11248() != 0) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-29029)) ^ 976589830;
                        i3 = -1891800864;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩺") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-23831)) ^ 456582313;
                        i3 = -62662589;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1304757780:
                case -1229521984:
                    if (c20348.m46741() != 1) {
                        iM3169 = C0619.m2761("ۛܳ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 9227) ^ 1850389256;
                        i3 = 1648288367;
                    } else {
                        iM3169 = C0773.m3169("֫᩺") ^ i4;
                        i2 = ((iM3169 ^ i5) * 11803) ^ (-534990993);
                        i3 = 655408908;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1300516250:
                case 1127346189:
                    throw new IllegalArgumentException(strM53420);
                case -1299912252:
                case 919808234:
                    i8 = 42264;
                    iM3169 = C0773.m3169("ۢ᩶") ^ i5;
                    i2 = ((iM3169 ^ i4) * (-5127)) ^ (-1044949927);
                    i3 = 896997288;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1101622166:
                case 447404528:
                    c = 21;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ܶ᩺") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-23831)) ^ 456582313;
                        i3 = -62662589;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۛ") + i5) * 27;
                        i2 = ((iM3169 ^ i4) * 4763) ^ 1696269965;
                        i3 = -606542547;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1028627673:
                case 775734895:
                    C3448.m11248();
                    if (C23916.m53419() == 0) {
                        iM3169 = (C0619.m2761("ᩴۗ") + i5) * (-47);
                        i2 = ((iM3169 ^ i4) * 13751) ^ 406327122;
                        i3 = -550612176;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۨ") ^ i5) * 73;
                        i2 = ((iM3169 ^ i4) * 22415) ^ (-1440578845);
                        i3 = -290152780;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -746215079:
                case -409605243:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-29029)) ^ 976589830;
                        i3 = -1891800864;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۗ") + i5) * (-47);
                        i2 = ((iM3169 ^ i4) * 13751) ^ 406327122;
                        i3 = -550612176;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -675318475:
                case 7085706:
                    c20348.seek(i);
                    return null;
                case -517814332:
                case 1588537199:
                    bArrM2746 = m2745(i, iM46742, c20348);
                    if (c20348.m46744() == i) {
                        iM3169 = (C0773.m3169("ۗۘ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM3169 ^ i5) * (-9657)) ^ (-1897657451);
                        i3 = -968695799;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩻") + i5) * (-91);
                        i2 = ((iM3169 ^ i4) * (-24593)) ^ 1613508120;
                        i3 = -292122768;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -452358502:
                case 1589532244:
                    throw new IllegalArgumentException(strM53420);
                case -410582524:
                case 2003905801:
                    strM53420 = C23916.m53420(sArr, i9, 35, i8);
                    if (i > iM46744) {
                        iM3169 = (C0773.m3169("ܽܳ") ^ i4) * (-35);
                        i2 = ((iM3169 ^ i5) * 5779) ^ 1280705202;
                        i3 = 1767237435;
                    } else {
                        iM3169 = C0773.m3169("۬ۡ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 233) ^ (-1099352349);
                        i3 = -802600882;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -137941566:
                case 763143536:
                    RunnableC1848.m6360();
                    iM3169 = C0773.m3169("ۛܿ") ^ i4;
                    i2 = ((iM3169 ^ i5) * (-29029)) ^ 976589830;
                    i3 = -1891800864;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -63000950:
                case 852587790:
                    i10 = s * s2;
                    i11 = s * s;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ᩴۗ") + i5) * (-47);
                        i2 = ((iM3169 ^ i4) * 13751) ^ 406327122;
                        i3 = -550612176;
                    } else {
                        iM3169 = C0619.m2761("ᩴۧ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-313)) ^ (-1722830);
                        i3 = 1088038839;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 233163621:
                case 554524014:
                    jM46744 = i - c20348.m46744();
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ܿۢ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 11101) ^ 436110570;
                        i3 = -847630153;
                    } else {
                        iM3169 = C0773.m3169("ۜ۠") ^ i5;
                        i2 = ((iM3169 ^ i4) * 20783) ^ 1870008880;
                        i3 = 22241588;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 434320451:
                case 671611594:
                    iM46741 = c20348.m46741();
                    bArrM2745 = m2745(i, iM46741, c20348);
                    iM46742 = c20348.m46741();
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0619.m2761("ܶ᩺") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-23831)) ^ 456582313;
                        i3 = -62662589;
                    } else {
                        iM3169 = (C0773.m3169("ۖ֫") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM3169 ^ i5) * 12751) ^ (-282286791);
                        i3 = 177864700;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 579549721:
                case 1611793417:
                    i12 = 371063169;
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("ᩴۨ") ^ i5) * 73;
                        i2 = ((iM3169 ^ i4) * 22415) ^ (-1440578845);
                        i3 = -290152780;
                    } else {
                        iM3169 = C0619.m2761("ۡܳ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-20753)) ^ (-1403059686);
                        i3 = 231501089;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 583979562:
                case 1661050349:
                    if (jM46744 <= c20348.available()) {
                        iM3169 = (i5 - C0773.m3169("ᩴ۟")) * (-11);
                        i2 = ((iM3169 ^ i4) * 16155) ^ (-192682254);
                        i3 = 1882008794;
                    } else {
                        iM3169 = C0773.m3169("۬ۡ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 233) ^ (-1099352349);
                        i3 = -802600882;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 841962472:
                case 859828275:
                    if ((i11 + i12) - i10 >= 0) {
                        iM3169 = C0773.m3169("ۨ۠") ^ i5;
                        i2 = ((iM3169 ^ i4) * 23765) ^ 644131014;
                        i3 = 55476277;
                    } else {
                        iM3169 = C0619.m2761("ۗܶ") ^ i4;
                        i2 = ((iM3169 ^ i5) * 11697) ^ (-27604660);
                        i3 = -1938328677;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 1314754009:
                case 1462099745:
                    iM46744 = c20348.m46744();
                    sArr = f2436;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-29029)) ^ 976589830;
                        i3 = -1891800864;
                    } else {
                        iM3169 = (C0619.m2761("ܳ۫") ^ i4) * (-49);
                        i2 = ((iM3169 ^ i5) * 8253) ^ (-1823965845);
                        i3 = -301596093;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 1629256592:
                case 1993859775:
                    i8 = 30646;
                    iM3169 = C0773.m3169("ۢ᩶") ^ i5;
                    i2 = ((iM3169 ^ i4) * (-5127)) ^ (-1044949927);
                    i3 = 896997288;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                default:
                    i9 = 22;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۛܿ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-29029)) ^ 976589830;
                        i3 = -1891800864;
                    } else {
                        iM3169 = C0773.m3169("ۗ᩺") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-24303)) ^ (-1542603373);
                        i3 = -646664729;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 109761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m2741(long r75, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82) {
        /*
            Method dump skipped, instruction units count: 10976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0618.m2741(long, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0229 A[PHI: r11 r12
      0x0229: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:18:0x0092, B:15:0x0078, B:12:0x0070, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r12v3 short) = (r12v2 short), (r12v2 short), (r12v2 short), (r12v5 short) binds: [B:18:0x0092, B:15:0x0078, B:12:0x0070, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0260 A[PHI: r3 r6 r7 r9 r13 r23
      0x0260: PHI (r3v3 boolean) = (r3v2 boolean), (r3v2 boolean), (r3v2 boolean), (r3v4 boolean) binds: [B:63:0x025e, B:57:0x020e, B:42:0x0173, B:34:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:63:0x025e, B:57:0x020e, B:42:0x0173, B:34:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r7v3 short[]) = (r7v2 short[]), (r7v2 short[]), (r7v2 short[]), (r7v4 short[]) binds: [B:63:0x025e, B:57:0x020e, B:42:0x0173, B:34:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:63:0x025e, B:57:0x020e, B:42:0x0173, B:34:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:63:0x025e, B:57:0x020e, B:42:0x0173, B:34:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r23v5 int) = (r23v4 int), (r23v3 int), (r23v3 int), (r23v3 int) binds: [B:63:0x025e, B:57:0x020e, B:42:0x0173, B:34:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0296 A[PHI: r1 r15 r18
      0x0296: PHI (r1v4 android.content.SharedPreferences) = 
      (r1v2 android.content.SharedPreferences)
      (r1v3 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
     binds: [B:67:0x0294, B:46:0x0197, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:67:0x0294, B:46:0x0197, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:67:0x0294, B:46:0x0197, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ea A[PHI: r2 r8 r16 r17
      0x02ea: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:75:0x02e8, B:71:0x02c8, B:38:0x0153, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:75:0x02e8, B:71:0x02c8, B:38:0x0153, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:75:0x02e8, B:71:0x02c8, B:38:0x0153, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:75:0x02e8, B:71:0x02c8, B:38:0x0153, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m2746() {
        int iM2761;
        int i;
        int i2;
        int i3 = C4282.f15546;
        int i4 = C0487.f2131;
        int iM3169 = C0773.m3169("֡ܳ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-10269)) ^ (-553639648);
        String strM4861 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ 1981525905;
        SharedPreferences sharedPreferences = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        int i13 = 2020557333;
        int i14 = 0;
        short[] sArr3 = null;
        String strM18128 = null;
        String strM40377 = null;
        boolean zContains = false;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 29439) >> 31));
            switch (i13) {
                case -1863065546:
                case 1356820724:
                    sharedPreferences = ApplicationC17729.f58262;
                    sArr = f2436;
                    if (C1519.m5403()) {
                        iM2761 = (C0773.m3169("ܽ᩶") ^ i3) * (-117);
                        i = ((iM2761 ^ i4) * (-32619)) ^ 1393507683;
                        i2 = -98537447;
                    } else {
                        iM2761 = (C0773.m3169("ۜܺ") ^ i4) * 119;
                        i = ((iM2761 ^ i3) * (-3263)) ^ (-789901475);
                        i2 = -692212865;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1810522130:
                case 1072111326:
                    i11 = 41320;
                    iM2761 = (i4 - C0773.m3169("֨ܳ")) * (-99);
                    i = ((iM2761 ^ i3) * 27431) ^ 489287350;
                    i2 = 2139879759;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1713578161:
                case 1830017393:
                    C2702.m8876();
                    C1542.m5459();
                    break;
                case -1652365740:
                case 198885295:
                    ApplicationC17729.f58262.edit().putString(strM4861, strM18128).apply();
                    iM2761 = (C0619.m2761("ܰ۟") ^ i4) * (-79);
                    i = ((iM2761 ^ i3) * 14783) ^ 891296848;
                    i2 = 141770373;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1543806020:
                case 1829450054:
                    s = sArr3[c];
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i4;
                        i = ((iM2761 ^ i3) * (-5319)) ^ 933629829;
                        i2 = 1481791369;
                    } else {
                        iM2761 = (C0619.m2761("֫ܶ") ^ i4) * 45;
                        i = ((iM2761 ^ i3) * 12305) ^ 1328742200;
                        i2 = -279999956;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1461538310:
                case -690333086:
                    strM18128 = C6382.m18128(C0950.m3786(ApplicationC17729.f58262, strM4861, strM40377));
                    if (C6382.m18139(strM18128)) {
                        iM2761 = (C0619.m2761("ۢۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i4) * 17323) ^ (-2046344493);
                        i2 = -842495948;
                    } else {
                        iM2761 = (C0619.m2761("ܰ۟") ^ i4) * (-79);
                        i = ((iM2761 ^ i3) * 14783) ^ 891296848;
                        i2 = 141770373;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1153340963:
                case 5726898:
                    i7 = 290;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("۟ۨ") ^ i3;
                        i = ((iM2761 ^ i4) * (-20551)) ^ 1082734518;
                        i2 = 1692848282;
                    } else {
                        iM2761 = (C0773.m3169("ۡ۬") ^ i3) * (-81);
                        i = ((iM2761 ^ i4) * 19615) ^ 1674769837;
                        i2 = 1303997122;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1039863148:
                case 1563503887:
                    C6382.m18139(strM40377);
                    break;
                case -926950069:
                case 1387832630:
                    sArr3 = f2436;
                    c = 289;
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i4;
                        i = ((iM2761 ^ i3) * (-5319)) ^ 933629829;
                        i2 = 1481791369;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۟ܶ")) * (-77);
                        i = ((iM2761 ^ i4) * (-26701)) ^ (-494263492);
                        i2 = -1777667460;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -908373071:
                case 402494980:
                    i10 = s + s2;
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("۟ۨ") ^ i3;
                        i = ((iM2761 ^ i4) * (-20551)) ^ 1082734518;
                        i2 = 1692848282;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩶ܺ")) * (-39);
                        i = ((iM2761 ^ i4) * 9715) ^ (-1255174625);
                        i2 = 515322156;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -878840062:
                case 747377596:
                    break;
                case -874437129:
                case -159422610:
                    strM40377 = C17202.m40377(sArr2, i8, 11, i11);
                    if (zContains) {
                        iM2761 = C0773.m3169("ܳܿ") ^ i3;
                        i = ((iM2761 ^ i4) * 25407) ^ 2085361479;
                        i2 = -226950373;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩵۫")) * 67;
                        i = ((iM2761 ^ i3) * (-15743)) ^ 1815811208;
                        i2 = 2096892297;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -263713381:
                case 2147274849:
                    i12 = s * s;
                    if (C1826.m6301() >= 0) {
                        iM2761 = (C0773.m3169("ۜܺ") ^ i4) * 119;
                        i = ((iM2761 ^ i3) * (-3263)) ^ (-789901475);
                        i2 = -692212865;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۡ᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2761 ^ i3) * (-3375)) ^ 352493017;
                        i2 = 47595263;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -179550188:
                case 1078309990:
                    C1146.m4231();
                    if (C0862.f3233 == 0) {
                        iM2761 = C0619.m2761("ܳ֫") ^ i3;
                        i = ((iM2761 ^ i4) * (-23707)) ^ 2127442821;
                        i2 = 2138187788;
                    } else {
                        iM2761 = (C0773.m3169("ۜܺ") ^ i4) * 119;
                        i = ((iM2761 ^ i3) * (-3263)) ^ (-789901475);
                        i2 = -692212865;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 40503558:
                case 1959990496:
                    zContains = sharedPreferences.contains(strM4861);
                    sArr2 = f2436;
                    i8 = 298;
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("۟ۨ") ^ i3;
                        i = ((iM2761 ^ i4) * (-20551)) ^ 1082734518;
                        i2 = 1692848282;
                    } else {
                        iM2761 = C0773.m3169("ۚ۫") ^ i3;
                        i = ((iM2761 ^ i4) * (-1325)) ^ (-188694963);
                        i2 = -280870477;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 118888077:
                case 1527768510:
                    i11 = 29735;
                    iM2761 = (i4 - C0773.m3169("֨ܳ")) * (-99);
                    i = ((iM2761 ^ i3) * 27431) ^ 489287350;
                    i2 = 2139879759;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 501868825:
                case 1966917061:
                    if (i9 - (i10 * i10) < 0) {
                        iM2761 = (i3 - C0773.m3169("۠᩷")) * 87;
                        i = ((iM2761 ^ i4) * (-30713)) ^ (-1556401994);
                        i2 = 1286839564;
                    } else {
                        iM2761 = C0773.m3169("ۧ᩷") ^ i4;
                        i = ((iM2761 ^ i3) * 5993) ^ 1139885430;
                        i2 = 1283347158;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 636810144:
                case 1593598923:
                    strM4861 = C1321.m4861(sArr, i7, 8, i11);
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i4;
                        i = ((iM2761 ^ i3) * (-5319)) ^ 933629829;
                        i2 = 1481791369;
                    } else {
                        iM2761 = (C0773.m3169("ۗ֡") ^ i4) * (-89);
                        i = ((iM2761 ^ i3) * 15993) ^ 698507221;
                        i2 = -619324136;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 727964323:
                case 1210306531:
                    i14 = i12 + 1478656;
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("۟ۨ") ^ i3;
                        i = ((iM2761 ^ i4) * (-20551)) ^ 1082734518;
                        i2 = 1692848282;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩵ۢ")) * (-75);
                        i = ((iM2761 ^ i4) * 29733) ^ 960684813;
                        i2 = 367356144;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 741006937:
                case 1327508468:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("ۘۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 4649) ^ (-405688999);
                        i2 = 2053260651;
                    } else {
                        iM2761 = C0619.m2761("ܳ֫") ^ i3;
                        i = ((iM2761 ^ i4) * (-23707)) ^ 2127442821;
                        i2 = 2138187788;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 863128437:
                case 2016860151:
                    if (C2966.m9664()) {
                        iM2761 = C0773.m3169("ۘۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 4649) ^ (-405688999);
                        i2 = 2053260651;
                    } else {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i4;
                        i = ((iM2761 ^ i3) * (-5319)) ^ 933629829;
                        i2 = 1481791369;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 947175245:
                case 1540453313:
                    C3734.m12152();
                    iM2761 = C0773.m3169("ۘۚ") ^ i4;
                    i = ((iM2761 ^ i3) * 4649) ^ (-405688999);
                    i2 = 2053260651;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = i14 + i14;
                    s2 = 1216;
                    if (C3099.m10095()) {
                        iM2761 = C0773.m3169("ۘۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 4649) ^ (-405688999);
                        i2 = 2053260651;
                    } else {
                        iM2761 = (C0619.m2761("۫᩸") + i4) * 79;
                        i = ((iM2761 ^ i3) * 6613) ^ 277371587;
                        i2 = 734191503;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x026a A[PHI: r10 r18 r19
      0x026a: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:70:0x0268, B:66:0x024a, B:14:0x006a, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r18v21 java.lang.Object) = (r18v7 java.lang.Object), (r18v8 java.lang.Object), (r18v17 java.lang.Object), (r18v22 java.lang.Object) binds: [B:70:0x0268, B:66:0x024a, B:14:0x006a, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:70:0x0268, B:66:0x024a, B:14:0x006a, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (l.C3734.f12817 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        if (l.C4282.f15546 > 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5061 m2738(java.util.LinkedHashMap r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0618.m2738(java.util.LinkedHashMap, java.lang.String):l.ۙܿܳ");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m2748(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1956884102;
        int i8 = C2702.f8586;
        int i9 = C2834.f9334;
        int iM3169 = (C0773.m3169("ܳ᩸") ^ i8) * (-57);
        int i10 = ((iM3169 ^ i9) * (-663)) ^ 541266559;
        int i11 = -230630997;
        while (true) {
            i7 = ((((i7 ^ i9) * (-15515)) >> 31) & i10) ^ (iM3169 ^ i11);
            switch (i7) {
                case -2103666622:
                case 35343824:
                    i2 = 7;
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ۖۗ") ^ i9;
                        i10 = ((iM3169 ^ i8) * (-29807)) ^ (-554156628);
                        i11 = 211652383;
                    } else {
                        iM3169 = (i8 - C0619.m2761("ۡ᩸")) * (-101);
                        i10 = ((iM3169 ^ i9) * (-3941)) ^ 1067575839;
                        i11 = -284086574;
                    }
                    break;
                case -2087974699:
                case -732565017:
                    AbstractC0641.m2813();
                    C3734.m12152();
                    iM3169 = (C0773.m3169("ۛ᩹") ^ i9) * 53;
                    i10 = ((iM3169 ^ i8) * 1105) ^ (-93578288);
                    i11 = -616879149;
                    break;
                case -2038188564:
                case 758879684:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("ܶܿ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 8767) ^ (-985703478);
                        i11 = -1847365941;
                    } else {
                        iM3169 = (C0619.m2761("ۜۖ") + i9) * (-123);
                        i10 = ((iM3169 ^ i8) * 4537) ^ (-570194084);
                        i11 = 1405991326;
                    }
                    break;
                case -1971772067:
                case -781603016:
                    i6 = i >>> i5;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ۖۤ") + i8) * (-119);
                        i10 = ((iM3169 ^ i9) * 20407) ^ 1750922045;
                        i11 = 385395051;
                    } else {
                        iM3169 = (C0619.m2761("᩷۟") + i9) * 33;
                        i10 = ((iM3169 ^ i8) * (-9085)) ^ 2106221837;
                        i11 = -410420371;
                    }
                    break;
                case -1849105953:
                case -1324037291:
                    C1564.m5509();
                    RunnableC1848.m6360();
                    return false;
                case -1726896213:
                case -708502678:
                    return false;
                case -1293169723:
                case -1027185381:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("ۛ᩹") ^ i9) * 53;
                        i10 = ((iM3169 ^ i8) * 1105) ^ (-93578288);
                        i11 = -616879149;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۡ") ^ i8) * 101;
                        i10 = ((iM3169 ^ i9) * (-24265)) ^ 16927278;
                        i11 = 1970609620;
                    }
                    break;
                case -1260287764:
                case 2104682350:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ܶܿ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 8767) ^ (-985703478);
                        i11 = -1847365941;
                    } else {
                        iM3169 = (C0773.m3169("֨ᩴ") + i8) * 85;
                        i10 = ((iM3169 ^ i9) * (-12955)) ^ 50902981;
                        i11 = 75367735;
                    }
                    break;
                case -965559294:
                case 158070559:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (i8 - C0619.m2761("ۡ᩸")) * (-101);
                        i10 = ((iM3169 ^ i9) * (-3941)) ^ 1067575839;
                        i11 = -284086574;
                    } else {
                        iM3169 = C0773.m3169("۬۠") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-1079)) ^ 1046509035;
                        i11 = -1460236819;
                    }
                    break;
                case -559268398:
                case 324417667:
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (i8 - C0619.m2761("ۡ᩸")) * (-101);
                        i10 = ((iM3169 ^ i9) * (-3941)) ^ 1067575839;
                        i11 = -284086574;
                    } else {
                        iM3169 = (C0773.m3169("ۛ᩹") ^ i9) * 53;
                        i10 = ((iM3169 ^ i8) * 1105) ^ (-93578288);
                        i11 = -616879149;
                    }
                    break;
                case -547197067:
                case 480286356:
                    if ((bArr[i6] & i4) != 0) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i8;
                        i10 = ((iM3169 ^ i9) * 5253) ^ (-1273642613);
                        i11 = 1479846596;
                    } else {
                        iM3169 = (i9 - C0619.m2761("ܳۘ")) * 43;
                        i10 = ((iM3169 ^ i8) * 31569) ^ 322422772;
                        i11 = -2063598477;
                    }
                    break;
                case -526862555:
                case 112927510:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ۛ᩹") ^ i9) * 53;
                        i10 = ((iM3169 ^ i8) * 1105) ^ (-93578288);
                        i11 = -616879149;
                    } else {
                        iM3169 = (C0773.m3169("۫ۖ") ^ i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = ((iM3169 ^ i8) * 14935) ^ (-1677674377);
                        i11 = -1150020520;
                    }
                    break;
                case -433255260:
                case 1553840362:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ۛ᩹") ^ i9) * 53;
                        i10 = ((iM3169 ^ i8) * 1105) ^ (-93578288);
                        i11 = -616879149;
                    } else {
                        iM3169 = (i9 - C0619.m2761("᩻᩶")) * 97;
                        i10 = ((iM3169 ^ i8) * (-25133)) ^ (-1732345447);
                        i11 = 196583301;
                    }
                    break;
                case -51942526:
                case 278204:
                    C0773.m3161();
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = (C0773.m3169("ۖۤ") + i8) * (-119);
                        i10 = ((iM3169 ^ i9) * 20407) ^ 1750922045;
                        i11 = 385395051;
                    } else {
                        iM3169 = C0619.m2761("ܶܿ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 8767) ^ (-985703478);
                        i11 = -1847365941;
                    }
                    break;
                case -31255894:
                case 1123301553:
                    C4282.m13644();
                    if (!C1146.m4231()) {
                        iM3169 = C0619.m2761("ܶܿ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 8767) ^ (-985703478);
                        i11 = -1847365941;
                    } else {
                        iM3169 = (C0773.m3169("ۛ᩹") ^ i9) * 53;
                        i10 = ((iM3169 ^ i8) * 1105) ^ (-93578288);
                        i11 = -616879149;
                    }
                    break;
                case 274298804:
                case 710569247:
                    return z;
                case 1138024462:
                case 1723958623:
                    i3 = i & i2;
                    z = true;
                    z = true;
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0773.m3169("᩻ܳ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-8673)) ^ (-94458574);
                        i11 = -1265979354;
                    } else {
                        iM3169 = (C0619.m2761("ܶۜ") ^ i8) * (-123);
                        i10 = ((iM3169 ^ i9) * (-26109)) ^ 1907184573;
                        i11 = -21689186;
                    }
                    break;
                default:
                    i4 = (z ? 1 : 0) << i3;
                    i5 = 3;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("ۛ᩹") ^ i9) * 53;
                        i10 = ((iM3169 ^ i8) * 1105) ^ (-93578288);
                        i11 = -616879149;
                    } else {
                        iM3169 = C0619.m2761("ܶۙ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-30735)) ^ (-1554652806);
                        i11 = -1727549721;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00da A[PHI: r7
      0x00da: PHI (r7v27 long) = (r7v26 long), (r7v1 long) binds: [B:30:0x00c3, B:25:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ee A[PHI: r12 r13 r14 r22
      0x01ee: PHI (r12v5 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:56:0x01ec, B:52:0x01c6, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r13v5 int) = (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:56:0x01ec, B:52:0x01c6, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r14v5 int) = (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:56:0x01ec, B:52:0x01c6, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r22v29 long) = (r22v5 long), (r22v6 long), (r22v30 long) binds: [B:56:0x01ec, B:52:0x01c6, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x029c A[PHI: r4 r6 r10 r11 r22
      0x029c: PHI (r4v2 long) = (r4v1 long), (r4v1 long), (r4v1 long), (r4v3 long) binds: [B:72:0x029a, B:68:0x027d, B:60:0x0228, B:35:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v3 int) binds: [B:72:0x029a, B:68:0x027d, B:60:0x0228, B:35:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r10v3 short) = (r10v1 short), (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:72:0x029a, B:68:0x027d, B:60:0x0228, B:35:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r11v3 short) = (r11v1 short), (r11v1 short), (r11v2 short), (r11v1 short) binds: [B:72:0x029a, B:68:0x027d, B:60:0x0228, B:35:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r22v11 long) = (r22v1 long), (r22v2 long), (r22v4 long), (r22v12 long) binds: [B:72:0x029a, B:68:0x027d, B:60:0x0228, B:35:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (l.C2485.f7950 == 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m2745(int r25, int r26, l.C20348 r27) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0618.m2745(int, int, l.᩵ۚۤ):byte[]");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0190 A[PHI: r11 r12 r13
      0x0190: PHI (r11v3 l.ܰᩳ᩻) = (r11v2 l.ܰᩳ᩻), (r11v1 l.ܰᩳ᩻), (r11v1 l.ܰᩳ᩻), (r11v1 l.ܰᩳ᩻), (r11v1 l.ܰᩳ᩻) binds: [B:45:0x018e, B:41:0x016d, B:16:0x005d, B:14:0x0059, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:45:0x018e, B:41:0x016d, B:16:0x005d, B:14:0x0059, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r13v3 byte[]) = (r13v1 byte[]), (r13v2 byte[]), (r13v1 byte[]), (r13v1 byte[]), (r13v1 byte[]) binds: [B:45:0x018e, B:41:0x016d, B:16:0x005d, B:14:0x0059, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c8 A[PHI: r10 r16
      0x01c8: PHI (r10v4 l.ᩳ֫ܺ) = (r10v2 l.ᩳ֫ܺ), (r10v1 l.ᩳ֫ܺ), (r10v1 l.ᩳ֫ܺ) binds: [B:49:0x01c6, B:27:0x00c2, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r16v5 l.ۘᩳ᩻) = (r16v1 l.ۘᩳ᩻), (r16v3 l.ۘᩳ᩻), (r16v1 l.ۘᩳ᩻) binds: [B:49:0x01c6, B:27:0x00c2, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b9 A[PHI: r2 r3 r4 r5
      0x02b9: PHI (r2v3 l.ܰᩳ᩻) = (r2v2 l.ܰᩳ᩻), (r2v1 l.ܰᩳ᩻) binds: [B:70:0x02b7, B:66:0x0294] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r3v3 int) = (r3v2 int), (r3v1 int) binds: [B:70:0x02b7, B:66:0x0294] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r4v2 byte[]) = (r4v1 byte[]), (r4v3 byte[]) binds: [B:70:0x02b7, B:66:0x0294] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:70:0x02b7, B:66:0x0294] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02f0 A[PHI: r1
      0x02f0: PHI (r1v3 android.content.SharedPreferences$Editor) = (r1v2 android.content.SharedPreferences$Editor), (r1v1 android.content.SharedPreferences$Editor) binds: [B:74:0x02ee, B:14:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0322 A[PHI: r6 r9 r21
      0x0322: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:78:0x0320, B:62:0x026e, B:53:0x01fd, B:11:0x0050, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0322: PHI (r9v3 l.ۢ֫ܺ) = (r9v1 l.ۢ֫ܺ), (r9v1 l.ۢ֫ܺ), (r9v2 l.ۢ֫ܺ), (r9v1 l.ۢ֫ܺ), (r9v1 l.ۢ֫ܺ) binds: [B:78:0x0320, B:62:0x026e, B:53:0x01fd, B:11:0x0050, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0322: PHI (r21v3 android.content.SharedPreferences) = 
      (r21v2 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
     binds: [B:78:0x0320, B:62:0x026e, B:53:0x01fd, B:11:0x0050, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m2742(C21501 c21501) {
        int iM2761;
        int i;
        int i2;
        SharedPreferences.Editor editorEdit = null;
        C14787 c14787M2739 = null;
        int iM48913 = 0;
        byte[] bArrM48911 = null;
        int iM7752 = 0;
        int iM53427 = 0;
        int i3 = 0;
        InterfaceC9801 interfaceC9801 = null;
        InterfaceC18752 interfaceC18752M8173 = null;
        C14787 c14787M2747 = null;
        int iM48914 = 0;
        byte[] bArrM48912 = null;
        int iM7976 = 0;
        int i4 = 0;
        C4347 c4347 = null;
        int i5 = -2050823162;
        int i6 = C20932.f66974;
        int i7 = C2419.f7754;
        int iM2762 = C0619.m2761("ᩴ۬") ^ i6;
        int i8 = ((iM2762 ^ i7) * (-26275)) ^ (-1212013068);
        int i9 = iM2762 ^ 2016282740;
        SharedPreferences sharedPreferences = null;
        int i10 = 0;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i7) * (-19961)) >> 31));
            switch (i5) {
                case -2057212934:
                case 1007732544:
                    C3033.m9845();
                    if (C2310.f7472 < 0) {
                        iM2761 = C0773.m3169("᩸۬") ^ i7;
                        i = ((iM2761 ^ i6) * (-31039)) ^ (-794210715);
                        i2 = -440269543;
                    } else {
                        iM2761 = C0773.m3169("᩵֫") ^ i6;
                        i = ((iM2761 ^ i7) * (-31325)) ^ (-1773754965);
                        i2 = 532776464;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1745575459:
                case -1024288743:
                    if (i4 < iM7976) {
                        iM2761 = C0773.m3169("ۤܺ") ^ i6;
                        i = ((iM2761 ^ i7) * (-5461)) ^ (-377479309);
                        i2 = -26302583;
                    } else {
                        iM2761 = C0619.m2761("ܿܺ") ^ i7;
                        i = ((iM2761 ^ i6) * 939) ^ (-389277489);
                        i2 = -2063884437;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1636289384:
                case -32167929:
                    bArrM48911 = c21501.m48911();
                    iM7752 = C2288.m7752(c14787M2739);
                    if (C0487.f2131 <= 0) {
                        iM2761 = (i6 - C0773.m3169("᩸۫")) * 87;
                        i = ((iM2761 ^ i7) * (-31219)) ^ 2179902;
                        i2 = 253729508;
                    } else {
                        iM2761 = C0619.m2761("ܰ֨") ^ i6;
                        i = ((iM2761 ^ i7) * (-26633)) ^ (-1850608587);
                        i2 = 920799160;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1589768529:
                case 1385995096:
                    editorEdit.remove(C3492.m11492(c4347));
                    iM2761 = (C0619.m2761("ܺۤ") + i6) * 65;
                    i = ((iM2761 ^ i7) * 20569) ^ 1783232362;
                    i2 = 686180281;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1406498955:
                case 478940296:
                    editorEdit.apply();
                    interfaceC9801 = ApplicationC17729.f58258;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("᩸۬") ^ i7;
                        i = ((iM2761 ^ i6) * (-31039)) ^ (-794210715);
                        i2 = -440269543;
                    } else {
                        iM2761 = (C0773.m3169("ۚܺ") + i6) * 93;
                        i = ((iM2761 ^ i7) * (-25081)) ^ (-1785178522);
                        i2 = 1022570958;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1337487169:
                case 1944606212:
                    interfaceC18752M8173 = C2419.m8173(interfaceC9801);
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0773.m3169("᩵֫") ^ i6;
                        i = ((iM2761 ^ i7) * (-31325)) ^ (-1773754965);
                        i2 = 532776464;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ۚܽ")) * 89;
                        i = ((iM2761 ^ i6) * (-27331)) ^ (-1228761938);
                        i2 = 624957414;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1305109158:
                case -727534630:
                    if (m2748(i4, bArrM48912)) {
                        iM2761 = C0619.m2761("ۜܺ") ^ i7;
                        i = ((iM2761 ^ i6) * (-12241)) ^ (-2047722436);
                        i2 = -1373049051;
                    } else {
                        iM2761 = C0619.m2761("᩵ۜ") ^ i6;
                        i = ((iM2761 ^ i7) * 23717) ^ 757324989;
                        i2 = -697617352;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1228710196:
                case 1243350940:
                    iM7976 = C2354.m7976(iM48914, C2702.m8879(c14787M2747));
                    i4 = i10;
                    iM2761 = C0773.m3169("ۜᩴ") ^ i7;
                    i = ((iM2761 ^ i6) * (-16563)) ^ 1746822191;
                    i2 = 1250277003;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1199176253:
                case 890140483:
                    C2023.m6964();
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("ۛܿ") ^ i7;
                        i = ((iM2761 ^ i6) * 24781) ^ (-1369853339);
                        i2 = 1898697562;
                    } else {
                        iM2761 = C0773.m3169("᩸۬") ^ i7;
                        i = ((iM2761 ^ i6) * (-31039)) ^ (-794210715);
                        i2 = -440269543;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1192578715:
                case -170201269:
                    if (i3 < iM53427) {
                        iM2761 = (C0619.m2761("ۖ᩻") + i6) * (-77);
                        i = ((iM2761 ^ i7) * 1465) ^ (-1992520458);
                        i2 = 111186347;
                    } else {
                        iM2761 = (C0619.m2761("ܺᩳ") + i7) * (-7);
                        i = ((iM2761 ^ i6) * 23161) ^ 1020088579;
                        i2 = 1480513379;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1137483466:
                case -49957992:
                    AbstractC0116.m1243();
                    C3099.m10095();
                    iM2761 = C0773.m3169("ۛܿ") ^ i7;
                    i = ((iM2761 ^ i6) * 24781) ^ (-1369853339);
                    i2 = 1898697562;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1020001233:
                case -56309830:
                    i4++;
                    iM2761 = C0773.m3169("ۜᩴ") ^ i7;
                    i = ((iM2761 ^ i6) * (-16563)) ^ 1746822191;
                    i2 = 1250277003;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -915518464:
                case 2111143088:
                    c14787M2739 = m2739();
                    iM48913 = c21501.m48913();
                    if (C2023.f6737) {
                        iM2761 = (i6 - C0773.m3169("᩸۫")) * 87;
                        i = ((iM2761 ^ i7) * (-31219)) ^ 2179902;
                        i2 = 253729508;
                    } else {
                        iM2761 = (C0619.m2761("ܺܶ") ^ i7) * 91;
                        i = ((iM2761 ^ i6) * 21291) ^ (-1762750302);
                        i2 = 2085612213;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -695763089:
                case -665717654:
                    iM48914 = c21501.m48914();
                    bArrM48912 = c21501.m48912();
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("ۛܿ") ^ i7;
                        i = ((iM2761 ^ i6) * 24781) ^ (-1369853339);
                        i2 = 1898697562;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩷") ^ i7;
                        i = ((iM2761 ^ i6) * 20723) ^ (-930918630);
                        i2 = -1033159657;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -588890168:
                case 2080584232:
                    i3 = 0;
                    i10 = 0;
                    iM2761 = (C0619.m2761("᩺ۨ") + i7) * (-71);
                    i = ((iM2761 ^ i6) * (-18249)) ^ (-746354187);
                    i2 = -1660324835;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -560533051:
                case -450913317:
                    c4347 = (C4347) c14787M2739.get(i3);
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("᩵֫") ^ i6;
                        i = ((iM2761 ^ i7) * (-31325)) ^ (-1773754965);
                        i2 = 532776464;
                    } else {
                        iM2761 = C0773.m3169("ܿۢ") ^ i7;
                        i = ((iM2761 ^ i6) * 12071) ^ (-1194352989);
                        i2 = 692660390;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -467814239:
                case -153105258:
                    i3++;
                    iM2761 = (C0619.m2761("᩺ۨ") + i7) * (-71);
                    i = ((iM2761 ^ i6) * (-18249)) ^ (-746354187);
                    i2 = -1660324835;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -450781114:
                case 1390541321:
                    sharedPreferences = ApplicationC17729.f58262;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("᩸۬") ^ i7;
                        i = ((iM2761 ^ i6) * (-31039)) ^ (-794210715);
                        i2 = -440269543;
                    } else {
                        iM2761 = C0619.m2761("۫ᩴ") ^ i7;
                        i = ((iM2761 ^ i6) * 11463) ^ (-2059391958);
                        i2 = -930386559;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -394881026:
                case -111359724:
                    C0269.m1775();
                    break;
                case 179222786:
                case 1090280674:
                    editorEdit = sharedPreferences.edit();
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("᩸ۡ") + i6) * 15;
                        i = ((iM2761 ^ i7) * (-23765)) ^ (-762677370);
                        i2 = 2134215018;
                    } else {
                        iM2761 = C0773.m3169("ܰܿ") ^ i6;
                        i = ((iM2761 ^ i7) * (-24125)) ^ (-2083701328);
                        i2 = 1461277242;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 190401810:
                case 643822961:
                    interfaceC18752M8173.remove(C2419.m8164((C4347) c14787M2747.get(i4)));
                    iM2761 = C0619.m2761("᩵ۜ") ^ i6;
                    i = ((iM2761 ^ i7) * 23717) ^ 757324989;
                    i2 = -697617352;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 335002295:
                case 650078773:
                    if (m2748(i3, bArrM48911)) {
                        iM2761 = C0619.m2761("ۧ֫") ^ i6;
                        i = ((iM2761 ^ i7) * 12813) ^ (-920227151);
                        i2 = -808220422;
                    } else {
                        iM2761 = (C0619.m2761("ܺۤ") + i6) * 65;
                        i = ((iM2761 ^ i7) * 20569) ^ 1783232362;
                        i2 = 686180281;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 472804165:
                case 1668534689:
                    iM53427 = C23916.m53427(iM48913, iM7752);
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("᩸۬") ^ i7;
                        i = ((iM2761 ^ i6) * (-31039)) ^ (-794210715);
                        i2 = -440269543;
                    } else {
                        iM2761 = (C0619.m2761("ۛۨ") ^ i6) * 73;
                        i = ((iM2761 ^ i7) * (-6811)) ^ 2058799114;
                        i2 = -388525344;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 845544741:
                case 1410726569:
                    c14787M2747 = m2747();
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0773.m3169("ۛܿ") ^ i7;
                        i = ((iM2761 ^ i6) * 24781) ^ (-1369853339);
                        i2 = 1898697562;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ۡۧ")) * 45;
                        i = ((iM2761 ^ i7) * (-20635)) ^ (-529734280);
                        i2 = 1569290457;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 1506853177:
                case 1840709607:
                    C3779.m12264();
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = C0773.m3169("ۛܿ") ^ i7;
                        i = ((iM2761 ^ i6) * 24781) ^ (-1369853339);
                        i2 = 1898697562;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۡ") + i6) * 15;
                        i = ((iM2761 ^ i7) * (-23765)) ^ (-762677370);
                        i2 = 2134215018;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                default:
                    C2375.m8061(interfaceC18752M8173);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14787 m2747() {
        return (C14787) f2437.getValue();
    }

    static {
        C3601 c3601 = null;
        InterfaceC0812 interfaceC0812M24070 = null;
        C20755 c20755 = null;
        int i = -45464279;
        int i2 = C3099.f10023;
        int i3 = C4282.f15546;
        int iM2761 = (C0619.m2761("ۖ᩻") + i2) * (-115);
        int i4 = ((iM2761 ^ i3) * (-2037)) ^ 1356224733;
        int i5 = 568743824;
        while (true) {
            i = ((((i ^ i3) * 28589) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2078918488:
                case -1391261278:
                    C23916.m53419();
                    throw new RuntimeException();
                case -2019621059:
                case 165132334:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩵ܿ")) * 47;
                        i4 = ((iM2761 ^ i2) * 31289) ^ (-1008146541);
                        i5 = -1716334122;
                    } else {
                        iM2761 = C0773.m3169("ۗۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22253)) ^ (-1311302032);
                        i5 = -577334014;
                    }
                    break;
                case -1988982093:
                case -1769144180:
                    c20755 = new C20755();
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("۫۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16647) ^ (-86301578);
                        i5 = -24263119;
                    } else {
                        iM2761 = C0619.m2761("ۖᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11043) ^ (-1426225492);
                        i5 = 1559756026;
                    }
                    break;
                case -1907183332:
                case 1940392447:
                    c3601 = new C3601();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩵ܿ")) * 47;
                        i4 = ((iM2761 ^ i2) * 31289) ^ (-1008146541);
                        i5 = -1716334122;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩶ۡ")) * 77;
                        i4 = ((iM2761 ^ i3) * 1107) ^ (-2006462706);
                        i5 = -288540738;
                    }
                    break;
                case -1888788866:
                case -960202048:
                    C1542.m5459();
                    C0773.m3161();
                    iM2761 = (i3 - C0773.m3169("᩻ۡ")) * 21;
                    i4 = ((iM2761 ^ i2) * 20685) ^ 273644691;
                    i5 = -1405498151;
                    break;
                case -1636539074:
                case -1495277098:
                    if (!C1343.m4943()) {
                        iM2761 = (i2 - C0773.m3169("ۧ۠")) * (-97);
                        i4 = ((iM2761 ^ i3) * 3991) ^ 950447252;
                        i5 = 126459661;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩵ܿ")) * 47;
                        i4 = ((iM2761 ^ i2) * 31289) ^ (-1008146541);
                        i5 = -1716334122;
                    }
                    break;
                case -1572087685:
                case -1158631708:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ۧ۠")) * (-97);
                        i4 = ((iM2761 ^ i3) * 3991) ^ 950447252;
                        i5 = 126459661;
                    } else {
                        iM2761 = (C0773.m3169("۬ܳ") + i2) * (-69);
                        i4 = ((iM2761 ^ i3) * 28541) ^ 161004525;
                        i5 = -749219014;
                    }
                    break;
                case -952618839:
                case -16783800:
                    f2437 = interfaceC0812M24070;
                    if (C1519.m5403()) {
                        iM2761 = (C0773.m3169("ܰۙ") + i3) * 41;
                        i4 = ((iM2761 ^ i2) * 2093) ^ (-352212233);
                        i5 = 1462560989;
                    } else {
                        iM2761 = C0619.m2761("۫۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16647) ^ (-86301578);
                        i5 = -24263119;
                    }
                    break;
                case -884608968:
                case 800788188:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ۧ۠")) * (-97);
                        i4 = ((iM2761 ^ i3) * 3991) ^ 950447252;
                        i5 = 126459661;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩻ۡ")) * 21;
                        i4 = ((iM2761 ^ i2) * 20685) ^ 273644691;
                        i5 = -1405498151;
                    }
                    break;
                case -500080635:
                case -86704790:
                    if (C2375.m8065() <= 0) {
                        iM2761 = (i2 - C0619.m2761("ᩳܺ")) * (-71);
                        i4 = ((iM2761 ^ i3) * (-28253)) ^ (-1844452686);
                        i5 = 1252269215;
                    } else {
                        iM2761 = C0619.m2761("ܿܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 29193) ^ 1888240038;
                        i5 = -540206491;
                    }
                    break;
                case -436972527:
                case 1630648801:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩻ۡ")) * 21;
                        i4 = ((iM2761 ^ i2) * 20685) ^ 273644691;
                        i5 = -1405498151;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩹᩺")) * 39;
                        i4 = ((iM2761 ^ i2) * (-2161)) ^ (-1688415560);
                        i5 = -1762262733;
                    }
                    break;
                case -215589118:
                case 1963664597:
                    interfaceC0812M24070 = C9015.m24070(c3601);
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ᩳܺ")) * (-71);
                        i4 = ((iM2761 ^ i3) * (-28253)) ^ (-1844452686);
                        i5 = 1252269215;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۖ") ^ i3) * (-109);
                        i4 = ((iM2761 ^ i2) * 2201) ^ (-572793696);
                        i5 = -1600158266;
                    }
                    break;
                case -113905464:
                case 1613303836:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("۫۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16647) ^ (-86301578);
                        i5 = -24263119;
                    } else {
                        iM2761 = C0619.m2761("۠ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2425)) ^ (-186524201);
                        i5 = -1418442217;
                    }
                    break;
                case 42405663:
                case 1570794833:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩵ܿ")) * 47;
                        i4 = ((iM2761 ^ i2) * 31289) ^ (-1008146541);
                        i5 = -1716334122;
                    } else {
                        iM2761 = (C0619.m2761("۫ᩴ") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * (-14841)) ^ 637085691;
                        i5 = -1587102178;
                    }
                    break;
                case 550174131:
                case 1875909803:
                    C3099.m10095();
                    if (C4282.f15546 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ᩳܺ")) * (-71);
                        i4 = ((iM2761 ^ i3) * (-28253)) ^ (-1844452686);
                        i5 = 1252269215;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۧ۠")) * (-97);
                        i4 = ((iM2761 ^ i3) * 3991) ^ 950447252;
                        i5 = 126459661;
                    }
                    break;
                default:
                    f2438 = C9015.m24070(c20755);
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14787 m2739() {
        return (C14787) f2438.getValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m2743(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws C4866 {
        int i;
        String str;
        float f;
        boolean z6;
        int i2;
        JSONArray jSONArray;
        String str2;
        JSONArray jSONArray2;
        boolean z7;
        int i3;
        int iM2761;
        int i4;
        int i5;
        int iM3169;
        int i6;
        int i7;
        int iM31610;
        int i8;
        int i9;
        int iM31611;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        String str3;
        int i14;
        byte[] bArr;
        int i15;
        int i16;
        byte[] bArr2;
        String str4;
        float f2;
        C13778 c13778;
        int i17;
        int i18;
        JSONArray jSONArray3;
        boolean z8;
        int i19;
        int i20;
        int i21;
        int i22;
        JSONArray jSONArray4;
        int i23;
        int i24;
        String str5;
        int i25;
        boolean z9;
        int iM7752;
        int i26;
        int iM2762;
        int i27;
        int iM31612;
        int i28;
        int i29;
        String str6;
        String str7;
        int i30;
        int iM8879;
        byte[] bArr3;
        float f3;
        int iM2763;
        int i31;
        int i32;
        String str8;
        float f4;
        boolean z10;
        int i33;
        int i34;
        int iM2764;
        int i35;
        int i36;
        String str9;
        JSONArray jSONArray5;
        ArrayList arrayList2;
        int iM2765;
        int i37;
        int i38;
        int i39;
        int iM2766;
        int i40;
        int i41;
        int i42;
        int i43;
        boolean z11;
        ArrayList arrayList3;
        boolean z12;
        JSONArray jSONArray6;
        int iM31613;
        int i44;
        int i45;
        int iM2767;
        int i46;
        int i47;
        String str10;
        ArrayList arrayList4;
        int iM31614;
        int i48;
        int i49;
        boolean z13;
        float f5;
        int iM2768;
        int i50;
        int i51;
        int iM2769;
        int i52;
        int i53;
        Iterator itM7968 = null;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        C4347 c4347 = null;
        Iterator itM47859 = null;
        int i57 = 0;
        AbstractC14806 abstractC14806 = null;
        Iterator it = null;
        Iterator itM4942 = null;
        C5061 c5061 = null;
        int[] iArr = null;
        Iterator itM4943 = null;
        int i58 = 0;
        int i59 = 1990314379;
        int i60 = C2354.f7599;
        int i61 = C2287.f7432;
        int iM31615 = (C0773.m3169("ܰۗ") + i61) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i62 = ((iM31615 ^ i60) * 17299) ^ (-1171288033);
        int i63 = iM31615 ^ 195319527;
        C6178 c6178 = null;
        SharedPreferences sharedPreferences = null;
        Iterator itM53423 = null;
        String str11 = null;
        String strM13650 = null;
        InterfaceC9801 interfaceC9801 = null;
        byte[] bArr4 = null;
        Iterator itM4944 = null;
        Iterator itM4945 = null;
        C13778 c13779 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str12 = null;
        int length = 0;
        int iM13851 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        float f6 = 0.0f;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        int i73 = 0;
        int i74 = 0;
        int iM88710 = 0;
        JSONArray jSONArray7 = null;
        boolean z14 = false;
        byte b = 0;
        float f7 = 0.0f;
        int i75 = 0;
        Iterator itM13647 = null;
        JSONArray jSONArray8 = null;
        String str13 = null;
        int i76 = 0;
        byte[] bArr5 = null;
        C4347 c4348 = null;
        int i77 = 0;
        int i78 = 0;
        while (true) {
            i59 = i63 ^ (i62 & (((i59 ^ i60) * 1955) >> 31));
            switch (i59) {
                case -2134536623:
                case -1568715427:
                    c6178.m17803(sharedPreferences.getLong(C3492.m11492(c4348), 0L));
                    str5 = str11;
                    z9 = z14;
                    int i79 = iM88710;
                    str13 = str13;
                    i22 = i79;
                    i24 = i69;
                    iM7752 = i70;
                    i25 = i67;
                    i26 = i78;
                    int iM31616 = (C0773.m3169("ۢᩳ") ^ i61) * 67;
                    i67 = i25;
                    iM13851 = iM13851;
                    i75 = i75;
                    i76 = i76;
                    jSONArray8 = jSONArray8;
                    i69 = i24;
                    i66 = i66;
                    i68 = i26;
                    i73 = i73;
                    i77 = i77;
                    bArr5 = bArr5;
                    c13779 = c13779;
                    bArr4 = bArr4;
                    i71 = i71;
                    i70 = iM7752;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str12;
                    i63 = iM31616 ^ (-212356462);
                    i62 = ((iM31616 ^ i60) * (-27971)) ^ (-1545660557);
                    length = length;
                    z14 = z9;
                    f7 = f7;
                    str11 = str5;
                    String str14 = str13;
                    iM88710 = i22;
                    str13 = str14;
                    break;
                case -2124018371:
                case 389410494:
                    i34 = i76;
                    str8 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str11;
                    f4 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z10 = z14;
                    i75 = i75;
                    i33 = length;
                    int i80 = iM88710;
                    str13 = str13;
                    i22 = i80;
                    if (C3998.m12923(itM4945)) {
                        iM2764 = C0619.m2761("ۙܺ") ^ i61;
                        i35 = ((iM2764 ^ i60) * 1815) ^ (-478446642);
                        i36 = 1174932270;
                    } else {
                        iM2764 = (i60 - C0619.m2761("ᩳ֡")) * 15;
                        i35 = ((iM2764 ^ i61) * 26355) ^ (-1297555095);
                        i36 = -1584147761;
                    }
                    int i81 = iM2764 ^ i36;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    i69 = i69;
                    i62 = i35;
                    jSONArray8 = jSONArray8;
                    i66 = i66;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i73 = i73;
                    bArr4 = bArr4;
                    str12 = str8;
                    i63 = i81;
                    bArr5 = bArr5;
                    i71 = i71;
                    length = i33;
                    z14 = z10;
                    i70 = i70;
                    f7 = f4;
                    i76 = i34;
                    str11 = str5;
                    String str15 = str13;
                    iM88710 = i22;
                    str13 = str15;
                    break;
                case -2120524681:
                case 971208040:
                    i76 = i76;
                    str12 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z14 = z14;
                    i75 = i75;
                    length = length;
                    i68 = i68;
                    i69 = i69;
                    iM13851 = iM13851;
                    i67 = i67;
                    int i82 = iM88710;
                    str13 = str13;
                    iM88710 = i82;
                    short s = f2436[161];
                    int i83 = s + 4823;
                    if ((s * 19292) - (i83 * i83) <= 0) {
                        iM31611 = (i60 - C0773.m3169("᩷ܶ")) * 93;
                        i10 = ((iM31611 ^ i61) * 17549) ^ 1351331544;
                        i11 = 318489469;
                    } else {
                        iM31611 = C0773.m3169("֡۟") ^ i61;
                        i10 = ((iM31611 ^ i60) * (-14571)) ^ (-1894182745);
                        i11 = 1651683564;
                    }
                    i42 = iM31611 ^ i11;
                    i67 = i67;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str16 = str13;
                    iM88710 = iM88710;
                    str13 = str16;
                    break;
                case -2106701827:
                case 552218298:
                    i76 = i76;
                    str12 = str12;
                    str13 = str13;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    boolean z15 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z15;
                    int i84 = i77 >>> 3;
                    bArr4[i84] = (byte) ((i57 << (i77 & 7)) | bArr4[i84]);
                    iM31613 = C0619.m2761("ܽܳ") ^ i61;
                    i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                    i45 = -988517401;
                    int i85 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i85;
                    float f8 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f8;
                    break;
                case -2070738809:
                case 123887304:
                    c6178.m17794(iArr[i66]);
                    i66++;
                    int iM27610 = C0619.m2761("ۙᩴ") ^ i60;
                    f7 = f7;
                    b = b;
                    str12 = str12;
                    i76 = i76;
                    i63 = iM27610 ^ (-2139620717);
                    i62 = ((iM27610 ^ i61) * (-12059)) ^ 2029061125;
                    length = length;
                    z14 = z14;
                    break;
                case -2055587352:
                case 1446871856:
                    int i86 = i76;
                    str12 = str12;
                    str13 = str13;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    i66 = i66;
                    boolean z16 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z16;
                    if (i86 <= 102400) {
                        iM31613 = C0619.m2761("ۗۧ") ^ i61;
                        i76 = i86;
                        i44 = ((iM31613 ^ i60) * 597) ^ (-345148454);
                        i45 = -792666551;
                    } else {
                        i76 = i86;
                        iM31613 = (i60 - C0773.m3169("᩹֡")) * (-99);
                        i44 = ((iM31613 ^ i61) * 10491) ^ (-831294078);
                        i45 = -1105934575;
                    }
                    int i87 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i87;
                    float f9 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f9;
                    break;
                case -2044959700:
                case -32514157:
                    str7 = str11;
                    iM88710 = iM88710;
                    c6178.mo17812(65535);
                    c6178.m17780();
                    C14787 c14787M2747 = m2747();
                    InterfaceC9801 interfaceC9802 = ApplicationC17729.f58258;
                    i30 = i69;
                    C0269.m1781(interfaceC9802, C4282.m13650(f2436, 207, 4, i64));
                    iM8879 = (C2702.m8879(c14787M2747) + i65) / 8;
                    C20932.m47860(c6178, 1749442553);
                    c6178.m17797();
                    itM4944 = C1343.m4942(c14787M2747);
                    interfaceC9801 = interfaceC9802;
                    bArr3 = new byte[iM8879];
                    f3 = f6;
                    i57 = i30;
                    i77 = 0;
                    int iM27611 = C0619.m2761("ܳۛ") ^ i60;
                    int i88 = iM8879;
                    i62 = ((iM27611 ^ i61) * 18599) ^ (-822992937);
                    i75 = i75;
                    c13779 = c13779;
                    str11 = str7;
                    bArr4 = bArr3;
                    jSONArray8 = jSONArray8;
                    i66 = i66;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i73 = i88;
                    str12 = str12;
                    i71 = i71;
                    i63 = iM27611 ^ 1424474794;
                    i70 = i70;
                    bArr5 = bArr5;
                    i76 = i76;
                    int i89 = i30;
                    i68 = i68;
                    length = length;
                    z14 = z14;
                    f7 = f3;
                    iM13851 = iM13851;
                    i69 = i89;
                    String str17 = str13;
                    iM88710 = iM88710;
                    str13 = str17;
                    break;
                case -2018966413:
                case 646888720:
                    i76 = i76;
                    str12 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z9 = z14;
                    i75 = i75;
                    length = length;
                    int i90 = iM88710;
                    str13 = str13;
                    i22 = i90;
                    int i91 = i68 >>> 3;
                    bArr5[i91] = (byte) (bArr5[i91] | (i69 << (i68 & 7)));
                    i24 = i69;
                    iM7752 = i70;
                    i25 = i67;
                    i26 = i78;
                    int iM31617 = (C0773.m3169("ۢᩳ") ^ i61) * 67;
                    i67 = i25;
                    iM13851 = iM13851;
                    i75 = i75;
                    i76 = i76;
                    jSONArray8 = jSONArray8;
                    i69 = i24;
                    i66 = i66;
                    i68 = i26;
                    i73 = i73;
                    i77 = i77;
                    bArr5 = bArr5;
                    c13779 = c13779;
                    bArr4 = bArr4;
                    i71 = i71;
                    i70 = iM7752;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str12;
                    i63 = iM31617 ^ (-212356462);
                    i62 = ((iM31617 ^ i60) * (-27971)) ^ (-1545660557);
                    length = length;
                    z14 = z9;
                    f7 = f7;
                    str11 = str5;
                    String str18 = str13;
                    iM88710 = i22;
                    str13 = str18;
                    break;
                case -1999335852:
                case -1295967691:
                    str8 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str11;
                    f4 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z10 = z14;
                    i75 = i75;
                    i33 = length;
                    i22 = iM88710;
                    arrayList5 = new ArrayList();
                    itM7968 = C2354.m7968(C16530.m39165());
                    i34 = 0;
                    iM2764 = C0773.m3169("ᩳۘ") ^ i60;
                    i35 = ((iM2764 ^ i61) * 6171) ^ (-1326047995);
                    i36 = -1484444931;
                    int i810 = iM2764 ^ i36;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    i69 = i69;
                    i62 = i35;
                    jSONArray8 = jSONArray8;
                    i66 = i66;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i73 = i73;
                    bArr4 = bArr4;
                    str12 = str8;
                    i63 = i810;
                    bArr5 = bArr5;
                    i71 = i71;
                    length = i33;
                    z14 = z10;
                    i70 = i70;
                    f7 = f4;
                    i76 = i34;
                    str11 = str5;
                    String str19 = str13;
                    iM88710 = i22;
                    str13 = str19;
                    break;
                case -1979372021:
                case -1333283672:
                    i34 = i76 + i58;
                    str8 = str12;
                    str5 = str11;
                    f4 = f7;
                    z10 = z14;
                    i33 = length;
                    i22 = iM88710;
                    iM2764 = C0773.m3169("ᩳۘ") ^ i60;
                    i35 = ((iM2764 ^ i61) * 6171) ^ (-1326047995);
                    i36 = -1484444931;
                    int i811 = iM2764 ^ i36;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    i69 = i69;
                    i62 = i35;
                    jSONArray8 = jSONArray8;
                    i66 = i66;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i73 = i73;
                    bArr4 = bArr4;
                    str12 = str8;
                    i63 = i811;
                    bArr5 = bArr5;
                    i71 = i71;
                    length = i33;
                    z14 = z10;
                    i70 = i70;
                    f7 = f4;
                    i76 = i34;
                    str11 = str5;
                    String str110 = str13;
                    iM88710 = i22;
                    str13 = str110;
                    break;
                case -1975008433:
                case -1892502895:
                    i76 = i76;
                    str12 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z14 = z14;
                    i75 = i75;
                    length = length;
                    i68 = i68;
                    i69 = i69;
                    iM13851 = iM13851;
                    int i92 = iM88710;
                    str13 = str13;
                    iM88710 = i92;
                    if (C3998.m12923(itM53423)) {
                        iM2762 = C0619.m2761("ۘ᩷") ^ i61;
                        i10 = ((iM2762 ^ i60) * 9715) ^ (-1548317171);
                        i27 = -1710799233;
                    } else {
                        iM2762 = C0619.m2761("᩵ܰ") ^ i61;
                        i10 = ((iM2762 ^ i60) * 21655) ^ 1022197505;
                        i27 = -1622511165;
                    }
                    i42 = iM2762 ^ i27;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str111 = str13;
                    iM88710 = iM88710;
                    str13 = str111;
                    break;
                case -1898351799:
                case 156676652:
                    C24485 c24485 = (C24485) C0950.m3796(itM4942);
                    c24485.m54751().m25108(c6178);
                    c6178.m17800(c24485.m54753());
                    iM31614 = (C0619.m2761("۟᩻") ^ i60) * 75;
                    i48 = ((iM31614 ^ i61) * 19371) ^ (-1799323973);
                    i49 = 2104518127;
                    int i93 = iM31614 ^ i49;
                    f7 = f7;
                    str12 = str12;
                    i63 = i93;
                    str11 = str11;
                    i62 = i48;
                    length = length;
                    i76 = i76;
                    z14 = z14;
                    break;
                case -1867930486:
                case -1444984396:
                    f5 = f7;
                    c6178.mo17812(i77);
                    c6178.m17803(interfaceC9801.getLong(C3492.m11492(c4347), 0L));
                    str13 = str13;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    z12 = z14;
                    length = length;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    str11 = str11;
                    f7 = f5;
                    bArr4 = bArr4;
                    iM31613 = C0619.m2761("ܽܳ") ^ i61;
                    i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                    i45 = -988517401;
                    int i812 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i812;
                    float f10 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f10;
                    break;
                case -1844506567:
                case -955990304:
                    throw new C4866(C0773.m3169(C0487.m2361(f2436, 227, 3, i64)) ^ 2101105068);
                case -1819479667:
                case -1703478555:
                    i76 = i76;
                    str12 = str12;
                    int i94 = i72;
                    str13 = str13;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    i66 = i66;
                    boolean z17 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z17;
                    if (iM13851 != i94) {
                        int iM27612 = (C0619.m2761("ۗܳ") ^ i61) * (-123);
                        i72 = i94;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = ((iM27612 ^ i60) * 25691) ^ (-927964596);
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f7;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = iM27612 ^ (-584360272);
                        i66 = i66;
                    } else {
                        i72 = i94;
                        iM31613 = C0619.m2761("۬ܶ") ^ i60;
                        i44 = ((iM31613 ^ i61) * 6983) ^ 199598278;
                        i45 = -905889205;
                        int i813 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i813;
                        float f11 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f11;
                    }
                    break;
                case -1802521978:
                case 1898023933:
                    i76 = i76;
                    str12 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray = jSONArray7;
                    str2 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray2 = jSONArray8;
                    z7 = z14;
                    i3 = i75;
                    length = length;
                    i68 = i68;
                    int i95 = iM88710;
                    str13 = str13;
                    i2 = i95;
                    i78 = i68 + 1;
                    c4348 = (C4347) C0950.m3796(itM13647);
                    if (sharedPreferences.contains(C2419.m8164(c4348))) {
                        iM2761 = C0619.m2761("ۛۜ") ^ i60;
                        i4 = ((iM2761 ^ i61) * 29833) ^ (-1712258160);
                        i5 = -321700994;
                    } else {
                        iM2761 = C0773.m3169("֨ܶ") ^ i61;
                        i4 = ((iM2761 ^ i60) * 26871) ^ (-381289390);
                        i5 = -1499884137;
                    }
                    i7 = iM2761 ^ i5;
                    i68 = i68;
                    i75 = i3;
                    length = length;
                    z14 = z7;
                    i77 = i77;
                    jSONArray8 = jSONArray2;
                    i66 = i66;
                    c13779 = c13779;
                    f7 = f7;
                    str11 = str2;
                    i73 = i73;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    int i96 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i96;
                    String str20 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str20;
                    String str21 = str13;
                    iM88710 = i2;
                    str13 = str21;
                    break;
                case -1798312269:
                case 73335738:
                    i76 = i76;
                    str12 = str12;
                    boolean z18 = z14;
                    length = length;
                    String strM8877 = C2702.m8877(interfaceC9801, C3492.m11492(c4347), null);
                    C1146.m4233(strM8877);
                    byte[] bArrM12260 = C3779.m12260(strM8877, C21015.f67180);
                    str11 = str11;
                    C2310.m7811(bArrM12260, str11);
                    c6178.mo17812(i77);
                    f7 = f7;
                    c6178.m17809(bArrM12260.length);
                    c6178.write(bArrM12260, 0, bArrM12260.length);
                    z12 = z18;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    iM31613 = C0619.m2761("ܽܳ") ^ i61;
                    i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                    i45 = -988517401;
                    int i814 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i814;
                    float f12 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f12;
                    break;
                case -1759904883:
                case -452047488:
                    jSONArray = jSONArray7;
                    str2 = str11;
                    i3 = i75;
                    z7 = z14;
                    i2 = iM88710;
                    jSONArray.add(3);
                    C0487.m2363(c6178, 1749442556);
                    c6178.m17797();
                    jSONArray2 = new JSONArray();
                    itM4945 = C1343.m4942(C8969.m23948());
                    iM2761 = (i60 - C0619.m2761("ۗۚ")) * (-43);
                    i4 = ((iM2761 ^ i61) * (-20695)) ^ 591345211;
                    i5 = 1097147852;
                    i7 = iM2761 ^ i5;
                    i68 = i68;
                    i75 = i3;
                    length = length;
                    z14 = z7;
                    i77 = i77;
                    jSONArray8 = jSONArray2;
                    i66 = i66;
                    c13779 = c13779;
                    f7 = f7;
                    str11 = str2;
                    i73 = i73;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    int i97 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i97;
                    String str22 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str22;
                    String str23 = str13;
                    iM88710 = i2;
                    str13 = str23;
                    break;
                case -1725053317:
                case -1699427157:
                    return;
                case -1698632763:
                case -1435004211:
                    f5 = f7;
                    byte[] bArrMo7903 = interfaceC9801.mo7903(C2419.m8164(c4347), (byte[]) null);
                    RunnableC3646.m11808(bArrMo7903);
                    c6178.mo17812(i77);
                    c6178.m17809(bArrMo7903.length);
                    c6178.write(bArrMo7903, 0, bArrMo7903.length);
                    str13 = str13;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    z12 = z14;
                    length = length;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    str11 = str11;
                    f7 = f5;
                    bArr4 = bArr4;
                    iM31613 = C0619.m2761("ܽܳ") ^ i61;
                    i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                    i45 = -988517401;
                    int i815 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i815;
                    float f13 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f13;
                    break;
                case -1666344540:
                case 1599369432:
                    int i98 = i77;
                    int i99 = i76;
                    str12 = str12;
                    i69 = i69;
                    int i100 = i70;
                    byte[] bArr6 = bArr5;
                    int i101 = i71;
                    int i102 = i73;
                    byte[] bArr7 = bArr4;
                    jSONArray = jSONArray7;
                    String str24 = str11;
                    float f14 = f7;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    int i103 = i66;
                    JSONArray jSONArray9 = jSONArray8;
                    boolean z19 = z14;
                    int i104 = i75;
                    int i105 = length;
                    int i106 = iM88710;
                    str13 = str13;
                    i2 = i106;
                    String strM6952 = C2023.m6952(jSONArray);
                    byte[] bArrM17798 = c6178.m17798();
                    ReentrantLock reentrantLock = C11650.f37690;
                    C2592 c2592M12270 = C3779.m12270(4178);
                    C1080.m4048(c2592M12270, strM6952);
                    c2592M12270.m8678(bArrM17798);
                    C13778 c13778M8684 = c2592M12270.m8684();
                    if (C2878.m9488(c13778M8684)) {
                        iM3169 = C0773.m3169("۫ۡ") ^ i61;
                        i4 = ((iM3169 ^ i60) * 32483) ^ 1392524637;
                        i6 = 446926836;
                    } else {
                        iM3169 = (C0773.m3169("ۨۧ") + i61) * 73;
                        i4 = ((iM3169 ^ i60) * (-8369)) ^ (-293849698);
                        i6 = -2037300331;
                    }
                    i7 = iM3169 ^ i6;
                    i75 = i104;
                    bArr4 = bArr7;
                    i77 = i98;
                    c13779 = c13778M8684;
                    jSONArray8 = jSONArray9;
                    i71 = i101;
                    i66 = i103;
                    length = i105;
                    z14 = z19;
                    i70 = i100;
                    i73 = i102;
                    f7 = f14;
                    i76 = i99;
                    str11 = str24;
                    bArr5 = bArr6;
                    int i910 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i910;
                    String str25 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str25;
                    String str26 = str13;
                    iM88710 = i2;
                    str13 = str26;
                    break;
                case -1661665554:
                case -470808148:
                    c6178.mo17812(i77);
                    f5 = f7;
                    c6178.m17781(interfaceC9801.getFloat(C2419.m8164(c4347), f5));
                    str13 = str13;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    z12 = z14;
                    length = length;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    str11 = str11;
                    f7 = f5;
                    bArr4 = bArr4;
                    iM31613 = C0619.m2761("ܽܳ") ^ i61;
                    i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                    i45 = -988517401;
                    int i816 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i816;
                    float f15 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f15;
                    break;
                case -1630568648:
                case -1434037779:
                    i76 = i76;
                    str12 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z14 = z14;
                    i75 = i75;
                    length = length;
                    i68 = i68;
                    i69 = i69;
                    iM13851 = iM13851;
                    int i107 = iM88710;
                    str13 = str13;
                    iM88710 = i107;
                    if (z4) {
                        iM2762 = C0773.m3169("᩻ۤ") ^ i60;
                        i10 = ((iM2762 ^ i61) * b.d) ^ 185117565;
                        i27 = 1970110425;
                    } else {
                        iM2762 = C0773.m3169("᩻ܰ") ^ i61;
                        i10 = ((iM2762 ^ i60) * (-22451)) ^ (-2095602344);
                        i27 = 757497568;
                    }
                    i42 = iM2762 ^ i27;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str112 = str13;
                    iM88710 = iM88710;
                    str13 = str112;
                    break;
                case -1564340364:
                case -1313658255:
                    i76 = i76;
                    str12 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z14 = z14;
                    i75 = i75;
                    length = length;
                    i68 = i68;
                    i69 = i69;
                    iM13851 = iM13851;
                    int i108 = iM88710;
                    str13 = str13;
                    iM88710 = i108;
                    jSONArray7.add(4);
                    C20932.m47860(c6178, 1749442557);
                    c6178.m17797();
                    c6178.m17786((CharSequence) C1080.m4058(C7606.m20801()));
                    c6178.m17780();
                    C20932.m47860(c6178, 1749442559);
                    c6178.m17797();
                    c6178.m17786((CharSequence) C1080.m4058(C19518.m45058()));
                    c6178.m17780();
                    iM2762 = C0619.m2761("ۚ᩸") ^ i61;
                    i10 = ((iM2762 ^ i60) * 1653) ^ 1731934630;
                    i27 = 517476335;
                    i42 = iM2762 ^ i27;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str113 = str13;
                    iM88710 = iM88710;
                    str13 = str113;
                    break;
                case -1520629171:
                case 1852658394:
                    i34 = i76;
                    str8 = str12;
                    boolean z20 = z14;
                    i33 = length;
                    String str27 = str11;
                    f4 = f7;
                    try {
                        C21914 c21914 = new C21914(abstractC14806.mo18534(), abstractC14806.mo18537());
                        arrayList4 = arrayList5;
                        try {
                            C1519.m5406(arrayList4, c21914);
                            int length2 = ((byte[]) c21914.m49603()).length;
                            int iM31618 = (C0773.m3169("֫᩹") + i61) * (-27);
                            i62 = ((iM31618 ^ i60) * 31413) ^ (-347704676);
                            i58 = length2;
                            f7 = f4;
                            str11 = str27;
                            arrayList5 = arrayList4;
                            length = i33;
                            i76 = i34;
                            z14 = z20;
                            str10 = str8;
                            i63 = iM31618 ^ (-840255845);
                            str12 = str10;
                        } catch (Exception unused) {
                            str5 = str27;
                            arrayList5 = arrayList4;
                            z10 = z20;
                            i22 = iM88710;
                            iM2764 = C0773.m3169("ᩳۘ") ^ i60;
                            i35 = ((iM2764 ^ i61) * 6171) ^ (-1326047995);
                            i36 = -1484444931;
                            int i817 = iM2764 ^ i36;
                            iM13851 = iM13851;
                            i75 = i75;
                            i77 = i77;
                            i69 = i69;
                            i62 = i35;
                            jSONArray8 = jSONArray8;
                            i66 = i66;
                            c13779 = c13779;
                            arrayList6 = arrayList6;
                            jSONArray7 = jSONArray7;
                            i73 = i73;
                            bArr4 = bArr4;
                            str12 = str8;
                            i63 = i817;
                            bArr5 = bArr5;
                            i71 = i71;
                            length = i33;
                            z14 = z10;
                            i70 = i70;
                            f7 = f4;
                            i76 = i34;
                            str11 = str5;
                            String str114 = str13;
                            iM88710 = i22;
                            str13 = str114;
                        }
                    } catch (Exception unused2) {
                        arrayList4 = arrayList5;
                    }
                    break;
                case -1520184980:
                case 1284385231:
                    throw new RuntimeException(C2354.m7981(c4348.m13851(), strM13650));
                case -1502730834:
                case 1784496871:
                    i76 = i76;
                    str12 = str12;
                    if (iM13851 == i65) {
                        iM2768 = C0773.m3169("ۧ᩶") ^ i61;
                        i50 = ((iM2768 ^ i60) * (-2549)) ^ (-755659772);
                        i51 = -1349621732;
                    } else {
                        iM2768 = C0619.m2761("ۨۗ") ^ i60;
                        i50 = ((iM2768 ^ i61) * (-19403)) ^ 396783565;
                        i51 = 889390099;
                    }
                    int i109 = iM2768 ^ i51;
                    str12 = str12;
                    i63 = i109;
                    i62 = i50;
                    i76 = i76;
                    break;
                case -1450698523:
                case -1105690132:
                    i76 = i76;
                    str12 = str12;
                    str13 = str13;
                    int i110 = i74;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    boolean z21 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z21;
                    if (C1826.m6317(itM47859)) {
                        int iM31619 = (C0773.m3169("᩶֫") + i61) * (-27);
                        i74 = i110;
                        int i111 = ((iM31619 ^ i60) * (-19455)) ^ 1129317934;
                        int i112 = iM31619 ^ 1240498542;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i111;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f7;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i112;
                    } else {
                        i74 = i110;
                        iM31613 = C0773.m3169("ܳۘ") ^ i60;
                        i66 = i66;
                        i44 = ((iM31613 ^ i61) * (-10063)) ^ 745715999;
                        i45 = -102703663;
                        int i818 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i818;
                        float f16 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f16;
                    }
                    break;
                case -1443176135:
                case -687342186:
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z22 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z22;
                    if (iM13851 != 6) {
                        iM2767 = (C0619.m2761("ܽܿ") ^ i60) * 109;
                        i46 = ((iM2767 ^ i61) * 20661) ^ (-125878506);
                        i47 = -550809884;
                    } else {
                        iM2767 = (i61 - C0773.m3169("ۚۢ")) * 29;
                        i46 = ((iM2767 ^ i60) * (-21291)) ^ (-1873987299);
                        i47 = 38896012;
                    }
                    int i113 = iM2767 ^ i47;
                    i76 = i76;
                    String str28 = str12;
                    i63 = i113;
                    i62 = i46;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str28;
                    float f17 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f17;
                    break;
                case -1428565999:
                case 1995800250:
                    str12 = "";
                    i76 = i76;
                    int iM31620 = (i61 - C0773.m3169("ۘۧ")) * 61;
                    i50 = ((iM31620 ^ i60) * 5279) ^ (-262399797);
                    i63 = iM31620 ^ 1282139762;
                    i62 = i50;
                    i76 = i76;
                    break;
                case -1389175556:
                case -163970888:
                    i76 = i76;
                    str12 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray = jSONArray7;
                    str2 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray2 = jSONArray8;
                    z7 = z14;
                    i3 = i75;
                    length = length;
                    i68 = i68;
                    int i114 = iM88710;
                    str13 = str13;
                    i2 = i114;
                    if (z5) {
                        iM2761 = (C0773.m3169("᩸ۧ") + i61) * 89;
                        i4 = ((iM2761 ^ i60) * 12687) ^ 1812090681;
                        i5 = 999587981;
                    } else {
                        iM2761 = C0773.m3169("ܽۚ") ^ i60;
                        i4 = ((iM2761 ^ i61) * 12167) ^ 1599302400;
                        i5 = -818635147;
                    }
                    i7 = iM2761 ^ i5;
                    i68 = i68;
                    i75 = i3;
                    length = length;
                    z14 = z7;
                    i77 = i77;
                    jSONArray8 = jSONArray2;
                    i66 = i66;
                    c13779 = c13779;
                    f7 = f7;
                    str11 = str2;
                    i73 = i73;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    int i911 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i911;
                    String str29 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str29;
                    String str210 = str13;
                    iM88710 = i2;
                    str13 = str210;
                    break;
                case -1339902553:
                case -242708365:
                    int i115 = i76;
                    str9 = str12;
                    int i116 = i71;
                    String str30 = str13;
                    byte[] bArr8 = bArr4;
                    jSONArray5 = jSONArray7;
                    arrayList2 = arrayList6;
                    int i117 = i73;
                    int i118 = i66;
                    boolean z23 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z23;
                    c6178.m17809(i116);
                    int i119 = i70;
                    byte[] bArr9 = bArr5;
                    c6178.write(bArr9, 0, i119);
                    iM88710 = C2702.m8879(m2747());
                    if (i117 != (iM88710 + 7) / 8) {
                        int iM27613 = (C0619.m2761("ۢ᩷") + i60) * 55;
                        int i120 = ((iM27613 ^ i61) * 21417) ^ (-2072795742);
                        i39 = iM27613 ^ 448429074;
                        str13 = str30;
                        i62 = i120;
                        bArr4 = bArr8;
                        i66 = i118;
                        i74 = 0;
                        i71 = i116;
                        i73 = i117;
                        i70 = i119;
                        bArr5 = bArr9;
                        i76 = i115;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f7;
                        String str31 = str9;
                        i63 = i39;
                        arrayList6 = arrayList2;
                        jSONArray7 = jSONArray5;
                        str12 = str31;
                    } else {
                        int iM27614 = (i60 - C0619.m2761("۟ܳ")) * 67;
                        str13 = str30;
                        i62 = ((iM27614 ^ i61) * 15473) ^ 638205942;
                        bArr4 = bArr8;
                        arrayList6 = arrayList2;
                        i74 = 0;
                        jSONArray7 = jSONArray5;
                        i71 = i116;
                        str12 = str9;
                        i70 = i119;
                        i63 = iM27614 ^ (-220688766);
                        i66 = i118;
                        i76 = i115;
                        i73 = i117;
                        bArr5 = bArr9;
                        float f18 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f18;
                    }
                    break;
                case -1337447167:
                case 223540085:
                    i76 = i76;
                    str12 = str12;
                    str13 = str13;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    i66 = i66;
                    boolean z24 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z24;
                    abstractC14806 = (AbstractC14806) C4238.m13529(itM7968);
                    iM31613 = C0773.m3169("ۡۡ") ^ i60;
                    i44 = ((iM31613 ^ i61) * (-605)) ^ (-584952996);
                    i45 = 893247485;
                    int i819 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i819;
                    float f19 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f19;
                    break;
                case -1333063310:
                case -940140867:
                    i34 = i76;
                    str8 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str11;
                    f4 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z10 = z14;
                    i75 = i75;
                    i33 = length;
                    int i121 = iM88710;
                    str13 = str13;
                    i22 = i121;
                    if (i54 >= 0) {
                        i75 = i54;
                        int iM31621 = C0773.m3169("ᩳۨ") ^ i61;
                        jSONArray8 = jSONArray8;
                        iM13851 = iM13851;
                        i66 = i66;
                        i77 = i77;
                        i69 = i69;
                        i62 = ((iM31621 ^ i60) * (-5181)) ^ 1759977509;
                        i73 = i73;
                        c13779 = c13779;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray7;
                        bArr5 = bArr5;
                        bArr4 = bArr4;
                        str12 = str8;
                        i63 = iM31621 ^ 2107118178;
                        i71 = i71;
                        length = i33;
                        z14 = z10;
                        i70 = i70;
                        f7 = f4;
                        i76 = i34;
                        str11 = str5;
                        String str115 = str13;
                        iM88710 = i22;
                        str13 = str115;
                    } else {
                        iM2764 = C0619.m2761("۠ۨ") ^ i60;
                        i35 = ((iM2764 ^ i61) * (-8459)) ^ (-1364828037);
                        i36 = -1929408166;
                        int i8110 = iM2764 ^ i36;
                        iM13851 = iM13851;
                        i75 = i75;
                        i77 = i77;
                        i69 = i69;
                        i62 = i35;
                        jSONArray8 = jSONArray8;
                        i66 = i66;
                        c13779 = c13779;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray7;
                        i73 = i73;
                        bArr4 = bArr4;
                        str12 = str8;
                        i63 = i8110;
                        bArr5 = bArr5;
                        i71 = i71;
                        length = i33;
                        z14 = z10;
                        i70 = i70;
                        f7 = f4;
                        i76 = i34;
                        str11 = str5;
                        String str116 = str13;
                        iM88710 = i22;
                        str13 = str116;
                    }
                    break;
                case -1257958739:
                case 465496041:
                    i76 = i76;
                    str12 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z14 = z14;
                    i75 = i75;
                    length = length;
                    i68 = i68;
                    i69 = i69;
                    iM13851 = iM13851;
                    int i122 = iM88710;
                    str13 = str13;
                    iM88710 = i122;
                    if (z3) {
                        iM2762 = C0619.m2761("֫ܽ") ^ i60;
                        i10 = ((iM2762 ^ i61) * (-20107)) ^ (-799840798);
                        i27 = 849522710;
                    } else {
                        iM2762 = C0619.m2761("ۚ᩸") ^ i61;
                        i10 = ((iM2762 ^ i60) * 1653) ^ 1731934630;
                        i27 = 517476335;
                    }
                    i42 = iM2762 ^ i27;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str117 = str13;
                    iM88710 = iM88710;
                    str13 = str117;
                    break;
                case -1249238253:
                case 2014782495:
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z25 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z25;
                    if (!interfaceC9801.mo7902(25, C2419.m8164(c4347))) {
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i8111 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i8111;
                        float f110 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f110;
                    } else {
                        iM2767 = C0773.m3169("۟ۛ") ^ i61;
                        i46 = ((iM2767 ^ i60) * (-21185)) ^ 1863720179;
                        i47 = 450342416;
                        int i1110 = iM2767 ^ i47;
                        i76 = i76;
                        String str211 = str12;
                        i63 = i1110;
                        i62 = i46;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str211;
                        float f111 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f111;
                    }
                    break;
                case -1199853591:
                case 1972400694:
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z26 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z26;
                    if (!interfaceC9801.mo7902(22, C2419.m8164(c4347))) {
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i8112 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i8112;
                        float f112 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f112;
                    } else {
                        iM2767 = (i60 - C0619.m2761("ۤܰ")) * 53;
                        i46 = ((iM2767 ^ i61) * (-29329)) ^ (-1583239635);
                        i47 = 1248529696;
                        int i1111 = iM2767 ^ i47;
                        i76 = i76;
                        String str212 = str12;
                        i63 = i1111;
                        i62 = i46;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str212;
                        float f113 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f113;
                    }
                    break;
                case -1099235249:
                case -496657477:
                    iM88710 = iM88710;
                    i64 = 8266;
                    iM31611 = (C0619.m2761("֨ۘ") + i60) * (-63);
                    i10 = ((iM31611 ^ i61) * (-29289)) ^ (-2064418376);
                    i11 = 1045978472;
                    i42 = iM31611 ^ i11;
                    i67 = i67;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str118 = str13;
                    iM88710 = iM88710;
                    str13 = str118;
                    break;
                case -1056282297:
                case 1059411530:
                    i76 = i76;
                    str12 = str12;
                    if (C1826.m6317(it)) {
                        iM2768 = (C0619.m2761("ܰܰ") ^ i60) * (-93);
                        i50 = ((iM2768 ^ i61) * 19543) ^ (-1377135253);
                        i51 = -1582458082;
                    } else {
                        iM2768 = (C0773.m3169("ۜܺ") + i61) * 13;
                        i50 = ((iM2768 ^ i60) * (-22841)) ^ (-1994749145);
                        i51 = 1386004813;
                    }
                    int i1010 = iM2768 ^ i51;
                    str12 = str12;
                    i63 = i1010;
                    i62 = i50;
                    i76 = i76;
                    break;
                case -1020478955:
                case 2078593660:
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z27 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z27;
                    b = 0;
                    if (!interfaceC9801.mo7902(18, C3492.m11492(c4347))) {
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i8113 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i8113;
                        float f114 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f114;
                    } else {
                        iM2767 = (C0619.m2761("ۛ᩹") + i60) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i46 = ((iM2767 ^ i61) * 18115) ^ 2078255648;
                        i47 = -1144758238;
                        int i1112 = iM2767 ^ i47;
                        i76 = i76;
                        String str213 = str12;
                        i63 = i1112;
                        i62 = i46;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str213;
                        float f115 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f115;
                    }
                    break;
                case -999217991:
                case 1464931045:
                    int i123 = i76;
                    String str32 = str12;
                    int i124 = i69;
                    int i125 = i70;
                    byte[] bArr10 = bArr5;
                    int i126 = i71;
                    int i127 = i73;
                    byte[] bArr11 = bArr4;
                    JSONArray jSONArray10 = jSONArray7;
                    ArrayList arrayList7 = arrayList6;
                    int i128 = i66;
                    JSONArray jSONArray11 = jSONArray8;
                    C13778 c137710 = c13779;
                    int i129 = i75;
                    boolean z28 = z14;
                    i = length;
                    str = str11;
                    f = f7;
                    z6 = z28;
                    int i130 = iM88710;
                    str13 = str13;
                    i2 = i130;
                    if (iM13851 != i124) {
                        int iM27615 = (C0619.m2761("ܺ᩵") ^ i60) * (-3);
                        int i131 = ((iM27615 ^ i61) * (-26131)) ^ (-382164330);
                        int i132 = iM27615 ^ (-726933798);
                        i75 = i129;
                        c13779 = c137710;
                        jSONArray8 = jSONArray11;
                        bArr4 = bArr11;
                        i66 = i128;
                        i71 = i126;
                        i73 = i127;
                        i70 = i125;
                        bArr5 = bArr10;
                        i76 = i123;
                        i69 = i124;
                        i62 = i131;
                        arrayList6 = arrayList7;
                        jSONArray7 = jSONArray10;
                        str12 = str32;
                        i63 = i132;
                        float f20 = f;
                        str11 = str;
                        length = i;
                        z14 = z6;
                        f7 = f20;
                        String str214 = str13;
                        iM88710 = i2;
                        str13 = str214;
                    } else {
                        int iM31622 = C0773.m3169("ۤ᩷") ^ i61;
                        i75 = i129;
                        c13779 = c137710;
                        jSONArray8 = jSONArray11;
                        bArr4 = bArr11;
                        i66 = i128;
                        i71 = i126;
                        i73 = i127;
                        i70 = i125;
                        bArr5 = bArr10;
                        i76 = i123;
                        i69 = i124;
                        i62 = ((iM31622 ^ i60) * 23555) ^ 794691217;
                        iM13851 = iM13851;
                        str11 = str;
                        length = i;
                        z14 = z6;
                        f7 = f;
                        i63 = iM31622 ^ (-2001579307);
                        arrayList6 = arrayList7;
                        jSONArray7 = jSONArray10;
                        str12 = str32;
                        iM88710 = i2;
                        str13 = str13;
                    }
                    break;
                case -997774030:
                case 1605300082:
                    i76 = i76;
                    str12 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray = jSONArray7;
                    str2 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray2 = jSONArray8;
                    z7 = z14;
                    i3 = i75;
                    length = length;
                    i68 = i68;
                    int i133 = iM88710;
                    str13 = str13;
                    i2 = i133;
                    if (C1826.m6317(itM4944)) {
                        iM2761 = C0773.m3169("᩷۫") ^ i60;
                        i4 = ((iM2761 ^ i61) * (-12975)) ^ (-1957405700);
                        i5 = -1817471150;
                    } else {
                        iM2761 = C0773.m3169("᩸᩵") ^ i61;
                        i4 = ((iM2761 ^ i60) * 5419) ^ 1449808566;
                        i5 = 1611970515;
                    }
                    i7 = iM2761 ^ i5;
                    i68 = i68;
                    i75 = i3;
                    length = length;
                    z14 = z7;
                    i77 = i77;
                    jSONArray8 = jSONArray2;
                    i66 = i66;
                    c13779 = c13779;
                    f7 = f7;
                    str11 = str2;
                    i73 = i73;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    int i912 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i912;
                    String str215 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str215;
                    String str216 = str13;
                    iM88710 = i2;
                    str13 = str216;
                    break;
                case -935526985:
                case 1911302127:
                    jSONArray7 = jSONArray7;
                    i69 = i69;
                    iM88710 = iM88710;
                    jSONArray7.add(1);
                    C20932.m47860(c6178, 1749442555);
                    c6178.m17797();
                    itM53423 = C23916.m53423(C22961.m51820());
                    i55 = 0;
                    iM2762 = (C0773.m3169("ۚ֡") + i60) * (-95);
                    i10 = ((iM2762 ^ i61) * (-11413)) ^ (-981904908);
                    i27 = -482789274;
                    i42 = iM2762 ^ i27;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str119 = str13;
                    iM88710 = iM88710;
                    str13 = str119;
                    break;
                case -926482113:
                case 424996191:
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z29 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z29;
                    if (!interfaceC9801.mo7902(16, C3492.m11492(c4347))) {
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i8114 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i8114;
                        float f116 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f116;
                    } else {
                        iM2767 = C0619.m2761("֡᩶") ^ i61;
                        i46 = ((iM2767 ^ i60) * 4567) ^ 1359454909;
                        i47 = -2075634362;
                        int i1113 = iM2767 ^ i47;
                        i76 = i76;
                        String str217 = str12;
                        i63 = i1113;
                        i62 = i46;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str217;
                        float f117 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f117;
                    }
                    break;
                case -922250272:
                case 891987477:
                    itM4943 = C1343.m4942(c5061.m15323());
                    iM2769 = C0773.m3169("ۚ֫") ^ i60;
                    i52 = ((iM2769 ^ i61) * 8943) ^ 1208748048;
                    i53 = -1242901472;
                    i63 = iM2769 ^ i53;
                    i62 = i52;
                    break;
                case -904749471:
                case -568633065:
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z30 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z30;
                    if (!interfaceC9801.mo7902(23, C3492.m11492(c4347))) {
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i8115 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i8115;
                        float f118 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f118;
                    } else {
                        iM2767 = C0773.m3169("ܿ᩸") ^ i61;
                        i46 = ((iM2767 ^ i60) * 24865) ^ 545622978;
                        i47 = 1676111036;
                        int i1114 = iM2767 ^ i47;
                        i76 = i76;
                        String str218 = str12;
                        i63 = i1114;
                        i62 = i46;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str218;
                        float f119 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f119;
                    }
                    break;
                case -893653368:
                case 1183275473:
                    i76 = i76;
                    str12 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z14 = z14;
                    i75 = i75;
                    length = length;
                    i68 = i68;
                    i69 = i69;
                    iM13851 = iM13851;
                    i67 = i67;
                    int i134 = iM88710;
                    str13 = str13;
                    iM88710 = i134;
                    if (z2) {
                        iM31611 = C0773.m3169("᩶ۗ") ^ i60;
                        i10 = ((iM31611 ^ i61) * (-23671)) ^ (-765375456);
                        i11 = 1482673926;
                    } else {
                        iM31611 = (C0773.m3169("᩸֡") ^ i61) * 109;
                        i10 = ((iM31611 ^ i60) * (-24719)) ^ 750696564;
                        i11 = 1036841741;
                    }
                    i42 = iM31611 ^ i11;
                    i67 = i67;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str1110 = str13;
                    iM88710 = iM88710;
                    str13 = str1110;
                    break;
                case -810478949:
                case 1429771751:
                    c6178.mo17812(i77);
                    z13 = z14;
                    c6178.m17789(C4238.m13535(interfaceC9801, C2419.m8164(c4347), z13));
                    z12 = z13;
                    jSONArray6 = jSONArray7;
                    str11 = str11;
                    arrayList6 = arrayList6;
                    f7 = f7;
                    iM31613 = C0619.m2761("ܽܳ") ^ i61;
                    i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                    i45 = -988517401;
                    int i8116 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i8116;
                    float f1110 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f1110;
                    break;
                case -805783306:
                case 969834751:
                    i76 = i76;
                    str12 = str12;
                    i24 = i69;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    i25 = i67;
                    jSONArray8 = jSONArray8;
                    z9 = z14;
                    i75 = i75;
                    length = length;
                    int i135 = iM88710;
                    str13 = str13;
                    i22 = i135;
                    jSONArray7.add(i25);
                    C0487.m2363(c6178, 1749442554);
                    c6178.m17797();
                    C14787 c14787M2739 = m2739();
                    SharedPreferences sharedPreferences2 = ApplicationC17729.f58262;
                    C0269.m1781(sharedPreferences2, C1080.m4056(f2436, 162, 3, i64));
                    iM7752 = (C2288.m7752(c14787M2739) + 7) / 8;
                    C20932.m47860(c6178, 1749442553);
                    c6178.m17797();
                    i26 = 0;
                    itM13647 = C4282.m13647(c14787M2739);
                    sharedPreferences = sharedPreferences2;
                    bArr5 = new byte[iM7752];
                    i65 = 7;
                    int iM316110 = (C0773.m3169("ۢᩳ") ^ i61) * 67;
                    i67 = i25;
                    iM13851 = iM13851;
                    i75 = i75;
                    i76 = i76;
                    jSONArray8 = jSONArray8;
                    i69 = i24;
                    i66 = i66;
                    i68 = i26;
                    i73 = i73;
                    i77 = i77;
                    bArr5 = bArr5;
                    c13779 = c13779;
                    bArr4 = bArr4;
                    i71 = i71;
                    i70 = iM7752;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str12;
                    i63 = iM316110 ^ (-212356462);
                    i62 = ((iM316110 ^ i60) * (-27971)) ^ (-1545660557);
                    length = length;
                    z14 = z9;
                    f7 = f7;
                    str11 = str5;
                    String str1111 = str13;
                    iM88710 = i22;
                    str13 = str1111;
                    break;
                case -744295946:
                case 983378108:
                    i76 = i76;
                    str12 = str12;
                    c6178.m17780();
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray = jSONArray7;
                    str2 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray2 = jSONArray8;
                    z7 = z14;
                    i3 = i75;
                    length = length;
                    i68 = i68;
                    int i136 = iM88710;
                    str13 = str13;
                    i2 = i136;
                    iM2761 = C0773.m3169("ܽۚ") ^ i60;
                    i4 = ((iM2761 ^ i61) * 12167) ^ 1599302400;
                    i5 = -818635147;
                    i7 = iM2761 ^ i5;
                    i68 = i68;
                    i75 = i3;
                    length = length;
                    z14 = z7;
                    i77 = i77;
                    jSONArray8 = jSONArray2;
                    i66 = i66;
                    c13779 = c13779;
                    f7 = f7;
                    str11 = str2;
                    i73 = i73;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    int i913 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i913;
                    String str219 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str219;
                    String str2110 = str13;
                    iM88710 = i2;
                    str13 = str2110;
                    break;
                case -723262767:
                case 646736493:
                    i76 = i76;
                    str12 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    arrayList6 = arrayList6;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    boolean z31 = z14;
                    length = length;
                    String str33 = str11;
                    f7 = f7;
                    z14 = z31;
                    int i137 = iM88710;
                    str13 = str13;
                    iM88710 = i137;
                    c6178.m17786((CharSequence) C2023.m6952(jSONArray8));
                    c6178.m17780();
                    str11 = str33;
                    i75 = i75;
                    i68 = i68;
                    i69 = i69;
                    c13779 = c13779;
                    iM13851 = iM13851;
                    i77 = i77;
                    iM2762 = C0773.m3169("᩻ܰ") ^ i61;
                    i10 = ((iM2762 ^ i60) * (-22451)) ^ (-2095602344);
                    i27 = 757497568;
                    i42 = iM2762 ^ i27;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str1112 = str13;
                    iM88710 = iM88710;
                    str13 = str1112;
                    break;
                case -699064717:
                case 1157829240:
                    str7 = str11;
                    i30 = i69;
                    i77 = i56;
                    iM8879 = i73;
                    bArr3 = bArr4;
                    i57 = 1;
                    f3 = 0.0f;
                    iM88710 = iM88710;
                    int iM27616 = C0619.m2761("ܳۛ") ^ i60;
                    int i820 = iM8879;
                    i62 = ((iM27616 ^ i61) * 18599) ^ (-822992937);
                    i75 = i75;
                    c13779 = c13779;
                    str11 = str7;
                    bArr4 = bArr3;
                    jSONArray8 = jSONArray8;
                    i66 = i66;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i73 = i820;
                    str12 = str12;
                    i71 = i71;
                    i63 = iM27616 ^ 1424474794;
                    i70 = i70;
                    bArr5 = bArr5;
                    i76 = i76;
                    int i821 = i30;
                    i68 = i68;
                    length = length;
                    z14 = z14;
                    f7 = f3;
                    iM13851 = iM13851;
                    i69 = i821;
                    String str1113 = str13;
                    iM88710 = iM88710;
                    str13 = str1113;
                    break;
                case -613320854:
                case 70336963:
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z32 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z32;
                    if (!interfaceC9801.mo7902(26, C2419.m8164(c4347))) {
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i8117 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i8117;
                        float f1111 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f1111;
                    } else {
                        iM2767 = (i60 - C0619.m2761("۫ܿ")) * (-43);
                        i46 = ((iM2767 ^ i61) * 16967) ^ (-904447333);
                        i47 = -897148171;
                        int i1115 = iM2767 ^ i47;
                        i76 = i76;
                        String str2111 = str12;
                        i63 = i1115;
                        i62 = i46;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str2111;
                        float f1112 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f1112;
                    }
                    break;
                case -579472484:
                case 1665995760:
                    iM88710 = iM88710;
                    i64 = 448;
                    iM31611 = (C0619.m2761("֨ۘ") + i60) * (-63);
                    i10 = ((iM31611 ^ i61) * (-29289)) ^ (-2064418376);
                    i11 = 1045978472;
                    i42 = iM31611 ^ i11;
                    i67 = i67;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str1114 = str13;
                    iM88710 = iM88710;
                    str13 = str1114;
                    break;
                case -577934153:
                case 1356307120:
                    ArrayList arrayList8 = arrayList5;
                    jSONArray6 = jSONArray7;
                    jSONArray6.add(5);
                    C20932.m47860(c6178, 1749442558);
                    c6178.m17797();
                    c6178.mo17812(C2702.m8879(arrayList8));
                    Iterator itM13648 = C4282.m13647(arrayList8);
                    z12 = z14;
                    C2310.m7811(itM13648, C3734.m12149(f2436, 230, 13, i64));
                    it = itM13648;
                    iM2767 = C0773.m3169("᩺ۡ") ^ i61;
                    i46 = ((iM2767 ^ i60) * (-16067)) ^ (-884541493);
                    i47 = -1087245340;
                    int i1116 = iM2767 ^ i47;
                    i76 = i76;
                    String str2112 = str12;
                    i63 = i1116;
                    i62 = i46;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str2112;
                    float f1113 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f1113;
                    break;
                case -567138818:
                case 526308497:
                    i76 = i76;
                    str12 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray = jSONArray7;
                    str2 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray2 = jSONArray8;
                    z7 = z14;
                    i3 = i75;
                    length = length;
                    i68 = i68;
                    int i138 = iM88710;
                    str13 = str13;
                    i2 = i138;
                    i54 = -1;
                    iM2761 = C0773.m3169("ܰۘ") ^ i61;
                    i4 = ((iM2761 ^ i60) * 21597) ^ 1537280002;
                    i5 = 815557331;
                    i7 = iM2761 ^ i5;
                    i68 = i68;
                    i75 = i3;
                    length = length;
                    z14 = z7;
                    i77 = i77;
                    jSONArray8 = jSONArray2;
                    i66 = i66;
                    c13779 = c13779;
                    f7 = f7;
                    str11 = str2;
                    i73 = i73;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    int i914 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i914;
                    String str2113 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str2113;
                    String str2114 = str13;
                    iM88710 = i2;
                    str13 = str2114;
                    break;
                case -536844505:
                case -283147683:
                    int i139 = i76;
                    str9 = str12;
                    int i140 = i69;
                    int i141 = i70;
                    byte[] bArr12 = bArr5;
                    int i142 = i73;
                    byte[] bArr13 = bArr4;
                    int i143 = iM88710;
                    jSONArray5 = jSONArray7;
                    String str34 = str11;
                    float f21 = f7;
                    C13778 c137711 = c13779;
                    arrayList2 = arrayList6;
                    int i144 = iM13851;
                    int i145 = i66;
                    JSONArray jSONArray12 = jSONArray8;
                    boolean z33 = z14;
                    int i146 = i75;
                    int i147 = length;
                    c6178.mo17812(65535);
                    c6178.m17780();
                    c6178.m17780();
                    C0487.m2363(c6178, 1749442560);
                    c6178.m17797();
                    c6178.m17809(1);
                    int iM7753 = C2288.m7752(m2739());
                    int i148 = (iM7753 + 7) / 8;
                    int i149 = i77;
                    String strM11252 = C3448.m11252(f2436, Primes.SMALL_FACTOR_LIMIT, 13, i64);
                    if (i141 == i148) {
                        iM2765 = (C0619.m2761("ܳܺ") + i60) * (-81);
                        i37 = ((iM2765 ^ i61) * 30333) ^ 290030660;
                        i38 = -512317570;
                    } else {
                        iM2765 = C0619.m2761("ۗ᩵") ^ i61;
                        i37 = ((iM2765 ^ i60) * 3105) ^ 222430893;
                        i38 = -1004835406;
                    }
                    i39 = iM2765 ^ i38;
                    i75 = i146;
                    iM88710 = i143;
                    i77 = i149;
                    str13 = strM11252;
                    jSONArray8 = jSONArray12;
                    i66 = i145;
                    c13779 = c137711;
                    length = i147;
                    z14 = z33;
                    i73 = i142;
                    bArr4 = bArr13;
                    f7 = f21;
                    str11 = str34;
                    bArr5 = bArr12;
                    i71 = iM7753;
                    i70 = i141;
                    i76 = i139;
                    i69 = i140;
                    i62 = i37;
                    iM13851 = i144;
                    String str35 = str9;
                    i63 = i39;
                    arrayList6 = arrayList2;
                    jSONArray7 = jSONArray5;
                    str12 = str35;
                    break;
                case -404275406:
                case 1403702962:
                    z13 = z14;
                    c6178.mo17812(i77);
                    c6178.m17794(interfaceC9801.getInt(C3492.m11492(c4347), 0));
                    z12 = z13;
                    jSONArray6 = jSONArray7;
                    str11 = str11;
                    arrayList6 = arrayList6;
                    f7 = f7;
                    iM31613 = C0619.m2761("ܽܳ") ^ i61;
                    i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                    i45 = -988517401;
                    int i8118 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i8118;
                    float f1114 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f1114;
                    break;
                case -388429119:
                case 988458331:
                    length = length;
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    str11 = str11;
                    f7 = f7;
                    arrayList6 = arrayList6;
                    if (!interfaceC9801.mo7902(17, C2419.m8164(c4347))) {
                        z12 = false;
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i8119 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i8119;
                        float f1115 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f1115;
                    } else {
                        int iM31623 = (C0773.m3169("ۛ۠") ^ i61) * (-125);
                        i62 = ((iM31623 ^ i60) * 18485) ^ (-1551942248);
                        f7 = f7;
                        i76 = i76;
                        str11 = str11;
                        length = length;
                        z14 = false;
                        str10 = str12;
                        i63 = iM31623 ^ 563842979;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str10;
                    }
                    break;
                case -318351664:
                case 886815064:
                    i76 = i76;
                    str12 = str12;
                    z14 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    c5061 = (C5061) C4238.m13529(itM47859);
                    if (!c5061.m15314()) {
                        iM31614 = (i61 - C0773.m3169("ۖ᩶")) * 35;
                        i48 = ((iM31614 ^ i60) * (-461)) ^ (-1348316497);
                        i49 = -883263026;
                        int i915 = iM31614 ^ i49;
                        f7 = f7;
                        str12 = str12;
                        i63 = i915;
                        str11 = str11;
                        i62 = i48;
                        length = length;
                        i76 = i76;
                        z14 = z14;
                    } else {
                        z11 = z14;
                        arrayList3 = arrayList6;
                        i43 = i75;
                        int iM27617 = C0619.m2761("᩺ۧ") ^ i61;
                        str13 = str13;
                        i62 = ((iM27617 ^ i60) * 17603) ^ (-1861459307);
                        i75 = i43;
                        jSONArray7 = jSONArray7;
                        arrayList6 = arrayList3;
                        i66 = i66;
                        str12 = str12;
                        i73 = i73;
                        i63 = iM27617 ^ 1040983112;
                        bArr5 = bArr5;
                        bArr4 = bArr4;
                        i71 = i71;
                        i70 = i70;
                        i76 = i76;
                        float f22 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z11;
                        f7 = f22;
                        String str1115 = str13;
                        iM88710 = iM88710;
                        str13 = str1115;
                    }
                    break;
                case -302627286:
                case 1491970018:
                    jSONArray7 = jSONArray7;
                    iM88710 = iM88710;
                    i55++;
                    i69 = i69;
                    iM2762 = (C0773.m3169("ۚ֡") + i60) * (-95);
                    i10 = ((iM2762 ^ i61) * (-11413)) ^ (-981904908);
                    i27 = -482789274;
                    i42 = iM2762 ^ i27;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str1116 = str13;
                    iM88710 = iM88710;
                    str13 = str1116;
                    break;
                case -262958673:
                case 1141644741:
                    throw new IllegalStateException(str13);
                case -159559188:
                case 798557818:
                    c6178.m17781(sharedPreferences.getFloat(C2419.m8164(c4348), f6));
                    str5 = str11;
                    z9 = z14;
                    int i710 = iM88710;
                    str13 = str13;
                    i22 = i710;
                    i24 = i69;
                    iM7752 = i70;
                    i25 = i67;
                    i26 = i78;
                    int iM316111 = (C0773.m3169("ۢᩳ") ^ i61) * 67;
                    i67 = i25;
                    iM13851 = iM13851;
                    i75 = i75;
                    i76 = i76;
                    jSONArray8 = jSONArray8;
                    i69 = i24;
                    i66 = i66;
                    i68 = i26;
                    i73 = i73;
                    i77 = i77;
                    bArr5 = bArr5;
                    c13779 = c13779;
                    bArr4 = bArr4;
                    i71 = i71;
                    i70 = iM7752;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str12;
                    i63 = iM316111 ^ (-212356462);
                    i62 = ((iM316111 ^ i60) * (-27971)) ^ (-1545660557);
                    length = length;
                    z14 = z9;
                    f7 = f7;
                    str11 = str5;
                    String str1117 = str13;
                    iM88710 = i22;
                    str13 = str1117;
                    break;
                case -109423578:
                case 1397038716:
                    i76 = i76;
                    str12 = str12;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z34 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z34;
                    if (!interfaceC9801.mo7902(21, C3492.m11492(c4347))) {
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i81110 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i81110;
                        float f1116 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f1116;
                    } else {
                        iM2767 = (C0619.m2761("۠֨") ^ i60) * (-47);
                        i46 = ((iM2767 ^ i61) * 12599) ^ 1062654055;
                        i47 = 764673130;
                        int i1117 = iM2767 ^ i47;
                        i76 = i76;
                        String str2115 = str12;
                        i63 = i1117;
                        i62 = i46;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str2115;
                        float f1117 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f1117;
                    }
                    break;
                case -75397598:
                case 557211098:
                    c6178.m17780();
                    i76 = i76;
                    str12 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    i77 = i77;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    z14 = z14;
                    i75 = i75;
                    length = length;
                    i68 = i68;
                    i69 = i69;
                    iM13851 = iM13851;
                    i67 = i67;
                    int i150 = iM88710;
                    str13 = str13;
                    iM88710 = i150;
                    iM31611 = (C0773.m3169("᩸֡") ^ i61) * 109;
                    i10 = ((iM31611 ^ i60) * (-24719)) ^ 750696564;
                    i11 = 1036841741;
                    i42 = iM31611 ^ i11;
                    i67 = i67;
                    iM13851 = iM13851;
                    i75 = i75;
                    i77 = i77;
                    jSONArray8 = jSONArray8;
                    i69 = i69;
                    i66 = i66;
                    c13779 = c13779;
                    i68 = i68;
                    i73 = i73;
                    bArr4 = bArr4;
                    length = length;
                    z14 = z14;
                    bArr5 = bArr5;
                    i71 = i71;
                    f7 = f7;
                    str11 = str11;
                    i70 = i70;
                    i76 = i76;
                    str6 = str12;
                    i63 = i42;
                    i62 = i10;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str1118 = str13;
                    iM88710 = iM88710;
                    str13 = str1118;
                    break;
                case -47732857:
                case 1770009156:
                    c6178.m17809(C2288.m7752(arrayList6));
                    itM4942 = C1343.m4942(arrayList6);
                    iM31614 = (C0619.m2761("۟᩻") ^ i60) * 75;
                    i48 = ((iM31614 ^ i61) * 19371) ^ (-1799323973);
                    i49 = 2104518127;
                    int i916 = iM31614 ^ i49;
                    f7 = f7;
                    str12 = str12;
                    i63 = i916;
                    str11 = str11;
                    i62 = i48;
                    length = length;
                    i76 = i76;
                    z14 = z14;
                    break;
                case -41109826:
                case 1673745023:
                    i76 = i76;
                    str12 = str12;
                    i43 = i75;
                    boolean z35 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z11 = z35;
                    c6178.m17809(i43);
                    arrayList3 = new ArrayList();
                    itM47859 = C20932.m47859(C22961.m51820());
                    int iM27618 = C0619.m2761("᩺ۧ") ^ i61;
                    str13 = str13;
                    i62 = ((iM27618 ^ i60) * 17603) ^ (-1861459307);
                    i75 = i43;
                    jSONArray7 = jSONArray7;
                    arrayList6 = arrayList3;
                    i66 = i66;
                    str12 = str12;
                    i73 = i73;
                    i63 = iM27618 ^ 1040983112;
                    bArr5 = bArr5;
                    bArr4 = bArr4;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    float f23 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z11;
                    f7 = f23;
                    String str1119 = str13;
                    iM88710 = iM88710;
                    str13 = str1119;
                    break;
                case -10591390:
                case 1553546076:
                    RunnableC0334.m2054(arrayList6, new C24485((C9622) C0950.m3796(itM4943), str12));
                    iM2769 = C0773.m3169("ۚ֫") ^ i60;
                    i52 = ((iM2769 ^ i61) * 8943) ^ 1208748048;
                    i53 = -1242901472;
                    i63 = iM2769 ^ i53;
                    i62 = i52;
                    break;
                case 6969053:
                case 355495403:
                    throw new C4866(C3033.m9850(c13779, C0619.m2761(C1783.m6233(f2436, BERTags.FLAGS, 3, i64)) ^ 2123429418));
                case 17421964:
                case 27057561:
                    f5 = f7;
                    c6178.mo17812(i77);
                    AbstractC0116.m1241(c6178, interfaceC9801.mo7901(b, C2419.m8164(c4347)));
                    str13 = str13;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    z12 = z14;
                    length = length;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    str11 = str11;
                    f7 = f5;
                    bArr4 = bArr4;
                    iM31613 = C0619.m2761("ܽܳ") ^ i61;
                    i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                    i45 = -988517401;
                    int i81111 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i81111;
                    float f1118 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f1118;
                    break;
                case 63481238:
                case 2128686007:
                    int i151 = i76;
                    String str36 = str12;
                    int i152 = i69;
                    int i153 = i70;
                    byte[] bArr14 = bArr5;
                    int i154 = i71;
                    int i155 = i73;
                    byte[] bArr15 = bArr4;
                    JSONArray jSONArray13 = jSONArray7;
                    str5 = str11;
                    f7 = f7;
                    C13778 c137712 = c13779;
                    ArrayList arrayList9 = arrayList6;
                    int i156 = iM13851;
                    int i157 = i66;
                    JSONArray jSONArray14 = jSONArray8;
                    boolean z36 = z14;
                    int i158 = i75;
                    int i159 = length;
                    int i160 = iM88710;
                    str13 = str13;
                    i22 = i160;
                    i56 = i77 + 1;
                    c4347 = (C4347) C0950.m3796(itM4944);
                    if (interfaceC9801.contains(C2419.m8164(c4347))) {
                        iM2766 = (i60 - C0619.m2761("ܽ᩶")) * 65;
                        i40 = ((iM2766 ^ i61) * (-22309)) ^ 984634568;
                        i41 = -480313993;
                    } else {
                        iM2766 = (C0773.m3169("ۙ֡") ^ i61) * (-7);
                        i40 = ((iM2766 ^ i60) * (-3127)) ^ 525411350;
                        i41 = -46969052;
                    }
                    int i161 = iM2766 ^ i41;
                    iM13851 = i156;
                    i75 = i158;
                    c13779 = c137712;
                    i69 = i152;
                    i62 = i40;
                    jSONArray8 = jSONArray14;
                    bArr4 = bArr15;
                    i66 = i157;
                    arrayList6 = arrayList9;
                    jSONArray7 = jSONArray13;
                    i71 = i154;
                    i73 = i155;
                    str12 = str36;
                    i63 = i161;
                    i70 = i153;
                    bArr5 = bArr14;
                    length = i159;
                    z14 = z36;
                    i76 = i151;
                    f7 = f7;
                    str11 = str5;
                    String str11110 = str13;
                    iM88710 = i22;
                    str13 = str11110;
                    break;
                case 125474202:
                case 1328438624:
                    throw new RuntimeException(C2354.m7981(c4347.m13851(), strM13650));
                case 145046735:
                case 1029764288:
                    i76 = i76;
                    str12 = str12;
                    String str37 = str13;
                    byte[] bArr16 = bArr4;
                    i22 = iM88710;
                    jSONArray7 = jSONArray7;
                    arrayList6 = arrayList6;
                    int i162 = i73;
                    i66 = i66;
                    boolean z37 = z14;
                    length = length;
                    String str38 = str11;
                    f7 = f7;
                    z9 = z37;
                    c6178.m17794(sharedPreferences.getInt(C2419.m8164(c4348), 0));
                    str13 = str37;
                    str5 = str38;
                    i69 = i69;
                    jSONArray8 = jSONArray8;
                    bArr5 = bArr5;
                    c13779 = c13779;
                    i75 = i75;
                    i73 = i162;
                    iM13851 = iM13851;
                    i77 = i77;
                    int i163 = i71;
                    bArr4 = bArr16;
                    i70 = i70;
                    i71 = i163;
                    i24 = i69;
                    iM7752 = i70;
                    i25 = i67;
                    i26 = i78;
                    int iM316112 = (C0773.m3169("ۢᩳ") ^ i61) * 67;
                    i67 = i25;
                    iM13851 = iM13851;
                    i75 = i75;
                    i76 = i76;
                    jSONArray8 = jSONArray8;
                    i69 = i24;
                    i66 = i66;
                    i68 = i26;
                    i73 = i73;
                    i77 = i77;
                    bArr5 = bArr5;
                    c13779 = c13779;
                    bArr4 = bArr4;
                    i71 = i71;
                    i70 = iM7752;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str12;
                    i63 = iM316112 ^ (-212356462);
                    i62 = ((iM316112 ^ i60) * (-27971)) ^ (-1545660557);
                    length = length;
                    z14 = z9;
                    f7 = f7;
                    str11 = str5;
                    String str11111 = str13;
                    iM88710 = i22;
                    str13 = str11111;
                    break;
                case 176503033:
                case 1032318209:
                    int[] iArrMo7904 = interfaceC9801.mo7904(C3492.m11492(c4347));
                    C1146.m4233(iArrMo7904);
                    c6178.mo17812(i77);
                    c6178.m17809(iArrMo7904.length);
                    length = iArrMo7904.length;
                    i66 = 0;
                    iArr = iArrMo7904;
                    int iM27619 = C0619.m2761("ۙᩴ") ^ i60;
                    f7 = f7;
                    b = b;
                    str12 = str12;
                    i76 = i76;
                    i63 = iM27619 ^ (-2139620717);
                    i62 = ((iM27619 ^ i61) * (-12059)) ^ 2029061125;
                    length = length;
                    z14 = z14;
                    break;
                case 181908427:
                case 1212186069:
                    i76 = i76;
                    str12 = str12;
                    String strM15317 = c5061.m15317();
                    if (strM15317 != null) {
                        str12 = strM15317;
                        int iM31624 = (i61 - C0773.m3169("ۘۧ")) * 61;
                        i50 = ((iM31624 ^ i60) * 5279) ^ (-262399797);
                        i63 = iM31624 ^ 1282139762;
                        i62 = i50;
                        i76 = i76;
                    } else {
                        iM2768 = C0619.m2761("᩶ۖ") ^ i60;
                        i50 = ((iM2768 ^ i61) * (-5733)) ^ (-1489806424);
                        i51 = -426357750;
                        int i1011 = iM2768 ^ i51;
                        str12 = str12;
                        i63 = i1011;
                        i62 = i50;
                        i76 = i76;
                    }
                    break;
                case 269950392:
                case 1020191447:
                    i76 = i76;
                    str12 = str12;
                    if (i66 >= length) {
                        str13 = str13;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        jSONArray6 = jSONArray7;
                        arrayList6 = arrayList6;
                        i73 = i73;
                        boolean z38 = z14;
                        length = length;
                        str11 = str11;
                        f7 = f7;
                        z12 = z38;
                        iM31613 = C0619.m2761("ܽܳ") ^ i61;
                        i44 = ((iM31613 ^ i60) * (-10733)) ^ 858576662;
                        i45 = -988517401;
                        int i81112 = iM31613 ^ i45;
                        bArr4 = bArr4;
                        iM88710 = iM88710;
                        i76 = i76;
                        str13 = str13;
                        i62 = i44;
                        i66 = i66;
                        i73 = i73;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray6;
                        str12 = str12;
                        i63 = i81112;
                        float f1119 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z12;
                        f7 = f1119;
                    } else {
                        iM2768 = C0773.m3169("ۡܿ") ^ i61;
                        i50 = ((iM2768 ^ i60) * (-15937)) ^ 1856151062;
                        i51 = 75778800;
                        int i1012 = iM2768 ^ i51;
                        str12 = str12;
                        i63 = i1012;
                        i62 = i50;
                        i76 = i76;
                    }
                    break;
                case 395259849:
                case 510650529:
                    throw new IllegalStateException(str13);
                case 399828909:
                case 976245142:
                    i13 = i76;
                    str3 = str12;
                    int i164 = iM88710;
                    JSONArray jSONArray15 = jSONArray7;
                    arrayList = arrayList6;
                    boolean z39 = z14;
                    i20 = length;
                    String str39 = str11;
                    f2 = f7;
                    z8 = z39;
                    c6178.m17809(i164);
                    int i165 = i73;
                    byte[] bArr17 = bArr4;
                    c6178.write(bArr17, i74, i165);
                    c6178.m17780();
                    str4 = str39;
                    i18 = i66;
                    i21 = i68;
                    jSONArray3 = jSONArray8;
                    bArr = bArr5;
                    str13 = str13;
                    c13778 = c13779;
                    i19 = i75;
                    i22 = i164;
                    i16 = i165;
                    i17 = i77;
                    jSONArray4 = jSONArray15;
                    i23 = i69;
                    i12 = iM13851;
                    int i166 = i71;
                    bArr2 = bArr17;
                    i14 = i70;
                    i15 = i166;
                    int iM31625 = (C0773.m3169("ܺ᩷") + i61) * (-43);
                    int i167 = ((iM31625 ^ i60) * 25935) ^ 1393881131;
                    i68 = i21;
                    i75 = i19;
                    length = i20;
                    z14 = z8;
                    str12 = str3;
                    i63 = iM31625 ^ (-1318744074);
                    jSONArray8 = jSONArray3;
                    iM13851 = i12;
                    i66 = i18;
                    f7 = f2;
                    str11 = str4;
                    i69 = i23;
                    i73 = i16;
                    arrayList6 = arrayList;
                    jSONArray7 = jSONArray4;
                    i62 = i167;
                    bArr5 = bArr;
                    i77 = i17;
                    c13779 = c13778;
                    bArr4 = bArr2;
                    i71 = i15;
                    i70 = i14;
                    i76 = i13;
                    String str11112 = str13;
                    iM88710 = i22;
                    str13 = str11112;
                    break;
                case 437270249:
                case 1547896406:
                    i76 = i76;
                    str12 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray = jSONArray7;
                    str2 = str11;
                    f7 = f7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i77 = i77;
                    i66 = i66;
                    jSONArray2 = jSONArray8;
                    z7 = z14;
                    i3 = i75;
                    length = length;
                    i68 = i68;
                    int i168 = iM88710;
                    str13 = str13;
                    i2 = i168;
                    if (((C5061) C0950.m3796(itM53423)).m15314()) {
                        i54 = i55;
                        iM2761 = C0773.m3169("ܰۘ") ^ i61;
                        i4 = ((iM2761 ^ i60) * 21597) ^ 1537280002;
                        i5 = 815557331;
                    } else {
                        iM2761 = (C0773.m3169("᩸ܶ") + i60) * (-45);
                        i4 = ((iM2761 ^ i61) * 17307) ^ (-1730386087);
                        i5 = 1937413984;
                    }
                    i7 = iM2761 ^ i5;
                    i68 = i68;
                    i75 = i3;
                    length = length;
                    z14 = z7;
                    i77 = i77;
                    jSONArray8 = jSONArray2;
                    i66 = i66;
                    c13779 = c13779;
                    f7 = f7;
                    str11 = str2;
                    i73 = i73;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    int i917 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i917;
                    String str2116 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str2116;
                    String str2117 = str13;
                    iM88710 = i2;
                    str13 = str2117;
                    break;
                case 480199874:
                case 1478175612:
                    i34 = i76;
                    str8 = str12;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    String str40 = str13;
                    i73 = i73;
                    bArr4 = bArr4;
                    i22 = iM88710;
                    jSONArray7 = jSONArray7;
                    arrayList6 = arrayList6;
                    i66 = i66;
                    boolean z40 = z14;
                    i33 = length;
                    String str41 = str11;
                    f4 = f7;
                    z10 = z40;
                    str13 = str40;
                    str5 = str41;
                    i69 = i69;
                    jSONArray8 = jSONArray8;
                    c13779 = c13779;
                    i75 = 0;
                    iM13851 = iM13851;
                    i77 = i77;
                    int iM31626 = C0773.m3169("ᩳۨ") ^ i61;
                    jSONArray8 = jSONArray8;
                    iM13851 = iM13851;
                    i66 = i66;
                    i77 = i77;
                    i69 = i69;
                    i62 = ((iM31626 ^ i60) * (-5181)) ^ 1759977509;
                    i73 = i73;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    bArr5 = bArr5;
                    bArr4 = bArr4;
                    str12 = str8;
                    i63 = iM31626 ^ 2107118178;
                    i71 = i71;
                    length = i33;
                    z14 = z10;
                    i70 = i70;
                    f7 = f4;
                    i76 = i34;
                    str11 = str5;
                    String str11113 = str13;
                    iM88710 = i22;
                    str13 = str11113;
                    break;
                case 629802913:
                case 1512799817:
                    if (!C3998.m12923(itM4943)) {
                        i76 = i76;
                        str12 = str12;
                        arrayList3 = arrayList6;
                        i43 = i75;
                        boolean z41 = z14;
                        length = length;
                        str11 = str11;
                        f7 = f7;
                        z11 = z41;
                        int iM276110 = C0619.m2761("᩺ۧ") ^ i61;
                        str13 = str13;
                        i62 = ((iM276110 ^ i60) * 17603) ^ (-1861459307);
                        i75 = i43;
                        jSONArray7 = jSONArray7;
                        arrayList6 = arrayList3;
                        i66 = i66;
                        str12 = str12;
                        i73 = i73;
                        i63 = iM276110 ^ 1040983112;
                        bArr5 = bArr5;
                        bArr4 = bArr4;
                        i71 = i71;
                        i70 = i70;
                        i76 = i76;
                        float f24 = f7;
                        str11 = str11;
                        length = length;
                        z14 = z11;
                        f7 = f24;
                        String str11114 = str13;
                        iM88710 = iM88710;
                        str13 = str11114;
                    } else {
                        iM2769 = C0619.m2761("ۖܿ") ^ i60;
                        i52 = ((iM2769 ^ i61) * (-19613)) ^ (-539566034);
                        i53 = 1866379739;
                        i63 = iM2769 ^ i53;
                        i62 = i52;
                    }
                    break;
                case 731835417:
                case 937826728:
                    int i169 = i76;
                    String str42 = str12;
                    int i170 = i70;
                    byte[] bArr18 = bArr5;
                    int i171 = i71;
                    int i172 = i73;
                    byte[] bArr19 = bArr4;
                    JSONArray jSONArray16 = jSONArray7;
                    ArrayList arrayList10 = arrayList6;
                    int i173 = i66;
                    JSONArray jSONArray17 = jSONArray8;
                    int i174 = i75;
                    boolean z42 = z14;
                    i = length;
                    str = str11;
                    f = f7;
                    z6 = z42;
                    int i175 = iM88710;
                    str13 = str13;
                    i2 = i175;
                    if (C3998.m12923(itM7968)) {
                        iM31610 = C0619.m2761("ۛ᩷") ^ i60;
                        i8 = ((iM31610 ^ i61) * 29469) ^ 873185541;
                        i9 = -1657662439;
                    } else {
                        iM31610 = C0773.m3169("ۛ᩻") ^ i61;
                        i8 = ((iM31610 ^ i60) * 25215) ^ 875093823;
                        i9 = 91048161;
                    }
                    int i176 = iM31610 ^ i9;
                    i75 = i174;
                    bArr4 = bArr19;
                    jSONArray8 = jSONArray17;
                    i71 = i171;
                    i66 = i173;
                    i70 = i170;
                    i73 = i172;
                    i76 = i169;
                    bArr5 = bArr18;
                    i63 = i176;
                    i62 = i8;
                    arrayList6 = arrayList10;
                    jSONArray7 = jSONArray16;
                    str12 = str42;
                    float f25 = f;
                    str11 = str;
                    length = i;
                    z14 = z6;
                    f7 = f25;
                    String str2118 = str13;
                    iM88710 = i2;
                    str13 = str2118;
                    break;
                case 761619374:
                case 853877274:
                    Object objM3796 = C0950.m3796(it);
                    C2310.m7811(objM3796, C1783.m6233(f2436, 243, 9, i64));
                    C21914 c21915 = (C21914) objM3796;
                    c6178.m17800((String) c21915.m49601());
                    c6178.mo17812(((byte[]) c21915.m49603()).length);
                    c6178.write((byte[]) c21915.m49603());
                    jSONArray6 = jSONArray7;
                    z12 = z14;
                    iM2767 = C0773.m3169("᩺ۡ") ^ i61;
                    i46 = ((iM2767 ^ i60) * (-16067)) ^ (-884541493);
                    i47 = -1087245340;
                    int i1118 = iM2767 ^ i47;
                    i76 = i76;
                    String str2119 = str12;
                    i63 = i1118;
                    i62 = i46;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str2119;
                    float f11110 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f11110;
                    break;
                case 823378635:
                case 1001512063:
                    i76 = i76;
                    str12 = str12;
                    if (C3998.m12923(itM4942)) {
                        iM2768 = C0619.m2761("ܰᩴ") ^ i60;
                        i50 = ((iM2768 ^ i61) * (-15241)) ^ 772242910;
                        i51 = 515474333;
                    } else {
                        iM2768 = C0619.m2761("ܿ֡") ^ i61;
                        i50 = ((iM2768 ^ i60) * 4659) ^ 2004537177;
                        i51 = -1591663215;
                    }
                    int i1013 = iM2768 ^ i51;
                    str12 = str12;
                    i63 = i1013;
                    i62 = i50;
                    i76 = i76;
                    break;
                case 1006271143:
                case 2092165519:
                    int i177 = i76;
                    String str43 = str12;
                    int i178 = i69;
                    int i179 = i70;
                    byte[] bArr20 = bArr5;
                    int i180 = i71;
                    int i181 = i73;
                    byte[] bArr21 = bArr4;
                    jSONArray7 = jSONArray7;
                    String str44 = str11;
                    float f26 = f7;
                    C13778 c137713 = c13779;
                    arrayList6 = arrayList6;
                    int i182 = i77;
                    int i183 = i66;
                    JSONArray jSONArray18 = jSONArray8;
                    boolean z43 = z14;
                    int i184 = i75;
                    int i185 = length;
                    int i186 = i68;
                    int i187 = iM88710;
                    str13 = str13;
                    iM88710 = i187;
                    c6178.mo17812(i186);
                    iM13851 = c4348.m13851();
                    if (iM13851 != 0) {
                        iM2763 = (C0619.m2761("ۘۘ") + i60) * 23;
                        i31 = ((iM2763 ^ i61) * 18533) ^ (-437375391);
                        i32 = 1019587657;
                    } else {
                        iM2763 = (C0619.m2761("᩷ۚ") ^ i61) * (-55);
                        i31 = ((iM2763 ^ i60) * 29951) ^ (-289631697);
                        i32 = 1015443965;
                    }
                    int i188 = iM2763 ^ i32;
                    i69 = i178;
                    i68 = i186;
                    i62 = i31;
                    i75 = i184;
                    length = i185;
                    z14 = z43;
                    i77 = i182;
                    jSONArray8 = jSONArray18;
                    i66 = i183;
                    c13779 = c137713;
                    f7 = f26;
                    str11 = str44;
                    i73 = i181;
                    bArr4 = bArr21;
                    bArr5 = bArr20;
                    i71 = i180;
                    i70 = i179;
                    i76 = i177;
                    str6 = str43;
                    i63 = i188;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str11115 = str13;
                    iM88710 = iM88710;
                    str13 = str11115;
                    break;
                case 1181258408:
                case 2011699615:
                    arrayList = arrayList6;
                    i12 = iM13851;
                    i13 = i76;
                    str3 = str12;
                    i14 = i70;
                    bArr = bArr5;
                    i15 = i71;
                    i16 = i73;
                    bArr2 = bArr4;
                    str4 = str11;
                    f2 = f7;
                    c13778 = c13779;
                    i17 = i77;
                    i18 = i66;
                    jSONArray3 = jSONArray8;
                    z8 = z14;
                    i19 = i75;
                    i20 = length;
                    i21 = i68;
                    int i189 = iM88710;
                    str13 = str13;
                    i22 = i189;
                    jSONArray4 = new JSONArray();
                    c6178 = new C6178();
                    i72 = 3;
                    i23 = 1;
                    i67 = 0;
                    if (z) {
                        int iM27620 = (i60 - C0619.m2761("ۘ᩵")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i68 = i21;
                        i75 = i19;
                        arrayList6 = arrayList;
                        length = i20;
                        z14 = z8;
                        str12 = str3;
                        jSONArray7 = jSONArray4;
                        i63 = iM27620 ^ (-217381843);
                        i62 = ((iM27620 ^ i61) * (-29073)) ^ (-1184912121);
                        jSONArray8 = jSONArray3;
                        iM13851 = i12;
                        i66 = i18;
                        f7 = f2;
                        str11 = str4;
                        i77 = i17;
                        i69 = 1;
                        i73 = i16;
                        c13779 = c13778;
                        bArr5 = bArr;
                    } else {
                        int iM31627 = (C0773.m3169("ܺ᩷") + i61) * (-43);
                        int i1610 = ((iM31627 ^ i60) * 25935) ^ 1393881131;
                        i68 = i21;
                        i75 = i19;
                        length = i20;
                        z14 = z8;
                        str12 = str3;
                        i63 = iM31627 ^ (-1318744074);
                        jSONArray8 = jSONArray3;
                        iM13851 = i12;
                        i66 = i18;
                        f7 = f2;
                        str11 = str4;
                        i69 = i23;
                        i73 = i16;
                        arrayList6 = arrayList;
                        jSONArray7 = jSONArray4;
                        i62 = i1610;
                        bArr5 = bArr;
                        i77 = i17;
                        c13779 = c13778;
                    }
                    bArr4 = bArr2;
                    i71 = i15;
                    i70 = i14;
                    i76 = i13;
                    String str11116 = str13;
                    iM88710 = i22;
                    str13 = str11116;
                    break;
                case 1192627431:
                case 1358431166:
                    i76 = i76;
                    str12 = str12;
                    i69 = i69;
                    i70 = i70;
                    bArr5 = bArr5;
                    i71 = i71;
                    i73 = i73;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    c13779 = c13779;
                    arrayList6 = arrayList6;
                    iM13851 = iM13851;
                    i66 = i66;
                    jSONArray8 = jSONArray8;
                    i75 = i75;
                    boolean z44 = z14;
                    length = length;
                    String str45 = str11;
                    f7 = f7;
                    z9 = z44;
                    int i190 = iM88710;
                    str13 = str13;
                    i22 = i190;
                    String strM13533 = C4238.m13533(sharedPreferences, C3492.m11492(c4348), null);
                    RunnableC3646.m11808(strM13533);
                    byte[] bArrM12261 = C3779.m12260(strM13533, C21015.f67180);
                    C2310.m7811(bArrM12261, str45);
                    c6178.m17809(bArrM12261.length);
                    str5 = str45;
                    c6178.write(bArrM12261, 0, bArrM12261.length);
                    i77 = i77;
                    i24 = i69;
                    iM7752 = i70;
                    i25 = i67;
                    i26 = i78;
                    int iM316113 = (C0773.m3169("ۢᩳ") ^ i61) * 67;
                    i67 = i25;
                    iM13851 = iM13851;
                    i75 = i75;
                    i76 = i76;
                    jSONArray8 = jSONArray8;
                    i69 = i24;
                    i66 = i66;
                    i68 = i26;
                    i73 = i73;
                    i77 = i77;
                    bArr5 = bArr5;
                    c13779 = c13779;
                    bArr4 = bArr4;
                    i71 = i71;
                    i70 = iM7752;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str12;
                    i63 = iM316113 ^ (-212356462);
                    i62 = ((iM316113 ^ i60) * (-27971)) ^ (-1545660557);
                    length = length;
                    z14 = z9;
                    f7 = f7;
                    str11 = str5;
                    String str11117 = str13;
                    iM88710 = i22;
                    str13 = str11117;
                    break;
                case 1266434304:
                case 1347757058:
                    i76 = i76;
                    str12 = str12;
                    str13 = str13;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    jSONArray6 = jSONArray7;
                    arrayList6 = arrayList6;
                    i73 = i73;
                    i66 = i66;
                    boolean z45 = z14;
                    length = length;
                    str11 = str11;
                    f7 = f7;
                    z12 = z45;
                    switch (c4347.m13851()) {
                        case 0:
                            iM31613 = (C0773.m3169("᩺ۛ") ^ i61) * 19;
                            i44 = ((iM31613 ^ i60) * (-18375)) ^ 2021018056;
                            i45 = 1229933127;
                            break;
                        case 1:
                            iM31613 = C0619.m2761("ۛ᩺") ^ i60;
                            i44 = ((iM31613 ^ i61) * 1025) ^ 1147296572;
                            i45 = 1763357513;
                            break;
                        case 2:
                            iM31613 = (i61 - C0619.m2761("ܶ֡")) * (-49);
                            i44 = ((iM31613 ^ i60) * (-7963)) ^ (-916454733);
                            i45 = -1596462360;
                            break;
                        case 3:
                            iM31613 = (C0619.m2761("۠ܰ") ^ i60) * 75;
                            i44 = ((iM31613 ^ i61) * 22173) ^ 487057503;
                            i45 = -1534618239;
                            break;
                        case 4:
                            iM31613 = (C0619.m2761("᩸۟") + i61) * 43;
                            i44 = ((iM31613 ^ i60) * (-22231)) ^ (-497623511);
                            i45 = 1202601925;
                            break;
                        case 5:
                            iM31613 = (C0619.m2761("ۡ۟") + i61) * (-113);
                            i44 = ((iM31613 ^ i60) * 10309) ^ 1848301553;
                            i45 = -1061668902;
                            break;
                        case 6:
                            iM31613 = (C0773.m3169("᩷ۛ") + i60) * 21;
                            i44 = ((iM31613 ^ i61) * 23225) ^ 1912708634;
                            i45 = 1616841357;
                            break;
                        case 7:
                            iM31613 = (i60 - C0619.m2761("۟᩷")) * (-73);
                            i44 = ((iM31613 ^ i61) * 23095) ^ (-689270943);
                            i45 = 184211007;
                            break;
                        default:
                            iM31613 = (i61 - C0619.m2761("ܿܰ")) * 85;
                            i44 = ((iM31613 ^ i60) * (-31665)) ^ (-1890279038);
                            i45 = -928719368;
                            break;
                    }
                    int i81113 = iM31613 ^ i45;
                    bArr4 = bArr4;
                    iM88710 = iM88710;
                    i76 = i76;
                    str13 = str13;
                    i62 = i44;
                    i66 = i66;
                    i73 = i73;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray6;
                    str12 = str12;
                    i63 = i81113;
                    float f11111 = f7;
                    str11 = str11;
                    length = length;
                    z14 = z12;
                    f7 = f11111;
                    break;
                case 1516367377:
                case 1952977106:
                    i76 = i76;
                    str12 = str12;
                    z9 = z14;
                    c6178.m17789(sharedPreferences.getBoolean(C3492.m11492(c4348), false));
                    str5 = str11;
                    int i711 = iM88710;
                    str13 = str13;
                    i22 = i711;
                    i24 = i69;
                    iM7752 = i70;
                    i25 = i67;
                    i26 = i78;
                    int iM316114 = (C0773.m3169("ۢᩳ") ^ i61) * 67;
                    i67 = i25;
                    iM13851 = iM13851;
                    i75 = i75;
                    i76 = i76;
                    jSONArray8 = jSONArray8;
                    i69 = i24;
                    i66 = i66;
                    i68 = i26;
                    i73 = i73;
                    i77 = i77;
                    bArr5 = bArr5;
                    c13779 = c13779;
                    bArr4 = bArr4;
                    i71 = i71;
                    i70 = iM7752;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str12;
                    i63 = iM316114 ^ (-212356462);
                    i62 = ((iM316114 ^ i60) * (-27971)) ^ (-1545660557);
                    length = length;
                    z14 = z9;
                    f7 = f7;
                    str11 = str5;
                    String str11118 = str13;
                    iM88710 = i22;
                    str13 = str11118;
                    break;
                case 1766364625:
                case 1970632986:
                    int i191 = i76;
                    String str46 = str12;
                    int i192 = i70;
                    byte[] bArr22 = bArr5;
                    int i193 = i71;
                    int i194 = i73;
                    byte[] bArr23 = bArr4;
                    jSONArray7 = jSONArray7;
                    float f27 = f7;
                    C13778 c137714 = c13779;
                    arrayList6 = arrayList6;
                    int i195 = i77;
                    int i196 = i66;
                    JSONArray jSONArray19 = jSONArray8;
                    boolean z46 = z14;
                    int i197 = i75;
                    int i198 = length;
                    int i199 = i68;
                    int i200 = i69;
                    int i201 = iM13851;
                    int i202 = iM88710;
                    str13 = str13;
                    iM88710 = i202;
                    boolean zM6317 = C1826.m6317(itM13647);
                    String strM7980 = C2354.m7980(f2436, 165, 13, i64);
                    strM13650 = C4282.m13650(f2436, 178, 29, i64);
                    f6 = 0.0f;
                    if (zM6317) {
                        iM31612 = (C0619.m2761("ۙۘ") ^ i60) * (-97);
                        i28 = ((iM31612 ^ i61) * 29499) ^ (-276949581);
                        i29 = 980532268;
                    } else {
                        iM31612 = C0773.m3169("ۧۖ") ^ i61;
                        i28 = ((iM31612 ^ i60) * (-19743)) ^ 1744222505;
                        i29 = 2115542357;
                    }
                    int i203 = iM31612 ^ i29;
                    i75 = i197;
                    i77 = i195;
                    jSONArray8 = jSONArray19;
                    i66 = i196;
                    c13779 = c137714;
                    i73 = i194;
                    bArr4 = bArr23;
                    bArr5 = bArr22;
                    i71 = i193;
                    i70 = i192;
                    i76 = i191;
                    str6 = str46;
                    i63 = i203;
                    i62 = i28;
                    iM13851 = i201;
                    i69 = i200;
                    i68 = i199;
                    length = i198;
                    z14 = z46;
                    f7 = f27;
                    str11 = strM7980;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str12 = str6;
                    String str11119 = str13;
                    iM88710 = iM88710;
                    str13 = str11119;
                    break;
                default:
                    jSONArray = jSONArray7;
                    z7 = z14;
                    i2 = iM88710;
                    jSONArray2 = jSONArray8;
                    jSONArray2.add(((C8969) C4238.m13529(itM4945)).m23972());
                    str2 = str11;
                    i3 = i75;
                    iM2761 = (i60 - C0619.m2761("ۗۚ")) * (-43);
                    i4 = ((iM2761 ^ i61) * (-20695)) ^ 591345211;
                    i5 = 1097147852;
                    i7 = iM2761 ^ i5;
                    i68 = i68;
                    i75 = i3;
                    length = length;
                    z14 = z7;
                    i77 = i77;
                    jSONArray8 = jSONArray2;
                    i66 = i66;
                    c13779 = c13779;
                    f7 = f7;
                    str11 = str2;
                    i73 = i73;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i71 = i71;
                    i70 = i70;
                    i76 = i76;
                    int i918 = iM13851;
                    i69 = i69;
                    i62 = i4;
                    iM13851 = i918;
                    String str21110 = str12;
                    i63 = i7;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str12 = str21110;
                    String str21111 = str13;
                    iM88710 = i2;
                    str13 = str21111;
                    break;
            }
        }
    }
}
