package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F2T1 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC9458 extends AbstractActivityC17204 implements InterfaceC17242 {

    /* JADX INFO: renamed from: ۢۙ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f30664 = {9842, 9731, -11343, 16184, 12850, -8593, 13413, 13159, -13880, 14653, 12543, -11247, -14640, 14959, 12803, 14737, 4541, 13724, 9771, 13567, -12015, 11359, 3878, -4270, 14478, 507, 2249, -17769, -23470, -23269, -23494, -20605, -30528, -9387, -9382, -9392, -9402, -9381, -9379, -9392, -9446, -9379, -9382, -9408, -9391, -9382, -9408, -9446, -9387, -9385, -9408, -9379, -9381, -9382, -9446, -9374, -9347, -9359, -9373, -9392, -9391, -9406, -9391, -9384, -9381, -9404, -9391, -9402, -9372, -9384, -9407, -9389, -9379, -9382, -9347, -9392, -9401, -16838, 22321, -21486, 5659, 31989, 31956, 31943, 31956, 31965, 31966, 31937, 31956, 31939, 31986, 31956, 31967, 31941, 31956, 31939, 31984, 31954, 31941, 31960, 31943, 31960, 31941, 31944};

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public static boolean f30665;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C5817 f30666;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f30667;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C3072 f30668;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public long f30669;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public TextView f30670;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f30671;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C12442 f30672;

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        int i = -1299659078;
        int i2 = C4282.f15546;
        int i3 = C2419.f7754;
        int iM2761 = C0619.m2761("᩷۟") ^ i3;
        int i4 = ((iM2761 ^ i2) * 14357) ^ (-478124538);
        int i5 = 2085683871;
        while (true) {
            i = ((((i ^ i2) * 11189) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1968620822:
                case 1063408478:
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۨ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13149)) ^ 1231749310;
                        i5 = 434376515;
                    } else {
                        iM2761 = C0619.m2761("᩺ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-827)) ^ 588583988;
                        i5 = 692580825;
                    }
                    break;
                case -1936128345:
                case 1107165450:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("᩺ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-827)) ^ 588583988;
                        i5 = 692580825;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩻ܿ")) * 49;
                        i4 = ((iM2761 ^ i2) * (-12579)) ^ 430532232;
                        i5 = 1339380125;
                    }
                    break;
                case -1692624779:
                case 1452313521:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("۬᩷") ^ i2) * 13;
                        i4 = ((iM2761 ^ i3) * 30087) ^ 147120938;
                        i5 = 99148954;
                    } else {
                        iM2761 = (C0773.m3169("ܺᩳ") ^ i3) * (-29);
                        i4 = ((iM2761 ^ i2) * (-11595)) ^ 242667065;
                        i5 = -1107532372;
                    }
                    break;
                case -1590490164:
                case 649201400:
                    C0487.m2356();
                    if (C0269.m1775() > 0) {
                        iM2761 = (C0619.m2761("ܶ᩻") ^ i3) * 25;
                        i4 = ((iM2761 ^ i2) * 14841) ^ 880533138;
                        i5 = -1387571250;
                    } else {
                        iM2761 = C0619.m2761("ۨ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13149)) ^ 1231749310;
                        i5 = 434376515;
                    }
                    break;
                case -1531871879:
                case -17856711:
                    C3690.m11987();
                    iM2761 = C0619.m2761("ۨ۟") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-13149)) ^ 1231749310;
                    i5 = 434376515;
                    break;
                case -1415705441:
                case -455225247:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("᩺ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-827)) ^ 588583988;
                        i5 = 692580825;
                    } else {
                        iM2761 = C0773.m3169("᩹᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12275)) ^ (-664301989);
                        i5 = 1501355436;
                    }
                    break;
                case -1370872793:
                case 1028091041:
                    C3779.m12264();
                    C0950.m3785();
                    break;
                case -1274851483:
                case 1336288385:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ܶ᩻") ^ i3) * 25;
                        i4 = ((iM2761 ^ i2) * 14841) ^ 880533138;
                        i5 = -1387571250;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܽ") ^ i2) * 15;
                        i4 = ((iM2761 ^ i3) * 13765) ^ (-418024319);
                        i5 = 1187070029;
                    }
                    break;
                case -1264841630:
                case -643689700:
                    C2485.m8357();
                    if (C1321.f4751 < 0) {
                        iM2761 = (C0619.m2761("ۤܰ") + i2) * 93;
                        i4 = ((iM2761 ^ i3) * (-19333)) ^ (-471856935);
                        i5 = 1890513891;
                    } else {
                        iM2761 = C0619.m2761("᩺ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-827)) ^ 588583988;
                        i5 = 692580825;
                    }
                    break;
                case -365434704:
                case 931287253:
                    if (f30665) {
                        iM2761 = C0773.m3169("֨֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10959) ^ (-1069849172);
                        i5 = 1297718064;
                    } else {
                        iM2761 = (C0619.m2761("ۜ᩻") ^ i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-8245)) ^ 814638525;
                        i5 = 1302976488;
                    }
                    break;
                case -314351028:
                case 1646634067:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("᩺ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-827)) ^ 588583988;
                        i5 = 692580825;
                    } else {
                        iM2761 = (C0773.m3169("᩸᩺") ^ i2) * (-117);
                        i4 = ((iM2761 ^ i3) * (-12339)) ^ 2054430991;
                        i5 = 350408396;
                    }
                    break;
                case -198838179:
                case 1397382392:
                    super.onResume();
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ۨ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13149)) ^ 1231749310;
                        i5 = 434376515;
                    } else {
                        iM2761 = C0619.m2761("᩻᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20695) ^ (-1522685308);
                        i5 = -1472596270;
                    }
                    break;
                case -111482270:
                case 1671856926:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("᩺ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-827)) ^ 588583988;
                        i5 = 692580825;
                    } else {
                        iM2761 = (C0619.m2761("ۜۘ") + i2) * 87;
                        i4 = ((iM2761 ^ i3) * 15847) ^ 2108450565;
                        i5 = -663843880;
                    }
                    break;
                case 12144408:
                case 1778028837:
                    mo4897();
                    iM2761 = (C0619.m2761("ۜ᩻") ^ i3) * 87;
                    i4 = ((iM2761 ^ i2) * (-8245)) ^ 814638525;
                    i5 = 1302976488;
                    break;
                case 284884084:
                case 1368971547:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("ۨ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13149)) ^ 1231749310;
                        i5 = 434376515;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14953)) ^ 142456394;
                        i5 = -942601706;
                    }
                    break;
                case 757662539:
                case 1788122532:
                    break;
                case 1481853004:
                case 1806717755:
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0619.m2761("ۤܰ") + i2) * 93;
                        i4 = ((iM2761 ^ i3) * (-19333)) ^ (-471856935);
                        i5 = 1890513891;
                    } else {
                        iM2761 = C0773.m3169("ۨᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26113) ^ (-770251252);
                        i5 = 1183247306;
                    }
                    break;
                default:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("ܶ᩻") ^ i3) * 25;
                        i4 = ((iM2761 ^ i2) * 14841) ^ 880533138;
                        i5 = -1387571250;
                    } else {
                        iM2761 = C0773.m3169("᩷ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-21857)) ^ 1004036342;
                        i5 = -473650703;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24838(ActivityC9458 activityC9458, String str, int i) {
        int iM24839 = 0;
        int i2 = -1204420521;
        int i3 = C1826.f6190;
        int i4 = C1564.f5401;
        int iM2761 = C0619.m2761("֡ܽ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 3197) ^ (-1341439714);
        int i6 = 1682721108;
        while (true) {
            i2 = ((((i2 ^ i4) * (-25871)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2106092084:
                case 984446200:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ۗۙ") + i4) * (-33);
                        i5 = ((iM2761 ^ i3) * (-5713)) ^ (-318784736);
                        i6 = 1961180269;
                    } else {
                        iM2761 = C0619.m2761("᩺ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 17123) ^ (-1799255255);
                        i6 = -265440731;
                    }
                    break;
                case -2068561124:
                case 1772405036:
                    C1080.m4050();
                    C3099.m10095();
                    iM2761 = (C0773.m3169("ۗۙ") + i4) * (-33);
                    i5 = ((iM2761 ^ i3) * (-5713)) ^ (-318784736);
                    i6 = 1961180269;
                    break;
                case -1978068391:
                case 11128591:
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("ۗۙ") + i4) * (-33);
                        i5 = ((iM2761 ^ i3) * (-5713)) ^ (-318784736);
                        i6 = 1961180269;
                    } else {
                        iM2761 = (C0619.m2761("ۖ۬") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM2761 ^ i4) * 3887) ^ (-148510789);
                        i6 = 25983223;
                    }
                    break;
                case -1940784365:
                case -63670018:
                    ((C11192) C1542.m5457(activityC9458.f30671, iM24839)).m28230(i);
                    iM2761 = C0773.m3169("ۚ᩷") ^ i4;
                    i5 = ((iM2761 ^ i3) * 32091) ^ (-1473761327);
                    i6 = -2134751065;
                    break;
                case -1798586942:
                case 1585302167:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ܺ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-31703)) ^ 1620190609;
                        i6 = -892967788;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢܿ")) * 45;
                        i5 = ((iM2761 ^ i4) * (-17587)) ^ 1164865125;
                        i6 = 485431174;
                    }
                    break;
                case -1712785925:
                case 1676322695:
                    if (C17202.m40372()) {
                        iM2761 = (i4 - C0619.m2761("ۜᩳ")) * 5;
                        i5 = ((iM2761 ^ i3) * (-4289)) ^ 692733044;
                        i6 = -1727168685;
                    } else {
                        iM2761 = C0773.m3169("ܳ֨") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21657)) ^ 971267295;
                        i6 = 1082412824;
                    }
                    break;
                case -1597223036:
                case -336788260:
                    if (C17202.m40372()) {
                        iM2761 = (C0773.m3169("۫ۧ") ^ i4) * 91;
                        i5 = ((iM2761 ^ i3) * (-29069)) ^ 2063974234;
                        i6 = 1704110128;
                    } else {
                        iM2761 = C0773.m3169("ܳ֨") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21657)) ^ 971267295;
                        i6 = 1082412824;
                    }
                    break;
                case -1577380098:
                case -33570209:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ܺ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-31703)) ^ 1620190609;
                        i6 = -892967788;
                    } else {
                        iM2761 = C0773.m3169("᩵֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * 25903) ^ (-161419254);
                        i6 = 58025485;
                    }
                    break;
                case -1336844160:
                case 1576142074:
                    C1146.m4231();
                    if (!C13473.m33144()) {
                        iM2761 = (i3 - C0619.m2761("۬᩷")) * 109;
                        i5 = ((iM2761 ^ i4) * 28041) ^ (-1124002830);
                        i6 = -1855999800;
                    } else {
                        iM2761 = C0773.m3169("ۡۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-18613)) ^ (-2008444783);
                        i6 = -531518228;
                    }
                    break;
                case -1322827554:
                case -135700957:
                    if (C0773.m3161() != 0) {
                        iM2761 = C0773.m3169("ܺ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-31703)) ^ 1620190609;
                        i6 = -892967788;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩷") + i4) * (-89);
                        i5 = ((iM2761 ^ i3) * 32021) ^ 1152841855;
                        i6 = -114063701;
                    }
                    break;
                case -933822037:
                case -95074359:
                    break;
                case -645312574:
                case 112189457:
                    iM24839 = activityC9458.m24839(str);
                    if (iM24839 != -1) {
                        iM2761 = C0619.m2761("ۧ᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * 15823) ^ (-1609995420);
                        i6 = -1731085462;
                    } else {
                        iM2761 = C0773.m3169("ۚ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 32091) ^ (-1473761327);
                        i6 = -2134751065;
                    }
                    break;
                case -487301887:
                case 1685047140:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۡۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-18613)) ^ (-2008444783);
                        i6 = -531518228;
                    } else {
                        iM2761 = (C0773.m3169("ۗۙ") + i4) * (-33);
                        i5 = ((iM2761 ^ i3) * (-5713)) ^ (-318784736);
                        i6 = 1961180269;
                    }
                    break;
                case -286713207:
                case -162529083:
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("ܺ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-31703)) ^ 1620190609;
                        i6 = -892967788;
                    } else {
                        iM2761 = (C0619.m2761("᩶۬") + i3) * (-101);
                        i5 = ((iM2761 ^ i4) * 10909) ^ (-1300829121);
                        i6 = -1821220829;
                    }
                    break;
                case 422487236:
                case 1737714726:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ۡۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-18613)) ^ (-2008444783);
                        i6 = -531518228;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩸") + i4) * (-65);
                        i5 = ((iM2761 ^ i3) * (-25233)) ^ (-385967657);
                        i6 = -466235694;
                    }
                    break;
                case 610375722:
                case 1314839570:
                    C2288.m7767();
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ܺ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-31703)) ^ 1620190609;
                        i6 = -892967788;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۬᩷")) * 109;
                        i5 = ((iM2761 ^ i4) * 28041) ^ (-1124002830);
                        i6 = -1855999800;
                    }
                    break;
                case 1184071826:
                case 1185582246:
                    C3448.m11248();
                    C0269.m1775();
                    break;
                default:
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("ܰ᩹") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-21021)) ^ 610761828;
                        i6 = 2084108523;
                    } else {
                        iM2761 = C0773.m3169("ܳ֨") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21657)) ^ 971267295;
                        i6 = 1082412824;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 638276419;
        int i8 = C3690.f12684;
        int i9 = C2354.f7599;
        int iM2761 = (C0619.m2761("ۨ᩻") + i9) * (-65);
        int i10 = ((iM2761 ^ i8) * 91) ^ (-1234999950);
        int i11 = 100781123;
        while (true) {
            i7 = ((((i7 ^ i8) * 21411) >> 31) & i10) ^ (iM2761 ^ i11);
            switch (i7) {
                case -2125492755:
                case -286415728:
                    return C3734.m12149(sArr2, i6, 23, i5);
                case -2108730668:
                case 1132064521:
                    c = 'P';
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۤ۬") ^ i9;
                        i10 = ((iM2761 ^ i8) * 24145) ^ (-1358073226);
                        i11 = 1710666450;
                    } else {
                        iM2761 = (i8 - C0619.m2761("ۤۛ")) * 49;
                        i10 = ((iM2761 ^ i9) * 10203) ^ (-1371012121);
                        i11 = -1027745154;
                    }
                    break;
                case -1787813568:
                case -354589529:
                    AbstractC0641.m2813();
                    iM2761 = C0773.m3169("ۤ۬") ^ i9;
                    i10 = ((iM2761 ^ i8) * 24145) ^ (-1358073226);
                    i11 = 1710666450;
                    break;
                case -1564780213:
                case 1626101089:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("ܶܰ") + i8) * 99;
                        i10 = ((iM2761 ^ i9) * 28103) ^ 348555317;
                        i11 = -853826738;
                    } else {
                        iM2761 = C0773.m3169("ۤ۬") ^ i9;
                        i10 = ((iM2761 ^ i8) * 24145) ^ (-1358073226);
                        i11 = 1710666450;
                    }
                    break;
                case -1530618848:
                case 244712247:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("ۤ۬") ^ i9;
                        i10 = ((iM2761 ^ i8) * 24145) ^ (-1358073226);
                        i11 = 1710666450;
                    } else {
                        iM2761 = C0619.m2761("ܽۙ") ^ i8;
                        i10 = ((iM2761 ^ i9) * 22625) ^ (-174263501);
                        i11 = 1016122991;
                    }
                    break;
                case -827296350:
                case -738960427:
                    i5 = 16839;
                    iM2761 = C0619.m2761("ۜ᩹") ^ i8;
                    i10 = ((iM2761 ^ i9) * 6249) ^ 1457462483;
                    i11 = 1762565115;
                    break;
                case -824669465:
                case 699596979:
                    s = sArr[c];
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i9) * (-125);
                        i10 = ((iM2761 ^ i8) * 7861) ^ 914121565;
                        i11 = 571514064;
                    } else {
                        iM2761 = (C0773.m3169("۟ۗ") + i9) * (-111);
                        i10 = ((iM2761 ^ i8) * 30955) ^ (-1584067277);
                        i11 = 411504116;
                    }
                    break;
                case -484523424:
                case -83205216:
                    i4 = 371487076;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("ܶܰ") + i8) * 99;
                        i10 = ((iM2761 ^ i9) * 28103) ^ 348555317;
                        i11 = -853826738;
                    } else {
                        iM2761 = (C0773.m3169("ᩳᩴ") + i8) * 115;
                        i10 = ((iM2761 ^ i9) * 1547) ^ 1849040709;
                        i11 = 749314327;
                    }
                    break;
                case -174692406:
                case 934091844:
                    RunnableC3055.m9933();
                    C2288.m7767();
                    return null;
                case -168726361:
                case 42913984:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("ܶܰ") + i8) * 99;
                        i10 = ((iM2761 ^ i9) * 28103) ^ 348555317;
                        i11 = -853826738;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩺") ^ i9) * 53;
                        i10 = ((iM2761 ^ i8) * 22933) ^ (-1010908263);
                        i11 = -582747115;
                    }
                    break;
                case 40069171:
                case 496772940:
                    C2966.m9664();
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i9) * (-125);
                        i10 = ((iM2761 ^ i8) * 7861) ^ 914121565;
                        i11 = 571514064;
                    } else {
                        iM2761 = C0773.m3169("ۤ۬") ^ i9;
                        i10 = ((iM2761 ^ i8) * 24145) ^ (-1358073226);
                        i11 = 1710666450;
                    }
                    break;
                case 348413024:
                case 1684746916:
                    int i12 = i3 + i4;
                    if ((i12 + i12) - i2 >= 0) {
                        iM2761 = C0773.m3169("۫᩷") ^ i9;
                        i10 = ((iM2761 ^ i8) * 22873) ^ 1471083173;
                        i11 = -600186792;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩵") ^ i9;
                        i10 = ((iM2761 ^ i8) * (-7735)) ^ (-2096533042);
                        i11 = 1133976772;
                    }
                    break;
                case 397104701:
                case 1280907556:
                    i5 = 31921;
                    iM2761 = C0619.m2761("ۜ᩹") ^ i8;
                    i10 = ((iM2761 ^ i9) * 6249) ^ 1457462483;
                    i11 = 1762565115;
                    break;
                case 543455735:
                case 2105248284:
                    i = s + 19274;
                    if (C13473.m33144()) {
                        iM2761 = (C0619.m2761("ܺ᩹") ^ i9) * 91;
                        i10 = ((iM2761 ^ i8) * (-31385)) ^ (-1254031590);
                        i11 = -1597360973;
                    } else {
                        iM2761 = (C0619.m2761("ܳۤ") ^ i9) * 65;
                        i10 = ((iM2761 ^ i8) * (-29801)) ^ 365892832;
                        i11 = 207115233;
                    }
                    break;
                case 936907654:
                case 2040866031:
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0619.m2761("ܶܰ") + i8) * 99;
                        i10 = ((iM2761 ^ i9) * 28103) ^ 348555317;
                        i11 = -853826738;
                    } else {
                        iM2761 = (i9 - C0773.m3169("ܺۜ")) * 7;
                        i10 = ((iM2761 ^ i8) * 24491) ^ (-489052437);
                        i11 = 1893113878;
                    }
                    break;
                case 961565867:
                case 1826151172:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i9) * (-125);
                        i10 = ((iM2761 ^ i8) * 7861) ^ 914121565;
                        i11 = 571514064;
                    } else {
                        iM2761 = C0619.m2761("۟۠") ^ i8;
                        i10 = ((iM2761 ^ i9) * (-4377)) ^ 1756345662;
                        i11 = 153848071;
                    }
                    break;
                case 1365356894:
                case 1616139331:
                    sArr = f30664;
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("ۢ۬") ^ i8;
                        i10 = ((iM2761 ^ i9) * (-4193)) ^ 1471587809;
                        i11 = -889000563;
                    } else {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i9) * (-125);
                        i10 = ((iM2761 ^ i8) * 7861) ^ 914121565;
                        i11 = 571514064;
                    }
                    break;
                case 1476212102:
                case 1936470368:
                    sArr2 = f30664;
                    i6 = 81;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i9) * (-125);
                        i10 = ((iM2761 ^ i8) * 7861) ^ 914121565;
                        i11 = 571514064;
                    } else {
                        iM2761 = C0619.m2761("ۤ᩵") ^ i8;
                        i10 = ((iM2761 ^ i9) * 22867) ^ (-1702297458);
                        i11 = -1078182756;
                    }
                    break;
                default:
                    i2 = i * i;
                    i3 = s * s;
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = (C0619.m2761("ܶܰ") + i8) * 99;
                        i10 = ((iM2761 ^ i9) * 28103) ^ 348555317;
                        i11 = -853826738;
                    } else {
                        iM2761 = (C0773.m3169("ܿۛ") ^ i8) * (-29);
                        i10 = ((iM2761 ^ i9) * (-23793)) ^ 1309423932;
                        i11 = 1031335092;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m24842(ActivityC9458 activityC9458) {
        int iM2761;
        int i;
        int i2 = 1173946399;
        int i3 = C3734.f12817;
        int i4 = C2354.f7599;
        int iM2762 = C0619.m2761("ܶ᩵") ^ i4;
        int i5 = ((iM2762 ^ i3) * 28335) ^ (-226012207);
        int i6 = 30914140;
        while (true) {
            int i7 = iM2762 ^ i6;
            RunnableC3009 runnableC3009 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 32719) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2005703523:
                    case 2072781828:
                        C3099.m10095();
                        iM2761 = C0619.m2761("ۖ᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16481)) ^ (-1583436374);
                        i = -581087404;
                        i7 = iM2761 ^ i;
                        break;
                    case -1853162072:
                    case -1850259917:
                        if (C2354.f7599 < 0 && C3690.f12684 > 0 && C0950.f3488 < 0) {
                            if (C11235.f35427 < 0) {
                                if (C1519.f5300 < 0 && C23916.f77426 > 0) {
                                    if (C0773.f2792 <= 0) {
                                        iM2762 = C0773.m3169("ܶᩳ") ^ i3;
                                        i5 = ((iM2762 ^ i4) * (-12239)) ^ 223020557;
                                        i6 = -291761344;
                                        break;
                                    } else {
                                        int i8 = 2;
                                        if (!RunnableC3646.f12471) {
                                            runnableC3009 = new RunnableC3009(i8, activityC9458);
                                            if (C3779.f12953 > 0) {
                                                iM2761 = C0619.m2761("ۧۘ") ^ i3;
                                                i5 = ((iM2761 ^ i4) * (-23641)) ^ 175726223;
                                                i = -601147067;
                                                i7 = iM2761 ^ i;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            iM2762 = (C0619.m2761("ܰۖ") + i3) * 3;
                            i5 = ((iM2762 ^ i4) * (-7215)) ^ (-448562712);
                            i6 = 2082676862;
                            break;
                        }
                        iM2762 = (C0773.m3169("ۚ۫") + i4) * (-89);
                        i5 = ((iM2762 ^ i3) * 17357) ^ 1744715486;
                        i6 = 2113158664;
                        break;
                    case -1833217174:
                    case 1228614445:
                        activityC9458.f30666.stopScroll();
                        if (C11235.f35427 >= 0) {
                            iM2761 = (C0619.m2761("ۡ᩷") + i4) * (-19);
                            i5 = ((iM2761 ^ i3) * (-7351)) ^ 438456224;
                            i = -1951214602;
                        } else {
                            iM2761 = (C0773.m3169("᩹ۗ") ^ i4) * (-37);
                            i5 = ((iM2761 ^ i3) * 19243) ^ (-1192460930);
                            i = 1998648687;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1295935562:
                    case -1123920953:
                        activityC9458.f30666.post(runnableC3009);
                        break;
                    case -1281076273:
                    case 701925623:
                        if (C2702.f8586 > 0) {
                            iM2762 = (C0619.m2761("ܰۖ") + i3) * 3;
                            i5 = ((iM2762 ^ i4) * (-7215)) ^ (-448562712);
                            i6 = 2082676862;
                        }
                        iM2761 = C0619.m2761("ۖ᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16481)) ^ (-1583436374);
                        i = -581087404;
                        i7 = iM2761 ^ i;
                        break;
                    case -1021952669:
                    case 661949078:
                        C2288.m7767();
                        if (AbstractC3624.f12429 > 0) {
                            iM2762 = C0773.m3169("ܶᩳ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-12239)) ^ 223020557;
                            i6 = -291761344;
                        }
                        iM2761 = (C0619.m2761("ۡ᩷") + i4) * (-19);
                        i5 = ((iM2761 ^ i3) * (-7351)) ^ 438456224;
                        i = -1951214602;
                        i7 = iM2761 ^ i;
                        break;
                    case 176279419:
                    case 1295886491:
                        C2287.m7745();
                        break;
                    case 723451651:
                    case 1544491748:
                        runnableC3009.run();
                        break;
                    case 1081851498:
                    case 1451841269:
                        if (activityC9458.f30666.isComputingLayout()) {
                            iM2761 = (i4 - C0773.m3169("ܳܶ")) * 27;
                            i5 = ((iM2761 ^ i3) * 8701) ^ 1020173983;
                            i = -2029328776;
                        } else {
                            iM2761 = C0619.m2761("ᩳۛ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 5179) ^ 645987132;
                            i = -920852843;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        if (!C17202.f56030) {
                            iM2762 = C0773.m3169("ܶᩳ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-12239)) ^ 223020557;
                            i6 = -291761344;
                        }
                        iM2761 = C0619.m2761("ۖ᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16481)) ^ (-1583436374);
                        i = -581087404;
                        i7 = iM2761 ^ i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0159 A[PHI: r1 r10 r12
      0x0159: PHI (r1v4 android.view.MenuInflater) = (r1v2 android.view.MenuInflater), (r1v3 android.view.MenuInflater), (r1v2 android.view.MenuInflater) binds: [B:43:0x0157, B:32:0x00e7, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:43:0x0157, B:32:0x00e7, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:43:0x0157, B:32:0x00e7, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x018d A[PHI: r8 r9
      0x018d: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:47:0x018b, B:13:0x0067, B:7:0x0056, B:5:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:47:0x018b, B:13:0x0067, B:7:0x0056, B:5:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c6 A[PHI: r6 r7 r13
      0x01c6: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:51:0x01c4, B:28:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:51:0x01c4, B:28:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:51:0x01c4, B:28:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0216 A[PHI: r3 r18
      0x0216: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:59:0x0214, B:24:0x00a9, B:13:0x0067, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:59:0x0214, B:24:0x00a9, B:13:0x0067, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0247 A[PHI: r2 r5
      0x0247: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v7 int) binds: [B:63:0x0245, B:55:0x01f6, B:7:0x0056, B:70:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r5v5 char) = (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:63:0x0245, B:55:0x01f6, B:7:0x0056, B:70:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM2761;
        int i;
        int i2;
        int i3 = C2834.f9334;
        int i4 = C3734.f12817;
        int iM3169 = (i4 - C0773.m3169("֫ۗ")) * q.h;
        int i5 = ((iM3169 ^ i3) * 707) ^ 1027868328;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ 1934886039;
        MenuInflater menuInflater = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1704346284;
        String strM10047 = null;
        int iM2762 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-21941)) >> 31));
            switch (i12) {
                case -2088373123:
                case -157812444:
                    i10 = 10011;
                    iM2761 = C0773.m3169("֨᩸") ^ i4;
                    i = ((iM2761 ^ i3) * 9449) ^ 1697287318;
                    i2 = -1266138299;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2081482712:
                case 1520919005:
                    if (i7 - (i8 + i9) <= 0) {
                        iM2761 = (i4 - C0773.m3169("᩻ᩴ")) * 11;
                        i = ((iM2761 ^ i3) * (-9781)) ^ 236986600;
                        i2 = 2093507785;
                    } else {
                        iM2761 = C0773.m3169("۠ۧ") ^ i3;
                        i = ((iM2761 ^ i4) * 20833) ^ 1826632695;
                        i2 = -1176596237;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2064944883:
                case -1099592212:
                    sArr = f30664;
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۛۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-28391)) ^ 396503551;
                        i2 = -2036286413;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩵ۛ")) * 119;
                        i = ((iM2761 ^ i3) * 28087) ^ (-2112462483);
                        i2 = -1153389847;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1999319215:
                case 459021801:
                    i10 = 27252;
                    iM2761 = C0773.m3169("֨᩸") ^ i4;
                    i = ((iM2761 ^ i3) * 9449) ^ 1697287318;
                    i2 = -1266138299;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1811938267:
                case -1787432723:
                    menuInflater.inflate(iM2762, menu);
                    return true;
                case -1728005118:
                case -233897252:
                    c = 22;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ܿܶ")) * (-51);
                        i = ((iM2761 ^ i4) * (-27015)) ^ (-1165374655);
                        i2 = 1478019317;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܶۚ")) * (-37);
                        i = ((iM2761 ^ i4) * 28085) ^ 1026499841;
                        i2 = 1201477856;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1369979454:
                case 1867116432:
                    i9 = 375816996;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("ۤۘ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i4) * (-2373)) ^ (-157266361);
                        i2 = 1696785233;
                    } else {
                        iM2761 = C0619.m2761("ۛۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 16971) ^ (-891787288);
                        i2 = -810060742;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1327709794:
                case -687119018:
                    C3734.m12152();
                    if (C4238.m13540() <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۚۘ")) * 127;
                        i = ((iM2761 ^ i4) * (-21199)) ^ (-1759752312);
                        i2 = -2092688935;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܿܶ")) * (-51);
                        i = ((iM2761 ^ i4) * (-27015)) ^ (-1165374655);
                        i2 = 1478019317;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1148204690:
                case -280357123:
                    if (C1783.m6232()) {
                        iM2761 = (C0619.m2761("ܳۙ") ^ i3) * 71;
                        i = ((iM2761 ^ i4) * (-15133)) ^ (-678591576);
                        i2 = 1126419894;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܿܶ")) * (-51);
                        i = ((iM2761 ^ i4) * (-27015)) ^ (-1165374655);
                        i2 = 1478019317;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -883052003:
                case -524869963:
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ۛۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-28391)) ^ 396503551;
                        i2 = -2036286413;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۚۘ")) * 127;
                        i = ((iM2761 ^ i4) * (-21199)) ^ (-1759752312);
                        i2 = -2092688935;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -840491644:
                case 1602684100:
                    s = sArr[c];
                    s2 = 38772;
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("ۤۙ") ^ i4) * (-47);
                        i = ((iM2761 ^ i3) * (-24859)) ^ (-652168316);
                        i2 = 315641106;
                    } else {
                        iM2761 = C0619.m2761("۬ᩳ") ^ i4;
                        i = ((iM2761 ^ i3) * 32633) ^ 1826987010;
                        i2 = 1722993714;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -698320969:
                case -124703720:
                    RunnableC1848.m6360();
                    C1519.m5403();
                    return false;
                case -207424628:
                case 12161136:
                    i7 = s * s2;
                    i8 = s * s;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۚۘ")) * 127;
                        i = ((iM2761 ^ i4) * (-21199)) ^ (-1759752312);
                        i2 = -2092688935;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۙۘ")) * 23;
                        i = ((iM2761 ^ i4) * (-31431)) ^ (-249915460);
                        i2 = 1891781239;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -26279092:
                case 961180643:
                    i11 = 23;
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("ۤۙ") ^ i4) * (-47);
                        i = ((iM2761 ^ i3) * (-24859)) ^ (-652168316);
                        i2 = 315641106;
                    } else {
                        iM2761 = C0619.m2761("᩺ۢ") ^ i3;
                        i = ((iM2761 ^ i4) * 11215) ^ (-390878492);
                        i2 = 666481873;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 477587163:
                case 563627052:
                    menuInflater = getMenuInflater();
                    sArr2 = f30664;
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("ۤۘ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i4) * (-2373)) ^ (-157266361);
                        i2 = 1696785233;
                    } else {
                        iM2761 = (C0619.m2761("ۡ᩹") + i3) * 87;
                        i = ((iM2761 ^ i4) * (-8623)) ^ (-2014759554);
                        i2 = -887868709;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 780501071:
                case 1675097191:
                    iM2762 = C0619.m2761(strM10047) ^ 2129742718;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ܿܶ")) * (-51);
                        i = ((iM2761 ^ i4) * (-27015)) ^ (-1165374655);
                        i2 = 1478019317;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    } else {
                        int iM2763 = (C0619.m2761("᩹ۖ") + i4) * 41;
                        i5 = ((iM2763 ^ i3) * 11657) ^ (-1191331602);
                        i6 = iM2763 ^ 1949673091;
                    }
                    break;
                case 932861762:
                case 1760770729:
                    strM10047 = C3077.m10047(sArr2, i11, 3, i10);
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("ۛۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-28391)) ^ 396503551;
                        i2 = -2036286413;
                    } else {
                        iM2761 = C0773.m3169("֫᩸") ^ i4;
                        i = ((iM2761 ^ i3) * (-22311)) ^ 205887116;
                        i2 = -154668813;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1818640272:
                case 2144056365:
                    C0862.m3503();
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ۛۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-28391)) ^ 396503551;
                        i2 = -2036286413;
                    } else {
                        iM2761 = (C0773.m3169("ۤۘ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i4) * (-2373)) ^ (-157266361);
                        i2 = 1696785233;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    C23916.m53419();
                    iM2761 = (i3 - C0619.m2761("ۚۘ")) * 127;
                    i = ((iM2761 ^ i4) * (-21199)) ^ (-1759752312);
                    i2 = -2092688935;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    public ActivityC9458() {
        ArrayList arrayList = null;
        int i = -1090157762;
        int i2 = AbstractC0116.f1064;
        int i3 = C1826.f6190;
        int iM3169 = C0773.m3169("᩹ۖ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 7315) ^ (-819177795);
        int i5 = 2062578778;
        while (true) {
            i = ((((i ^ i3) * (-26139)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2109488048:
                case -1985926216:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("֡ۧ") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-8547)) ^ 1737950597;
                        i5 = 1335417866;
                    } else {
                        iM3169 = (C0619.m2761("۫᩺") ^ i2) * 33;
                        i4 = ((iM3169 ^ i3) * (-25391)) ^ (-2050767037);
                        i5 = 2004251378;
                    }
                    break;
                case -1822083470:
                case 1160313179:
                    if (C2702.m8876()) {
                        iM3169 = (i3 - C0773.m3169("۬ۖ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i2) * (-5397)) ^ (-201813740);
                        i5 = 1435059067;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܽܿ")) * 41;
                        i4 = ((iM3169 ^ i2) * (-12203)) ^ 2074563070;
                        i5 = -221265832;
                    }
                    break;
                case -1715207935:
                case -1360569373:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ܽܿ")) * 41;
                        i4 = ((iM3169 ^ i2) * (-12203)) ^ 2074563070;
                        i5 = -221265832;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۧ") ^ i2) * (-67);
                        i4 = ((iM3169 ^ i3) * (-32611)) ^ (-1810636399);
                        i5 = 282589907;
                    }
                    break;
                case -1657859467:
                case -52220800:
                    C3492.m11488();
                    C1146.m4231();
                    throw new RuntimeException();
                case -1534018962:
                case -631244971:
                    C1783.m6232();
                    iM3169 = (C0619.m2761("ᩴۧ") ^ i2) * (-67);
                    i4 = ((iM3169 ^ i3) * (-32611)) ^ (-1810636399);
                    i5 = 282589907;
                    break;
                case -1186447700:
                case -964655607:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ᩳ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25979)) ^ (-1678280347);
                        i5 = -1111062494;
                    } else {
                        iM3169 = (C0773.m3169("ۤۘ") ^ i2) * 65;
                        i4 = ((iM3169 ^ i3) * 11481) ^ 966202622;
                        i5 = 1317956243;
                    }
                    break;
                case -1176814599:
                case 2083452336:
                    RunnableC3646.m11813();
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = (C0619.m2761("ᩴۧ") ^ i2) * (-67);
                        i4 = ((iM3169 ^ i3) * (-32611)) ^ (-1810636399);
                        i5 = 282589907;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺ۫")) * 21;
                        i4 = ((iM3169 ^ i2) * (-24325)) ^ (-1585695548);
                        i5 = -545369809;
                    }
                    break;
                case -763413866:
                case -257309375:
                    this.f30671 = arrayList;
                    return;
                case -685382233:
                case -666161965:
                    C3998.m12920();
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("ᩳ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25979)) ^ (-1678280347);
                        i5 = -1111062494;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܽܿ")) * 41;
                        i4 = ((iM3169 ^ i2) * (-12203)) ^ 2074563070;
                        i5 = -221265832;
                    }
                    break;
                case -629826111:
                case 1541819924:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("ᩴۧ") ^ i2) * (-67);
                        i4 = ((iM3169 ^ i3) * (-32611)) ^ (-1810636399);
                        i5 = 282589907;
                    } else {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17653)) ^ 526943121;
                        i5 = 1347344314;
                    }
                    break;
                case -279621727:
                case 686853286:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("֡ۧ") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-8547)) ^ 1737950597;
                        i5 = 1335417866;
                    } else {
                        iM3169 = C0619.m2761("ܳ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32521) ^ 1546787569;
                        i5 = 914113160;
                    }
                    break;
                case -183220911:
                case 1238549594:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i3 - C0773.m3169("ܽܿ")) * 41;
                        i4 = ((iM3169 ^ i2) * (-12203)) ^ 2074563070;
                        i5 = -221265832;
                    } else {
                        iM3169 = C0619.m2761("ܽܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21219) ^ (-1246500863);
                        i5 = -347384444;
                    }
                    break;
                case 845306874:
                case 1822698294:
                    if (C2878.f9462) {
                        iM3169 = (i3 - C0773.m3169("ܽܿ")) * 41;
                        i4 = ((iM3169 ^ i2) * (-12203)) ^ 2074563070;
                        i5 = -221265832;
                    } else {
                        iM3169 = (C0773.m3169("ۖ᩹") ^ i3) * 97;
                        i4 = ((iM3169 ^ i2) * (-2869)) ^ (-382847890);
                        i5 = 566223416;
                    }
                    break;
                case 883636358:
                case 1427042455:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (C0619.m2761("֡ۧ") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-8547)) ^ 1737950597;
                        i5 = 1335417866;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۬ۗ")) * (-3);
                        i4 = ((iM3169 ^ i2) * 25085) ^ (-413604651);
                        i5 = 1746584096;
                    }
                    break;
                case 1476724980:
                case 2129506971:
                    arrayList = new ArrayList();
                    if (RunnableC3646.f12471) {
                        iM3169 = (i3 - C0773.m3169("ܽܿ")) * 41;
                        i4 = ((iM3169 ^ i2) * (-12203)) ^ 2074563070;
                        i5 = -221265832;
                    } else {
                        iM3169 = (C0619.m2761("᩷۟") + i2) * 67;
                        i4 = ((iM3169 ^ i3) * 13403) ^ (-163215524);
                        i5 = 1326621208;
                    }
                    break;
                default:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("֡ۧ") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-8547)) ^ 1737950597;
                        i5 = 1335417866;
                    } else {
                        iM3169 = C0773.m3169("ܺۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28473)) ^ (-1973399180);
                        i5 = -314245504;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ۫ */
    public final void mo4897() {
        long jM9342 = 0;
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 4845713;
        int i5 = C1542.f5343;
        int i6 = C3099.f10023;
        int iM2761 = (C0619.m2761("ۨۚ") + i6) * (-3);
        int i7 = ((iM2761 ^ i5) * (-14069)) ^ 1769042511;
        int i8 = 1170702577;
        while (true) {
            i4 = ((((i4 ^ i5) * (-10889)) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2095605798:
                case 2134372854:
                    i = this.f30667;
                    i2 = 1;
                    if (C2288.m7767()) {
                        iM2761 = (C0619.m2761("ۧۘ") ^ i5) * (-31);
                        i7 = ((iM2761 ^ i6) * 11645) ^ (-165417526);
                        i8 = 832901758;
                    } else {
                        iM2761 = C0619.m2761("۟ۙ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 16895) ^ (-895310667);
                        i8 = -749499200;
                    }
                    break;
                case -2092744329:
                case 2052437626:
                    C20932.m47848();
                    if (C1783.f6087 > 0) {
                        iM2761 = C0773.m3169("ۡܰ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 6593) ^ (-1338956123);
                        i8 = -263810041;
                    } else {
                        iM2761 = (i6 - C0619.m2761("۠ۙ")) * 79;
                        i7 = ((iM2761 ^ i5) * 19815) ^ 1248786182;
                        i8 = -1227998809;
                    }
                    break;
                case -2028483524:
                case -1172747117:
                    break;
                case -1999911526:
                case -1295779479:
                    jM9342 = C2834.m9342();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۡܰ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 6593) ^ (-1338956123);
                        i8 = -263810041;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩷") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-14363)) ^ 1550105905;
                        i8 = 665045856;
                    }
                    break;
                case -1923360047:
                case -1374349328:
                    this.f30669 = C3448.m11251();
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۡܰ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 6593) ^ (-1338956123);
                        i8 = -263810041;
                    } else {
                        iM2761 = (C0619.m2761("֫ۙ") + i5) * 99;
                        i7 = ((iM2761 ^ i6) * 15771) ^ (-1544642758);
                        i8 = -1719143450;
                    }
                    break;
                case -1896789292:
                case 880315267:
                    if (jM9342 - j < 300) {
                        iM2761 = (C0773.m3169("ۚܿ") ^ i5) * (-41);
                        i7 = ((iM2761 ^ i6) * 16077) ^ 1383097370;
                        i8 = -2056528996;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ۖ᩷")) * (-117);
                        i7 = ((iM2761 ^ i5) * 19405) ^ 544211486;
                        i8 = 211117287;
                    }
                    break;
                case -1707960522:
                case 511364371:
                    i3 = i + i2;
                    this.f30667 = i3;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ᩳ۠") ^ i6;
                        i7 = ((iM2761 ^ i5) * 26121) ^ 1367406137;
                        i8 = -1063271647;
                    } else {
                        iM2761 = C0619.m2761("֡ۘ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-25151)) ^ 1960316727;
                        i8 = 1852254613;
                    }
                    break;
                case -1328828515:
                case -612070051:
                    f30665 = z;
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("ᩳ۠") ^ i6;
                        i7 = ((iM2761 ^ i5) * 26121) ^ 1367406137;
                        i8 = -1063271647;
                    } else {
                        iM2761 = C0773.m3169("᩷ۤ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 30787) ^ (-61562535);
                        i8 = 661008445;
                    }
                    break;
                case -1188591548:
                case 12360036:
                    C1146.m4231();
                    iM2761 = (i6 - C0619.m2761("۠ۙ")) * 79;
                    i7 = ((iM2761 ^ i5) * 19815) ^ 1248786182;
                    i8 = -1227998809;
                    break;
                case -701530205:
                case -287570083:
                    j = this.f30669;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i6 - C0619.m2761("۠ۙ")) * 79;
                        i7 = ((iM2761 ^ i5) * 19815) ^ 1248786182;
                        i8 = -1227998809;
                    } else {
                        iM2761 = C0619.m2761("᩺֨") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-1687)) ^ 102970675;
                        i8 = 1814645611;
                    }
                    break;
                case -140946396:
                case 2110400331:
                    C0773.m3161();
                    C0773.m3161();
                    break;
                case -124511736:
                case 2004615882:
                    z = false;
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("᩵ܽ") ^ i6) * 7;
                        i7 = ((iM2761 ^ i5) * (-13973)) ^ 1472144055;
                        i8 = -377549579;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩵ۖ")) * (-19);
                        i7 = ((iM2761 ^ i6) * 2521) ^ 741130017;
                        i8 = 1450741906;
                    }
                    break;
                case -17812703:
                case 2146552807:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i6 - C0619.m2761("۠ۙ")) * 79;
                        i7 = ((iM2761 ^ i5) * 19815) ^ 1248786182;
                        i8 = -1227998809;
                    } else {
                        iM2761 = (C0773.m3169("ۨܺ") ^ i5) * (-37);
                        i7 = ((iM2761 ^ i6) * 12927) ^ 807058752;
                        i8 = 966073826;
                    }
                    break;
                case 748187427:
                case 1491949062:
                    C2878.m9491();
                    if (C1321.f4751 < 0) {
                        iM2761 = C0773.m3169("ᩳ۠") ^ i6;
                        i7 = ((iM2761 ^ i5) * 26121) ^ 1367406137;
                        i8 = -1063271647;
                    } else {
                        iM2761 = (i6 - C0619.m2761("۠ۙ")) * 79;
                        i7 = ((iM2761 ^ i5) * 19815) ^ 1248786182;
                        i8 = -1227998809;
                    }
                    break;
                case 909469252:
                case 1172168654:
                    if (C2310.f7472 < 0) {
                        C3448.m11245(new C16171(this, i3));
                    }
                    iM2761 = (C0773.m3169("᩵ܽ") ^ i6) * 7;
                    i7 = ((iM2761 ^ i5) * (-13973)) ^ 1472144055;
                    i8 = -377549579;
                    break;
                case 1178643420:
                case 1566810408:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("ۡܰ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 6593) ^ (-1338956123);
                        i8 = -263810041;
                    } else {
                        iM2761 = (C0773.m3169("֨ᩴ") ^ i5) * (-89);
                        i7 = ((iM2761 ^ i6) * (-4491)) ^ (-1885864416);
                        i8 = -1418924413;
                    }
                    break;
                default:
                    C2419.m8174();
                    if (C2354.f7599 < 0) {
                        iM2761 = (C0773.m3169("᩵ܽ") ^ i6) * 7;
                        i7 = ((iM2761 ^ i5) * (-13973)) ^ 1472144055;
                        i8 = -377549579;
                    } else {
                        iM2761 = (i6 - C0619.m2761("۠ۙ")) * 79;
                        i7 = ((iM2761 ^ i5) * 19815) ^ 1248786182;
                        i8 = -1227998809;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C16390 c16390;
        int i;
        int iM2761;
        int i2;
        int i3;
        short[] sArr;
        short[] sArr2;
        int i4;
        short[] sArr3;
        int iM2762;
        int i5;
        int i6;
        int iM2763;
        int i7;
        int i8;
        ActivityC9458 activityC9458 = this;
        C16390 c16391 = null;
        ViewOnClickListenerC7633 viewOnClickListenerC7633 = null;
        View viewM9476 = null;
        View viewM5518 = null;
        ViewGroup viewGroup = null;
        int i9 = 0;
        int iM3169 = 0;
        int i10 = 0;
        short s = 0;
        short s2 = 0;
        int i11 = -946684147;
        int i12 = C0773.f2792;
        int i13 = C3690.f12684;
        int iM2764 = C0619.m2761("ۤܽ") ^ i13;
        int i14 = ((iM2764 ^ i12) * (-13259)) ^ (-992059184);
        int i15 = iM2764 ^ 1363258973;
        AbstractC2944 abstractC2944M13853 = null;
        C16390 c16392 = null;
        String strM4222 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iM31610 = 0;
        int i20 = 0;
        int i21 = 0;
        int iM2765 = 0;
        int i22 = 0;
        View viewM5519 = null;
        short[] sArr8 = null;
        int i23 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * (-4289)) >> 31));
            switch (i11) {
                case -2010804438:
                case 1212041826:
                    short[] sArr9 = sArr6;
                    short[] sArr10 = sArr7;
                    AbstractC2944 abstractC2944 = abstractC2944M13853;
                    abstractC2944.mo9633(true);
                    C16390 c16393 = activityC9458.f56046;
                    short[] sArr11 = f30664;
                    i21 = 10;
                    int iM31611 = (i13 - C0773.m3169("ۧܳ")) * 29;
                    i14 = ((iM31611 ^ i12) * 15421) ^ (-1621375481);
                    i15 = iM31611 ^ 1054747443;
                    abstractC2944M13853 = abstractC2944;
                    sArr6 = sArr9;
                    c16392 = c16393;
                    sArr8 = sArr11;
                    sArr7 = sArr10;
                    break;
                case -1731143576:
                case -480862547:
                    activityC9458.f30670 = (TextView) C4282.m13654(viewGroup, i9);
                    C5817 c5817 = activityC9458.f30666;
                    C12442 c12442 = new C12442(activityC9458);
                    activityC9458.f30672 = c12442;
                    C1826.m6315(c5817, c12442);
                    if (C7685.m20925()) {
                        iM2763 = (C0773.m3169("֫ᩴ") + i12) * (-51);
                        i7 = ((iM2763 ^ i13) * 19767) ^ (-1742423956);
                        i8 = -1981151243;
                    } else {
                        iM2763 = (C0773.m3169("ܶ۟") + i13) * 93;
                        i7 = ((iM2763 ^ i12) * (-12265)) ^ 849941582;
                        i8 = 1638345254;
                    }
                    i15 = iM2763 ^ i8;
                    i14 = i7;
                    break;
                case -1708896375:
                case 531329751:
                    c16392 = c16392;
                    sArr6 = sArr6;
                    short[] sArr12 = sArr8;
                    sArr2 = sArr7;
                    i4 = i21;
                    iM2765 = C0619.m2761(C3998.m12925(sArr12, i4, 3, i16));
                    i22 = 2129444975;
                    if (C2702.f8586 > 0) {
                        iM2762 = (C0619.m2761("ۖ᩻") ^ i12) * (-95);
                        sArr3 = sArr12;
                        i5 = ((iM2762 ^ i13) * (-25069)) ^ 1579269634;
                        i6 = 1287797745;
                        i15 = iM2762 ^ i6;
                        i14 = i5;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        short[] sArr13 = sArr3;
                        i21 = i4;
                        sArr7 = sArr2;
                        sArr8 = sArr13;
                    } else {
                        sArr8 = sArr12;
                        sArr = sArr5;
                        i21 = i4;
                        sArr7 = sArr2;
                        int iM31612 = (C0773.m3169("ܳ֡") ^ i13) * 75;
                        int i24 = ((iM31612 ^ i12) * 5293) ^ 10907213;
                        i15 = iM31612 ^ 1777206744;
                        sArr8 = sArr8;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        i21 = i21;
                        sArr5 = sArr;
                        i14 = i24;
                        activityC9458 = this;
                    }
                    break;
                case -1661898653:
                case 1993147638:
                    i21 = i21;
                    c16392 = c16392;
                    sArr6 = sArr6;
                    sArr8 = sArr8;
                    sArr2 = sArr7;
                    C2878.m9476(activityC9458, iM31610 ^ i20);
                    sArr = f30664;
                    i23 = 7;
                    if (C1519.f5300 >= 0) {
                        sArr7 = sArr2;
                        int iM31613 = (C0773.m3169("ܳ֡") ^ i13) * 75;
                        int i25 = ((iM31613 ^ i12) * 5293) ^ 10907213;
                        i15 = iM31613 ^ 1777206744;
                        sArr8 = sArr8;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        i21 = i21;
                        sArr5 = sArr;
                        i14 = i25;
                        activityC9458 = this;
                    } else {
                        int iM31614 = (i12 - C0773.m3169("᩸ܳ")) * 101;
                        int i26 = ((iM31614 ^ i13) * 17359) ^ 1546325387;
                        i15 = iM31614 ^ 1274093199;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        sArr5 = sArr;
                        i14 = i26;
                        sArr7 = sArr2;
                        sArr8 = sArr8;
                        i21 = i21;
                    }
                    break;
                case -1548765217:
                case 1114249045:
                    activityC9458.f56046.setSubtitle(C7685.m20926());
                    iM2763 = (C0773.m3169("ܶ۟") + i13) * 93;
                    i7 = ((iM2763 ^ i12) * (-12265)) ^ 849941582;
                    i8 = 1638345254;
                    i15 = iM2763 ^ i8;
                    i14 = i7;
                    break;
                case -1426492552:
                case 412060706:
                    C2878.m9491();
                    if (C1519.f5300 < 0) {
                        i23 = i23;
                        c16392 = c16392;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i21;
                        sArr8 = sArr8;
                        sArr7 = sArr7;
                        sArr4 = sArr4;
                        iM2761 = (C0773.m3169("ܺ۫") + i12) * (-125);
                        i14 = ((iM2761 ^ i13) * (-23641)) ^ 118310600;
                        i2 = 1131291552;
                        i3 = iM2761 ^ i2;
                        sArr4 = sArr4;
                        sArr7 = sArr7;
                        sArr8 = sArr8;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        i21 = i21;
                        sArr5 = sArr5;
                        i23 = i23;
                        i15 = i3;
                        activityC9458 = this;
                    } else {
                        c16392 = c16392;
                        sArr6 = sArr6;
                        short[] sArr14 = sArr8;
                        sArr2 = sArr7;
                        i4 = i21;
                        sArr3 = sArr14;
                        iM2762 = C0619.m2761("ۘ᩸") ^ i13;
                        i5 = ((iM2762 ^ i12) * (-24895)) ^ 1425989242;
                        i6 = 1239298751;
                        i15 = iM2762 ^ i6;
                        i14 = i5;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        short[] sArr15 = sArr3;
                        i21 = i4;
                        sArr7 = sArr2;
                        sArr8 = sArr15;
                    }
                    break;
                case -1395160490:
                case -689709686:
                    activityC9458.f30666 = (C5817) viewM9476;
                    sArr7 = f30664;
                    i19 = 16;
                    if (!C3077.f9998) {
                        sArr = sArr5;
                        i21 = i21;
                        c16392 = c16392;
                        sArr6 = sArr6;
                        sArr8 = sArr8;
                        int iM31615 = (C0773.m3169("ܳ֡") ^ i13) * 75;
                        int i27 = ((iM31615 ^ i12) * 5293) ^ 10907213;
                        i15 = iM31615 ^ 1777206744;
                        sArr8 = sArr8;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        i21 = i21;
                        sArr5 = sArr;
                        i14 = i27;
                        activityC9458 = this;
                    } else {
                        iM2763 = (C0619.m2761("ۗۨ") + i13) * 47;
                        i7 = ((iM2763 ^ i12) * 22687) ^ (-1817635441);
                        i8 = 833419211;
                        i15 = iM2763 ^ i8;
                        i14 = i7;
                    }
                    break;
                case -1347693325:
                case 1010222689:
                    i23 = i23;
                    c16392 = c16392;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i21;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    sArr4 = sArr4;
                    int i28 = s + s2;
                    if ((51520 * s) - (i28 * i28) <= 0) {
                        iM2761 = (C0773.m3169("ۢܰ") + i13) * 67;
                        i14 = ((iM2761 ^ i12) * 3845) ^ 1973410540;
                        i2 = 2048435722;
                    } else {
                        iM2761 = C0773.m3169("ۘܺ") ^ i12;
                        i14 = ((iM2761 ^ i13) * 26389) ^ 508665414;
                        i2 = 104354135;
                    }
                    i3 = iM2761 ^ i2;
                    sArr4 = sArr4;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    sArr6 = sArr6;
                    c16392 = c16392;
                    i21 = i21;
                    sArr5 = sArr5;
                    i23 = i23;
                    i15 = i3;
                    activityC9458 = this;
                    break;
                case -1316325588:
                case 1999478143:
                    C20932.m47848();
                    break;
                case -1205294823:
                case -1089118685:
                    iM3169 = C0773.m3169(C1146.m4222(f30664, 19, 3, i16));
                    i10 = 2128358349;
                    if (C3448.m11248() == 0) {
                        iM2763 = (i12 - C0619.m2761("᩷֡")) * 63;
                        i7 = ((iM2763 ^ i13) * (-30343)) ^ 874001016;
                        i8 = 1249495867;
                        i15 = iM2763 ^ i8;
                        i14 = i7;
                    } else {
                        i23 = i23;
                        c16392 = c16392;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i21;
                        sArr8 = sArr8;
                        sArr7 = sArr7;
                        sArr4 = sArr4;
                        iM2761 = C0619.m2761("ܰ۬") ^ i12;
                        i14 = ((iM2761 ^ i13) * (-24987)) ^ (-169378705);
                        i2 = 1426008591;
                        i3 = iM2761 ^ i2;
                        sArr4 = sArr4;
                        sArr7 = sArr7;
                        sArr8 = sArr8;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        i21 = i21;
                        sArr5 = sArr5;
                        i23 = i23;
                        i15 = i3;
                        activityC9458 = this;
                    }
                    break;
                case -1200974144:
                case 1774189136:
                    RunnableC0334.m2063();
                    C1146.m4231();
                    c16392 = c16392;
                    sArr6 = sArr6;
                    short[] sArr16 = sArr8;
                    sArr2 = sArr7;
                    i4 = i21;
                    sArr3 = sArr16;
                    iM2762 = C0619.m2761("ۘ᩸") ^ i13;
                    i5 = ((iM2762 ^ i12) * (-24895)) ^ 1425989242;
                    i6 = 1239298751;
                    i15 = iM2762 ^ i6;
                    i14 = i5;
                    sArr6 = sArr6;
                    c16392 = c16392;
                    short[] sArr17 = sArr3;
                    i21 = i4;
                    sArr7 = sArr2;
                    sArr8 = sArr17;
                    break;
                case -1122320703:
                case 2006843226:
                    c16392 = c16392;
                    sArr6 = sArr6;
                    short[] sArr18 = sArr8;
                    sArr2 = sArr7;
                    i4 = i21;
                    sArr3 = sArr18;
                    C16390 c16394 = (C16390) viewM5519;
                    activityC9458.f56046 = c16394;
                    C11235.m28312(activityC9458, c16394);
                    abstractC2944M13853 = m13853();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2762 = C0619.m2761("ۘ᩸") ^ i13;
                        i5 = ((iM2762 ^ i12) * (-24895)) ^ 1425989242;
                        i6 = 1239298751;
                    } else {
                        iM2762 = (C0619.m2761("ۛۖ") + i12) * (-127);
                        i5 = ((iM2762 ^ i13) * (-22045)) ^ 148369636;
                        i6 = -1429152466;
                    }
                    i15 = iM2762 ^ i6;
                    i14 = i5;
                    sArr6 = sArr6;
                    c16392 = c16392;
                    short[] sArr19 = sArr3;
                    i21 = i4;
                    sArr7 = sArr2;
                    sArr8 = sArr19;
                    break;
                case -1082276588:
                case -637329455:
                    viewM5518 = C1564.m5518(activityC9458, C0619.m2761(C17202.m40377(sArr7, i19, 3, i16)) ^ 2120703330);
                    iM2763 = C0773.m3169("᩷ܽ") ^ i12;
                    i7 = ((iM2763 ^ i13) * (-23675)) ^ (-1170300405);
                    i8 = 1118427604;
                    i15 = iM2763 ^ i8;
                    i14 = i7;
                    break;
                case -881460388:
                case 643938074:
                    if (C1343.f4799 == 0) {
                        iM2763 = (C0619.m2761("ۨ۠") ^ i13) * 57;
                        i7 = ((iM2763 ^ i12) * (-24335)) ^ 1380513009;
                        i8 = 1837231240;
                        i15 = iM2763 ^ i8;
                        i14 = i7;
                    } else {
                        c16392 = c16392;
                        sArr6 = sArr6;
                        short[] sArr110 = sArr8;
                        sArr2 = sArr7;
                        i4 = i21;
                        sArr3 = sArr110;
                        iM2762 = C0619.m2761("ۘ᩸") ^ i13;
                        i5 = ((iM2762 ^ i12) * (-24895)) ^ 1425989242;
                        i6 = 1239298751;
                        i15 = iM2762 ^ i6;
                        i14 = i5;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        short[] sArr111 = sArr3;
                        i21 = i4;
                        sArr7 = sArr2;
                        sArr8 = sArr111;
                    }
                    break;
                case -834773029:
                case 2119016986:
                    C3072 c3072 = (C3072) C1564.m5518(activityC9458, iM3169 ^ i10);
                    activityC9458.f30668 = c3072;
                    c3072.m10020(activityC9458);
                    mo4897();
                    break;
                case -826197222:
                case -647382190:
                    viewM9476 = C2878.m9476(activityC9458, C0619.m2761(C1321.m4861(sArr6, i17, i18, i16)) ^ 2126977912);
                    iM2763 = (i12 - C0773.m3169("ᩳ֡")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i7 = ((iM2763 ^ i13) * 27845) ^ (-1504129869);
                    i8 = -41742775;
                    i15 = iM2763 ^ i8;
                    i14 = i7;
                    break;
                case -543151245:
                case 807574562:
                    c16390 = c16392;
                    short[] sArr20 = sArr8;
                    short[] sArr21 = sArr7;
                    short[] sArr22 = sArr4;
                    iM31610 = C0773.m3169(C3033.m9847(sArr22, 4, 3, i16));
                    i20 = 2130448990;
                    int iM31616 = (C0773.m3169("֫ܺ") ^ i13) * (-123);
                    i = ((iM31616 ^ i12) * (-23985)) ^ (-1556363477);
                    sArr4 = sArr22;
                    sArr7 = sArr21;
                    sArr8 = sArr20;
                    i21 = i21;
                    sArr5 = sArr5;
                    i23 = i23;
                    i15 = iM31616 ^ 1547271720;
                    i14 = i;
                    sArr6 = sArr6;
                    c16392 = c16390;
                    break;
                case -524280893:
                case 66810688:
                    i16 = 19696;
                    iM2761 = C0773.m3169("ᩴۘ") ^ i13;
                    i14 = ((iM2761 ^ i12) * 16111) ^ (-1643232100);
                    i2 = 1312572832;
                    i3 = iM2761 ^ i2;
                    sArr4 = sArr4;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    sArr6 = sArr6;
                    c16392 = c16392;
                    i21 = i21;
                    sArr5 = sArr5;
                    i23 = i23;
                    i15 = i3;
                    activityC9458 = this;
                    break;
                case -56269745:
                case 1875581577:
                    C1321.m4850(c16391, viewOnClickListenerC7633);
                    sArr6 = f30664;
                    i17 = 13;
                    i18 = 3;
                    if (C3779.f12953 <= 0) {
                        iM2763 = (C0619.m2761("ۨ۠") ^ i13) * 57;
                        i7 = ((iM2763 ^ i12) * (-24335)) ^ 1380513009;
                        i8 = 1837231240;
                    } else {
                        iM2763 = C0619.m2761("ۤ᩸") ^ i12;
                        i7 = ((iM2763 ^ i13) * 11295) ^ 139849099;
                        i8 = -1134578777;
                    }
                    i15 = iM2763 ^ i8;
                    i14 = i7;
                    break;
                case 297510843:
                case 1892433444:
                    i23 = i23;
                    c16392 = c16392;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i21;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    sArr4 = sArr4;
                    super.onCreate(bundle);
                    m40415();
                    strM4222 = C1146.m4222(f30664, 1, 3, i16);
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ܺ۫") + i12) * (-125);
                        i14 = ((iM2761 ^ i13) * (-23641)) ^ 118310600;
                        i2 = 1131291552;
                    } else {
                        iM2761 = (C0619.m2761("۟ۘ") ^ i13) * 83;
                        i14 = ((iM2761 ^ i12) * 5977) ^ 1130042321;
                        i2 = 1099376968;
                    }
                    i3 = iM2761 ^ i2;
                    sArr4 = sArr4;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    sArr6 = sArr6;
                    c16392 = c16392;
                    i21 = i21;
                    sArr5 = sArr5;
                    i23 = i23;
                    i15 = i3;
                    activityC9458 = this;
                    break;
                case 297863645:
                case 1957098140:
                    i16 = 7182;
                    iM2761 = C0773.m3169("ᩴۘ") ^ i13;
                    i14 = ((iM2761 ^ i12) * 16111) ^ (-1643232100);
                    i2 = 1312572832;
                    i3 = iM2761 ^ i2;
                    sArr4 = sArr4;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    sArr6 = sArr6;
                    c16392 = c16392;
                    i21 = i21;
                    sArr5 = sArr5;
                    i23 = i23;
                    i15 = i3;
                    activityC9458 = this;
                    break;
                case 695992499:
                case 765505760:
                    i23 = i23;
                    c16392 = c16392;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i21;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    C1564.m5518(activityC9458, C0619.m2761(strM4222) ^ 2124953318);
                    sArr4 = f30664;
                    if (C0950.f3488 < 0) {
                        int iM31617 = (i12 - C0773.m3169("ۘܿ")) * (-61);
                        i14 = ((iM31617 ^ i13) * (-13507)) ^ 228716127;
                        i3 = iM31617 ^ 1876012085;
                        sArr7 = sArr7;
                        sArr8 = sArr8;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        i21 = i21;
                        sArr5 = sArr5;
                        i23 = i23;
                        i15 = i3;
                        activityC9458 = this;
                    } else {
                        sArr = sArr5;
                        sArr7 = sArr7;
                        i23 = i23;
                        int iM31618 = (C0773.m3169("ܳ֡") ^ i13) * 75;
                        int i29 = ((iM31618 ^ i12) * 5293) ^ 10907213;
                        i15 = iM31618 ^ 1777206744;
                        sArr8 = sArr8;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        i21 = i21;
                        sArr5 = sArr;
                        i14 = i29;
                        activityC9458 = this;
                    }
                    break;
                case 727023460:
                case 1873949668:
                    i23 = i23;
                    c16392 = c16392;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i21;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    sArr4 = sArr4;
                    s = f30664[0];
                    s2 = 12880;
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i12;
                        i14 = ((iM2761 ^ i13) * (-24987)) ^ (-169378705);
                        i2 = 1426008591;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩸") ^ i12;
                        i14 = ((iM2761 ^ i13) * (-14847)) ^ (-92814707);
                        i2 = -583711860;
                    }
                    i3 = iM2761 ^ i2;
                    sArr4 = sArr4;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    sArr6 = sArr6;
                    c16392 = c16392;
                    i21 = i21;
                    sArr5 = sArr5;
                    i23 = i23;
                    i15 = i3;
                    activityC9458 = this;
                    break;
                case 808753883:
                case 877578363:
                    viewGroup = (ViewGroup) viewM5518;
                    activityC9458.f30666.m16965((View) viewGroup);
                    i9 = 0;
                    if (!C3779.m12264()) {
                        c16392 = c16392;
                        sArr6 = sArr6;
                        short[] sArr112 = sArr8;
                        sArr2 = sArr7;
                        i4 = i21;
                        sArr3 = sArr112;
                        iM2762 = C0619.m2761("ۘ᩸") ^ i13;
                        i5 = ((iM2762 ^ i12) * (-24895)) ^ 1425989242;
                        i6 = 1239298751;
                        i15 = iM2762 ^ i6;
                        i14 = i5;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        short[] sArr113 = sArr3;
                        i21 = i4;
                        sArr7 = sArr2;
                        sArr8 = sArr113;
                    } else {
                        iM2763 = (i13 - C0773.m3169("ᩴ֡")) * (-43);
                        i7 = ((iM2763 ^ i12) * (-31521)) ^ (-216641985);
                        i8 = -176264057;
                        i15 = iM2763 ^ i8;
                        i14 = i7;
                    }
                    break;
                case 929799972:
                case 1262514798:
                    if (AbstractC0641.m2813() > 0) {
                        i23 = i23;
                        c16392 = c16392;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i21;
                        sArr8 = sArr8;
                        sArr7 = sArr7;
                        sArr4 = sArr4;
                        iM2761 = C0619.m2761("ܰ۬") ^ i12;
                        i14 = ((iM2761 ^ i13) * (-24987)) ^ (-169378705);
                        i2 = 1426008591;
                        i3 = iM2761 ^ i2;
                        sArr4 = sArr4;
                        sArr7 = sArr7;
                        sArr8 = sArr8;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        i21 = i21;
                        sArr5 = sArr5;
                        i23 = i23;
                        i15 = i3;
                        activityC9458 = this;
                    } else {
                        c16392 = c16392;
                        sArr6 = sArr6;
                        short[] sArr114 = sArr8;
                        sArr2 = sArr7;
                        i4 = i21;
                        sArr3 = sArr114;
                        iM2762 = C0619.m2761("ۘ᩸") ^ i13;
                        i5 = ((iM2762 ^ i12) * (-24895)) ^ 1425989242;
                        i6 = 1239298751;
                        i15 = iM2762 ^ i6;
                        i14 = i5;
                        sArr6 = sArr6;
                        c16392 = c16392;
                        short[] sArr115 = sArr3;
                        i21 = i4;
                        sArr7 = sArr2;
                        sArr8 = sArr115;
                    }
                    break;
                case 1137487032:
                case 2093881193:
                    C16390 c16395 = c16392;
                    short[] sArr23 = sArr6;
                    short[] sArr24 = sArr8;
                    short[] sArr25 = sArr7;
                    short[] sArr26 = sArr5;
                    int i30 = i23;
                    viewM5519 = C1564.m5518(activityC9458, C0619.m2761(C2375.m8069(sArr26, i30, 3, i16)) ^ 2128972774);
                    int iM2766 = (C0619.m2761("۟ܺ") + i13) * (-91);
                    i15 = iM2766 ^ (-391870787);
                    i14 = ((iM2766 ^ i12) * 20731) ^ (-106830111);
                    sArr6 = sArr23;
                    c16392 = c16395;
                    i23 = i30;
                    sArr7 = sArr25;
                    sArr8 = sArr24;
                    i21 = i21;
                    sArr5 = sArr26;
                    break;
                default:
                    c16390 = c16392;
                    c16390.setNavigationIcon(iM2765 ^ i22);
                    c16391 = activityC9458.f56046;
                    viewOnClickListenerC7633 = new ViewOnClickListenerC7633(2, activityC9458);
                    int iM31619 = (i13 - C0773.m3169("᩶᩶")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM31619 ^ i12) * 18219) ^ (-1012148411);
                    i15 = iM31619 ^ (-1079928535);
                    i14 = i;
                    sArr6 = sArr6;
                    c16392 = c16390;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24835(ActivityC9458 activityC9458, int i, RunnableC11696 runnableC11696) {
        int i2 = -1670057323;
        int i3 = C3492.f12043;
        int i4 = C1321.f4751;
        int iM3169 = C0773.m3169("ܳ᩻") ^ i4;
        int i5 = ((iM3169 ^ i3) * 4551) ^ 507167208;
        int i6 = 2118046917;
        while (true) {
            i2 = ((((i2 ^ i3) * (-19677)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1945631984:
                case -620759002:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("᩺ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7749) ^ 328159987;
                        i6 = -1135394522;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۢۗ")) * 35;
                        i5 = ((iM3169 ^ i4) * 2619) ^ 1565551612;
                        i6 = -2049134653;
                    }
                    break;
                case -1740810428:
                case 2093114843:
                    if (!C3077.f9998) {
                        iM3169 = C0773.m3169("۫ۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7323) ^ 1690022165;
                        i6 = 2087884484;
                    } else {
                        iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 1339) ^ (-1237961399);
                        i6 = 252957193;
                    }
                    break;
                case -1694264494:
                case -885262497:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩺ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7749) ^ 328159987;
                        i6 = -1135394522;
                    } else {
                        iM3169 = C0773.m3169("ᩴܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-25795)) ^ (-1213154545);
                        i6 = -1224349555;
                    }
                    break;
                case -1680657694:
                case 1523364423:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("ۛ۟") ^ i3;
                        i5 = ((iM3169 ^ i4) * 5557) ^ (-1119572015);
                        i6 = 1865687670;
                    } else {
                        iM3169 = C0773.m3169("ᩳܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-19243)) ^ 1882115244;
                        i6 = -402260239;
                    }
                    break;
                case -1527755002:
                case 421516601:
                    if (i != activityC9458.f30667) {
                        iM3169 = C0619.m2761("᩸ۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 32625) ^ 1439075367;
                        i6 = 1359195774;
                    } else {
                        iM3169 = (C0619.m2761("۬ܿ") ^ i4) * 75;
                        i5 = ((iM3169 ^ i3) * 15769) ^ 1573862469;
                        i6 = -821909955;
                    }
                    break;
                case -1510844472:
                case -660147690:
                    if (C3998.m12920()) {
                        iM3169 = (i3 - C0619.m2761("ܽ۟")) * 79;
                        i5 = ((iM3169 ^ i4) * 28367) ^ (-320294122);
                        i6 = -741042660;
                    } else {
                        iM3169 = C0619.m2761("ۛ۟") ^ i3;
                        i5 = ((iM3169 ^ i4) * 5557) ^ (-1119572015);
                        i6 = 1865687670;
                    }
                    break;
                case -1339696275:
                case -83389771:
                    if (RunnableC1848.m6360()) {
                        iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 1339) ^ (-1237961399);
                        i6 = 252957193;
                    } else {
                        iM3169 = C0619.m2761("᩷ܰ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 30727) ^ 1352386936;
                        i6 = -1126338213;
                    }
                    break;
                case -1304578476:
                case 449356381:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۛ۟") ^ i3;
                        i5 = ((iM3169 ^ i4) * 5557) ^ (-1119572015);
                        i6 = 1865687670;
                    } else {
                        iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 1339) ^ (-1237961399);
                        i6 = 252957193;
                    }
                    break;
                case -1157335933:
                case 1059097565:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ۢ۠") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * 463) ^ 1051911683;
                        i6 = -160680576;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۘ") + i3) * 75;
                        i5 = ((iM3169 ^ i4) * (-27665)) ^ (-1424386619);
                        i6 = -1530831472;
                    }
                    break;
                case -622160655:
                case 1292695408:
                    C3448.m11248();
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (C0773.m3169("ۢ۠") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * 463) ^ 1051911683;
                        i6 = -160680576;
                    } else {
                        iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 1339) ^ (-1237961399);
                        i6 = 252957193;
                    }
                    break;
                case -505524386:
                case 1061551103:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("۫ۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7323) ^ 1690022165;
                        i6 = 2087884484;
                    } else {
                        iM3169 = (C0773.m3169("᩺᩸") ^ i4) * (-123);
                        i5 = ((iM3169 ^ i3) * 30861) ^ (-194611491);
                        i6 = 1749171595;
                    }
                    break;
                case 20900182:
                case 1412252627:
                    C3779.m12264();
                    iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 1339) ^ (-1237961399);
                    i6 = 252957193;
                    break;
                case 25846021:
                case 539508041:
                    runnableC11696.run();
                    C3033.m9852(activityC9458.f30672);
                    break;
                case 210709996:
                case 440833465:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("᩺ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7749) ^ 328159987;
                        i6 = -1135394522;
                    } else {
                        iM3169 = (i4 - C0773.m3169("֨᩹")) * (-41);
                        i5 = ((iM3169 ^ i3) * 21851) ^ 1376740875;
                        i6 = -358550715;
                    }
                    break;
                case 484865406:
                case 1497540339:
                    C2023.m6964();
                    C23916.m53419();
                    break;
                case 1123420632:
                case 1937209714:
                    break;
                case 1257882104:
                case 1318984365:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ۢ۠") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * 463) ^ 1051911683;
                        i6 = -160680576;
                    } else {
                        iM3169 = C0773.m3169("ܺۗ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 26027) ^ (-1898268909);
                        i6 = 2087174528;
                    }
                    break;
                default:
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("ۢ۠") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * 463) ^ 1051911683;
                        i6 = -160680576;
                    } else {
                        iM3169 = C0773.m3169("ܳ۫") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-1117)) ^ (-1658279525);
                        i6 = -2010822605;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        short s;
        int iM31610;
        int i5;
        int iM2762;
        int i6;
        int i7;
        int iM31611;
        int i8;
        int i9;
        int iM2763;
        int i10;
        int i11;
        int i12;
        ActivityC9458 activityC9458 = this;
        int i13 = C0487.f2131;
        int i14 = C0269.f1558;
        int iM2764 = C0619.m2761("ᩴ֫") ^ i14;
        int i15 = ((iM2764 ^ i13) * 16123) ^ (-1937850800);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i16 = iM2764 ^ 1113565978;
        int iM8344 = 0;
        int i17 = 0;
        Intent intent = null;
        int i18 = 0;
        char c = 0;
        short s2 = 0;
        int i19 = 0;
        int i20 = -1066528982;
        int i21 = 0;
        String strM53420 = null;
        String strM2756 = null;
        String strM12149 = null;
        Intent intent2 = null;
        Object obj = null;
        Iterator itM4942 = null;
        ArrayList arrayList = null;
        boolean z = false;
        while (true) {
            i20 = i16 ^ (i15 & (((i20 ^ i13) * 12559) >> 31));
            switch (i20) {
                case -2130695489:
                case -53583816:
                    sArr3 = f30664;
                    i18 = 59;
                    if (!C2702.m8876()) {
                        z = z;
                        arrayList = arrayList;
                        s = s2;
                        sArr2 = sArr2;
                        i21 = i21;
                        int iM2765 = (C0619.m2761("ܺܶ") ^ i13) * (-53);
                        i6 = ((iM2765 ^ i14) * 18109) ^ 1987212997;
                        i9 = iM2765 ^ (-1007065432);
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        intent = null;
                        i16 = i9;
                        i15 = i6;
                        activityC9458 = this;
                    } else {
                        iM31610 = C0619.m2761("֨۠") ^ i14;
                        i3 = ((iM31610 ^ i13) * (-12111)) ^ (-1014780514);
                        i5 = 1794044161;
                        i16 = iM31610 ^ i5;
                        i15 = i3;
                    }
                    break;
                case -2071105212:
                case 1935021328:
                    C2287.m7745();
                    C2485.m8357();
                    return false;
                case -1989012698:
                case -1855499351:
                    z = z;
                    arrayList = arrayList;
                    if (iM8344 != (C0619.m2761(strM2756) ^ 2128701641)) {
                        sArr2 = sArr2;
                        i21 = i21;
                        iM2761 = C0619.m2761("᩺᩶") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-29915)) ^ 1488766892;
                        i4 = -1197024789;
                        int i22 = iM2761 ^ i4;
                        sArr2 = sArr2;
                        i21 = i21;
                        z = z;
                        arrayList = arrayList;
                        i16 = i22;
                        i15 = i3;
                    } else {
                        iM3169 = C0773.m3169("۬۠") ^ i13;
                        i = ((iM3169 ^ i14) * (-23839)) ^ 1582186655;
                        i2 = 874309663;
                        i12 = iM3169 ^ i2;
                        arrayList = arrayList;
                        boolean z2 = z;
                        i16 = i12;
                        i15 = i;
                        z = z2;
                    }
                    break;
                case -1960758147:
                case 1513795285:
                    z = z;
                    arrayList = arrayList;
                    short[] sArr4 = sArr2;
                    int i23 = i21;
                    s2 = sArr[c];
                    i19 = s2 * s2;
                    if (C3734.f12817 >= 0) {
                        iM31611 = (i14 - C0619.m2761("֨ۡ")) * 47;
                        i6 = ((iM31611 ^ i13) * (-18347)) ^ (-2147029387);
                        i8 = -1131944477;
                    } else {
                        iM31611 = C0773.m3169("ܶۖ") ^ i14;
                        i6 = ((iM31611 ^ i13) * 12573) ^ (-767662328);
                        i8 = 1069504334;
                    }
                    i9 = iM31611 ^ i8;
                    sArr2 = sArr4;
                    i21 = i23;
                    z = z;
                    arrayList = arrayList;
                    i16 = i9;
                    i15 = i6;
                    activityC9458 = this;
                    break;
                case -1919294470:
                case 2032751780:
                    z = z;
                    arrayList = arrayList;
                    strM2756 = C0619.m2756(f30664, 30, 3, i17);
                    if (C1146.f4234 < 0) {
                        iM3169 = C0619.m2761("ۨۛ") ^ i13;
                        i = ((iM3169 ^ i14) * (-15871)) ^ (-44782725);
                        i2 = -1643935539;
                        i12 = iM3169 ^ i2;
                        arrayList = arrayList;
                        boolean z3 = z;
                        i16 = i12;
                        i15 = i;
                        z = z3;
                    } else {
                        s = s2;
                        sArr2 = sArr2;
                        i21 = i21;
                        iM2762 = C0619.m2761("۠ܽ") ^ i13;
                        i6 = ((iM2762 ^ i14) * (-7089)) ^ (-1704509582);
                        i7 = 827527245;
                        i9 = iM2762 ^ i7;
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        i16 = i9;
                        i15 = i6;
                        activityC9458 = this;
                    }
                    break;
                case -1893270725:
                case 669253822:
                    ArrayList arrayList2 = arrayList;
                    z = true;
                    if (iM8344 == (C0773.m3169(strM12149) ^ 2121561307)) {
                        iM2763 = C0619.m2761("۬ܿ") ^ i14;
                        i10 = ((iM2763 ^ i13) * (-17505)) ^ 170108774;
                        i11 = 1725741172;
                    } else {
                        iM2763 = (C0619.m2761("᩻ۛ") + i13) * 127;
                        i10 = ((iM2763 ^ i14) * (-24877)) ^ 1567945995;
                        i11 = 794102482;
                    }
                    i16 = iM2763 ^ i11;
                    i15 = i10;
                    arrayList = arrayList2;
                    break;
                case -1889604596:
                case -313574132:
                    z = z;
                    arrayList = arrayList;
                    iM8344 = C2485.m8344(menuItem);
                    sArr2 = f30664;
                    i21 = 27;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("᩺۫") ^ i13;
                        i = ((iM3169 ^ i14) * 29673) ^ 490377202;
                        i2 = -1812001299;
                    } else {
                        iM3169 = C0619.m2761("ۚ᩷") ^ i14;
                        i = ((iM3169 ^ i13) * (-4417)) ^ (-1630523300);
                        i2 = 181688888;
                    }
                    i12 = iM3169 ^ i2;
                    arrayList = arrayList;
                    boolean z4 = z;
                    i16 = i12;
                    i15 = i;
                    z = z4;
                    break;
                case -1746727224:
                case -688772893:
                    return false;
                case -1346132802:
                case 1403382625:
                    intent2 = new Intent(activityC9458, (Class<?>) ActivityC25343.class);
                    if (C3734.f12817 < 0) {
                        iM31610 = C0619.m2761("ۗ۠") ^ i13;
                        i3 = ((iM31610 ^ i14) * (-27399)) ^ 181016313;
                        i5 = -339739191;
                        i16 = iM31610 ^ i5;
                        i15 = i3;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        s = s2;
                        sArr2 = sArr2;
                        i21 = i21;
                        iM2762 = C0619.m2761("۠ܽ") ^ i13;
                        i6 = ((iM2762 ^ i14) * (-7089)) ^ (-1704509582);
                        i7 = 827527245;
                        i9 = iM2762 ^ i7;
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        i16 = i9;
                        i15 = i6;
                        activityC9458 = this;
                    }
                    break;
                case -1259421440:
                case 630336762:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i21 = i21;
                    strM12149 = C3734.m12149(sArr2, i21, 3, i17);
                    if (C2419.f7754 < 0) {
                        iM2761 = C0773.m3169("᩻֫") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-17029)) ^ (-2121191160);
                        i4 = 144810545;
                        int i24 = iM2761 ^ i4;
                        sArr2 = sArr2;
                        i21 = i21;
                        z = z;
                        arrayList = arrayList;
                        i16 = i24;
                        i15 = i3;
                    } else {
                        s = s2;
                        iM2762 = C0619.m2761("۠ܽ") ^ i13;
                        i6 = ((iM2762 ^ i14) * (-7089)) ^ (-1704509582);
                        i7 = 827527245;
                        i9 = iM2762 ^ i7;
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        i16 = i9;
                        i15 = i6;
                        activityC9458 = this;
                    }
                    break;
                case -1257388415:
                case -267693275:
                    if (C23522.m52715(arrayList)) {
                        iM31610 = (C0773.m3169("᩸᩶") ^ i13) * (-59);
                        i3 = ((iM31610 ^ i14) * (-18365)) ^ (-1295093700);
                        i5 = 930353984;
                    } else {
                        iM31610 = (C0773.m3169("ۢ᩹") ^ i13) * (-23);
                        i3 = ((iM31610 ^ i14) * (-19135)) ^ (-1896997131);
                        i5 = 20541217;
                    }
                    i16 = iM31610 ^ i5;
                    i15 = i3;
                    break;
                case -1074550201:
                case 1947295076:
                    return z;
                case -882787618:
                case 1686077691:
                    i17 = 18441;
                    iM2761 = (C0619.m2761("ᩳ۬") ^ i13) * 7;
                    i3 = ((iM2761 ^ i14) * 16795) ^ (-974909399);
                    i4 = 1317174253;
                    int i25 = iM2761 ^ i4;
                    sArr2 = sArr2;
                    i21 = i21;
                    z = z;
                    arrayList = arrayList;
                    i16 = i25;
                    i15 = i3;
                    break;
                case -804346956:
                case -784747524:
                    C2834.m9344();
                    C2375.m8065();
                    z = z;
                    arrayList = arrayList;
                    iM3169 = C0773.m3169("᩺۫") ^ i13;
                    i = ((iM3169 ^ i14) * 29673) ^ 490377202;
                    i2 = -1812001299;
                    i12 = iM3169 ^ i2;
                    arrayList = arrayList;
                    boolean z5 = z;
                    i16 = i12;
                    i15 = i;
                    z = z5;
                    break;
                case -793425174:
                case 649393719:
                    C17202.m40371(C0773.m3169(strM53420) ^ 2124336334);
                    return z;
                case -743030935:
                case -328781875:
                    C1343.m4943();
                    if (C2419.f7754 >= 0) {
                        z = z;
                        arrayList = arrayList;
                        s = s2;
                        sArr2 = sArr2;
                        i21 = i21;
                        int iM2766 = (C0619.m2761("ܺܶ") ^ i13) * (-53);
                        i6 = ((iM2766 ^ i14) * 18109) ^ 1987212997;
                        i9 = iM2766 ^ (-1007065432);
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        intent = null;
                        i16 = i9;
                        i15 = i6;
                        activityC9458 = this;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        iM3169 = C0773.m3169("᩺۫") ^ i13;
                        i = ((iM3169 ^ i14) * 29673) ^ 490377202;
                        i2 = -1812001299;
                        i12 = iM3169 ^ i2;
                        arrayList = arrayList;
                        boolean z6 = z;
                        i16 = i12;
                        i15 = i;
                        z = z6;
                    }
                    break;
                case -727630875:
                case 1999318637:
                    z = z;
                    arrayList = arrayList;
                    s = s2;
                    sArr2 = sArr2;
                    i21 = i21;
                    c = 26;
                    if (C3077.f9998) {
                        iM2762 = (C0773.m3169("ۢ۬") + i13) * (-45);
                        i6 = ((iM2762 ^ i14) * 7) ^ 2092565575;
                        i7 = 1808724923;
                    } else {
                        iM2762 = C0619.m2761("۠ܽ") ^ i13;
                        i6 = ((iM2762 ^ i14) * (-7089)) ^ (-1704509582);
                        i7 = 827527245;
                    }
                    i9 = iM2762 ^ i7;
                    sArr2 = sArr2;
                    i21 = i21;
                    s2 = s;
                    z = z;
                    arrayList = arrayList;
                    i16 = i9;
                    i15 = i6;
                    activityC9458 = this;
                    break;
                case -659675189:
                case -437208506:
                    strM53420 = C23916.m53420(f30664, 77, 3, i17);
                    if (C4282.f15546 > 0) {
                        iM31610 = (C0619.m2761("۠ۖ") ^ i14) * (-73);
                        i3 = ((iM31610 ^ i13) * 9843) ^ (-2078199800);
                        i5 = -1572711240;
                        i16 = iM31610 ^ i5;
                        i15 = i3;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        s = s2;
                        sArr2 = sArr2;
                        i21 = i21;
                        int iM2767 = (C0619.m2761("ܺܶ") ^ i13) * (-53);
                        i6 = ((iM2767 ^ i14) * 18109) ^ 1987212997;
                        i9 = iM2767 ^ (-1007065432);
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        intent = null;
                        i16 = i9;
                        i15 = i6;
                        activityC9458 = this;
                    }
                    break;
                case -608102019:
                case 1799228356:
                    try {
                        C3033.m9858(activityC9458, intent);
                        iM31610 = C0619.m2761("ܺܰ") ^ i14;
                        i3 = ((iM31610 ^ i13) * 10113) ^ 1988112530;
                        i5 = 1532437069;
                        i16 = iM31610 ^ i5;
                    } catch (Throwable th) {
                        int iM31612 = C0773.m3169("ۧۤ") ^ i14;
                        i3 = ((iM31612 ^ i13) * 21313) ^ 540357212;
                        i16 = iM31612 ^ 1438015293;
                        obj = th;
                    }
                    i15 = i3;
                    break;
                case -445766206:
                case 1080933196:
                    RunnableC0334.m2054(arrayList, C20932.m47852((C11192) C0950.m3796(itM4942)));
                    int iM31613 = (C0773.m3169("᩵᩶") ^ i14) * 85;
                    i = ((iM31613 ^ i13) * 25733) ^ 1345192202;
                    i12 = iM31613 ^ (-228806910);
                    boolean z7 = z;
                    i16 = i12;
                    i15 = i;
                    z = z7;
                    break;
                case -427770332:
                case 1286084198:
                    RunnableC3646.m11813();
                    if (C23916.f77426 <= 0) {
                        iM31610 = C0773.m3169("ܰܺ") ^ i14;
                        i3 = ((iM31610 ^ i13) * (-32381)) ^ 1606659823;
                        i5 = -25178647;
                        i16 = iM31610 ^ i5;
                        i15 = i3;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        iM3169 = C0773.m3169("᩺۫") ^ i13;
                        i = ((iM3169 ^ i14) * 29673) ^ 490377202;
                        i2 = -1812001299;
                        i12 = iM3169 ^ i2;
                        arrayList = arrayList;
                        boolean z8 = z;
                        i16 = i12;
                        i15 = i;
                        z = z8;
                    }
                    break;
                case -424730933:
                case -358413398:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i21 = i21;
                    if (C7685.m20925()) {
                        iM2761 = (i13 - C0619.m2761("ܰۚ")) * (-127);
                        i3 = ((iM2761 ^ i14) * 3575) ^ (-831604473);
                        i4 = -798931358;
                    } else {
                        iM2761 = C0619.m2761("᩺᩶") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-29915)) ^ 1488766892;
                        i4 = -1197024789;
                    }
                    int i26 = iM2761 ^ i4;
                    sArr2 = sArr2;
                    i21 = i21;
                    z = z;
                    arrayList = arrayList;
                    i16 = i26;
                    i15 = i3;
                    break;
                case -388397892:
                case 639798024:
                    C0950.m3785();
                    if (RunnableC1848.m6360()) {
                        iM31610 = C0773.m3169("ܰܺ") ^ i14;
                        i3 = ((iM31610 ^ i13) * (-32381)) ^ 1606659823;
                        i5 = -25178647;
                    } else {
                        iM31610 = (C0619.m2761("۫᩸") ^ i14) * (-39);
                        i3 = ((iM31610 ^ i13) * (-12223)) ^ 1944871454;
                        i5 = 535837771;
                    }
                    i16 = iM31610 ^ i5;
                    i15 = i3;
                    break;
                case -298753050:
                case 290692313:
                    if (C2834.f9334 > 0) {
                        z = z;
                        arrayList = arrayList;
                        s = s2;
                        sArr2 = sArr2;
                        i21 = i21;
                        iM2762 = C0619.m2761("۠ܽ") ^ i13;
                        i6 = ((iM2762 ^ i14) * (-7089)) ^ (-1704509582);
                        i7 = 827527245;
                        i9 = iM2762 ^ i7;
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        i16 = i9;
                        i15 = i6;
                        activityC9458 = this;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        iM3169 = C0773.m3169("᩺۫") ^ i13;
                        i = ((iM3169 ^ i14) * 29673) ^ 490377202;
                        i2 = -1812001299;
                        i12 = iM3169 ^ i2;
                        arrayList = arrayList;
                        boolean z9 = z;
                        i16 = i12;
                        i15 = i;
                        z = z9;
                    }
                    break;
                case -55015881:
                case 1168695078:
                    intent2.putExtra(C2354.m7980(sArr3, i18, 18, i17), arrayList);
                    RunnableC1848.m6363(activityC9458, intent2);
                    return z;
                case 181959282:
                case 1830423218:
                    z = z;
                    arrayList = arrayList;
                    s = s2;
                    sArr2 = sArr2;
                    i21 = i21;
                    sArr = f30664;
                    if (C3734.m12152() >= 0) {
                        int iM2768 = (C0619.m2761("ܺܶ") ^ i13) * (-53);
                        i6 = ((iM2768 ^ i14) * 18109) ^ 1987212997;
                        i9 = iM2768 ^ (-1007065432);
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        intent = null;
                    } else {
                        iM2762 = (C0619.m2761("֨ܰ") ^ i14) * (-7);
                        i6 = ((iM2762 ^ i13) * (-14815)) ^ 1894175791;
                        i7 = 1639285306;
                        i9 = iM2762 ^ i7;
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                    }
                    i16 = i9;
                    i15 = i6;
                    activityC9458 = this;
                    break;
                case 284764465:
                case 855210386:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i21 = i21;
                    s = s2;
                    if ((s * 16656) - (i19 + 69355584) > 0) {
                        iM2762 = (C0619.m2761("֨ۤ") + i14) * (-93);
                        i6 = ((iM2762 ^ i13) * 11479) ^ (-1954049398);
                        i7 = -1217984502;
                    } else {
                        iM2762 = (C0773.m3169("ᩳ᩷") ^ i13) * 93;
                        i6 = ((iM2762 ^ i14) * 7569) ^ (-2036072841);
                        i7 = -1667984300;
                    }
                    i9 = iM2762 ^ i7;
                    sArr2 = sArr2;
                    i21 = i21;
                    s2 = s;
                    z = z;
                    arrayList = arrayList;
                    i16 = i9;
                    i15 = i6;
                    activityC9458 = this;
                    break;
                case 419030616:
                case 1933157356:
                    i17 = 56116;
                    iM2761 = (C0619.m2761("ᩳ۬") ^ i13) * 7;
                    i3 = ((iM2761 ^ i14) * 16795) ^ (-974909399);
                    i4 = 1317174253;
                    int i27 = iM2761 ^ i4;
                    sArr2 = sArr2;
                    i21 = i21;
                    z = z;
                    arrayList = arrayList;
                    i16 = i27;
                    i15 = i3;
                    break;
                case 594375283:
                case 1213325311:
                    Uri uri = Uri.parse(C13047.m32508());
                    short[] sArr5 = f30664;
                    if (C1321.f4751 < 0) {
                        z = z;
                        arrayList = arrayList;
                        intent = new Intent(C2834.m9343(sArr5, 33, 26, i17), uri);
                        iM3169 = C0619.m2761("ۜ᩻") ^ i13;
                        i = ((iM3169 ^ i14) * (-23933)) ^ 812375793;
                        i2 = -860835462;
                        i12 = iM3169 ^ i2;
                        arrayList = arrayList;
                        boolean z10 = z;
                        i16 = i12;
                        i15 = i;
                        z = z10;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        s = s2;
                        sArr2 = sArr2;
                        i21 = i21;
                        int iM2769 = (C0619.m2761("ܺܶ") ^ i13) * (-53);
                        i6 = ((iM2769 ^ i14) * 18109) ^ 1987212997;
                        i9 = iM2769 ^ (-1007065432);
                        sArr2 = sArr2;
                        i21 = i21;
                        s2 = s;
                        z = z;
                        arrayList = arrayList;
                        intent = null;
                        i16 = i9;
                        i15 = i6;
                        activityC9458 = this;
                    }
                    break;
                case 1190298105:
                case 2062556159:
                    RunnableC3055.m9930(activityC9458, obj, null);
                    return z;
                case 1234894264:
                case 1440663410:
                    arrayList = new ArrayList();
                    itM4942 = C1343.m4942(activityC9458.f30671);
                    int iM31614 = (C0773.m3169("᩵᩶") ^ i14) * 85;
                    i = ((iM31614 ^ i13) * 25733) ^ 1345192202;
                    i12 = iM31614 ^ (-228806910);
                    boolean z11 = z;
                    i16 = i12;
                    i15 = i;
                    z = z11;
                    break;
                default:
                    if (C3998.m12923(itM4942)) {
                        iM31610 = (i13 - C0619.m2761("۠ۤ")) * (-105);
                        i3 = ((iM31610 ^ i14) * 27563) ^ 1769201535;
                        i5 = 579448704;
                    } else {
                        iM31610 = C0773.m3169("֡֫") ^ i14;
                        i3 = ((iM31610 ^ i13) * 11035) ^ 2044610843;
                        i5 = -1706300748;
                    }
                    i16 = iM31610 ^ i5;
                    i15 = i3;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24836(ActivityC9458 activityC9458, Runnable runnable) {
        int i = 666240528;
        int i2 = C3734.f12817;
        int i3 = C1080.f3865;
        int iM2761 = C0619.m2761("ܿۨ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 9843) ^ (-67654747);
        int i5 = -1083487458;
        while (true) {
            i = ((((i ^ i2) * (-29019)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2059635874:
                case -61387174:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7273) ^ 2021073822;
                        i5 = -809198033;
                    } else {
                        iM2761 = C0773.m3169("۟ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1871)) ^ (-1691502098);
                        i5 = 1217229905;
                    }
                    break;
                case -2056375930:
                case -1813251744:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7273) ^ 2021073822;
                        i5 = -809198033;
                    } else {
                        iM2761 = (C0619.m2761("᩵᩷") + i2) * (-5);
                        i4 = ((iM2761 ^ i3) * 28779) ^ (-203147469);
                        i5 = 1394063434;
                    }
                    break;
                case -1918141535:
                case -482539158:
                    C2288.m7767();
                    C13473.m33144();
                    break;
                case -1813240672:
                case 59187880:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7273) ^ 2021073822;
                        i5 = -809198033;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩻ܽ")) * 63;
                        i4 = ((iM2761 ^ i2) * 2919) ^ (-1784219394);
                        i5 = 509517776;
                    }
                    break;
                case -1475060114:
                case 2011541706:
                    C2023.m6957(runnable);
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ۨܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17115)) ^ 692992252;
                        i5 = -1476026187;
                    } else {
                        iM2761 = C0619.m2761("ܽ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15947)) ^ (-1060700637);
                        i5 = -1768486369;
                    }
                    break;
                case -1218822112:
                case -378228043:
                    if (!C2023.f6737) {
                        iM2761 = C0619.m2761("ۧᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29841)) ^ 364059013;
                        i5 = -1792757542;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩻ܽ")) * 63;
                        i4 = ((iM2761 ^ i2) * 2919) ^ (-1784219394);
                        i5 = 509517776;
                    }
                    break;
                case -934987916:
                case 1882942405:
                    if (C2310.m7813() <= 0) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7273) ^ 2021073822;
                        i5 = -809198033;
                    } else {
                        iM2761 = C0619.m2761("֡֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17899)) ^ (-440005048);
                        i5 = -1715940349;
                    }
                    break;
                case -631929286:
                case 921977368:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7273) ^ 2021073822;
                        i5 = -809198033;
                    } else {
                        iM2761 = (i2 - C0773.m3169("֡ۨ")) * (-29);
                        i4 = ((iM2761 ^ i3) * (-16777)) ^ (-1054507594);
                        i5 = -512069652;
                    }
                    break;
                case -231422215:
                case 3444239:
                    C1080.m4050();
                    C2485.m8357();
                    iM2761 = (i3 - C0619.m2761("᩻ܽ")) * 63;
                    i4 = ((iM2761 ^ i2) * 2919) ^ (-1784219394);
                    i5 = 509517776;
                    break;
                case -22092881:
                case 439241547:
                    if (C0619.m2763()) {
                        iM2761 = (i3 - C0619.m2761("᩻ܽ")) * 63;
                        i4 = ((iM2761 ^ i2) * 2919) ^ (-1784219394);
                        i5 = 509517776;
                    } else {
                        iM2761 = (C0619.m2761("ܺܽ") + i3) * 95;
                        i4 = ((iM2761 ^ i2) * 11349) ^ 697657485;
                        i5 = -1558894975;
                    }
                    break;
                case 64467050:
                case 185638931:
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("ۧᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29841)) ^ 364059013;
                        i5 = -1792757542;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܿۜ")) * 73;
                        i4 = ((iM2761 ^ i2) * 13189) ^ (-455111290);
                        i5 = 670604269;
                    }
                    break;
                case 346170918:
                case 1329916808:
                    C3099.m10095();
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("ۧᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29841)) ^ 364059013;
                        i5 = -1792757542;
                    } else {
                        iM2761 = C0619.m2761("᩵᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26473) ^ (-906014744);
                        i5 = 575258685;
                    }
                    break;
                case 1024832327:
                case 2002363769:
                    C3033.m9852(activityC9458.f30672);
                    break;
                case 1166857587:
                case 1433113115:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("ܽ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15947)) ^ (-1060700637);
                        i5 = -1768486369;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۤۚ")) * (-17);
                        i4 = ((iM2761 ^ i2) * 2523) ^ (-385030508);
                        i5 = 1838509572;
                    }
                    break;
                case 1238314962:
                case 1678637695:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("ۧᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29841)) ^ 364059013;
                        i5 = -1792757542;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۡۛ")) * (-13);
                        i4 = ((iM2761 ^ i3) * (-29791)) ^ (-1367720511);
                        i5 = -1868673470;
                    }
                    break;
                default:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ܽ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15947)) ^ (-1060700637);
                        i5 = -1768486369;
                    } else {
                        iM2761 = C0773.m3169("ۜܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27619)) ^ 309810952;
                        i5 = -309145837;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[PHI: r6
      0x00bc: PHI (r6v8 l.֫ܶ֫) = (r6v4 l.֫ܶ֫), (r6v7 l.֫ܶ֫), (r6v4 l.֫ܶ֫) binds: [B:34:0x00ba, B:30:0x009d, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x016b  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c6  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24845(ActivityC9458 activityC9458, int i, RunnableC11696 runnableC11696) {
        int iM2761;
        int i2;
        int i3 = -738511920;
        int i4 = C3099.f10023;
        int i5 = C2354.f7599;
        int iM2762 = C0619.m2761("֨ۘ") ^ i5;
        int i6 = ((iM2762 ^ i4) * 12609) ^ (-1908973068);
        int i7 = -2096467177;
        while (true) {
            int i8 = iM2762 ^ i7;
            RunnableC2002 runnableC2002 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-9405)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2135778288:
                    case 848870655:
                        if (C2966.f9654 >= 0) {
                            iM2761 = C0773.m3169("ۢ᩹") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-18805)) ^ 123016837;
                            i2 = -1492466544;
                        } else {
                            iM2761 = C0773.m3169("᩹۬") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-9325)) ^ (-540643390);
                            i2 = -1153371917;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1776772751:
                    case 544096965:
                        C2310.m7813();
                        if (C3033.f9831 >= 0) {
                            iM2761 = (C0773.m3169("ۘ֡") ^ i4) * 39;
                            i6 = ((iM2761 ^ i5) * (-19903)) ^ 476190552;
                            i2 = 1552365904;
                        } else {
                            iM2761 = (i5 - C0619.m2761("ۙ᩵")) * (-15);
                            i6 = ((iM2761 ^ i4) * 23945) ^ 375654844;
                            i2 = -1691885311;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1698175093:
                    case 290098325:
                        if (RunnableC3055.m9933() == 0) {
                            iM2761 = (C0773.m3169("ۘ֡") ^ i4) * 39;
                            i6 = ((iM2761 ^ i5) * (-19903)) ^ 476190552;
                            i2 = 1552365904;
                        } else {
                            iM2761 = (C0619.m2761("ܽܰ") ^ i5) * (-91);
                            i6 = ((iM2761 ^ i4) * 5057) ^ 1635853272;
                            i2 = -1098978238;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1188477879:
                    case 155162986:
                        if (C2287.m7745() <= 0) {
                            iM2761 = (C0619.m2761("ܽܰ") ^ i5) * (-91);
                            i6 = ((iM2761 ^ i4) * 5057) ^ 1635853272;
                            i2 = -1098978238;
                        } else {
                            iM2761 = (C0619.m2761("᩵ۖ") + i4) * 49;
                            i6 = ((iM2761 ^ i5) * 971) ^ (-1587466525);
                            i2 = 431419541;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1163972514:
                    case 1990863123:
                        if (activityC9458.f30666.isComputingLayout()) {
                            iM2761 = (C0619.m2761("᩵᩹") + i4) * (-123);
                            i6 = ((iM2761 ^ i5) * (-20615)) ^ (-1177226170);
                            i2 = -1330506741;
                        } else {
                            iM2761 = (C0619.m2761("ۧ᩺") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i6 = ((iM2761 ^ i5) * (-25267)) ^ (-1451978317);
                            i2 = 306177572;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1133194652:
                    case 1814358356:
                        if (C2354.f7599 >= 0) {
                            iM2761 = (C0773.m3169("ۘ֡") ^ i4) * 39;
                            i6 = ((iM2761 ^ i5) * (-19903)) ^ 476190552;
                            i2 = 1552365904;
                        } else {
                            iM2761 = C0619.m2761("ܿ۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-24587)) ^ 772284532;
                            i2 = -1721796745;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -963355837:
                    case 91029947:
                        if (C1783.f6087 > 0) {
                            iM2761 = (i4 - C0619.m2761("ܳᩳ")) * (-9);
                            i6 = ((iM2761 ^ i5) * 4543) ^ (-1261643799);
                            i2 = 1705995258;
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case -829940366:
                    case 1935539441:
                        if (RunnableC3055.m9933() != 0) {
                            iM2761 = (i5 - C0619.m2761("ۙ᩵")) * (-15);
                            i6 = ((iM2761 ^ i4) * 23945) ^ 375654844;
                            i2 = -1691885311;
                        } else {
                            iM2761 = C0773.m3169("᩻ۘ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-26935)) ^ 1640277366;
                            i2 = -1492606529;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -485412378:
                    case -28461701:
                        if (C3077.f9998) {
                            iM2761 = C0773.m3169("֡᩻") ^ i5;
                            i6 = ((iM2761 ^ i4) * 4435) ^ (-2087585785);
                            i2 = 1592319000;
                        } else {
                            iM2761 = C0773.m3169("ۢ᩹") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-18805)) ^ 123016837;
                            i2 = -1492466544;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -407322664:
                    case 671373401:
                        C23916.m53419();
                        iM2761 = C0773.m3169("ۢ᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-18805)) ^ 123016837;
                        i2 = -1492466544;
                        i8 = iM2761 ^ i2;
                        break;
                    case -291341851:
                    case 325766327:
                        if (RunnableC3055.f9898 >= 0) {
                            iM2761 = (i5 - C0619.m2761("ۙ᩵")) * (-15);
                            i6 = ((iM2761 ^ i4) * 23945) ^ 375654844;
                            i2 = -1691885311;
                        } else {
                            iM2761 = (i5 - C0619.m2761("᩵ܿ")) * 73;
                            i6 = ((iM2761 ^ i4) * 6967) ^ (-1796446776);
                            i2 = -320695403;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -248066494:
                    case 707152620:
                        int i9 = 0;
                        if (!C17202.f56030) {
                        }
                        runnableC2002 = new RunnableC2002(i, i9, activityC9458, runnableC11696);
                        activityC9458.f30666.stopScroll();
                        if (C2834.f9334 <= 0) {
                            iM2761 = (C0619.m2761("ܽܰ") ^ i5) * (-91);
                            i6 = ((iM2761 ^ i4) * 5057) ^ 1635853272;
                            i2 = -1098978238;
                        } else {
                            iM2761 = (C0619.m2761("᩶ۚ") + i5) * (-111);
                            i6 = ((iM2761 ^ i4) * (-8335)) ^ (-396245473);
                            i2 = 308223207;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                        break;
                    case -126520765:
                    case 314252731:
                        runnableC2002.run();
                        break;
                    case -10919804:
                    case 258082225:
                        if (!C0619.f2439) {
                            iM2761 = (C0773.m3169("᩷ۧ") + i5) * (-91);
                            i6 = ((iM2761 ^ i4) * (-25969)) ^ 289604938;
                            i2 = -1064145612;
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case 115009177:
                    case 929702615:
                        C0619.m2763();
                        C3690.m11987();
                        break;
                    case 229020508:
                    case 334858413:
                        C4238.m13540();
                        if (AbstractC3624.f12429 > 0) {
                            iM2761 = C0773.m3169("ۢ᩹") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-18805)) ^ 123016837;
                            i2 = -1492466544;
                        } else {
                            iM2761 = (C0773.m3169("ۘ֡") ^ i4) * 39;
                            i6 = ((iM2761 ^ i5) * (-19903)) ^ 476190552;
                            i2 = 1552365904;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    default:
                        activityC9458.f30666.post(runnableC2002);
                        break;
                }
                return;
            }
            iM2762 = (i4 - C0619.m2761("ܶܺ")) * 37;
            i6 = ((iM2762 ^ i5) * (-195)) ^ (-2124591354);
            i7 = -474834481;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x019a  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4 A[PHI: r6
      0x01c4: PHI (r6v5 l.ۢۗۧ) = (r6v4 l.ۢۗۧ), (r6v6 l.ۢۗۧ) binds: [B:62:0x01c2, B:34:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24846(ActivityC9458 activityC9458, Runnable runnable) {
        int iM2761;
        int i;
        int i2 = 713508315;
        int i3 = C1564.f5401;
        int i4 = C1826.f6190;
        int iM3169 = (i3 - C0773.m3169("ᩳܳ")) * (-119);
        int i5 = ((iM3169 ^ i4) * 23255) ^ (-1252746506);
        int i6 = -1392339116;
        while (true) {
            int i7 = iM3169 ^ i6;
            RunnableC9840 runnableC9840 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 31107) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2091599827:
                    case -1620787798:
                        if (C20932.f66974 > 0) {
                            iM2761 = (C0619.m2761("۬ۚ") ^ i4) * (-53);
                            i5 = ((iM2761 ^ i3) * 26633) ^ 194277285;
                            i = 373682905;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -1854030788:
                    case -654628020:
                        if (RunnableC3055.f9898 >= 0) {
                            iM2761 = (C0773.m3169("۠ܽ") ^ i3) * (-79);
                            i5 = ((iM2761 ^ i4) * (-25899)) ^ (-947703924);
                            i = -1225425658;
                        } else {
                            iM2761 = (C0773.m3169("ۢܰ") ^ i3) * (-57);
                            i5 = ((iM2761 ^ i4) * (-23735)) ^ 619511247;
                            i = -1749736631;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1827194952:
                    case -624850782:
                        runnableC9840.run();
                        break;
                    case -1650024824:
                    case 640950361:
                        AbstractC0116.m1243();
                        iM2761 = C0773.m3169("ܰۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 2819) ^ (-980296878);
                        i = 732748262;
                        i7 = iM2761 ^ i;
                        break;
                    case -1444673793:
                    case -156460579:
                        if (C2834.f9334 <= 0) {
                            iM2761 = (C0619.m2761("᩻۟") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM2761 ^ i4) * (-22707)) ^ 948740316;
                            i = -2136293605;
                        } else {
                            iM2761 = C0619.m2761("ۘ֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-20861)) ^ 1143032792;
                            i = 21019309;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1384253207:
                    case 1737724276:
                        if (C13473.f42873 == 0) {
                            runnableC9840 = new RunnableC9840(4, activityC9458, runnable);
                            if (C3690.f12684 <= 0) {
                                iM2761 = (C0619.m2761("᩻۟") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i5 = ((iM2761 ^ i4) * (-22707)) ^ 948740316;
                                i = -2136293605;
                            } else {
                                iM2761 = (C0619.m2761("᩺֡") + i3) * 109;
                                i5 = ((iM2761 ^ i4) * (-16179)) ^ 2119749424;
                                i = 1313635918;
                            }
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -808880128:
                    case 1894907172:
                        if (C1826.m6301() >= 0) {
                        }
                        iM2761 = (C0619.m2761("֨᩺") ^ i4) * (-65);
                        i5 = ((iM2761 ^ i3) * 2521) ^ 902642511;
                        i = 2091667052;
                        i7 = iM2761 ^ i;
                        break;
                    case -715092763:
                    case 1935926896:
                        if (C2834.f9334 <= 0) {
                            iM2761 = (C0773.m3169("۠ܽ") ^ i3) * (-79);
                            i5 = ((iM2761 ^ i4) * (-25899)) ^ (-947703924);
                            i = -1225425658;
                        } else {
                            iM2761 = C0619.m2761("ۨۡ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-291)) ^ 769639977;
                            i = -1138834350;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -686536381:
                    case 1362877945:
                        C2288.m7767();
                        C2310.m7813();
                        break;
                    case -623034787:
                    case 2051443036:
                        activityC9458.f30666.stopScroll();
                        if (C3779.f12953 <= 0) {
                            iM2761 = (C0773.m3169("۠ܽ") ^ i3) * (-79);
                            i5 = ((iM2761 ^ i4) * (-25899)) ^ (-947703924);
                            i = -1225425658;
                        } else {
                            iM2761 = C0773.m3169("᩻᩹") ^ i4;
                            i5 = ((iM2761 ^ i3) * 4913) ^ 1218155132;
                            i = 160542583;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 169897850:
                    case 559471695:
                        if (C3033.f9831 >= 0) {
                            iM2761 = C0773.m3169("ܰۜ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 2819) ^ (-980296878);
                            i = 732748262;
                        } else {
                            iM2761 = (C0619.m2761("ۤ᩻") ^ i4) * 87;
                            i5 = ((iM2761 ^ i3) * 18965) ^ 2077067842;
                            i = 763758564;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 490157799:
                    case 2011878864:
                        if (C2702.m8876()) {
                            iM2761 = C0773.m3169("ܰۜ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 2819) ^ (-980296878);
                            i = 732748262;
                        } else {
                            iM2761 = (C0773.m3169("۠ܽ") ^ i3) * (-79);
                            i5 = ((iM2761 ^ i4) * (-25899)) ^ (-947703924);
                            i = -1225425658;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 602308130:
                    case 987113985:
                        if (C1519.m5403()) {
                            iM2761 = (C0773.m3169("ܳᩴ") + i3) * (-61);
                            i5 = ((iM2761 ^ i4) * (-21853)) ^ (-2108028490);
                            i = 1254556881;
                        } else {
                            iM2761 = (C0619.m2761("֨᩺") ^ i4) * (-65);
                            i5 = ((iM2761 ^ i3) * 2521) ^ 902642511;
                            i = 2091667052;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 857170349:
                    case 1613468273:
                        C2375.m8065();
                        if (C3077.f9998) {
                            iM2761 = (C0619.m2761("֨᩺") ^ i4) * (-65);
                            i5 = ((iM2761 ^ i3) * 2521) ^ 902642511;
                            i = 2091667052;
                        } else {
                            iM2761 = (C0773.m3169("۠ܽ") ^ i3) * (-79);
                            i5 = ((iM2761 ^ i4) * (-25899)) ^ (-947703924);
                            i = -1225425658;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 861692160:
                    case 2077721293:
                        if (C3448.f11240 >= 0) {
                            iM2761 = C0773.m3169("ܰۜ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 2819) ^ (-980296878);
                            i = 732748262;
                        } else {
                            iM2761 = C0619.m2761("ܰ᩻") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-867)) ^ 1163173014;
                            i = 394669276;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 899408005:
                    case 2044000912:
                        activityC9458.f30666.post(runnableC9840);
                        break;
                    default:
                        if (activityC9458.f30666.isComputingLayout()) {
                            iM2761 = (i4 - C0619.m2761("֫᩻")) * (-27);
                            i5 = ((iM2761 ^ i3) * 4701) ^ 1365787157;
                            i = 574366499;
                        } else {
                            iM2761 = (C0773.m3169("ۙۨ") ^ i3) * 19;
                            i5 = ((iM2761 ^ i4) * (-22521)) ^ (-440803777);
                            i = -1007103690;
                        }
                        i7 = iM2761 ^ i;
                        break;
                }
                return;
            }
            iM3169 = C0773.m3169("ۤ۬") ^ i4;
            i5 = ((iM3169 ^ i3) * 29725) ^ 1922805040;
            i6 = 80641310;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m24839(String str) {
        ArrayList arrayList = null;
        int i = 0;
        C11192 c11192 = null;
        int i2 = -1582218159;
        int i3 = C0950.f3488;
        int i4 = C2702.f8586;
        int iM3169 = (C0773.m3169("֡۬") + i3) * (-87);
        int i5 = ((iM3169 ^ i4) * 8099) ^ (-1633195929);
        int i6 = 488198581;
        while (true) {
            i2 = ((((i2 ^ i4) * 1303) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2125450453:
                case -1137263123:
                    i++;
                    iM3169 = C0773.m3169("ܳۖ") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-1891)) ^ 749230053;
                    i6 = 1801782353;
                    break;
                case -2098520550:
                case 1565861732:
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("᩹ۜ") + i3) * 51;
                        i5 = ((iM3169 ^ i4) * 2815) ^ (-1020943401);
                        i6 = 2102377962;
                    } else {
                        iM3169 = C0773.m3169("ܶۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 22611) ^ 1985616152;
                        i6 = 511942404;
                    }
                    break;
                case -1985417394:
                case -1338105196:
                    C2419.m8174();
                    iM3169 = C0619.m2761("֡᩺") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-28145)) ^ (-922841785);
                    i6 = -1917616008;
                    break;
                case -1804953198:
                case -65262462:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۢܳ")) * (-115);
                        i5 = ((iM3169 ^ i3) * (-24727)) ^ (-329261094);
                        i6 = 1707057976;
                    } else {
                        iM3169 = C0773.m3169("᩸ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-18231)) ^ (-228599458);
                        i6 = 256445089;
                    }
                    break;
                case -1648361158:
                case 802256092:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("᩵ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-113)) ^ (-41052023);
                        i6 = -74051234;
                    } else {
                        iM3169 = C0619.m2761("ۚ֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-14165)) ^ 199432351;
                        i6 = -2084605554;
                    }
                    break;
                case -1275343481:
                case 1066319061:
                    C3998.m12920();
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۢܳ")) * (-115);
                        i5 = ((iM3169 ^ i3) * (-24727)) ^ (-329261094);
                        i6 = 1707057976;
                    } else {
                        iM3169 = C0773.m3169("ܶۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 22611) ^ 1985616152;
                        i6 = 511942404;
                    }
                    break;
                case -1225158064:
                case -610551800:
                    return -1;
                case -1218328590:
                case -913293953:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("᩵ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-113)) ^ (-41052023);
                        i6 = -74051234;
                    } else {
                        iM3169 = C0773.m3169("ۡ۫") ^ i4;
                        i5 = ((iM3169 ^ i3) * 6073) ^ (-209652614);
                        i6 = -1267591404;
                    }
                    break;
                case -991719356:
                case 340700719:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ۛ᩷") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-12831)) ^ (-930008849);
                        i6 = -645960240;
                    } else {
                        iM3169 = C0619.m2761("ۖۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 21189) ^ (-1376943049);
                        i6 = -1057956867;
                    }
                    break;
                case -975327427:
                case 306814301:
                    C2287.m7745();
                    return 0;
                case -609502205:
                case 1314133248:
                    if (!RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("᩵ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-113)) ^ (-41052023);
                        i6 = -74051234;
                    } else {
                        iM3169 = C0619.m2761("֡᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-28145)) ^ (-922841785);
                        i6 = -1917616008;
                    }
                    break;
                case -608769922:
                case 1474008863:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۢܳ")) * (-115);
                        i5 = ((iM3169 ^ i3) * (-24727)) ^ (-329261094);
                        i6 = 1707057976;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܳۚ")) * 17;
                        i5 = ((iM3169 ^ i4) * (-32505)) ^ (-1570677774);
                        i6 = -1069183222;
                    }
                    break;
                case -368782465:
                case 1662810167:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("᩵ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-113)) ^ (-41052023);
                        i6 = -74051234;
                    } else {
                        iM3169 = C0773.m3169("᩹ۘ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 26497) ^ 641671603;
                        i6 = -1220995628;
                    }
                    break;
                case -130544890:
                case 2075086045:
                    return i;
                case -91736135:
                case 345259436:
                    if (C3998.f13671 != 0) {
                        iM3169 = (i4 - C0619.m2761("ۢܳ")) * (-115);
                        i5 = ((iM3169 ^ i3) * (-24727)) ^ (-329261094);
                        i6 = 1707057976;
                    } else {
                        iM3169 = (C0619.m2761("ᩳۛ") ^ i4) * (-33);
                        i5 = ((iM3169 ^ i3) * 27855) ^ (-637376117);
                        i6 = 1832248392;
                    }
                    break;
                case -61967234:
                case 269975228:
                    arrayList = this.f30671;
                    if (i < C2702.m8879(arrayList)) {
                        iM3169 = C0619.m2761("᩵ۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-9909)) ^ (-235404570);
                        i6 = -166820574;
                    } else {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-29553)) ^ 1533541051;
                        i6 = -1812617655;
                    }
                    break;
                case -11220713:
                case 335152075:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("᩵ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-113)) ^ (-41052023);
                        i6 = -74051234;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܽ۠")) * 95;
                        i5 = ((iM3169 ^ i3) * (-18589)) ^ (-1654772633);
                        i6 = -821864389;
                    }
                    break;
                case 20227703:
                case 534092319:
                    if (C2419.m8175(str, C20932.m47852(c11192))) {
                        iM3169 = C0619.m2761("ܶۗ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-21553)) ^ (-297430780);
                        i6 = -326878064;
                    } else {
                        iM3169 = (C0619.m2761("ۢۜ") + i3) * 39;
                        i5 = ((iM3169 ^ i4) * 2807) ^ (-1399916324);
                        i6 = -2037031263;
                    }
                    break;
                case 321869975:
                case 1846657270:
                    C2834.m9344();
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0773.m3169("ܶۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 22611) ^ 1985616152;
                        i6 = 511942404;
                    } else {
                        iM3169 = C0619.m2761("֡᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-28145)) ^ (-922841785);
                        i6 = -1917616008;
                    }
                    break;
                case 1010624971:
                case 1193596634:
                    i = 0;
                    iM3169 = C0773.m3169("ܳۖ") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-1891)) ^ 749230053;
                    i6 = 1801782353;
                    break;
                default:
                    c11192 = (C11192) C3690.m11990(arrayList, i);
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("ۛ᩷") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-12831)) ^ (-930008849);
                        i6 = -645960240;
                    } else {
                        iM3169 = C0619.m2761("ܽۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-28065)) ^ (-354296531);
                        i6 = 1471912680;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24837(ActivityC9458 activityC9458, String str) {
        int iM24839 = 0;
        int i = -872403663;
        int i2 = C1321.f4751;
        int i3 = C3448.f11240;
        int iM3169 = C0773.m3169("ۗۜ") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-32435)) ^ 1786073422;
        int i5 = -1394039362;
        while (true) {
            i = ((((i ^ i3) * 4575) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2044067863:
                case 1022167035:
                    C2834.m9344();
                    C2966.m9664();
                    iM3169 = (C0619.m2761("ۤۡ") + i2) * 71;
                    i4 = ((iM3169 ^ i3) * 25119) ^ (-254066171);
                    i5 = 1416210593;
                    break;
                case -2002126637:
                case 571373943:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("ܶ᩸") ^ i2) * 75;
                        i4 = ((iM3169 ^ i3) * 28441) ^ (-347310367);
                        i5 = -1346716502;
                    } else {
                        iM3169 = C0773.m3169("֫۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22379) ^ (-1160857408);
                        i5 = 102892125;
                    }
                    break;
                case -1967824044:
                case -1492151652:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("֨֫") ^ i3) * 35;
                        i4 = ((iM3169 ^ i2) * 21279) ^ (-1522363490);
                        i5 = 1205186150;
                    } else {
                        iM3169 = C0619.m2761("ۘۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32727)) ^ (-1532054133);
                        i5 = 888068631;
                    }
                    break;
                case -1158972969:
                case -590335151:
                    break;
                case -1153888001:
                case -592986719:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("ܶ᩸") ^ i2) * 75;
                        i4 = ((iM3169 ^ i3) * 28441) ^ (-347310367);
                        i5 = -1346716502;
                    } else {
                        iM3169 = C0619.m2761("᩵ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16363)) ^ (-1587613417);
                        i5 = -2137282227;
                    }
                    break;
                case -927996412:
                case 1746485817:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0773.m3169("ܶ᩸") ^ i2) * 75;
                        i4 = ((iM3169 ^ i3) * 28441) ^ (-347310367);
                        i5 = -1346716502;
                    } else {
                        iM3169 = C0619.m2761("ۡۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5877) ^ 1799941441;
                        i5 = -820474526;
                    }
                    break;
                case -902554442:
                case 175153184:
                    if (C3779.m12264()) {
                        iM3169 = (C0619.m2761("۟۟") ^ i2) * 81;
                        i4 = ((iM3169 ^ i3) * 19459) ^ 996886735;
                        i5 = 286713751;
                    } else {
                        iM3169 = (C0773.m3169("ܶ᩸") ^ i2) * 75;
                        i4 = ((iM3169 ^ i3) * 28441) ^ (-347310367);
                        i5 = -1346716502;
                    }
                    break;
                case -853307354:
                case 169057011:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ۤۡ") + i2) * 71;
                        i4 = ((iM3169 ^ i3) * 25119) ^ (-254066171);
                        i5 = 1416210593;
                    } else {
                        iM3169 = C0619.m2761("ۧۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31917)) ^ 145238495;
                        i5 = 2032930505;
                    }
                    break;
                case -541848195:
                case -190247820:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0773.m3169("֨֫") ^ i3) * 35;
                        i4 = ((iM3169 ^ i2) * 21279) ^ (-1522363490);
                        i5 = 1205186150;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩸ܶ")) * (-59);
                        i4 = ((iM3169 ^ i3) * 25561) ^ 44336027;
                        i5 = -1181926906;
                    }
                    break;
                case -294975378:
                case 361377206:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۗ֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 4397) ^ 1860973960;
                        i5 = 1970625803;
                    } else {
                        iM3169 = C0773.m3169("۟ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27741) ^ 1727952678;
                        i5 = -1877020458;
                    }
                    break;
                case 12379966:
                case 1623886185:
                    C3033.m9845();
                    break;
                case 637548713:
                case 1823735764:
                    if (C0269.m1775() <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۗ֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 4397) ^ 1860973960;
                        i5 = 1970625803;
                    } else {
                        iM3169 = (C0619.m2761("۠ܺ") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * (-21759)) ^ 774717461;
                        i5 = 706869509;
                    }
                    break;
                case 659680741:
                case 958751880:
                    if (C23916.f77426 > 0) {
                        iM3169 = (C0773.m3169("ܶ᩸") ^ i2) * 75;
                        i4 = ((iM3169 ^ i3) * 28441) ^ (-347310367);
                        i5 = -1346716502;
                    } else {
                        iM3169 = (C0773.m3169("֨֫") ^ i3) * 35;
                        i4 = ((iM3169 ^ i2) * 21279) ^ (-1522363490);
                        i5 = 1205186150;
                    }
                    break;
                case 914814031:
                case 1267859850:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۗ֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 4397) ^ 1860973960;
                        i5 = 1970625803;
                    } else {
                        iM3169 = C0773.m3169("ۙ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15329)) ^ 1246834383;
                        i5 = -1515217476;
                    }
                    break;
                case 958998225:
                case 2015029587:
                    activityC9458.f30671.remove(iM24839);
                    iM3169 = C0773.m3169("᩻᩻") ^ i2;
                    i4 = ((iM3169 ^ i3) * 18947) ^ (-883006799);
                    i5 = 477161932;
                    break;
                case 1306982972:
                case 1673348758:
                    iM24839 = activityC9458.m24839(str);
                    if (iM24839 != -1) {
                        iM3169 = (C0619.m2761("ۙۗ") ^ i3) * (-85);
                        i4 = ((iM3169 ^ i2) * (-401)) ^ 1610221119;
                        i5 = -427185863;
                    } else {
                        iM3169 = C0773.m3169("᩻᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18947) ^ (-883006799);
                        i5 = 477161932;
                    }
                    break;
                case 1430550005:
                case 1630029529:
                    C3033.m9845();
                    if (C3099.f10023 > 0) {
                        iM3169 = (C0773.m3169("֨֫") ^ i3) * 35;
                        i4 = ((iM3169 ^ i2) * 21279) ^ (-1522363490);
                        i5 = 1205186150;
                    } else {
                        iM3169 = (C0619.m2761("ۤۡ") + i2) * 71;
                        i4 = ((iM3169 ^ i3) * 25119) ^ (-254066171);
                        i5 = 1416210593;
                    }
                    break;
                default:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۗ֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 4397) ^ 1860973960;
                        i5 = 1970625803;
                    } else {
                        iM3169 = C0619.m2761("֫۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 13921) ^ (-407222136);
                        i5 = 627743264;
                    }
                    break;
            }
            return;
        }
    }
}
