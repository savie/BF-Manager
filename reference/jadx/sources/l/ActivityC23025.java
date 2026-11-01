package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩺ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 72SJ */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23025 extends AbstractActivityC12483 implements TextWatcher {

    /* JADX INFO: renamed from: ۨ᩶ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f74820 = {9804, -4295, 5492, -3944, 2508, 242, 4630, -4157, 6030, -1213, -32198, -32218, -32193, -32211, -32221, -32220, -32253, -32210, -32220, -32213, -32217, -32209, -32253, -32220, -32194, -32209, -32220, -32194, -32150, -32209, -32200, -32200, -32219, -32200, -9722, -9926, -4718, -10390, -7868, -8333, -2868, 2044, 4385, 3620, -8467, -4831, 4334, 19998, 17789, 17342, -21631, 19281, -21395, 4622, 3778, -3018, 3795, 4332, -3808, -11818, -2690, -1563, 7931, -31243, -31244, -31241, 4412, 12666, 12635, 12616, 12635, 12626, 12625, 12622, 12635, 12620, 12667, 12634, 12631, 12618, 12671, 12637, 12618, 12631, 12616, 12631, 12618, 12615};

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74821 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public View f74822;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public View f74823;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public String f74824;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f74825;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public TabLayout f74826;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74827;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public C19383 f74828;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public long f74829;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74830;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -1393166531;
        int i5 = C1419.f5860;
        int i6 = C3577.f13150;
        int iM11306 = (i6 - ThreadFactoryC3888.m11306("۬ۜ")) * (-53);
        int i7 = ((iM11306 ^ i5) * (-7437)) ^ 1883836870;
        int i8 = -1349737223;
        while (true) {
            i4 = ((((i4 ^ i5) * (-18653)) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2105777101:
                case -733591509:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۛۜ")) * (-3);
                        i7 = ((iM11306 ^ i6) * 17981) ^ 648735032;
                        i8 = -510952403;
                    } else {
                        iM11306 = C19806.m45029("᩷֫") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-12057)) ^ 1355896706;
                        i8 = -136441087;
                    }
                    break;
                case -2093858223:
                case 112289208:
                    break;
                case -1958029970:
                case -1633089128:
                    C1419.m4973();
                    if (C0671.f2816 == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-30543)) ^ (-1522603736);
                        i8 = 1093556492;
                    } else {
                        iM11306 = (C19806.m45029("ۧ֫") ^ i6) * 93;
                        i7 = ((iM11306 ^ i5) * (-31795)) ^ (-1630822232);
                        i8 = -267121984;
                    }
                    break;
                case -1697244613:
                case 1955482947:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-30543)) ^ (-1522603736);
                        i8 = 1093556492;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ܶܺ")) * (-53);
                        i7 = ((iM11306 ^ i6) * (-23443)) ^ 279167510;
                        i8 = 1950149577;
                    }
                    break;
                case -1305396325:
                case -350799904:
                    if (C0216.f1393 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩴ") + i5) * 51;
                        i7 = ((iM11306 ^ i6) * (-20785)) ^ (-91168951);
                        i8 = 1587690158;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩷") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM11306 ^ i5) * 22381) ^ (-315672945);
                        i8 = 1622266020;
                    }
                    break;
                case -894598449:
                case 1829792582:
                    if (C2788.m8472() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩴ") + i5) * 51;
                        i7 = ((iM11306 ^ i6) * (-20785)) ^ (-91168951);
                        i8 = 1587690158;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("᩹ܳ")) * (-105);
                        i7 = ((iM11306 ^ i6) * 27659) ^ (-1175374070);
                        i8 = -2072059145;
                    }
                    break;
                case -813818784:
                case 1207731574:
                    RunnableC3388.m10064();
                    if (!C0797.m3359()) {
                        iM11306 = (C19806.m45029("ۧ֫") ^ i6) * 93;
                        i7 = ((iM11306 ^ i5) * (-31795)) ^ (-1630822232);
                        i8 = -267121984;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۛۜ")) * (-3);
                        i7 = ((iM11306 ^ i6) * 17981) ^ 648735032;
                        i8 = -510952403;
                    }
                    break;
                case -776775002:
                case 48047226:
                    C1461.m5080();
                    C0797.m3359();
                    iM11306 = (C19806.m45029("ۧ֫") ^ i6) * 93;
                    i7 = ((iM11306 ^ i5) * (-31795)) ^ (-1630822232);
                    i8 = -267121984;
                    break;
                case -605820116:
                case 97606462:
                    RunnableC1564.m5345();
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩴ") + i5) * 51;
                        i7 = ((iM11306 ^ i6) * (-20785)) ^ (-91168951);
                        i8 = 1587690158;
                    } else {
                        iM11306 = (C19806.m45029("ۧ֫") ^ i6) * 93;
                        i7 = ((iM11306 ^ i5) * (-31795)) ^ (-1630822232);
                        i8 = -267121984;
                    }
                    break;
                case -512003857:
                case 114469742:
                    if (C2332.f8260) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۢܳ")) * 91;
                        i7 = ((iM11306 ^ i6) * (-2805)) ^ (-2142657697);
                        i8 = -1201317331;
                    } else {
                        iM11306 = (C19806.m45029("۠ܿ") ^ i6) * (-107);
                        i7 = ((iM11306 ^ i5) * 21887) ^ (-567943572);
                        i8 = 200439178;
                    }
                    break;
                case -422491241:
                case 945415084:
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-30543)) ^ (-1522603736);
                        i8 = 1093556492;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۡ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-17315)) ^ 2130445869;
                        i8 = 1784526976;
                    }
                    break;
                case -408859103:
                case 1475456254:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-30543)) ^ (-1522603736);
                        i8 = 1093556492;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۨ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 1189) ^ (-1075742436);
                        i8 = 1474091988;
                    }
                    break;
                case -258990238:
                case 907285623:
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("۠ܿ") ^ i6) * (-107);
                        i7 = ((iM11306 ^ i5) * 21887) ^ (-567943572);
                        i8 = 200439178;
                    } else {
                        iM11306 = (C19806.m45029("᩸ܿ") + i6) * (-27);
                        i7 = ((iM11306 ^ i5) * 3471) ^ (-620590544);
                        i8 = 919906681;
                    }
                    break;
                case 1271197460:
                case 1351426969:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("۠ܿ") ^ i6) * (-107);
                        i7 = ((iM11306 ^ i5) * 21887) ^ (-567943572);
                        i8 = 200439178;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۙ") + i5) * (-85);
                        i7 = ((iM11306 ^ i6) * (-3443)) ^ 457320635;
                        i8 = 377177841;
                    }
                    break;
                case 1545845240:
                case 2004922111:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩴ") + i5) * 51;
                        i7 = ((iM11306 ^ i6) * (-20785)) ^ (-91168951);
                        i8 = 1587690158;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۟") ^ i6) * (-87);
                        i7 = ((iM11306 ^ i5) * 16495) ^ 920686026;
                        i8 = 1657561073;
                    }
                    break;
                default:
                    AbstractC0464.m2313();
                    ThreadFactoryC3888.m11300();
                    break;
            }
            return;
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
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -713663022;
        int i7 = C3722.f13525;
        int i8 = C7105.f23796;
        int iM45029 = C19806.m45029("ܺ᩵") ^ i7;
        int i9 = ((iM45029 ^ i8) * (-30717)) ^ (-179992647);
        int i10 = 324931326;
        while (true) {
            i6 = ((((i6 ^ i8) * 13047) >> 31) & i9) ^ (iM45029 ^ i10);
            switch (i6) {
                case -1626388125:
                case -1058549129:
                    if (C1461.m5080()) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܶ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-21925)) ^ 101878254;
                        i10 = 1030230978;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩶") + i7) * 81;
                        i9 = ((iM45029 ^ i8) * 29575) ^ 1264126351;
                        i10 = -666120827;
                    }
                    break;
                case -1589576524:
                case 1062587404:
                    if (i2 - (i3 + 1) >= 0) {
                        iM45029 = C19806.m45029("᩹ۙ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-28213)) ^ (-1890690103);
                        i10 = -194507466;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۤ") + i8) * 69;
                        i9 = ((iM45029 ^ i7) * (-16955)) ^ 531170021;
                        i10 = 1796955803;
                    }
                    break;
                case -1588537178:
                case 1737878005:
                    i3 = s * s2;
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("ۜ۟") + i8) * (-19);
                        i9 = ((iM45029 ^ i7) * 5747) ^ 1251138920;
                        i10 = -1794856998;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩸᩷")) * (-117);
                        i9 = ((iM45029 ^ i8) * (-15893)) ^ 1423805818;
                        i10 = 2140368733;
                    }
                    break;
                case -1402271879:
                case -1240791945:
                    if (!RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("ۜ۟") + i8) * (-19);
                        i9 = ((iM45029 ^ i7) * 5747) ^ 1251138920;
                        i10 = -1794856998;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-21963)) ^ 634187367;
                        i10 = -1279499615;
                    }
                    break;
                case -1364962723:
                case -228257696:
                    RunnableC3388.m10064();
                    C3722.m10894();
                    iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i8;
                    i9 = ((iM45029 ^ i7) * (-21963)) ^ 634187367;
                    i10 = -1279499615;
                    break;
                case -1122894929:
                case 1186698830:
                    return C0962.m3747(sArr2, i5, 21, i4);
                case -921480032:
                case 2044254262:
                    C0817.m3399();
                    return null;
                case -826793507:
                case -485510754:
                    i = s + 1;
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܶ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-21925)) ^ 101878254;
                        i10 = 1030230978;
                    } else {
                        iM45029 = C19806.m45029("֡ܺ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-7301)) ^ 1118709328;
                        i10 = 845081418;
                    }
                    break;
                case -635714284:
                case -455536733:
                    sArr2 = f74820;
                    i5 = 67;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩸") + i7) * 69;
                        i9 = ((iM45029 ^ i8) * 27881) ^ (-212041225);
                        i10 = -1243482040;
                    } else {
                        iM45029 = (C19806.m45029("ܿۙ") + i7) * 95;
                        i9 = ((iM45029 ^ i8) * (-30673)) ^ 1092746860;
                        i10 = -1399376286;
                    }
                    break;
                case -465626237:
                case 404132269:
                    RunnableC1606.m5473();
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 27175) ^ (-251365416);
                        i10 = 2087480215;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩸") + i7) * 69;
                        i9 = ((iM45029 ^ i8) * 27881) ^ (-212041225);
                        i10 = -1243482040;
                    }
                    break;
                case -430080056:
                case 1018626368:
                    i4 = 9257;
                    iM45029 = ThreadFactoryC3888.m11306("۫᩺") ^ i7;
                    i9 = ((iM45029 ^ i8) * (-10381)) ^ 424394009;
                    i10 = -10157535;
                    break;
                case -130413604:
                case 1830156296:
                    i2 = i * i;
                    s2 = 2;
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 27175) ^ (-251365416);
                        i10 = 2087480215;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۖ") + i7) * (-119);
                        i9 = ((iM45029 ^ i8) * 20465) ^ (-371538480);
                        i10 = 830698042;
                    }
                    break;
                case -42826640:
                case 125230282:
                    s = sArr[c];
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩸") + i7) * 69;
                        i9 = ((iM45029 ^ i8) * 27881) ^ (-212041225);
                        i10 = -1243482040;
                    } else {
                        iM45029 = (i8 - C19806.m45029("ܽۢ")) * (-7);
                        i9 = ((iM45029 ^ i7) * (-8137)) ^ 1559604355;
                        i10 = -1807200508;
                    }
                    break;
                case 91243403:
                case 752167779:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("᩶᩶") ^ i8;
                        i9 = ((iM45029 ^ i7) * 8983) ^ (-330439760);
                        i10 = -31462399;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-21963)) ^ 634187367;
                        i10 = -1279499615;
                    }
                    break;
                case 705760407:
                case 1041195929:
                    i4 = 12606;
                    iM45029 = ThreadFactoryC3888.m11306("۫᩺") ^ i7;
                    i9 = ((iM45029 ^ i8) * (-10381)) ^ 424394009;
                    i10 = -10157535;
                    break;
                case 880343022:
                case 880485277:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (C19806.m45029("ۜ۟") + i8) * (-19);
                        i9 = ((iM45029 ^ i7) * 5747) ^ 1251138920;
                        i10 = -1794856998;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۙ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 4189) ^ (-1122776585);
                        i10 = 1756186945;
                    }
                    break;
                case 1305712708:
                case 1948578545:
                    c = 'B';
                    if (C1875.f7103 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩸") + i7) * 69;
                        i9 = ((iM45029 ^ i8) * 27881) ^ (-212041225);
                        i10 = -1243482040;
                    } else {
                        iM45029 = C19806.m45029("᩻ᩳ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-32471)) ^ 928720143;
                        i10 = 571188296;
                    }
                    break;
                case 1378192968:
                case 1870251280:
                    if (C1875.f7103 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩸") + i7) * 69;
                        i9 = ((iM45029 ^ i8) * 27881) ^ (-212041225);
                        i10 = -1243482040;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-21963)) ^ 634187367;
                        i10 = -1279499615;
                    }
                    break;
                default:
                    sArr = f74820;
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 27175) ^ (-251365416);
                        i10 = 2087480215;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۡ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 30099) ^ (-622983184);
                        i10 = 176380833;
                    }
                    break;
            }
        }
    }

    public ActivityC23025() {
        ArrayList arrayList = null;
        int i = 201955468;
        int i2 = C0050.f912;
        int i3 = C1875.f7103;
        int iM45029 = C19806.m45029("ܳܳ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-5445)) ^ (-1961901869);
        int i5 = -271235632;
        while (true) {
            i = ((((i ^ i3) * (-261)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1655903462:
                case -1543554477:
                    arrayList = new ArrayList();
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22693) ^ (-570472408);
                        i5 = 1019783282;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܽ") + i2) * 83;
                        i4 = ((iM45029 ^ i3) * 10203) ^ (-1298387427);
                        i5 = -1573572592;
                    }
                    break;
                case -1589349601:
                case -1012504943:
                    RunnableC3388.m10064();
                    throw new RuntimeException();
                case -1509304999:
                case -316793875:
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27043) ^ (-1570251755);
                        i5 = 1613427832;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۠") + i3) * 31;
                        i4 = ((iM45029 ^ i2) * 14135) ^ (-2088871999);
                        i5 = 1830977553;
                    }
                    break;
                case -1496600048:
                case 662058620:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۙ") ^ i2) * (-9);
                        i4 = ((iM45029 ^ i3) * (-24885)) ^ (-25182442);
                        i5 = -1510843005;
                    } else {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3587) ^ 1999473985;
                        i5 = -853778969;
                    }
                    break;
                case -1401870912:
                case 2002449409:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("᩵᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24183) ^ (-1501831509);
                        i5 = -1743319369;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22693) ^ (-570472408);
                        i5 = 1019783282;
                    }
                    break;
                case -1203509932:
                case 283726735:
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27043) ^ (-1570251755);
                        i5 = 1613427832;
                    } else {
                        iM45029 = C19806.m45029("ۙ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2021) ^ (-194370998);
                        i5 = 940440908;
                    }
                    break;
                case -1077265259:
                case 372158255:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۡ") + i2) * 47;
                        i4 = ((iM45029 ^ i3) * 13301) ^ 177566490;
                        i5 = 902989988;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27043) ^ (-1570251755);
                        i5 = 1613427832;
                    }
                    break;
                case -910654245:
                case 1117896251:
                    this.f74825 = arrayList;
                    return;
                case -751042466:
                case 471187585:
                    if (C1668.m5583()) {
                        iM45029 = (C19806.m45029("ۗۙ") ^ i2) * 9;
                        i4 = ((iM45029 ^ i3) * (-21293)) ^ (-641980698);
                        i5 = -934489933;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27043) ^ (-1570251755);
                        i5 = 1613427832;
                    }
                    break;
                case -671543627:
                case 407000233:
                    C1419.m4973();
                    C2249.m6915();
                    iM45029 = C19806.m45029("֡ۤ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 32247) ^ (-339674907);
                    i5 = -311533665;
                    break;
                case -551121812:
                case -143526276:
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22693) ^ (-570472408);
                        i5 = 1019783282;
                    } else {
                        iM45029 = C19806.m45029("֡ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32247) ^ (-339674907);
                        i5 = -311533665;
                    }
                    break;
                case 105002604:
                case 2043739941:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("֡۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22693) ^ (-570472408);
                        i5 = 1019783282;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۙ") ^ i2) * (-9);
                        i4 = ((iM45029 ^ i3) * (-24885)) ^ (-25182442);
                        i5 = -1510843005;
                    }
                    break;
                case 294413235:
                case 1931826106:
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֨") ^ i2) * (-109);
                        i4 = ((iM45029 ^ i3) * 19699) ^ (-420174080);
                        i5 = -1250649035;
                    } else {
                        iM45029 = C19806.m45029("֡ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32247) ^ (-339674907);
                        i5 = -311533665;
                    }
                    break;
                case 536640597:
                case 640578956:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25475)) ^ (-1912041249);
                        i5 = -1830627576;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܺ") + i2) * 45;
                        i4 = ((iM45029 ^ i3) * (-13559)) ^ (-1337521257);
                        i5 = -1900292725;
                    }
                    break;
                case 693215856:
                case 1697680314:
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۙ") ^ i2) * (-9);
                        i4 = ((iM45029 ^ i3) * (-24885)) ^ (-25182442);
                        i5 = -1510843005;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩻ܶ")) * 61;
                        i4 = ((iM45029 ^ i2) * (-7319)) ^ (-1050272240);
                        i5 = -1516406774;
                    }
                    break;
                default:
                    C0629.m2907();
                    if (!C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۙ") ^ i2) * (-9);
                        i4 = ((iM45029 ^ i3) * (-24885)) ^ (-25182442);
                        i5 = -1510843005;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25475)) ^ (-1912041249);
                        i5 = -1830627576;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0272 A[PHI: r1 r2 r3 r9 r10 r11 r12
      0x0272: PHI (r1v28 android.view.View) = (r1v24 android.view.View), (r1v25 android.view.View), (r1v32 android.view.View) binds: [B:46:0x0270, B:42:0x0240, B:6:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r2v3 int) = (r2v2 int), (r2v2 int), (r2v9 int) binds: [B:46:0x0270, B:42:0x0240, B:6:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r3v17 l.ᩴۛ᩹) = (r3v13 l.ᩴۛ᩹), (r3v14 l.ᩴۛ᩹), (r3v21 l.ᩴۛ᩹) binds: [B:46:0x0270, B:42:0x0240, B:6:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r9v4 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:46:0x0270, B:42:0x0240, B:6:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v7 short[]) binds: [B:46:0x0270, B:42:0x0240, B:6:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v7 int) binds: [B:46:0x0270, B:42:0x0240, B:6:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r12v5 int) = (r12v4 int), (r12v2 int), (r12v2 int) binds: [B:46:0x0270, B:42:0x0240, B:6:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e9, code lost:
    
        if (l.ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) goto L15;
     */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instruction units count: 1784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC23025.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f5 A[PHI: r7
      0x00f5: PHI (r7v5 l.ۗ֫ۖ) = (r7v4 l.ۗ֫ۖ), (r7v2 l.ۗ֫ۖ) binds: [B:36:0x00f3, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x018a A[PHI: r5 r8 r15
      0x018a: PHI (r5v4 l.ۧۧۖ) = (r5v3 l.ۧۧۖ), (r5v2 l.ۧۧۖ), (r5v2 l.ۧۧۖ) binds: [B:51:0x0188, B:32:0x00d2, B:13:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x018a: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v3 java.lang.String), (r8v2 java.lang.String) binds: [B:51:0x0188, B:32:0x00d2, B:13:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x018a: PHI (r15v8 l.᩻ۖۘ) = (r15v5 l.᩻ۖۘ), (r15v4 l.᩻ۖۘ), (r15v4 l.᩻ۖۘ) binds: [B:51:0x0188, B:32:0x00d2, B:13:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x027b  */
    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        int iM11306;
        int i;
        C10700 c10700 = null;
        Iterator itM10563 = null;
        C6796 c6796 = null;
        C10948 c10948 = null;
        String strM3407 = null;
        InterfaceC2916 interfaceC2916M10961 = null;
        String strM6674 = null;
        String strM13716 = null;
        int i2 = 1507446389;
        int i3 = C3535.f13026;
        int i4 = C0278.f1572;
        int iM45029 = (C19806.m45029("ۘᩳ") ^ i3) * 31;
        int i5 = ((iM45029 ^ i4) * (-21475)) ^ 1280095127;
        int i6 = 147762060;
        while (true) {
            int i7 = iM45029 ^ i6;
            C23400 c23400 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 18975) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2118429485:
                    case -504110758:
                        interfaceC2916M10961 = C3743.m10961(c6796.f22940);
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩺ۘ") + i4) * 23;
                            i5 = ((iM11306 ^ i3) * 7881) ^ 777804172;
                            i = -44986865;
                        } else {
                            iM11306 = C19806.m45029("᩺֡") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-1213)) ^ 1894997290;
                            i = -2141316819;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -2044041411:
                    case -475411215:
                        C2871.m8646();
                        break;
                    case -1970490170:
                    case -193247527:
                        break;
                    case -1941485768:
                    case -21018271:
                        C3722.m10891(c10700.f36512, strM13716, c23400);
                        iM11306 = (C19806.m45029("ܰ֫") + i4) * (-51);
                        i5 = ((iM11306 ^ i3) * 14845) ^ 1142529413;
                        i = -131840828;
                        i7 = iM11306 ^ i;
                        break;
                    case -1871540896:
                    case 314202879:
                        strM13716 = c6796.f22939.m13716();
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                            iM11306 = C19806.m45029("ܶۘ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-10937)) ^ (-2074225041);
                            i = -1587571940;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1739210981:
                    case -68723646:
                        C1668.m5583();
                        if (C2332.f8260) {
                            iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i4;
                            i5 = ((iM11306 ^ i3) * 29971) ^ 1737018524;
                            i = -829472843;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩺ۘ") + i4) * 23;
                            i5 = ((iM11306 ^ i3) * 7881) ^ 777804172;
                            i = -44986865;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1690231549:
                    case -1131042636:
                        c6796 = (C6796) C0216.m1584(itM10563);
                        if (C1668.f6641 < 0) {
                            iM11306 = C19806.m45029("᩻֡") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-5561)) ^ 288270537;
                            i = 272623280;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1561550102:
                    case 223076177:
                        if (CallableC1627.m5507() == 0) {
                            c23400 = new C23400();
                            c10948 = c6796.f22941;
                            if (C0671.f2816 != 0) {
                                iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨܿ")) * (-45);
                                i5 = ((iM11306 ^ i4) * (-4993)) ^ (-1760665057);
                                i = -671786076;
                            } else {
                                iM11306 = C19806.m45029("ۨ᩵") ^ i4;
                                i5 = ((iM11306 ^ i3) * (-30681)) ^ (-1992831278);
                                i = -1297019245;
                            }
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1345913479:
                    case -581638664:
                        strM3407 = C0817.m3407(C2642.m8158(c10948));
                        if (!C0817.f3443) {
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܰܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-22503)) ^ (-139740742);
                        i = 901795328;
                        i7 = iM11306 ^ i;
                        break;
                        break;
                    case -1167661619:
                    case 1527942308:
                        itM10563 = C3577.m10563(this.f74825);
                        iM11306 = (C19806.m45029("ܰ֫") + i4) * (-51);
                        i5 = ((iM11306 ^ i3) * 14845) ^ 1142529413;
                        i = -131840828;
                        i7 = iM11306 ^ i;
                        break;
                    case -744767251:
                    case 1780519961:
                        c23400.m51535(strM3407);
                        if (C0962.f3784) {
                            iM11306 = C19806.m45029("᩸᩻") ^ i3;
                            i5 = ((iM11306 ^ i4) * 29261) ^ 1125022118;
                            i = -1543229602;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ᩳܰ") ^ i4) * (-103);
                            i5 = ((iM11306 ^ i3) * (-21533)) ^ (-438821962);
                            i = -1484385735;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -738668018:
                    case -530276930:
                        RunnableC1606.m5473();
                        break;
                    case -650606274:
                    case 1291196650:
                        if (RunnableC1564.m5348(itM10563)) {
                            iM11306 = C19806.m45029("ۡ۬") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-8717)) ^ 1439488894;
                            i = -996016841;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ܳ") ^ i3) * 99;
                            i5 = ((iM11306 ^ i4) * (-18461)) ^ 1472593414;
                            i = 969158222;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -541253803:
                    case 669908578:
                        strM6674 = C2124.m6674(interfaceC2916M10961);
                        if (C2788.m8472() != 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨܿ")) * (-45);
                            i5 = ((iM11306 ^ i4) * (-4993)) ^ (-1760665057);
                            i = -671786076;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 527) ^ 868960063;
                            i = 2053185283;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -332087893:
                    case 705795019:
                        C14228.m34327(this.f74824, c10700);
                        iM11306 = ThreadFactoryC3888.m11306("ۚܽ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-15067)) ^ (-524130120);
                        i = -1745130494;
                        i7 = iM11306 ^ i;
                        break;
                    case -304314564:
                    case 1487546236:
                        if (!C0797.f3386) {
                        }
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨܿ")) * (-45);
                        i5 = ((iM11306 ^ i4) * (-4993)) ^ (-1760665057);
                        i = -671786076;
                        i7 = iM11306 ^ i;
                        break;
                    case -230093444:
                    case 795603618:
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i4;
                        i5 = ((iM11306 ^ i3) * 29971) ^ 1737018524;
                        i = -829472843;
                        i7 = iM11306 ^ i;
                        break;
                    case 325434195:
                    case 572084734:
                        if (this.f74830) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡۘ")) * 47;
                            i5 = ((iM11306 ^ i4) * (-2947)) ^ (-1528857802);
                            i = -2082640922;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۚܽ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-15067)) ^ (-524130120);
                            i = -1745130494;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 434066119:
                    case 629304706:
                        c23400.m51537(strM6674);
                        if (C3722.f13525 <= 0) {
                            iM11306 = C19806.m45029("᩸᩻") ^ i3;
                            i5 = ((iM11306 ^ i4) * 29261) ^ 1125022118;
                            i = -1543229602;
                        } else {
                            iM11306 = (C19806.m45029("ۤܿ") ^ i4) * 75;
                            i5 = ((iM11306 ^ i3) * 8491) ^ (-55563450);
                            i = 845939060;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 434096798:
                    case 500565131:
                        c10700 = new C10700();
                        if (!C0797.f3386) {
                            iM11306 = (C19806.m45029("۠᩷") ^ i4) * 91;
                            i5 = ((iM11306 ^ i3) * (-13997)) ^ (-1887119628);
                            i = 582202868;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    default:
                        super.onDestroy();
                        if (this.f74827) {
                            iM11306 = ThreadFactoryC3888.m11306("ۧ᩶") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-30003)) ^ 1801507270;
                            i = 2113510798;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۚܽ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-15067)) ^ (-524130120);
                            i = -1745130494;
                        }
                        i7 = iM11306 ^ i;
                        break;
                }
                return;
            }
            iM45029 = C19806.m45029("ܳܶ") ^ i4;
            i5 = ((iM45029 ^ i3) * (-1459)) ^ 487981267;
            i6 = -18994699;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50955(ActivityC23025 activityC23025) {
        long jM2311 = 0;
        long j = 0;
        int i = 694105710;
        int i2 = C1398.f5802;
        int i3 = C2788.f10625;
        int iM45029 = (C19806.m45029("ᩴܳ") + i2) * 55;
        int i4 = ((iM45029 ^ i3) * 10993) ^ 68528037;
        int i5 = 186030241;
        while (true) {
            i = ((((i ^ i3) * 5927) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2096715815:
                case -1848927083:
                    if (jM2311 - j < 300) {
                        iM45029 = C19806.m45029("۠᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20445)) ^ (-1364719469);
                        i5 = 1446223179;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩵᩹")) * (-95);
                        i4 = ((iM45029 ^ i3) * 30289) ^ 454055804;
                        i5 = 1611928222;
                    }
                    break;
                case -1902979484:
                case 2099660576:
                    break;
                case -1898160345:
                case 1331523590:
                    C1668.m5583();
                    C2249.m6915();
                    break;
                case -1570881778:
                case -498192529:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("᩺۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18779) ^ 630853366;
                        i5 = -222995011;
                    } else {
                        iM45029 = (C19806.m45029("۟۠") ^ i2) * 63;
                        i4 = ((iM45029 ^ i3) * 25539) ^ (-1024510064);
                        i5 = -1902721563;
                    }
                    break;
                case -1518095092:
                case -1145306515:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12321)) ^ (-1825911771);
                        i5 = 1953996389;
                    } else {
                        iM45029 = C19806.m45029("۟᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14367) ^ (-2104742617);
                        i5 = 1230027398;
                    }
                    break;
                case -1199666593:
                case 71811557:
                    if (AbstractC0464.m2313() == 0) {
                        C2332.m7081(new C13147(activityC23025));
                    }
                    iM45029 = ThreadFactoryC3888.m11306("ۖۤ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 14603) ^ 952418277;
                    i5 = -741847043;
                    break;
                case -1150715256:
                case 1600229534:
                    j = activityC23025.f74829;
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("۟᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14367) ^ (-2104742617);
                        i5 = 1230027398;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19933)) ^ 1944775903;
                        i5 = 1143319225;
                    }
                    break;
                case -1086675352:
                case 1765086252:
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("۟᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14367) ^ (-2104742617);
                        i5 = 1230027398;
                    } else {
                        iM45029 = (C19806.m45029("ۢۨ") + i2) * 85;
                        i4 = ((iM45029 ^ i3) * 17435) ^ 1464748786;
                        i5 = -1407566000;
                    }
                    break;
                case -586339958:
                case 1239316279:
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("᩺۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18779) ^ 630853366;
                        i5 = -222995011;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i2) * 18793) ^ 909554675;
                        i5 = 2080198606;
                    }
                    break;
                case -409889519:
                case -153351135:
                    if (!C19806.f63586) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹ۖ")) * 39;
                        i4 = ((iM45029 ^ i2) * (-3929)) ^ 25014399;
                        i5 = -642070903;
                    } else {
                        iM45029 = C19806.m45029("᩺۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18779) ^ 630853366;
                        i5 = -222995011;
                    }
                    break;
                case -402915881:
                case 103186405:
                    C2124.m6673();
                    if (!C0817.f3443) {
                        iM45029 = C19806.m45029("᩺᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5147)) ^ (-1580551943);
                        i5 = -573933854;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹ۖ")) * 39;
                        i4 = ((iM45029 ^ i2) * (-3929)) ^ 25014399;
                        i5 = -642070903;
                    }
                    break;
                case 152200947:
                case 1388288038:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹ۖ")) * 39;
                        i4 = ((iM45029 ^ i2) * (-3929)) ^ 25014399;
                        i5 = -642070903;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۟") ^ i2) * (-33);
                        i4 = ((iM45029 ^ i3) * 20775) ^ 424362625;
                        i5 = -1356846024;
                    }
                    break;
                case 351493377:
                case 1383938183:
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("᩺᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5147)) ^ (-1580551943);
                        i5 = -573933854;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30163) ^ (-289145328);
                        i5 = 1886234074;
                    }
                    break;
                case 842288937:
                case 1648713731:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14603) ^ 952418277;
                        i5 = -741847043;
                    } else {
                        iM45029 = C19806.m45029("᩺۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18779) ^ 630853366;
                        i5 = -222995011;
                    }
                    break;
                case 949870834:
                case 1230424901:
                    jM2311 = AbstractC0464.m2311();
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("۟᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14367) ^ (-2104742617);
                        i5 = 1230027398;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩵") + i3) * (-117);
                        i4 = ((iM45029 ^ i2) * 6609) ^ 1466355140;
                        i5 = 827967055;
                    }
                    break;
                case 1465472964:
                case 1682913127:
                    activityC23025.f74829 = C1460.m5059();
                    if (C2642.m8171() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14603) ^ 952418277;
                        i5 = -741847043;
                    } else {
                        iM45029 = C19806.m45029("֫ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20587) ^ (-1742728329);
                        i5 = -777413185;
                    }
                    break;
                default:
                    C1189.m4368();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹ۖ")) * 39;
                    i4 = ((iM45029 ^ i2) * (-3929)) ^ 25014399;
                    i5 = -642070903;
                    break;
            }
            return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -1327247943;
        int i5 = C2124.f7782;
        int i6 = C3535.f13026;
        int iM11306 = (ThreadFactoryC3888.m11306("᩸᩻") ^ i6) * 47;
        int i7 = ((iM11306 ^ i5) * (-26115)) ^ (-1698850416);
        int i8 = -21911464;
        while (true) {
            i4 = ((((i4 ^ i5) * (-8223)) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2116285885:
                case -780910799:
                    RunnableC1895.m6170();
                    C7105.m18985();
                    iM11306 = (ThreadFactoryC3888.m11306("ܽܽ") + i6) * (-111);
                    i7 = ((iM11306 ^ i5) * (-21663)) ^ 1471653263;
                    i8 = 665949603;
                    break;
                case -2046679329:
                case -456333440:
                    C3286.m9798();
                    if (!C0962.f3784) {
                        iM11306 = (C19806.m45029("᩸᩸") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11306 ^ i6) * 5883) ^ (-752189966);
                        i8 = -2074612909;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܽ") + i6) * (-111);
                        i7 = ((iM11306 ^ i5) * (-21663)) ^ 1471653263;
                        i8 = 665949603;
                    }
                    break;
                case -1979867440:
                case 1274966230:
                    C2871.m8646();
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩸") + i5) * (-45);
                        i7 = ((iM11306 ^ i6) * 30999) ^ 1680840308;
                        i8 = 2023955126;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܽ") + i6) * (-111);
                        i7 = ((iM11306 ^ i5) * (-21663)) ^ 1471653263;
                        i8 = 665949603;
                    }
                    break;
                case -1653298738:
                case 1672031073:
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("ۤۧ") ^ i6) * (-91);
                        i7 = ((iM11306 ^ i5) * 29123) ^ (-833838827);
                        i8 = 403463163;
                    } else {
                        iM11306 = C19806.m45029("ۛ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * 5799) ^ (-1824601278);
                        i8 = 927373163;
                    }
                    break;
                case -1203943855:
                case -1013291640:
                    if (RunnableC3388.m10064()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۛ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 22071) ^ (-714593211);
                        i8 = -1854080706;
                    } else {
                        iM11306 = (C19806.m45029("ۤۧ") ^ i6) * (-91);
                        i7 = ((iM11306 ^ i5) * 29123) ^ (-833838827);
                        i8 = 403463163;
                    }
                    break;
                case -942042414:
                case -666537023:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֡") ^ i6) * (-81);
                        i7 = ((iM11306 ^ i5) * 1863) ^ (-180593252);
                        i8 = 791221361;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("᩸ۙ")) * (-29);
                        i7 = ((iM11306 ^ i5) * 18579) ^ 1720624388;
                        i8 = 1411336906;
                    }
                    break;
                case -828630725:
                case 1027576956:
                    this.f74830 = true;
                    break;
                case -819218681:
                case 793409450:
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("᩸᩸") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11306 ^ i6) * 5883) ^ (-752189966);
                        i8 = -2074612909;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۨ") ^ i6) * (-19);
                        i7 = ((iM11306 ^ i5) * (-6993)) ^ 806223916;
                        i8 = 990564746;
                    }
                    break;
                case -649853190:
                case -22857277:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (C19806.m45029("᩸᩸") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11306 ^ i6) * 5883) ^ (-752189966);
                        i8 = -2074612909;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۗۚ")) * (-91);
                        i7 = ((iM11306 ^ i6) * 4881) ^ 426079390;
                        i8 = -1080079040;
                    }
                    break;
                case -616606281:
                case -216239241:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩸") + i5) * (-45);
                        i7 = ((iM11306 ^ i6) * 30999) ^ 1680840308;
                        i8 = 2023955126;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֡") ^ i6) * (-81);
                        i7 = ((iM11306 ^ i5) * 1863) ^ (-180593252);
                        i8 = 791221361;
                    }
                    break;
                case -171457736:
                case 678165230:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܽ") + i6) * (-111);
                        i7 = ((iM11306 ^ i5) * (-21663)) ^ 1471653263;
                        i8 = 665949603;
                    } else {
                        iM11306 = C19806.m45029("ۚ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * 2405) ^ (-1351021164);
                        i8 = 1490103024;
                    }
                    break;
                case 701886375:
                case 1255150988:
                    C0526.m2437();
                    C0629.m2907();
                    break;
                case 1163762485:
                case 2043596368:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ܰܿ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 30333) ^ 1584261504;
                        i8 = -353383990;
                    } else {
                        iM11306 = (C19806.m45029("᩸᩸") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11306 ^ i6) * 5883) ^ (-752189966);
                        i8 = -2074612909;
                    }
                    break;
                case 1345456471:
                case 2011799728:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("᩸᩸") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11306 ^ i6) * 5883) ^ (-752189966);
                        i8 = -2074612909;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۧ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-10221)) ^ (-2058637103);
                        i8 = 640559527;
                    }
                    break;
                case 1685293692:
                case 2118535839:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("᩸᩸") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11306 ^ i6) * 5883) ^ (-752189966);
                        i8 = -2074612909;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۤ᩺")) * (-25);
                        i7 = ((iM11306 ^ i6) * (-29429)) ^ 1486612631;
                        i8 = -1985861422;
                    }
                    break;
                default:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("᩸᩸") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11306 ^ i6) * 5883) ^ (-752189966);
                        i8 = -2074612909;
                    } else {
                        iM11306 = (C19806.m45029("ܶ᩻") + i6) * (-63);
                        i7 = ((iM11306 ^ i5) * (-10197)) ^ (-1221340877);
                        i8 = 1341675466;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m50954(ActivityC23025 activityC23025) {
        String str = null;
        C10700 c10700M34330 = null;
        Iterator itM10563 = null;
        C6796 c6796 = null;
        C4929 c4929 = null;
        String strM13716 = null;
        C23400 c23400 = null;
        C10948 c10948 = null;
        String strM51534 = null;
        int i = -314325465;
        int i2 = C2871.f10837;
        int i3 = C1398.f5802;
        int iM45029 = (C19806.m45029("۟᩸") ^ i2) * 115;
        int i4 = ((iM45029 ^ i3) * 765) ^ (-348185741);
        int i5 = -1269489106;
        while (true) {
            i = ((((i ^ i3) * (-24533)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2138379279:
                case -205861516:
                    activityC23025.f74830 = true;
                    break;
                case -2040220318:
                case -601679540:
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8411) ^ 360122117;
                        i5 = -378593635;
                    } else {
                        iM45029 = C19806.m45029("ۨܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20137) ^ (-1364715);
                        i5 = -1880126317;
                    }
                    break;
                case -2002626538:
                case -1032139510:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30063) ^ (-1722869133);
                        i5 = -373821249;
                    } else {
                        iM45029 = C19806.m45029("ۨܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20137) ^ (-1364715);
                        i5 = -1880126317;
                    }
                    break;
                case -1887175476:
                case 397312811:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8411) ^ 360122117;
                        i5 = -378593635;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17311) ^ 1427002960;
                        i5 = -641862002;
                    }
                    break;
                case -1872410681:
                case 1214657947:
                    C2124.m6673();
                    if (!C1377.f5749) {
                        iM45029 = C19806.m45029("ۨܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20137) ^ (-1364715);
                        i5 = -1880126317;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩺᩸")) * 109;
                        i4 = ((iM45029 ^ i3) * (-31713)) ^ 1421667259;
                        i5 = -219401862;
                    }
                    break;
                case -1786798778:
                case -1538593390:
                    c6796 = (C6796) C0278.m1776(itM10563);
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27431) ^ (-1401936581);
                        i5 = 1330810514;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩺᩸")) * 109;
                        i4 = ((iM45029 ^ i3) * (-31713)) ^ 1421667259;
                        i5 = -219401862;
                    }
                    break;
                case -1689577164:
                case -190814950:
                    c23400 = (C23400) RunnableC0195.m1435(c10700M34330.f36512, strM13716);
                    if (c23400 != null) {
                        iM45029 = (C19806.m45029("ۡܰ") + i3) * (-127);
                        i4 = ((iM45029 ^ i2) * (-13407)) ^ 1068036346;
                        i5 = -1398881816;
                    } else {
                        iM45029 = C19806.m45029("ۜ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31135) ^ 2015145537;
                        i5 = -1595230688;
                    }
                    break;
                case -1651568167:
                case 463349643:
                    C3286.m9797(c10948, strM51534);
                    if (C0962.m3746() >= 0) {
                        iM45029 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8411) ^ 360122117;
                        i5 = -378593635;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28555)) ^ 383787682;
                        i5 = -836439927;
                    }
                    break;
                case -1458350178:
                case 210902404:
                    c10948 = c6796.f22941;
                    strM51534 = c23400.m51534();
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8411) ^ 360122117;
                        i5 = -378593635;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩶ۨ")) * 75;
                        i4 = ((iM45029 ^ i3) * (-24903)) ^ (-636643431);
                        i5 = 1895641301;
                    }
                    break;
                case -1335195971:
                case 1990380590:
                    itM10563 = C3577.m10563(activityC23025.f74825);
                    iM45029 = C19806.m45029("ۜ֨") ^ i2;
                    i4 = ((iM45029 ^ i3) * 31135) ^ 2015145537;
                    i5 = -1595230688;
                    break;
                case -1170054982:
                case 2024919718:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30063) ^ (-1722869133);
                        i5 = -373821249;
                    } else {
                        iM45029 = (C19806.m45029("ۢ۠") + i3) * 13;
                        i4 = ((iM45029 ^ i2) * 15709) ^ 459188512;
                        i5 = 665874388;
                    }
                    break;
                case -1029561650:
                case -532711922:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM45029 = C19806.m45029("ۨܶ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 20137) ^ (-1364715);
                    i5 = -1880126317;
                    break;
                case -703121631:
                case 343236472:
                    str = activityC23025.f74824;
                    if (C2871.m8646()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۗ") ^ i2) * 43;
                        i4 = ((iM45029 ^ i3) * 7495) ^ 128661164;
                        i5 = 1599030870;
                    } else {
                        iM45029 = C19806.m45029("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32143)) ^ 320566811;
                        i5 = -1150252164;
                    }
                    break;
                case -449744777:
                case 369843407:
                    C1419.m4968(c6796.f22940, c23400.m51536());
                    iM45029 = C19806.m45029("ۜ֨") ^ i2;
                    i4 = ((iM45029 ^ i3) * 31135) ^ 2015145537;
                    i5 = -1595230688;
                    break;
                case -319008417:
                case 1368866855:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23691)) ^ 339725091;
                        i5 = -1856527019;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30063) ^ (-1722869133);
                        i5 = -373821249;
                    }
                    break;
                case -247629827:
                case 1800331166:
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32143)) ^ 320566811;
                        i5 = -1150252164;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29569) ^ 459823532;
                        i5 = 145222324;
                    }
                    break;
                case 105821327:
                case 427469922:
                    strM13716 = c4929.m13716();
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32143)) ^ 320566811;
                        i5 = -1150252164;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡ۚ")) * 123;
                        i4 = ((iM45029 ^ i3) * (-24847)) ^ (-1357925742);
                        i5 = 1649073845;
                    }
                    break;
                case 303726304:
                case 546098498:
                    if (C0962.m3748(itM10563)) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2897) ^ (-1541979263);
                        i5 = 381273770;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩶") + i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-14699)) ^ 678781145;
                        i5 = 1718081681;
                    }
                    break;
                case 466258927:
                case 1404284665:
                    break;
                case 1025459025:
                case 1776618451:
                    C3286.m9798();
                    break;
                case 1682211207:
                case 1750716915:
                    c4929 = c6796.f22939;
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30063) ^ (-1722869133);
                        i5 = -373821249;
                    } else {
                        iM45029 = C19806.m45029("᩶ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26591) ^ (-1171401594);
                        i5 = -1417050774;
                    }
                    break;
                default:
                    c10700M34330 = C14228.m34330(str);
                    if (c10700M34330 == null) {
                        iM45029 = (C19806.m45029("ۤܰ") ^ i3) * (-15);
                        i4 = ((iM45029 ^ i2) * (-17787)) ^ 1464236791;
                        i5 = 1652415950;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3213) ^ 1303791557;
                        i5 = -1686149089;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x015a A[PHI: r2 r3 r8 r9 r22
      0x015a: PHI (r2v3 android.view.MenuItem) = (r2v2 android.view.MenuItem), (r2v2 android.view.MenuItem), (r2v4 android.view.MenuItem) binds: [B:39:0x0158, B:35:0x0136, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:39:0x0158, B:35:0x0136, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:39:0x0158, B:35:0x0136, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r9v3 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v4 short[]) binds: [B:39:0x0158, B:35:0x0136, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r22v21 int) = (r22v19 int), (r22v20 int), (r22v23 int) binds: [B:39:0x0158, B:35:0x0136, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0282 A[PHI: r17 r18 r22 r23
      0x0282: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:62:0x0280, B:58:0x025d, B:14:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:62:0x0280, B:58:0x025d, B:14:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r22v26 int) = (r22v11 int), (r22v12 int), (r22v31 int) binds: [B:62:0x0280, B:58:0x025d, B:14:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r23v5 short) = (r23v3 short), (r23v4 short), (r23v3 short) binds: [B:62:0x0280, B:58:0x025d, B:14:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if (l.C1460.m5050() == 0) goto L13;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r27) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC23025.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0932 A[PHI: r2 r5 r8 r21 r25 r26 r27 r28 r32 r33 r36 r38 r42 r43
      0x0932: PHI (r2v59 int) = (r2v32 int), (r2v34 int), (r2v61 int) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r5v77 int) = (r5v59 int), (r5v61 int), (r5v78 int) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r8v52 l.ۜܰۘ) = (r8v33 l.ۜܰۘ), (r8v35 l.ۜܰۘ), (r8v53 l.ۜܰۘ) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r21v39 int) = (r21v23 int), (r21v25 int), (r21v40 int) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r25v5 int) = (r25v2 int), (r25v2 int), (r25v6 int) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r26v5 int) = (r26v2 int), (r26v2 int), (r26v6 int) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r27v5 short[]) = (r27v3 short[]), (r27v2 short[]), (r27v2 short[]) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r28v5 char) = (r28v3 char), (r28v2 char), (r28v2 char) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r32v5 int) = (r32v2 int), (r32v3 int), (r32v2 int) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r33v5 short) = (r33v2 short), (r33v3 short), (r33v2 short) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r36v41 l.ۜܰۘ) = (r36v25 l.ۜܰۘ), (r36v27 l.ۜܰۘ), (r36v42 l.ۜܰۘ) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r38v46 java.lang.String) = (r38v29 java.lang.String), (r38v31 java.lang.String), (r38v47 java.lang.String) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r42v60 l.ۜܰۘ) = (r42v38 l.ۜܰۘ), (r42v40 l.ۜܰۘ), (r42v61 l.ۜܰۘ) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]
      0x0932: PHI (r43v29 short[]) = (r43v15 short[]), (r43v17 short[]), (r43v30 short[]) binds: [B:193:0x0930, B:184:0x08a3, B:74:0x02b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        int i5;
        int iM45029;
        int i6;
        C6796 c6796;
        int iM450210;
        int i7;
        int i8;
        int iM450211;
        int i9;
        int i10;
        int iM11307;
        int i11;
        int i12;
        int iM450212;
        int i13;
        int iM11308;
        int i14;
        int i15;
        int i16;
        C6796 c6797;
        short[] sArr;
        int i17;
        short[] sArr2;
        int iM450213;
        int i18;
        int iM11309;
        int i19;
        int i20;
        int i21;
        int i22 = 1507651101;
        int i23 = C2871.f10837;
        int i24 = C2788.f10625;
        int iM450214 = (i23 - C19806.m45029("ۚܳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i25 = ((iM450214 ^ i24) * 7171) ^ 505145179;
        int i26 = iM450214 ^ (-1245245842);
        String str = null;
        Iterator itM9863 = null;
        C6796 c6798 = null;
        C6796 c6799 = null;
        String strM13716 = null;
        String strM6164 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        boolean z = false;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int iM6285 = 0;
        int i30 = 0;
        int iM450215 = 0;
        int i31 = 0;
        char c = 0;
        short s = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        short s2 = 0;
        boolean zM3748 = false;
        int i35 = 0;
        C10948 c10948 = null;
        C6796 c67910 = null;
        JSONException jSONException = null;
        String strM6363 = null;
        String strM1774 = null;
        boolean zM10786 = false;
        boolean zM10787 = false;
        ArrayList arrayList = null;
        JSONObject jSONObject = null;
        boolean z2 = false;
        JSONObject jSONObject2 = null;
        String strM3407 = null;
        boolean z3 = false;
        while (true) {
            i22 = i26 ^ (i25 & (((i22 ^ i24) * 30153) >> 31));
            switch (i22) {
                case -2133206067:
                case 456962107:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM450211 = ThreadFactoryC3888.m11306("᩹۫") ^ i24;
                        i9 = ((iM450211 ^ i23) * (-16407)) ^ (-250833930);
                        i10 = -501363361;
                        i26 = iM450211 ^ i10;
                        i25 = i9;
                    } else {
                        strM3407 = strM3407;
                        c67910 = c67910;
                        sArr4 = sArr4;
                        c6798 = c6798;
                        i30 = i30;
                        i35 = i35;
                        iM45029 = C19806.m45029("ۚ᩹") ^ i23;
                        i = ((iM45029 ^ i24) * 7027) ^ (-1695599236);
                        i6 = -758708773;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    }
                    break;
                case -2115972438:
                case -1045550670:
                    i16 = 0;
                    int iM450216 = C19806.m45029("ۘ᩷") ^ i24;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i16;
                    i25 = ((iM450216 ^ i23) * 25013) ^ (-387573969);
                    c6799 = c6799;
                    i26 = iM450216 ^ (-1687948843);
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -2107631948:
                case -484168073:
                    strM3407 = strM3407;
                    JSONException jSONException2 = jSONException;
                    c67910 = c67910;
                    c6798 = c6798;
                    if (i30 == 0) {
                        jSONException = jSONException2;
                        c6799 = c6799;
                        i30 = i30;
                        sArr4 = sArr4;
                        i35 = i35;
                        iM45029 = (C19806.m45029("ۨ᩻") ^ i24) * 7;
                        i = ((iM45029 ^ i23) * 7017) ^ (-297678061);
                        i6 = -745279135;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    } else {
                        int iM450217 = (C19806.m45029("ۗ۠") + i24) * (-63);
                        jSONException = jSONException2;
                        i25 = ((iM450217 ^ i23) * (-20653)) ^ (-735661859);
                        i26 = iM450217 ^ (-737693388);
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    }
                    break;
                case -2076383157:
                case 1614281096:
                    if (C7105.f23796 < 0) {
                        c6799 = c6799;
                        strM3407 = strM3407;
                        iM6285 = iM6285;
                        c67910 = c67910;
                        c6798 = c6798;
                        i30 = i30;
                        int iM450218 = (i24 - C19806.m45029("ܺ᩻")) * (-63);
                        i30 = i30;
                        iM6285 = iM6285;
                        c6798 = c6798;
                        c6799 = c6799;
                        i26 = iM450218 ^ (-1817678968);
                        i25 = ((iM450218 ^ i23) * (-21261)) ^ 1604830153;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    }
                    c6797 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    i17 = i35;
                    c6798 = c6798;
                    sArr = sArr4;
                    iM450213 = C19806.m45029("ۗܿ") ^ i23;
                    sArr2 = sArr;
                    i3 = ((iM450213 ^ i24) * (-2343)) ^ 1123560769;
                    i18 = -500407185;
                    i35 = i17;
                    c6799 = c6797;
                    sArr4 = sArr2;
                    i26 = iM450213 ^ i18;
                    i25 = i3;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -1970280035:
                case -1415052959:
                    z3 = false;
                    iM45029 = (ThreadFactoryC3888.m11306("᩺ܺ") + i23) * (-35);
                    i = ((iM45029 ^ i24) * 31359) ^ (-262611986);
                    i6 = 1225943918;
                    i2 = iM45029 ^ i6;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i2;
                    i25 = i;
                    c6799 = c6796;
                    break;
                case -1965074659:
                case -815291927:
                    if (!zM10787) {
                        iM450211 = (C19806.m45029("ܰ᩻") ^ i24) * (-63);
                        i9 = ((iM450211 ^ i23) * (-9969)) ^ 209465699;
                        i10 = 691421342;
                        i26 = iM450211 ^ i10;
                        i25 = i9;
                    } else {
                        c6799 = c6799;
                        strM3407 = strM3407;
                        c67910 = c67910;
                        sArr4 = sArr4;
                        c6798 = c6798;
                        i30 = i30;
                        i35 = i35;
                        iM45029 = C19806.m45029("ۗۧ") ^ i24;
                        i = ((iM45029 ^ i23) * (-28173)) ^ 1605805897;
                        i6 = -1981885313;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    }
                    break;
                case -1955439761:
                case -908480355:
                    C1148.m4232();
                    C0817.m3399();
                    c6797 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    i17 = i35;
                    c6798 = c6798;
                    sArr = sArr4;
                    iM450213 = C19806.m45029("ۗܿ") ^ i23;
                    sArr2 = sArr;
                    i3 = ((iM450213 ^ i24) * (-2343)) ^ 1123560769;
                    i18 = -500407185;
                    i35 = i17;
                    c6799 = c6797;
                    sArr4 = sArr2;
                    i26 = iM450213 ^ i18;
                    i25 = i3;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -1919031579:
                case 938482715:
                    C0050.m946();
                    if (C1977.f7413 <= 0) {
                        iM450211 = C19806.m45029("᩹ۚ") ^ i24;
                        i9 = ((iM450211 ^ i23) * 3787) ^ (-1120744817);
                        i10 = -1501011058;
                        i26 = iM450211 ^ i10;
                        i25 = i9;
                    } else {
                        strM3407 = strM3407;
                        c67910 = c67910;
                        sArr4 = sArr4;
                        c6798 = c6798;
                        i30 = i30;
                        i35 = i35;
                        iM45029 = C19806.m45029("ۚ᩹") ^ i23;
                        i = ((iM45029 ^ i24) * 7027) ^ (-1695599236);
                        i6 = -758708773;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    }
                    break;
                case -1913002805:
                case -388328609:
                    strM3407 = strM3407;
                    c67910 = c67910;
                    if (C0671.m3004(C3743.m10961(c67910.f22940)) == 0) {
                        c6798 = c6798;
                        c6799 = c6799;
                        i30 = i30;
                        sArr4 = sArr4;
                        i35 = i35;
                        iM45029 = (C19806.m45029("ۨ᩻") ^ i24) * 7;
                        i = ((iM45029 ^ i23) * 7017) ^ (-297678061);
                        i6 = -745279135;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ۬") ^ i23) * 31;
                        c6798 = c6798;
                        i3 = ((iM11306 ^ i24) * (-14105)) ^ 259831593;
                        i4 = 453344889;
                        i26 = iM11306 ^ i4;
                        i25 = i3;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    }
                    break;
                case -1870705013:
                case -366542906:
                    strM3407 = strM3407;
                    C1668.m5576(iM450215 ^ i31);
                    c6798 = (C6796) C3286.m9796(arrayList, z2 ? 1 : 0);
                    if (C1189.f5284 > 0) {
                        iM11309 = ThreadFactoryC3888.m11306("ۘۘ") ^ i24;
                        i19 = ((iM11309 ^ i23) * (-567)) ^ 1595106134;
                        i20 = 1793122002;
                        i26 = iM11309 ^ i20;
                        i25 = i19;
                        strM3407 = strM3407;
                    }
                    c6799 = c6799;
                    iM6285 = iM6285;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    iM11307 = (ThreadFactoryC3888.m11306("ۡ۫") + i23) * 69;
                    i11 = ((iM11307 ^ i24) * 22903) ^ 105320757;
                    i12 = 1211236566;
                    i21 = iM11307 ^ i12;
                    iM6285 = iM6285;
                    i35 = i35;
                    c6799 = c6799;
                    sArr4 = sArr4;
                    i26 = i21;
                    i25 = i11;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -1858401645:
                case -1624566427:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    arrayList = this.f74825;
                    C10948 c10949 = ((C6796) C3286.m9796(arrayList, z2 ? 1 : 0)).f22940;
                    if (C1419.f5860 < 0) {
                        int iM450219 = (C19806.m45029("᩷۫") ^ i24) * 91;
                        c10948 = c10949;
                        i25 = ((iM450219 ^ i23) * (-24709)) ^ (-1910670911);
                        i5 = iM450219 ^ (-839416499);
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i5;
                        c6799 = c6796;
                    } else {
                        c10948 = c10949;
                        iM45029 = C19806.m45029("ۚ᩹") ^ i23;
                        i = ((iM45029 ^ i24) * 7027) ^ (-1695599236);
                        i6 = -758708773;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    }
                    break;
                case -1776753792:
                case 400339653:
                    C3743.m10966();
                    if (C0050.f912 > 0) {
                        iM450211 = C19806.m45029("ۜۢ") ^ i23;
                        i9 = ((iM450211 ^ i24) * 24827) ^ (-65354942);
                        i10 = 841552583;
                        i26 = iM450211 ^ i10;
                        i25 = i9;
                    } else {
                        c6797 = c6799;
                        strM3407 = strM3407;
                        c67910 = c67910;
                        i17 = i35;
                        c6798 = c6798;
                        sArr = sArr4;
                        iM450213 = C19806.m45029("ۗܿ") ^ i23;
                        sArr2 = sArr;
                        i3 = ((iM450213 ^ i24) * (-2343)) ^ 1123560769;
                        i18 = -500407185;
                        i35 = i17;
                        c6799 = c6797;
                        sArr4 = sArr2;
                        i26 = iM450213 ^ i18;
                        i25 = i3;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    }
                    break;
                case -1748932563:
                case 1965142596:
                    C6796 c67911 = c6798;
                    c6799 = c6799;
                    strM3407 = strM3407;
                    int i36 = i30;
                    short[] sArr6 = sArr4;
                    int i37 = i35;
                    C6796 c67912 = (C6796) C1419.m4967(arrayList, i36);
                    if (C1875.m6096(C3743.m10961(c67912.f22941)) == 0) {
                        iM450210 = ThreadFactoryC3888.m11306("᩻᩻") ^ i23;
                        i7 = ((iM450210 ^ i24) * (-31821)) ^ 1224036415;
                        i8 = -1044183096;
                    } else {
                        iM450210 = C19806.m45029("۟᩹") ^ i24;
                        i7 = ((iM450210 ^ i23) * 32477) ^ (-743055485);
                        i8 = -851318366;
                    }
                    i5 = iM450210 ^ i8;
                    i35 = i37;
                    sArr4 = sArr6;
                    i30 = i36;
                    c6798 = c67911;
                    c67910 = c67912;
                    i25 = i7;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i5;
                    c6799 = c6796;
                    break;
                case -1671704027:
                case 1876466578:
                    strM3407 = strM3407;
                    if (zM10786) {
                        iM11309 = C19806.m45029("ᩳۚ") ^ i23;
                        i19 = ((iM11309 ^ i24) * 15613) ^ (-1453174540);
                        i20 = -678652582;
                    } else {
                        strM6363 = strM13716;
                        iM11309 = ThreadFactoryC3888.m11306("۬۟") ^ i24;
                        i19 = ((iM11309 ^ i23) * (-28575)) ^ 1069648477;
                        i20 = -1313854321;
                    }
                    i26 = iM11309 ^ i20;
                    i25 = i19;
                    strM3407 = strM3407;
                    break;
                case -1552722673:
                case 34427182:
                    strM3407 = strM3407;
                    c67910 = c67910;
                    c6798 = c6798;
                    c6797 = c6799;
                    sArr = sArr4;
                    i17 = i35;
                    strM6164 = RunnableC1895.m6164(sArr, i17, 3, i29);
                    if (C2788.f10625 >= 0) {
                        iM450213 = C19806.m45029("ۗܿ") ^ i23;
                        sArr2 = sArr;
                        i3 = ((iM450213 ^ i24) * (-2343)) ^ 1123560769;
                        i18 = -500407185;
                    } else {
                        sArr2 = sArr;
                        iM450213 = (C19806.m45029("ܺ᩹") + i23) * 19;
                        i3 = ((iM450213 ^ i24) * (-20107)) ^ (-806160988);
                        i18 = -369558108;
                    }
                    i35 = i17;
                    c6799 = c6797;
                    sArr4 = sArr2;
                    i26 = iM450213 ^ i18;
                    i25 = i3;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -1546710651:
                case 1925339096:
                    C3722.m10894();
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        c6799 = c6799;
                        strM3407 = strM3407;
                        c67910 = c67910;
                        sArr4 = sArr4;
                        c6798 = c6798;
                        i30 = i30;
                        i35 = i35;
                        iM450212 = ThreadFactoryC3888.m11306("۫᩷") ^ i24;
                        i11 = ((iM450212 ^ i23) * 28333) ^ (-752807319);
                        i13 = -994455440;
                        i21 = iM450212 ^ i13;
                        i35 = i35;
                        c6799 = c6799;
                        sArr4 = sArr4;
                        i26 = i21;
                        i25 = i11;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i23;
                        i9 = ((iM450211 ^ i24) * 8737) ^ 120994645;
                        i10 = -1329339765;
                        i26 = iM450211 ^ i10;
                        i25 = i9;
                    }
                    break;
                case -1541088107:
                case 909070549:
                    i29 = 34193;
                    iM11307 = (i23 - C19806.m45029("ܿۧ")) * 59;
                    i11 = ((iM11307 ^ i24) * (-27223)) ^ 276846956;
                    i12 = 843190222;
                    i21 = iM11307 ^ i12;
                    iM6285 = iM6285;
                    i35 = i35;
                    c6799 = c6799;
                    sArr4 = sArr4;
                    i26 = i21;
                    i25 = i11;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -1470412269:
                case -1336647114:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    iM6285 = iM6285;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    s = sArr3[c];
                    i32 = s * s;
                    i33 = 189282564;
                    if (C1419.f5860 < 0) {
                        iM11307 = (C19806.m45029("ۛۛ") ^ i24) * (-111);
                        i11 = ((iM11307 ^ i23) * (-11047)) ^ 1482875605;
                        i12 = -1763247813;
                        i21 = iM11307 ^ i12;
                        iM6285 = iM6285;
                        i35 = i35;
                        c6799 = c6799;
                        sArr4 = sArr4;
                        i26 = i21;
                        i25 = i11;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    } else {
                        i35 = i35;
                        sArr4 = sArr4;
                        int iM4502110 = (i24 - C19806.m45029("ܺ᩻")) * (-63);
                        i30 = i30;
                        iM6285 = iM6285;
                        c6798 = c6798;
                        c6799 = c6799;
                        i26 = iM4502110 ^ (-1817678968);
                        i25 = ((iM4502110 ^ i23) * (-21261)) ^ 1604830153;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    }
                    break;
                case -1425592065:
                case 1936044761:
                    ThreadFactoryC3888.m11300();
                    if (C0671.f2816 != 0) {
                        strM3407 = strM3407;
                        c67910 = c67910;
                        sArr4 = sArr4;
                        c6798 = c6798;
                        i30 = i30;
                        i35 = i35;
                        iM45029 = C19806.m45029("ۚ᩹") ^ i23;
                        i = ((iM45029 ^ i24) * 7027) ^ (-1695599236);
                        i6 = -758708773;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    } else {
                        c6797 = c6799;
                        strM3407 = strM3407;
                        c67910 = c67910;
                        i17 = i35;
                        c6798 = c6798;
                        sArr = sArr4;
                        iM450213 = C19806.m45029("ۗܿ") ^ i23;
                        sArr2 = sArr;
                        i3 = ((iM450213 ^ i24) * (-2343)) ^ 1123560769;
                        i18 = -500407185;
                        i35 = i17;
                        c6799 = c6797;
                        sArr4 = sArr2;
                        i26 = iM450213 ^ i18;
                        i25 = i3;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    }
                    break;
                case -1419867347:
                case -259849358:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    iM6285 = iM6285;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    int i38 = i32 + i33;
                    i34 = i38 + i38;
                    s2 = 13758;
                    if (C3743.f13569) {
                        iM11307 = (C19806.m45029("ܳۖ") ^ i24) * 41;
                        i11 = ((iM11307 ^ i23) * (-21365)) ^ 2156316;
                        i12 = -1815842950;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡ۫") + i23) * 69;
                        i11 = ((iM11307 ^ i24) * 22903) ^ 105320757;
                        i12 = 1211236566;
                    }
                    i21 = iM11307 ^ i12;
                    iM6285 = iM6285;
                    i35 = i35;
                    c6799 = c6799;
                    sArr4 = sArr4;
                    i26 = i21;
                    i25 = i11;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -1400192619:
                case 1932548644:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    c6798 = c6798;
                    i30 = i30;
                    this.f74828.m44413(i30);
                    sArr4 = f74820;
                    i35 = 57;
                    if (!C3743.f13569) {
                        iM6285 = iM6285;
                        int iM4502111 = (i24 - C19806.m45029("ܺ᩻")) * (-63);
                        i30 = i30;
                        iM6285 = iM6285;
                        c6798 = c6798;
                        c6799 = c6799;
                        i26 = iM4502111 ^ (-1817678968);
                        i25 = ((iM4502111 ^ i23) * (-21261)) ^ 1604830153;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("ۘᩳ") + i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM113010 ^ i23) * (-3033)) ^ (-278041774);
                        i2 = iM113010 ^ 471038550;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    }
                    break;
                case -1373959563:
                case -706681630:
                    C1189.m4361(C19806.m45029(strM6164) ^ 2100140204);
                    C1977.m6361(c67910.f22941);
                    return z;
                case -1337991911:
                case 1195010152:
                    i29 = 19454;
                    iM11307 = (i23 - C19806.m45029("ܿۧ")) * 59;
                    i11 = ((iM11307 ^ i24) * (-27223)) ^ 276846956;
                    i12 = 843190222;
                    i21 = iM11307 ^ i12;
                    iM6285 = iM6285;
                    i35 = i35;
                    c6799 = c6799;
                    sArr4 = sArr4;
                    i26 = i21;
                    i25 = i11;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -1310792941:
                case 628741873:
                    return z2;
                case -1179273730:
                case 1683888938:
                    jSONObject2.put(strM6363, C2124.m6674(C2642.m8158(c6799.f22941)));
                    strM3407 = C0817.m3407(C2642.m8158(c6799.f22940));
                    zM10787 = C3660.m10786(strM3407);
                    iM450211 = (i23 - C19806.m45029("᩵ۢ")) * (-79);
                    i9 = ((iM450211 ^ i24) * (-12527)) ^ 1011870557;
                    i10 = 1110845650;
                    i26 = iM450211 ^ i10;
                    i25 = i9;
                    break;
                case -1089540348:
                case 2082619384:
                    C2871.m8645(c6798.f22940);
                    c6798.f22940.m16962(str);
                    return z;
                case -964756357:
                case 1407634916:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    z = true;
                    if (C0671.m3004(C2642.m8158(c10948)) != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۜ") ^ i24) * 23;
                        i = ((iM45029 ^ i23) * (-25093)) ^ (-1861292199);
                        i6 = 1195149778;
                    } else {
                        iM45029 = C19806.m45029("᩹ᩴ") ^ i23;
                        i = ((iM45029 ^ i24) * (-13951)) ^ (-1296201667);
                        i6 = 425417974;
                    }
                    i2 = iM45029 ^ i6;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i2;
                    i25 = i;
                    c6799 = c6796;
                    break;
                case -886914413:
                case -174300515:
                    strM3407 = strM3407;
                    c67910 = c67910;
                    c6798 = c6798;
                    if (zM3748) {
                        iM11306 = (i24 - ThreadFactoryC3888.m11306("᩺᩶")) * (-69);
                        i3 = ((iM11306 ^ i23) * (-15461)) ^ 1437052001;
                        i4 = -1675365209;
                    } else {
                        iM11306 = (C19806.m45029("֡ܿ") ^ i23) * 23;
                        i3 = ((iM11306 ^ i24) * 9285) ^ 2087239571;
                        i4 = 215470222;
                    }
                    i26 = iM11306 ^ i4;
                    i25 = i3;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -883098663:
                case 2105483326:
                    strM3407 = strM3407;
                    try {
                        C6796 c67913 = (C6796) C0216.m1584(itM9863);
                        try {
                            strM13716 = c67913.f22939.m13716();
                            zM10786 = C3660.m10786(strM13716);
                            int iM113011 = ThreadFactoryC3888.m11306("ۢۙ") ^ i23;
                            i26 = iM113011 ^ (-584559319);
                            i25 = ((iM113011 ^ i24) * (-7443)) ^ 488749918;
                            c6799 = c67913;
                            strM3407 = strM3407;
                        } catch (JSONException e) {
                            jSONException = e;
                            c6799 = c67913;
                            c67910 = c67910;
                            c6798 = c6798;
                            i35 = i35;
                            iM45029 = C19806.m45029("᩸ۖ") ^ i23;
                            c6799 = c6799;
                            i = ((iM45029 ^ i24) * (-503)) ^ (-1881648637);
                            i6 = 1794792127;
                            i2 = iM45029 ^ i6;
                            i35 = i35;
                            sArr4 = sArr4;
                            i30 = i30;
                            c6798 = c6798;
                            c67910 = c67910;
                            strM3407 = strM3407;
                            c6796 = c6799;
                            i26 = i2;
                            i25 = i;
                            c6799 = c6796;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        jSONException = e;
                        c67910 = c67910;
                        c6798 = c6798;
                        i35 = i35;
                        iM45029 = C19806.m45029("᩸ۖ") ^ i23;
                        c6799 = c6799;
                        i = ((iM45029 ^ i24) * (-503)) ^ (-1881648637);
                        i6 = 1794792127;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                        break;
                    }
                    break;
                case -853016042:
                case 168904322:
                    i16 = i30 + 1;
                    int iM4502112 = C19806.m45029("ۘ᩷") ^ i24;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i16;
                    i25 = ((iM4502112 ^ i23) * 25013) ^ (-387573969);
                    c6799 = c6799;
                    i26 = iM4502112 ^ (-1687948843);
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -790339225:
                case -765761344:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    iM6285 = iM6285;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    int i39 = s + s2;
                    if (i34 - (i39 * i39) < 0) {
                        iM11307 = (i24 - ThreadFactoryC3888.m11306("᩷֡")) * (-61);
                        i11 = ((iM11307 ^ i23) * (-22719)) ^ (-1220466023);
                        i12 = 1106032396;
                    } else {
                        iM11307 = (i23 - C19806.m45029("ۘۧ")) * (-119);
                        i11 = ((iM11307 ^ i24) * (-18819)) ^ (-1941746521);
                        i12 = 1995040880;
                    }
                    i21 = iM11307 ^ i12;
                    iM6285 = iM6285;
                    i35 = i35;
                    c6799 = c6799;
                    sArr4 = sArr4;
                    i26 = i21;
                    i25 = i11;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case -753569202:
                case 1546708057:
                    strM3407 = strM3407;
                    c67910 = c67910;
                    c6798 = c6798;
                    try {
                        zM3748 = C0962.m3748(itM9863);
                        iM11306 = ThreadFactoryC3888.m11306("ۧᩴ") ^ i24;
                        i3 = ((iM11306 ^ i23) * 22377) ^ (-1096634495);
                        i4 = 544372774;
                        i26 = iM11306 ^ i4;
                        i25 = i3;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    } catch (JSONException e3) {
                        jSONException = e3;
                        i35 = i35;
                        iM45029 = C19806.m45029("᩸ۖ") ^ i23;
                        c6799 = c6799;
                        i = ((iM45029 ^ i24) * (-503)) ^ (-1881648637);
                        i6 = 1794792127;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    }
                    break;
                case -670469267:
                case 861205066:
                    C1875.m6102(this, jSONException, str);
                    return z;
                case -547852045:
                case 965146084:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    jSONObject2 = new JSONObject();
                    jSONObject = new JSONObject();
                    iM45029 = (C19806.m45029("᩸۬") + i23) * 127;
                    i = ((iM45029 ^ i24) * 25241) ^ 714411003;
                    i6 = -673855890;
                    i2 = iM45029 ^ i6;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i2;
                    i25 = i;
                    c6799 = c6796;
                    break;
                case -515288533:
                case 524867056:
                    RunnableC0195.m1442(new C3973(this, jSONObject2, jSONObject));
                    return z;
                case -393388806:
                case 1317926300:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    str = null;
                    if (i30 < C0050.m938(arrayList)) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i24;
                        i = ((iM45029 ^ i23) * 18709) ^ (-277862601);
                        i6 = 1110399431;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܰ") ^ i23;
                        i = ((iM45029 ^ i24) * (-12421)) ^ 561503785;
                        i6 = 1839760511;
                    }
                    i2 = iM45029 ^ i6;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i2;
                    i25 = i;
                    c6799 = c6796;
                    break;
                case -33081497:
                case 588596077:
                    C6796 c67914 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    short[] sArr7 = sArr4;
                    C6796 c67915 = c6798;
                    int i40 = i30;
                    int i41 = i35;
                    int i42 = iM6285;
                    if (i42 == (C19806.m45029(strM1774) ^ 2097896204)) {
                        iM11308 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i23;
                        i14 = ((iM11308 ^ i24) * (-13529)) ^ 1899621182;
                        i15 = 769392203;
                    } else {
                        iM11308 = (i23 - ThreadFactoryC3888.m11306("ۗ᩵")) * 65;
                        i14 = ((iM11308 ^ i24) * 9509) ^ 194924634;
                        i15 = -546913123;
                    }
                    iM6285 = i42;
                    i35 = i41;
                    c6799 = c67914;
                    sArr4 = sArr7;
                    i26 = iM11308 ^ i15;
                    i30 = i40;
                    i25 = i14;
                    c6798 = c67915;
                    z2 = false;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case 36904733:
                case 1290951432:
                    RunnableC3388.m10064();
                    if (C3535.m10431() <= 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("᩸۠") + i24) * (-63);
                        i9 = ((iM450211 ^ i23) * (-4741)) ^ 1639161667;
                        i10 = -814713538;
                        i26 = iM450211 ^ i10;
                        i25 = i9;
                    } else {
                        c6797 = c6799;
                        strM3407 = strM3407;
                        c67910 = c67910;
                        i17 = i35;
                        c6798 = c6798;
                        sArr = sArr4;
                        iM450213 = C19806.m45029("ۗܿ") ^ i23;
                        sArr2 = sArr;
                        i3 = ((iM450213 ^ i24) * (-2343)) ^ 1123560769;
                        i18 = -500407185;
                        i35 = i17;
                        c6799 = c6797;
                        sArr4 = sArr2;
                        i26 = iM450213 ^ i18;
                        i25 = i3;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                    }
                    break;
                case 257746466:
                case 1791253508:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    iM6285 = C1937.m6285(menuItem);
                    strM1774 = C0278.m1774(f74820, 54, 3, i29);
                    if (C0671.m3008() >= 0) {
                        iM450212 = ThreadFactoryC3888.m11306("۫᩷") ^ i24;
                        i11 = ((iM450212 ^ i23) * 28333) ^ (-752807319);
                        i13 = -994455440;
                    } else {
                        iM450212 = (C19806.m45029("ܺۗ") + i24) * (-61);
                        i11 = ((iM450212 ^ i23) * (-27375)) ^ (-122178257);
                        i13 = -69451970;
                    }
                    i21 = iM450212 ^ i13;
                    i35 = i35;
                    c6799 = c6799;
                    sArr4 = sArr4;
                    i26 = i21;
                    i25 = i11;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case 287955657:
                case 545250611:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    iM6285 = iM6285;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    sArr3 = f74820;
                    c = '5';
                    if (RunnableC1564.f6300) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡ۫") + i23) * 69;
                        i11 = ((iM11307 ^ i24) * 22903) ^ 105320757;
                        i12 = 1211236566;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֡ۧ") ^ i23) * 83;
                        i11 = ((iM11307 ^ i24) * 10687) ^ (-986113059);
                        i12 = -1403176243;
                    }
                    i21 = iM11307 ^ i12;
                    iM6285 = iM6285;
                    i35 = i35;
                    c6799 = c6799;
                    sArr4 = sArr4;
                    i26 = i21;
                    i25 = i11;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                case 290966090:
                case 1434242781:
                    if (C1189.f5284 > 0) {
                        iM450211 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i23;
                        i9 = ((iM450211 ^ i24) * 8737) ^ 120994645;
                        i10 = -1329339765;
                        i26 = iM450211 ^ i10;
                        i25 = i9;
                    } else {
                        strM3407 = strM3407;
                        c67910 = c67910;
                        sArr4 = sArr4;
                        c6798 = c6798;
                        i30 = i30;
                        i35 = i35;
                        iM45029 = C19806.m45029("ۚ᩹") ^ i23;
                        i = ((iM45029 ^ i24) * 7027) ^ (-1695599236);
                        i6 = -758708773;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    }
                    break;
                case 291927150:
                case 1967094899:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    try {
                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                        iM45029 = C19806.m45029("ۗۧ") ^ i24;
                        i = ((iM45029 ^ i23) * (-28173)) ^ 1605805897;
                        i6 = -1981885313;
                    } catch (JSONException e4) {
                        jSONException = e4;
                        c6799 = c6799;
                        iM45029 = C19806.m45029("᩸ۖ") ^ i23;
                        c6799 = c6799;
                        i = ((iM45029 ^ i24) * (-503)) ^ (-1881648637);
                        i6 = 1794792127;
                    }
                    i2 = iM45029 ^ i6;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i2;
                    i25 = i;
                    c6799 = c6796;
                    break;
                case 414182414:
                case 524387629:
                    c6799 = c6799;
                    strM3407 = strM3407;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    int i43 = i35;
                    c6798 = c6798;
                    i30 = i30;
                    if (z3) {
                        i35 = i43;
                        iM45029 = (C19806.m45029("ۨ᩻") ^ i24) * 7;
                        i = ((iM45029 ^ i23) * 7017) ^ (-297678061);
                        i6 = -745279135;
                    } else {
                        iM45029 = C19806.m45029("ۚ֨") ^ i23;
                        i35 = i43;
                        i = ((iM45029 ^ i24) * 20023) ^ 883605711;
                        i6 = 814800438;
                    }
                    i2 = iM45029 ^ i6;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i2;
                    i25 = i;
                    c6799 = c6796;
                    break;
                case 688490152:
                case 1356639659:
                    C1977.m6356();
                    return false;
                case 749203141:
                case 2137083925:
                    z3 = true;
                    iM45029 = (ThreadFactoryC3888.m11306("᩺ܺ") + i23) * (-35);
                    i = ((iM45029 ^ i24) * 31359) ^ (-262611986);
                    i6 = 1225943918;
                    i2 = iM45029 ^ i6;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i2;
                    i25 = i;
                    c6799 = c6796;
                    break;
                case 773573836:
                case 1702870289:
                    try {
                        strM3407 = strM3407;
                        try {
                            strM6363 = C1977.m6363(f74820, 63, 3, i29);
                            iM11309 = ThreadFactoryC3888.m11306("۬۟") ^ i24;
                            i19 = ((iM11309 ^ i23) * (-28575)) ^ 1069648477;
                            i20 = -1313854321;
                            i26 = iM11309 ^ i20;
                            i25 = i19;
                            strM3407 = strM3407;
                        } catch (JSONException e5) {
                            e = e5;
                            jSONException = e;
                            c67910 = c67910;
                            c6798 = c6798;
                            i35 = i35;
                            iM45029 = C19806.m45029("᩸ۖ") ^ i23;
                            c6799 = c6799;
                            i = ((iM45029 ^ i24) * (-503)) ^ (-1881648637);
                            i6 = 1794792127;
                            i2 = iM45029 ^ i6;
                            i35 = i35;
                            sArr4 = sArr4;
                            i30 = i30;
                            c6798 = c6798;
                            c67910 = c67910;
                            strM3407 = strM3407;
                            c6796 = c6799;
                            i26 = i2;
                            i25 = i;
                            c6799 = c6796;
                        }
                    } catch (JSONException e6) {
                        e = e6;
                        strM3407 = strM3407;
                    }
                    break;
                case 927697567:
                case 1935633603:
                    try {
                        jSONObject.put(strM6363, strM3407);
                        c6799 = c6799;
                        strM3407 = strM3407;
                        c67910 = c67910;
                        sArr4 = sArr4;
                        c6798 = c6798;
                        i30 = i30;
                        i35 = i35;
                        iM45029 = C19806.m45029("ۗۧ") ^ i24;
                        i = ((iM45029 ^ i23) * (-28173)) ^ 1605805897;
                        i6 = -1981885313;
                    } catch (JSONException e7) {
                        jSONException = e7;
                        strM3407 = strM3407;
                        c67910 = c67910;
                        c6798 = c6798;
                        i35 = i35;
                        iM45029 = C19806.m45029("᩸ۖ") ^ i23;
                        c6799 = c6799;
                        i = ((iM45029 ^ i24) * (-503)) ^ (-1881648637);
                        i6 = 1794792127;
                    }
                    i2 = iM45029 ^ i6;
                    i35 = i35;
                    sArr4 = sArr4;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    c6796 = c6799;
                    i26 = i2;
                    i25 = i;
                    c6799 = c6796;
                    break;
                case 1323222730:
                case 1380843247:
                    strM3407 = strM3407;
                    iM450215 = C19806.m45029(C1460.m5047(sArr5, i27, i28, i29));
                    i31 = 2124781877;
                    if (C1668.f6641 < 0) {
                        iM11309 = (ThreadFactoryC3888.m11306("ܽ֫") ^ i23) * (-27);
                        i19 = ((iM11309 ^ i24) * 3789) ^ 1468039585;
                        i20 = -1326876479;
                        i26 = iM11309 ^ i20;
                        i25 = i19;
                        strM3407 = strM3407;
                    }
                    c6799 = c6799;
                    iM6285 = iM6285;
                    c67910 = c67910;
                    sArr4 = sArr4;
                    c6798 = c6798;
                    i30 = i30;
                    i35 = i35;
                    iM11307 = (ThreadFactoryC3888.m11306("ۡ۫") + i23) * 69;
                    i11 = ((iM11307 ^ i24) * 22903) ^ 105320757;
                    i12 = 1211236566;
                    i21 = iM11307 ^ i12;
                    iM6285 = iM6285;
                    i35 = i35;
                    c6799 = c6799;
                    sArr4 = sArr4;
                    i26 = i21;
                    i25 = i11;
                    i30 = i30;
                    c6798 = c6798;
                    c67910 = c67910;
                    strM3407 = strM3407;
                    break;
                default:
                    strM3407 = strM3407;
                    this.f74828.m44413(z2 ? 1 : 0);
                    sArr5 = f74820;
                    i27 = 60;
                    i28 = 3;
                    if (CallableC1627.m5507() == 0) {
                        int iM113012 = (ThreadFactoryC3888.m11306("᩵ۨ") + i24) * 35;
                        i26 = iM113012 ^ 307679284;
                        i25 = ((iM113012 ^ i23) * 12461) ^ 1490759406;
                        strM3407 = strM3407;
                    } else {
                        c67910 = c67910;
                        sArr4 = sArr4;
                        c6798 = c6798;
                        i30 = i30;
                        i35 = i35;
                        iM45029 = C19806.m45029("ۚ᩹") ^ i23;
                        i = ((iM45029 ^ i24) * 7027) ^ (-1695599236);
                        i6 = -758708773;
                        i2 = iM45029 ^ i6;
                        i35 = i35;
                        sArr4 = sArr4;
                        i30 = i30;
                        c6798 = c6798;
                        c67910 = c67910;
                        strM3407 = strM3407;
                        c6796 = c6799;
                        i26 = i2;
                        i25 = i;
                        c6799 = c6796;
                    }
                    break;
            }
        }
    }
}
