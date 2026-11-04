package l;

import android.app.Application;
import android.util.Base64;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۤۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E6NZ */
/* JADX INFO: loaded from: classes.dex */
public final class C10773 {

    /* JADX INFO: renamed from: ֫۟֫, reason: not valid java name and contains not printable characters */
    private static final short[] f34193;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f34194;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f34195;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int[] f34196;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C21962 f34197;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f34198;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f34199;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native String m27442(int[] iArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native C20348 m27444(C24084 c24084, int i, int[] iArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m27447(C0496 c0496, String str, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m27451(C24084 c24084);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m27452(C24084 c24084, int i, byte[] bArr, int[] iArr);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static native String m27456();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static native int[] m27461();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static native void m27464(C21962 c21962);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static native C21962 m27467();

    /* JADX WARN: Code duplicated, block: B:33:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x0250 A[PHI: r3 r4 r14 r21
      0x0250: PHI (r3v5 short[]) = (r3v1 short[]), (r3v1 short[]), (r3v2 short[]), (r3v1 short[]) binds: [B:56:0x024e, B:53:0x0224, B:20:0x00b7, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r4v5 short[]) = (r4v1 short[]), (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:56:0x024e, B:53:0x0224, B:20:0x00b7, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r14v5 int) = (r14v1 int), (r14v2 int), (r14v1 int), (r14v1 int) binds: [B:56:0x024e, B:53:0x0224, B:20:0x00b7, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r21v18 java.lang.String) = (r21v1 java.lang.String), (r21v15 java.lang.String), (r21v1 java.lang.String), (r21v1 java.lang.String) binds: [B:56:0x024e, B:53:0x0224, B:20:0x00b7, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        String strM6233;
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        String str;
        String str2;
        String str3;
        int i5;
        String str4;
        String str5;
        int i6;
        int i7;
        String str6;
        ApplicationC23172.m52091(96);
        f34193 = new short[]{1119, 17003, 17014, 17005, 17016, 17005, 17020, 17016, 17018, 17010, 17013, 17014, 17022, 17008, 17015, 17012, 17008, 17022, 17003, 17016, 17005, 17020, 2575, -32663, -32706, -32658, -32715, 7525, 6784, 6787, 6795, 6789, 6786, 6776, -19289, -19246, -19278, -19285, -19246, -19269, -19289, -19246, -19278, -19285, -19246, -19270, -19250, -19289, -19246, -19278, -19285, -19246, -19267, -19289, -19246, -19278, -19285, -19246, -19278, -19289, -19246, -19278, -19285, -19246, -19279, -19278, -19306, -19316, -19316, -19306, -19311, -19304, -19233, -19316, -19302, -19316, -19316, -19306, -19312, -19311, -19233, -19300, -19315, -19302, -19301, -19302, -19311, -19317, -19306, -19298, -19309, -19289, -19246, -19278, -19285, -19246, -19285, 8609, 377, 350, 326, 337, 348, 345, 340, 272, 323, 341, 323, 323, 345, 351, 350, 272, 343, 322, 337, 350, 324, 337, 339, 347, 355, 324, 337, 348, 341, 272, 323, 341, 323, 323, 345, 351, 350, 272, 343, 322, 337, 350, 324, 355, 341, 323, 323, 345, 351, 350, 272, 337, 339, 347, 350, 351, 327, 348, 341, 340, 343, 341, 349, 341, 350, 324, 272, 320, 341, 350, 340, 345, 350, 343, 7952, 180, 244, 255, 237, 62, -2099, -2065, -2080, -2080, -2079, -2054, -2130, -2069, -2080, -2067, -2052, -2057, -2050, -2054, -2130, -2078, -2079, -2067, -2065, -2078, -2130, -2067, -2052, -2069, -2070, -2069, -2080, -2054, -2073, -2065, -2078, -2130, -2070, -2065, -2054, -2065, -2110, -2079, -2067, -2065, -2078, -2130, -2067, -2052, -2069, -2070, -2069, -2080, -2054, -2073, -2065, -2078, -2130, -2070, -2065, -2054, -2065, -2130, -2054, -2079, -2079, -2130, -2078, -2065, -2052, -2071, -2069, 9894, 28451, 28533, 28449, 28529, 28455, 28528, 28448, 28539, 28452, 28534, 28454, 28538, 4697, -20198, -20147, -20140, -20211, -20156, -20155, -20138, -20151, -20157, -20155, -20198, -20155, -20206, -20158, -20199, -20159, -20201, -20157, -20205, -20159, -20146, -20156, -20142, -20145, -20151, -20156, -20097, -20151, -20156, -20101, -20208, -20211, -20199, -20159, -20211, -20154, -20127, -20211, -20122, -20099, -20133, -20207, -20212, -20207, -20202, -20131, -20199, -20201, -20201, -20204, -20156, -20203, -20202, -20156, -20202, -20200, -20206, -20155, -20203, -20204, -20199, -20157, -20208, -20213, 9822, 2592, 2594, 2602, 2611, 2606, 2613, 2592, 2613, 2596, 5343, 9205, 9127, 9207, 9131, 9202, 9124, 9200, 9120, 9206, 9121, 9201, 9130, 8450, -13013, -12931, -13015, -12935, 5991, 1791, 1705, 1789, 1709, 3234, -28061, -28107, -28063, -28111, -28057, -28112, -28064, -28101, -28060, -28106, -28058, -28102};
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i8 = C3099.f10023;
        int i9 = RunnableC3055.f9898;
        int iM31611 = C0773.m3169("ۖ۟") ^ i8;
        int i10 = ((iM31611 ^ i9) * 19481) ^ 1215136657;
        int i11 = iM31611 ^ 10490760;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1287671428;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i19 = 0;
        short s = 0;
        String str10 = null;
        while (true) {
            i18 = i11 ^ ((((i18 ^ i9) * 15057) >> 31) & i10);
            switch (i18) {
                case -2025591315:
                case -221999806:
                    str = str8;
                    str2 = str10;
                    String str11 = str9;
                    i5 = i19;
                    str4 = str7;
                    i14 = 6;
                    if (C4238.f15451 >= 0) {
                        str9 = str11;
                        i13 = 1;
                        int iM31612 = (C0773.m3169("֨ܿ") + i8) * (-3);
                        str7 = str4;
                        int i20 = ((iM31612 ^ i9) * 14963) ^ (-2106129589);
                        str8 = str;
                        iM3169 = iM31612;
                        i2 = -813545156;
                        String str12 = str2;
                        i = i20;
                        i19 = i5;
                        str10 = str12;
                    } else {
                        int iM2761 = (i8 - C0619.m2761("ܶۛ")) * 35;
                        int i21 = ((iM2761 ^ i9) * 8703) ^ 1849813197;
                        str8 = str;
                        str9 = str11;
                        iM3169 = iM2761;
                        i2 = -1900221096;
                        str7 = str4;
                        i19 = i5;
                        str10 = str2;
                        i = i21;
                        i13 = 1;
                    }
                    int i22 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i22;
                    break;
                case -2013086781:
                case -1735867627:
                    i7 = 16921;
                    int iM31613 = C0773.m3169("᩶ۚ") ^ i8;
                    str9 = str9;
                    i2 = -816881846;
                    i = ((iM31613 ^ i9) * 8757) ^ (-3979963);
                    i19 = i19;
                    str10 = str10;
                    str8 = str8;
                    iM3169 = iM31613;
                    int i23 = i7;
                    str7 = str7;
                    i12 = i23;
                    int i24 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i24;
                    break;
                case -1987419910:
                case -616727182:
                    i7 = 39302;
                    int iM31614 = C0773.m3169("᩶ۚ") ^ i8;
                    str9 = str9;
                    i2 = -816881846;
                    i = ((iM31614 ^ i9) * 8757) ^ (-3979963);
                    i19 = i19;
                    str10 = str10;
                    str8 = str8;
                    iM3169 = iM31614;
                    int i25 = i7;
                    str7 = str7;
                    i12 = i25;
                    int i26 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i26;
                    break;
                case -1935169763:
                case 427958692:
                    f34194 = new String[]{str8, str10, C2702.m8881(sArr4, 15, 7, i12), str9, str7};
                    return;
                case -1759600920:
                case 1139841651:
                    f34198 = new SecureRandom();
                    if (AbstractC3624.m11755() != 0) {
                        str = str8;
                        str2 = str10;
                        i5 = i19;
                        str4 = str7;
                        int iM31615 = (C0773.m3169("֨ܿ") + i8) * (-3);
                        str7 = str4;
                        int i27 = ((iM31615 ^ i9) * 14963) ^ (-2106129589);
                        str8 = str;
                        iM3169 = iM31615;
                        i2 = -813545156;
                        String str13 = str2;
                        i = i27;
                        i19 = i5;
                        str10 = str13;
                    } else {
                        iM3169 = C0773.m3169("᩻ᩳ") ^ i9;
                        i = ((iM3169 ^ i8) * 25347) ^ 1085287611;
                        i2 = -1375048825;
                    }
                    int i28 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i28;
                    break;
                case -1652281893:
                case 636449775:
                    String strM11252 = C3448.m11252(sArr, i13, i14, i12);
                    sArr2 = f34193;
                    i15 = 7;
                    if (C2287.f7432 >= 0) {
                        str9 = strM11252;
                        str = str8;
                        str2 = str10;
                        i5 = i19;
                        str4 = str7;
                        int iM31616 = (C0773.m3169("֨ܿ") + i8) * (-3);
                        str7 = str4;
                        int i29 = ((iM31616 ^ i9) * 14963) ^ (-2106129589);
                        str8 = str;
                        iM3169 = iM31616;
                        i2 = -813545156;
                        String str14 = str2;
                        i = i29;
                        i19 = i5;
                        str10 = str14;
                    } else {
                        int iM2762 = C0619.m2761("۫ۘ") ^ i8;
                        str9 = strM11252;
                        iM3169 = iM2762;
                        i = ((iM2762 ^ i9) * (-15657)) ^ 1533860795;
                        i2 = -1962433859;
                    }
                    int i210 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i210;
                    break;
                case -1621527537:
                case -558152266:
                    C1343.m4943();
                    C2354.m7983();
                    throw new RuntimeException();
                case -1058602795:
                case 149522983:
                    strM6233 = C1783.m6233(sArr3, i16, i19, i12);
                    sArr4 = f34193;
                    if (C0487.m2356() < 0) {
                        int iM2763 = C0619.m2761("ۚ᩷") ^ i9;
                        str10 = strM6233;
                        iM3169 = iM2763;
                        i = ((iM2763 ^ i8) * (-29693)) ^ (-1030874844);
                        i2 = 1723579972;
                        int i211 = iM3169 ^ i2;
                        i10 = i;
                        i11 = i211;
                    } else {
                        int iM31617 = (C0773.m3169("۬᩺") ^ i9) * (-3);
                        str10 = strM6233;
                        iM31610 = iM31617;
                        i3 = ((iM31617 ^ i8) * 6039) ^ 124145316;
                        i4 = -1906451936;
                        int i30 = iM31610 ^ i4;
                        str3 = str9;
                        str5 = str10;
                        i5 = i19;
                        i6 = i3;
                        i11 = i30;
                        str = str8;
                        str9 = str3;
                        i10 = i6;
                        i19 = i5;
                        str10 = str5;
                        str8 = str;
                    }
                    break;
                case -960879559:
                case 1522787426:
                    str6 = "";
                    sArr3 = f34193;
                    i16 = 10;
                    if (C23916.f77426 <= 0) {
                        int iM31618 = C0773.m3169("ۤ֡") ^ i8;
                        str8 = str6;
                        iM3169 = iM31618;
                        i = ((iM31618 ^ i9) * (-32515)) ^ (-1752788389);
                        i2 = 695251408;
                    } else {
                        int iM31619 = C0773.m3169("ۢܳ") ^ i9;
                        str8 = "";
                        iM3169 = iM31619;
                        i = ((iM31619 ^ i8) * 21129) ^ 1318300934;
                        i2 = 922701154;
                    }
                    int i212 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i212;
                    break;
                case -829342797:
                case 291763212:
                    int i31 = s * 12004;
                    if (C2023.f6737) {
                        i17 = i31;
                        strM6233 = str10;
                        int iM316110 = (C0773.m3169("۬᩺") ^ i9) * (-3);
                        str10 = strM6233;
                        iM31610 = iM316110;
                        i3 = ((iM316110 ^ i8) * 6039) ^ 124145316;
                        i4 = -1906451936;
                        int i32 = iM31610 ^ i4;
                        str3 = str9;
                        str5 = str10;
                        i5 = i19;
                        i6 = i3;
                        i11 = i32;
                        str = str8;
                        str9 = str3;
                        i10 = i6;
                        i19 = i5;
                        str10 = str5;
                        str8 = str;
                    } else {
                        int iM2764 = (C0619.m2761("ۗۡ") ^ i9) * 23;
                        i10 = ((iM2764 ^ i8) * 22503) ^ 1960125537;
                        i11 = iM2764 ^ 724490724;
                        i17 = i31;
                    }
                    break;
                case -805947838:
                case 2053801114:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("ۨ֫") ^ i8) * 55;
                        i = ((iM3169 ^ i9) * (-5347)) ^ (-1138130590);
                        i2 = 656302181;
                    } else {
                        iM3169 = (i9 - C0619.m2761("֡ܺ")) * (-97);
                        i = ((iM3169 ^ i8) * (-4985)) ^ 1046896763;
                        i2 = 7872597;
                    }
                    int i213 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i213;
                    break;
                case -749369994:
                case 562335380:
                    String strM9670 = C2966.m9670(sArr2, i15, 3, i12);
                    if (C1080.f3865 >= 0) {
                        str7 = strM9670;
                        str6 = str8;
                        int iM316111 = C0773.m3169("ۤ֡") ^ i8;
                        str8 = str6;
                        iM3169 = iM316111;
                        i = ((iM316111 ^ i9) * (-32515)) ^ (-1752788389);
                        i2 = 695251408;
                    } else {
                        int iM31620 = (C0773.m3169("ܿۛ") ^ i9) * (-35);
                        str7 = strM9670;
                        iM3169 = iM31620;
                        i = ((iM31620 ^ i8) * 19131) ^ (-554321103);
                        i2 = -1528149382;
                    }
                    int i214 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i214;
                    break;
                case -589076873:
                case 960493274:
                    i19 = 5;
                    if (RunnableC3646.m11813() != 0) {
                        str4 = str7;
                        str = str8;
                        str2 = str10;
                        i5 = 5;
                        int iM316112 = (C0773.m3169("֨ܿ") + i8) * (-3);
                        str7 = str4;
                        int i215 = ((iM316112 ^ i9) * 14963) ^ (-2106129589);
                        str8 = str;
                        iM3169 = iM316112;
                        i2 = -813545156;
                        String str15 = str2;
                        i = i215;
                        i19 = i5;
                        str10 = str15;
                    } else {
                        iM3169 = C0773.m3169("ۜۨ") ^ i8;
                        i = ((iM3169 ^ i9) * (-6019)) ^ 1685060004;
                        i2 = -1732959777;
                    }
                    int i216 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i216;
                    break;
                case -214603026:
                case 1142281051:
                    sArr = f34193;
                    if (C0619.m2763()) {
                        str = str8;
                        str2 = str10;
                        i5 = i19;
                        str4 = str7;
                        int iM316113 = (C0773.m3169("֨ܿ") + i8) * (-3);
                        str7 = str4;
                        int i217 = ((iM316113 ^ i9) * 14963) ^ (-2106129589);
                        str8 = str;
                        iM3169 = iM316113;
                        i2 = -813545156;
                        String str16 = str2;
                        i = i217;
                        i19 = i5;
                        str10 = str16;
                    } else {
                        iM3169 = (C0773.m3169("᩵ۗ") + i9) * 45;
                        i = ((iM3169 ^ i8) * (-10733)) ^ 44552503;
                        i2 = -1595208605;
                    }
                    int i218 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i218;
                    break;
                case 199422299:
                case 598134022:
                    int i33 = s + 3001;
                    if ((i33 * i33) - i17 < 0) {
                        iM31610 = C0773.m3169("᩻ۗ") ^ i9;
                        i3 = ((iM31610 ^ i8) * (-22657)) ^ (-823064630);
                        i4 = 824357194;
                        int i34 = iM31610 ^ i4;
                        str3 = str9;
                        str5 = str10;
                        i5 = i19;
                        i6 = i3;
                        i11 = i34;
                        str = str8;
                        str9 = str3;
                        i10 = i6;
                        i19 = i5;
                        str10 = str5;
                        str8 = str;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ܽ᩶")) * 39;
                        i = ((iM3169 ^ i9) * 30199) ^ 912254719;
                        i2 = -319475634;
                        int i219 = iM3169 ^ i2;
                        i10 = i;
                        i11 = i219;
                    }
                    break;
                case 711868019:
                case 1898090603:
                    C3734.m12152();
                    if (C23916.f77426 <= 0) {
                        strM6233 = str10;
                        int iM316114 = (C0773.m3169("۬᩺") ^ i9) * (-3);
                        str10 = strM6233;
                        iM31610 = iM316114;
                        i3 = ((iM316114 ^ i8) * 6039) ^ 124145316;
                        i4 = -1906451936;
                        int i35 = iM31610 ^ i4;
                        str3 = str9;
                        str5 = str10;
                        i5 = i19;
                        i6 = i3;
                        i11 = i35;
                        str = str8;
                        str9 = str3;
                        i10 = i6;
                        i19 = i5;
                        str10 = str5;
                        str8 = str;
                    } else {
                        iM3169 = (C0773.m3169("ۨ֫") ^ i8) * 55;
                        i = ((iM3169 ^ i9) * (-5347)) ^ (-1138130590);
                        i2 = 656302181;
                        int i2110 = iM3169 ^ i2;
                        i10 = i;
                        i11 = i2110;
                    }
                    break;
                case 948348309:
                case 1024311785:
                    C2310.m7813();
                    iM3169 = (C0773.m3169("ۨ֫") ^ i8) * 55;
                    i = ((iM3169 ^ i9) * (-5347)) ^ (-1138130590);
                    i2 = 656302181;
                    int i2111 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i2111;
                    break;
                case 1261646400:
                case 2032892862:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ۨ֫") ^ i8) * 55;
                        i = ((iM3169 ^ i9) * (-5347)) ^ (-1138130590);
                        i2 = 656302181;
                    } else {
                        str = str8;
                        str2 = str10;
                        i5 = i19;
                        str4 = str7;
                        int iM316115 = (C0773.m3169("֨ܿ") + i8) * (-3);
                        str7 = str4;
                        int i2112 = ((iM316115 ^ i9) * 14963) ^ (-2106129589);
                        str8 = str;
                        iM3169 = iM316115;
                        i2 = -813545156;
                        String str17 = str2;
                        i = i2112;
                        i19 = i5;
                        str10 = str17;
                    }
                    int i2113 = iM3169 ^ i2;
                    i10 = i;
                    i11 = i2113;
                    break;
                default:
                    str = str8;
                    str2 = str10;
                    str3 = str9;
                    i5 = i19;
                    str4 = str7;
                    s = f34193[0];
                    if (C20932.f66974 > 0) {
                        str7 = str4;
                        int iM2765 = C0619.m2761("ۤۙ") ^ i8;
                        str5 = str2;
                        i11 = iM2765 ^ 1228002047;
                        i6 = ((iM2765 ^ i9) * 27911) ^ (-1331320066);
                        s = s;
                        str9 = str3;
                        i10 = i6;
                        i19 = i5;
                        str10 = str5;
                        str8 = str;
                    } else {
                        str9 = str3;
                        int iM316116 = (C0773.m3169("֨ܿ") + i8) * (-3);
                        str7 = str4;
                        int i2114 = ((iM316116 ^ i9) * 14963) ^ (-2106129589);
                        str8 = str;
                        iM3169 = iM316116;
                        i2 = -813545156;
                        String str18 = str2;
                        i = i2114;
                        i19 = i5;
                        str10 = str18;
                        int i2115 = iM3169 ^ i2;
                        i10 = i;
                        i11 = i2115;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27448(C13778 c13778, String str) throws IOException {
        String str2 = null;
        int i = 1960315726;
        int i2 = C1519.f5300;
        int i3 = C1783.f6087;
        int iM2761 = (C0619.m2761("֨ۙ") + i2) * (-11);
        int i4 = ((iM2761 ^ i3) * (-32271)) ^ (-276003709);
        int i5 = -1818402645;
        while (true) {
            i = ((((i ^ i3) * 26171) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2134990238:
                case -357945196:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("ۨۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29069)) ^ 525769862;
                        i5 = -1731778022;
                    } else {
                        iM2761 = C0773.m3169("ۢܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29561) ^ 457589918;
                        i5 = 868518312;
                    }
                    break;
                case -1910004217:
                case -1890643068:
                    C1080.m4050();
                    if (!C1321.m4852()) {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11313)) ^ (-235541834);
                        i5 = 2037671337;
                    } else {
                        iM2761 = C0773.m3169("ۨۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29069)) ^ 525769862;
                        i5 = -1731778022;
                    }
                    break;
                case -1903594109:
                case -51952806:
                    if (C2702.m8876()) {
                        iM2761 = C0619.m2761("ۧ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16773) ^ (-225566211);
                        i5 = 267440856;
                    } else {
                        iM2761 = (C0619.m2761("ۚܳ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * 14315) ^ (-1865654309);
                        i5 = 971750893;
                    }
                    break;
                case -1395490719:
                case -213603005:
                    m27450(c13778, str, str2, true);
                    break;
                case -1308271905:
                case 1712784505:
                    if (C4282.m13644()) {
                        iM2761 = (C0773.m3169("֡ᩴ") ^ i2) * (-109);
                        i4 = ((iM2761 ^ i3) * (-30313)) ^ (-637430369);
                        i5 = -1026985985;
                    } else {
                        iM2761 = (C0619.m2761("ۚܳ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * 14315) ^ (-1865654309);
                        i5 = 971750893;
                    }
                    break;
                case -1132659775:
                case 2045787344:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ܳᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1267) ^ (-601312728);
                        i5 = 1364840344;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩻֫")) * 73;
                        i4 = ((iM2761 ^ i3) * 18027) ^ (-429739286);
                        i5 = -2144540763;
                    }
                    break;
                case -1115201719:
                case -127399438:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("᩵ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16597) ^ 1349874158;
                        i5 = 1257736789;
                    } else {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11313)) ^ (-235541834);
                        i5 = 2037671337;
                    }
                    break;
                case -1105850726:
                case 368926427:
                    str2 = null;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۚܳ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * 14315) ^ (-1865654309);
                        i5 = 971750893;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩹") ^ i3) * (-105);
                        i4 = ((iM2761 ^ i2) * (-24407)) ^ (-515128765);
                        i5 = 1019028391;
                    }
                    break;
                case -894497410:
                case -166028901:
                    if (C17202.m40372()) {
                        iM2761 = (C0619.m2761("ۛۜ") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * 3779) ^ 1662186325;
                        i5 = -950243103;
                    } else {
                        iM2761 = (C0619.m2761("ۚܳ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * 14315) ^ (-1865654309);
                        i5 = 971750893;
                    }
                    break;
                case -795959805:
                case 1089798815:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("᩵ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16597) ^ 1349874158;
                        i5 = 1257736789;
                    } else {
                        iM2761 = C0773.m3169("ۘ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13419) ^ 413248004;
                        i5 = 903106100;
                    }
                    break;
                case -140231844:
                case 12638368:
                    C3998.m12920();
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("ܳᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1267) ^ (-601312728);
                        i5 = 1364840344;
                    } else {
                        iM2761 = C0773.m3169("ۨۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29069)) ^ 525769862;
                        i5 = -1731778022;
                    }
                    break;
                case 583782888:
                case 597729043:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ܳᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1267) ^ (-601312728);
                        i5 = 1364840344;
                    } else {
                        iM2761 = (C0619.m2761("ܳۢ") ^ i2) * 83;
                        i4 = ((iM2761 ^ i3) * (-14807)) ^ 461878000;
                        i5 = 269964777;
                    }
                    break;
                case 603043143:
                case 960805784:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11313)) ^ (-235541834);
                        i5 = 2037671337;
                    } else {
                        iM2761 = C0619.m2761("ۡۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4995) ^ (-455831032);
                        i5 = 1771318013;
                    }
                    break;
                case 860042894:
                case 2112836688:
                    C4238.m13540();
                    iM2761 = C0773.m3169("ۨۧ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-29069)) ^ 525769862;
                    i5 = -1731778022;
                    break;
                case 1203332826:
                case 1397969182:
                    RunnableC0334.m2063();
                    break;
                default:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11313)) ^ (-235541834);
                        i5 = 2037671337;
                    } else {
                        iM2761 = C0773.m3169("ۧ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 14999) ^ (-1047217704);
                        i5 = 1774518377;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C24084 m27462(String str) {
        int i = -1773336466;
        int i2 = C3099.f10023;
        int i3 = C3033.f9831;
        int iM2761 = (C0619.m2761("᩺ۡ") ^ i2) * 31;
        int i4 = ((iM2761 ^ i3) * 30897) ^ 326599264;
        int i5 = 1638699702;
        while (true) {
            i = ((((i ^ i3) * (-20549)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1210420756:
                case -800395191:
                    if (C1343.m4943()) {
                        if (C2287.f7432 < 0) {
                            if (C0269.f1558 > 0 && C1146.f4234 < 0) {
                                if (C0862.f3233 == 0 && C1146.f4234 < 0) {
                                    if (C11235.f35427 >= 0) {
                                        iM2761 = C0773.m3169("ۗ֨") ^ i2;
                                        i4 = ((iM2761 ^ i3) * 21435) ^ (-1070413614);
                                        i5 = -1826806639;
                                        break;
                                    } else if (C1826.f6190 > 0) {
                                        if (C1321.f4751 < 0) {
                                            Application applicationM4856 = C1321.m4856();
                                            if (!RunnableC3646.f12471) {
                                                return new C24084(new File(applicationM4856.getNoBackupFilesDir(), str));
                                            }
                                        }
                                    }
                                }
                                iM2761 = C0619.m2761("֫᩶") ^ i3;
                                i4 = ((iM2761 ^ i2) * (-14549)) ^ (-204554892);
                                i5 = 692819825;
                                break;
                            }
                            iM2761 = C0619.m2761("᩵۫") ^ i2;
                            i4 = ((iM2761 ^ i3) * (-26757)) ^ 2022320351;
                            i5 = -2014773390;
                        } else {
                            iM2761 = C0773.m3169("ᩴܺ") ^ i3;
                            i4 = ((iM2761 ^ i2) * 10939) ^ 381093870;
                            i5 = -707220433;
                        }
                        break;
                    }
                    iM2761 = (C0773.m3169("ۢۘ") ^ i2) * 25;
                    i4 = ((iM2761 ^ i3) * (-2621)) ^ 427423238;
                    i5 = -269848526;
                    break;
                case -963150096:
                case 133783721:
                    if (!C3077.f9998) {
                        iM2761 = C0619.m2761("᩵۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26757)) ^ 2022320351;
                        i5 = -2014773390;
                    } else {
                        iM2761 = C0773.m3169("ᩴܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10939) ^ 381093870;
                        i5 = -707220433;
                    }
                    break;
                case -884013146:
                case 361797339:
                    if (!C1080.m4050()) {
                        iM2761 = C0619.m2761("֫᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14549)) ^ (-204554892);
                        i5 = 692819825;
                    } else {
                        iM2761 = C0773.m3169("ᩴܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10939) ^ 381093870;
                        i5 = -707220433;
                    }
                    break;
                case -541507870:
                case 1481830883:
                    C2310.m7813();
                    return null;
                case 548454986:
                case 1341110018:
                    C1564.m5509();
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = C0773.m3169("ۗ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21435) ^ (-1070413614);
                        i5 = -1826806639;
                    } else {
                        iM2761 = C0619.m2761("᩵۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26757)) ^ 2022320351;
                        i5 = -2014773390;
                    }
                    break;
                default:
                    C3734.m12152();
                    C2023.m6964();
                    iM2761 = C0619.m2761("᩵۫") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-26757)) ^ 2022320351;
                    i5 = -2014773390;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x034c  */
    /* JADX WARN: Code duplicated, block: B:104:0x037f  */
    /* JADX WARN: Code duplicated, block: B:108:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:112:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x044d  */
    /* JADX WARN: Code duplicated, block: B:128:0x047d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0203  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x0314 A[PHI: r3 r5
      0x0314: PHI (r3v3 long) = 
      (r3v2 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
     binds: [B:91:0x02fb, B:86:0x02d9, B:79:0x028a, B:76:0x0268, B:73:0x024b, B:70:0x023f, B:67:0x0223, B:43:0x010c, B:38:0x00e8, B:6:0x0038, B:136:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x0314: PHI (r5v3 int) = 
      (r5v1 int)
      (r5v2 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
     binds: [B:91:0x02fb, B:86:0x02d9, B:79:0x028a, B:76:0x0268, B:73:0x024b, B:70:0x023f, B:67:0x0223, B:43:0x010c, B:38:0x00e8, B:6:0x0038, B:136:0x0314] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m27457(C21962 c21962) throws C13517 {
        int iM3169;
        int i;
        int i2;
        C21962 c21963 = c21962;
        long j = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        int i4 = 0;
        String[] strArr = null;
        int i5 = 0;
        byte[] bArrDecode = null;
        int length = 0;
        boolean zM11490 = false;
        int i6 = 2038038451;
        int i7 = C2354.f7599;
        int i8 = C3033.f9831;
        int iM2761 = C0619.m2761("۬ᩳ") ^ i8;
        int i9 = ((iM2761 ^ i7) * 21759) ^ (-2013234944);
        int i10 = iM2761 ^ (-142733914);
        long j2 = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * 4297) >> 31));
            switch (i6) {
                case -2136838763:
                case -736067211:
                    if (zM11490) {
                        iM3169 = (i7 - C0773.m3169("֫ܰ")) * q.h;
                        i = ((iM3169 ^ i8) * 22045) ^ (-946526485);
                        i2 = -2107570262;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i11 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11;
                    break;
                case -2118887132:
                case -1336665553:
                    return;
                case -2114992129:
                case 1495322478:
                    if (C2966.m9671(c21963.f70888) <= 43) {
                        iM3169 = (C0619.m2761("ܽۧ") + i7) * (-45);
                        i = ((iM3169 ^ i8) * (-4683)) ^ 773982885;
                        i2 = 236488052;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i12 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i12;
                    break;
                case -2100613060:
                case 563073256:
                    C0619.m2763();
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("᩹ۢ") ^ i8) * 87;
                        i = ((iM3169 ^ i7) * (-12397)) ^ 1051846722;
                        i2 = 684475323;
                    } else {
                        iM3169 = (C0619.m2761("ۚܰ") + i7) * 33;
                        i = ((iM3169 ^ i8) * (-11987)) ^ 1296062957;
                        i2 = -597273349;
                    }
                    int i13 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i13;
                    break;
                case -2068223747:
                case 1594335531:
                    if (c21963.f70883 != j) {
                        iM3169 = C0773.m3169("ۘۧ") ^ i8;
                        i = ((iM3169 ^ i7) * (-27893)) ^ (-760888106);
                        i2 = -1224984629;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i14 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i14;
                    break;
                case -1983877965:
                case 1929488354:
                    if (C3779.m12264()) {
                        iM3169 = (C0773.m3169("ۖۘ") + i8) * 109;
                        i = ((iM3169 ^ i7) * 30667) ^ (-193155046);
                        i2 = 1320556167;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۢ") ^ i8) * 87;
                        i = ((iM3169 ^ i7) * (-12397)) ^ 1051846722;
                        i2 = 684475323;
                    }
                    int i15 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i15;
                    break;
                case -1982914636:
                case -483985563:
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ۨۚ") ^ i8;
                        i = ((iM3169 ^ i7) * (-13217)) ^ 101133312;
                        i2 = -146227739;
                    } else {
                        iM3169 = C0773.m3169("᩶᩵") ^ i7;
                        i = ((iM3169 ^ i8) * 16881) ^ 2029487841;
                        i2 = 313030419;
                    }
                    int i16 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i16;
                    break;
                case -1972791887:
                case -1082530019:
                    strArr = f34194;
                    if (i5 < strArr.length) {
                        iM3169 = C0619.m2761("ܺ᩹") ^ i8;
                        i = ((iM3169 ^ i7) * (-6059)) ^ 1875895576;
                        i2 = 1147773597;
                    } else {
                        iM3169 = C0773.m3169("ۖܰ") ^ i7;
                        i = ((iM3169 ^ i8) * 25249) ^ (-81574268);
                        i2 = -1563446225;
                    }
                    int i17 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i17;
                    break;
                case -1891934564:
                case -1665339478:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("۫ۜ") ^ i7;
                        i = ((iM3169 ^ i8) * 6341) ^ (-1377613076);
                        i2 = 2080048707;
                    } else {
                        iM3169 = (C0619.m2761("۠ܰ") ^ i8) * 69;
                        i = ((iM3169 ^ i7) * (-21153)) ^ (-332595583);
                        i2 = -1654532934;
                    }
                    int i18 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i18;
                    break;
                case -1863504678:
                case 1408200363:
                    if (C3077.m10045(c21963.f70884) <= 1024) {
                        iM3169 = C0619.m2761("ۡۘ") ^ i7;
                        i = ((iM3169 ^ i8) * (-28841)) ^ (-1806412641);
                        i2 = -1684302426;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i19 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i19;
                    break;
                case -1797957481:
                case 1005660888:
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("ۙܿ") ^ i7) * (-55);
                        i = ((iM3169 ^ i8) * 14783) ^ (-1935710257);
                        i2 = -1401612024;
                    } else {
                        iM3169 = C0773.m3169("ܰܿ") ^ i7;
                        i = ((iM3169 ^ i8) * (-28701)) ^ (-2094820448);
                        i2 = -842202574;
                    }
                    int i110 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i110;
                    break;
                case -1625106187:
                case 201015329:
                    if (C3077.m10045(c21963.f70885) <= 256) {
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i8;
                        i = ((iM3169 ^ i7) * 19607) ^ 1854919166;
                        i2 = -353816108;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i111 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i111;
                    break;
                case -1538850210:
                case 1612544880:
                    C2375.m8065();
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("۫ۜ") ^ i7;
                        i = ((iM3169 ^ i8) * 6341) ^ (-1377613076);
                        i2 = 2080048707;
                    } else {
                        iM3169 = (C0773.m3169("ۘ᩻") + i7) * 85;
                        i = ((iM3169 ^ i8) * 26801) ^ (-1722444357);
                        i2 = -2032040960;
                    }
                    int i112 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i112;
                    break;
                case -1515404344:
                case 413327115:
                    long j3 = c21963.f70883;
                    if (C2485.f7950 != 0) {
                        j2 = j3;
                        iM3169 = C0773.m3169("᩶᩵") ^ i7;
                        i = ((iM3169 ^ i8) * 16881) ^ 2029487841;
                        i2 = 313030419;
                        int i113 = i;
                        i10 = iM3169 ^ i2;
                        i9 = i113;
                    } else {
                        int iM31610 = C0773.m3169("ۘ۬") ^ i7;
                        j2 = j3;
                        i10 = iM31610 ^ (-1516181172);
                        i9 = ((iM31610 ^ i8) * (-15773)) ^ 982046696;
                        c21963 = c21962;
                    }
                    break;
                case -1468170324:
                case 1075567901:
                    AbstractC0641.m2813();
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ۙܿ") ^ i7) * (-55);
                        i = ((iM3169 ^ i8) * 14783) ^ (-1935710257);
                        i2 = -1401612024;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۘ") ^ i8) * (-123);
                        i = ((iM3169 ^ i7) * (-20001)) ^ 1677006211;
                        i2 = 74269487;
                    }
                    int i114 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i114;
                    break;
                case -1414169784:
                case 1917857977:
                    if (C3492.m11490(strArr[i5], str)) {
                        iM3169 = (C0773.m3169("ᩳ᩵") ^ i7) * (-51);
                        i = ((iM3169 ^ i8) * (-11859)) ^ 232290027;
                        i2 = -1114835986;
                    } else {
                        iM3169 = C0773.m3169("ۘۨ") ^ i8;
                        i = ((iM3169 ^ i7) * 12347) ^ (-268407833);
                        i2 = 415541654;
                    }
                    int i115 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i115;
                    break;
                case -1407356834:
                case 1731769395:
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = (C0773.m3169("ۘ᩻") + i7) * 85;
                        i = ((iM3169 ^ i8) * 26801) ^ (-1722444357);
                        i2 = -2032040960;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩸") ^ i8;
                        i = ((iM3169 ^ i7) * (-26769)) ^ 670087500;
                        i2 = 1268281200;
                    }
                    int i116 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i116;
                    break;
                case -1394553622:
                case 901790664:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("۫ۜ") ^ i7;
                        i = ((iM3169 ^ i8) * 6341) ^ (-1377613076);
                        i2 = 2080048707;
                    } else {
                        iM3169 = C0773.m3169("ܶۘ") ^ i8;
                        i = ((iM3169 ^ i7) * 21351) ^ (-717653977);
                        i2 = 242658265;
                    }
                    int i117 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i117;
                    break;
                case -1365718857:
                case -849474235:
                    throw new C13517();
                case -1348097698:
                case -508924399:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ۙܿ") ^ i7) * (-55);
                        i = ((iM3169 ^ i8) * 14783) ^ (-1935710257);
                        i2 = -1401612024;
                    } else {
                        iM3169 = (C0773.m3169("֨ۙ") + i7) * (-121);
                        i = ((iM3169 ^ i8) * 6729) ^ (-2078560733);
                        i2 = 1300104027;
                    }
                    int i118 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i118;
                    break;
                case -1322713502:
                case -1146998820:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("ۘ᩻") + i7) * 85;
                        i = ((iM3169 ^ i8) * 26801) ^ (-1722444357);
                        i2 = -2032040960;
                    } else {
                        iM3169 = C0773.m3169("ܳ᩹") ^ i7;
                        i = ((iM3169 ^ i8) * (-16479)) ^ (-1833281370);
                        i2 = -2014565557;
                    }
                    int i119 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i119;
                    break;
                case -1248083014:
                case 340247126:
                    i3 = c21963.f70882;
                    if (i3 >= 1) {
                        iM3169 = C0773.m3169("۬ܶ") ^ i8;
                        i = ((iM3169 ^ i7) * (-19001)) ^ (-789065610);
                        i2 = 253256247;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i1110 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1110;
                    break;
                case -757775665:
                case -38666485:
                    try {
                        zM11490 = C3492.m11490(str2, Base64.encodeToString(bArrDecode, i4));
                        iM3169 = C0619.m2761("᩹ܽ") ^ i8;
                        i = ((iM3169 ^ i7) * (-27239)) ^ 674959182;
                        i2 = 1006606651;
                    } catch (IllegalArgumentException unused) {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i1111 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1111;
                    break;
                case -639952503:
                case 576159909:
                    if (C1564.m5512(c21963.f70886)) {
                        iM3169 = C0773.m3169("ۘۧ") ^ i8;
                        i = ((iM3169 ^ i7) * (-27893)) ^ (-760888106);
                        i2 = -1224984629;
                    } else {
                        iM3169 = C0773.m3169("֫ۙ") ^ i7;
                        i = ((iM3169 ^ i8) * 19147) ^ 728737560;
                        i2 = 2144549351;
                    }
                    int i1112 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1112;
                    break;
                case -623161755:
                case -149401300:
                    i5++;
                    iM3169 = C0619.m2761("֫ۡ") ^ i8;
                    i = ((iM3169 ^ i7) * (-27881)) ^ 506242520;
                    i2 = 1353019937;
                    int i1113 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1113;
                    break;
                case -520384481:
                case -51750187:
                    str = c21963.f70889;
                    i5 = 0;
                    iM3169 = C0619.m2761("֫ۡ") ^ i8;
                    i = ((iM3169 ^ i7) * (-27881)) ^ 506242520;
                    i2 = 1353019937;
                    int i1114 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1114;
                    break;
                case -516883769:
                case 395107197:
                    C2354.m7983();
                    if (C0950.f3488 < 0) {
                        iM3169 = C0773.m3169("ᩴ᩸") ^ i8;
                        i = ((iM3169 ^ i7) * (-26769)) ^ 670087500;
                        i2 = 1268281200;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۢ") ^ i8) * 87;
                        i = ((iM3169 ^ i7) * (-12397)) ^ 1051846722;
                        i2 = 684475323;
                    }
                    int i1115 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1115;
                    break;
                case -371069210:
                case 1093682553:
                    C3099.m10095();
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0773.m3169("ۙܿ") ^ i7) * (-55);
                        i = ((iM3169 ^ i8) * 14783) ^ (-1935710257);
                        i2 = -1401612024;
                    } else {
                        iM3169 = C0619.m2761("۫ۜ") ^ i7;
                        i = ((iM3169 ^ i8) * 6341) ^ (-1377613076);
                        i2 = 2080048707;
                    }
                    int i1116 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1116;
                    break;
                case -362379844:
                case 1208990290:
                    bArrDecode = Base64.decode(str2, i4);
                    length = bArrDecode.length;
                    iM3169 = C0619.m2761("֫۟") ^ i7;
                    i = ((iM3169 ^ i8) * 10403) ^ (-336476306);
                    i2 = -205684540;
                    int i1117 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1117;
                    break;
                case -342109566:
                case 1172632889:
                    C3033.m9845();
                    C3033.m9845();
                    iM3169 = (C0773.m3169("ۙܿ") ^ i7) * (-55);
                    i = ((iM3169 ^ i8) * 14783) ^ (-1935710257);
                    i2 = -1401612024;
                    int i1118 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1118;
                    break;
                case -273447175:
                case 184576861:
                    if (m27458(c21963.f70886)) {
                        iM3169 = (C0773.m3169("᩸۬") ^ i8) * 73;
                        i = ((iM3169 ^ i7) * 21287) ^ (-553229308);
                        i2 = 966375013;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i1119 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i1119;
                    break;
                case -161939373:
                case 437736441:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("᩻ۘ") ^ i8) * (-123);
                        i = ((iM3169 ^ i7) * (-20001)) ^ 1677006211;
                        i2 = 74269487;
                    } else {
                        iM3169 = (C0619.m2761("۟ܽ") + i7) * (-25);
                        i = ((iM3169 ^ i8) * 4269) ^ (-1017941639);
                        i2 = 1866895702;
                    }
                    int i11110 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11110;
                    break;
                case -41442457:
                case 1762845326:
                    str2 = c21963.f70888;
                    i4 = 11;
                    iM3169 = (i7 - C0619.m2761("ᩳۡ")) * 95;
                    i = ((iM3169 ^ i8) * (-24751)) ^ (-11911302);
                    i2 = -629210196;
                    int i11111 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11111;
                    break;
                case 87448605:
                case 1075253660:
                    if (C2878.m9480(c21963.f70888)) {
                        iM3169 = (i7 - C0773.m3169("֫ܰ")) * q.h;
                        i = ((iM3169 ^ i8) * 22045) ^ (-946526485);
                        i2 = -2107570262;
                    } else {
                        iM3169 = C0619.m2761("᩵ۨ") ^ i8;
                        i = ((iM3169 ^ i7) * 27495) ^ (-694596714);
                        i2 = -2033321417;
                    }
                    int i11112 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11112;
                    break;
                case 231762913:
                case 1993600239:
                    C3998.m12920();
                    if (C3448.m11248() == 0) {
                        iM3169 = C0619.m2761("۫ۜ") ^ i7;
                        i = ((iM3169 ^ i8) * 6341) ^ (-1377613076);
                        i2 = 2080048707;
                    } else {
                        iM3169 = (C0619.m2761("ۡ۬") + i8) * (-97);
                        i = ((iM3169 ^ i7) * 1635) ^ (-805336530);
                        i2 = -190644563;
                    }
                    int i11113 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11113;
                    break;
                case 248126869:
                case 1464321102:
                    C0619.m2763();
                    C20932.m47848();
                    return;
                case 412369597:
                case 443390597:
                    j = 0;
                    if (j2 >= 0) {
                        iM3169 = (C0773.m3169("۟᩹") + i7) * (-59);
                        i = ((iM3169 ^ i8) * (-29935)) ^ 106058612;
                        i2 = -1377740572;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i11114 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11114;
                    break;
                case 818664434:
                case 1571679661:
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("֫ۛ") ^ i8;
                        i = ((iM3169 ^ i7) * (-32535)) ^ 244604395;
                        i2 = -1663225128;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩸") ^ i8;
                        i = ((iM3169 ^ i7) * (-26769)) ^ 670087500;
                        i2 = 1268281200;
                    }
                    int i11115 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11115;
                    break;
                case 850355877:
                case 1672332545:
                    throw new C13517();
                case 933565125:
                case 1873692027:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ۘ᩻") + i7) * 85;
                        i = ((iM3169 ^ i8) * 26801) ^ (-1722444357);
                        i2 = -2032040960;
                    } else {
                        iM3169 = C0619.m2761("۬۟") ^ i7;
                        i = ((iM3169 ^ i8) * 24631) ^ (-1575300347);
                        i2 = -1971878118;
                    }
                    int i11116 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11116;
                    break;
                case 1170082404:
                case 1675444160:
                    if (length == 32) {
                        iM3169 = C0619.m2761("۬ۧ") ^ i8;
                        i = ((iM3169 ^ i7) * (-3009)) ^ (-1131581125);
                        i2 = 1024048158;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i11117 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11117;
                    break;
                default:
                    if (i3 <= 255) {
                        iM3169 = (C0773.m3169("᩶᩶") + i7) * 99;
                        i = ((iM3169 ^ i8) * (-16665)) ^ 524826906;
                        i2 = -197351851;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩴ") + i8) * (-93);
                        i = ((iM3169 ^ i7) * 25469) ^ 363667258;
                        i2 = 1916072271;
                    }
                    int i11118 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11118;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27453(C24084 c24084, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamM53636 = null;
        IOException e = null;
        boolean zEquals = false;
        int i = -1383574535;
        int i2 = C4238.f15451;
        int i3 = RunnableC3055.f9898;
        int iM2761 = C0619.m2761("ۧ᩶") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-8389)) ^ 215709107;
        int i5 = -505335429;
        while (true) {
            i = ((((i ^ i3) * (-22789)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1987007738:
                case 1259407747:
                    if (C1146.m4231()) {
                        iM2761 = C0619.m2761("ۙۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22313) ^ (-479268998);
                        i5 = -284245743;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ᩺") ^ i3) * (-31);
                        i4 = ((iM2761 ^ i2) * (-31715)) ^ 1536218489;
                        i5 = 1939544675;
                    }
                    break;
                case -1974002921:
                case -1882565568:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ܽܰ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-25853)) ^ 167571485;
                        i5 = -2022265457;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17213)) ^ 2004350597;
                        i5 = -2061749508;
                    }
                    break;
                case -1804594214:
                case 1311262361:
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = (C0773.m3169("ۖۨ") ^ i3) * 85;
                        i4 = ((iM2761 ^ i2) * (-16463)) ^ 1423091567;
                        i5 = -1546696235;
                    } else {
                        iM2761 = (C0619.m2761("ۧ֫") + i2) * (-101);
                        i4 = ((iM2761 ^ i3) * (-12563)) ^ (-1233127262);
                        i5 = -1708631447;
                    }
                    break;
                case -1654372154:
                case -1653300683:
                    if (C13473.m33144()) {
                        iM2761 = C0773.m3169("ۤۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17423) ^ 199197720;
                        i5 = 1219335383;
                    } else {
                        iM2761 = C0619.m2761("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26895)) ^ (-2058038791);
                        i5 = 1375885522;
                    }
                    break;
                case -1599371735:
                case -1520423776:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26895)) ^ (-2058038791);
                        i5 = 1375885522;
                    } else {
                        iM2761 = C0773.m3169("ۜۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10893)) ^ 1966161778;
                        i5 = 1792596557;
                    }
                    break;
                case -1565409498:
                case 1232702870:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۙۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22313) ^ (-479268998);
                        i5 = -284245743;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩵ۙ")) * (-111);
                        i4 = ((iM2761 ^ i2) * (-23613)) ^ 95053874;
                        i5 = 531677076;
                    }
                    break;
                case -1342361649:
                case 1072072349:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۙۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22313) ^ (-479268998);
                        i5 = -284245743;
                    } else {
                        iM2761 = C0773.m3169("᩷ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9769)) ^ 278462252;
                        i5 = 1021517166;
                    }
                    break;
                case -1034981948:
                case 2144136631:
                    throw new IOException();
                case -709655903:
                case 60072007:
                    C4238.m13540();
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0619.m2761("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26895)) ^ (-2058038791);
                        i5 = 1375885522;
                    } else {
                        iM2761 = (C0619.m2761("ܺ֫") ^ i3) * (-105);
                        i4 = ((iM2761 ^ i2) * 26011) ^ (-668859481);
                        i5 = 1524043370;
                    }
                    break;
                case -457864391:
                case 31853759:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("ۙۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22313) ^ (-479268998);
                        i5 = -284245743;
                    } else {
                        iM2761 = (C0773.m3169("ۖۨ") ^ i3) * 85;
                        i4 = ((iM2761 ^ i2) * (-16463)) ^ 1423091567;
                        i5 = -1546696235;
                    }
                    break;
                case -371336400:
                case 1411421863:
                    if (C0862.m3503()) {
                        iM2761 = C0619.m2761("᩸ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26279) ^ (-1766296855);
                        i5 = 735066900;
                    } else {
                        iM2761 = (C0773.m3169("ۖۨ") ^ i3) * 85;
                        i4 = ((iM2761 ^ i2) * (-16463)) ^ 1423091567;
                        i5 = -1546696235;
                    }
                    break;
                case -340402365:
                case 412370011:
                    C1519.m5403();
                    return;
                case -242756195:
                case 1634204436:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ܽܰ") + i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-25853)) ^ 167571485;
                        i5 = -2022265457;
                    } else {
                        iM2761 = (C0619.m2761("᩷۬") ^ i2) * (-101);
                        i4 = ((iM2761 ^ i3) * (-10135)) ^ (-331515244);
                        i5 = -1047408353;
                    }
                    break;
                case -205430783:
                case 1028940919:
                    c24084.m53634(fileOutputStreamM53636);
                    throw e;
                case -163793352:
                case 789133644:
                    return;
                case 84923962:
                case 1862287224:
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("֨᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11347)) ^ 1437360997;
                        i5 = -123751837;
                    } else {
                        iM2761 = C0619.m2761("ۙۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22313) ^ (-479268998);
                        i5 = -284245743;
                    }
                    break;
                case 85126583:
                case 471951914:
                    C2288.m7767();
                    iM2761 = (C0773.m3169("ۖۨ") ^ i3) * 85;
                    i4 = ((iM2761 ^ i2) * (-16463)) ^ 1423091567;
                    i5 = -1546696235;
                    break;
                case 325976376:
                case 1465318461:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26895)) ^ (-2058038791);
                        i5 = 1375885522;
                    } else {
                        iM2761 = C0619.m2761("ᩳ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8681)) ^ 1637520733;
                        i5 = 1172477487;
                    }
                    break;
                case 728277003:
                case 1179151247:
                    fileOutputStreamM53636 = c24084.m53636();
                    iM2761 = (C0773.m3169("ᩳܺ") ^ i3) * (-101);
                    i4 = ((iM2761 ^ i2) * 7081) ^ 2050093903;
                    i5 = -523445124;
                    break;
                case 1042783403:
                case 1937141110:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ۖۨ") ^ i3) * 85;
                        i4 = ((iM2761 ^ i2) * (-16463)) ^ 1423091567;
                        i5 = -1546696235;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩶۬")) * 17;
                        i4 = ((iM2761 ^ i2) * (-11299)) ^ (-1917691236);
                        i5 = 1651005982;
                    }
                    break;
                case 1102618573:
                case 1977743066:
                    try {
                        fileOutputStreamM53636.write(bArr);
                        fileOutputStreamM53636.getFD().sync();
                        c24084.m53639(fileOutputStreamM53636);
                        zEquals = Arrays.equals(bArr, c24084.m53637());
                        iM2761 = (C0773.m3169("ۤ᩻") ^ i2) * 81;
                        i4 = ((iM2761 ^ i3) * 15537) ^ 753389879;
                        i5 = -1752692621;
                    } catch (IOException e2) {
                        e = e2;
                        iM2761 = (C0773.m3169("۠ۛ") + i2) * (-69);
                        i4 = ((iM2761 ^ i3) * 29149) ^ (-126562594);
                        i5 = 866146637;
                    }
                    break;
                case 1202714861:
                case 1932667168:
                    if (zEquals) {
                        iM2761 = C0619.m2761("ۗۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9071)) ^ (-1213222077);
                        i5 = 1082872315;
                    } else {
                        iM2761 = C0619.m2761("ۚ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31921)) ^ (-1400730942);
                        i5 = 676544786;
                    }
                    break;
                default:
                    C1826.m6301();
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("ۙ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26895)) ^ (-2058038791);
                        i5 = 1375885522;
                    } else {
                        iM2761 = (C0773.m3169("ۖۨ") ^ i3) * 85;
                        i4 = ((iM2761 ^ i2) * (-16463)) ^ 1423091567;
                        i5 = -1546696235;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00da A[PHI: r4
      0x00da: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:38:0x00d8, B:30:0x009c, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x012a A[PHI: r2
      0x012a: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:46:0x0128, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x015c A[PHI: r1
      0x015c: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:50:0x015a, B:34:0x00b9, B:26:0x007e, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x018f A[PHI: r3
      0x018f: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:54:0x018d, B:42:0x0108, B:16:0x0045, B:14:0x0041, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21962 m27445(C21962 c21962) {
        int iM3169;
        int i;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        int i3 = 1736198659;
        int i4 = C1542.f5343;
        int i5 = RunnableC0334.f1808;
        int iM31610 = C0773.m3169("᩵ۖ") ^ i5;
        int i6 = ((iM31610 ^ i4) * (-14459)) ^ (-1168781217);
        int i7 = -1411168439;
        while (true) {
            int i8 = iM31610 ^ i7;
            C21962 c21963 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 32441) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2139846358:
                    case -1835810470:
                        if (C2375.f7641 <= 0) {
                        }
                        iM3169 = (i4 - C0619.m2761("᩻۟")) * 47;
                        i6 = ((iM3169 ^ i5) * (-19897)) ^ (-1182654918);
                        i = -1471820973;
                        i8 = iM3169 ^ i;
                        break;
                    case -2086626664:
                    case 1966567012:
                        C3998.m12920();
                        C20932.m47848();
                        iM3169 = (i4 - C0619.m2761("᩻۟")) * 47;
                        i6 = ((iM3169 ^ i5) * (-19897)) ^ (-1182654918);
                        i = -1471820973;
                        i8 = iM3169 ^ i;
                        break;
                    case -1955511815:
                    case -94147878:
                        str = c21962.f70886;
                        if (C1564.f5401 <= 0) {
                            iM3169 = (i4 - C0619.m2761("֫ᩳ")) * q.h;
                            i6 = ((iM3169 ^ i5) * 21599) ^ (-132859755);
                            i = 1412208350;
                        } else {
                            iM3169 = C0773.m3169("ۜܺ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-31437)) ^ 880396605;
                            i = -1416714021;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1936789838:
                    case -1637907833:
                        if (C3492.f12043 > 0) {
                            c21963 = new C21962();
                            if (c21962 == null) {
                                iM3169 = (C0773.m3169("ܿܺ") ^ i5) * 57;
                                i6 = ((iM3169 ^ i4) * (-12987)) ^ (-754795690);
                                i = 1175829713;
                            } else {
                                iM3169 = C0773.m3169("۠ۨ") ^ i5;
                                i6 = ((iM3169 ^ i4) * (-16249)) ^ 1225045888;
                                i = -1530349802;
                            }
                            i8 = iM3169 ^ i;
                        }
                        break;
                    case -1854433839:
                    case -121779268:
                        c21963.f70883 = c21962.f70883;
                        if (RunnableC1848.f6235) {
                            iM3169 = (i4 - C0619.m2761("᩻۟")) * 47;
                            i6 = ((iM3169 ^ i5) * (-19897)) ^ (-1182654918);
                            i = -1471820973;
                        } else {
                            iM3169 = C0773.m3169("֨۫") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-28393)) ^ (-875377341);
                            i = -1039124586;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1640919606:
                    case 1644894416:
                        c21963.f70886 = str;
                        i2 = c21962.f70882;
                        if (C3998.m12920()) {
                            iM3169 = (C0773.m3169("ۧ۫") + i4) * (-35);
                            i6 = ((iM3169 ^ i5) * (-4885)) ^ (-1167142579);
                            i = 1021113698;
                        } else {
                            iM3169 = (C0773.m3169("ܿ᩺") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM3169 ^ i5) * (-15883)) ^ 1243906004;
                            i = -531908129;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1593056614:
                    case -1295161572:
                        C0773.m3161();
                        if (C2375.m8065() <= 0) {
                            iM3169 = (i4 - C0619.m2761("᩻۟")) * 47;
                            i6 = ((iM3169 ^ i5) * (-19897)) ^ (-1182654918);
                            i = -1471820973;
                        } else {
                            iM3169 = (C0773.m3169("ܿ᩺") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM3169 ^ i5) * (-15883)) ^ 1243906004;
                            i = -531908129;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1458079903:
                    case 1975172839:
                        c21963.f70888 = str2;
                        if (C3998.f13671 != 0) {
                            iM3169 = C0619.m2761("۫ܺ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-10221)) ^ (-2091809046);
                            i = 2022950726;
                        } else {
                            iM3169 = C0773.m3169("ᩳܽ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 7923) ^ 930725882;
                            i = 1854796266;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1082418072:
                    case 1294787622:
                        C1321.m4852();
                        if (C0862.f3233 == 0) {
                        }
                        iM3169 = (i4 - C0619.m2761("֫ᩳ")) * q.h;
                        i6 = ((iM3169 ^ i5) * 21599) ^ (-132859755);
                        i = 1412208350;
                        i8 = iM3169 ^ i;
                        break;
                    case -883395662:
                    case -704480630:
                        c21963.f70882 = i2;
                        str2 = c21962.f70888;
                        if (C11235.f35427 >= 0) {
                            iM3169 = (i4 - C0619.m2761("᩻۟")) * 47;
                            i6 = ((iM3169 ^ i5) * (-19897)) ^ (-1182654918);
                            i = -1471820973;
                        } else {
                            iM3169 = C0773.m3169("ܺܳ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-32715)) ^ (-1315187804);
                            i = 1021024754;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -803240885:
                    case -149337392:
                        C3033.m9845();
                        return null;
                    case -708960342:
                    case -471913881:
                        str3 = c21962.f70884;
                        if (C3492.f12043 <= 0) {
                            iM3169 = C0619.m2761("۫ܺ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-10221)) ^ (-2091809046);
                            i = 2022950726;
                        } else {
                            iM3169 = C0773.m3169("ܿ۬") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-7071)) ^ (-1497585682);
                            i = 582577329;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -635052806:
                    case 1182321816:
                        c21963.f70887 = c21962.f70887;
                        return c21963;
                    case 3309630:
                    case 1529951247:
                        c21963.f70889 = c21962.f70889;
                        if (C3077.f9998) {
                            iM3169 = (i4 - C0773.m3169("ۙۚ")) * 39;
                            i6 = ((iM3169 ^ i5) * (-3303)) ^ 1065462879;
                            i = -126027001;
                        } else {
                            iM3169 = (i4 - C0619.m2761("֫ᩳ")) * q.h;
                            i6 = ((iM3169 ^ i5) * 21599) ^ (-132859755);
                            i = 1412208350;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 386299379:
                    case 1091733683:
                        c21963.f70884 = str3;
                        if (C4282.f15546 <= 0) {
                            iM3169 = (i4 - C0619.m2761("֫ᩳ")) * q.h;
                            i6 = ((iM3169 ^ i5) * 21599) ^ (-132859755);
                            i = 1412208350;
                        } else {
                            iM3169 = (C0619.m2761("ᩳ֡") + i5) * (-127);
                            i6 = ((iM3169 ^ i4) * 12733) ^ 554928967;
                            i = 521755267;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 1137176564:
                    case 1262375774:
                        c21963.f70885 = c21962.f70885;
                        if (C2702.m8876()) {
                            iM3169 = (i4 - C0773.m3169("ۚۨ")) * (-105);
                            i6 = ((iM3169 ^ i5) * 3225) ^ (-1669743081);
                            i = 1030224904;
                        } else {
                            iM3169 = C0619.m2761("۫ܺ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-10221)) ^ (-2091809046);
                            i = 2022950726;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    default:
                        return c21963;
                }
            }
            iM31610 = C0619.m2761("ۛ᩶") ^ i5;
            i6 = ((iM31610 ^ i4) * (-8583)) ^ 2120986334;
            i7 = -2022541528;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m27459() {
        byte[] bArr = null;
        SecureRandom secureRandom = null;
        int i = 181549374;
        int i2 = C0773.f2792;
        int i3 = C11235.f35427;
        int iM2761 = C0619.m2761("ۧۛ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-4983)) ^ 448904824;
        int i5 = -730703930;
        while (true) {
            i = ((((i ^ i2) * 30753) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2119614793:
                case 451284285:
                    C4238.m13540();
                    C2878.m9491();
                    iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 31667) ^ (-1709161317);
                    i5 = -1578915717;
                    break;
                case -1790336800:
                case -679247881:
                    secureRandom.nextBytes(bArr);
                    return Base64.encodeToString(bArr, 11);
                case -1706652874:
                case -1241353458:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31667) ^ (-1709161317);
                        i5 = -1578915717;
                    } else {
                        iM2761 = C0619.m2761("ۧܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5543)) ^ 2028206577;
                        i5 = -1657937993;
                    }
                    break;
                case -1699144168:
                case -158403787:
                    RunnableC0334.m2063();
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31667) ^ (-1709161317);
                        i5 = -1578915717;
                    } else {
                        iM2761 = C0773.m3169("ۘ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9013)) ^ (-696089018);
                        i5 = -1206492047;
                    }
                    break;
                case -1657696493:
                case 855810177:
                    RunnableC3055.m9933();
                    C0950.m3785();
                    return null;
                case -1517135389:
                case 1943836315:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("۫᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21229) ^ 515087930;
                        i5 = 396505972;
                    } else {
                        iM2761 = C0619.m2761("᩺ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 573) ^ 1366989608;
                        i5 = -996200438;
                    }
                    break;
                case -1125574062:
                case 1698478902:
                    C2702.m8876();
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("᩺۫") ^ i3) * (-83);
                        i4 = ((iM2761 ^ i2) * (-30555)) ^ 1663791397;
                        i5 = -1752895756;
                    } else {
                        iM2761 = C0773.m3169("ۘ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9013)) ^ (-696089018);
                        i5 = -1206492047;
                    }
                    break;
                case -1070559747:
                case 1023545495:
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31667) ^ (-1709161317);
                        i5 = -1578915717;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩵ܳ")) * (-91);
                        i4 = ((iM2761 ^ i3) * (-16223)) ^ (-760487745);
                        i5 = 924552974;
                    }
                    break;
                case -910544882:
                case -537946238:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ۘ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9013)) ^ (-696089018);
                        i5 = -1206492047;
                    } else {
                        iM2761 = (C0619.m2761("ۙ᩻") ^ i3) * (-79);
                        i4 = ((iM2761 ^ i2) * 9811) ^ (-1296127129);
                        i5 = -1761636831;
                    }
                    break;
                case -896994694:
                case 1738519145:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("᩻֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31603) ^ (-1886390566);
                        i5 = 1752911641;
                    } else {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31667) ^ (-1709161317);
                        i5 = -1578915717;
                    }
                    break;
                case -886256861:
                case 1665772526:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ۘ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9013)) ^ (-696089018);
                        i5 = -1206492047;
                    } else {
                        iM2761 = C0773.m3169("ۙۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30083) ^ (-56952933);
                        i5 = -1767227973;
                    }
                    break;
                case -715420994:
                case -466313716:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("۫᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21229) ^ 515087930;
                        i5 = 396505972;
                    } else {
                        iM2761 = C0773.m3169("۬ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19519) ^ (-317510575);
                        i5 = -515999579;
                    }
                    break;
                case 265236949:
                case 561394359:
                    if (C1080.m4050()) {
                        iM2761 = C0619.m2761("ۢᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2081)) ^ 1016648152;
                        i5 = -1155225738;
                    } else {
                        iM2761 = (C0619.m2761("᩺۫") ^ i3) * (-83);
                        i4 = ((iM2761 ^ i2) * (-30555)) ^ 1663791397;
                        i5 = -1752895756;
                    }
                    break;
                case 982300367:
                case 1183889478:
                    bArr = new byte[32];
                    if (C3734.m12152() >= 0) {
                        iM2761 = C0773.m3169("ۘ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9013)) ^ (-696089018);
                        i5 = -1206492047;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩹᩶")) * (-125);
                        i4 = ((iM2761 ^ i2) * (-1715)) ^ (-1419637807);
                        i5 = -2113512954;
                    }
                    break;
                case 1071764872:
                case 1509954224:
                    secureRandom = f34198;
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("۫᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21229) ^ 515087930;
                        i5 = 396505972;
                    } else {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6323)) ^ 450971248;
                        i5 = 1164031709;
                    }
                    break;
                default:
                    if (C2702.m8876()) {
                        iM2761 = (C0619.m2761("ᩴ֡") ^ i2) * (-55);
                        i4 = ((iM2761 ^ i3) * (-221)) ^ 940210024;
                        i5 = 976689812;
                    } else {
                        iM2761 = (C0619.m2761("᩺۫") ^ i3) * (-83);
                        i4 = ((iM2761 ^ i2) * (-30555)) ^ 1663791397;
                        i5 = -1752895756;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x018c A[PHI: r1 r17
      0x018c: PHI (r1v36 l.᩷ۡ᩻) = (r1v33 l.᩷ۡ᩻), (r1v2 l.᩷ۡ᩻), (r1v2 l.᩷ۡ᩻) binds: [B:47:0x0175, B:35:0x010d, B:33:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r17v41 l.᩷ۡ᩻) = (r17v35 l.᩷ۡ᩻), (r17v36 l.᩷ۡ᩻), (r17v42 l.᩷ۡ᩻) binds: [B:47:0x0175, B:35:0x010d, B:33:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0305 A[PHI: r5 r11 r12 r13 r17 r18 r19
      0x0305: PHI (r5v5 char) = (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:80:0x0303, B:72:0x02af, B:39:0x012d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r11v6 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v4 short[]), (r11v2 short[]) binds: [B:80:0x0303, B:72:0x02af, B:39:0x012d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r12v6 int) = (r12v2 int), (r12v2 int), (r12v4 int), (r12v2 int) binds: [B:80:0x0303, B:72:0x02af, B:39:0x012d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r13v6 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:80:0x0303, B:72:0x02af, B:39:0x012d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r17v25 l.᩷ۡ᩻) = (r17v12 l.᩷ۡ᩻), (r17v14 l.᩷ۡ᩻), (r17v21 l.᩷ۡ᩻), (r17v26 l.᩷ۡ᩻) binds: [B:80:0x0303, B:72:0x02af, B:39:0x012d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r18v6 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:80:0x0303, B:72:0x02af, B:39:0x012d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r19v18 l.᩷ۡ᩻) = (r19v2 l.᩷ۡ᩻), (r19v4 l.᩷ۡ᩻), (r19v14 l.᩷ۡ᩻), (r19v19 l.᩷ۡ᩻) binds: [B:80:0x0303, B:72:0x02af, B:39:0x012d, B:13:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (l.C2834.f9334 > 0) goto L13;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m27446(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10773.m27446(java.lang.String):void");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m27458(String str) {
        boolean zM9480 = false;
        boolean z = false;
        int i = 0;
        char cM4937 = 0;
        int i2 = -417361059;
        int i3 = C1519.f5300;
        int i4 = C23916.f77426;
        int iM3169 = (C0773.m3169("۬᩵") + i3) * (-93);
        int i5 = ((iM3169 ^ i4) * (-1553)) ^ 526466871;
        int i6 = 1844784170;
        while (true) {
            i2 = ((((i2 ^ i4) * 7837) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1756548158:
                case 438671612:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("᩷ۤ") + i3) * (-53);
                        i5 = ((iM3169 ^ i4) * 28629) ^ (-979159305);
                        i6 = 654166277;
                    } else {
                        iM3169 = (i3 - C0619.m2761("֡۫")) * (-7);
                        i5 = ((iM3169 ^ i4) * (-13761)) ^ 1738234908;
                        i6 = 306590842;
                    }
                    break;
                case -1663232767:
                case -1266097780:
                    if (C3734.f12817 < 0) {
                        iM3169 = C0619.m2761("֡ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13975) ^ 1689102499;
                        i6 = 684851654;
                    } else {
                        iM3169 = C0773.m3169("ܳ۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-13995)) ^ (-1058847356);
                        i6 = 1681308107;
                    }
                    break;
                case -1646074340:
                case 1972482608:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("ܶ۟") ^ i3) * (-29);
                        i5 = ((iM3169 ^ i4) * (-12613)) ^ 1396736714;
                        i6 = -61430689;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۙ֡")) * 13;
                        i5 = ((iM3169 ^ i4) * 10137) ^ 349363348;
                        i6 = 831481669;
                    }
                    break;
                case -1554307854:
                case 1250099223:
                    zM9480 = C2878.m9480(str);
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("֡ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13975) ^ 1689102499;
                        i6 = 684851654;
                    } else {
                        iM3169 = (C0773.m3169("֡ۖ") + i4) * 43;
                        i5 = ((iM3169 ^ i3) * 1607) ^ 778808148;
                        i6 = -26679419;
                    }
                    break;
                case -1303591386:
                case 787482939:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("᩷ۤ") + i3) * (-53);
                        i5 = ((iM3169 ^ i4) * 28629) ^ (-979159305);
                        i6 = 654166277;
                    } else {
                        iM3169 = C0619.m2761("᩵ܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7643) ^ (-1721762249);
                        i6 = 1332861646;
                    }
                    break;
                case -1044331253:
                case 1392131101:
                    C0773.m3161();
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("᩷ۤ") + i3) * (-53);
                        i5 = ((iM3169 ^ i4) * 28629) ^ (-979159305);
                        i6 = 654166277;
                    } else {
                        iM3169 = C0619.m2761("֡ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13975) ^ 1689102499;
                        i6 = 684851654;
                    }
                    break;
                case -1036850073:
                case 668070753:
                    if (C3690.m11987()) {
                        iM3169 = (C0619.m2761("ܶ۟") ^ i3) * (-29);
                        i5 = ((iM3169 ^ i4) * (-12613)) ^ 1396736714;
                        i6 = -61430689;
                    } else {
                        iM3169 = C0773.m3169("ۛۘ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 4889) ^ (-1504921560);
                        i6 = -2143211417;
                    }
                    break;
                case -992956962:
                case 1281832939:
                    cM4937 = C1343.m4937(str, i);
                    if (cM4937 >= '!') {
                        iM3169 = C0773.m3169("ۜ֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * 5739) ^ (-1301068813);
                        i6 = -567912887;
                    } else {
                        iM3169 = C0773.m3169("᩸ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4871) ^ 905035918;
                        i6 = 912209780;
                    }
                    break;
                case -876028034:
                case 22551610:
                    if (cM4937 > '~') {
                        iM3169 = C0773.m3169("᩸ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4871) ^ 905035918;
                        i6 = 912209780;
                    } else {
                        iM3169 = C0773.m3169("۟ܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-25223)) ^ 1124182367;
                        i6 = -841207263;
                    }
                    break;
                case -799682852:
                case 305260526:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ܳ۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-13995)) ^ (-1058847356);
                        i6 = 1681308107;
                    } else {
                        iM3169 = (C0619.m2761("֨ۙ") + i3) * 85;
                        i5 = ((iM3169 ^ i4) * (-31893)) ^ (-807587356);
                        i6 = 1366594892;
                    }
                    break;
                case -735307986:
                case -275769020:
                    if (C11235.m28309() != 0) {
                        iM3169 = (C0619.m2761("ܶ۟") ^ i3) * (-29);
                        i5 = ((iM3169 ^ i4) * (-12613)) ^ 1396736714;
                        i6 = -61430689;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 2887) ^ (-214013246);
                        i6 = -242321916;
                    }
                    break;
                case -467581668:
                case 1591020625:
                    C2310.m7813();
                    return false;
                case -347435078:
                case 1267913655:
                    i = 0;
                    iM3169 = C0773.m3169("᩵ۜ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 15949) ^ (-1059148695);
                    i6 = -1936286365;
                    break;
                case -238473129:
                case 830097742:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ܶ۟") ^ i3) * (-29);
                        i5 = ((iM3169 ^ i4) * (-12613)) ^ 1396736714;
                        i6 = -61430689;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۧۧ")) * (-9);
                        i5 = ((iM3169 ^ i3) * (-18441)) ^ 1378560053;
                        i6 = 742080509;
                    }
                    break;
                case -146817664:
                case 1882702705:
                    i++;
                    iM3169 = C0773.m3169("᩵ۜ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 15949) ^ (-1059148695);
                    i6 = -1936286365;
                    break;
                case 37710436:
                case 1407923803:
                    if (i < C2966.m9671(str)) {
                        iM3169 = C0619.m2761("ܰ᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-13523)) ^ 1204098447;
                        i6 = 1988402486;
                    } else {
                        iM3169 = (C0619.m2761("ۚۚ") ^ i3) * (-11);
                        i5 = ((iM3169 ^ i4) * 10027) ^ 993497958;
                        i6 = 1596427193;
                    }
                    break;
                case 213868325:
                case 713452201:
                    return z;
                case 424385395:
                case 1519209099:
                    if (C2966.m9671(str) > 1024) {
                        iM3169 = C0773.m3169("᩸ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4871) ^ 905035918;
                        i6 = 912209780;
                    } else {
                        iM3169 = C0619.m2761("ۜ۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-13003)) ^ (-1653735745);
                        i6 = -777451601;
                    }
                    break;
                case 528915557:
                case 2129993494:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0619.m2761("ܶ۟") ^ i3) * (-29);
                        i5 = ((iM3169 ^ i4) * (-12613)) ^ 1396736714;
                        i6 = -61430689;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۘܽ")) * (-27);
                        i5 = ((iM3169 ^ i3) * 24985) ^ (-1638981542);
                        i6 = -1373118570;
                    }
                    break;
                case 984959538:
                case 1423387787:
                    return true;
                case 1574875791:
                case 1760372014:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("֡ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13975) ^ 1689102499;
                        i6 = 684851654;
                    } else {
                        iM3169 = (C0773.m3169("ܽۛ") ^ i3) * (-83);
                        i5 = ((iM3169 ^ i4) * (-32041)) ^ (-369457666);
                        i6 = -150309445;
                    }
                    break;
                case 1681323644:
                case 2020966650:
                    C1519.m5403();
                    iM3169 = C0773.m3169("ܳ۟") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-13995)) ^ (-1058847356);
                    i6 = 1681308107;
                    break;
                case 1681558851:
                case 1863289539:
                    z = false;
                    if (zM9480) {
                        iM3169 = C0773.m3169("᩸ܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4871) ^ 905035918;
                        i6 = 912209780;
                    } else {
                        iM3169 = C0619.m2761("᩻۟") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-1271)) ^ (-1267053779);
                        i6 = -969527160;
                    }
                    break;
                default:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0773.m3169("᩷ۤ") + i3) * (-53);
                        i5 = ((iM3169 ^ i4) * 28629) ^ (-979159305);
                        i6 = 654166277;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۠᩶")) * (-25);
                        i5 = ((iM3169 ^ i3) * (-18153)) ^ 1939607235;
                        i6 = -339203282;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01d4 A[PHI: r5 r7 r8 r16
      0x01d4: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:51:0x01d2, B:43:0x0178, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:51:0x01d2, B:43:0x0178, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:51:0x01d2, B:43:0x0178, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r16v20 'th' java.lang.Throwable) = (r16v8 'th' java.lang.Throwable), (r16v10 'th' java.lang.Throwable), (r16v21 'th' java.lang.Throwable) binds: [B:51:0x01d2, B:43:0x0178, B:10:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0241 A[PHI: r16
      0x0241: PHI (r16v23 'th' java.lang.Throwable) = (r16v5 'th' java.lang.Throwable), (r16v6 'th' java.lang.Throwable), (r16v26 'th' java.lang.Throwable) binds: [B:63:0x023f, B:59:0x0222, B:12:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02c3 A[PHI: r2 r3 r4 r16
      0x02c3: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:75:0x02c1, B:71:0x02a3, B:55:0x0206, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:75:0x02c1, B:71:0x02a3, B:55:0x0206, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r4v3 short) = (r4v1 short), (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:75:0x02c1, B:71:0x02a3, B:55:0x0206, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r16v19 'th' java.lang.Throwable) = 
      (r16v2 'th' java.lang.Throwable)
      (r16v3 'th' java.lang.Throwable)
      (r16v7 'th' java.lang.Throwable)
      (r16v22 'th' java.lang.Throwable)
     binds: [B:75:0x02c1, B:71:0x02a3, B:55:0x0206, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (l.C2966.m9664() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (l.RunnableC3055.f9898 >= 0) goto L18;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m27463() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10773.m27463():void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m27466(byte[] bArr) throws C13517 {
        int length = 0;
        int i = 0;
        int length2 = 0;
        byte[] bArrCopyOf = null;
        int length3 = 0;
        int length4 = 0;
        byte[] bArrCopyOfRange = null;
        MessageDigest messageDigestM36179 = null;
        int i2 = 127750588;
        int i3 = RunnableC3055.f9898;
        int i4 = C2702.f8586;
        int iM3169 = C0773.m3169("᩻ۡ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 27477) ^ 868413462;
        int i6 = 823537446;
        while (true) {
            i2 = ((((i2 ^ i4) * (-9977)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2114713285:
                case 446453867:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("᩸֫") ^ i4) * 63;
                        i5 = ((iM3169 ^ i3) * 2265) ^ (-394249728);
                        i6 = -119899084;
                    } else {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8953) ^ (-1651588415);
                        i6 = -1027369730;
                    }
                    break;
                case -1699303757:
                case 1931776752:
                    return bArrCopyOf;
                case -1337877322:
                case 993706395:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("֨ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7113)) ^ (-357649121);
                        i6 = 359332132;
                    } else {
                        iM3169 = (C0773.m3169("ۙ۫") ^ i4) * (-9);
                        i5 = ((iM3169 ^ i3) * 18093) ^ (-1780421077);
                        i6 = -1666569308;
                    }
                    break;
                case -1268663566:
                case 750482290:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("᩶۠") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-10239)) ^ 1759382082;
                        i6 = 1810613653;
                    } else {
                        iM3169 = (C0619.m2761("֡ܺ") + i4) * 25;
                        i5 = ((iM3169 ^ i3) * 9901) ^ 328090678;
                        i6 = 1144034932;
                    }
                    break;
                case -1211022984:
                case -201688215:
                    bArrCopyOf = Arrays.copyOf(bArr, length2);
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("֨ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7113)) ^ (-357649121);
                        i6 = 359332132;
                    } else {
                        iM3169 = C0619.m2761("ܺ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19423) ^ (-1969355686);
                        i6 = 602979987;
                    }
                    break;
                case -950263153:
                case -238101138:
                    throw new C13517();
                case -907234410:
                case 1873550827:
                    length3 = bArrCopyOf.length;
                    length4 = bArr.length;
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("֨ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7113)) ^ (-357649121);
                        i6 = 359332132;
                    } else {
                        iM3169 = (C0773.m3169("۫᩶") ^ i4) * 35;
                        i5 = ((iM3169 ^ i3) * 16147) ^ (-1411894204);
                        i6 = -929585731;
                    }
                    break;
                case -901789870:
                case 151091250:
                    length2 = bArr.length - i;
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۘۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8049) ^ (-1909219423);
                        i6 = -1607459307;
                    } else {
                        iM3169 = (C0773.m3169("ۛ᩷") + i4) * (-3);
                        i5 = ((iM3169 ^ i3) * (-26999)) ^ 1376927533;
                        i6 = -1855898976;
                    }
                    break;
                case -840381848:
                case 735312389:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8953) ^ (-1651588415);
                        i6 = -1027369730;
                    } else {
                        iM3169 = C0619.m2761("ۘۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8049) ^ (-1909219423);
                        i6 = -1607459307;
                    }
                    break;
                case -734144988:
                case -620108956:
                    length = bArr.length;
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("ܺۖ") + i4) * (-35);
                        i5 = ((iM3169 ^ i3) * 4173) ^ 774566437;
                        i6 = -310115475;
                    } else {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8953) ^ (-1651588415);
                        i6 = -1027369730;
                    }
                    break;
                case -664658941:
                case -390728538:
                    i = 32;
                    if (length >= 32) {
                        iM3169 = C0619.m2761("ۨ᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-27735)) ^ (-1760139962);
                        i6 = -484606152;
                    } else {
                        iM3169 = C0619.m2761("ۨۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15179)) ^ 1039060332;
                        i6 = -1318230177;
                    }
                    break;
                case -601880017:
                case 798659928:
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, length4);
                    messageDigestM36179 = C15022.m36179();
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0773.m3169("᩶۠") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-10239)) ^ 1759382082;
                        i6 = 1810613653;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ᩳ۫")) * (-119);
                        i5 = ((iM3169 ^ i4) * 28017) ^ (-1637607183);
                        i6 = -975016272;
                    }
                    break;
                case -396483911:
                case -47695440:
                    C23916.m53419();
                    RunnableC3055.m9933();
                    return null;
                case -336911684:
                case 575898365:
                    if (MessageDigest.isEqual(bArrCopyOfRange, messageDigestM36179.digest(bArrCopyOf))) {
                        iM3169 = (i3 - C0619.m2761("ᩴܶ")) * (-49);
                        i5 = ((iM3169 ^ i4) * (-5085)) ^ 53910181;
                        i6 = -1415292435;
                    } else {
                        iM3169 = C0773.m3169("ܰۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 631) ^ 1607060302;
                        i6 = -1892540286;
                    }
                    break;
                case -181222827:
                case 2072381180:
                    if (C0950.m3785() != 0) {
                        iM3169 = C0619.m2761("ۘۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8049) ^ (-1909219423);
                        i6 = -1607459307;
                    } else {
                        iM3169 = C0619.m2761("۟᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-32059)) ^ (-267428789);
                        i6 = 1585291777;
                    }
                    break;
                case -175623117:
                case 685752308:
                    AbstractC0116.m1243();
                    iM3169 = C0619.m2761("ۘۨ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 8049) ^ (-1909219423);
                    i6 = -1607459307;
                    break;
                case -117220321:
                case 935413735:
                    throw new C13517();
                case -8992917:
                case 1125010753:
                    C3099.m10095();
                    if (C3033.m9845() > 0) {
                        iM3169 = C0773.m3169("᩶۠") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-10239)) ^ 1759382082;
                        i6 = 1810613653;
                    } else {
                        iM3169 = (C0773.m3169("᩸֫") ^ i4) * 63;
                        i5 = ((iM3169 ^ i3) * 2265) ^ (-394249728);
                        i6 = -119899084;
                    }
                    break;
                case 918391898:
                case 1456928281:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("֨ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7113)) ^ (-357649121);
                        i6 = 359332132;
                    } else {
                        iM3169 = C0773.m3169("᩶ۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19921) ^ 504941942;
                        i6 = 1405863410;
                    }
                    break;
                default:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("֨ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7113)) ^ (-357649121);
                        i6 = 359332132;
                    } else {
                        iM3169 = (C0773.m3169("۫ᩴ") ^ i3) * 13;
                        i5 = ((iM3169 ^ i4) * (-2333)) ^ 42896594;
                        i6 = -665411310;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0349  */
    /* JADX WARN: Code duplicated, block: B:110:0x0393  */
    /* JADX WARN: Code duplicated, block: B:114:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:118:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x0319  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m27465(C24084 c24084) throws Throwable {
        int iM3169;
        int i;
        int i2 = C0487.f2131;
        int i3 = C3033.f9831;
        int iM31610 = C0773.m3169("֫ᩴ") ^ i3;
        int i4 = ((iM31610 ^ i2) * 8461) ^ 1617287401;
        int i5 = iM31610 ^ (-267927660);
        Throwable th = null;
        Object obj = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        long size = 0;
        byte[] bArr = null;
        int i9 = 0;
        FileInputStream fileInputStreamM53638 = null;
        int i10 = 291029771;
        while (true) {
            int i11 = i5 ^ ((((i10 ^ i2) * (-26043)) >> 31) & i4);
            switch (i11) {
                case -2034459676:
                case -1277883792:
                    RunnableC1848.m6360();
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("۟ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16831)) ^ (-1950044161);
                        i = 1880226002;
                    } else {
                        iM3169 = C0773.m3169("ᩴܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13331) ^ (-374794125);
                        i = -560774561;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1937687730:
                case -1695033506:
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("ᩳܺ") + i2) * 63;
                        i4 = ((iM3169 ^ i3) * (-5887)) ^ (-423050616);
                        i = -925855492;
                    } else {
                        iM3169 = C0619.m2761("֫۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18123) ^ 232939104;
                        i = 608824114;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1928302065:
                case 1649894255:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("ۧۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5235) ^ 390327306;
                        i = -112232196;
                    } else {
                        iM3169 = C0619.m2761("᩻ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17281)) ^ (-1688884115);
                        i = -1231361365;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1909835013:
                case -1376949105:
                    if (C1080.f3865 < 0) {
                        iM3169 = (C0619.m2761("ܽۧ") ^ i3) * 43;
                        i4 = ((iM3169 ^ i2) * 21237) ^ (-1615031542);
                        i = -1104542459;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۛ֡")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i2) * 27641) ^ 684552724;
                        i = -1696385182;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1850503774:
                case -622645052:
                    if (i8 >= 0) {
                        iM3169 = (C0619.m2761("᩵ۤ") ^ i2) * 15;
                        i4 = ((iM3169 ^ i3) * 13719) ^ (-1909313862);
                        i = -1920526277;
                    } else {
                        iM3169 = (C0619.m2761("ۢ۟") ^ i2) * (-63);
                        i4 = ((iM3169 ^ i3) * (-22417)) ^ (-232001574);
                        i = 1917454765;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1826335402:
                case -86274141:
                    fileInputStreamM53638.close();
                    return bArr;
                case -1818821621:
                case 294221887:
                    size = C19853.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamM53638.getChannel()).size();
                    iM3169 = C0773.m3169("֨᩻") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-27801)) ^ 682298902;
                    i = -2090505428;
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1807851972:
                case 1228472146:
                    try {
                        i8 = fileInputStreamM53638.read(bArr, i6, i9 - i6);
                        iM3169 = C0773.m3169("۬ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18845) ^ 1205471882;
                        i = -846026062;
                    } catch (Throwable th2) {
                        th = th2;
                        iM3169 = (i2 - C0619.m2761("ܰۗ")) * 63;
                        i4 = ((iM3169 ^ i3) * 28493) ^ 729267818;
                        i = 107028727;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1613954897:
                case 1288446453:
                    C2419.m8174();
                    C4238.m13540();
                    return null;
                case -1578592654:
                case 932967442:
                    fileInputStreamM53638 = c24084.m53638();
                    iM3169 = C0619.m2761("᩵۫") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-28227)) ^ 2136671264;
                    i = -2065399803;
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1511700066:
                case 2092792926:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("֫۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18123) ^ 232939104;
                        i = 608824114;
                    } else {
                        iM3169 = (C0619.m2761("ܳ᩺") + i3) * 83;
                        i4 = ((iM3169 ^ i2) * (-6581)) ^ 2101479803;
                        i = -1657025838;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1387568520:
                case 395390693:
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ۧۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5235) ^ 390327306;
                        i = -112232196;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۧۗ")) * (-109);
                        i4 = ((iM3169 ^ i3) * 22117) ^ 1930950750;
                        i = 1070672153;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1158864308:
                case 451483341:
                    throw th;
                case -1132692595:
                case -768451230:
                    i6 += i8;
                    iM3169 = C0773.m3169("᩻ܰ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-6329)) ^ 533503018;
                    i = -506702577;
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1085311146:
                case -88512047:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ۢܿ") ^ i2) * (-15);
                        i4 = ((iM3169 ^ i3) * (-29765)) ^ 533356369;
                        i = 779999694;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۛۜ")) * (-15);
                        i4 = ((iM3169 ^ i3) * (-5093)) ^ 1278276204;
                        i = -1209894159;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1070055972:
                case -907985394:
                    C1542.m5459();
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("۟ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16831)) ^ (-1950044161);
                        i = 1880226002;
                    } else {
                        iM3169 = C0619.m2761("֫۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18123) ^ 232939104;
                        i = 608824114;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -1027155400:
                case 775047731:
                    try {
                        fileInputStreamM53638.close();
                        iM3169 = (i3 - C0773.m3169("᩻᩵")) * (-59);
                        i4 = ((iM3169 ^ i2) * 9121) ^ 1178941193;
                        i = 65680348;
                        i5 = iM3169 ^ i;
                        i10 = i11;
                    } catch (Throwable th3) {
                        int iM31611 = (i2 - C0773.m3169("ۘܰ")) * (-119);
                        i4 = ((iM31611 ^ i3) * 2607) ^ (-975113661);
                        int i12 = iM31611 ^ 17927548;
                        obj = th3;
                        i10 = i11;
                        i5 = i12;
                    }
                    break;
                case -942400951:
                case -238446432:
                    C1826.m6301();
                    if (C3033.f9831 < 0) {
                        iM3169 = (i2 - C0619.m2761("֫ۡ")) * 17;
                        i4 = ((iM3169 ^ i3) * (-13079)) ^ 11537372;
                        i = 147129158;
                    } else {
                        iM3169 = (C0773.m3169("ۢܿ") ^ i2) * (-15);
                        i4 = ((iM3169 ^ i3) * (-29765)) ^ 533356369;
                        i = 779999694;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -930231103:
                case 1972023208:
                    throw new C13517();
                case -879395271:
                case 2133976904:
                    C0619.m2763();
                    iM3169 = C0619.m2761("۟ۖ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-16831)) ^ (-1950044161);
                    i = 1880226002;
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -653784774:
                case 202539779:
                    if (i7 == -1) {
                        iM3169 = C0773.m3169("ۜܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15731) ^ 1968642381;
                        i = 352810963;
                    } else {
                        iM3169 = C0773.m3169("᩵ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32623) ^ 1398188977;
                        i = -2005289784;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -566071956:
                case 1986684559:
                    if (C2419.m8174() >= 0) {
                        iM3169 = C0619.m2761("۟ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16831)) ^ (-1950044161);
                        i = 1880226002;
                    } else {
                        iM3169 = C0619.m2761("᩸᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30881)) ^ 748857773;
                        i = -1298710137;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -561193005:
                case 1228986440:
                    throw new C13517();
                case -529690165:
                case 236145328:
                    if (i6 < i9) {
                        iM3169 = (C0619.m2761("ܳۨ") ^ i2) * (-91);
                        i4 = ((iM3169 ^ i3) * EnumC6121.f20881) ^ 1905999195;
                        i = -475840717;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֫۠")) * (-81);
                        i4 = ((iM3169 ^ i3) * 8933) ^ 330614610;
                        i = -517128293;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -289988203:
                case 431361199:
                    i9 = (int) size;
                    bArr = new byte[i9];
                    iM3169 = C0773.m3169("᩸᩶") ^ i2;
                    i4 = ((iM3169 ^ i3) * 17461) ^ 1581518581;
                    i = 221378849;
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -280073801:
                case -197192539:
                    if (C2702.m8876()) {
                        iM3169 = C0773.m3169("ᩴܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13331) ^ (-374794125);
                        i = -560774561;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֫ۡ")) * 17;
                        i4 = ((iM3169 ^ i3) * (-13079)) ^ 11537372;
                        i = 147129158;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -78835826:
                case 440660167:
                    i6 = 0;
                    iM3169 = C0773.m3169("᩻ܰ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-6329)) ^ 533503018;
                    i = -506702577;
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case -33681698:
                case 226270589:
                    C17202.m40372();
                    if (C0487.f2131 > 0) {
                        iM3169 = C0773.m3169("ᩴܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13331) ^ (-374794125);
                        i = -560774561;
                    } else {
                        iM3169 = (C0619.m2761("ܽۧ") ^ i3) * 43;
                        i4 = ((iM3169 ^ i2) * 21237) ^ (-1615031542);
                        i = -1104542459;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case 9493385:
                case 464282812:
                    RunnableC3646.m11799(th, obj);
                    iM3169 = (i3 - C0773.m3169("᩻᩵")) * (-59);
                    i4 = ((iM3169 ^ i2) * 9121) ^ 1178941193;
                    i = 65680348;
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case 378767237:
                case 1235291164:
                    C2287.m7745();
                    if (C1146.f4234 < 0) {
                        iM3169 = (C0773.m3169("ۢܿ") ^ i2) * (-15);
                        i4 = ((iM3169 ^ i3) * (-29765)) ^ 533356369;
                        i = 779999694;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۡۙ")) * (-121);
                        i4 = ((iM3169 ^ i2) * (-469)) ^ 1918630987;
                        i = 1351791454;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case 395037366:
                case 1663249701:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۛ֡")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i2) * 27641) ^ 684552724;
                        i = -1696385182;
                    } else {
                        iM3169 = C0773.m3169("ۗ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15529)) ^ 1896965512;
                        i = 303889766;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case 534468119:
                case 2079151649:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ۡۙ")) * (-121);
                        i4 = ((iM3169 ^ i2) * (-469)) ^ 1918630987;
                        i = 1351791454;
                    } else {
                        iM3169 = C0773.m3169("᩶ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14887)) ^ 870358282;
                        i = 832402917;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case 989042241:
                case 1992907109:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0773.m3169("ۢܿ") ^ i2) * (-15);
                        i4 = ((iM3169 ^ i3) * (-29765)) ^ 533356369;
                        i = 779999694;
                    } else {
                        iM3169 = (C0619.m2761("ܳ۫") ^ i3) * (-13);
                        i4 = ((iM3169 ^ i2) * 29553) ^ (-367920247);
                        i = 728800295;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case 1502301073:
                case 2136382531:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("۟ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16831)) ^ (-1950044161);
                        i = 1880226002;
                    } else {
                        iM3169 = (C0773.m3169("ܶۗ") + i2) * (-91);
                        i4 = ((iM3169 ^ i3) * 14863) ^ (-173839996);
                        i = -1107756264;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case 1595734596:
                case 1824096597:
                    if (size <= 16384) {
                        iM3169 = C0619.m2761("᩷ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8179) ^ (-603552058);
                        i = 23607705;
                    } else {
                        iM3169 = C0773.m3169("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21859)) ^ (-1693055780);
                        i = -1705619127;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                case 1642351471:
                case 1738976353:
                    throw new C13517();
                case 1917065127:
                case 1951365398:
                    i7 = fileInputStreamM53638.read();
                    iM3169 = C0619.m2761("ܿ᩻") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-221)) ^ (-2029540109);
                    i = 919916940;
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
                default:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("֫۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18123) ^ 232939104;
                        i = 608824114;
                    } else {
                        iM3169 = (C0773.m3169("ᩳۖ") + i3) * (-19);
                        i4 = ((iM3169 ^ i2) * (-14391)) ^ (-1055256743);
                        i = 1346150022;
                    }
                    i5 = iM3169 ^ i;
                    i10 = i11;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27441(String str, String str2) {
        C21962 c21962M8361 = null;
        C21962 c21962M27445 = null;
        String strM27459 = null;
        int i = -1391576;
        int i2 = C1146.f4234;
        int i3 = C1783.f6087;
        int iM3169 = (i3 - C0773.m3169("᩻᩺")) * (-93);
        int i4 = ((iM3169 ^ i2) * (-22785)) ^ 392069146;
        int i5 = 341987729;
        while (true) {
            i = ((((i ^ i2) * 7271) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2051924965:
                case -1156419632:
                    C11235.m28309();
                    return null;
                case -2034361120:
                case -347544804:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (i2 - C0619.m2761("۠᩸")) * (-103);
                        i4 = ((iM3169 ^ i3) * 9589) ^ 55732526;
                        i5 = 816194323;
                    } else {
                        iM3169 = (C0619.m2761("ۖۤ") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 20391) ^ 921727069;
                        i5 = -1954609027;
                    }
                    break;
                case -2033920832:
                case -16522282:
                    if (C2419.m8175(str2, c21962M8361.f70884)) {
                        iM3169 = C0619.m2761("۠ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5823)) ^ 142540147;
                        i5 = -1494373547;
                    } else {
                        iM3169 = C0619.m2761("֡ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22977) ^ (-1988214552);
                        i5 = 1888860332;
                    }
                    break;
                case -1854682906:
                case 1706004515:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("᩷᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17529) ^ 434553496;
                        i5 = -813352142;
                    } else {
                        iM3169 = C0773.m3169("ۚ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21467)) ^ 67589934;
                        i5 = -1808990920;
                    }
                    break;
                case -1826526896:
                case -857473213:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ᩳᩳ") + i3) * (-61);
                        i4 = ((iM3169 ^ i2) * (-7427)) ^ (-857946914);
                        i5 = -947149796;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩸") + i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 16971) ^ 398760322;
                        i5 = 608696864;
                    }
                    break;
                case -1820556336:
                case 378808659:
                    return c21962M8361.f70888;
                case -1758283874:
                case -820386624:
                    RunnableC3055.m9933();
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("֡ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1185) ^ (-1802393041);
                        i5 = -1273076214;
                    } else {
                        iM3169 = C0619.m2761("᩷᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17529) ^ 434553496;
                        i5 = -813352142;
                    }
                    break;
                case -1561156514:
                case -1476181527:
                    C2485.m8357();
                    if (RunnableC3646.m11813() == 0) {
                        iM3169 = (C0619.m2761("ᩳᩳ") + i3) * (-61);
                        i4 = ((iM3169 ^ i2) * (-7427)) ^ (-857946914);
                        i5 = -947149796;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۠᩸")) * (-103);
                        i4 = ((iM3169 ^ i3) * 9589) ^ 55732526;
                        i5 = 816194323;
                    }
                    break;
                case -1228486278:
                case -754366791:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("᩷᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17529) ^ 434553496;
                        i5 = -813352142;
                    } else {
                        iM3169 = (C0773.m3169("ܰۜ") ^ i3) * (-113);
                        i4 = ((iM3169 ^ i2) * 26545) ^ 823896855;
                        i5 = -1376819946;
                    }
                    break;
                case -1181431330:
                case 764280329:
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0619.m2761("֡ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1185) ^ (-1802393041);
                        i5 = -1273076214;
                    } else {
                        iM3169 = C0619.m2761("۫᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13731)) ^ 1922706609;
                        i5 = -616082976;
                    }
                    break;
                case -1144053604:
                case 609581163:
                    c21962M8361 = C2485.m8361();
                    if (c21962M8361 != null) {
                        iM3169 = (i3 - C0619.m2761("ܳۢ")) * (-13);
                        i4 = ((iM3169 ^ i2) * 6443) ^ (-1047983945);
                        i5 = -759144539;
                    } else {
                        iM3169 = C0619.m2761("֡ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22977) ^ (-1988214552);
                        i5 = 1888860332;
                    }
                    break;
                case -1057961330:
                case -71988435:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("᩷᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17529) ^ 434553496;
                        i5 = -813352142;
                    } else {
                        iM3169 = C0773.m3169("ۖۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25477)) ^ (-1086378633);
                        i5 = -1585688529;
                    }
                    break;
                case -837625825:
                case 1039339825:
                    c21962M27445.f70888 = strM27459;
                    m27464(c21962M27445);
                    return c21962M27445.f70888;
                case -819089335:
                case 59225595:
                    AbstractC0116.m1243();
                    iM3169 = C0619.m2761("᩷᩶") ^ i3;
                    i4 = ((iM3169 ^ i2) * 17529) ^ 434553496;
                    i5 = -813352142;
                    break;
                case -772605940:
                case 251618701:
                    strM27459 = m27459();
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("ۨᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14919)) ^ (-3303409);
                        i5 = -389661404;
                    } else {
                        iM3169 = C0619.m2761("᩺ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10831)) ^ 303488915;
                        i5 = 2120796452;
                    }
                    break;
                case -375254304:
                case 709177786:
                    if (C2419.m8175(str, c21962M8361.f70889)) {
                        iM3169 = C0619.m2761("֨֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20011)) ^ 785680789;
                        i5 = -1254670557;
                    } else {
                        iM3169 = C0619.m2761("֡ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22977) ^ (-1988214552);
                        i5 = 1888860332;
                    }
                    break;
                case 407570100:
                case 2140463479:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("᩷᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17529) ^ 434553496;
                        i5 = -813352142;
                    } else {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i2) * 57;
                        i4 = ((iM3169 ^ i3) * (-32077)) ^ (-740629881);
                        i5 = -1946259148;
                    }
                    break;
                case 587436522:
                case 1995907353:
                    c21962M27445.f70884 = str2;
                    if (C0862.f3233 != 0) {
                        iM3169 = (i2 - C0619.m2761("۠᩸")) * (-103);
                        i4 = ((iM3169 ^ i3) * 9589) ^ 55732526;
                        i5 = 816194323;
                    } else {
                        iM3169 = (C0619.m2761("ᩴܳ") ^ i3) * (-75);
                        i4 = ((iM3169 ^ i2) * (-17249)) ^ (-1981740096);
                        i5 = -1875359983;
                    }
                    break;
                case 983636392:
                case 1638465734:
                    c21962M27445 = m27445(c21962M8361);
                    c21962M27445.f70889 = str;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (i2 - C0619.m2761("۠᩸")) * (-103);
                        i4 = ((iM3169 ^ i3) * 9589) ^ 55732526;
                        i5 = 816194323;
                    } else {
                        iM3169 = (C0619.m2761("᩷ۛ") ^ i2) * 35;
                        i4 = ((iM3169 ^ i3) * (-3295)) ^ 628586775;
                        i5 = 62409080;
                    }
                    break;
                default:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i2 - C0619.m2761("۠᩸")) * (-103);
                        i4 = ((iM3169 ^ i3) * 9589) ^ 55732526;
                        i5 = 816194323;
                    } else {
                        iM3169 = C0619.m2761("᩷᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17529) ^ 434553496;
                        i5 = -813352142;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0433 A[PHI: r16 r20
      0x0433: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:106:0x0431, B:102:0x0412, B:34:0x00ea, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0433: PHI (r20v44 int) = (r20v17 int), (r20v18 int), (r20v33 int), (r20v50 int) binds: [B:106:0x0431, B:102:0x0412, B:34:0x00ea, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0246 A[PHI: r20
      0x0246: PHI (r20v8 int) = (r20v6 int), (r20v9 int) binds: [B:64:0x022f, B:56:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27450(C13778 c13778, String str, String str2, boolean z) throws IOException {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int iM2762;
        int i5;
        int i6;
        int iM31610;
        int i7;
        String str3 = str2;
        int i8 = C2354.f7599;
        int i9 = C2288.f7433;
        int iM2763 = C0619.m2761("ܺ۫") ^ i9;
        int i10 = ((iM2763 ^ i8) * 25195) ^ (-237331309);
        String strM4049 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM2763 ^ 1439105618;
        int iM33683 = 0;
        boolean z2 = false;
        int i12 = 0;
        short s = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1910827030;
        int i17 = 0;
        long jM33684 = 0;
        C21962 c21962M27445 = null;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i8) * (-4843)) >> 31));
            switch (i16) {
                case -2133149132:
                case 1315058855:
                    i13 = i13;
                    s = sArr[97];
                    i17 = s * s;
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("ۡۘ") ^ i8;
                        i3 = ((iM3169 ^ i9) * (-3987)) ^ 1770162593;
                        i4 = -583969538;
                    } else {
                        iM3169 = C0619.m2761("ۧۨ") ^ i9;
                        i3 = ((iM3169 ^ i8) * (-5053)) ^ 1942406041;
                        i4 = 1852329604;
                    }
                    int i18 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i18;
                    str3 = str2;
                    break;
                case -2070680987:
                case -843933244:
                    i13 = i13;
                    i15 = 119;
                    i12 = 3;
                    if (C3033.f9831 < 0) {
                        iM2761 = (C0773.m3169("۠ۗ") ^ i8) * (-3);
                        i = ((iM2761 ^ i9) * (-4401)) ^ 1733617421;
                        i2 = -233778108;
                        i10 = i;
                        i13 = i13;
                        i11 = iM2761 ^ i2;
                    } else {
                        iM3169 = C0619.m2761("ᩴۤ") ^ i8;
                        i3 = ((iM3169 ^ i9) * (-32357)) ^ 31173349;
                        i4 = 1940607101;
                        int i19 = iM3169 ^ i4;
                        i10 = i3;
                        i13 = i13;
                        i11 = i19;
                        str3 = str2;
                    }
                    break;
                case -2057335641:
                case 934650047:
                    RunnableC1848.m6360();
                    AbstractC0116.m1243();
                    return;
                case -2018907132:
                case -250902676:
                    i13 = i13;
                    c21962M27445 = m27445(C13473.m33138());
                    jM33684 = c13778.m33684();
                    strM4049 = C1080.m4049(c13778);
                    if (C1826.m6301() >= 0) {
                        iM3169 = (C0619.m2761("ܶۧ") ^ i9) * 19;
                        i3 = ((iM3169 ^ i8) * 26725) ^ 520995516;
                        i4 = 2073163515;
                    } else {
                        iM3169 = (C0773.m3169("֨ܿ") + i8) * (-77);
                        i3 = ((iM3169 ^ i9) * (-19943)) ^ (-471541654);
                        i4 = -757003427;
                    }
                    int i110 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i110;
                    str3 = str2;
                    break;
                case -1984673666:
                case -134545461:
                    i13 = i13;
                    sArr = f34193;
                    if (C3448.m11248() != 0) {
                        iM3169 = (i9 - C0619.m2761("ܰ۠")) * 39;
                        i3 = ((iM3169 ^ i8) * 3195) ^ (-668963700);
                        i4 = -1121235618;
                    } else {
                        iM3169 = (i9 - C0619.m2761("᩸᩺")) * 59;
                        i3 = ((iM3169 ^ i8) * 2831) ^ 1076202164;
                        i4 = 686909133;
                    }
                    int i111 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i111;
                    str3 = str2;
                    break;
                case -1843491160:
                case 1804209688:
                    throw new IOException(AbstractC0116.m1236(f34193, 141, 31, i14));
                case -1801142397:
                case -337297271:
                    return;
                case -1747120806:
                case 208845957:
                    i14 = 304;
                    iM3169 = C0619.m2761("۬ۜ") ^ i9;
                    i3 = ((iM3169 ^ i8) * (-3305)) ^ 1519462291;
                    i4 = -1822851775;
                    int i112 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i112;
                    str3 = str2;
                    break;
                case -1468843648:
                case 168529389:
                    i13 = i13;
                    c21962M27445.f70883 = jM33684;
                    c21962M27445.f70886 = strM4049;
                    c21962M27445.f70882 = iM33683;
                    sArr2 = f34193;
                    if (C2419.m8174() >= 0) {
                        iM2761 = (C0619.m2761("ܳ᩻") ^ i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i9) * 15173) ^ (-249246343);
                        i2 = 601095347;
                    } else {
                        iM2761 = C0619.m2761("ۗᩳ") ^ i8;
                        i = ((iM2761 ^ i9) * 8649) ^ (-40802216);
                        i2 = 1574075944;
                    }
                    i10 = i;
                    i13 = i13;
                    i11 = iM2761 ^ i2;
                    break;
                case -1463864297:
                case -473406691:
                    if (!C0862.m3503()) {
                        i13 = i13;
                        iM2761 = (C0619.m2761("ܳ᩻") ^ i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i9) * 15173) ^ (-249246343);
                        i2 = 601095347;
                        i10 = i;
                        i13 = i13;
                        i11 = iM2761 ^ i2;
                    } else {
                        iM2762 = C0619.m2761("ۗܰ") ^ i8;
                        i5 = ((iM2762 ^ i9) * (-2921)) ^ 2085123498;
                        i6 = 983953157;
                        i11 = iM2762 ^ i6;
                        str3 = str2;
                        i10 = i5;
                    }
                    break;
                case -1429914196:
                case -1375016214:
                    AbstractC0116.m1243();
                    i13 = i13;
                    iM3169 = (C0619.m2761("ܶۧ") ^ i9) * 19;
                    i3 = ((iM3169 ^ i8) * 26725) ^ 520995516;
                    i4 = 2073163515;
                    int i113 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i113;
                    str3 = str2;
                    break;
                case -1408656400:
                case -114345862:
                    i13 = i13;
                    if (!m27458(strM4049)) {
                        iM3169 = C0619.m2761("ܳ᩶") ^ i8;
                        i3 = ((iM3169 ^ i9) * 13817) ^ (-1816277032);
                        i4 = 1789624336;
                        int i114 = iM3169 ^ i4;
                        i10 = i3;
                        i13 = i13;
                        i11 = i114;
                        str3 = str2;
                    } else {
                        iM2761 = C0619.m2761("ۧ֨") ^ i9;
                        i = ((iM2761 ^ i8) * (-7357)) ^ (-47725124);
                        i2 = 1416150357;
                        i10 = i;
                        i13 = i13;
                        i11 = iM2761 ^ i2;
                    }
                    break;
                case -1127392113:
                case 911201736:
                    i13 = i13;
                    c21962M27445.f70889 = C17202.m40377(sArr2, i15, i12, i14);
                    c21962M27445.f70888 = str;
                    if (C2375.m8065() > 0) {
                        iM2761 = (i9 - C0619.m2761("۫᩷")) * (-127);
                        i = ((iM2761 ^ i8) * (-4919)) ^ 1702698908;
                        i2 = -77745608;
                        i10 = i;
                        i13 = i13;
                        i11 = iM2761 ^ i2;
                    } else {
                        iM3169 = C0619.m2761("ۡۘ") ^ i8;
                        i3 = ((iM3169 ^ i9) * (-3987)) ^ 1770162593;
                        i4 = -583969538;
                        int i115 = iM3169 ^ i4;
                        i10 = i3;
                        i13 = i13;
                        i11 = i115;
                        str3 = str2;
                    }
                    break;
                case -1024962615:
                case 108010620:
                    int i20 = i13;
                    m27464(c21962M27445);
                    if (C2878.m9488(m27443())) {
                        iM31610 = C0619.m2761("۠ۨ") ^ i9;
                        i5 = ((iM31610 ^ i8) * (-10771)) ^ (-719169941);
                        i7 = -1984447524;
                    } else {
                        iM31610 = (i8 - C0773.m3169("ᩴ᩺")) * (-77);
                        i5 = ((iM31610 ^ i9) * 22167) ^ 113801365;
                        i7 = -7228442;
                    }
                    int i21 = iM31610 ^ i7;
                    i13 = i20;
                    i11 = i21;
                    i10 = i5;
                    break;
                case -987389343:
                case 1156029685:
                    if (!C3492.m11488()) {
                        iM2762 = C0619.m2761("ۗܰ") ^ i8;
                        i5 = ((iM2762 ^ i9) * (-2921)) ^ 2085123498;
                        i6 = 983953157;
                        i11 = iM2762 ^ i6;
                        str3 = str2;
                        i10 = i5;
                    } else {
                        i13 = i13;
                        iM3169 = (C0619.m2761("ܶۧ") ^ i9) * 19;
                        i3 = ((iM3169 ^ i8) * 26725) ^ 520995516;
                        i4 = 2073163515;
                        int i116 = iM3169 ^ i4;
                        i10 = i3;
                        i13 = i13;
                        i11 = i116;
                        str3 = str2;
                    }
                    break;
                case -732901878:
                case 1297187193:
                    if (C2966.f9654 >= 0) {
                        i13 = i13;
                        iM3169 = (i9 - C0619.m2761("ܰ۠")) * 39;
                        i3 = ((iM3169 ^ i8) * 3195) ^ (-668963700);
                        i4 = -1121235618;
                        int i117 = iM3169 ^ i4;
                        i10 = i3;
                        i13 = i13;
                        i11 = i117;
                        str3 = str2;
                    }
                    i13 = i13;
                    iM3169 = (C0619.m2761("ܶۧ") ^ i9) * 19;
                    i3 = ((iM3169 ^ i8) * 26725) ^ 520995516;
                    i4 = 2073163515;
                    int i118 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i118;
                    str3 = str2;
                    break;
                case -566019931:
                case 1600578554:
                    short[] sArr3 = f34193;
                    i13 = i13;
                    if (C2702.f8586 > 0) {
                        throw new IOException(RunnableC1848.m6366(sArr3, 122, 19, i14));
                    }
                    iM3169 = (i9 - C0619.m2761("ܰ۠")) * 39;
                    i3 = ((iM3169 ^ i8) * 3195) ^ (-668963700);
                    i4 = -1121235618;
                    int i119 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i119;
                    str3 = str2;
                    break;
                    break;
                case -558163883:
                case 2142891871:
                    i13 = i13;
                    c21962M27445.f70884 = "";
                    c21962M27445.f70885 = str3;
                    c21962M27445.f70887 = z2;
                    iM2761 = C0773.m3169("۫ۧ") ^ i9;
                    i = ((iM2761 ^ i8) * 23411) ^ 1259290958;
                    i2 = 1750693868;
                    i10 = i;
                    i13 = i13;
                    i11 = iM2761 ^ i2;
                    break;
                case -129791413:
                case 503477963:
                    if (!C1783.m6232()) {
                        i13 = i13;
                        iM3169 = (C0619.m2761("ܶۧ") ^ i9) * 19;
                        i3 = ((iM3169 ^ i8) * 26725) ^ 520995516;
                        i4 = 2073163515;
                        int i1110 = iM3169 ^ i4;
                        i10 = i3;
                        i13 = i13;
                        i11 = i1110;
                        str3 = str2;
                    } else {
                        int iM31611 = (C0773.m3169("֫᩺") + i9) * (-125);
                        i5 = ((iM31611 ^ i8) * (-643)) ^ (-2020616464);
                        i11 = iM31611 ^ 950381765;
                        i10 = i5;
                    }
                    break;
                case -114012676:
                case 1785179425:
                    i13 = i13;
                    int i22 = s + s2;
                    if ((i22 * i22) - i13 > 0) {
                        iM3169 = (i9 - C0619.m2761("ܶܰ")) * (-61);
                        i3 = ((iM3169 ^ i8) * 31391) ^ (-1245227549);
                        i4 = -391373228;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ܶ᩸")) * (-49);
                        i3 = ((iM3169 ^ i9) * (-6973)) ^ (-74899662);
                        i4 = -904722296;
                    }
                    int i1111 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i1111;
                    str3 = str2;
                    break;
                case -87330781:
                case 1937502213:
                    i13 = i13;
                    short[] sArr4 = f34193;
                    if (C1343.f4799 == 0) {
                        throw new IOException(C1826.m6310(sArr4, 98, 21, i14));
                    }
                    iM3169 = C0619.m2761("ᩴۤ") ^ i8;
                    i3 = ((iM3169 ^ i9) * (-32357)) ^ 31173349;
                    i4 = 1940607101;
                    int i1112 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i1112;
                    str3 = str2;
                    break;
                case 2583082:
                case 1074216728:
                    i13 = i13;
                    iM33683 = c13778.m33683();
                    if (jM33684 > 0) {
                        iM3169 = (C0619.m2761("ۗ᩻") + i9) * (-73);
                        i3 = ((iM3169 ^ i8) * 6951) ^ (-709372069);
                        i4 = 258079405;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩶") ^ i8;
                        i3 = ((iM3169 ^ i9) * 13817) ^ (-1816277032);
                        i4 = 1789624336;
                    }
                    int i1113 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i1113;
                    str3 = str2;
                    break;
                case 205174072:
                case 395675429:
                    int i23 = i17 + 23222761;
                    i13 = i23 + i23;
                    s2 = 4819;
                    if (C0950.f3488 >= 0) {
                        iM2762 = C0619.m2761("ۗܰ") ^ i8;
                        i5 = ((iM2762 ^ i9) * (-2921)) ^ 2085123498;
                        i6 = 983953157;
                    } else {
                        iM2762 = (i8 - C0619.m2761("᩵᩶")) * (-45);
                        i5 = ((iM2762 ^ i9) * 19065) ^ (-1713205379);
                        i6 = -170619172;
                    }
                    i11 = iM2762 ^ i6;
                    str3 = str2;
                    i10 = i5;
                    break;
                case 535957043:
                case 704589995:
                    i13 = i13;
                    if (jM33684 >= c21962M27445.f70883) {
                        iM2761 = C0619.m2761("ܽۖ") ^ i9;
                        i = ((iM2761 ^ i8) * 18317) ^ 1378470203;
                        i2 = 917083104;
                    } else {
                        iM2761 = (C0773.m3169("ۤۙ") ^ i9) * (-9);
                        i = ((iM2761 ^ i8) * 16191) ^ 337022119;
                        i2 = -730609566;
                    }
                    i10 = i;
                    i13 = i13;
                    i11 = iM2761 ^ i2;
                    break;
                case 631758457:
                case 2047838077:
                    i14 = 22027;
                    iM3169 = C0619.m2761("۬ۜ") ^ i9;
                    i3 = ((iM3169 ^ i8) * (-3305)) ^ 1519462291;
                    i4 = -1822851775;
                    int i1114 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i1114;
                    str3 = str2;
                    break;
                case 932561918:
                case 1840248441:
                    i13 = i13;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i9 - C0619.m2761("ܰ۠")) * 39;
                        i3 = ((iM3169 ^ i8) * 3195) ^ (-668963700);
                        i4 = -1121235618;
                    } else {
                        iM3169 = (C0773.m3169("ۛۛ") + i8) * (-3);
                        i3 = ((iM3169 ^ i9) * (-22311)) ^ 179002832;
                        i4 = -1188581637;
                    }
                    int i1115 = iM3169 ^ i4;
                    i10 = i3;
                    i13 = i13;
                    i11 = i1115;
                    str3 = str2;
                    break;
                case 1196051461:
                case 1703058688:
                    C3077.m10041();
                    if (AbstractC0116.m1243() != 0) {
                        i13 = i13;
                        iM3169 = C0619.m2761("ᩴۤ") ^ i8;
                        i3 = ((iM3169 ^ i9) * (-32357)) ^ 31173349;
                        i4 = 1940607101;
                        int i1116 = iM3169 ^ i4;
                        i10 = i3;
                        i13 = i13;
                        i11 = i1116;
                        str3 = str2;
                    } else {
                        iM2762 = C0619.m2761("ۗܰ") ^ i8;
                        i5 = ((iM2762 ^ i9) * (-2921)) ^ 2085123498;
                        i6 = 983953157;
                        i11 = iM2762 ^ i6;
                        str3 = str2;
                        i10 = i5;
                    }
                    break;
                case 1304181977:
                case 1631610966:
                    i13 = i13;
                    if (z) {
                        iM2761 = C0619.m2761("ܽۖ") ^ i9;
                        i = ((iM2761 ^ i8) * 18317) ^ 1378470203;
                        i2 = 917083104;
                    } else {
                        iM2761 = C0773.m3169("ۙܿ") ^ i8;
                        i = ((iM2761 ^ i9) * (-11923)) ^ (-224094857);
                        i2 = -1886200795;
                    }
                    i10 = i;
                    i13 = i13;
                    i11 = iM2761 ^ i2;
                    break;
                case 1425757060:
                case 2099871195:
                    i13 = i13;
                    if (str3 != null) {
                        iM2761 = (C0773.m3169("᩷ۘ") ^ i8) * (-45);
                        i = ((iM2761 ^ i9) * (-25683)) ^ (-1897510068);
                        i2 = 1076562198;
                    } else {
                        iM2761 = C0773.m3169("۫ۧ") ^ i9;
                        i = ((iM2761 ^ i8) * 23411) ^ 1259290958;
                        i2 = 1750693868;
                    }
                    i10 = i;
                    i13 = i13;
                    i11 = iM2761 ^ i2;
                    break;
                default:
                    i13 = i13;
                    z2 = true;
                    if (iM33683 < 1) {
                        iM3169 = C0619.m2761("ܳ᩶") ^ i8;
                        i3 = ((iM3169 ^ i9) * 13817) ^ (-1816277032);
                        i4 = 1789624336;
                        int i1117 = iM3169 ^ i4;
                        i10 = i3;
                        i13 = i13;
                        i11 = i1117;
                        str3 = str2;
                    } else {
                        iM2761 = C0773.m3169("ۗܳ") ^ i8;
                        i = ((iM2761 ^ i9) * (-29385)) ^ 143378248;
                        i2 = -249513222;
                        i10 = i;
                        i13 = i13;
                        i11 = iM2761 ^ i2;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27449(C13778 c13778, String str, String str2) throws IOException {
        boolean z = false;
        int i = 1043416903;
        int i2 = C2702.f8586;
        int i3 = C3448.f11240;
        int iM2761 = (C0619.m2761("᩶᩸") + i2) * (-29);
        int i4 = ((iM2761 ^ i3) * (-9575)) ^ (-1468637931);
        int i5 = -835003757;
        while (true) {
            i = ((((i ^ i3) * (-29201)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2140307092:
                case 716236132:
                    if (C0619.m2763()) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6329)) ^ 314280237;
                        i5 = -77084417;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۜ᩶")) * 59;
                        i4 = ((iM2761 ^ i2) * 30723) ^ 2027172891;
                        i5 = -1345813859;
                    }
                    break;
                case -2129984860:
                case -921459342:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6329)) ^ 314280237;
                        i5 = -77084417;
                    } else {
                        iM2761 = C0619.m2761("᩺᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21033) ^ (-1819983322);
                        i5 = -1063371425;
                    }
                    break;
                case -2097029463:
                case 492124989:
                    z = true;
                    iM2761 = C0773.m3169("֡ۤ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 16533) ^ 475029243;
                    i5 = -2005385272;
                    break;
                case -2094606348:
                case 78772607:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i2) * (-53);
                        i4 = ((iM2761 ^ i3) * 25921) ^ 972314223;
                        i5 = 749883336;
                    } else {
                        iM2761 = (C0619.m2761("֡᩸") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * 18261) ^ (-1975810055);
                        i5 = -131451864;
                    }
                    break;
                case -1997302365:
                case 792379887:
                    if (C2288.m7767()) {
                        iM2761 = (i2 - C0773.m3169("۬ܽ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i3) * (-23037)) ^ 1028063915;
                        i5 = -1856711351;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽ۫")) * (-119);
                        i4 = ((iM2761 ^ i2) * (-21875)) ^ (-1512698951);
                        i5 = -910072595;
                    }
                    break;
                case -1888845014:
                case 655351257:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("ۡ۫") ^ i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 9987) ^ 940327945;
                        i5 = 1707997878;
                    } else {
                        iM2761 = C0773.m3169("᩶۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 399) ^ 522635210;
                        i5 = -884274307;
                    }
                    break;
                case -1798761466:
                case -726994832:
                    if (C2375.m8065() > 0) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6329)) ^ 314280237;
                        i5 = -77084417;
                    } else {
                        iM2761 = C0773.m3169("ᩴۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 12005) ^ 1309396342;
                        i5 = 1909750742;
                    }
                    break;
                case -1717633642:
                case 498327180:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۡ۫") ^ i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 9987) ^ 940327945;
                        i5 = 1707997878;
                    } else {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i2) * (-53);
                        i4 = ((iM2761 ^ i3) * 25921) ^ 972314223;
                        i5 = 749883336;
                    }
                    break;
                case -1338457663:
                case 764118275:
                    C2287.m7745();
                    iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-6329)) ^ 314280237;
                    i5 = -77084417;
                    break;
                case -1291185072:
                case 2097437698:
                    C17202.m40372();
                    C0487.m2356();
                    break;
                case -1052471881:
                case 2100760570:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("ۡ۫") ^ i3) * (-61);
                        i4 = ((iM2761 ^ i2) * 9987) ^ 940327945;
                        i5 = 1707997878;
                    } else {
                        iM2761 = C0619.m2761("ᩴ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6769)) ^ 925052567;
                        i5 = 1658665011;
                    }
                    break;
                case -1018297326:
                case 282833747:
                    if (!C1783.m6232()) {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i2) * (-53);
                        i4 = ((iM2761 ^ i3) * 25921) ^ 972314223;
                        i5 = 749883336;
                    } else {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6329)) ^ 314280237;
                        i5 = -77084417;
                    }
                    break;
                case -807030539:
                case 1538712088:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (i2 - C0773.m3169("۬ܽ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i3) * (-23037)) ^ 1028063915;
                        i5 = -1856711351;
                    } else {
                        iM2761 = (C0773.m3169("ۢۧ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * 4925) ^ 11965534;
                        i5 = 1227311492;
                    }
                    break;
                case -767972409:
                case -670706511:
                    if (C1542.m5459() >= 0) {
                        iM2761 = (i2 - C0773.m3169("۬ܽ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i3) * (-23037)) ^ 1028063915;
                        i5 = -1856711351;
                    } else {
                        iM2761 = C0619.m2761("᩻۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13705) ^ 1862648314;
                        i5 = 622172598;
                    }
                    break;
                case -204995162:
                case 1589954786:
                    if (C1146.m4231()) {
                        iM2761 = C0619.m2761("۟ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3559)) ^ 846137512;
                        i5 = 1765958198;
                    } else {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i2) * (-53);
                        i4 = ((iM2761 ^ i3) * 25921) ^ 972314223;
                        i5 = 749883336;
                    }
                    break;
                case 87361833:
                case 232352640:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i2) * (-53);
                        i4 = ((iM2761 ^ i3) * 25921) ^ 972314223;
                        i5 = 749883336;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۢᩴ")) * (-9);
                        i4 = ((iM2761 ^ i3) * (-22411)) ^ (-866557276);
                        i5 = 719749156;
                    }
                    break;
                case 972823098:
                case 1836598746:
                    if (str2 != null) {
                        iM2761 = (C0619.m2761("ۡۙ") ^ i2) * (-83);
                        i4 = ((iM2761 ^ i3) * 31635) ^ (-1006636062);
                        i5 = -1726508311;
                    } else {
                        iM2761 = (C0773.m3169("ۨ᩷") ^ i3) * 71;
                        i4 = ((iM2761 ^ i2) * 3053) ^ 1028726664;
                        i5 = 1188577460;
                    }
                    break;
                case 1321034907:
                case 1613837837:
                    m27450(c13778, str, str2, z);
                    break;
                default:
                    z = false;
                    iM2761 = C0773.m3169("֡ۤ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 16533) ^ 475029243;
                    i5 = -2005385272;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[PHI: r7
      0x0117: PHI (r7v13 l.ۛۚۤ) = (r7v5 l.ۛۚۤ), (r7v4 l.ۛۚۤ), (r7v4 l.ۛۚۤ), (r7v4 l.ۛۚۤ) binds: [B:50:0x0115, B:14:0x003d, B:11:0x0035, B:8:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m27455(byte[] bArr) {
        int iM2761;
        int i;
        byte[] bArrDigest = null;
        int i2 = 29059822;
        int i3 = C23916.f77426;
        int i4 = C3448.f11240;
        int iM2762 = C0619.m2761("᩷ۙ") ^ i4;
        int i5 = ((iM2762 ^ i3) * 26097) ^ 1226994266;
        int i6 = -1255901145;
        while (true) {
            int i7 = iM2762 ^ i6;
            C6178 c6178 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 25499) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1863705879:
                    case 1882558340:
                        bArrDigest = C15022.m36179().digest(bArr);
                        if (C2287.f7432 < 0) {
                            iM2761 = C0619.m2761("᩺֫") ^ i4;
                            i5 = ((iM2761 ^ i3) * 23107) ^ (-486054270);
                            i = -330668004;
                            i7 = iM2761 ^ i;
                        } else {
                            iM2762 = (C0619.m2761("ᩳ᩶") ^ i3) * 69;
                            i5 = ((iM2762 ^ i4) * 22299) ^ 2002675155;
                            i6 = 476853638;
                        }
                        break;
                    case -1843895846:
                    case -294492373:
                        if (C2966.m9664()) {
                            iM2762 = (C0619.m2761("ᩳ᩶") ^ i3) * 69;
                            i5 = ((iM2762 ^ i4) * 22299) ^ 2002675155;
                            i6 = 476853638;
                        }
                        iM2761 = (i3 - C0773.m3169("ۧ۟")) * 57;
                        i5 = ((iM2761 ^ i4) * (-9705)) ^ (-1403320611);
                        i = -349240281;
                        i7 = iM2761 ^ i;
                        break;
                    case -1757197454:
                    case -1645272798:
                        c6178.write(bArr);
                        if (AbstractC3624.m11755() == 0) {
                            iM2761 = (C0773.m3169("᩹۬") ^ i4) * 79;
                            i5 = ((iM2761 ^ i3) * 18397) ^ 46798996;
                            i = -557173025;
                            i7 = iM2761 ^ i;
                        } else {
                            iM2762 = (C0619.m2761("᩵ܺ") ^ i4) * (-73);
                            i5 = ((iM2762 ^ i3) * 25881) ^ (-339048886);
                            i6 = 751644238;
                        }
                        break;
                    case -1659354327:
                    case -1039915377:
                        if (C1826.f6190 <= 0) {
                            iM2762 = (i4 - C0619.m2761("ۨۤ")) * (-117);
                            i5 = ((iM2762 ^ i3) * (-21691)) ^ (-877500432);
                            i6 = 747345862;
                        }
                        iM2761 = (i3 - C0773.m3169("ۧ۟")) * 57;
                        i5 = ((iM2761 ^ i4) * (-9705)) ^ (-1403320611);
                        i = -349240281;
                        i7 = iM2761 ^ i;
                        break;
                    case -1116421073:
                    case -483217581:
                        C3734.m12152();
                        C1146.m4231();
                        return null;
                    case -96841592:
                    case 2002669888:
                        if (C4238.m13540() <= 0) {
                            iM2761 = (i3 - C0619.m2761("ۡ֫")) * 75;
                            i5 = ((iM2761 ^ i4) * 32117) ^ 1310743510;
                            i = -1553205961;
                        } else {
                            iM2761 = (i3 - C0773.m3169("ۧ۟")) * 57;
                            i5 = ((iM2761 ^ i4) * (-9705)) ^ (-1403320611);
                            i = -349240281;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 67169995:
                    case 812393034:
                        c6178.write(bArrDigest);
                        return c6178.m17796();
                    case 1191015627:
                    case 1567555523:
                        if (C0269.f1558 > 0 && C3033.f9831 < 0) {
                            if (C3779.f12953 > 0) {
                                if (C1542.f5343 > 0) {
                                    if (C0862.m3503()) {
                                        if (C4238.m13540() <= 0 || C23916.f77426 <= 0) {
                                            iM2762 = (i4 - C0619.m2761("ۨۤ")) * (-117);
                                            i5 = ((iM2762 ^ i3) * (-21691)) ^ (-877500432);
                                            i6 = 747345862;
                                        } else {
                                            c6178 = new C6178();
                                            if (C1343.f4799 != 0) {
                                                iM2761 = (i3 - C0773.m3169("ۧ۟")) * 57;
                                                i5 = ((iM2761 ^ i4) * (-9705)) ^ (-1403320611);
                                                i = -349240281;
                                            } else {
                                                iM2761 = (C0619.m2761("ܽ֫") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i5 = ((iM2761 ^ i4) * (-15653)) ^ (-518823090);
                                                i = 354148158;
                                            }
                                            i7 = iM2761 ^ i;
                                        }
                                        break;
                                    }
                                }
                            }
                            iM2762 = (C0619.m2761("᩵ܺ") ^ i4) * (-73);
                            i5 = ((iM2762 ^ i3) * 25881) ^ (-339048886);
                            i6 = 751644238;
                            break;
                        }
                        iM2762 = (C0619.m2761("ᩳ᩶") ^ i3) * 69;
                        i5 = ((iM2762 ^ i4) * 22299) ^ 2002675155;
                        i6 = 476853638;
                        break;
                    default:
                        C2310.m7813();
                        iM2761 = (i3 - C0619.m2761("ۡ֫")) * 75;
                        i5 = ((iM2761 ^ i4) * 32117) ^ 1310743510;
                        i = -1553205961;
                        i7 = iM2761 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13778 m27443() {
        C21962 c21962M33138 = null;
        C2592 c2592M6238 = null;
        String str = null;
        String str2 = null;
        long j = 0;
        C13778 c13778M8682 = null;
        C21962 c21962M27445 = null;
        String str3 = null;
        int i = 1210252531;
        int i2 = C1146.f4234;
        int i3 = C1080.f3865;
        int iM3169 = C0773.m3169("ܺ۬") ^ i2;
        int i4 = ((iM3169 ^ i3) * 13129) ^ 229548734;
        int i5 = -1760845555;
        while (true) {
            i = ((((i ^ i3) * (-10053)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2127310250:
                case -1903869826:
                    return c13778M8682;
                case -2079250384:
                case -598781308:
                    c21962M27445.f70888 = str3;
                    c21962M27445.f70884 = str3;
                    m27464(c21962M27445);
                    iM3169 = C0773.m3169("ۖ֡") ^ i3;
                    i4 = ((iM3169 ^ i2) * 28769) ^ 458466639;
                    i5 = -270309213;
                    break;
                case -1934942247:
                case -1631531403:
                    if (C1564.m5512(c21962M33138.f70886)) {
                        iM3169 = (i2 - C0773.m3169("ܺ᩺")) * 97;
                        i4 = ((iM3169 ^ i3) * 29061) ^ 2107495168;
                        i5 = 1322317674;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܶ۠")) * (-87);
                        i4 = ((iM3169 ^ i2) * (-21233)) ^ (-1512004692);
                        i5 = 6732270;
                    }
                    break;
                case -1823653080:
                case 557407354:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("ܳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13855)) ^ 1903097494;
                        i5 = 1816072601;
                    } else if (C11235.m28309() == 0) {
                        if (C3099.f10023 > 0) {
                            return new C13778(4);
                        }
                        iM3169 = C0619.m2761("ܿ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4227)) ^ 2096244280;
                        i5 = 1558332468;
                    } else {
                        iM3169 = C0619.m2761("ۧۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26181)) ^ (-115361263);
                        i5 = 144198105;
                    }
                    break;
                case -1778867624:
                case -1582775657:
                    c2592M6238.m8675(j);
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("ܿ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4227)) ^ 2096244280;
                        i5 = 1558332468;
                    } else {
                        iM3169 = C0619.m2761("֨ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-643)) ^ 2019884373;
                        i5 = 1765437749;
                    }
                    break;
                case -1692989567:
                case 774339773:
                    C11650.m29324();
                    iM3169 = C0773.m3169("᩸۬") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-2431)) ^ (-796441418);
                    i5 = 1056908552;
                    break;
                case -1384216754:
                case 881190848:
                    if (c13778M8682.m33682()) {
                        iM3169 = (C0773.m3169("ۚᩴ") ^ i3) * 27;
                        i4 = ((iM3169 ^ i2) * (-26559)) ^ 1020600184;
                        i5 = 233968123;
                    } else {
                        iM3169 = C0773.m3169("᩸۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2431)) ^ (-796441418);
                        i5 = 1056908552;
                    }
                    break;
                case -1302532586:
                case 621148510:
                    c13778M8682 = c2592M6238.m8682();
                    if (C2878.m9488(c13778M8682)) {
                        iM3169 = (C0773.m3169("ۨ۫") + i2) * (-59);
                        i4 = ((iM3169 ^ i3) * (-25249)) ^ (-452429100);
                        i5 = -1119959424;
                    } else {
                        iM3169 = C0773.m3169("ۖ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28769) ^ 458466639;
                        i5 = -270309213;
                    }
                    break;
                case -1163260680:
                case 1893760192:
                    c2592M6238 = C1783.m6238(o.a.m);
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ܿ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4227)) ^ 2096244280;
                        i5 = 1558332468;
                    } else {
                        iM3169 = (C0773.m3169("ܳᩳ") + i2) * 115;
                        i4 = ((iM3169 ^ i3) * 5741) ^ 1074990582;
                        i5 = -2043556649;
                    }
                    break;
                case -1076116148:
                case -325321286:
                    C3077.m10041();
                    if (C23916.f77426 > 0) {
                        iM3169 = (i2 - C0619.m2761("ᩳᩴ")) * 35;
                        i4 = ((iM3169 ^ i3) * (-1515)) ^ 848172934;
                        i5 = 1040157777;
                    } else {
                        iM3169 = C0773.m3169("ܳۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24093)) ^ (-1266406605);
                        i5 = 812737030;
                    }
                    break;
                case -1060859631:
                case 977676913:
                    str = c21962M33138.f70888;
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ᩳᩴ")) * 35;
                        i4 = ((iM3169 ^ i3) * (-1515)) ^ 848172934;
                        i5 = 1040157777;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۗۜ")) * (-121);
                        i4 = ((iM3169 ^ i3) * (-12103)) ^ (-448634701);
                        i5 = 1675029518;
                    }
                    break;
                case -1034610789:
                case 661789181:
                    c21962M33138 = C13473.m33138();
                    if (c21962M33138 != null) {
                        iM3169 = C0619.m2761("֡ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31965) ^ (-937064059);
                        i5 = 1473117286;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܺ᩺")) * 97;
                        i4 = ((iM3169 ^ i3) * 29061) ^ 2107495168;
                        i5 = 1322317674;
                    }
                    break;
                case -738278429:
                case 1530660122:
                    C1343.m4943();
                    if (C1080.f3865 < 0) {
                        iM3169 = C0773.m3169("ܳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13855)) ^ 1903097494;
                        i5 = 1816072601;
                    } else {
                        iM3169 = C0773.m3169("ܳۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24093)) ^ (-1266406605);
                        i5 = 812737030;
                    }
                    break;
                case -608709214:
                case -286612647:
                    c21962M27445 = m27445(c21962M33138);
                    str3 = "";
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("ۧۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26181)) ^ (-115361263);
                        i5 = 144198105;
                    } else {
                        iM3169 = C0773.m3169("۫᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20075) ^ 252310070;
                        i5 = -1207749457;
                    }
                    break;
                case -599345603:
                case -418119833:
                    RunnableC1848.m6360();
                    iM3169 = C0773.m3169("ܳۛ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-24093)) ^ (-1266406605);
                    i5 = 812737030;
                    break;
                case -350760218:
                case 2084113843:
                    AbstractC0641.m2813();
                    return null;
                case -186848443:
                case -77142723:
                    c2592M6238.m8676(str);
                    str2 = c21962M33138.f70886;
                    if (C1321.m4852()) {
                        iM3169 = C0619.m2761("֡᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11669)) ^ 725577219;
                        i5 = -752725456;
                    } else {
                        iM3169 = C0619.m2761("ܿ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4227)) ^ 2096244280;
                        i5 = 1558332468;
                    }
                    break;
                case 138726446:
                case 851173785:
                    C1080.m4048(c2592M6238, str2);
                    j = c21962M33138.f70883;
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("ܳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13855)) ^ 1903097494;
                        i5 = 1816072601;
                    } else {
                        iM3169 = C0619.m2761("۬ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17945)) ^ (-517056399);
                        i5 = 629219618;
                    }
                    break;
                case 500936530:
                case 585470611:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۧۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26181)) ^ (-115361263);
                        i5 = 144198105;
                    } else {
                        iM3169 = C0773.m3169("ܳۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24093)) ^ (-1266406605);
                        i5 = 812737030;
                    }
                    break;
                default:
                    c21962M27445.f70889 = str3;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ᩳᩴ")) * 35;
                        i4 = ((iM3169 ^ i3) * (-1515)) ^ 848172934;
                        i5 = 1040157777;
                    } else {
                        iM3169 = C0773.m3169("ۤۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15559) ^ (-473042643);
                        i5 = 1815531763;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0283 A[PHI: r0 r1
      0x0283: PHI (r0v28 java.lang.String) = (r0v27 java.lang.String), (r0v29 java.lang.String) binds: [B:71:0x0269, B:65:0x0244] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r1v4 l.᩷ۡ᩻) = (r1v3 l.᩷ۡ᩻), (r1v2 l.᩷ۡ᩻) binds: [B:71:0x0269, B:65:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02f6 A[PHI: r0 r7 r9 r11 r12 r14 r15
      0x02f6: PHI (r0v69 java.lang.String) = (r0v24 java.lang.String), (r0v30 java.lang.String), (r0v70 java.lang.String) binds: [B:81:0x02f4, B:61:0x0221, B:17:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:81:0x02f4, B:61:0x0221, B:17:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v6 int) binds: [B:81:0x02f4, B:61:0x0221, B:17:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:81:0x02f4, B:61:0x0221, B:17:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:81:0x02f4, B:61:0x0221, B:17:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:81:0x02f4, B:61:0x0221, B:17:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:81:0x02f4, B:61:0x0221, B:17:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C13778 m27460() throws IOException {
        int iM2761;
        int i;
        int i2;
        String str;
        short s;
        String str2;
        String str3;
        short s2;
        int iM3169;
        int i3;
        int iM2762;
        int i4;
        int i5;
        int i6;
        int iM2763;
        String str4;
        int i7 = C1321.f4751;
        int i8 = C2375.f7641;
        int iM31610 = C0773.m3169("۟ۢ") ^ i7;
        int i9 = ((iM31610 ^ i8) * (-4053)) ^ (-1918062200);
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM31610 ^ (-695139575);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s3 = 0;
        int i17 = 1902205399;
        int i18 = 0;
        short[] sArr3 = null;
        C13778 c13778M8682 = null;
        String str5 = null;
        C2592 c2592M12270 = null;
        String strM27441 = null;
        String string = null;
        C21962 c21962M33138 = null;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i8) * (-7481)) >> 31));
            switch (i17) {
                case -2142679539:
                case 1490697095:
                    str = strM27441;
                    s = s3;
                    int i19 = s * 23634;
                    if (C0487.f2131 <= 0) {
                        i18 = i19;
                        int iM31611 = (C0773.m3169("᩷۫") ^ i7) * 25;
                        String str6 = str;
                        i9 = ((iM31611 ^ i8) * 7931) ^ 1428481118;
                        i10 = iM31611 ^ 870113417;
                        str4 = str6;
                        s3 = s;
                        strM27441 = str4;
                    } else {
                        int iM2764 = C0619.m2761("ۗ᩺") ^ i8;
                        i9 = ((iM2764 ^ i7) * 16339) ^ (-246121694);
                        int i20 = iM2764 ^ 941547822;
                        i18 = i19;
                        s3 = s;
                        strM27441 = str;
                        i10 = i20;
                    }
                    break;
                case -2130917734:
                case 1950527957:
                    C1519.m5403();
                    C2966.m9664();
                    strM27441 = strM27441;
                    iM2762 = C0773.m3169("ۧۚ") ^ i7;
                    i = ((iM2762 ^ i8) * 1107) ^ 1950992296;
                    i4 = -2017544502;
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case -2085194894:
                case -869231677:
                    i15 = 55651;
                    iM2762 = (C0773.m3169("᩵᩵") + i7) * (-61);
                    i = ((iM2762 ^ i8) * (-15375)) ^ (-530922712);
                    i4 = -1004739089;
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case -2074206130:
                case -1847071223:
                    c2592M12270 = C3779.m12270(o.a.f82055l);
                    c2592M12270.m8676(strM27441);
                    if (AbstractC0116.m1243() == 0) {
                        iM2761 = (C0619.m2761("ᩳ۫") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i8) * (-24169)) ^ 580601174;
                        i2 = -353755357;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    }
                    str3 = strM27441;
                    s2 = s3;
                    iM3169 = C0619.m2761("۠᩵") ^ i7;
                    i = ((iM3169 ^ i8) * (-18531)) ^ (-1662395359);
                    i3 = -1409308078;
                    int i21 = iM3169 ^ i3;
                    s3 = s2;
                    strM27441 = str3;
                    i10 = i21;
                    i9 = i;
                    break;
                case -1999247746:
                case 1200397374:
                    strM27441 = strM27441;
                    c21962M33138 = C13473.m33138();
                    if (c21962M33138 != null) {
                        iM2762 = (C0773.m3169("ܳ֨") ^ i7) * 101;
                        i = ((iM2762 ^ i8) * 24521) ^ 8221130;
                        i4 = 2017647986;
                    } else {
                        iM2762 = (C0619.m2761("ܳ᩸") ^ i8) * (-99);
                        i = ((iM2762 ^ i7) * 30211) ^ 652997312;
                        i4 = -1874584280;
                    }
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case -1936951942:
                case 1484627731:
                    return m27443();
                case -1875282042:
                case 405036944:
                    strM27441 = strM27441;
                    if ((i13 + i14) - i18 >= 0) {
                        iM2762 = (C0619.m2761("ۘ֡") + i8) * (-43);
                        i = ((iM2762 ^ i7) * 28995) ^ 128870929;
                        i4 = 649137752;
                    } else {
                        iM2762 = C0619.m2761("ܰۗ") ^ i7;
                        i = ((iM2762 ^ i8) * 27721) ^ (-2007791172);
                        i4 = 1789438239;
                    }
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case -1627172345:
                case 1172755503:
                    strM27441 = strM27441;
                    sArr = f34193;
                    i16 = 324;
                    i11 = 3;
                    if (C23916.f77426 <= 0) {
                        iM2762 = C0773.m3169("ۧۚ") ^ i7;
                        i = ((iM2762 ^ i8) * 1107) ^ 1950992296;
                        i4 = -2017544502;
                    } else {
                        iM2762 = (C0619.m2761("۟ᩳ") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2762 ^ i7) * (-28747)) ^ (-297153290);
                        i4 = -1240584055;
                    }
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case -1573147933:
                case 764768657:
                    C1826.m6301();
                    if (C1146.f4234 >= 0) {
                        str2 = strM27441;
                        iM2763 = (C0619.m2761("ᩳۗ") + i8) * (-27);
                        i6 = ((iM2763 ^ i7) * (-30377)) ^ (-355294775);
                        i5 = 752083467;
                        str4 = str2;
                        i10 = iM2763 ^ i5;
                        i9 = i6;
                        strM27441 = str4;
                    } else {
                        strM27441 = strM27441;
                        iM2762 = C0773.m3169("ۧۚ") ^ i7;
                        i = ((iM2762 ^ i8) * 1107) ^ 1950992296;
                        i4 = -2017544502;
                        i10 = iM2762 ^ i4;
                        strM27441 = strM27441;
                        i9 = i;
                    }
                    break;
                case -1555265207:
                case -1386965685:
                    strM27441 = m27441(C3734.m12149(sArr2, i12, 6, i15), string);
                    if (C3492.f12043 > 0) {
                        iM2761 = (C0619.m2761("᩸֫") ^ i8) * (-75);
                        i = ((iM2761 ^ i7) * 2605) ^ (-1163318670);
                        i2 = 1391074907;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        str = strM27441;
                        s = s3;
                        int iM31612 = (C0773.m3169("᩷۫") ^ i7) * 25;
                        String str7 = str;
                        i9 = ((iM31612 ^ i8) * 7931) ^ 1428481118;
                        i10 = iM31612 ^ 870113417;
                        str4 = str7;
                        s3 = s;
                        strM27441 = str4;
                    }
                    break;
                case -1529099590:
                case 1565147774:
                    C2023.m6965(c2592M12270, str5);
                    c13778M8682 = c2592M12270.m8682();
                    if (C1564.m5516(c13778M8682)) {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i7) * (-31);
                        i = ((iM2761 ^ i8) * 11449) ^ (-969427621);
                        i2 = 522877952;
                    } else {
                        iM2761 = (C0619.m2761("ۧ֡") ^ i8) * (-107);
                        i = ((iM2761 ^ i7) * (-5335)) ^ 1942627741;
                        i2 = -791446894;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1440130597:
                case -107287447:
                    strM27441 = strM27441;
                    string = Long.toString(c21962M33138.f70883);
                    sArr2 = f34193;
                    if (C2485.f7950 == 0) {
                        iM2762 = C0773.m3169("۫᩻") ^ i8;
                        i = ((iM2762 ^ i7) * 31027) ^ 559313308;
                        i4 = 700153502;
                        i10 = iM2762 ^ i4;
                        strM27441 = strM27441;
                        i9 = i;
                    } else {
                        str3 = strM27441;
                        s2 = s3;
                        iM3169 = C0619.m2761("۠᩵") ^ i7;
                        i = ((iM3169 ^ i8) * (-18531)) ^ (-1662395359);
                        i3 = -1409308078;
                        int i22 = iM3169 ^ i3;
                        s3 = s2;
                        strM27441 = str3;
                        i10 = i22;
                        i9 = i;
                    }
                    break;
                case -1326182052:
                case -569451733:
                    return c13778M8682;
                case -1176349676:
                case -137894259:
                    if (c13778M8682.m33682()) {
                        iM2761 = C0619.m2761("ᩴ۟") ^ i8;
                        i = ((iM2761 ^ i7) * (-8165)) ^ 1841089761;
                        i2 = -2015363902;
                    } else {
                        iM2761 = C0619.m2761("֫֨") ^ i7;
                        i = ((iM2761 ^ i8) * 5655) ^ (-1865953538);
                        i2 = 376208250;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1125330136:
                case -625063104:
                    str5 = c21962M33138.f70886;
                    if (C2485.f7950 == 0) {
                        iM2761 = C0619.m2761("ۢۛ") ^ i8;
                        i = ((iM2761 ^ i7) * 4067) ^ 1860503189;
                        i2 = -804945158;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    }
                    str3 = strM27441;
                    s2 = s3;
                    iM3169 = C0619.m2761("۠᩵") ^ i7;
                    i = ((iM3169 ^ i8) * (-18531)) ^ (-1662395359);
                    i3 = -1409308078;
                    int i23 = iM3169 ^ i3;
                    s3 = s2;
                    strM27441 = str3;
                    i10 = i23;
                    i9 = i;
                    break;
                case -1035118892:
                case 1060495369:
                    strM27441 = strM27441;
                    if (C1564.m5512(c21962M33138.f70886)) {
                        iM2762 = (C0619.m2761("ܳ᩸") ^ i8) * (-99);
                        i = ((iM2762 ^ i7) * 30211) ^ 652997312;
                        i4 = -1874584280;
                    } else {
                        iM2762 = C0773.m3169("᩻֨") ^ i8;
                        i = ((iM2762 ^ i7) * (-12123)) ^ 1536354051;
                        i4 = -337707789;
                    }
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case -860340818:
                case 298382506:
                    m27450(c13778M8682, strM27441, (String) null, false);
                    return c13778M8682;
                case -508855006:
                case -217951664:
                    C11650.m29324();
                    iM2761 = C0619.m2761("֫֨") ^ i7;
                    i = ((iM2761 ^ i8) * 5655) ^ (-1865953538);
                    i2 = 376208250;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -176820380:
                case 444164650:
                    strM27441 = strM27441;
                    if (C2419.m8175(C3492.m11486(sArr, i16, i11, i15), c21962M33138.f70889)) {
                        iM2762 = (C0619.m2761("᩹ᩳ") ^ i7) * 65;
                        i = ((iM2762 ^ i8) * (-5223)) ^ (-475115663);
                        i4 = 352466866;
                    } else {
                        iM2762 = (i7 - C0619.m2761("ۚ᩵")) * (-27);
                        i = ((iM2762 ^ i8) * 26079) ^ 63916597;
                        i4 = -942618885;
                    }
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case -56441242:
                case 1624535419:
                    str2 = strM27441;
                    s3 = sArr3[c];
                    if (C1343.f4799 != 0) {
                        iM2763 = (C0619.m2761("ᩳۗ") + i8) * (-27);
                        i6 = ((iM2763 ^ i7) * (-30377)) ^ (-355294775);
                        i5 = 752083467;
                    } else {
                        iM2763 = (C0773.m3169("֡᩶") ^ i8) * 71;
                        i6 = ((iM2763 ^ i7) * (-18759)) ^ 79167741;
                        i5 = -371006247;
                    }
                    str4 = str2;
                    i10 = iM2763 ^ i5;
                    i9 = i6;
                    strM27441 = str4;
                    break;
                case 224893628:
                case 1106093830:
                    if (C2287.m7745() <= 0) {
                        iM2761 = (i8 - C0773.m3169("ܿۤ")) * 119;
                        i = ((iM2761 ^ i7) * (-32223)) ^ 2111664517;
                        i2 = -248459377;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        str2 = strM27441;
                        iM2763 = (C0619.m2761("ᩳۗ") + i8) * (-27);
                        i6 = ((iM2763 ^ i7) * (-30377)) ^ (-355294775);
                        i5 = 752083467;
                        str4 = str2;
                        i10 = iM2763 ^ i5;
                        i9 = i6;
                        strM27441 = str4;
                    }
                    break;
                case 258066597:
                case 1287691220:
                    strM27441 = strM27441;
                    i13 = s3 * s3;
                    i14 = 139641489;
                    if (C4282.f15546 <= 0) {
                        iM2762 = C0773.m3169("ۧۚ") ^ i7;
                        i = ((iM2762 ^ i8) * 1107) ^ 1950992296;
                        i4 = -2017544502;
                    } else {
                        iM2762 = C0619.m2761("ۡ᩶") ^ i7;
                        i = ((iM2762 ^ i8) * 10147) ^ 772794771;
                        i4 = -1094946978;
                    }
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case 304942601:
                case 556184930:
                    C1080.m4050();
                    RunnableC3646.m11813();
                    return null;
                case 359265234:
                case 1879639953:
                    str3 = strM27441;
                    s2 = s3;
                    sArr3 = f34193;
                    c = 323;
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("۠᩵") ^ i7;
                        i = ((iM3169 ^ i8) * (-18531)) ^ (-1662395359);
                        i3 = -1409308078;
                    } else {
                        iM3169 = C0773.m3169("ۡܰ") ^ i7;
                        i = ((iM3169 ^ i8) * 23223) ^ (-1111218186);
                        i3 = 1513801074;
                    }
                    int i24 = iM3169 ^ i3;
                    s3 = s2;
                    strM27441 = str3;
                    i10 = i24;
                    i9 = i;
                    break;
                case 786413757:
                case 1566906903:
                    i12 = 327;
                    if (C3099.f10023 > 0) {
                        iM2761 = C0773.m3169("᩵ᩴ") ^ i7;
                        i = ((iM2761 ^ i8) * (-31307)) ^ (-1895656189);
                        i2 = 97982637;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    }
                    strM27441 = strM27441;
                    iM2762 = C0773.m3169("ۧۚ") ^ i7;
                    i = ((iM2762 ^ i8) * 1107) ^ 1950992296;
                    i4 = -2017544502;
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
                case 972606746:
                case 1994762270:
                    C4238.m13540();
                    if (!C17202.f56030) {
                        str3 = strM27441;
                        s2 = s3;
                        iM3169 = C0619.m2761("۠᩵") ^ i7;
                        i = ((iM3169 ^ i8) * (-18531)) ^ (-1662395359);
                        i3 = -1409308078;
                        int i25 = iM3169 ^ i3;
                        s3 = s2;
                        strM27441 = str3;
                        i10 = i25;
                        i9 = i;
                    } else {
                        str2 = strM27441;
                        iM2763 = (C0619.m2761("ᩳۗ") + i8) * (-27);
                        i6 = ((iM2763 ^ i7) * (-30377)) ^ (-355294775);
                        i5 = 752083467;
                        str4 = str2;
                        i10 = iM2763 ^ i5;
                        i9 = i6;
                        strM27441 = str4;
                    }
                    break;
                case 1572839108:
                case 1971569601:
                    return new C13778(4);
                default:
                    i15 = 2625;
                    iM2762 = (C0773.m3169("᩵᩵") + i7) * (-61);
                    i = ((iM2762 ^ i8) * (-15375)) ^ (-530922712);
                    i4 = -1004739089;
                    i10 = iM2762 ^ i4;
                    strM27441 = strM27441;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x016a A[PHI: r1 r17
      0x016a: PHI (r1v3 ??) = (r1v2 ??), (r1v7 ??), (r1v8 ??) binds: [B:42:0x0168, B:16:0x007c, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r17v27 int) = (r17v16 int), (r17v26 int), (r17v29 int) binds: [B:42:0x0168, B:16:0x007c, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x025a A[PHI: r2 r8 r9 r17
      0x025a: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String), (r2v1 java.lang.String) binds: [B:62:0x0258, B:30:0x00de, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:62:0x0258, B:30:0x00de, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r9v3 short) = (r9v2 short), (r9v1 short), (r9v1 short) binds: [B:62:0x0258, B:30:0x00de, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r17v28 int) = (r17v8 int), (r17v19 int), (r17v29 int) binds: [B:62:0x0258, B:30:0x00de, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b1 A[PHI: r5 r6 r7 r13 r17 r18
      0x02b1: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char), (r5v1 char) binds: [B:70:0x02af, B:66:0x028f, B:50:0x01c1, B:46:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:70:0x02af, B:66:0x028f, B:50:0x01c1, B:46:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:70:0x02af, B:66:0x028f, B:50:0x01c1, B:46:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:70:0x02af, B:66:0x028f, B:50:0x01c1, B:46:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r17v14 int) = (r17v6 int), (r17v7 int), (r17v13 int), (r17v15 int) binds: [B:70:0x02af, B:66:0x028f, B:50:0x01c1, B:46:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r18v2 l.᩺ۚܺ) = (r18v1 l.᩺ۚܺ), (r18v1 l.᩺ۚܺ), (r18v1 l.᩺ۚܺ), (r18v3 l.᩺ۚܺ) binds: [B:70:0x02af, B:66:0x028f, B:50:0x01c1, B:46:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02e6 A[PHI: r3 r4 r11 r12 r17
      0x02e6: PHI (r3v4 java.lang.String) = 
      (r3v1 java.lang.String)
      (r3v3 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
     binds: [B:74:0x02e4, B:23:0x00a5, B:18:0x0080, B:16:0x007c, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:74:0x02e4, B:23:0x00a5, B:18:0x0080, B:16:0x007c, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r11v2 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v4 short[]) binds: [B:74:0x02e4, B:23:0x00a5, B:18:0x0080, B:16:0x007c, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v4 int) binds: [B:74:0x02e4, B:23:0x00a5, B:18:0x0080, B:16:0x007c, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r17v32 int) = (r17v5 int), (r17v22 int), (r17v25 int), (r17v26 int), (r17v31 int), (r17v35 int) binds: [B:74:0x02e4, B:23:0x00a5, B:18:0x0080, B:16:0x007c, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27454(boolean z, boolean z2) {
        int iM3169;
        int i;
        int i2;
        ?? r1 = 0;
        String strM28300 = null;
        String strM10092 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 2089895990;
        int i9 = C0950.f3488;
        int i10 = C0773.f2792;
        int iM2761 = C0619.m2761("֨ܰ") ^ i10;
        int i11 = ((iM2761 ^ i9) * 18907) ^ 996474293;
        int i12 = iM2761 ^ 1311377456;
        C24084 c24084M27462 = null;
        while (true) {
            int i13 = i12 ^ (i11 & (((i8 ^ i9) * 20795) >> 31));
            switch (i13) {
                case -2112462350:
                case 237571254:
                    i13 = i13;
                    i4 = i3 + 348046336;
                    s2 = 37312;
                    if (C3448.m11248() != 0) {
                        iM3169 = (i10 - C0773.m3169("ۧۨ")) * (-29);
                        i = ((iM3169 ^ i9) * 22803) ^ 267397227;
                        i2 = -262135043;
                    } else {
                        iM3169 = C0619.m2761("ᩴۛ") ^ i9;
                        i = ((iM3169 ^ i10) * 28195) ^ (-1245575993);
                        i2 = -1304479763;
                    }
                    int i14 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i14;
                    r1 = r1;
                    break;
                case -2034791096:
                case -1583980434:
                    i13 = i13;
                    if (z2) {
                        iM3169 = (i10 - C0619.m2761("᩸ۛ")) * 45;
                        i = ((iM3169 ^ i9) * (-7485)) ^ (-528591885);
                        i2 = 1968618379;
                    } else {
                        iM3169 = C0619.m2761("ۘ᩵") ^ i9;
                        i = ((iM3169 ^ i10) * 6849) ^ (-874449327);
                        i2 = -358760231;
                    }
                    int i15 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i15;
                    r1 = r1;
                    break;
                case -2032525557:
                case -731873164:
                    i13 = i13;
                    f34199 = true;
                    if (z) {
                        iM3169 = (C0619.m2761("ܰۢ") + i9) * 7;
                        i = ((iM3169 ^ i10) * 1675) ^ 1662801204;
                        i2 = -1816549780;
                    } else {
                        iM3169 = C0619.m2761("᩸ۨ") ^ i9;
                        i = ((iM3169 ^ i10) * 17663) ^ 1188421165;
                        i2 = 918474034;
                    }
                    int i16 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i16;
                    r1 = r1;
                    break;
                case -1911955361:
                case -490856994:
                    i13 = i13;
                    s = sArr[c];
                    i3 = s * s;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("ۡ᩷") + i10) * (-97);
                        i = ((iM3169 ^ i9) * 29345) ^ 1373214691;
                        i2 = 1214023247;
                    } else {
                        iM3169 = (i10 - C0773.m3169("᩺ۜ")) * 115;
                        i = ((iM3169 ^ i9) * 15205) ^ (-751570999);
                        i2 = 1972725395;
                    }
                    int i17 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i17;
                    r1 = r1;
                    break;
                case -1357707042:
                case 2056933192:
                    i13 = i13;
                    m27451(m27462(strM10092));
                    f34196 = r1;
                    iM3169 = C0619.m2761("ۘ᩵") ^ i9;
                    i = ((iM3169 ^ i10) * 6849) ^ (-874449327);
                    i2 = -358760231;
                    int i18 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i18;
                    r1 = r1;
                    break;
                case -1316043394:
                case 283828419:
                    i13 = i13;
                    strM28300 = C11235.m28300(f34193, 250, 4, i5);
                    if (C3690.m11987()) {
                        iM3169 = (i10 - C0773.m3169("ۧۨ")) * (-29);
                        i = ((iM3169 ^ i9) * 22803) ^ 267397227;
                        i2 = -262135043;
                    } else {
                        iM3169 = C0773.m3169("ܿۚ") ^ i10;
                        i = ((iM3169 ^ i9) * (-7237)) ^ (-2130708200);
                        i2 = 1611143926;
                    }
                    int i19 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i19;
                    r1 = r1;
                    break;
                case -1163772811:
                case 1631986532:
                    i13 = i13;
                    m27451(c24084M27462);
                    r1 = 0;
                    r1 = 0;
                    f34197 = null;
                    if (C3998.m12920()) {
                        iM3169 = C0619.m2761("ܰܺ") ^ i10;
                        i = ((iM3169 ^ i9) * 12491) ^ 1251083802;
                        i2 = -1493295401;
                    } else {
                        iM3169 = (C0773.m3169("ۗۛ") ^ i9) * (-37);
                        i = ((iM3169 ^ i10) * (-13895)) ^ 1129600059;
                        i2 = 1838257827;
                    }
                    int i110 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i110;
                    r1 = r1;
                    break;
                case -1146368703:
                case 319903973:
                    i5 = 31731;
                    iM3169 = (C0619.m2761("᩸ۗ") ^ i9) * (-117);
                    i = ((iM3169 ^ i10) * 32017) ^ (-1545908455);
                    i2 = -1255043388;
                    int i111 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i111;
                    r1 = r1;
                    break;
                case -1047961547:
                case 534295130:
                    C4282.m13644();
                    break;
                case -641338802:
                case 1461988832:
                    C1321.m4852();
                    if (C2419.f7754 < 0) {
                        i13 = i13;
                        iM3169 = (i10 - C0619.m2761("ۡۗ")) * (-73);
                        i = ((iM3169 ^ i9) * 25019) ^ (-777251636);
                        i2 = 1322707023;
                    } else {
                        iM3169 = C0773.m3169("ۜᩴ") ^ i9;
                        i13 = i13;
                        i = ((iM3169 ^ i10) * (-18573)) ^ (-1998720986);
                        i2 = -1966975995;
                    }
                    int i112 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i112;
                    r1 = r1;
                    break;
                case -613025098:
                case 311854372:
                    i13 = i13;
                    m27451(m27462(strM28300));
                    f34195 = r1;
                    iM3169 = C0619.m2761("᩸ۨ") ^ i9;
                    i = ((iM3169 ^ i10) * 17663) ^ 1188421165;
                    i2 = 918474034;
                    int i113 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i113;
                    r1 = r1;
                    break;
                case -590251847:
                case 398192358:
                    i13 = i13;
                    c24084M27462 = m27462(C2310.m7803(sArr2, i6, i7, i5));
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("ۡ᩷") + i10) * (-97);
                        i = ((iM3169 ^ i9) * 29345) ^ 1373214691;
                        i2 = 1214023247;
                    } else {
                        iM3169 = C0619.m2761("᩷ۧ") ^ i9;
                        i = ((iM3169 ^ i10) * (-5955)) ^ (-1475610288);
                        i2 = 764055817;
                    }
                    int i114 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i114;
                    r1 = r1;
                    break;
                case -348050800:
                case 1344241349:
                    i13 = i13;
                    strM10092 = C3099.m10092(f34193, Scalar25519.TARGET_LENGTH, 4, i5);
                    if (C0773.f2792 <= 0) {
                        iM3169 = (i10 - C0619.m2761("ۡۗ")) * (-73);
                        i = ((iM3169 ^ i9) * 25019) ^ (-777251636);
                        i2 = 1322707023;
                    } else {
                        iM3169 = C0619.m2761("ۧܰ") ^ i9;
                        i = ((iM3169 ^ i10) * (-4679)) ^ 1486214362;
                        i2 = 943211483;
                    }
                    int i115 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i115;
                    r1 = r1;
                    break;
                case -196773723:
                case -191311790:
                    i13 = i13;
                    C3033.m9845();
                    r1 = r1;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i10 - C0619.m2761("ۡۗ")) * (-73);
                        i = ((iM3169 ^ i9) * 25019) ^ (-777251636);
                        i2 = 1322707023;
                    } else {
                        iM3169 = (C0773.m3169("ۗۛ") ^ i9) * (-37);
                        i = ((iM3169 ^ i10) * (-13895)) ^ 1129600059;
                        i2 = 1838257827;
                    }
                    int i116 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i116;
                    r1 = r1;
                    break;
                case 132983184:
                case 501820721:
                    i13 = i13;
                    RunnableC1848.m6360();
                    r1 = r1;
                    if (C1146.m4231()) {
                        iM3169 = (C0773.m3169("ۗۛ") ^ i9) * (-37);
                        i = ((iM3169 ^ i10) * (-13895)) ^ 1129600059;
                        i2 = 1838257827;
                    } else {
                        iM3169 = (i10 - C0773.m3169("ۧۨ")) * (-29);
                        i = ((iM3169 ^ i9) * 22803) ^ 267397227;
                        i2 = -262135043;
                    }
                    int i117 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i117;
                    r1 = r1;
                    break;
                case 237662667:
                case 1079564683:
                    i5 = 28482;
                    iM3169 = (C0619.m2761("᩸ۗ") ^ i9) * (-117);
                    i = ((iM3169 ^ i10) * 32017) ^ (-1545908455);
                    i2 = -1255043388;
                    int i118 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i118;
                    r1 = r1;
                    break;
                case 622304038:
                case 1737800327:
                    i13 = i13;
                    if (i4 - (s * s2) >= 0) {
                        iM3169 = C0773.m3169("ܶ᩷") ^ i10;
                        i = ((iM3169 ^ i9) * (-21227)) ^ 1816218260;
                        i2 = 2092233571;
                    } else {
                        iM3169 = C0773.m3169("ۡ۠") ^ i9;
                        i = ((iM3169 ^ i10) * 3423) ^ (-646640510);
                        i2 = 746620786;
                    }
                    int i119 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i119;
                    r1 = r1;
                    break;
                case 652111821:
                case 1969851981:
                    i13 = i13;
                    c = 245;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("ۡ᩷") + i10) * (-97);
                        i = ((iM3169 ^ i9) * 29345) ^ 1373214691;
                        i2 = 1214023247;
                    } else {
                        iM3169 = (C0619.m2761("ܺۚ") + i9) * (-125);
                        i = ((iM3169 ^ i10) * (-31025)) ^ (-599917950);
                        i2 = -839324422;
                    }
                    int i1110 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i1110;
                    r1 = r1;
                    break;
                case 773290601:
                case 1261203899:
                    i13 = i13;
                    C1783.m6232();
                    iM3169 = (i10 - C0619.m2761("ۡۗ")) * (-73);
                    i = ((iM3169 ^ i9) * 25019) ^ (-777251636);
                    i2 = 1322707023;
                    int i1111 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i1111;
                    r1 = r1;
                    break;
                case 958516257:
                case 2109126760:
                    C11650.m29324();
                    break;
                case 1018480145:
                case 1072575419:
                    i13 = i13;
                    sArr = f34193;
                    if (C13473.f42873 != 0) {
                        iM3169 = (i10 - C0619.m2761("ۡۗ")) * (-73);
                        i = ((iM3169 ^ i9) * 25019) ^ (-777251636);
                        i2 = 1322707023;
                    } else {
                        iM3169 = C0773.m3169("֫ܰ") ^ i10;
                        i = ((iM3169 ^ i9) * 7857) ^ 1091222496;
                        i2 = 1413521793;
                    }
                    int i1112 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i1112;
                    r1 = r1;
                    break;
                case 1064786750:
                case 1595952579:
                    i13 = i13;
                    i7 = 4;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("ۡ᩷") + i10) * (-97);
                        i = ((iM3169 ^ i9) * 29345) ^ 1373214691;
                        i2 = 1214023247;
                    } else {
                        iM3169 = C0773.m3169("᩸ۡ") ^ i10;
                        i = ((iM3169 ^ i9) * 26641) ^ 1130791667;
                        i2 = -1370735751;
                    }
                    int i1113 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i1113;
                    r1 = r1;
                    break;
                default:
                    i13 = i13;
                    C11650.m29326();
                    sArr2 = f34193;
                    i6 = 246;
                    if (C1519.f5300 >= 0) {
                        iM3169 = (i10 - C0619.m2761("ۡۗ")) * (-73);
                        i = ((iM3169 ^ i9) * 25019) ^ (-777251636);
                        i2 = 1322707023;
                    } else {
                        iM3169 = (i10 - C0619.m2761("۬֨")) * 73;
                        i = ((iM3169 ^ i9) * (-21663)) ^ (-445906076);
                        i2 = -1853439957;
                    }
                    int i1114 = i13;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    i8 = i1114;
                    r1 = r1;
                    break;
            }
            return;
        }
    }
}
