package l;

import android.R;
import android.content.Intent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۛۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RS */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC5760 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19553 = 0;

    /* JADX INFO: renamed from: ᩷ܳ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f19554 = {3052, -28466, -28462, -28469, -28455, -28457, -28464, -28447, -28457, -28451, -28463, -28464, -28466, -28462, -28469, -28455, -28457, -28464, -28425, -28454, -28468, -28453, -28462, -28463, -28449, -28454, -28425, -28451, -28463, -28464, -28456, -28468, -28463, -28461, -28422, -28453, -28472, -28453, -28462, -28463, -28466, -28453, -28468, -28430, -28457, -28467, -28470, 1678, 436, -7987, 4826, 25859, 25856, 25923, 25946, 25950, 6640, 28767, -28450, 28145, 504, -32678, -22057, -18457, 22754, -18240, -29708, 18196, -29729, 23609, 6593, -30442, 16669, 16728, -27749, 25603, 20686, 18993, 25257, -32527, 18010, 18944, -30509, 7944, 7956, 7949, 7967, 7953, 7958, 7985, 7964, 7946, 7965, 7956, 7959, 7961, 7964, 7985, 7963, 7959, 7958, 7957, 7948, 7944, 7956, 7949, 7967, 7953, 7958, 25749, 29868, 16721, -26926, 28296, -32121, -28569, 25116, 31267, 18163, -31649, -26320, -28246, -29341, -25011, -32305, -30167, -24915, 27635, 28565, 20953, 20445, 20651, -30044, 20893, 32326, 30823, 18895, 28393, 18428, -27147, 16479, 20797, 30596, 17236, -30891, 27019, 19113, 20032, 7944, 7956, 7949, 7967, 7953, 7958, 7975, 7953, 7963, 7959, 7958, 5401, 25183, -30026, 28204, 31564, 30907, 26141, 9791, 19787, 23793, 24950, 26056, -20499, 22567, -20198, 20520, 23864, -23559, 25498, -22979, 20599, 27951, -20152, 13641, 13653, 13644, 13662, 13648, 13655, 13680, 13661, -18261, 25669, 27741, 28409, 25339, -17388, 27001, -18222, 22060, 27831, -24380, 22988, 2904, 7401, 7381, 7372, 7390, 7376, 7383, 7408, 7383, 7391, 7382, 7416, 7386, 7373, 7376, 7375, 7376, 7373, 7360};

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public ViewGroup f19555;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public TextView f19556;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public Button f19557;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public TextView f19558;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public TextView f19559;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public TextView f19560;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public TextView f19561;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public TextView f19562;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f19563;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public View f19564;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public String f19565;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public TextView f19566;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19567;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public C18419 f19568;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public TextView f19569;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final C22959 f19570 = C22959.m50800();

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 249422775;
        int i6 = RunnableC3388.f12514;
        int i7 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11306 = (ThreadFactoryC3888.m11306("۬֡") + i6) * (-45);
        int i8 = ((iM11306 ^ i7) * 2239) ^ (-337577199);
        int i9 = 621735762;
        while (true) {
            i5 = ((((i5 ^ i7) * (-21555)) >> 31) & i8) ^ (iM11306 ^ i9);
            switch (i5) {
                case -2119110635:
                case -1841683562:
                    c = 202;
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("ܺ۬") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-27095)) ^ (-464269984);
                        i9 = -1970831703;
                    } else {
                        iM11306 = C19806.m45029("᩸ܽ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 20671) ^ (-770347931);
                        i9 = 93913130;
                    }
                    break;
                case -1916750202:
                case 730172908:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i7;
                        i8 = ((iM11306 ^ i6) * 16663) ^ (-721725460);
                        i9 = 1641397138;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 467) ^ 1265415220;
                        i9 = 1209126028;
                    }
                    break;
                case -1589093341:
                case 1536506890:
                    if (C2477.m7593() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 467) ^ 1265415220;
                        i9 = 1209126028;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۡ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 31721) ^ (-2049850422);
                        i9 = 726244270;
                    }
                    break;
                case -1270779737:
                case -223029285:
                    return ThreadFactoryC3888.m11312(sArr2, i4, 18, i3);
                case -1253450712:
                case 1174554235:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ܺ۬") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-27095)) ^ (-464269984);
                        i9 = -1970831703;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۡ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-25935)) ^ (-803221083);
                        i9 = 205141031;
                    }
                    break;
                case -1230208636:
                case 895321281:
                    if (C1875.m6086() != 0) {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i7;
                        i8 = ((iM11306 ^ i6) * 16663) ^ (-721725460);
                        i9 = 1641397138;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۛ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-18851)) ^ (-951396138);
                        i9 = 4887191;
                    }
                    break;
                case -1216115204:
                case 2095567731:
                    i3 = 7353;
                    iM11306 = (C19806.m45029("۟֫") ^ i7) * (-119);
                    i8 = ((iM11306 ^ i6) * 14459) ^ (-1602776714);
                    i9 = 1316533102;
                    break;
                case -1199348022:
                case 480256846:
                    sArr = f19554;
                    if (RunnableC1564.m5345()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۤ") ^ i7) * (-103);
                        i8 = ((iM11306 ^ i6) * (-16039)) ^ 963609719;
                        i9 = 143963372;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩺ۜ")) * (-109);
                        i8 = ((iM11306 ^ i6) * 8405) ^ 646359331;
                        i9 = -890415900;
                    }
                    break;
                case -1181896151:
                case 1103376580:
                    s2 = 7518;
                    if (C3577.m10565()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۧ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-13453)) ^ 410445527;
                        i9 = -1685808645;
                    } else {
                        iM11306 = (C19806.m45029("ۖ᩸") + i6) * (-5);
                        i8 = ((iM11306 ^ i7) * 7499) ^ 1698858278;
                        i9 = -2100210450;
                    }
                    break;
                case -1181715989:
                case -883872072:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 467) ^ 1265415220;
                        i9 = 1209126028;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ۨ᩷")) * 13;
                        i8 = ((iM11306 ^ i7) * (-24861)) ^ (-882076368);
                        i9 = 861768625;
                    }
                    break;
                case -1059634882:
                case 970114919:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 467) ^ 1265415220;
                        i9 = 1209126028;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۤ") ^ i7) * (-103);
                        i8 = ((iM11306 ^ i6) * (-16039)) ^ 963609719;
                        i9 = 143963372;
                    }
                    break;
                case -1042374765:
                case 981887940:
                    if (i2 - (s * s2) >= 0) {
                        iM11306 = (C19806.m45029("᩷ۗ") + i6) * (-41);
                        i8 = ((iM11306 ^ i7) * 1423) ^ 431697613;
                        i9 = 114771669;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܶ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 19739) ^ 309826122;
                        i9 = -2141459895;
                    }
                    break;
                case -914713745:
                case 1774782749:
                    sArr2 = f19554;
                    i4 = 203;
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 467) ^ 1265415220;
                        i9 = 1209126028;
                    } else {
                        iM11306 = C19806.m45029("֫᩸") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-6513)) ^ (-1082285097);
                        i9 = 1823796297;
                    }
                    break;
                case -745144366:
                case 846541346:
                    i2 = 14130081 + i;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟֨") ^ i6;
                        i8 = ((iM11306 ^ i7) * 467) ^ 1265415220;
                        i9 = 1209126028;
                    } else {
                        iM11306 = C19806.m45029("᩸ܰ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-26313)) ^ 808369213;
                        i9 = -523952437;
                    }
                    break;
                case -703469670:
                case 1818586141:
                    C3722.m10894();
                    RunnableC3388.m10064();
                    iM11306 = (ThreadFactoryC3888.m11306("ܰۤ") ^ i7) * (-103);
                    i8 = ((iM11306 ^ i6) * (-16039)) ^ 963609719;
                    i9 = 143963372;
                    break;
                case 486810039:
                case 1797770165:
                    if (C0671.m3008() < 0) {
                        iM11306 = C19806.m45029("ܺ۬") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-27095)) ^ (-464269984);
                        i9 = -1970831703;
                    } else {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i7;
                        i8 = ((iM11306 ^ i6) * 16663) ^ (-721725460);
                        i9 = 1641397138;
                    }
                    break;
                case 509329452:
                case 1581430592:
                    i3 = 54124;
                    iM11306 = (C19806.m45029("۟֫") ^ i7) * (-119);
                    i8 = ((iM11306 ^ i6) * 14459) ^ (-1602776714);
                    i9 = 1316533102;
                    break;
                case 1061542439:
                case 1971895556:
                    C0629.m2907();
                    C2477.m7593();
                    return null;
                default:
                    s = sArr[c];
                    i = s * s;
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("ۖ᩸") + i6) * (-5);
                        i8 = ((iM11306 ^ i7) * 7499) ^ 1698858278;
                        i9 = -2100210450;
                    } else {
                        iM11306 = (C19806.m45029("ܽ᩹") ^ i6) * 77;
                        i8 = ((iM11306 ^ i7) * (-2485)) ^ (-1085211104);
                        i9 = 1435931413;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m15867(ActivityC5760 activityC5760) {
        C22959 c22959 = null;
        int i = 2141407343;
        int i2 = C1398.f5802;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = (i2 - C19806.m45029("ᩴܳ")) * 69;
        int i4 = ((iM45029 ^ i3) * 21881) ^ (-1055857730);
        int i5 = 358461310;
        while (true) {
            i = ((((i ^ i3) * (-11573)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2125183243:
                case -1312307907:
                    C18419 c18419 = activityC5760.f19568;
                    if (C0278.f1572 > 0) {
                        int i6 = 2;
                        if (!C19806.f63586) {
                            m15861(activityC5760, c18419, new RunnableC10138(i6, activityC5760));
                            iM45029 = (i2 - ThreadFactoryC3888.m11306("۠ۖ")) * (-17);
                            i4 = ((iM45029 ^ i3) * 24249) ^ (-2130301785);
                            i5 = -587630723;
                            break;
                        }
                    }
                    iM45029 = ThreadFactoryC3888.m11306("᩺᩻") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-3863)) ^ (-1651441526);
                    i5 = 1881063602;
                    break;
                case -2085946391:
                case -1202234300:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24647) ^ 66714299;
                        i5 = 981681750;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14151)) ^ 1187565049;
                        i5 = -1676875060;
                    }
                    break;
                case -2065439884:
                case -1810226133:
                    if (c22959.m50802()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12149)) ^ 1263894717;
                        i5 = 542542071;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۠ۖ")) * (-17);
                        i4 = ((iM45029 ^ i3) * 24249) ^ (-2130301785);
                        i5 = -587630723;
                    }
                    break;
                case -1999794587:
                case 2105523542:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 809) ^ 1729733553;
                        i5 = 1266786030;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶֫") ^ i3) * 5;
                        i4 = ((iM45029 ^ i2) * (-7997)) ^ (-1993104326);
                        i5 = -1578746306;
                    }
                    break;
                case -1986196438:
                case -848212392:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3683) ^ 1359817028;
                        i5 = 1647103307;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24647) ^ 66714299;
                        i5 = 981681750;
                    }
                    break;
                case -1903871416:
                case 308561935:
                    c22959 = activityC5760.f19570;
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24647) ^ 66714299;
                        i5 = 981681750;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6279) ^ 865478450;
                        i5 = 581458749;
                    }
                    break;
                case -1816326782:
                case -1222974309:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24647) ^ 66714299;
                        i5 = 981681750;
                    } else {
                        iM45029 = (C19806.m45029("֨ۜ") ^ i3) * 47;
                        i4 = ((iM45029 ^ i2) * 15383) ^ 671606754;
                        i5 = 115411239;
                    }
                    break;
                case -1685997990:
                case -1364588234:
                    C0216.m1591();
                    iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 809) ^ 1729733553;
                    i5 = 1266786030;
                    break;
                case -1205763715:
                case 1456312269:
                    RunnableC1895.m6170();
                    if (!C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24647) ^ 66714299;
                        i5 = 981681750;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 809) ^ 1729733553;
                        i5 = 1266786030;
                    }
                    break;
                case -786458044:
                case 690420685:
                    C3577.m10565();
                    if (C1668.m5583()) {
                        iM45029 = C19806.m45029("ۚ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2235)) ^ (-362549835);
                        i5 = -124941458;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 809) ^ 1729733553;
                        i5 = 1266786030;
                    }
                    break;
                case -744987199:
                case 1499028748:
                    C2871.m8646();
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("۠᩹") + i3) * 101;
                        i4 = ((iM45029 ^ i2) * (-10723)) ^ 1128877545;
                        i5 = -788752547;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 809) ^ 1729733553;
                        i5 = 1266786030;
                    }
                    break;
                case -656417123:
                case -10521868:
                    break;
                case 22987391:
                case 1359644702:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("۠᩹") + i3) * 101;
                        i4 = ((iM45029 ^ i2) * (-10723)) ^ 1128877545;
                        i5 = -788752547;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۡۢ")) * 45;
                        i4 = ((iM45029 ^ i3) * (-31473)) ^ (-894280933);
                        i5 = -1290264884;
                    }
                    break;
                case 82609390:
                case 562812256:
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 809) ^ 1729733553;
                        i5 = 1266786030;
                    } else {
                        iM45029 = C19806.m45029("֫ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19225) ^ (-1865709467);
                        i5 = 1449803303;
                    }
                    break;
                case 1577216544:
                case 1620545708:
                    C2477.m7593();
                    C1066.m4023();
                    break;
                default:
                    if (C1398.m4895() <= 0) {
                        iM45029 = (C19806.m45029("۠᩹") + i3) * 101;
                        i4 = ((iM45029 ^ i2) * (-10723)) ^ 1128877545;
                        i5 = -788752547;
                    } else {
                        iM45029 = C19806.m45029("ۚܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13991) ^ 1956481160;
                        i5 = -267893236;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15858(ActivityC5760 activityC5760, View view, C15844 c15844) {
        C13954 c13954M37673 = null;
        C13954 c13954M37674 = null;
        int i = 0;
        C13954 c13954M37675 = null;
        ViewGroup viewGroup = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 141199310;
        int i5 = C2124.f7782;
        int i6 = C7105.f23796;
        int iM45029 = (i6 - C19806.m45029("ܿۘ")) * (-33);
        int i7 = ((iM45029 ^ i5) * 14591) ^ 707131785;
        int i8 = -381056383;
        while (true) {
            i4 = ((((i4 ^ i5) * 21217) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -2097884930:
                case 505228784:
                    if (!RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i5) * (-77);
                        i7 = ((iM45029 ^ i6) * 4205) ^ (-1730144863);
                        i8 = -2061717051;
                    } else {
                        iM45029 = C19806.m45029("ۙ֨") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-25553)) ^ 631834527;
                        i8 = -1539502071;
                    }
                    break;
                case -2047439801:
                case -743859770:
                    c13954M37673 = c15844.m37673(1);
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("᩶᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-26215)) ^ 1297459171;
                        i8 = 642822951;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-3083)) ^ (-230078726);
                        i8 = -499812302;
                    }
                    break;
                case -1996741428:
                case 1934305689:
                    viewGroup = activityC5760.f19555;
                    i2 = c13954M37673.f45912;
                    i3 = 0;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i5) * (-77);
                        i7 = ((iM45029 ^ i6) * 4205) ^ (-1730144863);
                        i8 = -2061717051;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۗ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 27375) ^ 1909831410;
                        i8 = -865796083;
                    }
                    break;
                case -1957719228:
                case -1742682995:
                    C7105.m18985();
                    break;
                case -1821713132:
                case 415223237:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩹") ^ i6;
                        i7 = ((iM45029 ^ i5) * 24283) ^ 1387670132;
                        i8 = 1380220865;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܶ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 1637) ^ 693424274;
                        i8 = 1325026061;
                    }
                    break;
                case -1429734791:
                case 859903321:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("᩶᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-26215)) ^ 1297459171;
                        i8 = 642822951;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۫") ^ i5;
                        i7 = ((iM45029 ^ i6) * 7457) ^ 888761986;
                        i8 = -227682613;
                    }
                    break;
                case -1214978249:
                case -744075283:
                    C1377.m4833();
                    iM45029 = ThreadFactoryC3888.m11306("ۖ᩹") ^ i6;
                    i7 = ((iM45029 ^ i5) * 24283) ^ 1387670132;
                    i8 = 1380220865;
                    break;
                case -1140958506:
                case 932249832:
                    viewGroup.setPadding(i3, i2, i3, i3);
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i5) * (-77);
                        i7 = ((iM45029 ^ i6) * 4205) ^ (-1730144863);
                        i8 = -2061717051;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ܶܿ")) * 87;
                        i7 = ((iM45029 ^ i5) * 31335) ^ 2078469966;
                        i8 = -66808077;
                    }
                    break;
                case -873187888:
                case 1003360857:
                    view.setPadding(i3, i3, i3, C1025.m3867(c13954M37674.f45913, c13954M37675.f45913));
                    break;
                case -444760128:
                case 1059136129:
                    c13954M37675 = c15844.m37673(i);
                    if (CallableC1627.f6528) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ܽ۫")) * (-107);
                        i7 = ((iM45029 ^ i6) * (-12163)) ^ 2087431459;
                        i8 = -1968995379;
                    } else {
                        iM45029 = (C19806.m45029("᩵᩸") ^ i5) * (-7);
                        i7 = ((iM45029 ^ i6) * 4613) ^ (-1840590739);
                        i8 = -1529893224;
                    }
                    break;
                case -379653123:
                case 6770955:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i5) * (-77);
                        i7 = ((iM45029 ^ i6) * 4205) ^ (-1730144863);
                        i8 = -2061717051;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") + i6) * (-79);
                        i7 = ((iM45029 ^ i5) * 18997) ^ 364676747;
                        i8 = 425780013;
                    }
                    break;
                case -331896631:
                case 1225864695:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = C19806.m45029("ۙ֨") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-25553)) ^ 631834527;
                        i8 = -1539502071;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩹") ^ i6;
                        i7 = ((iM45029 ^ i5) * 24283) ^ 1387670132;
                        i8 = 1380220865;
                    }
                    break;
                case -3234340:
                case 962662705:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩹") ^ i6;
                        i7 = ((iM45029 ^ i5) * 24283) ^ 1387670132;
                        i8 = 1380220865;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۜܺ")) * (-65);
                        i7 = ((iM45029 ^ i6) * (-23149)) ^ (-2055244999);
                        i8 = -1965980333;
                    }
                    break;
                case 614848143:
                case 676488162:
                    c13954M37674 = c15844.m37673(2);
                    i = 8;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("᩶᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-26215)) ^ 1297459171;
                        i8 = 642822951;
                    } else {
                        iM45029 = C19806.m45029("᩵ۤ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 21591) ^ 1467834332;
                        i8 = -179942239;
                    }
                    break;
                case 728453056:
                case 1612306445:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩹") ^ i6;
                        i7 = ((iM45029 ^ i5) * 24283) ^ 1387670132;
                        i8 = 1380220865;
                    } else {
                        iM45029 = (C19806.m45029("ܰۖ") ^ i6) * (-125);
                        i7 = ((iM45029 ^ i5) * (-27323)) ^ 2067555440;
                        i8 = 529848386;
                    }
                    break;
                default:
                    if (!C2704.f10408) {
                        iM45029 = C19806.m45029("᩶᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-26215)) ^ 1297459171;
                        i8 = 642822951;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩹") ^ i6;
                        i7 = ((iM45029 ^ i5) * 24283) ^ 1387670132;
                        i8 = 1380220865;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0227 A[PHI: r2 r6 r7 r16
      0x0227: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String), (r2v1 java.lang.String) binds: [B:52:0x0225, B:42:0x019b, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r6v3 short) = (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:52:0x0225, B:42:0x019b, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:52:0x0225, B:42:0x019b, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r16v18 int) = (r16v7 int), (r16v10 int), (r16v19 int) binds: [B:52:0x0225, B:42:0x019b, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0263 A[PHI: r3 r4 r5 r9 r16
      0x0263: PHI (r3v2 android.content.Intent) = (r3v1 android.content.Intent), (r3v1 android.content.Intent), (r3v3 android.content.Intent) binds: [B:56:0x0261, B:38:0x016b, B:34:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:56:0x0261, B:38:0x016b, B:34:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:56:0x0261, B:38:0x016b, B:34:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r9v2 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v3 short[]) binds: [B:56:0x0261, B:38:0x016b, B:34:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r16v12 int) = (r16v6 int), (r16v11 int), (r16v13 int) binds: [B:56:0x0261, B:38:0x016b, B:34:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x031a A[PHI: r16
      0x031a: PHI (r16v21 int) = (r16v2 int), (r16v3 int), (r16v4 int), (r16v22 int) binds: [B:72:0x0318, B:68:0x02f5, B:64:0x02d4, B:8:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (l.C0962.f3784 == false) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m15860(l.AbstractActivityC12483 r18, java.lang.String r19, android.graphics.drawable.Drawable r20, boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC5760.m15860(l.۫ܶۘ, java.lang.String, android.graphics.drawable.Drawable, boolean, java.lang.String):void");
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        TextView textView = null;
        int i = 0;
        int i2 = 1751428043;
        int i3 = C7105.f23796;
        int i4 = C1189.f5284;
        int iM45029 = (C19806.m45029("֫ܶ") + i4) * (-71);
        int i5 = ((iM45029 ^ i3) * 29317) ^ 163014243;
        int i6 = -784664220;
        while (true) {
            int i7 = iM45029 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 20647) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2125827385:
                    case 1385019640:
                        if (textView.getVisibility() != 8) {
                            i = 8;
                            iM45029 = ThreadFactoryC3888.m11306("᩵֨") ^ i4;
                            i5 = ((iM45029 ^ i3) * 10719) ^ 349495209;
                            i6 = -1753394478;
                        }
                        int iM11306 = (ThreadFactoryC3888.m11306("۫֫") + i3) * 91;
                        i5 = ((iM11306 ^ i4) * 8893) ^ 482028823;
                        i7 = iM11306 ^ (-1684551404);
                        i = 8;
                        break;
                        break;
                    case -2054969741:
                    case -1785645410:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۢ۬") + i3) * 39;
                            i5 = ((iM45029 ^ i4) * (-25961)) ^ (-1053450649);
                            i6 = -1868922391;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽۘ") + i4) * q.h;
                            i5 = ((iM45029 ^ i3) * (-14867)) ^ 1672509069;
                            i6 = 1743330520;
                        }
                        break;
                    case -1966108638:
                    case 1669052761:
                        if (C1875.f7103 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۗۤ") ^ i3) * (-13);
                            i5 = ((iM45029 ^ i4) * (-23733)) ^ 81024596;
                            i6 = 415715104;
                        } else {
                            iM45029 = (i3 - C19806.m45029("᩹ۚ")) * 73;
                            i5 = ((iM45029 ^ i4) * 7619) ^ (-1741145053);
                            i6 = 1650116044;
                        }
                        break;
                    case -1933722820:
                    case -672491694:
                        C0526.m2437();
                        break;
                    case -1738778309:
                    case 1202226050:
                        m15871();
                        iM45029 = ThreadFactoryC3888.m11306("᩵֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * 10719) ^ 349495209;
                        i6 = -1753394478;
                        break;
                    case -1608254458:
                    case 1323099375:
                        if (!C3286.f12186) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM45029 ^ i4) * (-15041)) ^ 934356639;
                            i6 = -83566995;
                        } else {
                            iM45029 = (C19806.m45029("۬ۗ") ^ i3) * 93;
                            i5 = ((iM45029 ^ i4) * 14143) ^ (-618983615);
                            i6 = -1441893711;
                        }
                        break;
                    case -1427808002:
                    case -1257190044:
                        RunnableC1564.m5345();
                        iM45029 = (i3 - C19806.m45029("᩹ۚ")) * 73;
                        i5 = ((iM45029 ^ i4) * 7619) ^ (-1741145053);
                        i6 = 1650116044;
                        break;
                    case -1352153039:
                    case -1341350708:
                        if (RunnableC1895.m6170() == 0) {
                            iM45029 = (i3 - C19806.m45029("ᩳܽ")) * 65;
                            i5 = ((iM45029 ^ i4) * (-5749)) ^ (-458427441);
                            i6 = -2072983255;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۤᩳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-3917)) ^ 45425880;
                            i6 = -1714494386;
                        }
                        break;
                    case -422096276:
                    case 71310431:
                        textView = this.f19569;
                        if (C1461.f5957 > 0) {
                            iM45029 = (i4 - C19806.m45029("ۨ۠")) * (-51);
                            i5 = ((iM45029 ^ i3) * 19055) ^ 233844201;
                            i6 = 593403746;
                        } else {
                            iM45029 = (C19806.m45029("۬ۗ") ^ i3) * 93;
                            i5 = ((iM45029 ^ i4) * 14143) ^ (-618983615);
                            i6 = -1441893711;
                        }
                        break;
                    case -415706832:
                    case 2098003722:
                        break;
                    case -388554165:
                    case -376918416:
                        if (C1937.m6279() >= 0) {
                            iM45029 = C19806.m45029("ۗ۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * 18447) ^ (-1565743455);
                            i6 = -1488753049;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽۘ") + i4) * q.h;
                            i5 = ((iM45029 ^ i3) * (-14867)) ^ 1672509069;
                            i6 = 1743330520;
                        }
                        break;
                    case 71403037:
                    case 888949708:
                        if (C2788.f10625 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 19093) ^ 216781650;
                            i6 = -439044174;
                        } else {
                            iM45029 = (i3 - C19806.m45029("᩹ۚ")) * 73;
                            i5 = ((iM45029 ^ i4) * 7619) ^ (-1741145053);
                            i6 = 1650116044;
                        }
                        break;
                    case 219502680:
                    case 1820622308:
                        super.onResume();
                        if (!C2332.f8260) {
                            iM45029 = ThreadFactoryC3888.m11306("ۤᩳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-3917)) ^ 45425880;
                            i6 = -1714494386;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ܶۛ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 6319) ^ 305387509;
                        i6 = 1170150468;
                        break;
                    case 747368965:
                    case 1544357119:
                        C1025.m3861();
                        if (!RunnableC1895.f7152) {
                            iM45029 = ThreadFactoryC3888.m11306("ۤᩳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-3917)) ^ 45425880;
                            i6 = -1714494386;
                            break;
                        }
                        iM45029 = C19806.m45029("ۗ۬") ^ i3;
                        i5 = ((iM45029 ^ i4) * 18447) ^ (-1565743455);
                        i6 = -1488753049;
                        break;
                    case 1173358726:
                    case 1415532179:
                        if (C3660.m10791() == 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩵᩵") + i4) * (-119);
                            i5 = ((iM45029 ^ i3) * 21123) ^ (-1779971175);
                            i6 = 1197111035;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۤᩳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-3917)) ^ 45425880;
                            i6 = -1714494386;
                        }
                        break;
                    case 1218447321:
                    case 1831330237:
                        ThreadFactoryC3888.m11300();
                        if (C2332.m7079() > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽۘ") + i4) * q.h;
                            i5 = ((iM45029 ^ i3) * (-14867)) ^ 1672509069;
                            i6 = 1743330520;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("᩹ۚ")) * 73;
                        i5 = ((iM45029 ^ i4) * 7619) ^ (-1741145053);
                        i6 = 1650116044;
                        break;
                    case 1785679361:
                    case 2068154498:
                        if (this.f19564.getVisibility() != i) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵֨") ^ i4;
                            i5 = ((iM45029 ^ i3) * 10719) ^ 349495209;
                            i6 = -1753394478;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("۠۠") ^ i4;
                        i5 = ((iM45029 ^ i3) * 24165) ^ 565703791;
                        i6 = 938403251;
                        break;
                    case 1845227389:
                    case 2067517511:
                        if (!C2704.f10408) {
                            iM45029 = (i3 - C19806.m45029("᩹ۚ")) * 73;
                            i5 = ((iM45029 ^ i4) * 7619) ^ (-1741145053);
                            i6 = 1650116044;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ۫") + i4) * 89;
                        i5 = ((iM45029 ^ i3) * 1613) ^ (-1242165948);
                        i6 = -1192335618;
                        break;
                    default:
                        if (C2642.f10294 > 0) {
                            iM45029 = (i4 - C19806.m45029("ۤ᩺")) * (-107);
                            i5 = ((iM45029 ^ i3) * (-22535)) ^ 2060466953;
                            i6 = 378863786;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽۘ") + i4) * q.h;
                            i5 = ((iM45029 ^ i3) * (-14867)) ^ 1672509069;
                            i6 = 1743330520;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        boolean z;
        String strM9869;
        int i;
        int i2;
        SubMenu subMenu;
        int i3;
        short[] sArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short[] sArr2;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        SubMenu subMenu2;
        short[] sArr3;
        int i13;
        short[] sArr4;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM11306;
        int i18;
        int i19;
        int i20;
        int iM45029;
        ?? r7;
        int iM11307;
        int i21;
        int i22;
        int iM11308;
        int i23;
        int i24;
        int iM11309;
        int i25;
        int i26;
        int i27;
        int iM450210;
        int i28;
        int i29;
        String str2;
        MenuItem menuItem2;
        int i30;
        SubMenu subMenu3;
        int i31;
        int i32;
        C8067 c8067;
        int iM450211;
        int i33;
        int i34;
        MenuItem menuItem3;
        int i35;
        SubMenu subMenu4;
        String strM29845;
        int iM113010;
        int i36;
        int i37;
        ActivityC5760 activityC5760 = this;
        int i38 = 664572579;
        int i39 = C1066.f4915;
        int i40 = C1875.f7103;
        int iM113011 = (ThreadFactoryC3888.m11306("۫ۨ") ^ i40) * (-39);
        int i41 = ((iM113011 ^ i39) * 26757) ^ 2096897992;
        int i42 = iM113011 ^ 305032036;
        SubMenu subMenu5 = null;
        C8067 c8068 = null;
        C18419 c18419 = null;
        String strM3021 = null;
        String str3 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        boolean z3 = false;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        short s = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        MenuItem menuItem4 = null;
        MenuItem menuItemM10785 = null;
        String str4 = null;
        boolean z4 = false;
        C8067 c8069 = null;
        boolean z5 = false;
        while (true) {
            i38 = i42 ^ (i41 & (((i38 ^ i39) * 24233) >> 31));
            switch (i38) {
                case -2118242177:
                case 606792808:
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    int i58 = DialogInterfaceC19356.f62401;
                    c8069 = new C8067(activityC5760);
                    sArr7 = f19554;
                    i43 = 190;
                    i44 = 3;
                    if (C1977.f7413 > 0) {
                        iM450210 = (C19806.m45029("ۢۡ") ^ i39) * (-39);
                        i28 = ((iM450210 ^ i40) * 12237) ^ 414836546;
                        i29 = -2073003841;
                        i42 = iM450210 ^ i29;
                        i41 = i28;
                        strM3021 = strM3021;
                        menuItem4 = menuItem4;
                    } else {
                        z2 = z3 ? 1 : 0;
                        i11 = i47;
                        i12 = i51;
                        c8068 = c8068;
                        i53 = i53;
                        subMenu2 = subMenu5;
                        menuItem4 = menuItem4;
                        sArr3 = sArr5;
                        i13 = i54;
                        i17 = i55;
                        sArr4 = sArr6;
                        i14 = i56;
                        i15 = i57;
                        i16 = 3;
                        int iM450212 = C19806.m45029("ᩴۜ") ^ i40;
                        i41 = ((iM450212 ^ i39) * 27981) ^ 1776505899;
                        i42 = iM450212 ^ 1253420736;
                        activityC5760 = this;
                        i54 = i13;
                        i55 = i17;
                        sArr5 = sArr3;
                        i57 = i15;
                        i44 = i16;
                        strM3021 = strM3021;
                        i56 = i14;
                        sArr6 = sArr4;
                        i51 = i12;
                        i47 = i11;
                        subMenu5 = subMenu2;
                        z3 = z2;
                        i53 = i53;
                        r7 = i46;
                        c8068 = c8068;
                        i46 = r7;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -1995725539:
                case -949370525:
                    if (!C1377.f5749) {
                        strM3021 = strM3021;
                        z2 = z3 ? 1 : 0;
                        menuItem4 = menuItem4;
                        i11 = i47;
                        i12 = i51;
                        c8068 = c8068;
                        i53 = i53;
                        subMenu2 = subMenu5;
                        sArr3 = sArr5;
                        i13 = i54;
                        sArr4 = sArr6;
                        i14 = i56;
                        i15 = i57;
                        i16 = i44;
                        i17 = i55;
                        int iM450213 = C19806.m45029("ᩴۜ") ^ i40;
                        i41 = ((iM450213 ^ i39) * 27981) ^ 1776505899;
                        i42 = iM450213 ^ 1253420736;
                        activityC5760 = this;
                        i54 = i13;
                        i55 = i17;
                        sArr5 = sArr3;
                        i57 = i15;
                        i44 = i16;
                        strM3021 = strM3021;
                        i56 = i14;
                        sArr6 = sArr4;
                        i51 = i12;
                        i47 = i11;
                        subMenu5 = subMenu2;
                        z3 = z2;
                        i53 = i53;
                        r7 = i46;
                        c8068 = c8068;
                        i46 = r7;
                        menuItem4 = menuItem4;
                    } else {
                        int iM113012 = (ThreadFactoryC3888.m11306("᩸ܰ") + i40) * (-71);
                        i42 = iM113012 ^ (-1543218812);
                        i41 = ((iM113012 ^ i39) * 10789) ^ (-1542051002);
                    }
                    break;
                case -1977977925:
                case -246239950:
                    strM29845 = c18419.m42743();
                    str4 = strM29845;
                    iM450210 = ThreadFactoryC3888.m11306("۫ۢ") ^ i40;
                    i28 = ((iM450210 ^ i39) * (-14917)) ^ (-924987125);
                    i29 = 1787821701;
                    i42 = iM450210 ^ i29;
                    i41 = i28;
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    break;
                case -1944218772:
                case -712849556:
                    C10634.m26830(c8069, ThreadFactoryC3888.m11306(C10634.m26821(f19554, 199, 3, i45)) ^ 2121319928, null);
                    CallableC1627.m5514(c8069);
                    return i46;
                case -1901633074:
                case 1965788156:
                    str = strM3021;
                    z = z3 ? 1 : 0;
                    menuItem4 = menuItem4;
                    c8068 = c8068;
                    int i59 = i52;
                    i2 = i53;
                    subMenu = subMenu5;
                    sArr2 = sArr5;
                    i3 = i54;
                    sArr = sArr6;
                    i4 = i56;
                    i5 = i43;
                    i6 = i44;
                    i8 = i51;
                    i9 = i55;
                    i10 = i57;
                    i7 = i48 ^ i49;
                    i = i59;
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f19554, 170, 3, i45);
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("ܰۛ") ^ i39;
                        i20 = ((iM45029 ^ i40) * (-18735)) ^ 1251847953;
                        i19 = 1516163527;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩶") ^ i40;
                        i20 = ((iM45029 ^ i39) * (-2701)) ^ 1915919779;
                        i19 = -2017032435;
                    }
                    i54 = i3;
                    i55 = i9;
                    sArr5 = sArr2;
                    i47 = i7;
                    i57 = i10;
                    i44 = i6;
                    strM3021 = str;
                    i56 = i4;
                    sArr6 = sArr;
                    str3 = strM9869;
                    i51 = i8;
                    i43 = i5;
                    subMenu5 = subMenu;
                    i52 = i;
                    activityC5760 = this;
                    i42 = iM45029 ^ i19;
                    i41 = i20;
                    i53 = i2;
                    z3 = z;
                    r7 = i46;
                    c8068 = c8068;
                    i46 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -1779130281:
                case -495094951:
                    str2 = strM3021;
                    i35 = i53;
                    subMenu4 = subMenu5;
                    menuItem3 = menuItem4;
                    z5 = true;
                    int iM113013 = (ThreadFactoryC3888.m11306("۠ۤ") + i40) * (-63);
                    i42 = iM113013 ^ 298498674;
                    i41 = ((iM113013 ^ i39) * (-14411)) ^ 1769304711;
                    subMenu5 = subMenu4;
                    i53 = i35;
                    menuItem4 = menuItem3;
                    strM3021 = str2;
                    break;
                case -1759001139:
                case -338822602:
                    C1875.m6086();
                    if (C0671.f2816 != 0) {
                        strM3021 = strM3021;
                        z3 = z3 ? 1 : 0;
                        menuItem4 = menuItem4;
                        i47 = i47;
                        i51 = i51;
                        c8068 = c8068;
                        i52 = i52;
                        i53 = i53;
                        subMenu5 = subMenu5;
                        sArr6 = sArr6;
                        i56 = i56;
                        i57 = i57;
                        i43 = i43;
                        i44 = i44;
                        int iM113014 = ThreadFactoryC3888.m11306("ۡۤ") ^ i39;
                        i41 = ((iM113014 ^ i40) * 5141) ^ (-365476392);
                        i47 = i47;
                        i57 = i57;
                        i43 = i43;
                        i44 = i44;
                        strM3021 = strM3021;
                        i56 = i56;
                        z3 = z3;
                        sArr6 = sArr6;
                        i52 = i52;
                        i51 = i51;
                        i42 = iM113014 ^ 1229638;
                        subMenu5 = subMenu5;
                        activityC5760 = this;
                        i53 = i53;
                        r7 = i46;
                        c8068 = c8068;
                        i46 = r7;
                        menuItem4 = menuItem4;
                    } else {
                        int iM113015 = (ThreadFactoryC3888.m11306("᩸ܰ") + i40) * (-71);
                        i42 = iM113015 ^ (-1543218812);
                        i41 = ((iM113015 ^ i39) * 10789) ^ (-1542051002);
                    }
                    break;
                case -1737156598:
                case 150381500:
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    i52 = i52;
                    i53 = i53;
                    subMenu5 = subMenu5;
                    if (i52 != i53) {
                        i43 = i43;
                        iM11309 = C19806.m45029("ܳ֡") ^ i39;
                        i25 = ((iM11309 ^ i40) * 31443) ^ (-808658614);
                        i26 = -869871499;
                        i42 = iM11309 ^ i26;
                        i43 = i43;
                        subMenu5 = subMenu5;
                        i52 = i52;
                        i53 = i53;
                        i41 = i25;
                        strM3021 = strM3021;
                        i46 = i46;
                        menuItem4 = menuItem4;
                    } else {
                        int iM450214 = C19806.m45029("֡᩺") ^ i40;
                        int i60 = i43;
                        int i61 = ((iM450214 ^ i39) * 27721) ^ 1674283581;
                        i42 = iM450214 ^ (-1136659011);
                        menuItem4 = menuItem4;
                        subMenu5 = subMenu5;
                        i53 = i53;
                        strM3021 = strM3021;
                        i27 = i60;
                        i52 = i52;
                        i41 = i61;
                        i43 = i27;
                    }
                    break;
                case -1632860095:
                case -1584953467:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!C0817.m3399()) {
                        int iM113016 = (ThreadFactoryC3888.m11306("᩸ܰ") + i40) * (-71);
                        i42 = iM113016 ^ (-1543218812);
                        i41 = ((iM113016 ^ i39) * 10789) ^ (-1542051002);
                    } else {
                        str = strM3021;
                        z = z3 ? 1 : 0;
                        menuItem4 = menuItem4;
                        strM9869 = str3;
                        c8068 = c8068;
                        i = i52;
                        i2 = i53;
                        subMenu = subMenu5;
                        i3 = i54;
                        sArr = sArr6;
                        i4 = i56;
                        i5 = i43;
                        i6 = i44;
                        i7 = i47;
                        i8 = i51;
                        sArr2 = sArr5;
                        i9 = i55;
                        i10 = i57;
                        iM45029 = C19806.m45029("ܰۛ") ^ i39;
                        i20 = ((iM45029 ^ i40) * (-18735)) ^ 1251847953;
                        i19 = 1516163527;
                        i54 = i3;
                        i55 = i9;
                        sArr5 = sArr2;
                        i47 = i7;
                        i57 = i10;
                        i44 = i6;
                        strM3021 = str;
                        i56 = i4;
                        sArr6 = sArr;
                        str3 = strM9869;
                        i51 = i8;
                        i43 = i5;
                        subMenu5 = subMenu;
                        i52 = i;
                        activityC5760 = this;
                        i42 = iM45029 ^ i19;
                        i41 = i20;
                        i53 = i2;
                        z3 = z;
                        r7 = i46;
                        c8068 = c8068;
                        i46 = r7;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -1449517611:
                case 2090267176:
                    return z3;
                case -1433576338:
                case -1132195613:
                    C7105.m18985();
                    return false;
                case -1376864129:
                case -847325352:
                    String str5 = strM3021;
                    menuItem4 = menuItem4;
                    c8068 = c8068;
                    int i62 = i52;
                    int i63 = i53;
                    SubMenu subMenu6 = subMenu5;
                    short[] sArr8 = sArr5;
                    int i64 = i54;
                    short[] sArr9 = sArr6;
                    int i65 = i56;
                    int i66 = i57;
                    int i67 = i43;
                    int i68 = i44;
                    int i69 = i55;
                    int iM113017 = ThreadFactoryC3888.m11306(C0050.m940(sArr8, i64, i69, i45)) ^ 2130095934;
                    int i70 = i47;
                    if (i62 == i70) {
                        int iM113018 = (i40 - ThreadFactoryC3888.m11306("ۨ᩹")) * (-9);
                        int i71 = ((iM113018 ^ i39) * (-1969)) ^ (-1919088545);
                        sArr5 = sArr8;
                        i54 = i64;
                        i55 = i69;
                        i42 = iM113018 ^ 155432077;
                        i57 = i66;
                        i44 = i68;
                        strM3021 = str5;
                        i56 = i65;
                        sArr6 = sArr9;
                        activityC5760 = this;
                        i51 = iM113017;
                        i47 = i70;
                        i43 = i67;
                        subMenu5 = subMenu6;
                        z3 = false;
                        i52 = i62;
                        i41 = i71;
                        i53 = i63;
                        r7 = 1;
                        c8068 = c8068;
                        i46 = r7;
                    } else {
                        int iM450215 = C19806.m45029("ۧ᩷") ^ i39;
                        int i72 = ((iM450215 ^ i40) * 13679) ^ (-136956886);
                        i54 = i64;
                        i55 = i69;
                        i42 = iM450215 ^ (-1273650890);
                        sArr5 = sArr8;
                        i57 = i66;
                        i44 = i68;
                        strM3021 = str5;
                        i56 = i65;
                        sArr6 = sArr9;
                        i46 = 1;
                        i51 = iM113017;
                        i47 = i70;
                        i43 = i67;
                        subMenu5 = subMenu6;
                        z3 = false;
                        i52 = i62;
                        i53 = i63;
                        i41 = i72;
                        c8068 = c8068;
                        activityC5760 = this;
                    }
                    menuItem4 = menuItem4;
                    break;
                case -1307742071:
                case 169577312:
                    str2 = strM3021;
                    int i73 = i44;
                    C8067 c80610 = c8068;
                    int i74 = i52;
                    int i75 = i53;
                    short[] sArr10 = sArr6;
                    int i76 = i56;
                    int i77 = i43;
                    int i78 = i51;
                    int i79 = i57;
                    SubMenu subMenu7 = menuItem.getSubMenu();
                    C3286.m9779(subMenu7);
                    MenuItem menuItemM10786 = C3660.m10785(subMenu7, i78);
                    if (activityC5760.f19568 == null) {
                        int iM113019 = ThreadFactoryC3888.m11306("ۘܰ") ^ i39;
                        int i80 = ((iM113019 ^ i40) * (-10323)) ^ (-1782280984);
                        i42 = iM113019 ^ 1880310679;
                        activityC5760 = this;
                        i57 = i79;
                        i53 = i75;
                        i56 = i76;
                        sArr6 = sArr10;
                        i51 = i78;
                        c8068 = c80610;
                        i43 = i77;
                        i52 = i74;
                        menuItem4 = menuItemM10786;
                        i41 = i80;
                        i44 = i73;
                        subMenu5 = subMenu7;
                        strM3021 = str2;
                    } else {
                        int iM450216 = C19806.m45029("ۢ᩺") ^ i39;
                        i42 = iM450216 ^ 1679431571;
                        i57 = i79;
                        i53 = i75;
                        i56 = i76;
                        sArr6 = sArr10;
                        i51 = i78;
                        c8068 = c80610;
                        i43 = i77;
                        i52 = i74;
                        menuItem4 = menuItemM10786;
                        i44 = i73;
                        i41 = ((iM450216 ^ i40) * (-607)) ^ 493845591;
                        subMenu5 = subMenu7;
                        strM3021 = str2;
                        activityC5760 = this;
                    }
                    break;
                case -1254801525:
                case -609390354:
                    i45 = 44345;
                    iM11306 = C19806.m45029("۫ۡ") ^ i39;
                    i41 = ((iM11306 ^ i40) * 26787) ^ 1381514953;
                    i18 = -1912279637;
                    int i81 = iM11306 ^ i18;
                    i54 = i54;
                    i55 = i55;
                    sArr5 = sArr5;
                    i57 = i57;
                    i43 = i43;
                    i44 = i44;
                    strM3021 = strM3021;
                    i56 = i56;
                    sArr6 = sArr6;
                    i52 = i52;
                    i51 = i51;
                    i42 = i81;
                    i47 = i47;
                    subMenu5 = subMenu5;
                    z3 = z3;
                    activityC5760 = this;
                    i53 = i53;
                    r7 = i46;
                    c8068 = c8068;
                    i46 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -1133564322:
                case 1460547305:
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    c18419 = activityC5760.f19568;
                    if (c18419 != null) {
                        iM450210 = ThreadFactoryC3888.m11306("᩵ۙ") ^ i39;
                        i28 = ((iM450210 ^ i40) * 26489) ^ (-123914618);
                        i29 = -274374191;
                    } else {
                        iM450210 = (i40 - ThreadFactoryC3888.m11306("ᩴᩳ")) * 69;
                        i28 = ((iM450210 ^ i39) * (-28561)) ^ 2040498812;
                        i29 = -1774763857;
                    }
                    i42 = iM450210 ^ i29;
                    i41 = i28;
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    break;
                case -960970339:
                case 875329564:
                    strM3021 = strM3021;
                    menuItem2 = menuItem4;
                    i52 = i52;
                    i30 = i53;
                    subMenu3 = subMenu5;
                    i31 = i43;
                    i32 = i44;
                    int i82 = DialogInterfaceC19356.f62401;
                    c8067 = new C8067(activityC5760);
                    sArr6 = f19554;
                    i56 = 179;
                    i57 = 3;
                    if (RunnableC3388.f12514 >= 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۡ᩷") ^ i39) * 39;
                        i33 = ((iM450211 ^ i40) * 30393) ^ (-653779888);
                        i34 = -1018799605;
                    } else {
                        iM450211 = (C19806.m45029("۟ܳ") ^ i39) * (-19);
                        i33 = ((iM450211 ^ i40) * (-31099)) ^ (-2115153396);
                        i34 = -1261372913;
                    }
                    i42 = iM450211 ^ i34;
                    menuItem4 = menuItem2;
                    strM3021 = strM3021;
                    i27 = i31;
                    i52 = i52;
                    i41 = i33;
                    i44 = i32;
                    subMenu5 = subMenu3;
                    i53 = i30;
                    c8068 = c8067;
                    i43 = i27;
                    break;
                case -915805247:
                case 111760757:
                    C8067 c80611 = c8068;
                    C0671.m3015(c80611, activityC5760.f19565);
                    TextView textView = (TextView) CallableC1627.m5514(c80611).m44364(R.id.message);
                    C0674.m3031(textView);
                    C7105.m18993(textView, new ViewOnClickListenerC4198());
                    return i46;
                case -777422808:
                case 202292895:
                    String str6 = strM3021;
                    menuItem4 = menuItem4;
                    c8068 = c8068;
                    int i83 = i52;
                    int i84 = i53;
                    SubMenu subMenu8 = subMenu5;
                    short[] sArr11 = sArr6;
                    int i85 = i56;
                    int i86 = i43;
                    int i87 = i44;
                    int i88 = i51;
                    int i89 = i57;
                    if (i83 == (ThreadFactoryC3888.m11306(C2477.m7604(f19554, PicnicEngine.MAX_AUX_BYTES, 3, i45)) ^ 2102064359)) {
                        iM11307 = C19806.m45029("֫ۙ") ^ i40;
                        i21 = ((iM11307 ^ i39) * (-17633)) ^ (-288913966);
                        i22 = -551690945;
                    } else {
                        iM11307 = (i39 - ThreadFactoryC3888.m11306("᩶ۘ")) * 57;
                        i21 = ((iM11307 ^ i40) * (-4099)) ^ 421522880;
                        i22 = -518635115;
                    }
                    i42 = iM11307 ^ i22;
                    activityC5760 = this;
                    i57 = i89;
                    i44 = i87;
                    i56 = i85;
                    sArr6 = sArr11;
                    i51 = i88;
                    i43 = i86;
                    subMenu5 = subMenu8;
                    i52 = i83;
                    i41 = i21;
                    i53 = i84;
                    strM3021 = str6;
                    r7 = i46;
                    c8068 = c8068;
                    i46 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -745612155:
                case -340256365:
                    int i90 = i43;
                    strM3021 = strM3021;
                    z2 = z3 ? 1 : 0;
                    menuItem4 = menuItem4;
                    i11 = i47;
                    int i91 = i51;
                    c8068 = c8068;
                    i53 = i53;
                    subMenu2 = subMenu5;
                    sArr3 = sArr5;
                    i13 = i54;
                    sArr4 = sArr6;
                    i14 = i56;
                    i15 = i57;
                    i16 = i44;
                    i17 = i55;
                    int iM6285 = C1937.m6285(menuItem);
                    i12 = i91;
                    int iM113020 = ThreadFactoryC3888.m11306(AbstractC0464.m2308(f19554, 167, 3, i45));
                    i49 = 2128299223;
                    if (C1875.f7103 >= 0) {
                        i43 = i90;
                        i52 = iM6285;
                        i48 = iM113020;
                        int iM450217 = C19806.m45029("ᩴۜ") ^ i40;
                        i41 = ((iM450217 ^ i39) * 27981) ^ 1776505899;
                        i42 = iM450217 ^ 1253420736;
                        activityC5760 = this;
                        i54 = i13;
                        i55 = i17;
                        sArr5 = sArr3;
                        i57 = i15;
                        i44 = i16;
                        strM3021 = strM3021;
                        i56 = i14;
                        sArr6 = sArr4;
                        i51 = i12;
                        i47 = i11;
                        subMenu5 = subMenu2;
                        z3 = z2;
                        i53 = i53;
                        r7 = i46;
                    } else {
                        int iM113021 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i39;
                        i42 = iM113021 ^ 278174147;
                        i41 = ((iM113021 ^ i40) * 25389) ^ 35477144;
                        i54 = i13;
                        i55 = i17;
                        sArr5 = sArr3;
                        i57 = i15;
                        i43 = i90;
                        i44 = i16;
                        strM3021 = strM3021;
                        i56 = i14;
                        sArr6 = sArr4;
                        i51 = i12;
                        i47 = i11;
                        i52 = iM6285;
                        subMenu5 = subMenu2;
                        z3 = z2 ? 1 : 0;
                        i48 = iM113020;
                        i53 = i53;
                        activityC5760 = this;
                        r7 = i46;
                    }
                    c8068 = c8068;
                    i46 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -656031158:
                case 960958996:
                    strM3021 = strM3021;
                    z3 = z3 ? 1 : 0;
                    menuItem4 = menuItem4;
                    i47 = i47;
                    i51 = i51;
                    c8068 = c8068;
                    i52 = i52;
                    i53 = i53;
                    subMenu5 = subMenu5;
                    sArr5 = sArr5;
                    i54 = i54;
                    sArr6 = sArr6;
                    i56 = i56;
                    i57 = i57;
                    i43 = i43;
                    i44 = i44;
                    i55 = i55;
                    s = f19554[166];
                    i50 = s + 1;
                    if (!C1377.f5749) {
                        i54 = i54;
                        i55 = i55;
                        sArr5 = sArr5;
                        int iM1130110 = ThreadFactoryC3888.m11306("ۡۤ") ^ i39;
                        i41 = ((iM1130110 ^ i40) * 5141) ^ (-365476392);
                        i47 = i47;
                        i57 = i57;
                        i43 = i43;
                        i44 = i44;
                        strM3021 = strM3021;
                        i56 = i56;
                        z3 = z3;
                        sArr6 = sArr6;
                        i52 = i52;
                        i51 = i51;
                        i42 = iM1130110 ^ 1229638;
                        subMenu5 = subMenu5;
                        activityC5760 = this;
                        i53 = i53;
                        r7 = i46;
                        c8068 = c8068;
                        i46 = r7;
                        menuItem4 = menuItem4;
                    } else {
                        iM11306 = (i40 - ThreadFactoryC3888.m11306("ܽ᩹")) * 85;
                        i41 = ((iM11306 ^ i39) * 17687) ^ (-294961011);
                        i18 = 926898931;
                        int i810 = iM11306 ^ i18;
                        i54 = i54;
                        i55 = i55;
                        sArr5 = sArr5;
                        i57 = i57;
                        i43 = i43;
                        i44 = i44;
                        strM3021 = strM3021;
                        i56 = i56;
                        sArr6 = sArr6;
                        i52 = i52;
                        i51 = i51;
                        i42 = i810;
                        i47 = i47;
                        subMenu5 = subMenu5;
                        z3 = z3;
                        activityC5760 = this;
                        i53 = i53;
                        r7 = i46;
                        c8068 = c8068;
                        i46 = r7;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -590926993:
                case 259832067:
                    menuItemM10785.setEnabled(z5);
                    return i46;
                case -588327235:
                case -235649845:
                    str2 = strM3021;
                    menuItem3 = menuItem4;
                    menuItem3.setEnabled(z4);
                    i35 = i53;
                    SubMenu subMenu9 = subMenu5;
                    menuItemM10785 = C3660.m10785(subMenu9, i35);
                    if (C17132.m40033(activityC5760.f19565) != null) {
                        int iM450218 = (C19806.m45029("ۡ᩵") + i39) * (-27);
                        i41 = ((iM450218 ^ i40) * 6277) ^ 40718957;
                        i42 = iM450218 ^ (-1485624781);
                        menuItem4 = menuItem3;
                        subMenu5 = subMenu9;
                        i53 = i35;
                    } else {
                        subMenu4 = subMenu9;
                        z5 = z3 ? 1 : 0;
                        int iM1130111 = (ThreadFactoryC3888.m11306("۠ۤ") + i40) * (-63);
                        i42 = iM1130111 ^ 298498674;
                        i41 = ((iM1130111 ^ i39) * (-14411)) ^ 1769304711;
                        subMenu5 = subMenu4;
                        i53 = i35;
                        menuItem4 = menuItem3;
                    }
                    strM3021 = str2;
                    break;
                case -559202585:
                case 36421699:
                    String str7 = activityC5760.f19565;
                    Intent intent = new Intent(activityC5760, (Class<?>) ActivityC9994.class);
                    C1189.m4372(intent, CallableC1627.m5502(f19554, 182, 8, i45), str7);
                    C3286.m9800(activityC5760, intent);
                    return i46;
                case -512091767:
                case 27709733:
                    z4 = true;
                    iM11309 = (ThreadFactoryC3888.m11306("ۡ֫") ^ i39) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i25 = ((iM11309 ^ i40) * (-12365)) ^ 695687237;
                    i26 = 1947045095;
                    i42 = iM11309 ^ i26;
                    i43 = i43;
                    subMenu5 = subMenu5;
                    i52 = i52;
                    i53 = i53;
                    i41 = i25;
                    strM3021 = strM3021;
                    i46 = i46;
                    menuItem4 = menuItem4;
                    break;
                case -371836416:
                case 1618584441:
                    C10634.m26820();
                    strM3021 = strM3021;
                    menuItem2 = menuItem4;
                    i31 = i43;
                    c8067 = c8068;
                    i30 = i53;
                    subMenu3 = subMenu5;
                    i32 = i44;
                    iM450211 = (ThreadFactoryC3888.m11306("ۡ᩷") ^ i39) * 39;
                    i33 = ((iM450211 ^ i40) * 30393) ^ (-653779888);
                    i34 = -1018799605;
                    i42 = iM450211 ^ i34;
                    menuItem4 = menuItem2;
                    strM3021 = strM3021;
                    i27 = i31;
                    i52 = i52;
                    i41 = i33;
                    i44 = i32;
                    subMenu5 = subMenu3;
                    i53 = i30;
                    c8068 = c8067;
                    i43 = i27;
                    break;
                case -350679558:
                case 1425174175:
                    i45 = 13625;
                    iM11306 = C19806.m45029("۫ۡ") ^ i39;
                    i41 = ((iM11306 ^ i40) * 26787) ^ 1381514953;
                    i18 = -1912279637;
                    int i811 = iM11306 ^ i18;
                    i54 = i54;
                    i55 = i55;
                    sArr5 = sArr5;
                    i57 = i57;
                    i43 = i43;
                    i44 = i44;
                    strM3021 = strM3021;
                    i56 = i56;
                    sArr6 = sArr6;
                    i52 = i52;
                    i51 = i51;
                    i42 = i811;
                    i47 = i47;
                    subMenu5 = subMenu5;
                    z3 = z3;
                    activityC5760 = this;
                    i53 = i53;
                    r7 = i46;
                    c8068 = c8068;
                    i46 = r7;
                    menuItem4 = menuItem4;
                    break;
                case -198693212:
                case 1827986365:
                    strM3021 = strM3021;
                    z3 = z3 ? 1 : 0;
                    menuItem4 = menuItem4;
                    i47 = i47;
                    c8068 = c8068;
                    int i92 = i52;
                    subMenu5 = subMenu5;
                    sArr6 = sArr6;
                    i56 = i56;
                    i43 = i43;
                    i44 = i44;
                    int i93 = i51;
                    i57 = i57;
                    int iM450219 = C19806.m45029(str3) ^ 2118715113;
                    sArr5 = f19554;
                    i54 = 173;
                    i55 = 3;
                    if (C0216.m1591() > 0) {
                        int iM113022 = ThreadFactoryC3888.m11306("᩵᩸") ^ i40;
                        int i94 = ((iM113022 ^ i39) * 24073) ^ 825047111;
                        i42 = iM113022 ^ 642550358;
                        i47 = i47;
                        c8068 = c8068;
                        i57 = i57;
                        strM3021 = strM3021;
                        i56 = i56;
                        z3 = z3 ? 1 : 0;
                        sArr6 = sArr6;
                        i51 = i93;
                        menuItem4 = menuItem4;
                        i43 = i43;
                        i52 = i92;
                        i41 = i94;
                        i44 = i44;
                        subMenu5 = subMenu5;
                        i53 = iM450219;
                        activityC5760 = this;
                    } else {
                        i53 = iM450219;
                        i52 = i92;
                        i51 = i93;
                        int iM1130112 = ThreadFactoryC3888.m11306("ۡۤ") ^ i39;
                        i41 = ((iM1130112 ^ i40) * 5141) ^ (-365476392);
                        i47 = i47;
                        i57 = i57;
                        i43 = i43;
                        i44 = i44;
                        strM3021 = strM3021;
                        i56 = i56;
                        z3 = z3;
                        sArr6 = sArr6;
                        i52 = i52;
                        i51 = i51;
                        i42 = iM1130112 ^ 1229638;
                        subMenu5 = subMenu5;
                        activityC5760 = this;
                        i53 = i53;
                        r7 = i46;
                        c8068 = c8068;
                        i46 = r7;
                        menuItem4 = menuItem4;
                    }
                    break;
                case -178166327:
                case 382294221:
                    C11986 c11986M40033 = C17132.m40033(activityC5760.f19565);
                    C1419.m4970(c11986M40033);
                    strM29845 = c11986M40033.m29845();
                    str4 = strM29845;
                    iM450210 = ThreadFactoryC3888.m11306("۫ۢ") ^ i40;
                    i28 = ((iM450210 ^ i39) * (-14917)) ^ (-924987125);
                    i29 = 1787821701;
                    i42 = iM450210 ^ i29;
                    i41 = i28;
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    break;
                case -144095681:
                case 1177906566:
                    menuItem4 = menuItem4;
                    Object[] objArr = new Object[i46];
                    objArr[z3 ? 1 : 0] = str4;
                    strM3021 = C0671.m3021(activityC5760, C19806.m45029(C0797.m3361(f19554, 193, 3, i45)) ^ 2121375707, objArr);
                    if (C1875.f7103 >= 0) {
                        iM113010 = (C19806.m45029("ܶۢ") ^ i40) * (-75);
                        i36 = ((iM113010 ^ i39) * 7415) ^ 1750573814;
                        i37 = -1887779400;
                    } else {
                        iM113010 = (i40 - ThreadFactoryC3888.m11306("۫ۜ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i36 = ((iM113010 ^ i39) * (-1653)) ^ (-1289291924);
                        i37 = 1645790771;
                    }
                    i42 = iM113010 ^ i37;
                    i41 = i36;
                    menuItem4 = menuItem4;
                    break;
                case 66529632:
                case 71751702:
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    C0050.m933(c8069, C19806.m45029(C2871.m8640(sArr7, i43, i44, i45)) ^ 2098176769);
                    if (C1460.f5948 >= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۜۖ") ^ i39;
                        i28 = ((iM450210 ^ i40) * 20185) ^ 1600706479;
                        i29 = -1563085961;
                    } else {
                        iM450210 = (C19806.m45029("᩹᩺") ^ i39) * 99;
                        i28 = ((iM450210 ^ i40) * (-1009)) ^ 709494105;
                        i29 = -1368533326;
                    }
                    i42 = iM450210 ^ i29;
                    i41 = i28;
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    break;
                case 150157956:
                case 1195069305:
                    String str8 = strM3021;
                    menuItem4 = menuItem4;
                    c8068 = c8068;
                    int i95 = i52;
                    i53 = i53;
                    SubMenu subMenu10 = subMenu5;
                    short[] sArr12 = sArr6;
                    int i96 = i56;
                    int i97 = i43;
                    int i98 = i44;
                    int i99 = i51;
                    int i100 = i57;
                    if (i95 == i99) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۤۢ") ^ i40) * (-73);
                        i23 = ((iM11308 ^ i39) * 16517) ^ (-2045807485);
                        i24 = -320832362;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("۬᩶") ^ i40;
                        i23 = ((iM11308 ^ i39) * (-10243)) ^ (-1124298989);
                        i24 = -473480933;
                    }
                    i42 = iM11308 ^ i24;
                    i57 = i100;
                    strM3021 = str8;
                    i56 = i96;
                    sArr6 = sArr12;
                    i51 = i99;
                    i43 = i97;
                    i52 = i95;
                    i41 = i23;
                    i44 = i98;
                    subMenu5 = subMenu10;
                    i53 = i53;
                    r7 = i46;
                    c8068 = c8068;
                    i46 = r7;
                    menuItem4 = menuItem4;
                    break;
                case 363835809:
                case 483696630:
                    z4 = false;
                    iM11309 = (ThreadFactoryC3888.m11306("ۡ֫") ^ i39) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i25 = ((iM11309 ^ i40) * (-12365)) ^ 695687237;
                    i26 = 1947045095;
                    i42 = iM11309 ^ i26;
                    i43 = i43;
                    subMenu5 = subMenu5;
                    i52 = i52;
                    i53 = i53;
                    i41 = i25;
                    strM3021 = strM3021;
                    i46 = i46;
                    menuItem4 = menuItem4;
                    break;
                case 566716310:
                case 2066277606:
                    strM3021 = strM3021;
                    z3 = z3 ? 1 : 0;
                    menuItem4 = menuItem4;
                    i47 = i47;
                    i51 = i51;
                    c8068 = c8068;
                    i52 = i52;
                    i53 = i53;
                    subMenu5 = subMenu5;
                    sArr5 = sArr5;
                    i54 = i54;
                    sArr6 = sArr6;
                    i56 = i56;
                    i57 = i57;
                    i43 = i43;
                    i44 = i44;
                    i55 = i55;
                    if ((i50 * i50) - ((s * 2) + 1) >= 0) {
                        iM11306 = C19806.m45029("ۨ۫") ^ i39;
                        i41 = ((iM11306 ^ i40) * 1893) ^ (-1598435931);
                        i18 = 827235058;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۢ") ^ i40;
                        i41 = ((iM11306 ^ i39) * (-11517)) ^ (-712454742);
                        i18 = 1577383840;
                    }
                    int i812 = iM11306 ^ i18;
                    i54 = i54;
                    i55 = i55;
                    sArr5 = sArr5;
                    i57 = i57;
                    i43 = i43;
                    i44 = i44;
                    strM3021 = strM3021;
                    i56 = i56;
                    sArr6 = sArr6;
                    i52 = i52;
                    i51 = i51;
                    i42 = i812;
                    i47 = i47;
                    subMenu5 = subMenu5;
                    z3 = z3;
                    activityC5760 = this;
                    i53 = i53;
                    r7 = i46;
                    c8068 = c8068;
                    i46 = r7;
                    menuItem4 = menuItem4;
                    break;
                case 708895227:
                case 1071783170:
                    if (C3535.f13026 > 0) {
                        int iM1130113 = (ThreadFactoryC3888.m11306("᩸ܰ") + i40) * (-71);
                        i42 = iM1130113 ^ (-1543218812);
                        i41 = ((iM1130113 ^ i39) * 10789) ^ (-1542051002);
                    } else {
                        strM3021 = strM3021;
                        menuItem2 = menuItem4;
                        i31 = i43;
                        c8067 = c8068;
                        i30 = i53;
                        subMenu3 = subMenu5;
                        i32 = i44;
                        iM450211 = (ThreadFactoryC3888.m11306("ۡ᩷") ^ i39) * 39;
                        i33 = ((iM450211 ^ i40) * 30393) ^ (-653779888);
                        i34 = -1018799605;
                        i42 = iM450211 ^ i34;
                        menuItem4 = menuItem2;
                        strM3021 = strM3021;
                        i27 = i31;
                        i52 = i52;
                        i41 = i33;
                        i44 = i32;
                        subMenu5 = subMenu3;
                        i53 = i30;
                        c8068 = c8067;
                        i43 = i27;
                    }
                    break;
                case 792624711:
                case 1307417141:
                    C1875.m6095(c8069, strM3021);
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    C1460.m5055(c8069, ThreadFactoryC3888.m11306(RunnableC1564.m5344(f19554, 196, 3, i45)) ^ 2121914816, new DialogInterfaceOnClickListenerC23220(activityC5760, i46));
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM450210 = C19806.m45029("᩷ᩴ") ^ i40;
                        i28 = ((iM450210 ^ i39) * (-547)) ^ 1006811110;
                        i29 = 1731186204;
                        i42 = iM450210 ^ i29;
                        i41 = i28;
                        strM3021 = strM3021;
                        menuItem4 = menuItem4;
                    } else {
                        menuItem2 = menuItem4;
                        i31 = i43;
                        c8067 = c8068;
                        i30 = i53;
                        subMenu3 = subMenu5;
                        i32 = i44;
                        iM450211 = (ThreadFactoryC3888.m11306("ۡ᩷") ^ i39) * 39;
                        i33 = ((iM450211 ^ i40) * 30393) ^ (-653779888);
                        i34 = -1018799605;
                        i42 = iM450211 ^ i34;
                        menuItem4 = menuItem2;
                        strM3021 = strM3021;
                        i27 = i31;
                        i52 = i52;
                        i41 = i33;
                        i44 = i32;
                        subMenu5 = subMenu3;
                        i53 = i30;
                        c8068 = c8067;
                        i43 = i27;
                    }
                    break;
                case 1211368371:
                case 1705915915:
                    C0050.m946();
                    if (C2788.f10625 < 0) {
                        strM3021 = strM3021;
                        menuItem4 = menuItem4;
                        iM450210 = ThreadFactoryC3888.m11306("ۜۖ") ^ i39;
                        i28 = ((iM450210 ^ i40) * 20185) ^ 1600706479;
                        i29 = -1563085961;
                        i42 = iM450210 ^ i29;
                        i41 = i28;
                        strM3021 = strM3021;
                        menuItem4 = menuItem4;
                    } else {
                        strM3021 = strM3021;
                        menuItem2 = menuItem4;
                        i31 = i43;
                        c8067 = c8068;
                        i30 = i53;
                        subMenu3 = subMenu5;
                        i32 = i44;
                        iM450211 = (ThreadFactoryC3888.m11306("ۡ᩷") ^ i39) * 39;
                        i33 = ((iM450211 ^ i40) * 30393) ^ (-653779888);
                        i34 = -1018799605;
                        i42 = iM450211 ^ i34;
                        menuItem4 = menuItem2;
                        strM3021 = strM3021;
                        i27 = i31;
                        i52 = i52;
                        i41 = i33;
                        i44 = i32;
                        subMenu5 = subMenu3;
                        i53 = i30;
                        c8068 = c8067;
                        i43 = i27;
                    }
                    break;
                default:
                    strM3021 = strM3021;
                    menuItem4 = menuItem4;
                    c8068 = c8068;
                    int i101 = i52;
                    i53 = i53;
                    subMenu5 = subMenu5;
                    int i102 = i56;
                    i43 = i43;
                    i44 = i44;
                    short[] sArr13 = sArr6;
                    int i103 = i57;
                    sArr6 = sArr13;
                    C1377.m4836(c8068, C19806.m45029(ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr13, i102, i103, i45)) ^ 2123726733);
                    if (C1066.f4915 <= 0) {
                        i52 = i101;
                        i56 = i102;
                        z3 = z3 ? 1 : 0;
                        i47 = i47;
                        i51 = i51;
                        i57 = i103;
                        int iM1130114 = ThreadFactoryC3888.m11306("ۡۤ") ^ i39;
                        i41 = ((iM1130114 ^ i40) * 5141) ^ (-365476392);
                        i47 = i47;
                        i57 = i57;
                        i43 = i43;
                        i44 = i44;
                        strM3021 = strM3021;
                        i56 = i56;
                        z3 = z3;
                        sArr6 = sArr6;
                        i52 = i52;
                        i51 = i51;
                        i42 = iM1130114 ^ 1229638;
                        subMenu5 = subMenu5;
                        activityC5760 = this;
                    } else {
                        int iM113023 = (i40 - ThreadFactoryC3888.m11306("ۤ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        int i104 = ((iM113023 ^ i39) * (-7983)) ^ 1810217287;
                        i42 = iM113023 ^ (-1268142292);
                        i57 = i103;
                        i43 = i43;
                        i44 = i44;
                        i56 = i102;
                        sArr6 = sArr6;
                        i52 = i101;
                        i41 = i104;
                        subMenu5 = subMenu5;
                        strM3021 = strM3021;
                    }
                    i53 = i53;
                    r7 = i46;
                    c8068 = c8068;
                    i46 = r7;
                    menuItem4 = menuItem4;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x030e A[PHI: r13 r17 r18 r26
      0x030e: PHI (r13v5 android.view.View) = (r13v4 android.view.View), (r13v2 android.view.View) binds: [B:58:0x030c, B:54:0x02bd] A[DONT_GENERATE, DONT_INLINE]
      0x030e: PHI (r17v3 int) = (r17v2 int), (r17v4 int) binds: [B:58:0x030c, B:54:0x02bd] A[DONT_GENERATE, DONT_INLINE]
      0x030e: PHI (r18v3 int) = (r18v2 int), (r18v4 int) binds: [B:58:0x030c, B:54:0x02bd] A[DONT_GENERATE, DONT_INLINE]
      0x030e: PHI (r26v40 android.graphics.drawable.Drawable) = (r26v39 android.graphics.drawable.Drawable), (r26v41 android.graphics.drawable.Drawable) binds: [B:58:0x030c, B:54:0x02bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x03b9 A[PHI: r26
      0x03b9: PHI (r26v58 android.graphics.drawable.Drawable) = 
      (r26v37 android.graphics.drawable.Drawable)
      (r26v43 android.graphics.drawable.Drawable)
      (r26v65 android.graphics.drawable.Drawable)
     binds: [B:66:0x03b7, B:43:0x01bf, B:11:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x046c A[PHI: r11 r26
      0x046c: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String) binds: [B:81:0x0453, B:74:0x0425] A[DONT_GENERATE, DONT_INLINE]
      0x046c: PHI (r26v34 android.graphics.drawable.Drawable) = (r26v31 android.graphics.drawable.Drawable), (r26v35 android.graphics.drawable.Drawable) binds: [B:81:0x0453, B:74:0x0425] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0579 A[PHI: r2 r7 r26 r27
      0x0579: PHI (r2v50 short[]) = (r2v2 short[]), (r2v47 short[]), (r2v2 short[]) binds: [B:97:0x0577, B:70:0x0404, B:19:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0579: PHI (r7v4 boolean) = (r7v3 boolean), (r7v2 boolean), (r7v2 boolean) binds: [B:97:0x0577, B:70:0x0404, B:19:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0579: PHI (r26v56 android.graphics.drawable.Drawable) = 
      (r26v24 android.graphics.drawable.Drawable)
      (r26v36 android.graphics.drawable.Drawable)
      (r26v57 android.graphics.drawable.Drawable)
     binds: [B:97:0x0577, B:70:0x0404, B:19:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0579: PHI (r27v34 android.view.View) = (r27v29 android.view.View), (r27v3 android.view.View), (r27v3 android.view.View) binds: [B:97:0x0577, B:70:0x0404, B:19:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
    
        if (l.C0671.m3008() >= 0) goto L14;
     */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 2160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC5760.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01d3 A[PHI: r1 r5 r7 r9 r16
      0x01d3: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v4 java.lang.String) binds: [B:55:0x01d1, B:47:0x018c, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:55:0x01d1, B:47:0x018c, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:55:0x01d1, B:47:0x018c, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r9v5 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v6 short[]) binds: [B:55:0x01d1, B:47:0x018c, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r16v20 int) = (r16v10 int), (r16v12 int), (r16v21 int) binds: [B:55:0x01d1, B:47:0x018c, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0229 A[PHI: r3 r4 r10 r16
      0x0229: PHI (r3v6 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:63:0x0227, B:59:0x0208, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r4v6 short) = (r4v2 short), (r4v3 short), (r4v2 short) binds: [B:63:0x0227, B:59:0x0208, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r10v7 int) = (r10v2 int), (r10v2 int), (r10v8 int) binds: [B:63:0x0227, B:59:0x0208, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r16v31 int) = (r16v8 int), (r16v9 int), (r16v32 int) binds: [B:63:0x0227, B:59:0x0208, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x025d A[PHI: r2 r6 r16
      0x025d: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:67:0x025b, B:51:0x01ae, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:67:0x025b, B:51:0x01ae, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r16v24 int) = (r16v7 int), (r16v11 int), (r16v25 int) binds: [B:67:0x025b, B:51:0x01ae, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15868(ActivityC5760 activityC5760) {
        int iM45029;
        int i;
        int iM11306 = 0;
        String strM1429 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -1968431888;
        int i7 = C1875.f7103;
        int i8 = C1937.f7317;
        int iM11307 = (i8 - ThreadFactoryC3888.m11306("᩹ܳ")) * (-99);
        int i9 = ((iM11307 ^ i7) * (-22643)) ^ (-1702632068);
        int i10 = 992444505;
        while (true) {
            int i11 = iM11307 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i7) * 4943) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2037935680:
                    case 1234681594:
                        iM11306 = ThreadFactoryC3888.m11306(strM1429) ^ 2123115864;
                        if (C2788.f10625 < 0) {
                            iM11307 = (C19806.m45029("ۡۜ") + i7) * 37;
                            i9 = ((iM11307 ^ i8) * (-12747)) ^ 782950733;
                            i10 = -339296161;
                        } else {
                            iM11307 = (i7 - ThreadFactoryC3888.m11306("ۡۢ")) * (-109);
                            i9 = ((iM11307 ^ i8) * 11731) ^ (-469705880);
                            i10 = 42712202;
                        }
                        break;
                    case -1796146451:
                    case 1815351355:
                        iM11306 = iM11306;
                        i2 = s * 2;
                        if (C2332.f8260) {
                            iM45029 = ThreadFactoryC3888.m11306("۟ۧ") ^ i7;
                            i9 = ((iM45029 ^ i8) * 13597) ^ (-719334786);
                            i = 2094373086;
                        } else {
                            iM45029 = (i8 - C19806.m45029("ܽ۫")) * 47;
                            i9 = ((iM45029 ^ i7) * 29645) ^ 1835287879;
                            i = 1543568728;
                        }
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -1760192293:
                    case 1149077205:
                        C17132.m40038(activityC5760.f19565);
                        sArr2 = f19554;
                        if (RunnableC0195.m1431()) {
                            int iM450210 = C19806.m45029("ᩳܺ") ^ i7;
                            iM11306 = iM11306;
                            i11 = iM450210 ^ 1914938927;
                            i9 = ((iM450210 ^ i8) * 17729) ^ 802601492;
                        } else {
                            iM11306 = iM11306;
                            iM45029 = (i8 - C19806.m45029("ܽ۫")) * 47;
                            i9 = ((iM45029 ^ i7) * 29645) ^ 1835287879;
                            i = 1543568728;
                            i11 = iM45029 ^ i;
                        }
                        iM11306 = iM11306;
                        break;
                    case -1746644837:
                    case 718026605:
                        iM11306 = iM11306;
                        i3 = i2 + 1;
                        if (C3577.f13150 >= 0) {
                            iM45029 = (i8 - C19806.m45029("֨ۚ")) * 7;
                            i9 = ((iM45029 ^ i7) * 3197) ^ 1978993662;
                            i = -434155556;
                        } else {
                            iM45029 = (C19806.m45029("۫۟") ^ i7) * 37;
                            i9 = ((iM45029 ^ i8) * 12667) ^ 2085772234;
                            i = 1304590903;
                        }
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -1726902619:
                    case 900869654:
                        i5 = 57;
                        if (!C0962.f3784) {
                            iM11307 = ThreadFactoryC3888.m11306("ܽܿ") ^ i8;
                            i9 = ((iM11307 ^ i7) * 31837) ^ (-42111248);
                            i10 = -232133246;
                        }
                        iM11306 = iM11306;
                        iM45029 = C19806.m45029("۬ܳ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 21569) ^ 2041541409;
                        i = 419572751;
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -1461740227:
                    case -1154577571:
                        C19806.m45024();
                        iM11306 = iM11306;
                        iM45029 = (i8 - C19806.m45029("֨ۚ")) * 7;
                        i9 = ((iM45029 ^ i7) * 3197) ^ 1978993662;
                        i = -434155556;
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -1360837543:
                    case 1211558328:
                        iM11306 = iM11306;
                        int i12 = s + s2;
                        if ((i12 * i12) - i3 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i8;
                            i9 = ((iM45029 ^ i7) * (-24739)) ^ (-1815877286);
                            i = -673029039;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i7) * 119;
                            i9 = ((iM45029 ^ i8) * (-5747)) ^ (-1516076604);
                            i = -1249089994;
                        }
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -1276079158:
                    case 1759379760:
                        iM11306 = iM11306;
                        s2 = 1;
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽܽ") ^ i8) * (-93);
                            i9 = ((iM45029 ^ i7) * 20087) ^ 1727973991;
                            i = -224530466;
                        } else {
                            iM45029 = (i8 - C19806.m45029("ܽ۫")) * 47;
                            i9 = ((iM45029 ^ i7) * 29645) ^ 1835287879;
                            i = 1543568728;
                        }
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -748549990:
                    case 413564499:
                        iM11306 = iM11306;
                        s = sArr[c];
                        if (C2332.f8260) {
                            iM45029 = ThreadFactoryC3888.m11306("᩸ᩳ") ^ i8;
                            i9 = ((iM45029 ^ i7) * 1633) ^ 1913277069;
                            i = -2020922451;
                        } else {
                            iM45029 = C19806.m45029("۬ܳ") ^ i8;
                            i9 = ((iM45029 ^ i7) * 21569) ^ 2041541409;
                            i = 419572751;
                        }
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -554441234:
                    case 1218371309:
                        C2871.m8646();
                        if (!C0629.m2907()) {
                            iM11307 = ThreadFactoryC3888.m11306("֨ۨ") ^ i7;
                            i9 = ((iM11307 ^ i8) * 22657) ^ 349374176;
                            i10 = 1139685584;
                        }
                        iM11306 = iM11306;
                        iM45029 = C19806.m45029("۬ܳ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 21569) ^ 2041541409;
                        i = 419572751;
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -508070031:
                    case 394761111:
                        i4 = 39239;
                        iM45029 = (C19806.m45029("ۖ۠") ^ i8) * (-57);
                        i9 = ((iM45029 ^ i7) * (-25761)) ^ (-790410230);
                        i = -964598524;
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -327598978:
                    case 59141120:
                        iM11306 = iM11306;
                        sArr = f19554;
                        if (C0797.f3386) {
                            iM45029 = (i8 - C19806.m45029("֨ۚ")) * 7;
                            i9 = ((iM45029 ^ i7) * 3197) ^ 1978993662;
                            i = -434155556;
                        } else {
                            iM45029 = C19806.m45029("ۢ᩹") ^ i8;
                            i9 = ((iM45029 ^ i7) * (-12339)) ^ 1322013610;
                            i = -299635240;
                        }
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case -222395227:
                    case 776683331:
                        if (C1875.f7103 >= 0) {
                            iM11307 = ThreadFactoryC3888.m11306("֨ۨ") ^ i7;
                            i9 = ((iM11307 ^ i8) * 22657) ^ 349374176;
                            i10 = 1139685584;
                        }
                        iM11306 = iM11306;
                        iM45029 = (i8 - C19806.m45029("֨ۚ")) * 7;
                        i9 = ((iM45029 ^ i7) * 3197) ^ 1978993662;
                        i = -434155556;
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case 94336866:
                    case 290079907:
                        iM11306 = iM11306;
                        c = '8';
                        if (C2871.f10837 >= 0) {
                            iM45029 = C19806.m45029("۬ܳ") ^ i8;
                            i9 = ((iM45029 ^ i7) * 21569) ^ 2041541409;
                            i = 419572751;
                        } else {
                            iM45029 = (C19806.m45029("ۜۢ") ^ i7) * (-83);
                            i9 = ((iM45029 ^ i8) * 30221) ^ 49849651;
                            i = 1841173141;
                        }
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    case 368142263:
                    case 495918451:
                        C1189.m4360(iM11306);
                        C0216.m1586(activityC5760);
                        break;
                    case 429227853:
                    case 1526425895:
                        strM1429 = RunnableC0195.m1429(sArr2, i5, 3, i4);
                        if (C0216.f1393 == 0) {
                            iM11307 = (i7 - ThreadFactoryC3888.m11306("᩻ۡ")) * (-109);
                            i9 = ((iM11307 ^ i8) * (-701)) ^ 820575842;
                            i10 = 1543275365;
                        } else {
                            iM11306 = iM11306;
                            iM45029 = (i8 - C19806.m45029("ܽ۫")) * 47;
                            i9 = ((iM45029 ^ i7) * 29645) ^ 1835287879;
                            i = 1543568728;
                            i11 = iM45029 ^ i;
                            iM11306 = iM11306;
                        }
                        break;
                    case 460319465:
                    case 891974082:
                        C1937.m6279();
                        if (!C1668.m5583()) {
                            iM11307 = (i7 - ThreadFactoryC3888.m11306("ۡۢ")) * (-109);
                            i9 = ((iM11307 ^ i8) * 11731) ^ (-469705880);
                            i10 = 42712202;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("֨ۨ") ^ i7;
                        i9 = ((iM11307 ^ i8) * 22657) ^ 349374176;
                        i10 = 1139685584;
                        break;
                    case 585516006:
                    case 1012851116:
                        i4 = 6552;
                        iM45029 = (C19806.m45029("ۖ۠") ^ i8) * (-57);
                        i9 = ((iM45029 ^ i7) * (-25761)) ^ (-790410230);
                        i = -964598524;
                        i11 = iM45029 ^ i;
                        iM11306 = iM11306;
                        break;
                    default:
                        C3286.m9798();
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x01bc A[PHI: r2 r3 r6 r11 r12 r13 r15 r25
      0x01bc: PHI (r2v3 android.widget.Button) = (r2v2 android.widget.Button), (r2v1 android.widget.Button), (r2v1 android.widget.Button) binds: [B:50:0x01ba, B:29:0x00de, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r3v2 android.widget.Button) = (r3v1 android.widget.Button), (r3v1 android.widget.Button), (r3v4 android.widget.Button) binds: [B:50:0x01ba, B:29:0x00de, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r6v3 android.widget.Button) = (r6v1 android.widget.Button), (r6v2 android.widget.Button), (r6v1 android.widget.Button) binds: [B:50:0x01ba, B:29:0x00de, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v5 short[]) binds: [B:50:0x01ba, B:29:0x00de, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:50:0x01ba, B:29:0x00de, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:50:0x01ba, B:29:0x00de, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r15v3 short[]) = (r15v2 short[]), (r15v1 short[]), (r15v1 short[]) binds: [B:50:0x01ba, B:29:0x00de, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r25v5 int) = (r25v4 int), (r25v3 int), (r25v3 int) binds: [B:50:0x01ba, B:29:0x00de, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02ae A[PHI: r10 r23 r24
      0x02ae: PHI (r10v46 int) = (r10v43 int), (r10v47 int) binds: [B:66:0x0297, B:55:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r23v41 android.widget.Button) = (r23v38 android.widget.Button), (r23v42 android.widget.Button) binds: [B:66:0x0297, B:55:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r24v3 l.ۨ᩹ۘ) = (r24v2 l.ۨ᩹ۘ), (r24v1 l.ۨ᩹ۘ) binds: [B:66:0x0297, B:55:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m15871() {
        int iM11306;
        int i;
        int i2;
        Button button;
        int i3;
        short s;
        int iM11307;
        int i4;
        int iM45029;
        int i5;
        int i6;
        int iM450210;
        int i7;
        int i8;
        ActivityC5760 activityC5760 = this;
        Button button2 = null;
        Button button3 = null;
        Button button4 = null;
        int i9 = 0;
        Button button5 = null;
        String strM6288 = null;
        String strM4365 = null;
        int iM11308 = 0;
        int i10 = 0;
        short[] sArr = null;
        int i11 = 1322697802;
        int i12 = RunnableC1606.f6488;
        int i13 = C3535.f13026;
        int iM11309 = (i13 - ThreadFactoryC3888.m11306("֨ۤ")) * 115;
        int i14 = ((iM11309 ^ i12) * 2573) ^ (-1944196266);
        int i15 = iM11309 ^ 1481719384;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i16 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        C11986 c11986M40033 = null;
        int i17 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * (-25297)) >> 31));
            switch (i11) {
                case -2100413099:
                case 196956501:
                    C2788.m8463(button4, i9);
                    button5 = activityC5760.f19557;
                    sArr4 = f19554;
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("ᩴۨ") ^ i12) * (-107);
                        i = ((iM11306 ^ i13) * (-8765)) ^ 951022089;
                        i2 = 107130009;
                    } else {
                        iM11306 = C19806.m45029("۫ܳ") ^ i12;
                        i = ((iM11306 ^ i13) * 22683) ^ 528091515;
                        i2 = 331231134;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1853940059:
                case -83914977:
                    C0526.m2437();
                    break;
                case -1836436924:
                case 1555691505:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("֫᩶")) * 97;
                        i = ((iM11306 ^ i12) * (-22381)) ^ (-1928920071);
                        i2 = 1200462950;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    } else {
                        button2 = button2;
                        i17 = i17;
                        iM450210 = (C19806.m45029("ܶۤ") ^ i12) * 39;
                        i7 = ((iM450210 ^ i13) * 24589) ^ 1802158811;
                        i8 = 414676255;
                        int i18 = iM450210 ^ i8;
                        i17 = i17;
                        Button button6 = button2;
                        i15 = i18;
                        i14 = i7;
                        button2 = button6;
                    }
                    break;
                case -1821962555:
                case -1000086267:
                    C1419.m4973();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = (C19806.m45029("᩷۟") ^ i12) * 93;
                        i = ((iM11306 ^ i13) * (-13187)) ^ (-1279490814);
                        i2 = 860712394;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    } else {
                        button2 = button2;
                        i17 = i17;
                        iM450210 = (C19806.m45029("ܶۤ") ^ i12) * 39;
                        i7 = ((iM450210 ^ i13) * 24589) ^ 1802158811;
                        i8 = 414676255;
                        int i19 = iM450210 ^ i8;
                        i17 = i17;
                        Button button7 = button2;
                        i15 = i19;
                        i14 = i7;
                        button2 = button7;
                    }
                    break;
                case -1610455974:
                case 1228413601:
                    button = button2;
                    s = s2;
                    i3 = i17;
                    sArr2 = f19554;
                    c = '<';
                    if (RunnableC3388.f12514 < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩻֨") ^ i12;
                        i14 = ((iM11307 ^ i13) * 24323) ^ 121099441;
                        i4 = -2004200301;
                        i6 = iM11307 ^ i4;
                        s2 = s;
                        i17 = i3;
                        button2 = button;
                        i15 = i6;
                        activityC5760 = this;
                    } else {
                        s2 = s;
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i13;
                        i14 = ((iM45029 ^ i12) * 16131) ^ (-886819109);
                        i5 = 56264019;
                        i6 = iM45029 ^ i5;
                        i17 = i3;
                        button2 = button;
                        i15 = i6;
                        activityC5760 = this;
                    }
                    break;
                case -1477299695:
                case 766817951:
                    button2 = button2;
                    i17 = i17;
                    C2788.m8463(activityC5760.f19557, -1);
                    if (c11986M40033 != null) {
                        iM450210 = ThreadFactoryC3888.m11306("֡۠") ^ i13;
                        i7 = ((iM450210 ^ i12) * 25267) ^ (-1331308721);
                        i8 = -258170717;
                    } else {
                        iM450210 = (i13 - ThreadFactoryC3888.m11306("ۡܽ")) * 11;
                        i7 = ((iM450210 ^ i12) * 3525) ^ 437842080;
                        i8 = -581755180;
                    }
                    int i110 = iM450210 ^ i8;
                    i17 = i17;
                    Button button8 = button2;
                    i15 = i110;
                    i14 = i7;
                    button2 = button8;
                    break;
                case -1098800944:
                case 1347939459:
                    strM4365 = C1189.m4365(sArr3, i16, 3, i10);
                    if (C19806.m45024()) {
                        iM11306 = (C19806.m45029("᩷۟") ^ i12) * 93;
                        i = ((iM11306 ^ i13) * (-13187)) ^ (-1279490814);
                        i2 = 860712394;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("ۜ᩹")) * 37;
                        i = ((iM11306 ^ i13) * (-4787)) ^ (-1159015085);
                        i2 = 1825492542;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1010171179:
                case 1748889480:
                    button2 = activityC5760.f19557;
                    sArr = f19554;
                    i17 = 61;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("ᩴۨ") ^ i12) * (-107);
                        i = ((iM11306 ^ i13) * (-8765)) ^ 951022089;
                        i2 = 107130009;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۜ") ^ i12) * 11;
                        i = ((iM11306 ^ i13) * 12429) ^ (-2065271185);
                        i2 = 1461491634;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -960384967:
                case 1260682322:
                    ThreadFactoryC3888.m11303(button3, C19806.m45029(strM4365) ^ 2128931218);
                    break;
                case -914322775:
                case 1734260934:
                    button = button2;
                    i3 = i17;
                    s2 = sArr2[c];
                    s3 = 31240;
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i13;
                        i14 = ((iM45029 ^ i12) * 16131) ^ (-886819109);
                        i5 = 56264019;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܳ") ^ i13;
                        i14 = ((iM45029 ^ i12) * (-28067)) ^ 299747547;
                        i5 = 1191090105;
                    }
                    i6 = iM45029 ^ i5;
                    i17 = i3;
                    button2 = button;
                    i15 = i6;
                    activityC5760 = this;
                    break;
                case -815282924:
                case 616773354:
                    RunnableC1606.m5477(activityC5760.f19557, false);
                    button4 = activityC5760.f19557;
                    i9 = -855638017;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۟") ^ i13) * 5;
                        i = ((iM11306 ^ i12) * (-15475)) ^ 1257769627;
                        i2 = 1570840394;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    } else {
                        button2 = button2;
                        i17 = i17;
                        iM450210 = (C19806.m45029("ܶۤ") ^ i12) * 39;
                        i7 = ((iM450210 ^ i13) * 24589) ^ 1802158811;
                        i8 = 414676255;
                        int i111 = iM450210 ^ i8;
                        i17 = i17;
                        Button button9 = button2;
                        i15 = i111;
                        i14 = i7;
                        button2 = button9;
                    }
                    break;
                case -542186997:
                case 320282778:
                    C19806.m45024();
                    if (C3660.f13403 < 0) {
                        button = button2;
                        i3 = i17;
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i13;
                        i14 = ((iM45029 ^ i12) * 16131) ^ (-886819109);
                        i5 = 56264019;
                        i6 = iM45029 ^ i5;
                        i17 = i3;
                        button2 = button;
                        i15 = i6;
                        activityC5760 = this;
                    } else {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("֫᩶")) * 97;
                        i = ((iM11306 ^ i12) * (-22381)) ^ (-1928920071);
                        i2 = 1200462950;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    }
                    break;
                case -452816041:
                case 1780137221:
                    button2 = button2;
                    i17 = i17;
                    if (c11986M40033.m29823() >= activityC5760.f19568.m42727()) {
                        iM450210 = (i12 - C19806.m45029("ܽ᩶")) * 23;
                        i7 = ((iM450210 ^ i13) * (-8923)) ^ 629387120;
                        i8 = 1126827773;
                    } else {
                        iM450210 = C19806.m45029("ۙܿ") ^ i12;
                        i7 = ((iM450210 ^ i13) * 31471) ^ 1178151775;
                        i8 = 299846550;
                    }
                    int i112 = iM450210 ^ i8;
                    i17 = i17;
                    Button button10 = button2;
                    i15 = i112;
                    i14 = i7;
                    button2 = button10;
                    break;
                case -440823834:
                case -430687841:
                    i10 = 55889;
                    iM450210 = C19806.m45029("۠ۤ") ^ i13;
                    i7 = ((iM450210 ^ i12) * 19069) ^ 973472418;
                    i8 = 449355684;
                    int i113 = iM450210 ^ i8;
                    i17 = i17;
                    Button button11 = button2;
                    i15 = i113;
                    i14 = i7;
                    button2 = button11;
                    break;
                case -308187889:
                case 542652019:
                    ThreadFactoryC3888.m11303(button5, 2102051364 ^ iM11308);
                    break;
                case -60218130:
                case 1332712864:
                    iM11308 = ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr4, 67, 3, i10));
                    if (C1025.f4800 < 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("ۙܺ")) * (-109);
                        i = ((iM11306 ^ i12) * (-31517)) ^ 853862298;
                        i2 = -1069370955;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    } else {
                        button2 = button2;
                        i17 = i17;
                        iM450210 = (C19806.m45029("ܶۤ") ^ i12) * 39;
                        i7 = ((iM450210 ^ i13) * 24589) ^ 1802158811;
                        i8 = 414676255;
                        int i114 = iM450210 ^ i8;
                        i17 = i17;
                        Button button12 = button2;
                        i15 = i114;
                        i14 = i7;
                        button2 = button12;
                    }
                    break;
                case -33012024:
                case 1758369848:
                    button2 = button2;
                    i17 = i17;
                    C2477.m7603(activityC5760.f19557, true);
                    if (C0797.m3359()) {
                        iM450210 = C19806.m45029("ۧۨ") ^ i13;
                        i7 = ((iM450210 ^ i12) * (-5909)) ^ 534618220;
                        i8 = -132984081;
                    } else {
                        iM450210 = (C19806.m45029("ܶۤ") ^ i12) * 39;
                        i7 = ((iM450210 ^ i13) * 24589) ^ 1802158811;
                        i8 = 414676255;
                    }
                    int i115 = iM450210 ^ i8;
                    i17 = i17;
                    Button button13 = button2;
                    i15 = i115;
                    i14 = i7;
                    button2 = button13;
                    break;
                case 201566122:
                case 1854487971:
                    i10 = 12409;
                    iM450210 = C19806.m45029("۠ۤ") ^ i13;
                    i7 = ((iM450210 ^ i12) * 19069) ^ 973472418;
                    i8 = 449355684;
                    int i116 = iM450210 ^ i8;
                    i17 = i17;
                    Button button14 = button2;
                    i15 = i116;
                    i14 = i7;
                    button2 = button14;
                    break;
                case 338145554:
                case 1962201391:
                    RunnableC1895.m6170();
                    C2642.m8171();
                    button2 = button2;
                    i17 = i17;
                    iM450210 = (C19806.m45029("ܶۤ") ^ i12) * 39;
                    i7 = ((iM450210 ^ i13) * 24589) ^ 1802158811;
                    i8 = 414676255;
                    int i117 = iM450210 ^ i8;
                    i17 = i17;
                    Button button15 = button2;
                    i15 = i117;
                    i14 = i7;
                    button2 = button15;
                    break;
                case 421416357:
                case 1413541450:
                    button = button2;
                    i3 = i17;
                    s = s2;
                    int i20 = s + 7810;
                    if ((i20 * i20) - (s2 * s3) < 0) {
                        iM11307 = (i13 - ThreadFactoryC3888.m11306("ۙۗ")) * 65;
                        i14 = ((iM11307 ^ i12) * 14933) ^ 1907017156;
                        i4 = 960404706;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֫᩵") ^ i12) * 63;
                        i14 = ((iM11307 ^ i13) * 1465) ^ 1706442416;
                        i4 = -532049816;
                    }
                    i6 = iM11307 ^ i4;
                    s2 = s;
                    i17 = i3;
                    button2 = button;
                    i15 = i6;
                    activityC5760 = this;
                    break;
                case 423276962:
                case 1931734414:
                    i17 = i17;
                    strM6288 = C1937.m6288(sArr, i17, 3, i10);
                    if (C1461.f5957 <= 0) {
                        button2 = button2;
                        iM450210 = (C19806.m45029("ܶۤ") ^ i12) * 39;
                        i7 = ((iM450210 ^ i13) * 24589) ^ 1802158811;
                        i8 = 414676255;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩻ܶ") ^ i12;
                        button2 = button2;
                        i7 = ((iM450210 ^ i13) * 25797) ^ 181623591;
                        i8 = -1349938325;
                    }
                    int i118 = iM450210 ^ i8;
                    i17 = i17;
                    Button button16 = button2;
                    i15 = i118;
                    i14 = i7;
                    button2 = button16;
                    break;
                case 1079867816:
                case 1981375939:
                    C19806.m45022(button2, ThreadFactoryC3888.m11306(strM6288) ^ 2121427593);
                    break;
                case 1160282047:
                case 2145674794:
                    button2 = button2;
                    i17 = i17;
                    c11986M40033 = C17132.m40033(activityC5760.f19565);
                    if (c11986M40033 != null) {
                        iM450210 = C19806.m45029("ۡ۠") ^ i12;
                        i7 = ((iM450210 ^ i13) * (-22511)) ^ 935873034;
                        i8 = 181770640;
                    } else {
                        iM450210 = C19806.m45029("ۙܿ") ^ i12;
                        i7 = ((iM450210 ^ i13) * 31471) ^ 1178151775;
                        i8 = 299846550;
                    }
                    int i119 = iM450210 ^ i8;
                    i17 = i17;
                    Button button17 = button2;
                    i15 = i119;
                    i14 = i7;
                    button2 = button17;
                    break;
                default:
                    button3 = activityC5760.f19557;
                    sArr3 = f19554;
                    i16 = 64;
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = (C19806.m45029("ᩴۨ") ^ i12) * (-107);
                        i = ((iM11306 ^ i13) * (-8765)) ^ 951022089;
                        i2 = 107130009;
                    } else {
                        iM11306 = C19806.m45029("֫᩸") ^ i13;
                        i = ((iM11306 ^ i12) * 14833) ^ (-991143399);
                        i2 = -513714462;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0169 A[PHI: r4 r12 r15
      0x0169: PHI (r4v5 android.graphics.drawable.Drawable) = 
      (r4v2 android.graphics.drawable.Drawable)
      (r4v3 android.graphics.drawable.Drawable)
      (r4v2 android.graphics.drawable.Drawable)
      (r4v2 android.graphics.drawable.Drawable)
     binds: [B:40:0x0167, B:28:0x00df, B:16:0x008d, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r12v5 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:40:0x0167, B:28:0x00df, B:16:0x008d, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r15v5 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:40:0x0167, B:28:0x00df, B:16:0x008d, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01d8 A[PHI: r2 r3 r5 r6 r13 r14 r26
      0x01d8: PHI (r2v4 android.view.MenuInflater) = 
      (r2v2 android.view.MenuInflater)
      (r2v3 android.view.MenuInflater)
      (r2v2 android.view.MenuInflater)
      (r2v2 android.view.MenuInflater)
     binds: [B:91:0x01d8, B:48:0x01d6, B:32:0x0109, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r3v5 android.view.MenuItem) = (r3v2 android.view.MenuItem), (r3v2 android.view.MenuItem), (r3v4 android.view.MenuItem), (r3v2 android.view.MenuItem) binds: [B:91:0x01d8, B:48:0x01d6, B:32:0x0109, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r5v4 android.graphics.drawable.Drawable) = 
      (r5v3 android.graphics.drawable.Drawable)
      (r5v2 android.graphics.drawable.Drawable)
      (r5v2 android.graphics.drawable.Drawable)
      (r5v2 android.graphics.drawable.Drawable)
     binds: [B:91:0x01d8, B:48:0x01d6, B:32:0x0109, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r6v5 android.content.res.ColorStateList) = 
      (r6v4 android.content.res.ColorStateList)
      (r6v2 android.content.res.ColorStateList)
      (r6v2 android.content.res.ColorStateList)
      (r6v2 android.content.res.ColorStateList)
     binds: [B:91:0x01d8, B:48:0x01d6, B:32:0x0109, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:91:0x01d8, B:48:0x01d6, B:32:0x0109, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:91:0x01d8, B:48:0x01d6, B:32:0x0109, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r26v8 short[]) = (r26v3 short[]), (r26v4 short[]), (r26v3 short[]), (r26v3 short[]) binds: [B:91:0x01d8, B:48:0x01d6, B:32:0x0109, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02c0 A[PHI: r1 r16 r17 r19 r21
      0x02c0: PHI (r1v48 short[]) = (r1v9 short[]), (r1v10 short[]), (r1v49 short[]) binds: [B:66:0x02be, B:60:0x026e, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:66:0x02be, B:60:0x026e, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:66:0x02be, B:60:0x026e, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:66:0x02be, B:60:0x026e, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r21v4 short) = (r21v2 short), (r21v3 short), (r21v2 short) binds: [B:66:0x02be, B:60:0x026e, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (l.C1189.m4368() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if (l.C0797.m3359() != false) goto L14;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r28) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC5760.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x025a, code lost:
    
        if (l.C0629.f2722 <= 0) goto L34;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m15856(android.widget.ImageView r85, android.widget.Button r86, android.view.ViewGroup r87) {
        /*
            Method dump skipped, instruction units count: 5000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC5760.m15856(android.widget.ImageView, android.widget.Button, android.view.ViewGroup):void");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x027d A[PHI: r20
      0x027d: PHI (r20v25 l.᩷۠ۚ) = (r20v10 l.᩷۠ۚ), (r20v28 l.᩷۠ۚ) binds: [B:55:0x022d, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0301 A[PHI: r6 r10 r11 r20
      0x0301: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v4 java.lang.String), (r6v2 java.lang.String) binds: [B:73:0x02ff, B:61:0x0263, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:73:0x02ff, B:61:0x0263, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:73:0x02ff, B:61:0x0263, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0301: PHI (r20v23 l.᩷۠ۚ) = (r20v4 l.᩷۠ۚ), (r20v9 l.᩷۠ۚ), (r20v24 l.᩷۠ۚ) binds: [B:73:0x02ff, B:61:0x0263, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x033f A[PHI: r4 r8 r13 r20 r21
      0x033f: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String) binds: [B:77:0x033d, B:43:0x01a1, B:39:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x033f: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:77:0x033d, B:43:0x01a1, B:39:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x033f: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:77:0x033d, B:43:0x01a1, B:39:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x033f: PHI (r20v14 l.᩷۠ۚ) = (r20v3 l.᩷۠ۚ), (r20v13 l.᩷۠ۚ), (r20v15 l.᩷۠ۚ) binds: [B:77:0x033d, B:43:0x01a1, B:39:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x033f: PHI (r21v5 short) = (r21v4 short), (r21v3 short), (r21v3 short) binds: [B:77:0x033d, B:43:0x01a1, B:39:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0379 A[PHI: r7 r14 r15 r16 r20
      0x0379: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:82:0x0377, B:31:0x0116, B:18:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:82:0x0377, B:31:0x0116, B:18:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:82:0x0377, B:31:0x0116, B:18:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:82:0x0377, B:31:0x0116, B:18:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0379: PHI (r20v19 l.᩷۠ۚ) = (r20v2 l.᩷۠ۚ), (r20v17 l.᩷۠ۚ), (r20v20 l.᩷۠ۚ) binds: [B:82:0x0377, B:31:0x0116, B:18:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (l.AbstractC0464.f2088 > 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m15861(l.AbstractActivityC12483 r24, l.C18419 r25, java.lang.Runnable r26) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC5760.m15861(l.۫ܶۘ, l.ᩴ֨ۘ, java.lang.Runnable):void");
    }
}
