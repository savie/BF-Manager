package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O6LY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9042 {

    /* JADX INFO: renamed from: ܳ᩷ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f29422 = {1819, -25505, -25522, -25507, -25508, -25526, -25593, -25599, -25599, -25599, -25594, -25498, -25535, -25525, -25526, -25513, -25585, -25536, -25511, -25526, -25507, -25527, -25533, -25536, -25512, -25585, -25529, -25522, -25508, -25585, -25529, -25522, -25505, -25505, -25526, -25535, -25526, -25525, -25599, -17349, 4636, 24751, 24729, 24785, 24781, 24780, 24790, 24731, 24709, 24709, 24709, 24709, 24735, 24735, 24735, 24769, 24768, 24785, 24772, 24780, 24777, 24790, 24709, 24751, 24790, 24784, 24775, 24790, 24785, 24791, 24780, 24779, 24770, 24717, 24715, 24715, 24715, 24716, 12792, -4408, 8053, 24714, 24735, 24735, 24735, 6594, -4711, -4705, -4728, -4711, -4706, -4712, -4733, -4732, -4723, -4670, -4668, -4668, -4668, -4669};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ActivityC0093 f29423;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC0726 f29424;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f29425;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f29426;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinearLayout f29427;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24145(String str) {
        LinearLayout linearLayout = null;
        List listM3581 = null;
        int i = 1307918162;
        int i2 = C1564.f5401;
        int i3 = C1542.f5343;
        int iM3169 = C0773.m3169("ܺᩳ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-17481)) ^ 38139853;
        int i5 = -1956968528;
        while (true) {
            i = ((((i ^ i2) * 22661) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2122345580:
                case 1597356529:
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("۫ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8629)) ^ 2049725837;
                        i5 = -666142971;
                    } else {
                        iM3169 = (C0619.m2761("ۚۤ") ^ i3) * (-25);
                        i4 = ((iM3169 ^ i2) * (-17181)) ^ (-948261959);
                        i5 = -101142311;
                    }
                    break;
                case -1785886127:
                case -629043408:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0619.m2761("ۚۤ") ^ i3) * (-25);
                        i4 = ((iM3169 ^ i2) * (-17181)) ^ (-948261959);
                        i5 = -101142311;
                    } else {
                        iM3169 = C0619.m2761("ܳۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19169)) ^ 2024892784;
                        i5 = -461744026;
                    }
                    break;
                case -1754635868:
                case -20844916:
                    if (this.f29425 != null) {
                        iM3169 = C0619.m2761("ۤ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22989) ^ (-353748454);
                        i5 = 129246928;
                    } else {
                        iM3169 = C0619.m2761("ۙۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4603) ^ (-1801527377);
                        i5 = 798728875;
                    }
                    break;
                case -1738563092:
                case 1426888753:
                    this.f29425 = str;
                    linearLayout = this.f29427;
                    if (C23916.m53419() != 0) {
                        iM3169 = (C0619.m2761("ۚۤ") ^ i3) * (-25);
                        i4 = ((iM3169 ^ i2) * (-17181)) ^ (-948261959);
                        i5 = -101142311;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30007) ^ (-647637195);
                        i5 = -861955860;
                    }
                    break;
                case -1736860883:
                case -1240950980:
                    linearLayout.removeAllViews();
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27317) ^ (-1214107051);
                        i5 = -381949334;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩵") + i3) * (-59);
                        i4 = ((iM3169 ^ i2) * (-3267)) ^ (-1296058430);
                        i5 = 609286172;
                    }
                    break;
                case -1676665449:
                case 1591903455:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("᩺ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2655) ^ 78692525;
                        i5 = -68466304;
                    } else {
                        iM3169 = (C0619.m2761("᩺۟") + i2) * 79;
                        i4 = ((iM3169 ^ i3) * 6225) ^ (-619935195);
                        i5 = 257917208;
                    }
                    break;
                case -1604775576:
                case 782371352:
                    AbstractC0116.m1243();
                    if (C23916.m53419() != 0) {
                        iM3169 = (C0619.m2761("ۚۤ") ^ i3) * (-25);
                        i4 = ((iM3169 ^ i2) * (-17181)) ^ (-948261959);
                        i5 = -101142311;
                    } else {
                        iM3169 = (C0619.m2761("ۡۛ") ^ i3) * (-7);
                        i4 = ((iM3169 ^ i2) * (-31159)) ^ 2006451135;
                        i5 = 1032402125;
                    }
                    break;
                case -1562620931:
                case -1288178580:
                    C3998.m12920();
                    C2287.m7745();
                    break;
                case -1496601543:
                case 2135668534:
                    break;
                case -1390707123:
                case 734180437:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0619.m2761("ۚۤ") ^ i3) * (-25);
                        i4 = ((iM3169 ^ i2) * (-17181)) ^ (-948261959);
                        i5 = -101142311;
                    } else {
                        iM3169 = C0773.m3169("᩶᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30951)) ^ 914466060;
                        i5 = 544249624;
                    }
                    break;
                case -1044966793:
                case 1138151769:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("۫ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8629)) ^ 2049725837;
                        i5 = -666142971;
                    } else {
                        iM3169 = C0619.m2761("۬᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18629) ^ (-1520105198);
                        i5 = 611685473;
                    }
                    break;
                case -1036370459:
                case 1548613954:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("۫ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8629)) ^ 2049725837;
                        i5 = -666142971;
                    } else {
                        iM3169 = C0773.m3169("ܽ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32505)) ^ (-2080607496);
                        i5 = 125699565;
                    }
                    break;
                case -1009709493:
                case 1686588905:
                    C20932.m47848();
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("᩺ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2655) ^ 78692525;
                        i5 = -68466304;
                    } else {
                        iM3169 = (C0619.m2761("ۚۤ") ^ i3) * (-25);
                        i4 = ((iM3169 ^ i2) * (-17181)) ^ (-948261959);
                        i5 = -101142311;
                    }
                    break;
                case -369615263:
                case 746382291:
                    RunnableC0334.m2063();
                    iM3169 = C0773.m3169("۫ۖ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-8629)) ^ 2049725837;
                    i5 = -666142971;
                    break;
                case -55064338:
                case 2099459958:
                    this.f29426.clear();
                    iM3169 = C0619.m2761("ۙۢ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 4603) ^ (-1801527377);
                    i5 = 798728875;
                    break;
                case 183349151:
                case 2112429700:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("۫ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8629)) ^ 2049725837;
                        i5 = -666142971;
                    } else {
                        iM3169 = C0619.m2761("ۜۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23009)) ^ (-354507259);
                        i5 = 2079008794;
                    }
                    break;
                case 768163010:
                case 1752290522:
                    m24138(linearLayout, listM3581, "", 0);
                    break;
                case 837119712:
                case 947762161:
                    listM3581 = C0878.m3581(str);
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27317) ^ (-1214107051);
                        i5 = -381949334;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩹ܶ")) * (-95);
                        i4 = ((iM3169 ^ i2) * 30131) ^ 1492987020;
                        i5 = -400172435;
                    }
                    break;
                case 1524906091:
                case 2100716576:
                    if (C15243.m36589((Object) this.f29425, (Object) str)) {
                        iM3169 = C0619.m2761("ۙܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3329)) ^ (-1730845459);
                        i5 = 908766363;
                    } else {
                        iM3169 = (C0619.m2761("֨ۤ") + i3) * 43;
                        i4 = ((iM3169 ^ i2) * 14343) ^ (-641338203);
                        i5 = -1387786764;
                    }
                    break;
                default:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27317) ^ (-1214107051);
                        i5 = -381949334;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۨۗ")) * (-97);
                        i4 = ((iM3169 ^ i2) * (-16877)) ^ (-1455656226);
                        i5 = -201394284;
                    }
                    break;
            }
            return;
        }
    }

    public C9042(ActivityC0093 activityC0093, LinearLayout linearLayout) {
        boolean z = false;
        AbstractC0726 abstractC0726M52413 = null;
        int i = -214918255;
        int i2 = C20932.f66974;
        int i3 = C2834.f9334;
        int iM3169 = (C0773.m3169("ۗ۠") ^ i3) * 15;
        int i4 = ((iM3169 ^ i2) * 8237) ^ (-1346556715);
        int i5 = -965791572;
        while (true) {
            i = ((((i ^ i2) * (-24741)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2071477698:
                case 432623058:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("᩷ᩳ") ^ i2) * 39;
                        i4 = ((iM3169 ^ i3) * (-19457)) ^ 1468392658;
                        i5 = 460825239;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩺ᩴ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i2) * (-1519)) ^ (-841665222);
                        i5 = -1839344269;
                    }
                    break;
                case -1995542758:
                case 785079177:
                    C0269.m1775();
                    if (!RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("᩷ᩳ") ^ i2) * 39;
                        i4 = ((iM3169 ^ i3) * (-19457)) ^ 1468392658;
                        i5 = 460825239;
                    } else {
                        iM3169 = (C0773.m3169("֡᩷") + i2) * 35;
                        i4 = ((iM3169 ^ i3) * 12297) ^ (-93351178);
                        i5 = -1103541464;
                    }
                    break;
                case -1763847831:
                case -1113031379:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۖܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10449) ^ 948526116;
                        i5 = 521244750;
                    } else {
                        iM3169 = C0773.m3169("ᩳܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29217) ^ 545362234;
                        i5 = 965271357;
                    }
                    break;
                case -1730496237:
                case 200058111:
                    this.f29424 = abstractC0726M52413;
                    if (RunnableC3055.f9898 < 0) {
                        this.f29426 = new LinkedHashSet();
                        return;
                    }
                    iM3169 = C0773.m3169("۠۟") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-14109)) ^ 722002013;
                    i5 = 981601555;
                    break;
                case -1628777192:
                case -1038600085:
                    AbstractC0116.m1243();
                    if (C2966.f9654 < 0) {
                        iM3169 = C0773.m3169("۠۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14109)) ^ 722002013;
                        i5 = 981601555;
                    } else {
                        iM3169 = C0619.m2761("ۖܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10449) ^ 948526116;
                        i5 = 521244750;
                    }
                    break;
                case -1396130593:
                case 1348009604:
                    C1146.m4231();
                    C2310.m7813();
                    throw new RuntimeException();
                case -1345627964:
                case 1663218939:
                    this.f29423 = activityC0093;
                    this.f29427 = linearLayout;
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۖܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10449) ^ 948526116;
                        i5 = 521244750;
                    } else {
                        iM3169 = (C0619.m2761("֫ۨ") ^ i2) * 67;
                        i4 = ((iM3169 ^ i3) * (-15969)) ^ 376671557;
                        i5 = 1003101193;
                    }
                    break;
                case -1257616530:
                case 1781765597:
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("ۖܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10449) ^ 948526116;
                        i5 = 521244750;
                    } else {
                        iM3169 = C0773.m3169("ۙܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30847) ^ 676918938;
                        i5 = -220130422;
                    }
                    break;
                case -1208797342:
                case 1992446401:
                    z = true;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("᩷ᩳ") ^ i2) * 39;
                        i4 = ((iM3169 ^ i3) * (-19457)) ^ 1468392658;
                        i5 = 460825239;
                    } else {
                        iM3169 = (C0773.m3169("֫᩵") + i2) * 99;
                        i4 = ((iM3169 ^ i3) * 27961) ^ (-1932203873);
                        i5 = -1444802212;
                    }
                    break;
                case -384614213:
                case 614312177:
                    abstractC0726M52413 = C23302.m52413(activityC0093, z);
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ܿܽ") + i3) * 53;
                        i4 = ((iM3169 ^ i2) * 7459) ^ (-877266054);
                        i5 = 1153040015;
                    } else {
                        iM3169 = C0773.m3169("ۖۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17115) ^ (-574993803);
                        i5 = -1307137192;
                    }
                    break;
                case 139402305:
                case 1011413100:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("۠۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14109)) ^ 722002013;
                        i5 = 981601555;
                    } else {
                        iM3169 = C0773.m3169("ۙۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 13933) ^ 599835409;
                        i5 = 233602006;
                    }
                    break;
                case 194953098:
                case 1118115097:
                    if (C0619.m2763()) {
                        iM3169 = (C0773.m3169("֡᩷") + i2) * 35;
                        i4 = ((iM3169 ^ i3) * 12297) ^ (-93351178);
                        i5 = -1103541464;
                    } else {
                        iM3169 = C0773.m3169("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24501) ^ (-1021579074);
                        i5 = -1370761564;
                    }
                    break;
                case 1145631132:
                case 1817091397:
                    if (C1080.m4050()) {
                        iM3169 = (C0619.m2761("ۨ۠") ^ i2) * 5;
                        i4 = ((iM3169 ^ i3) * 2211) ^ (-279242448);
                        i5 = -1076890708;
                    } else {
                        iM3169 = (C0619.m2761("᩷ᩳ") ^ i2) * 39;
                        i4 = ((iM3169 ^ i3) * (-19457)) ^ 1468392658;
                        i5 = 460825239;
                    }
                    break;
                case 1680058617:
                case 2118257670:
                    RunnableC3646.m11813();
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("᩷ᩳ") ^ i2) * 39;
                        i4 = ((iM3169 ^ i3) * (-19457)) ^ 1468392658;
                        i5 = 460825239;
                    } else {
                        iM3169 = C0773.m3169("۠۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14109)) ^ 722002013;
                        i5 = 981601555;
                    }
                    break;
                default:
                    C0269.m1775();
                    C3033.m9845();
                    iM3169 = C0619.m2761("ۖܰ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 10449) ^ 948526116;
                    i5 = 521244750;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0139 A[PHI: r4 r5 r6 r7
      0x0139: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:43:0x0137, B:38:0x00fd, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r5v3 float) = (r5v2 float), (r5v2 float), (r5v4 float) binds: [B:43:0x0137, B:38:0x00fd, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r6v3 float) = (r6v2 float), (r6v2 float), (r6v4 float) binds: [B:43:0x0137, B:38:0x00fd, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r7v4 l.֡᩸᩹) = (r7v2 l.֡᩸᩹), (r7v3 l.֡᩸᩹), (r7v2 l.֡᩸᩹) binds: [B:43:0x0137, B:38:0x00fd, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x021b A[PHI: r3
      0x021b: PHI (r3v4 float) = (r3v2 float), (r3v2 float), (r3v3 float), (r3v2 float), (r3v2 float), (r3v2 float) binds: [B:64:0x0219, B:60:0x01fc, B:47:0x016c, B:30:0x00b3, B:25:0x009d, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m24141(C24941 c24941, C9042 c9042, LinearLayout linearLayout) {
        int iM2761;
        int i;
        int i2;
        TextView textView = null;
        float f = 0.0f;
        int i3 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        AbstractC0726 abstractC0726 = null;
        Spanned spannedMo3049 = null;
        int i4 = 1920920226;
        int i5 = C3033.f9831;
        int i6 = C2354.f7599;
        int iM2762 = C0619.m2761("ۡۢ") ^ i5;
        int i7 = ((iM2762 ^ i6) * (-8185)) ^ 103461503;
        int i8 = -400965540;
        while (true) {
            int i9 = iM2762 ^ i8;
            while (true) {
                i4 = ((((i4 ^ i6) * (-19599)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -1952109344:
                    case -844851697:
                        if (!C1321.m4852()) {
                            iM2762 = (i6 - C0619.m2761("ۚۛ")) * (-21);
                            i7 = ((iM2762 ^ i5) * (-8239)) ^ 156567173;
                            i8 = 743422965;
                        } else {
                            iM2762 = (i6 - C0773.m3169("֨ܶ")) * (-43);
                            i7 = ((iM2762 ^ i5) * 18611) ^ (-530401249);
                            i8 = -379670558;
                        }
                        break;
                    case -1718798573:
                    case 1175319147:
                        textView.setTextSize(f);
                        i3 = C3296.f10741;
                        if (C2287.f7432 >= 0) {
                            iM2761 = (i5 - C0619.m2761("ۛ᩻")) * 95;
                            i = ((iM2761 ^ i6) * 19641) ^ 932683833;
                            i2 = -1979865098;
                        } else {
                            iM2761 = (C0619.m2761("ۨۜ") + i5) * (-49);
                            i = ((iM2761 ^ i6) * (-18863)) ^ 2010667955;
                            i2 = 1205747240;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case -1671669105:
                    case -1279765206:
                        if (C2485.m8357() <= 0) {
                            iM2761 = C0773.m3169("ۛ۫") ^ i5;
                            i = ((iM2761 ^ i6) * 12415) ^ 637145983;
                            i2 = 303658779;
                        } else {
                            iM2761 = (i5 - C0773.m3169("ܽ᩺")) * 5;
                            i = ((iM2761 ^ i6) * (-1443)) ^ 600722972;
                            i2 = -1152107131;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case -1537234518:
                    case 75401328:
                        if (C3033.f9831 < 0) {
                            iM2761 = C0773.m3169("ۛ۫") ^ i5;
                            i = ((iM2761 ^ i6) * 12415) ^ 637145983;
                            i2 = 303658779;
                            i9 = iM2761 ^ i2;
                            i7 = i;
                        }
                        iM2761 = C0619.m2761("ᩳᩳ") ^ i6;
                        i = ((iM2761 ^ i5) * (-32711)) ^ 480478253;
                        i2 = 1256308780;
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case -628979748:
                    case 2035375099:
                        RunnableC1848.m6360();
                        break;
                    case -561457387:
                    case 130367447:
                        if (C2485.f7950 != 0) {
                            iM2761 = C0773.m3169("ۛ۫") ^ i5;
                            i = ((iM2761 ^ i6) * 12415) ^ 637145983;
                            i2 = 303658779;
                        } else {
                            iM2761 = C0619.m2761("ᩴ᩸") ^ i6;
                            i = ((iM2761 ^ i5) * (-1111)) ^ (-1215970101);
                            i2 = 205462939;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case -465756720:
                    case 1589060473:
                        textView.setLineSpacing(f2, f3);
                        abstractC0726 = c9042.f29424;
                        if (C0773.f2792 <= 0) {
                            iM2761 = (i5 - C0619.m2761("ۛ᩻")) * 95;
                            i = ((iM2761 ^ i6) * 19641) ^ 932683833;
                            i2 = -1979865098;
                        } else {
                            iM2761 = (i6 - C0619.m2761("ܰܿ")) * (-91);
                            i = ((iM2761 ^ i5) * 13851) ^ 328591512;
                            i2 = -1272406627;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case -316969385:
                    case 1453564232:
                        C3492.m11488();
                        if (C1783.m6232()) {
                            iM2762 = (i6 - C0619.m2761("ۚۛ")) * (-21);
                            i7 = ((iM2762 ^ i5) * (-8239)) ^ 156567173;
                            i8 = 743422965;
                        }
                        iM2761 = C0619.m2761("ᩳᩳ") ^ i6;
                        i = ((iM2761 ^ i5) * (-32711)) ^ 480478253;
                        i2 = 1256308780;
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case -37384255:
                    case 331747080:
                        C2310.m7813();
                        C1826.m6301();
                        iM2761 = C0619.m2761("ᩳᩳ") ^ i6;
                        i = ((iM2761 ^ i5) * (-32711)) ^ 480478253;
                        i2 = 1256308780;
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case 69381293:
                    case 1147532677:
                        abstractC0726.mo3051(textView, (SpannableStringBuilder) spannedMo3049);
                        if (C3077.m10041()) {
                            iM2761 = C0773.m3169("ۛ۫") ^ i5;
                            i = ((iM2761 ^ i6) * 12415) ^ 637145983;
                            i2 = 303658779;
                        } else {
                            iM2761 = (i6 - C0619.m2761("ۜܽ")) * 81;
                            i = ((iM2761 ^ i5) * (-32327)) ^ (-2124711572);
                            i2 = -2091210859;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case 117717813:
                    case 436665528:
                        spannedMo3049 = abstractC0726.mo3049(textView, (AbstractC4534) c24941.f80717);
                        if (C2702.f8586 <= 0) {
                            iM2761 = C0619.m2761("ᩳᩳ") ^ i6;
                            i = ((iM2761 ^ i5) * (-32711)) ^ 480478253;
                            i2 = 1256308780;
                        } else {
                            iM2761 = (C0773.m3169("֨᩻") + i5) * (-109);
                            i = ((iM2761 ^ i6) * 3625) ^ 634433223;
                            i2 = -1702161342;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case 255250579:
                    case 1181928170:
                        TextView textView2 = new TextView(c9042.f29423);
                        if (C0619.f2439) {
                            textView = textView2;
                            iM2761 = C0619.m2761("ᩳᩳ") ^ i6;
                            i = ((iM2761 ^ i5) * (-32711)) ^ 480478253;
                            i2 = 1256308780;
                            i9 = iM2761 ^ i2;
                            i7 = i;
                        } else {
                            int iM3169 = C0773.m3169("۠᩸") ^ i5;
                            i7 = ((iM3169 ^ i6) * 15009) ^ 397156253;
                            i9 = iM3169 ^ (-73123929);
                            textView = textView2;
                        }
                        break;
                    case 336851332:
                    case 890036277:
                        if (((C14753) c24941.f80717).m14254() == null) {
                            iM2761 = (i5 - C0619.m2761("᩹۠")) * (-127);
                            i = ((iM2761 ^ i6) * (-6365)) ^ (-1611312813);
                            i2 = 1576276303;
                        } else {
                            iM2761 = C0619.m2761("᩵ۜ") ^ i6;
                            i = ((iM2761 ^ i5) * (-10381)) ^ (-2141854946);
                            i2 = -703465347;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case 343473045:
                    case 430578410:
                        f = 13.0f;
                        if (C3690.f12684 <= 0) {
                            iM2761 = C0773.m3169("ۛ۫") ^ i5;
                            i = ((iM2761 ^ i6) * 12415) ^ 637145983;
                            i2 = 303658779;
                        } else {
                            iM2761 = C0619.m2761("᩷ۙ") ^ i6;
                            i = ((iM2761 ^ i5) * (-10027)) ^ (-1329721952);
                            i2 = 166593985;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case 759681994:
                    case 906669995:
                        m24136(linearLayout, textView, 10);
                        if (C0487.f2131 > 0) {
                            c24941.f80717 = new C14753();
                        }
                        iM2761 = C0773.m3169("ۛ۫") ^ i5;
                        i = ((iM2761 ^ i6) * 12415) ^ 637145983;
                        i2 = 303658779;
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                    case 1586546668:
                    case 1589321286:
                        break;
                    default:
                        C3077.m10043(textView, i3);
                        f2 = 0.0f;
                        f3 = 1.2f;
                        if (C2023.f6737) {
                            iM2761 = (i5 - C0619.m2761("ۛ᩻")) * 95;
                            i = ((iM2761 ^ i6) * 19641) ^ 932683833;
                            i2 = -1979865098;
                        } else {
                            iM2761 = (i5 - C0619.m2761("ۧ֨")) * 49;
                            i = ((iM2761 ^ i6) * (-14681)) ^ (-1432998378);
                            i2 = -1236276544;
                        }
                        i9 = iM2761 ^ i2;
                        i7 = i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet m24144() {
        return this.f29426;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24140(C9042 c9042, String str, LinearLayout linearLayout, C15688 c15688, LinearLayout linearLayout2) {
        LinkedHashSet linkedHashSet = null;
        int i = 358708389;
        int i2 = C2287.f7432;
        int i3 = C0269.f1558;
        int iM3169 = (C0773.m3169("ۘۤ") + i3) * 37;
        int i4 = ((iM3169 ^ i2) * (-31629)) ^ (-1238042249);
        int i5 = 676863016;
        while (true) {
            i = ((((i ^ i2) * 23459) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2141995736:
                case -578354182:
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0619.m2761("ۜ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29011)) ^ 397153627;
                        i5 = 36641160;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֫᩶")) * 39;
                        i4 = ((iM3169 ^ i3) * (-17757)) ^ 445041477;
                        i5 = -1659706173;
                    }
                    break;
                case -2137753845:
                case -2094611395:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29005) ^ (-2009111468);
                        i5 = 26387540;
                    } else {
                        iM3169 = C0773.m3169("ۧᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32571) ^ 378431447;
                        i5 = 141389075;
                    }
                    break;
                case -2121940897:
                case -497614321:
                    C1826.m6301();
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("ᩳܿ") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * 4561) ^ 1620020461;
                        i5 = 1800486607;
                    } else {
                        iM3169 = (C0619.m2761("۫ۙ") ^ i2) * (-41);
                        i4 = ((iM3169 ^ i3) * 19679) ^ (-747731182);
                        i5 = 182526944;
                    }
                    break;
                case -2068151553:
                case -505561463:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("۟ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10261)) ^ 1235462713;
                        i5 = -91195439;
                    } else {
                        iM3169 = (C0773.m3169("֫᩹") + i3) * (-125);
                        i4 = ((iM3169 ^ i2) * (-5759)) ^ (-1433317956);
                        i5 = 1786166607;
                    }
                    break;
                case -2005269641:
                case -1881229319:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29005) ^ (-2009111468);
                        i5 = 26387540;
                    } else {
                        iM3169 = (C0773.m3169("ᩳܺ") ^ i3) * (-77);
                        i4 = ((iM3169 ^ i2) * (-9519)) ^ 761093529;
                        i5 = -1447517722;
                    }
                    break;
                case -1917737821:
                case -1019587030:
                    m24143(c9042, str, linearLayout, c15688, linearLayout2);
                    break;
                case -1900378761:
                case -505379242:
                    linkedHashSet.remove(str);
                    iM3169 = (i2 - C0773.m3169("ۛ᩸")) * 81;
                    i4 = ((iM3169 ^ i3) * (-1573)) ^ 1846034184;
                    i5 = 178046575;
                    break;
                case -1511875056:
                case 268666613:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29005) ^ (-2009111468);
                        i5 = 26387540;
                    } else {
                        iM3169 = (C0773.m3169("ܽܽ") ^ i3) * 43;
                        i4 = ((iM3169 ^ i2) * 21741) ^ (-1408472102);
                        i5 = 1945219368;
                    }
                    break;
                case -1124491610:
                case 1639270862:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29005) ^ (-2009111468);
                        i5 = 26387540;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ֡") + i2) * 109;
                        i4 = ((iM3169 ^ i3) * 24049) ^ 485155192;
                        i5 = -505817116;
                    }
                    break;
                case -665267759:
                case 1990662721:
                    C3448.m11248();
                    break;
                case -311989045:
                case 391937708:
                    C1343.m4943();
                    C0619.m2763();
                    iM3169 = (C0619.m2761("۫ۙ") ^ i2) * (-41);
                    i4 = ((iM3169 ^ i3) * 19679) ^ (-747731182);
                    i5 = 182526944;
                    break;
                case -244446423:
                case 1809725580:
                    linkedHashSet = c9042.f29426;
                    if (linkedHashSet.add(str)) {
                        iM3169 = (i2 - C0773.m3169("ۛ᩸")) * 81;
                        i4 = ((iM3169 ^ i3) * (-1573)) ^ 1846034184;
                        i5 = 178046575;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۜۜ")) * (-69);
                        i4 = ((iM3169 ^ i2) * 26625) ^ 735548429;
                        i5 = -863065006;
                    }
                    break;
                case -49563361:
                case 197907634:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("۟ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10261)) ^ 1235462713;
                        i5 = -91195439;
                    } else {
                        iM3169 = (C0619.m2761("ܺۖ") + i2) * 93;
                        i4 = ((iM3169 ^ i3) * (-793)) ^ 649048679;
                        i5 = 755685665;
                    }
                    break;
                case 20686803:
                case 510173713:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("۟ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10261)) ^ 1235462713;
                        i5 = -91195439;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩹") ^ i3) * 75;
                        i4 = ((iM3169 ^ i2) * 7531) ^ 799711741;
                        i5 = -2138229909;
                    }
                    break;
                case 471901917:
                case 1509635745:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("ۜ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29011)) ^ 397153627;
                        i5 = 36641160;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۬ۛ")) * (-7);
                        i4 = ((iM3169 ^ i3) * 6845) ^ (-1854134812);
                        i5 = 348029766;
                    }
                    break;
                case 761884302:
                case 978627318:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("۟ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10261)) ^ 1235462713;
                        i5 = -91195439;
                    } else {
                        iM3169 = (C0619.m2761("ᩳܿ") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * 4561) ^ 1620020461;
                        i5 = 1800486607;
                    }
                    break;
                case 1011878851:
                case 1790188719:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("۫ۙ") ^ i2) * (-41);
                        i4 = ((iM3169 ^ i3) * 19679) ^ (-747731182);
                        i5 = 182526944;
                    } else {
                        iM3169 = C0619.m2761("֨ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30069) ^ (-519881353);
                        i5 = -828641443;
                    }
                    break;
                default:
                    C2288.m7767();
                    if (C2287.f7432 < 0) {
                        iM3169 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29005) ^ (-2009111468);
                        i5 = 26387540;
                    } else {
                        iM3169 = (C0619.m2761("ᩳܿ") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * 4561) ^ 1620020461;
                        i5 = 1800486607;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:52:0x015f A[PHI: r2
      0x015f: PHI (r2v4 l.ܰܿۨ) = (r2v2 l.ܰܿۨ), (r2v3 l.ܰܿۨ), (r2v2 l.ܰܿۨ), (r2v2 l.ܰܿۨ), (r2v2 l.ܰܿۨ) binds: [B:51:0x015d, B:26:0x008c, B:15:0x0043, B:13:0x003f, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01eb A[PHI: r3
      0x01eb: PHI (r3v4 l.֡᩸᩹) = (r3v2 l.֡᩸᩹), (r3v2 l.֡᩸᩹), (r3v2 l.֡᩸᩹), (r3v3 l.֡᩸᩹), (r3v2 l.֡᩸᩹) binds: [B:63:0x01e9, B:47:0x0143, B:43:0x0129, B:22:0x006a, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m24139(TextView textView, AbstractC4534 abstractC4534) {
        int iM3169;
        int i;
        Iterator itM13647 = null;
        C14753 c14753 = null;
        AbstractC0726 abstractC0726 = null;
        int i2 = 92859119;
        int i3 = C3448.f11240;
        int i4 = C2375.f7641;
        int iM2761 = (i4 - C0619.m2761("ܰۗ")) * (-83);
        int i5 = ((iM2761 ^ i3) * (-5029)) ^ (-312546004);
        int i6 = -403066726;
        while (true) {
            int i7 = iM2761 ^ i6;
            C14974 c14974 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 32217) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2139980727:
                    case -671388099:
                        C1519.m5403();
                        C13473.m33144();
                        break;
                    case -2032973380:
                    case 1033993311:
                        c14974.m14256((AbstractC4534) C0950.m3796(itM13647));
                        iM3169 = C0773.m3169("᩹ۢ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 15735) ^ 1774695106;
                        i = 1211222240;
                        i7 = iM3169 ^ i;
                        break;
                    case -1919261096:
                    case -69607056:
                        if (C11235.m28309() != 0) {
                            iM3169 = (C0773.m3169("ۛ᩹") + i4) * 127;
                            i5 = ((iM3169 ^ i3) * (-17815)) ^ 574038252;
                            i = 2034887185;
                        } else {
                            iM3169 = (i4 - C0773.m3169("᩹ᩴ")) * 49;
                            i5 = ((iM3169 ^ i3) * (-14055)) ^ 1940347313;
                            i = 998446631;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1903593923:
                    case -398794363:
                        if (AbstractC0641.f2496 >= 0) {
                            iM3169 = (C0773.m3169("ۙܽ") + i3) * 41;
                            i5 = ((iM3169 ^ i4) * (-11371)) ^ (-327115077);
                            i = -1677733750;
                        } else {
                            iM3169 = C0619.m2761("ܰ֡") ^ i3;
                            i5 = ((iM3169 ^ i4) * 25391) ^ 468277839;
                            i = 902235709;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1885981988:
                    case 1711184932:
                        if (C1343.f4799 != 0) {
                            iM3169 = C0619.m2761("ۨۢ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 23635) ^ 914907531;
                            i = 1748704277;
                        } else {
                            iM3169 = C0773.m3169("᩷ܿ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 2011) ^ 769135121;
                            i = 1994280965;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1857786217:
                    case -384084905:
                        abstractC0726.mo3051(textView, (SpannableStringBuilder) abstractC0726.mo3049(textView, c14753));
                        break;
                    case -1807449104:
                    case 1719357657:
                        if (C0269.f1558 > 0) {
                            iM3169 = (C0773.m3169("ۢ֨") ^ i3) * (-29);
                            i5 = ((iM3169 ^ i4) * (-14255)) ^ 1795990988;
                            i = 1111279948;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -1785459619:
                    case 1800706025:
                        if (C1564.f5401 <= 0) {
                            iM3169 = (C0773.m3169("ۛ᩹") + i4) * 127;
                            i5 = ((iM3169 ^ i3) * (-17815)) ^ 574038252;
                            i = 2034887185;
                        } else {
                            iM3169 = C0619.m2761("ۨۖ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 2147) ^ 685203787;
                            i = 7569869;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1634412789:
                    case 1282941655:
                        if (C1343.f4799 != 0) {
                            iM3169 = (C0773.m3169("ۛ᩹") + i4) * 127;
                            i5 = ((iM3169 ^ i3) * (-17815)) ^ 574038252;
                            i = 2034887185;
                        } else {
                            iM3169 = C0619.m2761("֫ۚ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 9683) ^ 68784196;
                            i = -515232085;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1475506640:
                    case -908022540:
                        if (C3492.f12043 > 0) {
                            iM3169 = C0619.m2761("ۨۢ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 23635) ^ 914907531;
                            i = 1748704277;
                        } else {
                            iM3169 = C0619.m2761("ۨۡ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-15145)) ^ 947664692;
                            i = -1358806628;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1302144681:
                    case -577872150:
                        if (C1542.f5343 > 0) {
                            c14974 = new C14974();
                            itM13647 = C4282.m13647(m24135(abstractC4534));
                            iM3169 = C0773.m3169("᩹ۢ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 15735) ^ 1774695106;
                            i = 1211222240;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -648845299:
                    case 1788798192:
                        abstractC0726 = this.f29424;
                        if (C1321.m4852()) {
                            iM3169 = C0773.m3169("ܰۙ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-19369)) ^ 1590227418;
                            i = -442884281;
                        } else {
                            iM3169 = (C0773.m3169("ۛ᩹") + i4) * 127;
                            i5 = ((iM3169 ^ i3) * (-17815)) ^ 574038252;
                            i = 2034887185;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -606336740:
                    case 96804290:
                        C2310.m7813();
                        iM3169 = C0619.m2761("ۨۢ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 23635) ^ 914907531;
                        i = 1748704277;
                        i7 = iM3169 ^ i;
                        break;
                    case -309097556:
                    case 244072457:
                        if (C0773.m3161() != 0) {
                            iM3169 = C0619.m2761("ۨۡ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-15145)) ^ 947664692;
                            i = -1358806628;
                        } else {
                            iM3169 = (C0619.m2761("ۜۤ") ^ i4) * 13;
                            i5 = ((iM3169 ^ i3) * (-29425)) ^ 1440762861;
                            i = 1625046497;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -143526675:
                    case 1787072113:
                        if (C0269.f1558 > 0) {
                            iM3169 = C0619.m2761("ۨۡ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-15145)) ^ 947664692;
                            i = -1358806628;
                        } else {
                            iM3169 = (C0773.m3169("ۛ᩹") + i4) * 127;
                            i5 = ((iM3169 ^ i3) * (-17815)) ^ 574038252;
                            i = 2034887185;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 299403912:
                    case 716631634:
                        c14753 = new C14753();
                        c14753.m14256(c14974);
                        if (C2834.f9334 <= 0) {
                            iM3169 = C0619.m2761("ۨۢ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 23635) ^ 914907531;
                            i = 1748704277;
                        } else {
                            iM3169 = C0773.m3169("ܽۛ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-1093)) ^ (-669452122);
                            i = 823800725;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1022125840:
                    case 1146859304:
                        if (C1826.m6317(itM13647)) {
                            iM3169 = C0773.m3169("᩸ۢ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-17353)) ^ (-169471488);
                            i = 1855573616;
                        } else {
                            iM3169 = C0619.m2761("۟ᩳ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-6717)) ^ 2128636571;
                            i = 1583912287;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    default:
                        C0862.m3503();
                        if (C2485.m8357() > 0) {
                            iM3169 = C0619.m2761("ۨۢ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 23635) ^ 914907531;
                            i = 1748704277;
                        } else {
                            iM3169 = (C0773.m3169("ۙܽ") + i3) * 41;
                            i5 = ((iM3169 ^ i4) * (-11371)) ^ (-327115077);
                            i = -1677733750;
                        }
                        i7 = iM3169 ^ i;
                        break;
                }
                return;
            }
            iM2761 = (C0619.m2761("ۜ۟") + i4) * 101;
            i5 = ((iM2761 ^ i3) * (-5535)) ^ (-2135082986);
            i6 = 1990434845;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m24143(C9042 c9042, String str, LinearLayout linearLayout, C15688 c15688, LinearLayout linearLayout2) {
        boolean zContains = false;
        int i = 0;
        float f = 0.0f;
        int i2 = 2057525396;
        int i3 = C0773.f2792;
        int i4 = C2288.f7433;
        int iM3169 = (i3 - C0773.m3169("ۜܽ")) * (-91);
        int i5 = ((iM3169 ^ i4) * 28161) ^ 1004046983;
        int i6 = 31480154;
        while (true) {
            i2 = ((((i2 ^ i4) * (-15599)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2015847953:
                case 1700978969:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("۬ۚ") ^ i4) * 27;
                        i5 = ((iM3169 ^ i3) * (-29929)) ^ 1917455341;
                        i6 = -1876443547;
                    } else {
                        iM3169 = C0619.m2761("֡֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-26587)) ^ (-1374475600);
                        i6 = 77282662;
                    }
                    break;
                case -1986798052:
                case -1019584158:
                    C0487.m2356();
                    break;
                case -1927216446:
                case 864694950:
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0619.m2761("۬ۚ") ^ i4) * 27;
                        i5 = ((iM3169 ^ i3) * (-29929)) ^ 1917455341;
                        i6 = -1876443547;
                    } else {
                        iM3169 = (C0619.m2761("ۙᩳ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM3169 ^ i3) * (-7319)) ^ (-559281370);
                        i6 = -949718304;
                    }
                    break;
                case -1623502744:
                case 273398987:
                    f = 0.0f;
                    iM3169 = C0773.m3169("᩻ۨ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 25649) ^ 231686440;
                    i6 = -1632492251;
                    break;
                case -1572197033:
                case -1407337462:
                    zContains = c9042.f29426.contains(str);
                    if (zContains) {
                        iM3169 = C0773.m3169("ܶ֨") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-24511)) ^ 1384583165;
                        i6 = 1826729141;
                    } else {
                        iM3169 = (C0619.m2761("ۧܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM3169 ^ i4) * (-19193)) ^ (-1392017804);
                        i6 = -1653190260;
                    }
                    break;
                case -1426222004:
                case -848105968:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۤ᩺")) * (-123);
                        i5 = ((iM3169 ^ i3) * 30247) ^ 158508927;
                        i6 = 529702201;
                    } else {
                        iM3169 = (C0619.m2761("᩶ܽ") ^ i3) * 9;
                        i5 = ((iM3169 ^ i4) * (-27217)) ^ (-1900882268);
                        i6 = -1331563154;
                    }
                    break;
                case -1287471488:
                case 1075387826:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("۬ۚ") ^ i4) * 27;
                        i5 = ((iM3169 ^ i3) * (-29929)) ^ 1917455341;
                        i6 = -1876443547;
                    } else {
                        iM3169 = (C0619.m2761("֫ᩳ") ^ i3) * (-67);
                        i5 = ((iM3169 ^ i4) * (-26109)) ^ 1018862829;
                        i6 = 229180483;
                    }
                    break;
                case -1222202896:
                case 1537304089:
                    if (C2878.m9491() <= 0) {
                        iM3169 = (C0619.m2761("۬ۚ") ^ i4) * 27;
                        i5 = ((iM3169 ^ i3) * (-29929)) ^ 1917455341;
                        i6 = -1876443547;
                    } else {
                        iM3169 = (C0619.m2761("ۖܰ") + i3) * 67;
                        i5 = ((iM3169 ^ i4) * 7589) ^ 1916939866;
                        i6 = 1981886997;
                    }
                    break;
                case -1154081211:
                case -760507059:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩷") ^ i3) * (-63);
                        i5 = ((iM3169 ^ i4) * 24951) ^ 590621537;
                        i6 = 126609062;
                    } else {
                        iM3169 = C0619.m2761("ۘ֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-13679)) ^ (-655840021);
                        i6 = -1386876866;
                    }
                    break;
                case -1112073422:
                case 1189714979:
                    C2485.m8358(linearLayout, i);
                    if (zContains) {
                        iM3169 = (i3 - C0773.m3169("ۙۘ")) * 57;
                        i5 = ((iM3169 ^ i4) * 1029) ^ (-608243928);
                        i6 = -624283243;
                    } else {
                        iM3169 = C0619.m2761("۬ۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 28517) ^ (-1036292152);
                        i6 = -43406770;
                    }
                    break;
                case -823665404:
                case 1164951569:
                    C23916.m53419();
                    C4282.m13644();
                    iM3169 = (C0619.m2761("ۖܰ") + i3) * 67;
                    i5 = ((iM3169 ^ i4) * 7589) ^ 1916939866;
                    i6 = 1981886997;
                    break;
                case -821621072:
                case 1214537804:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩷") ^ i3) * (-63);
                        i5 = ((iM3169 ^ i4) * 24951) ^ 590621537;
                        i6 = 126609062;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-10185)) ^ (-1404372303);
                        i6 = -791367810;
                    }
                    break;
                case -585267161:
                case 2037106700:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i4 - C0619.m2761("ۤ᩺")) * (-123);
                        i5 = ((iM3169 ^ i3) * 30247) ^ 158508927;
                        i6 = 529702201;
                    } else {
                        iM3169 = C0619.m2761("᩵۠") ^ i3;
                        i5 = ((iM3169 ^ i4) * 31321) ^ 277910211;
                        i6 = 1092055300;
                    }
                    break;
                case -580325926:
                case 789911011:
                    C0487.m2356();
                    if (C0950.f3488 < 0) {
                        iM3169 = (C0619.m2761("᩶ܽ") ^ i3) * 9;
                        i5 = ((iM3169 ^ i4) * (-27217)) ^ (-1900882268);
                        i6 = -1331563154;
                    } else {
                        iM3169 = (C0619.m2761("۬ۚ") ^ i4) * 27;
                        i5 = ((iM3169 ^ i3) * (-29929)) ^ 1917455341;
                        i6 = -1876443547;
                    }
                    break;
                case -451579633:
                case 1724493339:
                    if (C1321.m4852()) {
                        iM3169 = (i3 - C0619.m2761("֫ܳ")) * 81;
                        i5 = ((iM3169 ^ i4) * (-27327)) ^ 307393348;
                        i6 = -119779244;
                    } else {
                        iM3169 = (C0619.m2761("۬ۚ") ^ i4) * 27;
                        i5 = ((iM3169 ^ i3) * (-29929)) ^ 1917455341;
                        i6 = -1876443547;
                    }
                    break;
                case -381061740:
                case 1478562320:
                    if (C1826.m6301() >= 0) {
                        iM3169 = (C0619.m2761("ۖܰ") + i3) * 67;
                        i5 = ((iM3169 ^ i4) * 7589) ^ 1916939866;
                        i6 = 1981886997;
                    } else {
                        iM3169 = C0619.m2761("ۡ֨") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27023) ^ (-526032714);
                        i6 = -1085311587;
                    }
                    break;
                case 225762995:
                case 232672382:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("᩶ܽ") ^ i3) * 9;
                        i5 = ((iM3169 ^ i4) * (-27217)) ^ (-1900882268);
                        i6 = -1331563154;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܿۤ")) * 3;
                        i5 = ((iM3169 ^ i3) * (-17403)) ^ 988683304;
                        i6 = 1143164679;
                    }
                    break;
                case 246640346:
                case 566578529:
                    i = 0;
                    iM3169 = (i3 - C0773.m3169("᩻ۧ")) * (-105);
                    i5 = ((iM3169 ^ i4) * 23759) ^ (-1697130037);
                    i6 = 1138954857;
                    break;
                case 629076738:
                case 1657860239:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩷") ^ i3) * (-63);
                        i5 = ((iM3169 ^ i4) * 24951) ^ 590621537;
                        i6 = 126609062;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܰۧ")) * 101;
                        i5 = ((iM3169 ^ i4) * (-20117)) ^ 849262281;
                        i6 = -782005010;
                    }
                    break;
                case 690645380:
                case 1607606831:
                    f = 90.0f;
                    iM3169 = C0773.m3169("᩻ۨ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 25649) ^ 231686440;
                    i6 = -1632492251;
                    break;
                case 778069890:
                case 1152266675:
                    i = 8;
                    iM3169 = (i3 - C0773.m3169("᩻ۧ")) * (-105);
                    i5 = ((iM3169 ^ i4) * 23759) ^ (-1697130037);
                    i6 = 1138954857;
                    break;
                default:
                    c15688.setRotation(f);
                    linearLayout2.setSelected(zContains);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m24135(AbstractC4534 abstractC4534) {
        int iM3169;
        int i;
        AbstractC4534 abstractC4534M14261 = null;
        int i2 = 430473420;
        int i3 = C1080.f3865;
        int i4 = C2419.f7754;
        int iM31610 = C0773.m3169("ܶܽ") ^ i4;
        int i5 = ((iM31610 ^ i3) * (-25423)) ^ (-103716711);
        int i6 = -776015883;
        while (true) {
            int i7 = iM31610 ^ i6;
            ArrayList arrayList = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-32315)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2147294601:
                    case -66188131:
                        if (abstractC4534M14261 != null) {
                            iM3169 = C0619.m2761("ۙ᩹") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-27063)) ^ 542732875;
                            i = -525255248;
                        } else {
                            iM3169 = C0773.m3169("ۚ᩹") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-10989)) ^ 72719;
                            i = 1211317613;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -2144526773:
                    case 1353744013:
                        C1826.m6301();
                        if (C1564.f5401 > 0) {
                            iM31610 = C0619.m2761("ۛ֨") ^ i4;
                            i5 = ((iM31610 ^ i3) * 23069) ^ (-911990472);
                            i6 = 508084528;
                        } else {
                            iM31610 = C0619.m2761("۬۠") ^ i3;
                            i5 = ((iM31610 ^ i4) * (-1201)) ^ (-1658025955);
                            i6 = 650029674;
                        }
                        break;
                    case -2061987201:
                    case -786050837:
                        C23916.m53419();
                        if (C4238.f15451 < 0) {
                            iM31610 = (C0773.m3169("ᩴ᩷") ^ i3) * (-65);
                            i5 = ((iM31610 ^ i4) * 6605) ^ 2143460565;
                            i6 = 467972696;
                        } else {
                            iM31610 = C0619.m2761("ۛ֨") ^ i4;
                            i5 = ((iM31610 ^ i3) * 23069) ^ (-911990472);
                            i6 = 508084528;
                        }
                        break;
                    case -1774200169:
                    case 565738588:
                        RunnableC0334.m2063();
                        if (C1343.f4799 == 0) {
                            iM31610 = C0619.m2761("۬۠") ^ i3;
                            i5 = ((iM31610 ^ i4) * (-1201)) ^ (-1658025955);
                            i6 = 650029674;
                        } else {
                            iM31610 = (C0773.m3169("ۛ۬") + i4) * (-63);
                            i5 = ((iM31610 ^ i3) * (-27715)) ^ 1295519412;
                            i6 = 1756099986;
                        }
                        break;
                    case -1069280712:
                    case -90422224:
                        return arrayList;
                    case -36167178:
                    case 722978593:
                        RunnableC3646.m11813();
                        C13473.m33144();
                        iM31610 = (C0773.m3169("ۛ۬") + i4) * (-63);
                        i5 = ((iM31610 ^ i3) * (-27715)) ^ 1295519412;
                        i6 = 1756099986;
                        break;
                    case 49982377:
                    case 689768922:
                        RunnableC1848.m6360();
                        return null;
                    case 1003980184:
                    case 1745906913:
                        C1519.m5406(arrayList, abstractC4534M14261);
                        abstractC4534M14261 = abstractC4534M14261.m14261();
                        iM3169 = C0619.m2761("֨᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 1885) ^ (-622144601);
                        i = 1533312332;
                        i7 = iM3169 ^ i;
                        break;
                    default:
                        if (C23916.f77426 <= 0) {
                            iM31610 = C0619.m2761("۬۠") ^ i3;
                            i5 = ((iM31610 ^ i4) * (-1201)) ^ (-1658025955);
                            i6 = 650029674;
                        } else {
                            if (C2419.f7754 < 0 && C0862.f3233 == 0) {
                                if (C0950.f3488 < 0) {
                                    if (C3779.f12953 <= 0) {
                                        iM31610 = C0619.m2761("ۛ֨") ^ i4;
                                        i5 = ((iM31610 ^ i3) * 23069) ^ (-911990472);
                                        i6 = 508084528;
                                    } else if (RunnableC3055.f9898 < 0) {
                                        if (C2485.f7950 != 0) {
                                            iM31610 = (C0773.m3169("ۛ۬") + i4) * (-63);
                                            i5 = ((iM31610 ^ i3) * (-27715)) ^ 1295519412;
                                            i6 = 1756099986;
                                        } else if (C1542.m5459() < 0) {
                                            if (C2834.f9334 > 0) {
                                                if (C2310.f7472 < 0) {
                                                    arrayList = new ArrayList();
                                                    abstractC4534M14261 = abstractC4534.m14254();
                                                    iM3169 = C0619.m2761("֨᩻") ^ i3;
                                                    i5 = ((iM3169 ^ i4) * 1885) ^ (-622144601);
                                                    i = 1533312332;
                                                    i7 = iM3169 ^ i;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                iM31610 = (C0773.m3169("ᩴ᩷") ^ i3) * (-65);
                                i5 = ((iM31610 ^ i4) * 6605) ^ 2143460565;
                                i6 = 467972696;
                            }
                            iM31610 = C0619.m2761("ܿ֫") ^ i4;
                            i5 = ((iM31610 ^ i3) * 5541) ^ (-1396966862);
                            i6 = 225424825;
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0149 A[PHI: r1 r7
      0x0149: PHI (r1v5 int) = (r1v2 int), (r1v2 int), (r1v4 int), (r1v2 int), (r1v2 int) binds: [B:51:0x0147, B:31:0x009b, B:27:0x007f, B:13:0x003a, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r7v8 android.widget.LinearLayout$LayoutParams) = 
      (r7v4 android.widget.LinearLayout$LayoutParams)
      (r7v4 android.widget.LinearLayout$LayoutParams)
      (r7v5 android.widget.LinearLayout$LayoutParams)
      (r7v4 android.widget.LinearLayout$LayoutParams)
      (r7v4 android.widget.LinearLayout$LayoutParams)
     binds: [B:51:0x0147, B:31:0x009b, B:27:0x007f, B:13:0x003a, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24136(LinearLayout linearLayout, View view, int i) {
        int iM2761;
        int i2;
        int iM8177 = 0;
        int i3 = 626205490;
        int i4 = C0773.f2792;
        int i5 = C2288.f7433;
        int iM2762 = C0619.m2761("۟ۗ") ^ i4;
        int i6 = ((iM2762 ^ i5) * 31819) ^ (-319471243);
        int i7 = 1478106821;
        while (true) {
            int i8 = iM2762 ^ i7;
            LinearLayout.LayoutParams layoutParams = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-12711)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2006043268:
                    case 1994507842:
                        if (C13473.f42873 != 0) {
                            iM2761 = C0619.m2761("ܽ֡") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-29791)) ^ 963083112;
                            i2 = 421367898;
                        } else {
                            iM2761 = (C0619.m2761("ۤۡ") ^ i4) * (-109);
                            i6 = ((iM2761 ^ i5) * 20459) ^ 1760856894;
                            i2 = -509689255;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1917897972:
                    case 1635900107:
                        if (C4282.f15546 <= 0) {
                            iM2761 = C0619.m2761("ܽ֡") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-29791)) ^ 963083112;
                            i2 = 421367898;
                        } else {
                            iM2761 = C0619.m2761("ܺ۟") ^ i5;
                            i6 = ((iM2761 ^ i4) * 15355) ^ 359879306;
                            i2 = 1581133388;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1904221227:
                    case 1013772276:
                        C3033.m9845();
                        if (C2419.f7754 < 0) {
                            iM2761 = C0619.m2761("۫ܺ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 18991) ^ 816981024;
                            i2 = -698815034;
                        } else {
                            iM2761 = C0619.m2761("ܽ֡") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-29791)) ^ 963083112;
                            i2 = 421367898;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1530509120:
                    case -1488039851:
                        RunnableC1848.m6360();
                        C0862.m3503();
                        break;
                    case -1443282783:
                    case -915018732:
                        if (C3734.f12817 >= 0) {
                            iM2761 = C0773.m3169("ܳ۟") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-31531)) ^ 1013740191;
                            i2 = -13521495;
                        } else {
                            iM2761 = C0619.m2761("ۗܺ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-17959)) ^ (-1596628059);
                            i2 = -1858072948;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1320904880:
                    case -739437595:
                        if (C4282.f15546 <= 0 || C1826.f6190 <= 0) {
                            iM2762 = C0773.m3169("ۘ᩻") ^ i5;
                            i6 = ((iM2762 ^ i4) * 25175) ^ (-1468735599);
                            i7 = -452802443;
                        } else {
                            layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            iM8177 = C2419.m8177(i);
                            if (C20932.f66974 <= 0) {
                                iM2761 = C0619.m2761("ܽ֡") ^ i5;
                                i6 = ((iM2761 ^ i4) * (-29791)) ^ 963083112;
                                i2 = 421367898;
                            } else {
                                iM2761 = (C0619.m2761("ۜᩴ") ^ i5) * 79;
                                i6 = ((iM2761 ^ i4) * (-23027)) ^ (-1077450383);
                                i2 = 1624740661;
                            }
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case -1108470373:
                    case 2068795651:
                        C0862.m3503();
                        C4282.m13644();
                        iM2761 = C0619.m2761("۫ܺ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 18991) ^ 816981024;
                        i2 = -698815034;
                        i8 = iM2761 ^ i2;
                        break;
                    case -927727755:
                    case 928800382:
                        layoutParams.topMargin = iM8177;
                        C11471 c11471 = C11471.f36082;
                        C2375.m8066(linearLayout, view, layoutParams);
                        break;
                    case -683004120:
                    case -216862062:
                        if (C0619.f2439) {
                            iM2761 = C0619.m2761("ܺ۟") ^ i5;
                            i6 = ((iM2761 ^ i4) * 15355) ^ 359879306;
                            i2 = 1581133388;
                        } else {
                            iM2761 = (i4 - C0619.m2761("۠᩺")) * (-93);
                            i6 = ((iM2761 ^ i5) * (-29731)) ^ (-1857159092);
                            i2 = 1357594999;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case 204371194:
                    case 1639078182:
                        if (C2375.f7641 <= 0) {
                            iM2761 = C0619.m2761("ܺ۟") ^ i5;
                            i6 = ((iM2761 ^ i4) * 15355) ^ 359879306;
                            i2 = 1581133388;
                        } else {
                            iM2761 = (i5 - C0619.m2761("ۢ᩸")) * 23;
                            i6 = ((iM2761 ^ i4) * 15609) ^ 1223694236;
                            i2 = -60040887;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case 673903292:
                    case 689972328:
                        if (C3734.f12817 >= 0) {
                            iM2761 = C0619.m2761("۫ܺ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 18991) ^ 816981024;
                            i2 = -698815034;
                        } else {
                            iM2761 = C0619.m2761("ۗۚ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 2927) ^ (-320191801);
                            i2 = -84895946;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case 710379489:
                    case 1728546149:
                        if (C2878.f9462) {
                            iM2761 = C0619.m2761("ܽ֡") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-29791)) ^ 963083112;
                            i2 = 421367898;
                        } else {
                            iM2761 = (C0619.m2761("᩸ۖ") + i4) * 73;
                            i6 = ((iM2761 ^ i5) * (-3747)) ^ (-1388017041);
                            i2 = 2036972011;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case 713342388:
                    case 1031926821:
                        if (C0487.f2131 <= 0) {
                            iM2761 = C0619.m2761("ܺ۟") ^ i5;
                            i6 = ((iM2761 ^ i4) * 15355) ^ 359879306;
                            i2 = 1581133388;
                        } else {
                            iM2761 = (C0619.m2761("ۜ᩺") + i5) * (-65);
                            i6 = ((iM2761 ^ i4) * (-28753)) ^ 1959250256;
                            i2 = 582012196;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    default:
                        if (C2419.m8174() >= 0) {
                            iM2761 = C0619.m2761("ܺ۟") ^ i5;
                            i6 = ((iM2761 ^ i4) * 15355) ^ 359879306;
                            i2 = 1581133388;
                        } else {
                            iM2761 = C0773.m3169("ܳ۟") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-31531)) ^ 1013740191;
                            i2 = -13521495;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                }
                return;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 99581. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m24137(android.widget.LinearLayout r78, java.lang.String r79) {
        /*
            Method dump skipped, instruction units count: 9958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9042.m24137(android.widget.LinearLayout, java.lang.String):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 70261. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m24138(android.widget.LinearLayout r71, java.util.List r72, java.lang.String r73, int r74) {
        /*
            Method dump skipped, instruction units count: 7026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9042.m24138(android.widget.LinearLayout, java.util.List, java.lang.String, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a8 A[PHI: r2
      0x01a8: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:52:0x018e, B:47:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6 A[PHI: r7
      0x01c6: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:56:0x01c4, B:47:0x0167, B:29:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x024d A[PHI: r14
      0x024d: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:67:0x024b, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02e5 A[PHI: r8 r9 r10 r22
      0x02e5: PHI (r8v3 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v4 short[]) binds: [B:83:0x02e3, B:75:0x02a6, B:41:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:83:0x02e3, B:75:0x02a6, B:41:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:83:0x02e3, B:75:0x02a6, B:41:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r22v5 short) = (r22v3 short), (r22v4 short), (r22v3 short) binds: [B:83:0x02e3, B:75:0x02a6, B:41:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x032f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0364  */
    /* JADX WARN: Code duplicated, block: B:97:0x0398 A[PHI: r12 r13 r16 r17
      0x0398: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:96:0x0396, B:79:0x02c5, B:71:0x0283, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0398: PHI (r13v4 short) = (r13v2 short), (r13v2 short), (r13v3 short), (r13v2 short) binds: [B:96:0x0396, B:79:0x02c5, B:71:0x0283, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0398: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:96:0x0396, B:79:0x02c5, B:71:0x0283, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0398: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:96:0x0396, B:79:0x02c5, B:71:0x0283, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m24142(String str) {
        int iM2761;
        int i;
        int i2;
        int i3 = C23916.f77426;
        int i4 = C1783.f6087;
        int iM2762 = (C0619.m2761("ۡۘ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i5 = ((iM2762 ^ i4) * 21221) ^ (-1139090157);
        String strM2820 = null;
        String str2 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ (-974474689);
        int i7 = 0;
        int iM9671 = 0;
        int i8 = 0;
        int iM10045 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        int i13 = 546569908;
        short s3 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-19879)) >> 31));
            switch (i13) {
                case -2126006639:
                case 701566384:
                    C1826.m6301();
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ܳܽ") ^ i4;
                        i = ((iM2761 ^ i3) * 6665) ^ 932686831;
                        i2 = -208520774;
                    } else {
                        iM2761 = (C0619.m2761("ܿܿ") ^ i4) * 57;
                        i = ((iM2761 ^ i3) * 15145) ^ (-1196793917);
                        i2 = -1382378698;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2111675652:
                case -1342144604:
                    if (C3077.m10045(str) == 0) {
                        iM2761 = C0619.m2761("ۗ֡") ^ i4;
                        i = ((iM2761 ^ i3) * (-23795)) ^ 141512612;
                        i2 = 1545210042;
                    } else {
                        iM2761 = C0619.m2761("᩵᩷") ^ i4;
                        i = ((iM2761 ^ i3) * (-5159)) ^ (-301418239);
                        i2 = 781194750;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2026162858:
                case 601823321:
                    if (C1343.m4937(str, i8) == C1343.m4937(str, i7)) {
                        iM2761 = C0619.m2761("ۤܶ") ^ i4;
                        i = ((iM2761 ^ i3) * (-1771)) ^ 1984538070;
                        i2 = 1725753355;
                    } else {
                        iM2761 = C0619.m2761("ܺܿ") ^ i3;
                        i = ((iM2761 ^ i4) * (-3693)) ^ 1454803474;
                        i2 = -1405706020;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1949518394:
                case 1396396722:
                    if (C4282.m13656(str, i7) != '~') {
                        iM2761 = C0619.m2761("ۗ֡") ^ i4;
                        i = ((iM2761 ^ i3) * (-23795)) ^ 141512612;
                        i2 = 1545210042;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܰ᩷")) * (-35);
                        i = ((iM2761 ^ i4) * 25793) ^ 1680121130;
                        i2 = 465458789;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1901822702:
                case -78787428:
                    String strM11770 = AbstractC3624.m11770(str, i7, iM10045);
                    C0269.m1781(strM11770, strM2820);
                    return strM11770;
                case -1883346070:
                case -912445628:
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0619.m2761("ܿܿ") ^ i4) * 57;
                        i = ((iM2761 ^ i3) * 15145) ^ (-1196793917);
                        i2 = -1382378698;
                    } else {
                        iM2761 = (C0619.m2761("ܳܶ") ^ i4) * (-47);
                        i = ((iM2761 ^ i3) * (-12429)) ^ (-1246385348);
                        i2 = 1622524676;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1816715075:
                case 2055784009:
                    i12 = 9302;
                    iM2761 = C0773.m3169("۫֫") ^ i3;
                    i = ((iM2761 ^ i4) * 10579) ^ 469629848;
                    i2 = -1195250358;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1768452801:
                case -455212678:
                    if (i10 - (i11 * i11) <= 0) {
                        iM2761 = (C0773.m3169("᩺᩻") ^ i4) * 93;
                        i = ((iM2761 ^ i3) * (-4895)) ^ (-2021767329);
                        i2 = 1359131923;
                    } else {
                        iM2761 = C0773.m3169("ۤ᩹") ^ i4;
                        i = ((iM2761 ^ i3) * (-20953)) ^ (-80102617);
                        i2 = -645678754;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1764420593:
                case -442675422:
                    String strM11771 = AbstractC3624.m11770(str, i7, i8);
                    C2310.m7811(strM11771, strM2820);
                    str2 = strM11771;
                    iM2761 = C0619.m2761("ᩴۧ") ^ i3;
                    i = ((iM2761 ^ i4) * (-27331)) ^ (-1132708368);
                    i2 = 1867069137;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1653019268:
                case -106942290:
                    i11 = s + s2;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("ۚܳ") + i3) * (-105);
                        i = ((iM2761 ^ i4) * 23835) ^ 570652007;
                        i2 = 752938389;
                    } else {
                        iM2761 = (C0619.m2761("᩵ᩳ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i4) * 2747) ^ (-2125630657);
                        i2 = 1425387330;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1604298077:
                case -1392890453:
                    sArr2 = f29422;
                    i9 = 86;
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ۚ֫") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i3) * (-18459)) ^ (-1966820346);
                        i2 = 769014845;
                    } else {
                        iM2761 = (C0773.m3169("֫ۚ") ^ i4) * 81;
                        i = ((iM2761 ^ i3) * 7155) ^ (-2054054664);
                        i2 = 454418590;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1571679806:
                case 1654197833:
                    s = sArr[c];
                    s3 = 65268;
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0773.m3169("ۚ֫") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i3) * (-18459)) ^ (-1966820346);
                        i2 = 769014845;
                    } else {
                        iM2761 = C0773.m3169("ۖ֫") ^ i4;
                        i = ((iM2761 ^ i3) * (-31133)) ^ (-1221221580);
                        i2 = 1317737247;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1492408984:
                case -320680582:
                    i12 = 60906;
                    iM2761 = C0773.m3169("۫֫") ^ i3;
                    i = ((iM2761 ^ i4) * 10579) ^ 469629848;
                    i2 = -1195250358;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1349267389:
                case 1437163444:
                    iM10045 = C3077.m10045(str2);
                    if (iM10045 >= 3) {
                        iM2761 = C0773.m3169("ۗܽ") ^ i4;
                        i = ((iM2761 ^ i3) * (-8157)) ^ 79083964;
                        i2 = -997142622;
                    } else {
                        iM2761 = C0619.m2761("ۗ֡") ^ i4;
                        i = ((iM2761 ^ i3) * (-23795)) ^ 141512612;
                        i2 = 1545210042;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1244742919:
                case -390860458:
                    iM9671 = C2966.m9671(str);
                    i8 = 0;
                    iM2761 = C0773.m3169("ۚۚ") ^ i3;
                    i = ((iM2761 ^ i4) * (-26331)) ^ 2131091112;
                    i2 = -1776704131;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1180256730:
                case 1843322259:
                    C1564.m5509();
                    C3077.m10041();
                    iM2761 = (i3 - C0619.m2761("᩺ܺ")) * 47;
                    i = ((iM2761 ^ i4) * (-9787)) ^ (-1645245412);
                    i2 = -752987842;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1137932839:
                case 1688679082:
                    i7 = 0;
                    if (C1343.m4937(str, 0) != '`') {
                        iM2761 = (i3 - C0773.m3169("ۧۜ")) * (-119);
                        i = ((iM2761 ^ i4) * (-29821)) ^ 231301833;
                        i2 = 729184655;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܰ᩷")) * (-35);
                        i = ((iM2761 ^ i4) * 25793) ^ 1680121130;
                        i2 = 465458789;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -707550605:
                case 1216822896:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ܳܽ") ^ i4;
                        i = ((iM2761 ^ i3) * 6665) ^ 932686831;
                        i2 = -208520774;
                    } else {
                        iM2761 = (C0773.m3169("ۚܳ") + i3) * (-105);
                        i = ((iM2761 ^ i4) * 23835) ^ 570652007;
                        i2 = 752938389;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -619178781:
                case 673788368:
                    C2310.m7813();
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩺ܺ")) * 47;
                        i = ((iM2761 ^ i4) * (-9787)) ^ (-1645245412);
                        i2 = -752987842;
                    } else {
                        iM2761 = (C0773.m3169("֫ܽ") ^ i3) * 89;
                        i = ((iM2761 ^ i4) * 18421) ^ 1741572057;
                        i2 = 834503092;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -259456482:
                case -192395220:
                    C1783.m6232();
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩺ܺ")) * 47;
                        i = ((iM2761 ^ i4) * (-9787)) ^ (-1645245412);
                        i2 = -752987842;
                    } else {
                        iM2761 = C0619.m2761("ܳܽ") ^ i4;
                        i = ((iM2761 ^ i3) * 6665) ^ 932686831;
                        i2 = -208520774;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 13039203:
                case 753425711:
                    i8++;
                    iM2761 = C0773.m3169("ۚۚ") ^ i3;
                    i = ((iM2761 ^ i4) * (-26331)) ^ 2131091112;
                    i2 = -1776704131;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 15491233:
                case 1331292276:
                    if (RunnableC3646.f12471) {
                        iM2761 = (i3 - C0619.m2761("᩺ܺ")) * 47;
                        i = ((iM2761 ^ i4) * (-9787)) ^ (-1645245412);
                        i2 = -752987842;
                    } else {
                        iM2761 = (C0619.m2761("ۙ᩺") + i4) * (-119);
                        i = ((iM2761 ^ i3) * (-1621)) ^ (-1316978653);
                        i2 = 1954427405;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 79668092:
                case 1934648823:
                    i10 = s * s3;
                    s2 = 16317;
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("֫ܽ") ^ i3) * 89;
                        i = ((iM2761 ^ i4) * 18421) ^ 1741572057;
                        i2 = 834503092;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۖۢ")) * 19;
                        i = ((iM2761 ^ i4) * (-27889)) ^ (-534760278);
                        i2 = -1485912496;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 275014086:
                case 501187006:
                    sArr = f29422;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("֫ܽ") ^ i3) * 89;
                        i = ((iM2761 ^ i4) * 18421) ^ 1741572057;
                        i2 = 834503092;
                    } else {
                        iM2761 = (C0619.m2761("ۢᩴ") + i3) * (-17);
                        i = ((iM2761 ^ i4) * 14927) ^ 143766108;
                        i2 = -548755108;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 372160742:
                case 1400363008:
                    return null;
                case 473564596:
                case 1844766148:
                    C0487.m2356();
                    return null;
                case 553030329:
                case 645729440:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ۚ֫") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i3) * (-18459)) ^ (-1966820346);
                        i2 = 769014845;
                    } else {
                        iM2761 = C0619.m2761("ᩴܽ") ^ i3;
                        i = ((iM2761 ^ i4) * 4221) ^ 2013782034;
                        i2 = 2143487940;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1159950107:
                case 1790160396:
                    c = 'U';
                    if (C3998.m12920()) {
                        iM2761 = (C0619.m2761("ۤᩴ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2761 ^ i3) * 16413) ^ (-949923881);
                        i2 = -1888478888;
                    } else {
                        iM2761 = (C0773.m3169("֫ܽ") ^ i3) * 89;
                        i = ((iM2761 ^ i4) * 18421) ^ 1741572057;
                        i2 = 834503092;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1638880727:
                case 1955685250:
                    strM2820 = AbstractC0641.m2820(sArr2, i9, 14, i12);
                    if (i8 < iM9671) {
                        iM2761 = (C0773.m3169("ۢᩳ") ^ i4) * (-13);
                        i = ((iM2761 ^ i3) * 5667) ^ 1285165590;
                        i2 = -1133640365;
                    } else {
                        str2 = str;
                        iM2761 = C0619.m2761("ᩴۧ") ^ i3;
                        i = ((iM2761 ^ i4) * (-27331)) ^ (-1132708368);
                        i2 = 1867069137;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("ܿܿ") ^ i4) * 57;
                        i = ((iM2761 ^ i3) * 15145) ^ (-1196793917);
                        i2 = -1382378698;
                    } else {
                        iM2761 = (C0619.m2761("ۖۜ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i4) * 16311) ^ (-541269273);
                        i2 = -1858587203;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
