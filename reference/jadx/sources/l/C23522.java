package l;

import android.content.SharedPreferences;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z43S */
/* JADX INFO: loaded from: classes.dex */
public final class C23522 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f76007;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static ArrayList f76008;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f76009;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C17930 f76010;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f76011;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C14307 f76012;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f76013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList f76014;

    /* JADX INFO: renamed from: ᩹᩷ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f76015;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native List m52705();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native C18300 m52706(C18300 c18300, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m52714(C22941 c22941, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, boolean z, boolean z2, InterfaceC16062 interfaceC16062);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static native synchronized void m52718();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static native synchronized void m52722();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static native List m52723();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52712(EnumC8514 enumC8514) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 982443826;
        int i5 = C1783.f6087;
        int i6 = C20932.f66974;
        int iM2761 = (C0619.m2761("ۙ᩸") + i6) * 5;
        int i7 = ((iM2761 ^ i5) * (-799)) ^ 559835967;
        int i8 = -1271755907;
        while (true) {
            i4 = ((((i4 ^ i5) * (-7259)) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2058785039:
                case -1323169861:
                    C3033.m9845();
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("᩺۫") + i5) * 23;
                        i7 = ((iM2761 ^ i6) * (-30171)) ^ (-1314226379);
                        i8 = 1526033065;
                    } else {
                        iM2761 = C0619.m2761("ܶۤ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-20497)) ^ (-216834626);
                        i8 = -1466517378;
                    }
                    break;
                case -1945576332:
                case -900667417:
                    C2485.m8357();
                    C0950.m3785();
                    break;
                case -1890292988:
                case -737043589:
                    i3 = i + i2;
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0619.m2761("ۧܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-10117)) ^ (-140541713);
                        i8 = -1350206632;
                    } else {
                        iM2761 = (C0619.m2761("᩵᩺") + i5) * 71;
                        i7 = ((iM2761 ^ i6) * 27853) ^ 1253926671;
                        i8 = -123038225;
                    }
                    break;
                case -1748770327:
                case 1742162718:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("ۗۤ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 12549) ^ 1492756233;
                        i8 = 860369677;
                    } else {
                        iM2761 = C0773.m3169("ۙۨ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 13715) ^ 2068233899;
                        i8 = -19035951;
                    }
                    break;
                case -1701737125:
                case 43638741:
                    if (C2702.m8876()) {
                        iM2761 = C0619.m2761("ۤ۬") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-9567)) ^ 675098297;
                        i8 = 758729289;
                    } else {
                        iM2761 = C0619.m2761("ۧܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-10117)) ^ (-140541713);
                        i8 = -1350206632;
                    }
                    break;
                case -1672218852:
                case 1064531119:
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0773.m3169("ۗۤ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 12549) ^ 1492756233;
                        i8 = 860369677;
                    } else {
                        iM2761 = C0619.m2761("ۙ۬") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-6489)) ^ (-172387017);
                        i8 = -570993876;
                    }
                    break;
                case -1550157876:
                case 1286680906:
                    f76010.mo40348(C0619.m2764(i3));
                    iM2761 = C0773.m3169("ۗ֫") ^ i6;
                    i7 = ((iM2761 ^ i5) * 27007) ^ (-1487921625);
                    i8 = -1932064844;
                    break;
                case -1508174203:
                case 92700955:
                    break;
                case -1463611894:
                case 1281828695:
                    i = f76011;
                    i2 = 1;
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0619.m2761("ۧܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-10117)) ^ (-140541713);
                        i8 = -1350206632;
                    } else {
                        iM2761 = (C0773.m3169("᩹ܳ") + i6) * 23;
                        i7 = ((iM2761 ^ i5) * (-20463)) ^ (-200459113);
                        i8 = 202493479;
                    }
                    break;
                case -1335051639:
                case -267745112:
                    C2419.m8174();
                    RunnableC3055.m9933();
                    iM2761 = (C0773.m3169("᩻᩷") + i6) * (-55);
                    i7 = ((iM2761 ^ i5) * 399) ^ 1747449474;
                    i8 = 119159118;
                    break;
                case -1213664763:
                case 1843308306:
                    f76011 = i3;
                    if (C20932.m47848() != 0) {
                        iM2761 = C0619.m2761("ۧܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-10117)) ^ (-140541713);
                        i8 = -1350206632;
                    } else {
                        iM2761 = C0773.m3169("۬᩷") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-22211)) ^ 1492722206;
                        i8 = -1990832574;
                    }
                    break;
                case -1066395788:
                case 1647714089:
                    if (enumC8514.m22827()) {
                        iM2761 = C0773.m3169("ۗ֫") ^ i6;
                        i7 = ((iM2761 ^ i5) * 27007) ^ (-1487921625);
                        i8 = -1932064844;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۗۙ")) * 53;
                        i7 = ((iM2761 ^ i6) * 3913) ^ (-2109783372);
                        i8 = -194014930;
                    }
                    break;
                case -727602514:
                case 1445045078:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("ۗۤ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 12549) ^ 1492756233;
                        i8 = 860369677;
                    } else {
                        iM2761 = (C0619.m2761("᩺ۡ") + i5) * 69;
                        i7 = ((iM2761 ^ i6) * (-17357)) ^ (-274876518);
                        i8 = 129306871;
                    }
                    break;
                case -492685338:
                case -386179765:
                    C1343.m4943();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۗۤ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 12549) ^ 1492756233;
                        i8 = 860369677;
                    } else {
                        iM2761 = (C0773.m3169("᩻᩷") + i6) * (-55);
                        i7 = ((iM2761 ^ i5) * 399) ^ 1747449474;
                        i8 = 119159118;
                    }
                    break;
                case -444672964:
                case 93194141:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0773.m3169("᩺۫") + i5) * 23;
                        i7 = ((iM2761 ^ i6) * (-30171)) ^ (-1314226379);
                        i8 = 1526033065;
                    } else {
                        iM2761 = C0773.m3169("ᩳۖ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 26849) ^ (-683420157);
                        i8 = 1967400858;
                    }
                    break;
                case 122336166:
                case 1464676096:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0773.m3169("᩻᩷") + i6) * (-55);
                        i7 = ((iM2761 ^ i5) * 399) ^ 1747449474;
                        i8 = 119159118;
                    } else {
                        iM2761 = C0619.m2761("ۨۛ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 21073) ^ (-556079346);
                        i8 = -1336043219;
                    }
                    break;
                case 428089701:
                case 905850490:
                    if (C2375.m8065() <= 0) {
                        iM2761 = (C0773.m3169("᩺۫") + i5) * 23;
                        i7 = ((iM2761 ^ i6) * (-30171)) ^ (-1314226379);
                        i8 = 1526033065;
                    } else {
                        iM2761 = (C0773.m3169("᩻᩷") + i6) * (-55);
                        i7 = ((iM2761 ^ i5) * 399) ^ 1747449474;
                        i8 = 119159118;
                    }
                    break;
                default:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ۧܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-10117)) ^ (-140541713);
                        i8 = -1350206632;
                    } else {
                        iM2761 = (C0619.m2761("֫ܳ") + i6) * 79;
                        i7 = ((iM2761 ^ i5) * (-12613)) ^ 1120825014;
                        i8 = -803961185;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m52719() {
        boolean z = false;
        AtomicBoolean atomicBoolean = null;
        boolean z2 = false;
        RuntimeException e = null;
        int i = 57140611;
        int i2 = C3448.f11240;
        int i3 = C0487.f2131;
        int iM2761 = C0619.m2761("᩺֨") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-10197)) ^ (-2021132347);
        int i5 = 1574534832;
        while (true) {
            i = ((((i ^ i3) * 15887) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2104386655:
                case 687413420:
                    atomicBoolean.set(z2);
                    throw e;
                case -2077764058:
                case -1671995988:
                    C4238.m13540();
                    iM2761 = C0773.m3169("ۚ᩺") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-26907)) ^ 154437982;
                    i5 = 458014372;
                    break;
                case -1948552143:
                case 1519150092:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("ᩴܿ") ^ i3) * (-59);
                        i4 = ((iM2761 ^ i2) * 27147) ^ (-828582456);
                        i5 = 185697539;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۜۡ")) * 29;
                        i4 = ((iM2761 ^ i2) * 14113) ^ (-1800715115);
                        i5 = -1127794214;
                    }
                    break;
                case -1915541554:
                case -129138202:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("᩹᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27865)) ^ (-867971999);
                        i5 = -1604478083;
                    } else {
                        iM2761 = (C0773.m3169("۠ۚ") + i3) * 119;
                        i4 = ((iM2761 ^ i2) * (-29405)) ^ 1205901669;
                        i5 = -1812743489;
                    }
                    break;
                case -1819484708:
                case -1565531353:
                    AbstractC0641.m2813();
                    if (C1519.f5300 < 0) {
                        iM2761 = (C0619.m2761("۫ܰ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-9615)) ^ 1043748939;
                        i5 = -1063572443;
                    } else {
                        iM2761 = (C0619.m2761("᩹ܳ") ^ i2) * (-109);
                        i4 = ((iM2761 ^ i3) * 9469) ^ 1724554742;
                        i5 = -1671199214;
                    }
                    break;
                case -1688487644:
                case 1549625987:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0619.m2761("᩹ܳ") ^ i2) * (-109);
                        i4 = ((iM2761 ^ i3) * 9469) ^ 1724554742;
                        i5 = -1671199214;
                    } else {
                        iM2761 = (C0773.m3169("᩹۫") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * 31901) ^ 976830177;
                        i5 = -501973352;
                    }
                    break;
                case -1628604215:
                case 461051517:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("᩹ܳ") ^ i2) * (-109);
                        i4 = ((iM2761 ^ i3) * 9469) ^ 1724554742;
                        i5 = -1671199214;
                    } else {
                        iM2761 = C0619.m2761("᩺᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2523)) ^ 524753165;
                        i5 = -1253739477;
                    }
                    break;
                case -1538638419:
                case 1188970324:
                    if (C3099.m10095()) {
                        iM2761 = (C0619.m2761("۫ܰ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-9615)) ^ 1043748939;
                        i5 = -1063572443;
                    } else {
                        iM2761 = (C0619.m2761("᩻ᩳ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i2) * (-8067)) ^ 142915433;
                        i5 = -1322636572;
                    }
                    break;
                case -1248593800:
                case -1160445363:
                    z = true;
                    atomicBoolean = f76013;
                    if (RunnableC0334.m2063()) {
                        iM2761 = C0773.m3169("ۚ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26907)) ^ 154437982;
                        i5 = 458014372;
                    } else {
                        iM2761 = (C0773.m3169("᩷ᩳ") + i2) * 5;
                        i4 = ((iM2761 ^ i3) * (-10825)) ^ (-212996681);
                        i5 = 1390977389;
                    }
                    break;
                case -1232539642:
                case -449604167:
                    z2 = false;
                    if (atomicBoolean.compareAndSet(false, z)) {
                        iM2761 = C0773.m3169("ܽۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11249)) ^ (-1090593315);
                        i5 = -1548586637;
                    } else {
                        iM2761 = (C0619.m2761("ܰܺ") + i3) * (-29);
                        i4 = ((iM2761 ^ i2) * 16607) ^ (-1019338728);
                        i5 = -1194919065;
                    }
                    break;
                case -1221618873:
                case 224282850:
                    if (C4282.f15546 > 0) {
                        iM2761 = (C0619.m2761("ᩴܿ") ^ i3) * (-59);
                        i4 = ((iM2761 ^ i2) * 27147) ^ (-828582456);
                        i5 = 185697539;
                    } else {
                        iM2761 = C0773.m3169("ۚ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26907)) ^ 154437982;
                        i5 = 458014372;
                    }
                    break;
                case -1221026682:
                case 660118986:
                    C0619.m2763();
                    if (!C2966.m9664()) {
                        iM2761 = (C0619.m2761("᩹ܳ") ^ i2) * (-109);
                        i4 = ((iM2761 ^ i3) * 9469) ^ 1724554742;
                        i5 = -1671199214;
                    } else {
                        iM2761 = C0773.m3169("ۚ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26907)) ^ 154437982;
                        i5 = 458014372;
                    }
                    break;
                case -1169469974:
                case 1274751633:
                    try {
                        C5261.f18538.execute(new RunnableC19792(0));
                        iM2761 = (C0619.m2761("ۧ᩶") ^ i2) * 75;
                        i4 = ((iM2761 ^ i3) * 12377) ^ (-1095833056);
                        i5 = 1210988626;
                    } catch (RuntimeException e2) {
                        e = e2;
                        iM2761 = C0773.m3169("ۖ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4169) ^ (-479165019);
                        i5 = -1780480401;
                    }
                    break;
                case -857957258:
                case 1561298865:
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0619.m2761("ᩴܿ") ^ i3) * (-59);
                        i4 = ((iM2761 ^ i2) * 27147) ^ (-828582456);
                        i5 = 185697539;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11571)) ^ 943754773;
                        i5 = -281266575;
                    }
                    break;
                case -757979421:
                case 1341385637:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۚ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26907)) ^ 154437982;
                        i5 = 458014372;
                    } else {
                        iM2761 = (C0773.m3169("֡۬") + i2) * 77;
                        i4 = ((iM2761 ^ i3) * (-30933)) ^ 925497646;
                        i5 = -1732612023;
                    }
                    break;
                case -699266855:
                case -522839999:
                    return;
                case -613836569:
                case 277053710:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("᩹ܳ") ^ i2) * (-109);
                        i4 = ((iM2761 ^ i3) * 9469) ^ 1724554742;
                        i5 = -1671199214;
                    } else {
                        iM2761 = (C0773.m3169("᩷֨") ^ i3) * 43;
                        i4 = ((iM2761 ^ i2) * 30263) ^ (-1098992459);
                        i5 = -1077351642;
                    }
                    break;
                case 205330268:
                case 291221268:
                    C1321.m4852();
                    C1146.m4231();
                    return;
                case 1163347633:
                case 1816302802:
                    return;
                default:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("᩹᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27865)) ^ (-867971999);
                        i5 = -1604478083;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩵") ^ i2) * (-29);
                        i4 = ((iM2761 ^ i3) * (-18399)) ^ 2114334045;
                        i5 = 1249940995;
                    }
                    break;
            }
        }
    }

    static {
        ApplicationC23172.m52091(168);
        f76015 = new short[]{1811, -11499, -11511, -11504, -11518, -11508, -11509, -11498, 3970, -15897, -15876, -15901, -15900, -15876, -15902, -15899, -15876, -15902, -15899, -15876, -15901, -15894, -15876, -15902, -15894, -15876, -15901, -15893, -15901, -15902, -15901, -15901, -15901, -15904, -15901, -15904, -15970, -15901, -15903, -15901, -15898, -15901, -15897, -15901, -15900, 22229, 23117, -25735, -20308, 22528, 22001, 3437, -25379, -27823, 19800, 20752, 22602, 22577, 17221, -24533, -21454, -20057, 20345, -18069, -26631, 17302, -28495, -13315, -13418, -13429, -13409, -13369, -13429, -13348, -13337, -13429, -13316, -13319, -13317, -13315, -13418, -13429, -13409, -13369, -13429, -13348, -13337, -13429, -13316, -13319, -13432, -13317, -13428, -13315, -13418, -13429, -13409, -13369, -13429, -13348, -13337, -13429, -13316, -13319, -13317, -20734, -26351, 18105, -16799, 23101, 22649, 7237, 18943, 18931, 18940, 18939, 18932, 18935, 18913, 18918, 18876, 18936, 18913, 18941, 18940, -9729, 12019, -12625, 18840, 2003, 15286, 15257, 15248, 15252, 15239, 15317, 15249, 15252, 15233, 15252, 15311, 15317, 15251, 15260, 15257, 15248, 15238, 9868, 17824, 17852, 17829, 17847, 17849, 17854, 3778, 20790, 20753, 20748, 20747, 20766, 20755, 20755, 20758, 20753, 20760, 20817, 20817, 20817, 20831, 20764, 20752, 20763, 20762, 20817, 20757, 20766, 20749, 20755, 20758, 20765, 20748, 20816, 20817, 20757, 20766, 20745, 20766, 20748, 20749, 20764, 20816, 20764, 20752, 20754, 20751, 20758, 20755, 20762, 20766, 20748, 20748, 20762, 20747, 20748, 20816, 20817, 20754, 20747, 20755, 20748, 20749, 20764, 20755, 20758, 20765, 20748, 20764, 20755, 20766, 20748, 20748, 20762, 20748, 20748, 20749, 20764, 20817, 20757, 20766, 20749, 20771, 20765, 20766, 20753, 20763, 20749, 20752, 20758, 20763, 20771, 20817, 20748, 20746, 20751, 20751, 20752, 20749, 20747, 20771, 20817, 20766, 20753, 20753, 20752, 20747, 20766, 20747, 20758, 20752, 20753, 20771, 20817, 20766, 20753, 20763, 20749, 20752, 20758, 20763, 20743, 20817, 20766, 20753, 20753, 20752, 20747, 20766, 20747, 20758, 20752, 20753, 20817, 20771, 20765, 20786, 20779, 20783, 20755, 20746, 20760, 20758, 20753, 20796, 20752, 20753, 20747, 20762, 20743, 20747, 20771, 20765, 20783, 20755, 20746, 20760, 20758, 20753, 20796, 20752, 20753, 20747, 20762, 20743, 20747, 20764, 20752, 20763, 20762, 20768, 20751, 20766, 20747, 20764, 20759, 20751, 20755, 20746, 20760, 20758, 20753, 20817, 20754, 20747, 20751, 20761, 20758, 20755, 20762, 20748, 20790, 20753, 20748, 20747, 20766, 20755, 20755, 20831, 20761, 20766, 20758, 20755, 20817, 20831, 20823, 20786, 20752, 20745, 20762, 20831, 20763, 20758, 20749, 20822, 20780, 20746, 20764, 20764, 20762, 20748, 20748, 20761, 20746, 20755, 20831, 20758, 20753, 20748, 20747, 20766, 20755, 20755, 20766, 20747, 20758, 20752, 20753, 20817, 4350, -16880, -16853, -16852, -16853, -16842, -16847, -16860, -16855, -16855, -16769, -16795, 3421, 29130, 29170, 29168, 29153, 29126, 29181, 29172, 29159, 29168, 29169, 29125, 29159, 29168, 29171, 29168, 29159, 29168, 29179, 29174, 29168, 29158, 29117, 29115, 29115, 29115, 29116, 5371, 27103, 27091, 27096, 27097, 27103, 27091, 27096, 27097, 27107, 27084, 27101, 27080, 27103, 27092, 27084, 27088, 27081, 27099, 27093, 27090, 27026, 27089, 27080, 27084, 27121, 27128, 27017, 27036, 27103, 27092, 27101, 27090, 27099, 27097, 27096, 27014, 27036, 3877, -30136, 1864, 31899, 31879, 31902, 31884, 31874, 31877, 31940};
        AbstractC22044 abstractC22044 = null;
        String strM4939 = null;
        ArrayList arrayList = null;
        C17930 c17930 = null;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short[] sArr = null;
        int i3 = 0;
        int i4 = 465478263;
        int i5 = C1519.f5300;
        int i6 = C0950.f3488;
        int iM3169 = C0773.m3169("᩷۬") ^ i6;
        int i7 = ((iM3169 ^ i5) * (-4495)) ^ 1632124951;
        int i8 = 1940257422;
        while (true) {
            i4 = ((((i4 ^ i5) * (-26885)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2123717705:
                case 264403683:
                    C2878.m9491();
                    RunnableC0334.m2063();
                    iM3169 = C0619.m2761("ۖۜ") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-27499)) ^ (-1978362282);
                    i8 = -745784942;
                    break;
                case -1724261872:
                case 303594696:
                    if (i - ((s * s) + 288116676) > 0) {
                        iM3169 = C0619.m2761("ۨۜ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-6283)) ^ 831495153;
                        i8 = 306600662;
                    } else {
                        iM3169 = (C0773.m3169("ܳ֫") ^ i6) * 93;
                        i7 = ((iM3169 ^ i5) * 21325) ^ (-1158518849);
                        i8 = 435794680;
                    }
                    break;
                case -1668802055:
                case -75246833:
                    if (C1826.f6190 > 0) {
                        iM3169 = (C0619.m2761("᩶۠") ^ i5) * 9;
                        i7 = ((iM3169 ^ i6) * 1287) ^ (-704171357);
                        i8 = 1510055946;
                    } else {
                        iM3169 = C0619.m2761("ۖۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-27499)) ^ (-1978362282);
                        i8 = -745784942;
                    }
                    break;
                case -1560700002:
                case 1801465541:
                    abstractC22044 = C6382.f21568;
                    sArr = f76015;
                    i3 = 1;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۖ᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * 925) ^ 544775606;
                        i8 = -1604549721;
                    } else {
                        iM3169 = C0773.m3169("ܽܳ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-27417)) ^ 741445318;
                        i8 = -1979624560;
                    }
                    break;
                case -1504260161:
                case 441389317:
                    f76014 = new ArrayList();
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۖ᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * 925) ^ 544775606;
                        i8 = -1604549721;
                    } else {
                        iM3169 = (C0619.m2761("ۢᩴ") + i5) * 53;
                        i7 = ((iM3169 ^ i6) * (-28905)) ^ 70449368;
                        i8 = -1758426422;
                    }
                    break;
                case -1277770960:
                case 2087762656:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("ۤ᩵") + i6) * 79;
                        i7 = ((iM3169 ^ i5) * (-23727)) ^ 858423386;
                        i8 = 976581930;
                    } else {
                        iM3169 = (C0619.m2761("᩶۠") ^ i5) * 9;
                        i7 = ((iM3169 ^ i6) * 1287) ^ (-704171357);
                        i8 = 1510055946;
                    }
                    break;
                case -1088517464:
                case -748342487:
                    i = 33948 * s;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("۟ܶ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 27601) ^ 1071798964;
                        i8 = 1822986040;
                    } else {
                        iM3169 = C0773.m3169("ܶܿ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-22681)) ^ (-1270871186);
                        i8 = -848950722;
                    }
                    break;
                case -1084417655:
                case 1502113668:
                    f76011 = 0;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("ۤ᩵") + i6) * 79;
                        i7 = ((iM3169 ^ i5) * (-23727)) ^ 858423386;
                        i8 = 976581930;
                    } else {
                        f76010 = new C17930(C0773.m3159(0));
                        c17930 = C7023.f23168;
                        if (C11235.f35427 >= 0) {
                            iM3169 = (C0619.m2761("᩶۠") ^ i5) * 9;
                            i7 = ((iM3169 ^ i6) * 1287) ^ (-704171357);
                            i8 = 1510055946;
                        } else {
                            iM3169 = C0773.m3169("۬ۙ") ^ i6;
                            i7 = ((iM3169 ^ i5) * (-31507)) ^ 887969204;
                            i8 = -1988440579;
                        }
                    }
                    break;
                case -851962339:
                case 1349251455:
                    i2 = 45209;
                    iM3169 = C0619.m2761("ܳۡ") ^ i6;
                    i7 = ((iM3169 ^ i5) * 28821) ^ 1704039866;
                    i8 = -62169369;
                    break;
                case -460498953:
                case 1476855814:
                    s = f76015[0];
                    if (C1519.m5403()) {
                        iM3169 = C0619.m2761("᩵᩻") ^ i6;
                        i7 = ((iM3169 ^ i5) * 30765) ^ 1162094160;
                        i8 = 674648610;
                    } else {
                        iM3169 = (C0619.m2761("᩶۠") ^ i5) * 9;
                        i7 = ((iM3169 ^ i6) * 1287) ^ (-704171357);
                        i8 = 1510055946;
                    }
                    break;
                case -350409198:
                case 1397819284:
                    f76007 = C0269.m1774(abstractC22044, strM4939);
                    arrayList = new ArrayList();
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0773.m3169("ۖ᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * 925) ^ 544775606;
                        i8 = -1604549721;
                    } else {
                        iM3169 = (i6 - C0773.m3169("᩻ۗ")) * (-117);
                        i7 = ((iM3169 ^ i5) * (-29653)) ^ 2095740725;
                        i8 = -1926065225;
                    }
                    break;
                case -214863780:
                case 224136828:
                    i2 = 54117;
                    iM3169 = C0619.m2761("ܳۡ") ^ i6;
                    i7 = ((iM3169 ^ i5) * 28821) ^ 1704039866;
                    i8 = -62169369;
                    break;
                case 20086785:
                case 2132999674:
                    if (!C2702.m8876()) {
                        iM3169 = C0773.m3169("۟ܶ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 27601) ^ 1071798964;
                        i8 = 1822986040;
                    } else {
                        iM3169 = (C0773.m3169("ۤ᩵") + i6) * 79;
                        i7 = ((iM3169 ^ i5) * (-23727)) ^ 858423386;
                        i8 = 976581930;
                    }
                    break;
                case 508659388:
                case 1268250798:
                    c17930.m40351((InterfaceC16438) new C22776());
                    return;
                case 779897047:
                case 1151825272:
                    C4282.m13644();
                    C3734.m12152();
                    throw new RuntimeException();
                case 804508791:
                case 1740388711:
                    f76008 = arrayList;
                    f76012 = new C14307();
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۖۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-27499)) ^ (-1978362282);
                        i8 = -745784942;
                    } else {
                        iM3169 = (C0773.m3169("ۨܳ") ^ i6) * (-63);
                        i7 = ((iM3169 ^ i5) * (-12339)) ^ 1491947522;
                        i8 = -703111006;
                    }
                    break;
                case 1434395705:
                case 1930742268:
                    strM4939 = C1343.m4939(sArr, i3, 7, i2);
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("۟ܶ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 27601) ^ 1071798964;
                        i8 = 1822986040;
                    } else {
                        iM3169 = C0773.m3169("᩵ۛ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-14423)) ^ 890801243;
                        i8 = 878740779;
                    }
                    break;
                default:
                    f76009 = true;
                    f76013 = new AtomicBoolean();
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("۟ܶ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 27601) ^ 1071798964;
                        i8 = 1822986040;
                    } else {
                        iM3169 = (C0773.m3169("᩸۠") ^ i5) * (-29);
                        i7 = ((iM3169 ^ i6) * (-27519)) ^ (-1414672508);
                        i8 = 295603884;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01f4 A[PHI: r10 r13 r17
      0x01f4: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:58:0x01f2, B:33:0x00ec, B:14:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f4: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:58:0x01f2, B:33:0x00ec, B:14:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f4: PHI (r17v22 int) = (r17v9 int), (r17v17 int), (r17v23 int) binds: [B:58:0x01f2, B:33:0x00ec, B:14:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022f A[PHI: r1 r8 r9 r12 r17
      0x022f: PHI (r1v3 android.app.Application) = (r1v1 android.app.Application), (r1v2 android.app.Application), (r1v1 android.app.Application) binds: [B:62:0x022d, B:37:0x0110, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:62:0x022d, B:37:0x0110, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:62:0x022d, B:37:0x0110, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r12v3 short[]) = (r12v1 short[]), (r12v2 short[]), (r12v1 short[]) binds: [B:62:0x022d, B:37:0x0110, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r17v24 int) = (r17v8 int), (r17v16 int), (r17v27 int) binds: [B:62:0x022d, B:37:0x0110, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x027d A[PHI: r3 r5 r6 r7 r17 r18
      0x027d: PHI (r3v3 java.lang.StringBuilder) = 
      (r3v1 java.lang.StringBuilder)
      (r3v1 java.lang.StringBuilder)
      (r3v2 java.lang.StringBuilder)
      (r3v1 java.lang.StringBuilder)
     binds: [B:67:0x027b, B:43:0x013f, B:25:0x00a1, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char), (r5v1 char) binds: [B:67:0x027b, B:43:0x013f, B:25:0x00a1, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r6v2 short) = (r6v1 short), (r6v1 short), (r6v1 short), (r6v5 short) binds: [B:67:0x027b, B:43:0x013f, B:25:0x00a1, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r7v2 short) = (r7v1 short), (r7v1 short), (r7v1 short), (r7v5 short) binds: [B:67:0x027b, B:43:0x013f, B:25:0x00a1, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r17v28 int) = (r17v7 int), (r17v15 int), (r17v19 int), (r17v32 int) binds: [B:67:0x027b, B:43:0x013f, B:25:0x00a1, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r18v3 android.content.SharedPreferences$Editor) = 
      (r18v1 android.content.SharedPreferences$Editor)
      (r18v2 android.content.SharedPreferences$Editor)
      (r18v1 android.content.SharedPreferences$Editor)
      (r18v1 android.content.SharedPreferences$Editor)
     binds: [B:67:0x027b, B:43:0x013f, B:25:0x00a1, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b2 A[PHI: r2 r4 r17
      0x02b2: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v2 java.lang.String), (r2v1 java.lang.String) binds: [B:71:0x02b0, B:29:0x00cb, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:71:0x02b0, B:29:0x00cb, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r17v25 int) = (r17v6 int), (r17v18 int), (r17v26 int) binds: [B:71:0x02b0, B:29:0x00cb, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (l.C2702.f8586 > 0) goto L14;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52725(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23522.m52725(java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0359 A[PHI: r1 r3 r5 r10 r15 r19 r20
      0x0359: PHI (r1v15 int) = (r1v8 int), (r1v9 int), (r1v10 int), (r1v16 int) binds: [B:77:0x0357, B:73:0x0331, B:69:0x030b, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r3v10 int) = (r3v4 int), (r3v5 int), (r3v6 int), (r3v11 int) binds: [B:77:0x0357, B:73:0x0331, B:69:0x030b, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r5v18 l.᩷ۨᩴ) = (r5v8 l.᩷ۨᩴ), (r5v9 l.᩷ۨᩴ), (r5v10 l.᩷ۨᩴ), (r5v19 l.᩷ۨᩴ) binds: [B:77:0x0357, B:73:0x0331, B:69:0x030b, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r10v14 int) = (r10v7 int), (r10v8 int), (r10v9 int), (r10v15 int) binds: [B:77:0x0357, B:73:0x0331, B:69:0x030b, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r15v17 short[]) = (r15v10 short[]), (r15v11 short[]), (r15v12 short[]), (r15v18 short[]) binds: [B:77:0x0357, B:73:0x0331, B:69:0x030b, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r19v11 l.᩸ܽܺ) = (r19v5 l.᩸ܽܺ), (r19v6 l.᩸ܽܺ), (r19v7 l.᩸ܽܺ), (r19v12 l.᩸ܽܺ) binds: [B:77:0x0357, B:73:0x0331, B:69:0x030b, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r20v11 short) = (r20v5 short), (r20v6 short), (r20v7 short), (r20v12 short) binds: [B:77:0x0357, B:73:0x0331, B:69:0x030b, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52713(AbstractC22044 abstractC22044, boolean z, boolean z2, InterfaceC16062 interfaceC16062) throws Throwable {
        AbstractC22044 abstractC22045;
        int i;
        int i2;
        C22941 c22941;
        short s;
        int i3;
        short[] sArr;
        int iM2761;
        int i4;
        int i5;
        short s2;
        AbstractC22044 abstractC22046;
        int i6;
        C22941 c22942;
        short s3;
        int i7;
        short[] sArr2;
        int iM3169;
        int i8;
        int i9;
        int i10 = C4238.f15451;
        int i11 = C3099.f10023;
        int iM2762 = C0619.m2761("ܽ۬") ^ i10;
        int i12 = ((iM2762 ^ i11) * 4027) ^ (-1184885474);
        C22941 c22943 = null;
        C22941 c22944 = null;
        Throwable th = null;
        short[] sArr3 = null;
        int i13 = iM2762 ^ (-762775867);
        int i14 = -74421043;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s4 = 0;
        int i18 = 0;
        C22941 c22945 = null;
        AbstractC22044 abstractC22044M47850 = null;
        AbstractC22044 abstractC22047 = null;
        while (true) {
            i14 = i13 ^ (i12 & (((i14 ^ i11) * 16419) >> 31));
            switch (i14) {
                case -2121071113:
                case -771104026:
                    i17 = 17872;
                    int iM31610 = C0773.m3169("ܺᩳ") ^ i10;
                    i15 = i15;
                    i16 = i16;
                    sArr3 = sArr3;
                    i14 = i14;
                    c22943 = c22943;
                    s4 = s4;
                    i13 = iM31610 ^ (-2081274166);
                    i12 = ((iM31610 ^ i11) * 19949) ^ (-196245885);
                    abstractC22047 = abstractC22047;
                    break;
                case -2083586120:
                case -744968150:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    if (C23916.f77426 > 0) {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i11;
                        i4 = ((iM2761 ^ i10) * (-25677)) ^ 2135461583;
                        i5 = -1110811535;
                        int i19 = iM2761 ^ i5;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i16 = i3;
                        sArr3 = sArr;
                        c22943 = c22941;
                        s4 = s;
                        i13 = i19;
                        i12 = i4;
                        i15 = i;
                    } else {
                        s2 = s;
                        iM3169 = C0773.m3169("ۧ᩵") ^ i10;
                        i8 = ((iM3169 ^ i11) * 3305) ^ 1496044352;
                        i9 = 587339074;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i13 = iM3169 ^ i9;
                        sArr3 = sArr;
                        i14 = i14;
                        s4 = s2;
                        i15 = i;
                        i12 = i8;
                        i16 = i3;
                        c22943 = c22941;
                    }
                    break;
                case -1952224001:
                case -1248086085:
                    C1542.m5459();
                    C0487.m2356();
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    iM2761 = C0773.m3169("ᩴۙ") ^ i10;
                    i4 = ((iM2761 ^ i11) * (-27833)) ^ (-1005198108);
                    i5 = -756735640;
                    int i110 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i110;
                    i12 = i4;
                    i15 = i;
                    break;
                case -1783244795:
                case -509427220:
                    RunnableC3055.m9933();
                    if (C2878.m9491() <= 0) {
                        abstractC22045 = abstractC22047;
                        i = i15;
                        i2 = i17;
                        c22941 = c22943;
                        s = s4;
                        i3 = i16;
                        sArr = sArr3;
                        iM2761 = C0773.m3169("ܶᩴ") ^ i11;
                        i4 = ((iM2761 ^ i10) * 29283) ^ (-621841115);
                        i5 = 380723872;
                        int i111 = iM2761 ^ i5;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i16 = i3;
                        sArr3 = sArr;
                        c22943 = c22941;
                        s4 = s;
                        i13 = i111;
                        i12 = i4;
                        i15 = i;
                    }
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    iM2761 = C0773.m3169("ᩴۙ") ^ i10;
                    i4 = ((iM2761 ^ i11) * (-27833)) ^ (-1005198108);
                    i5 = -756735640;
                    int i112 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i112;
                    i12 = i4;
                    i15 = i;
                    break;
                case -1539994940:
                case 1739196971:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    i18 = (s * s) + 302168689;
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0773.m3169("᩷۫") + i11) * (-79);
                        i4 = ((iM2761 ^ i10) * 14963) ^ 1502600451;
                        i5 = -227580979;
                        int i113 = iM2761 ^ i5;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i16 = i3;
                        sArr3 = sArr;
                        c22943 = c22941;
                        s4 = s;
                        i13 = i113;
                        i12 = i4;
                        i15 = i;
                    } else {
                        i15 = i;
                        i16 = i3;
                        sArr3 = sArr;
                        int iM31611 = (C0773.m3169("ۢ۟") + i10) * 63;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i14 = i14;
                        c22943 = c22941;
                        s4 = s;
                        i13 = iM31611 ^ 1601316335;
                        i12 = ((iM31611 ^ i11) * 31711) ^ (-1024775742);
                    }
                    break;
                case -1472436747:
                case 1031327187:
                    C2834.m9344();
                    if (AbstractC0116.f1064 > 0) {
                        abstractC22045 = abstractC22047;
                        i = i15;
                        i2 = i17;
                        c22941 = c22943;
                        s = s4;
                        i3 = i16;
                        sArr = sArr3;
                        iM2761 = (i11 - C0619.m2761("ܰۧ")) * 85;
                        i4 = ((iM2761 ^ i10) * 28049) ^ (-109577482);
                        i5 = -656178108;
                        int i114 = iM2761 ^ i5;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i16 = i3;
                        sArr3 = sArr;
                        c22943 = c22941;
                        s4 = s;
                        i13 = i114;
                        i12 = i4;
                        i15 = i;
                    }
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    iM2761 = C0773.m3169("ᩴۙ") ^ i10;
                    i4 = ((iM2761 ^ i11) * (-27833)) ^ (-1005198108);
                    i5 = -756735640;
                    int i115 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i115;
                    i12 = i4;
                    i15 = i;
                    break;
                case -1376644517:
                case 2051327885:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    if (C2834.m9344() < 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i10;
                        i4 = ((iM2761 ^ i11) * 32605) ^ 628261493;
                        i5 = 1697605823;
                        int i116 = iM2761 ^ i5;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i16 = i3;
                        sArr3 = sArr;
                        c22943 = c22941;
                        s4 = s;
                        i13 = i116;
                        i12 = i4;
                        i15 = i;
                    } else {
                        i15 = i;
                        i16 = i3;
                        sArr3 = sArr;
                        int iM31612 = (C0773.m3169("ۢ۟") + i10) * 63;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i14 = i14;
                        c22943 = c22941;
                        s4 = s;
                        i13 = iM31612 ^ 1601316335;
                        i12 = ((iM31612 ^ i11) * 31711) ^ (-1024775742);
                    }
                    break;
                case -1207287196:
                case -59228713:
                    C3492.m11480(c22945);
                    C17202.m40378(abstractC22044M47850);
                    return;
                case -982368495:
                case 533725182:
                    abstractC22046 = abstractC22047;
                    i = i15;
                    i6 = i17;
                    c22942 = c22943;
                    s3 = s4;
                    i7 = i16;
                    sArr2 = sArr3;
                    try {
                        try {
                            C22941 c22946 = new C22941(abstractC22044);
                            int iM2763 = (C0619.m2761("֡ۢ") ^ i11) * (-63);
                            int i20 = ((iM2763 ^ i10) * 18971) ^ (-2064684882);
                            i13 = iM2763 ^ 1760793423;
                            c22945 = c22946;
                            i17 = i6;
                            i12 = i20;
                            i16 = i7;
                            sArr3 = sArr2;
                            c22943 = c22942;
                            s4 = s3;
                            abstractC22047 = abstractC22046;
                            i15 = i;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            c22944 = c22942;
                            c22945 = null;
                            int iM2764 = C0619.m2761("᩸۟") ^ i10;
                            i17 = i6;
                            i15 = i;
                            i16 = i7;
                            sArr3 = sArr2;
                            i14 = i14;
                            c22943 = c22942;
                            s4 = s3;
                            abstractC22047 = abstractC22046;
                            i13 = iM2764 ^ (-843255746);
                            i12 = ((iM2764 ^ i11) * 14571) ^ (-1198539545);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    break;
                case -810467718:
                case -117755293:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    if (C4282.m13644()) {
                        iM2761 = (C0619.m2761("۠ۚ") + i10) * 31;
                        i4 = ((iM2761 ^ i11) * (-12951)) ^ 2089262992;
                        i5 = 1073872927;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ܰۧ")) * 85;
                        i4 = ((iM2761 ^ i10) * 28049) ^ (-109577482);
                        i5 = -656178108;
                    }
                    int i117 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i117;
                    i12 = i4;
                    i15 = i;
                    break;
                case -698349068:
                case -574831835:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    sArr = sArr3;
                    i2 = i17;
                    c22941 = c22943;
                    i3 = i16;
                    s2 = f76015[147];
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ۧ᩵") ^ i10;
                        i8 = ((iM3169 ^ i11) * 3305) ^ 1496044352;
                        i9 = 587339074;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩶") ^ i11;
                        i8 = ((iM3169 ^ i10) * 26333) ^ 1239578751;
                        i9 = -60318147;
                    }
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i13 = iM3169 ^ i9;
                    sArr3 = sArr;
                    i14 = i14;
                    s4 = s2;
                    i15 = i;
                    i12 = i8;
                    i16 = i3;
                    c22943 = c22941;
                    break;
                case -589587961:
                case 893747610:
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    AbstractC22044 abstractC22048 = C6382.f21568;
                    sArr3 = f76015;
                    i16 = 148;
                    i15 = 6;
                    if (C3448.f11240 >= 0) {
                        abstractC22045 = abstractC22048;
                        int iM31613 = (C0773.m3169("ۢ۟") + i10) * 63;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i14 = i14;
                        c22943 = c22941;
                        s4 = s;
                        i13 = iM31613 ^ 1601316335;
                        i12 = ((iM31613 ^ i11) * 31711) ^ (-1024775742);
                    } else {
                        int iM2765 = (C0619.m2761("ܿ᩶") ^ i10) * 13;
                        i17 = i2;
                        i14 = i14;
                        c22943 = c22941;
                        s4 = s;
                        abstractC22047 = abstractC22048;
                        i12 = ((iM2765 ^ i11) * (-15693)) ^ (-883382040);
                        i13 = iM2765 ^ 1719978545;
                    }
                    break;
                case -578461893:
                case 910799931:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i11 - C0619.m2761("ܰۧ")) * 85;
                        i4 = ((iM2761 ^ i10) * 28049) ^ (-109577482);
                        i5 = -656178108;
                    } else {
                        iM2761 = (C0773.m3169("۠ܿ") ^ i11) * 81;
                        i4 = ((iM2761 ^ i10) * 4889) ^ 1564551065;
                        i5 = 1045394643;
                    }
                    int i118 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i118;
                    i12 = i4;
                    i15 = i;
                    break;
                case -442786475:
                case 1891766157:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i11 - C0619.m2761("ܰۧ")) * 85;
                        i4 = ((iM2761 ^ i10) * 28049) ^ (-109577482);
                        i5 = -656178108;
                    } else {
                        iM2761 = C0619.m2761("᩹ۗ") ^ i10;
                        i4 = ((iM2761 ^ i11) * (-21135)) ^ 1680948801;
                        i5 = 1798396268;
                    }
                    int i119 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i119;
                    i12 = i4;
                    i15 = i;
                    break;
                case -328515666:
                case 1323524568:
                    if (C1826.m6301() < 0) {
                        abstractC22045 = abstractC22047;
                        i2 = i17;
                        c22941 = c22943;
                        s = s4;
                        int iM31614 = (C0773.m3169("ۢ۟") + i10) * 63;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i14 = i14;
                        c22943 = c22941;
                        s4 = s;
                        i13 = iM31614 ^ 1601316335;
                        i12 = ((iM31614 ^ i11) * 31711) ^ (-1024775742);
                    } else {
                        abstractC22045 = abstractC22047;
                        i = i15;
                        i2 = i17;
                        c22941 = c22943;
                        s = s4;
                        i3 = i16;
                        sArr = sArr3;
                        iM2761 = C0773.m3169("ᩴۙ") ^ i10;
                        i4 = ((iM2761 ^ i11) * (-27833)) ^ (-1005198108);
                        i5 = -756735640;
                        int i1110 = iM2761 ^ i5;
                        i17 = i2;
                        abstractC22047 = abstractC22045;
                        i16 = i3;
                        sArr3 = sArr;
                        c22943 = c22941;
                        s4 = s;
                        i13 = i1110;
                        i12 = i4;
                        i15 = i;
                    }
                    break;
                case -285394051:
                case 1326056055:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    if (i18 - (34766 * s) < 0) {
                        iM2761 = (i11 - C0619.m2761("ܺۨ")) * (-51);
                        i4 = ((iM2761 ^ i10) * 30775) ^ (-1459700260);
                        i5 = 503308112;
                    } else {
                        iM2761 = (i10 - C0773.m3169("ۡۙ")) * (-37);
                        i4 = ((iM2761 ^ i11) * 1505) ^ 608692604;
                        i5 = 372309372;
                    }
                    int i1111 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i1111;
                    i12 = i4;
                    i15 = i;
                    break;
                case 196440065:
                case 1615399714:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("ᩴۙ") ^ i10;
                        i4 = ((iM2761 ^ i11) * (-27833)) ^ (-1005198108);
                        i5 = -756735640;
                    } else {
                        iM2761 = C0773.m3169("ܳܳ") ^ i10;
                        i4 = ((iM2761 ^ i11) * (-24149)) ^ (-2141385068);
                        i5 = 1795889260;
                    }
                    int i1112 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i1112;
                    i12 = i4;
                    i15 = i;
                    break;
                case 382894351:
                case 2064184944:
                    C3492.m11480(c22944);
                    C3734.m12147(abstractC22044M47850);
                    throw th;
                case 567401239:
                case 770732831:
                    AbstractC22044 abstractC22049 = abstractC22047;
                    int i21 = i15;
                    int i22 = i16;
                    int i23 = i17;
                    short s5 = s4;
                    short[] sArr4 = sArr3;
                    abstractC22044M47850 = C20932.m47850(C2310.m7806(abstractC22049, C3448.m11252(sArr4, i22, i21, i23)));
                    int iM2766 = (i11 - C0619.m2761("ۛ᩷")) * 23;
                    int i24 = ((iM2766 ^ i10) * 19881) ^ (-390362168);
                    i17 = i23;
                    abstractC22047 = abstractC22049;
                    i13 = iM2766 ^ (-258935144);
                    sArr3 = sArr4;
                    i14 = i14;
                    s4 = s5;
                    i15 = i21;
                    c22943 = null;
                    i12 = i24;
                    i16 = i22;
                    break;
                case 653029395:
                case 2052704232:
                    i17 = 35359;
                    int iM31615 = C0773.m3169("ܺᩳ") ^ i10;
                    i15 = i15;
                    i16 = i16;
                    sArr3 = sArr3;
                    i14 = i14;
                    c22943 = c22943;
                    s4 = s4;
                    i13 = iM31615 ^ (-2081274166);
                    i12 = ((iM31615 ^ i11) * 19949) ^ (-196245885);
                    abstractC22047 = abstractC22047;
                    break;
                case 726517096:
                case 1062403004:
                    i = i15;
                    c22942 = c22943;
                    i7 = i16;
                    s3 = s4;
                    sArr2 = sArr3;
                    abstractC22046 = abstractC22047;
                    i6 = i17;
                    try {
                        m52714(c22945, abstractC22044, abstractC22044M47850, z, z2, interfaceC16062);
                        int iM31616 = (i11 - C0773.m3169("᩵۟")) * 11;
                        i13 = 924125059 ^ iM31616;
                        i17 = i6;
                        i15 = i;
                        i12 = ((iM31616 ^ i10) * 3081) ^ (-512335658);
                        i16 = i7;
                        sArr3 = sArr2;
                        i14 = i14;
                        c22943 = c22942;
                        s4 = s3;
                        abstractC22047 = abstractC22046;
                    } catch (Throwable th4) {
                        th = th4;
                        c22944 = c22945;
                        int iM2767 = C0619.m2761("᩸۟") ^ i10;
                        i17 = i6;
                        i15 = i;
                        i16 = i7;
                        sArr3 = sArr2;
                        i14 = i14;
                        c22943 = c22942;
                        s4 = s3;
                        abstractC22047 = abstractC22046;
                        i13 = iM2767 ^ (-843255746);
                        i12 = ((iM2767 ^ i11) * 14571) ^ (-1198539545);
                    }
                    break;
                case 1215528902:
                case 1683039908:
                    C2702.m8876();
                    C23916.m53419();
                    return;
                default:
                    abstractC22045 = abstractC22047;
                    i = i15;
                    i2 = i17;
                    c22941 = c22943;
                    s = s4;
                    i3 = i16;
                    sArr = sArr3;
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ܶᩴ") ^ i11;
                        i4 = ((iM2761 ^ i10) * 29283) ^ (-621841115);
                        i5 = 380723872;
                    } else {
                        iM2761 = C0773.m3169("᩺ܽ") ^ i11;
                        i4 = ((iM2761 ^ i10) * (-25567)) ^ 1187091706;
                        i5 = -173812514;
                    }
                    int i1113 = iM2761 ^ i5;
                    i17 = i2;
                    abstractC22047 = abstractC22045;
                    i16 = i3;
                    sArr3 = sArr;
                    c22943 = c22941;
                    s4 = s;
                    i13 = i1113;
                    i12 = i4;
                    i15 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c6 A[PHI: r0
      0x00c6: PHI (r0v4 java.util.ArrayList) = (r0v2 java.util.ArrayList), (r0v3 java.util.ArrayList), (r0v2 java.util.ArrayList) binds: [B:36:0x00c4, B:32:0x00a5, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168  */
    /* JADX WARN: Code duplicated, block: B:57:0x0196 A[PHI: r2 r8
      0x0196: PHI (r2v5 java.lang.Class<l.᩹ۨ֫>) = 
      (r2v2 java.lang.Class<l.᩹ۨ֫>)
      (r2v2 java.lang.Class<l.᩹ۨ֫>)
      (r2v2 java.lang.Class<l.᩹ۨ֫>)
      (r2v3 java.lang.Class<l.᩹ۨ֫>)
      (r2v2 java.lang.Class<l.᩹ۨ֫>)
     binds: [B:56:0x0194, B:44:0x011e, B:28:0x0084, B:21:0x0056, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0196: PHI (r8v9 l.᩷۠ۧ) = (r8v4 l.᩷۠ۧ), (r8v4 l.᩷۠ۧ), (r8v7 l.᩷۠ۧ), (r8v4 l.᩷۠ۧ), (r8v4 l.᩷۠ۧ) binds: [B:56:0x0194, B:44:0x011e, B:28:0x0084, B:21:0x0056, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52709(int i, int i2) {
        int iM2761;
        int i3;
        ArrayList arrayList = null;
        Class<C23522> cls = null;
        int i4 = -2060843992;
        int i5 = RunnableC0334.f1808;
        int i6 = C2310.f7472;
        int iM3169 = (i5 - C0773.m3169("ۚۡ")) * 77;
        int i7 = ((iM3169 ^ i6) * 25713) ^ 254404148;
        int i8 = 1493045991;
        while (true) {
            int i9 = iM3169 ^ i8;
            RunnableC21927 runnableC21927 = null;
            while (true) {
                i4 = ((((i4 ^ i6) * 23275) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -1779073602:
                    case -748649254:
                        arrayList = f76014;
                        if (C4282.m13644()) {
                            iM2761 = (i5 - C0619.m2761("۟۟")) * 63;
                            i7 = ((iM2761 ^ i6) * 26047) ^ (-687102318);
                            i3 = -693021165;
                        } else {
                            iM2761 = C0619.m2761("᩹ۛ") ^ i6;
                            i7 = ((iM2761 ^ i5) * 25561) ^ (-1617255296);
                            i3 = -1229825785;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case -1699395179:
                    case 964904893:
                        if (C0619.f2439) {
                            iM2761 = (C0619.m2761("ܰ۠") + i5) * 17;
                            i7 = ((iM2761 ^ i6) * (-17649)) ^ (-611999024);
                            i3 = -171232582;
                        } else {
                            iM2761 = C0773.m3169("ۛ᩶") ^ i6;
                            i7 = ((iM2761 ^ i5) * 24087) ^ (-1188657606);
                            i3 = 2147101534;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case -1557893090:
                    case 1581532047:
                        C5261.m15836(runnableC21927, cls, 500L);
                        break;
                    case -1446457604:
                    case 1364276237:
                        if (AbstractC0641.m2813() <= 0) {
                            iM2761 = C0773.m3169("۬ۙ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-237)) ^ (-30902858);
                            i3 = 518442596;
                        } else {
                            iM2761 = C0773.m3169("᩻ۗ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-29445)) ^ 1055071812;
                            i3 = 2081232337;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case -1438898892:
                    case -213508002:
                        if (C23916.f77426 <= 0) {
                            iM2761 = (C0619.m2761("᩷ۖ") + i6) * 57;
                            i7 = ((iM2761 ^ i5) * 22187) ^ (-476786685);
                            i3 = -617935970;
                        } else {
                            iM2761 = (C0773.m3169("ۙ֫") + i5) * 89;
                            i7 = ((iM2761 ^ i6) * 2965) ^ 368531222;
                            i3 = 1920729765;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case -1397894428:
                    case 526460340:
                        cls = C23522.class;
                        if (AbstractC0641.f2496 >= 0) {
                            iM2761 = (C0619.m2761("᩷ۖ") + i6) * 57;
                            i7 = ((iM2761 ^ i5) * 22187) ^ (-476786685);
                            i3 = -617935970;
                        } else {
                            iM2761 = (i5 - C0773.m3169("ܺ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i7 = ((iM2761 ^ i6) * (-13385)) ^ 1513457392;
                            i3 = 1023331552;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case -1145300137:
                    case 1993033709:
                        if (C4238.f15451 >= 0) {
                            iM2761 = C0773.m3169("۬ۙ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-237)) ^ (-30902858);
                            i3 = 518442596;
                        } else {
                            iM2761 = C0619.m2761("᩹ۛ") ^ i6;
                            i7 = ((iM2761 ^ i5) * 25561) ^ (-1617255296);
                            i3 = -1229825785;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case -1032365636:
                    case 575568874:
                        if (C2375.m8065() > 0) {
                            iM2761 = C0773.m3169("ܶܽ") ^ i5;
                            i7 = ((iM2761 ^ i6) * 6599) ^ (-1097675482);
                            i3 = -656882161;
                            i9 = iM2761 ^ i3;
                        }
                        break;
                    case -925624240:
                    case 1621975623:
                        AbstractC0116.m1243();
                        C1783.m6232();
                        break;
                    case -323432766:
                    case -99298776:
                        C9911.m25734(i, i2, arrayList);
                        if (!C1519.m5403()) {
                        }
                        runnableC21927 = new RunnableC21927(2);
                        if (C1080.f3865 >= 0) {
                            iM2761 = (C0619.m2761("᩷ۖ") + i6) * 57;
                            i7 = ((iM2761 ^ i5) * 22187) ^ (-476786685);
                            i3 = -617935970;
                        } else {
                            iM2761 = (i6 - C0773.m3169("۫ۤ")) * 47;
                            i7 = ((iM2761 ^ i5) * 22765) ^ 982349043;
                            i3 = -5594908;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                        break;
                    case -311960057:
                    case -92667946:
                        m52722();
                        if (C3734.f12817 >= 0) {
                            iM2761 = C0619.m2761("᩹ۛ") ^ i6;
                            i7 = ((iM2761 ^ i5) * 25561) ^ (-1617255296);
                            i3 = -1229825785;
                        } else {
                            iM2761 = C0773.m3169("᩸۟") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-22125)) ^ 1681462279;
                            i3 = 89240804;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case 114724122:
                    case 1921236239:
                        if (C1519.m5403()) {
                            iM2761 = C0619.m2761("ܿۖ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-28331)) ^ (-1047413859);
                            i3 = 205282821;
                        } else {
                            iM2761 = (C0619.m2761("᩷ۖ") + i6) * 57;
                            i7 = ((iM2761 ^ i5) * 22187) ^ (-476786685);
                            i3 = -617935970;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case 1102897176:
                    case 1794620486:
                        C0269.m1775();
                        if (C0269.f1558 > 0) {
                            iM2761 = C0773.m3169("۬ۙ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-237)) ^ (-30902858);
                            i3 = 518442596;
                        } else {
                            iM2761 = (C0619.m2761("ܰ۠") + i5) * 17;
                            i7 = ((iM2761 ^ i6) * (-17649)) ^ (-611999024);
                            i3 = -171232582;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                    case 1136788015:
                    case 1677991637:
                        C1783.m6232();
                        iM2761 = C0773.m3169("۬ۙ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-237)) ^ (-30902858);
                        i3 = 518442596;
                        i9 = iM2761 ^ i3;
                        break;
                    default:
                        if (C2878.f9462) {
                            iM2761 = (C0619.m2761("ܰ۠") + i5) * 17;
                            i7 = ((iM2761 ^ i6) * (-17649)) ^ (-611999024);
                            i3 = -171232582;
                        } else {
                            iM2761 = (C0619.m2761("᩷ۖ") + i6) * 57;
                            i7 = ((iM2761 ^ i5) * 22187) ^ (-476786685);
                            i3 = -617935970;
                        }
                        i9 = iM2761 ^ i3;
                        break;
                }
                return;
            }
            iM3169 = C0773.m3169("ܿ᩸") ^ i5;
            i7 = ((iM3169 ^ i6) * 22617) ^ 1417440013;
            i8 = 1131692603;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m52716() {
        m52722();
        return f76011;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C17930 m52726() {
        m52722();
        return f76010;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C18300 m52717(String str) {
        int i = -347845538;
        int i2 = C0487.f2131;
        int i3 = C11235.f35427;
        int iM2761 = C0619.m2761("ۛۤ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-29675)) ^ 282571199;
        int i5 = 1785447172;
        while (true) {
            i = ((((i ^ i2) * 12161) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2056866005:
                case 696025649:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("ܺۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18219)) ^ (-575674843);
                        i5 = 124604391;
                    } else {
                        iM2761 = C0773.m3169("ᩴۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25009) ^ (-149163966);
                        i5 = 813899513;
                    }
                    break;
                case -2046245418:
                case 763190203:
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("ۧۚ") + i3) * (-31);
                        i4 = ((iM2761 ^ i2) * (-11811)) ^ 1727193149;
                        i5 = -783108366;
                    } else {
                        iM2761 = C0773.m3169("ۗۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24189) ^ (-1318204390);
                        i5 = -960627311;
                    }
                    break;
                case -1777343685:
                case 1415517231:
                    C2966.m9664();
                    return null;
                case -1771710586:
                case 1364292173:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("ܰ֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7467) ^ 1508993649;
                        i5 = 625467231;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19039)) ^ 1970131700;
                        i5 = -1114065902;
                    }
                    break;
                case -1427569799:
                case 360933138:
                    if (C3779.m12264()) {
                        iM2761 = C0773.m3169("᩷ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24673)) ^ (-305910030);
                        i5 = 974071790;
                    } else {
                        iM2761 = C0773.m3169("ܺۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18219)) ^ (-575674843);
                        i5 = 124604391;
                    }
                    break;
                case -1417512176:
                case -1334930258:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ᩴۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25009) ^ (-149163966);
                        i5 = 813899513;
                    } else {
                        iM2761 = (C0619.m2761("֨ܿ") ^ i2) * (-11);
                        i4 = ((iM2761 ^ i3) * (-3525)) ^ (-1915668314);
                        i5 = 1318021880;
                    }
                    break;
                case -1353899893:
                case -405553739:
                    if (C0619.m2763()) {
                        iM2761 = C0773.m3169("ܺۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18219)) ^ (-575674843);
                        i5 = 124604391;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۟ۨ")) * 93;
                        i4 = ((iM2761 ^ i3) * 5207) ^ 1101171767;
                        i5 = -33344670;
                    }
                    break;
                case -1332349917:
                case -1097408144:
                    if (C0773.m3161() != 0) {
                        iM2761 = C0773.m3169("ۗۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24189) ^ (-1318204390);
                        i5 = -960627311;
                    } else {
                        iM2761 = C0619.m2761("᩹᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5651)) ^ 1980013858;
                        i5 = -1011872200;
                    }
                    break;
                case -1279975675:
                case -689309003:
                    return (C18300) f76012.get(str);
                case -1213921168:
                case -917825988:
                    C0487.m2356();
                    if (C3099.f10023 > 0) {
                        iM2761 = C0773.m3169("ᩴۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25009) ^ (-149163966);
                        i5 = 813899513;
                    } else {
                        iM2761 = C0773.m3169("ۗۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24189) ^ (-1318204390);
                        i5 = -960627311;
                    }
                    break;
                case -1186017515:
                case 780596070:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("ۡۧ") ^ i2) * 29;
                        i4 = ((iM2761 ^ i3) * 27137) ^ (-39146424);
                        i5 = -1901980617;
                    } else {
                        iM2761 = C0773.m3169("᩶ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15343)) ^ 551624108;
                        i5 = 968353973;
                    }
                    break;
                case -1000823193:
                case 2111161201:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("ۡۧ") ^ i2) * 29;
                        i4 = ((iM2761 ^ i3) * 27137) ^ (-39146424);
                        i5 = -1901980617;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-24423)) ^ (-1081930989);
                        i5 = 1259208730;
                    }
                    break;
                case -696529633:
                case 670130956:
                    C1542.m5459();
                    iM2761 = C0773.m3169("ۗۡ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 24189) ^ (-1318204390);
                    i5 = -960627311;
                    break;
                case -638788207:
                case 489658201:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۗۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24189) ^ (-1318204390);
                        i5 = -960627311;
                    } else {
                        iM2761 = (C0773.m3169("ܰ֡") + i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-27931)) ^ (-442486726);
                        i5 = -1462223381;
                    }
                    break;
                case 96809469:
                case 784700458:
                    if (C2966.m9673()) {
                        iM2761 = (C0619.m2761("ܳ᩺") + i3) * (-39);
                        i4 = ((iM2761 ^ i2) * 2223) ^ (-722891259);
                        i5 = 1234034550;
                    } else {
                        iM2761 = C0619.m2761("᩻᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8961)) ^ (-1447881548);
                        i5 = 817814989;
                    }
                    break;
                case 270331423:
                case 1866178854:
                    C2878.m9491();
                    if (C3033.f9831 < 0) {
                        iM2761 = C0773.m3169("ܰ֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7467) ^ 1508993649;
                        i5 = 625467231;
                    } else {
                        iM2761 = C0773.m3169("ᩴۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25009) ^ (-149163966);
                        i5 = 813899513;
                    }
                    break;
                case 667735438:
                case 1277451987:
                    return null;
                default:
                    m52722();
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۗۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24189) ^ (-1318204390);
                        i5 = -960627311;
                    } else {
                        iM2761 = C0773.m3169("᩻֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13489)) ^ 1288999400;
                        i5 = 579837308;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0200 A[PHI: r4 r8 r9 r17
      0x0200: PHI (r4v7 java.lang.StringBuilder) = (r4v3 java.lang.StringBuilder), (r4v2 java.lang.StringBuilder), (r4v2 java.lang.StringBuilder) binds: [B:48:0x0186, B:33:0x00e9, B:59:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v3 int) binds: [B:48:0x0186, B:33:0x00e9, B:59:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r9v2 short) = (r9v1 short), (r9v1 short), (r9v3 short) binds: [B:48:0x0186, B:33:0x00e9, B:59:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r17v14 l.ܿۨ֫) = (r17v6 l.ܿۨ֫), (r17v7 l.ܿۨ֫), (r17v15 l.ܿۨ֫) binds: [B:48:0x0186, B:33:0x00e9, B:59:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0250 A[PHI: r3 r6 r7 r11 r12 r13 r17
      0x0250: PHI (r3v4 l.᩷ۨᩴ) = (r3v1 l.᩷ۨᩴ), (r3v1 l.᩷ۨᩴ), (r3v2 l.᩷ۨᩴ), (r3v1 l.᩷ۨᩴ) binds: [B:67:0x024e, B:63:0x0232, B:24:0x0081, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r6v4 short) = (r6v2 short), (r6v1 short), (r6v1 short), (r6v1 short) binds: [B:67:0x024e, B:63:0x0232, B:24:0x0081, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r7v4 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:67:0x024e, B:63:0x0232, B:24:0x0081, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r11v4 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:67:0x024e, B:63:0x0232, B:24:0x0081, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r12v8 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:67:0x024e, B:63:0x0232, B:24:0x0081, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r13v4 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:67:0x024e, B:63:0x0232, B:24:0x0081, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r17v26 l.ܿۨ֫) = (r17v12 l.ܿۨ֫), (r17v13 l.ܿۨ֫), (r17v20 l.ܿۨ֫), (r17v27 l.ܿۨ֫) binds: [B:67:0x024e, B:63:0x0232, B:24:0x0081, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52710(String str) {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        int i3;
        int i4;
        String str2 = str;
        C18300 c18300 = null;
        AbstractC22044 abstractC22044M52727 = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -425821438;
        int i11 = RunnableC0334.f1808;
        int i12 = C3734.f12817;
        int iM31610 = (C0773.m3169("ܽۜ") + i11) * (-95);
        int i13 = ((iM31610 ^ i12) * (-27807)) ^ (-251773711);
        int i14 = iM31610 ^ (-1877800870);
        short[] sArr2 = null;
        StringBuilder sb = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 20841) >> 31));
            switch (i10) {
                case -2073391187:
                case -1479157960:
                    c18300 = c18300;
                    i6 = i5 + 1;
                    s2 = 1;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("ܽܽ") ^ i12;
                        i13 = ((iM2761 ^ i11) * 8321) ^ (-875972342);
                        i = -1401953527;
                    } else {
                        iM2761 = (C0619.m2761("۬ۚ") ^ i12) * 19;
                        i13 = ((iM2761 ^ i11) * (-8785)) ^ (-42271111);
                        i = -458613949;
                    }
                    int i15 = iM2761 ^ i;
                    c18300 = c18300;
                    i14 = i15;
                    str2 = str;
                    break;
                case -1995099216:
                case -529204915:
                    if (C2287.f7432 >= 0) {
                        c18300 = c18300;
                        iM2761 = C0619.m2761("ۨܶ") ^ i11;
                        i13 = ((iM2761 ^ i12) * 15591) ^ 1306548473;
                        i = -1781649703;
                        int i16 = iM2761 ^ i;
                        c18300 = c18300;
                        i14 = i16;
                        str2 = str;
                    } else {
                        c18300 = c18300;
                        iM3169 = C0773.m3169("֫ܰ") ^ i12;
                        i2 = ((iM3169 ^ i11) * OpenAuthTask.NOT_INSTALLED) ^ (-1716979031);
                        i3 = 1799884409;
                        i4 = iM3169 ^ i3;
                        C18300 c18301 = c18300;
                        i14 = i4;
                        i13 = i2;
                        c18300 = c18301;
                    }
                    break;
                case -1904434298:
                case 131286329:
                    i7 = 15030;
                    iM2761 = C0773.m3169("ۗۗ") ^ i12;
                    i13 = ((iM2761 ^ i11) * 3947) ^ (-846710753);
                    i = 1998073831;
                    int i17 = iM2761 ^ i;
                    c18300 = c18300;
                    i14 = i17;
                    str2 = str;
                    break;
                case -1837033076:
                case 1736433177:
                    c18300 = (C18300) f76012.get(str2);
                    if (c18300 != null) {
                        iM3169 = (C0773.m3169("۠᩷") + i11) * (-113);
                        c18300 = c18300;
                        i2 = ((iM3169 ^ i12) * 5721) ^ 1726237655;
                        i3 = -1144810175;
                    } else {
                        iM3169 = (i11 - C0619.m2761("ᩳۧ")) * (-103);
                        c18300 = c18300;
                        i2 = ((iM3169 ^ i12) * (-16429)) ^ (-1112142500);
                        i3 = 849087022;
                    }
                    i4 = iM3169 ^ i3;
                    C18300 c18302 = c18300;
                    i14 = i4;
                    i13 = i2;
                    c18300 = c18302;
                    break;
                case -1652971372:
                case -925064078:
                    c18300 = c18300;
                    sArr2 = f76015;
                    c = 129;
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("ۨܶ") ^ i11;
                        i13 = ((iM2761 ^ i12) * 15591) ^ 1306548473;
                        i = -1781649703;
                    } else {
                        iM2761 = C0619.m2761("ۧ۠") ^ i11;
                        i13 = ((iM2761 ^ i12) * 5621) ^ 920640252;
                        i = -1889615547;
                    }
                    int i18 = iM2761 ^ i;
                    c18300 = c18300;
                    i14 = i18;
                    str2 = str;
                    break;
                case -1603203752:
                case -674662359:
                    C2375.m8065();
                    c18300 = c18300;
                    iM3169 = C0773.m3169("֫ܰ") ^ i12;
                    i2 = ((iM3169 ^ i11) * OpenAuthTask.NOT_INSTALLED) ^ (-1716979031);
                    i3 = 1799884409;
                    i4 = iM3169 ^ i3;
                    C18300 c18303 = c18300;
                    i14 = i4;
                    i13 = i2;
                    c18300 = c18303;
                    break;
                case -1159601325:
                case -1158027308:
                    c18300 = c18300;
                    s = sArr2[c];
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("ᩳۛ") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-7149)) ^ 1928974055;
                        i = 470206401;
                    } else {
                        iM2761 = (C0773.m3169("ۙۙ") + i12) * (-89);
                        i13 = ((iM2761 ^ i11) * (-31553)) ^ (-32773056);
                        i = -1827654293;
                    }
                    int i19 = iM2761 ^ i;
                    c18300 = c18300;
                    i14 = i19;
                    str2 = str;
                    break;
                case -1077164316:
                case 989513828:
                    c18300 = c18300;
                    i5 = s * 2;
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("ᩳۛ") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-7149)) ^ 1928974055;
                        i = 470206401;
                    } else {
                        iM2761 = C0619.m2761("ܶۨ") ^ i11;
                        i13 = ((iM2761 ^ i12) * 2873) ^ 1994885745;
                        i = -1838493819;
                    }
                    int i110 = iM2761 ^ i;
                    c18300 = c18300;
                    i14 = i110;
                    str2 = str;
                    break;
                case -554011523:
                case -47224659:
                    if (C1080.f3865 >= 0) {
                        c18300 = c18300;
                        iM2761 = C0773.m3169("ᩳۛ") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-7149)) ^ 1928974055;
                        i = 470206401;
                        int i111 = iM2761 ^ i;
                        c18300 = c18300;
                        i14 = i111;
                        str2 = str;
                    }
                    c18300 = c18300;
                    iM2761 = C0619.m2761("ۨܶ") ^ i11;
                    i13 = ((iM2761 ^ i12) * 15591) ^ 1306548473;
                    i = -1781649703;
                    int i112 = iM2761 ^ i;
                    c18300 = c18300;
                    i14 = i112;
                    str2 = str;
                    break;
                case -506534473:
                case 1571222790:
                    c18300 = c18300;
                    C3779.m12258(sb, str2);
                    C5448.m16278(C2023.m6952(sb));
                    if (C3448.m11248() != 0) {
                        iM3169 = C0773.m3169("֫ܰ") ^ i12;
                        i2 = ((iM3169 ^ i11) * OpenAuthTask.NOT_INSTALLED) ^ (-1716979031);
                        i3 = 1799884409;
                    } else {
                        iM3169 = (C0773.m3169("ۚۗ") ^ i12) * (-31);
                        i2 = ((iM3169 ^ i11) * 19087) ^ (-285592416);
                        i3 = -629313400;
                    }
                    i4 = iM3169 ^ i3;
                    C18300 c18304 = c18300;
                    i14 = i4;
                    i13 = i2;
                    c18300 = c18304;
                    break;
                case -502776898:
                case 1472582931:
                    c18300 = c18300;
                    m52722();
                    short[] sArr3 = f76015;
                    if (C1826.f6190 <= 0 || C2878.f9462) {
                        int iM31611 = (C0773.m3169("ᩳ᩺") + i11) * (-89);
                        i2 = ((iM31611 ^ i12) * 31451) ^ (-1694974783);
                        i4 = iM31611 ^ (-1847567289);
                        sb = null;
                        C18300 c18305 = c18300;
                        i14 = i4;
                        i13 = i2;
                        c18300 = c18305;
                    } else {
                        sb = new StringBuilder(C4238.m13530(sArr3, 130, 12, i7));
                        if (C4238.m13540() <= 0) {
                            iM2761 = C0619.m2761("ܽܽ") ^ i12;
                            i13 = ((iM2761 ^ i11) * 8321) ^ (-875972342);
                            i = -1401953527;
                        } else {
                            iM2761 = (C0619.m2761("᩻ܶ") + i11) * 39;
                            i13 = ((iM2761 ^ i12) * 28279) ^ (-849616424);
                            i = 1830489248;
                        }
                        int i113 = iM2761 ^ i;
                        c18300 = c18300;
                        i14 = i113;
                        str2 = str;
                    }
                    break;
                case -191142986:
                case 972181097:
                    c18300 = c18300;
                    int i20 = s + s2;
                    if (i6 - (i20 * i20) <= 0) {
                        iM2761 = C0619.m2761("ۛܰ") ^ i11;
                        i13 = ((iM2761 ^ i12) * 12597) ^ 749870508;
                        i = 297009200;
                    } else {
                        iM2761 = (C0619.m2761("ۢۢ") ^ i12) * (-23);
                        i13 = ((iM2761 ^ i11) * (-16993)) ^ (-1479801875);
                        i = 368240679;
                    }
                    int i114 = iM2761 ^ i;
                    c18300 = c18300;
                    i14 = i114;
                    str2 = str;
                    break;
                case -130737479:
                case 604710218:
                    i7 = 15349;
                    iM2761 = C0773.m3169("ۗۗ") ^ i12;
                    i13 = ((iM2761 ^ i11) * 3947) ^ (-846710753);
                    i = 1998073831;
                    int i115 = iM2761 ^ i;
                    c18300 = c18300;
                    i14 = i115;
                    str2 = str;
                    break;
                case -32157253:
                case 21645607:
                    c18300.m42661();
                    iM3169 = (i11 - C0619.m2761("ᩳۧ")) * (-103);
                    c18300 = c18300;
                    i2 = ((iM3169 ^ i12) * (-16429)) ^ (-1112142500);
                    i3 = 849087022;
                    i4 = iM3169 ^ i3;
                    C18300 c18306 = c18300;
                    i14 = i4;
                    i13 = i2;
                    c18300 = c18306;
                    break;
                case 18936268:
                case 964676112:
                    AbstractC0641.m2813();
                    if (C2354.f7599 < 0) {
                        c18300 = c18300;
                        int iM31612 = (C0773.m3169("ᩳ᩺") + i11) * (-89);
                        i2 = ((iM31612 ^ i12) * 31451) ^ (-1694974783);
                        i4 = iM31612 ^ (-1847567289);
                        sb = null;
                        C18300 c18307 = c18300;
                        i14 = i4;
                        i13 = i2;
                        c18300 = c18307;
                    } else {
                        c18300 = c18300;
                        iM2761 = C0619.m2761("ۨܶ") ^ i11;
                        i13 = ((iM2761 ^ i12) * 15591) ^ 1306548473;
                        i = -1781649703;
                        int i116 = iM2761 ^ i;
                        c18300 = c18300;
                        i14 = i116;
                        str2 = str;
                    }
                    break;
                case 622691071:
                case 1306151709:
                    C17202.m40378(C0269.m1774(abstractC22044M52727, C17202.m40377(sArr, i8, i9, i7)));
                    break;
                case 695211404:
                case 1497863497:
                    m52725(str);
                    if (C2310.f7472 < 0) {
                        iM3169 = (i11 - C0773.m3169("᩶ᩴ")) * 49;
                        c18300 = c18300;
                        i2 = ((iM3169 ^ i12) * 7885) ^ 1047406605;
                        i3 = 778202456;
                        i4 = iM3169 ^ i3;
                        C18300 c18308 = c18300;
                        i14 = i4;
                        i13 = i2;
                        c18300 = c18308;
                    } else {
                        c18300 = c18300;
                        iM2761 = C0619.m2761("ܽܽ") ^ i12;
                        i13 = ((iM2761 ^ i11) * 8321) ^ (-875972342);
                        i = -1401953527;
                        int i117 = iM2761 ^ i;
                        c18300 = c18300;
                        i14 = i117;
                        str2 = str;
                    }
                    break;
                case 1402022957:
                case 1923659327:
                    abstractC22044M52727 = m52727(str);
                    sArr = f76015;
                    i9 = 5;
                    if (AbstractC0641.m2813() <= 0) {
                        c18300 = c18300;
                        i8 = 142;
                        iM2761 = C0773.m3169("ᩳۛ") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-7149)) ^ 1928974055;
                        i = 470206401;
                        int i118 = iM2761 ^ i;
                        c18300 = c18300;
                        i14 = i118;
                        str2 = str;
                    } else {
                        int iM31613 = C0773.m3169("۫ۜ") ^ i12;
                        i14 = iM31613 ^ (-1341288169);
                        i13 = ((iM31613 ^ i11) * 16321) ^ 121219717;
                        i8 = 142;
                    }
                    break;
                default:
                    C11235.m28309();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52715(ArrayList arrayList) {
        Iterator itM13647 = null;
        String str = null;
        Object obj = null;
        C18300 c18300 = null;
        int i = 1979520718;
        int i2 = C1080.f3865;
        int i3 = C3734.f12817;
        int iM3169 = (C0773.m3169("֨ۜ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i4 = ((iM3169 ^ i3) * (-14219)) ^ 1227747028;
        int i5 = 1989119869;
        while (true) {
            i = ((((i ^ i3) * 27785) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2021576853:
                case -1668208252:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("۫ۧ") + i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-551)) ^ (-1062781807);
                        i5 = -692046753;
                    } else {
                        iM3169 = C0773.m3169("۬ۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17487) ^ (-1807747178);
                        i5 = 2074134111;
                    }
                    break;
                case -1981747872:
                case -230202312:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("۠᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12233) ^ (-143468026);
                        i5 = -789934532;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩻ܰ")) * 73;
                        i4 = ((iM3169 ^ i2) * (-4287)) ^ 461026095;
                        i5 = -862768164;
                    }
                    break;
                case -1929604383:
                case 1090159988:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("۫ۧ") + i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-551)) ^ (-1062781807);
                        i5 = -692046753;
                    } else {
                        iM3169 = (C0619.m2761("۫ܰ") + i2) * (-19);
                        i4 = ((iM3169 ^ i3) * (-28239)) ^ (-1407964249);
                        i5 = -9741661;
                    }
                    break;
                case -1810171960:
                case -1597616678:
                    C2485.m8357();
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("۠᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12233) ^ (-143468026);
                        i5 = -789934532;
                    } else {
                        iM3169 = (C0773.m3169("֡᩸") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-9225)) ^ 2040740276;
                        i5 = 1145515776;
                    }
                    break;
                case -1807018215:
                case 533699106:
                    C1321.m4848(c18300);
                    if (c18300.m42651()) {
                        iM3169 = C0773.m3169("ۗᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17319)) ^ (-1850726746);
                        i5 = -1303498867;
                    } else {
                        iM3169 = C0773.m3169("ۗ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21047)) ^ 1301294203;
                        i5 = 260366207;
                    }
                    break;
                case -1667264969:
                case 990804927:
                    if (C3077.m10037()) {
                        iM3169 = (C0619.m2761("᩵ۡ") ^ i3) * 9;
                        i4 = ((iM3169 ^ i2) * 30847) ^ (-561447823);
                        i5 = 201030857;
                    } else {
                        iM3169 = C0773.m3169("ܶ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26355) ^ (-2031040718);
                        i5 = -239266209;
                    }
                    break;
                case -1561127054:
                case -881290115:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("֡᩸") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-9225)) ^ 2040740276;
                        i5 = 1145515776;
                    } else {
                        iM3169 = (C0773.m3169("᩶ܿ") ^ i2) * (-83);
                        i4 = ((iM3169 ^ i3) * (-27363)) ^ 1324873236;
                        i5 = 929621651;
                    }
                    break;
                case -1425102395:
                case -723359979:
                    return true;
                case -1345151252:
                case -968659408:
                    C1519.m5403();
                    iM3169 = (C0619.m2761("۫ۧ") + i2) * (-5);
                    i4 = ((iM3169 ^ i3) * (-551)) ^ (-1062781807);
                    i5 = -692046753;
                    break;
                case -1283867979:
                case -1175782299:
                    str = (String) C0950.m3796(itM13647);
                    if (arrayList.contains(str)) {
                        iM3169 = C0773.m3169("ۗᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17319)) ^ (-1850726746);
                        i5 = -1303498867;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ᩳܺ")) * (-53);
                        i4 = ((iM3169 ^ i3) * 7547) ^ (-784923409);
                        i5 = -128761814;
                    }
                    break;
                case -982485879:
                case -67690900:
                    m52722();
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("۫ۧ") + i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-551)) ^ (-1062781807);
                        i5 = -692046753;
                    } else {
                        iM3169 = C0773.m3169("ۢ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17659) ^ 1042422677;
                        i5 = 937624372;
                    }
                    break;
                case -378179810:
                case 1413271022:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("֡᩸") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-9225)) ^ 2040740276;
                        i5 = 1145515776;
                    } else {
                        iM3169 = C0619.m2761("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9529)) ^ 2055083769;
                        i5 = -1404617820;
                    }
                    break;
                case -376852206:
                case 1174056732:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (C0773.m3169("֡᩸") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-9225)) ^ 2040740276;
                        i5 = 1145515776;
                    } else {
                        iM3169 = (C0619.m2761("۫ۧ") + i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-551)) ^ (-1062781807);
                        i5 = -692046753;
                    }
                    break;
                case 274601135:
                case 1614532339:
                    AbstractC0116.m1243();
                    return false;
                case 663854894:
                case 910745492:
                    itM13647 = C4282.m13647(f76014);
                    iM3169 = C0773.m3169("ۗᩴ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-17319)) ^ (-1850726746);
                    i5 = -1303498867;
                    break;
                case 677435939:
                case 962006529:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("۫ۧ") + i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-551)) ^ (-1062781807);
                        i5 = -692046753;
                    } else {
                        iM3169 = C0619.m2761("ܳܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12987)) ^ (-244462145);
                        i5 = 690083002;
                    }
                    break;
                case 947385836:
                case 1866759571:
                    c18300 = (C18300) obj;
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("۠ۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14519)) ^ 297255354;
                        i5 = 159464641;
                    } else {
                        iM3169 = (C0619.m2761("ܰۗ") + i3) * (-85);
                        i4 = ((iM3169 ^ i2) * 2099) ^ 1527032035;
                        i5 = -1630501374;
                    }
                    break;
                case 1211908906:
                case 1769312445:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("۠᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12233) ^ (-143468026);
                        i5 = -789934532;
                    } else {
                        iM3169 = C0619.m2761("ۤۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29363) ^ 547055386;
                        i5 = -1373738639;
                    }
                    break;
                case 1280172824:
                case 1606841627:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("۫ۧ") + i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-551)) ^ (-1062781807);
                        i5 = -692046753;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۬֨")) * 29;
                        i4 = ((iM3169 ^ i3) * (-15641)) ^ 835313494;
                        i5 = -1702600696;
                    }
                    break;
                case 1379109919:
                case 1689075156:
                    return false;
                case 1625960776:
                case 1814561057:
                    obj = f76012.get(str);
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("ܶᩳ") ^ i3) * (-61);
                        i4 = ((iM3169 ^ i2) * (-6423)) ^ (-1106165061);
                        i5 = 1129652512;
                    } else {
                        iM3169 = (C0773.m3169("֡᩸") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-9225)) ^ 2040740276;
                        i5 = 1145515776;
                    }
                    break;
                default:
                    if (C3998.m12923(itM13647)) {
                        iM3169 = (i2 - C0773.m3169("ۡ۟")) * 33;
                        i4 = ((iM3169 ^ i3) * (-467)) ^ (-619704921);
                        i5 = -235001745;
                    } else {
                        iM3169 = C0773.m3169("ܶ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26355) ^ (-2031040718);
                        i5 = -239266209;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m52724(ArrayList arrayList) {
        ArrayList arrayList2 = null;
        Iterator itM13647 = null;
        String str = null;
        Object obj = null;
        C18300 c18300 = null;
        int i = -1097681499;
        int i2 = C2310.f7472;
        int i3 = C0950.f3488;
        int iM2761 = C0619.m2761("ۖ۟") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-12047)) ^ 1762772066;
        int i5 = -1307886645;
        while (true) {
            i = ((((i ^ i2) * (-4385)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2141876598:
                case 431657111:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ۛ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26739)) ^ (-1355359558);
                        i5 = -798681861;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩶") + i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-11735)) ^ 1446848982;
                        i5 = -258600878;
                    }
                    break;
                case -1970539256:
                case 2056860592:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("᩻ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16419) ^ (-2019219539);
                        i5 = 1625508923;
                    } else {
                        iM2761 = (C0773.m3169("ۘۚ") ^ i2) * (-73);
                        i4 = ((iM2761 ^ i3) * 2089) ^ (-1493363884);
                        i5 = -231209318;
                    }
                    break;
                case -1867302582:
                case -956113163:
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0773.m3169("ۛ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26739)) ^ (-1355359558);
                        i5 = -798681861;
                    } else {
                        iM2761 = C0773.m3169("ۡ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16341) ^ 237023079;
                        i5 = 1333941096;
                    }
                    break;
                case -1828215596:
                case -373914829:
                    arrayList2 = new ArrayList();
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0619.m2761("ۨۜ") ^ i3) * (-85);
                        i4 = ((iM2761 ^ i2) * (-1877)) ^ 828234622;
                        i5 = 116480871;
                    } else {
                        iM2761 = (C0619.m2761("۬ܳ") + i2) * (-95);
                        i4 = ((iM2761 ^ i3) * (-5761)) ^ (-2063612080);
                        i5 = 1164391233;
                    }
                    break;
                case -1716485418:
                case -181053493:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0619.m2761("ܿۘ") + i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-10957)) ^ (-466985410);
                        i5 = 1282524907;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܰܽ")) * q.h;
                        i4 = ((iM2761 ^ i3) * 2429) ^ (-2068595526);
                        i5 = -557823472;
                    }
                    break;
                case -1566569696:
                case 71986101:
                    return arrayList2;
                case -1511452789:
                case 62858618:
                    C3077.m10041();
                    return null;
                case -1438461008:
                case -1227749318:
                    C2878.m9491();
                    iM2761 = C0773.m3169("᩺ۧ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 16927) ^ 1735118553;
                    i5 = -712108658;
                    break;
                case -1143553249:
                case -646216165:
                    return Collections.EMPTY_LIST;
                case -1051712403:
                case 204498053:
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0619.m2761("ܿۘ") + i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-10957)) ^ (-466985410);
                        i5 = 1282524907;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ᩳ֫")) * (-3);
                        i4 = ((iM2761 ^ i2) * 25007) ^ 466161218;
                        i5 = 1276504261;
                    }
                    break;
                case -1006744363:
                case 106426713:
                    C17202.m40372();
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0619.m2761("ܿۘ") + i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-10957)) ^ (-466985410);
                        i5 = 1282524907;
                    } else {
                        iM2761 = C0619.m2761("᩻ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16419) ^ (-2019219539);
                        i5 = 1625508923;
                    }
                    break;
                case -964931999:
                case -576385083:
                    itM13647 = C4282.m13647(f76014);
                    iM2761 = C0773.m3169("۫ۡ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-22591)) ^ (-1505384167);
                    i5 = -1777947546;
                    break;
                case -934183633:
                case 557265930:
                    C3998.m12920();
                    if (!RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("᩺ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16927) ^ 1735118553;
                        i5 = -712108658;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26739)) ^ (-1355359558);
                        i5 = -798681861;
                    }
                    break;
                case -790525939:
                case 1120274594:
                    c18300 = (C18300) obj;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("ۨۜ") ^ i3) * (-85);
                        i4 = ((iM2761 ^ i2) * (-1877)) ^ 828234622;
                        i5 = 116480871;
                    } else {
                        iM2761 = (C0773.m3169("۟۫") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i3) * 10553) ^ 1426259707;
                        i5 = 802588300;
                    }
                    break;
                case -755052969:
                case 1195887693:
                    obj = f76012.get(str);
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("᩺ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16927) ^ 1735118553;
                        i5 = -712108658;
                    } else {
                        iM2761 = (C0773.m3169("ۨܽ") ^ i3) * (-47);
                        i4 = ((iM2761 ^ i2) * (-24535)) ^ 997138111;
                        i5 = 2110467179;
                    }
                    break;
                case -338337434:
                case 19785500:
                    if (C3998.m12923(itM13647)) {
                        iM2761 = (i3 - C0773.m3169("ۙ۬")) * 85;
                        i4 = ((iM2761 ^ i2) * (-24399)) ^ 1178624977;
                        i5 = -829887165;
                    } else {
                        iM2761 = C0773.m3169("ۗۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17159) ^ (-1014905755);
                        i5 = 1955781276;
                    }
                    break;
                case -180986431:
                case 1100767395:
                    C1321.m4848(c18300);
                    if (c18300.m42651()) {
                        iM2761 = C0773.m3169("۫ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22591)) ^ (-1505384167);
                        i5 = -1777947546;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۟᩺")) * 65;
                        i4 = ((iM2761 ^ i2) * 22707) ^ (-830908899);
                        i5 = 422404400;
                    }
                    break;
                case -4654610:
                case 1434717579:
                    str = (String) C4238.m13529(itM13647);
                    if (arrayList.contains(str)) {
                        iM2761 = C0773.m3169("۫ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22591)) ^ (-1505384167);
                        i5 = -1777947546;
                    } else {
                        iM2761 = (C0619.m2761("۬ᩴ") + i2) * (-19);
                        i4 = ((iM2761 ^ i3) * 29667) ^ (-2030890343);
                        i5 = -926315878;
                    }
                    break;
                case 263283576:
                case 745502200:
                    C3998.m12920();
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("᩻ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16419) ^ (-2019219539);
                        i5 = 1625508923;
                    } else {
                        iM2761 = C0773.m3169("᩺ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16927) ^ 1735118553;
                        i5 = -712108658;
                    }
                    break;
                case 352266182:
                case 1262451724:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("᩺ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16927) ^ 1735118553;
                        i5 = -712108658;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ᩴ᩺")) * 127;
                        i4 = ((iM2761 ^ i2) * 8707) ^ (-1908627743);
                        i5 = -255070241;
                    }
                    break;
                case 900453136:
                case 1989345921:
                    if (C2966.m9673()) {
                        iM2761 = (i2 - C0773.m3169("ܽ۟")) * (-95);
                        i4 = ((iM2761 ^ i3) * 11557) ^ (-1252799808);
                        i5 = 281296803;
                    } else {
                        iM2761 = C0773.m3169("֡᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14611)) ^ (-440466291);
                        i5 = 754818507;
                    }
                    break;
                case 1919030692:
                case 2029597633:
                    C1519.m5406(arrayList2, c18300);
                    iM2761 = C0773.m3169("۫ۡ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-22591)) ^ (-1505384167);
                    i5 = -1777947546;
                    break;
                default:
                    m52722();
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("᩺᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5871)) ^ 435172246;
                        i5 = -307107161;
                    } else {
                        iM2761 = (C0619.m2761("ۨۜ") ^ i3) * (-85);
                        i4 = ((iM2761 ^ i2) * (-1877)) ^ 828234622;
                        i5 = 116480871;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18300 m52707(AbstractC22044 abstractC22044) {
        return m52708(new C22941(abstractC22044));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6 A[PHI: r10
      0x00f6: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:181:0x00f6, B:35:0x00f4, B:11:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x015d A[PHI: r6 r7
      0x015d: PHI (r6v4 java.lang.Integer) = (r6v3 java.lang.Integer), (r6v2 java.lang.Integer) binds: [B:43:0x015b, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r7v4 java.lang.Object[]) = (r7v3 java.lang.Object[]), (r7v2 java.lang.Object[]) binds: [B:43:0x015b, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if (l.C13473.m33144() == false) goto L26;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m52704(int r29) {
        /*
            Method dump skipped, instruction units count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23522.m52704(int):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0278 A[PHI: r2 r9 r10 r12 r23 r25
      0x0278: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:69:0x0276, B:65:0x024e, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r9v18 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:69:0x0276, B:65:0x024e, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:69:0x0276, B:65:0x024e, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:69:0x0276, B:65:0x024e, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r23v19 l.ܿۨ֫) = (r23v8 l.ܿۨ֫), (r23v9 l.ܿۨ֫), (r23v20 l.ܿۨ֫) binds: [B:69:0x0276, B:65:0x024e, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r25v18 short) = (r25v6 short), (r25v7 short), (r25v19 short) binds: [B:69:0x0276, B:65:0x024e, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        if (l.C2288.f7433 > 0) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C18300 m52708(l.C22941 r28) throws l.C4866 {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23522.m52708(l.᩸ܽܺ):l.ܿۨ֫");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0259 A[PHI: r5 r6 r7 r9 r18
      0x0259: PHI (r5v5 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:63:0x0257, B:59:0x0237, B:51:0x01da, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r6v5 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:63:0x0257, B:59:0x0237, B:51:0x01da, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:63:0x0257, B:59:0x0237, B:51:0x01da, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r9v5 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:63:0x0257, B:59:0x0237, B:51:0x01da, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r18v25 java.lang.StringBuilder) = 
      (r18v3 java.lang.StringBuilder)
      (r18v4 java.lang.StringBuilder)
      (r18v6 java.lang.StringBuilder)
      (r18v26 java.lang.StringBuilder)
     binds: [B:63:0x0257, B:59:0x0237, B:51:0x01da, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m52721(String str) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        int i5 = C1564.f5401;
        int i6 = C2375.f7641;
        int iM31611 = (i5 - C0773.m3169("֨ۖ")) * (-93);
        int i7 = ((iM31611 ^ i6) * 6199) ^ (-1190630389);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM31611 ^ (-312583594);
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -364547676;
        SharedPreferences sharedPreferences = null;
        String strM6952 = null;
        StringBuilder sbM10405 = null;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * (-10997)) >> 31));
            switch (i14) {
                case -1841338726:
                case -1050390001:
                    C0619.m2763();
                    sbM10405 = sbM10405;
                    iM3169 = (C0773.m3169("ܿۢ") + i5) * (-37);
                    i = ((iM3169 ^ i6) * 30241) ^ (-1798783159);
                    i2 = 1513175621;
                    StringBuilder sb = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb;
                    break;
                case -1748292557:
                case 227657653:
                    sbM10405 = sbM10405;
                    s2 = 34094;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ܿۢ") + i5) * (-37);
                        i = ((iM3169 ^ i6) * 30241) ^ (-1798783159);
                        i2 = 1513175621;
                    } else {
                        iM3169 = C0619.m2761("۠ܽ") ^ i5;
                        i = ((iM3169 ^ i6) * (-10479)) ^ (-1936317171);
                        i2 = 12335398;
                    }
                    StringBuilder sb2 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb2;
                    break;
                case -1727887778:
                case -330631877:
                    C0269.m1781(sharedPreferences, C4238.m13530(sArr3, 401, 25, i11));
                    return sharedPreferences;
                case -1706333447:
                case -881361144:
                    sbM10405 = sbM10405;
                    sArr = f76015;
                    if (C3734.m12152() >= 0) {
                        sbM10405 = sbM10405;
                        iM3169 = (C0773.m3169("ܿᩳ") ^ i6) * (-33);
                        sbM10405 = sbM10405;
                        i = ((iM3169 ^ i5) * 22025) ^ 1526220602;
                        i2 = 775905630;
                    } else {
                        iM3169 = C0773.m3169("۟ۗ") ^ i6;
                        i = ((iM3169 ^ i5) * 20203) ^ (-1696263170);
                        i2 = -887676754;
                    }
                    StringBuilder sb3 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb3;
                    break;
                case -1600015430:
                case -335535183:
                    sArr2 = f76015;
                    i12 = 400;
                    i13 = 1;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("᩸ۛ") ^ i6;
                        sbM10405 = sbM10405;
                        i = ((iM3169 ^ i5) * 26529) ^ 917216972;
                        i2 = -1535314290;
                    } else {
                        sbM10405 = sbM10405;
                        iM3169 = C0773.m3169("᩷᩸") ^ i6;
                        i = ((iM3169 ^ i5) * (-353)) ^ (-1434765334);
                        i2 = 1436462822;
                    }
                    StringBuilder sb4 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb4;
                    break;
                case -1550571848:
                case -1013443961:
                    i11 = 34227;
                    iM3169 = (C0773.m3169("ۛܰ") + i5) * (-93);
                    i = ((iM3169 ^ i6) * 12671) ^ 1438121012;
                    i2 = -702381438;
                    StringBuilder sb5 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb5;
                    break;
                case -1359188405:
                case -672604013:
                    i11 = 29077;
                    iM3169 = (C0773.m3169("ۛܰ") + i5) * (-93);
                    i = ((iM3169 ^ i6) * 12671) ^ 1438121012;
                    i2 = -702381438;
                    StringBuilder sb6 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb6;
                    break;
                case -1249887625:
                case -1077317873:
                    sbM10405 = sbM10405;
                    c = 399;
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ܿۢ") + i5) * (-37);
                        i = ((iM3169 ^ i6) * 30241) ^ (-1798783159);
                        i2 = 1513175621;
                    } else {
                        iM3169 = (C0773.m3169("ۡܳ") + i5) * 83;
                        i = ((iM3169 ^ i6) * (-10345)) ^ 1272945417;
                        i2 = 1756222270;
                    }
                    StringBuilder sb7 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb7;
                    break;
                case -1063507423:
                case 558068862:
                    sbM10405 = C3188.m10405(str, C2354.m7980(sArr2, i12, i13, i11));
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ܿᩳ") ^ i6) * (-33);
                        sbM10405 = sbM10405;
                        i = ((iM3169 ^ i5) * 22025) ^ 1526220602;
                        i2 = 775905630;
                    } else {
                        iM3169 = (C0619.m2761("ܿܺ") + i5) * (-41);
                        sbM10405 = sbM10405;
                        i = ((iM3169 ^ i6) * (-4899)) ^ (-973894918);
                        i2 = 276048859;
                    }
                    StringBuilder sb8 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb8;
                    break;
                case -1022773338:
                case -371804172:
                    if (RunnableC3646.m11813() == 0) {
                        iM3169 = (C0773.m3169("ܿᩳ") ^ i6) * (-33);
                        sbM10405 = sbM10405;
                        i = ((iM3169 ^ i5) * 22025) ^ 1526220602;
                        i2 = 775905630;
                        StringBuilder sb9 = sbM10405;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        sbM10405 = sb9;
                    } else {
                        iM31610 = (C0773.m3169("ۨۖ") + i5) * (-99);
                        i3 = ((iM31610 ^ i6) * (-15345)) ^ (-1671344919);
                        i4 = 1468667314;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -995132368:
                case 1427209707:
                    sbM10405 = sbM10405;
                    i10 = i9 + 290600209;
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0619.m2761("۟᩶") ^ i5;
                        i = ((iM3169 ^ i6) * (-25021)) ^ (-1160239835);
                        i2 = -1180780190;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩶") ^ i6;
                        i = ((iM3169 ^ i5) * (-21017)) ^ (-1666599968);
                        i2 = 2035269036;
                    }
                    StringBuilder sb10 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb10;
                    break;
                case -886297150:
                case -685214015:
                    sbM10405 = sbM10405;
                    s = sArr[c];
                    i9 = s * s;
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("ܿۢ") + i5) * (-37);
                        i = ((iM3169 ^ i6) * 30241) ^ (-1798783159);
                        i2 = 1513175621;
                    } else {
                        iM3169 = C0619.m2761("۠ۢ") ^ i5;
                        i = ((iM3169 ^ i6) * 12403) ^ (-1420638973);
                        i2 = -1103609471;
                    }
                    StringBuilder sb11 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb11;
                    break;
                case -804899390:
                case 2049639624:
                    sbM10405 = sbM10405;
                    if (i10 - (s * s2) >= 0) {
                        iM3169 = C0619.m2761("ۙ۫") ^ i6;
                        i = ((iM3169 ^ i5) * (-16457)) ^ (-131361392);
                        i2 = -635297536;
                    } else {
                        iM3169 = C0619.m2761("ۙᩳ") ^ i6;
                        i = ((iM3169 ^ i5) * 17039) ^ (-1791195217);
                        i2 = -682992517;
                    }
                    StringBuilder sb12 = sbM10405;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    sbM10405 = sb12;
                    break;
                case -794732140:
                case 74166289:
                    if (C3690.f12684 > 0) {
                        sbM10405 = sbM10405;
                        iM3169 = C0619.m2761("۟᩶") ^ i5;
                        i = ((iM3169 ^ i6) * (-25021)) ^ (-1160239835);
                        i2 = -1180780190;
                        StringBuilder sb13 = sbM10405;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        sbM10405 = sb13;
                    } else {
                        iM31610 = (C0773.m3169("ۨۖ") + i5) * (-99);
                        i3 = ((iM31610 ^ i6) * (-15345)) ^ (-1671344919);
                        i4 = 1468667314;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -694132275:
                case 565426168:
                    sharedPreferences = C1321.m4856().getSharedPreferences(strM6952, 0);
                    if (C3448.m11248() == 0) {
                        iM31610 = C0773.m3169("ܶ᩹") ^ i5;
                        i3 = ((iM31610 ^ i6) * (-20605)) ^ (-1971201472);
                        i4 = -1530406235;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    } else {
                        iM3169 = C0619.m2761("᩸ۛ") ^ i6;
                        sbM10405 = sbM10405;
                        i = ((iM3169 ^ i5) * 26529) ^ 917216972;
                        i2 = -1535314290;
                        StringBuilder sb14 = sbM10405;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        sbM10405 = sb14;
                    }
                    break;
                case -565133035:
                case 1576329614:
                    sArr3 = f76015;
                    if (C3998.f13671 == 0) {
                        iM31610 = (C0619.m2761("ۘᩳ") ^ i6) * 55;
                        i3 = ((iM31610 ^ i5) * (-18399)) ^ (-1148504648);
                        i4 = -142175307;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    } else {
                        iM3169 = C0619.m2761("᩸ۛ") ^ i6;
                        sbM10405 = sbM10405;
                        i = ((iM3169 ^ i5) * 26529) ^ 917216972;
                        i2 = -1535314290;
                        StringBuilder sb15 = sbM10405;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        sbM10405 = sb15;
                    }
                    break;
                case 500945271:
                case 1164154005:
                    C1826.m6301();
                    RunnableC3055.m9933();
                    return null;
                case 847678348:
                case 1307808665:
                    C3779.m12269(sbM10405, C0773.m3169(str));
                    strM6952 = C2023.m6952(sbM10405);
                    if (C1826.f6190 > 0) {
                        iM31610 = (C0773.m3169("֨ܳ") + i6) * 73;
                        i3 = ((iM31610 ^ i5) * (-6481)) ^ (-754111988);
                        i4 = 1914688476;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    } else {
                        iM3169 = C0619.m2761("᩸ۛ") ^ i6;
                        sbM10405 = sbM10405;
                        i = ((iM3169 ^ i5) * 26529) ^ 917216972;
                        i2 = -1535314290;
                        StringBuilder sb16 = sbM10405;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        sbM10405 = sb16;
                    }
                    break;
                default:
                    C1519.m5403();
                    if (!RunnableC1848.f6235) {
                        sbM10405 = sbM10405;
                        iM3169 = (C0773.m3169("ܿۢ") + i5) * (-37);
                        i = ((iM3169 ^ i6) * 30241) ^ (-1798783159);
                        i2 = 1513175621;
                        StringBuilder sb17 = sbM10405;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        sbM10405 = sb17;
                    } else {
                        iM31610 = (C0773.m3169("ۨۖ") + i5) * (-99);
                        i3 = ((iM31610 ^ i6) * (-15345)) ^ (-1671344919);
                        i4 = 1468667314;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01a3 A[PHI: r4 r5 r7
      0x01a3: PHI (r4v4 short) = (r4v3 short), (r4v2 short) binds: [B:57:0x01a1, B:49:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:57:0x01a1, B:49:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r7v3 short) = (r7v2 short), (r7v4 short) binds: [B:57:0x01a1, B:49:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m52727(String str) {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        AbstractC22044 abstractC22044 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = -1196693353;
        int i7 = C20932.f66974;
        int i8 = C2834.f9334;
        int iM2762 = C0619.m2761("᩻ۤ") ^ i7;
        int i9 = ((iM2762 ^ i8) * (-27573)) ^ 502471758;
        int i10 = iM2762 ^ 110766050;
        while (true) {
            StringBuilder sb = null;
            while (true) {
                i6 = ((((i6 ^ i8) * 3509) >> 31) & i9) ^ i10;
                switch (i6) {
                    case -1957260260:
                    case -1466948142:
                        s2 = 39380;
                        if (C3099.m10095()) {
                            iM2761 = (C0773.m3169("ۚۧ") + i8) * (-37);
                            i9 = ((iM2761 ^ i7) * 25951) ^ 1636186657;
                            i = 107991248;
                        } else {
                            iM2761 = (C0619.m2761("ۧ᩷") + i7) * (-47);
                            i9 = ((iM2761 ^ i8) * 28493) ^ (-408646436);
                            i = -1339126956;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case -1940466145:
                    case 1481265992:
                        if (C3998.f13671 != 0) {
                            iM2761 = C0619.m2761("ܳ᩻") ^ i8;
                            i9 = ((iM2761 ^ i7) * 26735) ^ 2057379743;
                            i = -1737223725;
                            i10 = iM2761 ^ i;
                        } else {
                            iM3169 = (C0773.m3169("᩷ۨ") ^ i8) * (-21);
                            i9 = ((iM3169 ^ i7) * (-26819)) ^ 1129274348;
                            i2 = 492874521;
                            i10 = iM3169 ^ i2;
                        }
                        break;
                    case -1810530223:
                    case 1643171228:
                        if (i4 - (s * s2) < 0) {
                            iM2761 = (C0619.m2761("ۡۚ") + i8) * 47;
                            i9 = ((iM2761 ^ i7) * 4489) ^ (-953982426);
                            i = 2046188431;
                        } else {
                            iM2761 = (C0773.m3169("ᩳ᩶") ^ i8) * 95;
                            i9 = ((iM2761 ^ i7) * (-14923)) ^ 794407420;
                            i = -1501462936;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case -1709588453:
                    case 471502128:
                        abstractC22044 = C6382.f21568;
                        if (C3099.f10023 > 0) {
                            short[] sArr2 = f76015;
                            if (C13473.f42873 != 0) {
                                iM3169 = C0773.m3169("ۙ۠") ^ i7;
                                i9 = ((iM3169 ^ i8) * (-32525)) ^ (-416367801);
                                i2 = 173919228;
                                i10 = iM3169 ^ i2;
                                break;
                            } else if (C4238.f15451 < 0) {
                                sb = new StringBuilder(C2288.m7761(sArr2, 467, 7, i5));
                                if (C2310.f7472 < 0) {
                                    iM2761 = (C0773.m3169("ܺۨ") + i7) * 37;
                                    i9 = ((iM2761 ^ i8) * 2715) ^ (-1983546942);
                                    i = 1769471968;
                                    i10 = iM2761 ^ i;
                                    break;
                                }
                            }
                        }
                        iM3169 = (C0773.m3169("᩷ۨ") ^ i8) * (-21);
                        i9 = ((iM3169 ^ i7) * (-26819)) ^ 1129274348;
                        i2 = 492874521;
                        i10 = iM3169 ^ i2;
                        break;
                    case -1546170383:
                    case -900589307:
                        i5 = 31979;
                        iM2761 = (C0773.m3169("᩶ۛ") + i7) * 53;
                        i9 = ((iM2761 ^ i8) * 3587) ^ 496602765;
                        i = 1191772713;
                        i10 = iM2761 ^ i;
                        break;
                    case -1501715139:
                    case 940708839:
                        C3077.m10041();
                        iM3169 = (C0773.m3169("᩷ۨ") ^ i8) * (-21);
                        i9 = ((iM3169 ^ i7) * (-26819)) ^ 1129274348;
                        i2 = 492874521;
                        i10 = iM3169 ^ i2;
                        break;
                    case -887390094:
                    case 1266216868:
                        return C2310.m7806(abstractC22044, C1080.m4058(sb));
                    case -683844181:
                    case -277400697:
                        if (!C0619.m2763()) {
                            iM3169 = C0773.m3169("ۙ۠") ^ i7;
                            i9 = ((iM3169 ^ i8) * (-32525)) ^ (-416367801);
                            i2 = 173919228;
                            i10 = iM3169 ^ i2;
                        }
                        iM3169 = (C0773.m3169("᩷ۨ") ^ i8) * (-21);
                        i9 = ((iM3169 ^ i7) * (-26819)) ^ 1129274348;
                        i2 = 492874521;
                        i10 = iM3169 ^ i2;
                        break;
                    case -644318680:
                    case 1669522546:
                        C23916.m53419();
                        C23916.m53419();
                        return null;
                    case -200768920:
                    case 1187882111:
                        C3779.m12258(sb, str);
                        if (C1080.f3865 >= 0) {
                            iM2761 = C0619.m2761("ܳ᩻") ^ i8;
                            i9 = ((iM2761 ^ i7) * 26735) ^ 2057379743;
                            i = -1737223725;
                            i10 = iM2761 ^ i;
                        } else {
                            int iM2763 = (i8 - C0619.m2761("֨֫")) * 73;
                            i10 = iM2763 ^ 1355463175;
                            i9 = ((iM2763 ^ i7) * (-6017)) ^ (-1888064826);
                        }
                        break;
                    case 35910188:
                    case 1607989133:
                        i4 = i3 + 387696100;
                        if (RunnableC1848.f6235) {
                            iM2761 = C0619.m2761("ܳ᩻") ^ i8;
                            i9 = ((iM2761 ^ i7) * 26735) ^ 2057379743;
                            i = -1737223725;
                        } else {
                            iM2761 = C0619.m2761("ܶ᩶") ^ i8;
                            i9 = ((iM2761 ^ i7) * (-28859)) ^ 1334199591;
                            i = -1004545076;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case 546429022:
                    case 1293720879:
                        if (AbstractC0116.f1064 > 0) {
                            int iM2764 = C0619.m2761("֫ܿ") ^ i7;
                            i9 = ((iM2764 ^ i8) * 8351) ^ 1507995173;
                            i10 = iM2764 ^ (-1934501044);
                        } else {
                            iM3169 = (C0773.m3169("᩷ۨ") ^ i8) * (-21);
                            i9 = ((iM3169 ^ i7) * (-26819)) ^ 1129274348;
                            i2 = 492874521;
                            i10 = iM3169 ^ i2;
                        }
                        break;
                    case 552266326:
                    case 974359050:
                        s = sArr[c];
                        i3 = s * s;
                        if (C13473.f42873 != 0) {
                            iM2761 = (C0773.m3169("ۚۧ") + i8) * (-37);
                            i9 = ((iM2761 ^ i7) * 25951) ^ 1636186657;
                            i = 107991248;
                        } else {
                            iM2761 = C0619.m2761("ᩳۘ") ^ i7;
                            i9 = ((iM2761 ^ i8) * (-32331)) ^ 2005151089;
                            i = 686555244;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case 690624340:
                    case 743822510:
                        sArr = f76015;
                        if (C0862.f3233 == 0) {
                            iM2761 = C0619.m2761("᩺ܶ") ^ i8;
                            i9 = ((iM2761 ^ i7) * (-30541)) ^ 1069695729;
                            i = 780563422;
                            i10 = iM2761 ^ i;
                        } else {
                            iM3169 = C0773.m3169("ۙ۠") ^ i7;
                            i9 = ((iM3169 ^ i8) * (-32525)) ^ (-416367801);
                            i2 = 173919228;
                            i10 = iM3169 ^ i2;
                        }
                        break;
                    case 1439338280:
                    case 1640824306:
                        c = 466;
                        if (C1542.f5343 > 0) {
                            iM2761 = (i7 - C0619.m2761("ۨۛ")) * 33;
                            i9 = ((iM2761 ^ i8) * (-29451)) ^ (-1002159690);
                            i = -1532774524;
                            i10 = iM2761 ^ i;
                        } else {
                            iM3169 = C0773.m3169("ۙ۠") ^ i7;
                            i9 = ((iM3169 ^ i8) * (-32525)) ^ (-416367801);
                            i2 = 173919228;
                            i10 = iM3169 ^ i2;
                        }
                        break;
                    default:
                        i5 = 10554;
                        iM2761 = (C0773.m3169("᩶ۛ") + i7) * 53;
                        i9 = ((iM2761 ^ i8) * 3587) ^ 496602765;
                        i = 1191772713;
                        i10 = iM2761 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x032a A[PHI: r7 r8 r11 r12 r17 r19 r20
      0x032a: PHI (r7v3 short[]) = (r7v2 short[]), (r7v1 short[]), (r7v1 short[]) binds: [B:78:0x0328, B:66:0x0295, B:20:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r8v3 char) = (r8v2 char), (r8v1 char), (r8v1 char) binds: [B:78:0x0328, B:66:0x0295, B:20:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:78:0x0328, B:66:0x0295, B:20:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r12v3 short) = (r12v1 short), (r12v2 short), (r12v1 short) binds: [B:78:0x0328, B:66:0x0295, B:20:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r17v32 int) = (r17v18 int), (r17v21 int), (r17v33 int) binds: [B:78:0x0328, B:66:0x0295, B:20:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r19v29 java.util.ArrayList) = (r19v20 java.util.ArrayList), (r19v23 java.util.ArrayList), (r19v30 java.util.ArrayList) binds: [B:78:0x0328, B:66:0x0295, B:20:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r20v13 l.ܿۨ֫) = (r20v1 l.ܿۨ֫), (r20v4 l.ܿۨ֫), (r20v14 l.ܿۨ֫) binds: [B:78:0x0328, B:66:0x0295, B:20:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m52720(String str) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        C18300 c18300;
        int i5;
        ArrayList arrayList = null;
        C18300 c18301 = null;
        ArrayList arrayList2 = null;
        int iM8879 = 0;
        int i6 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = -833946942;
        int i11 = C1542.f5343;
        int i12 = C0487.f2131;
        int iM2761 = C0619.m2761("۫᩸") ^ i11;
        int i13 = ((iM2761 ^ i12) * (-31651)) ^ 25331665;
        int i14 = iM2761 ^ (-1096517274);
        StringBuilder sb = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i12) * (-10609)) >> 31));
            switch (i15) {
                case -2028080601:
                case -550395755:
                    i15 = i15;
                    arrayList = f76014;
                    if (C0862.f3233 == 0) {
                        iM3169 = C0619.m2761("ۗ᩷") ^ i11;
                        i = ((iM3169 ^ i12) * 20341) ^ (-1037998365);
                        i2 = 1344633979;
                        int i16 = i15;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        i10 = i16;
                    } else {
                        c18300 = c18301;
                        int iM2762 = (C0619.m2761("۠ܶ") + i12) * (-67);
                        i10 = i15;
                        sb = null;
                        i14 = iM2762 ^ 442687010;
                        i13 = ((iM2762 ^ i11) * 10153) ^ 1572686028;
                        c18301 = c18300;
                    }
                    break;
                case -1842994814:
                case 134228579:
                    i15 = i15;
                    c18301.m42657(false);
                    c18301.m42661();
                    iM3169 = C0773.m3169("ܰܺ") ^ i12;
                    i = ((iM3169 ^ i11) * 22957) ^ (-1055335035);
                    i2 = 1311469652;
                    int i17 = i15;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    i10 = i17;
                    break;
                case -1706088913:
                case 141658578:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (i12 - C0619.m2761("ۚ۫")) * (-9);
                        i15 = i15;
                        i = ((iM3169 ^ i11) * 32077) ^ 726659436;
                        i2 = -343999842;
                        int i18 = i15;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        i10 = i18;
                    } else {
                        arrayList = arrayList;
                        c18301 = c18301;
                        i15 = i15;
                        iM31610 = (C0619.m2761("᩹ۘ") + i12) * 123;
                        i3 = ((iM31610 ^ i11) * (-20455)) ^ 446372583;
                        i4 = 1277606604;
                        i5 = iM31610 ^ i4;
                        i10 = i15;
                        c18301 = c18301;
                        i14 = i5;
                        i13 = i3;
                        arrayList = arrayList;
                    }
                    break;
                case -1361439969:
                case 148636737:
                    C1146.m4231();
                    C1321.m4852();
                    break;
                case -1123241772:
                case -176840789:
                    i15 = i15;
                    m52722();
                    short[] sArr2 = f76015;
                    if (C0269.f1558 > 0) {
                        arrayList = arrayList;
                        if (C2702.f8586 <= 0) {
                            c18301 = c18301;
                            int iM31611 = C0773.m3169("ۢۜ") ^ i11;
                            i3 = ((iM31611 ^ i12) * 20277) ^ 912754173;
                            i5 = iM31611 ^ 463117666;
                            i10 = i15;
                            c18301 = c18301;
                            sb = null;
                            i14 = i5;
                            i13 = i3;
                        } else {
                            c18300 = c18301;
                            StringBuilder sb2 = new StringBuilder(C1080.m4056(sArr2, 388, 11, i9));
                            C1783.m6234(sb2, str);
                            if (AbstractC0641.f2496 >= 0) {
                                arrayList = arrayList;
                            } else {
                                int iM2763 = C0619.m2761("ۨ۟") ^ i11;
                                sb = sb2;
                                i13 = ((iM2763 ^ i12) * 1607) ^ (-1580363495);
                                i10 = i15;
                                c18301 = c18300;
                                i14 = iM2763 ^ 1992659444;
                            }
                        }
                        arrayList = arrayList;
                    } else {
                        c18300 = c18301;
                    }
                    int iM2764 = (C0619.m2761("۠ܶ") + i12) * (-67);
                    i10 = i15;
                    sb = null;
                    i14 = iM2764 ^ 442687010;
                    i13 = ((iM2764 ^ i11) * 10153) ^ 1572686028;
                    c18301 = c18300;
                    break;
                case -1106997989:
                case -482981588:
                    arrayList = arrayList;
                    c18301 = c18301;
                    i15 = i15;
                    int i19 = s + s2;
                    if ((i19 * i19) - i8 < 0) {
                        iM31610 = C0619.m2761("ۡܿ") ^ i11;
                        i3 = ((iM31610 ^ i12) * 8541) ^ (-533216711);
                        i4 = -1714190599;
                    } else {
                        iM31610 = (C0619.m2761("֡᩵") ^ i12) * (-103);
                        i3 = ((iM31610 ^ i11) * (-17635)) ^ (-6963229);
                        i4 = -720092685;
                    }
                    i5 = iM31610 ^ i4;
                    i10 = i15;
                    c18301 = c18301;
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case -965555041:
                case 192559482:
                    i15 = i15;
                    C1783.m6232();
                    if (C2287.m7745() > 0) {
                        arrayList = arrayList;
                        c18301 = c18301;
                        int iM31612 = C0773.m3169("ۢۜ") ^ i11;
                        i3 = ((iM31612 ^ i12) * 20277) ^ 912754173;
                        i5 = iM31612 ^ 463117666;
                        i10 = i15;
                        c18301 = c18301;
                        sb = null;
                        i14 = i5;
                        i13 = i3;
                        arrayList = arrayList;
                    }
                    arrayList = arrayList;
                    c18301 = c18301;
                    iM31610 = (C0619.m2761("᩹ۘ") + i12) * 123;
                    i3 = ((iM31610 ^ i11) * (-20455)) ^ 446372583;
                    i4 = 1277606604;
                    i5 = iM31610 ^ i4;
                    i10 = i15;
                    c18301 = c18301;
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case -964717269:
                case 494654186:
                    ((InterfaceC2879) C3690.m11990(arrayList2, i6)).mo9494();
                    iM8879 = i6;
                    iM3169 = C0773.m3169("ۛۙ") ^ i11;
                    i = ((iM3169 ^ i12) * (-20217)) ^ 814311590;
                    i2 = 1295471903;
                    int i110 = i15;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    i10 = i110;
                    break;
                case -951950316:
                case 1110228466:
                    C1519.m5403();
                    if (!RunnableC1848.m6360()) {
                        arrayList = arrayList;
                        c18301 = c18301;
                        i15 = i15;
                        iM31610 = (C0619.m2761("۠ܽ") ^ i11) * 97;
                        i3 = ((iM31610 ^ i12) * (-20025)) ^ (-355241022);
                        i4 = -977645821;
                        i5 = iM31610 ^ i4;
                        i10 = i15;
                        c18301 = c18301;
                        i14 = i5;
                        i13 = i3;
                        arrayList = arrayList;
                    }
                    arrayList = arrayList;
                    c18301 = c18301;
                    i15 = i15;
                    iM31610 = (C0619.m2761("᩹ۘ") + i12) * 123;
                    i3 = ((iM31610 ^ i11) * (-20455)) ^ 446372583;
                    i4 = 1277606604;
                    i5 = iM31610 ^ i4;
                    i10 = i15;
                    c18301 = c18301;
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case -945183837:
                case -138065497:
                    arrayList = arrayList;
                    c18301 = c18301;
                    i15 = i15;
                    sArr = f76015;
                    c = 387;
                    if (C2878.f9462) {
                        int iM31613 = C0773.m3169("ۢۜ") ^ i11;
                        i3 = ((iM31613 ^ i12) * 20277) ^ 912754173;
                        i5 = iM31613 ^ 463117666;
                        i10 = i15;
                        c18301 = c18301;
                        sb = null;
                    } else {
                        iM31610 = (C0773.m3169("֫᩻") + i12) * (-105);
                        i3 = ((iM31610 ^ i11) * (-5447)) ^ (-1997367342);
                        i4 = 498028950;
                        i5 = iM31610 ^ i4;
                        i10 = i15;
                        c18301 = c18301;
                    }
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case -793601365:
                case 1999694704:
                    i9 = 52268;
                    iM31610 = C0773.m3169("᩷ۢ") ^ i12;
                    i3 = ((iM31610 ^ i11) * (-12619)) ^ (-514172748);
                    i4 = -502799368;
                    i5 = iM31610 ^ i4;
                    i10 = i15;
                    c18301 = c18301;
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case -718232760:
                case -209751908:
                    arrayList = arrayList;
                    c18301 = c18301;
                    i15 = i15;
                    i8 = i7 + 1;
                    s2 = 1;
                    if (C1343.f4799 != 0) {
                        int iM31614 = C0773.m3169("ۢۜ") ^ i11;
                        i3 = ((iM31614 ^ i12) * 20277) ^ 912754173;
                        i5 = iM31614 ^ 463117666;
                        i10 = i15;
                        c18301 = c18301;
                        sb = null;
                    } else {
                        iM31610 = C0619.m2761("ۛܰ") ^ i11;
                        i3 = ((iM31610 ^ i12) * 32057) ^ (-1275244146);
                        i4 = -1437117771;
                        i5 = iM31610 ^ i4;
                        i10 = i15;
                        c18301 = c18301;
                    }
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case -713298064:
                case 423908055:
                    i15 = i15;
                    arrayList.remove(str);
                    c18301 = (C18300) f76012.remove(str);
                    if (c18301 != null) {
                        iM3169 = C0619.m2761("ۧᩳ") ^ i12;
                        i = ((iM3169 ^ i11) * 15703) ^ 2116979977;
                        i2 = -2057857290;
                    } else {
                        iM3169 = C0773.m3169("ܰܺ") ^ i12;
                        i = ((iM3169 ^ i11) * 22957) ^ (-1055335035);
                        i2 = 1311469652;
                    }
                    int i111 = i15;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    i10 = i111;
                    break;
                case -626898907:
                case 1499124038:
                    i15 = i15;
                    C3734.m12147(m52727(str));
                    m52718();
                    if (C2702.f8586 > 0) {
                        iM3169 = C0773.m3169("֨ۚ") ^ i11;
                        i = ((iM3169 ^ i12) * 16189) ^ 705160464;
                        i2 = 705430192;
                        int i112 = i15;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        i10 = i112;
                    } else {
                        arrayList = arrayList;
                        c18301 = c18301;
                        iM31610 = (C0619.m2761("᩹ۘ") + i12) * 123;
                        i3 = ((iM31610 ^ i11) * (-20455)) ^ 446372583;
                        i4 = 1277606604;
                        i5 = iM31610 ^ i4;
                        i10 = i15;
                        c18301 = c18301;
                        i14 = i5;
                        i13 = i3;
                        arrayList = arrayList;
                    }
                    break;
                case -505401489:
                case 1392214388:
                    i15 = i15;
                    C2288.m7767();
                    C3779.m12264();
                    arrayList = arrayList;
                    c18301 = c18301;
                    iM31610 = (C0619.m2761("᩹ۘ") + i12) * 123;
                    i3 = ((iM31610 ^ i11) * (-20455)) ^ 446372583;
                    i4 = 1277606604;
                    i5 = iM31610 ^ i4;
                    i10 = i15;
                    c18301 = c18301;
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case -421979869:
                case 1067748655:
                    i15 = i15;
                    C5448.m16278(C2023.m6952(sb));
                    m52725(str);
                    if (C3099.f10023 > 0) {
                        iM3169 = C0773.m3169("ۤۜ") ^ i12;
                        i = ((iM3169 ^ i11) * (-15321)) ^ 657738278;
                        i2 = -1871943353;
                        int i113 = i15;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        i10 = i113;
                    } else {
                        arrayList = arrayList;
                        c18301 = c18301;
                        iM31610 = (C0619.m2761("۠ܽ") ^ i11) * 97;
                        i3 = ((iM31610 ^ i12) * (-20025)) ^ (-355241022);
                        i4 = -977645821;
                        i5 = iM31610 ^ i4;
                        i10 = i15;
                        c18301 = c18301;
                        i14 = i5;
                        i13 = i3;
                        arrayList = arrayList;
                    }
                    break;
                case -404571827:
                case 2129365206:
                    arrayList = arrayList;
                    c18301 = c18301;
                    i15 = i15;
                    i7 = s * 2;
                    if (C0950.f3488 >= 0) {
                        iM31610 = (C0619.m2761("۠ܽ") ^ i11) * 97;
                        i3 = ((iM31610 ^ i12) * (-20025)) ^ (-355241022);
                        i4 = -977645821;
                    } else {
                        iM31610 = C0619.m2761("᩵ۛ") ^ i12;
                        i3 = ((iM31610 ^ i11) * (-27309)) ^ 1727188450;
                        i4 = -1035804842;
                    }
                    i5 = iM31610 ^ i4;
                    i10 = i15;
                    c18301 = c18301;
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case 587500168:
                case 2140780782:
                    arrayList = arrayList;
                    c18301 = c18301;
                    i15 = i15;
                    s = sArr[c];
                    if (C3099.f10023 <= 0) {
                        iM31610 = (C0619.m2761("᩹ۘ") + i12) * 123;
                        i3 = ((iM31610 ^ i11) * (-20455)) ^ 446372583;
                        i4 = 1277606604;
                    } else {
                        iM31610 = (i11 - C0619.m2761("ܰ᩵")) * (-83);
                        i3 = ((iM31610 ^ i12) * (-14315)) ^ 1002200484;
                        i4 = -763545002;
                    }
                    i5 = iM31610 ^ i4;
                    i10 = i15;
                    c18301 = c18301;
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                case 666647660:
                case 1948746897:
                    break;
                case 747026896:
                case 1668117678:
                    ArrayList arrayList3 = f76008;
                    iM8879 = C2702.m8879(arrayList3);
                    arrayList2 = arrayList3;
                    iM3169 = C0773.m3169("ۛۙ") ^ i11;
                    i = ((iM3169 ^ i12) * (-20217)) ^ 814311590;
                    i2 = 1295471903;
                    int i114 = i15;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    i10 = i114;
                    break;
                case 1146837503:
                case 1724071356:
                    i9 = 48709;
                    iM31610 = C0773.m3169("᩷ۢ") ^ i12;
                    i3 = ((iM31610 ^ i11) * (-12619)) ^ (-514172748);
                    i4 = -502799368;
                    i5 = iM31610 ^ i4;
                    i10 = i15;
                    c18301 = c18301;
                    i14 = i5;
                    i13 = i3;
                    arrayList = arrayList;
                    break;
                default:
                    i15 = i15;
                    i6 = iM8879 - 1;
                    if (i6 >= 0) {
                        iM3169 = (i12 - C0619.m2761("ܺܿ")) * 5;
                        i = ((iM3169 ^ i11) * (-5561)) ^ 210633444;
                        i2 = -1286714828;
                    } else {
                        iM3169 = (C0773.m3169("᩻ܳ") ^ i11) * (-29);
                        i = ((iM3169 ^ i12) * 22523) ^ (-518313455);
                        i2 = -2005577104;
                    }
                    int i115 = i15;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    i10 = i115;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52711(InterfaceC2879 interfaceC2879) {
        RunnableC0334.m2054(f76008, interfaceC2879);
    }
}
