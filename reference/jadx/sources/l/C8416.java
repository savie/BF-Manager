package l;

import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8416 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int f29172;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static long f29173;

    /* JADX INFO: renamed from: ۡ᩷᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f29174 = {3631, -6804, -6803, -6801, -6806, -6803, -6810, -6820, -6816, -6804, -6803, -6811, -6806, -6812, -6820, -6793, -6806, -6802, -6810, -6804, -6803, -6801, -6806, -6803, -6810, -6820, -6816, -6804, -6803, -6811, -6806, -6812, -6820, -6809, -6814, -6793, -6814, 4666, -7328, -7318, -7299, -7321, -7310, -7317, -7386, -7348, -7325, -7304, -7308, -7348, -7302, -7299, -7307, -7300, -7345, -7313, -7328, -7318, -7299, -7321, -7310, -7317, -7364, -7300, -7299, -7297, -7302, -7299, -7306, -7364, -7355, -7338, -7359, -7360, -7334, -7332, -7331, 9075, -12916, -12915, -12913, -12918, -12915, -12922, -12868, -12928, -12916, -12915, -12923, -12918, -12924, -12868, -12907, -12922, -12911, -12912, -12918, -12916, -12915, -12917, -12905, -12905, -12909, -12912, -12839, -12852, -12852, -12917, -12906, -12927, -12851, -12914, -12905, -12851, -12928, -12928, -12852, -12926, -12909, -12918, -12852, -12928, -12916, -12915, -12923, -12918, -12924, -12836, -12907, -12834, -12847, -12843, -12846, -12845, -12846, -12845, -12843, -12846, -12916, -12915, -12913, -12918, -12915, -12922, -12868, -12928, -12916, -12915, -12923, -12918, -12924, -12868, -12921, -12926, -12905, -12926, -12916, -12915, -12913, -12918, -12915, -12922, -12868, -12928, -12916, -12915, -12923, -12918, -12924, -12868, -12907, -12922, -12911, -12912, -12918, -12916, -12915, -12916, -12915, -12913, -12918, -12915, -12922, -12868, -12928, -12916, -12915, -12923, -12918, -12924, -12868, -12905, -12918, -12914, -12922, 9122, 18126, 18120, 18127, 18143};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C8416 f29175;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29176 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f29177;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized void m22054() {
        short s = f29174[77];
        int i = (s * s) + 343694521;
        int i2 = s + 18539;
        int i3 = (i + i) - (i2 * i2) < 0 ? 65079 : 52707;
        synchronized (C8416.class) {
            if (C16737.m39294() && C1419.m4972() - f29173 >= 10000) {
                if (ApplicationC0716.f2992.getInt(RunnableC0195.m1429(f29174, 78, 21, i3), 0) != 26101061 || Math.abs(((int) (C1460.m5059() / 1000)) - f29172) > 3600) {
                    f29173 = C1419.m4972();
                    try {
                        byte[] bArrM42285 = C18164.m42285(RunnableC1895.m6164(f29174, 99, 39, i3));
                        for (int i4 = 0; i4 < bArrM42285.length; i4++) {
                            bArrM42285[i4] = (byte) (bArrM42285[i4] ^ (i4 * 3));
                        }
                        String str = new String(bArrM42285, StandardCharsets.UTF_8);
                        C8416 c8416 = new C8416(C18164.m42286(str));
                        f29175 = c8416;
                        f29172 = (int) (AbstractC0464.m2311() / 1000);
                        C3660.m10783(C3535.m10429(C2704.m8257(ApplicationC0716.f2992), C1148.m4230(f29174, 138, 18, i3), str).mo4065(26101061, C2332.m7082(f29174, 156, 21, i3)).mo4065(f29172, C1668.m5577(f29174, 177, 18, i3)));
                        m22052(c8416);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22051() {
        long j = 0;
        ExecutorService executorService = null;
        int i = -945310468;
        int i2 = C1419.f5860;
        int i3 = C1398.f5802;
        int iM45029 = (C19806.m45029("ۚ᩹") ^ i3) * (-37);
        int i4 = ((iM45029 ^ i2) * 13521) ^ (-1315386405);
        int i5 = -1446064094;
        while (true) {
            i = ((((i ^ i2) * 4571) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2088381643:
                case 1788726302:
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("᩹ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11581)) ^ 1122223022;
                        i5 = -308020470;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֡") + i3) * (-7);
                        i4 = ((iM45029 ^ i2) * (-29229)) ^ (-987609956);
                        i5 = -357608600;
                    }
                    break;
                case -1802864772:
                case 1021960414:
                    int i6 = 0;
                    if (C0671.f2816 == 0) {
                        C19806.m45014(executorService, new RunnableC18999(i6));
                    }
                    iM45029 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-1953)) ^ 2056336086;
                    i5 = 102706795;
                    break;
                case -1349077922:
                case -913011159:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֨ܽ")) * (-29);
                        i4 = ((iM45029 ^ i2) * 6193) ^ (-425447917);
                        i5 = -227248798;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۜ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * (-6611)) ^ 1377746827;
                        i5 = -486377918;
                    }
                    break;
                case -1067432201:
                case 870815634:
                    if (C0216.m1591() <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֨ܽ")) * (-29);
                        i4 = ((iM45029 ^ i2) * 6193) ^ (-425447917);
                        i5 = -227248798;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܿ") ^ i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 4199) ^ 1691357178;
                        i5 = 80463544;
                    }
                    break;
                case -755290824:
                case 1748926703:
                    j = 0;
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = C19806.m45029("ܶۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15953) ^ (-1341817220);
                        i5 = 879985362;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13723)) ^ 777983973;
                        i5 = 12243423;
                    }
                    break;
                case -742405715:
                case 2143932574:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30195)) ^ 1541521756;
                        i5 = 505769638;
                    } else {
                        iM45029 = C19806.m45029("ܶۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15953) ^ (-1341817220);
                        i5 = 879985362;
                    }
                    break;
                case -321264550:
                case 698195691:
                    C0671.m3008();
                    if (!C0797.f3386) {
                        iM45029 = C19806.m45029("ܶۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15953) ^ (-1341817220);
                        i5 = 879985362;
                    } else {
                        iM45029 = C19806.m45029("᩹ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11581)) ^ 1122223022;
                        i5 = -308020470;
                    }
                    break;
                case 233587604:
                case 526799172:
                    C2477.m7593();
                    C1377.m4833();
                    break;
                case 610489936:
                case 732889665:
                    f29173 = j;
                    executorService = C4716.f16636;
                    if (C19806.f63586) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֨ܽ")) * (-29);
                        i4 = ((iM45029 ^ i2) * 6193) ^ (-425447917);
                        i5 = -227248798;
                    } else {
                        iM45029 = (C19806.m45029("᩹ܽ") + i2) * (-107);
                        i4 = ((iM45029 ^ i3) * (-4349)) ^ 1030698563;
                        i5 = -2010390168;
                    }
                    break;
                case 892387114:
                case 1944837640:
                    C0962.m3746();
                    iM45029 = C19806.m45029("ܶۡ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 15953) ^ (-1341817220);
                    i5 = 879985362;
                    break;
                case 898060237:
                case 939575793:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1953)) ^ 2056336086;
                        i5 = 102706795;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30195)) ^ 1541521756;
                        i5 = 505769638;
                    }
                    break;
                case 935472237:
                case 2097765558:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ܶۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15953) ^ (-1341817220);
                        i5 = 879985362;
                    } else {
                        iM45029 = C19806.m45029("ۢ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28629)) ^ (-1929965747);
                        i5 = 123467787;
                    }
                    break;
                case 952812501:
                case 1579277644:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1953)) ^ 2056336086;
                        i5 = 102706795;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩸") ^ i2) * 101;
                        i4 = ((iM45029 ^ i3) * (-523)) ^ (-1923565710);
                        i5 = 2125031413;
                    }
                    break;
                case 1813611572:
                case 1844214467:
                    f29172 = 0;
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("᩹ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11581)) ^ 1122223022;
                        i5 = -308020470;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25547)) ^ 1580282575;
                        i5 = 364942664;
                    }
                    break;
                default:
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30195)) ^ 1541521756;
                        i5 = 505769638;
                    } else {
                        iM45029 = (C19806.m45029("ۨ֨") + i2) * 13;
                        i4 = ((iM45029 ^ i3) * (-1031)) ^ (-1930840388);
                        i5 = -1279889428;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0125 A[PHI: r14 r23
      0x0125: PHI (r14v3 int) = (r14v1 int), (r14v4 int) binds: [B:31:0x0123, B:7:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r23v4 int) = (r23v2 int), (r23v1 int) binds: [B:31:0x0123, B:7:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x014c A[PHI: r0 r3 r6 r12 r13
      0x014c: PHI (r0v12 l.ۛۧ᩺) = (r0v3 l.ۛۧ᩺), (r0v3 l.ۛۧ᩺), (r0v10 l.ۛۧ᩺), (r0v3 l.ۛۧ᩺) binds: [B:35:0x014a, B:23:0x00ee, B:19:0x00cf, B:15:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r3v4 l.۠᩷ۘ) = (r3v2 l.۠᩷ۘ), (r3v1 l.۠᩷ۘ), (r3v1 l.۠᩷ۘ), (r3v1 l.۠᩷ۘ) binds: [B:35:0x014a, B:23:0x00ee, B:19:0x00cf, B:15:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r6v4 short[]) = (r6v1 short[]), (r6v1 short[]), (r6v2 short[]), (r6v1 short[]) binds: [B:35:0x014a, B:23:0x00ee, B:19:0x00cf, B:15:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v4 int) binds: [B:35:0x014a, B:23:0x00ee, B:19:0x00cf, B:15:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r13v4 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:35:0x014a, B:23:0x00ee, B:19:0x00cf, B:15:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0284 A[PHI: r1 r19 r20
      0x0284: PHI (r1v36 java.util.HashMap) = (r1v10 java.util.HashMap), (r1v12 java.util.HashMap), (r1v44 java.util.HashMap) binds: [B:64:0x0282, B:61:0x0279, B:28:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r19v3 short) = (r19v2 short), (r19v1 short), (r19v1 short) binds: [B:64:0x0282, B:61:0x0279, B:28:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r20v2 int) = (r20v1 int), (r20v1 int), (r20v3 int) binds: [B:64:0x0282, B:61:0x0279, B:28:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02d3 A[PHI: r1
      0x02d3: PHI (r1v22 java.util.HashMap) = (r1v8 java.util.HashMap), (r1v12 java.util.HashMap), (r1v24 java.util.HashMap) binds: [B:69:0x02d1, B:61:0x0279, B:40:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02ef A[PHI: r0 r1 r3 r5 r6 r11 r12 r13 r15
      0x02ef: PHI (r0v11 l.ۛۧ᩺) = (r0v3 l.ۛۧ᩺), (r0v3 l.ۛۧ᩺), (r0v12 l.ۛۧ᩺) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r1v53 java.util.HashMap) = (r1v8 java.util.HashMap), (r1v20 java.util.HashMap), (r1v55 java.util.HashMap) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r3v3 l.۠᩷ۘ) = (r3v1 l.۠᩷ۘ), (r3v1 l.۠᩷ۘ), (r3v4 l.۠᩷ۘ) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r5v3 short[]) = (r5v1 short[]), (r5v2 short[]), (r5v1 short[]) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r6v3 short[]) = (r6v1 short[]), (r6v1 short[]), (r6v4 short[]) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r11v5 l.ۛۧ᩺) = (r11v3 l.ۛۧ᩺), (r11v4 l.ۛۧ᩺), (r11v3 l.ۛۧ᩺) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v4 int) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:69:0x02d1, B:44:0x0185, B:36:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        HashMap map;
        int i;
        int iM11306;
        int i2;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        InterfaceC6025 interfaceC6025 = null;
        String str = null;
        C8416 c8416 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i3 = C1398.f5802;
        int i4 = C2249.f8050;
        int iM45029 = (C19806.m45029("ۗ۠") + i3) * (-85);
        int i5 = ((iM45029 ^ i4) * 1537) ^ (-2053582967);
        int i6 = iM45029 ^ (-106717203);
        InterfaceC6025 interfaceC6026 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 1749864605;
        int i12 = 0;
        int i13 = 0;
        HashMap map5 = null;
        short[] sArr3 = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = i6 ^ ((((i11 ^ i4) * 4651) >> 31) & i5);
            switch (i11) {
                case -2137574645:
                case 1209007183:
                    map = map5;
                    short[] sArr4 = f29174;
                    c = 0;
                    if (C7105.f23796 >= 0) {
                        sArr3 = sArr4;
                        int iM11307 = (ThreadFactoryC3888.m11306("ۜᩴ") + i3) * 119;
                        map5 = map;
                        iM11306 = iM11307;
                        i = ((iM11307 ^ i4) * 32453) ^ 1866598525;
                        i2 = -1635336615;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("᩵᩸") ^ i4;
                        sArr3 = sArr4;
                        i = ((iM11308 ^ i3) * 14973) ^ (-1471952515);
                        interfaceC6025 = interfaceC6025;
                        map5 = map;
                        iM11306 = iM11308;
                        i2 = 1170731847;
                    }
                    int i17 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i17;
                    break;
                case -2109568964:
                case -215224257:
                    RunnableC1895.m6170();
                    C1025.m3861();
                    throw new RuntimeException();
                case -2093764547:
                case 1867170226:
                    map2 = map5;
                    CallableC1627.m5507();
                    if (RunnableC1606.m5473() != 0) {
                        int iM450210 = C19806.m45029("ۧۢ") ^ i4;
                        map5 = map2;
                        iM11306 = iM450210;
                        i = ((iM450210 ^ i3) * 6363) ^ (-21035408);
                        i2 = 860388747;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
                        map5 = map2;
                        iM11306 = iM11309;
                        i = ((iM11309 ^ i4) * (-29203)) ^ (-2042632225);
                        i2 = -636733316;
                    }
                    int i18 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i18;
                    break;
                case -2090495887:
                case -1173412011:
                    i14 = 58627;
                    int iM450211 = C19806.m45029("ۛܿ") ^ i4;
                    i = ((iM450211 ^ i3) * 6271) ^ 1808506253;
                    i2 = 191712969;
                    iM11306 = iM450211;
                    interfaceC6025 = interfaceC6025;
                    map5 = map5;
                    int i19 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i19;
                    break;
                case -2052592501:
                case -1373596133:
                    map2 = map5;
                    s = sArr3[c];
                    if (C3722.f13525 <= 0) {
                        int iM113010 = (i4 - ThreadFactoryC3888.m11306("ۚᩳ")) * (-45);
                        map5 = map2;
                        iM11306 = iM113010;
                        i = ((iM113010 ^ i3) * (-15001)) ^ (-385899850);
                        i2 = -1383654497;
                    } else {
                        int iM450212 = C19806.m45029("᩵ۚ") ^ i3;
                        map5 = map2;
                        iM11306 = iM450212;
                        i = ((iM450212 ^ i4) * (-4203)) ^ 343399050;
                        i2 = 34157080;
                    }
                    int i110 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i110;
                    break;
                case -1714584934:
                case -560429125:
                    map2 = map5;
                    C0671.m3008();
                    if (C2124.f7782 <= 0) {
                        int iM450213 = C19806.m45029("ۧۢ") ^ i4;
                        map5 = map2;
                        iM11306 = iM450213;
                        i = ((iM450213 ^ i3) * 6363) ^ (-21035408);
                        i2 = 860388747;
                    } else {
                        int iM113011 = (i4 - ThreadFactoryC3888.m11306("ۚᩳ")) * (-45);
                        map5 = map2;
                        iM11306 = iM113011;
                        i = ((iM113011 ^ i3) * (-15001)) ^ (-385899850);
                        i2 = -1383654497;
                    }
                    int i111 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i111;
                    break;
                case -1657487522:
                case 1228181407:
                    map3 = map5;
                    i12 = s * s;
                    if (RunnableC0195.m1431()) {
                        int iM113012 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i4;
                        i = ((iM113012 ^ i3) * 22315) ^ 803305043;
                        map5 = map3;
                        iM11306 = iM113012;
                        i2 = 905832910;
                        i16 = 289272064;
                    } else {
                        i16 = 289272064;
                        int iM450214 = (C19806.m45029("᩷ۘ") ^ i3) * 69;
                        map5 = map3;
                        iM11306 = iM450214;
                        i = ((iM450214 ^ i4) * 31093) ^ (-36700493);
                        i2 = -834931637;
                    }
                    int i112 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i112;
                    break;
                case -1438513462:
                case -174226550:
                    HashMap map6 = map5;
                    if (i10 - (i12 + i16) <= 0) {
                        int iM450215 = (C19806.m45029("ܽۙ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        map5 = map6;
                        iM11306 = iM450215;
                        i = ((iM450215 ^ i3) * (-20725)) ^ (-411276948);
                        i2 = -780421776;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("֫ᩴ") + i3) * 95;
                        map5 = map6;
                        iM11306 = iM113013;
                        i = ((iM113013 ^ i4) * 24243) ^ 1727868077;
                        i2 = -1134195975;
                    }
                    int i113 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i113;
                    break;
                case -938146509:
                case 340933898:
                    map4 = map5;
                    if (str != null) {
                        int iM450216 = (C19806.m45029("֡᩵") + i4) * (-15);
                        map5 = map4;
                        iM11306 = iM450216;
                        i = ((iM450216 ^ i3) * 14761) ^ (-2078497186);
                        i2 = -389674334;
                    } else {
                        int iM113014 = (ThreadFactoryC3888.m11306("ۨ᩶") + i4) * 27;
                        map5 = map4;
                        iM11306 = iM113014;
                        i = ((iM113014 ^ i3) * 32143) ^ (-689204836);
                        i2 = -1846049272;
                    }
                    int i114 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i114;
                    break;
                case -888224670:
                case 1360896581:
                    map2 = map5;
                    interfaceC6026 = ApplicationC0716.f2992;
                    sArr = f29174;
                    i15 = 1;
                    if (C0817.m3399()) {
                        int iM113015 = ThreadFactoryC3888.m11306("ܽܿ") ^ i3;
                        map5 = map2;
                        iM11306 = iM113015;
                        i = ((iM113015 ^ i4) * 16999) ^ 40886205;
                        i2 = 1060470957;
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
                        map5 = map2;
                        iM11306 = iM113016;
                        i = ((iM113016 ^ i4) * (-29203)) ^ (-2042632225);
                        i2 = -636733316;
                    }
                    int i115 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i115;
                    break;
                case -835545611:
                case -614108249:
                    f29175 = new C8416(map5);
                    return;
                case -343861328:
                case -249971948:
                    C0629.m2907();
                    map2 = map5;
                    int iM450217 = C19806.m45029("ۧۢ") ^ i4;
                    map5 = map2;
                    iM11306 = iM450217;
                    i = ((iM450217 ^ i3) * 6363) ^ (-21035408);
                    i2 = 860388747;
                    int i116 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i116;
                    break;
                case -313417794:
                case 57879613:
                    f29175 = c8416;
                    f29172 = i13;
                    return;
                case -36071887:
                case 1390706321:
                    c8416 = new C8416(C18164.m42286(str));
                    if (C3577.f13150 >= 0) {
                        map2 = map5;
                        int iM113017 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
                        map5 = map2;
                        iM11306 = iM113017;
                        i = ((iM113017 ^ i4) * (-29203)) ^ (-2042632225);
                        i2 = -636733316;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۡ") ^ i3;
                        i = ((iM11306 ^ i4) * 12515) ^ (-326737592);
                        i2 = -968602584;
                    }
                    int i117 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i117;
                    break;
                case 6667406:
                case 178523701:
                    i13 = interfaceC6026.getInt(ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr, i15, i7, i14), 0);
                    if (C1875.f7103 >= 0) {
                        map3 = map5;
                        int iM450218 = (C19806.m45029("᩷ۘ") ^ i3) * 69;
                        map5 = map3;
                        iM11306 = iM450218;
                        i = ((iM450218 ^ i4) * 31093) ^ (-36700493);
                        i2 = -834931637;
                    } else {
                        iM11306 = (C19806.m45029("᩷ۜ") + i3) * 87;
                        i = ((iM11306 ^ i4) * 26111) ^ (-1501152407);
                        i2 = -1919497938;
                    }
                    int i118 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i118;
                    break;
                case 44006793:
                case 689913056:
                    i10 = s * 34016;
                    if (C1148.f5161 <= 0) {
                        map2 = map5;
                        int iM113018 = (i4 - ThreadFactoryC3888.m11306("ۚᩳ")) * (-45);
                        map5 = map2;
                        iM11306 = iM113018;
                        i = ((iM113018 ^ i3) * (-15001)) ^ (-385899850);
                        i2 = -1383654497;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܿ") ^ i3) * (-65);
                        i = ((iM11306 ^ i4) * 14541) ^ 925120224;
                        i2 = -1840055148;
                    }
                    int i119 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i119;
                    break;
                case 239153995:
                case 1388973287:
                    C2124.m6673();
                    if (C1066.m4023() > 0) {
                        map = map5;
                        int iM113019 = (ThreadFactoryC3888.m11306("ۜᩴ") + i3) * 119;
                        map5 = map;
                        iM11306 = iM113019;
                        i = ((iM113019 ^ i4) * 32453) ^ 1866598525;
                        i2 = -1635336615;
                        int i1110 = iM11306 ^ i2;
                        i5 = i;
                        i6 = i1110;
                    }
                    map2 = map5;
                    int iM1130110 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
                    map5 = map2;
                    iM11306 = iM1130110;
                    i = ((iM1130110 ^ i4) * (-29203)) ^ (-2042632225);
                    i2 = -636733316;
                    int i1111 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i1111;
                    break;
                case 335918806:
                case 685290560:
                    interfaceC6025 = ApplicationC0716.f2992;
                    sArr2 = f29174;
                    i8 = 19;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۧ") ^ i4;
                        i = ((iM11306 ^ i3) * (-163)) ^ 606667861;
                        i2 = -2001059836;
                    } else {
                        map2 = map5;
                        int iM1130111 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
                        map5 = map2;
                        iM11306 = iM1130111;
                        i = ((iM1130111 ^ i4) * (-29203)) ^ (-2042632225);
                        i2 = -636733316;
                    }
                    int i1112 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i1112;
                    break;
                case 337662706:
                case 1557046559:
                    i7 = 18;
                    if (C2871.m8646()) {
                        iM11306 = C19806.m45029("᩶ۜ") ^ i4;
                        i = ((iM11306 ^ i3) * 6785) ^ (-1692650737);
                        i2 = -1073359161;
                    } else {
                        map2 = map5;
                        int iM1130112 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
                        map5 = map2;
                        iM11306 = iM1130112;
                        i = ((iM1130112 ^ i4) * (-29203)) ^ (-2042632225);
                        i2 = -636733316;
                    }
                    int i1113 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i1113;
                    break;
                case 801137438:
                case 2100959366:
                    String strM1433 = RunnableC0195.m1433(interfaceC6025, C7105.m18989(sArr2, i8, i9, i14), null);
                    if (i13 > 0) {
                        int iM450219 = (C19806.m45029("֡ۖ") ^ i3) * (-27);
                        map5 = null;
                        str = strM1433;
                        iM11306 = iM450219;
                        i = ((iM450219 ^ i4) * (-13027)) ^ (-1146267054);
                        i2 = -1129419909;
                    } else {
                        str = strM1433;
                        map4 = null;
                        int iM1130113 = (ThreadFactoryC3888.m11306("ۨ᩶") + i4) * 27;
                        map5 = map4;
                        iM11306 = iM1130113;
                        i = ((iM1130113 ^ i3) * 32143) ^ (-689204836);
                        i2 = -1846049272;
                    }
                    int i1114 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i1114;
                    break;
                case 1222257381:
                case 2025283484:
                    i9 = 18;
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("֫۟") ^ i3;
                        i = ((iM11306 ^ i4) * (-24581)) ^ (-2062426502);
                        i2 = 1445960687;
                    } else {
                        map3 = map5;
                        int iM4502110 = (C19806.m45029("᩷ۘ") ^ i3) * 69;
                        map5 = map3;
                        iM11306 = iM4502110;
                        i = ((iM4502110 ^ i4) * 31093) ^ (-36700493);
                        i2 = -834931637;
                    }
                    int i1115 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i1115;
                    break;
                default:
                    i14 = 51506;
                    int iM4502111 = C19806.m45029("ۛܿ") ^ i4;
                    i = ((iM4502111 ^ i3) * 6271) ^ 1808506253;
                    i2 = 191712969;
                    iM11306 = iM4502111;
                    interfaceC6025 = interfaceC6025;
                    map5 = map5;
                    int i1116 = iM11306 ^ i2;
                    i5 = i;
                    i6 = i1116;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C8416 m22053() {
        return f29175;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22055(String str, String str2) {
        String str3 = null;
        int i = 1191008229;
        int i2 = C1875.f7103;
        int i3 = AbstractC0464.f2088;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("۠ܳ")) * 19;
        int i4 = ((iM11306 ^ i2) * 6067) ^ (-157121188);
        int i5 = -475746636;
        while (true) {
            i = ((((i ^ i2) * 18723) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2068061071:
                case -1764826561:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * 28345) ^ 1909438700;
                        i5 = 1527087367;
                    } else {
                        iM11306 = (i2 - C19806.m45029("֡֨")) * (-85);
                        i4 = ((iM11306 ^ i3) * 9081) ^ 1887862079;
                        i5 = 297760449;
                    }
                    break;
                case -1770727227:
                case 312011569:
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2581) ^ (-1004041883);
                        i5 = 1795693971;
                    } else {
                        iM11306 = (C19806.m45029("ܰܺ") ^ i3) * (-29);
                        i4 = ((iM11306 ^ i2) * (-32127)) ^ 1270982328;
                        i5 = -1629856895;
                    }
                    break;
                case -1699726586:
                case -1405462672:
                    str3 = (String) this.f29177.get(str);
                    if (str3 == null) {
                        iM11306 = C19806.m45029("ܳܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27)) ^ 183363768;
                        i5 = 435288840;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ۬")) * (-87);
                        i4 = ((iM11306 ^ i2) * 16833) ^ (-904324534);
                        i5 = 1304937835;
                    }
                    break;
                case -1653583531:
                case -768885479:
                    if (C1875.f7103 < 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܽۢ")) * (-57);
                        i4 = ((iM11306 ^ i3) * 24121) ^ (-890717674);
                        i5 = 2012704154;
                    } else {
                        iM11306 = C19806.m45029("ܰۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31181)) ^ 1968934499;
                        i5 = 1949803387;
                    }
                    break;
                case -1626974854:
                case -422312565:
                    C2642.m8171();
                    iM11306 = C19806.m45029("۬ܿ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 2581) ^ (-1004041883);
                    i5 = 1795693971;
                    break;
                case -1382022969:
                case -1070445742:
                    if (C0817.m3399()) {
                        iM11306 = (C19806.m45029("ܶ᩵") ^ i2) * (-115);
                        i4 = ((iM11306 ^ i3) * (-11363)) ^ (-1373870449);
                        i5 = -2123621628;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܽۢ")) * (-57);
                        i4 = ((iM11306 ^ i3) * 24121) ^ (-890717674);
                        i5 = 2012704154;
                    }
                    break;
                case -943590614:
                case 690376710:
                    if (C0797.m3359()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩷") ^ i3) * 87;
                        i4 = ((iM11306 ^ i2) * (-17453)) ^ 1438515393;
                        i5 = -1814521434;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * 28345) ^ 1909438700;
                        i5 = 1527087367;
                    }
                    break;
                case -759978092:
                case 1644598886:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * 28345) ^ 1909438700;
                        i5 = 1527087367;
                    } else {
                        iM11306 = C19806.m45029("ܶۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27495)) ^ (-496972768);
                        i5 = -1038637619;
                    }
                    break;
                case -741479284:
                case 598440965:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2581) ^ (-1004041883);
                        i5 = 1795693971;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10469)) ^ (-1538799443);
                        i5 = -1821066773;
                    }
                    break;
                case -709791422:
                case 906503827:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = C19806.m45029("ܰۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31181)) ^ 1968934499;
                        i5 = 1949803387;
                    } else {
                        iM11306 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2581) ^ (-1004041883);
                        i5 = 1795693971;
                    }
                    break;
                case -637557202:
                case 1122836568:
                    if (C1977.m6356()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * 28345) ^ 1909438700;
                        i5 = 1527087367;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟᩶") ^ i3) * q.h;
                        i4 = ((iM11306 ^ i2) * (-7833)) ^ (-872370814);
                        i5 = -70716516;
                    }
                    break;
                case -511377162:
                case 746732488:
                    if (C10634.f36300 < 0) {
                        iM11306 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2581) ^ (-1004041883);
                        i5 = 1795693971;
                    } else {
                        iM11306 = C19806.m45029("ۘ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22773)) ^ (-496803450);
                        i5 = -988660378;
                    }
                    break;
                case -407065929:
                case 1827115784:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * 28345) ^ 1909438700;
                        i5 = 1527087367;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14301)) ^ (-209895375);
                        i5 = -589666263;
                    }
                    break;
                case -300280809:
                case -222294321:
                    return str2;
                case -112247229:
                case 128393345:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2581) ^ (-1004041883);
                        i5 = 1795693971;
                    } else {
                        iM11306 = (C19806.m45029("᩺᩷") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * 8987) ^ 142428968;
                        i5 = -2145613320;
                    }
                    break;
                case 266047567:
                case 862615399:
                    C3660.m10791();
                    return null;
                case 1449015153:
                case 2017816932:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * 39;
                        i4 = ((iM11306 ^ i2) * 28345) ^ 1909438700;
                        i5 = 1527087367;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10993)) ^ 12833914;
                        i5 = -106358908;
                    }
                    break;
                default:
                    return str3;
            }
        }
    }

    public C8416(HashMap map) {
        Map map2 = null;
        int i = -57951647;
        int i2 = C3722.f13525;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11306 = ThreadFactoryC3888.m11306("ܶۡ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-30463)) ^ (-624867662);
        int i5 = -1259828303;
        while (true) {
            i = ((((i ^ i2) * 4305) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1957865809:
                case -1647234165:
                    return;
                case -1623035044:
                case 1127387678:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ۢᩳ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i2) * (-3459)) ^ (-709369567);
                        i5 = -1502987843;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11985)) ^ (-130618195);
                        i5 = -590976841;
                    }
                    break;
                case -1499451451:
                case -321730593:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ᩳ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-31811)) ^ (-1186911314);
                        i5 = 1858602300;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩺᩹")) * 41;
                        i4 = ((iM11306 ^ i2) * (-3365)) ^ 1524213564;
                        i5 = 2080920583;
                    }
                    break;
                case -1306589771:
                case -966523707:
                    C3535.m10431();
                    throw new RuntimeException();
                case -1262117569:
                case 1863750997:
                    if (C3743.m10966() <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ᩳ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-31811)) ^ (-1186911314);
                        i5 = 1858602300;
                    } else {
                        iM11306 = C19806.m45029("᩶ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32563)) ^ 781282895;
                        i5 = 2104910702;
                    }
                    break;
                case -1140694133:
                case -96123242:
                    C1875.m6086();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23895) ^ 453017800;
                        i5 = -872654429;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ᩳۜ")) * (-33);
                        i4 = ((iM11306 ^ i3) * 20187) ^ 1106709720;
                        i5 = -314481654;
                    }
                    break;
                case -844317366:
                case -278602128:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ᩳ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-31811)) ^ (-1186911314);
                        i5 = 1858602300;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6189)) ^ 388510473;
                        i5 = -499925651;
                    }
                    break;
                case -596161116:
                case 2144940603:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23895) ^ 453017800;
                        i5 = -872654429;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵֨") + i2) * 17;
                        i4 = ((iM11306 ^ i3) * (-1945)) ^ (-877248445);
                        i5 = 2072634287;
                    }
                    break;
                case -528931187:
                case 23914629:
                    this.f29177 = map2;
                    if (C0526.m2437() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23895) ^ 453017800;
                        i5 = -872654429;
                    } else {
                        iM11306 = C19806.m45029("ۧܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25599)) ^ 960860433;
                        i5 = -843230924;
                    }
                    break;
                case -389825578:
                case 1631183250:
                    if (C19806.m45024()) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3981)) ^ 2125141454;
                        i5 = -1701870066;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۛ") ^ i2) * (-63);
                        i4 = ((iM11306 ^ i3) * 32477) ^ (-1434365088);
                        i5 = -1016011509;
                    }
                    break;
                case -262824904:
                case 999119693:
                    C2871.m8646();
                    if (!C1377.f5749) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ᩳ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-31811)) ^ (-1186911314);
                        i5 = 1858602300;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23895) ^ 453017800;
                        i5 = -872654429;
                    }
                    break;
                case -204183924:
                case 112402640:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ᩳۜ")) * (-33);
                        i4 = ((iM11306 ^ i3) * 20187) ^ 1106709720;
                        i5 = -314481654;
                    } else {
                        iM11306 = C19806.m45029("ܳۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-5049)) ^ (-578190920);
                        i5 = 1823362814;
                    }
                    break;
                case -105347986:
                case 1621684721:
                    if (C0797.m3359()) {
                        iM11306 = (C19806.m45029("ۜۙ") ^ i2) * (-125);
                        i4 = ((iM11306 ^ i3) * (-7059)) ^ 485760384;
                        i5 = 1574221226;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ᩳ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-31811)) ^ (-1186911314);
                        i5 = 1858602300;
                    }
                    break;
                case 101806034:
                case 549634007:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3981)) ^ 2125141454;
                        i5 = -1701870066;
                    } else {
                        iM11306 = (C19806.m45029("ۘ᩺") ^ i3) * (-91);
                        i4 = ((iM11306 ^ i2) * 12945) ^ 2076641319;
                        i5 = 1579256834;
                    }
                    break;
                case 367687789:
                case 1249297625:
                    if (map == null) {
                        iM11306 = C19806.m45029("ۤ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26291)) ^ 104142653;
                        i5 = -588997708;
                    } else {
                        map2 = map;
                        iM11306 = (C19806.m45029("ۡᩳ") + i3) * (-25);
                        i4 = ((iM11306 ^ i2) * (-12039)) ^ (-1041135819);
                        i5 = -1496490446;
                    }
                    break;
                case 540302801:
                case 1794966217:
                    RunnableC0195.m1431();
                    C0526.m2437();
                    iM11306 = (i2 - C19806.m45029("ᩳۜ")) * (-33);
                    i4 = ((iM11306 ^ i3) * 20187) ^ 1106709720;
                    i5 = -314481654;
                    break;
                case 627906633:
                case 841387741:
                    C1937.m6279();
                    if (C0629.f2722 > 0) {
                        iM11306 = (C19806.m45029("ۢᩳ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i2) * (-3459)) ^ (-709369567);
                        i5 = -1502987843;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23895) ^ 453017800;
                        i5 = -872654429;
                    }
                    break;
                default:
                    map2 = Collections.EMPTY_MAP;
                    iM11306 = (C19806.m45029("ۡᩳ") + i3) * (-25);
                    i4 = ((iM11306 ^ i2) * (-12039)) ^ (-1041135819);
                    i5 = -1496490446;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x023c A[PHI: r4 r5 r6 r7 r10 r11 r16
      0x023c: PHI (r4v4 short) = (r4v2 short), (r4v2 short), (r4v3 short), (r4v2 short) binds: [B:7:0x0049, B:63:0x023a, B:51:0x01c6, B:47:0x01a1] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r5v4 short) = (r5v2 short), (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:7:0x0049, B:63:0x023a, B:51:0x01c6, B:47:0x01a1] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:7:0x0049, B:63:0x023a, B:51:0x01c6, B:47:0x01a1] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:7:0x0049, B:63:0x023a, B:51:0x01c6, B:47:0x01a1] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:7:0x0049, B:63:0x023a, B:51:0x01c6, B:47:0x01a1] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r11v8 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:7:0x0049, B:63:0x023a, B:51:0x01c6, B:47:0x01a1] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r16v10 java.lang.String) = (r16v2 java.lang.String), (r16v6 java.lang.String), (r16v9 java.lang.String), (r16v11 java.lang.String) binds: [B:7:0x0049, B:63:0x023a, B:51:0x01c6, B:47:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x029d A[PHI: r3 r16
      0x029d: PHI (r3v6 char) = (r3v2 char), (r3v3 char), (r3v2 char) binds: [B:71:0x029b, B:55:0x01e7, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r16v31 java.lang.String) = (r16v4 java.lang.String), (r16v8 java.lang.String), (r16v32 java.lang.String) binds: [B:71:0x029b, B:55:0x01e7, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (l.C3660.f13403 >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m22056(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8416.m22056(java.lang.String):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:121:0x03fa A[PHI: r10 r12 r19 r22
      0x03fa: PHI (r10v3 char) = (r10v2 char), (r10v1 char), (r10v1 char) binds: [B:120:0x03f8, B:112:0x039c, B:89:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:120:0x03f8, B:112:0x039c, B:89:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r19v27 java.lang.String[]) = (r19v17 java.lang.String[]), (r19v19 java.lang.String[]), (r19v29 java.lang.String[]) binds: [B:120:0x03f8, B:112:0x039c, B:89:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r22v17 int) = (r22v7 int), (r22v9 int), (r22v19 int) binds: [B:120:0x03f8, B:112:0x039c, B:89:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x04a2 A[PHI: r9 r14 r19 r22
      0x04a2: PHI (r9v3 short[]) = (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:132:0x04a0, B:104:0x033f, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x04a2: PHI (r14v3 short) = (r14v1 short), (r14v2 short), (r14v1 short) binds: [B:132:0x04a0, B:104:0x033f, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x04a2: PHI (r19v36 java.lang.String[]) = (r19v13 java.lang.String[]), (r19v22 java.lang.String[]), (r19v37 java.lang.String[]) binds: [B:132:0x04a0, B:104:0x033f, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x04a2: PHI (r22v24 int) = (r22v3 int), (r22v12 int), (r22v25 int) binds: [B:132:0x04a0, B:104:0x033f, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22052(C8416 c8416) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM450211;
        int i7;
        String[] strArr;
        String strM22055 = null;
        String[] strArrM5056 = null;
        int i8 = 0;
        int iM10058 = 0;
        C15432 c15432M46724 = null;
        boolean zM4231 = false;
        int iM4036 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 303064769;
        int i13 = C1025.f4800;
        int i14 = C2477.f9839;
        int iM11306 = (ThreadFactoryC3888.m11306("ۗۧ") ^ i14) * 87;
        int i15 = ((iM11306 ^ i13) * 25847) ^ (-31736775);
        int i16 = iM11306 ^ 1469317693;
        RunnableC15554 runnableC15554 = null;
        int i17 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * (-22985)) >> 31));
            switch (i12) {
                case -2002470604:
                case -1239015054:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    try {
                        strM22055 = c8416.m22055(C2332.m7082(f29174, 38, 16, i11), null);
                        iM450210 = C19806.m45029("ۧ۟") ^ i14;
                        i3 = ((iM450210 ^ i13) * (-5839)) ^ 841267928;
                        i4 = -1139854362;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    } catch (Exception unused) {
                        strArrM5056 = strArrM5056;
                        int iM11307 = (ThreadFactoryC3888.m11306("֡ۛ") + i14) * (-43);
                        i16 = iM11307 ^ (-1170041690);
                        i15 = ((iM11307 ^ i13) * (-6117)) ^ 1602305272;
                        i8 = i8;
                    }
                    break;
                case -1907718070:
                case 1992422177:
                    if (!C1461.m5080()) {
                        iM45029 = C19806.m45029("᩺ܶ") ^ i13;
                        i = ((iM45029 ^ i14) * (-12329)) ^ 1550770847;
                        i2 = -137193229;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    } else {
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                        iM450210 = C19806.m45029("ۡ᩷") ^ i14;
                        i3 = ((iM450210 ^ i13) * 10499) ^ 378349536;
                        i4 = -819340256;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    }
                    break;
                case -1885411920:
                case 1021774181:
                    if (!zM4231) {
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                        iM4036 = i17;
                        iM450211 = ThreadFactoryC3888.m11306("۠ۡ") ^ i14;
                        i3 = ((iM450211 ^ i13) * 10461) ^ (-1469478236);
                        i7 = -1687983417;
                        i5 = iM450211 ^ i7;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    } else {
                        iM45029 = (C19806.m45029("ۢۘ") + i14) * 43;
                        i = ((iM45029 ^ i13) * (-14091)) ^ 194089974;
                        i2 = 973849377;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1853516674:
                case 322632021:
                    i11 = 24672;
                    iM450210 = (ThreadFactoryC3888.m11306("ܳۙ") + i13) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i3 = ((iM450210 ^ i14) * 2559) ^ (-70396061);
                    i4 = -1288992482;
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -1843430813:
                case 560325316:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    int i18 = s + s2;
                    if (i10 - (i18 * i18) <= 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۙܽ") ^ i14) * 63;
                        i3 = ((iM450210 ^ i13) * o.a.p) ^ 1881121498;
                        i4 = -1221990249;
                    } else {
                        iM450210 = (C19806.m45029("᩺ۜ") + i13) * (-21);
                        i3 = ((iM450210 ^ i14) * (-6743)) ^ 1550199862;
                        i4 = 1889964741;
                    }
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -1817355501:
                case -1354602332:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    s2 = 1;
                    if (C2249.m6915() <= 0) {
                        iM450210 = C19806.m45029("ۡ᩷") ^ i14;
                        i3 = ((iM450210 ^ i13) * 10499) ^ 378349536;
                        i4 = -819340256;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ᩳܽ") + i13) * (-35);
                        i3 = ((iM450210 ^ i14) * (-13107)) ^ (-481652936);
                        i4 = -450557290;
                    }
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -1726982031:
                case 125942464:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    i9 = s * 2;
                    if (RunnableC1895.f7152) {
                        iM450210 = ThreadFactoryC3888.m11306("᩻᩸") ^ i13;
                        i3 = ((iM450210 ^ i14) * 10539) ^ (-868744728);
                        i4 = -1026395521;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                    } else {
                        int iM450212 = (C19806.m45029("᩷ᩳ") + i14) * 87;
                        i3 = ((iM450212 ^ i13) * (-30105)) ^ (-406904014);
                        i5 = iM450212 ^ (-640907573);
                        i8 = i8;
                        runnableC15554 = null;
                    }
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -1645753522:
                case -582708565:
                    break;
                case -1586849847:
                case 1029522857:
                    strArrM5056 = C1460.m5056(C1937.m6290(strM22055), C1398.m4892(f29174, 54, 2, i11));
                    i8 = 0;
                    try {
                        iM10058 = RunnableC3388.m10058(strArrM5056[0]);
                        iM45029 = (i13 - C19806.m45029("ܳ۫")) * (-111);
                        i = ((iM45029 ^ i14) * (-25337)) ^ (-1621193);
                        i2 = 995046775;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    } catch (Exception unused2) {
                        i8 = 0;
                        int iM11308 = (ThreadFactoryC3888.m11306("֡ۛ") + i14) * (-43);
                        i16 = iM11308 ^ (-1170041690);
                        i15 = ((iM11308 ^ i13) * (-6117)) ^ 1602305272;
                        i8 = i8;
                    }
                    break;
                case -1494273403:
                case -522920970:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    if (C1398.f5802 <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ܳ᩶") ^ i13;
                        i3 = ((iM450210 ^ i14) * 6857) ^ 209950783;
                        i4 = -8029632;
                    } else {
                        iM450210 = (C19806.m45029("ܶᩴ") ^ i14) * 11;
                        i3 = ((iM450210 ^ i13) * 28851) ^ 758818514;
                        i4 = -1334860621;
                    }
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -1447299978:
                case 411922968:
                    if (!C0526.f2219) {
                        iM45029 = C19806.m45029("᩺ܶ") ^ i13;
                        i = ((iM45029 ^ i14) * (-12329)) ^ 1550770847;
                        i2 = -137193229;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    } else {
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                        iM450210 = (C19806.m45029("֫֫") ^ i14) * 119;
                        i3 = ((iM450210 ^ i13) * 11093) ^ 631550568;
                        i4 = 1407690435;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    }
                    break;
                case -1378283237:
                case 1667582317:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    int i19 = 1;
                    if (!C10634.m26820()) {
                        RunnableC15554 runnableC15555 = new RunnableC15554(i19);
                        if (C0629.f2722 > 0) {
                            int iM450213 = C19806.m45029("ۗۘ") ^ i14;
                            int i20 = ((iM450213 ^ i13) * 5541) ^ (-330460513);
                            i6 = iM450213 ^ 1522686809;
                            runnableC15554 = runnableC15555;
                            i15 = i20;
                            i8 = i8;
                            strArr = strArrM5056;
                            i16 = i6;
                            strArrM5056 = strArr;
                        } else {
                            runnableC15554 = runnableC15555;
                            iM450210 = ThreadFactoryC3888.m11306("ܳ᩶") ^ i13;
                            i3 = ((iM450210 ^ i14) * 6857) ^ 209950783;
                            i4 = -8029632;
                            i5 = iM450210 ^ i4;
                            i8 = i8;
                        }
                    } else {
                        int iM450214 = (C19806.m45029("᩷ᩳ") + i14) * 87;
                        i3 = ((iM450214 ^ i13) * (-30105)) ^ (-406904014);
                        i5 = iM450214 ^ (-640907573);
                        i8 = i8;
                        runnableC15554 = null;
                    }
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -1200247856:
                case 1862141464:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    if (iM10058 > 14) {
                        int iM11309 = ThreadFactoryC3888.m11306("᩺᩺") ^ i14;
                        int i21 = ((iM11309 ^ i13) * (-21977)) ^ 2093641983;
                        i6 = iM11309 ^ 2118561175;
                        i15 = i21;
                        i8 = i8;
                        i17 = 14;
                        strArr = strArrM5056;
                        i16 = i6;
                        strArrM5056 = strArr;
                    } else {
                        i17 = 14;
                        strArrM5056 = strArrM5056;
                        int iM113010 = (ThreadFactoryC3888.m11306("֡ۛ") + i14) * (-43);
                        i16 = iM113010 ^ (-1170041690);
                        i15 = ((iM113010 ^ i13) * (-6117)) ^ 1602305272;
                        i8 = i8;
                    }
                    break;
                case -1148648285:
                case -404229813:
                    C3660.m10791();
                    iM45029 = C19806.m45029("᩺ܶ") ^ i13;
                    i = ((iM45029 ^ i14) * (-12329)) ^ 1550770847;
                    i2 = -137193229;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    break;
                case -1088932488:
                case -811035299:
                    if (ThreadFactoryC3888.m11300() > 0) {
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                        iM450210 = ThreadFactoryC3888.m11306("ۗۖ") ^ i14;
                        i3 = ((iM450210 ^ i13) * 635) ^ 1099652066;
                        i4 = -877078382;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    } else {
                        iM45029 = C19806.m45029("᩺ܶ") ^ i13;
                        i = ((iM45029 ^ i14) * (-12329)) ^ 1550770847;
                        i2 = -137193229;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1051431908:
                case 1649037571:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    c = '%';
                    if (RunnableC1895.f7152) {
                        iM450210 = (i13 - ThreadFactoryC3888.m11306("ۤ᩹")) * 17;
                        i3 = ((iM450210 ^ i14) * 16741) ^ 249516378;
                        i4 = -119722090;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                    } else {
                        int iM450215 = (C19806.m45029("᩷ᩳ") + i14) * 87;
                        i3 = ((iM450215 ^ i13) * (-30105)) ^ (-406904014);
                        i5 = iM450215 ^ (-640907573);
                        i8 = i8;
                        runnableC15554 = null;
                    }
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -974127522:
                case 656070584:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    if (C1461.f5957 <= 0) {
                        iM450210 = (C19806.m45029("֫֫") ^ i14) * 119;
                        i3 = ((iM450210 ^ i13) * 11093) ^ 631550568;
                        i4 = 1407690435;
                    } else {
                        iM450210 = C19806.m45029("۬۬") ^ i13;
                        i3 = ((iM450210 ^ i14) * (-26543)) ^ (-217169790);
                        i4 = 811987641;
                    }
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -901067359:
                case -868292144:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    if (strM22055 != null) {
                        iM450211 = (C19806.m45029("֨᩹") ^ i13) * 127;
                        i3 = ((iM450211 ^ i14) * (-29055)) ^ 1534285676;
                        i7 = 646432299;
                        i5 = iM450211 ^ i7;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    } else {
                        strArrM5056 = strArrM5056;
                        int iM113011 = (ThreadFactoryC3888.m11306("֡ۛ") + i14) * (-43);
                        i16 = iM113011 ^ (-1170041690);
                        i15 = ((iM113011 ^ i13) * (-6117)) ^ 1602305272;
                        i8 = i8;
                    }
                    break;
                case -786339887:
                case 308333037:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    i10 = i9 + 1;
                    if (C3286.m9798() <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۗۖ") ^ i14;
                        i3 = ((iM450210 ^ i13) * 635) ^ 1099652066;
                        i4 = -877078382;
                    } else {
                        iM450210 = C19806.m45029("ܶܿ") ^ i14;
                        i3 = ((iM450210 ^ i13) * 20809) ^ 2009886111;
                        i4 = -546076541;
                    }
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -689444052:
                case -346902488:
                    if (iM4036 >= iM10058) {
                        i8 = i8;
                        int iM113012 = (ThreadFactoryC3888.m11306("֡ۛ") + i14) * (-43);
                        i16 = iM113012 ^ (-1170041690);
                        i15 = ((iM113012 ^ i13) * (-6117)) ^ 1602305272;
                        i8 = i8;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩺") ^ i13;
                        i = ((iM45029 ^ i14) * (-13999)) ^ 58329662;
                        i2 = -1508440607;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case -496311251:
                case 678655556:
                    try {
                        iM4036 = C1066.m4036(c15432M46724.m46713());
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                    } catch (Exception unused3) {
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                        iM4036 = i17;
                    }
                    iM450211 = ThreadFactoryC3888.m11306("۠ۡ") ^ i14;
                    i3 = ((iM450211 ^ i13) * 10461) ^ (-1469478236);
                    i7 = -1687983417;
                    i5 = iM450211 ^ i7;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -425906842:
                case 728536449:
                    i11 = 58131;
                    iM450210 = (ThreadFactoryC3888.m11306("ܳۙ") + i13) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i3 = ((iM450210 ^ i14) * 2559) ^ (-70396061);
                    i4 = -1288992482;
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -301625660:
                case 660625344:
                    C1066.m4023();
                    C1461.m5080();
                    break;
                case -166279278:
                case 589070284:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    s = sArr[c];
                    if (C0216.m1591() <= 0) {
                        iM450210 = (i13 - C19806.m45029("ۢܿ")) * (-85);
                        i3 = ((iM450210 ^ i14) * (-2903)) ^ (-867213840);
                        i4 = -944426756;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܿ۫") ^ i14;
                        i3 = ((iM450210 ^ i13) * 20527) ^ (-522459022);
                        i4 = -383665901;
                    }
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case -133848723:
                case 1771055968:
                    if (C3722.f13525 > 0) {
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                        iM450210 = ThreadFactoryC3888.m11306("ܳ᩶") ^ i13;
                        i3 = ((iM450210 ^ i14) * 6857) ^ 209950783;
                        i4 = -8029632;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۛ") ^ i13) * (-51);
                        i = ((iM45029 ^ i14) * 24725) ^ (-911297750);
                        i2 = -488288423;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case 242541625:
                case 1087231745:
                    try {
                        try {
                            strArrM5056 = strArrM5056;
                            i8 = i8;
                            try {
                                c15432M46724 = C1189.m4364(C11904.f39938, C1419.m4969(f29174, 56, 21, i11)).m46724();
                                try {
                                    zM4231 = C1148.m4231(c15432M46724);
                                    iM450211 = C19806.m45029("ۢᩴ") ^ i13;
                                    i3 = ((iM450211 ^ i14) * 23167) ^ 426747224;
                                    i7 = -329903496;
                                } catch (Exception unused4) {
                                    iM4036 = i17;
                                    iM450211 = ThreadFactoryC3888.m11306("۠ۡ") ^ i14;
                                    i3 = ((iM450211 ^ i13) * 10461) ^ (-1469478236);
                                    i7 = -1687983417;
                                }
                                i5 = iM450211 ^ i7;
                                i8 = i8;
                                strArr = strArrM5056;
                                i16 = i5;
                                i15 = i3;
                                strArrM5056 = strArr;
                            } catch (Exception unused5) {
                                strArrM5056 = strArrM5056;
                                int iM113013 = (ThreadFactoryC3888.m11306("֡ۛ") + i14) * (-43);
                                i16 = iM113013 ^ (-1170041690);
                                i15 = ((iM113013 ^ i13) * (-6117)) ^ 1602305272;
                                i8 = i8;
                            }
                        } catch (Exception unused6) {
                            strArrM5056 = strArrM5056;
                            i8 = i8;
                        }
                    } catch (Exception unused7) {
                        i8 = i8;
                        int iM113014 = (ThreadFactoryC3888.m11306("֡ۛ") + i14) * (-43);
                        i16 = iM113014 ^ (-1170041690);
                        i15 = ((iM113014 ^ i13) * (-6117)) ^ 1602305272;
                        i8 = i8;
                    }
                    break;
                case 637784577:
                case 791967532:
                    if (C1460.f5948 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ۬") ^ i13;
                        i = ((iM45029 ^ i14) * 4327) ^ 1728712875;
                        i2 = -935567995;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    } else {
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                        iM450210 = C19806.m45029("ۡ᩷") ^ i14;
                        i3 = ((iM450210 ^ i13) * 10499) ^ 378349536;
                        i4 = -819340256;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    }
                    break;
                case 720602966:
                case 860624393:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    C1025.m3864(runnableC15554);
                    int i22 = C12859.f42771;
                    iM450210 = C19806.m45029("᩶ܶ") ^ i13;
                    i3 = ((iM450210 ^ i14) * (-31035)) ^ (-1982728541);
                    i4 = 1721036349;
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case 1515147704:
                case 1962791361:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("᩺ܶ") ^ i13;
                        i = ((iM45029 ^ i14) * (-12329)) ^ 1550770847;
                        i2 = -137193229;
                    } else {
                        iM45029 = C19806.m45029("۫۫") ^ i14;
                        i = ((iM45029 ^ i13) * 25125) ^ 1931292869;
                        i2 = 452065846;
                    }
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    break;
                case 1564518168:
                case 1790976440:
                    if (C2788.f10625 >= 0) {
                        strArrM5056 = strArrM5056;
                        i8 = i8;
                        iM450210 = (i13 - C19806.m45029("ۢܿ")) * (-85);
                        i3 = ((iM450210 ^ i14) * (-2903)) ^ (-867213840);
                        i4 = -944426756;
                        i5 = iM450210 ^ i4;
                        i8 = i8;
                        strArr = strArrM5056;
                        i16 = i5;
                        i15 = i3;
                        strArrM5056 = strArr;
                    }
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    iM450210 = C19806.m45029("ۡ᩷") ^ i14;
                    i3 = ((iM450210 ^ i13) * 10499) ^ 378349536;
                    i4 = -819340256;
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                case 1585481890:
                case 1921501082:
                    RunnableC3388.m10064();
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("᩺ܶ") ^ i13;
                        i = ((iM45029 ^ i14) * (-12329)) ^ 1550770847;
                        i2 = -137193229;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۛ") ^ i13) * (-51);
                        i = ((iM45029 ^ i14) * 24725) ^ (-911297750);
                        i2 = -488288423;
                    }
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    break;
                case 1820184109:
                case 2003160079:
                    strArrM5056 = strArrM5056;
                    i8 = i8;
                    sArr = f29174;
                    if (RunnableC0195.f1321 >= 0) {
                        iM450210 = C19806.m45029("ۡ᩷") ^ i14;
                        i3 = ((iM450210 ^ i13) * 10499) ^ 378349536;
                        i4 = -819340256;
                    } else {
                        iM450210 = C19806.m45029("ۢ֡") ^ i14;
                        i3 = ((iM450210 ^ i13) * 17415) ^ (-1935065100);
                        i4 = 1462438825;
                    }
                    i5 = iM450210 ^ i4;
                    i8 = i8;
                    strArr = strArrM5056;
                    i16 = i5;
                    i15 = i3;
                    strArrM5056 = strArr;
                    break;
                default:
                    try {
                        ThreadFactoryC3888.m11308(C4716.f16636, new RunnableC14540(iM10058, i8, strArrM5056));
                        break;
                    } catch (Exception unused8) {
                    }
                    i8 = i8;
                    int iM113015 = (ThreadFactoryC3888.m11306("֡ۛ") + i14) * (-43);
                    i16 = iM113015 ^ (-1170041690);
                    i15 = ((iM113015 ^ i13) * (-6117)) ^ 1602305272;
                    i8 = i8;
                    break;
            }
            return;
        }
    }
}
