package l;

import android.view.View;
import android.widget.CheckedTextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.pqc.crypto.lms.LM_OTS;

/* JADX INFO: renamed from: l.ۢᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10292 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩷ܶ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f32864 = {1493, -32377, -32358, -32362, -32368, -32381, LM_OTS.D_MESG, -32362, -32323, -32381, -32366, -32375, -32323, -32367, -32371, -32368, -32362, -32323, -32384, -32357, -32377, -32358, -32362, -32368, -32381, LM_OTS.D_MESG, -32362, -32323, -32381, -32366, -32375, -32323, -32367, -32371, -32368, -32362, -32323, -32368, -32377, -32364, -32377, -32368, -32367, -32377};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7793 f32865;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f32866;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckedTextView f32867;

    /* JADX WARN: Code duplicated, block: B:22:0x009e A[PHI: r8
      0x009e: PHI (r8v4 l.ۗۢ֫) = (r8v3 l.ۗۢ֫), (r8v2 l.ۗۢ֫), (r8v2 l.ۗۢ֫), (r8v2 l.ۗۢ֫) binds: [B:21:0x009c, B:15:0x007d, B:13:0x007a, B:10:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x014e A[PHI: r5 r6 r7
      0x014e: PHI (r5v4 l.ᩳ֫ܺ) = (r5v3 l.ᩳ֫ܺ), (r5v2 l.ᩳ֫ܺ), (r5v2 l.ᩳ֫ܺ), (r5v2 l.ᩳ֫ܺ) binds: [B:37:0x014c, B:25:0x00d2, B:10:0x0075, B:7:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r6v4 boolean) = (r6v3 boolean), (r6v2 boolean), (r6v2 boolean), (r6v2 boolean) binds: [B:37:0x014c, B:25:0x00d2, B:10:0x0075, B:7:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r7v4 l.ۗۢ֫) = (r7v2 l.ۗۢ֫), (r7v3 l.ۗۢ֫), (r7v2 l.ۗۢ֫), (r7v2 l.ۗۢ֫) binds: [B:37:0x014c, B:25:0x00d2, B:10:0x0075, B:7:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0187 A[PHI: r9 r10 r11
      0x0187: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]) binds: [B:41:0x0185, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:41:0x0185, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:41:0x0185, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0258 A[PHI: r2 r3 r4 r17 r18
      0x0258: PHI (r2v4 l.ᩳ֫ܺ) = (r2v2 l.ᩳ֫ܺ), (r2v3 l.ᩳ֫ܺ), (r2v2 l.ᩳ֫ܺ) binds: [B:59:0x0256, B:45:0x01c3, B:7:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r3v4 l.۟ۢ֫) = (r3v2 l.۟ۢ֫), (r3v3 l.۟ۢ֫), (r3v2 l.۟ۢ֫) binds: [B:59:0x0256, B:45:0x01c3, B:7:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:59:0x0256, B:45:0x01c3, B:7:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:59:0x0256, B:45:0x01c3, B:7:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:59:0x0256, B:45:0x01c3, B:7:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM2761;
        int i;
        int i2;
        short[] sArr;
        ViewOnClickListenerC10292 viewOnClickListenerC10292 = this;
        int i3 = 715368714;
        int i4 = C4238.f15451;
        int i5 = C3033.f9831;
        int iM3169 = C0773.m3169("ۙ᩸") ^ i5;
        int i6 = ((iM3169 ^ i4) * 14833) ^ 1763178426;
        int i7 = iM3169 ^ (-1354342585);
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        InterfaceC18752 interfaceC18752Mo3486 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        InterfaceC18752 interfaceC18752M8173 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        C3318 c3318 = null;
        C3318 c3319 = null;
        boolean zIsChecked = false;
        while (true) {
            i3 = i7 ^ (i6 & (((i3 ^ i4) * (-901)) >> 31));
            switch (i3) {
                case -2035191768:
                case -1575326298:
                    sArr3 = f32864;
                    i9 = 1;
                    i10 = 19;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("֫ܺ") ^ i5;
                        i = ((iM2761 ^ i4) * (-29413)) ^ 1430695618;
                        i2 = -2045965844;
                    } else {
                        iM2761 = C0619.m2761("ܿۖ") ^ i5;
                        i = ((iM2761 ^ i4) * 8059) ^ (-2051328096);
                        i2 = -1772232892;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -2004224088:
                case 1051886856:
                    C11235.m28308(C17202.m40375(interfaceC18752Mo3486, C3998.m12925(sArr4, i11, 24, i12), zIsChecked));
                    if (C2023.m6964() > 0) {
                        iM2761 = (C0773.m3169("ۙܽ") ^ i5) * (-19);
                        i = ((iM2761 ^ i4) * (-13051)) ^ (-437037779);
                        i2 = 34958207;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM31610 = C0773.m3169("᩹᩶") ^ i5;
                        i7 = iM31610 ^ (-1473736741);
                        sArr2 = sArr;
                        i6 = ((iM31610 ^ i4) * 27377) ^ 1730906805;
                        viewOnClickListenerC10292 = this;
                    }
                    break;
                case -1769228319:
                case 350198042:
                    C2485.m8357();
                    C4238.m13540();
                    break;
                case -1670911617:
                case 814546921:
                    c3319 = viewOnClickListenerC7793.f25880.f39446;
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("ۘۢ") + i4) * (-121);
                        i = ((iM2761 ^ i5) * (-15735)) ^ (-1117604529);
                        i2 = 399879731;
                    } else {
                        iM2761 = (C0619.m2761("۟᩻") ^ i4) * (-37);
                        i = ((iM2761 ^ i5) * (-26187)) ^ (-758376021);
                        i2 = 1005139146;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1511739048:
                case 448633890:
                    if (i14 - (i15 + 1) < 0) {
                        iM2761 = (i5 - C0773.m3169("۬ܶ")) * 87;
                        i = ((iM2761 ^ i4) * 15023) ^ 356650404;
                        i2 = 506604015;
                    } else {
                        iM2761 = C0773.m3169("۫ܺ") ^ i5;
                        i = ((iM2761 ^ i4) * 9849) ^ (-53995583);
                        i2 = -2102885647;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1400394371:
                case 321937239:
                    c3319.m10933();
                    c3318 = viewOnClickListenerC7793.f25872.f39446;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ᩳܰ") ^ i4;
                        i = ((iM2761 ^ i5) * 21369) ^ (-2076692651);
                        i2 = 541045205;
                    } else {
                        iM2761 = C0773.m3169("᩵֨") ^ i5;
                        i = ((iM2761 ^ i4) * 11147) ^ 615360055;
                        i2 = -1604232436;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1342204980:
                case 355980202:
                    interfaceC18752M8173 = C2419.m8173(ApplicationC17729.f58258);
                    viewOnClickListenerC7793 = viewOnClickListenerC10292.f32865;
                    i8 = viewOnClickListenerC7793.f25893;
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0619.m2761("ᩳ֡") + i4) * (-105);
                        i = ((iM2761 ^ i5) * (-6917)) ^ (-1502575129);
                        i2 = 1693596818;
                    } else {
                        iM2761 = (C0773.m3169("᩻᩹") + i4) * 15;
                        i = ((iM2761 ^ i5) * (-21115)) ^ 126090305;
                        i2 = 385111631;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1260447202:
                case -774643768:
                    s = sArr2[c];
                    i13 = s + 1;
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("ᩳ֡") + i4) * (-105);
                        i = ((iM2761 ^ i5) * (-6917)) ^ (-1502575129);
                        i2 = 1693596818;
                    } else {
                        iM2761 = C0619.m2761("ۢۚ") ^ i4;
                        i = ((iM2761 ^ i5) * (-2969)) ^ (-1860094422);
                        i2 = -1639579209;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1255595562:
                case 1418363102:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ᩳܰ") ^ i4;
                        i = ((iM2761 ^ i5) * 21369) ^ (-2076692651);
                        i2 = 541045205;
                    } else {
                        iM2761 = C0619.m2761("֫ܺ") ^ i5;
                        i = ((iM2761 ^ i4) * (-29413)) ^ 1430695618;
                        i2 = -2045965844;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -939778721:
                case -237508763:
                    sArr4 = f32864;
                    i11 = 20;
                    if (C4238.f15451 < 0) {
                        iM2761 = C0773.m3169("᩺᩵") ^ i5;
                        i = ((iM2761 ^ i4) * (-8843)) ^ 800736184;
                        i2 = 1733729081;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM31611 = C0773.m3169("᩹᩶") ^ i5;
                        i7 = iM31611 ^ (-1473736741);
                        sArr2 = sArr;
                        i6 = ((iM31611 ^ i4) * 27377) ^ 1730906805;
                        viewOnClickListenerC10292 = this;
                    }
                    break;
                case -748966663:
                case 1836350708:
                    i12 = 33250;
                    iM2761 = (C0773.m3169("᩺۫") + i4) * (-81);
                    i = ((iM2761 ^ i5) * 8079) ^ (-2114513806);
                    i2 = -2130685750;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -356535363:
                case 1769435747:
                    C4238.m13540();
                    if (C3734.m12152() >= 0) {
                        iM2761 = C0619.m2761("ᩳܰ") ^ i4;
                        i = ((iM2761 ^ i5) * 21369) ^ (-2076692651);
                        i2 = 541045205;
                    } else {
                        iM2761 = (C0619.m2761("ۘۢ") + i4) * (-121);
                        i = ((iM2761 ^ i5) * (-15735)) ^ (-1117604529);
                        i2 = 399879731;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -165705723:
                case 2038504345:
                    interfaceC18752Mo3486 = interfaceC18752M8173.mo3486(i8, C0862.m3500(sArr3, i9, i10, i12));
                    zIsChecked = viewOnClickListenerC10292.f32867.isChecked();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ۘۢ") + i4) * (-121);
                        i = ((iM2761 ^ i5) * (-15735)) ^ (-1117604529);
                        i2 = 399879731;
                    } else {
                        iM2761 = (i4 - C0773.m3169("۬ۜ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2761 ^ i5) * 10615) ^ 765739457;
                        i2 = -926652846;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 513270164:
                case 1083871826:
                    sArr = f32864;
                    c = 0;
                    if (C1321.f4751 < 0) {
                        int iM31612 = (C0773.m3169("ۗ۠") + i5) * (-11);
                        i = ((iM31612 ^ i4) * 20153) ^ (-595356928);
                        i7 = iM31612 ^ 1616040039;
                        viewOnClickListenerC10292 = this;
                        sArr2 = sArr;
                        i6 = i;
                    } else {
                        int iM31613 = C0773.m3169("᩹᩶") ^ i5;
                        i7 = iM31613 ^ (-1473736741);
                        sArr2 = sArr;
                        i6 = ((iM31613 ^ i4) * 27377) ^ 1730906805;
                        viewOnClickListenerC10292 = this;
                    }
                    break;
                case 686940326:
                case 1424638897:
                    i14 = i13 * i13;
                    i15 = s * 2;
                    if (C2966.f9654 < 0) {
                        iM2761 = (i4 - C0773.m3169("ۚ۫")) * (-63);
                        i = ((iM2761 ^ i5) * 26761) ^ (-2005157768);
                        i2 = 329283578;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM31614 = C0773.m3169("᩹᩶") ^ i5;
                        i7 = iM31614 ^ (-1473736741);
                        sArr2 = sArr;
                        i6 = ((iM31614 ^ i4) * 27377) ^ 1730906805;
                        viewOnClickListenerC10292 = this;
                    }
                    break;
                case 757402895:
                case 1775344809:
                    C3734.m12152();
                    iM2761 = C0619.m2761("ᩳܰ") ^ i4;
                    i = ((iM2761 ^ i5) * 21369) ^ (-2076692651);
                    i2 = 541045205;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 1207427948:
                case 2111580263:
                    RunnableC3646.m11813();
                    if (C23916.m53419() != 0) {
                        iM2761 = (C0619.m2761("ۘۢ") + i4) * (-121);
                        i = ((iM2761 ^ i5) * (-15735)) ^ (-1117604529);
                        i2 = 399879731;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ֡") + i4) * (-105);
                        i = ((iM2761 ^ i5) * (-6917)) ^ (-1502575129);
                        i2 = 1693596818;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case 1337868661:
                case 1630809906:
                    c3318.m10933();
                    C2375.m8064(viewOnClickListenerC10292.f32866);
                    break;
                default:
                    i12 = 41498;
                    iM2761 = (C0773.m3169("᩺۫") + i4) * (-81);
                    i = ((iM2761 ^ i5) * 8079) ^ (-2114513806);
                    i2 = -2130685750;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC10292(ViewOnClickListenerC7793 viewOnClickListenerC7793, CheckedTextView checkedTextView, DialogInterfaceC8327 dialogInterfaceC8327) {
        int i = 1441818500;
        int i2 = C3492.f12043;
        int i3 = C2375.f7641;
        int iM3169 = C0773.m3169("ۙۙ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 26317) ^ 716032945;
        int i5 = 819800080;
        while (true) {
            i = ((((i ^ i2) * 28147) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1683924216:
                case 663613804:
                    C2310.m7813();
                    C1321.m4852();
                    throw new RuntimeException();
                case -1668270510:
                case 2032558890:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ۧᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32185) ^ (-546918970);
                        i5 = -360637015;
                    } else {
                        iM3169 = (C0773.m3169("ᩳۢ") ^ i2) * 41;
                        i4 = ((iM3169 ^ i3) * 32617) ^ (-330631019);
                        i5 = 465717562;
                    }
                    break;
                case -1481589290:
                case -827655056:
                    C0862.m3503();
                    C2287.m7745();
                    iM3169 = (C0619.m2761("ۛ۬") ^ i2) * (-125);
                    i4 = ((iM3169 ^ i3) * (-32525)) ^ (-1009941625);
                    i5 = -618684384;
                    break;
                case -1319999832:
                case 1141073737:
                    this.f32865 = viewOnClickListenerC7793;
                    this.f32867 = checkedTextView;
                    if (C0619.m2763()) {
                        iM3169 = C0773.m3169("ۧᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32185) ^ (-546918970);
                        i5 = -360637015;
                    } else {
                        iM3169 = (C0773.m3169("ۜܺ") ^ i2) * 115;
                        i4 = ((iM3169 ^ i3) * (-5287)) ^ 1088383862;
                        i5 = 739985169;
                    }
                    break;
                case -1033053439:
                case -307758205:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("ۛ۬") ^ i2) * (-125);
                        i4 = ((iM3169 ^ i3) * (-32525)) ^ (-1009941625);
                        i5 = -618684384;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ᩳۨ")) * (-59);
                        i4 = ((iM3169 ^ i2) * (-18523)) ^ 618266729;
                        i5 = 1750348830;
                    }
                    break;
                case -883011039:
                case 230761311:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ۛ۬") ^ i2) * (-125);
                        i4 = ((iM3169 ^ i3) * (-32525)) ^ (-1009941625);
                        i5 = -618684384;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩵") + i2) * (-33);
                        i4 = ((iM3169 ^ i3) * 9593) ^ 1763853374;
                        i5 = 1635718285;
                    }
                    break;
                case -872466879:
                case 1340326069:
                    this.f32866 = dialogInterfaceC8327;
                    return;
                case -815635423:
                case 1395299165:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("֨᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32713)) ^ (-648623226);
                        i5 = 970725478;
                    } else {
                        iM3169 = C0773.m3169("᩻ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24413)) ^ 1392630462;
                        i5 = -1720036386;
                    }
                    break;
                case -648874626:
                case -608524220:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0619.m2761("ۧᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18759) ^ (-663393512);
                        i5 = 1755813720;
                    } else {
                        iM3169 = C0773.m3169("᩹᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22939) ^ (-2095093637);
                        i5 = 1716729906;
                    }
                    break;
                case -394833439:
                case 2068970493:
                    C2419.m8174();
                    if (!C0619.f2439) {
                        iM3169 = (C0619.m2761("ۘ۟") + i3) * 43;
                        i4 = ((iM3169 ^ i2) * (-16473)) ^ (-1005768391);
                        i5 = 104269654;
                    } else {
                        iM3169 = C0619.m2761("֨᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32713)) ^ (-648623226);
                        i5 = 970725478;
                    }
                    break;
                case -51980366:
                case 230143989:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۧᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32185) ^ (-546918970);
                        i5 = -360637015;
                    } else {
                        iM3169 = C0619.m2761("ܶۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25849)) ^ (-35207684);
                        i5 = 1231324181;
                    }
                    break;
                case 211797532:
                case 1519582894:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("ۧᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32185) ^ (-546918970);
                        i5 = -360637015;
                    } else {
                        iM3169 = C0619.m2761("ܳᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14973) ^ 562526649;
                        i5 = -1088332903;
                    }
                    break;
                case 310654682:
                case 311354218:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0619.m2761("ۘ۟") + i3) * 43;
                        i4 = ((iM3169 ^ i2) * (-16473)) ^ (-1005768391);
                        i5 = 104269654;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۛ") + i2) * (-99);
                        i4 = ((iM3169 ^ i3) * (-27105)) ^ (-1839438869);
                        i5 = -1996229935;
                    }
                    break;
                case 598334206:
                case 697688012:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 13963) ^ 1495494621;
                        i5 = -1082122847;
                    } else {
                        iM3169 = C0619.m2761("ۧᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18759) ^ (-663393512);
                        i5 = 1755813720;
                    }
                    break;
                case 1291994573:
                case 1564738117:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0619.m2761("ۘ۟") + i3) * 43;
                        i4 = ((iM3169 ^ i2) * (-16473)) ^ (-1005768391);
                        i5 = 104269654;
                    } else {
                        iM3169 = (C0619.m2761("ۛ۬") ^ i2) * (-125);
                        i4 = ((iM3169 ^ i3) * (-32525)) ^ (-1009941625);
                        i5 = -618684384;
                    }
                    break;
                default:
                    C2834.m9344();
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ۧᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18759) ^ (-663393512);
                        i5 = 1755813720;
                    } else {
                        iM3169 = C0619.m2761("֨᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32713)) ^ (-648623226);
                        i5 = 970725478;
                    }
                    break;
            }
        }
    }
}
