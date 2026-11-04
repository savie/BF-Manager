package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: LAY9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1079 {

    /* JADX INFO: renamed from: ܶܽ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f3861 = {5503, -20318, -20348, -20334, -20347, -20301, -20330, -20349, -20330, -20290, -20327, -20335, -20328, -20257, -20349, -20322, -20326, -20334, -20278, -20261, -20265, -20348, -20350, -20326, -20326, -20330, -20347, -20338, -20278, -20261, -20265, -20327, -20330, -20326, -20334, -20278, -20258, 2378, 18469, -19521, 18028, 10689, 10701, -21953, -24293, 24111, 31174, 21006, 24414, 20897, 30584, 23675, 29877, -24501, -17863};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f3862;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f3863;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f3864;

    /* JADX WARN: Code duplicated, block: B:15:0x006f A[PHI: r17
      0x006f: PHI (r17v23 int) = (r17v18 int), (r17v20 int), (r17v25 int) binds: [B:13:0x006b, B:10:0x0061, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x012a A[PHI: r8 r11 r17
      0x012a: PHI (r8v3 int) = (r8v2 int), (r8v1 int) binds: [B:38:0x0128, B:26:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:38:0x0128, B:26:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r17v13 int) = (r17v10 int), (r17v14 int) binds: [B:38:0x0128, B:26:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x019f A[PHI: r2 r4 r6 r7 r9 r17
      0x019f: PHI (r2v3 long) = (r2v2 long), (r2v1 long), (r2v1 long), (r2v1 long), (r2v1 long) binds: [B:50:0x019d, B:46:0x017c, B:42:0x015d, B:34:0x0106, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r4v4 long) = (r4v1 long), (r4v3 long), (r4v1 long), (r4v1 long), (r4v1 long) binds: [B:50:0x019d, B:46:0x017c, B:42:0x015d, B:34:0x0106, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:50:0x019d, B:46:0x017c, B:42:0x015d, B:34:0x0106, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:50:0x019d, B:46:0x017c, B:42:0x015d, B:34:0x0106, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:50:0x019d, B:46:0x017c, B:42:0x015d, B:34:0x0106, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r17v19 int) = (r17v7 int), (r17v8 int), (r17v9 int), (r17v11 int), (r17v20 int) binds: [B:50:0x019d, B:46:0x017c, B:42:0x015d, B:34:0x0106, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ef A[PHI: r10 r12 r13 r17 r18
      0x01ef: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:58:0x01ed, B:54:0x01ce, B:30:0x00e3, B:22:0x00a1, B:16:0x0087, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:58:0x01ed, B:54:0x01ce, B:30:0x00e3, B:22:0x00a1, B:16:0x0087, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r13v3 java.lang.String) = 
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v2 java.lang.String)
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
     binds: [B:58:0x01ed, B:54:0x01ce, B:30:0x00e3, B:22:0x00a1, B:16:0x0087, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r17v17 int) = (r17v5 int), (r17v6 int), (r17v12 int), (r17v15 int), (r17v16 int), (r17v18 int) binds: [B:58:0x01ed, B:54:0x01ce, B:30:0x00e3, B:22:0x00a1, B:16:0x0087, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r18v3 char) = (r18v2 char), (r18v1 char), (r18v1 char), (r18v1 char), (r18v1 char), (r18v1 char) binds: [B:58:0x01ed, B:54:0x01ce, B:30:0x00e3, B:22:0x00a1, B:16:0x0087, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int i;
        int iM2761;
        int i2;
        int i3;
        long j = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int iM3169 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 1616226771;
        int i11 = C1826.f6190;
        int i12 = C4238.f15451;
        int iM31610 = C0773.m3169("ܶܶ") ^ i11;
        int i13 = ((iM31610 ^ i12) * 14049) ^ (-1787040800);
        int i14 = iM31610 ^ (-806471966);
        char c = 0;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i12) * (-2105)) >> 31));
            switch (i15) {
                case -1738700023:
                case -1668532749:
                    i = i15;
                    i4 = (int) j2;
                    i5 = 31;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("᩷ܳ") + i11) * (-93);
                        i2 = ((iM2761 ^ i12) * 19797) ^ (-440097225);
                        i3 = 980768345;
                    } else {
                        iM2761 = C0773.m3169("ۜۙ") ^ i11;
                        i2 = ((iM2761 ^ i12) * (-16179)) ^ (-1920937908);
                        i3 = 2024690620;
                    }
                    int i16 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i16;
                    break;
                case -1626159054:
                case 1081519376:
                    i = i15;
                    j = this.f3863;
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("᩷ܳ") + i11) * (-93);
                        i2 = ((iM2761 ^ i12) * 19797) ^ (-440097225);
                        i3 = 980768345;
                    } else {
                        iM2761 = C0773.m3169("ۜۨ") ^ i12;
                        i2 = ((iM2761 ^ i11) * (-23413)) ^ (-1579706459);
                        i3 = -587841234;
                    }
                    int i17 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i17;
                    break;
                case -1514134792:
                case 1782687627:
                    i = i15;
                    j2 = (j >>> c) ^ j;
                    if (C17202.f56030) {
                        iM2761 = (i11 - C0619.m2761("᩵᩹")) * 67;
                        i2 = ((iM2761 ^ i12) * (-17467)) ^ (-116722982);
                        i3 = -74238598;
                    } else {
                        iM2761 = (C0773.m3169("᩷ܳ") + i11) * (-93);
                        i2 = ((iM2761 ^ i12) * 19797) ^ (-440097225);
                        i3 = 980768345;
                    }
                    int i18 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i18;
                    break;
                case -1425284155:
                case 1772150891:
                    i = i15;
                    c = ' ';
                    if (C2354.m7983()) {
                        iM2761 = C0619.m2761("ۗۧ") ^ i12;
                        i2 = ((iM2761 ^ i11) * 4691) ^ 80272776;
                        i3 = -1356458426;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩻") ^ i11) * (-29);
                        i2 = ((iM2761 ^ i12) * 20785) ^ (-971836653);
                        i3 = -866207928;
                    }
                    int i19 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i19;
                    break;
                case -1183931192:
                case 64951696:
                    i = i15;
                    i9 = i7 * i8;
                    str = this.f3862;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("᩹᩻") ^ i11) * (-29);
                        i2 = ((iM2761 ^ i12) * 20785) ^ (-971836653);
                        i3 = -866207928;
                    } else {
                        iM2761 = (C0619.m2761("ܽ᩻") ^ i11) * 11;
                        i2 = ((iM2761 ^ i12) * (-14719)) ^ 1594150321;
                        i3 = -1625948301;
                    }
                    int i110 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i110;
                    break;
                case -929268201:
                case 2072686147:
                    i = i15;
                    i7 = iM3169 + i6;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("᩹᩻") ^ i11) * (-29);
                        i2 = ((iM2761 ^ i12) * 20785) ^ (-971836653);
                        i3 = -866207928;
                    } else {
                        iM2761 = C0773.m3169("᩺֨") ^ i11;
                        i2 = ((iM2761 ^ i12) * 16481) ^ 973496421;
                        i3 = 1439077177;
                    }
                    int i111 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i111;
                    break;
                case -892708352:
                case 1895757547:
                    return C0619.m2761(str) + i9;
                case -698444301:
                case 1330028260:
                    i = i15;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ۡܿ") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM2761 ^ i11) * 1015) ^ 273894716;
                        i3 = -1260029425;
                    } else {
                        iM2761 = (C0773.m3169("᩷ܳ") + i11) * (-93);
                        i2 = ((iM2761 ^ i12) * 19797) ^ (-440097225);
                        i3 = 980768345;
                    }
                    int i112 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i112;
                    break;
                case -154531211:
                case 824220336:
                    i = i15;
                    i8 = 31;
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0773.m3169("ۛۘ") ^ i12;
                        i2 = ((iM2761 ^ i11) * 22223) ^ (-88815325);
                        i3 = -1563677597;
                    } else {
                        iM2761 = (C0619.m2761("ܳ۟") + i12) * 19;
                        i2 = ((iM2761 ^ i11) * 15063) ^ 388136672;
                        i3 = -1938454145;
                    }
                    int i113 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i113;
                    break;
                case -102316462:
                case 1572694759:
                    C1542.m5459();
                    return 0;
                case 428994975:
                case 513671181:
                    i = i15;
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("᩹᩻") ^ i11) * (-29);
                        i2 = ((iM2761 ^ i12) * 20785) ^ (-971836653);
                        i3 = -866207928;
                    } else {
                        iM2761 = C0773.m3169("ۜ۬") ^ i11;
                        i2 = ((iM2761 ^ i12) * 11247) ^ (-1706059296);
                        i3 = -67690427;
                    }
                    int i114 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i114;
                    break;
                case 474725158:
                case 656608061:
                    i = i15;
                    i6 = i4 * i5;
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ۛۘ") ^ i12;
                        i2 = ((iM2761 ^ i11) * 22223) ^ (-88815325);
                        i3 = -1563677597;
                    } else {
                        iM2761 = C0773.m3169("۬᩶") ^ i12;
                        i2 = ((iM2761 ^ i11) * (-18399)) ^ (-1127125413);
                        i3 = -1469651740;
                    }
                    int i115 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i115;
                    break;
                case 517023943:
                case 1724096216:
                    i = i15;
                    iM3169 = C0773.m3169(this.f3864);
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0773.m3169("᩷ܳ") + i11) * (-93);
                        i2 = ((iM2761 ^ i12) * 19797) ^ (-440097225);
                        i3 = 980768345;
                    } else {
                        iM2761 = (C0773.m3169("᩺ۜ") ^ i12) * 37;
                        i2 = ((iM2761 ^ i11) * (-8749)) ^ 1939462276;
                        i3 = 328096852;
                    }
                    int i116 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i116;
                    break;
                case 924766222:
                case 2098836440:
                    i = i15;
                    C2375.m8065();
                    iM2761 = (C0619.m2761("᩹᩻") ^ i11) * (-29);
                    i2 = ((iM2761 ^ i12) * 20785) ^ (-971836653);
                    i3 = -866207928;
                    int i117 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i117;
                    break;
                case 993925191:
                case 1845111600:
                    i = i15;
                    C3779.m12264();
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("᩹᩻") ^ i11) * (-29);
                        i2 = ((iM2761 ^ i12) * 20785) ^ (-971836653);
                        i3 = -866207928;
                    } else {
                        iM2761 = (C0619.m2761("ۡܿ") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM2761 ^ i11) * 1015) ^ 273894716;
                        i3 = -1260029425;
                    }
                    int i118 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i118;
                    break;
                default:
                    C3690.m11987();
                    if (C2310.f7472 >= 0) {
                        i = i15;
                        iM2761 = (C0619.m2761("ۡܿ") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM2761 ^ i11) * 1015) ^ 273894716;
                        i3 = -1260029425;
                    } else {
                        iM2761 = (i12 - C0619.m2761("۬۟")) * (-81);
                        i = i15;
                        i2 = ((iM2761 ^ i11) * (-4411)) ^ 2111970710;
                        i3 = 2131569038;
                    }
                    int i119 = i;
                    i14 = iM2761 ^ i3;
                    i13 = i2;
                    i10 = i119;
                    break;
            }
        }
    }

    public C1079(long j, String str, ArrayList arrayList) {
        int i = -1741821602;
        int i2 = C3099.f10023;
        int i3 = C3779.f12953;
        int iM3169 = C0773.m3169("ۡۛ") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-4551)) ^ 264516008;
        int i5 = -439954961;
        while (true) {
            i = ((((i ^ i3) * 27289) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2124020774:
                case -1153144553:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ܽ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5187) ^ (-310346257);
                        i5 = -703976789;
                    } else {
                        iM3169 = (C0619.m2761("۠ۜ") ^ i2) * 41;
                        i4 = ((iM3169 ^ i3) * (-20521)) ^ 734843101;
                        i5 = 688222408;
                    }
                    break;
                case -2096645201:
                case 580712146:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ۧ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7217) ^ 522577446;
                        i5 = 1109627589;
                    } else {
                        iM3169 = C0773.m3169("֫᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5993) ^ (-1672076813);
                        i5 = -1388200272;
                    }
                    break;
                case -2080769157:
                case 221619305:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ۧ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7217) ^ 522577446;
                        i5 = 1109627589;
                    } else {
                        iM3169 = (C0773.m3169("۬᩻") + i2) * (-119);
                        i4 = ((iM3169 ^ i3) * 26219) ^ (-211874816);
                        i5 = -1086753849;
                    }
                    break;
                case -2066141770:
                case -1007629883:
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("ۡܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1121) ^ 2107363267;
                        i5 = -485077009;
                    } else {
                        iM3169 = (C0619.m2761("ۘۛ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * (-21409)) ^ (-1471495553);
                        i5 = 890790583;
                    }
                    break;
                case -2034202879:
                case 1709890414:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("ۘۛ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * (-21409)) ^ (-1471495553);
                        i5 = 890790583;
                    } else {
                        iM3169 = (C0773.m3169("֡۫") ^ i2) * 55;
                        i4 = ((iM3169 ^ i3) * (-14425)) ^ 1932864212;
                        i5 = -2119548511;
                    }
                    break;
                case -2025722200:
                case -7170850:
                    C2702.m8876();
                    if (!C2023.f6737) {
                        iM3169 = C0773.m3169("ۧ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7217) ^ 522577446;
                        i5 = 1109627589;
                    } else {
                        iM3169 = C0619.m2761("ᩳۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 87) ^ 154310815;
                        i5 = -1115993749;
                    }
                    break;
                case -1865047521:
                case -1538513684:
                    this.f3862 = str;
                    return;
                case -1790006685:
                case 1338248826:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("ۤۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1845)) ^ (-384271989);
                        i5 = -1857954984;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۙ۟")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i2) * 8789) ^ 680214611;
                        i5 = 708009506;
                    }
                    break;
                case -1421033983:
                case -1114310797:
                    this.f3863 = j;
                    this.f3864 = arrayList;
                    if (C17202.f56030) {
                        iM3169 = (C0619.m2761("ۘۙ") ^ i3) * (-27);
                        i4 = ((iM3169 ^ i2) * (-22057)) ^ 986082005;
                        i5 = -534453782;
                    } else {
                        iM3169 = C0619.m2761("ᩳۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 87) ^ 154310815;
                        i5 = -1115993749;
                    }
                    break;
                case -1235740323:
                case -1193713942:
                    if (!C2288.m7767()) {
                        iM3169 = C0619.m2761("ᩳۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 87) ^ 154310815;
                        i5 = -1115993749;
                    } else {
                        iM3169 = (C0619.m2761("ۘۛ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * (-21409)) ^ (-1471495553);
                        i5 = 890790583;
                    }
                    break;
                case -373915003:
                case 443659234:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ۤۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1845)) ^ (-384271989);
                        i5 = -1857954984;
                    } else {
                        iM3169 = (C0619.m2761("ۘۛ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * (-21409)) ^ (-1471495553);
                        i5 = 890790583;
                    }
                    break;
                case 203566146:
                case 1685301371:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("ܽ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5187) ^ (-310346257);
                        i5 = -703976789;
                    } else {
                        iM3169 = C0773.m3169("۫ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19307) ^ 29333402;
                        i5 = 1282564087;
                    }
                    break;
                case 676358159:
                case 2093917657:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ۤۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1845)) ^ (-384271989);
                        i5 = -1857954984;
                    } else {
                        iM3169 = (C0619.m2761("ۘۡ") ^ i2) * (-119);
                        i4 = ((iM3169 ^ i3) * 29087) ^ (-1829310211);
                        i5 = -51920146;
                    }
                    break;
                case 974302688:
                case 2120890996:
                    C3448.m11248();
                    iM3169 = C0619.m2761("ᩳۜ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 87) ^ 154310815;
                    i5 = -1115993749;
                    break;
                case 1889304591:
                case 2013620757:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ܽ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5187) ^ (-310346257);
                        i5 = -703976789;
                    } else {
                        iM3169 = C0773.m3169("᩻ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30003)) ^ 440766236;
                        i5 = -1915272767;
                    }
                    break;
                default:
                    C23916.m53419();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m4041() {
        return this.f3862;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m4043() {
        return this.f3864;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m4044() {
        return this.f3863;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x013b A[PHI: r13 r14 r15
      0x013b: PHI (r13v3 short[]) = (r13v2 short[]), (r13v1 short[]) binds: [B:39:0x0139, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r14v3 int) = (r14v2 int), (r14v1 int) binds: [B:39:0x0139, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r15v3 int) = (r15v2 int), (r15v1 int) binds: [B:39:0x0139, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0240 A[PHI: r18 r19
      0x0240: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:59:0x023e, B:35:0x0114] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r19v4 short) = (r19v3 short), (r19v2 short) binds: [B:59:0x023e, B:35:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0276 A[PHI: r2 r10 r16 r17
      0x0276: PHI (r2v5 long) = (r2v1 long), (r2v1 long), (r2v1 long), (r2v4 long), (r2v1 long) binds: [B:63:0x0274, B:17:0x0084, B:9:0x006d, B:46:0x0198, B:87:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r10v4 java.lang.StringBuilder) = 
      (r10v2 java.lang.StringBuilder)
      (r10v2 java.lang.StringBuilder)
      (r10v2 java.lang.StringBuilder)
      (r10v3 java.lang.StringBuilder)
      (r10v2 java.lang.StringBuilder)
     binds: [B:63:0x0274, B:17:0x0084, B:9:0x006d, B:46:0x0198, B:87:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0274, B:17:0x0084, B:9:0x006d, B:46:0x0198, B:87:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:63:0x0274, B:17:0x0084, B:9:0x006d, B:46:0x0198, B:87:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        int iM3169;
        int i;
        int i2;
        long j = 0;
        String strM5399 = null;
        int i3 = 0;
        short[] sArr = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = -483105054;
        int i7 = C1542.f5343;
        int i8 = C0269.f1558;
        int iM2761 = C0619.m2761("ۜܺ") ^ i8;
        int i9 = ((iM2761 ^ i7) * 27027) ^ 413604133;
        int i10 = iM2761 ^ (-1179246143);
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        StringBuilder sb = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * (-24649)) >> 31));
            switch (i6) {
                case -1910452612:
                case -327099346:
                    C0862.m3503();
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ܰᩳ") ^ i8;
                        i = ((iM3169 ^ i7) * (-12561)) ^ 1992236956;
                        i2 = -1092808998;
                    } else {
                        iM3169 = C0619.m2761("ܺۚ") ^ i8;
                        i = ((iM3169 ^ i7) * 6431) ^ 116033578;
                        i2 = -844504812;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1852084346:
                case 1179887498:
                    RunnableC3646.m11813();
                    return null;
                case -1762631168:
                case 1402703154:
                    sArr3 = f3861;
                    c = 0;
                    if (C17202.m40372()) {
                        iM3169 = C0773.m3169("۫ۛ") ^ i8;
                        i = ((iM3169 ^ i7) * (-6339)) ^ 395196199;
                        i2 = -424493105;
                    } else {
                        iM3169 = C0773.m3169("ܰᩳ") ^ i8;
                        i = ((iM3169 ^ i7) * (-12561)) ^ 1992236956;
                        i2 = -1092808998;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1535663796:
                case -487612437:
                    if (!C2354.m7983()) {
                        iM3169 = (C0773.m3169("᩶ۜ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i8) * 10063) ^ 236742588;
                        i2 = -458947463;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } else {
                        int iM31610 = C0773.m3169("ۢۢ") ^ i7;
                        i10 = iM31610 ^ 894594695;
                        i9 = ((iM31610 ^ i8) * (-31153)) ^ (-646278882);
                        sb = null;
                    }
                    break;
                case -1524707280:
                case -906691968:
                    s = sArr3[c];
                    s2 = 23606;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("᩺ۙ") ^ i8;
                        i = ((iM3169 ^ i7) * (-26535)) ^ (-662121314);
                        i2 = -1010466898;
                    } else {
                        iM3169 = (C0773.m3169("۬۠") ^ i7) * 119;
                        i = ((iM3169 ^ i8) * 31113) ^ 1161558659;
                        i2 = 1429687707;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1448260044:
                case -20049701:
                    RunnableC1848.m6360();
                    if (C3033.m9845() <= 0) {
                        int iM31611 = C0773.m3169("ۢۢ") ^ i7;
                        i10 = iM31611 ^ 894594695;
                        i9 = ((iM31611 ^ i8) * (-31153)) ^ (-646278882);
                        sb = null;
                    } else {
                        iM3169 = C0773.m3169("ܰᩳ") ^ i8;
                        i = ((iM3169 ^ i7) * (-12561)) ^ 1992236956;
                        i2 = -1092808998;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1420877582:
                case 630505500:
                    strM5399 = C1519.m5399(sArr4, i11, 7, i3);
                    if (C11235.m28309() == 0) {
                        iM3169 = (i7 - C0619.m2761("ۗ֨")) * 77;
                        i = ((iM3169 ^ i8) * (-6515)) ^ (-942228682);
                        i2 = 2004636182;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } else {
                        int iM31612 = C0773.m3169("ۢۢ") ^ i7;
                        i10 = iM31612 ^ 894594695;
                        i9 = ((iM31612 ^ i8) * (-31153)) ^ (-646278882);
                        sb = null;
                    }
                    break;
                case -1401574170:
                case 177120909:
                    sb.append(j);
                    sArr = f3861;
                    i4 = 19;
                    i5 = 10;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ܺۚ") ^ i8;
                        i = ((iM3169 ^ i7) * 6431) ^ 116033578;
                        i2 = -844504812;
                    } else {
                        iM3169 = C0619.m2761("ۢ֫") ^ i8;
                        i = ((iM3169 ^ i7) * (-30427)) ^ 1129168163;
                        i2 = 1936990195;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -885751234:
                case -458651556:
                    i3 = 45303;
                    iM3169 = (C0619.m2761("᩵۟") + i8) * (-63);
                    i = ((iM3169 ^ i7) * 11233) ^ 2865816;
                    i2 = 220846104;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -875830788:
                case 1457890516:
                    i3 = 5171;
                    iM3169 = (C0619.m2761("᩵۟") + i8) * (-63);
                    i = ((iM3169 ^ i7) * 11233) ^ 2865816;
                    i2 = 220846104;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -58960173:
                case 2061328711:
                    if (i14 - (i15 + i16) <= 0) {
                        iM3169 = (C0619.m2761("᩹ܰ") + i7) * 89;
                        i = ((iM3169 ^ i8) * (-8277)) ^ 1458035262;
                        i2 = 1622283607;
                    } else {
                        iM3169 = C0773.m3169("᩵ۛ") ^ i7;
                        i = ((iM3169 ^ i8) * 8577) ^ (-1271818339);
                        i2 = -2102846762;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case 265569983:
                case 1700331753:
                    sArr2 = f3861;
                    i12 = 36;
                    i13 = 1;
                    if (C13473.f42873 == 0) {
                        iM3169 = C0773.m3169("ۜۛ") ^ i8;
                        i = ((iM3169 ^ i7) * 691) ^ (-1933184610);
                        i2 = 934875967;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } else {
                        int iM31613 = C0773.m3169("ۢۢ") ^ i7;
                        i10 = iM31613 ^ 894594695;
                        i9 = ((iM31613 ^ i8) * (-31153)) ^ (-646278882);
                        sb = null;
                    }
                    break;
                case 341504648:
                case 2083746539:
                    C2375.m8065();
                    C0619.m2763();
                    iM3169 = C0773.m3169("ܰᩳ") ^ i8;
                    i = ((iM3169 ^ i7) * (-12561)) ^ 1992236956;
                    i2 = -1092808998;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case 419385439:
                case 681428965:
                    return C12669.m31438(sb, strM5399, this.f3862, C1343.m4939(sArr2, i12, i13, i3));
                case 541779532:
                case 1375523057:
                    short[] sArr5 = f3861;
                    if (RunnableC3055.m9933() == 0) {
                        sb = new StringBuilder(C2834.m9343(sArr5, 1, 18, i3));
                        j = this.f3863;
                        if (C2878.f9462) {
                            iM3169 = C0773.m3169("ܰᩳ") ^ i8;
                            i = ((iM3169 ^ i7) * (-12561)) ^ 1992236956;
                            i2 = -1092808998;
                        } else {
                            iM3169 = (C0619.m2761("᩸᩵") + i7) * 97;
                            i = ((iM3169 ^ i8) * (-11435)) ^ (-407143515);
                            i2 = 1665077871;
                        }
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } else {
                        int iM31614 = C0773.m3169("ۢۢ") ^ i7;
                        i10 = iM31614 ^ 894594695;
                        i9 = ((iM31614 ^ i8) * (-31153)) ^ (-646278882);
                        sb = null;
                    }
                    break;
                case 1179037968:
                case 1381374623:
                    RunnableC3646.m11798(sb, this.f3864);
                    sArr4 = f3861;
                    i11 = 29;
                    if (C23916.m53419() == 0) {
                        iM3169 = (i7 - C0619.m2761("ܺۙ")) * (-91);
                        i = ((iM3169 ^ i8) * 11417) ^ 898476640;
                        i2 = 1105060179;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } else {
                        int iM31615 = C0773.m3169("ۢۢ") ^ i7;
                        i10 = iM31615 ^ 894594695;
                        i9 = ((iM31615 ^ i8) * (-31153)) ^ (-646278882);
                        sb = null;
                    }
                    break;
                case 1546804453:
                case 2060050596:
                    C1783.m6234(sb, C1343.m4939(sArr, i4, i5, i3));
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("᩺ۙ") ^ i8;
                        i = ((iM3169 ^ i7) * (-26535)) ^ (-662121314);
                        i2 = -1010466898;
                    } else {
                        iM3169 = C0773.m3169("ۤۘ") ^ i8;
                        i = ((iM3169 ^ i7) * 22213) ^ (-154661076);
                        i2 = 1761670523;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                default:
                    i14 = s * s2;
                    i15 = s * s;
                    i16 = 139310809;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("᩶ۜ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i8) * 10063) ^ 236742588;
                        i2 = -458947463;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩹") ^ i8;
                        i = ((iM3169 ^ i7) * (-16357)) ^ 1591488523;
                        i2 = -751165390;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    public final boolean equals(Object obj) {
        C1079 c1079 = null;
        long j = 0;
        int i = -735957253;
        int i2 = C1783.f6087;
        int i3 = C3448.f11240;
        int iM2761 = C0619.m2761("᩸ۢ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 20911) ^ (-128261916);
        int i5 = -682125703;
        while (true) {
            i = ((((i ^ i2) * 19037) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1791238198:
                case -543793731:
                    if (j != c1079.f3863) {
                        iM2761 = C0619.m2761("ܰۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21989) ^ 1869587579;
                        i5 = 1884956345;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۖᩳ")) * 47;
                        i4 = ((iM2761 ^ i3) * (-12259)) ^ (-1886094612);
                        i5 = -1221735263;
                    }
                    break;
                case -1743552594:
                case 474723728:
                    return false;
                case -1727920680:
                case 444550537:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ۖ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14673)) ^ 1357638167;
                        i5 = -1479885910;
                    } else {
                        iM2761 = C0773.m3169("ۚۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32415) ^ 1075280082;
                        i5 = 1331329346;
                    }
                    break;
                case -1421059944:
                case 420095873:
                    if (C1321.m4852()) {
                        iM2761 = (C0773.m3169("ܳۗ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * (-20561)) ^ (-963121282);
                        i5 = 631866319;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14673)) ^ 1357638167;
                        i5 = -1479885910;
                    }
                    break;
                case -1360006565:
                case 1455237243:
                    if (C0619.m2763()) {
                        iM2761 = C0773.m3169("ۚۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32415) ^ 1075280082;
                        i5 = 1331329346;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۘ۠")) * 63;
                        i4 = ((iM2761 ^ i2) * (-16425)) ^ (-1266397227);
                        i5 = 820355683;
                    }
                    break;
                case -1148843519:
                case 1276623456:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5427) ^ 279880417;
                        i5 = -199726926;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩹᩸")) * (-71);
                        i4 = ((iM2761 ^ i3) * (-27411)) ^ 689678066;
                        i5 = -1275603998;
                    }
                    break;
                case -1104200986:
                case 1717759025:
                    if (C1564.f5401 > 0) {
                        iM2761 = (C0619.m2761("ۚۛ") ^ i3) * 109;
                        i4 = ((iM2761 ^ i2) * 7915) ^ 1429586187;
                        i5 = -1188295780;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14673)) ^ 1357638167;
                        i5 = -1479885910;
                    }
                    break;
                case -1077324474:
                case 612088587:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5427) ^ 279880417;
                        i5 = -199726926;
                    } else {
                        iM2761 = (C0773.m3169("᩷ܺ") ^ i3) * 5;
                        i4 = ((iM2761 ^ i2) * (-7723)) ^ (-1432830812);
                        i5 = -662009954;
                    }
                    break;
                case -1061629094:
                case 1230422274:
                    if (obj instanceof C1079) {
                        iM2761 = (i3 - C0619.m2761("᩵ᩳ")) * (-31);
                        i4 = ((iM2761 ^ i2) * (-4045)) ^ 37049782;
                        i5 = 587428362;
                    } else {
                        iM2761 = C0619.m2761("ܰۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21989) ^ 1869587579;
                        i5 = 1884956345;
                    }
                    break;
                case -887403532:
                case -760004083:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۖ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14673)) ^ 1357638167;
                        i5 = -1479885910;
                    } else {
                        iM2761 = C0619.m2761("ܺۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14607)) ^ 26589407;
                        i5 = 1850684447;
                    }
                    break;
                case -385727425:
                case 692255889:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("ۖ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14673)) ^ 1357638167;
                        i5 = -1479885910;
                    } else {
                        iM2761 = (C0619.m2761("۫֨") ^ i2) * 93;
                        i4 = ((iM2761 ^ i3) * 26053) ^ (-1395996828);
                        i5 = 664097874;
                    }
                    break;
                case -296850790:
                case 687661018:
                    return true;
                case -235276541:
                case 1584215751:
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = C0773.m3169("ܺ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8501)) ^ (-1156462854);
                        i5 = 1347142286;
                    } else {
                        iM2761 = C0773.m3169("ۚۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32415) ^ 1075280082;
                        i5 = 1331329346;
                    }
                    break;
                case -110968073:
                case 1058869685:
                    if (this == obj) {
                        iM2761 = C0619.m2761("ۘۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13655)) ^ 636667335;
                        i5 = 101125315;
                    } else {
                        iM2761 = (C0773.m3169("᩵֫") ^ i2) * (-15);
                        i4 = ((iM2761 ^ i3) * (-11409)) ^ (-52262846);
                        i5 = -275476702;
                    }
                    break;
                case -58990846:
                case 263574574:
                    c1079 = (C1079) obj;
                    j = this.f3863;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۚۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32415) ^ 1075280082;
                        i5 = 1331329346;
                    } else {
                        iM2761 = (C0619.m2761("ۢ۠") ^ i3) * 85;
                        i4 = ((iM2761 ^ i2) * 12431) ^ (-128574212);
                        i5 = -916498873;
                    }
                    break;
                case 91147146:
                case 1035970826:
                    AbstractC0641.m2813();
                    C2375.m8065();
                    return false;
                case 677281206:
                case 952654423:
                    if (C2419.m8175(this.f3864, c1079.f3864)) {
                        iM2761 = (i2 - C0619.m2761("ۤ֫")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-3477)) ^ 1600962082;
                        i5 = -1089558316;
                    } else {
                        iM2761 = C0619.m2761("ܰۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21989) ^ 1869587579;
                        i5 = 1884956345;
                    }
                    break;
                case 712635183:
                case 916147941:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0619.m2761("ۚۛ") ^ i3) * 109;
                        i4 = ((iM2761 ^ i2) * 7915) ^ 1429586187;
                        i5 = -1188295780;
                    } else {
                        iM2761 = (C0619.m2761("ܶ֨") ^ i3) * (-119);
                        i4 = ((iM2761 ^ i2) * 24947) ^ (-2005862714);
                        i5 = 1391357469;
                    }
                    break;
                case 730792167:
                case 1113836162:
                    if (!C3492.m11490(this.f3862, c1079.f3862)) {
                        iM2761 = C0619.m2761("ܰۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21989) ^ 1869587579;
                        i5 = 1884956345;
                    } else {
                        iM2761 = C0619.m2761("ۘۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13655)) ^ 636667335;
                        i5 = 101125315;
                    }
                    break;
                case 1011248329:
                case 1460220457:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ܺ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8501)) ^ (-1156462854);
                        i5 = 1347142286;
                    } else {
                        iM2761 = C0619.m2761("ܿܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16067)) ^ 536193463;
                        i5 = -1537285864;
                    }
                    break;
                case 1375609991:
                case 1731428344:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۚۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32415) ^ 1075280082;
                        i5 = 1331329346;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩹֨")) * (-29);
                        i4 = ((iM2761 ^ i3) * (-5973)) ^ 2094517169;
                        i5 = 914516046;
                    }
                    break;
                default:
                    C3448.m11248();
                    iM2761 = C0773.m3169("ۚۘ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 32415) ^ 1075280082;
                    i5 = 1331329346;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x055d A[PHI: r17 r18 r19 r25
      0x055d: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:127:0x055b, B:121:0x0509, B:20:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x055d: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:127:0x055b, B:121:0x0509, B:20:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x055d: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:127:0x055b, B:121:0x0509, B:20:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x055d: PHI (r25v46 short[]) = (r25v2 short[]), (r25v3 short[]), (r25v47 short[]) binds: [B:127:0x055b, B:121:0x0509, B:20:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4 A[PHI: r14
      0x00f4: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v2 java.lang.String) binds: [B:34:0x00f2, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0184 A[PHI: r13
      0x0184: PHI (r13v5 java.lang.String) = (r13v4 java.lang.String), (r13v2 java.lang.String), (r13v2 java.lang.String) binds: [B:46:0x0182, B:13:0x0096, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0239  */
    /* JADX WARN: Code duplicated, block: B:94:0x037c A[PHI: r2 r7 r10 r21 r26
      0x037c: PHI (r2v34 short[]) = (r2v2 short[]), (r2v9 short[]), (r2v2 short[]), (r2v2 short[]), (r2v36 short[]) binds: [B:80:0x0300, B:76:0x02de, B:19:0x00a6, B:16:0x009d, B:93:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x037c: PHI (r7v4 l.ۢۡ᩻) = (r7v3 l.ۢۡ᩻), (r7v2 l.ۢۡ᩻), (r7v2 l.ۢۡ᩻), (r7v2 l.ۢۡ᩻), (r7v2 l.ۢۡ᩻) binds: [B:80:0x0300, B:76:0x02de, B:19:0x00a6, B:16:0x009d, B:93:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x037c: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:80:0x0300, B:76:0x02de, B:19:0x00a6, B:16:0x009d, B:93:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x037c: PHI (r21v3 java.lang.String) = 
      (r21v2 java.lang.String)
      (r21v2 java.lang.String)
      (r21v2 java.lang.String)
      (r21v2 java.lang.String)
      (r21v4 java.lang.String)
     binds: [B:80:0x0300, B:76:0x02de, B:19:0x00a6, B:16:0x009d, B:93:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x037c: PHI (r26v5 int) = (r26v4 int), (r26v3 int), (r26v3 int), (r26v3 int), (r26v3 int) binds: [B:80:0x0300, B:76:0x02de, B:19:0x00a6, B:16:0x009d, B:93:0x037a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        if (l.C1343.f4799 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (l.C3998.f13671 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (l.C17202.f56030 == false) goto L20;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m4042() {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1079.m4042():java.lang.String");
    }
}
