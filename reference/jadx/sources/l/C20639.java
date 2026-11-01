package l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩷ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F2T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20639 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۛ᩸᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f67206 = {4874, 3599, 467, -13894, 10951, 8295, -15081, 2057, -10360, -9440, -10778, -9895, -10622, 16206, -9772, 12380, 313, 18022, 19936, -22687, 2893, -26966, -26971, -26967, -26975, -26901, -26956, -26968, -26959, -26973, -26963, -26966, -26901, -26976, -26975, -26958, -26901, -26968, -26963, -26953, -26960, -26960, -26965, -26961, -26975, -26966, -26968, -26963, -26967, -26963, -26960, -26968, -26963, -26953, -26960, -26953, -26976, -26961, -26956, -26968, -26959, -26973, -26963, -26966, -26995, -26976, -26976, -26975, -26953, -26969, -26954, -26963, -26956, -26960, -26963, -26965, -26966, -26958, -26975, -26954, -26953, -26963, -26965, -26966, -27001, -26965, -26976, -26975, -26958, -26975, -26954, -26953, -26963, -26965, -26966, -26998, -26971, -26967, -26975, -26963, -26969, -26965, -26966, -26953, -26960, -26971, -26960, -26975, -26953, -26960, -26971, -26960, -26975, -26995, -26966, -26974, -26965, -26954, -26975, -26958, -26963, -26975, -26957, -26990, -26975, -26954, -26953, -26963, -26965, -26966, -26953, -26963, -26946, -26975};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11736 f67207;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67208;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f67209;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ActivityC11736 activityC11736 = null;
        TextView textView = null;
        C6018 c6018 = null;
        boolean z = false;
        int i = 550106978;
        int i2 = C2871.f10837;
        int i3 = C1875.f7103;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("۟ۡ")) * (-75);
        int i4 = ((iM11306 ^ i3) * (-5539)) ^ (-1812027310);
        int i5 = -202218815;
        while (true) {
            i = ((((i ^ i3) * 605) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1946824913:
                case 1368307153:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32695) ^ (-564767124);
                        i5 = -223390320;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27807) ^ (-343586136);
                        i5 = 1583075419;
                    }
                    break;
                case -1673914922:
                case 1853216375:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32695) ^ (-564767124);
                        i5 = -223390320;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32753) ^ (-96285130);
                        i5 = 59277708;
                    }
                    break;
                case -1582564195:
                case -367665943:
                    ThreadFactoryC3888.m11300();
                    if (!C1377.f5749) {
                        iM11306 = C19806.m45029("ۛۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15117) ^ (-340097198);
                        i5 = 426709932;
                    } else {
                        iM11306 = C19806.m45029("ܰۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11067) ^ (-1809803461);
                        i5 = -1867390676;
                    }
                    break;
                case -1364054399:
                case 2071992105:
                    C1461.m5080();
                    if (C0050.f912 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32695) ^ (-564767124);
                        i5 = -223390320;
                    } else {
                        iM11306 = C19806.m45029("ۚ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22269)) ^ 875986171;
                        i5 = -1080607629;
                    }
                    break;
                case -1317517218:
                case -505858841:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ܰۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11067) ^ (-1809803461);
                        i5 = -1867390676;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31551)) ^ (-759755282);
                        i5 = -558216432;
                    }
                    break;
                case -1217732800:
                case -324470371:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ܰۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11067) ^ (-1809803461);
                        i5 = -1867390676;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۙ") ^ i3) * (-23);
                        i4 = ((iM11306 ^ i2) * 26813) ^ (-961364485);
                        i5 = 1647409628;
                    }
                    break;
                case -1135666594:
                case 2045411571:
                    textView = activityC11736.f39461;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("ۚ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22269)) ^ 875986171;
                        i5 = -1080607629;
                    } else {
                        iM11306 = (C19806.m45029("ۗ۟") ^ i2) * 31;
                        i4 = ((iM11306 ^ i3) * 4809) ^ 1985974201;
                        i5 = -139877256;
                    }
                    break;
                case -890798839:
                case 1080007761:
                    if (C3535.f13026 > 0) {
                        iM11306 = C19806.m45029("ۚ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22269)) ^ 875986171;
                        i5 = -1080607629;
                    } else {
                        iM11306 = C19806.m45029("ۛۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15117) ^ (-340097198);
                        i5 = 426709932;
                    }
                    break;
                case -640148634:
                case 1243853166:
                    c6018 = activityC11736.f39459;
                    z = true;
                    if (C3722.f13525 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴۡ")) * 39;
                        i4 = ((iM11306 ^ i2) * 25123) ^ (-1367508848);
                        i5 = 1918368221;
                    } else {
                        iM11306 = (C19806.m45029("ۤۖ") + i2) * 69;
                        i4 = ((iM11306 ^ i3) * (-20973)) ^ (-204835373);
                        i5 = 1757875128;
                    }
                    break;
                case -370531865:
                case -291613646:
                    if (C2477.m7593() >= 0) {
                        iM11306 = C19806.m45029("ܰۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11067) ^ (-1809803461);
                        i5 = -1867390676;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-10453)) ^ (-539251514);
                        i5 = -1161870859;
                    }
                    break;
                case -223849374:
                case 1612226291:
                    activityC11736 = this.f67207;
                    if (C3660.f13403 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴۡ")) * 39;
                        i4 = ((iM11306 ^ i2) * 25123) ^ (-1367508848);
                        i5 = 1918368221;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17077)) ^ 2090231513;
                        i5 = -2059134573;
                    }
                    break;
                case 898131134:
                case 1928132594:
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("ܰۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11067) ^ (-1809803461);
                        i5 = -1867390676;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6739) ^ (-904766678);
                        i5 = 1528482159;
                    }
                    break;
                case 919479332:
                case 1552015460:
                    C3722.m10890(textView, 8);
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴۡ")) * 39;
                        i4 = ((iM11306 ^ i2) * 25123) ^ (-1367508848);
                        i5 = 1918368221;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10071) ^ (-1702004559);
                        i5 = 854185349;
                    }
                    break;
                case 967766364:
                case 1379361230:
                    c6018.m16335(z);
                    ActivityC11736.m29348(activityC11736);
                    break;
                case 1285158692:
                case 1420227727:
                    C2642.m8171();
                    C2332.m7079();
                    iM11306 = C19806.m45029("ۛۜ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 15117) ^ (-340097198);
                    i5 = 426709932;
                    break;
                default:
                    C1419.m4973();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ActivityC11736 activityC11736 = null;
        C6018 c6018 = null;
        boolean z = false;
        int i = -40390320;
        int i2 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i3 = C1066.f4915;
        int iM45029 = (i2 - C19806.m45029("᩹ᩴ")) * 119;
        int i4 = ((iM45029 ^ i3) * 10875) ^ (-1620516792);
        int i5 = 970062204;
        while (true) {
            i = ((((i ^ i3) * (-21459)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1933918366:
                case 544600346:
                    if (C2788.m8472() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܶ") ^ i3) * (-31);
                        i4 = ((iM45029 ^ i2) * (-6781)) ^ 1154877799;
                        i5 = -153870710;
                    } else {
                        iM45029 = C19806.m45029("᩻᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14297) ^ (-1319689259);
                        i5 = -1558016440;
                    }
                    break;
                case -1849754818:
                case 932065460:
                    activityC11736 = this.f67207;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("ۗ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30315)) ^ 146047421;
                        i5 = 1546419262;
                    } else {
                        iM45029 = C19806.m45029("۟ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17967)) ^ 1898136203;
                        i5 = 1626961404;
                    }
                    break;
                case -1743572670:
                case -523300696:
                    if (C2642.m8171() != 0) {
                        iM45029 = (C19806.m45029("ۗۖ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i3) * 10127) ^ 450228376;
                        i5 = 1869992648;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۘܺ")) * 33;
                        i4 = ((iM45029 ^ i2) * 30699) ^ (-226395179);
                        i5 = -89632490;
                    }
                    break;
                case -1733120645:
                case -362345339:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("ۗۖ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i3) * 10127) ^ 450228376;
                        i5 = 1869992648;
                    } else {
                        iM45029 = (C19806.m45029("ۛ۠") ^ i3) * (-27);
                        i4 = ((iM45029 ^ i2) * 22127) ^ (-107497946);
                        i5 = -610917635;
                    }
                    break;
                case -1726071730:
                case -813255314:
                    C2249.m6915();
                    if (!C0526.f2219) {
                        iM45029 = C19806.m45029("ۗ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30315)) ^ 146047421;
                        i5 = 1546419262;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i2) * (-79);
                        i4 = ((iM45029 ^ i3) * 32013) ^ 1893659282;
                        i5 = 1131515333;
                    }
                    break;
                case -1635493334:
                case -1433625488:
                    if (this.f67208 != activityC11736.f39460) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24247) ^ 414556569;
                        i5 = -365052255;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2911)) ^ 934015157;
                        i5 = -1943757701;
                    }
                    break;
                case -1552400905:
                case 1765057126:
                    break;
                case -1448079027:
                case 1951154970:
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("ܰۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11771) ^ 80807062;
                        i5 = -643168843;
                    } else {
                        iM45029 = (C19806.m45029("۫ۛ") + i2) * 91;
                        i4 = ((iM45029 ^ i3) * 15861) ^ 932600449;
                        i5 = -1804955661;
                    }
                    break;
                case -1014774356:
                case 965786576:
                    if (!C0962.f3784) {
                        iM45029 = C19806.m45029("ܰۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11771) ^ 80807062;
                        i5 = -643168843;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܶ") ^ i3) * (-31);
                        i4 = ((iM45029 ^ i2) * (-6781)) ^ 1154877799;
                        i5 = -153870710;
                    }
                    break;
                case -1010581958:
                case -410165606:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i2) * (-79);
                        i4 = ((iM45029 ^ i3) * 32013) ^ 1893659282;
                        i5 = 1131515333;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17987) ^ (-1270681277);
                        i5 = 1170924320;
                    }
                    break;
                case -983490838:
                case 1715460352:
                    c6018 = activityC11736.f39459;
                    z = false;
                    z = false;
                    if (RunnableC0195.m1431()) {
                        iM45029 = C19806.m45029("ۡ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-26375)) ^ 1004602179;
                        i5 = 7937674;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30315)) ^ 146047421;
                        i5 = 1546419262;
                    }
                    break;
                case -665602791:
                case 46055814:
                    if (C3743.f13569) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21991) ^ 1162154347;
                        i5 = 300977645;
                    } else {
                        iM45029 = (C19806.m45029("ۗۖ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i3) * 10127) ^ 450228376;
                        i5 = 1869992648;
                    }
                    break;
                case -454267542:
                case -163935125:
                    RunnableC1895.m6165(activityC11736.f39461, z ? 1 : 0);
                    iM45029 = ThreadFactoryC3888.m11306("᩶᩻") ^ i2;
                    i4 = ((iM45029 ^ i3) * 24247) ^ 414556569;
                    i5 = -365052255;
                    break;
                case 88454118:
                case 714513076:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܶ") ^ i3) * (-31);
                        i4 = ((iM45029 ^ i2) * (-6781)) ^ 1154877799;
                        i5 = -153870710;
                    } else {
                        iM45029 = (C19806.m45029("ۜۨ") ^ i2) * (-63);
                        i4 = ((iM45029 ^ i3) * 6351) ^ 2147407648;
                        i5 = -1207856395;
                    }
                    break;
                case 276041300:
                case 1489653938:
                    C10634.m26820();
                    if (!C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i2) * (-79);
                        i4 = ((iM45029 ^ i3) * 32013) ^ 1893659282;
                        i5 = 1131515333;
                    } else {
                        iM45029 = C19806.m45029("ܰۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11771) ^ 80807062;
                        i5 = -643168843;
                    }
                    break;
                case 306709269:
                case 1338055850:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܶ") ^ i3) * (-31);
                        i4 = ((iM45029 ^ i2) * (-6781)) ^ 1154877799;
                        i5 = -153870710;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֡") ^ i2) * (-109);
                        i4 = ((iM45029 ^ i3) * (-26489)) ^ 23460536;
                        i5 = -812970615;
                    }
                    break;
                case 565057954:
                case 1110250821:
                    C0797.m3359();
                    RunnableC1564.m5345();
                    iM45029 = C19806.m45029("ܰۢ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 11771) ^ 80807062;
                    i5 = -643168843;
                    break;
                case 1707464785:
                case 1958437402:
                    c6018.m16335(z);
                    if (C2190.m6804()) {
                        iM45029 = C19806.m45029("֫ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 10115) ^ 877569964;
                        i5 = -2125401354;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24247) ^ 414556569;
                        i5 = -365052255;
                    }
                    break;
                default:
                    CallableC1627.m5507();
                    C1148.m4232();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46507(C20639 c20639) {
        ActivityC11736 activityC11736 = null;
        ArrayList arrayList = null;
        int i = -81814222;
        int i2 = C0050.f912;
        int i3 = C1419.f5860;
        int iM45029 = C19806.m45029("ۡܶ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 27123) ^ 856893825;
        int i5 = -60622479;
        while (true) {
            i = ((((i ^ i3) * (-28885)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2139080877:
                case 1425988060:
                    activityC11736.f39458.addAll(c20639.f67209);
                    iM45029 = (i2 - C19806.m45029("᩹֨")) * 31;
                    i4 = ((iM45029 ^ i3) * 12113) ^ 1950540379;
                    i5 = 1116491823;
                    break;
                case -2025886141:
                case 1272646965:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ܶ") + i3) * 69;
                        i4 = ((iM45029 ^ i2) * (-4487)) ^ (-813816922);
                        i5 = -28085578;
                    } else {
                        iM45029 = C19806.m45029("ᩳۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1237) ^ (-2088005954);
                        i5 = 431484323;
                    }
                    break;
                case -1936037820:
                case -933777511:
                    arrayList = activityC11736.f39458;
                    if (C3660.m10791() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4317)) ^ (-1963234975);
                        i5 = 571401215;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31331) ^ (-1104374941);
                        i5 = -786908396;
                    }
                    break;
                case -1687165714:
                case 2051588803:
                    C3286.m9791(activityC11736.f41645, C2190.m6805());
                    break;
                case -1537652229:
                case -673334699:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4317)) ^ (-1963234975);
                        i5 = 571401215;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11715)) ^ 84931515;
                        i5 = -855758728;
                    }
                    break;
                case -1448381370:
                case -871047654:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * (-29097)) ^ (-666104207);
                        i5 = -1073791949;
                    } else {
                        iM45029 = (i2 - C19806.m45029("֡᩶")) * (-31);
                        i4 = ((iM45029 ^ i3) * 2907) ^ 2126950638;
                        i5 = -155590574;
                    }
                    break;
                case -1421840215:
                case -139615142:
                    AbstractC0464.m2313();
                    if (!C19806.f63586) {
                        iM45029 = (C19806.m45029("۬᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 18505) ^ (-1171327196);
                        i5 = -121462952;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ܶ") + i3) * 69;
                        i4 = ((iM45029 ^ i2) * (-4487)) ^ (-813816922);
                        i5 = -28085578;
                    }
                    break;
                case -1337410329:
                case -192395934:
                    activityC11736 = c20639.f67207;
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4317)) ^ (-1963234975);
                        i5 = 571401215;
                    } else {
                        iM45029 = C19806.m45029("᩶֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10943) ^ 419670117;
                        i5 = -1594986732;
                    }
                    break;
                case -1155088060:
                case 643116777:
                    C0278.m1789();
                    C2124.m6673();
                    break;
                case -777087731:
                case 855419460:
                    if (C2704.m8255() <= 0) {
                        iM45029 = (C19806.m45029("۬᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 18505) ^ (-1171327196);
                        i5 = -121462952;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29841) ^ (-236367215);
                        i5 = -2072129425;
                    }
                    break;
                case -700090125:
                case -322449662:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("۬᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 18505) ^ (-1171327196);
                        i5 = -121462952;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7279)) ^ (-1961219565);
                        i5 = -1636048317;
                    }
                    break;
                case -306241154:
                case 79186098:
                    MenuItemOnMenuItemClickListenerC3244.m9710(arrayList);
                    if (c20639.f67209 != null) {
                        iM45029 = C19806.m45029("۠ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18817) ^ 159199365;
                        i5 = 1428214202;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩹֨")) * 31;
                        i4 = ((iM45029 ^ i3) * 12113) ^ 1950540379;
                        i5 = 1116491823;
                    }
                    break;
                case -170980930:
                case 532978349:
                    C0629.m2907();
                    if (!C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ܶ") + i3) * 69;
                        i4 = ((iM45029 ^ i2) * (-4487)) ^ (-813816922);
                        i5 = -28085578;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩶") ^ i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-893)) ^ (-399204424);
                        i5 = -170276332;
                    }
                    break;
                case 80229454:
                case 810963836:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4317)) ^ (-1963234975);
                        i5 = 571401215;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩳ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i3) * 7787) ^ (-1260519901);
                        i5 = -396172216;
                    }
                    break;
                case 814221595:
                case 1007577693:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * (-29097)) ^ (-666104207);
                        i5 = -1073791949;
                    } else {
                        iM45029 = C19806.m45029("ۛ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9995)) ^ 1045304125;
                        i5 = 1912188543;
                    }
                    break;
                case 1326201859:
                case 1779341827:
                    C1460.m5050();
                    iM45029 = (ThreadFactoryC3888.m11306("ۤ᩶") ^ i2) * (-51);
                    i4 = ((iM45029 ^ i3) * (-893)) ^ (-399204424);
                    i5 = -170276332;
                    break;
                case 1407078902:
                case 1574087084:
                    if (!RunnableC0195.m1431()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩶") ^ i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-893)) ^ (-399204424);
                        i5 = -170276332;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * (-29097)) ^ (-666104207);
                        i5 = -1073791949;
                    }
                    break;
                default:
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4317)) ^ (-1963234975);
                        i5 = 571401215;
                    } else {
                        iM45029 = C19806.m45029("᩻۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20295)) ^ 229099656;
                        i5 = -1652082882;
                    }
                    break;
            }
            return;
        }
    }

    public C20639(ActivityC11736 activityC11736, int i) {
        int i2 = 182009084;
        int i3 = C1461.f5957;
        int i4 = C2124.f7782;
        this.f67207 = activityC11736;
        this.f67208 = i;
        int iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-25755)) ^ 707601266;
        int i6 = -2076489502;
        while (true) {
            i2 = (iM11306 ^ i6) ^ (i5 & (((i2 ^ i4) * 23343) >> 31));
            switch (i2) {
                case -1921058525:
                case 538245826:
                    if (!C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22179) ^ (-920408972);
                        i6 = -1520955125;
                    }
                    break;
                case -597776146:
                case 1735325279:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܿ") + i4) * 93;
                        i5 = ((iM11306 ^ i3) * 29637) ^ (-1141858375);
                        i6 = -1976269150;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛ۟")) * (-9);
                        i5 = ((iM11306 ^ i4) * 23649) ^ 1615454960;
                        i6 = 193617247;
                        continue;
                    }
                    break;
                case -496269609:
                case 987202464:
                    C0671.m3008();
                    throw new RuntimeException();
                case -269298026:
                case 776133348:
                    return;
                case -100985388:
                case 82424452:
                    C0216.m1591();
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("ۖ᩸") + i3) * 119;
                        i5 = ((iM11306 ^ i4) * 26837) ^ (-1516324135);
                        i6 = -1711239312;
                    }
                    break;
                case 516411344:
                case 705696248:
                    C2332.m7079();
                    C0962.m3746();
                    break;
                default:
                    C3722.m10894();
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("᩹ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-15985)) ^ 1596742617;
                        i6 = 1767862796;
                    }
                    break;
            }
            iM11306 = ThreadFactoryC3888.m11306("᩹ۜ") ^ i4;
            i5 = ((iM11306 ^ i3) * (-9795)) ^ 387782600;
            i6 = -1779221665;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01a8 A[PHI: r14
      0x01a8: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v6 short[]) binds: [B:116:0x01a8, B:13:0x008c, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        String strM7604;
        TextView textView;
        short[] sArr;
        int iM11306;
        int i5;
        int iM450210;
        int i6;
        int i7;
        int i8;
        int iM450211;
        int i9;
        int iM11307;
        int i10;
        int i11;
        int i12;
        int iM11308;
        int i13;
        this = this;
        int i14 = RunnableC0195.f1321;
        int i15 = C1066.f4915;
        int iM11309 = ThreadFactoryC3888.m11306("֡ܽ") ^ i14;
        int i16 = ((iM11309 ^ i15) * 15939) ^ (-757553828);
        C8067 c8067 = null;
        DialogInterface.OnClickListener onClickListener = null;
        DialogInterface.OnClickListener onClickListener2 = null;
        String str = null;
        String strM26821 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i17 = iM11309 ^ (-828849231);
        ActivityC11736 activityC11736 = null;
        int iM450212 = 0;
        int iM450213 = 0;
        int iM450214 = 0;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        int i20 = 0;
        int i21 = -80735360;
        TextView textView2 = null;
        int i22 = 0;
        while (true) {
            i21 = i17 ^ (i16 & (((i21 ^ i15) * (-29693)) >> 31));
            switch (i21) {
                case -2097157869:
                case -1004490651:
                    C0629.m2907();
                    C1875.m6086();
                    break;
                case -1958187549:
                case 592034707:
                    i19 = 52466;
                    iM11306 = (C19806.m45029("᩶᩶") + i14) * 65;
                    i16 = ((iM11306 ^ i15) * (-31501)) ^ (-1674874761);
                    i5 = -1722881534;
                    int i23 = iM11306 ^ i5;
                    sArr2 = sArr2;
                    i22 = i22;
                    i17 = i23;
                    textView2 = textView2;
                    this = this;
                    break;
                case -1919066314:
                case -561229566:
                    iM450214 = 2123376529 ^ C19806.m45029(C0629.m2906(sArr5, i18, 3, i19));
                    if (C1066.f4915 > 0) {
                        iM45029 = C19806.m45029("ᩴܽ") ^ i14;
                        i2 = ((iM45029 ^ i15) * 9831) ^ 1580694927;
                        i3 = 120136852;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i = i22;
                        iM11308 = C19806.m45029("֫ܳ") ^ i14;
                        i10 = ((iM11308 ^ i15) * (-11927)) ^ 1249801259;
                        i13 = 556435880;
                        i12 = iM11308 ^ i13;
                        i9 = i;
                        i17 = i12;
                        i16 = i10;
                        i22 = i9;
                    }
                    break;
                case -1842773338:
                case 1915463132:
                    i = i22;
                    short[] sArr6 = sArr2;
                    strM26821 = C10634.m26821(sArr6, 4, 3, i19);
                    if (C1668.f6641 < 0) {
                        int iM450215 = (C19806.m45029("᩻ᩳ") ^ i15) * (-113);
                        i2 = ((iM450215 ^ i14) * 30919) ^ 2122769042;
                        sArr2 = sArr6;
                        i22 = i;
                        i17 = iM450215 ^ (-1608843598);
                        i16 = i2;
                    } else {
                        sArr2 = sArr6;
                        iM11308 = C19806.m45029("֫ܳ") ^ i14;
                        i10 = ((iM11308 ^ i15) * (-11927)) ^ 1249801259;
                        i13 = 556435880;
                        i12 = iM11308 ^ i13;
                        i9 = i;
                        i17 = i12;
                        i16 = i10;
                        i22 = i9;
                    }
                    break;
                case -1715250765:
                case 1458813040:
                    i = i22;
                    short[] sArr7 = sArr2;
                    TextView textView3 = textView2;
                    ThreadFactoryC3888.m11303(textView3, ThreadFactoryC3888.m11306(str) ^ 2119577818);
                    if (C2190.m6804()) {
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("۬ܽ")) * 37;
                        i10 = ((iM11307 ^ i14) * 3105) ^ (-1890861093);
                        i11 = -707125382;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("֨᩺") ^ i15;
                        i10 = ((iM11307 ^ i14) * (-14477)) ^ (-214915409);
                        i11 = 620352565;
                    }
                    i12 = iM11307 ^ i11;
                    sArr2 = sArr7;
                    textView2 = textView3;
                    i9 = i;
                    i17 = i12;
                    i16 = i10;
                    i22 = i9;
                    break;
                case -1526740594:
                case 1423373997:
                    C10634.m26830(c8067, iM450214, onClickListener2);
                    c8067.m21256(new DialogInterface.OnCancelListener() { // from class: l.۟ۙۘ
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C20639 c20639 = null;
                            int i24 = -158318723;
                            int i25 = C1875.f7103;
                            int i26 = AbstractC0464.f2088;
                            int iM450216 = (C19806.m45029("ᩳۙ") ^ i25) * 41;
                            int i27 = ((iM450216 ^ i26) * 25381) ^ 1461353876;
                            int i28 = 1806341775;
                            while (true) {
                                i24 = ((((i24 ^ i26) * 8299) >> 31) & i27) ^ (iM450216 ^ i28);
                                switch (i24) {
                                    case -1901202571:
                                    case -1056390492:
                                        if (C1937.f7317 >= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * 8101) ^ (-1769441720);
                                            i28 = 1685493452;
                                        } else {
                                            iM450216 = (i26 - C19806.m45029("ܿۖ")) * (-79);
                                            i27 = ((iM450216 ^ i25) * 20653) ^ (-1735244462);
                                            i28 = 1368544068;
                                        }
                                        break;
                                    case -1891142551:
                                    case -1243621141:
                                        C3577.m10565();
                                        iM450216 = ThreadFactoryC3888.m11306("ܿ֫") ^ i26;
                                        i27 = ((iM450216 ^ i25) * (-31593)) ^ (-636009706);
                                        i28 = 524813619;
                                        break;
                                    case -1844019804:
                                    case 725053768:
                                        if (C2124.m6673() <= 0) {
                                            iM450216 = (i26 - ThreadFactoryC3888.m11306("ܶ۠")) * 41;
                                            i27 = ((iM450216 ^ i25) * (-2427)) ^ 1244745487;
                                            i28 = -1086899968;
                                        } else {
                                            iM450216 = (C19806.m45029("ܿ۬") + i26) * 79;
                                            i27 = ((iM450216 ^ i25) * 18279) ^ (-325502269);
                                            i28 = 1893574724;
                                        }
                                        break;
                                    case -1838183204:
                                    case 1235841792:
                                        if (RunnableC1895.m6170() != 0) {
                                            iM450216 = C19806.m45029("۬ۤ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * (-31821)) ^ (-1939880119);
                                            i28 = -1281520835;
                                        } else {
                                            iM450216 = C19806.m45029("ۡۤ") ^ i26;
                                            i27 = ((iM450216 ^ i25) * (-759)) ^ 1433483070;
                                            i28 = 1935913566;
                                        }
                                        break;
                                    case -1734518971:
                                    case -344899134:
                                        C0817.m3399();
                                        if (C2788.f10625 >= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * 8101) ^ (-1769441720);
                                            i28 = 1685493452;
                                        } else {
                                            iM450216 = (i25 - C19806.m45029("ۛܿ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i27 = ((iM450216 ^ i26) * (-28795)) ^ 2043336337;
                                            i28 = -1743787211;
                                        }
                                        break;
                                    case -1546789716:
                                    case -1063111508:
                                        if (C1148.f5161 <= 0) {
                                            iM450216 = (i26 - ThreadFactoryC3888.m11306("ܶ۠")) * 41;
                                            i27 = ((iM450216 ^ i25) * (-2427)) ^ 1244745487;
                                            i28 = -1086899968;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("֨ۘ") ^ i26;
                                            i27 = ((iM450216 ^ i25) * (-23613)) ^ (-1711827324);
                                            i28 = -1357853167;
                                        }
                                        break;
                                    case -1107122224:
                                    case 1431548679:
                                        if (C0671.f2816 != 0) {
                                            iM450216 = C19806.m45029("۬ۤ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * (-31821)) ^ (-1939880119);
                                            i28 = -1281520835;
                                        } else {
                                            iM450216 = (i26 - ThreadFactoryC3888.m11306("ᩴ۠")) * (-27);
                                            i27 = ((iM450216 ^ i25) * (-13179)) ^ (-1440049948);
                                            i28 = -461249663;
                                        }
                                        break;
                                    case -1028118095:
                                    case -98383452:
                                        C0216.m1586(c20639.f67207);
                                        break;
                                    case -771802049:
                                    case -398279692:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM450216 = (i26 - ThreadFactoryC3888.m11306("ܶ۠")) * 41;
                                            i27 = ((iM450216 ^ i25) * (-2427)) ^ 1244745487;
                                            i28 = -1086899968;
                                        } else {
                                            iM450216 = C19806.m45029("᩸ۢ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * (-7987)) ^ 1757745847;
                                            i28 = -1100899392;
                                        }
                                        break;
                                    case -319197820:
                                    case 1193956440:
                                        ThreadFactoryC3888.m11300();
                                        C1461.m5080();
                                        break;
                                    case -143470842:
                                    case 83683372:
                                        if (C1066.f4915 <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * 8101) ^ (-1769441720);
                                            i28 = 1685493452;
                                        } else {
                                            iM450216 = C19806.m45029("ۛۡ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * 10545) ^ (-35816963);
                                            i28 = 708381295;
                                        }
                                        break;
                                    case 234418096:
                                    case 1231816262:
                                        if (C0962.f3784) {
                                            iM450216 = (i26 - ThreadFactoryC3888.m11306("ܶ۠")) * 41;
                                            i27 = ((iM450216 ^ i25) * (-2427)) ^ 1244745487;
                                            i28 = -1086899968;
                                        } else {
                                            iM450216 = (C19806.m45029("ܳܰ") ^ i25) * 123;
                                            i27 = ((iM450216 ^ i26) * 10963) ^ (-550063927);
                                            i28 = 1218992464;
                                        }
                                        break;
                                    case 376993675:
                                    case 1212630764:
                                        C1875.m6086();
                                        if (C2124.m6673() > 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * 8101) ^ (-1769441720);
                                            i28 = 1685493452;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ܿ֫") ^ i26;
                                            i27 = ((iM450216 ^ i25) * (-31593)) ^ (-636009706);
                                            i28 = 524813619;
                                        }
                                        break;
                                    case 721541466:
                                    case 771075221:
                                        if (C2788.m8472() != 0) {
                                            iM450216 = C19806.m45029("۬ۤ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * (-31821)) ^ (-1939880119);
                                            i28 = -1281520835;
                                        } else {
                                            iM450216 = (C19806.m45029("᩺᩶") + i25) * 83;
                                            i27 = ((iM450216 ^ i26) * 26609) ^ 1246435072;
                                            i28 = 1791713475;
                                        }
                                        break;
                                    case 1487685096:
                                    case 1948293271:
                                        C3660.m10791();
                                        if (!C1377.f5749) {
                                            iM450216 = ThreadFactoryC3888.m11306("ܿ֫") ^ i26;
                                            i27 = ((iM450216 ^ i25) * (-31593)) ^ (-636009706);
                                            i28 = 524813619;
                                        } else {
                                            iM450216 = (i26 - ThreadFactoryC3888.m11306("ܶ۠")) * 41;
                                            i27 = ((iM450216 ^ i25) * (-2427)) ^ 1244745487;
                                            i28 = -1086899968;
                                        }
                                        break;
                                    default:
                                        c20639 = this.f24091;
                                        if (C0526.f2219) {
                                            iM450216 = C19806.m45029("۬ۤ") ^ i25;
                                            i27 = ((iM450216 ^ i26) * (-31821)) ^ (-1939880119);
                                            i28 = -1281520835;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("᩷᩹") ^ i25;
                                            i27 = ((iM450216 ^ i26) * (-14581)) ^ (-1999500691);
                                            i28 = 286299371;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C2704.m8239(c8067);
                    break;
                case -1446407487:
                case 1448220939:
                    iM450213 = 2097177132 ^ C19806.m45029(C2332.m7082(sArr4, 10, 3, i19));
                    if (C1025.f4800 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩶") ^ i15;
                        i2 = ((iM45029 ^ i14) * 31473) ^ 1477616616;
                        i3 = 1278764299;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i22 = i22;
                        textView2 = textView2;
                        sArr2 = sArr2;
                        iM11306 = C19806.m45029("ܿ֨") ^ i15;
                        i16 = ((iM11306 ^ i14) * 20731) ^ (-1330921713);
                        i5 = 2103151871;
                        int i24 = iM11306 ^ i5;
                        sArr2 = sArr2;
                        i22 = i22;
                        i17 = i24;
                        textView2 = textView2;
                        this = this;
                    }
                    break;
                case -1410991344:
                case 696564878:
                    C1460.m5055(c8067, iM450213, onClickListener);
                    onClickListener2 = new DialogInterface.OnClickListener() { // from class: l.ۤۙۘ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i25) {
                            int i26 = -1385512340;
                            int i27 = C3577.f13150;
                            int i28 = C1025.f4800;
                            int iM113010 = (ThreadFactoryC3888.m11306("ܿܿ") ^ i28) * (-49);
                            int i29 = ((iM113010 ^ i27) * (-1309)) ^ 444817368;
                            int i30 = 239339468;
                            while (true) {
                                i26 = ((((i26 ^ i27) * 28363) >> 31) & i29) ^ (iM113010 ^ i30);
                                switch (i26) {
                                    case -2091027942:
                                    case 1733216244:
                                        if (C0216.f1393 != 0) {
                                            iM113010 = (C19806.m45029("᩸ܽ") + i28) * 41;
                                            i29 = ((iM113010 ^ i27) * 31201) ^ 1453275536;
                                            i30 = -1123259497;
                                        } else {
                                            iM113010 = C19806.m45029("֨ܳ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * (-18085)) ^ 583559122;
                                            i30 = -1786887758;
                                        }
                                        break;
                                    case -1923235674:
                                    case -483979346:
                                        if (C1875.f7103 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܽۘ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * 31019) ^ 769647453;
                                            i30 = -81312450;
                                        } else {
                                            iM113010 = (C19806.m45029("֨ۨ") ^ i27) * 73;
                                            i29 = ((iM113010 ^ i28) * (-23499)) ^ (-679655212);
                                            i30 = -426263536;
                                        }
                                        break;
                                    case -1904685603:
                                    case -1094181937:
                                        C1668.m5583();
                                        C2249.m6915();
                                        break;
                                    case -1895871820:
                                    case -804738013:
                                        RunnableC1895.m6170();
                                        if (!C19806.f63586) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܽۘ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * 31019) ^ 769647453;
                                            i30 = -81312450;
                                        } else {
                                            iM113010 = (i28 - ThreadFactoryC3888.m11306("ܰۧ")) * (-65);
                                            i29 = ((iM113010 ^ i27) * 9921) ^ 1385193705;
                                            i30 = -1921784011;
                                        }
                                        break;
                                    case -1849516467:
                                    case -1414156998:
                                        if (C1668.f6641 >= 0) {
                                            iM113010 = (C19806.m45029("᩸ܽ") + i28) * 41;
                                            i29 = ((iM113010 ^ i27) * 31201) ^ 1453275536;
                                            i30 = -1123259497;
                                        } else {
                                            iM113010 = C19806.m45029("֡۠") ^ i28;
                                            i29 = ((iM113010 ^ i27) * 21851) ^ 1128702143;
                                            i30 = -1207990684;
                                        }
                                        break;
                                    case -1839368155:
                                    case 1692357701:
                                        C2477.m7593();
                                        if (C2788.m8472() != 0) {
                                            iM113010 = (C19806.m45029("᩸ܽ") + i28) * 41;
                                            i29 = ((iM113010 ^ i27) * 31201) ^ 1453275536;
                                            i30 = -1123259497;
                                        } else {
                                            iM113010 = (i28 - ThreadFactoryC3888.m11306("ܰۧ")) * (-65);
                                            i29 = ((iM113010 ^ i27) * 9921) ^ 1385193705;
                                            i30 = -1921784011;
                                        }
                                        break;
                                    case -1396976753:
                                    case -384439071:
                                        if (C3722.f13525 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("֨ܰ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * (-24465)) ^ (-2044806560);
                                            i30 = -1954042326;
                                        } else {
                                            iM113010 = C19806.m45029("ۡۛ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * (-563)) ^ 169248825;
                                            i30 = 829961075;
                                        }
                                        break;
                                    case -463044218:
                                    case 2138002027:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܽۘ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * 31019) ^ 769647453;
                                            i30 = -81312450;
                                        } else {
                                            iM113010 = C19806.m45029("ۚ᩵") ^ i28;
                                            i29 = ((iM113010 ^ i27) * (-24783)) ^ 670500731;
                                            i30 = 1039939974;
                                        }
                                        break;
                                    case -313711726:
                                    case -287057282:
                                        if (C1419.f5860 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("֨ܰ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * (-24465)) ^ (-2044806560);
                                            i30 = -1954042326;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۖۡ") + i27) * (-55);
                                            i29 = ((iM113010 ^ i28) * (-8503)) ^ (-796871172);
                                            i30 = -1986863675;
                                        }
                                        break;
                                    case -275524957:
                                    case 6247373:
                                        if (C1419.f5860 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۘܳ") ^ i28;
                                            i29 = ((iM113010 ^ i27) * (-32715)) ^ (-1034086829);
                                            i30 = -1267827759;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ᩳۡ") ^ i28) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i29 = ((iM113010 ^ i27) * (-31591)) ^ 48020926;
                                            i30 = -2103498277;
                                        }
                                        break;
                                    case -22369514:
                                    case 1564134324:
                                        C0278.m1783(this.f34363.f67207);
                                        break;
                                    case 156017926:
                                    case 1642782806:
                                        if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                            iM113010 = (i28 - ThreadFactoryC3888.m11306("ܰۧ")) * (-65);
                                            i29 = ((iM113010 ^ i27) * 9921) ^ 1385193705;
                                            i30 = -1921784011;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("֨ܰ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * (-24465)) ^ (-2044806560);
                                            i30 = -1954042326;
                                        }
                                        break;
                                    case 263435626:
                                    case 997619093:
                                        if (C3286.f12186) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܽۘ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * 31019) ^ 769647453;
                                            i30 = -81312450;
                                        } else {
                                            iM113010 = C19806.m45029("ۘۨ") ^ i27;
                                            i29 = ((iM113010 ^ i28) * (-22811)) ^ 2042828241;
                                            i30 = 2125142213;
                                        }
                                        break;
                                    case 290085617:
                                    case 1558734909:
                                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                        iM113010 = (i28 - ThreadFactoryC3888.m11306("ܰۧ")) * (-65);
                                        i29 = ((iM113010 ^ i27) * 9921) ^ 1385193705;
                                        i30 = -1921784011;
                                        break;
                                    case 548830654:
                                    case 874865483:
                                        if (C1398.f5802 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۘܳ") ^ i28;
                                            i29 = ((iM113010 ^ i27) * (-32715)) ^ (-1034086829);
                                            i30 = -1267827759;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ܺ֡") ^ i28;
                                            i29 = ((iM113010 ^ i27) * (-19227)) ^ 454070117;
                                            i30 = -1920214308;
                                        }
                                        break;
                                    default:
                                        if (C3743.f13569) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܽ۠") ^ i28;
                                            i29 = ((iM113010 ^ i27) * 6785) ^ 1834735665;
                                            i30 = 2081079299;
                                        } else {
                                            iM113010 = (i28 - ThreadFactoryC3888.m11306("ܰۧ")) * (-65);
                                            i29 = ((iM113010 ^ i27) * 9921) ^ 1385193705;
                                            i30 = -1921784011;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr5 = f67206;
                    i18 = 13;
                    if (RunnableC1606.f6488 < 0) {
                        iM45029 = (C19806.m45029("᩹ۚ") + i15) * (-107);
                        i2 = ((iM45029 ^ i14) * 18151) ^ (-421440308);
                        i3 = -191000787;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i4 = i22;
                        strM7604 = str;
                        textView = textView2;
                        sArr = sArr2;
                        iM450211 = C19806.m45029("ᩳܽ") ^ i14;
                        i8 = ((iM450211 ^ i15) * (-2255)) ^ 306030693;
                        i7 = -1915548633;
                        int i25 = iM450211 ^ i7;
                        sArr2 = sArr;
                        textView2 = textView;
                        str = strM7604;
                        i16 = i8;
                        i9 = i4;
                        i17 = i25;
                        i22 = i9;
                    }
                    break;
                case -1382408910:
                case 1640755915:
                    ActivityC11736.m29346(activityC11736, i22, new RunnableC19228(this));
                    break;
                case -1345963483:
                case -1105770818:
                    CallableC1627.m5507();
                    C2249.m6915();
                    i = i22;
                    iM11308 = C19806.m45029("֫ܳ") ^ i14;
                    i10 = ((iM11308 ^ i15) * (-11927)) ^ 1249801259;
                    i13 = 556435880;
                    i12 = iM11308 ^ i13;
                    i9 = i;
                    i17 = i12;
                    i16 = i10;
                    i22 = i9;
                    break;
                case -917714837:
                case 417809368:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i15 - C19806.m45029("ܽ᩸")) * (-53);
                        i2 = ((iM45029 ^ i14) * (-9537)) ^ (-618296539);
                        i3 = 1610178996;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i14;
                        i2 = ((iM45029 ^ i15) * (-16419)) ^ (-1883131345);
                        i3 = -592632071;
                    }
                    i17 = iM45029 ^ i3;
                    i16 = i2;
                    break;
                case -879213719:
                case 1171433153:
                    C2788.m8479(c8067, iM450212);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۡۙۘ

                        /* JADX INFO: renamed from: ᩵֫᩺, reason: not valid java name and contains not printable characters */
                        private static final short[] f29821 = {3238, -7605, 6547, 4737, -2315, -2771, 888};

                        /* JADX WARN: Code duplicated, block: B:25:0x00b4 A[PHI: r3
                          0x00b4: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:87:0x00b4, B:24:0x00b2, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:37:0x013a A[PHI: r2 r4 r5 r14 r15
                          0x013a: PHI (r2v5 int) = (r2v4 int), (r2v2 int), (r2v2 int) binds: [B:36:0x0138, B:32:0x0111, B:28:0x00ee] A[DONT_GENERATE, DONT_INLINE]
                          0x013a: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:36:0x0138, B:32:0x0111, B:28:0x00ee] A[DONT_GENERATE, DONT_INLINE]
                          0x013a: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:36:0x0138, B:32:0x0111, B:28:0x00ee] A[DONT_GENERATE, DONT_INLINE]
                          0x013a: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:36:0x0138, B:32:0x0111, B:28:0x00ee] A[DONT_GENERATE, DONT_INLINE]
                          0x013a: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:36:0x0138, B:32:0x0111, B:28:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:56:0x021e A[PHI: r8 r9
                          0x021e: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:55:0x021c, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
                          0x021e: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:55:0x021c, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:60:0x0251 A[PHI: r7 r11 r12 r13
                          0x0251: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:89:0x0251, B:59:0x024f, B:40:0x0170, B:17:0x0079, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
                          0x0251: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:89:0x0251, B:59:0x024f, B:40:0x0170, B:17:0x0079, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
                          0x0251: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:89:0x0251, B:59:0x024f, B:40:0x0170, B:17:0x0079, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
                          0x0251: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:89:0x0251, B:59:0x024f, B:40:0x0170, B:17:0x0079, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i26) {
                            short[] sArr8;
                            int iM450216;
                            int i27;
                            int i28;
                            int iM113010;
                            int i29;
                            int i30 = C10634.f36300;
                            int i31 = C0050.f912;
                            int iM450217 = (C19806.m45029("᩸᩵") ^ i30) * (-21);
                            int i32 = ((iM450217 ^ i31) * 4791) ^ (-1985736151);
                            String strM5682 = null;
                            short[] sArr9 = null;
                            short[] sArr10 = null;
                            short[] sArr11 = null;
                            int i33 = iM450217 ^ (-1182319153);
                            C19934 c19934 = null;
                            int iM113011 = 0;
                            int iM113012 = 0;
                            int i34 = 0;
                            short s2 = 0;
                            int i35 = 0;
                            int i36 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = -1939519174;
                            while (true) {
                                i41 = i33 ^ (i32 & (((i41 ^ i31) * 4511) >> 31));
                                switch (i41) {
                                    case -1883672236:
                                    case 775093049:
                                        i35 = s2 * 27938;
                                        i36 = s2 * s2;
                                        if (C0797.f3386) {
                                            iM450216 = C19806.m45029("۠ۤ") ^ i30;
                                            i27 = ((iM450216 ^ i31) * 10157) ^ (-1573826332);
                                            i28 = 422918863;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("ᩳۙ") + i30) * (-21);
                                            i27 = ((iM450216 ^ i31) * 21801) ^ 134309445;
                                            i28 = 1697768130;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -1748788208:
                                    case -969187954:
                                        C0817.m3399();
                                        if (C1460.f5948 < 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("֡ۜ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * (-7135)) ^ 1045399281;
                                            i28 = -1472741284;
                                        } else {
                                            iM450216 = C19806.m45029("۠ۤ") ^ i30;
                                            i27 = ((iM450216 ^ i31) * 10157) ^ (-1573826332);
                                            i28 = 422918863;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -1506731360:
                                    case 1893203416:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("֡ۜ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * (-7135)) ^ 1045399281;
                                            i28 = -1472741284;
                                            i33 = iM450216 ^ i28;
                                            i32 = i27;
                                        } else {
                                            sArr8 = sArr9;
                                            iM113010 = (ThreadFactoryC3888.m11306("ܶ᩷") ^ i30) * (-35);
                                            sArr9 = sArr8;
                                            i32 = ((iM113010 ^ i31) * (-28203)) ^ 1877843260;
                                            i29 = 1571178242;
                                            i33 = iM113010 ^ i29;
                                        }
                                        break;
                                    case -1327314324:
                                    case -1301047404:
                                        iM113011 = 2097777386 ^ ThreadFactoryC3888.m11306(C3577.m10571(sArr10, i38, i39, i37));
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM450216 = C19806.m45029("ܶۖ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * 22289) ^ (-92339883);
                                            i28 = -1439122100;
                                        } else {
                                            iM450216 = (C19806.m45029("۬ܰ") + i31) * (-81);
                                            i27 = ((iM450216 ^ i30) * 26937) ^ 1006565676;
                                            i28 = 1912387641;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -1076790432:
                                    case 1582561538:
                                        sArr10 = f29821;
                                        i38 = 1;
                                        i39 = 3;
                                        if (C0278.m1789() <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۤܰ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * (-6747)) ^ 664269294;
                                            i28 = 1513844314;
                                        } else {
                                            iM450216 = (C19806.m45029("ۢᩴ") ^ i31) * 95;
                                            i27 = ((iM450216 ^ i30) * 21533) ^ 1383836236;
                                            i28 = -239973445;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -1076537216:
                                    case -285181431:
                                        C0278.m1789();
                                        C2124.m6673();
                                        iM450216 = ThreadFactoryC3888.m11306("ۤܰ") ^ i31;
                                        i27 = ((iM450216 ^ i30) * (-6747)) ^ 664269294;
                                        i28 = 1513844314;
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -930606524:
                                    case 1542761236:
                                        i37 = 49961;
                                        iM450216 = (i31 - ThreadFactoryC3888.m11306("֫᩷")) * 51;
                                        i27 = ((iM450216 ^ i30) * (-4743)) ^ (-290966909);
                                        i28 = 273407885;
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -729391693:
                                    case -304520067:
                                        sArr8 = f29821;
                                        if (C0216.m1591() <= 0) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ܶ᩷") ^ i30) * (-35);
                                            sArr9 = sArr8;
                                            i32 = ((iM113010 ^ i31) * (-28203)) ^ 1877843260;
                                            i29 = 1571178242;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۜۤ") + i30) * 59;
                                            sArr9 = sArr8;
                                            i32 = ((iM113010 ^ i31) * 3245) ^ 1389343405;
                                            i29 = -369811373;
                                        }
                                        i33 = iM113010 ^ i29;
                                        break;
                                    case -708142195:
                                    case 1940168742:
                                        i37 = 27056;
                                        iM450216 = (i31 - ThreadFactoryC3888.m11306("֫᩷")) * 51;
                                        i27 = ((iM450216 ^ i30) * (-4743)) ^ (-290966909);
                                        i28 = 273407885;
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -530334426:
                                    case -467800860:
                                        C2642.m8171();
                                        if (C3535.m10431() > 0) {
                                            sArr8 = sArr9;
                                            iM113010 = (ThreadFactoryC3888.m11306("ܶ᩷") ^ i30) * (-35);
                                            sArr9 = sArr8;
                                            i32 = ((iM113010 ^ i31) * (-28203)) ^ 1877843260;
                                            i29 = 1571178242;
                                            i33 = iM113010 ^ i29;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۤܰ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * (-6747)) ^ 664269294;
                                            i28 = 1513844314;
                                            i33 = iM450216 ^ i28;
                                            i32 = i27;
                                        }
                                        break;
                                    case -434978097:
                                    case -393782798:
                                        c19934.m40376(iM113011);
                                        sArr11 = f29821;
                                        i40 = 4;
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450216 = (C19806.m45029("۬ܰ") + i31) * (-81);
                                            i27 = ((iM450216 ^ i30) * 26937) ^ 1006565676;
                                            i28 = 1912387641;
                                        } else {
                                            iM450216 = C19806.m45029("ܽ᩺") ^ i30;
                                            i27 = ((iM450216 ^ i31) * (-28561)) ^ 277870261;
                                            i28 = -348844256;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -295908713:
                                    case 2120251188:
                                        c19934.m40355();
                                        c19934.m40368(true);
                                        break;
                                    case -273816238:
                                    case 381750085:
                                        s2 = sArr9[0];
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM450216 = C19806.m45029("᩵ۘ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * 29219) ^ (-758752916);
                                            i28 = -1013918796;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۤܰ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * (-6747)) ^ 664269294;
                                            i28 = 1513844314;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case -32119217:
                                    case 370223989:
                                        C2642.m8171();
                                        break;
                                    case 828545593:
                                    case 1512175780:
                                        if ((195132961 + i36) - i35 >= 0) {
                                            iM450216 = (C19806.m45029("ܽ֫") ^ i31) * 15;
                                            i27 = ((iM450216 ^ i30) * (-20131)) ^ 397560003;
                                            i28 = 98164421;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("۟ۘ") ^ i30) * (-113);
                                            i27 = ((iM450216 ^ i31) * (-14101)) ^ (-1552501953);
                                            i28 = -186723974;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case 1008713464:
                                    case 2009498965:
                                        ActivityC11736 activityC11737 = this.f29822.f67207;
                                        boolean z = ActivityC11736.f39454;
                                        C19934 c19935 = new C19934(activityC11737, activityC11737);
                                        if (RunnableC0195.f1321 >= 0) {
                                            sArr8 = sArr9;
                                            c19934 = c19935;
                                            iM113010 = (ThreadFactoryC3888.m11306("ܶ᩷") ^ i30) * (-35);
                                            sArr9 = sArr8;
                                            i32 = ((iM113010 ^ i31) * (-28203)) ^ 1877843260;
                                            i29 = 1571178242;
                                            i33 = iM113010 ^ i29;
                                        } else {
                                            int iM113013 = (i30 - ThreadFactoryC3888.m11306("ۢܽ")) * 43;
                                            i32 = ((iM113013 ^ i31) * 29373) ^ 1749620837;
                                            i33 = iM113013 ^ 1273147122;
                                            c19934 = c19935;
                                        }
                                        break;
                                    case 1051867377:
                                    case 2069164947:
                                        c19934.m40363(iM113012 ^ i34);
                                        strM5682 = C1709.m5682();
                                        if (RunnableC1564.m5345()) {
                                            iM450216 = ThreadFactoryC3888.m11306("֡ۜ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * (-7135)) ^ 1045399281;
                                            i28 = -1472741284;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۜ۟") ^ i31;
                                            i27 = ((iM450216 ^ i30) * 5003) ^ (-860697881);
                                            i28 = 107386420;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    case 1329535736:
                                    case 1412499862:
                                        iM113012 = ThreadFactoryC3888.m11306(C2871.m8640(sArr11, i40, 3, i37));
                                        i34 = 2105229717;
                                        if (C1668.f6641 >= 0) {
                                            iM450216 = (C19806.m45029("۬ܰ") + i31) * (-81);
                                            i27 = ((iM450216 ^ i30) * 26937) ^ 1006565676;
                                            i28 = 1912387641;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("ۜ᩶") + i30) * (-101);
                                            i27 = ((iM450216 ^ i31) * (-26773)) ^ (-1336156242);
                                            i28 = -1676137354;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                    default:
                                        c19934.m40346((CharSequence) strM5682);
                                        c19934.m40340();
                                        c19934.m40336(6);
                                        if (C2249.f8050 >= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۤܰ") ^ i31;
                                            i27 = ((iM450216 ^ i30) * (-6747)) ^ 664269294;
                                            i28 = 1513844314;
                                        } else {
                                            iM450216 = (i30 - C19806.m45029("ܶۗ")) * 25;
                                            i27 = ((iM450216 ^ i31) * (-21617)) ^ 1683475540;
                                            i28 = -653897266;
                                        }
                                        i33 = iM450216 ^ i28;
                                        i32 = i27;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr4 = f67206;
                    if (C7105.f23796 < 0) {
                        iM45029 = C19806.m45029("۟ܰ") ^ i14;
                        i2 = ((iM45029 ^ i15) * (-14745)) ^ (-37230050);
                        i3 = -175697047;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i4 = i22;
                        strM7604 = str;
                        textView = textView2;
                        sArr = sArr2;
                        iM450211 = C19806.m45029("ᩳܽ") ^ i14;
                        i8 = ((iM450211 ^ i15) * (-2255)) ^ 306030693;
                        i7 = -1915548633;
                        int i26 = iM450211 ^ i7;
                        sArr2 = sArr;
                        textView2 = textView;
                        str = strM7604;
                        i16 = i8;
                        i9 = i4;
                        i17 = i26;
                        i22 = i9;
                    }
                    break;
                case -770918207:
                case 1833803870:
                    i22 = i22;
                    textView2 = textView2;
                    sArr2 = sArr2;
                    s = f67206[0];
                    i20 = s * s;
                    if (C0278.m1789() <= 0) {
                        iM11306 = C19806.m45029("ܿ֨") ^ i15;
                        i16 = ((iM11306 ^ i14) * 20731) ^ (-1330921713);
                        i5 = 2103151871;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡֫") ^ i14) * (-59);
                        i16 = ((iM11306 ^ i15) * 18931) ^ 1687654956;
                        i5 = 2044990018;
                    }
                    int i27 = iM11306 ^ i5;
                    sArr2 = sArr2;
                    i22 = i22;
                    i17 = i27;
                    textView2 = textView2;
                    this = this;
                    break;
                case -556054248:
                case 2138819471:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i15 - C19806.m45029("ܽ᩸")) * (-53);
                        i2 = ((iM45029 ^ i14) * (-9537)) ^ (-618296539);
                        i3 = 1610178996;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i = i22;
                        iM11308 = C19806.m45029("֫ܳ") ^ i14;
                        i10 = ((iM11308 ^ i15) * (-11927)) ^ 1249801259;
                        i13 = 556435880;
                        i12 = iM11308 ^ i13;
                        i9 = i;
                        i17 = i12;
                        i16 = i10;
                        i22 = i9;
                    }
                    break;
                case -491951057:
                case 188513276:
                    i4 = i22;
                    sArr = sArr2;
                    textView = activityC11736.f39461;
                    strM7604 = C2477.m7604(f67206, 1, 3, i19);
                    if (C2871.f10837 >= 0) {
                        iM450211 = C19806.m45029("ᩳܽ") ^ i14;
                        i8 = ((iM450211 ^ i15) * (-2255)) ^ 306030693;
                        i7 = -1915548633;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ۤ᩷") ^ i15) * 95;
                        i8 = ((iM450211 ^ i14) * 20579) ^ 1358477907;
                        i7 = -1746465517;
                    }
                    int i28 = iM450211 ^ i7;
                    sArr2 = sArr;
                    textView2 = textView;
                    str = strM7604;
                    i16 = i8;
                    i9 = i4;
                    i17 = i28;
                    i22 = i9;
                    break;
                case 57443281:
                case 1687950529:
                    TextView textView4 = textView2;
                    sArr2 = sArr2;
                    activityC11736 = this.f67207;
                    int i29 = activityC11736.f39460;
                    i22 = this.f67208;
                    if (i22 != i29) {
                        int iM113010 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i14;
                        i17 = iM113010 ^ (-1661786183);
                        i16 = ((iM113010 ^ i15) * (-22161)) ^ 345017122;
                    } else {
                        int iM450216 = (C19806.m45029("ܺᩴ") ^ i14) * (-101);
                        i16 = ((iM450216 ^ i15) * (-24053)) ^ 1842919372;
                        i17 = iM450216 ^ (-1102512132);
                    }
                    textView2 = textView4;
                    break;
                case 95613020:
                case 772137310:
                    C2477.m7593();
                    if (C2249.m6915() > 0) {
                        i22 = i22;
                        textView2 = textView2;
                        sArr2 = sArr2;
                        iM11306 = C19806.m45029("ܿ֨") ^ i15;
                        i16 = ((iM11306 ^ i14) * 20731) ^ (-1330921713);
                        i5 = 2103151871;
                        int i210 = iM11306 ^ i5;
                        sArr2 = sArr2;
                        i22 = i22;
                        i17 = i210;
                        textView2 = textView2;
                        this = this;
                    } else {
                        i = i22;
                        iM11308 = C19806.m45029("֫ܳ") ^ i14;
                        i10 = ((iM11308 ^ i15) * (-11927)) ^ 1249801259;
                        i13 = 556435880;
                        i12 = iM11308 ^ i13;
                        i9 = i;
                        i17 = i12;
                        i16 = i10;
                        i22 = i9;
                    }
                    break;
                case 108913787:
                case 1095054473:
                    i = i22;
                    int i30 = DialogInterfaceC19356.f62401;
                    c8067 = new C8067(activityC11736);
                    sArr2 = f67206;
                    if (CallableC1627.f6528) {
                        iM11308 = (i14 - ThreadFactoryC3888.m11306("۫ᩳ")) * 91;
                        i10 = ((iM11308 ^ i15) * (-5151)) ^ 906439933;
                        i13 = 1317415125;
                    } else {
                        iM11308 = C19806.m45029("֫ܳ") ^ i14;
                        i10 = ((iM11308 ^ i15) * (-11927)) ^ 1249801259;
                        i13 = 556435880;
                    }
                    i12 = iM11308 ^ i13;
                    i9 = i;
                    i17 = i12;
                    i16 = i10;
                    i22 = i9;
                    break;
                case 621636704:
                case 1783355867:
                    iM450212 = 2118326511 ^ C19806.m45029(C3722.m10901(sArr3, 7, 3, i19));
                    if (C1937.m6279() < 0) {
                        iM45029 = C19806.m45029("ᩳ᩹") ^ i14;
                        i2 = ((iM45029 ^ i15) * (-12749)) ^ 1054304905;
                        i3 = -435929356;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i = i22;
                        iM11308 = C19806.m45029("֫ܳ") ^ i14;
                        i10 = ((iM11308 ^ i15) * (-11927)) ^ 1249801259;
                        i13 = 556435880;
                        i12 = iM11308 ^ i13;
                        i9 = i;
                        i17 = i12;
                        i16 = i10;
                        i22 = i9;
                    }
                    break;
                case 931478304:
                case 1757549311:
                    i19 = 23865;
                    iM11306 = (C19806.m45029("᩶᩶") + i14) * 65;
                    i16 = ((iM11306 ^ i15) * (-31501)) ^ (-1674874761);
                    i5 = -1722881534;
                    int i211 = iM11306 ^ i5;
                    sArr2 = sArr2;
                    i22 = i22;
                    i17 = i211;
                    textView2 = textView2;
                    this = this;
                    break;
                case 1059455364:
                case 2028922203:
                    break;
                case 1144413279:
                case 1290416986:
                    int i31 = i22;
                    TextView textView5 = textView2;
                    short[] sArr8 = sArr2;
                    int i32 = i20;
                    short s2 = s;
                    if ((i32 + 4489) - (s2 * 134) >= 0) {
                        iM450210 = C19806.m45029("ۧۛ") ^ i15;
                        i16 = ((iM450210 ^ i14) * (-27153)) ^ 358681176;
                        i6 = 1379520154;
                    } else {
                        iM450210 = C19806.m45029("ۨܰ") ^ i15;
                        i16 = ((iM450210 ^ i14) * (-15535)) ^ 303026293;
                        i6 = 1190481845;
                    }
                    int i33 = iM450210 ^ i6;
                    i20 = i32;
                    sArr2 = sArr8;
                    s = s2;
                    textView2 = textView5;
                    i22 = i31;
                    i17 = i33;
                    this = this;
                    break;
                default:
                    C1377.m4836(c8067, ThreadFactoryC3888.m11306(strM26821) ^ 2126525343);
                    sArr3 = f67206;
                    if (C0962.f3784) {
                        iM45029 = (i15 - C19806.m45029("ܽ᩸")) * (-53);
                        i2 = ((iM45029 ^ i14) * (-9537)) ^ (-618296539);
                        i3 = 1610178996;
                    } else {
                        iM45029 = (i15 - C19806.m45029("۠ۡ")) * (-25);
                        i2 = ((iM45029 ^ i14) * 1533) ^ 1719961683;
                        i3 = 2063509888;
                    }
                    i17 = iM45029 ^ i3;
                    i16 = i2;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        C21947 c21947;
        int iM450210;
        int i5;
        int i6;
        int i7;
        int i8;
        short[] sArr;
        int i9;
        JSONArray jSONArray;
        String str;
        int i10;
        int i11;
        short[] sArr2;
        short[] sArr3;
        int i12;
        int iM11307;
        int i13;
        int iM450211;
        int i14;
        int iM11308;
        int i15;
        int i16;
        int iM450212;
        int i17;
        int i18;
        String str2;
        int i19;
        short[] sArr4;
        int i20;
        short[] sArr5;
        int i21;
        int i22;
        short[] sArr6;
        JSONArray jSONArray2;
        int iM11309;
        int i23;
        int i24;
        JSONObject jSONObject;
        short[] sArr7;
        String str3;
        JSONArray jSONArray3;
        int iM113010;
        int i25;
        int i26;
        int i27;
        String str4;
        short[] sArr8;
        int i28;
        String str5;
        int i29;
        short[] sArr9;
        int i30;
        int i31 = 0;
        int i32 = 2131805929;
        int i33 = C10634.f36300;
        int i34 = C0629.f2722;
        int iM450213 = C19806.m45029("֨ܽ") ^ i33;
        int i35 = ((iM450213 ^ i34) * 29251) ^ 1670967175;
        int i36 = iM450213 ^ (-890578083);
        C21947 c21948 = null;
        C21947 c21947M13910 = null;
        String strM4040 = null;
        ArrayList arrayList = null;
        String strM4969 = null;
        String strM3361 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        String str6 = null;
        int i40 = 0;
        int i41 = 0;
        short s = 0;
        JSONObject jSONObjectM48779 = null;
        JSONArray jSONArray4 = null;
        String strM5502 = null;
        String strM6105 = null;
        short[] sArr13 = null;
        int i42 = 0;
        int iM3005 = 0;
        int i43 = 0;
        C18419 c18419 = null;
        JSONObject jSONObject2 = null;
        int i44 = 0;
        while (true) {
            i32 = i36 ^ (i35 & (((i32 ^ i34) * (-16895)) >> 31));
            switch (i32) {
                case -2076572629:
                case -603788015:
                    i37 = i37;
                    strM3361 = strM3361;
                    c18419.m42724(C0671.m3005(jSONObject2, RunnableC1895.m6164(sArr12, i38, 11, i42)));
                    strM5502 = CallableC1627.m5502(f67206, 88, 11, i42);
                    if (C0216.m1591() > 0) {
                        iM11307 = (C19806.m45029("᩺᩶") ^ i33) * 119;
                        i3 = ((iM11307 ^ i34) * 32473) ^ (-1144183726);
                        i13 = -1543719539;
                        i8 = iM11307 ^ i13;
                        strM3361 = strM3361;
                        i36 = i8;
                        i35 = i3;
                        i37 = i37;
                    } else {
                        str = str6;
                        i10 = i40;
                        i11 = i41;
                        sArr2 = sArr11;
                        int i45 = i39;
                        sArr = sArr12;
                        sArr3 = sArr10;
                        i9 = i38;
                        jSONArray = jSONArray4;
                        i12 = i45;
                        int iM450214 = C19806.m45029("ۨ᩶") ^ i34;
                        i40 = i10;
                        int i46 = ((iM450214 ^ i33) * (-26229)) ^ 157178274;
                        sArr11 = sArr2;
                        i41 = i11;
                        strM3361 = strM3361;
                        i36 = iM450214 ^ (-862680998);
                        str6 = str;
                        i35 = i46;
                        i37 = i37;
                        int i47 = i9;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        i39 = i12;
                        jSONArray4 = jSONArray;
                        i38 = i47;
                    }
                    break;
                case -2045125126:
                case -650447934:
                    i37 = i37;
                    strM3361 = strM3361;
                    c21947 = c21948;
                    i41 = i41;
                    sArr11 = sArr11;
                    strM4040 = strM4040;
                    jSONArray4 = jSONArray4;
                    i43 = i43;
                    jSONObjectM48779 = jSONObjectM48779;
                    sArr10 = sArr10;
                    str6 = str6;
                    i38 = i38;
                    i39 = i39;
                    sArr12 = sArr12;
                    int i48 = C14892.f48653;
                    C5013 c5013M13902 = C5013.m13902(C0050.m940(f67206, 25, 16, i42));
                    c5013M13902.m13904();
                    c21947M13910 = c5013M13902.m13910();
                    if (c21947M13910.m48774()) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܽ᩷") ^ i34) * 73;
                        i5 = ((iM450210 ^ i33) * 1333) ^ (-654872726);
                        i6 = -1664479959;
                    } else {
                        iM450210 = C19806.m45029("᩹ۨ") ^ i34;
                        i5 = ((iM450210 ^ i33) * (-2657)) ^ 1552938697;
                        i6 = -1371025853;
                    }
                    i7 = iM450210 ^ i6;
                    i38 = i38;
                    sArr10 = sArr10;
                    i43 = i43;
                    jSONArray4 = jSONArray4;
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = i7;
                    i35 = i5;
                    sArr12 = sArr12;
                    i39 = i39;
                    str6 = str6;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM4040 = strM4040;
                    c21948 = c21947;
                    i37 = i37;
                    break;
                case -2031254855:
                case -1915244075:
                    int i49 = i37;
                    String str7 = strM3361;
                    C21947 c21949 = c21948;
                    int i50 = i41;
                    short[] sArr14 = sArr11;
                    String str8 = strM4040;
                    JSONArray jSONArray5 = jSONArray4;
                    int i51 = i43;
                    JSONObject jSONObject3 = jSONObjectM48779;
                    short[] sArr15 = sArr10;
                    String str9 = str6;
                    int i52 = i38;
                    int i53 = i39;
                    short[] sArr16 = sArr12;
                    short s2 = s;
                    if ((s2 * 5562) - (i31 + 7733961) > 0) {
                        iM11308 = (C19806.m45029("ۛᩴ") ^ i33) * (-115);
                        i15 = ((iM11308 ^ i34) * (-125)) ^ (-2053580193);
                        i16 = -734590947;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("᩻᩵") ^ i33) * (-39);
                        i15 = ((iM11308 ^ i34) * (-18825)) ^ 744790424;
                        i16 = -464008741;
                    }
                    int i54 = iM11308 ^ i16;
                    s = s2;
                    i37 = i49;
                    i38 = i52;
                    sArr10 = sArr15;
                    i43 = i51;
                    jSONArray4 = jSONArray5;
                    sArr11 = sArr14;
                    i41 = i50;
                    strM3361 = str7;
                    i36 = i54;
                    i35 = i15;
                    sArr12 = sArr16;
                    i39 = i53;
                    str6 = str9;
                    jSONObjectM48779 = jSONObject3;
                    strM4040 = str8;
                    c21948 = c21949;
                    break;
                case -1949274750:
                case 815100912:
                    return;
                case -1873463661:
                case -1366831399:
                    RunnableC0195.m1431();
                    if (C1148.m4232() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷۠") ^ i33) * 33;
                        i = ((iM11306 ^ i34) * (-29389)) ^ 60409847;
                        i2 = 1138672706;
                        i36 = iM11306 ^ i2;
                        i35 = i;
                    } else {
                        i37 = i37;
                        strM3361 = strM3361;
                        iM11307 = ThreadFactoryC3888.m11306("ۗ᩶") ^ i33;
                        i3 = ((iM11307 ^ i34) * 19811) ^ 39954483;
                        i13 = 1898031957;
                        i8 = iM11307 ^ i13;
                        strM3361 = strM3361;
                        i36 = i8;
                        i35 = i3;
                        i37 = i37;
                    }
                    break;
                case -1811873093:
                case -1725389976:
                    i37 = i37;
                    sArr = sArr12;
                    i9 = i38;
                    strM3361 = strM3361;
                    jSONArray = jSONArray4;
                    str = str6;
                    i10 = i40;
                    i11 = i41;
                    sArr2 = sArr11;
                    jSONObject2 = jSONArray.getJSONObject(i44);
                    c18419 = new C18419();
                    c18419.m42737(C2190.m6805());
                    sArr3 = f67206;
                    i43 = 55;
                    i12 = 3;
                    if (C3660.f13403 < 0) {
                        i40 = i10;
                        int iM113011 = (ThreadFactoryC3888.m11306("ܳۤ") + i34) * 93;
                        jSONArray4 = jSONArray;
                        i38 = i9;
                        sArr10 = sArr3;
                        sArr11 = sArr2;
                        str6 = str;
                        i35 = ((iM113011 ^ i33) * 28621) ^ 1954255913;
                        i41 = i11;
                        sArr12 = sArr;
                        strM3361 = strM3361;
                        i39 = 3;
                        i36 = iM113011 ^ (-1578480994);
                        i37 = i37;
                    } else {
                        int iM450215 = C19806.m45029("ۨ᩶") ^ i34;
                        i40 = i10;
                        int i410 = ((iM450215 ^ i33) * (-26229)) ^ 157178274;
                        sArr11 = sArr2;
                        i41 = i11;
                        strM3361 = strM3361;
                        i36 = iM450215 ^ (-862680998);
                        str6 = str;
                        i35 = i410;
                        i37 = i37;
                        int i411 = i9;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        i39 = i12;
                        jSONArray4 = jSONArray;
                        i38 = i411;
                    }
                    break;
                case -1782178303:
                case -796612044:
                    throw new Exception(c21948.m48781());
                case -1621664715:
                case 1569948664:
                    int i55 = i37;
                    String str10 = strM3361;
                    String str11 = strM4040;
                    int i56 = i41;
                    short[] sArr17 = sArr11;
                    JSONObject jSONObject4 = jSONObjectM48779;
                    JSONArray jSONArray6 = jSONArray4;
                    int i57 = i43;
                    String str12 = str6;
                    int i58 = i39;
                    short[] sArr18 = sArr10;
                    short[] sArr19 = sArr12;
                    int i59 = i38;
                    C21947 c21947M35598 = C14892.m35598();
                    if (c21947M35598.m48774()) {
                        iM450212 = (i33 - C19806.m45029("֫֡")) * (-9);
                        i17 = ((iM450212 ^ i34) * (-19699)) ^ (-63127847);
                        i18 = -1478591260;
                    } else {
                        iM450212 = (C19806.m45029("ۖܰ") + i34) * (-23);
                        i17 = ((iM450212 ^ i33) * 4203) ^ 1251864343;
                        i18 = -1894174707;
                    }
                    int i60 = iM450212 ^ i18;
                    i38 = i59;
                    sArr10 = sArr18;
                    i43 = i57;
                    jSONArray4 = jSONArray6;
                    sArr11 = sArr17;
                    i41 = i56;
                    strM3361 = str10;
                    i36 = i60;
                    i37 = i55;
                    c21948 = c21947M35598;
                    i35 = i17;
                    sArr12 = sArr19;
                    i39 = i58;
                    str6 = str12;
                    jSONObjectM48779 = jSONObject4;
                    strM4040 = str11;
                    break;
                case -1438721065:
                case 1048386568:
                    i37 = i37;
                    strM3361 = C0797.m3361(f67206, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 13, i42);
                    if (jSONObject2.has(strM3361)) {
                        iM450211 = C19806.m45029("ܿۚ") ^ i33;
                        i3 = ((iM450211 ^ i34) * (-31319)) ^ (-2062476620);
                        i14 = 1124920742;
                    } else {
                        iM450211 = C19806.m45029("ܿ᩻") ^ i34;
                        i3 = ((iM450211 ^ i33) * 21761) ^ (-802089293);
                        i14 = -176712846;
                    }
                    i36 = iM450211 ^ i14;
                    i35 = i3;
                    i37 = i37;
                    break;
                case -1377344172:
                case -505153809:
                    if (!C0817.m3399()) {
                        iM11306 = (C19806.m45029("۟ۤ") + i34) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i33) * (-19121)) ^ (-1957073053);
                        i2 = 1046245646;
                        i36 = iM11306 ^ i2;
                        i35 = i;
                    } else {
                        i27 = i37;
                        str4 = strM3361;
                        sArr8 = sArr10;
                        i28 = i43;
                        str5 = str6;
                        i29 = i38;
                        int i61 = i39;
                        sArr9 = sArr12;
                        i30 = i61;
                        int iM113012 = (ThreadFactoryC3888.m11306("۟᩹") + i34) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        short[] sArr20 = sArr8;
                        str6 = str5;
                        i35 = ((iM113012 ^ i33) * 24477) ^ 1075399402;
                        i37 = i27;
                        short[] sArr21 = sArr9;
                        i39 = i30;
                        sArr12 = sArr21;
                        String str13 = str4;
                        i36 = iM113012 ^ (-148425706);
                        i38 = i29;
                        sArr10 = sArr20;
                        i43 = i28;
                        strM3361 = str13;
                    }
                    break;
                case -1376657646:
                case -696136804:
                    i37 = i37;
                    strM3361 = strM3361;
                    c21947 = c21948;
                    String str14 = str6;
                    i41 = i41;
                    sArr11 = sArr11;
                    jSONArray4 = jSONArray4;
                    i39 = i39;
                    i43 = i43;
                    sArr12 = sArr12;
                    String str15 = strM4040;
                    sArr10 = sArr10;
                    i38 = i38;
                    jSONObjectM48779 = jSONObjectM48779;
                    C2190.m6806(c21947.m48773(str14));
                    str6 = str14;
                    strM4040 = str15;
                    c21947.m48780(C1398.m4892(f67206, 46, 5, i42));
                    c21948 = c21947;
                    iM45029 = (i34 - C19806.m45029("֫᩹")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i3 = ((iM45029 ^ i33) * (-3157)) ^ 1870615850;
                    i4 = 56251451;
                    i8 = iM45029 ^ i4;
                    sArr12 = sArr12;
                    i38 = i38;
                    sArr10 = sArr10;
                    i39 = i39;
                    str6 = str6;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM4040 = strM4040;
                    i43 = i43;
                    jSONArray4 = jSONArray4;
                    c21948 = c21948;
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = i8;
                    i35 = i3;
                    i37 = i37;
                    break;
                case -1374150145:
                case 2056781012:
                    i27 = i37;
                    str4 = strM3361;
                    sArr8 = sArr10;
                    i28 = i43;
                    str5 = str6;
                    i29 = i38;
                    int i62 = i39;
                    sArr9 = sArr12;
                    i30 = i62;
                    c18419.m42730(C0671.m3005(jSONObject2, C1066.m4040(sArr8, i28, i30, i42)));
                    sArr11 = f67206;
                    i40 = 58;
                    i41 = 8;
                    if (C1977.f7413 <= 0) {
                        int iM113013 = (ThreadFactoryC3888.m11306("۟᩹") + i34) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        short[] sArr22 = sArr8;
                        str6 = str5;
                        i35 = ((iM113013 ^ i33) * 24477) ^ 1075399402;
                        i37 = i27;
                        short[] sArr23 = sArr9;
                        i39 = i30;
                        sArr12 = sArr23;
                        String str16 = str4;
                        i36 = iM113013 ^ (-148425706);
                        i38 = i29;
                        sArr10 = sArr22;
                        i43 = i28;
                        strM3361 = str16;
                    } else {
                        int iM450216 = (i33 - C19806.m45029("᩸᩵")) * (-115);
                        str6 = str5;
                        i35 = ((iM450216 ^ i34) * (-725)) ^ (-702280227);
                        i38 = i29;
                        sArr10 = sArr8;
                        i43 = i28;
                        strM3361 = str4;
                        i36 = iM450216 ^ 1555061441;
                        i37 = i27;
                        i39 = i30;
                        sArr12 = sArr9;
                    }
                    break;
                case -1301112605:
                case 790020094:
                    i37 = i37;
                    strM3361 = strM3361;
                    c18419.m42714(iM3005);
                    strM6105 = C1875.m6105(f67206, 108, 9, i42);
                    if (jSONObject2.has(strM6105)) {
                        iM11307 = C19806.m45029("ۧ۟") ^ i33;
                        i3 = ((iM11307 ^ i34) * 2051) ^ (-1668283740);
                        i13 = -223711873;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶ۬") + i34) * 29;
                        i3 = ((iM11307 ^ i33) * (-11471)) ^ (-1314598794);
                        i13 = 230284698;
                    }
                    i8 = iM11307 ^ i13;
                    strM3361 = strM3361;
                    i36 = i8;
                    i35 = i3;
                    i37 = i37;
                    break;
                case -1260736688:
                case -1011356232:
                    i37 = i37;
                    strM3361 = strM3361;
                    c18419.m42720(RunnableC1606.m5479(jSONObject2, C2249.m6918(sArr13, i37, 11, i42)));
                    sArr12 = f67206;
                    i38 = 77;
                    if (!C19806.f63586) {
                        iM11307 = ThreadFactoryC3888.m11306("֫᩵") ^ i33;
                        i3 = ((iM11307 ^ i34) * 3255) ^ 399043625;
                        i13 = 1661393744;
                        i8 = iM11307 ^ i13;
                        strM3361 = strM3361;
                        i36 = i8;
                        i35 = i3;
                        i37 = i37;
                    } else {
                        c21947 = c21948;
                        i41 = i41;
                        sArr11 = sArr11;
                        strM4040 = strM4040;
                        jSONArray4 = jSONArray4;
                        i43 = i43;
                        jSONObjectM48779 = jSONObjectM48779;
                        sArr10 = sArr10;
                        str6 = str6;
                        i39 = i39;
                        int iM450217 = (C19806.m45029("ۜ۬") + i33) * (-65);
                        sArr12 = sArr12;
                        i5 = ((iM450217 ^ i34) * (-7541)) ^ 1110549313;
                        i7 = iM450217 ^ (-788273252);
                        sArr10 = sArr10;
                        i43 = i43;
                        jSONArray4 = jSONArray4;
                        sArr11 = sArr11;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = i7;
                        i35 = i5;
                        sArr12 = sArr12;
                        i39 = i39;
                        str6 = str6;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM4040 = strM4040;
                        c21948 = c21947;
                        i37 = i37;
                    }
                    break;
                case -1241922035:
                case 1303268812:
                    i37 = i37;
                    strM3361 = strM3361;
                    c18419.m42744(RunnableC1606.m5479(jSONObject2, strM6105));
                    iM11307 = (ThreadFactoryC3888.m11306("ܶ۬") + i34) * 29;
                    i3 = ((iM11307 ^ i33) * (-11471)) ^ (-1314598794);
                    i13 = 230284698;
                    i8 = iM11307 ^ i13;
                    strM3361 = strM3361;
                    i36 = i8;
                    i35 = i3;
                    i37 = i37;
                    break;
                case -1214919923:
                case 1476430735:
                    this.f67209 = arrayList;
                    return;
                case -1121245944:
                case 2047029025:
                    throw new C4987(c21947M13910.m48781());
                case -1093215453:
                case -805716221:
                    i37 = i37;
                    strM3361 = strM3361;
                    c21947 = c21948;
                    i41 = i41;
                    sArr11 = sArr11;
                    strM4040 = strM4040;
                    jSONArray4 = jSONArray4;
                    i43 = i43;
                    jSONObjectM48779 = jSONObjectM48779;
                    sArr10 = sArr10;
                    str6 = str6;
                    i38 = i38;
                    i39 = i39;
                    sArr12 = sArr12;
                    if (c21947.m48775() != 1000) {
                        iM450210 = (C19806.m45029("֨᩹") + i33) * (-61);
                        i5 = ((iM450210 ^ i34) * (-14893)) ^ 1814528357;
                        i6 = -296100427;
                        i7 = iM450210 ^ i6;
                        i38 = i38;
                        sArr10 = sArr10;
                        i43 = i43;
                        jSONArray4 = jSONArray4;
                        sArr11 = sArr11;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = i7;
                        i35 = i5;
                        sArr12 = sArr12;
                        i39 = i39;
                        str6 = str6;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM4040 = strM4040;
                        c21948 = c21947;
                        i37 = i37;
                    }
                    c21948 = c21947;
                    iM45029 = (i34 - C19806.m45029("֫᩹")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i3 = ((iM45029 ^ i33) * (-3157)) ^ 1870615850;
                    i4 = 56251451;
                    i8 = iM45029 ^ i4;
                    sArr12 = sArr12;
                    i38 = i38;
                    sArr10 = sArr10;
                    i39 = i39;
                    str6 = str6;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM4040 = strM4040;
                    i43 = i43;
                    jSONArray4 = jSONArray4;
                    c21948 = c21948;
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = i8;
                    i35 = i3;
                    i37 = i37;
                    break;
                case -1053673051:
                case -284689241:
                    i37 = i37;
                    strM3361 = strM3361;
                    c21947 = c21948;
                    i41 = i41;
                    sArr11 = sArr11;
                    strM4040 = strM4040;
                    jSONArray4 = jSONArray4;
                    i43 = i43;
                    jSONObjectM48779 = jSONObjectM48779;
                    sArr10 = sArr10;
                    str6 = str6;
                    i38 = i38;
                    i39 = i39;
                    sArr12 = sArr12;
                    C2190.m6803(true);
                    C2190.m6801(c21947.m48773(C0050.m940(f67206, 41, 5, i42)));
                    if (!C19806.f63586) {
                        iM450210 = ThreadFactoryC3888.m11306("۠ۢ") ^ i33;
                        i5 = ((iM450210 ^ i34) * (-12463)) ^ (-1637475021);
                        i6 = 318111611;
                        i7 = iM450210 ^ i6;
                        i38 = i38;
                        sArr10 = sArr10;
                        i43 = i43;
                        jSONArray4 = jSONArray4;
                        sArr11 = sArr11;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = i7;
                        i35 = i5;
                        sArr12 = sArr12;
                        i39 = i39;
                        str6 = str6;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM4040 = strM4040;
                        c21948 = c21947;
                        i37 = i37;
                    } else {
                        sArr12 = sArr12;
                        i38 = i38;
                        int iM450218 = (C19806.m45029("ۜ۬") + i33) * (-65);
                        sArr12 = sArr12;
                        i5 = ((iM450218 ^ i34) * (-7541)) ^ 1110549313;
                        i7 = iM450218 ^ (-788273252);
                        sArr10 = sArr10;
                        i43 = i43;
                        jSONArray4 = jSONArray4;
                        sArr11 = sArr11;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = i7;
                        i35 = i5;
                        sArr12 = sArr12;
                        i39 = i39;
                        str6 = str6;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM4040 = strM4040;
                        c21948 = c21947;
                        i37 = i37;
                    }
                    break;
                case -1047537657:
                case 1033286355:
                    int i63 = i37;
                    String str17 = strM3361;
                    String str18 = str6;
                    int i64 = i41;
                    short[] sArr24 = sArr11;
                    int i65 = i39;
                    short[] sArr25 = sArr12;
                    short[] sArr26 = sArr10;
                    int i66 = i38;
                    JSONArray jSONArray7 = jSONArray4;
                    int i67 = i43;
                    if (i44 < jSONArray7.length()) {
                        iM113010 = C19806.m45029("ܳܺ") ^ i33;
                        i25 = ((iM113010 ^ i34) * 28395) ^ (-1791183797);
                        i26 = 640465252;
                    } else {
                        iM113010 = (ThreadFactoryC3888.m11306("ۧۙ") + i34) * (-23);
                        i25 = ((iM113010 ^ i33) * (-7123)) ^ 364133419;
                        i26 = 417393673;
                    }
                    int i68 = iM113010 ^ i26;
                    sArr11 = sArr24;
                    i41 = i64;
                    strM3361 = str17;
                    i36 = i68;
                    i37 = i63;
                    str6 = str18;
                    i35 = i25;
                    sArr12 = sArr25;
                    i39 = i65;
                    jSONArray4 = jSONArray7;
                    i38 = i66;
                    sArr10 = sArr26;
                    i43 = i67;
                    break;
                case -836388543:
                case -620693758:
                    if (C2124.f7782 > 0) {
                        i37 = i37;
                        strM3361 = strM3361;
                        str2 = str6;
                        i19 = i41;
                        sArr4 = sArr11;
                        jSONArray2 = jSONArray4;
                        i20 = i39;
                        i22 = i43;
                        sArr5 = sArr12;
                        sArr6 = sArr10;
                        i21 = i38;
                        iM11309 = (C19806.m45029("֡֨") ^ i33) * (-63);
                        i23 = ((iM11309 ^ i34) * 16625) ^ 1342408371;
                        i24 = 1343574040;
                        int i69 = iM11309 ^ i24;
                        i38 = i21;
                        sArr10 = sArr6;
                        i43 = i22;
                        jSONArray4 = jSONArray2;
                        sArr11 = sArr4;
                        i41 = i19;
                        strM3361 = strM3361;
                        i36 = i69;
                        i37 = i37;
                        int i70 = i20;
                        str6 = str2;
                        i35 = i23;
                        sArr12 = sArr5;
                        i39 = i70;
                    } else {
                        i27 = i37;
                        str4 = strM3361;
                        sArr8 = sArr10;
                        i28 = i43;
                        str5 = str6;
                        i29 = i38;
                        int i610 = i39;
                        sArr9 = sArr12;
                        i30 = i610;
                        int iM113014 = (ThreadFactoryC3888.m11306("۟᩹") + i34) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        short[] sArr27 = sArr8;
                        str6 = str5;
                        i35 = ((iM113014 ^ i33) * 24477) ^ 1075399402;
                        i37 = i27;
                        short[] sArr28 = sArr9;
                        i39 = i30;
                        sArr12 = sArr28;
                        String str19 = str4;
                        i36 = iM113014 ^ (-148425706);
                        i38 = i29;
                        sArr10 = sArr27;
                        i43 = i28;
                        strM3361 = str19;
                    }
                    break;
                case -601712589:
                case 1125618906:
                    ThreadFactoryC3888.m11300();
                    i27 = i37;
                    str4 = strM3361;
                    sArr8 = sArr10;
                    i28 = i43;
                    str5 = str6;
                    i29 = i38;
                    int i611 = i39;
                    sArr9 = sArr12;
                    i30 = i611;
                    int iM113015 = (ThreadFactoryC3888.m11306("۟᩹") + i34) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    short[] sArr29 = sArr8;
                    str6 = str5;
                    i35 = ((iM113015 ^ i33) * 24477) ^ 1075399402;
                    i37 = i27;
                    short[] sArr210 = sArr9;
                    i39 = i30;
                    sArr12 = sArr210;
                    String str110 = str4;
                    i36 = iM113015 ^ (-148425706);
                    i38 = i29;
                    sArr10 = sArr29;
                    i43 = i28;
                    strM3361 = str110;
                    break;
                case -537155568:
                case -296038567:
                    C1377.m4833();
                    if (C10634.f36300 < 0) {
                        i37 = i37;
                        strM3361 = strM3361;
                        iM11307 = ThreadFactoryC3888.m11306("ۗ᩶") ^ i33;
                        i3 = ((iM11307 ^ i34) * 19811) ^ 39954483;
                        i13 = 1898031957;
                        i8 = iM11307 ^ i13;
                        strM3361 = strM3361;
                        i36 = i8;
                        i35 = i3;
                        i37 = i37;
                    } else {
                        i37 = i37;
                        strM3361 = strM3361;
                        str2 = str6;
                        i19 = i41;
                        sArr4 = sArr11;
                        jSONArray2 = jSONArray4;
                        i20 = i39;
                        i22 = i43;
                        sArr5 = sArr12;
                        sArr6 = sArr10;
                        i21 = i38;
                        iM11309 = (C19806.m45029("֡֨") ^ i33) * (-63);
                        i23 = ((iM11309 ^ i34) * 16625) ^ 1342408371;
                        i24 = 1343574040;
                        int i612 = iM11309 ^ i24;
                        i38 = i21;
                        sArr10 = sArr6;
                        i43 = i22;
                        jSONArray4 = jSONArray2;
                        sArr11 = sArr4;
                        i41 = i19;
                        strM3361 = strM3361;
                        i36 = i612;
                        i37 = i37;
                        int i71 = i20;
                        str6 = str2;
                        i35 = i23;
                        sArr12 = sArr5;
                        i39 = i71;
                    }
                    break;
                case -471961824:
                case 1257093317:
                    if (C1398.f5802 <= 0) {
                        i37 = i37;
                        strM3361 = strM3361;
                        c21948 = c21948;
                        i41 = i41;
                        sArr11 = sArr11;
                        strM4040 = strM4040;
                        jSONArray4 = jSONArray4;
                        i43 = i43;
                        jSONObjectM48779 = jSONObjectM48779;
                        sArr10 = sArr10;
                        str6 = str6;
                        i38 = i38;
                        i39 = i39;
                        sArr12 = sArr12;
                        iM45029 = (i34 - C19806.m45029("ۙᩳ")) * (-61);
                        i3 = ((iM45029 ^ i33) * (-9105)) ^ 1825664878;
                        i4 = 1760904865;
                        i8 = iM45029 ^ i4;
                        sArr12 = sArr12;
                        i38 = i38;
                        sArr10 = sArr10;
                        i39 = i39;
                        str6 = str6;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM4040 = strM4040;
                        i43 = i43;
                        jSONArray4 = jSONArray4;
                        c21948 = c21948;
                        sArr11 = sArr11;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = i8;
                        i35 = i3;
                        i37 = i37;
                    } else {
                        iM11306 = (C19806.m45029("۟ۤ") + i34) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i33) * (-19121)) ^ (-1957073053);
                        i2 = 1046245646;
                        i36 = iM11306 ^ i2;
                        i35 = i;
                    }
                    break;
                case -451108745:
                case 605382946:
                    i42 = 36316;
                    iM45029 = (i34 - C19806.m45029("۟᩺")) * 45;
                    i3 = ((iM45029 ^ i33) * 11975) ^ (-1881394298);
                    i4 = 405255717;
                    i8 = iM45029 ^ i4;
                    sArr12 = sArr12;
                    i38 = i38;
                    sArr10 = sArr10;
                    i39 = i39;
                    str6 = str6;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM4040 = strM4040;
                    i43 = i43;
                    jSONArray4 = jSONArray4;
                    c21948 = c21948;
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = i8;
                    i35 = i3;
                    i37 = i37;
                    break;
                case -434587478:
                case 1294198954:
                    c18419.m42719(jSONObject2.getLong(C1977.m6363(f67206, 130, 4, i42)));
                    C3660.m10788(arrayList, c18419);
                    i44++;
                    jSONObject = jSONObjectM48779;
                    str3 = strM4040;
                    jSONArray3 = jSONArray4;
                    sArr7 = sArr10;
                    int iM113016 = (ThreadFactoryC3888.m11306("ۤ۬") ^ i34) * (-87);
                    JSONObject jSONObject5 = jSONObject;
                    int i72 = ((iM113016 ^ i33) * 16257) ^ (-1093033965);
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = iM113016 ^ (-1530066389);
                    jSONObjectM48779 = jSONObject5;
                    strM4040 = str3;
                    sArr12 = sArr12;
                    i39 = i39;
                    str6 = str6;
                    i35 = i72;
                    i37 = i37;
                    jSONArray4 = jSONArray3;
                    i38 = i38;
                    sArr10 = sArr7;
                    i43 = i43;
                    break;
                case -414340501:
                case 1425987512:
                    jSONObject = jSONObjectM48779;
                    sArr7 = sArr10;
                    str3 = strM4040;
                    jSONArray3 = jSONObject.getJSONArray(str3);
                    arrayList = new ArrayList(jSONArray3.length());
                    i44 = 0;
                    int iM113017 = (ThreadFactoryC3888.m11306("ۤ۬") ^ i34) * (-87);
                    JSONObject jSONObject6 = jSONObject;
                    int i73 = ((iM113017 ^ i33) * 16257) ^ (-1093033965);
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = iM113017 ^ (-1530066389);
                    jSONObjectM48779 = jSONObject6;
                    strM4040 = str3;
                    sArr12 = sArr12;
                    i39 = i39;
                    str6 = str6;
                    i35 = i73;
                    i37 = i37;
                    jSONArray4 = jSONArray3;
                    i38 = i38;
                    sArr10 = sArr7;
                    i43 = i43;
                    break;
                case -345692029:
                case 236580216:
                    C3743.m10966();
                    return;
                case 25459282:
                case 289211649:
                    i42 = 38596;
                    iM45029 = (i34 - C19806.m45029("۟᩺")) * 45;
                    i3 = ((iM45029 ^ i33) * 11975) ^ (-1881394298);
                    i4 = 405255717;
                    i8 = iM45029 ^ i4;
                    sArr12 = sArr12;
                    i38 = i38;
                    sArr10 = sArr10;
                    i39 = i39;
                    str6 = str6;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM4040 = strM4040;
                    i43 = i43;
                    jSONArray4 = jSONArray4;
                    c21948 = c21948;
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = i8;
                    i35 = i3;
                    i37 = i37;
                    break;
                case 377032615:
                case 2040290980:
                    i37 = i37;
                    strM3361 = strM3361;
                    str2 = str6;
                    i19 = i41;
                    sArr4 = sArr11;
                    i20 = i39;
                    sArr5 = sArr12;
                    short[] sArr30 = sArr10;
                    i21 = i38;
                    JSONArray jSONArray8 = jSONArray4;
                    i22 = i43;
                    sArr6 = sArr30;
                    jSONObjectM48779 = c21947M13910.m48779();
                    jSONArray2 = jSONArray8;
                    strM4040 = C1066.m4040(f67206, 51, 4, i42);
                    if (C3743.m10966() <= 0) {
                        iM11309 = (C19806.m45029("֡֨") ^ i33) * (-63);
                        i23 = ((iM11309 ^ i34) * 16625) ^ 1342408371;
                        i24 = 1343574040;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i33;
                        i23 = ((iM11309 ^ i34) * (-8241)) ^ 1075350100;
                        i24 = 1481250918;
                    }
                    int i613 = iM11309 ^ i24;
                    i38 = i21;
                    sArr10 = sArr6;
                    i43 = i22;
                    jSONArray4 = jSONArray2;
                    sArr11 = sArr4;
                    i41 = i19;
                    strM3361 = strM3361;
                    i36 = i613;
                    i37 = i37;
                    int i74 = i20;
                    str6 = str2;
                    i35 = i23;
                    sArr12 = sArr5;
                    i39 = i74;
                    break;
                case 480333578:
                case 1978569123:
                    i37 = i37;
                    strM3361 = strM3361;
                    c21948 = c21948;
                    i41 = i41;
                    sArr11 = sArr11;
                    strM4040 = strM4040;
                    jSONArray4 = jSONArray4;
                    i43 = i43;
                    jSONObjectM48779 = jSONObjectM48779;
                    sArr10 = sArr10;
                    str6 = str6;
                    i38 = i38;
                    i39 = i39;
                    sArr12 = sArr12;
                    s = f67206[20];
                    i31 = s * s;
                    if (C1875.m6086() != 0) {
                        iM45029 = (i34 - C19806.m45029("ۙᩳ")) * (-61);
                        i3 = ((iM45029 ^ i33) * (-9105)) ^ 1825664878;
                        i4 = 1760904865;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܽ") ^ i34;
                        i3 = ((iM45029 ^ i33) * (-14145)) ^ (-682883563);
                        i4 = -1786681067;
                    }
                    i8 = iM45029 ^ i4;
                    sArr12 = sArr12;
                    i38 = i38;
                    sArr10 = sArr10;
                    i39 = i39;
                    str6 = str6;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM4040 = strM4040;
                    i43 = i43;
                    jSONArray4 = jSONArray4;
                    c21948 = c21948;
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = i8;
                    i35 = i3;
                    i37 = i37;
                    break;
                case 512803916:
                case 1854885207:
                    strM3361 = strM3361;
                    int i75 = i40;
                    i41 = i41;
                    short[] sArr31 = sArr11;
                    c18419.m42715(C2477.m7600(jSONObject2, C3577.m10571(sArr31, i75, i41, i42)));
                    String str20 = str6;
                    c18419.m42731(RunnableC1606.m5479(jSONObject2, str20));
                    short[] sArr32 = f67206;
                    if (C7105.m18985()) {
                        sArr11 = sArr31;
                        i40 = i75;
                        c21947 = c21948;
                        jSONArray4 = jSONArray4;
                        i39 = i39;
                        i43 = i43;
                        strM4040 = strM4040;
                        sArr10 = sArr10;
                        jSONObjectM48779 = jSONObjectM48779;
                        str6 = str20;
                        sArr13 = sArr32;
                        i37 = 66;
                        int iM450219 = (C19806.m45029("ۜ۬") + i33) * (-65);
                        sArr12 = sArr12;
                        i5 = ((iM450219 ^ i34) * (-7541)) ^ 1110549313;
                        i7 = iM450219 ^ (-788273252);
                        sArr10 = sArr10;
                        i43 = i43;
                        jSONArray4 = jSONArray4;
                        sArr11 = sArr11;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = i7;
                        i35 = i5;
                        sArr12 = sArr12;
                        i39 = i39;
                        str6 = str6;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM4040 = strM4040;
                        c21948 = c21947;
                        i37 = i37;
                    } else {
                        int iM450220 = C19806.m45029("ۧ᩹") ^ i34;
                        i35 = ((iM450220 ^ i33) * 30339) ^ (-2053987841);
                        str6 = str20;
                        sArr13 = sArr32;
                        sArr11 = sArr31;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = iM450220 ^ (-1481273370);
                        i40 = i75;
                        i37 = 66;
                    }
                    break;
                case 672834610:
                case 1104567371:
                    i37 = i37;
                    strM3361 = strM3361;
                    c18419.m42722(jSONObject2.getBoolean(strM4969));
                    iM3005 = C0671.m3005(jSONObject2, RunnableC1564.m5344(f67206, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 5, i42));
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("֡ܿ") ^ i33;
                        i3 = ((iM11307 ^ i34) * (-24719)) ^ (-887408484);
                        i13 = 225890614;
                        i8 = iM11307 ^ i13;
                        strM3361 = strM3361;
                        i36 = i8;
                        i35 = i3;
                        i37 = i37;
                    } else {
                        str2 = str6;
                        i19 = i41;
                        sArr4 = sArr11;
                        jSONArray2 = jSONArray4;
                        i20 = i39;
                        i22 = i43;
                        sArr5 = sArr12;
                        sArr6 = sArr10;
                        i21 = i38;
                        iM11309 = (C19806.m45029("֡֨") ^ i33) * (-63);
                        i23 = ((iM11309 ^ i34) * 16625) ^ 1342408371;
                        i24 = 1343574040;
                        int i614 = iM11309 ^ i24;
                        i38 = i21;
                        sArr10 = sArr6;
                        i43 = i22;
                        jSONArray4 = jSONArray2;
                        sArr11 = sArr4;
                        i41 = i19;
                        strM3361 = strM3361;
                        i36 = i614;
                        i37 = i37;
                        int i76 = i20;
                        str6 = str2;
                        i35 = i23;
                        sArr12 = sArr5;
                        i39 = i76;
                    }
                    break;
                case 740313309:
                case 1342687448:
                    i37 = i37;
                    strM3361 = strM3361;
                    c21947 = c21948;
                    i41 = i41;
                    sArr11 = sArr11;
                    strM4040 = strM4040;
                    jSONArray4 = jSONArray4;
                    i43 = i43;
                    jSONObjectM48779 = jSONObjectM48779;
                    sArr10 = sArr10;
                    str6 = str6;
                    i38 = i38;
                    i39 = i39;
                    sArr12 = sArr12;
                    if (C2190.m6804()) {
                        iM450210 = (ThreadFactoryC3888.m11306("֨ᩳ") + i33) * 27;
                        i5 = ((iM450210 ^ i34) * 13847) ^ 746647970;
                        i6 = -1551746488;
                    } else {
                        iM450210 = (C19806.m45029("ܺ۬") + i34) * (-13);
                        i5 = ((iM450210 ^ i33) * (-29505)) ^ (-561787547);
                        i6 = 869521458;
                    }
                    i7 = iM450210 ^ i6;
                    i38 = i38;
                    sArr10 = sArr10;
                    i43 = i43;
                    jSONArray4 = jSONArray4;
                    sArr11 = sArr11;
                    i41 = i41;
                    strM3361 = strM3361;
                    i36 = i7;
                    i35 = i5;
                    sArr12 = sArr12;
                    i39 = i39;
                    str6 = str6;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM4040 = strM4040;
                    c21948 = c21947;
                    i37 = i37;
                    break;
                case 887270762:
                case 912352575:
                    C1419.m4973();
                    if (C1937.f7317 >= 0) {
                        i37 = i37;
                        strM3361 = strM3361;
                        str = str6;
                        i10 = i40;
                        i11 = i41;
                        sArr2 = sArr11;
                        int i412 = i39;
                        sArr = sArr12;
                        sArr3 = sArr10;
                        i9 = i38;
                        jSONArray = jSONArray4;
                        i12 = i412;
                        int iM4502110 = C19806.m45029("ۨ᩶") ^ i34;
                        i40 = i10;
                        int i413 = ((iM4502110 ^ i33) * (-26229)) ^ 157178274;
                        sArr11 = sArr2;
                        i41 = i11;
                        strM3361 = strM3361;
                        i36 = iM4502110 ^ (-862680998);
                        str6 = str;
                        i35 = i413;
                        i37 = i37;
                        int i414 = i9;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        i39 = i12;
                        jSONArray4 = jSONArray;
                        i38 = i414;
                    } else {
                        i37 = i37;
                        strM3361 = strM3361;
                        iM11307 = ThreadFactoryC3888.m11306("ۗ᩶") ^ i33;
                        i3 = ((iM11307 ^ i34) * 19811) ^ 39954483;
                        i13 = 1898031957;
                        i8 = iM11307 ^ i13;
                        strM3361 = strM3361;
                        i36 = i8;
                        i35 = i3;
                        i37 = i37;
                    }
                    break;
                case 1008740036:
                case 1918513136:
                    i37 = i37;
                    strM3361 = strM3361;
                    C21947 c219410 = c21948;
                    i39 = i39;
                    i41 = i41;
                    sArr11 = sArr11;
                    sArr12 = sArr12;
                    strM4040 = strM4040;
                    jSONArray4 = jSONArray4;
                    i43 = i43;
                    jSONObjectM48779 = jSONObjectM48779;
                    sArr10 = sArr10;
                    i38 = i38;
                    boolean zM6804 = C2190.m6804();
                    c21948 = c219410;
                    String strM8640 = C2871.m8640(f67206, 21, 4, i42);
                    if (zM6804) {
                        str6 = strM8640;
                        iM45029 = (i34 - C19806.m45029("֫᩹")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM45029 ^ i33) * (-3157)) ^ 1870615850;
                        i4 = 56251451;
                        i8 = iM45029 ^ i4;
                        sArr12 = sArr12;
                        i38 = i38;
                        sArr10 = sArr10;
                        i39 = i39;
                        str6 = str6;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM4040 = strM4040;
                        i43 = i43;
                        jSONArray4 = jSONArray4;
                        c21948 = c21948;
                        sArr11 = sArr11;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = i8;
                        i35 = i3;
                    } else {
                        int iM450221 = C19806.m45029("֨֡") ^ i33;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM4040 = strM4040;
                        i38 = i38;
                        sArr10 = sArr10;
                        c21948 = c21948;
                        i43 = i43;
                        jSONArray4 = jSONArray4;
                        sArr11 = sArr11;
                        i41 = i41;
                        strM3361 = strM3361;
                        i36 = iM450221 ^ (-493368470);
                        i35 = ((iM450221 ^ i34) * (-4451)) ^ (-276643981);
                        sArr12 = sArr12;
                        i39 = i39;
                        str6 = strM8640;
                    }
                    i37 = i37;
                    break;
                case 1869146364:
                case 2136996035:
                    i37 = i37;
                    strM3361 = strM3361;
                    c18419.m42733(C2477.m7600(jSONObject2, strM5502));
                    strM4969 = C1419.m4969(f67206, 99, 4, i42);
                    if (AbstractC0464.m2313() != 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۗ᩶") ^ i33;
                        i3 = ((iM11307 ^ i34) * 19811) ^ 39954483;
                        i13 = 1898031957;
                    } else {
                        iM11307 = C19806.m45029("۠ܰ") ^ i34;
                        i3 = ((iM11307 ^ i33) * (-4727)) ^ 724431630;
                        i13 = 1387876575;
                    }
                    i8 = iM11307 ^ i13;
                    strM3361 = strM3361;
                    i36 = i8;
                    i35 = i3;
                    i37 = i37;
                    break;
                default:
                    c18419.m42725(C2477.m7600(jSONObject2, strM3361));
                    i37 = i37;
                    iM450211 = C19806.m45029("ܿ᩻") ^ i34;
                    i3 = ((iM450211 ^ i33) * 21761) ^ (-802089293);
                    i14 = -176712846;
                    i36 = iM450211 ^ i14;
                    i35 = i3;
                    i37 = i37;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x0201 A[PHI: r3 r11 r12 r13 r15
      0x0201: PHI (r3v4 android.widget.TextView) = (r3v2 android.widget.TextView), (r3v3 android.widget.TextView), (r3v2 android.widget.TextView) binds: [B:55:0x01ff, B:39:0x0147, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:55:0x01ff, B:39:0x0147, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:55:0x01ff, B:39:0x0147, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:55:0x01ff, B:39:0x0147, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:55:0x01ff, B:39:0x0147, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0236 A[PHI: r9 r10
      0x0236: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:59:0x0234, B:17:0x0089, B:15:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:59:0x0234, B:17:0x0089, B:15:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x026a A[PHI: r4 r5 r8
      0x026a: PHI (r4v4 android.widget.TextView) = 
      (r4v2 android.widget.TextView)
      (r4v2 android.widget.TextView)
      (r4v3 android.widget.TextView)
      (r4v2 android.widget.TextView)
      (r4v2 android.widget.TextView)
     binds: [B:63:0x0268, B:35:0x0125, B:23:0x00a5, B:15:0x0085, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r5v5 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v4 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:63:0x0268, B:35:0x0125, B:23:0x00a5, B:15:0x0085, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r8v4 char) = (r8v3 char), (r8v2 char), (r8v2 char), (r8v2 char), (r8v2 char) binds: [B:63:0x0268, B:35:0x0125, B:23:0x00a5, B:15:0x0085, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        int iM45029;
        int i;
        int i2;
        short[] sArr;
        C20639 c20639 = this;
        int i3 = C2249.f8050;
        int i4 = C0050.f912;
        int iM11306 = (ThreadFactoryC3888.m11306("᩵۫") ^ i3) * 99;
        int i5 = ((iM11306 ^ i4) * (-5727)) ^ (-2073715500);
        String strM3859 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11306 ^ 1720523959;
        int iM11307 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -454641939;
        TextView textView = null;
        TextView textView2 = null;
        ActivityC11736 activityC11736 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-7833)) >> 31));
            switch (i11) {
                case -2119582521:
                case -676029785:
                    strM3859 = C1025.m3859(sArr3, 17, 3, i10);
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 5035) ^ 1099378563;
                        i2 = 730128883;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۬") ^ i4;
                        i = ((iM45029 ^ i3) * (-7861)) ^ 13662796;
                        i2 = -1141790705;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1992559417:
                case -337160482:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C1461.m5080();
                    iM45029 = (ThreadFactoryC3888.m11306("֨᩶") + i4) * 73;
                    i = ((iM45029 ^ i3) * (-32651)) ^ 1442329394;
                    i2 = -894050342;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1818098306:
                case -1092227018:
                    if ((i8 + i9) - i7 < 0) {
                        iM45029 = (i4 - C19806.m45029("ܳۙ")) * 71;
                        i = ((iM45029 ^ i3) * (-5451)) ^ (-1701585098);
                        i2 = -523915641;
                    } else {
                        iM45029 = (C19806.m45029("ܿۛ") ^ i3) * 93;
                        i = ((iM45029 ^ i4) * (-29559)) ^ 900789367;
                        i2 = 228590334;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1781532032:
                case 63189116:
                    sArr = f67206;
                    if (C2249.f8050 < 0) {
                        int iM11308 = ThreadFactoryC3888.m11306("ܺۡ") ^ i3;
                        i = ((iM11308 ^ i4) * (-16567)) ^ (-1177671428);
                        i6 = iM11308 ^ 7920868;
                        c20639 = this;
                        sArr2 = sArr;
                        i5 = i;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("᩵᩵") ^ i4;
                        i6 = iM11309 ^ (-1263259284);
                        sArr2 = sArr;
                        i5 = ((iM11309 ^ i3) * (-477)) ^ 103189114;
                        c20639 = this;
                    }
                    break;
                case -1484990710:
                case 606266946:
                    RunnableC1895.m6165(activityC11736.f39461, 0);
                    if (C2124.f7782 > 0) {
                        iM45029 = C19806.m45029("֫᩸") ^ i4;
                        i = ((iM45029 ^ i3) * 28211) ^ 1819523666;
                        i2 = 1162156801;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM113010 = ThreadFactoryC3888.m11306("᩵᩵") ^ i4;
                        i6 = iM113010 ^ (-1263259284);
                        sArr2 = sArr;
                        i5 = ((iM113010 ^ i3) * (-477)) ^ 103189114;
                        c20639 = this;
                    }
                    break;
                case -1451701558:
                case 1183530398:
                    ThreadFactoryC3888.m11303(textView2, 2127002154 ^ iM11307);
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ۗۙ") ^ i3;
                        i = ((iM45029 ^ i4) * 6371) ^ 2305867;
                        i2 = -541106474;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۘܺ")) * (-25);
                        i = ((iM45029 ^ i3) * (-27791)) ^ (-1349179677);
                        i2 = -586941213;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1081083082:
                case 2094248018:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 5035) ^ 1099378563;
                        i2 = 730128883;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۘܺ")) * (-25);
                        i = ((iM45029 ^ i3) * (-27791)) ^ (-1349179677);
                        i2 = -586941213;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1071944852:
                case 364925459:
                    c = 16;
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 5035) ^ 1099378563;
                        i2 = 730128883;
                    } else {
                        iM45029 = (i4 - C19806.m45029("۬ܶ")) * 61;
                        i = ((iM45029 ^ i3) * 8327) ^ 2053214659;
                        i2 = 1594521142;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -878457394:
                case -136587613:
                    iM11307 = ThreadFactoryC3888.m11306(strM3859);
                    if (C1875.f7103 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM45029 ^ i4) * 22619) ^ 4006479;
                        i2 = 780645948;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM113011 = ThreadFactoryC3888.m11306("᩵᩵") ^ i4;
                        i6 = iM113011 ^ (-1263259284);
                        sArr2 = sArr;
                        i5 = ((iM113011 ^ i3) * (-477)) ^ 103189114;
                        c20639 = this;
                    }
                    break;
                case -663473937:
                case 1391434116:
                    ThreadFactoryC3888.m11300();
                    if (C2704.m8255() > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩶") + i4) * 73;
                        i = ((iM45029 ^ i3) * (-32651)) ^ 1442329394;
                        i2 = -894050342;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 5035) ^ 1099378563;
                        i2 = 730128883;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -612216375:
                case 1801111354:
                    break;
                case -591166134:
                case -375839207:
                    i10 = 16208;
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ܰ")) * (-49);
                    i = ((iM45029 ^ i4) * (-9129)) ^ 1542727818;
                    i2 = 1130841933;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -227608673:
                case 1927983779:
                    C1419.m4973();
                    break;
                case -123869649:
                case 1738501201:
                    C0050.m946();
                    if (C19806.f63586) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۘܺ")) * (-25);
                        i = ((iM45029 ^ i3) * (-27791)) ^ (-1349179677);
                        i2 = -586941213;
                    } else {
                        iM45029 = (C19806.m45029("᩹ܳ") + i3) * 49;
                        i = ((iM45029 ^ i4) * (-26809)) ^ (-1019451054);
                        i2 = 1815015887;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -11186996:
                case 3015566:
                    i10 = 56627;
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ܰ")) * (-49);
                    i = ((iM45029 ^ i4) * (-9129)) ^ 1542727818;
                    i2 = 1130841933;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 158288079:
                case 883967630:
                    textView2 = activityC11736.f39461;
                    sArr3 = f67206;
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-30849)) ^ 1484805467;
                        i2 = 399970561;
                    } else {
                        iM45029 = (C19806.m45029("᩹ܳ") + i3) * 49;
                        i = ((iM45029 ^ i4) * (-26809)) ^ (-1019451054);
                        i2 = 1815015887;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 364825216:
                case 1337705878:
                    C7105.m18993(textView, new ViewOnClickListenerC7939(0, c20639));
                    break;
                case 534566235:
                case 561667482:
                    textView = activityC11736.f39461;
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 5035) ^ 1099378563;
                        i2 = 730128883;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-12593)) ^ (-1144605020);
                        i2 = 59904855;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1221713878:
                case 1981698334:
                    i7 = s * s2;
                    i8 = s * s;
                    i9 = 50694400;
                    if (C3535.m10431() <= 0) {
                        iM45029 = (C19806.m45029("᩹ܳ") + i3) * 49;
                        i = ((iM45029 ^ i4) * (-26809)) ^ (-1019451054);
                        i2 = 1815015887;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܽ") ^ i4;
                        i = ((iM45029 ^ i3) * 24751) ^ 2058533833;
                        i2 = -544703522;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1624188726:
                case 2063312835:
                    s = sArr2[c];
                    s2 = 14240;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("᩹᩺") + i3) * 43;
                        i = ((iM45029 ^ i4) * (-12277)) ^ 860957401;
                        i2 = 656582958;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩶") + i4) * 73;
                        i = ((iM45029 ^ i3) * (-32651)) ^ 1442329394;
                        i2 = -894050342;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    activityC11736 = c20639.f67207;
                    if (c20639.f67208 != activityC11736.f39460) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۫ۛ")) * 101;
                        i = ((iM45029 ^ i4) * (-10115)) ^ 1526454411;
                        i2 = -1920133375;
                    } else {
                        iM45029 = (C19806.m45029("᩶ۤ") ^ i4) * (-109);
                        i = ((iM45029 ^ i3) * (-6245)) ^ 1845427840;
                        i2 = -1234745099;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
