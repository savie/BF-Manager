package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import java.text.DateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۛᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X6KT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6252 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹ۙ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f21203 = {4436, 1181, 1162, 1161, 1181, 1162, 1180, 1159, 1187, 1166, 1174, 1152, 1178, 1179, 4845, 27102, -20524, 25984, 16429, -24277, 25691, 25565, 27042, 28319, -22540, 18208, -21932, 12690, 12693, 12684, 12677, 12691, 12726, 12681, 12677, 12695, 12681, 12686, 12678, 12687, 12690, 12677, 12691, 12693, 12684, 12692, 12681, 12692, 12677, 12685, 12691, 12679, 12677, 12692, 12714, 12723, 12719, 12718, 12719, 12674, 12682, 12677, 12675, 12692, 12744, 12750, 12750, 12750, 12745, 12694, 12673, 12684, 12681, 12676, 12692, 12697, 12688, 12677, 12724, 12677, 12696, 12692, 12692, 12681, 12685, 12677, 24333, -22440, 16481, 17746, 17686, 26430, 21213, -24093, -23410, 20236, 25049, -19038, 12690, 12677, 12673, 12691, 12687, 12686, 12724, 12677, 12696, 12692, 12681, 12686, 12694, 12673, 12684, 12681, 12676, 12724, 12681, 12685, 12677, 12736, 12631, 12736, 26080, 20456, -17209, 12688, 12687, 12681, 12686, 12692, 12691, 12747, 28560, 21248, -17944, 8136, -7596, 4744, -10518, -8344, 3932, 5803};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f21204;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public JSONObject f21205;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23892 f21206;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public JSONObject f21207;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21208;

    public C6252(ActivityC23892 activityC23892, int i) {
        int i2 = 1398317198;
        int i3 = C2871.f10837;
        int i4 = C3577.f13150;
        this.f21206 = activityC23892;
        this.f21208 = i;
        int iM45029 = C19806.m45029("᩻۟") ^ i3;
        int i5 = ((iM45029 ^ i4) * 22597) ^ (-1958781493);
        int i6 = 958106312;
        while (true) {
            i2 = (iM45029 ^ i6) ^ (i5 & (((i2 ^ i4) * (-32169)) >> 31));
            switch (i2) {
                case -2128401598:
                case 1931791795:
                    C1937.m6279();
                    throw new RuntimeException();
                case -1887216110:
                case 1619148957:
                    C3743.m10966();
                    if (!C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8867)) ^ (-469308703);
                        i6 = 468538014;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨֨") ^ i4) * (-23);
                        i5 = ((iM45029 ^ i3) * 24483) ^ 1530734319;
                        i6 = 1634602109;
                    }
                    break;
                case -1380613493:
                case 1071538157:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C3660.m10791() == 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨֨") ^ i4) * (-23);
                        i5 = ((iM45029 ^ i3) * 24483) ^ 1530734319;
                        i6 = 1634602109;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۫ۖ")) * (-127);
                        i5 = ((iM45029 ^ i3) * (-31761)) ^ 772012723;
                        i6 = -1155875046;
                    }
                    break;
                case -592296737:
                case 1618647083:
                    return;
                case -498666669:
                case 1609566109:
                    C19806.m45024();
                    C2249.m6915();
                    iM45029 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-8867)) ^ (-469308703);
                    i6 = 468538014;
                    break;
                case 1204998508:
                case 1980812278:
                    if (C1025.f4800 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8867)) ^ (-469308703);
                        i6 = 468538014;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܿ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 30845) ^ 778385246;
                        i6 = 1354106832;
                    }
                    break;
                default:
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-17975)) ^ (-612739264);
                        i6 = -1926400440;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶᩴ") ^ i3) * (-99);
                        i5 = ((iM45029 ^ i4) * 9011) ^ 378512175;
                        i6 = 275166773;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        int i = 2052976111;
        int i2 = C7105.f23796;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = (C19806.m45029("ۧۗ") + i3) * (-3);
        int i4 = ((iM45029 ^ i2) * (-10229)) ^ (-574962931);
        int i5 = 2118166291;
        while (true) {
            i = ((((i ^ i2) * (-6285)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2128209701:
                case 1442648270:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۗ") + i3) * (-89);
                        i4 = ((iM45029 ^ i2) * 30825) ^ (-97373107);
                        i5 = 1135484430;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29769) ^ 68322324;
                        i5 = -538520292;
                    }
                    break;
                case -2100631853:
                case 122454172:
                    C3577.m10565();
                    break;
                case -2046273308:
                case 1179930292:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (C19806.m45029("ۚ᩷") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * 10827) ^ (-1145467648);
                        i5 = -2014166745;
                    } else {
                        iM45029 = C19806.m45029("ۤܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12899) ^ (-1366675682);
                        i5 = -1171735189;
                    }
                    break;
                case -1913438740:
                case -1908177293:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3907)) ^ 577601408;
                        i5 = 1135385665;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22531)) ^ (-723104795);
                        i5 = 1604406973;
                    }
                    break;
                case -1825822462:
                case -1626827360:
                    if (m17320()) {
                        iM45029 = C19806.m45029("᩵᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15719) ^ 1214019348;
                        i5 = 44205298;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۧۧ")) * 23;
                        i4 = ((iM45029 ^ i2) * (-20657)) ^ (-1584661559);
                        i5 = 1559774017;
                    }
                    break;
                case -1815179879:
                case 1656196984:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32465) ^ (-490449995);
                        i5 = -24118167;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29769) ^ 68322324;
                        i5 = -538520292;
                    }
                    break;
                case -1782194037:
                case 745856531:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3907)) ^ 577601408;
                        i5 = 1135385665;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-309)) ^ (-1982496811);
                        i5 = -184554847;
                    }
                    break;
                case -926572676:
                case -896162425:
                    C0671.m3019(this.f21206, exc, null);
                    iM45029 = (i3 - C19806.m45029("ۧۧ")) * 23;
                    i4 = ((iM45029 ^ i2) * (-20657)) ^ (-1584661559);
                    i5 = 1559774017;
                    break;
                case -535761137:
                case 2129131896:
                    if (!RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3907)) ^ 577601408;
                        i5 = 1135385665;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۙ") ^ i2) * (-5);
                        i4 = ((iM45029 ^ i3) * 2961) ^ (-1391300252);
                        i5 = 1664488851;
                    }
                    break;
                case -491896962:
                case 459401518:
                    C3577.m10565();
                    iM45029 = ThreadFactoryC3888.m11306("ۤۡ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 18767) ^ (-488517148);
                    i5 = -853014066;
                    break;
                case -478571317:
                case 887836272:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۙ") ^ i2) * (-5);
                        i4 = ((iM45029 ^ i3) * 2961) ^ (-1391300252);
                        i5 = 1664488851;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21783)) ^ 1642961511;
                        i5 = -1868776221;
                    }
                    break;
                case -316278469:
                case 736385040:
                    break;
                case -96219870:
                case 2063864802:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (C19806.m45029("ۚ᩷") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * 10827) ^ (-1145467648);
                        i5 = -2014166745;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2821)) ^ 2044444275;
                        i5 = 1201135199;
                    }
                    break;
                case 102296409:
                case 627667170:
                    C1189.m4368();
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3907)) ^ 577601408;
                        i5 = 1135385665;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 18767) ^ (-488517148);
                        i5 = -853014066;
                    }
                    break;
                case 374267770:
                case 1833048614:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4335)) ^ 1566394361;
                        i5 = 841934726;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29769) ^ 68322324;
                        i5 = -538520292;
                    }
                    break;
                case 1114829248:
                case 1866423196:
                    C0797.m3359();
                    if (!C0817.f3443) {
                        iM45029 = (C19806.m45029("ۚ᩷") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * 10827) ^ (-1145467648);
                        i5 = -2014166745;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 18767) ^ (-488517148);
                        i5 = -853014066;
                    }
                    break;
                case 1307625450:
                case 1884042376:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 18767) ^ (-488517148);
                        i5 = -853014066;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28923) ^ 1304004953;
                        i5 = -601199566;
                    }
                    break;
                default:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-10149)) ^ (-1541429869);
                        i5 = 1530987108;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩷") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * 10827) ^ (-1145467648);
                        i5 = -2014166745;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private final boolean m17320() {
        ActivityC23892 activityC23892 = null;
        int i = -1537165289;
        int i2 = C0050.f912;
        int i3 = C3577.f13150;
        int iM45029 = (C19806.m45029("֫᩶") ^ i3) * 67;
        int i4 = ((iM45029 ^ i2) * (-25799)) ^ 1023147856;
        int i5 = 146037309;
        while (true) {
            i = ((((i ^ i2) * 3687) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2064296372:
                case -1478336955:
                    return false;
                case -1995816163:
                case 1929527333:
                    return true;
                case -1954615979:
                case 1627953142:
                    activityC23892 = this.f21206;
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17397) ^ (-1663816725);
                        i5 = 1637820696;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۗۜ")) * 31;
                        i4 = ((iM45029 ^ i3) * 29189) ^ (-611926846);
                        i5 = 220145206;
                    }
                    break;
                case -1732232163:
                case -145772964:
                    if (C3577.m10578(activityC23892)) {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18127)) ^ (-1619073932);
                        i5 = -925073134;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨᩵")) * (-95);
                        i4 = ((iM45029 ^ i2) * (-23355)) ^ 136141594;
                        i5 = -1937988506;
                    }
                    break;
                case -1685769163:
                case -90345809:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ۧ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24225)) ^ 970645884;
                        i5 = 2007049102;
                    } else {
                        iM45029 = C19806.m45029("۠ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13401) ^ (-322163790);
                        i5 = -240110567;
                    }
                    break;
                case -1202793566:
                case -1200876539:
                    C1461.m5080();
                    return false;
                case -1180537518:
                case 1707099785:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17397) ^ (-1663816725);
                        i5 = 1637820696;
                    } else {
                        iM45029 = C19806.m45029("֨ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8505)) ^ 1625709818;
                        i5 = 1078566455;
                    }
                    break;
                case -1038510671:
                case -43645940:
                    if (MenuItemOnMenuItemClickListenerC3244.m9707()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֨۟")) * (-71);
                        i4 = ((iM45029 ^ i2) * (-2325)) ^ (-1854987036);
                        i5 = -575909973;
                    } else {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18127)) ^ (-1619073932);
                        i5 = -925073134;
                    }
                    break;
                case -857117801:
                case 900651718:
                    if (C13465.m32965((Object) activityC23892.f77399, (Object) C1875.m6109())) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜۖ")) * 127;
                        i4 = ((iM45029 ^ i3) * (-10399)) ^ 86305532;
                        i5 = 1103049994;
                    } else {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18127)) ^ (-1619073932);
                        i5 = -925073134;
                    }
                    break;
                case -744615442:
                case 1430869595:
                    if (C0050.m946() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16917)) ^ (-975563964);
                        i5 = 1013212615;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3243)) ^ 1127680774;
                        i5 = -15869949;
                    }
                    break;
                case -695063342:
                case 562011158:
                    if (RunnableC1895.f7152) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽ᩶")) * (-23);
                        i4 = ((iM45029 ^ i3) * (-30269)) ^ 2013363713;
                        i5 = -1278770641;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17397) ^ (-1663816725);
                        i5 = 1637820696;
                    }
                    break;
                case -618478365:
                case 873531124:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16917)) ^ (-975563964);
                        i5 = 1013212615;
                    } else {
                        iM45029 = C19806.m45029("ܿۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15977) ^ (-1548040492);
                        i5 = -813370495;
                    }
                    break;
                case -382110174:
                case 364973055:
                    RunnableC3388.m10064();
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17397) ^ (-1663816725);
                        i5 = 1637820696;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24225)) ^ 970645884;
                        i5 = 2007049102;
                    }
                    break;
                case -311651921:
                case 574246445:
                    C2788.m8472();
                    C1025.m3861();
                    iM45029 = C19806.m45029("֡ۡ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 31817) ^ 1636409079;
                    i5 = -194707679;
                    break;
                case -78478039:
                case 1239079224:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ۧ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24225)) ^ 970645884;
                        i5 = 2007049102;
                    } else {
                        iM45029 = C19806.m45029("֡ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31817) ^ 1636409079;
                        i5 = -194707679;
                    }
                    break;
                case 40100384:
                case 493581507:
                    if (activityC23892.isDestroyed()) {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18127)) ^ (-1619073932);
                        i5 = -925073134;
                    } else {
                        iM45029 = C19806.m45029("ۨ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1899) ^ 948453974;
                        i5 = -762814111;
                    }
                    break;
                case 207860192:
                case 1038054534:
                    if (C1461.m5080()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17397) ^ (-1663816725);
                        i5 = 1637820696;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۛ") + i3) * (-3);
                        i4 = ((iM45029 ^ i2) * 6243) ^ 2002970755;
                        i5 = 250232376;
                    }
                    break;
                case 636224160:
                case 1803398589:
                    if (C0629.m2907()) {
                        iM45029 = (C19806.m45029("᩷۟") + i2) * (-49);
                        i4 = ((iM45029 ^ i3) * (-23959)) ^ 727096867;
                        i5 = -398367494;
                    } else {
                        iM45029 = C19806.m45029("֡ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31817) ^ 1636409079;
                        i5 = -194707679;
                    }
                    break;
                case 801711353:
                case 1951486002:
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16917)) ^ (-975563964);
                        i5 = 1013212615;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30537)) ^ 1367574733;
                        i5 = -1150952997;
                    }
                    break;
                case 1212545266:
                case 1398637684:
                    if (this.f21208 == activityC23892.f77397) {
                        iM45029 = C19806.m45029("ܺ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24893)) ^ 332881215;
                        i5 = -1909200204;
                    } else {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18127)) ^ (-1619073932);
                        i5 = -925073134;
                    }
                    break;
                case 1884173844:
                case 2031924688:
                    if (C0671.m3008() >= 0) {
                        iM45029 = C19806.m45029("ۧ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24225)) ^ 970645884;
                        i5 = 2007049102;
                    } else {
                        iM45029 = C19806.m45029("ۙ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24667)) ^ 454285665;
                        i5 = 1508605088;
                    }
                    break;
                default:
                    if (C2704.m8255() <= 0) {
                        iM45029 = C19806.m45029("ۧ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24225)) ^ 970645884;
                        i5 = 2007049102;
                    } else {
                        iM45029 = C19806.m45029("ۗܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9173) ^ 954095670;
                        i5 = -291714728;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d9 A[PHI: r4 r7 r8
      0x00d9: PHI (r4v3 android.widget.ScrollView) = (r4v2 android.widget.ScrollView), (r4v5 android.widget.ScrollView) binds: [B:25:0x00d7, B:21:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:25:0x00d7, B:21:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:25:0x00d7, B:21:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x018c  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        if (l.C2642.m8171() != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (l.C2249.f8050 >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0075, code lost:
    
        if (l.C0797.m3359() != false) goto L8;
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1160() {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6252.mo1160():void");
    }

    /* JADX WARN: Code duplicated, block: B:171:0x1102 A[PHI: r4 r5 r7 r8 r9 r14 r17 r19 r22 r23 r25 r26 r30 r33 r35 r36 r37 r38 r39 r40 r41 r44 r45 r47 r51 r52 r53 r56 r57
      0x1102: PHI (r4v67 int) = (r4v25 int), (r4v38 int), (r4v69 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r5v41 l.ۙ۠᩺) = (r5v11 l.ۙ۠᩺), (r5v18 l.ۙ۠᩺), (r5v42 l.ۙ۠᩺) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r7v42 boolean) = (r7v13 boolean), (r7v16 boolean), (r7v45 boolean) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r8v64 org.json.JSONObject) = (r8v18 org.json.JSONObject), (r8v25 org.json.JSONObject), (r8v66 org.json.JSONObject) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r9v16 int) = (r9v2 int), (r9v2 int), (r9v18 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r14v35 int) = (r14v20 int), (r14v23 int), (r14v36 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r17v26 int) = (r17v7 int), (r17v13 int), (r17v27 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r19v24 boolean) = (r19v7 boolean), (r19v11 boolean), (r19v25 boolean) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r22v29 org.json.JSONObject) = (r22v7 org.json.JSONObject), (r22v14 org.json.JSONObject), (r22v30 org.json.JSONObject) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r23v29 android.widget.LinearLayout) = (r23v7 android.widget.LinearLayout), (r23v12 android.widget.LinearLayout), (r23v30 android.widget.LinearLayout) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r25v32 org.json.JSONArray) = (r25v7 org.json.JSONArray), (r25v14 org.json.JSONArray), (r25v33 org.json.JSONArray) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r26v32 int) = (r26v7 int), (r26v14 int), (r26v33 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r30v29 int) = (r30v7 int), (r30v13 int), (r30v30 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r33v28 int) = (r33v13 int), (r33v16 int), (r33v29 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r35v27 int) = (r35v12 int), (r35v15 int), (r35v28 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r36v30 int) = (r36v13 int), (r36v16 int), (r36v31 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r37v30 android.widget.TextView) = (r37v13 android.widget.TextView), (r37v16 android.widget.TextView), (r37v31 android.widget.TextView) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r38v35 int) = (r38v13 int), (r38v16 int), (r38v36 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r39v30 int) = (r39v13 int), (r39v16 int), (r39v31 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r40v35 int) = (r40v10 int), (r40v15 int), (r40v36 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r41v31 int) = (r41v14 int), (r41v17 int), (r41v32 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r44v32 float) = (r44v15 float), (r44v18 float), (r44v33 float) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r45v38 boolean) = (r45v13 boolean), (r45v18 boolean), (r45v39 boolean) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r47v35 android.widget.ImageView) = (r47v14 android.widget.ImageView), (r47v17 android.widget.ImageView), (r47v36 android.widget.ImageView) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r51v49 android.widget.LinearLayout$LayoutParams) = 
      (r51v18 android.widget.LinearLayout$LayoutParams)
      (r51v25 android.widget.LinearLayout$LayoutParams)
      (r51v50 android.widget.LinearLayout$LayoutParams)
     binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r52v30 int) = (r52v13 int), (r52v16 int), (r52v31 int) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r53v46 short[]) = (r53v15 short[]), (r53v22 short[]), (r53v47 short[]) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r56v21 java.lang.String) = (r56v8 java.lang.String), (r56v11 java.lang.String), (r56v22 java.lang.String) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x1102: PHI (r57v23 boolean) = (r57v8 boolean), (r57v11 boolean), (r57v24 boolean) binds: [B:170:0x1100, B:154:0x0ecb, B:94:0x07d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x021c  */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() throws Throwable {
        String str;
        boolean z;
        LinearLayout.LayoutParams layoutParams;
        int i;
        boolean z2;
        short[] sArr;
        JSONArray jSONArray;
        float f;
        boolean z3;
        TextView textView;
        int i2;
        short[] sArr2;
        int i3;
        ImageView imageView;
        int i4;
        int iM11306;
        int i5;
        boolean z4;
        int iM45029;
        int i6;
        int i7;
        int iM11307;
        int i8;
        int i9;
        boolean z5;
        JSONObject jSONObject;
        float f2;
        int iM11308;
        int i10;
        int i11;
        String str2;
        boolean z6;
        LinearLayout.LayoutParams layoutParams2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ImageView imageView2;
        TextView textView2;
        int i17;
        boolean z7;
        int i18;
        int i19;
        short[] sArr3;
        int iM450210;
        int i20;
        int i21;
        String str3;
        boolean z8;
        LinearLayout.LayoutParams layoutParams3;
        int i22;
        int i23;
        int i24;
        float f3;
        boolean z9;
        short[] sArr4;
        int i25;
        int i26;
        TextView textView3;
        int i27;
        int i28;
        int i29;
        ImageView imageView3;
        String strM5577;
        int iM450211;
        int i30;
        int i31;
        LinearLayout linearLayout;
        int i32;
        int i33;
        float f4;
        boolean z10;
        ImageView imageView4;
        int i34;
        int i35;
        TextView textViewM33407;
        int iM11309;
        int i36;
        int i37;
        LinearLayout.LayoutParams layoutParams4;
        int i38;
        int iM450212;
        int i39;
        int i40;
        C6252 c6252 = this;
        int i41 = 1042346345;
        int i42 = C2249.f8050;
        int i43 = C0278.f1572;
        int iM450213 = (C19806.m45029("᩷֫") ^ i43) * (-117);
        int i44 = ((iM450213 ^ i42) * (-32487)) ^ (-1086794044);
        int i45 = iM450213 ^ 1507307871;
        JSONObject jSONObject2 = null;
        JSONObject jSONObject3 = null;
        JSONArray jSONArray2 = null;
        DateFormat dateTimeInstance = null;
        LinearLayout linearLayout2 = null;
        LinearLayout linearLayout3 = null;
        ImageView imageView5 = null;
        TextView textViewM33408 = null;
        String str4 = null;
        short[] sArr5 = null;
        int i46 = 0;
        boolean z11 = false;
        int i47 = 0;
        int i48 = 0;
        int iM113010 = 0;
        boolean z12 = false;
        String str5 = null;
        int iM113011 = 0;
        int iM450214 = 0;
        int i49 = 0;
        boolean z13 = false;
        int iM113012 = 0;
        float f5 = 0.0f;
        int length = 0;
        boolean z14 = false;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int iM2304 = 0;
        int i54 = 0;
        int i55 = 0;
        float f6 = 0.0f;
        boolean z15 = false;
        Throwable th = null;
        C4531 c4531 = null;
        LinearLayout linearLayout4 = null;
        JSONObject jSONObject4 = null;
        TextView textView4 = null;
        String strM4040 = null;
        boolean z16 = false;
        int iM6106 = 0;
        String str6 = null;
        ActivityC23892 activityC23892 = null;
        LinearLayout linearLayout5 = null;
        LinearLayout.LayoutParams layoutParams5 = null;
        int i56 = 0;
        while (true) {
            i41 = i45 ^ (i44 & (((i41 ^ i42) * (-8053)) >> 31));
            switch (i41) {
                case -2055890988:
                case 895992073:
                    str = strM4040;
                    z = z11;
                    layoutParams = layoutParams5;
                    i = i48;
                    int i57 = i50;
                    i3 = i51;
                    iM2304 = iM2304;
                    i56 = i56;
                    f6 = f6;
                    i52 = i52;
                    i53 = i53;
                    textView = textView4;
                    i55 = i55;
                    i47 = i47;
                    imageView = imageView5;
                    i4 = i54;
                    z2 = z15;
                    sArr2 = sArr5;
                    linearLayout2.setGravity(i57);
                    linearLayout2.setBaselineAligned(z16);
                    C0674.m3027(linearLayout2);
                    z14 = z14;
                    linearLayout2.setClickable(z14);
                    float f7 = i3;
                    float f8 = 12;
                    i50 = i57;
                    linearLayout2.setPadding(C1460.m5054(f7), C1460.m5054(f8), C1460.m5054(f7), C1460.m5054(f8));
                    if (C1460.f5948 >= 0) {
                        f5 = f8;
                        int iM113013 = ThreadFactoryC3888.m11306("ۤۘ") ^ i42;
                        linearLayout5 = null;
                        i50 = i50;
                        layoutParams5 = layoutParams;
                        sArr5 = sArr2;
                        i48 = i;
                        i45 = iM113013 ^ (-1844653417);
                        i44 = ((iM113013 ^ i43) * 26887) ^ (-1861861275);
                        z14 = z14;
                        i47 = i47;
                        z15 = z2;
                        strM4040 = str;
                        textView4 = textView;
                        i52 = i52;
                        i54 = i4;
                        imageView5 = imageView;
                        iM2304 = iM2304;
                        i55 = i55;
                        i53 = i53;
                        i51 = i3;
                        f6 = f6;
                        z11 = z;
                        i56 = i56;
                    } else {
                        LinearLayout linearLayout6 = new LinearLayout(activityC23892);
                        linearLayout6.setOrientation(1);
                        boolean z17 = !z13;
                        TextView textViewM33409 = C13705.m33407(activityC23892, 14.0f, z17);
                        i51 = i3;
                        C1461.m5083(textViewM33409, RunnableC1606.m5479(jSONObject4, C0817.m3406(f21203, 74, 8, i46)));
                        C1937.m6278(linearLayout6, textViewM33409);
                        if (C7105.f23796 >= 0) {
                            z11 = z17;
                            i48 = i;
                            f5 = f8;
                            linearLayout5 = linearLayout6;
                            i9 = iM113011;
                            z5 = z12;
                            int iM113014 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i43) * (-111);
                            jSONArray2 = jSONArray2;
                            length = length;
                            sArr5 = sArr2;
                            jSONObject2 = jSONObject2;
                            iM113012 = iM113012;
                            z12 = z5;
                            iM113011 = i9;
                            z15 = z2;
                            layoutParams5 = layoutParams;
                            i45 = iM113014 ^ 711528815;
                            jSONObject3 = jSONObject3;
                            i54 = i4;
                            imageView5 = imageView;
                            i44 = ((iM113014 ^ i42) * (-15987)) ^ 1960368342;
                            c4531 = c4531;
                            linearLayout2 = linearLayout2;
                            i55 = i55;
                            i53 = i53;
                            c6252 = this;
                            i49 = i49;
                            f6 = f6;
                            strM4040 = str;
                            i56 = i56;
                            int i58 = i50;
                            z14 = z14;
                            i47 = i47;
                            textView4 = textView;
                            i52 = i52;
                            iM2304 = iM2304;
                            i51 = i51;
                            i50 = i58;
                        } else {
                            int iM113015 = ThreadFactoryC3888.m11306("ۤۛ") ^ i43;
                            int i59 = ((iM113015 ^ i42) * 17897) ^ (-618324466);
                            layoutParams5 = layoutParams;
                            sArr5 = sArr2;
                            i48 = i;
                            i45 = iM113015 ^ (-569064067);
                            z15 = z2;
                            strM4040 = str;
                            i54 = i4;
                            imageView5 = imageView;
                            i55 = i55;
                            i53 = i53;
                            f6 = f6;
                            i56 = i56;
                            linearLayout5 = linearLayout6;
                            i44 = i59;
                            z11 = z17;
                            f5 = f8;
                            z14 = z14;
                            i47 = i47;
                            textView4 = textView;
                            i52 = i52;
                            iM2304 = iM2304;
                            i51 = i51;
                            i50 = i50;
                        }
                    }
                    break;
                case -2044018654:
                case -755133800:
                    C1937.m6278(linearLayout2, textViewM33408);
                    layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                    if (RunnableC1895.m6173(linearLayout4) == 0) {
                        iM11306 = (C19806.m45029("᩺ᩴ") ^ i42) * 49;
                        i2 = ((iM11306 ^ i43) * (-6759)) ^ 1487969959;
                        i5 = 1223870443;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤܺ") + i43) * (-119);
                        i2 = ((iM11306 ^ i42) * 18729) ^ (-1133901809);
                        i5 = -2060781472;
                    }
                    i45 = iM11306 ^ i5;
                    i44 = i2;
                    break;
                case -1908840375:
                case -286860063:
                    RunnableC1564.m5345();
                    if (C2642.f10294 <= 0) {
                        str3 = strM4040;
                        z8 = z11;
                        layoutParams3 = layoutParams5;
                        i22 = i48;
                        i28 = i53;
                        i23 = i56;
                        strM5577 = str4;
                        i27 = i55;
                        f3 = f6;
                        sArr4 = sArr5;
                        imageView3 = imageView5;
                        i24 = i54;
                        z9 = z15;
                        TextView textView5 = textView4;
                        i25 = i47;
                        i26 = iM2304;
                        i29 = i52;
                        textView3 = textView5;
                        iM450211 = (ThreadFactoryC3888.m11306("ܰܺ") + i43) * (-5);
                        i30 = ((iM450211 ^ i42) * 29895) ^ (-1116469070);
                        i31 = -661115104;
                        int i60 = iM450211 ^ i31;
                        sArr5 = sArr4;
                        i55 = i27;
                        f6 = f3;
                        z15 = z9;
                        i48 = i22;
                        i53 = i28;
                        i56 = i23;
                        i54 = i24;
                        imageView5 = imageView3;
                        layoutParams5 = layoutParams3;
                        str4 = strM5577;
                        i45 = i60;
                        i44 = i30;
                        strM4040 = str3;
                        z11 = z8;
                        int i61 = i29;
                        iM2304 = i26;
                        i47 = i25;
                        textView4 = textView3;
                        i52 = i61;
                    } else {
                        iM11306 = (C19806.m45029("᩸ܶ") ^ i43) * (-17);
                        i2 = ((iM11306 ^ i42) * 1371) ^ 794354293;
                        i5 = 1955532752;
                        i45 = iM11306 ^ i5;
                        i44 = i2;
                    }
                    break;
                case -1851975032:
                case -1418268914:
                    textViewM33408.setPaintFlags(textViewM33408.getPaintFlags() | 16);
                    iM11306 = (C19806.m45029("۟ܶ") ^ i42) * (-65);
                    i2 = ((iM11306 ^ i43) * (-24685)) ^ 1771669095;
                    i5 = -196833744;
                    i45 = iM11306 ^ i5;
                    i44 = i2;
                    break;
                case -1817366927:
                case -427515499:
                    str = strM4040;
                    z = z11;
                    layoutParams = layoutParams5;
                    jSONArray = jSONArray2;
                    i56 = i56;
                    f6 = f6;
                    i53 = i53;
                    i55 = i55;
                    imageView5 = imageView5;
                    i54 = i54;
                    z4 = z15;
                    sArr = sArr5;
                    TextView textView6 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView6;
                    jSONObject4 = jSONArray.getJSONObject(i48);
                    C7105.m18988(jSONObject4, ThreadFactoryC3888.m11312(f21203, 51, 18, i46));
                    dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
                    z13 = jSONObject4.getBoolean(RunnableC0195.m1429(f21203, 69, 5, i46));
                    linearLayout2 = new LinearLayout(activityC23892);
                    if (C2642.f10294 > 0) {
                        iM45029 = C19806.m45029("ܿۡ") ^ i42;
                        i6 = ((iM45029 ^ i43) * 10185) ^ 217635207;
                        i7 = 1159078201;
                        int i62 = iM45029 ^ i7;
                        jSONArray2 = jSONArray;
                        i44 = i6;
                        layoutParams5 = layoutParams;
                        sArr5 = sArr;
                        z11 = z;
                        i45 = i62;
                        z15 = z4;
                        strM4040 = str;
                        i54 = i54;
                        imageView5 = imageView5;
                        i55 = i55;
                        i53 = i53;
                        f6 = f6;
                        i56 = i56;
                        int i510 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i510;
                    } else {
                        f = f6;
                        z3 = z4;
                        i56 = i56;
                        i54 = i54;
                        int iM113016 = ThreadFactoryC3888.m11306("۫ۧ") ^ i43;
                        jSONArray2 = jSONArray;
                        i44 = ((iM113016 ^ i42) * 25955) ^ (-73390636);
                        imageView5 = imageView5;
                        sArr5 = sArr;
                        z15 = z3;
                        i55 = i55;
                        i53 = i53;
                        z11 = z;
                        f6 = f;
                        strM4040 = str;
                        int i63 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i63;
                        LinearLayout.LayoutParams layoutParams6 = layoutParams;
                        i45 = iM113016 ^ (-1823558030);
                        layoutParams5 = layoutParams6;
                    }
                    break;
                case -1736546703:
                case 2073036394:
                    C2788.m8463(textViewM33408, C20368.f65970);
                    iM11306 = (C19806.m45029("۟ܶ") ^ i42) * (-65);
                    i2 = ((iM11306 ^ i43) * (-24685)) ^ 1771669095;
                    i5 = -196833744;
                    i45 = iM11306 ^ i5;
                    i44 = i2;
                    break;
                case -1701377618:
                case 79533147:
                    layoutParams5.topMargin = C1460.m5054(6);
                    iM11306 = (ThreadFactoryC3888.m11306("ۤܺ") + i43) * (-119);
                    i2 = ((iM11306 ^ i42) * 18729) ^ (-1133901809);
                    i5 = -2060781472;
                    i45 = iM11306 ^ i5;
                    i44 = i2;
                    break;
                case -1691280772:
                case -613201009:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        iM11306 = (C19806.m45029("᩸ܶ") ^ i43) * (-17);
                        i2 = ((iM11306 ^ i42) * 1371) ^ 794354293;
                        i5 = 1955532752;
                        i45 = iM11306 ^ i5;
                        i44 = i2;
                    } else {
                        str = strM4040;
                        layoutParams = layoutParams5;
                        i49 = i49;
                        iM113012 = iM113012;
                        jSONObject2 = jSONObject2;
                        length = length;
                        jSONArray2 = jSONArray2;
                        i56 = i56;
                        f6 = f6;
                        linearLayout2 = linearLayout2;
                        c4531 = c4531;
                        jSONObject3 = jSONObject3;
                        i53 = i53;
                        i55 = i55;
                        i9 = iM113011;
                        imageView = imageView5;
                        i4 = i54;
                        z2 = z15;
                        sArr2 = sArr5;
                        z5 = z12;
                        TextView textView7 = textView4;
                        i47 = i47;
                        z14 = z14;
                        i50 = i50;
                        i51 = i51;
                        iM2304 = iM2304;
                        i52 = i52;
                        textView = textView7;
                        int iM113017 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i43) * (-111);
                        jSONArray2 = jSONArray2;
                        length = length;
                        sArr5 = sArr2;
                        jSONObject2 = jSONObject2;
                        iM113012 = iM113012;
                        z12 = z5;
                        iM113011 = i9;
                        z15 = z2;
                        layoutParams5 = layoutParams;
                        i45 = iM113017 ^ 711528815;
                        jSONObject3 = jSONObject3;
                        i54 = i4;
                        imageView5 = imageView;
                        i44 = ((iM113017 ^ i42) * (-15987)) ^ 1960368342;
                        c4531 = c4531;
                        linearLayout2 = linearLayout2;
                        i55 = i55;
                        i53 = i53;
                        c6252 = this;
                        i49 = i49;
                        f6 = f6;
                        strM4040 = str;
                        i56 = i56;
                        int i511 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i511;
                    }
                    break;
                case -1680284800:
                case 1077718956:
                    strM4040 = strM4040;
                    z11 = z11;
                    layoutParams5 = layoutParams5;
                    int i64 = i48;
                    int i65 = i51;
                    int i66 = i53;
                    i56 = i56;
                    i55 = i55;
                    f6 = f6;
                    short[] sArr6 = sArr5;
                    imageView5 = imageView5;
                    i54 = i54;
                    z15 = z15;
                    TextView textView8 = textView4;
                    i47 = i47;
                    int i67 = iM2304;
                    i52 = i52;
                    textView = textView8;
                    iM2304 = i67;
                    C3722.m10890(RunnableC0195.m1436(activityC23892, ThreadFactoryC3888.m11306(C2642.m8172(f21203, 86, 3, i46)) ^ 2126082791), 0);
                    if (activityC23892.f77396 < 0) {
                        i53 = i66;
                        sArr5 = sArr6;
                        jSONObject2 = jSONObject2;
                        length = length;
                        z14 = z14;
                        i50 = i50;
                        i48 = i64;
                        i51 = i65;
                        i49 = i49;
                        linearLayout2 = linearLayout2;
                        c4531 = c4531;
                        jSONObject3 = jSONObject3;
                        iM113011 = iM113011;
                        z12 = z12;
                        iM113012 = iM113012;
                        jSONArray2 = jSONArray2;
                        iM11307 = C19806.m45029("ܽۘ") ^ i42;
                        i44 = ((iM11307 ^ i43) * 4423) ^ 1191574201;
                        i8 = -1968852211;
                        int i68 = iM11307 ^ i8;
                        jSONArray2 = jSONArray2;
                        length = length;
                        sArr5 = sArr5;
                        strM4040 = strM4040;
                        jSONObject2 = jSONObject2;
                        iM113012 = iM113012;
                        z12 = z12;
                        iM113011 = iM113011;
                        z15 = z15;
                        layoutParams5 = layoutParams5;
                        i45 = i68;
                        jSONObject3 = jSONObject3;
                        i54 = i54;
                        imageView5 = imageView5;
                        c6252 = this;
                        c4531 = c4531;
                        linearLayout2 = linearLayout2;
                        i55 = i55;
                        i53 = i53;
                        i49 = i49;
                        f6 = f6;
                        z11 = z11;
                        i56 = i56;
                        int i512 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i512;
                    } else {
                        int iM113018 = (ThreadFactoryC3888.m11306("ۨۛ") ^ i43) * 21;
                        sArr5 = sArr6;
                        i47 = i47;
                        f6 = f6;
                        z15 = z15;
                        i48 = i64;
                        i56 = i56;
                        textView4 = textView;
                        i52 = i52;
                        i54 = i54;
                        imageView5 = imageView5;
                        iM2304 = iM2304;
                        i55 = i55;
                        i51 = i65;
                        i53 = i66;
                        layoutParams5 = layoutParams5;
                        z11 = z11;
                        i45 = iM113018 ^ 203881415;
                        i44 = ((iM113018 ^ i42) * 6033) ^ (-1479729882);
                        strM4040 = strM4040;
                    }
                    break;
                case -1664176403:
                case -1014821657:
                    String str7 = strM4040;
                    boolean z18 = z11;
                    LinearLayout.LayoutParams layoutParams7 = layoutParams5;
                    JSONArray jSONArray3 = jSONArray2;
                    int i69 = iM2304;
                    i56 = i56;
                    f2 = f6;
                    int i70 = i52;
                    int i71 = i53;
                    TextView textView9 = textView4;
                    int i72 = i55;
                    int i73 = i47;
                    ImageView imageView6 = imageView5;
                    int i74 = i54;
                    boolean z19 = z15;
                    short[] sArr7 = sArr5;
                    i50 = 16;
                    z14 = true;
                    int i75 = length;
                    if (i48 < i75) {
                        iM11308 = ThreadFactoryC3888.m11306("֫֡") ^ i43;
                        i10 = ((iM11308 ^ i42) * 7551) ^ 2126373446;
                        i11 = -67954780;
                    } else {
                        iM11308 = (i42 - ThreadFactoryC3888.m11306("ܺۖ")) * 79;
                        i10 = ((iM11308 ^ i43) * 4491) ^ (-2034135979);
                        i11 = 712258708;
                    }
                    int i76 = iM11308 ^ i11;
                    jSONArray2 = jSONArray3;
                    length = i75;
                    i44 = i10;
                    layoutParams5 = layoutParams7;
                    sArr5 = sArr7;
                    strM4040 = str7;
                    z11 = z18;
                    i45 = i76;
                    i47 = i73;
                    z15 = z19;
                    textView4 = textView9;
                    i52 = i70;
                    i54 = i74;
                    imageView5 = imageView6;
                    iM2304 = i69;
                    i55 = i72;
                    i53 = i71;
                    i51 = 20;
                    f6 = f2;
                    i56 = i56;
                    break;
                case -1503292359:
                case 602497016:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i42) * (-119);
                        i2 = ((iM11306 ^ i43) * (-24063)) ^ (-276601203);
                        i5 = -1407585291;
                        i45 = iM11306 ^ i5;
                        i44 = i2;
                    } else {
                        str = strM4040;
                        z = z11;
                        layoutParams = layoutParams5;
                        jSONArray = jSONArray2;
                        f = f6;
                        z3 = z15;
                        sArr = sArr5;
                        i53 = i53;
                        i55 = i55;
                        imageView5 = imageView5;
                        TextView textView10 = textView4;
                        i47 = i47;
                        z14 = z14;
                        i50 = i50;
                        i51 = i51;
                        iM2304 = iM2304;
                        i52 = i52;
                        textView = textView10;
                        int iM113019 = ThreadFactoryC3888.m11306("۫ۧ") ^ i43;
                        jSONArray2 = jSONArray;
                        i44 = ((iM113019 ^ i42) * 25955) ^ (-73390636);
                        imageView5 = imageView5;
                        sArr5 = sArr;
                        z15 = z3;
                        i55 = i55;
                        i53 = i53;
                        z11 = z;
                        f6 = f;
                        strM4040 = str;
                        int i610 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i610;
                        LinearLayout.LayoutParams layoutParams8 = layoutParams;
                        i45 = iM113019 ^ (-1823558030);
                        layoutParams5 = layoutParams8;
                    }
                    break;
                case -1437470552:
                case -318469671:
                    if (C0050.m946() > 0) {
                        str = strM4040;
                        z = z11;
                        layoutParams = layoutParams5;
                        i = i48;
                        i3 = i51;
                        iM2304 = iM2304;
                        i56 = i56;
                        f6 = f6;
                        i52 = i52;
                        i53 = i53;
                        textView = textView4;
                        i55 = i55;
                        i47 = i47;
                        z14 = z14;
                        i50 = i50;
                        imageView = imageView5;
                        i4 = i54;
                        z2 = z15;
                        sArr2 = sArr5;
                        int iM1130110 = ThreadFactoryC3888.m11306("ۤۘ") ^ i42;
                        linearLayout5 = null;
                        i50 = i50;
                        layoutParams5 = layoutParams;
                        sArr5 = sArr2;
                        i48 = i;
                        i45 = iM1130110 ^ (-1844653417);
                        i44 = ((iM1130110 ^ i43) * 26887) ^ (-1861861275);
                        z14 = z14;
                        i47 = i47;
                        z15 = z2;
                        strM4040 = str;
                        textView4 = textView;
                        i52 = i52;
                        i54 = i4;
                        imageView5 = imageView;
                        iM2304 = iM2304;
                        i55 = i55;
                        i53 = i53;
                        i51 = i3;
                        f6 = f6;
                        z11 = z;
                        i56 = i56;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܺ") ^ i42) * 69;
                        i2 = ((iM11306 ^ i43) * (-24415)) ^ 108716580;
                        i5 = 27730335;
                        i45 = iM11306 ^ i5;
                        i44 = i2;
                    }
                    break;
                case -1419832841:
                case 883473916:
                    str = strM4040;
                    z = z11;
                    layoutParams = layoutParams5;
                    int i77 = i48;
                    float f9 = f6;
                    boolean z20 = z15;
                    TextView textViewM334010 = C13705.m33407(activityC23892, f9, z20);
                    C19806.m45022(textViewM334010, C19806.m45029(C1025.m3859(f21203, 95, 3, i46)) ^ 2129963256);
                    int i78 = i55;
                    textViewM334010.setGravity(i78);
                    i56 = i56;
                    f6 = f9;
                    int i79 = i54;
                    LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(i79, i56);
                    z4 = z20;
                    layoutParams9.topMargin = AbstractC0464.m2304(6);
                    LinearLayout linearLayout7 = linearLayout3;
                    C1668.m5573(linearLayout7, textViewM334010, layoutParams9);
                    C1189.m4369(linearLayout4, linearLayout7, new LinearLayout.LayoutParams(i79, i56));
                    i53 = i53;
                    imageView5 = imageView5;
                    sArr = sArr5;
                    i48 = i77;
                    i54 = i79;
                    i55 = i78;
                    jSONArray = jSONArray2;
                    TextView textView11 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView11;
                    iM45029 = C19806.m45029("ۖ᩶") ^ i43;
                    i6 = ((iM45029 ^ i42) * (-5623)) ^ 644735876;
                    i7 = 1565213355;
                    int i611 = iM45029 ^ i7;
                    jSONArray2 = jSONArray;
                    i44 = i6;
                    layoutParams5 = layoutParams;
                    sArr5 = sArr;
                    z11 = z;
                    i45 = i611;
                    z15 = z4;
                    strM4040 = str;
                    i54 = i54;
                    imageView5 = imageView5;
                    i55 = i55;
                    i53 = i53;
                    f6 = f6;
                    i56 = i56;
                    int i513 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i513;
                    break;
                case -1344237372:
                case 997754488:
                    String str8 = strM4040;
                    boolean z21 = z11;
                    layoutParams5 = layoutParams5;
                    int i80 = i49;
                    iM113012 = iM113012;
                    jSONObject2 = jSONObject2;
                    length = length;
                    jSONArray2 = jSONArray2;
                    i56 = i56;
                    f6 = f6;
                    linearLayout2 = linearLayout2;
                    c4531 = c4531;
                    jSONObject3 = jSONObject3;
                    i53 = i53;
                    i55 = i55;
                    ImageView imageView7 = imageView5;
                    int i81 = i54;
                    z15 = z15;
                    sArr5 = sArr5;
                    TextView textView12 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView12;
                    iM113011 = ThreadFactoryC3888.m11306(C3286.m9788(f21203, 21, 3, i46)) ^ 2117452523;
                    iM450214 = C19806.m45029(C2704.m8240(f21203, 24, 3, i46)) ^ 2101893777;
                    str6 = "";
                    activityC23892 = c6252.f21206;
                    if (str5 != null) {
                        int iM113020 = (i43 - ThreadFactoryC3888.m11306("ܰ᩻")) * 127;
                        i44 = ((iM113020 ^ i42) * (-8927)) ^ (-1114047132);
                        z12 = false;
                        i45 = iM113020 ^ 618480479;
                    } else {
                        int iM450215 = C19806.m45029("ᩴۛ") ^ i43;
                        z12 = false;
                        i45 = iM450215 ^ 2102548751;
                        i44 = ((iM450215 ^ i42) * 3575) ^ (-590717901);
                    }
                    i49 = i80;
                    i54 = i81;
                    imageView5 = imageView7;
                    strM4040 = str8;
                    z11 = z21;
                    i55 = i55;
                    i53 = i53;
                    f6 = f6;
                    i56 = i56;
                    int i514 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i514;
                    break;
                case -1333232338:
                case -307402721:
                    textView = textView4;
                    i46 = 7359;
                    iM11307 = (C19806.m45029("۠ۗ") + i42) * (-85);
                    i44 = ((iM11307 ^ i43) * 27763) ^ 389582519;
                    i8 = 2088271908;
                    int i612 = iM11307 ^ i8;
                    jSONArray2 = jSONArray2;
                    length = length;
                    sArr5 = sArr5;
                    strM4040 = strM4040;
                    jSONObject2 = jSONObject2;
                    iM113012 = iM113012;
                    z12 = z12;
                    iM113011 = iM113011;
                    z15 = z15;
                    layoutParams5 = layoutParams5;
                    i45 = i612;
                    jSONObject3 = jSONObject3;
                    i54 = i54;
                    imageView5 = imageView5;
                    c6252 = this;
                    c4531 = c4531;
                    linearLayout2 = linearLayout2;
                    i55 = i55;
                    i53 = i53;
                    i49 = i49;
                    f6 = f6;
                    z11 = z11;
                    i56 = i56;
                    int i515 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i515;
                    break;
                case -1318028578:
                case 1184450404:
                    layoutParams4 = layoutParams5;
                    i38 = i48;
                    C1189.m4369(linearLayout2, linearLayout5, new LinearLayout.LayoutParams(0, -2, 1.0f));
                    textViewM33408 = C13705.m33407(activityC23892, 14.0f, z11);
                    iM6106 = C1875.m6106(jSONObject4, C0817.m3406(f21203, q.h, 6, i46));
                    if (iM6106 > 0) {
                        int iM113021 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i43;
                        layoutParams5 = layoutParams4;
                        i48 = i38;
                        i45 = iM113021 ^ (-148967159);
                        i44 = ((iM113021 ^ i42) * 14591) ^ (-1466018513);
                        i47 = 0;
                    } else {
                        strM4040 = str6;
                        i47 = 0;
                        iM450212 = C19806.m45029("᩻᩵") ^ i43;
                        i39 = ((iM450212 ^ i42) * 27677) ^ 1564847856;
                        i40 = 2074298318;
                        int i82 = iM450212 ^ i40;
                        i48 = i38;
                        LinearLayout.LayoutParams layoutParams10 = layoutParams4;
                        i45 = i82;
                        i44 = i39;
                        layoutParams5 = layoutParams10;
                    }
                    break;
                case -1272850015:
                case -459435503:
                    if (iM6106 > 0) {
                        iM11306 = C19806.m45029("ܰ֨") ^ i42;
                        i2 = ((iM11306 ^ i43) * 11393) ^ 354766443;
                        i5 = 1478349670;
                    } else {
                        iM11306 = (C19806.m45029("۟ܶ") ^ i42) * (-65);
                        i2 = ((iM11306 ^ i43) * (-24685)) ^ 1771669095;
                        i5 = -196833744;
                    }
                    i45 = iM11306 ^ i5;
                    i44 = i2;
                    break;
                case -1271898133:
                case 1415651621:
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("᩸ܶ") ^ i43) * (-17);
                        i2 = ((iM11306 ^ i42) * 1371) ^ 794354293;
                        i5 = 1955532752;
                    } else {
                        iM11306 = C19806.m45029("ܳ۠") ^ i42;
                        i2 = ((iM11306 ^ i43) * 24295) ^ 578353655;
                        i5 = -2105191214;
                    }
                    i45 = iM11306 ^ i5;
                    i44 = i2;
                    break;
                case -1185791813:
                case -924377292:
                    String str9 = strM4040;
                    int i83 = iM113011;
                    int i84 = i49;
                    jSONObject2 = jSONObject2;
                    JSONObject jSONObject5 = jSONObject3;
                    length = length;
                    LinearLayout linearLayout8 = linearLayout2;
                    z12 = z12;
                    iM113012 = iM113012;
                    jSONArray2 = jSONArray2;
                    int i85 = i53;
                    int i86 = i55;
                    ImageView imageView8 = imageView5;
                    int i87 = i54;
                    textView = textView4;
                    activityC23892.f77396 = -1;
                    activityC23892.f77395 = "";
                    activityC23892.f77401 = "";
                    C4531 c4532 = activityC23892.f77400;
                    if (c4532 != null) {
                        int iM113022 = ThreadFactoryC3888.m11306("ۤۡ") ^ i42;
                        i44 = ((iM113022 ^ i43) * (-25603)) ^ 867717593;
                        iM113011 = i83;
                        i45 = iM113022 ^ (-1065200247);
                    } else {
                        int iM113023 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i42;
                        iM113011 = i83;
                        i45 = iM113023 ^ 893025288;
                        i44 = ((iM113023 ^ i43) * (-4757)) ^ 11838977;
                    }
                    jSONObject3 = jSONObject5;
                    linearLayout2 = linearLayout8;
                    i54 = i87;
                    imageView5 = imageView8;
                    c4531 = c4532;
                    i49 = i84;
                    i55 = i86;
                    i53 = i85;
                    strM4040 = str9;
                    z11 = z11;
                    f6 = f6;
                    i56 = i56;
                    int i516 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i516;
                    break;
                case -1184244083:
                case 1383030668:
                    if (C3577.f13150 >= 0) {
                        str = strM4040;
                        z = z11;
                        layoutParams = layoutParams5;
                        jSONArray = jSONArray2;
                        f = f6;
                        z3 = z15;
                        sArr = sArr5;
                        i53 = i53;
                        i55 = i55;
                        imageView5 = imageView5;
                        TextView textView13 = textView4;
                        i47 = i47;
                        z14 = z14;
                        i50 = i50;
                        i51 = i51;
                        iM2304 = iM2304;
                        i52 = i52;
                        textView = textView13;
                        int iM1130111 = ThreadFactoryC3888.m11306("۫ۧ") ^ i43;
                        jSONArray2 = jSONArray;
                        i44 = ((iM1130111 ^ i42) * 25955) ^ (-73390636);
                        imageView5 = imageView5;
                        sArr5 = sArr;
                        z15 = z3;
                        i55 = i55;
                        i53 = i53;
                        z11 = z;
                        f6 = f;
                        strM4040 = str;
                        int i613 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i613;
                        LinearLayout.LayoutParams layoutParams11 = layoutParams;
                        i45 = iM1130111 ^ (-1823558030);
                        layoutParams5 = layoutParams11;
                    } else {
                        str3 = strM4040;
                        z8 = z11;
                        layoutParams3 = layoutParams5;
                        i22 = i48;
                        i28 = i53;
                        i23 = i56;
                        strM5577 = str4;
                        i27 = i55;
                        f3 = f6;
                        sArr4 = sArr5;
                        imageView3 = imageView5;
                        i24 = i54;
                        z9 = z15;
                        TextView textView14 = textView4;
                        i25 = i47;
                        i26 = iM2304;
                        i29 = i52;
                        textView3 = textView14;
                        iM450211 = (ThreadFactoryC3888.m11306("ܰܺ") + i43) * (-5);
                        i30 = ((iM450211 ^ i42) * 29895) ^ (-1116469070);
                        i31 = -661115104;
                        int i614 = iM450211 ^ i31;
                        sArr5 = sArr4;
                        i55 = i27;
                        f6 = f3;
                        z15 = z9;
                        i48 = i22;
                        i53 = i28;
                        i56 = i23;
                        i54 = i24;
                        imageView5 = imageView3;
                        layoutParams5 = layoutParams3;
                        str4 = strM5577;
                        i45 = i614;
                        i44 = i30;
                        strM4040 = str3;
                        z11 = z8;
                        int i615 = i29;
                        iM2304 = i26;
                        i47 = i25;
                        textView4 = textView3;
                        i52 = i615;
                    }
                    break;
                case -1123722299:
                case 1254491481:
                    return;
                case -1027680445:
                case 687577095:
                    textView = textView4;
                    i46 = 12768;
                    iM11307 = (C19806.m45029("۠ۗ") + i42) * (-85);
                    i44 = ((iM11307 ^ i43) * 27763) ^ 389582519;
                    i8 = 2088271908;
                    int i616 = iM11307 ^ i8;
                    jSONArray2 = jSONArray2;
                    length = length;
                    sArr5 = sArr5;
                    strM4040 = strM4040;
                    jSONObject2 = jSONObject2;
                    iM113012 = iM113012;
                    z12 = z12;
                    iM113011 = iM113011;
                    z15 = z15;
                    layoutParams5 = layoutParams5;
                    i45 = i616;
                    jSONObject3 = jSONObject3;
                    i54 = i54;
                    imageView5 = imageView5;
                    c6252 = this;
                    c4531 = c4531;
                    linearLayout2 = linearLayout2;
                    i55 = i55;
                    i53 = i53;
                    i49 = i49;
                    f6 = f6;
                    z11 = z11;
                    i56 = i56;
                    int i517 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i517;
                    break;
                case -1025693415:
                case 1020085901:
                    C3535.m10426(C0817.m3406(f21203, 40, 6, i46));
                    throw th;
                case -1016915347:
                case -631510796:
                    str2 = strM4040;
                    z6 = z11;
                    layoutParams2 = layoutParams5;
                    i12 = i48;
                    i13 = i51;
                    int i88 = i53;
                    i14 = iM2304;
                    i56 = i56;
                    i15 = i55;
                    f2 = f6;
                    i16 = i52;
                    imageView2 = imageView5;
                    textView2 = textView4;
                    i17 = i54;
                    z7 = z15;
                    i18 = i47;
                    TextView textViewM334011 = C13705.m33407((Context) activityC23892, 12.0f, true);
                    i19 = i88;
                    sArr3 = sArr5;
                    C1461.m5083(textViewM334011, dateTimeInstance.format(new Date(jSONObject4.getLong(C3722.m10901(f21203, 82, 4, i46)))));
                    C1937.m6278(linearLayout5, textViewM334011);
                    if (z13) {
                        iM450210 = (i42 - ThreadFactoryC3888.m11306("ۤ᩷")) * (-21);
                        i20 = ((iM450210 ^ i43) * (-11541)) ^ 1803983563;
                        i21 = 1903641616;
                    } else {
                        iM450210 = C19806.m45029("᩸ᩴ") ^ i42;
                        i20 = ((iM450210 ^ i43) * (-15123)) ^ 1377049154;
                        i21 = -1916002998;
                    }
                    int i89 = iM450210 ^ i21;
                    i47 = i18;
                    layoutParams5 = layoutParams2;
                    sArr5 = sArr3;
                    i48 = i12;
                    i45 = i89;
                    i44 = i20;
                    textView4 = textView2;
                    i52 = i16;
                    z15 = z7;
                    strM4040 = str2;
                    iM2304 = i14;
                    i54 = i17;
                    imageView5 = imageView2;
                    i51 = i13;
                    i55 = i15;
                    i53 = i19;
                    z11 = z6;
                    f6 = f2;
                    i56 = i56;
                    break;
                case -932430907:
                case 635842448:
                    C7321 c7321 = C7321.f24318;
                    C1189.m4369(linearLayout4, linearLayout2, layoutParams5);
                    i48++;
                    jSONObject = jSONObject3;
                    z16 = false;
                    textView = textView4;
                    int iM113024 = (ThreadFactoryC3888.m11306("ܿۘ") ^ i43) * 93;
                    jSONObject3 = jSONObject;
                    layoutParams5 = layoutParams5;
                    sArr5 = sArr5;
                    strM4040 = strM4040;
                    i45 = iM113024 ^ 1997459969;
                    i44 = ((iM113024 ^ i42) * 18603) ^ 1828047497;
                    z15 = z15;
                    z11 = z11;
                    i54 = i54;
                    imageView5 = imageView5;
                    i55 = i55;
                    i53 = i53;
                    f6 = f6;
                    i56 = i56;
                    int i518 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i518;
                    break;
                case -924989618:
                case 1657040134:
                    strM4040 = strM4040;
                    z11 = z11;
                    layoutParams5 = layoutParams5;
                    i49 = i49;
                    jSONObject2 = jSONObject2;
                    length = length;
                    i56 = i56;
                    f6 = f6;
                    linearLayout2 = linearLayout2;
                    c4531 = c4531;
                    jSONObject3 = jSONObject3;
                    i53 = i53;
                    i55 = i55;
                    iM113011 = iM113011;
                    imageView5 = imageView5;
                    i54 = i54;
                    z15 = z15;
                    sArr5 = sArr5;
                    z12 = z12;
                    iM113012 = iM113012;
                    jSONArray2 = jSONArray2;
                    TextView textView15 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView15;
                    if (m17320()) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩵᩺") ^ i43) * 83;
                        i44 = ((iM11307 ^ i42) * (-30499)) ^ 1738004286;
                        i8 = 1399246967;
                    } else {
                        iM11307 = C19806.m45029("ܽۘ") ^ i42;
                        i44 = ((iM11307 ^ i43) * 4423) ^ 1191574201;
                        i8 = -1968852211;
                    }
                    int i617 = iM11307 ^ i8;
                    jSONArray2 = jSONArray2;
                    length = length;
                    sArr5 = sArr5;
                    strM4040 = strM4040;
                    jSONObject2 = jSONObject2;
                    iM113012 = iM113012;
                    z12 = z12;
                    iM113011 = iM113011;
                    z15 = z15;
                    layoutParams5 = layoutParams5;
                    i45 = i617;
                    jSONObject3 = jSONObject3;
                    i54 = i54;
                    imageView5 = imageView5;
                    c6252 = this;
                    c4531 = c4531;
                    linearLayout2 = linearLayout2;
                    i55 = i55;
                    i53 = i53;
                    i49 = i49;
                    f6 = f6;
                    z11 = z11;
                    i56 = i56;
                    int i519 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i519;
                    break;
                case -896205634:
                case 1727245539:
                    ScrollView scrollView = (ScrollView) RunnableC0195.m1436(activityC23892, ThreadFactoryC3888.m11306(C1460.m5047(f21203, 122, 3, i46)) ^ 2118197379);
                    ViewTreeObserverOnPreDrawListenerC22337.m49503(scrollView, new RunnableC17541(c6252, activityC23892, scrollView));
                    return;
                case -850672926:
                case 1948964809:
                    str = strM4040;
                    z = z11;
                    layoutParams = layoutParams5;
                    jSONArray = jSONArray2;
                    i56 = i56;
                    f6 = f6;
                    i53 = i53;
                    i55 = i55;
                    imageView5 = imageView5;
                    i54 = i54;
                    z4 = z15;
                    sArr = sArr5;
                    TextView textView16 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView16;
                    if (RunnableC1895.m6173(linearLayout4) == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۟") ^ i42;
                        i6 = ((iM45029 ^ i43) * (-9369)) ^ 139428735;
                        i7 = -534162424;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩶") ^ i43;
                        i6 = ((iM45029 ^ i42) * (-5623)) ^ 644735876;
                        i7 = 1565213355;
                    }
                    int i618 = iM45029 ^ i7;
                    jSONArray2 = jSONArray;
                    i44 = i6;
                    layoutParams5 = layoutParams;
                    sArr5 = sArr;
                    z11 = z;
                    i45 = i618;
                    z15 = z4;
                    strM4040 = str;
                    i54 = i54;
                    imageView5 = imageView5;
                    i55 = i55;
                    i53 = i53;
                    f6 = f6;
                    i56 = i56;
                    int i5110 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i5110;
                    break;
                case -801763538:
                case 1445441028:
                    strM4040 = strM4040;
                    z11 = z11;
                    layoutParams5 = layoutParams5;
                    i49 = i49;
                    jSONObject2 = jSONObject2;
                    length = length;
                    i56 = i56;
                    f6 = f6;
                    linearLayout2 = linearLayout2;
                    c4531 = c4531;
                    jSONObject3 = jSONObject3;
                    i53 = i53;
                    i55 = i55;
                    iM113011 = iM113011;
                    imageView5 = imageView5;
                    i54 = i54;
                    z15 = z15;
                    sArr5 = sArr5;
                    z12 = z12;
                    iM113012 = iM113012;
                    jSONArray2 = jSONArray2;
                    TextView textView17 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView17;
                    short s = f21203[14];
                    if ((s * 7148) - ((s * s) + 12773476) > 0) {
                        iM11307 = (i43 - C19806.m45029("ܶۡ")) * (-5);
                        i44 = ((iM11307 ^ i42) * (-18507)) ^ 1643121862;
                        i8 = -600239558;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i42;
                        i44 = ((iM11307 ^ i43) * (-9771)) ^ 590876065;
                        i8 = -392681551;
                    }
                    int i619 = iM11307 ^ i8;
                    jSONArray2 = jSONArray2;
                    length = length;
                    sArr5 = sArr5;
                    strM4040 = strM4040;
                    jSONObject2 = jSONObject2;
                    iM113012 = iM113012;
                    z12 = z12;
                    iM113011 = iM113011;
                    z15 = z15;
                    layoutParams5 = layoutParams5;
                    i45 = i619;
                    jSONObject3 = jSONObject3;
                    i54 = i54;
                    imageView5 = imageView5;
                    c6252 = this;
                    c4531 = c4531;
                    linearLayout2 = linearLayout2;
                    i55 = i55;
                    i53 = i53;
                    i49 = i49;
                    f6 = f6;
                    z11 = z11;
                    i56 = i56;
                    int i5111 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i5111;
                    break;
                case -748424440:
                case 541777411:
                    str = strM4040;
                    boolean z22 = z11;
                    layoutParams = layoutParams5;
                    int i90 = i48;
                    ImageView imageView9 = imageView5;
                    textView = textView4;
                    i56 = i56;
                    i4 = i54;
                    i55 = i55;
                    f6 = f6;
                    z2 = z15;
                    short[] sArr8 = sArr5;
                    i47 = i47;
                    LinearLayout linearLayout9 = new LinearLayout(activityC23892);
                    linearLayout9.setOrientation(1);
                    linearLayout9.setGravity(1);
                    int i91 = i51;
                    float f10 = i91;
                    iM2304 = AbstractC0464.m2304(f10);
                    int iM5054 = C1460.m5054(52);
                    int iM5055 = C1460.m5054(f10);
                    if (C2477.f9839 <= 0) {
                        imageView = imageView9;
                        linearLayout3 = linearLayout9;
                        i53 = iM5055;
                        sArr2 = sArr8;
                        z14 = z14;
                        i50 = i50;
                        iM2304 = iM2304;
                        i48 = i90;
                        i51 = i91;
                        i52 = iM5054;
                        z11 = z22;
                        i9 = iM113011;
                        z5 = z12;
                        int iM1130112 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i43) * (-111);
                        jSONArray2 = jSONArray2;
                        length = length;
                        sArr5 = sArr2;
                        jSONObject2 = jSONObject2;
                        iM113012 = iM113012;
                        z12 = z5;
                        iM113011 = i9;
                        z15 = z2;
                        layoutParams5 = layoutParams;
                        i45 = iM1130112 ^ 711528815;
                        jSONObject3 = jSONObject3;
                        i54 = i4;
                        imageView5 = imageView;
                        i44 = ((iM1130112 ^ i42) * (-15987)) ^ 1960368342;
                        c4531 = c4531;
                        linearLayout2 = linearLayout2;
                        i55 = i55;
                        i53 = i53;
                        c6252 = this;
                        i49 = i49;
                        f6 = f6;
                        strM4040 = str;
                        i56 = i56;
                        int i5112 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i5112;
                    } else {
                        int iM113025 = (i43 - ThreadFactoryC3888.m11306("ۙۙ")) * 95;
                        i44 = ((iM113025 ^ i42) * 25165) ^ (-2140845279);
                        linearLayout3 = linearLayout9;
                        sArr5 = sArr8;
                        f6 = f6;
                        z15 = z2;
                        i48 = i90;
                        strM4040 = str;
                        i56 = i56;
                        i54 = i4;
                        imageView5 = imageView9;
                        i55 = i55;
                        i53 = iM5055;
                        i47 = i47;
                        textView4 = textView;
                        i52 = iM5054;
                        layoutParams5 = layoutParams;
                        i45 = iM113025 ^ (-1360089967);
                        i51 = i91;
                        z11 = z22;
                    }
                    break;
                case -666275084:
                case 1309422530:
                    str2 = strM4040;
                    z6 = z11;
                    layoutParams2 = layoutParams5;
                    i12 = i48;
                    linearLayout = linearLayout3;
                    i32 = i56;
                    int i92 = i54;
                    i33 = i55;
                    f4 = f6;
                    z10 = z15;
                    imageView4 = imageView5;
                    imageView4.setImageResource(ThreadFactoryC3888.m11306(str4) ^ 2127335714);
                    imageView4.setImageTintList(ColorStateList.valueOf(C20368.f65969));
                    imageView4.setImportantForAccessibility(2);
                    i34 = i92;
                    float f11 = 36;
                    i35 = i47;
                    C1189.m4369(linearLayout, imageView4, new LinearLayout.LayoutParams(C1460.m5054(f11), C1460.m5054(f11)));
                    textViewM33407 = C13705.m33407((Context) activityC23892, 15.0f, false);
                    sArr5 = f21203;
                    if (C2642.f10294 <= 0) {
                        iM11309 = C19806.m45029("ܳ᩷") ^ i43;
                        i36 = ((iM11309 ^ i42) * 8301) ^ 852382717;
                        i37 = -1156419846;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("ܺ᩻") ^ i42) * 39;
                        i36 = ((iM11309 ^ i43) * 1045) ^ 1265328671;
                        i37 = 307892032;
                    }
                    int i93 = iM11309 ^ i37;
                    linearLayout3 = linearLayout;
                    i55 = i33;
                    f6 = f4;
                    z15 = z10;
                    layoutParams5 = layoutParams2;
                    strM4040 = str2;
                    i45 = i93;
                    i56 = i32;
                    i54 = i34;
                    z11 = z6;
                    imageView5 = imageView4;
                    i48 = i12;
                    int i94 = i35;
                    textView4 = textViewM33407;
                    i44 = i36;
                    i47 = i94;
                    break;
                case -648015773:
                case 1130499633:
                    str = strM4040;
                    boolean z23 = z11;
                    LinearLayout.LayoutParams layoutParams12 = layoutParams5;
                    int i95 = iM113011;
                    int i96 = iM450214;
                    int i97 = i49;
                    JSONObject jSONObject6 = jSONObject3;
                    int i98 = length;
                    i56 = i56;
                    f6 = f6;
                    LinearLayout linearLayout10 = linearLayout2;
                    boolean z24 = z12;
                    C4531 c4533 = c4531;
                    int i99 = iM113012;
                    JSONArray jSONArray4 = jSONArray2;
                    int i100 = i53;
                    int i101 = i55;
                    ImageView imageView10 = imageView5;
                    int i102 = i54;
                    boolean z25 = z15;
                    short[] sArr9 = sArr5;
                    TextView textView18 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView18;
                    LinearLayout linearLayout11 = (LinearLayout) C2332.m7083(activityC23892, i96);
                    JSONObject jSONObject7 = c6252.f21207;
                    if (jSONObject7 != null) {
                        int iM113026 = (ThreadFactoryC3888.m11306("ۚᩴ") + i42) * (-107);
                        i44 = ((iM113026 ^ i43) * (-27911)) ^ 1788515446;
                        jSONArray2 = jSONArray4;
                        length = i98;
                        jSONObject2 = jSONObject7;
                        sArr5 = sArr9;
                        jSONObject3 = jSONObject6;
                        iM113012 = i99;
                        z12 = z24;
                        z15 = z25;
                        strM4040 = str;
                        iM113011 = i95;
                        linearLayout4 = linearLayout11;
                        i54 = i102;
                        imageView5 = imageView10;
                        iM450214 = i96;
                        i55 = i101;
                        layoutParams5 = layoutParams12;
                        i53 = i100;
                        i45 = iM113026 ^ (-653525239);
                        f6 = f6;
                        c4531 = c4533;
                        i56 = i56;
                        linearLayout2 = linearLayout10;
                        i49 = i97;
                        z11 = z23;
                    } else {
                        int iM113027 = (ThreadFactoryC3888.m11306("۟۫") + i43) * 27;
                        jSONArray2 = jSONArray4;
                        length = i98;
                        jSONObject2 = jSONObject7;
                        sArr5 = sArr9;
                        iM113012 = i99;
                        z12 = z24;
                        jSONObject3 = jSONObject6;
                        z15 = z25;
                        c4531 = c4533;
                        iM113011 = i95;
                        linearLayout4 = linearLayout11;
                        linearLayout2 = linearLayout10;
                        i54 = i102;
                        imageView5 = imageView10;
                        i49 = i97;
                        iM450214 = i96;
                        i55 = i101;
                        layoutParams5 = layoutParams12;
                        i53 = i100;
                        z11 = z23;
                        i45 = iM113027 ^ 2083314954;
                        i44 = ((iM113027 ^ i42) * 15239) ^ 925801834;
                        f6 = f6;
                        strM4040 = str;
                        i56 = i56;
                    }
                    int i5113 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i5113;
                    break;
                case -539761263:
                case 1840292074:
                    str = strM4040;
                    boolean z26 = z11;
                    linearLayout2 = linearLayout2;
                    layoutParams = layoutParams5;
                    c4531 = c4531;
                    jSONObject2 = jSONObject2;
                    jSONObject3 = jSONObject3;
                    length = length;
                    jSONArray2 = jSONArray2;
                    i56 = i56;
                    f6 = f6;
                    i9 = iM113011;
                    i53 = i53;
                    i55 = i55;
                    z5 = z12;
                    imageView = imageView5;
                    i4 = i54;
                    z2 = z15;
                    sArr2 = sArr5;
                    TextView textView19 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView19;
                    String str10 = c6252.f21204;
                    iM113010 = ThreadFactoryC3888.m11306(C1189.m4365(f21203, 15, 3, i46)) ^ 2119481846;
                    th = null;
                    iM113012 = ThreadFactoryC3888.m11306(RunnableC1895.m6164(f21203, 18, 3, i46)) ^ 2125927503;
                    if (!RunnableC1895.f7152) {
                        str5 = str10;
                        z11 = z26;
                        i49 = 8;
                        int iM1130113 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i43) * (-111);
                        jSONArray2 = jSONArray2;
                        length = length;
                        sArr5 = sArr2;
                        jSONObject2 = jSONObject2;
                        iM113012 = iM113012;
                        z12 = z5;
                        iM113011 = i9;
                        z15 = z2;
                        layoutParams5 = layoutParams;
                        i45 = iM1130113 ^ 711528815;
                        jSONObject3 = jSONObject3;
                        i54 = i4;
                        imageView5 = imageView;
                        i44 = ((iM1130113 ^ i42) * (-15987)) ^ 1960368342;
                        c4531 = c4531;
                        linearLayout2 = linearLayout2;
                        i55 = i55;
                        i53 = i53;
                        c6252 = this;
                        i49 = i49;
                        f6 = f6;
                        strM4040 = str;
                        i56 = i56;
                        int i5114 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i5114;
                    } else {
                        int iM113028 = (i42 - ThreadFactoryC3888.m11306("ۜܺ")) * 67;
                        str5 = str10;
                        i44 = ((iM113028 ^ i43) * 9529) ^ (-750271160);
                        z12 = z5;
                        jSONArray2 = jSONArray2;
                        length = length;
                        iM113011 = i9;
                        sArr5 = sArr2;
                        strM4040 = str;
                        iM113012 = iM113012;
                        jSONObject2 = jSONObject2;
                        jSONObject3 = jSONObject3;
                        z15 = z2;
                        layoutParams5 = layoutParams;
                        c6252 = this;
                        i45 = iM113028 ^ (-165391305);
                        c4531 = c4531;
                        linearLayout2 = linearLayout2;
                        i54 = i4;
                        imageView5 = imageView;
                        z11 = z26;
                        i49 = 8;
                        i55 = i55;
                        i53 = i53;
                        f6 = f6;
                        i56 = i56;
                        int i5115 = i50;
                        z14 = z14;
                        i47 = i47;
                        textView4 = textView;
                        i52 = i52;
                        iM2304 = iM2304;
                        i51 = i51;
                        i50 = i5115;
                    }
                    break;
                case -362100249:
                case 462607287:
                    layoutParams4 = layoutParams5;
                    i38 = i48;
                    strM4040 = C1066.m4040(f21203, 131, 1, i46);
                    iM450212 = C19806.m45029("᩻᩵") ^ i43;
                    i39 = ((iM450212 ^ i42) * 27677) ^ 1564847856;
                    i40 = 2074298318;
                    int i810 = iM450212 ^ i40;
                    i48 = i38;
                    LinearLayout.LayoutParams layoutParams13 = layoutParams4;
                    i45 = i810;
                    i44 = i39;
                    layoutParams5 = layoutParams13;
                    break;
                case -325475509:
                case 1254092550:
                    textView = textView4;
                    jSONObject = jSONObject3;
                    JSONArray jSONArray5 = jSONObject.getJSONArray(CallableC1627.m5502(f21203, 46, 5, i46));
                    jSONArray2 = jSONArray5;
                    length = jSONArray5.length();
                    z16 = z12;
                    i48 = 0;
                    int iM113029 = (ThreadFactoryC3888.m11306("ܿۘ") ^ i43) * 93;
                    jSONObject3 = jSONObject;
                    layoutParams5 = layoutParams5;
                    sArr5 = sArr5;
                    strM4040 = strM4040;
                    i45 = iM113029 ^ 1997459969;
                    i44 = ((iM113029 ^ i42) * 18603) ^ 1828047497;
                    z15 = z15;
                    z11 = z11;
                    i54 = i54;
                    imageView5 = imageView5;
                    i55 = i55;
                    i53 = i53;
                    f6 = f6;
                    i56 = i56;
                    int i5116 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i5116;
                    break;
                case -261206199:
                case 1725369331:
                    Object[] objArr = new Object[1];
                    objArr[i47] = C1148.m4234(iM6106);
                    layoutParams4 = layoutParams5;
                    i38 = i48;
                    String strM6104 = C1875.m6104(activityC23892, ThreadFactoryC3888.m11306(C1419.m4969(f21203, 132, 3, i46)) ^ 2122122350, objArr);
                    StringBuilder sb = new StringBuilder();
                    C1148.m4223(sb, strM4040);
                    C1148.m4223(sb, strM6104);
                    C1461.m5083(textViewM33408, C2124.m6674(sb));
                    textViewM33408.setPadding(C1460.m5054(f5), i47, i47, i47);
                    if (z13) {
                        iM450212 = (ThreadFactoryC3888.m11306("᩺ۚ") + i42) * (-125);
                        i39 = ((iM450212 ^ i43) * 21845) ^ (-33101150);
                        i40 = -378499652;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("᩺ۜ") ^ i43;
                        i39 = ((iM450212 ^ i42) * 4839) ^ 526760416;
                        i40 = -1930878387;
                    }
                    int i811 = iM450212 ^ i40;
                    i48 = i38;
                    LinearLayout.LayoutParams layoutParams14 = layoutParams4;
                    i45 = i811;
                    i44 = i39;
                    layoutParams5 = layoutParams14;
                    break;
                case -178660073:
                case 712801086:
                    C3535.m10426(CallableC1627.m5502(f21203, 27, 9, i46));
                    throw th;
                case 14801051:
                case 1380264419:
                    c4531.m12662(str6);
                    ((LinearLayout) C2332.m7083(activityC23892, iM450214)).removeAllViews();
                    C3722.m10890(C2332.m7083(activityC23892, iM113011), i49);
                    TextView textView20 = (TextView) C2332.m7083(activityC23892, iM113012);
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView20, str5);
                    boolean z27 = z12;
                    C3722.m10890(textView20, z27 ? 1 : 0);
                    ((ScrollView) RunnableC0195.m1436(activityC23892, iM113010)).scrollTo(z27 ? 1 : 0, z27 ? 1 : 0);
                    return;
                case 311578673:
                case 428757786:
                    C0278.m1789();
                    C0817.m3399();
                    return;
                case 582604503:
                case 1077305032:
                    str3 = strM4040;
                    z8 = z11;
                    layoutParams3 = layoutParams5;
                    i22 = i48;
                    TextView textView21 = textView4;
                    i23 = i56;
                    i24 = i54;
                    f3 = f6;
                    z9 = z15;
                    sArr4 = sArr5;
                    i25 = i47;
                    i26 = iM2304;
                    int i103 = i52;
                    textView3 = textView21;
                    int i104 = i53;
                    i27 = i55;
                    i28 = i104;
                    linearLayout3.setPadding(i26, i103, i28, C1460.m5054(60));
                    i29 = i103;
                    imageView3 = new ImageView(activityC23892);
                    strM5577 = C1668.m5577(f21203, 89, 3, i46);
                    if (C1460.m5050() != 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("ܰܺ") + i43) * (-5);
                        i30 = ((iM450211 ^ i42) * 29895) ^ (-1116469070);
                        i31 = -661115104;
                    } else {
                        iM450211 = (i42 - C19806.m45029("᩺֡")) * 81;
                        i30 = ((iM450211 ^ i43) * 20387) ^ (-1405471205);
                        i31 = -1872004534;
                    }
                    int i6110 = iM450211 ^ i31;
                    sArr5 = sArr4;
                    i55 = i27;
                    f6 = f3;
                    z15 = z9;
                    i48 = i22;
                    i53 = i28;
                    i56 = i23;
                    i54 = i24;
                    imageView5 = imageView3;
                    layoutParams5 = layoutParams3;
                    str4 = strM5577;
                    i45 = i6110;
                    i44 = i30;
                    strM4040 = str3;
                    z11 = z8;
                    int i6111 = i29;
                    iM2304 = i26;
                    i47 = i25;
                    textView4 = textView3;
                    i52 = i6111;
                    break;
                case 874179860:
                case 1567964674:
                    str = strM4040;
                    z = z11;
                    layoutParams = layoutParams5;
                    i = i48;
                    LinearLayout linearLayout12 = linearLayout3;
                    int i105 = i54;
                    f6 = f6;
                    z2 = z15;
                    short[] sArr10 = sArr5;
                    TextView textView22 = textView4;
                    C19806.m45022(textView22, C19806.m45029(C3535.m10423(sArr10, 92, 3, i46)) ^ 2123663908);
                    textView22.setGravity(17);
                    if (!RunnableC1564.f6300) {
                        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams15.topMargin = C1460.m5054(16);
                        C7321 c7322 = C7321.f24318;
                        C1668.m5573(linearLayout12, textView22, layoutParams15);
                        f6 = 12.0f;
                        z15 = true;
                        if (C2249.f8050 < 0) {
                            int iM113030 = (i43 - ThreadFactoryC3888.m11306("ۘۧ")) * (-3);
                            i2 = ((iM113030 ^ i42) * 4387) ^ (-1143001938);
                            linearLayout3 = linearLayout12;
                            textView4 = textView22;
                            sArr5 = sArr10;
                            layoutParams5 = layoutParams;
                            i48 = i;
                            strM4040 = str;
                            z11 = z;
                            i56 = -2;
                            i54 = -1;
                            i55 = 17;
                            i45 = iM113030 ^ (-1825228028);
                            i44 = i2;
                        } else {
                            linearLayout3 = linearLayout12;
                            i47 = i47;
                            sArr = sArr10;
                            jSONArray = jSONArray2;
                            z14 = z14;
                            i50 = i50;
                            i51 = i51;
                            i53 = i53;
                            iM2304 = iM2304;
                            imageView5 = imageView5;
                            i48 = i;
                            f = 12.0f;
                            z3 = true;
                            i55 = 17;
                            i56 = -2;
                            i54 = -1;
                            i52 = i52;
                            textView = textView22;
                            int iM1130114 = ThreadFactoryC3888.m11306("۫ۧ") ^ i43;
                            jSONArray2 = jSONArray;
                            i44 = ((iM1130114 ^ i42) * 25955) ^ (-73390636);
                            imageView5 = imageView5;
                            sArr5 = sArr;
                            z15 = z3;
                            i55 = i55;
                            i53 = i53;
                            z11 = z;
                            f6 = f;
                            strM4040 = str;
                            int i6112 = i50;
                            z14 = z14;
                            i47 = i47;
                            textView4 = textView;
                            i52 = i52;
                            iM2304 = iM2304;
                            i51 = i51;
                            i50 = i6112;
                            LinearLayout.LayoutParams layoutParams16 = layoutParams;
                            i45 = iM1130114 ^ (-1823558030);
                            layoutParams5 = layoutParams16;
                        }
                    } else {
                        linearLayout3 = linearLayout12;
                        i47 = i47;
                        sArr2 = sArr10;
                        z14 = z14;
                        i50 = i50;
                        i3 = i51;
                        i53 = i53;
                        iM2304 = iM2304;
                        imageView = imageView5;
                        i56 = -2;
                        i55 = 17;
                        i4 = i105;
                        i52 = i52;
                        textView = textView22;
                        int iM1130115 = ThreadFactoryC3888.m11306("ۤۘ") ^ i42;
                        linearLayout5 = null;
                        i50 = i50;
                        layoutParams5 = layoutParams;
                        sArr5 = sArr2;
                        i48 = i;
                        i45 = iM1130115 ^ (-1844653417);
                        i44 = ((iM1130115 ^ i43) * 26887) ^ (-1861861275);
                        z14 = z14;
                        i47 = i47;
                        z15 = z2;
                        strM4040 = str;
                        textView4 = textView;
                        i52 = i52;
                        i54 = i4;
                        imageView5 = imageView;
                        iM2304 = iM2304;
                        i55 = i55;
                        i53 = i53;
                        i51 = i3;
                        f6 = f6;
                        z11 = z;
                        i56 = i56;
                    }
                    break;
                case 1023827237:
                case 1613127823:
                    strM4040 = strM4040;
                    z11 = z11;
                    layoutParams5 = layoutParams5;
                    i49 = i49;
                    jSONObject2 = jSONObject2;
                    length = length;
                    i56 = i56;
                    f6 = f6;
                    linearLayout2 = linearLayout2;
                    c4531 = c4531;
                    jSONObject3 = jSONObject3;
                    i53 = i53;
                    i55 = i55;
                    iM113011 = iM113011;
                    imageView5 = imageView5;
                    i54 = i54;
                    z15 = z15;
                    sArr5 = sArr5;
                    z12 = z12;
                    iM113012 = iM113012;
                    jSONArray2 = jSONArray2;
                    TextView textView23 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView23;
                    if (c6252.f21205 == null) {
                        iM11307 = C19806.m45029("ܽۘ") ^ i42;
                        i44 = ((iM11307 ^ i43) * 4423) ^ 1191574201;
                        i8 = -1968852211;
                        int i6113 = iM11307 ^ i8;
                        jSONArray2 = jSONArray2;
                        length = length;
                        sArr5 = sArr5;
                        strM4040 = strM4040;
                        jSONObject2 = jSONObject2;
                        iM113012 = iM113012;
                        z12 = z12;
                        iM113011 = iM113011;
                        z15 = z15;
                        layoutParams5 = layoutParams5;
                        i45 = i6113;
                        jSONObject3 = jSONObject3;
                        i54 = i54;
                        imageView5 = imageView5;
                        c6252 = this;
                    } else {
                        int iM450216 = C19806.m45029("۫ۗ") ^ i43;
                        jSONArray2 = jSONArray2;
                        length = length;
                        sArr5 = sArr5;
                        jSONObject2 = jSONObject2;
                        iM113012 = iM113012;
                        z12 = z12;
                        iM113011 = iM113011;
                        z15 = z15;
                        layoutParams5 = layoutParams5;
                        i45 = iM450216 ^ 1578487834;
                        i44 = ((iM450216 ^ i42) * 19973) ^ 252680710;
                        jSONObject3 = jSONObject3;
                        i54 = i54;
                        imageView5 = imageView5;
                        strM4040 = strM4040;
                    }
                    c4531 = c4531;
                    linearLayout2 = linearLayout2;
                    i55 = i55;
                    i53 = i53;
                    i49 = i49;
                    f6 = f6;
                    z11 = z11;
                    i56 = i56;
                    int i5117 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i5117;
                    break;
                case 1035979799:
                case 1789185055:
                    if (C2249.f8050 < 0) {
                        iM11306 = C19806.m45029("ܳ۠") ^ i42;
                        i2 = ((iM11306 ^ i43) * 24295) ^ 578353655;
                        i5 = -2105191214;
                    } else {
                        iM11306 = (C19806.m45029("ۚ۠") ^ i43) * (-59);
                        i2 = ((iM11306 ^ i42) * 9271) ^ (-1099089833);
                        i5 = -664421956;
                    }
                    i45 = iM11306 ^ i5;
                    i44 = i2;
                    break;
                case 1105525786:
                case 2143761991:
                    RunnableC1564.m5345();
                    C2704.m8255();
                    str = strM4040;
                    layoutParams = layoutParams5;
                    i49 = i49;
                    iM113012 = iM113012;
                    jSONObject2 = jSONObject2;
                    length = length;
                    jSONArray2 = jSONArray2;
                    i56 = i56;
                    f6 = f6;
                    linearLayout2 = linearLayout2;
                    c4531 = c4531;
                    jSONObject3 = jSONObject3;
                    i53 = i53;
                    i55 = i55;
                    i9 = iM113011;
                    imageView = imageView5;
                    i4 = i54;
                    z2 = z15;
                    sArr2 = sArr5;
                    z5 = z12;
                    TextView textView24 = textView4;
                    i47 = i47;
                    z14 = z14;
                    i50 = i50;
                    i51 = i51;
                    iM2304 = iM2304;
                    i52 = i52;
                    textView = textView24;
                    int iM1130116 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i43) * (-111);
                    jSONArray2 = jSONArray2;
                    length = length;
                    sArr5 = sArr2;
                    jSONObject2 = jSONObject2;
                    iM113012 = iM113012;
                    z12 = z5;
                    iM113011 = i9;
                    z15 = z2;
                    layoutParams5 = layoutParams;
                    i45 = iM1130116 ^ 711528815;
                    jSONObject3 = jSONObject3;
                    i54 = i4;
                    imageView5 = imageView;
                    i44 = ((iM1130116 ^ i42) * (-15987)) ^ 1960368342;
                    c4531 = c4531;
                    linearLayout2 = linearLayout2;
                    i55 = i55;
                    i53 = i53;
                    c6252 = this;
                    i49 = i49;
                    f6 = f6;
                    strM4040 = str;
                    i56 = i56;
                    int i5118 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i5118;
                    break;
                case 1122427824:
                case 2002148548:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܺ") ^ i42) * 69;
                        i2 = ((iM11306 ^ i43) * (-24415)) ^ 108716580;
                        i5 = 27730335;
                    } else {
                        iM11306 = (C19806.m45029("᩸ܶ") ^ i43) * (-17);
                        i2 = ((iM11306 ^ i42) * 1371) ^ 794354293;
                        i5 = 1955532752;
                    }
                    i45 = iM11306 ^ i5;
                    i44 = i2;
                    break;
                case 1303118553:
                case 1545897343:
                    layoutParams2 = layoutParams5;
                    i12 = i48;
                    TextView textViewM334012 = C13705.m33407((Context) activityC23892, 12.0f, true);
                    String strM5479 = RunnableC1606.m5479(jSONObject4, C0962.m3747(f21203, 98, 10, i46));
                    str2 = strM4040;
                    z6 = z11;
                    long j = jSONObject4.getLong(C3722.m10901(f21203, 108, 11, i46));
                    if (C7105.f23796 < 0) {
                        String str11 = dateTimeInstance.format(new Date(j));
                        StringBuilder sb2 = new StringBuilder();
                        C2788.m8480(sb2, strM5479);
                        C1148.m4223(sb2, C2871.m8640(f21203, 119, 3, i46));
                        C2788.m8480(sb2, str11);
                        MenuItemOnMenuItemClickListenerC3244.m9704(textViewM334012, C2124.m6674(sb2));
                        C1937.m6278(linearLayout5, textViewM334012);
                        i13 = i51;
                        i14 = iM2304;
                        i56 = i56;
                        f2 = f6;
                        i16 = i52;
                        i19 = i53;
                        textView2 = textView4;
                        i15 = i55;
                        i18 = i47;
                        imageView2 = imageView5;
                        i17 = i54;
                        z7 = z15;
                        sArr3 = sArr5;
                        iM450210 = (i42 - ThreadFactoryC3888.m11306("ۤ᩷")) * (-21);
                        i20 = ((iM450210 ^ i43) * (-11541)) ^ 1803983563;
                        i21 = 1903641616;
                        int i812 = iM450210 ^ i21;
                        i47 = i18;
                        layoutParams5 = layoutParams2;
                        sArr5 = sArr3;
                        i48 = i12;
                        i45 = i812;
                        i44 = i20;
                        textView4 = textView2;
                        i52 = i16;
                        z15 = z7;
                        strM4040 = str2;
                        iM2304 = i14;
                        i54 = i17;
                        imageView5 = imageView2;
                        i51 = i13;
                        i55 = i15;
                        i53 = i19;
                        z11 = z6;
                        f6 = f2;
                        i56 = i56;
                    } else {
                        imageView4 = imageView5;
                        textViewM33407 = textView4;
                        linearLayout = linearLayout3;
                        i32 = i56;
                        i34 = i54;
                        i33 = i55;
                        f4 = f6;
                        z10 = z15;
                        i35 = i47;
                        iM11309 = C19806.m45029("ܳ᩷") ^ i43;
                        i36 = ((iM11309 ^ i42) * 8301) ^ 852382717;
                        i37 = -1156419846;
                        int i910 = iM11309 ^ i37;
                        linearLayout3 = linearLayout;
                        i55 = i33;
                        f6 = f4;
                        z15 = z10;
                        layoutParams5 = layoutParams2;
                        strM4040 = str2;
                        i45 = i910;
                        i56 = i32;
                        i54 = i34;
                        z11 = z6;
                        imageView5 = imageView4;
                        i48 = i12;
                        int i911 = i35;
                        textView4 = textViewM33407;
                        i44 = i36;
                        i47 = i911;
                    }
                    break;
                case 1326636660:
                case 1862251848:
                    strM4040 = strM4040;
                    jSONObject2 = jSONObject2;
                    int i106 = i53;
                    int i107 = i55;
                    ImageView imageView11 = imageView5;
                    int i108 = i54;
                    textView = textView4;
                    ActivityC23892.m52654(activityC23892, jSONObject2);
                    iM113012 = iM113012;
                    jSONArray2 = jSONArray2;
                    length = length;
                    int i109 = i49;
                    RunnableC1895.m6165(RunnableC0195.m1436(activityC23892, iM113012), i109);
                    linearLayout4.removeAllViews();
                    jSONObject3 = c6252.f21205;
                    if (jSONObject3 != null) {
                        int iM113031 = ThreadFactoryC3888.m11306("۠ۧ") ^ i42;
                        i44 = ((iM113031 ^ i43) * 17201) ^ 339431826;
                        i45 = iM113031 ^ 754593315;
                    } else {
                        int iM450217 = (i43 - C19806.m45029("۫ۨ")) * (-53);
                        i45 = iM450217 ^ (-632858269);
                        i44 = ((iM450217 ^ i42) * (-30579)) ^ (-274486631);
                        linearLayout2 = linearLayout2;
                    }
                    i54 = i108;
                    imageView5 = imageView11;
                    i49 = i109;
                    i55 = i107;
                    i53 = i106;
                    z11 = z11;
                    f6 = f6;
                    i56 = i56;
                    int i5119 = i50;
                    z14 = z14;
                    i47 = i47;
                    textView4 = textView;
                    i52 = i52;
                    iM2304 = iM2304;
                    i51 = i51;
                    i50 = i5119;
                    break;
                default:
                    C3535.m10426(C3286.m9788(f21203, 36, 4, i46));
                    throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17319(C6252 c6252, ActivityC23892 activityC23892, ScrollView scrollView) {
        int i = -826737244;
        int i2 = C1977.f7413;
        int i3 = AbstractC0464.f2088;
        int iM45029 = (i2 - C19806.m45029("֡۬")) * (-103);
        int i4 = ((iM45029 ^ i3) * (-529)) ^ (-1575542762);
        int i5 = 914892421;
        while (true) {
            i = ((((i ^ i3) * (-9531)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2145077604:
                case 79122418:
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18929)) ^ 282989499;
                        i5 = -591950508;
                    } else {
                        iM45029 = C19806.m45029("᩵ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9419)) ^ 1913612352;
                        i5 = 385614792;
                    }
                    break;
                case -1933876060:
                case 1318948834:
                    if (C1977.m6356()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17237)) ^ (-1130673031);
                        i5 = 563809391;
                    } else {
                        iM45029 = C19806.m45029("᩶֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14753) ^ (-1757587508);
                        i5 = -886886973;
                    }
                    break;
                case -1900881879:
                case 180679892:
                    C1377.m4833();
                    iM45029 = C19806.m45029("ۨۢ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                    i5 = 497981534;
                    break;
                case -1824349423:
                case -717112373:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = C19806.m45029("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                        i5 = 497981534;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18081)) ^ 1298881651;
                        i5 = -320054794;
                    }
                    break;
                case -1717939593:
                case 1941279420:
                    C1066.m4023();
                    if (C1461.f5957 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17237)) ^ (-1130673031);
                        i5 = 563809391;
                    } else {
                        iM45029 = C19806.m45029("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                        i5 = 497981534;
                    }
                    break;
                case -1660598765:
                case -518693829:
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("᩺ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19949)) ^ (-861341340);
                        i5 = 1454500315;
                    } else {
                        iM45029 = C19806.m45029("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                        i5 = 497981534;
                    }
                    break;
                case -1483387686:
                case 2046383359:
                    if (C1025.m3861() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18929)) ^ 282989499;
                        i5 = -591950508;
                    } else {
                        iM45029 = C19806.m45029("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                        i5 = 497981534;
                    }
                    break;
                case -1440654230:
                case -614152413:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                        i5 = 497981534;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29161) ^ 705339099;
                        i5 = -44814204;
                    }
                    break;
                case -1353627595:
                case -834210968:
                    if (C2642.m8171() != 0) {
                        iM45029 = C19806.m45029("ۜᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16103)) ^ 1501490381;
                        i5 = 1912200140;
                    } else {
                        iM45029 = C19806.m45029("ܽۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25045)) ^ (-774494666);
                        i5 = -1240603942;
                    }
                    break;
                case -1127136127:
                case 1823992126:
                    if (activityC23892.f77396 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16583) ^ 428069533;
                        i5 = 569546167;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۠ۜ")) * (-95);
                        i4 = ((iM45029 ^ i2) * (-2197)) ^ (-1945868312);
                        i5 = 263548136;
                    }
                    break;
                case -1092018314:
                case -82896644:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                        i5 = 497981534;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23621) ^ (-717652646);
                        i5 = 314224117;
                    }
                    break;
                case -845487960:
                case 915323764:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18929)) ^ 282989499;
                        i5 = -591950508;
                    } else {
                        iM45029 = (C19806.m45029("ۤ᩹") + i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-65)) ^ (-773654679);
                        i5 = 730906951;
                    }
                    break;
                case -648858185:
                case 1335143195:
                    if (c6252.m17320()) {
                        iM45029 = C19806.m45029("ۖۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26501)) ^ 371364320;
                        i5 = -288095285;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۠ۜ")) * (-95);
                        i4 = ((iM45029 ^ i2) * (-2197)) ^ (-1945868312);
                        i5 = 263548136;
                    }
                    break;
                case -469198821:
                case 927152015:
                    if (C2332.f8260) {
                        iM45029 = (i3 - C19806.m45029("֫ܶ")) * 33;
                        i4 = ((iM45029 ^ i2) * (-4053)) ^ (-929858240);
                        i5 = -106479185;
                    } else {
                        iM45029 = C19806.m45029("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                        i5 = 497981534;
                    }
                    break;
                case 16453598:
                case 603760976:
                    C0629.m2907();
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6105)) ^ (-1143454859);
                        i5 = 497981534;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۙܳ")) * (-29);
                        i4 = ((iM45029 ^ i2) * 24213) ^ 680959700;
                        i5 = 1701859088;
                    }
                    break;
                case 682270585:
                case 1171059587:
                    C0671.m3008();
                    break;
                case 1008388067:
                case 1713858254:
                    break;
                case 1255874956:
                case 1552783847:
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("ۜᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16103)) ^ 1501490381;
                        i5 = 1912200140;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿ۬")) * 97;
                        i4 = ((iM45029 ^ i3) * (-24035)) ^ (-1703617956);
                        i5 = -895760608;
                    }
                    break;
                default:
                    scrollView.scrollTo(0, activityC23892.f77396);
                    activityC23892.f77396 = -1;
                    iM45029 = (i3 - C19806.m45029("۠ۜ")) * (-95);
                    i4 = ((iM45029 ^ i2) * (-2197)) ^ (-1945868312);
                    i5 = 263548136;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ActivityC23892 activityC23892 = null;
        String str = null;
        int i = 0;
        C14720 e = null;
        String str2 = null;
        C2724 c2724M4222 = null;
        int i2 = 1790880317;
        int i3 = C7105.f23796;
        int i4 = C1977.f7413;
        int iM45029 = (i3 - C19806.m45029("᩷ܿ")) * 39;
        int i5 = ((iM45029 ^ i4) * (-19643)) ^ 512559189;
        int i6 = 109501390;
        while (true) {
            i2 = ((((i2 ^ i4) * 24093) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2014509631:
                case 1036886610:
                    if (C13465.m32965((Object) str, (Object) C0671.m3006())) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-7097)) ^ 220729444;
                        i6 = 60316803;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩵") ^ i4) * 59;
                        i5 = ((iM45029 ^ i3) * 9295) ^ 1925463712;
                        i6 = -63158107;
                    }
                    break;
                case -1942752432:
                case 1571507532:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩶ᩴ")) * 77;
                        i5 = ((iM45029 ^ i4) * 8437) ^ (-627658861);
                        i6 = -693825460;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺۘ")) * 51;
                        i5 = ((iM45029 ^ i4) * (-18093)) ^ 1844374719;
                        i6 = 110857895;
                    }
                    break;
                case -1839445622:
                case 1666435802:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") ^ i4) * (-3);
                        i5 = ((iM45029 ^ i3) * (-27737)) ^ 214674533;
                        i6 = -540999490;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܿ۬")) * 119;
                        i5 = ((iM45029 ^ i4) * 16777) ^ (-1949013219);
                        i6 = -669147705;
                    }
                    break;
                case -1833256375:
                case 1648534191:
                    this.f21205 = C2018.m6501(c2724M4222);
                    break;
                case -1827043209:
                case 1394029838:
                    c2724M4222 = C1148.m4222(4369);
                    if (C1419.f5860 >= 0) {
                        iM45029 = (i3 - C19806.m45029("֨ۜ")) * (-79);
                        i5 = ((iM45029 ^ i4) * (-2239)) ^ 1620125380;
                        i6 = -95169680;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ۟") + i4) * 53;
                        i5 = ((iM45029 ^ i3) * 28421) ^ 2096885698;
                        i6 = 1768846514;
                    }
                    break;
                case -1727258529:
                case -1062208435:
                    str = activityC23892.f77399;
                    if (C0216.f1393 != 0) {
                        iM45029 = (i3 - C19806.m45029("᩶ᩴ")) * 77;
                        i5 = ((iM45029 ^ i4) * 8437) ^ (-627658861);
                        i6 = -693825460;
                    } else {
                        iM45029 = C19806.m45029("ۙ۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19201)) ^ 1287765748;
                        i6 = -706198665;
                    }
                    break;
                case -1686136338:
                case 1543790871:
                    String strM4893 = C1398.m4893(e);
                    if (strM4893 == null) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙۡ")) * 35;
                        i5 = ((iM45029 ^ i4) * 3353) ^ (-1157500812);
                        i6 = -1438317043;
                    } else {
                        str2 = strM4893;
                        iM45029 = C19806.m45029("ᩴ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * 9843) ^ 1741485642;
                        i6 = 152210390;
                    }
                    break;
                case -1304940947:
                case 279101352:
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("ۛۘ") ^ i4) * 57;
                        i5 = ((iM45029 ^ i3) * (-16073)) ^ 1178828990;
                        i6 = -1236826299;
                    } else {
                        iM45029 = C19806.m45029("۟ۡ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 28621) ^ (-863918487);
                        i6 = -1747991679;
                    }
                    break;
                case -1005274199:
                case 360854730:
                    C2871.m8646();
                    if (!C0817.m3399()) {
                        iM45029 = (i3 - C19806.m45029("֨ۜ")) * (-79);
                        i5 = ((iM45029 ^ i4) * (-2239)) ^ 1620125380;
                        i6 = -95169680;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") ^ i4) * (-3);
                        i5 = ((iM45029 ^ i3) * (-27737)) ^ 214674533;
                        i6 = -540999490;
                    }
                    break;
                case -906178016:
                case 1610664341:
                    i = 4368;
                    iM45029 = ThreadFactoryC3888.m11306("ۧۤ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 18427) ^ 1054056800;
                    i6 = -1709210732;
                    break;
                case -869635191:
                case 430438798:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = (C19806.m45029("ۛۘ") ^ i4) * 57;
                        i5 = ((iM45029 ^ i3) * (-16073)) ^ 1178828990;
                        i6 = -1236826299;
                    } else {
                        iM45029 = (C19806.m45029("ۙܳ") + i4) * 91;
                        i5 = ((iM45029 ^ i3) * 32685) ^ (-86918268);
                        i6 = 955235810;
                    }
                    break;
                case -766756769:
                case 566336163:
                    activityC23892 = this.f21206;
                    if (C1419.m4973()) {
                        iM45029 = (i3 - C19806.m45029("֨ۜ")) * (-79);
                        i5 = ((iM45029 ^ i4) * (-2239)) ^ 1620125380;
                        i6 = -95169680;
                    } else {
                        iM45029 = C19806.m45029("ۙ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-26139)) ^ (-912580967);
                        i6 = -1067894096;
                    }
                    break;
                case -754373392:
                case 1897014267:
                    C0050.m946();
                    break;
                case -701581220:
                case 652395394:
                    AbstractC0464.m2313();
                    C2871.m8646();
                    iM45029 = (i3 - C19806.m45029("֨ۜ")) * (-79);
                    i5 = ((iM45029 ^ i4) * (-2239)) ^ 1620125380;
                    i6 = -95169680;
                    break;
                case -695443306:
                case 1958143887:
                    if (C1977.m6356()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") ^ i4) * (-3);
                        i5 = ((iM45029 ^ i3) * (-27737)) ^ 214674533;
                        i6 = -540999490;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۢ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-8213)) ^ 80574101;
                        i6 = 181105948;
                    }
                    break;
                case -343354850:
                case 1465218180:
                    if (C1377.m4833() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") ^ i4) * (-3);
                        i5 = ((iM45029 ^ i3) * (-27737)) ^ 214674533;
                        i6 = -540999490;
                    } else {
                        iM45029 = (C19806.m45029("ۜ۬") ^ i4) * 57;
                        i5 = ((iM45029 ^ i3) * 18845) ^ (-1423445557);
                        i6 = 589398439;
                    }
                    break;
                case -177520364:
                case 291729336:
                    if (RunnableC1606.f6488 < 0) {
                        iM45029 = C19806.m45029("֨ۚ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 19863) ^ (-452772260);
                        i6 = -538519593;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") ^ i4) * (-3);
                        i5 = ((iM45029 ^ i3) * (-27737)) ^ 214674533;
                        i6 = -540999490;
                    }
                    break;
                case 160169905:
                case 1543437807:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("ۛۘ") ^ i4) * 57;
                        i5 = ((iM45029 ^ i3) * (-16073)) ^ 1178828990;
                        i6 = -1236826299;
                    } else {
                        iM45029 = C19806.m45029("֨ۚ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 19863) ^ (-452772260);
                        i6 = -538519593;
                    }
                    break;
                case 461177166:
                case 1338396562:
                    break;
                case 687119715:
                case 1528060113:
                    this.f21204 = str2;
                    break;
                case 1030972084:
                case 1350240870:
                    try {
                        this.f21207 = C2018.m6501(C1148.m4222(i));
                        iM45029 = C19806.m45029("۟ܶ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-10845)) ^ 2002212397;
                        i6 = -1055077948;
                    } catch (C14720 e2) {
                        e = e2;
                        iM45029 = ThreadFactoryC3888.m11306("ۖܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27439) ^ 1249271942;
                        i6 = 1360730075;
                    }
                    break;
                case 1071839191:
                case 1611471827:
                    if (C1189.m4368() <= 0) {
                        iM45029 = (i3 - C19806.m45029("֨ۜ")) * (-79);
                        i5 = ((iM45029 ^ i4) * (-2239)) ^ 1620125380;
                        i6 = -95169680;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-16905)) ^ 881752190;
                        i6 = -2071389272;
                    }
                    break;
                default:
                    str2 = "";
                    iM45029 = C19806.m45029("ᩴ᩷") ^ i4;
                    i5 = ((iM45029 ^ i3) * 9843) ^ 1741485642;
                    i6 = 152210390;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x027b A[PHI: r3 r4 r16
      0x027b: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:68:0x0279, B:64:0x025d, B:60:0x023e, B:14:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r4v4 short) = (r4v2 short), (r4v2 short), (r4v3 short), (r4v2 short) binds: [B:68:0x0279, B:64:0x025d, B:60:0x023e, B:14:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r16v25 l.ۛۧܰ) = (r16v6 l.ۛۧܰ), (r16v7 l.ۛۧܰ), (r16v8 l.ۛۧܰ), (r16v26 l.ۛۧܰ) binds: [B:68:0x0279, B:64:0x025d, B:60:0x023e, B:14:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ca A[PHI: r2 r16
      0x02ca: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:76:0x02c8, B:72:0x02ab, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r16v29 l.ۛۧܰ) = (r16v4 l.ۛۧܰ), (r16v5 l.ۛۧܰ), (r16v30 l.ۛۧܰ) binds: [B:76:0x02c8, B:72:0x02ab, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (l.C3535.m10431() <= 0) goto L14;
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1156() {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6252.mo1156():void");
    }
}
