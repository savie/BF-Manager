package l;

import android.util.Base64;
import com.umeng.analytics.pro.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q139 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3084 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C13541 f10005;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10007;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6068[] f10008;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23222 f10009;

    /* JADX INFO: renamed from: ۟ۤ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f10004 = {4961, -18464, -18476, -18467, -18447, -18436, -18447, -18454, -18463, -18444, -18554, -18475, -18439, -18549, -18437, -18471, -18550, -18434, -18559, -18467, -18560, -18475, -18492, -18549, -18459, -18446, -18556, -18464, -18461, -18479, -18439, -18471, -18447, 9988, 16234, 16209, 16200, 16200};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ArrayList f10006 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m10053(String str) {
        this.f10008[m10051(str)].m17575(this.f10009, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10050(C13541 c13541) {
        f10005 = c13541;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x02ae A[PHI: r18 r19
      0x02ae: PHI (r18v4 byte) = (r18v3 byte), (r18v2 byte), (r18v2 byte) binds: [B:69:0x02ac, B:191:0x02ae, B:17:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:69:0x02ac, B:191:0x02ae, B:17:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    public C3084(String str) {
        StringBuilder sb;
        int i;
        int i2;
        short[] sArr;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int iM2761;
        int i6;
        int i7;
        int iM3169;
        int i8;
        int i9;
        int iM46508;
        StringBuilder sb2;
        int i10;
        short[] sArr2;
        int iM2762;
        int i11;
        int i12;
        int i13;
        int iM2763;
        int i14;
        int i15;
        int i16;
        int iM31610;
        int i17;
        int i18;
        StringBuilder sb3;
        int i19;
        int i20;
        int iM2764;
        int i21;
        int i22 = C0487.f2131;
        int i23 = RunnableC3055.f9898;
        short s = f10004[0];
        int i24 = (s * s) + 23367556;
        int i25 = s + 4834;
        int i26 = (i24 + i24) - (i25 * i25) >= 0 ? 47027 : 1684;
        byte[] bArrDecode = Base64.decode(str, 0);
        C23968 c23968 = new C23968();
        int iM31611 = C0773.m3169("֫ܿ") ^ i23;
        int i27 = ((iM31611 ^ i22) * 2139) ^ (-923066305);
        int i28 = iM31611 ^ (-146354648);
        int i29 = i26;
        C23968 c23969 = c23968;
        byte[] bArr2 = bArrDecode;
        int i30 = i27;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        C6068[] c6068Arr = null;
        C6068 c6068 = null;
        short[] sArr3 = null;
        StringBuilder sb4 = null;
        int i31 = 0;
        int i32 = 0;
        C20238 c20238 = null;
        int i33 = 0;
        int i34 = 0;
        int length = 0;
        int i35 = 0;
        int iIndexOf = 0;
        byte b = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = -1986860325;
        int i42 = 0;
        byte[] bArrM46509 = null;
        int i43 = 0;
        while (true) {
            i41 = i28 ^ ((((i41 ^ i22) * (-4639)) >> 31) & i30);
            switch (i41) {
                case -2111252819:
                case -763624849:
                    sb = sb4;
                    i4 = i32;
                    i2 = i42;
                    sArr = sArr3;
                    i3 = i31;
                    bArr = bArr2;
                    c20238 = new C20238(bArr);
                    iM46508 = c20238.m46508();
                    if (C0950.m3785() != 0) {
                        iM2761 = C0619.m2761("ۛۡ") ^ i22;
                        i5 = iM46508;
                        i6 = ((iM2761 ^ i23) * (-2783)) ^ 2108696502;
                        i7 = 162661586;
                    } else {
                        iM2761 = (i22 - C0773.m3169("ۗۗ")) * (-71);
                        i5 = iM46508;
                        i6 = ((iM2761 ^ i23) * 8133) ^ 355029873;
                        i7 = 1615598657;
                    }
                    int i44 = iM2761 ^ i7;
                    sArr3 = sArr;
                    i15 = i2;
                    i30 = i6;
                    sb4 = sb;
                    i28 = i44;
                    i32 = i4;
                    i40 = i5;
                    bArr2 = bArr;
                    i31 = i3;
                    i42 = i15;
                    break;
                case -2079937507:
                case 1138948651:
                    if (C0773.f2792 > 0) {
                        sb = sb4;
                        iM46508 = i40;
                        i2 = i42;
                        sArr = sArr3;
                        i3 = i31;
                        i4 = i32;
                        bArr = bArr2;
                        iM2761 = C0619.m2761("ۛۡ") ^ i22;
                        i5 = iM46508;
                        i6 = ((iM2761 ^ i23) * (-2783)) ^ 2108696502;
                        i7 = 162661586;
                        int i45 = iM2761 ^ i7;
                        sArr3 = sArr;
                        i15 = i2;
                        i30 = i6;
                        sb4 = sb;
                        i28 = i45;
                        i32 = i4;
                        i40 = i5;
                        bArr2 = bArr;
                        i31 = i3;
                        i42 = i15;
                    }
                    sb = sb4;
                    i = i40;
                    i2 = i42;
                    sArr = sArr3;
                    i3 = i31;
                    i4 = i32;
                    bArr = bArr2;
                    iM2761 = C0773.m3169("ܿ֫") ^ i23;
                    i5 = i;
                    i6 = ((iM2761 ^ i22) * (-29093)) ^ (-169666382);
                    i7 = 1233886847;
                    int i46 = iM2761 ^ i7;
                    sArr3 = sArr;
                    i15 = i2;
                    i30 = i6;
                    sb4 = sb;
                    i28 = i46;
                    i32 = i4;
                    i40 = i5;
                    bArr2 = bArr;
                    i31 = i3;
                    i42 = i15;
                    break;
                case -1874813566:
                case -1561160042:
                    sb3 = sb4;
                    i19 = i31;
                    ArrayList arrayList3 = this.f10007;
                    sArr3 = f10004;
                    i35 = 1;
                    i20 = 32;
                    if (C2702.f8586 > 0) {
                        int iM2765 = C0619.m2761("֨ܽ") ^ i22;
                        i30 = ((iM2765 ^ i23) * 14635) ^ (-1883031561);
                        i13 = iM2765 ^ 1412935786;
                        arrayList2 = arrayList3;
                        sb4 = sb3;
                        i31 = i19;
                        i42 = 32;
                        i28 = i13;
                    } else {
                        arrayList2 = arrayList3;
                        int iM2766 = C0619.m2761("۬ۘ") ^ i22;
                        i30 = 1918021712 ^ ((iM2766 ^ i23) * (-24303));
                        StringBuilder sb5 = sb3;
                        i28 = iM2766 ^ 1782057901;
                        sb4 = sb5;
                        int i47 = i19;
                        i42 = i20;
                        i31 = i47;
                    }
                    break;
                case -1811639776:
                case 516135084:
                    if (C3033.f9831 >= 0) {
                        sb = sb4;
                        i2 = i42;
                        sArr = sArr3;
                        i3 = i31;
                        bArr = bArr2;
                        i5 = i40;
                        i4 = i32;
                        iM3169 = (C0773.m3169("᩻ܿ") ^ i23) * (-99);
                        i8 = ((iM3169 ^ i22) * 23883) ^ 2044362741;
                        i9 = 1884102791;
                        int i48 = iM3169 ^ i9;
                        sArr3 = sArr;
                        StringBuilder sb6 = sb;
                        i28 = i48;
                        sb4 = sb6;
                        int i49 = i5;
                        bArr2 = bArr;
                        i31 = i3;
                        i42 = i2;
                        i30 = i8;
                        i32 = i4;
                        i40 = i49;
                    } else {
                        sb3 = sb4;
                        int i50 = i42;
                        i19 = i31;
                        i20 = i50;
                        int iM2767 = C0619.m2761("۬ۘ") ^ i22;
                        i30 = 1918021712 ^ ((iM2767 ^ i23) * (-24303));
                        StringBuilder sb7 = sb3;
                        i28 = iM2767 ^ 1782057901;
                        sb4 = sb7;
                        int i410 = i19;
                        i42 = i20;
                        i31 = i410;
                    }
                    break;
                case -1780543712:
                case -1074338815:
                    i10 = i42;
                    sArr2 = sArr3;
                    i3 = i31;
                    int length2 = bArrM46509.length;
                    if (C3448.f11240 >= 0) {
                        int iM31612 = (i22 - C0773.m3169("ܳۤ")) * (-7);
                        int i51 = ((iM31612 ^ i23) * (-16611)) ^ (-893025640);
                        i28 = iM31612 ^ (-402327522);
                        sArr3 = sArr2;
                        sb4 = null;
                        i15 = i10;
                        i30 = i51;
                    } else {
                        sb4 = new StringBuilder(length2 << 2);
                        i33 = 0;
                        length = bArrM46509.length;
                        int iM31613 = (i22 - C0773.m3169("֡֨")) * 95;
                        sArr3 = sArr2;
                        i15 = i10;
                        i30 = ((iM31613 ^ i23) * (-30407)) ^ 271044425;
                        sb4 = sb4;
                        i28 = iM31613 ^ (-1974690556);
                    }
                    i31 = i3;
                    i42 = i15;
                    break;
                case -1773404822:
                case -1151291532:
                    i37 = b >> 3;
                    if (C2485.f7950 == 0) {
                        iM2763 = (i22 - C0619.m2761("ۘ۟")) * 73;
                        i30 = ((iM2763 ^ i23) * 12811) ^ 873281047;
                        i14 = -871105642;
                        i28 = iM2763 ^ i14;
                    } else {
                        i10 = i42;
                        sArr2 = sArr3;
                        i3 = i31;
                        int iM31614 = (i22 - C0773.m3169("ܳۤ")) * (-7);
                        int i52 = ((iM31614 ^ i23) * (-16611)) ^ (-893025640);
                        i28 = iM31614 ^ (-402327522);
                        sArr3 = sArr2;
                        sb4 = null;
                        i15 = i10;
                        i30 = i52;
                        i31 = i3;
                        i42 = i15;
                    }
                    break;
                case -1687928692:
                case 1333670796:
                    C1519.m5406(arrayList, C2023.m6952(sb4));
                    i43++;
                    i16 = i40;
                    iM31610 = C0619.m2761("ܽܽ") ^ i23;
                    i17 = ((iM31610 ^ i22) * (-16749)) ^ (-687188833);
                    i18 = -747810458;
                    int i53 = iM31610 ^ i18;
                    sArr3 = sArr3;
                    int i54 = i32;
                    i40 = i16;
                    sb4 = sb4;
                    i28 = i53;
                    i31 = i31;
                    i42 = i42;
                    i30 = i17;
                    i32 = i54;
                    break;
                case -1640845927:
                case 1349859443:
                    if (i38 % 2 == 0) {
                        iM2763 = (i22 - C0773.m3169("ܳܺ")) * (-107);
                        i30 = ((iM2763 ^ i23) * (-16025)) ^ (-1133684938);
                        i14 = 1883037928;
                    } else {
                        iM2763 = (i22 - C0773.m3169("᩶۠")) * 31;
                        i30 = ((iM2763 ^ i23) * (-31073)) ^ (-675651013);
                        i14 = -1659082992;
                    }
                    i28 = iM2763 ^ i14;
                    break;
                case -1579029519:
                case 33755921:
                    sb2 = sb4;
                    this.f10008[iIndexOf].m17575(this.f10009, true);
                    i10 = i42;
                    sArr2 = sArr3;
                    i3 = i31;
                    iM2762 = C0773.m3169("ܺ᩵") ^ i22;
                    i11 = ((iM2762 ^ i23) * 10357) ^ (-305022055);
                    i12 = -134317259;
                    int i55 = iM2762 ^ i12;
                    sArr3 = sArr2;
                    StringBuilder sb8 = sb2;
                    i28 = i55;
                    sb4 = sb8;
                    int i56 = i10;
                    i30 = i11;
                    i31 = i3;
                    i42 = i56;
                    break;
                case -1550348361:
                case 859942133:
                    C2375.m8065();
                    sb3 = sb4;
                    int i57 = i42;
                    i19 = i31;
                    i20 = i57;
                    int iM2768 = C0619.m2761("۬ۘ") ^ i22;
                    i30 = 1918021712 ^ ((iM2768 ^ i23) * (-24303));
                    StringBuilder sb9 = sb3;
                    i28 = iM2768 ^ 1782057901;
                    sb4 = sb9;
                    int i411 = i19;
                    i42 = i20;
                    i31 = i411;
                    break;
                case -1490418890:
                case 508094160:
                    if (i31 < i32) {
                        iM2763 = (C0773.m3169("ܰ֡") + i23) * 9;
                        i30 = ((iM2763 ^ i22) * 23585) ^ 947361562;
                        i14 = 164396471;
                    } else {
                        iM2763 = (i23 - C0773.m3169("۟֨")) * 87;
                        i30 = ((iM2763 ^ i22) * (-4431)) ^ 1496119938;
                        i14 = -617400882;
                    }
                    i28 = iM2763 ^ i14;
                    break;
                case -1472497172:
                case 358527211:
                    sb4 = sb4;
                    i16 = i40;
                    i42 = i42;
                    sArr3 = sArr3;
                    i31 = i31;
                    if (i34 < i16) {
                        iM31610 = C0773.m3169("᩵۟") ^ i23;
                        i32 = i32;
                        i17 = ((iM31610 ^ i22) * (-15807)) ^ 809110356;
                        i18 = 416300093;
                    } else {
                        i32 = i32;
                        iM31610 = (C0773.m3169("ܽ᩷") ^ i23) * 51;
                        i17 = ((iM31610 ^ i22) * 1185) ^ 1462079734;
                        i18 = 23346988;
                    }
                    int i58 = iM31610 ^ i18;
                    sArr3 = sArr3;
                    int i59 = i32;
                    i40 = i16;
                    sb4 = sb4;
                    i28 = i58;
                    i31 = i31;
                    i42 = i42;
                    i30 = i17;
                    i32 = i59;
                    break;
                case -1470813793:
                case 492474200:
                    sb = sb4;
                    i2 = i42;
                    sArr = sArr3;
                    i3 = i31;
                    bArr = bArr2;
                    i5 = i40;
                    i4 = i32;
                    this.f10007 = new ArrayList();
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("᩻ܿ") ^ i23) * (-99);
                        i8 = ((iM3169 ^ i22) * 23883) ^ 2044362741;
                        i9 = 1884102791;
                    } else {
                        iM3169 = C0619.m2761("ۘۗ") ^ i23;
                        i8 = ((iM3169 ^ i22) * 9319) ^ 237775967;
                        i9 = -1067792529;
                    }
                    int i412 = iM3169 ^ i9;
                    sArr3 = sArr;
                    StringBuilder sb10 = sb;
                    i28 = i412;
                    sb4 = sb10;
                    int i413 = i5;
                    bArr2 = bArr;
                    i31 = i3;
                    i42 = i2;
                    i30 = i8;
                    i32 = i4;
                    i40 = i413;
                    break;
                case -1284840620:
                case 429266117:
                    sb4 = sb4;
                    c6068Arr[i34] = c6068;
                    i34++;
                    i16 = i40;
                    i42 = i42;
                    sArr3 = sArr3;
                    i31 = i31;
                    i32 = i32;
                    iM31610 = C0619.m2761("۠ۜ") ^ i22;
                    i17 = ((iM31610 ^ i23) * (-7855)) ^ 1392218215;
                    i18 = 36645903;
                    int i510 = iM31610 ^ i18;
                    sArr3 = sArr3;
                    int i511 = i32;
                    i40 = i16;
                    sb4 = sb4;
                    i28 = i510;
                    i31 = i31;
                    i42 = i42;
                    i30 = i17;
                    i32 = i511;
                    break;
                case -1276534575:
                case -1275923914:
                    C2375.m8065();
                    if (C2834.m9344() < 0) {
                        iM2763 = (C0773.m3169("ۘۖ") ^ i23) * (-73);
                        i30 = ((iM2763 ^ i22) * 15497) ^ (-74747480);
                        i14 = 2115367453;
                    } else {
                        iM2763 = (C0773.m3169("۬ۚ") ^ i23) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i30 = ((iM2763 ^ i22) * (-22629)) ^ 1822299028;
                        i14 = -1166160650;
                    }
                    i28 = iM2763 ^ i14;
                    break;
                case -1204562905:
                case 394675128:
                    C3734.m12152();
                    if (C3033.m9845() <= 0) {
                        iM2763 = (C0773.m3169("ۘۖ") ^ i23) * (-73);
                        i30 = ((iM2763 ^ i22) * 15497) ^ (-74747480);
                        i14 = 2115367453;
                        i28 = iM2763 ^ i14;
                    } else {
                        sb = sb4;
                        i2 = i42;
                        sArr = sArr3;
                        i3 = i31;
                        bArr = bArr2;
                        i5 = i40;
                        i4 = i32;
                        iM3169 = (C0773.m3169("᩻ܿ") ^ i23) * (-99);
                        i8 = ((iM3169 ^ i22) * 23883) ^ 2044362741;
                        i9 = 1884102791;
                        int i414 = iM3169 ^ i9;
                        sArr3 = sArr;
                        StringBuilder sb11 = sb;
                        i28 = i414;
                        sb4 = sb11;
                        int i415 = i5;
                        bArr2 = bArr;
                        i31 = i3;
                        i42 = i2;
                        i30 = i8;
                        i32 = i4;
                        i40 = i415;
                    }
                    break;
                case -1195180519:
                case 1286108951:
                    C2023.m6955(sb4, (char) (i31 + 65));
                    iM2763 = C0773.m3169("᩸ᩳ") ^ i22;
                    i30 = ((iM2763 ^ i23) * (-25281)) ^ 735385927;
                    i14 = -200569330;
                    i28 = iM2763 ^ i14;
                    break;
                case -1186834189:
                case -478574611:
                    i33++;
                    i10 = i42;
                    sArr2 = sArr3;
                    i3 = i31;
                    int iM31615 = (i22 - C0773.m3169("֡֨")) * 95;
                    sArr3 = sArr2;
                    i15 = i10;
                    i30 = ((iM31615 ^ i23) * (-30407)) ^ 271044425;
                    sb4 = sb4;
                    i28 = iM31615 ^ (-1974690556);
                    i31 = i3;
                    i42 = i15;
                    break;
                case -1184066050:
                case 724298853:
                    sb2 = sb4;
                    i10 = i42;
                    sArr2 = sArr3;
                    i3 = i31;
                    arrayList = this.f10007;
                    bArrM46509 = c20238.m46509(16);
                    if (C0487.f2131 > 0) {
                        iM2762 = C0619.m2761("ܶܳ") ^ i22;
                        i11 = ((iM2762 ^ i23) * (-14705)) ^ (-525973170);
                        i12 = -2102481275;
                        int i512 = iM2762 ^ i12;
                        sArr3 = sArr2;
                        StringBuilder sb12 = sb2;
                        i28 = i512;
                        sb4 = sb12;
                        int i513 = i10;
                        i30 = i11;
                        i31 = i3;
                        i42 = i513;
                    } else {
                        int iM31616 = (i22 - C0773.m3169("ܳۤ")) * (-7);
                        int i514 = ((iM31616 ^ i23) * (-16611)) ^ (-893025640);
                        i28 = iM31616 ^ (-402327522);
                        sArr3 = sArr2;
                        sb4 = null;
                        i15 = i10;
                        i30 = i514;
                        i31 = i3;
                        i42 = i15;
                    }
                    break;
                case -1154446679:
                case 963723586:
                    sb4 = sb4;
                    i16 = i40;
                    i42 = i42;
                    sArr3 = sArr3;
                    i31 = i31;
                    i32 = i32;
                    if (i43 < i16) {
                        iM31610 = (C0773.m3169("ᩳ۟") + i23) * (-71);
                        i17 = ((iM31610 ^ i22) * (-29539)) ^ 2119962419;
                        i18 = -1468096978;
                    } else {
                        i34 = 0;
                        iM31610 = C0619.m2761("۠ۜ") ^ i22;
                        i17 = ((iM31610 ^ i23) * (-7855)) ^ 1392218215;
                        i18 = 36645903;
                    }
                    int i515 = iM31610 ^ i18;
                    sArr3 = sArr3;
                    int i516 = i32;
                    i40 = i16;
                    sb4 = sb4;
                    i28 = i515;
                    i31 = i31;
                    i42 = i42;
                    i30 = i17;
                    i32 = i516;
                    break;
                case -1097756769:
                case 2128278887:
                    if (C3033.f9831 < 0) {
                        i10 = i42;
                        sArr2 = sArr3;
                        i3 = i31;
                        int iM31617 = (i22 - C0773.m3169("ܳۤ")) * (-7);
                        int i517 = ((iM31617 ^ i23) * (-16611)) ^ (-893025640);
                        i28 = iM31617 ^ (-402327522);
                        sArr3 = sArr2;
                        sb4 = null;
                        i15 = i10;
                        i30 = i517;
                        i31 = i3;
                        i42 = i15;
                    } else {
                        iM2763 = (C0773.m3169("۬ۚ") ^ i23) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i30 = ((iM2763 ^ i22) * (-22629)) ^ 1822299028;
                        i14 = -1166160650;
                        i28 = iM2763 ^ i14;
                    }
                    break;
                case -1074768628:
                case 1190143566:
                    if (!RunnableC1848.f6235) {
                        sb3 = sb4;
                        int i518 = i42;
                        i19 = i31;
                        i20 = i518;
                        int iM2769 = C0619.m2761("۬ۘ") ^ i22;
                        i30 = 1918021712 ^ ((iM2769 ^ i23) * (-24303));
                        StringBuilder sb13 = sb3;
                        i28 = iM2769 ^ 1782057901;
                        sb4 = sb13;
                        int i416 = i19;
                        i42 = i20;
                        i31 = i416;
                    } else {
                        iM2763 = (C0773.m3169("ۢ֨") + i22) * (-5);
                        i30 = ((iM2763 ^ i23) * (-9069)) ^ (-1380286155);
                        i14 = -1656547630;
                        i28 = iM2763 ^ i14;
                    }
                    break;
                case -1012847853:
                case 1782383809:
                    int i60 = i38 % 10;
                    C3779.m12269(sb4, i60);
                    i39 = i60;
                    iM2763 = (C0619.m2761("֨ܶ") + i23) * 33;
                    i30 = ((iM2763 ^ i22) * 26753) ^ (-883881556);
                    i14 = 865834626;
                    i28 = iM2763 ^ i14;
                    break;
                case -731396185:
                case 1662856015:
                    i31 = i37 & 31;
                    i38 = i36 ^ i31;
                    if (i38 < 26) {
                        int iM27610 = (C0619.m2761("۠ܺ") ^ i22) * 127;
                        i28 = iM27610 ^ 1064216615;
                        i30 = ((iM27610 ^ i23) * 11521) ^ 2073211344;
                    } else {
                        int iM31618 = C0773.m3169("ۤ᩶") ^ i23;
                        i30 = ((iM31618 ^ i22) * (-10893)) ^ (-677377512);
                        i28 = iM31618 ^ (-2145320105);
                    }
                    i32 = 26;
                    break;
                case -527448490:
                case -335991204:
                    C1519.m5406(f10006, new WeakReference(this));
                    return;
                case -235991596:
                case -12305272:
                    C1080.m4046(sb4, (char) (i31 + 97));
                    iM2763 = C0773.m3169("᩸ᩳ") ^ i22;
                    i30 = ((iM2763 ^ i23) * (-25281)) ^ 735385927;
                    i14 = -200569330;
                    i28 = iM2763 ^ i14;
                    break;
                case -221253453:
                case 1370941169:
                    sb = sb4;
                    c6068Arr = this.f10008;
                    C6068 c6069 = new C6068(c20238, c20238.m46508());
                    if (RunnableC3055.m9933() == 0) {
                        int iM31619 = C0773.m3169("ۙ۠") ^ i23;
                        i30 = ((iM31619 ^ i22) * 30619) ^ (-458698584);
                        i13 = iM31619 ^ (-209045402);
                        c6068 = c6069;
                        sb4 = sb;
                        i28 = i13;
                    } else {
                        c6068 = c6069;
                        iM46508 = i40;
                        i2 = i42;
                        sArr = sArr3;
                        i3 = i31;
                        i4 = i32;
                        bArr = bArr2;
                        iM2761 = C0619.m2761("ۛۡ") ^ i22;
                        i5 = iM46508;
                        i6 = ((iM2761 ^ i23) * (-2783)) ^ 2108696502;
                        i7 = 162661586;
                        int i417 = iM2761 ^ i7;
                        sArr3 = sArr;
                        i15 = i2;
                        i30 = i6;
                        sb4 = sb;
                        i28 = i417;
                        i32 = i4;
                        i40 = i5;
                        bArr2 = bArr;
                        i31 = i3;
                        i42 = i15;
                    }
                    break;
                case 94730066:
                case 529530975:
                    b = bArrM46509[i33];
                    i36 = b & bo.j;
                    if (C3099.m10095()) {
                        iM2763 = (C0773.m3169("ۘۖ") ^ i23) * (-73);
                        i30 = ((iM2763 ^ i22) * 15497) ^ (-74747480);
                        i14 = 2115367453;
                    } else {
                        iM2763 = (i23 - C0619.m2761("ۢ᩶")) * (-17);
                        i30 = ((iM2763 ^ i22) * (-30855)) ^ 964351510;
                        i14 = -817638876;
                    }
                    i28 = iM2763 ^ i14;
                    break;
                case 139069461:
                case 851494442:
                    if (i31 % 2 == 0) {
                        iM2763 = C0619.m2761("ۤᩳ") ^ i23;
                        i30 = ((iM2763 ^ i22) * 12067) ^ (-1167990715);
                        i14 = 468912735;
                    } else {
                        iM2763 = (C0619.m2761("ۛۨ") ^ i22) * (-121);
                        i30 = ((iM2763 ^ i23) * (-21303)) ^ (-694502623);
                        i14 = 1401942698;
                    }
                    i28 = iM2763 ^ i14;
                    break;
                case 157470404:
                case 1421802403:
                    C3779.m12269(sb4, (i31 ^ i39) % 10);
                    iM2763 = C0773.m3169("᩸ᩳ") ^ i22;
                    i30 = ((iM2763 ^ i23) * (-25281)) ^ 735385927;
                    i14 = -200569330;
                    i28 = iM2763 ^ i14;
                    break;
                case 294193060:
                case 530442297:
                    i16 = i40;
                    this.f10008 = new C6068[i16];
                    i43 = 0;
                    iM31610 = C0619.m2761("ܽܽ") ^ i23;
                    i17 = ((iM31610 ^ i22) * (-16749)) ^ (-687188833);
                    i18 = -747810458;
                    int i519 = iM31610 ^ i18;
                    sArr3 = sArr3;
                    int i5110 = i32;
                    i40 = i16;
                    sb4 = sb4;
                    i28 = i519;
                    i31 = i31;
                    i42 = i42;
                    i30 = i17;
                    i32 = i5110;
                    break;
                case 329910163:
                case 1263474370:
                    C2023.m6955(sb4, (char) (i38 + 97));
                    i39 = i38;
                    iM2763 = (C0619.m2761("֨ܶ") + i23) * 33;
                    i30 = ((iM2763 ^ i22) * 26753) ^ (-883881556);
                    i14 = 865834626;
                    i28 = iM2763 ^ i14;
                    break;
                case 378024561:
                case 948574827:
                    StringBuilder sb14 = sb4;
                    if (i33 < length) {
                        iM2764 = (C0773.m3169("ۖ֡") ^ i22) * (-5);
                        i30 = 371533668 ^ ((iM2764 ^ i23) * (-11915));
                        i21 = -1889365901;
                    } else {
                        iM2764 = (C0619.m2761("۫ۛ") + i23) * (-83);
                        i30 = 1747303908 ^ ((iM2764 ^ i22) * (-8529));
                        i21 = -2093498424;
                    }
                    i28 = iM2764 ^ i21;
                    sb4 = sb14;
                    break;
                case 455963283:
                case 1128677863:
                    sb2 = sb4;
                    i10 = i42;
                    sArr2 = sArr3;
                    iIndexOf = arrayList2.indexOf(C0862.m3500(sArr2, i35, i10, i29));
                    if (iIndexOf != -1) {
                        iM2762 = (C0619.m2761("۟۬") ^ i23) * 41;
                        i3 = i31;
                        i11 = ((iM2762 ^ i22) * 9199) ^ (-1473064121);
                        i12 = 2088767424;
                    } else {
                        i3 = i31;
                        iM2762 = C0773.m3169("ܺ᩵") ^ i22;
                        i11 = ((iM2762 ^ i23) * 10357) ^ (-305022055);
                        i12 = -134317259;
                    }
                    int i5111 = iM2762 ^ i12;
                    sArr3 = sArr2;
                    StringBuilder sb15 = sb2;
                    i28 = i5111;
                    sb4 = sb15;
                    int i5112 = i10;
                    i30 = i11;
                    i31 = i3;
                    i42 = i5112;
                    break;
                case 709290516:
                case 2106687390:
                    sb = sb4;
                    i = i40;
                    i2 = i42;
                    sArr = sArr3;
                    i3 = i31;
                    i4 = i32;
                    bArr = bArr2;
                    if (AbstractC0641.f2496 < 0) {
                        i5 = i;
                        C23968 c239610 = c23969;
                        this.f10009 = new C23222(this, c239610);
                        if (C3033.f9831 < 0) {
                            c23969 = c239610;
                            iM3169 = (C0773.m3169("ۨᩳ") + i22) * (-11);
                            i8 = ((iM3169 ^ i23) * 15229) ^ 1002472909;
                            i9 = 2084523346;
                            int i418 = iM3169 ^ i9;
                            sArr3 = sArr;
                            StringBuilder sb16 = sb;
                            i28 = i418;
                            sb4 = sb16;
                            int i419 = i5;
                            bArr2 = bArr;
                            i31 = i3;
                            i42 = i2;
                            i30 = i8;
                            i32 = i4;
                            i40 = i419;
                        } else {
                            iM2761 = (i23 - C0619.m2761("֡ܳ")) * (-55);
                            c23969 = c239610;
                            i6 = ((iM2761 ^ i22) * 17303) ^ (-717389938);
                            i7 = 226251901;
                        }
                    } else {
                        iM2761 = C0773.m3169("ܿ֫") ^ i23;
                        i5 = i;
                        i6 = ((iM2761 ^ i22) * (-29093)) ^ (-169666382);
                        i7 = 1233886847;
                    }
                    int i4110 = iM2761 ^ i7;
                    sArr3 = sArr;
                    i15 = i2;
                    i30 = i6;
                    sb4 = sb;
                    i28 = i4110;
                    i32 = i4;
                    i40 = i5;
                    bArr2 = bArr;
                    i31 = i3;
                    i42 = i15;
                    break;
                case 929242489:
                case 2101973465:
                    C1542.m5459();
                    C2287.m7745();
                    throw new RuntimeException();
                case 1144747757:
                case 1481857596:
                    C1080.m4046(sb4, (char) (i38 + 65));
                    i39 = i38;
                    iM2763 = (C0619.m2761("֨ܶ") + i23) * 33;
                    i30 = ((iM2763 ^ i22) * 26753) ^ (-883881556);
                    i14 = 865834626;
                    i28 = iM2763 ^ i14;
                    break;
                default:
                    if (C2485.f7950 == 0) {
                        sb = sb4;
                        i = i40;
                        i2 = i42;
                        sArr = sArr3;
                        i3 = i31;
                        i4 = i32;
                        bArr = bArr2;
                        iM2761 = C0773.m3169("ܿ֫") ^ i23;
                        i5 = i;
                        i6 = ((iM2761 ^ i22) * (-29093)) ^ (-169666382);
                        i7 = 1233886847;
                        int i4111 = iM2761 ^ i7;
                        sArr3 = sArr;
                        i15 = i2;
                        i30 = i6;
                        sb4 = sb;
                        i28 = i4111;
                        i32 = i4;
                        i40 = i5;
                        bArr2 = bArr;
                        i31 = i3;
                        i42 = i15;
                    } else {
                        sb3 = sb4;
                        int i5113 = i42;
                        i19 = i31;
                        i20 = i5113;
                        int iM27611 = C0619.m2761("۬ۘ") ^ i22;
                        i30 = 1918021712 ^ ((iM27611 ^ i23) * (-24303));
                        StringBuilder sb17 = sb3;
                        i28 = iM27611 ^ 1782057901;
                        sb4 = sb17;
                        int i4112 = i19;
                        i42 = i20;
                        i31 = i4112;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01ec A[PHI: r1 r2
      0x01ec: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:60:0x01ea, B:56:0x01ca, B:10:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char) binds: [B:60:0x01ea, B:56:0x01ca, B:10:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x021f A[PHI: r6
      0x021f: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x021d, B:44:0x014f, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0254 A[PHI: r5 r7
      0x0254: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:68:0x0252, B:48:0x0172, B:40:0x012c, B:26:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:68:0x0252, B:48:0x0172, B:40:0x012c, B:26:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (l.C3077.f9998 == false) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m10051(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3084.m10051(java.lang.String):int");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23222 m10052() {
        return this.f10009;
    }
}
