package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.locks.ReentrantLock;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7791 {

    /* JADX INFO: renamed from: ۖܿܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f25864 = {3505, -24672, -24670, -24653, -24687, -24666, -24661, -24654, -24670, -24593, -24599, -24599, -24599, -24594, 3983, -6406, -6425, -6406, -6424, -6407, -6432, -6442, -6404, -6406, -6420, -6405, -6432, -6425, -6417, -6426, -6419, -6432, -6424, -6425, -6419, -6432, -6442, -6402, -6415, -6442, -6427, -6426, -6418, -6432, -6425, -6418, -6420, -6403, -6433, -6424, -6427, -6404, -6420, -6495, -6489, -6489, -6489, -6496, 1671, 6069, 6071, 6048, 6077, 6050, 6077, 6048, 6061, 4564, 21014, 21012, 20995, 21022, 20993, 21022, 20995, 21006, 20996, 21017, 20996, 21014, 20999, 21022, 21032, 20994, 20996, 21010, 20997, 21022, 21017, 21009, 21016, 21011, 21022, 21014, 21017, 21011, 21022, 21032, 20992, 21007, 21032, 21019, 21016, 21008, 21022, 21017, 21008, 21010, 20995, 21025, 21014, 21019, 20994, 21010, 21087, 21081, 21081, 21081, 21086};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0812 f25865;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0812 f25866;

    /* JADX WARN: Code duplicated, block: B:30:0x00e9 A[PHI: r2
      0x00e9: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:29:0x00e7, B:12:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x011d A[PHI: r14
      0x011d: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:33:0x011b, B:15:0x0087, B:12:0x0081, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0224 A[PHI: r5 r6 r7 r12 r13
      0x0224: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:60:0x0222, B:56:0x0203, B:37:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:60:0x0222, B:56:0x0203, B:37:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:60:0x0222, B:56:0x0203, B:37:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:60:0x0222, B:56:0x0203, B:37:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:60:0x0222, B:56:0x0203, B:37:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0258 A[PHI: r8 r9 r10 r19
      0x0258: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:64:0x0256, B:52:0x01e1, B:48:0x01be, B:17:0x008b, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:64:0x0256, B:52:0x01e1, B:48:0x01be, B:17:0x008b, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:64:0x0256, B:52:0x01e1, B:48:0x01be, B:17:0x008b, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x0256, B:52:0x01e1, B:48:0x01be, B:17:0x008b, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0289 A[PHI: r3
      0x0289: PHI (r3v4 l.֡ۡ᩻) = (r3v2 l.֡ۡ᩻), (r3v2 l.֡ۡ᩻), (r3v6 l.֡ۡ᩻) binds: [B:68:0x0287, B:9:0x0076, B:93:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21184(AbstractActivityC17204 abstractActivityC17204, C24750 c24750) {
        int iM2761;
        int i;
        int i2;
        int i3 = C1783.f6087;
        int i4 = C2834.f9334;
        int iM3169 = (C0773.m3169("᩷᩸") + i3) * (-57);
        int i5 = ((iM3169 ^ i4) * 7113) ^ 1439848375;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ 307461914;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -2083459340;
        C0333 c0333 = null;
        String strM12266 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-6067)) >> 31));
            switch (i13) {
                case -1969157639:
                case -1917690483:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("ܶᩴ") ^ i4) * (-35);
                        i = ((iM2761 ^ i3) * (-17785)) ^ (-1434519741);
                        i2 = 1199115653;
                    } else {
                        iM2761 = C0619.m2761("֫᩶") ^ i3;
                        i = ((iM2761 ^ i4) * (-22529)) ^ (-1771698516);
                        i2 = -664974992;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1838552403:
                case -18768398:
                    C4238.m13540();
                    iM2761 = (C0619.m2761("ܶᩴ") ^ i4) * (-35);
                    i = ((iM2761 ^ i3) * (-17785)) ^ (-1434519741);
                    i2 = 1199115653;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1692665285:
                case 231429626:
                    i10 = 26994;
                    iM2761 = C0619.m2761("ܶۧ") ^ i3;
                    i = ((iM2761 ^ i4) * (-21359)) ^ 1575138481;
                    i2 = -21440497;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1272296011:
                case 1808049979:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ܽ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-18207)) ^ (-1630773867);
                        i2 = 1529768000;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩹") ^ i4;
                        i = ((iM2761 ^ i3) * (-17485)) ^ (-387296907);
                        i2 = 1327537642;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1265870968:
                case -307782530:
                    sArr2 = f25864;
                    i11 = 59;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩻ۨ")) * (-97);
                        i = ((iM2761 ^ i4) * 11053) ^ (-658082729);
                        i2 = -2129693593;
                    } else {
                        iM2761 = C0773.m3169("ۢܽ") ^ i4;
                        i = ((iM2761 ^ i3) * (-19313)) ^ (-1694464119);
                        i2 = 642347692;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1227527282:
                case -820496169:
                    m21181().m26036(abstractActivityC17204, c0333);
                    break;
                case -975228063:
                case 1882522741:
                    i7 = s * s2;
                    i8 = s * s;
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0619.m2761("ܶᩴ") ^ i4) * (-35);
                        i = ((iM2761 ^ i3) * (-17785)) ^ (-1434519741);
                        i2 = 1199115653;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩹ܳ")) * (-35);
                        i = ((iM2761 ^ i3) * (-31675)) ^ 1821733015;
                        i2 = 1860179811;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -677635659:
                case 901098266:
                    i10 = 6100;
                    iM2761 = C0619.m2761("ܶۧ") ^ i3;
                    i = ((iM2761 ^ i4) * (-21359)) ^ 1575138481;
                    i2 = -21440497;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -675537728:
                case 848164327:
                    c0333 = new C0333(abstractActivityC17204, c24750);
                    abstractActivityC17204.m40408(c0333);
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ܽ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-18207)) ^ (-1630773867);
                        i2 = 1529768000;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    } else {
                        int iM31610 = C0773.m3169("ۨ᩶") ^ i4;
                        i5 = ((iM31610 ^ i3) * 18229) ^ (-1551792751);
                        i6 = iM31610 ^ (-107204912);
                    }
                    break;
                case -345898404:
                case 326817942:
                    s = sArr[c];
                    s2 = 18410;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩻ۨ")) * (-97);
                        i = ((iM2761 ^ i4) * 11053) ^ (-658082729);
                        i2 = -2129693593;
                    } else {
                        iM2761 = (C0619.m2761("᩻᩻") + i4) * (-93);
                        i = ((iM2761 ^ i3) * (-19979)) ^ 377674890;
                        i2 = -187027727;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -103064606:
                case 1203586109:
                    i9 = 84732025;
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("ܶᩴ") ^ i4) * (-35);
                        i = ((iM2761 ^ i3) * (-17785)) ^ (-1434519741);
                        i2 = 1199115653;
                    } else {
                        iM2761 = (C0773.m3169("ۢۡ") + i3) * 61;
                        i = ((iM2761 ^ i4) * 2821) ^ 1372443806;
                        i2 = -1668169528;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -13075181:
                case 6932263:
                    sArr = f25864;
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("ܶᩴ") ^ i4) * (-35);
                        i = ((iM2761 ^ i3) * (-17785)) ^ (-1434519741);
                        i2 = 1199115653;
                    } else {
                        iM2761 = (C0773.m3169("ܺۗ") + i3) * 91;
                        i = ((iM2761 ^ i4) * (-4053)) ^ 1220934567;
                        i2 = 1764582113;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 33645703:
                case 244760983:
                    m21181().m26038();
                    iM2761 = C0619.m2761("۟۠") ^ i3;
                    i = ((iM2761 ^ i4) * (-21599)) ^ 356333568;
                    i2 = 2025408496;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 110875133:
                case 1761614823:
                    i12 = 8;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("֫᩶") ^ i3;
                        i = ((iM2761 ^ i4) * (-22529)) ^ (-1771698516);
                        i2 = -664974992;
                    } else {
                        iM2761 = C0619.m2761("᩸ۨ") ^ i4;
                        i = ((iM2761 ^ i3) * (-12173)) ^ (-1676414405);
                        i2 = 1608297995;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 165599712:
                case 575164252:
                    c = ':';
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩻ۨ")) * (-97);
                        i = ((iM2761 ^ i4) * 11053) ^ (-658082729);
                        i2 = -2129693593;
                    } else {
                        iM2761 = (C0773.m3169("᩸۫") ^ i3) * (-91);
                        i = ((iM2761 ^ i4) * 23945) ^ (-412274949);
                        i2 = 1966581989;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 278274219:
                case 539236658:
                    strM12266 = C3779.m12266(sArr2, i11, i12, i10);
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("ܿۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-1573)) ^ 1116986680;
                        i2 = -974627925;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۖۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i4) * 717) ^ (-879181457);
                        i2 = 1514386536;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 342304589:
                case 715378755:
                    C2485.m8357();
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0619.m2761("֫᩶") ^ i3;
                        i = ((iM2761 ^ i4) * (-22529)) ^ (-1771698516);
                        i2 = -664974992;
                    } else {
                        iM2761 = C0773.m3169("ܿۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-1573)) ^ 1116986680;
                        i2 = -974627925;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 510809884:
                case 1649604112:
                    C3998.m12920();
                    if (C1343.f4799 == 0) {
                        iM2761 = C0619.m2761("֫᩶") ^ i3;
                        i = ((iM2761 ^ i4) * (-22529)) ^ (-1771698516);
                        i2 = -664974992;
                    } else {
                        iM2761 = C0619.m2761("ܽ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-18207)) ^ (-1630773867);
                        i2 = 1529768000;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 840989289:
                case 1903134402:
                    if ((i8 + i9) - i7 >= 0) {
                        iM2761 = (i3 - C0619.m2761("۫ۚ")) * (-103);
                        i = ((iM2761 ^ i4) * 6151) ^ (-517717642);
                        i2 = -220302982;
                    } else {
                        iM2761 = C0619.m2761("۫۬") ^ i4;
                        i = ((iM2761 ^ i3) * 29687) ^ (-436236480);
                        i2 = 1115831627;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1204873904:
                case 1870895155:
                    C2375.m8065();
                    break;
                default:
                    C3734.m12144(abstractActivityC17204, strM12266);
                    if (m21181().m26037()) {
                        iM2761 = (i3 - C0773.m3169("ۛۚ")) * 33;
                        i = ((iM2761 ^ i4) * (-361)) ^ 933201297;
                        i2 = -1640783648;
                    } else {
                        iM2761 = C0619.m2761("۟۠") ^ i3;
                        i = ((iM2761 ^ i4) * (-21599)) ^ 356333568;
                        i2 = 2025408496;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    static {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        int i3 = 297575183;
        int i4 = AbstractC0116.f1064;
        int i5 = C1783.f6087;
        int iM31610 = (C0773.m3169("۠ۚ") ^ i4) * 51;
        int i6 = ((iM31610 ^ i5) * (-32625)) ^ 528874021;
        int i7 = -954996824;
        while (true) {
            int i8 = iM31610 ^ i7;
            C17939 c17939 = null;
            C16447 c16447 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-27227)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1685549641:
                    case 128204882:
                        C0487.m2356();
                        throw new RuntimeException();
                    case -1641168212:
                    case -1160434019:
                        C2375.m8065();
                        iM2761 = C0619.m2761("ۘۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 17615) ^ (-311770048);
                        i = -776192192;
                        i8 = iM2761 ^ i;
                        break;
                    case -1266040713:
                    case 861421631:
                        if (C1542.f5343 > 0) {
                        }
                        iM3169 = (C0773.m3169("֨ۙ") + i4) * 91;
                        i6 = ((iM3169 ^ i5) * (-4329)) ^ 510716982;
                        i2 = 846529133;
                        i8 = iM3169 ^ i2;
                        c17939 = null;
                        break;
                    case -1195445713:
                    case 822056462:
                        C3734.m12152();
                        if (C2354.f7599 >= 0) {
                            iM2761 = C0619.m2761("ۘۙ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 17615) ^ (-311770048);
                            i = -776192192;
                        } else {
                            iM2761 = C0619.m2761("᩷ۢ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 7197) ^ (-301109419);
                            i = 927303368;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -255675522:
                    case 1540426981:
                        if (C0269.f1558 > 0) {
                            c16447 = new C16447(1);
                            if (C1783.f6087 > 0) {
                                iM2761 = C0773.m3169("ۛܶ") ^ i4;
                                i6 = ((iM2761 ^ i5) * 31231) ^ (-512032682);
                                i = 618211373;
                                i8 = iM2761 ^ i;
                            } else {
                                iM3169 = (C0773.m3169("֨ۙ") + i4) * 91;
                                i6 = ((iM3169 ^ i5) * (-4329)) ^ 510716982;
                                i2 = 846529133;
                                i8 = iM3169 ^ i2;
                                c17939 = null;
                            }
                        }
                        break;
                    case 28700227:
                    case 353531994:
                        if (RunnableC3055.f9898 >= 0) {
                        }
                        if (C0950.f3488 < 0) {
                            if (C2310.f7472 >= 0) {
                            }
                            if (AbstractC3624.f12429 > 0) {
                                if (C2702.f8586 > 0) {
                                    if (!RunnableC1848.f6235) {
                                        c17939 = new C17939(2);
                                        if (C0862.f3233 == 0) {
                                            iM2761 = (C0773.m3169("֫ۧ") + i4) * (-65);
                                            i6 = ((iM2761 ^ i5) * (-7951)) ^ 627423008;
                                            i = -522846783;
                                            i8 = iM2761 ^ i;
                                        }
                                        break;
                                    }
                                }
                            }
                            iM3169 = C0773.m3169("֫ۨ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-21239)) ^ (-1636900690);
                            i2 = 2060142949;
                            i8 = iM3169 ^ i2;
                            c17939 = null;
                            break;
                        }
                        iM3169 = (C0773.m3169("֨ۙ") + i4) * 91;
                        i6 = ((iM3169 ^ i5) * (-4329)) ^ 510716982;
                        i2 = 846529133;
                        i8 = iM3169 ^ i2;
                        c17939 = null;
                        break;
                        break;
                    case 441615475:
                    case 549916202:
                        f25866 = C9015.m24070(c16447);
                        return;
                    case 1160902482:
                    case 1375053419:
                        C1321.m4852();
                        if (C2023.m6964() <= 0) {
                        }
                        iM2761 = C0619.m2761("ۘۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 17615) ^ (-311770048);
                        i = -776192192;
                        i8 = iM2761 ^ i;
                        break;
                    default:
                        f25865 = C9015.m24070(c17939);
                        if (C2354.f7599 < 0) {
                            iM2761 = C0773.m3169("᩶۠") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-2959)) ^ 658396923;
                            i = 300310073;
                            i8 = iM2761 ^ i;
                        } else {
                            iM3169 = C0773.m3169("֫ۨ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-21239)) ^ (-1636900690);
                            i2 = 2060142949;
                            i8 = iM3169 ^ i2;
                            c17939 = null;
                        }
                        break;
                }
            }
            iM31610 = C0773.m3169("ۘ᩶") ^ i5;
            i6 = ((iM31610 ^ i4) * 26825) ^ (-2051507131);
            i7 = -736541244;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bf A[PHI: r12 r16
      0x00bf: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:26:0x00bd, B:14:0x007f, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r16v17 int) = (r16v13 int), (r16v16 int), (r16v19 int) binds: [B:26:0x00bd, B:14:0x007f, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ea A[PHI: r6 r7 r16
      0x01ea: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:56:0x01e8, B:48:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:56:0x01e8, B:48:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r16v6 int) = (r16v4 int), (r16v7 int) binds: [B:56:0x01e8, B:48:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021c A[PHI: r2 r11 r16
      0x021c: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:60:0x021a, B:30:0x00f1, B:22:0x009f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:60:0x021a, B:30:0x00f1, B:22:0x009f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r16v21 int) = (r16v3 int), (r16v12 int), (r16v14 int), (r16v22 int) binds: [B:60:0x021a, B:30:0x00f1, B:22:0x009f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0254 A[PHI: r1 r3 r4 r5 r8 r9 r16
      0x0254: PHI (r1v5 java.lang.Object) = 
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v4 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
     binds: [B:64:0x0252, B:52:0x01cb, B:44:0x0187, B:34:0x0114, B:16:0x0083, B:14:0x007f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:64:0x0252, B:52:0x01cb, B:44:0x0187, B:34:0x0114, B:16:0x0083, B:14:0x007f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:64:0x0252, B:52:0x01cb, B:44:0x0187, B:34:0x0114, B:16:0x0083, B:14:0x007f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:64:0x0252, B:52:0x01cb, B:44:0x0187, B:34:0x0114, B:16:0x0083, B:14:0x007f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:64:0x0252, B:52:0x01cb, B:44:0x0187, B:34:0x0114, B:16:0x0083, B:14:0x007f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:64:0x0252, B:52:0x01cb, B:44:0x0187, B:34:0x0114, B:16:0x0083, B:14:0x007f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r16v20 int) = (r16v2 int), (r16v5 int), (r16v8 int), (r16v11 int), (r16v15 int), (r16v16 int), (r16v22 int) binds: [B:64:0x0252, B:52:0x01cb, B:44:0x0187, B:34:0x0114, B:16:0x0083, B:14:0x007f, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10069 m21181() {
        int iM3169;
        int i;
        int i2;
        int i3 = AbstractC0116.f1064;
        int i4 = C4238.f15451;
        int iM31610 = (C0773.m3169("۠۠") ^ i4) * (-21);
        int i5 = ((iM31610 ^ i3) * (-11541)) ^ (-1847882172);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 1225335081;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1152151500;
        String strM12925 = null;
        Object value = null;
        while (true) {
            int i13 = i6 ^ (i5 & (((i12 ^ i3) * 28233) >> 31));
            switch (i13) {
                case -1814444395:
                case -983004440:
                    i13 = i13;
                    s = sArr[c];
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("᩷᩺") + i3) * 87;
                        i = ((iM3169 ^ i4) * 19847) ^ (-1884010699);
                        i2 = -1985339147;
                    } else {
                        iM3169 = C0773.m3169("۬ܶ") ^ i3;
                        i = ((iM3169 ^ i4) * (-17289)) ^ (-1767396007);
                        i2 = 325966822;
                    }
                    int i14 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i14;
                    break;
                case -1784864604:
                case -1761542194:
                    i13 = i13;
                    value = f25865.getValue();
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("᩷᩺") + i3) * 87;
                        i = ((iM3169 ^ i4) * 19847) ^ (-1884010699);
                        i2 = -1985339147;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-30287)) ^ 901537750;
                        i2 = 1824330258;
                    }
                    int i15 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i15;
                    break;
                case -1764180822:
                case -1729887929:
                    i13 = i13;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۨۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-16057)) ^ (-1425490623);
                        i2 = -1383297309;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܰۨ")) * (-63);
                        i = ((iM3169 ^ i3) * 3519) ^ 1489682510;
                        i2 = -1694909020;
                    }
                    int i16 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i16;
                    break;
                case -1592050208:
                case 393477008:
                    i13 = i13;
                    i7 = s * s;
                    i8 = 129800449;
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ۨۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-16057)) ^ (-1425490623);
                        i2 = -1383297309;
                    } else {
                        iM3169 = (C0619.m2761("֫ܺ") + i3) * (-67);
                        i = ((iM3169 ^ i4) * 27893) ^ (-2051624968);
                        i2 = 1346348795;
                    }
                    int i17 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i17;
                    break;
                case -1450004563:
                case -327969411:
                    RunnableC0334.m2063();
                    i13 = i13;
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("ܰܺ") ^ i4) * 31;
                        i = ((iM3169 ^ i3) * (-29979)) ^ 1412942916;
                        i2 = -340126151;
                    } else {
                        iM3169 = (C0773.m3169("᩷᩺") + i3) * 87;
                        i = ((iM3169 ^ i4) * 19847) ^ (-1884010699);
                        i2 = -1985339147;
                    }
                    int i18 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i18;
                    break;
                case -1371365189:
                case 1273210506:
                    i13 = i13;
                    sArr = f25864;
                    c = 0;
                    if (C3077.m10041()) {
                        iM3169 = (C0773.m3169("᩷᩺") + i3) * 87;
                        i = ((iM3169 ^ i4) * 19847) ^ (-1884010699);
                        i2 = -1985339147;
                    } else {
                        iM3169 = C0773.m3169("۫ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-12961)) ^ (-1919478614);
                        i2 = -428059015;
                    }
                    int i19 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i19;
                    break;
                case -1233818312:
                case 1855952403:
                    i13 = i13;
                    C3998.m12920();
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("᩷᩺") + i3) * 87;
                        i = ((iM3169 ^ i4) * 19847) ^ (-1884010699);
                        i2 = -1985339147;
                    } else {
                        iM3169 = (C0619.m2761("ۢ᩺") + i4) * (-49);
                        i = ((iM3169 ^ i3) * 21197) ^ 1624676655;
                        i2 = 2025219791;
                    }
                    int i110 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i110;
                    break;
                case -1148448316:
                case -777793230:
                    i13 = i13;
                    i9 = i7 + i8;
                    s2 = 22786;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("᩷᩺") + i3) * 87;
                        i = ((iM3169 ^ i4) * 19847) ^ (-1884010699);
                        i2 = -1985339147;
                    } else {
                        iM3169 = (C0619.m2761("ۢۧ") + i4) * (-49);
                        i = ((iM3169 ^ i3) * 3243) ^ (-1990468713);
                        i2 = 511184896;
                    }
                    int i111 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i111;
                    break;
                case -1050330497:
                case 414921202:
                    i13 = i13;
                    if (i9 - (s * s2) >= 0) {
                        iM3169 = C0773.m3169("ۢۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-30457)) ^ 1585532115;
                        i2 = 765773701;
                    } else {
                        iM3169 = (C0619.m2761("֫ᩳ") ^ i4) * 19;
                        i = ((iM3169 ^ i3) * 4461) ^ (-779662738);
                        i2 = -2016631169;
                    }
                    int i112 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i112;
                    break;
                case -893592535:
                case -301847812:
                    C3779.m12264();
                    return null;
                case -872833276:
                case -332688859:
                    if (C3492.f12043 > 0) {
                        i13 = i13;
                        iM3169 = (C0619.m2761("ۢ᩺") + i4) * (-49);
                        i = ((iM3169 ^ i3) * 21197) ^ 1624676655;
                        i2 = 2025219791;
                    } else {
                        iM3169 = C0773.m3169("۬۟") ^ i3;
                        i13 = i13;
                        i = ((iM3169 ^ i4) * (-24407)) ^ 1585743869;
                        i2 = -1301590537;
                    }
                    int i113 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i113;
                    break;
                case -791678168:
                case -636919457:
                    i13 = i13;
                    sArr2 = f25864;
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("ܰܺ") ^ i4) * 31;
                        i = ((iM3169 ^ i3) * (-29979)) ^ 1412942916;
                        i2 = -340126151;
                    } else {
                        iM3169 = C0619.m2761("᩹ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-25261)) ^ 421418049;
                        i2 = 1470498453;
                    }
                    int i114 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i114;
                    break;
                case -518913955:
                case 910032512:
                    i13 = i13;
                    i11 = 1;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0619.m2761("ۢ᩺") + i4) * (-49);
                        i = ((iM3169 ^ i3) * 21197) ^ 1624676655;
                        i2 = 2025219791;
                    } else {
                        iM3169 = C0773.m3169("ᩴۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-21099)) ^ (-241511694);
                        i2 = 22745141;
                    }
                    int i115 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i115;
                    break;
                case -23062472:
                case 2114520064:
                    i13 = i13;
                    C3033.m9845();
                    iM3169 = (C0773.m3169("᩷᩺") + i3) * 87;
                    i = ((iM3169 ^ i4) * 19847) ^ (-1884010699);
                    i2 = -1985339147;
                    int i116 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i116;
                    break;
                case 88528762:
                case 2055778006:
                    i13 = i13;
                    strM12925 = C3998.m12925(sArr2, i11, 13, i10);
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("ܰܺ") ^ i4) * 31;
                        i = ((iM3169 ^ i3) * (-29979)) ^ 1412942916;
                        i2 = -340126151;
                    } else {
                        iM3169 = C0619.m2761("ۢ᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-4075)) ^ 769039154;
                        i2 = -383677563;
                    }
                    int i117 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i117;
                    break;
                case 141292396:
                case 195872897:
                    i10 = 6304;
                    iM3169 = (i3 - C0773.m3169("᩻ᩳ")) * 77;
                    i = ((iM3169 ^ i4) * (-423)) ^ (-2108218529);
                    i2 = -1446095696;
                    int i118 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i118;
                    break;
                case 1186074865:
                case 1355527928:
                    i13 = i13;
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("ܰܺ") ^ i4) * 31;
                        i = ((iM3169 ^ i3) * (-29979)) ^ 1412942916;
                        i2 = -340126151;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۗ᩹")) * (-91);
                        i = ((iM3169 ^ i4) * 6727) ^ 1318756896;
                        i2 = 297047845;
                    }
                    int i119 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i119;
                    break;
                case 1603688824:
                case 1722552863:
                    C0269.m1781(value, strM12925);
                    return (C10069) value;
                default:
                    i10 = 40903;
                    iM3169 = (i3 - C0773.m3169("᩻ᩳ")) * 77;
                    i = ((iM3169 ^ i4) * (-423)) ^ (-2108218529);
                    i2 = -1446095696;
                    int i1110 = i13;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    i12 = i1110;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0182 A[PHI: r2 r4 r14
      0x0182: PHI (r2v4 com.tencent.mm.opensdk.modelmsg.SendAuth$Req) = 
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v3 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
     binds: [B:85:0x0182, B:42:0x0180, B:38:0x015c, B:26:0x00e3, B:16:0x009f, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r4v5 java.lang.Object) = 
      (r4v2 java.lang.Object)
      (r4v2 java.lang.Object)
      (r4v2 java.lang.Object)
      (r4v3 java.lang.Object)
      (r4v2 java.lang.Object)
      (r4v2 java.lang.Object)
     binds: [B:85:0x0182, B:42:0x0180, B:38:0x015c, B:26:0x00e3, B:16:0x009f, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:85:0x0182, B:42:0x0180, B:38:0x015c, B:26:0x00e3, B:16:0x009f, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m21185(AbstractActivityC17204 abstractActivityC17204, final C24750 c24750) {
        int iM3169;
        int i;
        int i2;
        short s;
        int iM31610;
        int i3;
        int iM31611;
        int i4;
        final AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
        int i5 = C23916.f77426;
        int i6 = C4282.f15546;
        int iM31612 = (C0773.m3169("ۖ۫") ^ i6) * 55;
        int i7 = ((iM31612 ^ i5) * (-22783)) ^ 2036703204;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM31612 ^ (-1586061431);
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        int i13 = -155185698;
        short s3 = 0;
        String strM5471 = null;
        short[] sArr4 = null;
        int i14 = 0;
        Object value = null;
        InterfaceC1856 interfaceC1856 = null;
        SendAuth.Req req = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i5) * (-30877)) >> 31));
            switch (i13) {
                case -2140339191:
                case -526482323:
                    RunnableC3646.m11813();
                    iM3169 = (i5 - C0619.m2761("֫֡")) * 17;
                    i = ((iM3169 ^ i6) * (-16597)) ^ (-1421006641);
                    i2 = 1016679541;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1629765034:
                case 712208975:
                    req.scope = C2288.m7761(sArr4, 76, 15, i11);
                    if (C2878.f9462) {
                        iM3169 = (i5 - C0619.m2761("֫֡")) * 17;
                        i = ((iM3169 ^ i6) * (-16597)) ^ (-1421006641);
                        i2 = 1016679541;
                    } else {
                        iM3169 = (i5 - C0773.m3169("۠᩺")) * (-71);
                        i = ((iM3169 ^ i6) * 24871) ^ (-1693490798);
                        i2 = -1177120079;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1394801397:
                case 580843331:
                    sArr2 = f25864;
                    i12 = 68;
                    i14 = 8;
                    if (C1343.f4799 == 0) {
                        iM3169 = (C0773.m3169("ۧۚ") + i6) * (-87);
                        i = ((iM3169 ^ i5) * 17303) ^ 141779991;
                        i2 = 1986496111;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        s = s3;
                        iM31610 = C0773.m3169("ۘᩴ") ^ i6;
                        i7 = ((iM31610 ^ i5) * (-13283)) ^ 203583975;
                        i3 = -1529981568;
                        i8 = iM31610 ^ i3;
                        abstractActivityC17205 = abstractActivityC17204;
                        s3 = s;
                    }
                    break;
                case -1161575967:
                case -193775016:
                    i11 = 51214;
                    iM3169 = (C0773.m3169("ۘ۠") + i5) * (-95);
                    i = ((iM3169 ^ i6) * (-65)) ^ 260575933;
                    i2 = -1987070379;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1050153716:
                case -796801602:
                    s3 = sArr[c];
                    s2 = 75216;
                    if (C1080.f3865 >= 0) {
                        iM31611 = (C0619.m2761("ᩳۙ") + i5) * 37;
                        i7 = ((iM31611 ^ i6) * 29755) ^ 1710508577;
                        i4 = 2068321386;
                    } else {
                        iM31611 = C0773.m3169("᩷ۚ") ^ i6;
                        i7 = ((iM31611 ^ i5) * (-16451)) ^ 762669412;
                        i4 = 1715978861;
                    }
                    i8 = iM31611 ^ i4;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -1029739421:
                case 307687852:
                    C2310.m7811(value, strM5471);
                    ((IWXAPI) value).sendReq(req);
                    break;
                case -818614535:
                case -637123799:
                    i11 = 21111;
                    iM3169 = (C0773.m3169("ۘ۠") + i5) * (-95);
                    i = ((iM3169 ^ i6) * (-65)) ^ 260575933;
                    i2 = -1987070379;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -711602635:
                case 1929666237:
                    C1783.m6232();
                    break;
                case -704415709:
                case 1810301464:
                    req.state = C1080.m4056(sArr3, i9, i10, i11);
                    interfaceC1856 = new InterfaceC1856() { // from class: l.᩻ۡ᩻

                        /* JADX INFO: renamed from: ᩵֫ᩳ, reason: not valid java name and contains not printable characters */
                        private static final short[] f80762 = {961, 30749, 30730, 30748, 30751, -5975, 3908, 4247, 30730, 30749, 30749, 30780, 30747, 30749};

                        {
                            int i15 = 47467191;
                            int i16 = C2966.f9654;
                            int i17 = C0269.f1558;
                            int iM2761 = C0619.m2761("᩵ᩳ") ^ i17;
                            int i18 = ((iM2761 ^ i16) * 5693) ^ 1577243418;
                            int i19 = 46141888;
                            while (true) {
                                i15 = ((((i15 ^ i16) * (-26151)) >> 31) & i18) ^ (iM2761 ^ i19);
                                switch (i15) {
                                    case -2127282981:
                                    case -1989420368:
                                        if (C1564.f5401 <= 0) {
                                            iM2761 = (i16 - C0619.m2761("۫ۘ")) * 29;
                                            i18 = ((iM2761 ^ i17) * (-5071)) ^ (-1950744388);
                                            i19 = -118285632;
                                        } else {
                                            iM2761 = C0773.m3169("ۖܽ") ^ i16;
                                            i18 = ((iM2761 ^ i17) * (-3247)) ^ (-1281943824);
                                            i19 = 882787273;
                                        }
                                        break;
                                    case -1999705467:
                                    case 2121609817:
                                        if (C1080.f3865 >= 0) {
                                            iM2761 = (C0619.m2761("ۘۚ") + i16) * 39;
                                            i18 = ((iM2761 ^ i17) * 26081) ^ 1552422665;
                                            i19 = -1646124280;
                                        } else {
                                            iM2761 = (C0619.m2761("۬۫") + i16) * (-29);
                                            i18 = ((iM2761 ^ i17) * 10191) ^ (-1463698026);
                                            i19 = -1532829144;
                                        }
                                        break;
                                    case -1778188130:
                                    case 1914330379:
                                        if (C1826.m6301() >= 0) {
                                            iM2761 = (C0619.m2761("᩷ۘ") + i17) * 9;
                                            i18 = ((iM2761 ^ i16) * (-6279)) ^ 1218109817;
                                            i19 = 1284904307;
                                        } else {
                                            iM2761 = (i16 - C0619.m2761("۫ۘ")) * 29;
                                            i18 = ((iM2761 ^ i17) * (-5071)) ^ (-1950744388);
                                            i19 = -118285632;
                                        }
                                        break;
                                    case -1745919058:
                                    case 1657724815:
                                        if (C1519.f5300 >= 0) {
                                            iM2761 = (C0619.m2761("ۘۚ") + i16) * 39;
                                            i18 = ((iM2761 ^ i17) * 26081) ^ 1552422665;
                                            i19 = -1646124280;
                                        } else {
                                            iM2761 = (i16 - C0773.m3169("ܶۧ")) * (-49);
                                            i18 = ((iM2761 ^ i17) * (-15115)) ^ (-787298963);
                                            i19 = -1600956650;
                                        }
                                        break;
                                    case -1658074303:
                                    case -927646228:
                                        if (C13473.f42873 == 0) {
                                            iM2761 = (C0619.m2761("ۘۚ") + i16) * 39;
                                            i18 = ((iM2761 ^ i17) * 26081) ^ 1552422665;
                                            i19 = -1646124280;
                                        } else {
                                            iM2761 = (C0619.m2761("᩷ۘ") + i17) * 9;
                                            i18 = ((iM2761 ^ i16) * (-6279)) ^ 1218109817;
                                            i19 = 1284904307;
                                        }
                                        break;
                                    case -1644052364:
                                    case -1541868492:
                                        if (C3690.f12684 <= 0) {
                                            iM2761 = (C0619.m2761("ۘۚ") + i16) * 39;
                                            i18 = ((iM2761 ^ i17) * 26081) ^ 1552422665;
                                            i19 = -1646124280;
                                        } else {
                                            iM2761 = C0773.m3169("᩹᩷") ^ i17;
                                            i18 = ((iM2761 ^ i16) * 11993) ^ (-1397850155);
                                            i19 = -251526467;
                                        }
                                        break;
                                    case -1416626225:
                                    case -671346715:
                                        return;
                                    case -1362265517:
                                    case 879972254:
                                        C1519.m5403();
                                        throw new RuntimeException();
                                    case -1265841172:
                                    case -1094666952:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2761 = (C0619.m2761("᩷ۘ") + i17) * 9;
                                            i18 = ((iM2761 ^ i16) * (-6279)) ^ 1218109817;
                                            i19 = 1284904307;
                                        } else {
                                            iM2761 = (C0619.m2761("ۛ᩻") ^ i16) * 53;
                                            i18 = ((iM2761 ^ i17) * 11969) ^ 1477920256;
                                            i19 = 426908203;
                                        }
                                        break;
                                    case -565717572:
                                    case 793864219:
                                        if (C3690.f12684 <= 0) {
                                            iM2761 = (i16 - C0619.m2761("۫ۘ")) * 29;
                                            i18 = ((iM2761 ^ i17) * (-5071)) ^ (-1950744388);
                                            i19 = -118285632;
                                        } else {
                                            iM2761 = C0773.m3169("۬֡") ^ i17;
                                            i18 = ((iM2761 ^ i16) * 21981) ^ 1931634136;
                                            i19 = 363166361;
                                        }
                                        break;
                                    case -452035821:
                                    case 969518945:
                                        C2310.m7813();
                                        iM2761 = (i16 - C0619.m2761("۫ۘ")) * 29;
                                        i18 = ((iM2761 ^ i17) * (-5071)) ^ (-1950744388);
                                        i19 = -118285632;
                                        break;
                                    case -425273266:
                                    case 987971251:
                                        if (C0862.f3233 != 0) {
                                            iM2761 = (C0773.m3169("ܺۡ") ^ i17) * 91;
                                            i18 = ((iM2761 ^ i16) * 30755) ^ 1407402604;
                                            i19 = -1893865264;
                                        } else {
                                            iM2761 = C0773.m3169("᩸ۡ") ^ i16;
                                            i18 = ((iM2761 ^ i17) * 9763) ^ (-1310123883);
                                            i19 = 1256255823;
                                        }
                                        break;
                                    case 763742017:
                                    case 1318672097:
                                        if (C3448.f11240 >= 0) {
                                            iM2761 = (i16 - C0619.m2761("۫ۘ")) * 29;
                                            i18 = ((iM2761 ^ i17) * (-5071)) ^ (-1950744388);
                                            i19 = -118285632;
                                        } else {
                                            iM2761 = (C0773.m3169("ܿܽ") ^ i17) * (-79);
                                            i18 = ((iM2761 ^ i16) * 18239) ^ 1533040037;
                                            i19 = -401952854;
                                        }
                                        break;
                                    case 1091750648:
                                    case 1525962165:
                                        C3492.m11488();
                                        if (C3492.f12043 <= 0) {
                                            iM2761 = (C0619.m2761("᩷ۘ") + i17) * 9;
                                            i18 = ((iM2761 ^ i16) * (-6279)) ^ 1218109817;
                                            i19 = 1284904307;
                                        } else {
                                            iM2761 = (C0619.m2761("ۜ᩸") ^ i17) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i18 = ((iM2761 ^ i16) * (-2453)) ^ (-1972206951);
                                            i19 = 1400986035;
                                        }
                                        break;
                                    case 1300502104:
                                    case 1442000304:
                                        if (C1519.f5300 >= 0) {
                                            iM2761 = (C0619.m2761("ۘۚ") + i16) * 39;
                                            i18 = ((iM2761 ^ i17) * 26081) ^ 1552422665;
                                            i19 = -1646124280;
                                        } else {
                                            iM2761 = C0773.m3169("ۚ֨") ^ i17;
                                            i18 = ((iM2761 ^ i16) * 15397) ^ (-930502770);
                                            i19 = -1853425879;
                                        }
                                        break;
                                    default:
                                        if (C2375.f7641 <= 0) {
                                            iM2761 = (C0619.m2761("᩷ۘ") + i17) * 9;
                                            i18 = ((iM2761 ^ i16) * (-6279)) ^ 1218109817;
                                            i19 = 1284904307;
                                        } else {
                                            iM2761 = (C0773.m3169("ܳܳ") + i17) * (-99);
                                            i18 = ((iM2761 ^ i16) * (-17557)) ^ 795545788;
                                            i19 = 1066729062;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:35:0x0104 A[PHI: r9 r10
                          0x0104: PHI (r9v5 l.ܳ۬᩻) = (r9v3 l.ܳ۬᩻), (r9v3 l.ܳ۬᩻), (r9v4 l.ܳ۬᩻), (r9v3 l.ܳ۬᩻), (r9v3 l.ܳ۬᩻), (r9v3 l.ܳ۬᩻) binds: [B:119:0x0104, B:118:0x0104, B:34:0x0102, B:29:0x00ea, B:19:0x00a9, B:12:0x0082] A[DONT_GENERATE, DONT_INLINE]
                          0x0104: PHI (r10v5 l.ܽ֡֫) = (r10v3 l.ܽ֡֫), (r10v3 l.ܽ֡֫), (r10v4 l.ܽ֡֫), (r10v3 l.ܽ֡֫), (r10v3 l.ܽ֡֫), (r10v3 l.ܽ֡֫) binds: [B:119:0x0104, B:118:0x0104, B:34:0x0102, B:29:0x00ea, B:19:0x00a9, B:12:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:93:0x03b6 A[PHI: r2 r3 r15 r17 r18 r22
                          0x03b6: PHI (r2v11 java.lang.String) = (r2v9 java.lang.String), (r2v10 java.lang.String), (r2v12 java.lang.String) binds: [B:10:0x0076, B:92:0x03b4, B:88:0x038e] A[DONT_GENERATE, DONT_INLINE]
                          0x03b6: PHI (r3v6 short) = (r3v4 short), (r3v5 short), (r3v7 short) binds: [B:10:0x0076, B:92:0x03b4, B:88:0x038e] A[DONT_GENERATE, DONT_INLINE]
                          0x03b6: PHI (r15v7 short[]) = (r15v5 short[]), (r15v6 short[]), (r15v8 short[]) binds: [B:10:0x0076, B:92:0x03b4, B:88:0x038e] A[DONT_GENERATE, DONT_INLINE]
                          0x03b6: PHI (r17v5 short[]) = (r17v3 short[]), (r17v4 short[]), (r17v3 short[]) binds: [B:10:0x0076, B:92:0x03b4, B:88:0x038e] A[DONT_GENERATE, DONT_INLINE]
                          0x03b6: PHI (r18v4 char) = (r18v3 char), (r18v3 char), (r18v5 char) binds: [B:10:0x0076, B:92:0x03b4, B:88:0x038e] A[DONT_GENERATE, DONT_INLINE]
                          0x03b6: PHI (r22v7 short[]) = (r22v5 short[]), (r22v6 short[]), (r22v8 short[]) binds: [B:10:0x0076, B:92:0x03b4, B:88:0x038e] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // l.InterfaceC1856
                        public final void onResp(BaseResp baseResp) {
                            String str;
                            short[] sArr5;
                            short[] sArr6;
                            String str2;
                            short s4;
                            int iM31613;
                            int i15;
                            int i16;
                            int i17;
                            int iM31614;
                            int iM2761;
                            int i18;
                            int i19;
                            int iM2762;
                            int i20;
                            int i21;
                            int iM2763;
                            int i22;
                            int i23;
                            this = this;
                            BaseResp baseResp2 = baseResp;
                            int i24 = C3734.f12817;
                            int i25 = AbstractC0641.f2496;
                            int iM2764 = (i24 - C0619.m2761("ۨۙ")) * (-79);
                            int i26 = ((iM2764 ^ i25) * (-2053)) ^ (-2109709932);
                            final C24750 c24751 = null;
                            short[] sArr7 = null;
                            short[] sArr8 = null;
                            int i27 = iM2764 ^ 464189700;
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            short s5 = 0;
                            char c2 = 0;
                            short s6 = 0;
                            String strM6233 = null;
                            int i31 = 0;
                            int i32 = -29068197;
                            int i33 = 0;
                            short[] sArr9 = null;
                            String str3 = null;
                            String str4 = null;
                            final AbstractActivityC17204 abstractActivityC17206 = null;
                            InterfaceC15379 interfaceC15379 = null;
                            final C22673 c22673M9668 = null;
                            String str5 = null;
                            while (true) {
                                int i34 = 0;
                                while (true) {
                                    i32 = i27 ^ (i26 & (((i32 ^ i25) * 7631) >> 31));
                                    switch (i32) {
                                        case -2102049593:
                                        case -1989693695:
                                            i29 = 51849;
                                            iM2761 = C0619.m2761("ܶۙ") ^ i24;
                                            i18 = ((iM2761 ^ i25) * (-31303)) ^ 1797113163;
                                            i19 = -327396402;
                                            i27 = iM2761 ^ i19;
                                            this = this;
                                            strM6233 = strM6233;
                                            i26 = i18;
                                            sArr8 = sArr8;
                                            sArr7 = sArr7;
                                            break;
                                        case -2080887842:
                                        case 716831671:
                                            str5 = ((SendAuth.Resp) baseResp2).code;
                                            sArr7 = f80762;
                                            i33 = 5;
                                            if (C2485.f7950 == 0) {
                                                iM2763 = C0619.m2761("ۘᩳ") ^ i25;
                                                i22 = ((iM2763 ^ i24) * (-27705)) ^ (-177967315);
                                                i23 = 933382136;
                                                i27 = iM2763 ^ i23;
                                                i26 = i22;
                                            } else {
                                                int iM31615 = (i25 - C0773.m3169("ۘ֡")) * (-119);
                                                i26 = ((iM31615 ^ i24) * 23691) ^ (-1042649517);
                                                i27 = iM31615 ^ 1614026436;
                                                this = this;
                                            }
                                            break;
                                        case -2074620131:
                                        case -222296466:
                                            str2 = strM6233;
                                            sArr5 = sArr7;
                                            sArr6 = sArr8;
                                            s4 = s6;
                                            c2 = 0;
                                            if (C23916.m53419() != 0) {
                                                iM31613 = (C0619.m2761("᩵ۢ") + i24) * 65;
                                                i15 = ((iM31613 ^ i25) * (-28173)) ^ 1540664944;
                                                i16 = 897089650;
                                            } else {
                                                iM31613 = (i25 - C0619.m2761("֨ܽ")) * 79;
                                                i15 = ((iM31613 ^ i24) * (-14569)) ^ (-1222681827);
                                                i16 = 2066332397;
                                            }
                                            i27 = iM31613 ^ i16;
                                            strM6233 = str2;
                                            s6 = s4;
                                            sArr8 = sArr6;
                                            i26 = i15;
                                            sArr7 = sArr5;
                                            baseResp2 = baseResp;
                                            break;
                                        case -2010108096:
                                        case -847410738:
                                            ReentrantLock reentrantLock = C11650.f37690;
                                            if (C1542.f5343 > 0) {
                                                C3077.m10038(new Thread(new RunnableC16675(str5, abstractActivityC17206, interfaceC15379, i34)));
                                            }
                                            iM2763 = (C0773.m3169("ᩴܳ") + i25) * (-71);
                                            i22 = ((iM2763 ^ i24) * 8769) ^ 1149257401;
                                            i23 = 1803227074;
                                            i27 = iM2763 ^ i23;
                                            i26 = i22;
                                            break;
                                        case -1959752738:
                                        case 971056856:
                                            c22673M9668 = C2966.m9668(C0619.m2761(str3) ^ 2101101234);
                                            if (!C1343.m4943()) {
                                                int iM31616 = (i25 - C0773.m3169("ۘ֡")) * (-119);
                                                i26 = ((iM31616 ^ i24) * 23691) ^ (-1042649517);
                                                i27 = iM31616 ^ 1614026436;
                                                this = this;
                                            } else {
                                                iM2763 = (C0773.m3169("᩺ۖ") + i24) * (-89);
                                                i22 = ((iM2763 ^ i25) * 13257) ^ (-2075828010);
                                                i23 = -2102515430;
                                                i27 = iM2763 ^ i23;
                                                i26 = i22;
                                            }
                                            break;
                                        case -1880390116:
                                        case 1138135903:
                                            break;
                                        case -1829780478:
                                        case -1826652759:
                                            C2310.m7811(str4, C0950.m3780(sArr8, i28, i30, i29));
                                            c24751.m55254(str4, false);
                                            break;
                                        case -1829689538:
                                        case 1469878194:
                                            sArr7 = sArr7;
                                            int i35 = baseResp2.errCode;
                                            sArr8 = sArr8;
                                            if (i35 != -2) {
                                                int iM2765 = (C0619.m2761("ܽ֫") ^ i25) * (-5);
                                                i31 = i35;
                                                i26 = ((iM2765 ^ i24) * 6889) ^ 776791094;
                                                i27 = iM2765 ^ 167915339;
                                            } else {
                                                i31 = i35;
                                                int iM2766 = C0619.m2761("ۢۢ") ^ i25;
                                                i18 = ((iM2766 ^ i24) * (-20117)) ^ 1784276929;
                                                i27 = iM2766 ^ (-1212143623);
                                                i26 = i18;
                                            }
                                            sArr8 = sArr8;
                                            sArr7 = sArr7;
                                            break;
                                        case -1551981178:
                                        case 465476172:
                                            str2 = strM6233;
                                            sArr5 = sArr7;
                                            sArr6 = sArr8;
                                            s4 = s6;
                                            sArr9 = f80762;
                                            if (C20932.f66974 <= 0) {
                                                iM31613 = (C0619.m2761("᩵ۢ") + i24) * 65;
                                                i15 = ((iM31613 ^ i25) * (-28173)) ^ 1540664944;
                                                i16 = 897089650;
                                            } else {
                                                iM31613 = C0773.m3169("᩷ᩴ") ^ i24;
                                                i15 = ((iM31613 ^ i25) * (-26187)) ^ (-1295376259);
                                                i16 = 1741915658;
                                            }
                                            i27 = iM31613 ^ i16;
                                            strM6233 = str2;
                                            s6 = s4;
                                            sArr8 = sArr6;
                                            i26 = i15;
                                            sArr7 = sArr5;
                                            baseResp2 = baseResp;
                                            break;
                                        case -1399236770:
                                        case 1326704549:
                                            str = strM6233;
                                            sArr5 = sArr7;
                                            sArr6 = sArr8;
                                            s6 = sArr9[c2];
                                            s5 = 72240;
                                            if (C1564.m5509() <= 0) {
                                                iM31614 = C0773.m3169("۟ۡ") ^ i24;
                                                i15 = ((iM31614 ^ i25) * 25647) ^ (-477844984);
                                                i17 = -1198463029;
                                            } else {
                                                iM31614 = (C0773.m3169("ۘ᩶") + i25) * (-37);
                                                i15 = ((iM31614 ^ i24) * (-31787)) ^ (-2117428181);
                                                i17 = -1382785956;
                                            }
                                            i27 = iM31614 ^ i17;
                                            strM6233 = str;
                                            sArr8 = sArr6;
                                            i26 = i15;
                                            sArr7 = sArr5;
                                            baseResp2 = baseResp;
                                            break;
                                        case -1364835991:
                                        case 388996342:
                                            abstractActivityC17206 = abstractActivityC17205;
                                            interfaceC15379 = new InterfaceC15379() { // from class: l.ܽۡ᩻

                                                /* JADX INFO: renamed from: ۧ᩸ۖ, reason: not valid java name and contains not printable characters */
                                                private static final short[] f56833 = {3667, -2193, -2184, -2194, -2195, -2190, -2189, -2194, -2184, -25739, -31354, 31545, -25880, -24345, 29045, 29647, -31234, -23177, -2182, -2184, -2199, -2226, -2199, -2193, -2188, -2189, -2182, -2251, -2253, -2253, -2253, -2252};

                                                {
                                                    int i36 = -176648552;
                                                    int i37 = C3779.f12953;
                                                    int i38 = AbstractC0641.f2496;
                                                    int iM31617 = C0773.m3169("ܽ᩺") ^ i38;
                                                    int i39 = ((iM31617 ^ i37) * 12357) ^ (-1817220540);
                                                    int i40 = -1760396833;
                                                    while (true) {
                                                        i36 = ((((i36 ^ i37) * 16885) >> 31) & i39) ^ (iM31617 ^ i40);
                                                        switch (i36) {
                                                            case -2035431384:
                                                            case 1500707889:
                                                                if (AbstractC3624.f12429 <= 0) {
                                                                    iM31617 = C0619.m2761("᩹ܽ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * (-7891)) ^ (-728768590);
                                                                    i40 = -423757613;
                                                                } else {
                                                                    iM31617 = (C0773.m3169("ۚۗ") + i38) * 43;
                                                                    i39 = ((iM31617 ^ i37) * 26089) ^ 1528156381;
                                                                    i40 = 301196831;
                                                                }
                                                                break;
                                                            case -1886263764:
                                                            case 1140253946:
                                                                if (C0773.m3161() != 0) {
                                                                    iM31617 = (i37 - C0773.m3169("ܳܶ")) * 97;
                                                                    i39 = ((iM31617 ^ i38) * 22103) ^ 822611448;
                                                                    i40 = 747161325;
                                                                } else {
                                                                    iM31617 = (C0773.m3169("ۗۢ") ^ i37) * (-97);
                                                                    i39 = ((iM31617 ^ i38) * 28075) ^ 2072158627;
                                                                    i40 = 769362119;
                                                                }
                                                                break;
                                                            case -1801342283:
                                                            case 441690104:
                                                                return;
                                                            case -1676666409:
                                                            case 1818973893:
                                                                C2287.m7745();
                                                                iM31617 = (i37 - C0773.m3169("ܳܶ")) * 97;
                                                                i39 = ((iM31617 ^ i38) * 22103) ^ 822611448;
                                                                i40 = 747161325;
                                                                break;
                                                            case -1438675075:
                                                            case -15694138:
                                                                if (C1343.f4799 != 0) {
                                                                    iM31617 = (i37 - C0619.m2761("۠۟")) * (-49);
                                                                    i39 = ((iM31617 ^ i38) * (-13671)) ^ (-1962317302);
                                                                    i40 = -653857954;
                                                                } else {
                                                                    iM31617 = C0773.m3169("ۛۤ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * (-3171)) ^ (-1293833900);
                                                                    i40 = -1870206621;
                                                                }
                                                                break;
                                                            case -1144755311:
                                                            case -867643153:
                                                                if (C1564.f5401 <= 0) {
                                                                    iM31617 = C0619.m2761("᩹ۚ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * 32213) ^ 1205079506;
                                                                    i40 = -1094779850;
                                                                } else {
                                                                    iM31617 = C0773.m3169("֨֫") ^ i37;
                                                                    i39 = ((iM31617 ^ i38) * (-26053)) ^ (-1854222490);
                                                                    i40 = -695702797;
                                                                }
                                                                break;
                                                            case -785353751:
                                                            case 265085722:
                                                                if (C1783.f6087 <= 0) {
                                                                    iM31617 = C0619.m2761("᩹ۚ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * 32213) ^ 1205079506;
                                                                    i40 = -1094779850;
                                                                } else {
                                                                    iM31617 = C0619.m2761("᩹ܽ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * (-7891)) ^ (-728768590);
                                                                    i40 = -423757613;
                                                                }
                                                                break;
                                                            case -755881122:
                                                            case -220749349:
                                                                if (C11235.f35427 >= 0) {
                                                                    iM31617 = C0619.m2761("᩹ۚ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * 32213) ^ 1205079506;
                                                                    i40 = -1094779850;
                                                                } else {
                                                                    iM31617 = (C0619.m2761("ۚۘ") + i38) * 97;
                                                                    i39 = ((iM31617 ^ i37) * (-24445)) ^ (-1884879771);
                                                                    i40 = 507993752;
                                                                }
                                                                break;
                                                            case -754457817:
                                                            case 2111332158:
                                                                if (AbstractC0641.f2496 >= 0) {
                                                                    iM31617 = (i37 - C0619.m2761("֨۬")) * (-51);
                                                                    i39 = ((iM31617 ^ i38) * (-26615)) ^ (-1487033077);
                                                                    i40 = 1744501283;
                                                                } else {
                                                                    iM31617 = C0619.m2761("᩹ܽ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * (-7891)) ^ (-728768590);
                                                                    i40 = -423757613;
                                                                }
                                                                break;
                                                            case -710007012:
                                                            case 284000644:
                                                                if (C2023.f6737) {
                                                                    iM31617 = (i37 - C0773.m3169("ܳܶ")) * 97;
                                                                    i39 = ((iM31617 ^ i38) * 22103) ^ 822611448;
                                                                    i40 = 747161325;
                                                                } else {
                                                                    iM31617 = (C0773.m3169("ۙܺ") + i38) * 7;
                                                                    i39 = ((iM31617 ^ i37) * 31185) ^ 11732733;
                                                                    i40 = 1880715700;
                                                                }
                                                                break;
                                                            case -384669519:
                                                            case -286636258:
                                                                C2419.m8174();
                                                                C4282.m13644();
                                                                throw new RuntimeException();
                                                            case -207865847:
                                                            case 499586800:
                                                                if (C3690.f12684 <= 0) {
                                                                    iM31617 = (i37 - C0619.m2761("֨۬")) * (-51);
                                                                    i39 = ((iM31617 ^ i38) * (-26615)) ^ (-1487033077);
                                                                    i40 = 1744501283;
                                                                } else {
                                                                    iM31617 = C0773.m3169("ۧᩳ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * 8465) ^ (-846297073);
                                                                    i40 = -37910870;
                                                                }
                                                                break;
                                                            case 483144446:
                                                            case 879252037:
                                                                C2023.m6964();
                                                                if (AbstractC0116.f1064 > 0) {
                                                                    iM31617 = C0619.m2761("᩹ܽ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * (-7891)) ^ (-728768590);
                                                                    i40 = -423757613;
                                                                } else {
                                                                    iM31617 = (i37 - C0773.m3169("ܳܶ")) * 97;
                                                                    i39 = ((iM31617 ^ i38) * 22103) ^ 822611448;
                                                                    i40 = 747161325;
                                                                }
                                                                break;
                                                            case 779768773:
                                                            case 884281535:
                                                                if (C3734.m12152() >= 0) {
                                                                    iM31617 = (i37 - C0619.m2761("֨۬")) * (-51);
                                                                    i39 = ((iM31617 ^ i38) * (-26615)) ^ (-1487033077);
                                                                    i40 = 1744501283;
                                                                } else {
                                                                    iM31617 = C0619.m2761("ۗܺ") ^ i37;
                                                                    i39 = ((iM31617 ^ i38) * 28515) ^ 1272747564;
                                                                    i40 = 1894415940;
                                                                }
                                                                break;
                                                            case 1981072403:
                                                            case 2003362612:
                                                                if (AbstractC0641.f2496 >= 0) {
                                                                    iM31617 = C0619.m2761("᩹ۚ") ^ i38;
                                                                    i39 = ((iM31617 ^ i37) * 32213) ^ 1205079506;
                                                                    i40 = -1094779850;
                                                                } else {
                                                                    iM31617 = (C0619.m2761("ۨۧ") ^ i37) * (-99);
                                                                    i39 = ((iM31617 ^ i38) * (-8051)) ^ 949610574;
                                                                    i40 = 416539294;
                                                                }
                                                                break;
                                                            default:
                                                                if (C3099.f10023 <= 0) {
                                                                    iM31617 = (i37 - C0773.m3169("ܳܶ")) * 97;
                                                                    i39 = ((iM31617 ^ i38) * 22103) ^ 822611448;
                                                                    i40 = 747161325;
                                                                } else {
                                                                    iM31617 = (C0619.m2761("۟ۜ") ^ i37) * (-19);
                                                                    i39 = ((iM31617 ^ i38) * 2359) ^ (-1599424095);
                                                                    i40 = -942400694;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }

                                                /* JADX WARN: Code duplicated, block: B:87:0x0397 A[PHI: r1 r2 r6 r15 r18 r19 r25
                                                  0x0397: PHI (r1v29 short[]) = (r1v2 short[]), (r1v10 short[]), (r1v35 short[]), (r1v36 short[]) binds: [B:86:0x0395, B:69:0x02a6, B:33:0x00f8, B:30:0x00db] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0397: PHI (r2v24 int) = (r2v5 int), (r2v12 int), (r2v26 int), (r2v27 int) binds: [B:86:0x0395, B:69:0x02a6, B:33:0x00f8, B:30:0x00db] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0397: PHI (r6v10 int) = (r6v3 int), (r6v8 int), (r6v15 int), (r6v16 int) binds: [B:86:0x0395, B:69:0x02a6, B:33:0x00f8, B:30:0x00db] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0397: PHI (r15v14 short[]) = (r15v4 short[]), (r15v10 short[]), (r15v16 short[]), (r15v17 short[]) binds: [B:86:0x0395, B:69:0x02a6, B:33:0x00f8, B:30:0x00db] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0397: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:86:0x0395, B:69:0x02a6, B:33:0x00f8, B:30:0x00db] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0397: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:86:0x0395, B:69:0x02a6, B:33:0x00f8, B:30:0x00db] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0397: PHI (r25v14 int) = (r25v2 int), (r25v8 int), (r25v15 int), (r25v15 int) binds: [B:86:0x0395, B:69:0x02a6, B:33:0x00f8, B:30:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
                                                @Override // l.InterfaceC15379
                                                /* JADX INFO: renamed from: ۙ */
                                                public final void mo5773(C13778 c13778) {
                                                    int iM2767;
                                                    int i36;
                                                    int i37;
                                                    short[] sArr10;
                                                    int iM31617;
                                                    int i38;
                                                    int i39;
                                                    short[] sArr11;
                                                    int iM2768;
                                                    int i40;
                                                    int iM31618;
                                                    int i41;
                                                    int iM31619;
                                                    int i42;
                                                    C17486 c17486 = this;
                                                    c13778 = c13778;
                                                    int i43 = AbstractC0641.f2496;
                                                    int i44 = C3779.f12953;
                                                    int iM31620 = (C0773.m3169("ۙᩳ") ^ i44) * 35;
                                                    int i45 = ((iM31620 ^ i43) * (-14731)) ^ (-1231449113);
                                                    short[] sArr12 = null;
                                                    short[] sArr13 = null;
                                                    short[] sArr14 = null;
                                                    short[] sArr15 = null;
                                                    int i46 = iM31620 ^ (-919980100);
                                                    C24750 c24752 = null;
                                                    int iM9938 = 0;
                                                    int i47 = 0;
                                                    int iM31621 = 0;
                                                    int iM31622 = 0;
                                                    int i48 = 0;
                                                    int i49 = 0;
                                                    int i50 = 0;
                                                    int i51 = 0;
                                                    int i52 = 0;
                                                    char c3 = 0;
                                                    short s7 = 0;
                                                    short s8 = 0;
                                                    int i53 = 0;
                                                    int i54 = 275899890;
                                                    int i55 = 0;
                                                    while (true) {
                                                        i54 = i46 ^ (i45 & (((i54 ^ i43) * (-30335)) >> 31));
                                                        switch (i54) {
                                                            case -2098852046:
                                                            case 1178388821:
                                                                i50 = 63261;
                                                                iM2767 = C0773.m3169("֨ۘ") ^ i43;
                                                                i36 = ((iM2767 ^ i44) * (-31041)) ^ (-1025034216);
                                                                i37 = 2053204131;
                                                                i39 = iM2767 ^ i37;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                i45 = i36;
                                                                sArr14 = sArr14;
                                                                iM31621 = iM31621;
                                                                c13778 = c13778;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -1937281910:
                                                            case 159629465:
                                                                int i56 = iM31621;
                                                                short[] sArr16 = sArr14;
                                                                c22673M9668.m51161();
                                                                boolean zM5516 = C1564.m5516(c13778);
                                                                c24752 = c24751;
                                                                if (zM5516) {
                                                                    iM31618 = C0619.m2761("ۗۤ") ^ i43;
                                                                    i45 = ((iM31618 ^ i44) * (-28547)) ^ (-1010073632);
                                                                    i41 = 1388179683;
                                                                } else {
                                                                    iM31618 = (i44 - C0773.m3169("ۛ᩶")) * 63;
                                                                    i45 = ((iM31618 ^ i43) * 2197) ^ (-1553356555);
                                                                    i41 = -1885535180;
                                                                }
                                                                int i57 = iM31618 ^ i41;
                                                                sArr14 = sArr16;
                                                                iM31621 = i56;
                                                                i46 = i57;
                                                                c13778 = c13778;
                                                                break;
                                                            case -1860283874:
                                                            case 1841840662:
                                                                C2023.m6964();
                                                                if (!RunnableC1848.f6235) {
                                                                    iM31621 = iM31621;
                                                                    sArr10 = sArr14;
                                                                    iM31617 = C0773.m3169("᩺ۗ") ^ i44;
                                                                    i45 = 1697764016 ^ ((iM31617 ^ i43) * 1587);
                                                                    i38 = 1159608765;
                                                                    i39 = iM31617 ^ i38;
                                                                    sArr14 = sArr10;
                                                                    iM31621 = iM31621;
                                                                    i46 = i39;
                                                                    c17486 = this;
                                                                }
                                                                iM31621 = iM31621;
                                                                sArr10 = sArr14;
                                                                iM31617 = C0773.m3169("᩵ۜ") ^ i43;
                                                                i45 = (-1335728987) ^ ((iM31617 ^ i44) * (-2785));
                                                                i38 = -379715912;
                                                                i39 = iM31617 ^ i38;
                                                                sArr14 = sArr10;
                                                                iM31621 = iM31621;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -1823360932:
                                                            case -1570830204:
                                                                C3492.m11488();
                                                                if (C2310.f7472 >= 0) {
                                                                    iM31621 = iM31621;
                                                                    sArr11 = sArr14;
                                                                    iM2768 = C0773.m3169("᩸ܽ") ^ i44;
                                                                    i45 = (-866321873) ^ ((iM2768 ^ i43) * 20339);
                                                                    i40 = 1089429405;
                                                                    i39 = iM2768 ^ i40;
                                                                    c13778 = c13778;
                                                                    iM31621 = iM31621;
                                                                    sArr14 = sArr11;
                                                                    i46 = i39;
                                                                    c17486 = this;
                                                                }
                                                                iM31621 = iM31621;
                                                                sArr10 = sArr14;
                                                                iM31617 = C0773.m3169("᩵ۜ") ^ i43;
                                                                i45 = (-1335728987) ^ ((iM31617 ^ i44) * (-2785));
                                                                i38 = -379715912;
                                                                i39 = iM31617 ^ i38;
                                                                sArr14 = sArr10;
                                                                iM31621 = iM31621;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -1721680749:
                                                            case 1711633778:
                                                                c24752.m55254(RunnableC1848.m6367(c13778, iM31621), true);
                                                                C11471 c11471 = C11471.f36082;
                                                                break;
                                                            case -1706823976:
                                                            case -590819824:
                                                                c24752.m55254(RunnableC1848.m6367(c13778, iM31621), false);
                                                                C11471 c11472 = C11471.f36082;
                                                                break;
                                                            case -1660620032:
                                                            case 1192753986:
                                                                short[] sArr17 = sArr14;
                                                                iM31621 = C0773.m3169(C2485.m8350(sArr15, i51, i52, i50)) ^ 2125856420;
                                                                if (iM9938 == i47) {
                                                                    iM31619 = (i43 - C0619.m2761("ܽ۠")) * (-117);
                                                                    i45 = (-766726672) ^ ((iM31619 ^ i44) * 19371);
                                                                    i42 = 363665046;
                                                                } else {
                                                                    iM31619 = C0773.m3169("ᩴۖ") ^ i44;
                                                                    i45 = (-40072638) ^ ((iM31619 ^ i43) * (-7865));
                                                                    i42 = -179065404;
                                                                }
                                                                i46 = iM31619 ^ i42;
                                                                c17486 = this;
                                                                c13778 = c13778;
                                                                sArr14 = sArr17;
                                                                break;
                                                            case -1308382347:
                                                            case 1670074445:
                                                                RunnableC1848.m6360();
                                                                C1564.m5509();
                                                                break;
                                                            case -1277288271:
                                                            case -336164345:
                                                                iM31621 = iM31621;
                                                                sArr10 = sArr14;
                                                                if (AbstractC0641.m2815(c13778) == 1600) {
                                                                    iM31617 = C0619.m2761("ۗۧ") ^ i44;
                                                                    i45 = 2004010797 ^ ((iM31617 ^ i43) * 26957);
                                                                    i38 = 40735121;
                                                                } else {
                                                                    iM31617 = C0773.m3169("᩸ۛ") ^ i44;
                                                                    i45 = 196372568 ^ ((iM31617 ^ i43) * 24009);
                                                                    i38 = 918469994;
                                                                }
                                                                i39 = iM31617 ^ i38;
                                                                sArr14 = sArr10;
                                                                iM31621 = iM31621;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -1215118856:
                                                            case 973466030:
                                                                iM31621 = iM31621;
                                                                sArr10 = sArr14;
                                                                iM31622 = C0773.m3169(RunnableC1848.m6366(sArr10, i48, i49, i50));
                                                                if (RunnableC0334.m2063()) {
                                                                    iM31617 = C0773.m3169("᩺ۗ") ^ i44;
                                                                    i45 = 1697764016 ^ ((iM31617 ^ i43) * 1587);
                                                                    i38 = 1159608765;
                                                                } else {
                                                                    iM31617 = (i43 - C0619.m2761("۫ۖ")) * 23;
                                                                    i45 = 2009774765 ^ ((iM31617 ^ i44) * 11253);
                                                                    i38 = 622637904;
                                                                }
                                                                i39 = iM31617 ^ i38;
                                                                sArr14 = sArr10;
                                                                iM31621 = iM31621;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -664467595:
                                                            case -256619679:
                                                                iM31621 = iM31621;
                                                                sArr10 = sArr14;
                                                                sArr13 = f56833;
                                                                i53 = 1;
                                                                i55 = 8;
                                                                if (C3033.f9831 >= 0) {
                                                                    iM31617 = C0773.m3169("᩵ۜ") ^ i43;
                                                                    i45 = (-1335728987) ^ ((iM31617 ^ i44) * (-2785));
                                                                    i38 = -379715912;
                                                                } else {
                                                                    iM31617 = C0773.m3169("ܶ᩷") ^ i44;
                                                                    i45 = 1688881445 ^ ((iM31617 ^ i43) * (-6855));
                                                                    i38 = 620177177;
                                                                }
                                                                i39 = iM31617 ^ i38;
                                                                sArr14 = sArr10;
                                                                iM31621 = iM31621;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -664223748:
                                                            case 424813081:
                                                                iM31621 = iM31621;
                                                                sArr14 = f56833;
                                                                i48 = 9;
                                                                i49 = 3;
                                                                if (C2702.m8876()) {
                                                                    int iM31623 = (C0773.m3169("֫᩶") + i44) * (-53);
                                                                    i45 = 752674983 ^ ((iM31623 ^ i43) * (-13927));
                                                                    i39 = iM31623 ^ 1498301765;
                                                                    iM31621 = iM31621;
                                                                    i46 = i39;
                                                                    c17486 = this;
                                                                }
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                int iM31624 = C0773.m3169("ܺۜ") ^ i43;
                                                                int i58 = ((iM31624 ^ i44) * 2903) ^ 752805090;
                                                                i39 = iM31624 ^ (-417517306);
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                i45 = i58;
                                                                iM31621 = iM31621;
                                                                c13778 = c13778;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -523447074:
                                                            case 737481303:
                                                                byte[] bArrM33668 = c13778.m33668();
                                                                iM31621 = iM31621;
                                                                short[] sArr18 = f56833;
                                                                if (C2310.f7472 < 0) {
                                                                    sArr11 = sArr14;
                                                                    int iM31625 = C0773.m3169(C13473.m33137(sArr18, 15, 3, i50)) ^ 2098387317;
                                                                    if (C1826.f6190 > 0) {
                                                                        AbstractActivityC17204 abstractActivityC17207 = abstractActivityC17206;
                                                                        String strM6246 = C1783.m6246(abstractActivityC17207, iM31625);
                                                                        short[] sArr19 = f56833;
                                                                        if (C2702.f8586 > 0) {
                                                                            C0269.m1781(strM6246, C3734.m12149(sArr19, 18, 14, i50));
                                                                            new ViewOnClickListenerC4062(abstractActivityC17207, c24752, bArrM33668, strM6246);
                                                                        }
                                                                        iM2768 = C0773.m3169("᩸ܽ") ^ i44;
                                                                        i45 = (-866321873) ^ ((iM2768 ^ i43) * 20339);
                                                                        i40 = 1089429405;
                                                                        i39 = iM2768 ^ i40;
                                                                        c13778 = c13778;
                                                                        iM31621 = iM31621;
                                                                        sArr14 = sArr11;
                                                                        i46 = i39;
                                                                        c17486 = this;
                                                                    } else {
                                                                        sArr13 = sArr13;
                                                                        i53 = i53;
                                                                        i55 = i55;
                                                                        sArr14 = sArr11;
                                                                    }
                                                                } else {
                                                                    sArr14 = sArr14;
                                                                    sArr13 = sArr13;
                                                                    i53 = i53;
                                                                    i55 = i55;
                                                                }
                                                                iM2767 = (C0619.m2761("ۚ۬") ^ i44) * 57;
                                                                i36 = ((iM2767 ^ i43) * (-19209)) ^ 1504219714;
                                                                i37 = -525729600;
                                                                i39 = iM2767 ^ i37;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                i45 = i36;
                                                                sArr14 = sArr14;
                                                                iM31621 = iM31621;
                                                                c13778 = c13778;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -224344649:
                                                            case 1360308062:
                                                                i50 = 48851;
                                                                iM2767 = C0773.m3169("֨ۘ") ^ i43;
                                                                i36 = ((iM2767 ^ i44) * (-31041)) ^ (-1025034216);
                                                                i37 = 2053204131;
                                                                i39 = iM2767 ^ i37;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                i45 = i36;
                                                                sArr14 = sArr14;
                                                                iM31621 = iM31621;
                                                                c13778 = c13778;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -103172049:
                                                            case 1711526976:
                                                                iM31621 = iM31621;
                                                                sArr14 = sArr14;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                s7 = sArr12[c3];
                                                                s8 = 22690;
                                                                if (C0269.f1558 <= 0) {
                                                                    iM2767 = (C0619.m2761("ۚ۬") ^ i44) * 57;
                                                                    i36 = ((iM2767 ^ i43) * (-19209)) ^ 1504219714;
                                                                    i37 = -525729600;
                                                                } else {
                                                                    iM2767 = (C0619.m2761("֫۬") ^ i44) * 61;
                                                                    i36 = ((iM2767 ^ i43) * (-17261)) ^ (-585096879);
                                                                    i37 = -1115222919;
                                                                }
                                                                i39 = iM2767 ^ i37;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                i45 = i36;
                                                                sArr14 = sArr14;
                                                                iM31621 = iM31621;
                                                                c13778 = c13778;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case -60183944:
                                                            case 522575679:
                                                                iM31621 = iM31621;
                                                                sArr11 = sArr14;
                                                                iM9938 = RunnableC3055.m9938(c13778);
                                                                i47 = 9;
                                                                sArr15 = f56833;
                                                                i51 = 12;
                                                                i52 = 3;
                                                                if (!C2023.f6737) {
                                                                    iM2768 = (C0619.m2761("ᩴۡ") + i43) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                                    i45 = (-1676882181) ^ ((iM2768 ^ i44) * (-577));
                                                                    i40 = 1930783731;
                                                                    i39 = iM2768 ^ i40;
                                                                    c13778 = c13778;
                                                                    iM31621 = iM31621;
                                                                    sArr14 = sArr11;
                                                                    i46 = i39;
                                                                    c17486 = this;
                                                                } else {
                                                                    sArr10 = sArr11;
                                                                    iM31617 = C0773.m3169("᩺ۗ") ^ i44;
                                                                    i45 = 1697764016 ^ ((iM31617 ^ i43) * 1587);
                                                                    i38 = 1159608765;
                                                                    i39 = iM31617 ^ i38;
                                                                    sArr14 = sArr10;
                                                                    iM31621 = iM31621;
                                                                    i46 = i39;
                                                                    c17486 = this;
                                                                }
                                                                break;
                                                            case 225412142:
                                                            case 1588570070:
                                                                iM31621 = iM31621;
                                                                sArr14 = sArr14;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                C3734.m12144(c13778, C2834.m9343(sArr13, i53, i55, i50));
                                                                if (C2287.f7432 >= 0) {
                                                                    iM2767 = (C0619.m2761("ۚ۬") ^ i44) * 57;
                                                                    i36 = ((iM2767 ^ i43) * (-19209)) ^ 1504219714;
                                                                    i37 = -525729600;
                                                                    i39 = iM2767 ^ i37;
                                                                    sArr13 = sArr13;
                                                                    i53 = i53;
                                                                    i55 = i55;
                                                                    i45 = i36;
                                                                    sArr14 = sArr14;
                                                                    iM31621 = iM31621;
                                                                    c13778 = c13778;
                                                                    i46 = i39;
                                                                } else {
                                                                    int iM31626 = (C0773.m3169("ܳ᩺") + i43) * (-111);
                                                                    sArr13 = sArr13;
                                                                    i53 = i53;
                                                                    i55 = i55;
                                                                    iM31621 = iM31621;
                                                                    c13778 = c13778;
                                                                    i45 = ((iM31626 ^ i44) * 21467) ^ 187650070;
                                                                    i46 = iM31626 ^ (-982221776);
                                                                    sArr14 = sArr14;
                                                                }
                                                                c17486 = this;
                                                                break;
                                                            case 226419192:
                                                            case 1425414786:
                                                                iM31621 = iM31621;
                                                                sArr14 = sArr14;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                if (((s7 * s7) + 128709025) - (s7 * s8) < 0) {
                                                                    iM2767 = C0773.m3169("᩻ۖ") ^ i44;
                                                                    i36 = ((iM2767 ^ i43) * 3205) ^ 672459282;
                                                                    i37 = 2022688211;
                                                                } else {
                                                                    iM2767 = (C0619.m2761("ܿ۬") + i43) * (-37);
                                                                    i36 = ((iM2767 ^ i44) * (-16815)) ^ (-1551131676);
                                                                    i37 = -1463609872;
                                                                }
                                                                i39 = iM2767 ^ i37;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                i45 = i36;
                                                                sArr14 = sArr14;
                                                                iM31621 = iM31621;
                                                                c13778 = c13778;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case 530219826:
                                                            case 1769225582:
                                                                if (C2702.f8586 > 0) {
                                                                    iM31621 = iM31621;
                                                                    sArr13 = sArr13;
                                                                    i53 = i53;
                                                                    i55 = i55;
                                                                    int iM31627 = C0773.m3169("ܺۜ") ^ i43;
                                                                    int i59 = ((iM31627 ^ i44) * 2903) ^ 752805090;
                                                                    i39 = iM31627 ^ (-417517306);
                                                                    sArr13 = sArr13;
                                                                    i53 = i53;
                                                                    i55 = i55;
                                                                    i45 = i59;
                                                                    iM31621 = iM31621;
                                                                    c13778 = c13778;
                                                                    i46 = i39;
                                                                    c17486 = this;
                                                                }
                                                                iM31621 = iM31621;
                                                                sArr10 = sArr14;
                                                                iM31617 = C0773.m3169("᩵ۜ") ^ i43;
                                                                i45 = (-1335728987) ^ ((iM31617 ^ i44) * (-2785));
                                                                i38 = -379715912;
                                                                i39 = iM31617 ^ i38;
                                                                sArr14 = sArr10;
                                                                iM31621 = iM31621;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            case 1543513169:
                                                            case 1987447135:
                                                                c24752.m55253(2125943707 ^ iM31622);
                                                                C11471 c11473 = C11471.f36082;
                                                                break;
                                                            case 1798559005:
                                                            case 1820678934:
                                                                C2834.m9344();
                                                                C2310.m7813();
                                                                iM31621 = iM31621;
                                                                sArr10 = sArr14;
                                                                iM31617 = C0773.m3169("᩵ۜ") ^ i43;
                                                                i45 = (-1335728987) ^ ((iM31617 ^ i44) * (-2785));
                                                                i38 = -379715912;
                                                                i39 = iM31617 ^ i38;
                                                                sArr14 = sArr10;
                                                                iM31621 = iM31621;
                                                                i46 = i39;
                                                                c17486 = this;
                                                                break;
                                                            default:
                                                                iM31621 = iM31621;
                                                                sArr14 = sArr14;
                                                                sArr13 = sArr13;
                                                                i53 = i53;
                                                                i55 = i55;
                                                                sArr12 = f56833;
                                                                c3 = 0;
                                                                if (C3734.f12817 < 0) {
                                                                    iM2767 = (i43 - C0619.m2761("۟᩹")) * (-11);
                                                                    i36 = ((iM2767 ^ i44) * 25523) ^ 1593806597;
                                                                    i37 = -251305737;
                                                                    i39 = iM2767 ^ i37;
                                                                    sArr13 = sArr13;
                                                                    i53 = i53;
                                                                    i55 = i55;
                                                                    i45 = i36;
                                                                    sArr14 = sArr14;
                                                                    iM31621 = iM31621;
                                                                    c13778 = c13778;
                                                                    i46 = i39;
                                                                    c17486 = this;
                                                                } else {
                                                                    sArr14 = sArr14;
                                                                    int iM31628 = C0773.m3169("ܺۜ") ^ i43;
                                                                    int i510 = ((iM31628 ^ i44) * 2903) ^ 752805090;
                                                                    i39 = iM31628 ^ (-417517306);
                                                                    sArr13 = sArr13;
                                                                    i53 = i53;
                                                                    i55 = i55;
                                                                    i45 = i510;
                                                                    iM31621 = iM31621;
                                                                    c13778 = c13778;
                                                                    i46 = i39;
                                                                    c17486 = this;
                                                                }
                                                                break;
                                                        }
                                                        return;
                                                    }
                                                }
                                            };
                                            if (C17202.f56030) {
                                                iM2763 = (C0619.m2761("᩶᩺") ^ i25) * 25;
                                                i22 = ((iM2763 ^ i24) * 12949) ^ 59483877;
                                                i23 = 1132913032;
                                            } else {
                                                iM2763 = (C0773.m3169("ᩴܳ") + i25) * (-71);
                                                i22 = ((iM2763 ^ i24) * 8769) ^ 1149257401;
                                                i23 = 1803227074;
                                            }
                                            i27 = iM2763 ^ i23;
                                            i26 = i22;
                                            break;
                                        case -1116259183:
                                        case -866806004:
                                            sArr7 = sArr7;
                                            int i36 = i33;
                                            String strM4222 = C1146.m4222(sArr7, i36, 3, i29);
                                            if (C20932.f66974 > 0) {
                                                int iM31617 = (C0773.m3169("۫ۚ") + i24) * 13;
                                                i26 = ((iM31617 ^ i25) * (-22279)) ^ 1364863948;
                                                i33 = i36;
                                                str3 = strM4222;
                                                i27 = iM31617 ^ (-1476093264);
                                                sArr7 = sArr7;
                                            } else {
                                                i33 = i36;
                                                sArr7 = sArr7;
                                                str3 = strM4222;
                                                int iM31618 = (i25 - C0773.m3169("ۘ֡")) * (-119);
                                                i26 = ((iM31618 ^ i24) * 23691) ^ (-1042649517);
                                                i27 = iM31618 ^ 1614026436;
                                                this = this;
                                            }
                                            break;
                                        case -428685385:
                                        case 2037152532:
                                            sArr7 = sArr7;
                                            sArr8 = sArr8;
                                            strM6233 = C1783.m6233(f80762, 1, 4, i29);
                                            if (C1321.f4751 < 0) {
                                                int iM31619 = (C0773.m3169("᩹ᩳ") ^ i25) * (-59);
                                                i26 = ((iM31619 ^ i24) * (-5813)) ^ (-579880800);
                                                i27 = iM31619 ^ (-307031295);
                                                this = this;
                                                sArr8 = sArr8;
                                                sArr7 = sArr7;
                                            } else {
                                                sArr8 = sArr8;
                                                sArr7 = sArr7;
                                                int iM316110 = (i25 - C0773.m3169("ۘ֡")) * (-119);
                                                i26 = ((iM316110 ^ i24) * 23691) ^ (-1042649517);
                                                i27 = iM316110 ^ 1614026436;
                                                this = this;
                                            }
                                            break;
                                        case -305619063:
                                        case 333372018:
                                            strM6233 = strM6233;
                                            sArr7 = sArr7;
                                            sArr8 = sArr8;
                                            C17202.m40379(baseResp2, strM6233);
                                            c24751 = c24750;
                                            if (!c24751.m55255()) {
                                                iM2761 = C0619.m2761("᩷ۛ") ^ i24;
                                                i18 = ((iM2761 ^ i25) * (-29149)) ^ (-1003103103);
                                                i19 = -1030784433;
                                                i27 = iM2761 ^ i19;
                                                this = this;
                                                strM6233 = strM6233;
                                                i26 = i18;
                                                sArr8 = sArr8;
                                                sArr7 = sArr7;
                                            } else {
                                                int iM2767 = (C0619.m2761("ܶ֡") + i24) * (-7);
                                                int i37 = ((iM2767 ^ i25) * (-24467)) ^ (-42590603);
                                                i27 = iM2767 ^ 1461904925;
                                                strM6233 = strM6233;
                                                sArr8 = sArr8;
                                                i26 = i37;
                                                sArr7 = sArr7;
                                                this = this;
                                            }
                                            break;
                                        case -277939404:
                                        case 29482392:
                                            if (C1321.f4751 < 0) {
                                                iM2763 = (C0773.m3169("ᩴܳ") + i25) * (-71);
                                                i22 = ((iM2763 ^ i24) * 8769) ^ 1149257401;
                                                i23 = 1803227074;
                                            } else {
                                                iM2763 = C0619.m2761("ۜ֨") ^ i25;
                                                i22 = ((iM2763 ^ i24) * (-23169)) ^ (-460391818);
                                                i23 = -2066540294;
                                            }
                                            i27 = iM2763 ^ i23;
                                            i26 = i22;
                                            break;
                                        case -216073858:
                                        case 388537909:
                                            C3734.m12152();
                                            if (!C1343.m4943()) {
                                                iM2763 = (C0773.m3169("ᩴܳ") + i25) * (-71);
                                                i22 = ((iM2763 ^ i24) * 8769) ^ 1149257401;
                                                i23 = 1803227074;
                                                i27 = iM2763 ^ i23;
                                                i26 = i22;
                                            } else {
                                                str2 = strM6233;
                                                sArr5 = sArr7;
                                                sArr6 = sArr8;
                                                s4 = s6;
                                                iM31613 = (C0619.m2761("᩵ۢ") + i24) * 65;
                                                i15 = ((iM31613 ^ i25) * (-28173)) ^ 1540664944;
                                                i16 = 897089650;
                                                i27 = iM31613 ^ i16;
                                                strM6233 = str2;
                                                s6 = s4;
                                                sArr8 = sArr6;
                                                i26 = i15;
                                                sArr7 = sArr5;
                                                baseResp2 = baseResp;
                                            }
                                            break;
                                        case 95388947:
                                        case 1024814667:
                                            c24751.m55256();
                                            break;
                                        case 159157962:
                                        case 1898389726:
                                            i29 = 30831;
                                            iM2761 = C0619.m2761("ܶۙ") ^ i24;
                                            i18 = ((iM2761 ^ i25) * (-31303)) ^ 1797113163;
                                            i19 = -327396402;
                                            i27 = iM2761 ^ i19;
                                            this = this;
                                            strM6233 = strM6233;
                                            i26 = i18;
                                            sArr8 = sArr8;
                                            sArr7 = sArr7;
                                            break;
                                        case 235296580:
                                        case 1687496779:
                                            if (C4282.f15546 <= 0) {
                                                str = strM6233;
                                                sArr5 = sArr7;
                                                sArr6 = sArr8;
                                                iM31614 = C0773.m3169("۟ۡ") ^ i24;
                                                i15 = ((iM31614 ^ i25) * 25647) ^ (-477844984);
                                                i17 = -1198463029;
                                                i27 = iM31614 ^ i17;
                                                strM6233 = str;
                                                sArr8 = sArr6;
                                                i26 = i15;
                                                sArr7 = sArr5;
                                                baseResp2 = baseResp;
                                            } else {
                                                iM2763 = (C0773.m3169("ᩴܳ") + i25) * (-71);
                                                i22 = ((iM2763 ^ i24) * 8769) ^ 1149257401;
                                                i23 = 1803227074;
                                                i27 = iM2763 ^ i23;
                                                i26 = i22;
                                            }
                                            break;
                                        case 258407362:
                                        case 380040363:
                                            C20932.m47848();
                                            C3779.m12264();
                                            break;
                                        case 402869946:
                                        case 1131055980:
                                            str2 = strM6233;
                                            sArr5 = sArr7;
                                            sArr6 = sArr8;
                                            s4 = s6;
                                            int i38 = s4 + 18060;
                                            if ((s6 * s5) - (i38 * i38) <= 0) {
                                                iM31613 = (C0619.m2761("᩵᩺") + i24) * (-111);
                                                i15 = ((iM31613 ^ i25) * (-3141)) ^ 818694672;
                                                i16 = 761292000;
                                            } else {
                                                iM31613 = (C0773.m3169("۟᩶") ^ i25) * (-103);
                                                i15 = ((iM31613 ^ i24) * 23369) ^ (-1690614238);
                                                i16 = -1498484550;
                                            }
                                            i27 = iM31613 ^ i16;
                                            strM6233 = str2;
                                            s6 = s4;
                                            sArr8 = sArr6;
                                            i26 = i15;
                                            sArr7 = sArr5;
                                            baseResp2 = baseResp;
                                            break;
                                        case 417712534:
                                        case 1858293934:
                                            str4 = baseResp2.errStr;
                                            sArr8 = f80762;
                                            i28 = 8;
                                            i30 = 6;
                                            if (C3690.f12684 > 0) {
                                                iM2763 = (C0619.m2761("ۙ᩹") ^ i25) * (-125);
                                                i22 = ((iM2763 ^ i24) * 23657) ^ 2010334444;
                                                i23 = -1490215788;
                                                i27 = iM2763 ^ i23;
                                                i26 = i22;
                                            } else {
                                                int iM316111 = (i25 - C0773.m3169("ۘ֡")) * (-119);
                                                i26 = ((iM316111 ^ i24) * 23691) ^ (-1042649517);
                                                i27 = iM316111 ^ 1614026436;
                                                this = this;
                                            }
                                            break;
                                        case 763425424:
                                        case 897645471:
                                            C0773.m3161();
                                            iM2763 = (C0773.m3169("ᩴܳ") + i25) * (-71);
                                            i22 = ((iM2763 ^ i24) * 8769) ^ 1149257401;
                                            i23 = 1803227074;
                                            i27 = iM2763 ^ i23;
                                            i26 = i22;
                                            break;
                                    }
                                    return;
                                }
                                short[] sArr10 = sArr7;
                                if (i31 != 0) {
                                    iM2762 = (i24 - C0619.m2761("ۢ᩹")) * 85;
                                    i20 = ((iM2762 ^ i25) * 7763) ^ 1249101136;
                                    i21 = 277238180;
                                } else {
                                    iM2762 = C0619.m2761("᩻ۜ") ^ i24;
                                    i20 = ((iM2762 ^ i25) * (-26459)) ^ 1256585371;
                                    i21 = 384556710;
                                }
                                i27 = iM2762 ^ i21;
                                i26 = i20;
                                sArr7 = sArr10;
                            }
                        }
                    };
                    if (C1321.f4751 >= 0) {
                        iM31611 = (C0619.m2761("ᩳۙ") + i5) * 37;
                        i7 = ((iM31611 ^ i6) * 29755) ^ 1710508577;
                        i4 = 2068321386;
                        i8 = iM31611 ^ i4;
                        abstractActivityC17205 = abstractActivityC17204;
                    } else {
                        int iM31613 = (C0773.m3169("ۢܺ") ^ i5) * (-29);
                        i7 = ((iM31613 ^ i6) * 31291) ^ 206048063;
                        i8 = iM31613 ^ (-1465712523);
                    }
                    break;
                case -132479194:
                case 1631797636:
                    C2310.m7813();
                    if (C1146.f4234 < 0) {
                        iM3169 = (i5 - C0619.m2761("֫֡")) * 17;
                        i = ((iM3169 ^ i6) * (-16597)) ^ (-1421006641);
                        i2 = 1016679541;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩸") + i6) * 43;
                        i = ((iM3169 ^ i5) * 32513) ^ 2097085490;
                        i2 = 1767715282;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -108290203:
                case -56898785:
                    ActivityC11550.m29054(interfaceC1856);
                    value = f25866.getValue();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (i5 - C0619.m2761("֫֡")) * 17;
                        i = ((iM3169 ^ i6) * (-16597)) ^ (-1421006641);
                        i2 = 1016679541;
                    } else {
                        iM3169 = C0619.m2761("᩹ۤ") ^ i6;
                        i = ((iM3169 ^ i5) * (-6899)) ^ 821521455;
                        i2 = 666153870;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -93814201:
                case 843423042:
                    C17202.m40379(abstractActivityC17205, C2702.m8881(sArr2, i12, i14, i11));
                    if (C1564.f5401 > 0) {
                        iM3169 = C0619.m2761("۬ܶ") ^ i6;
                        i = ((iM3169 ^ i5) * (-31809)) ^ 77886076;
                        i2 = 1973528445;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        iM31611 = (C0619.m2761("ᩳۙ") + i5) * 37;
                        i7 = ((iM31611 ^ i6) * 29755) ^ 1710508577;
                        i4 = 2068321386;
                        i8 = iM31611 ^ i4;
                        abstractActivityC17205 = abstractActivityC17204;
                    }
                    break;
                case -31710519:
                case 1841520162:
                    C2354.m7983();
                    if (!RunnableC1848.f6235) {
                        iM3169 = (i5 - C0619.m2761("֫֡")) * 17;
                        i = ((iM3169 ^ i6) * (-16597)) ^ (-1421006641);
                        i2 = 1016679541;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        s = s3;
                        iM31610 = C0773.m3169("ۘᩴ") ^ i6;
                        i7 = ((iM31610 ^ i5) * (-13283)) ^ 203583975;
                        i3 = -1529981568;
                        i8 = iM31610 ^ i3;
                        abstractActivityC17205 = abstractActivityC17204;
                        s3 = s;
                    }
                    break;
                case 51656464:
                case 1378306135:
                    strM5471 = C1542.m5471(f25864, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 13, i11);
                    if (C20932.m47848() == 0) {
                        iM3169 = C0773.m3169("ܳ᩻") ^ i6;
                        i = ((iM3169 ^ i5) * (-31305)) ^ 90891634;
                        i2 = 922072849;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        s = s3;
                        iM31610 = C0773.m3169("ۘᩴ") ^ i6;
                        i7 = ((iM31610 ^ i5) * (-13283)) ^ 203583975;
                        i3 = -1529981568;
                        i8 = iM31610 ^ i3;
                        abstractActivityC17205 = abstractActivityC17204;
                        s3 = s;
                    }
                    break;
                case 316725165:
                case 981022304:
                    sArr3 = f25864;
                    i9 = 91;
                    i10 = 15;
                    if (C4238.m13540() > 0) {
                        iM3169 = (C0773.m3169("ۖۤ") ^ i6) * (-25);
                        i = ((iM3169 ^ i5) * 19073) ^ 1268968368;
                        i2 = -1173850690;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        iM31611 = (C0619.m2761("ᩳۙ") + i5) * 37;
                        i7 = ((iM31611 ^ i6) * 29755) ^ 1710508577;
                        i4 = 2068321386;
                        i8 = iM31611 ^ i4;
                        abstractActivityC17205 = abstractActivityC17204;
                    }
                    break;
                case 636614139:
                case 2121024457:
                    s = s3;
                    sArr = f25864;
                    c = 'C';
                    if (C0862.f3233 != 0) {
                        iM31610 = C0773.m3169("ۘᩴ") ^ i6;
                        i7 = ((iM31610 ^ i5) * (-13283)) ^ 203583975;
                        i3 = -1529981568;
                    } else {
                        iM31610 = (i5 - C0773.m3169("᩸ۜ")) * (-43);
                        i7 = ((iM31610 ^ i6) * (-9023)) ^ 369538941;
                        i3 = -583269738;
                    }
                    i8 = iM31610 ^ i3;
                    abstractActivityC17205 = abstractActivityC17204;
                    s3 = s;
                    break;
                case 1122453051:
                case 1910286239:
                    s = s3;
                    int i15 = s + 18804;
                    if ((s3 * s2) - (i15 * i15) > 0) {
                        iM31610 = (C0619.m2761("ۜۙ") ^ i5) * 109;
                        i7 = ((iM31610 ^ i6) * (-24707)) ^ 1847796235;
                        i3 = -1474130450;
                    } else {
                        iM31610 = (C0619.m2761("ܶܰ") + i6) * (-105);
                        i7 = ((iM31610 ^ i5) * 1143) ^ (-790608727);
                        i3 = 927142112;
                    }
                    i8 = iM31610 ^ i3;
                    abstractActivityC17205 = abstractActivityC17204;
                    s3 = s;
                    break;
                case 1359136162:
                case 1819449257:
                    req = new SendAuth.Req();
                    sArr4 = f25864;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i5 - C0619.m2761("֫֡")) * 17;
                        i = ((iM3169 ^ i6) * (-16597)) ^ (-1421006641);
                        i2 = 1016679541;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ܳۤ")) * (-79);
                        i = ((iM3169 ^ i6) * (-21303)) ^ 431533049;
                        i2 = 1258025379;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                default:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i5 - C0619.m2761("ܶ֨")) * 47;
                        i = ((iM3169 ^ i6) * (-28547)) ^ 1789443662;
                        i2 = -1571743106;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        s = s3;
                        iM31610 = C0773.m3169("ۘᩴ") ^ i6;
                        i7 = ((iM31610 ^ i5) * (-13283)) ^ 203583975;
                        i3 = -1529981568;
                        i8 = iM31610 ^ i3;
                        abstractActivityC17205 = abstractActivityC17204;
                        s3 = s;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01c9 A[PHI: r1 r13 r14 r22
      0x01c9: PHI (r1v4 com.tencent.mm.opensdk.modelmsg.SendAuth$Req) = 
      (r1v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r1v3 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r1v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
     binds: [B:14:0x0094, B:47:0x01c7, B:43:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:14:0x0094, B:47:0x01c7, B:43:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:14:0x0094, B:47:0x01c7, B:43:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r22v11 l.֨֡᩵) = (r22v3 l.֨֡᩵), (r22v10 l.֨֡᩵), (r22v12 l.֨֡᩵) binds: [B:14:0x0094, B:47:0x01c7, B:43:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21183(final C14480 c14480, final ViewOnClickListenerC1057 viewOnClickListenerC1057) {
        int iM2761;
        int i;
        int i2;
        SendAuth.Req req;
        int iM2762;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM3169;
        int i7 = C1146.f4234;
        int i8 = C2834.f9334;
        int iM31610 = (i8 - C0773.m3169("ۗۢ")) * 51;
        int i9 = ((iM31610 ^ i7) * 3857) ^ 1245034397;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = iM31610 ^ 655154462;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        int i18 = 402043811;
        int i19 = 0;
        String strM6366 = null;
        Object value = null;
        InterfaceC0812 interfaceC0812 = null;
        SendAuth.Req req2 = null;
        while (true) {
            i18 = i10 ^ (i9 & (((i18 ^ i7) * (-4361)) >> 31));
            switch (i18) {
                case -2076025121:
                case -527196699:
                    C0269.m1775();
                    if (C4282.f15546 <= 0) {
                        req = req2;
                        interfaceC0812 = interfaceC0812;
                        iM3169 = (i7 - C0773.m3169("۫ܰ")) * (-27);
                        i6 = ((iM3169 ^ i8) * (-273)) ^ 2119657333;
                        i5 = -1692211185;
                        int i20 = iM3169 ^ i5;
                        interfaceC0812 = interfaceC0812;
                        i10 = i20;
                        i9 = i6;
                        req2 = req;
                    } else {
                        interfaceC0812 = interfaceC0812;
                        iM2761 = C0773.m3169("᩵ܺ") ^ i8;
                        i = ((iM2761 ^ i7) * 8801) ^ 640401084;
                        i2 = 1971303101;
                        InterfaceC0812 interfaceC0813 = interfaceC0812;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                        interfaceC0812 = interfaceC0813;
                    }
                    break;
                case -2049381432:
                case 114107134:
                    interfaceC0812 = interfaceC0812;
                    req2.scope = C0269.m1785(sArr2, i17, 15, i16);
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i8;
                        i = ((iM2761 ^ i7) * 8801) ^ 640401084;
                        i2 = 1971303101;
                    } else {
                        iM2761 = C0619.m2761("֨ۡ") ^ i7;
                        i = ((iM2761 ^ i8) * (-105)) ^ (-952413803);
                        i2 = -796872848;
                    }
                    InterfaceC0812 interfaceC0814 = interfaceC0812;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    interfaceC0812 = interfaceC0814;
                    break;
                case -2008751645:
                case 976567304:
                    C3492.m11488();
                    int iM31611 = C0773.m3169("ۡ֫") ^ i8;
                    req = req2;
                    i6 = ((iM31611 ^ i7) * 13259) ^ 1646257860;
                    i10 = iM31611 ^ 1467472414;
                    i9 = i6;
                    req2 = req;
                    break;
                case -1983650748:
                case -127361474:
                    C4238.m13540();
                    if (C0862.f3233 != 0) {
                        interfaceC0812 = interfaceC0812;
                        iM2761 = C0773.m3169("᩵ܺ") ^ i8;
                        i = ((iM2761 ^ i7) * 8801) ^ 640401084;
                        i2 = 1971303101;
                        InterfaceC0812 interfaceC0815 = interfaceC0812;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                        interfaceC0812 = interfaceC0815;
                    } else {
                        int iM31612 = C0773.m3169("ۡ֫") ^ i8;
                        req = req2;
                        i6 = ((iM31612 ^ i7) * 13259) ^ 1646257860;
                        i10 = iM31612 ^ 1467472414;
                        i9 = i6;
                        req2 = req;
                    }
                    break;
                case -1969791044:
                case -782218130:
                    interfaceC0812 = interfaceC0812;
                    short s2 = sArr[c];
                    int i21 = s2 + 12294;
                    if (C2834.m9344() >= 0) {
                        s = s2;
                        i19 = i21;
                        interfaceC0812 = interfaceC0812;
                        int iM31613 = C0773.m3169("ۡ֫") ^ i8;
                        req = req2;
                        i6 = ((iM31613 ^ i7) * 13259) ^ 1646257860;
                        i10 = iM31613 ^ 1467472414;
                        i9 = i6;
                    } else {
                        req = req2;
                        int iM2763 = C0619.m2761("᩶ۖ") ^ i7;
                        s = s2;
                        i9 = ((iM2763 ^ i8) * (-12629)) ^ (-804976531);
                        i19 = i21;
                        interfaceC0812 = interfaceC0812;
                        i10 = iM2763 ^ (-1473199668);
                    }
                    req2 = req;
                    break;
                case -1893434232:
                case 406762788:
                    C0619.m2763();
                    C2878.m9491();
                    break;
                case -1870470875:
                case 407545070:
                    interfaceC0812 = interfaceC0812;
                    i13 = i19 * i19;
                    i14 = s * s;
                    i15 = 151142436;
                    if (C0950.f3488 < 0) {
                        iM2761 = C0619.m2761("ۨ᩵") ^ i7;
                        i = ((iM2761 ^ i8) * 31051) ^ (-91416074);
                        i2 = -1882304412;
                        InterfaceC0812 interfaceC0816 = interfaceC0812;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                        interfaceC0812 = interfaceC0816;
                    } else {
                        req = req2;
                        iM3169 = (i7 - C0773.m3169("۫ܰ")) * (-27);
                        i6 = ((iM3169 ^ i8) * (-273)) ^ 2119657333;
                        i5 = -1692211185;
                        int i22 = iM3169 ^ i5;
                        interfaceC0812 = interfaceC0812;
                        i10 = i22;
                        i9 = i6;
                        req2 = req;
                    }
                    break;
                case -1856577031:
                case 1013237692:
                    req2.state = C2485.m8350(sArr3, i11, i12, i16);
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("ۧܺ") ^ i7;
                        interfaceC0812 = interfaceC0812;
                        i = ((iM2761 ^ i8) * (-7467)) ^ 192060358;
                        i2 = -2078921090;
                    } else {
                        interfaceC0812 = interfaceC0812;
                        iM2761 = (i7 - C0773.m3169("ܽۖ")) * (-103);
                        i = ((iM2761 ^ i8) * 17511) ^ 1736077249;
                        i2 = -121742390;
                    }
                    InterfaceC0812 interfaceC0817 = interfaceC0812;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    interfaceC0812 = interfaceC0817;
                    break;
                case -1817018948:
                case 879734095:
                    AbstractC0641.m2813();
                    if (C3492.f12043 > 0) {
                        iM2762 = (C0773.m3169("۟ۡ") + i8) * (-67);
                        i3 = ((iM2762 ^ i7) * (-8949)) ^ (-1453551806);
                        i4 = -538426481;
                        i10 = iM2762 ^ i4;
                        i9 = i3;
                    } else {
                        int iM31614 = C0773.m3169("ۡ֫") ^ i8;
                        req = req2;
                        i6 = ((iM31614 ^ i7) * 13259) ^ 1646257860;
                        i10 = iM31614 ^ 1467472414;
                        i9 = i6;
                        req2 = req;
                    }
                    break;
                case -1625036948:
                case 534876454:
                    i16 = 21981;
                    iM2761 = (C0619.m2761("ܶܶ") + i7) * 75;
                    i = ((iM2761 ^ i8) * (-21149)) ^ 1754102906;
                    i2 = -60157170;
                    InterfaceC0812 interfaceC0818 = interfaceC0812;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    interfaceC0812 = interfaceC0818;
                    break;
                case -946738171:
                case -764346410:
                    C0269.m1781(value, strM6366);
                    ((IWXAPI) value).sendReq(req2);
                    break;
                case -464067107:
                case 121007851:
                    ActivityC11550.m29054(new InterfaceC1856() { // from class: l.ܺۡ᩻

                        /* JADX INFO: renamed from: ۬ܶ᩵, reason: not valid java name and contains not printable characters */
                        private static final short[] f54043 = {3537, -28361, -28384, -28362, -28363, -28384, -28361, -28361, -28394, -28367, -28361};

                        {
                            int i23 = -698531250;
                            int i24 = AbstractC3624.f12429;
                            int i25 = C3779.f12953;
                            int iM2764 = C0619.m2761("۟֫") ^ i24;
                            int i26 = ((iM2764 ^ i25) * (-10719)) ^ (-303348632);
                            int i27 = -742469262;
                            while (true) {
                                i23 = ((((i23 ^ i25) * (-25851)) >> 31) & i26) ^ (iM2764 ^ i27);
                                switch (i23) {
                                    case -1932505283:
                                    case 441041433:
                                        if (C3998.f13671 != 0) {
                                            iM2764 = C0773.m3169("᩶ۚ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * (-4739)) ^ (-1573900869);
                                            i27 = -1166052546;
                                        } else {
                                            iM2764 = (C0773.m3169("ܿܽ") ^ i24) * (-37);
                                            i26 = ((iM2764 ^ i25) * (-11865)) ^ (-1236707743);
                                            i27 = -1551641240;
                                        }
                                        break;
                                    case -1819041894:
                                    case 2100438724:
                                        if (C2878.f9462) {
                                            iM2764 = C0773.m3169("᩶ۚ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * (-4739)) ^ (-1573900869);
                                            i27 = -1166052546;
                                        } else {
                                            iM2764 = C0619.m2761("֫ۗ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * 6279) ^ 1609067818;
                                            i27 = 466232027;
                                        }
                                        break;
                                    case -1813769940:
                                    case 2106800879:
                                        AbstractC3624.m11755();
                                        iM2764 = (i24 - C0619.m2761("ᩳۙ")) * 13;
                                        i26 = ((iM2764 ^ i25) * 10563) ^ 920129968;
                                        i27 = 790741649;
                                        break;
                                    case -1739382764:
                                    case 372635180:
                                        if (C3779.m12264()) {
                                            iM2764 = (C0773.m3169("֡ۧ") + i25) * 85;
                                            i26 = ((iM2764 ^ i24) * (-6637)) ^ 693222989;
                                            i27 = -805893861;
                                        } else {
                                            iM2764 = (C0773.m3169("ۡۧ") ^ i25) * 41;
                                            i26 = ((iM2764 ^ i24) * 24503) ^ (-2063496644);
                                            i27 = -604584747;
                                        }
                                        break;
                                    case -1690323109:
                                    case 844287329:
                                        if (C4282.m13644()) {
                                            iM2764 = C0619.m2761("۫᩶") ^ i24;
                                            i26 = ((iM2764 ^ i25) * 17335) ^ (-387872374);
                                            i27 = 1024461709;
                                        } else {
                                            iM2764 = C0773.m3169("᩶ۚ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * (-4739)) ^ (-1573900869);
                                            i27 = -1166052546;
                                        }
                                        break;
                                    case -1524476812:
                                    case 593973107:
                                        if (C2702.f8586 <= 0) {
                                            iM2764 = C0619.m2761("ܿ֫") ^ i24;
                                            i26 = ((iM2764 ^ i25) * 26697) ^ 203569388;
                                            i27 = 538581675;
                                        } else {
                                            iM2764 = (C0619.m2761("᩶ۢ") ^ i25) * (-117);
                                            i26 = ((iM2764 ^ i24) * (-1861)) ^ 1748167786;
                                            i27 = -838482111;
                                        }
                                        break;
                                    case -1338308111:
                                    case 1811404589:
                                        if (RunnableC0334.f1808 > 0) {
                                            iM2764 = (C0773.m3169("ۡۧ") ^ i25) * 41;
                                            i26 = ((iM2764 ^ i24) * 24503) ^ (-2063496644);
                                            i27 = -604584747;
                                        } else {
                                            iM2764 = (i24 - C0619.m2761("ᩳۙ")) * 13;
                                            i26 = ((iM2764 ^ i25) * 10563) ^ 920129968;
                                            i27 = 790741649;
                                        }
                                        break;
                                    case -1232718616:
                                    case 2543831:
                                        if (C1564.m5509() <= 0) {
                                            iM2764 = C0773.m3169("᩶ۚ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * (-4739)) ^ (-1573900869);
                                            i27 = -1166052546;
                                        } else {
                                            iM2764 = (C0773.m3169("۠ۡ") + i24) * 63;
                                            i26 = ((iM2764 ^ i25) * (-6605)) ^ 854854747;
                                            i27 = 1742526614;
                                        }
                                        break;
                                    case -1123001769:
                                    case 1996345516:
                                        if (C11235.m28309() != 0) {
                                            iM2764 = (C0773.m3169("ۡۧ") ^ i25) * 41;
                                            i26 = ((iM2764 ^ i24) * 24503) ^ (-2063496644);
                                            i27 = -604584747;
                                        } else {
                                            iM2764 = (C0619.m2761("ܿ۬") + i25) * 69;
                                            i26 = ((iM2764 ^ i24) * 27723) ^ 764905491;
                                            i27 = 738702998;
                                        }
                                        break;
                                    case -934333853:
                                    case 2124955617:
                                        if (C20932.m47848() != 0) {
                                            iM2764 = C0773.m3169("᩶ۚ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * (-4739)) ^ (-1573900869);
                                            i27 = -1166052546;
                                        } else {
                                            iM2764 = (C0773.m3169("֡ۙ") ^ i25) * (-37);
                                            i26 = ((iM2764 ^ i24) * (-6597)) ^ 1868582141;
                                            i27 = -2101855693;
                                        }
                                        break;
                                    case -601369952:
                                    case -142712103:
                                        C4282.m13644();
                                        if (!C0619.f2439) {
                                            iM2764 = C0773.m3169("᩶ۚ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * (-4739)) ^ (-1573900869);
                                            i27 = -1166052546;
                                        } else {
                                            iM2764 = C0619.m2761("ܿ֫") ^ i24;
                                            i26 = ((iM2764 ^ i25) * 26697) ^ 203569388;
                                            i27 = 538581675;
                                        }
                                        break;
                                    case -582299678:
                                    case 353153267:
                                        return;
                                    case -355364717:
                                    case -171901019:
                                        C3492.m11488();
                                        C1542.m5459();
                                        throw new RuntimeException();
                                    case 905571679:
                                    case 1234613481:
                                        if (C0862.f3233 != 0) {
                                            iM2764 = (C0619.m2761("ۜۢ") ^ i25) * 79;
                                            i26 = ((iM2764 ^ i24) * 27711) ^ (-126947681);
                                            i27 = 171411184;
                                        } else {
                                            iM2764 = C0773.m3169("ۚ᩶") ^ i24;
                                            i26 = ((iM2764 ^ i25) * 13967) ^ 115772145;
                                            i27 = -1767437580;
                                        }
                                        break;
                                    case 1412068900:
                                    case 2120085033:
                                        if (C2375.f7641 <= 0) {
                                            iM2764 = C0773.m3169("᩶ۚ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * (-4739)) ^ (-1573900869);
                                            i27 = -1166052546;
                                        } else {
                                            iM2764 = (i24 - C0773.m3169("۟ܽ")) * 73;
                                            i26 = ((iM2764 ^ i25) * (-1239)) ^ (-956574028);
                                            i27 = 904999286;
                                        }
                                        break;
                                    default:
                                        if (C4238.f15451 >= 0) {
                                            iM2764 = C0773.m3169("᩶ۚ") ^ i25;
                                            i26 = ((iM2764 ^ i24) * (-4739)) ^ (-1573900869);
                                            i27 = -1166052546;
                                        } else {
                                            iM2764 = (i24 - C0619.m2761("ᩳۙ")) * 13;
                                            i26 = ((iM2764 ^ i25) * 10563) ^ 920129968;
                                            i27 = 790741649;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:72:0x02a5 A[PHI: r2 r3 r8 r9 r16 r22 r23 r27
                          0x02a5: PHI (r2v43 short[]) = (r2v18 short[]), (r2v24 short[]), (r2v45 short[]) binds: [B:71:0x02a3, B:56:0x01ec, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]
                          0x02a5: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:71:0x02a3, B:56:0x01ec, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]
                          0x02a5: PHI (r8v6 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v7 java.lang.String) binds: [B:71:0x02a3, B:56:0x01ec, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]
                          0x02a5: PHI (r9v25 int) = (r9v8 int), (r9v13 int), (r9v27 int) binds: [B:71:0x02a3, B:56:0x01ec, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]
                          0x02a5: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:71:0x02a3, B:56:0x01ec, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]
                          0x02a5: PHI (r22v4 int) = (r22v3 int), (r22v2 int), (r22v2 int) binds: [B:71:0x02a3, B:56:0x01ec, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]
                          0x02a5: PHI (r23v4 int) = (r23v3 int), (r23v2 int), (r23v2 int) binds: [B:71:0x02a3, B:56:0x01ec, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]
                          0x02a5: PHI (r27v24 java.lang.String) = (r27v11 java.lang.String), (r27v15 java.lang.String), (r27v25 java.lang.String) binds: [B:71:0x02a3, B:56:0x01ec, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
                        
                            if (l.C4238.f15451 < 0) goto L17;
                         */
                        @Override // l.InterfaceC1856
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onResp(com.tencent.mm.opensdk.modelbase.BaseResp r33) {
                            /*
                                Method dump skipped, instruction units count: 1098
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.C16740.onResp(com.tencent.mm.opensdk.modelbase.BaseResp):void");
                        }
                    });
                    InterfaceC0812 interfaceC0819 = f25866;
                    if (C4238.f15451 >= 0) {
                        interfaceC0812 = interfaceC0819;
                        int iM31615 = C0773.m3169("ۡ֫") ^ i8;
                        req = req2;
                        i6 = ((iM31615 ^ i7) * 13259) ^ 1646257860;
                        i10 = iM31615 ^ 1467472414;
                        i9 = i6;
                        req2 = req;
                    } else {
                        int iM2764 = (C0619.m2761("ᩳۧ") + i8) * (-19);
                        i9 = ((iM2764 ^ i7) * 15693) ^ (-263881011);
                        i10 = iM2764 ^ 1571106786;
                        interfaceC0812 = interfaceC0819;
                    }
                    break;
                case -326154623:
                case 1266787185:
                    req = req2;
                    interfaceC0812 = interfaceC0812;
                    sArr = f25864;
                    c = 14;
                    if (C0619.m2763()) {
                        iM3169 = (i7 - C0773.m3169("۫ܰ")) * (-27);
                        i6 = ((iM3169 ^ i8) * (-273)) ^ 2119657333;
                        i5 = -1692211185;
                    } else {
                        iM3169 = (C0773.m3169("ۚۛ") ^ i8) * 67;
                        i6 = ((iM3169 ^ i7) * (-14097)) ^ (-109284307);
                        i5 = 290956189;
                    }
                    int i23 = iM3169 ^ i5;
                    interfaceC0812 = interfaceC0812;
                    i10 = i23;
                    i9 = i6;
                    req2 = req;
                    break;
                case -304962139:
                case 1089408054:
                    value = interfaceC0812.getValue();
                    sArr4 = f25864;
                    if (C1343.f4799 == 0) {
                        iM2762 = (C0619.m2761("᩻ۡ") + i7) * (-11);
                        i3 = ((iM2762 ^ i8) * 12667) ^ (-793874206);
                        i4 = 1391734627;
                        i10 = iM2762 ^ i4;
                        i9 = i3;
                    } else {
                        iM2761 = C0773.m3169("ۧܺ") ^ i7;
                        interfaceC0812 = interfaceC0812;
                        i = ((iM2761 ^ i8) * (-7467)) ^ 192060358;
                        i2 = -2078921090;
                        InterfaceC0812 interfaceC08110 = interfaceC0812;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                        interfaceC0812 = interfaceC08110;
                    }
                    break;
                case 944851723:
                case 1679016065:
                    strM6366 = RunnableC1848.m6366(sArr4, 45, 13, i16);
                    if (!C13473.m33144()) {
                        iM2761 = C0773.m3169("ۧܺ") ^ i7;
                        interfaceC0812 = interfaceC0812;
                        i = ((iM2761 ^ i8) * (-7467)) ^ 192060358;
                        i2 = -2078921090;
                        InterfaceC0812 interfaceC08111 = interfaceC0812;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                        interfaceC0812 = interfaceC08111;
                    } else {
                        iM2762 = C0773.m3169("ۖۢ") ^ i7;
                        i3 = ((iM2762 ^ i8) * 1899) ^ (-274904487);
                        i4 = 2011719883;
                        i10 = iM2762 ^ i4;
                        i9 = i3;
                    }
                    break;
                case 1069022955:
                case 1161628872:
                    interfaceC0812 = interfaceC0812;
                    int i24 = i14 + i15;
                    if ((i24 + i24) - i13 >= 0) {
                        iM2761 = (C0773.m3169("ۙܿ") ^ i8) * 123;
                        i = ((iM2761 ^ i7) * 16583) ^ 297727829;
                        i2 = 1877100698;
                    } else {
                        iM2761 = C0619.m2761("ۢܶ") ^ i8;
                        i = ((iM2761 ^ i7) * 647) ^ 1914292128;
                        i2 = 1353250914;
                    }
                    InterfaceC0812 interfaceC08112 = interfaceC0812;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    interfaceC0812 = interfaceC08112;
                    break;
                case 1337472984:
                case 1729194224:
                    interfaceC0812 = interfaceC0812;
                    req2 = new SendAuth.Req();
                    sArr2 = f25864;
                    i17 = 15;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i8;
                        i = ((iM2761 ^ i7) * 8801) ^ 640401084;
                        i2 = 1971303101;
                    } else {
                        iM2761 = C0619.m2761("֡᩵") ^ i8;
                        i = ((iM2761 ^ i7) * (-6779)) ^ 56134024;
                        i2 = -896428308;
                    }
                    InterfaceC0812 interfaceC08113 = interfaceC0812;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    interfaceC0812 = interfaceC08113;
                    break;
                case 1940338093:
                case 2007649224:
                    i16 = 59017;
                    iM2761 = (C0619.m2761("ܶܶ") + i7) * 75;
                    i = ((iM2761 ^ i8) * (-21149)) ^ 1754102906;
                    i2 = -60157170;
                    InterfaceC0812 interfaceC08114 = interfaceC0812;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    interfaceC0812 = interfaceC08114;
                    break;
                default:
                    interfaceC0812 = interfaceC0812;
                    sArr3 = f25864;
                    i11 = 30;
                    i12 = 15;
                    if (C1783.f6087 > 0) {
                        iM2761 = C0619.m2761("ۚᩳ") ^ i8;
                        i = ((iM2761 ^ i7) * (-557)) ^ 1773609300;
                        i2 = 1932369077;
                        InterfaceC0812 interfaceC08115 = interfaceC0812;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                        interfaceC0812 = interfaceC08115;
                    } else {
                        interfaceC0812 = interfaceC0812;
                        int iM31616 = C0773.m3169("ۡ֫") ^ i8;
                        req = req2;
                        i6 = ((iM31616 ^ i7) * 13259) ^ 1646257860;
                        i10 = iM31616 ^ 1467472414;
                        i9 = i6;
                        req2 = req;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21182(C4040 c4040, ViewOnClickListenerC1057 viewOnClickListenerC1057) {
        C21216 c21216 = null;
        int i = -145506330;
        int i2 = C2287.f7432;
        int i3 = RunnableC3055.f9898;
        int iM3169 = (C0773.m3169("ۡ᩻") + i3) * (-71);
        int i4 = ((iM3169 ^ i2) * 9675) ^ (-1596238824);
        int i5 = 1625929629;
        while (true) {
            i = ((((i ^ i2) * 8819) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2138042773:
                case -859569203:
                    C2419.m8174();
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("֨᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13203)) ^ 1772383406;
                        i5 = -2093358509;
                    } else {
                        iM3169 = (C0773.m3169("ۤ۬") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 27405) ^ 230953622;
                        i5 = 1351890541;
                    }
                    break;
                case -2058001666:
                case -1342417288:
                    if (C20932.m47848() != 0) {
                        iM3169 = (i2 - C0773.m3169("᩹ۖ")) * 43;
                        i4 = ((iM3169 ^ i3) * 19299) ^ (-1779357493);
                        i5 = 1839777883;
                    } else {
                        iM3169 = (C0619.m2761("ۜۚ") ^ i2) * (-111);
                        i4 = ((iM3169 ^ i3) * 6747) ^ (-1298007812);
                        i5 = 120404043;
                    }
                    break;
                case -1857837331:
                case 690174295:
                    C3492.m11488();
                    C0773.m3161();
                    break;
                case -1558979285:
                case 990618408:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i2 - C0619.m2761("᩷ۜ")) * (-53);
                        i4 = ((iM3169 ^ i3) * (-15539)) ^ 718942322;
                        i5 = 1390720059;
                    } else {
                        iM3169 = (C0773.m3169("֨ۢ") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * 24551) ^ (-288187361);
                        i5 = 1754229518;
                    }
                    break;
                case -1449517206:
                case -565032377:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩹ۖ")) * 43;
                        i4 = ((iM3169 ^ i3) * 19299) ^ (-1779357493);
                        i5 = 1839777883;
                    } else {
                        iM3169 = C0619.m2761("᩵ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27619) ^ 2053542143;
                        i5 = -312384108;
                    }
                    break;
                case -1347923146:
                case -613473631:
                    C1542.m5459();
                    C3492.m11488();
                    iM3169 = (i2 - C0619.m2761("᩷ۜ")) * (-53);
                    i4 = ((iM3169 ^ i3) * (-15539)) ^ 718942322;
                    i5 = 1390720059;
                    break;
                case -1056423148:
                case -289126945:
                    C1564.m5509();
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ܺ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26867) ^ 289649424;
                        i5 = 8874525;
                    } else {
                        iM3169 = (C0773.m3169("ۤ۬") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 27405) ^ 230953622;
                        i5 = 1351890541;
                    }
                    break;
                case -890795020:
                case 1764088858:
                    C3998.m12920();
                    if (!C3077.f9998) {
                        iM3169 = (C0773.m3169("ۤ۬") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 27405) ^ 230953622;
                        i5 = 1351890541;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩷ۜ")) * (-53);
                        i4 = ((iM3169 ^ i3) * (-15539)) ^ 718942322;
                        i5 = 1390720059;
                    }
                    break;
                case -869629306:
                case 124711941:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("ܺ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26867) ^ 289649424;
                        i5 = 8874525;
                    } else {
                        iM3169 = C0773.m3169("ܶۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-12905)) ^ 288409515;
                        i5 = -226386375;
                    }
                    break;
                case -837957918:
                case 1065435879:
                    m21181().m26038();
                    iM3169 = C0619.m2761("ۖ֨") ^ i3;
                    i4 = ((iM3169 ^ i2) * 24963) ^ (-2033529694);
                    i5 = 14056310;
                    break;
                case -767575148:
                case 1394971872:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("֨᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13203)) ^ 1772383406;
                        i5 = -2093358509;
                    } else {
                        iM3169 = C0619.m2761("֡᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26503) ^ 33650882;
                        i5 = 1225777749;
                    }
                    break;
                case -575256801:
                case -355838624:
                    c21216 = new C21216(c4040, viewOnClickListenerC1057);
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ܺ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26867) ^ 289649424;
                        i5 = 8874525;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۢۨ")) * 81;
                        i4 = ((iM3169 ^ i3) * 28459) ^ (-1595621598);
                        i5 = 1915737902;
                    }
                    break;
                case -435634861:
                case -288449291:
                    m21181().m26036(viewOnClickListenerC1057, c21216);
                    break;
                case -182675043:
                case 1571476354:
                    viewOnClickListenerC1057.m40408(c21216);
                    if (C0773.f2792 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩹ۖ")) * 43;
                        i4 = ((iM3169 ^ i3) * 19299) ^ (-1779357493);
                        i5 = 1839777883;
                    } else {
                        iM3169 = (C0773.m3169("᩻۫") + i2) * (-63);
                        i4 = ((iM3169 ^ i3) * 14607) ^ 1976369941;
                        i5 = -1620255030;
                    }
                    break;
                case 412979148:
                case 915403203:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۤ۬") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 27405) ^ 230953622;
                        i5 = 1351890541;
                    } else {
                        iM3169 = C0619.m2761("ܽۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31671) ^ 739571820;
                        i5 = 877550217;
                    }
                    break;
                case 1718817121:
                case 1925568812:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i2 - C0619.m2761("᩷ۜ")) * (-53);
                        i4 = ((iM3169 ^ i3) * (-15539)) ^ 718942322;
                        i5 = 1390720059;
                    } else {
                        iM3169 = C0773.m3169("ۜ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14361)) ^ (-557594629);
                        i5 = 1279117002;
                    }
                    break;
                case 1760777983:
                case 1836433560:
                    if (m21181().m26037()) {
                        iM3169 = (C0773.m3169("ۚܺ") + i3) * 69;
                        i4 = ((iM3169 ^ i2) * (-4617)) ^ (-2129130146);
                        i5 = -737923498;
                    } else {
                        iM3169 = C0619.m2761("ۖ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24963) ^ (-2033529694);
                        i5 = 14056310;
                    }
                    break;
                default:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (i2 - C0773.m3169("᩹ۖ")) * 43;
                        i4 = ((iM3169 ^ i3) * 19299) ^ (-1779357493);
                        i5 = 1839777883;
                    } else {
                        iM3169 = C0773.m3169("ᩳۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11129)) ^ (-49713141);
                        i5 = -751751123;
                    }
                    break;
            }
            return;
        }
    }
}
