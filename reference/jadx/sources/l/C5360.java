package l;

import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D2S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5360 {

    /* JADX INFO: renamed from: ֫֫᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f18797 = {9586, 1432, 7544, 1946, 8294, 229, 10903, 31614, 31594, 31613, 31590, 31594, -8078, 11643, 8602, -1071, -592, -5440, -4152, 5009, -43, -6039, -1780, 10985};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ActivityC24268 f18798;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View f18799;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f18800;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public RunnableC6697 f18801;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5817 f18802;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f18803;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C8933 f18804;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f18805;

    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x0180  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16011(C5360 c5360, RunnableC12905 runnableC12905) {
        int iM3169;
        int i;
        C5817 c5817 = null;
        int i2 = 1278200535;
        int i3 = C1826.f6190;
        int i4 = AbstractC0116.f1064;
        int iM31610 = C0773.m3169("ۘܿ") ^ i3;
        int i5 = ((iM31610 ^ i4) * 14197) ^ (-1145092763);
        int i6 = -1988711207;
        while (true) {
            int i7 = iM31610 ^ i6;
            RunnableC9678 runnableC9678 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 10253) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2144055169:
                    case 223380708:
                        if (C2419.m8174() >= 0) {
                            iM3169 = (i3 - C0619.m2761("ܺۡ")) * 67;
                            i5 = ((iM3169 ^ i4) * (-26547)) ^ (-656708005);
                            i = -569123001;
                        } else {
                            iM3169 = C0773.m3169("ܺ᩺") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-23921)) ^ 1386666882;
                            i = 1065155152;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -2088898311:
                    case -1813766213:
                        if (C1542.f5343 <= 0) {
                            iM3169 = (i3 - C0773.m3169("ۙۨ")) * (-99);
                            i5 = ((iM3169 ^ i4) * 25571) ^ 1698488308;
                            i = -798888786;
                        } else {
                            iM3169 = C0619.m2761("ᩴ۠") ^ i4;
                            i5 = ((iM3169 ^ i3) * 31875) ^ 212162749;
                            i = 1604384143;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -2064877239:
                    case 1421134315:
                        c5817 = c5360.f18802;
                        c5817.stopScroll();
                        if (c5817.isComputingLayout()) {
                            iM3169 = (i4 - C0773.m3169("᩻ܰ")) * (-53);
                            i5 = ((iM3169 ^ i3) * (-31341)) ^ 635563131;
                            i = 944600578;
                        } else {
                            iM3169 = (C0773.m3169("ۧ᩵") + i3) * 7;
                            i5 = ((iM3169 ^ i4) * (-20353)) ^ 184834014;
                            i = 1298706549;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -2027013445:
                    case 996343148:
                        if (RunnableC0334.f1808 > 0) {
                            iM3169 = (C0619.m2761("ۗۗ") + i3) * 119;
                            i5 = ((iM3169 ^ i4) * 26867) ^ 387085779;
                            i = 1009178182;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -1913227203:
                    case 94124116:
                        C2966.m9664();
                        if (C3998.m12920()) {
                            iM3169 = (i3 - C0773.m3169("ۙۨ")) * (-99);
                            i5 = ((iM3169 ^ i4) * 25571) ^ 1698488308;
                            i = -798888786;
                        } else {
                            iM3169 = (C0773.m3169("ۛ᩺") ^ i3) * 81;
                            i5 = ((iM3169 ^ i4) * (-22145)) ^ 2034197619;
                            i = -250824477;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1893577178:
                    case -1504355735:
                        runnableC9678.run();
                        break;
                    case -1783019154:
                    case 525139525:
                        if (RunnableC3055.m9933() != 0) {
                            iM3169 = (C0773.m3169("۬ܰ") + i4) * 75;
                            i5 = ((iM3169 ^ i3) * (-4163)) ^ 512949858;
                            i = 818509524;
                        } else {
                            iM3169 = C0619.m2761("ܳܺ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-8657)) ^ (-6242401);
                            i = 1773490532;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1355960278:
                    case 504209007:
                        c5817.post(runnableC9678);
                        break;
                    case -1177290681:
                    case -534512496:
                        if (C3734.m12152() < 0) {
                            iM3169 = (i3 - C0773.m3169("ۙۨ")) * (-99);
                            i5 = ((iM3169 ^ i4) * 25571) ^ 1698488308;
                            i = -798888786;
                        } else {
                            iM3169 = (C0773.m3169("۬ܰ") + i4) * 75;
                            i5 = ((iM3169 ^ i3) * (-4163)) ^ 512949858;
                            i = 818509524;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1162289728:
                    case 1909655126:
                        C0487.m2356();
                        if (C4238.m13540() <= 0) {
                            iM3169 = (i3 - C0773.m3169("ۙۨ")) * (-99);
                            i5 = ((iM3169 ^ i4) * 25571) ^ 1698488308;
                            i = -798888786;
                        } else {
                            iM3169 = (i3 - C0619.m2761("ܺۡ")) * 67;
                            i5 = ((iM3169 ^ i4) * (-26547)) ^ (-656708005);
                            i = -569123001;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -843855826:
                    case 735075446:
                        AbstractC0641.m2813();
                        C0619.m2763();
                        iM3169 = (C0773.m3169("ۛ᩺") ^ i3) * 81;
                        i5 = ((iM3169 ^ i4) * (-22145)) ^ 2034197619;
                        i = -250824477;
                        i7 = iM3169 ^ i;
                        break;
                    case -825465644:
                    case 498486395:
                        C2287.m7745();
                        break;
                    case -309115815:
                    case 310155600:
                        if (C3690.f12684 <= 0) {
                            iM3169 = (C0773.m3169("۬ܰ") + i4) * 75;
                            i5 = ((iM3169 ^ i3) * (-4163)) ^ 512949858;
                            i = 818509524;
                        } else {
                            iM3169 = (C0773.m3169("۬ܽ") ^ i4) * 3;
                            i5 = ((iM3169 ^ i3) * 27705) ^ (-2088676725);
                            i = 320249602;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -235163222:
                    case 2042957847:
                        if (!C17202.m40372()) {
                        }
                        runnableC9678 = new RunnableC9678(c5360, runnableC12905);
                        if (C23916.f77426 > 0) {
                            iM3169 = C0619.m2761("ܺۤ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-12635)) ^ (-1548347209);
                            i = 1353372349;
                            i7 = iM3169 ^ i;
                        }
                        break;
                        break;
                        break;
                    case 1251781177:
                    case 1845480306:
                        if (C2878.f9462) {
                            iM3169 = (C0773.m3169("۬ܰ") + i4) * 75;
                            i5 = ((iM3169 ^ i3) * (-4163)) ^ 512949858;
                            i = 818509524;
                        } else {
                            iM3169 = (C0773.m3169("֨ۤ") ^ i4) * (-23);
                            i5 = ((iM3169 ^ i3) * 12729) ^ (-998962643);
                            i = 849553467;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1539125983:
                    case 1660270535:
                        if (C1519.f5300 >= 0) {
                            iM3169 = (C0773.m3169("ۛ᩺") ^ i3) * 81;
                            i5 = ((iM3169 ^ i4) * (-22145)) ^ 2034197619;
                            i = -250824477;
                        } else {
                            iM3169 = C0619.m2761("֫ᩳ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-13407)) ^ (-1915790098);
                            i = 488696280;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    default:
                        if (C1783.f6087 <= 0) {
                            iM3169 = (i3 - C0619.m2761("ܺۡ")) * 67;
                            i5 = ((iM3169 ^ i4) * (-26547)) ^ (-656708005);
                            i = -569123001;
                        } else {
                            iM3169 = (C0773.m3169("ᩴ᩺") + i3) * 85;
                            i5 = ((iM3169 ^ i4) * (-24399)) ^ (-702077642);
                            i = -877665272;
                        }
                        i7 = iM3169 ^ i;
                        break;
                }
                return;
            }
            iM31610 = C0773.m3169("ܳᩴ") ^ i4;
            i5 = ((iM31610 ^ i3) * (-32297)) ^ 425535328;
            i6 = 1976369739;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16007(C5360 c5360) {
        List listM52723 = null;
        int i = -1073655242;
        int i2 = C2287.f7432;
        int i3 = C2288.f7433;
        int iM2761 = C0619.m2761("᩻֨") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-28527)) ^ 1663250961;
        int i5 = 149688414;
        while (true) {
            i = ((((i ^ i2) * 32731) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2062803142:
                case 1938455101:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ۚܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13219) ^ (-56679802);
                        i5 = 1172607372;
                    } else {
                        iM2761 = C0773.m3169("ܶ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22769)) ^ 531070672;
                        i5 = 1237267890;
                    }
                    break;
                case -1769725427:
                case -1260937325:
                    c5360.f18805 = listM52723;
                    c5360.f18803 = C23522.m52716();
                    break;
                case -1381724902:
                case 1345548420:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۚܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13219) ^ (-56679802);
                        i5 = 1172607372;
                    } else {
                        iM2761 = C0619.m2761("ܶ֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 12915) ^ 1989409323;
                        i5 = 278689102;
                    }
                    break;
                case -1338543007:
                case 1708178540:
                    if (C1519.m5403()) {
                        iM2761 = C0619.m2761("᩸ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18109)) ^ (-1916631161);
                        i5 = -189753668;
                    } else {
                        iM2761 = (C0773.m3169("ᩳۚ") ^ i2) * (-125);
                        i4 = ((iM2761 ^ i3) * (-18907)) ^ (-601846220);
                        i5 = -1399481734;
                    }
                    break;
                case -1059401001:
                case -646046448:
                    if (C3448.f11240 < 0) {
                        iM2761 = C0773.m3169("۠ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12421)) ^ 2041319782;
                        i5 = 782129477;
                    } else {
                        iM2761 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6331)) ^ (-904515327);
                        i5 = -841217200;
                    }
                    break;
                case -843381321:
                case 749752939:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = (i2 - C0773.m3169("᩺ۤ")) * 67;
                        i4 = ((iM2761 ^ i3) * (-4659)) ^ (-1602226311);
                        i5 = -1252368501;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۧ") + i2) * 49;
                        i4 = ((iM2761 ^ i3) * 6181) ^ (-645597454);
                        i5 = 1916816586;
                    }
                    break;
                case -699622502:
                case 920506720:
                    listM52723 = C23522.m52723();
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0619.m2761("ۚܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13219) ^ (-56679802);
                        i5 = 1172607372;
                    } else {
                        iM2761 = C0773.m3169("ۤ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 823) ^ 1330236378;
                        i5 = 378757260;
                    }
                    break;
                case -524190289:
                case 806347094:
                    RunnableC0334.m2063();
                    C17202.m40372();
                    iM2761 = C0773.m3169("ۖۢ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-6331)) ^ (-904515327);
                    i5 = -841217200;
                    break;
                case -144452814:
                case 844628505:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("۠ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12421)) ^ 2041319782;
                        i5 = 782129477;
                    } else {
                        iM2761 = C0619.m2761("ۨܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25633) ^ (-1813718930);
                        i5 = 125978214;
                    }
                    break;
                case 279104869:
                case 737015748:
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("ۘ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17009) ^ 540443638;
                        i5 = 1323473832;
                    } else {
                        iM2761 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6331)) ^ (-904515327);
                        i5 = -841217200;
                    }
                    break;
                case 666266952:
                case 1073082441:
                    C2419.m8174();
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ᩳۚ") ^ i2) * (-125);
                        i4 = ((iM2761 ^ i3) * (-18907)) ^ (-601846220);
                        i5 = -1399481734;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩺ۤ")) * 67;
                        i4 = ((iM2761 ^ i3) * (-4659)) ^ (-1602226311);
                        i5 = -1252368501;
                    }
                    break;
                case 896416926:
                case 1926149926:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6331)) ^ (-904515327);
                        i5 = -841217200;
                    } else {
                        iM2761 = C0773.m3169("᩺ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11931)) ^ (-1521111482);
                        i5 = -207691827;
                    }
                    break;
                case 1154838186:
                case 1288475020:
                    C13473.m33144();
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i2 - C0773.m3169("᩺ۤ")) * 67;
                        i4 = ((iM2761 ^ i3) * (-4659)) ^ (-1602226311);
                        i5 = -1252368501;
                    } else {
                        iM2761 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6331)) ^ (-904515327);
                        i5 = -841217200;
                    }
                    break;
                case 1507820150:
                case 1790774670:
                    C3734.m12155(c5360);
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("۠ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12421)) ^ 2041319782;
                        i5 = 782129477;
                    } else {
                        iM2761 = C0619.m2761("ܳ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 24817) ^ (-67736238);
                        i5 = -802944427;
                    }
                    break;
                case 1887828278:
                case 1956922953:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i2 - C0773.m3169("᩺ۤ")) * 67;
                        i4 = ((iM2761 ^ i3) * (-4659)) ^ (-1602226311);
                        i5 = -1252368501;
                    } else {
                        iM2761 = (C0619.m2761("ۤۜ") ^ i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-16593)) ^ 977335590;
                        i5 = 1762042743;
                    }
                    break;
                default:
                    C3492.m11488();
                    RunnableC0334.m2063();
                    break;
            }
            return;
        }
    }

    public C5360(ActivityC24268 activityC24268) {
        String str;
        View view;
        InterfaceC9801 interfaceC9801;
        short[] sArr;
        int iM3169;
        int i;
        int i2;
        View viewM2812;
        int iM31610;
        int i3;
        InterfaceC9801 interfaceC9802;
        String str2;
        short[] sArr2;
        int iM2761;
        int i4;
        int i5;
        int i6;
        InterfaceC9801 interfaceC9803;
        short[] sArr3;
        short[] sArr4;
        int i7;
        short[] sArr5;
        int iM31611;
        int i8;
        int iM31612;
        int i9;
        C5360 c5360 = this;
        int i10 = C2310.f7472;
        int i11 = C3099.f10023;
        short s = f18797[0];
        int i12 = s * 22392;
        int i13 = s + 5598;
        int i14 = (i13 * i13) - i12 >= 0 ? 31502 : 47571;
        int iM31613 = (C0773.m3169("᩵ܰ") + i10) * 45;
        int i15 = ((iM31613 ^ i11) * 27245) ^ 1263094221;
        String strM9486 = null;
        View viewM9333 = null;
        TextView textView = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        C5817 c5817 = null;
        int i16 = 0;
        int i17 = 0;
        boolean z = false;
        int iM31614 = 0;
        int i18 = 0;
        int i19 = 0;
        int iM2762 = 0;
        int iM31615 = 0;
        int i20 = 0;
        InterfaceC9801 interfaceC9804 = null;
        int i21 = -1768431103;
        int i22 = iM31613 ^ (-1945135594);
        String strM1785 = null;
        short[] sArr9 = null;
        View view2 = null;
        int iM2763 = 0;
        while (true) {
            i21 = i22 ^ ((((i21 ^ i11) * 28033) >> 31) & i15);
            switch (i21) {
                case -2108768558:
                case -1183688693:
                    C8933 c8933 = new C8933(c5360);
                    c5360.f18804 = c8933;
                    C3998.m12927(c5817, c8933);
                    new C11999(new C2967(c5360)).m30173((C25227) c5817);
                    return;
                case -2050763037:
                case -592693707:
                    C0773.m3161();
                    if (C1343.f4799 == 0) {
                        interfaceC9802 = interfaceC9804;
                        str2 = strM9486;
                        sArr2 = sArr8;
                        iM2761 = (C0619.m2761("᩹ۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i11) * 9957) ^ 655562776;
                        i5 = 179557201;
                        int i23 = iM2761 ^ i5;
                        sArr8 = sArr2;
                        interfaceC9804 = interfaceC9802;
                        i22 = i23;
                        String str3 = str2;
                        i15 = i4;
                        view2 = view2;
                        strM9486 = str3;
                    } else {
                        viewM2812 = view2;
                        str = strM9486;
                        short[] sArr10 = sArr8;
                        interfaceC9801 = interfaceC9804;
                        sArr = sArr10;
                        iM31610 = (i10 - C0619.m2761("᩶᩸")) * 87;
                        view = viewM2812;
                        i = ((iM31610 ^ i11) * (-5187)) ^ 299411699;
                        i3 = 1589831869;
                        i22 = iM31610 ^ i3;
                        view2 = view;
                        strM9486 = str;
                        i15 = i;
                        InterfaceC9801 interfaceC9805 = interfaceC9801;
                        sArr8 = sArr;
                        interfaceC9804 = interfaceC9805;
                    }
                    break;
                case -1964727388:
                case -1759445012:
                    C0487.m2356();
                    C3099.m10095();
                    throw new RuntimeException();
                case -1887074047:
                case -732220004:
                    str = strM9486;
                    sArr = sArr8;
                    c5360.f18805 = C23522.m52723();
                    c5360.f18803 = C23522.m52716();
                    InterfaceC9801 interfaceC9806 = ApplicationC17729.f58258;
                    sArr7 = f18797;
                    if (!C2023.f6737) {
                        int iM2764 = C0619.m2761("ۜ۟") ^ i10;
                        i6 = ((iM2764 ^ i11) * (-18913)) ^ (-840477951);
                        i22 = iM2764 ^ 71066884;
                        sArr8 = sArr;
                        interfaceC9804 = interfaceC9806;
                        strM9486 = str;
                        i15 = i6;
                    } else {
                        interfaceC9801 = interfaceC9806;
                        viewM2812 = view2;
                        iM31610 = (i10 - C0619.m2761("᩶᩸")) * 87;
                        view = viewM2812;
                        i = ((iM31610 ^ i11) * (-5187)) ^ 299411699;
                        i3 = 1589831869;
                        i22 = iM31610 ^ i3;
                        view2 = view;
                        strM9486 = str;
                        i15 = i;
                        InterfaceC9801 interfaceC9807 = interfaceC9801;
                        sArr8 = sArr;
                        interfaceC9804 = interfaceC9807;
                    }
                    break;
                case -1849050501:
                case -1342322340:
                    C2485.m8358(textView, z ? 1 : 0);
                    iM2762 = C0619.m2761(C17202.m40377(f18797, 21, 3, i14));
                    iM31612 = (C0773.m3169("ۨۘ") + i11) * (-29);
                    i15 = 1149079422 ^ ((iM31612 ^ i10) * (-29069));
                    i9 = 1792795309;
                    i22 = i9 ^ iM31612;
                    break;
                case -1805945585:
                case 1852982448:
                    c5817.m16965(C3448.m11246(view2, iM2762 ^ 2100520018));
                    if (!C3690.m11987()) {
                        iM31612 = C0619.m2761("ۘۤ") ^ i10;
                        i15 = (-1027507030) ^ ((iM31612 ^ i11) * (-12831));
                        i9 = 1417440903;
                        i22 = i9 ^ iM31612;
                    } else {
                        sArr5 = sArr8;
                        iM31611 = (i11 - C0773.m3169("ۡ᩻")) * 61;
                        i15 = ((iM31611 ^ i10) * 2903) ^ (-720480219);
                        i8 = -1907407745;
                        i22 = iM31611 ^ i8;
                        sArr8 = sArr5;
                    }
                    break;
                case -1739509914:
                case 1648915240:
                    InterfaceC9801 interfaceC9808 = interfaceC9804;
                    String str4 = strM9486;
                    c5360.f18800 = C4238.m13535(interfaceC9808, str4, z);
                    sArr8 = f18797;
                    i19 = 3;
                    int iM2765 = C0619.m2761("֨ܶ") ^ i11;
                    int i24 = ((iM2765 ^ i10) * (-25991)) ^ (-277006110);
                    i7 = iM2765 ^ 247739579;
                    interfaceC9804 = interfaceC9808;
                    strM9486 = str4;
                    i15 = i24;
                    i18 = 12;
                    i22 = i7;
                    break;
                case -1718355936:
                case -46219868:
                    C2288.m7767();
                    C0950.m3785();
                    viewM2812 = view2;
                    str = strM9486;
                    short[] sArr11 = sArr8;
                    interfaceC9801 = interfaceC9804;
                    sArr = sArr11;
                    iM31610 = (i10 - C0619.m2761("᩶᩸")) * 87;
                    view = viewM2812;
                    i = ((iM31610 ^ i11) * (-5187)) ^ 299411699;
                    i3 = 1589831869;
                    i22 = iM31610 ^ i3;
                    view2 = view;
                    strM9486 = str;
                    i15 = i;
                    InterfaceC9801 interfaceC9809 = interfaceC9801;
                    sArr8 = sArr;
                    interfaceC9804 = interfaceC9809;
                    break;
                case -1559417960:
                case 842147907:
                    interfaceC9802 = interfaceC9804;
                    str2 = strM9486;
                    sArr2 = sArr8;
                    c5817 = (C5817) C2834.m9333(view2, iM2763 ^ i20);
                    c5360.f18802 = c5817;
                    if (C0773.m3161() != 0) {
                        iM2761 = (C0619.m2761("᩹ۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i11) * 9957) ^ 655562776;
                        i5 = 179557201;
                    } else {
                        iM2761 = C0619.m2761("᩶ۚ") ^ i10;
                        i4 = ((iM2761 ^ i11) * (-17657)) ^ (-1529194176);
                        i5 = 40502753;
                    }
                    int i25 = iM2761 ^ i5;
                    sArr8 = sArr2;
                    interfaceC9804 = interfaceC9802;
                    i22 = i25;
                    String str5 = str2;
                    i15 = i4;
                    view2 = view2;
                    strM9486 = str5;
                    break;
                case -1361772149:
                case 1732868859:
                    str = strM9486;
                    short[] sArr12 = sArr8;
                    interfaceC9801 = interfaceC9804;
                    sArr = sArr12;
                    viewM2812 = AbstractC0641.m2812(activityC24268, iM31615 ^ 2128942517);
                    c5360.f18799 = viewM2812;
                    sArr6 = f18797;
                    if (C2702.m8876()) {
                        iM31610 = C0773.m3169("ۨ᩺") ^ i10;
                        view = viewM2812;
                        i = ((iM31610 ^ i11) * 7523) ^ 138965859;
                        i3 = -2042475274;
                    } else {
                        iM31610 = (i10 - C0619.m2761("᩶᩸")) * 87;
                        view = viewM2812;
                        i = ((iM31610 ^ i11) * (-5187)) ^ 299411699;
                        i3 = 1589831869;
                    }
                    i22 = iM31610 ^ i3;
                    view2 = view;
                    strM9486 = str;
                    i15 = i;
                    InterfaceC9801 interfaceC98010 = interfaceC9801;
                    sArr8 = sArr;
                    interfaceC9804 = interfaceC98010;
                    break;
                case -1273250070:
                case 582196550:
                    if (C2834.f9334 <= 0) {
                        sArr4 = sArr7;
                        interfaceC9803 = interfaceC9804;
                        sArr3 = sArr8;
                        int iM31616 = (C0773.m3169("ۢ۠") ^ i11) * 35;
                        sArr7 = sArr4;
                        i6 = ((iM31616 ^ i10) * 10379) ^ 180019423;
                        sArr8 = sArr3;
                        interfaceC9804 = interfaceC9803;
                        i22 = iM31616 ^ (-301599092);
                        i15 = i6;
                    } else {
                        viewM2812 = view2;
                        str = strM9486;
                        short[] sArr13 = sArr8;
                        interfaceC9801 = interfaceC9804;
                        sArr = sArr13;
                        iM31610 = (i10 - C0619.m2761("᩶᩸")) * 87;
                        view = viewM2812;
                        i = ((iM31610 ^ i11) * (-5187)) ^ 299411699;
                        i3 = 1589831869;
                        i22 = iM31610 ^ i3;
                        view2 = view;
                        strM9486 = str;
                        i15 = i;
                        InterfaceC9801 interfaceC98011 = interfaceC9801;
                        sArr8 = sArr;
                        interfaceC9804 = interfaceC98011;
                    }
                    break;
                case -1106157278:
                case -815681170:
                    C2023.m6954(textView, C0773.m3169(strM1785) ^ 2099880512);
                    if (AbstractC0641.f2496 < 0) {
                        iM31612 = (C0619.m2761("᩵֨") + i10) * 25;
                        i15 = (-1387913191) ^ ((iM31612 ^ i11) * (-28365));
                        i9 = 1154353168;
                        i22 = i9 ^ iM31612;
                    } else {
                        interfaceC9802 = interfaceC9804;
                        str2 = strM9486;
                        sArr2 = sArr8;
                        iM2761 = (C0619.m2761("᩹ۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i11) * 9957) ^ 655562776;
                        i5 = 179557201;
                        int i26 = iM2761 ^ i5;
                        sArr8 = sArr2;
                        interfaceC9804 = interfaceC9802;
                        i22 = i26;
                        String str6 = str2;
                        i15 = i4;
                        view2 = view2;
                        strM9486 = str6;
                    }
                    break;
                case -948921213:
                case 528296079:
                    ((C3072) C2834.m9333(view2, iM31614)).setEnabled(z);
                    sArr9 = f18797;
                    i16 = 15;
                    i17 = 3;
                    if (C2287.f7432 < 0) {
                        iM31612 = C0773.m3169("᩻ܳ") ^ i11;
                        i15 = 1053101963 ^ ((iM31612 ^ i10) * 28809);
                        i9 = -1080987104;
                        i22 = i9 ^ iM31612;
                    } else {
                        interfaceC9802 = interfaceC9804;
                        str2 = strM9486;
                        sArr2 = sArr8;
                        iM2761 = (C0619.m2761("᩹ۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i11) * 9957) ^ 655562776;
                        i5 = 179557201;
                        int i27 = iM2761 ^ i5;
                        sArr8 = sArr2;
                        interfaceC9804 = interfaceC9802;
                        i22 = i27;
                        String str7 = str2;
                        i15 = i4;
                        view2 = view2;
                        strM9486 = str7;
                    }
                    break;
                case -794895742:
                case 1293847443:
                    C4238.m13540();
                    if (!RunnableC1848.f6235) {
                        str = strM9486;
                        view = view2;
                        short[] sArr14 = sArr8;
                        interfaceC9801 = interfaceC9804;
                        sArr = sArr14;
                        iM3169 = (i11 - C0773.m3169("ۡۗ")) * (-79);
                        i = ((iM3169 ^ i10) * 4851) ^ (-1099850937);
                        i2 = 179512730;
                        i22 = i2 ^ iM3169;
                        c5360 = this;
                        view2 = view;
                        strM9486 = str;
                        i15 = i;
                        InterfaceC9801 interfaceC98012 = interfaceC9801;
                        sArr8 = sArr;
                        interfaceC9804 = interfaceC98012;
                    } else {
                        sArr4 = sArr7;
                        interfaceC9803 = interfaceC9804;
                        sArr3 = sArr8;
                        int iM31617 = (C0773.m3169("ۢ۠") ^ i11) * 35;
                        sArr7 = sArr4;
                        i6 = ((iM31617 ^ i10) * 10379) ^ 180019423;
                        sArr8 = sArr3;
                        interfaceC9804 = interfaceC9803;
                        i22 = iM31617 ^ (-301599092);
                        i15 = i6;
                    }
                    break;
                case -770787874:
                case 1854894075:
                    interfaceC9803 = interfaceC9804;
                    sArr3 = sArr8;
                    sArr4 = sArr7;
                    strM9486 = C2878.m9486(sArr4, 7, 5, i14);
                    z = false;
                    z = false;
                    if (C20932.f66974 > 0) {
                        sArr7 = sArr4;
                        int iM31618 = (C0773.m3169("ۨ֡") ^ i11) * (-57);
                        i15 = ((iM31618 ^ i10) * (-14719)) ^ (-968523794);
                        i7 = iM31618 ^ (-840452193);
                        sArr8 = sArr3;
                        interfaceC9804 = interfaceC9803;
                        i22 = i7;
                    } else {
                        int iM31619 = (C0773.m3169("ۢ۠") ^ i11) * 35;
                        sArr7 = sArr4;
                        i6 = ((iM31619 ^ i10) * 10379) ^ 180019423;
                        sArr8 = sArr3;
                        interfaceC9804 = interfaceC9803;
                        i22 = iM31619 ^ (-301599092);
                        i15 = i6;
                    }
                    break;
                case -406801218:
                case 74814538:
                    viewM9333 = C2834.m9333(view2, C0773.m3169(C1826.m6310(sArr9, i16, i17, i14)) ^ 2130617970);
                    if (C4238.f15451 < 0) {
                        iM31612 = C0619.m2761("ۜ֡") ^ i10;
                        i15 = (-535165630) ^ ((iM31612 ^ i11) * (-31035));
                        i9 = -562116731;
                        i22 = i9 ^ iM31612;
                    } else {
                        str = strM9486;
                        view = view2;
                        short[] sArr15 = sArr8;
                        interfaceC9801 = interfaceC9804;
                        sArr = sArr15;
                        iM3169 = (i11 - C0773.m3169("ۡۗ")) * (-79);
                        i = ((iM3169 ^ i10) * 4851) ^ (-1099850937);
                        i2 = 179512730;
                        i22 = i2 ^ iM3169;
                        c5360 = this;
                        view2 = view;
                        strM9486 = str;
                        i15 = i;
                        InterfaceC9801 interfaceC98013 = interfaceC9801;
                        sArr8 = sArr;
                        interfaceC9804 = interfaceC98013;
                    }
                    break;
                case 139204249:
                case 1399601753:
                    textView = (TextView) viewM9333;
                    strM1785 = C0269.m1785(f18797, 18, 3, i14);
                    iM31612 = C0619.m2761("᩶֫") ^ i11;
                    i15 = 1676992866 ^ ((iM31612 ^ i10) * (-26373));
                    i9 = -1758432739;
                    i22 = i9 ^ iM31612;
                    break;
                case 726858674:
                case 1848434437:
                    str = strM9486;
                    view = view2;
                    short[] sArr16 = sArr8;
                    interfaceC9801 = interfaceC9804;
                    sArr = sArr16;
                    c5360.f18798 = activityC24268;
                    iM31615 = C0773.m3169(C17202.m40377(f18797, 1, 3, i14));
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (i11 - C0773.m3169("ۡۗ")) * (-79);
                        i = ((iM3169 ^ i10) * 4851) ^ (-1099850937);
                        i2 = 179512730;
                    } else {
                        iM3169 = C0773.m3169("᩺᩶") ^ i11;
                        i = ((iM3169 ^ i10) * 183) ^ 13700917;
                        i2 = 1058590529;
                    }
                    i22 = i2 ^ iM3169;
                    c5360 = this;
                    view2 = view;
                    strM9486 = str;
                    i15 = i;
                    InterfaceC9801 interfaceC98014 = interfaceC9801;
                    sArr8 = sArr;
                    interfaceC9804 = interfaceC98014;
                    break;
                case 1452701875:
                case 1459367704:
                    sArr5 = sArr8;
                    iM31614 = C0773.m3169(C1343.m4939(sArr5, i18, i19, i14)) ^ 2102950859;
                    if (C4282.f15546 <= 0) {
                        iM31611 = (i11 - C0773.m3169("ۡ᩻")) * 61;
                        i15 = ((iM31611 ^ i10) * 2903) ^ (-720480219);
                        i8 = -1907407745;
                    } else {
                        iM31611 = (C0773.m3169("ܶܺ") + i10) * 109;
                        i15 = ((iM31611 ^ i11) * 17935) ^ 2098360093;
                        i8 = 751582934;
                    }
                    i22 = iM31611 ^ i8;
                    sArr8 = sArr5;
                    break;
                default:
                    InterfaceC9801 interfaceC98015 = interfaceC9804;
                    String str8 = strM9486;
                    short[] sArr17 = sArr8;
                    View view3 = view2;
                    short[] sArr18 = sArr6;
                    iM2763 = C0619.m2761(C2310.m7803(sArr18, 4, 3, i14));
                    i20 = 2121035939;
                    int iM2766 = C0619.m2761("᩵۠") ^ i11;
                    sArr6 = sArr18;
                    i22 = iM2766 ^ 1784932814;
                    i15 = ((iM2766 ^ i10) * 17397) ^ (-223765697);
                    view2 = view3;
                    strM9486 = str8;
                    sArr8 = sArr17;
                    interfaceC9804 = interfaceC98015;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16018() {
        List list = null;
        Iterator itM53423 = null;
        C18300 c18300 = null;
        int i = -1253089697;
        int i2 = C2702.f8586;
        int i3 = C20932.f66974;
        int iM3169 = (i3 - C0773.m3169("ۚܽ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i4 = ((iM3169 ^ i2) * (-23075)) ^ 2003630873;
        int i5 = -403692813;
        while (true) {
            i = ((((i ^ i2) * (-18781)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1952922203:
                case -388668098:
                    itM53423 = C23916.m53423(list);
                    iM3169 = (C0619.m2761("ܽܰ") ^ i2) * (-25);
                    i4 = ((iM3169 ^ i3) * 20559) ^ 2023699370;
                    i5 = 434175459;
                    break;
                case -1855987768:
                case 531355492:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("ܶ֨") + i3) * (-63);
                        i4 = ((iM3169 ^ i2) * (-2279)) ^ 1428134658;
                        i5 = 34316035;
                    } else {
                        iM3169 = C0773.m3169("ۙܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3443) ^ (-301303953);
                        i5 = 1114474842;
                    }
                    break;
                case -1798289499:
                case 1969856756:
                    if (!C0619.f2439) {
                        iM3169 = C0619.m2761("ۤۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6903)) ^ 291453525;
                        i5 = -1079920040;
                    } else {
                        iM3169 = C0773.m3169("ܰۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32763) ^ (-125531888);
                        i5 = -46930492;
                    }
                    break;
                case -1616911004:
                case 193718042:
                    c18300 = (C18300) C4238.m13529(itM53423);
                    if (c18300.m42686()) {
                        iM3169 = (C0619.m2761("ܽܰ") ^ i2) * (-25);
                        i4 = ((iM3169 ^ i3) * 20559) ^ 2023699370;
                        i5 = 434175459;
                    } else {
                        iM3169 = (C0619.m2761("֡ܽ") ^ i3) * 5;
                        i4 = ((iM3169 ^ i2) * 3497) ^ (-270247920);
                        i5 = 1888808182;
                    }
                    break;
                case -1610650749:
                case -1435162354:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("ۤۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6903)) ^ 291453525;
                        i5 = -1079920040;
                    } else {
                        iM3169 = (C0773.m3169("ۖ᩺") ^ i2) * 109;
                        i4 = ((iM3169 ^ i3) * 19279) ^ (-2075412889);
                        i5 = -1798283989;
                    }
                    break;
                case -1520079337:
                case 1672304201:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0619.m2761("ܽܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-12839)) ^ 379853632;
                        i5 = 127498043;
                    } else {
                        iM3169 = (C0619.m2761("ᩳܿ") ^ i3) * 23;
                        i4 = ((iM3169 ^ i2) * 28501) ^ 1690807874;
                        i5 = 1196527532;
                    }
                    break;
                case -1519739157:
                case 377828018:
                    c18300.m42661();
                    iM3169 = (C0619.m2761("ܽܰ") ^ i2) * (-25);
                    i4 = ((iM3169 ^ i3) * 20559) ^ 2023699370;
                    i5 = 434175459;
                    break;
                case -1446748171:
                case -1398405067:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("ܰۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32763) ^ (-125531888);
                        i5 = -46930492;
                    } else {
                        iM3169 = (C0773.m3169("֨ۖ") ^ i2) * (-121);
                        i4 = ((iM3169 ^ i3) * 11325) ^ 904563885;
                        i5 = 2064476151;
                    }
                    break;
                case -1367244032:
                case -137395822:
                    C11235.m28309();
                    if (!RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("ۜܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11219) ^ (-1695751386);
                        i5 = 528665006;
                    } else {
                        iM3169 = C0773.m3169("ܰۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32763) ^ (-125531888);
                        i5 = -46930492;
                    }
                    break;
                case -1252137007:
                case 901998065:
                    AbstractC0116.m1243();
                    C2287.m7745();
                    iM3169 = C0773.m3169("ۜܰ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 11219) ^ (-1695751386);
                    i5 = 528665006;
                    break;
                case -1193929207:
                case 330616043:
                    if (C20932.m47848() != 0) {
                        iM3169 = C0619.m2761("ۤۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6903)) ^ 291453525;
                        i5 = -1079920040;
                    } else {
                        iM3169 = C0619.m2761("ۢ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8443)) ^ 881287362;
                        i5 = 734223904;
                    }
                    break;
                case -1181984583:
                case 140315973:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ۜܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11219) ^ (-1695751386);
                        i5 = 528665006;
                    } else {
                        iM3169 = C0619.m2761("ۘܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8941)) ^ 561596679;
                        i5 = 1520167208;
                    }
                    break;
                case -537105379:
                case 1517064910:
                    list = this.f18805;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("ۜܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11219) ^ (-1695751386);
                        i5 = 528665006;
                    } else {
                        iM3169 = C0619.m2761("ۧ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22419)) ^ 133483529;
                        i5 = -2096601340;
                    }
                    break;
                case -190773622:
                case 955445492:
                    if (C1826.m6317(itM53423)) {
                        iM3169 = C0619.m2761("ܺۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30395) ^ (-2115537411);
                        i5 = 1139140166;
                    } else {
                        iM3169 = C0619.m2761("᩹᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19167) ^ (-900513474);
                        i5 = 1596596405;
                    }
                    break;
                case 80844686:
                case 894360319:
                    C4282.m13644();
                    C1542.m5459();
                    break;
                case 318100938:
                case 958567016:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("ܶ֨") + i3) * (-63);
                        i4 = ((iM3169 ^ i2) * (-2279)) ^ 1428134658;
                        i5 = 34316035;
                    } else {
                        iM3169 = C0619.m2761("֨᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31111)) ^ 1913073599;
                        i5 = 895997491;
                    }
                    break;
                case 319466393:
                case 1755421278:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ܽܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-12839)) ^ 379853632;
                        i5 = 127498043;
                    } else {
                        iM3169 = C0773.m3169("֫ۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25821) ^ (-920154528);
                        i5 = -1007250281;
                    }
                    break;
                case 804194793:
                case 1977984784:
                    break;
                case 1107979731:
                case 1134728743:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0773.m3169("ܰۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32763) ^ (-125531888);
                        i5 = -46930492;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩻") + i3) * (-103);
                        i4 = ((iM3169 ^ i2) * 27861) ^ (-149772409);
                        i5 = 2144007434;
                    }
                    break;
                default:
                    RunnableC3646.m11813();
                    if (C11235.f35427 < 0) {
                        iM3169 = (C0619.m2761("ܶ֨") + i3) * (-63);
                        i4 = ((iM3169 ^ i2) * (-2279)) ^ 1428134658;
                        i5 = 34316035;
                    } else {
                        iM3169 = C0773.m3169("ܰۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32763) ^ (-125531888);
                        i5 = -46930492;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x0181 A[PHI: r1
      0x0181: PHI (r1v3 java.lang.Runnable) = 
      (r1v2 java.lang.Runnable)
      (r1v2 java.lang.Runnable)
      (r1v2 java.lang.Runnable)
      (r1v2 java.lang.Runnable)
      (r1v5 java.lang.Runnable)
     binds: [B:54:0x017f, B:50:0x0164, B:16:0x0048, B:10:0x0039, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f7 A[PHI: r0 r9
      0x01f7: PHI (r0v4 int) = (r0v3 int), (r0v2 int), (r0v2 int), (r0v2 int) binds: [B:66:0x01f5, B:62:0x01d9, B:42:0x0119, B:32:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r9v5 l.ۡ᩹֫) = (r9v4 l.ۡ᩹֫), (r9v4 l.ۡ᩹֫), (r9v4 l.ۡ᩹֫), (r9v6 l.ۡ᩹֫) binds: [B:66:0x01f5, B:62:0x01d9, B:42:0x0119, B:32:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16020() {
        int iM3169;
        int i;
        int i2 = 0;
        Runnable runnable = null;
        C5817 c5817 = null;
        int i3 = 561589432;
        int i4 = C0773.f2792;
        int i5 = C4238.f15451;
        int iM2761 = C0619.m2761("ۛ᩹") ^ i4;
        int i6 = ((iM2761 ^ i5) * 32149) ^ (-1986296114);
        int i7 = -885248634;
        while (true) {
            int i8 = iM2761 ^ i7;
            RunnableC9678 runnableC9678 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 23663) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2023798234:
                    case 2118607361:
                        if (C3690.f12684 <= 0) {
                            iM3169 = C0773.m3169("ۛܶ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-11849)) ^ (-1660036006);
                            i = -2129708987;
                        } else {
                            iM3169 = C0773.m3169("ܽۙ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 12207) ^ (-448782348);
                            i = 1397684153;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1951337833:
                    case -1182928357:
                        if (C4282.f15546 > 0) {
                            runnableC9678 = new RunnableC9678(this, runnable);
                            if (C1343.f4799 != 0) {
                                iM3169 = (C0619.m2761("᩹۠") + i5) * 7;
                                i6 = ((iM3169 ^ i4) * 1761) ^ (-292461582);
                                i = 1260288372;
                            } else {
                                iM3169 = (C0773.m3169("۬᩸") + i5) * 79;
                                i6 = ((iM3169 ^ i4) * (-5219)) ^ (-1927118546);
                                i = 1270444590;
                            }
                            i8 = iM3169 ^ i;
                        }
                        break;
                    case -1778103873:
                    case 262873147:
                        break;
                    case -1741263919:
                    case -1557235705:
                        if (C2310.f7472 >= 0) {
                            iM3169 = C0619.m2761("ܳۛ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6189) ^ 302369553;
                            i = 113800882;
                        } else {
                            iM3169 = (C0773.m3169("۟ᩴ") ^ i4) * (-119);
                            i6 = ((iM3169 ^ i5) * (-12319)) ^ (-741173436);
                            i = -358082471;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1677905772:
                    case 779537585:
                        if (C1519.f5300 >= 0) {
                            iM3169 = (C0619.m2761("᩹۠") + i5) * 7;
                            i6 = ((iM3169 ^ i4) * 1761) ^ (-292461582);
                            i = 1260288372;
                        } else {
                            iM3169 = (C0773.m3169("ۡܶ") ^ i5) * 39;
                            i6 = ((iM3169 ^ i4) * 17209) ^ (-264419959);
                            i = 125579018;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1578871468:
                    case 1391423717:
                        if (C0619.f2439) {
                            iM3169 = C0619.m2761("ܳۛ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6189) ^ 302369553;
                            i = 113800882;
                        } else {
                            iM3169 = (C0619.m2761("ᩴܽ") + i5) * 65;
                            i6 = ((iM3169 ^ i4) * 27373) ^ 1406597254;
                            i = 1312678790;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1422131919:
                    case 695152757:
                        c5817 = this.f18802;
                        c5817.stopScroll();
                        if (c5817.isComputingLayout()) {
                            iM3169 = (C0619.m2761("ۛۙ") + i4) * (-99);
                            i6 = ((iM3169 ^ i5) * (-27691)) ^ (-548333444);
                            i = 1834164109;
                        } else {
                            iM3169 = C0619.m2761("ۧᩴ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 15517) ^ (-747352847);
                            i = -2025929857;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1274595932:
                    case -711351793:
                        AbstractC3624.m11755();
                        if (C2375.f7641 > 0) {
                        }
                        iM3169 = C0619.m2761("ܳۛ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 6189) ^ 302369553;
                        i = 113800882;
                        i8 = iM3169 ^ i;
                        break;
                    case -1262195895:
                    case -1180517423:
                        i2 = this.f18803;
                        if (C1783.f6087 <= 0) {
                            iM3169 = (C0619.m2761("᩹۠") + i5) * 7;
                            i6 = ((iM3169 ^ i4) * 1761) ^ (-292461582);
                            i = 1260288372;
                        } else {
                            iM3169 = (C0773.m3169("ᩴ᩹") + i4) * (-45);
                            i6 = ((iM3169 ^ i5) * (-23089)) ^ 2005903240;
                            i = -134664101;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1195719543:
                    case 648222969:
                        if (C1826.m6301() >= 0) {
                            iM3169 = (C0619.m2761("᩹۠") + i5) * 7;
                            i6 = ((iM3169 ^ i4) * 1761) ^ (-292461582);
                            i = 1260288372;
                        } else {
                            iM3169 = C0773.m3169("᩶᩵") ^ i4;
                            i6 = ((iM3169 ^ i5) * 30361) ^ 1120920308;
                            i = -1858298242;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1108348708:
                    case -436654676:
                        C2287.m7745();
                        if (C2878.f9462) {
                            iM3169 = C0619.m2761("ܳۛ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6189) ^ 302369553;
                            i = 113800882;
                        } else {
                            iM3169 = C0773.m3169("ۛܶ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-11849)) ^ (-1660036006);
                            i = -2129708987;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1053712698:
                    case 1287685424:
                        c5817.post(runnableC9678);
                        break;
                    case -780174834:
                    case -391033598:
                        if (C1343.m4943()) {
                            iM3169 = C0773.m3169("ܽۧ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-7545)) ^ (-1409728688);
                            i = 362390116;
                        } else {
                            iM3169 = C0773.m3169("ۛܶ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-11849)) ^ (-1660036006);
                            i = -2129708987;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -475944856:
                    case 1059162171:
                        if (i2 != C23522.m52716()) {
                            iM3169 = C0773.m3169("ܶܳ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 14137) ^ (-41587011);
                            i = -157902329;
                        } else {
                            iM3169 = C0619.m2761("ܺᩴ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 26667) ^ 1890559866;
                            i = -1189288088;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -174044229:
                    case 854333715:
                        runnableC9678.run();
                        iM3169 = C0619.m2761("ܺᩴ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 26667) ^ 1890559866;
                        i = -1189288088;
                        i8 = iM3169 ^ i;
                        break;
                    case 83189226:
                    case 1951852563:
                        C2878.m9491();
                        C4282.m13644();
                        iM3169 = C0773.m3169("ۛܶ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-11849)) ^ (-1660036006);
                        i = -2129708987;
                        i8 = iM3169 ^ i;
                        break;
                    case 431354317:
                    case 728070004:
                        if (RunnableC3646.m11813() != 0) {
                            iM3169 = C0773.m3169("ܽۙ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 12207) ^ (-448782348);
                            i = 1397684153;
                        } else {
                            iM3169 = (i4 - C0773.m3169("᩸ۘ")) * (-53);
                            i6 = ((iM3169 ^ i5) * (-10085)) ^ 101133374;
                            i = -43611286;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 934862551:
                    case 1057375648:
                        C2419.m8174();
                        C0862.m3503();
                        break;
                    default:
                        runnable = new Runnable() { // from class: l.֨᩹֫
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5360.m16007(this.f5138);
                            }
                        };
                        if (C2419.f7754 >= 0) {
                            iM3169 = C0619.m2761("ܳۛ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6189) ^ 302369553;
                            i = 113800882;
                        } else {
                            iM3169 = C0619.m2761("᩶ᩳ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-18919)) ^ 840332921;
                            i = 1023705347;
                        }
                        i8 = iM3169 ^ i;
                        break;
                }
                return;
            }
            iM2761 = C0773.m3169("ܶۙ") ^ i4;
            i6 = ((iM2761 ^ i5) * 14363) ^ 891672790;
            i7 = 215612619;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16009(C5360 c5360, Runnable runnable) {
        int i = 1076436526;
        int i2 = C0487.f2131;
        int i3 = AbstractC0116.f1064;
        int iM2761 = (i3 - C0619.m2761("֫ܶ")) * 101;
        int i4 = ((iM2761 ^ i2) * 27287) ^ 123300382;
        int i5 = -1486778300;
        while (true) {
            i = ((((i ^ i2) * (-20857)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1944493269:
                case 1101966481:
                    C3033.m9845();
                    break;
                case -1930497085:
                case -1926850024:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("ܽܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15975)) ^ (-1532058661);
                        i5 = -1482412968;
                    } else {
                        iM2761 = C0773.m3169("ۛܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2115) ^ 846674914;
                        i5 = 1669441486;
                    }
                    break;
                case -1850370119:
                case 52505338:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("᩸۟") ^ i3) * 27;
                        i4 = ((iM2761 ^ i2) * 21597) ^ 2041555076;
                        i5 = -1765729812;
                    } else {
                        iM2761 = (C0773.m3169("ܰ᩹") + i3) * (-21);
                        i4 = ((iM2761 ^ i2) * 23847) ^ 681217142;
                        i5 = -1212418587;
                    }
                    break;
                case -1684870058:
                case -1084013516:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("᩸۟") ^ i3) * 27;
                        i4 = ((iM2761 ^ i2) * 21597) ^ 2041555076;
                        i5 = -1765729812;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩺") ^ i3) * (-29);
                        i4 = ((iM2761 ^ i2) * 5257) ^ 1379813883;
                        i5 = 1157641577;
                    }
                    break;
                case -1422337995:
                case -417529631:
                    C1826.m6301();
                    iM2761 = (C0773.m3169("ۖ᩶") + i2) * (-5);
                    i4 = ((iM2761 ^ i3) * (-19309)) ^ (-2127132218);
                    i5 = 115185539;
                    break;
                case -1328182046:
                case 567357871:
                    C0487.m2356();
                    if (C2287.m7745() <= 0) {
                        iM2761 = (C0619.m2761("ۘۘ") + i3) * 79;
                        i4 = ((iM2761 ^ i2) * 28829) ^ (-1713480968);
                        i5 = -286574031;
                    } else {
                        iM2761 = (C0773.m3169("ۖ᩶") + i2) * (-5);
                        i4 = ((iM2761 ^ i3) * (-19309)) ^ (-2127132218);
                        i5 = 115185539;
                    }
                    break;
                case -992360844:
                case 1738506678:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0619.m2761("᩸۟") ^ i3) * 27;
                        i4 = ((iM2761 ^ i2) * 21597) ^ 2041555076;
                        i5 = -1765729812;
                    } else {
                        iM2761 = (C0619.m2761("ܿ᩵") + i2) * 115;
                        i4 = ((iM2761 ^ i3) * 18719) ^ 575752648;
                        i5 = 925957790;
                    }
                    break;
                case -852415766:
                case 432958644:
                    C3033.m9852(c5360.f18804);
                    break;
                case -845604003:
                case 607185450:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ۖ᩶") + i2) * (-5);
                        i4 = ((iM2761 ^ i3) * (-19309)) ^ (-2127132218);
                        i5 = 115185539;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20467) ^ 1497274550;
                        i5 = -357838858;
                    }
                    break;
                case -827458994:
                case -671847503:
                    if (C1080.m4050()) {
                        iM2761 = (C0619.m2761("ᩴ۟") ^ i2) * 29;
                        i4 = ((iM2761 ^ i3) * (-30725)) ^ (-1537028094);
                        i5 = 722908996;
                    } else {
                        iM2761 = C0773.m3169("ܽܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15975)) ^ (-1532058661);
                        i5 = -1482412968;
                    }
                    break;
                case -266970780:
                case 948985905:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0619.m2761("᩸۟") ^ i3) * 27;
                        i4 = ((iM2761 ^ i2) * 21597) ^ 2041555076;
                        i5 = -1765729812;
                    } else {
                        iM2761 = C0619.m2761("ۚ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27219) ^ 1929016332;
                        i5 = -739619512;
                    }
                    break;
                case -102571787:
                case 1546261036:
                    C4238.m13540();
                    if (C2419.f7754 < 0) {
                        iM2761 = C0773.m3169("ܽܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15975)) ^ (-1532058661);
                        i5 = -1482412968;
                    } else {
                        iM2761 = (C0619.m2761("ۘۘ") + i3) * 79;
                        i4 = ((iM2761 ^ i2) * 28829) ^ (-1713480968);
                        i5 = -286574031;
                    }
                    break;
                case -36018341:
                case 1762197966:
                    if (C11235.m28309() != 0) {
                        iM2761 = C0773.m3169("ܽܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15975)) ^ (-1532058661);
                        i5 = -1482412968;
                    } else {
                        iM2761 = C0619.m2761("۬᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20549)) ^ (-1801023557);
                        i5 = 790894170;
                    }
                    break;
                case 791248289:
                case 1042060950:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0619.m2761("᩸۟") ^ i3) * 27;
                        i4 = ((iM2761 ^ i2) * 21597) ^ 2041555076;
                        i5 = -1765729812;
                    } else {
                        iM2761 = (C0773.m3169("ۖ᩶") + i2) * (-5);
                        i4 = ((iM2761 ^ i3) * (-19309)) ^ (-2127132218);
                        i5 = 115185539;
                    }
                    break;
                case 945135692:
                case 1470649561:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("ܽܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15975)) ^ (-1532058661);
                        i5 = -1482412968;
                    } else {
                        iM2761 = (C0773.m3169("ۖᩴ") ^ i3) * (-79);
                        i4 = ((iM2761 ^ i2) * (-25747)) ^ 809405201;
                        i5 = 721570555;
                    }
                    break;
                default:
                    C2023.m6957(runnable);
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7315) ^ 1192101598;
                        i5 = 945345806;
                    } else {
                        iM2761 = C0773.m3169("ۤ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25861)) ^ 2143323030;
                        i5 = 247461840;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16019(RunnableC6697 runnableC6697) {
        this.f18801 = runnableC6697;
    }
}
