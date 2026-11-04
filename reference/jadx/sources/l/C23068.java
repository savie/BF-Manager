package l;

import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alipay.sdk.m.y.q;

/* JADX INFO: renamed from: l.᩸᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23068 extends AbstractC12964 {

    /* JADX INFO: renamed from: ᩵ܰܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f74834 = {679, -22448, 24990, -21368};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC5914 f74835;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5914 f74836;

    /* JADX WARN: Code duplicated, block: B:54:0x01c1 A[PHI: r3 r4 r8 r9 r16
      0x01c1: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v4 int), (r3v2 int) binds: [B:53:0x01bf, B:49:0x019e, B:100:0x01c1, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r4v5 boolean) = (r4v2 boolean), (r4v2 boolean), (r4v4 boolean), (r4v2 boolean) binds: [B:53:0x01bf, B:49:0x019e, B:100:0x01c1, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:53:0x01bf, B:49:0x019e, B:100:0x01c1, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:53:0x01bf, B:49:0x019e, B:100:0x01c1, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r16v31 android.view.LayoutInflater) = 
      (r16v13 android.view.LayoutInflater)
      (r16v14 android.view.LayoutInflater)
      (r16v30 android.view.LayoutInflater)
      (r16v38 android.view.LayoutInflater)
     binds: [B:53:0x01bf, B:49:0x019e, B:100:0x01c1, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM3169;
        int i2;
        int i3;
        int iM31610;
        int i4;
        C23068 c23068 = this;
        int i5 = C2834.f9334;
        int i6 = C20932.f66974;
        int iM2761 = C0619.m2761("֫ᩳ") ^ i5;
        int i7 = ((iM2761 ^ i6) * (-7289)) ^ 525543630;
        View viewM5408 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM2761 ^ (-749311067);
        LayoutInflater layoutInflaterFrom = null;
        int i9 = 0;
        boolean z = false;
        int iM2762 = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1161791421;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i6) * (-29465)) >> 31));
            switch (i13) {
                case -2016570520:
                case -403774113:
                    if (C20932.f66974 <= 0) {
                        int iM31611 = (i6 - C0773.m3169("ܶ᩵")) * (-5);
                        i7 = ((iM31611 ^ i5) * 26941) ^ (-1827272754);
                        i8 = iM31611 ^ (-1089953287);
                        c23068 = this;
                    } else {
                        int iM2763 = C0619.m2761("ۚ۠") ^ i5;
                        i7 = ((iM2763 ^ i6) * (-13179)) ^ 631597673;
                        i8 = iM2763 ^ 2040556464;
                    }
                    break;
                case -1946221424:
                case 921240870:
                    C3077.m10041();
                    return null;
                case -1794353509:
                case -707152065:
                    C2966.m9664();
                    int iM2764 = C0619.m2761("ۚ۠") ^ i5;
                    i7 = ((iM2764 ^ i6) * (-13179)) ^ 631597673;
                    i8 = iM2764 ^ 2040556464;
                    break;
                case -1760055252:
                case 1722693509:
                    layoutInflaterFrom = LayoutInflater.from(c23068.f74835);
                    sArr2 = f74834;
                    if (C3448.f11240 >= 0) {
                        int iM31612 = (i6 - C0773.m3169("ܶ᩵")) * (-5);
                        i7 = ((iM31612 ^ i5) * 26941) ^ (-1827272754);
                        i8 = iM31612 ^ (-1089953287);
                    } else {
                        int iM31613 = (C0773.m3169("ܶ۫") + i6) * 119;
                        i8 = iM31613 ^ (-439475199);
                        i7 = ((iM31613 ^ i5) * (-30177)) ^ (-1141003426);
                    }
                    c23068 = this;
                    break;
                case -1751420752:
                case 1666928561:
                    layoutInflaterFrom = layoutInflaterFrom;
                    i9 = iM2762 ^ 2104359579;
                    z = false;
                    if (C11235.f35427 < 0) {
                        iM3169 = C0619.m2761("᩻֡") ^ i5;
                        i2 = ((iM3169 ^ i6) * 13991) ^ 2016645624;
                        i3 = -796060751;
                        LayoutInflater layoutInflater = layoutInflaterFrom;
                        i8 = iM3169 ^ i3;
                        i7 = i2;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        iM31610 = C0773.m3169("۫᩺") ^ i5;
                        i7 = ((iM31610 ^ i6) * 4451) ^ 2146993855;
                        i4 = 1305938935;
                        int i14 = iM31610 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i8 = i14;
                        c23068 = this;
                    }
                    break;
                case -1745152893:
                case 697871085:
                    layoutInflaterFrom = layoutInflaterFrom;
                    iM2762 = C0619.m2761(AbstractC0641.m2820(sArr2, i12, 3, i11));
                    if (C0862.f3233 == 0) {
                        iM3169 = (C0619.m2761("ۧ֫") + i6) * 29;
                        i2 = ((iM3169 ^ i5) * (-11727)) ^ (-1493200284);
                        i3 = -1173301484;
                        LayoutInflater layoutInflater2 = layoutInflaterFrom;
                        i8 = iM3169 ^ i3;
                        i7 = i2;
                        layoutInflaterFrom = layoutInflater2;
                    } else {
                        iM31610 = (C0773.m3169("᩸۠") ^ i6) * (-95);
                        i7 = ((iM31610 ^ i5) * 30453) ^ 891038006;
                        i4 = -1268248280;
                        int i15 = iM31610 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i8 = i15;
                        c23068 = this;
                    }
                    break;
                case -1675684771:
                case -520706696:
                    layoutInflaterFrom = layoutInflaterFrom;
                    if (C0773.m3161() == 0) {
                        iM31610 = (C0773.m3169("ܿ᩶") ^ i6) * 31;
                        i7 = ((iM31610 ^ i5) * 10015) ^ (-745915484);
                        i4 = 621158499;
                        int i16 = iM31610 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i8 = i16;
                        c23068 = this;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        int iM31614 = (i6 - C0773.m3169("ܶ᩵")) * (-5);
                        i7 = ((iM31614 ^ i5) * 26941) ^ (-1827272754);
                        i8 = iM31614 ^ (-1089953287);
                        c23068 = this;
                    }
                    break;
                case -1614308121:
                case 1783321018:
                    viewM5408 = C1519.m5408(layoutInflaterFrom, i9, viewGroup, z);
                    if (!C4282.m13644()) {
                        int iM2765 = C0619.m2761("ۚ۠") ^ i5;
                        i7 = ((iM2765 ^ i6) * (-13179)) ^ 631597673;
                        i8 = iM2765 ^ 2040556464;
                    } else {
                        iM3169 = C0773.m3169("ۤܽ") ^ i6;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i2 = ((iM3169 ^ i5) * (-31783)) ^ 1044750973;
                        i3 = 736713168;
                        LayoutInflater layoutInflater3 = layoutInflaterFrom;
                        i8 = iM3169 ^ i3;
                        i7 = i2;
                        layoutInflaterFrom = layoutInflater3;
                    }
                    break;
                case -1552593485:
                case 5403191:
                    layoutInflaterFrom = layoutInflaterFrom;
                    i12 = 1;
                    if (C4282.f15546 > 0) {
                        iM3169 = C0773.m3169("ܽܺ") ^ i5;
                        i2 = ((iM3169 ^ i6) * (-30869)) ^ (-154363914);
                        i3 = -659405106;
                        LayoutInflater layoutInflater4 = layoutInflaterFrom;
                        i8 = iM3169 ^ i3;
                        i7 = i2;
                        layoutInflaterFrom = layoutInflater4;
                    } else {
                        iM31610 = (C0773.m3169("᩸۠") ^ i6) * (-95);
                        i7 = ((iM31610 ^ i5) * 30453) ^ 891038006;
                        i4 = -1268248280;
                        int i17 = iM31610 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i8 = i17;
                        c23068 = this;
                    }
                    break;
                case -1464047067:
                case 1589679250:
                    C2354.m7983();
                    if (C0619.f2439) {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM31610 = C0773.m3169("۫᩺") ^ i5;
                        i7 = ((iM31610 ^ i6) * 4451) ^ 2146993855;
                        i4 = 1305938935;
                        int i18 = iM31610 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i8 = i18;
                        c23068 = this;
                    }
                    layoutInflaterFrom = layoutInflaterFrom;
                    iM31610 = C0619.m2761("ᩴᩳ") ^ i5;
                    i7 = ((iM31610 ^ i6) * 19507) ^ 1892671337;
                    i4 = -1465639184;
                    int i19 = iM31610 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i8 = i19;
                    c23068 = this;
                    break;
                case -1052142261:
                case -33040142:
                    i11 = 16782;
                    iM31610 = C0773.m3169("ۧۧ") ^ i5;
                    i7 = ((iM31610 ^ i6) * (-10569)) ^ 1413964234;
                    i4 = -664872676;
                    int i110 = iM31610 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i8 = i110;
                    c23068 = this;
                    break;
                case -970953294:
                case 466548278:
                    layoutInflaterFrom = layoutInflaterFrom;
                    if ((s * 17848) - i10 <= 0) {
                        iM31610 = (C0773.m3169("ܳ֫") ^ i6) * (-111);
                        i7 = ((iM31610 ^ i5) * 6347) ^ 2008911196;
                        i4 = -1791636642;
                    } else {
                        iM31610 = (C0619.m2761("۫ᩳ") + i6) * (-83);
                        i7 = ((iM31610 ^ i5) * 20219) ^ 733543706;
                        i4 = -515163813;
                    }
                    int i111 = iM31610 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i8 = i111;
                    c23068 = this;
                    break;
                case -763577460:
                case 692987422:
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = sArr[0];
                    if (AbstractC3624.f12429 <= 0) {
                        iM31610 = C0773.m3169("۫᩺") ^ i5;
                        i7 = ((iM31610 ^ i6) * 4451) ^ 2146993855;
                        i4 = 1305938935;
                    } else {
                        iM31610 = (i6 - C0619.m2761("ܰۡ")) * q.h;
                        i7 = ((iM31610 ^ i5) * 4525) ^ (-1216913534);
                        i4 = 434346899;
                    }
                    int i112 = iM31610 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i8 = i112;
                    c23068 = this;
                    break;
                case -464713485:
                case 1738811568:
                    i11 = 14102;
                    iM31610 = C0773.m3169("ۧۧ") ^ i5;
                    i7 = ((iM31610 ^ i6) * (-10569)) ^ 1413964234;
                    i4 = -664872676;
                    int i113 = iM31610 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i8 = i113;
                    c23068 = this;
                    break;
                case -251364259:
                case 19221900:
                    return new ViewOnClickListenerC13371(c23068.f74836, viewM5408);
                case -59876841:
                case 962934097:
                    layoutInflaterFrom = layoutInflaterFrom;
                    int i20 = s + 4462;
                    i10 = i20 * i20;
                    if (C3734.m12152() >= 0) {
                        iM31610 = C0773.m3169("۫᩺") ^ i5;
                        i7 = ((iM31610 ^ i6) * 4451) ^ 2146993855;
                        i4 = 1305938935;
                    } else {
                        iM31610 = (i5 - C0619.m2761("ܺ۬")) * (-83);
                        i7 = ((iM31610 ^ i6) * (-14245)) ^ 867668757;
                        i4 = -1924889676;
                    }
                    int i114 = iM31610 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i8 = i114;
                    c23068 = this;
                    break;
                case 196878029:
                case 780677931:
                    layoutInflaterFrom = layoutInflaterFrom;
                    if (C13473.f42873 != 0) {
                        iM31610 = (C0773.m3169("᩸۠") ^ i6) * (-95);
                        i7 = ((iM31610 ^ i5) * 30453) ^ 891038006;
                        i4 = -1268248280;
                    } else {
                        iM31610 = (i5 - C0619.m2761("ۧ᩷")) * 89;
                        i7 = ((iM31610 ^ i6) * (-16547)) ^ 550743468;
                        i4 = -768890970;
                    }
                    int i115 = iM31610 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i8 = i115;
                    c23068 = this;
                    break;
                case 1114061254:
                case 1211889755:
                    layoutInflaterFrom = layoutInflaterFrom;
                    sArr = f74834;
                    if (C2375.f7641 <= 0) {
                        iM31610 = C0619.m2761("ᩴᩳ") ^ i5;
                        i7 = ((iM31610 ^ i6) * 19507) ^ 1892671337;
                        i4 = -1465639184;
                    } else {
                        iM31610 = C0619.m2761("ۘۨ") ^ i5;
                        i7 = ((iM31610 ^ i6) * (-21025)) ^ (-508433783);
                        i4 = -1657416372;
                    }
                    int i116 = iM31610 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i8 = i116;
                    c23068 = this;
                    break;
                default:
                    if (!C2878.f9462) {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM31610 = C0619.m2761("ᩴᩳ") ^ i5;
                        i7 = ((iM31610 ^ i6) * 19507) ^ 1892671337;
                        i4 = -1465639184;
                        int i117 = iM31610 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i8 = i117;
                        c23068 = this;
                    } else {
                        int iM2766 = C0619.m2761("ۚ۠") ^ i5;
                        i7 = ((iM2766 ^ i6) * (-13179)) ^ 631597673;
                        i8 = iM2766 ^ 2040556464;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC13371 viewOnClickListenerC13371 = null;
        ImageView imageView = null;
        ImageView imageView2 = null;
        Drawable drawable = null;
        PorterDuffColorFilter porterDuffColorFilterM9575 = null;
        int i2 = -932321851;
        int i3 = C0773.f2792;
        int i4 = AbstractC0641.f2496;
        int iM2761 = (C0619.m2761("ۢ᩺") ^ i3) * 95;
        int i5 = ((iM2761 ^ i4) * (-28463)) ^ (-986960759);
        int i6 = -1051140454;
        while (true) {
            i2 = ((((i2 ^ i4) * (-6017)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2077051568:
                case -562209689:
                    C11235.m28309();
                    C2354.m7983();
                    break;
                case -1904182676:
                case 341898519:
                    imageView2 = viewOnClickListenerC13371.f42616;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("᩺۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15141) ^ (-475814720);
                        i6 = 1374825978;
                    } else {
                        iM2761 = C0773.m3169("ܿܽ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 32473) ^ 1509695108;
                        i6 = -830009327;
                    }
                    break;
                case -1802221825:
                case -618363986:
                    if (C3690.f12684 > 0) {
                        iM2761 = C0619.m2761("᩺ܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8293) ^ 590091756;
                        i6 = 1171989990;
                    } else {
                        iM2761 = (C0619.m2761("ܶܿ") ^ i4) * q.h;
                        i5 = ((iM2761 ^ i3) * (-9021)) ^ 111407723;
                        i6 = -266778498;
                    }
                    break;
                case -1554712634:
                case 719066015:
                    imageView.setImageResource(ViewOnClickListenerC5914.f20232[i]);
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("᩸ۖ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-30871)) ^ (-229120906);
                        i6 = 1727903456;
                    } else {
                        iM2761 = C0773.m3169("᩺۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15141) ^ (-475814720);
                        i6 = 1374825978;
                    }
                    break;
                case -1069525770:
                case -1007145638:
                    drawable.setColorFilter(porterDuffColorFilterM9575);
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("ۤ᩹") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-6175)) ^ (-1100494151);
                        i6 = -156484116;
                    } else {
                        iM2761 = C0619.m2761("ۜ۬") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-29525)) ^ (-2079220838);
                        i6 = 1107432180;
                    }
                    break;
                case -1003261572:
                case 372798634:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩺ܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8293) ^ 590091756;
                        i6 = 1171989990;
                    } else {
                        iM2761 = C0619.m2761("ۙ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-10791)) ^ (-386543076);
                        i6 = -1863726417;
                    }
                    break;
                case -972612709:
                case 1967139273:
                    AbstractC0116.m1243();
                    if (!C3492.m11488()) {
                        iM2761 = (C0619.m2761("ܶܿ") ^ i4) * q.h;
                        i5 = ((iM2761 ^ i3) * (-9021)) ^ 111407723;
                        i6 = -266778498;
                    } else {
                        iM2761 = C0773.m3169("ۤ᩹") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-6175)) ^ (-1100494151);
                        i6 = -156484116;
                    }
                    break;
                case -934521397:
                case 1924500066:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("᩺۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15141) ^ (-475814720);
                        i6 = 1374825978;
                    } else {
                        iM2761 = C0773.m3169("۬᩹") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17451) ^ 2049941412;
                        i6 = -1662185387;
                    }
                    break;
                case -821195756:
                case -490446561:
                    if (C3448.f11240 < 0) {
                        iM2761 = (i3 - C0619.m2761("ܶۨ")) * 45;
                        i5 = ((iM2761 ^ i4) * (-25869)) ^ (-689520087);
                        i6 = 1358076514;
                    } else {
                        iM2761 = (C0619.m2761("ܶܿ") ^ i4) * q.h;
                        i5 = ((iM2761 ^ i3) * (-9021)) ^ 111407723;
                        i6 = -266778498;
                    }
                    break;
                case -552039479:
                case -495490784:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ܶۨ")) * 45;
                        i5 = ((iM2761 ^ i4) * (-25869)) ^ (-689520087);
                        i6 = 1358076514;
                    } else {
                        iM2761 = C0773.m3169("ܶۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 27987) ^ 659051883;
                        i6 = -1918846794;
                    }
                    break;
                case 528752488:
                case 975178673:
                    C13473.m33144();
                    iM2761 = C0773.m3169("ۤ᩹") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-6175)) ^ (-1100494151);
                    i6 = -156484116;
                    break;
                case 751979444:
                case 1508152814:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ܶۨ")) * 45;
                        i5 = ((iM2761 ^ i4) * (-25869)) ^ (-689520087);
                        i6 = 1358076514;
                    } else {
                        iM2761 = C0619.m2761("ۙ۫") ^ i3;
                        i5 = ((iM2761 ^ i4) * 2343) ^ (-1029233322);
                        i6 = -1160579504;
                    }
                    break;
                case 815575501:
                case 1910814670:
                    C2023.m6954(viewOnClickListenerC13371.f42618, ViewOnClickListenerC5914.f20233[i]);
                    break;
                case 1146249789:
                case 2070354948:
                    drawable = imageView2.getDrawable();
                    porterDuffColorFilterM9575 = C2930.m9575(C3296.f10758);
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("᩺۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15141) ^ (-475814720);
                        i6 = 1374825978;
                    } else {
                        iM2761 = C0773.m3169("ܳۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7967)) ^ (-617512460);
                        i6 = 1251288839;
                    }
                    break;
                case 1233316981:
                case 1493466705:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("᩺۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15141) ^ (-475814720);
                        i6 = 1374825978;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܳۜ")) * 37;
                        i5 = ((iM2761 ^ i3) * (-5453)) ^ (-268928874);
                        i6 = 1230633283;
                    }
                    break;
                default:
                    viewOnClickListenerC13371 = (ViewOnClickListenerC13371) abstractC11800;
                    imageView = viewOnClickListenerC13371.f42616;
                    if (C1783.m6232()) {
                        iM2761 = C0773.m3169("۟ܽ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21443)) ^ (-197311160);
                        i6 = 1480767240;
                    } else {
                        iM2761 = C0619.m2761("᩺ܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8293) ^ 590091756;
                        i6 = 1171989990;
                    }
                    break;
            }
            return;
        }
    }

    public C23068(ViewOnClickListenerC5914 viewOnClickListenerC5914, ViewOnClickListenerC5914 viewOnClickListenerC5915) {
        int i = -2053656016;
        int i2 = C1826.f6190;
        int i3 = C1519.f5300;
        this.f74836 = viewOnClickListenerC5914;
        int iM3169 = C0773.m3169("۟۫") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-28821)) ^ 1605888044;
        int i5 = 1516487029;
        while (true) {
            i = ((((i ^ i3) * 8031) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1725024819:
                case -965810797:
                    C1826.m6301();
                    if (C2310.m7813() > 0) {
                        iM3169 = (i3 - C0773.m3169("۠᩹")) * 51;
                        i4 = ((iM3169 ^ i2) * 2717) ^ 1395114638;
                        i5 = -85820435;
                    } else {
                        iM3169 = C0773.m3169("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27191) ^ 1493673447;
                        i5 = 1557702232;
                    }
                    break;
                case -1461876498:
                case 1048979838:
                    this.f74835 = viewOnClickListenerC5915;
                    if (C1080.m4050()) {
                        iM3169 = (i2 - C0619.m2761("ۢܽ")) * 119;
                        i4 = ((iM3169 ^ i3) * 26493) ^ 1541006592;
                        i5 = -1229383646;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۛᩴ")) * (-33);
                        i4 = ((iM3169 ^ i3) * 8023) ^ 212620347;
                        i5 = -1345579373;
                    }
                    break;
                case -1432792593:
                case 77447677:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i3 - C0773.m3169("۠᩹")) * 51;
                        i4 = ((iM3169 ^ i2) * 2717) ^ 1395114638;
                        i5 = -85820435;
                    } else {
                        iM3169 = C0619.m2761("ۡۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16723)) ^ 2032193914;
                        i5 = 1067376050;
                    }
                    break;
                case -1291653518:
                case 828187206:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۛᩴ")) * (-33);
                        i4 = ((iM3169 ^ i3) * 8023) ^ 212620347;
                        i5 = -1345579373;
                    } else {
                        iM3169 = C0619.m2761("ۙ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29585) ^ (-645095679);
                        i5 = -347036759;
                    }
                    break;
                case -1226716916:
                case 71134776:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("֨ᩴ") ^ i2) * (-77);
                        i4 = ((iM3169 ^ i3) * (-13357)) ^ 927707828;
                        i5 = 1623008386;
                    } else {
                        iM3169 = (C0773.m3169("ۖ᩺") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * 1835) ^ (-1148916620);
                        i5 = -647213651;
                    }
                    break;
                case -861205674:
                case 2046830606:
                    C3734.m12152();
                    iM3169 = C0773.m3169("۫ۨ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 27191) ^ 1493673447;
                    i5 = 1557702232;
                    break;
                case -832808729:
                case 1143156698:
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27191) ^ 1493673447;
                        i5 = 1557702232;
                    } else {
                        iM3169 = C0773.m3169("۬ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9857) ^ 597280930;
                        i5 = -2129812503;
                    }
                    break;
                case -772690538:
                case 943540450:
                    C2288.m7767();
                    throw new RuntimeException();
                case -713790928:
                case 2095414015:
                    if (!RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("֫֫") ^ i3) * 67;
                        i4 = ((iM3169 ^ i2) * 1219) ^ (-1357393034);
                        i5 = 67366867;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۛᩴ")) * (-33);
                        i4 = ((iM3169 ^ i3) * 8023) ^ 212620347;
                        i5 = -1345579373;
                    }
                    break;
                case -471466452:
                case 1584655879:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("֫֫") ^ i3) * 67;
                        i4 = ((iM3169 ^ i2) * 1219) ^ (-1357393034);
                        i5 = 67366867;
                    } else {
                        iM3169 = (C0773.m3169("ۡܽ") + i2) * (-7);
                        i4 = ((iM3169 ^ i3) * 18789) ^ (-405307664);
                        i5 = 216575757;
                    }
                    break;
                case -175401910:
                case 1659647550:
                    return;
                case -145450145:
                case 875489913:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۛᩴ")) * (-33);
                        i4 = ((iM3169 ^ i3) * 8023) ^ 212620347;
                        i5 = -1345579373;
                    } else {
                        iM3169 = (C0619.m2761("᩷ۤ") + i2) * 119;
                        i4 = ((iM3169 ^ i3) * (-4297)) ^ (-1876197599);
                        i5 = 1592424480;
                    }
                    break;
                case 4121155:
                case 1372572877:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("֫֫") ^ i3) * 67;
                        i4 = ((iM3169 ^ i2) * 1219) ^ (-1357393034);
                        i5 = 67366867;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7241)) ^ 754178615;
                        i5 = -605836519;
                    }
                    break;
                case 371727601:
                case 1365183425:
                    C2485.m8357();
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("֫֫") ^ i3) * 67;
                        i4 = ((iM3169 ^ i2) * 1219) ^ (-1357393034);
                        i5 = 67366867;
                    } else {
                        iM3169 = C0773.m3169("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27191) ^ 1493673447;
                        i5 = 1557702232;
                    }
                    break;
                case 872373321:
                case 1352502390:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27191) ^ 1493673447;
                        i5 = 1557702232;
                    } else {
                        iM3169 = (C0773.m3169("ۨ۟") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * 17163) ^ 1768191181;
                        i5 = 1010874243;
                    }
                    break;
                default:
                    if (RunnableC3646.f12471) {
                        iM3169 = (i2 - C0619.m2761("ۛᩴ")) * (-33);
                        i4 = ((iM3169 ^ i3) * 8023) ^ 212620347;
                        i5 = -1345579373;
                    } else {
                        iM3169 = (C0619.m2761("۟ۢ") + i2) * (-111);
                        i4 = ((iM3169 ^ i3) * (-1777)) ^ 44637638;
                        i5 = 68946096;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        int[] unused = ViewOnClickListenerC5914.f20232;
        return 15;
    }
}
