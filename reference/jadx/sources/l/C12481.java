package l;

import com.umeng.analytics.pro.am;
import java.lang.reflect.Method;
import org.lsposed.lsplant.Hooker;

/* JADX INFO: renamed from: l.ۨܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: MAK5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12481 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f40078 = "";

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f40079 = false;

    /* JADX INFO: renamed from: ᩶ᩳ᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f40080 = {4089, 13274, 13272, 13257, 13310, 13265, 13276, 13262, 13262, 13299, 13276, 13264, 13272, 13274, 13272, 13257, 13296, 13272, 13257, 13269, 13266, 13273, 13299, 13276, 13264, 13272};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String f40081 = "";

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static synchronized void m31016() {
        m31018();
        m31014("aa", "bb");
        StackTraceElement stackTraceElement = new StackTraceElement(am.av, "b", am.aF, 0);
        if (!"aa".equals(stackTraceElement.getClassName()) || !"bb".equals(stackTraceElement.getMethodName())) {
            throw new IllegalStateException("JavaHook probe failed");
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static synchronized void m31018() {
        if (f40079) {
            return;
        }
        m31015();
        f40079 = true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3 A[PHI: r6
      0x00a3: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:23:0x00a1, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0142 A[PHI: r2
      0x0142: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:38:0x0140, B:15:0x007c, B:12:0x0073, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0210 A[PHI: r9 r10 r14 r15 r21
      0x0210: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:58:0x020e, B:54:0x01f2, B:50:0x01cf, B:27:0x00da, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:58:0x020e, B:54:0x01f2, B:50:0x01cf, B:27:0x00da, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:58:0x020e, B:54:0x01f2, B:50:0x01cf, B:27:0x00da, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:58:0x020e, B:54:0x01f2, B:50:0x01cf, B:27:0x00da, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r21v3 short) = (r21v2 short), (r21v1 short), (r21v1 short), (r21v1 short), (r21v1 short) binds: [B:58:0x020e, B:54:0x01f2, B:50:0x01cf, B:27:0x00da, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0243 A[PHI: r1 r7 r12 r13
      0x0243: PHI (r1v4 java.lang.Class<java.lang.StackTraceElement>) = 
      (r1v2 java.lang.Class<java.lang.StackTraceElement>)
      (r1v3 java.lang.Class<java.lang.StackTraceElement>)
      (r1v2 java.lang.Class<java.lang.StackTraceElement>)
      (r1v2 java.lang.Class<java.lang.StackTraceElement>)
     binds: [B:62:0x0241, B:42:0x0175, B:17:0x0080, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r7v5 short) = (r7v4 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:62:0x0241, B:42:0x0175, B:17:0x0080, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:62:0x0241, B:42:0x0175, B:17:0x0080, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:62:0x0241, B:42:0x0175, B:17:0x0080, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m31015() throws NoSuchMethodException {
        int iM2761;
        int i;
        int i2;
        int i3 = RunnableC3055.f9898;
        int i4 = C2354.f7599;
        int iM3169 = (C0773.m3169("ۛ֡") + i4) * 41;
        int i5 = ((iM3169 ^ i3) * (-25287)) ^ 1146546541;
        String strM5471 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-655643444);
        C3532 c3532 = null;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -742726963;
        short s2 = 0;
        Method declaredMethod = null;
        Class<?>[] clsArr = null;
        String strM6310 = null;
        Class<StackTraceElement> cls = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-10473)) >> 31));
            switch (i12) {
                case -2010456313:
                case -882119794:
                    Hooker.m56793(cls.getDeclaredMethod(strM5471, clsArr), new C20686());
                    break;
                case -1877725506:
                case 168735885:
                    s2 = 7405;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("᩹ۗ") ^ i3;
                        i = ((iM2761 ^ i4) * (-15039)) ^ (-332734841);
                        i2 = -410532138;
                    } else {
                        iM2761 = C0773.m3169("۠ۤ") ^ i4;
                        i = ((iM2761 ^ i3) * 4647) ^ 780614870;
                        i2 = 730366997;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1820531770:
                case 759662481:
                    i9 = 13245;
                    iM2761 = C0773.m3169("ۧܿ") ^ i4;
                    i = ((iM2761 ^ i3) * (-6711)) ^ 1975203760;
                    i2 = -1643253643;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1773022985:
                case 161965645:
                    Hooker.m56793(declaredMethod, c3532);
                    sArr2 = f40080;
                    i11 = 13;
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("᩹ۗ") ^ i3;
                        i = ((iM2761 ^ i4) * (-15039)) ^ (-332734841);
                        i2 = -410532138;
                    } else {
                        iM2761 = C0773.m3169("ۜ۫") ^ i4;
                        i = ((iM2761 ^ i3) * 4147) ^ 1831538876;
                        i2 = 1221547348;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1668171242:
                case -659585205:
                    strM5471 = C1542.m5471(sArr2, i11, 13, i9);
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("ۘ֫") ^ i4;
                        i = ((iM2761 ^ i3) * 3687) ^ 450376220;
                        i2 = 1743407346;
                    } else {
                        iM2761 = (C0619.m2761("ۢۛ") ^ i3) * 71;
                        i = ((iM2761 ^ i4) * (-9797)) ^ (-1171355952);
                        i2 = 1710947948;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1371683028:
                case -284000385:
                    C17202.m40372();
                    if (C11235.f35427 < 0) {
                        iM2761 = C0773.m3169("᩺ܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-8181)) ^ (-1873282331);
                        i2 = -973093436;
                    } else {
                        iM2761 = C0619.m2761("ۘ֫") ^ i4;
                        i = ((iM2761 ^ i3) * 3687) ^ 450376220;
                        i2 = 1743407346;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1294615521:
                case 1978693221:
                    strM6310 = C1826.m6310(sArr, i10, 12, i9);
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("᩺ܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-8181)) ^ (-1873282331);
                        i2 = -973093436;
                    } else {
                        iM2761 = C0619.m2761("ۛ֨") ^ i3;
                        i = ((iM2761 ^ i4) * 14619) ^ (-1769908096);
                        i2 = 701898407;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1142402687:
                case -165593817:
                    int i13 = s + s2;
                    i7 = i13 * i13;
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0773.m3169("᩹ۗ") ^ i3;
                        i = ((iM2761 ^ i4) * (-15039)) ^ (-332734841);
                        i2 = -410532138;
                    } else {
                        iM2761 = C0773.m3169("ۘܽ") ^ i3;
                        i = ((iM2761 ^ i4) * (-3393)) ^ (-1053108212);
                        i2 = -1386244235;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1010158834:
                case -630986611:
                    clsArr = null;
                    declaredMethod = cls.getDeclaredMethod(strM6310, null);
                    if (C1343.f4799 == 0) {
                        c3532 = new C3532();
                        if (!RunnableC3646.f12471) {
                            iM2761 = C0619.m2761("᩷ܽ") ^ i4;
                            i = ((iM2761 ^ i3) * (-14945)) ^ 1027437876;
                            i2 = -1715186565;
                            i6 = iM2761 ^ i2;
                            i5 = i;
                            break;
                        }
                    }
                    int iM31610 = (i4 - C0773.m3169("֫ۤ")) * (-61);
                    i6 = iM31610 ^ 930413577;
                    i5 = ((iM31610 ^ i3) * (-4685)) ^ 132225472;
                    c3532 = null;
                    break;
                case -948972310:
                case 743794837:
                    s = f40080[0];
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("᩵ۛ") ^ i4;
                        i = ((iM2761 ^ i3) * 16465) ^ (-1968012514);
                        i2 = -770655789;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩶") ^ i3;
                        i = ((iM2761 ^ i4) * (-20841)) ^ 531092331;
                        i2 = 2047353670;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -176720991:
                case 803211708:
                    C1321.m4852();
                    iM2761 = C0773.m3169("᩵ۛ") ^ i4;
                    i = ((iM2761 ^ i3) * 16465) ^ (-1968012514);
                    i2 = -770655789;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -141911887:
                case -9287236:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("᩺ܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-8181)) ^ (-1873282331);
                        i2 = -973093436;
                    } else {
                        iM2761 = C0773.m3169("᩹ۗ") ^ i3;
                        i = ((iM2761 ^ i4) * (-15039)) ^ (-332734841);
                        i2 = -410532138;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 228067884:
                case 1178821953:
                    C23916.m53419();
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("᩵ۛ") ^ i4;
                        i = ((iM2761 ^ i3) * 16465) ^ (-1968012514);
                        i2 = -770655789;
                    } else {
                        iM2761 = C0773.m3169("᩺ܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-8181)) ^ (-1873282331);
                        i2 = -973093436;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 241067538:
                case 1263357574:
                    i9 = 8075;
                    iM2761 = C0773.m3169("ۧܿ") ^ i4;
                    i = ((iM2761 ^ i3) * (-6711)) ^ 1975203760;
                    i2 = -1643253643;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 242033885:
                case 1746397921:
                    cls = StackTraceElement.class;
                    sArr = f40080;
                    i10 = 1;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("᩵ۛ") ^ i4;
                        i = ((iM2761 ^ i3) * 16465) ^ (-1968012514);
                        i2 = -770655789;
                    } else {
                        iM2761 = (C0619.m2761("ۙ᩹") ^ i3) * 127;
                        i = ((iM2761 ^ i4) * (-10711)) ^ (-875122058);
                        i2 = 1442905817;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 518693591:
                case 1195621268:
                    i8 = (s * s) + 54834025;
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("᩹ۗ") ^ i3;
                        i = ((iM2761 ^ i4) * (-15039)) ^ (-332734841);
                        i2 = -410532138;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۜ") + i4) * (-19);
                        i = ((iM2761 ^ i3) * (-7535)) ^ 678640846;
                        i2 = 1242318967;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1114868549:
                case 2070991593:
                    C2702.m8876();
                    C3099.m10095();
                    break;
                default:
                    if ((i8 + i8) - i7 < 0) {
                        iM2761 = C0619.m2761("᩹ᩴ") ^ i3;
                        i = ((iM2761 ^ i4) * (-8871)) ^ 1681697187;
                        i2 = -1588398567;
                    } else {
                        iM2761 = C0619.m2761("ۧ֨") ^ i4;
                        i = ((iM2761 ^ i3) * 8327) ^ (-1575623132);
                        i2 = 52179447;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31014(String str, String str2) {
        if (f40079) {
            f40078 = str;
            f40081 = str2;
        }
    }
}
