package l;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4K0 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10845 extends AbstractActivityC4762 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static String f36914;

    /* JADX INFO: renamed from: ۤ۠ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f36915 = {6066, -29215, -29278, -25596, 4150, -18920, -18940, -18935, -18943, -18935, -18936, -18935, -18934, -18931, -18919, -18944, -18920, 7685, -11766, -11754, -11749, -11757, -11749, -11750, -11749, -11752, -11745, -11765, -11758, -11766, 5749, -28960, -28949, -28934, -28935, -28959, -28932, -28955, -28975, -28934, -28954, -28933, -28957, -28948, -28975, -28949, -28960, -28945, -28948, -28958, -28949, -28960, -28949, -28934, -28935, -28959, -28932, -28955, -28975, -28934, -28954, -28933, -28957, -28948, -28975, -28959, -28960, -28958, -28937, -28975, -28958, -28959, -28945, -28950, -28975, -28959, -28960, -28975, -28935, -28953, -28952, -28953, -28960, -28949, -28934, -28935, -28959, -28932, -28955, -28975, -28934, -28954, -28933, -28957, -28948, -28975, -28953, -28957, -28945, -28951, -28949, -28975, -28952, -28953, -28958, -28949, -28975, -28931, -28953, -28940, -28949, -28975, -28958, -28953, -28957, -28953, -28934, -28960, -28949, -28934, -28935, -28959, -28932, -28955, -28975, -28934, -28954, -28933, -28957, -28948, -28975, -28934, -28953, -28957, -28949, -28975, -28958, -28953, -28957, -28953, -28934, -28949, -28960, -28945, -28948, -28958, -28949, -28975, -28932, -28949, -28947, -28937, -28947, -28958, -28949, -28975, -28948, -28953, -28960, -28950, -28949, -28952, -28975, -28957, -28959, -28936, -28975, -28932, -28949, -28947, -28937, -28947, -28958, -28949, -28975, -28948, -28953, -28960, -28945, -28933, -28934, -28959, -28975, -28947, -28958, -28949, -28945, -28960, -28975, -28932, -28949, -28947, -28937, -28947, -28958, -28949, -28975, -28948, -28953, -28960, -28933, -28931, -28949, -28975, -28949, -28938, -28934, -28949, -28932, -28960, -28945, -28958, -28975, -28931, -28934, -28959, -28932, -28945, -28951, -28949, -28975, -28945, -28930, -28953, 6236, 5758, 5749, 5732, 5735, 5759, 5730, 5755, 5711, 5732, 5752, 5733, 5757, 5746, 5711, 5759, 5758, 5756, 5737, 5711, 5756, 5759, 5745, 5748, 5711, 5759, 5758, 5711, 5735, 5753, 5750, 5753, 5747, 5733, 5731, 5732, 5759, 5757, 5711, 5756, 5745, 5758, 5751, 5733, 5745, 5751, 5749, 5749, 5758, 5745, 5746, 5756, 5749, 5711, 5730, 5749, 5747, 5737, 5747, 5756, 5749, 5711, 5746, 5753, 5758, 5758, 5749, 5732, 5735, 5759, 5730, 5755, 5711, 5732, 5752, 5733, 5757, 5746, 5711, 5749, 5758, 5745, 5746, 5756, 5749, 5732, 5752, 5749, 5757, 5749, 5748, 5749, 5750, 5711, 5757, 5759, 5734, 5711, 5730, 5749, 5747, 5737, 5747, 5756, 5749, 5711, 5746, 5753, 5758, 5745, 5733, 5732, 5759, 5711, 5747, 5756, 5749, 5745, 5758, 5711, 5730, 5749, 5747, 5737, 5747, 5756, 5749, 5711, 5746, 5753, 5758, 5758, 5749, 5732, 5735, 5759, 5730, 5755, 5711, 5732, 5752, 5733, 5757, 5746, 5711, 5753, 5757, 5745, 5751, 5749, 5711, 5750, 5753, 5756, 5749, 5711, 5731, 5753, 5738, 5749, 5711, 5756, 5753, 5757, 5753, 5732, 5758, 5749, 5732, 5735, 5759, 5730, 5755, 5711, 5732, 5752, 5733, 5757, 5746, 5711, 5732, 5753, 5757, 5749, 5711, 5756, 5753, 5757, 5753, 5732, 2314, -19606, -19642, -19634, -19639, -19593, -19627, -19646, -19647, -19646, -19627, -19646, -19639, -19644, -19646, -19628};

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public static String f36916;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27198() {
        String strM18160 = null;
        String str = null;
        int i = 334006405;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C1148.f5161;
        int iM11306 = (ThreadFactoryC3888.m11306("ܶۡ") + i3) * 73;
        int i4 = ((iM11306 ^ i2) * (-23369)) ^ (-235075125);
        int i5 = -178109908;
        while (true) {
            i = ((((i ^ i2) * (-11985)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2078425051:
                case -660440163:
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19153)) ^ 1624997243;
                        i5 = 1328165752;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-28049)) ^ (-1287479030);
                        i5 = 391964293;
                    }
                    break;
                case -1961995387:
                case -76007829:
                    C0962.m3746();
                    return false;
                case -1853061757:
                case -1658775376:
                    if (C1937.m6279() >= 0) {
                        iM11306 = C19806.m45029("۠ۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24539) ^ 1459155864;
                        i5 = -1151282350;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۛ᩺")) * 9;
                        i4 = ((iM11306 ^ i2) * 3249) ^ (-31628844);
                        i5 = -1511547467;
                    }
                    break;
                case -1627047602:
                case 1312806767:
                    strM18160 = C6730.m18160((Context) null);
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ۧܶ") ^ i2) * (-47);
                        i4 = ((iM11306 ^ i3) * 23787) ^ (-1692258391);
                        i5 = 1432044134;
                    } else {
                        iM11306 = C19806.m45029("۫ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13269)) ^ (-465690296);
                        i5 = 1295495009;
                    }
                    break;
                case -1537937582:
                case -493761699:
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31081)) ^ (-1616634802);
                        i5 = 663829374;
                    } else {
                        iM11306 = C19806.m45029("۬᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25925)) ^ 1610737948;
                        i5 = -630247000;
                    }
                    break;
                case -1512268477:
                case 1582580426:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("۠ۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24539) ^ 1459155864;
                        i5 = -1151282350;
                    } else {
                        iM11306 = (C19806.m45029("ۧܶ") ^ i2) * (-47);
                        i4 = ((iM11306 ^ i3) * 23787) ^ (-1692258391);
                        i5 = 1432044134;
                    }
                    break;
                case -1471040206:
                case 908066617:
                    return !AbstractC0464.m2315(strM18160, str);
                case -1072185288:
                case 424239637:
                    C19806.m45024();
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("ۧܶ") ^ i2) * (-47);
                        i4 = ((iM11306 ^ i3) * 23787) ^ (-1692258391);
                        i5 = 1432044134;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۨ")) * (-81);
                        i4 = ((iM11306 ^ i2) * (-14435)) ^ 13914857;
                        i5 = 1648172444;
                    }
                    break;
                case -1036574191:
                case 2063420017:
                    if (C0797.m3359()) {
                        iM11306 = (C19806.m45029("ۜ᩸") + i2) * 95;
                        i4 = ((iM11306 ^ i3) * 4681) ^ (-1629441002);
                        i5 = 471946582;
                    } else {
                        iM11306 = C19806.m45029("۬᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25925)) ^ 1610737948;
                        i5 = -630247000;
                    }
                    break;
                case -1016816287:
                case 603930789:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۨ")) * (-81);
                        i4 = ((iM11306 ^ i2) * (-14435)) ^ 13914857;
                        i5 = 1648172444;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۘ") + i3) * (-89);
                        i4 = ((iM11306 ^ i2) * 22819) ^ (-1482057086);
                        i5 = 1482749091;
                    }
                    break;
                case -992783025:
                case 1801193140:
                    C0797.m3359();
                    if (CallableC1627.m5507() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19153)) ^ 1624997243;
                        i5 = 1328165752;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۨ")) * (-81);
                        i4 = ((iM11306 ^ i2) * (-14435)) ^ 13914857;
                        i5 = 1648172444;
                    }
                    break;
                case 325691318:
                case 1738175839:
                    if (RunnableC1895.f7152) {
                        iM11306 = (i2 - C19806.m45029("᩻ᩴ")) * 97;
                        i4 = ((iM11306 ^ i3) * (-2015)) ^ 1603629471;
                        i5 = 737853256;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19153)) ^ 1624997243;
                        i5 = 1328165752;
                    }
                    break;
                case 1094694845:
                case 1238422534:
                    str = f36914;
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("۬᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25925)) ^ 1610737948;
                        i5 = -630247000;
                    } else {
                        iM11306 = C19806.m45029("ۚ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6623)) ^ (-1605802794);
                        i5 = -673053173;
                    }
                    break;
                case 1138444292:
                case 1478670914:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19153)) ^ 1624997243;
                        i5 = 1328165752;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18703) ^ 638581242;
                        i5 = -1794651292;
                    }
                    break;
                case 1599651712:
                case 1989787005:
                    C2249.m6915();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۨ")) * (-81);
                    i4 = ((iM11306 ^ i2) * (-14435)) ^ 13914857;
                    i5 = 1648172444;
                    break;
                default:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۨ")) * (-81);
                        i4 = ((iM11306 ^ i2) * (-14435)) ^ 13914857;
                        i5 = 1648172444;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19951) ^ (-237402885);
                        i5 = -1259145994;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -1318815323;
        int i8 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i9 = C2124.f7782;
        int iM45029 = (C19806.m45029("۫۬") ^ i8) * 49;
        int i10 = ((iM45029 ^ i9) * 1731) ^ 1633799349;
        int i11 = -1941418224;
        while (true) {
            i7 = ((((i7 ^ i9) * 12129) >> 31) & i10) ^ (iM45029 ^ i11);
            switch (i7) {
                case -2123741946:
                case 1389758386:
                    if (!C7105.m18985()) {
                        iM45029 = C19806.m45029("۬ᩴ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 16611) ^ (-1309384371);
                        i11 = 1512869635;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۤ") + i9) * 65;
                        i10 = ((iM45029 ^ i8) * 29531) ^ 1207062161;
                        i11 = -1129451849;
                    }
                    break;
                case -1958142105:
                case 702431945:
                    i5 = 45863;
                    iM45029 = C19806.m45029("۠۠") ^ i8;
                    i10 = ((iM45029 ^ i9) * 28981) ^ (-1503232224);
                    i11 = 1699603164;
                    break;
                case -1600189629:
                case -471668435:
                    C0278.m1789();
                    iM45029 = (C19806.m45029("ۧ᩸") + i8) * 21;
                    i10 = ((iM45029 ^ i9) * (-24747)) ^ 508531560;
                    i11 = -767339833;
                    break;
                case -1370031176:
                case 1514872506:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!C2332.f8260) {
                        iM45029 = (C19806.m45029("ۧ᩸") + i8) * 21;
                        i10 = ((iM45029 ^ i9) * (-24747)) ^ 508531560;
                        i11 = -767339833;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽᩴ") ^ i8) * 127;
                        i10 = ((iM45029 ^ i9) * (-5755)) ^ (-1135994013);
                        i11 = -1297955054;
                    }
                    break;
                case -1250756614:
                case 1302962557:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("ۧ᩸") + i8) * 21;
                        i10 = ((iM45029 ^ i9) * (-24747)) ^ 508531560;
                        i11 = -767339833;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֫") ^ i8) * 5;
                        i10 = ((iM45029 ^ i9) * (-11953)) ^ 1757639085;
                        i11 = 1077914224;
                    }
                    break;
                case -1125298595:
                case 286405562:
                    s = sArr[c];
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܰ") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-24655)) ^ (-1122388859);
                        i11 = 1227790301;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽᩴ") ^ i8) * 127;
                        i10 = ((iM45029 ^ i9) * (-5755)) ^ (-1135994013);
                        i11 = -1297955054;
                    }
                    break;
                case -1001444501:
                case 2076584359:
                    sArr2 = f36915;
                    i6 = 415;
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۤ") + i9) * 65;
                        i10 = ((iM45029 ^ i8) * 29531) ^ 1207062161;
                        i11 = -1129451849;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۛ") ^ i9) * 41;
                        i10 = ((iM45029 ^ i8) * (-28957)) ^ 601777874;
                        i11 = -218941326;
                    }
                    break;
                case -1000414236:
                case 1572880358:
                    sArr = f36915;
                    if (C2788.f10625 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽᩴ") ^ i8) * 127;
                        i10 = ((iM45029 ^ i9) * (-5755)) ^ (-1135994013);
                        i11 = -1297955054;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۬") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-23473)) ^ 2070274877;
                        i11 = -1543727394;
                    }
                    break;
                case -731633140:
                case 198718234:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۤ") + i9) * 65;
                        i10 = ((iM45029 ^ i8) * 29531) ^ 1207062161;
                        i11 = -1129451849;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("᩵ۖ")) * 97;
                        i10 = ((iM45029 ^ i9) * 17133) ^ 13561080;
                        i11 = 852279621;
                    }
                    break;
                case -720287252:
                case 1519493477:
                    return C1875.m6105(sArr2, i6, 15, i5);
                case -714321403:
                case 480310434:
                    i2 = i * i;
                    i3 = s * s;
                    if (C3577.f13150 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۤ") + i9) * 65;
                        i10 = ((iM45029 ^ i8) * 29531) ^ 1207062161;
                        i11 = -1129451849;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۡ") ^ i8) * 69;
                        i10 = ((iM45029 ^ i9) * (-31783)) ^ 859493188;
                        i11 = 1052177058;
                    }
                    break;
                case -698526568:
                case 1697798020:
                    c = 414;
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ܰܺ")) * 9;
                        i10 = ((iM45029 ^ i8) * 26459) ^ (-1241323128);
                        i11 = 1847901875;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖᩳ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-21899)) ^ 774081586;
                        i11 = 1720277996;
                    }
                    break;
                case -632681862:
                case 1096091633:
                    i5 = 63992;
                    iM45029 = C19806.m45029("۠۠") ^ i8;
                    i10 = ((iM45029 ^ i9) * 28981) ^ (-1503232224);
                    i11 = 1699603164;
                    break;
                case -528252160:
                case 1522338625:
                    int i12 = i3 + i4;
                    if (i2 - (i12 + i12) <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-28649)) ^ (-437560773);
                        i11 = 1581609549;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۛ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-22699)) ^ 2087547041;
                        i11 = -1378784433;
                    }
                    break;
                case -411249777:
                case 8734424:
                    C1189.m4368();
                    C1377.m4833();
                    return null;
                case -399745478:
                case 495074451:
                    i = s + 1227;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ܰܺ")) * 9;
                        i10 = ((iM45029 ^ i8) * 26459) ^ (-1241323128);
                        i11 = 1847901875;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۟") + i9) * 127;
                        i10 = ((iM45029 ^ i8) * 23023) ^ (-1633780945);
                        i11 = -2080873142;
                    }
                    break;
                case -394948755:
                case -80843844:
                    C2477.m7593();
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۤ") + i9) * 65;
                        i10 = ((iM45029 ^ i8) * 29531) ^ 1207062161;
                        i11 = -1129451849;
                    } else {
                        iM45029 = (C19806.m45029("ۧ᩸") + i8) * 21;
                        i10 = ((iM45029 ^ i9) * (-24747)) ^ 508531560;
                        i11 = -767339833;
                    }
                    break;
                case 283144050:
                case 844898227:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ᩴ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 30435) ^ 1441509953;
                        i11 = 976316872;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ܰܺ")) * 9;
                        i10 = ((iM45029 ^ i8) * 26459) ^ (-1241323128);
                        i11 = 1847901875;
                    }
                    break;
                default:
                    i4 = 1505529;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("۬ᩴ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 16611) ^ (-1309384371);
                        i11 = 1512869635;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۧ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 18427) ^ (-193573049);
                        i11 = 1099083065;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityC10845() {
        int i = -765794869;
        int i2 = C1937.f7317;
        int i3 = C1189.f5284;
        short s = f36915[0];
        super(ThreadFactoryC3888.m11306(C1066.m4040(f36915, 1, 3, ((s * s) + 359216209) - (s * 37906) < 0 ? 2029 : 6244)) ^ 2102849437);
        int iM45029 = C19806.m45029("ۙᩴ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-1419)) ^ (-776044624);
        int i5 = -1492345029;
        while (true) {
            i = ((((i ^ i3) * (-27709)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1123528566:
                case -2214765:
                    return;
                case -242716722:
                case 1286604013:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("ۚܰ") + i3) * (-73);
                        i4 = ((iM45029 ^ i2) * (-13147)) ^ (-332154931);
                        i5 = -945934728;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ֫") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * (-20451)) ^ 747776806;
                        i5 = -256976727;
                    }
                    break;
                case -145197884:
                case 726357303:
                    C1668.m5583();
                    iM45029 = ThreadFactoryC3888.m11306("ۙۘ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 32641) ^ (-222370888);
                    i5 = 905556468;
                    break;
                case 106828968:
                case 1007182905:
                    C3535.m10431();
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("᩸ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3953) ^ 5640817;
                        i5 = -1555876150;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32641) ^ (-222370888);
                        i5 = 905556468;
                    }
                    break;
                case 309500295:
                case 1883888999:
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11933)) ^ (-1314755995);
                        i5 = 1527698600;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32641) ^ (-222370888);
                        i5 = 905556468;
                    }
                    break;
                case 504381857:
                case 1170198746:
                    RunnableC1895.m6170();
                    C2124.m6673();
                    throw new RuntimeException();
                default:
                    C7105.m18985();
                    if (C1977.f7413 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11933)) ^ (-1314755995);
                        i5 = 1527698600;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴܰ")) * 57;
                        i4 = ((iM45029 ^ i3) * (-28291)) ^ (-1019309160);
                        i5 = 1850699118;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0121 A[PHI: r1
      0x0121: PHI (r1v4 android.content.SharedPreferences) = (r1v3 android.content.SharedPreferences), (r1v2 android.content.SharedPreferences) binds: [B:36:0x011f, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f7 A[PHI: r3 r6
      0x01f7: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:56:0x01f5, B:40:0x0158, B:24:0x00b7, B:18:0x009b, B:16:0x0097, B:12:0x0079, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:56:0x01f5, B:40:0x0158, B:24:0x00b7, B:18:0x009b, B:16:0x0097, B:12:0x0079, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0228 A[PHI: r2 r5 r8 r9 r11 r12 r13 r14 r15
      0x0228: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:60:0x0226, B:48:0x01b5, B:32:0x0101, B:28:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x025c A[PHI: r7 r16 r21
      0x025c: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:64:0x025a, B:52:0x01d7, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x025a, B:52:0x01d7, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:64:0x025a, B:52:0x01d7, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static void m27199() {
        int iM11306;
        int i;
        int i2;
        int i3 = C0278.f1572;
        int i4 = RunnableC3388.f12514;
        int iM11307 = ThreadFactoryC3888.m11306("ܽۚ") ^ i3;
        int i5 = ((iM11307 ^ i4) * (-30551)) ^ (-1401686711);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ (-351402764);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 570194577;
        char c = 0;
        String strM9788 = null;
        SharedPreferences sharedPreferences = null;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i4) * 4737) >> 31));
            switch (i16) {
                case -2022490666:
                case -1171713766:
                    C3743.m10966();
                    C1148.m4232();
                    iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i3;
                    i = ((iM11306 ^ i4) * (-2597)) ^ (-438818296);
                    i2 = -1353052068;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2015231032:
                case -974336499:
                    f36914 = C6730.m18160((Context) null);
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-2597)) ^ (-438818296);
                        i2 = -1353052068;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܶ۟")) * 17;
                        i = ((iM11306 ^ i3) * (-16195)) ^ (-1721286393);
                        i2 = 691321270;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1995106566:
                case -1768610972:
                    i8 = s * s;
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-2597)) ^ (-438818296);
                        i2 = -1353052068;
                    } else {
                        iM11306 = C19806.m45029("ܳ᩺") ^ i3;
                        i = ((iM11306 ^ i4) * (-28163)) ^ 1283942829;
                        i2 = -309397241;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1678812152:
                case -1667668745:
                    if (C1066.f4915 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-2597)) ^ (-438818296);
                        i2 = -1353052068;
                    } else {
                        iM11306 = (C19806.m45029("۟ۚ") + i4) * 45;
                        i = ((iM11306 ^ i3) * 26029) ^ 453246941;
                        i2 = 2088252680;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1491047725:
                case 1976843049:
                    i12 = 59500;
                    iM11306 = ThreadFactoryC3888.m11306("ܶ۠") ^ i3;
                    i = ((iM11306 ^ i4) * 14405) ^ 965824063;
                    i2 = -1701452091;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1456967173:
                case 1172774578:
                    f36916 = C3743.m10951(sharedPreferences, strM9788, C1668.m5577(sArr3, i15, i7, i12));
                    break;
                case -1387263542:
                case -159784786:
                    sArr = f36915;
                    c = 4;
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("۟ۚ") + i4) * 45;
                        i = ((iM11306 ^ i3) * 26029) ^ 453246941;
                        i2 = 2088252680;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i3;
                        i = ((iM11306 ^ i4) * 13227) ^ 963658785;
                        i2 = 1257931539;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1376961394:
                case -494485850:
                    i10 = i9 + i9;
                    i11 = s + 7428;
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("ۖܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 3327) ^ 534020742;
                        i2 = -988191707;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨֫") + i3) * 97;
                        i = ((iM11306 ^ i4) * (-10025)) ^ 1939962321;
                        i2 = -1857620547;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1361334522:
                case -937293620:
                    strM9788 = C3286.m9788(sArr2, i13, i14, i12);
                    sArr3 = f36915;
                    i15 = 10;
                    if (C1377.m4833() != 0) {
                        iM11306 = C19806.m45029("ۖܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 3327) ^ 534020742;
                        i2 = -988191707;
                    } else {
                        iM11306 = (C19806.m45029("ۛۘ") + i4) * 87;
                        i = ((iM11306 ^ i3) * 22567) ^ (-1702324059);
                        i2 = -2116026595;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1339791030:
                case 1463056640:
                    sharedPreferences = ApplicationC0716.f2988;
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ܽܳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-30407)) ^ (-1774459383);
                        i2 = 675274970;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܺ᩻")) * 47;
                        i = ((iM11306 ^ i4) * (-21441)) ^ (-1834991022);
                        i2 = -1892465351;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1305620629:
                case 70459:
                    C2477.m7593();
                    break;
                case -1237321997:
                case -895980380:
                    C1875.m6086();
                    if (C3743.m10966() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-2597)) ^ (-438818296);
                        i2 = -1353052068;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۤ") + i3) * 81;
                        i = ((iM11306 ^ i4) * 28731) ^ 868152342;
                        i2 = -922614628;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1123048372:
                case 2121460856:
                    i12 = 46700;
                    iM11306 = ThreadFactoryC3888.m11306("ܶ۠") ^ i3;
                    i = ((iM11306 ^ i4) * 14405) ^ 965824063;
                    i2 = -1701452091;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -663831450:
                case 1309711588:
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-2597)) ^ (-438818296);
                        i2 = -1353052068;
                    } else {
                        iM11306 = C19806.m45029("ܽܳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-30407)) ^ (-1774459383);
                        i2 = 675274970;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -409409789:
                case 167333098:
                    sArr2 = f36915;
                    i13 = 5;
                    i14 = 5;
                    if (C2249.m6915() <= 0) {
                        iM11306 = C19806.m45029("ۖܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 3327) ^ 534020742;
                        i2 = -988191707;
                    } else {
                        iM11306 = C19806.m45029("ۨܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-21771)) ^ (-1578138854);
                        i2 = -1280544471;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -252116025:
                case -220978711:
                    i9 = i8 + 55175184;
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("۟ۚ") + i4) * 45;
                        i = ((iM11306 ^ i3) * 26029) ^ 453246941;
                        i2 = 2088252680;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i4;
                        i = ((iM11306 ^ i3) * 21939) ^ (-25924680);
                        i2 = 2089121265;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 860048281:
                case 2111101097:
                    i7 = 7;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-2597)) ^ (-438818296);
                        i2 = -1353052068;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۤ") ^ i4;
                        i = ((iM11306 ^ i3) * (-17153)) ^ (-1454481323);
                        i2 = -605595343;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1468972140:
                case 2059969037:
                    s = sArr[c];
                    if (C1875.f7103 >= 0) {
                        iM11306 = C19806.m45029("ۖܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 3327) ^ 534020742;
                        i2 = -988191707;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙۤ")) * (-65);
                        i = ((iM11306 ^ i3) * 1595) ^ (-1682336745);
                        i2 = 2003789576;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    if ((i11 * i11) - i10 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܺ") + i4) * (-33);
                        i = ((iM11306 ^ i3) * 23451) ^ 999905187;
                        i2 = -541675862;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i4) * 39;
                        i = ((iM11306 ^ i3) * 15767) ^ (-270536505);
                        i2 = -1255754753;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x064f A[PHI: r0 r4 r5 r6 r16 r20 r22 r24 r29 r30 r31
      0x064f: PHI (r0v12 java.lang.String) = 
      (r0v5 java.lang.String)
      (r0v8 java.lang.String)
      (r0v9 java.lang.String)
      (r0v10 java.lang.String)
      (r0v11 java.lang.String)
      (r0v13 java.lang.String)
     binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r4v4 java.lang.String) = 
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r5v10 l.۬᩶ܰ) = (r5v3 l.۬᩶ܰ), (r5v6 l.۬᩶ܰ), (r5v7 l.۬᩶ܰ), (r5v8 l.۬᩶ܰ), (r5v9 l.۬᩶ܰ), (r5v11 l.۬᩶ܰ) binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r6v4 boolean) = (r6v3 boolean), (r6v2 boolean), (r6v2 boolean), (r6v2 boolean), (r6v2 boolean), (r6v2 boolean) binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r16v4 byte) = (r16v3 byte), (r16v2 byte), (r16v2 byte), (r16v2 byte), (r16v2 byte), (r16v2 byte) binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r20v11 int) = (r20v3 int), (r20v7 int), (r20v8 int), (r20v9 int), (r20v10 int), (r20v13 int) binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r22v10 int) = (r22v3 int), (r22v6 int), (r22v7 int), (r22v8 int), (r22v9 int), (r22v11 int) binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r24v10 short[]) = (r24v3 short[]), (r24v6 short[]), (r24v7 short[]), (r24v8 short[]), (r24v9 short[]), (r24v11 short[]) binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r29v20 boolean) = (r29v2 boolean), (r29v16 boolean), (r29v17 boolean), (r29v18 boolean), (r29v19 boolean), (r29v21 boolean) binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r30v11 l.ۙܺܰ) = (r30v4 l.ۙܺܰ), (r30v7 l.ۙܺܰ), (r30v8 l.ۙܺܰ), (r30v9 l.ۙܺܰ), (r30v10 l.ۙܺܰ), (r30v12 l.ۙܺܰ) binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]
      0x064f: PHI (r31v6 java.lang.String) = 
      (r31v0 java.lang.String)
      (r31v2 java.lang.String)
      (r31v3 java.lang.String)
      (r31v4 java.lang.String)
      (r31v5 java.lang.String)
      (r31v9 java.lang.String)
     binds: [B:112:0x05cb, B:107:0x058f, B:103:0x0556, B:99:0x051d, B:95:0x04ee, B:92:0x04af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:111:0x05c8. Please report as an issue. */
    @Override // l.AbstractActivityC4762
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13232(C2875 c2875, C4751 c4751, Object obj) {
        int i;
        int iM11306;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        boolean z;
        short s;
        short[] sArr;
        String str2;
        int i9;
        int i10;
        int iM11307;
        int i11;
        int i12;
        int iM450210;
        int i13;
        int i14;
        boolean z2;
        String str3;
        int i15;
        int i16;
        short[] sArr2;
        String strM4365;
        boolean z3;
        boolean z4;
        C13344 c13344;
        C4751 c4752;
        short[] sArr3;
        int i17;
        int iM11308;
        int i18;
        int i19;
        boolean z5;
        C4751 c4753;
        boolean z6;
        C13344 c13345;
        short[] sArr4;
        int i20;
        int iM11309;
        int i21;
        int i22;
        int iM113010;
        int i23;
        int i24;
        int i25 = C2124.f7782;
        int i26 = C2477.f9839;
        int iM113011 = (i25 - ThreadFactoryC3888.m11306("ۖۚ")) * 95;
        int i27 = ((iM113011 ^ i26) * 18973) ^ 777635623;
        String strM4230 = null;
        C13344 c13346 = null;
        C4751 c4754 = null;
        String strM7604 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i28 = iM113011 ^ (-2073626425);
        boolean z7 = false;
        boolean z8 = false;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        byte b = 0;
        short s2 = 0;
        int iM450211 = 0;
        String strM13157 = null;
        byte b2 = 0;
        int i33 = 0;
        boolean zM9873 = false;
        int i34 = 474351949;
        String str4 = null;
        C13344 c13344M38029 = null;
        int i35 = 0;
        boolean zM10568 = false;
        while (true) {
            i34 = i28 ^ (i27 & (((i34 ^ i26) * (-19587)) >> 31));
            switch (i34) {
                case -2129433867:
                case -1941501936:
                    str4 = str4;
                    z7 = z7;
                    sArr5 = sArr5;
                    strM13157 = strM13157;
                    i33 = i33;
                    c13346 = c13346;
                    i35 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    s2 = f36915[224];
                    if (RunnableC0195.f1321 >= 0) {
                        iM450210 = C19806.m45029("֡᩹") ^ i26;
                        i13 = ((iM450210 ^ i25) * (-5653)) ^ (-1968736544);
                        i14 = -2046291157;
                    } else {
                        iM450210 = (i26 - C19806.m45029("ܽۨ")) * (-17);
                        i13 = ((iM450210 ^ i25) * (-657)) ^ 1517376201;
                        i14 = 302558030;
                    }
                    int i36 = iM450210 ^ i14;
                    i35 = i35;
                    i33 = i33;
                    strM13157 = strM13157;
                    sArr5 = sArr5;
                    str4 = str4;
                    z3 = z7;
                    i28 = i36;
                    i27 = i13;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z3;
                    break;
                case -1998901172:
                case 1868625860:
                    C0629.m2907();
                    if (C0671.f2816 == 0) {
                        z2 = z7;
                        str3 = strM13157;
                        i15 = i33;
                        c13346 = c13346;
                        i16 = i35;
                        c4754 = c4754;
                        sArr7 = sArr7;
                        strM4365 = str4;
                        sArr2 = sArr5;
                        int iM113012 = (ThreadFactoryC3888.m11306("᩻᩸") ^ i26) * 9;
                        String str5 = str3;
                        i27 = ((iM113012 ^ i25) * (-31123)) ^ 1049150722;
                        short[] sArr9 = sArr2;
                        str4 = strM4365;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z2;
                        i28 = iM113012 ^ 1467300432;
                        i35 = i16;
                        i33 = i15;
                        strM13157 = str5;
                        sArr5 = sArr9;
                    } else {
                        z5 = z7;
                        c4753 = c4754;
                        c13345 = c13346;
                        i20 = i35;
                        sArr4 = sArr7;
                        z6 = zM9873;
                        int iM113013 = ThreadFactoryC3888.m11306("۫۠") ^ i25;
                        C4751 c4755 = c4753;
                        i27 = ((iM113013 ^ i26) * (-5381)) ^ 1023831776;
                        int i37 = iM113013 ^ 1263397243;
                        zM9873 = z6;
                        sArr7 = sArr4;
                        i35 = i20;
                        c4754 = c4755;
                        c13346 = c13345;
                        z7 = z5;
                        i28 = i37;
                    }
                    break;
                case -1935954934:
                case 350525899:
                    if (C3722.f13525 > 0) {
                        str4 = str4;
                        z7 = z7;
                        sArr5 = sArr5;
                        strM13157 = strM13157;
                        i33 = i33;
                        c13346 = c13346;
                        i35 = i35;
                        c4754 = c4754;
                        sArr7 = sArr7;
                        iM450210 = C19806.m45029("֡᩹") ^ i26;
                        i13 = ((iM450210 ^ i25) * (-5653)) ^ (-1968736544);
                        i14 = -2046291157;
                        int i38 = iM450210 ^ i14;
                        i35 = i35;
                        i33 = i33;
                        strM13157 = strM13157;
                        sArr5 = sArr5;
                        str4 = str4;
                        z3 = z7;
                        i28 = i38;
                        i27 = i13;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    } else {
                        z5 = z7;
                        c4753 = c4754;
                        c13345 = c13346;
                        i20 = i35;
                        sArr4 = sArr7;
                        z6 = zM9873;
                        int iM113014 = ThreadFactoryC3888.m11306("۫۠") ^ i25;
                        C4751 c4756 = c4753;
                        i27 = ((iM113014 ^ i26) * (-5381)) ^ 1023831776;
                        int i39 = iM113014 ^ 1263397243;
                        zM9873 = z6;
                        sArr7 = sArr4;
                        i35 = i20;
                        c4754 = c4756;
                        c13346 = c13345;
                        z7 = z5;
                        i28 = i39;
                    }
                    break;
                case -1930096853:
                case -1042543997:
                    z4 = z7;
                    c13344 = c13346;
                    c4752 = c4754;
                    sArr3 = sArr7;
                    short[] sArr10 = sArr6;
                    int i40 = i33;
                    i35 = i35;
                    i17 = i40;
                    switch (b2) {
                        case 0:
                            sArr6 = sArr10;
                            iM11308 = ThreadFactoryC3888.m11306("ۚܺ") ^ i25;
                            i18 = ((iM11308 ^ i26) * (-30703)) ^ 939662781;
                            i19 = -639137254;
                            break;
                        case 1:
                            sArr6 = sArr10;
                            iM11308 = (C19806.m45029("᩻᩷") + i25) * 81;
                            i18 = ((iM11308 ^ i26) * 26623) ^ 949259682;
                            i19 = 271429366;
                            break;
                        case 2:
                            sArr6 = sArr10;
                            iM11308 = (i26 - ThreadFactoryC3888.m11306("᩺᩻")) * 81;
                            i18 = ((iM11308 ^ i25) * (-9407)) ^ 1927239043;
                            i19 = 517722519;
                            break;
                        case 3:
                            sArr6 = sArr10;
                            iM11308 = C19806.m45029("ܰ᩸") ^ i25;
                            i18 = ((iM11308 ^ i26) * (-29895)) ^ 1694765134;
                            i19 = -1433440248;
                            break;
                        case 4:
                            iM11308 = (C19806.m45029("ۢۧ") ^ i26) * (-53);
                            sArr6 = sArr10;
                            i18 = ((iM11308 ^ i25) * (-787)) ^ 393444405;
                            i19 = 1445252296;
                            break;
                        default:
                            sArr6 = sArr10;
                            iM11308 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i25;
                            i18 = ((iM11308 ^ i26) * (-15645)) ^ (-1480476083);
                            i19 = 1156059681;
                            break;
                    }
                    boolean z9 = z4;
                    i28 = iM11308 ^ i19;
                    i27 = i18;
                    sArr7 = sArr3;
                    c4754 = c4752;
                    c13346 = c13344;
                    z7 = z9;
                    int i41 = i35;
                    i33 = i17;
                    i35 = i41;
                    break;
                case -1819707823:
                case -1480998578:
                    C2539.m7921();
                    z4 = z7;
                    c13344 = c13346;
                    c4752 = c4754;
                    sArr3 = sArr7;
                    int i42 = i33;
                    i35 = i35;
                    i17 = i42;
                    iM11308 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i25;
                    i18 = ((iM11308 ^ i26) * (-15645)) ^ (-1480476083);
                    i19 = 1156059681;
                    boolean z10 = z4;
                    i28 = iM11308 ^ i19;
                    i27 = i18;
                    sArr7 = sArr3;
                    c4754 = c4752;
                    c13346 = c13344;
                    z7 = z10;
                    int i43 = i35;
                    i33 = i17;
                    i35 = i43;
                    break;
                case -1705113468:
                case -1438226087:
                    z7 = z7;
                    c13346 = c13346;
                    sArr7 = sArr7;
                    short[] sArr11 = sArr6;
                    int i44 = i33;
                    i35 = i35;
                    i17 = i44;
                    C4751 c4751M31077 = c13346.m31077((CharSequence) C1377.m4832(sArr11, i17, 19, i29));
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        c4754 = c4751M31077;
                        sArr6 = sArr11;
                        i6 = i17;
                        str4 = str4;
                        int iM113015 = ThreadFactoryC3888.m11306("ۘ֫") ^ i26;
                        str4 = str4;
                        z3 = z7;
                        i28 = iM113015 ^ (-1220096868);
                        i27 = ((iM113015 ^ i25) * 10623) ^ (-1366844703);
                        i35 = i35;
                        i33 = i6;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    } else {
                        int iM450212 = C19806.m45029("᩶᩷") ^ i26;
                        i27 = ((iM450212 ^ i25) * (-11749)) ^ 1025631183;
                        int i45 = iM450212 ^ (-806649939);
                        sArr6 = sArr11;
                        sArr7 = sArr7;
                        c4754 = c4751M31077;
                        c13346 = c13346;
                        z7 = z7;
                        i28 = i45;
                        int i46 = i35;
                        i33 = i17;
                        i35 = i46;
                    }
                    break;
                case -1632867159:
                case -585745286:
                    RunnableC3388.m10064();
                    if (!C19806.f63586) {
                        z7 = z7;
                        c13346 = c13346;
                        c4754 = c4754;
                        sArr7 = sArr7;
                        i6 = i33;
                        i35 = i35;
                        int iM113016 = ThreadFactoryC3888.m11306("ۘ֫") ^ i26;
                        str4 = str4;
                        z3 = z7;
                        i28 = iM113016 ^ (-1220096868);
                        i27 = ((iM113016 ^ i25) * 10623) ^ (-1366844703);
                        i35 = i35;
                        i33 = i6;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    } else {
                        z5 = z7;
                        c4753 = c4754;
                        c13345 = c13346;
                        i20 = i35;
                        sArr4 = sArr7;
                        z6 = zM9873;
                        int iM113017 = ThreadFactoryC3888.m11306("۫۠") ^ i25;
                        C4751 c4757 = c4753;
                        i27 = ((iM113017 ^ i26) * (-5381)) ^ 1023831776;
                        int i310 = iM113017 ^ 1263397243;
                        zM9873 = z6;
                        sArr7 = sArr4;
                        i35 = i20;
                        c4754 = c4757;
                        c13346 = c13345;
                        z7 = z5;
                        i28 = i310;
                    }
                    break;
                case -1631236765:
                case 870785488:
                    str = str4;
                    z = z7;
                    sArr = sArr5;
                    str2 = strM13157;
                    i9 = i33;
                    c13346 = c13346;
                    i10 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    s = s2;
                    int i47 = s + 18189;
                    if ((i47 * i47) - (s * 72756) < 0) {
                        iM11307 = C19806.m45029("ܽ᩸") ^ i25;
                        i11 = ((iM11307 ^ i26) * (-22321)) ^ 81794166;
                        i12 = 21753797;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۙ֡") ^ i26;
                        i11 = ((iM11307 ^ i25) * 31729) ^ (-1108001406);
                        i12 = 770205102;
                    }
                    int i48 = iM11307 ^ i12;
                    s2 = s;
                    i27 = i11;
                    i35 = i10;
                    i33 = i9;
                    strM13157 = str2;
                    sArr5 = sArr;
                    str4 = str;
                    z3 = z;
                    i28 = i48;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z3;
                    break;
                case -1607711227:
                case 995714821:
                    z7 = z7;
                    strM7604 = C2477.m7604(f36915, 355, 35, i29);
                    if (C10634.m26820()) {
                        iM11309 = ThreadFactoryC3888.m11306("ۚ֫") ^ i25;
                        i21 = ((iM11309 ^ i26) * (-17431)) ^ (-399326308);
                        i22 = 419146718;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ۢۨ") ^ i25;
                        i21 = ((iM11309 ^ i26) * (-11453)) ^ 264875706;
                        i22 = -980799144;
                    }
                    z3 = z7;
                    i28 = iM11309 ^ i22;
                    i27 = i21;
                    z7 = z3;
                    break;
                case -1502837577:
                case 1084169480:
                    c13344M38029.m31077((CharSequence) C1461.m5070(sArr8, i32, i31, i29)).m13154(zM10568);
                    C2539.m7921();
                    return z8;
                case -1498305253:
                case 1886957657:
                    if (C1977.f7413 > 0) {
                        iM113010 = (C19806.m45029("ۜ۠") + i25) * 27;
                        i23 = ((iM113010 ^ i26) * 8865) ^ (-645605649);
                        i24 = -1649375571;
                        i28 = iM113010 ^ i24;
                        i27 = i23;
                    } else {
                        str4 = str4;
                        z7 = z7;
                        sArr5 = sArr5;
                        strM13157 = strM13157;
                        i33 = i33;
                        c13346 = c13346;
                        i35 = i35;
                        c4754 = c4754;
                        sArr7 = sArr7;
                        iM450210 = C19806.m45029("֡᩹") ^ i26;
                        i13 = ((iM450210 ^ i25) * (-5653)) ^ (-1968736544);
                        i14 = -2046291157;
                        int i311 = iM450210 ^ i14;
                        i35 = i35;
                        i33 = i33;
                        strM13157 = strM13157;
                        sArr5 = sArr5;
                        str4 = str4;
                        z3 = z7;
                        i28 = i311;
                        i27 = i13;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    }
                    break;
                case -1367550031:
                case 838434201:
                    i35 = i35;
                    z7 = z7;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    zM9873 = ViewTreeObserverOnPreDrawListenerC3327.m9873((Boolean) obj);
                    C13344 c13344M380210 = c2875.m38029();
                    sArr6 = f36915;
                    i6 = 314;
                    if (C1937.f7317 >= 0) {
                        c13346 = c13344M380210;
                        str4 = str4;
                        int iM113018 = ThreadFactoryC3888.m11306("ۘ֫") ^ i26;
                        str4 = str4;
                        z3 = z7;
                        i28 = iM113018 ^ (-1220096868);
                        i27 = ((iM113018 ^ i25) * 10623) ^ (-1366844703);
                        i35 = i35;
                        i33 = i6;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    } else {
                        int iM113019 = ThreadFactoryC3888.m11306("ܳۧ") ^ i26;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13344M380210;
                        i27 = ((iM113019 ^ i25) * 3995) ^ (-1876159690);
                        z7 = z7;
                        i28 = iM113019 ^ (-361764738);
                        i35 = i35;
                        i33 = 314;
                    }
                    break;
                case -1307481323:
                case -1298836986:
                    c13344M38029.m31077((CharSequence) strM7604).m13154(zM10568);
                    sArr8 = f36915;
                    i32 = 390;
                    i31 = 24;
                    if (C0671.f2816 != 0) {
                        iM11309 = C19806.m45029("᩸᩶") ^ i25;
                        z7 = z7;
                        i21 = ((iM11309 ^ i26) * (-29713)) ^ 338305524;
                        i22 = -83663617;
                    } else {
                        z7 = z7;
                        iM11309 = C19806.m45029("ܽܳ") ^ i26;
                        i21 = ((iM11309 ^ i25) * 6843) ^ 17344190;
                        i22 = 816774256;
                    }
                    z3 = z7;
                    i28 = iM11309 ^ i22;
                    i27 = i21;
                    z7 = z3;
                    break;
                case -1286973261:
                case -1156518126:
                    str4 = str4;
                    z7 = z7;
                    i = i33;
                    c13346 = c13346;
                    i35 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    strM13157 = c4751.m13157();
                    RunnableC3388.m10051(strM13157);
                    iM450211 = C19806.m45029(strM13157);
                    sArr5 = f36915;
                    if (C3535.f13026 > 0) {
                        iM45029 = (C19806.m45029("᩻ۢ") ^ i26) * 25;
                        i4 = ((iM45029 ^ i25) * (-25631)) ^ (-1599895273);
                        i5 = 5683746;
                        i7 = iM45029 ^ i5;
                        str4 = str4;
                        int i49 = i;
                        strM13157 = strM13157;
                        i27 = i4;
                        i35 = i35;
                        i33 = i49;
                        boolean z11 = z7;
                        i28 = i7;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z11;
                    } else {
                        i6 = i;
                        strM13157 = strM13157;
                        int iM1130110 = ThreadFactoryC3888.m11306("ۘ֫") ^ i26;
                        str4 = str4;
                        z3 = z7;
                        i28 = iM1130110 ^ (-1220096868);
                        i27 = ((iM1130110 ^ i25) * 10623) ^ (-1366844703);
                        i35 = i35;
                        i33 = i6;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    }
                    break;
                case -1154374335:
                case 606262401:
                    str4 = str4;
                    z7 = z7;
                    strM13157 = strM13157;
                    i = i33;
                    c13346 = c13346;
                    i35 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    if (C1460.m5058(strM13157, C1377.m4832(f36915, 289, 20, i29))) {
                        iM45029 = C19806.m45029("ۛ֨") ^ i26;
                        i4 = ((iM45029 ^ i25) * (-19705)) ^ 1202257766;
                        i5 = -2052871933;
                    } else {
                        b2 = b;
                        iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                        i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                        i5 = 1353616763;
                    }
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i410 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i410;
                    boolean z12 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z12;
                    break;
                case -1076283518:
                case -920219263:
                    z5 = z7;
                    c4753 = c4754;
                    z6 = zM9873;
                    c13345 = c13346;
                    c4753.m13154(z6);
                    sArr4 = f36915;
                    i20 = 22;
                    if (C1148.f5161 <= 0) {
                        i30 = 333;
                        int iM1130111 = ThreadFactoryC3888.m11306("۫۠") ^ i25;
                        C4751 c4758 = c4753;
                        i27 = ((iM1130111 ^ i26) * (-5381)) ^ 1023831776;
                        int i312 = iM1130111 ^ 1263397243;
                        zM9873 = z6;
                        sArr7 = sArr4;
                        i35 = i20;
                        c4754 = c4758;
                        c13346 = c13345;
                        z7 = z5;
                        i28 = i312;
                    } else {
                        int iM113020 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i25;
                        zM9873 = z6;
                        sArr7 = sArr4;
                        c4754 = c4753;
                        i35 = 22;
                        c13346 = c13345;
                        z7 = z5;
                        i28 = iM113020 ^ 91009175;
                        i27 = ((iM113020 ^ i26) * 18645) ^ 1498088252;
                        i30 = 333;
                    }
                    break;
                case -1068811198:
                case -163979971:
                    C2871.m8646();
                    if (AbstractC0464.f2088 > 0) {
                        iM113010 = ThreadFactoryC3888.m11306("۠ۤ") ^ i25;
                        i23 = ((iM113010 ^ i26) * 30487) ^ (-1564426268);
                        i24 = -382257498;
                        i28 = iM113010 ^ i24;
                        i27 = i23;
                    } else {
                        z5 = z7;
                        c4753 = c4754;
                        c13345 = c13346;
                        i20 = i35;
                        sArr4 = sArr7;
                        z6 = zM9873;
                        int iM1130112 = ThreadFactoryC3888.m11306("۫۠") ^ i25;
                        C4751 c4759 = c4753;
                        i27 = ((iM1130112 ^ i26) * (-5381)) ^ 1023831776;
                        int i313 = iM1130112 ^ 1263397243;
                        zM9873 = z6;
                        sArr7 = sArr4;
                        i35 = i20;
                        c4754 = c4759;
                        c13346 = c13345;
                        z7 = z5;
                        i28 = i313;
                    }
                    break;
                case -1039987564:
                case 218728605:
                    z7 = z7;
                    strM13157 = strM13157;
                    c13346 = c13346;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    int i50 = i33;
                    i35 = i35;
                    if (C1460.m5058(strM13157, str4)) {
                        int iM113021 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i26;
                        i = i50;
                        i4 = ((iM113021 ^ i25) * (-1137)) ^ 714797260;
                        i7 = iM113021 ^ (-1353823885);
                    } else {
                        i = i50;
                        str4 = str4;
                        b2 = b;
                        iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                        i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                        i5 = 1353616763;
                        i7 = iM45029 ^ i5;
                        str4 = str4;
                    }
                    int i411 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i411;
                    boolean z13 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z13;
                    break;
                case -948497503:
                case 2084269706:
                    C0817.m3399();
                    z5 = z7;
                    c4753 = c4754;
                    c13345 = c13346;
                    i20 = i35;
                    sArr4 = sArr7;
                    z6 = zM9873;
                    int iM1130113 = ThreadFactoryC3888.m11306("۫۠") ^ i25;
                    C4751 c47510 = c4753;
                    i27 = ((iM1130113 ^ i26) * (-5381)) ^ 1023831776;
                    int i314 = iM1130113 ^ 1263397243;
                    zM9873 = z6;
                    sArr7 = sArr4;
                    i35 = i20;
                    c4754 = c47510;
                    c13346 = c13345;
                    z7 = z5;
                    i28 = i314;
                    break;
                case -915657887:
                case -100662716:
                    z7 = z7;
                    zM10568 = C3577.m10568((Boolean) obj);
                    c13344M38029 = c2875.m38029();
                    c13344M38029.m31077((CharSequence) str4).m13154(zM10568);
                    if (C2249.m6915() > 0) {
                        iM11309 = ThreadFactoryC3888.m11306("ܿۜ") ^ i26;
                        i21 = ((iM11309 ^ i25) * 16271) ^ (-1394907928);
                        i22 = -803362922;
                        z3 = z7;
                        i28 = iM11309 ^ i22;
                        i27 = i21;
                        z7 = z3;
                    } else {
                        c13346 = c13346;
                        c4754 = c4754;
                        sArr7 = sArr7;
                        i6 = i33;
                        i35 = i35;
                        int iM1130114 = ThreadFactoryC3888.m11306("ۘ֫") ^ i26;
                        str4 = str4;
                        z3 = z7;
                        i28 = iM1130114 ^ (-1220096868);
                        i27 = ((iM1130114 ^ i25) * 10623) ^ (-1366844703);
                        i35 = i35;
                        i33 = i6;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    }
                    break;
                case -811589412:
                case 120333127:
                    i8 = i33;
                    b2 = 2;
                    i = i8;
                    iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                    i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                    i5 = 1353616763;
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i412 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i412;
                    boolean z14 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z14;
                    break;
                case -585887925:
                case 1934170496:
                    recreate();
                    return z8;
                case -567515307:
                case 1020703269:
                    C1977.m6356();
                    return false;
                case -545278564:
                case 103904268:
                    i8 = i33;
                    b2 = 4;
                    i = i8;
                    iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                    i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                    i5 = 1353616763;
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i413 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i413;
                    boolean z15 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z15;
                    break;
                case -435980386:
                case 1262014210:
                    str = str4;
                    z = z7;
                    s = s2;
                    sArr = sArr5;
                    str2 = strM13157;
                    i9 = i33;
                    c13346 = c13346;
                    i10 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    if (AbstractC0464.m2313() != 0) {
                        iM11307 = C19806.m45029("ۨ᩺") ^ i26;
                        i11 = ((iM11307 ^ i25) * (-15751)) ^ 937718531;
                        i12 = 346699784;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩹ۛ") ^ i25;
                        i11 = ((iM11307 ^ i26) * (-857)) ^ 1436534484;
                        i12 = -158607492;
                    }
                    int i414 = iM11307 ^ i12;
                    s2 = s;
                    i27 = i11;
                    i35 = i10;
                    i33 = i9;
                    strM13157 = str2;
                    sArr5 = sArr;
                    str4 = str;
                    z3 = z;
                    i28 = i414;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z3;
                    break;
                case -354218175:
                case 1993380629:
                    i29 = 54729;
                    iM450210 = (ThreadFactoryC3888.m11306("ܰܰ") + i25) * 123;
                    i13 = ((iM450210 ^ i26) * 7785) ^ 153578206;
                    i14 = -882003462;
                    int i315 = iM450210 ^ i14;
                    i35 = i35;
                    i33 = i33;
                    strM13157 = strM13157;
                    sArr5 = sArr5;
                    str4 = str4;
                    z3 = z7;
                    i28 = i315;
                    i27 = i13;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z3;
                    break;
                case -347322957:
                case -203014983:
                    i8 = i33;
                    b2 = 3;
                    i = i8;
                    iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                    i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                    i5 = 1353616763;
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i415 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i415;
                    boolean z16 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z16;
                    break;
                case -267676905:
                case 1574550184:
                    i29 = 5648;
                    iM450210 = (ThreadFactoryC3888.m11306("ܰܰ") + i25) * 123;
                    i13 = ((iM450210 ^ i26) * 7785) ^ 153578206;
                    i14 = -882003462;
                    int i316 = iM450210 ^ i14;
                    i35 = i35;
                    i33 = i33;
                    strM13157 = strM13157;
                    sArr5 = sArr5;
                    str4 = str4;
                    z3 = z7;
                    i28 = i316;
                    i27 = i13;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z3;
                    break;
                case -189709533:
                case 643727358:
                    z2 = z7;
                    str3 = strM13157;
                    i15 = i33;
                    c13346 = c13346;
                    i16 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    sArr2 = sArr5;
                    strM4365 = C1189.m4365(sArr2, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 31, i29);
                    if (C0216.f1393 == 0) {
                        int iM450213 = C19806.m45029("ܶۛ") ^ i25;
                        z3 = z2;
                        i28 = iM450213 ^ 1132052346;
                        i27 = ((iM450213 ^ i26) * (-28951)) ^ 126488787;
                        i35 = i16;
                        i33 = i15;
                        strM13157 = str3;
                        sArr5 = sArr2;
                        str4 = strM4365;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    } else {
                        int iM1130115 = (ThreadFactoryC3888.m11306("᩻᩸") ^ i26) * 9;
                        String str6 = str3;
                        i27 = ((iM1130115 ^ i25) * (-31123)) ^ 1049150722;
                        short[] sArr12 = sArr2;
                        str4 = strM4365;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z2;
                        i28 = iM1130115 ^ 1467300432;
                        i35 = i16;
                        i33 = i15;
                        strM13157 = str6;
                        sArr5 = sArr12;
                    }
                    break;
                case -174950976:
                case 1247861214:
                    i8 = i33;
                    b2 = 1;
                    i = i8;
                    iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                    i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                    i5 = 1353616763;
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i416 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i416;
                    boolean z17 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z17;
                    break;
                case 13552824:
                case 508732812:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        str = str4;
                        z = z7;
                        s = s2;
                        sArr = sArr5;
                        str2 = strM13157;
                        i9 = i33;
                        c13346 = c13346;
                        i10 = i35;
                        c4754 = c4754;
                        sArr7 = sArr7;
                        iM11307 = C19806.m45029("ۨ᩺") ^ i26;
                        i11 = ((iM11307 ^ i25) * (-15751)) ^ 937718531;
                        i12 = 346699784;
                        int i417 = iM11307 ^ i12;
                        s2 = s;
                        i27 = i11;
                        i35 = i10;
                        i33 = i9;
                        strM13157 = str2;
                        sArr5 = sArr;
                        str4 = str;
                        z3 = z;
                        i28 = i417;
                        sArr7 = sArr7;
                        c4754 = c4754;
                        c13346 = c13346;
                        z7 = z3;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("۠ۤ") ^ i25;
                        i23 = ((iM113010 ^ i26) * 30487) ^ (-1564426268);
                        i24 = -382257498;
                        i28 = iM113010 ^ i24;
                        i27 = i23;
                    }
                    break;
                case 39633003:
                case 1097724148:
                    str4 = str4;
                    z7 = z7;
                    strM13157 = strM13157;
                    i = i33;
                    c13346 = c13346;
                    i35 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    if (C1460.m5058(strM13157, C0050.m940(f36915, 271, 18, i29))) {
                        iM45029 = (C19806.m45029("ۡ᩻") ^ i25) * 87;
                        i4 = ((iM45029 ^ i26) * 14977) ^ (-2062411410);
                        i5 = 1673045931;
                    } else {
                        b2 = b;
                        iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                        i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                        i5 = 1353616763;
                    }
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i418 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i418;
                    boolean z18 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z18;
                    break;
                case 187558728:
                case 1687932532:
                    if (C3535.f13026 > 0) {
                        iM11309 = C19806.m45029("᩸᩶") ^ i25;
                        z7 = z7;
                        i21 = ((iM11309 ^ i26) * (-29713)) ^ 338305524;
                        i22 = -83663617;
                        z3 = z7;
                        i28 = iM11309 ^ i22;
                        i27 = i21;
                        z7 = z3;
                    }
                    z7 = z7;
                    c13346 = c13346;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    i6 = i33;
                    i35 = i35;
                    int iM1130116 = ThreadFactoryC3888.m11306("ۘ֫") ^ i26;
                    str4 = str4;
                    z3 = z7;
                    i28 = iM1130116 ^ (-1220096868);
                    i27 = ((iM1130116 ^ i25) * 10623) ^ (-1366844703);
                    i35 = i35;
                    i33 = i6;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z3;
                    break;
                case 527224485:
                case 1579917021:
                    str4 = str4;
                    z7 = z7;
                    strM13157 = strM13157;
                    i = i33;
                    c13346 = c13346;
                    i35 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    if (C1460.m5058(strM13157, strM4230)) {
                        iM45029 = C19806.m45029("᩹ܳ") ^ i26;
                        i4 = ((iM45029 ^ i25) * (-18181)) ^ 239918430;
                        i5 = 1998462579;
                    } else {
                        b2 = b;
                        iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                        i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                        i5 = 1353616763;
                    }
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i419 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i419;
                    boolean z19 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z19;
                    break;
                case 533795794:
                case 913361130:
                    z7 = z7;
                    strM13157 = strM13157;
                    i = i33;
                    c13346 = c13346;
                    i35 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    str4 = str4;
                    if (C1460.m5058(strM13157, C3286.m9788(f36915, 309, 5, i29))) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩸") ^ i25;
                        i4 = ((iM45029 ^ i26) * 24483) ^ 171785909;
                        i5 = -1663628696;
                    } else {
                        b2 = b;
                        iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                        i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                        i5 = 1353616763;
                    }
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i4110 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i4110;
                    boolean z110 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z110;
                    break;
                case 723158343:
                case 887283476:
                    str4 = str4;
                    strM13157 = strM13157;
                    i = i33;
                    c13346 = c13346;
                    i35 = i35;
                    c4754 = c4754;
                    sArr7 = sArr7;
                    strM4230 = C1148.m4230(f36915, 256, 15, i29);
                    z8 = true;
                    b = -1;
                    switch (iM450211) {
                        case -1530596193:
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۛ") + i26) * (-119);
                            i2 = ((iM11306 ^ i25) * (-25667)) ^ (-2122043442);
                            i3 = -627955899;
                            i28 = iM11306 ^ i3;
                            i35 = i35;
                            sArr7 = sArr7;
                            c4754 = c4754;
                            c13346 = c13346;
                            i33 = i;
                            z7 = false;
                            strM13157 = strM13157;
                            i27 = i2;
                            str4 = str4;
                            break;
                        case -781296003:
                            iM11306 = ThreadFactoryC3888.m11306("۟᩻") ^ i26;
                            i2 = ((iM11306 ^ i25) * 9135) ^ 366429527;
                            i3 = 1410546963;
                            i28 = iM11306 ^ i3;
                            i35 = i35;
                            sArr7 = sArr7;
                            c4754 = c4754;
                            c13346 = c13346;
                            i33 = i;
                            z7 = false;
                            strM13157 = strM13157;
                            i27 = i2;
                            str4 = str4;
                            break;
                        case -751269786:
                            iM11306 = C19806.m45029("ۡ᩶") ^ i25;
                            i2 = ((iM11306 ^ i26) * (-24993)) ^ (-656015672);
                            i3 = 1761060635;
                            i28 = iM11306 ^ i3;
                            i35 = i35;
                            sArr7 = sArr7;
                            c4754 = c4754;
                            c13346 = c13346;
                            i33 = i;
                            z7 = false;
                            strM13157 = strM13157;
                            i27 = i2;
                            str4 = str4;
                            break;
                        case 110327241:
                            iM11306 = (i25 - C19806.m45029("ܽ᩺")) * 49;
                            i2 = ((iM11306 ^ i26) * (-10351)) ^ (-2084455400);
                            i3 = -756782300;
                            i28 = iM11306 ^ i3;
                            i35 = i35;
                            sArr7 = sArr7;
                            c4754 = c4754;
                            c13346 = c13346;
                            i33 = i;
                            z7 = false;
                            strM13157 = strM13157;
                            i27 = i2;
                            str4 = str4;
                            break;
                        case 1220393877:
                            iM11306 = ThreadFactoryC3888.m11306("᩸ܺ") ^ i26;
                            i2 = ((iM11306 ^ i25) * 21033) ^ 1462498102;
                            i3 = -1305398856;
                            i28 = iM11306 ^ i3;
                            i35 = i35;
                            sArr7 = sArr7;
                            c4754 = c4754;
                            c13346 = c13346;
                            i33 = i;
                            z7 = false;
                            strM13157 = strM13157;
                            i27 = i2;
                            str4 = str4;
                            break;
                        default:
                            z7 = false;
                            b2 = b;
                            iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                            i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                            i5 = 1353616763;
                            i7 = iM45029 ^ i5;
                            str4 = str4;
                            int i4111 = i;
                            strM13157 = strM13157;
                            i27 = i4;
                            i35 = i35;
                            i33 = i4111;
                            boolean z111 = z7;
                            i28 = i7;
                            sArr7 = sArr7;
                            c4754 = c4754;
                            c13346 = c13346;
                            z7 = z111;
                            break;
                    }
                    break;
                case 863022905:
                case 994902614:
                    return z7;
                case 1088529055:
                case 1621937194:
                    String str7 = (String) obj;
                    ApplicationC0716.f2988.edit().putString(strM4230, str7).commit();
                    C6730.m18171(this, str7);
                    return z8;
                case 1685249341:
                case 1928845379:
                    c13346.m31077((CharSequence) RunnableC0195.m1429(sArr7, i30, i35, i29)).m13154(zM9873);
                    C11359.m28442();
                    return z8;
                default:
                    i8 = i33;
                    b2 = 0;
                    i = i8;
                    iM45029 = (i25 - C19806.m45029("ۛ᩶")) * (-11);
                    i4 = ((iM45029 ^ i26) * 21029) ^ 1153634014;
                    i5 = 1353616763;
                    i7 = iM45029 ^ i5;
                    str4 = str4;
                    int i4112 = i;
                    strM13157 = strM13157;
                    i27 = i4;
                    i35 = i35;
                    i33 = i4112;
                    boolean z112 = z7;
                    i28 = i7;
                    sArr7 = sArr7;
                    c4754 = c4754;
                    c13346 = c13346;
                    z7 = z112;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01e1 A[PHI: r4 r6 r19
      0x01e1: PHI (r4v5 l.ۙܺܰ) = (r4v4 l.ۙܺܰ), (r4v2 l.ۙܺܰ) binds: [B:45:0x01df, B:37:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v5 java.lang.String) binds: [B:45:0x01df, B:37:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r19v15 short) = (r19v14 short), (r19v16 short) binds: [B:45:0x01df, B:37:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0244 A[PHI: r2 r3 r8 r12 r13 r19
      0x0244: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:53:0x0242, B:49:0x021d, B:29:0x0126, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r3v4 boolean) = (r3v2 boolean), (r3v3 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:53:0x0242, B:49:0x021d, B:29:0x0126, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r8v4 boolean) = (r8v2 boolean), (r8v2 boolean), (r8v3 boolean), (r8v2 boolean) binds: [B:53:0x0242, B:49:0x021d, B:29:0x0126, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:53:0x0242, B:49:0x021d, B:29:0x0126, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:53:0x0242, B:49:0x021d, B:29:0x0126, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r19v26 short) = (r19v12 short), (r19v13 short), (r19v17 short), (r19v27 short) binds: [B:53:0x0242, B:49:0x021d, B:29:0x0126, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02db A[PHI: r10 r14 r15
      0x02db: PHI (r10v27 short) = (r10v7 short), (r10v24 short), (r10v2 short) binds: [B:66:0x02d9, B:26:0x00f9, B:11:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:66:0x02d9, B:26:0x00f9, B:11:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:66:0x02d9, B:26:0x00f9, B:11:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC4762
    /* JADX INFO: renamed from: ۙ */
    public final void mo13231(C2875 c2875, C13344 c13344) {
        int iM11306;
        int i;
        int i2;
        short[] sArr;
        short s;
        int iM45029;
        int i3;
        int i4;
        int iM450210;
        int i5;
        C13344 c13345 = c13344;
        int i6 = C1937.f7317;
        int i7 = C1875.f7103;
        int iM11307 = ThreadFactoryC3888.m11306("۠ᩴ") ^ i7;
        int i8 = ((iM11307 ^ i6) * 11897) ^ (-1675002362);
        String strM10571 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i9 = iM11307 ^ (-883156333);
        String strM2906 = null;
        boolean zM38263 = false;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1262420481;
        String strM8172 = null;
        C4751 c4751M31077 = null;
        C4751 c4751M31078 = null;
        boolean zM38264 = false;
        while (true) {
            i13 = i9 ^ (i8 & (((i13 ^ i6) * (-10453)) >> 31));
            switch (i13) {
                case -2096590316:
                case 453730216:
                    i10 = 36494;
                    iM11306 = (i7 - ThreadFactoryC3888.m11306("ۙۗ")) * (-19);
                    i = ((iM11306 ^ i6) * (-16347)) ^ 1670472583;
                    i2 = -693825312;
                    int i14 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i14;
                    i8 = i;
                    break;
                case -1902646043:
                case -1343025208:
                    s2 = sArr2[30];
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("֨ۢ") + i7) * 39;
                        i = ((iM45029 ^ i6) * 13675) ^ 1115265299;
                        i3 = 1906189351;
                    } else {
                        iM45029 = C19806.m45029("᩻֡") ^ i7;
                        i = ((iM45029 ^ i6) * (-22247)) ^ 1493015129;
                        i3 = -838420481;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i;
                    break;
                case -1733974722:
                case 1000799059:
                    s2 = s2;
                    zM38264 = ((C10522) c13345.m31077((CharSequence) strM2906)).m38263();
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ܳᩳ") ^ i6;
                        i = ((iM11306 ^ i7) * 27867) ^ 2024771692;
                        i2 = -216947637;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩺") ^ i7;
                        i = ((iM11306 ^ i6) * (-25707)) ^ 1205691177;
                        i2 = 1038067871;
                    }
                    int i15 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i15;
                    i8 = i;
                    break;
                case -1525946858:
                case -300429199:
                    C2124.m6673();
                    if (C2249.f8050 < 0) {
                        iM45029 = (C19806.m45029("ۚ۠") ^ i6) * 89;
                        i = ((iM45029 ^ i7) * 28331) ^ 1314697550;
                        i3 = -1945062666;
                        i9 = iM45029 ^ i3;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        s = s2;
                        int iM450211 = C19806.m45029("֡ۢ") ^ i6;
                        int i16 = ((iM450211 ^ i7) * 10625) ^ 362489438;
                        i9 = iM450211 ^ 1162316376;
                        sArr2 = sArr;
                        s2 = s;
                        i8 = i16;
                        c13345 = c13344;
                    }
                    break;
                case -1359263148:
                case 1161560363:
                    C2332.m7079();
                    break;
                case -1348999726:
                case 1157987001:
                    s2 = s2;
                    c13345.m31077((CharSequence) C2642.m8172(sArr4, i12, 22, i10)).m13154(zM38263);
                    if (C7006.f23572) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i7;
                        i = ((iM11306 ^ i6) * (-29499)) ^ (-627846422);
                        i2 = -892680451;
                    } else {
                        iM11306 = (C19806.m45029("ܰᩳ") + i6) * (-51);
                        i = ((iM11306 ^ i7) * (-1221)) ^ (-693603649);
                        i2 = 1485913273;
                    }
                    int i17 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i17;
                    i8 = i;
                    break;
                case -1025264495:
                case 639587216:
                    i10 = 17590;
                    iM11306 = (i7 - ThreadFactoryC3888.m11306("ۙۗ")) * (-19);
                    i = ((iM11306 ^ i6) * (-16347)) ^ 1670472583;
                    i2 = -693825312;
                    int i18 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i18;
                    i8 = i;
                    break;
                case -784188325:
                case 624205524:
                    short s3 = s2;
                    s = s3;
                    int i19 = s + 12742;
                    if ((i19 * i19) - (s3 * 50968) < 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ܽۘ") ^ i7;
                        i4 = ((iM450210 ^ i6) * 11479) ^ 768846540;
                        i5 = -852580602;
                    } else {
                        iM450210 = C19806.m45029("ܰۢ") ^ i6;
                        i4 = ((iM450210 ^ i7) * 8009) ^ (-750353346);
                        i5 = 1756627659;
                    }
                    i9 = iM450210 ^ i5;
                    i8 = i4;
                    s2 = s;
                    break;
                case -746847235:
                case 1819051598:
                    s2 = s2;
                    c4751M31077.m13154(zM38264);
                    strM8172 = C2642.m8172(f36915, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 24, i10);
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("᩻᩷") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i6) * 133) ^ (-955181944);
                        i2 = 1160805408;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩸") ^ i7) * (-63);
                        i = ((iM11306 ^ i6) * (-177)) ^ 23398626;
                        i2 = -137714985;
                    }
                    int i110 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i110;
                    i8 = i;
                    break;
                case -689023956:
                case -338714829:
                    s2 = s2;
                    c4751M31078 = c13345.m31077((CharSequence) C0962.m3747(f36915, 51, 31, i10));
                    if (C2332.m7079() <= 0) {
                        iM11306 = (C19806.m45029("᩻᩷") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i6) * 133) ^ (-955181944);
                        i2 = 1160805408;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟᩸") + i6) * (-25);
                        i = ((iM11306 ^ i7) * o.a.F) ^ 2117248147;
                        i2 = -283646887;
                    }
                    int i111 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i111;
                    i8 = i;
                    break;
                case -655892419:
                case 188523675:
                    if (C2477.f9839 <= 0) {
                        s2 = s2;
                        iM11306 = C19806.m45029("ܳᩳ") ^ i6;
                        i = ((iM11306 ^ i7) * 27867) ^ 2024771692;
                        i2 = -216947637;
                        int i112 = iM11306 ^ i2;
                        s2 = s2;
                        i9 = i112;
                        i8 = i;
                    }
                    iM45029 = (C19806.m45029("ۚ۠") ^ i6) * 89;
                    i = ((iM45029 ^ i7) * 28331) ^ 1314697550;
                    i3 = -1945062666;
                    i9 = iM45029 ^ i3;
                    i8 = i;
                    break;
                case -378430998:
                case 2112244664:
                    s2 = s2;
                    c13345.m31077((CharSequence) strM8172).m13154(zM38264);
                    strM10571 = C3577.m10571(f36915, 141, 18, i10);
                    if (C1937.f7317 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۫") ^ i6;
                        i = ((iM11306 ^ i7) * 12141) ^ 1746861559;
                        i2 = -1622603352;
                        int i113 = iM11306 ^ i2;
                        s2 = s2;
                        i9 = i113;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        s = s2;
                        int iM450212 = C19806.m45029("֡ۢ") ^ i6;
                        int i114 = ((iM450212 ^ i7) * 10625) ^ 362489438;
                        i9 = iM450212 ^ 1162316376;
                        sArr2 = sArr;
                        s2 = s;
                        i8 = i114;
                        c13345 = c13344;
                    }
                    break;
                case -247011474:
                case 135125766:
                    s2 = s2;
                    c13345.m31077((CharSequence) C3535.m10423(sArr3, i11, 19, i10)).m13154(zM38263);
                    sArr4 = f36915;
                    i12 = 178;
                    if (AbstractC0464.m2313() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠۫") ^ i7;
                        i = ((iM11306 ^ i6) * (-26833)) ^ 318412590;
                        i2 = -1372277473;
                        int i115 = iM11306 ^ i2;
                        s2 = s2;
                        i9 = i115;
                        i8 = i;
                    } else {
                        s2 = s2;
                        iM45029 = (C19806.m45029("֨ۢ") + i7) * 39;
                        i = ((iM45029 ^ i6) * 13675) ^ 1115265299;
                        i3 = 1906189351;
                        i9 = iM45029 ^ i3;
                        i8 = i;
                    }
                    break;
                case -163718975:
                case 362201555:
                    s2 = s2;
                    c4751M31078.m13154(zM38264);
                    c4751M31077 = c13345.m31077((CharSequence) C1875.m6105(f36915, 82, 35, i10));
                    if (C1460.f5948 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ۫") ^ i6) * 85;
                        i = ((iM11306 ^ i7) * 31651) ^ (-428555910);
                        i2 = -1763699469;
                        int i116 = iM11306 ^ i2;
                        s2 = s2;
                        i9 = i116;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        s = s2;
                        int iM450213 = C19806.m45029("֡ۢ") ^ i6;
                        int i117 = ((iM450213 ^ i7) * 10625) ^ 362489438;
                        i9 = iM450213 ^ 1162316376;
                        sArr2 = sArr;
                        s2 = s;
                        i8 = i117;
                        c13345 = c13344;
                    }
                    break;
                case 232232984:
                case 544073386:
                    s = s2;
                    sArr = f36915;
                    if (RunnableC1606.f6488 < 0) {
                        int iM11308 = ThreadFactoryC3888.m11306("ۙ۟") ^ i6;
                        i4 = ((iM11308 ^ i7) * 25693) ^ (-1328597085);
                        i9 = iM11308 ^ 1697333934;
                        c13345 = c13344;
                        sArr2 = sArr;
                        i8 = i4;
                        s2 = s;
                    } else {
                        int iM450214 = C19806.m45029("֡ۢ") ^ i6;
                        int i118 = ((iM450214 ^ i7) * 10625) ^ 362489438;
                        i9 = iM450214 ^ 1162316376;
                        sArr2 = sArr;
                        s2 = s;
                        i8 = i118;
                        c13345 = c13344;
                    }
                    break;
                case 414001286:
                case 1482780618:
                    C1937.m6279();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("֨ۢ") + i7) * 39;
                        i = ((iM45029 ^ i6) * 13675) ^ 1115265299;
                        i3 = 1906189351;
                    } else {
                        iM45029 = (C19806.m45029("ۚ۠") ^ i6) * 89;
                        i = ((iM45029 ^ i7) * 28331) ^ 1314697550;
                        i3 = -1945062666;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i;
                    break;
                case 796238850:
                case 1573838211:
                    s2 = s2;
                    strM2906 = C0629.m2906(f36915, 31, 20, i10);
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ܳᩳ") ^ i6;
                        i = ((iM11306 ^ i7) * 27867) ^ 2024771692;
                        i2 = -216947637;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸᩶") ^ i6;
                        i = ((iM11306 ^ i7) * (-28263)) ^ 310408547;
                        i2 = -803618624;
                    }
                    int i119 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i119;
                    i8 = i;
                    break;
                case 1041455233:
                case 2022194693:
                    RunnableC3388.m10064();
                    C3535.m10431();
                    sArr = sArr2;
                    s = s2;
                    int iM450215 = C19806.m45029("֡ۢ") ^ i6;
                    int i1110 = ((iM450215 ^ i7) * 10625) ^ 362489438;
                    i9 = iM450215 ^ 1162316376;
                    sArr2 = sArr;
                    s2 = s;
                    i8 = i1110;
                    c13345 = c13344;
                    break;
                case 1372835401:
                case 1781900185:
                    break;
                case 1566573710:
                case 1962254402:
                    s2 = s2;
                    zM38263 = ((C10522) c13345.m31077((CharSequence) strM10571)).m38263();
                    sArr3 = f36915;
                    i11 = 159;
                    if (C0216.m1591() <= 0) {
                        iM11306 = C19806.m45029("ܳᩳ") ^ i6;
                        i = ((iM11306 ^ i7) * 27867) ^ 2024771692;
                        i2 = -216947637;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܰ") ^ i7;
                        i = ((iM11306 ^ i6) * (-30533)) ^ (-362244746);
                        i2 = -482595311;
                    }
                    int i1111 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i1111;
                    i8 = i;
                    break;
                default:
                    s2 = s2;
                    c13345.m31077((CharSequence) RunnableC1564.m5344(f36915, 200, 24, i10)).m13180(false);
                    iM11306 = (C19806.m45029("ܰᩳ") + i6) * (-51);
                    i = ((iM11306 ^ i7) * (-1221)) ^ (-693603649);
                    i2 = 1485913273;
                    int i1112 = iM11306 ^ i2;
                    s2 = s2;
                    i9 = i1112;
                    i8 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0161 A[PHI: r1 r3 r4 r14 r15
      0x0161: PHI (r1v4 android.content.SharedPreferences) = 
      (r1v3 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
     binds: [B:38:0x015f, B:26:0x00de, B:19:0x00a7, B:16:0x008b, B:12:0x006a, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:38:0x015f, B:26:0x00de, B:19:0x00a7, B:16:0x008b, B:12:0x006a, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r4v3 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v5 java.lang.String)
     binds: [B:38:0x015f, B:26:0x00de, B:19:0x00a7, B:16:0x008b, B:12:0x006a, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:38:0x015f, B:26:0x00de, B:19:0x00a7, B:16:0x008b, B:12:0x006a, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:38:0x015f, B:26:0x00de, B:19:0x00a7, B:16:0x008b, B:12:0x006a, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0262 A[PHI: r5 r9 r10 r11 r12 r16 r17 r18 r23
      0x0262: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r18v4 short) = (r18v2 short), (r18v2 short), (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r23v5 short) = (r23v3 short), (r23v4 short), (r23v3 short), (r23v3 short), (r23v3 short), (r23v3 short), (r23v3 short) binds: [B:65:0x0260, B:61:0x0242, B:57:0x0224, B:53:0x0206, B:49:0x01e7, B:34:0x013b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m27200() {
        int iM45029;
        int i;
        int i2;
        int i3 = C1937.f7317;
        int i4 = C1398.f5802;
        int iM11306 = ThreadFactoryC3888.m11306("᩸ۨ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-27437)) ^ (-476651994);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 141023474;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        int i15 = -1478011567;
        short s2 = 0;
        short[] sArr3 = null;
        String str = null;
        String strM8161 = null;
        String strM3361 = null;
        SharedPreferences sharedPreferences = null;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * 4045) >> 31));
            switch (i15) {
                case -2039588201:
                case -2030428010:
                    ThreadFactoryC3888.m11300();
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 6537) ^ (-1005547486);
                        i2 = 1118576218;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩹") + i4) * 27;
                        i = ((iM45029 ^ i3) * (-28137)) ^ 281129659;
                        i2 = -1986835328;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1978488449:
                case 1846105194:
                    i11 = i9 + i10;
                    i12 = s2 + 1;
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("ܺۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10153)) ^ (-147818886);
                        i2 = 1833349910;
                    } else {
                        iM45029 = C19806.m45029("ۖᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * 18413) ^ (-1760542622);
                        i2 = 1700104257;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1952922913:
                case -1903773459:
                    C2871.m8646();
                    iM45029 = C19806.m45029("ᩴ֫") ^ i4;
                    i = ((iM45029 ^ i3) * 6537) ^ (-1005547486);
                    i2 = 1118576218;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1897327758:
                case 1969792422:
                    if ((i12 * i12) - i11 < 0) {
                        iM45029 = C19806.m45029("ܶ᩷") ^ i3;
                        i = ((iM45029 ^ i4) * (-6955)) ^ 1405014386;
                        i2 = 539311908;
                    } else {
                        iM45029 = C19806.m45029("֡ۖ") ^ i4;
                        i = ((iM45029 ^ i3) * 3357) ^ (-165595444);
                        i2 = 1668705379;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1619275773:
                case -271289079:
                    strM3361 = C0797.m3361(sArr, i14, i7, i13);
                    sArr2 = f36915;
                    i8 = 23;
                    if (C0797.m3359()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ۟") + i4) * 19;
                        i = ((iM45029 ^ i3) * 10617) ^ 257269012;
                        i2 = 2083935131;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ۫") ^ i4) * (-91);
                        i = ((iM45029 ^ i3) * 2769) ^ 113854533;
                        i2 = -2072521541;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1525324612:
                case 741421365:
                    i9 = s2 * s;
                    i10 = 1;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("ܺۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10153)) ^ (-147818886);
                        i2 = 1833349910;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۜۘ")) * 19;
                        i = ((iM45029 ^ i3) * 4927) ^ (-84857961);
                        i2 = 1552671737;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1216599407:
                case -452764042:
                    return !AbstractC0464.m2315(strM8161, str);
                case -1032426014:
                case 1318221878:
                    strM8161 = C2642.m8161(sharedPreferences, strM3361, C2249.m6918(sArr2, i8, 7, i13));
                    if (C1148.m4232() <= 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 6537) ^ (-1005547486);
                        i2 = 1118576218;
                    } else {
                        iM45029 = (C19806.m45029("۬֫") + i3) * (-107);
                        i = ((iM45029 ^ i4) * (-18969)) ^ (-931110688);
                        i2 = -1447353321;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -889650602:
                case 1214508235:
                    i13 = 53886;
                    iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i4;
                    i = ((iM45029 ^ i3) * (-29569)) ^ 447906926;
                    i2 = 1996342081;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -879120312:
                case 620183455:
                    i13 = 36974;
                    iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i4;
                    i = ((iM45029 ^ i3) * (-29569)) ^ 447906926;
                    i2 = 1996342081;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -610785094:
                case 1448264944:
                    s = 2;
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ܺۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10153)) ^ (-147818886);
                        i2 = 1833349910;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۨ۫")) * (-23);
                        i = ((iM45029 ^ i4) * (-7777)) ^ 1862470224;
                        i2 = 1999645382;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -212980420:
                case 1575489989:
                    sharedPreferences = ApplicationC0716.f2988;
                    sArr = f36915;
                    i14 = 18;
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 6537) ^ (-1005547486);
                        i2 = 1118576218;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۜ") ^ i3;
                        i = ((iM45029 ^ i4) * (-6415)) ^ 1269694022;
                        i2 = -565027901;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 33901130:
                case 1960467184:
                    C3743.m10966();
                    if (C1419.f5860 < 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 6537) ^ (-1005547486);
                        i2 = 1118576218;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩵ۤ")) * 71;
                        i = ((iM45029 ^ i4) * 29865) ^ 999312629;
                        i2 = -287733505;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 547787257:
                case 594663039:
                    sArr3 = f36915;
                    c = 17;
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("ܺۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10153)) ^ (-147818886);
                        i2 = 1833349910;
                    } else {
                        iM45029 = C19806.m45029("֡ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-17067)) ^ 547314581;
                        i2 = -1839571426;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 611749166:
                case 2045156885:
                    s2 = sArr3[c];
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ܺۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10153)) ^ (-147818886);
                        i2 = 1833349910;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-30731)) ^ (-1554832008);
                        i2 = 2101812919;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 680126227:
                case 726263150:
                    if (C3577.f13150 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩹") + i4) * 27;
                        i = ((iM45029 ^ i3) * (-28137)) ^ 281129659;
                        i2 = -1986835328;
                    } else {
                        iM45029 = C19806.m45029("ܺۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10153)) ^ (-147818886);
                        i2 = 1833349910;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 904729967:
                case 1907832424:
                    i7 = 5;
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ܺۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10153)) ^ (-147818886);
                        i2 = 1833349910;
                    } else {
                        iM45029 = C19806.m45029("ۜ۬") ^ i4;
                        i = ((iM45029 ^ i3) * 679) ^ 1903540234;
                        i2 = -993944732;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1773802000:
                case 1822762733:
                    C1148.m4232();
                    C10634.m26820();
                    return false;
                default:
                    str = f36916;
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 6537) ^ (-1005547486);
                        i2 = 1118576218;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-22847)) ^ (-849543286);
                        i2 = 1556120769;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
