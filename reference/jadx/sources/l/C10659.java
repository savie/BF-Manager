package l;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.util.ThreadUtil;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R3YJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10659 implements PluginContext {

    /* JADX INFO: renamed from: ᩹ۢۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f36351 = {7691, -28778, -28775, -28772, -28795, -28777, -28774, -28780, -28793, -28783, 2404, -15131, -15111, -15136, -15118, -15108, -15109, -15140, -15119, -15131, -15111, -15136, -15118, -15108, -15109, -15163, -15129, -15120, -15117, -15120, -15129, -15120, -15109, -15114, -15120, 593, -22994, -22990, -22990, -22986, -22916, -22935, -22935, -22994, -22990, -22990, -22986, -22987, -22916, -22935, -22935, 2374, 30695, 7771, 28439, 28427, 28439, 28435, 28427, 28436, 28437, 8917, -13735, -13698, -13704, -13725, -13724, -13715, 3184, 7111, 7136, 7142, 7165, 7162, 7155, 7092, 7162, 7163, 7136, 7092, 7154, 7163, 7137, 7162, 7152, 7086, 7092, 5920, 6658, 6671, 6656, 6665, 6685, 6682, 6684, 6663, 6656, 6665, 6685, 6950, -8410, -9823, -9310, -1094, 4435, -11194, 3548, 238, -4574, -4968, 1803, 6519, 6501, 6501, 6515, 6498, 6501, 6457};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f36352;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f36353;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC5719 f36354;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12274 f36355;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12274 f36356;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14415 f36357;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f36358;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0074 f36359;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f36360;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ClipboardManager f36361;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9372 f36362;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile SharedPreferences f36363;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f36364;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f36365;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14415 f36366;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC9953 f36367;

    @Override // bin.mt.plugin.api.PluginContext
    public final int getHostVersionCode() {
        return 26101061;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getHostVersionName() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -2044827584;
        int i7 = C1937.f7317;
        int i8 = C0050.f912;
        int iM11306 = (ThreadFactoryC3888.m11306("۠ۨ") ^ i8) * 29;
        int i9 = ((iM11306 ^ i7) * (-17983)) ^ 493240918;
        int i10 = -1603540360;
        while (true) {
            i6 = ((((i6 ^ i7) * 23123) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -2035748791:
                case 980818492:
                    C0216.m1591();
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-28273)) ^ 1941618453;
                        i10 = -1364530043;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 11807) ^ (-1519793013);
                        i10 = 230059644;
                    }
                    break;
                case -1863010003:
                case -357435378:
                    if (C2477.f9839 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܽ") ^ i7) * 55;
                        i9 = ((iM11306 ^ i8) * 5653) ^ (-319256345);
                        i10 = -1611129579;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 11807) ^ (-1519793013);
                        i10 = 230059644;
                    }
                    break;
                case -1237428359:
                case 1209357440:
                    RunnableC1606.m5473();
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = (C19806.m45029("ܳܳ") ^ i7) * (-119);
                        i9 = ((iM11306 ^ i8) * (-30049)) ^ (-1226470007);
                        i10 = -73196072;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-28273)) ^ 1941618453;
                        i10 = -1364530043;
                    }
                    break;
                case -1199441354:
                case 1778927139:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܺ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-8447)) ^ (-1257777340);
                        i10 = -99347543;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܺ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 29797) ^ (-1221061517);
                        i10 = 1473224017;
                    }
                    break;
                case -1146895764:
                case -963025867:
                    sArr2 = f36351;
                    i5 = 54;
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܽ") ^ i7) * 55;
                        i9 = ((iM11306 ^ i8) * 5653) ^ (-319256345);
                        i10 = -1611129579;
                    } else {
                        iM11306 = (i8 - C19806.m45029("ܺ᩷")) * (-39);
                        i9 = ((iM11306 ^ i7) * 28469) ^ 845657794;
                        i10 = 13224824;
                    }
                    break;
                case -1133310216:
                case 294686137:
                    c = '5';
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܺ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-8447)) ^ (-1257777340);
                        i10 = -99347543;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۚ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 9905) ^ 1776867867;
                        i10 = 52887458;
                    }
                    break;
                case -868359956:
                case 1722315169:
                    if (i - (i2 + i3) <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܺ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-14947)) ^ (-840192615);
                        i10 = -1661020188;
                    } else {
                        iM11306 = (i7 - C19806.m45029("᩹֫")) * 51;
                        i9 = ((iM11306 ^ i8) * (-24325)) ^ 859938832;
                        i10 = 550857646;
                    }
                    break;
                case -835872926:
                case -655231113:
                    i = s * s2;
                    i2 = s * s;
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("ܳܳ") ^ i7) * (-119);
                        i9 = ((iM11306 ^ i8) * (-30049)) ^ (-1226470007);
                        i10 = -73196072;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-6515)) ^ (-2120341619);
                        i10 = -1181278867;
                    }
                    break;
                case -791348290:
                case 1033527196:
                    i4 = 28453;
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ᩸") ^ i8) * 51;
                    i9 = ((iM11306 ^ i7) * (-17051)) ^ (-194983347);
                    i10 = -1747926139;
                    break;
                case -718033457:
                case 1642260905:
                    i4 = 16110;
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ᩸") ^ i8) * 51;
                    i9 = ((iM11306 ^ i7) * (-17051)) ^ (-194983347);
                    i10 = -1747926139;
                    break;
                case -675616939:
                case 142245354:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܽ") ^ i7) * 55;
                        i9 = ((iM11306 ^ i8) * 5653) ^ (-319256345);
                        i10 = -1611129579;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۖ") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-12261)) ^ (-1787106227);
                        i10 = -1381942145;
                    }
                    break;
                case -494883193:
                case -337262701:
                    C2332.m7079();
                    C1419.m4973();
                    iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i7;
                    i9 = ((iM11306 ^ i8) * 11807) ^ (-1519793013);
                    i10 = 230059644;
                    break;
                case -435502906:
                case 172080522:
                    C3660.m10791();
                    return null;
                case -172140104:
                case 2022689901:
                    i3 = 61481281;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-28273)) ^ 1941618453;
                        i10 = -1364530043;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩹") + i7) * (-33);
                        i9 = ((iM11306 ^ i8) * (-17707)) ^ (-936333384);
                        i10 = 1353202350;
                    }
                    break;
                case 378055060:
                case 1326239859:
                    s = sArr[c];
                    s2 = 15682;
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܺ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-8447)) ^ (-1257777340);
                        i10 = -99347543;
                    } else {
                        iM11306 = C19806.m45029("ᩴ᩷") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-25835)) ^ (-1601484284);
                        i10 = 630369420;
                    }
                    break;
                case 1009202192:
                case 1580315123:
                    if (C0629.m2907()) {
                        iM11306 = (C19806.m45029("۠ܶ") + i7) * (-37);
                        i9 = ((iM11306 ^ i8) * 2647) ^ (-1724534975);
                        i10 = -438742213;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-28273)) ^ 1941618453;
                        i10 = -1364530043;
                    }
                    break;
                case 1030958683:
                case 1700887566:
                    return RunnableC1895.m6164(sArr2, i5, 7, i4);
                case 1176343846:
                case 1356020469:
                    if (C0216.f1393 != 0) {
                        iM11306 = (C19806.m45029("ܳܳ") ^ i7) * (-119);
                        i9 = ((iM11306 ^ i8) * (-30049)) ^ (-1226470007);
                        i10 = -73196072;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ᩴ") + i8) * (-55);
                        i9 = ((iM11306 ^ i7) * 30139) ^ (-269244917);
                        i10 = -936722892;
                    }
                    break;
                default:
                    sArr = f36351;
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܽ") ^ i7) * 55;
                        i9 = ((iM11306 ^ i8) * 5653) ^ (-319256345);
                        i10 = -1611129579;
                    } else {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ۧۡ")) * 19;
                        i9 = ((iM11306 ^ i7) * 1243) ^ 1162003073;
                        i10 = -114772392;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final File getFilesDir() {
        AbstractC20745 abstractC20745 = null;
        int i = 1958882163;
        int i2 = C1460.f5948;
        int i3 = C2871.f10837;
        int iM11306 = ThreadFactoryC3888.m11306("֫ۜ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 17607) ^ (-491363537);
        int i5 = -1474569808;
        while (true) {
            i = ((((i ^ i2) * 29257) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2113906014:
                case 1063537322:
                    return new File(ViewGroupOnHierarchyChangeListenerC1916.m6236(abstractC20745));
                case -2043277198:
                case -1819956294:
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28825)) ^ 436611482;
                        i5 = 404412643;
                    } else {
                        iM11306 = C19806.m45029("ۚۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10321)) ^ (-240338724);
                        i5 = 1508026966;
                    }
                    break;
                case -1853890737:
                case 2134098258:
                    abstractC20745.mo33987();
                    iM11306 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-22303)) ^ (-1833793063);
                    i5 = -613284137;
                    break;
                case -1827882198:
                case 347944884:
                    if (C7105.m18985()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28825)) ^ 436611482;
                        i5 = 404412643;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ᩳ") ^ i3) * 21;
                        i4 = ((iM11306 ^ i2) * 30669) ^ (-1158159429);
                        i5 = 1135904282;
                    }
                    break;
                case -1686694070:
                case 1870139549:
                    C1460.m5050();
                    if (!CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24401) ^ 164346254;
                        i5 = -12403643;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۫") ^ i2) * 47;
                        i4 = ((iM11306 ^ i3) * (-11241)) ^ 989219437;
                        i5 = 245301302;
                    }
                    break;
                case -1466428528:
                case 319138181:
                    if (C1148.m4231(abstractC20745)) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22303)) ^ (-1833793063);
                        i5 = -613284137;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4333) ^ 600002869;
                        i5 = -842995156;
                    }
                    break;
                case -1248935825:
                case -294628542:
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28825)) ^ 436611482;
                        i5 = 404412643;
                    } else {
                        iM11306 = C19806.m45029("ᩳ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23067) ^ (-55299082);
                        i5 = -439854856;
                    }
                    break;
                case -1108020051:
                case -914916824:
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24401) ^ 164346254;
                        i5 = -12403643;
                    } else {
                        iM11306 = C19806.m45029("᩻ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11335) ^ 600609984;
                        i5 = -1008528201;
                    }
                    break;
                case -1045241639:
                case 1896889853:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۫") ^ i2) * 47;
                        i4 = ((iM11306 ^ i3) * (-11241)) ^ 989219437;
                        i5 = 245301302;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16229)) ^ (-1868712251);
                        i5 = -1271925993;
                    }
                    break;
                case -889395380:
                case 1345957318:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("᩻۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-23165)) ^ (-195497664);
                        i5 = -504237374;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28825)) ^ 436611482;
                        i5 = 404412643;
                    }
                    break;
                case -554972014:
                case 1321165539:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("֡ۘ") + i3) * 65;
                        i4 = ((iM11306 ^ i2) * (-5043)) ^ 1029448838;
                        i5 = 5951550;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * 25721) ^ 1026931838;
                        i5 = 1737842719;
                    }
                    break;
                case -293253252:
                case -24944165:
                    C2124.m6673();
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28825)) ^ 436611482;
                        i5 = 404412643;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۠ᩳ")) * (-107);
                        i4 = ((iM11306 ^ i2) * 10247) ^ (-2097805680);
                        i5 = 1610108737;
                    }
                    break;
                case 31319232:
                case 349004746:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24401) ^ 164346254;
                        i5 = -12403643;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۢ") ^ i3) * (-13);
                        i4 = ((iM11306 ^ i2) * (-20403)) ^ (-592680435);
                        i5 = 925416776;
                    }
                    break;
                case 98847920:
                case 582321674:
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("֡ۘ") + i3) * 65;
                        i4 = ((iM11306 ^ i2) * (-5043)) ^ 1029448838;
                        i5 = 5951550;
                    } else {
                        iM11306 = C19806.m45029("᩵ۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25037)) ^ (-463421933);
                        i5 = -1504829891;
                    }
                    break;
                case 322946855:
                case 458539891:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C0671.m3008();
                    iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-28825)) ^ 436611482;
                    i5 = 404412643;
                    break;
                case 426270273:
                case 1777610412:
                    RunnableC0195.m1431();
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24401) ^ 164346254;
                        i5 = -12403643;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28825)) ^ 436611482;
                        i5 = 404412643;
                    }
                    break;
                case 451640749:
                case 1435011439:
                    abstractC20745 = this.f36353;
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۫") ^ i2) * 47;
                        i4 = ((iM11306 ^ i3) * (-11241)) ^ 989219437;
                        i5 = 245301302;
                    } else {
                        iM11306 = C19806.m45029("ۘۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-709)) ^ 1100829472;
                        i5 = 885447164;
                    }
                    break;
                default:
                    C1460.m5050();
                    C0962.m3746();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x021c A[PHI: r6 r7 r8 r9 r13
      0x021c: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:60:0x021a, B:56:0x01f9, B:38:0x0146] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:60:0x021a, B:56:0x01f9, B:38:0x0146] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:60:0x021a, B:56:0x01f9, B:38:0x0146] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:60:0x021a, B:56:0x01f9, B:38:0x0146] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:60:0x021a, B:56:0x01f9, B:38:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0252 A[PHI: r1 r12 r14 r15 r21
      0x0252: PHI (r1v4 java.lang.String) = 
      (r1v2 java.lang.String)
      (r1v3 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
     binds: [B:64:0x0250, B:42:0x016a, B:28:0x00e6, B:14:0x0082, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:64:0x0250, B:42:0x016a, B:28:0x00e6, B:14:0x0082, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:64:0x0250, B:42:0x016a, B:28:0x00e6, B:14:0x0082, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:64:0x0250, B:42:0x016a, B:28:0x00e6, B:14:0x0082, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:64:0x0250, B:42:0x016a, B:28:0x00e6, B:14:0x0082, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0285 A[PHI: r4 r10
      0x0285: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:68:0x0283, B:52:0x01d7, B:24:0x00c4, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:68:0x0283, B:52:0x01d7, B:24:0x00c4, B:11:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02b5 A[PHI: r16
      0x02b5: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:72:0x02b3, B:16:0x0086, B:14:0x0082, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m26848(String str) {
        int iM45029;
        int i;
        int i2;
        int i3 = C0278.f1572;
        int i4 = C1668.f6641;
        int iM450210 = (i3 - C19806.m45029("ۖۤ")) * (-39);
        int i5 = ((iM450210 ^ i4) * 8375) ^ 190338751;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM450210 ^ 345909633;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1303461404;
        char c = 0;
        String strM9865 = null;
        String strM10964 = null;
        String strM9716 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 29119) >> 31));
            switch (i14) {
                case -1948114023:
                case 1066284991:
                    C1025.m3861();
                    iM45029 = (ThreadFactoryC3888.m11306("ܽ᩺") ^ i3) * (-127);
                    i = ((iM45029 ^ i4) * (-7087)) ^ (-1628405911);
                    i2 = -1342163871;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1917014422:
                case 1662079182:
                    i10 = 2039184;
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("۫۫") ^ i3;
                        i = ((iM45029 ^ i4) * (-14553)) ^ 596441391;
                        i2 = -2047277200;
                    } else {
                        iM45029 = C19806.m45029("ۧ۠") ^ i3;
                        i = ((iM45029 ^ i4) * (-30673)) ^ (-1177647399);
                        i2 = 1744585132;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1899640103:
                case -1393562689:
                    c = '#';
                    if (C0962.m3746() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i4;
                        i = ((iM45029 ^ i3) * 31509) ^ 535398908;
                        i2 = 479728652;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺ᩺")) * 87;
                        i = ((iM45029 ^ i4) * (-11705)) ^ (-1335314445);
                        i2 = -285371667;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1795527827:
                case -1771964112:
                    sArr = f36351;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩺") ^ i3) * (-127);
                        i = ((iM45029 ^ i4) * (-7087)) ^ (-1628405911);
                        i2 = -1342163871;
                    } else {
                        iM45029 = C19806.m45029("ۧۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-29109)) ^ (-1778022888);
                        i2 = -981673410;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1735468681:
                case -1396900496:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩺") ^ i3) * (-127);
                        i = ((iM45029 ^ i4) * (-7087)) ^ (-1628405911);
                        i2 = -1342163871;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i4;
                        i = ((iM45029 ^ i3) * 31509) ^ 535398908;
                        i2 = 479728652;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1599752146:
                case 612243338:
                    if (C1398.m4899(strM9716, C2477.m7604(sArr3, i13, i7, i11))) {
                        strM9865 = str;
                        iM45029 = (C19806.m45029("۠᩹") + i3) * 79;
                        i = ((iM45029 ^ i4) * 273) ^ (-1190106452);
                        i2 = -974318669;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450211 = (i4 - C19806.m45029("᩻ۙ")) * (-99);
                        i5 = ((iM450211 ^ i3) * (-8313)) ^ (-125951681);
                        i6 = iM450211 ^ 1362732174;
                    }
                    break;
                case -1235486782:
                case 74237509:
                    i11 = 3372;
                    iM45029 = ThreadFactoryC3888.m11306("ۚܺ") ^ i3;
                    i = ((iM45029 ^ i4) * 7117) ^ (-585786773);
                    i2 = 1532332766;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -905480778:
                case -83113017:
                    sArr3 = f36351;
                    i13 = 43;
                    if (C1377.m4833() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i4;
                        i = ((iM45029 ^ i3) * 31509) ^ 535398908;
                        i2 = 479728652;
                    } else {
                        iM45029 = (C19806.m45029("᩷ۨ") + i4) * 89;
                        i = ((iM45029 ^ i3) * 9933) ^ 1573689020;
                        i2 = 1535857339;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -839177862:
                case 1032797299:
                    strM9865 = ViewTreeObserverOnPreDrawListenerC3327.m9865(strM10964, str);
                    iM45029 = (C19806.m45029("۠᩹") + i3) * 79;
                    i = ((iM45029 ^ i4) * 273) ^ (-1190106452);
                    i2 = -974318669;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -837150981:
                case 1740917561:
                    i12 = 36;
                    if (C1937.m6279() >= 0) {
                        iM45029 = C19806.m45029("ܽ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-18173)) ^ (-529395950);
                        i2 = 1072628024;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۠") + i4) * 7;
                        i = ((iM45029 ^ i3) * (-5429)) ^ 332160046;
                        i2 = 1003048657;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -780457765:
                case -271337465:
                    C3577.m10565();
                    C3535.m10431();
                    return null;
                case -704820983:
                case 922822338:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C1189.m4368() <= 0) {
                        iM45029 = C19806.m45029("ܽ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-18173)) ^ (-529395950);
                        i2 = 1072628024;
                    } else {
                        iM45029 = (C19806.m45029("ۤۚ") + i4) * 123;
                        i = ((iM45029 ^ i3) * 22273) ^ 575361236;
                        i2 = 1170551677;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -571543885:
                case 1692749456:
                    return strM9865;
                case -349047868:
                case 2055970322:
                    if (i8 - (i9 + i10) > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܽ") ^ i4;
                        i = ((iM45029 ^ i3) * 14363) ^ (-620490545);
                        i2 = -1827222150;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩵") ^ i3;
                        i = ((iM45029 ^ i4) * (-13121)) ^ 1117597122;
                        i2 = 1743700017;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -338641595:
                case 1884762407:
                    C2704.m8255();
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i4;
                        i = ((iM45029 ^ i3) * 31509) ^ 535398908;
                        i2 = 479728652;
                    } else {
                        iM45029 = C19806.m45029("۫۫") ^ i3;
                        i = ((iM45029 ^ i4) * (-14553)) ^ 596441391;
                        i2 = -2047277200;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -304049044:
                case 558410189:
                    s = sArr[c];
                    s2 = 2856;
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ܽ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-18173)) ^ (-529395950);
                        i2 = 1072628024;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗ᩷")) * 97;
                        i = ((iM45029 ^ i3) * 5671) ^ (-324560605);
                        i2 = 1379430269;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -246370101:
                case 306548508:
                    i7 = 8;
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("۫۫") ^ i3;
                        i = ((iM45029 ^ i4) * (-14553)) ^ 596441391;
                        i2 = -2047277200;
                    } else {
                        iM45029 = C19806.m45029("ۗ֫") ^ i3;
                        i = ((iM45029 ^ i4) * 15419) ^ 1830747168;
                        i2 = 956943705;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 531352445:
                case 1713104810:
                    strM10964 = C3743.m10964(sArr2, i12, 7, i11);
                    if (C3535.m10420(strM9716, strM10964)) {
                        strM9865 = str;
                        iM45029 = (C19806.m45029("۠᩹") + i3) * 79;
                        i = ((iM45029 ^ i4) * 273) ^ (-1190106452);
                        i2 = -974318669;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ۢ")) * 5;
                        i = ((iM45029 ^ i4) * 14389) ^ 299225449;
                        i2 = 1497734289;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 580450438:
                case 1067577335:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩺") ^ i3) * (-127);
                        i = ((iM45029 ^ i4) * (-7087)) ^ (-1628405911);
                        i2 = -1342163871;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i4) * (-95);
                        i = ((iM45029 ^ i3) * (-20303)) ^ (-2027529830);
                        i2 = -1180712648;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1176654361:
                case 1781529098:
                    strM9716 = MenuItemOnMenuItemClickListenerC3244.m9716(str);
                    sArr2 = f36351;
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i4;
                        i = ((iM45029 ^ i3) * 31509) ^ 535398908;
                        i2 = 479728652;
                    } else {
                        iM45029 = (C19806.m45029("ܳ᩷") ^ i4) * 21;
                        i = ((iM45029 ^ i3) * 5709) ^ 1918773042;
                        i2 = -1558598868;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1376184949:
                case 1427573129:
                    if (C1461.m5080()) {
                        iM45029 = C19806.m45029("۫۫") ^ i3;
                        i = ((iM45029 ^ i4) * (-14553)) ^ 596441391;
                        i2 = -2047277200;
                    } else {
                        iM45029 = C19806.m45029("᩸ۤ") ^ i3;
                        i = ((iM45029 ^ i4) * (-14827)) ^ (-718812862);
                        i2 = -1315187788;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 42566;
                    iM45029 = ThreadFactoryC3888.m11306("ۚܺ") ^ i3;
                    i = ((iM45029 ^ i4) * 7117) ^ (-585786773);
                    i2 = 1532332766;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0485 A[PHI: r2 r8 r10 r16 r17 r18 r19 r29
      0x0485: PHI (r2v117 int) = (r2v66 int), (r2v67 int), (r2v120 int) binds: [B:118:0x0483, B:114:0x045f, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0485: PHI (r8v22 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v25 java.lang.String) binds: [B:118:0x0483, B:114:0x045f, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0485: PHI (r10v68 int) = (r10v44 int), (r10v45 int), (r10v71 int) binds: [B:118:0x0483, B:114:0x045f, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0485: PHI (r16v7 short) = (r16v3 short), (r16v2 short), (r16v2 short) binds: [B:118:0x0483, B:114:0x045f, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0485: PHI (r17v7 int) = (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:118:0x0483, B:114:0x045f, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0485: PHI (r18v7 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:118:0x0483, B:114:0x045f, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0485: PHI (r19v7 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:118:0x0483, B:114:0x045f, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0485: PHI (r29v27 int) = (r29v5 int), (r29v6 int), (r29v31 int) binds: [B:118:0x0483, B:114:0x045f, B:40:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x008e  */
    /* JADX WARN: Code duplicated, block: B:16:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d8 A[PHI: r28
      0x02d8: PHI (r28v5 java.lang.String) = (r28v4 java.lang.String), (r28v3 java.lang.String) binds: [B:81:0x02bf, B:64:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0107, code lost:
    
        if (l.RunnableC1564.f6300 != false) goto L27;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getStringNullable(java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10659.getStringNullable(java.lang.String):java.lang.String");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginName() {
        String str = null;
        String strM8637 = null;
        int i = 721633253;
        int i2 = C1189.f5284;
        int i3 = RunnableC0195.f1321;
        int iM11306 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i2) * 91;
        int i4 = ((iM11306 ^ i3) * 30221) ^ 2125877963;
        int i5 = -1412871106;
        while (true) {
            i = ((((i ^ i3) * 1403) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1607406108:
                case 489408476:
                    if (C2871.m8641(str) >= 3) {
                        iM11306 = (C19806.m45029("֡ᩳ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i2) * (-30675)) ^ 1649161668;
                        i5 = -1570304468;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22097)) ^ (-639511791);
                        i5 = 1809744405;
                    }
                    break;
                case -1513074952:
                case -21946521:
                    strM8637 = C2871.m8637(this, str);
                    if (strM8637 != null) {
                        iM11306 = C19806.m45029("֫ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16613)) ^ 303478112;
                        i5 = 1487933510;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22097)) ^ (-639511791);
                        i5 = 1809744405;
                    }
                    break;
                case -1503201482:
                case 1323675389:
                    C1189.m4368();
                    C19806.m45024();
                    iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i2) * (-119);
                    i4 = ((iM11306 ^ i3) * (-5661)) ^ (-1847142531);
                    i5 = 547227279;
                    break;
                case -1439268039:
                case -875811100:
                    if (!RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ܽ") ^ i2) * (-117);
                        i4 = ((iM11306 ^ i3) * (-25643)) ^ 1339154445;
                        i5 = 375206603;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21215)) ^ (-443544769);
                        i5 = -1899732652;
                    }
                    break;
                case -1371905378:
                case -197936030:
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21215)) ^ (-443544769);
                        i5 = -1899732652;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۨ᩶")) * (-115);
                        i4 = ((iM11306 ^ i2) * 31845) ^ (-2077401134);
                        i5 = 1419480926;
                    }
                    break;
                case -968089551:
                case -407956945:
                    if (C3743.m10966() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i2) * (-119);
                        i4 = ((iM11306 ^ i3) * (-5661)) ^ (-1847142531);
                        i5 = 547227279;
                    } else {
                        iM11306 = C19806.m45029("᩹֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14515)) ^ 1968286712;
                        i5 = -1356383953;
                    }
                    break;
                case -940347721:
                case 1220376521:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i2) * (-119);
                        i4 = ((iM11306 ^ i3) * (-5661)) ^ (-1847142531);
                        i5 = 547227279;
                    } else {
                        iM11306 = C19806.m45029("۫᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32385) ^ 1946898885;
                        i5 = -1346923534;
                    }
                    break;
                case -720752956:
                case -547178164:
                    if (C2477.m7593() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ܽ") ^ i2) * (-117);
                        i4 = ((iM11306 ^ i3) * (-25643)) ^ 1339154445;
                        i5 = 375206603;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۤ") + i3) * (-15);
                        i4 = ((iM11306 ^ i2) * (-20067)) ^ 768541246;
                        i5 = -934210171;
                    }
                    break;
                case -537798360:
                case -275265564:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21215)) ^ (-443544769);
                        i5 = -1899732652;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܽ۟")) * (-53);
                        i4 = ((iM11306 ^ i2) * (-1045)) ^ 756205808;
                        i5 = -213544108;
                    }
                    break;
                case -271022617:
                case 2009208011:
                    C1419.m4973();
                    C3577.m10565();
                    return null;
                case -143630023:
                case 1131529381:
                    if (C1977.m6362(str, 0) == '{') {
                        iM11306 = (C19806.m45029("᩸ۡ") + i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 21719) ^ 1211461393;
                        i5 = -1426065774;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22097)) ^ (-639511791);
                        i5 = 1809744405;
                    }
                    break;
                case -77238141:
                case 796124767:
                    return strM8637;
                case -25034685:
                case 2056100024:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i2) * (-119);
                        i4 = ((iM11306 ^ i3) * (-5661)) ^ (-1847142531);
                        i5 = 547227279;
                    } else {
                        iM11306 = (C19806.m45029("ۧ᩵") + i3) * (-7);
                        i4 = ((iM11306 ^ i2) * 19787) ^ (-2060409087);
                        i5 = -752412785;
                    }
                    break;
                case 443417435:
                case 903397505:
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21215)) ^ (-443544769);
                        i5 = -1899732652;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۘۡ")) * 109;
                        i4 = ((iM11306 ^ i3) * (-19919)) ^ (-480538603);
                        i5 = 171141823;
                    }
                    break;
                case 463143644:
                case 1346768011:
                    return str;
                case 679443990:
                case 1758999049:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۖ") ^ i3) * 33;
                        i4 = ((iM11306 ^ i2) * 32529) ^ (-1424087758);
                        i5 = 732869336;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21215)) ^ (-443544769);
                        i5 = -1899732652;
                    }
                    break;
                case 868698079:
                case 1528194941:
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16149)) ^ 877827563;
                        i5 = 1746477047;
                    } else {
                        iM11306 = C19806.m45029("ۖܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19595) ^ 109523694;
                        i5 = 1835902669;
                    }
                    break;
                case 1132219940:
                case 1208906074:
                    str = this.f36360;
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21215)) ^ (-443544769);
                        i5 = -1899732652;
                    } else {
                        iM11306 = (C19806.m45029("ۖ᩵") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-28325)) ^ 1934662075;
                        i5 = 2065293977;
                    }
                    break;
                case 1284406767:
                case 1443333942:
                    if (C2124.f7782 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ܽ") ^ i2) * (-117);
                        i4 = ((iM11306 ^ i3) * (-25643)) ^ 1339154445;
                        i5 = 375206603;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i2) * (-119);
                        i4 = ((iM11306 ^ i3) * (-5661)) ^ (-1847142531);
                        i5 = 547227279;
                    }
                    break;
                case 2079998141:
                case 2106895729:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21215)) ^ (-443544769);
                        i5 = -1899732652;
                    } else {
                        iM11306 = (C19806.m45029("ܳۜ") ^ i2) * (-77);
                        i4 = ((iM11306 ^ i3) * (-12145)) ^ (-1939987542);
                        i5 = 313081150;
                    }
                    break;
                default:
                    if (C0278.m1779(1, str) == '}') {
                        iM11306 = C19806.m45029("ۜ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29771)) ^ 1313708313;
                        i5 = -1896382694;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22097)) ^ (-639511791);
                        i5 = 1809744405;
                    }
                    break;
            }
        }
    }

    public C10659(String str, String str2, int i, int i2, String str3, AbstractC20745 abstractC20745, C9372 c9372, C14415 c14415, C14415 c14416) {
        int iM11306;
        C12274 c12274;
        int i3;
        int i4;
        C12274 c12275;
        int iM11307;
        int i5;
        int i6;
        int iM45029;
        int i7;
        int i8;
        C10659 c10659 = this;
        C12274 c12276 = null;
        C12274 c12277 = null;
        int i9 = -2099839445;
        int i10 = AbstractC0464.f2088;
        int i11 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM450210 = (C19806.m45029("ۨۖ") + i10) * (-33);
        int i12 = ((iM450210 ^ i11) * (-21755)) ^ 676446931;
        int i13 = 2108749943;
        while (true) {
            int i14 = iM450210 ^ i13;
            while (true) {
                i9 = ((((i9 ^ i11) * 1163) >> 31) & i12) ^ i14;
                switch (i9) {
                    case -2031655471:
                    case -1227989886:
                        c12274 = c12277;
                        c10659.f36355 = c12276;
                        if (C3535.m10431() <= 0) {
                            iM45029 = (C19806.m45029("֡֨") ^ i11) * (-105);
                            i7 = ((iM45029 ^ i10) * (-18219)) ^ (-685527856);
                            i8 = 1867366724;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܶۨ") + i10) * (-117);
                            i7 = ((iM45029 ^ i11) * (-24621)) ^ 1474094900;
                            i8 = 365879500;
                        }
                        i14 = iM45029 ^ i8;
                        i12 = i7;
                        c12277 = c12274;
                        break;
                    case -1928780090:
                    case 237859413:
                        c10659.f36362 = c9372;
                        c10659.f36357 = c14415;
                        c10659.f36366 = c14416;
                        return;
                    case -1883891233:
                    case 1376402283:
                        c12277 = new C12274();
                        if (C3535.f13026 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ᩴۖ") ^ i10) * (-83);
                            c12274 = c12277;
                            i3 = ((iM11306 ^ i11) * 12205) ^ 603287088;
                            i4 = 1914800320;
                            i12 = i3;
                            i14 = iM11306 ^ i4;
                            c12277 = c12274;
                        } else {
                            int iM450211 = (i10 - C19806.m45029("ۚۖ")) * (-29);
                            i12 = ((iM450211 ^ i11) * 28715) ^ (-721305857);
                            i14 = iM450211 ^ 1871561924;
                            c10659 = this;
                        }
                        break;
                    case -1821912411:
                    case 1646575100:
                        if (C2642.m8171() != 0) {
                            c12274 = c12277;
                            iM45029 = (C19806.m45029("֡֨") ^ i11) * (-105);
                            i7 = ((iM45029 ^ i10) * (-18219)) ^ (-685527856);
                            i8 = 1867366724;
                            i14 = iM45029 ^ i8;
                            i12 = i7;
                            c12277 = c12274;
                        } else {
                            c12275 = c12277;
                            iM11307 = C19806.m45029("ۗ᩵") ^ i10;
                            i5 = ((iM11307 ^ i11) * 26171) ^ (-402453863);
                            i6 = -849572797;
                            i14 = iM11307 ^ i6;
                            i12 = i5;
                            c12277 = c12275;
                            c10659 = this;
                        }
                        break;
                    case -1791044326:
                    case -74770163:
                        RunnableC0195.m1431();
                        C2249.m6915();
                        break;
                    case -1655319448:
                    case 268682143:
                        if (RunnableC1606.f6488 >= 0) {
                        }
                        c12275 = c12277;
                        iM11307 = C19806.m45029("ۗ᩵") ^ i10;
                        i5 = ((iM11307 ^ i11) * 26171) ^ (-402453863);
                        i6 = -849572797;
                        i14 = iM11307 ^ i6;
                        i12 = i5;
                        c12277 = c12275;
                        c10659 = this;
                        break;
                    case -1135971445:
                    case -1072398078:
                        c12275 = c12277;
                        if (C1189.f5284 > 0) {
                            iM11307 = ThreadFactoryC3888.m11306("۫ܿ") ^ i10;
                            i5 = ((iM11307 ^ i11) * (-16837)) ^ 1083312074;
                            i6 = -1913221193;
                            i14 = iM11307 ^ i6;
                            i12 = i5;
                            c12277 = c12275;
                            c10659 = this;
                        } else {
                            c12277 = c12275;
                            int iM450212 = (i10 - C19806.m45029("ۚۖ")) * (-29);
                            i12 = ((iM450212 ^ i11) * 28715) ^ (-721305857);
                            i14 = iM450212 ^ 1871561924;
                            c10659 = this;
                        }
                        break;
                    case -711662300:
                    case 358785006:
                        c12274 = c12277;
                        if (C0671.f2816 != 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i11;
                            i7 = ((iM45029 ^ i10) * 7755) ^ 1760557537;
                            i8 = 2135744348;
                        } else {
                            iM45029 = C19806.m45029("۠ۗ") ^ i11;
                            i7 = ((iM45029 ^ i10) * 26397) ^ (-1642004284);
                            i8 = -7845146;
                        }
                        i14 = iM45029 ^ i8;
                        i12 = i7;
                        c12277 = c12274;
                        break;
                    case -543063066:
                    case 1171265745:
                        C2124.m6673();
                        RunnableC3388.m10064();
                        throw new RuntimeException();
                    case -199532088:
                    case 2057076560:
                        c10659.f36365 = i;
                        c10659.f36364 = i2;
                        if (C1937.f7317 >= 0) {
                            c12274 = c12277;
                            iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i11;
                            i7 = ((iM45029 ^ i10) * 7755) ^ 1760557537;
                            i8 = 2135744348;
                            i14 = iM45029 ^ i8;
                            i12 = i7;
                            c12277 = c12274;
                        } else {
                            int iM450213 = (C19806.m45029("ۚۨ") + i11) * (-115);
                            i14 = iM450213 ^ 598924591;
                            i12 = ((iM450213 ^ i10) * (-28009)) ^ 1777293396;
                        }
                        break;
                    case -90953296:
                    case 931004354:
                        c10659.f36358 = str3;
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            c12274 = c12277;
                            iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i11;
                            i7 = ((iM45029 ^ i10) * 7755) ^ 1760557537;
                            i8 = 2135744348;
                            i14 = iM45029 ^ i8;
                            i12 = i7;
                            c12277 = c12274;
                        } else {
                            int iM450214 = (C19806.m45029("ܺܽ") + i11) * (-5);
                            i14 = iM450214 ^ (-479318954);
                            i12 = ((iM450214 ^ i10) * (-24223)) ^ 1895330452;
                        }
                        break;
                    case 235193296:
                    case 906677020:
                        if (C1875.f7103 >= 0) {
                            int iM450215 = (i10 - C19806.m45029("ۚۖ")) * (-29);
                            i12 = ((iM450215 ^ i11) * 28715) ^ (-721305857);
                            i14 = iM450215 ^ 1871561924;
                            c10659 = this;
                        } else {
                            c12274 = c12277;
                            iM45029 = (C19806.m45029("֡֨") ^ i11) * (-105);
                            i7 = ((iM45029 ^ i10) * (-18219)) ^ (-685527856);
                            i8 = 1867366724;
                            i14 = iM45029 ^ i8;
                            i12 = i7;
                            c12277 = c12274;
                        }
                        break;
                    case 334787684:
                    case 1704742588:
                        c10659.f36360 = str2;
                        if (ThreadFactoryC3888.f14547 <= 0) {
                            c12274 = c12277;
                            iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i11;
                            i7 = ((iM45029 ^ i10) * 7755) ^ 1760557537;
                            i8 = 2135744348;
                            i14 = iM45029 ^ i8;
                            i12 = i7;
                            c12277 = c12274;
                        } else {
                            int iM450216 = C19806.m45029("ܳۖ") ^ i10;
                            i14 = iM450216 ^ (-1401343764);
                            i12 = ((iM450216 ^ i11) * (-18067)) ^ (-1416042893);
                        }
                        break;
                    case 432412869:
                    case 1928813444:
                        c10659.f36353 = abstractC20745;
                        if (C1025.f4800 >= 0) {
                            c12274 = c12277;
                            iM45029 = (C19806.m45029("֡֨") ^ i11) * (-105);
                            i7 = ((iM45029 ^ i10) * (-18219)) ^ (-685527856);
                            i8 = 1867366724;
                            i14 = iM45029 ^ i8;
                            i12 = i7;
                            c12277 = c12274;
                        } else {
                            int iM450217 = C19806.m45029("ۖۧ") ^ i10;
                            i14 = iM450217 ^ 1448026019;
                            i12 = ((iM450217 ^ i11) * 25649) ^ 361657286;
                        }
                        break;
                    case 712933857:
                    case 1074623899:
                        c10659.f36356 = c12277;
                        c10659.f36352 = str;
                        if (!C0817.f3443) {
                            int iM450218 = (i10 - C19806.m45029("ۚۖ")) * (-29);
                            i12 = ((iM450218 ^ i11) * 28715) ^ (-721305857);
                            i14 = iM450218 ^ 1871561924;
                            c10659 = this;
                        } else {
                            iM11306 = C19806.m45029("᩸ۙ") ^ i11;
                            c12274 = c12277;
                            i3 = ((iM11306 ^ i10) * (-3701)) ^ 1964865919;
                            i4 = 752465998;
                            i12 = i3;
                            i14 = iM11306 ^ i4;
                            c12277 = c12274;
                        }
                        break;
                    default:
                        c12275 = c12277;
                        c12276 = new C12274();
                        if (C1419.m4973()) {
                            iM11307 = C19806.m45029("ۗ᩵") ^ i10;
                            i5 = ((iM11307 ^ i11) * 26171) ^ (-402453863);
                            i6 = -849572797;
                        } else {
                            iM11307 = (i11 - ThreadFactoryC3888.m11306("᩻۫")) * (-71);
                            i5 = ((iM11307 ^ i10) * (-26523)) ^ 1997208565;
                            i6 = 302571872;
                        }
                        i14 = iM11307 ^ i6;
                        i12 = i5;
                        c12277 = c12275;
                        c10659 = this;
                        break;
                }
            }
            iM450210 = ThreadFactoryC3888.m11306("ۨ֨") ^ i11;
            i12 = ((iM450210 ^ i10) * 13269) ^ 366340787;
            i13 = 211160706;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x038f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197 A[PHI: r12 r14 r15
      0x0197: PHI (r12v3 java.lang.Object) = 
      (r12v2 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
     binds: [B:57:0x017f, B:50:0x013f, B:44:0x0115, B:41:0x00f7, B:38:0x00d9, B:36:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r14v4 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v3 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
     binds: [B:57:0x017f, B:50:0x013f, B:44:0x0115, B:41:0x00f7, B:38:0x00d9, B:36:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r15v3 java.lang.String) = 
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v2 java.lang.String)
      (r15v1 java.lang.String)
     binds: [B:57:0x017f, B:50:0x013f, B:44:0x0115, B:41:0x00f7, B:38:0x00d9, B:36:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x028d A[PHI: r1 r5 r6 r7 r8 r9
      0x028d: PHI (r1v76 java.lang.CharSequence) = (r1v13 java.lang.CharSequence), (r1v15 java.lang.CharSequence), (r1v77 java.lang.CharSequence) binds: [B:81:0x0275, B:76:0x0239, B:69:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r5v4 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:81:0x0275, B:76:0x0239, B:69:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:81:0x0275, B:76:0x0239, B:69:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:81:0x0275, B:76:0x0239, B:69:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:81:0x0275, B:76:0x0239, B:69:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String), (r9v1 java.lang.String) binds: [B:81:0x0275, B:76:0x0239, B:69:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (l.C2249.m6915() <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (l.C1025.f4800 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (l.C19806.m45024() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        if (l.C19806.f63586 != false) goto L10;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showToast(java.lang.CharSequence r23, java.lang.Object... r24) {
        /*
            Method dump skipped, instruction units count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10659.showToast(java.lang.CharSequence, java.lang.Object[]):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final InputStream getAssetsAsStream(String str) {
        Object obj = null;
        C11986 c11986 = null;
        C3020 c3020M29798 = null;
        int i = -1656996488;
        int i2 = C1066.f4915;
        int i3 = C1461.f5957;
        int iM11306 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-8617)) ^ 1499580032;
        int i5 = -428784860;
        while (true) {
            i = ((((i ^ i3) * (-9341)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2101184896:
                case 904056140:
                    if (!C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12005)) ^ 1596330779;
                        i5 = -696331860;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩺ۛ")) * 15;
                        i4 = ((iM11306 ^ i2) * (-4289)) ^ 980642217;
                        i5 = 1436534632;
                    }
                    break;
                case -2083642093:
                case -542862113:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩺ۛ")) * 15;
                        i4 = ((iM11306 ^ i2) * (-4289)) ^ 980642217;
                        i5 = 1436534632;
                    } else {
                        iM11306 = C19806.m45029("᩷ۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31255)) ^ (-2109818140);
                        i5 = 124532621;
                    }
                    break;
                case -2053781549:
                case -1170989310:
                    obj = this.f36357.f47254;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۢܿ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-13725)) ^ 1564947425;
                        i5 = -1047530641;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3901) ^ 376661411;
                        i5 = -2103230636;
                    }
                    break;
                case -1910820444:
                case 1489215869:
                    C3722.m10894();
                    return null;
                case -1772946542:
                case 1658004905:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i3 - C19806.m45029("᩺ۛ")) * 15;
                        i4 = ((iM11306 ^ i2) * (-4289)) ^ 980642217;
                        i5 = 1436534632;
                    } else {
                        iM11306 = (C19806.m45029("֡ۖ") + i3) * (-79);
                        i4 = ((iM11306 ^ i2) * 22763) ^ 357184939;
                        i5 = -1087275838;
                    }
                    break;
                case -1569483997:
                case 1103299355:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i2 - C19806.m45029("۟ܿ")) * (-61);
                        i4 = ((iM11306 ^ i3) * 4287) ^ 2075694811;
                        i5 = -138653370;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܶ֨")) * 23;
                        i4 = ((iM11306 ^ i3) * (-19565)) ^ (-759909941);
                        i5 = 356589171;
                    }
                    break;
                case -1496570471:
                case 915554071:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28091) ^ 1593261461;
                        i5 = -1537779734;
                    } else {
                        iM11306 = (C19806.m45029("ۡۢ") ^ i2) * (-95);
                        i4 = ((iM11306 ^ i3) * 3263) ^ 247193303;
                        i5 = -826405656;
                    }
                    break;
                case -1237285661:
                case -63876649:
                    RunnableC1606.m5473();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (i2 - C19806.m45029("۟ܿ")) * (-61);
                        i4 = ((iM11306 ^ i3) * 4287) ^ 2075694811;
                        i5 = -138653370;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12005)) ^ 1596330779;
                        i5 = -696331860;
                    }
                    break;
                case -1189956895:
                case 1394866955:
                    return this.f36354.getAssetsAsStream(str);
                case -1126879557:
                case -421284992:
                    c3020M29798 = C11986.m29798(c11986);
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۢܿ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-13725)) ^ 1564947425;
                        i5 = -1047530641;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24909)) ^ 1568356411;
                        i5 = -2026047157;
                    }
                    break;
                case -1122810845:
                case 129726906:
                    if (C3660.m10791() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12005)) ^ 1596330779;
                        i5 = -696331860;
                    } else {
                        iM11306 = (C19806.m45029("ܶ᩵") ^ i3) * 21;
                        i4 = ((iM11306 ^ i2) * (-27101)) ^ (-1527451426);
                        i5 = -500528977;
                    }
                    break;
                case -795900849:
                case 2015484278:
                    C3286.m9798();
                    C1148.m4232();
                    iM11306 = ThreadFactoryC3888.m11306("۫ܶ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-12005)) ^ 1596330779;
                    i5 = -696331860;
                    break;
                case -671476620:
                case 685564605:
                    C0526.m2437();
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28091) ^ 1593261461;
                        i5 = -1537779734;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩺ۛ")) * 15;
                        i4 = ((iM11306 ^ i2) * (-4289)) ^ 980642217;
                        i5 = 1436534632;
                    }
                    break;
                case -547714094:
                case 710413404:
                    this.f36354 = c3020M29798;
                    if (C1668.f6641 < 0) {
                        this.f36367 = new C17008(this);
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩶") ^ i2) * (-5);
                        i4 = ((iM11306 ^ i3) * 4529) ^ 1082010038;
                        i5 = 1348536244;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩺ۛ")) * 15;
                        i4 = ((iM11306 ^ i2) * (-4289)) ^ 980642217;
                        i5 = 1436534632;
                    }
                    break;
                case -262210745:
                case 1034906468:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۢܿ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-13725)) ^ 1564947425;
                        i5 = -1047530641;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24727) ^ 2100673447;
                        i5 = 195683579;
                    }
                    break;
                case 130016898:
                case 1405879021:
                    if (this.f36354 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩶") ^ i2) * (-5);
                        i4 = ((iM11306 ^ i3) * 4529) ^ 1082010038;
                        i5 = 1348536244;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۧ") + i3) * (-33);
                        i4 = ((iM11306 ^ i2) * (-10753)) ^ 1250239311;
                        i5 = 524492511;
                    }
                    break;
                default:
                    c11986 = (C11986) obj;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۢܿ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-13725)) ^ 1564947425;
                        i5 = -1047530641;
                    } else {
                        iM11306 = (C19806.m45029("᩻ܶ") ^ i2) * 61;
                        i4 = ((iM11306 ^ i3) * 26045) ^ (-788133247);
                        i5 = -2107821478;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginId() {
        return this.f36352;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final int getPluginSdkVersion() {
        return this.f36365;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final int getPluginVersionCode() {
        return this.f36364;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[PHI: r12 r16 r17
      0x00d6: PHI (r12v5 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:38:0x00d4, B:34:0x00b8, B:10:0x0047, B:98:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r16v36 int) = (r16v21 int), (r16v22 int), (r16v24 int), (r16v37 int) binds: [B:38:0x00d4, B:34:0x00b8, B:10:0x0047, B:98:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r17v5 int) = (r17v1 int), (r17v2 int), (r17v1 int), (r17v1 int) binds: [B:38:0x00d4, B:34:0x00b8, B:10:0x0047, B:98:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x02f9 A[PHI: r2 r6 r7 r8 r16 r18
      0x02f9: PHI (r2v3 char) = (r2v1 char), (r2v2 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:82:0x02f7, B:74:0x02a3, B:62:0x0212, B:6:0x003f, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:82:0x02f7, B:74:0x02a3, B:62:0x0212, B:6:0x003f, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:82:0x02f7, B:74:0x02a3, B:62:0x0212, B:6:0x003f, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:82:0x02f7, B:74:0x02a3, B:62:0x0212, B:6:0x003f, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r16v26 int) = (r16v5 int), (r16v7 int), (r16v10 int), (r16v19 int), (r16v28 int) binds: [B:82:0x02f7, B:74:0x02a3, B:62:0x0212, B:6:0x003f, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r18v26 short[]) = (r18v2 short[]), (r18v4 short[]), (r18v7 short[]), (r18v17 short[]), (r18v29 short[]) binds: [B:82:0x02f7, B:74:0x02a3, B:62:0x0212, B:6:0x003f, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.PluginContext
    public final boolean setClipboardText(CharSequence charSequence) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 644490053;
        int i13 = C0050.f912;
        int i14 = C1189.f5284;
        int iM45029 = C19806.m45029("ۚ֨") ^ i13;
        int i15 = ((iM45029 ^ i14) * (-21751)) ^ 1150278884;
        int i16 = iM45029 ^ 89032436;
        int iM450210 = 0;
        while (true) {
            int i17 = i16 ^ (i15 & (((i12 ^ i14) * 2567) >> 31));
            switch (i17) {
                case -2140190765:
                case 1753966268:
                    if (C1377.f5749) {
                        iM11307 = (C19806.m45029("֫۬") + i13) * 9;
                        i17 = i17;
                        i3 = ((iM11307 ^ i14) * 13435) ^ 332436740;
                        i4 = -964063081;
                    } else {
                        i17 = i17;
                        iM11307 = (i13 - C19806.m45029("֫֫")) * (-37);
                        i3 = ((iM11307 ^ i14) * (-10353)) ^ 831458055;
                        i4 = -1158546603;
                    }
                    int i18 = i17;
                    i16 = iM11307 ^ i4;
                    i15 = i3;
                    i12 = i18;
                    break;
                case -2060745939:
                case 2121553511:
                    sArr2 = sArr2;
                    i17 = i17;
                    sArr = f36351;
                    if (C0817.m3399()) {
                        iM11306 = (C19806.m45029("ۡۤ") + i14) * 49;
                        i = ((iM11306 ^ i13) * 3879) ^ (-617064900);
                        i2 = -1023962920;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i14) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM11306 ^ i13) * 14723) ^ (-1173983947);
                        i2 = -237901851;
                    }
                    int i19 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i19;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case -2016996114:
                case -879324831:
                    C1668.m5582(iM450210 ^ 2121756169);
                    return false;
                case -1900039787:
                case -1187898391:
                    i17 = i17;
                    i11 = 3;
                    if (C2477.f9839 <= 0) {
                        iM11307 = (i13 - C19806.m45029("֫֫")) * (-37);
                        i3 = ((iM11307 ^ i14) * (-10353)) ^ 831458055;
                        i4 = -1158546603;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܶ۫") ^ i14;
                        i3 = ((iM11307 ^ i13) * (-5151)) ^ 1977282232;
                        i4 = -1062417388;
                    }
                    int i110 = i17;
                    i16 = iM11307 ^ i4;
                    i15 = i3;
                    i12 = i110;
                    break;
                case -1799865751:
                case 2107041166:
                    i17 = i17;
                    try {
                        sArr2 = sArr2;
                        try {
                            m26844().setPrimaryClip(ClipData.newPlainText(null, charSequence));
                            C1668.m5582(C19806.m45029(C2704.m8240(f36351, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 3, i9)) ^ 2126847197);
                            iM11306 = C19806.m45029("ۨ᩵") ^ i13;
                            i = ((iM11306 ^ i14) * (-5929)) ^ 78151893;
                            i2 = -1285298993;
                        } catch (Throwable unused) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤܶ") ^ i14;
                            i = ((iM11306 ^ i13) * 13501) ^ 200817349;
                            i2 = -332774480;
                        }
                    } catch (Throwable unused2) {
                        sArr2 = sArr2;
                    }
                    int i111 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i111;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case -1770238061:
                case -1565176084:
                    i17 = i17;
                    C2477.m7593();
                    sArr2 = sArr2;
                    iM11306 = (ThreadFactoryC3888.m11306("ۗۗ") + i14) * 39;
                    i = ((iM11306 ^ i13) * 28365) ^ 434743752;
                    i2 = 865991029;
                    int i112 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i112;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case -1689882473:
                case 1518349895:
                    i17 = i17;
                    C1025.m3861();
                    if (C1875.m6086() != 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("۬᩺") ^ i13) * (-57);
                        i3 = ((iM11307 ^ i14) * (-27079)) ^ 1223061061;
                        i4 = -1661801304;
                        int i113 = i17;
                        i16 = iM11307 ^ i4;
                        i15 = i3;
                        i12 = i113;
                    } else {
                        sArr2 = sArr2;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۗ") + i14) * 39;
                        i = ((iM11306 ^ i13) * 28365) ^ 434743752;
                        i2 = 865991029;
                        int i114 = iM11306 ^ i2;
                        i12 = i17;
                        i16 = i114;
                        i15 = i;
                        sArr2 = sArr2;
                    }
                    break;
                case -1678404146:
                case 695880930:
                    C3577.m10565();
                    return false;
                case -1670634157:
                case 1473272982:
                    i17 = i17;
                    sArr2 = f36351;
                    i10 = 100;
                    if (C1066.f4915 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("۬᩺") ^ i13) * (-57);
                        i3 = ((iM11307 ^ i14) * (-27079)) ^ 1223061061;
                        i4 = -1661801304;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩶ۨ") + i13) * 47;
                        i3 = ((iM11307 ^ i14) * 27949) ^ (-1851968162);
                        i4 = 1163396402;
                    }
                    int i115 = i17;
                    i16 = iM11307 ^ i4;
                    i15 = i3;
                    i12 = i115;
                    break;
                case -1630740629:
                case -224470555:
                    sArr2 = sArr2;
                    i17 = i17;
                    i5 = s + s2;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i14) * (-41);
                        i = ((iM11306 ^ i13) * (-5503)) ^ (-145319112);
                        i2 = -2066409753;
                    } else {
                        iM11306 = (i13 - C19806.m45029("۫۠")) * (-65);
                        i = ((iM11306 ^ i14) * (-14861)) ^ 1699300866;
                        i2 = -527751610;
                    }
                    int i116 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i116;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case -1326804912:
                case -363627985:
                    i17 = i17;
                    iM450210 = C19806.m45029(C0526.m2424(sArr2, i10, i11, i9));
                    if (C1066.f4915 <= 0) {
                        iM11307 = (i13 - C19806.m45029("֫֫")) * (-37);
                        i3 = ((iM11307 ^ i14) * (-10353)) ^ 831458055;
                        i4 = -1158546603;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۚۡ") ^ i13;
                        i3 = ((iM11307 ^ i14) * 9809) ^ 120668330;
                        i4 = -873638326;
                    }
                    int i117 = i17;
                    i16 = iM11307 ^ i4;
                    i15 = i3;
                    i12 = i117;
                    break;
                case -1190045789:
                case 1191182916:
                    i17 = i17;
                    if (C1189.m4368() <= 0) {
                        sArr2 = sArr2;
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i14) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM11306 ^ i13) * 14723) ^ (-1173983947);
                        i2 = -237901851;
                        int i118 = iM11306 ^ i2;
                        i12 = i17;
                        i16 = i118;
                        i15 = i;
                        sArr2 = sArr2;
                    }
                    sArr2 = sArr2;
                    iM11306 = (ThreadFactoryC3888.m11306("ۗۗ") + i14) * 39;
                    i = ((iM11306 ^ i13) * 28365) ^ 434743752;
                    i2 = 865991029;
                    int i119 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i119;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case -1086040372:
                case -293529775:
                    sArr2 = sArr2;
                    i17 = i17;
                    c = 'c';
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i14 - C19806.m45029("ܽۗ")) * (-13);
                        i = ((iM11306 ^ i13) * (-6983)) ^ 611453622;
                        i2 = -684574238;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡܶ") ^ i13) * (-107);
                        i = ((iM11306 ^ i14) * 27717) ^ 1955266108;
                        i2 = 640663609;
                    }
                    int i1110 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i1110;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case -521172444:
                case 385718391:
                    i17 = i17;
                    if (RunnableC3388.f12514 >= 0) {
                        sArr2 = sArr2;
                        iM11306 = (i14 - C19806.m45029("ܽۗ")) * (-13);
                        i = ((iM11306 ^ i13) * (-6983)) ^ 611453622;
                        i2 = -684574238;
                        int i1111 = iM11306 ^ i2;
                        i12 = i17;
                        i16 = i1111;
                        i15 = i;
                        sArr2 = sArr2;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۬᩺") ^ i13) * (-57);
                        i3 = ((iM11307 ^ i14) * (-27079)) ^ 1223061061;
                        i4 = -1661801304;
                        int i1112 = i17;
                        i16 = iM11307 ^ i4;
                        i15 = i3;
                        i12 = i1112;
                    }
                    break;
                case -46815935:
                case 1231340825:
                    sArr2 = sArr2;
                    i17 = i17;
                    if (C0671.f2816 != 0) {
                        iM11306 = (i14 - C19806.m45029("ܽۗ")) * (-13);
                        i = ((iM11306 ^ i13) * (-6983)) ^ 611453622;
                        i2 = -684574238;
                    } else {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("ۙ֫")) * (-89);
                        i = ((iM11306 ^ i14) * (-20745)) ^ 1298397056;
                        i2 = 5752346;
                    }
                    int i1113 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i1113;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case -11956831:
                case 1886753213:
                    return true;
                case 30508647:
                case 193395080:
                    sArr2 = sArr2;
                    i17 = i17;
                    int i20 = i7 + i8;
                    if (i6 - (i20 + i20) > 0) {
                        iM11306 = (i13 - C19806.m45029("᩹ᩴ")) * 21;
                        i = ((iM11306 ^ i14) * 9477) ^ (-951697233);
                        i2 = 1195101866;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۜ") + i14) * 101;
                        i = ((iM11306 ^ i13) * 3731) ^ (-1350717968);
                        i2 = 1106199874;
                    }
                    int i1114 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i1114;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case 209398391:
                case 2014614128:
                    sArr2 = sArr2;
                    i17 = i17;
                    s = sArr[c];
                    s2 = 17172;
                    if (C2642.m8171() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۗ") + i14) * 39;
                        i = ((iM11306 ^ i13) * 28365) ^ 434743752;
                        i2 = 865991029;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i14;
                        i = ((iM11306 ^ i13) * 13925) ^ (-1601571591);
                        i2 = -292905181;
                    }
                    int i1115 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i1115;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case 229463923:
                case 1367162645:
                    i9 = 33557;
                    iM11306 = (C19806.m45029("ۧۛ") ^ i14) * q.h;
                    i = ((iM11306 ^ i13) * (-14213)) ^ 1356803041;
                    i2 = 1188562872;
                    int i1116 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i1116;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case 1103526608:
                case 2013457602:
                    i9 = 9493;
                    iM11306 = (C19806.m45029("ۧۛ") ^ i14) * q.h;
                    i = ((iM11306 ^ i13) * (-14213)) ^ 1356803041;
                    i2 = 1188562872;
                    int i1117 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i1117;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                case 1199617184:
                case 1795966003:
                    i17 = i17;
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!C0526.f2219) {
                        sArr2 = sArr2;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۗ") + i14) * 39;
                        i = ((iM11306 ^ i13) * 28365) ^ 434743752;
                        i2 = 865991029;
                        int i1118 = iM11306 ^ i2;
                        i12 = i17;
                        i16 = i1118;
                        i15 = i;
                        sArr2 = sArr2;
                    } else {
                        iM11307 = (i13 - C19806.m45029("֫֫")) * (-37);
                        i3 = ((iM11307 ^ i14) * (-10353)) ^ 831458055;
                        i4 = -1158546603;
                        int i1119 = i17;
                        i16 = iM11307 ^ i4;
                        i15 = i3;
                        i12 = i1119;
                    }
                    break;
                case 1240218036:
                case 1964578991:
                    sArr2 = sArr2;
                    i17 = i17;
                    i6 = i5 * i5;
                    i7 = s * s;
                    if (C3722.f13525 <= 0) {
                        iM11306 = (i14 - C19806.m45029("ܽۗ")) * (-13);
                        i = ((iM11306 ^ i13) * (-6983)) ^ 611453622;
                        i2 = -684574238;
                    } else {
                        iM11306 = (C19806.m45029("ۗ֡") ^ i14) * (-99);
                        i = ((iM11306 ^ i13) * 29307) ^ 1048058048;
                        i2 = 942007359;
                    }
                    int i11110 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i11110;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
                default:
                    sArr2 = sArr2;
                    i17 = i17;
                    i8 = 294877584;
                    if (C0216.f1393 != 0) {
                        iM11306 = (i14 - C19806.m45029("ܽۗ")) * (-13);
                        i = ((iM11306 ^ i13) * (-6983)) ^ 611453622;
                        i2 = -684574238;
                    } else {
                        iM11306 = (C19806.m45029("ۢۙ") + i13) * (-93);
                        i = ((iM11306 ^ i14) * (-30513)) ^ (-1600295010);
                        i2 = 1605427462;
                    }
                    int i11111 = iM11306 ^ i2;
                    i12 = i17;
                    i16 = i11111;
                    i15 = i;
                    sArr2 = sArr2;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginVersionName() {
        return this.f36358;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void showToastL(CharSequence charSequence) {
        int i = 0;
        CharSequence charSequenceM8637 = null;
        String str = null;
        int i2 = 1391585155;
        int i3 = C1977.f7413;
        int i4 = C1025.f4800;
        int iM45029 = (i4 - C19806.m45029("ۧ۬")) * 25;
        int i5 = ((iM45029 ^ i3) * 8633) ^ 1939748165;
        int i6 = -507708940;
        while (true) {
            int i7 = iM45029 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 21083) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2140153387:
                    case 1289216430:
                        RunnableC1606.m5473();
                        if (C0526.f2219) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-2823)) ^ 1205742027;
                            i6 = 1059006738;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩶ᩴ") ^ i4) * 115;
                            i5 = ((iM45029 ^ i3) * 6827) ^ (-91002669);
                            i6 = -1153350285;
                        }
                        break;
                    case -2131252178:
                    case -928288635:
                        if (C3577.f13150 >= 0) {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ᩻")) * 31;
                            i5 = ((iM45029 ^ i4) * (-14931)) ^ (-1734308444);
                            i6 = -603195211;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ۬") ^ i4) * (-15);
                            i5 = ((iM45029 ^ i3) * (-9269)) ^ (-2088714959);
                            i6 = -278203374;
                        }
                        break;
                    case -1957397304:
                    case 678352930:
                        charSequenceM8637 = C2871.m8637(this, str);
                        if (charSequenceM8637 == null) {
                            charSequenceM8637 = charSequence;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("᩸֡") ^ i3) * (-109);
                        i5 = ((iM45029 ^ i4) * (-18755)) ^ 376074809;
                        i6 = -1442242339;
                        break;
                    case -1928442431:
                    case -1194599924:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM45029 = C19806.m45029("ᩳ֡") ^ i3;
                            i5 = ((iM45029 ^ i4) * 22311) ^ 2074468463;
                            i6 = -1688532599;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۖ۬") + i4) * 51;
                            i5 = ((iM45029 ^ i3) * (-3383)) ^ 1277385681;
                            i6 = -508882214;
                        }
                        break;
                    case -1884180994:
                    case -1719612919:
                        str = (String) charSequence;
                        if (C2871.m8641(str) >= 3) {
                            iM45029 = (C19806.m45029("۟ᩴ") + i4) * (-43);
                            i5 = ((iM45029 ^ i3) * 9775) ^ 2053017537;
                            i6 = 824868263;
                        } else {
                            charSequenceM8637 = charSequence;
                            iM45029 = (ThreadFactoryC3888.m11306("᩸֡") ^ i3) * (-109);
                            i5 = ((iM45029 ^ i4) * (-18755)) ^ 376074809;
                            i6 = -1442242339;
                        }
                        break;
                    case -1615107552:
                    case 238488499:
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-2823)) ^ 1205742027;
                            i6 = 1059006738;
                        } else {
                            iM45029 = C19806.m45029("۟ܰ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-43)) ^ (-250595912);
                            i6 = 1965556434;
                        }
                        break;
                    case -1588995820:
                    case -924286975:
                        if (C3743.m10966() <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-2823)) ^ 1205742027;
                            i6 = 1059006738;
                        } else {
                            iM45029 = (C19806.m45029("ܳۧ") + i3) * (-71);
                            i5 = ((iM45029 ^ i4) * 20043) ^ (-1395594379);
                            i6 = 719394189;
                        }
                        break;
                    case -1528662643:
                    case 333163689:
                        if (RunnableC1895.m6170() != 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-2823)) ^ 1205742027;
                            i6 = 1059006738;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i4;
                            i5 = ((iM45029 ^ i3) * 30531) ^ 1235812137;
                            i6 = 408525457;
                        }
                        break;
                    case -1498066474:
                    case 1830391685:
                        C2704.m8255();
                        break;
                    case -1242883673:
                    case 1916030725:
                        if (!(charSequence instanceof String)) {
                            i = 0;
                            charSequenceM8637 = charSequence;
                            iM45029 = (ThreadFactoryC3888.m11306("᩸֡") ^ i3) * (-109);
                            i5 = ((iM45029 ^ i4) * (-18755)) ^ 376074809;
                            i6 = -1442242339;
                        } else {
                            int iM450210 = (C19806.m45029("۟ۙ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM450210 ^ i4) * (-15801)) ^ (-855807408);
                            i7 = iM450210 ^ 1254027408;
                            i = 0;
                        }
                        break;
                    case -1188840566:
                    case -734610805:
                        C0074 c0074 = C21157.f68901;
                        if (C1460.f5948 < 0) {
                            ThreadUtil.runOnUiThread(new RunnableC7752(i, charSequenceM8637));
                        }
                        iM45029 = C19806.m45029("ᩳ֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * 22311) ^ 2074468463;
                        i6 = -1688532599;
                        break;
                    case -1090422115:
                    case 1792054613:
                        if (RunnableC3388.m10064()) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۨ᩺") + i3) * 65;
                            i5 = ((iM45029 ^ i4) * 3901) ^ 1660290320;
                            i6 = -1348045638;
                        } else {
                            iM45029 = C19806.m45029("ۢܶ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11353)) ^ (-1286452990);
                            i6 = -1670985227;
                        }
                        break;
                    case -1059465933:
                    case 479414018:
                        if (C1977.m6362(str, i) == '{') {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽۤ") + i3) * (-85);
                            i5 = ((iM45029 ^ i4) * (-31501)) ^ (-492554410);
                            i6 = 614002053;
                        } else {
                            charSequenceM8637 = charSequence;
                            iM45029 = (ThreadFactoryC3888.m11306("᩸֡") ^ i3) * (-109);
                            i5 = ((iM45029 ^ i4) * (-18755)) ^ 376074809;
                            i6 = -1442242339;
                        }
                        break;
                    case -1043196762:
                    case 849009928:
                        C0671.m3008();
                        if (!C2332.f8260) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-2823)) ^ 1205742027;
                            i6 = 1059006738;
                        } else {
                            iM45029 = C19806.m45029("ۢܶ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11353)) ^ (-1286452990);
                            i6 = -1670985227;
                        }
                        break;
                    case -577179043:
                    case 657277799:
                        if (C0278.f1572 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-2823)) ^ 1205742027;
                            i6 = 1059006738;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۗܳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 26855) ^ (-290146235);
                            i6 = -1016429734;
                        }
                        break;
                    case -414382820:
                    case -274460696:
                        if (C0278.m1779(1, str) == '}') {
                            iM45029 = C19806.m45029("᩸᩹") ^ i4;
                            i5 = ((iM45029 ^ i3) * 3535) ^ 1546851132;
                            i6 = -119774228;
                        } else {
                            charSequenceM8637 = charSequence;
                            iM45029 = (ThreadFactoryC3888.m11306("᩸֡") ^ i3) * (-109);
                            i5 = ((iM45029 ^ i4) * (-18755)) ^ 376074809;
                            i6 = -1442242339;
                        }
                        break;
                    case -69179122:
                    case 2064156080:
                        C0817.m3399();
                        C19806.m45024();
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-2823)) ^ 1205742027;
                        i6 = 1059006738;
                        break;
                    case 275748877:
                    case 720683487:
                        if (C2871.m8646()) {
                            iM45029 = C19806.m45029("᩸ۖ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 16153) ^ 1888898718;
                            i6 = 1546759529;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-2823)) ^ 1205742027;
                            i6 = 1059006738;
                        }
                        break;
                    case 2081187628:
                    case 2127443209:
                        if (C1189.m4368() <= 0) {
                            iM45029 = C19806.m45029("ᩳ֡") ^ i3;
                            i5 = ((iM45029 ^ i4) * 22311) ^ 2074468463;
                            i6 = -1688532599;
                        } else {
                            iM45029 = (C19806.m45029("ܰ۟") ^ i4) * q.h;
                            i5 = ((iM45029 ^ i3) * (-19081)) ^ (-113353807);
                            i6 = 1589551596;
                        }
                        break;
                    default:
                        if (RunnableC1606.f6488 >= 0) {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ᩻")) * 31;
                            i5 = ((iM45029 ^ i4) * (-14931)) ^ (-1734308444);
                            i6 = -603195211;
                        } else {
                            iM45029 = C19806.m45029("ۢܶ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11353)) ^ (-1286452990);
                            i6 = -1670985227;
                        }
                        break;
                }
                return;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void showToast(CharSequence charSequence) {
        int i = 0;
        CharSequence charSequenceM8637 = null;
        String str = null;
        int i2 = 1171867089;
        int i3 = C3577.f13150;
        int i4 = C1937.f7317;
        int iM45029 = (C19806.m45029("ۘ֫") ^ i4) * (-51);
        int i5 = ((iM45029 ^ i3) * (-23435)) ^ 1328337101;
        int i6 = 302637706;
        while (true) {
            int i7 = iM45029 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 25915) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2098497300:
                    case 1119775591:
                        charSequenceM8637 = C2871.m8637(this, str);
                        if (charSequenceM8637 == null) {
                            charSequenceM8637 = charSequence;
                        }
                        iM45029 = (C19806.m45029("᩹۠") + i4) * (-25);
                        i5 = ((iM45029 ^ i3) * 23509) ^ 305550855;
                        i6 = 1454832403;
                        break;
                    case -2015158524:
                    case -896907751:
                        if (AbstractC0464.f2088 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۖۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM45029 ^ i4) * (-24281)) ^ 1574014068;
                            i6 = 1695065517;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("۬۟") ^ i3;
                            i5 = ((iM45029 ^ i4) * 25957) ^ 1702587442;
                            i6 = 2127773868;
                        }
                        break;
                    case -1870411497:
                    case -942600829:
                        if (ThreadFactoryC3888.m11300() <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩸۠") + i4) * 57;
                            i5 = ((iM45029 ^ i3) * (-8389)) ^ (-1329068560);
                            i6 = -669753071;
                        } else {
                            iM45029 = (C19806.m45029("᩹ᩴ") + i3) * 21;
                            i5 = ((iM45029 ^ i4) * 21515) ^ (-2044690474);
                            i6 = 1861885339;
                        }
                        break;
                    case -1779218990:
                    case -572394595:
                        if (C2124.m6673() <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("۫֨") + i4) * (-9);
                            i5 = ((iM45029 ^ i3) * 1775) ^ 741973851;
                            i6 = -1644989010;
                        } else {
                            iM45029 = C19806.m45029("ۧܳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 20501) ^ (-344337875);
                            i6 = 956213838;
                        }
                        break;
                    case -1770539790:
                    case 458962511:
                        C3577.m10565();
                        if (!C3286.f12186) {
                            iM45029 = (C19806.m45029("ܺ᩶") ^ i3) * (-119);
                            i5 = ((iM45029 ^ i4) * 30795) ^ (-323711073);
                            i6 = 1126261653;
                        } else {
                            iM45029 = C19806.m45029("ۢ۫") ^ i3;
                            i5 = ((iM45029 ^ i4) * 10669) ^ (-535169036);
                            i6 = -580770783;
                        }
                        break;
                    case -1738505018:
                    case -1514520964:
                        if (C2871.f10837 >= 0) {
                            iM45029 = (C19806.m45029("ܺ᩶") ^ i3) * (-119);
                            i5 = ((iM45029 ^ i4) * 30795) ^ (-323711073);
                            i6 = 1126261653;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("۫֨") + i4) * (-9);
                            i5 = ((iM45029 ^ i3) * 1775) ^ 741973851;
                            i6 = -1644989010;
                        }
                        break;
                    case -1626148910:
                    case -882388634:
                        if (C0797.f3386) {
                            iM45029 = C19806.m45029("ۢ۫") ^ i3;
                            i5 = ((iM45029 ^ i4) * 10669) ^ (-535169036);
                            i6 = -580770783;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۘ᩵") ^ i3) * 109;
                            i5 = ((iM45029 ^ i4) * 3995) ^ (-1791558741);
                            i6 = 1407316152;
                        }
                        break;
                    case -1502020585:
                    case 2072545263:
                        str = (String) charSequence;
                        if (C1977.m6360(str) >= 3) {
                            iM45029 = ThreadFactoryC3888.m11306("ܰ᩵") ^ i4;
                            i5 = ((iM45029 ^ i3) * 30241) ^ 1527277672;
                            i6 = -805510831;
                        } else {
                            charSequenceM8637 = charSequence;
                            iM45029 = (C19806.m45029("᩹۠") + i4) * (-25);
                            i5 = ((iM45029 ^ i3) * 23509) ^ 305550855;
                            i6 = 1454832403;
                        }
                        break;
                    case -1393474753:
                    case 74089875:
                        C0074 c0074 = C21157.f68901;
                        if (C0817.f3443) {
                            ThreadUtil.runOnUiThread(new RunnableC10575(i, charSequenceM8637));
                        }
                        iM45029 = (C19806.m45029("ܺ᩶") ^ i3) * (-119);
                        i5 = ((iM45029 ^ i4) * 30795) ^ (-323711073);
                        i6 = 1126261653;
                        break;
                    case -1166843122:
                    case 1051263804:
                        if (C1025.f4800 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۖۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM45029 ^ i4) * (-24281)) ^ 1574014068;
                            i6 = 1695065517;
                        } else {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ܶܶ")) * (-121);
                            i5 = ((iM45029 ^ i3) * 11073) ^ (-462282500);
                            i6 = 1401462200;
                        }
                        break;
                    case -1163195309:
                    case -692164918:
                        if (C0962.f3784) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۖۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM45029 ^ i4) * (-24281)) ^ 1574014068;
                            i6 = 1695065517;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۨۗ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-21609)) ^ 416655970;
                            i6 = 2139065210;
                        }
                        break;
                    case -750648817:
                    case -549059752:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("۫֨") + i4) * (-9);
                            i5 = ((iM45029 ^ i3) * 1775) ^ 741973851;
                            i6 = -1644989010;
                        } else {
                            iM45029 = (C19806.m45029("ۧܽ") + i3) * (-59);
                            i5 = ((iM45029 ^ i4) * (-263)) ^ 1706493725;
                            i6 = -711089047;
                        }
                        break;
                    case -467738740:
                    case 839148255:
                        if (C1148.m4232() <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۖۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM45029 ^ i4) * (-24281)) ^ 1574014068;
                            i6 = 1695065517;
                        } else {
                            iM45029 = (C19806.m45029("᩹ۤ") ^ i4) * 59;
                            i5 = ((iM45029 ^ i3) * 24947) ^ 1319085818;
                            i6 = -272882863;
                        }
                        break;
                    case -441313850:
                    case -343798557:
                        if (!(charSequence instanceof String)) {
                            i = 0;
                            charSequenceM8637 = charSequence;
                            iM45029 = (C19806.m45029("᩹۠") + i4) * (-25);
                            i5 = ((iM45029 ^ i3) * 23509) ^ 305550855;
                            i6 = 1454832403;
                        } else {
                            int iM450210 = C19806.m45029("ᩳۗ") ^ i3;
                            i5 = ((iM450210 ^ i4) * (-16879)) ^ (-49806750);
                            i7 = iM450210 ^ (-515440776);
                            i = 0;
                        }
                        break;
                    case 95947907:
                    case 1232994738:
                        C10634.m26820();
                        C0050.m946();
                        iM45029 = (ThreadFactoryC3888.m11306("۫֨") + i4) * (-9);
                        i5 = ((iM45029 ^ i3) * 1775) ^ 741973851;
                        i6 = -1644989010;
                        break;
                    case 139115145:
                    case 1896602275:
                        if (C0216.m1576(1, str) == '}') {
                            iM45029 = (ThreadFactoryC3888.m11306("۠֨") + i4) * (-105);
                            i5 = ((iM45029 ^ i3) * (-12479)) ^ (-2084085861);
                            i6 = -844012881;
                        } else {
                            charSequenceM8637 = charSequence;
                            iM45029 = (C19806.m45029("᩹۠") + i4) * (-25);
                            i5 = ((iM45029 ^ i3) * 23509) ^ 305550855;
                            i6 = 1454832403;
                        }
                        break;
                    case 405079016:
                    case 732649352:
                        C2788.m8472();
                        C0278.m1789();
                        break;
                    case 608202105:
                    case 1804618442:
                        if (C2871.m8652(str, i) == '{') {
                            iM45029 = (C19806.m45029("۟֫") + i3) * 31;
                            i5 = ((iM45029 ^ i4) * (-11361)) ^ (-2127805474);
                            i6 = -805414846;
                        } else {
                            charSequenceM8637 = charSequence;
                            iM45029 = (C19806.m45029("᩹۠") + i4) * (-25);
                            i5 = ((iM45029 ^ i3) * 23509) ^ 305550855;
                            i6 = 1454832403;
                        }
                        break;
                    case 1202698811:
                    case 1325687716:
                        if (!C3286.f12186) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩸۠") + i4) * 57;
                            i5 = ((iM45029 ^ i3) * (-8389)) ^ (-1329068560);
                            i6 = -669753071;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("۫֨") + i4) * (-9);
                            i5 = ((iM45029 ^ i3) * 1775) ^ 741973851;
                            i6 = -1644989010;
                        }
                        break;
                    default:
                        if (ThreadFactoryC3888.f14547 <= 0) {
                            iM45029 = (C19806.m45029("ܺ᩶") ^ i3) * (-119);
                            i5 = ((iM45029 ^ i4) * 30795) ^ (-323711073);
                            i6 = 1126261653;
                        } else {
                            iM45029 = C19806.m45029("ۡۙ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-26239)) ^ 12454546;
                            i6 = 1957578407;
                        }
                        break;
                }
                return;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getHostPackageName() {
        return C16737.m39293();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final CharSequence getClipboardText() {
        CharSequence text = null;
        Object th = null;
        CharSequence charSequence = null;
        int i = -943723675;
        int i2 = C2249.f8050;
        int i3 = C1066.f4915;
        int iM45029 = (C19806.m45029("ۨ᩵") ^ i2) * (-53);
        int i4 = ((iM45029 ^ i3) * (-5271)) ^ (-192757508);
        int i5 = -922969768;
        while (true) {
            i = ((((i ^ i3) * 21579) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2051024021:
                case 2088335038:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17253)) ^ 2105059937;
                        i5 = -463192852;
                    } else {
                        iM45029 = (C19806.m45029("ۖᩴ") + i2) * 109;
                        i4 = ((iM45029 ^ i3) * 10131) ^ (-1890337335);
                        i5 = -1895784682;
                    }
                    break;
                case -1998711519:
                case 1501890540:
                    if (C0797.m3359()) {
                        iM45029 = C19806.m45029("ۖۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-8585)) ^ 1703512471;
                        i5 = 820890318;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22119)) ^ 1891534517;
                        i5 = 1780998909;
                    }
                    break;
                case -1878747099:
                case 505582475:
                    charSequence = "";
                    iM45029 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-7917)) ^ (-1462353511);
                    i5 = -666189296;
                    break;
                case -1712323862:
                case 1632093284:
                    if (C1189.m4368() <= 0) {
                        iM45029 = C19806.m45029("᩻۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8275) ^ (-1882985618);
                        i5 = 21592437;
                    } else {
                        iM45029 = C19806.m45029("ۜۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1211) ^ 1472285028;
                        i5 = 882965257;
                    }
                    break;
                case -1575162742:
                case -475798162:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17253)) ^ 2105059937;
                        i5 = -463192852;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۜ") + i2) * 63;
                        i4 = ((iM45029 ^ i3) * 26051) ^ (-1938731838);
                        i5 = 2056400849;
                    }
                    break;
                case -1512989594:
                case 1693871051:
                    C1460.m5050();
                    if (!RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22119)) ^ 1891534517;
                        i5 = 1780998909;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17253)) ^ 2105059937;
                        i5 = -463192852;
                    }
                    break;
                case -943674542:
                case 1502888245:
                    return C2124.m6674(th);
                case -931141367:
                case 69359138:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C1460.m5050();
                    return null;
                case -850081055:
                case 875535359:
                    if (text == null) {
                        iM45029 = (C19806.m45029("᩶ܰ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 20551) ^ (-911641931);
                        i5 = 1451955304;
                    } else {
                        charSequence = text;
                        iM45029 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7917)) ^ (-1462353511);
                        i5 = -666189296;
                    }
                    break;
                case -514088235:
                case 406581348:
                    RunnableC1564.m5345();
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("᩹ۧ")) * (-47);
                    i4 = ((iM45029 ^ i3) * 6487) ^ 591253474;
                    i5 = -1434866285;
                    break;
                case -409351949:
                case 1706014047:
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("᩻۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8275) ^ (-1882985618);
                        i5 = 21592437;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 10449) ^ 735722494;
                        i5 = 1857020549;
                    }
                    break;
                case -188518117:
                case 199779307:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("᩻۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8275) ^ (-1882985618);
                        i5 = 21592437;
                    } else {
                        iM45029 = C19806.m45029("ۚ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10985)) ^ 1881156917;
                        i5 = -1048360267;
                    }
                    break;
                case -117174244:
                case 1824196686:
                    if (C0797.f3386) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳᩴ")) * (-107);
                        i4 = ((iM45029 ^ i2) * (-13693)) ^ (-346546357);
                        i5 = 1669825013;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۛ") ^ i3) * 97;
                        i4 = ((iM45029 ^ i2) * 587) ^ (-1926938300);
                        i5 = 359119515;
                    }
                    break;
                case -17786023:
                case 573918573:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22119)) ^ 1891534517;
                        i5 = 1780998909;
                    } else {
                        iM45029 = (C19806.m45029("᩻ۡ") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-13607)) ^ 1101456045;
                        i5 = 270245092;
                    }
                    break;
                case 31520059:
                case 696137262:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳᩴ")) * (-107);
                        i4 = ((iM45029 ^ i2) * (-13693)) ^ (-346546357);
                        i5 = 1669825013;
                    } else {
                        iM45029 = (C19806.m45029("ܽ۠") + i3) * (-113);
                        i4 = ((iM45029 ^ i2) * (-25917)) ^ 2010260701;
                        i5 = -1621773058;
                    }
                    break;
                case 185807249:
                case 1997911044:
                    try {
                        text = m26844().getText();
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۧ") ^ i2) * 41;
                        i4 = ((iM45029 ^ i3) * 31563) ^ 1701946439;
                        i5 = 36029668;
                    } catch (Throwable th2) {
                        th = th2;
                        iM45029 = (C19806.m45029("ۢ᩸") ^ i3) * 55;
                        i4 = ((iM45029 ^ i2) * (-22363)) ^ (-1521064316);
                        i5 = 474880730;
                    }
                    break;
                case 261825810:
                case 1499386151:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳᩴ")) * (-107);
                        i4 = ((iM45029 ^ i2) * (-13693)) ^ (-346546357);
                        i5 = 1669825013;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩹ۧ")) * (-47);
                        i4 = ((iM45029 ^ i3) * 6487) ^ 591253474;
                        i5 = -1434866285;
                    }
                    break;
                case 604483994:
                case 1605296499:
                    C1148.m4232();
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22119)) ^ 1891534517;
                        i5 = 1780998909;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩹ۧ")) * (-47);
                        i4 = ((iM45029 ^ i3) * 6487) ^ 591253474;
                        i5 = -1434866285;
                    }
                    break;
                case 1431386482:
                case 1468799728:
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("ۗ᩶") ^ i2) * (-45);
                        i4 = ((iM45029 ^ i3) * 21881) ^ (-1447583557);
                        i5 = 1376656526;
                    } else {
                        iM45029 = C19806.m45029("᩻۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8275) ^ (-1882985618);
                        i5 = 21592437;
                    }
                    break;
                default:
                    return charSequence;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final SharedPreferences getPreferences() {
        if (this.f36363 == null) {
            synchronized (this) {
                if (this.f36363 == null) {
                    this.f36363 = C17132.m40030((String) this.f36362.f31741);
                }
            }
        }
        return this.f36363;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getString(String str, Object... objArr) {
        int i = 1528650011;
        int i2 = C1937.f7317;
        int i3 = C2871.f10837;
        int iM45029 = (C19806.m45029("۫᩷") ^ i2) * (-15);
        int i4 = ((iM45029 ^ i3) * 24861) ^ 31970990;
        int i5 = 1365928071;
        while (true) {
            i = ((((i ^ i3) * (-2631)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1963302231:
                case 263170388:
                    RunnableC1895.m6170();
                    C0797.m3359();
                    return null;
                case -1825165459:
                case -638082650:
                    if (RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("ܿۜ") + i2) * 115;
                        i4 = ((iM45029 ^ i3) * (-20451)) ^ 1489845112;
                        i5 = 1856480322;
                    } else {
                        iM45029 = C19806.m45029("۫ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27615)) ^ 2022505627;
                        i5 = -642310867;
                    }
                    break;
                case -1661663682:
                case 837414790:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֫") ^ i2) * 73;
                        i4 = ((iM45029 ^ i3) * 14207) ^ (-749305029);
                        i5 = 570028288;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩸ۙ")) * (-95);
                        i4 = ((iM45029 ^ i2) * (-30609)) ^ (-717980600);
                        i5 = -1133058954;
                    }
                    break;
                case -1587121375:
                case 331549659:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۘ") ^ i3) * (-123);
                        i4 = ((iM45029 ^ i2) * (-2041)) ^ (-1341722014);
                        i5 = -1787132977;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺ᩸")) * (-71);
                        i4 = ((iM45029 ^ i2) * 5823) ^ (-625402576);
                        i5 = -716556617;
                    }
                    break;
                case -1509036824:
                case 270659004:
                    return m26845(getString(str), objArr);
                case -973437091:
                case 1434267773:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֫") ^ i2) * 73;
                        i4 = ((iM45029 ^ i3) * 14207) ^ (-749305029);
                        i5 = 570028288;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܰ") ^ i3) * (-45);
                        i4 = ((iM45029 ^ i2) * 5299) ^ (-900133194);
                        i5 = -1685238457;
                    }
                    break;
                case -960310194:
                case 655255503:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("ܿۜ") + i2) * 115;
                        i4 = ((iM45029 ^ i3) * (-20451)) ^ 1489845112;
                        i5 = 1856480322;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4035) ^ 32000108;
                        i5 = -308075333;
                    }
                    break;
                case -537097240:
                case 1599330799:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ۚܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3733)) ^ 1722783953;
                        i5 = 1255857644;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩵") ^ i3) * (-59);
                        i4 = ((iM45029 ^ i2) * 29433) ^ 459757126;
                        i5 = -781295807;
                    }
                    break;
                case -289581809:
                case 644531069:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩵") ^ i3) * (-59);
                        i4 = ((iM45029 ^ i2) * 29433) ^ 459757126;
                        i5 = -781295807;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23379) ^ (-772722614);
                        i5 = 763254891;
                    }
                    break;
                case -274184550:
                case 320082002:
                    C3535.m10431();
                    if (!C19806.f63586) {
                        iM45029 = (i3 - C19806.m45029("ܺ᩸")) * (-71);
                        i4 = ((iM45029 ^ i2) * 5823) ^ (-625402576);
                        i5 = -716556617;
                    } else {
                        iM45029 = (C19806.m45029("ܿۜ") + i2) * 115;
                        i4 = ((iM45029 ^ i3) * (-20451)) ^ 1489845112;
                        i5 = 1856480322;
                    }
                    break;
                case -181208887:
                case 410271269:
                    C1668.m5583();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = (i3 - C19806.m45029("ܺ᩸")) * (-71);
                        i4 = ((iM45029 ^ i2) * 5823) ^ (-625402576);
                        i5 = -716556617;
                    } else {
                        iM45029 = (C19806.m45029("ۜۢ") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-10437)) ^ (-2144584227);
                        i5 = -763981140;
                    }
                    break;
                case 140041503:
                case 1837843843:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֫") ^ i2) * 73;
                        i4 = ((iM45029 ^ i3) * 14207) ^ (-749305029);
                        i5 = 570028288;
                    } else {
                        iM45029 = (C19806.m45029("ۨ۠") + i2) * 27;
                        i4 = ((iM45029 ^ i3) * (-5489)) ^ 1590973221;
                        i5 = -1987411750;
                    }
                    break;
                case 449023985:
                case 2124301814:
                    if (C2704.m8255() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֫") ^ i2) * 73;
                        i4 = ((iM45029 ^ i3) * 14207) ^ (-749305029);
                        i5 = 570028288;
                    } else {
                        iM45029 = C19806.m45029("ܿۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14363)) ^ 1976682048;
                        i5 = -631931502;
                    }
                    break;
                case 839628046:
                case 1856337178:
                    if (C0797.m3359()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶֨")) * (-17);
                        i4 = ((iM45029 ^ i2) * (-21993)) ^ 1083829697;
                        i5 = 371015897;
                    } else {
                        iM45029 = (C19806.m45029("ۜۢ") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-10437)) ^ (-2144584227);
                        i5 = -763981140;
                    }
                    break;
                case 1212067175:
                case 1504689369:
                    C1977.m6356();
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩵") ^ i3) * (-59);
                        i4 = ((iM45029 ^ i2) * 29433) ^ 459757126;
                        i5 = -781295807;
                    } else {
                        iM45029 = (C19806.m45029("ܿۜ") + i2) * 115;
                        i4 = ((iM45029 ^ i3) * (-20451)) ^ 1489845112;
                        i5 = 1856480322;
                    }
                    break;
                default:
                    C2704.m8255();
                    iM45029 = (i3 - C19806.m45029("ܺ᩸")) * (-71);
                    i4 = ((iM45029 ^ i2) * 5823) ^ (-625402576);
                    i5 = -716556617;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getLanguage() {
        return C21157.m47604();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getCountry() {
        return C21157.m47606();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getLanguageCountry() {
        return C21157.m47596();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0292 A[PHI: r0 r1 r16 r17
      0x0292: PHI (r0v5 short[]) = (r0v3 short[]), (r0v2 short[]), (r0v2 short[]), (r0v2 short[]) binds: [B:70:0x0290, B:61:0x0235, B:57:0x0211, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r1v5 char) = (r1v2 char), (r1v2 char), (r1v3 char), (r1v2 char) binds: [B:70:0x0290, B:61:0x0235, B:57:0x0211, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r16v14 int) = (r16v3 int), (r16v5 int), (r16v6 int), (r16v15 int) binds: [B:70:0x0290, B:61:0x0235, B:57:0x0211, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r17v15 int) = (r17v2 int), (r17v4 int), (r17v5 int), (r17v16 int) binds: [B:70:0x0290, B:61:0x0235, B:57:0x0211, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.PluginContext
    @Deprecated
    public final LocalString getLocalString() {
        int i;
        int i2;
        int iM11306;
        int i3;
        int iM45029;
        int i4;
        int i5;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1442008167;
        int i13 = C2124.f7782;
        int i14 = C3660.f13403;
        int iM11307 = (ThreadFactoryC3888.m11306("֡ܽ") + i14) * (-107);
        int i15 = ((iM11307 ^ i13) * 12305) ^ 923703097;
        int i16 = -201594411;
        while (true) {
            int i17 = iM11307 ^ i16;
            while (true) {
                i12 = ((((i12 ^ i13) * 2365) >> 31) & i15) ^ i17;
                switch (i12) {
                    case -1962835093:
                    case 1720119756:
                        int i18 = i6 + i7;
                        i8 = i18 + i18;
                        if (C3743.f13569) {
                            i = i6;
                            int iM11308 = (ThreadFactoryC3888.m11306("ۖ᩸") ^ i14) * 71;
                            i15 = ((iM11308 ^ i13) * 19383) ^ (-1233003329);
                            i17 = iM11308 ^ (-25990289);
                        } else {
                            int iM450210 = (i13 - C19806.m45029("ܶܳ")) * 35;
                            i = i6;
                            i17 = iM450210 ^ (-859137679);
                            i15 = ((iM450210 ^ i14) * (-5409)) ^ 809172800;
                        }
                        i6 = i;
                        break;
                    case -1763090725:
                    case 2048376684:
                        C0278.m1789();
                        C0216.m1591();
                        return null;
                    case -1700993117:
                    case 594608187:
                        i5 = 28483;
                        int iM450211 = C19806.m45029("ۘۚ") ^ i14;
                        int i19 = i5;
                        i17 = iM450211 ^ (-1586868781);
                        i15 = ((iM450211 ^ i13) * (-3055)) ^ 109787230;
                        i9 = i19;
                        break;
                    case -1364880152:
                    case -804565215:
                        i = i6;
                        i2 = i8;
                        if (C3660.m10791() != 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ܽ") + i13) * 119;
                            i15 = 1726830612 ^ ((iM11306 ^ i14) * 26799);
                            i3 = -1322058832;
                        } else {
                            iM11306 = (i13 - ThreadFactoryC3888.m11306("ۚܰ")) * 69;
                            i15 = 1148673067 ^ ((iM11306 ^ i14) * 6219);
                            i3 = 2137647997;
                        }
                        i17 = iM11306 ^ i3;
                        i8 = i2;
                        i6 = i;
                        break;
                    case -994859683:
                    case -726820989:
                        i5 = 51722;
                        int iM450212 = C19806.m45029("ۘۚ") ^ i14;
                        int i110 = i5;
                        i17 = iM450212 ^ (-1586868781);
                        i15 = ((iM450212 ^ i13) * (-3055)) ^ 109787230;
                        i9 = i110;
                        break;
                    case -830504788:
                    case 1246832179:
                        if (C2477.f9839 <= 0) {
                            i11 = 6;
                            int iM450213 = (i13 - C19806.m45029("ܶܳ")) * 35;
                            i = i6;
                            i17 = iM450213 ^ (-859137679);
                            i15 = ((iM450213 ^ i14) * (-5409)) ^ 809172800;
                            i6 = i;
                        } else {
                            int iM11309 = (i14 - ThreadFactoryC3888.m11306("ܶܿ")) * (-71);
                            i17 = iM11309 ^ (-894685593);
                            i15 = ((iM11309 ^ i13) * (-13411)) ^ (-1073490048);
                            i11 = 6;
                        }
                        break;
                    case -504510850:
                    case 1757034973:
                        i = i6;
                        i2 = i8;
                        if (C0629.f2722 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ᩳ֡") + i14) * 59;
                            i15 = 749111401 ^ ((iM11306 ^ i13) * 29789);
                            i3 = 1534753475;
                            i17 = iM11306 ^ i3;
                            i8 = i2;
                            i6 = i;
                        } else {
                            i6 = i;
                            iM45029 = ThreadFactoryC3888.m11306("᩸᩺") ^ i13;
                            i15 = ((iM45029 ^ i14) * 525) ^ 101125317;
                            i4 = -1618448509;
                            i17 = iM45029 ^ i4;
                            i8 = i2;
                        }
                        break;
                    case -364043024:
                    case 609805901:
                        return m26849(C3660.m10790(sArr2, i10, i11, i9));
                    case -284681912:
                    case 736012931:
                        i2 = i8;
                        s2 = 3273;
                        if (AbstractC0464.f2088 > 0) {
                            iM45029 = C19806.m45029("۬۠") ^ i13;
                            i15 = ((iM45029 ^ i14) * 11927) ^ (-676409261);
                            i4 = 497617143;
                            i17 = iM45029 ^ i4;
                            i8 = i2;
                        } else {
                            i8 = i2;
                            int iM450214 = (i13 - C19806.m45029("ܶܳ")) * 35;
                            i = i6;
                            i17 = iM450214 ^ (-859137679);
                            i15 = ((iM450214 ^ i14) * (-5409)) ^ 809172800;
                            i6 = i;
                        }
                        break;
                    case -244978733:
                    case 1558171520:
                        i2 = i8;
                        i6 = s * s;
                        i7 = 10712529;
                        if (C1025.m3861() <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩸᩺") ^ i13;
                            i15 = ((iM45029 ^ i14) * 525) ^ 101125317;
                            i4 = -1618448509;
                        } else {
                            iM45029 = (i14 - C19806.m45029("ܿ᩹")) * 77;
                            i15 = ((iM45029 ^ i13) * 8071) ^ (-17169099);
                            i4 = -107836519;
                        }
                        i17 = iM45029 ^ i4;
                        i8 = i2;
                        break;
                    case 434808551:
                    case 1779944126:
                        i = i6;
                        i2 = i8;
                        sArr = f36351;
                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ܽ") + i13) * 119;
                            i15 = 1726830612 ^ ((iM11306 ^ i14) * 26799);
                            i3 = -1322058832;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ᩴۗ") ^ i13;
                            i15 = (-1634382116) ^ ((iM11306 ^ i14) * 8061);
                            i3 = -1770685802;
                        }
                        i17 = iM11306 ^ i3;
                        i8 = i2;
                        i6 = i;
                        break;
                    case 522073568:
                    case 1714021463:
                        C7105.m18985();
                        int iM450215 = (i13 - C19806.m45029("ܶܳ")) * 35;
                        i = i6;
                        i17 = iM450215 ^ (-859137679);
                        i15 = ((iM450215 ^ i14) * (-5409)) ^ 809172800;
                        i6 = i;
                        break;
                    case 618941809:
                    case 1720219706:
                        i = i6;
                        i2 = i8;
                        s = sArr[c];
                        if (C2477.f9839 <= 0) {
                            iM11306 = (i14 - ThreadFactoryC3888.m11306("ۨ۟")) * (-81);
                            i15 = 784942964 ^ ((iM11306 ^ i13) * 14141);
                            i3 = 489903636;
                        } else {
                            iM11306 = (i13 - ThreadFactoryC3888.m11306("ۚۧ")) * (-67);
                            i15 = (-820653052) ^ ((iM11306 ^ i14) * 19115);
                            i3 = 1138801557;
                        }
                        i17 = iM11306 ^ i3;
                        i8 = i2;
                        i6 = i;
                        break;
                    case 679520107:
                    case 1980917143:
                        C2871.m8646();
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            i = i6;
                            i2 = i8;
                            iM11306 = (i14 - ThreadFactoryC3888.m11306("ۨ۟")) * (-81);
                            i15 = 784942964 ^ ((iM11306 ^ i13) * 14141);
                            i3 = 489903636;
                            i17 = iM11306 ^ i3;
                            i8 = i2;
                            i6 = i;
                        }
                        int iM450216 = (i13 - C19806.m45029("ܶܳ")) * 35;
                        i = i6;
                        i17 = iM450216 ^ (-859137679);
                        i15 = ((iM450216 ^ i14) * (-5409)) ^ 809172800;
                        i6 = i;
                        break;
                    case 918861714:
                    case 1375094566:
                        sArr2 = f36351;
                        if (C0797.f3386) {
                            i10 = 62;
                            int iM450217 = (i13 - C19806.m45029("ܶܳ")) * 35;
                            i = i6;
                            i17 = iM450217 ^ (-859137679);
                            i15 = ((iM450217 ^ i14) * (-5409)) ^ 809172800;
                            i6 = i;
                        } else {
                            int iM450218 = C19806.m45029("᩻᩹") ^ i13;
                            i17 = iM450218 ^ 1036644198;
                            i15 = ((iM450218 ^ i14) * (-26877)) ^ (-1621289763);
                            i10 = 62;
                        }
                        break;
                    case 1118461425:
                    case 1137056500:
                        i = i6;
                        i2 = i8;
                        c = a.h;
                        if (C1461.f5957 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ܽ") + i13) * 119;
                            i15 = 1726830612 ^ ((iM11306 ^ i14) * 26799);
                            i3 = -1322058832;
                        } else {
                            iM11306 = (C19806.m45029("ܺۢ") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i15 = 1472079491 ^ ((iM11306 ^ i13) * (-16907));
                            i3 = 305009874;
                        }
                        i17 = iM11306 ^ i3;
                        i8 = i2;
                        i6 = i;
                        break;
                    case 1276025077:
                    case 2127670719:
                        if (C2124.m6673() > 0) {
                            i = i6;
                            i2 = i8;
                            iM11306 = (ThreadFactoryC3888.m11306("۫ܽ") + i13) * 119;
                            i15 = 1726830612 ^ ((iM11306 ^ i14) * 26799);
                            i3 = -1322058832;
                            i17 = iM11306 ^ i3;
                            i8 = i2;
                            i6 = i;
                        }
                        int iM450219 = (i13 - C19806.m45029("ܶܳ")) * 35;
                        i = i6;
                        i17 = iM450219 ^ (-859137679);
                        i15 = ((iM450219 ^ i14) * (-5409)) ^ 809172800;
                        i6 = i;
                        break;
                    case 1713201855:
                    case 1781683080:
                        int i20 = s + s2;
                        if (i8 - (i20 * i20) >= 0) {
                            int iM450220 = C19806.m45029("᩶ۖ") ^ i13;
                            i2 = i8;
                            i17 = iM450220 ^ (-1556796760);
                            i15 = ((iM450220 ^ i14) * (-13427)) ^ 1068281750;
                        } else {
                            i2 = i8;
                            iM45029 = (i14 - ThreadFactoryC3888.m11306("ۗܺ")) * (-101);
                            i15 = ((iM45029 ^ i13) * (-13775)) ^ (-2145078397);
                            i4 = 198337083;
                            i17 = iM45029 ^ i4;
                        }
                        i8 = i2;
                        break;
                    default:
                        C2642.m8171();
                        if (C1025.f4800 >= 0) {
                        }
                        int iM4502110 = (i13 - C19806.m45029("ܶܳ")) * 35;
                        i = i6;
                        i17 = iM4502110 ^ (-859137679);
                        i15 = ((iM4502110 ^ i14) * (-5409)) ^ 809172800;
                        i6 = i;
                        break;
                }
            }
            iM11307 = ThreadFactoryC3888.m11306("᩵᩸") ^ i14;
            i15 = ((iM11307 ^ i13) * 15685) ^ (-1235927523);
            i16 = -377699745;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openBrowser(String str) {
        int i = -1487683704;
        int i2 = RunnableC0195.f1321;
        int i3 = C2249.f8050;
        int iM11306 = (ThreadFactoryC3888.m11306("ܳۘ") ^ i3) * (-89);
        int i4 = ((iM11306 ^ i2) * (-4559)) ^ (-1077427855);
        int i5 = 1295490431;
        while (true) {
            i = ((((i ^ i2) * (-20851)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2006739945:
                case -582467683:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC6858(this, str, 2));
                    }
                    iM11306 = C19806.m45029("ۢܿ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 27121) ^ 1452960107;
                    i5 = 2092312311;
                    break;
                case -1986673075:
                case 1348641113:
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("ۗܽ") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * (-10303)) ^ 2076112453;
                        i5 = 657443939;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i2) * 33;
                        i4 = ((iM11306 ^ i3) * 4145) ^ 1457485794;
                        i5 = 636897907;
                    }
                    break;
                case -1831535969:
                case 833707930:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ۢܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27121) ^ 1452960107;
                        i5 = 2092312311;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 31109) ^ 1354249199;
                        i5 = 1207970597;
                    }
                    break;
                case -1532132320:
                case -112981898:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("ᩴ۬") ^ i2) * 19;
                        i4 = ((iM11306 ^ i3) * 14677) ^ 1000168883;
                        i5 = -2129342514;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ܶ") + i3) * (-45);
                        i4 = ((iM11306 ^ i2) * (-7285)) ^ 753214559;
                        i5 = 720466135;
                    }
                    break;
                case -1444454529:
                case -515846534:
                    C2477.m7593();
                    RunnableC1564.m5345();
                    break;
                case -547148743:
                case 599264963:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ۗܽ") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * (-10303)) ^ 2076112453;
                        i5 = 657443939;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ۬") ^ i2) * 19;
                        i4 = ((iM11306 ^ i3) * 14677) ^ 1000168883;
                        i5 = -2129342514;
                    }
                    break;
                case 117982301:
                case 927069905:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (C19806.m45029("ۗܽ") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * (-10303)) ^ 2076112453;
                        i5 = 657443939;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * 25079) ^ (-1640244840);
                        i5 = 822188795;
                    }
                    break;
                case 434635178:
                case 1656645602:
                    if (C0797.f3386) {
                        iM11306 = (i3 - C19806.m45029("᩻ܺ")) * 87;
                        i4 = ((iM11306 ^ i2) * 2595) ^ 305736756;
                        i5 = 328335192;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32439)) ^ (-1502470422);
                        i5 = -830833786;
                    }
                    break;
                case 999101789:
                case 1848420558:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ۬") ^ i2) * 19;
                        i4 = ((iM11306 ^ i3) * 14677) ^ 1000168883;
                        i5 = -2129342514;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩷") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * 2085) ^ 1914229189;
                        i5 = -428345064;
                    }
                    break;
                case 1018524355:
                case 1840214273:
                    if (C0216.f1393 != 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺۠")) * (-31);
                        i4 = ((iM11306 ^ i3) * (-14733)) ^ 1781296249;
                        i5 = 1244171102;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܽ᩶")) * (-49);
                        i4 = ((iM11306 ^ i2) * 10275) ^ 886370365;
                        i5 = -731290308;
                    }
                    break;
                case 1143068325:
                case 1641777158:
                    if (C0629.m2907()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۡ") + i3) * (-35);
                        i4 = ((iM11306 ^ i2) * (-27049)) ^ (-1467988309);
                        i5 = -550214775;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ۬") ^ i2) * 19;
                        i4 = ((iM11306 ^ i3) * 14677) ^ 1000168883;
                        i5 = -2129342514;
                    }
                    break;
                case 1266100861:
                case 1859048008:
                    if (C1937.m6279() >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺۠")) * (-31);
                        i4 = ((iM11306 ^ i3) * (-14733)) ^ 1781296249;
                        i5 = 1244171102;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܿܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * 19241) ^ 930941191;
                        i5 = -105317006;
                    }
                    break;
                case 1401247276:
                case 1666698835:
                    if (!C0797.f3386) {
                        iM11306 = (C19806.m45029("ᩴ۬") ^ i2) * 19;
                        i4 = ((iM11306 ^ i3) * 14677) ^ 1000168883;
                        i5 = -2129342514;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩻ܺ")) * 87;
                        i4 = ((iM11306 ^ i2) * 2595) ^ 305736756;
                        i5 = 328335192;
                    }
                    break;
                case 1422282453:
                case 1932968296:
                    C1977.m6356();
                    iM11306 = (C19806.m45029("ᩴ۬") ^ i2) * 19;
                    i4 = ((iM11306 ^ i3) * 14677) ^ 1000168883;
                    i5 = -2129342514;
                    break;
                default:
                    if (C2788.m8472() != 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺۠")) * (-31);
                        i4 = ((iM11306 ^ i3) * (-14733)) ^ 1781296249;
                        i5 = 1244171102;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ۬") ^ i2) * 19;
                        i4 = ((iM11306 ^ i3) * 14677) ^ 1000168883;
                        i5 = -2129342514;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26845(String str, Object... objArr) {
        Resources resourcesM39279 = null;
        Configuration configuration = null;
        Locale locale = null;
        int i = -678766872;
        int i2 = C1977.f7413;
        int i3 = C1937.f7317;
        int iM11306 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
        int i4 = ((iM11306 ^ i2) * 30193) ^ (-384549770);
        int i5 = -1192852737;
        while (true) {
            i = ((((i ^ i2) * 19631) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2107155440:
                case -1790539390:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8971)) ^ 118539400;
                        i5 = 943098069;
                    } else {
                        iM11306 = C19806.m45029("᩷֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19343) ^ (-1504743680);
                        i5 = -87845864;
                    }
                    break;
                case -1906630844:
                case -1438779143:
                    locale = Locale.getDefault();
                    iM11306 = ThreadFactoryC3888.m11306("ۢۢ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-24925)) ^ 954042541;
                    i5 = -198323244;
                    break;
                case -1898945933:
                case -277971618:
                    if (C2788.m8472() != 0) {
                        iM11306 = (C19806.m45029("ܶ֨") ^ i2) * 109;
                        i4 = ((iM11306 ^ i3) * (-9125)) ^ 655897999;
                        i5 = 597999798;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8971)) ^ 118539400;
                        i5 = 943098069;
                    }
                    break;
                case -1880718234:
                case -347865374:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31071)) ^ (-1144479141);
                        i5 = -1117212795;
                    } else {
                        iM11306 = (C19806.m45029("ܶ֨") ^ i2) * 109;
                        i4 = ((iM11306 ^ i3) * (-9125)) ^ 655897999;
                        i5 = 597999798;
                    }
                    break;
                case -1507290608:
                case -1003040986:
                    return String.format(locale, str, objArr);
                case -1463471219:
                case 1973476357:
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("᩷ۜ") + i3) * 3;
                        i4 = ((iM11306 ^ i2) * 7125) ^ 1719181566;
                        i5 = 1289328240;
                    } else {
                        iM11306 = C19806.m45029("ۖ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 2665) ^ 110778793;
                        i5 = 819367440;
                    }
                    break;
                case -1364942675:
                case -745945226:
                    RunnableC1564.m5345();
                    return null;
                case -1282162163:
                case -577075774:
                    configuration = resourcesM39279.getConfiguration();
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("֫۫") ^ i3) * 19;
                        i4 = ((iM11306 ^ i2) * 4707) ^ (-962039354);
                        i5 = 1663337690;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗܶ")) * (-121);
                        i4 = ((iM11306 ^ i3) * 17731) ^ (-816033073);
                        i5 = -2011008533;
                    }
                    break;
                case -1277010808:
                case 1761140717:
                    Locale localeM41450 = C3743.m10953(configuration).m41450(0);
                    if (localeM41450 == null) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-133)) ^ (-1517741044);
                        i5 = 1709461763;
                    } else {
                        locale = localeM41450;
                        iM11306 = ThreadFactoryC3888.m11306("ۢۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24925)) ^ 954042541;
                        i5 = -198323244;
                    }
                    break;
                case -1000516189:
                case 61797099:
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31071)) ^ (-1144479141);
                        i5 = -1117212795;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13145)) ^ 192711048;
                        i5 = 1767776479;
                    }
                    break;
                case -975988090:
                case -806312504:
                    RunnableC3388.m10064();
                    C3743.m10966();
                    iM11306 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-8971)) ^ 118539400;
                    i5 = 943098069;
                    break;
                case -861868557:
                case 1552272261:
                    resourcesM39279 = C16737.m39279();
                    if (C1189.f5284 <= 0) {
                        iM11306 = (C19806.m45029("֫۫") ^ i3) * 19;
                        i4 = ((iM11306 ^ i2) * 4707) ^ (-962039354);
                        i5 = 1663337690;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2985)) ^ 524088572;
                        i5 = 1479495948;
                    }
                    break;
                case -510514835:
                case 1959452831:
                    if (C7105.m18985()) {
                        iM11306 = (C19806.m45029("֫۫") ^ i3) * 19;
                        i4 = ((iM11306 ^ i2) * 4707) ^ (-962039354);
                        i5 = 1663337690;
                    } else {
                        iM11306 = (C19806.m45029("ܽᩳ") ^ i2) * (-85);
                        i4 = ((iM11306 ^ i3) * 19227) ^ (-755404735);
                        i5 = 6939749;
                    }
                    break;
                case -414766696:
                case 1752370822:
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("᩷ۜ") + i3) * 3;
                        i4 = ((iM11306 ^ i2) * 7125) ^ 1719181566;
                        i5 = 1289328240;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16709)) ^ 365667321;
                        i5 = 170745880;
                    }
                    break;
                case 57498004:
                case 1658060277:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("ۜ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28949)) ^ (-1959818223);
                        i5 = 217810801;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8971)) ^ 118539400;
                        i5 = 943098069;
                    }
                    break;
                case 472255725:
                case 869107474:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = (C19806.m45029("᩷ۜ") + i3) * 3;
                        i4 = ((iM11306 ^ i2) * 7125) ^ 1719181566;
                        i5 = 1289328240;
                    } else {
                        iM11306 = (C19806.m45029("ܶ֨") ^ i2) * 109;
                        i4 = ((iM11306 ^ i3) * (-9125)) ^ 655897999;
                        i5 = 597999798;
                    }
                    break;
                case 905896909:
                case 1398423815:
                    if (C0629.m2907()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 29465) ^ 1115979952;
                        i5 = 1776023014;
                    } else {
                        iM11306 = (C19806.m45029("᩷ۜ") + i3) * 3;
                        i4 = ((iM11306 ^ i2) * 7125) ^ 1719181566;
                        i5 = 1289328240;
                    }
                    break;
                default:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("֫۫") ^ i3) * 19;
                        i4 = ((iM11306 ^ i2) * 4707) ^ (-962039354);
                        i5 = 1663337690;
                    } else {
                        iM11306 = C19806.m45029("ۢ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18883) ^ (-679720268);
                        i5 = -1220975593;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String[] getStringArray(String... strArr) {
        int i = 0;
        String string = null;
        int i2 = 2062762563;
        int i3 = C3722.f13525;
        int i4 = C1937.f7317;
        int iM11306 = (ThreadFactoryC3888.m11306("ܶ᩹") ^ i3) * 123;
        int i5 = ((iM11306 ^ i4) * 11319) ^ (-990898439);
        int i6 = -760435277;
        while (true) {
            i2 = ((((i2 ^ i4) * (-1143)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1952802365:
                case -1863507928:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16323)) ^ 1434538417;
                        i6 = -229184378;
                    } else {
                        iM11306 = C19806.m45029("ۢۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-8935)) ^ 922493636;
                        i6 = -2041140327;
                    }
                    break;
                case -1944878760:
                case -725860519:
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16323)) ^ 1434538417;
                        i6 = -229184378;
                    } else {
                        iM11306 = C19806.m45029("ܶ۬") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-20655)) ^ (-1688887163);
                        i6 = 161886493;
                    }
                    break;
                case -1698497159:
                case -1015665891:
                    i++;
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ᩺") + i4) * 31;
                    i5 = ((iM11306 ^ i3) * 2719) ^ (-1931597234);
                    i6 = 1057688124;
                    break;
                case -1260104739:
                case 580631862:
                    if (i < strArr.length) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۛ") ^ i4) * (-77);
                        i5 = ((iM11306 ^ i3) * (-4541)) ^ 233060765;
                        i6 = 71956463;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡܰ")) * 83;
                        i5 = ((iM11306 ^ i4) * 5789) ^ (-114904975);
                        i6 = -245724308;
                    }
                    break;
                case -998329586:
                case 582570179:
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-22385)) ^ (-1816484311);
                        i6 = 1186685444;
                    } else {
                        iM11306 = (C19806.m45029("᩶᩹") ^ i3) * 79;
                        i5 = ((iM11306 ^ i4) * 3563) ^ 595192565;
                        i6 = 22380191;
                    }
                    break;
                case -968034784:
                case 253215582:
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ֨") + i4) * 25;
                        i5 = ((iM11306 ^ i3) * (-16797)) ^ 1510518620;
                        i6 = 1005344333;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۙ") + i4) * (-101);
                        i5 = ((iM11306 ^ i3) * 23397) ^ 417755953;
                        i6 = 1917733874;
                    }
                    break;
                case -833363601:
                case 1844052660:
                    i = 0;
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ᩺") + i4) * 31;
                    i5 = ((iM11306 ^ i3) * 2719) ^ (-1931597234);
                    i6 = 1057688124;
                    break;
                case -784315664:
                case -673246229:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16323)) ^ 1434538417;
                        i6 = -229184378;
                    } else {
                        iM11306 = C19806.m45029("ۗۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26733)) ^ 543487402;
                        i6 = 711536239;
                    }
                    break;
                case -782725860:
                case 1673927363:
                    C3286.m9798();
                    iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i4;
                    i5 = ((iM11306 ^ i3) * 6899) ^ 2103050690;
                    i6 = -1583897226;
                    break;
                case -749072696:
                case 1500188398:
                    strArr[i] = string;
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16323)) ^ 1434538417;
                        i6 = -229184378;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-12021)) ^ 683303028;
                        i6 = -1077967836;
                    }
                    break;
                case -687986467:
                case 1651127360:
                    return strArr;
                case -685242857:
                case 516442282:
                    C1937.m6279();
                    if (!C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 6899) ^ 2103050690;
                        i6 = -1583897226;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ֨") + i4) * 25;
                        i5 = ((iM11306 ^ i3) * (-16797)) ^ 1510518620;
                        i6 = 1005344333;
                    }
                    break;
                case -69252049:
                case 1049661049:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3397)) ^ 1780365865;
                        i6 = -1299059995;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 6899) ^ 2103050690;
                        i6 = -1583897226;
                    }
                    break;
                case 68130522:
                case 1701374865:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16323)) ^ 1434538417;
                        i6 = -229184378;
                    } else {
                        iM11306 = (C19806.m45029("ۗܽ") + i4) * 9;
                        i5 = ((iM11306 ^ i3) * 30081) ^ (-1784299990);
                        i6 = -873710365;
                    }
                    break;
                case 469886732:
                case 663723898:
                    string = getString(strArr[i]);
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3397)) ^ 1780365865;
                        i6 = -1299059995;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰۜ")) * (-81);
                        i5 = ((iM11306 ^ i4) * 29369) ^ 2023267905;
                        i6 = -268242502;
                    }
                    break;
                case 752410801:
                case 1660440613:
                    if (C0671.m3008() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3397)) ^ 1780365865;
                        i6 = -1299059995;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-30739)) ^ 1051071689;
                        i6 = -273474998;
                    }
                    break;
                case 818740252:
                case 1244345779:
                    C2124.m6673();
                    C2249.m6915();
                    return null;
                case 1351503582:
                case 1496138995:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 6899) ^ 2103050690;
                        i6 = -1583897226;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-22385)) ^ (-1816484311);
                        i6 = 1186685444;
                    }
                    break;
                default:
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16323)) ^ 1434538417;
                        i6 = -229184378;
                    } else {
                        iM11306 = C19806.m45029("ۜܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25325)) ^ (-236845327);
                        i6 = 130530554;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final boolean hasClipboardText() {
        boolean zHasPrimaryClip = false;
        int i = 1608308968;
        int i2 = RunnableC3388.f12514;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = C19806.m45029("֫ܿ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 24619) ^ 1893719669;
        int i5 = 1072517784;
        while (true) {
            i = ((((i ^ i3) * (-18779)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1825828222:
                case -1671234926:
                    C2871.m8646();
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("ܿ֡") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * (-31377)) ^ 1021906647;
                        i5 = 1957996202;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ۫") + i3) * 91;
                        i4 = ((iM45029 ^ i2) * 14199) ^ (-893709764);
                        i5 = -833189456;
                    }
                    break;
                case -1578297901:
                case -1515144206:
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("ܿ֡") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * (-31377)) ^ 1021906647;
                        i5 = 1957996202;
                    } else {
                        iM45029 = C19806.m45029("ۛܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22381)) ^ 97115275;
                        i5 = -1218476361;
                    }
                    break;
                case -1438831726:
                case -1297536455:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳܺ") + i3) * (-43);
                        i4 = ((iM45029 ^ i2) * (-30619)) ^ (-855689635);
                        i5 = 775978396;
                    } else {
                        iM45029 = C19806.m45029("ܶۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15069) ^ (-515968155);
                        i5 = 2015613431;
                    }
                    break;
                case -1364119895:
                case 1038075250:
                    C2642.m8171();
                    C2642.m8171();
                    iM45029 = (C19806.m45029("ᩳ۫") + i3) * 91;
                    i4 = ((iM45029 ^ i2) * 14199) ^ (-893709764);
                    i5 = -833189456;
                    break;
                case -1231440609:
                case -223007899:
                    C1025.m3861();
                    C0817.m3399();
                    return false;
                case -1008372514:
                case 945250291:
                    return false;
                case -917969081:
                case 335453384:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (C19806.m45029("ܿ֡") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * (-31377)) ^ 1021906647;
                        i5 = 1957996202;
                    } else {
                        iM45029 = C19806.m45029("ۗᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5397)) ^ (-1318221108);
                        i5 = 188731480;
                    }
                    break;
                case -633349270:
                case 1167317754:
                    if (!RunnableC3388.m10064()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۨ") + i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-12705)) ^ (-1220867756);
                        i5 = 1959107625;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ۫") + i3) * 91;
                        i4 = ((iM45029 ^ i2) * 14199) ^ (-893709764);
                        i5 = -833189456;
                    }
                    break;
                case -626621314:
                case 2007142708:
                    if (!C1377.f5749) {
                        iM45029 = (C19806.m45029("ܿ֡") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * (-31377)) ^ 1021906647;
                        i5 = 1957996202;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۛ᩶")) * (-119);
                        i4 = ((iM45029 ^ i3) * (-17811)) ^ 497430599;
                        i5 = 517121126;
                    }
                    break;
                case -564741847:
                case -433863111:
                    try {
                        zHasPrimaryClip = m26844().hasPrimaryClip();
                        iM45029 = C19806.m45029("ܺۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15503) ^ (-1647275669);
                        i5 = -473811424;
                    } catch (Throwable unused) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩸") ^ i3) * 87;
                        i4 = ((iM45029 ^ i2) * (-32023)) ^ (-1129926214);
                        i5 = 1948009502;
                    }
                    break;
                case -300754358:
                case 1802203562:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("ᩳ۫") + i3) * 91;
                        i4 = ((iM45029 ^ i2) * 14199) ^ (-893709764);
                        i5 = -833189456;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩹") + i2) * (-107);
                        i4 = ((iM45029 ^ i3) * (-18411)) ^ 463213516;
                        i5 = -78689768;
                    }
                    break;
                case -155645982:
                case 1294492773:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۨ") + i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-12705)) ^ (-1220867756);
                        i5 = 1959107625;
                    } else {
                        iM45029 = (C19806.m45029("ۢۙ") + i2) * (-11);
                        i4 = ((iM45029 ^ i3) * 24211) ^ (-1983216257);
                        i5 = 1693488086;
                    }
                    break;
                case 243089394:
                case 1497142175:
                    if (C1066.m4023() <= 0) {
                        iM45029 = (C19806.m45029("ܿ֡") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * (-31377)) ^ 1021906647;
                        i5 = 1957996202;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚᩴ") + i3) * (-45);
                        i4 = ((iM45029 ^ i2) * (-12227)) ^ 756967827;
                        i5 = 927260804;
                    }
                    break;
                case 587678556:
                case 1360836024:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۛ᩶")) * (-119);
                        i4 = ((iM45029 ^ i3) * (-17811)) ^ 497430599;
                        i5 = 517121126;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29765)) ^ 241250099;
                        i5 = -222070719;
                    }
                    break;
                case 694135984:
                case 1156604459:
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۨ") + i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-12705)) ^ (-1220867756);
                        i5 = 1959107625;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ܶ")) * (-31);
                        i4 = ((iM45029 ^ i2) * (-18783)) ^ (-539785208);
                        i5 = -364322051;
                    }
                    break;
                case 1256142432:
                case 2109874545:
                    return zHasPrimaryClip;
                case 1331205161:
                case 1405197592:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12761)) ^ (-299931514);
                        i5 = 1464398271;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ۫") + i3) * 91;
                        i4 = ((iM45029 ^ i2) * 14199) ^ (-893709764);
                        i5 = -833189456;
                    }
                    break;
                default:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (C19806.m45029("ܿ֡") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * (-31377)) ^ 1021906647;
                        i5 = 1957996202;
                    } else {
                        iM45029 = C19806.m45029("ۗ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29941)) ^ 365608236;
                        i5 = -332747973;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01ba A[PHI: r2 r5
      0x01ba: PHI (r2v4 char) = (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:59:0x01b8, B:51:0x0163, B:23:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:59:0x01b8, B:51:0x0163, B:23:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01eb A[PHI: r1 r7
      0x01eb: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:63:0x01e9, B:43:0x0122, B:10:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:63:0x01e9, B:43:0x0122, B:10:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x021a A[PHI: r6
      0x021a: PHI (r6v5 int) = (r6v2 int), (r6v4 int), (r6v2 int) binds: [B:67:0x0218, B:47:0x0144, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (l.C1977.f7413 <= 0) goto L9;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10659.getString(java.lang.String):java.lang.String");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(String str, Throwable th) {
        int i = -1430210093;
        int i2 = C1398.f5802;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11306 = ThreadFactoryC3888.m11306("ۧۖ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 9295) ^ (-1719355693);
        int i5 = 1655361958;
        while (true) {
            i = ((((i ^ i3) * 7) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2107359381:
                case 1176369727:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("ۚ᩹") ^ i3) * 35;
                        i4 = ((iM11306 ^ i2) * 1815) ^ 1909388150;
                        i5 = -1261819663;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹֨") ^ i3) * 71;
                        i4 = ((iM11306 ^ i2) * 16913) ^ 1566299887;
                        i5 = 1016296981;
                    }
                    break;
                case -1845664156:
                case 1495439209:
                    if (C3660.m10791() != 0) {
                        iM11306 = (C19806.m45029("ۚ᩹") ^ i3) * 35;
                        i4 = ((iM11306 ^ i2) * 1815) ^ 1909388150;
                        i5 = -1261819663;
                    } else {
                        iM11306 = C19806.m45029("ۖܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27633) ^ 486012645;
                        i5 = -749002326;
                    }
                    break;
                case -1681441827:
                case -137738057:
                    C21157.m47601(this.f36352, str, th);
                    break;
                case -1508836962:
                case -419787704:
                    C2642.m8171();
                    RunnableC3388.m10064();
                    iM11306 = (C19806.m45029("ۘܳ") ^ i3) * 87;
                    i4 = ((iM11306 ^ i2) * 28117) ^ (-490014925);
                    i5 = 1724414147;
                    break;
                case -1434893720:
                case 1381948949:
                    if (C1398.f5802 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20477) ^ 1267888616;
                        i5 = -13482232;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7903) ^ 1521057166;
                        i5 = -839949481;
                    }
                    break;
                case -1291873278:
                case 64243902:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ܳۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23713)) ^ 1240612462;
                        i5 = -1463548034;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7903) ^ 1521057166;
                        i5 = -839949481;
                    }
                    break;
                case -1286786311:
                case -784585993:
                    RunnableC1564.m5345();
                    RunnableC3388.m10064();
                    break;
                case -1284187995:
                case 1285554478:
                    if (RunnableC1564.m5345()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22085)) ^ (-12150159);
                        i5 = 192441585;
                    } else {
                        iM11306 = (C19806.m45029("ܰ֡") ^ i3) * 85;
                        i4 = ((iM11306 ^ i2) * (-7577)) ^ (-1576448635);
                        i5 = -1733489649;
                    }
                    break;
                case -1214089271:
                case -683442676:
                    C3660.m10791();
                    if (C1189.f5284 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22085)) ^ (-12150159);
                        i5 = 192441585;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20477) ^ 1267888616;
                        i5 = -13482232;
                    }
                    break;
                case -735590702:
                case 1605297539:
                    C1066.m4023();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7903) ^ 1521057166;
                        i5 = -839949481;
                    } else {
                        iM11306 = (C19806.m45029("ۘܳ") ^ i3) * 87;
                        i4 = ((iM11306 ^ i2) * 28117) ^ (-490014925);
                        i5 = 1724414147;
                    }
                    break;
                case -604026829:
                case 164033734:
                    if (C1398.m4895() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20477) ^ 1267888616;
                        i5 = -13482232;
                    } else {
                        iM11306 = C19806.m45029("ۜܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32743)) ^ (-1235819688);
                        i5 = 1916238147;
                    }
                    break;
                case -313046351:
                case 1837859521:
                    if (C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20477) ^ 1267888616;
                        i5 = -13482232;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10417)) ^ 500804457;
                        i5 = -2043393592;
                    }
                    break;
                case 751972172:
                case 1237268628:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22085)) ^ (-12150159);
                        i5 = 192441585;
                    } else {
                        iM11306 = C19806.m45029("ᩴۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 25953) ^ (-1074350045);
                        i5 = -1738352710;
                    }
                    break;
                case 943518445:
                case 1937825453:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20477) ^ 1267888616;
                        i5 = -13482232;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18679) ^ 458657596;
                        i5 = 1829271888;
                    }
                    break;
                case 1745805314:
                case 1918496512:
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22085)) ^ (-12150159);
                        i5 = 192441585;
                    } else {
                        iM11306 = C19806.m45029("ۖ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18507) ^ 2029543371;
                        i5 = 1486172891;
                    }
                    break;
                default:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("ۚ᩹") ^ i3) * 35;
                        i4 = ((iM11306 ^ i2) * 1815) ^ 1909388150;
                        i5 = -1261819663;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿᩳ") + i3) * (-17);
                        i4 = ((iM11306 ^ i2) * 14447) ^ 1542091188;
                        i5 = 1293920827;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openBuiltinBrowser(final String str, final boolean z) {
        int i = -1198599287;
        int i2 = C2788.f10625;
        int i3 = C10634.f36300;
        int iM11306 = (ThreadFactoryC3888.m11306("᩹۬") ^ i2) * 43;
        int i4 = ((iM11306 ^ i3) * (-30843)) ^ (-81811999);
        int i5 = 1632403068;
        while (true) {
            i = ((((i ^ i3) * (-29293)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2145657817:
                case 53170597:
                    if (C2642.f10294 > 0) {
                        iM11306 = (C19806.m45029("ܶۛ") ^ i3) * 49;
                        i4 = ((iM11306 ^ i2) * 7731) ^ 1280539152;
                        i5 = 1180679226;
                    } else {
                        iM11306 = (C19806.m45029("ۢۨ") + i2) * (-89);
                        i4 = ((iM11306 ^ i3) * (-11671)) ^ 585379345;
                        i5 = 266948936;
                    }
                    break;
                case -2092386128:
                case 274332766:
                    ThreadUtil.runOnUiThread(new Runnable(this) { // from class: l.۫֨ۘ

                        /* JADX INFO: renamed from: ۚܽ᩷, reason: not valid java name and contains not printable characters */
                        private static final short[] f40400 = {3906, 7582, 7577, 7559, 7576, 7555, 7556, 7580, 7615, 7554, 7583, 7559, 7566};

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C10659 f40402;

                        {
                            int i6 = 1050519161;
                            int i7 = ThreadFactoryC3888.f14547;
                            int i8 = RunnableC0195.f1321;
                            int iM11307 = (ThreadFactoryC3888.m11306("ܰ۟") ^ i7) * 77;
                            int i9 = ((iM11307 ^ i8) * (-16861)) ^ 1063922980;
                            int i10 = 1435498892;
                            while (true) {
                                i6 = ((((i6 ^ i8) * 29335) >> 31) & i9) ^ (iM11307 ^ i10);
                                switch (i6) {
                                    case -1835482361:
                                    case -1691875291:
                                        C2788.m8472();
                                        iM11307 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i8;
                                        i9 = ((iM11307 ^ i7) * 13909) ^ 1149052058;
                                        i10 = 976201503;
                                        break;
                                    case -1711718891:
                                    case 446717225:
                                        C3722.m10894();
                                        throw new RuntimeException();
                                    case -1532038396:
                                    case -1150494230:
                                        C2124.m6673();
                                        if (C2477.m7593() < 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۡ۟") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 27665) ^ 1183685627;
                                            i10 = -990145251;
                                        } else {
                                            iM11307 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i8;
                                            i9 = ((iM11307 ^ i7) * 13909) ^ 1149052058;
                                            i10 = 976201503;
                                        }
                                        break;
                                    case -1481347444:
                                    case 378329319:
                                        if (C0216.f1393 != 0) {
                                            iM11307 = C19806.m45029("ۡۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 25395) ^ (-13863760);
                                            i10 = -519745589;
                                        } else {
                                            iM11307 = (ThreadFactoryC3888.m11306("ᩳۙ") ^ i8) * (-111);
                                            i9 = ((iM11307 ^ i7) * (-7059)) ^ (-1924305868);
                                            i10 = -1947553058;
                                        }
                                        break;
                                    case -1368952861:
                                    case -723709197:
                                        this.f40402 = this;
                                        if (C2788.m8472() != 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۡ۟") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 27665) ^ 1183685627;
                                            i10 = -990145251;
                                        } else {
                                            iM11307 = C19806.m45029("֫ۘ") ^ i8;
                                            i9 = ((iM11307 ^ i7) * 985) ^ (-1037813503);
                                            i10 = -1138588312;
                                        }
                                        break;
                                    case -1323402115:
                                    case 536339894:
                                        if (C0278.f1572 <= 0) {
                                            iM11307 = C19806.m45029("ۡۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 25395) ^ (-13863760);
                                            i10 = -519745589;
                                        } else {
                                            iM11307 = (ThreadFactoryC3888.m11306("ۨۛ") ^ i7) * (-89);
                                            i9 = ((iM11307 ^ i8) * (-16799)) ^ (-1482676647);
                                            i10 = 1231374944;
                                        }
                                        break;
                                    case -1265277280:
                                    case 1793883006:
                                        if (CallableC1627.m5507() != 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۘۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 13651) ^ 1810943707;
                                            i10 = -317749010;
                                        } else {
                                            iM11307 = C19806.m45029("ۤ֡") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 24713) ^ (-1032537006);
                                            i10 = 587664857;
                                        }
                                        break;
                                    case -1106014655:
                                    case 515584298:
                                        if (RunnableC1895.f7152) {
                                            iM11307 = (ThreadFactoryC3888.m11306("᩻᩻") + i8) * 7;
                                            i9 = ((iM11307 ^ i7) * (-24643)) ^ 367459572;
                                            i10 = 1609000201;
                                        } else {
                                            iM11307 = C19806.m45029("ۡۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 25395) ^ (-13863760);
                                            i10 = -519745589;
                                        }
                                        break;
                                    case -1103071014:
                                    case 166058116:
                                        if (C1460.f5948 >= 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۘۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 13651) ^ 1810943707;
                                            i10 = -317749010;
                                        } else {
                                            iM11307 = C19806.m45029("֡۬") ^ i8;
                                            i9 = ((iM11307 ^ i7) * 10289) ^ 1108154786;
                                            i10 = -919005114;
                                        }
                                        break;
                                    case -1094107381:
                                    case -105777094:
                                        if (C2704.f10408) {
                                            iM11307 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i8;
                                            i9 = ((iM11307 ^ i7) * 28873) ^ 1656625362;
                                            i10 = 496325874;
                                        } else {
                                            iM11307 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i8;
                                            i9 = ((iM11307 ^ i7) * 13909) ^ 1149052058;
                                            i10 = 976201503;
                                        }
                                        break;
                                    case -732490710:
                                    case 1368702254:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM11307 = C19806.m45029("ۡۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 25395) ^ (-13863760);
                                            i10 = -519745589;
                                        } else {
                                            iM11307 = (C19806.m45029("ܿ֨") + i7) * (-111);
                                            i9 = ((iM11307 ^ i8) * (-16015)) ^ 630589407;
                                            i10 = 884634006;
                                        }
                                        break;
                                    case 282266263:
                                    case 1814777571:
                                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۘۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 13651) ^ 1810943707;
                                            i10 = -317749010;
                                        } else {
                                            iM11307 = ThreadFactoryC3888.m11306("ۡ۟") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 27665) ^ 1183685627;
                                            i10 = -990145251;
                                        }
                                        break;
                                    case 622289644:
                                    case 819781637:
                                        if (C0962.f3784) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۘۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 13651) ^ 1810943707;
                                            i10 = -317749010;
                                        } else {
                                            iM11307 = (C19806.m45029("֡֫") + i7) * 83;
                                            i9 = ((iM11307 ^ i8) * (-14745)) ^ (-400540821);
                                            i10 = -690537280;
                                        }
                                        break;
                                    case 882765762:
                                    case 2116409787:
                                        return;
                                    case 1181144840:
                                    case 1969511648:
                                        if (CallableC1627.f6528) {
                                            iM11307 = ThreadFactoryC3888.m11306("۟᩷") ^ i7;
                                            i9 = ((iM11307 ^ i8) * (-17101)) ^ (-1816603850);
                                            i10 = -237564944;
                                        } else {
                                            iM11307 = ThreadFactoryC3888.m11306("ۘۘ") ^ i7;
                                            i9 = ((iM11307 ^ i8) * 13651) ^ 1810943707;
                                            i10 = -317749010;
                                        }
                                        break;
                                    default:
                                        C1460.m5050();
                                        if (C0216.f1393 != 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i8;
                                            i9 = ((iM11307 ^ i7) * 13909) ^ 1149052058;
                                            i10 = 976201503;
                                        } else {
                                            iM11307 = (i8 - ThreadFactoryC3888.m11306("ܺ֨")) * (-93);
                                            i9 = ((iM11307 ^ i7) * (-10327)) ^ 677074487;
                                            i10 = 395303660;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
                        /* JADX WARN: Code duplicated, block: B:80:0x02be A[PHI: r8 r9 r17 r18
                          0x02be: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:79:0x02bc, B:67:0x0243, B:27:0x00a7] A[DONT_GENERATE, DONT_INLINE]
                          0x02be: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:79:0x02bc, B:67:0x0243, B:27:0x00a7] A[DONT_GENERATE, DONT_INLINE]
                          0x02be: PHI (r17v24 java.lang.Throwable) = (r17v10 java.lang.Throwable), (r17v13 java.lang.Throwable), (r17v25 java.lang.Throwable) binds: [B:79:0x02bc, B:67:0x0243, B:27:0x00a7] A[DONT_GENERATE, DONT_INLINE]
                          0x02be: PHI (r18v19 int) = (r18v4 int), (r18v7 int), (r18v20 int) binds: [B:79:0x02bc, B:67:0x0243, B:27:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:88:0x0310 A[PHI: r17 r18
                          0x0310: PHI (r17v30 java.lang.Throwable) = (r17v8 java.lang.Throwable), (r17v9 java.lang.Throwable), (r17v31 java.lang.Throwable) binds: [B:87:0x030e, B:83:0x02ee, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
                          0x0310: PHI (r18v23 int) = (r18v2 int), (r18v3 int), (r18v24 int) binds: [B:87:0x030e, B:83:0x02ee, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:92:0x0342 A[PHI: r6 r7 r10 r17 r18
                          0x0342: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short) binds: [B:91:0x0340, B:71:0x0268, B:63:0x021d] A[DONT_GENERATE, DONT_INLINE]
                          0x0342: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:91:0x0340, B:71:0x0268, B:63:0x021d] A[DONT_GENERATE, DONT_INLINE]
                          0x0342: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:91:0x0340, B:71:0x0268, B:63:0x021d] A[DONT_GENERATE, DONT_INLINE]
                          0x0342: PHI (r17v14 java.lang.Throwable) = (r17v7 java.lang.Throwable), (r17v12 java.lang.Throwable), (r17v15 java.lang.Throwable) binds: [B:91:0x0340, B:71:0x0268, B:63:0x021d] A[DONT_GENERATE, DONT_INLINE]
                          0x0342: PHI (r18v8 int) = (r18v1 int), (r18v6 int), (r18v9 int) binds: [B:91:0x0340, B:71:0x0268, B:63:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int iM11307;
                            int i6;
                            int i7;
                            int iM11308;
                            int i8;
                            int i9;
                            boolean z2 = false;
                            Throwable th = null;
                            short[] sArr = null;
                            char c = 0;
                            short s = 0;
                            short s2 = 0;
                            int i10 = 0;
                            int i11 = 0;
                            int i12 = 0;
                            int i13 = 0;
                            int i14 = 763193932;
                            int i15 = C1148.f5161;
                            int i16 = MenuItemOnMenuItemClickListenerC3244.f12064;
                            int iM11309 = ThreadFactoryC3888.m11306("ۘ۟") ^ i15;
                            int i17 = ((iM11309 ^ i16) * 5963) ^ 240315230;
                            int i18 = iM11309 ^ (-1631609651);
                            String str2 = null;
                            while (true) {
                                i14 = i18 ^ (i17 & (((i14 ^ i16) * (-3865)) >> 31));
                                switch (i14) {
                                    case -2125570642:
                                    case 430142051:
                                        th = th;
                                        i14 = i14;
                                        if (C1377.m4833() != 0) {
                                            iM11308 = (C19806.m45029("᩻۠") ^ i15) * (-39);
                                            i8 = ((iM11308 ^ i16) * 15095) ^ (-1638213493);
                                            i9 = -88756595;
                                        } else {
                                            iM11308 = C19806.m45029("ᩳ᩸") ^ i16;
                                            i8 = ((iM11308 ^ i15) * (-22965)) ^ 890965637;
                                            i9 = 1194934467;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -2037240952:
                                    case 2138549137:
                                        C1419.m4973();
                                        if (C2871.f10837 >= 0) {
                                            iM11307 = C19806.m45029("۟۫") ^ i16;
                                            i6 = ((iM11307 ^ i15) * (-17679)) ^ (-1334299110);
                                            i7 = 864006172;
                                            int i19 = i6;
                                            i18 = iM11307 ^ i7;
                                            i17 = i19;
                                        } else {
                                            th = th;
                                            i14 = i14;
                                            iM11308 = (C19806.m45029("᩻۠") ^ i15) * (-39);
                                            i8 = ((iM11308 ^ i16) * 15095) ^ (-1638213493);
                                            i9 = -88756595;
                                            i18 = iM11308 ^ i9;
                                            i17 = i8;
                                            th = th;
                                            i14 = i14;
                                        }
                                        break;
                                    case -1837269433:
                                    case 885253025:
                                        C0050.m946();
                                        if (C2788.f10625 < 0) {
                                            th = th;
                                            i14 = i14;
                                            iM11308 = (C19806.m45029("᩻۠") ^ i15) * (-39);
                                            i8 = ((iM11308 ^ i16) * 15095) ^ (-1638213493);
                                            i9 = -88756595;
                                            i18 = iM11308 ^ i9;
                                            i17 = i8;
                                            th = th;
                                            i14 = i14;
                                        } else {
                                            iM11307 = C19806.m45029("ۡۨ") ^ i16;
                                            i6 = ((iM11307 ^ i15) * (-16793)) ^ 817051465;
                                            i7 = -1209005365;
                                            int i110 = i6;
                                            i18 = iM11307 ^ i7;
                                            i17 = i110;
                                        }
                                        break;
                                    case -1814718166:
                                    case 1092098255:
                                        th = th;
                                        i14 = i14;
                                        s = sArr[c];
                                        s2 = 39494;
                                        if (C1377.f5749) {
                                            iM11308 = ThreadFactoryC3888.m11306("۠ܿ") ^ i16;
                                            i8 = ((iM11308 ^ i15) * (-30203)) ^ (-1914460607);
                                            i9 = 1998550168;
                                        } else {
                                            iM11308 = (C19806.m45029("ܿܽ") ^ i16) * 47;
                                            i8 = ((iM11308 ^ i15) * (-27889)) ^ (-2007887955);
                                            i9 = 552950590;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -1665322044:
                                    case 1168167669:
                                        C0278.m1789();
                                        if (!C2332.f8260) {
                                            th = th;
                                            i14 = i14;
                                            iM11308 = ThreadFactoryC3888.m11306("۬֫") ^ i16;
                                            i8 = ((iM11308 ^ i15) * (-3543)) ^ (-951793231);
                                            i9 = -1109615413;
                                            i18 = iM11308 ^ i9;
                                            i17 = i8;
                                            th = th;
                                            i14 = i14;
                                        } else {
                                            iM11307 = C19806.m45029("۟۫") ^ i16;
                                            i6 = ((iM11307 ^ i15) * (-17679)) ^ (-1334299110);
                                            i7 = 864006172;
                                            int i111 = i6;
                                            i18 = iM11307 ^ i7;
                                            i17 = i111;
                                        }
                                        break;
                                    case -1623057854:
                                    case 1613209055:
                                        th = th;
                                        i14 = i14;
                                        String str3 = str;
                                        z2 = z;
                                        int iM113010 = (ThreadFactoryC3888.m11306("ܽۧ") + i16) * 57;
                                        i18 = 267171626 ^ iM113010;
                                        str2 = str3;
                                        i17 = ((iM113010 ^ i15) * 16293) ^ (-2131636043);
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -1567059570:
                                    case -280293800:
                                        i13 = 7659;
                                        iM11308 = (ThreadFactoryC3888.m11306("ۘ᩺") + i15) * (-89);
                                        i8 = ((iM11308 ^ i16) * (-8047)) ^ (-748485643);
                                        i9 = 85163549;
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -1527776159:
                                    case 646889250:
                                        th = th;
                                        i14 = i14;
                                        if (C2249.f8050 >= 0) {
                                            iM11308 = (C19806.m45029("ܿܽ") ^ i16) * 47;
                                            i8 = ((iM11308 ^ i15) * (-27889)) ^ (-2007887955);
                                            i9 = 552950590;
                                        } else {
                                            iM11308 = (i15 - ThreadFactoryC3888.m11306("۠᩸")) * 127;
                                            i8 = ((iM11308 ^ i16) * 7087) ^ 1679251574;
                                            i9 = 1550493470;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -1437377533:
                                    case 736375257:
                                        break;
                                    case -1350575495:
                                    case 1465784500:
                                        if (C2642.f10294 <= 0) {
                                            iM11307 = (ThreadFactoryC3888.m11306("۠ܺ") + i15) * 91;
                                            i6 = ((iM11307 ^ i16) * (-9263)) ^ (-1193168547);
                                            i7 = -106068257;
                                            int i112 = i6;
                                            i18 = iM11307 ^ i7;
                                            i17 = i112;
                                        } else {
                                            th = th;
                                            i14 = i14;
                                            iM11308 = ThreadFactoryC3888.m11306("۬֫") ^ i16;
                                            i8 = ((iM11308 ^ i15) * (-3543)) ^ (-951793231);
                                            i9 = -1109615413;
                                            i18 = iM11308 ^ i9;
                                            i17 = i8;
                                            th = th;
                                            i14 = i14;
                                        }
                                        break;
                                    case -1331434318:
                                    case -955685387:
                                        th = th;
                                        i14 = i14;
                                        i12 = 389944009;
                                        if (C1066.f4915 <= 0) {
                                            iM11308 = (C19806.m45029("ܿܽ") ^ i16) * 47;
                                            i8 = ((iM11308 ^ i15) * (-27889)) ^ (-2007887955);
                                            i9 = 552950590;
                                        } else {
                                            iM11308 = (C19806.m45029("֨ۧ") + i16) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i8 = ((iM11308 ^ i15) * (-655)) ^ 323819719;
                                            i9 = -1046823877;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -1075335001:
                                    case 1989533279:
                                        C0526.m2437();
                                        if (C1148.f5161 > 0) {
                                            iM11307 = C19806.m45029("ۡۨ") ^ i16;
                                            i6 = ((iM11307 ^ i15) * (-16793)) ^ 817051465;
                                            i7 = -1209005365;
                                        } else {
                                            iM11307 = C19806.m45029("ۜܶ") ^ i15;
                                            i6 = ((iM11307 ^ i16) * 26805) ^ 230830399;
                                            i7 = -408173937;
                                        }
                                        int i113 = i6;
                                        i18 = iM11307 ^ i7;
                                        i17 = i113;
                                        break;
                                    case -876667939:
                                    case -96185237:
                                        th = th;
                                        i14 = i14;
                                        if ((i11 + i12) - i10 < 0) {
                                            iM11308 = C19806.m45029("ܶܿ") ^ i16;
                                            i8 = ((iM11308 ^ i15) * 27829) ^ 1183845188;
                                            i9 = -390190655;
                                        } else {
                                            iM11308 = C19806.m45029("ۙ۠") ^ i15;
                                            i8 = ((iM11308 ^ i16) * 5263) ^ 157627567;
                                            i9 = -584378546;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -740481738:
                                    case 103266919:
                                        C15829.m37619(C2124.m6674(th));
                                        break;
                                    case -702694032:
                                    case 617013626:
                                        th = th;
                                        i14 = i14;
                                        i10 = s * s2;
                                        i11 = s * s;
                                        if (C1937.m6279() >= 0) {
                                            iM11308 = (C19806.m45029("᩻۠") ^ i15) * (-39);
                                            i8 = ((iM11308 ^ i16) * 15095) ^ (-1638213493);
                                            i9 = -88756595;
                                        } else {
                                            iM11308 = (C19806.m45029("ۤ᩵") + i15) * 49;
                                            i8 = ((iM11308 ^ i16) * 26537) ^ (-32654368);
                                            i9 = -1054801718;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -699997677:
                                    case 1642490800:
                                        try {
                                            Application applicationM4826 = C1377.m4826();
                                            th = th;
                                            int i20 = ActivityC14082.f46244;
                                            Intent intent = new Intent(applicationM4826, (Class<?>) ActivityC14082.class);
                                            i14 = i14;
                                            try {
                                                C1668.m5574(intent, C3722.m10901(f40400, 1, 3, i13), C10659.m26848(str2));
                                                intent.putExtra(C3660.m10790(f40400, 4, 9, i13), z2);
                                                C1977.m6359(intent, 268435456);
                                                C2477.m7599(C0050.m939(), intent);
                                                iM11308 = ThreadFactoryC3888.m11306("᩷ܽ") ^ i15;
                                                i8 = ((iM11308 ^ i16) * 7893) ^ (-1247403404);
                                                i9 = 1414813592;
                                                i18 = iM11308 ^ i9;
                                                i17 = i8;
                                                th = th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                th = th;
                                                int iM45029 = (i15 - C19806.m45029("ۢܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                i18 = 437796536 ^ iM45029;
                                                i17 = ((iM45029 ^ i16) * (-28919)) ^ 869480679;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            i14 = i14;
                                        }
                                        i14 = i14;
                                        break;
                                    case -585364978:
                                    case -519300563:
                                        th = th;
                                        i14 = i14;
                                        sArr = f40400;
                                        if (RunnableC1895.m6170() != 0) {
                                            iM11308 = ThreadFactoryC3888.m11306("۬֫") ^ i16;
                                            i8 = ((iM11308 ^ i15) * (-3543)) ^ (-951793231);
                                            i9 = -1109615413;
                                        } else {
                                            iM11308 = (ThreadFactoryC3888.m11306("᩺֡") + i16) * (-11);
                                            i8 = ((iM11308 ^ i15) * 20389) ^ 1823306102;
                                            i9 = -1339395369;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -432530671:
                                    case 1960458771:
                                        th = th;
                                        i14 = i14;
                                        c = 0;
                                        if (C1937.f7317 >= 0) {
                                            iM11308 = (i16 - C19806.m45029("ܿۧ")) * (-53);
                                            i8 = ((iM11308 ^ i15) * (-24279)) ^ 700428523;
                                            i9 = 743660493;
                                        } else {
                                            iM11308 = ThreadFactoryC3888.m11306("ܺۨ") ^ i15;
                                            i8 = ((iM11308 ^ i16) * 26555) ^ (-69953745);
                                            i9 = 1051435974;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case -143787533:
                                    case 385008475:
                                        ThreadFactoryC3888.m11300();
                                        break;
                                    case 99491375:
                                    case 2042320835:
                                        th = th;
                                        i14 = i14;
                                        if (C0216.f1393 != 0) {
                                            iM11308 = ThreadFactoryC3888.m11306("۠᩶") ^ i15;
                                            i8 = ((iM11308 ^ i16) * (-32081)) ^ (-526929142);
                                            i9 = 383808656;
                                        } else {
                                            iM11308 = (i15 - C19806.m45029("ۜ۬")) * 37;
                                            i8 = ((iM11308 ^ i16) * (-18603)) ^ 1925794368;
                                            i9 = 1756990794;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case 477453273:
                                    case 1723701101:
                                        th = th;
                                        i14 = i14;
                                        if (C0629.f2722 <= 0) {
                                            iM11308 = ThreadFactoryC3888.m11306("۠᩶") ^ i15;
                                            i8 = ((iM11308 ^ i16) * (-32081)) ^ (-526929142);
                                            i9 = 383808656;
                                        } else {
                                            iM11308 = (i16 - C19806.m45029("ۢܳ")) * (-31);
                                            i8 = ((iM11308 ^ i15) * (-12529)) ^ 1223995970;
                                            i9 = 26495432;
                                        }
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    case 484332867:
                                    case 801648437:
                                        if (RunnableC1564.m5345()) {
                                            iM11307 = C19806.m45029("ۡۨ") ^ i16;
                                            i6 = ((iM11307 ^ i15) * (-16793)) ^ 817051465;
                                            i7 = -1209005365;
                                        } else {
                                            iM11307 = (C19806.m45029("۫ۘ") + i15) * (-27);
                                            i6 = ((iM11307 ^ i16) * (-9809)) ^ (-1575400437);
                                            i7 = -1251703553;
                                        }
                                        int i114 = i6;
                                        i18 = iM11307 ^ i7;
                                        i17 = i114;
                                        break;
                                    case 848905595:
                                    case 1057898669:
                                        C0671.m3008();
                                        if (C2788.f10625 < 0) {
                                            th = th;
                                            i14 = i14;
                                            iM11308 = ThreadFactoryC3888.m11306("۠᩶") ^ i15;
                                            i8 = ((iM11308 ^ i16) * (-32081)) ^ (-526929142);
                                            i9 = 383808656;
                                            i18 = iM11308 ^ i9;
                                            i17 = i8;
                                            th = th;
                                            i14 = i14;
                                        } else {
                                            iM11307 = C19806.m45029("۟۫") ^ i16;
                                            i6 = ((iM11307 ^ i15) * (-17679)) ^ (-1334299110);
                                            i7 = 864006172;
                                            int i115 = i6;
                                            i18 = iM11307 ^ i7;
                                            i17 = i115;
                                        }
                                        break;
                                    case 1125796273:
                                    case 1767098081:
                                        if (C2642.m8171() == 0) {
                                            th = th;
                                            i14 = i14;
                                            iM11308 = (i16 - C19806.m45029("ܿۧ")) * (-53);
                                            i8 = ((iM11308 ^ i15) * (-24279)) ^ 700428523;
                                            i9 = 743660493;
                                            i18 = iM11308 ^ i9;
                                            i17 = i8;
                                            th = th;
                                            i14 = i14;
                                        } else {
                                            iM11307 = C19806.m45029("ۜܶ") ^ i15;
                                            i6 = ((iM11307 ^ i16) * 26805) ^ 230830399;
                                            i7 = -408173937;
                                            int i116 = i6;
                                            i18 = iM11307 ^ i7;
                                            i17 = i116;
                                        }
                                        break;
                                    case 1205022055:
                                    case 1396524072:
                                        this.f40402.log(th);
                                        if (C1189.m4368() <= 0) {
                                            iM11307 = C19806.m45029("ۡۨ") ^ i16;
                                            i6 = ((iM11307 ^ i15) * (-16793)) ^ 817051465;
                                            i7 = -1209005365;
                                        } else {
                                            iM11307 = (i16 - ThreadFactoryC3888.m11306("ᩴ᩷")) * (-105);
                                            i6 = ((iM11307 ^ i15) * (-29493)) ^ 261238312;
                                            i7 = 610102938;
                                        }
                                        int i117 = i6;
                                        i18 = iM11307 ^ i7;
                                        i17 = i117;
                                        break;
                                    case 1237113535:
                                    case 1717841878:
                                        i13 = 31519;
                                        iM11308 = (ThreadFactoryC3888.m11306("ۘ᩺") + i15) * (-89);
                                        i8 = ((iM11308 ^ i16) * (-8047)) ^ (-748485643);
                                        i9 = 85163549;
                                        i18 = iM11308 ^ i9;
                                        i17 = i8;
                                        th = th;
                                        i14 = i14;
                                        break;
                                    default:
                                        C0817.m3399();
                                        C3286.m9798();
                                        iM11307 = C19806.m45029("ۡۨ") ^ i16;
                                        i6 = ((iM11307 ^ i15) * (-16793)) ^ 817051465;
                                        i7 = -1209005365;
                                        int i118 = i6;
                                        i18 = iM11307 ^ i7;
                                        i17 = i118;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -2068984394:
                case -509144656:
                    C2871.m8646();
                    C2871.m8646();
                    iM11306 = C19806.m45029("ۛۖ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 2513) ^ 546198387;
                    i5 = -667642911;
                    break;
                case -1883350805:
                case -1826662938:
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ۚᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12261)) ^ (-1157337249);
                        i5 = 1059049110;
                    } else {
                        iM11306 = (C19806.m45029("֨ۢ") + i2) * 59;
                        i4 = ((iM11306 ^ i3) * (-11777)) ^ 1362531546;
                        i5 = -1078945692;
                    }
                    break;
                case -1874160116:
                case -447058854:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-687)) ^ 1995173720;
                        i5 = 877207589;
                    } else {
                        iM11306 = C19806.m45029("ۛۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2513) ^ 546198387;
                        i5 = -667642911;
                    }
                    break;
                case -1792285515:
                case -590206541:
                    if (C3577.m10565()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܳ") + i3) * 17;
                        i4 = ((iM11306 ^ i2) * (-17797)) ^ (-152495773);
                        i5 = -1337097820;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-687)) ^ 1995173720;
                        i5 = 877207589;
                    }
                    break;
                case -1159101578:
                case 169478332:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("ۚᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12261)) ^ (-1157337249);
                        i5 = 1059049110;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2205)) ^ (-1232855687);
                        i5 = -1352778827;
                    }
                    break;
                case -912834412:
                case -369314964:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ۢۨ") + i2) * (-89);
                        i4 = ((iM11306 ^ i3) * (-11671)) ^ 585379345;
                        i5 = 266948936;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-687)) ^ 1995173720;
                        i5 = 877207589;
                    }
                    break;
                case -321035523:
                case 141879577:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ۢۨ") + i2) * (-89);
                        i4 = ((iM11306 ^ i3) * (-11671)) ^ 585379345;
                        i5 = 266948936;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12803)) ^ (-1428357886);
                        i5 = 154933388;
                    }
                    break;
                case -282406203:
                case 1980281010:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("ܶۛ") ^ i3) * 49;
                        i4 = ((iM11306 ^ i2) * 7731) ^ 1280539152;
                        i5 = 1180679226;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۛ") ^ i2) * (-53);
                        i4 = ((iM11306 ^ i3) * 30957) ^ 240177411;
                        i5 = 257525456;
                    }
                    break;
                case -242579756:
                case 1631703339:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("ۢۨ") + i2) * (-89);
                        i4 = ((iM11306 ^ i3) * (-11671)) ^ 585379345;
                        i5 = 266948936;
                    } else {
                        iM11306 = (C19806.m45029("۟᩷") + i3) * (-47);
                        i4 = ((iM11306 ^ i2) * (-19681)) ^ (-28574269);
                        i5 = -225771296;
                    }
                    break;
                case -135230798:
                case 1928104035:
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ۛۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2513) ^ 546198387;
                        i5 = -667642911;
                    } else {
                        iM11306 = C19806.m45029("ۨۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10645) ^ (-1675796054);
                        i5 = -1391978680;
                    }
                    break;
                case 264199041:
                case 522815722:
                    if (C1377.m4833() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-687)) ^ 1995173720;
                        i5 = 877207589;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۛۘ")) * 115;
                        i4 = ((iM11306 ^ i3) * 14365) ^ (-907789663);
                        i5 = -301958679;
                    }
                    break;
                case 526561715:
                case 1937004651:
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-687)) ^ 1995173720;
                        i5 = 877207589;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨۨ")) * 97;
                        i4 = ((iM11306 ^ i2) * 10055) ^ (-228961233);
                        i5 = 1761283730;
                    }
                    break;
                case 838217149:
                case 2028347754:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۚᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12261)) ^ (-1157337249);
                        i5 = 1059049110;
                    } else {
                        iM11306 = C19806.m45029("᩶᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11367) ^ (-2043010875);
                        i5 = -921763302;
                    }
                    break;
                default:
                    C0797.m3359();
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final List getStringList(String... strArr) {
        getStringArray(strArr);
        return Arrays.asList(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getFileLocalString(File file, String str) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        C0074 c0074;
        int i4;
        int i5 = C1066.f4915;
        int i6 = C3577.f13150;
        int iM11306 = ThreadFactoryC3888.m11306("ۧ᩶") ^ i5;
        int i7 = ((iM11306 ^ i6) * (-25739)) ^ 905293546;
        short[] sArr = null;
        int i8 = iM11306 ^ (-1447700871);
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1325403683;
        C0074 c0075 = null;
        C0074 c0076 = null;
        Reference reference = null;
        C12274 c12274 = null;
        while (true) {
            i12 = i8 ^ (i7 & (((i12 ^ i6) * (-17467)) >> 31));
            switch (i12) {
                case -1880008616:
                case 1045227278:
                    return c0075;
                case -1758920015:
                case -1042244268:
                    i11 = 30664;
                    iM45029 = (C19806.m45029("ۗ᩷") ^ i5) * 99;
                    i = ((iM45029 ^ i6) * (-15815)) ^ (-477764309);
                    i2 = -2035728834;
                    i4 = iM45029 ^ i2;
                    s2 = s2;
                    s = s;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1678501840:
                case 1258998634:
                    s = s;
                    s2 = s2;
                    int i13 = s + s2;
                    i9 = i13 * i13;
                    s3 = 2;
                    if (C1461.f5957 <= 0) {
                        iM450210 = (C19806.m45029("᩹۫") + i6) * (-63);
                        i = ((iM450210 ^ i5) * 19573) ^ (-947369462);
                        i3 = -594601569;
                    } else {
                        iM450210 = (C19806.m45029("ۚۖ") ^ i6) * 11;
                        i = ((iM450210 ^ i5) * 22607) ^ (-615086439);
                        i3 = 990034765;
                    }
                    i4 = iM450210 ^ i3;
                    s2 = s2;
                    s = s;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1673658072:
                case -132025226:
                    s = s;
                    s2 = s2;
                    s3 = s3;
                    c0074 = (C0074) reference.get();
                    c0076 = c0074;
                    iM45029 = (C19806.m45029("ܺ᩹") + i6) * 123;
                    i = ((iM45029 ^ i5) * (-9733)) ^ (-1314043999);
                    i2 = -1614159139;
                    i4 = iM45029 ^ i2;
                    s2 = s2;
                    s = s;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1646842744:
                case -508742444:
                    s = s;
                    s2 = s2;
                    s3 = s3;
                    i10 = s * s3;
                    if (C0050.f912 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۘ") + i5) * (-13);
                        i = ((iM45029 ^ i6) * 27395) ^ (-630816339);
                        i2 = 2110062452;
                        i4 = iM45029 ^ i2;
                        s2 = s2;
                        s = s;
                        s3 = s3;
                        i8 = i4;
                        i7 = i;
                    }
                    s = s;
                    int iM11307 = ThreadFactoryC3888.m11306("۬ۚ") ^ i5;
                    i = ((iM11307 ^ i6) * (-11557)) ^ 2090530957;
                    i4 = iM11307 ^ (-1310868250);
                    s2 = s2;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1618312511:
                case 924359237:
                    StringBuilder sb = new StringBuilder();
                    if (RunnableC1895.f7152) {
                        s2 = s2;
                        C2788.m8480(sb, file.getPath());
                        if (RunnableC1895.f7152) {
                            s = s;
                            s3 = s3;
                            String strM2906 = C0629.m2906(f36351, 52, 1, i11);
                            if (C2788.f10625 < 0) {
                                C2788.m8480(sb, strM2906);
                                C1148.m4223(sb, str);
                                String strM6674 = C2124.m6674(sb);
                                if (C3743.f13569) {
                                    C7130 c7130 = new C7130(file);
                                    if (C1419.f5860 >= 0) {
                                        s3 = s3;
                                        iM450210 = (C19806.m45029("᩹۫") + i6) * (-63);
                                        i = ((iM450210 ^ i5) * 19573) ^ (-947369462);
                                        i3 = -594601569;
                                        i4 = iM450210 ^ i3;
                                        s2 = s2;
                                        s = s;
                                    } else {
                                        C0074 c0077 = new C0074(this, str, strM6674, c7130);
                                        c12274.put(str, new SoftReference(c0077));
                                        c0075 = c0077;
                                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i5;
                                        i = ((iM45029 ^ i6) * 25681) ^ (-1692034835);
                                        i2 = -364011968;
                                        i4 = iM45029 ^ i2;
                                        s2 = s2;
                                        s = s;
                                        s3 = s3;
                                    }
                                }
                            }
                            s = s;
                        } else {
                            int iM450211 = C19806.m45029("ۡۧ") ^ i5;
                            i = ((iM450211 ^ i6) * (-18397)) ^ 927060730;
                            i4 = iM450211 ^ 1351540034;
                            s2 = s2;
                        }
                        i8 = i4;
                        i7 = i;
                    } else {
                        s2 = s2;
                        s3 = s3;
                    }
                    int iM11308 = ThreadFactoryC3888.m11306("۬ۚ") ^ i5;
                    i = ((iM11308 ^ i6) * (-11557)) ^ 2090530957;
                    i4 = iM11308 ^ (-1310868250);
                    s2 = s2;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1082146966:
                case -731821850:
                    C0962.m3746();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        int iM11309 = ThreadFactoryC3888.m11306("۬ۧ") ^ i6;
                        i = ((iM11309 ^ i5) * (-1387)) ^ 1952941586;
                        i8 = iM11309 ^ (-423763765);
                    } else {
                        s = s;
                        s2 = s2;
                        s3 = s3;
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۛ") ^ i5) * 101;
                        i = ((iM45029 ^ i6) * 20993) ^ 1836281747;
                        i2 = -211155486;
                        i4 = iM45029 ^ i2;
                        s2 = s2;
                        s = s;
                        s3 = s3;
                        i8 = i4;
                    }
                    i7 = i;
                    break;
                case -880941630:
                case -18949573:
                    s = s;
                    s2 = s2;
                    s3 = s3;
                    if (c0076 == null) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i6;
                        i = ((iM45029 ^ i5) * 23111) ^ (-1582047872);
                        i2 = 88406899;
                    } else {
                        c0075 = c0076;
                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i5;
                        i = ((iM45029 ^ i6) * 25681) ^ (-1692034835);
                        i2 = -364011968;
                    }
                    i4 = iM45029 ^ i2;
                    s2 = s2;
                    s = s;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -871821448:
                case 358089704:
                    s = s;
                    s2 = s2;
                    s3 = s3;
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۛ") ^ i5) * 101;
                        i = ((iM45029 ^ i6) * 20993) ^ 1836281747;
                        i2 = -211155486;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ۨ֫")) * (-39);
                        i = ((iM45029 ^ i5) * (-10183)) ^ (-859677598);
                        i2 = -1741036987;
                    }
                    i4 = iM45029 ^ i2;
                    s2 = s2;
                    s = s;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -819804690:
                case 459446734:
                    i11 = 49546;
                    iM45029 = (C19806.m45029("ۗ᩷") ^ i5) * 99;
                    i = ((iM45029 ^ i6) * (-15815)) ^ (-477764309);
                    i2 = -2035728834;
                    i4 = iM45029 ^ i2;
                    s2 = s2;
                    s = s;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -806532402:
                case -559386828:
                    s = s;
                    s2 = s2;
                    s3 = s3;
                    c12274 = this.f36356;
                    c0074 = null;
                    reference = (Reference) c12274.getOrDefault(str, null);
                    if (reference != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩶") ^ i5;
                        i = ((iM45029 ^ i6) * (-4989)) ^ (-1128913442);
                        i2 = -108869893;
                    } else {
                        c0076 = c0074;
                        iM45029 = (C19806.m45029("ܺ᩹") + i6) * 123;
                        i = ((iM45029 ^ i5) * (-9733)) ^ (-1314043999);
                        i2 = -1614159139;
                    }
                    i4 = iM45029 ^ i2;
                    s2 = s2;
                    s = s;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -803740023:
                case -265283550:
                    if (RunnableC1895.f7152) {
                        int iM113010 = ThreadFactoryC3888.m11306("۬ۧ") ^ i6;
                        i = ((iM113010 ^ i5) * (-1387)) ^ 1952941586;
                        i8 = iM113010 ^ (-423763765);
                    } else {
                        s = s;
                        s2 = s2;
                        iM450210 = (C19806.m45029("᩹۫") + i6) * (-63);
                        i = ((iM450210 ^ i5) * 19573) ^ (-947369462);
                        i3 = -594601569;
                        i4 = iM450210 ^ i3;
                        s2 = s2;
                        s = s;
                        i8 = i4;
                    }
                    i7 = i;
                    break;
                case -660619350:
                case 158492712:
                    s3 = s3;
                    s = sArr[51];
                    if (C19806.f63586) {
                        s2 = 1;
                        int iM113011 = ThreadFactoryC3888.m11306("۬ۚ") ^ i5;
                        i = ((iM113011 ^ i6) * (-11557)) ^ 2090530957;
                        i4 = iM113011 ^ (-1310868250);
                        s2 = s2;
                        s3 = s3;
                        i8 = i4;
                        i7 = i;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("֡ۧ") ^ i5;
                        i8 = iM113012 ^ 783701858;
                        i7 = ((iM113012 ^ i6) * (-15955)) ^ 1254362405;
                        s3 = s3;
                        s2 = 1;
                    }
                    break;
                case -219839915:
                case 1590915897:
                    s = s;
                    s2 = s2;
                    s3 = s3;
                    sArr = f36351;
                    if (C2124.f7782 > 0) {
                        iM45029 = (C19806.m45029("ܳܶ") ^ i5) * (-25);
                        i = ((iM45029 ^ i6) * (-32419)) ^ (-397321526);
                        i2 = 436055955;
                        i4 = iM45029 ^ i2;
                        s2 = s2;
                        s = s;
                        s3 = s3;
                        i8 = i4;
                        i7 = i;
                    }
                    s = s;
                    int iM113013 = ThreadFactoryC3888.m11306("۬ۚ") ^ i5;
                    i = ((iM113013 ^ i6) * (-11557)) ^ 2090530957;
                    i4 = iM113013 ^ (-1310868250);
                    s2 = s2;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
                case -209745343:
                case 892479498:
                    C1377.m4833();
                    C2788.m8472();
                    return null;
                case 184453967:
                case 2087747555:
                    C19806.m45024();
                    s2 = s2;
                    int iM450212 = C19806.m45029("ۡۧ") ^ i5;
                    i = ((iM450212 ^ i6) * (-18397)) ^ 927060730;
                    i4 = iM450212 ^ 1351540034;
                    s2 = s2;
                    i8 = i4;
                    i7 = i;
                    break;
                case 858285815:
                case 977149242:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        s2 = s2;
                        int iM450213 = C19806.m45029("ۡۧ") ^ i5;
                        i = ((iM450213 ^ i6) * (-18397)) ^ 927060730;
                        i4 = iM450213 ^ 1351540034;
                        s2 = s2;
                        i8 = i4;
                    } else {
                        int iM113014 = ThreadFactoryC3888.m11306("۬ۧ") ^ i6;
                        i = ((iM113014 ^ i5) * (-1387)) ^ 1952941586;
                        i8 = iM113014 ^ (-423763765);
                    }
                    i7 = i;
                    break;
                default:
                    s = s;
                    s2 = s2;
                    s3 = s3;
                    if ((i10 + 1) - i9 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۡ") ^ i6) * (-33);
                        i = ((iM45029 ^ i5) * 19827) ^ 45174827;
                        i2 = -1671981403;
                    } else {
                        iM45029 = (C19806.m45029("᩵ᩴ") + i6) * (-101);
                        i = ((iM45029 ^ i5) * 5345) ^ 1735104712;
                        i2 = -254523064;
                    }
                    i4 = iM45029 ^ i2;
                    s2 = s2;
                    s = s;
                    s3 = s3;
                    i8 = i4;
                    i7 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x029a A[PHI: r10 r11 r12 r13 r18 r19 r20 r21
      0x029a: PHI (r10v3 short) = (r10v2 short), (r10v1 short), (r10v1 short) binds: [B:69:0x0298, B:65:0x0273, B:50:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r11v3 short) = (r11v2 short), (r11v1 short), (r11v1 short) binds: [B:69:0x0298, B:65:0x0273, B:50:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:69:0x0298, B:65:0x0273, B:50:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:69:0x0298, B:65:0x0273, B:50:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r18v15 int) = (r18v8 int), (r18v9 int), (r18v16 int) binds: [B:69:0x0298, B:65:0x0273, B:50:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r19v2 l.ۨ᩹ۘ) = (r19v1 l.ۨ᩹ۘ), (r19v1 l.ۨ᩹ۘ), (r19v4 l.ۨ᩹ۘ) binds: [B:69:0x0298, B:65:0x0273, B:50:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r20v10 short[]) = (r20v3 short[]), (r20v4 short[]), (r20v11 short[]) binds: [B:69:0x0298, B:65:0x0273, B:50:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r21v7 char) = (r21v0 char), (r21v1 char), (r21v8 char) binds: [B:69:0x0298, B:65:0x0273, B:50:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0074 m26849(String str) {
        int i;
        int i2;
        int iM11306;
        int i3;
        C0074 c0074;
        int i4;
        int i5;
        int iM45029;
        C3020 c3020M29798 = null;
        C12274 c12274 = null;
        Reference reference = null;
        C0074 c0075 = null;
        C0074 c0076 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = -350305103;
        int i10 = C2477.f9839;
        int i11 = C1419.f5860;
        int iM11307 = (ThreadFactoryC3888.m11306("ۖܿ") + i11) * (-107);
        int i12 = ((iM11307 ^ i10) * 31719) ^ 1449185870;
        int i13 = iM11307 ^ (-171616809);
        C11986 c11986 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * (-12807)) >> 31));
            switch (i14) {
                case -2037019482:
                case -1809508522:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    c0074 = (C0074) reference.get();
                    c0075 = c0074;
                    iM11306 = C19806.m45029("ᩳᩴ") ^ i11;
                    i = ((iM11306 ^ i10) * (-15723)) ^ 799624081;
                    i3 = -1630323954;
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -1945788815:
                case 1074084360:
                    char c2 = c;
                    i14 = i14;
                    sArr = f36351;
                    if (C1066.f4915 <= 0) {
                        c = c2;
                        iM45029 = (C19806.m45029("ᩴ᩸") ^ i10) * 71;
                        i5 = ((iM45029 ^ i11) * 16675) ^ 720412635;
                        i4 = 897717274;
                        int i15 = i14;
                        i13 = iM45029 ^ i4;
                        i12 = i5;
                        i9 = i15;
                    } else {
                        int iM450210 = (i11 - C19806.m45029("᩹ۜ")) * (-123);
                        i9 = i14;
                        i13 = iM450210 ^ (-165599779);
                        i12 = ((iM450210 ^ i10) * 263) ^ (-731104549);
                        c = c2;
                    }
                    break;
                case -1940158720:
                case -1749712855:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    if (this.f36354 != null) {
                        iM11306 = C19806.m45029("᩻֨") ^ i10;
                        i = ((iM11306 ^ i11) * 13977) ^ 181938104;
                        i3 = -1225123395;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i11) * 95;
                        i = ((iM11306 ^ i10) * (-22189)) ^ 1685457162;
                        i3 = 1040107010;
                    }
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -1761723875:
                case 1265662997:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    if (c0075 == null) {
                        iM11306 = (C19806.m45029("ܳۘ") + i10) * 33;
                        i = ((iM11306 ^ i11) * 17553) ^ 1702118676;
                        i3 = 1394304214;
                    } else {
                        c0076 = c0075;
                        iM11306 = C19806.m45029("ᩴ᩶") ^ i11;
                        i = ((iM11306 ^ i10) * 13555) ^ (-1884449043);
                        i3 = -1920369844;
                    }
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -1491388504:
                case 628420485:
                    i14 = i14;
                    short[] sArr2 = f36351;
                    sArr = sArr;
                    if (RunnableC3388.f12514 < 0 && C3722.f13525 > 0) {
                        c = c;
                        String strM1693 = C0252.m1693(C2477.m7604(sArr2, UMErrorCode.E_UM_BE_CREATE_FAILED, 7, i8), str);
                        if (C10634.f36300 < 0) {
                            C0074 c0077 = new C0074(this, str, strM1693, this.f36367);
                            if (C2477.f9839 > 0) {
                                c12274.put(str, new SoftReference(c0077));
                                c0076 = c0077;
                                iM11306 = C19806.m45029("ᩴ᩶") ^ i11;
                                i = ((iM11306 ^ i10) * 13555) ^ (-1884449043);
                                i3 = -1920369844;
                            }
                            i2 = iM11306 ^ i3;
                            i9 = i14;
                            c = c;
                            i13 = i2;
                            i12 = i;
                            sArr = sArr;
                        }
                    } else {
                        c = c;
                    }
                    iM11306 = C19806.m45029("֫ۖ") ^ i11;
                    i = ((iM11306 ^ i10) * (-30295)) ^ (-2040211915);
                    i3 = 185302162;
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -1462697090:
                case -1417138290:
                    sArr = sArr;
                    i14 = i14;
                    c = 'n';
                    if (!RunnableC1564.f6300) {
                        int iM11308 = (ThreadFactoryC3888.m11306("᩵ۢ") ^ i10) * (-95);
                        i = ((iM11308 ^ i11) * (-28687)) ^ (-492244512);
                        i2 = iM11308 ^ (-1114137060);
                        i9 = i14;
                        i13 = i2;
                        i12 = i;
                        sArr = sArr;
                    } else {
                        sArr = sArr;
                        iM45029 = (C19806.m45029("ᩴ᩸") ^ i10) * 71;
                        i5 = ((iM45029 ^ i11) * 16675) ^ 720412635;
                        i4 = 897717274;
                        int i16 = i14;
                        i13 = iM45029 ^ i4;
                        i12 = i5;
                        i9 = i16;
                    }
                    break;
                case -1346209051:
                case 1064063324:
                    i14 = i14;
                    C0050.m946();
                    if (C2124.f7782 > 0) {
                        iM45029 = (C19806.m45029("ᩴ᩸") ^ i10) * 71;
                        i5 = ((iM45029 ^ i11) * 16675) ^ 720412635;
                        i4 = 897717274;
                        int i17 = i14;
                        i13 = iM45029 ^ i4;
                        i12 = i5;
                        i9 = i17;
                    } else {
                        sArr = sArr;
                        c = c;
                        iM11306 = (C19806.m45029("۬ᩳ") ^ i11) * (-89);
                        i = ((iM11306 ^ i10) * 27425) ^ 438313602;
                        i3 = -2098926087;
                        i2 = iM11306 ^ i3;
                        i9 = i14;
                        c = c;
                        i13 = i2;
                        i12 = i;
                        sArr = sArr;
                    }
                    break;
                case -1188737031:
                case -304595577:
                    i8 = 34406;
                    iM11306 = (ThreadFactoryC3888.m11306("ۛۡ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM11306 ^ i11) * (-18421)) ^ (-856344705);
                    i3 = -1471437128;
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -989827022:
                case -175701174:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    c3020M29798 = C11986.m29798(c11986);
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("۬ᩳ") ^ i11) * (-89);
                        i = ((iM11306 ^ i10) * 27425) ^ 438313602;
                        i3 = -2098926087;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ֡") + i11) * (-19);
                        i = ((iM11306 ^ i10) * (-18395)) ^ (-2053465060);
                        i3 = -91609202;
                    }
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -959961634:
                case 126157719:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    c12274 = this.f36355;
                    c0074 = null;
                    reference = (Reference) c12274.getOrDefault(str, null);
                    if (reference != null) {
                        iM11306 = C19806.m45029("ᩳܰ") ^ i10;
                        i = ((iM11306 ^ i11) * (-9709)) ^ (-2067985445);
                        i3 = -468243803;
                    } else {
                        c0075 = c0074;
                        iM11306 = C19806.m45029("ᩳᩴ") ^ i11;
                        i = ((iM11306 ^ i10) * (-15723)) ^ 799624081;
                        i3 = -1630323954;
                    }
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -836480924:
                case 1901821804:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    if ((i7 * i7) - i6 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܰ") ^ i10;
                        i = ((iM11306 ^ i11) * (-3825)) ^ 2095587677;
                        i3 = -921398738;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۫") ^ i11;
                        i = ((iM11306 ^ i10) * (-13221)) ^ (-426458790);
                        i3 = 851097462;
                    }
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -778804940:
                case -544992638:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    this.f36354 = c3020M29798;
                    this.f36367 = new C17008(this);
                    iM11306 = C19806.m45029("᩻֨") ^ i10;
                    i = ((iM11306 ^ i11) * 13977) ^ 181938104;
                    i3 = -1225123395;
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -716753350:
                case 807466389:
                    C19806.m45024();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        i14 = i14;
                        iM45029 = (C19806.m45029("ᩴ᩸") ^ i10) * 71;
                        i5 = ((iM45029 ^ i11) * 16675) ^ 720412635;
                        i4 = 897717274;
                    } else {
                        iM45029 = (C19806.m45029("᩷ۖ") ^ i10) * 41;
                        i14 = i14;
                        i5 = ((iM45029 ^ i11) * (-12339)) ^ 960559582;
                        i4 = -949504219;
                    }
                    int i18 = i14;
                    i13 = iM45029 ^ i4;
                    i12 = i5;
                    i9 = i18;
                    break;
                case -523462945:
                case 720212246:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    s = sArr[c];
                    s2 = 16596;
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i11) * 87;
                        i = ((iM11306 ^ i10) * 29447) ^ (-1964010245);
                        i3 = -1450686857;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۚ᩺")) * 31;
                        i = ((iM11306 ^ i11) * (-8397)) ^ 341788514;
                        i3 = -708288805;
                    }
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -417757825:
                case 699704888:
                    i8 = 6422;
                    iM11306 = (ThreadFactoryC3888.m11306("ۛۡ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM11306 ^ i11) * (-18421)) ^ (-856344705);
                    i3 = -1471437128;
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case -115782155:
                case 971862386:
                    C0050.m946();
                    C19806.m45024();
                    return null;
                case 143365563:
                case 1479163060:
                    return c0076;
                case 678429052:
                case 1054633331:
                    i14 = i14;
                    if (C1937.f7317 >= 0) {
                        sArr = sArr;
                        c = c;
                        iM11306 = C19806.m45029("֫ۖ") ^ i11;
                        i = ((iM11306 ^ i10) * (-30295)) ^ (-2040211915);
                        i3 = 185302162;
                        i2 = iM11306 ^ i3;
                        i9 = i14;
                        c = c;
                        i13 = i2;
                        i12 = i;
                        sArr = sArr;
                    }
                    sArr = sArr;
                    c = c;
                    iM11306 = (C19806.m45029("۬ᩳ") ^ i11) * (-89);
                    i = ((iM11306 ^ i10) * 27425) ^ 438313602;
                    i3 = -2098926087;
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case 887910300:
                case 2053676239:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    c11986 = (C11986) this.f36357.f47254;
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i11) * 87;
                        i = ((iM11306 ^ i10) * 29447) ^ (-1964010245);
                        i3 = -1450686857;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i10;
                        i = ((iM11306 ^ i11) * (-14907)) ^ (-2029829808);
                        i3 = -1254994624;
                    }
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                case 1075492713:
                case 1403850707:
                    sArr = sArr;
                    c = c;
                    i14 = i14;
                    i6 = s * s2;
                    i7 = s + 4149;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i11) * 87;
                        i = ((iM11306 ^ i10) * 29447) ^ (-1964010245);
                        i3 = -1450686857;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ۫") + i11) * (-105);
                        i = ((iM11306 ^ i10) * (-15203)) ^ (-285463240);
                        i3 = -1361449606;
                    }
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
                default:
                    i14 = i14;
                    C3577.m10565();
                    C2788.m8472();
                    sArr = sArr;
                    c = c;
                    iM11306 = (C19806.m45029("۬ᩳ") ^ i11) * (-89);
                    i = ((iM11306 ^ i10) * 27425) ^ 438313602;
                    i3 = -2098926087;
                    i2 = iM11306 ^ i3;
                    i9 = i14;
                    c = c;
                    i13 = i2;
                    i12 = i;
                    sArr = sArr;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    @Deprecated
    public final LocalString getAssetLocalString(String str) {
        return m26849(str);
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openPreference(Class cls) {
        int i = -484436334;
        int i2 = C1419.f5860;
        int i3 = C1398.f5802;
        int iM45029 = C19806.m45029("۠ۤ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-1129)) ^ (-1678337956);
        int i5 = -339647026;
        while (true) {
            i = ((((i ^ i2) * (-31103)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2130090139:
                case -1205336096:
                    C2332.m7079();
                    C2871.m8646();
                    break;
                case -1972889690:
                case -641932533:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܽ") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 979) ^ (-186813935);
                        i5 = -1150546234;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25871)) ^ 1974431189;
                        i5 = 1045518814;
                    }
                    break;
                case -1544171268:
                case -680522972:
                    if (RunnableC3388.m10064()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۘ") + i2) * (-75);
                        i4 = ((iM45029 ^ i3) * 21199) ^ (-557747599);
                        i5 = 273947911;
                    } else {
                        iM45029 = C19806.m45029("ۡۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5389) ^ (-1052933909);
                        i5 = -836824468;
                    }
                    break;
                case -1535973137:
                case 141906667:
                    C1148.m4232();
                    if (!C1377.f5749) {
                        iM45029 = C19806.m45029("ܺ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9109) ^ 630341104;
                        i5 = -1824664325;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25871)) ^ 1974431189;
                        i5 = 1045518814;
                    }
                    break;
                case -1114152002:
                case -281635536:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ܺ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9109) ^ 630341104;
                        i5 = -1824664325;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-283)) ^ (-893702920);
                        i5 = 996009035;
                    }
                    break;
                case -1085155799:
                case -235270788:
                    if (C1377.f5749) {
                        ThreadUtil.runOnUiThread(new RunnableC23104(1, this, cls));
                    }
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ۙ")) * (-45);
                    i4 = ((iM45029 ^ i2) * (-7503)) ^ (-2009205488);
                    i5 = 1921106886;
                    break;
                case -922395546:
                case -336478598:
                    C0216.m1591();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM45029 = C19806.m45029("ܺ۠") ^ i3;
                    i4 = ((iM45029 ^ i2) * 9109) ^ 630341104;
                    i5 = -1824664325;
                    break;
                case -650589737:
                case 2038988468:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ۙ")) * (-45);
                        i4 = ((iM45029 ^ i2) * (-7503)) ^ (-2009205488);
                        i5 = 1921106886;
                    } else {
                        iM45029 = C19806.m45029("ᩴۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29909)) ^ (-134740217);
                        i5 = 2021937519;
                    }
                    break;
                case -527587315:
                case 35662787:
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("ۡۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5389) ^ (-1052933909);
                        i5 = -836824468;
                    } else {
                        iM45029 = (C19806.m45029("۟ᩳ") ^ i2) * (-49);
                        i4 = ((iM45029 ^ i3) * (-10447)) ^ 395765546;
                        i5 = -1553849989;
                    }
                    break;
                case -285288818:
                case 1216610158:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۡۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5389) ^ (-1052933909);
                        i5 = -836824468;
                    } else {
                        iM45029 = C19806.m45029("ܽۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19775) ^ (-2089750278);
                        i5 = -879199557;
                    }
                    break;
                case 2857866:
                case 465553205:
                    C3535.m10431();
                    if (RunnableC3388.m10064()) {
                        iM45029 = C19806.m45029("ܺ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9109) ^ 630341104;
                        i5 = -1824664325;
                    } else {
                        iM45029 = (C19806.m45029("ۙܺ") + i3) * 27;
                        i4 = ((iM45029 ^ i2) * 12745) ^ (-1803627340);
                        i5 = 790704293;
                    }
                    break;
                case 231595292:
                case 525804029:
                    C1419.m4973();
                    if (C1189.f5284 > 0) {
                        iM45029 = C19806.m45029("ۡۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5389) ^ (-1052933909);
                        i5 = -836824468;
                    } else {
                        iM45029 = C19806.m45029("ܺ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9109) ^ 630341104;
                        i5 = -1824664325;
                    }
                    break;
                case 868894746:
                case 1402101345:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25871)) ^ 1974431189;
                        i5 = 1045518814;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜᩴ")) * 17;
                        i4 = ((iM45029 ^ i2) * 7795) ^ (-216453680);
                        i5 = 1446027923;
                    }
                    break;
                case 1361512896:
                case 1492439965:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ܶۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5563)) ^ 1924607441;
                        i5 = 1985298420;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ۙ")) * (-45);
                        i4 = ((iM45029 ^ i2) * (-7503)) ^ (-2009205488);
                        i5 = 1921106886;
                    }
                    break;
                default:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ۙ")) * (-45);
                        i4 = ((iM45029 ^ i2) * (-7503)) ^ (-2009205488);
                        i5 = 1921106886;
                    } else {
                        iM45029 = C19806.m45029("ۙܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7303)) ^ (-1055078364);
                        i5 = 2050156475;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getLanguageNameLocalString() {
        return C21157.m47603();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x03be A[PHI: r11 r16 r18
      0x03be: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:104:0x03bc, B:67:0x0209, B:17:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x03be: PHI (r16v43 int) = (r16v2 int), (r16v10 int), (r16v48 int) binds: [B:104:0x03bc, B:67:0x0209, B:17:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x03be: PHI (r18v38 short[]) = (r18v0 short[]), (r18v8 short[]), (r18v42 short[]) binds: [B:104:0x03bc, B:67:0x0209, B:17:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x02f8 A[PHI: r9 r10 r16 r18
      0x02f8: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:88:0x02f6, B:71:0x022d, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:88:0x02f6, B:71:0x022d, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r16v29 int) = (r16v6 int), (r16v9 int), (r16v30 int) binds: [B:88:0x02f6, B:71:0x022d, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r18v25 short[]) = (r18v4 short[]), (r18v7 short[]), (r18v26 short[]) binds: [B:88:0x02f6, B:71:0x022d, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x035b A[PHI: r16 r18
      0x035b: PHI (r16v28 int) = (r16v4 int), (r16v22 int), (r16v30 int) binds: [B:96:0x0359, B:33:0x00d3, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r18v24 short[]) = (r18v2 short[]), (r18v21 short[]), (r18v26 short[]) binds: [B:96:0x0359, B:33:0x00d3, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (l.C3286.f12186 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        r18 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if (l.RunnableC1606.f6488 < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (l.C1377.f5749 == false) goto L33;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m26847(l.C10659 r20, java.lang.Class r21) {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10659.m26847(l.ۧ֨ۘ, java.lang.Class):void");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0190 A[PHI: r6 r16
      0x0190: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:49:0x018e, B:23:0x009f, B:16:0x007e, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v2 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String) binds: [B:49:0x018e, B:23:0x009f, B:16:0x007e, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01fe A[PHI: r3 r7 r9 r10
      0x01fe: PHI (r3v3 char) = (r3v1 char), (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:61:0x01fc, B:57:0x01e2, B:45:0x016a, B:31:0x00e0, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r7v3 short) = (r7v1 short), (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:61:0x01fc, B:57:0x01e2, B:45:0x016a, B:31:0x00e0, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r9v3 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v2 short[]), (r9v1 short[]) binds: [B:61:0x01fc, B:57:0x01e2, B:45:0x016a, B:31:0x00e0, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:61:0x01fc, B:57:0x01e2, B:45:0x016a, B:31:0x00e0, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x022b A[PHI: r4 r5 r11
      0x022b: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:65:0x0229, B:53:0x01c4, B:27:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:65:0x0229, B:53:0x01c4, B:27:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:65:0x0229, B:53:0x01c4, B:27:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x025b A[PHI: r2
      0x025b: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:69:0x0259, B:18:0x0082, B:16:0x007e, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ClipboardManager m26844() {
        int iM45029;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1535212378;
        int i9 = C1460.f5948;
        int i10 = C3535.f13026;
        int iM450210 = C19806.m45029("֡ۧ") ^ i10;
        int i11 = ((iM450210 ^ i9) * 15173) ^ (-1750616007);
        int i12 = iM450210 ^ (-1344356789);
        String strM8640 = null;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * (-5557)) >> 31));
            switch (i8) {
                case -2105402311:
                case 814908181:
                    strM8640 = C2871.m8640(sArr2, i6, i7, i5);
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨܶ") + i10) * (-107);
                        i = ((iM45029 ^ i9) * 16409) ^ 1661878657;
                        i2 = 1625485172;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۚ") ^ i9) * 73;
                        i = ((iM45029 ^ i10) * 31935) ^ (-1213974345);
                        i2 = -1418558076;
                    }
                    int i13 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i13;
                    break;
                case -1945587707:
                case -127537941:
                    this.f36361 = (ClipboardManager) C16737.m39287(strM8640);
                    iM45029 = C19806.m45029("ᩴۛ") ^ i9;
                    i = ((iM45029 ^ i10) * (-9313)) ^ (-448641270);
                    i2 = -2118948989;
                    int i14 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i14;
                    break;
                case -1592546631:
                case 1176906832:
                    C2124.m6673();
                    iM45029 = (C19806.m45029("ۘ۫") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM45029 ^ i10) * (-22345)) ^ (-796113448);
                    i2 = 1041058409;
                    int i15 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i15;
                    break;
                case -1576064515:
                case -485290853:
                    i7 = 9;
                    if (C2249.m6915() <= 0) {
                        iM45029 = (C19806.m45029("ܽۢ") + i10) * 91;
                        i = ((iM45029 ^ i9) * (-4967)) ^ (-1492109316);
                        i2 = -1034477132;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܰ") ^ i10) * 37;
                        i = ((iM45029 ^ i9) * (-8393)) ^ (-1412066530);
                        i2 = 1498547153;
                    }
                    int i16 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i16;
                    break;
                case -1281624040:
                case -757219998:
                    C0526.m2437();
                    RunnableC0195.m1431();
                    return null;
                case -1070625904:
                case 256857487:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("ܰۢ") ^ i10;
                        i = ((iM45029 ^ i9) * (-30789)) ^ (-1686730098);
                        i2 = 314700146;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֡") ^ i9;
                        i = ((iM45029 ^ i10) * (-25933)) ^ (-210473260);
                        i2 = -745066667;
                    }
                    int i17 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i17;
                    break;
                case -1050224470:
                case 1705433298:
                    return this.f36361;
                case -1012183895:
                case -649812444:
                    sArr2 = f36351;
                    i6 = 1;
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("ܰۢ") ^ i10;
                        i = ((iM45029 ^ i9) * (-30789)) ^ (-1686730098);
                        i2 = 314700146;
                    } else {
                        iM45029 = C19806.m45029("᩸ᩴ") ^ i9;
                        i = ((iM45029 ^ i10) * 14155) ^ (-1473340031);
                        i2 = 117884881;
                    }
                    int i18 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i18;
                    break;
                case -845528722:
                case -682576584:
                    C1189.m4368();
                    if (C1419.m4973()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۚ") ^ i9) * 73;
                        i = ((iM45029 ^ i10) * 31935) ^ (-1213974345);
                        i2 = -1418558076;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ᩴۖ")) * (-49);
                        i = ((iM45029 ^ i10) * 11623) ^ (-1071096962);
                        i2 = 537381739;
                    }
                    int i19 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i19;
                    break;
                case -706960174:
                case -450515723:
                    s = sArr[c];
                    i3 = s * s;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("ܽۢ") + i10) * 91;
                        i = ((iM45029 ^ i9) * (-4967)) ^ (-1492109316);
                        i2 = -1034477132;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("۫ܽ")) * (-99);
                        i = ((iM45029 ^ i9) * 16601) ^ 1506054659;
                        i2 = -1283745003;
                    }
                    int i110 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i110;
                    break;
                case -517861271:
                case 1325358863:
                    i5 = 36853;
                    iM45029 = (ThreadFactoryC3888.m11306("ۖۡ") + i10) * 99;
                    i = ((iM45029 ^ i9) * (-17817)) ^ (-2062395016);
                    i2 = -449774021;
                    int i111 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i111;
                    break;
                case -513076155:
                case -247782843:
                    if (this.f36361 == null) {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ܺۜ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM45029 ^ i9) * 24865) ^ 553895144;
                        i2 = 1217483607;
                    } else {
                        iM45029 = C19806.m45029("ᩴۛ") ^ i9;
                        i = ((iM45029 ^ i10) * (-9313)) ^ (-448641270);
                        i2 = -2118948989;
                    }
                    int i112 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i112;
                    break;
                case -264358094:
                case 970762176:
                    sArr = f36351;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ۘ۫") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i10) * (-22345)) ^ (-796113448);
                        i2 = 1041058409;
                    } else {
                        iM45029 = (C19806.m45029("ۨ᩹") ^ i10) * 61;
                        i = ((iM45029 ^ i9) * 31637) ^ (-1597956014);
                        i2 = -654265168;
                    }
                    int i113 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i113;
                    break;
                case -240260403:
                case 1001267569:
                    i5 = 8818;
                    iM45029 = (ThreadFactoryC3888.m11306("ۖۡ") + i10) * 99;
                    i = ((iM45029 ^ i9) * (-17817)) ^ (-2062395016);
                    i2 = -449774021;
                    int i114 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i114;
                    break;
                case 26216806:
                case 375768788:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i9;
                        i = ((iM45029 ^ i10) * 5833) ^ 1887892322;
                        i2 = 607772826;
                    } else {
                        iM45029 = (C19806.m45029("ܽۢ") + i10) * 91;
                        i = ((iM45029 ^ i9) * (-4967)) ^ (-1492109316);
                        i2 = -1034477132;
                    }
                    int i115 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i115;
                    break;
                case 221980392:
                case 1294018783:
                    C0797.m3359();
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۚ") ^ i9) * 73;
                        i = ((iM45029 ^ i10) * 31935) ^ (-1213974345);
                        i2 = -1418558076;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۫") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i10) * (-22345)) ^ (-796113448);
                        i2 = 1041058409;
                    }
                    int i116 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i116;
                    break;
                case 931303556:
                case 1590815578:
                    c = 0;
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("ܰۢ") ^ i10;
                        i = ((iM45029 ^ i9) * (-30789)) ^ (-1686730098);
                        i2 = 314700146;
                    } else {
                        iM45029 = C19806.m45029("۟ᩴ") ^ i10;
                        i = ((iM45029 ^ i9) * (-37)) ^ (-442729965);
                        i2 = -1975748680;
                    }
                    int i117 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i117;
                    break;
                case 1535800500:
                case 1685486770:
                    s2 = 5518;
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ܰۢ") ^ i10;
                        i = ((iM45029 ^ i9) * (-30789)) ^ (-1686730098);
                        i2 = 314700146;
                    } else {
                        iM45029 = (C19806.m45029("ۖۢ") ^ i10) * 53;
                        i = ((iM45029 ^ i9) * (-23057)) ^ 294084869;
                        i2 = 1108391754;
                    }
                    int i118 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i118;
                    break;
                case 1608900812:
                case 2107252440:
                    i4 = i3 + 7612081;
                    if (C1668.m5583()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩻") ^ i9) * (-99);
                        i = ((iM45029 ^ i10) * 29737) ^ 1210004007;
                        i2 = -1877451374;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۚ") ^ i9) * 73;
                        i = ((iM45029 ^ i10) * 31935) ^ (-1213974345);
                        i2 = -1418558076;
                    }
                    int i119 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i119;
                    break;
                case 2018076167:
                case 2125234492:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("ۘ۫") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i10) * (-22345)) ^ (-796113448);
                        i2 = 1041058409;
                    } else {
                        iM45029 = C19806.m45029("ܰۢ") ^ i10;
                        i = ((iM45029 ^ i9) * (-30789)) ^ (-1686730098);
                        i2 = 314700146;
                    }
                    int i1110 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i1110;
                    break;
                default:
                    if (i4 - (s * s2) < 0) {
                        iM45029 = C19806.m45029("ᩳ᩹") ^ i9;
                        i = ((iM45029 ^ i10) * 7115) ^ 925736345;
                        i2 = -541332831;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۗ") ^ i9) * (-79);
                        i = ((iM45029 ^ i10) * 18985) ^ (-1605177196);
                        i2 = 2084220628;
                    }
                    int i1111 = i;
                    i12 = iM45029 ^ i2;
                    i11 = i1111;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0357  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189 A[PHI: r12 r14 r15
      0x0189: PHI (r12v3 java.lang.Object) = 
      (r12v2 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
     binds: [B:58:0x016f, B:51:0x0131, B:45:0x0107, B:42:0x00eb, B:39:0x00cd, B:37:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r14v4 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v3 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
     binds: [B:58:0x016f, B:51:0x0131, B:45:0x0107, B:42:0x00eb, B:39:0x00cd, B:37:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r15v3 java.lang.String) = 
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v2 java.lang.String)
      (r15v1 java.lang.String)
     binds: [B:58:0x016f, B:51:0x0131, B:45:0x0107, B:42:0x00eb, B:39:0x00cd, B:37:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0281 A[PHI: r1 r5 r6 r7 r8 r9
      0x0281: PHI (r1v73 java.lang.CharSequence) = (r1v13 java.lang.CharSequence), (r1v15 java.lang.CharSequence), (r1v74 java.lang.CharSequence) binds: [B:82:0x0269, B:77:0x022b, B:70:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r5v4 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:82:0x0269, B:77:0x022b, B:70:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:82:0x0269, B:77:0x022b, B:70:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:82:0x0269, B:77:0x022b, B:70:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:82:0x0269, B:77:0x022b, B:70:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String), (r9v1 java.lang.String) binds: [B:82:0x0269, B:77:0x022b, B:70:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (l.C1419.f5860 >= 0) goto L10;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showToastL(java.lang.CharSequence r23, java.lang.Object... r24) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10659.showToastL(java.lang.CharSequence, java.lang.Object[]):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openLogViewer() {
        int i = -226759916;
        int i2 = C2249.f8050;
        int i3 = C1148.f5161;
        int iM11306 = ThreadFactoryC3888.m11306("᩹֫") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-31001)) ^ (-486646358);
        int i5 = 1720707511;
        while (true) {
            i = ((((i ^ i2) * (-25219)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1983792800:
                case 735533143:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۚ") ^ i2) * 95;
                        i4 = ((iM11306 ^ i3) * 23029) ^ (-835389238);
                        i5 = 787377460;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۠۬")) * 87;
                        i4 = ((iM11306 ^ i2) * 11285) ^ 1766810170;
                        i5 = 437583277;
                    }
                    break;
                case -1800189666:
                case 423595522:
                    if (RunnableC1895.m6170() == 0) {
                        if (C2124.f7782 > 0) {
                            if (C0817.f3443) {
                                if (C1937.m6279() >= 0) {
                                    iM11306 = (ThreadFactoryC3888.m11306("᩸֡") ^ i2) * (-91);
                                    i4 = ((iM11306 ^ i3) * (-17019)) ^ 217744490;
                                    i5 = 343435134;
                                } else {
                                    if (C1461.f5957 > 0) {
                                        if (C1025.f4800 < 0) {
                                            if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0 && C3743.f13569) {
                                                if (C2332.f8260) {
                                                    int i6 = 1;
                                                    if (C1398.m4895() > 0) {
                                                        ThreadUtil.runOnUiThread(new RunnableC23087(this.f36352, i6));
                                                    }
                                                } else {
                                                    iM11306 = (ThreadFactoryC3888.m11306("ۨۚ") ^ i2) * 95;
                                                    i4 = ((iM11306 ^ i3) * 23029) ^ (-835389238);
                                                    i5 = 787377460;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    iM11306 = (ThreadFactoryC3888.m11306("ܳۢ") + i2) * (-121);
                                    i4 = ((iM11306 ^ i3) * (-12067)) ^ (-534143914);
                                    i5 = -811612276;
                                }
                            }
                            break;
                        }
                        iM11306 = (C19806.m45029("֫֫") + i3) * (-63);
                        i4 = ((iM11306 ^ i2) * 6569) ^ (-590003659);
                        i5 = 57638518;
                        break;
                    }
                    iM11306 = (i3 - C19806.m45029("۠۬")) * 87;
                    i4 = ((iM11306 ^ i2) * 11285) ^ 1766810170;
                    i5 = 437583277;
                    break;
                case -716068791:
                case 1243603063:
                    C1066.m4023();
                    iM11306 = (i3 - C19806.m45029("۠۬")) * 87;
                    i4 = ((iM11306 ^ i2) * 11285) ^ 1766810170;
                    i5 = 437583277;
                    break;
                case -549584130:
                case 1499878921:
                    if (C1025.f4800 < 0) {
                        iM11306 = (C19806.m45029("֫֫") + i3) * (-63);
                        i4 = ((iM11306 ^ i2) * 6569) ^ (-590003659);
                        i5 = 57638518;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۠۬")) * 87;
                        i4 = ((iM11306 ^ i2) * 11285) ^ 1766810170;
                        i5 = 437583277;
                    }
                    break;
                case 775370448:
                case 2143214784:
                    C10634.m26820();
                    RunnableC1564.m5345();
                    break;
                default:
                    if (!C0817.f3443) {
                        iM11306 = (i3 - C19806.m45029("۠۬")) * 87;
                        i4 = ((iM11306 ^ i2) * 11285) ^ 1766810170;
                        i5 = 437583277;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸֡") ^ i2) * (-91);
                        i4 = ((iM11306 ^ i3) * (-17019)) ^ 217744490;
                        i5 = 343435134;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(Throwable th) {
        String str = null;
        int i = -85043066;
        int i2 = C1189.f5284;
        int i3 = RunnableC0195.f1321;
        int iM45029 = (C19806.m45029("۟ܽ") + i3) * (-53);
        int i4 = ((iM45029 ^ i2) * 30861) ^ (-2036978856);
        int i5 = 826162337;
        while (true) {
            i = ((((i ^ i2) * 20747) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2002156029:
                case -478783138:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺܰ")) * (-93);
                        i4 = ((iM45029 ^ i3) * (-24157)) ^ (-1108331473);
                        i5 = 792968217;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۜ") + i3) * (-61);
                        i4 = ((iM45029 ^ i2) * 7611) ^ (-1745204096);
                        i5 = -210868076;
                    }
                    break;
                case -1974917762:
                case 579014168:
                    if (C0216.f1393 != 0) {
                        iM45029 = (i3 - C19806.m45029("ۛ᩷")) * 79;
                        i4 = ((iM45029 ^ i2) * 16811) ^ (-1503442217);
                        i5 = -278070266;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩵") + i2) * 57;
                        i4 = ((iM45029 ^ i3) * 32763) ^ (-643772227);
                        i5 = -485865811;
                    }
                    break;
                case -1670543378:
                case -1548392908:
                    C10634.m26820();
                    iM45029 = (C19806.m45029("ܶۨ") ^ i2) * (-51);
                    i4 = ((iM45029 ^ i3) * 11955) ^ (-273422701);
                    i5 = -129515112;
                    break;
                case -1509218240:
                case 632503130:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۛ᩷")) * 79;
                        i4 = ((iM45029 ^ i2) * 16811) ^ (-1503442217);
                        i5 = -278070266;
                    } else {
                        iM45029 = C19806.m45029("᩺֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-8513)) ^ (-1164571513);
                        i5 = -119293101;
                    }
                    break;
                case -1330197028:
                case 1254730054:
                    str = this.f36352;
                    if (C0050.m946() <= 0) {
                        iM45029 = C19806.m45029("۫ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27199)) ^ (-762503670);
                        i5 = 1789049620;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۟") ^ i2) * 91;
                        i4 = ((iM45029 ^ i3) * (-19395)) ^ 196816159;
                        i5 = -2073702896;
                    }
                    break;
                case -1107488655:
                case 970931940:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۛ᩷")) * 79;
                        i4 = ((iM45029 ^ i2) * 16811) ^ (-1503442217);
                        i5 = -278070266;
                    } else {
                        iM45029 = C19806.m45029("ۘܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27783)) ^ 2070042164;
                        i5 = 553570406;
                    }
                    break;
                case -1077580201:
                case 475930797:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22905) ^ 315974669;
                        i5 = 6523338;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۧ۫")) * (-75);
                        i4 = ((iM45029 ^ i2) * (-24029)) ^ 2081408132;
                        i5 = 1246971197;
                    }
                    break;
                case 258924365:
                case 451206295:
                    C3577.m10565();
                    if (C2871.f10837 < 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺܰ")) * (-93);
                        i4 = ((iM45029 ^ i3) * (-24157)) ^ (-1108331473);
                        i5 = 792968217;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۛ᩷")) * 79;
                        i4 = ((iM45029 ^ i2) * 16811) ^ (-1503442217);
                        i5 = -278070266;
                    }
                    break;
                case 434235080:
                case 1777068577:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۛ᩷")) * 79;
                        i4 = ((iM45029 ^ i2) * 16811) ^ (-1503442217);
                        i5 = -278070266;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22905) ^ 315974669;
                        i5 = 6523338;
                    }
                    break;
                case 809066569:
                case 1354281266:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22905) ^ 315974669;
                        i5 = 6523338;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27787) ^ (-1861721811);
                        i5 = -1081397767;
                    }
                    break;
                case 1289803867:
                case 1530222439:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺܰ")) * (-93);
                        i4 = ((iM45029 ^ i3) * (-24157)) ^ (-1108331473);
                        i5 = 792968217;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11315)) ^ (-952382399);
                        i5 = -99669522;
                    }
                    break;
                case 1505517375:
                case 1635214128:
                    C0216.m1591();
                    break;
                case 1639969704:
                case 1835242078:
                    C21157.m47601(str, null, th);
                    break;
                case 1642045407:
                case 2100338928:
                    C1668.m5583();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22905) ^ 315974669;
                        i5 = 6523338;
                    } else {
                        iM45029 = (C19806.m45029("ܶۨ") ^ i2) * (-51);
                        i4 = ((iM45029 ^ i3) * 11955) ^ (-273422701);
                        i5 = -129515112;
                    }
                    break;
                case 2014840456:
                case 2071587577:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ܶۨ") ^ i2) * (-51);
                        i4 = ((iM45029 ^ i3) * 11955) ^ (-273422701);
                        i5 = -129515112;
                    } else {
                        iM45029 = C19806.m45029("᩶ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19459) ^ (-1054108159);
                        i5 = -1710643703;
                    }
                    break;
                default:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺܰ")) * (-93);
                        i4 = ((iM45029 ^ i3) * (-24157)) ^ (-1108331473);
                        i5 = 792968217;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܳۡ")) * 87;
                        i4 = ((iM45029 ^ i3) * 5317) ^ (-1824742017);
                        i5 = 1604522349;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0453  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0228 A[PHI: r3
      0x0228: PHI (r3v7 boolean) = (r3v3 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:66:0x020f, B:60:0x01d7, B:5:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        if (l.C3286.f12186 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        if (l.C1189.f5284 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (l.C3660.f13403 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        r1 = l.ThreadFactoryC3888.m11306("ۡ᩶") ^ r21;
        r15 = ((r1 ^ r20) * (-27359)) ^ (-657311815);
        r23 = 132737169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        if (l.C3535.f13026 > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        if (l.C1668.f6641 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        if (l.C0629.f2722 <= 0) goto L34;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setClipboardText(java.lang.CharSequence r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10659.setClipboardText(java.lang.CharSequence, java.lang.String):boolean");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void cancelToast() {
        int i = 1888236322;
        int i2 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i3 = C1025.f4800;
        int iM11306 = (ThreadFactoryC3888.m11306("ۖܽ") ^ i3) * 53;
        int i4 = ((iM11306 ^ i2) * 24979) ^ (-840601561);
        int i5 = -1272490930;
        while (true) {
            i = ((((i ^ i2) * (-14429)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2142928995:
                case 1165973787:
                    C1668.m5583();
                    C0797.m3359();
                    iM11306 = (ThreadFactoryC3888.m11306("ۚ۟") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i4 = ((iM11306 ^ i2) * 28825) ^ (-1361565995);
                    i5 = -1229239306;
                    break;
                case -2124161339:
                case 165091451:
                    if (C1875.m6086() == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֡") + i3) * 17;
                        i4 = ((iM11306 ^ i2) * 32493) ^ 678115960;
                        i5 = 1536866588;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 799) ^ 425034515;
                        i5 = 47050960;
                    }
                    break;
                case -2059024916:
                case -1239831204:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗܺ") ^ i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-4421)) ^ (-2017462505);
                        i5 = 210743193;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩻ܽ")) * 15;
                        i4 = ((iM11306 ^ i3) * 24963) ^ (-537982696);
                        i5 = -7590260;
                    }
                    break;
                case -1882151538:
                case 1288257355:
                    if (C0671.f2816 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ۟") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 28825) ^ (-1361565995);
                        i5 = -1229239306;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3153)) ^ 1226979701;
                        i5 = -454387377;
                    }
                    break;
                case -1855811273:
                case -925431693:
                    if (C0671.m3008() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗܺ") ^ i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-4421)) ^ (-2017462505);
                        i5 = 210743193;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9401)) ^ 1003164072;
                        i5 = 293154239;
                    }
                    break;
                case -1817417419:
                case 1172852768:
                    if (C2704.f10408) {
                        ThreadUtil.runOnUiThread(new RunnableC19062(1));
                    }
                    iM11306 = (ThreadFactoryC3888.m11306("ۗܺ") ^ i3) * (-3);
                    i4 = ((iM11306 ^ i2) * (-4421)) ^ (-2017462505);
                    i5 = 210743193;
                    break;
                case -1546700436:
                case 1693873042:
                    if (ThreadFactoryC3888.m11300() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11957)) ^ 1796567143;
                        i5 = -947452436;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ۟") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 28825) ^ (-1361565995);
                        i5 = -1229239306;
                    }
                    break;
                case -1043828738:
                case 1728424300:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֡") + i3) * 17;
                        i4 = ((iM11306 ^ i2) * 32493) ^ 678115960;
                        i5 = 1536866588;
                    } else {
                        iM11306 = (C19806.m45029("ۜܽ") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * 26407) ^ 1745434465;
                        i5 = -2027211543;
                    }
                    break;
                case -918103825:
                case -31791239:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("۟ᩳ") ^ i2) * (-11);
                        i4 = ((iM11306 ^ i3) * 28593) ^ (-386020128);
                        i5 = -1564044093;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗܺ") ^ i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-4421)) ^ (-2017462505);
                        i5 = 210743193;
                    }
                    break;
                case -885820582:
                case 666603692:
                    C0962.m3746();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    break;
                case -617748570:
                case 1720068894:
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֡") + i3) * 17;
                        i4 = ((iM11306 ^ i2) * 32493) ^ 678115960;
                        i5 = 1536866588;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ۟") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 28825) ^ (-1361565995);
                        i5 = -1229239306;
                    }
                    break;
                case -179458581:
                case 900388889:
                    if (C0671.m3008() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11957)) ^ 1796567143;
                        i5 = -947452436;
                    } else {
                        iM11306 = (C19806.m45029("֫ܽ") + i2) * (-79);
                        i4 = ((iM11306 ^ i3) * (-2475)) ^ (-723887374);
                        i5 = 1597225845;
                    }
                    break;
                case 219372668:
                case 1694277565:
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6021) ^ 862774442;
                        i5 = -305633817;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11957)) ^ 1796567143;
                        i5 = -947452436;
                    }
                    break;
                case 252800172:
                case 716241936:
                    if (C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗܺ") ^ i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-4421)) ^ (-2017462505);
                        i5 = 210743193;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩶ܿ")) * (-99);
                        i4 = ((iM11306 ^ i2) * 20443) ^ (-287636254);
                        i5 = 1098712466;
                    }
                    break;
                default:
                    C0074 c0074 = C21157.f68901;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֡") + i3) * 17;
                        i4 = ((iM11306 ^ i2) * 32493) ^ 678115960;
                        i5 = 1536866588;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܳ") + i3) * 115;
                        i4 = ((iM11306 ^ i2) * 2643) ^ (-622507052);
                        i5 = 1045345464;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(String str) {
        String str2 = this.f36352;
        C0074 c0074 = C21157.f68901;
        synchronized (C21157.class) {
            C21157.m47600(str2, str);
        }
    }
}
