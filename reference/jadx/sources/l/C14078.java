package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 81FR */
/* JADX INFO: loaded from: classes3.dex */
public class C14078 extends FrameLayout {

    /* JADX INFO: renamed from: ۬ۛۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f46233 = {3338, 10613, 1835, 5270, -11277, 997, 11213, 4021, -8750, 1550, 2885, -11702, -16133, 9325, 17840, 18246, 22663, 20680, -24710, -31525, -17162, 17581, 20791, 17617, -22295, -18488, -31458, 17142, 22846, -13630, -13630, -13630, -13609, -13609, -13609, -13736};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f46234;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f46235;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f46236;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f46237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f46238;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f46239;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m34060() {
        TextView textView = null;
        CharSequence charSequenceM5513 = null;
        int i = -588445738;
        int i2 = AbstractC0464.f2088;
        int i3 = C1937.f7317;
        int iM45029 = (C19806.m45029("ܳۗ") ^ i2) * 69;
        int i4 = ((iM45029 ^ i3) * 19699) ^ (-1858958976);
        int i5 = -956976478;
        while (true) {
            i = ((((i ^ i3) * (-32751)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2130628365:
                case 784892337:
                    return C2124.m6674(charSequenceM5513);
                case -1762745614:
                case 351362403:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ܿܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 10243) ^ 1762645072;
                        i5 = 289982098;
                    } else {
                        iM45029 = C19806.m45029("֨ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7857)) ^ (-1041483332);
                        i5 = -1117101692;
                    }
                    break;
                case -1760340380:
                case -686580724:
                    charSequenceM5513 = CallableC1627.m5513(textView);
                    if (charSequenceM5513 == null) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25803) ^ 1688978969;
                        i5 = -613682636;
                    } else {
                        iM45029 = C19806.m45029("ۡ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2125) ^ (-1534427919);
                        i5 = 1990908195;
                    }
                    break;
                case -1563151197:
                case -1446673109:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("ܿܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 10243) ^ 1762645072;
                        i5 = 289982098;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۜ֡")) * (-75);
                        i4 = ((iM45029 ^ i2) * (-30259)) ^ 1153892747;
                        i5 = 1729813804;
                    }
                    break;
                case -1525218487:
                case 328928413:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32403)) ^ 2116871356;
                        i5 = 488173907;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27237) ^ 365275809;
                        i5 = 1381326657;
                    }
                    break;
                case -1250976709:
                case -452435812:
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30995)) ^ (-1944589642);
                        i5 = -2062504784;
                    } else {
                        iM45029 = C19806.m45029("ܿܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 10243) ^ 1762645072;
                        i5 = 289982098;
                    }
                    break;
                case -1175855102:
                case 1245642199:
                    C1668.m5583();
                    return null;
                case -763192742:
                case 819409323:
                    return "";
                case -645057454:
                case 579994773:
                    RunnableC3388.m10064();
                    ThreadFactoryC3888.m11300();
                    iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i3;
                    i4 = ((iM45029 ^ i2) * 27237) ^ 365275809;
                    i5 = 1381326657;
                    break;
                case -332298235:
                case 34435487:
                    if (C1398.m4895() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27237) ^ 365275809;
                        i5 = 1381326657;
                    } else {
                        iM45029 = (C19806.m45029("ۗܳ") + i3) * (-23);
                        i4 = ((iM45029 ^ i2) * (-3707)) ^ 545204840;
                        i5 = -686465427;
                    }
                    break;
                case -181336219:
                case 1147208186:
                    C2871.m8646();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("ۧܶ") + i2) * 37;
                        i4 = ((iM45029 ^ i3) * 7435) ^ (-1949909274);
                        i5 = -453610245;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۢ") + i3) * (-5);
                        i4 = ((iM45029 ^ i2) * 10989) ^ 1955497941;
                        i5 = 1296311888;
                    }
                    break;
                case -84650977:
                case 1116111025:
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = C19806.m45029("ۗۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24155) ^ (-867142361);
                        i5 = 469986367;
                    } else {
                        iM45029 = (C19806.m45029("ۧܶ") + i2) * 37;
                        i4 = ((iM45029 ^ i3) * 7435) ^ (-1949909274);
                        i5 = -453610245;
                    }
                    break;
                case -28997212:
                case 1974014086:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ۧܶ") + i2) * 37;
                        i4 = ((iM45029 ^ i3) * 7435) ^ (-1949909274);
                        i5 = -453610245;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩺ۜ")) * (-77);
                        i4 = ((iM45029 ^ i3) * 9203) ^ (-592378338);
                        i5 = -913052580;
                    }
                    break;
                case 21388314:
                case 115908284:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27237) ^ 365275809;
                        i5 = 1381326657;
                    } else {
                        iM45029 = C19806.m45029("۠ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23249)) ^ (-1723297793);
                        i5 = 768310360;
                    }
                    break;
                case 344616141:
                case 1858539435:
                    textView = this.f46235;
                    if (RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27237) ^ 365275809;
                        i5 = 1381326657;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11181)) ^ (-1749176850);
                        i5 = 1319868912;
                    }
                    break;
                case 578768398:
                case 671696920:
                    C1377.m4833();
                    if (!RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27237) ^ 365275809;
                        i5 = 1381326657;
                    } else {
                        iM45029 = (C19806.m45029("ۧܶ") + i2) * 37;
                        i4 = ((iM45029 ^ i3) * 7435) ^ (-1949909274);
                        i5 = -453610245;
                    }
                    break;
                case 1165663535:
                case 1551320238:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ۗۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24155) ^ (-867142361);
                        i5 = 469986367;
                    } else {
                        iM45029 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30095) ^ 2106012273;
                        i5 = -11678108;
                    }
                    break;
                default:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32513) ^ 900398365;
                        i5 = -1269565713;
                    } else {
                        iM45029 = (C19806.m45029("ۧܶ") + i2) * 37;
                        i4 = ((iM45029 ^ i3) * 7435) ^ (-1949909274);
                        i5 = -453610245;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34059(boolean z) {
        int i = 723683820;
        int i2 = C2249.f8050;
        int i3 = C1461.f5957;
        int iM45029 = (C19806.m45029("ᩳۚ") + i3) * 119;
        int i4 = ((iM45029 ^ i2) * (-3713)) ^ (-1618547325);
        int i5 = 1714205174;
        while (true) {
            i = ((((i ^ i2) * 30387) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1978308502:
                case 2133434155:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ᩴܿ") ^ i2) * 11;
                        i4 = ((iM45029 ^ i3) * 15443) ^ 538926821;
                        i5 = -1175978109;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10499)) ^ (-1531406421);
                        i5 = -790819843;
                    }
                    break;
                case -1955608407:
                case -1774674855:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴᩴ") ^ i2) * (-109);
                        i4 = ((iM45029 ^ i3) * (-28193)) ^ (-1802495016);
                        i5 = -948790000;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩵ۙ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-12343)) ^ 611121631;
                        i5 = -1689983363;
                    }
                    break;
                case -1915590961:
                case 699208666:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩵ۙ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-12343)) ^ 611121631;
                        i5 = -1689983363;
                    } else {
                        iM45029 = (C19806.m45029("ۢ᩶") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * 30313) ^ (-614974789);
                        i5 = -1450440953;
                    }
                    break;
                case -1870480295:
                case 280920521:
                    if (this.f46236 != z) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12487)) ^ 1728388748;
                        i5 = 529126960;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6257)) ^ 1958567892;
                        i5 = -990110453;
                    }
                    break;
                case -1453935325:
                case 1206672669:
                    this.f46236 = z;
                    m34053();
                    iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-6257)) ^ 1958567892;
                    i5 = -990110453;
                    break;
                case -1419594659:
                case -918829940:
                    C2332.m7079();
                    iM45029 = C19806.m45029("ۧ᩵") ^ i2;
                    i4 = ((iM45029 ^ i3) * 15875) ^ 565940664;
                    i5 = -664244090;
                    break;
                case -1351119137:
                case -1296171420:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩵ۙ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-12343)) ^ 611121631;
                        i5 = -1689983363;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۗ") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-27773)) ^ (-1292898487);
                        i5 = -1612212131;
                    }
                    break;
                case -1170028237:
                case 358983776:
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("ۧ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15875) ^ 565940664;
                        i5 = -664244090;
                    } else {
                        iM45029 = C19806.m45029("ܰۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19493) ^ 251213100;
                        i5 = -900646086;
                    }
                    break;
                case -798950867:
                case 1012763735:
                    C3535.m10431();
                    if (!C0817.f3443) {
                        iM45029 = C19806.m45029("ۧ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15875) ^ 565940664;
                        i5 = -664244090;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩵ۙ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-12343)) ^ 611121631;
                        i5 = -1689983363;
                    }
                    break;
                case -589633930:
                case 1449670762:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("ۧ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15875) ^ 565940664;
                        i5 = -664244090;
                    } else {
                        iM45029 = C19806.m45029("᩵ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9503)) ^ (-1669941978);
                        i5 = 1320708465;
                    }
                    break;
                case -424178113:
                case 2118677896:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ۧ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15875) ^ 565940664;
                        i5 = -664244090;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16563) ^ (-1981789332);
                        i5 = -149815811;
                    }
                    break;
                case -318121975:
                case 171085794:
                    if (C0671.f2816 != 0) {
                        iM45029 = (i3 - C19806.m45029("᩵ۙ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-12343)) ^ 611121631;
                        i5 = -1689983363;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܿ֨")) * 35;
                        i4 = ((iM45029 ^ i2) * (-17547)) ^ (-1322599895);
                        i5 = -1776315253;
                    }
                    break;
                case -37523441:
                case 1389619159:
                    if (!C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴᩴ") ^ i2) * (-109);
                        i4 = ((iM45029 ^ i3) * (-28193)) ^ (-1802495016);
                        i5 = -948790000;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24393)) ^ (-1215320421);
                        i5 = -832660773;
                    }
                    break;
                case 77363009:
                case 357003954:
                    break;
                case 383676353:
                case 1527773720:
                    if (C2332.m7079() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24393)) ^ (-1215320421);
                        i5 = -832660773;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩺") ^ i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 7975) ^ 1818722553;
                        i5 = -2139774899;
                    }
                    break;
                case 403427719:
                case 1538478553:
                    C1875.m6086();
                    C3660.m10791();
                    break;
                case 1588109412:
                case 2124630192:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ᩴܿ") ^ i2) * 11;
                        i4 = ((iM45029 ^ i3) * 15443) ^ 538926821;
                        i5 = -1175978109;
                    } else {
                        iM45029 = (C19806.m45029("֡᩻") + i3) * (-3);
                        i4 = ((iM45029 ^ i2) * 2733) ^ 1750975773;
                        i5 = 1284449562;
                    }
                    break;
                default:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴᩴ") ^ i2) * (-109);
                        i4 = ((iM45029 ^ i3) * (-28193)) ^ (-1802495016);
                        i5 = -948790000;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1269) ^ 328737531;
                        i5 = -1777617630;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078(ViewOnClickListenerC13209 viewOnClickListenerC13209) {
        super(viewOnClickListenerC13209);
        AttributeSet attributeSet = null;
        int i = -1979029615;
        int i2 = C1066.f4915;
        int i3 = RunnableC3388.f12514;
        int iM11306 = (ThreadFactoryC3888.m11306("ܿܺ") ^ i3) * (-59);
        int i4 = ((iM11306 ^ i2) * (-7903)) ^ 1543370673;
        int i5 = -496047034;
        while (true) {
            i = ((((i ^ i2) * (-17145)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2078892739:
                case -1197992589:
                    if (!C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("۠֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14311) ^ 1770996794;
                        i5 = 1058020166;
                    } else {
                        iM11306 = (C19806.m45029("۟ۜ") + i2) * (-33);
                        i4 = ((iM11306 ^ i3) * 13771) ^ 1981362631;
                        i5 = -79314256;
                    }
                    break;
                case -1763846833:
                case 1865346564:
                    C1189.m4368();
                    throw new RuntimeException();
                case -1489782765:
                case -1357037638:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩹ܰ")) * 65;
                        i4 = ((iM11306 ^ i3) * 11977) ^ 383193190;
                        i5 = 1802257956;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩷") ^ i3) * 25;
                        i4 = ((iM11306 ^ i2) * (-5835)) ^ 1016621681;
                        i5 = -1375024657;
                    }
                    break;
                case -1456133377:
                case 2020365043:
                    if (C2871.m8646()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚܿ") ^ i3) * (-33);
                        i4 = ((iM11306 ^ i2) * 3307) ^ (-986211914);
                        i5 = -1531920165;
                    } else {
                        iM11306 = C19806.m45029("ܿܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14211)) ^ 1154633381;
                        i5 = 148751143;
                    }
                    break;
                case -1204103249:
                case 1521281251:
                    if (C3660.f13403 < 0) {
                        iM11306 = (C19806.m45029("ۗۨ") + i3) * (-113);
                        i4 = ((iM11306 ^ i2) * 30655) ^ (-101384685);
                        i5 = 839312184;
                    } else {
                        iM11306 = C19806.m45029("ܿܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14211)) ^ 1154633381;
                        i5 = 148751143;
                    }
                    break;
                case -1168412347:
                case -352156215:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩹ܰ")) * 65;
                        i4 = ((iM11306 ^ i3) * 11977) ^ 383193190;
                        i5 = 1802257956;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩵֡")) * 39;
                        i4 = ((iM11306 ^ i3) * 471) ^ (-63970660);
                        i5 = -1172932150;
                    }
                    break;
                case -1111094445:
                case 88756861:
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("۟ۜ") + i2) * (-33);
                        i4 = ((iM11306 ^ i3) * 13771) ^ 1981362631;
                        i5 = -79314256;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩶") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-683)) ^ (-1602175240);
                        i5 = -270256662;
                    }
                    break;
                case -1073032097:
                case 2040807896:
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("۟ۜ") + i2) * (-33);
                        i4 = ((iM11306 ^ i3) * 13771) ^ 1981362631;
                        i5 = -79314256;
                    } else {
                        iM11306 = C19806.m45029("᩸ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4635)) ^ (-1419637811);
                        i5 = 1963014794;
                    }
                    break;
                case -985991068:
                case 1909929407:
                    m34054(viewOnClickListenerC13209, attributeSet);
                    return;
                case -962260874:
                case -916536192:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("ۗۨ") + i3) * (-113);
                        i4 = ((iM11306 ^ i2) * 30655) ^ (-101384685);
                        i5 = 839312184;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵֫")) * (-123);
                        i4 = ((iM11306 ^ i3) * 21315) ^ (-266181283);
                        i5 = 1106401559;
                    }
                    break;
                case -448554457:
                case 1641461999:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (C19806.m45029("۟ۜ") + i2) * (-33);
                        i4 = ((iM11306 ^ i3) * 13771) ^ 1981362631;
                        i5 = -79314256;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 16745) ^ 68136386;
                        i5 = -895356746;
                    }
                    break;
                case 5580207:
                case 180322645:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (C19806.m45029("۟ۜ") + i2) * (-33);
                        i4 = ((iM11306 ^ i3) * 13771) ^ 1981362631;
                        i5 = -79314256;
                    } else {
                        iM11306 = C19806.m45029("᩺ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19083) ^ 1858656028;
                        i5 = -274392822;
                    }
                    break;
                case 918424121:
                case 1932674408:
                    if (C2871.f10837 < 0) {
                        iM11306 = (C19806.m45029("۟ۜ") + i2) * (-33);
                        i4 = ((iM11306 ^ i3) * 13771) ^ 1981362631;
                        i5 = -79314256;
                    } else {
                        iM11306 = C19806.m45029("ܿܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14211)) ^ 1154633381;
                        i5 = 148751143;
                    }
                    break;
                case 931853164:
                case 1906758442:
                    if (C1377.f5749) {
                        iM11306 = (C19806.m45029("ܺ᩹") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i2) * (-9707)) ^ 674462384;
                        i5 = 1734035776;
                    } else {
                        iM11306 = (C19806.m45029("ۗۨ") + i3) * (-113);
                        i4 = ((iM11306 ^ i2) * 30655) ^ (-101384685);
                        i5 = 839312184;
                    }
                    break;
                case 1280999897:
                case 2006203058:
                    attributeSet = null;
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14311) ^ 1770996794;
                        i5 = 1058020166;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۖ") ^ i2) * 93;
                        i4 = ((iM11306 ^ i3) * 31301) ^ (-1612398960);
                        i5 = 1599903916;
                    }
                    break;
                default:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = C19806.m45029("ܿܶ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-14211)) ^ 1154633381;
                    i5 = 148751143;
                    break;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = -997338805;
        int i2 = C1066.f4915;
        int i3 = C0629.f2722;
        int iM11306 = ThreadFactoryC3888.m11306("ۡ᩵") ^ i2;
        int i4 = ((iM11306 ^ i3) * 30451) ^ (-681187539);
        int i5 = -1056846979;
        while (true) {
            i = ((((i ^ i3) * 1917) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2139477810:
                case 1328642275:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("۠ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 827) ^ (-2048001824);
                        i5 = 2130803300;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29983) ^ (-770354252);
                        i5 = -1011915365;
                    }
                    break;
                case -1939221340:
                case 1754791314:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("᩺᩺") ^ i3) * (-51);
                        i4 = ((iM11306 ^ i2) * (-26081)) ^ (-1222628972);
                        i5 = 868556636;
                    } else {
                        iM11306 = C19806.m45029("᩺֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8879)) ^ (-1398512333);
                        i5 = -972363750;
                    }
                    break;
                case -1898593823:
                case 1448197639:
                    if (C0671.m3008() >= 0) {
                        iM11306 = C19806.m45029("᩸ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31)) ^ (-459453651);
                        i5 = 1986838451;
                    } else {
                        iM11306 = C19806.m45029("ۖ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13409)) ^ (-36452441);
                        i5 = 2079900467;
                    }
                    break;
                case -1792458633:
                case 875437869:
                    C1148.m4232();
                    C1148.m4232();
                    iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-15773)) ^ (-1772811152);
                    i5 = -1398205011;
                    break;
                case -1769028393:
                case -1508665423:
                    return;
                case -1655283762:
                case 453717622:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15773)) ^ (-1772811152);
                        i5 = -1398205011;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܺܺ")) * (-67);
                        i4 = ((iM11306 ^ i2) * (-5765)) ^ (-108695725);
                        i5 = 1770179258;
                    }
                    break;
                case -1638277259:
                case -219280380:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (i2 - C19806.m45029("᩸֫")) * (-45);
                        i4 = ((iM11306 ^ i3) * 28743) ^ 773121369;
                        i5 = -1957383466;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩵") ^ i3) * 109;
                        i4 = ((iM11306 ^ i2) * 22417) ^ (-2004695264);
                        i5 = -1757018914;
                    }
                    break;
                case -1616344831:
                case -993249413:
                    if (C0629.m2907()) {
                        iM11306 = (C19806.m45029("ۖ۬") + i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-17989)) ^ 213643032;
                        i5 = -2109472866;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩸֫")) * (-45);
                        i4 = ((iM11306 ^ i3) * 28743) ^ 773121369;
                        i5 = -1957383466;
                    }
                    break;
                case -1531114073:
                case 1700215024:
                    m34054(context, attributeSet);
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("᩸ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31)) ^ (-459453651);
                        i5 = 1986838451;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛᩴ") ^ i2) * 9;
                        i4 = ((iM11306 ^ i3) * (-13711)) ^ (-920409046);
                        i5 = 234543930;
                    }
                    break;
                case -1489677408:
                case -786997097:
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("᩸ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31)) ^ (-459453651);
                        i5 = 1986838451;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1733) ^ (-1124104972);
                        i5 = -345415985;
                    }
                    break;
                case -1245953254:
                case 312027112:
                    C2124.m6673();
                    if (!C0817.f3443) {
                        iM11306 = (i2 - C19806.m45029("᩸֫")) * (-45);
                        i4 = ((iM11306 ^ i3) * 28743) ^ 773121369;
                        i5 = -1957383466;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15773)) ^ (-1772811152);
                        i5 = -1398205011;
                    }
                    break;
                case -1077533832:
                case -127478695:
                    C1977.m6356();
                    C0050.m946();
                    throw new RuntimeException();
                case -809214608:
                case 481416424:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (C19806.m45029("᩺᩺") ^ i3) * (-51);
                        i4 = ((iM11306 ^ i2) * (-26081)) ^ (-1222628972);
                        i5 = 868556636;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21259)) ^ (-154209177);
                        i5 = 2125979057;
                    }
                    break;
                case 332639512:
                case 1811321530:
                    C10634.m26820();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (C19806.m45029("᩺᩺") ^ i3) * (-51);
                        i4 = ((iM11306 ^ i2) * (-26081)) ^ (-1222628972);
                        i5 = 868556636;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15773)) ^ (-1772811152);
                        i5 = -1398205011;
                    }
                    break;
                case 448630541:
                case 1128972850:
                    if (C1460.f5948 < 0) {
                        iM11306 = C19806.m45029("᩸ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31)) ^ (-459453651);
                        i5 = 1986838451;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15773)) ^ (-1772811152);
                        i5 = -1398205011;
                    }
                    break;
                default:
                    if (C1189.m4368() <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩸֫")) * (-45);
                        i4 = ((iM11306 ^ i3) * 28743) ^ 773121369;
                        i5 = -1957383466;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۙ") + i2) * 13;
                        i4 = ((iM11306 ^ i3) * 11191) ^ 1965113372;
                        i5 = -1254106865;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = -2129292883;
        int i3 = C1977.f7413;
        int i4 = ThreadFactoryC3888.f14547;
        int iM11306 = ThreadFactoryC3888.m11306("ۜۚ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-5457)) ^ (-699979822);
        int i6 = 1443946789;
        while (true) {
            i2 = ((((i2 ^ i3) * (-32491)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2098022817:
                case -1173966673:
                    C2642.m8171();
                    if (C10634.m26820()) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 23087) ^ (-646189409);
                        i6 = -1867987300;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23211)) ^ 690502162;
                        i6 = -563658892;
                    }
                    break;
                case -1939707076:
                case 1080597010:
                    C0797.m3359();
                    iM11306 = (i4 - C19806.m45029("ۤᩴ")) * 47;
                    i5 = ((iM11306 ^ i3) * (-127)) ^ (-1053042224);
                    i6 = 1301990847;
                    break;
                case -1853845901:
                case 780922347:
                    C2332.m7079();
                    throw new RuntimeException();
                case -1593009393:
                case 1706853558:
                    if (C0817.f3443) {
                        iM11306 = (C19806.m45029("᩵ۧ") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM11306 ^ i3) * 7255) ^ (-1221283614);
                        i6 = 847534603;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23211)) ^ 690502162;
                        i6 = -563658892;
                    }
                    break;
                case -1396233740:
                case 1232882824:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23211)) ^ 690502162;
                        i6 = -563658892;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 8111) ^ 869706580;
                        i6 = 1776072143;
                    }
                    break;
                case -1385030282:
                case 707311316:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۗ᩹")) * (-55);
                        i5 = ((iM11306 ^ i4) * 22465) ^ 1234604123;
                        i6 = -1100362308;
                    } else {
                        iM11306 = C19806.m45029("ᩴۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 8247) ^ (-552488683);
                        i6 = 1930431411;
                    }
                    break;
                case -1330624458:
                case 1071235133:
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30549)) ^ 607113441;
                        i6 = 460917851;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-8359)) ^ 2137966344;
                        i6 = -789055773;
                    }
                    break;
                case -1238627741:
                case 1768227815:
                    if (C1875.m6086() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-8359)) ^ 2137966344;
                        i6 = -789055773;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 14115) ^ (-1952753607);
                        i6 = 1198325036;
                    }
                    break;
                case -959737556:
                case -297461697:
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23211)) ^ 690502162;
                        i6 = -563658892;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۤᩴ")) * 47;
                        i5 = ((iM11306 ^ i3) * (-127)) ^ (-1053042224);
                        i6 = 1301990847;
                    }
                    break;
                case -787319734:
                case -111588006:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-8359)) ^ 2137966344;
                        i6 = -789055773;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۢ") + i4) * 85;
                        i5 = ((iM11306 ^ i3) * (-9965)) ^ 361689772;
                        i6 = -2055378646;
                    }
                    break;
                case -560485586:
                case 1333226595:
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-8359)) ^ 2137966344;
                        i6 = -789055773;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23211)) ^ 690502162;
                        i6 = -563658892;
                    }
                    break;
                case 286233597:
                case 583945307:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۗ᩹")) * (-55);
                        i5 = ((iM11306 ^ i4) * 22465) ^ 1234604123;
                        i6 = -1100362308;
                    } else {
                        iM11306 = (C19806.m45029("ۛ᩸") ^ i3) * (-55);
                        i5 = ((iM11306 ^ i4) * 30357) ^ (-1586553095);
                        i6 = -1718780837;
                    }
                    break;
                case 555134164:
                case 1768832388:
                    return;
                case 1069537893:
                case 1977249347:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۗ᩹")) * (-55);
                        i5 = ((iM11306 ^ i4) * 22465) ^ 1234604123;
                        i6 = -1100362308;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺֡") + i3) * (-65);
                        i5 = ((iM11306 ^ i4) * 28773) ^ 2129620300;
                        i6 = 1316858339;
                    }
                    break;
                case 1219802373:
                case 2100363521:
                    if (C0797.m3359()) {
                        iM11306 = C19806.m45029("ۗ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 3553) ^ (-914236948);
                        i6 = -467055345;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۤᩴ")) * 47;
                        i5 = ((iM11306 ^ i3) * (-127)) ^ (-1053042224);
                        i6 = 1301990847;
                    }
                    break;
                default:
                    m34054(context, attributeSet);
                    if (C0526.m2437() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23211)) ^ 690502162;
                        i6 = -563658892;
                    } else {
                        iM11306 = (C19806.m45029("᩹ۡ") + i4) * (-67);
                        i5 = ((iM11306 ^ i3) * (-14921)) ^ 1191948643;
                        i6 = -743832470;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34066(boolean z) {
        int i = 1344916610;
        int i2 = C1461.f5957;
        int i3 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-16861)) ^ 330558098;
        int i5 = 1373253949;
        while (true) {
            i = ((((i ^ i2) * 22223) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2145659794:
                case 738222653:
                    C3743.m10966();
                    C1875.m6086();
                    iM11306 = (ThreadFactoryC3888.m11306("᩸ۜ") ^ i2) * 17;
                    i4 = ((iM11306 ^ i3) * (-28111)) ^ (-210955486);
                    i5 = 977307424;
                    break;
                case -2077990458:
                case -760469893:
                    break;
                case -2037961868:
                case -1009302805:
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14043)) ^ (-2135260252);
                        i5 = -1178776986;
                    } else {
                        iM11306 = (C19806.m45029("֫ۗ") + i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 12929) ^ 76064087;
                        i5 = -212567933;
                    }
                    break;
                case -1678801823:
                case 982422856:
                    this.f46239 = z;
                    m34053();
                    iM11306 = C19806.m45029("ܺۢ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 13349) ^ (-42968788);
                    i5 = 918177061;
                    break;
                case -1380187364:
                case 689430645:
                    if (C0671.m3008() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29023)) ^ 1241832878;
                        i5 = -147875033;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹֫") + i3) * (-97);
                        i4 = ((iM11306 ^ i2) * 30343) ^ (-1586301358);
                        i5 = -1929802605;
                    }
                    break;
                case -1354087636:
                case -1048488097:
                    C3660.m10791();
                    if (!C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۜ") ^ i2) * 17;
                        i4 = ((iM11306 ^ i3) * (-28111)) ^ (-210955486);
                        i5 = 977307424;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14043)) ^ (-2135260252);
                        i5 = -1178776986;
                    }
                    break;
                case -1353837915:
                case 1571493100:
                    if (C0671.m3008() < 0) {
                        iM11306 = C19806.m45029("᩹֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18561)) ^ (-893415056);
                        i5 = -938091069;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۜ") ^ i2) * 17;
                        i4 = ((iM11306 ^ i3) * (-28111)) ^ (-210955486);
                        i5 = 977307424;
                    }
                    break;
                case -1343537661:
                case -345331773:
                    if (this.f46239 != z) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25941)) ^ 1222454803;
                        i5 = 1659587920;
                    } else {
                        iM11306 = C19806.m45029("ܺۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13349) ^ (-42968788);
                        i5 = 918177061;
                    }
                    break;
                case -1335115540:
                case 1637898611:
                    if (RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("ܳ᩶") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-16831)) ^ (-1631422268);
                        i5 = -753528712;
                    } else {
                        iM11306 = C19806.m45029("ۧ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 759) ^ (-9425128);
                        i5 = -1682791508;
                    }
                    break;
                case -1244688592:
                case 1729315176:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (C19806.m45029("ܳ᩶") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-16831)) ^ (-1631422268);
                        i5 = -753528712;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۗ") + i2) * (-121);
                        i4 = ((iM11306 ^ i3) * 22805) ^ (-108453799);
                        i5 = -957703847;
                    }
                    break;
                case -560446787:
                case -425514129:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14043)) ^ (-2135260252);
                        i5 = -1178776986;
                    } else {
                        iM11306 = C19806.m45029("ۛ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9599) ^ (-1362823900);
                        i5 = -170269543;
                    }
                    break;
                case -460917737:
                case 1878534020:
                    C1937.m6279();
                    C3660.m10791();
                    break;
                case -364122729:
                case 265639197:
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14043)) ^ (-2135260252);
                        i5 = -1178776986;
                    } else {
                        iM11306 = C19806.m45029("۫᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4879)) ^ 1592709703;
                        i5 = 45440553;
                    }
                    break;
                case 172989687:
                case 2027924021:
                    if (C1148.m4232() <= 0) {
                        iM11306 = (C19806.m45029("ܳ᩶") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-16831)) ^ (-1631422268);
                        i5 = -753528712;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30721) ^ (-1848245576);
                        i5 = -876919567;
                    }
                    break;
                case 388558532:
                case 516403307:
                    if (C2642.m8171() != 0) {
                        iM11306 = C19806.m45029("᩹֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18561)) ^ (-893415056);
                        i5 = -938091069;
                    } else {
                        iM11306 = C19806.m45029("֨۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19213) ^ (-1765610366);
                        i5 = -401716469;
                    }
                    break;
                case 799876213:
                case 1852212202:
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("ܳ᩶") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-16831)) ^ (-1631422268);
                        i5 = -753528712;
                    } else {
                        iM11306 = (C19806.m45029("֨ۢ") ^ i2) * (-53);
                        i4 = ((iM11306 ^ i3) * (-4187)) ^ 345273177;
                        i5 = 487663440;
                    }
                    break;
                case 977182879:
                case 1580135653:
                    C0050.m946();
                    if (C0278.m1789() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29023)) ^ 1241832878;
                        i5 = -147875033;
                    } else {
                        iM11306 = C19806.m45029("᩹֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18561)) ^ (-893415056);
                        i5 = -938091069;
                    }
                    break;
                default:
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14043)) ^ (-2135260252);
                        i5 = -1178776986;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9497)) ^ 179442593;
                        i5 = -339533405;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[PHI: r9
      0x0109: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:34:0x0107, B:14:0x006b, B:9:0x005c, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0292  */
    /* JADX WARN: Code duplicated, block: B:72:0x02ce A[PHI: r2 r3 r8 r10 r11
      0x02ce: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:71:0x02cc, B:40:0x0160, B:29:0x00db, B:23:0x0092, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r3v4 android.widget.TextView) = 
      (r3v3 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v2 android.widget.TextView)
     binds: [B:71:0x02cc, B:40:0x0160, B:29:0x00db, B:23:0x0092, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r8v5 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v4 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
     binds: [B:71:0x02cc, B:40:0x0160, B:29:0x00db, B:23:0x0092, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r10v5 java.lang.String) = 
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v4 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
     binds: [B:71:0x02cc, B:40:0x0160, B:29:0x00db, B:23:0x0092, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r11v5 java.lang.String) = 
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
      (r11v4 java.lang.String)
      (r11v2 java.lang.String)
     binds: [B:71:0x02cc, B:40:0x0160, B:29:0x00db, B:23:0x0092, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0391 A[PHI: r14 r15
      0x0391: PHI (r14v4 short) = (r14v3 short), (r14v2 short) binds: [B:86:0x038f, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0391: PHI (r15v4 short) = (r15v3 short), (r15v2 short) binds: [B:86:0x038f, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x03c7 A[PHI: r4 r5 r16 r21
      0x03c7: PHI (r4v5 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:90:0x03c5, B:61:0x024b, B:12:0x0067, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r5v5 android.widget.TextView) = 
      (r5v2 android.widget.TextView)
      (r5v3 android.widget.TextView)
      (r5v2 android.widget.TextView)
      (r5v2 android.widget.TextView)
     binds: [B:90:0x03c5, B:61:0x024b, B:12:0x0067, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:90:0x03c5, B:61:0x024b, B:12:0x0067, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r21v6 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:90:0x03c5, B:61:0x024b, B:12:0x0067, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m34053() {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int iM45029;
        int i4;
        int i5 = C1977.f7413;
        int i6 = C2477.f9839;
        int iM11308 = (ThreadFactoryC3888.m11306("ۗۜ") + i6) * 99;
        int i7 = ((iM11308 ^ i5) * 11231) ^ 1547406099;
        TextView textView = null;
        TextView textView2 = null;
        short[] sArr = null;
        int i8 = iM11308 ^ (-84172212);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        short s2 = 0;
        int i13 = -1587004119;
        char c = 0;
        String strM9788 = null;
        String strM9869 = null;
        String strM10423 = null;
        String strM10056 = null;
        int i14 = 0;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i5) * 17485) >> 31));
            switch (i13) {
                case -2039209780:
                case -359333700:
                    iM11307 = ThreadFactoryC3888.m11306(strM10056);
                    i3 = 2125503543;
                    i11 = iM11307 ^ i3;
                    iM11306 = (ThreadFactoryC3888.m11306("ܶ᩷") + i5) * (-99);
                    i = ((iM11306 ^ i6) * 28203) ^ 316055224;
                    i2 = 367597684;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1997898853:
                case 1977819267:
                    iM45029 = ThreadFactoryC3888.m11306(strM9788);
                    i4 = 2117534068;
                    i14 = iM45029 ^ i4;
                    iM11306 = (i6 - ThreadFactoryC3888.m11306("᩶᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM11306 ^ i5) * 28081) ^ (-1981502234);
                    i2 = 1396175741;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1944523385:
                case 1986371227:
                    C1148.m4225(this.f46238, i10);
                    C1148.m4225(this.f46235, -3746333);
                    iM11306 = C19806.m45029("ᩴ᩶") ^ i6;
                    i = ((iM11306 ^ i5) * (-9045)) ^ (-504106325);
                    i2 = 1461414067;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1908010232:
                case 1385856997:
                    setBackgroundResource(i11);
                    break;
                case -1883272352:
                case 454299126:
                    i12 = 23334;
                    iM11306 = (i6 - C19806.m45029("ۡۤ")) * 97;
                    i = ((iM11306 ^ i5) * 7545) ^ (-1696530282);
                    i2 = 1367967514;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1812677137:
                case 502375281:
                    i12 = 15151;
                    iM11306 = (i6 - C19806.m45029("ۡۤ")) * 97;
                    i = ((iM11306 ^ i5) * 7545) ^ (-1696530282);
                    i2 = 1367967514;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1738050391:
                case 1438935113:
                    int i15 = s + s2;
                    if ((s * 5160) - (i15 * i15) > 0) {
                        iM11306 = C19806.m45029("ۡܽ") ^ i5;
                        i = ((iM11306 ^ i6) * 6037) ^ 349521744;
                        i2 = -1041105897;
                    } else {
                        iM11306 = (i6 - C19806.m45029("۬ۙ")) * (-29);
                        i = ((iM11306 ^ i5) * 27971) ^ (-1469330205);
                        i2 = 1369391509;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1716390187:
                case -1631423867:
                    sArr = f46233;
                    c = 0;
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩻") + i5) * 69;
                        i = ((iM11306 ^ i6) * 6467) ^ (-955992190);
                        i2 = 2010997271;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩵") ^ i5) * 15;
                        i = ((iM11306 ^ i6) * (-5699)) ^ (-1981903293);
                        i2 = -812055930;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1693912366:
                case -1516933794:
                    iM11307 = C19806.m45029(strM10423);
                    i3 = 2097470207;
                    i11 = iM11307 ^ i3;
                    iM11306 = (ThreadFactoryC3888.m11306("ܶ᩷") + i5) * (-99);
                    i = ((iM11306 ^ i6) * 28203) ^ 316055224;
                    i2 = 367597684;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1646643485:
                case -865981073:
                    C1148.m4232();
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۙ") ^ i6;
                        i = ((iM11306 ^ i5) * (-32405)) ^ (-692548587);
                        i2 = 528217380;
                    } else {
                        iM11306 = (C19806.m45029("᩹۟") + i5) * (-33);
                        i = ((iM11306 ^ i6) * (-23181)) ^ (-1855848420);
                        i2 = -1727784893;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1552550319:
                case 1831095420:
                    i9 = -7245255;
                    C2788.m8463(this.f46234, -7245255);
                    textView = this.f46237;
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("۬ܶ") ^ i6;
                        i = ((iM11306 ^ i5) * (-19227)) ^ (-969490547);
                        i2 = 152112033;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۤ᩺")) * (-39);
                        i = ((iM11306 ^ i6) * 151) ^ 247462291;
                        i2 = 1256473687;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1507803153:
                case -253417000:
                    setBackgroundResource(i14);
                    break;
                case -1431923911:
                case 459056626:
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f46233, 7, 3, i12);
                    if (C3660.m10791() != 0) {
                        iM11306 = C19806.m45029("۬ܶ") ^ i6;
                        i = ((iM11306 ^ i5) * (-19227)) ^ (-969490547);
                        i2 = 152112033;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۗ") ^ i5;
                        i = ((iM11306 ^ i6) * (-23311)) ^ 2114922151;
                        i2 = 1408730445;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1425231542:
                case -877801367:
                    C2788.m8463(textView, -2587024);
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("ۢۤ") ^ i6;
                        i = ((iM11306 ^ i5) * (-2821)) ^ 1146355636;
                        i2 = -1135347773;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹᩹") ^ i6) * 27;
                        i = ((iM11306 ^ i5) * 13597) ^ 395543872;
                        i2 = -1714700727;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1248907100:
                case -827424041:
                    if (this.f46239) {
                        iM11306 = C19806.m45029("ۚۢ") ^ i5;
                        i = ((iM11306 ^ i6) * 881) ^ 1656402493;
                        i2 = 1492367146;
                    } else {
                        iM11306 = C19806.m45029("ۢܶ") ^ i6;
                        i = ((iM11306 ^ i5) * 8047) ^ (-2125504718);
                        i2 = -1294309743;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1024738069:
                case 1791367931:
                    strM10056 = RunnableC3388.m10056(f46233, 1, 3, i12);
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("۬ܶ") ^ i6;
                        i = ((iM11306 ^ i5) * (-19227)) ^ (-969490547);
                        i2 = 152112033;
                    } else {
                        iM11306 = C19806.m45029("ۖۗ") ^ i5;
                        i = ((iM11306 ^ i6) * (-10127)) ^ (-2110823413);
                        i2 = -730765431;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -940731508:
                case 657006815:
                    if (this.f46236) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܰ") ^ i5;
                        i = ((iM11306 ^ i6) * 15319) ^ (-1972197986);
                        i2 = 1704719081;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ۫") ^ i6;
                        i = ((iM11306 ^ i5) * 21145) ^ 978520052;
                        i2 = -977350593;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -741756431:
                case 477178640:
                    if (C16135.m38190(RunnableC3388.m10066(this))) {
                        iM11306 = C19806.m45029("ᩴ᩵") ^ i6;
                        i = ((iM11306 ^ i5) * (-4253)) ^ (-179215174);
                        i2 = 2095943261;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܿ") ^ i5;
                        i = ((iM11306 ^ i6) * (-14821)) ^ 220501831;
                        i2 = 1059130444;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -640844705:
                case 1813765323:
                    RunnableC0195.m1431();
                    iM11306 = ThreadFactoryC3888.m11306("᩹ۙ") ^ i6;
                    i = ((iM11306 ^ i5) * (-32405)) ^ (-692548587);
                    i2 = 528217380;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -621664927:
                case -170385931:
                    C1460.m5050();
                    if (AbstractC0464.m2313() == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩻") + i5) * 69;
                        i = ((iM11306 ^ i6) * 6467) ^ (-955992190);
                        i2 = 2010997271;
                    } else {
                        iM11306 = C19806.m45029("۬ܶ") ^ i6;
                        i = ((iM11306 ^ i5) * (-19227)) ^ (-969490547);
                        i2 = 152112033;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -576915751:
                case 183955942:
                    strM10423 = C3535.m10423(f46233, 4, 3, i12);
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۙ") ^ i6;
                        i = ((iM11306 ^ i5) * (-32405)) ^ (-692548587);
                        i2 = 528217380;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i6;
                        i = ((iM11306 ^ i5) * 20275) ^ 850949136;
                        i2 = -710466258;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 29934286:
                case 1401942531:
                    s = sArr[c];
                    s2 = 1290;
                    if (C7105.f23796 >= 0) {
                        iM11306 = (C19806.m45029("᩹۟") + i5) * (-33);
                        i = ((iM11306 ^ i6) * (-23181)) ^ (-1855848420);
                        i2 = -1727784893;
                    } else {
                        iM11306 = (C19806.m45029("ۨۗ") + i6) * 91;
                        i = ((iM11306 ^ i5) * 26677) ^ 1134418087;
                        i2 = -1266706490;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 32580469:
                case 1198490788:
                    iM45029 = C19806.m45029(strM9869);
                    i4 = 2118529624;
                    i14 = iM45029 ^ i4;
                    iM11306 = (i6 - ThreadFactoryC3888.m11306("᩶᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM11306 ^ i5) * 28081) ^ (-1981502234);
                    i2 = 1396175741;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 215991858:
                case 2146286697:
                    i10 = -1086464;
                    C2788.m8463(this.f46234, -1086464);
                    textView2 = this.f46237;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩻") + i5) * 69;
                        i = ((iM11306 ^ i6) * 6467) ^ (-955992190);
                        i2 = 2010997271;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۜ") ^ i5;
                        i = ((iM11306 ^ i6) * 4655) ^ (-1851496077);
                        i2 = 1868585283;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 228421521:
                case 1867106378:
                    C1066.m4023();
                    C2332.m7079();
                    break;
                case 398626229:
                case 1283880691:
                    C1148.m4225(this.f46238, i9);
                    C1148.m4225(this.f46235, -3634375);
                    iM11306 = C19806.m45029("ᩴ᩶") ^ i6;
                    i = ((iM11306 ^ i5) * (-9045)) ^ (-504106325);
                    i2 = 1461414067;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 933147394:
                case 2074729135:
                    if (this.f46239) {
                        iM11306 = C19806.m45029("ۨܳ") ^ i5;
                        i = ((iM11306 ^ i6) * 27983) ^ (-400366948);
                        i2 = 839696335;
                    } else {
                        iM11306 = (i6 - C19806.m45029("۬ܽ")) * (-5);
                        i = ((iM11306 ^ i5) * (-13177)) ^ 354237990;
                        i2 = 1705615702;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 1030038458:
                case 1419586800:
                    C2788.m8463(textView2, -5062451);
                    if (C1025.m3861() <= 0) {
                        iM11306 = C19806.m45029("ۢۤ") ^ i6;
                        i = ((iM11306 ^ i5) * (-2821)) ^ 1146355636;
                        i2 = -1135347773;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ۠") + i5) * (-109);
                        i = ((iM11306 ^ i6) * 26843) ^ (-1312185053);
                        i2 = -1641871356;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 1205251251:
                case 1611267840:
                    strM9788 = C3286.m9788(f46233, 10, 3, i12);
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("۬ܶ") ^ i6;
                        i = ((iM11306 ^ i5) * (-19227)) ^ (-969490547);
                        i2 = 152112033;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۢ") + i6) * (-105);
                        i = ((iM11306 ^ i5) * 3081) ^ 376430326;
                        i2 = -1888251655;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                default:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۙ") ^ i6;
                        i = ((iM11306 ^ i5) * (-32405)) ^ (-692548587);
                        i2 = 528217380;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩻") + i5) * 69;
                        i = ((iM11306 ^ i6) * 6467) ^ (-955992190);
                        i2 = 2010997271;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34054(Context context, AttributeSet attributeSet) {
        short[] sArr;
        short[] sArr2;
        TextView textView;
        int i;
        short[] sArr3;
        int i2;
        int i3;
        short[] sArr4;
        int i4;
        short[] sArr5;
        int i5;
        int iM45029;
        int i6;
        int i7;
        int iM450210;
        int i8;
        int i9;
        int iM450211;
        int i10;
        int i11;
        int i12;
        short[] sArr6;
        TextView textView2;
        short[] sArr7;
        int iM11306;
        int i13;
        int i14;
        C14078 c14078 = this;
        Context context2 = context;
        int i15 = 290465745;
        int i16 = C3722.f13525;
        int i17 = C7105.f23796;
        int iM11307 = ThreadFactoryC3888.m11306("֡ܺ") ^ i17;
        int i18 = ((iM11307 ^ i16) * (-10655)) ^ 763689317;
        int i19 = iM11307 ^ (-2108620857);
        String string = null;
        String strM5481 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int iM11308 = 0;
        int i20 = 0;
        int iM450212 = 0;
        int i21 = 0;
        int iM450213 = 0;
        int iM11309 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        short s = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        TypedArray typedArrayObtainStyledAttributes = null;
        String string2 = null;
        TextView textView3 = null;
        String string3 = null;
        int i29 = 0;
        String string4 = null;
        int i30 = 0;
        String str = null;
        String strM10964 = null;
        String strM5502 = null;
        String str2 = null;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * (-27641)) >> 31));
            switch (i15) {
                case -2117070017:
                case 383533754:
                    i29 = 5291;
                    iM45029 = (C19806.m45029("᩺ۙ") + i17) * 27;
                    i18 = ((iM45029 ^ i16) * 20495) ^ 1664570493;
                    i6 = -1038027791;
                    i19 = iM45029 ^ i6;
                    context2 = context;
                    i25 = i25;
                    i27 = i27;
                    sArr12 = sArr12;
                    textView3 = textView3;
                    i24 = i24;
                    i23 = i23;
                    i28 = i28;
                    sArr10 = sArr10;
                    i26 = i26;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    break;
                case -2107773052:
                case 64402073:
                    int i31 = i23;
                    i24 = i24;
                    sArr12 = sArr12;
                    textView3 = textView3;
                    c14078.f46237 = (TextView) C2642.m8167(c14078, iM450213 ^ 2126967447);
                    sArr11 = f46233;
                    i28 = 23;
                    if (AbstractC0464.f2088 <= 0) {
                        i23 = i31;
                        sArr = sArr8;
                        i25 = i25;
                        sArr9 = sArr9;
                        i26 = i26;
                        i27 = i27;
                        sArr10 = sArr10;
                        int iM113010 = (ThreadFactoryC3888.m11306("۫ۢ") ^ i16) * (-49);
                        sArr2 = sArr;
                        i19 = iM113010 ^ 1201742931;
                        i18 = ((iM113010 ^ i17) * (-12553)) ^ (-108651776);
                        i25 = i25;
                        i27 = i27;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i24 = i24;
                        i23 = i23;
                        sArr10 = sArr10;
                        i26 = i26;
                        sArr9 = sArr9;
                        sArr8 = sArr2;
                        context2 = context;
                    } else {
                        int iM450214 = (C19806.m45029("᩺ۤ") + i16) * 41;
                        i19 = iM450214 ^ (-1837484193);
                        i18 = ((iM450214 ^ i17) * 6451) ^ (-1959740048);
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i24 = i24;
                        i23 = i31;
                    }
                    break;
                case -2089586813:
                case 864863927:
                    int i32 = i23;
                    int i33 = i24;
                    sArr2 = sArr8;
                    int i34 = i25;
                    sArr9 = sArr9;
                    i26 = i26;
                    sArr10 = sArr10;
                    int i35 = i28;
                    short[] sArr13 = sArr12;
                    TextView textView4 = textView3;
                    int i36 = i27;
                    short s2 = s;
                    int i37 = s2 + 18510;
                    if ((s2 * 74040) - (i37 * i37) > 0) {
                        int iM450215 = C19806.m45029("֫᩸") ^ i16;
                        i19 = iM450215 ^ (-1532039480);
                        i18 = ((iM450215 ^ i17) * (-3053)) ^ (-400803443);
                        s = s2;
                        i25 = i34;
                        i27 = i36;
                        sArr12 = sArr13;
                        textView3 = textView4;
                        i24 = i33;
                        i23 = i32;
                        i28 = i35;
                        sArr10 = sArr10;
                        i26 = i26;
                        sArr9 = sArr9;
                        sArr8 = sArr2;
                        c14078 = this;
                    } else {
                        int iM450216 = C19806.m45029("᩹ۙ") ^ i17;
                        i18 = ((iM450216 ^ i16) * (-451)) ^ (-759345202);
                        i19 = iM450216 ^ 408705719;
                        c14078 = this;
                        s = s2;
                        i25 = i34;
                        i27 = i36;
                        sArr12 = sArr13;
                        textView3 = textView4;
                        i24 = i33;
                        i23 = i32;
                        i28 = i35;
                        sArr10 = sArr10;
                        i26 = i26;
                        sArr9 = sArr9;
                        sArr8 = sArr2;
                    }
                    context2 = context;
                    break;
                case -2051755581:
                case 1372929329:
                    int i38 = i23;
                    i7 = i24;
                    sArr6 = sArr12;
                    textView2 = textView3;
                    i11 = i38;
                    i12 = i28;
                    sArr7 = sArr10;
                    iM450213 = C19806.m45029(C0050.m940(sArr7, 20, 3, i29));
                    if (C3286.m9798() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܽ") ^ i17;
                        i13 = ((iM11306 ^ i16) * 17427) ^ 491389136;
                        i14 = 1049312252;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۢ") ^ i17;
                        i13 = ((iM11306 ^ i16) * (-27767)) ^ 273607430;
                        i14 = 1211721693;
                    }
                    i19 = iM11306 ^ i14;
                    i18 = i13;
                    sArr10 = sArr7;
                    sArr12 = sArr6;
                    textView3 = textView2;
                    i24 = i7;
                    i23 = i11;
                    i28 = i12;
                    break;
                case -2037887300:
                case 217598970:
                    c14078.m34058(strM10964);
                    c14078.m34065(str2);
                    C1461.m5083(c14078.f46238, strM5502);
                    c14078.m34062(str);
                    m34053();
                    typedArrayObtainStyledAttributes.recycle();
                    break;
                case -2029380053:
                case 1460370868:
                    C1875.m6086();
                    C1377.m4833();
                    i11 = i23;
                    i7 = i24;
                    i12 = i28;
                    sArr6 = sArr12;
                    textView2 = textView3;
                    sArr7 = sArr10;
                    iM11306 = ThreadFactoryC3888.m11306("֫ܽ") ^ i17;
                    i13 = ((iM11306 ^ i16) * 17427) ^ 491389136;
                    i14 = 1049312252;
                    i19 = iM11306 ^ i14;
                    i18 = i13;
                    sArr10 = sArr7;
                    sArr12 = sArr6;
                    textView3 = textView2;
                    i24 = i7;
                    i23 = i11;
                    i28 = i12;
                    break;
                case -1880732622:
                case -1724943782:
                    int i39 = i23;
                    i7 = i24;
                    textView2 = textView3;
                    c14078.f46238 = (TextView) C2642.m8167(c14078, i39);
                    sArr12 = f46233;
                    if (C3535.f13026 > 0) {
                        int iM113011 = ThreadFactoryC3888.m11306("᩵᩶") ^ i16;
                        i19 = iM113011 ^ (-2140360647);
                        i23 = i39;
                        i18 = ((iM113011 ^ i17) * 5577) ^ 765620306;
                        textView3 = textView2;
                        i24 = i7;
                    } else {
                        i11 = i39;
                        i12 = i28;
                        int iM113012 = (ThreadFactoryC3888.m11306("ᩳ۬") + i17) * 45;
                        i19 = iM113012 ^ 322850627;
                        i18 = ((iM113012 ^ i16) * 16305) ^ 867675277;
                        textView3 = textView2;
                        i24 = i7;
                        i23 = i11;
                        i28 = i12;
                    }
                    break;
                case -1876604011:
                case 160232269:
                    i11 = i23;
                    i7 = i24;
                    i12 = i28;
                    sArr6 = sArr12;
                    textView2 = textView3;
                    c14078.f46234 = (TextView) C2642.m8167(c14078, iM450212 ^ i21);
                    sArr10 = f46233;
                    if (C2124.m6673() > 0) {
                        int iM113013 = ThreadFactoryC3888.m11306("᩹᩸") ^ i16;
                        i19 = iM113013 ^ (-1597388538);
                        i18 = ((iM113013 ^ i17) * (-27105)) ^ 1399334820;
                        sArr12 = sArr6;
                        textView3 = textView2;
                        i24 = i7;
                        i23 = i11;
                        i28 = i12;
                    } else {
                        sArr12 = sArr6;
                        int iM113014 = (ThreadFactoryC3888.m11306("ᩳ۬") + i17) * 45;
                        i19 = iM113014 ^ 322850627;
                        i18 = ((iM113014 ^ i16) * 16305) ^ 867675277;
                        textView3 = textView2;
                        i24 = i7;
                        i23 = i11;
                        i28 = i12;
                    }
                    break;
                case -1816021125:
                case 1637125690:
                    int i40 = i24;
                    TextView textView5 = textView3;
                    short[] sArr14 = sArr11;
                    int i41 = i28;
                    int iM450217 = C19806.m45029(C1189.m4365(sArr14, i41, 3, i29)) ^ 2099778713;
                    int iM450218 = (i17 - C19806.m45029("ܺۛ")) * (-7);
                    i18 = ((iM450218 ^ i16) * 3193) ^ (-2077711476);
                    i19 = iM450218 ^ (-123619348);
                    sArr11 = sArr14;
                    i28 = i41;
                    sArr12 = sArr12;
                    textView3 = textView5;
                    i24 = i40;
                    i23 = iM450217;
                    break;
                case -1793835184:
                case 2084565028:
                    C0797.m3359();
                    if (C0216.m1591() <= 0) {
                        i = i23;
                        i5 = i24;
                        sArr3 = sArr9;
                        i2 = i26;
                        sArr4 = sArr10;
                        i4 = i28;
                        sArr5 = sArr12;
                        textView = textView3;
                        i3 = i27;
                        int iM113015 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i17;
                        i19 = iM113015 ^ (-1184618164);
                        i18 = ((iM113015 ^ i16) * 15441) ^ (-1674991167);
                        i27 = i3;
                        sArr12 = sArr5;
                        textView3 = textView;
                        i23 = i;
                        i28 = i4;
                        sArr10 = sArr4;
                        i26 = i2;
                        sArr9 = sArr3;
                        i24 = i5;
                        context2 = context;
                    } else {
                        i23 = i23;
                        i24 = i24;
                        sArr8 = sArr8;
                        i25 = i25;
                        sArr9 = sArr9;
                        i26 = i26;
                        sArr10 = sArr10;
                        i28 = i28;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i27 = i27;
                        iM450211 = (ThreadFactoryC3888.m11306("᩵ۡ") + i16) * (-93);
                        i18 = 1638497963 ^ ((iM450211 ^ i17) * (-4025));
                        i10 = -516173376;
                        i19 = iM450211 ^ i10;
                        c14078 = this;
                        context2 = context;
                        i25 = i25;
                        i27 = i27;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i24 = i24;
                        i23 = i23;
                        i28 = i28;
                        sArr10 = sArr10;
                        i26 = i26;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                    }
                    break;
                case -1769142490:
                case 454160965:
                    View.inflate(context2, iM11308 ^ i20, c14078);
                    sArr9 = f46233;
                    i26 = 17;
                    i27 = 3;
                    int iM450219 = (C19806.m45029("۫ۜ") ^ i17) * 3;
                    i19 = iM450219 ^ (-1980605743);
                    i18 = ((iM450219 ^ i16) * (-1979)) ^ 383649732;
                    sArr12 = sArr12;
                    textView3 = textView3;
                    i24 = i24;
                    i23 = i23;
                    i28 = i28;
                    sArr10 = sArr10;
                    break;
                case -1735082803:
                case 1324424968:
                    strM10964 = C3743.m10964(f46233, 29, 3, i29);
                    iM450210 = (C19806.m45029("ܰܳ") + i17) * (-29);
                    i8 = ((iM450210 ^ i16) * 4217) ^ 851741807;
                    i9 = 1686227785;
                    i19 = iM450210 ^ i9;
                    i18 = i8;
                    break;
                case -1697860021:
                case -425111146:
                    textView = textView3;
                    i = i23;
                    sArr3 = sArr9;
                    i2 = i26;
                    i3 = i27;
                    sArr4 = sArr10;
                    i4 = i28;
                    sArr5 = sArr12;
                    i5 = 1;
                    c14078.setClickable(true);
                    c14078.setFocusable(true);
                    sArr8 = f46233;
                    i25 = 14;
                    if (C1875.f7103 >= 0) {
                        int iM113016 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i17;
                        i19 = iM113016 ^ (-1184618164);
                        i18 = ((iM113016 ^ i16) * 15441) ^ (-1674991167);
                        i27 = i3;
                        sArr12 = sArr5;
                        textView3 = textView;
                        i23 = i;
                        i28 = i4;
                        sArr10 = sArr4;
                        i26 = i2;
                        sArr9 = sArr3;
                        i24 = i5;
                        context2 = context;
                    } else {
                        int iM450220 = (C19806.m45029("᩺֫") ^ i16) * (-59);
                        i19 = iM450220 ^ 881013446;
                        context2 = context;
                        i18 = ((iM450220 ^ i17) * 12743) ^ 616709667;
                        i27 = i3;
                        sArr12 = sArr5;
                        textView3 = textView;
                        i23 = i;
                        i28 = i4;
                        sArr10 = sArr4;
                        i26 = i2;
                        sArr9 = sArr3;
                        i24 = 1;
                    }
                    break;
                case -1618701732:
                case 1980334111:
                    if (string3 == null) {
                        iM450210 = (C19806.m45029("۠۟") + i17) * 123;
                        i8 = ((iM450210 ^ i16) * (-1339)) ^ 360200335;
                        i9 = -424091346;
                    } else {
                        strM5502 = string3;
                        iM450210 = ThreadFactoryC3888.m11306("ܿۛ") ^ i17;
                        i8 = ((iM450210 ^ i16) * 2869) ^ 908559304;
                        i9 = 2117053681;
                    }
                    i19 = iM450210 ^ i9;
                    i18 = i8;
                    break;
                case -1525561022:
                case 1138034916:
                    i7 = i24;
                    textView2 = textView3;
                    short[] sArr15 = sArr12;
                    iM11309 = ThreadFactoryC3888.m11306(C0671.m3009(sArr15, 26, 3, i29));
                    i22 = 2117530728;
                    int iM450221 = (C19806.m45029("ۜ֫") + i17) * 37;
                    i19 = iM450221 ^ 1261179974;
                    i18 = ((iM450221 ^ i16) * 21815) ^ 1214468956;
                    sArr12 = sArr15;
                    textView3 = textView2;
                    i24 = i7;
                    break;
                case -1520873832:
                case 196331888:
                    int i42 = i24;
                    textView3 = (TextView) C2642.m8167(c14078, iM11309 ^ i22);
                    if (C7105.f23796 < 0) {
                        int iM450222 = C19806.m45029("ۧܰ") ^ i17;
                        i7 = i42;
                        i18 = ((iM450222 ^ i16) * (-26281)) ^ 565209938;
                        i19 = iM450222 ^ (-650777821);
                        i24 = i7;
                    } else {
                        i5 = i42;
                        textView = textView3;
                        i = i23;
                        sArr3 = sArr9;
                        i2 = i26;
                        i3 = i27;
                        sArr4 = sArr10;
                        i4 = i28;
                        sArr5 = sArr12;
                        int iM113017 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i17;
                        i19 = iM113017 ^ (-1184618164);
                        i18 = ((iM113017 ^ i16) * 15441) ^ (-1674991167);
                        i27 = i3;
                        sArr12 = sArr5;
                        textView3 = textView;
                        i23 = i;
                        i28 = i4;
                        sArr10 = sArr4;
                        i26 = i2;
                        sArr9 = sArr3;
                        i24 = i5;
                        context2 = context;
                    }
                    break;
                case -1418244486:
                case 1756293969:
                    i23 = i23;
                    i24 = i24;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    i28 = i28;
                    sArr12 = sArr12;
                    textView3 = textView3;
                    i27 = i27;
                    i26 = i26;
                    sArr = sArr8;
                    i25 = i25;
                    iM11308 = ThreadFactoryC3888.m11306(C3743.m10964(sArr, i25, 3, i29));
                    i20 = 2099686766;
                    if (C0671.f2816 == 0) {
                        sArr8 = sArr;
                        iM45029 = C19806.m45029("֨֡") ^ i17;
                        i18 = ((iM45029 ^ i16) * (-26513)) ^ 1211177559;
                        i6 = 1558832880;
                        i19 = iM45029 ^ i6;
                        context2 = context;
                        i25 = i25;
                        i27 = i27;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i24 = i24;
                        i23 = i23;
                        i28 = i28;
                        sArr10 = sArr10;
                        i26 = i26;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                    } else {
                        i28 = i28;
                        int iM113018 = (ThreadFactoryC3888.m11306("۫ۢ") ^ i16) * (-49);
                        sArr2 = sArr;
                        i19 = iM113018 ^ 1201742931;
                        i18 = ((iM113018 ^ i17) * (-12553)) ^ (-108651776);
                        i25 = i25;
                        i27 = i27;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i24 = i24;
                        i23 = i23;
                        sArr10 = sArr10;
                        i26 = i26;
                        sArr9 = sArr9;
                        sArr8 = sArr2;
                        context2 = context;
                    }
                    break;
                case -1270145374:
                case 643175735:
                    strM5481 = RunnableC1606.m5481(f46233, 32, 3, i29);
                    str2 = string4 == null ? strM5481 : string4;
                    iM450210 = (ThreadFactoryC3888.m11306("ۧۙ") + i16) * q.h;
                    i8 = ((iM450210 ^ i17) * (-25653)) ^ (-499329543);
                    i9 = 1344709532;
                    i19 = iM450210 ^ i9;
                    i18 = i8;
                    break;
                case -1106387000:
                case 522957920:
                    str = string2 == null ? strM5481 : string2;
                    iM450210 = ThreadFactoryC3888.m11306("ܳ᩺") ^ i16;
                    i8 = ((iM450210 ^ i17) * (-27669)) ^ (-1556435200);
                    i9 = 696681863;
                    i19 = iM450210 ^ i9;
                    i18 = i8;
                    break;
                case -1094544462:
                case 1919961042:
                    C2332.m7079();
                    if (RunnableC0195.f1321 < 0) {
                        i11 = i23;
                        i7 = i24;
                        i12 = i28;
                        textView2 = textView3;
                        int iM113019 = (ThreadFactoryC3888.m11306("ᩳ۬") + i17) * 45;
                        i19 = iM113019 ^ 322850627;
                        i18 = ((iM113019 ^ i16) * 16305) ^ 867675277;
                        textView3 = textView2;
                        i24 = i7;
                        i23 = i11;
                        i28 = i12;
                    }
                    i11 = i23;
                    i7 = i24;
                    i12 = i28;
                    sArr6 = sArr12;
                    textView2 = textView3;
                    sArr7 = sArr10;
                    iM11306 = ThreadFactoryC3888.m11306("֫ܽ") ^ i17;
                    i13 = ((iM11306 ^ i16) * 17427) ^ 491389136;
                    i14 = 1049312252;
                    i19 = iM11306 ^ i14;
                    i18 = i13;
                    sArr10 = sArr7;
                    sArr12 = sArr6;
                    textView3 = textView2;
                    i24 = i7;
                    i23 = i11;
                    i28 = i12;
                    break;
                case -959374025:
                case -767871976:
                    i29 = 51965;
                    iM45029 = (C19806.m45029("᩺ۙ") + i17) * 27;
                    i18 = ((iM45029 ^ i16) * 20495) ^ 1664570493;
                    i6 = -1038027791;
                    i19 = iM45029 ^ i6;
                    context2 = context;
                    i25 = i25;
                    i27 = i27;
                    sArr12 = sArr12;
                    textView3 = textView3;
                    i24 = i24;
                    i23 = i23;
                    i28 = i28;
                    sArr10 = sArr10;
                    i26 = i26;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    break;
                case -668581836:
                case -48891525:
                    strM5502 = CallableC1627.m5502(f46233, 35, 1, i29);
                    iM450210 = ThreadFactoryC3888.m11306("ܿۛ") ^ i17;
                    i8 = ((iM450210 ^ i16) * 2869) ^ 908559304;
                    i9 = 2117053681;
                    i19 = iM450210 ^ i9;
                    i18 = i8;
                    break;
                case -188461613:
                case 408172815:
                    string2 = typedArrayObtainStyledAttributes.getString(4);
                    c14078.f46239 = typedArrayObtainStyledAttributes.getBoolean(2, false);
                    c14078.f46236 = typedArrayObtainStyledAttributes.getBoolean(0, false);
                    if (string == null) {
                        iM450210 = (i16 - ThreadFactoryC3888.m11306("ܰۤ")) * 37;
                        i8 = ((iM450210 ^ i17) * 7989) ^ (-791555584);
                        i9 = 636338294;
                    } else {
                        strM10964 = string;
                        iM450210 = (C19806.m45029("ܰܳ") + i17) * (-29);
                        i8 = ((iM450210 ^ i16) * 4217) ^ 851741807;
                        i9 = 1686227785;
                    }
                    i19 = iM450210 ^ i9;
                    i18 = i8;
                    break;
                case -185608159:
                case 921321588:
                    C3286.m9798();
                    C1189.m4368();
                    break;
                case -116344045:
                case 683643406:
                    string4 = typedArrayObtainStyledAttributes.getString(i30);
                    string3 = typedArrayObtainStyledAttributes.getString(5);
                    if (C0671.f2816 == 0) {
                        iM450210 = (C19806.m45029("ۜܺ") ^ i16) * (-61);
                        i8 = ((iM450210 ^ i17) * (-15055)) ^ 1552408431;
                        i9 = 144046595;
                        i19 = iM450210 ^ i9;
                        i18 = i8;
                    } else {
                        i = i23;
                        i5 = i24;
                        sArr3 = sArr9;
                        i2 = i26;
                        sArr4 = sArr10;
                        i4 = i28;
                        sArr5 = sArr12;
                        textView = textView3;
                        i3 = i27;
                        int iM1130110 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i17;
                        i19 = iM1130110 ^ (-1184618164);
                        i18 = ((iM1130110 ^ i16) * 15441) ^ (-1674991167);
                        i27 = i3;
                        sArr12 = sArr5;
                        textView3 = textView;
                        i23 = i;
                        i28 = i4;
                        sArr10 = sArr4;
                        i26 = i2;
                        sArr9 = sArr3;
                        i24 = i5;
                        context2 = context;
                    }
                    break;
                case 324100901:
                case 1275373491:
                    c14078.f46235 = textView3;
                    typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0607.f2620);
                    int i43 = i24;
                    string = typedArrayObtainStyledAttributes.getString(i43);
                    int iM113020 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i16;
                    int i44 = ((iM113020 ^ i17) * 6221) ^ (-1759966904);
                    i19 = iM113020 ^ (-596786667);
                    i24 = i43;
                    i18 = i44;
                    i30 = 3;
                    break;
                case 1211375441:
                case 1416232440:
                    i23 = i23;
                    i24 = i24;
                    sArr8 = sArr8;
                    i25 = i25;
                    sArr9 = sArr9;
                    i26 = i26;
                    sArr10 = sArr10;
                    i28 = i28;
                    sArr12 = sArr12;
                    textView3 = textView3;
                    i27 = i27;
                    s = f46233[13];
                    if (C2249.m6915() <= 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("᩵ۡ") + i16) * (-93);
                        i18 = 1638497963 ^ ((iM450211 ^ i17) * (-4025));
                        i10 = -516173376;
                    } else {
                        iM450211 = C19806.m45029("۫ۤ") ^ i16;
                        i18 = 445499408 ^ ((iM450211 ^ i17) * (-101));
                        i10 = -1509063424;
                    }
                    i19 = iM450211 ^ i10;
                    c14078 = this;
                    context2 = context;
                    i25 = i25;
                    i27 = i27;
                    sArr12 = sArr12;
                    textView3 = textView3;
                    i24 = i24;
                    i23 = i23;
                    i28 = i28;
                    sArr10 = sArr10;
                    i26 = i26;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    break;
                case 1929594750:
                case 2000501975:
                    C2124.m6673();
                    if (RunnableC0195.f1321 >= 0) {
                        i23 = i23;
                        i24 = i24;
                        sArr8 = sArr8;
                        i25 = i25;
                        sArr9 = sArr9;
                        i26 = i26;
                        sArr10 = sArr10;
                        i28 = i28;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i27 = i27;
                        iM450211 = (ThreadFactoryC3888.m11306("᩵ۡ") + i16) * (-93);
                        i18 = 1638497963 ^ ((iM450211 ^ i17) * (-4025));
                        i10 = -516173376;
                        i19 = iM450211 ^ i10;
                        c14078 = this;
                        context2 = context;
                        i25 = i25;
                        i27 = i27;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i24 = i24;
                        i23 = i23;
                        i28 = i28;
                        sArr10 = sArr10;
                        i26 = i26;
                        sArr9 = sArr9;
                        sArr8 = sArr8;
                    } else {
                        i11 = i23;
                        i7 = i24;
                        i12 = i28;
                        sArr6 = sArr12;
                        textView2 = textView3;
                        sArr7 = sArr10;
                        iM11306 = ThreadFactoryC3888.m11306("֫ܽ") ^ i17;
                        i13 = ((iM11306 ^ i16) * 17427) ^ 491389136;
                        i14 = 1049312252;
                        i19 = iM11306 ^ i14;
                        i18 = i13;
                        sArr10 = sArr7;
                        sArr12 = sArr6;
                        textView3 = textView2;
                        i24 = i7;
                        i23 = i11;
                        i28 = i12;
                    }
                    break;
                default:
                    i23 = i23;
                    i24 = i24;
                    short[] sArr16 = sArr9;
                    int i45 = i26;
                    sArr10 = sArr10;
                    int i46 = i28;
                    sArr12 = sArr12;
                    textView3 = textView3;
                    i27 = i27;
                    iM450212 = C19806.m45029(C3743.m10964(sArr16, i45, i27, i29));
                    i21 = 2101841444;
                    if (RunnableC1564.f6300) {
                        sArr9 = sArr16;
                        i26 = i45;
                        i28 = i46;
                        sArr = sArr8;
                        i25 = i25;
                        int iM1130111 = (ThreadFactoryC3888.m11306("۫ۢ") ^ i16) * (-49);
                        sArr2 = sArr;
                        i19 = iM1130111 ^ 1201742931;
                        i18 = ((iM1130111 ^ i17) * (-12553)) ^ (-108651776);
                        i25 = i25;
                        i27 = i27;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i24 = i24;
                        i23 = i23;
                        sArr10 = sArr10;
                        i26 = i26;
                        sArr9 = sArr9;
                        sArr8 = sArr2;
                        context2 = context;
                    } else {
                        int iM450223 = C19806.m45029("ܰۧ") ^ i16;
                        i18 = ((iM450223 ^ i17) * 4631) ^ (-1051889098);
                        i19 = iM450223 ^ 754065696;
                        i26 = i45;
                        i27 = i27;
                        sArr12 = sArr12;
                        textView3 = textView3;
                        i24 = i24;
                        i23 = i23;
                        i28 = i46;
                        sArr10 = sArr10;
                        sArr9 = sArr16;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34057() {
        TextView textView = null;
        CharSequence charSequenceM5513 = null;
        int i = 1163238368;
        int i2 = C3660.f13403;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11306 = ThreadFactoryC3888.m11306("۫ۨ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 14633) ^ (-1391387572);
        int i5 = -267302285;
        while (true) {
            i = ((((i ^ i3) * 24933) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2103917786:
                case -234622851:
                    return C0817.m3407(charSequenceM5513);
                case -2045270820:
                case 76845929:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i2 - C19806.m45029("᩶ܽ")) * 63;
                        i4 = ((iM11306 ^ i3) * (-1775)) ^ 306780550;
                        i5 = 1533401720;
                    } else {
                        iM11306 = (C19806.m45029("ۜۗ") ^ i2) * (-31);
                        i4 = ((iM11306 ^ i3) * 23285) ^ (-1037981261);
                        i5 = -1310636887;
                    }
                    break;
                case -2034902685:
                case 736155994:
                    C1066.m4023();
                    RunnableC1606.m5473();
                    iM11306 = (C19806.m45029("ۜۗ") ^ i2) * (-31);
                    i4 = ((iM11306 ^ i3) * 23285) ^ (-1037981261);
                    i5 = -1310636887;
                    break;
                case -1509260554:
                case 873084473:
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("ܺܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-475)) ^ (-903379450);
                        i5 = -806095949;
                    } else {
                        iM11306 = C19806.m45029("ۨܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7211) ^ (-302180128);
                        i5 = -557823025;
                    }
                    break;
                case -1399390540:
                case 1740617325:
                    textView = this.f46234;
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ܺܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-475)) ^ (-903379450);
                        i5 = -806095949;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ᩵")) * (-29);
                        i4 = ((iM11306 ^ i2) * 20583) ^ (-1995602766);
                        i5 = -77996902;
                    }
                    break;
                case -1262636610:
                case 1500787327:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩶ܽ")) * 63;
                        i4 = ((iM11306 ^ i3) * (-1775)) ^ 306780550;
                        i5 = 1533401720;
                    } else {
                        iM11306 = C19806.m45029("ᩳ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18819)) ^ (-751037093);
                        i5 = -378333405;
                    }
                    break;
                case -1192462413:
                case 1212952149:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤܿ") ^ i2) * (-87);
                        i4 = ((iM11306 ^ i3) * (-9321)) ^ 1075844124;
                        i5 = 2050037266;
                    } else {
                        iM11306 = C19806.m45029("ܺܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-475)) ^ (-903379450);
                        i5 = -806095949;
                    }
                    break;
                case -557253635:
                case 141251388:
                    C3535.m10431();
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("ܺܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-475)) ^ (-903379450);
                        i5 = -806095949;
                    } else {
                        iM11306 = (C19806.m45029("ۜۗ") ^ i2) * (-31);
                        i4 = ((iM11306 ^ i3) * 23285) ^ (-1037981261);
                        i5 = -1310636887;
                    }
                    break;
                case -523241287:
                case 430037802:
                    if (C2642.f10294 > 0) {
                        iM11306 = (i2 - C19806.m45029("᩶ܽ")) * 63;
                        i4 = ((iM11306 ^ i3) * (-1775)) ^ 306780550;
                        i5 = 1533401720;
                    } else {
                        iM11306 = C19806.m45029("ۡܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6093)) ^ 556946719;
                        i5 = 1305641604;
                    }
                    break;
                case -148342805:
                case 162973514:
                    if (RunnableC1895.f7152) {
                        iM11306 = (C19806.m45029("֡ۢ") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * 14831) ^ 21146466;
                        i5 = 1750258609;
                    } else {
                        iM11306 = C19806.m45029("ܺܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-475)) ^ (-903379450);
                        i5 = -806095949;
                    }
                    break;
                case -12265654:
                case 171306025:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("᩺ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11979)) ^ 589456053;
                        i5 = -1911766537;
                    } else {
                        iM11306 = C19806.m45029("ܳۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26631)) ^ (-1531824902);
                        i5 = 1129384188;
                    }
                    break;
                case 11216907:
                case 2128481464:
                    if (C7105.m18985()) {
                        iM11306 = (C19806.m45029("ۜۗ") ^ i2) * (-31);
                        i4 = ((iM11306 ^ i3) * 23285) ^ (-1037981261);
                        i5 = -1310636887;
                    } else {
                        iM11306 = C19806.m45029("ۙۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25083)) ^ 380833682;
                        i5 = 1954895056;
                    }
                    break;
                case 169288570:
                case 232962845:
                    charSequenceM5513 = CallableC1627.m5513(textView);
                    if (charSequenceM5513 == null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-5735)) ^ 460964351;
                        i5 = -1746623896;
                    } else {
                        iM11306 = (C19806.m45029("ܿܰ") + i2) * 3;
                        i4 = ((iM11306 ^ i3) * (-26925)) ^ (-1861857434);
                        i5 = 890170177;
                    }
                    break;
                case 247334190:
                case 1045491897:
                    if (C0671.f2816 != 0) {
                        iM11306 = (i2 - C19806.m45029("᩶ܽ")) * 63;
                        i4 = ((iM11306 ^ i3) * (-1775)) ^ 306780550;
                        i5 = 1533401720;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܺ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM11306 ^ i3) * 28693) ^ 1800862706;
                        i5 = 225251383;
                    }
                    break;
                case 271513489:
                case 806422917:
                    C7105.m18985();
                    C0817.m3399();
                    return null;
                case 1036206700:
                case 1583952901:
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("ܺܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-475)) ^ (-903379450);
                        i5 = -806095949;
                    } else {
                        iM11306 = (C19806.m45029("ۘ۫") ^ i2) * 3;
                        i4 = ((iM11306 ^ i3) * (-24535)) ^ 1855602196;
                        i5 = 1627810822;
                    }
                    break;
                case 1231992795:
                case 1928903318:
                    if (C2477.m7593() >= 0) {
                        iM11306 = C19806.m45029("᩺ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11979)) ^ 589456053;
                        i5 = -1911766537;
                    } else {
                        iM11306 = C19806.m45029("ܺۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24831) ^ 1008220510;
                        i5 = 1997986765;
                    }
                    break;
                default:
                    return "";
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34058(String str) {
        MenuItemOnMenuItemClickListenerC3244.m9704(this.f46234, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m34064() {
        TextView textView = null;
        CharSequence charSequenceM5513 = null;
        int i = -141364911;
        int i2 = C3660.f13403;
        int i3 = C1937.f7317;
        int iM45029 = (C19806.m45029("ܶۡ") + i3) * (-95);
        int i4 = ((iM45029 ^ i2) * 31265) ^ 1225813210;
        int i5 = 438612705;
        while (true) {
            i = ((((i ^ i2) * 6751) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1992808424:
                case -1633789895:
                    textView = this.f46237;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖᩴ") + i3) * (-103);
                        i4 = ((iM45029 ^ i2) * 12345) ^ (-1090879111);
                        i5 = 831768969;
                    } else {
                        iM45029 = (C19806.m45029("᩻ۚ") ^ i2) * 59;
                        i4 = ((iM45029 ^ i3) * (-27037)) ^ (-1793007342);
                        i5 = -2084195326;
                    }
                    break;
                case -1938499726:
                case 238806263:
                    charSequenceM5513 = CallableC1627.m5513(textView);
                    if (charSequenceM5513 == null) {
                        iM45029 = (i3 - C19806.m45029("ۢܺ")) * 7;
                        i4 = ((iM45029 ^ i2) * (-17919)) ^ 2023337685;
                        i5 = 20257553;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۛ") ^ i2) * 33;
                        i4 = ((iM45029 ^ i3) * 6823) ^ (-333359444);
                        i5 = 1985910395;
                    }
                    break;
                case -1860799226:
                case 507998659:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = C19806.m45029("ۤۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29657)) ^ (-1882664610);
                        i5 = -54204016;
                    } else {
                        iM45029 = (C19806.m45029("ܽ᩹") ^ i3) * 119;
                        i4 = ((iM45029 ^ i2) * (-22091)) ^ (-1618400431);
                        i5 = 416422965;
                    }
                    break;
                case -1544213454:
                case 1609961135:
                    RunnableC1564.m5345();
                    if (!C1668.m5583()) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩸")) * (-59);
                        i4 = ((iM45029 ^ i3) * (-10385)) ^ 2128503787;
                        i5 = -1559005221;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1977)) ^ 606827014;
                        i5 = 1713787912;
                    }
                    break;
                case -1540773325:
                case 392106202:
                    C1668.m5583();
                    C1977.m6356();
                    return null;
                case -1464722912:
                case 1438767809:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1977.m6356();
                    iM45029 = (ThreadFactoryC3888.m11306("ۖᩴ") + i3) * (-103);
                    i4 = ((iM45029 ^ i2) * 12345) ^ (-1090879111);
                    i5 = 831768969;
                    break;
                case -1065548830:
                case -379709178:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("۫ܺ") + i3) * 7;
                        i4 = ((iM45029 ^ i2) * (-18701)) ^ 480920760;
                        i5 = 769346411;
                    } else {
                        iM45029 = C19806.m45029("֡ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4351)) ^ (-1493862784);
                        i5 = -775362282;
                    }
                    break;
                case -1013828473:
                case 1930704578:
                    return "";
                case -948652337:
                case 1998621718:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("۫ܺ") + i3) * 7;
                        i4 = ((iM45029 ^ i2) * (-18701)) ^ 480920760;
                        i5 = 769346411;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬֫") ^ i3) * q.h;
                        i4 = ((iM45029 ^ i2) * 26111) ^ 1208831971;
                        i5 = -916576132;
                    }
                    break;
                case -896190212:
                case 1624606166:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩸")) * (-59);
                        i4 = ((iM45029 ^ i3) * (-10385)) ^ 2128503787;
                        i5 = -1559005221;
                    } else {
                        iM45029 = (C19806.m45029("ܶۨ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * (-13349)) ^ (-155111503);
                        i5 = -223038967;
                    }
                    break;
                case -767523466:
                case 1366901538:
                    if (C0797.m3359()) {
                        iM45029 = (C19806.m45029("ܰ᩺") ^ i2) * (-51);
                        i4 = ((iM45029 ^ i3) * 24003) ^ 515837412;
                        i5 = 760785750;
                    } else {
                        iM45029 = C19806.m45029("ۤۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29657)) ^ (-1882664610);
                        i5 = -54204016;
                    }
                    break;
                case -445489821:
                case 848319631:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1977)) ^ 606827014;
                        i5 = 1713787912;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20047)) ^ 718765412;
                        i5 = 556401425;
                    }
                    break;
                case -242705419:
                case 117363715:
                    C19806.m45024();
                    if (!CallableC1627.f6528) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩸")) * (-59);
                        i4 = ((iM45029 ^ i3) * (-10385)) ^ 2128503787;
                        i5 = -1559005221;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖᩴ") + i3) * (-103);
                        i4 = ((iM45029 ^ i2) * 12345) ^ (-1090879111);
                        i5 = 831768969;
                    }
                    break;
                case -82966945:
                case 620604524:
                    return C0817.m3407(charSequenceM5513);
                case 177501067:
                case 620985124:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖᩴ") + i3) * (-103);
                        i4 = ((iM45029 ^ i2) * 12345) ^ (-1090879111);
                        i5 = 831768969;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5537)) ^ (-62818720);
                        i5 = 112757008;
                    }
                    break;
                case 415982699:
                case 1335594786:
                    if (C2871.m8646()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11173) ^ (-842112774);
                        i5 = 1473255881;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1977)) ^ 606827014;
                        i5 = 1713787912;
                    }
                    break;
                case 1682377967:
                case 1802114135:
                    C7105.m18985();
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = (C19806.m45029("۫ܺ") + i3) * 7;
                        i4 = ((iM45029 ^ i2) * (-18701)) ^ 480920760;
                        i5 = 769346411;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩸")) * (-59);
                        i4 = ((iM45029 ^ i3) * (-10385)) ^ 2128503787;
                        i5 = -1559005221;
                    }
                    break;
                default:
                    if (C2249.m6915() <= 0) {
                        iM45029 = C19806.m45029("ۤۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29657)) ^ (-1882664610);
                        i5 = -54204016;
                    } else {
                        iM45029 = (C19806.m45029("۫ܿ") ^ i3) * (-45);
                        i4 = ((iM45029 ^ i2) * 8931) ^ (-1638461849);
                        i5 = -1428870401;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView m34056() {
        return this.f46234;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34065(String str) {
        C1461.m5083(this.f46237, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView m34061() {
        return this.f46237;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final TextView m34055() {
        return this.f46238;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34062(String str) {
        C1461.m5083(this.f46235, str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView m34067() {
        return this.f46235;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m34063() {
        return this.f46236;
    }
}
