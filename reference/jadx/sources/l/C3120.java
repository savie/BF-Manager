package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: LAY9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3120 {

    /* JADX INFO: renamed from: ᩶ܽܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f11759 = {1506, 3263, 3225, 3215, 3224, 3246, 3211, 3230, 3211, 3235, 3204, 3212, 3205, 3266, 3230, 3203, 3207, 3215, 3287, 3270, 3274, 3225, 3231, 3207, 3207, 3211, 3224, 3219, 3287, 3270, 3274, 3204, 3211, 3207, 3215, 3287, 3267, 1717, 25168, -28834, -30984, 91, 87, 23162, -28574, -25430, 23369, -30505, 30598, 21617, -29524, 28243, 21936, 25026, 29746};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f11760;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f11761;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11762;

    /* JADX WARN: Code duplicated, block: B:49:0x0165 A[PHI: r4 r6 r7 r8 r17
      0x0165: PHI (r4v4 long) = (r4v3 long), (r4v1 long), (r4v1 long) binds: [B:48:0x0163, B:44:0x0141, B:40:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:48:0x0163, B:44:0x0141, B:40:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:48:0x0163, B:44:0x0141, B:40:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v3 int) binds: [B:48:0x0163, B:44:0x0141, B:40:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r17v9 int) = (r17v7 int), (r17v8 int), (r17v10 int) binds: [B:48:0x0163, B:44:0x0141, B:40:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x019d A[PHI: r2 r9 r17
      0x019d: PHI (r2v3 long) = (r2v2 long), (r2v1 long), (r2v1 long), (r2v1 long), (r2v1 long) binds: [B:52:0x019b, B:36:0x00fe, B:18:0x0078, B:16:0x0074, B:13:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:52:0x019b, B:36:0x00fe, B:18:0x0078, B:16:0x0074, B:13:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r17v17 int) = (r17v6 int), (r17v11 int), (r17v15 int), (r17v16 int), (r17v18 int) binds: [B:52:0x019b, B:36:0x00fe, B:18:0x0078, B:16:0x0074, B:13:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c8 A[PHI: r11 r12 r13 r17
      0x01c8: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:28:0x00b7, B:24:0x0095, B:13:0x006a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:28:0x00b7, B:24:0x0095, B:13:0x006a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r13v3 java.lang.String) = (r13v1 java.lang.String), (r13v2 java.lang.String), (r13v1 java.lang.String), (r13v1 java.lang.String) binds: [B:28:0x00b7, B:24:0x0095, B:13:0x006a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r17v22 int) = (r17v13 int), (r17v14 int), (r17v18 int), (r17v25 int) binds: [B:28:0x00b7, B:24:0x0095, B:13:0x006a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01fd A[PHI: r10 r17 r18
      0x01fd: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:58:0x01fb, B:32:0x00d8, B:16:0x0074, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r17v19 int) = (r17v5 int), (r17v12 int), (r17v16 int), (r17v21 int) binds: [B:58:0x01fb, B:32:0x00d8, B:16:0x0074, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r18v3 char) = (r18v2 char), (r18v1 char), (r18v1 char), (r18v1 char) binds: [B:58:0x01fb, B:32:0x00d8, B:16:0x0074, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int i;
        int iM11306;
        int i2;
        int i3;
        long j = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int iM11307 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = -336283228;
        int i11 = C1937.f7317;
        int i12 = C1398.f5802;
        int iM45029 = C19806.m45029("᩹ۨ") ^ i11;
        int i13 = ((iM45029 ^ i12) * (-32673)) ^ (-1722105905);
        int i14 = iM45029 ^ 1842894421;
        char c = 0;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i12) * 27871) >> 31));
            switch (i15) {
                case -2040063817:
                case 1586075641:
                    i = i15;
                    c = ' ';
                    if (C3535.m10431() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֨") ^ i11;
                        i2 = ((iM11306 ^ i12) * (-24511)) ^ (-1010028380);
                        i3 = 290257719;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i12;
                        i2 = ((iM11306 ^ i11) * 32415) ^ 342533554;
                        i3 = -1879048067;
                    }
                    int i16 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i16;
                    break;
                case -1980528197:
                case 1053581408:
                    i = i15;
                    i6 = i4 * i5;
                    if (C10634.m26820()) {
                        iM11306 = (C19806.m45029("ܺۚ") + i12) * 127;
                        i2 = ((iM11306 ^ i11) * (-30505)) ^ 1663786750;
                        i3 = 806094659;
                    } else {
                        iM11306 = (C19806.m45029("ۢ۟") + i12) * (-79);
                        i2 = ((iM11306 ^ i11) * 30219) ^ (-1152497270);
                        i3 = 307352714;
                    }
                    int i17 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i17;
                    break;
                case -1915142538:
                case -1715085362:
                    C3660.m10791();
                    C1668.m5583();
                    return 0;
                case -1503546224:
                case -1312408825:
                    i = i15;
                    iM11307 = ThreadFactoryC3888.m11306(this.f11762);
                    if (C3743.m10966() <= 0) {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("᩵᩵")) * (-83);
                        i2 = ((iM11306 ^ i11) * 24707) ^ 369890980;
                        i3 = -2065120593;
                    } else {
                        iM11306 = C19806.m45029("ܺᩳ") ^ i11;
                        i2 = ((iM11306 ^ i12) * (-17371)) ^ (-990662343);
                        i3 = 400263791;
                    }
                    int i18 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i18;
                    break;
                case -1463156455:
                case 1319322946:
                    i = i15;
                    j2 = (j >>> c) ^ j;
                    if (C0817.f3443) {
                        iM11306 = (C19806.m45029("ܿۨ") ^ i12) * 9;
                        i2 = ((iM11306 ^ i11) * 15701) ^ (-1345482872);
                        i3 = 1509673205;
                    } else {
                        iM11306 = (C19806.m45029("ܺۚ") + i12) * 127;
                        i2 = ((iM11306 ^ i11) * (-30505)) ^ 1663786750;
                        i3 = 806094659;
                    }
                    int i19 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i19;
                    break;
                case -1241460174:
                case -656427904:
                    return ThreadFactoryC3888.m11306(str) + i9;
                case -633360671:
                case 963669316:
                    i = i15;
                    i4 = (int) j2;
                    i5 = 31;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("ܺۚ") + i12) * 127;
                        i2 = ((iM11306 ^ i11) * (-30505)) ^ 1663786750;
                        i3 = 806094659;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("᩷ۘ")) * (-81);
                        i2 = ((iM11306 ^ i12) * 20939) ^ 1779714328;
                        i3 = -476638801;
                    }
                    int i110 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i110;
                    break;
                case -412828679:
                case 410609399:
                    i = i15;
                    j = this.f11761;
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ܺۘ") ^ i11;
                        i2 = ((iM11306 ^ i12) * (-1755)) ^ (-762207459);
                        i3 = 1131844266;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("᩵᩵")) * (-83);
                        i2 = ((iM11306 ^ i11) * 24707) ^ 369890980;
                        i3 = -2065120593;
                    }
                    int i111 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i111;
                    break;
                case -92886033:
                case -60357253:
                    i = i15;
                    i7 = iM11307 + i6;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֨") ^ i11;
                        i2 = ((iM11306 ^ i12) * (-24511)) ^ (-1010028380);
                        i3 = 290257719;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܿ") ^ i12;
                        i2 = ((iM11306 ^ i11) * 25591) ^ (-2016883349);
                        i3 = -796124156;
                    }
                    int i112 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i112;
                    break;
                case -84913033:
                case 1748307246:
                    i = i15;
                    C3535.m10431();
                    iM11306 = (i12 - ThreadFactoryC3888.m11306("᩵᩵")) * (-83);
                    i2 = ((iM11306 ^ i11) * 24707) ^ 369890980;
                    i3 = -2065120593;
                    int i113 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i113;
                    break;
                case -73796167:
                case 119243874:
                    i = i15;
                    i8 = 31;
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܺ") ^ i12) * 33;
                        i2 = ((iM11306 ^ i11) * 3657) ^ 1907706570;
                        i3 = -1753278104;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۧ") ^ i11;
                        i2 = ((iM11306 ^ i12) * (-8903)) ^ (-294141994);
                        i3 = -1310287343;
                    }
                    int i114 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i114;
                    break;
                case -32160765:
                case 1503761143:
                    i = i15;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("᩵᩵")) * (-83);
                        i2 = ((iM11306 ^ i11) * 24707) ^ 369890980;
                        i3 = -2065120593;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܺ") ^ i12) * 33;
                        i2 = ((iM11306 ^ i11) * 3657) ^ 1907706570;
                        i3 = -1753278104;
                    }
                    int i115 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i115;
                    break;
                case 1885618:
                case 1515850443:
                    i = i15;
                    i9 = i7 * i8;
                    str = this.f11760;
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܺ") ^ i12) * 33;
                        i2 = ((iM11306 ^ i11) * 3657) ^ 1907706570;
                        i3 = -1753278104;
                    } else {
                        iM11306 = (C19806.m45029("۬᩷") ^ i12) * 23;
                        i2 = ((iM11306 ^ i11) * 5485) ^ (-964241895);
                        i3 = 1760845864;
                    }
                    int i116 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i116;
                    break;
                case 447521940:
                case 969011463:
                    i = i15;
                    if (C3722.m10894() <= 0) {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("᩵᩵")) * (-83);
                        i2 = ((iM11306 ^ i11) * 24707) ^ 369890980;
                        i3 = -2065120593;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֨") ^ i11;
                        i2 = ((iM11306 ^ i12) * (-24511)) ^ (-1010028380);
                        i3 = 290257719;
                    }
                    int i117 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i117;
                    break;
                case 1878284000:
                case 2133152028:
                    if (C1066.m4023() > 0) {
                        i = i15;
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֨") ^ i11;
                        i2 = ((iM11306 ^ i12) * (-24511)) ^ (-1010028380);
                        i3 = 290257719;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i11) * 31;
                        i = i15;
                        i2 = ((iM11306 ^ i12) * 581) ^ 1432765441;
                        i3 = -763815941;
                    }
                    int i118 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i118;
                    break;
                default:
                    i = i15;
                    if (C0797.m3359()) {
                        iM11306 = C19806.m45029("ۧܳ") ^ i11;
                        i2 = ((iM11306 ^ i12) * 6807) ^ 554499306;
                        i3 = 215487416;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܺ") ^ i12) * 33;
                        i2 = ((iM11306 ^ i11) * 3657) ^ 1907706570;
                        i3 = -1753278104;
                    }
                    int i119 = i;
                    i14 = iM11306 ^ i3;
                    i13 = i2;
                    i10 = i119;
                    break;
            }
        }
    }

    public C3120(long j, String str, ArrayList arrayList) {
        int i = 1316107580;
        int i2 = C1875.f7103;
        int i3 = C3660.f13403;
        int iM11306 = ThreadFactoryC3888.m11306("᩷ۛ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 5397) ^ (-312012212);
        int i5 = 1802321014;
        while (true) {
            i = ((((i ^ i3) * 23083) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2141252449:
                case 1756346913:
                    this.f11761 = j;
                    this.f11762 = arrayList;
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("ۚ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22407)) ^ 828788616;
                        i5 = -2076554087;
                    } else {
                        iM11306 = (C19806.m45029("۫۟") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i2) * (-20873)) ^ 623745432;
                        i5 = -779077412;
                    }
                    break;
                case -1945737495:
                case 163335682:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ᩴܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 21431) ^ 1015824668;
                        i5 = 1992915491;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10167) ^ 1592763249;
                        i5 = -78696551;
                    }
                    break;
                case -1722753053:
                case 956652530:
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ᩴܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 21431) ^ 1015824668;
                        i5 = 1992915491;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2477) ^ 495926679;
                        i5 = -945907185;
                    }
                    break;
                case -1694973007:
                case 1345347585:
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ۖ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1169)) ^ 2136448829;
                        i5 = 1584165648;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۜ") ^ i3) * 23;
                        i4 = ((iM11306 ^ i2) * (-18257)) ^ (-439733444);
                        i5 = 265528168;
                    }
                    break;
                case -1351886234:
                case -1236016073:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = C19806.m45029("ۚ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22407)) ^ 828788616;
                        i5 = -2076554087;
                    } else {
                        iM11306 = (C19806.m45029("ۧܺ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * (-27019)) ^ (-2138205219);
                        i5 = 523421994;
                    }
                    break;
                case -1310336174:
                case 1863025978:
                    C0278.m1789();
                    if (C7105.f23796 < 0) {
                        iM11306 = C19806.m45029("ᩴܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 21431) ^ 1015824668;
                        i5 = 1992915491;
                    } else {
                        iM11306 = (C19806.m45029("ۜܺ") ^ i2) * (-59);
                        i4 = ((iM11306 ^ i3) * (-30713)) ^ (-1628908899);
                        i5 = 890613919;
                    }
                    break;
                case -909997946:
                case 1599708462:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C2704.m8255();
                    throw new RuntimeException();
                case -513515486:
                case 2001046730:
                    if (!C0817.f3443) {
                        iM11306 = C19806.m45029("ۖ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1169)) ^ 2136448829;
                        i5 = 1584165648;
                    } else {
                        iM11306 = (C19806.m45029("ۧᩳ") ^ i2) * 49;
                        i4 = ((iM11306 ^ i3) * (-13923)) ^ (-600014184);
                        i5 = 1294471501;
                    }
                    break;
                case -48933013:
                case 1006072392:
                    if (C2871.m8646()) {
                        iM11306 = (C19806.m45029("ܰ۬") ^ i2) * (-75);
                        i4 = ((iM11306 ^ i3) * 32543) ^ 994937219;
                        i5 = 1840867652;
                    } else {
                        iM11306 = C19806.m45029("ۚ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22407)) ^ 828788616;
                        i5 = -2076554087;
                    }
                    break;
                case -23888416:
                case 907672281:
                    RunnableC1606.m5473();
                    iM11306 = C19806.m45029("ۖ۫") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-1169)) ^ 2136448829;
                    i5 = 1584165648;
                    break;
                case -10562459:
                case 1613045251:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ۚ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22407)) ^ 828788616;
                        i5 = -2076554087;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۤ") ^ i2) * (-57);
                        i4 = ((iM11306 ^ i3) * 1657) ^ 1716955880;
                        i5 = 1556197707;
                    }
                    break;
                case 66032360:
                case 1391289482:
                    this.f11760 = str;
                    return;
                case 276745381:
                case 574885405:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (C19806.m45029("ۧᩳ") ^ i2) * 49;
                        i4 = ((iM11306 ^ i3) * (-13923)) ^ (-600014184);
                        i5 = 1294471501;
                    } else {
                        iM11306 = (C19806.m45029("᩸۟") ^ i2) * (-109);
                        i4 = ((iM11306 ^ i3) * 11919) ^ (-55944318);
                        i5 = -492701172;
                    }
                    break;
                case 1235519164:
                case 1385285902:
                    C7105.m18985();
                    if (!C0817.f3443) {
                        iM11306 = (C19806.m45029("ۜܺ") ^ i2) * (-59);
                        i4 = ((iM11306 ^ i3) * (-30713)) ^ (-1628908899);
                        i5 = 890613919;
                    } else {
                        iM11306 = C19806.m45029("ۖ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1169)) ^ 2136448829;
                        i5 = 1584165648;
                    }
                    break;
                case 1303831267:
                case 1536005140:
                    if (RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("ۜܺ") ^ i2) * (-59);
                        i4 = ((iM11306 ^ i3) * (-30713)) ^ (-1628908899);
                        i5 = 890613919;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۜ") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * 6271) ^ (-2082551522);
                        i5 = -1114464561;
                    }
                    break;
                default:
                    if (C1668.m5583()) {
                        iM11306 = (C19806.m45029("۟ۖ") ^ i3) * 5;
                        i4 = ((iM11306 ^ i2) * (-2225)) ^ (-980105104);
                        i5 = -1143208441;
                    } else {
                        iM11306 = (C19806.m45029("ۧᩳ") ^ i2) * 49;
                        i4 = ((iM11306 ^ i3) * (-13923)) ^ (-600014184);
                        i5 = 1294471501;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m9393() {
        return this.f11761;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9394() {
        return this.f11760;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m9396() {
        return this.f11762;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00be A[PHI: r4
      0x00be: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v1 java.lang.String) binds: [B:28:0x00bc, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0178 A[PHI: r2 r5 r7 r15
      0x0178: PHI (r2v35 long) = (r2v29 long), (r2v1 long), (r2v1 long), (r2v1 long) binds: [B:47:0x0176, B:32:0x00f9, B:91:0x0178, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:47:0x0176, B:32:0x00f9, B:91:0x0178, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r7v5 java.lang.StringBuilder) = 
      (r7v3 java.lang.StringBuilder)
      (r7v2 java.lang.StringBuilder)
      (r7v2 java.lang.StringBuilder)
      (r7v2 java.lang.StringBuilder)
     binds: [B:47:0x0176, B:32:0x00f9, B:91:0x0178, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r15v3 short[]) = (r15v1 short[]), (r15v2 short[]), (r15v1 short[]), (r15v1 short[]) binds: [B:47:0x0176, B:32:0x00f9, B:91:0x0178, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        long j = 0;
        String strM5502 = null;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = -1065199594;
        int i9 = C2249.f8050;
        int i10 = C1460.f5948;
        int iM450210 = (C19806.m45029("ۜ۫") ^ i9) * (-107);
        int i11 = ((iM450210 ^ i10) * 6191) ^ 1377177291;
        int i12 = iM450210 ^ (-1639608658);
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i13 = 0;
        StringBuilder sb = null;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        short s2 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-6643)) >> 31));
            switch (i8) {
                case -2095451728:
                case -1102018631:
                    if (C0671.m3008() >= 0) {
                        iM45029 = C19806.m45029("۫ܳ") ^ i9;
                        i3 = ((iM45029 ^ i10) * (-19437)) ^ 1975883286;
                        i4 = -357225063;
                    } else {
                        iM45029 = C19806.m45029("᩷ܿ") ^ i9;
                        i3 = ((iM45029 ^ i10) * (-1451)) ^ (-412495105);
                        i4 = 1833907517;
                    }
                    i12 = iM45029 ^ i4;
                    i11 = i3;
                    break;
                case -2037842525:
                case -1779595028:
                    j = j;
                    if ((s * s2) - i17 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۚ") ^ i10;
                        i = ((iM11306 ^ i9) * (-20589)) ^ 1433817136;
                        i2 = 686580689;
                    } else {
                        iM11306 = C19806.m45029("ۨ֡") ^ i9;
                        i = ((iM11306 ^ i10) * (-23087)) ^ 1049547844;
                        i2 = -98858998;
                    }
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    j = j;
                    break;
                case -1520585097:
                case 2017030607:
                    C2788.m8480(sb, RunnableC3388.m10056(sArr, i6, i7, i5));
                    if (C3535.f13026 > 0) {
                        iM45029 = (i10 - C19806.m45029("ۙۡ")) * 67;
                        i3 = ((iM45029 ^ i9) * (-8615)) ^ 1123280815;
                        i4 = 1424946041;
                        i12 = iM45029 ^ i4;
                        i11 = i3;
                    } else {
                        j = j;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۘ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i10) * 19307) ^ (-1791963947);
                        i2 = -698506853;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        j = j;
                    }
                    break;
                case -1427042261:
                case 718709086:
                    C0278.m1789();
                    j = j;
                    int iM11307 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i10;
                    i12 = iM11307 ^ 226533899;
                    i11 = ((iM11307 ^ i9) * (-19971)) ^ 854382507;
                    j = j;
                    sb = null;
                    break;
                case -1389404166:
                case 463886208:
                    if (C1460.f5948 >= 0) {
                        j = j;
                        iM11306 = (i10 - C19806.m45029("۬ܺ")) * (-69);
                        i = ((iM11306 ^ i9) * (-13389)) ^ (-420877666);
                        i2 = 1841747118;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        j = j;
                    } else {
                        j = j;
                        int iM11308 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i10;
                        i12 = iM11308 ^ 226533899;
                        i11 = ((iM11308 ^ i9) * (-19971)) ^ 854382507;
                        j = j;
                        sb = null;
                    }
                    break;
                case -1344017827:
                case -336631082:
                    if (C2704.m8255() <= 0) {
                        iM45029 = C19806.m45029("۫ܳ") ^ i9;
                        i3 = ((iM45029 ^ i10) * (-19437)) ^ 1975883286;
                        i4 = -357225063;
                        i12 = iM45029 ^ i4;
                        i11 = i3;
                    } else {
                        j = j;
                        int iM11309 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i10;
                        i12 = iM11309 ^ 226533899;
                        i11 = ((iM11309 ^ i9) * (-19971)) ^ 854382507;
                        j = j;
                        sb = null;
                    }
                    break;
                case -1269424567:
                case -739853473:
                    sArr4 = f11759;
                    i14 = 36;
                    i15 = 1;
                    if (C2871.f10837 < 0) {
                        iM45029 = (C19806.m45029("᩷ۤ") ^ i9) * 63;
                        i3 = ((iM45029 ^ i10) * 26851) ^ (-569609268);
                        i4 = 485381297;
                        i12 = iM45029 ^ i4;
                        i11 = i3;
                    } else {
                        j = j;
                        int iM113010 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i10;
                        i12 = iM113010 ^ 226533899;
                        i11 = ((iM113010 ^ i9) * (-19971)) ^ 854382507;
                        j = j;
                        sb = null;
                    }
                    break;
                case -1234546218:
                case 256590796:
                    strM5502 = CallableC1627.m5502(sArr2, i13, 7, i5);
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("᩷ܿ") ^ i9;
                        i3 = ((iM45029 ^ i10) * (-1451)) ^ (-412495105);
                        i4 = 1833907517;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("᩻ᩴ")) * 25;
                        i3 = ((iM45029 ^ i9) * (-23865)) ^ (-1005895232);
                        i4 = -1777929142;
                    }
                    i12 = iM45029 ^ i4;
                    i11 = i3;
                    break;
                case -1202814321:
                case -503145396:
                    short[] sArr5 = f11759;
                    if (C1066.f4915 > 0) {
                        sb = new StringBuilder(C2642.m8172(sArr5, 1, 18, i5));
                        j = this.f11761;
                        if (C0050.f912 <= 0) {
                            iM45029 = C19806.m45029("۫ܳ") ^ i9;
                            i3 = ((iM45029 ^ i10) * (-19437)) ^ 1975883286;
                            i4 = -357225063;
                        } else {
                            iM45029 = (i10 - C19806.m45029("ܿ᩻")) * 27;
                            i3 = ((iM45029 ^ i9) * 16993) ^ 1493161746;
                            i4 = 842618788;
                        }
                        i12 = iM45029 ^ i4;
                        i11 = i3;
                    } else {
                        j = j;
                        int iM113011 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i10;
                        i12 = iM113011 ^ 226533899;
                        i11 = ((iM113011 ^ i9) * (-19971)) ^ 854382507;
                        j = j;
                        sb = null;
                    }
                    break;
                case -856040319:
                case -681094244:
                    i5 = 3306;
                    iM11306 = (C19806.m45029("֫ۧ") ^ i10) * (-5);
                    i = ((iM11306 ^ i9) * (-24229)) ^ 1220009432;
                    i2 = 870285985;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    j = j;
                    break;
                case -465811557:
                case 1263815407:
                    return C1694.m5622(sb, strM5502, this.f11760, C1668.m5577(sArr4, i14, i15, i5));
                case -448442285:
                case 2031728641:
                    RunnableC1895.m6168(sb, this.f11762);
                    sArr2 = f11759;
                    i13 = 29;
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = C19806.m45029("۫ܳ") ^ i9;
                        i3 = ((iM45029 ^ i10) * (-19437)) ^ 1975883286;
                        i4 = -357225063;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۜᩳ")) * 33;
                        i3 = ((iM45029 ^ i10) * (-19651)) ^ (-156026708);
                        i4 = 2059730062;
                    }
                    i12 = iM45029 ^ i4;
                    i11 = i3;
                    break;
                case -409370033:
                case 136411854:
                    j = j;
                    sArr3 = f11759;
                    c = 0;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i10 - C19806.m45029("۬ܺ")) * (-69);
                        i = ((iM11306 ^ i9) * (-13389)) ^ (-420877666);
                        i2 = 1841747118;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۧ") ^ i10;
                        i = ((iM11306 ^ i9) * (-2147)) ^ 936977065;
                        i2 = -661679903;
                    }
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    j = j;
                    break;
                case -375988891:
                case 98970931:
                    C1977.m6356();
                    return null;
                case 602717176:
                case 980943580:
                    i5 = 8492;
                    iM11306 = (C19806.m45029("֫ۧ") ^ i10) * (-5);
                    i = ((iM11306 ^ i9) * (-24229)) ^ 1220009432;
                    i2 = 870285985;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    j = j;
                    break;
                case 897316779:
                case 1016712825:
                    j = j;
                    s = sArr3[c];
                    i16 = s * s;
                    if (C1398.f5802 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙᩴ") ^ i9) * (-127);
                        i = ((iM11306 ^ i10) * (-2973)) ^ (-912676550);
                        i2 = -1102489436;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        j = j;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i10;
                        i12 = iM113012 ^ 226533899;
                        i11 = ((iM113012 ^ i9) * (-19971)) ^ 854382507;
                        j = j;
                        sb = null;
                    }
                    break;
                case 1014811034:
                case 2057597241:
                    C3577.m10562(sb, j);
                    sArr = f11759;
                    i6 = 19;
                    i7 = 10;
                    if (!RunnableC1895.f7152) {
                        j = j;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۘ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i10) * 19307) ^ (-1791963947);
                        i2 = -698506853;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        j = j;
                    } else {
                        iM45029 = C19806.m45029("ۛܽ") ^ i9;
                        i3 = ((iM45029 ^ i10) * (-26161)) ^ (-1124622739);
                        i4 = 1698577626;
                        i12 = iM45029 ^ i4;
                        i11 = i3;
                    }
                    break;
                default:
                    j = j;
                    i17 = i16 + 38416;
                    s2 = 392;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۘ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i10) * 19307) ^ (-1791963947);
                        i2 = -698506853;
                    } else {
                        iM11306 = C19806.m45029("᩶ۛ") ^ i9;
                        i = ((iM11306 ^ i10) * 2667) ^ (-260877541);
                        i2 = 1189648361;
                    }
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    j = j;
                    break;
            }
        }
    }

    public final boolean equals(Object obj) {
        C3120 c3120 = null;
        long j = 0;
        int i = 833433196;
        int i2 = C1461.f5957;
        int i3 = C3535.f13026;
        int iM45029 = (i3 - C19806.m45029("ܽܺ")) * 39;
        int i4 = ((iM45029 ^ i2) * (-13621)) ^ (-1554777322);
        int i5 = -293541209;
        while (true) {
            i = ((((i ^ i2) * 4497) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2087812722:
                case 726482557:
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۤ") ^ i3) * (-85);
                        i4 = ((iM45029 ^ i2) * (-7149)) ^ (-1389778161);
                        i5 = -1189708413;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32005)) ^ 1554364403;
                        i5 = -1302556963;
                    }
                    break;
                case -1954900343:
                case 775472440:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1103) ^ (-762917597);
                        i5 = 1885713174;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32005)) ^ 1554364403;
                        i5 = -1302556963;
                    }
                    break;
                case -1923685085:
                case -1733434232:
                    if (obj instanceof C3120) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1545) ^ (-977326562);
                        i5 = -80220234;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩻") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i3) * 15969) ^ 1204194112;
                        i5 = 2118850980;
                    }
                    break;
                case -1870070958:
                case -795926229:
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32631) ^ 1505738951;
                        i5 = -105728027;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۤ᩵")) * (-3);
                        i4 = ((iM45029 ^ i3) * 12133) ^ 1215861409;
                        i5 = 993083652;
                    }
                    break;
                case -1760045704:
                case 797270376:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i2 - C19806.m45029("۟ۧ")) * 43;
                        i4 = ((iM45029 ^ i3) * 2397) ^ (-322193999);
                        i5 = -500974796;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩺") ^ i2) * (-103);
                        i4 = ((iM45029 ^ i3) * 26927) ^ (-646883907);
                        i5 = -1674765841;
                    }
                    break;
                case -1579713964:
                case 171971441:
                    C1977.m6356();
                    C1398.m4895();
                    iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩸") ^ i3) * 41;
                    i4 = ((iM45029 ^ i2) * 11781) ^ (-1698697424);
                    i5 = 989449270;
                    break;
                case -1574262335:
                case -194972993:
                    if (AbstractC0464.m2315(this.f11762, c3120.f11762)) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16929) ^ (-746588964);
                        i5 = -1513045426;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩻") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i3) * 15969) ^ 1204194112;
                        i5 = 2118850980;
                    }
                    break;
                case -1547798682:
                case -840804786:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32631) ^ 1505738951;
                        i5 = -105728027;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵۠") ^ i2) * 47;
                        i4 = ((iM45029 ^ i3) * 24759) ^ (-1413555818);
                        i5 = 418401013;
                    }
                    break;
                case -1529570072:
                case 150537747:
                    c3120 = (C3120) obj;
                    j = this.f11761;
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-903)) ^ (-1062175028);
                        i5 = -522518501;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩸") ^ i3) * 41;
                        i4 = ((iM45029 ^ i2) * 11781) ^ (-1698697424);
                        i5 = 989449270;
                    }
                    break;
                case -1463402480:
                case 1971664233:
                    if (this == obj) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22345) ^ (-887634704);
                        i5 = 829476639;
                    } else {
                        iM45029 = C19806.m45029("ۛۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14569) ^ 894346777;
                        i5 = -718076962;
                    }
                    break;
                case -1086847262:
                case 168615332:
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32005)) ^ 1554364403;
                        i5 = -1302556963;
                    } else {
                        iM45029 = (C19806.m45029("᩹۬") + i2) * 45;
                        i4 = ((iM45029 ^ i3) * 4455) ^ 991087092;
                        i5 = -1592758269;
                    }
                    break;
                case -818697978:
                case 1219331509:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32005)) ^ 1554364403;
                        i5 = -1302556963;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۤ֨")) * (-119);
                        i4 = ((iM45029 ^ i3) * (-7107)) ^ 829126425;
                        i5 = -949059345;
                    }
                    break;
                case -373167566:
                case 989843805:
                    C3535.m10431();
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("۫۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-659)) ^ (-768503048);
                        i5 = 452347297;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32631) ^ 1505738951;
                        i5 = -105728027;
                    }
                    break;
                case -306214433:
                case -19266569:
                    C3743.m10966();
                    if (!C0817.f3443) {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32631) ^ 1505738951;
                        i5 = -105728027;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۟ۧ")) * 43;
                        i4 = ((iM45029 ^ i3) * 2397) ^ (-322193999);
                        i5 = -500974796;
                    }
                    break;
                case -215665929:
                case 106593795:
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32005)) ^ 1554364403;
                        i5 = -1302556963;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15709)) ^ 1400460805;
                        i5 = 683489387;
                    }
                    break;
                case -97508165:
                case 1401070193:
                    if (!C1460.m5058(this.f11760, c3120.f11760)) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩻") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i3) * 15969) ^ 1204194112;
                        i5 = 2118850980;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22345) ^ (-887634704);
                        i5 = 829476639;
                    }
                    break;
                case 78468792:
                case 1762989567:
                    return true;
                case 472818170:
                case 575369773:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32631) ^ 1505738951;
                        i5 = -105728027;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26169) ^ (-1209556753);
                        i5 = 391051050;
                    }
                    break;
                case 894387518:
                case 1159111903:
                    C19806.m45024();
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32631) ^ 1505738951;
                        i5 = -105728027;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩸") ^ i3) * 41;
                        i4 = ((iM45029 ^ i2) * 11781) ^ (-1698697424);
                        i5 = 989449270;
                    }
                    break;
                case 1637127909:
                case 1793809637:
                    C3286.m9798();
                    return false;
                case 1812380367:
                case 2002665209:
                    if (j != c3120.f11761) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩻") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i3) * 15969) ^ 1204194112;
                        i5 = 2118850980;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ֨") + i3) * 97;
                        i4 = ((iM45029 ^ i2) * 25111) ^ (-664016334);
                        i5 = -160960266;
                    }
                    break;
                default:
                    return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x021c  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d1 A[PHI: r7 r11 r26
      0x02d1: PHI (r7v4 l.ۢ۠᩺) = (r7v3 l.ۢ۠᩺), (r7v2 l.ۢ۠᩺), (r7v2 l.ۢ۠᩺) binds: [B:79:0x02cf, B:64:0x024a, B:18:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r11v5 java.lang.String) = (r11v2 java.lang.String), (r11v4 java.lang.String), (r11v2 java.lang.String) binds: [B:79:0x02cf, B:64:0x024a, B:18:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r26v5 int) = (r26v4 int), (r26v3 int), (r26v3 int) binds: [B:79:0x02cf, B:64:0x024a, B:18:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b5, code lost:
    
        if (l.RunnableC3388.f12514 >= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bd, code lost:
    
        if (l.C2124.f7782 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        if (l.AbstractC0464.f2088 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ca, code lost:
    
        r0 = l.C19806.m45029("ۖ۬") ^ r23;
        r8 = ((r0 ^ r22) * (-21229)) ^ (-460762849);
        r25 = 346122742;
     */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m9395() {
        /*
            Method dump skipped, instruction units count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3120.m9395():java.lang.String");
    }
}
