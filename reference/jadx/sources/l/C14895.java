package l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.internal.a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ܶ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes5.dex */
public class C14895 extends AbstractC22611 implements InterfaceC18088 {

    /* JADX INFO: renamed from: ۤ᩵᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f48659 = {566, -12361, 13868, -1129, 7535, -24319, -18013, 21654, 6684, 31737, 31729, 31712, 31740, 31739, 31728, 31703, 31733, 31738, 31668, 31738, 31739, 31712, 31668, 31730, 31741, 31738, 31728, 31668, 31712, 31740, 31729, 31668, 31737, 31729, 31712, 31740, 31739, 31728, 31662, 31668, 3133, -24346, -24349, -24347, -24343, -24336, 2852, 30702, -20161, 28178, 3594, -4331, -5938, -1478, 282, -2881, -15086, -9252, -13855, -995, -6053, -5014, -14261, -13513, 5143, 3792, -14042, -19097, -6153, 3872, -6254, -27366, -27269, -27363, -27363, -27285, -27266, -27267, -27265, -27293, -27331, -27364, -27362, -27363, -27342, -27295, -27353, -27347, -27346, -27338, -27358, -27351, -27360, -27341, -27339, -27362, -27281, -27349, -27343, -27354, -27349, -27343, -27354, -4959, -3420, 3030, 8991, -12908, -12900, -12915, -12911, -12906, -12899, 1220, -31729, 31742, -30264, 29042, -21635, -22001, 28724, -26346, 27105, 7546, 31374, 31366, 31383, 31371, 31372, 31367, 31437, 7058, -16023, -16026, -16021, -16007, -16007, -16006, -16021, -16002, -16030, -16025, -16017, -16002, -16030, -16027, -16018, 1675, -2681, -2680, -2683, -2665, -2665, -2668, -2683, -2672, -2676, 6207, -6321, -6329, -6314, -6326, -6323, -6330, 2477, 19328, 20458, -20943};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13108 f48660;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f48661;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f48662;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f48663;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C6382 f48664;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public View f48665;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f48666;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C18377 f48667;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View f48668;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6094 f48669;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23566 f48670;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f48671;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35606(C14895 c14895, String str) {
        ActivityC5677 activityC5677 = null;
        int i = -1090338446;
        int i2 = C2124.f7782;
        int i3 = C2249.f8050;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢܳ")) * (-5);
        int i4 = ((iM11306 ^ i2) * (-24663)) ^ 428285142;
        int i5 = -621305958;
        while (true) {
            i = ((((i ^ i2) * 12121) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2134886933:
                case 1565532877:
                    RunnableC1895.m6170();
                    if (!C3743.f13569) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۚ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-17241)) ^ (-1042268281);
                        i5 = -1203287430;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۢۙ")) * (-41);
                        i4 = ((iM11306 ^ i2) * 27193) ^ 1540654979;
                        i5 = 1670535029;
                    }
                    break;
                case -1998655403:
                case 1403612541:
                    C0216.m1591();
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۡ") ^ i2) * (-23);
                        i4 = ((iM11306 ^ i3) * (-20009)) ^ (-967837793);
                        i5 = 2036209891;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12121)) ^ (-302084842);
                        i5 = -795327824;
                    }
                    break;
                case -1613185368:
                case 1013690887:
                    break;
                case -1552528314:
                case 1789652266:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۚ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-17241)) ^ (-1042268281);
                        i5 = -1203287430;
                    } else {
                        iM11306 = C19806.m45029("ۧ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 26487) ^ 402179515;
                        i5 = 940728662;
                    }
                    break;
                case -1283051958:
                case -126762921:
                    if (c14895.f48662) {
                        iM11306 = C19806.m45029("ܺ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20855) ^ 1938698566;
                        i5 = -198226121;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18271)) ^ 1278848900;
                        i5 = 1274081059;
                    }
                    break;
                case -1004512661:
                case 1953917548:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19361) ^ (-1228901690);
                        i5 = -145162908;
                    } else {
                        RunnableC0195.m1442(new C0782(c14895, activityC5677, str));
                        iM11306 = ThreadFactoryC3888.m11306("ۙۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18271)) ^ 1278848900;
                        i5 = 1274081059;
                    }
                    break;
                case -875588533:
                case 1159445333:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۡ") ^ i2) * (-23);
                        i4 = ((iM11306 ^ i3) * (-20009)) ^ (-967837793);
                        i5 = 2036209891;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13497)) ^ 2026413108;
                        i5 = -1533255887;
                    }
                    break;
                case -822082281:
                case -432284564:
                    if (RunnableC1564.f6300) {
                        iM11306 = (i3 - C19806.m45029("ۢۙ")) * (-41);
                        i4 = ((iM11306 ^ i2) * 27193) ^ 1540654979;
                        i5 = 1670535029;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29301) ^ (-1477380058);
                        i5 = -1964213012;
                    }
                    break;
                case -754514959:
                case 20516684:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12121)) ^ (-302084842);
                        i5 = -795327824;
                    } else {
                        iM11306 = C19806.m45029("ܶۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25383)) ^ (-2052357400);
                        i5 = 2047827855;
                    }
                    break;
                case -454809552:
                case 226096815:
                    if (C0817.m3399()) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶܳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM11306 ^ i2) * (-21317)) ^ 501653193;
                        i5 = -1403553323;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۚ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-17241)) ^ (-1042268281);
                        i5 = -1203287430;
                    }
                    break;
                case -42679921:
                case 532938965:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۚ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-17241)) ^ (-1042268281);
                        i5 = -1203287430;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18001) ^ (-796507230);
                        i5 = 489902123;
                    }
                    break;
                case 11195787:
                case 945076536:
                    C3577.m10565();
                    C2124.m6673();
                    iM11306 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-12121)) ^ (-302084842);
                    i5 = -795327824;
                    break;
                case 284698876:
                case 873428923:
                    C3743.m10966();
                    C1875.m6086();
                    break;
                case 375455723:
                case 1973234142:
                    if (C0962.m3746() < 0) {
                        iM11306 = (i3 - C19806.m45029("ۢۙ")) * (-41);
                        i4 = ((iM11306 ^ i2) * 27193) ^ 1540654979;
                        i5 = 1670535029;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12121)) ^ (-302084842);
                        i5 = -795327824;
                    }
                    break;
                case 877454375:
                case 1298159596:
                    if (c14895.f48660 != null) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֡ܺ")) * (-117);
                        i4 = ((iM11306 ^ i3) * (-24063)) ^ 1148083178;
                        i5 = 516466665;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18271)) ^ 1278848900;
                        i5 = 1274081059;
                    }
                    break;
                case 998652780:
                case 1224109423:
                    activityC5677 = (ActivityC5677) AbstractC0464.m2305(c14895);
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۢۙ")) * (-41);
                        i4 = ((iM11306 ^ i2) * 27193) ^ 1540654979;
                        i5 = 1670535029;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘܶ")) * (-21);
                        i4 = ((iM11306 ^ i2) * (-25351)) ^ 1424572951;
                        i5 = -204731664;
                    }
                    break;
                case 1017510710:
                case 1424567767:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۡ") ^ i2) * (-23);
                        i4 = ((iM11306 ^ i3) * (-20009)) ^ (-967837793);
                        i5 = 2036209891;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۡ") ^ i3) * (-57);
                        i4 = ((iM11306 ^ i2) * 31139) ^ 563571511;
                        i5 = -422198696;
                    }
                    break;
                default:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("ۧۙ") + i3) * (-107);
                        i4 = ((iM11306 ^ i2) * 1951) ^ 959854851;
                        i5 = -1026980094;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۚ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-17241)) ^ (-1042268281);
                        i5 = -1203287430;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo3621() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011e A[PHI: r7
      0x011e: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:39:0x011c, B:15:0x0058, B:13:0x0054, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0193 A[PHI: r2 r5 r6 r9 r10
      0x0193: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:51:0x0191, B:43:0x0153, B:29:0x00b0, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:51:0x0191, B:43:0x0153, B:29:0x00b0, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:51:0x0191, B:43:0x0153, B:29:0x00b0, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r9v3 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v2 short[]), (r9v1 short[]) binds: [B:51:0x0191, B:43:0x0153, B:29:0x00b0, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:51:0x0191, B:43:0x0153, B:29:0x00b0, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f1 A[PHI: r3 r4 r11 r16
      0x01f1: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:59:0x01ef, B:47:0x0174, B:25:0x008f, B:21:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:59:0x01ef, B:47:0x0174, B:25:0x008f, B:21:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:59:0x01ef, B:47:0x0174, B:25:0x008f, B:21:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String), (r16v3 java.lang.String) binds: [B:59:0x01ef, B:47:0x0174, B:25:0x008f, B:21:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x021f A[PHI: r1
      0x021f: PHI (r1v4 short[]) = (r1v3 short[]), (r1v1 short[]) binds: [B:63:0x021d, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3622() {
        int iM11306;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -87747803;
        int i10 = C1148.f5161;
        int i11 = C1937.f7317;
        int iM11307 = ThreadFactoryC3888.m11306("ܿ۠") ^ i10;
        int i12 = ((iM11307 ^ i11) * 17425) ^ 1150073878;
        int i13 = iM11307 ^ 1517532444;
        String strM26821 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * 6081) >> 31));
            switch (i9) {
                case -1726060316:
                case -1711754351:
                    C2332.m7079();
                    iM11306 = (i10 - ThreadFactoryC3888.m11306("ۢۗ")) * 59;
                    i = ((iM11306 ^ i11) * (-2233)) ^ 1859290949;
                    i2 = 514558910;
                    int i14 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i14;
                    break;
                case -1594928981:
                case 1851034962:
                    strM26821 = C10634.m26821(sArr2, i7, i8, i6);
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩹") ^ i11;
                        i = ((iM11306 ^ i10) * (-8859)) ^ (-227671495);
                        i2 = 1559874217;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۘ") + i11) * (-123);
                        i = ((iM11306 ^ i10) * 1739) ^ 764819936;
                        i2 = 2139754759;
                    }
                    int i15 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i15;
                    break;
                case -1522280735:
                case 1548108669:
                    if (i3 - (i4 + i5) > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۤ") ^ i10) * 89;
                        i = ((iM11306 ^ i11) * 15399) ^ (-176468494);
                        i2 = 1798184794;
                    } else {
                        iM11306 = C19806.m45029("ۡ۫") ^ i10;
                        i = ((iM11306 ^ i11) * 7013) ^ 606831228;
                        i2 = -1018616252;
                    }
                    int i16 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i16;
                    break;
                case -1494963232:
                case 1451515566:
                    s = sArr[c];
                    s2 = 7236;
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩹") ^ i11;
                        i = ((iM11306 ^ i10) * (-8859)) ^ (-227671495);
                        i2 = 1559874217;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۖ") ^ i11;
                        i = ((iM11306 ^ i10) * (-8951)) ^ 1426576784;
                        i2 = 1281794278;
                    }
                    int i17 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i17;
                    break;
                case -1478881642:
                case -191090615:
                    i3 = s * s2;
                    i4 = s * s;
                    if (C0962.m3746() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i10;
                        i = ((iM11306 ^ i11) * 17513) ^ (-1566658870);
                        i2 = 1402598417;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۤ᩶")) * (-97);
                        i = ((iM11306 ^ i11) * (-30571)) ^ 438375055;
                        i2 = -1418061617;
                    }
                    int i18 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i18;
                    break;
                case -1328512427:
                case 2019146299:
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("ᩳ᩶") ^ i11;
                        i = ((iM11306 ^ i10) * (-16827)) ^ (-1272352328);
                        i2 = 1923175402;
                    } else {
                        iM11306 = (C19806.m45029("᩺ܿ") ^ i10) * (-51);
                        i = ((iM11306 ^ i11) * (-6499)) ^ (-1885666351);
                        i2 = -1647526599;
                    }
                    int i19 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i19;
                    break;
                case -1324960106:
                case 1204449222:
                    i8 = 3;
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩹") ^ i11;
                        i = ((iM11306 ^ i10) * (-8859)) ^ (-227671495);
                        i2 = 1559874217;
                    } else {
                        iM11306 = C19806.m45029("᩵᩸") ^ i10;
                        i = ((iM11306 ^ i11) * 17557) ^ (-1193180124);
                        i2 = 300195350;
                    }
                    int i110 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i110;
                    break;
                case -1220087580:
                case -208643377:
                    C1398.m4895();
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ᩳ᩶") ^ i11;
                        i = ((iM11306 ^ i10) * (-16827)) ^ (-1272352328);
                        i2 = 1923175402;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i10;
                        i = ((iM11306 ^ i11) * 17513) ^ (-1566658870);
                        i2 = 1402598417;
                    }
                    int i111 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i111;
                    break;
                case -1202950941:
                case -368650840:
                    sArr2 = f48659;
                    i7 = 165;
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i10;
                        i = ((iM11306 ^ i11) * 17513) ^ (-1566658870);
                        i2 = 1402598417;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۙ") ^ i11;
                        i = ((iM11306 ^ i10) * 8749) ^ (-695301723);
                        i2 = 1522148760;
                    }
                    int i112 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i112;
                    break;
                case -982519909:
                case 1802588914:
                    return ThreadFactoryC3888.m11306(strM26821) ^ 2130326671;
                case -943989453:
                case 1051157499:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩹") ^ i11;
                        i = ((iM11306 ^ i10) * (-8859)) ^ (-227671495);
                        i2 = 1559874217;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩻") ^ i11;
                        i = ((iM11306 ^ i10) * (-8885)) ^ (-254397377);
                        i2 = -1813700465;
                    }
                    int i113 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i113;
                    break;
                case -858472171:
                case 907967108:
                    i5 = 13089924;
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۢۗ")) * 59;
                        i = ((iM11306 ^ i11) * (-2233)) ^ 1859290949;
                        i2 = 514558910;
                    } else {
                        iM11306 = C19806.m45029("᩵۟") ^ i11;
                        i = ((iM11306 ^ i10) * (-1703)) ^ (-626011620);
                        i2 = -1208414950;
                    }
                    int i114 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i114;
                    break;
                case -73552257:
                case 1228971848:
                    RunnableC3388.m10064();
                    if (C1461.m5080()) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۢۗ")) * 59;
                        i = ((iM11306 ^ i11) * (-2233)) ^ 1859290949;
                        i2 = 514558910;
                    } else {
                        iM11306 = C19806.m45029("ᩳ᩶") ^ i11;
                        i = ((iM11306 ^ i10) * (-16827)) ^ (-1272352328);
                        i2 = 1923175402;
                    }
                    int i115 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i115;
                    break;
                case 240505672:
                case 1959368931:
                    i6 = 26991;
                    iM11306 = (i11 - C19806.m45029("ۙۧ")) * 39;
                    i = ((iM11306 ^ i10) * (-9233)) ^ (-725203735);
                    i2 = 1373115258;
                    int i116 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i116;
                    break;
                case 303088323:
                case 1348004233:
                    c = 164;
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i10;
                        i = ((iM11306 ^ i11) * 17513) ^ (-1566658870);
                        i2 = 1402598417;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚܿ") + i11) * (-43);
                        i = ((iM11306 ^ i10) * 30099) ^ 1568354537;
                        i2 = 834092884;
                    }
                    int i117 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i117;
                    break;
                case 633343866:
                case 1766267095:
                    sArr = f48659;
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩹") + i10) * 29;
                        i = ((iM11306 ^ i11) * (-10763)) ^ (-1329740312);
                        i2 = -1930355695;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۨ") ^ i10;
                        i = ((iM11306 ^ i11) * 12785) ^ (-2012865442);
                        i2 = -1207411288;
                    }
                    int i118 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i118;
                    break;
                case 740979801:
                case 2031991486:
                    if (C0278.m1789() <= 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۢۗ")) * 59;
                        i = ((iM11306 ^ i11) * (-2233)) ^ 1859290949;
                        i2 = 514558910;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩹") + i10) * 29;
                        i = ((iM11306 ^ i11) * (-10763)) ^ (-1329740312);
                        i2 = -1930355695;
                    }
                    int i119 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i119;
                    break;
                case 1837005136:
                case 1887989688:
                    C1419.m4973();
                    return 0;
                default:
                    i6 = 52185;
                    iM11306 = (i11 - C19806.m45029("ۙۧ")) * 39;
                    i = ((iM11306 ^ i10) * (-9233)) ^ (-725203735);
                    i2 = 1373115258;
                    int i1110 = i;
                    i13 = iM11306 ^ i2;
                    i12 = i1110;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x029e A[PHI: r7 r9 r16 r18
      0x029e: PHI (r7v4 l.᩷᩸) = (r7v2 l.᩷᩸), (r7v2 l.᩷᩸), (r7v5 l.᩷᩸) binds: [B:70:0x029c, B:50:0x019f, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:70:0x029c, B:50:0x019f, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r16v17 l.۫۬) = (r16v4 l.۫۬), (r16v11 l.۫۬), (r16v18 l.۫۬) binds: [B:70:0x029c, B:50:0x019f, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r18v19 l.ܺ᩸) = (r18v2 l.ܺ᩸), (r18v9 l.ܺ᩸), (r18v20 l.ܺ᩸) binds: [B:70:0x029c, B:50:0x019f, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (l.C0797.f3386 == false) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m35610(l.C14895 r21, final int r22, float r23, float r24) {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14895.m35610(l.ܶ֨ۜ, int, float, float):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35607(C14895 c14895, C6094 c6094) {
        int i = 1945148388;
        int i2 = C1461.f5957;
        int i3 = RunnableC3388.f12514;
        int iM45029 = C19806.m45029("ۡۤ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-28783)) ^ 2100995517;
        int i5 = -1542191154;
        while (true) {
            i = ((((i ^ i3) * 4709) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2116111295:
                case 1940378004:
                    if (C0797.m3359()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۡ") ^ i2) * 21;
                        i4 = ((iM45029 ^ i3) * (-13003)) ^ (-123318902);
                        i5 = -1036172856;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۛ᩺")) * (-125);
                        i4 = ((iM45029 ^ i3) * 2975) ^ 694369531;
                        i5 = -2123614080;
                    }
                    break;
                case -2107115342:
                case 1995465969:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("ۚ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17431) ^ 625579945;
                        i5 = 1238692318;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩶ۢ")) * 67;
                        i4 = ((iM45029 ^ i2) * 2103) ^ 1472870092;
                        i5 = 1464227110;
                    }
                    break;
                case -1997506748:
                case 624073632:
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("ۚ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17431) ^ 625579945;
                        i5 = 1238692318;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩶ۖ")) * 39;
                        i4 = ((iM45029 ^ i3) * (-3147)) ^ (-168398719);
                        i5 = -2048166571;
                    }
                    break;
                case -1841566175:
                case 1264023192:
                    C2332.m7081(new C12778(c14895));
                    break;
                case -1783945613:
                case -217770848:
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ۖܽ") + i3) * (-117);
                        i4 = ((iM45029 ^ i2) * (-25223)) ^ 1770970573;
                        i5 = 1916607334;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۛ᩺")) * (-125);
                        i4 = ((iM45029 ^ i3) * 2975) ^ 694369531;
                        i5 = -2123614080;
                    }
                    break;
                case -1738353017:
                case 1201089979:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19999)) ^ 2085567609;
                        i5 = 1747886076;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹ۧ")) * 49;
                        i4 = ((iM45029 ^ i2) * 22591) ^ 549001323;
                        i5 = 1311248117;
                    }
                    break;
                case -1567219738:
                case -164724423:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۛ᩺")) * (-125);
                        i4 = ((iM45029 ^ i3) * 2975) ^ 694369531;
                        i5 = -2123614080;
                    } else {
                        iM45029 = C19806.m45029("ۚ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17431) ^ 625579945;
                        i5 = 1238692318;
                    }
                    break;
                case -1471685089:
                case 274771956:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۛ᩺")) * (-125);
                        i4 = ((iM45029 ^ i3) * 2975) ^ 694369531;
                        i5 = -2123614080;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܺ") ^ i3) * (-37);
                        i4 = ((iM45029 ^ i2) * (-1607)) ^ 2101974831;
                        i5 = -1593206460;
                    }
                    break;
                case -1422912865:
                case 1373820497:
                    break;
                case -1156562556:
                case 2043950832:
                    if (C1377.m4833() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۖ") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * (-24331)) ^ 23877630;
                        i5 = 1118596820;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ᩳ") + i2) * 115;
                        i4 = ((iM45029 ^ i3) * 23171) ^ (-309569005);
                        i5 = -1913852232;
                    }
                    break;
                case -1075384007:
                case 725047618:
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13613)) ^ (-1973901243);
                        i5 = 1208305809;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۖ") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * (-24331)) ^ 23877630;
                        i5 = 1118596820;
                    }
                    break;
                case -673916109:
                case 1608031384:
                    C2249.m6915();
                    break;
                case -102634799:
                case 1584813613:
                    if (!C0797.f3386) {
                        iM45029 = (C19806.m45029("ۗܽ") ^ i2) * 27;
                        i4 = ((iM45029 ^ i3) * (-17163)) ^ (-1188665734);
                        i5 = 518613784;
                    } else {
                        iM45029 = C19806.m45029("ۚ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17431) ^ 625579945;
                        i5 = 1238692318;
                    }
                    break;
                case -59644338:
                case 1113139036:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۖ") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * (-24331)) ^ 23877630;
                        i5 = 1118596820;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25507)) ^ 88039133;
                        i5 = 535898961;
                    }
                    break;
                case -55931075:
                case 1280717119:
                    C1461.m5080();
                    if (C1398.m4895() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19999)) ^ 2085567609;
                        i5 = 1747886076;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۛ᩺")) * (-125);
                        i4 = ((iM45029 ^ i3) * 2975) ^ 694369531;
                        i5 = -2123614080;
                    }
                    break;
                case 237018463:
                case 241306181:
                    if (C3286.f12186) {
                        iM45029 = (C19806.m45029("ۗܽ") ^ i2) * 27;
                        i4 = ((iM45029 ^ i3) * (-17163)) ^ (-1188665734);
                        i5 = 518613784;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 783) ^ 1532988770;
                        i5 = -1254665802;
                    }
                    break;
                case 940220922:
                case 1136547486:
                    c14895.f48669 = c6094;
                    if (c14895.f48662) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۡ") + i3) * 89;
                        i4 = ((iM45029 ^ i2) * (-27525)) ^ (-1742013183);
                        i5 = 2090834986;
                    } else {
                        iM45029 = (C19806.m45029("ۙ۫") ^ i2) * 33;
                        i4 = ((iM45029 ^ i3) * 27715) ^ (-904281500);
                        i5 = -837637586;
                    }
                    break;
                default:
                    RunnableC1895.m6170();
                    iM45029 = C19806.m45029("ۚ۬") ^ i3;
                    i4 = ((iM45029 ^ i2) * 17431) ^ 625579945;
                    i5 = 1238692318;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a6 A[PHI: r3 r7 r16
      0x01a6: PHI (r3v4 short[]) = (r3v2 short[]), (r3v6 short[]) binds: [B:52:0x01a4, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r7v5 int) = (r7v3 int), (r7v2 int) binds: [B:52:0x01a4, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r16v23 android.os.Bundle) = (r16v5 android.os.Bundle), (r16v26 android.os.Bundle) binds: [B:52:0x01a4, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01cc A[PHI: r5 r6 r8 r11 r16
      0x01cc: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:56:0x01ca, B:48:0x0180, B:33:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:56:0x01ca, B:48:0x0180, B:33:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:56:0x01ca, B:48:0x0180, B:33:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:56:0x01ca, B:48:0x0180, B:33:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r16v12 android.os.Bundle) = (r16v4 android.os.Bundle), (r16v6 android.os.Bundle), (r16v13 android.os.Bundle) binds: [B:56:0x01ca, B:48:0x0180, B:33:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025d A[PHI: r1 r3 r7 r10
      0x025d: PHI (r1v52 android.os.Bundle) = (r1v27 android.os.Bundle), (r1v2 android.os.Bundle), (r1v2 android.os.Bundle), (r1v56 android.os.Bundle) binds: [B:37:0x00ff, B:19:0x006a, B:17:0x0066, B:53:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r3v3 short[]) = (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v4 short[]) binds: [B:37:0x00ff, B:19:0x006a, B:17:0x0066, B:53:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:37:0x00ff, B:19:0x006a, B:17:0x0066, B:53:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:37:0x00ff, B:19:0x006a, B:17:0x0066, B:53:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (l.C3660.f13403 >= 0) goto L10;
     */
    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۬ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo3618() {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14895.mo3618():java.lang.String");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35608(C14895 c14895, C17367 c17367) {
        int i = 0;
        int i2 = 844017917;
        int i3 = C3535.f13026;
        int i4 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("ۧ۬") ^ i4;
        int i5 = ((iM11306 ^ i3) * 21119) ^ 1624595548;
        int i6 = 368875330;
        while (true) {
            i2 = ((((i2 ^ i3) * (-27665)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2084290917:
                case 12822665:
                    c14895.f48660.m32416(c17367);
                    break;
                case -1453190662:
                case 316472683:
                    C0671.m3008();
                    if (C0050.f912 > 0) {
                        iM11306 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17801) ^ (-853629457);
                        i6 = 1398994225;
                    } else {
                        iM11306 = C19806.m45029("ۙ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 13085) ^ 942911552;
                        i6 = 1419362165;
                    }
                    break;
                case -1309891701:
                case 1741029685:
                    C20190.m45649((InterfaceC0433) c17367, i);
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩵") + i4) * 91;
                        i5 = ((iM11306 ^ i3) * (-22255)) ^ (-1497473479);
                        i6 = -540562208;
                    } else {
                        iM11306 = (C19806.m45029("ܰۤ") + i3) * (-65);
                        i5 = ((iM11306 ^ i4) * 17861) ^ 1676598703;
                        i6 = -1261463562;
                    }
                    break;
                case -1216918772:
                case -1206116143:
                    C3722.m10894();
                    RunnableC3388.m10064();
                    iM11306 = C19806.m45029("ۙ֫") ^ i3;
                    i5 = ((iM11306 ^ i4) * 13085) ^ 942911552;
                    i6 = 1419362165;
                    break;
                case -1164899591:
                case -236270063:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩵") + i4) * 91;
                        i5 = ((iM11306 ^ i3) * (-22255)) ^ (-1497473479);
                        i6 = -540562208;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۘ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 28363) ^ (-1141439947);
                        i6 = -17391289;
                    }
                    break;
                case -970390310:
                case -704940871:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-15109)) ^ (-1133559686);
                        i6 = 865860455;
                    } else {
                        iM11306 = C19806.m45029("ۙ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 13085) ^ 942911552;
                        i6 = 1419362165;
                    }
                    break;
                case -957963803:
                case 1875560842:
                    i = 1382253411;
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17801) ^ (-853629457);
                        i6 = 1398994225;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-10951)) ^ (-1589016786);
                        i6 = -301186003;
                    }
                    break;
                case -890684292:
                case -682652170:
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17801) ^ (-853629457);
                        i6 = 1398994225;
                    } else {
                        iM11306 = (C19806.m45029("ۗۗ") ^ i4) * (-19);
                        i5 = ((iM11306 ^ i3) * 32037) ^ 1121867731;
                        i6 = 525079538;
                    }
                    break;
                case -854087872:
                case 306687992:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17801) ^ (-853629457);
                        i6 = 1398994225;
                    } else {
                        iM11306 = C19806.m45029("ܺᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1863) ^ (-896161036);
                        i6 = 590690235;
                    }
                    break;
                case -678586176:
                case -406691374:
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 26971) ^ 1988099581;
                        i6 = -1948477757;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛ֡")) * 17;
                        i5 = ((iM11306 ^ i4) * 5331) ^ (-475035780);
                        i6 = -189296525;
                    }
                    break;
                case 192502424:
                case 1397875095:
                    RunnableC3388.m10064();
                    break;
                case 320470683:
                case 1404725427:
                    c14895.f48666 = C3660.m10781(c17367);
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17801) ^ (-853629457);
                        i6 = 1398994225;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-23801)) ^ 601724845;
                        i6 = 1741842189;
                    }
                    break;
                case 450951169:
                case 1257857447:
                    if (C2871.m8646()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۙ") ^ i3) * 127;
                        i5 = ((iM11306 ^ i4) * (-28793)) ^ (-1044406453);
                        i6 = -1207150087;
                    } else {
                        iM11306 = C19806.m45029("ۙ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 13085) ^ 942911552;
                        i6 = 1419362165;
                    }
                    break;
                case 699195292:
                case 1398317458:
                    if (C0797.m3359()) {
                        iM11306 = (C19806.m45029("᩸۠") + i4) * (-19);
                        i5 = ((iM11306 ^ i3) * 31105) ^ 165584097;
                        i6 = 5309758;
                    } else {
                        iM11306 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17801) ^ (-853629457);
                        i6 = 1398994225;
                    }
                    break;
                case 1801965487:
                case 2094395870:
                    if (C0962.m3746() >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛ֡")) * 17;
                        i5 = ((iM11306 ^ i4) * 5331) ^ (-475035780);
                        i6 = -189296525;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-18613)) ^ (-1046002976);
                        i6 = -1714825275;
                    }
                    break;
                default:
                    if (C1937.f7317 < 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛ֡")) * 17;
                        i5 = ((iM11306 ^ i4) * 5331) ^ (-475035780);
                        i6 = -189296525;
                    } else {
                        iM11306 = C19806.m45029("ۙ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 13085) ^ 942911552;
                        i6 = 1419362165;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b6 A[PHI: r11
      0x00b6: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:29:0x00b4, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0206 A[PHI: r3 r6 r7 r8 r16
      0x0206: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:58:0x0204, B:54:0x01e6, B:44:0x0170, B:18:0x006f, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:58:0x0204, B:54:0x01e6, B:44:0x0170, B:18:0x006f, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:58:0x0204, B:54:0x01e6, B:44:0x0170, B:18:0x006f, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:58:0x0204, B:54:0x01e6, B:44:0x0170, B:18:0x006f, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r16v20 android.os.Bundle) = 
      (r16v4 android.os.Bundle)
      (r16v5 android.os.Bundle)
      (r16v7 android.os.Bundle)
      (r16v15 android.os.Bundle)
      (r16v21 android.os.Bundle)
     binds: [B:58:0x0204, B:54:0x01e6, B:44:0x0170, B:18:0x006f, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m35620() {
        int iM11306;
        int i;
        int i2;
        Bundle bundleRequireArguments;
        int i3 = C0629.f2722;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = (C19806.m45029("ܳܶ") ^ i4) * (-101);
        int i5 = ((iM45029 ^ i3) * (-29203)) ^ (-1680342762);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-475857801);
        Bundle bundle = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1857853366;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 29439) >> 31));
            switch (i13) {
                case -2128541174:
                case 1726081406:
                    bundle = bundle;
                    i9 = 142157929;
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܺ") ^ i3) * (-57);
                        i = ((iM11306 ^ i4) * (-19235)) ^ (-1822463378);
                        i2 = -159209361;
                    } else {
                        iM11306 = (C19806.m45029("᩹᩸") + i4) * (-17);
                        i = ((iM11306 ^ i3) * (-15135)) ^ (-462998942);
                        i2 = 2003180458;
                    }
                    Bundle bundle2 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle2;
                    break;
                case -1860230878:
                case -690022705:
                    String strM6902 = C2249.m6902(bundle, RunnableC0195.m1429(sArr2, i11, i12, i10));
                    C3286.m9779(strM6902);
                    return strM6902;
                case -1852294534:
                case -1230324882:
                    i10 = 51742;
                    iM11306 = C19806.m45029("ۨۤ") ^ i3;
                    i = ((iM11306 ^ i4) * (-26133)) ^ 1560056354;
                    i2 = 2103819551;
                    Bundle bundle3 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle3;
                    break;
                case -1738367944:
                case -190457674:
                    bundle = bundle;
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (C19806.m45029("᩹᩸") + i4) * (-17);
                        i = ((iM11306 ^ i3) * (-15135)) ^ (-462998942);
                        i2 = 2003180458;
                    } else {
                        iM11306 = C19806.m45029("ܶᩴ") ^ i3;
                        i = ((iM11306 ^ i4) * 5783) ^ 1994595265;
                        i2 = 992970928;
                    }
                    Bundle bundle4 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle4;
                    break;
                case -1703464661:
                case 850210181:
                    bundle = bundle;
                    sArr = f48659;
                    if (C2704.f10408) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۘۨ")) * (-33);
                        i = ((iM11306 ^ i3) * (-2717)) ^ (-77972204);
                        i2 = 430328574;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۖ") ^ i3;
                        i = ((iM11306 ^ i4) * 10975) ^ 872705436;
                        i2 = -774029508;
                    }
                    Bundle bundle5 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle5;
                    break;
                case -1516982327:
                case -1028508790:
                    ThreadFactoryC3888.m11300();
                    if (C3743.f13569) {
                        bundle = bundle;
                        iM11306 = (C19806.m45029("᩹᩸") + i4) * (-17);
                        i = ((iM11306 ^ i3) * (-15135)) ^ (-462998942);
                        i2 = 2003180458;
                        Bundle bundle6 = bundle;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        bundle = bundle6;
                    }
                    bundle = bundle;
                    iM11306 = ThreadFactoryC3888.m11306("۫ܿ") ^ i4;
                    i = ((iM11306 ^ i3) * (-13875)) ^ (-1122705250);
                    i2 = -1337097898;
                    Bundle bundle7 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle7;
                    break;
                case -938485350:
                case 1534700055:
                    C3743.m10966();
                    if (C1066.f4915 <= 0) {
                        bundle = bundle;
                        iM11306 = ThreadFactoryC3888.m11306("۫ܿ") ^ i4;
                        i = ((iM11306 ^ i3) * (-13875)) ^ (-1122705250);
                        i2 = -1337097898;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ᩴ") + i3) * (-39);
                        bundle = bundle;
                        i = ((iM11306 ^ i4) * (-13715)) ^ 915476235;
                        i2 = -357346020;
                    }
                    Bundle bundle8 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle8;
                    break;
                case -910664333:
                case 1914642635:
                    i10 = 62948;
                    iM11306 = C19806.m45029("ۨۤ") ^ i3;
                    i = ((iM11306 ^ i4) * (-26133)) ^ 1560056354;
                    i2 = 2103819551;
                    Bundle bundle9 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle9;
                    break;
                case -701772224:
                case 1846194471:
                    bundleRequireArguments = requireArguments();
                    sArr2 = f48659;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵֨") + i4) * 31;
                        bundle = bundleRequireArguments;
                        i = ((iM11306 ^ i3) * (-13399)) ^ 547830223;
                        i2 = 618466209;
                    } else {
                        iM11306 = (C19806.m45029("۟ۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        bundle = bundleRequireArguments;
                        i = ((iM11306 ^ i4) * (-4089)) ^ (-1143480092);
                        i2 = -912510564;
                    }
                    Bundle bundle10 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle10;
                    break;
                case -688548568:
                case 348377817:
                    i11 = 148;
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ᩴ") + i3) * (-39);
                        bundle = bundle;
                        i = ((iM11306 ^ i4) * (-13715)) ^ 915476235;
                        i2 = -357346020;
                    } else {
                        bundle = bundle;
                        iM11306 = (C19806.m45029("۟ᩳ") + i4) * 119;
                        i = ((iM11306 ^ i3) * 16125) ^ (-1577119340);
                        i2 = -597260964;
                    }
                    Bundle bundle11 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle11;
                    break;
                case -581845104:
                case 290408789:
                    C0629.m2907();
                    C0278.m1789();
                    return null;
                case -473602514:
                case -335531644:
                    if (C2124.f7782 > 0) {
                        bundle = bundle;
                        iM11306 = ThreadFactoryC3888.m11306("ۤۖ") ^ i3;
                        i = ((iM11306 ^ i4) * 10975) ^ 872705436;
                        i2 = -774029508;
                        Bundle bundle12 = bundle;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        bundle = bundle12;
                    }
                    bundle = bundle;
                    iM11306 = ThreadFactoryC3888.m11306("۫ܿ") ^ i4;
                    i = ((iM11306 ^ i3) * (-13875)) ^ (-1122705250);
                    i2 = -1337097898;
                    Bundle bundle13 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle13;
                    break;
                case -16683168:
                case 675324298:
                    bundle = bundle;
                    c = 147;
                    if (C3286.m9798() <= 0) {
                        iM11306 = (C19806.m45029("᩹᩸") + i4) * (-17);
                        i = ((iM11306 ^ i3) * (-15135)) ^ (-462998942);
                        i2 = 2003180458;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۛ") ^ i4;
                        i = ((iM11306 ^ i3) * (-2199)) ^ 2109008412;
                        i2 = -619412666;
                    }
                    Bundle bundle14 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle14;
                    break;
                case 67232673:
                case 1715672672:
                    if (AbstractC0464.f2088 <= 0) {
                        bundle = bundle;
                        i12 = 9;
                        iM11306 = ThreadFactoryC3888.m11306("ۤۖ") ^ i3;
                        i = ((iM11306 ^ i4) * 10975) ^ 872705436;
                        i2 = -774029508;
                        Bundle bundle15 = bundle;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        bundle = bundle15;
                    } else {
                        int iM450210 = C19806.m45029("ۡܿ") ^ i3;
                        i6 = iM450210 ^ (-2106577512);
                        i5 = ((iM450210 ^ i4) * (-32081)) ^ 33525262;
                        i12 = 9;
                    }
                    break;
                case 431576086:
                case 1522402624:
                    bundle = bundle;
                    if (i7 - (i8 + i9) <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۨ") ^ i4) * 69;
                        i = ((iM11306 ^ i3) * (-7181)) ^ (-1854585591);
                        i2 = -1393958788;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۡ") ^ i4) * (-97);
                        i = ((iM11306 ^ i3) * (-32463)) ^ (-689979425);
                        i2 = 1872235013;
                    }
                    Bundle bundle16 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle16;
                    break;
                case 661731975:
                case 1666518404:
                    bundle = bundle;
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܿ") ^ i4;
                        i = ((iM11306 ^ i3) * (-13875)) ^ (-1122705250);
                        i2 = -1337097898;
                    } else {
                        iM11306 = C19806.m45029("ۙۚ") ^ i3;
                        i = ((iM11306 ^ i4) * (-28863)) ^ 1335215196;
                        i2 = -1962043427;
                    }
                    Bundle bundle17 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle17;
                    break;
                case 969037408:
                case 1786815820:
                    C2871.m8646();
                    bundle = bundle;
                    iM11306 = ThreadFactoryC3888.m11306("۫ܿ") ^ i4;
                    i = ((iM11306 ^ i3) * (-13875)) ^ (-1122705250);
                    i2 = -1337097898;
                    Bundle bundle18 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle18;
                    break;
                case 1601918366:
                case 2048281090:
                    bundle = bundle;
                    s = sArr[c];
                    s2 = 23846;
                    if (C1377.f5749) {
                        iM11306 = (C19806.m45029("ܿۙ") ^ i4) * 19;
                        i = ((iM11306 ^ i3) * 24803) ^ (-27010051);
                        i2 = -1295366558;
                    } else {
                        bundleRequireArguments = bundle;
                        iM11306 = (ThreadFactoryC3888.m11306("᩵֨") + i4) * 31;
                        bundle = bundleRequireArguments;
                        i = ((iM11306 ^ i3) * (-13399)) ^ 547830223;
                        i2 = 618466209;
                    }
                    Bundle bundle19 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle19;
                    break;
                default:
                    bundle = bundle;
                    i7 = s * s2;
                    i8 = s * s;
                    if (C0216.m1591() <= 0) {
                        iM11306 = (C19806.m45029("᩹᩸") + i4) * (-17);
                        i = ((iM11306 ^ i3) * (-15135)) ^ (-462998942);
                        i2 = 2003180458;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡᩹") ^ i3) * (-25);
                        i = ((iM11306 ^ i4) * (-5145)) ^ 1020425681;
                        i2 = 2093435738;
                    }
                    Bundle bundle110 = bundle;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    bundle = bundle110;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C11697 m35612(C14895 c14895) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM11306;
        int i6;
        int i7;
        C0118 c0118;
        String str;
        int iM11307;
        int i8;
        int i9;
        String str2;
        int iM45029;
        int i10;
        int i11;
        int iM11308;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = -365207174;
        int i21 = C1461.f5957;
        int i22 = C2477.f9839;
        int iM11309 = (i21 - ThreadFactoryC3888.m11306("ܽۡ")) * (-31);
        int i23 = ((iM11309 ^ i22) * 19827) ^ (-1196322732);
        int i24 = iM11309 ^ (-1075727933);
        Bundle bundleRequireArguments = null;
        String strM10776 = null;
        String strM4832 = null;
        String strM8164 = null;
        int[] iArrM1176 = null;
        C11697 c11697 = null;
        short[] sArr = null;
        int i25 = 0;
        int iLastIndexOf = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        ActivityC5677 activityC5677 = null;
        int i30 = 0;
        int i31 = 0;
        char c = 0;
        short s = 0;
        int i32 = 0;
        int i33 = 0;
        short s2 = 0;
        int iM9878 = 0;
        int i34 = 0;
        C0118 c0118M1165 = null;
        String strM9715 = null;
        String strM8165 = null;
        String strM35620 = null;
        String strM15668 = null;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i22) * 12823) >> 31));
            switch (i20) {
                case -2116441799:
                case -956772858:
                    i = i35;
                    i15 = iM9878;
                    i16 = i36;
                    i17 = i34;
                    strM4832 = C1377.m4832(f48659, 15, 25, i17);
                    if (i15 != -1) {
                        int iM113010 = ThreadFactoryC3888.m11306("᩶᩷") ^ i22;
                        iM9878 = i15;
                        i23 = ((iM113010 ^ i21) * (-29089)) ^ (-1354768333);
                        i34 = i17;
                        i36 = i16;
                        i35 = i;
                        i30 = -1;
                        i24 = iM113010 ^ 874928610;
                    } else {
                        i18 = -1;
                        int iM113011 = (ThreadFactoryC3888.m11306("۬֡") ^ i21) * (-69);
                        int i37 = ((iM113011 ^ i22) * 7521) ^ (-1208463768);
                        i14 = iM113011 ^ (-1442138662);
                        i34 = i17;
                        i36 = i16;
                        i30 = i18;
                        iM9878 = i15;
                        i23 = i37;
                        i19 = i;
                        i24 = i14;
                        i35 = i19;
                    }
                    break;
                case -2105314786:
                case 803220081:
                    if (C1066.f4915 > 0) {
                        i = i35;
                        i2 = i30;
                        i3 = iM9878;
                        i4 = i36;
                        i5 = i34;
                        int iM450210 = (C19806.m45029("᩷ۡ") ^ i22) * (-71);
                        iM9878 = i3;
                        i23 = ((iM450210 ^ i21) * (-9025)) ^ 1331855942;
                        i14 = iM450210 ^ 1050786651;
                        i34 = i5;
                        i36 = i4;
                        i30 = i2;
                        i19 = i;
                        i24 = i14;
                        i35 = i19;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۗ") ^ i21) * (-7);
                        i6 = ((iM11306 ^ i22) * (-32395)) ^ (-1226941526);
                        i7 = -1877557802;
                        i24 = iM11306 ^ i7;
                        i23 = i6;
                    }
                    break;
                case -2038397112:
                case 1721247708:
                    throw new Exception(C3577.m10567(strM4832, strM10776));
                case -2004117199:
                case -357904386:
                    C0050.m946();
                    i = i35;
                    c0118 = c0118M1165;
                    str2 = strM35620;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    iM45029 = (ThreadFactoryC3888.m11306("ܺܶ") + i21) * (-75);
                    i10 = ((iM45029 ^ i22) * (-9093)) ^ 1175337510;
                    i11 = -1039274570;
                    int i38 = iM45029 ^ i11;
                    strM35620 = str2;
                    i34 = i5;
                    i36 = i4;
                    i35 = i;
                    i24 = i38;
                    i23 = i10;
                    i30 = i2;
                    c0118M1165 = c0118;
                    break;
                case -1936723017:
                case 1460448329:
                    i27 = 0;
                    int i39 = iM9878;
                    strM8164 = C2642.m8164(strM10776, 0, i39);
                    i28 = 1;
                    i29 = i39 + 1;
                    if (C0671.f2816 != 0) {
                        iM9878 = i39;
                        i = i35;
                        c0118 = c0118M1165;
                        str2 = strM35620;
                        i2 = i30;
                        i4 = i36;
                        i5 = i34;
                        iM45029 = ThreadFactoryC3888.m11306("۠ۤ") ^ i21;
                        i10 = ((iM45029 ^ i22) * 20847) ^ 2014400195;
                        i11 = -1090552799;
                        int i310 = iM45029 ^ i11;
                        strM35620 = str2;
                        i34 = i5;
                        i36 = i4;
                        i35 = i;
                        i24 = i310;
                        i23 = i10;
                        i30 = i2;
                        c0118M1165 = c0118;
                    } else {
                        int iM450211 = C19806.m45029("۬ᩴ") ^ i22;
                        iM9878 = i39;
                        i24 = iM450211 ^ 1480562414;
                        i23 = ((iM450211 ^ i21) * (-29029)) ^ 1024607452;
                        i27 = 0;
                    }
                    break;
                case -1791383329:
                case 2106015309:
                    c11697.m29211();
                    c11697.m29210();
                    return c11697;
                case -1781239424:
                case -1496753746:
                    throw new Exception(C3577.m10567(strM4832, strM10776));
                case -1757976117:
                case -197641284:
                    i = i35;
                    c0118 = c0118M1165;
                    str = strM35620;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    sArr = f48659;
                    c = '\b';
                    if (C1668.f6641 < 0) {
                        strM35620 = str;
                        iM11307 = ThreadFactoryC3888.m11306("۠᩹") ^ i21;
                        i8 = ((iM11307 ^ i22) * 21119) ^ (-263857508);
                        i9 = 1928033500;
                        i13 = iM11307 ^ i9;
                        i34 = i5;
                        i36 = i4;
                        c0118M1165 = c0118;
                        i30 = i2;
                        i19 = i;
                        i24 = i13;
                        i23 = i8;
                        i35 = i19;
                    } else {
                        c0118M1165 = c0118;
                        iM11308 = (C19806.m45029("᩺۬") ^ i22) * 41;
                        strM35620 = str;
                        i8 = ((iM11308 ^ i21) * 10227) ^ 1303615138;
                        i12 = 312548418;
                        i13 = iM11308 ^ i12;
                        i34 = i5;
                        i36 = i4;
                        i30 = i2;
                        i19 = i;
                        i24 = i13;
                        i23 = i8;
                        i35 = i19;
                    }
                    break;
                case -1687623226:
                case -804850455:
                    i = i35;
                    c0118 = c0118M1165;
                    ActivityC5677 activityC5678 = activityC5677;
                    str2 = strM35620;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    strM15668 = activityC5678.m15668(str2);
                    if (C3286.m9798() <= 0) {
                        activityC5677 = activityC5678;
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܶ") + i21) * (-75);
                        i10 = ((iM45029 ^ i22) * (-9093)) ^ 1175337510;
                        i11 = -1039274570;
                        int i311 = iM45029 ^ i11;
                        strM35620 = str2;
                        i34 = i5;
                        i36 = i4;
                        i35 = i;
                        i24 = i311;
                        i23 = i10;
                    } else {
                        int iM450212 = C19806.m45029("֨ܳ") ^ i21;
                        activityC5677 = activityC5678;
                        i23 = ((iM450212 ^ i22) * 1709) ^ 26242292;
                        strM35620 = str2;
                        i34 = i5;
                        i36 = i4;
                        i35 = i;
                        i24 = iM450212 ^ 854864481;
                    }
                    i30 = i2;
                    c0118M1165 = c0118;
                    break;
                case -1615131358:
                case -1366655187:
                    i25++;
                    i26 = i31;
                    iM11306 = C19806.m45029("ۛܳ") ^ i22;
                    i6 = ((iM11306 ^ i21) * 30893) ^ (-1243522950);
                    i7 = 861919029;
                    i24 = iM11306 ^ i7;
                    i23 = i6;
                    break;
                case -1515389040:
                case 1518077890:
                    i = i35;
                    String str3 = strM9715;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    strM10776 = C3660.m10776(bundleRequireArguments, str3);
                    iM9878 = ViewTreeObserverOnPreDrawListenerC3327.m9878(strM10776, 40);
                    if (C1460.f5948 < 0) {
                        iM11308 = (i21 - C19806.m45029("۬۠")) * (-3);
                        strM9715 = str3;
                        i8 = ((iM11308 ^ i22) * (-21327)) ^ 558862363;
                        i12 = 159787984;
                        i13 = iM11308 ^ i12;
                        i34 = i5;
                        i36 = i4;
                        i30 = i2;
                        i19 = i;
                        i24 = i13;
                        i23 = i8;
                        i35 = i19;
                    } else {
                        strM9715 = str3;
                        c0118 = c0118M1165;
                        str2 = strM35620;
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܶ") + i21) * (-75);
                        i10 = ((iM45029 ^ i22) * (-9093)) ^ 1175337510;
                        i11 = -1039274570;
                        int i312 = iM45029 ^ i11;
                        strM35620 = str2;
                        i34 = i5;
                        i36 = i4;
                        i35 = i;
                        i24 = i312;
                        i23 = i10;
                        i30 = i2;
                        c0118M1165 = c0118;
                    }
                    break;
                case -1329072020:
                case -58294924:
                    i34 = 9393;
                    int iM113012 = (i22 - ThreadFactoryC3888.m11306("֡ۡ")) * 15;
                    strM35620 = strM35620;
                    i35 = i35;
                    c0118M1165 = c0118M1165;
                    i24 = iM113012 ^ 657323240;
                    i23 = ((iM113012 ^ i21) * 31815) ^ (-1551597180);
                    i36 = i36;
                    i30 = i30;
                    break;
                case -1325036516:
                case -669065443:
                    C1148.m4232();
                    C2332.m7079();
                    return null;
                case -1241959494:
                case 2056578793:
                    i = i35;
                    c0118 = c0118M1165;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    activityC5677 = (ActivityC5677) AbstractC0464.m2305(c14895);
                    strM35620 = c14895.m35620();
                    if (CallableC1627.f6528) {
                        iM11307 = C19806.m45029("ۧ۠") ^ i22;
                        i8 = ((iM11307 ^ i21) * (-1309)) ^ (-1900675821);
                        i9 = -1606996258;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩸᩸") ^ i22;
                        i8 = ((iM11307 ^ i21) * (-30917)) ^ 327948582;
                        i9 = 1605645902;
                    }
                    i13 = iM11307 ^ i9;
                    i34 = i5;
                    i36 = i4;
                    c0118M1165 = c0118;
                    i30 = i2;
                    i19 = i;
                    i24 = i13;
                    i23 = i8;
                    i35 = i19;
                    break;
                case -1219207500:
                case 1482468422:
                    i = i35;
                    c0118 = c0118M1165;
                    str2 = strM35620;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    if (i33 - (s * s2) < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ֡") ^ i21;
                        i10 = ((iM45029 ^ i22) * (-27569)) ^ (-289591941);
                        i11 = -1528587721;
                    } else {
                        iM45029 = C19806.m45029("ۜۤ") ^ i21;
                        i10 = ((iM45029 ^ i22) * (-9921)) ^ (-1268845910);
                        i11 = 1448590187;
                    }
                    int i313 = iM45029 ^ i11;
                    strM35620 = str2;
                    i34 = i5;
                    i36 = i4;
                    i35 = i;
                    i24 = i313;
                    i23 = i10;
                    i30 = i2;
                    c0118M1165 = c0118;
                    break;
                case -1134585837:
                case 672030984:
                    iArrM1176 = c0118M1165.m1176(strM8164, C3743.m10952(strM10776, i29, iLastIndexOf), C0050.m931(strM10776, iLastIndexOf + i28));
                    if (iArrM1176 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۗ") ^ i22;
                        i6 = ((iM11306 ^ i21) * 6051) ^ 1877308643;
                        i7 = -1180275119;
                    } else {
                        iM11306 = C19806.m45029("᩹ܺ") ^ i21;
                        i6 = ((iM11306 ^ i22) * (-14055)) ^ 205993186;
                        i7 = -22061076;
                    }
                    i24 = iM11306 ^ i7;
                    i23 = i6;
                    break;
                case -1038897040:
                case 1599363997:
                    strM8165 = C2642.m8164(strM15668, i35, i36);
                    i25 = i27;
                    i26 = i28;
                    iM11306 = C19806.m45029("ۛܳ") ^ i22;
                    i6 = ((iM11306 ^ i21) * 30893) ^ (-1243522950);
                    i7 = 861919029;
                    i24 = iM11306 ^ i7;
                    i23 = i6;
                    break;
                case -1029622452:
                case 1352813921:
                    i = i35;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    c0118 = c0118M1165;
                    strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(f48659, 9, 6, i5);
                    if (C2788.m8472() == 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰۚ") ^ i21) * (-5);
                        i8 = ((iM11307 ^ i22) * 11705) ^ (-1148279225);
                        i9 = -475121597;
                        i13 = iM11307 ^ i9;
                        i34 = i5;
                        i36 = i4;
                        c0118M1165 = c0118;
                        i30 = i2;
                        i19 = i;
                        i24 = i13;
                        i23 = i8;
                        i35 = i19;
                    } else {
                        str2 = strM35620;
                        iM45029 = ThreadFactoryC3888.m11306("۠ۤ") ^ i21;
                        i10 = ((iM45029 ^ i22) * 20847) ^ 2014400195;
                        i11 = -1090552799;
                        int i314 = iM45029 ^ i11;
                        strM35620 = str2;
                        i34 = i5;
                        i36 = i4;
                        i35 = i;
                        i24 = i314;
                        i23 = i10;
                        i30 = i2;
                        c0118M1165 = c0118;
                    }
                    break;
                case -967143141:
                case 1304883966:
                    if (C2871.m8652(strM15668, i25) == '\n') {
                        iM11306 = C19806.m45029("ۘܳ") ^ i22;
                        i6 = ((iM11306 ^ i21) * (-16209)) ^ 73862335;
                        i7 = 369999207;
                    } else {
                        i31 = i26;
                        iM11306 = (i21 - C19806.m45029("ۨܿ")) * (-11);
                        i6 = ((iM11306 ^ i22) * 26077) ^ 1031119045;
                        i7 = -1407921762;
                    }
                    i24 = iM11306 ^ i7;
                    i23 = i6;
                    break;
                case -948587806:
                case -426074746:
                    if (C1875.f7103 >= 0) {
                        i = i35;
                        c0118 = c0118M1165;
                        i2 = i30;
                        i4 = i36;
                        i5 = i34;
                        iM11307 = ThreadFactoryC3888.m11306("᩸᩸") ^ i22;
                        i8 = ((iM11307 ^ i21) * (-30917)) ^ 327948582;
                        i9 = 1605645902;
                        i13 = iM11307 ^ i9;
                        i34 = i5;
                        i36 = i4;
                        c0118M1165 = c0118;
                        i30 = i2;
                        i19 = i;
                        i24 = i13;
                        i23 = i8;
                        i35 = i19;
                    } else {
                        iM11306 = (i21 - ThreadFactoryC3888.m11306("ۘ۟")) * 87;
                        i6 = ((iM11306 ^ i22) * 22647) ^ (-1244006487);
                        i7 = -2002849510;
                        i24 = iM11306 ^ i7;
                        i23 = i6;
                    }
                    break;
                case -913026301:
                case 638216083:
                    i35 = iArrM1176[i27];
                    i36 = iArrM1176[i28];
                    if (i36 <= i35) {
                        iM11306 = (i21 - ThreadFactoryC3888.m11306("ܰۤ")) * 31;
                        i6 = ((iM11306 ^ i22) * (-22037)) ^ (-78981505);
                        i7 = 1269923615;
                    } else {
                        iM11306 = C19806.m45029("ܿۖ") ^ i21;
                        i6 = ((iM11306 ^ i22) * (-5983)) ^ (-167838825);
                        i7 = -1703515484;
                    }
                    i24 = iM11306 ^ i7;
                    i23 = i6;
                    break;
                case -903541191:
                case 797343648:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i21 - ThreadFactoryC3888.m11306("ۘ۟")) * 87;
                        i6 = ((iM11306 ^ i22) * 22647) ^ (-1244006487);
                        i7 = -2002849510;
                        i24 = iM11306 ^ i7;
                        i23 = i6;
                    } else {
                        i = i35;
                        i2 = i30;
                        i3 = iM9878;
                        i4 = i36;
                        i5 = i34;
                        int iM450213 = (C19806.m45029("᩷ۡ") ^ i22) * (-71);
                        iM9878 = i3;
                        i23 = ((iM450213 ^ i21) * (-9025)) ^ 1331855942;
                        i14 = iM450213 ^ 1050786651;
                        i34 = i5;
                        i36 = i4;
                        i30 = i2;
                        i19 = i;
                        i24 = i14;
                        i35 = i19;
                    }
                    break;
                case -592356129:
                case 412326272:
                    if (!C19806.m45024()) {
                        i = i35;
                        c0118 = c0118M1165;
                        str2 = strM35620;
                        i2 = i30;
                        i4 = i36;
                        i5 = i34;
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܶ") + i21) * (-75);
                        i10 = ((iM45029 ^ i22) * (-9093)) ^ 1175337510;
                        i11 = -1039274570;
                        int i315 = iM45029 ^ i11;
                        strM35620 = str2;
                        i34 = i5;
                        i36 = i4;
                        i35 = i;
                        i24 = i315;
                        i23 = i10;
                        i30 = i2;
                        c0118M1165 = c0118;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۗ") ^ i21) * (-7);
                        i6 = ((iM11306 ^ i22) * (-32395)) ^ (-1226941526);
                        i7 = -1877557802;
                        i24 = iM11306 ^ i7;
                        i23 = i6;
                    }
                    break;
                case -410814288:
                case 1520606292:
                    C11697 c11698 = new C11697(strM8165, i26);
                    if (C3286.m9789(c11698.f39321)) {
                        c11697 = c11698;
                        iM11306 = (i21 - ThreadFactoryC3888.m11306("ܰۤ")) * 31;
                        i6 = ((iM11306 ^ i22) * (-22037)) ^ (-78981505);
                        i7 = 1269923615;
                        i24 = iM11306 ^ i7;
                        i23 = i6;
                    } else {
                        int iM450214 = C19806.m45029("᩶᩸") ^ i21;
                        c11697 = c11698;
                        i23 = ((iM450214 ^ i22) * (-18639)) ^ 545861581;
                        i24 = iM450214 ^ (-849355842);
                    }
                    break;
                case -315115766:
                case 1142165965:
                    i30 = i30;
                    i15 = iM9878;
                    if (iLastIndexOf == i30) {
                        i = i35;
                        i16 = i36;
                        i18 = i30;
                        i17 = i34;
                        int iM113013 = (ThreadFactoryC3888.m11306("۬֡") ^ i21) * (-69);
                        int i316 = ((iM113013 ^ i22) * 7521) ^ (-1208463768);
                        i14 = iM113013 ^ (-1442138662);
                        i34 = i17;
                        i36 = i16;
                        i30 = i18;
                        iM9878 = i15;
                        i23 = i316;
                        i19 = i;
                        i24 = i14;
                        i35 = i19;
                    } else {
                        int iM450215 = (C19806.m45029("᩻ۚ") ^ i21) * (-99);
                        iM9878 = i15;
                        i23 = ((iM450215 ^ i22) * 3349) ^ 1916349716;
                        i35 = i35;
                        i24 = iM450215 ^ (-2021191835);
                        i30 = i30;
                    }
                    break;
                case -246099183:
                case 179700424:
                    i = i35;
                    c0118 = c0118M1165;
                    str2 = strM35620;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    i33 = i32 + 139499721;
                    s2 = 23622;
                    if (C0050.m946() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܶ") + i21) * (-75);
                        i10 = ((iM45029 ^ i22) * (-9093)) ^ 1175337510;
                        i11 = -1039274570;
                    } else {
                        iM45029 = (C19806.m45029("֡֫") ^ i22) * 19;
                        i10 = ((iM45029 ^ i21) * 25579) ^ (-2049205801);
                        i11 = -454813128;
                    }
                    int i317 = iM45029 ^ i11;
                    strM35620 = str2;
                    i34 = i5;
                    i36 = i4;
                    i35 = i;
                    i24 = i317;
                    i23 = i10;
                    i30 = i2;
                    c0118M1165 = c0118;
                    break;
                case -192282282:
                case 713991910:
                    i = i35;
                    c0118 = c0118M1165;
                    str2 = strM35620;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    s = sArr[c];
                    i32 = s * s;
                    if (C0278.m1789() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۤ") ^ i21;
                        i10 = ((iM45029 ^ i22) * 20847) ^ 2014400195;
                        i11 = -1090552799;
                    } else {
                        iM45029 = (C19806.m45029("᩸᩺") + i22) * (-99);
                        i10 = ((iM45029 ^ i21) * 23533) ^ 601595854;
                        i11 = -1854617864;
                    }
                    int i318 = iM45029 ^ i11;
                    strM35620 = str2;
                    i34 = i5;
                    i36 = i4;
                    i35 = i;
                    i24 = i318;
                    i23 = i10;
                    i30 = i2;
                    c0118M1165 = c0118;
                    break;
                case -62812280:
                case 1131285091:
                    if (i25 < i35) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۧ") ^ i22) * 31;
                        i6 = ((iM11306 ^ i21) * 22221) ^ 296316804;
                        i7 = -607335240;
                    } else {
                        iM11306 = (i22 - ThreadFactoryC3888.m11306("ۘۜ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM11306 ^ i21) * (-6071)) ^ 1133224689;
                        i7 = 60891774;
                    }
                    i24 = iM11306 ^ i7;
                    i23 = i6;
                    break;
                case -39962396:
                case -6825234:
                    return null;
                case -11209565:
                case 1580897589:
                    i = i35;
                    i2 = i30;
                    i3 = iM9878;
                    i4 = i36;
                    i5 = i34;
                    iLastIndexOf = strM10776.lastIndexOf(41);
                    if (C2704.m8255() > 0) {
                        iM9878 = i3;
                        iM11308 = (ThreadFactoryC3888.m11306("֫֨") + i22) * (-79);
                        i8 = ((iM11308 ^ i21) * (-6131)) ^ (-1028674521);
                        i12 = -1503778083;
                        i13 = iM11308 ^ i12;
                        i34 = i5;
                        i36 = i4;
                        i30 = i2;
                        i19 = i;
                        i24 = i13;
                        i23 = i8;
                        i35 = i19;
                    }
                    int iM450216 = (C19806.m45029("᩷ۡ") ^ i22) * (-71);
                    iM9878 = i3;
                    i23 = ((iM450216 ^ i21) * (-9025)) ^ 1331855942;
                    i14 = iM450216 ^ 1050786651;
                    i34 = i5;
                    i36 = i4;
                    i30 = i2;
                    i19 = i;
                    i24 = i14;
                    i35 = i19;
                    break;
                case 86008993:
                case 2001893094:
                    RunnableC1564.m5345();
                    if (C2642.f10294 > 0) {
                        i = i35;
                        str = strM35620;
                        i2 = i30;
                        i4 = i36;
                        i5 = i34;
                        iM11308 = (C19806.m45029("᩺۬") ^ i22) * 41;
                        strM35620 = str;
                        i8 = ((iM11308 ^ i21) * 10227) ^ 1303615138;
                        i12 = 312548418;
                        i13 = iM11308 ^ i12;
                        i34 = i5;
                        i36 = i4;
                        i30 = i2;
                        i19 = i;
                        i24 = i13;
                        i23 = i8;
                        i35 = i19;
                    } else {
                        i = i35;
                        c0118 = c0118M1165;
                        str2 = strM35620;
                        i2 = i30;
                        i4 = i36;
                        i5 = i34;
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܶ") + i21) * (-75);
                        i10 = ((iM45029 ^ i22) * (-9093)) ^ 1175337510;
                        i11 = -1039274570;
                        int i319 = iM45029 ^ i11;
                        strM35620 = str2;
                        i34 = i5;
                        i36 = i4;
                        i35 = i;
                        i24 = i319;
                        i23 = i10;
                        i30 = i2;
                        c0118M1165 = c0118;
                    }
                    break;
                case 238181696:
                case 1154081425:
                    i34 = 31636;
                    int iM113014 = (i22 - ThreadFactoryC3888.m11306("֡ۡ")) * 15;
                    strM35620 = strM35620;
                    i35 = i35;
                    c0118M1165 = c0118M1165;
                    i24 = iM113014 ^ 657323240;
                    i23 = ((iM113014 ^ i21) * 31815) ^ (-1551597180);
                    i36 = i36;
                    i30 = i30;
                    break;
                case 1467459443:
                case 1787935049:
                    i = i35;
                    i2 = i30;
                    i4 = i36;
                    i5 = i34;
                    c0118M1165 = C0118.m1165(strM15668);
                    bundleRequireArguments = c14895.requireArguments();
                    if (C1460.m5050() != 0) {
                        str = strM35620;
                        iM11308 = (C19806.m45029("᩺۬") ^ i22) * 41;
                        strM35620 = str;
                        i8 = ((iM11308 ^ i21) * 10227) ^ 1303615138;
                        i12 = 312548418;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۗܽ") ^ i22;
                        i8 = ((iM11308 ^ i21) * 27425) ^ 1050018374;
                        i12 = 546541769;
                    }
                    i13 = iM11308 ^ i12;
                    i34 = i5;
                    i36 = i4;
                    i30 = i2;
                    i19 = i;
                    i24 = i13;
                    i23 = i8;
                    i35 = i19;
                    break;
                default:
                    i31 = i26 + 1;
                    iM11306 = (i21 - C19806.m45029("ۨܿ")) * (-11);
                    i6 = ((iM11306 ^ i22) * 26077) ^ 1031119045;
                    i7 = -1407921762;
                    i24 = iM11306 ^ i7;
                    i23 = i6;
                    break;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14895() {
        boolean z = false;
        int i = 1525441272;
        int i2 = C3577.f13150;
        int i3 = C3722.f13525;
        short s = f48659[0];
        super(ThreadFactoryC3888.m11306(C1461.m5070(f48659, 1, 3, (s * 6082) - ((s * s) + 9247681) > 0 ? 37374 : 41679)) ^ 2124435460);
        int iM45029 = (C19806.m45029("ۡܽ") + i3) * (-107);
        int i4 = ((iM45029 ^ i2) * 3051) ^ 1518824317;
        int i5 = 901663135;
        while (true) {
            i = ((((i ^ i2) * 13121) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2132096845:
                case 1717356945:
                    z = true;
                    if (C3535.m10431() <= 0) {
                        iM45029 = C19806.m45029("ۙ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8309) ^ 1850340307;
                        i5 = 862679188;
                    } else {
                        iM45029 = C19806.m45029("ۧܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21013)) ^ (-1662827315);
                        i5 = 1174870481;
                    }
                    break;
                case -2038404468:
                case -1718954238:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("ۧܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20637) ^ 260420774;
                        i5 = -1390588654;
                    } else {
                        iM45029 = C19806.m45029("᩺ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15843) ^ (-252620555);
                        i5 = -1824616208;
                    }
                    break;
                case -2006734864:
                case 839112667:
                    C1668.m5583();
                    RunnableC1564.m5345();
                    iM45029 = C19806.m45029("ۢۜ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-24565)) ^ 1955865476;
                    i5 = -1090866905;
                    break;
                case -1943188330:
                case -849313565:
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24565)) ^ 1955865476;
                        i5 = -1090866905;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ܶ") + i3) * (-27);
                        i4 = ((iM45029 ^ i2) * (-6887)) ^ (-2068941746);
                        i5 = 1394037525;
                    }
                    break;
                case -1917442437:
                case 607596366:
                    C2332.m7079();
                    throw new RuntimeException();
                case -1701807103:
                case 1661653001:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ۙ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8309) ^ 1850340307;
                        i5 = 862679188;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2793) ^ 465605982;
                        i5 = 383989183;
                    }
                    break;
                case -1684610863:
                case -113998913:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24565)) ^ 1955865476;
                        i5 = -1090866905;
                    } else {
                        iM45029 = (C19806.m45029("ۖ۠") + i2) * (-21);
                        i4 = ((iM45029 ^ i3) * 28005) ^ 815156919;
                        i5 = -879233517;
                    }
                    break;
                case -1577645188:
                case 632173535:
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("ۙ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8309) ^ 1850340307;
                        i5 = 862679188;
                    } else {
                        iM45029 = C19806.m45029("ۧܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20637) ^ 260420774;
                        i5 = -1390588654;
                    }
                    break;
                case -1255321852:
                case 69965980:
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("ۨܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-8957)) ^ 727645686;
                        i5 = -2071338520;
                    } else {
                        iM45029 = C19806.m45029("᩻ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-10203)) ^ 1247121113;
                        i5 = -1091835095;
                    }
                    break;
                case -1237083006:
                case -1119754188:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24565)) ^ 1955865476;
                        i5 = -1090866905;
                    } else {
                        iM45029 = C19806.m45029("ܶܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10635) ^ 546086856;
                        i5 = -104369005;
                    }
                    break;
                case -982583711:
                case 169922903:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("ۨܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-8957)) ^ 727645686;
                        i5 = -2071338520;
                    } else {
                        iM45029 = C19806.m45029("֫ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3449) ^ (-1130859596);
                        i5 = 12801773;
                    }
                    break;
                case -590707023:
                case -98675006:
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("ۧܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20637) ^ 260420774;
                        i5 = -1390588654;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۜ") ^ i3) * (-13);
                        i4 = ((iM45029 ^ i2) * 28351) ^ (-1530000921);
                        i5 = -1381806826;
                    }
                    break;
                case 370515049:
                case 1789459004:
                    if (C1025.m3861() > 0) {
                        iM45029 = C19806.m45029("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24565)) ^ 1955865476;
                        i5 = -1090866905;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14373)) ^ 1505667522;
                        i5 = -1806359255;
                    }
                    break;
                case 633198506:
                case 637181034:
                    setHasOptionsMenu(z);
                    return;
                case 1327755848:
                case 1485546238:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24565)) ^ 1955865476;
                        i5 = -1090866905;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۙ") ^ i2) * 29;
                        i4 = ((iM45029 ^ i3) * 17043) ^ 1106638312;
                        i5 = -2092756761;
                    }
                    break;
                default:
                    C1461.m5080();
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ۧܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20637) ^ 260420774;
                        i5 = -1390588654;
                    } else {
                        iM45029 = C19806.m45029("ۢۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24565)) ^ 1955865476;
                        i5 = -1090866905;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35605(C14895 c14895, int i) {
        C13108 c13108 = null;
        int iM32411 = 0;
        int i2 = 0;
        C8500 c8500M22223 = null;
        ActivityC19126 activityC19126M5049 = null;
        ActivityC5677 activityC5677 = null;
        int i3 = -698970816;
        int i4 = C1977.f7413;
        int i5 = C0050.f912;
        int iM11306 = (ThreadFactoryC3888.m11306("ܰܳ") + i5) * (-31);
        int i6 = ((iM11306 ^ i4) * (-7775)) ^ 85348972;
        int i7 = 757291312;
        while (true) {
            i3 = ((((i3 ^ i4) * 5013) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -2039153608:
                case 1057036515:
                    activityC5677 = (ActivityC5677) activityC19126M5049;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") ^ i5) * 25;
                        i6 = ((iM11306 ^ i4) * 30957) ^ 1236844795;
                        i7 = 1700912903;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۨ") + i4) * (-53);
                        i6 = ((iM11306 ^ i5) * (-4471)) ^ (-844070686);
                        i7 = 866990296;
                    }
                    break;
                case -2034391136:
                case 1098259710:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۢۖ")) * (-57);
                        i6 = ((iM11306 ^ i4) * 6801) ^ (-65554085);
                        i7 = 1767222378;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩶") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-31221)) ^ (-243384083);
                        i7 = -50058035;
                    }
                    break;
                case -1830718883:
                case -553680718:
                    iM32411 = c13108.m32411(i);
                    i2 = 0;
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("᩹ܰ") ^ i5) * 65;
                        i6 = ((iM11306 ^ i4) * (-12455)) ^ 272726940;
                        i7 = 1072780284;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۤ") + i5) * 65;
                        i6 = ((iM11306 ^ i4) * 13359) ^ (-475871624);
                        i7 = 1320066095;
                    }
                    break;
                case -1824250547:
                case 1826652366:
                    if (C1875.f7103 >= 0) {
                        iM11306 = C19806.m45029("֫۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-16343)) ^ (-347205072);
                        i7 = 354679994;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۙ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 5387) ^ (-15398243);
                        i7 = 326327348;
                    }
                    break;
                case -1322386827:
                case 1885280524:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("ۨܳ") + i4) * 69;
                        i6 = ((iM11306 ^ i5) * 31405) ^ 506930034;
                        i7 = 1882072002;
                    } else {
                        iM11306 = (C19806.m45029("᩹ܰ") ^ i5) * 65;
                        i6 = ((iM11306 ^ i4) * (-12455)) ^ 272726940;
                        i7 = 1072780284;
                    }
                    break;
                case -342304234:
                case 1800744344:
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * 16307) ^ (-2070988297);
                        i7 = 99381014;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ܿ") + i5) * 91;
                        i6 = ((iM11306 ^ i4) * (-13535)) ^ 1668318990;
                        i7 = -2029073116;
                    }
                    break;
                case -311243437:
                case 907083494:
                    c13108 = c14895.f48660;
                    if (C1148.m4232() <= 0) {
                        iM11306 = C19806.m45029("֫۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-16343)) ^ (-347205072);
                        i7 = 354679994;
                    } else {
                        iM11306 = (C19806.m45029("ۛۙ") ^ i4) * 77;
                        i6 = ((iM11306 ^ i5) * (-30501)) ^ (-166164412);
                        i7 = 1969868576;
                    }
                    break;
                case -156538780:
                case 1768127688:
                    if (C3743.m10966() > 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۢۖ")) * (-57);
                        i6 = ((iM11306 ^ i4) * 6801) ^ (-65554085);
                        i7 = 1767222378;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * 16307) ^ (-2070988297);
                        i7 = 99381014;
                    }
                    break;
                case 54840945:
                case 923511998:
                    activityC5677.m15660(c14895.m35620(), c8500M22223);
                    break;
                case 206843855:
                case 423843753:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * 16307) ^ (-2070988297);
                        i7 = 99381014;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬۫") ^ i4;
                        i6 = ((iM11306 ^ i5) * 12839) ^ 718467357;
                        i7 = 1679146525;
                    }
                    break;
                case 359718309:
                case 1803107184:
                    C0216.m1591();
                    break;
                case 430324958:
                case 1743714013:
                    c8500M22223 = C8500.m22223(iM32411, i2);
                    activityC19126M5049 = C1460.m5049(c14895);
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") ^ i5) * 25;
                        i6 = ((iM11306 ^ i4) * 30957) ^ 1236844795;
                        i7 = 1700912903;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܳ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-11897)) ^ 1892839049;
                        i7 = -899850718;
                    }
                    break;
                case 448574067:
                case 1804679689:
                    if (C1377.f5749) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ۬") ^ i5) * 9;
                        i6 = ((iM11306 ^ i4) * (-14811)) ^ (-1040522923);
                        i7 = -1591569348;
                    } else {
                        iM11306 = (C19806.m45029("᩹ܰ") ^ i5) * 65;
                        i6 = ((iM11306 ^ i4) * (-12455)) ^ 272726940;
                        i7 = 1072780284;
                    }
                    break;
                case 892871600:
                case 1474895338:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C0050.m946();
                    iM11306 = (ThreadFactoryC3888.m11306("᩷֨") ^ i5) * 25;
                    i6 = ((iM11306 ^ i4) * 30957) ^ 1236844795;
                    i7 = 1700912903;
                    break;
                case 1151001625:
                case 1193727903:
                    C1461.m5080();
                    if (C1025.m3861() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * 16307) ^ (-2070988297);
                        i7 = 99381014;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") ^ i5) * 25;
                        i6 = ((iM11306 ^ i4) * 30957) ^ 1236844795;
                        i7 = 1700912903;
                    }
                    break;
                default:
                    if (!RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("֫۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-16343)) ^ (-347205072);
                        i7 = 354679994;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") ^ i5) * 25;
                        i6 = ((iM11306 ^ i4) * 30957) ^ 1236844795;
                        i7 = 1700912903;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܶ */
    public final String mo3620() {
        return mo3615();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01b4 A[PHI: r3
      0x01b4: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:45:0x01b2, B:18:0x00a3, B:15:0x0089, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x029b A[PHI: r7 r12 r13 r14 r20 r21 r26
      0x029b: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:66:0x0299, B:29:0x0107, B:25:0x00e2, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:66:0x0299, B:29:0x0107, B:25:0x00e2, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:66:0x0299, B:29:0x0107, B:25:0x00e2, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:66:0x0299, B:29:0x0107, B:25:0x00e2, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:66:0x0299, B:29:0x0107, B:25:0x00e2, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r21v4 int) = (r21v3 int), (r21v2 int), (r21v2 int), (r21v2 int) binds: [B:66:0x0299, B:29:0x0107, B:25:0x00e2, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r26v5 int) = (r26v4 int), (r26v3 int), (r26v3 int), (r26v3 int) binds: [B:66:0x0299, B:29:0x0107, B:25:0x00e2, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02d3 A[PHI: r18 r19
      0x02d3: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:70:0x02d1, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r19v4 short) = (r19v3 short), (r19v2 short) binds: [B:70:0x02d1, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0307 A[PHI: r2 r5 r6 r10 r11 r16 r17
      0x0307: PHI (r2v4 android.os.Bundle) = 
      (r2v2 android.os.Bundle)
      (r2v3 android.os.Bundle)
      (r2v2 android.os.Bundle)
      (r2v2 android.os.Bundle)
      (r2v2 android.os.Bundle)
      (r2v2 android.os.Bundle)
     binds: [B:74:0x0305, B:49:0x01ea, B:37:0x0151, B:33:0x012c, B:12:0x007e, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r5v4 java.lang.StringBuilder) = 
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v3 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
     binds: [B:74:0x0305, B:49:0x01ea, B:37:0x0151, B:33:0x012c, B:12:0x007e, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r6v4 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:74:0x0305, B:49:0x01ea, B:37:0x0151, B:33:0x012c, B:12:0x007e, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:74:0x0305, B:49:0x01ea, B:37:0x0151, B:33:0x012c, B:12:0x007e, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:74:0x0305, B:49:0x01ea, B:37:0x0151, B:33:0x012c, B:12:0x007e, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:74:0x0305, B:49:0x01ea, B:37:0x0151, B:33:0x012c, B:12:0x007e, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:74:0x0305, B:49:0x01ea, B:37:0x0151, B:33:0x012c, B:12:0x007e, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۘ */
    public final String mo3615() {
        int iM45029;
        int i;
        int i2;
        int iM9878;
        int i3 = C2124.f7782;
        int i4 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("ۨۜ") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-11111)) ^ (-250743905);
        String strM3859 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 155051243;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1740424403;
        int i14 = 0;
        String strM35620 = null;
        short[] sArr3 = null;
        int i15 = 0;
        StringBuilder sb = null;
        String strM10776 = null;
        String strM2906 = null;
        Bundle bundleRequireArguments = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-23811)) >> 31));
            switch (i13) {
                case -1993216858:
                case -1296356106:
                    this.f48661 = C13012.m32191(80, C2124.m6674(sb));
                    iM45029 = ThreadFactoryC3888.m11306("᩸֡") ^ i3;
                    i = ((iM45029 ^ i4) * 15333) ^ 244069503;
                    i2 = 1623683258;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1797153880:
                case -1529974140:
                    C7105.m18985();
                    return null;
                case -1786107875:
                case -914902107:
                    if (this.f48661 == null) {
                        iM45029 = (C19806.m45029("ۛᩳ") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM45029 ^ i3) * 22945) ^ (-1957697425);
                        i2 = 1373039515;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸֡") ^ i3;
                        i = ((iM45029 ^ i4) * 15333) ^ 244069503;
                        i2 = 1623683258;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1762994146:
                case 1501360546:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 24461) ^ 1230984623;
                        i2 = -974975375;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۙ") ^ i3;
                        i = ((iM45029 ^ i4) * 10069) ^ (-1342896029);
                        i2 = 1862375774;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1300727700:
                case 163350508:
                    C1937.m6279();
                    if (C2477.m7593() >= 0) {
                        iM45029 = C19806.m45029("᩷ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * 21657) ^ (-358853301);
                        i2 = 1088146544;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩸") ^ i4;
                        i = ((iM45029 ^ i3) * 10625) ^ 1368590506;
                        i2 = 1368122525;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1272787622:
                case -414799431:
                    C1148.m4223(sb, C22627.m50150(strM35620));
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("֫᩷") ^ i4;
                        i = ((iM45029 ^ i3) * 2239) ^ 165697012;
                        i2 = -1199108016;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 24461) ^ 1230984623;
                        i2 = -974975375;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1247958266:
                case -340524484:
                    C2788.m8472();
                    C7105.m18985();
                    iM45029 = C19806.m45029("᩷ۙ") ^ i4;
                    i = ((iM45029 ^ i3) * 21657) ^ (-358853301);
                    i2 = 1088146544;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1025995574:
                case 2144708446:
                    sb = new StringBuilder();
                    strM35620 = m35620();
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ֫") + i4) * (-37);
                        i = ((iM45029 ^ i3) * (-21699)) ^ (-296341505);
                        i2 = -1128410595;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 24461) ^ 1230984623;
                        i2 = -974975375;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -902240139:
                case 2056729281:
                    strM10776 = C3660.m10776(bundleRequireArguments, strM2906);
                    iM9878 = ViewTreeObserverOnPreDrawListenerC3327.m9878(strM10776, 40);
                    if (iM9878 == -1) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ֨")) * (-7);
                        i = ((iM45029 ^ i4) * (-2253)) ^ 1718942812;
                        i2 = -622055563;
                    } else {
                        i15 = iM9878;
                        iM45029 = ThreadFactoryC3888.m11306("۫֨") ^ i3;
                        i = ((iM45029 ^ i4) * 5635) ^ 1458337140;
                        i2 = 139394376;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -798695151:
                case 1553031114:
                    sArr2 = f48659;
                    i9 = 130;
                    i10 = 1;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = C19806.m45029("ۜۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-32709)) ^ (-636585225);
                        i2 = 1929152036;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗۧ")) * (-53);
                        i = ((iM45029 ^ i4) * (-11727)) ^ (-1182221709);
                        i2 = -761531514;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -752921325:
                case 1649622655:
                    i11 = s * s2;
                    i12 = s * s;
                    i14 = 337567129;
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = C19806.m45029("ۜۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-32709)) ^ (-636585225);
                        i2 = 1929152036;
                    } else {
                        iM45029 = (C19806.m45029("ܳۗ") ^ i4) * (-113);
                        i = ((iM45029 ^ i3) * (-21277)) ^ 1336323274;
                        i2 = 282138743;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -598443493:
                case 1483946235:
                    i7 = 20270;
                    iM45029 = ThreadFactoryC3888.m11306("᩻ܽ") ^ i3;
                    i = ((iM45029 ^ i4) * (-4357)) ^ (-150820515);
                    i2 = -1091630708;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -592616061:
                case 392154264:
                    return this.f48661;
                case -295608081:
                case 1325241395:
                    strM3859 = C1025.m3859(sArr2, i9, i10, i7);
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ۜۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-32709)) ^ (-636585225);
                        i2 = 1929152036;
                    } else {
                        iM45029 = (C19806.m45029("۫ۡ") + i3) * (-35);
                        i = ((iM45029 ^ i4) * 23057) ^ 1793101953;
                        i2 = 1126567659;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 14553967:
                case 1916306396:
                    i7 = 31459;
                    iM45029 = ThreadFactoryC3888.m11306("᩻ܽ") ^ i3;
                    i = ((iM45029 ^ i4) * (-4357)) ^ (-150820515);
                    i2 = -1091630708;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 72935103:
                case 1614399411:
                    iM9878 = C2871.m8641(strM10776);
                    i15 = iM9878;
                    iM45029 = ThreadFactoryC3888.m11306("۫֨") ^ i3;
                    i = ((iM45029 ^ i4) * 5635) ^ 1458337140;
                    i2 = 139394376;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 412796343:
                case 760834143:
                    if (C3722.f13525 > 0) {
                        iM45029 = C19806.m45029("᩷ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * 21657) ^ (-358853301);
                        i2 = 1088146544;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 24461) ^ 1230984623;
                        i2 = -974975375;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 735172444:
                case 1120724505:
                    if (i11 - (i12 + i14) <= 0) {
                        iM45029 = C19806.m45029("ܰۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 11203) ^ 1213870973;
                        i2 = 94625904;
                    } else {
                        iM45029 = (C19806.m45029("֡۬") + i4) * (-79);
                        i = ((iM45029 ^ i3) * 2211) ^ (-912806354);
                        i2 = -995624918;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 735402531:
                case 1236796255:
                    s = sArr3[c];
                    s2 = 36746;
                    if (C1875.m6086() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۙ") ^ i3;
                        i = ((iM45029 ^ i4) * 10069) ^ (-1342896029);
                        i2 = 1862375774;
                    } else {
                        iM45029 = (C19806.m45029("ۤۡ") + i3) * (-111);
                        i = ((iM45029 ^ i4) * 25889) ^ (-356943086);
                        i2 = -265416165;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1120054058:
                case 2124856852:
                    sArr3 = f48659;
                    c = '{';
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ۡ᩺") ^ i4;
                        i = ((iM45029 ^ i3) * (-11325)) ^ 284379760;
                        i2 = -1381078704;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 24461) ^ 1230984623;
                        i2 = -974975375;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1640141983:
                case 1877598525:
                    bundleRequireArguments = requireArguments();
                    sArr = f48659;
                    i8 = 124;
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 24461) ^ 1230984623;
                        i2 = -974975375;
                    } else {
                        iM45029 = (C19806.m45029("ۘۚ") + i4) * (-85);
                        i = ((iM45029 ^ i3) * 25437) ^ 1704866984;
                        i2 = 597947071;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1738477655:
                case 2110933896:
                    strM2906 = C0629.m2906(sArr, i8, 6, i7);
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = C19806.m45029("᩷ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * 21657) ^ (-358853301);
                        i2 = 1088146544;
                    } else {
                        iM45029 = C19806.m45029("ۢۨ") ^ i3;
                        i = ((iM45029 ^ i4) * 26095) ^ 176027873;
                        i2 = 218917004;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2788.m8480(sb, strM3859);
                    C2788.m8480(sb, C2642.m8164(strM10776, 0, i15));
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("᩵᩵") ^ i4) * (-79);
                        i = ((iM45029 ^ i3) * 4619) ^ (-1948609841);
                        i2 = 343390352;
                    } else {
                        iM45029 = C19806.m45029("ۜۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-32709)) ^ (-636585225);
                        i2 = 1929152036;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0188 A[PHI: r3 r5
      0x0188: PHI (r3v7 int) = (r3v2 int), (r3v6 int), (r3v2 int) binds: [B:43:0x0186, B:27:0x00de, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0188: PHI (r5v5 int) = (r5v4 int), (r5v2 int), (r5v2 int) binds: [B:43:0x0186, B:27:0x00de, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0213 A[PHI: r4 r6 r7 r11 r12 r15
      0x0213: PHI (r4v3 l.ᩳ᩻ۘ) = (r4v2 l.ᩳ᩻ۘ), (r4v2 l.ᩳ᩻ۘ), (r4v2 l.ᩳ᩻ۘ), (r4v4 l.ᩳ᩻ۘ) binds: [B:54:0x0211, B:35:0x012e, B:31:0x0104, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r6v5 int) = (r6v2 int), (r6v4 int), (r6v2 int), (r6v2 int) binds: [B:54:0x0211, B:35:0x012e, B:31:0x0104, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:54:0x0211, B:35:0x012e, B:31:0x0104, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:54:0x0211, B:35:0x012e, B:31:0x0104, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:54:0x0211, B:35:0x012e, B:31:0x0104, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:54:0x0211, B:35:0x012e, B:31:0x0104, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0247 A[PHI: r9 r10
      0x0247: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:58:0x0245, B:14:0x0063, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:58:0x0245, B:14:0x0063, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0279 A[PHI: r14 r20
      0x0279: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:62:0x0277, B:39:0x015a, B:12:0x005f, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:62:0x0277, B:39:0x015a, B:12:0x005f, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        int iM11306;
        int i;
        int i2;
        int i3 = C10634.f36300;
        int i4 = C1398.f5802;
        int iM45029 = C19806.m45029("ۧܶ") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-10035)) ^ 543369199;
        C18377 c18377 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-950083689);
        int iM11307 = 0;
        int iM450210 = 0;
        int iM450211 = 0;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 190910036;
        short[] sArr3 = null;
        int i11 = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i4) * (-11315)) >> 31));
            switch (i10) {
                case -1889163496:
                case 1204491768:
                    s = sArr[113];
                    s2 = 1;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (C19806.m45029("ۘۢ") ^ i4) * (-61);
                        i = ((iM11306 ^ i3) * (-13735)) ^ (-355211387);
                        i2 = 1235518491;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-19087)) ^ 1137739191;
                        i2 = -1759576595;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1866117467:
                case -228422850:
                    C19806.m45024();
                    C3722.m10894();
                    break;
                case -1844798711:
                case -379482344:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = (C19806.m45029("ۘۢ") ^ i4) * (-61);
                    i = ((iM11306 ^ i3) * (-13735)) ^ (-355211387);
                    i2 = 1235518491;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1547203278:
                case 815260592:
                    iM11307 = 2098418770 ^ ThreadFactoryC3888.m11306(C10634.m26821(sArr2, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i11));
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܿ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30843)) ^ 184663108;
                        i2 = 117469137;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i3;
                        i = ((iM11306 ^ i4) * (-31859)) ^ (-1689508976);
                        i2 = 390691149;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1524897878:
                case 593328397:
                    this.f48665 = C2642.m8167(view, iM450211 ^ i7);
                    sArr2 = f48659;
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ֫") ^ i4;
                        i = ((iM11306 ^ i3) * 20447) ^ (-1383602916);
                        i2 = -1999478405;
                    } else {
                        iM11306 = C19806.m45029("۬ۘ") ^ i4;
                        i = ((iM11306 ^ i3) * 2009) ^ 1045151206;
                        i2 = -1919369682;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1500686657:
                case 1657501363:
                    C1377.m4833();
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܿ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30843)) ^ 184663108;
                        i2 = 117469137;
                    } else {
                        iM11306 = C19806.m45029("ܳܳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-2727)) ^ (-1106758851);
                        i2 = -137874349;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1471321224:
                case 503777728:
                    C13108 c13108 = (C13108) C3743.m10957(view, iM11307);
                    this.f48660 = c13108;
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("ܳܳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-2727)) ^ (-1106758851);
                        i2 = -137874349;
                    } else {
                        c13108.m32415(new C13484(this));
                        this.f48662 = true;
                        c18377 = this.f48667;
                        if (C1419.f5860 >= 0) {
                            iM11306 = C19806.m45029("۬ۘ") ^ i4;
                            i = ((iM11306 ^ i3) * 2009) ^ 1045151206;
                            i2 = -1919369682;
                        } else {
                            iM11306 = (C19806.m45029("᩸ۡ") + i4) * (-111);
                            i = ((iM11306 ^ i3) * 6167) ^ 615744478;
                            i2 = 876875874;
                        }
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1408403491:
                case -71631059:
                    iM450211 = C19806.m45029(RunnableC0195.m1429(sArr3, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i11));
                    i7 = 2098736670;
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("۬ۘ") ^ i4;
                        i = ((iM11306 ^ i3) * 2009) ^ 1045151206;
                        i2 = -1919369682;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬ܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i4) * (-4919)) ^ (-2073588085);
                        i2 = 2142483099;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1140264546:
                case 802981553:
                    int i12 = s + s2;
                    i8 = i12 * i12;
                    i9 = s * 2;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = C19806.m45029("۬ۘ") ^ i4;
                        i = ((iM11306 ^ i3) * 2009) ^ 1045151206;
                        i2 = -1919369682;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i3;
                        i = ((iM11306 ^ i4) * (-6767)) ^ (-84402236);
                        i2 = -1678797725;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1102485223:
                case 2019229395:
                    sArr = f48659;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۢ") + i3) * (-19);
                        i = ((iM11306 ^ i4) * 25045) ^ 1984949590;
                        i2 = 1083870815;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶ۠")) * (-119);
                        i = ((iM11306 ^ i4) * (-13697)) ^ (-451124372);
                        i2 = -1166253423;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -750186438:
                case 619418248:
                    if (i8 - (i9 + 1) >= 0) {
                        iM11306 = C19806.m45029("ۢ֡") ^ i4;
                        i = ((iM11306 ^ i3) * 13369) ^ (-696460376);
                        i2 = -910988747;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i4;
                        i = ((iM11306 ^ i3) * 20289) ^ (-366363072);
                        i2 = 1794623007;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -589436978:
                case -566243723:
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("ۘۢ") ^ i4) * (-61);
                        i = ((iM11306 ^ i3) * (-13735)) ^ (-355211387);
                        i2 = 1235518491;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۢ") + i3) * (-19);
                        i = ((iM11306 ^ i4) * 25045) ^ 1984949590;
                        i2 = 1083870815;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -492403401:
                case 1533343998:
                    i11 = 64511;
                    iM11306 = C19806.m45029("۫۫") ^ i3;
                    i = ((iM11306 ^ i4) * 22247) ^ (-485334257);
                    i2 = -261464150;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -200765356:
                case 1332641441:
                    super.onViewCreated(view, bundle);
                    iM450210 = C19806.m45029(C2704.m8240(f48659, 114, 3, i11));
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܿ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30843)) ^ 184663108;
                        i2 = 117469137;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i4;
                        i = ((iM11306 ^ i3) * (-2571)) ^ (-1942146158);
                        i2 = 518758928;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -181364495:
                case 1680000164:
                    C1937.m6282(c18377.m42622(), getViewLifecycleOwner(), new InterfaceC10597() { // from class: l.ۨ֨ۜ
                        @Override // l.InterfaceC10597
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1473(Object obj) {
                            C14895.m35607(this.f38330, (C6094) obj);
                        }
                    });
                    break;
                case -79129932:
                case 1105313030:
                    i11 = 36179;
                    iM11306 = C19806.m45029("۫۫") ^ i3;
                    i = ((iM11306 ^ i4) * 22247) ^ (-485334257);
                    i2 = -261464150;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 905817347:
                case 1550600009:
                    this.f48668 = C2642.m8167(view, 2130326021 ^ iM450210);
                    sArr3 = f48659;
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۢ") + i3) * (-19);
                        i = ((iM11306 ^ i4) * 25045) ^ 1984949590;
                        i2 = 1083870815;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩷") ^ i3;
                        i = ((iM11306 ^ i4) * 22561) ^ 1450147017;
                        i2 = 319388473;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0817.m3399();
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۢ") + i3) * (-19);
                        i = ((iM11306 ^ i4) * 25045) ^ 1984949590;
                        i2 = 1083870815;
                    } else {
                        iM11306 = C19806.m45029("ܳܳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-2727)) ^ (-1106758851);
                        i2 = -137874349;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        boolean z = false;
        ActivityC5677 activityC5677 = null;
        C13108 c13108 = null;
        int i = -1080341681;
        int i2 = C3535.f13026;
        int i3 = C1025.f4800;
        int iM45029 = (C19806.m45029("۫ۛ") + i3) * (-37);
        int i4 = ((iM45029 ^ i2) * (-17043)) ^ (-399326727);
        int i5 = 557013120;
        while (true) {
            i = ((((i ^ i2) * 10877) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2050026906:
                case -110541414:
                    z = false;
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11503) ^ 1641315730;
                        i5 = 192828552;
                    } else {
                        iM45029 = C19806.m45029("ܰܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20251) ^ (-465464968);
                        i5 = -416185991;
                    }
                    break;
                case -1880031776:
                case -1670970930:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    break;
                case -1717057861:
                case -954368699:
                    activityC5677 = (ActivityC5677) C1460.m5049(this);
                    if (C19806.f63586) {
                        iM45029 = (C19806.m45029("᩵ۛ") + i3) * 67;
                        i4 = ((iM45029 ^ i2) * 1065) ^ 905091425;
                        i5 = -585530081;
                    } else {
                        iM45029 = C19806.m45029("ܿ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13649) ^ 820224483;
                        i5 = -2125719799;
                    }
                    break;
                case -1441409767:
                case -607348087:
                    C2642.m8171();
                    iM45029 = (C19806.m45029("۫ۙ") + i2) * 77;
                    i4 = ((iM45029 ^ i3) * 20289) ^ 952996008;
                    i5 = 1497651241;
                    break;
                case -1085957800:
                case 967063270:
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ۠") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i2) * 6495) ^ 857253057;
                        i5 = -1193880538;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11503) ^ 1641315730;
                        i5 = 192828552;
                    }
                    break;
                case -762920886:
                case 710313524:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("᩵ۛ") + i3) * 67;
                        i4 = ((iM45029 ^ i2) * 1065) ^ 905091425;
                        i5 = -585530081;
                    } else {
                        iM45029 = (C19806.m45029("ۗᩳ") ^ i2) * (-127);
                        i4 = ((iM45029 ^ i3) * (-19387)) ^ 1234579554;
                        i5 = -802014789;
                    }
                    break;
                case -385366874:
                case 1327525910:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("᩶ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32677) ^ (-862270348);
                        i5 = 693295091;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10021)) ^ (-542482480);
                        i5 = -1628210412;
                    }
                    break;
                case -149620475:
                case 1956181102:
                    super.onDestroyView();
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31895) ^ (-795311508);
                        i5 = -561918550;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28061) ^ (-261107500);
                        i5 = -85705703;
                    }
                    break;
                case -121499764:
                case 931173301:
                    this.f48662 = z;
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11503) ^ 1641315730;
                        i5 = 192828552;
                    } else {
                        iM45029 = C19806.m45029("ܳۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13385)) ^ (-85158140);
                        i5 = -968418142;
                    }
                    break;
                case 99585055:
                case 238083976:
                    C0526.m2437();
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10021)) ^ (-542482480);
                        i5 = -1628210412;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11503) ^ 1641315730;
                        i5 = 192828552;
                    }
                    break;
                case 571258825:
                case 1871514119:
                    this.f48665 = c13108;
                    this.f48660 = c13108;
                    break;
                case 778881486:
                case 1222053412:
                    this.f48668 = c13108;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("᩵ۛ") + i3) * 67;
                        i4 = ((iM45029 ^ i2) * 1065) ^ 905091425;
                        i5 = -585530081;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۜᩴ")) * 37;
                        i4 = ((iM45029 ^ i2) * 23445) ^ (-1824653294);
                        i5 = 1176033652;
                    }
                    break;
                case 1028674824:
                case 1991364812:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11503) ^ 1641315730;
                        i5 = 192828552;
                    } else {
                        iM45029 = (C19806.m45029("ۧ֨") ^ i2) * (-75);
                        i4 = ((iM45029 ^ i3) * (-6997)) ^ (-61073201);
                        i5 = 276127436;
                    }
                    break;
                case 1114767776:
                case 1925417313:
                    if (!C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31895) ^ (-795311508);
                        i5 = -561918550;
                    } else {
                        iM45029 = (C19806.m45029("۫ۙ") + i2) * 77;
                        i4 = ((iM45029 ^ i3) * 20289) ^ 952996008;
                        i5 = 1497651241;
                    }
                    break;
                case 1179168565:
                case 1375536522:
                    activityC5677.m31015();
                    c13108 = null;
                    if (C2788.m8472() != 0) {
                        iM45029 = (C19806.m45029("᩵ۛ") + i3) * 67;
                        i4 = ((iM45029 ^ i2) * 1065) ^ 905091425;
                        i5 = -585530081;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۢܰ")) * 115;
                        i4 = ((iM45029 ^ i3) * (-24851)) ^ 218321814;
                        i5 = 1501618183;
                    }
                    break;
                default:
                    if (!C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11503) ^ 1641315730;
                        i5 = 192828552;
                    } else {
                        iM45029 = (C19806.m45029("۫ۙ") + i2) * 77;
                        i4 = ((iM45029 ^ i3) * 20289) ^ 952996008;
                        i5 = 1497651241;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۙ */
    public final void mo19344(C18377 c18377) {
        c18377.m42626(m35620());
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01e0 A[PHI: r3 r16
      0x01e0: PHI (r3v4 short[]) = (r3v2 short[]), (r3v5 short[]) binds: [B:66:0x0283, B:50:0x01de] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r16v7 l.ۚ᩻ۘ) = (r16v3 l.ۚ᩻ۘ), (r16v8 l.ۚ᩻ۘ) binds: [B:66:0x0283, B:50:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0202 A[PHI: r11 r12 r16
      0x0202: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:54:0x0200, B:27:0x00d5, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:54:0x0200, B:27:0x00d5, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r16v29 l.ۚ᩻ۘ) = (r16v6 l.ۚ᩻ۘ), (r16v16 l.ۚ᩻ۘ), (r16v30 l.ۚ᩻ۘ) binds: [B:54:0x0200, B:27:0x00d5, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0287 A[PHI: r1 r3 r10
      0x0287: PHI (r1v61 l.ۚ᩻ۘ) = (r1v19 l.ۚ᩻ۘ), (r1v42 l.ۚ᩻ۘ), (r1v2 l.ۚ᩻ۘ), (r1v2 l.ۚ᩻ۘ) binds: [B:51:0x01e0, B:31:0x00fb, B:13:0x0064, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r3v6 short[]) = (r3v4 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:51:0x01e0, B:31:0x00fb, B:13:0x0064, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:51:0x01e0, B:31:0x00fb, B:13:0x0064, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02bb A[PHI: r6 r7 r8 r16
      0x02bb: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:71:0x02b9, B:58:0x0234, B:42:0x0181, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:71:0x02b9, B:58:0x0234, B:42:0x0181, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:71:0x02b9, B:58:0x0234, B:42:0x0181, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r16v23 l.ۚ᩻ۘ) = (r16v2 l.ۚ᩻ۘ), (r16v5 l.ۚ᩻ۘ), (r16v10 l.ۚ᩻ۘ), (r16v24 l.ۚ᩻ۘ) binds: [B:71:0x02b9, B:58:0x0234, B:42:0x0181, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC22654
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iM11306;
        int i;
        int i2;
        int i3 = C1189.f5284;
        int i4 = C1461.f5957;
        int iM45029 = (i3 - C19806.m45029("᩵ᩴ")) * 11;
        int i5 = ((iM45029 ^ i4) * (-17063)) ^ (-585614386);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-624598465);
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -823906821;
        View view = null;
        ActivityC5677 activityC5677 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-21263)) >> 31));
            switch (i13) {
                case -2026569532:
                case -81599548:
                    activityC5677 = (ActivityC5677) AbstractC0464.m2305(this);
                    sArr2 = f48659;
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("᩸۫") ^ i4;
                        activityC5677 = activityC5677;
                        i = ((iM11306 ^ i3) * 32339) ^ 210700147;
                        i2 = 1990486597;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۡ") ^ i4) * (-49);
                        activityC5677 = activityC5677;
                        i = ((iM11306 ^ i3) * (-4947)) ^ (-1392735663);
                        i2 = 29245995;
                    }
                    ActivityC5677 activityC5678 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC5678;
                    break;
                case -1962477506:
                case 873569656:
                    activityC5677 = activityC5677;
                    sArr = f48659;
                    if (C2788.m8472() != 0) {
                        activityC5677 = activityC5677;
                        iM11306 = C19806.m45029("᩸۫") ^ i4;
                        activityC5677 = activityC5677;
                        i = ((iM11306 ^ i3) * 32339) ^ 210700147;
                        i2 = 1990486597;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨֨")) * (-81);
                        i = ((iM11306 ^ i3) * 17273) ^ 1032559119;
                        i2 = -840988477;
                    }
                    ActivityC5677 activityC5679 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC5679;
                    break;
                case -1837646893:
                case 543783181:
                    activityC5677 = activityC5677;
                    int i14 = i8 + i9;
                    if ((i14 + i14) - i7 < 0) {
                        iM11306 = (i4 - C19806.m45029("᩻ۛ")) * 13;
                        i = ((iM11306 ^ i3) * (-25887)) ^ 635093542;
                        i2 = 1114268009;
                    } else {
                        iM11306 = (C19806.m45029("᩸᩸") ^ i3) * 33;
                        i = ((iM11306 ^ i4) * (-12063)) ^ 1339118411;
                        i2 = 229541973;
                    }
                    ActivityC5677 activityC56710 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56710;
                    break;
                case -1556456472:
                case 987083931:
                    activityC5677 = activityC5677;
                    int i15 = s + s2;
                    i7 = i15 * i15;
                    i8 = s * s;
                    i9 = 25281;
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("᩶ۖ") ^ i4) * 73;
                        i = ((iM11306 ^ i3) * 25071) ^ 1056823592;
                        i2 = 360620630;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܽ") ^ i3;
                        i = ((iM11306 ^ i4) * (-31985)) ^ 1978142958;
                        i2 = -953586603;
                    }
                    ActivityC5677 activityC56711 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56711;
                    break;
                case -1513027229:
                case -862445088:
                    View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
                    C1419.m4970(viewOnCreateView);
                    view = viewOnCreateView;
                    iM11306 = ThreadFactoryC3888.m11306("᩺ۚ") ^ i4;
                    i = ((iM11306 ^ i3) * (-7963)) ^ (-1265888589);
                    i2 = -1993423417;
                    ActivityC5677 activityC56712 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56712;
                    break;
                case -1501393761:
                case -480879496:
                    if (C1148.f5161 <= 0) {
                        activityC5677 = activityC5677;
                        iM11306 = (i4 - C19806.m45029("ܰܽ")) * (-91);
                        i = ((iM11306 ^ i3) * (-2743)) ^ 1571960605;
                        i2 = 699952091;
                        ActivityC5677 activityC56713 = activityC5677;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        activityC5677 = activityC56713;
                    }
                    activityC5677 = activityC5677;
                    iM11306 = ThreadFactoryC3888.m11306("ۛܽ") ^ i3;
                    i = ((iM11306 ^ i4) * (-31985)) ^ 1978142958;
                    i2 = -953586603;
                    ActivityC5677 activityC56714 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56714;
                    break;
                case -1475950131:
                case -783760444:
                    C2124.m6681(new RunnableC4310(0, this), 600L);
                    return view;
                case -1456573398:
                case 136379769:
                    activityC5677 = activityC5677;
                    if (C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܽ") ^ i3;
                        i = ((iM11306 ^ i4) * (-31985)) ^ 1978142958;
                        i2 = -953586603;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܶ") ^ i3) * (-79);
                        i = ((iM11306 ^ i4) * 26329) ^ 459526640;
                        i2 = 1786701400;
                    }
                    ActivityC5677 activityC56715 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56715;
                    break;
                case -1274003589:
                case 821172197:
                    activityC5677 = activityC5677;
                    if (C2477.f9839 <= 0) {
                        activityC5677 = activityC5677;
                        iM11306 = C19806.m45029("᩸۫") ^ i4;
                        activityC5677 = activityC5677;
                        i = ((iM11306 ^ i3) * 32339) ^ 210700147;
                        i2 = 1990486597;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܽ") + i4) * 45;
                        i = ((iM11306 ^ i3) * (-4879)) ^ (-1260761262);
                        i2 = -309246947;
                    }
                    ActivityC5677 activityC56716 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56716;
                    break;
                case -1145639566:
                case 981793708:
                    activityC5677 = activityC5677;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("ۢ۬") ^ i3;
                        i = ((iM11306 ^ i4) * (-26443)) ^ 1447126073;
                        i2 = 356113468;
                    } else {
                        iM11306 = (C19806.m45029("ۚܶ") ^ i3) * (-27);
                        i = ((iM11306 ^ i4) * 22813) ^ 1020278108;
                        i2 = 478293945;
                    }
                    ActivityC5677 activityC56717 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56717;
                    break;
                case -1108560267:
                case -560646593:
                    RunnableC0195.m1431();
                    if (C2124.m6673() > 0) {
                        iM11306 = C19806.m45029("᩸۫") ^ i4;
                        activityC5677 = activityC5677;
                        i = ((iM11306 ^ i3) * 32339) ^ 210700147;
                        i2 = 1990486597;
                    } else {
                        activityC5677 = activityC5677;
                        iM11306 = ThreadFactoryC3888.m11306("ۛܽ") ^ i3;
                        i = ((iM11306 ^ i4) * (-31985)) ^ 1978142958;
                        i2 = -953586603;
                    }
                    ActivityC5677 activityC56718 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56718;
                    break;
                case -1069663573:
                case 90257831:
                    activityC5677 = activityC5677;
                    if (C3535.m10431() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܽ") ^ i3;
                        i = ((iM11306 ^ i4) * (-31985)) ^ 1978142958;
                        i2 = -953586603;
                    } else {
                        iM11306 = C19806.m45029("᩸۟") ^ i4;
                        i = ((iM11306 ^ i3) * (-7865)) ^ (-1426019795);
                        i2 = -472847434;
                    }
                    ActivityC5677 activityC56719 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC56719;
                    break;
                case -974173010:
                case 192355293:
                    activityC5677 = activityC5677;
                    s = sArr[50];
                    s2 = 159;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i3;
                        i = ((iM11306 ^ i4) * 2083) ^ (-573728764);
                        i2 = -691742339;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩻") + i3) * (-25);
                        i = ((iM11306 ^ i4) * 24277) ^ (-1936811219);
                        i2 = -1438983251;
                    }
                    ActivityC5677 activityC567110 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC567110;
                    break;
                case 26599957:
                case 980737136:
                    View viewM15651 = activityC5677.m15651(C19806.m45029(C1066.m4040(sArr2, i11, i12, i10)) ^ 2124629568);
                    if (viewM15651 == null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۡ") ^ i4) * 25;
                        activityC5677 = activityC5677;
                        i = ((iM11306 ^ i3) * 32369) ^ 1849616404;
                        i2 = 69365973;
                    } else {
                        view = viewM15651;
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۚ") ^ i4;
                        i = ((iM11306 ^ i3) * (-7963)) ^ (-1265888589);
                        i2 = -1993423417;
                    }
                    ActivityC5677 activityC567111 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC567111;
                    break;
                case 331138622:
                case 1049655790:
                    i10 = 21768;
                    iM11306 = (C19806.m45029("᩸ܽ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM11306 ^ i4) * EnumC23529.f76192) ^ 1080490385;
                    i2 = 689330184;
                    ActivityC5677 activityC567112 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC567112;
                    break;
                case 365359485:
                case 1544172983:
                    activityC5677 = activityC5677;
                    i11 = 51;
                    i12 = 3;
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("ۢ۬") ^ i3;
                        i = ((iM11306 ^ i4) * (-26443)) ^ 1447126073;
                        i2 = 356113468;
                    } else {
                        iM11306 = (C19806.m45029("᩹ۤ") + i3) * 89;
                        i = ((iM11306 ^ i4) * 16501) ^ 24387054;
                        i2 = 136547401;
                    }
                    ActivityC5677 activityC567113 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC567113;
                    break;
                case 784493717:
                case 1037996309:
                    C3722.m10894();
                    activityC5677 = activityC5677;
                    iM11306 = C19806.m45029("ۢ۬") ^ i3;
                    i = ((iM11306 ^ i4) * (-26443)) ^ 1447126073;
                    i2 = 356113468;
                    ActivityC5677 activityC567114 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC567114;
                    break;
                case 785994046:
                case 1684261008:
                    activityC5677 = activityC5677;
                    if (C0962.f3784) {
                        iM11306 = (i4 - C19806.m45029("ܰܽ")) * (-91);
                        i = ((iM11306 ^ i3) * (-2743)) ^ 1571960605;
                        i2 = 699952091;
                    } else {
                        iM11306 = C19806.m45029("ۜᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 18317) ^ 673347405;
                        i2 = -1334284403;
                    }
                    ActivityC5677 activityC567115 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC567115;
                    break;
                case 814674374:
                case 1702869575:
                    C19806.m45024();
                    return null;
                case 1023220477:
                case 1957303044:
                    i10 = a.m;
                    iM11306 = (C19806.m45029("᩸ܽ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM11306 ^ i4) * EnumC23529.f76192) ^ 1080490385;
                    i2 = 689330184;
                    ActivityC5677 activityC567116 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC567116;
                    break;
                default:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("᩸۫") ^ i4;
                        activityC5677 = activityC5677;
                        i = ((iM11306 ^ i3) * 32339) ^ 210700147;
                        i2 = 1990486597;
                    } else {
                        activityC5677 = activityC5677;
                        iM11306 = C19806.m45029("ۢ۬") ^ i3;
                        i = ((iM11306 ^ i4) * (-26443)) ^ 1447126073;
                        i2 = 356113468;
                    }
                    ActivityC5677 activityC567117 = activityC5677;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    activityC5677 = activityC567117;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x02dc A[PHI: r4 r5 r6 r16 r17
      0x02dc: PHI (r4v4 short[]) = (r4v2 short[]), (r4v3 short[]), (r4v2 short[]) binds: [B:68:0x02da, B:64:0x02b9, B:60:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v4 short) binds: [B:68:0x02da, B:64:0x02b9, B:60:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:68:0x02da, B:64:0x02b9, B:60:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r16v11 int) = (r16v9 int), (r16v10 int), (r16v12 int) binds: [B:68:0x02da, B:64:0x02b9, B:60:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r17v16 android.os.Bundle) = (r17v14 android.os.Bundle), (r17v15 android.os.Bundle), (r17v17 android.os.Bundle) binds: [B:68:0x02da, B:64:0x02b9, B:60:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35618(String str, String str2) {
        Bundle bundleRequireArguments;
        int iM45029;
        int i;
        int i2;
        int iM11306;
        Bundle bundle;
        int i3;
        int i4 = C7105.f23796;
        int i5 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11307 = (ThreadFactoryC3888.m11306("᩺֡") ^ i5) * 93;
        int i6 = ((iM11307 ^ i4) * (-21643)) ^ (-183661516);
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM11307 ^ 1582639773;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 1654422747;
        Bundle bundleRequireArguments2 = null;
        short[] sArr3 = null;
        int i12 = 0;
        String strM3361 = null;
        Bundle bundle2 = null;
        while (true) {
            int i13 = i7 ^ (i6 & (((i11 ^ i4) * 28769) >> 31));
            switch (i13) {
                case -2136584313:
                case 297668641:
                    bundle2 = bundle2;
                    i13 = i13;
                    int i14 = s + s2;
                    if ((i14 * i14) - i9 > 0) {
                        iM45029 = (C19806.m45029("֡֡") ^ i4) * 75;
                        i = ((iM45029 ^ i5) * (-25841)) ^ (-766866529);
                        i2 = 1632854947;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۢ") ^ i4) * 69;
                        i = ((iM45029 ^ i5) * (-30557)) ^ 1233425879;
                        i2 = -1700725342;
                    }
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case -2021258382:
                case 591098893:
                    bundle2 = bundle2;
                    i13 = i13;
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩵") ^ i5;
                        i = ((iM45029 ^ i4) * 463) ^ (-1167952857);
                        i2 = -174202264;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܰ") ^ i4;
                        i = ((iM45029 ^ i5) * 5589) ^ (-240985209);
                        i2 = 2010383534;
                    }
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case -1991223434:
                case -1444036144:
                    bundle2 = bundle2;
                    i13 = i13;
                    s = sArr[131];
                    i8 = s * s;
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩵") ^ i5;
                        i = ((iM45029 ^ i4) * 463) ^ (-1167952857);
                        i2 = -174202264;
                    } else {
                        iM45029 = C19806.m45029("۟᩺") ^ i4;
                        i = ((iM45029 ^ i5) * 24861) ^ (-928532528);
                        i2 = 87143706;
                    }
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case -1959883714:
                case -1112502831:
                    bundle2 = bundle2;
                    i13 = i13;
                    sArr = f48659;
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩵") ^ i5;
                        i = ((iM45029 ^ i4) * 463) ^ (-1167952857);
                        i2 = -174202264;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽܿ") + i5) * (-99);
                        i = ((iM45029 ^ i4) * 25211) ^ (-1657472776);
                        i2 = 847794659;
                    }
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case -1894498397:
                case -183756022:
                    if (C1461.f5957 > 0) {
                        bundle2 = bundle2;
                        i13 = i13;
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i5;
                        i = ((iM45029 ^ i4) * 16033) ^ (-888046211);
                        i2 = -974623735;
                        i11 = i13;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle2 = bundle2;
                    } else {
                        int iM11308 = (i5 - ThreadFactoryC3888.m11306("ۚ۬")) * 127;
                        i7 = iM11308 ^ 1830797595;
                        i6 = ((iM11308 ^ i4) * 13361) ^ (-452434134);
                        i11 = i13;
                    }
                    break;
                case -1886640591:
                case -939341387:
                    i13 = i13;
                    bundle2.putString(strM3361, str);
                    bundleRequireArguments2 = requireArguments();
                    sArr2 = f48659;
                    if (C1937.f7317 >= 0) {
                        bundle2 = bundle2;
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i5;
                        i = ((iM45029 ^ i4) * 16033) ^ (-888046211);
                        i2 = -974623735;
                        i11 = i13;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle2 = bundle2;
                    } else {
                        int iM450210 = (C19806.m45029("ۧۗ") ^ i4) * (-127);
                        i6 = ((iM450210 ^ i5) * 27487) ^ 23342188;
                        i11 = i13;
                        i7 = iM450210 ^ 1893747264;
                    }
                    break;
                case -1857293992:
                case -18093597:
                    bundle2 = bundle2;
                    i13 = i13;
                    sArr3 = f48659;
                    if (C1398.f5802 > 0) {
                        iM45029 = (C19806.m45029("֫ܺ") ^ i5) * 83;
                        i = ((iM45029 ^ i4) * 5013) ^ 1855618502;
                        i2 = 369512633;
                        i11 = i13;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle2 = bundle2;
                    } else {
                        bundleRequireArguments = bundle2;
                        iM11306 = ThreadFactoryC3888.m11306("֡֫") ^ i4;
                        bundle = bundleRequireArguments;
                        i6 = ((iM11306 ^ i5) * (-703)) ^ (-1170518227);
                        i3 = -1163071969;
                        i11 = i13;
                        i7 = iM11306 ^ i3;
                        bundle2 = bundle;
                    }
                    break;
                case -1299957504:
                case 1922230494:
                    C3743.m10966();
                    break;
                case -1204494628:
                case 1199257713:
                    bundle2 = bundle2;
                    i13 = i13;
                    s2 = 10351;
                    if (C3743.f13569) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۠") ^ i5;
                        i = ((iM45029 ^ i4) * 18407) ^ (-1663551148);
                        i2 = -1329643984;
                    } else {
                        iM45029 = C19806.m45029("֨۠") ^ i4;
                        i = ((iM45029 ^ i5) * 9961) ^ 1934234377;
                        i2 = 1063843869;
                    }
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case -983448773:
                case 1693092025:
                    if (!C1419.m4973()) {
                        bundleRequireArguments = bundle2;
                        i13 = i13;
                        iM11306 = ThreadFactoryC3888.m11306("֡֫") ^ i4;
                        bundle = bundleRequireArguments;
                        i6 = ((iM11306 ^ i5) * (-703)) ^ (-1170518227);
                        i3 = -1163071969;
                        i11 = i13;
                        i7 = iM11306 ^ i3;
                        bundle2 = bundle;
                    } else {
                        int iM11309 = (i5 - ThreadFactoryC3888.m11306("ۚ۬")) * 127;
                        i7 = iM11309 ^ 1830797595;
                        i6 = ((iM11309 ^ i4) * 13361) ^ (-452434134);
                        i11 = i13;
                    }
                    break;
                case -895926588:
                case 635217201:
                    i13 = i13;
                    strM3361 = C0797.m3361(sArr3, 132, 9, i12);
                    if (C0050.f912 > 0) {
                        iM45029 = C19806.m45029("ܿ᩸") ^ i5;
                        bundle2 = bundle2;
                        i = ((iM45029 ^ i4) * 24539) ^ 1207544287;
                        i2 = 781109407;
                        i11 = i13;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle2 = bundle2;
                    } else {
                        bundleRequireArguments = bundle2;
                        iM11306 = ThreadFactoryC3888.m11306("֡֫") ^ i4;
                        bundle = bundleRequireArguments;
                        i6 = ((iM11306 ^ i5) * (-703)) ^ (-1170518227);
                        i3 = -1163071969;
                        i11 = i13;
                        i7 = iM11306 ^ i3;
                        bundle2 = bundle;
                    }
                    break;
                case -816509106:
                case 347363113:
                    bundle2 = bundle2;
                    i13 = i13;
                    int i15 = 107143201 + i8;
                    i9 = i15 + i15;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i5;
                        i = ((iM45029 ^ i4) * 16033) ^ (-888046211);
                        i2 = -974623735;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i5;
                        i = ((iM45029 ^ i4) * (-28769)) ^ (-1703520474);
                        i2 = -428225589;
                    }
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case -800342824:
                case 1419712619:
                    C2788.m8472();
                    if (!C19806.f63586) {
                        bundle2 = bundle2;
                        i13 = i13;
                        iM45029 = C19806.m45029("֨۠") ^ i4;
                        i = ((iM45029 ^ i5) * 9961) ^ 1934234377;
                        i2 = 1063843869;
                        i11 = i13;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle2 = bundle2;
                    }
                    bundle2 = bundle2;
                    i13 = i13;
                    iM45029 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i5;
                    i = ((iM45029 ^ i4) * 16033) ^ (-888046211);
                    i2 = -974623735;
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case -625652987:
                case 1892159258:
                    C1419.m4973();
                    int iM113010 = (i5 - ThreadFactoryC3888.m11306("ۚ۬")) * 127;
                    i7 = iM113010 ^ 1830797595;
                    i6 = ((iM113010 ^ i4) * 13361) ^ (-452434134);
                    i11 = i13;
                    break;
                case -385892289:
                case 2052919147:
                    i13 = i13;
                    if (C1937.f7317 >= 0) {
                        bundle2 = bundle2;
                        i10 = 141;
                        iM45029 = C19806.m45029("֨۠") ^ i4;
                        i = ((iM45029 ^ i5) * 9961) ^ 1934234377;
                        i2 = 1063843869;
                        i11 = i13;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle2 = bundle2;
                    } else {
                        int iM450211 = (i4 - C19806.m45029("᩷ۤ")) * (-65);
                        i11 = i13;
                        i7 = iM450211 ^ (-1464952443);
                        i6 = ((iM450211 ^ i5) * 13767) ^ (-861654220);
                        i10 = 141;
                    }
                    break;
                case 149872407:
                case 719228102:
                    i12 = 56048;
                    iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i5;
                    i = ((iM45029 ^ i4) * (-6965)) ^ (-1651628218);
                    i2 = 1240439886;
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case 188528710:
                case 398056395:
                    i12 = 49418;
                    iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i5;
                    i = ((iM45029 ^ i4) * (-6965)) ^ (-1651628218);
                    i2 = 1240439886;
                    i11 = i13;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle2 = bundle2;
                    break;
                case 905376795:
                case 1549870064:
                    bundleRequireArguments2.putString(C1377.m4832(sArr2, i10, 6, i12), str2);
                    break;
                default:
                    i13 = i13;
                    m50133((String) null);
                    bundleRequireArguments = requireArguments();
                    if (C3660.m10791() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֫") ^ i4;
                        bundle = bundleRequireArguments;
                        i6 = ((iM11306 ^ i5) * (-703)) ^ (-1170518227);
                        i3 = -1163071969;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۗܶ")) * (-113);
                        bundle = bundleRequireArguments;
                        i6 = ((iM11306 ^ i5) * 28283) ^ 506061446;
                        i3 = 995941448;
                    }
                    i11 = i13;
                    i7 = iM11306 ^ i3;
                    bundle2 = bundle;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35621() {
        this.f48671 = true;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m35619() {
        return this.f48666;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a4 A[PHI: r11
      0x01a4: PHI (r11v4 short) = (r11v3 short), (r11v2 short) binds: [B:49:0x01a2, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fb A[PHI: r8 r9 r13 r14 r15
      0x01fb: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:57:0x01f9, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:57:0x01f9, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r13v3 short[]) = (r13v2 short[]), (r13v4 short[]) binds: [B:57:0x01f9, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:57:0x01f9, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:57:0x01f9, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0231 A[PHI: r2 r7
      0x0231: PHI (r2v5 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:61:0x022f, B:34:0x010d, B:13:0x0069, B:10:0x0061, B:5:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r7v5 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:61:0x022f, B:34:0x010d, B:13:0x0069, B:10:0x0061, B:5:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0266 A[PHI: r1 r6
      0x0266: PHI (r1v5 l.᩵֨ۙ) = (r1v2 l.᩵֨ۙ), (r1v4 l.᩵֨ۙ), (r1v2 l.᩵֨ۙ) binds: [B:65:0x0264, B:38:0x0130, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:65:0x0264, B:38:0x0130, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x029a A[PHI: r3 r10 r20
      0x029a: PHI (r3v4 android.os.Bundle) = 
      (r3v2 android.os.Bundle)
      (r3v2 android.os.Bundle)
      (r3v3 android.os.Bundle)
      (r3v2 android.os.Bundle)
      (r3v2 android.os.Bundle)
     binds: [B:69:0x0298, B:53:0x01d6, B:30:0x00eb, B:13:0x0069, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:69:0x0298, B:53:0x01d6, B:30:0x00eb, B:13:0x0069, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:69:0x0298, B:53:0x01d6, B:30:0x00eb, B:13:0x0069, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onResume() {
        int iM11306;
        int i;
        int i2;
        int i3 = C0050.f912;
        int i4 = C1066.f4915;
        int iM11307 = ThreadFactoryC3888.m11306("᩵ۙ") ^ i4;
        int i5 = ((iM11307 ^ i3) * 1257) ^ 2112475932;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ 1932781378;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -188146293;
        String strM10776 = null;
        Bundle bundleRequireArguments = null;
        String strMo3615 = null;
        ActivityC19126 activityC19126M5049 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 1805) >> 31));
            switch (i13) {
                case -2114273943:
                case 124433493:
                    strMo3615 = mo3615();
                    if (C1875.f7103 >= 0) {
                        iM11306 = (i3 - C19806.m45029("۠ۘ")) * 57;
                        i = ((iM11306 ^ i4) * (-30287)) ^ (-1924566176);
                        i2 = 1018486479;
                    } else {
                        iM11306 = C19806.m45029("ۡۤ") ^ i4;
                        i = ((iM11306 ^ i3) * (-23775)) ^ (-1161375535);
                        i2 = 2072000956;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2040735332:
                case -1567205901:
                    c = 'j';
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i3;
                        i = ((iM11306 ^ i4) * 16921) ^ 1276317152;
                        i2 = -2089871384;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܰ") + i4) * 37;
                        i = ((iM11306 ^ i3) * (-19507)) ^ (-392294326);
                        i2 = -385521136;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1922073600:
                case 1367549770:
                    i10 = 52729;
                    iM11306 = ThreadFactoryC3888.m11306("ܽ֫") ^ i4;
                    i = ((iM11306 ^ i3) * 29209) ^ 1662835487;
                    i2 = -973239854;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1772558517:
                case 1154130812:
                    int i14 = s + s2;
                    if ((i14 * i14) - i9 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 4073) ^ 2131212258;
                        i2 = -388766837;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۘ") ^ i3;
                        i = ((iM11306 ^ i4) * 15115) ^ 358317035;
                        i2 = 1347743740;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1754413002:
                case 2007134597:
                    RunnableC3388.m10064();
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩻") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-17429)) ^ 1071591436;
                        i2 = -611728355;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i3;
                        i = ((iM11306 ^ i4) * 16921) ^ 1276317152;
                        i2 = -2089871384;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1606334798:
                case -1050061466:
                    super.onResume();
                    activityC19126M5049 = C1460.m5049(this);
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i3;
                        i = ((iM11306 ^ i4) * 16921) ^ 1276317152;
                        i2 = -2089871384;
                    } else {
                        iM11306 = C19806.m45029("֨ۖ") ^ i3;
                        i = ((iM11306 ^ i4) * 14795) ^ (-404650115);
                        i2 = 1262525336;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1414237086:
                case 1060049839:
                    sArr2 = f48659;
                    i11 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i12 = 6;
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۫") ^ i4;
                        i = ((iM11306 ^ i3) * 20701) ^ 147850182;
                        i2 = 303989279;
                    } else {
                        iM11306 = C19806.m45029("֨۠") ^ i3;
                        i = ((iM11306 ^ i4) * (-875)) ^ 797747253;
                        i2 = 1633052093;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1081600877:
                case 1112740341:
                    ((ActivityC5677) AbstractC0464.m2305(this)).m15657((CharSequence) strM10776);
                    break;
                case -905996388:
                case 2046544849:
                    C0671.m3008();
                    break;
                case -817446741:
                case 947429678:
                    if (C2788.m8472() != 0) {
                        iM11306 = (i3 - C19806.m45029("۠ۘ")) * 57;
                        i = ((iM11306 ^ i4) * (-30287)) ^ (-1924566176);
                        i2 = 1018486479;
                    } else {
                        iM11306 = C19806.m45029("ۛ֡") ^ i4;
                        i = ((iM11306 ^ i3) * 8489) ^ 497509256;
                        i2 = -1926189091;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -686409854:
                case 2081421370:
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩻") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-17429)) ^ 1071591436;
                        i2 = -611728355;
                    } else {
                        iM11306 = (C19806.m45029("۠ܶ") ^ i4) * 85;
                        i = ((iM11306 ^ i3) * (-20463)) ^ (-397334271);
                        i2 = -770262981;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -584526824:
                case 1759392753:
                    i7 = s * s;
                    i8 = 217090756;
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۫") ^ i4;
                        i = ((iM11306 ^ i3) * 20701) ^ 147850182;
                        i2 = 303989279;
                    } else {
                        iM11306 = (C19806.m45029("ܰᩴ") + i3) * 29;
                        i = ((iM11306 ^ i4) * 3195) ^ 305036255;
                        i2 = 2012847337;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -557321974:
                case 763120230:
                    strM10776 = C3660.m10776(bundleRequireArguments, ThreadFactoryC3888.m11312(sArr2, i11, i12, i10));
                    if (strM10776 != null) {
                        iM11306 = (C19806.m45029("ᩳ֨") ^ i4) * (-93);
                        i = ((iM11306 ^ i3) * (-18471)) ^ (-1757337596);
                        i2 = -1239498686;
                    } else {
                        iM11306 = C19806.m45029("֨ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * (-17353)) ^ (-1852385881);
                        i2 = -2029135419;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -491698651:
                case 1720053031:
                    ((ActivityC5677) C1460.m5049(this)).m15657((CharSequence) m35620());
                    break;
                case -393454443:
                case -100917378:
                    if (C2124.m6673() <= 0) {
                        iM11306 = (i3 - C19806.m45029("۠ۘ")) * 57;
                        i = ((iM11306 ^ i4) * (-30287)) ^ (-1924566176);
                        i2 = 1018486479;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩻") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-17429)) ^ 1071591436;
                        i2 = -611728355;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 303222862:
                case 507301105:
                    activityC19126M5049.setTitle(strMo3615);
                    bundleRequireArguments = requireArguments();
                    if (C1025.f4800 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩻") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-17429)) ^ 1071591436;
                        i2 = -611728355;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۫۠")) * 69;
                        i = ((iM11306 ^ i4) * 4993) ^ 1690231013;
                        i2 = 747349540;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 363582371:
                case 883576969:
                    s2 = 14734;
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("᩶۟") ^ i3;
                        i = ((iM11306 ^ i4) * 24635) ^ 2068245243;
                        i2 = 149094838;
                    } else {
                        iM11306 = C19806.m45029("ۛ֡") ^ i4;
                        i = ((iM11306 ^ i3) * 8489) ^ 497509256;
                        i2 = -1926189091;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 378336552:
                case 1143932293:
                    sArr = f48659;
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩻") + i3) * 47;
                        i = ((iM11306 ^ i4) * (-17429)) ^ 1071591436;
                        i2 = -611728355;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ᩴ") ^ i3) * 41;
                        i = ((iM11306 ^ i4) * (-1387)) ^ 1956490420;
                        i2 = -1876607694;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 478063903:
                case 2103822587:
                    i10 = 21245;
                    iM11306 = ThreadFactoryC3888.m11306("ܽ֫") ^ i4;
                    i = ((iM11306 ^ i3) * 29209) ^ 1662835487;
                    i2 = -973239854;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1565825475:
                case 1848185337:
                    s = sArr[c];
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (i3 - C19806.m45029("۠ۘ")) * 57;
                        i = ((iM11306 ^ i4) * (-30287)) ^ (-1924566176);
                        i2 = 1018486479;
                    } else {
                        iM11306 = (C19806.m45029("ۖ۟") ^ i4) * (-97);
                        i = ((iM11306 ^ i3) * (-16579)) ^ (-823363429);
                        i2 = -1370523231;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1066.m4023();
                    C0526.m2437();
                    iM11306 = (i3 - C19806.m45029("۠ۘ")) * 57;
                    i = ((iM11306 ^ i4) * (-30287)) ^ (-1924566176);
                    i2 = 1018486479;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        InterfaceC19083 interfaceC19083Mo19340 = null;
        int i = -282779649;
        int i2 = C3660.f13403;
        int i3 = C1066.f4915;
        int iM45029 = C19806.m45029("ۗܺ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-26533)) ^ 223806314;
        int i5 = 304676473;
        while (true) {
            i = ((((i ^ i3) * 1279) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2077006752:
                case -1613785350:
                    if (C19806.f63586) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩵") + i3) * (-69);
                        i4 = ((iM45029 ^ i2) * 29161) ^ 1089120170;
                        i5 = 1009050214;
                    } else {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17993) ^ 655640702;
                        i5 = 1838306858;
                    }
                    break;
                case -2054814599:
                case -300056823:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (i2 - C19806.m45029("᩻ۖ")) * 85;
                        i4 = ((iM45029 ^ i3) * (-10017)) ^ 1919339077;
                        i5 = -850963448;
                    } else {
                        iM45029 = C19806.m45029("᩸᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14283)) ^ (-361041896);
                        i5 = -1294701850;
                    }
                    break;
                case -1771182581:
                case -194420313:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("᩷۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3841) ^ 729873507;
                        i5 = 1287703427;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽ֨")) * 93;
                        i4 = ((iM45029 ^ i2) * (-32687)) ^ 1510526359;
                        i5 = 1084649942;
                    }
                    break;
                case -1762041312:
                case 1248454047:
                    C2332.m7079();
                    C3660.m10791();
                    break;
                case -1726620592:
                case 628688216:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩵") + i3) * (-69);
                        i4 = ((iM45029 ^ i2) * 29161) ^ 1089120170;
                        i5 = 1009050214;
                    } else {
                        iM45029 = (C19806.m45029("᩶ܰ") + i3) * (-91);
                        i4 = ((iM45029 ^ i2) * (-27553)) ^ 1525521753;
                        i5 = -564559885;
                    }
                    break;
                case -1672644099:
                case 1327047926:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("᩷۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3841) ^ 729873507;
                        i5 = 1287703427;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۫") + i3) * 49;
                        i4 = ((iM45029 ^ i2) * MLKEMEngine.KyberQ) ^ 368724241;
                        i5 = -1335107117;
                    }
                    break;
                case -1421845896:
                case 694911123:
                    C22656 c22656 = (C22656) interfaceC19083Mo19340;
                    c22656.mo30475();
                    c22656.mo30474();
                    iM45029 = (i2 - C19806.m45029("ᩴۗ")) * 41;
                    i4 = ((iM45029 ^ i3) * 23729) ^ (-173769606);
                    i5 = 1104358965;
                    break;
                case -1354731038:
                case 986470487:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("᩷۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3841) ^ 729873507;
                        i5 = 1287703427;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩻ۖ")) * 85;
                        i4 = ((iM45029 ^ i3) * (-10017)) ^ 1919339077;
                        i5 = -850963448;
                    }
                    break;
                case -1247737055:
                case 1712702786:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩻ۖ")) * 85;
                        i4 = ((iM45029 ^ i3) * (-10017)) ^ 1919339077;
                        i5 = -850963448;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-7);
                        i4 = ((iM45029 ^ i3) * 24135) ^ 688488291;
                        i5 = 1167863339;
                    }
                    break;
                case -1219133276:
                case 160894968:
                    super.onSaveInstanceState(bundle);
                    interfaceC19083Mo19340 = mo19340();
                    if (interfaceC19083Mo19340 != null) {
                        iM45029 = (C19806.m45029("ۘ᩻") ^ i3) * 43;
                        i4 = ((iM45029 ^ i2) * (-23253)) ^ 1519863695;
                        i5 = 1071517692;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ᩴۗ")) * 41;
                        i4 = ((iM45029 ^ i3) * 23729) ^ (-173769606);
                        i5 = 1104358965;
                    }
                    break;
                case -909527853:
                case 1405101697:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("᩷۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3841) ^ 729873507;
                        i5 = 1287703427;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֫") + i2) * (-29);
                        i4 = ((iM45029 ^ i3) * 5535) ^ (-1704706912);
                        i5 = -775022680;
                    }
                    break;
                case -786154378:
                case 342629222:
                    C1148.m4232();
                    if (C3722.m10894() > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩵") + i3) * (-69);
                        i4 = ((iM45029 ^ i2) * 29161) ^ 1089120170;
                        i5 = 1009050214;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩻ۖ")) * 85;
                        i4 = ((iM45029 ^ i3) * (-10017)) ^ 1919339077;
                        i5 = -850963448;
                    }
                    break;
                case -613559928:
                case 83440526:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩻ۖ")) * 85;
                        i4 = ((iM45029 ^ i3) * (-10017)) ^ 1919339077;
                        i5 = -850963448;
                    } else {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20673)) ^ 1207416143;
                        i5 = 1077007561;
                    }
                    break;
                case 19304113:
                case 156364536:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = C19806.m45029("᩷۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3841) ^ 729873507;
                        i5 = 1287703427;
                    } else {
                        iM45029 = C19806.m45029("ᩳ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6617) ^ (-2105199795);
                        i5 = -1848244563;
                    }
                    break;
                case 179199611:
                case 569533559:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩻ۖ")) * 85;
                        i4 = ((iM45029 ^ i3) * (-10017)) ^ 1919339077;
                        i5 = -850963448;
                    } else {
                        iM45029 = C19806.m45029("֡ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3807) ^ 939045501;
                        i5 = -659050286;
                    }
                    break;
                case 193842005:
                case 1661840001:
                    break;
                case 630114163:
                case 1130606715:
                    RunnableC1895.m6170();
                    iM45029 = (i2 - C19806.m45029("᩻ۖ")) * 85;
                    i4 = ((iM45029 ^ i3) * (-10017)) ^ 1919339077;
                    i5 = -850963448;
                    break;
                default:
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۢ") ^ i3) * (-103);
                        i4 = ((iM45029 ^ i2) * (-17175)) ^ 17338831;
                        i5 = 76964514;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩻۟")) * (-117);
                        i4 = ((iM45029 ^ i3) * 7599) ^ (-1546863447);
                        i5 = 431004753;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0117 A[PHI: r3 r5 r7 r8 r15
      0x0117: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:37:0x0115, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r5v4 java.lang.Class<l.ۛ᩻ۘ>) = (r5v3 java.lang.Class<l.ۛ᩻ۘ>), (r5v2 java.lang.Class<l.ۛ᩻ۘ>) binds: [B:37:0x0115, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:37:0x0115, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r8v4 l.ܽܶۙ) = (r8v3 l.ܽܶۙ), (r8v2 l.ܽܶۙ) binds: [B:37:0x0115, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r15v3 short[]) = (r15v2 short[]), (r15v4 short[]) binds: [B:37:0x0115, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0154 A[PHI: r4
      0x0154: PHI (r4v5 l.ᩳ᩻ۘ) = (r4v4 l.ᩳ᩻ۘ), (r4v2 l.ᩳ᩻ۘ), (r4v2 l.ᩳ᩻ۘ), (r4v2 l.ᩳ᩻ۘ) binds: [B:41:0x0152, B:27:0x00ba, B:17:0x0078, B:15:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022d A[PHI: r2 r6 r10 r23
      0x022d: PHI (r2v5 l.ܽܶۙ) = (r2v2 l.ܽܶۙ), (r2v2 l.ܽܶۙ), (r2v3 l.ܽܶۙ), (r2v2 l.ܽܶۙ), (r2v2 l.ܽܶۙ), (r2v2 l.ܽܶۙ) binds: [B:62:0x022b, B:82:0x022d, B:45:0x018e, B:30:0x00c9, B:15:0x0074, B:95:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r6v5 l.᩻۠ۘ) = (r6v2 l.᩻۠ۘ), (r6v2 l.᩻۠ۘ), (r6v2 l.᩻۠ۘ), (r6v3 l.᩻۠ۘ), (r6v2 l.᩻۠ۘ), (r6v2 l.᩻۠ۘ) binds: [B:62:0x022b, B:82:0x022d, B:45:0x018e, B:30:0x00c9, B:15:0x0074, B:95:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r10v6 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:62:0x022b, B:82:0x022d, B:45:0x018e, B:30:0x00c9, B:15:0x0074, B:95:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r23v6 short) = (r23v3 short), (r23v1 short), (r23v1 short), (r23v1 short), (r23v1 short), (r23v1 short) binds: [B:62:0x022b, B:82:0x022d, B:45:0x018e, B:30:0x00c9, B:15:0x0074, B:95:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        final C14895 c14895 = this;
        int i4 = C1460.f5948;
        int i5 = RunnableC0195.f1321;
        int iM11307 = (ThreadFactoryC3888.m11306("᩵ۡ") + i4) * (-105);
        int i6 = ((iM11307 ^ i5) * (-14543)) ^ (-475413853);
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM11307 ^ 454173813;
        int i8 = 0;
        int i9 = 0;
        C16717 c16717 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1306293338;
        char c = 0;
        short s = 0;
        C23566 c23566M21927 = null;
        Class<C6382> cls = null;
        C18377 c18377 = null;
        C16717 c16718 = null;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i5) * (-8069)) >> 31));
            switch (i15) {
                case -2046245753:
                case -1086946293:
                    c18377 = (C18377) c16718.m39205(C18377.class);
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i5;
                        i = ((iM11306 ^ i4) * 7435) ^ (-316345271);
                        i2 = -1973791988;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۖ") ^ i4;
                        i = ((iM11306 ^ i5) * (-29741)) ^ 1652531195;
                        i2 = -1464593224;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -1876267332:
                case -275626921:
                    short s2 = sArr[c];
                    i10 = s2 + 16744;
                    if (C1875.f7103 < 0) {
                        int iM450210 = C19806.m45029("ܳ۟") ^ i5;
                        i7 = iM450210 ^ 2074890797;
                        s = s2;
                        i6 = ((iM450210 ^ i4) * 31253) ^ 7206852;
                        c14895 = this;
                    } else {
                        s = s2;
                        iM11306 = C19806.m45029("۬᩵") ^ i4;
                        i = ((iM11306 ^ i5) * 15937) ^ 270157073;
                        i2 = -2017682413;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1764272657:
                case -1303685296:
                    super.onCreate(bundle);
                    c16718 = new C16717(AbstractC0464.m2305(this));
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("۬᩵") ^ i4;
                        i = ((iM11306 ^ i5) * 15937) ^ 270157073;
                        i2 = -2017682413;
                    } else {
                        iM11306 = C19806.m45029("᩹ۖ") ^ i4;
                        i = ((iM11306 ^ i5) * 22323) ^ (-1747042620);
                        i2 = 1646099020;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -1665793973:
                case 1316099482:
                    C0526.m2437();
                    if (C1189.f5284 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۖ") ^ i4;
                        i = ((iM11306 ^ i5) * (-29741)) ^ 1652531195;
                        i2 = -1464593224;
                    } else {
                        iM11306 = C19806.m45029("۬᩵") ^ i4;
                        i = ((iM11306 ^ i5) * 15937) ^ 270157073;
                        i2 = -2017682413;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -1183773579:
                case -93931577:
                    c14895.f48664 = (C6382) c16717.m39205(cls);
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۖ") ^ i4;
                        i = ((iM11306 ^ i5) * (-29741)) ^ 1652531195;
                        i2 = -1464593224;
                    } else {
                        c23566M21927 = ViewOnClickListenerC8374.m21927(c14895, new InterfaceC1692() { // from class: l.ۖ֨ۜ
                            @Override // l.InterfaceC1692
                            public final /* synthetic */ void onCanceled() {
                            }

                            @Override // l.InterfaceC1692
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo3908(String str) {
                                C14895.m35606(this.f7940, str);
                            }
                        });
                        if (AbstractC0464.m2313() != 0) {
                            iM11306 = C19806.m45029("۬᩵") ^ i4;
                            i = ((iM11306 ^ i5) * 15937) ^ 270157073;
                            i2 = -2017682413;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗ᩸") + i4) * (-41);
                            i = ((iM11306 ^ i5) * 26823) ^ 331760326;
                            i2 = 885440533;
                        }
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -1183404376:
                case -545030665:
                    C0797.m3359();
                    if (C1189.f5284 > 0) {
                        int iM450211 = (i5 - C19806.m45029("ۜۧ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = iM450211 ^ 2095095075;
                        i6 = ((iM450211 ^ i4) * (-20215)) ^ (-1940895713);
                        c16717 = null;
                    } else {
                        iM11306 = C19806.m45029("۬᩵") ^ i4;
                        i = ((iM11306 ^ i5) * 15937) ^ 270157073;
                        i2 = -2017682413;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1016668560:
                case 615976769:
                    i14 = 54693;
                    iM11306 = ThreadFactoryC3888.m11306("ۗ֨") ^ i4;
                    i = ((iM11306 ^ i5) * (-7119)) ^ 2110802091;
                    i2 = 1448938327;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -663133582:
                case -5610581:
                    i11 = i10 * i10;
                    i12 = s * s;
                    i13 = 280361536;
                    if (!C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܺ") + i5) * (-81);
                        i = ((iM11306 ^ i4) * (-23777)) ^ 1828665969;
                        i2 = -670171233;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    } else {
                        iM45029 = C19806.m45029("۠ᩴ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 26397) ^ (-2029511534);
                        i3 = 446928751;
                        i7 = iM45029 ^ i3;
                        c14895 = this;
                    }
                    break;
                case -392211686:
                case 2056119116:
                    if (!C0962.f3784) {
                        iM11306 = C19806.m45029("۬᩵") ^ i4;
                        i = ((iM11306 ^ i5) * 15937) ^ 270157073;
                        i2 = -2017682413;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    } else {
                        iM45029 = C19806.m45029("۠ᩴ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 26397) ^ (-2029511534);
                        i3 = 446928751;
                        i7 = iM45029 ^ i3;
                        c14895 = this;
                    }
                    break;
                case -376362927:
                case 1672145068:
                    C0629.m2907();
                    iM11306 = ThreadFactoryC3888.m11306("۫ۖ") ^ i4;
                    i = ((iM11306 ^ i5) * (-29741)) ^ 1652531195;
                    i2 = -1464593224;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -354996532:
                case 1291363108:
                    sArr2 = f48659;
                    i8 = 41;
                    i9 = 5;
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿۙ")) * (-51);
                        i = ((iM11306 ^ i5) * (-12743)) ^ (-1431477391);
                        i2 = -180577984;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") ^ i5) * 53;
                        i = ((iM11306 ^ i4) * (-17409)) ^ 578697474;
                        i2 = -2075758553;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -349912876:
                case 1285704773:
                    C2332.m7079();
                    break;
                case -250564223:
                case 379464360:
                    int i16 = i12 + i13;
                    if ((i16 + i16) - i11 < 0) {
                        iM11306 = (C19806.m45029("۫ۡ") + i5) * (-11);
                        i = ((iM11306 ^ i4) * 11525) ^ (-318871546);
                        i2 = -781104900;
                    } else {
                        iM11306 = C19806.m45029("֫ۙ") ^ i4;
                        i = ((iM11306 ^ i5) * 10277) ^ (-1632265477);
                        i2 = -624577615;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -96179967:
                case 697267503:
                    c14895.f48667 = c18377;
                    ActivityC19126 activityC19126M5049 = C1460.m5049(this);
                    if (C1875.m6086() == 0) {
                        c16717 = new C16717(activityC19126M5049);
                        cls = C6382.class;
                        if (C2477.f9839 <= 0) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿۙ")) * (-51);
                            i = ((iM11306 ^ i5) * (-12743)) ^ (-1431477391);
                            i2 = -180577984;
                        } else {
                            iM11306 = (i5 - C19806.m45029("ۡ᩷")) * 83;
                            i = ((iM11306 ^ i4) * (-7585)) ^ (-1485372227);
                            i2 = -463441120;
                        }
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    } else {
                        int iM450212 = (i5 - C19806.m45029("ۜۧ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = iM450212 ^ 2095095075;
                        i6 = ((iM450212 ^ i4) * (-20215)) ^ (-1940895713);
                        c16717 = null;
                    }
                    break;
                case 628952941:
                case 1868413160:
                    c23566M21927.m46685(C0671.m3009(sArr2, i8, i9, i14));
                    c14895.f48670 = c23566M21927;
                    break;
                case 1054048393:
                case 1531902469:
                    i14 = 41088;
                    iM11306 = ThreadFactoryC3888.m11306("ۗ֨") ^ i4;
                    i = ((iM11306 ^ i5) * (-7119)) ^ 2110802091;
                    i2 = 1448938327;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                default:
                    sArr = f48659;
                    c = '(';
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = C19806.m45029("۠ᩴ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 26397) ^ (-2029511534);
                        i3 = 446928751;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩹") ^ i4) * (-31);
                        i6 = ((iM45029 ^ i5) * 18809) ^ (-2046772543);
                        i3 = -244520939;
                    }
                    i7 = iM45029 ^ i3;
                    c14895 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0178 A[PHI: r1 r5 r6 r7
      0x0178: PHI (r1v5 short[]) = (r1v4 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:45:0x0176, B:26:0x00b2, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]) binds: [B:45:0x0176, B:26:0x00b2, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:45:0x0176, B:26:0x00b2, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:45:0x0176, B:26:0x00b2, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0218 A[PHI: r2 r3
      0x0218: PHI (r2v5 short) = (r2v2 short), (r2v2 short), (r2v4 short), (r2v2 short) binds: [B:61:0x0216, B:57:0x01fa, B:41:0x0153, B:37:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v5 int) binds: [B:61:0x0216, B:57:0x01fa, B:41:0x0153, B:37:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024b A[PHI: r0
      0x024b: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v2 java.lang.String), (r0v5 java.lang.String), (r0v2 java.lang.String) binds: [B:65:0x0249, B:49:0x01a8, B:22:0x008d, B:15:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (l.C1668.m5583() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (l.RunnableC3388.f12514 >= 0) goto L8;
     */
    @Override // l.ComponentCallbacksC22654
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateOptionsMenu(android.view.Menu r17, android.view.MenuInflater r18) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14895.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC19083 mo19340() {
        C6094 c6094 = null;
        C13626 c13626M50132 = null;
        C13108 c13108 = null;
        int i = -60662254;
        int i2 = C2124.f7782;
        int i3 = C2642.f10294;
        int iM11306 = ThreadFactoryC3888.m11306("ۤۡ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 22635) ^ 1602321037;
        int i5 = -414720008;
        while (true) {
            i = ((((i ^ i2) * 27609) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2098080190:
                case 1896654660:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("۟ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-23991)) ^ 158259186;
                        i5 = -347364589;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ۠")) * (-71);
                        i4 = ((iM11306 ^ i2) * (-28159)) ^ (-1725250729);
                        i5 = -1518599794;
                    }
                    break;
                case -2000172606:
                case -1262665502:
                    c13108 = this.f48660;
                    if (c13108 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28909) ^ (-446882036);
                        i5 = 277738448;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۫ۖ")) * (-43);
                        i4 = ((iM11306 ^ i3) * 19485) ^ 1020900859;
                        i5 = -1853370558;
                    }
                    break;
                case -1840409996:
                case 1003098357:
                    C0671.m3008();
                    return null;
                case -1729193791:
                case 1874013738:
                    c13626M50132 = m50132(c6094.m47183());
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("ۤۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27711) ^ 1641024258;
                        i5 = 1625453124;
                    } else {
                        iM11306 = C19806.m45029("᩶᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28237) ^ (-2037707536);
                        i5 = -616097544;
                    }
                    break;
                case -1697561779:
                case -642554438:
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("ۨۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-2455)) ^ (-1843961214);
                        i5 = 1004132041;
                    } else {
                        iM11306 = (C19806.m45029("ܶۚ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * 6981) ^ 1717994110;
                        i5 = -380082035;
                    }
                    break;
                case -1673031996:
                case -1331341223:
                    return null;
                case -1664024835:
                case 215329403:
                    C1875.m6086();
                    if (!RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15097) ^ (-491692237);
                        i5 = 1853314526;
                    } else {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14797)) ^ 1947950502;
                        i5 = 609374659;
                    }
                    break;
                case -1652451269:
                case -992007043:
                    if (C0526.m2437() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15097) ^ (-491692237);
                        i5 = 1853314526;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۧ֨")) * 45;
                        i4 = ((iM11306 ^ i3) * (-647)) ^ 1094650904;
                        i5 = -345027257;
                    }
                    break;
                case -1613587388:
                case 1689357838:
                    if (this.f48662) {
                        iM11306 = C19806.m45029("ܰۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10805)) ^ (-2070252189);
                        i5 = 405294472;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13993) ^ (-2043589160);
                        i5 = -337839677;
                    }
                    break;
                case -1529599963:
                case -314525211:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (C19806.m45029("ۜۨ") ^ i2) * (-23);
                        i4 = ((iM11306 ^ i3) * (-18887)) ^ 286794747;
                        i5 = -1006940515;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15097) ^ (-491692237);
                        i5 = 1853314526;
                    }
                    break;
                case -1510198007:
                case -756470389:
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ۤۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27711) ^ 1641024258;
                        i5 = 1625453124;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۖ") + i2) * (-45);
                        i4 = ((iM11306 ^ i3) * (-18775)) ^ 129662239;
                        i5 = 125164660;
                    }
                    break;
                case -1156787213:
                case 2138690570:
                    if (C0216.f1393 == 0) {
                        iM11306 = C19806.m45029("۟ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-23991)) ^ 158259186;
                        i5 = -347364589;
                    } else {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14797)) ^ 1947950502;
                        i5 = 609374659;
                    }
                    break;
                case -833124203:
                case 889632940:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14797)) ^ 1947950502;
                        i5 = 609374659;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28035) ^ (-1573545153);
                        i5 = -1167821123;
                    }
                    break;
                case -721170401:
                case 434910275:
                    C1025.m3861();
                    ThreadFactoryC3888.m11300();
                    iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-14797)) ^ 1947950502;
                    i5 = 609374659;
                    break;
                case -119768641:
                case 612015350:
                    c6094 = this.f48669;
                    if (c6094 != null) {
                        iM11306 = (C19806.m45029("۠ܿ") + i3) * (-111);
                        i4 = ((iM11306 ^ i2) * (-3871)) ^ 163285049;
                        i5 = 879426365;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13993) ^ (-2043589160);
                        i5 = -337839677;
                    }
                    break;
                case -17355489:
                case 2111495801:
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ۤۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27711) ^ 1641024258;
                        i5 = 1625453124;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2541)) ^ (-48566604);
                        i5 = 70859441;
                    }
                    break;
                case 57525199:
                case 2136770708:
                    if (this.f48663) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13993) ^ (-2043589160);
                        i5 = -337839677;
                    } else {
                        iM11306 = (C19806.m45029("᩹ۤ") + i3) * (-35);
                        i4 = ((iM11306 ^ i2) * (-11777)) ^ 1862771116;
                        i5 = 849328725;
                    }
                    break;
                case 253080208:
                case 418971123:
                    return new C22656(this, c13108, c13626M50132);
                case 463649366:
                case 1359159142:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ۨۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-2455)) ^ (-1843961214);
                        i5 = 1004132041;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-8119)) ^ 249209808;
                        i5 = -10551160;
                    }
                    break;
                case 1279429686:
                case 2022723705:
                    C3535.m10431();
                    if (C3286.m9798() > 0) {
                        iM11306 = C19806.m45029("ۤۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27711) ^ 1641024258;
                        i5 = 1625453124;
                    } else {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14797)) ^ 1947950502;
                        i5 = 609374659;
                    }
                    break;
                case 1572765739:
                case 2021812354:
                    throw new RuntimeException();
                default:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = C19806.m45029("ۤۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27711) ^ 1641024258;
                        i5 = 1625453124;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩻") + i3) * (-87);
                        i4 = ((iM11306 ^ i2) * 7851) ^ (-804200608);
                        i5 = -606542461;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.ComponentCallbacksC22654
    public final boolean onOptionsItemSelected(android.view.MenuItem r49) {
        /*
            Method dump skipped, instruction units count: 2730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14895.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // l.InterfaceC18088
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo29298(C6094 c6094) {
        String strM35620 = null;
        int i = -111685916;
        int i2 = RunnableC0195.f1321;
        int i3 = C2871.f10837;
        int iM11306 = (ThreadFactoryC3888.m11306("ܿ᩻") + i3) * 61;
        int i4 = ((iM11306 ^ i2) * (-2309)) ^ 1118432681;
        int i5 = 1860568612;
        while (true) {
            i = ((((i ^ i2) * (-6091)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1965781621:
                case -159323396:
                    if (C2788.m8472() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7759)) ^ 513920988;
                        i5 = 1194379910;
                    } else {
                        iM11306 = C19806.m45029("۫ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20905)) ^ 507612919;
                        i5 = -655121951;
                    }
                    break;
                case -1944420718:
                case 301382646:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    return false;
                case -1897539922:
                case -1179833306:
                    strM35620 = m35620();
                    if (C1025.m3861() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7759)) ^ 513920988;
                        i5 = 1194379910;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܳ᩸")) * 69;
                        i4 = ((iM11306 ^ i3) * 7945) ^ (-1687267225);
                        i5 = 469333713;
                    }
                    break;
                case -1771273480:
                case -369511946:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7759)) ^ 513920988;
                        i5 = 1194379910;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۜ") ^ i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-15245)) ^ (-290098709);
                        i5 = 1735372978;
                    }
                    break;
                case -1666597079:
                case 1778598788:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩶") + i3) * 93;
                        i4 = ((iM11306 ^ i2) * 12501) ^ 2006544829;
                        i5 = -45191074;
                    } else {
                        iM11306 = C19806.m45029("ᩴᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26575)) ^ (-1895367682);
                        i5 = -1119804029;
                    }
                    break;
                case -1521585476:
                case -845789396:
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("֨ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20803)) ^ 1784003343;
                        i5 = 1898446557;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۜ۟")) * 23;
                        i4 = ((iM11306 ^ i3) * 26779) ^ 1673458010;
                        i5 = 1373321542;
                    }
                    break;
                case -1329794727:
                case -171965518:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩶") + i3) * 93;
                        i4 = ((iM11306 ^ i2) * 12501) ^ 2006544829;
                        i5 = -45191074;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27591) ^ (-1584850285);
                        i5 = 942159756;
                    }
                    break;
                case -1267516207:
                case 1566998184:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩶") + i3) * 93;
                        i4 = ((iM11306 ^ i2) * 12501) ^ 2006544829;
                        i5 = -45191074;
                    } else {
                        iM11306 = C19806.m45029("ۡ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11561) ^ 1831666677;
                        i5 = 1306521451;
                    }
                    break;
                case -1009296700:
                case 59460969:
                    C1668.m5583();
                    iM11306 = ThreadFactoryC3888.m11306("ۤ᩸") ^ i2;
                    i4 = ((iM11306 ^ i3) * 379) ^ (-397843);
                    i5 = 802117845;
                    break;
                case -984858224:
                case 1399237644:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("ۙ۟") ^ i2) * (-97);
                        i4 = ((iM11306 ^ i3) * (-2637)) ^ (-1901508548);
                        i5 = -1323067389;
                    } else {
                        iM11306 = C19806.m45029("֨ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20803)) ^ 1784003343;
                        i5 = 1898446557;
                    }
                    break;
                case -711513587:
                case -13692336:
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27591) ^ (-1584850285);
                        i5 = 942159756;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31481)) ^ (-655400832);
                        i5 = 1431691745;
                    }
                    break;
                case -234714689:
                case 407320536:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27591) ^ (-1584850285);
                        i5 = 942159756;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23361)) ^ (-15810633);
                        i5 = 1008140156;
                    }
                    break;
                case -14402297:
                case 163615720:
                    if (C2124.m6673() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27591) ^ (-1584850285);
                        i5 = 942159756;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 379) ^ (-397843);
                        i5 = 802117845;
                    }
                    break;
                case 84399594:
                case 866520119:
                    return !c6094.m16563(strM35620);
                case 513260975:
                case 832491249:
                    if (C0629.m2907()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۘ") ^ i3) * (-15);
                        i4 = ((iM11306 ^ i2) * 7609) ^ (-2045302263);
                        i5 = 1910595890;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7759)) ^ 513920988;
                        i5 = 1194379910;
                    }
                    break;
                default:
                    if (!C2704.f10408) {
                        iM11306 = C19806.m45029("֨ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20803)) ^ 1784003343;
                        i5 = 1898446557;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 379) ^ (-397843);
                        i5 = 802117845;
                    }
                    break;
            }
        }
    }
}
