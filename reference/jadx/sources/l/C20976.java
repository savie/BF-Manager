package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.text.DateFormat;
import java.util.Date;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩶֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X6KT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20976 extends AbstractC2432 {

    /* JADX INFO: renamed from: ᩶ۜ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f67068 = {8233, 31550, 16667, 18944, -21211, -19831, 20917, -23167, -18169, -22809, -23093, 21193, 28101, 8853, 8850, 8843, 8834, 8852, 8881, 8846, 8834, 8848, 8846, 8841, 8833, 8840, 8853, 8834, 8852, 8850, 8843, 8851, 8846, 8851, 8834, 8842, 8852, 8832, 8834, 8851, 8877, 8884, 8872, 8873, 8872, 8837, 8845, 8834, 8836, 8851, 8911, 8905, 8905, 8905, 8910, 8849, 8838, 8843, 8846, 8835, 8851, 8862, 8855, 8834, 8883, 8834, 8863, 8851, 8851, 8846, 8842, 8834, 18988, 19225, 19309, 18869, 29259, 27891, -20585, -20495, 32041, -23212, 27985, 22461, 8853, 8834, 8838, 8852, 8840, 8841, 8883, 8834, 8863, 8851, 8846, 8841, 8849, 8838, 8843, 8846, 8835, 8883, 8846, 8842, 8834, 8903, 8784, 8903, -23770, -18447, 27980, 8855, 8840, 8846, 8841, 8851, 8852, 8908, 30969, -17206, 24537, 730, -11831, -11557, -15187, -13062, -10295, 10731, 5566, -28278, -28259, -28258, -28278, -28259, -28277, -28272, -28236, -28263, -28287, -28265, -28275, -28276};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f67069;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public JSONObject f67070;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0093 f67071;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f67072;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67073;

    public C20976(ActivityC0093 activityC0093, int i) {
        int i2 = 1738887556;
        int i3 = C1564.f5401;
        int i4 = AbstractC0641.f2496;
        this.f67071 = activityC0093;
        this.f67073 = i;
        int iM2761 = C0619.m2761("۠ۨ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 2731) ^ 1708384230;
        int i6 = 824797872;
        while (true) {
            i2 = (iM2761 ^ i6) ^ (i5 & (((i2 ^ i4) * 31959) >> 31));
            switch (i2) {
                case -1503127403:
                case -1296450820:
                    C2310.m7813();
                    C3734.m12152();
                    throw new RuntimeException();
                case -1244181431:
                case 1312318075:
                    if (C1826.f6190 > 0) {
                        iM2761 = (i3 - C0773.m3169("ܺۧ")) * (-123);
                        i5 = ((iM2761 ^ i4) * (-2813)) ^ 197483438;
                        i6 = 613488439;
                    }
                    break;
                case -1087833218:
                case -584396082:
                    if (C1321.f4751 < 0) {
                        iM2761 = (C0619.m2761("֡᩹") + i4) * (-39);
                        i5 = ((iM2761 ^ i3) * 17621) ^ (-1607695633);
                        i6 = -1754273759;
                    }
                    break;
                case -272584765:
                case 1038390761:
                    C1080.m4050();
                    C4282.m13644();
                    break;
                case 963955246:
                case 1270765323:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("ۛ᩶") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-23485)) ^ (-978569167);
                        i6 = 524875653;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩺ܳ")) * (-11);
                        i5 = ((iM2761 ^ i3) * (-28417)) ^ (-645610162);
                        i6 = -24301961;
                        continue;
                    }
                    break;
                case 1369466450:
                case 1709177037:
                    C3033.m9845();
                    if (C3779.m12264()) {
                        iM2761 = (C0773.m3169("ۖۙ") ^ i4) * (-83);
                        i5 = ((iM2761 ^ i3) * 26519) ^ 1510952722;
                        i6 = 570261971;
                    }
                    break;
                default:
                    return;
            }
            iM2761 = C0619.m2761("ۗۧ") ^ i3;
            i5 = ((iM2761 ^ i4) * (-4515)) ^ (-2095012316);
            i6 = -936476225;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47952(C20976 c20976, ActivityC0093 activityC0093, ScrollView scrollView) {
        int i = 58786399;
        int i2 = C4282.f15546;
        int i3 = RunnableC0334.f1808;
        int iM2761 = C0619.m2761("᩷ۡ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-22257)) ^ (-2138695706);
        int i5 = 61191518;
        while (true) {
            i = ((((i ^ i2) * (-30315)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2138364117:
                case 37497097:
                    scrollView.scrollTo(0, activityC0093.f1010);
                    activityC0093.f1010 = -1;
                    iM2761 = C0619.m2761("֡۟") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-20091)) ^ 1731377280;
                    i5 = 504579536;
                    break;
                case -2050432154:
                case 1684053240:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ۛۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15521) ^ (-1803415349);
                        i5 = -1862072780;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۫ۗ")) * 61;
                        i4 = ((iM2761 ^ i3) * (-10831)) ^ 1721086031;
                        i5 = 623131705;
                    }
                    break;
                case -1611927332:
                case -1386487399:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ۚۚ")) * 101;
                        i4 = ((iM2761 ^ i3) * (-5603)) ^ 156897406;
                        i5 = 2018641471;
                    } else {
                        iM2761 = C0773.m3169("᩺ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10917) ^ (-536063515);
                        i5 = 1192217189;
                    }
                    break;
                case -1578358727:
                case 1924337491:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("֨۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26109)) ^ (-770605628);
                        i5 = 1799648730;
                    } else {
                        iM2761 = (C0619.m2761("ᩳᩴ") ^ i2) * 77;
                        i4 = ((iM2761 ^ i3) * 23795) ^ 103794851;
                        i5 = 256971556;
                    }
                    break;
                case -1531173993:
                case 1191298858:
                    if (C11235.f35427 < 0) {
                        iM2761 = (i2 - C0773.m3169("ۚۚ")) * 101;
                        i4 = ((iM2761 ^ i3) * (-5603)) ^ 156897406;
                        i5 = 2018641471;
                    } else {
                        iM2761 = C0773.m3169("֨۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26109)) ^ (-770605628);
                        i5 = 1799648730;
                    }
                    break;
                case -1382116524:
                case -840883063:
                    if (activityC0093.f1010 >= 0) {
                        iM2761 = (C0619.m2761("ۚ᩶") + i2) * 97;
                        i4 = ((iM2761 ^ i3) * (-27229)) ^ (-891333960);
                        i5 = -530988712;
                    } else {
                        iM2761 = C0619.m2761("֡۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-20091)) ^ 1731377280;
                        i5 = 504579536;
                    }
                    break;
                case -1207371179:
                case 732696129:
                    break;
                case -1152717902:
                case 188320960:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27645)) ^ 73302451;
                        i5 = 933256986;
                    } else {
                        iM2761 = C0773.m3169("ۚۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7023)) ^ (-1896091971);
                        i5 = -359150421;
                    }
                    break;
                case -1046898093:
                case -550967003:
                    if (c20976.m47953()) {
                        iM2761 = C0619.m2761("۬ܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7681)) ^ (-186095553);
                        i5 = -381532584;
                    } else {
                        iM2761 = C0619.m2761("֡۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-20091)) ^ 1731377280;
                        i5 = 504579536;
                    }
                    break;
                case -901009882:
                case 202499382:
                    C2287.m7745();
                    iM2761 = C0773.m3169("֨۠") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-26109)) ^ (-770605628);
                    i5 = 1799648730;
                    break;
                case -734276468:
                case -665736259:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("֨۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26109)) ^ (-770605628);
                        i5 = 1799648730;
                    } else {
                        iM2761 = C0773.m3169("᩺֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3121) ^ 561771699;
                        i5 = 1373395024;
                    }
                    break;
                case -628670097:
                case 466838240:
                    if (RunnableC1848.f6235) {
                        iM2761 = (i2 - C0773.m3169("ۚۚ")) * 101;
                        i4 = ((iM2761 ^ i3) * (-5603)) ^ 156897406;
                        i5 = 2018641471;
                    } else {
                        iM2761 = (C0619.m2761("۟֫") + i3) * (-37);
                        i4 = ((iM2761 ^ i2) * 13583) ^ (-933890582);
                        i5 = -724029757;
                    }
                    break;
                case -268910598:
                case 647207556:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("֨۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26109)) ^ (-770605628);
                        i5 = 1799648730;
                    } else {
                        iM2761 = (C0773.m3169("ܶ۟") + i2) * (-55);
                        i4 = ((iM2761 ^ i3) * 4347) ^ 1779776017;
                        i5 = 1704575060;
                    }
                    break;
                case -122791603:
                case 907636955:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27645)) ^ 73302451;
                        i5 = 933256986;
                    } else {
                        iM2761 = C0773.m3169("ۘۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28971)) ^ (-1092407429);
                        i5 = -31185788;
                    }
                    break;
                case 35606095:
                case 529712444:
                    C3690.m11987();
                    if (C1146.f4234 < 0) {
                        iM2761 = C0619.m2761("᩺ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15053)) ^ 342238175;
                        i5 = 1133746657;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۚۚ")) * 101;
                        i4 = ((iM2761 ^ i3) * (-5603)) ^ 156897406;
                        i5 = 2018641471;
                    }
                    break;
                case 298169112:
                case 592557083:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("᩺ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15053)) ^ 342238175;
                        i5 = 1133746657;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩺") + i2) * 5;
                        i4 = ((iM2761 ^ i3) * (-747)) ^ (-991918759);
                        i5 = 1863511994;
                    }
                    break;
                case 611883855:
                case 1593523501:
                    C4282.m13644();
                    C2966.m9664();
                    break;
                case 1532937779:
                case 1731403097:
                    if (C3033.f9831 < 0) {
                        iM2761 = C0773.m3169("ۛۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15521) ^ (-1803415349);
                        i5 = -1862072780;
                    } else {
                        iM2761 = C0773.m3169("֨۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26109)) ^ (-770605628);
                        i5 = 1799648730;
                    }
                    break;
                default:
                    if (C3448.m11248() != 0) {
                        iM2761 = (i2 - C0773.m3169("ۚۚ")) * 101;
                        i4 = ((iM2761 ^ i3) * (-5603)) ^ 156897406;
                        i5 = 2018641471;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩶ۖ")) * (-113);
                        i4 = ((iM2761 ^ i2) * (-30987)) ^ 578053607;
                        i5 = 1449667801;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ActivityC0093 activityC0093 = null;
        String str = null;
        int i = 0;
        C7551 e = null;
        String str2 = null;
        C2592 c2592M12270 = null;
        int i2 = -210888880;
        int i3 = C1321.f4751;
        int i4 = C4282.f15546;
        int iM3169 = C0773.m3169("ۖۡ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-15121)) ^ 772573713;
        int i6 = 914053018;
        while (true) {
            i2 = ((((i2 ^ i4) * 25723) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2032793296:
                case -1432941497:
                    str = activityC0093.f1011;
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ۢۛ") + i4) * 95;
                        i5 = ((iM3169 ^ i3) * 22447) ^ 203948039;
                        i6 = 559395695;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩻᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM3169 ^ i3) * (-19681)) ^ (-989704534);
                        i6 = 1399591582;
                    }
                    break;
                case -1984584355:
                case 1811373796:
                    String strM12261 = C3779.m12261(e);
                    if (strM12261 == null) {
                        iM3169 = (i3 - C0619.m2761("ۛܽ")) * (-81);
                        i5 = ((iM3169 ^ i4) * (-24903)) ^ 1776410382;
                        i6 = -2038201910;
                    } else {
                        str2 = strM12261;
                        iM3169 = (C0773.m3169("۠᩹") ^ i3) * 99;
                        i5 = ((iM3169 ^ i4) * (-7361)) ^ 1679558106;
                        i6 = -1469920820;
                    }
                    break;
                case -1901347366:
                case 1373875484:
                    if (C2023.m6964() <= 0) {
                        iM3169 = (C0773.m3169("ۛܳ") + i3) * (-31);
                        i5 = ((iM3169 ^ i4) * 23453) ^ 1605416018;
                        i6 = -1882110742;
                    } else {
                        iM3169 = C0619.m2761("֫ܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 16439) ^ (-600158016);
                        i6 = 202335699;
                    }
                    break;
                case -1876426245:
                case 1899415890:
                    if (C0773.f2792 > 0) {
                        iM3169 = (C0619.m2761("᩹ۡ") + i3) * 81;
                        i5 = ((iM3169 ^ i4) * 22873) ^ 486733883;
                        i6 = 558270585;
                    } else {
                        iM3169 = (C0773.m3169("᩺ܰ") ^ i4) * 87;
                        i5 = ((iM3169 ^ i3) * 20327) ^ (-1501536804);
                        i6 = 1568782618;
                    }
                    break;
                case -1864150486:
                case 686509104:
                    activityC0093 = this.f67071;
                    if (C1146.m4231()) {
                        iM3169 = C0773.m3169("֨ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-31035)) ^ 1671856542;
                        i6 = -1576840741;
                    } else {
                        iM3169 = (C0773.m3169("᩺ܰ") ^ i4) * 87;
                        i5 = ((iM3169 ^ i3) * 20327) ^ (-1501536804);
                        i6 = 1568782618;
                    }
                    break;
                case -1840124879:
                case 789352511:
                    C3077.m10041();
                    C2288.m7767();
                    break;
                case -1776155766:
                case 713400903:
                    C1826.m6301();
                    iM3169 = (C0773.m3169("᩺ܰ") ^ i4) * 87;
                    i5 = ((iM3169 ^ i3) * 20327) ^ (-1501536804);
                    i6 = 1568782618;
                    break;
                case -1621660688:
                case 1700622936:
                    try {
                        this.f67070 = C18738.m43548(C1783.m6238(i));
                        iM3169 = C0619.m2761("ܳۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-23793)) ^ (-323371464);
                        i6 = 842074445;
                    } catch (C7551 e2) {
                        e = e2;
                        iM3169 = C0773.m3169("ܺۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8013) ^ (-2089571874);
                        i6 = -1391002459;
                    }
                    break;
                case -1417922259:
                case 1375803415:
                    i = 4368;
                    iM3169 = C0619.m2761("ۧۡ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 23681) ^ (-304029924);
                    i6 = 969893969;
                    break;
                case -1325961197:
                case -625025969:
                    if (C2702.m8876()) {
                        iM3169 = C0619.m2761("ܺۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 30591) ^ (-1076088921);
                        i6 = -1011143722;
                    } else {
                        iM3169 = (C0773.m3169("ۢۛ") + i4) * 95;
                        i5 = ((iM3169 ^ i3) * 22447) ^ 203948039;
                        i6 = 559395695;
                    }
                    break;
                case -1233938883:
                case -994562390:
                    this.f67072 = str2;
                    break;
                case -1203629411:
                case 869276733:
                    C2354.m7983();
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۛܳ") + i3) * (-31);
                        i5 = ((iM3169 ^ i4) * 23453) ^ 1605416018;
                        i6 = -1882110742;
                    } else {
                        iM3169 = C0773.m3169("᩷ۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-3159)) ^ (-74595309);
                        i6 = 1435913475;
                    }
                    break;
                case -976745631:
                case -815443011:
                    str2 = "";
                    iM3169 = (C0773.m3169("۠᩹") ^ i3) * 99;
                    i5 = ((iM3169 ^ i4) * (-7361)) ^ 1679558106;
                    i6 = -1469920820;
                    break;
                case -553880775:
                case 57470131:
                    if (C1826.m6301() >= 0) {
                        iM3169 = (C0773.m3169("᩺ܰ") ^ i4) * 87;
                        i5 = ((iM3169 ^ i3) * 20327) ^ (-1501536804);
                        i6 = 1568782618;
                    } else {
                        iM3169 = (C0773.m3169("ۗۘ") + i4) * 123;
                        i5 = ((iM3169 ^ i3) * (-273)) ^ (-2093859615);
                        i6 = 364791016;
                    }
                    break;
                case -473997819:
                case 1555238969:
                    C17202.m40372();
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("᩷ۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-3159)) ^ (-74595309);
                        i6 = 1435913475;
                    } else {
                        iM3169 = (C0773.m3169("᩺ܰ") ^ i4) * 87;
                        i5 = ((iM3169 ^ i3) * 20327) ^ (-1501536804);
                        i6 = 1568782618;
                    }
                    break;
                case -417828311:
                case 533416690:
                    if (C3448.m11248() != 0) {
                        iM3169 = (C0773.m3169("ۢۛ") + i4) * 95;
                        i5 = ((iM3169 ^ i3) * 22447) ^ 203948039;
                        i6 = 559395695;
                    } else {
                        iM3169 = (C0619.m2761("֫᩻") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM3169 ^ i4) * 26961) ^ 856180792;
                        i6 = -936633286;
                    }
                    break;
                case -270473565:
                case 1032816499:
                    if (C15243.m36589((Object) str, (Object) C0619.m2752())) {
                        iM3169 = C0773.m3169("ۡ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 32247) ^ 1171220662;
                        i6 = -191289130;
                    } else {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i4) * 85;
                        i5 = ((iM3169 ^ i3) * (-13473)) ^ 1313260835;
                        i6 = 548485669;
                    }
                    break;
                case -124033670:
                case 183354136:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ۢۛ") + i4) * 95;
                        i5 = ((iM3169 ^ i3) * 22447) ^ 203948039;
                        i6 = 559395695;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۠ۡ")) * (-103);
                        i5 = ((iM3169 ^ i3) * 2451) ^ 181190551;
                        i6 = -1668623923;
                    }
                    break;
                case -75279040:
                case 378687583:
                    c2592M12270 = C3779.m12270(4369);
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("᩹ۡ") + i3) * 81;
                        i5 = ((iM3169 ^ i4) * 22873) ^ 486733883;
                        i6 = 558270585;
                    } else {
                        iM3169 = C0619.m2761("ۜ֫") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-723)) ^ 1784016812;
                        i6 = -1716964495;
                    }
                    break;
                case 183569020:
                case 508132545:
                    break;
                case 679416119:
                case 1976437833:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ۢۛ") + i4) * 95;
                        i5 = ((iM3169 ^ i3) * 22447) ^ 203948039;
                        i6 = 559395695;
                    } else {
                        iM3169 = C0619.m2761("ۚᩴ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 24315) ^ 2092803102;
                        i6 = -1401556295;
                    }
                    break;
                case 1060189765:
                case 1681231140:
                    this.f67069 = C18738.m43548(c2592M12270);
                    break;
                default:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("᩺ܰ") ^ i4) * 87;
                        i5 = ((iM3169 ^ i3) * 20327) ^ (-1501536804);
                        i6 = 1568782618;
                    } else {
                        iM3169 = (i4 - C0773.m3169("֨ܿ")) * 43;
                        i5 = ((iM3169 ^ i3) * 11161) ^ (-1602125515);
                        i6 = -1751835335;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x02a7 A[PHI: r16
      0x02a7: PHI (r16v26 l.ۗ֨᩷) = (r16v5 l.ۗ֨᩷), (r16v6 l.ۗ֨᩷), (r16v7 l.ۗ֨᩷), (r16v29 l.ۗ֨᩷) binds: [B:72:0x02a5, B:68:0x0288, B:64:0x026a, B:13:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02db A[PHI: r2 r3 r10 r11 r16
      0x02db: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:76:0x02d9, B:60:0x024b, B:29:0x00b1, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:76:0x02d9, B:60:0x024b, B:29:0x00b1, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:76:0x02d9, B:60:0x024b, B:29:0x00b1, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r11v8 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:76:0x02d9, B:60:0x024b, B:29:0x00b1, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r16v27 l.ۗ֨᩷) = (r16v4 l.ۗ֨᩷), (r16v8 l.ۗ֨᩷), (r16v24 l.ۗ֨᩷), (r16v28 l.ۗ֨᩷) binds: [B:76:0x02d9, B:60:0x024b, B:29:0x00b1, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (l.C3779.f12953 <= 0) goto L8;
     */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1138() {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20976.mo1138():void");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0182  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
    
        if (l.C3734.m12152() < 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        if (l.C3077.f9998 == false) goto L16;
     */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1137() {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20976.mo1137():void");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private final boolean m47953() {
        ActivityC0093 activityC0093 = null;
        int i = 1258201217;
        int i2 = C0269.f1558;
        int i3 = C1564.f5401;
        int iM2761 = (i2 - C0619.m2761("ۘᩴ")) * (-47);
        int i4 = ((iM2761 ^ i3) * (-12173)) ^ 845816869;
        int i5 = -1591577825;
        while (true) {
            i = ((((i ^ i3) * 3133) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2115229302:
                case 5471454:
                    if (C2702.m8873()) {
                        iM2761 = C0619.m2761("᩸ᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23905) ^ 1107548997;
                        i5 = -1102295851;
                    } else {
                        iM2761 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12151)) ^ (-531441298);
                        i5 = -1155030440;
                    }
                    break;
                case -2012183128:
                case -1278931490:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۨۢ")) * (-71);
                        i4 = ((iM2761 ^ i2) * (-5789)) ^ 71300990;
                        i5 = 1122598434;
                    } else {
                        iM2761 = (C0619.m2761("۫۟") + i3) * 65;
                        i4 = ((iM2761 ^ i2) * (-21009)) ^ 38678216;
                        i5 = -1154215736;
                    }
                    break;
                case -1805516337:
                case -181502491:
                    return false;
                case -1677946865:
                case -366373009:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0773.m3169("ᩳ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28921)) ^ (-1927209597);
                        i5 = 995312167;
                    } else {
                        iM2761 = C0773.m3169("᩻ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23053)) ^ 1210364112;
                        i5 = 1110339498;
                    }
                    break;
                case -1672008243:
                case 1835781131:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("ܺܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21927)) ^ (-1100855949);
                        i5 = -37476444;
                    } else {
                        iM2761 = (C0773.m3169("ۖ֫") ^ i3) * (-29);
                        i4 = ((iM2761 ^ i2) * (-4637)) ^ 487769855;
                        i5 = -996808508;
                    }
                    break;
                case -1633710717:
                case 1292846937:
                    if (C11235.m28309() != 0) {
                        iM2761 = C0773.m3169("ᩳ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28921)) ^ (-1927209597);
                        i5 = 995312167;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩺ᩳ")) * 91;
                        i4 = ((iM2761 ^ i2) * (-6011)) ^ 321247135;
                        i5 = -1702667086;
                    }
                    break;
                case -1227448594:
                case -666154122:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0773.m3169("᩷֡") ^ i3) * (-69);
                        i4 = ((iM2761 ^ i2) * 29599) ^ (-1367769496);
                        i5 = -1027659385;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩻") ^ i2) * (-109);
                        i4 = ((iM2761 ^ i3) * 13141) ^ 199855140;
                        i5 = -1025334611;
                    }
                    break;
                case -1122225676:
                case -1098811177:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ۡۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11071) ^ (-198057754);
                        i5 = -63865879;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۬ܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i2) * 3841) ^ 52607284;
                        i5 = -42948598;
                    }
                    break;
                case -1097620067:
                case 437065496:
                    if (activityC0093.isDestroyed()) {
                        iM2761 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12151)) ^ (-531441298);
                        i5 = -1155030440;
                    } else {
                        iM2761 = (C0773.m3169("ۤ֡") ^ i2) * (-61);
                        i4 = ((iM2761 ^ i3) * (-2757)) ^ (-356237723);
                        i5 = -1232339221;
                    }
                    break;
                case -992418915:
                case 1679469103:
                    if (C15243.m36589((Object) activityC0093.f1011, (Object) C0619.m2752())) {
                        iM2761 = C0773.m3169("ۘ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30703)) ^ (-887876790);
                        i5 = 1641640268;
                    } else {
                        iM2761 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12151)) ^ (-531441298);
                        i5 = -1155030440;
                    }
                    break;
                case -763209598:
                case 108662332:
                    C0773.m3161();
                    C2419.m8174();
                    return false;
                case -747159594:
                case 1914740292:
                    C2834.m9344();
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (i3 - C0773.m3169("ۨۢ")) * (-71);
                        i4 = ((iM2761 ^ i2) * (-5789)) ^ 71300990;
                        i5 = 1122598434;
                    } else {
                        iM2761 = C0619.m2761("ܺܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21927)) ^ (-1100855949);
                        i5 = -37476444;
                    }
                    break;
                case -242160827:
                case 1319045104:
                    return true;
                case -228152031:
                case -93035471:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ᩳ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28921)) ^ (-1927209597);
                        i5 = 995312167;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֨۠")) * (-43);
                        i4 = ((iM2761 ^ i3) * (-25439)) ^ (-1871150586);
                        i5 = 1346492735;
                    }
                    break;
                case -216558612:
                case 569849865:
                    activityC0093 = this.f67071;
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("ۧۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13081) ^ (-153057013);
                        i5 = -1311127223;
                    } else {
                        iM2761 = C0619.m2761("ܺܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21927)) ^ (-1100855949);
                        i5 = -37476444;
                    }
                    break;
                case 139677164:
                case 2032250038:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("᩷֡") ^ i3) * (-69);
                        i4 = ((iM2761 ^ i2) * 29599) ^ (-1367769496);
                        i5 = -1027659385;
                    } else {
                        iM2761 = C0619.m2761("ܳܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15009) ^ 1955929765;
                        i5 = -1849227614;
                    }
                    break;
                case 181009933:
                case 1116833791:
                    if (this.f67073 == activityC0093.f1017) {
                        iM2761 = (C0619.m2761("ۗ᩶") + i3) * 31;
                        i4 = ((iM2761 ^ i2) * 2803) ^ 2129244535;
                        i5 = -657306928;
                    } else {
                        iM2761 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12151)) ^ (-531441298);
                        i5 = -1155030440;
                    }
                    break;
                case 322669192:
                case 929033892:
                    C0487.m2356();
                    if (!RunnableC0334.m2063()) {
                        iM2761 = (i3 - C0773.m3169("ۨۢ")) * (-71);
                        i4 = ((iM2761 ^ i2) * (-5789)) ^ 71300990;
                        i5 = 1122598434;
                    } else {
                        iM2761 = C0773.m3169("ᩳ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28921)) ^ (-1927209597);
                        i5 = 995312167;
                    }
                    break;
                case 572967562:
                case 1594021644:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("ᩳ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28921)) ^ (-1927209597);
                        i5 = 995312167;
                    } else {
                        iM2761 = C0773.m3169("ᩴۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31645) ^ (-1818376823);
                        i5 = -917383542;
                    }
                    break;
                case 1103600129:
                case 1182801677:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۡۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11071) ^ (-198057754);
                        i5 = -63865879;
                    } else {
                        iM2761 = C0619.m2761("ܺܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21927)) ^ (-1100855949);
                        i5 = -37476444;
                    }
                    break;
                case 1123339923:
                case 1498554535:
                    C0269.m1775();
                    iM2761 = C0619.m2761("ܺܳ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-21927)) ^ (-1100855949);
                    i5 = -37476444;
                    break;
                default:
                    if (C3077.m10048(activityC0093)) {
                        iM2761 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12151)) ^ (-531441298);
                        i5 = -1155030440;
                    } else {
                        iM2761 = C0773.m3169("᩻۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11863)) ^ (-1459477804);
                        i5 = -1006141461;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() throws Throwable {
        LinearLayout.LayoutParams layoutParams;
        JSONArray jSONArray;
        LinearLayout linearLayout;
        int i;
        boolean z;
        short[] sArr;
        String str;
        boolean z2;
        LinearLayout.LayoutParams layoutParams2;
        int i2;
        int iM2761;
        int i3;
        JSONArray jSONArray2;
        LinearLayout linearLayout2;
        C9042 c9042;
        JSONObject jSONObject;
        String str2;
        int i4;
        boolean z3;
        int i5;
        LinearLayout linearLayout3;
        int i6;
        boolean z4;
        short[] sArr2;
        int iM3169;
        int i7;
        int iM31610;
        int i8;
        int i9;
        LinearLayout.LayoutParams layoutParams3;
        int i10;
        short[] sArr3;
        boolean z5;
        int i11;
        ImageView imageView;
        LinearLayout.LayoutParams layoutParams4;
        int i12;
        TextView textView;
        LinearLayout linearLayout4;
        int i13;
        short[] sArr4;
        JSONObject jSONObject2;
        boolean z6;
        ImageView imageView2;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        LinearLayout linearLayout5;
        int i18;
        boolean z7;
        int i19;
        short[] sArr5;
        int iM31611;
        int i20;
        int i21;
        int iM31612;
        int i22;
        int i23;
        int i24;
        LinearLayout.LayoutParams layoutParams5;
        int i25;
        int iM31613;
        int i26;
        int i27;
        int iM2762;
        int i28;
        C20976 c20976 = this;
        int i29 = -1405935789;
        int i30 = C20932.f66974;
        int i31 = AbstractC0641.f2496;
        int iM31614 = (C0773.m3169("ܺۡ") + i31) * (-97);
        int i32 = ((iM31614 ^ i30) * (-11701)) ^ (-1880404051);
        int i33 = iM31614 ^ (-1494891447);
        JSONObject jSONObject3 = null;
        JSONObject jSONObject4 = null;
        JSONArray jSONArray3 = null;
        DateFormat dateTimeInstance = null;
        LinearLayout linearLayout6 = null;
        LinearLayout linearLayout7 = null;
        ImageView imageView3 = null;
        TextView textViewM7851 = null;
        String str3 = null;
        short[] sArr6 = null;
        int i34 = 0;
        boolean z8 = false;
        int i35 = 0;
        int i36 = 0;
        int iM2763 = 0;
        boolean z9 = false;
        String str4 = null;
        int iM2764 = 0;
        int iM2765 = 0;
        int i37 = 0;
        boolean z10 = false;
        int i38 = 0;
        float f2 = 0.0f;
        int length = 0;
        boolean z11 = false;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int iM8177 = 0;
        int iM8178 = 0;
        int i42 = 0;
        int i43 = 0;
        float f3 = 0.0f;
        boolean z12 = false;
        Throwable th = null;
        C9042 c9043 = null;
        LinearLayout linearLayout8 = null;
        JSONObject jSONObject5 = null;
        TextView textViewM7852 = null;
        String strM7761 = null;
        boolean z13 = false;
        int iM8880 = 0;
        String str5 = null;
        ActivityC0093 activityC0093 = null;
        LinearLayout linearLayout9 = null;
        LinearLayout.LayoutParams layoutParams6 = null;
        int i44 = 0;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i30) * (-23785)) >> 31));
            switch (i29) {
                case -2062508302:
                case -289500412:
                    C2023.m6964();
                    if (C1519.f5300 >= 0) {
                        iM2762 = C0619.m2761("ܺۨ") ^ i30;
                        i24 = ((iM2762 ^ i31) * 12023) ^ (-788141274);
                        i28 = -1552856664;
                        i33 = iM2762 ^ i28;
                        i32 = i24;
                    } else {
                        strM7761 = strM7761;
                        layoutParams3 = layoutParams6;
                        i10 = i36;
                        i44 = i44;
                        f3 = f3;
                        iM8177 = iM8177;
                        imageView3 = imageView3;
                        i35 = i35;
                        z11 = z11;
                        i39 = i39;
                        z13 = z13;
                        i40 = i40;
                        i41 = i41;
                        i43 = i43;
                        i5 = iM8178;
                        linearLayout3 = linearLayout7;
                        i = i42;
                        z = z12;
                        sArr3 = sArr6;
                        int iM2766 = C0619.m2761("ۙ֡") ^ i31;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM2766 ^ 1623135943;
                        i32 = ((iM2766 ^ i30) * (-31291)) ^ 372193401;
                        z12 = z;
                        strM7761 = strM7761;
                        i42 = i;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    break;
                case -2008080299:
                case 1816481759:
                    jSONObject2 = jSONObject4;
                    JSONArray jSONArray4 = jSONObject2.getJSONArray(RunnableC1848.m6366(f67068, 32, 5, i34));
                    jSONArray3 = jSONArray4;
                    length = jSONArray4.length();
                    z6 = z9;
                    i36 = 0;
                    int iM31615 = C0773.m3169("ۙܳ") ^ i30;
                    jSONObject4 = jSONObject2;
                    i39 = i39;
                    sArr6 = sArr6;
                    strM7761 = strM7761;
                    z11 = z11;
                    i35 = i35;
                    z12 = z12;
                    imageView3 = imageView3;
                    i42 = i42;
                    iM8177 = iM8177;
                    linearLayout7 = linearLayout7;
                    f3 = f3;
                    iM8178 = iM8178;
                    i44 = i44;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z6;
                    i32 = ((iM31615 ^ i31) * (-4011)) ^ (-160327586);
                    layoutParams6 = layoutParams6;
                    i33 = iM31615 ^ 441376696;
                    z8 = z8;
                    break;
                case -1984075837:
                case 1077015162:
                    C11235.m28309();
                    if (C2310.m7813() > 0) {
                        strM7761 = strM7761;
                        layoutParams3 = layoutParams6;
                        i10 = i36;
                        i44 = i44;
                        f3 = f3;
                        iM8177 = iM8177;
                        imageView3 = imageView3;
                        i35 = i35;
                        z11 = z11;
                        i39 = i39;
                        z13 = z13;
                        i40 = i40;
                        i41 = i41;
                        i43 = i43;
                        i5 = iM8178;
                        linearLayout3 = linearLayout7;
                        i = i42;
                        z = z12;
                        sArr3 = sArr6;
                        int iM2767 = C0619.m2761("ۙ֡") ^ i31;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM2767 ^ 1623135943;
                        i32 = ((iM2767 ^ i30) * (-31291)) ^ 372193401;
                        z12 = z;
                        strM7761 = strM7761;
                        i42 = i;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    } else {
                        iM2762 = C0619.m2761("ۖܰ") ^ i31;
                        i24 = ((iM2762 ^ i30) * (-28363)) ^ 1306966836;
                        i28 = -407903382;
                        i33 = iM2762 ^ i28;
                        i32 = i24;
                    }
                    break;
                case -1883915182:
                case 54167440:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams3 = layoutParams6;
                    i10 = i36;
                    int i45 = i39;
                    int i46 = i40;
                    i41 = i41;
                    i44 = i44;
                    i43 = i43;
                    f3 = f3;
                    iM8177 = iM8177;
                    i5 = iM8178;
                    imageView3 = imageView3;
                    linearLayout3 = linearLayout7;
                    i = i42;
                    z = z12;
                    sArr3 = sArr6;
                    i35 = i35;
                    linearLayout6.setGravity(i45);
                    z5 = z13;
                    linearLayout6.setBaselineAligned(z5);
                    C17423.m40911(linearLayout6);
                    z11 = z11;
                    linearLayout6.setClickable(z11);
                    float f4 = i46;
                    float f5 = 12;
                    i39 = i45;
                    i40 = i46;
                    linearLayout6.setPadding(C2419.m8177(f4), C3492.m11481(f5), C2419.m8177(f4), C2419.m8177(f5));
                    if (C3077.f9998) {
                        LinearLayout linearLayout10 = new LinearLayout(activityC0093);
                        linearLayout10.setOrientation(1);
                        boolean z14 = !z10;
                        TextView textViewM7853 = C2331.m7851(activityC0093, 14.0f, z14);
                        z13 = z5;
                        C2354.m7978(textViewM7853, RunnableC3646.m11810(jSONObject5, C23916.m53420(f67068, 60, 8, i34)));
                        C2878.m9479(linearLayout10, textViewM7853);
                        if (C0773.f2792 <= 0) {
                            z8 = z14;
                            f2 = f5;
                            linearLayout9 = linearLayout10;
                            int iM2768 = C0619.m2761("ۙ֡") ^ i31;
                            layoutParams6 = layoutParams3;
                            sArr6 = sArr3;
                            i36 = i10;
                            i33 = iM2768 ^ 1623135943;
                            i32 = ((iM2768 ^ i30) * (-31291)) ^ 372193401;
                            z12 = z;
                            strM7761 = strM7761;
                            i42 = i;
                            linearLayout7 = linearLayout3;
                            iM8178 = i5;
                            i43 = i43;
                            i41 = i41;
                            i40 = i40;
                            z13 = z13;
                            i39 = i39;
                            z11 = z11;
                            i35 = i35;
                            imageView3 = imageView3;
                            iM8177 = iM8177;
                            f3 = f3;
                            i44 = i44;
                        } else {
                            int iM31616 = (C0773.m3169("ۢܳ") ^ i31) * 87;
                            int i47 = ((iM31616 ^ i30) * 25371) ^ (-1728544382);
                            layoutParams6 = layoutParams3;
                            sArr6 = sArr3;
                            i36 = i10;
                            i33 = iM31616 ^ (-1233334368);
                            z12 = z;
                            strM7761 = strM7761;
                            i42 = i;
                            linearLayout7 = linearLayout3;
                            iM8178 = i5;
                            i43 = i43;
                            i41 = i41;
                            i40 = i40;
                            z13 = z13;
                            i39 = i39;
                            z11 = z11;
                            i35 = i35;
                            imageView3 = imageView3;
                            iM8177 = iM8177;
                            f3 = f3;
                            i44 = i44;
                            linearLayout9 = linearLayout10;
                            i32 = i47;
                            z8 = z14;
                            f2 = f5;
                        }
                    } else {
                        f2 = f5;
                        int iM31617 = (i30 - C0773.m3169("ܳ᩸")) * 19;
                        linearLayout9 = null;
                        i39 = i39;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM31617 ^ (-1013003868);
                        i32 = ((iM31617 ^ i31) * 24569) ^ (-39315148);
                        z11 = z11;
                        i35 = i35;
                        z12 = z;
                        strM7761 = strM7761;
                        imageView3 = imageView3;
                        i42 = i;
                        iM8177 = iM8177;
                        linearLayout7 = linearLayout3;
                        f3 = f3;
                        iM8178 = i5;
                        i44 = i44;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z5;
                        z8 = z8;
                    }
                    break;
                case -1744355579:
                case 1526265319:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams3 = layoutParams6;
                    i10 = i36;
                    i11 = i40;
                    i41 = i41;
                    int i48 = iM8177;
                    imageView2 = imageView3;
                    i14 = i44;
                    i15 = i43;
                    f = f3;
                    i16 = i35;
                    i17 = iM8178;
                    linearLayout5 = linearLayout7;
                    i18 = i42;
                    z7 = z12;
                    TextView textViewM7854 = C2331.m7851((Context) activityC0093, 12.0f, true);
                    i19 = i48;
                    sArr5 = sArr6;
                    C2354.m7978(textViewM7854, dateTimeInstance.format(new Date(jSONObject5.getLong(C3033.m9847(f67068, 68, 4, i34)))));
                    C2878.m9479(linearLayout9, textViewM7854);
                    if (z10) {
                        iM31611 = C0773.m3169("ܰۜ") ^ i30;
                        i20 = ((iM31611 ^ i31) * 6281) ^ (-889598558);
                        i21 = 1200088445;
                    } else {
                        iM31611 = (i31 - C0773.m3169("᩶ۗ")) * (-65);
                        i20 = ((iM31611 ^ i30) * 5033) ^ (-1278066578);
                        i21 = -349337761;
                    }
                    int i49 = iM31611 ^ i21;
                    i35 = i16;
                    layoutParams6 = layoutParams3;
                    sArr6 = sArr5;
                    i36 = i10;
                    i33 = i49;
                    i32 = i20;
                    imageView3 = imageView2;
                    z12 = z7;
                    iM8177 = i19;
                    z8 = z8;
                    i42 = i18;
                    f3 = f;
                    i44 = i14;
                    linearLayout7 = linearLayout5;
                    iM8178 = i17;
                    i43 = i15;
                    i41 = i41;
                    i40 = i11;
                    strM7761 = strM7761;
                    break;
                case -1698273211:
                case 664572577:
                    C1519.m5403();
                    if (!C17202.m40372()) {
                        strM7761 = strM7761;
                        layoutParams3 = layoutParams6;
                        i10 = i36;
                        i44 = i44;
                        f3 = f3;
                        iM8177 = iM8177;
                        imageView3 = imageView3;
                        i35 = i35;
                        z11 = z11;
                        i39 = i39;
                        z13 = z13;
                        i40 = i40;
                        i41 = i41;
                        i43 = i43;
                        i5 = iM8178;
                        linearLayout3 = linearLayout7;
                        i = i42;
                        z = z12;
                        sArr3 = sArr6;
                        int iM2769 = C0619.m2761("ۙ֡") ^ i31;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM2769 ^ 1623135943;
                        i32 = ((iM2769 ^ i30) * (-31291)) ^ 372193401;
                        z12 = z;
                        strM7761 = strM7761;
                        i42 = i;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    } else {
                        strM7761 = strM7761;
                        z8 = z8;
                        layoutParams4 = layoutParams6;
                        i12 = i36;
                        textView = textViewM7852;
                        linearLayout4 = linearLayout7;
                        i13 = i44;
                        sArr4 = sArr6;
                        int iM31618 = C0773.m3169("ۗۨ") ^ i31;
                        i32 = ((iM31618 ^ i30) * (-1643)) ^ 2102451901;
                        textViewM7852 = textView;
                        sArr6 = sArr4;
                        f3 = f3;
                        z12 = z12;
                        layoutParams6 = layoutParams4;
                        i36 = i12;
                        i44 = i13;
                        i33 = iM31618 ^ (-1563687302);
                        i42 = i42;
                        z8 = z8;
                        linearLayout7 = linearLayout4;
                        strM7761 = strM7761;
                    }
                    break;
                case -1633103747:
                case 508007529:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams4 = layoutParams6;
                    i12 = i36;
                    linearLayout4 = linearLayout7;
                    sArr4 = sArr6;
                    textView = textViewM7852;
                    C2023.m6954(textView, C0773.m3169(C2966.m9670(sArr4, 78, 3, i34)) ^ 2100719427);
                    textView.setGravity(17);
                    i13 = -2;
                    if (C1826.f6190 > 0) {
                        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams7.topMargin = C2419.m8177(16);
                        C11471 c11471 = C11471.f36082;
                        C11235.m28298(linearLayout4, textView, layoutParams7);
                        f3 = 12.0f;
                        z12 = true;
                        if (C13473.f42873 == 0) {
                            int iM31619 = (C0773.m3169("۠ۙ") + i30) * 75;
                            i24 = ((iM31619 ^ i31) * 21735) ^ 2001597449;
                            linearLayout7 = linearLayout4;
                            textViewM7852 = textView;
                            sArr6 = sArr4;
                            layoutParams6 = layoutParams4;
                            i36 = i12;
                            strM7761 = strM7761;
                            z8 = z8;
                            i44 = -2;
                            i42 = -1;
                            i43 = 17;
                            i33 = iM31619 ^ (-1066855178);
                            i32 = i24;
                        } else {
                            i44 = -2;
                            i42 = -1;
                            i43 = 17;
                            int iM27610 = C0619.m2761("ۘۧ") ^ i30;
                            linearLayout7 = linearLayout4;
                            textViewM7852 = textView;
                            sArr6 = sArr4;
                            layoutParams6 = layoutParams4;
                            i36 = i12;
                            strM7761 = strM7761;
                            i33 = iM27610 ^ 223379755;
                            i32 = ((iM27610 ^ i31) * (-25117)) ^ (-1426379124);
                            z8 = z8;
                        }
                    } else {
                        i43 = 17;
                        int iM316110 = C0773.m3169("ۗۨ") ^ i31;
                        i32 = ((iM316110 ^ i30) * (-1643)) ^ 2102451901;
                        textViewM7852 = textView;
                        sArr6 = sArr4;
                        f3 = f3;
                        z12 = z12;
                        layoutParams6 = layoutParams4;
                        i36 = i12;
                        i44 = i13;
                        i33 = iM316110 ^ (-1563687302);
                        i42 = i42;
                        z8 = z8;
                        linearLayout7 = linearLayout4;
                        strM7761 = strM7761;
                    }
                    break;
                case -1402663471:
                case 1678771426:
                    C3448.m11257(C3448.m11252(f67068, 22, 4, i34));
                    throw th;
                case -1372132927:
                case -658554990:
                    if (iM8880 > 0) {
                        iM2762 = C0619.m2761("۫ܳ") ^ i30;
                        i24 = ((iM2762 ^ i31) * (-11141)) ^ (-112968336);
                        i28 = 31696370;
                    } else {
                        iM2762 = (i31 - C0773.m3169("᩵ܰ")) * 99;
                        i24 = ((iM2762 ^ i30) * 12073) ^ 512339925;
                        i28 = 1586590801;
                    }
                    i33 = iM2762 ^ i28;
                    i32 = i24;
                    break;
                case -1361789600:
                case 1922415455:
                    textViewM7851.setPaintFlags(textViewM7851.getPaintFlags() | 16);
                    iM2762 = (i31 - C0773.m3169("᩵ܰ")) * 99;
                    i24 = ((iM2762 ^ i30) * 12073) ^ 512339925;
                    i28 = 1586590801;
                    i33 = iM2762 ^ i28;
                    i32 = i24;
                    break;
                case -1331007291:
                case 1833683028:
                    layoutParams5 = layoutParams6;
                    i25 = i36;
                    C2375.m8066(linearLayout6, linearLayout9, new LinearLayout.LayoutParams(0, -2, 1.0f));
                    textViewM7851 = C2331.m7851(activityC0093, 14.0f, z8);
                    iM8880 = C2702.m8880(jSONObject5, C3998.m12925(f67068, UMErrorCode.E_UM_BE_CREATE_FAILED, 6, i34));
                    if (iM8880 > 0) {
                        int iM31620 = (C0773.m3169("ܳ᩻") + i31) * (-5);
                        layoutParams6 = layoutParams5;
                        i36 = i25;
                        i33 = iM31620 ^ (-1468807936);
                        i32 = ((iM31620 ^ i30) * (-1011)) ^ (-371407116);
                        i35 = 0;
                    } else {
                        strM7761 = str5;
                        i35 = 0;
                        iM31613 = C0773.m3169("֡۠") ^ i30;
                        i26 = ((iM31613 ^ i31) * (-18081)) ^ 2111565683;
                        i27 = 669229768;
                        int i50 = iM31613 ^ i27;
                        i36 = i25;
                        LinearLayout.LayoutParams layoutParams8 = layoutParams5;
                        i33 = i50;
                        i32 = i26;
                        layoutParams6 = layoutParams8;
                    }
                    break;
                case -1305458643:
                case 851790140:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams6 = layoutParams6;
                    i37 = i37;
                    length = length;
                    i44 = i44;
                    f3 = f3;
                    linearLayout6 = linearLayout6;
                    c9043 = c9043;
                    jSONObject4 = jSONObject4;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    str5 = str5;
                    z11 = z11;
                    i39 = i39;
                    iM2765 = iM2765;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    z9 = z9;
                    i38 = i38;
                    jSONArray3 = jSONArray3;
                    iM8178 = iM8178;
                    linearLayout7 = linearLayout7;
                    i42 = i42;
                    z12 = z12;
                    sArr6 = sArr6;
                    if (m47953()) {
                        iM3169 = C0619.m2761("᩹᩶") ^ i30;
                        i32 = ((iM3169 ^ i31) * 16873) ^ (-952210034);
                        i7 = 1936808992;
                    } else {
                        iM3169 = C0773.m3169("ܳܳ") ^ i31;
                        i32 = ((iM3169 ^ i30) * (-13865)) ^ 1621403044;
                        i7 = 1753675535;
                    }
                    int i51 = iM3169 ^ i7;
                    jSONArray3 = jSONArray3;
                    jSONObject4 = jSONObject4;
                    sArr6 = sArr6;
                    strM7761 = strM7761;
                    length = length;
                    i38 = i38;
                    z9 = z9;
                    iM2765 = iM2765;
                    str5 = str5;
                    z12 = z12;
                    layoutParams6 = layoutParams6;
                    i33 = i51;
                    c9043 = c9043;
                    linearLayout6 = linearLayout6;
                    i42 = i42;
                    c20976 = this;
                    i37 = i37;
                    linearLayout7 = linearLayout7;
                    iM8178 = iM8178;
                    z8 = z8;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case -1266619560:
                case 575573645:
                    layoutParams6.topMargin = C2419.m8177(6);
                    iM2762 = (C0619.m2761("᩸ۧ") + i31) * 119;
                    i24 = ((iM2762 ^ i30) * 1149) ^ (-1498364193);
                    i28 = -306927604;
                    i33 = iM2762 ^ i28;
                    i32 = i24;
                    break;
                case -1199291638:
                case 1806997938:
                    String str6 = strM7761;
                    z2 = z8;
                    layoutParams6 = layoutParams6;
                    length = length;
                    i44 = i44;
                    f3 = f3;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    z11 = z11;
                    i39 = i39;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    i5 = iM8178;
                    linearLayout3 = linearLayout7;
                    i6 = i42;
                    boolean z15 = z12;
                    sArr6 = sArr6;
                    ActivityC0093.m1165(activityC0093, jSONObject3);
                    i38 = i38;
                    jSONArray3 = jSONArray3;
                    int i52 = i37;
                    C2485.m8358(C2878.m9476(activityC0093, i38), i52);
                    linearLayout8.removeAllViews();
                    jSONObject4 = c20976.f67069;
                    if (jSONObject4 != null) {
                        int iM31621 = C0773.m3169("ۛܳ") ^ i31;
                        i32 = ((iM31621 ^ i30) * (-24337)) ^ 21845195;
                        i33 = iM31621 ^ 43675167;
                    } else {
                        int iM27611 = (C0619.m2761("᩵֨") ^ i31) * (-73);
                        i33 = iM27611 ^ 261331933;
                        i32 = ((iM27611 ^ i30) * (-31533)) ^ 1289813427;
                        linearLayout6 = linearLayout6;
                    }
                    z12 = z15;
                    strM7761 = str6;
                    i37 = i52;
                    i42 = i6;
                    z8 = z2;
                    linearLayout7 = linearLayout3;
                    iM8178 = i5;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case -1194770548:
                case 1730033835:
                    i34 = 13866;
                    iM3169 = (C0773.m3169("᩷ܰ") + i31) * (-117);
                    i32 = ((iM3169 ^ i30) * 19815) ^ 213251957;
                    i7 = 953709396;
                    int i53 = iM3169 ^ i7;
                    jSONArray3 = jSONArray3;
                    jSONObject4 = jSONObject4;
                    sArr6 = sArr6;
                    strM7761 = strM7761;
                    length = length;
                    i38 = i38;
                    z9 = z9;
                    iM2765 = iM2765;
                    str5 = str5;
                    z12 = z12;
                    layoutParams6 = layoutParams6;
                    i33 = i53;
                    c9043 = c9043;
                    linearLayout6 = linearLayout6;
                    i42 = i42;
                    c20976 = this;
                    i37 = i37;
                    linearLayout7 = linearLayout7;
                    iM8178 = iM8178;
                    z8 = z8;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case -1139346515:
                case 102684016:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams6 = layoutParams6;
                    int i54 = i36;
                    i11 = i40;
                    i41 = i41;
                    int i55 = iM8177;
                    ImageView imageView4 = imageView3;
                    i44 = i44;
                    i43 = i43;
                    f3 = f3;
                    short[] sArr7 = sArr6;
                    i35 = i35;
                    int i56 = iM8178;
                    linearLayout7 = linearLayout7;
                    i42 = i42;
                    z12 = z12;
                    imageView3 = imageView4;
                    iM8178 = i56;
                    C13473.m33140(C1564.m5518(activityC0093, C0773.m3169(C3492.m11486(f67068, 72, 3, i34)) ^ 2124195255), 0);
                    if (activityC0093.f1010 >= 0) {
                        int iM31622 = (C0773.m3169("ܿܶ") + i30) * (-27);
                        sArr6 = sArr7;
                        i35 = i35;
                        f3 = f3;
                        z12 = z12;
                        i36 = i54;
                        i44 = i44;
                        imageView3 = imageView3;
                        i42 = i42;
                        iM8177 = i55;
                        linearLayout7 = linearLayout7;
                        iM8178 = iM8178;
                        layoutParams6 = layoutParams6;
                        i33 = iM31622 ^ (-1348406184);
                        i32 = ((iM31622 ^ i31) * (-16999)) ^ (-1233090087);
                        i43 = i43;
                        z8 = z8;
                        i41 = i41;
                        i40 = i11;
                        strM7761 = strM7761;
                    } else {
                        iM8177 = i55;
                        sArr6 = sArr7;
                        i37 = i37;
                        length = length;
                        z11 = z11;
                        i39 = i39;
                        i36 = i54;
                        linearLayout6 = linearLayout6;
                        c9043 = c9043;
                        jSONObject4 = jSONObject4;
                        z13 = z13;
                        i40 = i11;
                        str5 = str5;
                        iM2765 = iM2765;
                        z9 = z9;
                        i38 = i38;
                        jSONArray3 = jSONArray3;
                        iM3169 = C0773.m3169("ܳܳ") ^ i31;
                        i32 = ((iM3169 ^ i30) * (-13865)) ^ 1621403044;
                        i7 = 1753675535;
                        int i57 = iM3169 ^ i7;
                        jSONArray3 = jSONArray3;
                        jSONObject4 = jSONObject4;
                        sArr6 = sArr6;
                        strM7761 = strM7761;
                        length = length;
                        i38 = i38;
                        z9 = z9;
                        iM2765 = iM2765;
                        str5 = str5;
                        z12 = z12;
                        layoutParams6 = layoutParams6;
                        i33 = i57;
                        c9043 = c9043;
                        linearLayout6 = linearLayout6;
                        i42 = i42;
                        c20976 = this;
                        i37 = i37;
                        linearLayout7 = linearLayout7;
                        iM8178 = iM8178;
                        z8 = z8;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    break;
                case -1033931378:
                case -10514315:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams6 = layoutParams6;
                    i37 = i37;
                    length = length;
                    i44 = i44;
                    f3 = f3;
                    linearLayout6 = linearLayout6;
                    c9043 = c9043;
                    jSONObject4 = jSONObject4;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    str5 = str5;
                    z11 = z11;
                    i39 = i39;
                    iM2765 = iM2765;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    z9 = z9;
                    i38 = i38;
                    jSONArray3 = jSONArray3;
                    iM8178 = iM8178;
                    linearLayout7 = linearLayout7;
                    i42 = i42;
                    z12 = z12;
                    sArr6 = sArr6;
                    short s = f67068[0];
                    int i58 = (s * 2) + 1;
                    int i59 = s + 1;
                    if (i58 - (i59 * i59) > 0) {
                        iM3169 = C0773.m3169("᩶᩺") ^ i30;
                        i32 = ((iM3169 ^ i31) * (-7307)) ^ (-394739992);
                        i7 = 1305591530;
                    } else {
                        iM3169 = (i31 - C0773.m3169("ᩳ֨")) * 19;
                        i32 = ((iM3169 ^ i30) * 10667) ^ (-991920221);
                        i7 = 2004718903;
                    }
                    int i510 = iM3169 ^ i7;
                    jSONArray3 = jSONArray3;
                    jSONObject4 = jSONObject4;
                    sArr6 = sArr6;
                    strM7761 = strM7761;
                    length = length;
                    i38 = i38;
                    z9 = z9;
                    iM2765 = iM2765;
                    str5 = str5;
                    z12 = z12;
                    layoutParams6 = layoutParams6;
                    i33 = i510;
                    c9043 = c9043;
                    linearLayout6 = linearLayout6;
                    i42 = i42;
                    c20976 = this;
                    i37 = i37;
                    linearLayout7 = linearLayout7;
                    iM8178 = iM8178;
                    z8 = z8;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case -924378548:
                case 1505680312:
                    str = strM7761;
                    z2 = z8;
                    linearLayout2 = linearLayout6;
                    layoutParams2 = layoutParams6;
                    c9042 = c9043;
                    i3 = length;
                    jSONArray2 = jSONArray3;
                    i44 = i44;
                    f3 = f3;
                    str2 = str5;
                    jSONObject = jSONObject4;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    i4 = iM2765;
                    z11 = z11;
                    i39 = i39;
                    z3 = z9;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    i5 = iM8178;
                    linearLayout3 = linearLayout7;
                    i6 = i42;
                    z4 = z12;
                    sArr2 = sArr6;
                    String str7 = c20976.f67072;
                    iM2763 = C0619.m2761(C3033.m9847(f67068, 1, 3, i34)) ^ 2119682287;
                    th = null;
                    iM2761 = C0619.m2761(C1564.m5510(f67068, 4, 3, i34)) ^ 2099745543;
                    if (C2419.f7754 < 0) {
                        int iM31623 = (C0773.m3169("᩹ۜ") ^ i31) * (-117);
                        str4 = str7;
                        i32 = ((iM31623 ^ i30) * (-9907)) ^ 1589065088;
                        z9 = z3;
                        iM2765 = i4;
                        str5 = str2;
                        jSONArray3 = jSONArray2;
                        jSONObject4 = jSONObject;
                        sArr6 = sArr2;
                        strM7761 = str;
                        i38 = iM2761;
                        c9043 = c9042;
                        length = i3;
                        linearLayout6 = linearLayout2;
                        z12 = z4;
                        layoutParams6 = layoutParams2;
                        i37 = 8;
                        c20976 = this;
                        i33 = iM31623 ^ (-24306648);
                        i42 = i6;
                        z8 = z2;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    } else {
                        str4 = str7;
                        i2 = 8;
                        int iM31624 = (i31 - C0773.m3169("۟֫")) * 77;
                        z9 = z3;
                        iM2765 = i4;
                        str5 = str2;
                        jSONArray3 = jSONArray2;
                        jSONObject4 = jSONObject;
                        sArr6 = sArr2;
                        i38 = iM2761;
                        c9043 = c9042;
                        length = i3;
                        linearLayout6 = linearLayout2;
                        z12 = z4;
                        layoutParams6 = layoutParams2;
                        c20976 = this;
                        i33 = iM31624 ^ (-1347654945);
                        i37 = i2;
                        i32 = ((iM31624 ^ i30) * (-17641)) ^ 1805854512;
                        i42 = i6;
                        strM7761 = str;
                        z8 = z2;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    break;
                case -857120562:
                case -409400228:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams = layoutParams6;
                    jSONArray = jSONArray3;
                    i44 = i44;
                    f3 = f3;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    z11 = z11;
                    i39 = i39;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    i5 = iM8178;
                    linearLayout3 = linearLayout7;
                    i = i42;
                    z = z12;
                    sArr = sArr6;
                    jSONObject5 = jSONArray.getJSONObject(i36);
                    C2310.m7811(jSONObject5, C17202.m40377(f67068, 37, 18, i34));
                    dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
                    z10 = jSONObject5.getBoolean(RunnableC0334.m2049(f67068, 55, 5, i34));
                    linearLayout6 = new LinearLayout(activityC0093);
                    if (C3734.f12817 < 0) {
                        iM31610 = (i30 - C0773.m3169("ۚ۟")) * 69;
                        i8 = ((iM31610 ^ i31) * (-2847)) ^ (-1261506384);
                        i9 = 121851410;
                        int i60 = iM31610 ^ i9;
                        jSONArray3 = jSONArray;
                        i32 = i8;
                        layoutParams6 = layoutParams;
                        sArr6 = sArr;
                        z8 = z8;
                        i33 = i60;
                        z12 = z;
                        strM7761 = strM7761;
                        i42 = i;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    } else {
                        linearLayout = linearLayout3;
                        iM8178 = i5;
                        int iM31625 = (C0773.m3169("ۚ۫") + i30) * (-35);
                        jSONArray3 = jSONArray;
                        i32 = ((iM31625 ^ i31) * 16771) ^ 472638393;
                        i43 = i43;
                        layoutParams6 = layoutParams;
                        sArr6 = sArr;
                        i33 = iM31625 ^ (-1019101705);
                        i41 = i41;
                        z12 = z;
                        z8 = z8;
                        i40 = i40;
                        z13 = z13;
                        i42 = i;
                        linearLayout7 = linearLayout;
                        i39 = i39;
                        strM7761 = strM7761;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    break;
                case -780593163:
                case -90531729:
                    c9043.m24145(str5);
                    ((LinearLayout) C1564.m5518(activityC0093, iM2765)).removeAllViews();
                    C2485.m8358(C1564.m5518(activityC0093, iM2764), i37);
                    TextView textView2 = (TextView) C1564.m5518(activityC0093, i38);
                    C2354.m7978(textView2, str4);
                    boolean z16 = z9;
                    C13473.m33140(textView2, z16 ? 1 : 0);
                    ((ScrollView) C1564.m5518(activityC0093, iM2763)).scrollTo(z16 ? 1 : 0, z16 ? 1 : 0);
                    return;
                case -739339756:
                case -150476477:
                    ScrollView scrollView = (ScrollView) C1564.m5518(activityC0093, C0619.m2761(C3734.m12149(f67068, 108, 3, i34)) ^ 2129884733);
                    ViewTreeObserverOnPreDrawListenerC12794.m31683(scrollView, new RunnableC14262(c20976, activityC0093, scrollView));
                    return;
                case -577481755:
                case -139933437:
                    strM7761 = strM7761;
                    boolean z17 = z8;
                    i35 = i35;
                    layoutParams3 = layoutParams6;
                    i10 = i36;
                    LinearLayout linearLayout11 = linearLayout7;
                    i44 = i44;
                    i = i42;
                    f3 = f3;
                    z = z12;
                    short[] sArr8 = sArr6;
                    int i61 = i41;
                    int i62 = iM8178;
                    i43 = i43;
                    int i63 = iM8177;
                    linearLayout11.setPadding(i62, i61, i63, C3492.m11481(60));
                    imageView3 = new ImageView(activityC0093);
                    linearLayout3 = linearLayout11;
                    String strM12149 = C3734.m12149(f67068, 75, 3, i34);
                    if (!C2023.f6737) {
                        int iM31626 = C0773.m3169("۬ܶ") ^ i31;
                        sArr6 = sArr8;
                        i43 = i43;
                        f3 = f3;
                        z12 = z;
                        i41 = i61;
                        i36 = i10;
                        str3 = strM12149;
                        i32 = ((iM31626 ^ i30) * (-28065)) ^ (-104062833);
                        i44 = i44;
                        i42 = i;
                        z8 = z17;
                        linearLayout7 = linearLayout3;
                        iM8178 = i62;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = i63;
                        layoutParams6 = layoutParams3;
                        i33 = iM31626 ^ (-252679139);
                        strM7761 = strM7761;
                    } else {
                        i5 = i62;
                        iM8177 = i63;
                        sArr3 = sArr8;
                        z11 = z11;
                        i39 = i39;
                        z8 = z17;
                        z13 = z13;
                        i40 = i40;
                        i41 = i61;
                        str3 = strM12149;
                        int iM27612 = C0619.m2761("ۙ֡") ^ i31;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM27612 ^ 1623135943;
                        i32 = ((iM27612 ^ i30) * (-31291)) ^ 372193401;
                        z12 = z;
                        strM7761 = strM7761;
                        i42 = i;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    break;
                case -507710210:
                case -13791947:
                    layoutParams5 = layoutParams6;
                    i25 = i36;
                    strM7761 = C2288.m7761(f67068, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 1, i34);
                    iM31613 = C0773.m3169("֡۠") ^ i30;
                    i26 = ((iM31613 ^ i31) * (-18081)) ^ 2111565683;
                    i27 = 669229768;
                    int i511 = iM31613 ^ i27;
                    i36 = i25;
                    LinearLayout.LayoutParams layoutParams9 = layoutParams5;
                    i33 = i511;
                    i32 = i26;
                    layoutParams6 = layoutParams9;
                    break;
                case -497843043:
                case 1822232168:
                    return;
                case -425515959:
                case 1505906964:
                    C2310.m7813();
                    if (C2966.f9654 < 0) {
                        iM2762 = C0773.m3169("ܺۜ") ^ i31;
                        i24 = ((iM2762 ^ i30) * 29919) ^ (-1827974594);
                        i28 = 1952767331;
                        i33 = iM2762 ^ i28;
                        i32 = i24;
                    } else {
                        strM7761 = strM7761;
                        z8 = z8;
                        layoutParams3 = layoutParams6;
                        i10 = i36;
                        z5 = z13;
                        i40 = i40;
                        i41 = i41;
                        i44 = i44;
                        i43 = i43;
                        f3 = f3;
                        iM8177 = iM8177;
                        i5 = iM8178;
                        imageView3 = imageView3;
                        linearLayout3 = linearLayout7;
                        i = i42;
                        z = z12;
                        sArr3 = sArr6;
                        i35 = i35;
                        z11 = z11;
                        i39 = i39;
                        int iM316111 = (i30 - C0773.m3169("ܳ᩸")) * 19;
                        linearLayout9 = null;
                        i39 = i39;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM316111 ^ (-1013003868);
                        i32 = ((iM316111 ^ i31) * 24569) ^ (-39315148);
                        z11 = z11;
                        i35 = i35;
                        z12 = z;
                        strM7761 = strM7761;
                        imageView3 = imageView3;
                        i42 = i;
                        iM8177 = iM8177;
                        linearLayout7 = linearLayout3;
                        f3 = f3;
                        iM8178 = i5;
                        i44 = i44;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z5;
                        z8 = z8;
                    }
                    break;
                case -362128675:
                case 212847615:
                    C2834.m9344();
                    C1783.m6232();
                    iM2762 = C0619.m2761("ۖܰ") ^ i31;
                    i24 = ((iM2762 ^ i30) * (-28363)) ^ 1306966836;
                    i28 = -407903382;
                    i33 = iM2762 ^ i28;
                    i32 = i24;
                    break;
                case -335176106:
                case 334982412:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams6 = layoutParams6;
                    i37 = i37;
                    length = length;
                    i44 = i44;
                    f3 = f3;
                    linearLayout6 = linearLayout6;
                    c9043 = c9043;
                    jSONObject4 = jSONObject4;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    str5 = str5;
                    z11 = z11;
                    i39 = i39;
                    iM2765 = iM2765;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    z9 = z9;
                    i38 = i38;
                    jSONArray3 = jSONArray3;
                    iM8178 = iM8178;
                    linearLayout7 = linearLayout7;
                    i42 = i42;
                    z12 = z12;
                    sArr6 = sArr6;
                    if (c20976.f67069 != null) {
                        int iM31627 = (C0773.m3169("ۖۖ") + i31) * (-63);
                        jSONArray3 = jSONArray3;
                        jSONObject4 = jSONObject4;
                        sArr6 = sArr6;
                        length = length;
                        i38 = i38;
                        z9 = z9;
                        iM2765 = iM2765;
                        str5 = str5;
                        z12 = z12;
                        layoutParams6 = layoutParams6;
                        i33 = iM31627 ^ (-1082859065);
                        i32 = ((iM31627 ^ i30) * (-28521)) ^ 568986920;
                        c9043 = c9043;
                        linearLayout6 = linearLayout6;
                        i42 = i42;
                        strM7761 = strM7761;
                        i37 = i37;
                        linearLayout7 = linearLayout7;
                        iM8178 = iM8178;
                        z8 = z8;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    iM3169 = C0773.m3169("ܳܳ") ^ i31;
                    i32 = ((iM3169 ^ i30) * (-13865)) ^ 1621403044;
                    i7 = 1753675535;
                    int i512 = iM3169 ^ i7;
                    jSONArray3 = jSONArray3;
                    jSONObject4 = jSONObject4;
                    sArr6 = sArr6;
                    strM7761 = strM7761;
                    length = length;
                    i38 = i38;
                    z9 = z9;
                    iM2765 = iM2765;
                    str5 = str5;
                    z12 = z12;
                    layoutParams6 = layoutParams6;
                    i33 = i512;
                    c9043 = c9043;
                    linearLayout6 = linearLayout6;
                    i42 = i42;
                    c20976 = this;
                    i37 = i37;
                    linearLayout7 = linearLayout7;
                    iM8178 = iM8178;
                    z8 = z8;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case -318961475:
                case 1247159324:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams = layoutParams6;
                    int i64 = i36;
                    float f6 = f3;
                    boolean z18 = z12;
                    TextView textViewM7855 = C2331.m7851(activityC0093, f6, z18);
                    C1080.m4060(textViewM7855, C0619.m2761(C2354.m7980(f67068, 81, 3, i34)) ^ 2098563835);
                    int i65 = i43;
                    textViewM7855.setGravity(i65);
                    i44 = i44;
                    f3 = f6;
                    int i66 = i42;
                    LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(i66, i44);
                    z = z18;
                    layoutParams10.topMargin = C2419.m8177(6);
                    LinearLayout linearLayout12 = linearLayout7;
                    C2375.m8066(linearLayout12, textViewM7855, layoutParams10);
                    C2375.m8066(linearLayout8, linearLayout12, new LinearLayout.LayoutParams(i66, i44));
                    i = i66;
                    jSONArray = jSONArray3;
                    iM8177 = iM8177;
                    i5 = iM8178;
                    imageView3 = imageView3;
                    sArr = sArr6;
                    i36 = i64;
                    linearLayout3 = linearLayout12;
                    i35 = i35;
                    z11 = z11;
                    i39 = i39;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i65;
                    iM31610 = (C0773.m3169("ᩳ᩻") + i31) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i8 = ((iM31610 ^ i30) * (-9939)) ^ (-801513522);
                    i9 = 1336024778;
                    int i67 = iM31610 ^ i9;
                    jSONArray3 = jSONArray;
                    i32 = i8;
                    layoutParams6 = layoutParams;
                    sArr6 = sArr;
                    z8 = z8;
                    i33 = i67;
                    z12 = z;
                    strM7761 = strM7761;
                    i42 = i;
                    linearLayout7 = linearLayout3;
                    iM8178 = i5;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case -238519244:
                case 203739137:
                    C2878.m9479(linearLayout6, textViewM7851);
                    layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                    if (C4282.m13651(linearLayout8) == 0) {
                        iM2762 = C0773.m3169("᩺۠") ^ i30;
                        i24 = ((iM2762 ^ i31) * 23533) ^ 204677032;
                        i28 = -1638983557;
                    } else {
                        iM2762 = (C0619.m2761("᩸ۧ") + i31) * 119;
                        i24 = ((iM2762 ^ i30) * 1149) ^ (-1498364193);
                        i28 = -306927604;
                    }
                    i33 = iM2762 ^ i28;
                    i32 = i24;
                    break;
                case -137587575:
                case 2049254437:
                    strM7761 = strM7761;
                    z8 = z8;
                    LinearLayout.LayoutParams layoutParams11 = layoutParams6;
                    int i68 = i36;
                    LinearLayout linearLayout13 = linearLayout7;
                    int i69 = i44;
                    int i70 = i42;
                    int i71 = i43;
                    float f7 = f3;
                    boolean z19 = z12;
                    imageView = imageView3;
                    imageView.setImageResource(C0773.m3169(str3) ^ 2123690926);
                    imageView.setImageTintList(ColorStateList.valueOf(C3296.f10733));
                    imageView.setImportantForAccessibility(2);
                    float f8 = 36;
                    int i72 = i35;
                    C2375.m8066(linearLayout13, imageView, new LinearLayout.LayoutParams(C3492.m11481(f8), C3492.m11481(f8)));
                    textViewM7852 = C2331.m7851((Context) activityC0093, 15.0f, false);
                    sArr6 = f67068;
                    if (RunnableC1848.f6235) {
                        iM31612 = C0773.m3169("ۙܺ") ^ i30;
                        i22 = ((iM31612 ^ i31) * 16539) ^ 1309116441;
                        i23 = 912982122;
                    } else {
                        iM31612 = C0773.m3169("᩶ܳ") ^ i31;
                        i22 = ((iM31612 ^ i30) * 16775) ^ (-1589961390);
                        i23 = -1802421530;
                    }
                    int i73 = iM31612 ^ i23;
                    i43 = i71;
                    f3 = f7;
                    z12 = z19;
                    layoutParams6 = layoutParams11;
                    i36 = i68;
                    i33 = i73;
                    i32 = i22;
                    i44 = i69;
                    i35 = i72;
                    i42 = i70;
                    linearLayout7 = linearLayout13;
                    imageView3 = imageView;
                    strM7761 = strM7761;
                    z8 = z8;
                    break;
                case -119373426:
                case 1736309787:
                    C11471 c11472 = C11471.f36082;
                    C11235.m28298(linearLayout8, linearLayout6, layoutParams6);
                    i36++;
                    z6 = false;
                    jSONObject2 = jSONObject4;
                    int iM316112 = C0773.m3169("ۙܳ") ^ i30;
                    jSONObject4 = jSONObject2;
                    i39 = i39;
                    sArr6 = sArr6;
                    strM7761 = strM7761;
                    z11 = z11;
                    i35 = i35;
                    z12 = z12;
                    imageView3 = imageView3;
                    i42 = i42;
                    iM8177 = iM8177;
                    linearLayout7 = linearLayout7;
                    f3 = f3;
                    iM8178 = iM8178;
                    i44 = i44;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z6;
                    i32 = ((iM316112 ^ i31) * (-4011)) ^ (-160327586);
                    layoutParams6 = layoutParams6;
                    i33 = iM316112 ^ 441376696;
                    z8 = z8;
                    break;
                case -21909901:
                case 1926436486:
                    if (C11235.f35427 < 0) {
                        strM7761 = strM7761;
                        z8 = z8;
                        layoutParams4 = layoutParams6;
                        i12 = i36;
                        textView = textViewM7852;
                        linearLayout4 = linearLayout7;
                        sArr4 = sArr6;
                        int iM27613 = C0619.m2761("ۘۧ") ^ i30;
                        linearLayout7 = linearLayout4;
                        textViewM7852 = textView;
                        sArr6 = sArr4;
                        layoutParams6 = layoutParams4;
                        i36 = i12;
                        strM7761 = strM7761;
                        i33 = iM27613 ^ 223379755;
                        i32 = ((iM27613 ^ i31) * (-25117)) ^ (-1426379124);
                        z8 = z8;
                    } else {
                        strM7761 = strM7761;
                        layoutParams3 = layoutParams6;
                        i10 = i36;
                        i44 = i44;
                        f3 = f3;
                        iM8177 = iM8177;
                        imageView3 = imageView3;
                        i35 = i35;
                        z11 = z11;
                        i39 = i39;
                        z13 = z13;
                        i40 = i40;
                        i41 = i41;
                        i43 = i43;
                        i5 = iM8178;
                        linearLayout3 = linearLayout7;
                        i = i42;
                        z = z12;
                        sArr3 = sArr6;
                        int iM27614 = C0619.m2761("ۙ֡") ^ i31;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM27614 ^ 1623135943;
                        i32 = ((iM27614 ^ i30) * (-31291)) ^ 372193401;
                        z12 = z;
                        strM7761 = strM7761;
                        i42 = i;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    break;
                case -2741212:
                case 733706160:
                    layoutParams3 = layoutParams6;
                    i10 = i36;
                    TextView textViewM7856 = C2331.m7851((Context) activityC0093, 12.0f, true);
                    String strM4238 = C1146.m4238(jSONObject5, C1146.m4222(f67068, 84, 10, i34));
                    strM7761 = strM7761;
                    z8 = z8;
                    long j = jSONObject5.getLong(C1783.m6233(f67068, 94, 11, i34));
                    if (C2375.f7641 > 0) {
                        String str8 = dateTimeInstance.format(new Date(j));
                        StringBuilder sb = new StringBuilder();
                        C1783.m6234(sb, strM4238);
                        C1783.m6234(sb, C1542.m5471(f67068, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 3, i34));
                        C1783.m6234(sb, str8);
                        C23916.m53425(textViewM7856, C1080.m4058(sb));
                        C2878.m9479(linearLayout9, textViewM7856);
                        i11 = i40;
                        i41 = i41;
                        i14 = i44;
                        i15 = i43;
                        f = f3;
                        i19 = iM8177;
                        i17 = iM8178;
                        imageView2 = imageView3;
                        linearLayout5 = linearLayout7;
                        i18 = i42;
                        z7 = z12;
                        sArr5 = sArr6;
                        i16 = i35;
                        iM31611 = C0773.m3169("ܰۜ") ^ i30;
                        i20 = ((iM31611 ^ i31) * 6281) ^ (-889598558);
                        i21 = 1200088445;
                        int i410 = iM31611 ^ i21;
                        i35 = i16;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr5;
                        i36 = i10;
                        i33 = i410;
                        i32 = i20;
                        imageView3 = imageView2;
                        z12 = z7;
                        iM8177 = i19;
                        z8 = z8;
                        i42 = i18;
                        f3 = f;
                        i44 = i14;
                        linearLayout7 = linearLayout5;
                        iM8178 = i17;
                        i43 = i15;
                        i41 = i41;
                        i40 = i11;
                        strM7761 = strM7761;
                    } else {
                        z5 = z13;
                        i40 = i40;
                        i41 = i41;
                        i44 = i44;
                        i43 = i43;
                        f3 = f3;
                        iM8177 = iM8177;
                        i5 = iM8178;
                        imageView3 = imageView3;
                        linearLayout3 = linearLayout7;
                        i = i42;
                        z = z12;
                        sArr3 = sArr6;
                        i35 = i35;
                        z11 = z11;
                        i39 = i39;
                        int iM316113 = (i30 - C0773.m3169("ܳ᩸")) * 19;
                        linearLayout9 = null;
                        i39 = i39;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM316113 ^ (-1013003868);
                        i32 = ((iM316113 ^ i31) * 24569) ^ (-39315148);
                        z11 = z11;
                        i35 = i35;
                        z12 = z;
                        strM7761 = strM7761;
                        imageView3 = imageView3;
                        i42 = i;
                        iM8177 = iM8177;
                        linearLayout7 = linearLayout3;
                        f3 = f3;
                        iM8178 = i5;
                        i44 = i44;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z5;
                        z8 = z8;
                    }
                    break;
                case 48201884:
                case 1850752721:
                    if (!C17202.m40372()) {
                        iM2762 = C0619.m2761("ܺۨ") ^ i30;
                        i24 = ((iM2762 ^ i31) * 12023) ^ (-788141274);
                        i28 = -1552856664;
                        i33 = iM2762 ^ i28;
                        i32 = i24;
                    } else {
                        strM7761 = strM7761;
                        z8 = z8;
                        layoutParams = layoutParams6;
                        jSONArray = jSONArray3;
                        linearLayout = linearLayout7;
                        i44 = i44;
                        i = i42;
                        f3 = f3;
                        z = z12;
                        sArr = sArr6;
                        iM8177 = iM8177;
                        imageView3 = imageView3;
                        i35 = i35;
                        z11 = z11;
                        i39 = i39;
                        z13 = z13;
                        i40 = i40;
                        i41 = i41;
                        i43 = i43;
                        int iM31628 = (C0773.m3169("ۚ۫") + i30) * (-35);
                        jSONArray3 = jSONArray;
                        i32 = ((iM31628 ^ i31) * 16771) ^ 472638393;
                        i43 = i43;
                        layoutParams6 = layoutParams;
                        sArr6 = sArr;
                        i33 = iM31628 ^ (-1019101705);
                        i41 = i41;
                        z12 = z;
                        z8 = z8;
                        i40 = i40;
                        z13 = z13;
                        i42 = i;
                        linearLayout7 = linearLayout;
                        i39 = i39;
                        strM7761 = strM7761;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    break;
                case 59944325:
                case 480711534:
                    C3779.m12264();
                    if (C1826.f6190 <= 0) {
                        str = strM7761;
                        z2 = z8;
                        layoutParams2 = layoutParams6;
                        i2 = i37;
                        iM2761 = i38;
                        i3 = length;
                        jSONArray2 = jSONArray3;
                        i44 = i44;
                        f3 = f3;
                        linearLayout2 = linearLayout6;
                        c9042 = c9043;
                        jSONObject = jSONObject4;
                        iM8177 = iM8177;
                        imageView3 = imageView3;
                        i35 = i35;
                        str2 = str5;
                        z11 = z11;
                        i39 = i39;
                        i4 = iM2765;
                        z13 = z13;
                        i40 = i40;
                        i41 = i41;
                        i43 = i43;
                        z3 = z9;
                        i5 = iM8178;
                        linearLayout3 = linearLayout7;
                        i6 = i42;
                        z4 = z12;
                        sArr2 = sArr6;
                        int iM31629 = (i31 - C0773.m3169("۟֫")) * 77;
                        z9 = z3;
                        iM2765 = i4;
                        str5 = str2;
                        jSONArray3 = jSONArray2;
                        jSONObject4 = jSONObject;
                        sArr6 = sArr2;
                        i38 = iM2761;
                        c9043 = c9042;
                        length = i3;
                        linearLayout6 = linearLayout2;
                        z12 = z4;
                        layoutParams6 = layoutParams2;
                        c20976 = this;
                        i33 = iM31629 ^ (-1347654945);
                        i37 = i2;
                        i32 = ((iM31629 ^ i30) * (-17641)) ^ 1805854512;
                        i42 = i6;
                        strM7761 = str;
                        z8 = z2;
                        linearLayout7 = linearLayout3;
                        iM8178 = i5;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z13;
                        i39 = i39;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    } else {
                        iM2762 = C0619.m2761("ۖܰ") ^ i31;
                        i24 = ((iM2762 ^ i30) * (-28363)) ^ 1306966836;
                        i28 = -407903382;
                        i33 = iM2762 ^ i28;
                        i32 = i24;
                    }
                    break;
                case 221241106:
                case 1255030457:
                    Object[] objArr = new Object[1];
                    objArr[i35] = C0619.m2764(iM8880);
                    layoutParams5 = layoutParams6;
                    i25 = i36;
                    String strM8354 = C2485.m8354(activityC0093, C0619.m2761(C2966.m9670(f67068, 118, 3, i34)) ^ 2121787130, objArr);
                    StringBuilder sb2 = new StringBuilder();
                    C1783.m6234(sb2, strM7761);
                    C3779.m12258(sb2, strM8354);
                    C23916.m53425(textViewM7851, C2023.m6952(sb2));
                    textViewM7851.setPadding(C2419.m8177(f2), i35, i35, i35);
                    if (z10) {
                        iM31613 = (C0773.m3169("᩷᩻") ^ i31) * (-25);
                        i26 = ((iM31613 ^ i30) * 1545) ^ (-1653552892);
                        i27 = -550341861;
                    } else {
                        iM31613 = (C0619.m2761("᩻ۖ") ^ i30) * q.h;
                        i26 = ((iM31613 ^ i31) * (-1585)) ^ 993088435;
                        i27 = 1230862374;
                    }
                    int i513 = iM31613 ^ i27;
                    i36 = i25;
                    LinearLayout.LayoutParams layoutParams12 = layoutParams5;
                    i33 = i513;
                    i32 = i26;
                    layoutParams6 = layoutParams12;
                    break;
                case 672745849:
                case 695116090:
                    if (AbstractC0641.f2496 >= 0) {
                        strM7761 = strM7761;
                        z8 = z8;
                        layoutParams3 = layoutParams6;
                        i10 = i36;
                        z5 = z13;
                        i40 = i40;
                        i41 = i41;
                        i44 = i44;
                        i43 = i43;
                        f3 = f3;
                        iM8177 = iM8177;
                        i5 = iM8178;
                        imageView3 = imageView3;
                        linearLayout3 = linearLayout7;
                        i = i42;
                        z = z12;
                        sArr3 = sArr6;
                        i35 = i35;
                        z11 = z11;
                        i39 = i39;
                        int iM316114 = (i30 - C0773.m3169("ܳ᩸")) * 19;
                        linearLayout9 = null;
                        i39 = i39;
                        layoutParams6 = layoutParams3;
                        sArr6 = sArr3;
                        i36 = i10;
                        i33 = iM316114 ^ (-1013003868);
                        i32 = ((iM316114 ^ i31) * 24569) ^ (-39315148);
                        z11 = z11;
                        i35 = i35;
                        z12 = z;
                        strM7761 = strM7761;
                        imageView3 = imageView3;
                        i42 = i;
                        iM8177 = iM8177;
                        linearLayout7 = linearLayout3;
                        f3 = f3;
                        iM8178 = i5;
                        i44 = i44;
                        i43 = i43;
                        i41 = i41;
                        i40 = i40;
                        z13 = z5;
                        z8 = z8;
                    } else {
                        iM2762 = C0619.m2761("ܺۨ") ^ i30;
                        i24 = ((iM2762 ^ i31) * 12023) ^ (-788141274);
                        i28 = -1552856664;
                        i33 = iM2762 ^ i28;
                        i32 = i24;
                    }
                    break;
                case 724545759:
                case 1483807370:
                    C2966.m9667(textViewM7851, C3296.f10738);
                    iM2762 = (i31 - C0773.m3169("᩵ܰ")) * 99;
                    i24 = ((iM2762 ^ i30) * 12073) ^ 512339925;
                    i28 = 1586590801;
                    i33 = iM2762 ^ i28;
                    i32 = i24;
                    break;
                case 728549637:
                case 987844560:
                    i34 = 8935;
                    iM3169 = (C0773.m3169("᩷ܰ") + i31) * (-117);
                    i32 = ((iM3169 ^ i30) * 19815) ^ 213251957;
                    i7 = 953709396;
                    int i514 = iM3169 ^ i7;
                    jSONArray3 = jSONArray3;
                    jSONObject4 = jSONObject4;
                    sArr6 = sArr6;
                    strM7761 = strM7761;
                    length = length;
                    i38 = i38;
                    z9 = z9;
                    iM2765 = iM2765;
                    str5 = str5;
                    z12 = z12;
                    layoutParams6 = layoutParams6;
                    i33 = i514;
                    c9043 = c9043;
                    linearLayout6 = linearLayout6;
                    i42 = i42;
                    c20976 = this;
                    i37 = i37;
                    linearLayout7 = linearLayout7;
                    iM8178 = iM8178;
                    z8 = z8;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case 808517029:
                case 1930916698:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams = layoutParams6;
                    int i74 = i36;
                    imageView = imageView3;
                    i44 = i44;
                    i = i42;
                    i43 = i43;
                    f3 = f3;
                    z = z12;
                    short[] sArr9 = sArr6;
                    i35 = i35;
                    LinearLayout linearLayout14 = new LinearLayout(activityC0093);
                    linearLayout14.setOrientation(1);
                    linearLayout14.setGravity(1);
                    int i75 = i40;
                    float f9 = i75;
                    iM8178 = C2419.m8177(f9);
                    int iM11481 = C3492.m11481(52);
                    iM8177 = C2419.m8177(f9);
                    if (C2288.f7433 > 0) {
                        int iM31630 = C0773.m3169("ۨ᩸") ^ i30;
                        i32 = ((iM31630 ^ i31) * (-23687)) ^ 2110447049;
                        sArr6 = sArr9;
                        i43 = i43;
                        f3 = f3;
                        z12 = z;
                        i36 = i74;
                        i41 = iM11481;
                        i44 = i44;
                        i42 = i;
                        layoutParams6 = layoutParams;
                        i33 = iM31630 ^ (-580587242);
                        linearLayout7 = linearLayout14;
                        i35 = i35;
                        i40 = i75;
                        imageView3 = imageView;
                        strM7761 = strM7761;
                        z8 = z8;
                    } else {
                        i41 = iM11481;
                        sArr = sArr9;
                        z11 = z11;
                        i39 = i39;
                        iM8177 = iM8177;
                        i36 = i74;
                        imageView3 = imageView;
                        z13 = z13;
                        i40 = i75;
                        linearLayout = linearLayout14;
                        jSONArray = jSONArray3;
                        int iM316210 = (C0773.m3169("ۚ۫") + i30) * (-35);
                        jSONArray3 = jSONArray;
                        i32 = ((iM316210 ^ i31) * 16771) ^ 472638393;
                        i43 = i43;
                        layoutParams6 = layoutParams;
                        sArr6 = sArr;
                        i33 = iM316210 ^ (-1019101705);
                        i41 = i41;
                        z12 = z;
                        z8 = z8;
                        i40 = i40;
                        z13 = z13;
                        i42 = i;
                        linearLayout7 = linearLayout;
                        i39 = i39;
                        strM7761 = strM7761;
                        z11 = z11;
                        i35 = i35;
                        imageView3 = imageView3;
                        iM8177 = iM8177;
                        f3 = f3;
                        i44 = i44;
                    }
                    break;
                case 813878343:
                case 1458300488:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams6 = layoutParams6;
                    jSONArray3 = jSONArray3;
                    z13 = z13;
                    int i76 = i41;
                    i44 = i44;
                    int i77 = i43;
                    f3 = f3;
                    iM8177 = iM8177;
                    iM8178 = iM8178;
                    imageView3 = imageView3;
                    linearLayout7 = linearLayout7;
                    i42 = i42;
                    z12 = z12;
                    sArr6 = sArr6;
                    i35 = i35;
                    z11 = true;
                    length = length;
                    if (i36 < length) {
                        int iM27615 = (C0619.m2761("۫ۘ") ^ i30) * (-3);
                        i32 = ((iM27615 ^ i31) * 17245) ^ (-1177673440);
                        i39 = 16;
                        i33 = iM27615 ^ (-1744653580);
                    } else {
                        int iM31631 = (i31 - C0773.m3169("ۙ۟")) * 5;
                        i32 = ((iM31631 ^ i30) * 29201) ^ (-799259871);
                        i39 = 16;
                        i33 = iM31631 ^ (-1797566340);
                    }
                    i43 = i77;
                    i41 = i76;
                    i40 = 20;
                    break;
                case 862160679:
                case 1836756354:
                    C3690.m11987();
                    AbstractC0641.m2813();
                    return;
                case 1017212232:
                case 1049890126:
                    C2834.m9335(C17202.m40377(f67068, 13, 9, i34));
                    throw th;
                case 1130156079:
                case 1734046026:
                    C2834.m9335(C4282.m13650(f67068, 26, 6, i34));
                    throw th;
                case 1181947809:
                case 1458165579:
                    strM7761 = strM7761;
                    z8 = z8;
                    LinearLayout.LayoutParams layoutParams13 = layoutParams6;
                    int i78 = iM2765;
                    String str9 = str5;
                    i37 = i37;
                    int i79 = length;
                    i44 = i44;
                    f3 = f3;
                    linearLayout6 = linearLayout6;
                    boolean z20 = z9;
                    int i80 = i38;
                    JSONObject jSONObject6 = jSONObject4;
                    JSONArray jSONArray5 = jSONArray3;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    z11 = z11;
                    i39 = i39;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    iM8178 = iM8178;
                    linearLayout7 = linearLayout7;
                    i42 = i42;
                    boolean z21 = z12;
                    short[] sArr10 = sArr6;
                    activityC0093.f1010 = -1;
                    activityC0093.f1018 = "";
                    activityC0093.f1016 = "";
                    C9042 c9044 = activityC0093.f1015;
                    if (c9044 != null) {
                        int iM31632 = C0773.m3169("ۢۧ") ^ i30;
                        i32 = ((iM31632 ^ i31) * (-30925)) ^ (-51931796);
                        jSONArray3 = jSONArray5;
                        jSONObject4 = jSONObject6;
                        sArr6 = sArr10;
                        length = i79;
                        i38 = i80;
                        z9 = z20;
                        iM2765 = i78;
                        str5 = str9;
                        z12 = z21;
                        layoutParams6 = layoutParams13;
                        c9043 = c9044;
                        i33 = iM31632 ^ (-799634257);
                    } else {
                        int iM31633 = C0773.m3169("ܳۡ") ^ i30;
                        jSONArray3 = jSONArray5;
                        jSONObject4 = jSONObject6;
                        sArr6 = sArr10;
                        length = i79;
                        i38 = i80;
                        z9 = z20;
                        iM2765 = i78;
                        str5 = str9;
                        z12 = z21;
                        layoutParams6 = layoutParams13;
                        i33 = iM31633 ^ 341320645;
                        c9043 = c9044;
                        i32 = ((iM31633 ^ i31) * (-8749)) ^ 1923520957;
                    }
                    linearLayout6 = linearLayout6;
                    i42 = i42;
                    strM7761 = strM7761;
                    i37 = i37;
                    linearLayout7 = linearLayout7;
                    iM8178 = iM8178;
                    z8 = z8;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case 1222986037:
                case 1970231923:
                    String str10 = strM7761;
                    z8 = z8;
                    layoutParams6 = layoutParams6;
                    i37 = i37;
                    i38 = i38;
                    length = length;
                    jSONArray3 = jSONArray3;
                    i44 = i44;
                    f3 = f3;
                    linearLayout6 = linearLayout6;
                    c9043 = c9043;
                    jSONObject4 = jSONObject4;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    z11 = z11;
                    i39 = i39;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    i5 = iM8178;
                    linearLayout3 = linearLayout7;
                    int i81 = i42;
                    z12 = z12;
                    sArr6 = sArr6;
                    iM2764 = C0619.m2761(C4282.m13650(f67068, 7, 3, i34)) ^ 2097524454;
                    iM2765 = C0619.m2761(C3033.m9847(f67068, 10, 3, i34)) ^ 2097370120;
                    str5 = "";
                    activityC0093 = c20976.f67071;
                    if (str4 != null) {
                        int iM27616 = (i30 - C0619.m2761("ۗ۫")) * 43;
                        i32 = ((iM27616 ^ i31) * (-12485)) ^ 1977996057;
                        z9 = false;
                        i33 = iM27616 ^ 1722363920;
                    } else {
                        int iM27617 = (C0619.m2761("ۖۧ") + i30) * 19;
                        z9 = false;
                        i33 = iM27617 ^ 1052013166;
                        i32 = ((iM27617 ^ i31) * 20043) ^ 144739178;
                    }
                    i42 = i81;
                    strM7761 = str10;
                    linearLayout7 = linearLayout3;
                    iM8178 = i5;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                case 1467500332:
                case 1783539189:
                    String str11 = strM7761;
                    boolean z22 = z8;
                    layoutParams6 = layoutParams6;
                    int i82 = iM2765;
                    String str12 = str5;
                    int i83 = i37;
                    JSONObject jSONObject7 = jSONObject4;
                    length = length;
                    i44 = i44;
                    f3 = f3;
                    LinearLayout linearLayout15 = linearLayout6;
                    z9 = z9;
                    C9042 c9045 = c9043;
                    i38 = i38;
                    jSONArray3 = jSONArray3;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    z11 = z11;
                    i39 = i39;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    int i84 = i43;
                    int i85 = iM8178;
                    LinearLayout linearLayout16 = linearLayout7;
                    int i86 = i42;
                    z12 = z12;
                    sArr6 = sArr6;
                    LinearLayout linearLayout17 = (LinearLayout) C1564.m5518(activityC0093, i82);
                    JSONObject jSONObject8 = c20976.f67070;
                    if (jSONObject8 != null) {
                        int iM27618 = (C0619.m2761("᩷ۡ") ^ i30) * (-21);
                        i32 = ((iM27618 ^ i31) * 15671) ^ 1252575657;
                        i33 = iM27618 ^ (-998948081);
                        jSONObject3 = jSONObject8;
                        jSONObject4 = jSONObject7;
                    } else {
                        int iM31634 = C0773.m3169("ۚۧ") ^ i31;
                        jSONObject3 = jSONObject8;
                        jSONObject4 = jSONObject7;
                        i33 = iM31634 ^ (-289060259);
                        i32 = ((iM31634 ^ i30) * 25797) ^ (-462947439);
                    }
                    iM2765 = i82;
                    linearLayout8 = linearLayout17;
                    str5 = str12;
                    i42 = i86;
                    strM7761 = str11;
                    c9043 = c9045;
                    linearLayout6 = linearLayout15;
                    linearLayout7 = linearLayout16;
                    iM8178 = i85;
                    i37 = i83;
                    i43 = i84;
                    z8 = z22;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
                default:
                    strM7761 = strM7761;
                    z8 = z8;
                    layoutParams = layoutParams6;
                    jSONArray = jSONArray3;
                    i44 = i44;
                    f3 = f3;
                    iM8177 = iM8177;
                    imageView3 = imageView3;
                    i35 = i35;
                    z11 = z11;
                    i39 = i39;
                    z13 = z13;
                    i40 = i40;
                    i41 = i41;
                    i43 = i43;
                    i5 = iM8178;
                    linearLayout3 = linearLayout7;
                    i = i42;
                    z = z12;
                    sArr = sArr6;
                    if (C1343.m4938(linearLayout8) == 0) {
                        iM31610 = C0773.m3169("᩻ܺ") ^ i30;
                        i8 = ((iM31610 ^ i31) * (-18103)) ^ 363225175;
                        i9 = 452921663;
                    } else {
                        iM31610 = (C0773.m3169("ᩳ᩻") + i31) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM31610 ^ i30) * (-9939)) ^ (-801513522);
                        i9 = 1336024778;
                    }
                    int i610 = iM31610 ^ i9;
                    jSONArray3 = jSONArray;
                    i32 = i8;
                    layoutParams6 = layoutParams;
                    sArr6 = sArr;
                    z8 = z8;
                    i33 = i610;
                    z12 = z;
                    strM7761 = strM7761;
                    i42 = i;
                    linearLayout7 = linearLayout3;
                    iM8178 = i5;
                    i43 = i43;
                    i41 = i41;
                    i40 = i40;
                    z13 = z13;
                    i39 = i39;
                    z11 = z11;
                    i35 = i35;
                    imageView3 = imageView3;
                    iM8177 = iM8177;
                    f3 = f3;
                    i44 = i44;
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        int i = 834622754;
        int i2 = C11235.f35427;
        int i3 = C2966.f9654;
        int iM2761 = C0619.m2761("ܶ᩵") ^ i3;
        int i4 = ((iM2761 ^ i2) * 27219) ^ (-1377178475);
        int i5 = -660750217;
        while (true) {
            i = ((((i ^ i2) * 21353) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1916595523:
                case 1118739808:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19599) ^ (-2039089889);
                        i5 = -1205202942;
                    } else {
                        iM2761 = C0773.m3169("ᩴܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28101)) ^ (-1926841661);
                        i5 = 1893655412;
                    }
                    break;
                case -1824246790:
                case -422797030:
                    if (C1343.f4799 != 0) {
                        iM2761 = (i3 - C0773.m3169("ܽۘ")) * 51;
                        i4 = ((iM2761 ^ i2) * (-12967)) ^ 1942647561;
                        i5 = -54332582;
                    } else {
                        iM2761 = C0619.m2761("ܰܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8475) ^ (-16731392);
                        i5 = 81822085;
                    }
                    break;
                case -1778232111:
                case 668389692:
                    C20932.m47848();
                    break;
                case -1606255118:
                case 1754471917:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19599) ^ (-2039089889);
                        i5 = -1205202942;
                    } else {
                        iM2761 = C0619.m2761("ۤۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25353)) ^ (-410256936);
                        i5 = 841759032;
                    }
                    break;
                case -1597057511:
                case -809420849:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19599) ^ (-2039089889);
                        i5 = -1205202942;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩹ܿ")) * (-7);
                        i4 = ((iM2761 ^ i2) * 10981) ^ 357802886;
                        i5 = -603749369;
                    }
                    break;
                case -1310415294:
                case 1757985063:
                    C2878.m9491();
                    iM2761 = C0619.m2761("ܰܰ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 8475) ^ (-16731392);
                    i5 = 81822085;
                    break;
                case -1152353899:
                case 624234148:
                    if (C4282.f15546 > 0) {
                        iM2761 = (C0773.m3169("᩻ܳ") + i3) * 15;
                        i4 = ((iM2761 ^ i2) * 25887) ^ 1386127588;
                        i5 = 347428742;
                    } else {
                        iM2761 = C0619.m2761("ۧۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23143)) ^ (-440498433);
                        i5 = 27712590;
                    }
                    break;
                case -1009377240:
                case 565726291:
                    if (C2310.m7813() <= 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23143)) ^ (-440498433);
                        i5 = 27712590;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽۘ")) * 51;
                        i4 = ((iM2761 ^ i2) * (-12967)) ^ 1942647561;
                        i5 = -54332582;
                    }
                    break;
                case -762879414:
                case 1283083723:
                    if (m47953()) {
                        iM2761 = C0773.m3169("ܽ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28889)) ^ 296284127;
                        i5 = -1176174004;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩹ܰ")) * (-119);
                        i4 = ((iM2761 ^ i2) * (-21649)) ^ 1099821950;
                        i5 = -1440205146;
                    }
                    break;
                case -714603808:
                case 935690506:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ܽۘ")) * 51;
                        i4 = ((iM2761 ^ i2) * (-12967)) ^ 1942647561;
                        i5 = -54332582;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩸᩸")) * (-117);
                        i4 = ((iM2761 ^ i2) * (-24415)) ^ 881435456;
                        i5 = -929421889;
                    }
                    break;
                case -499127445:
                case 1549645852:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23143)) ^ (-440498433);
                        i5 = 27712590;
                    } else {
                        iM2761 = (C0619.m2761("᩹ܳ") ^ i3) * (-111);
                        i4 = ((iM2761 ^ i2) * (-7267)) ^ (-858098068);
                        i5 = -167933276;
                    }
                    break;
                case -110650018:
                case 261931723:
                    if (C3998.m12920()) {
                        iM2761 = C0773.m3169("ᩴ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10827) ^ 54119189;
                        i5 = -1083683014;
                    } else {
                        iM2761 = C0619.m2761("ۧۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23143)) ^ (-440498433);
                        i5 = 27712590;
                    }
                    break;
                case -67691919:
                case 1748745970:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (i3 - C0773.m3169("ܽۘ")) * 51;
                        i4 = ((iM2761 ^ i2) * (-12967)) ^ 1942647561;
                        i5 = -54332582;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩵ۚ")) * (-103);
                        i4 = ((iM2761 ^ i3) * 19041) ^ (-1524882786);
                        i5 = 1025645271;
                    }
                    break;
                case 63399164:
                case 1569969642:
                    break;
                case 361781645:
                case 746892360:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19599) ^ (-2039089889);
                        i5 = -1205202942;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۚ᩹")) * 89;
                        i4 = ((iM2761 ^ i3) * (-5451)) ^ (-691841319);
                        i5 = -1340952225;
                    }
                    break;
                case 520494694:
                case 1166212171:
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("᩻ܳ") + i3) * 15;
                        i4 = ((iM2761 ^ i2) * 25887) ^ 1386127588;
                        i5 = 347428742;
                    } else {
                        iM2761 = (C0619.m2761("ۗ᩵") ^ i3) * (-71);
                        i4 = ((iM2761 ^ i2) * (-18845)) ^ (-1012422530);
                        i5 = -510014424;
                    }
                    break;
                case 578073428:
                case 1558921663:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19599) ^ (-2039089889);
                        i5 = -1205202942;
                    } else {
                        iM2761 = C0773.m3169("۟ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30605)) ^ 528641558;
                        i5 = -560421563;
                    }
                    break;
                default:
                    AbstractC0641.m2814(this.f67071, exc, null);
                    iM2761 = (i3 - C0773.m3169("᩹ܰ")) * (-119);
                    i4 = ((iM2761 ^ i2) * (-21649)) ^ 1099821950;
                    i5 = -1440205146;
                    break;
            }
            return;
        }
    }
}
