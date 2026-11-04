package l;

import android.content.SharedPreferences;
import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.util.ThreadUtil;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Z1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17905 implements PluginContext {

    /* JADX INFO: renamed from: ֡ܳ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f58644 = {6269, -16214, -16202, -16214, -16210, -16202, -16215, -16215, 254, 19919, 19908, 19907, 19843, 19904, 19929, 19843, 19933, 19905, 19928, 19914, 19908, 19907, 19843, 19934, 19924, 19934, 19929, 19912, 19904, 8663, -18485, -18463, -18453, -18452, -18435, -18443, 5151, 532, 563, 565, 558, 553, 544, 615, 553, 552, 563, 615, 545, 552, 562, 553, 547, 637, 615, 4823, 7609, 7604, 7611, 7602, 7590, 7585, 7591, 7612, 7611, 7602, 7590, 4039, 30829, 30822, 30817, 30753, 30818, 30843, 30753, 30847, 30819, 30842, 30824, 30822, 30817, 30753, 30844, 30838, 30844, 30843, 30826, 30818, 4337, -5045, -5056, -5049, -5113, -5052, -5027, -5113, -5031, -5051, -5028, -5042, -5056, -5049, -5113, -5030, -5040, -5030, -5027, -5044, -5052, 1593, -28691, -28698, -28703, -28767, -28702, -28677, -28767, -28673, -28701, -28678, -28696, -28698, -28703, -28767, -28676, -28682, -28676, -28677, -28694, -28702};

    @Override // bin.mt.plugin.api.PluginContext
    public final int getHostVersionCode() {
        return 26110365;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getHostVersionName() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -80924259;
        int i7 = C1564.f5401;
        int i8 = C3492.f12043;
        int iM2761 = (i8 - C0619.m2761("֡᩺")) * 7;
        int i9 = ((iM2761 ^ i7) * (-21293)) ^ (-2096444918);
        int i10 = -1108850886;
        while (true) {
            i6 = ((((i6 ^ i7) * (-26665)) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -2122237986:
                case 44249903:
                    if (C0487.f2131 > 0) {
                        iM2761 = C0619.m2761("֡᩻") ^ i7;
                        i9 = ((iM2761 ^ i8) * 6059) ^ 406288422;
                        i10 = 1273254170;
                    } else {
                        iM2761 = C0619.m2761("᩺ܽ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-23349)) ^ 1396698176;
                        i10 = -1714896683;
                    }
                    break;
                case -1704518161:
                case 1865738:
                    i = s * s2;
                    i2 = s * s;
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0619.m2761("֡᩻") ^ i7;
                        i9 = ((iM2761 ^ i8) * 6059) ^ 406288422;
                        i10 = 1273254170;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ܶۢ")) * (-93);
                        i9 = ((iM2761 ^ i8) * (-8577)) ^ 1507265947;
                        i10 = -551077209;
                    }
                    break;
                case -1702465577:
                case 349768908:
                    sArr2 = f58644;
                    i5 = 1;
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0619.m2761("᩺ܽ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-23349)) ^ 1396698176;
                        i10 = -1714896683;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ᩳܿ")) * 127;
                        i9 = ((iM2761 ^ i7) * 1625) ^ 454518400;
                        i10 = -906990090;
                    }
                    break;
                case -1476293230:
                case -1397171699:
                    i3 = 12264004;
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ܿܽ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 2463) ^ 1630325549;
                        i10 = -1837675319;
                    } else {
                        iM2761 = C0619.m2761("֨֫") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-15363)) ^ (-144237947);
                        i10 = 1405506270;
                    }
                    break;
                case -1244690292:
                case -861564615:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("۬ܰ") + i7) * (-67);
                        i9 = ((iM2761 ^ i8) * 8333) ^ (-1918202606);
                        i10 = -1149581868;
                    } else {
                        iM2761 = (C0619.m2761("ۜܽ") + i7) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((iM2761 ^ i8) * 1775) ^ (-1786706873);
                        i10 = -595352731;
                    }
                    break;
                case -970287113:
                case 1367287311:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("ܿܽ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 2463) ^ 1630325549;
                        i10 = -1837675319;
                    } else {
                        iM2761 = (i8 - C0773.m3169("᩺ۡ")) * (-9);
                        i9 = ((iM2761 ^ i7) * 7819) ^ 1727588031;
                        i10 = -1470949923;
                    }
                    break;
                case -854687047:
                case -527743848:
                    s = sArr[c];
                    s2 = 7004;
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("۬ܰ") + i7) * (-67);
                        i9 = ((iM2761 ^ i8) * 8333) ^ (-1918202606);
                        i10 = -1149581868;
                    } else {
                        iM2761 = (C0619.m2761("֨ܳ") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM2761 ^ i7) * 13157) ^ 1821688356;
                        i10 = -1482675564;
                    }
                    break;
                case -480502427:
                case -251551786:
                    C2354.m7983();
                    C4238.m13540();
                    return null;
                case -478560778:
                case 1523025267:
                    c = 0;
                    if (C1519.m5403()) {
                        iM2761 = C0619.m2761("᩷֡") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-17731)) ^ (-1014768751);
                        i10 = -209788325;
                    } else {
                        iM2761 = C0619.m2761("᩺ܽ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-23349)) ^ 1396698176;
                        i10 = -1714896683;
                    }
                    break;
                case -467501037:
                case 1377665907:
                    C2878.m9491();
                    if (C0487.m2356() < 0) {
                        iM2761 = C0619.m2761("ܿܽ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 2463) ^ 1630325549;
                        i10 = -1837675319;
                    } else {
                        iM2761 = C0619.m2761("᩺ܽ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-23349)) ^ 1396698176;
                        i10 = -1714896683;
                    }
                    break;
                case -395819118:
                case 1037745504:
                    i4 = 51067;
                    iM2761 = C0619.m2761("۬ۧ") ^ i8;
                    i9 = ((iM2761 ^ i7) * 20967) ^ 1961415420;
                    i10 = -1989136795;
                    break;
                case -130115033:
                case 186897252:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("ܿܽ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 2463) ^ 1630325549;
                        i10 = -1837675319;
                    } else {
                        iM2761 = C0773.m3169("᩸ܽ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-1049)) ^ 1428554476;
                        i10 = -1506136192;
                    }
                    break;
                case -92710338:
                case 794427481:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ܿܽ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 2463) ^ 1630325549;
                        i10 = -1837675319;
                    } else {
                        iM2761 = (C0619.m2761("ܰۡ") ^ i8) * (-91);
                        i9 = ((iM2761 ^ i7) * 1277) ^ 54440572;
                        i10 = 526141567;
                    }
                    break;
                case -90623751:
                case 911248778:
                    sArr = f58644;
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("᩶ۨ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-15617)) ^ (-16921633);
                        i10 = -2131918657;
                    } else {
                        iM2761 = C0619.m2761("֡᩻") ^ i7;
                        i9 = ((iM2761 ^ i8) * 6059) ^ 406288422;
                        i10 = 1273254170;
                    }
                    break;
                case 47627509:
                case 829651027:
                    C1519.m5403();
                    C3448.m11248();
                    iM2761 = C0619.m2761("᩺ܽ") ^ i7;
                    i9 = ((iM2761 ^ i8) * (-23349)) ^ 1396698176;
                    i10 = -1714896683;
                    break;
                case 115889790:
                case 693175918:
                    if ((i2 + i3) - i >= 0) {
                        iM2761 = (i8 - C0619.m2761("֨ۤ")) * (-127);
                        i9 = ((iM2761 ^ i7) * (-25517)) ^ (-1565043969);
                        i10 = 915844794;
                    } else {
                        iM2761 = C0773.m3169("ۤᩳ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-6815)) ^ 1907996839;
                        i10 = -1828760018;
                    }
                    break;
                case 743244053:
                case 1648453445:
                    return C2287.m7749(sArr2, i5, 7, i4);
                case 798232247:
                case 1989493970:
                    i4 = 49304;
                    iM2761 = C0619.m2761("۬ۧ") ^ i8;
                    i9 = ((iM2761 ^ i7) * 20967) ^ 1961415420;
                    i10 = -1989136795;
                    break;
                default:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("۬ܰ") + i7) * (-67);
                        i9 = ((iM2761 ^ i8) * 8333) ^ (-1918202606);
                        i10 = -1149581868;
                    } else {
                        iM2761 = C0773.m3169("ܰۛ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-2153)) ^ 59765442;
                        i10 = 542146923;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginId() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 1387954650;
        int i6 = C0269.f1558;
        int i7 = C3734.f12817;
        int iM3169 = (C0773.m3169("ۢۖ") ^ i7) * (-87);
        int i8 = ((iM3169 ^ i6) * 26145) ^ (-686982046);
        int i9 = -691001150;
        while (true) {
            i5 = ((((i5 ^ i6) * 27879) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -2124834089:
                case 1260421631:
                    sArr = f58644;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i6;
                        i8 = ((iM3169 ^ i7) * 11675) ^ 2019814077;
                        i9 = 1070460854;
                    } else {
                        iM3169 = (i6 - C0619.m2761("֡֡")) * (-79);
                        i8 = ((iM3169 ^ i7) * 6735) ^ 485200064;
                        i9 = 1504517106;
                    }
                    break;
                case -2073714086:
                case -1682764555:
                    sArr2 = f58644;
                    i4 = 9;
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("᩻֨") ^ i7) * (-53);
                        i8 = ((iM3169 ^ i6) * (-493)) ^ (-441140381);
                        i9 = -1528223502;
                    } else {
                        iM3169 = C0773.m3169("᩻ۚ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-28257)) ^ 790315099;
                        i9 = -785811256;
                    }
                    break;
                case -2043192882:
                case -1291524812:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0619.m2761("۟ۜ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 18695) ^ 1584671708;
                        i9 = 949311211;
                    } else {
                        iM3169 = C0619.m2761("ܿۗ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-22701)) ^ 115962597;
                        i9 = 209127929;
                    }
                    break;
                case -1969065195:
                case 175023691:
                    AbstractC0116.m1243();
                    iM3169 = C0619.m2761("ܿۗ") ^ i6;
                    i8 = ((iM3169 ^ i7) * (-22701)) ^ 115962597;
                    i9 = 209127929;
                    break;
                case -1625206600:
                case 1697676418:
                    i2 = 83759104 + i;
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ۜۜ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 10441) ^ 1848261660;
                        i9 = 927730368;
                    } else {
                        iM3169 = C0619.m2761("ۡۖ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-24971)) ^ (-1615131488);
                        i9 = 1196055875;
                    }
                    break;
                case -1484294667:
                case 1039187803:
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("ܳᩴ") + i6) * 23;
                        i8 = ((iM3169 ^ i7) * 25171) ^ 1717485638;
                        i9 = -2117556408;
                    } else {
                        iM3169 = (C0619.m2761("ۜۜ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 10441) ^ 1848261660;
                        i9 = 927730368;
                    }
                    break;
                case -1437457342:
                case -423291616:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("᩻֨") ^ i7) * (-53);
                        i8 = ((iM3169 ^ i6) * (-493)) ^ (-441140381);
                        i9 = -1528223502;
                    } else {
                        iM3169 = C0773.m3169("ܽ᩺") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-7181)) ^ 1091421605;
                        i9 = -1715577129;
                    }
                    break;
                case -1383775345:
                case 893688078:
                    AbstractC3624.m11755();
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0619.m2761("ۜۜ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 10441) ^ 1848261660;
                        i9 = 927730368;
                    } else {
                        iM3169 = C0619.m2761("ܿۗ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-22701)) ^ 115962597;
                        i9 = 209127929;
                    }
                    break;
                case -1293799883:
                case -79502370:
                    i3 = 24831;
                    iM3169 = (C0773.m3169("᩻ۜ") ^ i7) * 67;
                    i8 = ((iM3169 ^ i6) * (-27099)) ^ 1901291420;
                    i9 = -1618333027;
                    break;
                case -1096368376:
                case 227769333:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i6;
                        i8 = ((iM3169 ^ i7) * 11675) ^ 2019814077;
                        i9 = 1070460854;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۗ") + i7) * 89;
                        i8 = ((iM3169 ^ i6) * (-7979)) ^ 1371806543;
                        i9 = 2040902564;
                    }
                    break;
                case -1049455383:
                case -677266456:
                    i3 = 19885;
                    iM3169 = (C0773.m3169("᩻ۜ") ^ i7) * 67;
                    i8 = ((iM3169 ^ i6) * (-27099)) ^ 1901291420;
                    i9 = -1618333027;
                    break;
                case -765833233:
                case 1167433344:
                    s2 = 18304;
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0773.m3169("᩻֨") ^ i7) * (-53);
                        i8 = ((iM3169 ^ i6) * (-493)) ^ (-441140381);
                        i9 = -1528223502;
                    } else {
                        iM3169 = (i7 - C0773.m3169("᩷᩹")) * (-75);
                        i8 = ((iM3169 ^ i6) * (-11447)) ^ 1589678970;
                        i9 = 1633319081;
                    }
                    break;
                case -606001646:
                case 1144688078:
                    return AbstractC3624.m11769(sArr2, i4, 20, i3);
                case -302525801:
                case 818134973:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۜۜ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 10441) ^ 1848261660;
                        i9 = 927730368;
                    } else {
                        iM3169 = (C0773.m3169("ۘۨ") ^ i7) * 21;
                        i8 = ((iM3169 ^ i6) * 22109) ^ 421876436;
                        i9 = 128022918;
                    }
                    break;
                case 277583996:
                case 2045971808:
                    if (!RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("᩻֨") ^ i7) * (-53);
                        i8 = ((iM3169 ^ i6) * (-493)) ^ (-441140381);
                        i9 = -1528223502;
                    } else {
                        iM3169 = (C0619.m2761("ۜۜ") + i6) * (-107);
                        i8 = ((iM3169 ^ i7) * 10441) ^ 1848261660;
                        i9 = 927730368;
                    }
                    break;
                case 590444190:
                case 1671264385:
                    C2419.m8174();
                    return null;
                case 877786282:
                case 971024428:
                    if ((s * s2) - i2 <= 0) {
                        iM3169 = (C0619.m2761("᩶᩶") ^ i6) * (-3);
                        i8 = ((iM3169 ^ i7) * 7439) ^ (-1315604793);
                        i9 = -1285754998;
                    } else {
                        iM3169 = C0619.m2761("ۚܿ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 4809) ^ 712908976;
                        i9 = -737894300;
                    }
                    break;
                case 913413501:
                case 964368609:
                    s = sArr[c];
                    i = s * s;
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i6;
                        i8 = ((iM3169 ^ i7) * 11675) ^ 2019814077;
                        i9 = 1070460854;
                    } else {
                        iM3169 = C0773.m3169("ۘۤ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-8847)) ^ (-1865980368);
                        i9 = -1335422037;
                    }
                    break;
                default:
                    c = '\b';
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("۟ۜ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 18695) ^ 1584671708;
                        i9 = 949311211;
                    } else {
                        iM3169 = (C0773.m3169("ܿۛ") ^ i7) * 7;
                        i8 = ((iM3169 ^ i6) * (-1199)) ^ (-100746592);
                        i9 = 705313922;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginName() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -1383100315;
        int i6 = C4238.f15451;
        int i7 = C3690.f12684;
        int iM2761 = C0619.m2761("۟ۤ") ^ i7;
        int i8 = ((iM2761 ^ i6) * 3671) ^ 1875668053;
        int i9 = 554861400;
        while (true) {
            i5 = ((((i5 ^ i6) * 2575) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2141093832:
                case -457577915:
                    sArr2 = f58644;
                    i4 = 30;
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩷") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM2761 ^ i6) * 11427) ^ 1986062278;
                        i9 = -135316172;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ᩴۨ")) * q.h;
                        i8 = ((iM2761 ^ i6) * (-10143)) ^ (-1676741711);
                        i9 = 732470996;
                    }
                    break;
                case -1926669737:
                case -146576175:
                    c = 29;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩷") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM2761 ^ i6) * 11427) ^ 1986062278;
                        i9 = -135316172;
                    } else {
                        iM2761 = C0773.m3169("ۤ۫") ^ i6;
                        i8 = ((iM2761 ^ i7) * 1137) ^ (-496697553);
                        i9 = 1937596249;
                    }
                    break;
                case -1868841880:
                case 1991631020:
                    return C17202.m40377(sArr2, i4, 6, i3);
                case -1596377121:
                case -919608753:
                    i = s * s2;
                    s3 = 1866;
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("ܺ۫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23035) ^ (-1318862867);
                        i9 = 1552084539;
                    } else {
                        iM2761 = (C0773.m3169("ܿ᩹") ^ i6) * 85;
                        i8 = ((iM2761 ^ i7) * 15081) ^ 881040405;
                        i9 = -459441194;
                    }
                    break;
                case -1507894225:
                case 1651591594:
                    C3448.m11248();
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩷") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM2761 ^ i6) * 11427) ^ 1986062278;
                        i9 = -135316172;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۗ") + i6) * 25;
                        i8 = ((iM2761 ^ i7) * 24193) ^ 760062074;
                        i9 = -153611290;
                    }
                    break;
                case -1288062298:
                case 157165994:
                    i3 = 19086;
                    iM2761 = (i7 - C0619.m2761("ۗܽ")) * 93;
                    i8 = ((iM2761 ^ i6) * 5959) ^ (-231111104);
                    i9 = 985070903;
                    break;
                case -1193053158:
                case -899360138:
                    C2966.m9664();
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0773.m3169("ᩴ᩷") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM2761 ^ i6) * 11427) ^ 1986062278;
                        i9 = -135316172;
                    } else {
                        iM2761 = C0773.m3169("᩹᩻") ^ i6;
                        i8 = ((iM2761 ^ i7) * 11899) ^ 982785541;
                        i9 = 1894627294;
                    }
                    break;
                case -1178651207:
                case -967195179:
                    C0773.m3161();
                    C3492.m11488();
                    return null;
                case -976568585:
                case 526414646:
                    s = sArr[c];
                    s2 = 7464;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ܺ۫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23035) ^ (-1318862867);
                        i9 = 1552084539;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩶") ^ i7;
                        i8 = ((iM2761 ^ i6) * 14859) ^ 189035570;
                        i9 = -1641380144;
                    }
                    break;
                case -806662173:
                case -219894200:
                    if ((i2 * i2) - i >= 0) {
                        iM2761 = C0619.m2761("᩸۫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23319) ^ 2067917080;
                        i9 = 256867558;
                    } else {
                        iM2761 = C0619.m2761("ۘܺ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-5349)) ^ 132155781;
                        i9 = 93215981;
                    }
                    break;
                case -798078836:
                case 1719489072:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩷") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM2761 ^ i6) * 11427) ^ 1986062278;
                        i9 = -135316172;
                    } else {
                        iM2761 = (C0619.m2761("ܳۘ") ^ i7) * (-115);
                        i8 = ((iM2761 ^ i6) * 24993) ^ 1897724686;
                        i9 = 899848182;
                    }
                    break;
                case -757736385:
                case 617494831:
                    C2354.m7983();
                    iM2761 = C0773.m3169("᩹᩻") ^ i6;
                    i8 = ((iM2761 ^ i7) * 11899) ^ 982785541;
                    i9 = 1894627294;
                    break;
                case -467714310:
                case 510889684:
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("ۡۖ") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM2761 ^ i7) * (-2757)) ^ 2115165858;
                        i9 = -1802086756;
                    } else {
                        iM2761 = C0619.m2761("ܳ۟") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-5863)) ^ (-1832532223);
                        i9 = 1485763932;
                    }
                    break;
                case -364385769:
                case 1908329376:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ۡۖ") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM2761 ^ i7) * (-2757)) ^ 2115165858;
                        i9 = -1802086756;
                    } else {
                        iM2761 = (i6 - C0619.m2761("֫ۗ")) * 31;
                        i8 = ((iM2761 ^ i7) * 21307) ^ 1423262719;
                        i9 = -1006275591;
                    }
                    break;
                case -272488949:
                case 1335473465:
                    i2 = s + s3;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("᩹᩻") ^ i6;
                        i8 = ((iM2761 ^ i7) * 11899) ^ 982785541;
                        i9 = 1894627294;
                    } else {
                        iM2761 = C0619.m2761("ۙܰ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 17967) ^ (-145077815);
                        i9 = 2036115901;
                    }
                    break;
                case 320731367:
                case 1947100353:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ܺ۫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 23035) ^ (-1318862867);
                        i9 = 1552084539;
                    } else {
                        iM2761 = (C0773.m3169("ۧ᩵") ^ i7) * 47;
                        i8 = ((iM2761 ^ i6) * (-20375)) ^ 982898948;
                        i9 = 1694133125;
                    }
                    break;
                case 534845917:
                case 1621956348:
                    sArr = f58644;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩷") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM2761 ^ i6) * 11427) ^ 1986062278;
                        i9 = -135316172;
                    } else {
                        iM2761 = C0619.m2761("᩷ܶ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-7231)) ^ (-846563728);
                        i9 = -1027972489;
                    }
                    break;
                case 787328981:
                case 1491742588:
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = (C0619.m2761("ۡۖ") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM2761 ^ i7) * (-2757)) ^ 2115165858;
                        i9 = -1802086756;
                    } else {
                        iM2761 = C0773.m3169("᩹᩻") ^ i6;
                        i8 = ((iM2761 ^ i7) * 11899) ^ 982785541;
                        i9 = 1894627294;
                    }
                    break;
                default:
                    i3 = 47000;
                    iM2761 = (i7 - C0619.m2761("ۗܽ")) * 93;
                    i8 = ((iM2761 ^ i6) * 5959) ^ (-231111104);
                    i9 = 985070903;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final int getPluginSdkVersion() {
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0168 A[PHI: r5 r7
      0x0168: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:55:0x0166, B:47:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x0168: PHI (r7v3 short) = (r7v2 short), (r7v4 short) binds: [B:55:0x0166, B:47:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a1 A[PHI: r3 r4 r6
      0x01a1: PHI (r3v4 short) = (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:59:0x019f, B:51:0x0146, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:59:0x019f, B:51:0x0146, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r6v5 int) = (r6v2 int), (r6v4 int), (r6v2 int) binds: [B:59:0x019f, B:51:0x0146, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f2 A[PHI: r1 r2
      0x01f2: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:67:0x01f0, B:63:0x01d2, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char) binds: [B:67:0x01f0, B:63:0x01d2, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (l.C3779.m12264() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (l.C2878.f9462 != false) goto L11;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17905.getString(java.lang.String):java.lang.String");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final int getPluginVersionCode() {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginVersionName() {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getHostPackageName() {
        return C21576.m49092();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final boolean setClipboardText(CharSequence charSequence, String str) {
        int i = -1218897926;
        int i2 = C20932.f66974;
        int i3 = C3492.f12043;
        int iM3169 = (C0773.m3169("ܰ۬") ^ i3) * 101;
        int i4 = ((iM3169 ^ i2) * 9367) ^ (-1183393098);
        int i5 = 269355352;
        while (true) {
            i = ((((i ^ i2) * 7247) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1851540942:
                case 1254606095:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * (-5477)) ^ (-776663390);
                        i5 = -2014749846;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۜ۠")) * (-5);
                        i4 = ((iM3169 ^ i2) * (-23083)) ^ (-286037066);
                        i5 = 1240860672;
                    }
                    break;
                case -1839900089:
                case 82294396:
                    C0619.m2763();
                    if (C3448.m11248() == 0) {
                        iM3169 = (C0619.m2761("᩻ۗ") + i2) * 61;
                        i4 = ((iM3169 ^ i3) * 2685) ^ (-1961574152);
                        i5 = 1585571799;
                    } else {
                        iM3169 = (C0619.m2761("ܿ۟") ^ i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 12489) ^ (-1935291794);
                        i5 = -754390522;
                    }
                    break;
                case -1421191882:
                case 844804904:
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۧۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18521) ^ 1517147660;
                        i5 = 1376018126;
                    } else {
                        iM3169 = (C0773.m3169("ܰۖ") + i2) * (-47);
                        i4 = ((iM3169 ^ i3) * (-15401)) ^ (-827846555);
                        i5 = 551202919;
                    }
                    break;
                case -1285832970:
                case 596687683:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("֡ۙ") + i3) * (-111);
                        i4 = ((iM3169 ^ i2) * 5261) ^ 438457712;
                        i5 = -1679022165;
                    } else {
                        iM3169 = (C0619.m2761("۬ۤ") + i2) * (-67);
                        i4 = ((iM3169 ^ i3) * (-29219)) ^ 208467261;
                        i5 = -2031465530;
                    }
                    break;
                case -890415318:
                case 1128018814:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * (-5477)) ^ (-776663390);
                        i5 = -2014749846;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܳۧ")) * (-113);
                        i4 = ((iM3169 ^ i2) * 16651) ^ (-1668714625);
                        i5 = 320528728;
                    }
                    break;
                case -869317606:
                case -854832434:
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * (-5477)) ^ (-776663390);
                        i5 = -2014749846;
                    } else {
                        iM3169 = (C0619.m2761("ܿ۟") ^ i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 12489) ^ (-1935291794);
                        i5 = -754390522;
                    }
                    break;
                case -737869133:
                case -265035151:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * (-5477)) ^ (-776663390);
                        i5 = -2014749846;
                    } else {
                        iM3169 = C0619.m2761("۠ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3235)) ^ 1177594903;
                        i5 = -897142788;
                    }
                    break;
                case -708496985:
                case 1930088795:
                    if (C3077.m10041()) {
                        iM3169 = (C0619.m2761("᩻ۗ") + i2) * 61;
                        i4 = ((iM3169 ^ i3) * 2685) ^ (-1961574152);
                        i5 = 1585571799;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۖۙ")) * (-39);
                        i4 = ((iM3169 ^ i3) * 9309) ^ 1451253648;
                        i5 = -1510208112;
                    }
                    break;
                case -646910159:
                case 1310169358:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ܿ۟") ^ i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 12489) ^ (-1935291794);
                        i5 = -754390522;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۚ᩻")) * (-79);
                        i4 = ((iM3169 ^ i3) * 12235) ^ 987102680;
                        i5 = -516343303;
                    }
                    break;
                case -552416542:
                case 321719197:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("ܰۖ") + i2) * (-47);
                        i4 = ((iM3169 ^ i3) * (-15401)) ^ (-827846555);
                        i5 = 551202919;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۘ") ^ i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-2923)) ^ 683703102;
                        i5 = -357649690;
                    }
                    break;
                case -268644491:
                case 740001501:
                    throw new UnsupportedOperationException();
                case -234821124:
                case 89198299:
                    C1564.m5509();
                    C2375.m8065();
                    iM3169 = (C0619.m2761("ܿ۟") ^ i3) * (-11);
                    i4 = ((iM3169 ^ i2) * 12489) ^ (-1935291794);
                    i5 = -754390522;
                    break;
                case -144680485:
                case 763415469:
                    C4282.m13644();
                    return false;
                case 707719069:
                case 1201727594:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("֡ۙ") + i3) * (-111);
                        i4 = ((iM3169 ^ i2) * 5261) ^ 438457712;
                        i5 = -1679022165;
                    } else {
                        iM3169 = C0773.m3169("ܺۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30131)) ^ (-1320644620);
                        i5 = 412523891;
                    }
                    break;
                case 953296566:
                case 1829823658:
                    C4238.m13540();
                    if (RunnableC3055.m9933() == 0) {
                        iM3169 = (C0773.m3169("֡ۙ") + i3) * (-111);
                        i4 = ((iM3169 ^ i2) * 5261) ^ 438457712;
                        i5 = -1679022165;
                    } else {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * (-5477)) ^ (-776663390);
                        i5 = -2014749846;
                    }
                    break;
                default:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("֡ۙ") + i3) * (-111);
                        i4 = ((iM3169 ^ i2) * 5261) ^ 438457712;
                        i5 = -1679022165;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܿ") ^ i2) * 67;
                        i4 = ((iM3169 ^ i3) * 26355) ^ (-2140558050);
                        i5 = 2001770425;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01c6 A[PHI: r2 r3 r4 r9
      0x01c6: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short), (r2v1 short) binds: [B:56:0x01c4, B:44:0x0155, B:40:0x0134, B:21:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:56:0x01c4, B:44:0x0155, B:40:0x0134, B:21:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r4v4 int) = (r4v1 int), (r4v1 int), (r4v3 int), (r4v1 int) binds: [B:56:0x01c4, B:44:0x0155, B:40:0x0134, B:21:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v3 int) binds: [B:56:0x01c4, B:44:0x0155, B:40:0x0134, B:21:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x022a A[PHI: r1 r7 r8
      0x022a: PHI (r1v4 char) = (r1v1 char), (r1v3 char), (r1v1 char), (r1v1 char) binds: [B:64:0x0228, B:48:0x0175, B:25:0x008b, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r7v3 short[]) = (r7v1 short[]), (r7v1 short[]), (r7v2 short[]), (r7v1 short[]) binds: [B:64:0x0228, B:48:0x0175, B:25:0x008b, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:64:0x0228, B:48:0x0175, B:25:0x008b, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (l.C23916.f77426 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (l.C2288.m7767() != false) goto L14;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void log(java.lang.Throwable r18) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17905.log(java.lang.Throwable):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03dd A[PHI: r17 r21 r23
      0x03dd: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char) binds: [B:100:0x03db, B:94:0x0392, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r21v31 short) = (r21v3 short), (r21v4 short), (r21v32 short) binds: [B:100:0x03db, B:94:0x0392, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r23v23 int) = (r23v3 int), (r23v4 int), (r23v24 int) binds: [B:100:0x03db, B:94:0x0392, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:70:0x027f A[PHI: r2 r3 r21 r23
      0x027f: PHI (r2v9 int) = (r2v4 int), (r2v2 int), (r2v2 int) binds: [B:69:0x027d, B:60:0x01fa, B:41:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r3v6 int) = (r3v4 int), (r3v2 int), (r3v2 int) binds: [B:69:0x027d, B:60:0x01fa, B:41:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r21v20 short) = (r21v11 short), (r21v14 short), (r21v21 short) binds: [B:69:0x027d, B:60:0x01fa, B:41:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r23v18 int) = (r23v10 int), (r23v12 int), (r23v19 int) binds: [B:69:0x027d, B:60:0x01fa, B:41:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x03ab A[PHI: r10 r16 r21 r23
      0x03ab: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:52:0x0199, B:18:0x0083, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v7 short[]) binds: [B:52:0x0199, B:18:0x0083, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r21v36 short) = (r21v16 short), (r21v26 short), (r21v40 short) binds: [B:52:0x0199, B:18:0x0083, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r23v27 int) = (r23v14 int), (r23v22 int), (r23v29 int) binds: [B:52:0x0199, B:18:0x0083, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.PluginContext
    public final String getStringNullable(String str) {
        int i;
        int iM3169;
        int i2;
        int i3;
        int iM2761;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM2762;
        int i8 = C0269.f1558;
        int i9 = C1826.f6190;
        int iM2763 = (C0619.m2761("᩹᩵") ^ i8) * (-55);
        int i10 = ((iM2763 ^ i9) * 14683) ^ 448602170;
        String strM5124 = null;
        short[] sArr = null;
        int i11 = iM2763 ^ (-226232807);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = -223997713;
        short s2 = 0;
        short[] sArr2 = null;
        String strM2824 = null;
        String strM11770 = null;
        String str2 = null;
        int iM28315 = 0;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i9) * 6435) >> 31));
            switch (i18) {
                case -1947433816:
                case 1799773460:
                    C3033.m9845();
                    if (C3734.f12817 >= 0) {
                        s = s;
                        iM2761 = C0619.m2761("ᩴۘ") ^ i8;
                        i2 = ((iM2761 ^ i9) * 26413) ^ (-1697047966);
                        i4 = -19345911;
                        i5 = iM2761 ^ i4;
                        s = s;
                        i11 = i5;
                        i10 = i2;
                    }
                    s = s;
                    i15 = i15;
                    iM3169 = C0619.m2761("۟֫") ^ i8;
                    i2 = ((iM3169 ^ i9) * 1695) ^ (-1952852207);
                    i3 = -2028692936;
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -1725150657:
                case 1974583585:
                    s = s;
                    i15 = i15;
                    c = '7';
                    if (C17202.f56030) {
                        iM3169 = (i9 - C0619.m2761("ۧۘ")) * 49;
                        i2 = ((iM3169 ^ i8) * (-17131)) ^ 136128620;
                        i3 = -1630442354;
                    } else {
                        iM3169 = (C0773.m3169("֫֫") ^ i8) * 127;
                        i2 = ((iM3169 ^ i9) * 17323) ^ (-1149882717);
                        i3 = 1575297938;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -1712573984:
                case -4527200:
                    i14 = 45858;
                    iM3169 = C0619.m2761("ܿ֫") ^ i9;
                    i2 = ((iM3169 ^ i8) * 27463) ^ 1418146352;
                    i3 = 163134176;
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -1703018051:
                case -21493729:
                    s = s;
                    i15 = i15;
                    sArr = f58644;
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("۟֫") ^ i8;
                        i2 = ((iM3169 ^ i9) * 1695) ^ (-1952852207);
                        i3 = -2028692936;
                    } else {
                        iM3169 = C0773.m3169("֨ۢ") ^ i8;
                        i2 = ((iM3169 ^ i9) * 20541) ^ (-1391166938);
                        i3 = 1537298404;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -1585534600:
                case 368083683:
                    s = s;
                    i15 = i15;
                    strM11770 = AbstractC3624.m11770(strM5124, i12, iM28315);
                    strM2824 = AbstractC0641.m2824(strM5124, iM28315 + i13);
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0773.m3169("ۚۤ") + i9) * 37;
                        i2 = ((iM3169 ^ i8) * (-9329)) ^ 328159274;
                        i3 = -33132799;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩹") ^ i9;
                        i2 = ((iM3169 ^ i8) * (-28707)) ^ 1593811565;
                        i3 = -23339975;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -1551362776:
                case 776004542:
                    s = s;
                    i15 = i15;
                    if (C4282.m13656(str, i12) == '{') {
                        iM3169 = (C0619.m2761("ܺܳ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM3169 ^ i9) * (-21959)) ^ 535184915;
                        i3 = -1896256082;
                    } else {
                        strM5124 = str;
                        iM3169 = C0619.m2761("۟֡") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-6643)) ^ 1618015516;
                        i3 = 506703716;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -1470965621:
                case -320842570:
                    C3998.m12920();
                    return null;
                case -1468760518:
                case 852955961:
                    return C5448.f19037.getOrDefault(strM5124, str2);
                case -1427477363:
                case 573434577:
                    s = s;
                    i15 = i15;
                    if (i15 - (i16 + i17) > 0) {
                        iM3169 = (i9 - C0773.m3169("᩶ۖ")) * (-121);
                        i2 = ((iM3169 ^ i8) * 4083) ^ 1968262314;
                        i3 = -925018095;
                    } else {
                        iM3169 = (i8 - C0619.m2761("ᩴۨ")) * 53;
                        i2 = ((iM3169 ^ i9) * 13235) ^ 836408385;
                        i3 = -380526232;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -1361071236:
                case -778212110:
                    if (C11235.f35427 < 0) {
                        s = s;
                        i15 = i15;
                        iM3169 = C0619.m2761("۟֫") ^ i8;
                        i2 = ((iM3169 ^ i9) * 1695) ^ (-1952852207);
                        i3 = -2028692936;
                        i5 = iM3169 ^ i3;
                        s = s;
                        i15 = i15;
                        i11 = i5;
                    } else {
                        int iM2764 = (C0619.m2761("ᩳۘ") ^ i9) * (-39);
                        i2 = ((iM2764 ^ i8) * (-31521)) ^ (-2007891299);
                        i11 = iM2764 ^ (-228480854);
                    }
                    i10 = i2;
                    break;
                case -1247969463:
                case 1044276065:
                    return str2;
                case -1161281527:
                case 1695429498:
                    short[] sArr3 = f58644;
                    s = s;
                    if (AbstractC3624.m11755() == 0) {
                        if (C3448.m11248() == 0) {
                            i15 = i15;
                            C5448.f19037 = new C17159(C1146.m4222(sArr3, 60, 7, i14));
                            iM3169 = C0619.m2761("ۚ᩺") ^ i9;
                            i2 = ((iM3169 ^ i8) * (-899)) ^ (-83414597);
                            i3 = 1446170174;
                            i5 = iM3169 ^ i3;
                            s = s;
                            i15 = i15;
                            i11 = i5;
                            i10 = i2;
                        }
                        i15 = i15;
                        iM3169 = (C0773.m3169("֫֫") ^ i8) * 127;
                        i2 = ((iM3169 ^ i9) * 17323) ^ (-1149882717);
                        i3 = 1575297938;
                        i5 = iM3169 ^ i3;
                        s = s;
                        i15 = i15;
                        i11 = i5;
                        i10 = i2;
                    } else {
                        i = i15;
                        s = s;
                        iM2762 = (C0619.m2761("ۙۡ") + i9) * 67;
                        i7 = ((iM2762 ^ i8) * 29959) ^ 2009855844;
                        i6 = 2145465201;
                        i11 = iM2762 ^ i6;
                        i10 = i7;
                        i15 = i;
                    }
                    break;
                case -1152634559:
                case 1708402425:
                    strM5124 = C1402.m5124(i13, i13, str);
                    s = s;
                    i15 = i15;
                    iM3169 = C0619.m2761("۟֡") ^ i8;
                    i2 = ((iM3169 ^ i9) * (-6643)) ^ 1618015516;
                    i3 = 506703716;
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -823290547:
                case 49700791:
                    s = s;
                    i15 = i15;
                    i17 = 106172416;
                    if (C2834.f9334 > 0) {
                        iM3169 = C0619.m2761("۟֨") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-31657)) ^ 24101083;
                        i3 = -2052313541;
                        i5 = iM3169 ^ i3;
                        s = s;
                        i15 = i15;
                        i11 = i5;
                        i10 = i2;
                    } else {
                        i15 = i15;
                        iM2761 = C0619.m2761("ᩴۘ") ^ i8;
                        i2 = ((iM2761 ^ i9) * 26413) ^ (-1697047966);
                        i4 = -19345911;
                        i5 = iM2761 ^ i4;
                        s = s;
                        i11 = i5;
                        i10 = i2;
                    }
                    break;
                case -781858888:
                case 1224906889:
                    i = i15;
                    s2 = sArr2[c];
                    s = 20608;
                    if (RunnableC3646.f12471) {
                        iM2762 = (C0619.m2761("ۙۡ") + i9) * 67;
                        i7 = ((iM2762 ^ i8) * 29959) ^ 2009855844;
                        i6 = 2145465201;
                    } else {
                        iM2762 = C0773.m3169("֡ۛ") ^ i8;
                        i7 = ((iM2762 ^ i9) * (-8773)) ^ (-340427738);
                        i6 = 299530411;
                    }
                    i11 = iM2762 ^ i6;
                    i10 = i7;
                    i15 = i;
                    break;
                case -754889626:
                case 399819676:
                    if (!C0619.m2763()) {
                        s = s;
                        i15 = i15;
                        iM3169 = (C0773.m3169("֫֫") ^ i8) * 127;
                        i2 = ((iM3169 ^ i9) * 17323) ^ (-1149882717);
                        i3 = 1575297938;
                        i5 = iM3169 ^ i3;
                        s = s;
                        i15 = i15;
                        i11 = i5;
                        i10 = i2;
                    }
                    s = s;
                    i15 = i15;
                    iM3169 = (C0773.m3169("ۚۤ") + i9) * 37;
                    i2 = ((iM3169 ^ i8) * (-9329)) ^ 328159274;
                    i3 = -33132799;
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -642640468:
                case 628963394:
                    s = s;
                    i15 = i15;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("֫֫") ^ i8) * 127;
                        i2 = ((iM3169 ^ i9) * 17323) ^ (-1149882717);
                        i3 = 1575297938;
                    } else {
                        iM3169 = (C0773.m3169("ۗܽ") ^ i9) * 59;
                        i2 = ((iM3169 ^ i8) * 23305) ^ 1988141551;
                        i3 = -1158085410;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case -125833133:
                case 775956685:
                    return ((C17159) C5448.m16285()).getOrDefault(strM2824, str2);
                case 35591575:
                case 1834807115:
                    s = s;
                    i15 = i15;
                    if (C3077.m10045(str) >= 3) {
                        int iM31610 = (C0773.m3169("۠ۛ") + i8) * 29;
                        s = s;
                        i15 = i15;
                        i13 = 1;
                        i11 = iM31610 ^ (-124767270);
                        i10 = ((iM31610 ^ i9) * (-27807)) ^ (-249299613);
                        i12 = 0;
                    } else {
                        i12 = 0;
                        i13 = 1;
                        strM5124 = str;
                        iM3169 = C0619.m2761("۟֡") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-6643)) ^ 1618015516;
                        i3 = 506703716;
                        i5 = iM3169 ^ i3;
                        s = s;
                        i15 = i15;
                        i11 = i5;
                        i10 = i2;
                    }
                    break;
                case 251222662:
                case 377459842:
                    s = s;
                    i15 = i15;
                    if (RunnableC3646.m11801(i13, str) == '}') {
                        iM3169 = (C0773.m3169("ᩴܳ") + i9) * 13;
                        i2 = ((iM3169 ^ i8) * 27721) ^ 1274157825;
                        i3 = -1535011409;
                    } else {
                        strM5124 = str;
                        iM3169 = C0619.m2761("۟֡") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-6643)) ^ 1618015516;
                        i3 = 506703716;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case 282582583:
                case 1487582973:
                    s = s;
                    i15 = i15;
                    if (C5448.f19037 == null) {
                        iM3169 = (i8 - C0619.m2761("᩶ܶ")) * (-3);
                        i2 = ((iM3169 ^ i9) * 28313) ^ (-1079890601);
                        i3 = 389798233;
                    } else {
                        iM3169 = C0619.m2761("ۚ᩺") ^ i9;
                        i2 = ((iM3169 ^ i8) * (-899)) ^ (-83414597);
                        i3 = 1446170174;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case 297874126:
                case 564390031:
                    i14 = 7637;
                    iM3169 = C0619.m2761("ܿ֫") ^ i9;
                    i2 = ((iM3169 ^ i8) * 27463) ^ 1418146352;
                    i3 = 163134176;
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case 527550866:
                case 775270803:
                    C3448.m11248();
                    if (C1321.f4751 < 0) {
                        int iM2765 = (C0619.m2761("ᩳۘ") ^ i9) * (-39);
                        i2 = ((iM2765 ^ i8) * (-31521)) ^ (-2007891299);
                        i11 = iM2765 ^ (-228480854);
                    } else {
                        s = s;
                        i15 = i15;
                        iM3169 = (C0773.m3169("ۚۤ") + i9) * 37;
                        i2 = ((iM3169 ^ i8) * (-9329)) ^ 328159274;
                        i3 = -33132799;
                        i5 = iM3169 ^ i3;
                        s = s;
                        i15 = i15;
                        i11 = i5;
                    }
                    i10 = i2;
                    break;
                case 651799773:
                case 1961320897:
                    s = s;
                    i15 = i15;
                    if (C2419.m8175(strM11770, C3492.m11486(sArr, 56, 4, i14))) {
                        iM3169 = (C0773.m3169("۠۟") ^ i8) * 99;
                        i2 = ((iM3169 ^ i9) * (-18045)) ^ (-28946485);
                        i3 = 1718359917;
                    } else {
                        iM3169 = (C0773.m3169("᩵ܺ") ^ i9) * (-29);
                        i2 = ((iM3169 ^ i8) * 23411) ^ 1719923155;
                        i3 = 611087887;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case 668865438:
                case 1050433006:
                    s = s;
                    i15 = s2 * s;
                    i16 = s2 * s2;
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i8;
                        i2 = ((iM2761 ^ i9) * 26413) ^ (-1697047966);
                        i4 = -19345911;
                    } else {
                        iM2761 = (C0619.m2761("۟ܳ") ^ i9) * 89;
                        i2 = ((iM2761 ^ i8) * 25977) ^ 779478750;
                        i4 = 285622252;
                    }
                    i5 = iM2761 ^ i4;
                    s = s;
                    i11 = i5;
                    i10 = i2;
                    break;
                case 687682166:
                case 1385509752:
                    C3690.m11987();
                    s = s;
                    i15 = i15;
                    iM3169 = C0619.m2761("۟֫") ^ i8;
                    i2 = ((iM3169 ^ i9) * 1695) ^ (-1952852207);
                    i3 = -2028692936;
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                case 829812185:
                case 1825342807:
                    s = s;
                    i15 = i15;
                    iM28315 = C11235.m28315(strM5124, 58);
                    str2 = null;
                    if (iM28315 == -1) {
                        iM3169 = (i9 - C0619.m2761("᩻ۜ")) * (-51);
                        i2 = ((iM3169 ^ i8) * 15437) ^ (-1280611017);
                        i3 = -1101977965;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۗ") + i9) * (-97);
                        i2 = ((iM3169 ^ i8) * (-439)) ^ (-1833213089);
                        i3 = 1653826499;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
                default:
                    s = s;
                    i15 = i15;
                    sArr2 = f58644;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("۟֫") ^ i8;
                        i2 = ((iM3169 ^ i9) * 1695) ^ (-1952852207);
                        i3 = -2028692936;
                    } else {
                        iM3169 = (i8 - C0619.m2761("᩵ۢ")) * (-21);
                        i2 = ((iM3169 ^ i9) * (-5765)) ^ (-1163666811);
                        i3 = 1791532199;
                    }
                    i5 = iM3169 ^ i3;
                    s = s;
                    i15 = i15;
                    i11 = i5;
                    i10 = i2;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getString(String str, Object... objArr) {
        int i = 1495213404;
        int i2 = C2419.f7754;
        int i3 = C1080.f3865;
        int iM2761 = C0619.m2761("ۢۢ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 21473) ^ (-1553708228);
        int i5 = -1346395171;
        while (true) {
            i = ((((i ^ i3) * 14137) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1777666882:
                case -1218504782:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0619.m2761("ۜ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6743) ^ (-489236914);
                        i5 = 1811083949;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12697)) ^ 1919839750;
                        i5 = -1593567351;
                    }
                    break;
                case -1374511893:
                case -476767903:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ܽ֫")) * (-49);
                        i4 = ((iM2761 ^ i3) * 25779) ^ 1040251676;
                        i5 = -984702523;
                    } else {
                        iM2761 = C0619.m2761("ᩳ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7515)) ^ 1896236546;
                        i5 = -1245822158;
                    }
                    break;
                case -1200373565:
                case 524981108:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("ܺ᩵") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * 19339) ^ 1715487252;
                        i5 = -354595851;
                    } else {
                        iM2761 = C0773.m3169("ۤۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21961)) ^ (-1366231148);
                        i5 = 1720233127;
                    }
                    break;
                case -910975271:
                case 611409025:
                    if (C20932.m47848() != 0) {
                        iM2761 = C0619.m2761("ۜ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6743) ^ (-489236914);
                        i5 = 1811083949;
                    } else {
                        iM2761 = (C0773.m3169("۠ۡ") ^ i3) * 43;
                        i4 = ((iM2761 ^ i2) * (-29313)) ^ (-1000702009);
                        i5 = -1272946885;
                    }
                    break;
                case -654183576:
                case 1835906872:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("ۜ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6743) ^ (-489236914);
                        i5 = 1811083949;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢ᩹")) * 67;
                        i4 = ((iM2761 ^ i2) * (-745)) ^ (-1602629549);
                        i5 = -589893951;
                    }
                    break;
                case -477766598:
                case 8377181:
                    C3033.m9845();
                    return null;
                case -285232727:
                case 1230457943:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("۠ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1665)) ^ (-1089301775);
                        i5 = -60838787;
                    } else {
                        iM2761 = (C0619.m2761("۬᩵") ^ i2) * 41;
                        i4 = ((iM2761 ^ i3) * (-17637)) ^ 15469905;
                        i5 = -1233423421;
                    }
                    break;
                case 160054553:
                case 1545857748:
                    if (!C1146.m4231()) {
                        iM2761 = (i2 - C0773.m3169("ܽ֫")) * (-49);
                        i4 = ((iM2761 ^ i3) * 25779) ^ 1040251676;
                        i5 = -984702523;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6743) ^ (-489236914);
                        i5 = 1811083949;
                    }
                    break;
                case 174173749:
                case 2053287643:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۜ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6743) ^ (-489236914);
                        i5 = 1811083949;
                    } else {
                        iM2761 = C0619.m2761("ۘ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28895)) ^ 336536324;
                        i5 = -1556303898;
                    }
                    break;
                case 373655040:
                case 1036696352:
                    if (C0950.m3785() != 0) {
                        iM2761 = (C0773.m3169("ܺ᩵") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * 19339) ^ 1715487252;
                        i5 = -354595851;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۟۬")) * 95;
                        i4 = ((iM2761 ^ i2) * 2387) ^ (-807635446);
                        i5 = 1977757777;
                    }
                    break;
                case 421788617:
                case 667467287:
                    if (C1080.m4050()) {
                        iM2761 = C0773.m3169("ܳۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14887)) ^ 690034940;
                        i5 = 1970547719;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩵") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * 19339) ^ 1715487252;
                        i5 = -354595851;
                    }
                    break;
                case 577806600:
                case 1847134744:
                    RunnableC0334.m2063();
                    iM2761 = C0619.m2761("ۜ᩹") ^ i2;
                    i4 = ((iM2761 ^ i3) * 6743) ^ (-489236914);
                    i5 = 1811083949;
                    break;
                case 726381944:
                case 759059274:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("ܺ᩵") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * 19339) ^ 1715487252;
                        i5 = -354595851;
                    } else {
                        iM2761 = C0619.m2761("ۛۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17817)) ^ 1363791505;
                        i5 = 1136316791;
                    }
                    break;
                case 860442782:
                case 1794780310:
                    return C20889.m47732(getString(str), objArr);
                case 1885763610:
                case 1948811876:
                    C1826.m6301();
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0773.m3169("ܺ᩵") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * 19339) ^ 1715487252;
                        i5 = -354595851;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6743) ^ (-489236914);
                        i5 = 1811083949;
                    }
                    break;
                default:
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("ܳᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 32221) ^ 1620192114;
                        i5 = -1315142690;
                    } else {
                        iM2761 = C0619.m2761("۠ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1665)) ^ (-1089301775);
                        i5 = -60838787;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void showToastL(CharSequence charSequence) {
        int i = 553358290;
        int i2 = C23916.f77426;
        int i3 = C2702.f8586;
        int iM3169 = (C0773.m3169("᩹ۘ") + i2) * 57;
        int i4 = ((iM3169 ^ i3) * (-21377)) ^ 1810039629;
        int i5 = -25296573;
        while (true) {
            i = ((((i ^ i3) * 20827) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1951452513:
                case -140633166:
                    if (C2287.f7432 < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC12905(0, charSequence));
                    } else {
                        iM3169 = (C0773.m3169("֨۫") + i3) * 19;
                        i4 = ((iM3169 ^ i2) * (-32177)) ^ 256553750;
                        i5 = 870405068;
                    }
                    break;
                case -1899162682:
                case 1399996337:
                    if (!C1146.m4231()) {
                        iM3169 = (i3 - C0773.m3169("ۤܶ")) * (-117);
                        i4 = ((iM3169 ^ i2) * 25055) ^ (-2071333358);
                        i5 = 112612265;
                    } else {
                        iM3169 = (C0773.m3169("ܰۨ") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * 25767) ^ 1258798025;
                        i5 = 1035951415;
                    }
                    break;
                case -1668651982:
                case 1778486287:
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0773.m3169("᩺ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32491)) ^ 842067784;
                        i5 = 1500750754;
                    } else {
                        iM3169 = C0619.m2761("ᩳۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17775) ^ 1287765324;
                        i5 = 1524009702;
                    }
                    break;
                case -1512943004:
                case -717494001:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ۖۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10397) ^ (-2018538077);
                        i5 = 1771157225;
                    } else {
                        iM3169 = C0619.m2761("ܿۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4571) ^ (-1746567859);
                        i5 = 1357002979;
                    }
                    break;
                case -1416825457:
                case -967220954:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("᩺ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32491)) ^ 842067784;
                        i5 = 1500750754;
                    } else {
                        iM3169 = C0773.m3169("ܶܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26093)) ^ (-538916344);
                        i5 = -1901434067;
                    }
                    break;
                case -1364212402:
                case -1228596031:
                    C17202.m40372();
                    break;
                case -1270227450:
                case 1514005307:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤܶ")) * (-117);
                        i4 = ((iM3169 ^ i2) * 25055) ^ (-2071333358);
                        i5 = 112612265;
                    } else {
                        iM3169 = (C0773.m3169("۠᩺") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * 16865) ^ (-1027223068);
                        i5 = -1488830242;
                    }
                    break;
                case -588738599:
                case 1489908857:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("᩺ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32491)) ^ 842067784;
                        i5 = 1500750754;
                    } else {
                        iM3169 = (C0773.m3169("ۘۜ") + i3) * (-19);
                        i4 = ((iM3169 ^ i2) * 23851) ^ (-542036199);
                        i5 = 1250910927;
                    }
                    break;
                case -486322009:
                case 657681117:
                    C2878.m9491();
                    iM3169 = (C0773.m3169("ܰۨ") + i2) * (-115);
                    i4 = ((iM3169 ^ i3) * 25767) ^ 1258798025;
                    i5 = 1035951415;
                    break;
                case -483665170:
                case 1348854220:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ۖۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10397) ^ (-2018538077);
                        i5 = 1771157225;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۙ") ^ i2) * (-111);
                        i4 = ((iM3169 ^ i3) * (-19563)) ^ (-959199831);
                        i5 = -1537578048;
                    }
                    break;
                case -411290448:
                case 104857004:
                    C17159 c17159 = C5448.f19035;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤܶ")) * (-117);
                        i4 = ((iM3169 ^ i2) * 25055) ^ (-2071333358);
                        i5 = 112612265;
                    } else {
                        iM3169 = C0619.m2761("۟᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21991)) ^ (-819189039);
                        i5 = -1074785416;
                    }
                    break;
                case 21465282:
                case 1403644449:
                    C4238.m13540();
                    if (C20932.f66974 > 0) {
                        iM3169 = C0773.m3169("᩺ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32491)) ^ 842067784;
                        i5 = 1500750754;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۤܶ")) * (-117);
                        i4 = ((iM3169 ^ i2) * 25055) ^ (-2071333358);
                        i5 = 112612265;
                    }
                    break;
                case 314267538:
                case 1177040672:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("᩺ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32491)) ^ 842067784;
                        i5 = 1500750754;
                    } else {
                        iM3169 = C0619.m2761("֫ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5101) ^ (-465118571);
                        i5 = 232158998;
                    }
                    break;
                case 574841189:
                case 1169696292:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ܰۨ") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * 25767) ^ 1258798025;
                        i5 = 1035951415;
                    } else {
                        iM3169 = C0619.m2761("۫᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7921)) ^ (-148556177);
                        i5 = -54869440;
                    }
                    break;
                default:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = C0773.m3169("ۖۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10397) ^ (-2018538077);
                        i5 = 1771157225;
                    } else {
                        iM3169 = (C0773.m3169("ܰۨ") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * 25767) ^ 1258798025;
                        i5 = 1035951415;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void showToastL(CharSequence charSequence, Object... objArr) {
        String strM40332 = null;
        int i = -564934078;
        int i2 = C1564.f5401;
        int i3 = C0487.f2131;
        int iM2761 = C0619.m2761("᩵ܿ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-26187)) ^ (-578717776);
        int i5 = -1457342152;
        while (true) {
            i = ((((i ^ i2) * 23355) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2074187760:
                case 1991326333:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0773.m3169("ܳۜ") + i3) * 101;
                        i4 = ((iM2761 ^ i2) * (-25841)) ^ (-1151319155);
                        i5 = 204861678;
                    } else {
                        iM2761 = (C0619.m2761("ܽۜ") + i3) * (-59);
                        i4 = ((iM2761 ^ i2) * 18423) ^ 2147190043;
                        i5 = -1584551992;
                    }
                    break;
                case -1985564840:
                case 1861706899:
                    C0619.m2763();
                    if (C1542.m5459() < 0) {
                        iM2761 = (C0773.m3169("ܳۜ") + i3) * 101;
                        i4 = ((iM2761 ^ i2) * (-25841)) ^ (-1151319155);
                        i5 = 204861678;
                    } else {
                        iM2761 = (C0773.m3169("ᩴܽ") + i3) * (-113);
                        i4 = ((iM2761 ^ i2) * 17791) ^ (-1045641855);
                        i5 = 836760971;
                    }
                    break;
                case -1806858588:
                case 1906738241:
                    C0619.m2763();
                    C0950.m3785();
                    break;
                case -1792291136:
                case 139967717:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ۙ۠") ^ i3) * (-15);
                        i4 = ((iM2761 ^ i2) * (-15783)) ^ 359936597;
                        i5 = -1442905397;
                    } else {
                        iM2761 = (C0619.m2761("۠ܶ") ^ i3) * 27;
                        i4 = ((iM2761 ^ i2) * (-18137)) ^ (-860778528);
                        i5 = -104939185;
                    }
                    break;
                case -1467638049:
                case 236277118:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ۙ۠") ^ i3) * (-15);
                        i4 = ((iM2761 ^ i2) * (-15783)) ^ 359936597;
                        i5 = -1442905397;
                    } else {
                        iM2761 = (C0773.m3169("۟᩶") ^ i3) * 47;
                        i4 = ((iM2761 ^ i2) * (-15055)) ^ 1128942206;
                        i5 = 668055535;
                    }
                    break;
                case -1430573374:
                case 1779194766:
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0773.m3169("ܶ᩵") + i2) * 91;
                        i4 = ((iM2761 ^ i3) * (-23647)) ^ (-917757995);
                        i5 = -90080043;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۠ۡ")) * (-71);
                        i4 = ((iM2761 ^ i3) * 13255) ^ (-860217702);
                        i5 = 1506131268;
                    }
                    break;
                case -1339294683:
                case 574407585:
                    C17159 c17159 = C5448.f19035;
                    int i6 = 0;
                    if (C1146.m4231()) {
                        ThreadUtil.runOnUiThread(new RunnableC12905(i6, strM40332));
                    }
                    iM2761 = (C0773.m3169("ۙ۠") ^ i3) * (-15);
                    i4 = ((iM2761 ^ i2) * (-15783)) ^ 359936597;
                    i5 = -1442905397;
                    break;
                case -1152729376:
                case 958592571:
                    strM40332 = C17159.m40332(C1080.m4058(charSequence), objArr);
                    if (C3779.m12264()) {
                        iM2761 = (C0773.m3169("᩺ۧ") + i2) * (-5);
                        i4 = ((iM2761 ^ i3) * (-6077)) ^ (-1125649620);
                        i5 = 718508293;
                    } else {
                        iM2761 = (C0619.m2761("ۧ۫") + i2) * (-33);
                        i4 = ((iM2761 ^ i3) * (-16075)) ^ 296304751;
                        i5 = 448284366;
                    }
                    break;
                case -1102002870:
                case 856576143:
                    if (C0862.m3503()) {
                        iM2761 = (C0619.m2761("֨֡") + i3) * 71;
                        i4 = ((iM2761 ^ i2) * (-5027)) ^ 465258661;
                        i5 = 1727718894;
                    } else {
                        iM2761 = (C0773.m3169("ۙ۠") ^ i3) * (-15);
                        i4 = ((iM2761 ^ i2) * (-15783)) ^ 359936597;
                        i5 = -1442905397;
                    }
                    break;
                case -429519527:
                case 76592008:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0619.m2761("ۧ۫") + i2) * (-33);
                        i4 = ((iM2761 ^ i3) * (-16075)) ^ 296304751;
                        i5 = 448284366;
                    } else {
                        iM2761 = (C0773.m3169("۫۬") ^ i2) * 119;
                        i4 = ((iM2761 ^ i3) * (-24569)) ^ 1260454411;
                        i5 = 1422449473;
                    }
                    break;
                case 162060932:
                case 1645594701:
                    C0950.m3785();
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("ܶ᩵") + i2) * 91;
                        i4 = ((iM2761 ^ i3) * (-23647)) ^ (-917757995);
                        i5 = -90080043;
                    } else {
                        iM2761 = (C0773.m3169("ܳۜ") + i3) * 101;
                        i4 = ((iM2761 ^ i2) * (-25841)) ^ (-1151319155);
                        i5 = 204861678;
                    }
                    break;
                case 655196364:
                case 1279147755:
                    C20932.m47848();
                    iM2761 = (C0773.m3169("ᩴܽ") + i3) * (-113);
                    i4 = ((iM2761 ^ i2) * 17791) ^ (-1045641855);
                    i5 = 836760971;
                    break;
                case 687286343:
                case 1358791725:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("ۙ۠") ^ i3) * (-15);
                        i4 = ((iM2761 ^ i2) * (-15783)) ^ 359936597;
                        i5 = -1442905397;
                    } else {
                        iM2761 = (C0773.m3169("ܳۜ") + i3) * 101;
                        i4 = ((iM2761 ^ i2) * (-25841)) ^ (-1151319155);
                        i5 = 204861678;
                    }
                    break;
                case 1419582186:
                case 1507383014:
                    if (C2419.m8174() >= 0) {
                        iM2761 = (C0773.m3169("ᩴܽ") + i3) * (-113);
                        i4 = ((iM2761 ^ i2) * 17791) ^ (-1045641855);
                        i5 = 836760971;
                    } else {
                        iM2761 = (C0619.m2761("۟᩻") ^ i2) * (-93);
                        i4 = ((iM2761 ^ i3) * 10725) ^ (-1720218964);
                        i5 = -499888115;
                    }
                    break;
                default:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ᩴܽ") + i3) * (-113);
                        i4 = ((iM2761 ^ i2) * 17791) ^ (-1045641855);
                        i5 = 836760971;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩸ۛ")) * 127;
                        i4 = ((iM2761 ^ i3) * (-27399)) ^ (-928642299);
                        i5 = 1273031072;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final SharedPreferences getPreferences() {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getLanguage() {
        return C5448.m16282();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getCountry() {
        return C5448.m16286();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getFileLocalString(File file, String str) {
        int i = -1942707683;
        int i2 = C0950.f3488;
        int i3 = C23916.f77426;
        int iM3169 = C0773.m3169("ۚ᩹") ^ i3;
        int i4 = ((iM3169 ^ i2) * 8455) ^ (-527000771);
        int i5 = 1080349688;
        while (true) {
            i = ((((i ^ i2) * 7765) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2111591761:
                case 803632302:
                    if (C3077.m10041()) {
                        iM3169 = (C0619.m2761("᩻۫") + i3) * (-37);
                        i4 = ((iM3169 ^ i2) * 21627) ^ (-1325409141);
                        i5 = -1010580152;
                    } else {
                        iM3169 = C0619.m2761("ۚܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21639)) ^ (-1730578947);
                        i5 = 204833976;
                    }
                    break;
                case -1248158687:
                case 1399411035:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ܰ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2447) ^ (-727579724);
                        i5 = -1160983543;
                    } else {
                        iM3169 = (C0619.m2761("֫ۢ") + i3) * 15;
                        i4 = ((iM3169 ^ i2) * (-28579)) ^ (-950208149);
                        i5 = 476858756;
                    }
                    break;
                case -1083276534:
                case 1773888347:
                    C3077.m10041();
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("ۢ᩸") ^ i3) * (-97);
                        i4 = ((iM3169 ^ i2) * 29119) ^ 1440311458;
                        i5 = -2050767245;
                    } else {
                        iM3169 = C0619.m2761("ۜۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16131) ^ (-1863368509);
                        i5 = 1985618344;
                    }
                    break;
                case -1070537564:
                case 1027741567:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("ۢ᩸") ^ i3) * (-97);
                        i4 = ((iM3169 ^ i2) * 29119) ^ 1440311458;
                        i5 = -2050767245;
                    } else {
                        iM3169 = (C0773.m3169("᩹֨") ^ i2) * 15;
                        i4 = ((iM3169 ^ i3) * 319) ^ 1876632371;
                        i5 = -1911414680;
                    }
                    break;
                case -885198601:
                case 700394626:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ܰ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2447) ^ (-727579724);
                        i5 = -1160983543;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۟᩻")) * (-75);
                        i4 = ((iM3169 ^ i3) * (-8239)) ^ (-911186925);
                        i5 = -1056843237;
                    }
                    break;
                case -512660472:
                case 962168937:
                    C2310.m7813();
                    iM3169 = C0619.m2761("ܰ᩵") ^ i3;
                    i4 = ((iM3169 ^ i2) * 2447) ^ (-727579724);
                    i5 = -1160983543;
                    break;
                case -124134192:
                case 1929229625:
                    if (C3998.f13671 == 0) {
                        iM3169 = C0619.m2761("ۜۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16131) ^ (-1863368509);
                        i5 = 1985618344;
                    } else {
                        iM3169 = C0619.m2761("ܰ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2447) ^ (-727579724);
                        i5 = -1160983543;
                    }
                    break;
                case 260110246:
                case 2003400869:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ܰ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2447) ^ (-727579724);
                        i5 = -1160983543;
                    } else {
                        iM3169 = (C0773.m3169("ܰۤ") ^ i3) * (-37);
                        i4 = ((iM3169 ^ i2) * (-12769)) ^ (-1700123683);
                        i5 = -1121564238;
                    }
                    break;
                case 335593807:
                case 2055696049:
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۙᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23547)) ^ 228415491;
                        i5 = -1733587152;
                    } else {
                        iM3169 = C0619.m2761("ۜۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16131) ^ (-1863368509);
                        i5 = 1985618344;
                    }
                    break;
                case 422551311:
                case 1139874005:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۜۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16131) ^ (-1863368509);
                        i5 = 1985618344;
                    } else {
                        iM3169 = (C0773.m3169("ۚܶ") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * (-11709)) ^ 795683847;
                        i5 = -735491832;
                    }
                    break;
                case 530112825:
                case 919997582:
                    throw new UnsupportedOperationException();
                case 712404403:
                case 1758091781:
                    C1542.m5459();
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (i2 - C0773.m3169("᩸ᩴ")) * (-15);
                        i4 = ((iM3169 ^ i3) * (-15)) ^ (-1336122193);
                        i5 = 1449025801;
                    } else {
                        iM3169 = C0619.m2761("ۜۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16131) ^ (-1863368509);
                        i5 = 1985618344;
                    }
                    break;
                case 984661491:
                case 1433418149:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩸ᩴ")) * (-15);
                        i4 = ((iM3169 ^ i3) * (-15)) ^ (-1336122193);
                        i5 = 1449025801;
                    } else {
                        iM3169 = C0773.m3169("ܺᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3565)) ^ 345241146;
                        i5 = 1770715319;
                    }
                    break;
                case 1083019711:
                case 1865470247:
                    if (C3998.m12920()) {
                        iM3169 = (i2 - C0773.m3169("ۘۙ")) * (-41);
                        i4 = ((iM3169 ^ i3) * (-8673)) ^ 2107400719;
                        i5 = -1982259512;
                    } else {
                        iM3169 = C0619.m2761("ܰ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2447) ^ (-727579724);
                        i5 = -1160983543;
                    }
                    break;
                case 1419659966:
                case 2004938859:
                    if (C2375.m8065() <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩸ᩴ")) * (-15);
                        i4 = ((iM3169 ^ i3) * (-15)) ^ (-1336122193);
                        i5 = 1449025801;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܿܺ")) * (-5);
                        i4 = ((iM3169 ^ i3) * (-6903)) ^ 156345060;
                        i5 = -1911999804;
                    }
                    break;
                default:
                    AbstractC0641.m2813();
                    RunnableC3646.m11813();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ea A[PHI: r1 r2 r5 r16
      0x01ea: PHI (r1v49 short) = (r1v19 short), (r1v48 short), (r1v1 short) binds: [B:55:0x01e8, B:44:0x0198, B:36:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short) binds: [B:55:0x01e8, B:44:0x0198, B:36:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v3 int) binds: [B:55:0x01e8, B:44:0x0198, B:36:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r16v19 int) = (r16v4 int), (r16v18 int), (r16v20 int) binds: [B:55:0x01e8, B:44:0x0198, B:36:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0244 A[PHI: r0 r16 r17
      0x0244: PHI (r0v3 short[]) = (r0v1 short[]), (r0v2 short[]), (r0v1 short[]) binds: [B:63:0x0242, B:50:0x01c4, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r16v8 int) = (r16v2 int), (r16v5 int), (r16v11 int) binds: [B:63:0x0242, B:50:0x01c4, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r17v9 short) = (r17v4 short), (r17v7 short), (r17v11 short) binds: [B:63:0x0242, B:50:0x01c4, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x029e A[PHI: r7 r8 r9 r16 r17
      0x029e: PHI (r7v3 short[]) = (r7v2 short[]), (r7v1 short[]), (r7v1 short[]), (r7v1 short[]) binds: [B:26:0x0097, B:59:0x021e, B:10:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r8v7 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:26:0x0097, B:59:0x021e, B:10:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:26:0x0097, B:59:0x021e, B:10:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r16v15 int) = (r16v0 int), (r16v3 int), (r16v13 int), (r16v17 int) binds: [B:26:0x0097, B:59:0x021e, B:10:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r17v15 short) = (r17v0 short), (r17v5 short), (r17v13 short), (r17v18 short) binds: [B:26:0x0097, B:59:0x021e, B:10:0x0042, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (l.C1783.f6087 > 0) goto L14;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void log(java.lang.String r19, java.lang.Throwable r20) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17905.log(java.lang.String, java.lang.Throwable):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getLanguageCountry() {
        return C5448.m16288();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openBuiltinBrowser(String str, boolean z) {
        int i = 1700422806;
        int i2 = C1542.f5343;
        int i3 = C3734.f12817;
        int iM2761 = (C0619.m2761("ۢ֡") ^ i3) * 85;
        int i4 = ((iM2761 ^ i2) * (-1659)) ^ (-356337348);
        int i5 = -2040000769;
        while (true) {
            i = ((((i ^ i2) * 29369) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1866339379:
                case -1344833930:
                    C2966.m9664();
                    if (!C17202.f56030) {
                        iM2761 = C0773.m3169("ۘۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18179) ^ 1509256566;
                        i5 = -359100982;
                    } else {
                        iM2761 = (C0773.m3169("ᩴᩴ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i3) * 7521) ^ 1091536030;
                        i5 = -564363341;
                    }
                    break;
                case -1864056331:
                case 870692761:
                    if (C3492.m11488()) {
                        iM2761 = C0773.m3169("ۛ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4055)) ^ 1591992433;
                        i5 = 1503595288;
                    } else {
                        iM2761 = C0773.m3169("ۘۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18179) ^ 1509256566;
                        i5 = -359100982;
                    }
                    break;
                case -1822613374:
                case 813963023:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("֫ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32153)) ^ (-787009516);
                        i5 = 1561719375;
                    } else {
                        iM2761 = C0773.m3169("ۛۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17987) ^ (-1859392290);
                        i5 = 1975115757;
                    }
                    break;
                case -1781102994:
                case 1121428700:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0619.m2761("ܿۙ") + i2) * 85;
                        i4 = ((iM2761 ^ i3) * 28145) ^ 200032652;
                        i5 = -233382808;
                    } else {
                        iM2761 = C0773.m3169("ᩳۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1455) ^ 1650206566;
                        i5 = -1182968606;
                    }
                    break;
                case -1720289363:
                case 1242581566:
                    if (!RunnableC3646.f12471) {
                        iM2761 = (C0619.m2761("ܿۙ") + i2) * 85;
                        i4 = ((iM2761 ^ i3) * 28145) ^ 200032652;
                        i5 = -233382808;
                    } else {
                        iM2761 = C0619.m2761("֫ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32153)) ^ (-787009516);
                        i5 = 1561719375;
                    }
                    break;
                case -1607406981:
                case -939160963:
                    AbstractC0641.m2813();
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0619.m2761("ܿۙ") + i2) * 85;
                        i4 = ((iM2761 ^ i3) * 28145) ^ 200032652;
                        i5 = -233382808;
                    } else {
                        iM2761 = C0773.m3169("ۘۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18179) ^ 1509256566;
                        i5 = -359100982;
                    }
                    break;
                case -266359288:
                case 2136271571:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ܿۙ") + i2) * 85;
                        i4 = ((iM2761 ^ i3) * 28145) ^ 200032652;
                        i5 = -233382808;
                    } else {
                        iM2761 = (C0773.m3169("ۧۛ") ^ i3) * (-35);
                        i4 = ((iM2761 ^ i2) * (-30127)) ^ (-342478437);
                        i5 = -1856594052;
                    }
                    break;
                case -130107967:
                case 965312167:
                    if (C3077.m10041()) {
                        iM2761 = (C0619.m2761("ۧᩳ") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * 16547) ^ (-1541860584);
                        i5 = 481555582;
                    } else {
                        iM2761 = (C0619.m2761("֫᩸") + i3) * 83;
                        i4 = ((iM2761 ^ i2) * 3321) ^ (-1486941022);
                        i5 = -1001368729;
                    }
                    break;
                case -116821969:
                case 1356188589:
                    throw new UnsupportedOperationException();
                case 32544410:
                case 2139658339:
                    C2023.m6964();
                    C2310.m7813();
                    iM2761 = (C0773.m3169("ᩴᩴ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i4 = ((iM2761 ^ i3) * 7521) ^ 1091536030;
                    i5 = -564363341;
                    break;
                case 169986868:
                case 199494300:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۘۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18179) ^ 1509256566;
                        i5 = -359100982;
                    } else {
                        iM2761 = (C0773.m3169("֨᩻") ^ i3) * (-71);
                        i4 = ((iM2761 ^ i2) * 22493) ^ (-1697978708);
                        i5 = 1029404660;
                    }
                    break;
                case 210576167:
                case 1348852660:
                    C17202.m40372();
                    C2023.m6964();
                    return;
                case 261874789:
                case 2068912187:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("ۧᩳ") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * 16547) ^ (-1541860584);
                        i5 = 481555582;
                    } else {
                        iM2761 = C0619.m2761("ܰ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20667) ^ 159125661;
                        i5 = 431288313;
                    }
                    break;
                case 285091272:
                case 2116789608:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0773.m3169("ᩴᩴ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i3) * 7521) ^ 1091536030;
                        i5 = -564363341;
                    } else {
                        iM2761 = C0619.m2761("᩷֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6389)) ^ 1519303290;
                        i5 = 1522116790;
                    }
                    break;
                case 333140624:
                case 412177215:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("ܿۙ") + i2) * 85;
                        i4 = ((iM2761 ^ i3) * 28145) ^ 200032652;
                        i5 = -233382808;
                    } else {
                        iM2761 = C0773.m3169("۠ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18637) ^ 699874725;
                        i5 = 105722470;
                    }
                    break;
                default:
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("ܿۙ") + i2) * 85;
                        i4 = ((iM2761 ^ i3) * 28145) ^ 200032652;
                        i5 = -233382808;
                    } else {
                        iM2761 = (C0619.m2761("ܳܿ") + i2) * (-69);
                        i4 = ((iM2761 ^ i3) * 15043) ^ (-1083661189);
                        i5 = 843633212;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final InputStream getAssetsAsStream(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void showToast(CharSequence charSequence, Object... objArr) {
        String strM40332 = null;
        int i = -322399422;
        int i2 = C2310.f7472;
        int i3 = C0487.f2131;
        int iM2761 = (C0619.m2761("ܰۖ") + i3) * (-101);
        int i4 = ((iM2761 ^ i2) * 27157) ^ (-345773925);
        int i5 = -2051052381;
        while (true) {
            i = ((((i ^ i2) * (-29753)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1912573820:
                case 1502896694:
                    C3779.m12264();
                    if (C2287.f7432 < 0) {
                        iM2761 = (i2 - C0773.m3169("ۨ֨")) * (-53);
                        i4 = ((iM2761 ^ i3) * (-31235)) ^ 1474776886;
                        i5 = -167616488;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2049)) ^ (-2077385809);
                        i5 = 1411083028;
                    }
                    break;
                case -1763655262:
                case 1589780368:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2049)) ^ (-2077385809);
                        i5 = 1411083028;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۙ᩷")) * q.h;
                        i4 = ((iM2761 ^ i3) * (-911)) ^ (-1402353259);
                        i5 = 617462326;
                    }
                    break;
                case -1706356143:
                case 20685413:
                    RunnableC0334.m2063();
                    C2023.m6964();
                    break;
                case -1321775719:
                case 1840816331:
                    if (C3099.m10095()) {
                        iM2761 = C0619.m2761("۟᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11693) ^ (-464312723);
                        i5 = 1218097856;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29381)) ^ 21608422;
                        i5 = 310556733;
                    }
                    break;
                case -1312290976:
                case 439734081:
                    if (C2485.f7950 != 0) {
                        iM2761 = (i2 - C0773.m3169("ۨ֨")) * (-53);
                        i4 = ((iM2761 ^ i3) * (-31235)) ^ 1474776886;
                        i5 = -167616488;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۡ֨")) * 9;
                        i4 = ((iM2761 ^ i2) * 7011) ^ (-1899276654);
                        i5 = -1942891991;
                    }
                    break;
                case -975278520:
                case 1609243296:
                    if (!C3998.m12920()) {
                        iM2761 = (i2 - C0773.m3169("ۨ֨")) * (-53);
                        i4 = ((iM2761 ^ i3) * (-31235)) ^ 1474776886;
                        i5 = -167616488;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۠۟")) * 37;
                        i4 = ((iM2761 ^ i3) * (-6559)) ^ 564770408;
                        i5 = 2065410182;
                    }
                    break;
                case -421798884:
                case 1131070390:
                    C1343.m4943();
                    iM2761 = C0619.m2761("۬֨") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-10093)) ^ (-263659533);
                    i5 = -687246080;
                    break;
                case -350684318:
                case 1718453604:
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ۙۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25431)) ^ 1785639729;
                        i5 = 2025141262;
                    } else {
                        iM2761 = (i2 - C0773.m3169("۠۟")) * 37;
                        i4 = ((iM2761 ^ i3) * (-6559)) ^ 564770408;
                        i5 = 2065410182;
                    }
                    break;
                case 31715106:
                case 1680241966:
                    if (C0950.m3785() != 0) {
                        iM2761 = C0619.m2761("۬֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10093)) ^ (-263659533);
                        i5 = -687246080;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۚ") ^ i3) * 81;
                        i4 = ((iM2761 ^ i2) * 8573) ^ (-1489049824);
                        i5 = 41074718;
                    }
                    break;
                case 99815252:
                case 430471074:
                    strM40332 = C17159.m40332(C2023.m6952(charSequence), objArr);
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("۟᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11693) ^ (-464312723);
                        i5 = 1218097856;
                    } else {
                        iM2761 = (C0773.m3169("ܳܺ") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * (-7939)) ^ 1201167487;
                        i5 = 1077039113;
                    }
                    break;
                case 155288211:
                case 1766564484:
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0619.m2761("۟᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11693) ^ (-464312723);
                        i5 = 1218097856;
                    } else {
                        iM2761 = C0773.m3169("۬۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14517) ^ (-950694572);
                        i5 = -871949928;
                    }
                    break;
                case 443794429:
                case 978007465:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2049)) ^ (-2077385809);
                        i5 = 1411083028;
                    } else {
                        iM2761 = (C0773.m3169("ۧۨ") + i3) * 37;
                        i4 = ((iM2761 ^ i2) * 13825) ^ 1912647586;
                        i5 = -2006464097;
                    }
                    break;
                case 889762674:
                case 1884931735:
                    C17159 c17159 = C5448.f19035;
                    if (C11235.f35427 < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC4783(4, strM40332));
                    }
                    iM2761 = C0619.m2761("۟᩷") ^ i3;
                    i4 = ((iM2761 ^ i2) * 11693) ^ (-464312723);
                    i5 = 1218097856;
                    break;
                case 1372800331:
                case 2037584226:
                    if (!C0619.f2439) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2049)) ^ (-2077385809);
                        i5 = 1411083028;
                    } else {
                        iM2761 = C0619.m2761("۬֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10093)) ^ (-263659533);
                        i5 = -687246080;
                    }
                    break;
                default:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("۬֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10093)) ^ (-263659533);
                        i5 = -687246080;
                    } else {
                        iM2761 = C0773.m3169("ᩴ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-207)) ^ (-651849711);
                        i5 = -1307097957;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void cancelToast() {
        int i = 535073801;
        int i2 = C0950.f3488;
        int i3 = RunnableC0334.f1808;
        int iM3169 = (C0773.m3169("۠ܶ") ^ i2) * (-123);
        int i4 = ((iM3169 ^ i3) * 29169) ^ (-2106973756);
        int i5 = 570793473;
        while (true) {
            i = ((((i ^ i3) * 24373) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2098758361:
                case 317829111:
                    C1080.m4050();
                    if (C2966.f9654 < 0) {
                        iM3169 = (C0773.m3169("ܽۖ") ^ i2) * (-51);
                        i4 = ((iM3169 ^ i3) * (-5013)) ^ 342135755;
                        i5 = 1963402774;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ۫") + i3) * (-47);
                        i4 = ((iM3169 ^ i2) * (-15821)) ^ 883859094;
                        i5 = -1758371644;
                    }
                    break;
                case -1834894740:
                case 1055659692:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۛ֫")) * 21;
                        i4 = ((iM3169 ^ i2) * 29617) ^ (-1818105902);
                        i5 = 1502738003;
                    } else {
                        iM3169 = C0773.m3169("ۡۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21319)) ^ (-2003681699);
                        i5 = -1403695442;
                    }
                    break;
                case -1755357497:
                case -1536066682:
                    if (C2485.f7950 != 0) {
                        iM3169 = (i3 - C0773.m3169("ۛ֫")) * 21;
                        i4 = ((iM3169 ^ i2) * 29617) ^ (-1818105902);
                        i5 = 1502738003;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ۫") + i3) * (-47);
                        i4 = ((iM3169 ^ i2) * (-15821)) ^ 883859094;
                        i5 = -1758371644;
                    }
                    break;
                case -1712690058:
                case -1553013121:
                    if (C2023.f6737) {
                        iM3169 = (C0619.m2761("ᩳ۫") + i3) * (-47);
                        i4 = ((iM3169 ^ i2) * (-15821)) ^ 883859094;
                        i5 = -1758371644;
                    } else {
                        iM3169 = C0619.m2761("ۚܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5789) ^ 1760066107;
                        i5 = 1660188335;
                    }
                    break;
                case -1697402758:
                case 2083957091:
                    C17159 c17159 = C5448.f19035;
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("ۚܿ") ^ i2) * 51;
                        i4 = ((iM3169 ^ i3) * (-14947)) ^ (-975171036);
                        i5 = 257023420;
                    } else {
                        iM3169 = (C0619.m2761("ۛۘ") ^ i3) * (-87);
                        i4 = ((iM3169 ^ i2) * (-25117)) ^ 1813530582;
                        i5 = 514026072;
                    }
                    break;
                case -1567357585:
                case -1296634572:
                    C1826.m6301();
                    if (C1783.f6087 > 0) {
                        iM3169 = (C0773.m3169("ۚܿ") ^ i2) * 51;
                        i4 = ((iM3169 ^ i3) * (-14947)) ^ (-975171036);
                        i5 = 257023420;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ۫") + i3) * (-47);
                        i4 = ((iM3169 ^ i2) * (-15821)) ^ 883859094;
                        i5 = -1758371644;
                    }
                    break;
                case -1565961926:
                case -161049402:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0619.m2761("ᩳ۫") + i3) * (-47);
                        i4 = ((iM3169 ^ i2) * (-15821)) ^ 883859094;
                        i5 = -1758371644;
                    } else {
                        iM3169 = (C0773.m3169("ۚۡ") + i2) * 17;
                        i4 = ((iM3169 ^ i3) * (-13265)) ^ (-1486242344);
                        i5 = 313609914;
                    }
                    break;
                case -1433710237:
                case 663593690:
                    if (C13473.f42873 == 0) {
                        ThreadUtil.runOnUiThread(new RunnableC8142(1));
                    }
                    iM3169 = (C0773.m3169("ۘ۟") ^ i3) * (-57);
                    i4 = ((iM3169 ^ i2) * 89) ^ 1988228463;
                    i5 = -1427860713;
                    break;
                case -1295755238:
                case -1096028824:
                    if (C3077.f9998) {
                        iM3169 = (i3 - C0773.m3169("۠֡")) * 57;
                        i4 = ((iM3169 ^ i2) * (-7111)) ^ (-1910858289);
                        i5 = 219276460;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۛ֫")) * 21;
                        i4 = ((iM3169 ^ i2) * 29617) ^ (-1818105902);
                        i5 = 1502738003;
                    }
                    break;
                case -1288630896:
                case -867785176:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (i3 - C0773.m3169("ۛ֫")) * 21;
                        i4 = ((iM3169 ^ i2) * 29617) ^ (-1818105902);
                        i5 = 1502738003;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܽ᩹")) * 41;
                        i4 = ((iM3169 ^ i3) * 31063) ^ 884677424;
                        i5 = -1621520717;
                    }
                    break;
                case -1239872877:
                case -921561468:
                    RunnableC3055.m9933();
                    C1826.m6301();
                    break;
                case -263806369:
                case -90250318:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("ۘ۟") ^ i3) * (-57);
                        i4 = ((iM3169 ^ i2) * 89) ^ 1988228463;
                        i5 = -1427860713;
                    } else {
                        iM3169 = C0773.m3169("᩹ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6393)) ^ (-730522057);
                        i5 = 605659238;
                    }
                    break;
                case 457360921:
                case 902870549:
                    if (C0269.m1775() <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۛ֫")) * 21;
                        i4 = ((iM3169 ^ i2) * 29617) ^ (-1818105902);
                        i5 = 1502738003;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩺ۚ")) * 23;
                        i4 = ((iM3169 ^ i3) * (-14679)) ^ (-1974044973);
                        i5 = 100767992;
                    }
                    break;
                case 1128113168:
                case 1464554489:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ܽۖ") ^ i2) * (-51);
                        i4 = ((iM3169 ^ i3) * (-5013)) ^ 342135755;
                        i5 = 1963402774;
                    } else {
                        iM3169 = C0773.m3169("᩺᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16337)) ^ 61269014;
                        i5 = 636256521;
                    }
                    break;
                default:
                    C2419.m8174();
                    C1146.m4231();
                    iM3169 = (C0619.m2761("ᩳ۫") + i3) * (-47);
                    i4 = ((iM3169 ^ i2) * (-15821)) ^ 883859094;
                    i5 = -1758371644;
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final List getStringList(String... strArr) {
        getStringArray(strArr);
        return Arrays.asList(strArr);
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String[] getStringArray(String... strArr) {
        int i = 0;
        String string = null;
        int i2 = -1500980314;
        int i3 = C1542.f5343;
        int i4 = C4238.f15451;
        int iM3169 = (C0773.m3169("ۘ᩸") ^ i3) * (-21);
        int i5 = ((iM3169 ^ i4) * (-12627)) ^ 1539878927;
        int i6 = 741521433;
        while (true) {
            i2 = ((((i2 ^ i4) * (-20049)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2124304701:
                case 1349353991:
                    strArr[i] = string;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ۧۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-23511)) ^ 216716422;
                        i6 = 930020167;
                    } else {
                        iM3169 = (C0773.m3169("۬᩻") ^ i4) * (-77);
                        i5 = ((iM3169 ^ i3) * 24705) ^ (-748906265);
                        i6 = -753316698;
                    }
                    break;
                case -2116478278:
                case -2011725755:
                    C0487.m2356();
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("֫۟") ^ i3) * q.h;
                        i5 = ((iM3169 ^ i4) * (-12055)) ^ 645547945;
                        i6 = 1356307313;
                    } else {
                        iM3169 = C0619.m2761("֡֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2193)) ^ 741697459;
                        i6 = 287871202;
                    }
                    break;
                case -2076087127:
                case 1485811289:
                    C23916.m53419();
                    return null;
                case -1864849541:
                case -684353891:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ۙ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25335) ^ 341876191;
                        i6 = 955904424;
                    } else {
                        iM3169 = (C0619.m2761("ۡ᩻") + i3) * 69;
                        i5 = ((iM3169 ^ i4) * 30933) ^ 1917350995;
                        i6 = 2062256713;
                    }
                    break;
                case -1728188751:
                case 419363071:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۙ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25335) ^ 341876191;
                        i6 = 955904424;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۛܺ")) * (-73);
                        i5 = ((iM3169 ^ i4) * 12047) ^ 1313234054;
                        i6 = 637040147;
                    }
                    break;
                case -1703153496:
                case 324834504:
                    if (C2354.m7983()) {
                        iM3169 = (i3 - C0773.m3169("ܳ᩺")) * 99;
                        i5 = ((iM3169 ^ i4) * (-19177)) ^ (-200165085);
                        i6 = 1612090800;
                    } else {
                        iM3169 = C0773.m3169("ۧۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-23511)) ^ 216716422;
                        i6 = 930020167;
                    }
                    break;
                case -1698972819:
                case -642853836:
                    i++;
                    iM3169 = (C0619.m2761("ܶ᩻") ^ i3) * 23;
                    i5 = ((iM3169 ^ i4) * 7323) ^ 869113215;
                    i6 = 1537772775;
                    break;
                case -1271386344:
                case 1905846380:
                    AbstractC0116.m1243();
                    C2966.m9664();
                    iM3169 = (C0773.m3169("֫۟") ^ i3) * q.h;
                    i5 = ((iM3169 ^ i4) * (-12055)) ^ 645547945;
                    i6 = 1356307313;
                    break;
                case -1116544329:
                case 753968391:
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("ۧۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-23511)) ^ 216716422;
                        i6 = 930020167;
                    } else {
                        iM3169 = C0773.m3169("۫ܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-4893)) ^ (-2147264248);
                        i6 = 2114089743;
                    }
                    break;
                case -927624300:
                case 1759935705:
                    if (C1343.m4943()) {
                        iM3169 = C0773.m3169("ᩴܳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15075)) ^ 1068462834;
                        i6 = 751826622;
                    } else {
                        iM3169 = C0773.m3169("ۧۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-23511)) ^ 216716422;
                        i6 = 930020167;
                    }
                    break;
                case -902967958:
                case -92730843:
                    string = getString(strArr[i]);
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("֫۟") ^ i3) * q.h;
                        i5 = ((iM3169 ^ i4) * (-12055)) ^ 645547945;
                        i6 = 1356307313;
                    } else {
                        iM3169 = C0619.m2761("᩵ۘ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-27603)) ^ 403008458;
                        i6 = -939305492;
                    }
                    break;
                case -818713504:
                case 1936090803:
                    C3448.m11248();
                    if (C3734.f12817 < 0) {
                        iM3169 = C0619.m2761("ۙ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25335) ^ 341876191;
                        i6 = 955904424;
                    } else {
                        iM3169 = (C0773.m3169("֫۟") ^ i3) * q.h;
                        i5 = ((iM3169 ^ i4) * (-12055)) ^ 645547945;
                        i6 = 1356307313;
                    }
                    break;
                case -775541216:
                case 916892408:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0773.m3169("֫۟") ^ i3) * q.h;
                        i5 = ((iM3169 ^ i4) * (-12055)) ^ 645547945;
                        i6 = 1356307313;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۤۡ")) * 57;
                        i5 = ((iM3169 ^ i3) * (-25815)) ^ (-43285947);
                        i6 = -404005289;
                    }
                    break;
                case -582336706:
                case 1232132123:
                    i = 0;
                    iM3169 = (C0619.m2761("ܶ᩻") ^ i3) * 23;
                    i5 = ((iM3169 ^ i4) * 7323) ^ 869113215;
                    i6 = 1537772775;
                    break;
                case 8014047:
                case 678247862:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ۙ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25335) ^ 341876191;
                        i6 = 955904424;
                    } else {
                        iM3169 = C0773.m3169("᩹ۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 2243) ^ (-1443568666);
                        i6 = 370731889;
                    }
                    break;
                case 288030948:
                case 1481237737:
                    C1826.m6301();
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("ۙ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25335) ^ 341876191;
                        i6 = 955904424;
                    } else {
                        iM3169 = C0619.m2761("ۜܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 18241) ^ (-428076745);
                        i6 = -976125829;
                    }
                    break;
                case 656579048:
                case 669846680:
                    return strArr;
                case 1601835218:
                case 2021947434:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ۙ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25335) ^ 341876191;
                        i6 = 955904424;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩷") + i4) * q.h;
                        i5 = ((iM3169 ^ i3) * 24191) ^ 1033156240;
                        i6 = -1357987137;
                    }
                    break;
                default:
                    if (i < strArr.length) {
                        iM3169 = C0773.m3169("᩷᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * 22863) ^ 237992992;
                        i6 = 2090450599;
                    } else {
                        iM3169 = C0773.m3169("ܰᩴ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 29507) ^ 404997491;
                        i6 = -1856321291;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getLocalString() {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getAssetLocalString(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void showToast(CharSequence charSequence) {
        int i = 1729068833;
        int i2 = C2288.f7433;
        int i3 = C0773.f2792;
        int iM3169 = C0773.m3169("֨᩷") ^ i2;
        int i4 = ((iM3169 ^ i3) * 30461) ^ (-451161522);
        int i5 = 959522193;
        while (true) {
            i = ((((i ^ i3) * (-21765)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1979495041:
                case 1811460766:
                    if (C2310.m7813() > 0) {
                        ThreadUtil.runOnUiThread(new RunnableC4783(4, charSequence));
                    }
                    iM3169 = (C0773.m3169("ۗܶ") ^ i2) * (-9);
                    i4 = ((iM3169 ^ i3) * 6293) ^ (-1328334267);
                    i5 = -1335743044;
                    break;
                case -1821977133:
                case 1747896552:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("ۗܶ") ^ i2) * (-9);
                        i4 = ((iM3169 ^ i3) * 6293) ^ (-1328334267);
                        i5 = -1335743044;
                    } else {
                        iM3169 = C0773.m3169("ۘ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18113)) ^ 785242312;
                        i5 = -603057052;
                    }
                    break;
                case -1499807208:
                case -833310612:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5301) ^ 652725163;
                        i5 = -248247510;
                    } else {
                        iM3169 = (C0619.m2761("۠֨") ^ i3) * (-3);
                        i4 = ((iM3169 ^ i2) * 29179) ^ 1213060761;
                        i5 = -1759406515;
                    }
                    break;
                case -1432859726:
                case -733821576:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27849) ^ (-1862482593);
                        i5 = 1902210823;
                    } else {
                        iM3169 = (C0773.m3169("ۜۚ") ^ i3) * 33;
                        i4 = ((iM3169 ^ i2) * (-20961)) ^ (-1834480447);
                        i5 = -1568244793;
                    }
                    break;
                case -1366247478:
                case -383238705:
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("ۙ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7557)) ^ (-1093504434);
                        i5 = 1056730189;
                    } else {
                        iM3169 = C0773.m3169("᩵֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28139) ^ 1874780853;
                        i5 = 1739332289;
                    }
                    break;
                case -994076023:
                case 1057328784:
                    C11235.m28309();
                    if (C4282.f15546 > 0) {
                        iM3169 = C0773.m3169("ۙ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7557)) ^ (-1093504434);
                        i5 = 1056730189;
                    } else {
                        iM3169 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18437)) ^ 1824955732;
                        i5 = -1516289720;
                    }
                    break;
                case -973487676:
                case 997657906:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (C0619.m2761("۠֨") ^ i3) * (-3);
                        i4 = ((iM3169 ^ i2) * 29179) ^ 1213060761;
                        i5 = -1759406515;
                    } else {
                        iM3169 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18437)) ^ 1824955732;
                        i5 = -1516289720;
                    }
                    break;
                case -935361194:
                case 1710835519:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18437)) ^ 1824955732;
                        i5 = -1516289720;
                    } else {
                        iM3169 = (C0773.m3169("֨ܿ") ^ i3) * (-21);
                        i4 = ((iM3169 ^ i2) * (-15151)) ^ (-75703635);
                        i5 = 845242200;
                    }
                    break;
                case -853252377:
                case 1693803888:
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27849) ^ (-1862482593);
                        i5 = 1902210823;
                    } else {
                        iM3169 = C0619.m2761("۠᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6143) ^ 2004032992;
                        i5 = -1408862039;
                    }
                    break;
                case -693417075:
                case 100467792:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("۠֨") ^ i3) * (-3);
                        i4 = ((iM3169 ^ i2) * 29179) ^ 1213060761;
                        i5 = -1759406515;
                    } else {
                        iM3169 = (C0619.m2761("ۢۜ") ^ i3) * 27;
                        i4 = ((iM3169 ^ i2) * 32705) ^ (-682915651);
                        i5 = -831368398;
                    }
                    break;
                case -657913677:
                case -142948910:
                    C17159 c17159 = C5448.f19035;
                    if (C0619.m2763()) {
                        iM3169 = (C0773.m3169("ۗܶ") ^ i2) * (-9);
                        i4 = ((iM3169 ^ i3) * 6293) ^ (-1328334267);
                        i5 = -1335743044;
                    } else {
                        iM3169 = C0773.m3169("ܰۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4613) ^ 1491300543;
                        i5 = 426127237;
                    }
                    break;
                case -417048422:
                case 1281554982:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18437)) ^ 1824955732;
                        i5 = -1516289720;
                    } else {
                        iM3169 = C0619.m2761("᩶۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27849) ^ (-1862482593);
                        i5 = 1902210823;
                    }
                    break;
                case 321942383:
                case 849031609:
                    C4282.m13644();
                    C2023.m6964();
                    break;
                case 1494725378:
                case 1533266691:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("ۗܶ") ^ i2) * (-9);
                        i4 = ((iM3169 ^ i3) * 6293) ^ (-1328334267);
                        i5 = -1335743044;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۧ") + i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-18881)) ^ (-751814332);
                        i5 = -596994452;
                    }
                    break;
                default:
                    C2878.m9491();
                    iM3169 = C0619.m2761("᩶۫") ^ i2;
                    i4 = ((iM3169 ^ i3) * 27849) ^ (-1862482593);
                    i5 = 1902210823;
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getLanguageNameLocalString() {
        return C5448.m16285();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final File getFilesDir() {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openPreference(Class cls) {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openBrowser(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final boolean hasClipboardText() {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final CharSequence getClipboardText() {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final boolean setClipboardText(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openLogViewer() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1860777951;
        int i7 = C3734.f12817;
        int i8 = AbstractC3624.f12429;
        int iM2761 = (C0619.m2761("ܽ۟") + i7) * 59;
        int i9 = ((iM2761 ^ i8) * (-27807)) ^ 745009526;
        int i10 = -1423250282;
        while (true) {
            i6 = ((((i6 ^ i8) * 18575) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -2119834623:
                case 1919014847:
                    C0950.m3785();
                    if (C0269.f1558 > 0) {
                        iM2761 = C0619.m2761("᩻᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-17393)) ^ (-489760801);
                        i10 = -906971549;
                    } else {
                        iM2761 = C0773.m3169("ۘۧ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-12015)) ^ (-1818336056);
                        i10 = 2015944161;
                    }
                    break;
                case -2111909131:
                case 191330795:
                    C0862.m3503();
                    iM2761 = C0773.m3169("ۘۧ") ^ i8;
                    i9 = ((iM2761 ^ i7) * (-12015)) ^ (-1818336056);
                    i10 = 2015944161;
                    break;
                case -2001793908:
                case 1392037297:
                    if (!C0619.f2439) {
                        short[] sArr2 = f58644;
                        if (C2485.f7950 != 0 || C3734.m12152() >= 0) {
                            iM2761 = C0619.m2761("᩻᩷") ^ i8;
                            i9 = ((iM2761 ^ i7) * (-17393)) ^ (-489760801);
                            i10 = -906971549;
                        } else {
                            String strM9670 = C2966.m9670(sArr2, UMErrorCode.E_UM_BE_JSON_FAILED, 20, i5);
                            if (C23916.f77426 > 0) {
                                ThreadUtil.runOnUiThread(new RunnableC1784(3, strM9670));
                            }
                            iM2761 = (i7 - C0773.m3169("ۨܶ")) * 41;
                            i9 = ((iM2761 ^ i8) * (-30617)) ^ (-2043986175);
                            i10 = 1579699746;
                        }
                    } else {
                        iM2761 = C0773.m3169("᩶ۜ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 13469) ^ 864182310;
                        i10 = -305695219;
                    }
                    break;
                case -1928214314:
                case -1137245094:
                    i = s + 17456;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i8 - C0619.m2761("۬ۜ")) * 21;
                        i9 = ((iM2761 ^ i7) * 21899) ^ (-326906120);
                        i10 = 415916045;
                    } else {
                        iM2761 = (i7 - C0619.m2761("ܶ֡")) * 61;
                        i9 = ((iM2761 ^ i8) * (-24741)) ^ (-569576810);
                        i10 = -1985952746;
                    }
                    break;
                case -1666421067:
                case -242372198:
                    i5 = 12753;
                    iM2761 = C0619.m2761("ܺ۫") ^ i7;
                    i9 = ((iM2761 ^ i8) * (-11191)) ^ (-1008965329);
                    i10 = -941038087;
                    break;
                case -1651675778:
                case 581438831:
                    C2023.m6964();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("᩶ۜ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 13469) ^ 864182310;
                        i10 = -305695219;
                    } else {
                        iM2761 = C0773.m3169("ۘۧ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-12015)) ^ (-1818336056);
                        i10 = 2015944161;
                    }
                    break;
                case -1296255039:
                case 522301444:
                    c = 'm';
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i8 - C0619.m2761("۬ۜ")) * 21;
                        i9 = ((iM2761 ^ i7) * 21899) ^ (-326906120);
                        i10 = 415916045;
                    } else {
                        iM2761 = (i7 - C0773.m3169("֫ۨ")) * (-33);
                        i9 = ((iM2761 ^ i8) * 28635) ^ (-966128829);
                        i10 = -1235029069;
                    }
                    break;
                case -1120699926:
                case -921289838:
                    int i11 = i3 + i4;
                    if (i2 - (i11 + i11) > 0) {
                        iM2761 = (C0619.m2761("ܰۚ") ^ i8) * 29;
                        i9 = ((iM2761 ^ i7) * (-12471)) ^ (-946638514);
                        i10 = 89919061;
                    } else {
                        iM2761 = (i7 - C0619.m2761("֫ᩳ")) * 119;
                        i9 = ((iM2761 ^ i8) * (-12339)) ^ (-177141847);
                        i10 = 1798458918;
                    }
                    break;
                case -870220395:
                case 2027193234:
                    if (!C3690.m11987()) {
                        iM2761 = C0619.m2761("᩻᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-17393)) ^ (-489760801);
                        i10 = -906971549;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ۨܶ")) * 41;
                        i9 = ((iM2761 ^ i8) * (-30617)) ^ (-2043986175);
                        i10 = 1579699746;
                    }
                    break;
                case -801307126:
                case -264364977:
                    sArr = f58644;
                    if (C2375.m8065() <= 0) {
                        iM2761 = (i8 - C0619.m2761("۬ۜ")) * 21;
                        i9 = ((iM2761 ^ i7) * 21899) ^ (-326906120);
                        i10 = 415916045;
                    } else {
                        iM2761 = (C0773.m3169("᩷֫") ^ i8) * (-101);
                        i9 = ((iM2761 ^ i7) * 10433) ^ (-725314602);
                        i10 = -1179761493;
                    }
                    break;
                case -268227632:
                case 868560164:
                    C1343.m4943();
                    break;
                case 123291489:
                case 557863233:
                    i5 = 36751;
                    iM2761 = C0619.m2761("ܺ۫") ^ i7;
                    i9 = ((iM2761 ^ i8) * (-11191)) ^ (-1008965329);
                    i10 = -941038087;
                    break;
                case 225075904:
                case 1978735778:
                    i2 = i * i;
                    i3 = s * s;
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("᩻᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-17393)) ^ (-489760801);
                        i10 = -906971549;
                    } else {
                        iM2761 = (C0773.m3169("ᩳۤ") ^ i8) * (-59);
                        i9 = ((iM2761 ^ i7) * (-22569)) ^ 1110582663;
                        i10 = -807688168;
                    }
                    break;
                case 628643978:
                case 1341761247:
                    i4 = 304711936;
                    if (C3448.m11248() != 0) {
                        iM2761 = C0619.m2761("᩻᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-17393)) ^ (-489760801);
                        i10 = -906971549;
                    } else {
                        iM2761 = C0773.m3169("۟ۚ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-20621)) ^ 2127216384;
                        i10 = 1543909104;
                    }
                    break;
                default:
                    s = sArr[c];
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("᩶ۜ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 13469) ^ 864182310;
                        i10 = -305695219;
                    } else {
                        iM2761 = C0773.m3169("᩶᩻") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-777)) ^ 472782870;
                        i10 = -956322343;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(String str) {
        C5448.m16278(str);
    }
}
