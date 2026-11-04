package l;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܽ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17795 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܶ᩸ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f58407 = {128, -8435, -8448, -8420, -8444, -8435, -28298, 19189, -31748, -22698, -24529, 18485, -8372, -8372, -19679, -28267, -21355, -19490, -19730, -32387, -30654, -24217, -16977, 24275, -18849, 18764, 16896, 23085, 17460, -30082, 20887, -22473, -8392, -8418, -8435, -8446, -8417, -8448, -8435, -8424, -8443, -8445, -8446, -8407, -8446, -8437, -8443, -8446, -8439, -8392, -8439, -8428, -8424, -8407, -8440, -8443, -8424, -8445, -8418, -8406, -8423, -8446, -8433, -8424, -8443, -8445, -8446, -8392, -8439, -8428, -8424, -8407, -8440, -8443, -8424, -8445, -8418, -8392, -8445, -8445, -8448, -8415, -8439, -8446, -8423, -8392, -8439, -8428, -8424, -8407, -8440, -8443, -8424, -8445, -8418, -8406, -8448, -8445, -8435, -8424, -8443, -8446, -8437, -8415, -8439, -8446, -8423, -31832, -23372, 18105, 18330, -31902, -18431, 20083, 20801, -18911, -20217, -29725, -19751, 6119, -14267, -14310, -14330, -14305, -14323, -14333, -14332, -14267, -14322, -14321, -14308, -14321, -14330, -14331, -14310, -14321, -14312, -14310, -14330, -14305, -14323, -14333, -14332, -14301, -14322, -14329, -14333, -14332, -14293, -14332, -14322, -14312, -14331, -14333, -14322, -14329, -14333, -14332, -14302, -14331, -14311, -14306, -14311, -14322, -14335, -14332, -14325, -14329, -14321, -14322, -14321, -14311, -14327, -14312, -14333, -14310, -14306, -14333, -14331, -14332, -14305, -14310, -14322, -14325, -14306, -14321, -14295, -14331, -14332, -14306, -14321, -14332, -14306, -14305, -14310, -14322, -14325, -14306, -14321, -14274, -14333, -14329, -14321, -14308, -14321, -14312, -14311, -14333, -14331, -14332, -14295, -14331, -14322, -14321, -14308, -14321, -14312, -14311, -14333, -14331, -14332, -14300, -14325, -14329, -14321, -14333, -14327, -14331, -14332, -14311, -14333, -14320, -14321, -14333, -14332, -14306, -14321, -14312, -14324, -14325, -14327, -14321, -14311};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20779 f58408;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f58409;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC20779 activityC20779 = null;
        int i = 1512545785;
        int i2 = RunnableC0334.f1808;
        int i3 = C11235.f35427;
        int iM3169 = C0773.m3169("ۚۚ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-19131)) ^ 588593432;
        int i5 = 761772338;
        while (true) {
            i = ((((i ^ i2) * 17259) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2116305170:
                case 665188018:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7715) ^ (-2127947933);
                        i5 = 627169945;
                    } else {
                        iM3169 = C0773.m3169("ܰۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26107)) ^ (-816794246);
                        i5 = -1781528687;
                    }
                    break;
                case -2029828861:
                case -27791990:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("ۤ۬") + i2) * 55;
                        i4 = ((iM3169 ^ i3) * (-11731)) ^ (-1322887486);
                        i5 = 839813176;
                    } else {
                        iM3169 = C0773.m3169("᩹᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17683) ^ 125937352;
                        i5 = 1007646203;
                    }
                    break;
                case -1841370935:
                case 1270732870:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7715) ^ (-2127947933);
                        i5 = 627169945;
                    } else {
                        iM3169 = (C0619.m2761("ۖۜ") ^ i2) * (-29);
                        i4 = ((iM3169 ^ i3) * 21173) ^ (-1142949262);
                        i5 = -809846194;
                    }
                    break;
                case -1706005888:
                case 1131944189:
                    C13473.m33140(activityC20779.f66573, 0);
                    break;
                case -1603330827:
                case 1240531327:
                    if (C3099.m10095()) {
                        iM3169 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7715) ^ (-2127947933);
                        i5 = 627169945;
                    } else {
                        iM3169 = (C0619.m2761("ۜۙ") + i3) * 71;
                        i4 = ((iM3169 ^ i2) * 3823) ^ (-801488953);
                        i5 = -146488399;
                    }
                    break;
                case -1360131662:
                case 1281254024:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ۤ۬") + i2) * 55;
                        i4 = ((iM3169 ^ i3) * (-11731)) ^ (-1322887486);
                        i5 = 839813176;
                    } else {
                        iM3169 = C0773.m3169("᩹ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16697) ^ (-958278297);
                        i5 = 303641589;
                    }
                    break;
                case -1275394791:
                case 23812847:
                    AbstractC0641.m2813();
                    break;
                case -1216137827:
                case -10085825:
                    C2287.m7745();
                    C13473.m33144();
                    iM3169 = C0619.m2761("ۚ֨") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-8175)) ^ (-928272621);
                    i5 = 886341166;
                    break;
                case -1100900471:
                case 267943690:
                    C3077.m10041();
                    if (C3448.f11240 < 0) {
                        iM3169 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7715) ^ (-2127947933);
                        i5 = 627169945;
                    } else {
                        iM3169 = (C0773.m3169("۠ۗ") + i3) * 115;
                        i4 = ((iM3169 ^ i2) * (-7967)) ^ (-1744690230);
                        i5 = 818971710;
                    }
                    break;
                case -1081781978:
                case 1257596985:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("۠ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24027) ^ 785940794;
                        i5 = 278774094;
                    } else {
                        iM3169 = C0619.m2761("֫ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6119)) ^ (-2094561339);
                        i5 = -1941175427;
                    }
                    break;
                case -907518852:
                case 652366005:
                    activityC20779 = this.f58408;
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("۠ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24027) ^ 785940794;
                        i5 = 278774094;
                    } else {
                        iM3169 = C0773.m3169("֡ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10661)) ^ (-240364949);
                        i5 = -778396144;
                    }
                    break;
                case -886089073:
                case 291616763:
                    C0950.m3785();
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7715) ^ (-2127947933);
                        i5 = 627169945;
                    } else {
                        iM3169 = C0619.m2761("ۚ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8175)) ^ (-928272621);
                        i5 = 886341166;
                    }
                    break;
                case -41477874:
                case 1311096687:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0773.m3169("۠ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24027) ^ 785940794;
                        i5 = 278774094;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ᩳܿ")) * 3;
                        i4 = ((iM3169 ^ i2) * 25467) ^ 1778899067;
                        i5 = -825949317;
                    }
                    break;
                case 151401567:
                case 514754267:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("۠ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24027) ^ 785940794;
                        i5 = 278774094;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩷۬")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * 20059) ^ 953579059;
                        i5 = -1050613331;
                    }
                    break;
                case 1985604355:
                case 2113576341:
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0773.m3169("۠ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24027) ^ 785940794;
                        i5 = 278774094;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۨ") + i2) * 41;
                        i4 = ((iM3169 ^ i3) * (-26161)) ^ (-1482548493);
                        i5 = 1645455544;
                    }
                    break;
                default:
                    C3492.m11488();
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("ۤ۬") + i2) * 55;
                        i4 = ((iM3169 ^ i3) * (-11731)) ^ (-1322887486);
                        i5 = 839813176;
                    } else {
                        iM3169 = C0619.m2761("۠ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7715) ^ (-2127947933);
                        i5 = 627169945;
                    }
                    break;
            }
            return;
        }
    }

    public C17795(ActivityC20779 activityC20779) {
        this.f58408 = activityC20779;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC20779 activityC20779 = null;
        TextView textView = null;
        int i = 0;
        View view = null;
        int i2 = -1167060822;
        int i3 = AbstractC0641.f2496;
        int i4 = C3099.f10023;
        int iM2761 = C0619.m2761("ۧ۬") ^ i4;
        int i5 = ((iM2761 ^ i3) * 12453) ^ 461199378;
        int i6 = -855660417;
        while (true) {
            i2 = ((((i2 ^ i3) * 6881) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1982263627:
                case -1132477931:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ۙۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21361)) ^ (-1563025722);
                        i6 = 760955663;
                    } else {
                        iM2761 = C0619.m2761("ۗۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-31627)) ^ (-1442360848);
                        i6 = 921789600;
                    }
                    break;
                case -1800565220:
                case -1393476997:
                    activityC20779 = this.f58408;
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("ۙۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21361)) ^ (-1563025722);
                        i6 = 760955663;
                    } else {
                        iM2761 = C0619.m2761("ᩳ֨") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-30639)) ^ 1541509627;
                        i6 = -39531460;
                    }
                    break;
                case -1733868724:
                case -294106403:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("ۙۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21361)) ^ (-1563025722);
                        i6 = 760955663;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩹") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-3255)) ^ (-1860583213);
                        i6 = 857235360;
                    }
                    break;
                case -1656171894:
                case 718107682:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("ܳۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-2605)) ^ 1563443267;
                        i6 = 746299171;
                    } else {
                        iM2761 = C0773.m3169("᩶᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-30937)) ^ (-387188671);
                        i6 = -1238761825;
                    }
                    break;
                case -1510666449:
                case 1832033253:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ܳۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-2605)) ^ 1563443267;
                        i6 = 746299171;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܺ۟")) * (-67);
                        i5 = ((iM2761 ^ i4) * 19013) ^ (-1743915110);
                        i6 = -422647391;
                    }
                    break;
                case -1498485563:
                case 1230091942:
                    C3077.m10041();
                    C3734.m12152();
                    iM2761 = C0619.m2761("ۗۗ") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-31627)) ^ (-1442360848);
                    i6 = 921789600;
                    break;
                case -1483862572:
                case 398928097:
                    C0862.m3503();
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("ܽܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17305)) ^ (-1958816363);
                        i6 = 1601513709;
                    } else {
                        iM2761 = C0619.m2761("ۗۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-31627)) ^ (-1442360848);
                        i6 = 921789600;
                    }
                    break;
                case -1449518097:
                case -288135391:
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0773.m3169("ܽܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17305)) ^ (-1958816363);
                        i6 = 1601513709;
                    } else {
                        iM2761 = (C0619.m2761("ܿ۟") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2761 ^ i4) * 32403) ^ 1251567430;
                        i6 = 506001820;
                    }
                    break;
                case -1196009070:
                case 1856193734:
                    C1826.m6301();
                    break;
                case -599716839:
                case 1800036133:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("ܺ۫") ^ i3;
                        i5 = ((iM2761 ^ i4) * 4757) ^ 623421641;
                        i6 = 51150262;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܰ֫")) * (-81);
                        i5 = ((iM2761 ^ i4) * (-7313)) ^ (-1312344449);
                        i6 = -60768648;
                    }
                    break;
                case -274527906:
                case -7064812:
                    textView = activityC20779.f66573;
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("ۧۜ") + i4) * (-105);
                        i5 = ((iM2761 ^ i3) * 4291) ^ 1118585134;
                        i6 = -2019182244;
                    } else {
                        iM2761 = C0773.m3169("ܽܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17305)) ^ (-1958816363);
                        i6 = 1601513709;
                    }
                    break;
                case -131784318:
                case 1111036657:
                    i = 8;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ܺ۫") ^ i3;
                        i5 = ((iM2761 ^ i4) * 4757) ^ 623421641;
                        i6 = 51150262;
                    } else {
                        iM2761 = (C0773.m3169("ۚܽ") + i4) * (-45);
                        i5 = ((iM2761 ^ i3) * 9943) ^ (-2144124348);
                        i6 = 159652897;
                    }
                    break;
                case 111049329:
                case 1892108010:
                    C13473.m33140(textView, i);
                    view = activityC20779.f66575;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۙۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21361)) ^ (-1563025722);
                        i6 = 760955663;
                    } else {
                        iM2761 = C0619.m2761("ܿ֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-30757)) ^ (-1506454407);
                        i6 = -1713518366;
                    }
                    break;
                case 120010230:
                case 942920156:
                    AbstractC0116.m1243();
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("ܳۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-2605)) ^ 1563443267;
                        i6 = 746299171;
                    } else {
                        iM2761 = C0619.m2761("ۗۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-31627)) ^ (-1442360848);
                        i6 = 921789600;
                    }
                    break;
                case 1285080632:
                case 1954371321:
                    if (C2310.m7813() <= 0) {
                        iM2761 = C0619.m2761("ܺ۫") ^ i3;
                        i5 = ((iM2761 ^ i4) * 4757) ^ 623421641;
                        i6 = 51150262;
                    } else {
                        iM2761 = (C0619.m2761("ܶܽ") ^ i3) * q.h;
                        i5 = ((iM2761 ^ i4) * 8363) ^ (-221789083);
                        i6 = 1467060843;
                    }
                    break;
                default:
                    C13473.m33140(view, 0);
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        final C17795 c17795;
        JSONObject jSONObject;
        int i;
        int iM2761;
        String str;
        TextView textView;
        TextView textView2;
        ViewGroup viewGroup;
        C15688 c15688;
        StringBuilder sb;
        String str2;
        short[] sArr;
        String str3;
        short[] sArr2;
        int iM3169;
        int i2;
        int i3;
        JSONObject jSONObject2;
        int iM31610;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM31611;
        JSONObject jSONObject3;
        C15688 c15689;
        C17795 c17796;
        JSONObject jSONObject4;
        int i8;
        String str4;
        TextView textView3;
        TextView textView4;
        int i9;
        StringBuilder sb2;
        String str5;
        short[] sArr3;
        int i10;
        int i11;
        int i12;
        C17795 c17797;
        JSONObject jSONObject5;
        int i13;
        TextView textView5;
        TextView textView6;
        String str6;
        String str7;
        TextView textView7;
        StringBuilder sb3;
        JSONObject jSONObject6;
        TextView textView8;
        StringBuilder sb4;
        TextView textView9;
        int i14;
        short[] sArr4;
        String strM28207;
        int iM2762;
        int i15;
        int i16;
        JSONObject jSONObject7;
        int iM31612;
        int i17;
        int i18;
        int iM2763;
        int i19;
        int iM31613;
        int i20;
        int i21;
        int i22;
        C17795 c17798 = this;
        int i23 = 1878228160;
        int i24 = C4282.f15546;
        int i25 = C2288.f7433;
        int iM2764 = (i24 - C0619.m2761("ۚۨ")) * 67;
        int i26 = ((iM2764 ^ i25) * 9973) ^ 682947100;
        int i27 = iM2764 ^ (-356672294);
        TextView textView10 = null;
        String strM28216 = null;
        StringBuilder sb5 = null;
        String str8 = null;
        JSONObject jSONObjectM28209 = null;
        TextView textView11 = null;
        StringBuilder sb6 = null;
        Iterator itM13647 = null;
        String str9 = null;
        short[] sArr5 = null;
        char c = 0;
        int i28 = 0;
        int iM7759 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        byte b = 0;
        byte b2 = 0;
        int i33 = 0;
        int iM31614 = 0;
        int i34 = 0;
        int iM2765 = 0;
        int i35 = 0;
        ViewGroup viewGroup2 = null;
        C15688 c156810 = null;
        TextView textView12 = null;
        Object[] objArr = null;
        ActivityC20779 activityC20779 = null;
        int i36 = 0;
        int i37 = 0;
        TextView textView13 = null;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i25) * (-3679)) >> 31));
            switch (i23) {
                case -2082929469:
                case 1602916773:
                    textView13 = textView13;
                    objArr = objArr;
                    b2 = 0;
                    iM2763 = C0773.m3169("ۗ۫") ^ i25;
                    i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                    i19 = 574646751;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -2021574204:
                case -1385195075:
                    i33 = i37 + iM7759;
                    textView13 = textView13;
                    objArr = objArr;
                    iM2763 = (C0619.m2761("᩷ۧ") + i24) * (-29);
                    i26 = ((iM2763 ^ i25) * (-15559)) ^ (-1637185449);
                    i19 = -406162370;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1987572360:
                case -857251191:
                    if (C3998.f13671 == 0) {
                        c17795 = c17798;
                        jSONObject = jSONObjectM28209;
                        i = i36;
                        c15689 = c156810;
                        textView = textView12;
                        textView2 = textView11;
                        str = strM28216;
                        short[] sArr6 = sArr5;
                        sb = sb5;
                        str2 = str8;
                        sArr = sArr6;
                        int iM31615 = (C0773.m3169("᩹ܶ") + i25) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        int i38 = ((iM31615 ^ i24) * (-14023)) ^ 1322521696;
                        c156810 = c15689;
                        textView11 = textView2;
                        jSONObjectM28209 = jSONObject;
                        i27 = iM31615 ^ (-1526565805);
                        c17798 = c17795;
                        i26 = i38;
                        textView12 = textView;
                        i36 = i;
                        strM28216 = str;
                        i32 = i32;
                        short[] sArr7 = sArr;
                        str8 = str2;
                        sb5 = sb;
                        sArr5 = sArr7;
                    } else {
                        int iM2766 = (C0619.m2761("ۡۡ") + i24) * (-9);
                        i26 = ((iM2766 ^ i25) * 21861) ^ 293969823;
                        i27 = iM2766 ^ 1788352474;
                        c17798 = this;
                        sb6 = null;
                    }
                    break;
                case -1978568387:
                case -361674734:
                    textView13 = textView13;
                    objArr = objArr;
                    if (i31 == 0) {
                        iM2763 = C0619.m2761("ۖ۫") ^ i24;
                        i26 = ((iM2763 ^ i25) * (-16905)) ^ 340494737;
                        i19 = 1122489833;
                    } else {
                        iM2763 = (C0619.m2761("ۡ֡") ^ i25) * (-61);
                        i26 = ((iM2763 ^ i24) * 22455) ^ (-1856005514);
                        i19 = 1487831702;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1975545622:
                case 1313588748:
                    textView13 = activityC20779.f66577;
                    objArr = new Object[i36];
                    objArr[i28] = C1542.m5472(activityC20779).m28225();
                    iM2765 = C0619.m2761(C1564.m5510(f58407, 20, 3, i29));
                    if (C2834.m9344() < 0) {
                        iM31610 = C0773.m3169("ۚᩳ") ^ i25;
                        i26 = ((iM31610 ^ i24) * 26929) ^ (-770949568);
                        i4 = 1018068085;
                        i27 = iM31610 ^ i4;
                        c17798 = this;
                    } else {
                        c17798 = this;
                        jSONObjectM28209 = jSONObjectM28209;
                        textView12 = textView12;
                        textView11 = textView11;
                        String str10 = strM28216;
                        i32 = i32;
                        str3 = str10;
                        short[] sArr8 = sArr5;
                        sb5 = sb5;
                        str8 = str8;
                        sArr2 = sArr8;
                        int iM31616 = C0773.m3169("ۨ֨") ^ i25;
                        i2 = ((iM31616 ^ i24) * (-15813)) ^ (-1884982309);
                        i5 = iM31616 ^ (-1990842786);
                        textView11 = textView11;
                        textView12 = textView12;
                        jSONObject2 = jSONObjectM28209;
                        i27 = i5;
                        c17798 = c17798;
                        i26 = i2;
                        jSONObjectM28209 = jSONObject2;
                        int i39 = i32;
                        strM28216 = str3;
                        i32 = i39;
                        short[] sArr9 = sArr2;
                        str8 = str8;
                        sb5 = sb5;
                        sArr5 = sArr9;
                    }
                    break;
                case -1964508578:
                case -84921267:
                    textView13 = textView13;
                    objArr = objArr;
                    if (C2419.m8175(str9, C23916.m53420(f58407, 67, 18, i29))) {
                        iM2763 = (i24 - C0773.m3169("ۨ᩻")) * (-95);
                        i26 = ((iM2763 ^ i25) * 6295) ^ (-1266286014);
                        i19 = -1738101324;
                    } else {
                        b2 = b;
                        iM2763 = C0773.m3169("ۗ۫") ^ i25;
                        i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                        i19 = 574646751;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1909538450:
                case 1222522942:
                    textView13 = textView13;
                    objArr = objArr;
                    b2 = 1;
                    iM2763 = C0773.m3169("ۗ۫") ^ i25;
                    i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                    i19 = 574646751;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1885468352:
                case -352003389:
                    C1519.m5403();
                    if (!RunnableC1848.f6235) {
                        int iM2767 = (C0619.m2761("ۡۡ") + i24) * (-9);
                        i26 = ((iM2767 ^ i25) * 21861) ^ 293969823;
                        i27 = iM2767 ^ 1788352474;
                        c17798 = this;
                        sb6 = null;
                    } else {
                        iM31613 = C0773.m3169("ۖ᩶") ^ i24;
                        i20 = ((iM31613 ^ i25) * 21371) ^ (-1295898623);
                        i21 = -1767922529;
                        i27 = iM31613 ^ i21;
                        i26 = i20;
                    }
                    break;
                case -1822021416:
                case 104038652:
                    c17795 = c17798;
                    jSONObject = jSONObjectM28209;
                    i = i36;
                    textView = textView12;
                    textView2 = textView11;
                    short[] sArr10 = sArr5;
                    sb = sb5;
                    str2 = str8;
                    sArr = sArr10;
                    float[] fArr = new float[i30];
                    // fill-array-data instruction
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    str = strM28216;
                    c15689 = c156810;
                    ObjectAnimator objectAnimatorM12917 = C3998.m12917(c15689, C1343.m4939(f58407, 1, 5, i29), fArr);
                    objectAnimatorM12917.setDuration(200L);
                    if (RunnableC0334.m2063()) {
                        int iM31617 = (C0773.m3169("᩹ܶ") + i25) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        int i310 = ((iM31617 ^ i24) * (-14023)) ^ 1322521696;
                        c156810 = c15689;
                        textView11 = textView2;
                        jSONObjectM28209 = jSONObject;
                        i27 = iM31617 ^ (-1526565805);
                        c17798 = c17795;
                        i26 = i310;
                        textView12 = textView;
                        i36 = i;
                        strM28216 = str;
                        i32 = i32;
                    } else {
                        viewGroup = viewGroup2;
                        objectAnimatorM12917.addListener(new C16303(c15689, viewGroup));
                        objectAnimatorM12917.start();
                        c15688 = c15689;
                        iM2761 = C0619.m2761(C2288.m7761(f58407, 6, 3, i29)) ^ 2117970897;
                        if (C2702.f8586 <= 0) {
                            iM31611 = C0773.m3169("ܰᩴ") ^ i24;
                            i7 = ((iM31611 ^ i25) * (-23247)) ^ 1833776813;
                            i6 = -2090791270;
                        } else {
                            iM31611 = C0619.m2761("ܽܿ") ^ i24;
                            i7 = ((iM31611 ^ i25) * (-30609)) ^ (-819180279);
                            i6 = -839360847;
                        }
                        int i40 = iM31611 ^ i6;
                        c156810 = c15688;
                        strM28216 = str;
                        i32 = iM2761;
                        c17798 = c17795;
                        i26 = i7;
                        viewGroup2 = viewGroup;
                        textView11 = textView2;
                        i36 = i;
                        textView12 = textView;
                        jSONObject3 = jSONObject;
                        i27 = i40;
                        jSONObjectM28209 = jSONObject3;
                    }
                    short[] sArr11 = sArr;
                    str8 = str2;
                    sb5 = sb;
                    sArr5 = sArr11;
                    break;
                case -1754409211:
                case 1854933951:
                    textView13 = textView13;
                    objArr = objArr;
                    c = '\n';
                    if (C1826.m6317(itM13647)) {
                        iM2763 = (i24 - C0619.m2761("ۛᩳ")) * (-19);
                        i26 = ((iM2763 ^ i25) * 11119) ^ (-1636726733);
                        i19 = 453145125;
                    } else {
                        iM2763 = C0619.m2761("᩶ܰ") ^ i25;
                        i26 = ((iM2763 ^ i24) * 15129) ^ (-1188148019);
                        i19 = -398430950;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1741675328:
                case 464627827:
                    C2485.m8358(C1564.m5518(activityC20779, C0773.m3169(C1080.m4056(f58407, 14, 3, i29)) ^ 2125109144), 8);
                    iM31612 = C0619.m2761("ܺ᩵") ^ i25;
                    i17 = ((iM31612 ^ i24) * 16533) ^ 1736356169;
                    i18 = -395489844;
                    int i41 = iM31612 ^ i18;
                    i36 = i36;
                    jSONObject7 = jSONObjectM28209;
                    i27 = i41;
                    c17798 = c17798;
                    i26 = i17;
                    jSONObjectM28209 = jSONObject7;
                    break;
                case -1657836301:
                case 1558773756:
                    textView13 = textView13;
                    objArr = objArr;
                    str9 = (String) C0950.m3796(itM13647);
                    iM7759 = C2288.m7759(jSONObjectM28209, str9);
                    if (iM7759 != 0) {
                        iM2763 = C0619.m2761("ᩳ۟") ^ i25;
                        i26 = ((iM2763 ^ i24) * 19513) ^ (-1730793093);
                        i19 = -1975639147;
                    } else {
                        iM2763 = C0619.m2761("ۤ֫") ^ i24;
                        i26 = ((iM2763 ^ i25) * (-26067)) ^ (-1370680551);
                        i19 = 1244884973;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1613060672:
                case -1209801395:
                    c17798 = c17798;
                    jSONObjectM28209 = jSONObjectM28209;
                    textView12 = textView12;
                    textView11 = textView11;
                    String str11 = strM28216;
                    i32 = i32;
                    str3 = str11;
                    short[] sArr12 = sArr5;
                    sb5 = sb5;
                    str8 = str8;
                    sArr2 = sArr12;
                    ViewGroup viewGroup3 = (ViewGroup) C2288.m7763(activityC20779).getDecorView();
                    i36 = 1;
                    viewGroup3.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = viewGroup3.getDrawingCache();
                    C15688 c156811 = new C15688(activityC20779);
                    c156811.setImageBitmap(drawingCache);
                    C1564.m5507(viewGroup3, c156811);
                    i30 = 2;
                    if (C3492.f12043 <= 0) {
                        viewGroup2 = viewGroup3;
                        c156810 = c156811;
                        int iM31618 = C0773.m3169("ۨ֨") ^ i25;
                        i2 = ((iM31618 ^ i24) * (-15813)) ^ (-1884982309);
                        i5 = iM31618 ^ (-1990842786);
                        textView11 = textView11;
                        textView12 = textView12;
                        jSONObject2 = jSONObjectM28209;
                        i27 = i5;
                        c17798 = c17798;
                        i26 = i2;
                    } else {
                        int iM31619 = C0773.m3169("ۗۙ") ^ i25;
                        viewGroup2 = viewGroup3;
                        c17798 = c17798;
                        i26 = ((iM31619 ^ i24) * (-9281)) ^ (-1710521614);
                        c156810 = c156811;
                        textView11 = textView11;
                        i36 = 1;
                        textView12 = textView12;
                        jSONObject2 = jSONObjectM28209;
                        i27 = iM31619 ^ (-248195737);
                    }
                    jSONObjectM28209 = jSONObject2;
                    int i311 = i32;
                    strM28216 = str3;
                    i32 = i311;
                    short[] sArr13 = sArr2;
                    str8 = str8;
                    sb5 = sb5;
                    sArr5 = sArr13;
                    break;
                case -1576576420:
                case 240749721:
                    C1080.m4046(sb6, c);
                    Resources resourcesM49055 = C21576.m49055();
                    Object[] objArr2 = new Object[i36];
                    objArr2[i28] = C0619.m2764(iM7759);
                    C3779.m12258(sb6, resourcesM49055.getQuantityString(C0773.m3169(C1343.m4939(f58407, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i29)) ^ 2099471888, iM7759, objArr2));
                    i33 = i37;
                    iM2763 = (C0619.m2761("᩷ۧ") + i24) * (-29);
                    i26 = ((iM2763 ^ i25) * (-15559)) ^ (-1637185449);
                    i19 = -406162370;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1564032302:
                case 670389612:
                    if (!C3690.m11987()) {
                        c17795 = c17798;
                        jSONObject = jSONObjectM28209;
                        i = i36;
                        iM2761 = i32;
                        str = strM28216;
                        textView = textView12;
                        textView2 = textView11;
                        viewGroup = viewGroup2;
                        c15688 = c156810;
                        short[] sArr14 = sArr5;
                        sb = sb5;
                        str2 = str8;
                        sArr = sArr14;
                        iM31611 = C0773.m3169("ܰᩴ") ^ i24;
                        i7 = ((iM31611 ^ i25) * (-23247)) ^ 1833776813;
                        i6 = -2090791270;
                        int i42 = iM31611 ^ i6;
                        c156810 = c15688;
                        strM28216 = str;
                        i32 = iM2761;
                        c17798 = c17795;
                        i26 = i7;
                        viewGroup2 = viewGroup;
                        textView11 = textView2;
                        i36 = i;
                        textView12 = textView;
                        jSONObject3 = jSONObject;
                        i27 = i42;
                        jSONObjectM28209 = jSONObject3;
                        short[] sArr15 = sArr;
                        str8 = str2;
                        sb5 = sb;
                        sArr5 = sArr15;
                    } else {
                        c17798 = c17798;
                        jSONObjectM28209 = jSONObjectM28209;
                        textView12 = textView12;
                        textView11 = textView11;
                        String str12 = strM28216;
                        i32 = i32;
                        str3 = str12;
                        short[] sArr16 = sArr5;
                        sb5 = sb5;
                        str8 = str8;
                        sArr2 = sArr16;
                        int iM316110 = C0773.m3169("ۨ֨") ^ i25;
                        i2 = ((iM316110 ^ i24) * (-15813)) ^ (-1884982309);
                        i5 = iM316110 ^ (-1990842786);
                        textView11 = textView11;
                        textView12 = textView12;
                        jSONObject2 = jSONObjectM28209;
                        i27 = i5;
                        c17798 = c17798;
                        i26 = i2;
                        jSONObjectM28209 = jSONObject2;
                        int i312 = i32;
                        strM28216 = str3;
                        i32 = i312;
                        short[] sArr17 = sArr2;
                        str8 = str8;
                        sb5 = sb5;
                        sArr5 = sArr17;
                    }
                    break;
                case -1563692082:
                case 280249356:
                    ActivityC20779.m47537(activityC20779.f66568, activityC20779.f66566, activityC20779.f66572);
                    c17798 = this;
                    textView12 = textView12;
                    jSONObjectM28209 = jSONObjectM28209;
                    i36 = i36;
                    textView11 = textView11;
                    viewGroup2 = viewGroup2;
                    c156810 = c156810;
                    String str13 = strM28216;
                    i32 = i32;
                    str3 = str13;
                    short[] sArr18 = sArr5;
                    sb5 = sb5;
                    str8 = str8;
                    sArr2 = sArr18;
                    iM3169 = C0773.m3169("֡۬") ^ i25;
                    i2 = ((iM3169 ^ i24) * 22575) ^ (-973991456);
                    i3 = -709789829;
                    i5 = iM3169 ^ i3;
                    c156810 = c156810;
                    i36 = i36;
                    viewGroup2 = viewGroup2;
                    textView11 = textView11;
                    textView12 = textView12;
                    jSONObject2 = jSONObjectM28209;
                    i27 = i5;
                    c17798 = c17798;
                    i26 = i2;
                    jSONObjectM28209 = jSONObject2;
                    int i313 = i32;
                    strM28216 = str3;
                    i32 = i313;
                    short[] sArr19 = sArr2;
                    str8 = str8;
                    sb5 = sb5;
                    sArr5 = sArr19;
                    break;
                case -1526968293:
                case -395362812:
                    textView13 = textView13;
                    objArr = objArr;
                    C17202.m40369(str9);
                    b = -1;
                    switch (C0619.m2761(str9)) {
                        case -1786998733:
                            iM2763 = C0619.m2761("۟ܺ") ^ i24;
                            i26 = ((iM2763 ^ i25) * 8313) ^ 1407229580;
                            i19 = 192150751;
                            break;
                        case -1164052718:
                            iM2763 = (i24 - C0619.m2761("᩵ۖ")) * (-125);
                            i26 = ((iM2763 ^ i25) * 25107) ^ (-1452528348);
                            i19 = -285790706;
                            break;
                        case 766175825:
                            iM2763 = C0773.m3169("ܳۧ") ^ i25;
                            i26 = ((iM2763 ^ i24) * (-3193)) ^ 1442396311;
                            i19 = -1734150908;
                            break;
                        case 1267430591:
                            iM2763 = C0773.m3169("֡ۢ") ^ i25;
                            i26 = ((iM2763 ^ i24) * (-20415)) ^ 311683033;
                            i19 = 945432332;
                            break;
                        default:
                            b2 = -1;
                            iM2763 = C0773.m3169("ۗ۫") ^ i25;
                            i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                            i19 = 574646751;
                            break;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1481784887:
                case -628240206:
                    str3 = strM28216;
                    sArr2 = sArr5;
                    i29 = 57196;
                    iM3169 = (C0773.m3169("ۜ۬") ^ i24) * 63;
                    i2 = ((iM3169 ^ i25) * 6849) ^ (-497807023);
                    i3 = -336342289;
                    i5 = iM3169 ^ i3;
                    c156810 = c156810;
                    i36 = i36;
                    viewGroup2 = viewGroup2;
                    textView11 = textView11;
                    textView12 = textView12;
                    jSONObject2 = jSONObjectM28209;
                    i27 = i5;
                    c17798 = c17798;
                    i26 = i2;
                    jSONObjectM28209 = jSONObject2;
                    int i314 = i32;
                    strM28216 = str3;
                    i32 = i314;
                    short[] sArr110 = sArr2;
                    str8 = str8;
                    sb5 = sb5;
                    sArr5 = sArr110;
                    break;
                case -1480439605:
                case 205205802:
                    C23916.m53419();
                    if (RunnableC3055.m9933() == 0) {
                        c17797 = c17798;
                        jSONObject6 = jSONObjectM28209;
                        i13 = i36;
                        textView8 = textView12;
                        sb4 = sb5;
                        strM28207 = str8;
                        sArr4 = sArr5;
                        textView9 = textView11;
                        i14 = i35;
                        int iM2768 = C0619.m2761("ۗۧ") ^ i25;
                        StringBuilder sb7 = sb4;
                        i22 = ((iM2768 ^ i24) * (-25397)) ^ 1177511961;
                        i35 = i14;
                        textView11 = textView9;
                        sb5 = sb7;
                        textView12 = textView8;
                        sArr5 = sArr4;
                        str8 = strM28207;
                        jSONObjectM28209 = jSONObject6;
                        i27 = iM2768 ^ (-1363828956);
                        i36 = i13;
                        C17795 c17799 = c17797;
                        i26 = i22;
                        c17798 = c17799;
                    }
                    c17797 = c17798;
                    jSONObject5 = jSONObjectM28209;
                    i13 = i36;
                    textView6 = textView10;
                    str6 = strM28216;
                    textView7 = textView12;
                    textView5 = textView11;
                    sb3 = sb5;
                    str7 = str8;
                    int iM2769 = (C0619.m2761("֨᩸") + i24) * 41;
                    textView10 = textView6;
                    i22 = ((iM2769 ^ i25) * 15197) ^ 350966242;
                    strM28216 = str6;
                    str8 = str7;
                    jSONObjectM28209 = jSONObject5;
                    sb5 = sb3;
                    i27 = iM2769 ^ 1859624240;
                    textView11 = textView5;
                    textView12 = textView7;
                    i36 = i13;
                    C17795 c177910 = c17797;
                    i26 = i22;
                    c17798 = c177910;
                    break;
                case -1464365703:
                case -379910650:
                    c17796 = c17798;
                    jSONObject4 = jSONObjectM28209;
                    i8 = i36;
                    int i43 = i32;
                    str4 = strM28216;
                    textView3 = textView12;
                    textView4 = textView11;
                    i9 = i35;
                    short[] sArr20 = sArr5;
                    sb2 = sb5;
                    str5 = str8;
                    sArr3 = sArr20;
                    C2485.m8358(C2878.m9476(activityC20779, i43), 0);
                    i10 = i43;
                    iM31614 = C0773.m3169(C2485.m8350(f58407, 9, 3, i29));
                    i34 = 2128171814;
                    if (C3099.f10023 <= 0) {
                        i28 = 0;
                        int iM31620 = C0773.m3169("ۡۖ") ^ i25;
                        i11 = ((iM31620 ^ i24) * 18367) ^ (-1488860661);
                        i12 = iM31620 ^ 169176514;
                        i35 = i9;
                        i32 = i10;
                        textView11 = textView4;
                    } else {
                        int iM31621 = (C0773.m3169("֡ᩳ") ^ i24) * (-53);
                        i11 = ((iM31621 ^ i25) * 31445) ^ 864114261;
                        i12 = iM31621 ^ (-1922556117);
                        i35 = i9;
                        i32 = i10;
                        textView11 = textView4;
                        i28 = 0;
                    }
                    strM28216 = str4;
                    textView12 = textView3;
                    jSONObjectM28209 = jSONObject4;
                    i27 = i12;
                    c17798 = c17796;
                    i26 = i11;
                    i36 = i8;
                    short[] sArr21 = sArr3;
                    str8 = str5;
                    sb5 = sb2;
                    sArr5 = sArr21;
                    break;
                case -1423140711:
                case -896070815:
                    textView13 = textView13;
                    objArr = objArr;
                    if (i37 != 0) {
                        iM2763 = C0773.m3169("ܰܽ") ^ i25;
                        i26 = ((iM2763 ^ i24) * 7283) ^ 448655517;
                        i19 = 854189822;
                    } else {
                        iM2763 = (C0773.m3169("ۜۗ") + i24) * (-27);
                        i26 = ((iM2763 ^ i25) * 21837) ^ 978321460;
                        i19 = 1858228756;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -1406384561:
                case -1332842083:
                    C3492.m11488();
                    if (C2288.f7433 <= 0) {
                        c17798 = c17798;
                        jSONObjectM28209 = jSONObjectM28209;
                        textView12 = textView12;
                        textView11 = textView11;
                        String str14 = strM28216;
                        i32 = i32;
                        str3 = str14;
                        short[] sArr111 = sArr5;
                        sb5 = sb5;
                        str8 = str8;
                        sArr2 = sArr111;
                        int iM316111 = C0773.m3169("ۨ֨") ^ i25;
                        i2 = ((iM316111 ^ i24) * (-15813)) ^ (-1884982309);
                        i5 = iM316111 ^ (-1990842786);
                        textView11 = textView11;
                        textView12 = textView12;
                        jSONObject2 = jSONObjectM28209;
                        i27 = i5;
                        c17798 = c17798;
                        i26 = i2;
                        jSONObjectM28209 = jSONObject2;
                        int i315 = i32;
                        strM28216 = str3;
                        i32 = i315;
                        short[] sArr112 = sArr2;
                        str8 = str8;
                        sb5 = sb5;
                        sArr5 = sArr112;
                    } else {
                        int iM27610 = (C0619.m2761("ۡۡ") + i24) * (-9);
                        i26 = ((iM27610 ^ i25) * 21861) ^ 293969823;
                        i27 = iM27610 ^ 1788352474;
                        c17798 = this;
                        sb6 = null;
                    }
                    break;
                case -1304627734:
                case 1605132499:
                    if (RunnableC3055.f9898 < 0) {
                        iM31613 = (C0773.m3169("ۢ֫") ^ i25) * (-109);
                        i20 = ((iM31613 ^ i24) * 4191) ^ 1822937047;
                        i21 = 1181881155;
                        i27 = iM31613 ^ i21;
                        i26 = i20;
                    } else {
                        int iM27611 = (C0619.m2761("ۡۡ") + i24) * (-9);
                        i26 = ((iM27611 ^ i25) * 21861) ^ 293969823;
                        i27 = iM27611 ^ 1788352474;
                        c17798 = this;
                        sb6 = null;
                    }
                    break;
                case -1268540573:
                case -272208300:
                    c17798 = c17798;
                    jSONObjectM28209 = jSONObjectM28209;
                    i36 = i36;
                    textView12 = textView12;
                    textView11 = textView11;
                    viewGroup2 = viewGroup2;
                    c156810 = c156810;
                    String str15 = strM28216;
                    i32 = i32;
                    str3 = str15;
                    short[] sArr22 = sArr5;
                    sb5 = sb5;
                    str8 = str8;
                    sArr2 = sArr22;
                    activityC20779 = c17798.f58408;
                    if (activityC20779.f66578) {
                        iM3169 = C0619.m2761("ۨ֡") ^ i25;
                        i2 = ((iM3169 ^ i24) * (-12261)) ^ 1359726646;
                        i3 = 299068215;
                    } else {
                        iM3169 = C0773.m3169("֡۬") ^ i25;
                        i2 = ((iM3169 ^ i24) * 22575) ^ (-973991456);
                        i3 = -709789829;
                    }
                    i5 = iM3169 ^ i3;
                    c156810 = c156810;
                    i36 = i36;
                    viewGroup2 = viewGroup2;
                    textView11 = textView11;
                    textView12 = textView12;
                    jSONObject2 = jSONObjectM28209;
                    i27 = i5;
                    c17798 = c17798;
                    i26 = i2;
                    jSONObjectM28209 = jSONObject2;
                    int i316 = i32;
                    strM28216 = str3;
                    i32 = i316;
                    short[] sArr113 = sArr2;
                    str8 = str8;
                    sb5 = sb5;
                    sArr5 = sArr113;
                    break;
                case -1178268225:
                case 1054851334:
                    c17798 = this;
                    activityC20779.f66568.setImageBitmap(c17798.f58409);
                    iM31612 = (C0773.m3169("᩶ܳ") ^ i25) * (-83);
                    i17 = ((iM31612 ^ i24) * (-26307)) ^ (-827061789);
                    i18 = -1116204434;
                    int i44 = iM31612 ^ i18;
                    i36 = i36;
                    jSONObject7 = jSONObjectM28209;
                    i27 = i44;
                    c17798 = c17798;
                    i26 = i17;
                    jSONObjectM28209 = jSONObject7;
                    break;
                case -1097420300:
                case 1892753471:
                    c17797 = c17798;
                    jSONObject6 = jSONObjectM28209;
                    i13 = i36;
                    textView8 = textView12;
                    sb4 = sb5;
                    textView9 = textView11;
                    short[] sArr23 = sArr5;
                    i14 = i35;
                    String strM7749 = C2287.m7749(sArr23, i14, 2, i29);
                    C1783.m6234(sb4, strM7749);
                    sArr4 = sArr23;
                    C3779.m12258(sb4, C8311.m22390(C1542.m5472(activityC20779).m28233()));
                    C3779.m12258(sb4, strM7749);
                    strM28207 = C1542.m5472(activityC20779).m28207();
                    if (C1343.f4799 == 0) {
                        int iM31622 = (C0773.m3169("᩻ۜ") + i25) * (-65);
                        int i45 = ((iM31622 ^ i24) * (-17859)) ^ 1727079791;
                        i35 = i14;
                        textView11 = textView9;
                        sb5 = sb4;
                        textView12 = textView8;
                        sArr5 = sArr4;
                        str8 = strM28207;
                        jSONObjectM28209 = jSONObject6;
                        i27 = iM31622 ^ 1349392270;
                        c17798 = c17797;
                        i26 = i45;
                        i36 = i13;
                    } else {
                        int iM27612 = C0619.m2761("ۗۧ") ^ i25;
                        StringBuilder sb8 = sb4;
                        i22 = ((iM27612 ^ i24) * (-25397)) ^ 1177511961;
                        i35 = i14;
                        textView11 = textView9;
                        sb5 = sb8;
                        textView12 = textView8;
                        sArr5 = sArr4;
                        str8 = strM28207;
                        jSONObjectM28209 = jSONObject6;
                        i27 = iM27612 ^ (-1363828956);
                        i36 = i13;
                        C17795 c177911 = c17797;
                        i26 = i22;
                        c17798 = c177911;
                    }
                    break;
                case -916444007:
                case 1281482948:
                    C23916.m53425(textView11, C1080.m4058(sb6));
                    break;
                case -861422810:
                case 802201585:
                    textView13 = textView13;
                    objArr = objArr;
                    if (C3492.m11490(str9, AbstractC3624.m11769(f58407, 32, 17, i29))) {
                        iM2763 = C0619.m2761("᩺ۢ") ^ i24;
                        i26 = ((iM2763 ^ i25) * (-18069)) ^ (-2019243066);
                        i19 = 2066355480;
                    } else {
                        b2 = b;
                        iM2763 = C0773.m3169("ۗ۫") ^ i25;
                        i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                        i19 = 574646751;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -833682117:
                case 2082210255:
                    c17798 = c17798;
                    jSONObjectM28209 = jSONObjectM28209;
                    i36 = i36;
                    textView12 = textView12;
                    textView11 = textView11;
                    viewGroup2 = viewGroup2;
                    c156810 = c156810;
                    String str16 = strM28216;
                    i32 = i32;
                    str3 = str16;
                    short[] sArr24 = sArr5;
                    sb5 = sb5;
                    str8 = str8;
                    sArr2 = sArr24;
                    short s = f58407[0];
                    int i46 = (s * 2) + 1;
                    int i47 = s + 1;
                    if (i46 - (i47 * i47) > 0) {
                        iM3169 = C0773.m3169("ۜ᩵") ^ i24;
                        i2 = ((iM3169 ^ i25) * (-433)) ^ 2029844483;
                        i3 = -668155977;
                    } else {
                        iM3169 = C0773.m3169("ۗ۬") ^ i25;
                        i2 = ((iM3169 ^ i24) * (-20065)) ^ (-513789672);
                        i3 = -973128607;
                    }
                    i5 = iM3169 ^ i3;
                    c156810 = c156810;
                    i36 = i36;
                    viewGroup2 = viewGroup2;
                    textView11 = textView11;
                    textView12 = textView12;
                    jSONObject2 = jSONObjectM28209;
                    i27 = i5;
                    c17798 = c17798;
                    i26 = i2;
                    jSONObjectM28209 = jSONObject2;
                    int i317 = i32;
                    strM28216 = str3;
                    i32 = i317;
                    short[] sArr114 = sArr2;
                    str8 = str8;
                    sb5 = sb5;
                    sArr5 = sArr114;
                    break;
                case -668705633:
                case 1691911039:
                    C1542.m5459();
                    C0773.m3161();
                    int iM27613 = (C0619.m2761("ۡۡ") + i24) * (-9);
                    i26 = ((iM27613 ^ i25) * 21861) ^ 293969823;
                    i27 = iM27613 ^ 1788352474;
                    c17798 = this;
                    sb6 = null;
                    break;
                case -665578842:
                case 524082416:
                    c17798 = c17798;
                    activityC20779.f66568.setImageResource(C0773.m3169(AbstractC0641.m2820(f58407, 17, 3, i29)) ^ 2125310905);
                    iM31612 = (C0773.m3169("᩶ܳ") ^ i25) * (-83);
                    i17 = ((iM31612 ^ i24) * (-26307)) ^ (-827061789);
                    i18 = -1116204434;
                    int i48 = iM31612 ^ i18;
                    i36 = i36;
                    jSONObject7 = jSONObjectM28209;
                    i27 = i48;
                    c17798 = c17798;
                    i26 = i17;
                    jSONObjectM28209 = jSONObject7;
                    break;
                case -662152304:
                case 803279850:
                    C1080.m4046(sb6, c);
                    Resources resourcesM49056 = C21576.m49055();
                    Object[] objArr3 = new Object[i36];
                    objArr3[i28] = C0773.m3159(iM7759);
                    C1783.m6234(sb6, resourcesM49056.getQuantityString(C0773.m3169(C3448.m11252(f58407, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i29)) ^ 2102968475, iM7759, objArr3));
                    i33 = i37;
                    iM2763 = (C0619.m2761("᩷ۧ") + i24) * (-29);
                    i26 = ((iM2763 ^ i25) * (-15559)) ^ (-1637185449);
                    i19 = -406162370;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -592536327:
                case -170467120:
                    C1321.m4852();
                    break;
                case -498767005:
                case -415223290:
                    c17795 = c17798;
                    jSONObject = jSONObjectM28209;
                    i = i36;
                    textView = textView12;
                    textView2 = textView11;
                    int i49 = i35;
                    short[] sArr25 = sArr5;
                    sb = sb5;
                    str2 = str8;
                    sArr = sArr25;
                    C13473.m33140(C2878.m9476(activityC20779, iM31614 ^ i34), i28);
                    activityC20779.m47556();
                    C2375.m8070(activityC20779.f66566, new View.OnClickListener() { // from class: l.ܺ᩵֫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C17795 c177912 = null;
                            int i50 = -573908781;
                            int i51 = C2375.f7641;
                            int i52 = C3779.f12953;
                            int iM31623 = C0773.m3169("ᩳ᩷") ^ i51;
                            int i53 = ((iM31623 ^ i52) * (-4657)) ^ (-430720864);
                            int i54 = 59646531;
                            while (true) {
                                i50 = ((((i50 ^ i52) * 28631) >> 31) & i53) ^ (iM31623 ^ i54);
                                switch (i50) {
                                    case -2031643295:
                                    case -899468172:
                                        RunnableC1848.m6360();
                                        iM31623 = C0773.m3169("ܿۜ") ^ i51;
                                        i53 = ((iM31623 ^ i52) * 25923) ^ 433997048;
                                        i54 = 2087412596;
                                        break;
                                    case -2000885869:
                                    case 713894006:
                                        C3690.m11987();
                                        if (!C1343.m4943()) {
                                            iM31623 = C0773.m3169("ܿۜ") ^ i51;
                                            i53 = ((iM31623 ^ i52) * 25923) ^ 433997048;
                                            i54 = 2087412596;
                                        } else {
                                            iM31623 = (C0619.m2761("ۛ۬") ^ i51) * (-83);
                                            i53 = ((iM31623 ^ i52) * 13983) ^ (-1175593798);
                                            i54 = 278136926;
                                        }
                                        break;
                                    case -1943138305:
                                    case 1320319010:
                                        if (C1542.f5343 <= 0) {
                                            iM31623 = (i52 - C0619.m2761("ۛ᩷")) * (-65);
                                            i53 = ((iM31623 ^ i51) * (-3493)) ^ 1813136496;
                                            i54 = -1158859982;
                                        } else {
                                            iM31623 = C0773.m3169("ۘۘ") ^ i51;
                                            i53 = ((iM31623 ^ i52) * 16085) ^ (-1553542212);
                                            i54 = -323934461;
                                        }
                                        break;
                                    case -1836665342:
                                    case -690809937:
                                        if (C2023.f6737) {
                                            iM31623 = C0773.m3169("֨ۤ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * (-16519)) ^ (-1832261186);
                                            i54 = 51758972;
                                        } else {
                                            iM31623 = (C0619.m2761("֫ܶ") ^ i52) * (-29);
                                            i53 = ((iM31623 ^ i51) * (-22905)) ^ (-1421664598);
                                            i54 = 49021595;
                                        }
                                        break;
                                    case -1774004561:
                                    case 980570333:
                                        if (C2702.f8586 <= 0) {
                                            iM31623 = C0773.m3169("ܿۜ") ^ i51;
                                            i53 = ((iM31623 ^ i52) * 25923) ^ 433997048;
                                            i54 = 2087412596;
                                        } else {
                                            iM31623 = C0773.m3169("ܺۖ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * 20631) ^ (-1217914670);
                                            i54 = -957852944;
                                        }
                                        break;
                                    case -1737529222:
                                    case -1346499971:
                                        c177912 = this.f55710;
                                        if (C11235.f35427 >= 0) {
                                            iM31623 = C0619.m2761("֫ۢ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * (-17629)) ^ (-1516512423);
                                            i54 = -277428681;
                                        } else {
                                            iM31623 = C0619.m2761("ᩳۜ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * 16215) ^ (-607620708);
                                            i54 = 911056351;
                                        }
                                        break;
                                    case -1441180035:
                                    case -277811942:
                                        if (C1783.f6087 <= 0) {
                                            iM31623 = C0773.m3169("֨ۤ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * (-16519)) ^ (-1832261186);
                                            i54 = 51758972;
                                        } else {
                                            iM31623 = (C0619.m2761("ۡ᩹") ^ i51) * (-53);
                                            i53 = ((iM31623 ^ i52) * 26025) ^ 1084765277;
                                            i54 = 1053694834;
                                        }
                                        break;
                                    case -1388916979:
                                    case 1229936231:
                                        if (C0269.f1558 <= 0) {
                                            iM31623 = C0773.m3169("֨ۤ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * (-16519)) ^ (-1832261186);
                                            i54 = 51758972;
                                        } else {
                                            iM31623 = (i52 - C0619.m2761("ۧܶ")) * 81;
                                            i53 = ((iM31623 ^ i51) * (-3995)) ^ (-121710924);
                                            i54 = 312241898;
                                        }
                                        break;
                                    case -747069893:
                                    case 2001991774:
                                        if (C3033.f9831 >= 0) {
                                            iM31623 = (C0619.m2761("ۛ۬") ^ i51) * (-83);
                                            i53 = ((iM31623 ^ i52) * 13983) ^ (-1175593798);
                                            i54 = 278136926;
                                        } else {
                                            iM31623 = C0619.m2761("ۚ᩺") ^ i51;
                                            i53 = ((iM31623 ^ i52) * (-8279)) ^ 1825203949;
                                            i54 = -639060588;
                                        }
                                        break;
                                    case -635961308:
                                    case 1262539116:
                                        if (C2702.m8876()) {
                                            iM31623 = (i52 - C0773.m3169("᩸֫")) * (-105);
                                            i53 = ((iM31623 ^ i51) * (-9027)) ^ (-927376331);
                                            i54 = -2062275504;
                                        } else {
                                            iM31623 = C0773.m3169("ܿۜ") ^ i51;
                                            i53 = ((iM31623 ^ i52) * 25923) ^ 433997048;
                                            i54 = 2087412596;
                                        }
                                        break;
                                    case -214009223:
                                    case 1433108321:
                                        if (C2287.f7432 >= 0) {
                                            iM31623 = C0773.m3169("֨ۤ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * (-16519)) ^ (-1832261186);
                                            i54 = 51758972;
                                        } else {
                                            iM31623 = (i51 - C0619.m2761("֫ۜ")) * 33;
                                            i53 = ((iM31623 ^ i52) * 20333) ^ (-1788591573);
                                            i54 = -2111886102;
                                        }
                                        break;
                                    case 146083952:
                                    case 157913502:
                                        C1542.m5459();
                                        C1564.m5509();
                                        break;
                                    case 192440374:
                                    case 1759298030:
                                        C0950.m3785();
                                        if (C0950.m3785() == 0) {
                                            iM31623 = (i52 - C0619.m2761("ۛ᩷")) * (-65);
                                            i53 = ((iM31623 ^ i51) * (-3493)) ^ 1813136496;
                                            i54 = -1158859982;
                                        } else {
                                            iM31623 = C0773.m3169("ܿۜ") ^ i51;
                                            i53 = ((iM31623 ^ i52) * 25923) ^ 433997048;
                                            i54 = 2087412596;
                                        }
                                        break;
                                    case 534183456:
                                    case 783259446:
                                        ActivityC20779.m47544(c177912.f58408);
                                        break;
                                    case 1170658924:
                                    case 1958898581:
                                        if (RunnableC1848.f6235) {
                                            iM31623 = C0773.m3169("֨ۤ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * (-16519)) ^ (-1832261186);
                                            i54 = 51758972;
                                        } else {
                                            iM31623 = C0619.m2761("ۧܺ") ^ i51;
                                            i53 = ((iM31623 ^ i52) * (-15225)) ^ 109696697;
                                            i54 = 980169064;
                                        }
                                        break;
                                    default:
                                        C0487.m2356();
                                        if (C0773.m3161() == 0) {
                                            iM31623 = C0773.m3169("֨ۤ") ^ i52;
                                            i53 = ((iM31623 ^ i51) * (-16519)) ^ (-1832261186);
                                            i54 = 51758972;
                                        } else {
                                            iM31623 = (C0619.m2761("ۛ۬") ^ i51) * (-83);
                                            i53 = ((iM31623 ^ i52) * 13983) ^ (-1175593798);
                                            i54 = 278136926;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    textView10 = activityC20779.f66567;
                    strM28216 = C3690.m11989(activityC20779).m28216();
                    if (C0269.f1558 > 0) {
                        int iM27614 = C0619.m2761("۠ۢ") ^ i25;
                        int i50 = ((iM27614 ^ i24) * (-30991)) ^ (-1335336897);
                        i35 = i49;
                        textView11 = textView2;
                        i36 = i;
                        textView12 = textView;
                        jSONObject3 = jSONObject;
                        i27 = iM27614 ^ 582485697;
                        c17798 = c17795;
                        i26 = i50;
                        jSONObjectM28209 = jSONObject3;
                        short[] sArr115 = sArr;
                        str8 = str2;
                        sb5 = sb;
                        sArr5 = sArr115;
                    } else {
                        i35 = i49;
                        c15689 = c156810;
                        str = strM28216;
                        int iM316112 = (C0773.m3169("᩹ܶ") + i25) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        int i318 = ((iM316112 ^ i24) * (-14023)) ^ 1322521696;
                        c156810 = c15689;
                        textView11 = textView2;
                        jSONObjectM28209 = jSONObject;
                        i27 = iM316112 ^ (-1526565805);
                        c17798 = c17795;
                        i26 = i318;
                        textView12 = textView;
                        i36 = i;
                        strM28216 = str;
                        i32 = i32;
                        short[] sArr116 = sArr;
                        str8 = str2;
                        sb5 = sb;
                        sArr5 = sArr116;
                    }
                    break;
                case -310053504:
                case 1510520112:
                    textView13 = textView13;
                    objArr = objArr;
                    if (C3492.m11490(str9, C3998.m12925(f58407, 85, 22, i29))) {
                        iM2763 = C0619.m2761("ۛ᩸") ^ i24;
                        i26 = ((iM2763 ^ i25) * (-10321)) ^ (-139664904);
                        i19 = 235067048;
                    } else {
                        b2 = b;
                        iM2763 = C0773.m3169("ۗ۫") ^ i25;
                        i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                        i19 = 574646751;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -244236330:
                case 770507556:
                    C1080.m4046(sb6, c);
                    Resources resourcesM49057 = C21576.m49055();
                    Object[] objArr4 = new Object[i36];
                    objArr4[i28] = C0773.m3159(iM7759);
                    C1783.m6234(sb6, resourcesM49057.getQuantityString(C0773.m3169(C3690.m11996(f58407, 116, 3, i29)) ^ 2125998780, iM7759, objArr4));
                    i33 = i37;
                    iM2763 = (C0619.m2761("᩷ۧ") + i24) * (-29);
                    i26 = ((iM2763 ^ i25) * (-15559)) ^ (-1637185449);
                    i19 = -406162370;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -211243982:
                case 1872161061:
                    textView13 = textView13;
                    objArr = objArr;
                    if (C3492.m11490(str9, C17202.m40377(f58407, 49, 18, i29))) {
                        iM2763 = (i25 - C0619.m2761("᩸᩺")) * (-125);
                        i26 = ((iM2763 ^ i24) * 5629) ^ 1120359204;
                        i19 = -1218550865;
                    } else {
                        b2 = b;
                        iM2763 = C0773.m3169("ۗ۫") ^ i25;
                        i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                        i19 = 574646751;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -139075794:
                case 1409560017:
                    C2287.m7745();
                    if (C0950.f3488 < 0) {
                        c17797 = c17798;
                        jSONObject5 = jSONObjectM28209;
                        i13 = i36;
                        textView6 = textView10;
                        str6 = strM28216;
                        textView7 = textView12;
                        textView5 = textView11;
                        sb3 = sb5;
                        str7 = str8;
                        int iM27615 = (C0619.m2761("֨᩸") + i24) * 41;
                        textView10 = textView6;
                        i22 = ((iM27615 ^ i25) * 15197) ^ 350966242;
                        strM28216 = str6;
                        str8 = str7;
                        jSONObjectM28209 = jSONObject5;
                        sb5 = sb3;
                        i27 = iM27615 ^ 1859624240;
                        textView11 = textView5;
                        textView12 = textView7;
                        i36 = i13;
                        C17795 c177912 = c17797;
                        i26 = i22;
                        c17798 = c177912;
                    } else {
                        iM31613 = C0773.m3169("ۖ᩶") ^ i24;
                        i20 = ((iM31613 ^ i25) * 21371) ^ (-1295898623);
                        i21 = -1767922529;
                        i27 = iM31613 ^ i21;
                        i26 = i20;
                    }
                    break;
                case -77082633:
                case 22385436:
                    C2023.m6955(sb6, c);
                    Resources resourcesM49058 = C21576.m49055();
                    Object[] objArr5 = new Object[i36];
                    objArr5[i28] = C0619.m2764(iM7759);
                    C3779.m12258(sb6, resourcesM49058.getQuantityString(C0619.m2761(C2310.m7803(f58407, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i29)) ^ 2121979089, iM7759, objArr5));
                    i33 = i37;
                    iM2763 = (C0619.m2761("᩷ۧ") + i24) * (-29);
                    i26 = ((iM2763 ^ i25) * (-15559)) ^ (-1637185449);
                    i19 = -406162370;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case -790410:
                case 1465764349:
                    textView13 = textView13;
                    objArr = objArr;
                    b2 = 2;
                    iM2763 = C0773.m3169("ۗ۫") ^ i25;
                    i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                    i19 = 574646751;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case 38638540:
                case 1354442670:
                    textView13 = textView13;
                    objArr = objArr;
                    C2023.m6955(sb6, c);
                    Resources resourcesM49059 = C21576.m49055();
                    Object[] objArr6 = new Object[i36];
                    objArr6[i28] = C0619.m2764(i37);
                    C3779.m12258(sb6, resourcesM49059.getQuantityString(C0773.m3169(C3077.m10047(f58407, 29, 3, i29)) ^ 2118131806, i37, objArr6));
                    iM2763 = (C0773.m3169("ۜۗ") + i24) * (-27);
                    i26 = ((iM2763 ^ i25) * 21837) ^ 978321460;
                    i19 = 1858228756;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case 146579236:
                case 1054856881:
                    i31 += iM7759;
                    textView13 = textView13;
                    objArr = objArr;
                    i37 = i33;
                    iM2763 = C0619.m2761("ۤ֫") ^ i24;
                    i26 = ((iM2763 ^ i25) * (-26067)) ^ (-1370680551);
                    i19 = 1244884973;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case 205843989:
                case 1067349014:
                    C2354.m7978(activityC20779.f66571, C3690.m11989(activityC20779).m28218());
                    C2354.m7978(activityC20779.f66569, C15701.m37478(C3690.m11989(activityC20779).m28232()));
                    iM31612 = C0619.m2761("ܺ᩵") ^ i25;
                    i17 = ((iM31612 ^ i24) * 16533) ^ 1736356169;
                    i18 = -395489844;
                    int i410 = iM31612 ^ i18;
                    i36 = i36;
                    jSONObject7 = jSONObjectM28209;
                    i27 = i410;
                    c17798 = c17798;
                    i26 = i17;
                    jSONObjectM28209 = jSONObject7;
                    break;
                case 234900995:
                case 715228992:
                    textView13 = textView13;
                    objArr = objArr;
                    b2 = 3;
                    iM2763 = C0773.m3169("ۗ۫") ^ i25;
                    i26 = ((iM2763 ^ i24) * 4939) ^ (-920506010);
                    i19 = 574646751;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case 287940976:
                case 1593619953:
                    C23916.m53425(textView13, C2485.m8354(activityC20779, iM2765 ^ 2118443225, objArr));
                    jSONObjectM28209 = C1542.m5472(activityC20779).m28209();
                    textView11 = activityC20779.f66570;
                    if (C11235.f35427 < 0) {
                        sb6 = new StringBuilder(AbstractC0116.m1244(C0773.m3169(C0269.m1785(f58407, 23, 3, i29)) ^ 2129029238));
                        if (C2419.f7754 < 0) {
                            iM31610 = (C0619.m2761("۠ᩴ") + i24) * (-81);
                            i26 = ((iM31610 ^ i25) * 18269) ^ (-480850181);
                            i4 = 1240544298;
                            i27 = iM31610 ^ i4;
                            c17798 = this;
                        } else {
                            c17796 = this;
                            jSONObject4 = jSONObjectM28209;
                            i8 = i36;
                            str4 = strM28216;
                            textView3 = textView12;
                            textView4 = textView11;
                            i10 = i32;
                            i9 = i35;
                            short[] sArr26 = sArr5;
                            sb2 = sb5;
                            str5 = str8;
                            sArr3 = sArr26;
                            int iM31623 = C0773.m3169("ۡۖ") ^ i25;
                            i11 = ((iM31623 ^ i24) * 18367) ^ (-1488860661);
                            i12 = iM31623 ^ 169176514;
                            i35 = i9;
                            i32 = i10;
                            textView11 = textView4;
                            strM28216 = str4;
                            textView12 = textView3;
                            jSONObjectM28209 = jSONObject4;
                            i27 = i12;
                            c17798 = c17796;
                            i26 = i11;
                            i36 = i8;
                            short[] sArr27 = sArr3;
                            str8 = str5;
                            sb5 = sb2;
                            sArr5 = sArr27;
                        }
                    } else {
                        int iM27616 = (C0619.m2761("ۡۡ") + i24) * (-9);
                        i26 = ((iM27616 ^ i25) * 21861) ^ 293969823;
                        i27 = iM27616 ^ 1788352474;
                        c17798 = this;
                        sb6 = null;
                    }
                    break;
                case 418484450:
                case 1749522058:
                    if (C20932.f66974 <= 0) {
                        iM31613 = (C0773.m3169("ۢ֫") ^ i25) * (-109);
                        i20 = ((iM31613 ^ i24) * 4191) ^ 1822937047;
                        i21 = 1181881155;
                    } else {
                        iM31613 = (C0619.m2761("ۚ۬") ^ i24) * (-55);
                        i20 = ((iM31613 ^ i25) * (-8809)) ^ (-862387216);
                        i21 = 118497747;
                    }
                    i27 = iM31613 ^ i21;
                    i26 = i20;
                    break;
                case 473867662:
                case 1937872851:
                    c17798 = c17798;
                    jSONObjectM28209 = jSONObjectM28209;
                    i36 = i36;
                    if (c17798.f58409 != null) {
                        iM31612 = (C0619.m2761("᩵֡") + i24) * (-105);
                        i17 = ((iM31612 ^ i25) * 23303) ^ 730399967;
                        i18 = 1313269256;
                    } else {
                        iM31612 = (C0773.m3169("֫᩹") ^ i24) * (-103);
                        i17 = ((iM31612 ^ i25) * 11781) ^ 1828442304;
                        i18 = 1560742323;
                    }
                    int i411 = iM31612 ^ i18;
                    i36 = i36;
                    jSONObject7 = jSONObjectM28209;
                    i27 = i411;
                    c17798 = c17798;
                    i26 = i17;
                    jSONObjectM28209 = jSONObject7;
                    break;
                case 773163181:
                case 1976783460:
                    textView13 = textView13;
                    objArr = objArr;
                    ArrayList arrayList = new ArrayList();
                    C7676.m20914(arrayList, jSONObjectM28209.keys());
                    Collections.sort(arrayList);
                    i37 = 0;
                    itM13647 = C4282.m13647(arrayList);
                    i31 = 0;
                    iM2763 = C0619.m2761("ۤ֫") ^ i24;
                    i26 = ((iM2763 ^ i25) * (-26067)) ^ (-1370680551);
                    i19 = 1244884973;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case 965878788:
                case 1074959478:
                    textView13 = textView13;
                    objArr = objArr;
                    switch (b2) {
                        case 0:
                            iM2763 = C0773.m3169("ۢ᩺") ^ i25;
                            i26 = ((iM2763 ^ i24) * (-3531)) ^ (-2126398405);
                            i19 = -1724577934;
                            break;
                        case 1:
                            iM2763 = C0619.m2761("ܺۨ") ^ i24;
                            i26 = ((iM2763 ^ i25) * 1685) ^ 82825956;
                            i19 = -64290197;
                            break;
                        case 2:
                            iM2763 = C0773.m3169("۟ۨ") ^ i24;
                            i26 = ((iM2763 ^ i25) * (-8091)) ^ 2028296256;
                            i19 = 721086565;
                            break;
                        case 3:
                            iM2763 = (C0773.m3169("ۧۖ") + i25) * (-37);
                            i26 = ((iM2763 ^ i24) * (-29455)) ^ (-1246457773);
                            i19 = 997284466;
                            break;
                        default:
                            iM2763 = C0773.m3169("ۘܿ") ^ i25;
                            i26 = ((iM2763 ^ i24) * (-13183)) ^ (-1761349930);
                            i19 = -818059897;
                            break;
                    }
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case 1012340675:
                case 1715777577:
                    textView13 = textView13;
                    objArr = objArr;
                    C1080.m4046(sb6, c);
                    C3779.m12258(sb6, AbstractC3624.m11765(C0773.m3169(C2310.m7803(f58407, 26, 3, i29)) ^ 2102245784));
                    iM2763 = (C0773.m3169("ۜۗ") + i24) * (-27);
                    i26 = ((iM2763 ^ i25) * 21837) ^ 978321460;
                    i19 = 1858228756;
                    textView13 = textView13;
                    objArr = objArr;
                    i27 = iM2763 ^ i19;
                    c17798 = this;
                    break;
                case 1041537035:
                case 1089142174:
                    c17797 = c17798;
                    jSONObject5 = jSONObjectM28209;
                    i13 = i36;
                    textView5 = textView11;
                    textView6 = textView10;
                    str6 = strM28216;
                    str7 = str8;
                    C23916.m53425(textView6, str6);
                    textView7 = activityC20779.f66580;
                    sb3 = new StringBuilder();
                    C1783.m6234(sb3, C1542.m5472(activityC20779).m28224());
                    sArr5 = f58407;
                    i35 = 12;
                    if (C0269.m1775() > 0) {
                        textView10 = textView6;
                        int iM27617 = C0619.m2761("۠֫") ^ i24;
                        int i51 = ((iM27617 ^ i25) * 15049) ^ (-1841727728);
                        strM28216 = str6;
                        str8 = str7;
                        jSONObjectM28209 = jSONObject5;
                        i27 = iM27617 ^ (-1707748310);
                        c17798 = c17797;
                        sb5 = sb3;
                        i26 = i51;
                        textView11 = textView5;
                        textView12 = textView7;
                        i36 = i13;
                    } else {
                        int iM27618 = (C0619.m2761("֨᩸") + i24) * 41;
                        textView10 = textView6;
                        i22 = ((iM27618 ^ i25) * 15197) ^ 350966242;
                        strM28216 = str6;
                        str8 = str7;
                        jSONObjectM28209 = jSONObject5;
                        sb5 = sb3;
                        i27 = iM27618 ^ 1859624240;
                        textView11 = textView5;
                        textView12 = textView7;
                        i36 = i13;
                        C17795 c177913 = c17797;
                        i26 = i22;
                        c17798 = c177913;
                    }
                    break;
                case 1382560728:
                case 1480573676:
                    C17795 c177914 = c17798;
                    JSONObject jSONObject8 = jSONObjectM28209;
                    int i52 = i36;
                    StringBuilder sb9 = sb5;
                    String str17 = str8;
                    C3779.m12258(sb9, str17);
                    TextView textView14 = textView12;
                    C23916.m53425(textView14, C1080.m4058(sb9));
                    C2354.m7978(activityC20779.f66579, C1542.m5472(activityC20779).m28201());
                    if (C1542.m5472(activityC20779).m28218() == null) {
                        iM2762 = C0773.m3169("᩵۫") ^ i25;
                        i15 = ((iM2762 ^ i24) * (-21135)) ^ 631451341;
                        i16 = 2044769336;
                    } else {
                        iM2762 = (C0619.m2761("᩵ᩴ") ^ i24) * (-71);
                        i15 = ((iM2762 ^ i25) * (-397)) ^ 72917702;
                        i16 = -389843284;
                    }
                    int i53 = iM2762 ^ i16;
                    textView12 = textView14;
                    str8 = str17;
                    sb5 = sb9;
                    c17798 = c177914;
                    i26 = i15;
                    i36 = i52;
                    jSONObject7 = jSONObject8;
                    i27 = i53;
                    jSONObjectM28209 = jSONObject7;
                    break;
                default:
                    str3 = strM28216;
                    sArr2 = sArr5;
                    i29 = 35199;
                    iM3169 = (C0773.m3169("ۜ۬") ^ i24) * 63;
                    i2 = ((iM3169 ^ i25) * 6849) ^ (-497807023);
                    i3 = -336342289;
                    i5 = iM3169 ^ i3;
                    c156810 = c156810;
                    i36 = i36;
                    viewGroup2 = viewGroup2;
                    textView11 = textView11;
                    textView12 = textView12;
                    jSONObject2 = jSONObjectM28209;
                    i27 = i5;
                    c17798 = c17798;
                    i26 = i2;
                    jSONObjectM28209 = jSONObject2;
                    int i319 = i32;
                    strM28216 = str3;
                    i32 = i319;
                    short[] sArr117 = sArr2;
                    str8 = str8;
                    sb5 = sb5;
                    sArr5 = sArr117;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC20779 activityC20779 = null;
        View view = null;
        int i = 1756998061;
        int i2 = C2310.f7472;
        int i3 = C2288.f7433;
        int iM2761 = (i3 - C0619.m2761("᩷ܳ")) * (-57);
        int i4 = ((iM2761 ^ i2) * 1183) ^ 1176955777;
        int i5 = -2089098686;
        while (true) {
            i = ((((i ^ i2) * 14699) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2140500550:
                case -528667875:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ۗ۬") ^ i3) * (-23);
                        i4 = ((iM2761 ^ i2) * (-29425)) ^ (-377174189);
                        i5 = 836121199;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۡ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * 31151) ^ (-1359884012);
                        i5 = 920513239;
                    }
                    break;
                case -2062563567:
                case 3577791:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۨ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4189)) ^ (-1356447205);
                        i5 = -736584615;
                    } else {
                        iM2761 = (C0619.m2761("۫ۙ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * (-23651)) ^ (-692939235);
                        i5 = -562422846;
                    }
                    break;
                case -1921629087:
                case -852862785:
                    if (C3998.m12920()) {
                        iM2761 = (i3 - C0619.m2761("᩹ۨ")) * 81;
                        i4 = ((iM2761 ^ i2) * 6765) ^ (-403083182);
                        i5 = -812688634;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4189)) ^ (-1356447205);
                        i5 = -736584615;
                    }
                    break;
                case -1878363317:
                case -615208751:
                    C2878.m9491();
                    C2023.m6964();
                    iM2761 = (C0619.m2761("ܳ۫") + i2) * (-65);
                    i4 = ((iM2761 ^ i3) * (-31283)) ^ (-1594784788);
                    i5 = 1485555051;
                    break;
                case -1807771737:
                case 878094058:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i2 - C0619.m2761("֨᩺")) * 61;
                        i4 = ((iM2761 ^ i3) * 20463) ^ (-1499140651);
                        i5 = 2016004383;
                    } else {
                        iM2761 = (C0773.m3169("ܶܺ") ^ i3) * (-81);
                        i4 = ((iM2761 ^ i2) * 6903) ^ (-2129853076);
                        i5 = 1725921670;
                    }
                    break;
                case -1625857979:
                case -162905434:
                    activityC20779 = this.f58408;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("֡ۢ") + i3) * 99;
                        i4 = ((iM2761 ^ i2) * 27739) ^ 2145827307;
                        i5 = -580913749;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15425) ^ 1055105880;
                        i5 = 454601188;
                    }
                    break;
                case -1540078915:
                case 923825427:
                    C2485.m8358(view, 8);
                    break;
                case -1201944629:
                case 1905611828:
                    C2310.m7813();
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0619.m2761("ۗ۬") ^ i3) * (-23);
                        i4 = ((iM2761 ^ i2) * (-29425)) ^ (-377174189);
                        i5 = 836121199;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4189)) ^ (-1356447205);
                        i5 = -736584615;
                    }
                    break;
                case -979667164:
                case 266030498:
                    C23916.m53419();
                    RunnableC1848.m6360();
                    break;
                case -972331957:
                case 36333454:
                    if (C23916.f77426 > 0) {
                        iM2761 = (C0619.m2761("֡ۢ") + i3) * 99;
                        i4 = ((iM2761 ^ i2) * 27739) ^ 2145827307;
                        i5 = -580913749;
                    } else {
                        iM2761 = (C0619.m2761("ܳ۫") + i2) * (-65);
                        i4 = ((iM2761 ^ i3) * (-31283)) ^ (-1594784788);
                        i5 = 1485555051;
                    }
                    break;
                case -907765561:
                case 791314180:
                    if (C2288.m7767()) {
                        iM2761 = (C0619.m2761("ۗ۬") ^ i3) * (-23);
                        i4 = ((iM2761 ^ i2) * (-29425)) ^ (-377174189);
                        i5 = 836121199;
                    } else {
                        iM2761 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11063)) ^ 56439801;
                        i5 = 2136215070;
                    }
                    break;
                case -802849228:
                case 1393815655:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ܳ۫") + i2) * (-65);
                        i4 = ((iM2761 ^ i3) * (-31283)) ^ (-1594784788);
                        i5 = 1485555051;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۖۖ")) * 3;
                        i4 = ((iM2761 ^ i3) * (-19313)) ^ (-322006519);
                        i5 = 1266092300;
                    }
                    break;
                case -713570520:
                case -148233007:
                    if (C2485.f7950 != 0) {
                        iM2761 = (i2 - C0619.m2761("֨᩺")) * 61;
                        i4 = ((iM2761 ^ i3) * 20463) ^ (-1499140651);
                        i5 = 2016004383;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩹ܰ")) * (-93);
                        i4 = ((iM2761 ^ i3) * 27871) ^ 1128710216;
                        i5 = -1530852767;
                    }
                    break;
                case -338102042:
                case 486994618:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("ۨ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4189)) ^ (-1356447205);
                        i5 = -736584615;
                    } else {
                        iM2761 = (C0773.m3169("᩺ۜ") + i2) * (-31);
                        i4 = ((iM2761 ^ i3) * (-24069)) ^ (-1064688968);
                        i5 = -2044526401;
                    }
                    break;
                case 459081607:
                case 1701374347:
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = C0619.m2761("ۨ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4189)) ^ (-1356447205);
                        i5 = -736584615;
                    } else {
                        iM2761 = (C0619.m2761("֡ۢ") + i3) * 99;
                        i4 = ((iM2761 ^ i2) * 27739) ^ 2145827307;
                        i5 = -580913749;
                    }
                    break;
                default:
                    view = activityC20779.f66575;
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i2 - C0619.m2761("֨᩺")) * 61;
                        i4 = ((iM2761 ^ i3) * 20463) ^ (-1499140651);
                        i5 = 2016004383;
                    } else {
                        iM2761 = (C0619.m2761("᩻ۛ") + i3) * (-83);
                        i4 = ((iM2761 ^ i2) * 5895) ^ (-925161234);
                        i5 = 692103306;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01e5  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
    
        if (l.C3690.f12684 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d7, code lost:
    
        r30 = r4;
        r31 = r6;
        r1 = r19;
        r6 = r20;
        r20 = r23;
        r13 = r29;
        r32 = r45;
        r4 = r46;
        r29 = r5;
        r5 = r47;
        r50 = r28;
        r28 = r22;
        r22 = r26;
        r26 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f9, code lost:
    
        if (l.C3099.m10095() != false) goto L15;
     */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1136() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17795.mo1136():void");
    }
}
