package l;

import com.umeng.analytics.pro.o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V4FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C1585 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Random f5480;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C4670 f5481;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2375 f5482;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C4670 f5483;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f5484;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f5485;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5602() {
        int i = 0;
        char[] cArr = null;
        int i2 = 0;
        Random random = null;
        int i3 = 0;
        int iNextInt = 0;
        char cForDigit = 0;
        int i4 = -1690017666;
        int i5 = C4282.f15546;
        int i6 = C0773.f2792;
        int iM3169 = C0773.m3169("᩶ᩳ") ^ i6;
        int i7 = ((iM3169 ^ i5) * (-28403)) ^ (-596999866);
        int i8 = -617369489;
        while (true) {
            i4 = ((((i4 ^ i5) * 28105) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2126880753:
                case -1035063830:
                    C1343.m4943();
                    if (C1542.f5343 > 0) {
                        iM3169 = C0773.m3169("ܺۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25191) ^ 88047325;
                        i8 = -1743993690;
                    } else {
                        iM3169 = C0773.m3169("᩶᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * 20869) ^ 1078904312;
                        i8 = -2126129852;
                    }
                    break;
                case -2023829088:
                case 1454620621:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("᩶᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * 20869) ^ 1078904312;
                        i8 = -2126129852;
                    } else {
                        iM3169 = C0619.m2761("᩶ۤ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 18053) ^ (-1152895670);
                        i8 = -1467209780;
                    }
                    break;
                case -1943231497:
                case 816690535:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0773.m3169("۟ۢ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-5369)) ^ (-1641210757);
                        i8 = 1542573534;
                    } else {
                        iM3169 = C0773.m3169("ۜ᩶") ^ i6;
                        i7 = ((iM3169 ^ i5) * 31331) ^ 595645875;
                        i8 = -756130453;
                    }
                    break;
                case -1829002370:
                case -1541102290:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("᩵ۘ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-6083)) ^ (-433841050);
                        i8 = -1516575719;
                    } else {
                        iM3169 = C0619.m2761("᩹᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * 28121) ^ 1791055441;
                        i8 = 607029316;
                    }
                    break;
                case -1734102193:
                case 1191759591:
                    i2 = 0;
                    iM3169 = C0619.m2761("᩻᩶") ^ i5;
                    i7 = ((iM3169 ^ i6) * 1707) ^ (-259944755);
                    i8 = 617486908;
                    break;
                case -1603220776:
                case -51000487:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("᩶᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * 20869) ^ 1078904312;
                        i8 = -2126129852;
                    } else {
                        iM3169 = (C0619.m2761("ܰۙ") + i6) * (-63);
                        i7 = ((iM3169 ^ i5) * (-28621)) ^ 1437066253;
                        i8 = 1382316701;
                    }
                    break;
                case -1551828363:
                case -240328631:
                    cArr[i2] = cForDigit;
                    i2++;
                    iM3169 = C0619.m2761("᩻᩶") ^ i5;
                    i7 = ((iM3169 ^ i6) * 1707) ^ (-259944755);
                    i8 = 617486908;
                    break;
                case -1448180101:
                case 906068272:
                    i = 8;
                    cArr = new char[8];
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ܺۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25191) ^ 88047325;
                        i8 = -1743993690;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ۚܰ")) * (-29);
                        i7 = ((iM3169 ^ i6) * (-27447)) ^ 534025924;
                        i8 = 570816546;
                    }
                    break;
                case -1188540726:
                case 2136123688:
                    C2023.m6964();
                    iM3169 = C0619.m2761("۠᩶") ^ i6;
                    i7 = ((iM3169 ^ i5) * 16179) ^ (-2068910963);
                    i8 = 1294554262;
                    break;
                case -984153430:
                case -3291365:
                    iNextInt = random.nextInt(i3);
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("ܺۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25191) ^ 88047325;
                        i8 = -1743993690;
                    } else {
                        iM3169 = C0773.m3169("۠֨") ^ i5;
                        i7 = ((iM3169 ^ i6) * 27853) ^ (-1184119700);
                        i8 = 2145497870;
                    }
                    break;
                case -774482313:
                case 1546721910:
                    return new String(cArr);
                case -612076560:
                case 2091438318:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("᩶᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * 20869) ^ 1078904312;
                        i8 = -2126129852;
                    } else {
                        iM3169 = C0619.m2761("ۗܶ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-14387)) ^ 1162457015;
                        i8 = -1235695788;
                    }
                    break;
                case -501892878:
                case 7268978:
                    if (i2 < i) {
                        iM3169 = C0619.m2761("᩶۫") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-1899)) ^ 87391621;
                        i8 = 542117181;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ܶ᩶")) * 11;
                        i7 = ((iM3169 ^ i5) * (-25835)) ^ (-235097329);
                        i8 = 1024599860;
                    }
                    break;
                case -359507219:
                case -151827230:
                    C1146.m4231();
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("᩶᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * 20869) ^ 1078904312;
                        i8 = -2126129852;
                    } else {
                        iM3169 = C0619.m2761("۠᩶") ^ i6;
                        i7 = ((iM3169 ^ i5) * 16179) ^ (-2068910963);
                        i8 = 1294554262;
                    }
                    break;
                case -203889874:
                case 610843437:
                    if (!C2878.f9462) {
                        iM3169 = C0773.m3169("۟ۢ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-5369)) ^ (-1641210757);
                        i8 = 1542573534;
                    } else {
                        iM3169 = C0619.m2761("۠᩶") ^ i6;
                        i7 = ((iM3169 ^ i5) * 16179) ^ (-2068910963);
                        i8 = 1294554262;
                    }
                    break;
                case -74857793:
                case 2033540783:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0773.m3169("ܺۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25191) ^ 88047325;
                        i8 = -1743993690;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ᩹") ^ i6) * (-11);
                        i7 = ((iM3169 ^ i5) * (-2961)) ^ 1729787897;
                        i8 = 1872133362;
                    }
                    break;
                case 82872605:
                case 989939493:
                    random = f5480;
                    i3 = 36;
                    if (C2310.m7813() <= 0) {
                        iM3169 = C0773.m3169("ܺۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25191) ^ 88047325;
                        i8 = -1743993690;
                    } else {
                        iM3169 = C0773.m3169("᩵᩶") ^ i6;
                        i7 = ((iM3169 ^ i5) * 21397) ^ 1111552336;
                        i8 = -1924075245;
                    }
                    break;
                case 896833371:
                case 1531107027:
                    cForDigit = Character.forDigit(iNextInt, i3);
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("᩵ۘ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-6083)) ^ (-433841050);
                        i8 = -1516575719;
                    } else {
                        iM3169 = (C0773.m3169("ۤ֫") + i5) * 83;
                        i7 = ((iM3169 ^ i6) * (-24983)) ^ (-1080713607);
                        i8 = 284355485;
                    }
                    break;
                default:
                    C2310.m7813();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013b A[PHI: r16
      0x013b: PHI (r16v4 int) = (r16v3 int), (r16v2 int) binds: [B:37:0x0139, B:7:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0171 A[PHI: r13 r15 r19
      0x0171: PHI (r13v4 byte) = (r13v3 byte), (r13v2 byte) binds: [B:41:0x016f, B:29:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:41:0x016f, B:29:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r19v3 char) = (r19v2 char), (r19v4 char) binds: [B:41:0x016f, B:29:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x021c A[PHI: r8
      0x021c: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:56:0x021a, B:10:0x007b, B:7:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02c8 A[PHI: r1 r2 r6 r7 r11 r17 r18 r20 r21
      0x02c8: PHI (r1v4 java.security.MessageDigest) = 
      (r1v3 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
     binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r2v4 java.nio.charset.Charset) = 
      (r2v3 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
     binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r6v4 byte[]) = 
      (r6v2 byte[])
      (r6v3 byte[])
      (r6v2 byte[])
      (r6v2 byte[])
      (r6v2 byte[])
      (r6v2 byte[])
      (r6v2 byte[])
      (r6v2 byte[])
      (r6v2 byte[])
     binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r11v4 byte) = 
      (r11v2 byte)
      (r11v2 byte)
      (r11v3 byte)
      (r11v2 byte)
      (r11v2 byte)
      (r11v2 byte)
      (r11v2 byte)
      (r11v2 byte)
      (r11v2 byte)
     binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r17v4 int) = (r17v2 int), (r17v2 int), (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r18v4 char[]) = 
      (r18v2 char[])
      (r18v2 char[])
      (r18v2 char[])
      (r18v3 char[])
      (r18v2 char[])
      (r18v2 char[])
      (r18v2 char[])
      (r18v2 char[])
      (r18v2 char[])
     binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v2 int), (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r21v4 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v2 int), (r21v2 int), (r21v3 int), (r21v2 int), (r21v2 int), (r21v2 int) binds: [B:70:0x02c6, B:60:0x0254, B:51:0x01e3, B:33:0x011b, B:25:0x00dc, B:21:0x00b8, B:16:0x009b, B:13:0x0081, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5603(String str) {
        int iM2761;
        int i;
        int i2;
        int i3 = C4238.f15451;
        int i4 = C3734.f12817;
        int iM3169 = C0773.m3169("ᩳ֨") ^ i4;
        int i5 = ((iM3169 ^ i3) * 11361) ^ (-1116288293);
        byte[] bArrM6236 = null;
        byte[] bArrM1777 = null;
        char[] cArr = null;
        char[] cArr2 = null;
        int i6 = iM3169 ^ (-1784388916);
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
        int i16 = -740373881;
        int i17 = 0;
        Charset charset = null;
        MessageDigest messageDigestM36174 = null;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i3) * (-2361)) >> 31));
            switch (i16) {
                case -1993260459:
                case -757527111:
                    if (i7 < bArrM6236.length) {
                        iM2761 = C0619.m2761("ۖ᩶") ^ i3;
                        i = ((iM2761 ^ i4) * 16561) ^ (-2064237911);
                        i2 = 481657027;
                    } else {
                        iM2761 = C0619.m2761("᩷᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-1231)) ^ (-1971135959);
                        i2 = -1503655266;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1991948192:
                case -1653716159:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                        i2 = -192715007;
                    } else {
                        iM2761 = C0773.m3169("ܽۘ") ^ i3;
                        i = ((iM2761 ^ i4) * 7777) ^ 903760246;
                        i2 = -1790084562;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1770485535:
                case 1316058993:
                    return new String(cArr);
                case -1589758450:
                case -1181325971:
                    cArr[i10] = c;
                    i14 = i10 + 2;
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0773.m3169("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                        i2 = -192715007;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM2761 ^ i4) * 12165) ^ (-984312589);
                        i2 = 480766785;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1442688118:
                case 1089723347:
                    b = (byte) (~bArrM6236[i7]);
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("ۘ᩷") ^ i4;
                        i = ((iM2761 ^ i3) * (-17655)) ^ (-649021450);
                        i2 = 613648782;
                    } else {
                        iM2761 = C0773.m3169("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                        i2 = -192715007;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1441782021:
                case 1075228551:
                    i15 = b2 & 15;
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0773.m3169("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                        i2 = -192715007;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩹") ^ i4) * 95;
                        i = ((iM2761 ^ i3) * (-21239)) ^ 1219526226;
                        i2 = -1513940095;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1316771416:
                case 1591338201:
                    bArrM6236[i7] = b;
                    i7++;
                    int iM2762 = C0619.m2761("ۙ᩹") ^ i4;
                    i5 = ((iM2762 ^ i3) * 8473) ^ 1576100668;
                    i6 = iM2762 ^ 471949868;
                    break;
                case -949306420:
                case 1359245968:
                    C1564.m5509();
                    iM2761 = C0773.m3169("۬֨") ^ i3;
                    i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                    i2 = -192715007;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -542667271:
                case -297480385:
                    b2 = bArrM1777[i9];
                    i11 = i10 + 1;
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("᩵᩹") ^ i4;
                        i = ((iM2761 ^ i3) * (-26429)) ^ 1623929377;
                        i2 = -1061934747;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * 18793) ^ 312840689;
                        i2 = -99900747;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -447273094:
                case -188949194:
                    bArrM6236 = C1783.m6236(str, charset);
                    i7 = 0;
                    i17 = 0;
                    int iM2763 = C0619.m2761("ۙ᩹") ^ i4;
                    i5 = ((iM2763 ^ i3) * 8473) ^ 1576100668;
                    i6 = iM2763 ^ 471949868;
                    break;
                case -134246971:
                case 2132499522:
                    cArr[i11] = cArr2[i15];
                    i9++;
                    i10 = i14;
                    iM2761 = (C0773.m3169("ܶۖ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM2761 ^ i4) * (-6813)) ^ 1874963812;
                    i2 = -1919519112;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 8629166:
                case 282360149:
                    messageDigestM36174.update(bArrM6236);
                    bArrM1777 = C0269.m1777(messageDigestM36174);
                    length = bArrM1777.length;
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                        i2 = -192715007;
                    } else {
                        iM2761 = (C0619.m2761("ۛ۠") + i4) * (-53);
                        i = ((iM2761 ^ i3) * 28679) ^ (-332337348);
                        i2 = 120647794;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 10368897:
                case 603627580:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                        i2 = -192715007;
                    } else {
                        iM2761 = C0619.m2761("ܽۢ") ^ i4;
                        i = ((iM2761 ^ i3) * 26171) ^ 1604346443;
                        i2 = -1005298836;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 12031456:
                case 1776826590:
                    messageDigestM36174 = C15022.m36174();
                    charset = StandardCharsets.UTF_8;
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                        i2 = -192715007;
                    } else {
                        iM2761 = (C0619.m2761("ۜܰ") + i3) * (-43);
                        i = ((iM2761 ^ i4) * (-22221)) ^ 2037016164;
                        i2 = -1146154825;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 217212357:
                case 1437051256:
                    C2354.m7983();
                    if (C11235.f35427 < 0) {
                        iM2761 = C0773.m3169("ܽۘ") ^ i3;
                        i = ((iM2761 ^ i4) * 7777) ^ 903760246;
                        i2 = -1790084562;
                    } else {
                        iM2761 = (C0773.m3169("۫ܺ") + i4) * (-115);
                        i = ((iM2761 ^ i3) * 7819) ^ (-1445453430);
                        i2 = -1805531639;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 429497269:
                case 2081482057:
                    if (i9 < length2) {
                        iM2761 = (i4 - C0619.m2761("ۢ᩻")) * (-77);
                        i = ((iM2761 ^ i3) * (-2099)) ^ 1758620019;
                        i2 = -174163111;
                    } else {
                        iM2761 = C0619.m2761("֡ۢ") ^ i3;
                        i = ((iM2761 ^ i4) * 17143) ^ 1587964695;
                        i2 = -121176263;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 518533101:
                case 1287414918:
                    i12 = b2 >>> 4;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0773.m3169("۫ܺ") + i4) * (-115);
                        i = ((iM2761 ^ i3) * 7819) ^ (-1445453430);
                        i2 = -1805531639;
                    } else {
                        iM2761 = C0619.m2761("ۡ۠") ^ i4;
                        i = ((iM2761 ^ i3) * (-5065)) ^ (-434505729);
                        i2 = -696738868;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 610744248:
                case 1321071793:
                    i8 = 1;
                    if (C0950.m3785() != 0) {
                        iM2761 = C0773.m3169("ܽۘ") ^ i3;
                        i = ((iM2761 ^ i4) * 7777) ^ 903760246;
                        i2 = -1790084562;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۢ֨")) * (-33);
                        i = ((iM2761 ^ i3) * (-19481)) ^ (-1042330489);
                        i2 = 488963692;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1011184940:
                case 1130924394:
                    i13 = i12 & 15;
                    cArr2 = f5484;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * 3863) ^ (-934010388);
                        i2 = -192715007;
                    } else {
                        iM2761 = C0619.m2761("᩻ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 20299) ^ 1889989472;
                        i2 = -766331222;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1110738452:
                case 1974533004:
                    AbstractC0641.m2813();
                    C2375.m8065();
                    return null;
                case 1195459501:
                case 2095802295:
                    c = cArr2[i13];
                    if (C17202.f56030) {
                        iM2761 = (i3 - C0773.m3169("۬ܺ")) * (-41);
                        i = ((iM2761 ^ i4) * (-18685)) ^ 714520863;
                        i2 = 89972480;
                    } else {
                        iM2761 = C0619.m2761("᩵᩹") ^ i4;
                        i = ((iM2761 ^ i3) * (-26429)) ^ 1623929377;
                        i2 = -1061934747;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    cArr = new char[length << i8];
                    length2 = bArrM1777.length;
                    i9 = i17;
                    i10 = 0;
                    iM2761 = (C0773.m3169("ܶۖ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM2761 ^ i4) * (-6813)) ^ 1874963812;
                    i2 = -1919519112;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0189  */
    /* JADX WARN: Code duplicated, block: B:51:0x01de A[PHI: r2 r12
      0x01de: PHI (r2v5 l.ۖۗ) = (r2v4 l.ۖۗ), (r2v2 l.ۖۗ), (r2v2 l.ۖۗ), (r2v2 l.ۖۗ), (r2v2 l.ۖۗ) binds: [B:50:0x01dc, B:31:0x00fa, B:15:0x0043, B:13:0x003f, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r12v6 l.ᩴ֨᩻) = (r12v5 l.ᩴ֨᩻), (r12v4 l.ᩴ֨᩻), (r12v4 l.ᩴ֨᩻), (r12v4 l.ᩴ֨᩻), (r12v4 l.ᩴ֨᩻) binds: [B:50:0x01dc, B:31:0x00fa, B:15:0x0043, B:13:0x003f, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0215 A[PHI: r1
      0x0215: PHI (r1v4 l.ۙۙܺ) = (r1v3 l.ۙۙܺ), (r1v2 l.ۙۙܺ) binds: [B:54:0x0213, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM3169;
        int i;
        char[] cArr = null;
        C4670 c4670 = null;
        C2375 c2375 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1666050223;
        int i6 = C2354.f7599;
        int i7 = C3690.f12684;
        int iM2761 = C0619.m2761("ۚܽ") ^ i7;
        int i8 = ((iM2761 ^ i6) * 19455) ^ 717036841;
        int i9 = 1802930674;
        while (true) {
            int i10 = iM2761 ^ i9;
            C19484 c19484 = null;
            while (true) {
                i5 = ((((i5 ^ i6) * 6063) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2064139619:
                    case -1865426668:
                        f5481 = c4670;
                        f5483 = new C4670();
                        c2375 = new C2375();
                        f5482 = c2375;
                        if (AbstractC3624.m11755() == 0) {
                            c19484 = new C19484();
                            C0269.m1788(c2375, 4119, c19484);
                            C0269.m1788(c2375, o.a.d, c19484);
                            if (C2834.f9334 <= 0) {
                                iM3169 = (C0773.m3169("ۢ۫") ^ i7) * 109;
                                i8 = ((iM3169 ^ i6) * 16757) ^ (-2098990639);
                                i = 623364522;
                            } else {
                                iM3169 = C0773.m3169("ܽ᩸") ^ i6;
                                i8 = ((iM3169 ^ i7) * (-4085)) ^ 1367952675;
                                i = -995757111;
                            }
                            i10 = iM3169 ^ i;
                        }
                        break;
                    case -1808817573:
                    case -1379129739:
                        C2310.m7805(c2375, o.a.m, c19484);
                        C0269.m1788(c2375, o.a.f82055l, c19484);
                        i3 = o.a.p;
                        iM3169 = C0773.m3169("ۚ᩸") ^ i6;
                        i8 = ((iM3169 ^ i7) * 9795) ^ 27370919;
                        i = 952639149;
                        i10 = iM3169 ^ i;
                        break;
                    case -1576414662:
                    case 399878912:
                        C0269.m1788(c2375, 4153, c19484);
                        C2310.m7805(c2375, 4161, c19484);
                        C2310.m7805(c2375, 4160, c19484);
                        i2 = 4162;
                        if (C3448.f11240 >= 0) {
                            iM3169 = C0619.m2761("ܿۡ") ^ i7;
                            i8 = ((iM3169 ^ i6) * (-14949)) ^ 1490289088;
                            i = -807272850;
                        } else {
                            iM3169 = (i7 - C0619.m2761("ܺ۬")) * 21;
                            i8 = ((iM3169 ^ i6) * 3593) ^ 139910037;
                            i = 2142951771;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -1465320989:
                    case 843451982:
                        C2310.m7805(c2375, i3, c19484);
                        C2310.m7805(c2375, 4358, c19484);
                        if (!RunnableC0334.m2063()) {
                            iM3169 = C0619.m2761("ۙ᩺") ^ i7;
                            i8 = ((iM3169 ^ i6) * 23535) ^ (-1158087466);
                            i = 581428770;
                            i10 = iM3169 ^ i;
                        }
                        break;
                    case -1409178205:
                    case 1071937002:
                        if (C20932.f66974 > 0) {
                            iM3169 = (C0773.m3169("ۢ۫") ^ i7) * 109;
                            i8 = ((iM3169 ^ i6) * 16757) ^ (-2098990639);
                            i = 623364522;
                        } else {
                            iM3169 = C0773.m3169("ۧܺ") ^ i6;
                            i8 = ((iM3169 ^ i7) * 15139) ^ (-1621486752);
                            i = -2133081364;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -956448114:
                    case 1448850013:
                        C0269.m1788(c2375, i2, c19484);
                        C2310.m7805(c2375, 4151, c19484);
                        C0269.m1788(c2375, o.a.c, c19484);
                        if (C2834.f9334 > 0) {
                            iM3169 = (C0773.m3169("ۖۢ") ^ i6) * 25;
                            i8 = ((iM3169 ^ i7) * (-7325)) ^ (-1622213860);
                            i = 1166610296;
                            i10 = iM3169 ^ i;
                        }
                        break;
                    case -910332369:
                    case 2111259400:
                        C0269.m1788(c2375, i4, c19484);
                        C0269.m1788(c2375, 4144, c19484);
                        if (C2966.f9654 < 0) {
                            iM3169 = C0619.m2761("ۘܰ") ^ i6;
                            i8 = ((iM3169 ^ i7) * 17019) ^ 351244251;
                            i = -1817482987;
                            i10 = iM3169 ^ i;
                        }
                        break;
                    case -783865878:
                    case 475285891:
                        C2310.m7805(c2375, o.a.a, c19484);
                        C0269.m1788(c2375, 4136, c19484);
                        i4 = 4137;
                        iM3169 = C0773.m3169("᩵ۢ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-27569)) ^ 1506746932;
                        i = -306941547;
                        i10 = iM3169 ^ i;
                        break;
                    case -392289313:
                    case 1561304743:
                        C2354.m7983();
                        throw new RuntimeException();
                    case -189936993:
                    case 1032227:
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
                        f5484 = cArr;
                        c4670 = new C4670();
                        if (C2419.f7754 >= 0) {
                            iM3169 = C0773.m3169("ۧܺ") ^ i6;
                            i8 = ((iM3169 ^ i7) * 15139) ^ (-1621486752);
                            i = -2133081364;
                        } else {
                            iM3169 = (C0619.m2761("ۖ᩸") ^ i6) * (-119);
                            i8 = ((iM3169 ^ i7) * (-29275)) ^ 1840313635;
                            i = 1916532630;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -69372482:
                    case 63683549:
                        C0269.m1788(c2375, 4145, c19484);
                        C0269.m1788(c2375, 4116, c19484);
                        C2310.m7805(c2375, 4135, c19484);
                        C2310.m7805(c2375, 4197, c19484);
                        return;
                    case 280696399:
                    case 1850765190:
                        C2287.m7745();
                        iM3169 = (C0773.m3169("ۢ۫") ^ i7) * 109;
                        i8 = ((iM3169 ^ i6) * 16757) ^ (-2098990639);
                        i = 623364522;
                        i10 = iM3169 ^ i;
                        break;
                    case 355004971:
                    case 1505673803:
                        C3998.m12920();
                        if (C0269.m1775() <= 0) {
                            iM3169 = (C0773.m3169("ۢ۫") ^ i7) * 109;
                            i8 = ((iM3169 ^ i6) * 16757) ^ (-2098990639);
                            i = 623364522;
                        } else {
                            iM3169 = C0619.m2761("ܳܿ") ^ i7;
                            i8 = ((iM3169 ^ i6) * (-20733)) ^ (-1029800035);
                            i = -1829633361;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case 659792332:
                    case 1560128644:
                        C2310.m7805(c2375, o.a.k, c19484);
                        C2310.m7805(c2375, o.a.n, c19484);
                        if (C17202.m40372()) {
                            iM3169 = C0619.m2761("۠ۘ") ^ i7;
                            i8 = ((iM3169 ^ i6) * (-14889)) ^ (-1561450602);
                            i = -1824539411;
                        } else {
                            iM3169 = (C0773.m3169("ۢ۫") ^ i7) * 109;
                            i8 = ((iM3169 ^ i6) * 16757) ^ (-2098990639);
                            i = 623364522;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case 1081719416:
                    case 1422196866:
                        C0269.m1788(c2375, o.a.h, c19484);
                        C0269.m1788(c2375, o.a.e, c19484);
                        if (AbstractC0116.f1064 <= 0) {
                            iM3169 = C0619.m2761("ܳܿ") ^ i7;
                            i8 = ((iM3169 ^ i6) * (-20733)) ^ (-1029800035);
                            i = -1829633361;
                        } else {
                            iM3169 = (C0773.m3169("۫ۖ") + i7) * 79;
                            i8 = ((iM3169 ^ i6) * 25739) ^ (-736809443);
                            i = 2055265733;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case 1434784561:
                    case 1578180277:
                        f5480 = new Random();
                        cArr = new char[16];
                        if (!C0619.f2439) {
                            iM3169 = C0773.m3169("ܶ᩶") ^ i7;
                            i8 = ((iM3169 ^ i6) * 16967) ^ (-1950709204);
                            i = 1056734019;
                            i10 = iM3169 ^ i;
                        }
                        break;
                    default:
                        if (C2310.f7472 < 0) {
                        }
                        iM3169 = C0619.m2761("ܳܿ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-20733)) ^ (-1029800035);
                        i = -1829633361;
                        i10 = iM3169 ^ i;
                        break;
                }
            }
            iM2761 = C0619.m2761("ۜ۬") ^ i6;
            i8 = ((iM2761 ^ i7) * 4901) ^ 1674730624;
            i9 = -908193717;
        }
    }
}
