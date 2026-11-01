package l;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alipay.sdk.m.t0.b;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۗܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G1 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC3330 extends Activity {
    public boolean doingOnConfigurationChanged;

    public int getUiConfigNightMode() {
        return -100;
    }

    public boolean shouldApplyUiConfigNightMode() {
        return true;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int uiConfigNightMode = 0;
        int i = 249528036;
        int i2 = C2642.f10294;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = C19806.m45029("ۚ᩶") ^ i3;
        int i4 = ((iM45029 ^ i2) * 6585) ^ (-1801587167);
        int i5 = -1348004509;
        while (true) {
            i = ((((i ^ i2) * (-2941)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1870758814:
                case 1455889856:
                    if (C1189.f5284 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4251) ^ (-1363471428);
                        i5 = 20080653;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴۤ")) * (-87);
                        i4 = ((iM45029 ^ i3) * (-23353)) ^ 446270463;
                        i5 = 1277078932;
                    }
                    break;
                case -1607252326:
                case 36979097:
                    if (C3722.f13525 > 0) {
                        iM45029 = C19806.m45029("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25461) ^ (-1779949732);
                        i5 = -170224468;
                    } else {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9179)) ^ (-1883492262);
                        i5 = -1475233158;
                    }
                    break;
                case -1568583508:
                case -325567680:
                    if (C3286.m9798() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4251) ^ (-1363471428);
                        i5 = 20080653;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8989)) ^ (-1478842968);
                        i5 = -59655081;
                    }
                    break;
                case -1353753846:
                case 257740878:
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9179)) ^ (-1883492262);
                        i5 = -1475233158;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۨ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * 6239) ^ (-1697746627);
                        i5 = 496023783;
                    }
                    break;
                case -1258721353:
                case -364718633:
                    C3722.m10894();
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9179)) ^ (-1883492262);
                        i5 = -1475233158;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩹") ^ i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-14181)) ^ (-136116943);
                        i5 = -1662307944;
                    }
                    break;
                case -1215693979:
                case -531409033:
                    C1668.m5583();
                    break;
                case -999707782:
                case -190595416:
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9179)) ^ (-1883492262);
                        i5 = -1475233158;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢۛ")) * 99;
                        i4 = ((iM45029 ^ i3) * 22345) ^ (-200887001);
                        i5 = -416442914;
                    }
                    break;
                case -923273748:
                case -646467640:
                    if (C1025.m3861() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4251) ^ (-1363471428);
                        i5 = 20080653;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۡ") + i3) * 127;
                        i4 = ((iM45029 ^ i2) * (-4187)) ^ (-473965568);
                        i5 = -1229819264;
                    }
                    break;
                case -916260200:
                case -770466303:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4251) ^ (-1363471428);
                        i5 = 20080653;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1769) ^ 1450008971;
                        i5 = 1301878197;
                    }
                    break;
                case -884346754:
                case 199475035:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25461) ^ (-1779949732);
                        i5 = -170224468;
                    } else {
                        iM45029 = (C19806.m45029("֨ܳ") + i3) * (-39);
                        i4 = ((iM45029 ^ i2) * 23427) ^ 343988874;
                        i5 = -1942921382;
                    }
                    break;
                case -471193588:
                case 803834336:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4251) ^ (-1363471428);
                        i5 = 20080653;
                    } else {
                        iM45029 = (C19806.m45029("۬᩸") ^ i2) * (-101);
                        i4 = ((iM45029 ^ i3) * (-8639)) ^ 1300140640;
                        i5 = -1941852951;
                    }
                    break;
                case -425978997:
                case 330268265:
                    C2704.m8255();
                    iM45029 = C19806.m45029("᩶ۛ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-9179)) ^ (-1883492262);
                    i5 = -1475233158;
                    break;
                case 155790018:
                case 808146827:
                    super.attachBaseContext(C14040.m33952(context, uiConfigNightMode, shouldApplyUiConfigNightMode()));
                    break;
                case 245755400:
                case 548881568:
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25461) ^ (-1779949732);
                        i5 = -170224468;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i2) * 11;
                        i4 = ((iM45029 ^ i3) * (-22765)) ^ (-1954356055);
                        i5 = -2099696224;
                    }
                    break;
                case 734420610:
                case 1041765428:
                    if (!RunnableC3388.m10064()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4251) ^ (-1363471428);
                        i5 = 20080653;
                    } else {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9179)) ^ (-1883492262);
                        i5 = -1475233158;
                    }
                    break;
                default:
                    uiConfigNightMode = getUiConfigNightMode();
                    if (C1977.m6356()) {
                        iM45029 = C19806.m45029("ۖۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20695)) ^ (-241432002);
                        i5 = 878575229;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11213)) ^ (-1401904061);
                        i5 = -1859541633;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int uiConfigNightMode = 0;
        int i = -1638346775;
        int i2 = C2871.f10837;
        int i3 = C10634.f36300;
        int iM11306 = (ThreadFactoryC3888.m11306("᩺ᩴ") ^ i3) * (-105);
        int i4 = ((iM11306 ^ i2) * 22669) ^ (-2059075490);
        int i5 = 916949599;
        while (true) {
            i = ((((i ^ i2) * (-16279)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2096815306:
                case -1480641155:
                    if (RunnableC1895.m6170() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15331)) ^ 406353189;
                        i5 = -1340135348;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10319) ^ (-1889524030);
                        i5 = -1083339909;
                    }
                    break;
                case -1985957535:
                case 791681671:
                    RunnableC1606.m5473();
                    C2871.m8646();
                    break;
                case -1821312616:
                case 1545054089:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("᩺ۧ") + i3) * (-69);
                        i4 = ((iM11306 ^ i2) * 29543) ^ 70955126;
                        i5 = -1974551980;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܳۙ")) * 29;
                        i4 = ((iM11306 ^ i3) * (-31983)) ^ 1402318046;
                        i5 = -492356013;
                    }
                    break;
                case -1633084248:
                case -1363250969:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܶ") ^ i3) * 63;
                        i4 = ((iM11306 ^ i2) * 11807) ^ (-631426441);
                        i5 = -655675955;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۬") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * 8919) ^ (-727753562);
                        i5 = 2125730507;
                    }
                    break;
                case -1473247420:
                case -666480999:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19345)) ^ (-1410844111);
                        i5 = -674992753;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * b.d) ^ 760479875;
                        i5 = -965432257;
                    }
                    break;
                case -1143131205:
                case 1940735250:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܳۙ")) * 29;
                        i4 = ((iM11306 ^ i3) * (-31983)) ^ 1402318046;
                        i5 = -492356013;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۘ") + i3) * (-121);
                        i4 = ((iM11306 ^ i2) * (-5319)) ^ 839354848;
                        i5 = 1834718512;
                    }
                    break;
                case -635417194:
                case -498148974:
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1123) ^ (-34256772);
                        i5 = -1050824674;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۬") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * 8919) ^ (-727753562);
                        i5 = 2125730507;
                    }
                    break;
                case -622495667:
                case 523667534:
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15331)) ^ 406353189;
                        i5 = -1340135348;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۙ") ^ i3) * 77;
                        i4 = ((iM11306 ^ i2) * (-20811)) ^ (-1499424526);
                        i5 = -1770842176;
                    }
                    break;
                case -270592654:
                case 1819419757:
                    C14040.m33956(this, uiConfigNightMode, shouldApplyUiConfigNightMode());
                    super.onCreate(bundle);
                    break;
                case -257394378:
                case 143023068:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܳۙ")) * 29;
                        i4 = ((iM11306 ^ i3) * (-31983)) ^ 1402318046;
                        i5 = -492356013;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5175) ^ 903977410;
                        i5 = -1271737555;
                    }
                    break;
                case -224720381:
                case 1954825322:
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18047)) ^ 200127241;
                        i5 = -1904729492;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܳۙ")) * 29;
                        i4 = ((iM11306 ^ i3) * (-31983)) ^ 1402318046;
                        i5 = -492356013;
                    }
                    break;
                case -187435030:
                case 228410628:
                    C1461.m5080();
                    RunnableC1564.m5345();
                    iM11306 = (ThreadFactoryC3888.m11306("֫۬") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM11306 ^ i2) * 8919) ^ (-727753562);
                    i5 = 2125730507;
                    break;
                case 253430087:
                case 1337282089:
                    if (C0278.m1789() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10319) ^ (-1889524030);
                        i5 = -1083339909;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۬") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * 8919) ^ (-727753562);
                        i5 = 2125730507;
                    }
                    break;
                case 830212085:
                case 1985567337:
                    uiConfigNightMode = getUiConfigNightMode();
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19345)) ^ (-1410844111);
                        i5 = -674992753;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫᩺") + i2) * (-51);
                        i4 = ((iM11306 ^ i3) * (-10555)) ^ 1938092155;
                        i5 = 898525714;
                    }
                    break;
                case 1276328101:
                case 1697958380:
                    C2124.m6673();
                    if (C1148.f5161 > 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܳۙ")) * 29;
                        i4 = ((iM11306 ^ i3) * (-31983)) ^ 1402318046;
                        i5 = -492356013;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۬") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * 8919) ^ (-727753562);
                        i5 = 2125730507;
                    }
                    break;
                default:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15331)) ^ 406353189;
                        i5 = -1340135348;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7509) ^ 1982071609;
                        i5 = 474909970;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws Throwable {
        boolean z = false;
        Throwable th = null;
        int i = -1957461847;
        int i2 = C10634.f36300;
        int i3 = ThreadFactoryC3888.f14547;
        int iM45029 = C19806.m45029("ܿܺ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 7101) ^ (-1025007541);
        int i5 = 1704926572;
        while (true) {
            i = ((((i ^ i3) * 17099) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2072094179:
                case -1252096967:
                    C0797.m3359();
                    if (!C0797.m3359()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩹") ^ i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-5401)) ^ (-1093814606);
                        i5 = 830401043;
                    } else {
                        iM45029 = C19806.m45029("᩹᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3223)) ^ (-1483629804);
                        i5 = 238297095;
                    }
                    break;
                case -1699127337:
                case -1366639961:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("᩷ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19797) ^ (-2057321167);
                        i5 = -328336928;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜۧ")) * 67;
                        i4 = ((iM45029 ^ i2) * 3053) ^ 1831435492;
                        i5 = 531493814;
                    }
                    break;
                case -1468035829:
                case 1339139142:
                    this.doingOnConfigurationChanged = z;
                    return;
                case -1453153281:
                case 301082093:
                    if (C3743.m10966() <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜۧ")) * 67;
                        i4 = ((iM45029 ^ i2) * 3053) ^ 1831435492;
                        i5 = 531493814;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19765) ^ 1334544907;
                        i5 = -1849493082;
                    }
                    break;
                case -1340046340:
                case -1226701777:
                    if (this.doingOnConfigurationChanged) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܳ") ^ i2) * 25;
                        i4 = ((iM45029 ^ i3) * (-32635)) ^ 126701568;
                        i5 = -511863268;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۚ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 18853) ^ (-185804340);
                        i5 = 1514789441;
                    }
                    break;
                case -1317675296:
                case -27190806:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("ۤۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13531)) ^ 1472198075;
                        i5 = -238501971;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۟ܰ")) * (-87);
                        i4 = ((iM45029 ^ i2) * 27585) ^ (-73757199);
                        i5 = -722443085;
                    }
                    break;
                case -945715013:
                case -2701858:
                    if (C1668.m5583()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۜ") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * 9915) ^ (-1555124840);
                        i5 = 950569080;
                    } else {
                        iM45029 = C19806.m45029("᩹᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3223)) ^ (-1483629804);
                        i5 = 238297095;
                    }
                    break;
                case -752211847:
                case 1706456242:
                    if (C2788.m8472() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩹") ^ i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-5401)) ^ (-1093814606);
                        i5 = 830401043;
                    } else {
                        iM45029 = C19806.m45029("᩺ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30051) ^ 762514011;
                        i5 = 294485306;
                    }
                    break;
                case -745170739:
                case -549919561:
                    C3577.m10565();
                    RunnableC1895.m6170();
                    return;
                case -717533911:
                case 1887865336:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜۧ")) * 67;
                        i4 = ((iM45029 ^ i2) * 3053) ^ 1831435492;
                        i5 = 531493814;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ۟")) * (-11);
                        i4 = ((iM45029 ^ i2) * 7189) ^ (-900681223);
                        i5 = 625348658;
                    }
                    break;
                case -651187552:
                case 1853939260:
                    this.doingOnConfigurationChanged = z;
                    throw th;
                case -627374372:
                case 631778163:
                    if (C19806.f63586) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩹") ^ i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-5401)) ^ (-1093814606);
                        i5 = 830401043;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۚ") ^ i2) * 25;
                        i4 = ((iM45029 ^ i3) * 25689) ^ (-2021202289);
                        i5 = -1238349300;
                    }
                    break;
                case -424590080:
                case 1176190238:
                    return;
                case 314163927:
                case 1926302659:
                    try {
                        C20368.m45985();
                        super.onConfigurationChanged(configuration);
                        C14040.m33957(this, getUiConfigNightMode(), shouldApplyUiConfigNightMode());
                        iM45029 = (C19806.m45029("ܺۗ") + i3) * q.h;
                        i4 = ((iM45029 ^ i2) * 26219) ^ 1832907359;
                        i5 = 1624947099;
                    } catch (Throwable th2) {
                        th = th2;
                        iM45029 = C19806.m45029("ᩴ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE) ^ (-1299027387);
                        i5 = -779653935;
                    }
                    break;
                case 337648750:
                case 421872115:
                    C2642.m8171();
                    C1398.m4895();
                    iM45029 = (i2 - C19806.m45029("ܿ᩶")) * 127;
                    i4 = ((iM45029 ^ i3) * 13753) ^ 1434562322;
                    i5 = 292106337;
                    break;
                case 1322033072:
                case 1555497622:
                    C0050.m946();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜۧ")) * 67;
                        i4 = ((iM45029 ^ i2) * 3053) ^ 1831435492;
                        i5 = 531493814;
                    } else {
                        iM45029 = C19806.m45029("᩹᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3223)) ^ (-1483629804);
                        i5 = 238297095;
                    }
                    break;
                case 1427068872:
                case 1820627015:
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("ۤۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13531)) ^ 1472198075;
                        i5 = -238501971;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܶ") + i2) * 39;
                        i4 = ((iM45029 ^ i3) * 32263) ^ (-1613253516);
                        i5 = -892357644;
                    }
                    break;
                case 1481958685:
                case 1559604304:
                    if (RunnableC1606.f6488 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩹") ^ i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-5401)) ^ (-1093814606);
                        i5 = 830401043;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܿ᩶")) * 127;
                        i4 = ((iM45029 ^ i3) * 13753) ^ 1434562322;
                        i5 = 292106337;
                    }
                    break;
                case 1749190854:
                case 2013878946:
                    this.doingOnConfigurationChanged = true;
                    z = false;
                    iM45029 = (ThreadFactoryC3888.m11306("֡ᩳ") + i3) * 39;
                    i4 = ((iM45029 ^ i2) * (-16171)) ^ (-1783754703);
                    i5 = 1536796857;
                    break;
                case 1852991898:
                case 1868240124:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ۤۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13531)) ^ 1472198075;
                        i5 = -238501971;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9865) ^ 1338203785;
                        i5 = -431757411;
                    }
                    break;
                default:
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("֨ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14853) ^ 294699779;
                        i5 = -799056359;
                    } else {
                        iM45029 = C19806.m45029("ۤۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13531)) ^ 1472198075;
                        i5 = -238501971;
                    }
                    break;
            }
        }
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        int uiConfigNightMode = 0;
        int i = -1352503304;
        int i2 = C3535.f13026;
        int i3 = C1148.f5161;
        int iM45029 = (C19806.m45029("֨᩵") ^ i2) * (-67);
        int i4 = ((iM45029 ^ i3) * 6815) ^ 2086483437;
        int i5 = 933041485;
        while (true) {
            i = ((((i ^ i3) * 9773) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1858263157:
                case 766672413:
                    if (C0278.m1789() <= 0) {
                        iM45029 = C19806.m45029("᩵ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22213)) ^ (-2092669724);
                        i5 = -925514018;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩵ۛ")) * 69;
                        i4 = ((iM45029 ^ i3) * (-29383)) ^ (-138239571);
                        i5 = 1279473277;
                    }
                    break;
                case -1811545068:
                case 1164457073:
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15585)) ^ (-1094659949);
                        i5 = 1976409652;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۚ") ^ i2) * 67;
                        i4 = ((iM45029 ^ i3) * 5079) ^ 1076747696;
                        i5 = -680075461;
                    }
                    break;
                case -1800875569:
                case -1653453160:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۗ") ^ i3) * (-77);
                        i4 = ((iM45029 ^ i2) * 423) ^ (-1832890691);
                        i5 = -88661213;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܺ") + i3) * 99;
                        i4 = ((iM45029 ^ i2) * (-29745)) ^ 878246918;
                        i5 = -155955418;
                    }
                    break;
                case -1758019174:
                case 935713775:
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15585)) ^ (-1094659949);
                        i5 = 1976409652;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۗ") ^ i3) * (-77);
                        i4 = ((iM45029 ^ i2) * 423) ^ (-1832890691);
                        i5 = -88661213;
                    }
                    break;
                case -1697481280:
                case 899436647:
                    if (C1066.m4023() <= 0) {
                        iM45029 = C19806.m45029("᩵ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22213)) ^ (-2092669724);
                        i5 = -925514018;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܳ") ^ i3) * 83;
                        i4 = ((iM45029 ^ i2) * (-31913)) ^ 1435333764;
                        i5 = -97002654;
                    }
                    break;
                case -1300125071:
                case 276568951:
                    C20368.m45986(configuration, uiConfigNightMode);
                    iM45029 = C19806.m45029("ܺ᩵") ^ i3;
                    i4 = ((iM45029 ^ i2) * 15231) ^ (-1464882072);
                    i5 = 2138891131;
                    break;
                case -1135803822:
                case 1850896314:
                    if (C0671.f2816 != 0) {
                        iM45029 = (i2 - C19806.m45029("ۖ᩶")) * (-115);
                        i4 = ((iM45029 ^ i3) * 31389) ^ (-1028615045);
                        i5 = -1628905131;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۨ") + i3) * (-87);
                        i4 = ((iM45029 ^ i2) * (-32547)) ^ 1654397598;
                        i5 = -652311497;
                    }
                    break;
                case -1062220941:
                case 339331130:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۖ᩶")) * (-115);
                        i4 = ((iM45029 ^ i3) * 31389) ^ (-1028615045);
                        i5 = -1628905131;
                    } else {
                        iM45029 = (C19806.m45029("ۚܳ") + i3) * (-3);
                        i4 = ((iM45029 ^ i2) * 4333) ^ (-994880967);
                        i5 = -490375875;
                    }
                    break;
                case -996113178:
                case 1088355804:
                    if (configuration != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡۫") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * 8825) ^ (-1425179812);
                        i5 = -107960948;
                    } else {
                        iM45029 = C19806.m45029("ܺ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15231) ^ (-1464882072);
                        i5 = 2138891131;
                    }
                    break;
                case -545079481:
                case 1715700889:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۬") + i3) * 81;
                        i4 = ((iM45029 ^ i2) * 15591) ^ 1784666927;
                        i5 = -2072747708;
                    } else {
                        iM45029 = (C19806.m45029("᩷۟") + i3) * (-15);
                        i4 = ((iM45029 ^ i2) * 10711) ^ 1004303302;
                        i5 = -1126498122;
                    }
                    break;
                case -432947598:
                case 13583591:
                    super.applyOverrideConfiguration(configuration);
                    break;
                case -328032116:
                case 314575522:
                    C3286.m9798();
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = C19806.m45029("᩵ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22213)) ^ (-2092669724);
                        i5 = -925514018;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۗ") ^ i3) * (-77);
                        i4 = ((iM45029 ^ i2) * 423) ^ (-1832890691);
                        i5 = -88661213;
                    }
                    break;
                case 196948663:
                case 1646667453:
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("᩵ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22213)) ^ (-2092669724);
                        i5 = -925514018;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܽ᩹")) * (-73);
                        i4 = ((iM45029 ^ i3) * (-8441)) ^ (-317113341);
                        i5 = -2015858576;
                    }
                    break;
                case 646113833:
                case 1924965703:
                    int i6 = C20368.f66000;
                    if (C16737.f53615 != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۡ") + i3) * (-77);
                        i4 = ((iM45029 ^ i2) * 2147) ^ 362914852;
                        i5 = -2039487074;
                    } else {
                        iM45029 = C19806.m45029("ܺ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15231) ^ (-1464882072);
                        i5 = 2138891131;
                    }
                    break;
                case 707697006:
                case 1358281246:
                    RunnableC1564.m5345();
                    iM45029 = (ThreadFactoryC3888.m11306("᩶ۗ") ^ i3) * (-77);
                    i4 = ((iM45029 ^ i2) * 423) ^ (-1832890691);
                    i5 = -88661213;
                    break;
                case 812647961:
                case 1884877414:
                    C2704.m8255();
                    if (C3660.m10791() == 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۬") + i3) * 81;
                        i4 = ((iM45029 ^ i2) * 15591) ^ 1784666927;
                        i5 = -2072747708;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۗ") ^ i3) * (-77);
                        i4 = ((iM45029 ^ i2) * 423) ^ (-1832890691);
                        i5 = -88661213;
                    }
                    break;
                case 949356169:
                case 1065387439:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("᩵ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22213)) ^ (-2092669724);
                        i5 = -925514018;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1873)) ^ (-1070855522);
                        i5 = -824314604;
                    }
                    break;
                case 1483878583:
                case 1569749211:
                    uiConfigNightMode = getUiConfigNightMode();
                    if (shouldApplyUiConfigNightMode()) {
                        iM45029 = C19806.m45029("᩶᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21859) ^ 1250858431;
                        i5 = 2036439285;
                    } else {
                        iM45029 = C19806.m45029("ܺ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15231) ^ (-1464882072);
                        i5 = 2138891131;
                    }
                    break;
                case 1809539575:
                case 1833317713:
                    C1668.m5583();
                    C19806.m45024();
                    break;
                default:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ܺᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15519)) ^ (-2118171895);
                        i5 = -475151308;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۬") + i3) * 81;
                        i4 = ((iM45029 ^ i2) * 15591) ^ 1784666927;
                        i5 = -2072747708;
                    }
                    break;
            }
            return;
        }
    }
}
