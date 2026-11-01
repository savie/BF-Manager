package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.֨ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T4FN */
/* JADX INFO: loaded from: classes.dex */
public class C1313 {

    /* JADX INFO: renamed from: ۜ᩷۬, reason: not valid java name and contains not printable characters */
    private static final short[] f5593;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f5594;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f5595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f5596;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2724 f5597;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f5598;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17367 f5599;

    static {
        ApplicationC6132.m17119(21);
        f5593 = new short[]{3967, 28601, 28583, 28577, 28576, 28586, 28581, 28576, 28577, 28665, 28645, 28665, 28669, 28645, 28666, 28667, 6763, -1847, -1833, -1839, -1840, -1830, -1835, -1840, -1839, -1911, -1899, -1911, -1907, -1899, -1910, -1909};
    }

    public native C1313(C2724 c2724, C17367 c17367);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m4676() {
        int i = 0;
        int i2 = 701174810;
        int i3 = C3722.f13525;
        int i4 = C2249.f8050;
        int iM45029 = C19806.m45029("ܰۙ") ^ i4;
        int i5 = ((iM45029 ^ i3) * 4271) ^ 1850353415;
        int i6 = -1668322544;
        while (true) {
            i2 = ((((i2 ^ i3) * 23961) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2055234240:
                case -1203910466:
                    if (C7105.m18985()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۙ") + i3) * (-59);
                        i5 = ((iM45029 ^ i4) * 11043) ^ (-1194753119);
                        i6 = 1620060293;
                    } else {
                        iM45029 = C19806.m45029("۠ᩴ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 14689) ^ (-1062698501);
                        i6 = 340412541;
                    }
                    break;
                case -2045649667:
                case -803322533:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩵") ^ i3;
                        i5 = ((iM45029 ^ i4) * 18215) ^ (-1394403622);
                        i6 = 531208019;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11791) ^ 133068575;
                        i6 = 1857107634;
                    }
                    break;
                case -1979578432:
                case 987189347:
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۠") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26603) ^ (-1038746164);
                        i6 = -840464483;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۡ") ^ i3) * 93;
                        i5 = ((iM45029 ^ i4) * 5127) ^ (-1074331075);
                        i6 = 1482155656;
                    }
                    break;
                case -1843044535:
                case 825528371:
                    if (C3722.m10894() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩵") ^ i3;
                        i5 = ((iM45029 ^ i4) * 18215) ^ (-1394403622);
                        i6 = 531208019;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 16379) ^ 849328977;
                        i6 = -2140804071;
                    }
                    break;
                case -1746126103:
                case 1026716024:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("᩵ۡ") ^ i3) * 93;
                        i5 = ((iM45029 ^ i4) * 5127) ^ (-1074331075);
                        i6 = 1482155656;
                    } else {
                        iM45029 = (C19806.m45029("ۚۧ") + i3) * 53;
                        i5 = ((iM45029 ^ i4) * 9701) ^ 586937023;
                        i6 = 1131226460;
                    }
                    break;
                case -1362010883:
                case 1218931289:
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۙ") + i3) * (-59);
                        i5 = ((iM45029 ^ i4) * 11043) ^ (-1194753119);
                        i6 = 1620060293;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩸")) * 75;
                        i5 = ((iM45029 ^ i4) * (-20481)) ^ 1381792666;
                        i6 = 2122177971;
                    }
                    break;
                case -1088441313:
                case 905736299:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۠") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26603) ^ (-1038746164);
                        i6 = -840464483;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܿ۫")) * (-105);
                        i5 = ((iM45029 ^ i4) * 1285) ^ (-399838841);
                        i6 = 1334072665;
                    }
                    break;
                case -1005294404:
                case -969257162:
                    C2788.m8472();
                    C3722.m10894();
                    return false;
                case -986414235:
                case 1165037995:
                    C10634.m26820();
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩵") ^ i3;
                        i5 = ((iM45029 ^ i4) * 18215) ^ (-1394403622);
                        i6 = 531208019;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۡ") ^ i3) * 93;
                        i5 = ((iM45029 ^ i4) * 5127) ^ (-1074331075);
                        i6 = 1482155656;
                    }
                    break;
                case -618104654:
                case 1279357913:
                    return false;
                case -503133478:
                case 1758622501:
                    return true;
                case -459705724:
                case 474031762:
                    if (i == 5) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۚ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8913)) ^ 1974363657;
                        i6 = -1464731371;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ᩸") ^ i3) * (-41);
                        i5 = ((iM45029 ^ i4) * 18289) ^ (-452279002);
                        i6 = 634386240;
                    }
                    break;
                case -355925804:
                case -6381467:
                    if (C0797.m3359()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-9913)) ^ 335013697;
                        i6 = 960244364;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۙ") + i3) * (-59);
                        i5 = ((iM45029 ^ i4) * 11043) ^ (-1194753119);
                        i6 = 1620060293;
                    }
                    break;
                case -55558279:
                case 1002075005:
                    if (C1937.f7317 < 0) {
                        iM45029 = (C19806.m45029("᩵ۡ") ^ i3) * 93;
                        i5 = ((iM45029 ^ i4) * 5127) ^ (-1074331075);
                        i6 = 1482155656;
                    } else {
                        iM45029 = (C19806.m45029("ᩴܽ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i3) * (-12401)) ^ (-1971878806);
                        i6 = -1342190739;
                    }
                    break;
                case 227012056:
                case 1159264737:
                    RunnableC1606.m5473();
                    iM45029 = (C19806.m45029("᩵ۡ") ^ i3) * 93;
                    i5 = ((iM45029 ^ i4) * 5127) ^ (-1074331075);
                    i6 = 1482155656;
                    break;
                case 1074104133:
                case 1863552374:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۙ") + i3) * (-59);
                        i5 = ((iM45029 ^ i4) * 11043) ^ (-1194753119);
                        i6 = 1620060293;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 21997) ^ 1364347736;
                        i6 = -44958609;
                    }
                    break;
                case 1173919989:
                case 1559027670:
                    i = this.f5596;
                    if (C19806.f63586) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۙ") + i3) * (-59);
                        i5 = ((iM45029 ^ i4) * 11043) ^ (-1194753119);
                        i6 = 1620060293;
                    } else {
                        iM45029 = (C19806.m45029("۟֡") + i4) * (-93);
                        i5 = ((iM45029 ^ i3) * 24283) ^ (-1541347385);
                        i6 = -1534834228;
                    }
                    break;
                default:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("᩵ۡ") ^ i3) * 93;
                        i5 = ((iM45029 ^ i4) * 5127) ^ (-1074331075);
                        i6 = 1482155656;
                    } else {
                        iM45029 = (C19806.m45029("᩻ᩳ") ^ i4) * (-93);
                        i5 = ((iM45029 ^ i3) * 22565) ^ 368409994;
                        i6 = -494164384;
                    }
                    break;
            }
        }
    }

    public C1313(int i) {
        C2724 c2724 = null;
        int i2 = -926581375;
        int i3 = AbstractC0464.f2088;
        int i4 = ThreadFactoryC3888.f14547;
        int iM45029 = C19806.m45029("֡᩺") ^ i3;
        int i5 = ((iM45029 ^ i4) * 22413) ^ (-994520917);
        int i6 = -2056465789;
        while (true) {
            i2 = ((((i2 ^ i4) * (-15389)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2090962509:
                case -1873939768:
                    if (C1937.f7317 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۖ") ^ i4) * (-15);
                        i5 = ((iM45029 ^ i3) * (-11275)) ^ 558297349;
                        i6 = -1064599417;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۠") ^ i4) * (-79);
                        i5 = ((iM45029 ^ i3) * 10929) ^ 437660626;
                        i6 = -745022296;
                    }
                    break;
                case -2066865692:
                case -588510259:
                    C7105.m18985();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘۚ")) * (-51);
                    i5 = ((iM45029 ^ i4) * (-4229)) ^ (-2147419423);
                    i6 = -1109025907;
                    break;
                case -2050171293:
                case -101693853:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("ۤۤ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32567)) ^ 498805632;
                        i6 = -936404625;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-7769)) ^ 1379548638;
                        i6 = 1632929707;
                    }
                    break;
                case -1793599284:
                case -566177142:
                    if (C3743.f13569) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4317) ^ 1673271413;
                        i6 = 2068379977;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۖ") ^ i4) * (-15);
                        i5 = ((iM45029 ^ i3) * (-11275)) ^ 558297349;
                        i6 = -1064599417;
                    }
                    break;
                case -1788916417:
                case -738921660:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘۚ")) * (-51);
                        i5 = ((iM45029 ^ i4) * (-4229)) ^ (-2147419423);
                        i6 = -1109025907;
                    } else {
                        iM45029 = C19806.m45029("ۜۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 29953) ^ (-1916755544);
                        i6 = 991727077;
                    }
                    break;
                case -647708884:
                case 1010086282:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C1148.m4232();
                    throw new RuntimeException();
                case -586240675:
                case 2014773988:
                    this.f5596 = i;
                    c2724 = null;
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("ۤۤ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32567)) ^ 498805632;
                        i6 = -936404625;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۜ") ^ i4) * (-71);
                        i5 = ((iM45029 ^ i3) * 9533) ^ 322968701;
                        i6 = 1108840139;
                    }
                    break;
                case -172633371:
                case 1092943897:
                    C0526.m2437();
                    if (!C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۠") ^ i4) * (-79);
                        i5 = ((iM45029 ^ i3) * 10929) ^ 437660626;
                        i6 = -745022296;
                    } else {
                        iM45029 = C19806.m45029("ۤۤ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32567)) ^ 498805632;
                        i6 = -936404625;
                    }
                    break;
                case -33057139:
                case 1216037629:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ۤۤ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32567)) ^ 498805632;
                        i6 = -936404625;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֡ۢ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM45029 ^ i4) * (-3189)) ^ (-1242191008);
                        i6 = -1636669252;
                    }
                    break;
                case 215208810:
                case 1837096042:
                    this.f5597 = c2724;
                    if (C1461.m5080()) {
                        iM45029 = C19806.m45029("ۤۤ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32567)) ^ 498805632;
                        i6 = -936404625;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩸")) * (-17);
                        i5 = ((iM45029 ^ i4) * 9581) ^ 651215788;
                        i6 = 1149699163;
                    }
                    break;
                case 589996210:
                case 1950698468:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۠") ^ i4) * (-79);
                        i5 = ((iM45029 ^ i3) * 10929) ^ 437660626;
                        i6 = -745022296;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2787)) ^ (-63655740);
                        i6 = -743674416;
                    }
                    break;
                case 819864784:
                case 1607614437:
                    C3722.m10894();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۠") ^ i4) * (-79);
                        i5 = ((iM45029 ^ i3) * 10929) ^ 437660626;
                        i6 = -745022296;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘۚ")) * (-51);
                        i5 = ((iM45029 ^ i4) * (-4229)) ^ (-2147419423);
                        i6 = -1109025907;
                    }
                    break;
                case 1697453825:
                case 1744648107:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("᩺᩻") + i4) * (-5);
                        i5 = ((iM45029 ^ i3) * (-30101)) ^ (-342403716);
                        i6 = 249086398;
                    } else {
                        byte[] bArr = new byte[0];
                        if (C1377.f5749) {
                            this.f5599 = new C17367(bArr);
                            return;
                        }
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘۚ")) * (-51);
                        i5 = ((iM45029 ^ i4) * (-4229)) ^ (-2147419423);
                        i6 = -1109025907;
                    }
                    break;
                default:
                    if (C2477.m7593() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۠") ^ i4) * (-79);
                        i5 = ((iM45029 ^ i3) * 10929) ^ 437660626;
                        i6 = -745022296;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗۤ")) * (-71);
                        i5 = ((iM45029 ^ i3) * (-24555)) ^ 427940963;
                        i6 = -1610728032;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m4669(int i) {
        C17367 c17367 = null;
        long jAvailable = 0;
        int i2 = -531509326;
        int i3 = C1460.f5948;
        int i4 = C1398.f5802;
        int iM45029 = (i3 - C19806.m45029("ᩴۜ")) * (-73);
        int i5 = ((iM45029 ^ i4) * 22269) ^ 1105010591;
        int i6 = -628884667;
        while (true) {
            i2 = ((((i2 ^ i4) * (-7615)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1805482185:
                case -119127737:
                    C1875.m6086();
                    if (!RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30055)) ^ (-800253573);
                        i6 = -1077392047;
                    } else {
                        iM45029 = C19806.m45029("᩸ۖ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 21767) ^ (-1429805312);
                        i6 = -604578001;
                    }
                    break;
                case -1736657015:
                case 1040769371:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩺֨")) * (-97);
                        i5 = ((iM45029 ^ i3) * (-22537)) ^ (-1820526620);
                        i6 = -2009648121;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-5129)) ^ (-1441344720);
                        i6 = 1739407629;
                    }
                    break;
                case -1604361027:
                case 1538331174:
                    c17367 = this.f5599;
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۤ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8539)) ^ 688490145;
                        i6 = -1827180836;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۢ") ^ i3) * 49;
                        i5 = ((iM45029 ^ i4) * (-25353)) ^ 381210370;
                        i6 = 1938598992;
                    }
                    break;
                case -1379954761:
                case 1541280424:
                    AbstractC0464.m2313();
                    C1377.m4833();
                    return false;
                case -1207779691:
                case 1790031727:
                    if (C1377.m4833() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܿ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15435) ^ 533242058;
                        i6 = 1886705956;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩺֨")) * (-97);
                        i5 = ((iM45029 ^ i3) * (-22537)) ^ (-1820526620);
                        i6 = -2009648121;
                    }
                    break;
                case -906304709:
                case 378956356:
                    return false;
                case -829275301:
                case 754733063:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܿ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15435) ^ 533242058;
                        i6 = 1886705956;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܳܳ")) * (-89);
                        i5 = ((iM45029 ^ i3) * (-26313)) ^ (-5350457);
                        i6 = 458778502;
                    }
                    break;
                case -609930360:
                case 537676089:
                    jAvailable = c17367.available();
                    if (jAvailable < i) {
                        iM45029 = C19806.m45029("ۛᩳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-21975)) ^ (-1501185097);
                        i6 = -571169248;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶۫") + i3) * (-123);
                        i5 = ((iM45029 ^ i4) * 26479) ^ (-1740048375);
                        i6 = 1899373907;
                    }
                    break;
                case -319893905:
                case 136213097:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30055)) ^ (-800253573);
                        i6 = -1077392047;
                    } else {
                        iM45029 = C19806.m45029("ᩳۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-16451)) ^ 1272598077;
                        i6 = 1890000142;
                    }
                    break;
                case -298439882:
                case 964524744:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30055)) ^ (-800253573);
                        i6 = -1077392047;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * 20415) ^ (-828131554);
                        i6 = 920412049;
                    }
                    break;
                case -152994523:
                case 1440665145:
                    c17367.skipBytes((int) jAvailable);
                    return true;
                case 141982803:
                case 639146710:
                    C1977.m6356();
                    C1875.m6086();
                    iM45029 = ThreadFactoryC3888.m11306("ۜ֫") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-30055)) ^ (-800253573);
                    i6 = -1077392047;
                    break;
                case 499753031:
                case 1429338873:
                    if (RunnableC3388.m10064()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ᩳ") + i3) * 95;
                        i5 = ((iM45029 ^ i4) * 12569) ^ (-623379212);
                        i6 = -1695728203;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܿ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15435) ^ 533242058;
                        i6 = 1886705956;
                    }
                    break;
                case 514340333:
                case 1186470737:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 14921) ^ 1844170158;
                        i6 = 2087378408;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۤ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8539)) ^ 688490145;
                        i6 = -1827180836;
                    }
                    break;
                case 1064886171:
                case 1984648692:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۤ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8539)) ^ 688490145;
                        i6 = -1827180836;
                    } else {
                        iM45029 = (C19806.m45029("᩻ܺ") + i3) * (-5);
                        i5 = ((iM45029 ^ i4) * 31919) ^ 854270844;
                        i6 = -613697608;
                    }
                    break;
                case 1134724027:
                case 1287338611:
                    if (C19806.f63586) {
                        iM45029 = (i4 - C19806.m45029("᩺֨")) * (-97);
                        i5 = ((iM45029 ^ i3) * (-22537)) ^ (-1820526620);
                        i6 = -2009648121;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟֡") ^ i3) * 91;
                        i5 = ((iM45029 ^ i4) * 18835) ^ 1588196557;
                        i6 = 713995988;
                    }
                    break;
                case 1343521135:
                case 1627333541:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("᩸ۖ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 21767) ^ (-1429805312);
                        i6 = -604578001;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩻ۤ")) * (-45);
                        i5 = ((iM45029 ^ i3) * 26463) ^ 487592016;
                        i6 = -2126918989;
                    }
                    break;
                default:
                    if (C1025.m3861() > 0) {
                        iM45029 = (i4 - C19806.m45029("᩺֨")) * (-97);
                        i5 = ((iM45029 ^ i3) * (-22537)) ^ (-1820526620);
                        i6 = -2009648121;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30055)) ^ (-800253573);
                        i6 = -1077392047;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m4682() {
        C17367 c17367 = null;
        int iM3012 = 0;
        byte[] bArr = null;
        int i = -567733853;
        int i2 = C0050.f912;
        int i3 = C2124.f7782;
        int iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i2;
        int i4 = ((iM11306 ^ i3) * 14067) ^ 1005355339;
        int i5 = 1029469657;
        while (true) {
            i = ((((i ^ i3) * (-26219)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2110263068:
                case 154913602:
                    C1977.m6356();
                    if (C1668.f6641 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۫") ^ i3) * 51;
                        i4 = ((iM11306 ^ i2) * (-25463)) ^ (-69319068);
                        i5 = 1420561892;
                    } else {
                        iM11306 = C19806.m45029("ۘ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-8605)) ^ (-1749386926);
                        i5 = 798161331;
                    }
                    break;
                case -2068117212:
                case -49451731:
                    c17367.m40446(iM3012, bArr);
                    if (!C0962.f3784) {
                        return new String(bArr, StandardCharsets.UTF_8);
                    }
                    iM11306 = C19806.m45029("ۘ᩹") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-8605)) ^ (-1749386926);
                    i5 = 798161331;
                    break;
                case -2025406475:
                case 271844627:
                    C2704.m8255();
                    if (C1937.m6279() < 0) {
                        iM11306 = C19806.m45029("ۘ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-8605)) ^ (-1749386926);
                        i5 = 798161331;
                    } else {
                        iM11306 = C19806.m45029("᩺۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19561) ^ (-1759407082);
                        i5 = -2064299118;
                    }
                    break;
                case -2017039720:
                case 1673039601:
                    C1377.m4833();
                    C3660.m10791();
                    iM11306 = C19806.m45029("᩺۫") ^ i3;
                    i4 = ((iM11306 ^ i2) * 19561) ^ (-1759407082);
                    i5 = -2064299118;
                    break;
                case -2016705163:
                case -1287289279:
                    if (C1189.m4368() <= 0) {
                        iM11306 = C19806.m45029("ܰᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4219) ^ 1206431490;
                        i5 = 1158786021;
                    } else {
                        iM11306 = C19806.m45029("֡ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-1803)) ^ (-667683876);
                        i5 = -190175203;
                    }
                    break;
                case -1954079665:
                case 402270718:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("᩺۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19561) ^ (-1759407082);
                        i5 = -2064299118;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۧ") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * (-29331)) ^ 250634836;
                        i5 = 355423245;
                    }
                    break;
                case -1199569839:
                case -217691522:
                    iM3012 = C0671.m3012(c17367);
                    if (C3535.f13026 <= 0) {
                        iM11306 = (C19806.m45029("۠۠") + i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-15799)) ^ (-1753380593);
                        i5 = -267221505;
                    } else {
                        iM11306 = (C19806.m45029("ۨۘ") + i3) * 47;
                        i4 = ((iM11306 ^ i2) * (-26007)) ^ 387598685;
                        i5 = 420159;
                    }
                    break;
                case -724597341:
                case 1199672025:
                    if (RunnableC1895.f7152) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨ܺ")) * (-83);
                        i4 = ((iM11306 ^ i2) * 11285) ^ (-132426198);
                        i5 = -1953809020;
                    } else {
                        iM11306 = C19806.m45029("ܰᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4219) ^ 1206431490;
                        i5 = 1158786021;
                    }
                    break;
                case -210897368:
                case 982988479:
                    C2249.m6915();
                    return null;
                case -199230589:
                case 1756800350:
                    if (!C0526.f2219) {
                        iM11306 = C19806.m45029("ܰᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4219) ^ 1206431490;
                        i5 = 1158786021;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۫") ^ i3) * 51;
                        i4 = ((iM11306 ^ i2) * (-25463)) ^ (-69319068);
                        i5 = 1420561892;
                    }
                    break;
                case -172997334:
                case 1382846865:
                    bArr = new byte[iM3012];
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("۠۠") + i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-15799)) ^ (-1753380593);
                        i5 = -267221505;
                    } else {
                        iM11306 = C19806.m45029("۠֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14213) ^ 1292053929;
                        i5 = -1322832378;
                    }
                    break;
                case 693336376:
                case 1509401869:
                    if (CallableC1627.f6528) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܿܿ")) * (-11);
                        i4 = ((iM11306 ^ i3) * 13553) ^ (-1269184018);
                        i5 = -38481146;
                    } else {
                        iM11306 = C19806.m45029("ۘ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-8605)) ^ (-1749386926);
                        i5 = 798161331;
                    }
                    break;
                case 1258984418:
                case 1555388720:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = C19806.m45029("ۘ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-8605)) ^ (-1749386926);
                        i5 = 798161331;
                    } else {
                        iM11306 = C19806.m45029("᩷ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17643)) ^ (-1855179018);
                        i5 = 1702550340;
                    }
                    break;
                case 1769563691:
                case 1903581213:
                    c17367 = this.f5599;
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = C19806.m45029("᩺۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19561) ^ (-1759407082);
                        i5 = -2064299118;
                    } else {
                        iM11306 = C19806.m45029("ۤܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24553) ^ (-1366516743);
                        i5 = -132141847;
                    }
                    break;
                default:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ܰᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4219) ^ 1206431490;
                        i5 = 1158786021;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") ^ i3) * (-57);
                        i4 = ((iM11306 ^ i2) * 413) ^ (-56486128);
                        i5 = 1225013192;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e3 A[PHI: r1 r10 r12 r16
      0x00e3: PHI (r1v49 l.ۛۧ᩺) = (r1v3 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺) binds: [B:30:0x00e1, B:24:0x0093, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r10v5 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:30:0x00e1, B:24:0x0093, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:30:0x00e1, B:24:0x0093, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r16v27 int) = (r16v2 int), (r16v3 int), (r16v28 int) binds: [B:30:0x00e1, B:24:0x0093, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0209 A[PHI: r6 r7 r8 r16 r17
      0x0209: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:55:0x0207, B:51:0x01e3, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:55:0x0207, B:51:0x01e3, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:55:0x0207, B:51:0x01e3, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r16v23 int) = (r16v13 int), (r16v14 int), (r16v24 int) binds: [B:55:0x0207, B:51:0x01e3, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r17v26 l.ۛۧ᩺) = (r17v16 l.ۛۧ᩺), (r17v17 l.ۛۧ᩺), (r17v27 l.ۛۧ᩺) binds: [B:55:0x0207, B:51:0x01e3, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0268 A[PHI: r4 r5 r16 r17
      0x0268: PHI (r4v4 short) = (r4v3 short), (r4v2 short) binds: [B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r16v11 int) = (r16v10 int), (r16v12 int) binds: [B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r17v14 l.ۛۧ᩺) = (r17v13 l.ۛۧ᩺), (r17v15 l.ۛۧ᩺) binds: [B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02e1 A[PHI: r2 r3 r16 r17
      0x02e1: PHI (r2v7 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:75:0x02df, B:71:0x02be, B:67:0x029d, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r3v7 char) = (r3v2 char), (r3v2 char), (r3v3 char), (r3v2 char) binds: [B:75:0x02df, B:71:0x02be, B:67:0x029d, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r16v33 int) = (r16v7 int), (r16v8 int), (r16v9 int), (r16v34 int) binds: [B:75:0x02df, B:71:0x02be, B:67:0x029d, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r17v33 l.ۛۧ᩺) = (r17v10 l.ۛۧ᩺), (r17v11 l.ۛۧ᩺), (r17v12 l.ۛۧ᩺), (r17v34 l.ۛۧ᩺) binds: [B:75:0x02df, B:71:0x02be, B:67:0x029d, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (l.RunnableC3388.m10064() != false) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m4668(int r20) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1313.m4668(int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1313 m4667(IOException iOException) {
        boolean z = false;
        int i = 267170782;
        int i2 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i3 = C3535.f13026;
        int iM11306 = ThreadFactoryC3888.m11306("֨᩺") ^ i3;
        int i4 = ((iM11306 ^ i2) * 8053) ^ 1998235971;
        int i5 = 838454865;
        while (true) {
            i = ((((i ^ i2) * 24287) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2133023671:
                case 320349528:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16841)) ^ 1043531970;
                        i5 = 179073357;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩷") + i2) * (-77);
                        i4 = ((iM11306 ^ i3) * 10405) ^ (-473817312);
                        i5 = -405182770;
                    }
                    break;
                case -1800644703:
                case 162939094:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16841)) ^ 1043531970;
                        i5 = 179073357;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۨ") + i2) * (-127);
                        i4 = ((iM11306 ^ i3) * (-3019)) ^ (-366143318);
                        i5 = -1909926448;
                    }
                    break;
                case -1624779575:
                case -974668763:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("᩵᩹") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * (-12859)) ^ 1343781125;
                        i5 = 1183451965;
                    } else {
                        iM11306 = (C19806.m45029("ܺۗ") + i3) * 73;
                        i4 = ((iM11306 ^ i2) * 21861) ^ (-871871450);
                        i5 = -672244331;
                    }
                    break;
                case -1503772475:
                case 762080238:
                    if (C2249.m6915() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۗ") ^ i2) * 119;
                        i4 = ((iM11306 ^ i3) * 28357) ^ (-926467328);
                        i5 = -1541147729;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18435)) ^ (-130720649);
                        i5 = -1690680146;
                    }
                    break;
                case -1081451284:
                case 2087235051:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ᩵") + i3) * 83;
                    i4 = ((iM11306 ^ i2) * (-17865)) ^ 774518384;
                    i5 = 136212033;
                    break;
                case -992307281:
                case 127643654:
                    if (C1066.m4023() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩵") + i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-17865)) ^ 774518384;
                        i5 = 136212033;
                    } else {
                        iM11306 = C19806.m45029("۫ۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18093)) ^ 1621359487;
                        i5 = -1514814617;
                    }
                    break;
                case -859186681:
                case -771959126:
                    if (!C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩵") + i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-17865)) ^ 774518384;
                        i5 = 136212033;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۗ") ^ i2) * 119;
                        i4 = ((iM11306 ^ i3) * 28357) ^ (-926467328);
                        i5 = -1541147729;
                    }
                    break;
                case -805115410:
                case 1431270945:
                    C0629.m2907();
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("ۤۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 32149) ^ (-633002107);
                        i5 = 1911789102;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩹") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * (-12859)) ^ 1343781125;
                        i5 = 1183451965;
                    }
                    break;
                case -543463044:
                case 773027505:
                    C1148.m4232();
                    if (C3660.f13403 < 0) {
                        iM11306 = (C19806.m45029("᩵᩹") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * (-12859)) ^ 1343781125;
                        i5 = 1183451965;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۗ") ^ i2) * 119;
                        i4 = ((iM11306 ^ i3) * 28357) ^ (-926467328);
                        i5 = -1541147729;
                    }
                    break;
                case -270741731:
                case 1847147420:
                    z = iOException instanceof C22171;
                    if (C7105.f23796 >= 0) {
                        iM11306 = (C19806.m45029("᩵᩹") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * (-12859)) ^ 1343781125;
                        i5 = 1183451965;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31659)) ^ 1041199308;
                        i5 = 1595547860;
                    }
                    break;
                case -95083985:
                case 726953213:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩵") + i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-17865)) ^ 774518384;
                        i5 = 136212033;
                    } else {
                        iM11306 = C19806.m45029("ܺܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-625)) ^ (-494619788);
                        i5 = 1042622014;
                    }
                    break;
                case -31782557:
                case 1512745319:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ۤۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 32149) ^ (-633002107);
                        i5 = 1911789102;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ܿ") ^ i3) * 91;
                        i4 = ((iM11306 ^ i2) * (-1415)) ^ 1203214127;
                        i5 = 1070173297;
                    }
                    break;
                case 505353605:
                case 1371302720:
                    RunnableC3388.m10064();
                    return null;
                case 725209077:
                case 1024185537:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩵") + i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-17865)) ^ 774518384;
                        i5 = 136212033;
                    } else {
                        iM11306 = C19806.m45029("ۢܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-2465)) ^ 865519488;
                        i5 = -1938906428;
                    }
                    break;
                case 1078743353:
                case 1976211315:
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16841)) ^ 1043531970;
                        i5 = 179073357;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠᩶") ^ i3) * 65;
                        i4 = ((iM11306 ^ i2) * (-31355)) ^ (-1842102271);
                        i5 = -860233112;
                    }
                    break;
                default:
                    C1313 c1313 = new C1313(z ? 4 : -1);
                    c1313.f5598 = z;
                    return c1313;
            }
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m4678() {
        int i = 0;
        int i2 = -1305559180;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i4 = C1419.f5860;
        int iM11306 = ThreadFactoryC3888.m11306("ᩳܺ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-1445)) ^ 1446557953;
        int i6 = -447969881;
        while (true) {
            i2 = ((((i2 ^ i3) * (-17901)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2140323322:
                case 683002643:
                    C19806.m45024();
                    if (!RunnableC3388.m10064()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM11306 ^ i4) * (-21707)) ^ (-639041267);
                        i6 = 798021530;
                    } else {
                        iM11306 = C19806.m45029("ۖ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 5659) ^ 507221350;
                        i6 = 668058440;
                    }
                    break;
                case -2032988310:
                case -758580668:
                    ThreadFactoryC3888.m11300();
                    if (C2332.m7079() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM11306 ^ i4) * (-21707)) ^ (-639041267);
                        i6 = 798021530;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܶ") ^ i4) * 57;
                        i5 = ((iM11306 ^ i3) * (-16669)) ^ (-107245261);
                        i6 = -494631744;
                    }
                    break;
                case -1871292322:
                case -1314695733:
                    return -1;
                case -1863085270:
                case -1378359744:
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM11306 ^ i4) * (-21707)) ^ (-639041267);
                        i6 = 798021530;
                    } else {
                        iM11306 = (i4 - C19806.m45029("֫᩷")) * (-9);
                        i5 = ((iM11306 ^ i3) * 24607) ^ 1217953171;
                        i6 = 2132304994;
                    }
                    break;
                case -1375881178:
                case 1943190294:
                    C0671.m3008();
                    return 0;
                case -1345190145:
                case 2013958309:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܶ") ^ i4) * 57;
                        i5 = ((iM11306 ^ i3) * (-16669)) ^ (-107245261);
                        i6 = -494631744;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺֫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 9935) ^ (-1831423215);
                        i6 = 1439592717;
                    }
                    break;
                case -1303262516:
                case -1032371888:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܶ") ^ i4) * 57;
                        i5 = ((iM11306 ^ i3) * (-16669)) ^ (-107245261);
                        i6 = -494631744;
                    } else {
                        iM11306 = C19806.m45029("ܳۚ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 5935) ^ (-1476064);
                        i6 = -1754397787;
                    }
                    break;
                case -1286363154:
                case 1120857304:
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-13391)) ^ 1579567508;
                        i6 = 1854473168;
                    } else {
                        iM11306 = C19806.m45029("ۖ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * 5659) ^ 507221350;
                        i6 = 668058440;
                    }
                    break;
                case -1154882477:
                case 227220531:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۚۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21173)) ^ (-1294439365);
                        i6 = -1381350767;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26469)) ^ (-1112498339);
                        i6 = 1852968989;
                    }
                    break;
                case -930170155:
                case 821016570:
                    i = 2;
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ۟") ^ i4) * 99;
                        i5 = ((iM11306 ^ i3) * (-7305)) ^ 1829313164;
                        i6 = -638000982;
                    } else {
                        iM11306 = C19806.m45029("ۚۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21173)) ^ (-1294439365);
                        i6 = -1381350767;
                    }
                    break;
                case -814683285:
                case 513005938:
                    if (C1377.m4833() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM11306 ^ i4) * (-21707)) ^ (-639041267);
                        i6 = 798021530;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18201)) ^ (-1008764021);
                        i6 = 706809368;
                    }
                    break;
                case -515925902:
                case 1237114699:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܶ") ^ i4) * 57;
                        i5 = ((iM11306 ^ i3) * (-16669)) ^ (-107245261);
                        i6 = -494631744;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺᩴ") + i3) * 43;
                        i5 = ((iM11306 ^ i4) * 27933) ^ 1638380599;
                        i6 = -1687147759;
                    }
                    break;
                case -465507520:
                case 1715903111:
                    if (m4669(i)) {
                        iM11306 = C19806.m45029("ܽ᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-32671)) ^ (-1619319869);
                        i6 = 829732658;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 5283) ^ (-1090236731);
                        i6 = -1963074082;
                    }
                    break;
                case -408191469:
                case 1250286673:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM11306 = (ThreadFactoryC3888.m11306("᩺ܶ") ^ i4) * 57;
                    i5 = ((iM11306 ^ i3) * (-16669)) ^ (-107245261);
                    i6 = -494631744;
                    break;
                case 41853472:
                case 894915864:
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("ۚۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21173)) ^ (-1294439365);
                        i6 = -1381350767;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 17205) ^ (-1121608843);
                        i6 = 1668657487;
                    }
                    break;
                case 969538536:
                case 1600056939:
                    return C0671.m3012(this.f5599);
                case 1154118957:
                case 1438992881:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM11306 ^ i4) * (-21707)) ^ (-639041267);
                        i6 = 798021530;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7567) ^ (-821489597);
                        i6 = 1077851886;
                    }
                    break;
                default:
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ۚۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21173)) ^ (-1294439365);
                        i6 = -1381350767;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32437) ^ 80227378;
                        i6 = -951830084;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x021f A[PHI: r5 r8 r11 r16 r17
      0x021f: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:60:0x021d, B:52:0x01d5, B:31:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:60:0x021d, B:52:0x01d5, B:31:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:60:0x021d, B:52:0x01d5, B:31:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r16v26 int) = (r16v6 int), (r16v8 int), (r16v27 int) binds: [B:60:0x021d, B:52:0x01d5, B:31:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r17v25 l.ۛۧ᩺) = (r17v6 l.ۛۧ᩺), (r17v8 l.ۛۧ᩺), (r17v26 l.ۛۧ᩺) binds: [B:60:0x021d, B:52:0x01d5, B:31:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0258 A[PHI: r4 r6 r7 r12 r16 r17
      0x0258: PHI (r4v6 short) = (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:64:0x0256, B:56:0x01fb, B:20:0x0092, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r6v6 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:64:0x0256, B:56:0x01fb, B:20:0x0092, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r7v6 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:64:0x0256, B:56:0x01fb, B:20:0x0092, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r12v5 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v8 int) binds: [B:64:0x0256, B:56:0x01fb, B:20:0x0092, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r16v31 int) = (r16v5 int), (r16v7 int), (r16v13 int), (r16v35 int) binds: [B:64:0x0256, B:56:0x01fb, B:20:0x0092, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r17v31 l.ۛۧ᩺) = (r17v5 l.ۛۧ᩺), (r17v7 l.ۛۧ᩺), (r17v13 l.ۛۧ᩺), (r17v33 l.ۛۧ᩺) binds: [B:64:0x0256, B:56:0x01fb, B:20:0x0092, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4670(int i) {
        int i2;
        int iM45029;
        int i3;
        int i4;
        int i5;
        int iM11306;
        int i6;
        int i7;
        int i8 = C1461.f5957;
        int i9 = C10634.f36300;
        int iM450210 = (i8 - C19806.m45029("᩺ܰ")) * 17;
        int i10 = ((iM450210 ^ i9) * (-6725)) ^ 1137946999;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM450210 ^ 1004728928;
        InterfaceC6025 interfaceC6025 = null;
        char c = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 857631772;
        while (true) {
            i19 = i11 ^ (i10 & (((i19 ^ i9) * (-4459)) >> 31));
            switch (i19) {
                case -2137886623:
                case 1301123376:
                    interfaceC6025 = interfaceC6025;
                    i2 = i16;
                    i13 = i12 * i12;
                    i14 = s * s;
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܳ") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-25049)) ^ 727621595;
                        i4 = 2089766383;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷֨") ^ i8;
                        i3 = ((iM45029 ^ i9) * 23449) ^ 1266739277;
                        i4 = 461561941;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -1914734104:
                case -1166219928:
                    i5 = 34085;
                    int iM450211 = (i9 - C19806.m45029("ܰۧ")) * 51;
                    int i20 = i5;
                    i10 = ((iM450211 ^ i8) * (-10015)) ^ (-1580919821);
                    i16 = i20;
                    i11 = iM450211 ^ 544327255;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -1743021336:
                case -488397801:
                    interfaceC6025 = interfaceC6025;
                    i2 = i16;
                    c = 16;
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i9 - C19806.m45029("ۚۘ")) * (-61);
                        i3 = ((iM45029 ^ i8) * 27583) ^ 158779057;
                        i4 = 1043462490;
                    } else {
                        iM45029 = (i8 - C19806.m45029("ۗ۬")) * 61;
                        i3 = ((iM45029 ^ i9) * (-23481)) ^ (-1547516547);
                        i4 = -955102332;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -1628654098:
                case 892413804:
                    interfaceC6025 = interfaceC6025;
                    i2 = i16;
                    i12 = s + 15764;
                    if (RunnableC1564.f6300) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۙܽ")) * 85;
                        i3 = ((iM45029 ^ i8) * 20741) ^ (-235151446);
                        i4 = -1757234212;
                    } else {
                        iM45029 = C19806.m45029("ۚܺ") ^ i9;
                        i3 = ((iM45029 ^ i8) * (-24719)) ^ (-1681596743);
                        i4 = -225855749;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -1581429610:
                case -95548608:
                    i2 = i16;
                    if (!C1977.m6366()) {
                        interfaceC6025 = interfaceC6025;
                        iM45029 = (i9 - C19806.m45029("ۜ᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM45029 ^ i8) * 21449) ^ (-281629196);
                        i4 = 709717681;
                        i16 = i2;
                        i11 = iM45029 ^ i4;
                        i10 = i3;
                        interfaceC6025 = interfaceC6025;
                    } else {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ۚ۫")) * (-55);
                        i6 = ((iM11306 ^ i9) * 15571) ^ 297453030;
                        i7 = 1089306560;
                        int i21 = i2;
                        i11 = iM11306 ^ i7;
                        i10 = i6;
                        i16 = i21;
                    }
                    break;
                case -1521483400:
                case -446632419:
                    interfaceC6025 = interfaceC6025;
                    i2 = i16;
                    sArr = f5593;
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۢ") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-32599)) ^ (-1465730740);
                        i4 = -181650724;
                    } else {
                        iM45029 = C19806.m45029("ۢܿ") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-24811)) ^ (-19265838);
                        i4 = 1999563801;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -1456174306:
                case -71506604:
                    i2 = i16;
                    C1679.m5597(interfaceC6025, C1460.m5047(sArr2, i17, i18, i16), true);
                    interfaceC6025 = interfaceC6025;
                    iM45029 = (i9 - C19806.m45029("ۜ᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i3 = ((iM45029 ^ i8) * 21449) ^ (-281629196);
                    i4 = 709717681;
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -1387668611:
                case 903661675:
                    C3535.m10431();
                    if (!CallableC1627.f6528) {
                        interfaceC6025 = interfaceC6025;
                        i2 = i16;
                        iM45029 = (i9 - C19806.m45029("ۚۘ")) * (-61);
                        i3 = ((iM45029 ^ i8) * 27583) ^ 158779057;
                        i4 = 1043462490;
                        i16 = i2;
                        i11 = iM45029 ^ i4;
                        i10 = i3;
                        interfaceC6025 = interfaceC6025;
                    }
                    i2 = i16;
                    iM45029 = (i9 - C19806.m45029("ܺۜ")) * (-41);
                    interfaceC6025 = interfaceC6025;
                    i3 = ((iM45029 ^ i8) * (-10903)) ^ 260673670;
                    i4 = 233612758;
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -1371640529:
                case 1115922338:
                    i2 = i16;
                    interfaceC6025 = C16737.f53607;
                    sArr2 = f5593;
                    if (C10634.f36300 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩶") ^ i9) * (-65);
                        i6 = ((iM11306 ^ i8) * (-31705)) ^ (-1582102798);
                        i7 = -922307971;
                        int i22 = i2;
                        i11 = iM11306 ^ i7;
                        i10 = i6;
                        i16 = i22;
                    } else {
                        iM45029 = (i9 - C19806.m45029("ܺۜ")) * (-41);
                        interfaceC6025 = interfaceC6025;
                        i3 = ((iM45029 ^ i8) * (-10903)) ^ 260673670;
                        i4 = 233612758;
                        i16 = i2;
                        i11 = iM45029 ^ i4;
                        i10 = i3;
                        interfaceC6025 = interfaceC6025;
                    }
                    break;
                case -1225664184:
                case 840456032:
                    i2 = i16;
                    i17 = 17;
                    if (!C19806.m45024()) {
                        iM11306 = (i9 - C19806.m45029("ۙ᩺")) * (-23);
                        i6 = ((iM11306 ^ i8) * (-2715)) ^ 1598988747;
                        i7 = 968346552;
                        int i23 = i2;
                        i11 = iM11306 ^ i7;
                        i10 = i6;
                        i16 = i23;
                    } else {
                        interfaceC6025 = interfaceC6025;
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۙܽ")) * 85;
                        i3 = ((iM45029 ^ i8) * 20741) ^ (-235151446);
                        i4 = -1757234212;
                        i16 = i2;
                        i11 = iM45029 ^ i4;
                        i10 = i3;
                        interfaceC6025 = interfaceC6025;
                    }
                    break;
                case -923154190:
                case 1803999364:
                    interfaceC6025 = interfaceC6025;
                    i2 = i16;
                    s = sArr[c];
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܳ") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-25049)) ^ 727621595;
                        i4 = 2089766383;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸֨") ^ i9;
                        i3 = ((iM45029 ^ i8) * 14113) ^ (-1137094534);
                        i4 = -1976114889;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -283832830:
                case 224420116:
                    i2 = i16;
                    i18 = 15;
                    if (C1148.m4232() > 0) {
                        iM11306 = C19806.m45029("۟᩵") ^ i8;
                        i6 = ((iM11306 ^ i9) * 22345) ^ 1393592420;
                        i7 = -246326837;
                        int i24 = i2;
                        i11 = iM11306 ^ i7;
                        i10 = i6;
                        i16 = i24;
                    } else {
                        interfaceC6025 = interfaceC6025;
                        iM45029 = ThreadFactoryC3888.m11306("۟ܳ") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-25049)) ^ 727621595;
                        i4 = 2089766383;
                        i16 = i2;
                        i11 = iM45029 ^ i4;
                        i10 = i3;
                        interfaceC6025 = interfaceC6025;
                    }
                    break;
                case -200100176:
                case 1110827293:
                    C1398.m4895();
                    if (!C0817.f3443) {
                        interfaceC6025 = interfaceC6025;
                        i2 = i16;
                        iM45029 = ThreadFactoryC3888.m11306("۟ܳ") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-25049)) ^ 727621595;
                        i4 = 2089766383;
                        i16 = i2;
                        i11 = iM45029 ^ i4;
                        i10 = i3;
                        interfaceC6025 = interfaceC6025;
                    }
                    i2 = i16;
                    iM45029 = (i9 - C19806.m45029("ܺۜ")) * (-41);
                    interfaceC6025 = interfaceC6025;
                    i3 = ((iM45029 ^ i8) * (-10903)) ^ 260673670;
                    i4 = 233612758;
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -122245739:
                case -82028689:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        interfaceC6025 = interfaceC6025;
                        i2 = i16;
                        iM45029 = ThreadFactoryC3888.m11306("۠ۢ") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-32599)) ^ (-1465730740);
                        i4 = -181650724;
                        i16 = i2;
                        i11 = iM45029 ^ i4;
                        i10 = i3;
                        interfaceC6025 = interfaceC6025;
                    }
                    i2 = i16;
                    iM45029 = (i9 - C19806.m45029("ܺۜ")) * (-41);
                    interfaceC6025 = interfaceC6025;
                    i3 = ((iM45029 ^ i8) * (-10903)) ^ 260673670;
                    i4 = 233612758;
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case -50528662:
                case 183519398:
                    break;
                case -11847412:
                case 793447719:
                    interfaceC6025 = interfaceC6025;
                    i2 = i16;
                    if (C2788.f10625 >= 0) {
                        interfaceC6025 = interfaceC6025;
                        iM45029 = (i9 - C19806.m45029("ܺۜ")) * (-41);
                        interfaceC6025 = interfaceC6025;
                        i3 = ((iM45029 ^ i8) * (-10903)) ^ 260673670;
                        i4 = 233612758;
                    } else {
                        iM45029 = C19806.m45029("ۙܺ") ^ i9;
                        i3 = ((iM45029 ^ i8) * 17957) ^ (-2067727246);
                        i4 = 1575453693;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case 110963411:
                case 1706305753:
                    C0216.m1591();
                    break;
                case 307284429:
                case 1366939962:
                    i5 = 63675;
                    int iM450212 = (i9 - C19806.m45029("ܰۧ")) * 51;
                    int i25 = i5;
                    i10 = ((iM450212 ^ i8) * (-10015)) ^ (-1580919821);
                    i16 = i25;
                    i11 = iM450212 ^ 544327255;
                    interfaceC6025 = interfaceC6025;
                    break;
                case 501557959:
                case 619359352:
                    C1668.m5583();
                    C0278.m1789();
                    i2 = i16;
                    iM45029 = (i9 - C19806.m45029("ܺۜ")) * (-41);
                    interfaceC6025 = interfaceC6025;
                    i3 = ((iM45029 ^ i8) * (-10903)) ^ 260673670;
                    i4 = 233612758;
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case 765543307:
                case 1669799911:
                    i2 = i16;
                    if (i == f5594) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩵") ^ i8;
                        interfaceC6025 = interfaceC6025;
                        i3 = ((iM45029 ^ i9) * 3169) ^ 1636716219;
                        i4 = -1574187098;
                    } else {
                        interfaceC6025 = interfaceC6025;
                        iM45029 = (i9 - C19806.m45029("ۜ᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM45029 ^ i8) * 21449) ^ (-281629196);
                        i4 = 709717681;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                case 1139075047:
                case 1909106715:
                    interfaceC6025 = interfaceC6025;
                    i2 = i16;
                    i15 = 248503696;
                    if (C3743.m10966() <= 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۙܽ")) * 85;
                        i3 = ((iM45029 ^ i8) * 20741) ^ (-235151446);
                        i4 = -1757234212;
                    } else {
                        iM45029 = (C19806.m45029("᩶ۧ") + i8) * 97;
                        i3 = ((iM45029 ^ i9) * 4669) ^ (-430632293);
                        i4 = -1667864434;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
                default:
                    interfaceC6025 = interfaceC6025;
                    i2 = i16;
                    int i26 = i14 + i15;
                    if (i13 - (i26 + i26) > 0) {
                        iM45029 = C19806.m45029("ܽܳ") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-11861)) ^ (-2139438518);
                        i4 = -709188643;
                    } else {
                        iM45029 = C19806.m45029("ۜۨ") ^ i9;
                        i3 = ((iM45029 ^ i8) * 18841) ^ (-1162934701);
                        i4 = -293732643;
                    }
                    i16 = i2;
                    i11 = iM45029 ^ i4;
                    i10 = i3;
                    interfaceC6025 = interfaceC6025;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m4680() {
        int i = 0;
        int i2 = 923352035;
        int i3 = C3660.f13403;
        int i4 = RunnableC1606.f6488;
        int iM11306 = ThreadFactoryC3888.m11306("ܶۚ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-3663)) ^ (-250275301);
        int i6 = -1401022374;
        while (true) {
            i2 = ((((i2 ^ i3) * 13603) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2128891214:
                case 1135159526:
                    i = 1;
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("ܽܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19877) ^ 959854246;
                        i6 = 2146629794;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 6205) ^ 1740816799;
                        i6 = -915018889;
                    }
                    break;
                case -1861315225:
                case 2118489767:
                    return -1;
                case -1742601050:
                case -642885824:
                    if (RunnableC0195.m1431()) {
                        iM11306 = (i4 - C19806.m45029("ۜ᩵")) * (-51);
                        i5 = ((iM11306 ^ i3) * 24651) ^ (-1689625342);
                        i6 = 880117837;
                    } else {
                        iM11306 = C19806.m45029("᩹ᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18333) ^ 1637852182;
                        i6 = 1950229353;
                    }
                    break;
                case -1679115606:
                case 370915388:
                    C7105.m18985();
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ۛܽ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 6709) ^ 803511607;
                        i6 = -1922031114;
                    } else {
                        iM11306 = C19806.m45029("ܽܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19877) ^ 959854246;
                        i6 = 2146629794;
                    }
                    break;
                case -1575771974:
                case 1897631074:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * 87;
                        i5 = ((iM11306 ^ i3) * 15761) ^ 729912364;
                        i6 = 944535444;
                    } else {
                        iM11306 = C19806.m45029("ۚۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-20797)) ^ (-519727939);
                        i6 = 449510931;
                    }
                    break;
                case -1339753684:
                case 207248574:
                    if (m4669(i)) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-21821)) ^ 1806918993;
                        i6 = 111382436;
                    } else {
                        iM11306 = (C19806.m45029("ۚ֡") ^ i4) * 115;
                        i5 = ((iM11306 ^ i3) * (-32671)) ^ (-510496129);
                        i6 = 1656784755;
                    }
                    break;
                case -1214427249:
                case -547729570:
                    return C2249.m6917(this.f5599);
                case -1153473721:
                case 397431291:
                    C2477.m7593();
                    C0671.m3008();
                    return 0;
                case -1098272104:
                case 193742305:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۙ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-5029)) ^ (-449357062);
                        i6 = 874388003;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * 87;
                        i5 = ((iM11306 ^ i3) * 15761) ^ 729912364;
                        i6 = 944535444;
                    }
                    break;
                case -1064585542:
                case 387272500:
                    C0050.m946();
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ܽܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19877) ^ 959854246;
                        i6 = 2146629794;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * 87;
                        i5 = ((iM11306 ^ i3) * 15761) ^ 729912364;
                        i6 = 944535444;
                    }
                    break;
                case -607578599:
                case 1702623968:
                    if (C10634.m26820()) {
                        iM11306 = C19806.m45029("ۚ᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 440835892;
                        i6 = 1462073636;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7761) ^ 269569353;
                        i6 = 1308667239;
                    }
                    break;
                case -561824288:
                case -396607935:
                    C0278.m1789();
                    iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * 87;
                    i5 = ((iM11306 ^ i3) * 15761) ^ 729912364;
                    i6 = 944535444;
                    break;
                case 648206355:
                case 1340924615:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ۛܽ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 6709) ^ 803511607;
                        i6 = -1922031114;
                    } else {
                        iM11306 = C19806.m45029("ۡܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 6977) ^ (-1922246726);
                        i6 = 901602688;
                    }
                    break;
                case 1240505411:
                case 1865139557:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("ܽܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19877) ^ 959854246;
                        i6 = 2146629794;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰܰ")) * (-75);
                        i5 = ((iM11306 ^ i4) * (-31671)) ^ (-693968877);
                        i6 = -95054588;
                    }
                    break;
                case 1358280152:
                case 2008545639:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * 87;
                        i5 = ((iM11306 ^ i3) * 15761) ^ 729912364;
                        i6 = 944535444;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18721) ^ 864476628;
                        i6 = -2130917228;
                    }
                    break;
                case 1553254711:
                case 1785345627:
                    if (C3660.m10791() != 0) {
                        iM11306 = C19806.m45029("᩹ᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18333) ^ 1637852182;
                        i6 = 1950229353;
                    } else {
                        iM11306 = (C19806.m45029("ۘ᩸") + i3) * 61;
                        i5 = ((iM11306 ^ i4) * 18263) ^ (-1194209504);
                        i6 = -1707115633;
                    }
                    break;
                case 1655123180:
                case 1926531510:
                    C19806.m45024();
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("ۚ᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 440835892;
                        i6 = 1462073636;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * 87;
                        i5 = ((iM11306 ^ i3) * 15761) ^ 729912364;
                        i6 = 944535444;
                    }
                    break;
                default:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۢ") + i4) * 87;
                        i5 = ((iM11306 ^ i3) * 15761) ^ 729912364;
                        i6 = 944535444;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬۫") ^ i4) * (-115);
                        i5 = ((iM11306 ^ i3) * 317) ^ (-1707740825);
                        i6 = 902970012;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m4686() {
        int i = 0;
        boolean z = false;
        int i2 = -1453589733;
        int i3 = C1460.f5948;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = (i3 - C19806.m45029("۟ۚ")) * (-91);
        int i5 = ((iM45029 ^ i4) * (-25995)) ^ 514462274;
        int i6 = 97266421;
        while (true) {
            i2 = ((((i2 ^ i4) * 15475) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2099568741:
                case -507365889:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5493) ^ 1723918938;
                        i6 = -1908521633;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i4;
                        i5 = ((iM45029 ^ i3) * 16473) ^ (-1089212163);
                        i6 = 1835836991;
                    }
                    break;
                case -2073383176:
                case -588652675:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5493) ^ 1723918938;
                        i6 = -1908521633;
                    } else {
                        iM45029 = C19806.m45029("ۡۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 25183) ^ (-1870621059);
                        i6 = -1755304363;
                    }
                    break;
                case -1869368331:
                case -1310708212:
                    C1937.m6279();
                    if (C1025.f4800 < 0) {
                        iM45029 = (i4 - C19806.m45029("᩹᩸")) * (-51);
                        i5 = ((iM45029 ^ i3) * 31629) ^ (-2059029513);
                        i6 = -40937068;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5493) ^ 1723918938;
                        i6 = -1908521633;
                    }
                    break;
                case -1664423740:
                case -865236381:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-17597)) ^ (-1337328802);
                        i6 = -711311722;
                    } else {
                        iM45029 = (C19806.m45029("֨᩵") + i3) * (-25);
                        i5 = ((iM45029 ^ i4) * (-20697)) ^ (-1601975850);
                        i6 = 1779625883;
                    }
                    break;
                case -1628230321:
                case 704831356:
                    C0962.m3746();
                    C1189.m4368();
                    return false;
                case -1132440487:
                case 357045297:
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23631) ^ (-953830832);
                        i6 = 1442178364;
                    } else {
                        iM45029 = C19806.m45029("᩶᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * 23947) ^ 360784100;
                        i6 = 1566260982;
                    }
                    break;
                case -1105470939:
                case 940839025:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12099)) ^ (-1663145562);
                        i6 = 2061846337;
                    } else {
                        iM45029 = C19806.m45029("ۜۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-29473)) ^ 2081202854;
                        i6 = 770613316;
                    }
                    break;
                case -1052059230:
                case 912451573:
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5493) ^ 1723918938;
                        i6 = -1908521633;
                    } else {
                        iM45029 = (C19806.m45029("ܰܳ") ^ i3) * (-59);
                        i5 = ((iM45029 ^ i4) * 19971) ^ (-560682784);
                        i6 = 661719619;
                    }
                    break;
                case -969359210:
                case -61184635:
                    z = true;
                    if (i == 1) {
                        iM45029 = C19806.m45029("ۖ᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * 25259) ^ (-335309286);
                        i6 = -827581418;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15705) ^ (-445620288);
                        i6 = -1966468466;
                    }
                    break;
                case -845270768:
                case 1235619594:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23631) ^ (-953830832);
                        i6 = 1442178364;
                    } else {
                        iM45029 = C19806.m45029("᩻۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 31761) ^ (-1949688255);
                        i6 = -603869693;
                    }
                    break;
                case -743713874:
                case -11982154:
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5493) ^ 1723918938;
                        i6 = -1908521633;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩵ᩳ")) * (-33);
                        i5 = ((iM45029 ^ i3) * (-461)) ^ 2002900230;
                        i6 = -1153238209;
                    }
                    break;
                case -377440814:
                case -24816576:
                    i = this.f5596;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩹᩸")) * (-51);
                        i5 = ((iM45029 ^ i3) * 31629) ^ (-2059029513);
                        i6 = -40937068;
                    } else {
                        iM45029 = (C19806.m45029("ۢܿ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM45029 ^ i4) * 30569) ^ (-559401914);
                        i6 = 615168666;
                    }
                    break;
                case 280049196:
                case 638133869:
                    C2871.m8646();
                    if (!C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-17597)) ^ (-1337328802);
                        i6 = -711311722;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12099)) ^ (-1663145562);
                        i6 = 2061846337;
                    }
                    break;
                case 792504650:
                case 1996678511:
                    C2332.m7079();
                    C2642.m8171();
                    iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-12099)) ^ (-1663145562);
                    i6 = 2061846337;
                    break;
                case 831488188:
                case 842457845:
                    if (C0216.m1591() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5493) ^ 1723918938;
                        i6 = -1908521633;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12099)) ^ (-1663145562);
                        i6 = 2061846337;
                    }
                    break;
                case 1843958177:
                case 1859942840:
                    return false;
                case 1873733573:
                case 2126407336:
                    return z;
                default:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23631) ^ (-953830832);
                        i6 = 1442178364;
                    } else {
                        iM45029 = C19806.m45029("ܿۡ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-29143)) ^ 1522961811;
                        i6 = -245467643;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m4677() {
        int i = 0;
        int i2 = 1226689997;
        int i3 = C1419.f5860;
        int i4 = C1460.f5948;
        int iM11306 = (ThreadFactoryC3888.m11306("ۧܿ") ^ i3) * (-127);
        int i5 = ((iM11306 ^ i4) * (-4909)) ^ (-1010268342);
        int i6 = -1836960198;
        while (true) {
            i2 = ((((i2 ^ i4) * (-9351)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2079759014:
                case 974008351:
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("ᩳۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21637) ^ (-1151436356);
                        i6 = 1365537291;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗܳ") + i3) * 59;
                        i5 = ((iM11306 ^ i4) * 23573) ^ (-2026039133);
                        i6 = 1284029669;
                    }
                    break;
                case -1992202154:
                case -713758255:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ܺ") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * 2163) ^ (-272885304);
                        i6 = -1410280616;
                    } else {
                        iM11306 = C19806.m45029("ᩳۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21637) ^ (-1151436356);
                        i6 = 1365537291;
                    }
                    break;
                case -1947225616:
                case -1821042619:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬۬") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-9523)) ^ (-489140133);
                        i6 = 13909291;
                    } else {
                        iM11306 = C19806.m45029("᩵۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 25893) ^ 1590406370;
                        i6 = -568619330;
                    }
                    break;
                case -1927552340:
                case -1622827139:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬۬") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-9523)) ^ (-489140133);
                        i6 = 13909291;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-14627)) ^ (-1169574816);
                        i6 = -1320617485;
                    }
                    break;
                case -1749777032:
                case 1564358958:
                    i = 4;
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۢۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-1819)) ^ (-1435585973);
                        i6 = 850024023;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩻᩹")) * (-63);
                        i5 = ((iM11306 ^ i3) * 22203) ^ 248351239;
                        i6 = 1381909236;
                    }
                    break;
                case -1515328693:
                case -811983186:
                    if (C2704.m8255() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬۬") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-9523)) ^ (-489140133);
                        i6 = 13909291;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩺") ^ i4) * (-55);
                        i5 = ((iM11306 ^ i3) * 2361) ^ 1158967107;
                        i6 = 1818115481;
                    }
                    break;
                case -1487544915:
                case 507571622:
                    return -1;
                case -1285838911:
                case 1003606788:
                    return C10634.m26819(this.f5599);
                case -1250833044:
                case 2097583553:
                    C10634.m26820();
                    C1148.m4232();
                    return 0;
                case -1234574377:
                case 153508552:
                    if (m4669(i)) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۨ") ^ i4) * 97;
                        i5 = ((iM11306 ^ i3) * (-29241)) ^ 714102171;
                        i6 = -886933209;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۫֫")) * 7;
                        i5 = ((iM11306 ^ i4) * (-30717)) ^ 734420613;
                        i6 = 1677826743;
                    }
                    break;
                case -1186787114:
                case -692318303:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") + i4) * 65;
                        i5 = ((iM11306 ^ i3) * (-23949)) ^ (-156139544);
                        i6 = -1148262772;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬۬") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-9523)) ^ (-489140133);
                        i6 = 13909291;
                    }
                    break;
                case -1068401984:
                case 1732717474:
                    C1461.m5080();
                    iM11306 = C19806.m45029("ᩳۤ") ^ i4;
                    i5 = ((iM11306 ^ i3) * 21637) ^ (-1151436356);
                    i6 = 1365537291;
                    break;
                case -914192071:
                case -302759454:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") + i4) * 65;
                        i5 = ((iM11306 ^ i3) * (-23949)) ^ (-156139544);
                        i6 = -1148262772;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙۡ")) * (-95);
                        i5 = ((iM11306 ^ i4) * 4951) ^ (-53400615);
                        i6 = 473965785;
                    }
                    break;
                case -93703916:
                case 1692708288:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܺ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM11306 ^ i4) * (-31501)) ^ (-855392734);
                        i6 = 1297038135;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ܺ") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * 2163) ^ (-272885304);
                        i6 = -1410280616;
                    }
                    break;
                case 1138898902:
                case 1359267210:
                    if (C0671.m3008() < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬۬") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-9523)) ^ (-489140133);
                        i6 = 13909291;
                    } else {
                        iM11306 = C19806.m45029("ᩳۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21637) ^ (-1151436356);
                        i6 = 1365537291;
                    }
                    break;
                case 1145182121:
                case 1692936802:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۢۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-1819)) ^ (-1435585973);
                        i6 = 850024023;
                    } else {
                        iM11306 = C19806.m45029("᩶ܽ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-12459)) ^ 667819059;
                        i6 = -2131684367;
                    }
                    break;
                case 1889274135:
                case 1982297120:
                    if (C0962.m3746() >= 0) {
                        iM11306 = C19806.m45029("ᩳۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21637) ^ (-1151436356);
                        i6 = 1365537291;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ᩳ") + i4) * (-13);
                        i5 = ((iM11306 ^ i3) * 1109) ^ 329474497;
                        i6 = 1411603283;
                    }
                    break;
                default:
                    if (C0671.f2816 != 0) {
                        iM11306 = C19806.m45029("ۢۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-1819)) ^ (-1435585973);
                        i6 = 850024023;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-3325)) ^ (-452341716);
                        i6 = -595255953;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long m4687() {
        int i = 0;
        int i2 = 136597208;
        int i3 = C3535.f13026;
        int i4 = C2124.f7782;
        int iM11306 = (ThreadFactoryC3888.m11306("ܰ۫") ^ i4) * (-115);
        int i5 = ((iM11306 ^ i3) * (-5669)) ^ 1258898424;
        int i6 = 1016873209;
        while (true) {
            i2 = ((((i2 ^ i3) * 30965) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2074100769:
                case 1501923937:
                    if (CallableC1627.f6528) {
                        iM11306 = (C19806.m45029("ܰۨ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM11306 ^ i4) * 17325) ^ 77097344;
                        i6 = -989015140;
                    } else {
                        iM11306 = C19806.m45029("ܿ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18895) ^ 1491149671;
                        i6 = 142810611;
                    }
                    break;
                case -1918887661:
                case 602190478:
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ܿ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18895) ^ 1491149671;
                        i6 = 142810611;
                    } else {
                        iM11306 = (C19806.m45029("᩻᩶") + i4) * (-25);
                        i5 = ((iM11306 ^ i3) * 149) ^ 101526981;
                        i6 = -1405967115;
                    }
                    break;
                case -1867318720:
                case -1849461004:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("᩻᩶") + i4) * (-25);
                        i5 = ((iM11306 ^ i3) * 149) ^ 101526981;
                        i6 = -1405967115;
                    } else {
                        iM11306 = C19806.m45029("ۘ֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * 30283) ^ 1643392513;
                        i6 = -608215543;
                    }
                    break;
                case -1818634556:
                case 1058947741:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (C19806.m45029("᩻᩶") + i4) * (-25);
                        i5 = ((iM11306 ^ i3) * 149) ^ 101526981;
                        i6 = -1405967115;
                    } else {
                        iM11306 = (C19806.m45029("᩺ۗ") ^ i4) * 93;
                        i5 = ((iM11306 ^ i3) * (-18153)) ^ 1161671618;
                        i6 = -1864521993;
                    }
                    break;
                case -1744748519:
                case -1687361351:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("ۖۧ") + i3) * 101;
                        i5 = ((iM11306 ^ i4) * 20351) ^ 1115368536;
                        i6 = 1584272803;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-20575)) ^ (-1836006980);
                        i6 = 1428344359;
                    }
                    break;
                case -1532013257:
                case 349153999:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("᩺ۜ") ^ i4) * 43;
                        i5 = ((iM11306 ^ i3) * (-3339)) ^ (-1756947608);
                        i6 = -1388379258;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-22171)) ^ (-560432529);
                        i6 = -1199033531;
                    }
                    break;
                case -1450082010:
                case 370518356:
                    C1668.m5583();
                    C1377.m4833();
                    return 0L;
                case -1147610907:
                case 536347169:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (C19806.m45029("ۖۧ") + i3) * 101;
                        i5 = ((iM11306 ^ i4) * 20351) ^ 1115368536;
                        i6 = 1584272803;
                    } else {
                        iM11306 = C19806.m45029("ܿ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18895) ^ 1491149671;
                        i6 = 142810611;
                    }
                    break;
                case -1126741151:
                case -1042244100:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("᩻᩶") + i4) * (-25);
                        i5 = ((iM11306 ^ i3) * 149) ^ 101526981;
                        i6 = -1405967115;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-23405)) ^ (-1193885492);
                        i6 = -549716885;
                    }
                    break;
                case -829924613:
                case 2132311156:
                    if (C10634.f36300 < 0) {
                        iM11306 = (C19806.m45029("᩻᩶") + i4) * (-25);
                        i5 = ((iM11306 ^ i3) * 149) ^ 101526981;
                        i6 = -1405967115;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-28503)) ^ 1935918827;
                        i6 = 1240914734;
                    }
                    break;
                case -820811472:
                case 426406541:
                    if (m4669(i)) {
                        iM11306 = C19806.m45029("ᩳ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 1177) ^ (-50949821);
                        i6 = -1694815122;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 24933) ^ (-514860173);
                        i6 = 505767793;
                    }
                    break;
                case -684287868:
                case 582582784:
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-28503)) ^ 1935918827;
                        i6 = 1240914734;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۡ") + i3) * (-77);
                        i5 = ((iM11306 ^ i4) * 25639) ^ (-2108136502);
                        i6 = 395009059;
                    }
                    break;
                case -492734071:
                case 831802620:
                    if (C2332.m7079() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-28503)) ^ 1935918827;
                        i6 = 1240914734;
                    } else {
                        iM11306 = C19806.m45029("᩶ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 9749) ^ 878798124;
                        i6 = -416659609;
                    }
                    break;
                case -312220669:
                case 93230434:
                    return -1L;
                case -45117953:
                case 2049959171:
                    CallableC1627.m5507();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-28503)) ^ 1935918827;
                    i6 = 1240914734;
                    break;
                case 13875629:
                case 1103520171:
                    return this.f5599.readLong();
                case 540706948:
                case 2041476873:
                    i = 8;
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ܿ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18895) ^ 1491149671;
                        i6 = 142810611;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۫ۤ")) * (-23);
                        i5 = ((iM11306 ^ i4) * 14743) ^ (-1871054746);
                        i6 = -566675625;
                    }
                    break;
                default:
                    if (C0671.m3008() >= 0) {
                        iM11306 = C19806.m45029("ܿ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18895) ^ 1491149671;
                        i6 = 142810611;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ֡") + i3) * 91;
                        i5 = ((iM11306 ^ i4) * (-14151)) ^ (-1087232488);
                        i6 = -1905371446;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2724 m4679() {
        C2724 c2724 = this.f5597;
        C1419.m4970(c2724);
        return c2724;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m4681() {
        return this.f5596;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m4672() {
        int i = 0;
        int i2 = -1574595323;
        int i3 = C0050.f912;
        int i4 = C2477.f9839;
        int iM11306 = ThreadFactoryC3888.m11306("ܽᩳ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-14467)) ^ 1371455405;
        int i6 = -1756971169;
        while (true) {
            i2 = ((((i2 ^ i3) * (-13043)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2016977517:
                case -391031338:
                    C1419.m4973();
                    C1875.m6086();
                    iM11306 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-26563)) ^ (-221505212);
                    i6 = -944590014;
                    break;
                case -1988426715:
                case -411614361:
                    i = this.f5596;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("۟ۛ") ^ i4) * 97;
                        i5 = ((iM11306 ^ i3) * (-32189)) ^ (-1042396153);
                        i6 = 479948637;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩶ᩳ")) * (-105);
                        i5 = ((iM11306 ^ i3) * 7949) ^ 659177497;
                        i6 = 564431787;
                    }
                    break;
                case -1987736772:
                case -529139729:
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26563)) ^ (-221505212);
                        i6 = -944590014;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۛ") + i3) * 7;
                        i5 = ((iM11306 ^ i4) * (-32195)) ^ (-1805790990);
                        i6 = 1036460392;
                    }
                    break;
                case -1952771747:
                case 931818868:
                    C0817.m3399();
                    return false;
                case -1769189540:
                case 1164005417:
                    C1875.m6086();
                    if (C1398.f5802 > 0) {
                        iM11306 = C19806.m45029("ܽۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27547) ^ (-1331125245);
                        i6 = -134824894;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26563)) ^ (-221505212);
                        i6 = -944590014;
                    }
                    break;
                case -1635802961:
                case -838482725:
                    C0526.m2437();
                    if (C1937.m6279() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26563)) ^ (-221505212);
                        i6 = -944590014;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۬") ^ i4) * 59;
                        i5 = ((iM11306 ^ i3) * 32557) ^ (-281941151);
                        i6 = 1926203015;
                    }
                    break;
                case -1606346257:
                case 1471714881:
                    return false;
                case -1453614334:
                case 1984016269:
                    RunnableC3388.m10064();
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = C19806.m45029("᩺ۖ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 4341) ^ (-567045712);
                        i6 = 155775574;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26563)) ^ (-221505212);
                        i6 = -944590014;
                    }
                    break;
                case -1063872355:
                case 325290239:
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("֫ܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-26167)) ^ 428922851;
                        i6 = 736998480;
                    } else {
                        iM11306 = C19806.m45029("ܽۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27547) ^ (-1331125245);
                        i6 = -134824894;
                    }
                    break;
                case -815464572:
                case 687282298:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (C19806.m45029("۟ۛ") ^ i4) * 97;
                        i5 = ((iM11306 ^ i3) * (-32189)) ^ (-1042396153);
                        i6 = 479948637;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۢᩴ")) * (-21);
                        i5 = ((iM11306 ^ i3) * 17719) ^ 379903273;
                        i6 = -76559719;
                    }
                    break;
                case -593758132:
                case 1587734113:
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۨ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-18609)) ^ 377531558;
                        i6 = 1598671853;
                    } else {
                        iM11306 = (C19806.m45029("۟ۛ") ^ i4) * 97;
                        i5 = ((iM11306 ^ i3) * (-32189)) ^ (-1042396153);
                        i6 = 479948637;
                    }
                    break;
                case 20219936:
                case 1541145685:
                    if (C1377.f5749) {
                        iM11306 = (i3 - C19806.m45029("֫ۨ")) * 85;
                        i5 = ((iM11306 ^ i4) * (-27115)) ^ (-1575427356);
                        i6 = 1734093336;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26563)) ^ (-221505212);
                        i6 = -944590014;
                    }
                    break;
                case 224752915:
                case 677563806:
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ܽۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27547) ^ (-1331125245);
                        i6 = -134824894;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9319)) ^ (-1836768957);
                        i6 = -1874580964;
                    }
                    break;
                case 593327565:
                case 1799124721:
                    return true;
                case 628667939:
                case 1038833911:
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ܽۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 27547) ^ (-1331125245);
                        i6 = -134824894;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ᩴ") ^ i3) * (-87);
                        i5 = ((iM11306 ^ i4) * 3117) ^ 750167081;
                        i6 = 973463488;
                    }
                    break;
                case 783572006:
                case 982294482:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("᩺ۖ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 4341) ^ (-567045712);
                        i6 = 155775574;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۛ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 10621) ^ (-1357865711);
                        i6 = 1430874665;
                    }
                    break;
                case 929157165:
                case 2130421685:
                    if (i == 4) {
                        iM11306 = (i3 - C19806.m45029("ܽܳ")) * (-117);
                        i5 = ((iM11306 ^ i4) * 27727) ^ 2068295955;
                        i6 = 330102530;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-619)) ^ 1575609831;
                        i6 = -797915927;
                    }
                    break;
                default:
                    if (C0050.m946() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26563)) ^ (-221505212);
                        i6 = -944590014;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۤ֫")) * 7;
                        i5 = ((iM11306 ^ i4) * (-8195)) ^ 262968975;
                        i6 = 406930263;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4675(byte[] bArr) {
        C17367 c17367 = null;
        int i = 1925611027;
        int i2 = C1461.f5957;
        int i3 = C3535.f13026;
        int iM45029 = C19806.m45029("ۜۤ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-23943)) ^ 10997875;
        int i5 = 979444751;
        while (true) {
            i = ((((i ^ i3) * (-27323)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2128850658:
                case 1875640768:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 14309) ^ (-109546224);
                        i5 = 1481213896;
                    } else {
                        iM45029 = C19806.m45029("ۗܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2021) ^ 1899606130;
                        i5 = -2062343310;
                    }
                    break;
                case -1949723815:
                case 1076955725:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18605)) ^ 1518382564;
                        i5 = -749970126;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۛ") + i2) * 93;
                        i4 = ((iM45029 ^ i3) * 14143) ^ 1787799307;
                        i5 = -1677258006;
                    }
                    break;
                case -1934845845:
                case -363046271:
                    C1398.m4895();
                    C0278.m1789();
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM45029 ^ i3) * 14309) ^ (-109546224);
                    i5 = 1481213896;
                    break;
                case -1580331603:
                case 1518015300:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31465)) ^ 1774043896;
                        i5 = 1824747606;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۨ") ^ i3) * 19;
                        i4 = ((iM45029 ^ i2) * (-5561)) ^ (-1004894508);
                        i5 = 1568748974;
                    }
                    break;
                case -1099759037:
                case 53708949:
                    c17367 = this.f5599;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") + i2) * (-13);
                        i4 = ((iM45029 ^ i3) * (-23253)) ^ (-1679455110);
                        i5 = 1839880321;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7731)) ^ 505248367;
                        i5 = 1178193876;
                    }
                    break;
                case -1029215964:
                case 433768640:
                    RunnableC3388.m10051(c17367);
                    c17367.m40446(bArr.length, bArr);
                    break;
                case -931922925:
                case -621558747:
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("᩺ܰ") ^ i2) * 79;
                        i4 = ((iM45029 ^ i3) * (-377)) ^ 2144782378;
                        i5 = 1145601198;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 14309) ^ (-109546224);
                        i5 = 1481213896;
                    }
                    break;
                case -667696081:
                case 2118652762:
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18605)) ^ 1518382564;
                        i5 = -749970126;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷᩻")) * 97;
                        i4 = ((iM45029 ^ i2) * 22319) ^ (-1090613007);
                        i5 = -1614033386;
                    }
                    break;
                case -283407322:
                case 2079764148:
                    RunnableC3388.m10064();
                    if (!C2871.m8646()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31465)) ^ 1774043896;
                        i5 = 1824747606;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֫") + i2) * 53;
                        i4 = ((iM45029 ^ i3) * 18087) ^ 268880494;
                        i5 = 475274516;
                    }
                    break;
                case 67852375:
                case 1543941459:
                    C2332.m7079();
                    break;
                case 102623297:
                case 857970287:
                    if (CallableC1627.m5507() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18605)) ^ 1518382564;
                        i5 = -749970126;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 14309) ^ (-109546224);
                        i5 = 1481213896;
                    }
                    break;
                case 176560323:
                case 1644479012:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֫") + i2) * 53;
                        i4 = ((iM45029 ^ i3) * 18087) ^ 268880494;
                        i5 = 475274516;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25355) ^ 1747810629;
                        i5 = 746740145;
                    }
                    break;
                case 542346825:
                case 1961121805:
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֫") + i2) * 53;
                        i4 = ((iM45029 ^ i3) * 18087) ^ 268880494;
                        i5 = 475274516;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۟ۢ")) * (-103);
                        i4 = ((iM45029 ^ i2) * 16153) ^ 1010440093;
                        i5 = 1196664287;
                    }
                    break;
                case 712237571:
                case 1520943865:
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") + i2) * (-13);
                        i4 = ((iM45029 ^ i3) * (-23253)) ^ (-1679455110);
                        i5 = 1839880321;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1295) ^ (-1233456035);
                        i5 = -2141863320;
                    }
                    break;
                case 1364152971:
                case 1658110053:
                    if (C2249.m6915() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31465)) ^ 1774043896;
                        i5 = 1824747606;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18605)) ^ 1518382564;
                        i5 = -749970126;
                    }
                    break;
                default:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31465)) ^ 1774043896;
                        i5 = 1824747606;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩷᩹")) * 31;
                        i4 = ((iM45029 ^ i3) * 7549) ^ (-605389143);
                        i5 = -375326181;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m4684() {
        int i = 0;
        byte bM10784 = 0;
        int i2 = -230122179;
        int i3 = C2642.f10294;
        int i4 = C2477.f9839;
        int iM11306 = ThreadFactoryC3888.m11306("ܰܶ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 4071) ^ (-2031684087);
        int i6 = -1652258120;
        while (true) {
            i2 = ((((i2 ^ i4) * (-12029)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2111891836:
                case -956440077:
                    i = 1;
                    if (C1025.m3861() <= 0) {
                        iM11306 = C19806.m45029("֫᩶") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21309)) ^ 131114291;
                        i6 = 1246395521;
                    } else {
                        iM11306 = (C19806.m45029("ᩳܶ") ^ i4) * 91;
                        i5 = ((iM11306 ^ i3) * 11237) ^ 1657831863;
                        i6 = -1307105268;
                    }
                    break;
                case -2088190786:
                case 831550557:
                    return -1;
                case -1807843074:
                case 845507061:
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("᩷ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 7759) ^ 1584603914;
                        i6 = 191497827;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * 8357) ^ 1041778500;
                        i6 = -852280486;
                    }
                    break;
                case -1807259643:
                case 868739704:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۙۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-22493)) ^ (-780376389);
                        i6 = 1469109065;
                    } else {
                        iM11306 = C19806.m45029("ۜ᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 29099) ^ (-983603564);
                        i6 = -2042930555;
                    }
                    break;
                case -1769337493:
                case 382396345:
                    RunnableC1606.m5473();
                    iM11306 = C19806.m45029("᩷ۗ") ^ i4;
                    i5 = ((iM11306 ^ i3) * 7759) ^ 1584603914;
                    i6 = 191497827;
                    break;
                case -1712323942:
                case -296546209:
                    return bM10784 & 255;
                case -1663185801:
                case -497835501:
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("ܺ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22277) ^ (-1459819992);
                        i6 = 156334949;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 8099) ^ 702986133;
                        i6 = 1909692294;
                    }
                    break;
                case -1337225765:
                case 31566821:
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("᩷ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 7759) ^ 1584603914;
                        i6 = 191497827;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۨۨ")) * 45;
                        i5 = ((iM11306 ^ i3) * (-16013)) ^ (-383952364);
                        i6 = -996592738;
                    }
                    break;
                case -1123886114:
                case -816324372:
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("ܺ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22277) ^ (-1459819992);
                        i6 = 156334949;
                    } else {
                        iM11306 = C19806.m45029("֨ᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 30201) ^ 106026074;
                        i6 = -1948460044;
                    }
                    break;
                case -1005734568:
                case 2096000328:
                    if (m4669(i)) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۡ") ^ i3) * 95;
                        i5 = ((iM11306 ^ i4) * 6837) ^ 776831989;
                        i6 = 973665326;
                    } else {
                        iM11306 = (C19806.m45029("᩵ܺ") ^ i3) * 79;
                        i5 = ((iM11306 ^ i4) * (-27385)) ^ 536706147;
                        i6 = -1997797961;
                    }
                    break;
                case -984415300:
                case 923806182:
                    bM10784 = C3660.m10784(this.f5599);
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ۜۚ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 23767) ^ 1798370563;
                        i6 = -373170422;
                    } else {
                        iM11306 = C19806.m45029("֫᩶") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21309)) ^ 131114291;
                        i6 = 1246395521;
                    }
                    break;
                case -780630407:
                case -167070860:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۙۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-22493)) ^ (-780376389);
                        i6 = 1469109065;
                    } else {
                        iM11306 = C19806.m45029("ۤ֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-19555)) ^ 1506549044;
                        i6 = -2092536567;
                    }
                    break;
                case -154407775:
                case 1446032190:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("ܺ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22277) ^ (-1459819992);
                        i6 = 156334949;
                    } else {
                        iM11306 = C19806.m45029("᩷ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 7759) ^ 1584603914;
                        i6 = 191497827;
                    }
                    break;
                case -10404834:
                case 27849469:
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("ܺ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22277) ^ (-1459819992);
                        i6 = 156334949;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۢ۫")) * (-101);
                        i5 = ((iM11306 ^ i4) * (-26243)) ^ 2143055226;
                        i6 = 331427605;
                    }
                    break;
                case 664866489:
                case 1819994268:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ܰۜ")) * 41;
                        i5 = ((iM11306 ^ i4) * (-29763)) ^ (-946005873);
                        i6 = -116775393;
                    } else {
                        iM11306 = C19806.m45029("ܺ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22277) ^ (-1459819992);
                        i6 = 156334949;
                    }
                    break;
                case 1405935571:
                case 1988639421:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("۠ۤ") ^ i3) * 23;
                        i5 = ((iM11306 ^ i4) * (-13873)) ^ (-1155470937);
                        i6 = 698012556;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܰۜ")) * 41;
                        i5 = ((iM11306 ^ i4) * (-29763)) ^ (-946005873);
                        i6 = -116775393;
                    }
                    break;
                case 1854633579:
                case 2069380045:
                    RunnableC3388.m10064();
                    return 0;
                default:
                    AbstractC0464.m2313();
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ۙۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-22493)) ^ (-780376389);
                        i6 = 1469109065;
                    } else {
                        iM11306 = C19806.m45029("᩷ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 7759) ^ 1584603914;
                        i6 = 191497827;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] m4673() {
        return this.f5599.m40451();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m4683() {
        return this.f5599.m40458();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m4671() {
        return C2249.m6907(this.f5599);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m4674() {
        return (int) this.f5599.available();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m4685() {
        C17367 c17367 = null;
        byte[] bArr = null;
        byte[] bArrM41969 = null;
        int i = 1102157128;
        int i2 = C1398.f5802;
        int i3 = C0050.f912;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨۜ")) * (-79);
        int i4 = ((iM11306 ^ i2) * (-19673)) ^ 1096678565;
        int i5 = 956859321;
        while (true) {
            int i6 = iM11306 ^ i5;
            while (true) {
                i = ((((i ^ i2) * 29759) >> 31) & i4) ^ i6;
                switch (i) {
                    case -2020444981:
                    case 1792677027:
                        boolean zM10781 = C3660.m10781(c17367);
                        byte[] bArrM40451 = c17367.m40451();
                        if (!zM10781) {
                            bArr = bArrM40451;
                            bArrM41969 = bArr;
                            iM11306 = (i2 - ThreadFactoryC3888.m11306("ܿۛ")) * (-87);
                            i4 = ((iM11306 ^ i3) * (-10899)) ^ 972197183;
                            i5 = 820296975;
                        }
                        int iM11307 = ThreadFactoryC3888.m11306("۠֫") ^ i3;
                        i4 = ((iM11307 ^ i2) * 26301) ^ 647116090;
                        i6 = iM11307 ^ 1949979539;
                        bArr = bArrM40451;
                        break;
                        break;
                    case -1949336406:
                    case -274540953:
                        if (C0671.m3008() < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۗ۟") ^ i2;
                            i4 = ((iM11306 ^ i3) * 16973) ^ (-950497548);
                            i5 = -833068012;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۡ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12467)) ^ 384258445;
                        i5 = -77287134;
                        break;
                    case -1600418972:
                    case 1759515894:
                        C1398.m4895();
                        if (C1419.f5860 >= 0) {
                            iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺۟")) * 115;
                            i4 = ((iM11306 ^ i3) * 22977) ^ 1239286818;
                            i5 = 1237446217;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("۬ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27817)) ^ (-1385549374);
                        i5 = -920396689;
                        break;
                    case -1597665833:
                    case -1286637960:
                        if (C3660.m10791() == 0) {
                            iM11306 = (C19806.m45029("۟᩺") ^ i2) * (-77);
                            i4 = ((iM11306 ^ i3) * 6521) ^ 863398637;
                            i5 = 1305694676;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("۬ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27817)) ^ (-1385549374);
                        i5 = -920396689;
                        break;
                        break;
                    case -1312930843:
                    case -618646925:
                        if (C1398.m4895() > 0) {
                            iM11306 = C19806.m45029("ۢۚ") ^ i3;
                            i4 = ((iM11306 ^ i2) * 16353) ^ 1060585899;
                            i5 = -1551330372;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("۬ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27817)) ^ (-1385549374);
                        i5 = -920396689;
                        break;
                        break;
                    case -1219562262:
                    case 1211318166:
                        C3577.m10565();
                        if (C1025.f4800 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܰ֫") ^ i3;
                            i4 = ((iM11306 ^ i2) * 10795) ^ (-1420617891);
                            i5 = 469450192;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("۬ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27817)) ^ (-1385549374);
                        i5 = -920396689;
                        break;
                        break;
                    case -836895074:
                    case -726531063:
                        if (!C3743.f13569) {
                            iM11306 = ThreadFactoryC3888.m11306("ܰ֫") ^ i3;
                            i4 = ((iM11306 ^ i2) * 10795) ^ (-1420617891);
                            i5 = 469450192;
                            break;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩶") ^ i2) * 119;
                        i4 = ((iM11306 ^ i3) * 26969) ^ 945991228;
                        i5 = 1794906674;
                        break;
                    case -499764139:
                    case 1548373544:
                        RunnableC1564.m5345();
                        C19806.m45024();
                        return null;
                    case -447902975:
                    case 1222063627:
                        if (C3535.f13026 > 0) {
                            iM11306 = C19806.m45029("ۧ᩸") ^ i2;
                            i4 = ((iM11306 ^ i3) * (-1163)) ^ 1195527333;
                            i5 = -639272350;
                            break;
                        }
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺۟")) * 115;
                        i4 = ((iM11306 ^ i3) * 22977) ^ 1239286818;
                        i5 = 1237446217;
                        break;
                        break;
                    case -221617347:
                    case 1843278047:
                        if (!RunnableC1895.f7152) {
                            iM11306 = ThreadFactoryC3888.m11306("ܰ֫") ^ i3;
                            i4 = ((iM11306 ^ i2) * 10795) ^ (-1420617891);
                            i5 = 469450192;
                            break;
                            break;
                        }
                        iM11306 = (C19806.m45029("ۗܽ") + i3) * (-73);
                        i4 = ((iM11306 ^ i2) * 9965) ^ (-1078333083);
                        i5 = -413263208;
                        break;
                    case -219103250:
                    case 1184227568:
                        if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                            iM11306 = ThreadFactoryC3888.m11306("ᩳܺ") ^ i3;
                            i4 = ((iM11306 ^ i2) * (-4525)) ^ (-615815917);
                            i5 = 653506151;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 29411) ^ 132517046;
                        i5 = -323892459;
                        break;
                    case -216784701:
                    case 1473690486:
                        if (ThreadFactoryC3888.f14547 > 0) {
                            iM11306 = C19806.m45029("ᩳۜ") ^ i3;
                            i4 = ((iM11306 ^ i2) * 4299) ^ (-857244181);
                            i5 = -1760980647;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 29411) ^ 132517046;
                        i5 = -323892459;
                        break;
                        break;
                    case 282237889:
                    case 2060513352:
                        AbstractC0464.m2313();
                        if (C1066.f4915 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ۬") ^ i3;
                            i4 = ((iM11306 ^ i2) * (-12467)) ^ 384258445;
                            i5 = -77287134;
                            break;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10795) ^ (-1420617891);
                        i5 = 469450192;
                        break;
                        break;
                    case 1157885410:
                    case 1473331272:
                        C1668.m5583();
                        C7105.m18985();
                        iM11306 = ThreadFactoryC3888.m11306("۬ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27817)) ^ (-1385549374);
                        i5 = -920396689;
                        break;
                        break;
                    case 1175859590:
                    case 1386715565:
                        c17367 = this.f5599;
                        if (C3577.f13150 < 0) {
                            iM11306 = (C19806.m45029("ܿ۠") + i3) * (-117);
                            i4 = ((iM11306 ^ i2) * 5199) ^ 323115016;
                            i5 = -33545262;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10795) ^ (-1420617891);
                        i5 = 469450192;
                        break;
                        break;
                    case 1203639398:
                    case 1219720642:
                        if (!C0526.f2219) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡܶ") ^ i2) * (-105);
                            i4 = ((iM11306 ^ i3) * 9891) ^ 918310084;
                            i5 = 64326734;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۡ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12467)) ^ 384258445;
                        i5 = -77287134;
                        break;
                        break;
                    case 1742583067:
                    case 1828581158:
                        return new String(bArrM41969, StandardCharsets.UTF_8);
                    default:
                        bArrM41969 = C18019.m41969(bArr, bArr.length);
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܿۛ")) * (-87);
                        i4 = ((iM11306 ^ i3) * (-10899)) ^ 972197183;
                        i5 = 820296975;
                        break;
                }
            }
        }
    }
}
