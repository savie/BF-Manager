package l;

import android.os.IBinder;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V3Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22071 {

    /* JADX INFO: renamed from: ۤۖ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f71499 = {2760, 5481, -964, 13118, 6934, 14296, 3981, 7527, -6505, 4472, 3706, -26, -2575, -8179, -7737, 15774, -3237, 6462, 4286, 16243, 8269, 1351, 1948, 15094, -5470, -447, -3500, -6516, -7440, 2944, 16312, 4706, -4984, 6236, 5741, 3540, 14058, 8540, 5097, 369, 8479, -3492, 5953, -2412, 7406, 3984, -4601, 3911, 6196, 1962, -1796, 5064, 4856, 3524, 3532, 3533};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f71500;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f71501;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final View f71502;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f71503;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f71504;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ScrollView f71505;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final View f71506;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final TextView f71507;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TextView f71508;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f71509;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ScrollView f71510;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ImageView f71511;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f71512;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final TextView f71513;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f71514;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f71515;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final TextView f71516;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f71517;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f71518;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f71519;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final TextView f71520;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49014(C22071 c22071, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = -532401355;
        int i11 = C1419.f5860;
        int i12 = C0629.f2722;
        int iM45029 = (i12 - C19806.m45029("֨ۚ")) * 31;
        int i13 = ((iM45029 ^ i11) * 7709) ^ (-879168622);
        int i14 = -997342818;
        while (true) {
            i10 = ((((i10 ^ i11) * (-11149)) >> 31) & i13) ^ (iM45029 ^ i14);
            switch (i10) {
                case -2068862281:
                case -1879887713:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("ܰ᩺") ^ i12;
                        i13 = ((iM45029 ^ i11) * (-6627)) ^ (-1651099422);
                        i14 = -1954180743;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ֨") ^ i12;
                        i13 = ((iM45029 ^ i11) * 27753) ^ (-359565007);
                        i14 = -1480636135;
                    }
                    break;
                case -2009205253:
                case -1170392595:
                    c22071.m49011();
                    break;
                case -1981867418:
                case 1281649901:
                    if (RunnableC3388.m10064()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۡ") ^ i12;
                        i13 = ((iM45029 ^ i11) * 1911) ^ 404044869;
                        i14 = -1748983306;
                    } else {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܽ᩵")) * (-47);
                        i13 = ((iM45029 ^ i12) * 3911) ^ 33132437;
                        i14 = -54359964;
                    }
                    break;
                case -1949233571:
                case 1271383700:
                    if (i == i5) {
                        iM45029 = C19806.m45029("ܰ᩷") ^ i11;
                        i13 = ((iM45029 ^ i12) * 25427) ^ 1239991789;
                        i14 = -1287275919;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۠") ^ i11;
                        i13 = ((iM45029 ^ i12) * 12421) ^ (-2131528673);
                        i14 = 1872628636;
                    }
                    break;
                case -1939760752:
                case -1610036563:
                    if (i3 == i7) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۨ") ^ i12) * 17;
                        i13 = ((iM45029 ^ i11) * (-3149)) ^ (-1228539513);
                        i14 = -2123572502;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۠") ^ i11;
                        i13 = ((iM45029 ^ i12) * 12421) ^ (-2131528673);
                        i14 = 1872628636;
                    }
                    break;
                case -1906479298:
                case 1356715729:
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺֨") + i11) * (-35);
                        i13 = ((iM45029 ^ i12) * (-7281)) ^ (-2146377964);
                        i14 = 951900220;
                    } else {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("֡ᩳ")) * (-41);
                        i13 = ((iM45029 ^ i11) * 27907) ^ (-1666408296);
                        i14 = -843606872;
                    }
                    break;
                case -1904673534:
                case 780151798:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܽ᩵")) * (-47);
                        i13 = ((iM45029 ^ i12) * 3911) ^ 33132437;
                        i14 = -54359964;
                    } else {
                        iM45029 = C19806.m45029("ܰ᩺") ^ i12;
                        i13 = ((iM45029 ^ i11) * (-6627)) ^ (-1651099422);
                        i14 = -1954180743;
                    }
                    break;
                case -1678435479:
                case -1037930240:
                    C3660.m10791();
                    RunnableC3388.m10064();
                    iM45029 = (C19806.m45029("᩷᩵") ^ i11) * 31;
                    i13 = ((iM45029 ^ i12) * (-7213)) ^ (-1118383022);
                    i14 = -1745063095;
                    break;
                case -1627785680:
                case 2131162022:
                    i9 = C3660.f13403;
                    iM45029 = ThreadFactoryC3888.m11306("ۚ۟") ^ i12;
                    i13 = ((iM45029 ^ i11) * 22477) ^ (-1972465535);
                    i14 = 1543205137;
                    break;
                case -1578470374:
                case 1726302796:
                    if (i2 == i6) {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ܰ᩵")) * (-51);
                        i13 = ((iM45029 ^ i11) * (-4189)) ^ 507657670;
                        i14 = -1400207325;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۠") ^ i11;
                        i13 = ((iM45029 ^ i12) * 12421) ^ (-2131528673);
                        i14 = 1872628636;
                    }
                    break;
                case -1488004446:
                case -1261404763:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܽ᩵")) * (-47);
                        i13 = ((iM45029 ^ i12) * 3911) ^ 33132437;
                        i14 = -54359964;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۖ") ^ i11;
                        i13 = ((iM45029 ^ i12) * (-4237)) ^ (-808549994);
                        i14 = -2020393566;
                    }
                    break;
                case -1223219047:
                case 990828582:
                    C3577.m10565();
                    if (!C2871.m8646()) {
                        iM45029 = (C19806.m45029("᩷᩵") ^ i11) * 31;
                        i13 = ((iM45029 ^ i12) * (-7213)) ^ (-1118383022);
                        i14 = -1745063095;
                    } else {
                        iM45029 = C19806.m45029("ܰ᩺") ^ i12;
                        i13 = ((iM45029 ^ i11) * (-6627)) ^ (-1651099422);
                        i14 = -1954180743;
                    }
                    break;
                case -1211672479:
                case -1067396045:
                    break;
                case -1035462253:
                case 393835259:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۨܳ")) * (-7);
                        i13 = ((iM45029 ^ i11) * 11507) ^ 1156494552;
                        i14 = -1244322127;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i11) * 69;
                        i13 = ((iM45029 ^ i12) * 12423) ^ 724055568;
                        i14 = -914849517;
                    }
                    break;
                case -954563569:
                case 1228529557:
                    ThreadFactoryC3888.m11300();
                    C1066.m4023();
                    break;
                case -888597458:
                case -773132685:
                    if (i4 != i8) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۠") ^ i11;
                        i13 = ((iM45029 ^ i12) * 12421) ^ (-2131528673);
                        i14 = 1872628636;
                    } else {
                        iM45029 = C19806.m45029("ۢ֡") ^ i11;
                        i13 = ((iM45029 ^ i12) * 32623) ^ (-1846008707);
                        i14 = 1650953188;
                    }
                    break;
                case -428233586:
                case 684440984:
                    if (C0050.f912 <= 0) {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۨܳ")) * (-7);
                        i13 = ((iM45029 ^ i11) * 11507) ^ 1156494552;
                        i14 = -1244322127;
                    } else {
                        iM45029 = (C19806.m45029("ۨ᩻") + i12) * (-21);
                        i13 = ((iM45029 ^ i11) * (-31777)) ^ (-1301207658);
                        i14 = -375567133;
                    }
                    break;
                case -270709932:
                case -233738380:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("᩷᩵") ^ i11) * 31;
                        i13 = ((iM45029 ^ i12) * (-7213)) ^ (-1118383022);
                        i14 = -1745063095;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۨ") + i11) * (-71);
                        i13 = ((iM45029 ^ i12) * 6071) ^ 859356415;
                        i14 = -204227323;
                    }
                    break;
                case 370182514:
                case 1379128239:
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ܰۧ") ^ i12) * 11;
                        i13 = ((iM45029 ^ i11) * 17757) ^ 792971287;
                        i14 = 395268706;
                    } else {
                        iM45029 = (C19806.m45029("᩷᩵") ^ i11) * 31;
                        i13 = ((iM45029 ^ i12) * (-7213)) ^ (-1118383022);
                        i14 = -1745063095;
                    }
                    break;
                case 1217690256:
                case 1328694766:
                    if (i9 >= 0) {
                        iM45029 = C19806.m45029("ܰ᩺") ^ i12;
                        i13 = ((iM45029 ^ i11) * (-6627)) ^ (-1651099422);
                        i14 = -1954180743;
                    } else {
                        iM45029 = C19806.m45029("ۙᩳ") ^ i11;
                        i13 = ((iM45029 ^ i12) * (-14921)) ^ (-1832880438);
                        i14 = 869878606;
                    }
                    break;
                case 1412506337:
                case 1561908658:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("֡ᩳ")) * (-41);
                        i13 = ((iM45029 ^ i11) * 27907) ^ (-1666408296);
                        i14 = -843606872;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i12;
                        i13 = ((iM45029 ^ i11) * (-2311)) ^ (-1668069880);
                        i14 = -1732384978;
                    }
                    break;
                default:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۨܳ")) * (-7);
                        i13 = ((iM45029 ^ i11) * 11507) ^ 1156494552;
                        i14 = -1244322127;
                    } else {
                        iM45029 = (C19806.m45029("᩷᩵") ^ i11) * 31;
                        i13 = ((iM45029 ^ i12) * (-7213)) ^ (-1118383022);
                        i14 = -1745063095;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public C22071(l.AbstractActivityC12483 r63) {
        /*
            Method dump skipped, instruction units count: 2714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22071.<init>(l.۫ܶۘ):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m49012(MotionEvent motionEvent) {
        int actionMasked = 0;
        ScrollView scrollView = null;
        boolean z = false;
        int i = -558694182;
        int i2 = C1066.f4915;
        int i3 = C2642.f10294;
        int iM11306 = ThreadFactoryC3888.m11306("ۖᩳ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 28363) ^ 541311347;
        int i5 = 81065565;
        while (true) {
            i = ((((i ^ i2) * 13865) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2142045509:
                case -1319640966:
                    if (this.f71500) {
                        iM11306 = C19806.m45029("֨᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1825)) ^ (-1969275071);
                        i5 = 690708750;
                    } else {
                        iM11306 = C19806.m45029("۟۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7233) ^ 846076781;
                        i5 = -1284821709;
                    }
                    break;
                case -2093125263:
                case 630202424:
                    if (C3286.m9798() <= 0) {
                        iM11306 = C19806.m45029("ۛ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18285) ^ (-520517872);
                        i5 = 1553941028;
                    } else {
                        iM11306 = C19806.m45029("ᩴۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27597) ^ 800548019;
                        i5 = 1251360566;
                    }
                    break;
                case -2077899185:
                case 1724315879:
                    C0526.m2437();
                    if (C2871.f10837 < 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩶")) * 123;
                        i4 = ((iM11306 ^ i2) * (-17511)) ^ (-471653909);
                        i5 = -798642564;
                    } else {
                        iM11306 = C19806.m45029("᩺ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4197)) ^ 624715485;
                        i5 = -226121317;
                    }
                    break;
                case -1871696729:
                case 1179937297:
                    if (actionMasked != 2) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܶ") + i2) * 17;
                        i4 = ((iM11306 ^ i3) * (-2003)) ^ (-2033481701);
                        i5 = 1793010262;
                    } else {
                        iM11306 = (C19806.m45029("ᩳܶ") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * (-6245)) ^ 2084041884;
                        i5 = 368233950;
                    }
                    break;
                case -1817691992:
                case 2004360758:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("ۛ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18285) ^ (-520517872);
                        i5 = 1553941028;
                    } else {
                        iM11306 = (C19806.m45029("ۖܽ") + i2) * 13;
                        i4 = ((iM11306 ^ i3) * (-30203)) ^ (-809276266);
                        i5 = -1680942101;
                    }
                    break;
                case -1784260404:
                case -1755320116:
                    if (actionMasked != z) {
                        iM11306 = C19806.m45029("ۘ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 25439) ^ 1212672379;
                        i5 = 1506790188;
                    } else {
                        iM11306 = C19806.m45029("ۨۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17437) ^ 525090298;
                        i5 = 48031303;
                    }
                    break;
                case -1752878691:
                case 917558010:
                    actionMasked = motionEvent.getActionMasked();
                    scrollView = this.f71505;
                    z = true;
                    if (actionMasked != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11371) ^ (-656914274);
                        i5 = -220003412;
                    } else {
                        iM11306 = (C19806.m45029("ᩳܶ") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * (-6245)) ^ 2084041884;
                        i5 = 368233950;
                    }
                    break;
                case -1621860427:
                case -1462685405:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۘۜ")) * (-127);
                        i4 = ((iM11306 ^ i3) * 28099) ^ 651811524;
                        i5 = 1808878727;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ۫")) * (-13);
                        i4 = ((iM11306 ^ i2) * 8465) ^ (-227622475);
                        i5 = 1568750105;
                    }
                    break;
                case -1420659293:
                case 1966067931:
                    if (actionMasked == 3) {
                        iM11306 = C19806.m45029("ۨۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17437) ^ 525090298;
                        i5 = 48031303;
                    } else {
                        iM11306 = C19806.m45029("۟۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7233) ^ 846076781;
                        i5 = -1284821709;
                    }
                    break;
                case -1393521435:
                case -933019344:
                    break;
                case -1164100903:
                case -473606675:
                    C0817.m3399();
                    if (!C3743.f13569) {
                        iM11306 = C19806.m45029("۬᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13913) ^ 920942598;
                        i5 = -510058965;
                    } else {
                        iM11306 = C19806.m45029("᩺ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4197)) ^ 624715485;
                        i5 = -226121317;
                    }
                    break;
                case -877631638:
                case 458187322:
                    if (C1066.m4023() <= 0) {
                        iM11306 = C19806.m45029("ۛ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18285) ^ (-520517872);
                        i5 = 1553941028;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܽۤ")) * (-33);
                        i4 = ((iM11306 ^ i2) * 32725) ^ 953713526;
                        i5 = -930926955;
                    }
                    break;
                case -351594877:
                case 624251997:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۛ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18285) ^ (-520517872);
                        i5 = 1553941028;
                    } else {
                        iM11306 = C19806.m45029("۫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-937)) ^ (-1742145322);
                        i5 = 1079466263;
                    }
                    break;
                case -316807162:
                case 1093854970:
                    C3660.m10791();
                    break;
                case -261232215:
                case -10593472:
                    C0050.m946();
                    C0962.m3746();
                    iM11306 = C19806.m45029("᩺ۡ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-4197)) ^ 624715485;
                    i5 = -226121317;
                    break;
                case -164035396:
                case 776889444:
                    if (RunnableC1564.m5345()) {
                        iM11306 = C19806.m45029("ۛ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18285) ^ (-520517872);
                        i5 = 1553941028;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-5933)) ^ 327287556;
                        i5 = 1759745254;
                    }
                    break;
                case -58086945:
                case 369154042:
                    scrollView.requestDisallowInterceptTouchEvent(z);
                    break;
                case 130968655:
                case 791227560:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۘۜ")) * (-127);
                        i4 = ((iM11306 ^ i3) * 28099) ^ 651811524;
                        i5 = 1808878727;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۚ") ^ i2) * (-23);
                        i4 = ((iM11306 ^ i3) * 14313) ^ 157251258;
                        i5 = -861372362;
                    }
                    break;
                case 279279417:
                case 1168566718:
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("۬᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13913) ^ 920942598;
                        i5 = -510058965;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ᩳܺ")) * 35;
                        i4 = ((iM11306 ^ i2) * 16879) ^ 1171113287;
                        i5 = -1160017638;
                    }
                    break;
                case 371995922:
                case 950326322:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("۬᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13913) ^ 920942598;
                        i5 = -510058965;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵ۢ")) * 87;
                        i4 = ((iM11306 ^ i3) * 10085) ^ (-1730706631);
                        i5 = 1742734923;
                    }
                    break;
                case 545869983:
                case 1734349779:
                    scrollView.requestDisallowInterceptTouchEvent(false);
                    break;
                case 584877367:
                case 1607269965:
                    if (C7105.m18985()) {
                        iM11306 = C19806.m45029("۬᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13913) ^ 920942598;
                        i5 = -510058965;
                    } else {
                        iM11306 = C19806.m45029("᩸ۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6141) ^ (-858619443);
                        i5 = -848420050;
                    }
                    break;
                default:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۘۜ")) * (-127);
                        i4 = ((iM11306 ^ i3) * 28099) ^ 651811524;
                        i5 = 1808878727;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩶")) * 123;
                        i4 = ((iM11306 ^ i2) * (-17511)) ^ (-471653909);
                        i5 = -798642564;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49016(int i, boolean z) {
        int iM45029;
        int i2;
        boolean z2 = false;
        ScrollView scrollView = null;
        ViewGroup.LayoutParams layoutParamsM4890 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 581660749;
        int i4 = AbstractC0464.f2088;
        int i5 = C1460.f5948;
        int iM11306 = (i5 - ThreadFactoryC3888.m11306("۬᩵")) * (-17);
        int i6 = ((iM11306 ^ i4) * 8621) ^ 803160039;
        int i7 = -70412834;
        while (true) {
            int i8 = iM11306 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * (-11477)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2128945366:
                    case 137449360:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        C0817.m3399();
                        return false;
                    case -2125978357:
                    case 1088246861:
                        if (C1025.f4800 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܶ۫") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-157)) ^ 1000366041;
                            i7 = -1363435633;
                            break;
                        }
                        iM11306 = C19806.m45029("֨ܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-29935)) ^ (-1857759039);
                        i7 = -935187121;
                        break;
                    case -2078192548:
                    case 2144934914:
                        if (ThreadFactoryC3888.f14547 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۬ۚ") + i4) * (-83);
                            i6 = ((iM11306 ^ i5) * 17193) ^ (-1203831094);
                            i7 = 1389760389;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۠") ^ i5;
                        i6 = ((iM11306 ^ i4) * 1007) ^ (-960773858);
                        i7 = 1695333521;
                        break;
                    case -1930950720:
                    case 2007834402:
                        if (!CallableC1627.f6528) {
                            iM11306 = ThreadFactoryC3888.m11306("ܳ۠") ^ i5;
                            i6 = ((iM11306 ^ i4) * 1007) ^ (-960773858);
                            i7 = 1695333521;
                            break;
                            break;
                        }
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩺ܺ")) * (-55);
                        i6 = ((iM11306 ^ i5) * (-7717)) ^ (-563056555);
                        i7 = -2110476396;
                        break;
                    case -1897386914:
                    case 201649191:
                        if (!z) {
                            iM11306 = ThreadFactoryC3888.m11306("ۢ᩺") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-15765)) ^ (-511857863);
                            i7 = -1174250231;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۚ") + i4) * 63;
                        i6 = ((iM11306 ^ i5) * (-19007)) ^ (-2072876105);
                        i7 = 752156518;
                        break;
                    case -1886661865:
                    case 1032268560:
                        z4 = false;
                        iM11306 = (C19806.m45029("ᩴܶ") + i5) * (-67);
                        i6 = ((iM11306 ^ i4) * (-22067)) ^ (-493800431);
                        i7 = 1494803054;
                        break;
                    case -1544134132:
                    case 1490074450:
                        if (!C19806.f63586) {
                            iM11306 = (C19806.m45029("᩵ۢ") ^ i5) * 83;
                            i6 = ((iM11306 ^ i4) * (-22157)) ^ 298584649;
                            i7 = -18543183;
                            break;
                        }
                        iM11306 = C19806.m45029("֨ܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-29935)) ^ (-1857759039);
                        i7 = -935187121;
                        break;
                        break;
                    case -1395410540:
                    case 748770599:
                        if (C1148.m4232() > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۟ۙ") + i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i6 = ((iM11306 ^ i4) * 22879) ^ 574502805;
                            i7 = -1677283951;
                            break;
                        }
                        iM11306 = C19806.m45029("֨ܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-29935)) ^ (-1857759039);
                        i7 = -935187121;
                        break;
                        break;
                    case -1394095427:
                    case -909940063:
                        if (AbstractC0464.m2313() == 0) {
                            iM11306 = (i4 - C19806.m45029("ۖᩴ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i6 = ((iM11306 ^ i5) * (-11493)) ^ 1074652947;
                            i7 = -1629004717;
                            break;
                        }
                        iM11306 = C19806.m45029("᩷᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-13719)) ^ (-482712569);
                        i7 = 666428869;
                        break;
                    case -1278785273:
                    case 1968391758:
                        this.f71505.requestDisallowInterceptTouchEvent(z3);
                        scrollView.scrollTo(z3 ? 1 : 0, z3 ? 1 : 0);
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۚ") + i4) * 63;
                        i6 = ((iM11306 ^ i5) * (-19007)) ^ (-2072876105);
                        i7 = 752156518;
                        break;
                        break;
                    case -1174281139:
                    case 1602744882:
                        z2 = this.f71500;
                        this.f71500 = z;
                        if (C1189.f5284 > 0) {
                            iM11306 = C19806.m45029("ۚۙ") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-26225)) ^ 918322485;
                            i7 = 1379697990;
                            break;
                        }
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۘܺ")) * (-23);
                        i6 = ((iM11306 ^ i4) * 1291) ^ 1599775114;
                        i7 = 1042643709;
                        break;
                    case -1166230617:
                    case -306036321:
                        return !z4;
                    case -1138177911:
                    case 1856876690:
                        if (C0629.f2722 > 0) {
                            iM11306 = C19806.m45029("֨ܿ") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-29935)) ^ (-1857759039);
                            i7 = -935187121;
                            break;
                            break;
                        }
                        iM11306 = C19806.m45029("᩷᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-13719)) ^ (-482712569);
                        i7 = 666428869;
                        break;
                        break;
                    case -571108822:
                    case 566624612:
                        layoutParamsM4890.height = i;
                        scrollView.setLayoutParams(layoutParamsM4890);
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۚܺ")) * 23;
                        i6 = ((iM11306 ^ i5) * 29199) ^ (-921826656);
                        i7 = 2116195711;
                        break;
                    case -497023498:
                    case 1952276812:
                        if (!z2) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩺ۚ") + i4) * 63;
                            i6 = ((iM11306 ^ i5) * (-19007)) ^ (-2072876105);
                            i7 = 752156518;
                            break;
                            break;
                        }
                        iM11306 = (C19806.m45029("᩶ۖ") ^ i5) * (-51);
                        i6 = ((iM11306 ^ i4) * 19259) ^ 269535850;
                        i7 = -84390320;
                        break;
                    case -341174418:
                    case 559723869:
                        if (C1189.f5284 > 0) {
                            iM11306 = (i5 - C19806.m45029("ܳܿ")) * (-17);
                            i6 = ((iM11306 ^ i4) * 4767) ^ (-1820684915);
                            i7 = -1388481740;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۚ") + i4) * (-83);
                        i6 = ((iM11306 ^ i5) * 17193) ^ (-1203831094);
                        i7 = 1389760389;
                        break;
                        break;
                    case -25771831:
                    case 743710318:
                        C3286.m9798();
                        if (!RunnableC1895.f7152) {
                            iM11306 = C19806.m45029("᩷᩷") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-13719)) ^ (-482712569);
                            i7 = 666428869;
                            break;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۚ") + i4) * (-83);
                        i6 = ((iM11306 ^ i5) * 17193) ^ (-1203831094);
                        i7 = 1389760389;
                        break;
                        break;
                    case 90233908:
                    case 107986657:
                        C0962.m3746();
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۠") ^ i5;
                        i6 = ((iM11306 ^ i4) * 1007) ^ (-960773858);
                        i7 = 1695333521;
                        break;
                        break;
                    case 128651865:
                    case 173992286:
                        scrollView = this.f71510;
                        scrollView.setVerticalScrollBarEnabled(z);
                        layoutParamsM4890 = C1398.m4890(scrollView);
                        if (RunnableC1606.f6488 < 0) {
                            iM11306 = (C19806.m45029("᩹ۙ") + i5) * 57;
                            i6 = ((iM11306 ^ i4) * 28747) ^ 1444235656;
                            i7 = -285101063;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۠") ^ i5;
                        i6 = ((iM11306 ^ i4) * 1007) ^ (-960773858);
                        i7 = 1695333521;
                        break;
                        break;
                    case 233429776:
                    case 1666487403:
                        if (C2124.f7782 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤ۫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 1293) ^ 1058050913;
                            i7 = -496791571;
                            break;
                        }
                        iM11306 = C19806.m45029("֨ܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-29935)) ^ (-1857759039);
                        i7 = -935187121;
                        break;
                        break;
                    case 341482870:
                    case 838424596:
                        if (!z4) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۚܺ")) * 23;
                            i6 = ((iM11306 ^ i5) * 29199) ^ (-921826656);
                            i7 = 2116195711;
                            break;
                            break;
                        }
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۘ᩶")) * (-105);
                        i6 = ((iM11306 ^ i4) * 6305) ^ 212120097;
                        i7 = -1362062078;
                        break;
                    case 492098489:
                    case 1252916300:
                        if (C3722.f13525 > 0) {
                            iM11306 = (C19806.m45029("ᩳ᩸") + i4) * 11;
                            i6 = ((iM11306 ^ i5) * (-20381)) ^ (-1424416667);
                            i7 = -524064733;
                            break;
                        }
                        iM11306 = C19806.m45029("᩷᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-13719)) ^ (-482712569);
                        i7 = 666428869;
                        break;
                        break;
                    case 649967359:
                    case 1518624988:
                        if (layoutParamsM4890.height != i) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۨۙ") ^ i4) * (-7);
                            i6 = ((iM45029 ^ i5) * 9047) ^ 1066203317;
                            i2 = -839535943;
                        } else {
                            iM45029 = C19806.m45029("۬᩸") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-5021)) ^ 1943247280;
                            i2 = -644784214;
                        }
                        i8 = iM45029 ^ i2;
                        z3 = false;
                        break;
                    default:
                        z4 = true;
                        iM11306 = (C19806.m45029("ᩴܶ") + i5) * (-67);
                        i6 = ((iM11306 ^ i4) * (-22067)) ^ (-493800431);
                        i7 = 1494803054;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0356 A[PHI: r2 r5 r16 r17 r22
      0x0356: PHI (r2v29 java.lang.StringBuilder) = 
      (r2v2 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
      (r2v23 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
     binds: [B:75:0x0352, B:71:0x030e, B:41:0x019e, B:25:0x00dd, B:18:0x00a4, B:134:0x0356, B:11:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r5v6 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v4 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:75:0x0352, B:71:0x030e, B:41:0x019e, B:25:0x00dd, B:18:0x00a4, B:134:0x0356, B:11:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r16v24 android.widget.TextView) = 
      (r16v6 android.widget.TextView)
      (r16v18 android.widget.TextView)
      (r16v2 android.widget.TextView)
      (r16v2 android.widget.TextView)
      (r16v2 android.widget.TextView)
      (r16v2 android.widget.TextView)
      (r16v2 android.widget.TextView)
     binds: [B:75:0x0352, B:71:0x030e, B:41:0x019e, B:25:0x00dd, B:18:0x00a4, B:134:0x0356, B:11:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r17v25 java.lang.String) = 
      (r17v3 java.lang.String)
      (r17v15 java.lang.String)
      (r17v2 java.lang.String)
      (r17v2 java.lang.String)
      (r17v2 java.lang.String)
      (r17v2 java.lang.String)
      (r17v2 java.lang.String)
     binds: [B:75:0x0352, B:71:0x030e, B:41:0x019e, B:25:0x00dd, B:18:0x00a4, B:134:0x0356, B:11:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r22v29 android.widget.TextView) = 
      (r22v3 android.widget.TextView)
      (r22v16 android.widget.TextView)
      (r22v1 android.widget.TextView)
      (r22v1 android.widget.TextView)
      (r22v1 android.widget.TextView)
      (r22v1 android.widget.TextView)
      (r22v1 android.widget.TextView)
     binds: [B:75:0x0352, B:71:0x030e, B:41:0x019e, B:25:0x00dd, B:18:0x00a4, B:134:0x0356, B:11:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49020(C11986 c11986, long j, C11986 c11987) {
        int iM11306;
        int i;
        int i2;
        String str;
        StringBuilder sb;
        int i3;
        int iM11307;
        int i4;
        String str2;
        TextView textView;
        short s;
        TextView textView2;
        StringBuilder sb2;
        int iM11308;
        int i5;
        int i6;
        TextView textView3;
        C22071 c22071 = this;
        int i7 = -1373032522;
        int i8 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i9 = C3722.f13525;
        int iM45029 = (i9 - C19806.m45029("ۖ۟")) * (-7);
        int i10 = ((iM45029 ^ i8) * 20417) ^ (-1254827046);
        int i11 = iM45029 ^ 1050333977;
        String strM3741 = null;
        TextView textView4 = null;
        String strM6684 = null;
        View view = null;
        StringBuilder sbM8976 = null;
        int i12 = 0;
        int i13 = 0;
        TextView textView5 = null;
        short s2 = 0;
        String strM5863 = null;
        String strM6674 = null;
        TextView textView6 = null;
        String strM29840 = null;
        String strM6685 = null;
        View view2 = null;
        boolean z = false;
        String str3 = null;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * (-4787)) >> 31));
            switch (i7) {
                case -1897196710:
                case 639502463:
                    sbM8976 = C3012.m8976(strM29840, C3535.m10423(f71499, 53, 2, i12));
                    C0817.m3408(sbM8976, c11987.m29823());
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("ܶ۫") + i9) * (-111);
                        i = ((iM11306 ^ i8) * 19281) ^ (-67985187);
                        i2 = 54181873;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ܳۗ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i8) * 21589) ^ (-1545431601);
                        i2 = -1924160779;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1740876876:
                case 1170260664:
                    i12 = 35375;
                    int iM11309 = (ThreadFactoryC3888.m11306("ۜ֡") + i8) * 33;
                    i10 = ((iM11309 ^ i9) * 3037) ^ (-1412370642);
                    i4 = iM11309 ^ 834683112;
                    strM3741 = strM3741;
                    textView5 = textView5;
                    textView4 = textView4;
                    i11 = i4;
                    c22071 = this;
                    break;
                case -1649823019:
                case 2006420003:
                    if (C0278.m1789() > 0) {
                        str2 = strM3741;
                        textView = textView4;
                        s = s2;
                        textView2 = textView5;
                        sb2 = sbM8976;
                        iM11308 = (ThreadFactoryC3888.m11306("᩺ᩳ") ^ i8) * (-91);
                        i5 = ((iM11308 ^ i9) * 18365) ^ (-558800859);
                        i6 = -1793316304;
                        int i14 = iM11308 ^ i6;
                        s2 = s;
                        strM3741 = str2;
                        c22071 = this;
                        TextView textView7 = textView;
                        i11 = i14;
                        i10 = i5;
                        sbM8976 = sb2;
                        textView5 = textView2;
                        textView4 = textView7;
                    } else {
                        iM11306 = (C19806.m45029("ܶ۫") + i9) * (-111);
                        i = ((iM11306 ^ i8) * 19281) ^ (-67985187);
                        i2 = 54181873;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1578306393:
                case 751686928:
                    C1461.m5083(c22071.f71520, strM6674);
                    iM11306 = ThreadFactoryC3888.m11306("ۗ۠") ^ i8;
                    i = ((iM11306 ^ i9) * (-14719)) ^ 1171961582;
                    i2 = -2104098614;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1537651685:
                case -1092918194:
                    C3535.m10431();
                    break;
                case -1354378864:
                case -145852193:
                    MenuItemOnMenuItemClickListenerC3244.m9704(c22071.f71518, C8703.m22529(c11986.m29811(), z));
                    iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i9;
                    i = ((iM11306 ^ i8) * 27663) ^ 669260642;
                    i2 = 2089501821;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1233191201:
                case -122381675:
                    RunnableC1895.m6165(view2, i13);
                    iM11306 = ThreadFactoryC3888.m11306("ۗ۠") ^ i8;
                    i = ((iM11306 ^ i9) * (-14719)) ^ 1171961582;
                    i2 = -2104098614;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1209542072:
                case -820480473:
                    textView3 = textView4;
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView3, str3);
                    MenuItemOnMenuItemClickListenerC3244.m9704(c22071.f71509, c11986.m29840());
                    strM6685 = C2124.m6684(c11986.m29823());
                    if (!C0526.f2219) {
                        int iM450210 = (C19806.m45029("᩻᩷") + i9) * (-105);
                        i = ((iM450210 ^ i8) * (-29781)) ^ (-1367938313);
                        textView4 = textView3;
                        i11 = iM450210 ^ 1454537322;
                        i10 = i;
                    } else {
                        int iM113010 = (i9 - ThreadFactoryC3888.m11306("᩹ۖ")) * (-31);
                        TextView textView8 = textView3;
                        i10 = ((iM113010 ^ i8) * 4527) ^ 1901657478;
                        textView4 = textView8;
                        i11 = iM113010 ^ (-1357691753);
                    }
                    break;
                case -955734128:
                case 552013300:
                    str2 = strM3741;
                    textView = textView4;
                    s = s2;
                    textView2 = textView5;
                    sb2 = sbM8976;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("᩺ᩳ") ^ i8) * (-91);
                        i5 = ((iM11308 ^ i9) * 18365) ^ (-558800859);
                        i6 = -1793316304;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ۤ֨") ^ i9) * (-13);
                        i5 = ((iM11308 ^ i8) * 18759) ^ 690360070;
                        i6 = -939563569;
                    }
                    int i15 = iM11308 ^ i6;
                    s2 = s;
                    strM3741 = str2;
                    c22071 = this;
                    TextView textView9 = textView;
                    i11 = i15;
                    i10 = i5;
                    sbM8976 = sb2;
                    textView5 = textView2;
                    textView4 = textView9;
                    break;
                case -881987408:
                case 993506952:
                    C1461.m5083(c22071.f71508, strM6685);
                    textView6 = c22071.f71514;
                    strM5863 = C1791.m5863(j);
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹۠") + i8) * 25;
                        i = ((iM11306 ^ i9) * 9085) ^ 183552728;
                        i2 = 1653963606;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    } else {
                        str2 = strM3741;
                        textView = textView4;
                        s = s2;
                        textView2 = textView5;
                        sb2 = sbM8976;
                        iM11308 = (ThreadFactoryC3888.m11306("᩺ᩳ") ^ i8) * (-91);
                        i5 = ((iM11308 ^ i9) * 18365) ^ (-558800859);
                        i6 = -1793316304;
                        int i16 = iM11308 ^ i6;
                        s2 = s;
                        strM3741 = str2;
                        c22071 = this;
                        TextView textView10 = textView;
                        i11 = i16;
                        i10 = i5;
                        sbM8976 = sb2;
                        textView5 = textView2;
                        textView4 = textView10;
                    }
                    break;
                case -653773782:
                case 306279034:
                    C1066.m4023();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        str = strM3741;
                        textView4 = textView4;
                        textView5 = textView5;
                        sb = sbM8976;
                        iM11307 = (ThreadFactoryC3888.m11306("֫ۚ") ^ i8) * 81;
                        i10 = ((iM11307 ^ i9) * (-12069)) ^ (-118399619);
                        i3 = -771447384;
                        i4 = iM11307 ^ i3;
                        strM3741 = str;
                        sbM8976 = sb;
                        textView5 = textView5;
                        textView4 = textView4;
                        i11 = i4;
                        c22071 = this;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ᩳܳ")) * 49;
                        i = ((iM11306 ^ i8) * (-23245)) ^ 1442250497;
                        i2 = 1528681913;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case -635353174:
                case 1642671100:
                    C3722.m10890(view2, z ? 1 : 0);
                    strM29840 = c11987.m29840();
                    if (AbstractC0464.m2315(strM29840, c11986.m29840())) {
                        iM11306 = (C19806.m45029("۟ۗ") ^ i8) * 17;
                        i = ((iM11306 ^ i9) * (-1925)) ^ 534812354;
                        i2 = 1069852165;
                    } else {
                        strM6674 = strM29840;
                        iM11306 = C19806.m45029("ۙۜ") ^ i9;
                        i = ((iM11306 ^ i8) * (-24491)) ^ (-1390368943);
                        i2 = 162740713;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -619604904:
                case 599885060:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView6, strM5863);
                    strM6684 = C2124.m6684(c11986.m29839());
                    if (C1461.f5957 > 0) {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ۧᩳ")) * (-37);
                        i = ((iM11306 ^ i8) * 731) ^ (-986476990);
                        i2 = -1378093066;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    } else {
                        str = strM3741;
                        textView4 = textView4;
                        textView5 = textView5;
                        sb = sbM8976;
                        iM11307 = (ThreadFactoryC3888.m11306("֫ۚ") ^ i8) * 81;
                        i10 = ((iM11307 ^ i9) * (-12069)) ^ (-118399619);
                        i3 = -771447384;
                        i4 = iM11307 ^ i3;
                        strM3741 = str;
                        sbM8976 = sb;
                        textView5 = textView5;
                        textView4 = textView4;
                        i11 = i4;
                        c22071 = this;
                    }
                    break;
                case -546136523:
                case 2005638504:
                    str = strM3741;
                    textView4 = textView4;
                    textView5 = textView5;
                    sb = sbM8976;
                    s2 = f71499[52];
                    if (C3743.f13569) {
                        iM11307 = C19806.m45029("֨᩵") ^ i8;
                        i10 = ((iM11307 ^ i9) * (-23431)) ^ (-1004461770);
                        i3 = -1532534353;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֫ۚ") ^ i8) * 81;
                        i10 = ((iM11307 ^ i9) * (-12069)) ^ (-118399619);
                        i3 = -771447384;
                    }
                    i4 = iM11307 ^ i3;
                    strM3741 = str;
                    sbM8976 = sb;
                    textView5 = textView5;
                    textView4 = textView4;
                    i11 = i4;
                    c22071 = this;
                    break;
                case -257904748:
                case 444623348:
                    TextView textView11 = textView4;
                    c22071.f71511.setImageDrawable(c11986.m29844());
                    TextView textView12 = c22071.f71515;
                    strM3741 = C0962.m3741(c11986);
                    if (C2124.f7782 > 0) {
                        int iM450211 = C19806.m45029("ܿۗ") ^ i9;
                        textView5 = textView12;
                        textView4 = textView11;
                        i10 = ((iM450211 ^ i8) * 31027) ^ 122224987;
                        i11 = iM450211 ^ 1974924948;
                        c22071 = this;
                    } else {
                        textView5 = textView12;
                        textView4 = textView11;
                        iM11306 = (C19806.m45029("ܶ۫") + i9) * (-111);
                        i = ((iM11306 ^ i8) * 19281) ^ (-67985187);
                        i2 = 54181873;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case -33334657:
                case 1368974774:
                    C0278.m1789();
                    AbstractC0464.m2313();
                    iM11306 = (C19806.m45029("ܶ۫") + i9) * (-111);
                    i = ((iM11306 ^ i8) * 19281) ^ (-67985187);
                    i2 = 54181873;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 80668877:
                case 1213737200:
                    C3722.m10890(view, i13);
                    iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i9;
                    i = ((iM11306 ^ i8) * 27663) ^ 669260642;
                    i2 = 2089501821;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 94748117:
                case 2077835843:
                    str2 = strM3741;
                    textView = textView4;
                    textView2 = textView5;
                    s = s2;
                    sb2 = sbM8976;
                    int i17 = s + 1937;
                    if ((s * 7748) - (i17 * i17) <= 0) {
                        iM11308 = (C19806.m45029("ۢۜ") ^ i9) * 69;
                        i5 = ((iM11308 ^ i8) * 14735) ^ 1877161059;
                        i6 = -843782882;
                    } else {
                        iM11308 = (i8 - ThreadFactoryC3888.m11306("ᩳ᩹")) * 57;
                        i5 = ((iM11308 ^ i9) * (-2163)) ^ 65730107;
                        i6 = -1652907087;
                    }
                    int i18 = iM11308 ^ i6;
                    s2 = s;
                    strM3741 = str2;
                    c22071 = this;
                    TextView textView13 = textView;
                    i11 = i18;
                    i10 = i5;
                    sbM8976 = sb2;
                    textView5 = textView2;
                    textView4 = textView13;
                    break;
                case 159586114:
                case 1355294262:
                    TextView textView14 = textView5;
                    String str4 = strM3741;
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView14, str4);
                    TextView textView15 = c22071.f71507;
                    String strM29845 = c11986.m29845();
                    if (C0629.m2907()) {
                        int iM450212 = (i8 - C19806.m45029("ۡܿ")) * (-115);
                        i10 = ((iM450212 ^ i9) * 5745) ^ (-548153824);
                        i11 = iM450212 ^ 462721325;
                        strM3741 = str4;
                        textView4 = textView15;
                        str3 = strM29845;
                        textView5 = textView14;
                    } else {
                        strM3741 = str4;
                        textView4 = textView15;
                        str3 = strM29845;
                        textView5 = textView14;
                        iM11306 = (C19806.m45029("ܶ۫") + i9) * (-111);
                        i = ((iM11306 ^ i8) * 19281) ^ (-67985187);
                        i2 = 54181873;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case 350563326:
                case 596955028:
                    m49011();
                    break;
                case 366838097:
                case 960453356:
                    C1461.m5083(c22071.f71516, strM6684);
                    int iM29839 = c11986.m29839();
                    i13 = 8;
                    view = c22071.f71502;
                    z = false;
                    z = false;
                    if (iM29839 <= 2) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i8;
                        i = ((iM11306 ^ i9) * 31485) ^ 610548410;
                        i2 = -1513352252;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i8) * 101;
                        i = ((iM11306 ^ i9) * 25173) ^ (-1580403269);
                        i2 = -1728114034;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 398142534:
                case 1509268859:
                    c22071.m49016(-2, z);
                    c22071.f71510.scrollTo(z ? 1 : 0, z ? 1 : 0);
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("ܶ۫") + i9) * (-111);
                        i = ((iM11306 ^ i8) * 19281) ^ (-67985187);
                        i2 = 54181873;
                    } else {
                        iM11306 = C19806.m45029("ۙܿ") ^ i8;
                        i = ((iM11306 ^ i9) * 8813) ^ 954796540;
                        i2 = -570513909;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 402974907:
                case 600899856:
                    if (C2788.f10625 < 0) {
                        iM11306 = (C19806.m45029("ܶ۫") + i9) * (-111);
                        i = ((iM11306 ^ i8) * 19281) ^ (-67985187);
                        i2 = 54181873;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ᩳܳ")) * 49;
                        i = ((iM11306 ^ i8) * (-23245)) ^ 1442250497;
                        i2 = 1528681913;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 518423336:
                case 1343211967:
                    RunnableC1895.m6165(view, z ? 1 : 0);
                    C1461.m5083(c22071.f71513, C11986.m29796(c11986.m29821()));
                    if (!RunnableC3388.m10064()) {
                        textView3 = textView4;
                        int iM113011 = (i9 - ThreadFactoryC3888.m11306("᩹ۖ")) * (-31);
                        TextView textView16 = textView3;
                        i10 = ((iM113011 ^ i8) * 4527) ^ 1901657478;
                        textView4 = textView16;
                        i11 = iM113011 ^ (-1357691753);
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗᩴ") + i9) * (-21);
                        i = ((iM11306 ^ i8) * 11677) ^ (-686784691);
                        i2 = 1137969997;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case 640587399:
                case 2083707169:
                    C2788.m8480(sbM8976, C3286.m9788(f71499, 55, 1, i12));
                    strM6674 = C2124.m6674(sbM8976);
                    iM11306 = C19806.m45029("ۙۜ") ^ i9;
                    i = ((iM11306 ^ i8) * (-24491)) ^ (-1390368943);
                    i2 = 162740713;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 1181941449:
                case 2096916538:
                    MenuItemOnMenuItemClickListenerC3244.m9704(c22071.f71512, c11986.m29809());
                    view2 = c22071.f71517;
                    if (c11987 == null) {
                        iM11306 = (C19806.m45029("ᩳۜ") + i8) * 73;
                        i = ((iM11306 ^ i9) * (-27461)) ^ (-1858478348);
                        i2 = 1560087135;
                    } else {
                        iM11306 = C19806.m45029("ۧۙ") ^ i9;
                        i = ((iM11306 ^ i8) * (-10797)) ^ (-1879863749);
                        i2 = -10507102;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                default:
                    i12 = 3556;
                    int iM113012 = (ThreadFactoryC3888.m11306("ۜ֡") + i8) * 33;
                    i10 = ((iM113012 ^ i9) * 3037) ^ (-1412370642);
                    i4 = iM113012 ^ 834683112;
                    strM3741 = strM3741;
                    textView5 = textView5;
                    textView4 = textView4;
                    i11 = i4;
                    c22071 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0141 A[PHI: r13
      0x0141: PHI (r13v3 int) = (r13v2 int), (r13v1 int) binds: [B:41:0x013f, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x02e1 A[PHI: r4 r5 r6
      0x02e1: PHI (r4v3 android.text.Layout) = (r4v2 android.text.Layout), (r4v1 android.text.Layout), (r4v1 android.text.Layout) binds: [B:81:0x02c9, B:74:0x026e, B:66:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r5v3 boolean) = (r5v2 boolean), (r5v1 boolean), (r5v1 boolean) binds: [B:81:0x02c9, B:74:0x026e, B:66:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r6v3 boolean) = (r6v2 boolean), (r6v1 boolean), (r6v1 boolean) binds: [B:81:0x02c9, B:74:0x026e, B:66:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x02fe A[PHI: r3 r7 r16 r17
      0x02fe: PHI (r3v3 android.widget.TextView) = 
      (r3v2 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
     binds: [B:85:0x02fc, B:32:0x00e1, B:28:0x00bb, B:13:0x0064, B:10:0x005b, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:85:0x02fc, B:32:0x00e1, B:28:0x00bb, B:13:0x0064, B:10:0x005b, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r16v3 int) = (r16v1 int), (r16v2 int), (r16v1 int), (r16v1 int), (r16v1 int), (r16v1 int) binds: [B:85:0x02fc, B:32:0x00e1, B:28:0x00bb, B:13:0x0064, B:10:0x005b, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r17v3 int) = (r17v1 int), (r17v2 int), (r17v1 int), (r17v1 int), (r17v1 int), (r17v1 int) binds: [B:85:0x02fc, B:32:0x00e1, B:28:0x00bb, B:13:0x0064, B:10:0x005b, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0332 A[PHI: r2 r9 r11 r24
      0x0332: PHI (r2v3 android.widget.ScrollView) = 
      (r2v2 android.widget.ScrollView)
      (r2v1 android.widget.ScrollView)
      (r2v1 android.widget.ScrollView)
      (r2v1 android.widget.ScrollView)
      (r2v1 android.widget.ScrollView)
     binds: [B:89:0x0330, B:62:0x0227, B:58:0x0205, B:50:0x01af, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0332: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:89:0x0330, B:62:0x0227, B:58:0x0205, B:50:0x01af, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0332: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:89:0x0330, B:62:0x0227, B:58:0x0205, B:50:0x01af, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0332: PHI (r24v5 int) = (r24v3 int), (r24v4 int), (r24v3 int), (r24v3 int), (r24v3 int) binds: [B:89:0x0330, B:62:0x0227, B:58:0x0205, B:50:0x01af, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m49010(C22071 c22071) {
        int iM11306;
        int i;
        int i2;
        C22071 c22072 = c22071;
        ScrollView scrollView = null;
        TextView textView = null;
        Layout layout = null;
        boolean z = false;
        boolean z2 = false;
        int totalPaddingTop = 0;
        int i3 = 0;
        int totalPaddingBottom = 0;
        int i4 = 0;
        int totalPaddingTop2 = 0;
        int i5 = 0;
        int totalPaddingBottom2 = 0;
        int iM10956 = 0;
        int iM10957 = 0;
        int i6 = 1631315283;
        int i7 = C1937.f7317;
        int i8 = C7105.f23796;
        int iM45029 = (C19806.m45029("۫ۧ") ^ i8) * 77;
        int i9 = ((iM45029 ^ i7) * (-22867)) ^ (-737907368);
        int i10 = iM45029 ^ (-428098213);
        int i11 = 0;
        int i12 = 0;
        View view = null;
        int height = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * 28353) >> 31));
            switch (i6) {
                case -2113532498:
                case -1929902565:
                    scrollView = c22072.f71505;
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i8;
                        i = ((iM11306 ^ i7) * 12057) ^ 794379060;
                        i2 = 463433775;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۗ") ^ i8;
                        i = ((iM11306 ^ i7) * IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) ^ (-664301098);
                        i2 = -1480472914;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -2045176990:
                case -453984058:
                    totalPaddingTop2 = textView.getTotalPaddingTop() + layout.getLineTop(i4);
                    if (RunnableC1895.f7152) {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ܺ᩻")) * (-31);
                        i = ((iM11306 ^ i7) * (-21991)) ^ 1075649717;
                        i2 = -756562851;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۬") ^ i7;
                        i = ((iM11306 ^ i8) * (-28379)) ^ (-383382864);
                        i2 = -839910483;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -2027431786:
                case -1807456070:
                    i5 = -2;
                    if (totalPaddingBottom <= totalPaddingBottom2) {
                        iM11306 = C19806.m45029("ܰۢ") ^ i8;
                        i = ((iM11306 ^ i7) * (-19963)) ^ (-1316516800);
                        i2 = -1684239251;
                    } else {
                        iM11306 = C19806.m45029("֫ۤ") ^ i7;
                        i = ((iM11306 ^ i8) * (-29583)) ^ (-1526065833);
                        i2 = -1735677945;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -2002783125:
                case 848762298:
                    if (C3743.m10956(view) == 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩺۠")) * (-83);
                        i = ((iM11306 ^ i8) * 6817) ^ 1680384543;
                        i2 = 529912203;
                    } else {
                        iM11306 = C19806.m45029("ۤ᩺") ^ i8;
                        i = ((iM11306 ^ i7) * 27079) ^ 971513741;
                        i2 = -1516156352;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1954602674:
                case 1063161707:
                    layout = textView.getLayout();
                    z = true;
                    z = true;
                    z2 = false;
                    z2 = false;
                    if (layout != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۟") ^ i8;
                        i = ((iM11306 ^ i7) * 23785) ^ 1151951648;
                        i2 = 1151754011;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩺۠")) * (-83);
                        i = ((iM11306 ^ i8) * 6817) ^ 1680384543;
                        i2 = 529912203;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1922591248:
                case 493640251:
                    int i13 = c22072.f71519;
                    if (i13 < 4) {
                        int iM450210 = (C19806.m45029("ۚ֨") + i7) * 81;
                        i12 = i13;
                        i9 = ((iM450210 ^ i8) * (-29327)) ^ (-1553271121);
                        i10 = iM450210 ^ (-950168228);
                    } else {
                        i12 = i13;
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩸") ^ i7) * (-95);
                        i = ((iM11306 ^ i8) * (-13399)) ^ 760284242;
                        i2 = 967865638;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1899941549:
                case 1145393886:
                    if (C2642.m8169(scrollView) != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܺ") + i8) * (-15);
                        i = ((iM11306 ^ i7) * (-18187)) ^ (-644529641);
                        i2 = 293179449;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩺۠")) * (-83);
                        i = ((iM11306 ^ i8) * 6817) ^ 1680384543;
                        i2 = 529912203;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1792500637:
                case -599812656:
                    i11 = iM10956 - iM10957;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("᩸᩵") ^ i7;
                        i = ((iM11306 ^ i8) * (-439)) ^ 61264939;
                        i2 = 962720644;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ۚۗ")) * 79;
                        i = ((iM11306 ^ i8) * (-1907)) ^ 1681822681;
                        i2 = -897493423;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1681207778:
                case 1283510981:
                    i4 = 6;
                    if (layout.getLineCount() > 6) {
                        iM11306 = C19806.m45029("۬ܺ") ^ i7;
                        i = ((iM11306 ^ i8) * (-3187)) ^ (-45459016);
                        i2 = 256665701;
                    } else {
                        totalPaddingBottom2 = totalPaddingBottom;
                        iM11306 = (i7 - C19806.m45029("ۧۛ")) * (-53);
                        i = ((iM11306 ^ i8) * (-6711)) ^ (-599096720);
                        i2 = -1502805783;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1497204256:
                case 1427651306:
                    totalPaddingTop = textView.getTotalPaddingTop();
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۢ") ^ i7;
                        i = ((iM11306 ^ i8) * (-18775)) ^ 420120077;
                        i2 = -2137273643;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i8;
                        i = ((iM11306 ^ i7) * 12057) ^ 794379060;
                        i2 = 463433775;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1485891394:
                case -170085966:
                    totalPaddingBottom = textView.getTotalPaddingBottom() + i3;
                    if (C1377.m4833() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i8;
                        i = ((iM11306 ^ i7) * 12057) ^ 794379060;
                        i2 = 463433775;
                    } else {
                        iM11306 = (C19806.m45029("ۡ֫") + i8) * (-45);
                        i = ((iM11306 ^ i7) * (-15549)) ^ (-1914044231);
                        i2 = 548821342;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1356873549:
                case 1099943885:
                    totalPaddingBottom2 = textView.getTotalPaddingBottom() + totalPaddingTop2;
                    iM11306 = (i7 - C19806.m45029("ۧۛ")) * (-53);
                    i = ((iM11306 ^ i8) * (-6711)) ^ (-599096720);
                    i2 = -1502805783;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1128821917:
                case 1470740939:
                    c22072.f71519 = z2 ? 1 : 0;
                    return z;
                case -834995044:
                case 1371254967:
                    c22072.f71519 = i12 + (z ? 1 : 0);
                    c22071.m49011();
                    return z2;
                case -772015741:
                case -633690258:
                    RunnableC1895.m6170();
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                        i = ((iM11306 ^ i7) * 1195) ^ 1430949433;
                        i2 = -1990215671;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ۚۗ")) * 79;
                        i = ((iM11306 ^ i8) * (-1907)) ^ 1681822681;
                        i2 = -897493423;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -757151724:
                case 567085640:
                    if (C1025.m3867(z2 ? 1 : 0, i11) + totalPaddingBottom2 > C2642.m8169(scrollView)) {
                        iM11306 = (C19806.m45029("ܶۜ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i8) * (-25879)) ^ 1126207121;
                        i2 = -1013447474;
                    } else {
                        iM11306 = (C19806.m45029("ۛܽ") + i8) * q.h;
                        i = ((iM11306 ^ i7) * (-28471)) ^ (-1664342840);
                        i2 = 795375355;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -314037081:
                case 1797743608:
                    i3 = totalPaddingTop + height;
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ۧ᩺") ^ i8;
                        i = ((iM11306 ^ i7) * (-30083)) ^ 2114651773;
                        i2 = 1011960023;
                    } else {
                        iM11306 = (C19806.m45029("ۛᩴ") + i8) * 59;
                        i = ((iM11306 ^ i7) * 18959) ^ 703234039;
                        i2 = 37334406;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -305705626:
                case 105297868:
                    View view2 = c22072.f71503;
                    if (C1668.f6641 >= 0) {
                        view = view2;
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                        i = ((iM11306 ^ i7) * 1195) ^ 1430949433;
                        i2 = -1990215671;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i7;
                        i10 = iM11307 ^ 1732724754;
                        view = view2;
                        i9 = ((iM11307 ^ i8) * 13009) ^ 1641061811;
                        c22072 = c22071;
                    }
                    break;
                case -164237941:
                case 517601819:
                    C2249.m6915();
                    if (C0526.f2219) {
                        iM11306 = (i7 - C19806.m45029("ۚۗ")) * 79;
                        i = ((iM11306 ^ i8) * (-1907)) ^ 1681822681;
                        i2 = -897493423;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۬") ^ i7;
                        i = ((iM11306 ^ i8) * (-28379)) ^ (-383382864);
                        i2 = -839910483;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -67071146:
                case -10677922:
                    return c22072.m49016(totalPaddingBottom2, z);
                case 290398:
                case 642995633:
                    C3535.m10431();
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i8;
                        i = ((iM11306 ^ i7) * 12057) ^ 794379060;
                        i2 = 463433775;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ۚۗ")) * 79;
                        i = ((iM11306 ^ i8) * (-1907)) ^ 1681822681;
                        i2 = -897493423;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 89470493:
                case 1839539630:
                    textView = c22072.f71512;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i7 - C19806.m45029("ۚۗ")) * 79;
                        i = ((iM11306 ^ i8) * (-1907)) ^ 1681822681;
                        i2 = -897493423;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܺ") + i8) * 45;
                        i = ((iM11306 ^ i7) * (-1377)) ^ 1855890597;
                        i2 = -1398956154;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 436347919:
                case 1933011955:
                    iM10956 = C3743.m10956(view);
                    iM10957 = C3743.m10956(c22072.f71510);
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i7 - C19806.m45029("ۚۗ")) * 79;
                        i = ((iM11306 ^ i8) * (-1907)) ^ 1681822681;
                        i2 = -897493423;
                    } else {
                        iM11306 = (i8 - C19806.m45029("۠᩺")) * (-5);
                        i = ((iM11306 ^ i7) * 32539) ^ 1009742957;
                        i2 = -802123321;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 448263467:
                case 900138080:
                    return c22072.m49016(i5, z2);
                case 531981327:
                case 1127798383:
                    RunnableC1564.m5345();
                    return false;
                case 1375223024:
                case 2090011904:
                    return c22072.m49016(i5, z2);
                case 1792120248:
                case 1875242873:
                    c22072.f71519 = z2 ? 1 : 0;
                    height = layout.getHeight();
                    if (C1460.f5948 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i8;
                        i = ((iM11306 ^ i7) * 12057) ^ 794379060;
                        i2 = 463433775;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۗ") ^ i7;
                        i = ((iM11306 ^ i8) * (-23003)) ^ 1745157155;
                        i2 = 1300158330;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                default:
                    RunnableC1895.m6170();
                    iM11306 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                    i = ((iM11306 ^ i7) * 1195) ^ 1430949433;
                    i2 = -1990215671;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m49011() {
        View view = null;
        IBinder windowToken = null;
        boolean z = false;
        ViewTreeObserver viewTreeObserver = null;
        int i = -1056366413;
        int i2 = C1419.f5860;
        int i3 = C3577.f13150;
        int iM11306 = ThreadFactoryC3888.m11306("ۚܶ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-11515)) ^ (-116257794);
        int i5 = -952297174;
        while (true) {
            i = ((((i ^ i2) * 31939) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2015963813:
                case -61498357:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("۠ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14855) ^ (-1896010317);
                        i5 = 743564427;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶ۟")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-565)) ^ (-1127686693);
                        i5 = 494267244;
                    }
                    break;
                case -1994832109:
                case 1377203471:
                    this.f71504 = z;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2314(this, viewTreeObserver));
                    }
                    iM11306 = (ThreadFactoryC3888.m11306("ۗ۟") + i2) * q.h;
                    i4 = ((iM11306 ^ i3) * 5301) ^ (-1057556034);
                    i5 = -27806727;
                    break;
                case -1970974670:
                case -1507649351:
                    viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷᩶")) * 67;
                        i4 = ((iM11306 ^ i2) * 18757) ^ 1329669154;
                        i5 = -791887277;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9389)) ^ 1158733090;
                        i5 = -593971271;
                    }
                    break;
                case -1699832764:
                case -1400957778:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = C19806.m45029("ܶۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15021) ^ (-35566285);
                        i5 = 488337774;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26767) ^ 348525761;
                        i5 = -316143855;
                    }
                    break;
                case -1378873401:
                case 1946411808:
                    if (C1148.m4232() <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶ۟")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-565)) ^ (-1127686693);
                        i5 = 494267244;
                    } else {
                        iM11306 = (C19806.m45029("᩶ܺ") + i3) * (-57);
                        i4 = ((iM11306 ^ i2) * 2423) ^ 1045429747;
                        i5 = 2033124536;
                    }
                    break;
                case -1349427107:
                case 837274168:
                    if (this.f71501) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9389)) ^ 1158733090;
                        i5 = -593971271;
                    } else {
                        iM11306 = C19806.m45029("ۧۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27989) ^ 479323537;
                        i5 = -65003824;
                    }
                    break;
                case -1231258333:
                case -961554130:
                    C1025.m3861();
                    C1419.m4973();
                    iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶ۟")) * (-109);
                    i4 = ((iM11306 ^ i3) * (-565)) ^ (-1127686693);
                    i5 = 494267244;
                    break;
                case -916858585:
                case -21168231:
                    z = true;
                    if (windowToken == null) {
                        iM11306 = C19806.m45029("ۖ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18225) ^ 44387228;
                        i5 = -465097438;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30305) ^ (-1339648838);
                        i5 = 1938017595;
                    }
                    break;
                case -733589589:
                case 1035720591:
                    view = this.f71506;
                    windowToken = view.getWindowToken();
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ۟") + i2) * q.h;
                        i4 = ((iM11306 ^ i3) * 5301) ^ (-1057556034);
                        i5 = -27806727;
                    } else {
                        iM11306 = C19806.m45029("᩷ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17595) ^ (-1748240077);
                        i5 = -1138202683;
                    }
                    break;
                case -461044211:
                case 1168379619:
                    if (C1977.f7413 > 0) {
                        iM11306 = C19806.m45029("ܶۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15021) ^ (-35566285);
                        i5 = 488337774;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶ۟")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-565)) ^ (-1127686693);
                        i5 = 494267244;
                    }
                    break;
                case -460441285:
                case 1179982486:
                    break;
                case -407849794:
                case -288980725:
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12873)) ^ (-1773915889);
                        i5 = -656118396;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ۟") + i2) * q.h;
                        i4 = ((iM11306 ^ i3) * 5301) ^ (-1057556034);
                        i5 = -27806727;
                    }
                    break;
                case -358503530:
                case 652615366:
                    if (C3722.m10894() <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶ۟")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-565)) ^ (-1127686693);
                        i5 = 494267244;
                    } else {
                        iM11306 = C19806.m45029("᩻֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7151) ^ (-949071447);
                        i5 = 1946745301;
                    }
                    break;
                case -296318574:
                case 1576042725:
                    if (this.f71504) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9389)) ^ 1158733090;
                        i5 = -593971271;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25469)) ^ 1752540652;
                        i5 = -401021628;
                    }
                    break;
                case 140232834:
                case 1472582518:
                    if (C1377.f5749) {
                        iM11306 = (i3 - C19806.m45029("ܿۤ")) * (-63);
                        i4 = ((iM11306 ^ i2) * 13319) ^ (-215229562);
                        i5 = 1271575520;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶ۟")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-565)) ^ (-1127686693);
                        i5 = 494267244;
                    }
                    break;
                case 222779617:
                case 1563696244:
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("ܶۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15021) ^ (-35566285);
                        i5 = 488337774;
                    } else {
                        iM11306 = (C19806.m45029("֡ܽ") + i2) * 85;
                        i4 = ((iM11306 ^ i3) * (-23349)) ^ (-1091188693);
                        i5 = -1181044840;
                    }
                    break;
                case 270912543:
                case 948647368:
                    if (C1377.f5749) {
                        iM11306 = (C19806.m45029("ۜ᩶") ^ i3) * 69;
                        i4 = ((iM11306 ^ i2) * (-27871)) ^ 1260454224;
                        i5 = 348109674;
                    } else {
                        iM11306 = C19806.m45029("۠ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14855) ^ (-1896010317);
                        i5 = 743564427;
                    }
                    break;
                case 374078127:
                case 1266398276:
                    C1937.m6279();
                    break;
                case 696306533:
                case 1006728106:
                    this.f71501 = z;
                    if (AbstractC0464.f2088 > 0) {
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5137(this));
                    }
                    iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶ۟")) * (-109);
                    i4 = ((iM11306 ^ i3) * (-565)) ^ (-1127686693);
                    i5 = 494267244;
                    break;
                default:
                    C10634.m26820();
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16371)) ^ 89071131;
                        i5 = 824562903;
                    } else {
                        iM11306 = C19806.m45029("ܶۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15021) ^ (-35566285);
                        i5 = 488337774;
                    }
                    break;
            }
            return;
        }
    }
}
