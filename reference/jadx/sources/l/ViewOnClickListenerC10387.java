package l;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAQP */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC10387 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֫᩺ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f33026 = {4001, 1515, -1328, 4624, 2820, 3359, 5943, 551, 4151, -6956, 5222, 27182, 27245, 27252, 27251, 27256, 5212, -683, 259, -4943, -6886, -4677, 6721};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9641 f33027;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f33028;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TextView f33029;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16800 f33030;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f33031;

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a7 A[PHI: r4 r5 r8 r10 r11 r15
      0x01a7: PHI (r4v4 l.ܿܽ) = (r4v3 l.ܿܽ), (r4v2 l.ܿܽ), (r4v2 l.ܿܽ), (r4v2 l.ܿܽ) binds: [B:48:0x01a5, B:44:0x017f, B:24:0x00b0, B:12:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r5v4 l.ۢۚ) = (r5v3 l.ۢۚ), (r5v2 l.ۢۚ), (r5v2 l.ۢۚ), (r5v2 l.ۢۚ) binds: [B:48:0x01a5, B:44:0x017f, B:24:0x00b0, B:12:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r8v4 l.᩵۠֫) = (r8v2 l.᩵۠֫), (r8v2 l.᩵۠֫), (r8v3 l.᩵۠֫), (r8v2 l.᩵۠֫) binds: [B:48:0x01a5, B:44:0x017f, B:24:0x00b0, B:12:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:48:0x01a5, B:44:0x017f, B:24:0x00b0, B:12:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:48:0x01a5, B:44:0x017f, B:24:0x00b0, B:12:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:48:0x01a5, B:44:0x017f, B:24:0x00b0, B:12:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0288 A[PHI: r7 r9 r12 r17
      0x0288: PHI (r7v4 android.view.MenuItem) = (r7v2 android.view.MenuItem), (r7v3 android.view.MenuItem), (r7v2 android.view.MenuItem) binds: [B:68:0x0286, B:36:0x0134, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v5 int) binds: [B:68:0x0286, B:36:0x0134, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:68:0x0286, B:36:0x0134, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:68:0x0286, B:36:0x0134, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b6 A[PHI: r6 r16 r18 r23
      0x02b6: PHI (r6v5 int) = (r6v2 int), (r6v4 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:64:0x026a, B:40:0x015e, B:18:0x008e, B:15:0x0074, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v5 short[]) binds: [B:64:0x026a, B:40:0x015e, B:18:0x008e, B:15:0x0074, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:64:0x026a, B:40:0x015e, B:18:0x008e, B:15:0x0074, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r23v5 short) = (r23v4 short), (r23v3 short), (r23v3 short), (r23v3 short), (r23v3 short) binds: [B:64:0x026a, B:40:0x015e, B:18:0x008e, B:15:0x0074, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int iM3169;
        int i;
        int i2;
        int i3 = C0269.f1558;
        int i4 = C0950.f3488;
        int iM31610 = C0773.m3169("۟ۛ") ^ i4;
        int i5 = ((iM31610 ^ i3) * 28181) ^ 207499554;
        C9898 c9898M42995 = null;
        C20429 c20429 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ 1334688852;
        int iM2761 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        short s = 0;
        int i10 = 616220949;
        short s2 = 0;
        C18452 c18452 = null;
        MenuItem menuItemM13541 = null;
        boolean z = false;
        int iM31611 = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * (-30079)) >> 31));
            switch (i10) {
                case -2072818967:
                case -619601529:
                    menuItemM13541 = C4238.m13541(c9898M42995, z ? 1 : 0, iM31611, z ? 1 : 0, iM31611);
                    sArr3 = f33026;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("ܺ֡") + i4) * (-71);
                        i = ((iM3169 ^ i3) * 22773) ^ (-165175768);
                        i2 = -447614646;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۘۡ")) * 61;
                        i = ((iM3169 ^ i3) * (-10211)) ^ (-435164248);
                        i2 = 61896732;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1947444370:
                case -1342417074:
                    C2966.m9664();
                    C2485.m8357();
                    iM3169 = C0773.m3169("᩹ۛ") ^ i3;
                    i = ((iM3169 ^ i4) * (-31573)) ^ (-1774459179);
                    i2 = -1544931953;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1934649838:
                case -720875012:
                    C2878.m9491();
                    C2966.m9664();
                    return false;
                case -1906116062:
                case 1409833728:
                    sArr2 = f33026;
                    i7 = 17;
                    i8 = 3;
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ܶۤ") ^ i4;
                        i = ((iM3169 ^ i3) * 25697) ^ 988629271;
                        i2 = -1761763879;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۖ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * 4521) ^ 1172206375;
                        i2 = 1382273835;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1713313899:
                case -1373799367:
                    C2966.m9664();
                    if (C2354.f7599 < 0) {
                        iM3169 = C0619.m2761("ܳۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-891)) ^ 1030299018;
                        i2 = -1532353184;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۖ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * 4521) ^ 1172206375;
                        i2 = 1382273835;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1559519144:
                case 1150046511:
                    c = 16;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ܺ֡") + i4) * (-71);
                        i = ((iM3169 ^ i3) * 22773) ^ (-165175768);
                        i2 = -447614646;
                    } else {
                        iM3169 = (C0773.m3169("ܺ֨") + i3) * 67;
                        i = ((iM3169 ^ i4) * 32647) ^ 2013129023;
                        i2 = 982695485;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1518495707:
                case 793716178:
                    c18452.m42994(c20429);
                    C22744.m51282(view, c18452);
                    return true;
                case -1141740974:
                case -943051888:
                    i9 = 29731;
                    iM3169 = C0619.m2761("ܿܺ") ^ i4;
                    i = ((iM3169 ^ i3) * (-6469)) ^ (-1969426816);
                    i2 = -816325217;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1081689890:
                case -759756740:
                    c18452 = new C18452(this.f33027, view, z ? 1 : 0);
                    c9898M42995 = c18452.m42995();
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("᩸ۖ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * 4521) ^ 1172206375;
                        i2 = 1382273835;
                    } else {
                        iM3169 = C0773.m3169("᩻֨") ^ i3;
                        i = ((iM3169 ^ i4) * 7815) ^ (-165235440);
                        i2 = 2068707730;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -795529699:
                case -178136021:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("᩹ۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-31573)) ^ (-1774459179);
                        i2 = -1544931953;
                    } else {
                        iM3169 = C0619.m2761("ܳۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-891)) ^ 1030299018;
                        i2 = -1532353184;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -701069927:
                case -56151163:
                    i9 = 43764;
                    iM3169 = C0619.m2761("ܿܺ") ^ i4;
                    i = ((iM3169 ^ i3) * (-6469)) ^ (-1969426816);
                    i2 = -816325217;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -542431044:
                case 1636403898:
                    if (((s * s) + 39929761) - (s * s2) < 0) {
                        iM3169 = C0619.m2761("ᩳ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-14909)) ^ 968342093;
                        i2 = -740104718;
                    } else {
                        iM3169 = C0773.m3169("ۧ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-7631)) ^ 308807476;
                        i2 = -393449622;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -420894241:
                case -99982699:
                    c18452.m42997();
                    c20429 = new C20429(this);
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("ۢܽ") ^ i4) * (-51);
                        i = ((iM3169 ^ i3) * (-31881)) ^ 127692347;
                        i2 = 1193117102;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۖ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * 4521) ^ 1172206375;
                        i2 = 1382273835;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -384754862:
                case -258942237:
                    return z;
                case -346883151:
                case 30862747:
                    iM31611 = 2097202975 ^ C0773.m3169(RunnableC1848.m6366(sArr2, i7, i8, i9));
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩹ۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-31573)) ^ (-1774459179);
                        i2 = -1544931953;
                    } else {
                        iM3169 = C0619.m2761("ۜ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 16157) ^ (-1312899438);
                        i2 = -1422574103;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -134719183:
                case 2136238253:
                    C0269.m1775();
                    if (AbstractC0641.m2813() > 0) {
                        iM3169 = C0619.m2761("ܳۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-891)) ^ 1030299018;
                        i2 = -1532353184;
                    } else {
                        iM3169 = C0619.m2761("ۛܶ") ^ i3;
                        i = ((iM3169 ^ i4) * 20769) ^ (-1320872668);
                        i2 = -1230592975;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 88231295:
                case 877671400:
                    C2023.m6953(menuItemM13541, 2101095617 ^ iM2761);
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ۛܶ") ^ i3;
                        i = ((iM3169 ^ i4) * 20769) ^ (-1320872668);
                        i2 = -1230592975;
                    } else {
                        iM3169 = C0773.m3169("ᩳ֡") ^ i3;
                        i = ((iM3169 ^ i4) * (-21249)) ^ (-1751365111);
                        i2 = -911472562;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 111079243:
                case 1811382219:
                    iM2761 = C0619.m2761(RunnableC1848.m6366(sArr3, 20, 3, i9));
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("ܺ֡") + i4) * (-71);
                        i = ((iM3169 ^ i3) * 22773) ^ (-165175768);
                        i2 = -447614646;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ᩵") + i4) * 13;
                        i = ((iM3169 ^ i3) * 1543) ^ 1211915085;
                        i2 = -1724797151;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1484565608:
                case 1550323344:
                    z = false;
                    z = false;
                    if (this.f33031) {
                        iM3169 = C0773.m3169("ۜ֡") ^ i3;
                        i = ((iM3169 ^ i4) * (-7009)) ^ (-439632472);
                        i2 = -1866401148;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩶") ^ i4) * 47;
                        i = ((iM3169 ^ i3) * (-13679)) ^ 1880101578;
                        i2 = 695126022;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1697075866:
                case 2022125544:
                    s = sArr[c];
                    s2 = 12638;
                    if (C0773.m3161() != 0) {
                        iM3169 = C0773.m3169("᩹ۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-31573)) ^ (-1774459179);
                        i2 = -1544931953;
                    } else {
                        iM3169 = C0773.m3169("᩷ۖ") ^ i4;
                        i = ((iM3169 ^ i3) * 16855) ^ 1579432722;
                        i2 = 1216578991;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f33026;
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("᩹ۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-31573)) ^ (-1774459179);
                        i2 = -1544931953;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩺ۤ")) * 27;
                        i = ((iM3169 ^ i3) * 31445) ^ (-54127382);
                        i2 = 1380592622;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01e2 A[PHI: r4 r10 r11
      0x01e2: PHI (r4v9 int) = (r4v8 int), (r4v6 int), (r4v6 int), (r4v6 int), (r4v6 int) binds: [B:53:0x01e0, B:37:0x0155, B:33:0x0132, B:22:0x00c7, B:19:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:53:0x01e0, B:37:0x0155, B:33:0x0132, B:22:0x00c7, B:19:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:53:0x01e0, B:37:0x0155, B:33:0x0132, B:22:0x00c7, B:19:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public ViewOnClickListenerC10387(ActivityC9641 activityC9641, ViewGroup viewGroup) {
        int iM2761;
        int i;
        String strM12925;
        short[] sArr;
        int i2;
        int i3;
        int i4;
        int i5 = C1321.f4751;
        int i6 = AbstractC0116.f1064;
        short s = f33026[0];
        int i7 = (s * s) + 13126129;
        int i8 = s + 3623;
        int i9 = (i8 * i8) - (i7 + i7) > 0 ? 45655 : 33827;
        this.f33027 = activityC9641;
        super(C1519.m5408(LayoutInflater.from(activityC9641), C0619.m2761(C1080.m4056(f33026, 1, 3, i9)) ^ 2130322518, viewGroup, false));
        int iM2762 = (i5 - C0619.m2761("ۤ᩵")) * 109;
        int i10 = ((iM2762 ^ i6) * 18843) ^ 1320146728;
        String str = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int iM2763 = 0;
        View view = null;
        TextView textView = null;
        View view2 = null;
        int iM3169 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1515893237;
        int i15 = iM2762 ^ (-760026585);
        View view3 = null;
        while (true) {
            i14 = i15 ^ (i10 & (((i14 ^ i6) * (-13049)) >> 31));
            switch (i14) {
                case -2060758886:
                case -1028558545:
                    C11235.m28309();
                    throw new RuntimeException();
                case -1967792584:
                case -1660945048:
                    sArr = sArr2;
                    i2 = i13;
                    strM12925 = C3998.m12925(sArr, i2, 3, i9);
                    if (C20932.f66974 <= 0) {
                        int iM31610 = C0773.m3169("᩵ۗ") ^ i5;
                        int i16 = i9;
                        int i17 = ((iM31610 ^ i6) * (-12881)) ^ 374345120;
                        str = strM12925;
                        i15 = iM31610 ^ 1492007133;
                        sArr2 = sArr;
                        int i18 = i2;
                        i10 = i17;
                        i9 = i16;
                        i13 = i18;
                    } else {
                        int i19 = i9;
                        int iM31611 = C0773.m3169("ܺܺ") ^ i6;
                        View view4 = view3;
                        int i20 = ((iM31611 ^ i5) * (-13711)) ^ (-1251205808);
                        str = strM12925;
                        i15 = iM31611 ^ 77248300;
                        i9 = i19;
                        i13 = i2;
                        i10 = i20;
                        view3 = view4;
                        sArr2 = sArr;
                    }
                    break;
                case -1887263273:
                case 983257335:
                    this.f33028 = (TextView) C3448.m11246(view3, iM2763);
                    if (!C2023.f6737) {
                        iM2761 = (C0619.m2761("ۧۖ") + i6) * 101;
                        i10 = ((iM2761 ^ i5) * 28147) ^ (-1434263918);
                        i = -1550131631;
                        i15 = iM2761 ^ i;
                    } else {
                        strM12925 = str;
                        sArr = sArr2;
                        i2 = i13;
                        int iM31612 = C0773.m3169("᩵ۗ") ^ i5;
                        int i110 = i9;
                        int i111 = ((iM31612 ^ i6) * (-12881)) ^ 374345120;
                        str = strM12925;
                        i15 = iM31612 ^ 1492007133;
                        sArr2 = sArr;
                        int i112 = i2;
                        i10 = i111;
                        i9 = i110;
                        i13 = i112;
                    }
                    break;
                case -1825740119:
                case -958032550:
                    i11 = 2097374924;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("ۡۡ") + i6) * 29;
                        i10 = ((iM2761 ^ i5) * 5219) ^ 1590902224;
                        i = -223281802;
                    } else {
                        iM2761 = C0773.m3169("᩶ᩳ") ^ i6;
                        i10 = ((iM2761 ^ i5) * 20035) ^ (-597017758);
                        i = -427157586;
                    }
                    i15 = iM2761 ^ i;
                    break;
                case -1744023253:
                case 1565116003:
                    C11235.m28299(view2, this);
                    this.itemView.setOnLongClickListener(this);
                    return;
                case -1087056128:
                case -517854120:
                    if (C3734.f12817 >= 0) {
                        strM12925 = str;
                        sArr = sArr2;
                        i2 = i13;
                        int iM31613 = C0773.m3169("᩵ۗ") ^ i5;
                        int i113 = i9;
                        int i114 = ((iM31613 ^ i6) * (-12881)) ^ 374345120;
                        str = strM12925;
                        i15 = iM31613 ^ 1492007133;
                        sArr2 = sArr;
                        int i115 = i2;
                        i10 = i114;
                        i9 = i113;
                        i13 = i115;
                    } else {
                        iM2761 = C0619.m2761("ۤۡ") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-28181)) ^ (-1425467235);
                        i = -109629214;
                        i15 = iM2761 ^ i;
                    }
                    break;
                case -873889401:
                case 1006770693:
                    i3 = i9;
                    view3 = this.itemView;
                    sArr2 = f33026;
                    i4 = 4;
                    if (C4282.m13644()) {
                        int iM31614 = C0773.m3169("ۧۗ") ^ i5;
                        i10 = ((iM31614 ^ i6) * (-13281)) ^ 1425423257;
                        i15 = iM31614 ^ 979893955;
                        i9 = i3;
                        i13 = 4;
                    } else {
                        int iM31615 = C0773.m3169("ۤܶ") ^ i5;
                        i10 = ((iM31615 ^ i6) * 5961) ^ 871433929;
                        i15 = iM31615 ^ (-674034011);
                        int i21 = i3;
                        i13 = i4;
                        i9 = i21;
                    }
                    break;
                case -708982659:
                case 1404953502:
                    sArr3 = f33026;
                    i12 = 7;
                    if (!RunnableC0334.m2063()) {
                        iM2761 = C0773.m3169("۬᩹") ^ i6;
                        i10 = ((iM2761 ^ i5) * (-26491)) ^ (-1553632335);
                        i = 523370318;
                        i15 = iM2761 ^ i;
                    } else {
                        int i22 = i13;
                        i3 = i9;
                        i4 = i22;
                        int iM31616 = C0773.m3169("ۤܶ") ^ i5;
                        i10 = ((iM31616 ^ i6) * 5961) ^ 871433929;
                        i15 = iM31616 ^ (-674034011);
                        int i23 = i3;
                        i13 = i4;
                        i9 = i23;
                    }
                    break;
                case -493378385:
                case 285544483:
                    textView = (TextView) C3448.m11246(view, iM3169 ^ i11);
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("ۢ᩺") ^ i6;
                        i10 = ((iM2761 ^ i5) * 5159) ^ 345592033;
                        i = -449036740;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ܽ᩻")) * 55;
                        i10 = ((iM2761 ^ i5) * 22935) ^ (-1885075167);
                        i = 572740445;
                    }
                    i15 = iM2761 ^ i;
                    break;
                case -96860649:
                case 8695248:
                    iM2763 = 2099287102 ^ C0619.m2761(str);
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0619.m2761("ۡۡ") + i6) * 29;
                        i10 = ((iM2761 ^ i5) * 5219) ^ 1590902224;
                        i = -223281802;
                    } else {
                        iM2761 = C0773.m3169("۠ۧ") ^ i5;
                        i10 = ((iM2761 ^ i6) * 10811) ^ 804373344;
                        i = -1677503605;
                    }
                    i15 = iM2761 ^ i;
                    break;
                case -25830236:
                case 2097123247:
                    C20932.m47848();
                    if (C1542.m5459() < 0) {
                        iM2761 = (C0619.m2761("ۡۡ") + i6) * 29;
                        i10 = ((iM2761 ^ i5) * 5219) ^ 1590902224;
                        i = -223281802;
                    } else {
                        iM2761 = C0619.m2761("ۤۡ") ^ i5;
                        i10 = ((iM2761 ^ i6) * (-28181)) ^ (-1425467235);
                        i = -109629214;
                    }
                    i15 = iM2761 ^ i;
                    break;
                case 51111558:
                case 1518476368:
                    view = this.itemView;
                    if (!C2966.m9664()) {
                        int i24 = i13;
                        i3 = i9;
                        i4 = i24;
                        int iM31617 = C0773.m3169("ۤܶ") ^ i5;
                        i10 = ((iM31617 ^ i6) * 5961) ^ 871433929;
                        i15 = iM31617 ^ (-674034011);
                        int i25 = i3;
                        i13 = i4;
                        i9 = i25;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۢۚ")) * (-47);
                        i10 = ((iM2761 ^ i6) * (-2819)) ^ (-902192592);
                        i = -1079333170;
                        i15 = iM2761 ^ i;
                    }
                    break;
                case 306935740:
                case 456127487:
                    iM3169 = C0773.m3169(C1826.m6310(sArr3, i12, 3, i9));
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("ۡۡ") + i6) * 29;
                        i10 = ((iM2761 ^ i5) * 5219) ^ 1590902224;
                        i = -223281802;
                    } else {
                        iM2761 = C0619.m2761("۬ۖ") ^ i5;
                        i10 = ((iM2761 ^ i6) * 19991) ^ (-372289160);
                        i = 901081272;
                    }
                    i15 = iM2761 ^ i;
                    break;
                case 1005083960:
                case 1900743948:
                    C2354.m7983();
                    if (C0773.f2792 > 0) {
                        iM2761 = C0619.m2761("ۢ᩺") ^ i6;
                        i10 = ((iM2761 ^ i5) * 5159) ^ 345592033;
                        i = -449036740;
                        i15 = iM2761 ^ i;
                    } else {
                        strM12925 = str;
                        sArr = sArr2;
                        i2 = i13;
                        int iM31618 = C0773.m3169("᩵ۗ") ^ i5;
                        int i116 = i9;
                        int i117 = ((iM31618 ^ i6) * (-12881)) ^ 374345120;
                        str = strM12925;
                        i15 = iM31618 ^ 1492007133;
                        sArr2 = sArr;
                        int i118 = i2;
                        i10 = i117;
                        i9 = i116;
                        i13 = i118;
                    }
                    break;
                case 1570702791:
                case 1609511908:
                    C2878.m9491();
                    iM2761 = (C0619.m2761("ۡۡ") + i6) * 29;
                    i10 = ((iM2761 ^ i5) * 5219) ^ 1590902224;
                    i = -223281802;
                    i15 = iM2761 ^ i;
                    break;
                default:
                    this.f33029 = textView;
                    C22744.m51280(this.itemView);
                    view2 = this.itemView;
                    if (C20932.f66974 > 0) {
                        iM2761 = (i5 - C0773.m3169("֫ۨ")) * (-107);
                        i10 = ((iM2761 ^ i6) * (-3625)) ^ 885866670;
                        i = 53423445;
                        i15 = iM2761 ^ i;
                    } else {
                        strM12925 = str;
                        sArr = sArr2;
                        i2 = i13;
                        int iM31619 = C0773.m3169("᩵ۗ") ^ i5;
                        int i119 = i9;
                        int i1110 = ((iM31619 ^ i6) * (-12881)) ^ 374345120;
                        str = strM12925;
                        i15 = iM31619 ^ 1492007133;
                        sArr2 = sArr;
                        int i1111 = i2;
                        i10 = i1110;
                        i9 = i119;
                        i13 = i1111;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x039e A[PHI: r7 r8 r16 r17 r18 r21
      0x039e: PHI (r7v3 short) = (r7v2 short), (r7v2 short), (r7v4 short) binds: [B:94:0x039c, B:86:0x0343, B:68:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r8v3 short) = (r8v2 short), (r8v2 short), (r8v4 short) binds: [B:94:0x039c, B:86:0x0343, B:68:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r16v14 java.lang.Exception) = (r16v8 java.lang.Exception), (r16v10 java.lang.Exception), (r16v15 java.lang.Exception) binds: [B:94:0x039c, B:86:0x0343, B:68:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r17v7 short[]) = (r17v2 short[]), (r17v4 short[]), (r17v8 short[]) binds: [B:94:0x039c, B:86:0x0343, B:68:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r18v7 char) = (r18v2 char), (r18v4 char), (r18v8 char) binds: [B:94:0x039c, B:86:0x0343, B:68:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x039e: PHI (r21v12 int) = (r21v6 int), (r21v8 int), (r21v13 int) binds: [B:94:0x039c, B:86:0x0343, B:68:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        if (l.C1146.m4231() != false) goto L26;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC10387.onClick(android.view.View):void");
    }
}
