package l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܶܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F2T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16171 extends AbstractC2432 {

    /* JADX INFO: renamed from: ᩻֫ܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f52501 = {7713, -31692, -19429, 24578, -16546, -25969, -17564, -20292, -29454, -18365, -25264, -31065, 25110, -26336, -26983, 30254, 1557, -22510, -20993, 20841, 3798, 12709, 12714, 12710, 12718, 12772, 12731, 12711, 12734, 12716, 12706, 12709, 12772, 12719, 12718, 12733, 12772, 12711, 12706, 12728, 12735, 12735, 12708, 12704, 12718, 12709, 12711, 12706, 12710, 12706, 12735, 12711, 12706, 12728, 12735, 12728, 12719, 12704, 12731, 12711, 12734, 12716, 12706, 12709, 12674, 12719, 12719, 12718, 12728, 12712, 12729, 12706, 12731, 12735, 12706, 12708, 12709, 12733, 12718, 12729, 12728, 12706, 12708, 12709, 12680, 12708, 12719, 12718, 12733, 12718, 12729, 12728, 12706, 12708, 12709, 12677, 12714, 12710, 12718, 12706, 12712, 12708, 12709, 12728, 12735, 12714, 12735, 12718, 12728, 12735, 12714, 12735, 12718, 12674, 12709, 12717, 12708, 12729, 12718, 12733, 12706, 12718, 12732, 12701, 12718, 12729, 12728, 12706, 12708, 12709, 12728, 12706, 12721, 12718};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52502;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9458 f52503;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f52504;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38401(C16171 c16171) {
        ActivityC9458 activityC9458 = null;
        ArrayList arrayList = null;
        int i = -1393210057;
        int i2 = C2375.f7641;
        int i3 = C0950.f3488;
        int iM2761 = C0619.m2761("ܺܳ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 23253) ^ (-1563767769);
        int i5 = -456332810;
        while (true) {
            i = ((((i ^ i3) * (-18283)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1877828938:
                case 753372237:
                    activityC9458 = c16171.f52503;
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("۠ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12245)) ^ 1729734712;
                        i5 = 1970909255;
                    } else {
                        iM2761 = (C0619.m2761("֫ᩳ") + i2) * 61;
                        i4 = ((iM2761 ^ i3) * 9289) ^ (-566199608);
                        i5 = 2099005377;
                    }
                    break;
                case -1646871836:
                case -1457038507:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("۠ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12245)) ^ 1729734712;
                        i5 = 1970909255;
                    } else {
                        iM2761 = C0619.m2761("۟᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7985) ^ (-570676036);
                        i5 = -1027633399;
                    }
                    break;
                case -1631447770:
                case -1115096922:
                    C2834.m9332(arrayList);
                    if (c16171.f52504 != null) {
                        iM2761 = C0773.m3169("ۗ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17479) ^ (-1219993214);
                        i5 = 2086023775;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28157)) ^ 1253741130;
                        i5 = 1004788058;
                    }
                    break;
                case -1541026916:
                case -1266360467:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("ᩳۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14705)) ^ (-1954886611);
                        i5 = 466183481;
                    } else {
                        iM2761 = (C0619.m2761("۫۬") ^ i3) * (-71);
                        i4 = ((iM2761 ^ i2) * 14595) ^ 1172469797;
                        i5 = -1893161151;
                    }
                    break;
                case -1405893429:
                case -761945559:
                    if (C3779.m12264()) {
                        iM2761 = C0773.m3169("ۜۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3255) ^ (-936622026);
                        i5 = -1117494279;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩶") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * (-21359)) ^ 1495234116;
                        i5 = -1933308900;
                    }
                    break;
                case -1396132493:
                case 492679113:
                    activityC9458.f56046.setSubtitle(C7685.m20926());
                    break;
                case -1235094519:
                case 39281113:
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0619.m2761("۠ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12245)) ^ 1729734712;
                        i5 = 1970909255;
                    } else {
                        iM2761 = C0773.m3169("ܶۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16789)) ^ (-964229554);
                        i5 = -2038155226;
                    }
                    break;
                case -1077322034:
                case -686472623:
                    C1826.m6301();
                    C1343.m4943();
                    break;
                case -976295102:
                case 712998854:
                    arrayList = activityC9458.f30671;
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0619.m2761("۠ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12245)) ^ 1729734712;
                        i5 = 1970909255;
                    } else {
                        iM2761 = (C0773.m3169("֡ܽ") ^ i3) * (-121);
                        i4 = ((iM2761 ^ i2) * 6597) ^ (-1374481427);
                        i5 = 823445590;
                    }
                    break;
                case -910545667:
                case 2071625555:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩶") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * (-21359)) ^ 1495234116;
                        i5 = -1933308900;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩻۫")) * (-111);
                        i4 = ((iM2761 ^ i2) * 3701) ^ 339852977;
                        i5 = -1636097409;
                    }
                    break;
                case -453416601:
                case 500107478:
                    if (C0773.f2792 > 0) {
                        iM2761 = C0619.m2761("ᩳۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14705)) ^ (-1954886611);
                        i5 = 466183481;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩶") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * (-21359)) ^ 1495234116;
                        i5 = -1933308900;
                    }
                    break;
                case -335810461:
                case 945159419:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۜۘ") ^ i3) * (-119);
                        i4 = ((iM2761 ^ i2) * 26949) ^ 258467581;
                        i5 = -1104964450;
                    } else {
                        iM2761 = C0773.m3169("ۚᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8759) ^ 1290880061;
                        i5 = -1324314143;
                    }
                    break;
                case -292256560:
                case 162543753:
                    if (C23916.m53419() != 0) {
                        iM2761 = C0619.m2761("۠ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12245)) ^ 1729734712;
                        i5 = 1970909255;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۛ۠")) * 79;
                        i4 = ((iM2761 ^ i3) * (-8233)) ^ 445438946;
                        i5 = -1023820027;
                    }
                    break;
                case 27785313:
                case 1444166647:
                    if (C0950.m3785() == 0) {
                        iM2761 = (C0773.m3169("ۜۘ") ^ i3) * (-119);
                        i4 = ((iM2761 ^ i2) * 26949) ^ 258467581;
                        i5 = -1104964450;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩶") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * (-21359)) ^ 1495234116;
                        i5 = -1933308900;
                    }
                    break;
                case 83663694:
                case 618412094:
                    RunnableC0334.m2063();
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩶") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * (-21359)) ^ 1495234116;
                        i5 = -1933308900;
                    } else {
                        iM2761 = (C0619.m2761("ۚۙ") + i2) * (-49);
                        i4 = ((iM2761 ^ i3) * (-21223)) ^ (-360686347);
                        i5 = 1170404527;
                    }
                    break;
                case 143162579:
                case 964266289:
                    activityC9458.f30671.addAll(c16171.f52504);
                    iM2761 = C0773.m3169("ܶ᩻") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-28157)) ^ 1253741130;
                    i5 = 1004788058;
                    break;
                case 296700009:
                case 903362741:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩶") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * (-21359)) ^ 1495234116;
                        i5 = -1933308900;
                    } else {
                        iM2761 = C0619.m2761("ۖۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22117)) ^ (-1642478464);
                        i5 = -1633979285;
                    }
                    break;
                default:
                    RunnableC1848.m6360();
                    C1564.m5509();
                    iM2761 = (C0773.m3169("ᩴ᩶") ^ i3) * 63;
                    i4 = ((iM2761 ^ i2) * (-21359)) ^ 1495234116;
                    i5 = -1933308900;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC9458 activityC9458 = null;
        C3072 c3072 = null;
        boolean z = false;
        int i = -420522922;
        int i2 = C2419.f7754;
        int i3 = C3033.f9831;
        int iM3169 = C0773.m3169("ܰᩴ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-7151)) ^ (-1709537522);
        int i5 = -42956172;
        while (true) {
            i = ((((i ^ i2) * 11583) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1888401441:
                case 80627656:
                    C2485.m8358(activityC9458.f30670, z ? 1 : 0);
                    iM3169 = C0773.m3169("᩸۠") ^ i3;
                    i4 = ((iM3169 ^ i2) * 25815) ^ 1717297804;
                    i5 = -1981262744;
                    break;
                case -1863528626:
                case -538476201:
                    c3072 = activityC9458.f30668;
                    z = false;
                    z = false;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28257) ^ (-1015391558);
                        i5 = -691877954;
                    } else {
                        iM3169 = C0619.m2761("֫֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17473)) ^ (-1009976872);
                        i5 = 1034166271;
                    }
                    break;
                case -1858310006:
                case 381065780:
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0619.m2761("ۨ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20247)) ^ 1752470746;
                        i5 = 1512953053;
                    } else {
                        iM3169 = C0773.m3169("ۤ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8541) ^ (-773900945);
                        i5 = 1342624780;
                    }
                    break;
                case -1794472167:
                case 20845776:
                    if (C1564.m5509() <= 0) {
                        iM3169 = C0773.m3169("᩸ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2879) ^ (-787304628);
                        i5 = -774715158;
                    } else {
                        iM3169 = C0619.m2761("ۡ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26369) ^ (-1379978462);
                        i5 = -1191542376;
                    }
                    break;
                case -1544866256:
                case 313282714:
                    activityC9458 = this.f52503;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29285) ^ (-237581087);
                        i5 = 451294664;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4295) ^ (-755745509);
                        i5 = 2060864013;
                    }
                    break;
                case -1244435672:
                case 1549666227:
                    c3072.m10021(z);
                    if (C7685.m20925()) {
                        iM3169 = C0619.m2761("֫᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21593)) ^ 1206221621;
                        i5 = 1621995099;
                    } else {
                        iM3169 = C0773.m3169("᩸۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25815) ^ 1717297804;
                        i5 = -1981262744;
                    }
                    break;
                case -1242485554:
                case 89269333:
                    C2287.m7745();
                    if (!C0619.m2763()) {
                        iM3169 = C0773.m3169("᩸ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2879) ^ (-787304628);
                        i5 = -774715158;
                    } else {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28257) ^ (-1015391558);
                        i5 = -691877954;
                    }
                    break;
                case -1076220963:
                case -767918915:
                    if (C2288.m7767()) {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29285) ^ (-237581087);
                        i5 = 451294664;
                    } else {
                        iM3169 = (C0773.m3169("ܽ֡") + i2) * (-31);
                        i4 = ((iM3169 ^ i3) * 19793) ^ 548630087;
                        i5 = 1680739941;
                    }
                    break;
                case -911096857:
                case 620062225:
                    if (this.f52502 != activityC9458.f30667) {
                        iM3169 = C0773.m3169("᩸۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25815) ^ 1717297804;
                        i5 = -1981262744;
                    } else {
                        iM3169 = (C0619.m2761("ۛۤ") + i3) * 5;
                        i4 = ((iM3169 ^ i2) * 24243) ^ (-2029840650);
                        i5 = 1891072520;
                    }
                    break;
                case -871829710:
                case 1027916285:
                    C2702.m8876();
                    if (C20932.f66974 > 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29285) ^ (-237581087);
                        i5 = 451294664;
                    } else {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28257) ^ (-1015391558);
                        i5 = -691877954;
                    }
                    break;
                case -800806912:
                case 649413627:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("᩸ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21603) ^ (-1931924209);
                        i5 = -1255130345;
                    } else {
                        iM3169 = (C0619.m2761("֫ܿ") ^ i2) * 69;
                        i4 = ((iM3169 ^ i3) * 19869) ^ (-1964811622);
                        i5 = 25360145;
                    }
                    break;
                case -692660464:
                case 814586616:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29285) ^ (-237581087);
                        i5 = 451294664;
                    } else {
                        iM3169 = C0619.m2761("֨ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9503) ^ (-1790968631);
                        i5 = 1784297003;
                    }
                    break;
                case -180802548:
                case 287306283:
                    C2023.m6964();
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ۨ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20247)) ^ 1752470746;
                        i5 = 1512953053;
                    } else {
                        iM3169 = C0773.m3169("᩸ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2879) ^ (-787304628);
                        i5 = -774715158;
                    }
                    break;
                case 63059294:
                case 1714900138:
                    break;
                case 491633579:
                case 1864662088:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28257) ^ (-1015391558);
                        i5 = -691877954;
                    } else {
                        iM3169 = (C0773.m3169("֨᩷") + i3) * 127;
                        i4 = ((iM3169 ^ i2) * (-17021)) ^ 2029215964;
                        i5 = 786261767;
                    }
                    break;
                case 822823848:
                case 1118769345:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("᩸ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21603) ^ (-1931924209);
                        i5 = -1255130345;
                    } else {
                        iM3169 = C0773.m3169("ۙۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23023) ^ (-937104186);
                        i5 = -1631485802;
                    }
                    break;
                case 1239478926:
                case 1589001457:
                    C0862.m3503();
                    iM3169 = C0773.m3169("᩸ܺ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 2879) ^ (-787304628);
                    i5 = -774715158;
                    break;
                case 1264503152:
                case 1504064162:
                    C1564.m5509();
                    break;
                default:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29285) ^ (-237581087);
                        i5 = 451294664;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۧۡ")) * (-79);
                        i4 = ((iM3169 ^ i2) * (-10121)) ^ 1647201983;
                        i5 = -899781000;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC9458 activityC9458 = null;
        TextView textView = null;
        C3072 c3072 = null;
        boolean z = false;
        int i = 1892796912;
        int i2 = C2834.f9334;
        int i3 = C3779.f12953;
        int iM3169 = C0773.m3169("ᩳ᩶") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-19749)) ^ 1315072583;
        int i5 = 75584079;
        while (true) {
            i = ((((i ^ i3) * 20573) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2115459724:
                case -1846757782:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ۗ᩸") ^ i3) * 31;
                        i4 = ((iM3169 ^ i2) * 7057) ^ 13273391;
                        i5 = 1059776385;
                    } else {
                        iM3169 = (C0773.m3169("ۡۨ") + i2) * (-111);
                        i4 = ((iM3169 ^ i3) * (-11857)) ^ (-1489696907);
                        i5 = -738201684;
                    }
                    break;
                case -1752978546:
                case 911530152:
                    C1519.m5403();
                    if (!C3690.m11987()) {
                        iM3169 = C0773.m3169("᩸᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16925) ^ 1808781902;
                        i5 = 402470863;
                    } else {
                        iM3169 = (C0773.m3169("ܳۖ") + i3) * 35;
                        i4 = ((iM3169 ^ i2) * (-783)) ^ (-301425758);
                        i5 = -757150170;
                    }
                    break;
                case -949632417:
                case 1488440607:
                    C3077.m10041();
                    iM3169 = (C0773.m3169("ܳۖ") + i3) * 35;
                    i4 = ((iM3169 ^ i2) * (-783)) ^ (-301425758);
                    i5 = -757150170;
                    break;
                case -908304696:
                case 1835626990:
                    C13473.m33140(textView, 8);
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("֡ۢ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i3) * 8057) ^ (-353611567);
                        i5 = -1977553969;
                    } else {
                        iM3169 = (C0773.m3169("ۘۚ") ^ i2) * 45;
                        i4 = ((iM3169 ^ i3) * (-16031)) ^ 328978501;
                        i5 = 330948727;
                    }
                    break;
                case -855293316:
                case 1271638524:
                    activityC9458 = this.f52503;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("᩸᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16925) ^ 1808781902;
                        i5 = 402470863;
                    } else {
                        iM3169 = C0773.m3169("ܰۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29405) ^ 1002237080;
                        i5 = -455060804;
                    }
                    break;
                case -847712723:
                case 777514408:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ۗ᩸") ^ i3) * 31;
                        i4 = ((iM3169 ^ i2) * 7057) ^ 13273391;
                        i5 = 1059776385;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۤۡ")) * 115;
                        i4 = ((iM3169 ^ i3) * (-7909)) ^ (-420171909);
                        i5 = -101451680;
                    }
                    break;
                case -684936880:
                case 1820306680:
                    C0950.m3785();
                    if (C2310.f7472 < 0) {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-381)) ^ 2077877989;
                        i5 = 634770787;
                    } else {
                        iM3169 = C0773.m3169("᩸᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16925) ^ 1808781902;
                        i5 = 402470863;
                    }
                    break;
                case -378408582:
                case 1788828278:
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = (C0773.m3169("ۗ᩸") ^ i3) * 31;
                        i4 = ((iM3169 ^ i2) * 7057) ^ 13273391;
                        i5 = 1059776385;
                    } else {
                        iM3169 = (C0773.m3169("ܳۖ") + i3) * 35;
                        i4 = ((iM3169 ^ i2) * (-783)) ^ (-301425758);
                        i5 = -757150170;
                    }
                    break;
                case -61760867:
                case 2019571844:
                    c3072 = activityC9458.f30668;
                    z = true;
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("ۗ᩸") ^ i3) * 31;
                        i4 = ((iM3169 ^ i2) * 7057) ^ 13273391;
                        i5 = 1059776385;
                    } else {
                        iM3169 = (C0619.m2761("۬۫") + i3) * (-99);
                        i4 = ((iM3169 ^ i2) * (-19569)) ^ 919985160;
                        i5 = -1259580593;
                    }
                    break;
                case 137748193:
                case 1297439307:
                    textView = activityC9458.f30670;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("᩸᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16925) ^ 1808781902;
                        i5 = 402470863;
                    } else {
                        iM3169 = C0619.m2761("ۖ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15609) ^ (-1363694557);
                        i5 = -532357515;
                    }
                    break;
                case 901799716:
                case 2100128493:
                    C3779.m12264();
                    break;
                case 1083802135:
                case 1160867002:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ܳۖ") + i3) * 35;
                        i4 = ((iM3169 ^ i2) * (-783)) ^ (-301425758);
                        i5 = -757150170;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩻") ^ i2) * (-93);
                        i4 = ((iM3169 ^ i3) * (-23001)) ^ (-660413106);
                        i5 = 1760956380;
                    }
                    break;
                case 1327050233:
                case 1565756238:
                    c3072.m10021(z);
                    ActivityC9458.m24842(activityC9458);
                    break;
                case 1496630915:
                case 1586574898:
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-381)) ^ 2077877989;
                        i5 = 634770787;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩵֡")) * (-79);
                        i4 = ((iM3169 ^ i3) * 18533) ^ 252418256;
                        i5 = 2131073297;
                    }
                    break;
                case 1625298999:
                case 1682593833:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("ᩳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-381)) ^ 2077877989;
                        i5 = 634770787;
                    } else {
                        iM3169 = C0773.m3169("ۨ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4733)) ^ 334522242;
                        i5 = 1761674786;
                    }
                    break;
                default:
                    if (C0619.m2763()) {
                        iM3169 = C0773.m3169("᩸᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16925) ^ 1808781902;
                        i5 = 402470863;
                    } else {
                        iM3169 = (C0773.m3169("ܿۜ") ^ i3) * (-13);
                        i4 = ((iM3169 ^ i2) * (-28433)) ^ (-2143331311);
                        i5 = 1658254149;
                    }
                    break;
            }
            return;
        }
    }

    public C16171(ActivityC9458 activityC9458, int i) {
        int i2 = -251376673;
        int i3 = C2287.f7432;
        int i4 = C1321.f4751;
        this.f52503 = activityC9458;
        this.f52502 = i;
        int iM3169 = (C0773.m3169("ۚ۫") + i3) * 57;
        int i5 = ((iM3169 ^ i4) * 15631) ^ (-261034539);
        int i6 = -1907911650;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i4) * (-31113)) >> 31));
            switch (i2) {
                case -2104106004:
                case 840585199:
                    C3448.m11248();
                    throw new RuntimeException();
                case -1816298591:
                case -880615371:
                    return;
                case -1704117054:
                case 604900738:
                    C2419.m8174();
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0619.m2761("᩸ۡ") + i4) * 15;
                        i5 = ((iM3169 ^ i3) * 4627) ^ (-1934511874);
                        i6 = 247168010;
                    }
                    break;
                case -1064720153:
                case -845222058:
                    C3099.m10095();
                    break;
                case -287086594:
                case 934150232:
                    if (C3099.f10023 > 0) {
                        iM3169 = C0619.m2761("ۘܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28799)) ^ 253064053;
                        i6 = -650820797;
                    }
                    break;
                case 1495402031:
                case 1567558605:
                    if (C13473.f42873 == 0) {
                        iM3169 = C0619.m2761("۫ܿ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 32677) ^ (-1489668898);
                        i6 = 444235647;
                    }
                    break;
                default:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ۗۜ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 725) ^ (-302070523);
                        i6 = 1216045664;
                    } else {
                        iM3169 = (C0773.m3169("ۡۗ") + i3) * 51;
                        i5 = ((iM3169 ^ i4) * (-10713)) ^ 566134158;
                        i6 = 391982988;
                        continue;
                    }
                    break;
            }
            iM3169 = (C0619.m2761("ۚ᩷") + i4) * 77;
            i5 = ((iM3169 ^ i3) * 937) ^ (-2114783334);
            i6 = 777609111;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        String str;
        String str2;
        int i;
        short[] sArr;
        int iM3169;
        int i2;
        int i3;
        C9921 c9921;
        int iM2761;
        int i4;
        int i5;
        int i6;
        short[] sArr2;
        int i7;
        String str3;
        JSONArray jSONArray;
        String str4;
        int i8;
        int i9;
        short[] sArr3;
        short[] sArr4;
        int i10;
        int iM31610;
        int i11;
        int iM2762;
        int i12;
        int i13;
        String str5;
        short[] sArr5;
        int i14;
        String str6;
        int i15;
        short[] sArr6;
        int i16;
        int i17;
        int iM2763;
        int i18;
        int i19;
        short[] sArr7;
        int i20;
        short[] sArr8;
        int i21;
        JSONObject jSONObject;
        short[] sArr9;
        String str7;
        JSONArray jSONArray2;
        int iM31611;
        int i22;
        int i23;
        int i24 = C2288.f7433;
        int i25 = C1826.f6190;
        int iM2764 = (C0619.m2761("֡֨") ^ i24) * 95;
        int i26 = ((iM2764 ^ i25) * (-28307)) ^ (-329921078);
        JSONObject jSONObjectM25749 = null;
        String strM7803 = null;
        JSONArray jSONArray3 = null;
        ArrayList arrayList = null;
        String strM6233 = null;
        String strM7749 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i27 = iM2764 ^ (-698200744);
        int i28 = 0;
        int i29 = 0;
        short s = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 1824947264;
        C9921 c9922 = null;
        String strM9670 = null;
        String strM4861 = null;
        short[] sArr12 = null;
        int i36 = 0;
        int iM8880 = 0;
        C9921 c9921M43778 = null;
        C11192 c11192 = null;
        short[] sArr13 = null;
        String str8 = null;
        JSONObject jSONObject2 = null;
        int i37 = 0;
        while (true) {
            i35 = i27 ^ (i26 & (((i35 ^ i25) * 21245) >> 31));
            switch (i35) {
                case -2078236595:
                case -1715549284:
                    i36 = i36;
                    sArr2 = sArr13;
                    i7 = i29;
                    str3 = strM7749;
                    jSONArray = jSONArray3;
                    str4 = str8;
                    i8 = i33;
                    i9 = i34;
                    sArr3 = sArr10;
                    jSONObject2 = jSONArray.getJSONObject(i37);
                    c11192 = new C11192();
                    c11192.m28228(C7685.m20926());
                    sArr4 = f52501;
                    i32 = 55;
                    i10 = 3;
                    if (C0862.f3233 == 0) {
                        i33 = i8;
                        int iM2765 = C0619.m2761("۠ۡ") ^ i24;
                        jSONArray3 = jSONArray;
                        i29 = i7;
                        sArr12 = sArr4;
                        sArr10 = sArr3;
                        str8 = str4;
                        i26 = ((iM2765 ^ i25) * (-20587)) ^ (-1485513564);
                        i34 = i9;
                        sArr13 = sArr2;
                        strM7749 = str3;
                        i31 = 3;
                        i27 = iM2765 ^ 1371964587;
                        i36 = i36;
                    } else {
                        int iM31612 = C0773.m3169("ᩳ֡") ^ i25;
                        i33 = i8;
                        int i38 = ((iM31612 ^ i24) * 22405) ^ 518843465;
                        sArr10 = sArr3;
                        i34 = i9;
                        strM7749 = str3;
                        i27 = iM31612 ^ 129907684;
                        str8 = str4;
                        i26 = i38;
                        i36 = i36;
                        int i39 = i7;
                        sArr12 = sArr4;
                        sArr13 = sArr2;
                        i31 = i10;
                        jSONArray3 = jSONArray;
                        i29 = i39;
                    }
                    break;
                case -2010622118:
                case 969713502:
                    i36 = i36;
                    strM7749 = C2287.m7749(f52501, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 13, i28);
                    if (jSONObject2.has(strM7749)) {
                        iM2762 = (C0619.m2761("ۗۘ") + i24) * (-125);
                        i2 = ((iM2762 ^ i25) * 3561) ^ (-776705170);
                        i12 = -213054854;
                    } else {
                        iM2762 = C0773.m3169("ۡ۟") ^ i24;
                        i2 = ((iM2762 ^ i25) * 25785) ^ (-1326643285);
                        i12 = -301812180;
                    }
                    i27 = iM2762 ^ i12;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -1940894353:
                case -1718795200:
                    c11192.m28203(jSONObject2.getLong(RunnableC3646.m11809(f52501, 130, 4, i28)));
                    C1519.m5406(arrayList, c11192);
                    i37++;
                    jSONObject = jSONObjectM25749;
                    str7 = strM7803;
                    jSONArray2 = jSONArray3;
                    sArr9 = sArr12;
                    int iM31613 = C0773.m3169("ܺ᩵") ^ i25;
                    JSONObject jSONObject3 = jSONObject;
                    int i40 = ((iM31613 ^ i24) * (-16365)) ^ (-1634150294);
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = iM31613 ^ (-1579338901);
                    jSONObjectM25749 = jSONObject3;
                    strM7803 = str7;
                    sArr13 = sArr13;
                    i31 = i31;
                    str8 = str8;
                    i26 = i40;
                    i36 = i36;
                    jSONArray3 = jSONArray2;
                    i29 = i29;
                    sArr12 = sArr9;
                    i32 = i32;
                    break;
                case -1914381848:
                case 1537356864:
                    AbstractC0116.m1243();
                    if (!C0619.f2439) {
                        i13 = i36;
                        str5 = strM7749;
                        sArr5 = sArr12;
                        i14 = i32;
                        str6 = str8;
                        i15 = i29;
                        int i41 = i31;
                        sArr6 = sArr13;
                        i16 = i41;
                        int iM31614 = C0773.m3169("᩻ۙ") ^ i24;
                        short[] sArr14 = sArr5;
                        str8 = str6;
                        i26 = ((iM31614 ^ i25) * (-8545)) ^ (-1575731753);
                        i36 = i13;
                        short[] sArr15 = sArr6;
                        i31 = i16;
                        sArr13 = sArr15;
                        String str9 = str5;
                        i27 = iM31614 ^ 560171197;
                        i29 = i15;
                        sArr12 = sArr14;
                        i32 = i14;
                        strM7749 = str9;
                    } else {
                        i36 = i36;
                        strM7749 = strM7749;
                        iM31610 = C0619.m2761("᩵۬") ^ i24;
                        i2 = ((iM31610 ^ i25) * 21345) ^ (-1386433864);
                        i11 = -80195077;
                        i17 = iM31610 ^ i11;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                        i36 = i36;
                    }
                    break;
                case -1904521867:
                case -619821870:
                    i28 = 48650;
                    iM3169 = C0619.m2761("ᩴۛ") ^ i24;
                    i2 = ((iM3169 ^ i25) * 26687) ^ (-222196053);
                    i3 = -24082344;
                    i17 = iM3169 ^ i3;
                    sArr13 = sArr13;
                    i29 = i29;
                    sArr12 = sArr12;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    c9922 = c9922;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -1889936350:
                case 818160836:
                    this.f52504 = arrayList;
                    return;
                case -1874912507:
                case -1347228942:
                    i36 = i36;
                    strM7749 = strM7749;
                    c11192.m28230(iM8880);
                    strM4861 = C1321.m4861(f52501, 108, 9, i28);
                    if (jSONObject2.has(strM4861)) {
                        iM31610 = C0619.m2761("ۢᩴ") ^ i25;
                        i2 = ((iM31610 ^ i24) * 23487) ^ 462636114;
                        i11 = -150753288;
                    } else {
                        iM31610 = (C0619.m2761("ۚ۠") ^ i24) * (-81);
                        i2 = ((iM31610 ^ i25) * (-10905)) ^ (-1697964870);
                        i11 = -630023125;
                    }
                    i17 = iM31610 ^ i11;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -1813613619:
                case -505955065:
                    i36 = i36;
                    strM7749 = strM7749;
                    c11192.m28217(RunnableC3646.m11810(jSONObject2, strM4861));
                    iM31610 = (C0619.m2761("ۚ۠") ^ i24) * (-81);
                    i2 = ((iM31610 ^ i25) * (-10905)) ^ (-1697964870);
                    i11 = -630023125;
                    i17 = iM31610 ^ i11;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -1721152079:
                case -1047603068:
                    C3998.m12920();
                    if (C2878.m9491() > 0) {
                        i36 = i36;
                        strM7749 = strM7749;
                        iM31610 = C0773.m3169("ۚ۫") ^ i25;
                        i2 = ((iM31610 ^ i24) * (-21639)) ^ 906535061;
                        i11 = 1870698420;
                        i17 = iM31610 ^ i11;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                        i36 = i36;
                    } else {
                        i36 = i36;
                        str3 = strM7749;
                        str4 = str8;
                        i8 = i33;
                        i9 = i34;
                        sArr3 = sArr10;
                        int i42 = i31;
                        sArr2 = sArr13;
                        sArr4 = sArr12;
                        i7 = i29;
                        jSONArray = jSONArray3;
                        i10 = i42;
                        int iM31615 = C0773.m3169("ᩳ֡") ^ i25;
                        i33 = i8;
                        int i310 = ((iM31615 ^ i24) * 22405) ^ 518843465;
                        sArr10 = sArr3;
                        i34 = i9;
                        strM7749 = str3;
                        i27 = iM31615 ^ 129907684;
                        str8 = str4;
                        i26 = i310;
                        i36 = i36;
                        int i311 = i7;
                        sArr12 = sArr4;
                        sArr13 = sArr2;
                        i31 = i10;
                        jSONArray3 = jSONArray;
                        i29 = i311;
                    }
                    break;
                case -1690951349:
                case 1201509619:
                    i28 = 12747;
                    iM3169 = C0619.m2761("ᩴۛ") ^ i24;
                    i2 = ((iM3169 ^ i25) * 26687) ^ (-222196053);
                    i3 = -24082344;
                    i17 = iM3169 ^ i3;
                    sArr13 = sArr13;
                    i29 = i29;
                    sArr12 = sArr12;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    c9922 = c9922;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -1678406828:
                case 855322839:
                    int i43 = i36;
                    String str10 = strM7749;
                    String str11 = strM7803;
                    int i44 = i34;
                    short[] sArr16 = sArr10;
                    JSONObject jSONObject4 = jSONObjectM25749;
                    JSONArray jSONArray4 = jSONArray3;
                    int i45 = i32;
                    String str12 = str8;
                    int i46 = i31;
                    short[] sArr17 = sArr12;
                    short[] sArr18 = sArr13;
                    int i47 = i29;
                    C9921 c9921M33415 = C13650.m33415();
                    if (c9921M33415.m25753()) {
                        iM2763 = (C0619.m2761("ܺ֡") ^ i25) * (-97);
                        i18 = ((iM2763 ^ i24) * (-15113)) ^ 1979237627;
                        i19 = -1966102227;
                    } else {
                        iM2763 = (C0619.m2761("᩹ۗ") ^ i24) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i18 = ((iM2763 ^ i25) * (-5255)) ^ (-609639998);
                        i19 = -874996603;
                    }
                    int i48 = iM2763 ^ i19;
                    i29 = i47;
                    sArr12 = sArr17;
                    i32 = i45;
                    jSONArray3 = jSONArray4;
                    sArr10 = sArr16;
                    i34 = i44;
                    strM7749 = str10;
                    i27 = i48;
                    i36 = i43;
                    c9922 = c9921M33415;
                    i26 = i18;
                    sArr13 = sArr18;
                    i31 = i46;
                    str8 = str12;
                    jSONObjectM25749 = jSONObject4;
                    strM7803 = str11;
                    break;
                case -1665034782:
                case -1221776470:
                    i36 = i36;
                    strM7749 = strM7749;
                    C9921 c9923 = c9922;
                    i31 = i31;
                    i34 = i34;
                    sArr10 = sArr10;
                    sArr13 = sArr13;
                    strM7803 = strM7803;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    jSONObjectM25749 = jSONObjectM25749;
                    sArr12 = sArr12;
                    i29 = i29;
                    boolean zM20925 = C7685.m20925();
                    c9922 = c9923;
                    String strM5510 = C1564.m5510(f52501, 21, 4, i28);
                    if (zM20925) {
                        str8 = strM5510;
                        iM3169 = (C0773.m3169("᩺۟") + i24) * (-103);
                        i2 = ((iM3169 ^ i25) * 19263) ^ 1612506537;
                        i3 = -1059951397;
                        i17 = iM3169 ^ i3;
                        sArr13 = sArr13;
                        i29 = i29;
                        sArr12 = sArr12;
                        i31 = i31;
                        str8 = str8;
                        jSONObjectM25749 = jSONObjectM25749;
                        strM7803 = strM7803;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        c9922 = c9922;
                        sArr10 = sArr10;
                        i34 = i34;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                    } else {
                        int iM31616 = (C0773.m3169("ۛ᩸") + i25) * 5;
                        jSONObjectM25749 = jSONObjectM25749;
                        strM7803 = strM7803;
                        i29 = i29;
                        sArr12 = sArr12;
                        c9922 = c9922;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr10;
                        i34 = i34;
                        strM7749 = strM7749;
                        i27 = iM31616 ^ 1670063392;
                        i26 = ((iM31616 ^ i24) * (-13077)) ^ (-771018976);
                        sArr13 = sArr13;
                        i31 = i31;
                        str8 = strM5510;
                    }
                    i36 = i36;
                    break;
                case -1650849338:
                case 2008867902:
                    C3448.m11248();
                    if (C2878.f9462) {
                        i36 = i36;
                        strM7749 = strM7749;
                        iM31610 = C0619.m2761("᩵۬") ^ i24;
                        i2 = ((iM31610 ^ i25) * 21345) ^ (-1386433864);
                        i11 = -80195077;
                        i17 = iM31610 ^ i11;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                        i36 = i36;
                    } else {
                        int iM2766 = (i25 - C0619.m2761("ܺ᩶")) * (-57);
                        i27 = iM2766 ^ 80473797;
                        i26 = ((iM2766 ^ i24) * 3895) ^ 1033106872;
                    }
                    break;
                case -1587458328:
                case -951679665:
                    throw new C4866(c9921M43778.m25751());
                case -1542505804:
                case -1404331149:
                    str = strM7749;
                    int i49 = i33;
                    i = i34;
                    short[] sArr19 = sArr10;
                    c11192.m28231(RunnableC3646.m11810(jSONObject2, C2419.m8166(sArr19, i49, i, i28)));
                    String str13 = str8;
                    c11192.m28211(C1146.m4238(jSONObject2, str13));
                    short[] sArr20 = f52501;
                    if (C3779.f12953 <= 0) {
                        sArr = sArr19;
                        i33 = i49;
                        str2 = str13;
                        sArr11 = sArr20;
                        i36 = 66;
                        sArr7 = sArr13;
                        sArr8 = sArr12;
                        i20 = i29;
                        int iM31617 = C0773.m3169("ۛۡ") ^ i25;
                        i21 = i31;
                        str8 = str2;
                        i26 = ((iM31617 ^ i24) * 22885) ^ 2123254340;
                        i29 = i20;
                        sArr12 = sArr8;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr;
                        i34 = i;
                        strM7749 = str;
                        i27 = iM31617 ^ 571556291;
                        sArr13 = sArr7;
                        i31 = i21;
                    } else {
                        int iM2767 = C0619.m2761("ۨ᩺") ^ i25;
                        i26 = ((iM2767 ^ i24) * 5747) ^ (-1160990106);
                        str8 = str13;
                        sArr11 = sArr20;
                        sArr10 = sArr19;
                        i34 = i;
                        strM7749 = str;
                        i27 = iM2767 ^ 399827099;
                        i33 = i49;
                        i36 = 66;
                    }
                    break;
                case -1429801186:
                case -1347817383:
                    i36 = i36;
                    strM7749 = strM7749;
                    c9922 = c9922;
                    i34 = i34;
                    sArr10 = sArr10;
                    strM7803 = strM7803;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    jSONObjectM25749 = jSONObjectM25749;
                    sArr12 = sArr12;
                    str8 = str8;
                    i29 = i29;
                    i31 = i31;
                    sArr13 = sArr13;
                    s = f52501[20];
                    i30 = s + 1;
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0773.m3169("᩹ۘ") ^ i24;
                        i2 = ((iM3169 ^ i25) * (-25703)) ^ 15810117;
                        i3 = 367917084;
                    } else {
                        iM3169 = C0773.m3169("۠ۧ") ^ i25;
                        i2 = ((iM3169 ^ i24) * (-23523)) ^ 1051926458;
                        i3 = -2085786850;
                    }
                    i17 = iM3169 ^ i3;
                    sArr13 = sArr13;
                    i29 = i29;
                    sArr12 = sArr12;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    c9922 = c9922;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -1351137559:
                case 1128030507:
                    i36 = i36;
                    strM7749 = strM7749;
                    c9921 = c9922;
                    i34 = i34;
                    sArr10 = sArr10;
                    strM7803 = strM7803;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    jSONObjectM25749 = jSONObjectM25749;
                    sArr12 = sArr12;
                    str8 = str8;
                    i29 = i29;
                    i31 = i31;
                    sArr13 = sArr13;
                    if (C7685.m20925()) {
                        iM2761 = C0773.m3169("ۘۛ") ^ i24;
                        i4 = ((iM2761 ^ i25) * 1985) ^ (-332611616);
                        i5 = -1224078012;
                    } else {
                        iM2761 = (i25 - C0619.m2761("۠ۚ")) * (-87);
                        i4 = ((iM2761 ^ i24) * (-14311)) ^ (-1654987786);
                        i5 = -1272117311;
                    }
                    i6 = iM2761 ^ i5;
                    i29 = i29;
                    sArr12 = sArr12;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i6;
                    i26 = i4;
                    sArr13 = sArr13;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    c9922 = c9921;
                    i36 = i36;
                    break;
                case -1246585142:
                case 1190439234:
                    if (C0269.m1775() > 0) {
                        i36 = i36;
                        strM7749 = strM7749;
                        iM31610 = C0619.m2761("᩵۬") ^ i24;
                        i2 = ((iM31610 ^ i25) * 21345) ^ (-1386433864);
                        i11 = -80195077;
                        i17 = iM31610 ^ i11;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                        i36 = i36;
                    } else {
                        i36 = i36;
                        str3 = strM7749;
                        str4 = str8;
                        i8 = i33;
                        i9 = i34;
                        sArr3 = sArr10;
                        int i410 = i31;
                        sArr2 = sArr13;
                        sArr4 = sArr12;
                        i7 = i29;
                        jSONArray = jSONArray3;
                        i10 = i410;
                        int iM31618 = C0773.m3169("ᩳ֡") ^ i25;
                        i33 = i8;
                        int i312 = ((iM31618 ^ i24) * 22405) ^ 518843465;
                        sArr10 = sArr3;
                        i34 = i9;
                        strM7749 = str3;
                        i27 = iM31618 ^ 129907684;
                        str8 = str4;
                        i26 = i312;
                        i36 = i36;
                        int i313 = i7;
                        sArr12 = sArr4;
                        sArr13 = sArr2;
                        i31 = i10;
                        jSONArray3 = jSONArray;
                        i29 = i313;
                    }
                    break;
                case -1214122945:
                case 1018988866:
                    i36 = i36;
                    strM7749 = strM7749;
                    c11192.m28222(C2288.m7759(jSONObject2, C3690.m11996(sArr13, i29, 11, i28)));
                    strM9670 = C2966.m9670(f52501, 88, 11, i28);
                    if (AbstractC3624.f12429 <= 0) {
                        iM31610 = C0619.m2761("᩵۬") ^ i24;
                        i2 = ((iM31610 ^ i25) * 21345) ^ (-1386433864);
                        i11 = -80195077;
                    } else {
                        iM31610 = (i24 - C0619.m2761("ۨۧ")) * 97;
                        i2 = ((iM31610 ^ i25) * 26779) ^ (-453415599);
                        i11 = 1835710644;
                    }
                    i17 = iM31610 ^ i11;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -986121481:
                case -665429298:
                    int i50 = i36;
                    String str14 = strM7749;
                    String str15 = str8;
                    int i51 = i34;
                    short[] sArr21 = sArr10;
                    int i52 = i31;
                    short[] sArr22 = sArr13;
                    short[] sArr23 = sArr12;
                    int i53 = i29;
                    JSONArray jSONArray5 = jSONArray3;
                    int i54 = i32;
                    if (i37 < jSONArray5.length()) {
                        iM31611 = C0619.m2761("ۡ֫") ^ i24;
                        i22 = ((iM31611 ^ i25) * (-25955)) ^ (-14955327);
                        i23 = -428712454;
                    } else {
                        iM31611 = C0773.m3169("֨ۖ") ^ i25;
                        i22 = ((iM31611 ^ i24) * (-28099)) ^ 242998690;
                        i23 = -339977749;
                    }
                    int i55 = iM31611 ^ i23;
                    sArr10 = sArr21;
                    i34 = i51;
                    strM7749 = str14;
                    i27 = i55;
                    i36 = i50;
                    str8 = str15;
                    i26 = i22;
                    sArr13 = sArr22;
                    i31 = i52;
                    jSONArray3 = jSONArray5;
                    i29 = i53;
                    sArr12 = sArr23;
                    i32 = i54;
                    break;
                case -884148800:
                case 1666724237:
                    C1564.m5509();
                    return;
                case -753771083:
                case 938207270:
                    throw new Exception(c9922.m25751());
                case -745984342:
                case 38476212:
                    return;
                case -715591398:
                case 775284611:
                    i36 = i36;
                    strM7749 = strM7749;
                    c9921 = c9922;
                    i34 = i34;
                    sArr10 = sArr10;
                    strM7803 = strM7803;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    jSONObjectM25749 = jSONObjectM25749;
                    sArr12 = sArr12;
                    str8 = str8;
                    i29 = i29;
                    i31 = i31;
                    sArr13 = sArr13;
                    int i56 = C13650.f43337;
                    C18872 c18872M43772 = C18872.m43772(C2966.m9670(f52501, 25, 16, i28));
                    c18872M43772.m43779();
                    c9921M43778 = c18872M43772.m43778();
                    if (c9921M43778.m25753()) {
                        iM2761 = (C0773.m3169("᩻ܳ") ^ i25) * q.h;
                        i4 = ((iM2761 ^ i24) * 24427) ^ (-226009584);
                        i5 = 1736751110;
                    } else {
                        iM2761 = C0773.m3169("ܿۙ") ^ i25;
                        i4 = ((iM2761 ^ i24) * 16161) ^ 1150640231;
                        i5 = -981165451;
                    }
                    i6 = iM2761 ^ i5;
                    i29 = i29;
                    sArr12 = sArr12;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i6;
                    i26 = i4;
                    sArr13 = sArr13;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    c9922 = c9921;
                    i36 = i36;
                    break;
                case -628358411:
                case 1127388254:
                    C2834.m9344();
                    if (C1564.f5401 > 0) {
                        str = strM7749;
                        str2 = str8;
                        i = i34;
                        sArr = sArr10;
                        sArr7 = sArr13;
                        sArr8 = sArr12;
                        i20 = i29;
                        int iM31619 = C0773.m3169("ۛۡ") ^ i25;
                        i21 = i31;
                        str8 = str2;
                        i26 = ((iM31619 ^ i24) * 22885) ^ 2123254340;
                        i29 = i20;
                        sArr12 = sArr8;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr;
                        i34 = i;
                        strM7749 = str;
                        i27 = iM31619 ^ 571556291;
                        sArr13 = sArr7;
                        i31 = i21;
                    } else {
                        i36 = i36;
                        strM7749 = strM7749;
                        iM31610 = C0773.m3169("ۚ۫") ^ i25;
                        i2 = ((iM31610 ^ i24) * (-21639)) ^ 906535061;
                        i11 = 1870698420;
                        i17 = iM31610 ^ i11;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                        i36 = i36;
                    }
                    break;
                case -499121960:
                case 1310825031:
                    C1146.m4231();
                    if (C2354.f7599 >= 0) {
                        i36 = i36;
                        strM7749 = strM7749;
                        c9922 = c9922;
                        i34 = i34;
                        sArr10 = sArr10;
                        strM7803 = strM7803;
                        jSONArray3 = jSONArray3;
                        i32 = i32;
                        jSONObjectM25749 = jSONObjectM25749;
                        sArr12 = sArr12;
                        str8 = str8;
                        i29 = i29;
                        i31 = i31;
                        sArr13 = sArr13;
                        iM3169 = C0773.m3169("᩹ۘ") ^ i24;
                        i2 = ((iM3169 ^ i25) * (-25703)) ^ 15810117;
                        i3 = 367917084;
                        i17 = iM3169 ^ i3;
                        sArr13 = sArr13;
                        i29 = i29;
                        sArr12 = sArr12;
                        i31 = i31;
                        str8 = str8;
                        jSONObjectM25749 = jSONObjectM25749;
                        strM7803 = strM7803;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        c9922 = c9922;
                        sArr10 = sArr10;
                        i34 = i34;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                        i36 = i36;
                    } else {
                        str = strM7749;
                        str2 = str8;
                        i = i34;
                        sArr = sArr10;
                        sArr7 = sArr13;
                        sArr8 = sArr12;
                        i20 = i29;
                        int iM316110 = C0773.m3169("ۛۡ") ^ i25;
                        i21 = i31;
                        str8 = str2;
                        i26 = ((iM316110 ^ i24) * 22885) ^ 2123254340;
                        i29 = i20;
                        sArr12 = sArr8;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr;
                        i34 = i;
                        strM7749 = str;
                        i27 = iM316110 ^ 571556291;
                        sArr13 = sArr7;
                        i31 = i21;
                    }
                    break;
                case -454916341:
                case 238742976:
                    c11192.m28223(C1146.m4238(jSONObject2, strM7749));
                    i36 = i36;
                    iM2762 = C0773.m3169("ۡ۟") ^ i24;
                    i2 = ((iM2762 ^ i25) * 25785) ^ (-1326643285);
                    i12 = -301812180;
                    i27 = iM2762 ^ i12;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -414677762:
                case 1867926061:
                    i36 = i36;
                    strM7749 = strM7749;
                    c9922 = c9922;
                    i34 = i34;
                    sArr10 = sArr10;
                    strM7803 = strM7803;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    jSONObjectM25749 = jSONObjectM25749;
                    sArr12 = sArr12;
                    str8 = str8;
                    i29 = i29;
                    i31 = i31;
                    sArr13 = sArr13;
                    if (((s * 2) + 1) - (i30 * i30) <= 0) {
                        iM3169 = C0773.m3169("᩸ۤ") ^ i24;
                        i2 = ((iM3169 ^ i25) * (-21499)) ^ (-579272042);
                        i3 = -110674566;
                    } else {
                        iM3169 = C0619.m2761("֫ܰ") ^ i25;
                        i2 = ((iM3169 ^ i24) * 9651) ^ 1772833482;
                        i3 = -358692745;
                    }
                    i17 = iM3169 ^ i3;
                    sArr13 = sArr13;
                    i29 = i29;
                    sArr12 = sArr12;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    c9922 = c9922;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case -363816595:
                case 1311144173:
                    i36 = i36;
                    strM7749 = strM7749;
                    c9921 = c9922;
                    i34 = i34;
                    sArr10 = sArr10;
                    strM7803 = strM7803;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    jSONObjectM25749 = jSONObjectM25749;
                    sArr12 = sArr12;
                    str8 = str8;
                    i29 = i29;
                    i31 = i31;
                    sArr13 = sArr13;
                    C7685.m20924(true);
                    C7685.m20922(c9921.m25752(C11235.m28300(f52501, 41, 5, i28)));
                    if (C2288.f7433 > 0) {
                        iM2761 = C0773.m3169("ۤܳ") ^ i24;
                        i4 = ((iM2761 ^ i25) * 18617) ^ (-106705934);
                        i5 = 1480058269;
                        i6 = iM2761 ^ i5;
                        i29 = i29;
                        sArr12 = sArr12;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr10;
                        i34 = i34;
                        strM7749 = strM7749;
                        i27 = i6;
                        i26 = i4;
                        sArr13 = sArr13;
                        i31 = i31;
                        str8 = str8;
                        jSONObjectM25749 = jSONObjectM25749;
                        strM7803 = strM7803;
                        c9922 = c9921;
                        i36 = i36;
                    } else {
                        sArr13 = sArr13;
                        i29 = i29;
                        int iM2768 = (C0619.m2761("᩻ᩳ") + i24) * (-75);
                        sArr13 = sArr13;
                        i4 = ((iM2768 ^ i25) * 24383) ^ 1840137469;
                        i6 = iM2768 ^ (-759810015);
                        sArr12 = sArr12;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr10;
                        i34 = i34;
                        strM7749 = strM7749;
                        i27 = i6;
                        i26 = i4;
                        sArr13 = sArr13;
                        i31 = i31;
                        str8 = str8;
                        jSONObjectM25749 = jSONObjectM25749;
                        strM7803 = strM7803;
                        c9922 = c9921;
                        i36 = i36;
                    }
                    break;
                case 99524447:
                case 600930181:
                    int i57 = i36;
                    str = strM7749;
                    str2 = str8;
                    i = i34;
                    sArr = sArr10;
                    i31 = i31;
                    sArr7 = sArr13;
                    short[] sArr24 = sArr12;
                    i20 = i29;
                    JSONArray jSONArray6 = jSONArray3;
                    i32 = i32;
                    sArr8 = sArr24;
                    jSONObjectM25749 = c9921M43778.m25749();
                    jSONArray3 = jSONArray6;
                    strM7803 = C2310.m7803(f52501, 51, 4, i28);
                    if (C2878.f9462) {
                        i36 = i57;
                        int iM316111 = C0773.m3169("ۛۡ") ^ i25;
                        i21 = i31;
                        str8 = str2;
                        i26 = ((iM316111 ^ i24) * 22885) ^ 2123254340;
                        i29 = i20;
                        sArr12 = sArr8;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr;
                        i34 = i;
                        strM7749 = str;
                        i27 = iM316111 ^ 571556291;
                    } else {
                        int iM2769 = (C0619.m2761("ۖۙ") ^ i24) * 99;
                        int i58 = ((iM2769 ^ i25) * (-20971)) ^ 2018143076;
                        i29 = i20;
                        sArr12 = sArr8;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr;
                        i34 = i;
                        strM7749 = str;
                        i27 = iM2769 ^ 1728035714;
                        i36 = i57;
                        i21 = i31;
                        str8 = str2;
                        i26 = i58;
                    }
                    sArr13 = sArr7;
                    i31 = i21;
                    break;
                case 191201026:
                case 431349892:
                    C1564.m5509();
                    i36 = i36;
                    str3 = strM7749;
                    str4 = str8;
                    i8 = i33;
                    i9 = i34;
                    sArr3 = sArr10;
                    int i411 = i31;
                    sArr2 = sArr13;
                    sArr4 = sArr12;
                    i7 = i29;
                    jSONArray = jSONArray3;
                    i10 = i411;
                    int iM316112 = C0773.m3169("ᩳ֡") ^ i25;
                    i33 = i8;
                    int i314 = ((iM316112 ^ i24) * 22405) ^ 518843465;
                    sArr10 = sArr3;
                    i34 = i9;
                    strM7749 = str3;
                    i27 = iM316112 ^ 129907684;
                    str8 = str4;
                    i26 = i314;
                    i36 = i36;
                    int i315 = i7;
                    sArr12 = sArr4;
                    sArr13 = sArr2;
                    i31 = i10;
                    jSONArray3 = jSONArray;
                    i29 = i315;
                    break;
                case 466320496:
                case 1932600302:
                    i36 = i36;
                    strM7749 = strM7749;
                    c11192.m28204(RunnableC3646.m11810(jSONObject2, C1343.m4939(sArr11, i36, 11, i28)));
                    sArr13 = f52501;
                    i29 = 77;
                    if (AbstractC0641.f2496 < 0) {
                        iM31610 = (i24 - C0773.m3169("ᩳۡ")) * (-103);
                        i2 = ((iM31610 ^ i25) * (-3343)) ^ (-172751379);
                        i11 = -979425720;
                        i17 = iM31610 ^ i11;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                        i36 = i36;
                    } else {
                        c9921 = c9922;
                        i34 = i34;
                        sArr10 = sArr10;
                        strM7803 = strM7803;
                        jSONArray3 = jSONArray3;
                        i32 = i32;
                        jSONObjectM25749 = jSONObjectM25749;
                        sArr12 = sArr12;
                        str8 = str8;
                        i31 = i31;
                        int iM27610 = (C0619.m2761("᩻ᩳ") + i24) * (-75);
                        sArr13 = sArr13;
                        i4 = ((iM27610 ^ i25) * 24383) ^ 1840137469;
                        i6 = iM27610 ^ (-759810015);
                        sArr12 = sArr12;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr10;
                        i34 = i34;
                        strM7749 = strM7749;
                        i27 = i6;
                        i26 = i4;
                        sArr13 = sArr13;
                        i31 = i31;
                        str8 = str8;
                        jSONObjectM25749 = jSONObjectM25749;
                        strM7803 = strM7803;
                        c9922 = c9921;
                        i36 = i36;
                    }
                    break;
                case 525924669:
                case 1625796504:
                    jSONObject = jSONObjectM25749;
                    sArr9 = sArr12;
                    str7 = strM7803;
                    jSONArray2 = jSONObject.getJSONArray(str7);
                    arrayList = new ArrayList(jSONArray2.length());
                    i37 = 0;
                    int iM316113 = C0773.m3169("ܺ᩵") ^ i25;
                    JSONObject jSONObject5 = jSONObject;
                    int i412 = ((iM316113 ^ i24) * (-16365)) ^ (-1634150294);
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = iM316113 ^ (-1579338901);
                    jSONObjectM25749 = jSONObject5;
                    strM7803 = str7;
                    sArr13 = sArr13;
                    i31 = i31;
                    str8 = str8;
                    i26 = i412;
                    i36 = i36;
                    jSONArray3 = jSONArray2;
                    i29 = i29;
                    sArr12 = sArr9;
                    i32 = i32;
                    break;
                case 689423120:
                case 1794355112:
                    i36 = i36;
                    strM7749 = strM7749;
                    c9921 = c9922;
                    i34 = i34;
                    sArr10 = sArr10;
                    strM7803 = strM7803;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    jSONObjectM25749 = jSONObjectM25749;
                    sArr12 = sArr12;
                    str8 = str8;
                    i29 = i29;
                    i31 = i31;
                    sArr13 = sArr13;
                    if (c9921.m25745() != 1000) {
                        iM2761 = C0773.m3169("ۘ֡") ^ i24;
                        i4 = ((iM2761 ^ i25) * 6657) ^ 1433194208;
                        i5 = -1321163999;
                        i6 = iM2761 ^ i5;
                        i29 = i29;
                        sArr12 = sArr12;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr10 = sArr10;
                        i34 = i34;
                        strM7749 = strM7749;
                        i27 = i6;
                        i26 = i4;
                        sArr13 = sArr13;
                        i31 = i31;
                        str8 = str8;
                        jSONObjectM25749 = jSONObjectM25749;
                        strM7803 = strM7803;
                        c9922 = c9921;
                        i36 = i36;
                    }
                    c9922 = c9921;
                    iM3169 = (C0773.m3169("᩺۟") + i24) * (-103);
                    i2 = ((iM3169 ^ i25) * 19263) ^ 1612506537;
                    i3 = -1059951397;
                    i17 = iM3169 ^ i3;
                    sArr13 = sArr13;
                    i29 = i29;
                    sArr12 = sArr12;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    c9922 = c9922;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case 865370103:
                case 1452542596:
                    i13 = i36;
                    str5 = strM7749;
                    sArr5 = sArr12;
                    i14 = i32;
                    str6 = str8;
                    i15 = i29;
                    int i59 = i31;
                    sArr6 = sArr13;
                    i16 = i59;
                    c11192.m28210(C2702.m8880(jSONObject2, C0773.m3166(sArr5, i14, i16, i28)));
                    sArr10 = f52501;
                    i33 = 58;
                    i34 = 8;
                    if (C4238.f15451 >= 0) {
                        int iM316114 = C0773.m3169("᩻ۙ") ^ i24;
                        short[] sArr110 = sArr5;
                        str8 = str6;
                        i26 = ((iM316114 ^ i25) * (-8545)) ^ (-1575731753);
                        i36 = i13;
                        short[] sArr111 = sArr6;
                        i31 = i16;
                        sArr13 = sArr111;
                        String str16 = str5;
                        i27 = iM316114 ^ 560171197;
                        i29 = i15;
                        sArr12 = sArr110;
                        i32 = i14;
                        strM7749 = str16;
                    } else {
                        int iM27611 = (C0619.m2761("᩸ۙ") + i25) * (-13);
                        str8 = str6;
                        i26 = ((iM27611 ^ i24) * (-25459)) ^ 363844870;
                        i29 = i15;
                        sArr12 = sArr5;
                        i32 = i14;
                        strM7749 = str5;
                        i27 = iM27611 ^ 1283047979;
                        i36 = i13;
                        i31 = i16;
                        sArr13 = sArr6;
                    }
                    break;
                case 979705359:
                case 1224085872:
                    i36 = i36;
                    strM7749 = strM7749;
                    c9921 = c9922;
                    String str17 = str8;
                    i34 = i34;
                    sArr10 = sArr10;
                    jSONArray3 = jSONArray3;
                    i31 = i31;
                    i32 = i32;
                    sArr13 = sArr13;
                    String str18 = strM7803;
                    sArr12 = sArr12;
                    i29 = i29;
                    jSONObjectM25749 = jSONObjectM25749;
                    C7685.m20927(c9921.m25752(str17));
                    str8 = str17;
                    strM7803 = str18;
                    c9921.m25750(C2354.m7980(f52501, 46, 5, i28));
                    c9922 = c9921;
                    iM3169 = (C0773.m3169("᩺۟") + i24) * (-103);
                    i2 = ((iM3169 ^ i25) * 19263) ^ 1612506537;
                    i3 = -1059951397;
                    i17 = iM3169 ^ i3;
                    sArr13 = sArr13;
                    i29 = i29;
                    sArr12 = sArr12;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    c9922 = c9922;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                case 1529829365:
                case 2064307205:
                    i36 = i36;
                    strM7749 = strM7749;
                    c11192.m28206(jSONObject2.getBoolean(strM6233));
                    iM8880 = C2702.m8880(jSONObject2, C2702.m8881(f52501, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 5, i28));
                    if (RunnableC0334.f1808 <= 0) {
                        iM31610 = C0773.m3169("ۚ۫") ^ i25;
                        i2 = ((iM31610 ^ i24) * (-21639)) ^ 906535061;
                        i11 = 1870698420;
                    } else {
                        iM31610 = (i25 - C0773.m3169("ܺᩴ")) * 3;
                        i2 = ((iM31610 ^ i24) * (-1739)) ^ (-982980715);
                        i11 = -2128722251;
                    }
                    i17 = iM31610 ^ i11;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
                default:
                    i36 = i36;
                    strM7749 = strM7749;
                    c11192.m28208(RunnableC3646.m11810(jSONObject2, strM9670));
                    strM6233 = C1783.m6233(f52501, 99, 4, i28);
                    if (!C2878.f9462) {
                        iM31610 = C0773.m3169("ܺ֨") ^ i25;
                        i2 = ((iM31610 ^ i24) * (-28837)) ^ 299720172;
                        i11 = 535757388;
                        i17 = iM31610 ^ i11;
                        strM7749 = strM7749;
                        i27 = i17;
                        i26 = i2;
                        i36 = i36;
                    }
                    c9922 = c9922;
                    i34 = i34;
                    sArr10 = sArr10;
                    strM7803 = strM7803;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    jSONObjectM25749 = jSONObjectM25749;
                    sArr12 = sArr12;
                    str8 = str8;
                    i29 = i29;
                    i31 = i31;
                    sArr13 = sArr13;
                    iM3169 = C0773.m3169("᩹ۘ") ^ i24;
                    i2 = ((iM3169 ^ i25) * (-25703)) ^ 15810117;
                    i3 = 367917084;
                    i17 = iM3169 ^ i3;
                    sArr13 = sArr13;
                    i29 = i29;
                    sArr12 = sArr12;
                    i31 = i31;
                    str8 = str8;
                    jSONObjectM25749 = jSONObjectM25749;
                    strM7803 = strM7803;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    c9922 = c9922;
                    sArr10 = sArr10;
                    i34 = i34;
                    strM7749 = strM7749;
                    i27 = i17;
                    i26 = i2;
                    i36 = i36;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0185 A[PHI: r4 r6 r7 r8 r10
      0x0185: PHI (r4v4 short[]) = (r4v2 short[]), (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:45:0x0183, B:41:0x0159, B:37:0x0132, B:29:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r6v6 int) = (r6v5 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:45:0x0183, B:41:0x0159, B:37:0x0132, B:29:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r7v4 android.content.DialogInterface$OnClickListener) = 
      (r7v2 android.content.DialogInterface$OnClickListener)
      (r7v3 android.content.DialogInterface$OnClickListener)
      (r7v2 android.content.DialogInterface$OnClickListener)
      (r7v2 android.content.DialogInterface$OnClickListener)
     binds: [B:45:0x0183, B:41:0x0159, B:37:0x0132, B:29:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r8v6 int) = (r8v2 int), (r8v2 int), (r8v5 int), (r8v2 int) binds: [B:45:0x0183, B:41:0x0159, B:37:0x0132, B:29:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:45:0x0183, B:41:0x0159, B:37:0x0132, B:29:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM3169;
        int i;
        int i2;
        int i3;
        short[] sArr;
        int iM2761;
        int i4;
        int iM31610;
        int i5;
        int i6;
        short[] sArr2;
        TextView textView;
        String strM6366;
        int iM2762;
        int i7;
        int i8;
        int iM2763;
        int i9;
        int i10;
        int i11;
        int i12;
        this = this;
        int i13 = RunnableC3055.f9898;
        int i14 = C2287.f7432;
        int iM2764 = C0619.m2761("ۤ֨") ^ i13;
        int i15 = ((iM2764 ^ i14) * (-17609)) ^ 395651792;
        C2361 c2361 = null;
        DialogInterface.OnClickListener onClickListener = null;
        DialogInterface.OnClickListener onClickListener2 = null;
        String str = null;
        String strM6310 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i16 = iM2764 ^ 1194155961;
        ActivityC9458 activityC9458 = null;
        int iM31611 = 0;
        int iM2765 = 0;
        int iM31612 = 0;
        int i17 = 0;
        int i18 = 0;
        short s = 0;
        int i19 = 0;
        int i20 = -847681044;
        TextView textView2 = null;
        int i21 = 0;
        while (true) {
            i20 = i16 ^ (i15 & (((i20 ^ i14) * (-23807)) >> 31));
            switch (i20) {
                case -2100217953:
                case -2016683602:
                    C2419.m8168(c2361, iM2765, onClickListener);
                    onClickListener2 = new DialogInterface.OnClickListener() { // from class: l.ܺܶ֫
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i22) {
                            int i23 = 355987745;
                            int i24 = C3779.f12953;
                            int i25 = C0487.f2131;
                            int iM31613 = C0773.m3169("ܰۗ") ^ i24;
                            int i26 = ((iM31613 ^ i25) * (-12477)) ^ (-1825069002);
                            int i27 = -1880707762;
                            while (true) {
                                i23 = ((((i23 ^ i25) * (-2633)) >> 31) & i26) ^ (iM31613 ^ i27);
                                switch (i23) {
                                    case -1880265724:
                                    case -1483491051:
                                        if (C2287.m7745() <= 0) {
                                            iM31613 = C0773.m3169("ܰۜ") ^ i24;
                                            i26 = ((iM31613 ^ i25) * (-6097)) ^ (-2139003546);
                                            i27 = -2103869073;
                                        } else {
                                            iM31613 = (i25 - C0619.m2761("ۨۛ")) * 21;
                                            i26 = ((iM31613 ^ i24) * 16293) ^ 1195955643;
                                            i27 = -1573599449;
                                        }
                                        break;
                                    case -1688329678:
                                    case -1501687329:
                                        if (C1519.f5300 >= 0) {
                                            iM31613 = (C0773.m3169("۫ۚ") + i24) * (-81);
                                            i26 = ((iM31613 ^ i25) * 11675) ^ 1132630062;
                                            i27 = -613871076;
                                        } else {
                                            iM31613 = (i24 - C0619.m2761("ۢۢ")) * (-75);
                                            i26 = ((iM31613 ^ i25) * (-8039)) ^ 1045281055;
                                            i27 = 186727791;
                                        }
                                        break;
                                    case -1425981963:
                                    case -1226791859:
                                        C0773.m3161();
                                        if (!C1343.m4943()) {
                                            iM31613 = C0773.m3169("᩺ۘ") ^ i25;
                                            i26 = ((iM31613 ^ i24) * (-25021)) ^ 830224502;
                                            i27 = -1573032261;
                                        } else {
                                            iM31613 = (C0773.m3169("ۖܳ") ^ i25) * (-89);
                                            i26 = ((iM31613 ^ i24) * 2421) ^ (-1717648875);
                                            i27 = 749631440;
                                        }
                                        break;
                                    case -1421354191:
                                    case 1374080547:
                                        C23916.m53419();
                                        if (C1321.f4751 < 0) {
                                            iM31613 = C0773.m3169("ܰۜ") ^ i24;
                                            i26 = ((iM31613 ^ i25) * (-6097)) ^ (-2139003546);
                                            i27 = -2103869073;
                                        } else {
                                            iM31613 = (C0773.m3169("ۖܳ") ^ i25) * (-89);
                                            i26 = ((iM31613 ^ i24) * 2421) ^ (-1717648875);
                                            i27 = 749631440;
                                        }
                                        break;
                                    case -1253109187:
                                    case 1357469531:
                                        if (C4238.f15451 < 0) {
                                            iM31613 = (C0773.m3169("۫ۚ") + i24) * (-81);
                                            i26 = ((iM31613 ^ i25) * 11675) ^ 1132630062;
                                            i27 = -613871076;
                                        } else {
                                            iM31613 = (C0773.m3169("ۖܳ") ^ i25) * (-89);
                                            i26 = ((iM31613 ^ i24) * 2421) ^ (-1717648875);
                                            i27 = 749631440;
                                        }
                                        break;
                                    case -1146346859:
                                    case 2097565127:
                                        if (C1542.f5343 <= 0) {
                                            iM31613 = (C0773.m3169("ۖܳ") ^ i25) * (-89);
                                            i26 = ((iM31613 ^ i24) * 2421) ^ (-1717648875);
                                            i27 = 749631440;
                                        } else {
                                            iM31613 = C0619.m2761("ۧ֫") ^ i25;
                                            i26 = ((iM31613 ^ i24) * 5087) ^ 876844189;
                                            i27 = 1288187450;
                                        }
                                        break;
                                    case -805418615:
                                    case 2017314515:
                                        C4238.m13537(this.f55309.f52503);
                                        break;
                                    case -608215423:
                                    case 2092740760:
                                        if (C2310.f7472 >= 0) {
                                            iM31613 = C0773.m3169("ܰۜ") ^ i24;
                                            i26 = ((iM31613 ^ i25) * (-6097)) ^ (-2139003546);
                                            i27 = -2103869073;
                                        } else {
                                            iM31613 = (C0773.m3169("ܳ۫") + i25) * 13;
                                            i26 = ((iM31613 ^ i24) * (-5233)) ^ 1173472942;
                                            i27 = 187267449;
                                        }
                                        break;
                                    case -207658482:
                                    case 1309438510:
                                        if (C1564.f5401 <= 0) {
                                            iM31613 = (C0773.m3169("۫ۚ") + i24) * (-81);
                                            i26 = ((iM31613 ^ i25) * 11675) ^ 1132630062;
                                            i27 = -613871076;
                                        } else {
                                            iM31613 = (i25 - C0619.m2761("ᩳۢ")) * 65;
                                            i26 = ((iM31613 ^ i24) * (-18189)) ^ 557704799;
                                            i27 = 214471778;
                                        }
                                        break;
                                    case -200909057:
                                    case -181488237:
                                        C13473.m33144();
                                        break;
                                    case -29783317:
                                    case 2009403129:
                                        if (C17202.f56030) {
                                            iM31613 = (C0619.m2761("ܽۚ") ^ i24) * (-69);
                                            i26 = ((iM31613 ^ i25) * (-5005)) ^ (-1584087815);
                                            i27 = 103452288;
                                        } else {
                                            iM31613 = (i25 - C0619.m2761("ܰ۟")) * (-53);
                                            i26 = ((iM31613 ^ i24) * (-17339)) ^ 786748059;
                                            i27 = 1952258912;
                                        }
                                        break;
                                    case 64125036:
                                    case 1725142297:
                                        if (C2966.f9654 >= 0) {
                                            iM31613 = (C0773.m3169("ۖܳ") ^ i25) * (-89);
                                            i26 = ((iM31613 ^ i24) * 2421) ^ (-1717648875);
                                            i27 = 749631440;
                                        } else {
                                            iM31613 = (C0619.m2761("ܶۜ") ^ i25) * (-61);
                                            i26 = ((iM31613 ^ i24) * (-7373)) ^ 1552055542;
                                            i27 = 350931261;
                                        }
                                        break;
                                    case 233614839:
                                    case 830164984:
                                        C2023.m6964();
                                        C2834.m9344();
                                        iM31613 = (C0773.m3169("ۖܳ") ^ i25) * (-89);
                                        i26 = ((iM31613 ^ i24) * 2421) ^ (-1717648875);
                                        i27 = 749631440;
                                        break;
                                    case 1004876297:
                                    case 1046643645:
                                        if (C3099.f10023 <= 0) {
                                            iM31613 = C0773.m3169("ܰۜ") ^ i24;
                                            i26 = ((iM31613 ^ i25) * (-6097)) ^ (-2139003546);
                                            i27 = -2103869073;
                                        } else {
                                            iM31613 = (C0619.m2761("᩶᩹") + i24) * 77;
                                            i26 = ((iM31613 ^ i25) * (-25721)) ^ (-1764167906);
                                            i27 = -452849412;
                                        }
                                        break;
                                    case 1219917613:
                                    case 1538896518:
                                        if (C11235.m28309() != 0) {
                                            iM31613 = C0773.m3169("᩺ۘ") ^ i25;
                                            i26 = ((iM31613 ^ i24) * (-25021)) ^ 830224502;
                                            i27 = -1573032261;
                                        } else {
                                            iM31613 = C0619.m2761("֨֫") ^ i24;
                                            i26 = ((iM31613 ^ i25) * 17241) ^ 837124106;
                                            i27 = 1362135833;
                                        }
                                        break;
                                    default:
                                        if (C2702.f8586 <= 0) {
                                            iM31613 = (C0773.m3169("۫ۚ") + i24) * (-81);
                                            i26 = ((iM31613 ^ i25) * 11675) ^ 1132630062;
                                            i27 = -613871076;
                                        } else {
                                            iM31613 = C0773.m3169("ۙ۠") ^ i24;
                                            i26 = ((iM31613 ^ i25) * 31827) ^ (-1991907078);
                                            i27 = -1502220779;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr6 = f52501;
                    i17 = 13;
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0773.m3169("᩸ۖ") ^ i13;
                        i = ((iM3169 ^ i14) * (-16939)) ^ 76711690;
                        i2 = -255344558;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    } else {
                        i6 = i21;
                        strM6366 = str;
                        textView = textView2;
                        sArr2 = sArr3;
                        iM2762 = C0619.m2761("᩷ۛ") ^ i14;
                        i7 = ((iM2762 ^ i13) * 14137) ^ 1660078672;
                        i8 = 880561489;
                        int i22 = iM2762 ^ i8;
                        sArr3 = sArr2;
                        textView2 = textView;
                        str = strM6366;
                        i15 = i7;
                        i12 = i6;
                        i16 = i22;
                        i21 = i12;
                    }
                    break;
                case -1571269074:
                case 1525254169:
                    break;
                case -1526551941:
                case 1236956912:
                    C2878.m9491();
                    C1080.m4050();
                    break;
                case -1443352675:
                case 837018827:
                    i18 = 60708;
                    iM31610 = C0619.m2761("ܳ᩷") ^ i14;
                    i15 = ((iM31610 ^ i13) * (-18961)) ^ 627213653;
                    i5 = -316209737;
                    int i23 = iM31610 ^ i5;
                    sArr3 = sArr3;
                    i21 = i21;
                    i16 = i23;
                    textView2 = textView2;
                    this = this;
                    break;
                case -1389268103:
                case 469198214:
                    i21 = i21;
                    textView2 = textView2;
                    sArr3 = sArr3;
                    s = f52501[0];
                    i19 = s * 2;
                    if (C0487.f2131 > 0) {
                        iM31610 = (C0773.m3169("ۖ᩺") ^ i13) * (-51);
                        i15 = ((iM31610 ^ i14) * (-21557)) ^ 179123195;
                        i5 = 2062879599;
                        int i24 = iM31610 ^ i5;
                        sArr3 = sArr3;
                        i21 = i21;
                        i16 = i24;
                        textView2 = textView2;
                        this = this;
                    } else {
                        sArr3 = sArr3;
                        int iM31613 = (i13 - C0773.m3169("ۚ۟")) * 81;
                        i15 = ((iM31613 ^ i14) * (-15319)) ^ (-1864259790);
                        textView2 = textView2;
                        i21 = i21;
                        i16 = iM31613 ^ 136026052;
                        this = this;
                    }
                    break;
                case -1294977375:
                case -16369978:
                    i6 = i21;
                    sArr2 = sArr3;
                    textView = activityC9458.f30670;
                    strM6366 = RunnableC1848.m6366(f52501, 1, 3, i18);
                    if (C2288.m7767()) {
                        iM2762 = C0619.m2761("᩷ۛ") ^ i14;
                        i7 = ((iM2762 ^ i13) * 14137) ^ 1660078672;
                        i8 = 880561489;
                    } else {
                        iM2762 = C0619.m2761("ۢۜ") ^ i14;
                        i7 = ((iM2762 ^ i13) * 5361) ^ 139853021;
                        i8 = 2127591983;
                    }
                    int i25 = iM2762 ^ i8;
                    sArr3 = sArr2;
                    textView2 = textView;
                    str = strM6366;
                    i15 = i7;
                    i12 = i6;
                    i16 = i25;
                    i21 = i12;
                    break;
                case -1288061043:
                case -1268193252:
                    C1343.m4943();
                    iM3169 = C0773.m3169("᩷᩷") ^ i14;
                    i = ((iM3169 ^ i13) * (-3525)) ^ 285342868;
                    i2 = 622230162;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -1070686394:
                case 1467139441:
                    C3033.m9848(c2361, iM31612, onClickListener2);
                    c2361.m8003(new DialogInterface.OnCancelListener() { // from class: l.ܽܶ֫
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C16171 c16171 = null;
                            int i26 = 527514305;
                            int i27 = C1826.f6190;
                            int i28 = C2419.f7754;
                            int iM31614 = C0773.m3169("ܿ۬") ^ i28;
                            int i29 = ((iM31614 ^ i27) * (-28515)) ^ 484783003;
                            int i30 = -701521066;
                            while (true) {
                                i26 = ((((i26 ^ i27) * 22985) >> 31) & i29) ^ (iM31614 ^ i30);
                                switch (i26) {
                                    case -1934608490:
                                    case -1432326565:
                                        if (C2023.f6737) {
                                            iM31614 = C0773.m3169("᩺ۡ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * (-8851)) ^ 177126055;
                                            i30 = 1501005427;
                                        } else {
                                            iM31614 = (C0619.m2761("ܿܽ") ^ i28) * (-21);
                                            i29 = ((iM31614 ^ i27) * 4919) ^ (-797541222);
                                            i30 = 1069786763;
                                        }
                                        break;
                                    case -1712729197:
                                    case -357646432:
                                        if (C1542.m5459() >= 0) {
                                            iM31614 = (C0619.m2761("ܽ֡") + i27) * 59;
                                            i29 = ((iM31614 ^ i28) * 32599) ^ (-220483660);
                                            i30 = 1777694704;
                                        } else {
                                            iM31614 = (C0773.m3169("ۛ᩷") ^ i28) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i29 = ((iM31614 ^ i27) * 9529) ^ (-84254376);
                                            i30 = -818589060;
                                        }
                                        break;
                                    case -1434113090:
                                    case -610073487:
                                        if (C3734.f12817 < 0) {
                                            iM31614 = C0773.m3169("᩺ۡ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * (-8851)) ^ 177126055;
                                            i30 = 1501005427;
                                        } else {
                                            iM31614 = (C0619.m2761("ܽ֡") + i27) * 59;
                                            i29 = ((iM31614 ^ i28) * 32599) ^ (-220483660);
                                            i30 = 1777694704;
                                        }
                                        break;
                                    case -1281913433:
                                    case 998199964:
                                        if (C0773.f2792 <= 0) {
                                            iM31614 = C0773.m3169("᩺ۡ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * (-8851)) ^ 177126055;
                                            i30 = 1501005427;
                                        } else {
                                            iM31614 = C0619.m2761("ۛۜ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * (-16081)) ^ (-314303040);
                                            i30 = -542224260;
                                        }
                                        break;
                                    case -1210689332:
                                    case 1869118450:
                                        if (C3998.f13671 == 0) {
                                            iM31614 = C0773.m3169("ۚۢ") ^ i27;
                                            i29 = ((iM31614 ^ i28) * 18531) ^ (-1648220025);
                                            i30 = -1922553453;
                                        } else {
                                            iM31614 = C0619.m2761("ܳᩴ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * 19149) ^ (-646298221);
                                            i30 = 586290069;
                                        }
                                        break;
                                    case -869875101:
                                    case 1473858199:
                                        if (C2287.f7432 >= 0) {
                                            iM31614 = C0619.m2761("ܳᩴ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * 19149) ^ (-646298221);
                                            i30 = 586290069;
                                        } else {
                                            iM31614 = (C0619.m2761("᩵ۖ") + i27) * (-65);
                                            i29 = ((iM31614 ^ i28) * 31627) ^ 1752094091;
                                            i30 = 1960997351;
                                        }
                                        break;
                                    case -788300706:
                                    case 284265467:
                                        C17202.m40372();
                                        iM31614 = (C0619.m2761("ܽ֡") + i27) * 59;
                                        i29 = ((iM31614 ^ i28) * 32599) ^ (-220483660);
                                        i30 = 1777694704;
                                        break;
                                    case -682377449:
                                    case -459332032:
                                        if (C23916.f77426 <= 0) {
                                            iM31614 = (C0619.m2761("ܽ֡") + i27) * 59;
                                            i29 = ((iM31614 ^ i28) * 32599) ^ (-220483660);
                                            i30 = 1777694704;
                                        } else {
                                            iM31614 = C0619.m2761("ܳܳ") ^ i27;
                                            i29 = ((iM31614 ^ i28) * (-30117)) ^ 1246231972;
                                            i30 = 1603962651;
                                        }
                                        break;
                                    case -662958705:
                                    case -481315322:
                                        C4238.m13537(c16171.f52503);
                                        break;
                                    case -376585924:
                                    case -329795340:
                                        if (C3734.f12817 < 0) {
                                            iM31614 = C0619.m2761("ܳᩴ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * 19149) ^ (-646298221);
                                            i30 = 586290069;
                                        } else {
                                            iM31614 = (C0619.m2761("ܽ֡") + i27) * 59;
                                            i29 = ((iM31614 ^ i28) * 32599) ^ (-220483660);
                                            i30 = 1777694704;
                                        }
                                        break;
                                    case -291564494:
                                    case 337225471:
                                        if (C20932.f66974 <= 0) {
                                            iM31614 = C0773.m3169("ۚۢ") ^ i27;
                                            i29 = ((iM31614 ^ i28) * 18531) ^ (-1648220025);
                                            i30 = -1922553453;
                                        } else {
                                            iM31614 = (i28 - C0619.m2761("֡ۚ")) * (-123);
                                            i29 = ((iM31614 ^ i27) * (-3761)) ^ (-1441656762);
                                            i30 = 1327240237;
                                        }
                                        break;
                                    case -235242089:
                                    case 994881504:
                                        if (C3077.m10041()) {
                                            iM31614 = C0773.m3169("ۧᩳ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * (-15589)) ^ (-262809051);
                                            i30 = -417379820;
                                        } else {
                                            iM31614 = (C0773.m3169("۫᩶") + i27) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i29 = ((iM31614 ^ i28) * (-29057)) ^ 532490659;
                                            i30 = -142578598;
                                        }
                                        break;
                                    case -82494200:
                                    case 686984921:
                                        C2485.m8357();
                                        C2419.m8174();
                                        break;
                                    case 567357528:
                                    case 1128175632:
                                        c16171 = this.f58048;
                                        if (C1343.m4943()) {
                                            iM31614 = C0619.m2761("ᩴۗ") ^ i27;
                                            i29 = ((iM31614 ^ i28) * (-31035)) ^ (-1448602929);
                                            i30 = -1130756981;
                                        } else {
                                            iM31614 = C0773.m3169("ۧᩳ") ^ i28;
                                            i29 = ((iM31614 ^ i27) * (-15589)) ^ (-262809051);
                                            i30 = -417379820;
                                        }
                                        break;
                                    case 1582859601:
                                    case 1857608874:
                                        if (C1519.f5300 >= 0) {
                                            iM31614 = C0773.m3169("ۚۢ") ^ i27;
                                            i29 = ((iM31614 ^ i28) * 18531) ^ (-1648220025);
                                            i30 = -1922553453;
                                        } else {
                                            iM31614 = (i27 - C0773.m3169("᩹۟")) * 67;
                                            i29 = ((iM31614 ^ i28) * 14863) ^ (-645050774);
                                            i30 = -342608139;
                                        }
                                        break;
                                    default:
                                        if (C3998.m12920()) {
                                            iM31614 = (C0619.m2761("ۗ֫") + i28) * (-9);
                                            i29 = ((iM31614 ^ i27) * 30831) ^ 1522973868;
                                            i30 = -681726830;
                                        } else {
                                            iM31614 = (C0619.m2761("ܽ֡") + i27) * 59;
                                            i29 = ((iM31614 ^ i28) * 32599) ^ (-220483660);
                                            i30 = 1777694704;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C3099.m10090(c2361);
                    break;
                case -787433266:
                case 856360349:
                    if (C20932.f66974 <= 0) {
                        i3 = i21;
                        sArr = sArr3;
                        iM2761 = (i13 - C0619.m2761("۟۫")) * 17;
                        i = ((iM2761 ^ i14) * (-7515)) ^ (-542089619);
                        i4 = -753668595;
                        int i26 = iM2761 ^ i4;
                        sArr3 = sArr;
                        i21 = i3;
                        i16 = i26;
                        i15 = i;
                    }
                    iM3169 = C0773.m3169("᩷᩷") ^ i14;
                    i = ((iM3169 ^ i13) * (-3525)) ^ 285342868;
                    i2 = 622230162;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -706907128:
                case 1831887386:
                    TextView textView3 = textView2;
                    sArr3 = sArr3;
                    activityC9458 = this.f52503;
                    int i27 = activityC9458.f30667;
                    i21 = this.f52502;
                    if (i21 != i27) {
                        int iM31614 = (C0773.m3169("ۧۨ") ^ i13) * 33;
                        i16 = iM31614 ^ (-1879454165);
                        i15 = ((iM31614 ^ i14) * 21367) ^ 992177571;
                    } else {
                        int iM2766 = C0619.m2761("᩸᩻") ^ i13;
                        i15 = ((iM2766 ^ i14) * 26061) ^ 1382737361;
                        i16 = iM2766 ^ 1489997350;
                    }
                    textView2 = textView3;
                    break;
                case -432958296:
                case 1704449933:
                    ActivityC9458.m24845(activityC9458, i21, new RunnableC11696(this));
                    break;
                case -339750165:
                case 1795938893:
                    iM2765 = 2124527065 ^ C0619.m2761(C2419.m8166(sArr5, 10, 3, i18));
                    if (C17202.f56030) {
                        iM3169 = (C0619.m2761("ܽ۬") + i14) * (-113);
                        i = ((iM3169 ^ i13) * 19453) ^ (-396657971);
                        i2 = -219742842;
                    } else {
                        iM3169 = (i14 - C0773.m3169("ܽۜ")) * 49;
                        i = ((iM3169 ^ i13) * (-2239)) ^ 2029618685;
                        i2 = 1430799460;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -322778629:
                case 1191216110:
                    C1321.m4857(c2361, iM31611);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩻ܶ֫

                        /* JADX INFO: renamed from: ۬ܰۤ, reason: not valid java name and contains not printable characters */
                        private static final short[] f81246 = {7720, 1126, -758, -5769, -5273, 3525, -13730};

                        /* JADX WARN: Code duplicated, block: B:11:0x0061  */
                        /* JADX WARN: Code duplicated, block: B:30:0x00f6 A[PHI: r4 r5
                          0x00f6: PHI (r4v5 int) = (r4v3 int), (r4v2 int) binds: [B:29:0x00f4, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
                          0x00f6: PHI (r5v5 int) = (r5v3 int), (r5v2 int) binds: [B:29:0x00f4, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:40:0x015b A[PHI: r2 r3
                          0x015b: PHI (r2v5 int) = (r2v4 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:39:0x0159, B:25:0x00cc, B:15:0x0080, B:13:0x007c, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
                          0x015b: PHI (r3v4 java.lang.String) = 
                          (r3v2 java.lang.String)
                          (r3v3 java.lang.String)
                          (r3v2 java.lang.String)
                          (r3v2 java.lang.String)
                          (r3v2 java.lang.String)
                         binds: [B:39:0x0159, B:25:0x00cc, B:15:0x0080, B:13:0x007c, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:60:0x023e A[PHI: r9 r10 r11 r13 r14 r15
                          0x023e: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:59:0x023c, B:43:0x0191, B:21:0x00a3, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
                          0x023e: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:59:0x023c, B:43:0x0191, B:21:0x00a3, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
                          0x023e: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:59:0x023c, B:43:0x0191, B:21:0x00a3, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
                          0x023e: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:59:0x023c, B:43:0x0191, B:21:0x00a3, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
                          0x023e: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:59:0x023c, B:43:0x0191, B:21:0x00a3, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
                          0x023e: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:59:0x023c, B:43:0x0191, B:21:0x00a3, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i28) {
                            int iM2767;
                            int i29;
                            int i30;
                            short[] sArr7;
                            C3493 c3493;
                            int iM31615;
                            int i31;
                            short s2;
                            int i32 = -323457499;
                            int i33 = C0773.f2792;
                            int i34 = C2354.f7599;
                            int iM31616 = (C0773.m3169("ۧۢ") + i33) * (-121);
                            int i35 = ((iM31616 ^ i34) * (-16183)) ^ (-1686514736);
                            int i36 = iM31616 ^ 918329337;
                            String strM44083 = null;
                            short[] sArr8 = null;
                            short[] sArr9 = null;
                            short[] sArr10 = null;
                            short s3 = 0;
                            C3493 c3494 = null;
                            int iM2768 = 0;
                            int iM2769 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            int i43 = 0;
                            int i44 = 0;
                            short s4 = 0;
                            while (true) {
                                i32 = i36 ^ (i35 & (((i32 ^ i34) * 26389) >> 31));
                                switch (i32) {
                                    case -2122749524:
                                    case -56322176:
                                        int i45 = s3 + s4;
                                        i39 = i45 * i45;
                                        i40 = s3 * s3;
                                        i41 = 21939856;
                                        if (C2023.m6964() <= 0) {
                                            iM2767 = C0619.m2761("ۜۨ") ^ i34;
                                            i29 = ((iM2767 ^ i33) * 18309) ^ 370668842;
                                            i30 = 1319132978;
                                        } else {
                                            iM2767 = (C0619.m2761("᩸᩸") ^ i33) * (-71);
                                            i29 = ((iM2767 ^ i34) * (-23971)) ^ 465479721;
                                            i30 = 540000183;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1796629661:
                                    case 1266116838:
                                        ActivityC9458 activityC9459 = this.f81247.f52503;
                                        boolean z = ActivityC9458.f30665;
                                        c3493 = new C3493(activityC9459, activityC9459);
                                        if (C3998.m12920()) {
                                            int iM31617 = C0773.m3169("ۡܶ") ^ i34;
                                            i35 = ((iM31617 ^ i33) * (-24653)) ^ 1901400863;
                                            i36 = iM31617 ^ (-445359781);
                                        } else {
                                            sArr7 = sArr8;
                                            s2 = s3;
                                            int iM27610 = C0619.m2761("ܺ᩺") ^ i34;
                                            sArr8 = sArr7;
                                            i35 = ((iM27610 ^ i33) * (-5605)) ^ 1344818047;
                                            i36 = iM27610 ^ 1839245885;
                                            s3 = s2;
                                        }
                                        c3494 = c3493;
                                        break;
                                    case -1688380127:
                                    case 1781975221:
                                        c3494.m22945(iM2768);
                                        sArr10 = f81246;
                                        i38 = 4;
                                        if (AbstractC0641.f2496 < 0) {
                                            iM2767 = (C0619.m2761("ܿᩴ") + i34) * 87;
                                            i29 = ((iM2767 ^ i33) * (-27637)) ^ 1646593184;
                                            i30 = 1349850563;
                                            i36 = iM2767 ^ i30;
                                            i35 = i29;
                                        } else {
                                            sArr7 = sArr8;
                                            c3493 = c3494;
                                            s2 = s3;
                                            int iM27611 = C0619.m2761("ܺ᩺") ^ i34;
                                            sArr8 = sArr7;
                                            i35 = ((iM27611 ^ i33) * (-5605)) ^ 1344818047;
                                            i36 = iM27611 ^ 1839245885;
                                            s3 = s2;
                                            c3494 = c3493;
                                        }
                                        break;
                                    case -1542648106:
                                    case 1892898435:
                                        C3734.m12152();
                                        if (C23916.f77426 <= 0) {
                                            iM2767 = (C0773.m3169("֨᩷") ^ i33) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i29 = ((iM2767 ^ i34) * 14253) ^ (-408198293);
                                            i30 = 109394990;
                                        } else {
                                            iM2767 = C0619.m2761("ۜۨ") ^ i34;
                                            i29 = ((iM2767 ^ i33) * 18309) ^ 370668842;
                                            i30 = 1319132978;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1483718103:
                                    case 2057476407:
                                        iM2768 = 2101272460 ^ C0619.m2761(RunnableC3055.m9937(sArr9, i43, i44, i42));
                                        if (C2023.f6737) {
                                            iM2767 = (C0773.m3169("֨᩷") ^ i33) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i29 = ((iM2767 ^ i34) * 14253) ^ (-408198293);
                                            i30 = 109394990;
                                        } else {
                                            iM2767 = C0619.m2761("ۜ۟") ^ i33;
                                            i29 = ((iM2767 ^ i34) * (-453)) ^ (-1573883574);
                                            i30 = 413690783;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1335012310:
                                    case -372289769:
                                        i42 = 38056;
                                        iM2767 = C0773.m3169("ۚۧ") ^ i34;
                                        i29 = ((iM2767 ^ i33) * 27945) ^ 381829905;
                                        i30 = -619201989;
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1304637560:
                                    case -490618312:
                                        C3077.m10041();
                                        if (RunnableC0334.f1808 > 0) {
                                            iM2767 = (C0773.m3169("֨᩷") ^ i33) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i29 = ((iM2767 ^ i34) * 14253) ^ (-408198293);
                                            i30 = 109394990;
                                        } else {
                                            iM2767 = C0619.m2761("֡ܺ") ^ i33;
                                            i29 = ((iM2767 ^ i34) * (-23963)) ^ (-696066347);
                                            i30 = 38640531;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1299415813:
                                    case -741318784:
                                        short s5 = sArr8[0];
                                        s4 = 4684;
                                        if (!C3099.m10095()) {
                                            iM31615 = C0619.m2761("۫ܶ") ^ i34;
                                            s3 = s5;
                                            i35 = ((iM31615 ^ i33) * (-32687)) ^ 26633246;
                                            i31 = 1824801723;
                                            i36 = iM31615 ^ i31;
                                        } else {
                                            c3493 = c3494;
                                            s2 = s5;
                                            sArr7 = sArr8;
                                            int iM27612 = C0619.m2761("ܺ᩺") ^ i34;
                                            sArr8 = sArr7;
                                            i35 = ((iM27612 ^ i33) * (-5605)) ^ 1344818047;
                                            i36 = iM27612 ^ 1839245885;
                                            s3 = s2;
                                            c3494 = c3493;
                                        }
                                        break;
                                    case -1065645469:
                                    case -493343940:
                                        c3494.m22929(iM2769 ^ i37);
                                        strM44083 = C18978.m44083();
                                        if (C2966.m9664()) {
                                            iM2767 = C0773.m3169("ۧ֡") ^ i34;
                                            i29 = ((iM2767 ^ i33) * 21601) ^ (-991201445);
                                            i30 = -2056835004;
                                        } else {
                                            iM2767 = (C0773.m3169("֨᩷") ^ i33) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i29 = ((iM2767 ^ i34) * 14253) ^ (-408198293);
                                            i30 = 109394990;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -944555594:
                                    case -552092136:
                                        i42 = 42565;
                                        iM2767 = C0773.m3169("ۚۧ") ^ i34;
                                        i29 = ((iM2767 ^ i33) * 27945) ^ 381829905;
                                        i30 = -619201989;
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -825494051:
                                    case 93585144:
                                        C3077.m10041();
                                        C13473.m33144();
                                        break;
                                    case -755163194:
                                    case -441800617:
                                        c3494.m22959();
                                        c3494.m22955(true);
                                        break;
                                    case -557806290:
                                    case 1198627597:
                                        C3033.m9845();
                                        C23916.m53419();
                                        iM2767 = (C0773.m3169("֨᩷") ^ i33) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                        i29 = ((iM2767 ^ i34) * 14253) ^ (-408198293);
                                        i30 = 109394990;
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -468974747:
                                    case 838704857:
                                        sArr7 = f81246;
                                        if (C11235.f35427 < 0) {
                                            iM31615 = C0773.m3169("᩸֡") ^ i33;
                                            sArr8 = sArr7;
                                            i35 = ((iM31615 ^ i34) * 29359) ^ (-1748022133);
                                            i31 = -1072611717;
                                            i36 = iM31615 ^ i31;
                                        } else {
                                            c3493 = c3494;
                                            s2 = s3;
                                            int iM27613 = C0619.m2761("ܺ᩺") ^ i34;
                                            sArr8 = sArr7;
                                            i35 = ((iM27613 ^ i33) * (-5605)) ^ 1344818047;
                                            i36 = iM27613 ^ 1839245885;
                                            s3 = s2;
                                            c3494 = c3493;
                                        }
                                        break;
                                    case -333105522:
                                    case 1083015632:
                                        iM2769 = C0619.m2761(C3033.m9847(sArr10, i38, 3, i42));
                                        i37 = 2128656753;
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2767 = C0773.m3169("۟ᩴ") ^ i33;
                                            i29 = ((iM2767 ^ i34) * (-11467)) ^ 1813931020;
                                            i30 = -1063102380;
                                        } else {
                                            iM2767 = C0773.m3169("᩹֡") ^ i33;
                                            i29 = ((iM2767 ^ i34) * (-24461)) ^ (-644013412);
                                            i30 = -1293498238;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case 352838222:
                                    case 1133557462:
                                        c3494.m22924((CharSequence) strM44083);
                                        c3494.m22918();
                                        c3494.m22957(6);
                                        if (C4238.f15451 >= 0) {
                                            iM2767 = C0619.m2761("ۜۨ") ^ i34;
                                            i29 = ((iM2767 ^ i33) * 18309) ^ 370668842;
                                            i30 = 1319132978;
                                        } else {
                                            iM2767 = (C0773.m3169("᩷ۘ") ^ i34) * 95;
                                            i29 = ((iM2767 ^ i33) * (-20307)) ^ 360240959;
                                            i30 = 1902474200;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case 373960598:
                                    case 1282232562:
                                        int i46 = i40 + i41;
                                        if ((i46 + i46) - i39 >= 0) {
                                            iM2767 = (C0619.m2761("ܳ᩹") + i34) * (-77);
                                            i29 = ((iM2767 ^ i33) * 3525) ^ 623241834;
                                            i30 = 2065516501;
                                        } else {
                                            iM2767 = C0619.m2761("۫᩻") ^ i33;
                                            i29 = ((iM2767 ^ i34) * (-5413)) ^ 1211451229;
                                            i30 = -1383516607;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    case 1009319813:
                                    case 1964281022:
                                        sArr9 = f81246;
                                        i43 = 1;
                                        i44 = 3;
                                        if (C20932.m47848() != 0) {
                                            iM2767 = C0619.m2761("ۜۨ") ^ i34;
                                            i29 = ((iM2767 ^ i33) * 18309) ^ 370668842;
                                            i30 = 1319132978;
                                        } else {
                                            iM2767 = C0773.m3169("ۡ᩸") ^ i33;
                                            i29 = ((iM2767 ^ i34) * (-16535)) ^ (-1457643232);
                                            i30 = -720448201;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                    default:
                                        C3448.m11248();
                                        if (C2287.f7432 < 0) {
                                            iM2767 = C0619.m2761("֡ܺ") ^ i33;
                                            i29 = ((iM2767 ^ i34) * (-23963)) ^ (-696066347);
                                            i30 = 38640531;
                                        } else {
                                            iM2767 = C0773.m3169("۟ᩴ") ^ i33;
                                            i29 = ((iM2767 ^ i34) * (-11467)) ^ 1813931020;
                                            i30 = -1063102380;
                                        }
                                        i36 = iM2767 ^ i30;
                                        i35 = i29;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr5 = f52501;
                    if (C13473.f42873 != 0) {
                        iM3169 = (i14 - C0773.m3169("ܽۜ")) * 49;
                        i = ((iM3169 ^ i13) * (-2239)) ^ 2029618685;
                        i2 = 1430799460;
                    } else {
                        iM3169 = (i13 - C0619.m2761("ۘᩳ")) * 9;
                        i = ((iM3169 ^ i14) * 12635) ^ 352259406;
                        i2 = -784104742;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -262829361:
                case 452950059:
                    if (C3448.f11240 >= 0) {
                        i6 = i21;
                        strM6366 = str;
                        textView = textView2;
                        sArr2 = sArr3;
                        iM2762 = C0619.m2761("᩷ۛ") ^ i14;
                        i7 = ((iM2762 ^ i13) * 14137) ^ 1660078672;
                        i8 = 880561489;
                        int i28 = iM2762 ^ i8;
                        sArr3 = sArr2;
                        textView2 = textView;
                        str = strM6366;
                        i15 = i7;
                        i12 = i6;
                        i16 = i28;
                        i21 = i12;
                    } else {
                        iM3169 = C0773.m3169("᩷᩷") ^ i14;
                        i = ((iM3169 ^ i13) * (-3525)) ^ 285342868;
                        i2 = 622230162;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    }
                    break;
                case -130630374:
                case 1996124853:
                    i18 = 59745;
                    iM31610 = C0619.m2761("ܳ᩷") ^ i14;
                    i15 = ((iM31610 ^ i13) * (-18961)) ^ 627213653;
                    i5 = -316209737;
                    int i29 = iM31610 ^ i5;
                    sArr3 = sArr3;
                    i21 = i21;
                    i16 = i29;
                    textView2 = textView2;
                    this = this;
                    break;
                case -20498404:
                case 1235917190:
                    i21 = i21;
                    short[] sArr7 = sArr3;
                    TextView textView4 = textView2;
                    C2023.m6954(textView4, C0773.m3169(str) ^ 2122826382);
                    if (C7685.m20925()) {
                        iM2763 = (C0773.m3169("᩶ᩴ") + i13) * (-109);
                        i9 = ((iM2763 ^ i14) * (-30481)) ^ (-438051068);
                        i10 = -1233944242;
                    } else {
                        iM2763 = C0619.m2761("ܽ۟") ^ i14;
                        i9 = ((iM2763 ^ i13) * 7857) ^ (-671641781);
                        i10 = -1041155853;
                    }
                    i11 = iM2763 ^ i10;
                    sArr3 = sArr7;
                    textView2 = textView4;
                    i12 = i21;
                    i16 = i11;
                    i15 = i9;
                    i21 = i12;
                    break;
                case 360004365:
                case 450366600:
                    iM31612 = 2127632528 ^ C0773.m3169(C2310.m7803(sArr6, i17, 3, i18));
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i14 - C0773.m3169("ܽۜ")) * 49;
                        i = ((iM3169 ^ i13) * (-2239)) ^ 2029618685;
                        i2 = 1430799460;
                    } else {
                        iM3169 = C0619.m2761("۠֨") ^ i14;
                        i = ((iM3169 ^ i13) * (-10953)) ^ 1178253028;
                        i2 = 1077533575;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case 491722935:
                case 647222031:
                    i21 = i21;
                    textView2 = textView2;
                    sArr3 = sArr3;
                    int i30 = s + 1;
                    if ((i30 * i30) - (i19 + 1) < 0) {
                        iM31610 = C0619.m2761("ܿ᩻") ^ i13;
                        i15 = ((iM31610 ^ i14) * 14997) ^ (-650254390);
                        i5 = 304787842;
                    } else {
                        iM31610 = C0773.m3169("ۗܳ") ^ i14;
                        i15 = ((iM31610 ^ i13) * 31699) ^ (-1637574219);
                        i5 = -1309367810;
                    }
                    int i210 = iM31610 ^ i5;
                    sArr3 = sArr3;
                    i21 = i21;
                    i16 = i210;
                    textView2 = textView2;
                    this = this;
                    break;
                case 984101356:
                case 1105609144:
                    i21 = i21;
                    int i31 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(activityC9458);
                    sArr3 = f52501;
                    if (C1321.f4751 < 0) {
                        int iM31615 = C0773.m3169("᩸ۙ") ^ i13;
                        i9 = ((iM31615 ^ i14) * 16963) ^ (-855944060);
                        i11 = iM31615 ^ (-1998301544);
                        i12 = i21;
                        i16 = i11;
                        i15 = i9;
                        i21 = i12;
                    } else {
                        textView2 = textView2;
                        int iM31616 = (i13 - C0773.m3169("ۚ۟")) * 81;
                        i15 = ((iM31616 ^ i14) * (-15319)) ^ (-1864259790);
                        textView2 = textView2;
                        i21 = i21;
                        i16 = iM31616 ^ 136026052;
                        this = this;
                    }
                    break;
                case 1159483152:
                case 1939945092:
                    iM31611 = 2121893810 ^ C0773.m3169(C3779.m12266(sArr4, 7, 3, i18));
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i14 - C0773.m3169("ܽۜ")) * 49;
                        i = ((iM3169 ^ i13) * (-2239)) ^ 2029618685;
                        i2 = 1430799460;
                    } else {
                        iM3169 = C0773.m3169("֨ۚ") ^ i13;
                        i = ((iM3169 ^ i14) * 10765) ^ (-24250202);
                        i2 = -1390624168;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case 1267615037:
                case 1660656253:
                    i3 = i21;
                    sArr = sArr3;
                    strM6310 = C1826.m6310(sArr, 4, 3, i18);
                    if (C4282.f15546 <= 0) {
                        iM2761 = (i13 - C0619.m2761("۟۫")) * 17;
                        i = ((iM2761 ^ i14) * (-7515)) ^ (-542089619);
                        i4 = -753668595;
                    } else {
                        iM2761 = C0619.m2761("ۨۤ") ^ i14;
                        i = ((iM2761 ^ i13) * 16329) ^ (-352677493);
                        i4 = -1486743779;
                    }
                    int i211 = iM2761 ^ i4;
                    sArr3 = sArr;
                    i21 = i3;
                    i16 = i211;
                    i15 = i;
                    break;
                case 1489910549:
                case 1676150413:
                    if (C1519.f5300 >= 0) {
                        i21 = i21;
                        textView2 = textView2;
                        int iM31617 = (i13 - C0773.m3169("ۚ۟")) * 81;
                        i15 = ((iM31617 ^ i14) * (-15319)) ^ (-1864259790);
                        textView2 = textView2;
                        i21 = i21;
                        i16 = iM31617 ^ 136026052;
                        this = this;
                    } else {
                        i6 = i21;
                        strM6366 = str;
                        textView = textView2;
                        sArr2 = sArr3;
                        iM2762 = C0619.m2761("᩷ۛ") ^ i14;
                        i7 = ((iM2762 ^ i13) * 14137) ^ 1660078672;
                        i8 = 880561489;
                        int i212 = iM2762 ^ i8;
                        sArr3 = sArr2;
                        textView2 = textView;
                        str = strM6366;
                        i15 = i7;
                        i12 = i6;
                        i16 = i212;
                        i21 = i12;
                    }
                    break;
                default:
                    C13473.m33136(c2361, C0619.m2761(strM6310) ^ 2119592751);
                    sArr4 = f52501;
                    if (C1542.f5343 > 0) {
                        iM3169 = (C0773.m3169("۟ܰ") + i14) * (-127);
                        i = ((iM3169 ^ i13) * (-1563)) ^ 793636962;
                        i2 = 919015978;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    } else {
                        i6 = i21;
                        strM6366 = str;
                        textView = textView2;
                        sArr2 = sArr3;
                        iM2762 = C0619.m2761("᩷ۛ") ^ i14;
                        i7 = ((iM2762 ^ i13) * 14137) ^ 1660078672;
                        i8 = 880561489;
                        int i213 = iM2762 ^ i8;
                        sArr3 = sArr2;
                        textView2 = textView;
                        str = strM6366;
                        i15 = i7;
                        i12 = i6;
                        i16 = i213;
                        i21 = i12;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0149 A[PHI: r5
      0x0149: PHI (r5v7 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v2 java.lang.String) binds: [B:41:0x0147, B:6:0x0055, B:95:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0230 A[PHI: r9 r10
      0x0230: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:60:0x022e, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r10v4 short) = (r10v3 short), (r10v2 short) binds: [B:60:0x022e, B:12:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0262 A[PHI: r3 r4 r6 r8 r15
      0x0262: PHI (r3v4 android.widget.TextView) = 
      (r3v2 android.widget.TextView)
      (r3v3 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v2 android.widget.TextView)
     binds: [B:64:0x0260, B:37:0x0121, B:32:0x00e7, B:24:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r4v3 android.widget.TextView) = 
      (r4v2 android.widget.TextView)
      (r4v2 android.widget.TextView)
      (r4v2 android.widget.TextView)
      (r4v4 android.widget.TextView)
     binds: [B:64:0x0260, B:37:0x0121, B:32:0x00e7, B:24:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x0260, B:37:0x0121, B:32:0x00e7, B:24:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r8v4 char) = (r8v3 char), (r8v2 char), (r8v2 char), (r8v2 char) binds: [B:64:0x0260, B:37:0x0121, B:32:0x00e7, B:24:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:64:0x0260, B:37:0x0121, B:32:0x00e7, B:24:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        int iM3169;
        int i;
        int i2;
        short[] sArr;
        C16171 c16171 = this;
        int i3 = C23916.f77426;
        int i4 = C3690.f12684;
        int iM2761 = C0619.m2761("ᩴۨ") ^ i4;
        int i5 = ((iM2761 ^ i3) * 295) ^ (-1215757150);
        String strM12149 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2761 ^ (-813566833);
        int iM2762 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -69489030;
        TextView textView = null;
        TextView textView2 = null;
        ActivityC9458 activityC9458 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 25245) >> 31));
            switch (i11) {
                case -2141359962:
                case 278537054:
                    C2485.m8358(activityC9458.f30670, 0);
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0619.m2761("ۨۨ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6343)) ^ (-750288933);
                        i2 = -992349791;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۠᩸")) * 45;
                        i = ((iM3169 ^ i4) * (-6383)) ^ 1719369115;
                        i2 = 671867241;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2140238218:
                case -403232409:
                    iM2762 = C0619.m2761(strM12149);
                    if (C2485.m8357() <= 0) {
                        iM3169 = (i3 - C0619.m2761("ۡ᩸")) * (-105);
                        i = ((iM3169 ^ i4) * 19739) ^ 128188410;
                        i2 = -1860655835;
                    } else {
                        iM3169 = (C0619.m2761("ۖ᩷") + i4) * (-31);
                        i = ((iM3169 ^ i3) * (-21249)) ^ 320874598;
                        i2 = -1612735349;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2139509073:
                case -2021267105:
                    C2485.m8357();
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ᩴۤ")) * 13;
                        i = ((iM3169 ^ i4) * (-13039)) ^ (-1150909164);
                        i2 = 64883735;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM31610 = (i4 - C0773.m3169("ۙܿ")) * (-63);
                        i6 = iM31610 ^ (-1441677772);
                        sArr2 = sArr;
                        i5 = ((iM31610 ^ i3) * 16229) ^ (-494252749);
                        c16171 = this;
                    }
                    break;
                case -1783736102:
                case -1077242053:
                    i10 = 45979;
                    iM3169 = (C0773.m3169("ܿۡ") ^ i4) * 87;
                    i = ((iM3169 ^ i3) * 28409) ^ 790635099;
                    i2 = -74981704;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1667451509:
                case 436713712:
                    break;
                case -1622513546:
                case 1916971189:
                    activityC9458 = c16171.f52503;
                    if (c16171.f52502 != activityC9458.f30667) {
                        iM3169 = C0619.m2761("ۛܶ") ^ i3;
                        i = ((iM3169 ^ i4) * (-22541)) ^ (-2090319252);
                        i2 = -1501610586;
                    } else {
                        iM3169 = C0773.m3169("᩶᩶") ^ i3;
                        i = ((iM3169 ^ i4) * (-14893)) ^ 1970527610;
                        i2 = -1161990672;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1549431165:
                case -21017479:
                    AbstractC0641.m2813();
                    sArr = sArr2;
                    int iM31611 = (i4 - C0773.m3169("ۙܿ")) * (-63);
                    i6 = iM31611 ^ (-1441677772);
                    sArr2 = sArr;
                    i5 = ((iM31611 ^ i3) * 16229) ^ (-494252749);
                    c16171 = this;
                    break;
                case -1523000186:
                case -1295864386:
                    if (i7 - (i8 + i9) <= 0) {
                        iM3169 = C0773.m3169("᩵ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * 7973) ^ 1361398730;
                        i2 = 1977903552;
                    } else {
                        iM3169 = C0773.m3169("ܳܳ") ^ i3;
                        i = ((iM3169 ^ i4) * (-14611)) ^ (-970146497);
                        i2 = -2060901683;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1474718011:
                case 1212001452:
                    C3998.m12920();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("ۨۨ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6343)) ^ (-750288933);
                        i2 = -992349791;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM31612 = (i4 - C0773.m3169("ۙܿ")) * (-63);
                        i6 = iM31612 ^ (-1441677772);
                        sArr2 = sArr;
                        i5 = ((iM31612 ^ i3) * 16229) ^ (-494252749);
                        c16171 = this;
                    }
                    break;
                case -1027254387:
                case 1964545956:
                    i7 = s * s2;
                    i8 = s * s;
                    i9 = 4739329;
                    if (C2878.m9491() > 0) {
                        iM3169 = (C0619.m2761("᩷ܺ") + i3) * 47;
                        i = ((iM3169 ^ i4) * (-28145)) ^ 579454049;
                        i2 = 1654056649;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM31613 = (i4 - C0773.m3169("ۙܿ")) * (-63);
                        i6 = iM31613 ^ (-1441677772);
                        sArr2 = sArr;
                        i5 = ((iM31613 ^ i3) * 16229) ^ (-494252749);
                        c16171 = this;
                    }
                    break;
                case -871343517:
                case 1446558302:
                    C2375.m8070(textView, new ViewOnClickListenerC9087(1, c16171));
                    break;
                case -549147615:
                case 675893614:
                    C3779.m12264();
                    break;
                case -253914538:
                case 758464061:
                    c = 16;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۡ᩸")) * (-105);
                        i = ((iM3169 ^ i4) * 19739) ^ 128188410;
                        i2 = -1860655835;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܶ۫")) * 21;
                        i = ((iM3169 ^ i4) * (-3877)) ^ 1749759143;
                        i2 = -167103807;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -244216037:
                case -185888265:
                    sArr = f52501;
                    if (AbstractC3624.f12429 > 0) {
                        int iM2763 = (i4 - C0619.m2761("ۜ۠")) * (-93);
                        i = ((iM2763 ^ i3) * 127) ^ (-1289078763);
                        i6 = iM2763 ^ 214286633;
                        c16171 = this;
                        sArr2 = sArr;
                        i5 = i;
                    } else {
                        int iM31614 = (i4 - C0773.m3169("ۙܿ")) * (-63);
                        i6 = iM31614 ^ (-1441677772);
                        sArr2 = sArr;
                        i5 = ((iM31614 ^ i3) * 16229) ^ (-494252749);
                        c16171 = this;
                    }
                    break;
                case -219667088:
                case 1259606949:
                    i10 = 15115;
                    iM3169 = (C0773.m3169("ܿۡ") ^ i4) * 87;
                    i = ((iM3169 ^ i3) * 28409) ^ 790635099;
                    i2 = -74981704;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -97882687:
                case 1778537948:
                    if (C1146.f4234 < 0) {
                        iM3169 = (i3 - C0619.m2761("ᩴۤ")) * 13;
                        i = ((iM3169 ^ i4) * (-13039)) ^ (-1150909164);
                        i2 = 64883735;
                    } else {
                        iM3169 = C0773.m3169("ܽۘ") ^ i4;
                        i = ((iM3169 ^ i3) * (-21367)) ^ (-1685061307);
                        i2 = -1183428860;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -5133526:
                case 560285061:
                    C1080.m4060(textView2, 2099832759 ^ iM2762);
                    if (C0950.f3488 < 0) {
                        iM3169 = C0619.m2761("֫᩸") ^ i4;
                        i = ((iM3169 ^ i3) * (-23755)) ^ (-1344802280);
                        i2 = 1324900013;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM31615 = (i4 - C0773.m3169("ۙܿ")) * (-63);
                        i6 = iM31615 ^ (-1441677772);
                        sArr2 = sArr;
                        i5 = ((iM31615 ^ i3) * 16229) ^ (-494252749);
                        c16171 = this;
                    }
                    break;
                case 580436340:
                case 750082532:
                    s = sArr2[c];
                    s2 = 4354;
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ܽۘ") ^ i4;
                        i = ((iM3169 ^ i3) * (-21367)) ^ (-1685061307);
                        i2 = -1183428860;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܿۗ")) * (-57);
                        i = ((iM3169 ^ i3) * 31043) ^ 1324239811;
                        i2 = -1995346692;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1502324338:
                case 1908437711:
                    textView2 = activityC9458.f30670;
                    sArr3 = f52501;
                    if (C13473.f42873 != 0) {
                        iM3169 = (i3 - C0619.m2761("ۡ᩸")) * (-105);
                        i = ((iM3169 ^ i4) * 19739) ^ 128188410;
                        i2 = -1860655835;
                    } else {
                        iM3169 = C0619.m2761("᩻᩺") ^ i4;
                        i = ((iM3169 ^ i3) * (-27741)) ^ 2001641717;
                        i2 = -1004826026;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1734963631:
                case 1879823840:
                    textView = activityC9458.f30670;
                    if (C11235.m28309() != 0) {
                        iM3169 = (i3 - C0619.m2761("ۡ᩸")) * (-105);
                        i = ((iM3169 ^ i4) * 19739) ^ 128188410;
                        i2 = -1860655835;
                    } else {
                        iM3169 = C0619.m2761("ۚ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 32753) ^ (-616638025);
                        i2 = 1826293524;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM12149 = C3734.m12149(sArr3, 17, 3, i10);
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ۨۨ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6343)) ^ (-750288933);
                        i2 = -992349791;
                    } else {
                        iM3169 = C0773.m3169("ܽܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-14559)) ^ (-669679084);
                        i2 = -585851550;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
