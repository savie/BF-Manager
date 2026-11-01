package l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F2T1 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11736 extends AbstractActivityC12483 implements InterfaceC16602 {

    /* JADX INFO: renamed from: ᩳۚܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f39453 = {3713, -10532, 15873, -15804, -15905, 10629, 11445, -8845, 8504, 15430, 13060, -7789, -9618, -11917, 16133, -11735, -15248, -11871, -5233, -9132, 13361, -5789, 8269, -14206, 11976, -9027, 7745, -17118, -23271, -23643, 17294, 20278, 18157, 10528, 10543, 10533, 10547, 10542, 10536, 10533, 10607, 10536, 10543, 10549, 10532, 10543, 10549, 10607, 10528, 10530, 10549, 10536, 10542, 10543, 10607, 10519, 10504, 10500, 10518, 10533, 10532, 10551, 10532, 10541, 10542, 10545, 10532, 10547, 10513, 10541, 10548, 10534, 10536, 10543, 10504, 10533, 10546, -18324, 24543, 26309, 2329, 24435, 24402, 24385, 24402, 24411, 24408, 24391, 24402, 24389, 24436, 24402, 24409, 24387, 24402, 24389, 24438, 24404, 24387, 24414, 24385, 24414, 24387, 24398};

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f39454;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public long f39455;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C16406 f39456;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C21423 f39457;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f39458;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C6018 f39459;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f39460;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public TextView f39461;

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
        int i7 = 372052257;
        int i8 = C1460.f5948;
        int i9 = C1066.f4915;
        int iM45029 = (C19806.m45029("ܽۧ") ^ i9) * (-15);
        int i10 = ((iM45029 ^ i8) * 18425) ^ 2034388649;
        int i11 = 971984322;
        while (true) {
            i7 = ((((i7 ^ i8) * 22913) >> 31) & i10) ^ (iM45029 ^ i11);
            switch (i7) {
                case -2006322694:
                case 166755707:
                    C1460.m5050();
                    RunnableC1606.m5473();
                    return null;
                case -1910220905:
                case 47252229:
                    C0962.m3746();
                    if (C10634.f36300 < 0) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-27505)) ^ 433441263;
                        i11 = -1177903668;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("֡ۜ")) * (-51);
                        i10 = ((iM45029 ^ i9) * 5921) ^ (-1023747770);
                        i11 = -1328346754;
                    }
                    break;
                case -1692477190:
                case 1632511958:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("֫ۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-19265)) ^ (-1712211460);
                        i11 = 1974718931;
                    } else {
                        iM45029 = (C19806.m45029("᩸۬") ^ i9) * 47;
                        i10 = ((iM45029 ^ i8) * (-28195)) ^ 637484834;
                        i11 = -1396354621;
                    }
                    break;
                case -1516003425:
                case 2019254352:
                    i4 = 161900176;
                    if (RunnableC0195.m1431()) {
                        iM45029 = (C19806.m45029("ᩳ᩸") ^ i9) * 5;
                        i10 = ((iM45029 ^ i8) * (-281)) ^ 1390430836;
                        i11 = 543625721;
                    } else {
                        iM45029 = (C19806.m45029("᩸۬") ^ i9) * 47;
                        i10 = ((iM45029 ^ i8) * (-28195)) ^ 637484834;
                        i11 = -1396354621;
                    }
                    break;
                case -1433417309:
                case -55951238:
                    i2 = i * i;
                    i3 = s * s;
                    if (RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("᩸۬") ^ i9) * 47;
                        i10 = ((iM45029 ^ i8) * (-28195)) ^ 637484834;
                        i11 = -1396354621;
                    } else {
                        iM45029 = (C19806.m45029("ܽ֡") ^ i9) * (-81);
                        i10 = ((iM45029 ^ i8) * 31417) ^ 493447951;
                        i11 = -1223082202;
                    }
                    break;
                case -1288420279:
                case -295410544:
                    s = sArr[c];
                    if (C1148.f5161 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܳ") ^ i8) * 71;
                        i10 = ((iM45029 ^ i9) * (-30601)) ^ 17427610;
                        i11 = 1378357070;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 30445) ^ 1760527537;
                        i11 = 1089796265;
                    }
                    break;
                case -1209457369:
                case 269438514:
                    c = 'P';
                    if (C1398.m4895() <= 0) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-27505)) ^ 433441263;
                        i11 = -1177903668;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i8;
                        i10 = ((iM45029 ^ i9) * 7437) ^ (-1762638002);
                        i11 = 1461844756;
                    }
                    break;
                case -1074178433:
                case 1654520528:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("᩸۬") ^ i9) * 47;
                        i10 = ((iM45029 ^ i8) * (-28195)) ^ 637484834;
                        i11 = -1396354621;
                    } else {
                        iM45029 = C19806.m45029("ۧۜ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 8673) ^ 359585601;
                        i11 = -2057797963;
                    }
                    break;
                case -800100398:
                case 625478296:
                    i = s + 12724;
                    if (C2477.m7593() >= 0) {
                        iM45029 = (C19806.m45029("᩸۬") ^ i9) * 47;
                        i10 = ((iM45029 ^ i8) * (-28195)) ^ 637484834;
                        i11 = -1396354621;
                    } else {
                        iM45029 = C19806.m45029("ܶܿ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 4711) ^ 1922922254;
                        i11 = 1318693596;
                    }
                    break;
                case -596245871:
                case 1862938171:
                    C10634.m26820();
                    C3722.m10894();
                    iM45029 = (ThreadFactoryC3888.m11306("ܰܽ") + i9) * (-89);
                    i10 = ((iM45029 ^ i8) * 13225) ^ (-742370494);
                    i11 = -1464474810;
                    break;
                case -589688114:
                case 1703085277:
                    int i12 = i3 + i4;
                    if (i2 - (i12 + i12) > 0) {
                        iM45029 = (C19806.m45029("۫ܺ") ^ i8) * 7;
                        i10 = ((iM45029 ^ i9) * 237) ^ (-843567703);
                        i11 = 983091333;
                    } else {
                        iM45029 = C19806.m45029("᩺֨") ^ i8;
                        i10 = ((iM45029 ^ i9) * 2655) ^ (-1712680581);
                        i11 = -1467907564;
                    }
                    break;
                case -327687347:
                case 805348902:
                    sArr = f39453;
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-27505)) ^ 433441263;
                        i11 = -1177903668;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۤۨ")) * (-39);
                        i10 = ((iM45029 ^ i8) * 24247) ^ 1301228817;
                        i11 = -63182903;
                    }
                    break;
                case -204967002:
                case 1743261934:
                    return C1025.m3859(sArr2, i6, 23, i5);
                case -8450308:
                case 270359271:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-27505)) ^ 433441263;
                        i11 = -1177903668;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰܽ") + i9) * (-89);
                        i10 = ((iM45029 ^ i8) * 13225) ^ (-742370494);
                        i11 = -1464474810;
                    }
                    break;
                case 100966442:
                case 1231049262:
                    i5 = 64079;
                    iM45029 = (ThreadFactoryC3888.m11306("ۢ᩻") ^ i9) * (-77);
                    i10 = ((iM45029 ^ i8) * (-24479)) ^ (-1160161283);
                    i11 = 659387677;
                    break;
                case 810631286:
                case 1098207208:
                    sArr2 = f39453;
                    i6 = 81;
                    if (C2332.f8260) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("᩹ۧ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i10 = ((iM45029 ^ i9) * (-28563)) ^ (-307045786);
                        i11 = 1530459302;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܳ") ^ i8) * 71;
                        i10 = ((iM45029 ^ i9) * (-30601)) ^ 17427610;
                        i11 = 1378357070;
                    }
                    break;
                case 1064596641:
                case 1605336118:
                    C1377.m4833();
                    if (C1668.f6641 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܳ") ^ i8) * 71;
                        i10 = ((iM45029 ^ i9) * (-30601)) ^ 17427610;
                        i11 = 1378357070;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰܽ") + i9) * (-89);
                        i10 = ((iM45029 ^ i8) * 13225) ^ (-742370494);
                        i11 = -1464474810;
                    }
                    break;
                case 1284783564:
                case 1756144957:
                    i5 = 24375;
                    iM45029 = (ThreadFactoryC3888.m11306("ۢ᩻") ^ i9) * (-77);
                    i10 = ((iM45029 ^ i8) * (-24479)) ^ (-1160161283);
                    i11 = 659387677;
                    break;
                default:
                    if (C1148.m4232() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܳ") ^ i8) * 71;
                        i10 = ((iM45029 ^ i9) * (-30601)) ^ 17427610;
                        i11 = 1378357070;
                    } else {
                        iM45029 = (i8 - C19806.m45029("ܺۢ")) * 109;
                        i10 = ((iM45029 ^ i9) * 14403) ^ (-1372440537);
                        i11 = 2141808486;
                    }
                    break;
            }
        }
    }

    public ActivityC11736() {
        ArrayList arrayList = null;
        int i = 821170669;
        int i2 = C0278.f1572;
        int i3 = RunnableC0195.f1321;
        int iM11306 = (ThreadFactoryC3888.m11306("۟ۧ") ^ i3) * (-63);
        int i4 = ((iM11306 ^ i2) * 10301) ^ (-949275775);
        int i5 = 1333184056;
        while (true) {
            i = ((((i ^ i2) * (-18845)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2044597112:
                case 1553499520:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("۟ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5335) ^ 341094040;
                        i5 = -1489563303;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10681) ^ 923638808;
                        i5 = 293725000;
                    }
                    break;
                case -1825935217:
                case -908691985:
                    C7105.m18985();
                    if (!CallableC1627.f6528) {
                        iM11306 = C19806.m45029("᩵֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25097)) ^ 1061777153;
                        i5 = -769026296;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9027) ^ (-1759501258);
                        i5 = -1347126054;
                    }
                    break;
                case -1573463424:
                case 1491066796:
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9027) ^ (-1759501258);
                        i5 = -1347126054;
                    } else {
                        iM11306 = (C19806.m45029("ۘ᩵") + i2) * 19;
                        i4 = ((iM11306 ^ i3) * 19005) ^ 1290121705;
                        i5 = -2031797583;
                    }
                    break;
                case -1459368707:
                case -896409481:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (C19806.m45029("᩺ۡ") + i2) * 109;
                        i4 = ((iM11306 ^ i3) * 27295) ^ (-1575194853);
                        i5 = 505849977;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1631)) ^ (-36877794);
                        i5 = 1269400267;
                    }
                    break;
                case -1358296517:
                case 765368254:
                    if (C2332.m7079() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9027) ^ (-1759501258);
                        i5 = -1347126054;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧۖ")) * 33;
                        i4 = ((iM11306 ^ i2) * 21247) ^ 1414206480;
                        i5 = 503630617;
                    }
                    break;
                case -1303084044:
                case 1073816495:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("۟ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5335) ^ 341094040;
                        i5 = -1489563303;
                    } else {
                        iM11306 = C19806.m45029("ܰۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 16003) ^ 1764798974;
                        i5 = 470630376;
                    }
                    break;
                case -1296022152:
                case 768597597:
                    C0629.m2907();
                    if (C0216.m1591() <= 0) {
                        iM11306 = (C19806.m45029("֡ܽ") + i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-26685)) ^ (-992697534);
                        i5 = 2016196151;
                    } else {
                        iM11306 = C19806.m45029("᩵֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25097)) ^ 1061777153;
                        i5 = -769026296;
                    }
                    break;
                case -1131751571:
                case 24828215:
                    if (C1398.m4895() <= 0) {
                        iM11306 = (C19806.m45029("֡ܽ") + i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-26685)) ^ (-992697534);
                        i5 = 2016196151;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩶ۧ")) * (-17);
                        i4 = ((iM11306 ^ i3) * 29701) ^ (-1122950504);
                        i5 = -1538933167;
                    }
                    break;
                case -1081902614:
                case -815944285:
                    C1025.m3861();
                    C2249.m6915();
                    iM11306 = C19806.m45029("۟ۛ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 5335) ^ 341094040;
                    i5 = -1489563303;
                    break;
                case -1071676050:
                case -504932157:
                    arrayList = new ArrayList();
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("᩷ۨ") + i2) * (-113);
                        i4 = ((iM11306 ^ i3) * (-25445)) ^ (-2033295614);
                        i5 = -1822437755;
                    } else {
                        iM11306 = C19806.m45029("۟ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5335) ^ 341094040;
                        i5 = -1489563303;
                    }
                    break;
                case -933612906:
                case 1851104845:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("᩺ۡ") + i2) * 109;
                        i4 = ((iM11306 ^ i3) * 27295) ^ (-1575194853);
                        i5 = 505849977;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17667)) ^ (-691039434);
                        i5 = -11684751;
                    }
                    break;
                case -739109226:
                case 81927382:
                    C1461.m5080();
                    throw new RuntimeException();
                case -394301538:
                case 1675709170:
                    this.f39458 = arrayList;
                    return;
                case 7397661:
                case 1465653904:
                    if (C1148.m4232() <= 0) {
                        iM11306 = C19806.m45029("۟ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5335) ^ 341094040;
                        i5 = -1489563303;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܳܳ")) * (-107);
                        i4 = ((iM11306 ^ i2) * (-19197)) ^ (-1360674645);
                        i5 = -1830356067;
                    }
                    break;
                case 96027713:
                case 387534578:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("֡ܽ") + i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-26685)) ^ (-992697534);
                        i5 = 2016196151;
                    } else {
                        iM11306 = C19806.m45029("ۢܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5947)) ^ 2065919244;
                        i5 = 1168638047;
                    }
                    break;
                default:
                    AbstractC0464.m2313();
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("᩵֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25097)) ^ 1061777153;
                        i5 = -769026296;
                    } else {
                        iM11306 = C19806.m45029("۟ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5335) ^ 341094040;
                        i5 = -1489563303;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        int i = 229748642;
        int i2 = RunnableC3388.f12514;
        int i3 = C1189.f5284;
        int iM45029 = (C19806.m45029("ۜܰ") + i3) * (-115);
        int i4 = ((iM45029 ^ i2) * 8953) ^ 1831067701;
        int i5 = 1060062256;
        while (true) {
            i = ((((i ^ i2) * (-22109)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2070792586:
                case -637217955:
                    C1461.m5080();
                    if (C10634.f36300 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۖ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 27083) ^ (-343596540);
                        i5 = -2140661000;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22253)) ^ (-864989148);
                        i5 = -954276860;
                    }
                    break;
                case -1854322543:
                case 1805155189:
                    break;
                case -1816285862:
                case 203229223:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22253)) ^ (-864989148);
                        i5 = -954276860;
                    } else {
                        iM45029 = C19806.m45029("۠᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6469)) ^ (-2030251243);
                        i5 = -615138946;
                    }
                    break;
                case -1705581911:
                case -239307144:
                    if (C7105.f23796 < 0) {
                        iM45029 = C19806.m45029("᩻ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16373)) ^ (-81709132);
                        i5 = 2063830617;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۖ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 27083) ^ (-343596540);
                        i5 = -2140661000;
                    }
                    break;
                case -1629071769:
                case -1302065952:
                    if (RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("֨۫") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 30641) ^ 1496267020;
                        i5 = 347970811;
                    } else {
                        iM45029 = C19806.m45029("۟۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9445)) ^ 1461201673;
                        i5 = 1701823355;
                    }
                    break;
                case -1532190923:
                case -790237006:
                    if (C3722.m10894() <= 0) {
                        iM45029 = (C19806.m45029("֨۫") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 30641) ^ 1496267020;
                        i5 = 347970811;
                    } else {
                        iM45029 = (C19806.m45029("ۙ᩻") ^ i3) * (-41);
                        i4 = ((iM45029 ^ i2) * 19653) ^ 843139601;
                        i5 = 1988274605;
                    }
                    break;
                case -1424757548:
                case -855603562:
                    if (C2249.m6915() <= 0) {
                        iM45029 = (C19806.m45029("֨۫") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 30641) ^ 1496267020;
                        i5 = 347970811;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21451) ^ (-7352367);
                        i5 = -291490150;
                    }
                    break;
                case -1325867023:
                case 728788810:
                    super.onResume();
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22253)) ^ (-864989148);
                        i5 = -954276860;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘܿ")) * 63;
                        i4 = ((iM45029 ^ i2) * (-25)) ^ (-33418924);
                        i5 = 1488774668;
                    }
                    break;
                case -968826501:
                case 401781477:
                    if (f39454) {
                        iM45029 = C19806.m45029("ܿ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5427) ^ 1480472942;
                        i5 = 1283447542;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۧ۠")) * 29;
                        i4 = ((iM45029 ^ i3) * (-17041)) ^ (-624735819);
                        i5 = -1919277701;
                    }
                    break;
                case -742618639:
                case -108186182:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("᩻ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16373)) ^ (-81709132);
                        i5 = 2063830617;
                    } else {
                        iM45029 = (C19806.m45029("ܰ᩸") + i2) * (-97);
                        i4 = ((iM45029 ^ i3) * 12401) ^ 316528744;
                        i5 = 274687346;
                    }
                    break;
                case -425840247:
                case 266346718:
                    C0629.m2907();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-22253)) ^ (-864989148);
                    i5 = -954276860;
                    break;
                case -26078837:
                case 1999913851:
                    if (C1461.m5080()) {
                        iM45029 = (C19806.m45029("֨۫") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 30641) ^ 1496267020;
                        i5 = 347970811;
                    } else {
                        iM45029 = C19806.m45029("ۜۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19751) ^ 1474959118;
                        i5 = 1480641466;
                    }
                    break;
                case 189140911:
                case 277785400:
                    if (C1377.m4833() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 501) ^ 246440546;
                        i5 = 1141178089;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۖ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 27083) ^ (-343596540);
                        i5 = -2140661000;
                    }
                    break;
                case 540491197:
                case 1010403146:
                    mo2119();
                    iM45029 = (i2 - C19806.m45029("ۧ۠")) * 29;
                    i4 = ((iM45029 ^ i3) * (-17041)) ^ (-624735819);
                    i5 = -1919277701;
                    break;
                case 649942739:
                case 1495191378:
                    C2477.m7593();
                    break;
                case 823826219:
                case 1136736939:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("᩻᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22505) ^ 624731994;
                        i5 = 1323716182;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۖ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 27083) ^ (-343596540);
                        i5 = -2140661000;
                    }
                    break;
                case 1329551483:
                case 1916718264:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 501) ^ 246440546;
                        i5 = 1141178089;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23679)) ^ 1225523776;
                        i5 = 230581974;
                    }
                    break;
                default:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 501) ^ 246440546;
                        i5 = 1141178089;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۙ֨")) * 17;
                        i4 = ((iM45029 ^ i2) * 5117) ^ 1955221657;
                        i5 = 60270361;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM11306;
        int i;
        int i2;
        short[] sArr;
        int i3;
        C6938 c6938;
        short[] sArr2;
        short[] sArr3;
        short[] sArr4;
        int iM45029;
        int i4;
        int iM11307;
        int i5;
        int i6;
        int iM450210;
        int i7;
        int i8;
        int i9;
        short[] sArr5;
        int iM11308;
        int i10;
        int i11;
        final ActivityC11736 activityC11736 = this;
        View.OnClickListener onClickListener = null;
        View viewM7083 = null;
        View viewM1436 = null;
        ViewGroup viewGroup = null;
        int i12 = 0;
        int iM450211 = 0;
        int i13 = 0;
        int i14 = 0;
        short[] sArr6 = null;
        int i15 = 0;
        int i16 = -945790397;
        int i17 = C0629.f2722;
        int i18 = C3660.f13403;
        int iM11309 = (ThreadFactoryC3888.m11306("ۤۙ") ^ i17) * 5;
        int i19 = ((iM11309 ^ i18) * 11817) ^ (-722105566);
        int i20 = iM11309 ^ 77304929;
        C6938 c6939 = null;
        String strM10056 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int iM450212 = 0;
        int i25 = 0;
        int iM113010 = 0;
        View viewM7084 = null;
        short s = 0;
        AbstractC10697 abstractC10697M25489 = null;
        C6938 c69310 = null;
        short[] sArr10 = null;
        int i26 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i18) * (-2537)) >> 31));
            switch (i16) {
                case -2142756509:
                case 1352051740:
                    i15 = i15;
                    c69310 = c69310;
                    sArr10 = sArr10;
                    sArr6 = sArr6;
                    i26 = i26;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    C2332.m7083(activityC11736, ThreadFactoryC3888.m11306(strM10056) ^ 2126254939);
                    sArr7 = f39453;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        int iM113011 = (i18 - ThreadFactoryC3888.m11306("ᩴۧ")) * 3;
                        i19 = ((iM113011 ^ i17) * (-10375)) ^ (-1919245642);
                        i20 = iM113011 ^ 1568353363;
                        activityC11736 = this;
                    } else {
                        int iM113012 = (ThreadFactoryC3888.m11306("ۖܺ") + i18) * 37;
                        i20 = iM113012 ^ 505131238;
                        i19 = ((iM113012 ^ i17) * (-21427)) ^ (-2018990500);
                    }
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    c69310 = c69310;
                    i26 = i26;
                    sArr6 = sArr6;
                    i15 = i15;
                    break;
                case -2081245219:
                case 1352123895:
                    viewM7083 = C2332.m7083(activityC11736, ThreadFactoryC3888.m11306(C0797.m3361(sArr10, i22, i23, i21)) ^ 2123496500);
                    iM11306 = C19806.m45029("ۨ֨") ^ i17;
                    i = ((iM11306 ^ i18) * 15569) ^ 1431455311;
                    i2 = 1875317540;
                    i20 = iM11306 ^ i2;
                    i19 = i;
                    break;
                case -2046154111:
                case -1703174493:
                    C1189.m4368();
                    C1148.m4232();
                    break;
                case -1905886824:
                case 2091391008:
                    activityC11736.f39457 = (C21423) viewM7083;
                    sArr9 = f39453;
                    i24 = 16;
                    if (!C2332.f8260) {
                        c6938 = c69310;
                        sArr2 = sArr10;
                        short[] sArr11 = sArr8;
                        sArr4 = sArr9;
                        i9 = i26;
                        sArr5 = sArr11;
                        iM11308 = (ThreadFactoryC3888.m11306("ۜۖ") ^ i18) * (-57);
                        i10 = ((iM11308 ^ i17) * (-11825)) ^ 48227172;
                        i11 = 2110790856;
                        i20 = iM11308 ^ i11;
                        i19 = i10;
                        sArr10 = sArr2;
                        c69310 = c6938;
                        short[] sArr12 = sArr5;
                        i26 = i9;
                        sArr9 = sArr4;
                        sArr8 = sArr12;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۢ") ^ i18) * (-55);
                        i = ((iM11306 ^ i17) * 32297) ^ 683445057;
                        i2 = -1851908037;
                        i20 = iM11306 ^ i2;
                        i19 = i;
                    }
                    break;
                case -1796008826:
                case 1205491079:
                    C0278.m1789();
                    i15 = i15;
                    c69310 = c69310;
                    sArr10 = sArr10;
                    sArr6 = sArr6;
                    i26 = i26;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    int iM113013 = (i18 - ThreadFactoryC3888.m11306("ᩴۧ")) * 3;
                    i19 = ((iM113013 ^ i17) * (-10375)) ^ (-1919245642);
                    i20 = iM113013 ^ 1568353363;
                    activityC11736 = this;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    c69310 = c69310;
                    i26 = i26;
                    sArr6 = sArr6;
                    i15 = i15;
                    break;
                case -1774344195:
                case 1481657829:
                    if (!RunnableC0195.m1431()) {
                        c69310 = c69310;
                        sArr6 = sArr6;
                        i26 = i26;
                        sArr8 = sArr8;
                        sArr9 = sArr9;
                        sArr7 = sArr7;
                        int iM450213 = (C19806.m45029("ۜۚ") ^ i17) * (-85);
                        i19 = ((iM450213 ^ i18) * 11433) ^ (-368193887);
                        i20 = iM450213 ^ 2088295685;
                        activityC11736 = this;
                        sArr7 = sArr7;
                        c69310 = c69310;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                        i26 = i26;
                        sArr6 = sArr6;
                        i15 = i15;
                    }
                    i15 = i15;
                    c69310 = c69310;
                    sArr10 = sArr10;
                    sArr6 = sArr6;
                    i26 = i26;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    int iM113014 = (i18 - ThreadFactoryC3888.m11306("ᩴۧ")) * 3;
                    i19 = ((iM113014 ^ i17) * (-10375)) ^ (-1919245642);
                    i20 = iM113014 ^ 1568353363;
                    activityC11736 = this;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    c69310 = c69310;
                    i26 = i26;
                    sArr6 = sArr6;
                    i15 = i15;
                    break;
                case -1611408379:
                case 1358452065:
                    c69310 = c69310;
                    C0526.m2430(c69310, onClickListener);
                    sArr10 = f39453;
                    i23 = 3;
                    if (C2871.f10837 >= 0) {
                        i22 = 13;
                        sArr6 = sArr6;
                        i26 = i26;
                        sArr8 = sArr8;
                        sArr9 = sArr9;
                        sArr7 = sArr7;
                        int iM450214 = (C19806.m45029("ۜۚ") ^ i17) * (-85);
                        i19 = ((iM450214 ^ i18) * 11433) ^ (-368193887);
                        i20 = iM450214 ^ 2088295685;
                        activityC11736 = this;
                        sArr7 = sArr7;
                        c69310 = c69310;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                        i26 = i26;
                        sArr6 = sArr6;
                        i15 = i15;
                    } else {
                        int iM113015 = (i18 - ThreadFactoryC3888.m11306("۟᩹")) * 57;
                        i20 = iM113015 ^ (-1794650058);
                        c69310 = c69310;
                        i19 = ((iM113015 ^ i17) * (-1839)) ^ 1539490623;
                        i22 = 13;
                    }
                    break;
                case -1544117711:
                case -1419906184:
                    C3286.m9791(activityC11736.f41645, C2190.m6805());
                    iM11306 = ThreadFactoryC3888.m11306("ۨᩴ") ^ i18;
                    i = ((iM11306 ^ i17) * 2611) ^ (-739424655);
                    i2 = -228030746;
                    i20 = iM11306 ^ i2;
                    i19 = i;
                    break;
                case -1458715820:
                case 12539590:
                    c6938 = c69310;
                    sArr2 = sArr10;
                    short[] sArr13 = sArr8;
                    sArr4 = sArr9;
                    i9 = i26;
                    iM113010 = ThreadFactoryC3888.m11306(C1937.m6288(sArr13, i9, 3, i21));
                    if (RunnableC1606.f6488 < 0) {
                        iM11308 = C19806.m45029("ܳۙ") ^ i17;
                        sArr5 = sArr13;
                        i10 = ((iM11308 ^ i18) * (-22019)) ^ 706462166;
                        i11 = -75469287;
                        i20 = iM11308 ^ i11;
                        i19 = i10;
                        sArr10 = sArr2;
                        c69310 = c6938;
                        short[] sArr14 = sArr5;
                        i26 = i9;
                        sArr9 = sArr4;
                        sArr8 = sArr14;
                    } else {
                        sArr3 = sArr13;
                        sArr = sArr6;
                        i3 = i9;
                        iM450210 = (C19806.m45029("ۢ۠") ^ i18) * (-15);
                        i7 = ((iM450210 ^ i17) * 30379) ^ 803191099;
                        i8 = -1971158448;
                        i20 = iM450210 ^ i8;
                        sArr10 = sArr2;
                        c69310 = c6938;
                        int i27 = i3;
                        sArr6 = sArr;
                        i19 = i7;
                        sArr9 = sArr4;
                        sArr8 = sArr3;
                        i26 = i27;
                    }
                    break;
                case -1317126575:
                case -1267423690:
                    i15 = i15;
                    c69310 = c69310;
                    sArr10 = sArr10;
                    sArr6 = sArr6;
                    i26 = i26;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    sArr7 = sArr7;
                    super.onCreate(bundle);
                    m31023();
                    strM10056 = RunnableC3388.m10056(f39453, 1, 3, i21);
                    if (C1189.m4368() > 0) {
                        iM45029 = C19806.m45029("᩷᩵") ^ i17;
                        i19 = ((iM45029 ^ i18) * 8643) ^ (-337857356);
                        i4 = 1140470278;
                        i20 = iM45029 ^ i4;
                        activityC11736 = this;
                        sArr7 = sArr7;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                        sArr10 = sArr10;
                        c69310 = c69310;
                        i26 = i26;
                        sArr6 = sArr6;
                        i15 = i15;
                    } else {
                        sArr7 = sArr7;
                        int iM113016 = (i18 - ThreadFactoryC3888.m11306("ᩴۧ")) * 3;
                        i19 = ((iM113016 ^ i17) * (-10375)) ^ (-1919245642);
                        i20 = iM113016 ^ 1568353363;
                        activityC11736 = this;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                        sArr10 = sArr10;
                        c69310 = c69310;
                        i26 = i26;
                        sArr6 = sArr6;
                        i15 = i15;
                    }
                    break;
                case -1308054138:
                case 522741556:
                    C6018 c6018 = (C6018) C2332.m7083(activityC11736, iM450211 ^ i13);
                    activityC11736.f39459 = c6018;
                    c6018.m16334(activityC11736);
                    mo2119();
                    break;
                case -1283703261:
                case 1341493570:
                    i15 = i15;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    short s2 = s;
                    if ((s2 * 31332) - (i14 + 245423556) > 0) {
                        iM11307 = C19806.m45029("֫۬") ^ i18;
                        i5 = ((iM11307 ^ i17) * 21305) ^ (-1920728985);
                        i6 = -1693702176;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩹᩸") ^ i18;
                        i5 = ((iM11307 ^ i17) * 23837) ^ 1223410530;
                        i6 = 1705203868;
                    }
                    i20 = iM11307 ^ i6;
                    activityC11736 = this;
                    s = s2;
                    i19 = i5;
                    sArr7 = sArr7;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    c69310 = c69310;
                    i26 = i26;
                    sArr6 = sArr6;
                    i15 = i15;
                    break;
                case -1203988205:
                case 211988482:
                    i21 = 54248;
                    iM45029 = ThreadFactoryC3888.m11306("ۙ۟") ^ i17;
                    i19 = ((iM45029 ^ i18) * 12757) ^ 1760284818;
                    i4 = -1491358252;
                    i20 = iM45029 ^ i4;
                    activityC11736 = this;
                    sArr7 = sArr7;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    c69310 = c69310;
                    i26 = i26;
                    sArr6 = sArr6;
                    i15 = i15;
                    break;
                case -1187009677:
                case 1716161533:
                    activityC11736.f39461 = (TextView) C3577.m10566(viewGroup, i12);
                    C21423 c21423 = activityC11736.f39457;
                    C16406 c16406 = new C16406(activityC11736);
                    activityC11736.f39456 = c16406;
                    C2124.m6688(c21423, c16406);
                    if (C2190.m6804()) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۢ") ^ i17;
                        i = ((iM11306 ^ i18) * (-15785)) ^ 1180034915;
                        i2 = -1332099180;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨᩴ") ^ i18;
                        i = ((iM11306 ^ i17) * 2611) ^ (-739424655);
                        i2 = -228030746;
                    }
                    i20 = iM11306 ^ i2;
                    i19 = i;
                    break;
                case -960731264:
                case 234042345:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C3535.m10431() > 0) {
                        c6938 = c69310;
                        sArr2 = sArr10;
                        short[] sArr15 = sArr8;
                        sArr4 = sArr9;
                        i9 = i26;
                        sArr5 = sArr15;
                        iM11308 = (ThreadFactoryC3888.m11306("ۜۖ") ^ i18) * (-57);
                        i10 = ((iM11308 ^ i17) * (-11825)) ^ 48227172;
                        i11 = 2110790856;
                        i20 = iM11308 ^ i11;
                        i19 = i10;
                        sArr10 = sArr2;
                        c69310 = c6938;
                        short[] sArr16 = sArr5;
                        i26 = i9;
                        sArr9 = sArr4;
                        sArr8 = sArr16;
                    } else {
                        i15 = i15;
                        c69310 = c69310;
                        sArr10 = sArr10;
                        sArr6 = sArr6;
                        i26 = i26;
                        sArr8 = sArr8;
                        sArr9 = sArr9;
                        int iM113017 = (i18 - ThreadFactoryC3888.m11306("ᩴۧ")) * 3;
                        i19 = ((iM113017 ^ i17) * (-10375)) ^ (-1919245642);
                        i20 = iM113017 ^ 1568353363;
                        activityC11736 = this;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                        sArr10 = sArr10;
                        c69310 = c69310;
                        i26 = i26;
                        sArr6 = sArr6;
                        i15 = i15;
                    }
                    break;
                case -707850209:
                case -262552005:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11306 = (i17 - C19806.m45029("᩷ۙ")) * (-107);
                        i = ((iM11306 ^ i18) * (-13539)) ^ 2040856588;
                        i2 = -328289981;
                        i20 = iM11306 ^ i2;
                        i19 = i;
                    } else {
                        c6938 = c69310;
                        sArr2 = sArr10;
                        short[] sArr17 = sArr8;
                        sArr4 = sArr9;
                        i9 = i26;
                        sArr5 = sArr17;
                        iM11308 = (ThreadFactoryC3888.m11306("ۜۖ") ^ i18) * (-57);
                        i10 = ((iM11308 ^ i17) * (-11825)) ^ 48227172;
                        i11 = 2110790856;
                        i20 = iM11308 ^ i11;
                        i19 = i10;
                        sArr10 = sArr2;
                        c69310 = c6938;
                        short[] sArr18 = sArr5;
                        i26 = i9;
                        sArr9 = sArr4;
                        sArr8 = sArr18;
                    }
                    break;
                case -671438192:
                case 1706076948:
                    i15 = i15;
                    c69310 = c69310;
                    sArr10 = sArr10;
                    sArr6 = sArr6;
                    i26 = i26;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    sArr7 = sArr7;
                    s = f39453[0];
                    i14 = s * s;
                    if (!C3743.f13569) {
                        sArr10 = sArr10;
                        int iM450215 = (C19806.m45029("ۜۚ") ^ i17) * (-85);
                        i19 = ((iM450215 ^ i18) * 11433) ^ (-368193887);
                        i20 = iM450215 ^ 2088295685;
                        activityC11736 = this;
                        sArr7 = sArr7;
                        c69310 = c69310;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                        i26 = i26;
                        sArr6 = sArr6;
                        i15 = i15;
                    } else {
                        iM45029 = (C19806.m45029("᩵֨") ^ i17) * (-89);
                        i19 = ((iM45029 ^ i18) * (-28773)) ^ 507197591;
                        i4 = 1893164611;
                        i20 = iM45029 ^ i4;
                        activityC11736 = this;
                        sArr7 = sArr7;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                        sArr10 = sArr10;
                        c69310 = c69310;
                        i26 = i26;
                        sArr6 = sArr6;
                        i15 = i15;
                    }
                    break;
                case -662348376:
                case 697699211:
                    C6938 c69311 = c69310;
                    short[] sArr19 = sArr10;
                    short[] sArr20 = sArr8;
                    short[] sArr21 = sArr9;
                    short[] sArr22 = sArr6;
                    int i28 = i15;
                    viewM7084 = C2332.m7083(activityC11736, ThreadFactoryC3888.m11306(ThreadFactoryC3888.m11312(sArr22, i28, 3, i21)) ^ 2122661622);
                    int iM450216 = (C19806.m45029("᩻֨") + i18) * (-125);
                    i20 = iM450216 ^ (-1174080492);
                    i19 = ((iM450216 ^ i17) * (-5207)) ^ 2111485719;
                    sArr10 = sArr19;
                    c69310 = c69311;
                    i15 = i28;
                    sArr9 = sArr21;
                    sArr8 = sArr20;
                    i26 = i26;
                    sArr6 = sArr22;
                    break;
                case -565395712:
                case 1721845070:
                    viewGroup = (ViewGroup) viewM1436;
                    activityC11736.f39457.m47989((View) viewGroup);
                    i12 = 0;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֨") ^ i18;
                        i = ((iM11306 ^ i17) * 18501) ^ (-1015964597);
                        i2 = -236686920;
                        i20 = iM11306 ^ i2;
                        i19 = i;
                    } else {
                        sArr = sArr6;
                        i3 = i26;
                        c6938 = c69310;
                        sArr2 = sArr10;
                        sArr3 = sArr8;
                        sArr4 = sArr9;
                        iM450210 = (C19806.m45029("ۢ۠") ^ i18) * (-15);
                        i7 = ((iM450210 ^ i17) * 30379) ^ 803191099;
                        i8 = -1971158448;
                        i20 = iM450210 ^ i8;
                        sArr10 = sArr2;
                        c69310 = c6938;
                        int i29 = i3;
                        sArr6 = sArr;
                        i19 = i7;
                        sArr9 = sArr4;
                        sArr8 = sArr3;
                        i26 = i29;
                    }
                    break;
                case -386967333:
                case 1361312368:
                    C6938 c69312 = c6939;
                    c69312.setNavigationIcon(iM113010 ^ 2099102157);
                    C6938 c69313 = activityC11736.f41645;
                    onClickListener = new View.OnClickListener() { // from class: l.᩸ۙۘ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i30 = -1058601229;
                            int i31 = C1937.f7317;
                            int i32 = C3577.f13150;
                            int iM450217 = (C19806.m45029("ᩴ֡") + i32) * 73;
                            int i33 = ((iM450217 ^ i31) * 5733) ^ (-1148252542);
                            int i34 = 1958469969;
                            while (true) {
                                i30 = ((((i30 ^ i31) * 4613) >> 31) & i33) ^ (iM450217 ^ i34);
                                switch (i30) {
                                    case -2097552678:
                                    case -1495195422:
                                        C0817.m3399();
                                        if (!RunnableC1564.f6300) {
                                            iM450217 = (i31 - C19806.m45029("۫ۗ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM450217 ^ i32) * 10047) ^ (-455816490);
                                            i34 = -297554438;
                                        } else {
                                            iM450217 = C19806.m45029("ܽ۫") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-26641)) ^ (-569696776);
                                            i34 = 236866005;
                                        }
                                        break;
                                    case -1894971950:
                                    case 1372110161:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450217 = C19806.m45029("᩶᩸") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-28339)) ^ 1486008052;
                                            i34 = 406318667;
                                        } else {
                                            iM450217 = C19806.m45029("۬ۙ") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-27609)) ^ (-1462020862);
                                            i34 = -1042283419;
                                        }
                                        break;
                                    case -1798050616:
                                    case 1880840608:
                                        RunnableC3388.m10064();
                                        C1025.m3861();
                                        iM450217 = (i31 - C19806.m45029("ۜ᩸")) * 25;
                                        i33 = ((iM450217 ^ i32) * 17295) ^ 102609571;
                                        i34 = 519862245;
                                        break;
                                    case -1569680237:
                                    case -50378104:
                                        if (C2704.f10408) {
                                            iM450217 = C19806.m45029("᩷ۗ") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-1903)) ^ 138709644;
                                            i34 = 1659320756;
                                        } else {
                                            iM450217 = (i31 - C19806.m45029("ۜ᩸")) * 25;
                                            i33 = ((iM450217 ^ i32) * 17295) ^ 102609571;
                                            i34 = 519862245;
                                        }
                                        break;
                                    case -1329629382:
                                    case 1352156425:
                                        if (AbstractC0464.m2313() != 0) {
                                            iM450217 = (i32 - ThreadFactoryC3888.m11306("۬֨")) * 23;
                                            i33 = ((iM450217 ^ i31) * (-14949)) ^ (-1644992911);
                                            i34 = -485556197;
                                        } else {
                                            iM450217 = (C19806.m45029("֫ۨ") + i31) * 25;
                                            i33 = ((iM450217 ^ i32) * (-27087)) ^ (-1107126563);
                                            i34 = 67345055;
                                        }
                                        break;
                                    case -1138977567:
                                    case 24827493:
                                        if (C0216.m1591() <= 0) {
                                            iM450217 = C19806.m45029("᩶᩸") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-28339)) ^ 1486008052;
                                            i34 = 406318667;
                                        } else {
                                            iM450217 = C19806.m45029("ۚܳ") ^ i32;
                                            i33 = ((iM450217 ^ i31) * 8451) ^ (-1508828080);
                                            i34 = -2132994931;
                                        }
                                        break;
                                    case -1076437534:
                                    case 437292359:
                                        if (C19806.f63586) {
                                            iM450217 = (i31 - C19806.m45029("۫ۗ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM450217 ^ i32) * 10047) ^ (-455816490);
                                            i34 = -297554438;
                                        } else {
                                            iM450217 = C19806.m45029("֨᩻") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-20753)) ^ (-1089692542);
                                            i34 = -393632515;
                                        }
                                        break;
                                    case -896966404:
                                    case 1529715547:
                                        if (C1875.f7103 >= 0) {
                                            iM450217 = C19806.m45029("ܽ۫") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-26641)) ^ (-569696776);
                                            i34 = 236866005;
                                        } else {
                                            iM450217 = (i31 - ThreadFactoryC3888.m11306("ۤۘ")) * (-57);
                                            i33 = ((iM450217 ^ i32) * (-13261)) ^ (-2104741937);
                                            i34 = 2143664647;
                                        }
                                        break;
                                    case -131514201:
                                    case 1096345973:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM450217 = (i31 - C19806.m45029("۫ۗ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM450217 ^ i32) * 10047) ^ (-455816490);
                                            i34 = -297554438;
                                        } else {
                                            iM450217 = C19806.m45029("֫ܳ") ^ i31;
                                            i33 = ((iM450217 ^ i32) * 3989) ^ (-1077334251);
                                            i34 = -1439954135;
                                        }
                                        break;
                                    case -9383825:
                                    case 189934602:
                                        CallableC1627.m5507();
                                        if (C1148.f5161 > 0) {
                                            iM450217 = C19806.m45029("᩶᩸") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-28339)) ^ 1486008052;
                                            i34 = 406318667;
                                        } else {
                                            iM450217 = (i31 - C19806.m45029("۫ۗ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM450217 ^ i32) * 10047) ^ (-455816490);
                                            i34 = -297554438;
                                        }
                                        break;
                                    case 284187694:
                                    case 1804374709:
                                        if (C2871.f10837 >= 0) {
                                            iM450217 = (i31 - C19806.m45029("ۜ᩸")) * 25;
                                            i33 = ((iM450217 ^ i32) * 17295) ^ 102609571;
                                            i34 = 519862245;
                                        } else {
                                            iM450217 = (i32 - ThreadFactoryC3888.m11306("۟ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i33 = ((iM450217 ^ i31) * 27981) ^ 1891783023;
                                            i34 = -848727909;
                                        }
                                        break;
                                    case 464284172:
                                    case 1162346057:
                                        C2704.m8255();
                                        break;
                                    case 511302519:
                                    case 632046682:
                                        C0216.m1586(this.f69461);
                                        break;
                                    case 1100007596:
                                    case 1408629815:
                                        if (C1668.f6641 >= 0) {
                                            iM450217 = (i31 - C19806.m45029("۫ۗ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM450217 ^ i32) * 10047) ^ (-455816490);
                                            i34 = -297554438;
                                        } else {
                                            iM450217 = ThreadFactoryC3888.m11306("ܽۜ") ^ i31;
                                            i33 = ((iM450217 ^ i32) * (-1289)) ^ (-1298963348);
                                            i34 = -2144337689;
                                        }
                                        break;
                                    case 1392454383:
                                    case 2099697155:
                                        CallableC1627.m5507();
                                        if (C0671.f2816 == 0) {
                                            iM450217 = C19806.m45029("ܽ۫") ^ i32;
                                            i33 = ((iM450217 ^ i31) * (-26641)) ^ (-569696776);
                                            i34 = 236866005;
                                        } else {
                                            iM450217 = (i31 - C19806.m45029("ۜ᩸")) * 25;
                                            i33 = ((iM450217 ^ i32) * 17295) ^ 102609571;
                                            i34 = 519862245;
                                        }
                                        break;
                                    default:
                                        boolean z = ActivityC11736.f39454;
                                        if (C1189.f5284 <= 0) {
                                            iM450217 = (i32 - ThreadFactoryC3888.m11306("۬֨")) * 23;
                                            i33 = ((iM450217 ^ i31) * (-14949)) ^ (-1644992911);
                                            i34 = -485556197;
                                        } else {
                                            iM450217 = (i31 - ThreadFactoryC3888.m11306("᩶ܰ")) * 19;
                                            i33 = ((iM450217 ^ i32) * (-29821)) ^ (-24369629);
                                            i34 = 1527974227;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    int iM450217 = (C19806.m45029("ۡᩴ") + i17) * (-85);
                    c69310 = c69313;
                    i19 = ((iM450217 ^ i18) * (-30669)) ^ (-1164190146);
                    i20 = iM450217 ^ (-613921508);
                    c6939 = c69312;
                    break;
                case -233949504:
                case 1940470426:
                    i21 = 47157;
                    iM45029 = ThreadFactoryC3888.m11306("ۙ۟") ^ i17;
                    i19 = ((iM45029 ^ i18) * 12757) ^ 1760284818;
                    i4 = -1491358252;
                    i20 = iM45029 ^ i4;
                    activityC11736 = this;
                    sArr7 = sArr7;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    c69310 = c69310;
                    i26 = i26;
                    sArr6 = sArr6;
                    i15 = i15;
                    break;
                case -231718785:
                case 572236687:
                    short[] sArr23 = sArr9;
                    C6938 c69314 = c69310;
                    short[] sArr24 = sArr10;
                    AbstractC10697 abstractC10697 = abstractC10697M25489;
                    abstractC10697.mo13895(true);
                    C6938 c69315 = activityC11736.f41645;
                    short[] sArr25 = f39453;
                    i26 = 10;
                    int iM450218 = (i18 - C19806.m45029("ۙ۠")) * 7;
                    c6939 = c69315;
                    i19 = ((iM450218 ^ i17) * 8515) ^ 980466578;
                    i20 = iM450218 ^ 621001730;
                    abstractC10697M25489 = abstractC10697;
                    sArr10 = sArr24;
                    c69310 = c69314;
                    sArr8 = sArr25;
                    sArr9 = sArr23;
                    break;
                case -229520891:
                case 394661346:
                    sArr8 = sArr8;
                    i15 = i15;
                    sArr7 = sArr7;
                    iM450212 = C19806.m45029(C2249.m6918(sArr7, 4, 3, i21));
                    i25 = 2127159928;
                    int iM450219 = C19806.m45029("ܽܽ") ^ i18;
                    i5 = ((iM450219 ^ i17) * (-5523)) ^ (-966110581);
                    i20 = iM450219 ^ (-332010634);
                    i19 = i5;
                    sArr7 = sArr7;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr10 = sArr10;
                    c69310 = c69310;
                    i26 = i26;
                    sArr6 = sArr6;
                    i15 = i15;
                    break;
                case 273223079:
                case 1415765860:
                    c6938 = c69310;
                    sArr2 = sArr10;
                    short[] sArr26 = sArr8;
                    sArr4 = sArr9;
                    i9 = i26;
                    sArr5 = sArr26;
                    C6938 c69316 = (C6938) viewM7084;
                    activityC11736.f41645 = c69316;
                    C0278.m1782(activityC11736, c69316);
                    abstractC10697M25489 = m25489();
                    if (C19806.f63586) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۜۖ") ^ i18) * (-57);
                        i10 = ((iM11308 ^ i17) * (-11825)) ^ 48227172;
                        i11 = 2110790856;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩷᩸") ^ i17;
                        i10 = ((iM11308 ^ i18) * (-11279)) ^ 1872405238;
                        i11 = 829898154;
                    }
                    i20 = iM11308 ^ i11;
                    i19 = i10;
                    sArr10 = sArr2;
                    c69310 = c6938;
                    short[] sArr110 = sArr5;
                    i26 = i9;
                    sArr9 = sArr4;
                    sArr8 = sArr110;
                    break;
                case 1247195753:
                case 1707497257:
                    iM450211 = C19806.m45029(C1937.m6288(f39453, 19, 3, i21));
                    i13 = 2122322258;
                    if (C3722.m10894() <= 0) {
                        iM11306 = (i17 - C19806.m45029("᩷ۙ")) * (-107);
                        i = ((iM11306 ^ i18) * (-13539)) ^ 2040856588;
                        i2 = -328289981;
                    } else {
                        iM11306 = (C19806.m45029("ۜܰ") + i17) * (-113);
                        i = ((iM11306 ^ i18) * 15917) ^ (-1149620291);
                        i2 = -649364114;
                    }
                    i20 = iM11306 ^ i2;
                    i19 = i;
                    break;
                case 1404988293:
                case 2073767317:
                    i3 = i26;
                    c6938 = c69310;
                    sArr2 = sArr10;
                    sArr3 = sArr8;
                    sArr4 = sArr9;
                    RunnableC0195.m1436(activityC11736, iM450212 ^ i25);
                    sArr = f39453;
                    i15 = 7;
                    if (C0278.f1572 <= 0) {
                        iM450210 = (C19806.m45029("ۢ۠") ^ i18) * (-15);
                        i7 = ((iM450210 ^ i17) * 30379) ^ 803191099;
                        i8 = -1971158448;
                    } else {
                        iM450210 = C19806.m45029("ۘܽ") ^ i17;
                        i7 = ((iM450210 ^ i18) * (-8893)) ^ (-1532885755);
                        i8 = 989397034;
                    }
                    i20 = iM450210 ^ i8;
                    sArr10 = sArr2;
                    c69310 = c6938;
                    int i210 = i3;
                    sArr6 = sArr;
                    i19 = i7;
                    sArr9 = sArr4;
                    sArr8 = sArr3;
                    i26 = i210;
                    break;
                default:
                    viewM1436 = RunnableC0195.m1436(activityC11736, C19806.m45029(C1025.m3859(sArr9, i24, 3, i21)) ^ 2127927866);
                    iM11306 = (i17 - C19806.m45029("᩸۟")) * (-23);
                    i = ((iM11306 ^ i18) * (-7359)) ^ (-1362175192);
                    i2 = 664785387;
                    i20 = iM11306 ^ i2;
                    i19 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x015a A[PHI: r3 r11
      0x015a: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:42:0x0158, B:27:0x00c2, B:12:0x005a, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:42:0x0158, B:27:0x00c2, B:12:0x005a, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x018f A[PHI: r9 r10
      0x018f: PHI (r9v5 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:46:0x018d, B:12:0x005a, B:88:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r10v5 short) = (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:46:0x018d, B:12:0x005a, B:88:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01fa A[PHI: r1 r5 r13 r14
      0x01fa: PHI (r1v4 android.view.MenuInflater) = (r1v3 android.view.MenuInflater), (r1v2 android.view.MenuInflater), (r1v2 android.view.MenuInflater) binds: [B:31:0x00e7, B:9:0x0054, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r5v3 char) = (r5v2 char), (r5v2 char), (r5v4 char) binds: [B:31:0x00e7, B:9:0x0054, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:31:0x00e7, B:9:0x0054, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:31:0x00e7, B:9:0x0054, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0246 A[PHI: r6 r7 r8 r19
      0x0246: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:64:0x0244, B:60:0x022a, B:54:0x01df, B:50:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:64:0x0244, B:60:0x022a, B:54:0x01df, B:50:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:64:0x0244, B:60:0x022a, B:54:0x01df, B:50:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x0244, B:60:0x022a, B:54:0x01df, B:50:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM11306;
        int i;
        int i2;
        int i3 = C1977.f7413;
        int i4 = C1148.f5161;
        int iM11307 = ThreadFactoryC3888.m11306("᩶ۗ") ^ i4;
        int i5 = ((iM11307 ^ i3) * 3105) ^ 105321602;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ 1407613250;
        MenuInflater menuInflater = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -940638336;
        String strM7082 = null;
        int iM11308 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-9021)) >> 31));
            switch (i12) {
                case -1630598756:
                case 1769319997:
                    i10 = 3488;
                    iM11306 = C19806.m45029("ۚܽ") ^ i4;
                    i = ((iM11306 ^ i3) * (-2399)) ^ (-1667307661);
                    i2 = -1947513563;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1202015470:
                case 124814313:
                    sArr = f39453;
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ۠")) * 63;
                        i = ((iM11306 ^ i4) * 2323) ^ 1552659847;
                        i2 = 1695956952;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩸") ^ i4;
                        i = ((iM11306 ^ i3) * 5271) ^ 934520222;
                        i2 = 179273574;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1127214554:
                case 1644865976:
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = C19806.m45029("᩵֫") ^ i4;
                        i = ((iM11306 ^ i3) * (-25477)) ^ 1456933906;
                        i2 = 873946703;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * (-123);
                        i = ((iM11306 ^ i4) * (-12069)) ^ (-1831154273);
                        i2 = -314329856;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1121509340:
                case 634310044:
                    strM7082 = C2332.m7082(sArr2, i11, 3, i10);
                    if (C2704.m8255() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * (-123);
                        i = ((iM11306 ^ i4) * (-12069)) ^ (-1831154273);
                        i2 = -314329856;
                    } else {
                        iM11306 = C19806.m45029("᩸۫") ^ i3;
                        i = ((iM11306 ^ i4) * 29315) ^ (-830933369);
                        i2 = -1954002099;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -893919278:
                case -195507359:
                    menuInflater = getMenuInflater();
                    sArr2 = f39453;
                    i11 = 23;
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = C19806.m45029("ܳ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-15795)) ^ 2084411799;
                        i2 = 498667665;
                    } else {
                        iM11306 = C19806.m45029("ۙᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * 25175) ^ (-567183664);
                        i2 = 1518173888;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -859469716:
                case 2047600288:
                    if ((i9 + 1) - i8 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩶") ^ i3;
                        i = ((iM11306 ^ i4) * (-27249)) ^ 1383476140;
                        i2 = 997424505;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩶") + i4) * 51;
                        i = ((iM11306 ^ i3) * (-14235)) ^ (-878114157);
                        i2 = 1307744060;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -732763982:
                case 1982808025:
                    i7 = s + s2;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ۠")) * 63;
                        i = ((iM11306 ^ i4) * 2323) ^ 1552659847;
                        i2 = 1695956952;
                    } else {
                        iM11306 = C19806.m45029("֨֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-7653)) ^ (-259461741);
                        i2 = -1094601157;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -644944454:
                case 2048557581:
                    iM11308 = ThreadFactoryC3888.m11306(strM7082) ^ 2098498099;
                    if (ThreadFactoryC3888.m11300() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i = ((iM11306 ^ i4) * (-28255)) ^ (-519099690);
                        i2 = 256493521;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM45029 = C19806.m45029("ܶܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31879) ^ 107882665;
                        i6 = iM45029 ^ 1063377061;
                    }
                    break;
                case -322658490:
                case 1826108139:
                    i8 = i7 * i7;
                    s3 = 2;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("᩵֫") ^ i4;
                        i = ((iM11306 ^ i3) * (-25477)) ^ 1456933906;
                        i2 = 873946703;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 11753) ^ (-2056545766);
                        i2 = 428610251;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -40602725:
                case 1269250686:
                    C0671.m3008();
                    int iM450210 = C19806.m45029("ܶܰ") ^ i4;
                    i5 = ((iM450210 ^ i3) * 31879) ^ 107882665;
                    i6 = iM450210 ^ 1063377061;
                    break;
                case 325309246:
                case 1087529976:
                    C1461.m5080();
                    C0629.m2907();
                    return false;
                case 481270626:
                case 2021907398:
                    C2332.m7079();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        int iM450211 = C19806.m45029("ܶܰ") ^ i4;
                        i5 = ((iM450211 ^ i3) * 31879) ^ 107882665;
                        i6 = iM450211 ^ 1063377061;
                    } else {
                        iM11306 = C19806.m45029("᩵֫") ^ i4;
                        i = ((iM11306 ^ i3) * (-25477)) ^ 1456933906;
                        i2 = 873946703;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case 580075723:
                case 2139030465:
                    s = sArr[c];
                    s2 = 1;
                    if (C1460.m5050() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ۠")) * 63;
                        i = ((iM11306 ^ i4) * 2323) ^ 1552659847;
                        i2 = 1695956952;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܺۙ")) * 67;
                        i = ((iM11306 ^ i4) * 31783) ^ (-795657965);
                        i2 = -1553390179;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 743841668:
                case 1177383044:
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۢ") + i3) * (-37);
                        i = ((iM11306 ^ i4) * (-11363)) ^ 1656504590;
                        i2 = -1656059188;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ۠")) * 63;
                        i = ((iM11306 ^ i4) * 2323) ^ 1552659847;
                        i2 = 1695956952;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1025062515:
                case 1543612663:
                    i10 = 17569;
                    iM11306 = C19806.m45029("ۚܽ") ^ i4;
                    i = ((iM11306 ^ i3) * (-2399)) ^ (-1667307661);
                    i2 = -1947513563;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1245571899:
                case 1318392304:
                    if (C1875.f7103 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * (-123);
                        i = ((iM11306 ^ i4) * (-12069)) ^ (-1831154273);
                        i2 = -314329856;
                    } else {
                        iM11306 = C19806.m45029("ܳ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-15795)) ^ 2084411799;
                        i2 = 498667665;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1565294952:
                case 1978326944:
                    menuInflater.inflate(iM11308, menu);
                    return true;
                case 1715442636:
                case 2123822061:
                    i9 = s * s3;
                    if (C3535.m10431() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֡") + i3) * (-123);
                        i = ((iM11306 ^ i4) * (-12069)) ^ (-1831154273);
                        i2 = -314329856;
                    } else {
                        iM11306 = (C19806.m45029("۫᩻") + i3) * 25;
                        i = ((iM11306 ^ i4) * 3697) ^ (-1466965041);
                        i2 = -832151240;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 22;
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ܳ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-15795)) ^ 2084411799;
                        i2 = 498667665;
                    } else {
                        iM11306 = (C19806.m45029("ۖ۬") + i4) * 97;
                        i = ((iM11306 ^ i3) * 14059) ^ 615027193;
                        i2 = 473332828;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29346(final ActivityC11736 activityC11736, final int i, final RunnableC19228 runnableC19228) {
        Runnable runnable = null;
        int i2 = 271102010;
        int i3 = C2871.f10837;
        int i4 = C3577.f13150;
        int iM11306 = ThreadFactoryC3888.m11306("ܶ۫") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-23625)) ^ 267956304;
        int i6 = -1556661055;
        while (true) {
            i2 = ((((i2 ^ i4) * (-22841)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2132269675:
                case -353235801:
                    runnable.run();
                    break;
                case -1886444206:
                case 583739731:
                    if (C1189.m4368() <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۨܳ")) * (-95);
                        i5 = ((iM11306 ^ i4) * 17831) ^ (-1377807978);
                        i6 = -795420219;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۖ") ^ i3) * 77;
                        i5 = ((iM11306 ^ i4) * (-32069)) ^ 113338168;
                        i6 = 615119126;
                    }
                    break;
                case -1690834067:
                case 498219139:
                    runnable = new Runnable(activityC11736) { // from class: l.ᩳۙۘ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ActivityC11736 f56448;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i7 = 0;
                            RunnableC19228 runnableC19229 = null;
                            int i8 = 1841572733;
                            int i9 = C1398.f5802;
                            int i10 = C1461.f5957;
                            int iM45029 = (i9 - C19806.m45029("ۜۙ")) * (-113);
                            int i11 = ((iM45029 ^ i10) * (-10663)) ^ 89606638;
                            int i12 = -12662333;
                            while (true) {
                                i8 = ((((i8 ^ i10) * 14709) >> 31) & i11) ^ (iM45029 ^ i12);
                                switch (i8) {
                                    case -2091468722:
                                    case -1512751071:
                                        if (C1189.f5284 <= 0) {
                                            iM45029 = C19806.m45029("۠ۡ") ^ i10;
                                            i11 = ((iM45029 ^ i9) * (-9731)) ^ (-698999901);
                                            i12 = 1161497292;
                                        } else {
                                            iM45029 = (i10 - C19806.m45029("ۛ۠")) * 41;
                                            i11 = ((iM45029 ^ i9) * 28289) ^ 1900210381;
                                            i12 = 1669945647;
                                        }
                                        break;
                                    case -1955165208:
                                    case 675145534:
                                        if (C2124.f7782 > 0) {
                                            iM45029 = (C19806.m45029("۬᩺") ^ i9) * 29;
                                            i11 = ((iM45029 ^ i10) * 15981) ^ (-1588367411);
                                            i12 = -101484501;
                                        } else {
                                            iM45029 = C19806.m45029("۠ۡ") ^ i10;
                                            i11 = ((iM45029 ^ i9) * (-9731)) ^ (-698999901);
                                            i12 = 1161497292;
                                        }
                                        break;
                                    case -1693379784:
                                    case 272114105:
                                        if (C2788.f10625 >= 0) {
                                            iM45029 = (C19806.m45029("۬᩺") ^ i9) * 29;
                                            i11 = ((iM45029 ^ i10) * 15981) ^ (-1588367411);
                                            i12 = -101484501;
                                        } else {
                                            iM45029 = (i10 - ThreadFactoryC3888.m11306("᩷۫")) * (-31);
                                            i11 = ((iM45029 ^ i9) * (-6455)) ^ 1196648733;
                                            i12 = 430999483;
                                        }
                                        break;
                                    case -1558182549:
                                    case 1435582420:
                                        if (C0629.f2722 <= 0) {
                                            iM45029 = (C19806.m45029("ܰ᩵") ^ i9) * (-81);
                                            i11 = ((iM45029 ^ i10) * 13323) ^ 1443771033;
                                            i12 = 1792364236;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("ۗܽ") ^ i9) * (-115);
                                            i11 = ((iM45029 ^ i10) * (-26875)) ^ 1917776799;
                                            i12 = -1325473434;
                                        }
                                        break;
                                    case -994563102:
                                    case 996519053:
                                        if (C3660.m10791() == 0) {
                                            iM45029 = (i10 - ThreadFactoryC3888.m11306("ܿᩳ")) * (-109);
                                            i11 = ((iM45029 ^ i9) * 15825) ^ (-1810883018);
                                            i12 = 1970425379;
                                        } else {
                                            iM45029 = (C19806.m45029("ܰ᩵") ^ i9) * (-81);
                                            i11 = ((iM45029 ^ i10) * 13323) ^ 1443771033;
                                            i12 = 1792364236;
                                        }
                                        break;
                                    case -940846728:
                                    case 51536763:
                                        ActivityC11736.m29338(this.f56448, i7, runnableC19229);
                                        break;
                                    case -892798555:
                                    case 1458333075:
                                        runnableC19229 = runnableC19228;
                                        if (C0962.f3784) {
                                            iM45029 = (C19806.m45029("֨۫") ^ i9) * 43;
                                            i11 = ((iM45029 ^ i10) * 23969) ^ 1567647878;
                                            i12 = 133729383;
                                        } else {
                                            iM45029 = ThreadFactoryC3888.m11306("ۤܺ") ^ i9;
                                            i11 = ((iM45029 ^ i10) * 11953) ^ (-741683189);
                                            i12 = -318883757;
                                        }
                                        break;
                                    case -604671935:
                                    case 221703543:
                                        if (RunnableC1895.f7152) {
                                            iM45029 = C19806.m45029("ܳ᩻") ^ i10;
                                            i11 = ((iM45029 ^ i9) * 4257) ^ 889395072;
                                            i12 = -1834140242;
                                        } else {
                                            iM45029 = (C19806.m45029("۬᩺") ^ i9) * 29;
                                            i11 = ((iM45029 ^ i10) * 15981) ^ (-1588367411);
                                            i12 = -101484501;
                                        }
                                        break;
                                    case -536673719:
                                    case 1241499904:
                                        if (C0629.m2907()) {
                                            iM45029 = (ThreadFactoryC3888.m11306("᩹ۢ") ^ i9) * (-33);
                                            i11 = ((iM45029 ^ i10) * 18553) ^ 608012854;
                                            i12 = -382128076;
                                        } else {
                                            iM45029 = (C19806.m45029("ܰ᩵") ^ i9) * (-81);
                                            i11 = ((iM45029 ^ i10) * 13323) ^ 1443771033;
                                            i12 = 1792364236;
                                        }
                                        break;
                                    case -39319243:
                                    case 411318188:
                                        if (C2477.f9839 <= 0) {
                                            iM45029 = C19806.m45029("۠ۡ") ^ i10;
                                            i11 = ((iM45029 ^ i9) * (-9731)) ^ (-698999901);
                                            i12 = 1161497292;
                                        } else {
                                            iM45029 = (C19806.m45029("ܰ᩵") ^ i9) * (-81);
                                            i11 = ((iM45029 ^ i10) * 13323) ^ 1443771033;
                                            i12 = 1792364236;
                                        }
                                        break;
                                    case 54182979:
                                    case 898528134:
                                        i7 = i;
                                        if (C1148.f5161 <= 0) {
                                            iM45029 = (C19806.m45029("֨۫") ^ i9) * 43;
                                            i11 = ((iM45029 ^ i10) * 23969) ^ 1567647878;
                                            i12 = 133729383;
                                        } else {
                                            iM45029 = C19806.m45029("ᩴᩳ") ^ i9;
                                            i11 = ((iM45029 ^ i10) * 17161) ^ 485220934;
                                            i12 = -1472150580;
                                        }
                                        break;
                                    case 267406316:
                                    case 470100085:
                                        if (C0797.m3359()) {
                                            iM45029 = C19806.m45029("᩵ᩴ") ^ i10;
                                            i11 = ((iM45029 ^ i9) * 3765) ^ 1201889084;
                                            i12 = 295287356;
                                        } else {
                                            iM45029 = (C19806.m45029("֨۫") ^ i9) * 43;
                                            i11 = ((iM45029 ^ i10) * 23969) ^ 1567647878;
                                            i12 = 133729383;
                                        }
                                        break;
                                    case 366682265:
                                    case 760668874:
                                        if (C0671.f2816 != 0) {
                                            iM45029 = (i10 - ThreadFactoryC3888.m11306("ܿᩳ")) * (-109);
                                            i11 = ((iM45029 ^ i9) * 15825) ^ (-1810883018);
                                            i12 = 1970425379;
                                        } else {
                                            iM45029 = (i10 - C19806.m45029("᩶᩵")) * 19;
                                            i11 = ((iM45029 ^ i9) * (-16509)) ^ (-1230276219);
                                            i12 = -2106435685;
                                        }
                                        break;
                                    case 492759918:
                                    case 758093870:
                                        C2704.m8255();
                                        iM45029 = (C19806.m45029("ܰ᩵") ^ i9) * (-81);
                                        i11 = ((iM45029 ^ i10) * 13323) ^ 1443771033;
                                        i12 = 1792364236;
                                        break;
                                    case 1268441793:
                                    case 1837222815:
                                        if (C3660.f13403 >= 0) {
                                            iM45029 = (C19806.m45029("֨۫") ^ i9) * 43;
                                            i11 = ((iM45029 ^ i10) * 23969) ^ 1567647878;
                                            i12 = 133729383;
                                        } else {
                                            iM45029 = (i9 - C19806.m45029("ۚۡ")) * 15;
                                            i11 = ((iM45029 ^ i10) * (-1539)) ^ 2038555004;
                                            i12 = -1983833274;
                                        }
                                        break;
                                    default:
                                        RunnableC1564.m5345();
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i7 = -2038974337;
                            int i8 = C1189.f5284;
                            int i9 = C2788.f10625;
                            int iM45029 = C19806.m45029("ܿۛ") ^ i9;
                            int i10 = ((iM45029 ^ i8) * (-20575)) ^ 698759846;
                            int i11 = -1068853535;
                            while (true) {
                                i7 = ((((i7 ^ i8) * (-28291)) >> 31) & i10) ^ (iM45029 ^ i11);
                                switch (i7) {
                                    case -2014057301:
                                    case 88713865:
                                        if (C0526.f2219) {
                                            iM45029 = (C19806.m45029("ۢܽ") ^ i9) * (-57);
                                            i10 = ((iM45029 ^ i8) * (-8075)) ^ (-1000614503);
                                            i11 = -39850692;
                                        } else {
                                            iM45029 = (i9 - C19806.m45029("᩸ܰ")) * 21;
                                            i10 = ((iM45029 ^ i8) * 2977) ^ (-538336455);
                                            i11 = 1127466158;
                                        }
                                        break;
                                    case -1813420255:
                                    case -945858063:
                                        if (C19806.m45024()) {
                                            iM45029 = (i8 - ThreadFactoryC3888.m11306("֫۠")) * (-19);
                                            i10 = ((iM45029 ^ i9) * 25525) ^ 724241972;
                                            i11 = 347368801;
                                        } else {
                                            iM45029 = ThreadFactoryC3888.m11306("۟۟") ^ i8;
                                            i10 = ((iM45029 ^ i9) * (-11979)) ^ (-656131759);
                                            i11 = 1963969368;
                                        }
                                        break;
                                    case -1714813471:
                                    case 2012945165:
                                        if (C10634.f36300 >= 0) {
                                            iM45029 = (i8 - ThreadFactoryC3888.m11306("֫۠")) * (-19);
                                            i10 = ((iM45029 ^ i9) * 25525) ^ 724241972;
                                            i11 = 347368801;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("ۨᩳ") ^ i8) * (-123);
                                            i10 = ((iM45029 ^ i9) * 5017) ^ 206841986;
                                            i11 = 1693605453;
                                        }
                                        break;
                                    case -1603664409:
                                    case 480670860:
                                        if (C2332.m7079() <= 0) {
                                            iM45029 = C19806.m45029("᩶᩸") ^ i8;
                                            i10 = ((iM45029 ^ i9) * (-17817)) ^ (-183447319);
                                            i11 = 227780281;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i9) * (-93);
                                            i10 = ((iM45029 ^ i8) * (-23035)) ^ 849847340;
                                            i11 = -2095645704;
                                        }
                                        break;
                                    case -1192221042:
                                    case 2065586283:
                                        if (C0216.f1393 != 0) {
                                            iM45029 = (C19806.m45029("ܶܶ") + i8) * (-57);
                                            i10 = ((iM45029 ^ i9) * (-22577)) ^ (-1310684435);
                                            i11 = 1633498169;
                                        } else {
                                            iM45029 = (i9 - C19806.m45029("ۜ۟")) * (-51);
                                            i10 = ((iM45029 ^ i8) * 441) ^ 1276979415;
                                            i11 = 1575907941;
                                        }
                                        break;
                                    case -1099311603:
                                    case 432107195:
                                        RunnableC1606.m5473();
                                        C1460.m5050();
                                        throw new RuntimeException();
                                    case -1028080215:
                                    case -881953980:
                                        C0671.m3008();
                                        C10634.m26820();
                                        iM45029 = (i8 - ThreadFactoryC3888.m11306("֫۠")) * (-19);
                                        i10 = ((iM45029 ^ i9) * 25525) ^ 724241972;
                                        i11 = 347368801;
                                        break;
                                    case -959371181:
                                    case 1014792210:
                                        return;
                                    case -929146645:
                                    case -880418582:
                                        if (C1377.f5749) {
                                            iM45029 = C19806.m45029("ۜ᩶") ^ i9;
                                            i10 = ((iM45029 ^ i8) * (-12143)) ^ (-559656799);
                                            i11 = -1575674175;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i9) * (-93);
                                            i10 = ((iM45029 ^ i8) * (-23035)) ^ 849847340;
                                            i11 = -2095645704;
                                        }
                                        break;
                                    case -251540330:
                                    case 363109195:
                                        this.f56448 = activityC11736;
                                        if (C1875.m6086() != 0) {
                                            iM45029 = (i8 - ThreadFactoryC3888.m11306("֫۠")) * (-19);
                                            i10 = ((iM45029 ^ i9) * 25525) ^ 724241972;
                                            i11 = 347368801;
                                        } else {
                                            iM45029 = C19806.m45029("᩸ܿ") ^ i8;
                                            i10 = ((iM45029 ^ i9) * 12715) ^ 2048530017;
                                            i11 = -1145020132;
                                        }
                                        break;
                                    case -99597699:
                                    case -26837902:
                                        if (C7105.f23796 >= 0) {
                                            iM45029 = (C19806.m45029("ۢܽ") ^ i9) * (-57);
                                            i10 = ((iM45029 ^ i8) * (-8075)) ^ (-1000614503);
                                            i11 = -39850692;
                                        } else {
                                            iM45029 = C19806.m45029("֫ۤ") ^ i9;
                                            i10 = ((iM45029 ^ i8) * 9165) ^ (-793594812);
                                            i11 = -342799929;
                                        }
                                        break;
                                    case 361454540:
                                    case 1632640622:
                                        C3286.m9798();
                                        if (!C0817.f3443) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i9) * (-93);
                                            i10 = ((iM45029 ^ i8) * (-23035)) ^ 849847340;
                                            i11 = -2095645704;
                                        } else {
                                            iM45029 = (C19806.m45029("ۢܽ") ^ i9) * (-57);
                                            i10 = ((iM45029 ^ i8) * (-8075)) ^ (-1000614503);
                                            i11 = -39850692;
                                        }
                                        break;
                                    case 1048515976:
                                    case 1359899946:
                                        if (C2642.f10294 <= 0) {
                                            iM45029 = C19806.m45029("᩶᩸") ^ i8;
                                            i10 = ((iM45029 ^ i9) * (-17817)) ^ (-183447319);
                                            i11 = 227780281;
                                        } else {
                                            iM45029 = C19806.m45029("ܳۤ") ^ i8;
                                            i10 = ((iM45029 ^ i9) * (-31939)) ^ 1135297614;
                                            i11 = -475055359;
                                        }
                                        break;
                                    case 1432191040:
                                    case 2111197770:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i9) * (-93);
                                            i10 = ((iM45029 ^ i8) * (-23035)) ^ 849847340;
                                            i11 = -2095645704;
                                        } else {
                                            iM45029 = (i8 - ThreadFactoryC3888.m11306("֫۠")) * (-19);
                                            i10 = ((iM45029 ^ i9) * 25525) ^ 724241972;
                                            i11 = 347368801;
                                        }
                                        break;
                                    case 1457515833:
                                    case 1791510255:
                                        if (C2477.m7593() >= 0) {
                                            iM45029 = C19806.m45029("᩶᩸") ^ i8;
                                            i10 = ((iM45029 ^ i9) * (-17817)) ^ (-183447319);
                                            i11 = 227780281;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("᩺ۡ") ^ i9) * (-55);
                                            i10 = ((iM45029 ^ i8) * (-10933)) ^ 1219359703;
                                            i11 = -201833788;
                                        }
                                        break;
                                    default:
                                        if (C0671.m3008() >= 0) {
                                            iM45029 = (C19806.m45029("ۢܽ") ^ i9) * (-57);
                                            i10 = ((iM45029 ^ i8) * (-8075)) ^ (-1000614503);
                                            i11 = -39850692;
                                        } else {
                                            iM45029 = (i8 - ThreadFactoryC3888.m11306("ۢۨ")) * 73;
                                            i10 = ((iM45029 ^ i9) * 8567) ^ 299456742;
                                            i11 = 2029129832;
                                        }
                                        break;
                                }
                            }
                        }
                    };
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-10201)) ^ (-632560747);
                        i6 = 1690173120;
                    } else {
                        iM11306 = C19806.m45029("ۖܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-9539)) ^ (-1912900332);
                        i6 = 1874373057;
                    }
                    break;
                case -1571537109:
                case -632090152:
                    C19806.m45024();
                    break;
                case -1482966993:
                case -26187905:
                    if (C1668.f6641 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 12991) ^ (-1312600133);
                        i6 = -721872714;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27857) ^ (-1634258701);
                        i6 = 1084144980;
                    }
                    break;
                case -1469645538:
                case -471415181:
                    if (C0278.m1789() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27857) ^ (-1634258701);
                        i6 = 1084144980;
                    } else {
                        iM11306 = C19806.m45029("ܿ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 20285) ^ 2033201853;
                        i6 = 1674554011;
                    }
                    break;
                case -1121766758:
                case -203551105:
                    activityC11736.f39457.post(runnable);
                    break;
                case -1039931598:
                case -582459305:
                    activityC11736.f39457.stopScroll();
                    if (activityC11736.f39457.isComputingLayout()) {
                        iM11306 = (i4 - C19806.m45029("᩹۟")) * (-7);
                        i5 = ((iM11306 ^ i3) * (-19159)) ^ (-787953484);
                        i6 = 933748250;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5143)) ^ (-426302326);
                        i6 = 840467262;
                    }
                    break;
                case -979036915:
                case 1063958346:
                    C0817.m3399();
                    CallableC1627.m5507();
                    iM11306 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i4;
                    i5 = ((iM11306 ^ i3) * 27857) ^ (-1634258701);
                    i6 = 1084144980;
                    break;
                case -966785979:
                case -222978311:
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ᩳ") + i4) * (-75);
                        i5 = ((iM11306 ^ i3) * (-17005)) ^ (-1731055713);
                        i6 = -1185453468;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 12991) ^ (-1312600133);
                        i6 = -721872714;
                    }
                    break;
                case -930654671:
                case -838433957:
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27857) ^ (-1634258701);
                        i6 = 1084144980;
                    } else {
                        iM11306 = C19806.m45029("᩸ܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-20029)) ^ 613980497;
                        i6 = -256888388;
                    }
                    break;
                case -410849090:
                case 1746097866:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i4 - C19806.m45029("ۙܺ")) * 65;
                        i5 = ((iM11306 ^ i3) * (-20325)) ^ (-1147730986);
                        i6 = -1954144489;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27857) ^ (-1634258701);
                        i6 = 1084144980;
                    }
                    break;
                case -191655171:
                case 1312065180:
                    RunnableC1606.m5473();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۨܳ")) * (-95);
                        i5 = ((iM11306 ^ i4) * 17831) ^ (-1377807978);
                        i6 = -795420219;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۚ") + i3) * (-75);
                        i5 = ((iM11306 ^ i4) * 26819) ^ (-949712959);
                        i6 = 1456425820;
                    }
                    break;
                case -141916545:
                case 1336921113:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27857) ^ (-1634258701);
                        i6 = 1084144980;
                    } else {
                        iM11306 = C19806.m45029("֨۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 23049) ^ (-1563752356);
                        i6 = -622595471;
                    }
                    break;
                case -117305531:
                case 578077042:
                    if (C0797.f3386) {
                        iM11306 = (i3 - C19806.m45029("ۨܳ")) * (-95);
                        i5 = ((iM11306 ^ i4) * 17831) ^ (-1377807978);
                        i6 = -795420219;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩵ۧ")) * q.h;
                        i5 = ((iM11306 ^ i3) * 20657) ^ (-302414368);
                        i6 = 455782383;
                    }
                    break;
                case 45909932:
                case 1111693448:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("֫᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * 27141) ^ 14376413;
                        i6 = 1360404176;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۨܳ")) * (-95);
                        i5 = ((iM11306 ^ i4) * 17831) ^ (-1377807978);
                        i6 = -795420219;
                    }
                    break;
                case 298305592:
                case 1191094766:
                    if (C0797.m3359()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܽ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18973)) ^ 1668225339;
                        i6 = 1380528006;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 12991) ^ (-1312600133);
                        i6 = -721872714;
                    }
                    break;
                default:
                    C3660.m10791();
                    if (C2642.m8171() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۚ") + i3) * (-75);
                        i5 = ((iM11306 ^ i4) * 26819) ^ (-949712959);
                        i6 = 1456425820;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27857) ^ (-1634258701);
                        i6 = 1084144980;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0493 A[PHI: r3 r4 r8 r9 r14 r15 r17 r19 r20 r24 r27
      0x0493: PHI (r3v20 short[]) = (r3v12 short[]), (r3v14 short[]), (r3v19 short[]), (r3v21 short[]) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r4v17 int) = (r4v9 int), (r4v11 int), (r4v16 int), (r4v18 int) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r8v4 android.content.Intent) = 
      (r8v2 android.content.Intent)
      (r8v2 android.content.Intent)
      (r8v2 android.content.Intent)
      (r8v5 android.content.Intent)
     binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v3 java.lang.String), (r9v2 java.lang.String) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r24v23 boolean) = (r24v5 boolean), (r24v7 boolean), (r24v12 boolean), (r24v24 boolean) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0493: PHI (r27v11 java.util.ArrayList) = (r27v3 java.util.ArrayList), (r27v5 java.util.ArrayList), (r27v10 java.util.ArrayList), (r27v12 java.util.ArrayList) binds: [B:107:0x0491, B:99:0x0432, B:79:0x0323, B:36:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        if (l.C1066.f4915 <= 0) goto L20;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r30) {
        /*
            Method dump skipped, instruction units count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC11736.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29340(ActivityC11736 activityC11736, String str) {
        int iM29343 = 0;
        int i = -212358324;
        int i2 = AbstractC0464.f2088;
        int i3 = C2871.f10837;
        int iM11306 = (ThreadFactoryC3888.m11306("۟᩺") ^ i3) * 23;
        int i4 = ((iM11306 ^ i2) * 13097) ^ (-1061324258);
        int i5 = 1422512944;
        while (true) {
            i = ((((i ^ i2) * (-18225)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2020784611:
                case -2020250814:
                    RunnableC1564.m5345();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i2) * (-57);
                    i4 = ((iM11306 ^ i3) * (-13229)) ^ (-1894669585);
                    i5 = 189437924;
                    break;
                case -2009700304:
                case -1024273487:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۢ") + i2) * (-123);
                        i4 = ((iM11306 ^ i3) * 26287) ^ 919160410;
                        i5 = -893819782;
                    } else {
                        iM11306 = C19806.m45029("᩶ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20751)) ^ 777361284;
                        i5 = 897478577;
                    }
                    break;
                case -1922515526:
                case 1647488553:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("᩶ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20751)) ^ 777361284;
                        i5 = 897478577;
                    } else {
                        iM11306 = C19806.m45029("ۚ᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18143) ^ 1645277016;
                        i5 = 2125463742;
                    }
                    break;
                case -1693728290:
                case 248142207:
                    if (C0526.m2437() >= 0) {
                        iM11306 = C19806.m45029("᩶ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20751)) ^ 777361284;
                        i5 = 897478577;
                    } else {
                        iM11306 = C19806.m45029("ۚܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16117) ^ (-1760853238);
                        i5 = -1994054374;
                    }
                    break;
                case -1452185672:
                case 129208834:
                    activityC11736.f39458.remove(iM29343);
                    iM11306 = C19806.m45029("ᩴ۫") ^ i3;
                    i4 = ((iM11306 ^ i2) * 20047) ^ (-1648119249);
                    i5 = 536847731;
                    break;
                case -1391686392:
                case -240055741:
                    break;
                case -1340550640:
                case 1324136156:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("᩶ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20751)) ^ 777361284;
                        i5 = 897478577;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16993) ^ (-765063617);
                        i5 = 986092905;
                    }
                    break;
                case -988232807:
                case 1198457345:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i2) * (-57);
                        i4 = ((iM11306 ^ i3) * (-13229)) ^ (-1894669585);
                        i5 = 189437924;
                    } else {
                        iM11306 = (C19806.m45029("ۧۚ") ^ i2) * 15;
                        i4 = ((iM11306 ^ i3) * (-17971)) ^ (-1636507678);
                        i5 = 1179078515;
                    }
                    break;
                case -868156177:
                case -129897347:
                    if (C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10425) ^ (-679793121);
                        i5 = -1427997526;
                    } else {
                        iM11306 = (C19806.m45029("۠ۗ") ^ i3) * (-99);
                        i4 = ((iM11306 ^ i2) * (-20405)) ^ 1521750451;
                        i5 = 912995481;
                    }
                    break;
                case -786025088:
                case -672623432:
                    iM29343 = activityC11736.m29343(str);
                    if (iM29343 != -1) {
                        iM11306 = (i2 - C19806.m45029("ܽۧ")) * 73;
                        i4 = ((iM11306 ^ i3) * 675) ^ (-162000767);
                        i5 = -1701502531;
                    } else {
                        iM11306 = C19806.m45029("ᩴ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20047) ^ (-1648119249);
                        i5 = 536847731;
                    }
                    break;
                case -289129635:
                case -91676170:
                    C2124.m6673();
                    if (C3660.f13403 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۗ") + i2) * (-49);
                        i4 = ((iM11306 ^ i3) * 26539) ^ 1923831235;
                        i5 = 1161153787;
                    } else {
                        iM11306 = C19806.m45029("᩶ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20751)) ^ 777361284;
                        i5 = 897478577;
                    }
                    break;
                case -226261712:
                case 1977022921:
                    if (C0671.f2816 != 0) {
                        iM11306 = (C19806.m45029("ۖ᩷") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-30527)) ^ (-732889273);
                        i5 = 400629813;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܺۜ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * (-19331)) ^ 1584336629;
                        i5 = 1113291278;
                    }
                    break;
                case 169743478:
                case 2020066645:
                    RunnableC0195.m1431();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = (C19806.m45029("۠ۗ") ^ i3) * (-99);
                        i4 = ((iM11306 ^ i2) * (-20405)) ^ 1521750451;
                        i5 = 912995481;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۗ") + i2) * (-49);
                        i4 = ((iM11306 ^ i3) * 26539) ^ 1923831235;
                        i5 = 1161153787;
                    }
                    break;
                case 191603997:
                case 1803754559:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۗ") + i2) * (-49);
                        i4 = ((iM11306 ^ i3) * 26539) ^ 1923831235;
                        i5 = 1161153787;
                    } else {
                        iM11306 = C19806.m45029("᩸ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18019)) ^ (-2035094986);
                        i5 = -65036487;
                    }
                    break;
                case 554121378:
                case 1116826563:
                    if (C2249.m6915() <= 0) {
                        iM11306 = C19806.m45029("᩶ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20751)) ^ 777361284;
                        i5 = 897478577;
                    } else {
                        iM11306 = C19806.m45029("۫ۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7385) ^ 1319202113;
                        i5 = -1016484942;
                    }
                    break;
                case 1003875328:
                case 1411119467:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (C19806.m45029("۠ۗ") ^ i3) * (-99);
                        i4 = ((iM11306 ^ i2) * (-20405)) ^ 1521750451;
                        i5 = 912995481;
                    } else {
                        iM11306 = (C19806.m45029("ۚ᩶") ^ i2) * (-3);
                        i4 = ((iM11306 ^ i3) * 20689) ^ (-2066601632);
                        i5 = 2075152309;
                    }
                    break;
                case 1371851329:
                case 1924507024:
                    C1875.m6086();
                    if (!C3743.f13569) {
                        iM11306 = C19806.m45029("᩶ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20751)) ^ 777361284;
                        i5 = 897478577;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i2) * (-57);
                        i4 = ((iM11306 ^ i3) * (-13229)) ^ (-1894669585);
                        i5 = 189437924;
                    }
                    break;
                default:
                    C0216.m1591();
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ۖ */
    public final void mo2119() {
        long jM2311 = 0;
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 975850563;
        int i5 = ThreadFactoryC3888.f14547;
        int i6 = C0278.f1572;
        int iM45029 = C19806.m45029("ۢ۬") ^ i6;
        int i7 = ((iM45029 ^ i5) * (-4061)) ^ 760030751;
        int i8 = -1819081930;
        while (true) {
            i4 = ((((i4 ^ i5) * (-10609)) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -1909770363:
                case -1848327958:
                    if (jM2311 - j < 300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ֡") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-10229)) ^ 1448929404;
                        i8 = 421369432;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۢ") ^ i5) * 9;
                        i7 = ((iM45029 ^ i6) * 22381) ^ (-114971902);
                        i8 = -1454631925;
                    }
                    break;
                case -1908297995:
                case -163513119:
                    i3 = i + i2;
                    this.f39460 = i3;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("᩻᩹") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-18715)) ^ 1115832488;
                        i8 = -205672722;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܺ") ^ i5) * (-29);
                        i7 = ((iM45029 ^ i6) * (-13943)) ^ (-1150569371);
                        i8 = 475708444;
                    }
                    break;
                case -1897604069:
                case 1574760095:
                    jM2311 = AbstractC0464.m2311();
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i5 - C19806.m45029("᩸᩷")) * 17;
                        i7 = ((iM45029 ^ i6) * 11481) ^ 1952142178;
                        i8 = 347753812;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۤ") ^ i6) * 63;
                        i7 = ((iM45029 ^ i5) * (-3045)) ^ 1778581068;
                        i8 = 728713707;
                    }
                    break;
                case -1799631839:
                case -277341417:
                    i = this.f39460;
                    i2 = 1;
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("᩶᩵") ^ i5) * (-11);
                        i7 = ((iM45029 ^ i6) * (-12897)) ^ (-327060636);
                        i8 = -946461438;
                    } else {
                        iM45029 = (i5 - C19806.m45029("᩸᩷")) * 17;
                        i7 = ((iM45029 ^ i6) * 11481) ^ 1952142178;
                        i8 = 347753812;
                    }
                    break;
                case -1735070907:
                case 1132315915:
                    C3722.m10894();
                    if (C2249.m6915() > 0) {
                        iM45029 = C19806.m45029("ᩳܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-19015)) ^ (-2056036957);
                        i8 = -1127399567;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܺ") ^ i5) * (-29);
                        i7 = ((iM45029 ^ i6) * (-13943)) ^ (-1150569371);
                        i8 = 475708444;
                    }
                    break;
                case -1607851224:
                case 1025103070:
                    this.f39455 = AbstractC0464.m2311();
                    if (C1148.f5161 <= 0) {
                        iM45029 = (i5 - C19806.m45029("᩸᩷")) * 17;
                        i7 = ((iM45029 ^ i6) * 11481) ^ 1952142178;
                        i8 = 347753812;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ܺ᩵")) * 7;
                        i7 = ((iM45029 ^ i5) * 2609) ^ 948262231;
                        i8 = 642364507;
                    }
                    break;
                case -1581709508:
                case 1982736734:
                    RunnableC1606.m5473();
                    iM45029 = (C19806.m45029("᩵ܺ") ^ i5) * (-29);
                    i7 = ((iM45029 ^ i6) * (-13943)) ^ (-1150569371);
                    i8 = 475708444;
                    break;
                case -1532948115:
                case -1389159962:
                    j = this.f39455;
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟֨") ^ i5;
                        i7 = ((iM45029 ^ i6) * 19115) ^ (-584747616);
                        i8 = 354325926;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("֫ۙ")) * 75;
                        i7 = ((iM45029 ^ i6) * 8595) ^ 127534784;
                        i8 = -551079048;
                    }
                    break;
                case -1462131199:
                case -31219967:
                    if (C1025.m3861() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۬") + i6) * (-19);
                        i7 = ((iM45029 ^ i5) * 2535) ^ (-812471842);
                        i8 = -1125346762;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܺ") ^ i5) * (-29);
                        i7 = ((iM45029 ^ i6) * (-13943)) ^ (-1150569371);
                        i8 = 475708444;
                    }
                    break;
                case -1176181192:
                case -439143737:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۬") + i6) * (-19);
                        i7 = ((iM45029 ^ i5) * 2535) ^ (-812471842);
                        i8 = -1125346762;
                    } else {
                        iM45029 = C19806.m45029("֫ܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-6829)) ^ 1028544904;
                        i8 = -1177115400;
                    }
                    break;
                case -937578677:
                case 1810786827:
                    if (C1460.m5050() != 0) {
                        iM45029 = (i5 - C19806.m45029("᩸᩷")) * 17;
                        i7 = ((iM45029 ^ i6) * 11481) ^ 1952142178;
                        i8 = 347753812;
                    } else {
                        iM45029 = C19806.m45029("۠۠") ^ i5;
                        i7 = ((iM45029 ^ i6) * 5853) ^ (-741086072);
                        i8 = -1280285501;
                    }
                    break;
                case -524480274:
                case -288759081:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        RunnableC0195.m1442(new C20639(this, i3));
                    }
                    iM45029 = (i5 - C19806.m45029("᩸᩷")) * 17;
                    i7 = ((iM45029 ^ i6) * 11481) ^ 1952142178;
                    i8 = 347753812;
                    break;
                case -395081169:
                case 2059482632:
                    z = false;
                    if (C1875.m6086() != 0) {
                        iM45029 = C19806.m45029("ᩳܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-19015)) ^ (-2056036957);
                        i8 = -1127399567;
                    } else {
                        iM45029 = (C19806.m45029("ۨۛ") ^ i6) * 27;
                        i7 = ((iM45029 ^ i5) * 28905) ^ (-770165199);
                        i8 = 298990784;
                    }
                    break;
                case 74075285:
                case 1601614922:
                    break;
                case 673983412:
                case 1929501934:
                    C3286.m9798();
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟֨") ^ i5;
                        i7 = ((iM45029 ^ i6) * 19115) ^ (-584747616);
                        i8 = 354325926;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܺ") ^ i5) * (-29);
                        i7 = ((iM45029 ^ i6) * (-13943)) ^ (-1150569371);
                        i8 = 475708444;
                    }
                    break;
                case 726750239:
                case 1987943678:
                    C1148.m4232();
                    C2871.m8646();
                    break;
                default:
                    f39454 = z;
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("ᩳܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-19015)) ^ (-2056036957);
                        i8 = -1127399567;
                    } else {
                        iM45029 = (C19806.m45029("ۚۚ") + i5) * (-93);
                        i7 = ((iM45029 ^ i6) * 11839) ^ (-1620502365);
                        i8 = 1929325915;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29338(ActivityC11736 activityC11736, int i, RunnableC19228 runnableC19228) {
        int i2 = -1122667094;
        int i3 = C2871.f10837;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11306 = ThreadFactoryC3888.m11306("ۘ֫") ^ i4;
        int i5 = ((iM11306 ^ i3) * 31149) ^ (-1948611358);
        int i6 = 364925747;
        while (true) {
            i2 = ((((i2 ^ i3) * (-8649)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1756834828:
                case 793895146:
                    runnableC19228.run();
                    C3535.m10422(activityC11736.f39456);
                    break;
                case -1598668171:
                case -213147407:
                    if (C3743.m10966() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۤܶ")) * 57;
                        i5 = ((iM11306 ^ i4) * (-8707)) ^ (-1434009444);
                        i6 = 1964972951;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۨ") ^ i4) * (-93);
                        i5 = ((iM11306 ^ i3) * 23269) ^ (-745497339);
                        i6 = 1113046120;
                    }
                    break;
                case -1570902531:
                case -165488888:
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("᩶ܽ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21379)) ^ (-896050042);
                        i6 = 199524960;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 13827) ^ (-654897272);
                        i6 = -1439232955;
                    }
                    break;
                case -1427788720:
                case -189921510:
                    if (!C2332.f8260) {
                        iM11306 = (i3 - C19806.m45029("ۚۗ")) * 73;
                        i5 = ((iM11306 ^ i4) * (-14833)) ^ 1871103667;
                        i6 = -1320306380;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 13827) ^ (-654897272);
                        i6 = -1439232955;
                    }
                    break;
                case -1372647327:
                case 264832786:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (C19806.m45029("ۗۧ") + i3) * (-19);
                        i5 = ((iM11306 ^ i4) * 15967) ^ (-1940096051);
                        i6 = 2084833651;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * 26919) ^ 942572371;
                        i6 = 2056746643;
                    }
                    break;
                case -1262313641:
                case 2036619645:
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("ۗۧ") + i3) * (-19);
                        i5 = ((iM11306 ^ i4) * 15967) ^ (-1940096051);
                        i6 = 2084833651;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܳۚ")) * 19;
                        i5 = ((iM11306 ^ i4) * (-22279)) ^ (-1852640981);
                        i6 = 929149890;
                    }
                    break;
                case -1216643917:
                case 202434768:
                    C1460.m5050();
                    iM11306 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                    i5 = ((iM11306 ^ i3) * 13827) ^ (-654897272);
                    i6 = -1439232955;
                    break;
                case -1098219965:
                case 188067766:
                    ThreadFactoryC3888.m11300();
                    break;
                case -1060782627:
                case -785900763:
                    if (C1377.m4833() != 0) {
                        iM11306 = (C19806.m45029("ۗۧ") + i3) * (-19);
                        i5 = ((iM11306 ^ i4) * 15967) ^ (-1940096051);
                        i6 = 2084833651;
                    } else {
                        iM11306 = (C19806.m45029("֫ۛ") + i4) * (-85);
                        i5 = ((iM11306 ^ i3) * 5929) ^ 884359097;
                        i6 = -1509653634;
                    }
                    break;
                case -1000712513:
                case 1670332631:
                    if (!C7105.m18985()) {
                        iM11306 = C19806.m45029("᩶ܽ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21379)) ^ (-896050042);
                        i6 = 199524960;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۤܶ")) * 57;
                        i5 = ((iM11306 ^ i4) * (-8707)) ^ (-1434009444);
                        i6 = 1964972951;
                    }
                    break;
                case -985728899:
                case 705894590:
                    break;
                case -850261692:
                case 33963607:
                    if (C19806.f63586) {
                        iM11306 = (i3 - C19806.m45029("ۚۗ")) * 73;
                        i5 = ((iM11306 ^ i4) * (-14833)) ^ 1871103667;
                        i6 = -1320306380;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9149) ^ (-1126681750);
                        i6 = 306624068;
                    }
                    break;
                case -796741631:
                case 1769876520:
                    if (C0962.f3784) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۤܶ")) * 57;
                        i5 = ((iM11306 ^ i4) * (-8707)) ^ (-1434009444);
                        i6 = 1964972951;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟᩹") + i3) * (-91);
                        i5 = ((iM11306 ^ i4) * 28105) ^ 272334338;
                        i6 = 1805467852;
                    }
                    break;
                case -610954325:
                case 1378320532:
                    if (i != activityC11736.f39460) {
                        iM11306 = (C19806.m45029("ۚۢ") ^ i4) * 59;
                        i5 = ((iM11306 ^ i3) * (-8291)) ^ 540700934;
                        i6 = 834055291;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ᩶") + i3) * (-11);
                        i5 = ((iM11306 ^ i4) * (-7281)) ^ (-836863493);
                        i6 = 1626707222;
                    }
                    break;
                case 145154041:
                case 866598852:
                    if (C2788.m8472() != 0) {
                        iM11306 = (C19806.m45029("ۗۧ") + i3) * (-19);
                        i5 = ((iM11306 ^ i4) * 15967) ^ (-1940096051);
                        i6 = 2084833651;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 31563) ^ (-1626748967);
                        i6 = -847313039;
                    }
                    break;
                case 1167536670:
                case 1889664541:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۚۗ")) * 73;
                        i5 = ((iM11306 ^ i4) * (-14833)) ^ 1871103667;
                        i6 = -1320306380;
                    } else {
                        iM11306 = C19806.m45029("ۘܳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18567) ^ (-401811811);
                        i6 = -1448865515;
                    }
                    break;
                case 1744674157:
                case 2140129789:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۚۗ")) * 73;
                        i5 = ((iM11306 ^ i4) * (-14833)) ^ 1871103667;
                        i6 = -1320306380;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3107)) ^ 946080243;
                        i6 = 1817388968;
                    }
                    break;
                default:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 13827) ^ (-654897272);
                        i6 = -1439232955;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ֨")) * 77;
                        i5 = ((iM11306 ^ i4) * 23709) ^ 155120902;
                        i6 = 24551565;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x0193  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29347(ActivityC11736 activityC11736, Runnable runnable) {
        int iM45029;
        int i;
        int i2 = 88485663;
        int i3 = C2477.f9839;
        int i4 = C1419.f5860;
        int iM11306 = ThreadFactoryC3888.m11306("֨᩷") ^ i4;
        int i5 = ((iM11306 ^ i3) * 30495) ^ 533037021;
        int i6 = 1532023932;
        while (true) {
            int i7 = iM11306 ^ i6;
            RunnableC18522 runnableC18522 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-23199)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2099752561:
                    case -79126088:
                        if (C1148.f5161 <= 0) {
                            iM45029 = (C19806.m45029("۟ܳ") + i4) * 59;
                            i5 = ((iM45029 ^ i3) * 27655) ^ 1380573234;
                            i = -1526989288;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩵᩸") ^ i4) * (-99);
                            i5 = ((iM45029 ^ i3) * (-971)) ^ 1484243716;
                            i = 1574981847;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -2064956695:
                    case -313279934:
                        if (C1398.m4895() > 0) {
                            runnableC18522 = new RunnableC18522(0, activityC11736, runnable);
                            if (C1025.m3861() <= 0) {
                                iM45029 = (C19806.m45029("᩶۫") ^ i3) * 21;
                                i5 = ((iM45029 ^ i4) * (-28781)) ^ (-409286187);
                                i = 1727839763;
                            } else {
                                iM45029 = C19806.m45029("ۙۨ") ^ i4;
                                i5 = ((iM45029 ^ i3) * 2815) ^ 1316898899;
                                i = -1476432286;
                            }
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case -1896868663:
                    case 1592670481:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            iM45029 = C19806.m45029("ܶۡ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 27129) ^ (-1785059465);
                            i = -1725747080;
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case -1729163006:
                    case -652565348:
                        if (C2249.f8050 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 11943) ^ 288445378;
                            i = 981240312;
                        } else {
                            iM45029 = (C19806.m45029("ܽ᩸") + i3) * (-23);
                            i5 = ((iM45029 ^ i4) * (-10907)) ^ 1361800648;
                            i = -1334212316;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1565278175:
                    case 1918876727:
                        activityC11736.f39457.stopScroll();
                        if (C1148.f5161 <= 0) {
                            iM45029 = (C19806.m45029("ܽ᩸") + i3) * (-23);
                            i5 = ((iM45029 ^ i4) * (-10907)) ^ 1361800648;
                            i = -1334212316;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 10241) ^ (-593934107);
                            i = 1979738121;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1549575438:
                    case 42954242:
                        if (activityC11736.f39457.isComputingLayout()) {
                            iM45029 = C19806.m45029("֫ᩳ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-11773)) ^ 697095651;
                            i = 638102936;
                        } else {
                            iM45029 = C19806.m45029("֫᩺") ^ i3;
                            i5 = ((iM45029 ^ i4) * 12985) ^ 1525592763;
                            i = 229272633;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1195995417:
                    case 1985488503:
                        if (C0797.f3386) {
                            iM45029 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 11943) ^ 288445378;
                            i = 981240312;
                        } else {
                            iM45029 = C19806.m45029("֨᩻") ^ i4;
                            i5 = ((iM45029 ^ i3) * 6089) ^ (-173337474);
                            i = -68863778;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1063764599:
                    case 1446601054:
                        activityC11736.f39457.post(runnableC18522);
                        break;
                    case -1012145482:
                    case 776337527:
                        if (C19806.f63586) {
                            iM45029 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 11943) ^ 288445378;
                            i = 981240312;
                        } else {
                            iM45029 = C19806.m45029("ܿܺ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-32203)) ^ 256820844;
                            i = -219565894;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -848106206:
                    case -270775637:
                        RunnableC0195.m1431();
                        RunnableC1606.m5473();
                        break;
                    case -670831926:
                    case 1543004117:
                        C2477.m7593();
                        if (C3722.f13525 <= 0) {
                        }
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11943) ^ 288445378;
                        i = 981240312;
                        i7 = iM45029 ^ i;
                        break;
                    case -253038138:
                    case 1390652644:
                        if (C3722.f13525 <= 0) {
                            iM45029 = (C19806.m45029("ܽ᩸") + i3) * (-23);
                            i5 = ((iM45029 ^ i4) * (-10907)) ^ 1361800648;
                            i = -1334212316;
                        } else {
                            iM45029 = (C19806.m45029("۟ܳ") + i4) * 59;
                            i5 = ((iM45029 ^ i3) * 27655) ^ 1380573234;
                            i = -1526989288;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 428028347:
                    case 1638353592:
                        C3660.m10791();
                        C2871.m8646();
                        break;
                    case 964917344:
                    case 2107351288:
                        runnableC18522.run();
                        break;
                    case 989841433:
                    case 1283710825:
                        if (C3286.f12186) {
                            iM45029 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 11943) ^ 288445378;
                            i = 981240312;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ܿۤ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 20691) ^ (-1054261613);
                            i = -930648180;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 1010526146:
                    case 1761134641:
                        if (C2788.m8472() != 0) {
                            iM45029 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 11943) ^ 288445378;
                            i = 981240312;
                        } else {
                            iM45029 = (i3 - C19806.m45029("ܺᩳ")) * 77;
                            i5 = ((iM45029 ^ i4) * (-3011)) ^ 291910781;
                            i = 1579338855;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        if (C7105.f23796 >= 0) {
                            iM45029 = (C19806.m45029("۟ܳ") + i4) * 59;
                            i5 = ((iM45029 ^ i3) * 27655) ^ 1380573234;
                            i = -1526989288;
                        } else {
                            iM45029 = (C19806.m45029("ۧᩳ") ^ i3) * (-61);
                            i5 = ((iM45029 ^ i4) * (-15357)) ^ (-368363553);
                            i = -1057816081;
                        }
                        i7 = iM45029 ^ i;
                        break;
                }
                return;
            }
            iM11306 = (i4 - C19806.m45029("֡۠")) * (-67);
            i5 = ((iM11306 ^ i3) * 7811) ^ (-1058572416);
            i6 = 248499540;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29341(ActivityC11736 activityC11736, String str, int i) {
        int iM29343 = 0;
        int i2 = -1581159195;
        int i3 = C7105.f23796;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = C19806.m45029("֨᩶") ^ i3;
        int i5 = ((iM45029 ^ i4) * 29551) ^ (-1556208294);
        int i6 = 1553481223;
        while (true) {
            i2 = ((((i2 ^ i4) * (-28153)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2133778990:
                case -2009314820:
                    ((C18419) C1419.m4967(activityC11736.f39458, iM29343)).m42714(i);
                    iM45029 = ThreadFactoryC3888.m11306("ܽۢ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-26569)) ^ 2094756977;
                    i6 = 1481816828;
                    break;
                case -2019958096:
                case 1313545850:
                    C1668.m5583();
                    if (C0216.m1591() > 0) {
                        iM45029 = (i3 - C19806.m45029("᩸ۤ")) * (-89);
                        i5 = ((iM45029 ^ i4) * (-241)) ^ 1678961634;
                        i6 = 1068109941;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2307)) ^ (-177207020);
                        i6 = 421073378;
                    }
                    break;
                case -1915670694:
                case -1238968680:
                    iM29343 = activityC11736.m29343(str);
                    if (iM29343 != -1) {
                        iM45029 = (C19806.m45029("۬᩵") + i3) * (-75);
                        i5 = ((iM45029 ^ i4) * (-10383)) ^ (-1317292555);
                        i6 = 1013458020;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-26569)) ^ 2094756977;
                        i6 = 1481816828;
                    }
                    break;
                case -1899361000:
                case -1684792512:
                    C1668.m5583();
                    iM45029 = ThreadFactoryC3888.m11306("۠ۡ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-2307)) ^ (-177207020);
                    i6 = 421073378;
                    break;
                case -1897753874:
                case 338555146:
                    if (CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩶") ^ i3) * q.h;
                        i5 = ((iM45029 ^ i4) * (-22767)) ^ 50472685;
                        i6 = 13100140;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2307)) ^ (-177207020);
                        i6 = 421073378;
                    }
                    break;
                case -1887004212:
                case -1233294948:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ۗܿ")) * (-81);
                        i5 = ((iM45029 ^ i3) * 16417) ^ (-1215879251);
                        i6 = -403904918;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩺") + i4) * (-13);
                        i5 = ((iM45029 ^ i3) * (-26105)) ^ 560973309;
                        i6 = -243556930;
                    }
                    break;
                case -1873719770:
                case -91688841:
                    C1419.m4973();
                    if (C2871.f10837 < 0) {
                        iM45029 = (C19806.m45029("֫ۖ") ^ i3) * (-33);
                        i5 = ((iM45029 ^ i4) * (-10829)) ^ (-742003465);
                        i6 = 1869038956;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩸ۤ")) * (-89);
                        i5 = ((iM45029 ^ i4) * (-241)) ^ 1678961634;
                        i6 = 1068109941;
                    }
                    break;
                case -1761828122:
                case 1941242322:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩸ۤ")) * (-89);
                        i5 = ((iM45029 ^ i4) * (-241)) ^ 1678961634;
                        i6 = 1068109941;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬᩸") ^ i4) * 43;
                        i5 = ((iM45029 ^ i3) * (-16423)) ^ 1383149020;
                        i6 = -99744860;
                    }
                    break;
                case -1270225493:
                case -580065530:
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2307)) ^ (-177207020);
                        i6 = 421073378;
                    } else {
                        iM45029 = (C19806.m45029("ۛۧ") ^ i3) * 27;
                        i5 = ((iM45029 ^ i4) * (-19353)) ^ (-1290961920);
                        i6 = -1469618724;
                    }
                    break;
                case -1262342895:
                case 1306372935:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ۗ֫") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i3) * 241) ^ 626424009;
                        i6 = -1385818816;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12477)) ^ 1926861526;
                        i6 = 714067880;
                    }
                    break;
                case -739269584:
                case 48755042:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = (C19806.m45029("֫ۖ") ^ i3) * (-33);
                        i5 = ((iM45029 ^ i4) * (-10829)) ^ (-742003465);
                        i6 = 1869038956;
                    } else {
                        iM45029 = C19806.m45029("ܿ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 23805) ^ (-1752125027);
                        i6 = -49295756;
                    }
                    break;
                case -521625105:
                case 1933803333:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩸ۤ")) * (-89);
                        i5 = ((iM45029 ^ i4) * (-241)) ^ 1678961634;
                        i6 = 1068109941;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-553)) ^ 689566455;
                        i6 = -2135178165;
                    }
                    break;
                case -419330643:
                case 1348403312:
                    C1398.m4895();
                    break;
                case -251894579:
                case 343386243:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩸ۤ")) * (-89);
                        i5 = ((iM45029 ^ i4) * (-241)) ^ 1678961634;
                        i6 = 1068109941;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-3407)) ^ (-865632511);
                        i6 = 455995725;
                    }
                    break;
                case 286560298:
                case 1168355876:
                    break;
                case 926068783:
                case 1918986024:
                    if (C2249.f8050 < 0) {
                        iM45029 = (C19806.m45029("ۗ֫") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i3) * 241) ^ 626424009;
                        i6 = -1385818816;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2307)) ^ (-177207020);
                        i6 = 421073378;
                    }
                    break;
                case 1297675123:
                case 1382549345:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (C19806.m45029("֫ۖ") ^ i3) * (-33);
                        i5 = ((iM45029 ^ i4) * (-10829)) ^ (-742003465);
                        i6 = 1869038956;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ᩵") ^ i3) * (-31);
                        i5 = ((iM45029 ^ i4) * (-13169)) ^ 1674891527;
                        i6 = -877496650;
                    }
                    break;
                default:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("ۗ֫") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i3) * 241) ^ 626424009;
                        i6 = -1385818816;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۠") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26765) ^ (-1079974559);
                        i6 = 1567352828;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29339(ActivityC11736 activityC11736, Runnable runnable) {
        int i = -483611923;
        int i2 = C1419.f5860;
        int i3 = C3660.f13403;
        int iM11306 = ThreadFactoryC3888.m11306("᩺ܰ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 2131) ^ 2035466930;
        int i5 = -689162949;
        while (true) {
            i = ((((i ^ i2) * (-6929)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1937236374:
                case 526457682:
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ۟") ^ i3) * 49;
                        i4 = ((iM11306 ^ i2) * (-25235)) ^ 1023222258;
                        i5 = -631828426;
                    } else {
                        iM11306 = (C19806.m45029("֫ܿ") ^ i3) * 73;
                        i4 = ((iM11306 ^ i2) * 1701) ^ 670219002;
                        i5 = 2128870329;
                    }
                    break;
                case -1860503791:
                case -483441732:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 18289) ^ (-587090413);
                        i5 = 1270389400;
                    } else {
                        iM11306 = C19806.m45029("ᩳܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18645)) ^ 2095153937;
                        i5 = -20211043;
                    }
                    break;
                case -1414383356:
                case 418284856:
                    if (C7105.m18985()) {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 18289) ^ (-587090413);
                        i5 = 1270389400;
                    } else {
                        iM11306 = (C19806.m45029("ᩴۖ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * (-12821)) ^ 1174374313;
                        i5 = -50032285;
                    }
                    break;
                case -1373155843:
                case 374649134:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ۟") ^ i3) * 49;
                        i4 = ((iM11306 ^ i2) * (-25235)) ^ 1023222258;
                        i5 = -631828426;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۡ᩸")) * (-55);
                        i4 = ((iM11306 ^ i3) * 15653) ^ (-1194342891);
                        i5 = -1949597686;
                    }
                    break;
                case -1283146422:
                case -341635428:
                    C1398.m4901(activityC11736.f39456);
                    break;
                case -1013414961:
                case 661552524:
                    C1977.m6365(runnable);
                    if (C3660.m10791() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺܳ") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * 10483) ^ (-1932813197);
                        i5 = 1483019092;
                    } else {
                        iM11306 = C19806.m45029("᩻۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24371)) ^ (-1528982961);
                        i5 = 1713868788;
                    }
                    break;
                case -784993591:
                case 1292884594:
                    if (!RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ۟") ^ i3) * 49;
                        i4 = ((iM11306 ^ i2) * (-25235)) ^ 1023222258;
                        i5 = -631828426;
                    } else {
                        iM11306 = (C19806.m45029("ܽ۬") ^ i2) * (-43);
                        i4 = ((iM11306 ^ i3) * 32365) ^ 1487577345;
                        i5 = 382719760;
                    }
                    break;
                case -764060898:
                case 509148166:
                    C0962.m3746();
                    C0526.m2437();
                    iM11306 = (C19806.m45029("ܽ۬") ^ i2) * (-43);
                    i4 = ((iM11306 ^ i3) * 32365) ^ 1487577345;
                    i5 = 382719760;
                    break;
                case -584321213:
                case 387177707:
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("ܽ۬") ^ i2) * (-43);
                        i4 = ((iM11306 ^ i3) * 32365) ^ 1487577345;
                        i5 = 382719760;
                    } else {
                        iM11306 = C19806.m45029("ۗ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7993) ^ 1617241382;
                        i5 = -1329560197;
                    }
                    break;
                case -582818651:
                case 1042987158:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-8263)) ^ 84195620;
                        i5 = 143336172;
                    } else {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 18289) ^ (-587090413);
                        i5 = 1270389400;
                    }
                    break;
                case -355989215:
                case 1094791054:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ܽ۬") ^ i2) * (-43);
                        i4 = ((iM11306 ^ i3) * 32365) ^ 1487577345;
                        i5 = 382719760;
                    } else {
                        iM11306 = (C19806.m45029("۫ۚ") ^ i2) * (-97);
                        i4 = ((iM11306 ^ i3) * (-31437)) ^ 1374394207;
                        i5 = -485680619;
                    }
                    break;
                case -318599682:
                case 1419620825:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (C19806.m45029("ܽ۬") ^ i2) * (-43);
                        i4 = ((iM11306 ^ i3) * 32365) ^ 1487577345;
                        i5 = 382719760;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ֨") ^ i3) * 31;
                        i4 = ((iM11306 ^ i2) * (-9019)) ^ (-1585697712);
                        i5 = -266921952;
                    }
                    break;
                case 188230153:
                case 1898288474:
                    C2332.m7079();
                    break;
                case 1212560484:
                case 1768325362:
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21661) ^ (-284762157);
                        i5 = 2115165884;
                    } else {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 18289) ^ (-587090413);
                        i5 = 1270389400;
                    }
                    break;
                case 1451599389:
                case 1769329422:
                    if (C1148.f5161 > 0) {
                        iM11306 = (C19806.m45029("ۘܿ") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 18289) ^ (-587090413);
                        i5 = 1270389400;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ۟") ^ i3) * 49;
                        i4 = ((iM11306 ^ i2) * (-25235)) ^ 1023222258;
                        i5 = -631828426;
                    }
                    break;
                default:
                    C0962.m3746();
                    if (C1066.f4915 > 0) {
                        iM11306 = (C19806.m45029("ܽ۬") ^ i2) * (-43);
                        i4 = ((iM11306 ^ i3) * 32365) ^ 1487577345;
                        i5 = 382719760;
                    } else {
                        iM11306 = (C19806.m45029("ۘܺ") ^ i3) * (-75);
                        i4 = ((iM11306 ^ i2) * (-651)) ^ 1160988096;
                        i5 = -1028431321;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m29343(String str) {
        ArrayList arrayList = null;
        int i = 0;
        C18419 c18419 = null;
        int i2 = 232562406;
        int i3 = AbstractC0464.f2088;
        int i4 = C2477.f9839;
        int iM11306 = ThreadFactoryC3888.m11306("ᩳۙ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 25965) ^ (-678387381);
        int i6 = 1137025774;
        while (true) {
            i2 = ((((i2 ^ i4) * (-2293)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2142168283:
                case 1600268540:
                    if (C1025.m3861() <= 0) {
                        iM11306 = C19806.m45029("۠ۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-4425)) ^ 2078849940;
                        i6 = 605353302;
                    } else {
                        iM11306 = (C19806.m45029("ܿۤ") ^ i4) * 55;
                        i5 = ((iM11306 ^ i3) * (-32351)) ^ (-486310669);
                        i6 = -1883894548;
                    }
                    break;
                case -2031197960:
                case -1795071727:
                    if (C2124.m6673() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-13619)) ^ 826003538;
                        i6 = 1795540329;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19029) ^ (-2093114615);
                        i6 = -1514953201;
                    }
                    break;
                case -1993763644:
                case -1918091302:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("۬᩶") ^ i3) * (-25);
                        i5 = ((iM11306 ^ i4) * (-2581)) ^ (-2051573987);
                        i6 = 123135488;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۢ᩵")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM11306 ^ i4) * 16061) ^ 837486734;
                        i6 = -1813955817;
                    }
                    break;
                case -1865824509:
                case -439084769:
                    if (C1875.f7103 >= 0) {
                        iM11306 = C19806.m45029("۠ۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-4425)) ^ 2078849940;
                        i6 = 605353302;
                    } else {
                        iM11306 = C19806.m45029("۬֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-4083)) ^ (-757983899);
                        i6 = -1282715423;
                    }
                    break;
                case -1848161860:
                case 1562174058:
                    i++;
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵ۚ")) * 61;
                    i5 = ((iM11306 ^ i4) * 13999) ^ (-229217566);
                    i6 = 440656662;
                    break;
                case -1772695946:
                case -508348125:
                    c18419 = (C18419) C3286.m9796(arrayList, i);
                    if (C2704.m8255() <= 0) {
                        iM11306 = (C19806.m45029("ܰ۠") + i3) * (-67);
                        i5 = ((iM11306 ^ i4) * 24593) ^ 188847464;
                        i6 = -272280580;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۛ") ^ i3) * 75;
                        i5 = ((iM11306 ^ i4) * 6893) ^ (-1291806462);
                        i6 = 1585678656;
                    }
                    break;
                case -1168757705:
                case 421415824:
                    if (C1460.m5058(str, C7105.m18987(c18419))) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 2253) ^ 2039527059;
                        i6 = 648502722;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-12551)) ^ (-1472357982);
                        i6 = -505085553;
                    }
                    break;
                case -1129055293:
                case 1665891668:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ᩴۡ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-4227)) ^ 566962989;
                        i6 = 1101838011;
                    } else {
                        iM11306 = (C19806.m45029("ۡܽ") ^ i3) * (-21);
                        i5 = ((iM11306 ^ i4) * (-31915)) ^ (-1574819350);
                        i6 = 1069296300;
                    }
                    break;
                case -918632882:
                case 1452705707:
                    return i;
                case -707064304:
                case -36558053:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (C19806.m45029("ܰ۠") + i3) * (-67);
                        i5 = ((iM11306 ^ i4) * 24593) ^ 188847464;
                        i6 = -272280580;
                    } else {
                        iM11306 = (C19806.m45029("ۙ᩵") + i4) * 57;
                        i5 = ((iM11306 ^ i3) * 13269) ^ (-215932278);
                        i6 = -698067790;
                    }
                    break;
                case -337036294:
                case -328832018:
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("ᩴۡ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-4227)) ^ 566962989;
                        i6 = 1101838011;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۛ") + i4) * (-93);
                        i5 = ((iM11306 ^ i3) * (-13981)) ^ (-538896656);
                        i6 = 1402317182;
                    }
                    break;
                case -239643366:
                case 2088147337:
                    C19806.m45024();
                    C2642.m8171();
                    iM11306 = (C19806.m45029("۬᩶") ^ i3) * (-25);
                    i5 = ((iM11306 ^ i4) * (-2581)) ^ (-2051573987);
                    i6 = 123135488;
                    break;
                case -138675749:
                case 1855353902:
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("۠ۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-4425)) ^ 2078849940;
                        i6 = 605353302;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ۟") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-22525)) ^ 329423155;
                        i6 = -863885720;
                    }
                    break;
                case 151663073:
                case 1496433563:
                    C1066.m4023();
                    C3535.m10431();
                    return 0;
                case 344160012:
                case 1526198562:
                    arrayList = this.f39458;
                    if (i < C0050.m938(arrayList)) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1575) ^ 1870967663;
                        i6 = -1177454597;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-1365)) ^ (-1332236557);
                        i6 = 1344532725;
                    }
                    break;
                case 456653047:
                case 1630550144:
                    C1977.m6356();
                    if (!C0526.f2219) {
                        iM11306 = (C19806.m45029("۬᩶") ^ i3) * (-25);
                        i5 = ((iM11306 ^ i4) * (-2581)) ^ (-2051573987);
                        i6 = 123135488;
                    } else {
                        iM11306 = C19806.m45029("۠ۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-4425)) ^ 2078849940;
                        i6 = 605353302;
                    }
                    break;
                case 538057128:
                case 1811712037:
                    return -1;
                case 763094632:
                case 829269603:
                    i = 0;
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵ۚ")) * 61;
                    i5 = ((iM11306 ^ i4) * 13999) ^ (-229217566);
                    i6 = 440656662;
                    break;
                case 832473784:
                case 1178807553:
                    C7105.m18985();
                    if (!C3743.f13569) {
                        iM11306 = (C19806.m45029("۬᩶") ^ i3) * (-25);
                        i5 = ((iM11306 ^ i4) * (-2581)) ^ (-2051573987);
                        i6 = 123135488;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-13619)) ^ 826003538;
                        i6 = 1795540329;
                    }
                    break;
                case 841523271:
                case 1589976970:
                    C0671.m3008();
                    if (!RunnableC0195.m1431()) {
                        iM11306 = C19806.m45029("ᩴۡ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-4227)) ^ 566962989;
                        i6 = 1101838011;
                    } else {
                        iM11306 = C19806.m45029("۠ۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-4425)) ^ 2078849940;
                        i6 = 605353302;
                    }
                    break;
                default:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("۟۟") ^ i4) * (-83);
                        i5 = ((iM11306 ^ i3) * (-5873)) ^ 719298977;
                        i6 = 385663154;
                    } else {
                        iM11306 = (C19806.m45029("ܰ۠") + i3) * (-67);
                        i5 = ((iM11306 ^ i4) * 24593) ^ 188847464;
                        i6 = -272280580;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m29348(ActivityC11736 activityC11736) {
        int iM45029;
        int i;
        int i2 = -2114746462;
        int i3 = C0050.f912;
        int i4 = C3660.f13403;
        int iM450210 = C19806.m45029("ܰۗ") ^ i4;
        int i5 = ((iM450210 ^ i3) * (-22357)) ^ (-471666884);
        int i6 = -789044397;
        while (true) {
            int i7 = iM450210 ^ i6;
            RunnableC12918 runnableC12918 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-17307)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2049199322:
                    case 1196877751:
                        if (C3577.f13150 < 0) {
                            if (C2871.m8646()) {
                                if (C3286.m9798() > 0) {
                                    if (C2871.f10837 >= 0) {
                                        iM450210 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i4;
                                        i5 = ((iM450210 ^ i3) * 12537) ^ (-622992879);
                                        i6 = -1715355199;
                                        break;
                                    } else if (C1189.f5284 > 0) {
                                        if (RunnableC0195.m1431()) {
                                            if (C0962.m3746() < 0) {
                                                int i8 = 3;
                                                if (!C0962.f3784) {
                                                    runnableC12918 = new RunnableC12918(i8, activityC11736);
                                                    if (C1398.f5802 > 0) {
                                                        iM45029 = C19806.m45029("᩶ۜ") ^ i4;
                                                        i5 = ((iM45029 ^ i3) * 19761) ^ 840872863;
                                                        i = -838739582;
                                                        i7 = iM45029 ^ i;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                iM450210 = (C19806.m45029("۬ᩴ") ^ i3) * (-101);
                                i5 = ((iM450210 ^ i4) * (-13123)) ^ 1072515196;
                                i6 = -1780738722;
                                break;
                            }
                            iM450210 = C19806.m45029("֡ۢ") ^ i3;
                            i5 = ((iM450210 ^ i4) * (-14967)) ^ 1162233947;
                            i6 = -780021833;
                            break;
                        }
                        iM450210 = (C19806.m45029("ۢ᩹") + i3) * (-93);
                        i5 = ((iM450210 ^ i4) * (-25399)) ^ 2091427677;
                        i6 = 531191255;
                        break;
                    case -1963682039:
                    case 1721273879:
                        C2871.m8646();
                        break;
                    case -1649679563:
                    case -762164697:
                        if (C0050.m946() <= 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i4;
                            i5 = ((iM450210 ^ i3) * 12537) ^ (-622992879);
                            i6 = -1715355199;
                        } else {
                            iM450210 = (C19806.m45029("۬ᩴ") ^ i3) * (-101);
                            i5 = ((iM450210 ^ i4) * (-13123)) ^ 1072515196;
                            i6 = -1780738722;
                        }
                        break;
                    case -1395848482:
                    case 1504494567:
                        activityC11736.f39457.stopScroll();
                        if (C1668.f6641 < 0) {
                            iM45029 = (C19806.m45029("ۙܰ") + i3) * (-89);
                            i5 = ((iM45029 ^ i4) * (-28977)) ^ (-1592281702);
                            i = -1955704353;
                            i7 = iM45029 ^ i;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i4;
                            i5 = ((iM450210 ^ i3) * 12537) ^ (-622992879);
                            i6 = -1715355199;
                        }
                        break;
                    case -614534221:
                    case 1460672565:
                        runnableC12918.run();
                        break;
                    case -243631997:
                    case 1448454497:
                        if (C3660.f13403 >= 0) {
                            iM450210 = C19806.m45029("֡ۢ") ^ i3;
                            i5 = ((iM450210 ^ i4) * (-14967)) ^ 1162233947;
                            i6 = -780021833;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i4;
                            i5 = ((iM450210 ^ i3) * 12537) ^ (-622992879);
                            i6 = -1715355199;
                        }
                        break;
                    case 242014807:
                    case 1005775755:
                        C2124.m6673();
                        C1977.m6356();
                        iM450210 = (C19806.m45029("۬ᩴ") ^ i3) * (-101);
                        i5 = ((iM450210 ^ i4) * (-13123)) ^ 1072515196;
                        i6 = -1780738722;
                        break;
                    case 260727401:
                    case 854191592:
                        if (activityC11736.f39457.isComputingLayout()) {
                            iM45029 = (C19806.m45029("۠ۛ") + i3) * 81;
                            i5 = ((iM45029 ^ i4) * (-13551)) ^ 430166760;
                            i = -1897610193;
                        } else {
                            iM45029 = (C19806.m45029("ܺܶ") + i4) * 119;
                            i5 = ((iM45029 ^ i3) * 13803) ^ (-2036826808);
                            i = -716379332;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 458330289:
                    case 1267180217:
                        C3722.m10894();
                        if (C2788.f10625 < 0) {
                            iM45029 = (C19806.m45029("ۢܶ") ^ i4) * 15;
                            i5 = ((iM45029 ^ i3) * (-19395)) ^ (-1740029200);
                            i = 305833754;
                            i7 = iM45029 ^ i;
                        } else {
                            iM450210 = C19806.m45029("֡ۢ") ^ i3;
                            i5 = ((iM450210 ^ i4) * (-14967)) ^ 1162233947;
                            i6 = -780021833;
                        }
                        break;
                    default:
                        activityC11736.f39457.post(runnableC12918);
                        break;
                }
                return;
            }
        }
    }
}
