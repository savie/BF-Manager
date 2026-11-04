package l;

import android.util.Base64;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1PE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20195 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f64830 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f64832;

    /* JADX INFO: renamed from: ۜᩴܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f64831 = {2329, 3370, 9291, 9489, 1764, -10499, -12182, -16143, 6170, -11140, -3068, 11726, 411, 19398, 24339, 19287, 13443, 13466, 13470, 13507, 13469, 13466, 13441, 13468, 13451, 13504, 13443, 13466, 13532, 13504, 13453, 13440, 13443, 13466, 13507, 13470, 13468, 13441, 13466, 13451, 13453, 13466, 13504, 13441, 13469, 13469, 13507, 13455, 13453, 13453, 13451, 13442, 13451, 13468, 13455, 13466, 13451, 13504, 13455, 13442, 13447, 13463, 13467, 13440, 13453, 13469, 13504, 13453, 13441, 13443, 1370, -25953, -24934, -29704, -1707, -1716, -1720, -1771, -1717, -1716, -1705, -1718, -1699, -1770, -1707, -1716, -1782, -1770, -1701, -1706, -1707, -1716, -1771, -1720, -1718, -1705, -1716, -1699, -1701, -1716, -1770, -1705, -1717, -1717, -1771, -1703, -1701, -1701, -1699, -1708, -1699, -1718, -1703, -1716, -1699, -1770, -1703, -1708, -1711, -1727, -1715, -1706, -1701, -1717, -1770, -1701, -1705, -1707, 4425, 20139, -28080, -24836};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List f64833 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m46450() {
        return f64833;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d1 A[PHI: r8 r10 r11 r15
      0x00d1: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v1 java.lang.String), (r8v1 java.lang.String) binds: [B:28:0x00cf, B:17:0x0085, B:92:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:28:0x00cf, B:17:0x0085, B:92:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:28:0x00cf, B:17:0x0085, B:92:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r15v3 short[]) = (r15v2 short[]), (r15v1 short[]), (r15v1 short[]) binds: [B:28:0x00cf, B:17:0x0085, B:92:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b9 A[PHI: r4 r5 r6 r9 r12
      0x01b9: PHI (r4v21 java.lang.String[]) = 
      (r4v11 java.lang.String[])
      (r4v1 java.lang.String[])
      (r4v1 java.lang.String[])
      (r4v1 java.lang.String[])
      (r4v15 java.lang.String[])
      (r4v1 java.lang.String[])
     binds: [B:41:0x017a, B:24:0x00ab, B:19:0x0089, B:17:0x0085, B:50:0x01b5, B:91:0x01b9] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r5v48 java.lang.String) = 
      (r5v34 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v37 java.lang.String)
      (r5v1 java.lang.String)
     binds: [B:41:0x017a, B:24:0x00ab, B:19:0x0089, B:17:0x0085, B:50:0x01b5, B:91:0x01b9] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r6v5 char) = (r6v2 char), (r6v1 char), (r6v1 char), (r6v1 char), (r6v1 char), (r6v1 char) binds: [B:41:0x017a, B:24:0x00ab, B:19:0x0089, B:17:0x0085, B:50:0x01b5, B:91:0x01b9] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r9v5 java.lang.String) = 
      (r9v1 java.lang.String)
      (r9v2 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
     binds: [B:41:0x017a, B:24:0x00ab, B:19:0x0089, B:17:0x0085, B:50:0x01b5, B:91:0x01b9] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r12v6 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:41:0x017a, B:24:0x00ab, B:19:0x0089, B:17:0x0085, B:50:0x01b5, B:91:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x032a A[PHI: r16 r17 r18 r22 r24 r25
      0x032a: PHI (r16v6 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:76:0x0328, B:6:0x005c, B:47:0x01a2, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r17v6 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:76:0x0328, B:6:0x005c, B:47:0x01a2, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r18v6 short) = (r18v2 short), (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:76:0x0328, B:6:0x005c, B:47:0x01a2, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r22v38 java.lang.String[]) = (r22v6 java.lang.String[]), (r22v15 java.lang.String[]), (r22v30 java.lang.String[]), (r22v44 java.lang.String[]) binds: [B:76:0x0328, B:6:0x005c, B:47:0x01a2, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r24v7 short) = (r24v3 short), (r24v4 short), (r24v3 short), (r24v3 short) binds: [B:76:0x0328, B:6:0x005c, B:47:0x01a2, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r25v16 java.lang.String) = (r25v0 java.lang.String), (r25v8 java.lang.String), (r25v10 java.lang.String), (r25v17 java.lang.String) binds: [B:76:0x0328, B:6:0x005c, B:47:0x01a2, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m46448(AbstractC22044 abstractC22044, String str) throws C4866 {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        byte[] bArrM1777 = null;
        int i5 = 0;
        C13778 c13778M12915 = null;
        String[] strArr = null;
        String strM4049 = null;
        char c = 0;
        char c2 = 0;
        String str2 = null;
        String strM12925 = null;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 1579099541;
        int i8 = C2966.f9654;
        int i9 = C3734.f12817;
        int iM3169 = (C0773.m3169("֫ۛ") ^ i9) * (-17);
        int i10 = ((iM3169 ^ i8) * 8377) ^ (-722422936);
        int i11 = iM3169 ^ 1124743224;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = 0;
        int i13 = 0;
        char c3 = 0;
        short s = 0;
        MessageDigest messageDigest = null;
        short s2 = 0;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * (-3483)) >> 31));
            switch (i7) {
                case -2130177677:
                case 1524776319:
                    strArr = strArr;
                    strM4049 = strM4049;
                    sArr2 = f64831;
                    c3 = 'F';
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("۫۫") ^ i9;
                        i = ((iM2761 ^ i8) * 12531) ^ 372481029;
                        i2 = 737521552;
                    } else {
                        iM2761 = C0619.m2761("ۢۙ") ^ i8;
                        i = ((iM2761 ^ i9) * (-11033)) ^ 707050657;
                        i2 = -1691357967;
                    }
                    strArr = strArr;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    strM4049 = strM4049;
                    break;
                case -1890488030:
                case 1781800175:
                    if (!C0862.m3503()) {
                        iM2762 = C0773.m3169("᩹۫") ^ i8;
                        i3 = ((iM2762 ^ i9) * 25513) ^ (-1239840777);
                        i4 = -1328962535;
                        i11 = iM2762 ^ i4;
                        i10 = i3;
                    } else {
                        strArr = strArr;
                        strM4049 = strM4049;
                        iM2761 = C0773.m3169("۫۫") ^ i9;
                        i = ((iM2761 ^ i8) * 12531) ^ 372481029;
                        i2 = 737521552;
                        strArr = strArr;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        strM4049 = strM4049;
                    }
                    break;
                case -1853303394:
                case -1685628232:
                    short[] sArr4 = f64831;
                    strArr = strArr;
                    if (C2287.f7432 >= 0) {
                        strM4049 = strM4049;
                        iM2761 = C0773.m3169("۫۫") ^ i9;
                        i = ((iM2761 ^ i8) * 12531) ^ 372481029;
                        i2 = 737521552;
                        strArr = strArr;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        strM4049 = strM4049;
                    } else {
                        String str3 = strM4049;
                        String strM6310 = C1826.m6310(sArr4, 71, 3, i6);
                        if (C0487.m2356() < 0) {
                            throw new C4866(RunnableC1848.m6367(c13778M12915, C0773.m3169(strM6310) ^ 2123436086));
                        }
                        strArr = strArr;
                        strM4049 = str3;
                        iM2762 = C0773.m3169("᩹۫") ^ i8;
                        i3 = ((iM2762 ^ i9) * 25513) ^ (-1239840777);
                        i4 = -1328962535;
                        i11 = iM2762 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -1790906065:
                case -1553684420:
                    strArr = strArr;
                    strM4049 = strM4049;
                    C2592 c2592M6238 = C1783.m6238(i5);
                    c2592M6238.m8678(bArrM1777);
                    C1080.m4048(c2592M6238, str);
                    c13778M12915 = C3998.m12915(c2592M6238);
                    if (C2878.m9488(c13778M12915)) {
                        iM2761 = (C0619.m2761("᩹ۘ") ^ i8) * (-89);
                        i = ((iM2761 ^ i9) * (-25595)) ^ 229660417;
                        i2 = 1846507696;
                    } else {
                        iM2761 = C0773.m3169("۠ܿ") ^ i8;
                        i = ((iM2761 ^ i9) * 31745) ^ (-1102427133);
                        i2 = 110641956;
                    }
                    strArr = strArr;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    strM4049 = strM4049;
                    break;
                case -1657086825:
                case 768957000:
                    C1321.m4852();
                    return null;
                case -1617813712:
                case -1615659921:
                    strArr[c2] = C1080.m4049(c13778M12915);
                    strArr[2] = Base64.encodeToString(bArrM1777, 2);
                    if (f64832) {
                        iM2762 = C0773.m3169("ۚۤ") ^ i8;
                        i3 = ((iM2762 ^ i9) * (-30009)) ^ (-64131345);
                        i4 = 1448246782;
                    } else {
                        iM2762 = (i8 - C0619.m2761("᩶ۛ")) * 71;
                        i3 = ((iM2762 ^ i9) * 13681) ^ (-1662236185);
                        i4 = 1727607073;
                    }
                    i11 = iM2762 ^ i4;
                    i10 = i3;
                    break;
                case -1417229688:
                case 783978132:
                    strArr = strArr;
                    strM4049 = strM4049;
                    m46445();
                    MessageDigest messageDigestM36174 = C15022.m36174();
                    C15022.m36175(messageDigestM36174, C4282.m13655(abstractC22044));
                    if (C2023.m6964() <= 0) {
                        messageDigest = messageDigestM36174;
                        iM2761 = C0619.m2761("᩹᩹") ^ i8;
                        i = ((iM2761 ^ i9) * 16005) ^ (-8425151);
                        i2 = -1400024193;
                        strArr = strArr;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                    } else {
                        int iM31610 = C0773.m3169("ۗۗ") ^ i8;
                        messageDigest = messageDigestM36174;
                        i10 = ((iM31610 ^ i9) * (-19683)) ^ (-920004323);
                        strArr = strArr;
                        i11 = iM31610 ^ (-1313209420);
                    }
                    strM4049 = strM4049;
                    break;
                case -1194302276:
                case 708733131:
                    strArr[c] = strM4049;
                    c2 = 1;
                    if (C3448.m11248() != 0) {
                        iM2762 = C0773.m3169("۬ܺ") ^ i8;
                        i3 = ((iM2762 ^ i9) * 27731) ^ (-1361845871);
                        i4 = -148175646;
                    } else {
                        iM2762 = C0619.m2761("᩹᩺") ^ i9;
                        i3 = ((iM2762 ^ i8) * 7217) ^ (-504108492);
                        i4 = 176266920;
                    }
                    i11 = iM2762 ^ i4;
                    i10 = i3;
                    break;
                case -1092240311:
                case 939211490:
                    C2485.m8357();
                    if (!C2023.f6737) {
                        strArr = strArr;
                        strM4049 = strM4049;
                        iM2761 = C0619.m2761("᩹᩹") ^ i8;
                        i = ((iM2761 ^ i9) * 16005) ^ (-8425151);
                        i2 = -1400024193;
                        strArr = strArr;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        strM4049 = strM4049;
                    } else {
                        iM2762 = C0619.m2761("᩻ۡ") ^ i9;
                        i3 = ((iM2762 ^ i8) * (-12741)) ^ 1489646349;
                        i4 = -698292665;
                        i11 = iM2762 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -1036801544:
                case 749018263:
                    strArr = strArr;
                    strM4049 = strM4049;
                    bArrM1777 = C0269.m1777(messageDigest);
                    i5 = 4165;
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("᩹᩹") ^ i8;
                        i = ((iM2761 ^ i9) * 16005) ^ (-8425151);
                        i2 = -1400024193;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩵") + i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i8) * (-27193)) ^ 1938132328;
                        i2 = -317843886;
                    }
                    strArr = strArr;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    strM4049 = strM4049;
                    break;
                case -884120713:
                case -852182840:
                    str2 = strArr[c];
                    sArr = f64831;
                    i12 = 74;
                    i13 = 16;
                    if (C0773.f2792 <= 0) {
                        iM2762 = C0619.m2761("᩻ۡ") ^ i9;
                        i3 = ((iM2762 ^ i8) * (-12741)) ^ 1489646349;
                        i4 = -698292665;
                    } else {
                        iM2762 = (C0773.m3169("᩺ۙ") + i9) * (-69);
                        i3 = ((iM2762 ^ i8) * (-31127)) ^ (-1330370123);
                        i4 = 500153089;
                    }
                    i11 = iM2762 ^ i4;
                    i10 = i3;
                    break;
                case -866742967:
                case 1873478399:
                    strM12925 = C3998.m12925(sArr, i12, i13, i6);
                    sArr3 = f64831;
                    if (C4282.f15546 <= 0) {
                        iM2762 = C0773.m3169("᩹۫") ^ i8;
                        i3 = ((iM2762 ^ i9) * 25513) ^ (-1239840777);
                        i4 = -1328962535;
                    } else {
                        iM2762 = C0773.m3169("֡ᩳ") ^ i9;
                        i3 = ((iM2762 ^ i8) * 15225) ^ 1659411723;
                        i4 = -1576772214;
                    }
                    i11 = iM2762 ^ i4;
                    i10 = i3;
                    break;
                case -402397665:
                case 831642012:
                    C0950.m3785();
                    if (C3033.f9831 < 0) {
                        iM2762 = C0773.m3169("᩹۫") ^ i8;
                        i3 = ((iM2762 ^ i9) * 25513) ^ (-1239840777);
                        i4 = -1328962535;
                    } else {
                        iM2762 = C0619.m2761("᩻ۡ") ^ i9;
                        i3 = ((iM2762 ^ i8) * (-12741)) ^ 1489646349;
                        i4 = -698292665;
                    }
                    i11 = iM2762 ^ i4;
                    i10 = i3;
                    break;
                case -395503234:
                case 183363473:
                    i6 = 63800;
                    iM2761 = (C0773.m3169("᩶᩷") + i9) * 37;
                    i = ((iM2761 ^ i8) * 3575) ^ 1066389387;
                    i2 = -1521300426;
                    strArr = strArr;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    strM4049 = strM4049;
                    break;
                case -200064781:
                case 129018927:
                    return strArr;
                case 139734144:
                case 190299746:
                    strArr = strArr;
                    strM4049 = strM4049;
                    int i14 = s + s2;
                    if ((i14 * i14) - (71944 * s) >= 0) {
                        iM2761 = C0619.m2761("᩸ۚ") ^ i8;
                        i = ((iM2761 ^ i9) * (-5231)) ^ 1819655031;
                        i2 = -1745807056;
                    } else {
                        iM2761 = (C0619.m2761("۟ۧ") ^ i9) * 25;
                        i = ((iM2761 ^ i8) * 13351) ^ (-446212878);
                        i2 = -331991698;
                    }
                    strArr = strArr;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    strM4049 = strM4049;
                    break;
                case 249825300:
                case 1962098052:
                    strArr = new String[3];
                    strM4049 = C1080.m4049(c13778M12915);
                    c = 0;
                    if (C1343.f4799 != 0) {
                        iM2762 = C0773.m3169("᩹۫") ^ i8;
                        i3 = ((iM2762 ^ i9) * 25513) ^ (-1239840777);
                        i4 = -1328962535;
                    } else {
                        iM2762 = C0619.m2761("ۢᩳ") ^ i9;
                        i3 = ((iM2762 ^ i8) * 13819) ^ (-1560111394);
                        i4 = -1087485533;
                    }
                    i11 = iM2762 ^ i4;
                    i10 = i3;
                    break;
                case 612304258:
                case 924081089:
                    strArr[c] = C1146.m4228(str2, strM12925, C1519.m5399(sArr3, 90, 38, i6));
                    iM2762 = (i8 - C0619.m2761("᩶ۛ")) * 71;
                    i3 = ((iM2762 ^ i9) * 13681) ^ (-1662236185);
                    i4 = 1727607073;
                    i11 = iM2762 ^ i4;
                    i10 = i3;
                    break;
                case 1131615032:
                case 1660134241:
                    C3734.m12152();
                    iM2762 = C0773.m3169("᩹۫") ^ i8;
                    i3 = ((iM2762 ^ i9) * 25513) ^ (-1239840777);
                    i4 = -1328962535;
                    i11 = iM2762 ^ i4;
                    i10 = i3;
                    break;
                case 1322520595:
                case 1654923655:
                    i6 = 25279;
                    iM2761 = (C0773.m3169("᩶᩷") + i9) * 37;
                    i = ((iM2761 ^ i8) * 3575) ^ 1066389387;
                    i2 = -1521300426;
                    strArr = strArr;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    strM4049 = strM4049;
                    break;
                default:
                    strArr = strArr;
                    strM4049 = strM4049;
                    s = sArr2[c3];
                    s2 = 17986;
                    if (RunnableC1848.m6360()) {
                        iM2761 = C0773.m3169("۫۫") ^ i9;
                        i = ((iM2761 ^ i8) * 12531) ^ 372481029;
                        i2 = 737521552;
                    } else {
                        iM2761 = (C0773.m3169("᩷ܳ") + i9) * (-67);
                        i = ((iM2761 ^ i8) * (-18595)) ^ (-346515880);
                        i2 = -258542173;
                    }
                    strArr = strArr;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    strM4049 = strM4049;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46444(String str, C7516 c7516) throws C4866 {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int iM2762;
        int i5;
        int i6;
        int iM31610;
        int i7;
        int i8;
        int i9;
        int i10 = RunnableC3055.f9898;
        int i11 = C1826.f6190;
        int iM2763 = C0619.m2761("۬ܳ") ^ i10;
        int i12 = ((iM2763 ^ i11) * (-16411)) ^ 475392915;
        short[] sArr = null;
        int i13 = iM2763 ^ (-234123312);
        char c = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 474245792;
        C13778 c13778M6306 = null;
        C11990 c11990 = null;
        String str2 = null;
        String str3 = null;
        C2592 c2592M6238 = null;
        while (true) {
            i18 = i13 ^ (i12 & (((i18 ^ i11) * (-27427)) >> 31));
            switch (i18) {
                case -1934805350:
                case 92095206:
                    C0269.m1775();
                    if (C1519.f5300 < 0) {
                        c = c;
                        iM31610 = (C0773.m3169("ۡܺ") ^ i11) * (-125);
                        i7 = ((iM31610 ^ i10) * (-28627)) ^ 238578206;
                        i8 = 1252413602;
                        i9 = iM31610 ^ i8;
                        i12 = i7;
                        c = c;
                        i13 = i9;
                    } else {
                        int iM31611 = (C0773.m3169("ۨᩴ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM31611 ^ i10) * 17703) ^ 1616952104;
                        i13 = iM31611 ^ 945492712;
                        i12 = i;
                    }
                    break;
                case -1926558457:
                case 1790182788:
                    C6790.m18966(c13778M6306.m33669());
                    return c13778M6306.m33674();
                case -1811525872:
                case -998386547:
                    c = c;
                    s = s;
                    if (i15 - (i16 + 1) >= 0) {
                        iM2761 = (i10 - C0773.m3169("ܳ۫")) * q.h;
                        i3 = ((iM2761 ^ i11) * (-20359)) ^ (-799050514);
                        i4 = 804206849;
                    } else {
                        iM2761 = C0619.m2761("᩹ۤ") ^ i11;
                        i3 = ((iM2761 ^ i10) * 2745) ^ 581598675;
                        i4 = 293589266;
                    }
                    i9 = iM2761 ^ i4;
                    i12 = i3;
                    c = c;
                    s = s;
                    i13 = i9;
                    break;
                case -1634175002:
                case 1914122229:
                    RunnableC1848.m6360();
                    if (C2375.f7641 > 0) {
                        int iM31612 = (C0773.m3169("ۨᩴ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM31612 ^ i10) * 17703) ^ 1616952104;
                        i13 = iM31612 ^ 945492712;
                        i12 = i;
                    } else {
                        s = s;
                        iM2762 = (C0773.m3169("ۡ۟") ^ i10) * 75;
                        i5 = ((iM2762 ^ i11) * 14901) ^ 611379743;
                        i6 = -2103074409;
                        i13 = iM2762 ^ i6;
                        i12 = i5;
                        s = s;
                    }
                    break;
                case -1592588876:
                case 404202899:
                    c = c;
                    s = s;
                    sArr = f64831;
                    if (C0950.f3488 < 0) {
                        iM2761 = C0619.m2761("ۧ᩹") ^ i10;
                        i3 = ((iM2761 ^ i11) * (-3721)) ^ (-812591196);
                        i4 = 166127128;
                        i9 = iM2761 ^ i4;
                        i12 = i3;
                        c = c;
                        s = s;
                        i13 = i9;
                    }
                    s = s;
                    iM31610 = (C0773.m3169("ۡܺ") ^ i11) * (-125);
                    i7 = ((iM31610 ^ i10) * (-28627)) ^ 238578206;
                    i8 = 1252413602;
                    i9 = iM31610 ^ i8;
                    i12 = i7;
                    c = c;
                    i13 = i9;
                    break;
                case -1422083366:
                case 937232033:
                    c = c;
                    s = s;
                    C2023.m6965(c2592M6238, str3);
                    C1080.m4048(c2592M6238, c7516.f24832);
                    str2 = c7516.f24833;
                    if (C3099.f10023 > 0) {
                        iM3169 = C0773.m3169("ۚ᩻") ^ i11;
                        i = ((iM3169 ^ i10) * 7367) ^ 1175063629;
                        i2 = 2104643990;
                        int i19 = iM3169 ^ i2;
                        c = c;
                        s = s;
                        i13 = i19;
                        i12 = i;
                    } else {
                        iM2761 = C0773.m3169("᩷ۜ") ^ i10;
                        i3 = ((iM2761 ^ i11) * (-29631)) ^ 466478298;
                        i4 = 1723005531;
                        i9 = iM2761 ^ i4;
                        i12 = i3;
                        c = c;
                        s = s;
                        i13 = i9;
                    }
                    break;
                case -880008138:
                case 649140282:
                    short[] sArr2 = f64831;
                    c = c;
                    if (C2702.f8586 > 0) {
                        s = s;
                        String strM8881 = C2702.m8881(sArr2, 1, 3, i17);
                        if (C2419.f7754 < 0) {
                            throw new C4866(RunnableC1848.m6367(c13778M6306, C0773.m3169(strM8881) ^ 2127309775));
                        }
                        c = c;
                        iM2762 = (C0773.m3169("ۡ۟") ^ i10) * 75;
                        i5 = ((iM2762 ^ i11) * 14901) ^ 611379743;
                        i6 = -2103074409;
                        i13 = iM2762 ^ i6;
                        i12 = i5;
                        s = s;
                    } else {
                        s = s;
                        iM2761 = C0773.m3169("᩷ۜ") ^ i10;
                        i3 = ((iM2761 ^ i11) * (-29631)) ^ 466478298;
                        i4 = 1723005531;
                        i9 = iM2761 ^ i4;
                        i12 = i3;
                        c = c;
                        s = s;
                        i13 = i9;
                    }
                    break;
                case -646013472:
                case -249581704:
                    if (C13473.f42873 != 0) {
                        c = c;
                        s = s;
                        iM2761 = (C0773.m3169("ۜ᩶") + i10) * (-89);
                        i3 = ((iM2761 ^ i11) * (-5217)) ^ (-562575560);
                        i4 = -376570649;
                        i9 = iM2761 ^ i4;
                        i12 = i3;
                        c = c;
                        s = s;
                        i13 = i9;
                    } else {
                        s = s;
                        iM2762 = (C0773.m3169("ۡ۟") ^ i10) * 75;
                        i5 = ((iM2762 ^ i11) * 14901) ^ 611379743;
                        i6 = -2103074409;
                        i13 = iM2762 ^ i6;
                        i12 = i5;
                        s = s;
                    }
                    break;
                case -580963278:
                case 341032785:
                    C1321.m4852();
                    C3033.m9845();
                    s = s;
                    iM2762 = (C0773.m3169("ۡ۟") ^ i10) * 75;
                    i5 = ((iM2762 ^ i11) * 14901) ^ 611379743;
                    i6 = -2103074409;
                    i13 = iM2762 ^ i6;
                    i12 = i5;
                    s = s;
                    break;
                case -470097426:
                case -140508499:
                    s = s;
                    c = 0;
                    if (C1542.f5343 <= 0) {
                        iM2762 = (C0773.m3169("ۡ۟") ^ i10) * 75;
                        i5 = ((iM2762 ^ i11) * 14901) ^ 611379743;
                        i6 = -2103074409;
                    } else {
                        iM2762 = C0619.m2761("ۡ᩵") ^ i11;
                        i5 = ((iM2762 ^ i10) * 22815) ^ (-1567229500);
                        i6 = 1872366284;
                    }
                    i13 = iM2762 ^ i6;
                    i12 = i5;
                    s = s;
                    break;
                case -427566309:
                case 350578569:
                    C3998.m12920();
                    return 0;
                case -232017690:
                case 1014592039:
                    c = c;
                    s = s;
                    C1080.m4048(c2592M6238, str);
                    str3 = c7516.f24830;
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ۜܳ") ^ i10;
                        i3 = ((iM2761 ^ i11) * 29439) ^ (-962265033);
                        i4 = 1092654729;
                    } else {
                        iM2761 = C0773.m3169("᩷ۜ") ^ i10;
                        i3 = ((iM2761 ^ i11) * (-29631)) ^ 466478298;
                        i4 = 1723005531;
                    }
                    i9 = iM2761 ^ i4;
                    i12 = i3;
                    c = c;
                    s = s;
                    i13 = i9;
                    break;
                case -40133762:
                case 151901908:
                    c = c;
                    s = s;
                    C1080.m4048(c2592M6238, c11990.m30127());
                    c13778M6306 = C1826.m6306(c2592M6238);
                    if (C1564.m5516(c13778M6306)) {
                        iM3169 = (i11 - C0619.m2761("ᩴۗ")) * (-85);
                        i = ((iM3169 ^ i10) * 32235) ^ 580453947;
                        i2 = 231955627;
                    } else {
                        iM3169 = C0619.m2761("֨ۡ") ^ i10;
                        i = ((iM3169 ^ i11) * (-20807)) ^ (-2036337914);
                        i2 = 563111307;
                    }
                    int i110 = iM3169 ^ i2;
                    c = c;
                    s = s;
                    i13 = i110;
                    i12 = i;
                    break;
                case 192927391:
                case 1501569362:
                    c = c;
                    s = sArr[c];
                    i14 = s + 1;
                    if (RunnableC0334.f1808 <= 0) {
                        iM31610 = (C0773.m3169("ۡܺ") ^ i11) * (-125);
                        i7 = ((iM31610 ^ i10) * (-28627)) ^ 238578206;
                        i8 = 1252413602;
                    } else {
                        iM31610 = C0773.m3169("ᩳᩴ") ^ i10;
                        i7 = ((iM31610 ^ i11) * 26843) ^ 1054047935;
                        i8 = -1666748294;
                    }
                    i9 = iM31610 ^ i8;
                    i12 = i7;
                    c = c;
                    i13 = i9;
                    break;
                case 352807991:
                case 434313315:
                    c = c;
                    s = s;
                    m46445();
                    c2592M6238 = C1783.m6238(4166);
                    if (C1343.m4943()) {
                        iM2761 = C0619.m2761("ۢ᩺") ^ i10;
                        i3 = ((iM2761 ^ i11) * 5869) ^ 138235102;
                        i4 = 406300858;
                        i9 = iM2761 ^ i4;
                        i12 = i3;
                        c = c;
                        s = s;
                        i13 = i9;
                    }
                    s = s;
                    iM31610 = (C0773.m3169("ۡܺ") ^ i11) * (-125);
                    i7 = ((iM31610 ^ i10) * (-28627)) ^ 238578206;
                    i8 = 1252413602;
                    i9 = iM31610 ^ i8;
                    i12 = i7;
                    c = c;
                    i13 = i9;
                    break;
                case 1105465680:
                case 1616623805:
                    i17 = 29100;
                    iM2761 = (C0773.m3169("ۖᩴ") + i11) * q.h;
                    i3 = ((iM2761 ^ i10) * 22413) ^ (-1903327131);
                    i4 = 1572709330;
                    i9 = iM2761 ^ i4;
                    i12 = i3;
                    c = c;
                    s = s;
                    i13 = i9;
                    break;
                case 1343187094:
                case 1991821727:
                    c = c;
                    s = s;
                    i15 = i14 * i14;
                    i16 = s * 2;
                    if (C2702.m8876()) {
                        iM2761 = C0773.m3169("ۧ֫") ^ i11;
                        i3 = ((iM2761 ^ i10) * (-8173)) ^ 687857752;
                        i4 = -253515949;
                    } else {
                        iM2761 = (C0773.m3169("ۜ᩶") + i10) * (-89);
                        i3 = ((iM2761 ^ i11) * (-5217)) ^ (-562575560);
                        i4 = -376570649;
                    }
                    i9 = iM2761 ^ i4;
                    i12 = i3;
                    c = c;
                    s = s;
                    i13 = i9;
                    break;
                case 1973016958:
                case 1985108485:
                    i17 = 6685;
                    iM2761 = (C0773.m3169("ۖᩴ") + i11) * q.h;
                    i3 = ((iM2761 ^ i10) * 22413) ^ (-1903327131);
                    i4 = 1572709330;
                    i9 = iM2761 ^ i4;
                    i12 = i3;
                    c = c;
                    s = s;
                    i13 = i9;
                    break;
                default:
                    c = c;
                    s = s;
                    C2023.m6965(c2592M6238, str2);
                    C2023.m6965(c2592M6238, c7516.f24831);
                    c11990 = c7516.f24834;
                    if (C3690.f12684 > 0) {
                        iM3169 = (i11 - C0773.m3169("᩹ܽ")) * (-105);
                        i = ((iM3169 ^ i10) * (-28183)) ^ (-414357373);
                        i2 = -1772318703;
                        int i111 = iM3169 ^ i2;
                        c = c;
                        s = s;
                        i13 = i111;
                        i12 = i;
                    } else {
                        c = c;
                        iM2762 = (C0773.m3169("ۡ۟") ^ i10) * 75;
                        i5 = ((iM2762 ^ i11) * 14901) ^ 611379743;
                        i6 = -2103074409;
                        i13 = iM2762 ^ i6;
                        i12 = i5;
                        s = s;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0215 A[PHI: r10 r11 r12 r16 r17 r18
      0x0215: PHI (r10v3 short[]) = (r10v2 short[]), (r10v1 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:63:0x0213, B:59:0x01ed, B:32:0x00cf, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:63:0x0213, B:59:0x01ed, B:32:0x00cf, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:63:0x0213, B:59:0x01ed, B:32:0x00cf, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r16v23 int) = (r16v11 int), (r16v12 int), (r16v18 int), (r16v24 int) binds: [B:63:0x0213, B:59:0x01ed, B:32:0x00cf, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r17v3 boolean) = (r17v2 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean) binds: [B:63:0x0213, B:59:0x01ed, B:32:0x00cf, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r18v21 short[]) = (r18v9 short[]), (r18v10 short[]), (r18v16 short[]), (r18v22 short[]) binds: [B:63:0x0213, B:59:0x01ed, B:32:0x00cf, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46445() {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        int iM31611 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1456034076;
        int i12 = C11235.f35427;
        int i13 = C2966.f9654;
        int iM31612 = C0773.m3169("ᩴۛ") ^ i13;
        int i14 = ((iM31612 ^ i12) * (-29235)) ^ 1281023182;
        int i15 = iM31612 ^ 1463616188;
        boolean zM18953 = false;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i12) * (-18257)) >> 31));
            switch (i16) {
                case -2072450859:
                case 749013039:
                    C17202.m40372();
                    return;
                case -2053386785:
                case -385404058:
                    if (C13473.f42873 == 0) {
                        sArr = sArr;
                        i16 = i16;
                        iM31610 = C0619.m2761("۠ۗ") ^ i13;
                        i3 = ((iM31610 ^ i12) * (-14799)) ^ (-726989516);
                        i4 = -424953286;
                        int i17 = iM31610 ^ i4;
                        i11 = i16;
                        i15 = i17;
                        i14 = i3;
                        sArr = sArr;
                    }
                    iM31610 = (C0773.m3169("᩶ۚ") ^ i12) * (-89);
                    i3 = ((iM31610 ^ i13) * (-14699)) ^ 1526273046;
                    i4 = 1717276543;
                    int i18 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i18;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -1986027921:
                case -656565578:
                    C4282.m13644();
                    i16 = i16;
                    iM3169 = (C0773.m3169("᩵ᩴ") + i12) * (-99);
                    i = ((iM3169 ^ i13) * (-4769)) ^ (-863116730);
                    i2 = -1253681198;
                    int i19 = i16;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    i11 = i19;
                    break;
                case -1819847463:
                case 431753253:
                    sArr = sArr;
                    i16 = i16;
                    if (i7 - (s * s2) < 0) {
                        iM31610 = (C0619.m2761("ᩴᩳ") + i13) * 67;
                        i3 = ((iM31610 ^ i12) * 22283) ^ (-248856110);
                        i4 = 1371102709;
                    } else {
                        iM31610 = C0773.m3169("ۛۚ") ^ i12;
                        i3 = ((iM31610 ^ i13) * (-11199)) ^ (-1702895258);
                        i4 = 2139131575;
                    }
                    int i110 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i110;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -1748935729:
                case 1445395819:
                    sArr = sArr;
                    i16 = i16;
                    if (C6790.m18969()) {
                        iM31610 = (C0773.m3169("᩺ۧ") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM31610 ^ i13) * 7225) ^ 1416794043;
                        i4 = -1110776585;
                    } else {
                        iM31610 = C0773.m3169("ۙۡ") ^ i13;
                        i3 = ((iM31610 ^ i12) * (-16671)) ^ (-350476732);
                        i4 = -1149862842;
                    }
                    int i111 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i111;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -1659634374:
                case -935725665:
                    sArr = sArr;
                    i16 = i16;
                    if (!RunnableC1848.f6235) {
                        throw new C4866(C3033.m9850(new C13778(1701), iM31611));
                    }
                    iM31610 = C0619.m2761("۠ۗ") ^ i13;
                    i3 = ((iM31610 ^ i12) * (-14799)) ^ (-726989516);
                    i4 = -424953286;
                    int i112 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i112;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -1651610056:
                case 1124841065:
                    sArr = sArr;
                    i16 = i16;
                    if (C6790.m18963()) {
                        iM31610 = (C0619.m2761("᩹۠") ^ i13) * 69;
                        i3 = ((iM31610 ^ i12) * (-17387)) ^ 1145016002;
                        i4 = 524081480;
                    } else {
                        iM31610 = (C0619.m2761("ۡ᩺") ^ i13) * (-7);
                        i3 = ((iM31610 ^ i12) * (-6383)) ^ (-868757126);
                        i4 = 602180965;
                    }
                    int i113 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i113;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -1612602900:
                case 1509450715:
                    sArr = sArr;
                    i16 = i16;
                    zM18953 = C6790.m18953();
                    sArr2 = f64831;
                    i9 = 5;
                    if (C20932.f66974 <= 0) {
                        iM31610 = C0619.m2761("۠ۗ") ^ i13;
                        i3 = ((iM31610 ^ i12) * (-14799)) ^ (-726989516);
                        i4 = -424953286;
                    } else {
                        iM31610 = C0619.m2761("ۛ۠") ^ i12;
                        i3 = ((iM31610 ^ i13) * (-12007)) ^ (-329205165);
                        i4 = 1052464735;
                    }
                    int i114 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i114;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -1517517105:
                case 1249205424:
                    if (C0487.f2131 > 0) {
                        throw new C4866(C3033.m9850(new C13778(2), iM31611));
                    }
                    iM31610 = (C0619.m2761("ܶܽ") + i13) * (-79);
                    i3 = ((iM31610 ^ i12) * 2873) ^ (-2026238730);
                    i4 = -175838249;
                    int i115 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i115;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -1403404690:
                case 1416825503:
                    sArr = sArr;
                    i16 = i16;
                    i10 = 3;
                    if (C2702.m8876()) {
                        iM31610 = (C0619.m2761("ܶۨ") ^ i13) * 29;
                        i3 = ((iM31610 ^ i12) * 19811) ^ 274688070;
                        i4 = -451235620;
                    } else {
                        iM31610 = C0619.m2761("۠ۗ") ^ i13;
                        i3 = ((iM31610 ^ i12) * (-14799)) ^ (-726989516);
                        i4 = -424953286;
                    }
                    int i116 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i116;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -1390650969:
                case 1905725619:
                    i8 = 56995;
                    iM31610 = C0619.m2761("ܰܿ") ^ i13;
                    i3 = ((iM31610 ^ i12) * 30293) ^ 850743375;
                    i4 = 50233888;
                    int i117 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i117;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -903742056:
                case -548911898:
                    i16 = i16;
                    sArr = f64831;
                    c = 4;
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (C0773.m3169("᩵ᩴ") + i12) * (-99);
                        i = ((iM3169 ^ i13) * (-4769)) ^ (-863116730);
                        i2 = -1253681198;
                    } else {
                        iM3169 = C0773.m3169("ۤۜ") ^ i13;
                        i = ((iM3169 ^ i12) * 29381) ^ (-904206648);
                        i2 = -497144162;
                    }
                    int i118 = i16;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    i11 = i118;
                    break;
                case -891986692:
                case 698203089:
                    sArr = sArr;
                    i16 = i16;
                    iM31611 = 2128543038 ^ C0773.m3169(C0269.m1785(sArr2, i9, i10, i8));
                    if (zM18953) {
                        iM31610 = (C0619.m2761("۬ۡ") + i12) * (-29);
                        i3 = ((iM31610 ^ i13) * 17031) ^ 825076919;
                        i4 = -104095756;
                    } else {
                        iM31610 = (i12 - C0619.m2761("᩵ܳ")) * (-35);
                        i3 = ((iM31610 ^ i13) * 26311) ^ (-1819618214);
                        i4 = -1466978505;
                    }
                    int i119 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i119;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case -888024354:
                case 46323721:
                    return;
                case -312318276:
                case -59262958:
                    i8 = 41461;
                    iM31610 = C0619.m2761("ܰܿ") ^ i13;
                    i3 = ((iM31610 ^ i12) * 30293) ^ 850743375;
                    i4 = 50233888;
                    int i1110 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i1110;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case 70434693:
                case 2003708605:
                    C0487.m2356();
                    if (C1542.m5459() < 0) {
                        iM31610 = (C0773.m3169("᩶ۚ") ^ i12) * (-89);
                        i3 = ((iM31610 ^ i13) * (-14699)) ^ 1526273046;
                        i4 = 1717276543;
                        int i1111 = iM31610 ^ i4;
                        i11 = i16;
                        i15 = i1111;
                        i14 = i3;
                        sArr = sArr;
                    } else {
                        i16 = i16;
                        iM3169 = (C0773.m3169("᩵ᩴ") + i12) * (-99);
                        i = ((iM3169 ^ i13) * (-4769)) ^ (-863116730);
                        i2 = -1253681198;
                        int i1112 = i16;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        i11 = i1112;
                    }
                    break;
                case 181187126:
                case 644440749:
                    sArr = sArr;
                    i16 = i16;
                    if (C6790.m18971() > 0) {
                        iM31610 = (C0619.m2761("᩺۠") ^ i13) * 19;
                        i3 = ((iM31610 ^ i12) * 5763) ^ (-1240189738);
                        i4 = 1647784865;
                    } else {
                        iM31610 = C0773.m3169("ۖ᩵") ^ i12;
                        i3 = ((iM31610 ^ i13) * 10185) ^ 458336527;
                        i4 = -58510565;
                    }
                    int i1113 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i1113;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case 422502256:
                case 461833509:
                    sArr = sArr;
                    i16 = i16;
                    i5 = s * s;
                    i6 = 116057529;
                    if (C17202.f56030) {
                        iM31610 = (C0773.m3169("۬᩻") ^ i13) * (-79);
                        i3 = ((iM31610 ^ i12) * (-19277)) ^ 1784318431;
                        i4 = -423812812;
                    } else {
                        iM31610 = C0619.m2761("ᩴ֨") ^ i12;
                        i3 = ((iM31610 ^ i13) * (-4281)) ^ (-277421812);
                        i4 = 2078685574;
                    }
                    int i1114 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i1114;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case 473058906:
                case 2075436046:
                    if (RunnableC3055.f9898 < 0) {
                        iM31610 = (C0619.m2761("ܶܽ") + i13) * (-79);
                        i3 = ((iM31610 ^ i12) * 2873) ^ (-2026238730);
                        i4 = -175838249;
                        int i1115 = iM31610 ^ i4;
                        i11 = i16;
                        i15 = i1115;
                        i14 = i3;
                        sArr = sArr;
                    }
                    iM31610 = (C0773.m3169("᩶ۚ") ^ i12) * (-89);
                    i3 = ((iM31610 ^ i13) * (-14699)) ^ 1526273046;
                    i4 = 1717276543;
                    int i1116 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i1116;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case 531531998:
                case 1206669596:
                    if (!C2878.f9462) {
                        throw new C4866(C3033.m9850(new C13778(1702), iM31611));
                    }
                    iM31610 = (C0773.m3169("᩶ۚ") ^ i12) * (-89);
                    i3 = ((iM31610 ^ i13) * (-14699)) ^ 1526273046;
                    i4 = 1717276543;
                    int i1117 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i1117;
                    i14 = i3;
                    sArr = sArr;
                    break;
                case 1633079919:
                case 1709413432:
                    sArr = sArr;
                    i16 = i16;
                    i7 = i5 + i6;
                    s2 = 21546;
                    if (C1321.f4751 < 0) {
                        iM31610 = C0619.m2761("ۡۧ") ^ i12;
                        i3 = ((iM31610 ^ i13) * (-16039)) ^ (-877063051);
                        i4 = 23444395;
                        int i1118 = iM31610 ^ i4;
                        i11 = i16;
                        i15 = i1118;
                        i14 = i3;
                        sArr = sArr;
                    } else {
                        sArr = sArr;
                        iM3169 = (C0773.m3169("᩵ᩴ") + i12) * (-99);
                        i = ((iM3169 ^ i13) * (-4769)) ^ (-863116730);
                        i2 = -1253681198;
                        int i1119 = i16;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        i11 = i1119;
                    }
                    break;
                case 1766763031:
                case 1851911696:
                    if (C1343.f4799 == 0) {
                        throw new C4866(RunnableC1848.m6367(new C13778(1700), iM31611));
                    }
                    iM31610 = (C0619.m2761("ܶܽ") + i13) * (-79);
                    i3 = ((iM31610 ^ i12) * 2873) ^ (-2026238730);
                    i4 = -175838249;
                    int i11110 = iM31610 ^ i4;
                    i11 = i16;
                    i15 = i11110;
                    i14 = i3;
                    sArr = sArr;
                    break;
                default:
                    sArr = sArr;
                    i16 = i16;
                    s = sArr[c];
                    if (C1519.f5300 < 0) {
                        iM31610 = (C0773.m3169("ۤ᩻") + i12) * (-63);
                        i3 = ((iM31610 ^ i13) * (-179)) ^ 1438120477;
                        i4 = -1046655602;
                        int i11111 = iM31610 ^ i4;
                        i11 = i16;
                        i15 = i11111;
                        i14 = i3;
                        sArr = sArr;
                    } else {
                        sArr = sArr;
                        iM3169 = (C0773.m3169("᩵ᩴ") + i12) * (-99);
                        i = ((iM3169 ^ i13) * (-4769)) ^ (-863116730);
                        i2 = -1253681198;
                        int i11112 = i16;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                        i11 = i11112;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x029c A[PHI: r12 r13 r15 r27
      0x029c: PHI (r12v5 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:69:0x029a, B:65:0x0276, B:13:0x0095, B:127:0x029c] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r13v5 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:69:0x029a, B:65:0x0276, B:13:0x0095, B:127:0x029c] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r15v5 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:69:0x029a, B:65:0x0276, B:13:0x0095, B:127:0x029c] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r27v4 boolean) = (r27v2 boolean), (r27v1 boolean), (r27v1 boolean), (r27v1 boolean) binds: [B:69:0x029a, B:65:0x0276, B:13:0x0095, B:127:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x032c A[PHI: r17 r18
      0x032c: PHI (r17v3 int) = (r17v2 int), (r17v1 int) binds: [B:80:0x032a, B:13:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r18v3 short) = (r18v2 short), (r18v1 short) binds: [B:80:0x032a, B:13:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x039f A[PHI: r3 r4 r16 r20 r21 r22 r28
      0x039f: PHI (r3v2 l.ۖۢ᩻) = (r3v1 l.ۖۢ᩻), (r3v1 l.ۖۢ᩻), (r3v1 l.ۖۢ᩻), (r3v1 l.ۖۢ᩻), (r3v1 l.ۖۢ᩻), (r3v3 l.ۖۢ᩻) binds: [B:92:0x039d, B:88:0x037e, B:84:0x0361, B:56:0x022b, B:50:0x01fe, B:128:0x039f] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v3 int) binds: [B:92:0x039d, B:88:0x037e, B:84:0x0361, B:56:0x022b, B:50:0x01fe, B:128:0x039f] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r16v3 int) = (r16v1 int), (r16v1 int), (r16v2 int), (r16v1 int), (r16v1 int), (r16v1 int) binds: [B:92:0x039d, B:88:0x037e, B:84:0x0361, B:56:0x022b, B:50:0x01fe, B:128:0x039f] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r20v4 short[]) = (r20v3 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]) binds: [B:92:0x039d, B:88:0x037e, B:84:0x0361, B:56:0x022b, B:50:0x01fe, B:128:0x039f] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r21v4 char) = (r21v3 char), (r21v2 char), (r21v2 char), (r21v2 char), (r21v2 char), (r21v2 char) binds: [B:92:0x039d, B:88:0x037e, B:84:0x0361, B:56:0x022b, B:50:0x01fe, B:128:0x039f] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r22v4 int) = (r22v2 int), (r22v2 int), (r22v3 int), (r22v2 int), (r22v2 int), (r22v2 int) binds: [B:92:0x039d, B:88:0x037e, B:84:0x0361, B:56:0x022b, B:50:0x01fe, B:128:0x039f] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r28v5 short) = (r28v3 short), (r28v4 short), (r28v3 short), (r28v3 short), (r28v3 short), (r28v3 short) binds: [B:92:0x039d, B:88:0x037e, B:84:0x0361, B:56:0x022b, B:50:0x01fe, B:128:0x039f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m46446(int[] iArr) throws C4866 {
        int iM3169;
        int i;
        int iM31610;
        int i2;
        int i3;
        int[] iArr2 = iArr;
        int iM2761 = 0;
        C2592 c2592M6238 = null;
        int length = 0;
        int length2 = 0;
        int i4 = 0;
        C13778 c13778M6306 = null;
        int i5 = 0;
        int[] iArr3 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 1231775385;
        int i10 = C3099.f10023;
        int i11 = C2287.f7432;
        int iM2762 = C0619.m2761("ܽ֫") ^ i10;
        int i12 = ((iM2762 ^ i11) * (-145)) ^ 460499256;
        int i13 = iM2762 ^ (-1710267052);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = 0;
        boolean zM18953 = false;
        short s2 = 0;
        short[] sArr = null;
        short[] sArr2 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-12113)) >> 31));
            switch (i9) {
                case -2087029969:
                case -11360622:
                    i16 = 3;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("ۨۚ") ^ i10) * (-125);
                        i12 = ((iM3169 ^ i11) * (-18811)) ^ 1890856237;
                        i = -733974296;
                    } else {
                        iM3169 = (C0619.m2761("۠ܳ") ^ i10) * (-53);
                        i12 = ((iM3169 ^ i11) * (-32063)) ^ (-866946129);
                        i = 660303789;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -1978934080:
                case 1839570385:
                    if (C3077.f9998) {
                        iM31610 = C0773.m3169("᩸᩺") ^ i10;
                        i2 = ((iM31610 ^ i11) * (-31911)) ^ 1513663463;
                        i3 = 831431383;
                    } else {
                        iM31610 = (C0773.m3169("ᩴܶ") ^ i10) * 11;
                        i2 = ((iM31610 ^ i11) * (-30595)) ^ 2008442825;
                        i3 = 1644527049;
                    }
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case -1875958105:
                case 2083943143:
                    if (i6 < i5) {
                        iM31610 = C0619.m2761("֡᩺") ^ i11;
                        i2 = ((iM31610 ^ i10) * 25171) ^ (-2072933006);
                        i3 = 643572962;
                    } else {
                        iM31610 = (C0773.m3169("᩷᩻") + i10) * 67;
                        i2 = ((iM31610 ^ i11) * 30919) ^ 847849288;
                        i3 = 202044197;
                    }
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case -1868903751:
                case -1003326079:
                    zM18953 = C6790.m18953();
                    sArr2 = f64831;
                    i15 = 9;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("ۨۚ") ^ i10) * (-125);
                        i12 = ((iM3169 ^ i11) * (-18811)) ^ 1890856237;
                        i = -733974296;
                    } else {
                        iM3169 = (C0773.m3169("ܶ۟") ^ i10) * 15;
                        i12 = ((iM3169 ^ i11) * 30797) ^ 761277397;
                        i = -1353334482;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -1851352502:
                case 1483330443:
                    iM2761 = C0619.m2761(C1321.m4861(sArr2, i15, i16, i14)) ^ 2130579797;
                    if (zM18953) {
                        iM3169 = C0773.m3169("۠۬") ^ i11;
                        i12 = ((iM3169 ^ i10) * (-23533)) ^ (-214588768);
                        i = 1483302789;
                    } else {
                        iM3169 = C0619.m2761("᩶ۛ") ^ i10;
                        i12 = ((iM3169 ^ i11) * (-13823)) ^ (-827470144);
                        i = 1987111961;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -1762188483:
                case -1445217969:
                    if (C17202.m40372()) {
                        throw new C4866(RunnableC1848.m6367(new C13778(1702), iM2761));
                    }
                    iM3169 = (C0619.m2761("ۨ֨") + i11) * (-23);
                    i12 = ((iM3169 ^ i10) * (-23189)) ^ 979018156;
                    i = -137965007;
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -1549962564:
                case -145545281:
                    c2592M6238.m8686(iArr2[i4]);
                    i4++;
                    iM31610 = C0773.m3169("֨۫") ^ i11;
                    i2 = ((iM31610 ^ i10) * (-29481)) ^ 1119016394;
                    i3 = 1422873771;
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case -1505005038:
                case -391714526:
                    iArr3[i6] = c13778M6306.m33672();
                    i6++;
                    iM31610 = (i11 - C0773.m3169("ۙܶ")) * 67;
                    i2 = ((iM31610 ^ i10) * 1211) ^ 1821836438;
                    i3 = 366726147;
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case -1450824027:
                case -112149699:
                    if (C2287.f7432 < 0) {
                        iM3169 = (C0773.m3169("ۨۚ") ^ i10) * (-125);
                        i12 = ((iM3169 ^ i11) * (-18811)) ^ 1890856237;
                        i = -733974296;
                    } else {
                        iM3169 = (C0619.m2761("ܰ֡") + i11) * (-127);
                        i12 = ((iM3169 ^ i10) * (-24603)) ^ (-2126290773);
                        i = 2076725980;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -1306262803:
                case -425480904:
                    i14 = 52354;
                    iM3169 = (C0619.m2761("ۚ֫") + i11) * (-71);
                    i12 = ((iM3169 ^ i10) * 23427) ^ (-401360932);
                    i = -374572429;
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -1305335626:
                case 1818042287:
                    c2592M6238.m8681(length);
                    if (C0862.f3233 != 0) {
                        iM31610 = C0773.m3169("᩸᩺") ^ i10;
                        i2 = ((iM31610 ^ i11) * (-31911)) ^ 1513663463;
                        i3 = 831431383;
                    } else {
                        iM31610 = C0773.m3169("ۙۢ") ^ i10;
                        i2 = ((iM31610 ^ i11) * 29515) ^ 2051117212;
                        i3 = 1881091456;
                    }
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case -1282684800:
                case 1349274320:
                    c13778M6306 = C1826.m6306(c2592M6238);
                    if (C2878.m9488(c13778M6306)) {
                        iM31610 = (i11 - C0619.m2761("ܰ֫")) * 63;
                        i2 = ((iM31610 ^ i10) * (-12905)) ^ (-215288701);
                        i3 = 1293350131;
                    } else {
                        iM31610 = (C0619.m2761("ܿ᩸") + i10) * (-119);
                        i2 = ((iM31610 ^ i11) * 4389) ^ 685372269;
                        i3 = -59629678;
                    }
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case -1208714246:
                case -612863086:
                    s2 = sArr[c];
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("ۨ֨") + i11) * (-23);
                        i12 = ((iM3169 ^ i10) * (-23189)) ^ 979018156;
                        i = -137965007;
                    } else {
                        iM3169 = C0773.m3169("ۖ֨") ^ i10;
                        i12 = ((iM3169 ^ i11) * 13685) ^ (-261708115);
                        i = 742832531;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -1034061348:
                case 1502528523:
                    sArr = f64831;
                    c = '\b';
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (C0619.m2761("ۨ֨") + i11) * (-23);
                        i12 = ((iM3169 ^ i10) * (-23189)) ^ 979018156;
                        i = -137965007;
                    } else {
                        iM3169 = (C0773.m3169("ۤܳ") ^ i11) * 85;
                        i12 = ((iM3169 ^ i10) * 27425) ^ 22308944;
                        i = 810373188;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -931046143:
                case 1148171502:
                    int length3 = iArr2.length;
                    iArr3 = new int[length3];
                    i6 = i17;
                    i5 = length3;
                    iM31610 = (i11 - C0773.m3169("ۙܶ")) * 67;
                    i2 = ((iM31610 ^ i10) * 1211) ^ 1821836438;
                    i3 = 366726147;
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case -910543007:
                case 136255398:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("ۨۚ") ^ i10) * (-125);
                        i12 = ((iM3169 ^ i11) * (-18811)) ^ 1890856237;
                        i = -733974296;
                        i13 = iM3169 ^ i;
                        iArr2 = iArr;
                    } else {
                        iM31610 = C0773.m3169("᩸᩺") ^ i10;
                        i2 = ((iM31610 ^ i11) * (-31911)) ^ 1513663463;
                        i3 = 831431383;
                        i13 = iM31610 ^ i3;
                        i12 = i2;
                    }
                    break;
                case -889666530:
                case -559080029:
                    i14 = 43936;
                    iM3169 = (C0619.m2761("ۚ֫") + i11) * (-71);
                    i12 = ((iM3169 ^ i10) * 23427) ^ (-401360932);
                    i = -374572429;
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -864791701:
                case 1947507335:
                    i18 = s2 * s2;
                    i7 = 200902276;
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("ۨ֨") + i11) * (-23);
                        i12 = ((iM3169 ^ i10) * (-23189)) ^ 979018156;
                        i = -137965007;
                    } else {
                        iM3169 = (i11 - C0773.m3169("ܺܽ")) * (-47);
                        i12 = ((iM3169 ^ i10) * 14801) ^ (-1790312854);
                        i = 510989449;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -724009759:
                case 1769287807:
                    if (i4 < length2) {
                        iM31610 = (C0619.m2761("ۧ۠") ^ i10) * (-97);
                        i2 = ((iM31610 ^ i11) * (-20313)) ^ (-1505589189);
                        i3 = 725746877;
                    } else {
                        iM31610 = C0619.m2761("᩶۟") ^ i11;
                        i2 = ((iM31610 ^ i10) * (-4371)) ^ (-1517591810);
                        i3 = -797380624;
                    }
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case -711583079:
                case -662821504:
                    if (C20932.f66974 > 0) {
                        throw new C4866(RunnableC1848.m6367(new C13778(2), iM2761));
                    }
                    iM3169 = (C0619.m2761("ۨ֨") + i11) * (-23);
                    i12 = ((iM3169 ^ i10) * (-23189)) ^ 979018156;
                    i = -137965007;
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -594279851:
                case -211860364:
                    int i19 = s2 + s;
                    if (i8 - (i19 * i19) >= 0) {
                        iM3169 = (C0773.m3169("᩶֡") ^ i10) * (-101);
                        i12 = ((iM3169 ^ i11) * (-17011)) ^ (-1373553213);
                        i = -116328356;
                    } else {
                        iM3169 = C0773.m3169("ۖۗ") ^ i11;
                        i12 = ((iM3169 ^ i10) * 26609) ^ (-37869893);
                        i = 842221093;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case -557385807:
                case 1776228179:
                    C0950.m3785();
                    return null;
                case -477484271:
                case 676138031:
                    i4 = 0;
                    length2 = iArr2.length;
                    i17 = 0;
                    iM31610 = C0773.m3169("֨۫") ^ i11;
                    i2 = ((iM31610 ^ i10) * (-29481)) ^ 1119016394;
                    i3 = 1422873771;
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case 87633509:
                case 1705076015:
                    int i20 = i18 + i7;
                    i8 = i20 + i20;
                    s = 14174;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ܰ֡") + i11) * (-127);
                        i12 = ((iM3169 ^ i10) * (-24603)) ^ (-2126290773);
                        i = 2076725980;
                    } else {
                        iM3169 = C0619.m2761("᩵᩷") ^ i10;
                        i12 = ((iM3169 ^ i11) * 677) ^ (-565784800);
                        i = -1425084336;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
                case 195250612:
                case 1521170864:
                    C1826.m6301();
                    RunnableC1848.m6360();
                    iM31610 = C0773.m3169("᩸᩺") ^ i10;
                    i2 = ((iM31610 ^ i11) * (-31911)) ^ 1513663463;
                    i3 = 831431383;
                    i13 = iM31610 ^ i3;
                    i12 = i2;
                    break;
                case 210422917:
                case 317070526:
                    throw new C4866(C3033.m9850(c13778M6306, iM2761));
                case 312460699:
                case 1454378130:
                    return iArr3;
                case 1395173059:
                case 1807673756:
                    c2592M6238 = C1783.m6238(4176);
                    length = iArr2.length;
                    if (!C17202.m40372()) {
                        iM3169 = (C0619.m2761("ۨ֨") + i11) * (-23);
                        i12 = ((iM3169 ^ i10) * (-23189)) ^ 979018156;
                        i = -137965007;
                        i13 = iM3169 ^ i;
                        iArr2 = iArr;
                    } else {
                        iM31610 = C0619.m2761("ܺ۬") ^ i10;
                        i2 = ((iM31610 ^ i11) * (-7745)) ^ 794824538;
                        i3 = 873399259;
                        i13 = iM31610 ^ i3;
                        i12 = i2;
                    }
                    break;
                default:
                    if (C6790.m18963()) {
                        iM3169 = (i11 - C0619.m2761("۠᩶")) * 51;
                        i12 = ((iM3169 ^ i10) * 22995) ^ 1104042511;
                        i = 761231782;
                    } else {
                        iM3169 = C0773.m3169("᩶ۧ") ^ i11;
                        i12 = ((iM3169 ^ i10) * 21153) ^ (-1233429215);
                        i = -751041541;
                    }
                    i13 = iM3169 ^ i;
                    iArr2 = iArr;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0160 A[PHI: r6 r7 r8 r11 r12 r15
      0x0160: PHI (r6v3 java.lang.String[]) = (r6v1 java.lang.String[]), (r6v2 java.lang.String[]), (r6v1 java.lang.String[]) binds: [B:107:0x0160, B:35:0x015e, B:26:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r7v3 char) = (r7v1 char), (r7v2 char), (r7v1 char) binds: [B:107:0x0160, B:35:0x015e, B:26:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v1 java.lang.String), (r8v3 java.lang.String) binds: [B:107:0x0160, B:35:0x015e, B:26:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:107:0x0160, B:35:0x015e, B:26:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:107:0x0160, B:35:0x015e, B:26:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:107:0x0160, B:35:0x015e, B:26:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x03fe A[PHI: r3 r14 r18 r19 r20 r21 r22 r23 r27
      0x03fe: PHI (r3v24 int) = (r3v3 int), (r3v4 int), (r3v25 int) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r14v27 int) = (r14v8 int), (r14v9 int), (r14v28 int) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r20v4 short) = (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r21v4 short) = (r21v2 short), (r21v3 short), (r21v2 short) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r22v17 int) = (r22v4 int), (r22v5 int), (r22v18 int) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r23v14 short[]) = (r23v4 short[]), (r23v5 short[]), (r23v15 short[]) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r27v27 l.ۖۢ᩻) = (r27v8 l.ۖۢ᩻), (r27v9 l.ۖۢ᩻), (r27v28 l.ۖۢ᩻) binds: [B:86:0x03fc, B:82:0x03d1, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m46447(C6025 c6025) throws C4866 {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        C2592 c2592;
        int i5;
        short[] sArr;
        int iM31610;
        int i6;
        int i7;
        C2592 c2593;
        C2592 c2594;
        short[] sArr2;
        int i8;
        int i9;
        int i10 = 0;
        int iM31611 = 0;
        C2592 c2592M12270 = null;
        int i11 = 0;
        C13778 c13778M6306 = null;
        String[] strArr = null;
        char c = 0;
        String str = null;
        String strM4861 = null;
        int i12 = 1335079865;
        int i13 = C3099.f10023;
        int i14 = C3690.f12684;
        int iM2762 = C0619.m2761("۠ۚ") ^ i13;
        int i15 = ((iM2762 ^ i14) * (-26775)) ^ (-2137379973);
        int i16 = iM2762 ^ 1229131502;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        char c2 = 0;
        int i20 = 0;
        int i21 = 0;
        short s = 0;
        short s2 = 0;
        int i22 = 0;
        boolean zM18953 = false;
        int i23 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * 11427) >> 31));
            switch (i12) {
                case -2139951855:
                case -252345290:
                    c2592 = c2592M12270;
                    i22 = i22;
                    i5 = i23;
                    zM18953 = C6790.m18953();
                    sArr4 = f64831;
                    if (C4238.f15451 >= 0) {
                        i10 = 2;
                        int iM31612 = (C0773.m3169("ܶ᩵") ^ i13) * (-9);
                        i23 = i5;
                        c2593 = c2592;
                        i16 = iM31612 ^ (-699485971);
                        i15 = ((iM31612 ^ i14) * 6665) ^ (-707678168);
                        i10 = i10;
                        i22 = i22;
                        c2592M12270 = c2593;
                    } else {
                        int iM2763 = C0619.m2761("᩵᩶") ^ i13;
                        i22 = i22;
                        i23 = i5;
                        c2592M12270 = c2592;
                        i16 = iM2763 ^ 1252487533;
                        i15 = ((iM2763 ^ i14) * 3387) ^ (-87209845);
                        i10 = 2;
                    }
                    break;
                case -1944523060:
                case 1198801558:
                    C1542.m5459();
                    if (C3492.f12043 > 0) {
                        c2592M12270 = c2592M12270;
                        i22 = i22;
                        i23 = i23;
                        sArr4 = sArr4;
                        i10 = i10;
                        iM3169 = (C0773.m3169("۫۠") ^ i13) * 17;
                        i3 = ((iM3169 ^ i14) * (-21847)) ^ (-2088735094);
                        i4 = 2055823983;
                        int i24 = iM3169 ^ i4;
                        i23 = i23;
                        c2593 = c2592M12270;
                        i16 = i24;
                        i15 = i3;
                        i10 = i10;
                        sArr4 = sArr4;
                        i22 = i22;
                        c2592M12270 = c2593;
                    } else {
                        c2594 = c2592M12270;
                        i9 = i22;
                        sArr2 = sArr4;
                        i8 = i10;
                        int iM31613 = C0773.m3169("ܿܽ") ^ i14;
                        sArr = sArr2;
                        i22 = i9;
                        i15 = ((iM31613 ^ i13) * 1393) ^ (-1599270564);
                        c2592M12270 = c2594;
                        i16 = iM31613 ^ 730783045;
                        i10 = i8;
                        sArr4 = sArr;
                    }
                    break;
                case -1916437964:
                case -1312566611:
                    c2592M12270 = c2592M12270;
                    i22 = i22;
                    i23 = i23;
                    sArr4 = sArr4;
                    i10 = i10;
                    if ((s * s2) - i21 > 0) {
                        iM3169 = C0773.m3169("۟۫") ^ i14;
                        i3 = ((iM3169 ^ i13) * 355) ^ (-15100480);
                        i4 = 1633236084;
                    } else {
                        iM3169 = C0619.m2761("ܽܳ") ^ i14;
                        i3 = ((iM3169 ^ i13) * 17133) ^ 575680853;
                        i4 = 469909153;
                    }
                    int i25 = iM3169 ^ i4;
                    i23 = i23;
                    c2593 = c2592M12270;
                    i16 = i25;
                    i15 = i3;
                    i10 = i10;
                    sArr4 = sArr4;
                    i22 = i22;
                    c2592M12270 = c2593;
                    break;
                case -1817459052:
                case -93447022:
                    C1146.m4231();
                    if (C20932.f66974 > 0) {
                        iM2761 = C0619.m2761("֨۬") ^ i13;
                        i = ((iM2761 ^ i14) * 29833) ^ 758194152;
                        i2 = 522587732;
                        i16 = iM2761 ^ i2;
                        i15 = i;
                    } else {
                        c2592M12270 = c2592M12270;
                        i22 = i22;
                        i23 = i23;
                        sArr4 = sArr4;
                        i10 = i10;
                        iM3169 = (C0773.m3169("۫۠") ^ i13) * 17;
                        i3 = ((iM3169 ^ i14) * (-21847)) ^ (-2088735094);
                        i4 = 2055823983;
                        int i26 = iM3169 ^ i4;
                        i23 = i23;
                        c2593 = c2592M12270;
                        i16 = i26;
                        i15 = i3;
                        i10 = i10;
                        sArr4 = sArr4;
                        i22 = i22;
                        c2592M12270 = c2593;
                    }
                    break;
                case -1734002270:
                case -1328462478:
                    c2592M12270 = C3779.m12270(4169);
                    i11 = c6025.f20606;
                    if (C0269.m1775() <= 0) {
                        c2592 = c2592M12270;
                        i22 = i22;
                        i5 = i23;
                        int iM31614 = (C0773.m3169("ܶ᩵") ^ i13) * (-9);
                        i23 = i5;
                        c2593 = c2592;
                        i16 = iM31614 ^ (-699485971);
                        i15 = ((iM31614 ^ i14) * 6665) ^ (-707678168);
                        i10 = i10;
                        i22 = i22;
                        c2592M12270 = c2593;
                    } else {
                        int iM2764 = C0619.m2761("᩺ۛ") ^ i14;
                        i15 = ((iM2764 ^ i13) * 22167) ^ 1728445899;
                        i16 = iM2764 ^ 1861486192;
                    }
                    break;
                case -1476540564:
                case -1451152707:
                    C3077.m10041();
                    RunnableC1848.m6360();
                    c2594 = c2592M12270;
                    i9 = i22;
                    sArr2 = sArr4;
                    i8 = i10;
                    int iM31615 = C0773.m3169("ܿܽ") ^ i14;
                    sArr = sArr2;
                    i22 = i9;
                    i15 = ((iM31615 ^ i13) * 1393) ^ (-1599270564);
                    c2592M12270 = c2594;
                    i16 = iM31615 ^ 730783045;
                    i10 = i8;
                    sArr4 = sArr;
                    break;
                case -1317929164:
                case 2126710574:
                    C2592 c2595 = c2592M12270;
                    if (C6790.m18963()) {
                        iM31610 = (i13 - C0773.m3169("ۗۘ")) * (-15);
                        i6 = ((iM31610 ^ i14) * (-9893)) ^ (-1968293254);
                        i7 = -78160549;
                    } else {
                        iM31610 = (C0773.m3169("ۢܿ") + i14) * (-9);
                        i6 = ((iM31610 ^ i13) * 11697) ^ 1765142877;
                        i7 = 2042345321;
                    }
                    c2593 = c2595;
                    i16 = iM31610 ^ i7;
                    i15 = i6;
                    c2592M12270 = c2593;
                    break;
                case -1116277083:
                case 419429602:
                    throw new C4866(C3033.m9850(c13778M6306, iM31611));
                case -1042897377:
                case 360545275:
                    RunnableC1848.m6360();
                    RunnableC3646.m11813();
                    return null;
                case -682375193:
                case 1385067725:
                    strArr = new String[i10];
                    c = 0;
                    strArr[0] = C1080.m4049(c13778M6306);
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("֨۬") ^ i13;
                        i = ((iM2761 ^ i14) * 29833) ^ 758194152;
                        i2 = 522587732;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩹") ^ i14;
                        i = ((iM2761 ^ i13) * (-26557)) ^ (-1179677479);
                        i2 = 875752446;
                    }
                    i16 = iM2761 ^ i2;
                    i15 = i;
                    break;
                case -588654922:
                case 2049047201:
                    throw new C4866(C3033.m9850(new C13778(i10), iM31611));
                case -535406591:
                case 265522317:
                    c2592M12270 = c2592M12270;
                    i22 = i22;
                    i23 = i23;
                    sArr4 = sArr4;
                    i10 = i10;
                    s = sArr3[c2];
                    i20 = s * s;
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("۫۠") ^ i13) * 17;
                        i3 = ((iM3169 ^ i14) * (-21847)) ^ (-2088735094);
                        i4 = 2055823983;
                    } else {
                        iM3169 = C0619.m2761("᩹ۚ") ^ i13;
                        i3 = ((iM3169 ^ i14) * 4683) ^ 1034112576;
                        i4 = 476035208;
                    }
                    int i27 = iM3169 ^ i4;
                    i23 = i23;
                    c2593 = c2592M12270;
                    i16 = i27;
                    i15 = i3;
                    i10 = i10;
                    sArr4 = sArr4;
                    i22 = i22;
                    c2592M12270 = c2593;
                    break;
                case -490123791:
                case 180438112:
                    strArr[1] = C1080.m4049(c13778M6306);
                    if (f64832) {
                        iM2761 = C0773.m3169("ۤۧ") ^ i14;
                        i = ((iM2761 ^ i13) * 5277) ^ 1477983185;
                        i2 = -945297265;
                    } else {
                        iM2761 = (C0619.m2761("ܰ᩻") ^ i13) * (-91);
                        i = ((iM2761 ^ i14) * 6403) ^ (-162160413);
                        i2 = -1597986087;
                    }
                    i16 = iM2761 ^ i2;
                    i15 = i;
                    break;
                case -345970448:
                case -12380060:
                    strM4861 = C1321.m4861(sArr5, i19, i18, i17);
                    sArr6 = f64831;
                    if (C1564.f5401 > 0) {
                        iM2761 = C0619.m2761("ᩴۗ") ^ i14;
                        i = ((iM2761 ^ i13) * 27445) ^ 312000818;
                        i2 = 1982248523;
                        i16 = iM2761 ^ i2;
                        i15 = i;
                    } else {
                        c2592 = c2592M12270;
                        i22 = i22;
                        i5 = i23;
                        int iM31616 = (C0773.m3169("ܶ᩵") ^ i13) * (-9);
                        i23 = i5;
                        c2593 = c2592;
                        i16 = iM31616 ^ (-699485971);
                        i15 = ((iM31616 ^ i14) * 6665) ^ (-707678168);
                        i10 = i10;
                        i22 = i22;
                        c2592M12270 = c2593;
                    }
                    break;
                case -243591450:
                case 1605021432:
                    i17 = 4800;
                    iM3169 = C0773.m3169("ܿ֫") ^ i13;
                    i3 = ((iM3169 ^ i14) * 17757) ^ (-1235570203);
                    i4 = -1465411332;
                    int i28 = iM3169 ^ i4;
                    i23 = i23;
                    c2593 = c2592M12270;
                    i16 = i28;
                    i15 = i3;
                    i10 = i10;
                    sArr4 = sArr4;
                    i22 = i22;
                    c2592M12270 = c2593;
                    break;
                case -111905428:
                case 744227404:
                    str = strArr[c];
                    sArr5 = f64831;
                    i19 = 16;
                    i18 = 16;
                    if (C11235.m28309() != 0) {
                        iM2761 = C0619.m2761("֨۬") ^ i13;
                        i = ((iM2761 ^ i14) * 29833) ^ 758194152;
                        i2 = 522587732;
                    } else {
                        iM2761 = (i13 - C0619.m2761("۬᩹")) * (-21);
                        i = ((iM2761 ^ i14) * (-12779)) ^ 1112710139;
                        i2 = 707121635;
                    }
                    i16 = iM2761 ^ i2;
                    i15 = i;
                    break;
                case -95116584:
                case 974654712:
                    return strArr;
                case 104378268:
                case 318162250:
                    c2594 = c2592M12270;
                    sArr2 = sArr4;
                    i8 = i10;
                    i9 = 13;
                    i23 = 3;
                    if (RunnableC0334.f1808 <= 0) {
                        int iM31617 = C0773.m3169("ܿܽ") ^ i14;
                        sArr = sArr2;
                        i22 = i9;
                        i15 = ((iM31617 ^ i13) * 1393) ^ (-1599270564);
                        c2592M12270 = c2594;
                        i16 = iM31617 ^ 730783045;
                        i10 = i8;
                        sArr4 = sArr;
                    } else {
                        int iM31618 = (i14 - C0773.m3169("ۜۗ")) * 45;
                        i15 = ((iM31618 ^ i13) * 29149) ^ (-1339676040);
                        c2592M12270 = c2594;
                        i16 = iM31618 ^ 1361906230;
                        i10 = i8;
                        sArr4 = sArr2;
                        i22 = 13;
                    }
                    break;
                case 118483938:
                case 1141799311:
                    c2592M12270 = c2592M12270;
                    i22 = i22;
                    i23 = i23;
                    sArr4 = sArr4;
                    i10 = i10;
                    i21 = i20 + 218951209;
                    s2 = 29594;
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0773.m3169("۫۠") ^ i13) * 17;
                        i3 = ((iM3169 ^ i14) * (-21847)) ^ (-2088735094);
                        i4 = 2055823983;
                    } else {
                        iM3169 = (i13 - C0619.m2761("ۘܳ")) * (-117);
                        i3 = ((iM3169 ^ i14) * 26115) ^ (-1667064270);
                        i4 = 800242541;
                    }
                    int i29 = iM3169 ^ i4;
                    i23 = i23;
                    c2593 = c2592M12270;
                    i16 = i29;
                    i15 = i3;
                    i10 = i10;
                    sArr4 = sArr4;
                    i22 = i22;
                    c2592M12270 = c2593;
                    break;
                case 286338962:
                case 1984949141:
                    c2592M12270 = c2592M12270;
                    i22 = i22;
                    i23 = i23;
                    sArr4 = sArr4;
                    i10 = i10;
                    sArr3 = f64831;
                    c2 = '\f';
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ۚۤ") ^ i14;
                        i3 = ((iM3169 ^ i13) * (-24431)) ^ (-186475670);
                        i4 = -1386718018;
                    } else {
                        iM3169 = (i14 - C0773.m3169("᩵֫")) * 73;
                        i3 = ((iM3169 ^ i13) * 2599) ^ (-597169912);
                        i4 = 308575835;
                    }
                    int i210 = iM3169 ^ i4;
                    i23 = i23;
                    c2593 = c2592M12270;
                    i16 = i210;
                    i15 = i3;
                    i10 = i10;
                    sArr4 = sArr4;
                    i22 = i22;
                    c2592M12270 = c2593;
                    break;
                case 290895533:
                case 861098066:
                    AbstractC3624.m11755();
                    if (C3033.f9831 >= 0) {
                        c2592M12270 = c2592M12270;
                        i22 = i22;
                        i23 = i23;
                        sArr4 = sArr4;
                        i10 = i10;
                        iM3169 = C0619.m2761("ۚۤ") ^ i14;
                        i3 = ((iM3169 ^ i13) * (-24431)) ^ (-186475670);
                        i4 = -1386718018;
                        int i211 = iM3169 ^ i4;
                        i23 = i23;
                        c2593 = c2592M12270;
                        i16 = i211;
                        i15 = i3;
                        i10 = i10;
                        sArr4 = sArr4;
                        i22 = i22;
                        c2592M12270 = c2593;
                    }
                    c2592M12270 = c2592M12270;
                    i22 = i22;
                    i23 = i23;
                    sArr4 = sArr4;
                    i10 = i10;
                    iM3169 = (C0773.m3169("۫۠") ^ i13) * 17;
                    i3 = ((iM3169 ^ i14) * (-21847)) ^ (-2088735094);
                    i4 = 2055823983;
                    int i212 = iM3169 ^ i4;
                    i23 = i23;
                    c2593 = c2592M12270;
                    i16 = i212;
                    i15 = i3;
                    i10 = i10;
                    sArr4 = sArr4;
                    i22 = i22;
                    c2592M12270 = c2593;
                    break;
                case 401605275:
                case 1342471345:
                    c2592M12270.m8686(i11);
                    c13778M6306 = C1826.m6306(c2592M12270);
                    if (C1564.m5516(c13778M6306)) {
                        iM2761 = C0619.m2761("ۙۢ") ^ i13;
                        i = ((iM2761 ^ i14) * (-12181)) ^ 647042479;
                        i2 = -1895700920;
                    } else {
                        iM2761 = C0773.m3169("᩸ᩴ") ^ i13;
                        i = ((iM2761 ^ i14) * (-16225)) ^ (-1536773791);
                        i2 = -450411809;
                    }
                    i16 = iM2761 ^ i2;
                    i15 = i;
                    break;
                case 677869582:
                case 1660537251:
                    c2592 = c2592M12270;
                    if (C0487.f2131 > 0) {
                        throw new C4866(C3033.m9850(new C13778(1702), iM31611));
                    }
                    i22 = i22;
                    i5 = i23;
                    int iM31619 = (C0773.m3169("ܶ᩵") ^ i13) * (-9);
                    i23 = i5;
                    c2593 = c2592;
                    i16 = iM31619 ^ (-699485971);
                    i15 = ((iM31619 ^ i14) * 6665) ^ (-707678168);
                    i10 = i10;
                    i22 = i22;
                    c2592M12270 = c2593;
                    break;
                case 1102504823:
                case 1723867332:
                    c2592M12270 = c2592M12270;
                    short[] sArr7 = sArr4;
                    i22 = i22;
                    i23 = i23;
                    iM31611 = C0773.m3169(C3492.m11486(sArr7, i22, i23, i17)) ^ 2130243063;
                    if (!zM18953) {
                        int iM31620 = C0773.m3169("֡۠") ^ i14;
                        i15 = ((iM31620 ^ i13) * 14317) ^ 1391892575;
                        i23 = i23;
                        sArr = sArr7;
                        i22 = i22;
                        c2592M12270 = c2592M12270;
                        i16 = iM31620 ^ 1076949777;
                        sArr4 = sArr;
                    } else {
                        sArr4 = sArr7;
                        iM3169 = C0619.m2761("ܶܺ") ^ i13;
                        i10 = i10;
                        i3 = ((iM3169 ^ i14) * (-11667)) ^ 355510125;
                        i4 = 578021091;
                        int i213 = iM3169 ^ i4;
                        i23 = i23;
                        c2593 = c2592M12270;
                        i16 = i213;
                        i15 = i3;
                        i10 = i10;
                        sArr4 = sArr4;
                        i22 = i22;
                        c2592M12270 = c2593;
                    }
                    break;
                case 1222036936:
                case 1910489587:
                    strArr[c] = C1146.m4228(str, strM4861, C1564.m5510(sArr6, 32, 38, i17));
                    iM2761 = (C0619.m2761("ܰ᩻") ^ i13) * (-91);
                    i = ((iM2761 ^ i14) * 6403) ^ (-162160413);
                    i2 = -1597986087;
                    i16 = iM2761 ^ i2;
                    i15 = i;
                    break;
                default:
                    i17 = 13550;
                    iM3169 = C0773.m3169("ܿ֫") ^ i13;
                    i3 = ((iM3169 ^ i14) * 17757) ^ (-1235570203);
                    i4 = -1465411332;
                    int i214 = iM3169 ^ i4;
                    i23 = i23;
                    c2593 = c2592M12270;
                    i16 = i214;
                    i15 = i3;
                    i10 = i10;
                    sArr4 = sArr4;
                    i22 = i22;
                    c2592M12270 = c2593;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m46449() throws C4866 {
        int iM2761;
        int i;
        C13778 c13778M6306 = null;
        int iM33672 = 0;
        int iM33674 = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        C6025 c6025 = null;
        String strM6958 = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 419996406;
        int i6 = C3099.f10023;
        int i7 = C2288.f7433;
        int iM3169 = C0773.m3169("᩹᩺") ^ i6;
        int i8 = ((iM3169 ^ i7) * 21723) ^ (-279312208);
        int i9 = 1502384909;
        while (true) {
            int i10 = iM3169 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i7) * 20057) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -1961497741:
                    case 688595251:
                        iM33672 = c13778M6306.m33672();
                        if (iM33672 > 0) {
                            iM3169 = (i6 - C0619.m2761("ۛܳ")) * (-87);
                            i8 = ((iM3169 ^ i7) * 16783) ^ (-176262810);
                            i9 = -7152833;
                        } else {
                            iM3169 = C0773.m3169("ۤ۫") ^ i6;
                            i8 = ((iM3169 ^ i7) * 4563) ^ (-1043424025);
                            i9 = -1254504679;
                        }
                        break;
                    case -1960773508:
                    case 2134002201:
                        c6025.f20615 = strM6958;
                        c6025.f20610 = C1080.m4049(c13778M6306);
                        c6025.f20611 = c13778M6306.m33684();
                        if (C23916.f77426 > 0) {
                            iM3169 = C0619.m2761("ܶۡ") ^ i6;
                            i8 = ((iM3169 ^ i7) * 21245) ^ (-1818817970);
                            i9 = -191263751;
                        } else {
                            iM3169 = (C0773.m3169("᩶ܰ") + i7) * (-35);
                            i8 = ((iM3169 ^ i6) * 8161) ^ (-18061577);
                            i9 = 1366197958;
                        }
                        break;
                    case -1874786809:
                    case -1522177807:
                        if (!C0619.f2439) {
                            iM3169 = (C0619.m2761("ۘܽ") ^ i6) * (-95);
                            i8 = ((iM3169 ^ i7) * (-30377)) ^ 1393305615;
                            i9 = -1657513805;
                        } else {
                            iM3169 = (C0773.m3169("᩶ܰ") + i7) * (-35);
                            i8 = ((iM3169 ^ i6) * 8161) ^ (-18061577);
                            i9 = 1366197958;
                        }
                        break;
                    case -1709233475:
                    case 215957316:
                        if (i2 >= iM33674) {
                            iM3169 = C0773.m3169("᩺ۡ") ^ i7;
                            i8 = ((iM3169 ^ i6) * (-3637)) ^ (-204317039);
                            i9 = 1252072275;
                        } else {
                            iM3169 = C0773.m3169("ۛ᩻") ^ i7;
                            i8 = ((iM3169 ^ i6) * 16353) ^ 1181982461;
                            i9 = -1629499032;
                        }
                        break;
                    case -1537872397:
                    case 785154165:
                        iM33672 = iM33672;
                        int i11 = s + 781;
                        if ((i11 * i11) - i3 >= 0) {
                            iM2761 = C0619.m2761("᩸᩷") ^ i7;
                            i8 = 140687827 ^ ((iM2761 ^ i6) * 995);
                            i = 1389539533;
                        } else {
                            iM2761 = C0773.m3169("ۚᩳ") ^ i7;
                            i8 = 296233262 ^ ((iM2761 ^ i6) * (-14899));
                            i = -1428533021;
                        }
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case -1531890576:
                    case -709272371:
                        if (C2878.m9491() <= 0) {
                            iM3169 = (C0619.m2761("ᩳ᩹") + i6) * 67;
                            i8 = ((iM3169 ^ i7) * (-1531)) ^ (-1351958588);
                            i9 = -1037192726;
                        } else {
                            iM3169 = (C0773.m3169("᩶ܰ") + i7) * (-35);
                            i8 = ((iM3169 ^ i6) * 8161) ^ (-18061577);
                            i9 = 1366197958;
                        }
                        break;
                    case -1412073225:
                    case -1038703566:
                        c6025.f20608 = C0619.m2752();
                        if (RunnableC3055.m9933() == 0) {
                            iM3169 = C0773.m3169("֡۫") ^ i7;
                            i8 = ((iM3169 ^ i6) * 31111) ^ 1500262240;
                            i9 = 572370991;
                        } else {
                            iM3169 = (C0619.m2761("ᩳ᩹") + i6) * 67;
                            i8 = ((iM3169 ^ i7) * (-1531)) ^ (-1351958588);
                            i9 = -1037192726;
                        }
                        break;
                    case -1395943660:
                    case 1510326698:
                        c6025.f20612 = c13778M6306.m33672();
                        RunnableC0334.m2054(arrayList, c6025);
                        i2++;
                        iM3169 = (C0619.m2761("ۜۗ") + i7) * (-89);
                        i8 = ((iM3169 ^ i6) * 19993) ^ 982504263;
                        i9 = 1262168149;
                        break;
                    case -1309674839:
                    case 993585612:
                        C6790.m18978();
                        short[] sArr = f64831;
                        if (C3734.m12152() < 0) {
                            String strM2361 = C0487.m2361(sArr, 129, 3, i4);
                            if (C2310.f7472 < 0) {
                                throw new C4866(C3033.m9850(c13778M6306, C0773.m3169(strM2361) ^ 2116791875));
                            }
                            iM2761 = (C0619.m2761("᩺᩻") + i7) * (-91);
                            i8 = 1278508648 ^ ((iM2761 ^ i6) * 26965);
                            i = -86323201;
                            i10 = i ^ iM2761;
                            iM33672 = iM33672;
                        }
                        iM33672 = iM33672;
                        iM2761 = C0619.m2761("᩺ܺ") ^ i7;
                        i8 = 1300837061 ^ ((iM2761 ^ i6) * (-9591));
                        i = -954960980;
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case -1218020073:
                    case -591879122:
                        if (C0487.m2356() >= 0) {
                            iM3169 = (C0773.m3169("᩶ܰ") + i7) * (-35);
                            i8 = ((iM3169 ^ i6) * 8161) ^ (-18061577);
                            i9 = 1366197958;
                        }
                        iM2761 = (C0619.m2761("᩺᩻") + i7) * (-91);
                        i8 = 1278508648 ^ ((iM2761 ^ i6) * 26965);
                        i = -86323201;
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case -1202742917:
                    case 1048829169:
                        C6790.m18958(c13778M6306.m33684());
                        C6790.m18959(c13778M6306.m33675());
                        if (C1542.f5343 > 0) {
                            iM3169 = C0773.m3169("ۡۡ") ^ i6;
                            i8 = ((iM3169 ^ i7) * (-7191)) ^ (-1835529535);
                            i9 = 286135962;
                        } else {
                            iM3169 = (C0773.m3169("᩶ܰ") + i7) * (-35);
                            i8 = ((iM3169 ^ i6) * 8161) ^ (-18061577);
                            i9 = 1366197958;
                        }
                        break;
                    case -1135734605:
                    case -57861835:
                        c6025 = new C6025();
                        c6025.f20606 = c13778M6306.m33674();
                        if (C1080.f3865 < 0) {
                            iM3169 = C0619.m2761("ۤۗ") ^ i6;
                            i8 = ((iM3169 ^ i7) * (-15417)) ^ 2086640989;
                            i9 = -1706786105;
                        }
                        iM33672 = iM33672;
                        iM2761 = C0619.m2761("᩺ܺ") ^ i7;
                        i8 = 1300837061 ^ ((iM2761 ^ i6) * (-9591));
                        i = -954960980;
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case -1085812013:
                    case -930571929:
                        i4 = 37296;
                        iM2761 = C0619.m2761("ۚ᩸") ^ i6;
                        i8 = 1119029375 ^ ((iM2761 ^ i7) * 16849);
                        i = 116995779;
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case -560868561:
                    case 1078927896:
                        c6025.f20607 = C1080.m4049(c13778M6306);
                        c6025.f20613 = C1080.m4049(c13778M6306);
                        strM6958 = C2023.m6958(c13778M6306);
                        if (C1783.f6087 > 0) {
                            iM3169 = (C0773.m3169("ᩳᩴ") + i6) * (-97);
                            i8 = ((iM3169 ^ i7) * (-13109)) ^ 451652585;
                            i9 = 208574469;
                        }
                        iM33672 = iM33672;
                        iM2761 = C0619.m2761("᩺ܺ") ^ i7;
                        i8 = 1300837061 ^ ((iM2761 ^ i6) * (-9591));
                        i = -954960980;
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case -549586339:
                    case 1732640471:
                        RunnableC3055.m9933();
                        iM2761 = (C0619.m2761("᩺᩻") + i7) * (-91);
                        i8 = 1278508648 ^ ((iM2761 ^ i6) * 26965);
                        i = -86323201;
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case -531287126:
                    case 59071681:
                        C6790.m18962(iM33672);
                        C6790.m18970(c13778M6306.m33674());
                        C6790.m18968(c13778M6306.m33674());
                        if (C1146.f4234 < 0) {
                            iM3169 = (i7 - C0619.m2761("᩻᩺")) * 101;
                            i8 = ((iM3169 ^ i6) * (-11997)) ^ (-1869444163);
                            i9 = 979623945;
                        } else {
                            iM3169 = (C0619.m2761("ۘܽ") ^ i6) * (-95);
                            i8 = ((iM3169 ^ i7) * (-30377)) ^ 1393305615;
                            i9 = -1657513805;
                        }
                        break;
                    case -490911957:
                    case -311697128:
                        C6790.m18978();
                        C6790.m18962(iM33672);
                        f64833 = Collections.EMPTY_LIST;
                        iM3169 = C0773.m3169("۠۬") ^ i6;
                        i8 = ((iM3169 ^ i7) * 28057) ^ (-965874521);
                        i9 = 965882650;
                        break;
                    case -210184385:
                    case 867799954:
                        C6790.m18952(c13778M6306.m33669());
                        C6790.m18966(c13778M6306.m33669());
                        if (C2023.m6964() > 0) {
                            iM3169 = C0619.m2761("ܰ᩹") ^ i7;
                            i8 = ((iM3169 ^ i6) * 23061) ^ 1209144944;
                            i9 = 1557201637;
                        } else {
                            iM3169 = (C0619.m2761("ᩳ᩹") + i6) * 67;
                            i8 = ((iM3169 ^ i7) * (-1531)) ^ (-1351958588);
                            i9 = -1037192726;
                        }
                        break;
                    case 31270570:
                    case 600829380:
                        iM33672 = iM33672;
                        s = f64831[128];
                        i3 = s * 3124;
                        if (C4238.m13540() <= 0) {
                            iM2761 = C0619.m2761("᩺ܺ") ^ i7;
                            i8 = 1300837061 ^ ((iM2761 ^ i6) * (-9591));
                            i = -954960980;
                        } else {
                            iM2761 = (C0619.m2761("ܽۗ") ^ i6) * 23;
                            i8 = 782457549 ^ ((iM2761 ^ i7) * (-13789));
                            i = 1261782551;
                        }
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case 224681288:
                    case 1639978384:
                        f64832 = C6790.m18967();
                        return;
                    case 302802062:
                    case 1230778428:
                        iM33674 = c13778M6306.m33674();
                        arrayList = new ArrayList(iM33674);
                        i2 = 0;
                        iM3169 = (C0619.m2761("ۜۗ") + i7) * (-89);
                        i8 = ((iM3169 ^ i6) * 19993) ^ 982504263;
                        i9 = 1262168149;
                        break;
                        break;
                    case 498391404:
                    case 686819241:
                        f64833 = arrayList;
                        iM3169 = C0773.m3169("۠۬") ^ i6;
                        i8 = ((iM3169 ^ i7) * 28057) ^ (-965874521);
                        i9 = 965882650;
                        break;
                        break;
                    case 813947247:
                    case 1124435024:
                        i4 = 7;
                        iM2761 = C0619.m2761("ۚ᩸") ^ i6;
                        i8 = 1119029375 ^ ((iM2761 ^ i7) * 16849);
                        i = 116995779;
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    case 1588273819:
                    case 2063976177:
                        iM33672 = iM33672;
                        c13778M6306 = C1826.m6306(C1783.m6238(4164));
                        if (C2878.m9488(c13778M6306)) {
                            iM2761 = (C0619.m2761("ᩳۡ") + i7) * (-83);
                            i8 = 1922320413 ^ ((iM2761 ^ i6) * 22581);
                            i = -1790654596;
                        } else {
                            iM2761 = C0773.m3169("ܺۧ") ^ i6;
                            i8 = 964675651 ^ ((iM2761 ^ i7) * (-24727));
                            i = 1667954087;
                        }
                        i10 = i ^ iM2761;
                        iM33672 = iM33672;
                        break;
                    default:
                        RunnableC3055.m9933();
                        return;
                }
            }
        }
    }
}
