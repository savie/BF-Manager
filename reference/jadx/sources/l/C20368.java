package l;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩶᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I141 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20368 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static int f65961 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int f65962 = 0;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static int f65963 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int f65964 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int f65965 = 0;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static int f65966 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean f65967 = false;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static ColorStateList f65968 = null;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static int f65969 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f65970 = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static boolean f65971 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int f65972 = 0;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static int f65973 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static int f65974 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int f65975 = 0;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList f65976 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static int f65977 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static int f65978 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int f65979 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int f65980 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f65981 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f65982 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f65983 = 0;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static RunnableC19062 f65984 = null;

    /* JADX INFO: renamed from: ۨ᩺ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f65985 = {1719, 20876, 20888, 20889, 20866, 20914, 20894, 20890, 20868, 20889, 20878, 20869, 20914, 20889, 20869, 20872, 20864, 20872, 20914, 20890, 20868, 20889, 20869, 20914, 20894, 20884, 20894, 20889, 20872, 20864, 20889, 20869, 20872, 20864, 20872, 20914, 20873, 20876, 20895, 20870, 4533, -3254, -3234, -3233, -3260, -3212, -3240, -3236, -3262, -3233, -3256, -3261, -3212, -3233, -3261, -3250, -3258, -3250, -3212, -3236, -3262, -3233, -3261, -3212, -3240, -3246, -3240, -3233, -3250, -3258, -3233, -3261, -3250, -3258, -3250, -3212, -3249, -3254, -3239, -3264, 1018, -22351, -22363, -22364, -22337, -22385, -22365, -22361, -22343, -22364, -22349, -22344, -22385, -22364, -22344, -22347, -22339, -22347, -22385, -22361, -22343, -22364, -22344, -22385, -22365, -22359, -22365, -22364, -22347, -22339, -22364, -22344, -22347, -22339, -22347, -22385, -22348, -22351, -22366, -22341};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f65986 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static ColorStateList f65987 = null;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static int f65988 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int f65989 = 0;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static boolean f65990 = true;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f65991;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static int f65992;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static int f65993;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int f65994;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f65995;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f65996;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f65997;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static int f65998;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int f65999;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static int f66000;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static int f66001;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f66002;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int f66003;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f66004;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static int f66005;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f66006;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static int f66007;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int f66008;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList f66009;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f66010;

    static {
        int i = 0;
        ColorStateList colorStateListValueOf = null;
        int i2 = 901135367;
        int i3 = C2124.f7782;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11306 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-157)) ^ (-371215261);
        int i6 = 757500675;
        while (true) {
            i2 = ((((i2 ^ i3) * 14535) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1932294746:
                case -216181588:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩵")) * (-115);
                        i5 = ((iM11306 ^ i4) * 28845) ^ (-1412784931);
                        i6 = -1400426459;
                    } else {
                        iM11306 = C19806.m45029("۠۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9821) ^ 604378461;
                        i6 = 627111650;
                    }
                    break;
                case -1888127833:
                case 154093769:
                    if (C3577.m10565()) {
                        iM11306 = (C19806.m45029("ܳᩳ") ^ i3) * (-33);
                        i5 = ((iM11306 ^ i4) * 25249) ^ 1148892939;
                        i6 = 1686544474;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩵")) * (-115);
                        i5 = ((iM11306 ^ i4) * 28845) ^ (-1412784931);
                        i6 = -1400426459;
                    }
                    break;
                case -1443550784:
                case -1051204887:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("᩻۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7615) ^ (-1723058686);
                        i6 = -1171063579;
                    } else {
                        iM11306 = C19806.m45029("ۡۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-17141)) ^ (-1983852789);
                        i6 = -1756447047;
                    }
                    break;
                case -1356343257:
                case -906132936:
                    C1977.m6356();
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("᩻۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7615) ^ (-1723058686);
                        i6 = -1171063579;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۗ") ^ i3) * 61;
                        i5 = ((iM11306 ^ i4) * (-14935)) ^ 1070228586;
                        i6 = 1938926008;
                    }
                    break;
                case -844480194:
                case 1313577604:
                    C1937.m6279();
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("᩶ۗ") ^ i3) * 61;
                        i5 = ((iM11306 ^ i4) * (-14935)) ^ 1070228586;
                        i6 = 1938926008;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ᩴܶ")) * 43;
                        i5 = ((iM11306 ^ i3) * 18827) ^ (-1972227305);
                        i6 = -1620774857;
                    }
                    break;
                case -820969184:
                case 1392225046:
                    f65987 = colorStateListValueOf;
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩵")) * (-115);
                        i5 = ((iM11306 ^ i4) * 28845) ^ (-1412784931);
                        i6 = -1400426459;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۟") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-1449)) ^ (-468968966);
                        i6 = -1555393643;
                    }
                    break;
                case -784505940:
                case -272067189:
                    C1460.m5050();
                    throw new RuntimeException();
                case -569856247:
                case -486018037:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ᩴܶ")) * 43;
                        i5 = ((iM11306 ^ i3) * 18827) ^ (-1972227305);
                        i6 = -1620774857;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩺᩻")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11306 ^ i4) * (-7573)) ^ 1999174759;
                        i6 = -473949845;
                    }
                    break;
                case -384437461:
                case 862846959:
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-30583)) ^ (-549466949);
                        i6 = -429789528;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ᩴܶ")) * 43;
                        i5 = ((iM11306 ^ i3) * 18827) ^ (-1972227305);
                        i6 = -1620774857;
                    }
                    break;
                case -368278271:
                case 636023026:
                    f65968 = ColorStateList.valueOf(i);
                    return;
                case -290561615:
                case 776186453:
                    if (C2249.m6915() <= 0) {
                        iM11306 = C19806.m45029("᩻۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7615) ^ (-1723058686);
                        i6 = -1171063579;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۖ") ^ i3) * 41;
                        i5 = ((iM11306 ^ i4) * (-21911)) ^ (-699887277);
                        i6 = -1707826036;
                    }
                    break;
                case -260953425:
                case 410742402:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("᩶ۗ") ^ i3) * 61;
                        i5 = ((iM11306 ^ i4) * (-14935)) ^ 1070228586;
                        i6 = 1938926008;
                    } else {
                        iM11306 = (C19806.m45029("֡᩶") + i4) * 43;
                        i5 = ((iM11306 ^ i3) * (-29333)) ^ (-1178437573);
                        i6 = -1139073932;
                    }
                    break;
                case -5329921:
                case 1684056110:
                    i = 0;
                    colorStateListValueOf = ColorStateList.valueOf(0);
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ᩴܶ")) * 43;
                        i5 = ((iM11306 ^ i3) * 18827) ^ (-1972227305);
                        i6 = -1620774857;
                    } else {
                        iM11306 = C19806.m45029("ۛ۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-8391)) ^ 1538253696;
                        i6 = 1976060588;
                    }
                    break;
                case 142939279:
                case 1015962714:
                    if (C1937.f7317 >= 0) {
                        iM11306 = C19806.m45029("᩻۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7615) ^ (-1723058686);
                        i6 = -1171063579;
                    } else {
                        iM11306 = (C19806.m45029("ܽۗ") ^ i3) * (-3);
                        i5 = ((iM11306 ^ i4) * (-211)) ^ 1600315535;
                        i6 = 1484406404;
                    }
                    break;
                case 217365178:
                case 1247566953:
                    C1668.m5583();
                    RunnableC0195.m1431();
                    iM11306 = (i4 - C19806.m45029("ᩴܶ")) * 43;
                    i5 = ((iM11306 ^ i3) * 18827) ^ (-1972227305);
                    i6 = -1620774857;
                    break;
                default:
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("᩻۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7615) ^ (-1723058686);
                        i6 = -1171063579;
                    } else {
                        iM11306 = (C19806.m45029("ۢᩳ") ^ i4) * 57;
                        i5 = ((iM11306 ^ i3) * (-4239)) ^ 1467937479;
                        i6 = -538389483;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45983(int i, int i2) {
        int i3 = 1586878758;
        int i4 = C1148.f5161;
        int i5 = C1937.f7317;
        int iM11306 = (ThreadFactoryC3888.m11306("֡᩹") + i4) * (-91);
        int i6 = ((iM11306 ^ i5) * 32439) ^ 2115805910;
        int i7 = -1709140337;
        while (true) {
            i3 = ((((i3 ^ i5) * 6801) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -1963694649:
                case -868723082:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20133)) ^ (-1387636785);
                        i7 = 1485684774;
                    } else {
                        iM11306 = C19806.m45029("᩻᩵") ^ i4;
                        i6 = ((iM11306 ^ i5) * 10185) ^ (-1096752227);
                        i7 = -915992854;
                    }
                    break;
                case -1957578912:
                case -1467233794:
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20133)) ^ (-1387636785);
                        i7 = 1485684774;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۛܳ")) * (-113);
                        i6 = ((iM11306 ^ i5) * 17185) ^ 1223927586;
                        i7 = 218699499;
                    }
                    break;
                case -1782902179:
                case 383707404:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("ۨ᩷") + i4) * (-113);
                        i6 = ((iM11306 ^ i5) * (-18669)) ^ (-295406792);
                        i7 = -1400375026;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۜۡ")) * (-51);
                        i6 = ((iM11306 ^ i5) * 10487) ^ 348844648;
                        i7 = -978055176;
                    }
                    break;
                case -1643948725:
                case -969962838:
                    if (f65971) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۜ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-15843)) ^ (-100135234);
                        i7 = 669062488;
                    } else {
                        iM11306 = (C19806.m45029("ۛ۬") + i5) * (-7);
                        i6 = ((iM11306 ^ i4) * 9965) ^ 241094210;
                        i7 = -1491019203;
                    }
                    break;
                case -1424590458:
                case -1288606187:
                    C3722.m10894();
                    iM11306 = (ThreadFactoryC3888.m11306("۬᩶") ^ i4) * 21;
                    i6 = ((iM11306 ^ i5) * 32755) ^ (-1432014967);
                    i7 = 1842592650;
                    break;
                case -1406260977:
                case 1226283284:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩶") ^ i4) * 21;
                        i6 = ((iM11306 ^ i5) * 32755) ^ (-1432014967);
                        i7 = 1842592650;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩺") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-26403)) ^ 782860476;
                        i7 = -179841189;
                    }
                    break;
                case -1354915926:
                case -1285145308:
                    C1025.m3861();
                    if (!C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩶") ^ i4) * 21;
                        i6 = ((iM11306 ^ i5) * 32755) ^ (-1432014967);
                        i7 = 1842592650;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20133)) ^ (-1387636785);
                        i7 = 1485684774;
                    }
                    break;
                case -1227416489:
                case 704236954:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20133)) ^ (-1387636785);
                        i7 = 1485684774;
                    } else {
                        iM11306 = C19806.m45029("᩸ܽ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-8255)) ^ 1412765264;
                        i7 = -1629440300;
                    }
                    break;
                case -1067969012:
                case -309013316:
                    if (C1377.f5749) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܽ") + i4) * 89;
                        i6 = ((iM11306 ^ i5) * (-31139)) ^ (-1127744004);
                        i7 = 31714420;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩷") + i4) * (-113);
                        i6 = ((iM11306 ^ i5) * (-18669)) ^ (-295406792);
                        i7 = -1400375026;
                    }
                    break;
                case -342826216:
                case 14071860:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (C19806.m45029("ۨ᩷") + i4) * (-113);
                        i6 = ((iM11306 ^ i5) * (-18669)) ^ (-295406792);
                        i7 = -1400375026;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 16283) ^ 1818064284;
                        i7 = -1565848970;
                    }
                    break;
                case -292877527:
                case 1738042926:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (C19806.m45029("ۨ᩷") + i4) * (-113);
                        i6 = ((iM11306 ^ i5) * (-18669)) ^ (-295406792);
                        i7 = -1400375026;
                    } else {
                        iM11306 = C19806.m45029("᩷ۘ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 26343) ^ 1055154636;
                        i7 = 764462214;
                    }
                    break;
                case -63449114:
                case 342791419:
                    C1189.m4368();
                    return 0;
                case 78073580:
                case 2033900674:
                    if (C2642.m8171() != 0) {
                        iM11306 = C19806.m45029("ܳ۟") ^ i5;
                        i6 = ((iM11306 ^ i4) * 12627) ^ 612230636;
                        i7 = 1626153985;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵֡") ^ i4;
                        i6 = ((iM11306 ^ i5) * 7899) ^ (-1824718413);
                        i7 = -368347530;
                    }
                    break;
                case 233743588:
                case 650728665:
                    C1461.m5080();
                    if (!C7105.m18985()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۙ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20133)) ^ (-1387636785);
                        i7 = 1485684774;
                    } else {
                        iM11306 = C19806.m45029("ܳ۟") ^ i5;
                        i6 = ((iM11306 ^ i4) * 12627) ^ 612230636;
                        i7 = 1626153985;
                    }
                    break;
                case 804762019:
                case 1969223804:
                    if (C3660.m10791() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩶") ^ i4) * 21;
                        i6 = ((iM11306 ^ i5) * 32755) ^ (-1432014967);
                        i7 = 1842592650;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ֨") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-11769)) ^ (-1666791716);
                        i7 = -283639243;
                    }
                    break;
                case 1254361474:
                case 1831885019:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ܳ۟") ^ i5;
                        i6 = ((iM11306 ^ i4) * 12627) ^ 612230636;
                        i7 = 1626153985;
                    } else {
                        iM11306 = (C19806.m45029("ۗۖ") ^ i5) * 53;
                        i6 = ((iM11306 ^ i4) * 9183) ^ 729909395;
                        i7 = 595888998;
                    }
                    break;
                case 1481732990:
                case 2062252223:
                    return i;
                default:
                    return i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45988(Configuration configuration) {
        int i = 0;
        int i2 = 0;
        int i3 = -1926939215;
        int i4 = C1460.f5948;
        int i5 = C0278.f1572;
        int iM11306 = ThreadFactoryC3888.m11306("ۖۜ") ^ i4;
        int i6 = ((iM11306 ^ i5) * 6741) ^ 679488390;
        int i7 = 1069594330;
        while (true) {
            i3 = ((((i3 ^ i5) * (-10685)) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -1967290971:
                case -1529295622:
                    return true;
                case -1944655027:
                case 1343062104:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܶ") ^ i4) * (-93);
                        i6 = ((iM11306 ^ i5) * (-18139)) ^ 1637990237;
                        i7 = 1098833981;
                    } else {
                        iM11306 = (i5 - C19806.m45029("᩻᩷")) * 5;
                        i6 = ((iM11306 ^ i4) * (-14713)) ^ 1448315116;
                        i7 = 1667190735;
                    }
                    break;
                case -1809320236:
                case 951133659:
                    i2 = 48;
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܶ") ^ i4) * (-93);
                        i6 = ((iM11306 ^ i5) * (-18139)) ^ 1637990237;
                        i7 = 1098833981;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۛۖ")) * 85;
                        i6 = ((iM11306 ^ i4) * 10925) ^ (-981701076);
                        i7 = -1082150295;
                    }
                    break;
                case -1638425756:
                case -1240522406:
                    if (C1066.m4023() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ᩴ") ^ i4) * (-83);
                        i6 = ((iM11306 ^ i5) * 15705) ^ (-53824823);
                        i7 = 1450790130;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ᩵") ^ i5) * 57;
                        i6 = ((iM11306 ^ i4) * (-28485)) ^ (-396894101);
                        i7 = -1639864379;
                    }
                    break;
                case -1571712276:
                case 301077457:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳܶ") ^ i4) * (-93);
                        i6 = ((iM11306 ^ i5) * (-18139)) ^ 1637990237;
                        i7 = 1098833981;
                    } else {
                        iM11306 = (C19806.m45029("۠᩻") + i4) * (-29);
                        i6 = ((iM11306 ^ i5) * 10605) ^ 1346920644;
                        i7 = 1231649971;
                    }
                    break;
                case -1366838971:
                case 373431290:
                    if (C2332.m7079() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩺") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-17685)) ^ (-1483370721);
                        i7 = -1064850688;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * 26919) ^ 1088877791;
                        i7 = 1882304003;
                    }
                    break;
                case -951960220:
                case 1519804570:
                    if (C1398.f5802 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩺") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-17685)) ^ (-1483370721);
                        i7 = -1064850688;
                    } else {
                        iM11306 = (C19806.m45029("ۡᩳ") + i4) * (-59);
                        i6 = ((iM11306 ^ i5) * 12719) ^ (-793217585);
                        i7 = 604020518;
                    }
                    break;
                case -839342260:
                case -369639628:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ۡᩳ") + i4) * (-59);
                        i6 = ((iM11306 ^ i5) * 12719) ^ (-793217585);
                        i7 = 604020518;
                    } else {
                        iM11306 = (i5 - C19806.m45029("۫ۡ")) * (-49);
                        i6 = ((iM11306 ^ i4) * 26891) ^ 1240959350;
                        i7 = -797680142;
                    }
                    break;
                case -606672470:
                case 1140534159:
                    i = configuration.uiMode;
                    if (C2788.m8472() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩺") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-17685)) ^ (-1483370721);
                        i7 = -1064850688;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֨") ^ i4) * (-59);
                        i6 = ((iM11306 ^ i5) * 16549) ^ 49747121;
                        i7 = -2026970618;
                    }
                    break;
                case -571448760:
                case 723637373:
                    C1025.m3861();
                    if (C1460.f5948 < 0) {
                        iM11306 = (C19806.m45029("ۡᩳ") + i4) * (-59);
                        i6 = ((iM11306 ^ i5) * 12719) ^ (-793217585);
                        i7 = 604020518;
                    } else {
                        iM11306 = (C19806.m45029("᩷ۙ") + i5) * (-95);
                        i6 = ((iM11306 ^ i4) * 5163) ^ 915405223;
                        i7 = 1925095756;
                    }
                    break;
                case -553393408:
                case 1251438126:
                    C2124.m6673();
                    C0962.m3746();
                    iM11306 = (C19806.m45029("᩷ۙ") + i5) * (-95);
                    i6 = ((iM11306 ^ i4) * 5163) ^ 915405223;
                    i7 = 1925095756;
                    break;
                case -529386633:
                case 2098994693:
                    C10634.m26820();
                    C2704.m8255();
                    return false;
                case -319546437:
                case 2001009045:
                    if ((i & i2) == 32) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-14919)) ^ (-1850125396);
                        i7 = 1856764617;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۨܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM11306 ^ i4) * (-29217)) ^ (-677324342);
                        i7 = 402760113;
                    }
                    break;
                case -266482696:
                case 1119605267:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ᩴ") ^ i4) * (-83);
                        i6 = ((iM11306 ^ i5) * 15705) ^ (-53824823);
                        i7 = 1450790130;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹֡") + i4) * 37;
                        i6 = ((iM11306 ^ i5) * 16245) ^ 1479540923;
                        i7 = 1102552812;
                    }
                    break;
                case 322618067:
                case 1214270326:
                    return false;
                case 1192808448:
                case 1869658068:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩺") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-17685)) ^ (-1483370721);
                        i7 = -1064850688;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰ᩹")) * 57;
                        i6 = ((iM11306 ^ i5) * 26383) ^ 1733456449;
                        i7 = -561094721;
                    }
                    break;
                case 1598437120:
                case 1614727520:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("ۡᩳ") + i4) * (-59);
                        i6 = ((iM11306 ^ i5) * 12719) ^ (-793217585);
                        i7 = 604020518;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۟") ^ i5;
                        i6 = ((iM11306 ^ i4) * 9641) ^ (-1682012270);
                        i7 = 1517226080;
                    }
                    break;
                default:
                    C3535.m10431();
                    if (C1875.f7103 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ᩴ") ^ i4) * (-83);
                        i6 = ((iM11306 ^ i5) * 15705) ^ (-53824823);
                        i7 = 1450790130;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩺") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-17685)) ^ (-1483370721);
                        i7 = -1064850688;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m45982(float f, float f2) {
        int i = -1889460451;
        int i2 = C1461.f5957;
        int i3 = C3535.f13026;
        int iM11306 = (ThreadFactoryC3888.m11306("ᩴۨ") + i2) * (-41);
        int i4 = ((iM11306 ^ i3) * 14539) ^ 516883018;
        int i5 = -154179060;
        while (true) {
            i = ((((i ^ i3) * (-13075)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2143481780:
                case -1258444213:
                    if (C0526.f2219) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۤۛ")) * 99;
                        i4 = ((iM11306 ^ i3) * 5845) ^ (-2116141948);
                        i5 = 2005537568;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19011) ^ 1137468638;
                        i5 = 1513482527;
                    }
                    break;
                case -2126310257:
                case 1926115924:
                    C1461.m5080();
                    return 0.0f;
                case -1969015084:
                case 39033565:
                    if (f65971) {
                        iM11306 = C19806.m45029("᩻ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3981)) ^ (-361379240);
                        i5 = 1924639807;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 22633) ^ 2037547870;
                        i5 = -1434510977;
                    }
                    break;
                case -1928660419:
                case 1540050619:
                    if (C2249.f8050 < 0) {
                        iM11306 = (i2 - C19806.m45029("ᩴ᩹")) * 15;
                        i4 = ((iM11306 ^ i3) * (-4201)) ^ 1192435571;
                        i5 = -191529495;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۙ")) * (-39);
                        i4 = ((iM11306 ^ i2) * 20013) ^ (-531870513);
                        i5 = -1734685111;
                    }
                    break;
                case -1633296515:
                case 158171904:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ۘܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30435)) ^ 2007697692;
                        i5 = 69970426;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ۠") ^ i2) * (-47);
                        i4 = ((iM11306 ^ i3) * 3559) ^ 665477265;
                        i5 = -303569688;
                    }
                    break;
                case -1466911382:
                case -174071965:
                    return f2;
                case -1438217257:
                case 1499170596:
                    C2871.m8646();
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۘܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30435)) ^ 2007697692;
                        i5 = 69970426;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܺ")) * 123;
                        i4 = ((iM11306 ^ i3) * 6659) ^ 843442278;
                        i5 = 183858804;
                    }
                    break;
                case -1206339067:
                case -18968358:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۙ")) * (-39);
                        i4 = ((iM11306 ^ i2) * 20013) ^ (-531870513);
                        i5 = -1734685111;
                    } else {
                        iM11306 = C19806.m45029("ۛܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32457) ^ (-1148551002);
                        i5 = 968499534;
                    }
                    break;
                case -651657429:
                case -571996413:
                    if (C2249.m6915() > 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۙ")) * (-39);
                        i4 = ((iM11306 ^ i2) * 20013) ^ (-531870513);
                        i5 = -1734685111;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܺ")) * 123;
                        i4 = ((iM11306 ^ i3) * 6659) ^ 843442278;
                        i5 = 183858804;
                    }
                    break;
                case -557717172:
                case 1887507598:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܺ")) * 123;
                        i4 = ((iM11306 ^ i3) * 6659) ^ 843442278;
                        i5 = 183858804;
                    } else {
                        iM11306 = C19806.m45029("۟֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9571)) ^ (-128530503);
                        i5 = -1497663525;
                    }
                    break;
                case -385618266:
                case 681790615:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("ܺܳ") ^ i3) * (-9);
                        i4 = ((iM11306 ^ i2) * (-29847)) ^ (-1940671471);
                        i5 = -1848023953;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۤۛ")) * 99;
                        i4 = ((iM11306 ^ i3) * 5845) ^ (-2116141948);
                        i5 = 2005537568;
                    }
                    break;
                case -218627295:
                case -36822327:
                    C0050.m946();
                    iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܺ")) * 123;
                    i4 = ((iM11306 ^ i3) * 6659) ^ 843442278;
                    i5 = 183858804;
                    break;
                case -164145048:
                case 1918826308:
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ۘܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30435)) ^ 2007697692;
                        i5 = 69970426;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22583)) ^ (-188721486);
                        i5 = 794939101;
                    }
                    break;
                case 322102927:
                case 1642055510:
                    if (C0526.f2219) {
                        iM11306 = (i2 - C19806.m45029("ᩴ᩹")) * 15;
                        i4 = ((iM11306 ^ i3) * (-4201)) ^ 1192435571;
                        i5 = -191529495;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ᩷") + i3) * 89;
                        i4 = ((iM11306 ^ i2) * (-14567)) ^ 993216716;
                        i5 = 138213777;
                    }
                    break;
                case 562808285:
                case 1704100813:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (i2 - C19806.m45029("ᩴ᩹")) * 15;
                        i4 = ((iM11306 ^ i3) * (-4201)) ^ 1192435571;
                        i5 = -191529495;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛ۫")) * (-103);
                        i4 = ((iM11306 ^ i2) * 269) ^ 1852790489;
                        i5 = 1682807447;
                    }
                    break;
                case 718397124:
                case 1019421936:
                    return f;
                case 817967045:
                case 1091688293:
                    if (C1398.m4895() <= 0) {
                        iM11306 = C19806.m45029("ۘܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30435)) ^ 2007697692;
                        i5 = 69970426;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i2) * 85;
                        i4 = ((iM11306 ^ i3) * (-1633)) ^ (-1681702282);
                        i5 = -1399264239;
                    }
                    break;
                default:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܺ")) * 123;
                        i4 = ((iM11306 ^ i3) * 6659) ^ 843442278;
                        i5 = 183858804;
                    } else {
                        iM11306 = C19806.m45029("۫᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4203) ^ (-1328523556);
                        i5 = -539108162;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45987(RunnableC19062 runnableC19062) {
        f65984 = runnableC19062;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x015f A[PHI: r9
      0x015f: PHI (r9v5 l.ᩴ᩺ۘ) = (r9v2 l.ᩴ᩺ۘ), (r9v3 l.ᩴ᩺ۘ), (r9v2 l.ᩴ᩺ۘ) binds: [B:38:0x0145, B:25:0x00c8, B:22:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0365 A[PHI: r12 r18 r25
      0x0365: PHI (r12v7 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:83:0x0363, B:61:0x0260, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x0365: PHI (r18v19 short) = (r18v15 short), (r18v2 short), (r18v2 short) binds: [B:83:0x0363, B:61:0x0260, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x0365: PHI (r25v55 short[]) = (r25v19 short[]), (r25v24 short[]), (r25v56 short[]) binds: [B:83:0x0363, B:61:0x0260, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45985() {
        int iM45029;
        int i;
        int i2;
        short s;
        int iM450210;
        int i3;
        int iM11306;
        int i4;
        int i5;
        short[] sArr;
        boolean zM5579;
        ?? r8;
        ?? r9;
        int i6 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i7 = C1398.f5802;
        int iM450211 = (C19806.m45029("᩵ᩳ") ^ i7) * 13;
        int i8 = ((iM450211 ^ i6) * 4487) ^ (-712884373);
        String strM9869 = null;
        String strM3859 = null;
        InterfaceC17314 interfaceC17314M5517 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM450211 ^ 1414111183;
        SharedPreferences sharedPreferences = null;
        boolean z = false;
        boolean zM26828 = false;
        boolean z2 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1339215140;
        short[] sArr4 = null;
        RunnableC19062 runnableC19062 = null;
        ?? r10 = 0;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i6) * 20751) >> 31));
            switch (i17) {
                case -2082625672:
                case 187593779:
                    sArr2 = sArr2;
                    if ((i15 + i16) - i14 < 0) {
                        iM450210 = C19806.m45029("ܿᩴ") ^ i7;
                        i = ((iM450210 ^ i6) * (-17491)) ^ (-1217401607);
                        i3 = -1710095630;
                    } else {
                        iM450210 = C19806.m45029("᩵۬") ^ i6;
                        i = ((iM450210 ^ i7) * (-10931)) ^ (-2101036337);
                        i3 = -1638581056;
                    }
                    int i18 = iM450210 ^ i3;
                    sArr2 = sArr2;
                    i9 = i18;
                    r10 = r10;
                    i8 = i;
                    break;
                case -1848636314:
                case -524368299:
                    C2871.m8646();
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ᩳ᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM45029 ^ i6) * (-31083)) ^ (-336519006);
                        i2 = -1596136207;
                        r9 = r10;
                        i9 = iM45029 ^ i2;
                        r10 = r9;
                        i8 = i;
                    } else {
                        s = s2;
                        int iM450212 = (C19806.m45029("᩸ۘ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        sharedPreferences = sharedPreferences;
                        i4 = ((iM450212 ^ i6) * (-29139)) ^ (-1778966237);
                        i9 = iM450212 ^ 1553115659;
                        i8 = i4;
                        sharedPreferences = sharedPreferences;
                        s2 = s;
                    }
                    break;
                case -1771737968:
                case -1090752677:
                    AbstractC17129.m40007(r10);
                    runnableC19062 = f65984;
                    if (runnableC19062 != null) {
                        iM45029 = C19806.m45029("ۚᩴ") ^ i7;
                        i = ((iM45029 ^ i6) * (-17155)) ^ (-134221570);
                        i2 = -707651197;
                        r9 = r10;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸֨") ^ i6;
                        i = ((iM45029 ^ i7) * (-1013)) ^ 248443969;
                        i2 = 979286813;
                        r9 = r10;
                    }
                    i9 = iM45029 ^ i2;
                    r10 = r9;
                    i8 = i;
                    break;
                case -1760354497:
                case 616033542:
                    sArr = sArr2;
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr, i11, i12, i10);
                    if (C3577.f13150 >= 0) {
                        z = true;
                        int iM450213 = C19806.m45029("ۙۛ") ^ i6;
                        short[] sArr5 = sArr;
                        i8 = ((iM450213 ^ i7) * (-20537)) ^ (-1284091925);
                        sArr2 = sArr5;
                        i9 = iM450213 ^ 819118835;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("۟ܰ") ^ i6;
                        sArr2 = sArr;
                        i8 = ((iM11307 ^ i7) * (-19945)) ^ (-575553146);
                        i9 = iM11307 ^ 471200197;
                        z = true;
                    }
                    break;
                case -1751934334:
                case -740767486:
                    r8 = 2;
                    iM45029 = (ThreadFactoryC3888.m11306("ܶܺ") ^ i7) * 91;
                    i = ((iM45029 ^ i6) * 20935) ^ (-2079002009);
                    i2 = -962102829;
                    r9 = r8;
                    i9 = iM45029 ^ i2;
                    r10 = r9;
                    i8 = i;
                    break;
                case -1696386218:
                case 1062474336:
                    i10 = 62251;
                    iM450210 = (ThreadFactoryC3888.m11306("ۖ۬") ^ i6) * 101;
                    i = ((iM450210 ^ i7) * (-2557)) ^ 769889023;
                    i3 = -830975310;
                    int i19 = iM450210 ^ i3;
                    sArr2 = sArr2;
                    i9 = i19;
                    r10 = r10;
                    i8 = i;
                    break;
                case -1692960506:
                case 575503486:
                    C2249.m6906(C1066.m4033(interfaceC17314M5517, strM3859, f65971));
                    if (z2) {
                        iM45029 = (C19806.m45029("֨ۚ") ^ i6) * 109;
                        i = ((iM45029 ^ i7) * 32053) ^ 607085196;
                        i2 = 428606755;
                        r9 = r10;
                    } else {
                        r8 = z;
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܺ") ^ i7) * 91;
                        i = ((iM45029 ^ i6) * 20935) ^ (-2079002009);
                        i2 = -962102829;
                        r9 = r8;
                    }
                    i9 = iM45029 ^ i2;
                    r10 = r9;
                    i8 = i;
                    break;
                case -1688234854:
                case 199384037:
                    break;
                case -1648792433:
                case -404822810:
                    short[] sArr6 = sArr2;
                    s = s2;
                    int i20 = s * 24266;
                    if (C3743.f13569) {
                        int iM450214 = (i7 - C19806.m45029("ܳۗ")) * 3;
                        i14 = i20;
                        i8 = ((iM450214 ^ i6) * 2107) ^ (-683833832);
                        sArr2 = sArr6;
                        i9 = iM450214 ^ (-518495681);
                    } else {
                        i14 = i20;
                        sArr2 = sArr6;
                        int iM450215 = (C19806.m45029("᩸ۘ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        sharedPreferences = sharedPreferences;
                        i4 = ((iM450215 ^ i6) * (-29139)) ^ (-1778966237);
                        i9 = iM450215 ^ 1553115659;
                        i8 = i4;
                        sharedPreferences = sharedPreferences;
                    }
                    s2 = s;
                    break;
                case -1501501551:
                case -860743592:
                    C1461.m5080();
                    break;
                case -1488050317:
                case 1684921288:
                    s = s2;
                    sArr2 = sArr2;
                    sArr4 = f65985;
                    c = '(';
                    if (RunnableC1895.f7152) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("֫ܽ")) * (-61);
                        i4 = ((iM11306 ^ i7) * 31741) ^ (-1065698142);
                        i5 = -1125194528;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ܰۚ")) * (-53);
                        i4 = ((iM11306 ^ i7) * (-29233)) ^ 1217229960;
                        i5 = 1489352218;
                    }
                    int i21 = iM11306 ^ i5;
                    sArr2 = sArr2;
                    i9 = i21;
                    i8 = i4;
                    sharedPreferences = sharedPreferences;
                    s2 = s;
                    break;
                case -1324889062:
                case -443120432:
                    i10 = 64232;
                    iM450210 = (ThreadFactoryC3888.m11306("ۖ۬") ^ i6) * 101;
                    i = ((iM450210 ^ i7) * (-2557)) ^ 769889023;
                    i3 = -830975310;
                    int i110 = iM450210 ^ i3;
                    sArr2 = sArr2;
                    i9 = i110;
                    r10 = r10;
                    i8 = i;
                    break;
                case -1290154913:
                case -588425375:
                    if (z2 != f65971) {
                        iM45029 = (C19806.m45029("ۧ᩺") + i7) * 47;
                        i = ((iM45029 ^ i6) * 31629) ^ (-849896141);
                        i2 = 475916635;
                        r9 = r10;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸֨") ^ i6;
                        i = ((iM45029 ^ i7) * (-1013)) ^ 248443969;
                        i2 = 979286813;
                        r9 = r10;
                    }
                    i9 = iM45029 ^ i2;
                    r10 = r9;
                    i8 = i;
                    break;
                case -1122551741:
                case 2040319176:
                    zM26828 = C10634.m26828(sharedPreferences, strM9869, z);
                    sArr3 = f65985;
                    i13 = 70;
                    if (C3535.f13026 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰᩳ") ^ i7;
                        i = ((iM45029 ^ i6) * (-1749)) ^ (-1598461865);
                        i2 = 2128651944;
                        r9 = r10;
                        i9 = iM45029 ^ i2;
                        r10 = r9;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        int iM450216 = C19806.m45029("ۙۛ") ^ i6;
                        short[] sArr7 = sArr;
                        i8 = ((iM450216 ^ i7) * (-20537)) ^ (-1284091925);
                        sArr2 = sArr7;
                        i9 = iM450216 ^ 819118835;
                    }
                    break;
                case -661992573:
                case -179509301:
                    f65971 = z2;
                    interfaceC17314M5517 = CallableC1627.m5517(C16737.f53607);
                    if (!RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ܶۜ") ^ i6;
                        i = ((iM45029 ^ i7) * (-28911)) ^ 339786132;
                        i2 = -2091937873;
                        r9 = r10;
                        i9 = iM45029 ^ i2;
                        r10 = r9;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        int iM450217 = C19806.m45029("ۙۛ") ^ i6;
                        short[] sArr8 = sArr;
                        i8 = ((iM450217 ^ i7) * (-20537)) ^ (-1284091925);
                        sArr2 = sArr8;
                        i9 = iM450217 ^ 819118835;
                    }
                    break;
                case -309695610:
                case 1450334303:
                    sArr2 = sArr2;
                    i11 = 41;
                    if (C1460.f5948 >= 0) {
                        iM450210 = (C19806.m45029("᩶ܳ") ^ i6) * (-49);
                        i = ((iM450210 ^ i7) * (-22465)) ^ (-1153213476);
                        i3 = -495709426;
                    } else {
                        iM450210 = (C19806.m45029("۬ܺ") ^ i6) * 23;
                        i = ((iM450210 ^ i7) * (-18537)) ^ 1356638244;
                        i3 = 1439355822;
                    }
                    int i111 = iM450210 ^ i3;
                    sArr2 = sArr2;
                    i9 = i111;
                    r10 = r10;
                    i8 = i;
                    break;
                case -234570923:
                case 531115571:
                    C1189.m4368();
                    if (!C0962.f3784) {
                        s = s2;
                        int iM450218 = (C19806.m45029("᩸ۘ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        sharedPreferences = sharedPreferences;
                        i4 = ((iM450218 ^ i6) * (-29139)) ^ (-1778966237);
                        i9 = iM450218 ^ 1553115659;
                        i8 = i4;
                        sharedPreferences = sharedPreferences;
                        s2 = s;
                    } else {
                        sArr2 = sArr2;
                        iM450210 = (C19806.m45029("᩶ܳ") ^ i6) * (-49);
                        i = ((iM450210 ^ i7) * (-22465)) ^ (-1153213476);
                        i3 = -495709426;
                        int i112 = iM450210 ^ i3;
                        sArr2 = sArr2;
                        i9 = i112;
                        r10 = r10;
                        i8 = i;
                    }
                    break;
                case -219600793:
                case 507678703:
                    sArr2 = sArr2;
                    s2 = sArr4[c];
                    if (C0671.m3008() >= 0) {
                        iM450210 = (C19806.m45029("᩶ܳ") ^ i6) * (-49);
                        i = ((iM450210 ^ i7) * (-22465)) ^ (-1153213476);
                        i3 = -495709426;
                    } else {
                        iM450210 = C19806.m45029("֡ᩴ") ^ i7;
                        i = ((iM450210 ^ i6) * 3163) ^ 1326443946;
                        i3 = -1230204543;
                    }
                    int i113 = iM450210 ^ i3;
                    sArr2 = sArr2;
                    i9 = i113;
                    r10 = r10;
                    i8 = i;
                    break;
                case -186070613:
                case -25704712:
                    C2704.m8255();
                    if (!CallableC1627.f6528) {
                        s = s2;
                        sArr2 = sArr2;
                        iM11306 = (i6 - C19806.m45029("ܰۚ")) * (-53);
                        i4 = ((iM11306 ^ i7) * (-29233)) ^ 1217229960;
                        i5 = 1489352218;
                        int i22 = iM11306 ^ i5;
                        sArr2 = sArr2;
                        i9 = i22;
                        i8 = i4;
                        sharedPreferences = sharedPreferences;
                        s2 = s;
                    }
                    s = s2;
                    int iM450219 = (C19806.m45029("᩸ۘ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    sharedPreferences = sharedPreferences;
                    i4 = ((iM450219 ^ i6) * (-29139)) ^ (-1778966237);
                    i9 = iM450219 ^ 1553115659;
                    i8 = i4;
                    sharedPreferences = sharedPreferences;
                    s2 = s;
                    break;
                case -20462940:
                case 798021130:
                    runnableC19062.run();
                    iM45029 = ThreadFactoryC3888.m11306("᩸֨") ^ i6;
                    i = ((iM45029 ^ i7) * (-1013)) ^ 248443969;
                    i2 = 979286813;
                    r9 = r10;
                    i9 = iM45029 ^ i2;
                    r10 = r9;
                    i8 = i;
                    break;
                case 398290720:
                case 1214481399:
                    sharedPreferences = C16737.f53615;
                    sArr2 = f65985;
                    if (C2788.f10625 < 0) {
                        iM45029 = C19806.m45029("֡᩷") ^ i7;
                        i = ((iM45029 ^ i6) * 32475) ^ 1559794445;
                        i2 = -962619763;
                        r9 = r10;
                        i9 = iM45029 ^ i2;
                        r10 = r9;
                        i8 = i;
                    } else {
                        s = s2;
                        int iM4502110 = (C19806.m45029("᩸ۘ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        sharedPreferences = sharedPreferences;
                        i4 = ((iM4502110 ^ i6) * (-29139)) ^ (-1778966237);
                        i9 = iM4502110 ^ 1553115659;
                        i8 = i4;
                        sharedPreferences = sharedPreferences;
                        s2 = s;
                    }
                    break;
                case 448849216:
                case 479630886:
                    zM5579 = f65990;
                    z2 = zM5579;
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("ᩴۗ")) * (-75);
                    i = ((iM45029 ^ i6) * (-20063)) ^ (-1739972661);
                    i2 = -761093315;
                    r9 = r10;
                    i9 = iM45029 ^ i2;
                    r10 = r9;
                    i8 = i;
                    break;
                case 498810303:
                case 1588244884:
                    C2124.m6673();
                    sArr2 = sArr2;
                    iM450210 = (C19806.m45029("᩶ܳ") ^ i6) * (-49);
                    i = ((iM450210 ^ i7) * (-22465)) ^ (-1153213476);
                    i3 = -495709426;
                    int i114 = iM450210 ^ i3;
                    sArr2 = sArr2;
                    i9 = i114;
                    r10 = r10;
                    i8 = i;
                    break;
                case 579522929:
                case 1541188187:
                    sArr = sArr2;
                    i12 = 29;
                    if (C1937.f7317 < 0) {
                        sArr2 = sArr;
                        iM450210 = ThreadFactoryC3888.m11306("ۧۤ") ^ i7;
                        i = ((iM450210 ^ i6) * 12325) ^ (-948493334);
                        i3 = 262276134;
                        int i115 = iM450210 ^ i3;
                        sArr2 = sArr2;
                        i9 = i115;
                        r10 = r10;
                        i8 = i;
                    } else {
                        int iM4502111 = C19806.m45029("ۙۛ") ^ i6;
                        short[] sArr9 = sArr;
                        i8 = ((iM4502111 ^ i7) * (-20537)) ^ (-1284091925);
                        sArr2 = sArr9;
                        i9 = iM4502111 ^ 819118835;
                    }
                    break;
                case 1045896041:
                case 1175629290:
                    zM5579 = C1668.m5579(C16737.f53607, strM3859, false);
                    z2 = zM5579;
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("ᩴۗ")) * (-75);
                    i = ((iM45029 ^ i6) * (-20063)) ^ (-1739972661);
                    i2 = -761093315;
                    r9 = r10;
                    i9 = iM45029 ^ i2;
                    r10 = r9;
                    i8 = i;
                    break;
                case 1442146838:
                case 2120103874:
                    strM3859 = C1025.m3859(sArr3, i13, 10, i10);
                    if (zM26828) {
                        iM45029 = (C19806.m45029("ۡۤ") ^ i7) * (-105);
                        i = ((iM45029 ^ i6) * (-17159)) ^ 235058811;
                        i2 = 1217758676;
                        r9 = r10;
                    } else {
                        iM45029 = C19806.m45029("᩸᩶") ^ i6;
                        i = ((iM45029 ^ i7) * 32405) ^ 337948743;
                        i2 = -418122077;
                        r9 = r10;
                    }
                    i9 = iM45029 ^ i2;
                    r10 = r9;
                    i8 = i;
                    break;
                default:
                    sArr2 = sArr2;
                    i15 = s2 * s2;
                    i16 = 147209689;
                    if (C3286.m9798() > 0) {
                        iM450210 = C19806.m45029("᩺ܶ") ^ i6;
                        i = ((iM450210 ^ i7) * (-17969)) ^ (-1704903327);
                        i3 = -1439737224;
                        int i116 = iM450210 ^ i3;
                        sArr2 = sArr2;
                        i9 = i116;
                        r10 = r10;
                        i8 = i;
                    } else {
                        s = s2;
                        iM11306 = (i6 - C19806.m45029("ܰۚ")) * (-53);
                        i4 = ((iM11306 ^ i7) * (-29233)) ^ 1217229960;
                        i5 = 1489352218;
                        int i23 = iM11306 ^ i5;
                        sArr2 = sArr2;
                        i9 = i23;
                        i8 = i4;
                        sharedPreferences = sharedPreferences;
                        s2 = s;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m45990(Configuration configuration) {
        f65990 = m45988(configuration);
        m45985();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45986(Configuration configuration, int i) {
        boolean zM45988 = false;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1711742611;
        int i7 = C3577.f13150;
        int i8 = C2249.f8050;
        int iM11306 = (ThreadFactoryC3888.m11306("ۤ᩵") + i8) * 91;
        int i9 = ((iM11306 ^ i7) * 22245) ^ 1432865500;
        int i10 = -1357124815;
        while (true) {
            i6 = ((((i6 ^ i7) * 11667) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -1988608760:
                case 216868867:
                    if (i != -1) {
                        iM11306 = (C19806.m45029("ۡۚ") + i8) * 25;
                        i9 = ((iM11306 ^ i7) * 19677) ^ 2122458664;
                        i10 = -1114420911;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩵") ^ i7;
                        i9 = ((iM11306 ^ i8) * 15171) ^ 1347870203;
                        i10 = -779385302;
                    }
                    break;
                case -1909743915:
                case -324165873:
                    if (C0817.m3399()) {
                        iM11306 = C19806.m45029("۟ۧ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-20119)) ^ 185962583;
                        i10 = -1733353817;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ᩴ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 10403) ^ (-1117011727);
                        i10 = -1731642559;
                    }
                    break;
                case -1899103790:
                case -860314703:
                    if (C3660.m10791() != 0) {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ۙܳ")) * 17;
                        i9 = ((iM11306 ^ i7) * (-26095)) ^ (-361230125);
                        i10 = -1723416846;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ᩳ֡")) * (-111);
                        i9 = ((iM11306 ^ i8) * (-27945)) ^ (-475645157);
                        i10 = 2076595145;
                    }
                    break;
                case -1753762154:
                case 383624575:
                    C3286.m9798();
                    iM11306 = (C19806.m45029("֫ܺ") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i9 = ((iM11306 ^ i8) * 29347) ^ (-1250310591);
                    i10 = 2140463616;
                    break;
                case -1724288211:
                case -1566360830:
                    if (i != -100) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۘᩴ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM11306 ^ i8) * (-16695)) ^ 1552048937;
                        i10 = -1081354882;
                    } else {
                        iM11306 = (i8 - C19806.m45029("֡ۨ")) * (-31);
                        i9 = ((iM11306 ^ i7) * (-13353)) ^ 850847321;
                        i10 = -1747200724;
                    }
                    break;
                case -1717542564:
                case 999805105:
                    if (C1398.m4895() <= 0) {
                        iM11306 = C19806.m45029("֡ܺ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 32315) ^ (-1340387615);
                        i10 = -219748782;
                    } else {
                        iM11306 = C19806.m45029("ۛۡ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-9109)) ^ (-152694192);
                        i10 = -1125951595;
                    }
                    break;
                case -1695766176:
                case -184251387:
                    if (i != 2) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 32265) ^ 932955956;
                        i10 = -177372440;
                    } else {
                        zM45988 = z;
                        iM11306 = (i8 - C19806.m45029("ۡ᩷")) * 21;
                        i9 = ((iM11306 ^ i7) * (-10641)) ^ (-425566412);
                        i10 = 2102965934;
                    }
                    break;
                case -1394411863:
                case 1694846124:
                    configuration.uiMode = i5 | i4;
                    break;
                case -1348755972:
                case 1903591198:
                    i5 = 16;
                    iM11306 = (C19806.m45029("ۢ֨") ^ i8) * (-65);
                    i9 = ((iM11306 ^ i7) * (-9685)) ^ (-200198391);
                    i10 = 1638992351;
                    break;
                case -1306936028:
                case -1027783029:
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۘ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 24061) ^ (-1664192493);
                        i10 = -1945093102;
                    } else {
                        iM11306 = C19806.m45029("ۡ۬") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-17521)) ^ (-2091532174);
                        i10 = -1280407368;
                    }
                    break;
                case -1253395837:
                case 517343509:
                    if (zM45988) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۛܽ")) * (-117);
                        i9 = ((iM11306 ^ i8) * 10211) ^ (-1818753076);
                        i10 = 376222858;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۬") ^ i7;
                        i9 = ((iM11306 ^ i8) * 16157) ^ (-1746704790);
                        i10 = 894829755;
                    }
                    break;
                case -1161266031:
                case 1449892074:
                    zM45988 = false;
                    iM11306 = (i8 - C19806.m45029("ۡ᩷")) * 21;
                    i9 = ((iM11306 ^ i7) * (-10641)) ^ (-425566412);
                    i10 = 2102965934;
                    break;
                case -662185390:
                case 2088820124:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۘ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 24061) ^ (-1664192493);
                        i10 = -1945093102;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡܶ") + i8) * (-119);
                        i9 = ((iM11306 ^ i7) * 8263) ^ (-1469411023);
                        i10 = -428480865;
                    }
                    break;
                case -636006413:
                case 870602905:
                    i4 = i2 & i3;
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("֡ܺ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 32315) ^ (-1340387615);
                        i10 = -219748782;
                    } else {
                        iM11306 = C19806.m45029("֡ܳ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 22647) ^ (-107510265);
                        i10 = -1519998863;
                    }
                    break;
                case -361812255:
                case 1487577821:
                    C2124.m6673();
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ۙܳ")) * 17;
                        i9 = ((iM11306 ^ i7) * (-26095)) ^ (-361230125);
                        i10 = -1723416846;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۘ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 24061) ^ (-1664192493);
                        i10 = -1945093102;
                    }
                    break;
                case -339280339:
                case 1191760520:
                    i2 = configuration.uiMode;
                    i3 = -49;
                    if (C2332.m7079() <= 0) {
                        iM11306 = (C19806.m45029("֫ܺ") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM11306 ^ i8) * 29347) ^ (-1250310591);
                        i10 = 2140463616;
                    } else {
                        iM11306 = C19806.m45029("۟᩹") ^ i7;
                        i9 = ((iM11306 ^ i8) * 10043) ^ 1731320136;
                        i10 = -1456867920;
                    }
                    break;
                case 187183038:
                case 1262889669:
                    zM45988 = m45988(configuration);
                    iM11306 = (i8 - C19806.m45029("ۡ᩷")) * 21;
                    i9 = ((iM11306 ^ i7) * (-10641)) ^ (-425566412);
                    i10 = 2102965934;
                    break;
                case 309327491:
                case 1489802272:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (C19806.m45029("֫ܺ") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM11306 ^ i8) * 29347) ^ (-1250310591);
                        i10 = 2140463616;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩷") ^ i7) * (-119);
                        i9 = ((iM11306 ^ i8) * (-5161)) ^ 35369882;
                        i10 = -925065929;
                    }
                    break;
                case 433789968:
                case 601148964:
                    zM45988 = f65971;
                    iM11306 = (i8 - C19806.m45029("ۡ᩷")) * 21;
                    i9 = ((iM11306 ^ i7) * (-10641)) ^ (-425566412);
                    i10 = 2102965934;
                    break;
                case 459261612:
                case 1625026974:
                    C3660.m10791();
                    C2124.m6673();
                    break;
                case 621518081:
                case 1459202865:
                    i5 = 32;
                    iM11306 = (C19806.m45029("ۢ֨") ^ i8) * (-65);
                    i9 = ((iM11306 ^ i7) * (-9685)) ^ (-200198391);
                    i10 = 1638992351;
                    break;
                case 890104013:
                case 1754705887:
                    zM45988 = f65971;
                    iM11306 = (i8 - C19806.m45029("ۡ᩷")) * 21;
                    i9 = ((iM11306 ^ i7) * (-10641)) ^ (-425566412);
                    i10 = 2102965934;
                    break;
                case 1058772606:
                case 1952135961:
                    z = true;
                    if (i != 1) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ᩹") + i7) * (-67);
                        i9 = ((iM11306 ^ i8) * 7303) ^ 528582034;
                        i10 = -1996310149;
                    } else {
                        iM11306 = C19806.m45029("ۗܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-2475)) ^ (-1534056199);
                        i10 = -1777855805;
                    }
                    break;
                case 1607429047:
                case 2045525778:
                    C3743.m10966();
                    if (!C2332.f8260) {
                        iM11306 = (C19806.m45029("֫ܺ") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM11306 ^ i8) * 29347) ^ (-1250310591);
                        i10 = 2140463616;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۘ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 24061) ^ (-1664192493);
                        i10 = -1945093102;
                    }
                    break;
                case 1758546827:
                case 1998278043:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۘ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 24061) ^ (-1664192493);
                        i10 = -1945093102;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ܰۡ")) * (-79);
                        i9 = ((iM11306 ^ i8) * 24731) ^ 733403941;
                        i10 = -1262160681;
                    }
                    break;
                case 1942816252:
                case 2035072855:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ۙܳ")) * 17;
                        i9 = ((iM11306 ^ i7) * (-26095)) ^ (-361230125);
                        i10 = -1723416846;
                    } else {
                        iM11306 = C19806.m45029("ۚ᩵") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-24935)) ^ 251205920;
                        i10 = 946771850;
                    }
                    break;
                default:
                    if (C1668.f6641 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ᩴ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 10403) ^ (-1117011727);
                        i10 = -1731642559;
                    } else {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ۙܳ")) * 17;
                        i9 = ((iM11306 ^ i7) * (-26095)) ^ (-361230125);
                        i10 = -1723416846;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x012e A[PHI: r6 r7
      0x012e: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:34:0x012c, B:15:0x0088, B:11:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r7v4 boolean) = (r7v3 boolean), (r7v2 boolean), (r7v2 boolean) binds: [B:34:0x012c, B:15:0x0088, B:11:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x023e A[PHI: r5 r11 r12 r13 r15 r24
      0x023e: PHI (r5v3 l.ܿۧ᩺) = (r5v2 l.ܿۧ᩺), (r5v4 l.ܿۧ᩺) binds: [B:59:0x023c, B:38:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:59:0x023c, B:38:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r12v3 short[]) = (r12v2 short[]), (r12v4 short[]) binds: [B:59:0x023c, B:38:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:59:0x023c, B:38:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]) binds: [B:59:0x023c, B:38:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r24v27 android.content.SharedPreferences) = (r24v24 android.content.SharedPreferences), (r24v3 android.content.SharedPreferences) binds: [B:59:0x023c, B:38:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02fa A[PHI: r18 r19 r23
      0x02fa: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:75:0x02f8, B:71:0x02d7, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x02fa: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:75:0x02f8, B:71:0x02d7, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x02fa: PHI (r23v36 android.content.SharedPreferences) = 
      (r23v7 android.content.SharedPreferences)
      (r23v8 android.content.SharedPreferences)
      (r23v37 android.content.SharedPreferences)
     binds: [B:75:0x02f8, B:71:0x02d7, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0353 A[PHI: r4 r10 r16 r17 r23
      0x0353: PHI (r4v8 l.ۛۧ᩺) = (r4v2 l.ۛۧ᩺), (r4v2 l.ۛۧ᩺), (r4v2 l.ۛۧ᩺), (r4v9 l.ۛۧ᩺) binds: [B:83:0x0351, B:79:0x032e, B:55:0x0219, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r10v7 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:83:0x0351, B:79:0x032e, B:55:0x0219, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r16v7 short) = (r16v2 short), (r16v3 short), (r16v2 short), (r16v2 short) binds: [B:83:0x0351, B:79:0x032e, B:55:0x0219, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r17v7 short) = (r17v3 short), (r17v2 short), (r17v2 short), (r17v2 short) binds: [B:83:0x0351, B:79:0x032e, B:55:0x0219, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r23v46 android.content.SharedPreferences) = 
      (r23v5 android.content.SharedPreferences)
      (r23v6 android.content.SharedPreferences)
      (r23v15 android.content.SharedPreferences)
      (r23v47 android.content.SharedPreferences)
     binds: [B:83:0x0351, B:79:0x032e, B:55:0x0219, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        if (l.C3743.f13569 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0072, code lost:
    
        if (l.C2477.f9839 > 0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45981() {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20368.m45981():void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m45991() {
        return f65971;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m45992(Configuration configuration, int i) {
        int iM45029;
        int i2;
        boolean zM45988 = false;
        boolean z = false;
        boolean z2 = false;
        boolean zM45989 = false;
        int i3 = 1928054391;
        int i4 = C3660.f13403;
        int i5 = C7105.f23796;
        int iM450210 = C19806.m45029("ۗۛ") ^ i4;
        int i6 = ((iM450210 ^ i5) * 26911) ^ (-1603126404);
        int i7 = -1571815693;
        while (true) {
            int i8 = iM450210 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 28907) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2018593123:
                    case -159896961:
                        zM45989 = m45988(configuration);
                        iM450210 = (i5 - C19806.m45029("ۤ᩺")) * (-39);
                        i6 = ((iM450210 ^ i4) * 17287) ^ 1093451467;
                        i7 = 1702657812;
                        break;
                    case -2003427589:
                    case -1947540270:
                        if (RunnableC1895.m6170() == 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ܶۖ") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-15875)) ^ 1748823604;
                            i7 = -20339067;
                            break;
                        }
                        iM450210 = (C19806.m45029("᩻ܺ") ^ i5) * (-33);
                        i6 = ((iM450210 ^ i4) * (-21215)) ^ (-1873432871);
                        i7 = 2006518774;
                        break;
                    case -1986842102:
                    case 244621586:
                        if (i == -1) {
                            iM450210 = (C19806.m45029("ᩳ᩷") + i4) * 109;
                            i6 = ((iM450210 ^ i5) * (-7137)) ^ (-1239430226);
                            i7 = 1626644580;
                            break;
                        }
                        iM450210 = C19806.m45029("ۜܰ") ^ i5;
                        i6 = ((iM450210 ^ i4) * 30009) ^ (-144893827);
                        i7 = -1180373449;
                        break;
                    case -1974080719:
                    case 984901409:
                        zM45989 = true;
                        iM450210 = (i5 - C19806.m45029("ۤ᩺")) * (-39);
                        i6 = ((iM450210 ^ i4) * 17287) ^ 1093451467;
                        i7 = 1702657812;
                        break;
                        break;
                    case -1949009517:
                    case -1173432327:
                        return z2;
                    case -1896599305:
                    case -64831666:
                        if (C1398.f5802 > 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("ۘܺ") + i5) * (-17);
                            i6 = ((iM450210 ^ i4) * (-23795)) ^ 2066343032;
                            i7 = 1377861065;
                            break;
                        }
                        iM450210 = (C19806.m45029("᩻ܺ") ^ i5) * (-33);
                        i6 = ((iM450210 ^ i4) * (-21215)) ^ (-1873432871);
                        i7 = 2006518774;
                        break;
                        break;
                    case -1817985547:
                    case 1616700002:
                        if (!C0962.f3784) {
                            iM450210 = C19806.m45029("۫ۘ") ^ i5;
                            i6 = ((iM450210 ^ i4) * 26135) ^ 1270767767;
                            i7 = -558728790;
                            break;
                        }
                        iM450210 = (i4 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM450210 ^ i5) * (-2375)) ^ (-942607567);
                        i7 = -1995083048;
                        break;
                    case -1745867665:
                    case 862305301:
                        if (i != -100) {
                            iM45029 = C19806.m45029("᩹ۘ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-23681)) ^ (-500973451);
                            i2 = -990654654;
                        } else {
                            iM45029 = C19806.m45029("۠ܶ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 8621) ^ (-47873982);
                            i2 = 938125535;
                        }
                        i8 = iM45029 ^ i2;
                        z = false;
                        z2 = true;
                        break;
                    case -1708645538:
                    case 359846920:
                        if (!C0797.f3386) {
                            iM450210 = (ThreadFactoryC3888.m11306("ܿۧ") ^ i5) * 29;
                            i6 = ((iM450210 ^ i4) * 5091) ^ 1158073435;
                            i7 = 69385518;
                            break;
                        }
                        iM450210 = (i4 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM450210 ^ i5) * (-2375)) ^ (-942607567);
                        i7 = -1995083048;
                        break;
                        break;
                    case -1647592084:
                    case 1410780354:
                        if (!C2332.f8260) {
                            iM450210 = C19806.m45029("۫ۘ") ^ i5;
                            i6 = ((iM450210 ^ i4) * 26135) ^ 1270767767;
                            i7 = -558728790;
                            break;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("ᩴܿ") ^ i5;
                        i6 = ((iM450210 ^ i4) * (-167)) ^ (-758011994);
                        i7 = 1123119263;
                        break;
                    case -1624081626:
                    case -1453650164:
                        C1025.m3861();
                        if (C2477.f9839 > 0) {
                            iM450210 = C19806.m45029("᩷᩸") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-9451)) ^ (-66258769);
                            i7 = -1156305994;
                            break;
                        }
                        iM450210 = (i4 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM450210 ^ i5) * (-2375)) ^ (-942607567);
                        i7 = -1995083048;
                        break;
                        break;
                    case -1606134326:
                    case -591201094:
                        zM45989 = f65971;
                        iM450210 = (i5 - C19806.m45029("ۤ᩺")) * (-39);
                        i6 = ((iM450210 ^ i4) * 17287) ^ 1093451467;
                        i7 = 1702657812;
                        break;
                        break;
                    case -1457706917:
                    case -382696415:
                        return z;
                    case -1227799824:
                    case 1336403493:
                        if (zM45988 != zM45989) {
                            iM450210 = C19806.m45029("ۚۘ") ^ i4;
                            i6 = ((iM450210 ^ i5) * 26145) ^ (-1730745880);
                            i7 = 2124316252;
                            break;
                        }
                        iM450210 = C19806.m45029("ܿܰ") ^ i5;
                        i6 = ((iM450210 ^ i4) * (-3233)) ^ (-1250519991);
                        i7 = 1886020871;
                        break;
                    case -1156380895:
                    case 683692911:
                        if (RunnableC0195.f1321 < 0) {
                            iM450210 = C19806.m45029("۠᩷") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-14007)) ^ (-23135171);
                            i7 = -1011351018;
                            break;
                        }
                        iM450210 = (ThreadFactoryC3888.m11306("ۛۤ") ^ i4) * (-101);
                        i6 = ((iM450210 ^ i5) * 23235) ^ 1584204820;
                        i7 = -1269501797;
                        break;
                    case -770164346:
                    case 9239677:
                        zM45989 = false;
                        iM450210 = (i5 - C19806.m45029("ۤ᩺")) * (-39);
                        i6 = ((iM450210 ^ i4) * 17287) ^ 1093451467;
                        i7 = 1702657812;
                        break;
                        break;
                    case -702878130:
                    case 1768382886:
                        zM45988 = m45988(configuration);
                        if (!C0817.f3443) {
                            iM450210 = (C19806.m45029("᩻ܺ") ^ i5) * (-33);
                            i6 = ((iM450210 ^ i4) * (-21215)) ^ (-1873432871);
                            i7 = 2006518774;
                            break;
                            break;
                        }
                        iM450210 = (ThreadFactoryC3888.m11306("ۖ֨") + i5) * (-105);
                        i6 = ((iM450210 ^ i4) * (-13813)) ^ (-63852762);
                        i7 = -820351294;
                        break;
                    case -580404330:
                    case -324677758:
                        if (C0050.f912 > 0) {
                            iM450210 = (C19806.m45029("ۛ֡") + i4) * (-71);
                            i6 = ((iM450210 ^ i5) * 14987) ^ 1691918228;
                            i7 = -961014130;
                            break;
                        }
                        iM450210 = (C19806.m45029("᩻ܺ") ^ i5) * (-33);
                        i6 = ((iM450210 ^ i4) * (-21215)) ^ (-1873432871);
                        i7 = 2006518774;
                        break;
                        break;
                    case -390867888:
                    case 903939412:
                        if (C0962.m3746() < 0) {
                            iM450210 = (C19806.m45029("ܳ᩵") ^ i5) * (-27);
                            i6 = ((iM450210 ^ i4) * (-9529)) ^ 275858238;
                            i7 = -1432187671;
                            break;
                        }
                        iM450210 = C19806.m45029("۫ۘ") ^ i5;
                        i6 = ((iM450210 ^ i4) * 26135) ^ 1270767767;
                        i7 = -558728790;
                        break;
                        break;
                    case -328109707:
                    case 1484582326:
                        C1875.m6086();
                        return false;
                    case 15552329:
                    case 1941987532:
                        if (i == z2) {
                            iM450210 = ThreadFactoryC3888.m11306("۬ܶ") ^ i4;
                            i6 = ((iM450210 ^ i5) * 22017) ^ (-1604540323);
                            i7 = 1169605903;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("ܰۛ") ^ i4;
                        i6 = ((iM450210 ^ i5) * 16517) ^ 1862307090;
                        i7 = -550901578;
                        break;
                    case 154679000:
                    case 230900168:
                        if (C1398.f5802 > 0) {
                            iM450210 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i4;
                            i6 = ((iM450210 ^ i5) * 3407) ^ (-1518750615);
                            i7 = 226834784;
                            break;
                        }
                        iM450210 = C19806.m45029("᩷᩸") ^ i4;
                        i6 = ((iM450210 ^ i5) * (-9451)) ^ (-66258769);
                        i7 = -1156305994;
                        break;
                        break;
                    case 349630920:
                    case 1945159336:
                        C0817.m3399();
                        iM450210 = (i4 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM450210 ^ i5) * (-2375)) ^ (-942607567);
                        i7 = -1995083048;
                        break;
                        break;
                    case 750339092:
                    case 1287573546:
                        if (!C0526.f2219) {
                            iM450210 = (ThreadFactoryC3888.m11306("ۛۤ") ^ i4) * (-101);
                            i6 = ((iM450210 ^ i5) * 23235) ^ 1584204820;
                            i7 = -1269501797;
                            break;
                            break;
                        }
                        iM450210 = (i4 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM450210 ^ i5) * (-2375)) ^ (-942607567);
                        i7 = -1995083048;
                        break;
                        break;
                    case 1216818270:
                    case 2032721199:
                        if (i == 2) {
                            iM450210 = ThreadFactoryC3888.m11306("ۜ۬") ^ i5;
                            i6 = ((iM450210 ^ i4) * (-18661)) ^ (-1462747260);
                            i7 = 1076979086;
                            break;
                        }
                        iM450210 = C19806.m45029("ܺܰ") ^ i5;
                        i6 = ((iM450210 ^ i4) * (-18673)) ^ (-1221301085);
                        i7 = -1116679403;
                        break;
                    case 1997824268:
                    case 2063201769:
                        zM45989 = f65971;
                        iM450210 = (i5 - C19806.m45029("ۤ᩺")) * (-39);
                        i6 = ((iM450210 ^ i4) * 17287) ^ 1093451467;
                        i7 = 1702657812;
                        break;
                        break;
                    default:
                        if (C3722.m10894() > 0) {
                            iM450210 = (C19806.m45029("ۚۛ") ^ i4) * 61;
                            i6 = ((iM450210 ^ i5) * 13981) ^ (-470703464);
                            i7 = -661443276;
                            break;
                        }
                        iM450210 = (C19806.m45029("᩻ܺ") ^ i5) * (-33);
                        i6 = ((iM450210 ^ i4) * (-21215)) ^ (-1873432871);
                        i7 = 2006518774;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m45984(Object obj, Object obj2) {
        int i = -1561157992;
        int i2 = C2871.f10837;
        int i3 = C2124.f7782;
        int iM45029 = (i2 - C19806.m45029("ܰۗ")) * (-41);
        int i4 = ((iM45029 ^ i3) * 22085) ^ (-1982253124);
        int i5 = -1194443573;
        while (true) {
            i = ((((i ^ i3) * 22331) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2063537663:
                case -28571277:
                    if (C1875.m6086() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2913) ^ (-26511337);
                        i5 = 1670063206;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩵") ^ i3) * (-107);
                        i4 = ((iM45029 ^ i2) * 4643) ^ (-1841169846);
                        i5 = -1066598329;
                    }
                    break;
                case -2035314532:
                case -276827240:
                    if (C1377.f5749) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫᩷")) * 33;
                        i4 = ((iM45029 ^ i3) * (-15413)) ^ (-1581245111);
                        i5 = -674223976;
                    } else {
                        iM45029 = C19806.m45029("᩵ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18917)) ^ 2058975933;
                        i5 = -338271856;
                    }
                    break;
                case -2024155068:
                case -1101178803:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("ۗ᩹") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * (-2661)) ^ 330100825;
                        i5 = -61541521;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ܳ") + i2) * 83;
                        i4 = ((iM45029 ^ i3) * (-18887)) ^ 913710923;
                        i5 = -1863622248;
                    }
                    break;
                case -1963909815:
                case -1033490089:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2913) ^ (-26511337);
                        i5 = 1670063206;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10733) ^ 1906376885;
                        i5 = -1810024114;
                    }
                    break;
                case -1795814952:
                case 447313440:
                    if (C1460.m5050() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * 32361) ^ (-1890061699);
                        i5 = -1509675924;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15159)) ^ 1201957528;
                        i5 = 725578365;
                    }
                    break;
                case -1395628284:
                case 1495615504:
                    C3286.m9798();
                    C0050.m946();
                    iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i3) * (-105);
                    i4 = ((iM45029 ^ i2) * 32361) ^ (-1890061699);
                    i5 = -1509675924;
                    break;
                case -1143705784:
                case 653106839:
                    if (f65971) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30827)) ^ (-1649773255);
                        i5 = 309336341;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܶܶ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i3) * (-7005)) ^ (-10165956);
                        i5 = -1212689949;
                    }
                    break;
                case -1076354277:
                case -213755250:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("ۗ᩹") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * (-2661)) ^ 330100825;
                        i5 = -61541521;
                    } else {
                        iM45029 = C19806.m45029("ۨܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11063) ^ (-147352796);
                        i5 = 155600766;
                    }
                    break;
                case -956072648:
                case -359433752:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * 32361) ^ (-1890061699);
                        i5 = -1509675924;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6897)) ^ 2040848745;
                        i5 = -255688088;
                    }
                    break;
                case -952425535:
                case 1554262138:
                    if (C7105.m18985()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * 32361) ^ (-1890061699);
                        i5 = -1509675924;
                    } else {
                        iM45029 = (C19806.m45029("ܽ᩸") ^ i2) * (-89);
                        i4 = ((iM45029 ^ i3) * 5973) ^ (-2005619321);
                        i5 = 1978079962;
                    }
                    break;
                case -780661365:
                case 1663761850:
                    if (C7105.f23796 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * 32361) ^ (-1890061699);
                        i5 = -1509675924;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۛ") ^ i2) * (-95);
                        i4 = ((iM45029 ^ i3) * (-25057)) ^ (-1703017596);
                        i5 = -323809655;
                    }
                    break;
                case -482891034:
                case 862875576:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("᩵ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18917)) ^ 2058975933;
                        i5 = -338271856;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * 32361) ^ (-1890061699);
                        i5 = -1509675924;
                    }
                    break;
                case -426234016:
                case 2128419901:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (C19806.m45029("ۗ᩹") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * (-2661)) ^ 330100825;
                        i5 = -61541521;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21189) ^ 1499791331;
                        i5 = 1368990477;
                    }
                    break;
                case -410159276:
                case 1709925384:
                    return obj;
                case 570698903:
                case 1327788150:
                    return obj2;
                case 637687058:
                case 784191982:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2913) ^ (-26511337);
                        i5 = 1670063206;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۛۖ")) * (-35);
                        i4 = ((iM45029 ^ i3) * 10905) ^ (-370367324);
                        i5 = 1996979518;
                    }
                    break;
                case 1463986652:
                case 2085016637:
                    C0817.m3399();
                    return null;
                default:
                    if (C2704.m8255() > 0) {
                        iM45029 = (C19806.m45029("ۗ᩹") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * (-2661)) ^ 330100825;
                        i5 = -61541521;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * 32361) ^ (-1890061699);
                        i5 = -1509675924;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0174 A[PHI: r1 r13
      0x0174: PHI (r1v3 android.content.SharedPreferences) = (r1v2 android.content.SharedPreferences), (r1v1 android.content.SharedPreferences) binds: [B:46:0x0172, B:15:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r13v3 short[]) = (r13v2 short[]), (r13v1 short[]) binds: [B:46:0x0172, B:15:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d1 A[PHI: r21
      0x01d1: PHI (r21v3 boolean) = (r21v2 boolean), (r21v1 boolean), (r21v1 boolean) binds: [B:54:0x01cf, B:50:0x01a8, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0282 A[PHI: r2 r9
      0x0282: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:69:0x0280, B:42:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r9v3 int) = (r9v2 int), (r9v1 int) binds: [B:69:0x0280, B:42:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02b3 A[PHI: r3 r4 r10 r11 r14 r15 r22
      0x02b3: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:73:0x02b1, B:65:0x0260, B:32:0x00d9, B:17:0x0062, B:15:0x005e, B:12:0x0058, B:9:0x0052, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r4v2 l.ۛۧ᩺) = (r4v1 l.ۛۧ᩺), (r4v1 l.ۛۧ᩺), (r4v1 l.ۛۧ᩺), (r4v1 l.ۛۧ᩺), (r4v1 l.ۛۧ᩺), (r4v1 l.ۛۧ᩺), (r4v1 l.ۛۧ᩺), (r4v4 l.ۛۧ᩺) binds: [B:73:0x02b1, B:65:0x0260, B:32:0x00d9, B:17:0x0062, B:15:0x005e, B:12:0x0058, B:9:0x0052, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:73:0x02b1, B:65:0x0260, B:32:0x00d9, B:17:0x0062, B:15:0x005e, B:12:0x0058, B:9:0x0052, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:73:0x02b1, B:65:0x0260, B:32:0x00d9, B:17:0x0062, B:15:0x005e, B:12:0x0058, B:9:0x0052, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r14v2 short[]) = 
      (r14v1 short[])
      (r14v1 short[])
      (r14v1 short[])
      (r14v1 short[])
      (r14v1 short[])
      (r14v1 short[])
      (r14v1 short[])
      (r14v4 short[])
     binds: [B:73:0x02b1, B:65:0x0260, B:32:0x00d9, B:17:0x0062, B:15:0x005e, B:12:0x0058, B:9:0x0052, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v4 int) binds: [B:73:0x02b1, B:65:0x0260, B:32:0x00d9, B:17:0x0062, B:15:0x005e, B:12:0x0058, B:9:0x0052, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r22v5 int) = (r22v4 int), (r22v3 int), (r22v3 int), (r22v3 int), (r22v3 int), (r22v3 int), (r22v3 int), (r22v3 int) binds: [B:73:0x02b1, B:65:0x0260, B:32:0x00d9, B:17:0x0062, B:15:0x005e, B:12:0x0058, B:9:0x0052, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02e9 A[PHI: r7
      0x02e9: PHI (r7v4 short) = (r7v3 short), (r7v1 short) binds: [B:77:0x02e7, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m45989() {
        int iM11306;
        int i;
        int i2;
        boolean zM5579;
        SharedPreferences sharedPreferences = null;
        String strM10423 = null;
        InterfaceC6025 interfaceC6025 = null;
        boolean z = false;
        int i3 = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = -903736185;
        int i10 = C0629.f2722;
        int i11 = C1937.f7317;
        int iM11307 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i11;
        int i12 = ((iM11307 ^ i10) * 32111) ^ (-1649324101);
        int i13 = iM11307 ^ 1846233420;
        int i14 = 0;
        int i15 = 0;
        boolean zM45988 = false;
        int i16 = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * (-21195)) >> 31));
            switch (i9) {
                case -2124240746:
                case -1787269694:
                    i14 = 10;
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i11) * 87;
                        i = ((iM11306 ^ i10) * (-32227)) ^ (-77399619);
                        i2 = 1757323922;
                    } else {
                        iM11306 = C19806.m45029("ܳ᩻") ^ i10;
                        i = ((iM11306 ^ i11) * 5697) ^ 1233688856;
                        i2 = 1428944330;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -2122102821:
                case 1346509454:
                    if (C0671.f2816 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i11) * 87;
                        i = ((iM11306 ^ i10) * (-32227)) ^ (-77399619);
                        i2 = 1757323922;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩵᩹")) * (-11);
                        i = ((iM11306 ^ i11) * 51) ^ 787102530;
                        i2 = 11348117;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -2051553702:
                case 24551407:
                    s = f65985[80];
                    if (C0817.f3443) {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ۖ᩹")) * (-3);
                        i = ((iM11306 ^ i10) * (-10265)) ^ (-810891468);
                        i2 = 1898334135;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ᩴܽ")) * (-123);
                        i = ((iM11306 ^ i10) * 23323) ^ 2027374213;
                        i2 = -297596358;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1962725298:
                case 269469361:
                    zM45988 = m45988(C16737.m39279().getConfiguration());
                    if (C3286.f12186) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩵᩹")) * (-11);
                        i = ((iM11306 ^ i11) * 51) ^ 787102530;
                        i2 = 11348117;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩻") ^ i10;
                        i = ((iM11306 ^ i11) * (-9847)) ^ 154589108;
                        i2 = 948728368;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1829383981:
                case 1978177000:
                    C0050.m946();
                    C1419.m4973();
                    break;
                case -1809078536:
                case 189099982:
                    AbstractC17129.m40007(i3);
                    break;
                case -1652999536:
                case 758266754:
                    if (C10634.m26828(sharedPreferences, strM10423, true)) {
                        int iM11308 = ThreadFactoryC3888.m11306("۫ۖ") ^ i11;
                        i12 = ((iM11308 ^ i10) * 10447) ^ (-1694730745);
                        i13 = iM11308 ^ (-1674837946);
                    } else {
                        int iM45029 = (C19806.m45029("֫ۖ") ^ i10) * 77;
                        i13 = iM45029 ^ (-702048523);
                        i12 = ((iM45029 ^ i11) * 27883) ^ (-33910728);
                    }
                    i15 = 1;
                    break;
                case -1636087840:
                case -14451462:
                    strM10423 = C3535.m10423(sArr, 81, 29, i7);
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֨") ^ i11;
                        i = ((iM11306 ^ i10) * (-22703)) ^ (-1283072166);
                        i2 = 422074247;
                    } else {
                        iM11306 = (C19806.m45029("ۡ᩹") ^ i11) * 27;
                        i = ((iM11306 ^ i10) * (-5353)) ^ (-2081604601);
                        i2 = 1100836583;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1515023200:
                case 721109045:
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("᩵ۨ") ^ i10) * 89;
                        i = ((iM11306 ^ i11) * 2393) ^ 1904706750;
                        i2 = 1805884893;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i11) * 87;
                        i = ((iM11306 ^ i10) * (-32227)) ^ (-77399619);
                        i2 = 1757323922;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1417781150:
                case 1481512926:
                    C3577.m10565();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i11) * 87;
                    i = ((iM11306 ^ i10) * (-32227)) ^ (-77399619);
                    i2 = 1757323922;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1096280422:
                case -8596531:
                    i4 = i16 + 32764176;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֨") ^ i11;
                        i = ((iM11306 ^ i10) * (-22703)) ^ (-1283072166);
                        i2 = 422074247;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i10;
                        i = ((iM11306 ^ i11) * (-5413)) ^ (-1593192112);
                        i2 = 1990623509;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1059075652:
                case -662787968:
                    i3 = 2;
                    iM11306 = (C19806.m45029("ۚۗ") ^ i10) * 115;
                    i = ((iM11306 ^ i11) * 28405) ^ (-751816168);
                    i2 = 784975395;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -795946791:
                case 2005968992:
                    zM5579 = f65990;
                    z = zM5579;
                    iM11306 = (ThreadFactoryC3888.m11306("ۤ᩺") + i10) * 69;
                    i = ((iM11306 ^ i11) * (-5321)) ^ (-294076202);
                    i2 = -793740356;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -795491791:
                case -304905858:
                    f65971 = z;
                    if (z) {
                        iM11306 = (C19806.m45029("᩵֫") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i10) * (-5029)) ^ 1530755025;
                        i2 = -817654481;
                    } else {
                        i3 = i15;
                        iM11306 = (C19806.m45029("ۚۗ") ^ i10) * 115;
                        i = ((iM11306 ^ i11) * 28405) ^ (-751816168);
                        i2 = 784975395;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -333017736:
                case 1158439339:
                    if (i5 - (i6 * i6) < 0) {
                        iM11306 = (i11 - C19806.m45029("᩵۟")) * 39;
                        i = ((iM11306 ^ i10) * 16275) ^ (-785316883);
                        i2 = 83475487;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ܳܺ")) * 25;
                        i = ((iM11306 ^ i11) * (-16881)) ^ (-215387851);
                        i2 = -264014805;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -305243894:
                case 1226444004:
                    i7 = 2716;
                    iM11306 = (i11 - C19806.m45029("ܿۗ")) * 91;
                    i = ((iM11306 ^ i10) * (-7143)) ^ 872005732;
                    i2 = -609963866;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -225118009:
                case 1921471321:
                    C1066.m4023();
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i11) * 87;
                        i = ((iM11306 ^ i10) * (-32227)) ^ (-77399619);
                        i2 = 1757323922;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ᩴܽ")) * (-123);
                        i = ((iM11306 ^ i10) * 23323) ^ 2027374213;
                        i2 = -297596358;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 115823035:
                case 925130769:
                    sharedPreferences = C16737.f53615;
                    sArr = f65985;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("᩵ۨ") ^ i10) * 89;
                        i = ((iM11306 ^ i11) * 2393) ^ 1904706750;
                        i2 = 1805884893;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ۛܶ")) * 15;
                        i = ((iM11306 ^ i10) * (-16929)) ^ (-1736565236);
                        i2 = 819821972;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 132843267:
                case 362256190:
                    i7 = 43216;
                    iM11306 = (i11 - C19806.m45029("ܿۗ")) * 91;
                    i = ((iM11306 ^ i10) * (-7143)) ^ 872005732;
                    i2 = -609963866;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 736161205:
                case 1993499689:
                    f65990 = zM45988;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩵᩹")) * (-11);
                        i = ((iM11306 ^ i11) * 51) ^ 787102530;
                        i2 = 11348117;
                    } else {
                        iM11306 = C19806.m45029("۬᩵") ^ i10;
                        i = ((iM11306 ^ i11) * (-7145)) ^ 209202122;
                        i2 = 361263222;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 1178918054:
                case 1482569727:
                    zM5579 = C1668.m5579(interfaceC6025, RunnableC1606.m5481(sArr2, i8, i14, i7), false);
                    z = zM5579;
                    iM11306 = (ThreadFactoryC3888.m11306("ۤ᩺") + i10) * 69;
                    i = ((iM11306 ^ i11) * (-5321)) ^ (-294076202);
                    i2 = -793740356;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 1307258197:
                case 1849952299:
                    i16 = s * s;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i11) * 87;
                        i = ((iM11306 ^ i10) * (-32227)) ^ (-77399619);
                        i2 = 1757323922;
                    } else {
                        iM11306 = C19806.m45029("ᩴۚ") ^ i10;
                        i = ((iM11306 ^ i11) * (-1095)) ^ (-93171648);
                        i2 = -1379599176;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 1707712964:
                case 2007785280:
                    i5 = i4 + i4;
                    i6 = s + 5724;
                    if (C0216.m1591() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i11) * 87;
                        i = ((iM11306 ^ i10) * (-32227)) ^ (-77399619);
                        i2 = 1757323922;
                    } else {
                        iM11306 = C19806.m45029("ۛᩴ") ^ i11;
                        i = ((iM11306 ^ i10) * (-29575)) ^ 1955902467;
                        i2 = -1364133313;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                default:
                    interfaceC6025 = C16737.f53607;
                    sArr2 = f65985;
                    i8 = UMErrorCode.E_UM_BE_JSON_FAILED;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i11) * 87;
                        i = ((iM11306 ^ i10) * (-32227)) ^ (-77399619);
                        i2 = 1757323922;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("᩻᩷")) * (-15);
                        i = ((iM11306 ^ i10) * (-20613)) ^ (-1071585805);
                        i2 = -1320915561;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
            }
            return;
        }
    }
}
