package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;

/* JADX INFO: renamed from: l.۟᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC8188 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩻֨ܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f27003 = {1, -18742, -22618, 27722, -22194, 25977, 19486, 20924, 24480, 26777, 19960, 17300, -22039, -21282, 22063, 18631};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f27004;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f27005;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11192 f27006;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f27007;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10424 f27008;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f27009;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:53:0x01ee A[PHI: r7 r10
      0x01ee: PHI (r7v6 java.lang.String) = 
      (r7v3 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:52:0x01ec, B:36:0x013e, B:24:0x00b8, B:13:0x007b, B:77:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r10v6 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:52:0x01ec, B:36:0x013e, B:24:0x00b8, B:13:0x007b, B:77:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0224 A[PHI: r11 r17 r18
      0x0224: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:56:0x0222, B:48:0x01c6, B:44:0x019f, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r17v9 android.view.View) = (r17v7 android.view.View), (r17v8 android.view.View), (r17v7 android.view.View), (r17v7 android.view.View) binds: [B:56:0x0222, B:48:0x01c6, B:44:0x019f, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r18v6 android.view.View) = (r18v5 android.view.View), (r18v4 android.view.View), (r18v4 android.view.View), (r18v4 android.view.View) binds: [B:56:0x0222, B:48:0x01c6, B:44:0x019f, B:13:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC8188(C10424 c10424, View view) {
        int iM2761;
        int iM2762;
        int i;
        int i2;
        int iM2763;
        int i3;
        super(view);
        int i4 = C1080.f3865;
        int i5 = C0773.f2792;
        short s = f27003[0];
        int i6 = (s * 2) + 1;
        int i7 = s + 1;
        int i8 = (i7 * i7) - i6 >= 0 ? 13501 : 50018;
        this.f27008 = c10424;
        int iM2764 = C0619.m2761("ᩴ᩹") ^ i5;
        int i9 = ((iM2764 ^ i4) * 14209) ^ 1048769646;
        int i10 = iM2764 ^ 740870596;
        String strM2756 = null;
        short[] sArr = null;
        int i11 = 0;
        TextView textView = null;
        int iM3169 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        View viewM11246 = null;
        View viewM9333 = null;
        int i15 = -2067913419;
        short[] sArr2 = null;
        int iM2765 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i4) * (-15505)) >> 31));
            switch (i15) {
                case -1684960483:
                case 45596763:
                    this.f27009 = (ImageView) viewM9333;
                    strM2756 = C0619.m2756(f27003, 4, 3, i8);
                    if (C3099.f10023 <= 0) {
                        iM2763 = (C0773.m3169("᩵ܶ") ^ i4) * 9;
                        i9 = ((iM2763 ^ i5) * 16165) ^ 845745948;
                        i3 = 1327947299;
                    } else {
                        iM2763 = C0619.m2761("ۤ֨") ^ i5;
                        i9 = ((iM2763 ^ i4) * 20687) ^ (-1221225285);
                        i3 = 1054772748;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                case -1412882742:
                case 2092947868:
                    C13473.m33140(C2834.m9333(view, 2101507744 ^ iM2765), 8);
                    C2375.m8070(view, this);
                    return;
                case -1380606823:
                case 860885941:
                    this.f27005 = (TextView) C3448.m11246(view, iM3169 ^ i12);
                    if (C2702.f8586 <= 0) {
                        iM2763 = (C0773.m3169("᩵ܶ") ^ i4) * 9;
                        i9 = ((iM2763 ^ i5) * 16165) ^ 845745948;
                        i3 = 1327947299;
                    } else {
                        iM2763 = C0773.m3169("᩹۬") ^ i4;
                        i9 = ((iM2763 ^ i5) * (-10727)) ^ 1965948902;
                        i3 = -1454020457;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                case -1037061862:
                case 1844348894:
                    iM3169 = C0773.m3169(C1519.m5399(sArr2, 7, 3, i8));
                    i12 = 2122480545;
                    if (C2834.f9334 <= 0) {
                        iM2763 = (C0773.m3169("ۧ֡") + i4) * 11;
                        i9 = ((iM2763 ^ i5) * 1285) ^ (-1232298250);
                        i3 = -1363867288;
                    } else {
                        iM2763 = (C0619.m2761("ᩴ᩺") ^ i4) * (-53);
                        i9 = ((iM2763 ^ i5) * (-18923)) ^ (-219921373);
                        i3 = 967077283;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                case -1009114370:
                case 587228979:
                    C3077.m10041();
                    if (C3448.f11240 >= 0) {
                        iM2763 = (C0773.m3169("᩵ܶ") ^ i4) * 9;
                        i9 = ((iM2763 ^ i5) * 16165) ^ 845745948;
                        i3 = 1327947299;
                    } else {
                        iM2763 = C0773.m3169("ۨ᩶") ^ i5;
                        i9 = ((iM2763 ^ i4) * 8319) ^ 723199823;
                        i3 = -1945112927;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                case -945154479:
                case 1279274465:
                    viewM11246 = C3448.m11246(view, C0619.m2761(strM2756) ^ 2102478870);
                    if (C4238.f15451 >= 0) {
                        iM2763 = C0773.m3169("ۨ᩶") ^ i5;
                        i9 = ((iM2763 ^ i4) * 8319) ^ 723199823;
                        i3 = -1945112927;
                    } else {
                        iM2763 = C0619.m2761("ܽܺ") ^ i4;
                        i9 = ((iM2763 ^ i5) * 10847) ^ (-1087777987);
                        i3 = -859608848;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                case -930134012:
                case 1078312522:
                    this.f27007 = textView;
                    iM2765 = C0619.m2761(C2834.m9343(f27003, 13, 3, i8));
                    if (C3779.f12953 <= 0) {
                        iM2763 = (C0773.m3169("᩵ܶ") ^ i4) * 9;
                        i9 = ((iM2763 ^ i5) * 16165) ^ 845745948;
                        i3 = 1327947299;
                    } else {
                        iM2763 = (C0773.m3169("۫᩺") ^ i4) * 53;
                        i9 = ((iM2763 ^ i5) * (-5445)) ^ (-1548966040);
                        i3 = -947306055;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                case -918366910:
                case 1588985832:
                    iM2761 = C0619.m2761(C2023.m6966(f27003, 1, 3, i8));
                    if (C1146.m4231()) {
                        iM2762 = C0619.m2761("᩸ܿ") ^ i4;
                        i = ((iM2762 ^ i5) * 4867) ^ (-1956259716);
                        i2 = -1199703769;
                    } else {
                        iM2762 = C0619.m2761("ۢ֫") ^ i4;
                        i = ((iM2762 ^ i5) * (-23787)) ^ 410029821;
                        i2 = -1939670208;
                    }
                    i11 = iM2761;
                    i10 = iM2762 ^ i2;
                    i9 = i;
                    break;
                case -819720524:
                case 1459910305:
                    C4238.m13540();
                    C0269.m1775();
                    iM2763 = C0773.m3169("ܳܿ") ^ i5;
                    i9 = ((iM2763 ^ i4) * 21339) ^ (-78627349);
                    i3 = 2118570083;
                    i10 = iM2763 ^ i3;
                    break;
                case -472003150:
                case 215502502:
                    C1146.m4231();
                    throw new RuntimeException();
                case -105510926:
                case 604427958:
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = i11;
                        iM2762 = C0619.m2761("ۢ֫") ^ i4;
                        i = ((iM2762 ^ i5) * (-23787)) ^ 410029821;
                        i2 = -1939670208;
                        i11 = iM2761;
                        i10 = iM2762 ^ i2;
                        i9 = i;
                    } else {
                        iM2763 = C0773.m3169("ܳܿ") ^ i5;
                        i9 = ((iM2763 ^ i4) * 21339) ^ (-78627349);
                        i3 = 2118570083;
                        i10 = iM2763 ^ i3;
                    }
                    break;
                case 396745093:
                case 1291651612:
                    this.f27004 = (TextView) viewM11246;
                    sArr2 = f27003;
                    if (RunnableC1848.m6360()) {
                        iM2763 = C0773.m3169("ۨ᩶") ^ i5;
                        i9 = ((iM2763 ^ i4) * 8319) ^ 723199823;
                        i3 = -1945112927;
                    } else {
                        iM2763 = C0619.m2761("۫۫") ^ i5;
                        i9 = ((iM2763 ^ i4) * (-6423)) ^ (-987571763);
                        i3 = 527442455;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                case 1224179430:
                case 1662555144:
                    viewM9333 = C2834.m9333(view, i11 ^ 2129783653);
                    if (C1321.f4751 >= 0) {
                        iM2763 = C0773.m3169("ۨ᩶") ^ i5;
                        i9 = ((iM2763 ^ i4) * 8319) ^ 723199823;
                        i3 = -1945112927;
                    } else {
                        iM2763 = C0619.m2761("۠۬") ^ i5;
                        i9 = ((iM2763 ^ i4) * 22745) ^ 1047105539;
                        i3 = 1881761022;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                case 1340131395:
                case 1373346630:
                    textView = (TextView) C3448.m11246(view, C0773.m3169(C20932.m47853(sArr, i13, i14, i8)) ^ 2128365078);
                    if (C1826.f6190 > 0) {
                        iM2763 = C0619.m2761("ۘ֫") ^ i5;
                        i9 = ((iM2763 ^ i4) * 13365) ^ 1243488116;
                        i3 = -1173231234;
                        i10 = iM2763 ^ i3;
                    } else {
                        iM2761 = i11;
                        iM2762 = C0619.m2761("ۢ֫") ^ i4;
                        i = ((iM2762 ^ i5) * (-23787)) ^ 410029821;
                        i2 = -1939670208;
                        i11 = iM2761;
                        i10 = iM2762 ^ i2;
                        i9 = i;
                    }
                    break;
                case 1626167176:
                case 1915749868:
                    sArr = f27003;
                    i13 = 10;
                    i14 = 3;
                    if (C2288.f7433 <= 0) {
                        iM2763 = C0773.m3169("ܳܿ") ^ i5;
                        i9 = ((iM2763 ^ i4) * 21339) ^ (-78627349);
                        i3 = 2118570083;
                    } else {
                        iM2763 = C0619.m2761("᩹۫") ^ i5;
                        i9 = ((iM2763 ^ i4) * (-7241)) ^ 255386064;
                        i3 = 1031637880;
                    }
                    i10 = iM2763 ^ i3;
                    break;
                default:
                    if (AbstractC0641.f2496 < 0) {
                        iM2763 = (C0773.m3169("᩵ܶ") ^ i4) * 9;
                        i9 = ((iM2763 ^ i5) * 16165) ^ 845745948;
                        i3 = 1327947299;
                        i10 = iM2763 ^ i3;
                    } else {
                        iM2761 = i11;
                        iM2762 = C0619.m2761("ۢ֫") ^ i4;
                        i = ((iM2762 ^ i5) * (-23787)) ^ 410029821;
                        i2 = -1939670208;
                        i11 = iM2761;
                        i10 = iM2762 ^ i2;
                        i9 = i;
                    }
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C10424 c10424 = null;
        AbstractActivityC17204 abstractActivityC17204 = null;
        String strM2348 = null;
        Drawable drawable = null;
        boolean z = false;
        int i = -976605162;
        int i2 = C0773.f2792;
        int i3 = C3492.f12043;
        int iM3169 = (i3 - C0773.m3169("ܳۘ")) * (-89);
        int i4 = ((iM3169 ^ i2) * 19611) ^ 2089221690;
        int i5 = 824308023;
        while (true) {
            i = ((((i ^ i2) * (-18885)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2001162437:
                case 1275708034:
                    if (C1343.f4799 == 0) {
                        iM3169 = (C0619.m2761("ۚܰ") ^ i3) * (-37);
                        i4 = ((iM3169 ^ i2) * (-21861)) ^ (-1784962984);
                        i5 = 655288306;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ۠") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-10009)) ^ (-1102191255);
                        i5 = -1319668535;
                    }
                    break;
                case -1742751382:
                case 251950931:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("ܽܽ") + i2) * 17;
                        i4 = ((iM3169 ^ i3) * 8241) ^ 1352984642;
                        i5 = -2004122014;
                    } else {
                        iM3169 = C0773.m3169("ۨۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17021)) ^ 278778980;
                        i5 = -881980010;
                    }
                    break;
                case -1652302368:
                case 1875865725:
                    abstractActivityC17204 = c10424.f33138;
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("۟ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3191) ^ (-291204066);
                        i5 = 1610580602;
                    } else {
                        iM3169 = C0619.m2761("ᩴۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19663) ^ 1648419689;
                        i5 = -555280929;
                    }
                    break;
                case -1247907351:
                case 337568443:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("֡ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2729) ^ (-985290782);
                        i5 = 12601700;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ۠") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-10009)) ^ (-1102191255);
                        i5 = -1319668535;
                    }
                    break;
                case -1218195385:
                case 322330626:
                    C3033.m9845();
                    iM3169 = (C0773.m3169("ᩴ۠") ^ i2) * (-79);
                    i4 = ((iM3169 ^ i3) * (-10009)) ^ (-1102191255);
                    i5 = -1319668535;
                    break;
                case -1149647899:
                case -470320487:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("ܽܽ") + i2) * 17;
                        i4 = ((iM3169 ^ i3) * 8241) ^ 1352984642;
                        i5 = -2004122014;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۜۧ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * 12481) ^ (-974837773);
                        i5 = 1472633469;
                    }
                    break;
                case -854412303:
                case 1662735281:
                    strM2348 = C0487.m2348(this.f27006);
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("۟ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3191) ^ (-291204066);
                        i5 = 1610580602;
                    } else {
                        iM3169 = C0619.m2761("۟᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17859) ^ (-1293771462);
                        i5 = -1441706312;
                    }
                    break;
                case -755232920:
                case 183450282:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0619.m2761("֡ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2729) ^ (-985290782);
                        i5 = 12601700;
                    } else {
                        iM3169 = C0619.m2761("֫ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10929) ^ 672219909;
                        i5 = -1466985211;
                    }
                    break;
                case -724460794:
                case 1051886827:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("ۚܰ") ^ i3) * (-37);
                        i4 = ((iM3169 ^ i2) * (-21861)) ^ (-1784962984);
                        i5 = 655288306;
                    } else {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1651)) ^ 575701158;
                        i5 = -360514952;
                    }
                    break;
                case -661107281:
                case 1501747323:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("۟ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3191) ^ (-291204066);
                        i5 = 1610580602;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ᩴᩳ")) * 39;
                        i4 = ((iM3169 ^ i3) * 7021) ^ 2062211649;
                        i5 = 2135709388;
                    }
                    break;
                case 271579260:
                case 1174364913:
                    AbstractC0641.m2813();
                    break;
                case 674211543:
                case 1219848330:
                    z = false;
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ܽܽ") + i2) * 17;
                        i4 = ((iM3169 ^ i3) * 8241) ^ 1352984642;
                        i5 = -2004122014;
                    } else {
                        iM3169 = (C0773.m3169("ۘۚ") ^ i3) * 75;
                        i4 = ((iM3169 ^ i2) * 12033) ^ (-14811757);
                        i5 = -1114602795;
                    }
                    break;
                case 751163375:
                case 1689750188:
                    ActivityC20779.m47538(abstractActivityC17204, strM2348, drawable, z, null);
                    break;
                case 902714571:
                case 1344238215:
                    c10424 = this.f27008;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0773.m3169("ᩴ۠") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-10009)) ^ (-1102191255);
                        i5 = -1319668535;
                    } else {
                        iM3169 = (C0773.m3169("֡۬") + i3) * 87;
                        i4 = ((iM3169 ^ i2) * (-21575)) ^ 310825984;
                        i5 = 1418670668;
                    }
                    break;
                case 979978423:
                case 1917754123:
                    C3734.m12152();
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ܽܽ") + i2) * 17;
                        i4 = ((iM3169 ^ i3) * 8241) ^ 1352984642;
                        i5 = -2004122014;
                    } else {
                        iM3169 = C0619.m2761("֡ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2729) ^ (-985290782);
                        i5 = 12601700;
                    }
                    break;
                default:
                    drawable = this.f27009.getDrawable();
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0773.m3169("ᩴ۠") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-10009)) ^ (-1102191255);
                        i5 = -1319668535;
                    } else {
                        iM3169 = C0619.m2761("᩺ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12089) ^ 532565971;
                        i5 = 975711165;
                    }
                    break;
            }
            return;
        }
    }
}
