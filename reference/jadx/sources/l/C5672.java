package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5672 implements InterfaceC18848, InterfaceC1692, InterfaceC16464, InterfaceC14394, InterfaceC3740, InterfaceC13320 {

    /* JADX INFO: renamed from: ۠᩵ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f19351 = {9362, -14140, 12520, -15179, -13825, 9826, 8579, 24575, 24573, 24569, 13770, -9990, 8863, -13634, -15406, -13105, 16271, 10369, 14686, -11987, 8531, 8610, 24575, 24573, 24564, 24563, 24575, 24573, 24553, 24556, 24565, -12788, -11576, 15063, 2525, -10668, -10560};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19352;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19353;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m15562() {
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m15563() {
    }

    @Override // l.InterfaceC1692
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC14394
    public void onGetPath(Bundle bundle, String str) {
        int i = -1701972969;
        int i2 = C1460.f5948;
        int i3 = C1189.f5284;
        int iM11306 = (ThreadFactoryC3888.m11306("ܰᩳ") ^ i3) * (-121);
        int i4 = ((iM11306 ^ i2) * (-13985)) ^ (-1978677719);
        int i5 = -165226564;
        while (true) {
            i = ((((i ^ i2) * (-5149)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2028161104:
                case -1520183020:
                    if (C0671.f2816 != 0) {
                        iM11306 = C19806.m45029("᩶۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12361) ^ 729021521;
                        i5 = -1646459643;
                    } else {
                        iM11306 = C19806.m45029("᩵ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5767) ^ (-2051123914);
                        i5 = 1782844312;
                    }
                    break;
                case -1912223502:
                case -360525681:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("᩹ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17641) ^ 1033577355;
                        i5 = -1751623585;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵᩺")) * (-61);
                        i4 = ((iM11306 ^ i2) * (-19717)) ^ (-1342685950);
                        i5 = -1191974892;
                    }
                    break;
                case -1907247839:
                case 1371861935:
                    ViewOnClickListenerC15847 viewOnClickListenerC15847 = (ViewOnClickListenerC15847) this.f19353;
                    viewOnClickListenerC15847.m37715(new Runnable() { // from class: l.᩹ۢۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            String string = bundle.getString(MotionUtils.EASING_TYPE_PATH);
                            ViewOnClickListenerC15847 viewOnClickListenerC15848 = viewOnClickListenerC15847;
                            new C19374(viewOnClickListenerC15848, (AbstractActivityC12483) viewOnClickListenerC15848.requireActivity(), str, string).m10243();
                        }
                    });
                    break;
                case -1876598683:
                case -1065852287:
                    AbstractC0464.m2313();
                    C0278.m1789();
                    break;
                case -1771457318:
                case -1580517148:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("ۖۢ") ^ i3) * 17;
                        i4 = ((iM11306 ^ i2) * (-3927)) ^ 1063236030;
                        i5 = 1486099537;
                    } else {
                        iM11306 = C19806.m45029("᩻۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15507)) ^ 1747294951;
                        i5 = -1886367937;
                    }
                    break;
                case -1634873458:
                case -1559176683:
                    if (C2871.m8646()) {
                        iM11306 = (i2 - C19806.m45029("ۖۛ")) * (-5);
                        i4 = ((iM11306 ^ i3) * (-18223)) ^ (-805466393);
                        i5 = 1628535236;
                    } else {
                        iM11306 = (C19806.m45029("ۖۢ") ^ i3) * 17;
                        i4 = ((iM11306 ^ i2) * (-3927)) ^ 1063236030;
                        i5 = 1486099537;
                    }
                    break;
                case -1560269056:
                case 61032663:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = C19806.m45029("᩹ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17641) ^ 1033577355;
                        i5 = -1751623585;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22527) ^ 1782356468;
                        i5 = 1949515428;
                    }
                    break;
                case -928739926:
                case -2765110:
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("᩶۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12361) ^ 729021521;
                        i5 = -1646459643;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۤ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * 4593) ^ 10098406;
                        i5 = 1936077941;
                    }
                    break;
                case -814511343:
                case 741893276:
                    C0817.m3399();
                    iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 22527) ^ 1782356468;
                    i5 = 1949515428;
                    break;
                case -404902539:
                case -207854846:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (C19806.m45029("ۖۢ") ^ i3) * 17;
                        i4 = ((iM11306 ^ i2) * (-3927)) ^ 1063236030;
                        i5 = 1486099537;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22527) ^ 1782356468;
                        i5 = 1949515428;
                    }
                    break;
                case -308771838:
                case 442957354:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18739) ^ (-1743284692);
                        i5 = 1192595752;
                    } else {
                        iM11306 = C19806.m45029("᩹ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17641) ^ 1033577355;
                        i5 = -1751623585;
                    }
                    break;
                case -117561004:
                case 665778071:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (C19806.m45029("ۖۢ") ^ i3) * 17;
                        i4 = ((iM11306 ^ i2) * (-3927)) ^ 1063236030;
                        i5 = 1486099537;
                    } else {
                        iM11306 = (C19806.m45029("᩻ܿ") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * (-24127)) ^ 897995410;
                        i5 = 1235532085;
                    }
                    break;
                case 282368118:
                case 906202776:
                    if (C3535.m10431() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18739) ^ (-1743284692);
                        i5 = 1192595752;
                    } else {
                        iM11306 = (C19806.m45029("ۤۚ") + i2) * (-37);
                        i4 = ((iM11306 ^ i3) * 4683) ^ (-1475583847);
                        i5 = -1627948162;
                    }
                    break;
                case 321857200:
                case 1092527953:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("ۖۢ") ^ i3) * 17;
                        i4 = ((iM11306 ^ i2) * (-3927)) ^ 1063236030;
                        i5 = 1486099537;
                    } else {
                        iM11306 = C19806.m45029("ۢ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21577)) ^ 217632869;
                        i5 = -770320540;
                    }
                    break;
                case 418171042:
                case 809517779:
                    if (C7105.m18985()) {
                        iM11306 = C19806.m45029("᩶۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12361) ^ 729021521;
                        i5 = -1646459643;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۠ۧ")) * (-93);
                        i4 = ((iM11306 ^ i3) * 6157) ^ 1550725803;
                        i5 = -1658961199;
                    }
                    break;
                default:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18739) ^ (-1743284692);
                        i5 = 1192595752;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧᩳ") ^ i3) * 97;
                        i4 = ((iM11306 ^ i2) * 23427) ^ 17528546;
                        i5 = 1918633065;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC1692
    /* JADX INFO: renamed from: ۙ */
    public void mo3908(String str) {
        Object obj = null;
        int i = -221048911;
        int i2 = C10634.f36300;
        int i3 = C2871.f10837;
        int iM45029 = C19806.m45029("᩹ۙ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-18243)) ^ (-429944506);
        int i5 = 1523644581;
        while (true) {
            i = ((((i ^ i2) * 12583) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1983370059:
                case 103459624:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29427)) ^ 1125420116;
                        i5 = 1110364486;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ֨")) * 19;
                        i4 = ((iM45029 ^ i2) * (-12405)) ^ 1186639421;
                        i5 = 1074077670;
                    }
                    break;
                case -1785735708:
                case -400305751:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29427)) ^ 1125420116;
                        i5 = 1110364486;
                    } else {
                        iM45029 = (C19806.m45029("᩵᩵") + i2) * 49;
                        i4 = ((iM45029 ^ i3) * 5849) ^ 794587403;
                        i5 = 661895986;
                    }
                    break;
                case -1784261864:
                case 2022202274:
                    C1025.m3861();
                    if (!RunnableC3388.m10064()) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۚۗ")) * 13;
                        i4 = ((iM45029 ^ i3) * 17115) ^ 166111598;
                        i5 = -266054302;
                    } else {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26031) ^ 1855572971;
                        i5 = 1248892163;
                    }
                    break;
                case -1676307267:
                case 804993546:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9869)) ^ (-1619117636);
                        i5 = 919341858;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜܽ")) * 71;
                        i4 = ((iM45029 ^ i3) * (-4723)) ^ 2035190175;
                        i5 = 1091475897;
                    }
                    break;
                case -1594507478:
                case -907187294:
                    if (C1461.m5080()) {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26031) ^ 1855572971;
                        i5 = 1248892163;
                    } else {
                        iM45029 = C19806.m45029("᩻ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29163) ^ (-2075947260);
                        i5 = -1862468129;
                    }
                    break;
                case -1259353953:
                case 939120122:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29427)) ^ 1125420116;
                        i5 = 1110364486;
                    } else {
                        iM45029 = (C19806.m45029("ܰ֫") ^ i3) * (-53);
                        i4 = ((iM45029 ^ i2) * (-11149)) ^ (-50816182);
                        i5 = 1039250815;
                    }
                    break;
                case -1212999127:
                case -1048325726:
                    ((ActivityC0567) obj).f2351.mo23642(str);
                    break;
                case -1212698738:
                case -1006220773:
                    obj = this.f19353;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("᩸ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15757)) ^ (-1380715358);
                        i5 = 659913467;
                    } else {
                        iM45029 = C19806.m45029("۠ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19533)) ^ 943913259;
                        i5 = 2122838478;
                    }
                    break;
                case -1211134258:
                case 459574699:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۚۗ")) * 13;
                        i4 = ((iM45029 ^ i3) * 17115) ^ 166111598;
                        i5 = -266054302;
                    } else {
                        iM45029 = C19806.m45029("ܰۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 913) ^ 1078612216;
                        i5 = -1996633029;
                    }
                    break;
                case -1209670103:
                case 1797908445:
                    if (C3286.f12186) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜܽ")) * 71;
                        i4 = ((iM45029 ^ i3) * (-4723)) ^ 2035190175;
                        i5 = 1091475897;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ۟")) * (-61);
                        i4 = ((iM45029 ^ i2) * (-1551)) ^ (-1917968028);
                        i5 = 2075668146;
                    }
                    break;
                case -986162323:
                case -125584037:
                    C1148.m4232();
                    break;
                case -253856136:
                case 1135316605:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜܽ")) * 71;
                        i4 = ((iM45029 ^ i3) * (-4723)) ^ 2035190175;
                        i5 = 1091475897;
                    } else {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26031) ^ 1855572971;
                        i5 = 1248892163;
                    }
                    break;
                case 130297532:
                case 1985906714:
                    if (C0797.f3386) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜܽ")) * 71;
                        i4 = ((iM45029 ^ i3) * (-4723)) ^ 2035190175;
                        i5 = 1091475897;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۛܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * (-11037)) ^ 336687787;
                        i5 = 1066498138;
                    }
                    break;
                case 659028647:
                case 1807513437:
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26031) ^ 1855572971;
                        i5 = 1248892163;
                    } else {
                        iM45029 = C19806.m45029("ܳۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17867)) ^ (-2051183763);
                        i5 = -1449887448;
                    }
                    break;
                case 904711716:
                case 1125251636:
                    if (C0526.m2437() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29427)) ^ 1125420116;
                        i5 = 1110364486;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜܽ")) * 71;
                        i4 = ((iM45029 ^ i3) * (-4723)) ^ 2035190175;
                        i5 = 1091475897;
                    }
                    break;
                default:
                    C2704.m8255();
                    C1668.m5583();
                    iM45029 = C19806.m45029("ᩳۧ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 26031) ^ 1855572971;
                    i5 = 1248892163;
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public /* synthetic */ boolean mo1180() {
        return false;
    }

    public /* synthetic */ C5672(int i, Object obj) {
        int i2 = 2112324212;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        this.f19352 = i;
        this.f19353 = obj;
        int iM11306 = ThreadFactoryC3888.m11306("ܿܺ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-23229)) ^ 1527275717;
        int i6 = 1236492640;
        while (true) {
            i2 = (iM11306 ^ i6) ^ (i5 & (((i2 ^ i3) * (-23857)) >> 31));
            switch (i2) {
                case -1947160045:
                case 1353035419:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    throw new RuntimeException();
                case -1590873046:
                case -306009578:
                    C2124.m6673();
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ۧ᩹") + i3) * 99;
                        i5 = ((iM11306 ^ i4) * (-13275)) ^ (-740746879);
                        i6 = 947844409;
                    } else {
                        iM11306 = C19806.m45029("ܳ۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 24915) ^ (-107768805);
                        i6 = -2046654465;
                    }
                    break;
                case -1425245967:
                case -391015668:
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("᩹۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 25995) ^ 1908391127;
                        i6 = 2890255;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 25005) ^ 2115709907;
                        i6 = -403822642;
                    }
                    break;
                case -1064719395:
                case 988177374:
                    C2332.m7079();
                    iM11306 = (C19806.m45029("ۧ᩹") + i3) * 99;
                    i5 = ((iM11306 ^ i4) * (-13275)) ^ (-740746879);
                    i6 = 947844409;
                    break;
                case -719436249:
                case 750476622:
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩺") ^ i4;
                        i5 = ((iM11306 ^ i3) * 24671) ^ (-1212879755);
                        i6 = 1636529811;
                    } else {
                        iM11306 = (C19806.m45029("ۧ᩹") + i3) * 99;
                        i5 = ((iM11306 ^ i4) * (-13275)) ^ (-740746879);
                        i6 = 947844409;
                    }
                    break;
                case 1057885377:
                case 1189931144:
                    return;
                default:
                    RunnableC3388.m10064();
                    if (C3743.f13569) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩹") + i3) * 95;
                        i5 = ((iM11306 ^ i4) * (-27033)) ^ (-848769966);
                        i6 = -631832675;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩺") ^ i4;
                        i5 = ((iM11306 ^ i3) * 24671) ^ (-1212879755);
                        i6 = 1636529811;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ */
    public Bitmap mo947() {
        return C5443.m15048((InterfaceC13911) this.f19353);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public void mo1179(AbstractC23903 abstractC23903) {
        Object obj = null;
        int i = -1042498686;
        int i2 = C1066.f4915;
        int i3 = C7105.f23796;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ܺܰ")) * 97;
        int i4 = ((iM11306 ^ i2) * (-23297)) ^ 1480438935;
        int i5 = 344286453;
        while (true) {
            i = ((((i ^ i2) * 5101) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1935196648:
                case 208485397:
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13807)) ^ 1647973541;
                        i5 = 1324002913;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-15867)) ^ (-1596954588);
                        i5 = 1018797313;
                    }
                    break;
                case -1857874297:
                case 1770592943:
                    ThreadFactoryC3888.m11300();
                    C2124.m6673();
                    iM11306 = ThreadFactoryC3888.m11306("۟᩺") ^ i2;
                    i4 = ((iM11306 ^ i3) * 721) ^ (-620170258);
                    i5 = 1497129481;
                    break;
                case -1534681115:
                case -341351789:
                    if (C2249.m6915() <= 0) {
                        iM11306 = (C19806.m45029("ۚۖ") + i3) * 63;
                        i4 = ((iM11306 ^ i2) * 3395) ^ 24722952;
                        i5 = -1068774754;
                    } else {
                        iM11306 = (C19806.m45029("᩶֫") ^ i3) * (-75);
                        i4 = ((iM11306 ^ i2) * (-10377)) ^ (-1713671399);
                        i5 = 231616506;
                    }
                    break;
                case -1484852824:
                case 1015063580:
                    C2704.m8255();
                    break;
                case -1439913414:
                case 1493602138:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩹") + i3) * (-35);
                        i4 = ((iM11306 ^ i2) * (-25225)) ^ 991904852;
                        i5 = 1034869157;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۧ") ^ i3) * 27;
                        i4 = ((iM11306 ^ i2) * 18613) ^ 1340987308;
                        i5 = -65208519;
                    }
                    break;
                case -1263432718:
                case -1154887764:
                    if (C3286.f12186) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩹") + i3) * (-35);
                        i4 = ((iM11306 ^ i2) * (-25225)) ^ 991904852;
                        i5 = 1034869157;
                    } else {
                        iM11306 = (C19806.m45029("ۡۙ") + i2) * (-7);
                        i4 = ((iM11306 ^ i3) * 24493) ^ 1527123833;
                        i5 = -432757270;
                    }
                    break;
                case -1099090984:
                case 909040277:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("᩶᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27367)) ^ 62657523;
                        i5 = -1651607355;
                    } else {
                        iM11306 = (C19806.m45029("ۤۜ") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-26601)) ^ 164141481;
                        i5 = -1115714592;
                    }
                    break;
                case -899907305:
                case -183064314:
                    ((InterfaceC13320) obj).mo1179(abstractC23903);
                    break;
                case -773817156:
                case 2122950400:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13807)) ^ 1647973541;
                        i5 = 1324002913;
                    } else {
                        iM11306 = C19806.m45029("᩶ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 25275) ^ (-1318151075);
                        i5 = -127341768;
                    }
                    break;
                case -486718128:
                case 1751438619:
                    obj = this.f19353;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ۚۖ") + i3) * 63;
                        i4 = ((iM11306 ^ i2) * 3395) ^ 24722952;
                        i5 = -1068774754;
                    } else {
                        iM11306 = C19806.m45029("ۨᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17863) ^ 806210327;
                        i5 = -1344251662;
                    }
                    break;
                case -456230214:
                case 1376652159:
                    if (RunnableC1564.m5345()) {
                        iM11306 = (C19806.m45029("ۤۜ") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-26601)) ^ 164141481;
                        i5 = -1115714592;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺᩴ") + i2) * 17;
                        i4 = ((iM11306 ^ i3) * 30737) ^ (-1941048902);
                        i5 = -840802691;
                    }
                    break;
                case -130998422:
                case 1975607833:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13807)) ^ 1647973541;
                        i5 = 1324002913;
                    } else {
                        iM11306 = C19806.m45029("֫ܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-981)) ^ (-1398345019);
                        i5 = 681158292;
                    }
                    break;
                case 246227147:
                case 2071923122:
                    if (C2642.f10294 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13807)) ^ 1647973541;
                        i5 = 1324002913;
                    } else {
                        iM11306 = (C19806.m45029("ۤۜ") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-26601)) ^ 164141481;
                        i5 = -1115714592;
                    }
                    break;
                case 510905121:
                case 961623089:
                    RunnableC3388.m10064();
                    if (!C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 721) ^ (-620170258);
                        i5 = 1497129481;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩹") + i3) * (-35);
                        i4 = ((iM11306 ^ i2) * (-25225)) ^ 991904852;
                        i5 = 1034869157;
                    }
                    break;
                case 637506635:
                case 727039060:
                    if (!RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("ۤۜ") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-26601)) ^ 164141481;
                        i5 = -1115714592;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 721) ^ (-620170258);
                        i5 = 1497129481;
                    }
                    break;
                default:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 721) ^ (-620170258);
                        i5 = 1497129481;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1787) ^ (-879238796);
                        i5 = -1737849518;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        Object obj = null;
        String str = null;
        int i = -995366027;
        int i2 = C1189.f5284;
        int i3 = C10634.f36300;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢۤ")) * 71;
        int i4 = ((iM11306 ^ i2) * 12047) ^ 90249534;
        int i5 = 1313978908;
        while (true) {
            i = ((((i ^ i2) * 24917) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1717453041:
                case -1267379901:
                    obj = this.f19353;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֨") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * 597) ^ 927522698;
                        i5 = -1752405125;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨ᩳ")) * (-87);
                        i4 = ((iM11306 ^ i2) * 12497) ^ 299652477;
                        i5 = 1451031803;
                    }
                    break;
                case -1578365663:
                case 1769880712:
                    ThreadFactoryC3888.m11300();
                    C3722.m10894();
                    iM11306 = (C19806.m45029("᩶۠") ^ i2) * (-73);
                    i4 = ((iM11306 ^ i3) * 23273) ^ (-1665429793);
                    i5 = -173381232;
                    break;
                case -1526054508:
                case 159663837:
                    C2332.m7079();
                    return null;
                case -1517714105:
                case 1139685211:
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14189) ^ (-563025329);
                        i5 = 55307653;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֨") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * 597) ^ 927522698;
                        i5 = -1752405125;
                    }
                    break;
                case -1490125114:
                case 2028503688:
                    throw new C9573(str);
                case -1398736878:
                case 20377931:
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("᩶۠") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 23273) ^ (-1665429793);
                        i5 = -173381232;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܽۧ")) * (-103);
                        i4 = ((iM11306 ^ i3) * (-17625)) ^ (-63905761);
                        i5 = -157281187;
                    }
                    break;
                case -1275244126:
                case -505145061:
                    if (C1148.m4232() <= 0) {
                        iM11306 = C19806.m45029("᩸ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 9007) ^ (-41825002);
                        i5 = 1846477077;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8331)) ^ (-491015223);
                        i5 = 1216452406;
                    }
                    break;
                case -787954143:
                case 764717532:
                    C1668.m5583();
                    if (C10634.m26820()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܽ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM11306 ^ i3) * (-19685)) ^ 1250791668;
                        i5 = -695304673;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֨") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * 597) ^ 927522698;
                        i5 = -1752405125;
                    }
                    break;
                case -667952016:
                case 1478031681:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֨") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * 597) ^ 927522698;
                        i5 = -1752405125;
                    } else {
                        iM11306 = C19806.m45029("ۛ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32433) ^ 1148230658;
                        i5 = -1011142430;
                    }
                    break;
                case -142191888:
                case 1380795866:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("᩶۠") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 23273) ^ (-1665429793);
                        i5 = -173381232;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14527)) ^ 1853054979;
                        i5 = 329580281;
                    }
                    break;
                case -97152208:
                case 960186936:
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i3) * 67;
                        i4 = ((iM11306 ^ i2) * 29371) ^ 465946721;
                        i5 = -1772600735;
                    } else {
                        iM11306 = (C19806.m45029("᩶۠") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 23273) ^ (-1665429793);
                        i5 = -173381232;
                    }
                    break;
                case -96251579:
                case 1359825050:
                    C0817.m3399();
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֨") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * 597) ^ 927522698;
                        i5 = -1752405125;
                    } else {
                        iM11306 = (C19806.m45029("᩶۠") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 23273) ^ (-1665429793);
                        i5 = -173381232;
                    }
                    break;
                case 126193119:
                case 676183595:
                    if (C1398.m4895() <= 0) {
                        iM11306 = (C19806.m45029("᩶۠") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 23273) ^ (-1665429793);
                        i5 = -173381232;
                    } else {
                        iM11306 = (C19806.m45029("ۤܰ") ^ i2) * (-55);
                        i4 = ((iM11306 ^ i3) * 10065) ^ 922587935;
                        i5 = 955253717;
                    }
                    break;
                case 403045233:
                case 625488210:
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֨") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * 597) ^ 927522698;
                        i5 = -1752405125;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ֡") + i2) * (-23);
                        i4 = ((iM11306 ^ i3) * 30561) ^ (-2036758046);
                        i5 = 1790102126;
                    }
                    break;
                case 580514521:
                case 1930277212:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (C19806.m45029("᩶۠") ^ i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 23273) ^ (-1665429793);
                        i5 = -173381232;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢᩴ")) * 123;
                        i4 = ((iM11306 ^ i2) * (-8503)) ^ 1555473718;
                        i5 = -289426520;
                    }
                    break;
                default:
                    str = (String) obj;
                    if (C3743.m10966() <= 0) {
                        iM11306 = C19806.m45029("᩸ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 9007) ^ (-41825002);
                        i5 = 1846477077;
                    } else {
                        iM11306 = (C19806.m45029("ۚܽ") + i3) * (-103);
                        i4 = ((iM11306 ^ i2) * (-32241)) ^ (-1182416689);
                        i5 = 1548652758;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        short[] sArr;
        C12562 c12562;
        Spinner spinner;
        C12562 c12563;
        short[] sArr2;
        TextView textView;
        C8067 c8067;
        InterfaceC6025 interfaceC6025;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        DialogInterface.OnClickListener onClickListener;
        boolean z;
        TextView textView2;
        int i;
        final TextView textView3;
        int iM45029;
        int i2;
        int i3;
        short[] sArr3;
        InterfaceC6025 interfaceC6026;
        String str;
        short[] sArr4;
        int i4;
        short[] sArr5;
        short[] sArr6;
        DialogInterface.OnClickListener onClickListener2;
        short[] sArr7;
        int iM450210;
        int i5;
        int i6;
        short[] sArr8;
        int iM450211;
        int i7;
        int i8;
        DialogInterface.OnClickListener onClickListener3;
        short[] sArr9;
        short[] sArr10;
        InterfaceC6025 interfaceC6027;
        String str2;
        short[] sArr11;
        int i9;
        int i10;
        short[] sArr12;
        int i11;
        short[] sArr13;
        TextView textView4;
        Spinner spinner2;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2;
        TextView textView5;
        C8067 c8068;
        int iM450212;
        int i12;
        int i13;
        int i14 = 0;
        String strM10901 = null;
        int iM450213 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -670139317;
        int i18 = C3660.f13403;
        int i19 = C1937.f7317;
        int iM450214 = (C19806.m45029("۬ۧ") + i19) * 41;
        int i20 = ((iM450214 ^ i18) * (-29693)) ^ (-138009849);
        int i21 = iM450214 ^ 975820695;
        C23144 c23144 = null;
        String str3 = null;
        TextView textView6 = null;
        C12562 c12564 = null;
        C8067 c8069 = null;
        DialogInterface.OnClickListener onClickListener4 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        boolean z2 = false;
        boolean z3 = false;
        C11545 c11545 = null;
        short s = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        Main main = null;
        InterfaceC6025 interfaceC6028 = null;
        final TextView textView7 = null;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener3 = null;
        InterfaceC6025 interfaceC6029 = null;
        short[] sArr19 = null;
        int i26 = 0;
        final Spinner spinnerM51138 = null;
        View viewM8167 = null;
        View viewM9787 = null;
        int i27 = 0;
        C12562 c12565 = null;
        final C12562 c12566 = null;
        String strM45020 = null;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * 27835) >> 31));
            switch (i17) {
                case -1921732078:
                case -535884856:
                    sArr = sArr19;
                    c12562 = c12566;
                    spinner = spinnerM51138;
                    c12563 = c12564;
                    sArr2 = sArr18;
                    textView = textView6;
                    c8067 = c8069;
                    interfaceC6025 = interfaceC6029;
                    onCheckedChangeListener = onCheckedChangeListener3;
                    onClickListener = onClickListener4;
                    boolean z4 = z3;
                    c23144 = c23144;
                    z = z4;
                    TextView textView8 = (TextView) viewM8167;
                    int iM11306 = ThreadFactoryC3888.m11306(ThreadFactoryC3888.m11312(f19351, 16, 3, i26));
                    if (C0962.m3746() < 0) {
                        int iM450215 = (C19806.m45029("ۚܽ") + i19) * 23;
                        int i28 = ((iM450215 ^ i18) * 16149) ^ 697224905;
                        i21 = iM450215 ^ (-682840281);
                        sArr18 = sArr2;
                        onClickListener4 = onClickListener;
                        sArr19 = sArr;
                        onCheckedChangeListener3 = onCheckedChangeListener;
                        interfaceC6029 = interfaceC6025;
                        c8069 = c8067;
                        c12564 = c12563;
                        c12566 = c12562;
                        i14 = iM11306;
                        i20 = i28;
                        textView6 = textView;
                        spinnerM51138 = spinner;
                        textView7 = textView8;
                        C23144 c23145 = c23144;
                        z3 = z;
                        c23144 = c23145;
                    } else {
                        textView2 = textView8;
                        i14 = iM11306;
                        int iM11307 = ThreadFactoryC3888.m11306("۟ۜ") ^ i19;
                        i21 = iM11307 ^ (-1568313074);
                        i20 = ((iM11307 ^ i18) * 14351) ^ (-1422311634);
                        sArr18 = sArr2;
                        textView6 = textView;
                        onClickListener4 = onClickListener;
                        sArr19 = sArr;
                        spinnerM51138 = spinner;
                        onCheckedChangeListener3 = onCheckedChangeListener;
                        textView7 = textView2;
                        interfaceC6029 = interfaceC6025;
                        c8069 = c8067;
                        c12564 = c12563;
                        c12566 = c12562;
                        C23144 c23146 = c23144;
                        z3 = z;
                        c23144 = c23146;
                    }
                    break;
                case -1858613695:
                case -564728166:
                    C2871.m8646();
                    if (C2477.f9839 <= 0) {
                        sArr3 = sArr19;
                        c12566 = c12566;
                        c12564 = c12564;
                        sArr6 = sArr18;
                        c8069 = c8069;
                        interfaceC6029 = interfaceC6029;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        onClickListener2 = onClickListener4;
                        sArr7 = sArr15;
                        TextView textView9 = textView6;
                        textView7 = textView7;
                        spinnerM51138 = spinnerM51138;
                        textView3 = textView9;
                        boolean z5 = z3;
                        c23144 = c23144;
                        z = z5;
                        int iM11308 = (i19 - ThreadFactoryC3888.m11306("۟ۧ")) * (-45);
                        i21 = iM11308 ^ 1180294283;
                        sArr15 = sArr7;
                        i20 = ((iM11308 ^ i18) * 8627) ^ 738669093;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        interfaceC6029 = interfaceC6029;
                        c8069 = c8069;
                        c12564 = c12564;
                        c12566 = c12566;
                        TextView textView10 = textView3;
                        spinnerM51138 = spinnerM51138;
                        textView7 = textView7;
                        textView6 = textView10;
                        C23144 c23147 = c23144;
                        z3 = z;
                        c23144 = c23147;
                    }
                    sArr9 = sArr19;
                    c12566 = c12566;
                    interfaceC6027 = interfaceC6028;
                    str2 = str3;
                    c12564 = c12564;
                    sArr11 = sArr14;
                    i9 = i22;
                    sArr12 = sArr16;
                    i11 = i24;
                    sArr13 = sArr17;
                    sArr10 = sArr18;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    onClickListener3 = onClickListener4;
                    i10 = i23;
                    TextView textView11 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView11;
                    boolean z6 = z3;
                    c23144 = c23144;
                    z = z6;
                    int iM450216 = C19806.m45029("᩻᩺") ^ i19;
                    sArr14 = sArr11;
                    i20 = ((iM450216 ^ i18) * 5251) ^ 2002189264;
                    i21 = iM450216 ^ 1241284570;
                    i23 = i10;
                    i22 = i9;
                    i24 = i11;
                    sArr17 = sArr13;
                    onClickListener4 = onClickListener3;
                    sArr19 = sArr9;
                    sArr18 = sArr10;
                    interfaceC6028 = interfaceC6027;
                    sArr16 = sArr12;
                    str3 = str2;
                    sArr14 = sArr14;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView12 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView12;
                    C23144 c23148 = c23144;
                    z3 = z;
                    c23144 = c23148;
                    break;
                case -1652270348:
                case -376861650:
                    textView3 = textView6;
                    z = z3;
                    i26 = 24475;
                    int iM450217 = (C19806.m45029("᩷ܽ") + i18) * 29;
                    i21 = iM450217 ^ 1757260225;
                    i20 = ((iM450217 ^ i19) * 5433) ^ (-1931254789);
                    i22 = i22;
                    i24 = i24;
                    sArr17 = sArr17;
                    onClickListener4 = onClickListener4;
                    sArr19 = sArr19;
                    sArr18 = sArr18;
                    interfaceC6028 = interfaceC6028;
                    sArr16 = sArr16;
                    str3 = str3;
                    sArr15 = sArr15;
                    sArr14 = sArr14;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView13 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView13;
                    C23144 c23149 = c23144;
                    z3 = z;
                    c23144 = c23149;
                    break;
                case -1572649496:
                case 133193963:
                    RunnableC0195.m1431();
                    c12562 = c12566;
                    textView4 = textView7;
                    spinner2 = spinnerM51138;
                    onCheckedChangeListener2 = onCheckedChangeListener3;
                    c12563 = c12564;
                    textView5 = textView6;
                    c8068 = c8069;
                    boolean z7 = z3;
                    c23144 = c23144;
                    z = z7;
                    iM450212 = (C19806.m45029("᩵ۘ") ^ i18) * 81;
                    i12 = ((iM450212 ^ i19) * 28601) ^ 132725498;
                    i13 = -2090515295;
                    i21 = iM450212 ^ i13;
                    onCheckedChangeListener3 = onCheckedChangeListener2;
                    i20 = i12;
                    textView6 = textView5;
                    c8069 = c8068;
                    spinnerM51138 = spinner2;
                    textView7 = textView4;
                    c12564 = c12563;
                    c12566 = c12562;
                    C23144 c231410 = c23144;
                    z3 = z;
                    c23144 = c231410;
                    break;
                case -1495393971:
                case 692610320:
                    sArr3 = sArr19;
                    c12566 = c12566;
                    interfaceC6026 = interfaceC6028;
                    str = str3;
                    c12564 = c12564;
                    sArr4 = sArr16;
                    i4 = i24;
                    sArr5 = sArr17;
                    sArr6 = sArr18;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    onClickListener2 = onClickListener4;
                    sArr7 = sArr15;
                    TextView textView14 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView14;
                    boolean z8 = z3;
                    c23144 = c23144;
                    z = z8;
                    sArr14 = f19351;
                    i22 = 1;
                    i23 = 3;
                    if (!RunnableC1895.f7152) {
                        i24 = i4;
                        sArr17 = sArr5;
                        interfaceC6028 = interfaceC6026;
                        sArr16 = sArr4;
                        str3 = str;
                        int iM11309 = (i19 - ThreadFactoryC3888.m11306("۟ۧ")) * (-45);
                        i21 = iM11309 ^ 1180294283;
                        sArr15 = sArr7;
                        i20 = ((iM11309 ^ i18) * 8627) ^ 738669093;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        interfaceC6029 = interfaceC6029;
                        c8069 = c8069;
                        c12564 = c12564;
                        c12566 = c12566;
                        TextView textView15 = textView3;
                        spinnerM51138 = spinnerM51138;
                        textView7 = textView7;
                        textView6 = textView15;
                        C23144 c231411 = c23144;
                        z3 = z;
                        c23144 = c231411;
                    } else {
                        iM450210 = C19806.m45029("ۖ᩶") ^ i18;
                        i5 = ((iM450210 ^ i19) * 22819) ^ 309832659;
                        i6 = -2024680937;
                        i21 = iM450210 ^ i6;
                        sArr15 = sArr7;
                        i20 = i5;
                        i24 = i4;
                        sArr17 = sArr5;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                        interfaceC6028 = interfaceC6026;
                        sArr16 = sArr4;
                        str3 = str;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        interfaceC6029 = interfaceC6029;
                        c8069 = c8069;
                        c12564 = c12564;
                        c12566 = c12566;
                        TextView textView16 = textView3;
                        spinnerM51138 = spinnerM51138;
                        textView7 = textView7;
                        textView6 = textView16;
                        C23144 c231412 = c23144;
                        z3 = z;
                        c23144 = c231412;
                    }
                    break;
                case -1439628039:
                case -75788097:
                    i = i22;
                    textView3 = textView6;
                    z = z3;
                    s = f19351[0];
                    i16 = (s * s) + 13564489;
                    int iM113010 = (ThreadFactoryC3888.m11306("ܳܳ") + i19) * 23;
                    i21 = iM113010 ^ 376522734;
                    i20 = ((iM113010 ^ i18) * 317) ^ (-921424772);
                    i24 = i24;
                    sArr17 = sArr17;
                    onClickListener4 = onClickListener4;
                    sArr19 = sArr19;
                    sArr18 = sArr18;
                    interfaceC6028 = interfaceC6028;
                    sArr16 = sArr16;
                    str3 = str3;
                    sArr15 = sArr15;
                    sArr14 = sArr14;
                    i22 = i;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView17 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView17;
                    C23144 c231413 = c23144;
                    z3 = z;
                    c23144 = c231413;
                    break;
                case -1231849555:
                case 1228529598:
                    C1460.m5050();
                    if (C0962.f3784) {
                        c12562 = c12566;
                        textView4 = textView7;
                        spinner2 = spinnerM51138;
                        onCheckedChangeListener2 = onCheckedChangeListener3;
                        c12563 = c12564;
                        textView5 = textView6;
                        c8068 = c8069;
                        boolean z9 = z3;
                        c23144 = c23144;
                        z = z9;
                        iM450212 = (C19806.m45029("᩵ۘ") ^ i18) * 81;
                        i12 = ((iM450212 ^ i19) * 28601) ^ 132725498;
                        i13 = -2090515295;
                        i21 = iM450212 ^ i13;
                        onCheckedChangeListener3 = onCheckedChangeListener2;
                        i20 = i12;
                        textView6 = textView5;
                        c8069 = c8068;
                        spinnerM51138 = spinner2;
                        textView7 = textView4;
                        c12564 = c12563;
                        c12566 = c12562;
                        C23144 c231414 = c23144;
                        z3 = z;
                        c23144 = c231414;
                    } else {
                        int iM450218 = (i18 - C19806.m45029("ۚᩴ")) * (-23);
                        i21 = iM450218 ^ (-834160944);
                        i20 = ((iM450218 ^ i19) * 16195) ^ (-944141265);
                    }
                    break;
                case -1224185147:
                case 33682448:
                    C1066.m4025(c8069, iM450213 ^ i15, null);
                    boolean z10 = z3;
                    final C23144 c231415 = c23144;
                    c23144 = c23144;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener4 = onCheckedChangeListener3;
                    z = z10;
                    final Spinner spinner3 = spinnerM51138;
                    final C12562 c12567 = c12564;
                    final Main main2 = main;
                    Spinner spinner4 = spinnerM51138;
                    TextView textView18 = textView6;
                    final C11545 c11546 = c11545;
                    DialogInterface.OnClickListener onClickListener5 = new DialogInterface.OnClickListener() { // from class: l.ܰܿ᩹
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i29) {
                            new C2681(c231415, spinner3, main2, c12566, c12567, c11546).m10243();
                        }
                    };
                    sArr19 = f19351;
                    i27 = 34;
                    int iM450219 = (i19 - C19806.m45029("ܳۤ")) * 59;
                    int i29 = ((iM450219 ^ i18) * 6253) ^ (-1769232026);
                    i21 = iM450219 ^ 598549065;
                    textView6 = textView18;
                    onClickListener4 = onClickListener5;
                    c12566 = c12566;
                    spinnerM51138 = spinner4;
                    textView7 = textView7;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12567;
                    onCheckedChangeListener3 = onCheckedChangeListener4;
                    i20 = i29;
                    C23144 c231416 = c23144;
                    z3 = z;
                    c23144 = c231416;
                    break;
                case -1223854434:
                case 2124417761:
                    C1398.m4895();
                    break;
                case -885708624:
                case 2006395005:
                    AbstractC0464.m2309(c8069, ThreadFactoryC3888.m11306(C2332.m7082(sArr19, i27, 3, i26)) ^ 2118586680, onClickListener4);
                    C2704.m8239(c8069);
                    break;
                case -750184205:
                case 1915584055:
                    short[] sArr20 = sArr19;
                    c12566 = c12566;
                    InterfaceC6025 interfaceC60210 = interfaceC6028;
                    c12564 = c12564;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    DialogInterface.OnClickListener onClickListener6 = onClickListener4;
                    String str4 = str3;
                    TextView textView19 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView19;
                    boolean z11 = z3;
                    c23144 = c23144;
                    z = z11;
                    boolean zM4371 = C1189.m4371(interfaceC60210, str4, z2);
                    C12562 c12568 = c12565;
                    C1937.m6283(c12568, zM4371);
                    C1668.m5571(c12568, new C9594());
                    int iM450220 = (i19 - C19806.m45029("ۤ᩹")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    c12565 = c12568;
                    i20 = ((iM450220 ^ i18) * (-30525)) ^ (-2003305647);
                    i21 = iM450220 ^ (-1450426946);
                    i24 = i24;
                    sArr17 = sArr17;
                    sArr19 = sArr20;
                    sArr18 = sArr18;
                    interfaceC6028 = interfaceC60210;
                    sArr16 = sArr16;
                    str3 = str4;
                    onClickListener4 = onClickListener6;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView110 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView110;
                    C23144 c231417 = c23144;
                    z3 = z;
                    c23144 = c231417;
                    break;
                case -698360044:
                case -44673307:
                    if (AbstractC0464.m2313() == 0) {
                        sArr9 = sArr19;
                        c12566 = c12566;
                        interfaceC6027 = interfaceC6028;
                        str2 = str3;
                        c12564 = c12564;
                        sArr11 = sArr14;
                        i9 = i22;
                        sArr12 = sArr16;
                        i11 = i24;
                        sArr13 = sArr17;
                        sArr10 = sArr18;
                        c8069 = c8069;
                        interfaceC6029 = interfaceC6029;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        onClickListener3 = onClickListener4;
                        i10 = i23;
                        TextView textView111 = textView6;
                        textView7 = textView7;
                        spinnerM51138 = spinnerM51138;
                        textView3 = textView111;
                        boolean z12 = z3;
                        c23144 = c23144;
                        z = z12;
                        int iM4502110 = C19806.m45029("᩻᩺") ^ i19;
                        sArr14 = sArr11;
                        i20 = ((iM4502110 ^ i18) * 5251) ^ 2002189264;
                        i21 = iM4502110 ^ 1241284570;
                        i23 = i10;
                        i22 = i9;
                        i24 = i11;
                        sArr17 = sArr13;
                        onClickListener4 = onClickListener3;
                        sArr19 = sArr9;
                        sArr18 = sArr10;
                        interfaceC6028 = interfaceC6027;
                        sArr16 = sArr12;
                        str3 = str2;
                        sArr14 = sArr14;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        interfaceC6029 = interfaceC6029;
                        c8069 = c8069;
                        c12564 = c12564;
                        c12566 = c12566;
                        TextView textView112 = textView3;
                        spinnerM51138 = spinnerM51138;
                        textView7 = textView7;
                        textView6 = textView112;
                        C23144 c231418 = c23144;
                        z3 = z;
                        c23144 = c231418;
                    } else {
                        c12562 = c12566;
                        textView4 = textView7;
                        spinner2 = spinnerM51138;
                        onCheckedChangeListener2 = onCheckedChangeListener3;
                        c12563 = c12564;
                        textView5 = textView6;
                        c8068 = c8069;
                        boolean z13 = z3;
                        c23144 = c23144;
                        z = z13;
                        iM450212 = (C19806.m45029("᩵ۘ") ^ i18) * 81;
                        i12 = ((iM450212 ^ i19) * 28601) ^ 132725498;
                        i13 = -2090515295;
                        i21 = iM450212 ^ i13;
                        onCheckedChangeListener3 = onCheckedChangeListener2;
                        i20 = i12;
                        textView6 = textView5;
                        c8069 = c8068;
                        spinnerM51138 = spinner2;
                        textView7 = textView4;
                        c12564 = c12563;
                        c12566 = c12562;
                        C23144 c231419 = c23144;
                        z3 = z;
                        c23144 = c231419;
                    }
                    break;
                case -343546567:
                case 598419942:
                    c12566 = c12566;
                    c12564 = c12564;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    TextView textView20 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView20;
                    boolean z14 = z3;
                    c23144 = c23144;
                    z = z14;
                    onClickListener3 = onClickListener4;
                    sArr9 = sArr19;
                    short[] sArr21 = sArr18;
                    strM10901 = C3722.m10901(sArr21, 19, 3, i26);
                    if (C1937.f7317 >= 0) {
                        sArr10 = sArr21;
                        interfaceC6027 = interfaceC6028;
                        str2 = str3;
                        sArr11 = sArr14;
                        i9 = i22;
                        i10 = i23;
                        sArr12 = sArr16;
                        i11 = i24;
                        sArr13 = sArr17;
                        int iM4502111 = C19806.m45029("᩻᩺") ^ i19;
                        sArr14 = sArr11;
                        i20 = ((iM4502111 ^ i18) * 5251) ^ 2002189264;
                        i21 = iM4502111 ^ 1241284570;
                        i23 = i10;
                        i22 = i9;
                        i24 = i11;
                        sArr17 = sArr13;
                        onClickListener4 = onClickListener3;
                        sArr19 = sArr9;
                        sArr18 = sArr10;
                        interfaceC6028 = interfaceC6027;
                        sArr16 = sArr12;
                        str3 = str2;
                        sArr14 = sArr14;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ܰ۬") ^ i18) * (-83);
                        i21 = iM113011 ^ (-592416946);
                        i20 = ((iM113011 ^ i19) * 22781) ^ (-733776498);
                        sArr18 = sArr21;
                        onClickListener4 = onClickListener3;
                        sArr19 = sArr9;
                    }
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView113 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView113;
                    C23144 c2314110 = c23144;
                    z3 = z;
                    c23144 = c2314110;
                    break;
                case -243927226:
                case 1679228363:
                    c12562 = c12566;
                    textView4 = textView7;
                    spinner2 = spinnerM51138;
                    onCheckedChangeListener2 = onCheckedChangeListener3;
                    c12563 = c12564;
                    textView5 = textView6;
                    c8068 = c8069;
                    boolean z15 = z3;
                    c23144 = c23144;
                    z = z15;
                    C7105.m18978(c12562, z);
                    interfaceC6029 = ApplicationC0716.f2992;
                    strM45020 = C19806.m45020(f19351, 26, 5, i26);
                    if (RunnableC1564.f6300) {
                        iM450212 = (C19806.m45029("᩵ۘ") ^ i18) * 81;
                        i12 = ((iM450212 ^ i19) * 28601) ^ 132725498;
                        i13 = -2090515295;
                    } else {
                        iM450212 = C19806.m45029("᩹ۨ") ^ i18;
                        i12 = ((iM450212 ^ i19) * (-24225)) ^ (-1335140052);
                        i13 = -404929832;
                    }
                    i21 = iM450212 ^ i13;
                    onCheckedChangeListener3 = onCheckedChangeListener2;
                    i20 = i12;
                    textView6 = textView5;
                    c8069 = c8068;
                    spinnerM51138 = spinner2;
                    textView7 = textView4;
                    c12564 = c12563;
                    c12566 = c12562;
                    C23144 c2314111 = c23144;
                    z3 = z;
                    c23144 = c2314111;
                    break;
                case -112269481:
                case 2043152305:
                    short[] sArr22 = sArr19;
                    C12562 c12569 = c12564;
                    C8067 c80610 = c8069;
                    InterfaceC6025 interfaceC60211 = interfaceC6029;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener5 = onCheckedChangeListener3;
                    DialogInterface.OnClickListener onClickListener7 = onClickListener4;
                    TextView textView21 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView21;
                    boolean z16 = z3;
                    c23144 = c23144;
                    z = z16;
                    C12562 c125610 = (C12562) C2642.m8167(viewM9787, i14 ^ 2122152072);
                    sArr18 = f19351;
                    int iM113012 = ThreadFactoryC3888.m11306("ܳܶ") ^ i19;
                    int i30 = ((iM113012 ^ i18) * 31745) ^ 1111569042;
                    i21 = iM113012 ^ (-937968920);
                    onClickListener4 = onClickListener7;
                    onCheckedChangeListener3 = onCheckedChangeListener5;
                    interfaceC6029 = interfaceC60211;
                    c8069 = c80610;
                    c12564 = c12569;
                    c12566 = c125610;
                    i20 = i30;
                    sArr19 = sArr22;
                    TextView textView114 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView114;
                    C23144 c2314112 = c23144;
                    z3 = z;
                    c23144 = c2314112;
                    break;
                case 13206815:
                case 1259217187:
                    sArr3 = sArr19;
                    c12566 = c12566;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    c12564 = c12564;
                    short[] sArr23 = sArr16;
                    int i31 = i25;
                    sArr6 = sArr18;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    onClickListener2 = onClickListener4;
                    int i32 = i24;
                    boolean z17 = z3;
                    c23144 = c23144;
                    z = z17;
                    textView3 = (TextView) C2642.m8167(viewM9787, ThreadFactoryC3888.m11306(C0671.m3009(sArr23, i32, i31, i26)) ^ 2123757670);
                    sArr17 = f19351;
                    if (C19806.f63586) {
                        sArr16 = sArr23;
                        i24 = i32;
                        i25 = i31;
                        sArr7 = sArr15;
                        int iM113013 = (i19 - ThreadFactoryC3888.m11306("۟ۧ")) * (-45);
                        i21 = iM113013 ^ 1180294283;
                        sArr15 = sArr7;
                        i20 = ((iM113013 ^ i18) * 8627) ^ 738669093;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                    } else {
                        int iM450221 = C19806.m45029("ۜۧ") ^ i19;
                        i20 = ((iM450221 ^ i18) * 13721) ^ (-342736337);
                        i21 = iM450221 ^ (-416640699);
                        i24 = i32;
                        i25 = i31;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                        sArr16 = sArr23;
                    }
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView115 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView115;
                    C23144 c2314113 = c23144;
                    z3 = z;
                    c23144 = c2314113;
                    break;
                case 14188130:
                case 1891246304:
                    C12562 c125611 = c12566;
                    TextView textView22 = textView7;
                    Spinner spinner5 = spinnerM51138;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener6 = onCheckedChangeListener3;
                    TextView textView23 = textView6;
                    C1189.m4370(c125611, onCheckedChangeListener6);
                    boolean zM4372 = C1189.m4371(ApplicationC0716.f2992, C1668.m5577(f19351, 22, 4, i26), false);
                    int iM113014 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i18;
                    int i33 = ((iM113014 ^ i19) * (-32725)) ^ (-320145232);
                    i21 = iM113014 ^ (-206031983);
                    onCheckedChangeListener3 = onCheckedChangeListener6;
                    c23144 = c23144;
                    textView7 = textView22;
                    z3 = zM4372;
                    i20 = i33;
                    textView6 = textView23;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    spinnerM51138 = spinner5;
                    c12564 = c12564;
                    c12566 = c125611;
                    break;
                case 56014944:
                case 1247995289:
                    C12562 c125612 = c12566;
                    textView2 = textView7;
                    Spinner spinner6 = spinnerM51138;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener7 = onCheckedChangeListener3;
                    C12562 c125613 = c12564;
                    textView = textView6;
                    c8067 = c8069;
                    interfaceC6025 = interfaceC6029;
                    boolean z18 = z3;
                    c23144 = c23144;
                    z = z18;
                    iM450213 = C19806.m45029(C3577.m10571(f19351, 31, 3, i26));
                    i15 = 2099645294;
                    if (C2477.f9839 <= 0) {
                        onCheckedChangeListener = onCheckedChangeListener7;
                        c12563 = c125613;
                        c12562 = c125612;
                        spinner = spinner6;
                        onClickListener = onClickListener4;
                        sArr = sArr19;
                        sArr2 = sArr18;
                        int iM113015 = ThreadFactoryC3888.m11306("۟ۜ") ^ i19;
                        i21 = iM113015 ^ (-1568313074);
                        i20 = ((iM113015 ^ i18) * 14351) ^ (-1422311634);
                        sArr18 = sArr2;
                        textView6 = textView;
                        onClickListener4 = onClickListener;
                        sArr19 = sArr;
                        spinnerM51138 = spinner;
                        onCheckedChangeListener3 = onCheckedChangeListener;
                        textView7 = textView2;
                        interfaceC6029 = interfaceC6025;
                        c8069 = c8067;
                        c12564 = c12563;
                        c12566 = c12562;
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("ۨܰ") ^ i18;
                        i21 = iM113016 ^ (-1783691237);
                        textView6 = textView;
                        interfaceC6029 = interfaceC6025;
                        c8069 = c8067;
                        spinnerM51138 = spinner6;
                        textView7 = textView2;
                        c12564 = c125613;
                        onCheckedChangeListener3 = onCheckedChangeListener7;
                        i20 = ((iM113016 ^ i19) * 32239) ^ 1466731247;
                        c12566 = c125612;
                    }
                    C23144 c2314114 = c23144;
                    z3 = z;
                    c23144 = c2314114;
                    break;
                case 66699910:
                case 1206886325:
                    sArr3 = sArr19;
                    c12566 = c12566;
                    c12564 = c12564;
                    short[] sArr24 = sArr16;
                    int i34 = i24;
                    short[] sArr25 = sArr17;
                    sArr6 = sArr18;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    onClickListener2 = onClickListener4;
                    TextView textView24 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView24;
                    boolean z19 = z3;
                    c23144 = c23144;
                    z = z19;
                    InterfaceC6025 interfaceC60212 = ApplicationC0716.f2992;
                    String strM4832 = C1377.m4832(f19351, 7, 3, i26);
                    if (C1668.f6641 >= 0) {
                        i24 = i34;
                        sArr17 = sArr25;
                        sArr16 = sArr24;
                        z2 = true;
                        interfaceC6028 = interfaceC60212;
                        str3 = strM4832;
                        sArr7 = sArr15;
                        int iM113017 = (i19 - ThreadFactoryC3888.m11306("۟ۧ")) * (-45);
                        i21 = iM113017 ^ 1180294283;
                        sArr15 = sArr7;
                        i20 = ((iM113017 ^ i18) * 8627) ^ 738669093;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                    } else {
                        int iM450222 = (i18 - C19806.m45029("֡֡")) * (-67);
                        int i35 = ((iM450222 ^ i19) * (-9787)) ^ 1405509094;
                        i21 = iM450222 ^ (-1630177500);
                        i24 = i34;
                        sArr17 = sArr25;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                        sArr16 = sArr24;
                        interfaceC6028 = interfaceC60212;
                        str3 = strM4832;
                        i20 = i35;
                        onClickListener4 = onClickListener2;
                        z2 = true;
                    }
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView116 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView116;
                    C23144 c2314115 = c23144;
                    z3 = z;
                    c23144 = c2314115;
                    break;
                case 211173283:
                case 433159953:
                    sArr3 = sArr19;
                    c12566 = c12566;
                    c12564 = c12564;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    onClickListener2 = onClickListener4;
                    TextView textView25 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView25;
                    boolean z20 = z3;
                    c23144 = c23144;
                    z = z20;
                    sArr6 = sArr18;
                    sArr8 = sArr17;
                    viewM8167 = C2642.m8167(viewM9787, ThreadFactoryC3888.m11306(C1398.m4892(sArr8, 13, 3, i26)) ^ 2101961636);
                    iM450211 = (ThreadFactoryC3888.m11306("ۖۛ") ^ i18) * 81;
                    i7 = ((iM450211 ^ i19) * (-28137)) ^ (-2072125657);
                    i8 = 1932076916;
                    i21 = iM450211 ^ i8;
                    i20 = i7;
                    sArr17 = sArr8;
                    onClickListener4 = onClickListener2;
                    sArr19 = sArr3;
                    sArr18 = sArr6;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView117 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView117;
                    C23144 c2314116 = c23144;
                    z3 = z;
                    c23144 = c2314116;
                    break;
                case 249974301:
                case 321891029:
                    c12566 = c12566;
                    TextView textView26 = textView7;
                    Spinner spinner7 = spinnerM51138;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    textView3 = textView6;
                    boolean z21 = z3;
                    c23144 = c23144;
                    z = z21;
                    final C12562 c125614 = (C12562) C2642.m8167(viewM9787, C19806.m45029(strM10901) ^ 2100139231);
                    spinnerM51138 = spinner7;
                    textView7 = textView26;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener8 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۗ۫᩹
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z22) {
                            textView3.setText(!z22 ? R.string.MT_Protector : R.string.MT_Protector);
                            textView7.setVisibility(!z22 ? 0 : 8);
                            c125614.setVisibility(z22 ? 8 : 0);
                            spinnerM51138.setEnabled(!z22);
                            C1679.m5597(ApplicationC0716.f2992, "dfoh", z22);
                        }
                    };
                    if (AbstractC0464.m2313() != 0) {
                        onClickListener2 = onClickListener4;
                        sArr3 = sArr19;
                        onCheckedChangeListener3 = onCheckedChangeListener8;
                        sArr7 = sArr15;
                        sArr6 = sArr18;
                        c12564 = c125614;
                        int iM113018 = (i19 - ThreadFactoryC3888.m11306("۟ۧ")) * (-45);
                        i21 = iM113018 ^ 1180294283;
                        sArr15 = sArr7;
                        i20 = ((iM113018 ^ i18) * 8627) ^ 738669093;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        interfaceC6029 = interfaceC6029;
                        c8069 = c8069;
                        c12564 = c12564;
                    } else {
                        int iM450223 = (C19806.m45029("ۡ۟") + i19) * (-15);
                        i20 = ((iM450223 ^ i18) * 5685) ^ 1557398266;
                        i21 = iM450223 ^ 791692985;
                        interfaceC6029 = interfaceC6029;
                        c8069 = c8069;
                        c12564 = c125614;
                        onCheckedChangeListener3 = onCheckedChangeListener8;
                    }
                    c12566 = c12566;
                    TextView textView118 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView118;
                    C23144 c2314117 = c23144;
                    z3 = z;
                    c23144 = c2314117;
                    break;
                case 292192150:
                case 1977811725:
                    sArr3 = sArr19;
                    c12566 = c12566;
                    interfaceC6026 = interfaceC6028;
                    c12564 = c12564;
                    sArr4 = sArr16;
                    i4 = i24;
                    sArr6 = sArr18;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    onClickListener2 = onClickListener4;
                    String str5 = str3;
                    sArr5 = sArr17;
                    TextView textView27 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView27;
                    boolean z22 = z3;
                    c23144 = c23144;
                    z = z22;
                    str = str5;
                    sArr7 = sArr15;
                    c12565 = (C12562) C3743.m10957(viewM9787, C19806.m45029(C1377.m4832(sArr7, 4, 3, i26)) ^ 2101990869);
                    iM450210 = C19806.m45029("᩷ۜ") ^ i19;
                    i5 = ((iM450210 ^ i18) * 8417) ^ 2102792248;
                    i6 = -1403989603;
                    i21 = iM450210 ^ i6;
                    sArr15 = sArr7;
                    i20 = i5;
                    i24 = i4;
                    sArr17 = sArr5;
                    onClickListener4 = onClickListener2;
                    sArr19 = sArr3;
                    sArr18 = sArr6;
                    interfaceC6028 = interfaceC6026;
                    sArr16 = sArr4;
                    str3 = str;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView119 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView119;
                    C23144 c2314118 = c23144;
                    z3 = z;
                    c23144 = c2314118;
                    break;
                case 356502662:
                case 1079251558:
                    sArr3 = sArr19;
                    c12566 = c12566;
                    c12564 = c12564;
                    sArr8 = sArr17;
                    sArr6 = sArr18;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    onClickListener2 = onClickListener4;
                    TextView textView28 = textView6;
                    textView7 = textView7;
                    spinnerM51138 = spinnerM51138;
                    textView3 = textView28;
                    boolean z23 = z3;
                    c23144 = c23144;
                    z = z23;
                    sArr16 = f19351;
                    i24 = 10;
                    i25 = 3;
                    if (C1148.m4232() > 0) {
                        iM450211 = (i18 - C19806.m45029("ܳᩴ")) * 87;
                        i7 = ((iM450211 ^ i19) * 14317) ^ (-263778917);
                        i8 = -1059694291;
                        i21 = iM450211 ^ i8;
                        i20 = i7;
                        sArr17 = sArr8;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        interfaceC6029 = interfaceC6029;
                        c8069 = c8069;
                        c12564 = c12564;
                        c12566 = c12566;
                        TextView textView1110 = textView3;
                        spinnerM51138 = spinnerM51138;
                        textView7 = textView7;
                        textView6 = textView1110;
                        C23144 c2314119 = c23144;
                        z3 = z;
                        c23144 = c2314119;
                    } else {
                        sArr17 = sArr8;
                        sArr7 = sArr15;
                        int iM113019 = (i19 - ThreadFactoryC3888.m11306("۟ۧ")) * (-45);
                        i21 = iM113019 ^ 1180294283;
                        sArr15 = sArr7;
                        i20 = ((iM113019 ^ i18) * 8627) ^ 738669093;
                        onClickListener4 = onClickListener2;
                        sArr19 = sArr3;
                        sArr18 = sArr6;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        interfaceC6029 = interfaceC6029;
                        c8069 = c8069;
                        c12564 = c12564;
                        c12566 = c12566;
                        TextView textView1111 = textView3;
                        spinnerM51138 = spinnerM51138;
                        textView7 = textView7;
                        textView6 = textView1111;
                        C23144 c23141110 = c23144;
                        z3 = z;
                        c23144 = c23141110;
                    }
                    break;
                case 439878513:
                case 947026053:
                    textView3 = textView6;
                    z = z3;
                    i = i22;
                    short s2 = s;
                    int i36 = s2 + 3683;
                    if ((i16 + i16) - (i36 * i36) >= 0) {
                        iM45029 = (i18 - C19806.m45029("ۢܺ")) * (-75);
                        i2 = ((iM45029 ^ i19) * 24593) ^ 523258864;
                        i3 = 2041933257;
                    } else {
                        iM45029 = C19806.m45029("ܰܺ") ^ i19;
                        i2 = ((iM45029 ^ i18) * (-27119)) ^ 966909036;
                        i3 = -591950131;
                    }
                    i21 = iM45029 ^ i3;
                    s = s2;
                    i20 = i2;
                    i24 = i24;
                    sArr17 = sArr17;
                    onClickListener4 = onClickListener4;
                    sArr19 = sArr19;
                    sArr18 = sArr18;
                    interfaceC6028 = interfaceC6028;
                    sArr16 = sArr16;
                    str3 = str3;
                    sArr15 = sArr15;
                    sArr14 = sArr14;
                    i22 = i;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView1112 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView1112;
                    C23144 c23141111 = c23144;
                    z3 = z;
                    c23144 = c23141111;
                    break;
                case 779192471:
                case 1202335652:
                    C12562 c125615 = c12566;
                    boolean z24 = z3;
                    C12562 c125616 = c12564;
                    C8067 c80611 = c8069;
                    InterfaceC6025 interfaceC60213 = interfaceC6029;
                    c11545 = (C11545) this.f19353;
                    C23144 c231420 = new C23144(abstractC20745);
                    Main mainM5471 = RunnableC1606.m5471(c11545);
                    int iM450224 = C19806.m45029("ۙۚ") ^ i19;
                    i20 = ((iM450224 ^ i18) * (-2413)) ^ 176681920;
                    i21 = iM450224 ^ 1298315009;
                    sArr15 = sArr15;
                    i22 = i22;
                    i24 = i24;
                    sArr17 = sArr17;
                    onClickListener4 = onClickListener4;
                    sArr19 = sArr19;
                    sArr18 = sArr18;
                    interfaceC6028 = interfaceC6028;
                    sArr16 = sArr16;
                    str3 = str3;
                    sArr14 = sArr14;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC60213;
                    c8069 = c80611;
                    c12564 = c125616;
                    c12566 = c125615;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView6;
                    z3 = z24;
                    c23144 = c231420;
                    main = mainM5471;
                    break;
                case 923475370:
                case 1909468578:
                    textView3 = textView6;
                    z = z3;
                    i26 = 36887;
                    int iM4502112 = (C19806.m45029("᩷ܽ") + i18) * 29;
                    i21 = iM4502112 ^ 1757260225;
                    i20 = ((iM4502112 ^ i19) * 5433) ^ (-1931254789);
                    i22 = i22;
                    i24 = i24;
                    sArr17 = sArr17;
                    onClickListener4 = onClickListener4;
                    sArr19 = sArr19;
                    sArr18 = sArr18;
                    interfaceC6028 = interfaceC6028;
                    sArr16 = sArr16;
                    str3 = str3;
                    sArr15 = sArr15;
                    sArr14 = sArr14;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView1113 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView1113;
                    C23144 c23141112 = c23144;
                    z3 = z;
                    c23144 = c23141112;
                    break;
                case 1376818311:
                case 1886410772:
                    TextView textView29 = textView7;
                    InterfaceC6025 interfaceC60214 = interfaceC6029;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener9 = onCheckedChangeListener3;
                    C12562 c125617 = c12564;
                    boolean z25 = z3;
                    c23144 = c23144;
                    z = z25;
                    C1937.m6283(c125617, C1668.m5579(interfaceC60214, strM45020, z2));
                    C1668.m5571(c125617, new C4798(0));
                    C8067 c8067M3751 = C0962.m3751(main);
                    C1977.m6349(c8067M3751, viewM9787);
                    int iM450225 = C19806.m45029("ۨۢ") ^ i19;
                    i21 = iM450225 ^ (-387313161);
                    onCheckedChangeListener3 = onCheckedChangeListener9;
                    c12564 = c125617;
                    i20 = ((iM450225 ^ i18) * 13081) ^ (-2044345011);
                    textView6 = textView6;
                    interfaceC6029 = interfaceC60214;
                    c12566 = c12566;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView29;
                    c8069 = c8067M3751;
                    C23144 c23141113 = c23144;
                    z3 = z;
                    c23144 = c23141113;
                    break;
                default:
                    sArr9 = sArr19;
                    c12566 = c12566;
                    textView3 = textView6;
                    interfaceC6027 = interfaceC6028;
                    str2 = str3;
                    c12564 = c12564;
                    sArr11 = sArr14;
                    i9 = i22;
                    sArr12 = sArr16;
                    i11 = i24;
                    sArr13 = sArr17;
                    sArr10 = sArr18;
                    textView7 = textView7;
                    c8069 = c8069;
                    interfaceC6029 = interfaceC6029;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    onClickListener3 = onClickListener4;
                    i10 = i23;
                    boolean z26 = z3;
                    c23144 = c23144;
                    z = z26;
                    viewM9787 = C3286.m9787(main, C19806.m45029(RunnableC1895.m6164(sArr11, i9, i10, i26)) ^ 2102089047);
                    spinnerM51138 = C23144.m51138(main, viewM9787);
                    sArr15 = f19351;
                    if (C3660.f13403 >= 0) {
                        int iM4502113 = C19806.m45029("᩻᩺") ^ i19;
                        sArr14 = sArr11;
                        i20 = ((iM4502113 ^ i18) * 5251) ^ 2002189264;
                        i21 = iM4502113 ^ 1241284570;
                        i23 = i10;
                        i22 = i9;
                        i24 = i11;
                        sArr17 = sArr13;
                        onClickListener4 = onClickListener3;
                        sArr19 = sArr9;
                        sArr18 = sArr10;
                        interfaceC6028 = interfaceC6027;
                        sArr16 = sArr12;
                        str3 = str2;
                    } else {
                        sArr14 = sArr11;
                        int iM450226 = C19806.m45029("۬ۨ") ^ i18;
                        i21 = iM450226 ^ (-2033941591);
                        i20 = ((iM450226 ^ i19) * (-11189)) ^ 1297964957;
                        i22 = i9;
                        i24 = i11;
                        sArr17 = sArr13;
                        onClickListener4 = onClickListener3;
                        sArr19 = sArr9;
                        sArr18 = sArr10;
                        interfaceC6028 = interfaceC6027;
                        sArr16 = sArr12;
                        str3 = str2;
                        i23 = i10;
                    }
                    sArr14 = sArr14;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    interfaceC6029 = interfaceC6029;
                    c8069 = c8069;
                    c12564 = c12564;
                    c12566 = c12566;
                    TextView textView1114 = textView3;
                    spinnerM51138 = spinnerM51138;
                    textView7 = textView7;
                    textView6 = textView1114;
                    C23144 c23141114 = c23144;
                    z3 = z;
                    c23144 = c23141114;
                    break;
            }
            return;
        }
    }
}
