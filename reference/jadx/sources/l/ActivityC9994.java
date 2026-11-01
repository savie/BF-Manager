package l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T4 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC9994 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۫۫ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f34137 = {78, -545, 1802, 3086, 1644, 2807, 7689, 4795, 5695, 3527, 27219, 27215, 27222, 27204, 27210, 27213, 27242, 27207, -2341, 9614, 995, -950, 1016, 402, -1865, 2821, 12861, 968, -302, -274, -265, -283, -277, -276, -310, -277, -271, -266, -275, -272, -261, -317, -287, -266, -277, -268, -277, -266, -261};

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34138 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C11986 f34139;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C14933 f34140;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public String f34141;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public List f34142 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C21423 f34143;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f34144;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public TextView f34145;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public C6018 f34146;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 973674702;
        int i7 = C0629.f2722;
        int i8 = ThreadFactoryC3888.f14547;
        int iM45029 = C19806.m45029("֫ۚ") ^ i7;
        int i9 = ((iM45029 ^ i8) * 27411) ^ (-981608259);
        int i10 = -378593516;
        while (true) {
            i6 = ((((i6 ^ i8) * 22357) >> 31) & i9) ^ (iM45029 ^ i10);
            switch (i6) {
                case -1995837844:
                case 1846147719:
                    C2642.m8171();
                    C1937.m6279();
                    iM45029 = C19806.m45029("ܺ۬") ^ i8;
                    i9 = ((iM45029 ^ i7) * 20191) ^ 1229153773;
                    i10 = -2056198118;
                    break;
                case -1656763761:
                case -753695508:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    return null;
                case -1652322178:
                case 2013054466:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("᩵ܿ") ^ i7) * (-91);
                        i9 = ((iM45029 ^ i8) * 9711) ^ (-1803525366);
                        i10 = -512899122;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۗ") ^ i7) * (-79);
                        i9 = ((iM45029 ^ i8) * (-25311)) ^ (-485539655);
                        i10 = -609127533;
                    }
                    break;
                case -1548865536:
                case -280918247:
                    sArr2 = f34137;
                    i5 = 28;
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-22023)) ^ 1849967941;
                        i10 = -1521183138;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۢ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 31067) ^ (-1436911675);
                        i10 = -815764512;
                    }
                    break;
                case -1136540000:
                case 742092869:
                    s = sArr[c];
                    if (C0817.m3399()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۛ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-23809)) ^ 140735881;
                        i10 = 400531284;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-22023)) ^ 1849967941;
                        i10 = -1521183138;
                    }
                    break;
                case -1067072551:
                case 581001848:
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-22023)) ^ 1849967941;
                        i10 = -1521183138;
                    } else {
                        iM45029 = C19806.m45029("᩹ۛ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-10923)) ^ 1537675374;
                        i10 = 499088480;
                    }
                    break;
                case -839046827:
                case -559369381:
                    i4 = 65154;
                    iM45029 = (i7 - C19806.m45029("᩶᩻")) * (-77);
                    i9 = ((iM45029 ^ i8) * 31189) ^ 1209806500;
                    i10 = -954375852;
                    break;
                case -708918770:
                case -623757128:
                    s2 = 14926;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-22023)) ^ 1849967941;
                        i10 = -1521183138;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܶ") + i7) * (-39);
                        i9 = ((iM45029 ^ i8) * 23237) ^ 824810106;
                        i10 = -112822121;
                    }
                    break;
                case -602993083:
                case -561430853:
                    return C0050.m940(sArr2, i5, 21, i4);
                case -564975373:
                case -534718576:
                    if (C2124.f7782 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ᩶") + i8) * (-21);
                        i9 = ((iM45029 ^ i7) * (-25981)) ^ 1899299733;
                        i10 = -2016886679;
                    } else {
                        iM45029 = C19806.m45029("ܺ۬") ^ i8;
                        i9 = ((iM45029 ^ i7) * 20191) ^ 1229153773;
                        i10 = -2056198118;
                    }
                    break;
                case -475365410:
                case 847769626:
                    c = 27;
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ᩶") + i8) * (-21);
                        i9 = ((iM45029 ^ i7) * (-25981)) ^ 1899299733;
                        i10 = -2016886679;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩻ۡ")) * 3;
                        i9 = ((iM45029 ^ i8) * 23537) ^ (-189490181);
                        i10 = 377409215;
                    }
                    break;
                case -258796160:
                case 893841509:
                    int i12 = s + s2;
                    if (i3 - (i12 * i12) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧܺ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 25691) ^ 1675273583;
                        i10 = -1999903636;
                    } else {
                        iM45029 = C19806.m45029("ۗ֡") ^ i8;
                        i9 = ((iM45029 ^ i7) * 20861) ^ (-1399238988);
                        i10 = 518474180;
                    }
                    break;
                case -214685942:
                case 1824364383:
                    if (C2642.m8171() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ᩶") + i8) * (-21);
                        i9 = ((iM45029 ^ i7) * (-25981)) ^ 1899299733;
                        i10 = -2016886679;
                    } else {
                        iM45029 = (i7 - C19806.m45029("ܺ᩻")) * (-31);
                        i9 = ((iM45029 ^ i8) * 12865) ^ 1947689156;
                        i10 = 1169480307;
                    }
                    break;
                case -114950424:
                case 638958428:
                    C0216.m1591();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-22023)) ^ 1849967941;
                        i10 = -1521183138;
                    } else {
                        iM45029 = C19806.m45029("ܺ۬") ^ i8;
                        i9 = ((iM45029 ^ i7) * 20191) ^ 1229153773;
                        i10 = -2056198118;
                    }
                    break;
                case 229749666:
                case 248747814:
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ܺ۬") ^ i8;
                        i9 = ((iM45029 ^ i7) * 20191) ^ 1229153773;
                        i10 = -2056198118;
                    } else {
                        iM45029 = (i8 - C19806.m45029("᩷ᩳ")) * (-21);
                        i9 = ((iM45029 ^ i7) * 7545) ^ 714123755;
                        i10 = -1670739704;
                    }
                    break;
                case 1102902193:
                case 1397014759:
                    i = s * s;
                    i2 = 222785476;
                    if (C2477.m7593() >= 0) {
                        iM45029 = (C19806.m45029("᩵ܿ") ^ i7) * (-91);
                        i9 = ((iM45029 ^ i8) * 9711) ^ (-1803525366);
                        i10 = -512899122;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("᩶۟")) * (-43);
                        i9 = ((iM45029 ^ i7) * 15127) ^ 1818282921;
                        i10 = -531541687;
                    }
                    break;
                case 1216617066:
                case 1219354652:
                    i4 = 1277;
                    iM45029 = (i7 - C19806.m45029("᩶᩻")) * (-77);
                    i9 = ((iM45029 ^ i8) * 31189) ^ 1209806500;
                    i10 = -954375852;
                    break;
                case 1962284743:
                case 1987161264:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ᩶") + i8) * (-21);
                        i9 = ((iM45029 ^ i7) * (-25981)) ^ 1899299733;
                        i10 = -2016886679;
                    } else {
                        iM45029 = C19806.m45029("ܽۢ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 24191) ^ 1069897023;
                        i10 = 568903579;
                    }
                    break;
                default:
                    sArr = f34137;
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("᩵ܿ") ^ i7) * (-91);
                        i9 = ((iM45029 ^ i8) * 9711) ^ (-1803525366);
                        i10 = -512899122;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩹") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-17135)) ^ (-1477566861);
                        i10 = 1958877198;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25256(ActivityC9994 activityC9994) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1768623910;
        int i5 = C2788.f10625;
        int i6 = C1189.f5284;
        int iM45029 = (C19806.m45029("ۜܽ") + i5) * 15;
        int i7 = ((iM45029 ^ i6) * 22623) ^ (-460705451);
        int i8 = -1886349089;
        while (true) {
            i4 = ((((i4 ^ i6) * (-31125)) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -1876528918:
                case -631487521:
                    activityC9994.f34144 = i3;
                    if (C0278.f1572 > 0) {
                        RunnableC0195.m1442(new C22694(activityC9994, i3));
                    }
                    iM45029 = (i5 - C19806.m45029("᩷ۨ")) * (-97);
                    i7 = ((iM45029 ^ i6) * 9611) ^ 120183356;
                    i8 = -132775314;
                    break;
                case -1863377818:
                case 1962379830:
                    C3286.m9798();
                    break;
                case -1744237839:
                case 1678532164:
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("۬ܿ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 4269) ^ (-1616758156);
                        i8 = 1157704547;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۨ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-29993)) ^ 1784637085;
                        i8 = -1641599048;
                    }
                    break;
                case -1608783659:
                case 1445098646:
                    i2 = 1;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 23629) ^ 1575446900;
                        i8 = -259324068;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۖ") ^ i6) * (-51);
                        i7 = ((iM45029 ^ i5) * 22407) ^ 1118360987;
                        i8 = -1027643439;
                    }
                    break;
                case -1143042075:
                case -883936576:
                    if (C19806.f63586) {
                        iM45029 = (i5 - C19806.m45029("᩷ۨ")) * (-97);
                        i7 = ((iM45029 ^ i6) * 9611) ^ 120183356;
                        i8 = -132775314;
                    } else {
                        iM45029 = (C19806.m45029("۫ܺ") ^ i6) * 91;
                        i7 = ((iM45029 ^ i5) * 23823) ^ 215949169;
                        i8 = 1896865755;
                    }
                    break;
                case -436423708:
                case 1396672456:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C3535.f13026 > 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ۨ")) * (-97);
                        i7 = ((iM45029 ^ i6) * 9611) ^ 120183356;
                        i8 = -132775314;
                    } else {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 23317) ^ (-881568669);
                        i8 = 268870934;
                    }
                    break;
                case -18940793:
                case 161774837:
                    if (!C1461.m5080()) {
                        iM45029 = C19806.m45029("۬ܿ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 4269) ^ (-1616758156);
                        i8 = 1157704547;
                    } else {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 23317) ^ (-881568669);
                        i8 = 268870934;
                    }
                    break;
                case 110902374:
                case 521541963:
                    i = activityC9994.f34144;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 23317) ^ (-881568669);
                        i8 = 268870934;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۤ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-5409)) ^ (-452912345);
                        i8 = 881202897;
                    }
                    break;
                case 155355466:
                case 1665524362:
                    i3 = i + i2;
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۜ۫") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-29873)) ^ (-1584445132);
                        i8 = -1782918566;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۢ") ^ i6) * (-75);
                        i7 = ((iM45029 ^ i5) * (-30841)) ^ 372385439;
                        i8 = -1053009265;
                    }
                    break;
                case 333101717:
                case 627386274:
                    C1460.m5050();
                    C0962.m3746();
                    iM45029 = C19806.m45029("۬ܿ") ^ i5;
                    i7 = ((iM45029 ^ i6) * 4269) ^ (-1616758156);
                    i8 = 1157704547;
                    break;
                case 971918351:
                case 1614868629:
                    C3660.m10791();
                    if (!RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 23629) ^ 1575446900;
                        i8 = -259324068;
                    } else {
                        iM45029 = C19806.m45029("۬ܿ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 4269) ^ (-1616758156);
                        i8 = 1157704547;
                    }
                    break;
                case 1153463854:
                case 1882308286:
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 23317) ^ (-881568669);
                        i8 = 268870934;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩺ܽ")) * 19;
                        i7 = ((iM45029 ^ i6) * 18831) ^ 133145805;
                        i8 = 1537439308;
                    }
                    break;
                case 1196161958:
                case 1886572080:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ۨ")) * (-97);
                        i7 = ((iM45029 ^ i6) * 9611) ^ 120183356;
                        i8 = -132775314;
                    } else {
                        iM45029 = C19806.m45029("ܶ᩵") ^ i5;
                        i7 = ((iM45029 ^ i6) * 20257) ^ (-1865045925);
                        i8 = -2083756097;
                    }
                    break;
                case 1271493422:
                case 1730062834:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ۨ")) * (-97);
                        i7 = ((iM45029 ^ i6) * 9611) ^ 120183356;
                        i8 = -132775314;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܽ") + i6) * 63;
                        i7 = ((iM45029 ^ i5) * (-14575)) ^ 1733142675;
                        i8 = 1031545751;
                    }
                    break;
                default:
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 23629) ^ 1575446900;
                        i8 = -259324068;
                    } else {
                        iM45029 = (i5 - C19806.m45029("᩸᩶")) * 127;
                        i7 = ((iM45029 ^ i6) * (-11097)) ^ 1264672729;
                        i8 = 1487514510;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        short[] sArr;
        Intent intent;
        int i2;
        int i3;
        int i4;
        int i5;
        short[] sArr2;
        C6938 c6938;
        int i6;
        int iM45029;
        int i7;
        int i8;
        int i9;
        short[] sArr3;
        int i10;
        C6938 c6939;
        Intent intent2;
        short[] sArr4;
        short[] sArr5;
        int i11;
        C6938 c69310;
        short[] sArr6;
        int iM450210;
        int i12;
        int i13;
        int i14;
        int i15;
        int iM450211;
        int i16;
        this = this;
        int i17 = 859235060;
        int i18 = RunnableC3388.f12514;
        int i19 = RunnableC1606.f6488;
        int iM11306 = ThreadFactoryC3888.m11306("ܳۧ") ^ i18;
        int i20 = ((iM11306 ^ i19) * (-12793)) ^ (-2138008756);
        int i21 = iM11306 ^ 1587694357;
        C6938 c69311 = null;
        String str = null;
        ViewGroup viewGroup = null;
        C14933 c14933 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i22 = 0;
        int iM11307 = 0;
        int iM11308 = 0;
        short s = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        C6938 c69312 = null;
        Intent intentM6287 = null;
        C21423 c21423 = null;
        String strM4365 = null;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        TextView textView = null;
        boolean z = false;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * 7079) >> 31));
            switch (i17) {
                case -2125092371:
                case -2045257276:
                    this.f34143.m47989((View) viewGroup);
                    z = false;
                    textView = (TextView) ViewTreeObserverOnPreDrawListenerC3327.m9872(viewGroup, 0);
                    this.f34145 = textView;
                    if (C1668.f6641 >= 0) {
                        iM450211 = ThreadFactoryC3888.m11306("ܰۘ") ^ i18;
                        i14 = ((iM450211 ^ i19) * (-15043)) ^ (-278783666);
                        i16 = 2035120512;
                    } else {
                        iM450211 = C19806.m45029("۬۫") ^ i18;
                        i14 = ((iM450211 ^ i19) * 13237) ^ 1944719402;
                        i16 = 348150780;
                    }
                    i21 = iM450211 ^ i16;
                    i20 = i14;
                    break;
                case -2080007165:
                case 1424783471:
                    i27 = i27;
                    intentM6287 = intentM6287;
                    sArr9 = sArr9;
                    i24 = i24;
                    i26 = i26;
                    i25 = i25;
                    sArr10 = sArr10;
                    sArr7 = sArr7;
                    C6938 c69313 = c69311;
                    sArr8 = sArr8;
                    c6938 = c69313;
                    super.onCreate(bundle);
                    m31023();
                    strM4365 = C1189.m4365(f34137, 1, 3, i22);
                    iM45029 = (C19806.m45029("ۚ۠") + i19) * 109;
                    i20 = ((iM45029 ^ i18) * (-31681)) ^ (-1881562269);
                    i7 = -2096594952;
                    int i30 = iM45029 ^ i7;
                    sArr7 = sArr7;
                    sArr10 = sArr10;
                    i25 = i25;
                    i27 = i27;
                    i21 = i30;
                    i26 = i26;
                    i24 = i24;
                    sArr9 = sArr9;
                    intentM6287 = intentM6287;
                    short[] sArr12 = sArr8;
                    c69311 = c6938;
                    sArr8 = sArr12;
                    break;
                case -2033131003:
                case 455010247:
                    iM11307 = ThreadFactoryC3888.m11306(C0671.m3009(sArr10, i28, 3, i22));
                    if (!C0962.f3784) {
                        iM450211 = ThreadFactoryC3888.m11306("۬ܰ") ^ i19;
                        i14 = ((iM450211 ^ i18) * 10931) ^ (-1534879820);
                        i16 = 1268213158;
                        i21 = iM450211 ^ i16;
                        i20 = i14;
                    } else {
                        intentM6287 = intentM6287;
                        sArr9 = sArr9;
                        i3 = i24;
                        i4 = i26;
                        i5 = i25;
                        sArr2 = sArr10;
                        C6938 c69314 = c69311;
                        sArr8 = sArr8;
                        c6938 = c69314;
                        int iM450212 = (i18 - C19806.m45029("ۡܰ")) * (-75);
                        i20 = ((iM450212 ^ i19) * (-2065)) ^ (-1949001899);
                        i21 = iM450212 ^ (-2007443388);
                        sArr10 = sArr2;
                        i25 = i5;
                        i26 = i4;
                        i24 = i3;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        short[] sArr13 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr13;
                    }
                    break;
                case -1967098052:
                case 2108489198:
                    C7105.m18993(textView, new ViewOnClickListenerC22922(3, this));
                    c21423 = this.f34143;
                    iM450211 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i19;
                    i14 = ((iM450211 ^ i18) * 22119) ^ 1403655746;
                    i16 = -1090903238;
                    i21 = iM450211 ^ i16;
                    i20 = i14;
                    break;
                case -1948901450:
                case -228441210:
                    C1377.m4833();
                    if (CallableC1627.m5507() == 0) {
                        intentM6287 = intentM6287;
                        sArr9 = sArr9;
                        i3 = i24;
                        i4 = i26;
                        i5 = i25;
                        sArr2 = sArr10;
                        C6938 c69315 = c69311;
                        sArr8 = sArr8;
                        c6938 = c69315;
                        int iM450213 = (i18 - C19806.m45029("ۡܰ")) * (-75);
                        i20 = ((iM450213 ^ i19) * (-2065)) ^ (-1949001899);
                        i21 = iM450213 ^ (-2007443388);
                        sArr10 = sArr2;
                        i25 = i5;
                        i26 = i4;
                        i24 = i3;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        short[] sArr14 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr14;
                    } else {
                        i = i27;
                        c69310 = c69312;
                        intent = intentM6287;
                        sArr6 = sArr9;
                        int iM11309 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i19;
                        c69312 = c69310;
                        i20 = ((iM11309 ^ i18) * 25081) ^ (-1398185302);
                        sArr9 = sArr6;
                        intentM6287 = intent;
                        i15 = i;
                        i21 = iM11309 ^ (-990417365);
                        i27 = i15;
                    }
                    break;
                case -1780902618:
                case -1370404346:
                    c6938 = c69311;
                    i22 = 27171;
                    iM45029 = (i18 - C19806.m45029("᩺۟")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i20 = ((iM45029 ^ i19) * 14615) ^ (-2136378798);
                    i7 = 1225403561;
                    int i31 = iM45029 ^ i7;
                    sArr7 = sArr7;
                    sArr10 = sArr10;
                    i25 = i25;
                    i27 = i27;
                    i21 = i31;
                    i26 = i26;
                    i24 = i24;
                    sArr9 = sArr9;
                    intentM6287 = intentM6287;
                    short[] sArr15 = sArr8;
                    c69311 = c6938;
                    sArr8 = sArr15;
                    break;
                case -1705810477:
                case -48062464:
                    C0817.m3403(c21423, c14933);
                    iM11308 = ThreadFactoryC3888.m11306(AbstractC0464.m2308(f34137, 24, 3, i22));
                    if (ThreadFactoryC3888.m11300() > 0) {
                        iM450211 = (C19806.m45029("ܳ᩶") + i18) * (-123);
                        i14 = ((iM450211 ^ i19) * 17215) ^ 1043126384;
                        i16 = 1953244168;
                        i21 = iM450211 ^ i16;
                        i20 = i14;
                    } else {
                        intentM6287 = intentM6287;
                        sArr9 = sArr9;
                        i3 = i24;
                        i4 = i26;
                        i5 = i25;
                        sArr2 = sArr10;
                        C6938 c69316 = c69311;
                        sArr8 = sArr8;
                        c6938 = c69316;
                        int iM450214 = (i18 - C19806.m45029("ۡܰ")) * (-75);
                        i20 = ((iM450214 ^ i19) * (-2065)) ^ (-1949001899);
                        i21 = iM450214 ^ (-2007443388);
                        sArr10 = sArr2;
                        i25 = i5;
                        i26 = i4;
                        i24 = i3;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        short[] sArr16 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr16;
                    }
                    break;
                case -1672763074:
                case 1543114906:
                    i2 = i27;
                    intentM6287 = intentM6287;
                    sArr9 = sArr9;
                    i3 = i24;
                    i4 = i26;
                    i5 = i25;
                    sArr2 = sArr10;
                    C6938 c69317 = c69311;
                    sArr8 = sArr8;
                    c6938 = c69317;
                    RunnableC0195.m1436(this, ThreadFactoryC3888.m11306(strM4365) ^ 2101683997);
                    sArr7 = f34137;
                    if (C7105.f23796 < 0) {
                        int iM113010 = (ThreadFactoryC3888.m11306("۠ۖ") + i18) * (-87);
                        sArr10 = sArr2;
                        i25 = i5;
                        i26 = i4;
                        i24 = i3;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        i8 = i2;
                        i21 = iM113010 ^ 900596522;
                        i20 = ((iM113010 ^ i19) * 22965) ^ 1174024938;
                        i27 = i8;
                        short[] sArr17 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr17;
                    } else {
                        i27 = i2;
                        int iM450215 = (i18 - C19806.m45029("ۡܰ")) * (-75);
                        i20 = ((iM450215 ^ i19) * (-2065)) ^ (-1949001899);
                        i21 = iM450215 ^ (-2007443388);
                        sArr10 = sArr2;
                        i25 = i5;
                        i26 = i4;
                        i24 = i3;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        short[] sArr18 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr18;
                    }
                    break;
                case -1592717419:
                case 2042195350:
                    if (C0671.f2816 != 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("᩹ۡ") + i19) * (-125);
                        i14 = ((iM450211 ^ i18) * 21355) ^ (-973013691);
                        i16 = 275399846;
                        i21 = iM450211 ^ i16;
                        i20 = i14;
                    } else {
                        i = i27;
                        c69310 = c69312;
                        intent = intentM6287;
                        sArr6 = sArr9;
                        int iM113011 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i19;
                        c69312 = c69310;
                        i20 = ((iM113011 ^ i18) * 25081) ^ (-1398185302);
                        sArr9 = sArr6;
                        intentM6287 = intent;
                        i15 = i;
                        i21 = iM113011 ^ (-990417365);
                        i27 = i15;
                    }
                    break;
                case -1539281222:
                case 165741815:
                    this.f34143 = (C21423) C2332.m7083(this, 2103265837 ^ iM11307);
                    sArr11 = f34137;
                    i27 = 21;
                    if (RunnableC0195.f1321 < 0) {
                        iM450211 = C19806.m45029("۬۟") ^ i19;
                        i14 = ((iM450211 ^ i18) * 11269) ^ 583645980;
                        i16 = 1186068696;
                        i21 = iM450211 ^ i16;
                        i20 = i14;
                    } else {
                        intentM6287 = intentM6287;
                        sArr9 = sArr9;
                        i3 = i24;
                        i4 = i26;
                        i5 = i25;
                        sArr2 = sArr10;
                        C6938 c69318 = c69311;
                        sArr8 = sArr8;
                        c6938 = c69318;
                        int iM450216 = (i18 - C19806.m45029("ۡܰ")) * (-75);
                        i20 = ((iM450216 ^ i19) * (-2065)) ^ (-1949001899);
                        i21 = iM450216 ^ (-2007443388);
                        sArr10 = sArr2;
                        i25 = i5;
                        i26 = i4;
                        i24 = i3;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        short[] sArr19 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr19;
                    }
                    break;
                case -1472680451:
                case 457221892:
                    i27 = i27;
                    intentM6287 = intentM6287;
                    sArr9 = sArr9;
                    i24 = i24;
                    i26 = i26;
                    i25 = i25;
                    sArr10 = sArr10;
                    sArr7 = sArr7;
                    C6938 c69319 = c69311;
                    sArr8 = sArr8;
                    c6938 = c69319;
                    int i32 = (s * s) + 25826724;
                    if ((i32 + i32) - (i23 * i23) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i19;
                        i20 = ((iM45029 ^ i18) * 25367) ^ 2057833047;
                        i7 = 1099278104;
                    } else {
                        iM45029 = (i19 - C19806.m45029("ᩴۜ")) * (-7);
                        i20 = ((iM45029 ^ i18) * (-12609)) ^ (-911681144);
                        i7 = 2021071599;
                    }
                    int i33 = iM45029 ^ i7;
                    sArr7 = sArr7;
                    sArr10 = sArr10;
                    i25 = i25;
                    i27 = i27;
                    i21 = i33;
                    i26 = i26;
                    i24 = i24;
                    sArr9 = sArr9;
                    intentM6287 = intentM6287;
                    short[] sArr110 = sArr8;
                    c69311 = c6938;
                    sArr8 = sArr110;
                    break;
                case -1452870797:
                case -744744437:
                    viewGroup = (ViewGroup) C2332.m7083(this, C19806.m45029(C1377.m4832(sArr11, i27, 3, i22)) ^ 2102123726);
                    if (!C0797.m3359()) {
                        i9 = i27;
                        i10 = i24;
                        sArr5 = sArr8;
                        c6939 = c69311;
                        intent2 = intentM6287;
                        sArr4 = sArr9;
                        int i34 = i25;
                        sArr3 = sArr10;
                        i11 = i34;
                        int iM450217 = (C19806.m45029("ۖ֨") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i35 = i10;
                        i20 = ((iM450217 ^ i18) * (-22677)) ^ 1137348720;
                        c69311 = c6939;
                        sArr8 = sArr5;
                        i27 = i9;
                        i21 = iM450217 ^ (-107505872);
                        i24 = i35;
                        sArr9 = sArr4;
                        intentM6287 = intent2;
                        short[] sArr20 = sArr3;
                        i25 = i11;
                        sArr10 = sArr20;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("᩸ܶ") ^ i18;
                        i14 = ((iM450211 ^ i19) * (-6517)) ^ 1149235194;
                        i16 = 403968965;
                        i21 = iM450211 ^ i16;
                        i20 = i14;
                    }
                    break;
                case -1368853356:
                case -629668021:
                    int i36 = i27;
                    C6938 c69320 = c69311;
                    RunnableC3388.m10053(c69320, new View.OnClickListener() { // from class: l.֨ۖۘ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i37 = 1711030566;
                            int i38 = C1875.f7103;
                            int i39 = C0050.f912;
                            int iM113012 = ThreadFactoryC3888.m11306("ܿۗ") ^ i38;
                            int i40 = ((iM113012 ^ i39) * (-11801)) ^ (-2022988441);
                            int i41 = 942539511;
                            while (true) {
                                i37 = ((((i37 ^ i39) * 19863) >> 31) & i40) ^ (iM113012 ^ i41);
                                switch (i37) {
                                    case -2126245946:
                                    case 791771447:
                                        if (C3722.f13525 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۘۡ") ^ i38;
                                            i40 = ((iM113012 ^ i39) * 7857) ^ (-261235198);
                                            i41 = -1044061105;
                                        } else {
                                            iM113012 = (C19806.m45029("ۧ۫") ^ i39) * 97;
                                            i40 = ((iM113012 ^ i38) * (-24717)) ^ 1831537176;
                                            i41 = -409691146;
                                        }
                                        break;
                                    case -1894393453:
                                    case -339068490:
                                        C0216.m1586(this.f3447);
                                        break;
                                    case -1798900993:
                                    case -752880094:
                                        if (C1398.f5802 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۘۡ") ^ i38;
                                            i40 = ((iM113012 ^ i39) * 7857) ^ (-261235198);
                                            i41 = -1044061105;
                                        } else {
                                            iM113012 = (C19806.m45029("ۨ᩻") + i38) * 17;
                                            i40 = ((iM113012 ^ i39) * 5031) ^ 1256359670;
                                            i41 = -243767025;
                                        }
                                        break;
                                    case -1499450634:
                                    case 786617344:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۘۡ") ^ i38;
                                            i40 = ((iM113012 ^ i39) * 7857) ^ (-261235198);
                                            i41 = -1044061105;
                                        } else {
                                            iM113012 = C19806.m45029("ܺ۠") ^ i39;
                                            i40 = ((iM113012 ^ i38) * 5005) ^ 1783357389;
                                            i41 = 495506532;
                                        }
                                        break;
                                    case -1407095321:
                                    case -593647902:
                                        C0216.m1591();
                                        break;
                                    case -1386525202:
                                    case 521817500:
                                        if (C7105.m18985()) {
                                            iM113012 = C19806.m45029("ۤ᩵") ^ i39;
                                            i40 = ((iM113012 ^ i38) * 26387) ^ (-50026245);
                                            i41 = 1657322994;
                                        } else {
                                            iM113012 = C19806.m45029("ᩴ᩺") ^ i39;
                                            i40 = ((iM113012 ^ i38) * 12163) ^ 1031865983;
                                            i41 = -1931671741;
                                        }
                                        break;
                                    case -1057697754:
                                    case -256328703:
                                        int i42 = ActivityC9994.f34138;
                                        if (C2249.f8050 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ܰ۬") ^ i38;
                                            i40 = ((iM113012 ^ i39) * (-19567)) ^ (-2068575918);
                                            i41 = -578729664;
                                        } else {
                                            iM113012 = C19806.m45029("ۘᩳ") ^ i38;
                                            i40 = ((iM113012 ^ i39) * 24921) ^ 493167400;
                                            i41 = 1680090277;
                                        }
                                        break;
                                    case -673568751:
                                    case 917552977:
                                        if (!C2332.f8260) {
                                            iM113012 = C19806.m45029("ۤ᩵") ^ i39;
                                            i40 = ((iM113012 ^ i38) * 26387) ^ (-50026245);
                                            i41 = 1657322994;
                                        } else {
                                            iM113012 = C19806.m45029("ܺ۠") ^ i39;
                                            i40 = ((iM113012 ^ i38) * 5005) ^ 1783357389;
                                            i41 = 495506532;
                                        }
                                        break;
                                    case -497532204:
                                    case 1555490431:
                                        if (C1668.f6641 >= 0) {
                                            iM113012 = (i38 - C19806.m45029("᩹᩸")) * (-61);
                                            i40 = ((iM113012 ^ i39) * 14249) ^ (-1599859276);
                                            i41 = 713395400;
                                        } else {
                                            iM113012 = (C19806.m45029("۫᩻") ^ i39) * 7;
                                            i40 = ((iM113012 ^ i38) * (-25643)) ^ 188990130;
                                            i41 = 365395043;
                                        }
                                        break;
                                    case -225107913:
                                    case 999341137:
                                        if (C0797.f3386) {
                                            iM113012 = (i38 - C19806.m45029("᩹᩸")) * (-61);
                                            i40 = ((iM113012 ^ i39) * 14249) ^ (-1599859276);
                                            i41 = 713395400;
                                        } else {
                                            iM113012 = (i38 - ThreadFactoryC3888.m11306("ᩳۜ")) * (-7);
                                            i40 = ((iM113012 ^ i39) * (-1095)) ^ (-2027445923);
                                            i41 = -1901765544;
                                        }
                                        break;
                                    case 15705062:
                                    case 910652444:
                                        if (C0216.f1393 != 0) {
                                            iM113012 = (i38 - C19806.m45029("᩹᩸")) * (-61);
                                            i40 = ((iM113012 ^ i39) * 14249) ^ (-1599859276);
                                            i41 = 713395400;
                                        } else {
                                            iM113012 = (C19806.m45029("᩹᩺") + i38) * 47;
                                            i40 = ((iM113012 ^ i39) * 20807) ^ 561795686;
                                            i41 = 28269285;
                                        }
                                        break;
                                    case 293480060:
                                    case 518082931:
                                        if (C0278.f1572 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ܰ۬") ^ i38;
                                            i40 = ((iM113012 ^ i39) * (-19567)) ^ (-2068575918);
                                            i41 = -578729664;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ۡܶ") ^ i39;
                                            i40 = ((iM113012 ^ i38) * (-2329)) ^ 111289750;
                                            i41 = 278701033;
                                        }
                                        break;
                                    case 683811876:
                                    case 1369615201:
                                        C1398.m4895();
                                        iM113012 = (i38 - C19806.m45029("᩹᩸")) * (-61);
                                        i40 = ((iM113012 ^ i39) * 14249) ^ (-1599859276);
                                        i41 = 713395400;
                                        break;
                                    case 720710891:
                                    case 1743877886:
                                        if (C10634.f36300 >= 0) {
                                            iM113012 = C19806.m45029("ܺ۠") ^ i39;
                                            i40 = ((iM113012 ^ i38) * 5005) ^ 1783357389;
                                            i41 = 495506532;
                                        } else {
                                            iM113012 = (i38 - C19806.m45029("᩹᩸")) * (-61);
                                            i40 = ((iM113012 ^ i39) * 14249) ^ (-1599859276);
                                            i41 = 713395400;
                                        }
                                        break;
                                    case 1637318124:
                                    case 1865032015:
                                        if (C1025.f4800 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ܰ۬") ^ i38;
                                            i40 = ((iM113012 ^ i39) * (-19567)) ^ (-2068575918);
                                            i41 = -578729664;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ۛ۬") ^ i39;
                                            i40 = ((iM113012 ^ i38) * (-21201)) ^ (-818621640);
                                            i41 = -1350073074;
                                        }
                                        break;
                                    default:
                                        if (C1419.m4973()) {
                                            iM113012 = C19806.m45029("ܺ۠") ^ i39;
                                            i40 = ((iM113012 ^ i38) * 5005) ^ 1783357389;
                                            i41 = 495506532;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("᩵ܿ") + i38) * (-19);
                                            i40 = ((iM113012 ^ i39) * (-1371)) ^ 658006855;
                                            i41 = -1778421704;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    intentM6287 = C1937.m6287(this);
                    sArr9 = f34137;
                    int iM113012 = (i19 - ThreadFactoryC3888.m11306("֨ۜ")) * 29;
                    i14 = ((iM113012 ^ i18) * 10527) ^ 1479023492;
                    c69311 = c69320;
                    i27 = i36;
                    i21 = iM113012 ^ (-1265552009);
                    i20 = i14;
                    break;
                case -1188095017:
                case -1063101250:
                    i2 = i27;
                    intentM6287 = intentM6287;
                    sArr9 = sArr9;
                    i3 = i24;
                    i4 = i26;
                    i5 = i25;
                    sArr2 = sArr10;
                    short[] sArr21 = sArr7;
                    C6938 c69321 = c69311;
                    sArr8 = sArr8;
                    c6938 = c69321;
                    short s2 = f34137[0];
                    int i37 = s2 + 5082;
                    if (C3577.f13150 < 0) {
                        int iM450218 = (C19806.m45029("ۖᩳ") ^ i18) * (-103);
                        s = s2;
                        int i38 = ((iM450218 ^ i19) * 32485) ^ 771475531;
                        i6 = iM450218 ^ (-976518673);
                        i23 = i37;
                        sArr7 = sArr21;
                        sArr10 = sArr2;
                        i25 = i5;
                        i20 = i38;
                        i26 = i4;
                        i24 = i3;
                        this = this;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        i8 = i2;
                        i21 = i6;
                        i27 = i8;
                        short[] sArr111 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr111;
                    } else {
                        s = s2;
                        i23 = i37;
                        sArr7 = sArr21;
                        i27 = i2;
                        int iM450219 = (i18 - C19806.m45029("ۡܰ")) * (-75);
                        i20 = ((iM450219 ^ i19) * (-2065)) ^ (-1949001899);
                        i21 = iM450219 ^ (-2007443388);
                        sArr10 = sArr2;
                        i25 = i5;
                        i26 = i4;
                        i24 = i3;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        short[] sArr112 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr112;
                    }
                    break;
                case -1109850633:
                case 293916973:
                    this.f34139 = C17132.m40033(this.f34141);
                    sArr10 = f34137;
                    i28 = 18;
                    iM450211 = C19806.m45029("ܳ֫") ^ i18;
                    i14 = ((iM450211 ^ i19) * (-9841)) ^ 628767603;
                    i16 = 416348002;
                    i21 = iM450211 ^ i16;
                    i20 = i14;
                    break;
                case -989459864:
                case -568250412:
                    int i39 = i29 + 1;
                    this.f34144 = i39;
                    C2332.m7081(new C22694(this, i39));
                    break;
                case -767748479:
                case -683613204:
                    if (!C2249.m6911(str)) {
                        iM450211 = C19806.m45029("ᩴܽ") ^ i18;
                        i14 = ((iM450211 ^ i19) * 4131) ^ 2107600528;
                        i16 = 601542401;
                        i21 = iM450211 ^ i16;
                        i20 = i14;
                    } else {
                        i = i27;
                        intent = intentM6287;
                        sArr = sArr9;
                        iM450210 = (i18 - C19806.m45029("ܿᩴ")) * (-85);
                        sArr6 = sArr;
                        i12 = ((iM450210 ^ i19) * 16141) ^ 34542953;
                        i13 = 1870084073;
                        int i40 = iM450210 ^ i13;
                        sArr9 = sArr6;
                        intentM6287 = intent;
                        i15 = i;
                        i21 = i40;
                        i20 = i12;
                        i27 = i15;
                    }
                    break;
                case -601333740:
                case 2026706007:
                    i2 = i27;
                    intentM6287 = intentM6287;
                    sArr9 = sArr9;
                    int i41 = i25;
                    short[] sArr22 = sArr10;
                    C6938 c69322 = c69311;
                    sArr8 = sArr8;
                    c6938 = c69322;
                    short[] sArr23 = sArr7;
                    int iM113013 = ThreadFactoryC3888.m11306(C1025.m3859(sArr23, 4, 3, i22)) ^ 2125514289;
                    int iM113014 = ThreadFactoryC3888.m11306("ۧۘ") ^ i19;
                    i20 = ((iM113014 ^ i18) * 11147) ^ 1594925693;
                    i6 = iM113014 ^ (-675248548);
                    sArr7 = sArr23;
                    sArr10 = sArr22;
                    i25 = i41;
                    i26 = i26;
                    i24 = iM113013;
                    sArr9 = sArr9;
                    intentM6287 = intentM6287;
                    i8 = i2;
                    i21 = i6;
                    i27 = i8;
                    short[] sArr113 = sArr8;
                    c69311 = c6938;
                    sArr8 = sArr113;
                    break;
                case -543209781:
                case 1824606694:
                    int i42 = i27;
                    short[] sArr24 = sArr8;
                    int i43 = i25;
                    short[] sArr25 = sArr10;
                    int i44 = i26;
                    c69312 = (C6938) C2332.m7083(this, ThreadFactoryC3888.m11306(C0797.m3361(sArr24, i43, i44, i22)) ^ 2128488410);
                    int iM113015 = (ThreadFactoryC3888.m11306("ۙۛ") ^ i19) * (-63);
                    sArr9 = sArr9;
                    intentM6287 = intentM6287;
                    i21 = iM113015 ^ 340389598;
                    i20 = ((iM113015 ^ i18) * 25617) ^ (-1869065417);
                    i27 = i42;
                    i26 = i44;
                    sArr10 = sArr25;
                    i25 = i43;
                    c69311 = c69311;
                    sArr8 = sArr24;
                    break;
                case -445370777:
                case 1840220752:
                    C0216.m1586(this);
                    break;
                case -414356073:
                case 1856815754:
                    C1377.m4833();
                    if (CallableC1627.m5507() != 0) {
                        i9 = i27;
                        i10 = i24;
                        sArr5 = sArr8;
                        c6939 = c69311;
                        intent2 = intentM6287;
                        sArr4 = sArr9;
                        int i310 = i25;
                        sArr3 = sArr10;
                        i11 = i310;
                        int iM4502110 = (C19806.m45029("ۖ֨") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i311 = i10;
                        i20 = ((iM4502110 ^ i18) * (-22677)) ^ 1137348720;
                        c69311 = c6939;
                        sArr8 = sArr5;
                        i27 = i9;
                        i21 = iM4502110 ^ (-107505872);
                        i24 = i311;
                        sArr9 = sArr4;
                        intentM6287 = intent2;
                        short[] sArr26 = sArr3;
                        i25 = i11;
                        sArr10 = sArr26;
                    } else {
                        i = i27;
                        c69310 = c69312;
                        intent = intentM6287;
                        sArr6 = sArr9;
                        int iM113016 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i19;
                        c69312 = c69310;
                        i20 = ((iM113016 ^ i18) * 25081) ^ (-1398185302);
                        sArr9 = sArr6;
                        intentM6287 = intent;
                        i15 = i;
                        i21 = iM113016 ^ (-990417365);
                        i27 = i15;
                    }
                    break;
                case -296066652:
                case 1007840646:
                    i = i27;
                    c69310 = c69312;
                    intent = intentM6287;
                    sArr6 = sArr9;
                    this.f41645 = c69310;
                    C0278.m1782(this, c69310);
                    C7105.m18992(this);
                    C6938 c69323 = this.f41645;
                    if (C0216.f1393 == 0) {
                        c69312 = c69310;
                        iM450210 = (i18 - C19806.m45029("ۚ᩷")) * 95;
                        c69311 = c69323;
                        i12 = ((iM450210 ^ i19) * 7259) ^ 1561171197;
                        i13 = 2021201557;
                        int i45 = iM450210 ^ i13;
                        sArr9 = sArr6;
                        intentM6287 = intent;
                        i15 = i;
                        i21 = i45;
                        i20 = i12;
                        i27 = i15;
                    } else {
                        c69311 = c69323;
                        int iM113017 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i19;
                        c69312 = c69310;
                        i20 = ((iM113017 ^ i18) * 25081) ^ (-1398185302);
                        sArr9 = sArr6;
                        intentM6287 = intent;
                        i15 = i;
                        i21 = iM113017 ^ (-990417365);
                        i27 = i15;
                    }
                    break;
                case -135733146:
                case 156804767:
                    c6938 = c69311;
                    i22 = 39517;
                    iM45029 = (i18 - C19806.m45029("᩺۟")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i20 = ((iM45029 ^ i19) * 14615) ^ (-2136378798);
                    i7 = 1225403561;
                    int i312 = iM45029 ^ i7;
                    sArr7 = sArr7;
                    sArr10 = sArr10;
                    i25 = i25;
                    i27 = i27;
                    i21 = i312;
                    i26 = i26;
                    i24 = i24;
                    sArr9 = sArr9;
                    intentM6287 = intentM6287;
                    short[] sArr114 = sArr8;
                    c69311 = c6938;
                    sArr8 = sArr114;
                    break;
                case 38854254:
                case 723534578:
                    C3660.m10791();
                    break;
                case 608418489:
                case 1033968084:
                    ThreadFactoryC3888.m11300();
                    C2788.m8472();
                    i = i27;
                    c69310 = c69312;
                    intent = intentM6287;
                    sArr6 = sArr9;
                    int iM113018 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i19;
                    c69312 = c69310;
                    i20 = ((iM113018 ^ i18) * 25081) ^ (-1398185302);
                    sArr9 = sArr6;
                    intentM6287 = intent;
                    i15 = i;
                    i21 = iM113018 ^ (-990417365);
                    i27 = i15;
                    break;
                case 625014135:
                case 1362017181:
                    c14933 = new C14933(this);
                    this.f34140 = c14933;
                    if (C3722.m10894() > 0) {
                        iM450211 = (i19 - C19806.m45029("ܺ᩹")) * (-81);
                        i14 = ((iM450211 ^ i18) * (-24739)) ^ (-1461117413);
                        i16 = -534321193;
                        i21 = iM450211 ^ i16;
                        i20 = i14;
                    } else {
                        intentM6287 = intentM6287;
                        sArr9 = sArr9;
                        i3 = i24;
                        i4 = i26;
                        i5 = i25;
                        sArr2 = sArr10;
                        C6938 c693110 = c69311;
                        sArr8 = sArr8;
                        c6938 = c693110;
                        int iM4502111 = (i18 - C19806.m45029("ۡܰ")) * (-75);
                        i20 = ((iM4502111 ^ i19) * (-2065)) ^ (-1949001899);
                        i21 = iM4502111 ^ (-2007443388);
                        sArr10 = sArr2;
                        i25 = i5;
                        i26 = i4;
                        i24 = i3;
                        sArr9 = sArr9;
                        intentM6287 = intentM6287;
                        short[] sArr115 = sArr8;
                        c69311 = c6938;
                        sArr8 = sArr115;
                    }
                    break;
                case 941067349:
                case 1888097274:
                    i9 = i27;
                    sArr3 = sArr10;
                    i10 = i24;
                    c6939 = c69311;
                    intent2 = intentM6287;
                    sArr4 = sArr9;
                    RunnableC0195.m1436(this, i10);
                    sArr5 = f34137;
                    i26 = 3;
                    if (C19806.f63586) {
                        i11 = 7;
                        int iM4502112 = (C19806.m45029("ۖ֨") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i313 = i10;
                        i20 = ((iM4502112 ^ i18) * (-22677)) ^ 1137348720;
                        c69311 = c6939;
                        sArr8 = sArr5;
                        i27 = i9;
                        i21 = iM4502112 ^ (-107505872);
                        i24 = i313;
                        sArr9 = sArr4;
                        intentM6287 = intent2;
                        short[] sArr27 = sArr3;
                        i25 = i11;
                        sArr10 = sArr27;
                    } else {
                        int iM113019 = ThreadFactoryC3888.m11306("۟ᩴ") ^ i18;
                        c69311 = c6939;
                        i24 = i10;
                        sArr8 = sArr5;
                        sArr9 = sArr4;
                        i27 = i9;
                        i21 = iM113019 ^ (-222210260);
                        i20 = ((iM113019 ^ i19) * (-26677)) ^ 1985104747;
                        intentM6287 = intent2;
                        sArr10 = sArr3;
                        i25 = 7;
                    }
                    break;
                case 1350249180:
                case 1635763170:
                    C6018 c6018 = (C6018) RunnableC0195.m1436(this, 2100846061 ^ iM11308);
                    this.f34146 = c6018;
                    c6018.setEnabled(z);
                    i29 = this.f34144;
                    iM450211 = (C19806.m45029("ܳۘ") + i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i14 = ((iM450211 ^ i19) * 32137) ^ (-584678368);
                    i16 = 197621004;
                    i21 = iM450211 ^ i16;
                    i20 = i14;
                    break;
                default:
                    i = i27;
                    sArr = sArr9;
                    intent = intentM6287;
                    String strM10060 = RunnableC3388.m10060(intent, C1025.m3859(sArr, 10, 8, i22));
                    this.f34141 = strM10060;
                    if (strM10060 != null) {
                        int iM113020 = (ThreadFactoryC3888.m11306("ܰۧ") + i19) * (-125);
                        i20 = ((iM113020 ^ i18) * 11253) ^ 233785815;
                        str = strM10060;
                        sArr9 = sArr;
                        i27 = i;
                        i21 = iM113020 ^ 879431105;
                        intentM6287 = intent;
                    } else {
                        str = strM10060;
                        iM450210 = (i18 - C19806.m45029("ܿᩴ")) * (-85);
                        sArr6 = sArr;
                        i12 = ((iM450210 ^ i19) * 16141) ^ 34542953;
                        i13 = 1870084073;
                        int i46 = iM450210 ^ i13;
                        sArr9 = sArr6;
                        intentM6287 = intent;
                        i15 = i;
                        i21 = i46;
                        i20 = i12;
                        i27 = i15;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25257(ActivityC9994 activityC9994, int i, Runnable runnable) {
        int i2 = 1921383340;
        int i3 = C1461.f5957;
        int i4 = C1066.f4915;
        int iM45029 = C19806.m45029("ۧܺ") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-32593)) ^ (-2029400299);
        int i6 = 1037456850;
        while (true) {
            i2 = ((((i2 ^ i4) * 13865) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2141688075:
                case 1706276162:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩹")) * (-17);
                        i5 = ((iM45029 ^ i3) * (-17637)) ^ (-517026221);
                        i6 = -1426380648;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۜ") + i3) * (-39);
                        i5 = ((iM45029 ^ i4) * 17703) ^ 480116732;
                        i6 = -946495810;
                    }
                    break;
                case -1993894592:
                case 1128787980:
                    if (C0050.f912 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ۜ")) * 99;
                        i5 = ((iM45029 ^ i4) * (-19925)) ^ 2048077140;
                        i6 = 645813289;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܳۧ")) * 115;
                        i5 = ((iM45029 ^ i4) * (-1813)) ^ (-908075382);
                        i6 = -1430152242;
                    }
                    break;
                case -1939336304:
                case 1233138008:
                    break;
                case -1804988844:
                case 1696414130:
                    C1461.m5080();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ۜ")) * 99;
                    i5 = ((iM45029 ^ i4) * (-19925)) ^ 2048077140;
                    i6 = 645813289;
                    break;
                case -1722121007:
                case -1303469784:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C2477.m7593() >= 0) {
                        iM45029 = C19806.m45029("᩸᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20163)) ^ 916570492;
                        i6 = 309511742;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-7475)) ^ 433218802;
                        i6 = 1663122341;
                    }
                    break;
                case -1623080141:
                case -355100529:
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15103) ^ (-665809379);
                        i6 = -1052809821;
                    } else {
                        iM45029 = C19806.m45029("ۤ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * 24309) ^ (-492631470);
                        i6 = 1530709271;
                    }
                    break;
                case -1346100420:
                case 2008676280:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("᩸᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20163)) ^ 916570492;
                        i6 = 309511742;
                    } else {
                        iM45029 = C19806.m45029("ۤۧ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-16715)) ^ 1804127200;
                        i6 = 1284654772;
                    }
                    break;
                case -1219223453:
                case 816014156:
                    if (i != activityC9994.f34144) {
                        iM45029 = C19806.m45029("᩺ۛ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 30665) ^ 967986436;
                        i6 = -737274478;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ᩵") + i4) * (-97);
                        i5 = ((iM45029 ^ i3) * (-10425)) ^ (-1540754234);
                        i6 = -1985455435;
                    }
                    break;
                case -1019635640:
                case 533909235:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15103) ^ (-665809379);
                        i6 = -1052809821;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-16849)) ^ (-1769829195);
                        i6 = -1546151462;
                    }
                    break;
                case -966038648:
                case 1669917698:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("᩸᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20163)) ^ 916570492;
                        i6 = 309511742;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۚ") + i3) * 69;
                        i5 = ((iM45029 ^ i4) * 23371) ^ 1025342040;
                        i6 = 1748181685;
                    }
                    break;
                case -900570445:
                case 56173555:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15103) ^ (-665809379);
                        i6 = -1052809821;
                    } else {
                        iM45029 = C19806.m45029("۫ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-7823)) ^ 1783507246;
                        i6 = -756493231;
                    }
                    break;
                case -482078852:
                case 111017424:
                    C2871.m8646();
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩹")) * (-17);
                        i5 = ((iM45029 ^ i3) * (-17637)) ^ (-517026221);
                        i6 = -1426380648;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ۜ")) * 99;
                        i5 = ((iM45029 ^ i4) * (-19925)) ^ 2048077140;
                        i6 = 645813289;
                    }
                    break;
                case -366350510:
                case 351774612:
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15103) ^ (-665809379);
                        i6 = -1052809821;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩳ۫")) * 23;
                        i5 = ((iM45029 ^ i3) * (-29817)) ^ 678880803;
                        i6 = -1430586822;
                    }
                    break;
                case -84822751:
                case 518733734:
                    C1977.m6365(runnable);
                    C1398.m4901(activityC9994.f34140);
                    break;
                case 145725372:
                case 1600210113:
                    C1398.m4895();
                    ThreadFactoryC3888.m11300();
                    break;
                case 663008568:
                case 1242871139:
                    C2332.m7079();
                    if (!C0962.f3784) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩹")) * (-17);
                        i5 = ((iM45029 ^ i3) * (-17637)) ^ (-517026221);
                        i6 = -1426380648;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-7475)) ^ 433218802;
                        i6 = 1663122341;
                    }
                    break;
                case 994050080:
                case 1340411506:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩹")) * (-17);
                        i5 = ((iM45029 ^ i3) * (-17637)) ^ (-517026221);
                        i6 = -1426380648;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۜ֡")) * 31;
                        i5 = ((iM45029 ^ i3) * 3451) ^ (-736366376);
                        i6 = 639066703;
                    }
                    break;
                default:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-7475)) ^ 433218802;
                        i6 = 1663122341;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-21009)) ^ 1531298605;
                        i6 = -1888943021;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m25264(final ActivityC9994 activityC9994, final int i, final Runnable runnable) {
        Runnable runnable2 = null;
        int i2 = -1103198007;
        int i3 = C0050.f912;
        int i4 = C2477.f9839;
        int iM45029 = (C19806.m45029("֫ܳ") ^ i3) * (-101);
        int i5 = ((iM45029 ^ i4) * 9911) ^ (-1171727011);
        int i6 = 692152000;
        while (true) {
            i2 = ((((i2 ^ i4) * (-5773)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2048335339:
                case -1090657409:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-7723)) ^ (-1588403791);
                        i6 = 1200638290;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܿ۬")) * q.h;
                        i5 = ((iM45029 ^ i3) * (-27049)) ^ (-823661291);
                        i6 = 1425387880;
                    }
                    break;
                case -2040547788:
                case 1115972715:
                    C2124.m6673();
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۙ") + i4) * (-57);
                        i5 = ((iM45029 ^ i3) * 20113) ^ (-1238791141);
                        i6 = -481485688;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙۤ")) * (-49);
                        i5 = ((iM45029 ^ i4) * (-16031)) ^ 762273357;
                        i6 = 882561800;
                    }
                    break;
                case -1950967216:
                case 13830070:
                    if (C0817.m3399()) {
                        iM45029 = (C19806.m45029("۟ۡ") + i4) * (-45);
                        i5 = ((iM45029 ^ i3) * (-11053)) ^ 687135811;
                        i6 = -1026309275;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۙ") + i4) * (-57);
                        i5 = ((iM45029 ^ i3) * 20113) ^ (-1238791141);
                        i6 = -481485688;
                    }
                    break;
                case -1901682766:
                case -1819614411:
                    if (RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15081) ^ (-1477943095);
                        i6 = -603900161;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙۤ")) * (-49);
                        i5 = ((iM45029 ^ i4) * (-16031)) ^ 762273357;
                        i6 = 882561800;
                    }
                    break;
                case -1876205810:
                case -605677840:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۛ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12183)) ^ 1321071896;
                        i6 = -898239243;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ֡") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * 22625) ^ 1695638480;
                        i6 = -665964215;
                    }
                    break;
                case -1578324047:
                case -1308612752:
                    activityC9994.f34143.stopScroll();
                    if (activityC9994.f34143.isComputingLayout()) {
                        iM45029 = C19806.m45029("ۜ۬") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-26711)) ^ (-86543327);
                        i6 = 954500781;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-14151)) ^ 603165277;
                        i6 = 782803249;
                    }
                    break;
                case -1578259246:
                case 185496712:
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۙ") + i4) * (-57);
                        i5 = ((iM45029 ^ i3) * 20113) ^ (-1238791141);
                        i6 = -481485688;
                    } else {
                        iM45029 = C19806.m45029("ᩴܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18865)) ^ 1970662365;
                        i6 = 394769106;
                    }
                    break;
                case -1081229254:
                case -747678776:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * 14197) ^ (-825427812);
                        i6 = -687685418;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳܺ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM45029 ^ i4) * 9513) ^ (-916794144);
                        i6 = -1476821482;
                    }
                    break;
                case -858142377:
                case 1221942227:
                    activityC9994.f34143.post(runnable2);
                    break;
                case -669479577:
                case 1618740426:
                    runnable2 = new Runnable(activityC9994) { // from class: l.۬ۖۘ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ActivityC9994 f42671;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i7 = 0;
                            Runnable runnable3 = null;
                            int i8 = 986500713;
                            int i9 = C0278.f1572;
                            int i10 = C2871.f10837;
                            int iM450210 = (C19806.m45029("ۢۖ") ^ i10) * 45;
                            int i11 = ((iM450210 ^ i9) * 20091) ^ 456561786;
                            int i12 = -1922718502;
                            while (true) {
                                i8 = ((((i8 ^ i9) * (-29685)) >> 31) & i11) ^ (iM450210 ^ i12);
                                switch (i8) {
                                    case -2126286514:
                                    case 2092121557:
                                        if (!C3286.f12186) {
                                            iM450210 = C19806.m45029("֡۟") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 16931) ^ 528795088;
                                            i12 = -505976918;
                                        } else {
                                            iM450210 = (C19806.m45029("ܽۡ") ^ i9) * 81;
                                            i11 = ((iM450210 ^ i10) * (-4207)) ^ (-1800645393);
                                            i12 = 956143323;
                                        }
                                        break;
                                    case -2054422752:
                                    case 1786740085:
                                        if (C2788.f10625 >= 0) {
                                            iM450210 = C19806.m45029("ۗ᩸") ^ i9;
                                            i11 = ((iM450210 ^ i10) * 18845) ^ 75414583;
                                            i12 = -899875755;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("֫ܽ") + i10) * (-59);
                                            i11 = ((iM450210 ^ i9) * (-14473)) ^ (-1948615574);
                                            i12 = 1020959752;
                                        }
                                        break;
                                    case -1969679183:
                                    case -757887494:
                                        if (C10634.f36300 >= 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("᩻᩵") ^ i10;
                                            i11 = ((iM450210 ^ i9) * (-4893)) ^ (-1224053144);
                                            i12 = -834641917;
                                        } else {
                                            iM450210 = (i10 - ThreadFactoryC3888.m11306("ۡۛ")) * (-75);
                                            i11 = ((iM450210 ^ i9) * (-6123)) ^ (-885650193);
                                            i12 = 1882231463;
                                        }
                                        break;
                                    case -1917583107:
                                    case -417338135:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450210 = C19806.m45029("ۗ᩸") ^ i9;
                                            i11 = ((iM450210 ^ i10) * 18845) ^ 75414583;
                                            i12 = -899875755;
                                        } else {
                                            iM450210 = C19806.m45029("֨֨") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 27181) ^ 1567347204;
                                            i12 = 946451261;
                                        }
                                        break;
                                    case -1793118544:
                                    case -1739654541:
                                        if (C0671.m3008() >= 0) {
                                            iM450210 = C19806.m45029("֡۟") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 16931) ^ 528795088;
                                            i12 = -505976918;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("ۢܰ") ^ i10;
                                            i11 = ((iM450210 ^ i9) * (-12357)) ^ (-1315822802);
                                            i12 = -843608109;
                                        }
                                        break;
                                    case -1510719043:
                                    case -114167166:
                                        i7 = i;
                                        if (C1377.f5749) {
                                            iM450210 = (C19806.m45029("ۙ۟") + i9) * (-87);
                                            i11 = ((iM450210 ^ i10) * (-15959)) ^ 997681236;
                                            i12 = -1774443680;
                                        } else {
                                            iM450210 = C19806.m45029("֡۟") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 16931) ^ 528795088;
                                            i12 = -505976918;
                                        }
                                        break;
                                    case -1300944733:
                                    case 12448303:
                                        if (!C1377.f5749) {
                                            iM450210 = ThreadFactoryC3888.m11306("᩻᩵") ^ i10;
                                            i11 = ((iM450210 ^ i9) * (-4893)) ^ (-1224053144);
                                            i12 = -834641917;
                                        } else {
                                            iM450210 = C19806.m45029("ۗ᩸") ^ i9;
                                            i11 = ((iM450210 ^ i10) * 18845) ^ 75414583;
                                            i12 = -899875755;
                                        }
                                        break;
                                    case -1264506089:
                                    case 1395114104:
                                        C2332.m7079();
                                        C2249.m6915();
                                        iM450210 = (C19806.m45029("ܽۡ") ^ i9) * 81;
                                        i11 = ((iM450210 ^ i10) * (-4207)) ^ (-1800645393);
                                        i12 = 956143323;
                                        break;
                                    case -1117162618:
                                    case -685043277:
                                        C3535.m10431();
                                        if (C2124.f7782 <= 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("᩻᩵") ^ i10;
                                            i11 = ((iM450210 ^ i9) * (-4893)) ^ (-1224053144);
                                            i12 = -834641917;
                                        } else {
                                            iM450210 = C19806.m45029("֡۟") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 16931) ^ 528795088;
                                            i12 = -505976918;
                                        }
                                        break;
                                    case -994028282:
                                    case 1502436538:
                                        ActivityC9994.m25257(this.f42671, i7, runnable3);
                                        break;
                                    case -585671469:
                                    case 1168846791:
                                        runnable3 = runnable;
                                        if (C0629.m2907()) {
                                            iM450210 = ThreadFactoryC3888.m11306("᩺ۡ") ^ i10;
                                            i11 = ((iM450210 ^ i9) * (-9577)) ^ 1977656168;
                                            i12 = -344033903;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("᩷۬") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 1579) ^ 654015334;
                                            i12 = 8782202;
                                        }
                                        break;
                                    case -472146371:
                                    case 966788371:
                                        if (C3535.f13026 <= 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("᩷۬") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 1579) ^ 654015334;
                                            i12 = 8782202;
                                        } else {
                                            iM450210 = (C19806.m45029("ۙۡ") + i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i11 = ((iM450210 ^ i10) * 13581) ^ (-331286416);
                                            i12 = -2073944024;
                                        }
                                        break;
                                    case -147336904:
                                    case 2135376337:
                                        if (C0526.m2437() >= 0) {
                                            iM450210 = C19806.m45029("֡۟") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 16931) ^ 528795088;
                                            i12 = -505976918;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("᩻֫") + i9) * 9;
                                            i11 = ((iM450210 ^ i10) * 28021) ^ 1800844011;
                                            i12 = 1290207848;
                                        }
                                        break;
                                    case -27585538:
                                    case 1137598963:
                                        if (C0671.m3008() >= 0) {
                                            iM450210 = (C19806.m45029("ܽۡ") ^ i9) * 81;
                                            i11 = ((iM450210 ^ i10) * (-4207)) ^ (-1800645393);
                                            i12 = 956143323;
                                        } else {
                                            iM450210 = C19806.m45029("᩺֨") ^ i9;
                                            i11 = ((iM450210 ^ i10) * 14645) ^ (-1364823139);
                                            i12 = -1866450444;
                                        }
                                        break;
                                    case 539276584:
                                    case 1779612104:
                                        C2124.m6673();
                                        break;
                                    default:
                                        if (AbstractC0464.m2313() != 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("᩷۬") ^ i10;
                                            i11 = ((iM450210 ^ i9) * 1579) ^ 654015334;
                                            i12 = 8782202;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("ᩴܶ") ^ i9) * (-15);
                                            i11 = ((iM450210 ^ i10) * (-19345)) ^ (-527698092);
                                            i12 = -562147418;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i7 = -412486585;
                            int i8 = ThreadFactoryC3888.f14547;
                            int i9 = C1148.f5161;
                            int iM11306 = ThreadFactoryC3888.m11306("ۖ֫") ^ i9;
                            int i10 = ((iM11306 ^ i8) * 27563) ^ (-1685572952);
                            int i11 = 1424096380;
                            while (true) {
                                i7 = ((((i7 ^ i8) * 21903) >> 31) & i10) ^ (iM11306 ^ i11);
                                switch (i7) {
                                    case -2044640438:
                                    case 1046266863:
                                        if (C2249.m6915() <= 0) {
                                            iM11306 = C19806.m45029("ۘ᩵") ^ i8;
                                            i10 = ((iM11306 ^ i9) * (-2207)) ^ (-619934843);
                                            i11 = -256357709;
                                        } else {
                                            iM11306 = C19806.m45029("ۤᩳ") ^ i9;
                                            i10 = ((iM11306 ^ i8) * (-13525)) ^ 373809969;
                                            i11 = -1987224843;
                                        }
                                        break;
                                    case -1978533764:
                                    case 1584382408:
                                        if (C1419.f5860 >= 0) {
                                            iM11306 = (ThreadFactoryC3888.m11306("۟֨") ^ i8) * 17;
                                            i10 = ((iM11306 ^ i9) * 6329) ^ 925775948;
                                            i11 = 2082787707;
                                        } else {
                                            iM11306 = C19806.m45029("ۨܳ") ^ i8;
                                            i10 = ((iM11306 ^ i9) * 10107) ^ 308316464;
                                            i11 = -412533873;
                                        }
                                        break;
                                    case -1968313716:
                                    case 974480144:
                                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i8;
                                            i10 = ((iM11306 ^ i9) * (-7293)) ^ (-853074096);
                                            i11 = 823164518;
                                        } else {
                                            iM11306 = (ThreadFactoryC3888.m11306("۟֨") ^ i8) * 17;
                                            i10 = ((iM11306 ^ i9) * 6329) ^ 925775948;
                                            i11 = 2082787707;
                                        }
                                        break;
                                    case -1647664788:
                                    case 969736817:
                                        CallableC1627.m5507();
                                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") ^ i8) * 17;
                                        i10 = ((iM11306 ^ i9) * 6329) ^ 925775948;
                                        i11 = 2082787707;
                                        break;
                                    case -1327286257:
                                    case -621130133:
                                        if (C0817.m3399()) {
                                            iM11306 = (ThreadFactoryC3888.m11306("ۡۨ") ^ i8) * 67;
                                            i10 = ((iM11306 ^ i9) * 11407) ^ 61531575;
                                            i11 = 501139555;
                                        } else {
                                            iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i8;
                                            i10 = ((iM11306 ^ i9) * (-7293)) ^ (-853074096);
                                            i11 = 823164518;
                                        }
                                        break;
                                    case -1324716864:
                                    case 1811829576:
                                        if (C3660.m10791() != 0) {
                                            iM11306 = (ThreadFactoryC3888.m11306("۟֨") ^ i8) * 17;
                                            i10 = ((iM11306 ^ i9) * 6329) ^ 925775948;
                                            i11 = 2082787707;
                                        } else {
                                            iM11306 = (i9 - ThreadFactoryC3888.m11306("ܰ᩸")) * (-113);
                                            i10 = ((iM11306 ^ i8) * (-7881)) ^ 996375975;
                                            i11 = 312651230;
                                        }
                                        break;
                                    case -1190808192:
                                    case 824973664:
                                        if (C1461.m5080()) {
                                            iM11306 = (ThreadFactoryC3888.m11306("۟֨") ^ i8) * 17;
                                            i10 = ((iM11306 ^ i9) * 6329) ^ 925775948;
                                            i11 = 2082787707;
                                        } else {
                                            iM11306 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                                            i10 = ((iM11306 ^ i9) * (-13997)) ^ (-1733318884);
                                            i11 = 398877890;
                                        }
                                        break;
                                    case -1061385722:
                                    case -450590976:
                                        C0216.m1591();
                                        throw new RuntimeException();
                                    case -613090910:
                                    case 328856814:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM11306 = C19806.m45029("ۘ᩵") ^ i8;
                                            i10 = ((iM11306 ^ i9) * (-2207)) ^ (-619934843);
                                            i11 = -256357709;
                                        } else {
                                            iM11306 = C19806.m45029("ۘ֨") ^ i9;
                                            i10 = ((iM11306 ^ i8) * 7021) ^ 1053691891;
                                            i11 = 559462925;
                                        }
                                        break;
                                    case -556513395:
                                    case 1101452687:
                                        if (C0629.f2722 <= 0) {
                                            iM11306 = (i9 - ThreadFactoryC3888.m11306("ۤۘ")) * 7;
                                            i10 = ((iM11306 ^ i8) * 32559) ^ (-900273005);
                                            i11 = -145989463;
                                        } else {
                                            iM11306 = C19806.m45029("ۛۜ") ^ i9;
                                            i10 = ((iM11306 ^ i8) * 18675) ^ (-528591150);
                                            i11 = -173900038;
                                        }
                                        break;
                                    case -550478466:
                                    case 1592475194:
                                        return;
                                    case -523534016:
                                    case -271964811:
                                        if (C0817.f3443) {
                                            iM11306 = (C19806.m45029("ۨۘ") ^ i8) * (-39);
                                            i10 = ((iM11306 ^ i9) * 25201) ^ (-1440135837);
                                            i11 = 1876456788;
                                        } else {
                                            iM11306 = (ThreadFactoryC3888.m11306("۟֨") ^ i8) * 17;
                                            i10 = ((iM11306 ^ i9) * 6329) ^ 925775948;
                                            i11 = 2082787707;
                                        }
                                        break;
                                    case -163645667:
                                    case 231459976:
                                        if (C0671.f2816 != 0) {
                                            iM11306 = C19806.m45029("ۘ᩵") ^ i8;
                                            i10 = ((iM11306 ^ i9) * (-2207)) ^ (-619934843);
                                            i11 = -256357709;
                                        } else {
                                            iM11306 = (ThreadFactoryC3888.m11306("ۗ᩷") + i8) * 23;
                                            i10 = ((iM11306 ^ i9) * 19313) ^ (-1272832953);
                                            i11 = -794876110;
                                        }
                                        break;
                                    case 726824974:
                                    case 1423880308:
                                        this.f42671 = activityC9994;
                                        if (C3577.f13150 >= 0) {
                                            iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i8;
                                            i10 = ((iM11306 ^ i9) * (-7293)) ^ (-853074096);
                                            i11 = 823164518;
                                        } else {
                                            iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i9;
                                            i10 = ((iM11306 ^ i8) * (-14023)) ^ (-1747240126);
                                            i11 = -1871072930;
                                        }
                                        break;
                                    case 1735601746:
                                    case 2041715451:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                            iM11306 = (ThreadFactoryC3888.m11306("۟֨") ^ i8) * 17;
                                            i10 = ((iM11306 ^ i9) * 6329) ^ 925775948;
                                            i11 = 2082787707;
                                        } else {
                                            iM11306 = (ThreadFactoryC3888.m11306("ܳ᩹") ^ i9) * 13;
                                            i10 = ((iM11306 ^ i8) * 31173) ^ 313157936;
                                            i11 = -506071519;
                                        }
                                        break;
                                    default:
                                        C1398.m4895();
                                        if (!C19806.f63586) {
                                            iM11306 = (i9 - ThreadFactoryC3888.m11306("ۤۘ")) * 7;
                                            i10 = ((iM11306 ^ i8) * 32559) ^ (-900273005);
                                            i11 = -145989463;
                                        } else {
                                            iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i8;
                                            i10 = ((iM11306 ^ i9) * (-7293)) ^ (-853074096);
                                            i11 = 823164518;
                                        }
                                        break;
                                }
                            }
                        }
                    };
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۛ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12183)) ^ 1321071896;
                        i6 = -898239243;
                    } else {
                        iM45029 = (C19806.m45029("ܽ֡") ^ i3) * q.h;
                        i5 = ((iM45029 ^ i4) * (-11041)) ^ 31336442;
                        i6 = -1859330950;
                    }
                    break;
                case -635824535:
                case -560210443:
                    if (C1460.m5050() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙۤ")) * (-49);
                        i5 = ((iM45029 ^ i4) * (-16031)) ^ 762273357;
                        i6 = 882561800;
                    } else {
                        iM45029 = (C19806.m45029("᩺ۘ") + i3) * (-91);
                        i5 = ((iM45029 ^ i4) * (-10985)) ^ 1287129563;
                        i6 = 1610842485;
                    }
                    break;
                case -602108908:
                case -163640419:
                    C0278.m1789();
                    CallableC1627.m5507();
                    break;
                case -548386384:
                case -418359617:
                    C0671.m3008();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙۤ")) * (-49);
                        i5 = ((iM45029 ^ i4) * (-16031)) ^ 762273357;
                        i6 = 882561800;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * 14197) ^ (-825427812);
                        i6 = -687685418;
                    }
                    break;
                case 196755017:
                case 451017249:
                    CallableC1627.m5507();
                    C0050.m946();
                    iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i4) * (-25);
                    i5 = ((iM45029 ^ i3) * 14197) ^ (-825427812);
                    i6 = -687685418;
                    break;
                case 945619850:
                case 1652745656:
                    runnable2.run();
                    break;
                case 1486400960:
                case 1897455595:
                    if (C2249.m6915() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-7723)) ^ (-1588403791);
                        i6 = 1200638290;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * 14197) ^ (-825427812);
                        i6 = -687685418;
                    }
                    break;
                case 1739951872:
                case 2128930242:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * 14197) ^ (-825427812);
                        i6 = -687685418;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32135)) ^ (-643321178);
                        i6 = 735372157;
                    }
                    break;
                default:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i4) * (-25);
                        i5 = ((iM45029 ^ i3) * 14197) ^ (-825427812);
                        i6 = -687685418;
                    } else {
                        iM45029 = C19806.m45029("ۙۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 22587) ^ (-2117441141);
                        i6 = -1473687402;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        Runnable runnable = null;
        C21423 c21423 = null;
        int i = 843850692;
        int i2 = C1398.f5802;
        int i3 = C3577.f13150;
        int iM45029 = C19806.m45029("ۘ۟") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-29751)) ^ 593745867;
        int i5 = 1260762467;
        while (true) {
            i = ((((i ^ i3) * 1809) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1880280368:
                case 411651870:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩻") ^ i3) * 31;
                        i4 = ((iM45029 ^ i2) * 5727) ^ 1870844505;
                        i5 = -522248351;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31537)) ^ 1941514406;
                        i5 = -30464859;
                    }
                    break;
                case -1869525211:
                case 1422509524:
                    c21423.stopScroll();
                    if (this.f34143.isComputingLayout()) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩺") + i3) * 51;
                        i4 = ((iM45029 ^ i2) * 21813) ^ 558620035;
                        i5 = 667502187;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9607)) ^ 15458049;
                        i5 = -434533306;
                    }
                    break;
                case -1817278522:
                case -321875898:
                    C1189.m4368();
                    C2788.m8472();
                    iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-14171)) ^ (-1326477180);
                    i5 = 609194417;
                    break;
                case -1792699706:
                case -809623082:
                    break;
                case -1380667416:
                case -279031407:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("᩸ܽ") + i2) * (-65);
                        i4 = ((iM45029 ^ i3) * (-13101)) ^ 1032345449;
                        i5 = -695785209;
                    } else {
                        iM45029 = C19806.m45029("֫ۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18989) ^ 461610482;
                        i5 = 1634514595;
                    }
                    break;
                case -1162354358:
                case 1215172097:
                    if (C1025.f4800 < 0) {
                        iM45029 = (C19806.m45029("᩸ܽ") + i2) * (-65);
                        i4 = ((iM45029 ^ i3) * (-13101)) ^ 1032345449;
                        i5 = -695785209;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷᩵")) * (-9);
                        i4 = ((iM45029 ^ i3) * (-25311)) ^ (-596217478);
                        i5 = -269461457;
                    }
                    break;
                case -1098772688:
                case 894368088:
                    C0797.m3359();
                    C1461.m5080();
                    break;
                case -1058435986:
                case 1206982111:
                    if (this.f34140 != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۧ") + i3) * (-87);
                        i4 = ((iM45029 ^ i2) * (-73)) ^ 1002294373;
                        i5 = 1712808995;
                    } else {
                        iM45029 = (C19806.m45029("۬ܰ") ^ i2) * 27;
                        i4 = ((iM45029 ^ i3) * 4017) ^ (-435171264);
                        i5 = 510323909;
                    }
                    break;
                case -960171047:
                case -934455251:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31537)) ^ 1941514406;
                        i5 = -30464859;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۖ") ^ i3) * (-7);
                        i4 = ((iM45029 ^ i2) * 5377) ^ (-641820033);
                        i5 = 1775533075;
                    }
                    break;
                case -854829373:
                case 626520292:
                    runnable.run();
                    iM45029 = (C19806.m45029("۬ܰ") ^ i2) * 27;
                    i4 = ((iM45029 ^ i3) * 4017) ^ (-435171264);
                    i5 = 510323909;
                    break;
                case -852229346:
                case 1692581288:
                    if (!C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-14171)) ^ (-1326477180);
                        i5 = 609194417;
                    } else {
                        iM45029 = C19806.m45029("ᩳᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11249) ^ (-1328616539);
                        i5 = 544861561;
                    }
                    break;
                case -840631729:
                case -712672081:
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31537)) ^ 1941514406;
                        i5 = -30464859;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ᩶")) * 59;
                        i4 = ((iM45029 ^ i2) * 26483) ^ (-1286771313);
                        i5 = -354001048;
                    }
                    break;
                case -666094407:
                case 1342214023:
                    if (C0671.m3008() >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷᩵")) * (-9);
                        i4 = ((iM45029 ^ i3) * (-25311)) ^ (-596217478);
                        i5 = -269461457;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-14171)) ^ (-1326477180);
                        i5 = 609194417;
                    }
                    break;
                case -546971677:
                case 1613781913:
                    super.onResume();
                    if (C0216.m1591() <= 0) {
                        iM45029 = (C19806.m45029("᩸ܽ") + i2) * (-65);
                        i4 = ((iM45029 ^ i3) * (-13101)) ^ 1032345449;
                        i5 = -695785209;
                    } else {
                        iM45029 = C19806.m45029("۠ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11745)) ^ (-1797378085);
                        i5 = -305063301;
                    }
                    break;
                case -316255525:
                case 1581054945:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("᩸ܽ") + i2) * (-65);
                        i4 = ((iM45029 ^ i3) * (-13101)) ^ 1032345449;
                        i5 = -695785209;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12011) ^ 867333075;
                        i5 = -24072667;
                    }
                    break;
                case -255513292:
                case 1277333821:
                    this.f34143.post(runnable);
                    break;
                case -117928430:
                case 183272163:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31537)) ^ 1941514406;
                        i5 = -30464859;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5821)) ^ (-2094491872);
                        i5 = -1527194631;
                    }
                    break;
                case -73317762:
                case 181398828:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ᩳᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11249) ^ (-1328616539);
                        i5 = 544861561;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20763) ^ (-1573831175);
                        i5 = -739416103;
                    }
                    break;
                case 99025081:
                case 146867581:
                    runnable = new Runnable() { // from class: l.᩹ۖۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3535.m10422(this.f71311.f34140);
                        }
                    };
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31537)) ^ 1941514406;
                        i5 = -30464859;
                    } else {
                        iM45029 = C19806.m45029("ۙܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20909)) ^ (-80235489);
                        i5 = -521298037;
                    }
                    break;
                default:
                    c21423 = this.f34143;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩵ᩴ")) * (-125);
                        i4 = ((iM45029 ^ i3) * 11489) ^ (-74646568);
                        i5 = -1400126770;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31537)) ^ 1941514406;
                        i5 = -30464859;
                    }
                    break;
            }
            return;
        }
    }
}
