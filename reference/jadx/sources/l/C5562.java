package l;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.PrintStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5562 implements TextWatcher {

    /* JADX INFO: renamed from: ۫ܳ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f19306 = {2981, 29149, 29149, 29094, 29089, 29070, 29127, 29088, 29142, 29104, 29113, 29128, 29149, 28970, 29104, 29113, 29128, 29149, 21479, 29102, 29109, 29116, 29132, 29149, 28970, 29102, 29109, 29116, 29132, 29149, 21479, 29070, 29084, 29075, 29070, 29136, 29070, 29080, 29071, 29076, 29083, 29102, 29109, 29116, 29135, 29128, 29131, 29149, 28970, 29102, 29109, 29116, 29135, 29128, 29131, 29149, 21479, 29122, 29109, 29116, 29102, 29109, 29149, 21479, 29118, 29103, 29118, 29134, 29135, 29149, 21479};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f19307;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f19308;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16748 f19309;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f19310;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f19311;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f19312;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 1113146125;
        int i5 = C0773.f2792;
        int i6 = C3734.f12817;
        int iM3169 = C0773.m3169("ܺܳ") ^ i5;
        int i7 = ((iM3169 ^ i6) * 27581) ^ 211625774;
        int i8 = -488964706;
        while (true) {
            i4 = ((((i4 ^ i6) * 7357) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2039851951:
                case -1637590524:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ۡܳ") + i6) * (-23);
                        i7 = ((iM3169 ^ i5) * (-10603)) ^ 1072062792;
                        i8 = -1706857335;
                    } else {
                        iM3169 = C0773.m3169("᩶᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-1831)) ^ 2077866894;
                        i8 = -1196695330;
                    }
                    break;
                case -1874566642:
                case -215528603:
                    if (C1146.m4231()) {
                        iM3169 = (C0773.m3169("᩶ۚ") ^ i6) * (-111);
                        i7 = ((iM3169 ^ i5) * (-24181)) ^ (-1746297159);
                        i8 = -1036199191;
                    } else {
                        iM3169 = C0619.m2761("ۜۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-21269)) ^ (-1214786206);
                        i8 = -238071374;
                    }
                    break;
                case -1585555513:
                case -202037069:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("۠᩷") ^ i5;
                        i7 = ((iM3169 ^ i6) * 19663) ^ (-68235282);
                        i8 = 1482290663;
                    } else {
                        iM3169 = C0773.m3169("ۘܽ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15017) ^ (-1748619458);
                        i8 = 1212942730;
                    }
                    break;
                case -1532765418:
                case -496935591:
                    if (C1783.f6087 > 0) {
                        iM3169 = C0619.m2761("ۜۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-21269)) ^ (-1214786206);
                        i8 = -238071374;
                    } else {
                        iM3169 = (C0773.m3169("ۜۢ") + i5) * 101;
                        i7 = ((iM3169 ^ i6) * (-11439)) ^ (-1428931520);
                        i8 = 1553020950;
                    }
                    break;
                case -1499115100:
                case 1684927413:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ܳۧ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 8957) ^ (-125362757);
                        i8 = 833876923;
                    } else {
                        iM3169 = C0773.m3169("᩵۟") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-6223)) ^ (-860740714);
                        i8 = 1395362136;
                    }
                    break;
                case -1425251099:
                case 687123277:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0773.m3169("۠᩷") ^ i5;
                        i7 = ((iM3169 ^ i6) * 19663) ^ (-68235282);
                        i8 = 1482290663;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܳᩴ")) * 19;
                        i7 = ((iM3169 ^ i6) * 23161) ^ (-74574200);
                        i8 = -438460883;
                    }
                    break;
                case -1424757353:
                case 565627643:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۜۢ") + i5) * 101;
                        i7 = ((iM3169 ^ i6) * (-11439)) ^ (-1428931520);
                        i8 = 1553020950;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩸") + i6) * 77;
                        i7 = ((iM3169 ^ i5) * (-29957)) ^ 1276811637;
                        i8 = -439265083;
                    }
                    break;
                case -1082028624:
                case 19592106:
                    C2966.m9664();
                    if (!C2878.f9462) {
                        iM3169 = C0773.m3169("۠᩷") ^ i5;
                        i7 = ((iM3169 ^ i6) * 19663) ^ (-68235282);
                        i8 = 1482290663;
                    } else {
                        iM3169 = C0773.m3169("ܳۧ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 8957) ^ (-125362757);
                        i8 = 833876923;
                    }
                    break;
                case -902375755:
                case 1719547705:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ۜۢ") + i5) * 101;
                        i7 = ((iM3169 ^ i6) * (-11439)) ^ (-1428931520);
                        i8 = 1553020950;
                    } else {
                        iM3169 = C0619.m2761("ܶܿ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-2693)) ^ (-1608561941);
                        i8 = -1109097667;
                    }
                    break;
                case -581165994:
                case 1799944021:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ۜۢ") + i5) * 101;
                        i7 = ((iM3169 ^ i6) * (-11439)) ^ (-1428931520);
                        i8 = 1553020950;
                    } else {
                        iM3169 = C0619.m2761("᩺ۢ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30625)) ^ (-1856109456);
                        i8 = -1726726896;
                    }
                    break;
                case -381917947:
                case -343887080:
                    break;
                case 8635097:
                case 1692353675:
                    C1519.m5403();
                    RunnableC1848.m6360();
                    iM3169 = (C0773.m3169("ۜۢ") + i5) * 101;
                    i7 = ((iM3169 ^ i6) * (-11439)) ^ (-1428931520);
                    i8 = 1553020950;
                    break;
                case 201836545:
                case 239115065:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ۡܳ") + i6) * (-23);
                        i7 = ((iM3169 ^ i5) * (-10603)) ^ 1072062792;
                        i8 = -1706857335;
                    } else {
                        iM3169 = (i5 - C0619.m2761("۬ۚ")) * (-95);
                        i7 = ((iM3169 ^ i6) * (-15443)) ^ (-279333785);
                        i8 = -1677470205;
                    }
                    break;
                case 519422061:
                case 864607566:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("۠᩷") ^ i5;
                        i7 = ((iM3169 ^ i6) * 19663) ^ (-68235282);
                        i8 = 1482290663;
                    } else {
                        iM3169 = (C0773.m3169("ۡ᩵") ^ i5) * 53;
                        i7 = ((iM3169 ^ i6) * (-23347)) ^ 384626988;
                        i8 = 464199366;
                    }
                    break;
                case 950046479:
                case 1682771613:
                    C3998.m12920();
                    break;
                default:
                    C0619.m2763();
                    if (C0773.m3161() != 0) {
                        iM3169 = C0773.m3169("ܳۧ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 8957) ^ (-125362757);
                        i8 = 833876923;
                    } else {
                        iM3169 = (C0773.m3169("ۜۢ") + i5) * 101;
                        i7 = ((iM3169 ^ i6) * (-11439)) ^ (-1428931520);
                        i8 = 1553020950;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 656678950;
        int i5 = C1826.f6190;
        int i6 = C3492.f12043;
        int iM2761 = (C0619.m2761("᩷ܶ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i7 = ((iM2761 ^ i6) * (-30365)) ^ (-1077570247);
        int i8 = 1161496268;
        while (true) {
            i4 = ((((i4 ^ i6) * (-18741)) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2047648298:
                case -1202521738:
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("ܳۡ") + i5) * (-69);
                        i7 = ((iM2761 ^ i6) * (-15623)) ^ (-1512491002);
                        i8 = 2079501368;
                    } else {
                        iM2761 = C0773.m3169("ܽۖ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-24113)) ^ (-1935370661);
                        i8 = -813466707;
                    }
                    break;
                case -1995522073:
                case -1983137626:
                    break;
                case -1632788101:
                case 1255546923:
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("᩸ܽ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM2761 ^ i6) * 8025) ^ (-1083164046);
                        i8 = 2077140155;
                    } else {
                        iM2761 = (C0619.m2761("ۢ᩹") ^ i5) * (-113);
                        i7 = ((iM2761 ^ i6) * 10063) ^ (-1224137738);
                        i8 = -7900873;
                    }
                    break;
                case -1394066952:
                case -245895593:
                    C1080.m4050();
                    if (C1542.f5343 > 0) {
                        iM2761 = (C0773.m3169("ܳۡ") + i5) * (-69);
                        i7 = ((iM2761 ^ i6) * (-15623)) ^ (-1512491002);
                        i8 = 2079501368;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ۨۧ")) * 31;
                        i7 = ((iM2761 ^ i5) * (-16411)) ^ (-939086215);
                        i8 = 1839908642;
                    }
                    break;
                case -1386777481:
                case 308289857:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ܳۡ") + i5) * (-69);
                        i7 = ((iM2761 ^ i6) * (-15623)) ^ (-1512491002);
                        i8 = 2079501368;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩻") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-15913)) ^ (-1876683278);
                        i8 = 1495290850;
                    }
                    break;
                case -1240879921:
                case -1128963961:
                    C3448.m11248();
                    C2354.m7983();
                    break;
                case -1143886447:
                case 1548474718:
                    if (C2310.m7813() <= 0) {
                        iM2761 = (C0773.m3169("ᩴ֫") ^ i6) * 43;
                        i7 = ((iM2761 ^ i5) * 30017) ^ (-1903606597);
                        i8 = 1545329777;
                    } else {
                        iM2761 = C0619.m2761("ۚۢ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-19227)) ^ (-92127084);
                        i8 = 1472329919;
                    }
                    break;
                case -1031266531:
                case -207113673:
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("᩸ܽ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM2761 ^ i6) * 8025) ^ (-1083164046);
                        i8 = 2077140155;
                    } else {
                        iM2761 = (C0773.m3169("ۘ᩷") ^ i6) * q.h;
                        i7 = ((iM2761 ^ i5) * 23197) ^ 1433758819;
                        i8 = 302163849;
                    }
                    break;
                case -868129460:
                case 1192329262:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0773.m3169("᩸ܽ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM2761 ^ i6) * 8025) ^ (-1083164046);
                        i8 = 2077140155;
                    } else {
                        iM2761 = (i6 - C0773.m3169("۬ܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM2761 ^ i5) * (-16387)) ^ (-309687324);
                        i8 = -1764208903;
                    }
                    break;
                case -596311971:
                case 1879529375:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ܳۡ") + i5) * (-69);
                        i7 = ((iM2761 ^ i6) * (-15623)) ^ (-1512491002);
                        i8 = 2079501368;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩹") + i5) * 81;
                        i7 = ((iM2761 ^ i6) * 22553) ^ 1609960997;
                        i8 = 1459971618;
                    }
                    break;
                case -460427155:
                case 1621420607:
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("᩸ܽ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM2761 ^ i6) * 8025) ^ (-1083164046);
                        i8 = 2077140155;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۢᩴ")) * q.h;
                        i7 = ((iM2761 ^ i6) * 16953) ^ 1449567530;
                        i8 = -1892394227;
                    }
                    break;
                case 106500187:
                case 943780077:
                    C3077.m10041();
                    C2287.m7745();
                    iM2761 = (C0773.m3169("ܳۡ") + i5) * (-69);
                    i7 = ((iM2761 ^ i6) * (-15623)) ^ (-1512491002);
                    i8 = 2079501368;
                    break;
                case 124321364:
                case 1884549784:
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-27157)) ^ 185070884;
                        i8 = 98177205;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ֫") ^ i6) * 43;
                        i7 = ((iM2761 ^ i5) * 30017) ^ (-1903606597);
                        i8 = 1545329777;
                    }
                    break;
                case 933962620:
                case 1631328662:
                    RunnableC3055.m9933();
                    if (C3099.f10023 > 0) {
                        iM2761 = (C0773.m3169("ᩴ֫") ^ i6) * 43;
                        i7 = ((iM2761 ^ i5) * 30017) ^ (-1903606597);
                        i8 = 1545329777;
                    } else {
                        iM2761 = (C0773.m3169("ܳۡ") + i5) * (-69);
                        i7 = ((iM2761 ^ i6) * (-15623)) ^ (-1512491002);
                        i8 = 2079501368;
                    }
                    break;
                case 1503724929:
                case 1797871686:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-27157)) ^ 185070884;
                        i8 = 98177205;
                    } else {
                        iM2761 = C0773.m3169("ۜۗ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 9507) ^ 643210677;
                        i8 = -1502742655;
                    }
                    break;
                default:
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("᩸ܽ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM2761 ^ i6) * 8025) ^ (-1083164046);
                        i8 = 2077140155;
                    } else {
                        iM2761 = C0619.m2761("ۖ۬") ^ i6;
                        i7 = ((iM2761 ^ i5) * 7573) ^ 110779146;
                        i8 = -143116686;
                    }
                    break;
            }
            return;
        }
    }

    public C5562(TextView textView, String str, String str2, String str3, String str4, C16748 c16748) {
        int i = -1590345412;
        int i2 = C2354.f7599;
        int i3 = C2287.f7432;
        int iM2761 = (i3 - C0619.m2761("᩷᩶")) * (-25);
        int i4 = ((iM2761 ^ i2) * 2423) ^ 1774387997;
        int i5 = -1886556214;
        while (true) {
            i = ((((i ^ i2) * (-15967)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2062545855:
                case 406766622:
                    if (C2354.m7983()) {
                        iM2761 = (C0773.m3169("ۚۤ") + i3) * (-45);
                        i4 = ((iM2761 ^ i2) * 9091) ^ (-462953929);
                        i5 = -967121262;
                    } else {
                        iM2761 = (C0773.m3169("ۨۢ") + i2) * 55;
                        i4 = ((iM2761 ^ i3) * 26655) ^ 651978679;
                        i5 = 1251604217;
                    }
                    break;
                case -1895020830:
                case -1720961068:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("ܽ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8021)) ^ (-206799305);
                        i5 = 534258361;
                    } else {
                        iM2761 = (C0773.m3169("ܳۧ") + i3) * (-27);
                        i4 = ((iM2761 ^ i2) * 5823) ^ 180456486;
                        i5 = 420771822;
                    }
                    break;
                case -1613805974:
                case 2122228636:
                    RunnableC1848.m6360();
                    C1343.m4943();
                    iM2761 = (C0773.m3169("۠ۨ") + i2) * 93;
                    i4 = ((iM2761 ^ i3) * (-11597)) ^ 403186090;
                    i5 = 1068112091;
                    break;
                case -1409559915:
                case 1090901829:
                    if (!RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("۠ۨ") + i2) * 93;
                        i4 = ((iM2761 ^ i3) * (-11597)) ^ 403186090;
                        i5 = 1068112091;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8021)) ^ (-206799305);
                        i5 = 534258361;
                    }
                    break;
                case -1177622826:
                case -272022845:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۨۢ") + i2) * 55;
                        i4 = ((iM2761 ^ i3) * 26655) ^ 651978679;
                        i5 = 1251604217;
                    } else {
                        iM2761 = C0773.m3169("֫ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2721) ^ 408793489;
                        i5 = -1226727764;
                    }
                    break;
                case -1108849925:
                case 552882599:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("ۨ֨") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-10713)) ^ 168682427;
                        i5 = -591960296;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۡᩴ")) * 13;
                        i4 = ((iM2761 ^ i3) * 6235) ^ (-1427542267);
                        i5 = -317016337;
                    }
                    break;
                case -820834325:
                case -242668756:
                    this.f19311 = textView;
                    this.f19310 = str;
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0773.m3169("ۨ֨") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-10713)) ^ 168682427;
                        i5 = -591960296;
                    } else {
                        iM2761 = C0619.m2761("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16587)) ^ (-564237703);
                        i5 = 527397912;
                    }
                    break;
                case -704074138:
                case 1686005535:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("ۨ֨") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-10713)) ^ 168682427;
                        i5 = -591960296;
                    } else {
                        iM2761 = C0773.m3169("ۖۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4407) ^ (-237898263);
                        i5 = -391574813;
                    }
                    break;
                case -602072600:
                case 764587900:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("ۨ֨") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-10713)) ^ 168682427;
                        i5 = -591960296;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۨܳ")) * (-15);
                        i4 = ((iM2761 ^ i3) * 2045) ^ (-1041219771);
                        i5 = -1976947236;
                    }
                    break;
                case -419945767:
                case 1313370463:
                    C1542.m5459();
                    if (C2966.m9664()) {
                        iM2761 = (C0773.m3169("ۨ֨") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-10713)) ^ 168682427;
                        i5 = -591960296;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩻ۨ")) * 45;
                        i4 = ((iM2761 ^ i3) * 23827) ^ (-1035537198);
                        i5 = 1790733669;
                    }
                    break;
                case -324260404:
                case 1757302328:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ܽ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8021)) ^ (-206799305);
                        i5 = 534258361;
                    } else {
                        iM2761 = C0619.m2761("۬᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4559) ^ (-1552609805);
                        i5 = 359724252;
                    }
                    break;
                case 4606505:
                case 32343904:
                    this.f19312 = str2;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("ۨۢ") + i2) * 55;
                        i4 = ((iM2761 ^ i3) * 26655) ^ 651978679;
                        i5 = 1251604217;
                    } else {
                        iM2761 = C0773.m3169("᩸ᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7093)) ^ 1224343757;
                        i5 = -1872313098;
                    }
                    break;
                case 168429322:
                case 1285124323:
                    C3779.m12264();
                    throw new RuntimeException();
                case 275911684:
                case 1392305023:
                    this.f19307 = str3;
                    this.f19308 = str4;
                    this.f19309 = c16748;
                    return;
                case 747713933:
                case 922138199:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("۠ۨ") + i2) * 93;
                        i4 = ((iM2761 ^ i3) * (-11597)) ^ 403186090;
                        i5 = 1068112091;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7783)) ^ (-1867221271);
                        i5 = -1108189712;
                    }
                    break;
                default:
                    if (C2702.f8586 > 0) {
                        iM2761 = (C0773.m3169("ۨ֨") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-10713)) ^ 168682427;
                        i5 = -591960296;
                    } else {
                        iM2761 = (C0773.m3169("۠ۨ") + i2) * 93;
                        i4 = ((iM2761 ^ i3) * (-11597)) ^ 403186090;
                        i5 = 1068112091;
                    }
                    break;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        TextView textView;
        PrintStream printStream;
        int iM2761;
        int i;
        int i2;
        String str3;
        int i3;
        int iM2762;
        int i4;
        int iM3169;
        int i5;
        String strM1237;
        int i6;
        int i7;
        int iM2763;
        int i8;
        Integer numM3159;
        int iM2764;
        int i9;
        int i10;
        int iM2765;
        int i11;
        int i12;
        int i13;
        int i14;
        String str4;
        TextView textView2;
        PrintStream printStream2;
        short[] sArr;
        int i15;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilderM11803;
        int iM2766;
        int i16;
        int i17;
        int i18;
        PrintStream printStream3;
        String str5;
        String str6;
        int iM31610;
        int i19;
        int i20;
        int i21;
        int iM31611;
        int i22;
        int iM31612;
        int i23;
        int i24;
        int iM2767;
        int i25;
        int i26;
        int iM2768;
        int i27;
        C5562 c5562 = this;
        int i28 = 0;
        int i29 = 1363844957;
        int i30 = C3690.f12684;
        int i31 = C1542.f5343;
        int iM2769 = C0619.m2761("ۢۙ") ^ i30;
        int i32 = ((iM2769 ^ i31) * 6549) ^ 1536058902;
        int i33 = iM2769 ^ (-1280372929);
        String strM6952 = null;
        String str7 = null;
        PrintStream printStream4 = null;
        String str8 = null;
        ForegroundColorSpan foregroundColorSpan = null;
        String strM53420 = null;
        C16748 c16748 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int iM6305 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        char c = 0;
        int i37 = 0;
        short s = 0;
        int i38 = 0;
        String str9 = null;
        SpannableStringBuilder spannableStringBuilder2 = null;
        SpannableStringBuilder spannableStringBuilder3 = null;
        String strM5463 = null;
        String str10 = null;
        TypefaceSpan typefaceSpan = null;
        String str11 = null;
        Integer num = null;
        TextView textView3 = null;
        int iM28315 = 0;
        int i39 = 0;
        int iM9671 = 0;
        String str12 = null;
        int i40 = 0;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i31) * (-30763)) >> 31));
            switch (i29) {
                case -2112619858:
                case -680903932:
                    String str13 = str12;
                    if (C3492.m11490(strM5463, str13)) {
                        iM31612 = C0773.m3169("ᩴ᩶") ^ i31;
                        i23 = ((iM31612 ^ i30) * (-31435)) ^ 1646266615;
                        i24 = 1992627108;
                    } else {
                        iM31612 = (C0773.m3169("ۛܺ") + i30) * 73;
                        i23 = ((iM31612 ^ i31) * 15983) ^ (-669949088);
                        i24 = 380158375;
                    }
                    i21 = iM31612 ^ i24;
                    str12 = str13;
                    i32 = i23;
                    str6 = str11;
                    i33 = i21;
                    str11 = str6;
                    break;
                case -2102296783:
                case -2001833302:
                    str3 = str11;
                    String str14 = str10;
                    i3 = i37;
                    if (!C3492.m11490(strM5463, str14)) {
                        str10 = str14;
                        iM2762 = C0619.m2761("۫᩶") ^ i30;
                        i = ((iM2762 ^ i31) * (-17663)) ^ 892906162;
                        i4 = -1612942086;
                        i6 = iM2762 ^ i4;
                        i37 = i3;
                        str11 = str3;
                        i33 = i6;
                        i32 = i;
                    } else {
                        iM3169 = C0773.m3169("۫۟") ^ i31;
                        str10 = str14;
                        i32 = ((iM3169 ^ i30) * (-8111)) ^ (-139044076);
                        i5 = 1837794443;
                        i7 = iM3169 ^ i5;
                        i37 = i3;
                        str11 = str3;
                        i33 = i7;
                    }
                    break;
                case -2098243396:
                case 1139026173:
                    C17202.m40381(spannableStringBuilder3, typefaceSpan, i40, C3998.m12919(spannableStringBuilder3), i34);
                    C2354.m7978(textView3, spannableStringBuilder3);
                    break;
                case -2086884627:
                case 757675429:
                    iM6305 = iM6305;
                    if (C11730.m29453(str11)) {
                        iM2763 = C0619.m2761("ܽ֨") ^ i31;
                        i = ((iM2763 ^ i30) * 28727) ^ 1959302679;
                        i8 = 1061769094;
                    } else {
                        iM2763 = (i30 - C0773.m3169("ۧ᩹")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2763 ^ i31) * 13711) ^ (-277233600);
                        i8 = -1371697174;
                    }
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -1993811620:
                case -1928308234:
                    if (C1564.m5509() > 0) {
                        str11 = str11;
                        spannableStringBuilderM11803 = spannableStringBuilder3;
                        strM6952 = strM6952;
                        str7 = str7;
                        printStream2 = printStream4;
                        str4 = str9;
                        sArr = sArr3;
                        i15 = i38;
                        textView2 = textView3;
                        spannableStringBuilder = spannableStringBuilder2;
                        int iM27610 = C0619.m2761("ۛ۫") ^ i30;
                        SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder;
                        sArr3 = sArr;
                        i38 = i15;
                        str9 = str4;
                        i32 = ((iM27610 ^ i31) * (-23309)) ^ 2099097015;
                        spannableStringBuilder3 = spannableStringBuilderM11803;
                        textView3 = textView2;
                        str11 = str11;
                        i33 = iM27610 ^ (-1711673145);
                        printStream4 = printStream2;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        str7 = str7;
                        strM6952 = strM6952;
                    } else {
                        str3 = str11;
                        printStream3 = printStream4;
                        str5 = str9;
                        int iM27611 = C0619.m2761("ۜۛ") ^ i31;
                        TextView textView4 = textView3;
                        int i41 = ((iM27611 ^ i30) * 26159) ^ 854952806;
                        i7 = iM27611 ^ 498868044;
                        str9 = str5;
                        i32 = i41;
                        textView3 = textView4;
                        printStream4 = printStream3;
                        str11 = str3;
                        i33 = i7;
                    }
                    break;
                case -1923313048:
                case 897818601:
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    strM6952 = strM6952;
                    str7 = str7;
                    printStream4 = printStream4;
                    str9 = str9;
                    s = s;
                    i38 = i38;
                    textView3 = textView3;
                    sArr2 = f19306;
                    c = 0;
                    if (C4238.f15451 >= 0) {
                        int iM27612 = C0619.m2761("᩸ۤ") ^ i30;
                        int i42 = ((iM27612 ^ i31) * (-5137)) ^ (-7491386);
                        i12 = iM27612 ^ 1851602335;
                        s = s;
                        i32 = i42;
                        textView3 = textView3;
                        typefaceSpan = null;
                    } else {
                        iM2764 = C0619.m2761("᩻ۧ") ^ i30;
                        i9 = ((iM2764 ^ i31) * (-19455)) ^ 345647883;
                        i10 = 264464095;
                        i12 = iM2764 ^ i10;
                        s = s;
                        i32 = i9;
                        textView3 = textView3;
                    }
                    i38 = i38;
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    str9 = str9;
                    i33 = i12;
                    printStream4 = printStream4;
                    c5562 = this;
                    str7 = str7;
                    strM6952 = strM6952;
                    break;
                case -1805709111:
                case 1325019683:
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    strM6952 = strM6952;
                    str7 = str7;
                    printStream4 = printStream4;
                    i38 = i38;
                    int iM3509 = C0862.m3509(editable);
                    textView3 = c5562.f19311;
                    str9 = c5562.f19310;
                    if (iM3509 == 0) {
                        int iM31613 = C0773.m3169("ᩳۜ") ^ i30;
                        i33 = iM31613 ^ 765086090;
                        i32 = ((iM31613 ^ i31) * 18047) ^ (-940962735);
                    } else {
                        int iM31614 = (C0773.m3169("۬֫") + i31) * 85;
                        i32 = ((iM31614 ^ i30) * 17819) ^ 1074880186;
                        i33 = iM31614 ^ 858437702;
                    }
                    c5562 = this;
                    break;
                case -1664912309:
                case 480829702:
                    iM6305 = iM6305;
                    strM53420 = C23916.m53420(f19306, 57, 1, i39);
                    if (num != null) {
                        iM2763 = (C0619.m2761("֡ۧ") + i31) * (-93);
                        i = ((iM2763 ^ i30) * 6129) ^ 729327435;
                        i8 = 1318369459;
                    } else {
                        iM2763 = (i30 - C0619.m2761("ܰ۫")) * 31;
                        i = ((iM2763 ^ i31) * (-19583)) ^ 925929690;
                        i8 = -448464869;
                    }
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -1640109316:
                case 984182278:
                    C1146.m4232(spannableStringBuilder3, C0487.m2361(f19306, 41, 8, i39));
                    i37 = C3296.f10774;
                    iM6305 = iM6305;
                    str11 = str11;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case -1590704783:
                case 1793524068:
                    C1146.m4232(spannableStringBuilder3, RunnableC1848.m6366(f19306, 19, 6, i39));
                    i26 = C3296.f10774;
                    i37 = i26;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case -1579457587:
                case -37865577:
                    str11 = str11;
                    int iM9672 = C2966.m9671(strM5463);
                    String str15 = c5562.f19307;
                    if (iM9672 == C2966.m9671(str15)) {
                        iM31611 = (C0773.m3169("᩵ܽ") + i31) * (-49);
                        i13 = ((iM31611 ^ i30) * 31283) ^ 737072703;
                        i22 = 1897572253;
                    } else {
                        iM31611 = (C0773.m3169("ܰۙ") + i30) * 55;
                        i13 = ((iM31611 ^ i31) * (-20101)) ^ (-1129904965);
                        i22 = 1156240617;
                    }
                    i14 = iM31611 ^ i22;
                    str10 = str15;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case -1546087591:
                case 2021069679:
                    if (!C2966.m9664()) {
                        str11 = str11;
                        strM6952 = strM6952;
                        str = str7;
                        str2 = str9;
                        PrintStream printStream5 = printStream4;
                        textView = textView3;
                        printStream = printStream5;
                        int iM27613 = C0619.m2761("ۧۗ") ^ i31;
                        String str16 = str2;
                        i32 = ((iM27613 ^ i30) * (-22395)) ^ 1778816425;
                        i18 = iM27613 ^ (-1687053515);
                        str7 = str;
                        str9 = str16;
                        strM6952 = strM6952;
                        TextView textView5 = textView;
                        printStream4 = printStream;
                        textView3 = textView5;
                        String str17 = str11;
                        i33 = i18;
                        str11 = str17;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۗ") ^ i31) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i30) * 31251) ^ (-1147091095);
                        i2 = 1717292811;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    }
                    break;
                case -1522088635:
                case 1626354208:
                    str11 = str11;
                    strM6952 = strM6952;
                    str4 = str9;
                    PrintStream printStream6 = printStream4;
                    textView2 = textView3;
                    String str18 = str7;
                    printStream2 = printStream6;
                    str7 = str18;
                    sArr = sArr3;
                    int i43 = i38;
                    String strM9847 = C3033.m9847(sArr, i43, 2, i39);
                    i15 = i43;
                    spannableStringBuilder = spannableStringBuilder2;
                    spannableStringBuilderM11803 = RunnableC3646.m11803(spannableStringBuilder, strM9847);
                    if (C1080.f3865 >= 0) {
                        int iM27614 = C0619.m2761("ۛ۫") ^ i30;
                        SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder;
                        sArr3 = sArr;
                        i38 = i15;
                        str9 = str4;
                        i32 = ((iM27614 ^ i31) * (-23309)) ^ 2099097015;
                        spannableStringBuilder3 = spannableStringBuilderM11803;
                        textView3 = textView2;
                        str11 = str11;
                        i33 = iM27614 ^ (-1711673145);
                        printStream4 = printStream2;
                        spannableStringBuilder2 = spannableStringBuilder5;
                    } else {
                        int iM31615 = C0773.m3169("ᩳ᩶") ^ i31;
                        sArr3 = sArr;
                        spannableStringBuilder3 = spannableStringBuilderM11803;
                        i38 = i15;
                        spannableStringBuilder2 = spannableStringBuilder;
                        str9 = str4;
                        i32 = ((iM31615 ^ i30) * (-29603)) ^ (-488225858);
                        str11 = str11;
                        i33 = iM31615 ^ 783889777;
                        textView3 = textView2;
                        printStream4 = printStream2;
                    }
                    str7 = str7;
                    strM6952 = strM6952;
                    break;
                case -1492489513:
                case 1030345108:
                    C2485.m8357();
                    if (C3998.f13671 == 0) {
                        iM2761 = (C0773.m3169("֨ܿ") ^ i31) * 53;
                        i = ((iM2761 ^ i30) * (-21575)) ^ (-1878688184);
                        i2 = -770793516;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    } else {
                        str11 = str11;
                        textView3 = textView3;
                        int iM27615 = C0619.m2761("᩸ۤ") ^ i30;
                        int i44 = ((iM27615 ^ i31) * (-5137)) ^ (-7491386);
                        i12 = iM27615 ^ 1851602335;
                        s = s;
                        i32 = i44;
                        textView3 = textView3;
                        typefaceSpan = null;
                        i38 = i38;
                        str11 = str11;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        str9 = str9;
                        i33 = i12;
                        printStream4 = printStream4;
                        c5562 = this;
                        str7 = str7;
                        strM6952 = strM6952;
                    }
                    break;
                case -1463394262:
                case -192537212:
                    str3 = str11;
                    i3 = i37;
                    iM28315 = C11235.m28315(strM5463, 40);
                    if (iM28315 == -1) {
                        strM1237 = strM5463;
                        int iM27616 = C0619.m2761("۠ܽ") ^ i30;
                        String str19 = strM1237;
                        i32 = ((iM27616 ^ i31) * (-7895)) ^ (-1054748456);
                        i33 = iM27616 ^ (-1786033940);
                        str6 = str19;
                        i37 = i3;
                        str11 = str6;
                    } else {
                        iM2762 = C0773.m3169("۬ܿ") ^ i31;
                        i = ((iM2762 ^ i30) * 15085) ^ (-1406470035);
                        i4 = -1802315082;
                        i6 = iM2762 ^ i4;
                        i37 = i3;
                        str11 = str3;
                        i33 = i6;
                        i32 = i;
                    }
                    break;
                case -1444590385:
                case 1908440080:
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    strM6952 = strM6952;
                    str7 = str7;
                    printStream4 = printStream4;
                    str9 = str9;
                    i38 = i38;
                    textView3 = textView3;
                    s = s;
                    if ((s * 27326) - (i28 + 186677569) <= 0) {
                        iM2764 = (i31 - C0619.m2761("᩻᩹")) * 33;
                        i9 = ((iM2764 ^ i30) * (-14891)) ^ 1194628997;
                        i10 = -2037827476;
                    } else {
                        iM2764 = (C0773.m3169("᩻᩷") ^ i30) * 37;
                        i9 = ((iM2764 ^ i31) * 12005) ^ 1623666425;
                        i10 = 1361821036;
                    }
                    i12 = iM2764 ^ i10;
                    s = s;
                    i32 = i9;
                    textView3 = textView3;
                    i38 = i38;
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    str9 = str9;
                    i33 = i12;
                    printStream4 = printStream4;
                    c5562 = this;
                    str7 = str7;
                    strM6952 = strM6952;
                    break;
                case -1432159721:
                case -571226295:
                    strM1237 = AbstractC0116.m1237(strM5463, 0, iM28315);
                    i3 = i37;
                    int iM27617 = C0619.m2761("۠ܽ") ^ i30;
                    String str110 = strM1237;
                    i32 = ((iM27617 ^ i31) * (-7895)) ^ (-1054748456);
                    i33 = iM27617 ^ (-1786033940);
                    str6 = str110;
                    i37 = i3;
                    str11 = str6;
                    break;
                case -1418144303:
                case 124968368:
                    iM6305 = iM6305;
                    if (C11730.m29464(str11)) {
                        iM2763 = (C0773.m3169("᩺֡") ^ i31) * (-65);
                        i = ((iM2763 ^ i30) * 32229) ^ 1737409315;
                        i8 = 563283255;
                    } else {
                        iM2763 = C0619.m2761("ܿ᩹") ^ i30;
                        i = ((iM2763 ^ i31) * 6139) ^ (-886164710);
                        i8 = 333090783;
                    }
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -1408060404:
                case -1029786106:
                    str11 = str11;
                    int iM10045 = C3077.m10045(strM5463);
                    String str20 = c5562.f19308;
                    if (iM10045 == C2966.m9671(str20)) {
                        iM2767 = C0773.m3169("ܰ۟") ^ i31;
                        i13 = ((iM2767 ^ i30) * (-2617)) ^ 1276872337;
                        i25 = -2111716597;
                    } else {
                        iM2767 = C0619.m2761("ۧۤ") ^ i30;
                        i13 = ((iM2767 ^ i31) * 20063) ^ (-1416455327);
                        i25 = -1774846569;
                    }
                    i14 = iM2767 ^ i25;
                    str8 = str20;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case -1187453844:
                case 1487757631:
                    RunnableC3646.m11803(spannableStringBuilder3, strM53420);
                    iM2763 = (C0619.m2761("ۘ۫") + i31) * (-83);
                    i = ((iM2763 ^ i30) * 16239) ^ 1598471457;
                    i8 = 1517101370;
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -1128081096:
                case 430960965:
                    iM6305 = iM6305;
                    int iM3157 = C0773.m3157(num);
                    c16748 = c5562.f19309;
                    if (iM3157 == c16748.f54061) {
                        iM2763 = C0619.m2761("ܽ۬") ^ i31;
                        i = ((iM2763 ^ i30) * 11755) ^ 1342989219;
                        i8 = 1813396186;
                    } else {
                        iM2763 = (C0619.m2761("۬ۢ") ^ i30) * (-51);
                        i = ((iM2763 ^ i31) * (-13649)) ^ 1567520060;
                        i8 = 246749177;
                    }
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -1086078985:
                case 1982359969:
                    numM3159 = C0773.m3159(C11730.m29456(str11));
                    num = numM3159;
                    iM2763 = (C0619.m2761("᩵ۤ") + i30) * (-11);
                    i = ((iM2763 ^ i31) * 4451) ^ (-384765528);
                    i8 = -676605072;
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -981354010:
                case 552832221:
                    ForegroundColorSpan foregroundColorSpan2 = foregroundColorSpan;
                    C17202.m40381(spannableStringBuilder3, foregroundColorSpan2, i40, iM6305, i34);
                    short[] sArr4 = f19306;
                    if (C2834.f9334 > 0) {
                        foregroundColorSpan = foregroundColorSpan2;
                        str11 = str11;
                        typefaceSpan = new TypefaceSpan(C1826.m6310(sArr4, 31, 10, i39));
                        if (C0487.f2131 > 0) {
                            iM2768 = C0619.m2761("ۢ֫") ^ i31;
                            i13 = ((iM2768 ^ i30) * 4795) ^ 1665907238;
                            i27 = -879869031;
                            i14 = iM2768 ^ i27;
                            str6 = str11;
                            i33 = i14;
                            i32 = i13;
                            str11 = str6;
                        } else {
                            spannableStringBuilderM11803 = spannableStringBuilder3;
                            strM6952 = strM6952;
                            str7 = str7;
                            printStream2 = printStream4;
                            str4 = str9;
                            sArr = sArr3;
                            i15 = i38;
                            textView2 = textView3;
                            spannableStringBuilder = spannableStringBuilder2;
                            int iM27618 = C0619.m2761("ۛ۫") ^ i30;
                            SpannableStringBuilder spannableStringBuilder6 = spannableStringBuilder;
                            sArr3 = sArr;
                            i38 = i15;
                            str9 = str4;
                            i32 = ((iM27618 ^ i31) * (-23309)) ^ 2099097015;
                            spannableStringBuilder3 = spannableStringBuilderM11803;
                            textView3 = textView2;
                            str11 = str11;
                            i33 = iM27618 ^ (-1711673145);
                            printStream4 = printStream2;
                            spannableStringBuilder2 = spannableStringBuilder6;
                            str7 = str7;
                            strM6952 = strM6952;
                        }
                    } else {
                        foregroundColorSpan = foregroundColorSpan2;
                        str11 = str11;
                        textView3 = textView3;
                        int iM27619 = C0619.m2761("᩸ۤ") ^ i30;
                        int i45 = ((iM27619 ^ i31) * (-5137)) ^ (-7491386);
                        i12 = iM27619 ^ 1851602335;
                        s = s;
                        i32 = i45;
                        textView3 = textView3;
                        typefaceSpan = null;
                        i38 = i38;
                        str11 = str11;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        str9 = str9;
                        i33 = i12;
                        printStream4 = printStream4;
                        c5562 = this;
                        str7 = str7;
                        strM6952 = strM6952;
                    }
                    break;
                case -900657905:
                case 1661537704:
                    numM3159 = null;
                    num = numM3159;
                    iM2763 = (C0619.m2761("᩵ۤ") + i30) * (-11);
                    i = ((iM2763 ^ i31) * 4451) ^ (-384765528);
                    i8 = -676605072;
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -884939128:
                case 791530348:
                    str3 = str11;
                    String str21 = str8;
                    i3 = i37;
                    if (!C3492.m11490(strM5463, str21)) {
                        str8 = str21;
                        iM2762 = (C0773.m3169("ܳۖ") ^ i30) * 51;
                        i = ((iM2762 ^ i31) * 25789) ^ 136142587;
                        i4 = 347583045;
                        i6 = iM2762 ^ i4;
                        i37 = i3;
                        str11 = str3;
                        i33 = i6;
                        i32 = i;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩸") + i31) * 45;
                        str8 = str21;
                        i32 = ((iM3169 ^ i30) * (-11785)) ^ (-1922584490);
                        i5 = 258530048;
                        i7 = iM3169 ^ i5;
                        i37 = i3;
                        str11 = str3;
                        i33 = i7;
                    }
                    break;
                case -770668599:
                case 1993019500:
                    if (C23916.m53419() != 0) {
                        str11 = str11;
                        textView3 = textView3;
                        int iM276110 = C0619.m2761("᩸ۤ") ^ i30;
                        int i46 = ((iM276110 ^ i31) * (-5137)) ^ (-7491386);
                        i12 = iM276110 ^ 1851602335;
                        s = s;
                        i32 = i46;
                        textView3 = textView3;
                        typefaceSpan = null;
                        i38 = i38;
                        str11 = str11;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        str9 = str9;
                        i33 = i12;
                        printStream4 = printStream4;
                        c5562 = this;
                        str7 = str7;
                        strM6952 = strM6952;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۗ") ^ i31) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i30) * 31251) ^ (-1147091095);
                        i2 = 1717292811;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    }
                    break;
                case -768864078:
                case -86977934:
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۢۛ") ^ i30;
                        i = ((iM2761 ^ i31) * (-2019)) ^ (-1071964666);
                        i2 = 1670762722;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    } else {
                        str11 = str11;
                        strM6952 = strM6952;
                        str = str7;
                        str2 = str9;
                        PrintStream printStream7 = printStream4;
                        textView = textView3;
                        printStream = printStream7;
                        int iM276111 = C0619.m2761("ۧۗ") ^ i31;
                        String str111 = str2;
                        i32 = ((iM276111 ^ i30) * (-22395)) ^ 1778816425;
                        i18 = iM276111 ^ (-1687053515);
                        str7 = str;
                        str9 = str111;
                        strM6952 = strM6952;
                        TextView textView6 = textView;
                        printStream4 = printStream;
                        textView3 = textView6;
                        String str112 = str11;
                        i33 = i18;
                        str11 = str112;
                    }
                    break;
                case -765636184:
                case 2085451714:
                    numM3159 = C0773.m3159(C1321.m4845(str11));
                    num = numM3159;
                    iM2763 = (C0619.m2761("᩵ۤ") + i30) * (-11);
                    i = ((iM2763 ^ i31) * 4451) ^ (-384765528);
                    i8 = -676605072;
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -617938797:
                case 1742453566:
                    str11 = str11;
                    PrintStream printStream8 = printStream4;
                    String str22 = str9;
                    TextView textView7 = textView3;
                    strM6952 = C2023.m6952(editable);
                    String strM11996 = C3690.m11996(f19306, 3, 6, i39);
                    if (AbstractC0116.f1064 <= 0) {
                        iM2766 = (C0619.m2761("ܶۤ") + i31) * 119;
                        i16 = ((iM2766 ^ i30) * (-21393)) ^ (-1214234518);
                        i17 = -435444764;
                    } else {
                        iM2766 = (C0619.m2761("᩻ᩳ") ^ i30) * (-123);
                        i16 = ((iM2766 ^ i31) * 20097) ^ 1994246617;
                        i17 = -102900956;
                    }
                    i18 = iM2766 ^ i17;
                    str9 = str22;
                    i32 = i16;
                    str7 = strM11996;
                    textView3 = textView7;
                    printStream4 = printStream8;
                    String str113 = str11;
                    i33 = i18;
                    str11 = str113;
                    break;
                case -597702729:
                case 934776377:
                    String str23 = str9;
                    i40 = iM9671 + 2;
                    int iM10046 = C3077.m10045(strM5463);
                    String str24 = c5562.f19312;
                    if (iM10046 == C3077.m10045(str24)) {
                        iM31610 = (C0619.m2761("۠ۚ") ^ i31) * 27;
                        i19 = ((iM31610 ^ i30) * (-5871)) ^ 2054693304;
                        i20 = 1059984700;
                    } else {
                        iM31610 = (C0773.m3169("᩸᩺") + i30) * (-69);
                        i19 = ((iM31610 ^ i31) * 21821) ^ (-1701905656);
                        i20 = -1504676261;
                    }
                    i21 = iM31610 ^ i20;
                    str9 = str23;
                    str12 = str24;
                    i32 = i19;
                    i35 = 2;
                    i36 = -16724992;
                    str6 = str11;
                    i33 = i21;
                    str11 = str6;
                    break;
                case -484242589:
                case 137252980:
                    C1146.m4231();
                    if (C3779.f12953 > 0) {
                        iM2761 = (C0773.m3169("᩸ۗ") ^ i31) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i30) * 31251) ^ (-1147091095);
                        i2 = 1717292811;
                    } else {
                        iM2761 = (i30 - C0619.m2761("ۢ۬")) * (-113);
                        i = ((iM2761 ^ i31) * (-12737)) ^ (-504476628);
                        i2 = 1333162533;
                    }
                    i33 = iM2761 ^ i2;
                    i32 = i;
                    break;
                case -449541008:
                case 1098299077:
                    C1146.m4232(spannableStringBuilder3, C0487.m2361(f19306, 9, 5, i39));
                    i26 = C3296.f10774;
                    i37 = i26;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case -374641873:
                case -30963392:
                    RunnableC3646.m11803(spannableStringBuilder3, C1542.m5471(f19306, 49, 8, i39));
                    iM6305 = iM6305;
                    i37 = i36;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case -364813103:
                case 997519420:
                    textView = textView3;
                    str11 = str11;
                    str2 = str9;
                    strM6952 = strM6952;
                    String str25 = str7;
                    strM5463 = C1542.m5463(C20932.m47846(strM6952, str25, ""));
                    printStream = System.out;
                    if (C3690.f12684 > 0) {
                        int iM31616 = (i31 - C0773.m3169("ۢ۫")) * (-105);
                        str9 = str2;
                        i32 = ((iM31616 ^ i30) * 19975) ^ (-776600178);
                        textView3 = textView;
                        printStream4 = printStream;
                        str7 = str25;
                        str11 = str11;
                        i33 = iM31616 ^ 173005713;
                        strM6952 = strM6952;
                    } else {
                        str = str25;
                        int iM276112 = C0619.m2761("ۧۗ") ^ i31;
                        String str114 = str2;
                        i32 = ((iM276112 ^ i30) * (-22395)) ^ 1778816425;
                        i18 = iM276112 ^ (-1687053515);
                        str7 = str;
                        str9 = str114;
                        strM6952 = strM6952;
                        TextView textView8 = textView;
                        printStream4 = printStream;
                        textView3 = textView8;
                        String str115 = str11;
                        i33 = i18;
                        str11 = str115;
                    }
                    break;
                case -317891468:
                case 585345625:
                    str3 = str11;
                    printStream3 = printStream4;
                    str5 = str9;
                    printStream3.println(strM5463);
                    iM9671 = C2966.m9671(str5);
                    if (!C3077.m10041()) {
                        TextView textView9 = textView3;
                        int iM27620 = (i31 - C0619.m2761("᩶ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        str9 = str5;
                        i32 = ((iM27620 ^ i30) * 10425) ^ (-109739417);
                        str6 = str3;
                        i33 = iM27620 ^ (-1297085464);
                        textView3 = textView9;
                        printStream4 = printStream3;
                        str11 = str6;
                    } else {
                        int iM276113 = C0619.m2761("ۜۛ") ^ i31;
                        TextView textView10 = textView3;
                        int i47 = ((iM276113 ^ i30) * 26159) ^ 854952806;
                        i7 = iM276113 ^ 498868044;
                        str9 = str5;
                        i32 = i47;
                        textView3 = textView10;
                        printStream4 = printStream3;
                        str11 = str3;
                        i33 = i7;
                    }
                    break;
                case -270557605:
                case 1067949322:
                    RunnableC3646.m11803(spannableStringBuilder3, C0862.m3500(f19306, 14, 5, i39));
                    i37 = i36;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case -221638579:
                case 679459860:
                    str11 = str11;
                    int i48 = i37;
                    ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(i48);
                    iM6305 = C1826.m6305(spannableStringBuilder3);
                    if (C3779.f12953 > 0) {
                        int iM31617 = C0773.m3169("ۡܽ") ^ i31;
                        int i49 = ((iM31617 ^ i30) * (-27193)) ^ 547444075;
                        i7 = iM31617 ^ 1771212941;
                        foregroundColorSpan = foregroundColorSpan3;
                        i37 = i48;
                        i32 = i49;
                        str11 = str11;
                        i34 = 33;
                        i33 = i7;
                    } else {
                        foregroundColorSpan = foregroundColorSpan3;
                        i37 = i48;
                        i34 = 33;
                        textView3 = textView3;
                        int iM276114 = C0619.m2761("᩸ۤ") ^ i30;
                        int i410 = ((iM276114 ^ i31) * (-5137)) ^ (-7491386);
                        i12 = iM276114 ^ 1851602335;
                        s = s;
                        i32 = i410;
                        textView3 = textView3;
                        typefaceSpan = null;
                        i38 = i38;
                        str11 = str11;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        str9 = str9;
                        i33 = i12;
                        printStream4 = printStream4;
                        c5562 = this;
                        str7 = str7;
                        strM6952 = strM6952;
                    }
                    break;
                case -207244574:
                case 967177825:
                    i39 = 29181;
                    iM2765 = (C0773.m3169("ۘ᩶") ^ i30) * 25;
                    i32 = ((iM2765 ^ i31) * 25423) ^ 399789652;
                    i11 = -1315750137;
                    i12 = iM2765 ^ i11;
                    textView3 = textView3;
                    i38 = i38;
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    str9 = str9;
                    i33 = i12;
                    printStream4 = printStream4;
                    c5562 = this;
                    str7 = str7;
                    strM6952 = strM6952;
                    break;
                case -45940696:
                case 20130714:
                    iM6305 = iM6305;
                    if (C11730.m29462(str11)) {
                        iM2763 = (C0773.m3169("۬۫") + i30) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2763 ^ i31) * (-21013)) ^ 1250634350;
                        i8 = -774365663;
                    } else {
                        iM2763 = C0619.m2761("᩶ܺ") ^ i31;
                        i = ((iM2763 ^ i30) * (-17129)) ^ 862809951;
                        i8 = -2093746521;
                    }
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case -35388192:
                case 480554831:
                    C1146.m4232(spannableStringBuilder3, C2375.m8069(f19306, 64, 7, i39));
                    iM6305 = iM6305;
                    i37 = i36;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case -32351607:
                case 325726755:
                    C2354.m7978(textView3, str9);
                    break;
                case 65592501:
                case 1353535379:
                    C2419.m8174();
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("᩸ۗ") ^ i31) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i30) * 31251) ^ (-1147091095);
                        i2 = 1717292811;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    } else {
                        str3 = str11;
                        printStream3 = printStream4;
                        str5 = str9;
                        int iM276115 = C0619.m2761("ۜۛ") ^ i31;
                        TextView textView11 = textView3;
                        int i411 = ((iM276115 ^ i30) * 26159) ^ 854952806;
                        i7 = iM276115 ^ 498868044;
                        str9 = str5;
                        i32 = i411;
                        textView3 = textView11;
                        printStream4 = printStream3;
                        str11 = str3;
                        i33 = i7;
                    }
                    break;
                case 170481115:
                case 628563385:
                    C1146.m4232(spannableStringBuilder3, C2702.m8881(f19306, 58, 6, i39));
                    iM6305 = iM6305;
                    i37 = i36;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case 223876361:
                case 340395466:
                    numM3159 = C0619.m2764(C11730.m29456(RunnableC3055.m9931(str11, i35)));
                    num = numM3159;
                    iM2763 = (C0619.m2761("᩵ۤ") + i30) * (-11);
                    i = ((iM2763 ^ i31) * 4451) ^ (-384765528);
                    i8 = -676605072;
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case 295341560:
                case 825433203:
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    strM6952 = strM6952;
                    str7 = str7;
                    printStream4 = printStream4;
                    str9 = str9;
                    i38 = i38;
                    textView3 = textView3;
                    s = sArr2[c];
                    i28 = s * s;
                    if (C2878.f9462) {
                        iM2765 = (C0619.m2761("۫ܳ") + i31) * (-15);
                        i32 = ((iM2765 ^ i30) * 23323) ^ 1334898710;
                        i11 = 1042848098;
                    } else {
                        iM2765 = (C0773.m3169("᩸ᩳ") ^ i31) * 67;
                        i32 = ((iM2765 ^ i30) * (-9299)) ^ 318658526;
                        i11 = 1158356565;
                    }
                    i12 = iM2765 ^ i11;
                    textView3 = textView3;
                    i38 = i38;
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    str9 = str9;
                    i33 = i12;
                    printStream4 = printStream4;
                    c5562 = this;
                    str7 = str7;
                    strM6952 = strM6952;
                    break;
                case 619420147:
                case 1519509887:
                    C1146.m4232(spannableStringBuilder3, C0269.m1785(f19306, 25, 6, i39));
                    i37 = i36;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case 635858468:
                case 1423770655:
                    C2375.m8065();
                    C1080.m4050();
                    break;
                case 1080628213:
                case 2076373095:
                    iM6305 = iM6305;
                    if (C0773.m3157(num) == c16748.f54058) {
                        iM2763 = (C0773.m3169("۬ᩴ") ^ i30) * (-115);
                        i = ((iM2763 ^ i31) * 5197) ^ 1527419067;
                        i8 = 1164166568;
                    } else {
                        iM2763 = (C0619.m2761("۬ۚ") + i30) * 101;
                        i = ((iM2763 ^ i31) * 29825) ^ 882123065;
                        i8 = -1896003975;
                    }
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
                case 1164914133:
                case 1869253545:
                    i37 = -16776961;
                    str11 = str11;
                    iM2768 = C0619.m2761("ۖ֫") ^ i30;
                    i13 = ((iM2768 ^ i31) * 13819) ^ 1381475738;
                    i27 = 378283233;
                    i14 = iM2768 ^ i27;
                    str6 = str11;
                    i33 = i14;
                    i32 = i13;
                    str11 = str6;
                    break;
                case 1234809792:
                case 1758209465:
                    i39 = 32861;
                    iM2765 = (C0773.m3169("ۘ᩶") ^ i30) * 25;
                    i32 = ((iM2765 ^ i31) * 25423) ^ 399789652;
                    i11 = -1315750137;
                    i12 = iM2765 ^ i11;
                    textView3 = textView3;
                    i38 = i38;
                    str11 = str11;
                    spannableStringBuilder2 = spannableStringBuilder2;
                    str9 = str9;
                    i33 = i12;
                    printStream4 = printStream4;
                    c5562 = this;
                    str7 = str7;
                    strM6952 = strM6952;
                    break;
                case 1566985659:
                case 1708506620:
                    C0773.m3161();
                    if (C1826.f6190 <= 0) {
                        str11 = str11;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        strM6952 = strM6952;
                        str7 = str7;
                        printStream4 = printStream4;
                        str9 = str9;
                        i38 = i38;
                        textView3 = textView3;
                        iM2765 = (C0619.m2761("۫ܳ") + i31) * (-15);
                        i32 = ((iM2765 ^ i30) * 23323) ^ 1334898710;
                        i11 = 1042848098;
                        i12 = iM2765 ^ i11;
                        textView3 = textView3;
                        i38 = i38;
                        str11 = str11;
                        spannableStringBuilder2 = spannableStringBuilder2;
                        str9 = str9;
                        i33 = i12;
                        printStream4 = printStream4;
                        c5562 = this;
                        str7 = str7;
                        strM6952 = strM6952;
                    } else {
                        iM2761 = (C0773.m3169("֨ܿ") ^ i31) * 53;
                        i = ((iM2761 ^ i30) * (-21575)) ^ (-1878688184);
                        i2 = -770793516;
                        i33 = iM2761 ^ i2;
                        i32 = i;
                    }
                    break;
                case 1683306200:
                case 2143481120:
                    C1783.m6232();
                    C0950.m3785();
                    str3 = str11;
                    printStream3 = printStream4;
                    str5 = str9;
                    int iM276116 = C0619.m2761("ۜۛ") ^ i31;
                    TextView textView12 = textView3;
                    int i412 = ((iM276116 ^ i30) * 26159) ^ 854952806;
                    i7 = iM276116 ^ 498868044;
                    str9 = str5;
                    i32 = i412;
                    textView3 = textView12;
                    printStream4 = printStream3;
                    str11 = str3;
                    i33 = i7;
                    break;
                case 1855412161:
                case 2068717990:
                    str11 = str11;
                    strM6952 = strM6952;
                    str = str7;
                    PrintStream printStream9 = printStream4;
                    str2 = str9;
                    textView = textView3;
                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(str2);
                    sArr3 = f19306;
                    i38 = 1;
                    if (C2878.m9491() > 0) {
                        int iM31618 = (C0773.m3169("֡ۢ") + i30) * (-17);
                        i13 = ((iM31618 ^ i31) * 27997) ^ (-2111576462);
                        i14 = iM31618 ^ (-1321423089);
                        spannableStringBuilder2 = spannableStringBuilder7;
                        textView3 = textView;
                        str9 = str2;
                        printStream4 = printStream9;
                        str7 = str;
                        strM6952 = strM6952;
                        str6 = str11;
                        i33 = i14;
                        i32 = i13;
                        str11 = str6;
                    } else {
                        spannableStringBuilder2 = spannableStringBuilder7;
                        printStream = printStream9;
                        int iM276117 = C0619.m2761("ۧۗ") ^ i31;
                        String str116 = str2;
                        i32 = ((iM276117 ^ i30) * (-22395)) ^ 1778816425;
                        i18 = iM276117 ^ (-1687053515);
                        str7 = str;
                        str9 = str116;
                        strM6952 = strM6952;
                        TextView textView13 = textView;
                        printStream4 = printStream;
                        textView3 = textView13;
                        String str117 = str11;
                        i33 = i18;
                        str11 = str117;
                    }
                    break;
                default:
                    C1146.m4232(spannableStringBuilder3, strM53420);
                    iM2763 = (C0619.m2761("ۘ۫") + i31) * (-83);
                    i = ((iM2763 ^ i30) * 16239) ^ 1598471457;
                    i8 = 1517101370;
                    i6 = iM2763 ^ i8;
                    iM6305 = iM6305;
                    i33 = i6;
                    i32 = i;
                    break;
            }
            return;
        }
    }
}
