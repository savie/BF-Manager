package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G2S4 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC18784 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۢۗܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f61003 = {7564, -13431, -15512, 8596, -13783, -12732, -5173, -7129, -6381, -10683, 12618, -10289, -7400, -15366, -8191, -6673};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f61004;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f61005;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11192 f61006;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f61007;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0885 f61008;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f61009;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:33:0x0115 A[PHI: r13 r14 r15
      0x0115: PHI (r13v5 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:32:0x0113, B:12:0x007f, B:81:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r14v5 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:32:0x0113, B:12:0x007f, B:81:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r15v5 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:32:0x0113, B:12:0x007f, B:81:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01c8 A[PHI: r8 r9 r18
      0x01c8: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:48:0x01c6, B:40:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:48:0x01c6, B:40:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r18v9 android.view.View) = (r18v8 android.view.View), (r18v7 android.view.View) binds: [B:48:0x01c6, B:40:0x017b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0205 A[PHI: r5 r7
      0x0205: PHI (r5v5 android.widget.TextView) = (r5v2 android.widget.TextView), (r5v4 android.widget.TextView), (r5v2 android.widget.TextView) binds: [B:52:0x0203, B:28:0x00f1, B:82:0x0205] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:52:0x0203, B:28:0x00f1, B:82:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x023e A[PHI: r12 r19
      0x023e: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:56:0x023c, B:44:0x019f, B:36:0x0151, B:12:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r19v6 android.view.View) = (r19v5 android.view.View), (r19v4 android.view.View), (r19v4 android.view.View), (r19v4 android.view.View) binds: [B:56:0x023c, B:44:0x019f, B:36:0x0151, B:12:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC18784(ActivityC0885 activityC0885, View view) {
        int iM3169;
        int i;
        int iM31610;
        int iM2761;
        int i2;
        int i3;
        super(view);
        int i4 = C1080.f3865;
        int i5 = C2834.f9334;
        short s = f61003[0];
        int i6 = (s * 2) + 1;
        int i7 = s + 1;
        int i8 = (i7 * i7) - i6 < 0 ? 36133 : 45723;
        this.f61008 = activityC0885;
        int iM2762 = (i5 - C0619.m2761("᩶֡")) * (-111);
        int i9 = ((iM2762 ^ i4) * 7995) ^ 2122719805;
        int i10 = iM2762 ^ 1777824886;
        String strM7803 = null;
        short[] sArr = null;
        int i11 = 0;
        TextView textView = null;
        int iM31611 = 0;
        int i12 = 0;
        int iM31612 = 0;
        int i13 = 0;
        int i14 = 0;
        View viewM9333 = null;
        View viewM9334 = null;
        int i15 = 889895702;
        short[] sArr2 = null;
        int i16 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i4) * 25883) >> 31));
            switch (i15) {
                case -1954479226:
                case -10095616:
                    this.f61009 = (ImageView) viewM9334;
                    strM7803 = C2310.m7803(f61003, 4, 3, i8);
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("۬᩵") + i4) * (-61);
                        i9 = ((iM3169 ^ i5) * 32391) ^ (-268754213);
                        i = -1470051895;
                    } else {
                        iM3169 = (C0619.m2761("ۡ᩵") ^ i4) * 61;
                        i9 = ((iM3169 ^ i5) * 24343) ^ (-108818342);
                        i = -2072011845;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case -1858549996:
                case 359738503:
                    this.f61005 = (TextView) C2834.m9333(view, iM31611 ^ i12);
                    if (C1564.m5509() <= 0) {
                        iM3169 = C0619.m2761("ۨܶ") ^ i4;
                        i9 = ((iM3169 ^ i5) * (-4859)) ^ (-168631895);
                        i = -1936929781;
                    } else {
                        iM3169 = (C0619.m2761("۠ᩳ") + i4) * (-51);
                        i9 = ((iM3169 ^ i5) * (-30261)) ^ (-161378955);
                        i = 1086741203;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case -1516858695:
                case 1987177676:
                    this.f61007 = textView;
                    iM31612 = C0773.m3169(AbstractC3624.m11769(f61003, 13, 3, i8));
                    i16 = 2126115920;
                    if (C2834.f9334 > 0) {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i5;
                        i9 = ((iM3169 ^ i4) * (-16397)) ^ (-378318655);
                        i = 1766133648;
                        i10 = iM3169 ^ i;
                    } else {
                        iM31610 = i11;
                        iM2761 = (C0773.m3169("ۨۜ") + i5) * (-93);
                        i2 = ((iM2761 ^ i4) * 27413) ^ (-1354335133);
                        i3 = 1944839752;
                        i11 = iM31610;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -1120841071:
                case -913886269:
                    iM31610 = C0773.m3169(C2023.m6966(f61003, 1, 3, i8));
                    if (C1542.m5459() >= 0) {
                        iM2761 = (C0773.m3169("ۨۜ") + i5) * (-93);
                        i2 = ((iM2761 ^ i4) * 27413) ^ (-1354335133);
                        i3 = 1944839752;
                    } else {
                        iM2761 = C0619.m2761("ۡۖ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 9063) ^ (-1290246970);
                        i3 = 647893565;
                    }
                    i11 = iM31610;
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                case -1051602870:
                case 1474971565:
                    C2310.m7813();
                    if (!RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ۙ۬") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i4) * (-18467)) ^ 954486523;
                        i = 1777990015;
                        i10 = iM3169 ^ i;
                    } else {
                        iM31610 = i11;
                        iM2761 = (C0773.m3169("ۨۜ") + i5) * (-93);
                        i2 = ((iM2761 ^ i4) * 27413) ^ (-1354335133);
                        i3 = 1944839752;
                        i11 = iM31610;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -1023037097:
                case -566447255:
                    viewM9333 = C2834.m9333(view, C0619.m2761(strM7803) ^ 2128513031);
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ۗۙ") + i4) * (-73);
                        i9 = ((iM3169 ^ i5) * 1275) ^ 1087725511;
                        i = -2118990860;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩸") ^ i5;
                        i9 = ((iM3169 ^ i4) * 20151) ^ (-1366209524);
                        i = 1776544924;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case -995600355:
                case 911954311:
                    textView = (TextView) C3448.m11246(view, C0773.m3169(C0773.m3166(sArr, i13, i14, i8)) ^ 2129750790);
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("۬᩵") + i4) * (-61);
                        i9 = ((iM3169 ^ i5) * 32391) ^ (-268754213);
                        i = -1470051895;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۨۗ")) * (-49);
                        i9 = ((iM3169 ^ i5) * 31373) ^ (-1994918866);
                        i = 2011319195;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case -966971436:
                case 268636762:
                    C1519.m5403();
                    AbstractC0116.m1243();
                    iM31610 = i11;
                    iM2761 = (C0773.m3169("ۨۜ") + i5) * (-93);
                    i2 = ((iM2761 ^ i4) * 27413) ^ (-1354335133);
                    i3 = 1944839752;
                    i11 = iM31610;
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                case -873801986:
                case 648722381:
                    this.f61004 = (TextView) viewM9333;
                    sArr2 = f61003;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ۨܶ") ^ i4;
                        i9 = ((iM3169 ^ i5) * (-4859)) ^ (-168631895);
                        i = -1936929781;
                    } else {
                        iM3169 = C0619.m2761("ۢۡ") ^ i4;
                        i9 = ((iM3169 ^ i5) * 24673) ^ (-33841387);
                        i = -762226014;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case -831877851:
                case 1775729656:
                    viewM9334 = C2834.m9333(view, i11 ^ 2128535192);
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ۨܶ") ^ i4;
                        i9 = ((iM3169 ^ i5) * (-4859)) ^ (-168631895);
                        i = -1936929781;
                    } else {
                        iM3169 = C0773.m3169("᩷ᩴ") ^ i4;
                        i9 = ((iM3169 ^ i5) * 31491) ^ 1089988393;
                        i = 1357126579;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case -299889006:
                case 199713575:
                    if (C2834.f9334 > 0) {
                        iM3169 = (C0619.m2761("ۙ۬") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i4) * (-18467)) ^ 954486523;
                        i = 1777990015;
                    } else {
                        iM3169 = C0619.m2761("ۨܶ") ^ i4;
                        i9 = ((iM3169 ^ i5) * (-4859)) ^ (-168631895);
                        i = -1936929781;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case 145561906:
                case 2012989624:
                    C1343.m4943();
                    if (!C0619.m2763()) {
                        iM3169 = (C0619.m2761("۬᩵") + i4) * (-61);
                        i9 = ((iM3169 ^ i5) * 32391) ^ (-268754213);
                        i = -1470051895;
                        i10 = iM3169 ^ i;
                    } else {
                        iM31610 = i11;
                        iM2761 = (C0773.m3169("ۨۜ") + i5) * (-93);
                        i2 = ((iM2761 ^ i4) * 27413) ^ (-1354335133);
                        i3 = 1944839752;
                        i11 = iM31610;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    }
                    break;
                case 167235701:
                case 696635079:
                    iM31611 = C0773.m3169(C3734.m12149(sArr2, 7, 3, i8));
                    i12 = 2119851739;
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ۗۙ") + i4) * (-73);
                        i9 = ((iM3169 ^ i5) * 1275) ^ 1087725511;
                        i = -2118990860;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۧ") ^ i5) * (-45);
                        i9 = ((iM3169 ^ i4) * (-30253)) ^ (-394062037);
                        i = -1629735788;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case 178958252:
                case 1068749596:
                    sArr = f61003;
                    i13 = 10;
                    i14 = 3;
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("ۙ۬") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM3169 ^ i4) * (-18467)) ^ 954486523;
                        i = 1777990015;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ۡۗ")) * (-39);
                        i9 = ((iM3169 ^ i4) * 20549) ^ (-911953328);
                        i = 793676983;
                    }
                    i10 = iM3169 ^ i;
                    break;
                case 638337081:
                case 2083809099:
                    C13473.m33140((Button) C3448.m11246(view, iM31612 ^ i16), 8);
                    C11235.m28299(view, this);
                    return;
                default:
                    RunnableC3646.m11813();
                    throw new RuntimeException();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C11192 c11192 = null;
        String strM47852 = null;
        ImageView imageView = null;
        Drawable drawable = null;
        boolean z = false;
        ActivityC0885 activityC0885 = null;
        int i = -1513061581;
        int i2 = C1564.f5401;
        int i3 = C1321.f4751;
        int iM2761 = (i3 - C0619.m2761("۬ۖ")) * (-119);
        int i4 = ((iM2761 ^ i2) * (-16263)) ^ (-739870560);
        int i5 = -1053713545;
        while (true) {
            i = ((((i ^ i2) * (-30755)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2143293598:
                case -899111445:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("ۨ۫") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * (-5441)) ^ 695881817;
                        i5 = 993862995;
                    } else {
                        iM2761 = C0619.m2761("ۗۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17889) ^ 802521965;
                        i5 = 614043051;
                    }
                    break;
                case -1754739209:
                case -877688160:
                    C2702.m8876();
                    AbstractC0116.m1243();
                    iM2761 = C0619.m2761("ܺ۠") ^ i2;
                    i4 = ((iM2761 ^ i3) * 11877) ^ 545264506;
                    i5 = -1842429465;
                    break;
                case -1642945599:
                case -169790111:
                    strM47852 = C20932.m47852(c11192);
                    imageView = this.f61009;
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("᩷ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26023)) ^ 1197053848;
                        i5 = 837452088;
                    } else {
                        iM2761 = (C0619.m2761("ܽ֫") ^ i2) * (-11);
                        i4 = ((iM2761 ^ i3) * (-30557)) ^ 160997035;
                        i5 = -1083201555;
                    }
                    break;
                case -1590093561:
                case -923459013:
                    if (C2310.m7813() <= 0) {
                        iM2761 = (C0773.m3169("֡ۛ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 13153) ^ 1244448347;
                        i5 = -2033712225;
                    } else {
                        iM2761 = (C0619.m2761("᩶۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i3) * 22135) ^ 192900577;
                        i5 = 45164534;
                    }
                    break;
                case -1171587661:
                case 1266572052:
                    if (C0862.f3233 == 0) {
                        iM2761 = (C0773.m3169("ۨ۫") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * (-5441)) ^ 695881817;
                        i5 = 993862995;
                    } else {
                        iM2761 = (C0773.m3169("֡ۛ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 13153) ^ 1244448347;
                        i5 = -2033712225;
                    }
                    break;
                case -1140603273:
                case 1124472528:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("֡ۛ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 13153) ^ 1244448347;
                        i5 = -2033712225;
                    } else {
                        iM2761 = (C0619.m2761("᩻ۙ") + i3) * (-85);
                        i4 = ((iM2761 ^ i2) * 4169) ^ 1313388237;
                        i5 = 1760306694;
                    }
                    break;
                case -1012098787:
                case 1578022653:
                    if (C0619.m2763()) {
                        iM2761 = C0619.m2761("ܺ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11877) ^ 545264506;
                        i5 = -1842429465;
                    } else {
                        iM2761 = C0619.m2761("ۢۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4591)) ^ 1944840708;
                        i5 = -1724222260;
                    }
                    break;
                case -960049131:
                case -202646920:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ܺ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11877) ^ 545264506;
                        i5 = -1842429465;
                    } else {
                        iM2761 = C0773.m3169("ܽۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32287) ^ (-68082369);
                        i5 = 487695132;
                    }
                    break;
                case -390478158:
                case 1663130606:
                    C1542.m5459();
                    break;
                case -280627100:
                case 1736877457:
                    c11192 = this.f61006;
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0619.m2761("ܺ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11877) ^ 545264506;
                        i5 = -1842429465;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۠۟")) * (-115);
                        i4 = ((iM2761 ^ i2) * 25193) ^ (-1703751113);
                        i5 = -598255059;
                    }
                    break;
                case 82644236:
                case 768418473:
                    drawable = imageView.getDrawable();
                    z = false;
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0619.m2761("ܺ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11877) ^ 545264506;
                        i5 = -1842429465;
                    } else {
                        iM2761 = C0619.m2761("۬֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13267)) ^ 831370182;
                        i5 = -1557405961;
                    }
                    break;
                case 856992362:
                case 1397937152:
                    C17202.m40372();
                    if (C20932.f66974 > 0) {
                        iM2761 = (C0773.m3169("֡ۛ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 13153) ^ 1244448347;
                        i5 = -2033712225;
                    } else {
                        iM2761 = C0619.m2761("ܺ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11877) ^ 545264506;
                        i5 = -1842429465;
                    }
                    break;
                case 860993899:
                case 1067612032:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("ܺ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11877) ^ 545264506;
                        i5 = -1842429465;
                    } else {
                        iM2761 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6595) ^ (-767223710);
                        i5 = 965815164;
                    }
                    break;
                case 1315344750:
                case 1891895956:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("ۨ۫") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * (-5441)) ^ 695881817;
                        i5 = 993862995;
                    } else {
                        iM2761 = (C0773.m3169("ۛۜ") + i3) * 23;
                        i4 = ((iM2761 ^ i2) * 29131) ^ (-1265379372);
                        i5 = 2012227238;
                    }
                    break;
                case 1429086094:
                case 1823184075:
                    ActivityC20779.m47538(activityC0885, strM47852, drawable, z, activityC0885.f3297);
                    break;
                default:
                    activityC0885 = this.f61008;
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("֡ۛ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 13153) ^ 1244448347;
                        i5 = -2033712225;
                    } else {
                        iM2761 = C0773.m3169("ܳ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5347) ^ 1679231016;
                        i5 = 800655258;
                    }
                    break;
            }
            return;
        }
    }
}
