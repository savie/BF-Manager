package l;

import android.text.TextUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9398 {

    /* JADX INFO: renamed from: ۠ۧ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f30502 = {9428, 931, 940, 928, 936, 958, 953, 959, 932, 931, 938, 992, 940, 959, 959, 940, 948, 958, 953, 959, 932, 931, 938, 957, 929, 952, 959, 940, 929, 958, 912, 918, 932, 953, 936, 928, 940, 959, 959, 940, 948, 1015, 956, 952, 940, 931, 953, 932, 953, 948, 957, 929, 952, 959, 940, 929, 958, 1015, 9486, 7002, 6989, 7003, 6983, 7005, 7002, 6987, 6989, 7003, 7003, 7004, 7002, 6977, 6982, 6991, 7003, 7004, 7002, 6977, 6982, 6991, 6917, 6985, 7002, 7002, 6985, 6993, 7000, 6980, 7005, 7002, 6985, 6980, 7003, 6982, 6985, 6981, 6989, 5089, 1694, 1761};

    /* JADX WARN: Code duplicated, block: B:134:0x070d A[PHI: r3 r4 r8 r10 r12 r17 r21 r27 r31 r34 r35
      0x070d: PHI (r3v17 l.֫ܶۤ) = (r3v14 l.֫ܶۤ), (r3v15 l.֫ܶۤ), (r3v16 l.֫ܶۤ), (r3v18 l.֫ܶۤ) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r4v28 java.lang.String) = (r4v25 java.lang.String), (r4v26 java.lang.String), (r4v27 java.lang.String), (r4v31 java.lang.String) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r8v18 java.lang.StringBuilder) = 
      (r8v15 java.lang.StringBuilder)
      (r8v16 java.lang.StringBuilder)
      (r8v17 java.lang.StringBuilder)
      (r8v19 java.lang.StringBuilder)
     binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r12v19 java.lang.Object) = (r12v16 java.lang.Object), (r12v17 java.lang.Object), (r12v18 java.lang.Object), (r12v20 java.lang.Object) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r17v4 byte) = (r17v3 byte), (r17v2 byte), (r17v2 byte), (r17v2 byte) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r21v14 l.֫ܶۤ) = (r21v11 l.֫ܶۤ), (r21v12 l.֫ܶۤ), (r21v13 l.֫ܶۤ), (r21v15 l.֫ܶۤ) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r27v14 short[]) = (r27v10 short[]), (r27v12 short[]), (r27v13 short[]), (r27v18 short[]) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r31v14 int) = (r31v10 int), (r31v12 int), (r31v13 int), (r31v15 int) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r34v15 java.lang.StringBuilder) = 
      (r34v12 java.lang.StringBuilder)
      (r34v13 java.lang.StringBuilder)
      (r34v14 java.lang.StringBuilder)
      (r34v16 java.lang.StringBuilder)
     binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x070d: PHI (r35v11 l.֫ܶۤ) = (r35v8 l.֫ܶۤ), (r35v9 l.֫ܶۤ), (r35v10 l.֫ܶۤ), (r35v12 l.֫ܶۤ) binds: [B:127:0x06b5, B:119:0x0667, B:115:0x0630, B:110:0x05ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0177, code lost:
    
        if (l.C1783.f6087 <= 0) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:126:0x06b2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x044d. Please report as an issue. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map m24737(java.lang.CharSequence r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9398.m24737(java.lang.CharSequence):java.util.Map");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01ec A[PHI: r1 r4 r11
      0x01ec: PHI (r1v2 java.util.Iterator) = 
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v4 java.util.Iterator)
     binds: [B:34:0x013c, B:27:0x00ef, B:20:0x00a6, B:18:0x008e, B:51:0x01df] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r4v4 l.֨۬ۤ) = (r4v3 l.֨۬ۤ), (r4v1 l.֨۬ۤ), (r4v1 l.֨۬ۤ), (r4v1 l.֨۬ۤ), (r4v1 l.֨۬ۤ) binds: [B:34:0x013c, B:27:0x00ef, B:20:0x00a6, B:18:0x008e, B:51:0x01df] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r11v3 l.ܰܶܺ) = (r11v2 l.ܰܶܺ), (r11v2 l.ܰܶܺ), (r11v2 l.ܰܶܺ), (r11v2 l.ܰܶܺ), (r11v4 l.ܰܶܺ) binds: [B:34:0x013c, B:27:0x00ef, B:20:0x00a6, B:18:0x008e, B:51:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0265 A[PHI: r2 r3 r13 r24
      0x0265: PHI (r2v4 java.util.Map$Entry) = (r2v1 java.util.Map$Entry), (r2v3 java.util.Map$Entry), (r2v1 java.util.Map$Entry), (r2v1 java.util.Map$Entry) binds: [B:61:0x0263, B:37:0x0165, B:12:0x007c, B:8:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r3v3 java.lang.Object) = (r3v1 java.lang.Object), (r3v2 java.lang.Object), (r3v1 java.lang.Object), (r3v1 java.lang.Object) binds: [B:61:0x0263, B:37:0x0165, B:12:0x007c, B:8:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r13v3 short) = (r13v2 short), (r13v1 short), (r13v1 short), (r13v1 short) binds: [B:61:0x0263, B:37:0x0165, B:12:0x007c, B:8:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r24v3 int) = (r24v2 int), (r24v1 int), (r24v1 int), (r24v1 int) binds: [B:61:0x0263, B:37:0x0165, B:12:0x007c, B:8:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0309 A[PHI: r5 r6 r7 r8 r9 r10 r15 r16 r17
      0x0309: PHI (r5v4 java.lang.String) = 
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v2 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
     binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r6v4 java.lang.String) = 
      (r6v1 java.lang.String)
      (r6v1 java.lang.String)
      (r6v1 java.lang.String)
      (r6v1 java.lang.String)
      (r6v2 java.lang.String)
      (r6v1 java.lang.String)
      (r6v1 java.lang.String)
     binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r8v5 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r9v4 short) = (r9v1 short), (r9v1 short), (r9v2 short), (r9v1 short), (r9v1 short), (r9v1 short), (r9v1 short) binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r15v4 short[]) = (r15v1 short[]), (r15v1 short[]), (r15v1 short[]), (r15v2 short[]), (r15v1 short[]), (r15v1 short[]), (r15v1 short[]) binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r17v5 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:77:0x0307, B:73:0x02eb, B:69:0x02cd, B:30:0x0115, B:23:0x00cc, B:12:0x007c, B:105:0x0309] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14691 m24741(CharSequence charSequence) throws Throwable {
        int iM3169;
        int i;
        int i2;
        Iterator itM9936 = null;
        Map.Entry entry = null;
        Object value = null;
        C1196 c1196 = null;
        String str = null;
        String str2 = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr = null;
        int i4 = -1945443385;
        int i5 = C2419.f7754;
        int i6 = C1564.f5401;
        int iM2761 = (C0619.m2761("ۜۘ") + i5) * (-59);
        int i7 = ((iM2761 ^ i6) * (-9879)) ^ (-975142137);
        int i8 = iM2761 ^ 1157318297;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = 0;
        int i10 = 0;
        C14691 c14691 = null;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * 30731) >> 31));
            switch (i4) {
                case -2000622521:
                case 1313406365:
                    Map mapM24737 = m24737(charSequence);
                    if (C2702.f8586 <= 0 || C1542.f5343 <= 0) {
                        int iM2762 = (C0619.m2761("ۡܽ") + i5) * 75;
                        i8 = iM2762 ^ 554639011;
                        i7 = ((iM2762 ^ i6) * (-18533)) ^ 1388550890;
                        c14691 = null;
                    } else {
                        c14691 = new C14691(0, true);
                        itM9936 = RunnableC3055.m9936(mapM24737.entrySet());
                        iM3169 = (C0773.m3169("ۖ᩷") ^ i5) * 127;
                        i = ((iM3169 ^ i6) * (-31125)) ^ 439855611;
                        i2 = 782054020;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1926751421:
                case 1963901612:
                    if (C0487.m2359(str2, C3492.m11486(sArr3, i10, 1, i3))) {
                        iM3169 = (C0773.m3169("ۖ᩷") ^ i5) * 127;
                        i = ((iM3169 ^ i6) * (-31125)) ^ 439855611;
                        i2 = 782054020;
                    } else {
                        iM3169 = (C0773.m3169("֡ۖ") + i6) * (-75);
                        i = ((iM3169 ^ i5) * 6171) ^ 2030227800;
                        i2 = -975765317;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1881431800:
                case -1648494831:
                    if (C3998.m12923(itM9936)) {
                        iM3169 = C0619.m2761("ۧܿ") ^ i5;
                        i = ((iM3169 ^ i6) * 22199) ^ 2058940677;
                        i2 = -79032225;
                    } else {
                        iM3169 = C0773.m3169("۟ۜ") ^ i6;
                        i = ((iM3169 ^ i5) * 7121) ^ 918731282;
                        i2 = 1443956803;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1674233218:
                case 137982005:
                    i3 = 4028;
                    iM3169 = (C0619.m2761("᩵᩺") ^ i6) * (-35);
                    i = ((iM3169 ^ i5) * 26567) ^ 191248886;
                    i2 = 1944384099;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1661902883:
                case -795033581:
                    c14691.m35340((String) entry.getKey(), c1196.f4359);
                    iM3169 = (C0773.m3169("ۖ᩷") ^ i5) * 127;
                    i = ((iM3169 ^ i6) * (-31125)) ^ 439855611;
                    i2 = 782054020;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1583361029:
                case 416763106:
                    C3099.m10095();
                    if (C4238.f15451 < 0) {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * (-29575)) ^ (-1175188983);
                        i2 = 1582876305;
                    } else {
                        iM3169 = (C0773.m3169("ܿ۫") + i5) * (-71);
                        i = ((iM3169 ^ i6) * 19027) ^ (-687428756);
                        i2 = 1194696098;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1493891038:
                case 766947560:
                    RunnableC3646.m11813();
                    if (C3099.m10095()) {
                        iM3169 = (i6 - C0619.m2761("ۗۨ")) * (-27);
                        i = ((iM3169 ^ i5) * (-10399)) ^ (-2064115943);
                        i2 = 180684136;
                    } else {
                        iM3169 = (C0773.m3169("ܿ۫") + i5) * (-71);
                        i = ((iM3169 ^ i6) * 19027) ^ (-687428756);
                        i2 = 1194696098;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1452709402:
                case -1262118122:
                    if (C20932.m47857(str, C1519.m5399(sArr, i9, 1, i3))) {
                        iM3169 = (C0773.m3169("ۖ᩷") ^ i5) * 127;
                        i = ((iM3169 ^ i6) * (-31125)) ^ 439855611;
                        i2 = 782054020;
                    } else {
                        iM3169 = (C0619.m2761("֡ᩳ") + i6) * (-93);
                        i = ((iM3169 ^ i5) * (-24259)) ^ (-792986586);
                        i2 = 1048278422;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1432601487:
                case 1363263616:
                    i11 = s * s;
                    i12 = 255168676;
                    if (C20932.f66974 <= 0) {
                        iM3169 = (i5 - C0619.m2761("᩻ܶ")) * 17;
                        i = ((iM3169 ^ i6) * 2519) ^ 1732113918;
                        i2 = -1454779267;
                    } else {
                        iM3169 = C0619.m2761("۬۠") ^ i6;
                        i = ((iM3169 ^ i5) * (-21689)) ^ (-144464808);
                        i2 = 1720136650;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1272384173:
                case 1403941991:
                    str = c1196.f4359;
                    sArr = f30502;
                    i9 = 98;
                    if (RunnableC1848.m6360()) {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * (-29575)) ^ (-1175188983);
                        i2 = 1582876305;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ܳ۠")) * 59;
                        i = ((iM3169 ^ i5) * (-3943)) ^ 691664760;
                        i2 = -375220572;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -926381817:
                case 728113013:
                    sArr2 = f30502;
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * (-29575)) ^ (-1175188983);
                        i2 = 1582876305;
                    } else {
                        iM3169 = C0773.m3169("ۤᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * 31471) ^ (-477075550);
                        i2 = 502323741;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -761300084:
                case -664247531:
                    s = sArr2[c];
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * (-29575)) ^ (-1175188983);
                        i2 = 1582876305;
                    } else {
                        iM3169 = (C0773.m3169("ۙ֫") ^ i5) * 23;
                        i = ((iM3169 ^ i6) * (-5969)) ^ 377812452;
                        i2 = -399569223;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -654329675:
                case -18038033:
                    int i14 = s + s2;
                    if (i13 - (i14 * i14) < 0) {
                        iM3169 = C0619.m2761("۠ۗ") ^ i5;
                        i = ((iM3169 ^ i6) * (-14849)) ^ (-2145512839);
                        i2 = 339877891;
                    } else {
                        iM3169 = (C0619.m2761("ۖۢ") + i6) * (-29);
                        i = ((iM3169 ^ i5) * (-8223)) ^ 956955373;
                        i2 = 1789060728;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -397617088:
                case 517421008:
                    c1196 = (C1196) value;
                    if (C1942.m6727(c1196.f4359)) {
                        iM3169 = (i5 - C0619.m2761("ۚۨ")) * 73;
                        i = ((iM3169 ^ i6) * (-19575)) ^ (-967462509);
                        i2 = -1169566853;
                    } else {
                        iM3169 = (C0773.m3169("ۖ᩷") ^ i5) * 127;
                        i = ((iM3169 ^ i6) * (-31125)) ^ 439855611;
                        i2 = 782054020;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 9418815:
                case 1980777445:
                    i3 = 1758;
                    iM3169 = (C0619.m2761("᩵᩺") ^ i6) * (-35);
                    i = ((iM3169 ^ i5) * 26567) ^ 191248886;
                    i2 = 1944384099;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 245608462:
                case 1223784345:
                    str2 = c1196.f4359;
                    sArr3 = f30502;
                    i10 = 99;
                    if (C1343.m4943()) {
                        iM3169 = C0773.m3169("۟֨") ^ i5;
                        i = ((iM3169 ^ i6) * 21023) ^ (-2119782753);
                        i2 = 90112096;
                    } else {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * (-29575)) ^ (-1175188983);
                        i2 = 1582876305;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 470814477:
                case 1127744526:
                    int i15 = i11 + i12;
                    i13 = i15 + i15;
                    s2 = 15974;
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("ܿ۫") + i5) * (-71);
                        i = ((iM3169 ^ i6) * 19027) ^ (-687428756);
                        i2 = 1194696098;
                    } else {
                        iM3169 = C0773.m3169("֡᩻") ^ i5;
                        i = ((iM3169 ^ i6) * 30445) ^ (-1550703395);
                        i2 = 1351135685;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 511326491:
                case 746992173:
                    return c14691;
                case 617602392:
                case 1952127738:
                    C1519.m5403();
                    C2966.m9664();
                    int iM2763 = (C0619.m2761("ۡܽ") + i5) * 75;
                    i8 = iM2763 ^ 554639011;
                    i7 = ((iM2763 ^ i6) * (-18533)) ^ 1388550890;
                    c14691 = null;
                    break;
                case 978766943:
                case 1933380845:
                    entry = (Map.Entry) C4238.m13529(itM9936);
                    value = entry.getValue();
                    if (C13473.m33144()) {
                        iM3169 = (i6 - C0619.m2761("ۢۜ")) * 85;
                        i = ((iM3169 ^ i5) * 9189) ^ (-1492167181);
                        i2 = 1550322029;
                    } else {
                        iM3169 = (C0773.m3169("ܿ۫") + i5) * (-71);
                        i = ((iM3169 ^ i6) * 19027) ^ (-687428756);
                        i2 = 1194696098;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 1639745348:
                case 1678254759:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * (-29575)) ^ (-1175188983);
                        i2 = 1582876305;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        int iM2764 = (C0619.m2761("ۡܽ") + i5) * 75;
                        i8 = iM2764 ^ 554639011;
                        i7 = ((iM2764 ^ i6) * (-18533)) ^ 1388550890;
                        c14691 = null;
                    }
                    break;
                case 1734855614:
                case 1742883931:
                    c = 'a';
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * (-29575)) ^ (-1175188983);
                        i2 = 1582876305;
                    } else {
                        iM3169 = C0773.m3169("ۢᩴ") ^ i5;
                        i = ((iM3169 ^ i6) * 20873) ^ 384796506;
                        i2 = 1525175764;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                default:
                    C2287.m7745();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0640 A[PHI: r28 r33
      0x0640: PHI (r28v4 int) = (r28v2 int), (r28v1 int), (r28v1 int) binds: [B:166:0x063e, B:143:0x0526, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x0640: PHI (r33v75 int) = (r33v58 int), (r33v65 int), (r33v76 int) binds: [B:166:0x063e, B:143:0x0526, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0283 A[PHI: r33 r34
      0x0283: PHI (r33v37 boolean) = (r33v12 boolean), (r33v33 boolean), (r33v38 boolean) binds: [B:269:0x0283, B:73:0x026a, B:59:0x01cf] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r34v17 int) = (r34v6 int), (r34v13 int), (r34v18 int) binds: [B:269:0x0283, B:73:0x026a, B:59:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011e, code lost:
    
        if (l.C4282.f15546 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0128, code lost:
    
        if (l.C3690.m11987() != false) goto L28;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m24740(android.text.GetChars r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9398.m24740(android.text.GetChars):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (l.C13473.f42873 != 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m24739(l.C14691 r29, l.InterfaceC19106 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9398.m24739(l.ܰܶܺ, l.ᩳ۬᩸):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1196 m24738(CharSequence charSequence, C2008 c2008) {
        ArrayList arrayListM6858 = null;
        Object objM5473 = null;
        AbstractC22891 abstractC22891 = null;
        int iM51624 = 0;
        int iM11247 = 0;
        int i = 0;
        int i2 = 0;
        AbstractC22891 abstractC22892 = null;
        int iM51623 = 0;
        int iLastIndexOf = 0;
        int i3 = 96332575;
        int i4 = C1564.f5401;
        int i5 = C2287.f7432;
        int iM3169 = (i5 - C0773.m3169("ܺۡ")) * 119;
        int i6 = ((iM3169 ^ i4) * 32341) ^ 1519794023;
        int i7 = 815049952;
        while (true) {
            i3 = ((((i3 ^ i4) * 299) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -1981747497:
                case 1900672502:
                    objM5473 = C1542.m5473(arrayListM6858, 0);
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۢۘ")) * (-47);
                        i6 = ((iM3169 ^ i5) * 31903) ^ (-1374361468);
                        i7 = -495148766;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩸᩵")) * (-95);
                        i6 = ((iM3169 ^ i4) * (-2139)) ^ 819366195;
                        i7 = 1948007244;
                    }
                    break;
                case -1737661404:
                case -1002805667:
                    return new C1196("", iLastIndexOf, iLastIndexOf);
                case -1673961681:
                case -377084457:
                    C2878.m9491();
                    if (C3998.f13671 == 0) {
                        iM3169 = (i4 - C0619.m2761("ۨ᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM3169 ^ i5) * 481) ^ 996108858;
                        i7 = -1885046125;
                    } else {
                        iM3169 = (C0619.m2761("ۧܳ") ^ i5) * (-91);
                        i6 = ((iM3169 ^ i4) * (-29391)) ^ (-714536211);
                        i7 = 574983663;
                    }
                    break;
                case -1468370023:
                case -544951445:
                    abstractC22892 = (AbstractC22891) C1542.m5473(arrayListM6858, i2);
                    if (C2354.m7983()) {
                        iM3169 = C0773.m3169("ܽۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 28909) ^ (-194013355);
                        i7 = -19180464;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܶۧ")) * (-15);
                        i6 = ((iM3169 ^ i4) * (-6499)) ^ (-1751635306);
                        i7 = -1956084826;
                    }
                    break;
                case -1462307027:
                case 392402880:
                    C2485.m8357();
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ۧܳ") ^ i5) * (-91);
                        i6 = ((iM3169 ^ i4) * (-29391)) ^ (-714536211);
                        i7 = 574983663;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩵ᩳ")) * (-97);
                        i6 = ((iM3169 ^ i5) * 18941) ^ 1985954268;
                        i7 = -1413581887;
                    }
                    break;
                case -1235718229:
                case 1080090579:
                    i2 = iM11247 + i;
                    if (C2023.m6964() <= 0) {
                        iM3169 = (i5 - C0773.m3169("ܶۧ")) * (-15);
                        i6 = ((iM3169 ^ i4) * (-6499)) ^ (-1751635306);
                        i7 = -1956084826;
                    } else {
                        iM3169 = C0619.m2761("᩺ۖ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 18121) ^ (-498326236);
                        i7 = 1603278590;
                    }
                    break;
                case -1174775930:
                case 2128047284:
                    if (C3998.f13671 == 0) {
                        return new C1196(C2023.m6952(charSequence.subSequence(iM51624, iM51623)), iM51624, iM51623);
                    }
                    iM3169 = (i4 - C0619.m2761("ۢۘ")) * (-47);
                    i6 = ((iM3169 ^ i5) * 31903) ^ (-1374361468);
                    i7 = -495148766;
                    break;
                case -1172599762:
                case 134119368:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i4 - C0619.m2761("ۨ᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM3169 ^ i5) * 481) ^ 996108858;
                        i7 = -1885046125;
                    } else {
                        iM3169 = C0619.m2761("᩷᩷") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-27879)) ^ 1574104591;
                        i7 = 1328831354;
                    }
                    break;
                case -819950701:
                case 138287702:
                    arrayListM6858 = c2008.m6858();
                    if (AbstractC0116.m1231(arrayListM6858)) {
                        iM3169 = C0773.m3169("ۢܳ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 9785) ^ (-1366628224);
                        i7 = 266435887;
                    } else {
                        iM3169 = C0619.m2761("ۤۨ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 13941) ^ 1737536631;
                        i7 = -210250784;
                    }
                    break;
                case -752070552:
                case 208310720:
                    abstractC22891 = (AbstractC22891) objM5473;
                    if (C3448.m11248() != 0) {
                        iM3169 = (i5 - C0773.m3169("ܶۧ")) * (-15);
                        i6 = ((iM3169 ^ i4) * (-6499)) ^ (-1751635306);
                        i7 = -1956084826;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܺ") ^ i4) * (-109);
                        i6 = ((iM3169 ^ i5) * (-18747)) ^ (-590607810);
                        i7 = -1101248046;
                    }
                    break;
                case -673831204:
                case 247536492:
                    iM11247 = C3448.m11247(arrayListM6858);
                    i = -1;
                    if (C0862.m3503()) {
                        iM3169 = C0619.m2761("֨ۗ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 32729) ^ (-854361547);
                        i7 = -858834889;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܶۧ")) * (-15);
                        i6 = ((iM3169 ^ i4) * (-6499)) ^ (-1751635306);
                        i7 = -1956084826;
                    }
                    break;
                case -340356975:
                case 1442753590:
                    C2419.m8174();
                    C0619.m2763();
                    iM3169 = (i4 - C0619.m2761("᩵ᩳ")) * (-97);
                    i6 = ((iM3169 ^ i5) * 18941) ^ 1985954268;
                    i7 = -1413581887;
                    break;
                case -171721282:
                case 147217143:
                    if (C2310.m7813() > 0) {
                        iM3169 = (i4 - C0619.m2761("ۢۘ")) * (-47);
                        i6 = ((iM3169 ^ i5) * 31903) ^ (-1374361468);
                        i7 = -495148766;
                    } else {
                        iM3169 = (C0619.m2761("ۧܳ") ^ i5) * (-91);
                        i6 = ((iM3169 ^ i4) * (-29391)) ^ (-714536211);
                        i7 = 574983663;
                    }
                    break;
                case 85990942:
                case 1970683917:
                    iLastIndexOf = TextUtils.lastIndexOf(charSequence, '<', c2008.m51623());
                    if (RunnableC1848.m6360()) {
                        iM3169 = (i5 - C0773.m3169("ܶۧ")) * (-15);
                        i6 = ((iM3169 ^ i4) * (-6499)) ^ (-1751635306);
                        i7 = -1956084826;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ۡۛ")) * (-49);
                        i6 = ((iM3169 ^ i4) * (-15967)) ^ 1871644747;
                        i7 = -473332379;
                    }
                    break;
                case 638203594:
                case 1681290732:
                    RunnableC3055.m9933();
                    C3734.m12152();
                    return null;
                case 1168337409:
                case 1891856098:
                    iM51624 = abstractC22891.m51624();
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (i4 - C0619.m2761("᩵ᩳ")) * (-97);
                        i6 = ((iM3169 ^ i5) * 18941) ^ 1985954268;
                        i7 = -1413581887;
                    } else {
                        iM3169 = C0619.m2761("۟ۡ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-27177)) ^ 1145962584;
                        i7 = 1472291639;
                    }
                    break;
                default:
                    iM51623 = abstractC22892.m51623();
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("ۧܳ") ^ i5) * (-91);
                        i6 = ((iM3169 ^ i4) * (-29391)) ^ (-714536211);
                        i7 = 574983663;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩶ۡ")) * 99;
                        i6 = ((iM3169 ^ i4) * (-6571)) ^ (-387980817);
                        i7 = 1041787996;
                    }
                    break;
            }
        }
    }
}
