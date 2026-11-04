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
import com.alipay.sdk.m.t0.b;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* JADX INFO: renamed from: l.ۡ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V3Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9590 {

    /* JADX INFO: renamed from: ᩷ۜ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f31035 = {8524, 11021, 9537, 13527, -363, 12170, -9098, -13542, -2843, 11610, 13377, -16329, -10764, 8748, 12297, 15571, -8344, 16208, -8254, -16013, 11287, -38, 13301, -2514, 9170, 12152, -8250, -10497, -11523, -16163, 10692, -1643, -12105, 14456, -8970, -16151, -12316, -5023, -13623, -14046, -278, -14004, -1157, -13717, -60, -11990, -12162, -12631, -13294, -1098, 15023, -1311, 4792, -2041, -2033, -2034};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f31036;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f31037;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final View f31038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f31039;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ImageView f31040;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextView f31041;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ScrollView f31042;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ScrollView f31043;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f31044;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f31045;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31046;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final TextView f31047;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextView f31048;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f31049;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f31050;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final TextView f31051;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f31052;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f31053;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f31054;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final View f31055;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TextView f31056;

    public C9590(AbstractActivityC17204 abstractActivityC17204) {
        int iM3169;
        int i;
        int i2;
        ScrollView scrollView;
        short[] sArr;
        short[] sArr2;
        short[] sArr3;
        short[] sArr4;
        short[] sArr5;
        int i3;
        int i4;
        int iM2761;
        int i5;
        int i6;
        int i7;
        int iM31610;
        int i8;
        int iM31611;
        int i9;
        int i10;
        int i11;
        short[] sArr6;
        int i12;
        int i13;
        final C9590 c9590 = this;
        int i14 = 1331423384;
        int i15 = C11235.f35427;
        int i16 = C2287.f7432;
        short s = f31035[0];
        int i17 = (s * s) + 116380944;
        int i18 = s + 10788;
        int i19 = (i17 + i17) - (i18 * i18) < 0 ? 23364 : 41667;
        int iM2762 = C0619.m2761("᩶ۨ") ^ i15;
        int i20 = ((iM2762 ^ i16) * 25735) ^ (-517296309);
        int i21 = iM2762 ^ (-765820426);
        View viewM11246 = null;
        TextView textView = null;
        View viewM11247 = null;
        TextView textView2 = null;
        ScrollView scrollView2 = null;
        TextView textView3 = null;
        String strM7980 = null;
        String strM7803 = null;
        String str = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int iM31612 = 0;
        int iM31613 = 0;
        int iM31614 = 0;
        int i22 = 0;
        int iM2763 = 0;
        int i23 = 0;
        int iM31615 = 0;
        int iM2764 = 0;
        int iM2765 = 0;
        int iM2766 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        View viewM11248 = null;
        TextView textView4 = null;
        TextView textView5 = null;
        TextView textView6 = null;
        View viewM9942 = null;
        int iM11481 = 0;
        TextView textView7 = null;
        View viewM9333 = null;
        ScrollView scrollView3 = null;
        TextView textView8 = null;
        int i27 = i20;
        TextView textView9 = null;
        short[] sArr11 = null;
        TextView textView10 = null;
        while (true) {
            i14 = i21 ^ (i27 & (((i14 ^ i16) * 521) >> 31));
            switch (i14) {
                case -2134500876:
                case -337946404:
                    scrollView2.setScrollBarSize(iM11481);
                    scrollView2.setOnTouchListener(new View.OnTouchListener() { // from class: l.֡᩵֫
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int i28 = -106976711;
                            int i29 = C2419.f7754;
                            int i30 = C0773.f2792;
                            int iM31616 = C0773.m3169("᩶᩶") ^ i29;
                            int i31 = ((iM31616 ^ i30) * 21937) ^ (-668739216);
                            int i32 = 1554693624;
                            while (true) {
                                i28 = ((((i28 ^ i30) * 441) >> 31) & i31) ^ (iM31616 ^ i32);
                                switch (i28) {
                                    case -2135605355:
                                    case -890429101:
                                        C0487.m2356();
                                        if (C1146.f4234 >= 0) {
                                            iM31616 = (C0773.m3169("۫۟") ^ i29) * (-23);
                                            i31 = ((iM31616 ^ i30) * 20569) ^ 459150022;
                                            i32 = 502280936;
                                        } else {
                                            iM31616 = (i30 - C0773.m3169("᩶ۡ")) * 77;
                                            i31 = ((iM31616 ^ i29) * (-26393)) ^ (-1742790471);
                                            i32 = -1540601794;
                                        }
                                        break;
                                    case -1942083279:
                                    case -723635534:
                                        if (C2354.f7599 >= 0) {
                                            iM31616 = C0619.m2761("ܰ᩻") ^ i29;
                                            i31 = ((iM31616 ^ i30) * 12593) ^ (-509532882);
                                            i32 = 146933588;
                                        } else {
                                            iM31616 = C0619.m2761("ۛۖ") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-23035)) ^ 1657143279;
                                            i32 = -948026124;
                                        }
                                        break;
                                    case -1628394923:
                                    case 166345787:
                                        this.f2501.m25062(motionEvent);
                                        break;
                                    case -1598268698:
                                    case 1591325231:
                                        AbstractC0116.m1243();
                                        C17202.m40372();
                                        iM31616 = (i30 - C0773.m3169("᩶ۡ")) * 77;
                                        i31 = ((iM31616 ^ i29) * (-26393)) ^ (-1742790471);
                                        i32 = -1540601794;
                                        break;
                                    case -1243551994:
                                    case 248882353:
                                        if (C1343.f4799 != 0) {
                                            iM31616 = (i30 - C0773.m3169("᩶ۡ")) * 77;
                                            i31 = ((iM31616 ^ i29) * (-26393)) ^ (-1742790471);
                                            i32 = -1540601794;
                                        } else {
                                            iM31616 = (C0773.m3169("᩺ܽ") + i29) * (-101);
                                            i31 = ((iM31616 ^ i30) * 4833) ^ (-1724991021);
                                            i32 = 204998436;
                                        }
                                        break;
                                    case -1201554296:
                                    case 1543026725:
                                        C0950.m3785();
                                        if (!RunnableC3646.f12471) {
                                            iM31616 = (C0773.m3169("۫۟") ^ i29) * (-23);
                                            i31 = ((iM31616 ^ i30) * 20569) ^ 459150022;
                                            i32 = 502280936;
                                        } else {
                                            iM31616 = C0619.m2761("ܰ᩻") ^ i29;
                                            i31 = ((iM31616 ^ i30) * 12593) ^ (-509532882);
                                            i32 = 146933588;
                                        }
                                        break;
                                    case -1097615133:
                                    case 1686000349:
                                        if (C0269.f1558 <= 0) {
                                            iM31616 = C0773.m3169("ܺܳ") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-2053)) ^ (-1920524263);
                                            i32 = 2036572068;
                                        } else {
                                            iM31616 = (C0619.m2761("᩹᩺") + i30) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i31 = ((iM31616 ^ i29) * 17179) ^ 1889193358;
                                            i32 = -1870459887;
                                        }
                                        break;
                                    case -1055863787:
                                    case -593676584:
                                        C1783.m6232();
                                        C0950.m3785();
                                        break;
                                    case -1054781834:
                                    case 29115306:
                                        if (C2419.f7754 >= 0) {
                                            iM31616 = C0773.m3169("ܺܳ") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-2053)) ^ (-1920524263);
                                            i32 = 2036572068;
                                        } else {
                                            iM31616 = (i29 - C0619.m2761("᩵۬")) * (-33);
                                            i31 = ((iM31616 ^ i30) * (-24441)) ^ (-2068535555);
                                            i32 = 669698374;
                                        }
                                        break;
                                    case -796996086:
                                    case 1326473835:
                                        if (RunnableC0334.m2063()) {
                                            iM31616 = C0619.m2761("ܰ᩻") ^ i29;
                                            i31 = ((iM31616 ^ i30) * 12593) ^ (-509532882);
                                            i32 = 146933588;
                                        } else {
                                            iM31616 = C0619.m2761("۟ۧ") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-12735)) ^ 1188228084;
                                            i32 = 1983451413;
                                        }
                                        break;
                                    case -315073040:
                                    case 1444385832:
                                        if (C2966.m9664()) {
                                            iM31616 = (C0619.m2761("ܽۨ") ^ i29) * 81;
                                            i31 = ((iM31616 ^ i30) * 109) ^ 1555007334;
                                            i32 = 1238176204;
                                        } else {
                                            iM31616 = (i30 - C0773.m3169("᩶ۡ")) * 77;
                                            i31 = ((iM31616 ^ i29) * (-26393)) ^ (-1742790471);
                                            i32 = -1540601794;
                                        }
                                        break;
                                    case -29719178:
                                    case 856327836:
                                        if (C3492.f12043 <= 0) {
                                            iM31616 = (C0773.m3169("۫۟") ^ i29) * (-23);
                                            i31 = ((iM31616 ^ i30) * 20569) ^ 459150022;
                                            i32 = 502280936;
                                        } else {
                                            iM31616 = (C0619.m2761("֨᩸") ^ i30) * (-87);
                                            i31 = ((iM31616 ^ i29) * (-29745)) ^ (-2056017827);
                                            i32 = 1510357961;
                                        }
                                        break;
                                    case 78099028:
                                    case 1568880171:
                                        if (RunnableC3646.f12471) {
                                            iM31616 = C0619.m2761("ܰ᩻") ^ i29;
                                            i31 = ((iM31616 ^ i30) * 12593) ^ (-509532882);
                                            i32 = 146933588;
                                        } else {
                                            iM31616 = C0619.m2761("ۖۤ") ^ i29;
                                            i31 = ((iM31616 ^ i30) * 4621) ^ (-338641181);
                                            i32 = 1984798258;
                                        }
                                        break;
                                    case 201130036:
                                    case 1224374611:
                                        C0619.m2763();
                                        if (C3998.f13671 != 0) {
                                            iM31616 = (C0619.m2761("ܿ۠") ^ i30) * 13;
                                            i31 = ((iM31616 ^ i29) * (-11477)) ^ 729994107;
                                            i32 = 1785702784;
                                        } else {
                                            iM31616 = (i30 - C0773.m3169("᩶ۡ")) * 77;
                                            i31 = ((iM31616 ^ i29) * (-26393)) ^ (-1742790471);
                                            i32 = -1540601794;
                                        }
                                        break;
                                    case 725741691:
                                    case 2060163742:
                                        if (C2966.m9664()) {
                                            iM31616 = (C0619.m2761("ۙۜ") ^ i30) * 9;
                                            i31 = ((iM31616 ^ i29) * (-8483)) ^ (-705351247);
                                            i32 = 171980254;
                                        } else {
                                            iM31616 = (C0619.m2761("ܿ۠") ^ i30) * 13;
                                            i31 = ((iM31616 ^ i29) * (-11477)) ^ 729994107;
                                            i32 = 1785702784;
                                        }
                                        break;
                                    default:
                                        if (C13473.f42873 != 0) {
                                            iM31616 = (i30 - C0773.m3169("᩶ۡ")) * 77;
                                            i31 = ((iM31616 ^ i29) * (-26393)) ^ (-1742790471);
                                            i32 = -1540601794;
                                        } else {
                                            iM31616 = (C0619.m2761("۟᩵") + i29) * 61;
                                            i31 = ((iM31616 ^ i30) * 11783) ^ (-1820870589);
                                            i32 = -2055311702;
                                        }
                                        break;
                                }
                                return false;
                            }
                        }
                    });
                    textView3.setOnTouchListener(new View.OnTouchListener() { // from class: l.۟᩵֫
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int i28 = 292265124;
                            int i29 = C2310.f7472;
                            int i30 = C0950.f3488;
                            int iM31616 = (i30 - C0773.m3169("ۘۜ")) * (-127);
                            int i31 = ((iM31616 ^ i29) * 2795) ^ (-546381792);
                            int i32 = 1276665833;
                            while (true) {
                                i28 = ((((i28 ^ i29) * (-12483)) >> 31) & i31) ^ (iM31616 ^ i32);
                                switch (i28) {
                                    case -2042963731:
                                    case -1992771802:
                                        if (C3779.f12953 <= 0) {
                                            iM31616 = C0773.m3169("᩸ۖ") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-19329)) ^ 69805888;
                                            i32 = 1011116218;
                                        } else {
                                            iM31616 = C0773.m3169("֨ܽ") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-11887)) ^ 1262251778;
                                            i32 = -1045698808;
                                        }
                                        break;
                                    case -1863976186:
                                    case -754280772:
                                        if (RunnableC3646.f12471) {
                                            iM31616 = C0773.m3169("ۙ۬") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-21715)) ^ (-2079730283);
                                            i32 = 247777490;
                                        } else {
                                            iM31616 = (i29 - C0773.m3169("ܿܺ")) * 27;
                                            i31 = ((iM31616 ^ i30) * 25019) ^ (-149862583);
                                            i32 = 286549671;
                                        }
                                        break;
                                    case -1657857678:
                                    case -396576222:
                                        this.f26761.m25062(motionEvent);
                                        break;
                                    case -1610440590:
                                    case -562097224:
                                        if (C1321.f4751 >= 0) {
                                            iM31616 = C0773.m3169("ۙ۬") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-21715)) ^ (-2079730283);
                                            i32 = 247777490;
                                        } else {
                                            iM31616 = C0619.m2761("᩷۠") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-26365)) ^ 1524595604;
                                            i32 = -1864107500;
                                        }
                                        break;
                                    case -1538521953:
                                    case 1982891964:
                                        if (C23916.f77426 <= 0) {
                                            iM31616 = C0773.m3169("᩸ۖ") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-19329)) ^ 69805888;
                                            i32 = 1011116218;
                                        } else {
                                            iM31616 = C0773.m3169("ۙ۬") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-21715)) ^ (-2079730283);
                                            i32 = 247777490;
                                        }
                                        break;
                                    case -1418934840:
                                    case -844740131:
                                        C1146.m4231();
                                        iM31616 = C0773.m3169("ۙ۬") ^ i29;
                                        i31 = ((iM31616 ^ i30) * (-21715)) ^ (-2079730283);
                                        i32 = 247777490;
                                        break;
                                    case -1404981926:
                                    case 1305835713:
                                        if (C3033.f9831 >= 0) {
                                            iM31616 = C0773.m3169("᩸ۖ") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-19329)) ^ 69805888;
                                            i32 = 1011116218;
                                        } else {
                                            iM31616 = (C0773.m3169("᩹ۙ") + i30) * (-113);
                                            i31 = ((iM31616 ^ i29) * (-8615)) ^ 1396877061;
                                            i32 = -1885217970;
                                        }
                                        break;
                                    case -1188406009:
                                    case 1458281565:
                                        C2023.m6964();
                                        if (C0950.f3488 < 0) {
                                            iM31616 = C0773.m3169("ۙ۬") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-21715)) ^ (-2079730283);
                                            i32 = 247777490;
                                        } else {
                                            iM31616 = (C0619.m2761("ۢ᩶") + i30) * (-95);
                                            i31 = ((iM31616 ^ i29) * (-12053)) ^ 295883664;
                                            i32 = -1874148932;
                                        }
                                        break;
                                    case -1085761638:
                                    case -873158566:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM31616 = C0773.m3169("ۙ۬") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-21715)) ^ (-2079730283);
                                            i32 = 247777490;
                                        } else {
                                            iM31616 = C0773.m3169("ۡᩴ") ^ i29;
                                            i31 = ((iM31616 ^ i30) * 6105) ^ (-2095145932);
                                            i32 = 547915077;
                                        }
                                        break;
                                    case -1036631120:
                                    case 1287076450:
                                        if (AbstractC3624.m11755() != 0) {
                                            iM31616 = (C0619.m2761("ۙ۟") + i29) * 91;
                                            i31 = ((iM31616 ^ i30) * (-18011)) ^ 799621783;
                                            i32 = -1656901086;
                                        } else {
                                            iM31616 = C0773.m3169("᩸ۖ") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-19329)) ^ 69805888;
                                            i32 = 1011116218;
                                        }
                                        break;
                                    case -901361865:
                                    case -354411139:
                                        if (C2485.f7950 != 0) {
                                            iM31616 = (C0619.m2761("ۙ۟") + i29) * 91;
                                            i31 = ((iM31616 ^ i30) * (-18011)) ^ 799621783;
                                            i32 = -1656901086;
                                        } else {
                                            iM31616 = (C0773.m3169("᩶۫") + i30) * (-73);
                                            i31 = ((iM31616 ^ i29) * 21531) ^ (-1104526301);
                                            i32 = 411641225;
                                        }
                                        break;
                                    case -654960456:
                                    case 1373884771:
                                        C0619.m2763();
                                        C3033.m9845();
                                        break;
                                    case -80777506:
                                    case 245527431:
                                        if (C0773.m3161() != 0) {
                                            iM31616 = C0773.m3169("ۢۢ") ^ i29;
                                            i31 = ((iM31616 ^ i30) * 17155) ^ (-773989555);
                                            i32 = -1702498949;
                                        } else {
                                            iM31616 = C0619.m2761("ۧۙ") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-7071)) ^ (-1844429033);
                                            i32 = 1047424425;
                                        }
                                        break;
                                    case 375422756:
                                    case 1188219396:
                                        if (C3734.f12817 >= 0) {
                                            iM31616 = C0773.m3169("ۙ۬") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-21715)) ^ (-2079730283);
                                            i32 = 247777490;
                                        } else {
                                            iM31616 = C0619.m2761("ܽ۫") ^ i30;
                                            i31 = ((iM31616 ^ i29) * (-17975)) ^ 750569753;
                                            i32 = 2110483487;
                                        }
                                        break;
                                    case 395926212:
                                    case 479628326:
                                        if (C2878.m9491() <= 0) {
                                            iM31616 = C0773.m3169("ۙ۬") ^ i29;
                                            i31 = ((iM31616 ^ i30) * (-21715)) ^ (-2079730283);
                                            i32 = 247777490;
                                        } else {
                                            iM31616 = (C0619.m2761("ܶ۬") ^ i30) * 101;
                                            i31 = ((iM31616 ^ i29) * (-18901)) ^ 1531391235;
                                            i32 = 2052866106;
                                        }
                                        break;
                                    default:
                                        if (C1826.m6301() >= 0) {
                                            iM31616 = (C0619.m2761("ۙ۟") + i29) * 91;
                                            i31 = ((iM31616 ^ i30) * (-18011)) ^ 799621783;
                                            i32 = -1656901086;
                                        } else {
                                            iM31616 = (i30 - C0619.m2761("ۢܽ")) * 67;
                                            i31 = ((iM31616 ^ i29) * (-20889)) ^ 1212760284;
                                            i32 = 13331445;
                                        }
                                        break;
                                }
                                return false;
                            }
                        }
                    });
                    View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: l.ᩳ᩵֫
                        /* JADX WARN: Code duplicated, block: B:43:0x010c  */
                        /* JADX WARN: Code duplicated, block: B:55:0x0189  */
                        /* JADX WARN: Code duplicated, block: B:59:0x01b7  */
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
                        
                            if (l.C3690.f12684 <= 0) goto L16;
                         */
                        @Override // android.view.View.OnLayoutChangeListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onLayoutChange(android.view.View r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
                            /*
                                Method dump skipped, instruction units count: 636
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.ViewOnLayoutChangeListenerC19287.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
                        }
                    };
                    scrollView3.addOnLayoutChangeListener(onLayoutChangeListener);
                    viewM11248.addOnLayoutChangeListener(onLayoutChangeListener);
                    return;
                case -2037925528:
                case -451599824:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr3 = sArr8;
                    sArr4 = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    sArr2 = sArr7;
                    iM31614 = C0773.m3169(C3492.m11486(sArr2, 7, 3, i19));
                    i22 = 2123519188;
                    if (C1564.f5401 > 0) {
                        int iM2767 = C0619.m2761("ۡܺ") ^ i16;
                        i27 = ((iM2767 ^ i15) * 4259) ^ (-1447693927);
                        i7 = iM2767 ^ (-506548457);
                        sArr7 = sArr2;
                        i26 = i4;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        sArr9 = sArr4;
                        sArr8 = sArr3;
                        i21 = i7;
                        sArr11 = sArr11;
                        i24 = i24;
                    } else {
                        sArr9 = sArr4;
                        sArr8 = sArr3;
                        int iM2768 = C0619.m2761("۠ۤ") ^ i15;
                        i27 = 707740583 ^ ((iM2768 ^ i16) * 12871);
                        i6 = iM2768 ^ (-957792983);
                        sArr7 = sArr2;
                        i26 = i4;
                        sArr11 = sArr11;
                        i24 = i24;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        i21 = i6;
                        c9590 = this;
                    }
                    break;
                case -1808559926:
                case -1756130377:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    textView7 = (TextView) C2834.m9333(viewM9942, iM2763 ^ i23);
                    c9590.f31054 = textView7;
                    sArr8 = f31035;
                    if (AbstractC0641.f2496 < 0) {
                        iM31611 = (C0773.m3169("۟ܺ") + i15) * (-71);
                        i27 = ((iM31611 ^ i16) * (-8787)) ^ (-904005779);
                        i9 = 1117743063;
                        i7 = iM31611 ^ i9;
                        i26 = i4;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        sArr9 = sArr;
                        i21 = i7;
                        sArr11 = sArr11;
                        i24 = i24;
                    } else {
                        sArr9 = sArr;
                        sArr2 = sArr7;
                        int iM2769 = C0619.m2761("۠ۤ") ^ i15;
                        i27 = 707740583 ^ ((iM2769 ^ i16) * 12871);
                        i6 = iM2769 ^ (-957792983);
                        sArr7 = sArr2;
                        i26 = i4;
                        sArr11 = sArr11;
                        i24 = i24;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        i21 = i6;
                        c9590 = this;
                    }
                    break;
                case -1680258438:
                case 2049523003:
                    C3779.m12264();
                    C2375.m8065();
                    iM3169 = C0619.m2761("᩺۠") ^ i15;
                    i = ((iM3169 ^ i16) * (-11533)) ^ 141808307;
                    i2 = 1828342579;
                    i21 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -1638253186:
                case -1524994585:
                    int i28 = i24;
                    short[] sArr12 = sArr11;
                    scrollView3 = (ScrollView) C3448.m11246(viewM9942, C0619.m2761(strM7980) ^ 2120629356);
                    c9590.f31043 = scrollView3;
                    sArr7 = f31035;
                    int iM27610 = (C0619.m2761("ܿᩴ") ^ i15) * (-27);
                    i27 = ((iM27610 ^ i16) * 14431) ^ (-527480308);
                    i21 = iM27610 ^ 1728168725;
                    i26 = i26;
                    sArr11 = sArr12;
                    i24 = i28;
                    sArr10 = sArr10;
                    i25 = i25;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    break;
                case -1636012515:
                case -556889573:
                    C4282.m13644();
                    if (C2288.f7433 <= 0) {
                        scrollView = scrollView3;
                        i24 = i24;
                        sArr2 = sArr7;
                        sArr5 = sArr10;
                        i3 = i25;
                        i4 = i26;
                        sArr11 = sArr11;
                        int iM27611 = C0619.m2761("۠ۤ") ^ i15;
                        i27 = 707740583 ^ ((iM27611 ^ i16) * 12871);
                        i6 = iM27611 ^ (-957792983);
                        sArr7 = sArr2;
                        i26 = i4;
                        sArr11 = sArr11;
                        i24 = i24;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        i21 = i6;
                        c9590 = this;
                    } else {
                        iM3169 = C0619.m2761("ۢ۫") ^ i16;
                        i = ((iM3169 ^ i15) * (-5547)) ^ (-768170779);
                        i2 = 466487354;
                        i21 = iM3169 ^ i2;
                        i27 = i;
                    }
                    break;
                case -1590340334:
                case 1641672039:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr3 = sArr8;
                    sArr4 = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    viewM11248 = C3448.m11246(viewM9942, iM31614 ^ i22);
                    c9590.f31039 = viewM11248;
                    strM7803 = C2310.m7803(f31035, 10, 3, i19);
                    iM31610 = C0773.m3169("ۘܽ") ^ i16;
                    i27 = ((iM31610 ^ i15) * (-4579)) ^ 1231424824;
                    i8 = -628849853;
                    i7 = iM31610 ^ i8;
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    sArr9 = sArr4;
                    sArr8 = sArr3;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -1403344233:
                case -170863047:
                    sArr11 = sArr11;
                    c9590.f31036 = C3448.m11246(viewM9942, iM2765 ^ 2121094666);
                    int iM27612 = C0619.m2761(C2966.m9670(f31035, 43, 3, i19)) ^ 2124321962;
                    if (C2419.f7754 >= 0) {
                        i24 = iM27612;
                        scrollView = scrollView3;
                        sArr2 = sArr7;
                        sArr5 = sArr10;
                        i3 = i25;
                        i4 = i26;
                        int iM27613 = C0619.m2761("۠ۤ") ^ i15;
                        i27 = 707740583 ^ ((iM27613 ^ i16) * 12871);
                        i6 = iM27613 ^ (-957792983);
                        sArr7 = sArr2;
                        i26 = i4;
                        sArr11 = sArr11;
                        i24 = i24;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        i21 = i6;
                        c9590 = this;
                    } else {
                        int iM31616 = C0773.m3169("۫֫") ^ i15;
                        i21 = iM31616 ^ (-1589543854);
                        i27 = ((iM31616 ^ i16) * 32247) ^ 824661556;
                        i24 = iM27612;
                        sArr11 = sArr11;
                    }
                    break;
                case -1349102511:
                case -188864742:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    textView8 = (TextView) viewM11247;
                    c9590.f31051 = textView8;
                    sArr = sArr9;
                    iM2764 = C0619.m2761(C20932.m47853(f31035, 31, 3, i19));
                    iM31611 = (C0773.m3169("ۛܽ") + i15) * 101;
                    i27 = ((iM31611 ^ i16) * (-31479)) ^ (-95422075);
                    i9 = -1667611398;
                    i7 = iM31611 ^ i9;
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    sArr9 = sArr;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -1340151821:
                case -125325385:
                    textView3 = (TextView) C2834.m9333(viewM9942, C0619.m2761(C1519.m5399(sArr11, 49, 3, i19)) ^ 2120784941);
                    c9590.f31052 = textView3;
                    ViewOnClickListenerC15284.m36686(textView7);
                    ViewOnClickListenerC15284.m36686(textView4);
                    if (C20932.f66974 > 0) {
                        iM3169 = (i15 - C0619.m2761("ۖ᩶")) * 65;
                        i = ((iM3169 ^ i16) * (-4593)) ^ (-1102361236);
                        i2 = -848172627;
                        i21 = iM3169 ^ i2;
                        i27 = i;
                    } else {
                        scrollView = scrollView3;
                        i24 = i24;
                        sArr = sArr9;
                        sArr11 = sArr11;
                        int iM31617 = C0773.m3169("ܶۘ") ^ i15;
                        i27 = ((iM31617 ^ i16) * (-16221)) ^ (-1949286518);
                        i7 = iM31617 ^ (-1253754456);
                        scrollView3 = scrollView;
                        sArr9 = sArr;
                        i21 = i7;
                        sArr11 = sArr11;
                        i24 = i24;
                    }
                    break;
                case -1326882552:
                case 1875289882:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    iM31615 = C0773.m3169(C1146.m4222(f31035, 22, 3, i19));
                    if (C11235.f35427 < 0) {
                        iM31611 = (i16 - C0773.m3169("ۜ᩹")) * 39;
                        i27 = ((iM31611 ^ i15) * (-27005)) ^ (-181216930);
                        i9 = 945616657;
                        i7 = iM31611 ^ i9;
                        i26 = i4;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        sArr9 = sArr;
                        i21 = i7;
                        sArr11 = sArr11;
                        i24 = i24;
                    }
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    int iM31618 = C0773.m3169("ܶۘ") ^ i15;
                    i27 = ((iM31618 ^ i16) * (-16221)) ^ (-1949286518);
                    i7 = iM31618 ^ (-1253754456);
                    scrollView3 = scrollView;
                    sArr9 = sArr;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -1285898901:
                case 26855552:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    short[] sArr13 = sArr8;
                    viewM11246 = C3448.m11246(viewM9942, C0619.m2761(C4282.m13650(sArr13, 16, 3, i19)) ^ 2128696381);
                    int iM31619 = C0773.m3169("᩶֨") ^ i16;
                    i27 = ((iM31619 ^ i15) * DilithiumEngine.DilithiumRootOfUnity) ^ (-1676709027);
                    i7 = iM31619 ^ (-70236250);
                    sArr8 = sArr13;
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    sArr9 = sArr;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -1267493111:
                case 600670419:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    textView = (TextView) C3448.m11246(viewM9942, C0773.m3169(str) ^ 2123228860);
                    c9590.f31041 = textView;
                    iM31611 = C0619.m2761("۫۬") ^ i15;
                    i27 = ((iM31611 ^ i16) * 11671) ^ (-1940883082);
                    i9 = -47953617;
                    i7 = iM31611 ^ i9;
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    sArr9 = sArr;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -1223898830:
                case -885211851:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr11 = sArr11;
                    TextView textView11 = (TextView) viewM9333;
                    c9590.f31049 = textView11;
                    sArr10 = f31035;
                    i25 = 37;
                    i26 = 3;
                    if (C2375.f7641 > 0) {
                        int iM31620 = C0773.m3169("ᩳܺ") ^ i16;
                        i10 = ((iM31620 ^ i15) * (-22789)) ^ (-136212298);
                        i11 = iM31620 ^ (-1872747042);
                        textView2 = textView11;
                        sArr11 = sArr11;
                        i24 = i24;
                        ScrollView scrollView4 = scrollView;
                        i21 = i11;
                        i27 = i10;
                        scrollView3 = scrollView4;
                    } else {
                        textView2 = textView11;
                        sArr = sArr9;
                        int iM316110 = C0773.m3169("ܶۘ") ^ i15;
                        i27 = ((iM316110 ^ i16) * (-16221)) ^ (-1949286518);
                        i7 = iM316110 ^ (-1253754456);
                        scrollView3 = scrollView;
                        sArr9 = sArr;
                        i21 = i7;
                        sArr11 = sArr11;
                        i24 = i24;
                    }
                    break;
                case -1154985243:
                case -341157797:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    textView10 = (TextView) C3448.m11246(viewM9942, iM31615 ^ 2099372976);
                    c9590.f31044 = textView10;
                    iM31613 = C0773.m3169(C3448.m11252(f31035, 25, 3, i19)) ^ 2099881897;
                    iM31611 = C0619.m2761("ᩳ۫") ^ i16;
                    i27 = ((iM31611 ^ i15) * 18421) ^ (-1988314077);
                    i9 = 1439583346;
                    i7 = iM31611 ^ i9;
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    sArr9 = sArr;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -707073885:
                case -693980727:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    textView9 = (TextView) C3448.m11246(viewM9942, iM31613);
                    c9590.f31047 = textView9;
                    viewM11247 = C3448.m11246(viewM9942, C0619.m2761(AbstractC0641.m2820(f31035, 28, 3, i19)) ^ 2126234082);
                    if (C3099.f10023 > 0) {
                        iM31611 = (C0619.m2761("۫ۗ") ^ i15) * (-109);
                        i27 = ((iM31611 ^ i16) * (-19303)) ^ 78820114;
                        i9 = -621360231;
                        i7 = iM31611 ^ i9;
                        i26 = i4;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        sArr9 = sArr;
                        i21 = i7;
                        sArr11 = sArr11;
                        i24 = i24;
                    }
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    int iM316111 = C0773.m3169("ܶۘ") ^ i15;
                    i27 = ((iM316111 ^ i16) * (-16221)) ^ (-1949286518);
                    i7 = iM316111 ^ (-1253754456);
                    scrollView3 = scrollView;
                    sArr9 = sArr;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -560434694:
                case 751673317:
                    sArr6 = sArr10;
                    i12 = i25;
                    i13 = i26;
                    short[] sArr14 = sArr9;
                    viewM9333 = C2834.m9333(viewM9942, C0773.m3169(C1826.m6310(sArr14, 34, 3, i19)) ^ 2129401552);
                    int iM31621 = C0773.m3169("֨ۡ") ^ i15;
                    i27 = ((iM31621 ^ i16) * (-29969)) ^ (-1006367141);
                    i7 = iM31621 ^ 636374111;
                    sArr9 = sArr14;
                    i26 = i13;
                    sArr10 = sArr6;
                    i25 = i12;
                    scrollView3 = scrollView3;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -485139843:
                case 1391593233:
                    scrollView2 = (ScrollView) C3448.m11246(viewM9942, iM2766 ^ 2125874787);
                    c9590.f31042 = scrollView2;
                    sArr11 = f31035;
                    iM3169 = (i15 - C0773.m3169("᩹᩸")) * (-13);
                    i = ((iM3169 ^ i16) * (-19329)) ^ 1413590014;
                    i2 = 984649404;
                    i21 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case -449369408:
                case 921873537:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr2 = sArr7;
                    sArr3 = sArr8;
                    sArr4 = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    viewM9942 = RunnableC3055.m9942(abstractActivityC17204, iM31612);
                    c9590.f31055 = viewM9942;
                    strM7980 = C2354.m7980(f31035, 4, 3, i19);
                    if (C2878.m9491() > 0) {
                        iM2761 = (i16 - C0773.m3169("ۖܳ")) * 43;
                        i27 = 1430856873 ^ ((iM2761 ^ i15) * (-12563));
                        i5 = 650694723;
                        i6 = iM2761 ^ i5;
                        sArr7 = sArr2;
                        i26 = i4;
                        sArr11 = sArr11;
                        i24 = i24;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        sArr9 = sArr4;
                        sArr8 = sArr3;
                        i21 = i6;
                        c9590 = this;
                    }
                    sArr9 = sArr4;
                    sArr8 = sArr3;
                    int iM27614 = C0619.m2761("۠ۤ") ^ i15;
                    i27 = 707740583 ^ ((iM27614 ^ i16) * 12871);
                    i6 = iM27614 ^ (-957792983);
                    sArr7 = sArr2;
                    i26 = i4;
                    sArr11 = sArr11;
                    i24 = i24;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    i21 = i6;
                    c9590 = this;
                    break;
                case -318014951:
                case 190502722:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr4 = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    sArr3 = sArr8;
                    iM2763 = C0619.m2761(C3690.m11996(f31035, 13, 3, i19));
                    i23 = 2130469175;
                    iM31610 = C0619.m2761("᩷ۜ") ^ i16;
                    i27 = ((iM31610 ^ i15) * 18147) ^ 1053926453;
                    i8 = 338113926;
                    i7 = iM31610 ^ i8;
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    sArr9 = sArr4;
                    sArr8 = sArr3;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -259276977:
                case 1519633967:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr3 = sArr8;
                    sArr4 = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    c9590.f31040 = (ImageView) C2834.m9333(viewM9942, C0619.m2761(strM7803) ^ 2102096467);
                    if (C1146.f4234 >= 0) {
                        iM31610 = (C0773.m3169("ۖ۬") + i16) * (-45);
                        i27 = ((iM31610 ^ i15) * (-17971)) ^ 586237571;
                        i8 = -439439664;
                    } else {
                        iM31610 = C0619.m2761("ܶᩳ") ^ i15;
                        i27 = ((iM31610 ^ i16) * 7751) ^ (-408644293);
                        i8 = -1715986965;
                    }
                    i7 = iM31610 ^ i8;
                    i26 = i4;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    sArr9 = sArr4;
                    sArr8 = sArr3;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case -211970478:
                case 1086032272:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr2 = sArr7;
                    sArr3 = sArr8;
                    sArr4 = sArr9;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    iM31612 = C0773.m3169(C2288.m7761(f31035, 1, 3, i19)) ^ 2098941376;
                    iM2761 = C0619.m2761("۠ܳ") ^ i15;
                    i27 = (-181069933) ^ ((iM2761 ^ i16) * (-241));
                    i5 = 2010498503;
                    i6 = iM2761 ^ i5;
                    sArr7 = sArr2;
                    i26 = i4;
                    sArr11 = sArr11;
                    i24 = i24;
                    sArr10 = sArr5;
                    i25 = i3;
                    scrollView3 = scrollView;
                    sArr9 = sArr4;
                    sArr8 = sArr3;
                    i21 = i6;
                    c9590 = this;
                    break;
                case -31767615:
                case 1184409395:
                    C1826.m6301();
                    C3734.m12152();
                    throw new RuntimeException();
                case 21738968:
                case 276070640:
                    int i29 = i25;
                    i13 = i26;
                    short[] sArr15 = sArr10;
                    sArr6 = sArr15;
                    TextView textView12 = (TextView) C3448.m11246(viewM9942, C0773.m3169(C1542.m5471(sArr15, i29, i13, i19)) ^ 2118005240);
                    c9590.f31056 = textView12;
                    textView6 = textView12;
                    i12 = i29;
                    iM2765 = C0619.m2761(C3099.m10092(f31035, 40, 3, i19));
                    int iM31622 = (C0773.m3169("᩺ۘ") + i16) * 11;
                    i27 = ((iM31622 ^ i15) * (-19753)) ^ 757254705;
                    i7 = iM31622 ^ 1962380308;
                    i26 = i13;
                    sArr10 = sArr6;
                    i25 = i12;
                    scrollView3 = scrollView3;
                    i21 = i7;
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case 321452553:
                case 665316510:
                    C4282.m13644();
                    if (!C2023.f6737) {
                        scrollView = scrollView3;
                        i24 = i24;
                        sArr2 = sArr7;
                        sArr5 = sArr10;
                        i3 = i25;
                        i4 = i26;
                        sArr11 = sArr11;
                        int iM27615 = C0619.m2761("۠ۤ") ^ i15;
                        i27 = 707740583 ^ ((iM27615 ^ i16) * 12871);
                        i6 = iM27615 ^ (-957792983);
                        sArr7 = sArr2;
                        i26 = i4;
                        sArr11 = sArr11;
                        i24 = i24;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        i21 = i6;
                        c9590 = this;
                    } else {
                        scrollView = scrollView3;
                        i24 = i24;
                        sArr3 = sArr8;
                        sArr4 = sArr9;
                        sArr5 = sArr10;
                        i3 = i25;
                        i4 = i26;
                        sArr11 = sArr11;
                        iM31610 = (C0773.m3169("ۖ۬") + i16) * (-45);
                        i27 = ((iM31610 ^ i15) * (-17971)) ^ 586237571;
                        i8 = -439439664;
                        i7 = iM31610 ^ i8;
                        i26 = i4;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        sArr9 = sArr4;
                        sArr8 = sArr3;
                        i21 = i7;
                        sArr11 = sArr11;
                        i24 = i24;
                    }
                    break;
                case 566119817:
                case 866358054:
                    int i30 = i24;
                    c9590.f31038 = C2834.m9333(viewM9942, i30);
                    sArr11 = sArr11;
                    i24 = i30;
                    iM2766 = C0619.m2761(C1564.m5510(f31035, 46, 3, i19));
                    int iM31623 = C0773.m3169("᩻ۜ") ^ i16;
                    i27 = ((iM31623 ^ i15) * (-28839)) ^ 249093456;
                    i21 = iM31623 ^ (-756636967);
                    sArr11 = sArr11;
                    i24 = i24;
                    break;
                case 1028370775:
                case 2076500061:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr11 = sArr11;
                    TextView textView13 = (TextView) viewM11246;
                    c9590.f31037 = textView13;
                    String strM11486 = C3492.m11486(f31035, 19, 3, i19);
                    int iM27616 = (C0619.m2761("۬ܰ") ^ i15) * (-75);
                    i10 = ((iM27616 ^ i16) * (-25099)) ^ (-187549065);
                    i11 = iM27616 ^ (-733373693);
                    i26 = i26;
                    textView4 = textView13;
                    sArr10 = sArr10;
                    i25 = i25;
                    sArr9 = sArr9;
                    str = strM11486;
                    sArr11 = sArr11;
                    i24 = i24;
                    ScrollView scrollView5 = scrollView;
                    i21 = i11;
                    i27 = i10;
                    scrollView3 = scrollView5;
                    break;
                case 1276199025:
                case 1410060921:
                    if (C2419.f7754 < 0) {
                        iM3169 = C0619.m2761("᩺۠") ^ i15;
                        i = ((iM3169 ^ i16) * (-11533)) ^ 141808307;
                        i2 = 1828342579;
                    } else {
                        iM3169 = C0619.m2761("ۢ۫") ^ i16;
                        i = ((iM3169 ^ i15) * (-5547)) ^ (-768170779);
                        i2 = 466487354;
                    }
                    i21 = iM3169 ^ i2;
                    i27 = i;
                    break;
                case 1863235412:
                case 2091832078:
                    scrollView = scrollView3;
                    i24 = i24;
                    sArr5 = sArr10;
                    i3 = i25;
                    i4 = i26;
                    sArr11 = sArr11;
                    TextView textView14 = (TextView) C2834.m9333(viewM9942, iM2764 ^ 2121226108);
                    c9590.f31048 = textView14;
                    sArr9 = f31035;
                    if (C2287.f7432 < 0) {
                        int iM31624 = C0773.m3169("᩺ۧ") ^ i16;
                        i10 = ((iM31624 ^ i15) * 4661) ^ (-1308626513);
                        i11 = iM31624 ^ 1586287710;
                        textView5 = textView14;
                        i26 = i4;
                        sArr11 = sArr11;
                        i24 = i24;
                        sArr10 = sArr5;
                        i25 = i3;
                        ScrollView scrollView6 = scrollView;
                        i21 = i11;
                        i27 = i10;
                        scrollView3 = scrollView6;
                    } else {
                        textView5 = textView14;
                        sArr2 = sArr7;
                        int iM27617 = C0619.m2761("۠ۤ") ^ i15;
                        i27 = 707740583 ^ ((iM27617 ^ i16) * 12871);
                        i6 = iM27617 ^ (-957792983);
                        sArr7 = sArr2;
                        i26 = i4;
                        sArr11 = sArr11;
                        i24 = i24;
                        sArr10 = sArr5;
                        i25 = i3;
                        scrollView3 = scrollView;
                        i21 = i6;
                        c9590 = this;
                    }
                    break;
                default:
                    ViewOnClickListenerC15284.m36686(textView);
                    ViewOnClickListenerC15284.m36686(textView10);
                    ViewOnClickListenerC15284.m36686(textView9);
                    ViewOnClickListenerC15284.m36686(textView8);
                    ViewOnClickListenerC15284.m36686(textView5);
                    ViewOnClickListenerC15284.m36686(textView2);
                    ViewOnClickListenerC15284.m36686(textView6);
                    scrollView2.setVerticalScrollBarEnabled(false);
                    scrollView2.setScrollbarFadingEnabled(false);
                    iM11481 = C3492.m11481(2.0f);
                    iM3169 = C0619.m2761("ܽۜ") ^ i16;
                    i = ((iM3169 ^ i15) * 21045) ^ 361139042;
                    i2 = 13721794;
                    i21 = iM3169 ^ i2;
                    i27 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25064(C9590 c9590, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = -1824054683;
        int i11 = C23916.f77426;
        int i12 = C1783.f6087;
        int iM2761 = C0619.m2761("ۘۜ") ^ i12;
        int i13 = ((iM2761 ^ i11) * (-27299)) ^ (-1406883756);
        int i14 = -765243860;
        while (true) {
            i10 = ((((i10 ^ i11) * (-7273)) >> 31) & i13) ^ (iM2761 ^ i14);
            switch (i10) {
                case -2145193046:
                case -621470407:
                    if (C23916.m53419() == 0) {
                        iM2761 = C0619.m2761("᩸֨") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-4333)) ^ 421893349;
                        i14 = -1289631899;
                    } else {
                        iM2761 = (C0619.m2761("ۙ֫") ^ i12) * 7;
                        i13 = ((iM2761 ^ i11) * 3925) ^ 1139951997;
                        i14 = -1988068793;
                    }
                    break;
                case -2140230039:
                case -265075411:
                    if (i3 == i7) {
                        iM2761 = C0773.m3169("ۚ۬") ^ i11;
                        i13 = ((iM2761 ^ i12) * (-24547)) ^ 670387237;
                        i14 = -923290907;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ܿܶ")) * (-61);
                        i13 = ((iM2761 ^ i12) * (-15961)) ^ 714782135;
                        i14 = 920978931;
                    }
                    break;
                case -2137277438:
                case 1134132698:
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("ۙܿ") + i11) * (-93);
                        i13 = ((iM2761 ^ i12) * (-27925)) ^ (-1749275265);
                        i14 = -194678191;
                    } else {
                        iM2761 = C0773.m3169("۬ۘ") ^ i11;
                        i13 = ((iM2761 ^ i12) * 29931) ^ 1711698282;
                        i14 = 708216424;
                    }
                    break;
                case -2056690453:
                case 1467001187:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۙܿ") + i11) * (-93);
                        i13 = ((iM2761 ^ i12) * (-27925)) ^ (-1749275265);
                        i14 = -194678191;
                    } else {
                        iM2761 = (C0619.m2761("ۘ۫") ^ i12) * (-43);
                        i13 = ((iM2761 ^ i11) * (-18291)) ^ (-1059025551);
                        i14 = 2033225301;
                    }
                    break;
                case -2009720684:
                case -823568754:
                    c9590.m25061();
                    break;
                case -1896830373:
                case -609410572:
                    C2310.m7813();
                    C0619.m2763();
                    break;
                case -1739064098:
                case -146062882:
                    i9 = AbstractC0641.f2496;
                    iM2761 = (C0619.m2761("᩻ۛ") + i11) * 75;
                    i13 = ((iM2761 ^ i12) * 8615) ^ (-2093239969);
                    i14 = -1551714664;
                    break;
                case -1620817549:
                case 113048049:
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0619.m2761("֡۬") + i11) * (-49);
                        i13 = ((iM2761 ^ i12) * 21305) ^ 452988962;
                        i14 = 1622105078;
                    } else {
                        iM2761 = (C0619.m2761("᩻֨") ^ i11) * 77;
                        i13 = ((iM2761 ^ i12) * 21507) ^ (-1530251671);
                        i14 = 386213879;
                    }
                    break;
                case -1569015064:
                case -319758790:
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("ܿܰ") + i11) * 37;
                        i13 = ((iM2761 ^ i12) * (-18313)) ^ (-358386705);
                        i14 = -1530004817;
                    } else {
                        iM2761 = C0773.m3169("᩻ۘ") ^ i12;
                        i13 = ((iM2761 ^ i11) * 27229) ^ 113831569;
                        i14 = -894636471;
                    }
                    break;
                case -1417300554:
                case -115960669:
                    if (C0773.m3161() == 0) {
                        iM2761 = (C0773.m3169("ܿܰ") + i11) * 37;
                        i13 = ((iM2761 ^ i12) * (-18313)) ^ (-358386705);
                        i14 = -1530004817;
                    } else {
                        iM2761 = (C0619.m2761("ۙ֫") ^ i12) * 7;
                        i13 = ((iM2761 ^ i11) * 3925) ^ 1139951997;
                        i14 = -1988068793;
                    }
                    break;
                case -684701242:
                case 1520807558:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0619.m2761("ۙܿ") + i11) * (-93);
                        i13 = ((iM2761 ^ i12) * (-27925)) ^ (-1749275265);
                        i14 = -194678191;
                    } else {
                        iM2761 = (C0773.m3169("ۧᩴ") ^ i12) * 67;
                        i13 = ((iM2761 ^ i11) * (-28041)) ^ 174806073;
                        i14 = -1325719198;
                    }
                    break;
                case -616623373:
                case 526313355:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ܿܰ") + i11) * 37;
                        i13 = ((iM2761 ^ i12) * (-18313)) ^ (-358386705);
                        i14 = -1530004817;
                    } else {
                        iM2761 = (C0773.m3169("ۜۧ") ^ i12) * (-105);
                        i13 = ((iM2761 ^ i11) * (-4021)) ^ 1136500909;
                        i14 = 252085192;
                    }
                    break;
                case -502708054:
                case 1035910441:
                    if (i9 >= 0) {
                        iM2761 = (C0619.m2761("֡۬") + i11) * (-49);
                        i13 = ((iM2761 ^ i12) * 21305) ^ 452988962;
                        i14 = 1622105078;
                    } else {
                        iM2761 = (C0773.m3169("۬֡") + i12) * 55;
                        i13 = ((iM2761 ^ i11) * (-9697)) ^ 353046965;
                        i14 = -605833744;
                    }
                    break;
                case -267026980:
                case 396921278:
                    if (i == i5) {
                        iM2761 = C0619.m2761("ۚۘ") ^ i11;
                        i13 = ((iM2761 ^ i12) * (-14547)) ^ 740083868;
                        i14 = 796207966;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ܿܶ")) * (-61);
                        i13 = ((iM2761 ^ i12) * (-15961)) ^ 714782135;
                        i14 = 920978931;
                    }
                    break;
                case -233555423:
                case 31503534:
                    if (i4 != i8) {
                        iM2761 = (i11 - C0619.m2761("ܿܶ")) * (-61);
                        i13 = ((iM2761 ^ i12) * (-15961)) ^ 714782135;
                        i14 = 920978931;
                    } else {
                        iM2761 = (C0619.m2761("ۖۨ") + i12) * (-59);
                        i13 = ((iM2761 ^ i11) * (-2543)) ^ 1390634122;
                        i14 = -1472185539;
                    }
                    break;
                case -47013428:
                case 1870631045:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("֡۬") + i11) * (-49);
                        i13 = ((iM2761 ^ i12) * 21305) ^ 452988962;
                        i14 = 1622105078;
                    } else {
                        iM2761 = C0619.m2761("᩸֨") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-4333)) ^ 421893349;
                        i14 = -1289631899;
                    }
                    break;
                case -45169428:
                case 362193910:
                    if (i2 == i6) {
                        iM2761 = (i12 - C0619.m2761("᩶ۨ")) * (-95);
                        i13 = ((iM2761 ^ i11) * 24143) ^ 1913433482;
                        i14 = -137295059;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ܿܶ")) * (-61);
                        i13 = ((iM2761 ^ i12) * (-15961)) ^ 714782135;
                        i14 = 920978931;
                    }
                    break;
                case 282396818:
                case 473035260:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("᩸֨") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-4333)) ^ 421893349;
                        i14 = -1289631899;
                    } else {
                        iM2761 = C0773.m3169("ۙۖ") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-3753)) ^ (-59139165);
                        i14 = 1858408618;
                    }
                    break;
                case 619815489:
                case 1806661529:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0619.m2761("ۙ֫") ^ i12) * 7;
                        i13 = ((iM2761 ^ i11) * 3925) ^ 1139951997;
                        i14 = -1988068793;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩻") ^ i11;
                        i13 = ((iM2761 ^ i12) * 5327) ^ (-933479516);
                        i14 = -1081424119;
                    }
                    break;
                case 694666701:
                case 714188493:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ܿܰ") + i11) * 37;
                        i13 = ((iM2761 ^ i12) * (-18313)) ^ (-358386705);
                        i14 = -1530004817;
                    } else {
                        iM2761 = C0619.m2761("ۙ᩺") ^ i11;
                        i13 = ((iM2761 ^ i12) * 25645) ^ (-1452629235);
                        i14 = 1615205329;
                    }
                    break;
                case 1308171989:
                case 1400539137:
                    break;
                default:
                    C1146.m4231();
                    C1826.m6301();
                    iM2761 = (C0619.m2761("ۙ֫") ^ i12) * 7;
                    i13 = ((iM2761 ^ i11) * 3925) ^ 1139951997;
                    i14 = -1988068793;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (l.C1343.f4799 != 0) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m25071(l.C18300 r27, long r28, l.C18300 r30) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9590.m25071(l.ܿۨ֫, long, l.ܿۨ֫):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m25061() {
        View view = null;
        IBinder windowToken = null;
        boolean z = false;
        ViewTreeObserver viewTreeObserver = null;
        int i = -1649022710;
        int i2 = C1519.f5300;
        int i3 = C3033.f9831;
        int iM2761 = C0619.m2761("ۗۛ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 24425) ^ 1338181652;
        int i5 = 919206487;
        while (true) {
            i = ((((i ^ i3) * 24457) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2096976803:
                case -2597768:
                    this.f31050 = z;
                    if (C1080.f3865 < 0) {
                        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC10336(this, viewTreeObserver));
                    }
                    iM2761 = (C0619.m2761("ۜܳ") + i2) * (-23);
                    i4 = ((iM2761 ^ i3) * 1641) ^ 861271958;
                    i5 = -1476431024;
                    break;
                case -1981154025:
                case 316064352:
                    z = true;
                    if (windowToken == null) {
                        iM2761 = (C0773.m3169("᩻᩵") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-799)) ^ (-1919527459);
                        i5 = 682027389;
                    } else {
                        iM2761 = (C0773.m3169("ۚܳ") ^ i3) * (-95);
                        i4 = ((iM2761 ^ i2) * (-7999)) ^ (-835748375);
                        i5 = -498816123;
                    }
                    break;
                case -1880769268:
                case 1891742874:
                    C3492.m11488();
                    C2878.m9491();
                    iM2761 = C0773.m3169("ܶۖ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 18261) ^ (-1882930733);
                    i5 = 172083985;
                    break;
                case -1848994111:
                case -373837684:
                    if (this.f31050) {
                        iM2761 = (i2 - C0773.m3169("۫ۢ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i3) * 8173) ^ 1771111899;
                        i5 = 1788006643;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺ۛ")) * 63;
                        i4 = ((iM2761 ^ i2) * (-27115)) ^ 1061803545;
                        i5 = -742584208;
                    }
                    break;
                case -1794906102:
                case -218881130:
                    this.f31053 = z;
                    if (C0950.f3488 < 0) {
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1388(this));
                    }
                    iM2761 = (C0619.m2761("ۜܳ") + i2) * (-23);
                    i4 = ((iM2761 ^ i3) * 1641) ^ 861271958;
                    i5 = -1476431024;
                    break;
                case -1603066129:
                case 1252936842:
                    RunnableC3055.m9933();
                    if (!C2288.m7767()) {
                        iM2761 = (C0773.m3169("ܺܳ") + i2) * (-73);
                        i4 = ((iM2761 ^ i3) * (-9725)) ^ 953669040;
                        i5 = 879188562;
                    } else {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25429) ^ 786795968;
                        i5 = -1414840999;
                    }
                    break;
                case -1482850494:
                case 299818868:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۜܳ") + i2) * (-23);
                        i4 = ((iM2761 ^ i3) * 1641) ^ 861271958;
                        i5 = -1476431024;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۘ᩶")) * 45;
                        i4 = ((iM2761 ^ i2) * 13355) ^ (-118044820);
                        i5 = -1660328543;
                    }
                    break;
                case -1363138246:
                case 52106763:
                    break;
                case -1266600259:
                case -681438416:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("ۜܳ") + i2) * (-23);
                        i4 = ((iM2761 ^ i3) * 1641) ^ 861271958;
                        i5 = -1476431024;
                    } else {
                        iM2761 = C0773.m3169("۟ۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13043)) ^ 1645481379;
                        i5 = -1878803406;
                    }
                    break;
                case -948149177:
                case 1960220356:
                    C2375.m8065();
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("ܺܳ") + i2) * (-73);
                        i4 = ((iM2761 ^ i3) * (-9725)) ^ 953669040;
                        i5 = 879188562;
                    } else {
                        iM2761 = C0773.m3169("ܶۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18261) ^ (-1882930733);
                        i5 = 172083985;
                    }
                    break;
                case -755396276:
                case 1282554198:
                    C0269.m1775();
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0773.m3169("ۨ᩶") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * 24315) ^ (-970297668);
                        i5 = 579161998;
                    } else {
                        iM2761 = C0773.m3169("ܶۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18261) ^ (-1882930733);
                        i5 = 172083985;
                    }
                    break;
                case -706999737:
                case 721084150:
                    view = this.f31055;
                    windowToken = view.getWindowToken();
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0773.m3169("ۨ᩶") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * 24315) ^ (-970297668);
                        i5 = 579161998;
                    } else {
                        iM2761 = (C0773.m3169("ۤ۟") ^ i2) * (-43);
                        i4 = ((iM2761 ^ i3) * (-24891)) ^ (-2140840213);
                        i5 = 972959162;
                    }
                    break;
                case -442691877:
                case 1105506897:
                    C3779.m12264();
                    C2878.m9491();
                    break;
                case 12355606:
                case 2145338435:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25429) ^ 786795968;
                        i5 = -1414840999;
                    } else {
                        iM2761 = C0773.m3169("ۨ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11771)) ^ (-577050257);
                        i5 = -2087238589;
                    }
                    break;
                case 220259209:
                case 939326966:
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0773.m3169("ܶۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18261) ^ (-1882930733);
                        i5 = 172083985;
                    } else {
                        iM2761 = C0619.m2761("ۨۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14733)) ^ (-1107605269);
                        i5 = 2028155783;
                    }
                    break;
                case 515591830:
                case 1164436819:
                    viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        iM2761 = C0773.m3169("᩶ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27275) ^ 915777300;
                        i5 = 1826469073;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۫ۢ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i3) * 8173) ^ 1771111899;
                        i5 = 1788006643;
                    }
                    break;
                case 1109231999:
                case 1791254829:
                    if (this.f31053) {
                        iM2761 = (i2 - C0773.m3169("۫ۢ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i3) * 8173) ^ 1771111899;
                        i5 = 1788006643;
                    } else {
                        iM2761 = (C0619.m2761("ۗۗ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * 25253) ^ (-573639235);
                        i5 = 1346715889;
                    }
                    break;
                case 1248816670:
                case 1558783219:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25429) ^ 786795968;
                        i5 = -1414840999;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۨ") ^ i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 26703) ^ (-264522749);
                        i5 = -1669149306;
                    }
                    break;
                case 1278680366:
                case 1284002163:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25429) ^ 786795968;
                        i5 = -1414840999;
                    } else {
                        iM2761 = (C0773.m3169("᩻ۜ") ^ i3) * (-13);
                        i4 = ((iM2761 ^ i2) * (-1609)) ^ 1277538289;
                        i5 = 1965147210;
                    }
                    break;
                default:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ܺܳ") + i2) * (-73);
                        i4 = ((iM2761 ^ i3) * (-9725)) ^ 953669040;
                        i5 = 879188562;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۠֡")) * 11;
                        i4 = ((iM2761 ^ i3) * 17771) ^ (-1390613697);
                        i5 = -1757007901;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m25062(MotionEvent motionEvent) {
        int actionMasked = 0;
        ScrollView scrollView = null;
        boolean z = false;
        int i = 454792674;
        int i2 = C3690.f12684;
        int i3 = C1321.f4751;
        int iM3169 = C0773.m3169("ۚ۠") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-17915)) ^ 545498313;
        int i5 = -766554133;
        while (true) {
            i = ((((i ^ i2) * (-32513)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2115960140:
                case 106836992:
                    if (this.f31045) {
                        iM3169 = (C0773.m3169("ܿۨ") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * b.d) ^ 22125999;
                        i5 = 721342053;
                    } else {
                        iM3169 = (C0773.m3169("ۨ۠") + i2) * 57;
                        i4 = ((iM3169 ^ i3) * 1997) ^ 729467534;
                        i5 = -1326741743;
                    }
                    break;
                case -2062498410:
                case -1671749249:
                    RunnableC3055.m9933();
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22357)) ^ 1095862142;
                        i5 = 1069418003;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24279) ^ 1819925379;
                        i5 = 586742732;
                    }
                    break;
                case -2039606302:
                case -988235373:
                    scrollView.requestDisallowInterceptTouchEvent(false);
                    break;
                case -1864796748:
                case -53710925:
                    if (C0773.m3161() != 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22357)) ^ 1095862142;
                        i5 = 1069418003;
                    } else {
                        iM3169 = C0619.m2761("ܳۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16381)) ^ 857241611;
                        i5 = -1063509486;
                    }
                    break;
                case -1801505092:
                case -601351864:
                    if (actionMasked != 2) {
                        iM3169 = (C0773.m3169("ۙۜ") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * (-30091)) ^ (-1098562230);
                        i5 = 509996435;
                    } else {
                        iM3169 = (C0619.m2761("ۜ֡") + i2) * (-109);
                        i4 = ((iM3169 ^ i3) * (-20787)) ^ 215742234;
                        i5 = 1065283104;
                    }
                    break;
                case -1725552538:
                case 971265055:
                    C2023.m6964();
                    if (C0269.m1775() > 0) {
                        iM3169 = (i2 - C0773.m3169("ۜ۟")) * q.h;
                        i4 = ((iM3169 ^ i3) * (-10013)) ^ (-1727309670);
                        i5 = 1266335835;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24279) ^ 1819925379;
                        i5 = 586742732;
                    }
                    break;
                case -1572317753:
                case -19699432:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i2 - C0773.m3169("ۜ۟")) * q.h;
                        i4 = ((iM3169 ^ i3) * (-10013)) ^ (-1727309670);
                        i5 = 1266335835;
                    } else {
                        iM3169 = C0773.m3169("᩵᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29081)) ^ (-1343891990);
                        i5 = 2143329124;
                    }
                    break;
                case -1423503807:
                case 1375659650:
                    actionMasked = motionEvent.getActionMasked();
                    scrollView = this.f31043;
                    z = true;
                    if (actionMasked != 0) {
                        iM3169 = C0619.m2761("᩷᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19323)) ^ 206056712;
                        i5 = -1701803589;
                    } else {
                        iM3169 = (C0619.m2761("ۜ֡") + i2) * (-109);
                        i4 = ((iM3169 ^ i3) * (-20787)) ^ 215742234;
                        i5 = 1065283104;
                    }
                    break;
                case -1278137564:
                case -1136110411:
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("۬᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22357)) ^ 1095862142;
                        i5 = 1069418003;
                    } else {
                        iM3169 = C0619.m2761("᩻ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6149) ^ 596356764;
                        i5 = -181446934;
                    }
                    break;
                case -1263450487:
                case 998341824:
                    break;
                case -1182922734:
                case 1404351925:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22357)) ^ 1095862142;
                        i5 = 1069418003;
                    } else {
                        iM3169 = (C0773.m3169("ۗ᩷") + i3) * 37;
                        i4 = ((iM3169 ^ i2) * (-24919)) ^ 166340574;
                        i5 = 649989042;
                    }
                    break;
                case -244055090:
                case 1960266710:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ܿᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6587)) ^ 904213551;
                        i5 = -1142718493;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֨ۡ")) * 5;
                        i4 = ((iM3169 ^ i2) * 12503) ^ 1511399577;
                        i5 = -491742323;
                    }
                    break;
                case -148800334:
                case 1570266718:
                    AbstractC0116.m1243();
                    AbstractC3624.m11755();
                    iM3169 = C0773.m3169("ܶ᩹") ^ i2;
                    i4 = ((iM3169 ^ i3) * 24279) ^ 1819925379;
                    i5 = 586742732;
                    break;
                case -39373847:
                case 2071317569:
                    if (actionMasked == 3) {
                        iM3169 = (C0773.m3169("ۢܶ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * (-25201)) ^ (-1295325568);
                        i5 = 1633935846;
                    } else {
                        iM3169 = (C0773.m3169("ۨ۠") + i2) * 57;
                        i4 = ((iM3169 ^ i3) * 1997) ^ 729467534;
                        i5 = -1326741743;
                    }
                    break;
                case -26245763:
                case 642422090:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("᩶ۨ") + i3) * 25;
                        i4 = ((iM3169 ^ i2) * 15031) ^ 1172870250;
                        i5 = 1888480786;
                    } else {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22275)) ^ (-1576802933);
                        i5 = -868709137;
                    }
                    break;
                case 8616708:
                case 470499503:
                    C1146.m4231();
                    C1343.m4943();
                    break;
                case 539573071:
                case 1007360032:
                    if (actionMasked != z) {
                        iM3169 = C0619.m2761("ܺ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27119) ^ 282628776;
                        i5 = 2058370124;
                    } else {
                        iM3169 = (C0773.m3169("ۢܶ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * (-25201)) ^ (-1295325568);
                        i5 = 1633935846;
                    }
                    break;
                case 555722388:
                case 847564533:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("᩶ۨ") + i3) * 25;
                        i4 = ((iM3169 ^ i2) * 15031) ^ 1172870250;
                        i5 = 1888480786;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۖ᩷")) * (-47);
                        i4 = ((iM3169 ^ i3) * 6811) ^ 1678809192;
                        i5 = -261897829;
                    }
                    break;
                case 900822263:
                case 1404956302:
                    if (C23916.f77426 > 0) {
                        iM3169 = C0773.m3169("ܿᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6587)) ^ 904213551;
                        i5 = -1142718493;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24279) ^ 1819925379;
                        i5 = 586742732;
                    }
                    break;
                case 1093702818:
                case 1273140035:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ۜ۟")) * q.h;
                        i4 = ((iM3169 ^ i3) * (-10013)) ^ (-1727309670);
                        i5 = 1266335835;
                    } else {
                        iM3169 = (C0773.m3169("۠ۚ") ^ i3) * (-27);
                        i4 = ((iM3169 ^ i2) * 2903) ^ 121226164;
                        i5 = -1858344490;
                    }
                    break;
                case 1292617120:
                case 1913435379:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("۟ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13079) ^ 521377477;
                        i5 = -2101621246;
                    } else {
                        iM3169 = C0619.m2761("۬᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22357)) ^ 1095862142;
                        i5 = 1069418003;
                    }
                    break;
                case 1789094074:
                case 1845592144:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("᩶ۨ") + i3) * 25;
                        i4 = ((iM3169 ^ i2) * 15031) ^ 1172870250;
                        i5 = 1888480786;
                    } else {
                        iM3169 = (C0619.m2761("ۚۨ") ^ i2) * (-29);
                        i4 = ((iM3169 ^ i3) * 8653) ^ (-239044370);
                        i5 = -1821618838;
                    }
                    break;
                default:
                    scrollView.requestDisallowInterceptTouchEvent(z);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0199 A[PHI: r11 r13 r16 r17
      0x0199: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:50:0x0197, B:41:0x0140, B:32:0x00e0, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0199: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:50:0x0197, B:41:0x0140, B:32:0x00e0, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0199: PHI (r16v3 int) = (r16v1 int), (r16v1 int), (r16v2 int), (r16v1 int) binds: [B:50:0x0197, B:41:0x0140, B:32:0x00e0, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0199: PHI (r17v3 int) = (r17v1 int), (r17v1 int), (r17v2 int), (r17v1 int) binds: [B:50:0x0197, B:41:0x0140, B:32:0x00e0, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ef A[PHI: r7 r9
      0x01ef: PHI (r7v6 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:58:0x01ed, B:28:0x00ba, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r9v5 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:58:0x01ed, B:28:0x00ba, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x02dd A[PHI: r4 r5 r6
      0x02dd: PHI (r4v3 android.text.Layout) = (r4v2 android.text.Layout), (r4v1 android.text.Layout), (r4v1 android.text.Layout) binds: [B:81:0x02c5, B:74:0x026e, B:66:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r5v3 boolean) = (r5v2 boolean), (r5v1 boolean), (r5v1 boolean) binds: [B:81:0x02c5, B:74:0x026e, B:66:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r6v3 boolean) = (r6v2 boolean), (r6v1 boolean), (r6v1 boolean) binds: [B:81:0x02c5, B:74:0x026e, B:66:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x02fc A[PHI: r3
      0x02fc: PHI (r3v3 android.widget.TextView) = 
      (r3v2 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
      (r3v1 android.widget.TextView)
     binds: [B:85:0x02fa, B:14:0x005e, B:12:0x005a, B:9:0x0054, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0330 A[PHI: r2 r10 r24
      0x0330: PHI (r2v3 android.widget.ScrollView) = (r2v2 android.widget.ScrollView), (r2v1 android.widget.ScrollView), (r2v1 android.widget.ScrollView) binds: [B:89:0x032e, B:62:0x0225, B:54:0x01cb] A[DONT_GENERATE, DONT_INLINE]
      0x0330: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:89:0x032e, B:62:0x0225, B:54:0x01cb] A[DONT_GENERATE, DONT_INLINE]
      0x0330: PHI (r24v5 int) = (r24v3 int), (r24v4 int), (r24v3 int) binds: [B:89:0x032e, B:62:0x0225, B:54:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m25070(C9590 c9590) {
        int iM3169;
        int i;
        int i2;
        C9590 c9591 = c9590;
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
        int iM9482 = 0;
        int iM5514 = 0;
        int i6 = -454385758;
        int i7 = C2354.f7599;
        int i8 = C2287.f7432;
        int iM31610 = C0773.m3169("ۙܰ") ^ i8;
        int i9 = ((iM31610 ^ i7) * 19327) ^ (-2071159116);
        int i10 = iM31610 ^ 342986448;
        int i11 = 0;
        int i12 = 0;
        View view = null;
        int height = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * 30493) >> 31));
            switch (i6) {
                case -2138025195:
                case -619041812:
                    i3 = totalPaddingTop + height;
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("ۡᩳ") ^ i7) * (-41);
                        i = ((iM3169 ^ i8) * 26803) ^ 1843437021;
                        i2 = -1424913833;
                    } else {
                        iM3169 = (i8 - C0619.m2761("۠ۗ")) * (-77);
                        i = ((iM3169 ^ i7) * 13731) ^ 336242156;
                        i2 = 1792302906;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1995241066:
                case 1703586666:
                    if (C2702.m8883(z2 ? 1 : 0, i11) + totalPaddingBottom2 > C1564.m5514(scrollView)) {
                        iM3169 = C0773.m3169("ܿܶ") ^ i8;
                        i = ((iM3169 ^ i7) * 25461) ^ (-1695591959);
                        i2 = 2093293144;
                    } else {
                        iM3169 = C0619.m2761("᩻᩵") ^ i7;
                        i = ((iM3169 ^ i8) * 15401) ^ (-225248951);
                        i2 = 754455760;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1988538566:
                case -1615358871:
                    if (C1564.m5514(view) == 0) {
                        iM3169 = (C0773.m3169("۫ۙ") ^ i8) * (-53);
                        i = ((iM3169 ^ i7) * (-10997)) ^ (-918350506);
                        i2 = -1090540395;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩸") ^ i7;
                        i = ((iM3169 ^ i8) * (-12073)) ^ (-1969248487);
                        i2 = 480284591;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1933541478:
                case 1778224359:
                    c9591.f31046 = z2 ? 1 : 0;
                    height = layout.getHeight();
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("ۡᩳ") ^ i7) * (-41);
                        i = ((iM3169 ^ i8) * 26803) ^ 1843437021;
                        i2 = -1424913833;
                    } else {
                        iM3169 = (C0773.m3169("ܰ֫") ^ i8) * 21;
                        i = ((iM3169 ^ i7) * (-209)) ^ 455616734;
                        i2 = 1946289950;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1916028675:
                case -1321421238:
                    if (C2878.m9482(scrollView) != 0) {
                        iM3169 = C0619.m2761("ۢۛ") ^ i8;
                        i = ((iM3169 ^ i7) * 25943) ^ (-1079113677);
                        i2 = 530634329;
                    } else {
                        iM3169 = (C0773.m3169("۫ۙ") ^ i8) * (-53);
                        i = ((iM3169 ^ i7) * (-10997)) ^ (-918350506);
                        i2 = -1090540395;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1805202514:
                case 240300296:
                    View view2 = c9591.f31039;
                    if (C17202.m40372()) {
                        int iM2761 = C0619.m2761("ᩳܶ") ^ i7;
                        i10 = iM2761 ^ 1378553919;
                        view = view2;
                        i9 = ((iM2761 ^ i8) * 13417) ^ 21989722;
                        c9591 = c9590;
                    } else {
                        view = view2;
                        iM3169 = C0773.m3169("ۖܰ") ^ i8;
                        i = ((iM3169 ^ i7) * (-17333)) ^ (-2031646135);
                        i2 = -389625204;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1426290184:
                case -1371254240:
                    i11 = iM9482 - iM5514;
                    if (C1519.m5403()) {
                        iM3169 = C0619.m2761("᩸ۧ") ^ i8;
                        i = ((iM3169 ^ i7) * 11385) ^ 947497658;
                        i2 = 151497968;
                    } else {
                        iM3169 = C0619.m2761("ۘܽ") ^ i7;
                        i = ((iM3169 ^ i8) * 15641) ^ 1207145321;
                        i2 = -344244711;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1390921397:
                case 1277496709:
                    iM9482 = C2878.m9482(view);
                    iM5514 = C1564.m5514(c9591.f31042);
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i7 - C0619.m2761("۬ۖ")) * (-13);
                        i = ((iM3169 ^ i8) * 31779) ^ (-566400542);
                        i2 = 1054706679;
                    } else {
                        iM3169 = C0619.m2761("۬ۜ") ^ i8;
                        i = ((iM3169 ^ i7) * (-18279)) ^ 1317201561;
                        i2 = 777195865;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1338380754:
                case -635468882:
                    totalPaddingBottom2 = textView.getTotalPaddingBottom() + totalPaddingTop2;
                    iM3169 = C0619.m2761("ܺۨ") ^ i7;
                    i = ((iM3169 ^ i8) * (-4789)) ^ 328528500;
                    i2 = 2116565176;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1320716447:
                case 1265282777:
                    C2354.m7983();
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("᩵֫") ^ i8;
                        i = ((iM3169 ^ i7) * 5587) ^ 2011807584;
                        i2 = -1806702951;
                    } else {
                        iM3169 = C0773.m3169("ۖܰ") ^ i8;
                        i = ((iM3169 ^ i7) * (-17333)) ^ (-2031646135);
                        i2 = -389625204;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1309209700:
                case -1035459956:
                    scrollView = c9591.f31043;
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("᩹۫") ^ i8;
                        i = ((iM3169 ^ i7) * (-32657)) ^ (-61940987);
                        i2 = 1814458748;
                    } else {
                        iM3169 = (C0619.m2761("ۡᩳ") ^ i7) * (-41);
                        i = ((iM3169 ^ i8) * 26803) ^ 1843437021;
                        i2 = -1424913833;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1130671590:
                case 1267581032:
                    return c9591.m25066(totalPaddingBottom2, z);
                case -976175400:
                case -567559951:
                    int i13 = c9591.f31046;
                    if (i13 < 4) {
                        int iM2762 = C0619.m2761("۬ۤ") ^ i7;
                        i12 = i13;
                        i9 = ((iM2762 ^ i8) * (-28203)) ^ 1791346175;
                        i10 = iM2762 ^ (-978034209);
                    } else {
                        i12 = i13;
                        iM3169 = (C0773.m3169("ܿ᩸") + i8) * (-47);
                        i = ((iM3169 ^ i7) * 23327) ^ 1931430444;
                        i2 = 504780031;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    }
                    break;
                case -958869763:
                case 1440003383:
                    c9591.f31046 = i12 + (z ? 1 : 0);
                    c9590.m25061();
                    return z2;
                case -862544969:
                case 1758564255:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("᩵֫") ^ i8;
                        i = ((iM3169 ^ i7) * 5587) ^ 2011807584;
                        i2 = -1806702951;
                    } else {
                        iM3169 = (i7 - C0619.m2761("۬ۖ")) * (-13);
                        i = ((iM3169 ^ i8) * 31779) ^ (-566400542);
                        i2 = 1054706679;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -794170516:
                case 1048470680:
                    i4 = 6;
                    if (layout.getLineCount() > 6) {
                        iM3169 = C0773.m3169("ܿ۬") ^ i8;
                        i = ((iM3169 ^ i7) * 15203) ^ (-280105662);
                        i2 = -540229303;
                    } else {
                        totalPaddingBottom2 = totalPaddingBottom;
                        iM3169 = C0619.m2761("ܺۨ") ^ i7;
                        i = ((iM3169 ^ i8) * (-4789)) ^ 328528500;
                        i2 = 2116565176;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -784774199:
                case -53319802:
                    return c9591.m25066(i5, z2);
                case -588441817:
                case -332213017:
                    textView = c9591.f31052;
                    if (C0619.m2763()) {
                        iM3169 = C0619.m2761("᩵֫") ^ i8;
                        i = ((iM3169 ^ i7) * 5587) ^ 2011807584;
                        i2 = -1806702951;
                    } else {
                        iM3169 = (C0619.m2761("ܶ᩸") + i7) * 21;
                        i = ((iM3169 ^ i8) * 25573) ^ 1737910167;
                        i2 = -1314838264;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -297216058:
                case 139349359:
                    i5 = -2;
                    if (totalPaddingBottom <= totalPaddingBottom2) {
                        iM3169 = (C0773.m3169("ܳܶ") + i7) * (-85);
                        i = ((iM3169 ^ i8) * 4605) ^ (-913248118);
                        i2 = 1631065528;
                    } else {
                        iM3169 = (C0619.m2761("᩷ۚ") + i7) * 93;
                        i = ((iM3169 ^ i8) * 11615) ^ 75844700;
                        i2 = -653772308;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -168883132:
                case 1160224140:
                    totalPaddingTop = textView.getTotalPaddingTop();
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ۘܽ") ^ i7;
                        i = ((iM3169 ^ i8) * 15641) ^ 1207145321;
                        i2 = -344244711;
                    } else {
                        iM3169 = (i7 - C0619.m2761("ۛ᩸")) * (-53);
                        i = ((iM3169 ^ i8) * 28473) ^ 34691617;
                        i2 = -950709123;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -73768549:
                case 1860714985:
                    return c9591.m25066(i5, z2);
                case 334757804:
                case 1499956882:
                    totalPaddingBottom = textView.getTotalPaddingBottom() + i3;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i7 - C0619.m2761("۬ۖ")) * (-13);
                        i = ((iM3169 ^ i8) * 31779) ^ (-566400542);
                        i2 = 1054706679;
                    } else {
                        iM3169 = C0619.m2761("᩶᩹") ^ i7;
                        i = ((iM3169 ^ i8) * (-29483)) ^ 1349222422;
                        i2 = -1373822005;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case 341524806:
                case 1103812667:
                    C2834.m9344();
                    C1564.m5509();
                    return false;
                case 873918233:
                case 2065427692:
                    C0950.m3785();
                    C2419.m8174();
                    iM3169 = C0619.m2761("᩵֫") ^ i8;
                    i = ((iM3169 ^ i7) * 5587) ^ 2011807584;
                    i2 = -1806702951;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case 1435674163:
                case 1608235213:
                    totalPaddingTop2 = textView.getTotalPaddingTop() + layout.getLineTop(i4);
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i7 - C0619.m2761("۬ۖ")) * (-13);
                        i = ((iM3169 ^ i8) * 31779) ^ (-566400542);
                        i2 = 1054706679;
                    } else {
                        iM3169 = (C0619.m2761("᩷֫") + i8) * (-61);
                        i = ((iM3169 ^ i7) * (-26727)) ^ 2124043311;
                        i2 = -1551564103;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case 1468035642:
                case 1716806642:
                    layout = textView.getLayout();
                    z = true;
                    z = true;
                    z2 = false;
                    z2 = false;
                    if (layout != null) {
                        iM3169 = C0773.m3169("ۧۚ") ^ i7;
                        i = ((iM3169 ^ i8) * (-14407)) ^ 1787224269;
                        i2 = 559702793;
                    } else {
                        iM3169 = (C0773.m3169("۫ۙ") ^ i8) * (-53);
                        i = ((iM3169 ^ i7) * (-10997)) ^ (-918350506);
                        i2 = -1090540395;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case 1701688893:
                case 1937070335:
                    c9591.f31046 = z2 ? 1 : 0;
                    return z;
                default:
                    C0950.m3785();
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۘܽ") ^ i7;
                        i = ((iM3169 ^ i8) * 15641) ^ 1207145321;
                        i2 = -344244711;
                    } else {
                        iM3169 = C0619.m2761("᩵֫") ^ i8;
                        i = ((iM3169 ^ i7) * 5587) ^ 2011807584;
                        i2 = -1806702951;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m25066(int i, boolean z) {
        int iM2761;
        int i2;
        boolean z2 = false;
        ScrollView scrollView = null;
        ViewGroup.LayoutParams layoutParamsM6240 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 2018173790;
        int i4 = C2702.f8586;
        int i5 = C3779.f12953;
        int iM3169 = C0773.m3169("ۨܶ") ^ i5;
        int i6 = ((iM3169 ^ i4) * 7485) ^ 7784422;
        int i7 = 1100250270;
        while (true) {
            int i8 = iM3169 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * (-9863)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2082891863:
                    case 1740536102:
                        if (C3099.f10023 > 0) {
                            iM3169 = C0619.m2761("ۖܶ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 2023) ^ (-329727993);
                            i7 = 1140189324;
                            break;
                        }
                        iM3169 = C0619.m2761("۬᩻") ^ i4;
                        i6 = ((iM3169 ^ i5) * 25017) ^ (-60160883);
                        i7 = -754215498;
                        break;
                    case -1962466770:
                    case -1553158745:
                        this.f31043.requestDisallowInterceptTouchEvent(z3);
                        scrollView.scrollTo(z3 ? 1 : 0, z3 ? 1 : 0);
                        iM3169 = C0619.m2761("᩶᩷") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-4285)) ^ 253691586;
                        i7 = 1387309627;
                        break;
                    case -1936296525:
                    case 1209462894:
                        if (C2966.f9654 < 0) {
                            iM3169 = (C0619.m2761("᩷᩵") + i4) * 109;
                            i6 = ((iM3169 ^ i5) * 11497) ^ (-1198788465);
                            i7 = 1914487376;
                            break;
                        }
                        iM3169 = C0619.m2761("᩺֫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-2259)) ^ 1200289849;
                        i7 = 773728692;
                        break;
                    case -1912311422:
                    case -16120854:
                        C3099.m10095();
                        C0619.m2763();
                        iM3169 = C0619.m2761("᩺֫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-2259)) ^ 1200289849;
                        i7 = 773728692;
                        break;
                        break;
                    case -1766002892:
                    case 57524785:
                        if (C2966.f9654 < 0) {
                            iM3169 = (i5 - C0619.m2761("ܶۤ")) * (-107);
                            i6 = ((iM3169 ^ i4) * (-23623)) ^ (-528673019);
                            i7 = -1404553072;
                            break;
                        }
                        iM3169 = (i5 - C0773.m3169("֨ܺ")) * (-77);
                        i6 = ((iM3169 ^ i4) * 3131) ^ (-840649000);
                        i7 = -211786450;
                        break;
                    case -1725238331:
                    case -115930712:
                        z4 = true;
                        iM3169 = (i5 - C0773.m3169("ܿۡ")) * (-65);
                        i6 = ((iM3169 ^ i4) * 881) ^ (-1819965768);
                        i7 = 771722468;
                        break;
                    case -1687846139:
                    case 2016369557:
                        if (RunnableC3055.m9933() == 0) {
                            iM3169 = (C0773.m3169("ۤ᩸") + i5) * (-21);
                            i6 = ((iM3169 ^ i4) * (-8595)) ^ 1030585417;
                            i7 = -485779531;
                            break;
                        }
                        iM3169 = C0619.m2761("᩺֫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-2259)) ^ 1200289849;
                        i7 = 773728692;
                        break;
                        break;
                    case -1560549642:
                    case 2143399442:
                        if (layoutParamsM6240.height != i) {
                            iM2761 = C0773.m3169("֫ܳ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-17121)) ^ 413444019;
                            i2 = -1330504677;
                        } else {
                            iM2761 = (C0619.m2761("֡ᩳ") ^ i4) * (-33);
                            i6 = ((iM2761 ^ i5) * (-9455)) ^ (-1853841900);
                            i2 = 1136907569;
                        }
                        i8 = iM2761 ^ i2;
                        z3 = false;
                        break;
                    case -1430389310:
                    case 2027197961:
                        if (!C2966.m9664()) {
                            iM3169 = (i5 - C0773.m3169("֨ܺ")) * (-77);
                            i6 = ((iM3169 ^ i4) * 3131) ^ (-840649000);
                            i7 = -211786450;
                            break;
                            break;
                        }
                        iM3169 = (C0619.m2761("۫֫") ^ i4) * (-97);
                        i6 = ((iM3169 ^ i5) * 19985) ^ 1332155639;
                        i7 = -1923699755;
                        break;
                    case -1216183969:
                    case 1718875257:
                        C2375.m8065();
                        C1321.m4852();
                        return false;
                    case -975276431:
                    case 194761744:
                        if (!C2966.m9664()) {
                            iM3169 = (i5 - C0773.m3169("ܺ᩷")) * 17;
                            i6 = ((iM3169 ^ i4) * (-27321)) ^ (-312750674);
                            i7 = 946326046;
                            break;
                        }
                        iM3169 = C0619.m2761("᩺ܶ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 26361) ^ 560608245;
                        i7 = -533152699;
                        break;
                    case -912007537:
                    case -231588164:
                        if (C2834.f9334 > 0) {
                            iM3169 = (C0619.m2761("ۤ᩵") ^ i5) * (-3);
                            i6 = ((iM3169 ^ i4) * (-12685)) ^ 940430952;
                            i7 = 262172984;
                            break;
                        }
                        iM3169 = (i5 - C0773.m3169("ܺ᩷")) * 17;
                        i6 = ((iM3169 ^ i4) * (-27321)) ^ (-312750674);
                        i7 = 946326046;
                        break;
                        break;
                    case -632463934:
                    case 251432966:
                        if (!z) {
                            iM3169 = (C0619.m2761("ۤۙ") + i5) * (-25);
                            i6 = ((iM3169 ^ i4) * (-9035)) ^ 591614252;
                            i7 = 288990197;
                            break;
                        }
                        iM3169 = C0619.m2761("᩶᩷") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-4285)) ^ 253691586;
                        i7 = 1387309627;
                        break;
                        break;
                    case -516922952:
                    case 501538801:
                        if (!z2) {
                            iM3169 = C0619.m2761("᩶᩷") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-4285)) ^ 253691586;
                            i7 = 1387309627;
                            break;
                            break;
                        }
                        iM3169 = C0619.m2761("ۙ᩹") ^ i4;
                        i6 = ((iM3169 ^ i5) * 18363) ^ (-145054841);
                        i7 = -352148261;
                        break;
                    case -388064758:
                    case -76906409:
                        RunnableC1848.m6360();
                        if (C3998.f13671 == 0) {
                            iM3169 = C0619.m2761("۬᩻") ^ i4;
                            i6 = ((iM3169 ^ i5) * 25017) ^ (-60160883);
                            i7 = -754215498;
                            break;
                            break;
                        }
                        iM3169 = C0619.m2761("᩺֫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-2259)) ^ 1200289849;
                        i7 = 773728692;
                        break;
                        break;
                    case -368561213:
                    case 290506195:
                        z4 = false;
                        iM3169 = (i5 - C0773.m3169("ܿۡ")) * (-65);
                        i6 = ((iM3169 ^ i4) * 881) ^ (-1819965768);
                        i7 = 771722468;
                        break;
                        break;
                    case -28835880:
                    case 592189490:
                        layoutParamsM6240.height = i;
                        scrollView.setLayoutParams(layoutParamsM6240);
                        iM3169 = (i4 - C0773.m3169("ۘۚ")) * 57;
                        i6 = ((iM3169 ^ i5) * 29621) ^ (-1579590456);
                        i7 = 779896172;
                        break;
                    case 27792196:
                    case 1511792306:
                        if (!C2878.f9462) {
                            iM3169 = C0619.m2761("ۨۛ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-9603)) ^ (-1495797350);
                            i7 = 802177641;
                            break;
                        }
                        iM3169 = (i5 - C0773.m3169("ܺ᩷")) * 17;
                        i6 = ((iM3169 ^ i4) * (-27321)) ^ (-312750674);
                        i7 = 946326046;
                        break;
                        break;
                    case 177779936:
                    case 1567862184:
                        if (!z4) {
                            iM3169 = (i4 - C0773.m3169("ۘۚ")) * 57;
                            i6 = ((iM3169 ^ i5) * 29621) ^ (-1579590456);
                            i7 = 779896172;
                            break;
                            break;
                        }
                        iM3169 = (C0619.m2761("ܰ᩸") ^ i5) * (-39);
                        i6 = ((iM3169 ^ i4) * 15597) ^ (-117123232);
                        i7 = 1475900182;
                        break;
                    case 450691910:
                    case 1537928485:
                        return !z4;
                    case 695781044:
                    case 1745680614:
                        if (C3492.f12043 > 0) {
                            iM3169 = (i5 - C0773.m3169("ۙܿ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM3169 ^ i4) * 31647) ^ (-1945394878);
                            i7 = 60056116;
                            break;
                        }
                        iM3169 = (i5 - C0773.m3169("ܺ᩷")) * 17;
                        i6 = ((iM3169 ^ i4) * (-27321)) ^ (-312750674);
                        i7 = 946326046;
                        break;
                        break;
                    case 1431947362:
                    case 1604789061:
                        scrollView = this.f31042;
                        scrollView.setVerticalScrollBarEnabled(z);
                        layoutParamsM6240 = C1783.m6240(scrollView);
                        if (C2354.f7599 < 0) {
                            iM3169 = C0619.m2761("ܰ֨") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-20285)) ^ 2130833074;
                            i7 = 1448678236;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۤ᩸") + i5) * (-21);
                        i6 = ((iM3169 ^ i4) * (-8595)) ^ 1030585417;
                        i7 = -485779531;
                        break;
                        break;
                    case 1969711963:
                    case 2001644280:
                        C2354.m7983();
                        if (C1826.f6190 <= 0) {
                            iM3169 = (i5 - C0773.m3169("֨ܺ")) * (-77);
                            i6 = ((iM3169 ^ i4) * 3131) ^ (-840649000);
                            i7 = -211786450;
                            break;
                            break;
                        }
                        iM3169 = C0619.m2761("᩺֫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-2259)) ^ 1200289849;
                        i7 = 773728692;
                        break;
                        break;
                    default:
                        z2 = this.f31045;
                        this.f31045 = z;
                        if (C23916.f77426 > 0) {
                            iM3169 = C0619.m2761("᩸ᩴ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 31085) ^ (-22953191);
                            i7 = 399149573;
                            break;
                        }
                        iM3169 = (i5 - C0773.m3169("ܺ᩷")) * 17;
                        i6 = ((iM3169 ^ i4) * (-27321)) ^ (-312750674);
                        i7 = 946326046;
                        break;
                        break;
                }
            }
        }
    }
}
