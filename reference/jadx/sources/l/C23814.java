package l;

import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes.dex */
public final class C23814 {

    /* JADX INFO: renamed from: ܰ۠᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f77136 = {6123, 31661, 31628, 31639, 31663, 31628, 31620, 31626, 31629, 31661, 31628, 31639, 31669, 31626, 31635, 31663, 31626, 31621, 31622, 31639, 31626, 31630, 31622, 31669, 31626, 31635, 31660, 31633, 31623, 31626, 31629, 31618, 31633, 31642, 31669, 31626, 31635, 7775, 27123, 27039, 27008, 27029, 27038, 27023, 27014, 27033, 27008, 27039, 27008, 27029, 27038, 27023, 27013, 27010, 27036, 27027, 27039, 27008, 27017, 27023, 27012, 27029, 27016, 27012, -7890, -5272, 14861, 12411, 14791, 369};

    /* JADX WARN: Code duplicated, block: B:66:0x0222 A[PHI: r6 r7 r8
      0x0222: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:65:0x0220, B:61:0x0202, B:17:0x007f, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r7v3 short) = (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:65:0x0220, B:61:0x0202, B:17:0x007f, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:65:0x0220, B:61:0x0202, B:17:0x007f, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x028b A[PHI: r10 r11 r17
      0x028b: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:73:0x0289, B:45:0x0142, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:73:0x0289, B:45:0x0142, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:73:0x0289, B:45:0x0142, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02c0 A[PHI: r1 r2 r3
      0x02c0: PHI (r1v4 short[]) = (r1v2 short[]), (r1v3 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:77:0x02be, B:23:0x0099, B:12:0x0072, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r2v3 short) = (r2v2 short), (r2v1 short), (r2v1 short), (r2v1 short) binds: [B:77:0x02be, B:23:0x0099, B:12:0x0072, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:77:0x02be, B:23:0x0099, B:12:0x0072, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02f4 A[PHI: r12 r13 r14 r15 r16 r22
      0x02f4: PHI (r12v3 short[]) = (r12v1 short[]), (r12v2 short[]), (r12v1 short[]), (r12v1 short[]), (r12v1 short[]) binds: [B:81:0x02f2, B:35:0x00ea, B:29:0x00c4, B:15:0x007b, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int), (r13v1 int) binds: [B:81:0x02f2, B:35:0x00ea, B:29:0x00c4, B:15:0x007b, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r14v3 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:81:0x02f2, B:35:0x00ea, B:29:0x00c4, B:15:0x007b, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:81:0x02f2, B:35:0x00ea, B:29:0x00c4, B:15:0x007b, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r16v4 char) = (r16v3 char), (r16v2 char), (r16v2 char), (r16v2 char), (r16v2 char) binds: [B:81:0x02f2, B:35:0x00ea, B:29:0x00c4, B:15:0x007b, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r22v3 short[]) = (r22v2 short[]), (r22v1 short[]), (r22v1 short[]), (r22v1 short[]), (r22v1 short[]) binds: [B:81:0x02f2, B:35:0x00ea, B:29:0x00c4, B:15:0x007b, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m53140() {
        int iM2761;
        int i;
        int i2;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        short[] sArr3 = null;
        int i9 = 0;
        int i10 = 445132342;
        int i11 = C4238.f15451;
        int i12 = C1146.f4234;
        int iM3169 = C0773.m3169("ۜۡ") ^ i11;
        int i13 = ((iM3169 ^ i12) * (-5893)) ^ (-844000710);
        int i14 = iM3169 ^ 117875440;
        short[] sArr4 = null;
        int i15 = 0;
        char c = 0;
        short s3 = 0;
        short[] sArr5 = null;
        int i16 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 11905) >> 31));
            switch (i10) {
                case -2134242061:
                case -413119016:
                    i4 = i16 + i3;
                    s2 = 1;
                    if (C17202.f56030) {
                        iM2761 = (i11 - C0619.m2761("ۢ֡")) * 101;
                        i = ((iM2761 ^ i12) * (-11539)) ^ 1364572109;
                        i2 = -1540373373;
                    } else {
                        iM2761 = (C0773.m3169("֨۟") ^ i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i12) * (-20761)) ^ 1939402839;
                        i2 = -613912145;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -2055178353:
                case -481663152:
                    return C2419.m8166(sArr2, i8, 6, i6);
                case -2018987903:
                case -760035230:
                    C1343.m4943();
                    C1783.m6232();
                    return null;
                case -1687320211:
                case -407499374:
                    i16 = s * s3;
                    i3 = 1;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("᩵ܺ") ^ i11;
                        i = ((iM2761 ^ i12) * (-1899)) ^ 1169894792;
                        i2 = 1836155024;
                    } else {
                        iM2761 = C0773.m3169("᩷ܶ") ^ i12;
                        i = ((iM2761 ^ i11) * (-24965)) ^ (-820054185);
                        i2 = 1461332037;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1577635330:
                case 632246589:
                    return C2834.m9343(sArr, i7, 8, i6);
                case -1432704508:
                case -994252794:
                    sArr2 = f77136;
                    i8 = 9;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ᩳ۫") ^ i12;
                        i = ((iM2761 ^ i11) * 24543) ^ (-1017826443);
                        i2 = 2027465918;
                    } else {
                        iM2761 = C0773.m3169("ۘᩴ") ^ i12;
                        i = ((iM2761 ^ i11) * (-7363)) ^ 1608522052;
                        i2 = 905561873;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1313782692:
                case 928912636:
                    sArr5 = f77136;
                    c = 0;
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0619.m2761("ᩳ۫") ^ i12;
                        i = ((iM2761 ^ i11) * 24543) ^ (-1017826443);
                        i2 = 2027465918;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩻") + i12) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i11) * (-281)) ^ (-1574249173);
                        i2 = -1514010944;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1311015407:
                case 633630860:
                    i5 = s + s2;
                    if (C0862.m3503()) {
                        iM2761 = C0773.m3169("ۢۖ") ^ i12;
                        i = ((iM2761 ^ i11) * 8611) ^ (-785669313);
                        i2 = 1811780295;
                    } else {
                        iM2761 = (C0773.m3169("֨۟") ^ i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i12) * (-20761)) ^ 1939402839;
                        i2 = -613912145;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1050570418:
                case 840718841:
                    sArr4 = f77136;
                    i15 = 26;
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ܰᩳ") ^ i11;
                        i = ((iM2761 ^ i12) * 11813) ^ 64915976;
                        i2 = -741812265;
                    } else {
                        iM2761 = (C0773.m3169("ۜۛ") + i12) * 37;
                        i = ((iM2761 ^ i11) * (-22867)) ^ 350091750;
                        i2 = 2123556983;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -928855964:
                case 716537020:
                    C0862.m3503();
                    iM2761 = (C0773.m3169("֨۟") ^ i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM2761 ^ i12) * (-20761)) ^ 1939402839;
                    i2 = -613912145;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -612101903:
                case -152494989:
                    if ((i5 * i5) - i4 >= 0) {
                        iM2761 = C0619.m2761("֡ۖ") ^ i11;
                        i = ((iM2761 ^ i12) * 67) ^ (-124547460);
                        i2 = -807957655;
                    } else {
                        iM2761 = C0773.m3169("֡ۡ") ^ i12;
                        i = ((iM2761 ^ i11) * (-28845)) ^ 771994350;
                        i2 = -1898362553;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -607811876:
                case 348085810:
                    C3099.m10095();
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0619.m2761("ܰᩳ") ^ i11;
                        i = ((iM2761 ^ i12) * 11813) ^ 64915976;
                        i2 = -741812265;
                    } else {
                        iM2761 = C0619.m2761("֨ۜ") ^ i12;
                        i = ((iM2761 ^ i11) * (-31171)) ^ 855627020;
                        i2 = -2014177228;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -501046002:
                case 1641961431:
                    s = sArr5[c];
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("ܳܳ") ^ i11;
                        i = ((iM2761 ^ i12) * (-9547)) ^ (-59682304);
                        i2 = 1303056426;
                    } else {
                        iM2761 = C0619.m2761("ܰᩳ") ^ i11;
                        i = ((iM2761 ^ i12) * 11813) ^ 64915976;
                        i2 = -741812265;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -346208700:
                case 562419469:
                    return C13473.m33137(sArr3, i9, 11, i6);
                case -186997900:
                case 1522546951:
                    sArr3 = f77136;
                    i9 = 15;
                    if (C3448.m11248() != 0) {
                        iM2761 = C0619.m2761("ᩳ۫") ^ i12;
                        i = ((iM2761 ^ i11) * 24543) ^ (-1017826443);
                        i2 = 2027465918;
                    } else {
                        iM2761 = C0619.m2761("ܺܺ") ^ i12;
                        i = ((iM2761 ^ i11) * 5107) ^ 50541528;
                        i2 = -1845727665;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -119844966:
                case 1050714661:
                    i6 = 51761;
                    iM2761 = C0773.m3169("ۘ᩵") ^ i12;
                    i = ((iM2761 ^ i11) * 4745) ^ 1937562374;
                    i2 = 1970491778;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -81999005:
                case 794199396:
                    s3 = 2;
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("֨ۜ") ^ i12;
                        i = ((iM2761 ^ i11) * (-31171)) ^ 855627020;
                        i2 = -2014177228;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۘ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i12) * (-13205)) ^ 2058289381;
                        i2 = -1181433506;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -13064238:
                case 256143016:
                    return RunnableC0334.m2049(sArr4, i15, 11, i6);
                case 134006975:
                case 1209681430:
                    if (C18978.m44085()) {
                        iM2761 = C0619.m2761("ܳۙ") ^ i11;
                        i = ((iM2761 ^ i12) * 23685) ^ 1866319378;
                        i2 = 1114470491;
                    } else {
                        iM2761 = C0619.m2761("ۙᩴ") ^ i11;
                        i = ((iM2761 ^ i12) * (-17043)) ^ 630742759;
                        i2 = 2010530524;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 147597165:
                case 931917826:
                    if (C0950.m3785() == 0) {
                        iM2761 = C0619.m2761("ᩳ۫") ^ i12;
                        i = ((iM2761 ^ i11) * 24543) ^ (-1017826443);
                        i2 = 2027465918;
                    } else {
                        iM2761 = C0619.m2761("ܰᩳ") ^ i11;
                        i = ((iM2761 ^ i12) * 11813) ^ 64915976;
                        i2 = -741812265;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 627025642:
                case 1139093286:
                    sArr = f77136;
                    i7 = 1;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("֨ۜ") ^ i12;
                        i = ((iM2761 ^ i11) * (-31171)) ^ 855627020;
                        i2 = -2014177228;
                    } else {
                        iM2761 = (i11 - C0619.m2761("۫ۚ")) * 109;
                        i = ((iM2761 ^ i12) * (-18305)) ^ 381597427;
                        i2 = -301359377;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 962602696:
                case 2129806422:
                    if (C3077.m10037()) {
                        iM2761 = (i12 - C0773.m3169("۠ۜ")) * (-127);
                        i = ((iM2761 ^ i11) * 30741) ^ 1550711666;
                        i2 = 1009596688;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩺") ^ i11;
                        i = ((iM2761 ^ i12) * (-29669)) ^ 1311828324;
                        i2 = 472742036;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 1238478739:
                case 2036335381:
                    i6 = 31715;
                    iM2761 = C0773.m3169("ۘ᩵") ^ i12;
                    i = ((iM2761 ^ i11) * 4745) ^ 1937562374;
                    i2 = 1970491778;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 1702826941:
                case 2100992189:
                    RunnableC0334.m2063();
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0773.m3169("֨۟") ^ i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i12) * (-20761)) ^ 1939402839;
                        i2 = -613912145;
                    } else {
                        iM2761 = C0619.m2761("ᩳ۫") ^ i12;
                        i = ((iM2761 ^ i11) * 24543) ^ (-1017826443);
                        i2 = 2027465918;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                default:
                    if (C2702.m8873()) {
                        iM2761 = (i11 - C0619.m2761("ܽۚ")) * (-97);
                        i = ((iM2761 ^ i12) * 26711) ^ 2009561444;
                        i2 = -41330852;
                    } else {
                        iM2761 = C0619.m2761("ۤܰ") ^ i12;
                        i = ((iM2761 ^ i11) * (-22139)) ^ 545831887;
                        i2 = -207835672;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0516 A[PHI: r3 r8 r21 r22 r24
      0x0516: PHI (r3v30 short[]) = (r3v15 short[]), (r3v16 short[]), (r3v23 short[]), (r3v31 short[]) binds: [B:108:0x04ff, B:102:0x04d7, B:78:0x031f, B:65:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r8v86 short[]) = (r8v59 short[]), (r8v60 short[]), (r8v68 short[]), (r8v87 short[]) binds: [B:108:0x04ff, B:102:0x04d7, B:78:0x031f, B:65:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r21v48 l.ܶ᩷ۧ) = (r21v15 l.ܶ᩷ۧ), (r21v16 l.ܶ᩷ۧ), (r21v31 l.ܶ᩷ۧ), (r21v49 l.ܶ᩷ۧ) binds: [B:108:0x04ff, B:102:0x04d7, B:78:0x031f, B:65:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r22v57 java.lang.String) = (r22v38 java.lang.String), (r22v39 java.lang.String), (r22v48 java.lang.String), (r22v58 java.lang.String) binds: [B:108:0x04ff, B:102:0x04d7, B:78:0x031f, B:65:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r24v26 int) = (r24v10 int), (r24v11 int), (r24v18 int), (r24v27 int) binds: [B:108:0x04ff, B:102:0x04d7, B:78:0x031f, B:65:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0161 A[PHI: r14
      0x0161: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v2 java.lang.String), (r14v6 java.lang.String) binds: [B:176:0x0161, B:9:0x0080, B:6:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01ad A[PHI: r12
      0x01ad: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v2 java.lang.String) binds: [B:45:0x01ab, B:9:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x022e A[PHI: r11
      0x022e: PHI (r11v4 java.lang.String) = (r11v2 java.lang.String), (r11v3 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String) binds: [B:178:0x022e, B:54:0x022c, B:27:0x00cf, B:15:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceOnClickListenerC16354 m53141(Main main, String str, int i, int i2) {
        int iM2761;
        int i3;
        int i4;
        short[] sArr;
        DialogInterfaceOnClickListenerC16354 dialogInterfaceOnClickListenerC16354;
        short[] sArr2;
        int iM2762;
        int i5;
        int iM3169;
        int i6;
        int iM31610;
        int i7;
        short[] sArr3;
        String str2;
        int iM31611;
        int i8;
        int i9;
        int iM31612;
        int i10;
        main = main;
        int i11 = 1957155640;
        int i12 = C2354.f7599;
        int i13 = C2375.f7641;
        int iM31613 = (i12 - C0773.m3169("ۡ۠")) * (-49);
        int i14 = ((iM31613 ^ i13) * 16873) ^ (-1171654315);
        int i15 = iM31613 ^ 1005591110;
        String str3 = null;
        String strM2824 = null;
        String str4 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i16 = 0;
        DialogInterfaceOnClickListenerC16354 dialogInterfaceOnClickListenerC16355 = null;
        char c = 0;
        char c2 = 0;
        short s = 0;
        short s2 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        String strM8350 = null;
        String str5 = null;
        String strM2049 = null;
        int i21 = 0;
        int i22 = 0;
        String strM33137 = null;
        int i23 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 17683) >> 31));
            switch (i11) {
                case -2058410570:
                case 178258997:
                    dialogInterfaceOnClickListenerC16355.f53095 = new RunnableC11879(i21, main, str5);
                    dialogInterfaceOnClickListenerC16355.f53098 = true;
                    int iM31614 = C0773.m3169("ۧ֫") ^ i13;
                    i15 = iM31614 ^ (-2144259834);
                    i14 = ((iM31614 ^ i12) * (-12593)) ^ 1834701282;
                    sArr6 = sArr6;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16355;
                    strM8350 = strM8350;
                    break;
                case -1986595432:
                case -1650289617:
                    dialogInterfaceOnClickListenerC16355.f53096 = AbstractC0116.m1244(i23);
                    dialogInterfaceOnClickListenerC16355.f53095 = new RunnableC2185(i21, main);
                    dialogInterfaceOnClickListenerC16355.f53098 = true;
                    int iM31615 = C0773.m3169("ۧ֫") ^ i13;
                    i15 = iM31615 ^ (-2144259834);
                    i14 = ((iM31615 ^ i12) * (-12593)) ^ 1834701282;
                    sArr6 = sArr6;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16355;
                    strM8350 = strM8350;
                    break;
                case -1939209482:
                case -499996271:
                    i16 = i16;
                    strM8350 = strM8350;
                    sArr = sArr6;
                    dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                    sArr2 = sArr5;
                    s = sArr4[37];
                    s2 = 1;
                    if (C20932.m47848() != 0) {
                        iM3169 = C0619.m2761("ۤܿ") ^ i12;
                        i14 = (-218560542) ^ ((iM3169 ^ i13) * 27589);
                        i6 = 71439460;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۨ") + i13) * 79;
                        i14 = (-416731153) ^ ((iM3169 ^ i12) * (-3847));
                        i6 = 757279976;
                    }
                    i15 = iM3169 ^ i6;
                    sArr5 = sArr2;
                    sArr6 = sArr;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                    strM8350 = strM8350;
                    i16 = i16;
                    break;
                case -1857523176:
                case -1129655312:
                    strM2049 = RunnableC0334.m2049(f77136, 67, 3, i16);
                    if (C3779.f12953 > 0) {
                        iM2761 = (C0619.m2761("֡᩶") ^ i13) * (-73);
                        i3 = ((iM2761 ^ i12) * (-10531)) ^ 1573273124;
                        i4 = -619957364;
                        i15 = iM2761 ^ i4;
                        i14 = i3;
                    } else {
                        i16 = i16;
                        strM8350 = strM8350;
                        sArr = sArr6;
                        dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                        sArr2 = sArr5;
                        iM3169 = C0619.m2761("ۤܿ") ^ i12;
                        i14 = (-218560542) ^ ((iM3169 ^ i13) * 27589);
                        i6 = 71439460;
                        i15 = iM3169 ^ i6;
                        sArr5 = sArr2;
                        sArr6 = sArr;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                        strM8350 = strM8350;
                        i16 = i16;
                    }
                    break;
                case -1809661649:
                case -311175241:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("۬۠") + i13) * (-55);
                        i3 = ((iM2761 ^ i12) * (-4925)) ^ (-2002867042);
                        i4 = 1577310036;
                    } else {
                        iM2761 = C0619.m2761("᩸۠") ^ i12;
                        i3 = ((iM2761 ^ i13) * (-16989)) ^ 57855474;
                        i4 = 994485057;
                    }
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                case -1787300393:
                case 1015815824:
                    i16 = i16;
                    strM8350 = strM8350;
                    sArr = sArr6;
                    dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                    sArr2 = sArr5;
                    int i24 = s + s2;
                    i17 = i24 * i24;
                    i18 = s * 2;
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("᩻ܶ") ^ i12) * (-83);
                        i14 = 2004307132 ^ ((iM3169 ^ i13) * (-17853));
                        i6 = -852674879;
                        i15 = iM3169 ^ i6;
                        sArr5 = sArr2;
                        sArr6 = sArr;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                        strM8350 = strM8350;
                        i16 = i16;
                    }
                    sArr6 = sArr;
                    int iM2763 = C0619.m2761("ᩴ۫") ^ i13;
                    i14 = (-564848231) ^ ((iM2763 ^ i12) * 16885);
                    i15 = iM2763 ^ (-1706325601);
                    sArr5 = sArr2;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                    strM8350 = strM8350;
                    i16 = i16;
                    break;
                case -1786039129:
                case -1079446537:
                    String str6 = strM8350;
                    short[] sArr7 = sArr6;
                    DialogInterfaceOnClickListenerC16354 dialogInterfaceOnClickListenerC16356 = dialogInterfaceOnClickListenerC16355;
                    short[] sArr8 = sArr5;
                    int i25 = i19;
                    String strM3780 = C0950.m3780(sArr8, i25, 1, i16);
                    if (C20932.m47857(str, strM3780)) {
                        int iM31616 = (C0773.m3169("᩹ᩴ") + i13) * (-45);
                        i16 = i16;
                        i15 = iM31616 ^ 2067153333;
                        main = main;
                        sArr5 = sArr8;
                        i19 = i25;
                        sArr6 = sArr7;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16356;
                        strM8350 = str6;
                        str3 = strM3780;
                        i14 = ((iM31616 ^ i12) * (-28201)) ^ (-692817134);
                    } else {
                        i16 = i16;
                        int iM31617 = (C0773.m3169("ܽ᩻") ^ i12) * 61;
                        i14 = ((iM31617 ^ i13) * (-7843)) ^ (-1964721503);
                        i15 = iM31617 ^ 2132098226;
                        main = main;
                        sArr5 = sArr8;
                        i19 = i25;
                        sArr6 = sArr7;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16356;
                        strM8350 = str6;
                        str3 = strM3780;
                    }
                    i16 = i16;
                    break;
                case -1681227434:
                case 403490084:
                    dialogInterfaceOnClickListenerC16355.f53096 = str;
                    int iM31618 = C0773.m3169("ۧ֫") ^ i13;
                    i15 = iM31618 ^ (-2144259834);
                    i14 = ((iM31618 ^ i12) * (-12593)) ^ 1834701282;
                    sArr6 = sArr6;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16355;
                    strM8350 = strM8350;
                    break;
                case -1678568560:
                case -1107472063:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i12 - C0773.m3169("᩶ܺ")) * (-39);
                        i3 = ((iM2761 ^ i13) * 9595) ^ 263980057;
                        i4 = -216330410;
                    } else {
                        iM2761 = C0619.m2761("֫ۢ") ^ i12;
                        i3 = ((iM2761 ^ i13) * 23145) ^ (-83005598);
                        i4 = -1363310874;
                    }
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                case -1610966673:
                case 1338627846:
                    str2 = strM8350;
                    c2 = 2;
                    i22 = 3;
                    if (C0487.m2359(strM2824, str2)) {
                        iM31611 = C0773.m3169("ᩳ᩶") ^ i13;
                        i8 = ((iM31611 ^ i12) * (-24141)) ^ 1092718905;
                        i9 = 353458968;
                    } else {
                        iM31611 = C0619.m2761("ܽۧ") ^ i12;
                        i8 = ((iM31611 ^ i13) * (-1625)) ^ 1316411909;
                        i9 = -1144262309;
                    }
                    i15 = iM31611 ^ i9;
                    strM8350 = str2;
                    i14 = i8;
                    main = main;
                    break;
                case -1560374603:
                case 769858382:
                    i16 = 16246;
                    int iM31619 = C0773.m3169("ܶ᩹") ^ i13;
                    i15 = iM31619 ^ (-769369486);
                    i14 = ((iM31619 ^ i12) * 20519) ^ 937554676;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16355;
                    strM8350 = strM8350;
                    main = main;
                    break;
                case -1493552120:
                case -933154214:
                    i16 = i16;
                    strM8350 = strM8350;
                    sArr = sArr6;
                    dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                    sArr2 = sArr5;
                    if (str != null) {
                        iM31610 = C0773.m3169("᩶ۛ") ^ i13;
                        i14 = ((iM31610 ^ i12) * 13945) ^ 1205934962;
                        i7 = 1362847931;
                    } else {
                        iM31610 = (C0619.m2761("֫᩺") ^ i12) * 109;
                        i14 = ((iM31610 ^ i13) * (-6641)) ^ (-1463550681);
                        i7 = -1468036860;
                    }
                    i15 = iM31610 ^ i7;
                    sArr5 = sArr2;
                    sArr6 = sArr;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                    strM8350 = strM8350;
                    i16 = i16;
                    break;
                case -1434837656:
                case -1423601223:
                    C2287.m7745();
                    if (C1146.f4234 < 0) {
                        iM2761 = (C0619.m2761("۬۠") + i13) * (-55);
                        i3 = ((iM2761 ^ i12) * (-4925)) ^ (-2002867042);
                        i4 = 1577310036;
                        i15 = iM2761 ^ i4;
                        i14 = i3;
                    } else {
                        i16 = i16;
                        sArr3 = sArr6;
                        int iM2764 = (C0619.m2761("ᩳ᩺") + i13) * (-95);
                        i15 = iM2764 ^ (-630244001);
                        main = main;
                        i14 = ((iM2764 ^ i12) * 32639) ^ 942283787;
                        sArr6 = sArr3;
                        i16 = i16;
                    }
                    break;
                case -1224049439:
                case 117916422:
                    return dialogInterfaceOnClickListenerC16355;
                case -1171181036:
                case -89685817:
                    i16 = i16;
                    strM8350 = strM8350;
                    sArr3 = sArr6;
                    dialogInterfaceOnClickListenerC16355 = new DialogInterfaceOnClickListenerC16354(i, i2);
                    sArr5 = f77136;
                    i19 = 38;
                    if (C3448.f11240 < 0) {
                        int iM31620 = (C0773.m3169("֨ܰ") ^ i13) * 15;
                        i14 = ((iM31620 ^ i12) * (-24263)) ^ 320269447;
                        i15 = iM31620 ^ 1722613736;
                        main = main;
                        sArr6 = sArr3;
                        strM8350 = strM8350;
                        i16 = i16;
                    } else {
                        strM8350 = strM8350;
                        int iM2765 = (C0619.m2761("ᩳ᩺") + i13) * (-95);
                        i15 = iM2765 ^ (-630244001);
                        main = main;
                        i14 = ((iM2765 ^ i12) * 32639) ^ 942283787;
                        sArr6 = sArr3;
                        i16 = i16;
                    }
                    break;
                case -883459892:
                case 1224587433:
                    iM2762 = C0619.m2761(strM33137);
                    i5 = 2097177921;
                    i23 = iM2762 ^ i5;
                    iM2761 = (C0773.m3169("ܳ۠") ^ i13) * 15;
                    i3 = ((iM2761 ^ i12) * 32249) ^ (-1620935733);
                    i4 = 1152000227;
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                case -783494825:
                case -742547962:
                    return null;
                case -487025362:
                case 1462981072:
                    i16 = i16;
                    strM8350 = strM8350;
                    sArr = sArr6;
                    dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                    sArr2 = sArr5;
                    if ((i18 + 1) - i17 <= 0) {
                        iM3169 = (i13 - C0619.m2761("ܺ᩸")) * 5;
                        i14 = 139862867 ^ ((iM3169 ^ i12) * 24179);
                        i6 = 1426829012;
                    } else {
                        iM3169 = (C0619.m2761("᩶ۚ") ^ i12) * (-9);
                        i14 = (-1674754010) ^ ((iM3169 ^ i13) * (-28183));
                        i6 = -1050661662;
                    }
                    i15 = iM3169 ^ i6;
                    sArr5 = sArr2;
                    sArr6 = sArr;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                    strM8350 = strM8350;
                    i16 = i16;
                    break;
                case -436445409:
                case -210542309:
                    int i26 = C1101.f3914;
                    if (C3077.m10037()) {
                        iM2761 = (i12 - C0619.m2761("ۨۧ")) * (-39);
                        i3 = ((iM2761 ^ i13) * (-26727)) ^ 2024333048;
                        i4 = -1121262055;
                    } else {
                        iM2761 = (C0773.m3169("ۢ֨") ^ i12) * 95;
                        i3 = ((iM2761 ^ i13) * (-18711)) ^ 553425777;
                        i4 = -934757614;
                    }
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                case -292149487:
                case 539800382:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ۡܶ") ^ i12;
                        i3 = ((iM2761 ^ i13) * (-7043)) ^ 2123601662;
                        i4 = 1641706434;
                    } else {
                        iM2761 = (i12 - C0773.m3169("᩶ܺ")) * (-39);
                        i3 = ((iM2761 ^ i13) * 9595) ^ 263980057;
                        i4 = -216330410;
                    }
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                case -285218854:
                case 1714968345:
                    i16 = i16;
                    strM8350 = strM8350;
                    sArr = sArr6;
                    dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                    sArr2 = sArr5;
                    sArr4 = f77136;
                    if (C17202.f56030) {
                        iM3169 = (i12 - C0773.m3169("ۤܳ")) * 65;
                        i14 = (-1487335825) ^ ((iM3169 ^ i13) * (-1233));
                        i6 = 1243149456;
                        i15 = iM3169 ^ i6;
                        sArr5 = sArr2;
                        sArr6 = sArr;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                        strM8350 = strM8350;
                        i16 = i16;
                    }
                    sArr6 = sArr;
                    int iM2766 = C0619.m2761("ᩴ۫") ^ i13;
                    i14 = (-564848231) ^ ((iM2766 ^ i12) * 16885);
                    i15 = iM2766 ^ (-1706325601);
                    sArr5 = sArr2;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                    strM8350 = strM8350;
                    i16 = i16;
                    break;
                case -239426009:
                case 1855048181:
                    C23916.m53419();
                    return null;
                case -221801606:
                case 2119556788:
                    RunnableC1848.m6360();
                    C1564.m5509();
                    iM2761 = C0773.m3169("ۡܶ") ^ i12;
                    i3 = ((iM2761 ^ i13) * (-7043)) ^ 2123601662;
                    i4 = 1641706434;
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                case -185631013:
                case 1437327738:
                    str2 = strM8350;
                    if (dialogInterfaceOnClickListenerC16355.f53096 != null) {
                        iM31611 = (C0773.m3169("᩸ۧ") ^ i12) * (-75);
                        i8 = ((iM31611 ^ i13) * (-9193)) ^ (-263072103);
                        i9 = 100299690;
                        i15 = iM31611 ^ i9;
                        strM8350 = str2;
                        i14 = i8;
                        main = main;
                    } else {
                        strM8350 = str2;
                        i16 = i16;
                        dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                        sArr2 = sArr5;
                        sArr = sArr6;
                        iM31610 = (C0619.m2761("֫᩺") ^ i12) * 109;
                        i14 = ((iM31610 ^ i13) * (-6641)) ^ (-1463550681);
                        i7 = -1468036860;
                        i15 = iM31610 ^ i7;
                        sArr5 = sArr2;
                        sArr6 = sArr;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                        strM8350 = strM8350;
                        i16 = i16;
                    }
                    break;
                case 189479386:
                case 1110750872:
                    if (!C18978.m44085()) {
                        iM31612 = (C0619.m2761("᩺ᩴ") + i13) * 47;
                        i14 = ((iM31612 ^ i12) * (-29921)) ^ 2059905623;
                        i10 = -1870359870;
                        i15 = iM31612 ^ i10;
                        main = main;
                    } else {
                        i16 = i16;
                        strM8350 = strM8350;
                        sArr = sArr6;
                        dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                        sArr2 = sArr5;
                        iM31610 = (C0619.m2761("֫᩺") ^ i12) * 109;
                        i14 = ((iM31610 ^ i13) * (-6641)) ^ (-1463550681);
                        i7 = -1468036860;
                        i15 = iM31610 ^ i7;
                        sArr5 = sArr2;
                        sArr6 = sArr;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                        strM8350 = strM8350;
                        i16 = i16;
                    }
                    break;
                case 259833673:
                case 654654447:
                    strM8350 = strM8350;
                    c = 1;
                    strM2824 = AbstractC0641.m2824(str, 1);
                    sArr6 = f77136;
                    i20 = 39;
                    if (C1519.f5300 < 0) {
                        int iM31621 = (i12 - C0773.m3169("ۤܰ")) * 67;
                        i15 = iM31621 ^ (-179143028);
                        i14 = ((iM31621 ^ i13) * (-31197)) ^ (-1684126162);
                        strM8350 = strM8350;
                    } else {
                        dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                        sArr2 = sArr5;
                        int iM2767 = C0619.m2761("ᩴ۫") ^ i13;
                        i14 = (-564848231) ^ ((iM2767 ^ i12) * 16885);
                        i15 = iM2767 ^ (-1706325601);
                        sArr5 = sArr2;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                        strM8350 = strM8350;
                        i16 = i16;
                    }
                    break;
                case 426674935:
                case 1705242027:
                    strM8350 = C2485.m8350(f77136, 47, 8, i16);
                    if (!C2878.f9462) {
                        iM31612 = (C0773.m3169("۫۟") + i12) * (-93);
                        i14 = ((iM31612 ^ i13) * 20719) ^ (-1259738574);
                        i10 = -1023031254;
                        i15 = iM31612 ^ i10;
                        main = main;
                    } else {
                        i16 = i16;
                        sArr3 = sArr6;
                        int iM2768 = (C0619.m2761("ᩳ᩺") + i13) * (-95);
                        i15 = iM2768 ^ (-630244001);
                        main = main;
                        i14 = ((iM2768 ^ i12) * 32639) ^ 942283787;
                        sArr6 = sArr3;
                        i16 = i16;
                    }
                    break;
                case 474009203:
                case 1792694994:
                    String[] strArrSplit = strM2824.split(str3, i22);
                    dialogInterfaceOnClickListenerC16355.f53096 = strArrSplit[c];
                    str4 = strArrSplit[c2];
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0619.m2761("᩸۠") ^ i12;
                        i3 = ((iM2761 ^ i13) * (-16989)) ^ 57855474;
                        i4 = 994485057;
                    } else {
                        iM2761 = (C0619.m2761("ܳۢ") + i13) * 73;
                        i3 = ((iM2761 ^ i12) * (-1545)) ^ 1847872904;
                        i4 = 475444772;
                    }
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                case 492810035:
                case 796062485:
                    i16 = 27088;
                    int iM316110 = C0773.m3169("ܶ᩹") ^ i13;
                    i15 = iM316110 ^ (-769369486);
                    i14 = ((iM316110 ^ i12) * 20519) ^ 937554676;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16355;
                    strM8350 = strM8350;
                    main = main;
                    break;
                case 548741260:
                case 1341081324:
                    dialogInterfaceOnClickListenerC16355.f53095 = new RunnableC25306(i21, str4);
                    dialogInterfaceOnClickListenerC16355.f53098 = true;
                    int iM316111 = C0773.m3169("ۧ֫") ^ i13;
                    i15 = iM316111 ^ (-2144259834);
                    i14 = ((iM316111 ^ i12) * (-12593)) ^ 1834701282;
                    sArr6 = sArr6;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16355;
                    strM8350 = strM8350;
                    break;
                case 635881447:
                case 2094334713:
                    i16 = i16;
                    strM8350 = strM8350;
                    sArr = sArr6;
                    dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                    sArr2 = sArr5;
                    if (C1564.m5512(str)) {
                        iM31610 = (C0619.m2761("֫᩺") ^ i12) * 109;
                        i14 = ((iM31610 ^ i13) * (-6641)) ^ (-1463550681);
                        i7 = -1468036860;
                    } else {
                        iM31610 = (C0773.m3169("ۤۗ") ^ i12) * 97;
                        i14 = ((iM31610 ^ i13) * 1349) ^ 1285943089;
                        i7 = 1310100420;
                    }
                    i15 = iM31610 ^ i7;
                    sArr5 = sArr2;
                    sArr6 = sArr;
                    dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                    strM8350 = strM8350;
                    i16 = i16;
                    break;
                case 694811464:
                case 2006691736:
                    iM2762 = C0619.m2761(strM2049);
                    i5 = 2118695586;
                    i23 = iM2762 ^ i5;
                    iM2761 = (C0773.m3169("ܳ۠") ^ i13) * 15;
                    i3 = ((iM2761 ^ i12) * 32249) ^ (-1620935733);
                    i4 = 1152000227;
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                case 732635009:
                case 1731874513:
                    if (!C0487.m2359(strM2824, C0862.m3500(f77136, 55, 9, i16))) {
                        int iM316112 = C0773.m3169("ۧ֫") ^ i13;
                        i15 = iM316112 ^ (-2144259834);
                        i14 = ((iM316112 ^ i12) * (-12593)) ^ 1834701282;
                        sArr6 = sArr6;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16355;
                        strM8350 = strM8350;
                    } else {
                        iM31612 = (C0619.m2761("ܰۡ") + i12) * (-23);
                        i14 = ((iM31612 ^ i13) * (-4797)) ^ 884356945;
                        i10 = 453660506;
                        i15 = iM31612 ^ i10;
                        main = main;
                    }
                    break;
                case 1035651520:
                case 1220215249:
                    String str7 = strM8350;
                    short[] sArr9 = sArr6;
                    int i27 = i20;
                    if (C2419.m8175(strM2824, AbstractC0641.m2820(sArr9, i27, 8, i16))) {
                        int iM31622 = (C0773.m3169("ܺۜ") + i13) * (-43);
                        i15 = iM31622 ^ 1430093421;
                        i14 = ((iM31622 ^ i12) * 17171) ^ 1801686695;
                        i20 = i27;
                        sArr6 = sArr9;
                        strM8350 = str7;
                        i21 = 0;
                        main = main;
                    } else {
                        int iM2769 = C0619.m2761("ۖ᩺") ^ i13;
                        i14 = ((iM2769 ^ i12) * (-3881)) ^ 1215781943;
                        i15 = iM2769 ^ 1840312554;
                        main = main;
                        i20 = i27;
                        sArr6 = sArr9;
                        strM8350 = str7;
                        i21 = 0;
                    }
                    break;
                case 1054685665:
                case 1754952749:
                    if (C2834.f9334 > 0) {
                        i16 = i16;
                        sArr3 = sArr6;
                        int iM27610 = (C0619.m2761("ᩳ᩺") + i13) * (-95);
                        i15 = iM27610 ^ (-630244001);
                        main = main;
                        i14 = ((iM27610 ^ i12) * 32639) ^ 942283787;
                        sArr6 = sArr3;
                        i16 = i16;
                    } else {
                        iM2761 = C0773.m3169("ۡܶ") ^ i12;
                        i3 = ((iM2761 ^ i13) * (-7043)) ^ 2123601662;
                        i4 = 1641706434;
                        i15 = iM2761 ^ i4;
                        i14 = i3;
                    }
                    break;
                case 1332637476:
                case 2051273663:
                    C1783.m6232();
                    if (C1826.m6301() >= 0) {
                        strM8350 = strM8350;
                        dialogInterfaceOnClickListenerC16354 = dialogInterfaceOnClickListenerC16355;
                        sArr2 = sArr5;
                        int iM27611 = C0619.m2761("ᩴ۫") ^ i13;
                        i14 = (-564848231) ^ ((iM27611 ^ i12) * 16885);
                        i15 = iM27611 ^ (-1706325601);
                        sArr5 = sArr2;
                        dialogInterfaceOnClickListenerC16355 = dialogInterfaceOnClickListenerC16354;
                        strM8350 = strM8350;
                        i16 = i16;
                    } else {
                        iM2761 = (i12 - C0773.m3169("᩶ܺ")) * (-39);
                        i3 = ((iM2761 ^ i13) * 9595) ^ 263980057;
                        i4 = -216330410;
                        i15 = iM2761 ^ i4;
                        i14 = i3;
                    }
                    break;
                case 1607967557:
                case 1640792322:
                    String[] strArrSplit2 = strM2824.split(str3, i22);
                    dialogInterfaceOnClickListenerC16355.f53096 = strArrSplit2[c];
                    str5 = strArrSplit2[c2];
                    if (C3492.m11488()) {
                        iM2761 = (C0773.m3169("ۢۤ") ^ i12) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM2761 ^ i13) * 12037) ^ 1779541200;
                        i4 = 481530808;
                    } else {
                        iM2761 = (i12 - C0773.m3169("᩶ܺ")) * (-39);
                        i3 = ((iM2761 ^ i13) * 9595) ^ 263980057;
                        i4 = -216330410;
                    }
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
                default:
                    strM33137 = C13473.m33137(f77136, 64, 3, i16);
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0619.m2761("۬۠") + i13) * (-55);
                        i3 = ((iM2761 ^ i12) * (-4925)) ^ (-2002867042);
                        i4 = 1577310036;
                    } else {
                        iM2761 = C0773.m3169("ܳۤ") ^ i13;
                        i3 = ((iM2761 ^ i12) * (-27915)) ^ (-1834822595);
                        i4 = -1081537884;
                    }
                    i15 = iM2761 ^ i4;
                    i14 = i3;
                    break;
            }
        }
    }
}
