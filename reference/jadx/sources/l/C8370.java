package l;

import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V4FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8370 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int f29033;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Random f29034;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C5610 f29035;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C5610 f29036;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final char[] f29037;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C17212 f29038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21901() {
        int i = 0;
        char[] cArr = null;
        int i2 = 0;
        Random random = null;
        int i3 = 0;
        int iNextInt = 0;
        char cForDigit = 0;
        int i4 = 646043425;
        int i5 = C2249.f8050;
        int i6 = RunnableC3388.f12514;
        int iM45029 = (C19806.m45029("ᩳۘ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i7 = ((iM45029 ^ i6) * (-26599)) ^ (-113898403);
        int i8 = -1655625800;
        while (true) {
            i4 = ((((i4 ^ i6) * (-22093)) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -2100033880:
                case 2034611910:
                    i2 = 0;
                    iM45029 = (C19806.m45029("ܳ᩺") + i6) * (-27);
                    i7 = ((iM45029 ^ i5) * (-9203)) ^ (-339956337);
                    i8 = 255726438;
                    break;
                case -1925919081:
                case -1563331820:
                    if (C1460.m5050() != 0) {
                        iM45029 = (C19806.m45029("ۨ᩷") ^ i5) * (-53);
                        i7 = ((iM45029 ^ i6) * 22219) ^ 806108286;
                        i8 = -957247365;
                    } else {
                        iM45029 = (C19806.m45029("ۖۚ") ^ i5) * (-79);
                        i7 = ((iM45029 ^ i6) * 7981) ^ (-864428857);
                        i8 = -604894734;
                    }
                    break;
                case -1814536562:
                case -1252622839:
                    cForDigit = Character.forDigit(iNextInt, i3);
                    if (RunnableC1564.m5345()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩺") ^ i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i5) * (-21405)) ^ (-837768415);
                        i8 = 591049870;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩷") ^ i5) * (-81);
                        i7 = ((iM45029 ^ i6) * (-27379)) ^ 155599942;
                        i8 = -210068266;
                    }
                    break;
                case -1794026306:
                case 924455182:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩺") ^ i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i5) * (-21405)) ^ (-837768415);
                        i8 = 591049870;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܿ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-20629)) ^ (-243031973);
                        i8 = -1188691546;
                    }
                    break;
                case -1599568142:
                case 1187742442:
                    random = f29034;
                    i3 = 36;
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ۨ᩷") ^ i5) * (-53);
                        i7 = ((iM45029 ^ i6) * 22219) ^ 806108286;
                        i8 = -957247365;
                    } else {
                        iM45029 = C19806.m45029("ۘܿ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-29513)) ^ (-829182361);
                        i8 = 2032269473;
                    }
                    break;
                case -1563480935:
                case 2136560431:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ۧۤ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-23099)) ^ (-1465163087);
                        i8 = -2136030861;
                    } else {
                        iM45029 = (C19806.m45029("ۨ᩷") ^ i5) * (-53);
                        i7 = ((iM45029 ^ i6) * 22219) ^ 806108286;
                        i8 = -957247365;
                    }
                    break;
                case -1437003809:
                case 1309401711:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩺") ^ i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i5) * (-21405)) ^ (-837768415);
                        i8 = 591049870;
                    } else {
                        iM45029 = C19806.m45029("ܳ᩵") ^ i6;
                        i7 = ((iM45029 ^ i5) * 241) ^ 2039247330;
                        i8 = -1457907437;
                    }
                    break;
                case -1385238894:
                case -249041612:
                    i = 8;
                    cArr = new char[8];
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("ۨ᩷") ^ i5) * (-53);
                        i7 = ((iM45029 ^ i6) * 22219) ^ 806108286;
                        i8 = -957247365;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۢ") ^ i5) * 95;
                        i7 = ((iM45029 ^ i6) * 1773) ^ 669058898;
                        i8 = 464050532;
                    }
                    break;
                case -1186827607:
                case 316628767:
                    iNextInt = random.nextInt(i3);
                    if (C3286.m9798() <= 0) {
                        iM45029 = (C19806.m45029("ۖۚ") ^ i5) * (-79);
                        i7 = ((iM45029 ^ i6) * 7981) ^ (-864428857);
                        i8 = -604894734;
                    } else {
                        iM45029 = C19806.m45029("ܺۨ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-17801)) ^ (-1669426603);
                        i8 = 727083352;
                    }
                    break;
                case -980651593:
                case 745089657:
                    if (C1977.m6356()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩺") ^ i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i5) * (-21405)) ^ (-837768415);
                        i8 = 591049870;
                    } else {
                        iM45029 = C19806.m45029("ܿܶ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-15403)) ^ 83853411;
                        i8 = 1782233447;
                    }
                    break;
                case -754315426:
                case 1760277715:
                    cArr[i2] = cForDigit;
                    i2++;
                    iM45029 = (C19806.m45029("ܳ᩺") + i6) * (-27);
                    i7 = ((iM45029 ^ i5) * (-9203)) ^ (-339956337);
                    i8 = 255726438;
                    break;
                case -607229871:
                case -363284499:
                    return new String(cArr);
                case -307303205:
                case 831488304:
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = (C19806.m45029("ۖۚ") ^ i5) * (-79);
                        i7 = ((iM45029 ^ i6) * 7981) ^ (-864428857);
                        i8 = -604894734;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩷") ^ i6) * 85;
                        i7 = ((iM45029 ^ i5) * 11497) ^ (-373340366);
                        i8 = 1929763342;
                    }
                    break;
                case -210740831:
                case 514780177:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩺") ^ i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i5) * (-21405)) ^ (-837768415);
                        i8 = 591049870;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩶") + i6) * q.h;
                        i7 = ((iM45029 ^ i5) * (-10417)) ^ 962738118;
                        i8 = 1489997076;
                    }
                    break;
                case 85419838:
                case 1324897915:
                    C2788.m8472();
                    iM45029 = (C19806.m45029("ۛܿ") ^ i6) * (-17);
                    i7 = ((iM45029 ^ i5) * (-517)) ^ 993753363;
                    i8 = -1536535339;
                    break;
                case 227814714:
                case 2058743753:
                    C1066.m4023();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩷") ^ i6) * 85;
                        i7 = ((iM45029 ^ i5) * 11497) ^ (-373340366);
                        i8 = 1929763342;
                    } else {
                        iM45029 = (C19806.m45029("ۛܿ") ^ i6) * (-17);
                        i7 = ((iM45029 ^ i5) * (-517)) ^ 993753363;
                        i8 = -1536535339;
                    }
                    break;
                case 630683904:
                case 1682054221:
                    C1460.m5050();
                    C1668.m5583();
                    return null;
                case 1525825368:
                case 1560767434:
                    if (i2 < i) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i5;
                        i7 = ((iM45029 ^ i6) * 10315) ^ (-840747270);
                        i8 = -2035794893;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ᩴ") ^ i6) * 119;
                        i7 = ((iM45029 ^ i5) * (-31179)) ^ 1069908371;
                        i8 = -1713034799;
                    }
                    break;
                default:
                    if (C2642.m8171() != 0) {
                        iM45029 = (C19806.m45029("ۖۚ") ^ i5) * (-79);
                        i7 = ((iM45029 ^ i6) * 7981) ^ (-864428857);
                        i8 = -604894734;
                    } else {
                        iM45029 = C19806.m45029("᩹ۖ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 27925) ^ 164640255;
                        i8 = 99359653;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f8 A[PHI: r17 r18 r21
      0x00f8: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:31:0x00f6, B:19:0x0095, B:12:0x0076, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r18v4 char[]) = (r18v3 char[]), (r18v2 char[]), (r18v2 char[]), (r18v2 char[]) binds: [B:31:0x00f6, B:19:0x0095, B:12:0x0076, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r21v4 int) = (r21v2 int), (r21v3 int), (r21v2 int), (r21v2 int) binds: [B:31:0x00f6, B:19:0x0095, B:12:0x0076, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0150 A[PHI: r13 r15 r20
      0x0150: PHI (r13v4 byte) = (r13v3 byte), (r13v2 byte), (r13v2 byte) binds: [B:39:0x014e, B:23:0x00b6, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:39:0x014e, B:23:0x00b6, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:39:0x014e, B:23:0x00b6, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0202 A[PHI: r8
      0x0202: PHI (r8v5 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:55:0x0200, B:12:0x0076, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x023a A[PHI: r6 r7 r11 r16
      0x023a: PHI (r6v4 byte[]) = (r6v3 byte[]), (r6v2 byte[]), (r6v2 byte[]), (r6v2 byte[]), (r6v2 byte[]) binds: [B:59:0x0238, B:49:0x01c0, B:35:0x012c, B:14:0x007a, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:59:0x0238, B:49:0x01c0, B:35:0x012c, B:14:0x007a, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r11v4 byte) = (r11v2 byte), (r11v3 byte), (r11v2 byte), (r11v2 byte), (r11v2 byte) binds: [B:59:0x0238, B:49:0x01c0, B:35:0x012c, B:14:0x007a, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r16v4 int) = (r16v2 int), (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:59:0x0238, B:49:0x01c0, B:35:0x012c, B:14:0x007a, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02c5 A[PHI: r1 r2 r19
      0x02c5: PHI (r1v4 java.security.MessageDigest) = (r1v3 java.security.MessageDigest), (r1v2 java.security.MessageDigest) binds: [B:69:0x02c3, B:27:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r2v4 java.nio.charset.Charset) = (r2v3 java.nio.charset.Charset), (r2v2 java.nio.charset.Charset) binds: [B:69:0x02c3, B:27:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r19v3 char) = (r19v2 char), (r19v4 char) binds: [B:69:0x02c3, B:27:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21902(String str) {
        int iM11306;
        int i;
        int i2;
        int i3 = C0050.f912;
        int i4 = C1875.f7103;
        int iM11307 = ThreadFactoryC3888.m11306("ܶ᩹") ^ i3;
        int i5 = ((iM11307 ^ i4) * (-28031)) ^ 519958603;
        byte[] bArrM3742 = null;
        byte[] bArrDigest = null;
        char[] cArr = null;
        char[] cArr2 = null;
        int i6 = iM11307 ^ 852310012;
        int i7 = 0;
        int length = 0;
        int i8 = 0;
        int length2 = 0;
        byte b = 0;
        int i9 = 0;
        byte b2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 593158475;
        int i17 = 0;
        Charset charset = null;
        MessageDigest messageDigestM49416 = null;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i4) * (-20131)) >> 31));
            switch (i16) {
                case -2133472652:
                case -17043618:
                    cArr[i10] = c;
                    i14 = i10 + 2;
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۢ") ^ i4;
                        i = ((iM11306 ^ i3) * 19533) ^ (-1003032718);
                        i2 = 1713101342;
                    } else {
                        iM11306 = (C19806.m45029("᩶۟") ^ i3) * (-103);
                        i = ((iM11306 ^ i4) * (-17341)) ^ 1863707123;
                        i2 = 1236935286;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1926622376:
                case 372556171:
                    if (C0216.f1393 == 0) {
                        iM11306 = C19806.m45029("ۢ᩹") ^ i3;
                        i = ((iM11306 ^ i4) * (-19053)) ^ 652559304;
                        i2 = -1920572319;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i3) * (-127);
                        i = ((iM11306 ^ i4) * 8093) ^ (-1604102874);
                        i2 = -787723118;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1800802230:
                case 2128008149:
                    i8 = 1;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ܳܿ") ^ i4;
                        i = ((iM11306 ^ i3) * (-22357)) ^ 1896014975;
                        i2 = 1233630021;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩹") ^ i3;
                        i = ((iM11306 ^ i4) * (-19053)) ^ 652559304;
                        i2 = -1920572319;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1743457603:
                case -1610000173:
                    return new String(cArr);
                case -1565112700:
                case -510580659:
                    cArr = new char[length << i8];
                    length2 = bArrDigest.length;
                    i9 = i17;
                    i10 = 0;
                    iM11306 = (i3 - C19806.m45029("ۗۖ")) * 109;
                    i = ((iM11306 ^ i4) * 11181) ^ (-783819373);
                    i2 = -873514884;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1516860412:
                case 708688781:
                    i13 = i12 & 15;
                    cArr2 = f29037;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i3) * (-127);
                        i = ((iM11306 ^ i4) * 8093) ^ (-1604102874);
                        i2 = -787723118;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۤ") ^ i3) * 7;
                        i = ((iM11306 ^ i4) * (-231)) ^ 486347266;
                        i2 = 67477399;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1507234616:
                case -916287554:
                    if (i9 < length2) {
                        iM11306 = C19806.m45029("ۧܳ") ^ i4;
                        i = ((iM11306 ^ i3) * 25071) ^ 1807808045;
                        i2 = 870952832;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ܽ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i4) * 21551) ^ 1984519586;
                        i2 = 1329386724;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1467286205:
                case 564432369:
                    bArrM3742[i7] = b;
                    i7++;
                    int iM11308 = ThreadFactoryC3888.m11306("ᩳᩳ") ^ i3;
                    i5 = ((iM11308 ^ i4) * (-28711)) ^ 1101212468;
                    i6 = iM11308 ^ 1166935309;
                    break;
                case -1357028280:
                case -67573227:
                    i12 = b2 >>> 4;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۛ") ^ i4) * (-69);
                        i = ((iM11306 ^ i3) * o.a.q) ^ (-915003401);
                        i2 = -1978211530;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ᩵") + i4) * 63;
                        i = ((iM11306 ^ i3) * (-4949)) ^ 1923202935;
                        i2 = -881648492;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1333120920:
                case 287764584:
                    c = cArr2[i13];
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۫") ^ i4;
                        i = ((iM11306 ^ i3) * 17487) ^ 1467678132;
                        i2 = -1356061254;
                    } else {
                        iM11306 = C19806.m45029("᩸֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-16457)) ^ 1408620427;
                        i2 = 1810359280;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1045687723:
                case 180277830:
                    C1148.m4232();
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳۛ") ^ i4) * (-69);
                    i = ((iM11306 ^ i3) * o.a.q) ^ (-915003401);
                    i2 = -1978211530;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -954994383:
                case 1142811379:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i3) * (-127);
                        i = ((iM11306 ^ i4) * 8093) ^ (-1604102874);
                        i2 = -787723118;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۢ") ^ i4;
                        i = ((iM11306 ^ i3) * 19533) ^ (-1003032718);
                        i2 = 1713101342;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -790913364:
                case 589222694:
                    b = (byte) (~bArrM3742[i7]);
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۛ") ^ i4) * (-69);
                        i = ((iM11306 ^ i3) * o.a.q) ^ (-915003401);
                        i2 = -1978211530;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܺ") ^ i4;
                        i = ((iM11306 ^ i3) * (-10123)) ^ (-1797784281);
                        i2 = -896194381;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -656908031:
                case -306568878:
                    b2 = bArrDigest[i9];
                    i11 = i10 + 1;
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۢ") ^ i4;
                        i = ((iM11306 ^ i3) * 19533) ^ (-1003032718);
                        i2 = 1713101342;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۢ") ^ i3;
                        i = ((iM11306 ^ i4) * (-23105)) ^ (-1189140702);
                        i2 = -482927708;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -274443188:
                case 1122413663:
                    messageDigestM49416.update(bArrM3742);
                    bArrDigest = messageDigestM49416.digest();
                    length = bArrDigest.length;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۛ") ^ i4) * (-69);
                        i = ((iM11306 ^ i3) * o.a.q) ^ (-915003401);
                        i2 = -1978211530;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۚܰ")) * 71;
                        i = ((iM11306 ^ i3) * 20367) ^ (-1479140351);
                        i2 = 1149853108;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -43973308:
                case 161993358:
                    if (i7 < bArrM3742.length) {
                        iM11306 = (C19806.m45029("ܽ۟") + i3) * 67;
                        i = ((iM11306 ^ i4) * (-4953)) ^ (-1232134204);
                        i2 = -864280695;
                    } else {
                        iM11306 = C19806.m45029("ܽۘ") ^ i3;
                        i = ((iM11306 ^ i4) * 21011) ^ (-1655021124);
                        i2 = -1550964076;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 137630350:
                case 695044801:
                    bArrM3742 = C0962.m3742(str, charset);
                    i7 = 0;
                    i17 = 0;
                    int iM11309 = ThreadFactoryC3888.m11306("ᩳᩳ") ^ i3;
                    i5 = ((iM11309 ^ i4) * (-28711)) ^ 1101212468;
                    i6 = iM11309 ^ 1166935309;
                    break;
                case 176694426:
                case 2129089564:
                    messageDigestM49416 = C22253.m49416();
                    charset = StandardCharsets.UTF_8;
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۫") ^ i4;
                        i = ((iM11306 ^ i3) * 17487) ^ 1467678132;
                        i2 = -1356061254;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i4;
                        i = ((iM11306 ^ i3) * (-15435)) ^ 1667518547;
                        i2 = -1033919986;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 273658754:
                case 1286096944:
                    cArr[i11] = cArr2[i15];
                    i9++;
                    i10 = i14;
                    iM11306 = (i3 - C19806.m45029("ۗۖ")) * 109;
                    i = ((iM11306 ^ i4) * 11181) ^ (-783819373);
                    i2 = -873514884;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 292304113:
                case 957275426:
                    C1419.m4973();
                    C1419.m4973();
                    return null;
                case 310747852:
                case 1227761722:
                    i15 = b2 & 15;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i3) * (-127);
                        i = ((iM11306 ^ i4) * 8093) ^ (-1604102874);
                        i2 = -787723118;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨۫") + i4) * (-111);
                        i = ((iM11306 ^ i3) * (-11081)) ^ (-275012825);
                        i2 = 1237399744;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1460.m5050();
                    if (C2788.m8472() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۛ") ^ i4) * (-69);
                        i = ((iM11306 ^ i3) * o.a.q) ^ (-915003401);
                        i2 = -1978211530;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩹") ^ i3;
                        i = ((iM11306 ^ i4) * (-19053)) ^ 652559304;
                        i2 = -1920572319;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:37:0x0142  */
    /* JADX WARN: Code duplicated, block: B:61:0x025b A[PHI: r0 r1
      0x025b: PHI (r0v11 char[]) = (r0v10 char[]), (r0v2 char[]), (r0v2 char[]), (r0v2 char[]), (r0v2 char[]) binds: [B:60:0x0259, B:56:0x0236, B:20:0x007f, B:17:0x0064, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r1v4 l.ۚ᩷᩺) = (r1v2 l.ۚ᩷᩺), (r1v3 l.ۚ᩷᩺), (r1v2 l.ۚ᩷᩺), (r1v2 l.ۚ᩷᩺), (r1v2 l.ۚ᩷᩺) binds: [B:60:0x0259, B:56:0x0236, B:20:0x007f, B:17:0x0064, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM45029;
        int i;
        char[] cArr = null;
        C5610 c5610 = null;
        C17212 c17212 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 465752453;
        int i6 = C1419.f5860;
        int i7 = C1025.f4800;
        int iM450210 = (C19806.m45029("۫ۡ") + i6) * 87;
        int i8 = ((iM450210 ^ i7) * (-22593)) ^ 189483604;
        int i9 = -661903165;
        while (true) {
            int i10 = iM450210 ^ i9;
            C15426 c15426 = null;
            while (true) {
                i5 = ((((i5 ^ i7) * 30097) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2098029583:
                    case 1905406701:
                        C2788.m8468(c17212, i2, c15426);
                        C1148.m4228(c17212, 4151, c15426);
                        C2788.m8468(c17212, o.a.c, c15426);
                        if (C7105.f23796 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۡۘ") ^ i7) * (-65);
                            i8 = ((iM45029 ^ i6) * (-3107)) ^ (-657698361);
                            i = 1962077214;
                            i10 = iM45029 ^ i;
                        }
                        break;
                    case -2078433358:
                    case 820870134:
                        C1148.m4228(c17212, o.a.m, c15426);
                        C2788.m8468(c17212, o.a.f77939l, c15426);
                        i3 = o.a.p;
                        iM45029 = (C19806.m45029("ܶ᩷") + i6) * (-75);
                        i8 = ((iM45029 ^ i7) * 16029) ^ 699720954;
                        i = -2141623554;
                        i10 = iM45029 ^ i;
                        break;
                    case -2011200643:
                    case -1676798400:
                        C1148.m4228(c17212, 4153, c15426);
                        C2788.m8468(c17212, 4161, c15426);
                        C2788.m8468(c17212, 4160, c15426);
                        i2 = 4162;
                        if (CallableC1627.m5507() == 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۤܽ") + i6) * (-89);
                            i8 = ((iM45029 ^ i7) * (-19371)) ^ (-1525838930);
                            i = -895623224;
                            i10 = iM45029 ^ i;
                        }
                        break;
                    case -1998342348:
                    case 764233081:
                        C0797.m3359();
                        iM45029 = C19806.m45029("ܳܿ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-10693)) ^ 1698398215;
                        i = -1312831989;
                        i10 = iM45029 ^ i;
                        break;
                    case -1565796714:
                    case -266624095:
                        C2788.m8468(c17212, i4, c15426);
                        C1148.m4228(c17212, 4144, c15426);
                        if (!C0817.m3399()) {
                        }
                        iM45029 = (C19806.m45029("᩶ܶ") ^ i6) * 69;
                        i8 = ((iM45029 ^ i7) * 8633) ^ 1334116015;
                        i = 950688576;
                        i10 = iM45029 ^ i;
                        break;
                        break;
                    case -1403591134:
                    case -1316252792:
                        C1148.m4228(c17212, 4145, c15426);
                        C1148.m4228(c17212, 4116, c15426);
                        C1148.m4228(c17212, 4135, c15426);
                        C2788.m8468(c17212, 4197, c15426);
                        return;
                    case -1331020629:
                    case -376795127:
                        C2788.m8468(c17212, i3, c15426);
                        C1148.m4228(c17212, 4358, c15426);
                        if (!C0526.f2219) {
                            iM45029 = (C19806.m45029("ܿۛ") ^ i7) * 49;
                            i8 = ((iM45029 ^ i6) * 32495) ^ (-768728552);
                            i = -304835795;
                            i10 = iM45029 ^ i;
                        }
                        break;
                    case -1218062294:
                    case 1934946484:
                        C1937.m6279();
                        if (RunnableC1606.f6488 < 0) {
                            iM45029 = C19806.m45029("ܳܿ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-10693)) ^ 1698398215;
                            i = -1312831989;
                        } else {
                            iM45029 = (i7 - ThreadFactoryC3888.m11306("ᩴ۟")) * 71;
                            i8 = ((iM45029 ^ i6) * (-11389)) ^ (-1508763489);
                            i = 1754675464;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case -753229338:
                    case 1092769907:
                        f29034 = new Random();
                        cArr = new char[16];
                        if (C2249.f8050 >= 0) {
                            iM45029 = C19806.m45029("ܳܿ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-10693)) ^ 1698398215;
                            i = -1312831989;
                        } else {
                            iM45029 = (i6 - C19806.m45029("ܳۚ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i8 = ((iM45029 ^ i7) * 29721) ^ (-240337404);
                            i = 1282910828;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case -576076344:
                    case -381198838:
                        f29036 = c5610;
                        f29035 = new C5610();
                        c17212 = new C17212();
                        f29038 = c17212;
                        if (!C0797.f3386) {
                            c15426 = new C15426();
                            C1148.m4228(c17212, 4119, c15426);
                            C2788.m8468(c17212, o.a.d, c15426);
                            if (!C10634.m26820()) {
                                iM45029 = C19806.m45029("ۡ۬") ^ i7;
                                i8 = ((iM45029 ^ i6) * 11939) ^ (-541749679);
                                i = -2015660864;
                                i10 = iM45029 ^ i;
                            }
                        }
                        break;
                    case 99908477:
                    case 1532399575:
                        // fill-array-data instruction
                        cArr[0] = '0';
                        cArr[1] = '1';
                        cArr[2] = '2';
                        cArr[3] = '3';
                        cArr[4] = '4';
                        cArr[5] = '5';
                        cArr[6] = '6';
                        cArr[7] = '7';
                        cArr[8] = '8';
                        cArr[9] = '9';
                        cArr[10] = 'A';
                        cArr[11] = 'B';
                        cArr[12] = 'C';
                        cArr[13] = 'D';
                        cArr[14] = 'E';
                        cArr[15] = 'F';
                        f29037 = cArr;
                        c5610 = new C5610();
                        if (C1460.f5948 >= 0) {
                            iM45029 = C19806.m45029("ܳܿ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-10693)) ^ 1698398215;
                            i = -1312831989;
                        } else {
                            iM45029 = C19806.m45029("᩷ۢ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-13865)) ^ 250222224;
                            i = 219875916;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case 145819071:
                    case 392110407:
                        if (AbstractC0464.f2088 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܶܳ") ^ i6) * (-53);
                            i8 = ((iM45029 ^ i7) * (-27127)) ^ 1536654220;
                            i = -1225086087;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") + i6) * (-109);
                            i8 = ((iM45029 ^ i7) * (-32337)) ^ (-1341500141);
                            i = 2079122590;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case 472929902:
                    case 1990247233:
                        C1148.m4228(c17212, o.a.a, c15426);
                        C2788.m8468(c17212, 4136, c15426);
                        i4 = 4137;
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("۫ᩳ")) * (-69);
                        i8 = ((iM45029 ^ i7) * 14145) ^ (-205043554);
                        i = -1677343993;
                        i10 = iM45029 ^ i;
                        break;
                    case 1084438587:
                    case 2012630326:
                        C2788.m8468(c17212, o.a.k, c15426);
                        C1148.m4228(c17212, o.a.n, c15426);
                        if (C1977.f7413 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") + i6) * (-109);
                            i8 = ((iM45029 ^ i7) * (-32337)) ^ (-1341500141);
                            i = 2079122590;
                        } else {
                            iM45029 = C19806.m45029("ۧۜ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-7775)) ^ (-1471432412);
                            i = -530820116;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case 1483376044:
                    case 1628361896:
                        C1148.m4232();
                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                        throw new RuntimeException();
                    case 1793669644:
                    case 1922503940:
                        if (C1377.f5749) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܶܳ") ^ i6) * (-53);
                            i8 = ((iM45029 ^ i7) * (-27127)) ^ 1536654220;
                            i = -1225086087;
                        } else {
                            iM45029 = C19806.m45029("ܳܿ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-10693)) ^ 1698398215;
                            i = -1312831989;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    default:
                        C1148.m4228(c17212, o.a.h, c15426);
                        C1148.m4228(c17212, o.a.e, c15426);
                        if (RunnableC3388.f12514 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۨ᩶") ^ i6;
                            i8 = ((iM45029 ^ i7) * 287) ^ (-1173602280);
                            i = 1572829833;
                            i10 = iM45029 ^ i;
                        }
                        break;
                }
            }
            iM450210 = (C19806.m45029("ۗ۠") ^ i7) * (-27);
            i8 = ((iM450210 ^ i6) * 18235) ^ 360437396;
            i9 = -169794495;
        }
    }
}
