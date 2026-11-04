package l;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩸۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22820 extends AbstractC21572 {

    /* JADX INFO: renamed from: ܺۜᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f73951 = {3119, 13030, -5133, 9064, 4358, 1350, 151, -1787, 184, -3177, -5511, -4366, -390, -1867, 13253};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19987 f73952;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AccelerateInterpolator f73953;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f73954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f73955;

    /* JADX WARN: Code duplicated, block: B:32:0x00fb A[PHI: r13 r14
      0x00fb: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:31:0x00f9, B:9:0x0055, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:31:0x00f9, B:9:0x0055, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01cb A[PHI: r1 r8 r9 r12
      0x01cb: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v2 int), (r1v2 int) binds: [B:50:0x01c9, B:35:0x012f, B:17:0x0068, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:50:0x01c9, B:35:0x012f, B:17:0x0068, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:50:0x01c9, B:35:0x012f, B:17:0x0068, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:50:0x01c9, B:35:0x012f, B:17:0x0068, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0240 A[PHI: r4 r7 r10
      0x0240: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:62:0x023e, B:54:0x0200, B:46:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:62:0x023e, B:54:0x0200, B:46:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:62:0x023e, B:54:0x0200, B:46:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0274 A[PHI: r19
      0x0274: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:66:0x0272, B:12:0x005b, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02a6 A[PHI: r5 r6
      0x02a6: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:70:0x02a4, B:58:0x021f, B:15:0x0064, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:70:0x02a4, B:58:0x021f, B:15:0x0064, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerClosed(View view) {
        int iM3169;
        int i;
        int i2;
        int i3 = C2287.f7432;
        int i4 = AbstractC3624.f12429;
        int iM31610 = C0773.m3169("᩶ۜ") ^ i4;
        int i5 = ((iM31610 ^ i3) * 26563) ^ (-562555232);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-645182008);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1528603097;
        Main main = null;
        int iM3792 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-1227)) >> 31));
            switch (i14) {
                case -2104288254:
                case -2055183877:
                    c = 0;
                    if (C1146.m4231()) {
                        iM3169 = (C0619.m2761("ۢ۠") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i4) * (-3535)) ^ 636506378;
                        i2 = 112396019;
                    } else {
                        iM3169 = C0773.m3169("ۘ۠") ^ i4;
                        i = ((iM3169 ^ i3) * (-19803)) ^ (-175396015);
                        i2 = -1877996809;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2012577687:
                case 748263512:
                    if (iM3792 == (C0619.m2761(C1519.m5399(sArr2, i12, i13, i11)) ^ 2130540421)) {
                        iM3169 = (C0619.m2761("ۛ֡") + i3) * (-35);
                        i = ((iM3169 ^ i4) * (-23827)) ^ 1815999420;
                        i2 = -1222736446;
                    } else {
                        iM3169 = C0773.m3169("ᩳ۬") ^ i4;
                        i = ((iM3169 ^ i3) * (-31127)) ^ (-1958789054);
                        i2 = 1885187624;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1953976085:
                case -1838850780:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("᩹ᩴ") + i3) * (-77);
                        i = ((iM3169 ^ i4) * (-4617)) ^ 1250581979;
                        i2 = -1704952245;
                    } else {
                        iM3169 = C0773.m3169("֡ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12939)) ^ 331443827;
                        i2 = 1391381394;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1929954124:
                case 2070005827:
                    s = sArr[c];
                    s2 = 4075;
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("᩹ᩴ") + i3) * (-77);
                        i = ((iM3169 ^ i4) * (-4617)) ^ 1250581979;
                        i2 = -1704952245;
                    } else {
                        iM3169 = C0773.m3169("ۤۗ") ^ i4;
                        i = ((iM3169 ^ i3) * 10247) ^ (-182309676);
                        i2 = -425890846;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1831549920:
                case 1556277039:
                    i12 = 1;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ۚۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12513)) ^ 1788016224;
                        i2 = 740341440;
                    } else {
                        iM3169 = (C0619.m2761("۠ܶ") ^ i3) * (-25);
                        i = ((iM3169 ^ i4) * 17127) ^ 1529895245;
                        i2 = 1709126477;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1705482118:
                case 1423269500:
                    i10 = 16605625;
                    if (C2288.m7767()) {
                        iM3169 = C0773.m3169("ۘ۠") ^ i4;
                        i = ((iM3169 ^ i3) * (-19803)) ^ (-175396015);
                        i2 = -1877996809;
                    } else {
                        iM3169 = C0773.m3169("ܳۜ") ^ i4;
                        i = ((iM3169 ^ i3) * 1281) ^ (-736052051);
                        i2 = -39168581;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1497761590:
                case 1277407392:
                    RunnableC0334.m2063();
                    RunnableC3055.m9933();
                    break;
                case -1441077333:
                case -755375880:
                    sArr = f73951;
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (i4 - C0619.m2761("ۙܰ")) * (-27);
                        i = ((iM3169 ^ i3) * (-7993)) ^ 620566951;
                        i2 = -342173105;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩵۫")) * (-91);
                        i = ((iM3169 ^ i3) * 27219) ^ (-1660031538);
                        i2 = -2126222330;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1405619327:
                case 42975796:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("᩹ᩴ") + i3) * (-77);
                        i = ((iM3169 ^ i4) * (-4617)) ^ 1250581979;
                        i2 = -1704952245;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۙܰ")) * (-27);
                        i = ((iM3169 ^ i3) * (-7993)) ^ 620566951;
                        i2 = -342173105;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1385128869:
                case -334572705:
                    i7 = s + s2;
                    if (C1321.m4852()) {
                        iM3169 = C0619.m2761("ܿۡ") ^ i4;
                        i = ((iM3169 ^ i3) * (-15739)) ^ 817988277;
                        i2 = 839249226;
                    } else {
                        iM3169 = C0773.m3169("ۘ۠") ^ i4;
                        i = ((iM3169 ^ i3) * (-19803)) ^ (-175396015);
                        i2 = -1877996809;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1291418794:
                case -309931417:
                    C2287.m7745();
                    C3099.m10095();
                    iM3169 = (C0773.m3169("᩸᩺") + i4) * (-89);
                    i = ((iM3169 ^ i3) * (-8281)) ^ 644605057;
                    i2 = 1071429598;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1236821896:
                case -839229153:
                    int i15 = i9 + i10;
                    if (i8 - (i15 + i15) <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۧܰ")) * 115;
                        i = ((iM3169 ^ i4) * 2159) ^ 1176616994;
                        i2 = -1429953114;
                    } else {
                        iM3169 = C0773.m3169("ۧ۠") ^ i4;
                        i = ((iM3169 ^ i3) * (-7061)) ^ 1524291311;
                        i2 = 306958543;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1156067189:
                case -75139297:
                    iM3792 = C0950.m3792(view);
                    sArr2 = f73951;
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("᩸᩺") + i4) * (-89);
                        i = ((iM3169 ^ i3) * (-8281)) ^ 644605057;
                        i2 = 1071429598;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۢ") + i4) * (-113);
                        i = ((iM3169 ^ i3) * 11017) ^ 878771871;
                        i2 = -399089863;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -877063087:
                case 407187848:
                    main = this.f73954;
                    if (main.f22 != null) {
                        int iM31611 = (C0773.m3169("ܰܺ") + i4) * (-79);
                        i5 = ((iM31611 ^ i3) * 15253) ^ (-848989068);
                        i6 = iM31611 ^ 1258628646;
                    } else {
                        iM3169 = C0773.m3169("ᩳ۬") ^ i4;
                        i = ((iM3169 ^ i3) * (-31127)) ^ (-1958789054);
                        i2 = 1885187624;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -628270670:
                case 216355495:
                    main.f22.m24481(false);
                    iM3169 = C0773.m3169("ᩳ۬") ^ i4;
                    i = ((iM3169 ^ i3) * (-31127)) ^ (-1958789054);
                    i2 = 1885187624;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -604112331:
                case 80863155:
                    if (C0862.m3503()) {
                        iM3169 = C0619.m2761("ۚۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12513)) ^ 1788016224;
                        i2 = 740341440;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۙܰ")) * (-27);
                        i = ((iM3169 ^ i3) * (-7993)) ^ 620566951;
                        i2 = -342173105;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -581442323:
                case 1504061404:
                    i11 = 42463;
                    iM3169 = C0619.m2761("ܳ᩻") ^ i3;
                    i = ((iM3169 ^ i4) * (-29775)) ^ (-474789521);
                    i2 = 2073170110;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -557203502:
                case 553386246:
                    i11 = 45545;
                    iM3169 = C0619.m2761("ܳ᩻") ^ i3;
                    i = ((iM3169 ^ i4) * (-29775)) ^ (-474789521);
                    i2 = 2073170110;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 195408595:
                case 1001635643:
                    break;
                case 269049458:
                case 2045255938:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("᩸᩺") + i4) * (-89);
                        i = ((iM3169 ^ i3) * (-8281)) ^ 644605057;
                        i2 = 1071429598;
                    } else {
                        iM3169 = (C0619.m2761("ۜۜ") + i3) * 25;
                        i = ((iM3169 ^ i4) * (-2245)) ^ (-1547522705);
                        i2 = -692682723;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 361323888:
                case 1132239917:
                    RunnableC0334.m2063();
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("᩸᩺") + i4) * (-89);
                        i = ((iM3169 ^ i3) * (-8281)) ^ 644605057;
                        i2 = 1071429598;
                    } else {
                        iM3169 = (C0773.m3169("᩹ᩴ") + i3) * (-77);
                        i = ((iM3169 ^ i4) * (-4617)) ^ 1250581979;
                        i2 = -1704952245;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i13 = 3;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ۚۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-12513)) ^ 1788016224;
                        i2 = 740341440;
                    } else {
                        iM3169 = (C0619.m2761("᩻۠") + i3) * (-111);
                        i = ((iM3169 ^ i4) * 14341) ^ (-1777070651);
                        i2 = 1489115126;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0209  */
    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerSlide(View view, float f) {
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int iM3169;
        int i5;
        int i6;
        this = this;
        view = view;
        int i7 = C11235.f35427;
        int i8 = C2354.f7599;
        int iM31610 = (C0773.m3169("֨ۛ") ^ i7) * (-45);
        int i9 = ((iM31610 ^ i8) * 26727) ^ 699644040;
        Main main = null;
        C16390 c16390 = null;
        C19987 c19987 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM31610 ^ 1230275416;
        int i11 = 0;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        int iM13536 = 0;
        float interpolation = 0.0f;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 0;
        int iM31611 = 0;
        int iM3792 = 0;
        int i16 = 887705302;
        int i17 = 0;
        short[] sArr3 = null;
        int i18 = 0;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i8) * (-31027)) >> 31));
            switch (i16) {
                case -2072695416:
                case 1747681974:
                    if (this.f73955) {
                        iM3169 = (i8 - C0773.m3169("ۡ᩸")) * (-53);
                        i5 = ((iM3169 ^ i7) * (-20941)) ^ (-741655518);
                        i6 = -294460165;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ۠") + i7) * 5;
                        i5 = ((iM3169 ^ i8) * 29589) ^ (-122468257);
                        i6 = -641536841;
                    }
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case -2057312184:
                case 798424730:
                    short[] sArr4 = sArr;
                    int i19 = i14;
                    int i20 = iM3792;
                    i = i17;
                    if (C3734.f12817 < 0) {
                        int iM2762 = C0619.m2761("᩶۬") ^ i8;
                        i10 = iM2762 ^ 666205439;
                        i9 = ((iM2762 ^ i7) * 18235) ^ 2120552455;
                        i14 = i19;
                        i17 = i;
                        iM3792 = i20;
                        sArr = sArr4;
                        i15 = 3;
                        this = this;
                        view = view;
                    } else {
                        i14 = i19;
                        iM3792 = i20;
                        sArr = sArr4;
                        i15 = 3;
                        int iM31612 = (C0773.m3169("ۛܳ") ^ i7) * 55;
                        i9 = (-483639446) ^ ((iM31612 ^ i8) * 26599);
                        i10 = iM31612 ^ 572000254;
                        this = this;
                        view = view;
                        i17 = i;
                    }
                    break;
                case -2000562062:
                case -1827909256:
                    if (this.f73955) {
                        iM3169 = (C0619.m2761("ᩴ۠") + i7) * 5;
                        i5 = ((iM3169 ^ i8) * 29589) ^ (-122468257);
                        i6 = -641536841;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۨۜ")) * (-99);
                        i5 = ((iM3169 ^ i8) * (-24455)) ^ 18771785;
                        i6 = 1705819761;
                    }
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case -1946432868:
                case -1940963536:
                    if (C1321.f4751 >= 0) {
                        i15 = i15;
                        i17 = i17;
                        sArr = sArr;
                        iM3792 = iM3792;
                        iM2761 = (C0619.m2761("᩵֨") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2761 ^ i7) * 19373) ^ (-1391200029);
                        i3 = 33013575;
                        i10 = iM2761 ^ i3;
                        i17 = i17;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i2;
                        view = view;
                    } else {
                        i = i17;
                        int iM31613 = (C0773.m3169("ۛܳ") ^ i7) * 55;
                        i9 = (-483639446) ^ ((iM31613 ^ i8) * 26599);
                        i10 = iM31613 ^ 572000254;
                        this = this;
                        view = view;
                        i17 = i;
                    }
                    break;
                case -1853828943:
                case 445135059:
                    C3448.m11248();
                    if (C20932.f66974 <= 0) {
                        i = i17;
                        int iM31614 = (C0773.m3169("ۛܳ") ^ i7) * 55;
                        i9 = (-483639446) ^ ((iM31614 ^ i8) * 26599);
                        i10 = iM31614 ^ 572000254;
                        this = this;
                        view = view;
                        i17 = i;
                    } else {
                        iM3169 = C0773.m3169("ۗ֡") ^ i8;
                        i5 = ((iM3169 ^ i7) * 13071) ^ (-1368857057);
                        i6 = -1569364832;
                        i10 = iM3169 ^ i6;
                        i9 = i5;
                    }
                    break;
                case -1838598185:
                case 935896778:
                    main.f27.m22055(z2 ? 1 : 0, view);
                    break;
                case -1829319016:
                case -1210692007:
                    short[] sArr5 = sArr;
                    int i21 = i14;
                    i15 = i15;
                    iM3792 = iM3792;
                    i17 = i17;
                    iM31611 = C0773.m3169(C0619.m2756(sArr5, i21, i15, i12));
                    if (!C2023.f6737) {
                        int iM31615 = C0773.m3169("ۤ۬") ^ i7;
                        i4 = ((iM31615 ^ i8) * (-29189)) ^ 747890462;
                        i10 = iM31615 ^ (-640429191);
                        i14 = i21;
                        i17 = i17;
                        iM3792 = iM3792;
                        sArr = sArr5;
                        i15 = i15;
                        i9 = i4;
                        this = this;
                    } else {
                        sArr = sArr5;
                        i14 = i21;
                        i17 = i17;
                        int iM31616 = (C0773.m3169("ܿܰ") + i7) * 17;
                        i2 = ((iM31616 ^ i8) * (-14443)) ^ 1856727525;
                        i10 = iM31616 ^ 1297871429;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i2;
                        view = view;
                    }
                    break;
                case -1695133110:
                case 1187315596:
                    C11235.m28309();
                    if (C20932.f66974 > 0) {
                        i15 = i15;
                        i17 = i17;
                        sArr = sArr;
                        iM3792 = iM3792;
                        iM2761 = C0773.m3169("ܰܺ") ^ i8;
                        i2 = ((iM2761 ^ i7) * 18071) ^ (-929531424);
                        i3 = -1964452023;
                        i10 = iM2761 ^ i3;
                        i17 = i17;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i2;
                        view = view;
                    } else {
                        iM3169 = C0773.m3169("ۗ֡") ^ i8;
                        i5 = ((iM3169 ^ i7) * 13071) ^ (-1368857057);
                        i6 = -1569364832;
                        i10 = iM3169 ^ i6;
                        i9 = i5;
                    }
                    break;
                case -1677024514:
                case 2049108970:
                    i15 = i15;
                    i17 = i17;
                    sArr = sArr;
                    iM3792 = iM3792;
                    sArr3 = f73951;
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("᩵֨") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2761 ^ i7) * 19373) ^ (-1391200029);
                        i3 = 33013575;
                    } else {
                        iM2761 = C0773.m3169("ܰ᩺") ^ i8;
                        i2 = ((iM2761 ^ i7) * (-8657)) ^ 168787573;
                        i3 = 975917587;
                    }
                    i10 = iM2761 ^ i3;
                    i17 = i17;
                    iM3792 = iM3792;
                    sArr = sArr;
                    i15 = i15;
                    i9 = i2;
                    view = view;
                    break;
                case -1534627849:
                case 840283290:
                    C0773.m3161();
                    C3690.m11987();
                    iM3169 = (C0619.m2761("ۡۡ") ^ i7) * 5;
                    i5 = ((iM3169 ^ i8) * 29553) ^ 1634092816;
                    i6 = 1707663247;
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case -1510452772:
                case 2099025141:
                    main.f27.m22055(z ? 1 : 0, view);
                    iM3169 = (C0619.m2761("ᩴ۠") + i7) * 5;
                    i5 = ((iM3169 ^ i8) * 29589) ^ (-122468257);
                    i6 = -641536841;
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case -1437883703:
                case -1202858066:
                    i15 = i15;
                    i17 = i17;
                    sArr = sArr;
                    iM3792 = iM3792;
                    s = sArr3[8];
                    if (C1321.m4852()) {
                        iM2761 = (C0619.m2761("᩵۠") + i7) * 75;
                        i2 = ((iM2761 ^ i8) * (-12897)) ^ (-61330965);
                        i3 = 343651070;
                        i10 = iM2761 ^ i3;
                        i17 = i17;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i2;
                        view = view;
                    }
                    i17 = i17;
                    int iM31617 = (C0773.m3169("ܿܰ") + i7) * 17;
                    i2 = ((iM31617 ^ i8) * (-14443)) ^ 1856727525;
                    i10 = iM31617 ^ 1297871429;
                    iM3792 = iM3792;
                    sArr = sArr;
                    i15 = i15;
                    i9 = i2;
                    view = view;
                    break;
                case -1395126966:
                case 1280467804:
                    if (C3492.f12043 > 0) {
                        iM3169 = (C0619.m2761("ۡۡ") ^ i7) * 5;
                        i5 = ((iM3169 ^ i8) * 29553) ^ 1634092816;
                        i6 = 1707663247;
                    } else {
                        iM3169 = C0773.m3169("ۗ֡") ^ i8;
                        i5 = ((iM3169 ^ i7) * 13071) ^ (-1368857057);
                        i6 = -1569364832;
                    }
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case -1381130497:
                case 285872579:
                    i12 = 27041;
                    iM2761 = C0773.m3169("᩺ᩳ") ^ i8;
                    i14 = i14;
                    i2 = ((iM2761 ^ i7) * 26401) ^ (-1050083888);
                    i3 = 650241345;
                    i10 = iM2761 ^ i3;
                    i17 = i17;
                    iM3792 = iM3792;
                    sArr = sArr;
                    i15 = i15;
                    i9 = i2;
                    view = view;
                    break;
                case -1341847957:
                case 1131147717:
                    iM13536 = C4238.m13536(view);
                    sArr2 = f73951;
                    i18 = 12;
                    i11 = 3;
                    if (C2702.f8586 > 0) {
                        iM3169 = (i8 - C0773.m3169("ۛ᩸")) * (-17);
                        i5 = ((iM3169 ^ i7) * (-12745)) ^ (-1995974537);
                        i6 = 1871243574;
                        i10 = iM3169 ^ i6;
                        i9 = i5;
                    } else {
                        i15 = i15;
                        i17 = i17;
                        sArr = sArr;
                        iM3792 = iM3792;
                        iM2761 = (C0619.m2761("᩵֨") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2761 ^ i7) * 19373) ^ (-1391200029);
                        i3 = 33013575;
                        i10 = iM2761 ^ i3;
                        i17 = i17;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i2;
                        view = view;
                    }
                    break;
                case -1230855192:
                case 518217381:
                    int i22 = i15;
                    i = i17;
                    iM3792 = C0950.m3792(view);
                    sArr = f73951;
                    i14 = 9;
                    if (RunnableC3055.f9898 < 0) {
                        int iM2763 = (i7 - C0619.m2761("ܽ֫")) * 13;
                        i2 = ((iM2763 ^ i8) * (-31449)) ^ 1840540480;
                        i10 = iM2763 ^ (-265354042);
                        this = this;
                        i15 = i22;
                        i17 = i;
                        i9 = i2;
                        view = view;
                    } else {
                        i15 = i22;
                        int iM31618 = (C0773.m3169("ۛܳ") ^ i7) * 55;
                        i9 = (-483639446) ^ ((iM31618 ^ i8) * 26599);
                        i10 = iM31618 ^ 572000254;
                        this = this;
                        view = view;
                        i17 = i;
                    }
                    break;
                case -1145317963:
                case 1394143637:
                    c16390 = main.f56046;
                    interpolation = this.f73953.getInterpolation(f2 - f);
                    if (!C3690.m11987()) {
                        iM3169 = C0773.m3169("ܿ֫") ^ i8;
                        i5 = ((iM3169 ^ i7) * (-10641)) ^ 220157277;
                        i6 = 1779525770;
                        i10 = iM3169 ^ i6;
                        i9 = i5;
                    } else {
                        i15 = i15;
                        sArr = sArr;
                        iM3792 = iM3792;
                        int iM31619 = (C0773.m3169("ܿܰ") + i7) * 17;
                        i2 = ((iM31619 ^ i8) * (-14443)) ^ 1856727525;
                        i10 = iM31619 ^ 1297871429;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i2;
                        view = view;
                    }
                    break;
                case -1039581810:
                case 319788964:
                    if (f == 0.0f) {
                        iM3169 = (C0773.m3169("ۚ֨") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM3169 ^ i8) * 19089) ^ 1037838059;
                        i6 = -1697108754;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ۠") + i7) * 5;
                        i5 = ((iM3169 ^ i8) * 29589) ^ (-122468257);
                        i6 = -641536841;
                    }
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case -1032522712:
                case 1467426449:
                    C13473.m33140(c19987, z2 ? 1 : 0);
                    this.f73955 = z;
                    break;
                case -817794241:
                case 1261517989:
                    int i23 = iM3792;
                    i17 = iM31611 ^ 2103009858;
                    if (C3448.f11240 >= 0) {
                        z = true;
                        short[] sArr6 = sArr;
                        iM3792 = i23;
                        i15 = i15;
                        sArr = sArr6;
                        int iM316110 = (C0773.m3169("ܿܰ") + i7) * 17;
                        i2 = ((iM316110 ^ i8) * (-14443)) ^ 1856727525;
                        i10 = iM316110 ^ 1297871429;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i2;
                        view = view;
                    } else {
                        int iM2764 = C0619.m2761("᩺ܺ") ^ i7;
                        i10 = iM2764 ^ (-181517578);
                        iM3792 = i23;
                        i9 = ((iM2764 ^ i8) * (-7275)) ^ (-2025107744);
                        z = true;
                    }
                    break;
                case -521286108:
                case 1678353937:
                    i15 = i15;
                    i17 = i17;
                    sArr = sArr;
                    iM3792 = iM3792;
                    if (i13 - (61052 * s) < 0) {
                        iM2761 = C0619.m2761("ܿ۬") ^ i8;
                        i2 = ((iM2761 ^ i7) * 28207) ^ 152150249;
                        i3 = -769904921;
                    } else {
                        iM2761 = (i7 - C0773.m3169("᩺ۙ")) * (-45);
                        i2 = ((iM2761 ^ i8) * 3973) ^ (-179204345);
                        i3 = 1069835500;
                    }
                    i10 = iM2761 ^ i3;
                    i17 = i17;
                    iM3792 = iM3792;
                    sArr = sArr;
                    i15 = i15;
                    i9 = i2;
                    view = view;
                    break;
                case -230866200:
                case -214597137:
                    C13473.m33140(c19987, 4);
                    this.f73955 = z2;
                    break;
                case -93223082:
                case 1776393459:
                    C2287.m7735(c16390, interpolation);
                    c19987 = this.f73952;
                    if (f > 0.7f) {
                        iM3169 = (C0773.m3169("۠᩸") ^ i8) * 7;
                        i5 = ((iM3169 ^ i7) * (-10911)) ^ 366113490;
                        i6 = 1993566128;
                    } else {
                        iM3169 = (C0619.m2761("ۨܰ") + i7) * 71;
                        i5 = ((iM3169 ^ i8) * 20231) ^ (-2024806714);
                        i6 = 876102454;
                    }
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case -92889484:
                case 1115472122:
                    i12 = 52184;
                    iM2761 = C0773.m3169("᩺ᩳ") ^ i8;
                    i14 = i14;
                    i2 = ((iM2761 ^ i7) * 26401) ^ (-1050083888);
                    i3 = 650241345;
                    i10 = iM2761 ^ i3;
                    i17 = i17;
                    iM3792 = iM3792;
                    sArr = sArr;
                    i15 = i15;
                    i9 = i2;
                    view = view;
                    break;
                case 103273739:
                case 2141962483:
                    if (iM13536 == (C0619.m2761(C2702.m8881(sArr2, i18, i11, i12)) ^ 2101477090)) {
                        iM3169 = C0619.m2761("ۜ۟") ^ i8;
                        i5 = ((iM3169 ^ i7) * 5829) ^ 1016787327;
                        i6 = -799705538;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ۠") + i7) * 5;
                        i5 = ((iM3169 ^ i8) * 29589) ^ (-122468257);
                        i6 = -641536841;
                    }
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                case 129616887:
                case 1423125688:
                    break;
                case 491579179:
                case 888422683:
                    i15 = i15;
                    i17 = i17;
                    sArr = sArr;
                    iM3792 = iM3792;
                    short s2 = s;
                    int i24 = s2 + 15263;
                    i13 = i24 * i24;
                    if (C3448.f11240 < 0) {
                        int iM31620 = (i8 - C0773.m3169("ۗ᩺")) * (-85);
                        s = s2;
                        i4 = ((iM31620 ^ i7) * 21419) ^ (-708727396);
                        i10 = iM31620 ^ 1952817854;
                        i17 = i17;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i4;
                        this = this;
                    } else {
                        s = s2;
                        i17 = i17;
                        int iM316111 = (C0773.m3169("ܿܰ") + i7) * 17;
                        i2 = ((iM316111 ^ i8) * (-14443)) ^ 1856727525;
                        i10 = iM316111 ^ 1297871429;
                        iM3792 = iM3792;
                        sArr = sArr;
                        i15 = i15;
                        i9 = i2;
                        view = view;
                    }
                    break;
                case 936427350:
                case 1741639074:
                    main = this.f73954;
                    int i25 = iM3792;
                    int i26 = i17;
                    if (i25 == i26) {
                        int iM2765 = (i7 - C0619.m2761("ᩴۧ")) * 53;
                        int i27 = ((iM2765 ^ i8) * (-23397)) ^ 458723239;
                        i17 = i26;
                        i10 = iM2765 ^ (-745358944);
                        z2 = false;
                        iM3792 = i25;
                        i9 = i27;
                        f2 = 1.0f;
                    } else {
                        int iM31621 = (C0773.m3169("֨ۚ") ^ i8) * (-43);
                        iM3792 = i25;
                        i17 = i26;
                        i10 = iM31621 ^ 263899553;
                        i9 = ((iM31621 ^ i7) * 10387) ^ 1327384852;
                        f2 = 1.0f;
                        z2 = false;
                    }
                    break;
                case 956730662:
                case 1736052669:
                    i15 = i15;
                    i17 = i17;
                    sArr = sArr;
                    iM3792 = iM3792;
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ܰܺ") ^ i8;
                        i2 = ((iM2761 ^ i7) * 18071) ^ (-929531424);
                        i3 = -1964452023;
                    } else {
                        iM2761 = C0619.m2761("᩺ۗ") ^ i7;
                        i2 = ((iM2761 ^ i8) * 23269) ^ 1912027017;
                        i3 = -389815517;
                    }
                    i10 = iM2761 ^ i3;
                    i17 = i17;
                    iM3792 = iM3792;
                    sArr = sArr;
                    i15 = i15;
                    i9 = i2;
                    view = view;
                    break;
                case 1077257261:
                case 1388060913:
                    if (f == f2) {
                        iM3169 = C0619.m2761("ۗۙ") ^ i8;
                        i5 = ((iM3169 ^ i7) * 18875) ^ (-2111504161);
                        i6 = 34202789;
                    } else {
                        iM3169 = (C0619.m2761("ۖܽ") + i7) * 43;
                        i5 = ((iM3169 ^ i8) * (-2249)) ^ 1121748501;
                        i6 = 1848267559;
                    }
                    i10 = iM3169 ^ i6;
                    i9 = i5;
                    break;
                default:
                    C13473.m33144();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01f3 A[PHI: r7 r8 r13 r17
      0x01f3: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:57:0x01f1, B:37:0x0121, B:10:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:57:0x01f1, B:37:0x0121, B:10:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:57:0x01f1, B:37:0x0121, B:10:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r17v23 bin.mt.plus.Main) = (r17v6 bin.mt.plus.Main), (r17v14 bin.mt.plus.Main), (r17v24 bin.mt.plus.Main) binds: [B:57:0x01f1, B:37:0x0121, B:10:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0248 A[PHI: r4 r17
      0x0248: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:65:0x0246, B:24:0x009f, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r17v22 bin.mt.plus.Main) = (r17v4 bin.mt.plus.Main), (r17v17 bin.mt.plus.Main), (r17v25 bin.mt.plus.Main) binds: [B:65:0x0246, B:24:0x009f, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x027a A[PHI: r1 r11 r17 r18
      0x027a: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v2 int) binds: [B:69:0x0278, B:45:0x0163, B:18:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:69:0x0278, B:45:0x0163, B:18:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r17v18 bin.mt.plus.Main) = (r17v3 bin.mt.plus.Main), (r17v11 bin.mt.plus.Main), (r17v19 bin.mt.plus.Main) binds: [B:69:0x0278, B:45:0x0163, B:18:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:69:0x0278, B:45:0x0163, B:18:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02a8 A[PHI: r5 r6 r12 r17
      0x02a8: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:73:0x02a6, B:61:0x0226, B:41:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:73:0x02a6, B:61:0x0226, B:41:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:73:0x02a6, B:61:0x0226, B:41:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r17v12 bin.mt.plus.Main) = (r17v2 bin.mt.plus.Main), (r17v5 bin.mt.plus.Main), (r17v13 bin.mt.plus.Main) binds: [B:73:0x02a6, B:61:0x0226, B:41:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (l.C2702.f8586 > 0) goto L18;
     */
    @Override // l.AbstractC21572, l.InterfaceC6656
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawerOpened(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22820.onDrawerOpened(android.view.View):void");
    }

    public C22820(Main main, C19987 c19987) {
        int iM2761;
        int i;
        int i2 = 592312855;
        int i3 = C0773.f2792;
        int i4 = C2702.f8586;
        this.f73954 = main;
        this.f73952 = c19987;
        int iM2762 = C0619.m2761("ۖ۠") ^ i4;
        int i5 = ((iM2762 ^ i3) * (-11493)) ^ (-297774724);
        int i6 = -1727050590;
        while (true) {
            int i7 = iM2762 ^ i6;
            AccelerateInterpolator accelerateInterpolator = null;
            while (true) {
                i2 = i7 ^ (i5 & (((i2 ^ i3) * 6801) >> 31));
                switch (i2) {
                    case -1659772172:
                    case 838291432:
                        C3448.m11248();
                        iM2762 = C0773.m3169("۠ᩴ") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-29225)) ^ 2104735307;
                        i6 = 1283248611;
                        break;
                    case -1247888130:
                    case 1135886021:
                        RunnableC3055.m9933();
                        if (!C3077.m10041()) {
                            iM2762 = C0773.m3169("۠ᩴ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-29225)) ^ 2104735307;
                            i6 = 1283248611;
                        } else {
                            iM2762 = (i3 - C0619.m2761("᩸ܺ")) * (-71);
                            i5 = ((iM2762 ^ i4) * 31589) ^ (-842153821);
                            i6 = -1411122917;
                        }
                        break;
                    case -1003615443:
                    case -782143020:
                        if (!RunnableC1848.f6235) {
                            if (C0950.f3488 < 0) {
                                if (C2485.m8357() > 0) {
                                    if (C2288.f7433 <= 0 || C23916.m53419() != 0 || C2354.f7599 >= 0 || C1564.f5401 <= 0 || C0269.f1558 <= 0) {
                                        iM2762 = (i3 - C0619.m2761("᩸ܺ")) * (-71);
                                        i5 = ((iM2762 ^ i4) * 31589) ^ (-842153821);
                                        i6 = -1411122917;
                                        break;
                                    } else if (!C3690.m11987()) {
                                        accelerateInterpolator = new AccelerateInterpolator(0.4f);
                                        if (C1146.m4231()) {
                                            iM2761 = C0619.m2761("ܶ۫") ^ i4;
                                            i5 = ((iM2761 ^ i3) * (-28927)) ^ 1403614841;
                                            i = 51337138;
                                            i7 = iM2761 ^ i;
                                            break;
                                        }
                                    }
                                }
                                iM2762 = C0773.m3169("۠ᩴ") ^ i3;
                                i5 = ((iM2762 ^ i4) * (-29225)) ^ 2104735307;
                                i6 = 1283248611;
                            } else {
                                iM2762 = C0619.m2761("᩶ۛ") ^ i4;
                                i5 = ((iM2762 ^ i3) * (-15029)) ^ (-392132565);
                                i6 = -34381721;
                            }
                            break;
                        }
                        iM2762 = (C0773.m3169("ۨ᩻") + i3) * (-119);
                        i5 = ((iM2762 ^ i4) * 969) ^ 1791989414;
                        i6 = -1538060138;
                        break;
                    case 227883362:
                    case 1264670331:
                        this.f73953 = accelerateInterpolator;
                        this.f73955 = true;
                        return;
                    case 330630538:
                    case 1143262348:
                        if (!C4282.m13644()) {
                            iM2761 = (i4 - C0773.m3169("ۚ۫")) * 109;
                            i5 = ((iM2761 ^ i3) * 21587) ^ (-102729439);
                            i = 1343073289;
                            i7 = iM2761 ^ i;
                        } else {
                            iM2762 = (i3 - C0619.m2761("᩸ܺ")) * (-71);
                            i5 = ((iM2762 ^ i4) * 31589) ^ (-842153821);
                            i6 = -1411122917;
                        }
                        break;
                    case 1055016670:
                    case 1056274882:
                        C1564.m5509();
                        throw new RuntimeException();
                    default:
                        C20932.m47848();
                        if (!C2023.f6737) {
                            iM2762 = C0619.m2761("᩶ۛ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-15029)) ^ (-392132565);
                            i6 = -34381721;
                        } else {
                            iM2762 = C0773.m3169("۠ᩴ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-29225)) ^ 2104735307;
                            i6 = 1283248611;
                        }
                        break;
                }
            }
        }
    }
}
