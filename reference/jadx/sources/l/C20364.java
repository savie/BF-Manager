package l;

import android.app.Application;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩶ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T5M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20364 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static volatile long f65937;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9186 f65938;

    /* JADX INFO: renamed from: ۡܽ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f65939 = {4921, 6424, 6419, 6420, 6484, 6423, 6414, 6484, 6410, 6422, 6415, 6409, 6413, 6402, 6431, 6424, 6425, 6473, 6428, 6424, 6424, 6477, 6477, 6478, 6475, 6425, 6475, 6476, 6425, 6431, 6413, 6402, 6431, 6479, 6479, 6475, 6472, 6473, 6467, 6472, 6425, 6476, 6430, 6466, 6474, 6472, 6479, 6467, 2660, -20410, -20399, -20398, -20415, -20390, -20400, -20399, -20400, -20412, -20395, -20387, -20400, 1816, 15425, 10954, 11450, -16313, 14740, 12671, 11210, -1100, 10488, -14531, -14963, -11659, -14575, -10567, -109, -4132, -1121, -15862, -9518};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Runnable f65940;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f65941;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m45944(C9076 c9076) {
        long jM23411 = 0;
        long j = 0;
        int i = 1476074936;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C1148.f5161;
        int iM45029 = (C19806.m45029("ܰ۫") + i3) * 7;
        int i4 = ((iM45029 ^ i2) * (-7877)) ^ 1639606690;
        int i5 = -1735243199;
        while (true) {
            i = ((((i ^ i2) * (-8495)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2110803465:
                case 1271474337:
                    return true;
                case -2101593460:
                case -1364446656:
                    if (RunnableC1606.f6488 < 0) {
                        iM45029 = C19806.m45029("ۚ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12893) ^ 813442995;
                        i5 = 1249819594;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9003) ^ (-210267166);
                        i5 = -643242464;
                    }
                    break;
                case -1882485848:
                case 2840559:
                    if (!C10634.m26820()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9909) ^ 1265163248;
                        i5 = -793526327;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۫") + i2) * 7;
                        i4 = ((iM45029 ^ i3) * (-23477)) ^ (-1663798667);
                        i5 = 270218769;
                    }
                    break;
                case -1881296193:
                case 193468917:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9003) ^ (-210267166);
                        i5 = -643242464;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19965)) ^ (-533708819);
                        i5 = -8882377;
                    }
                    break;
                case -1591804435:
                case -1380876468:
                    if (jM23411 == j) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩹᩺")) * 55;
                        i4 = ((iM45029 ^ i3) * (-6449)) ^ (-2106310772);
                        i5 = 2032024892;
                    } else {
                        iM45029 = C19806.m45029("֫ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4973)) ^ (-1162680113);
                        i5 = 946740241;
                    }
                    break;
                case -1577142969:
                case 1157856635:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ܶܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15423) ^ 449990622;
                        i5 = -659295040;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۫") + i2) * 7;
                        i4 = ((iM45029 ^ i3) * (-23477)) ^ (-1663798667);
                        i5 = 270218769;
                    }
                    break;
                case -1493151843:
                case -1474363228:
                    if (C2642.m8171() != 0) {
                        iM45029 = C19806.m45029("ۚ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12893) ^ 813442995;
                        i5 = 1249819594;
                    } else {
                        iM45029 = C19806.m45029("᩸֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29677) ^ (-232367151);
                        i5 = -487841148;
                    }
                    break;
                case -1457841328:
                case 1198567485:
                    if (C3535.m10431() <= 0) {
                        iM45029 = (C19806.m45029("ۖۖ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i2) * (-3259)) ^ 1687522331;
                        i5 = -176762065;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7507)) ^ (-624268854);
                        i5 = -771582913;
                    }
                    break;
                case -1358702189:
                case -477687787:
                    RunnableC1564.m5345();
                    AbstractC0464.m2313();
                    iM45029 = (ThreadFactoryC3888.m11306("ۤ۫") + i2) * 7;
                    i4 = ((iM45029 ^ i3) * (-23477)) ^ (-1663798667);
                    i5 = 270218769;
                    break;
                case -1299857524:
                case 1466186960:
                    jM23411 = c9076.m23411();
                    j = f65937;
                    if (C1066.m4023() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۫") + i2) * 7;
                        i4 = ((iM45029 ^ i3) * (-23477)) ^ (-1663798667);
                        i5 = 270218769;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23527)) ^ 1826367086;
                        i5 = 2130452848;
                    }
                    break;
                case -1252282905:
                case 1285946332:
                    C2788.m8472();
                    return false;
                case -1023473802:
                case -385281826:
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("۬ܰ") + i3) * (-121);
                        i4 = ((iM45029 ^ i2) * (-4401)) ^ (-1283001125);
                        i5 = -2024940147;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9909) ^ 1265163248;
                        i5 = -793526327;
                    }
                    break;
                case -862177269:
                case -139289607:
                    if (C13465.m32965((Object) c9076.m23412(), (Object) C1875.m6109())) {
                        iM45029 = (C19806.m45029("۟᩹") + i3) * (-39);
                        i4 = ((iM45029 ^ i2) * o.a.i) ^ 1089206131;
                        i5 = 161974222;
                    } else {
                        iM45029 = C19806.m45029("֫ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4973)) ^ (-1162680113);
                        i5 = 946740241;
                    }
                    break;
                case -692314475:
                case 902643048:
                    C3722.m10894();
                    if (!RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۫") + i2) * 7;
                        i4 = ((iM45029 ^ i3) * (-23477)) ^ (-1663798667);
                        i5 = 270218769;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9003) ^ (-210267166);
                        i5 = -643242464;
                    }
                    break;
                case -549557523:
                case 287940609:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ۚ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12893) ^ 813442995;
                        i5 = 1249819594;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13169) ^ (-746514987);
                        i5 = -1083560716;
                    }
                    break;
                case -444624081:
                case 1232509411:
                    if (c9076 != null) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹ۤ")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-25081)) ^ (-2085463636);
                        i5 = -563599548;
                    } else {
                        iM45029 = C19806.m45029("֫ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4973)) ^ (-1162680113);
                        i5 = 946740241;
                    }
                    break;
                case 335961049:
                case 681538203:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9003) ^ (-210267166);
                        i5 = -643242464;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩹ۧ")) * 13;
                        i4 = ((iM45029 ^ i2) * (-12687)) ^ 1095774237;
                        i5 = -1529883544;
                    }
                    break;
                case 509164636:
                case 612503968:
                    if (C2788.m8472() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۫") + i2) * 7;
                        i4 = ((iM45029 ^ i3) * (-23477)) ^ (-1663798667);
                        i5 = 270218769;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14969)) ^ (-19039793);
                        i5 = 325069737;
                    }
                    break;
                case 1846354052:
                case 1874117693:
                    return false;
                default:
                    if (RunnableC0195.m1431()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ᩶") + i3) * (-17);
                        i4 = ((iM45029 ^ i2) * 8117) ^ 966875451;
                        i5 = -1903233348;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9909) ^ 1265163248;
                        i5 = -793526327;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m45945() {
        return f65941;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x04dd A[PHI: r0 r1 r17 r24
      0x04dd: PHI (r0v46 int) = (r0v19 int), (r0v21 int), (r0v47 int) binds: [B:123:0x04db, B:115:0x0481, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x04dd: PHI (r1v62 short) = (r1v37 short), (r1v39 short), (r1v63 short) binds: [B:123:0x04db, B:115:0x0481, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x04dd: PHI (r17v5 short[]) = (r17v2 short[]), (r17v3 short[]), (r17v2 short[]) binds: [B:123:0x04db, B:115:0x0481, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x04dd: PHI (r24v69 boolean) = (r24v22 boolean), (r24v24 boolean), (r24v70 boolean) binds: [B:123:0x04db, B:115:0x0481, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x05d8 A[PHI: r0 r1 r24
      0x05d8: PHI (r0v38 int) = (r0v14 int), (r0v15 int), (r0v39 int) binds: [B:143:0x05d6, B:139:0x05b5, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r1v54 short) = (r1v32 short), (r1v33 short), (r1v55 short) binds: [B:143:0x05d6, B:139:0x05b5, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r24v60 boolean) = (r24v17 boolean), (r24v18 boolean), (r24v61 boolean) binds: [B:143:0x05d6, B:139:0x05b5, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x017d  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        if (l.C0050.f912 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        if (l.C2477.f9839 > 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (l.C1668.f6641 >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        r4 = (l.C19806.m45029("ᩳ᩻") + r23) * 79;
        r6 = ((r4 ^ r22) * 5511) ^ 2050022601;
        r24 = -626429827;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45942(java.lang.String r30, java.lang.String r31, long r32) {
        /*
            Method dump skipped, instruction units count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20364.m45942(java.lang.String, java.lang.String, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8 A[PHI: r2 r9 r16
      0x00f8: PHI (r2v7 java.lang.String) = (r2v6 java.lang.String), (r2v2 java.lang.String) binds: [B:30:0x00e1, B:24:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r9v5 com.tencent.mm.opensdk.openapi.IWXAPI) = (r9v4 com.tencent.mm.opensdk.openapi.IWXAPI), (r9v2 com.tencent.mm.opensdk.openapi.IWXAPI) binds: [B:30:0x00e1, B:24:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r16v19 int) = (r16v18 int), (r16v20 int) binds: [B:30:0x00e1, B:24:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02ef A[PHI: r4 r16
      0x02ef: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:77:0x02ed, B:58:0x0218, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r16v23 int) = (r16v5 int), (r16v12 int), (r16v24 int) binds: [B:77:0x02ed, B:58:0x0218, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0323 A[PHI: r3 r5 r7 r16
      0x0323: PHI (r3v6 java.lang.String) = 
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v5 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
     binds: [B:81:0x0321, B:54:0x01ed, B:50:0x01cb, B:42:0x016b, B:18:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r5v4 long) = (r5v2 long), (r5v3 long), (r5v2 long), (r5v2 long), (r5v2 long) binds: [B:81:0x0321, B:54:0x01ed, B:50:0x01cb, B:42:0x016b, B:18:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r7v6 java.lang.String) = 
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v5 java.lang.String)
      (r7v1 java.lang.String)
     binds: [B:81:0x0321, B:54:0x01ed, B:50:0x01cb, B:42:0x016b, B:18:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r16v21 int) = (r16v4 int), (r16v13 int), (r16v14 int), (r16v16 int), (r16v22 int) binds: [B:81:0x0321, B:54:0x01ed, B:50:0x01cb, B:42:0x016b, B:18:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x036e A[PHI: r10 r11 r16
      0x036e: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:89:0x036c, B:85:0x0351, B:69:0x0295, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r11v5 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:89:0x036c, B:85:0x0351, B:69:0x0295, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r16v28 int) = (r16v2 int), (r16v3 int), (r16v7 int), (r16v29 int) binds: [B:89:0x036c, B:85:0x0351, B:69:0x0295, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m45943(AbstractActivityC12483 abstractActivityC12483, int i, int i2, String str, InterfaceC4871 interfaceC4871) {
        int iM45029;
        int i3;
        int i4;
        String strM10423 = null;
        short s = 0;
        int i5 = RunnableC0195.f1321;
        int i6 = RunnableC3388.f12514;
        int iM11306 = (ThreadFactoryC3888.m11306("֡᩻") ^ i5) * (-29);
        int i7 = ((iM11306 ^ i6) * (-31627)) ^ 1061042544;
        IWXAPI iwxapiCreateWXAPI = null;
        int i8 = iM11306 ^ (-1620349364);
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = -1624961403;
        String str2 = null;
        String strM3361 = null;
        String strM3006 = null;
        long j = 0;
        while (true) {
            int i12 = i8 ^ (i7 & (((i11 ^ i6) * 23485) >> 31));
            switch (i12) {
                case -2001843554:
                case 1684251806:
                    i12 = i12;
                    int i13 = s + 1;
                    i9 = i13 * i13;
                    s2 = 2;
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۖ") ^ i5) * (-31);
                        i3 = ((iM45029 ^ i6) * (-13245)) ^ (-1488771438);
                        i4 = -1219964842;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۖۙ")) * 87;
                        i3 = ((iM45029 ^ i5) * (-10559)) ^ (-2061258314);
                        i4 = 1810780127;
                    }
                    int i14 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i14;
                    break;
                case -1636058018:
                case 1329692713:
                    if (C3535.f13026 > 0) {
                        iM45029 = (C19806.m45029("ܶ۟") ^ i6) * 17;
                        i12 = i12;
                        i3 = ((iM45029 ^ i5) * (-17275)) ^ 27291175;
                        i4 = -1008644702;
                    } else {
                        i12 = i12;
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i6) * 95;
                        i3 = ((iM45029 ^ i5) * 12293) ^ 529402993;
                        i4 = -1186178213;
                    }
                    int i15 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i15;
                    break;
                case -1622497521:
                case 430789300:
                    throw new RuntimeException();
                case -1543596280:
                case 21084581:
                    i12 = i12;
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i6) * 95;
                        i3 = ((iM45029 ^ i5) * 12293) ^ 529402993;
                        i4 = -1186178213;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ֫") + i6) * 65;
                        i3 = ((iM45029 ^ i5) * 969) ^ (-651512927);
                        i4 = -634166972;
                    }
                    int i16 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i16;
                    break;
                case -1473566006:
                case -826667921:
                    i12 = i12;
                    if (i == (C19806.m45029(strM10423) ^ 2121749807)) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܳ") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-12245)) ^ (-999397508);
                        i4 = -491725925;
                    } else {
                        iM45029 = (C19806.m45029("۠᩻") + i6) * 45;
                        i3 = ((iM45029 ^ i5) * 8067) ^ 533285560;
                        i4 = -537276826;
                    }
                    int i17 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i17;
                    break;
                case -1410777862:
                case -639008645:
                    i12 = i12;
                    if (((s * s2) + 1) - i9 > 0) {
                        iM45029 = C19806.m45029("᩻۫") ^ i6;
                        i3 = ((iM45029 ^ i5) * 25609) ^ (-317798320);
                        i4 = -195473508;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۠") ^ i5;
                        i3 = ((iM45029 ^ i6) * 19519) ^ 1286475716;
                        i4 = -283187574;
                    }
                    int i18 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i18;
                    break;
                case -1350468163:
                case -859785690:
                    i12 = i12;
                    strM10423 = C3535.m10423(f65939, 65, 3, i10);
                    if (C3577.f13150 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i5) * 53;
                        i3 = ((iM45029 ^ i6) * (-11989)) ^ (-443585647);
                        i4 = -2044530443;
                    } else {
                        iM45029 = (C19806.m45029("ܰᩳ") + i6) * (-31);
                        i3 = ((iM45029 ^ i5) * (-1129)) ^ 1677713954;
                        i4 = 327059117;
                    }
                    int i19 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i19;
                    break;
                case -1109337964:
                case 1629526474:
                    C1419.m4973();
                    C0216.m1591();
                    return;
                case -1056751030:
                case 1097191439:
                    i12 = i12;
                    Application applicationM939 = C0050.m939();
                    str2 = f65941;
                    iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(applicationM939, str2, true);
                    if (iwxapiCreateWXAPI.isWXAppInstalled()) {
                        iM45029 = C19806.m45029("ܳ᩻") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-24229)) ^ (-1579457180);
                        i4 = -1258655622;
                    } else {
                        iM45029 = C19806.m45029("֫۫") ^ i6;
                        i3 = ((iM45029 ^ i5) * 21859) ^ 141043026;
                        i4 = 1481711715;
                    }
                    int i110 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i110;
                    break;
                case -1002114384:
                case -698883058:
                    i12 = i12;
                    s = f65939[61];
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֡") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-23679)) ^ (-2023521495);
                        i4 = 729499272;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۡ") ^ i6) * 75;
                        i3 = ((iM45029 ^ i5) * 11713) ^ (-1374910631);
                        i4 = 2124203189;
                    }
                    int i111 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i111;
                    break;
                case -967954369:
                case 881957152:
                    C0526.m2437();
                    if (C0278.m1789() <= 0) {
                        iM45029 = (C19806.m45029("ܶ۟") ^ i6) * 17;
                        i12 = i12;
                        i3 = ((iM45029 ^ i5) * (-17275)) ^ 27291175;
                        i4 = -1008644702;
                    } else {
                        i12 = i12;
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۖ") ^ i5) * (-31);
                        i3 = ((iM45029 ^ i6) * (-13245)) ^ (-1488771438);
                        i4 = -1219964842;
                    }
                    int i112 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i112;
                    break;
                case -967743620:
                case 485240394:
                    CallableC1627.m5503(C3743.m10964(f65939, 68, 13, i10));
                    return;
                case -933373811:
                case 1288178675:
                    i10 = 41021;
                    iM45029 = ThreadFactoryC3888.m11306("ۙ֫") ^ i6;
                    i3 = ((iM45029 ^ i5) * (-1783)) ^ (-807619679);
                    i4 = -154360832;
                    int i113 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i113;
                    break;
                case -503844151:
                case 1828724207:
                    C1977.m6356();
                    C1066.m4023();
                    iM45029 = (C19806.m45029("ܶ۟") ^ i6) * 17;
                    i12 = i12;
                    i3 = ((iM45029 ^ i5) * (-17275)) ^ 27291175;
                    i4 = -1008644702;
                    int i114 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i114;
                    break;
                case -473443792:
                case -13701591:
                    i12 = i12;
                    strM3361 = C0797.m3361(f65939, 62, 3, i10);
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i5) * 53;
                        i3 = ((iM45029 ^ i6) * (-11989)) ^ (-443585647);
                        i4 = -2044530443;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۫") ^ i6;
                        i3 = ((iM45029 ^ i5) * 24265) ^ 670727182;
                        i4 = -287373765;
                    }
                    int i115 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i115;
                    break;
                case -308837135:
                case -110191325:
                    i12 = i12;
                    j = f65937;
                    f65940 = null;
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i5) * 53;
                        i3 = ((iM45029 ^ i6) * (-11989)) ^ (-443585647);
                        i4 = -2044530443;
                    } else {
                        iM45029 = (C19806.m45029("ۜ᩹") + i5) * 83;
                        i3 = ((iM45029 ^ i6) * (-9255)) ^ 1642749326;
                        i4 = -510857863;
                    }
                    int i116 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i116;
                    break;
                case -273618793:
                case 217575763:
                    i12 = i12;
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۖ") ^ i5) * (-31);
                        i3 = ((iM45029 ^ i6) * (-13245)) ^ (-1488771438);
                        i4 = -1219964842;
                    } else {
                        iM45029 = C19806.m45029("֡ۗ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 8811) ^ (-1116698326);
                        i4 = -675412521;
                    }
                    int i117 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i117;
                    break;
                case -175955230:
                case 1758235725:
                    i12 = i12;
                    strM3006 = C0671.m3006();
                    f65937++;
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i6) * 95;
                        i3 = ((iM45029 ^ i5) * 12293) ^ 529402993;
                        i4 = -1186178213;
                    } else {
                        iM45029 = (C19806.m45029("ۖܰ") ^ i5) * 55;
                        i3 = ((iM45029 ^ i6) * (-14903)) ^ 555419202;
                        i4 = -877967476;
                    }
                    int i118 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i118;
                    break;
                case -127266079:
                case 459053486:
                    if (C10634.f36300 < 0) {
                        iM45029 = (C19806.m45029("ܶ۟") ^ i6) * 17;
                        i12 = i12;
                        i3 = ((iM45029 ^ i5) * (-17275)) ^ 27291175;
                        i4 = -1008644702;
                    } else {
                        i12 = i12;
                        iM45029 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i5) * 53;
                        i3 = ((iM45029 ^ i6) * (-11989)) ^ (-443585647);
                        i4 = -2044530443;
                    }
                    int i119 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i119;
                    break;
                case -52762554:
                case 1953195730:
                    i12 = i12;
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۖ") ^ i5) * (-31);
                        i3 = ((iM45029 ^ i6) * (-13245)) ^ (-1488771438);
                        i4 = -1219964842;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۤ") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-9833)) ^ (-86872710);
                        i4 = -2082057435;
                    }
                    int i1110 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i1110;
                    break;
                case 388980609:
                case 729742537:
                    i12 = i12;
                    if (iwxapiCreateWXAPI.getWXAppSupportAPI() < 570425345) {
                        iM45029 = C19806.m45029("֫۫") ^ i6;
                        i3 = ((iM45029 ^ i5) * 21859) ^ 141043026;
                        i4 = 1481711715;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֨") ^ i6;
                        i3 = ((iM45029 ^ i5) * 31301) ^ (-1146327858);
                        i4 = 763725626;
                    }
                    int i1111 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i1111;
                    break;
                case 501643383:
                case 949551514:
                    i12 = i12;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i5) * 53;
                        i3 = ((iM45029 ^ i6) * (-11989)) ^ (-443585647);
                        i4 = -2044530443;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۟") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-4639)) ^ (-641406131);
                        i4 = 2860887;
                    }
                    int i1112 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i1112;
                    break;
                case 786279930:
                case 790721431:
                    interfaceC4871.mo3788();
                    RunnableC0195.m1442(new C7664(abstractActivityC12483, strM3006, j, i2, str));
                    return;
                case 1215751694:
                case 1893673731:
                    i12 = i12;
                    if (i == (ThreadFactoryC3888.m11306(strM3361) ^ 2102840949)) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩶") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-20037)) ^ 655923504;
                        i4 = -1928810110;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬᩵") + i5) * 25;
                        i3 = ((iM45029 ^ i6) * 10965) ^ 400717860;
                        i4 = 859423194;
                    }
                    int i1113 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i1113;
                    break;
                case 1222255551:
                case 1784317427:
                    i10 = 34503;
                    iM45029 = ThreadFactoryC3888.m11306("ۙ֫") ^ i6;
                    i3 = ((iM45029 ^ i5) * (-1783)) ^ (-807619679);
                    i4 = -154360832;
                    int i1114 = i12;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i11 = i1114;
                    break;
                default:
                    interfaceC4871.mo3788();
                    iwxapiCreateWXAPI.registerApp(str2);
                    C2332.m7081(new C16131(abstractActivityC12483, strM3006, j, i2, str, iwxapiCreateWXAPI));
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x014f A[PHI: r6
      0x014f: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:38:0x014d, B:33:0x013e, B:25:0x00f9, B:13:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01b2 A[PHI: r1 r12 r19
      0x01b2: PHI (r1v8 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v9 java.lang.String) binds: [B:49:0x01b0, B:41:0x016a, B:17:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v5 short[]) binds: [B:49:0x01b0, B:41:0x016a, B:17:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r19v6 l.ۡ᩺ۙ) = (r19v4 l.ۡ᩺ۙ), (r19v3 l.ۡ᩺ۙ), (r19v3 l.ۡ᩺ۙ) binds: [B:49:0x01b0, B:41:0x016a, B:17:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025c A[PHI: r8 r9 r10
      0x025c: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:65:0x025a, B:63:0x0252, B:33:0x013e, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v2 short), (r9v4 short) binds: [B:65:0x025a, B:63:0x0252, B:33:0x013e, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:65:0x025a, B:63:0x0252, B:33:0x013e, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02c5 A[PHI: r5 r13 r14
      0x02c5: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v2 short), (r5v5 short) binds: [B:69:0x028d, B:41:0x016a, B:38:0x014d, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:69:0x028d, B:41:0x016a, B:38:0x014d, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:69:0x028d, B:41:0x016a, B:38:0x014d, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i;
        int iM45029;
        int i2;
        int i3;
        String strM11312;
        int iM11306;
        int i4;
        int i5;
        short[] sArr;
        int i6 = C2477.f9839;
        int i7 = C2249.f8050;
        int iM450210 = (C19806.m45029("᩷ۜ") + i6) * (-37);
        int i8 = ((iM450210 ^ i7) * (-10221)) ^ (-562987736);
        C9186 c9186 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM450210 ^ (-523018079);
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -2014539773;
        String str = null;
        String strM39293 = null;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i7) * 15083) >> 31));
            switch (i17) {
                case -2023743063:
                case -204442211:
                    i = 6522;
                    iM11306 = (C19806.m45029("۬۬") + i6) * 109;
                    i3 = 281381451;
                    i5 = ((iM11306 ^ i7) * (-18855)) ^ 1633083244;
                    i14 = i;
                    iM45029 = iM11306;
                    i2 = i5;
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -1903950737:
                case 637531294:
                    i15 = 1;
                    i16 = 11;
                    if (C0817.f3443) {
                        iM45029 = (i6 - C19806.m45029("ۤ᩻")) * 45;
                        i2 = ((iM45029 ^ i7) * 12247) ^ (-1146064671);
                        i3 = 1594774935;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩹") ^ i6;
                        i2 = ((iM45029 ^ i7) * 25377) ^ (-872312987);
                        i3 = 468862098;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -1902774898:
                case 593333505:
                    i13 = s + s2;
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۡ") ^ i7) * (-37);
                        i2 = ((iM45029 ^ i6) * (-10969)) ^ (-1379439723);
                        i3 = 1300064225;
                    } else {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i6;
                        i2 = ((iM45029 ^ i7) * (-18685)) ^ (-1724737971);
                        i3 = 951271352;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -1634005284:
                case -1569935423:
                    C0629.m2907();
                    iM45029 = C19806.m45029("᩷ܶ") ^ i6;
                    i2 = ((iM45029 ^ i7) * (-18685)) ^ (-1724737971);
                    i3 = 951271352;
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -1617028669:
                case 1556886140:
                    strM11312 = ThreadFactoryC3888.m11312(f65939, 12, 18, i14);
                    int iM450211 = C19806.m45029("᩻ۚ") ^ i7;
                    i2 = ((iM450211 ^ i6) * 5331) ^ 272019698;
                    i3 = 1689318786;
                    str = strM11312;
                    iM45029 = iM450211;
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -1529831598:
                case 460791994:
                    f65941 = str;
                    return;
                case -842058184:
                case 1436006401:
                    strM11312 = C2704.m8240(f65939, 30, 18, i14);
                    int iM450212 = C19806.m45029("᩻ۚ") ^ i7;
                    i2 = ((iM450212 ^ i6) * 5331) ^ 272019698;
                    i3 = 1689318786;
                    str = strM11312;
                    iM45029 = iM450212;
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -733959827:
                case 1790584571:
                    int i18 = 1054729 + i10;
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩹") ^ i6;
                        i4 = ((iM11306 ^ i7) * 14573) ^ (-42094743);
                        i3 = -1975857092;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܶ") ^ i7;
                        i4 = ((iM11306 ^ i6) * (-9357)) ^ 1283440267;
                        i3 = -1384660758;
                    }
                    i5 = i4;
                    i11 = i18;
                    iM45029 = iM11306;
                    i2 = i5;
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -704919395:
                case 1090877088:
                    c9186 = new C9186();
                    if (C3722.f13525 <= 0) {
                        sArr = sArr2;
                        iM45029 = C19806.m45029("۫֫") ^ i7;
                        sArr2 = sArr;
                        i2 = ((iM45029 ^ i6) * (-2231)) ^ 515125733;
                        strM39293 = strM39293;
                        i3 = -945069919;
                    } else {
                        iM45029 = C19806.m45029("ܰ᩸") ^ i7;
                        i2 = ((iM45029 ^ i6) * (-79)) ^ (-285666234);
                        i3 = -644991216;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -613122714:
                case 1188260543:
                    i = 21629;
                    iM11306 = (C19806.m45029("۬۬") + i6) * 109;
                    i3 = 281381451;
                    i5 = ((iM11306 ^ i7) * (-18855)) ^ 1633083244;
                    i14 = i;
                    iM45029 = iM11306;
                    i2 = i5;
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -411412900:
                case 2131272961:
                    if (AbstractC0464.m2315(strM39293, C2249.m6918(sArr3, i15, i16, i14))) {
                        iM45029 = C19806.m45029("ۜ۟") ^ i6;
                        i2 = ((iM45029 ^ i7) * 19077) ^ (-284958925);
                        i3 = 631661932;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۜ") ^ i7) * (-97);
                        i2 = ((iM45029 ^ i6) * (-4101)) ^ 1760199323;
                        i3 = -2051342079;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case -99930963:
                case 1441540066:
                    C1066.m4023();
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩹") ^ i6;
                        i2 = ((iM45029 ^ i7) * 25377) ^ (-872312987);
                        i3 = 468862098;
                    } else {
                        sArr = sArr2;
                        iM45029 = C19806.m45029("۫֫") ^ i7;
                        sArr2 = sArr;
                        i2 = ((iM45029 ^ i6) * (-2231)) ^ 515125733;
                        strM39293 = strM39293;
                        i3 = -945069919;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case 130608622:
                case 2044591074:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("᩸ۜ") ^ i7;
                        i2 = ((iM45029 ^ i6) * 16481) ^ 384050136;
                        i3 = 1645004234;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩹") ^ i6;
                        i2 = ((iM45029 ^ i7) * 25377) ^ (-872312987);
                        i3 = 468862098;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case 145498846:
                case 1216414409:
                    C7105.m18985();
                    throw new RuntimeException();
                case 169696408:
                case 1807977389:
                    if (C19806.m45024()) {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i6;
                        i2 = ((iM45029 ^ i7) * (-18685)) ^ (-1724737971);
                        i3 = 951271352;
                    } else {
                        iM45029 = C19806.m45029("᩸ۜ") ^ i7;
                        i2 = ((iM45029 ^ i6) * 16481) ^ 384050136;
                        i3 = 1645004234;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case 295698274:
                case 681643520:
                    sArr = f65939;
                    if (C10634.m26820()) {
                        c = 0;
                        iM45029 = C19806.m45029("۫֫") ^ i7;
                        sArr2 = sArr;
                        i2 = ((iM45029 ^ i6) * (-2231)) ^ 515125733;
                        strM39293 = strM39293;
                        i3 = -945069919;
                    } else {
                        iM45029 = C19806.m45029("۫֨") ^ i6;
                        sArr2 = sArr;
                        i2 = ((iM45029 ^ i7) * 2755) ^ 2146110086;
                        c = 0;
                        i3 = 618078702;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case 435003191:
                case 1634239624:
                    f65938 = c9186;
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("᩸ۜ") ^ i7;
                        i2 = ((iM45029 ^ i6) * 16481) ^ 384050136;
                        i3 = 1645004234;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ۠") + i6) * (-27);
                        i2 = ((iM45029 ^ i7) * (-27229)) ^ (-1896258528);
                        i3 = 2063819613;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case 505778572:
                case 2095165990:
                    if ((i13 * i13) - i12 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۛ") ^ i6) * 71;
                        i2 = ((iM45029 ^ i7) * (-17317)) ^ 97657186;
                        i3 = -1699387612;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩸") ^ i7) * 35;
                        i2 = ((iM45029 ^ i6) * (-14687)) ^ 1522744836;
                        i3 = -1764483531;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case 628600096:
                case 1371051237:
                    strM39293 = C16737.m39293();
                    sArr3 = f65939;
                    if (C2124.f7782 <= 0) {
                        sArr = sArr2;
                        iM45029 = C19806.m45029("۫֫") ^ i7;
                        sArr2 = sArr;
                        i2 = ((iM45029 ^ i6) * (-2231)) ^ 515125733;
                        strM39293 = strM39293;
                        i3 = -945069919;
                    } else {
                        iM45029 = C19806.m45029("ۘ֨") ^ i7;
                        i2 = ((iM45029 ^ i6) * 2831) ^ 1267212622;
                        i3 = -442729439;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case 677479106:
                case 1699764423:
                    i10 = s * s;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("᩸ۜ") ^ i7;
                        i2 = ((iM45029 ^ i6) * 16481) ^ 384050136;
                        i3 = 1645004234;
                    } else {
                        iM45029 = C19806.m45029("ۚۤ") ^ i6;
                        i2 = ((iM45029 ^ i7) * (-397)) ^ 822159015;
                        i3 = -1536068407;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                case 1739199357:
                case 1830046373:
                    i12 = i11 + i11;
                    s2 = 1027;
                    if (C3722.m10894() <= 0) {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i6;
                        i2 = ((iM45029 ^ i7) * (-18685)) ^ (-1724737971);
                        i3 = 951271352;
                    } else {
                        iM45029 = C19806.m45029("ܳۤ") ^ i6;
                        i2 = ((iM45029 ^ i7) * 9081) ^ 143975839;
                        i3 = -22801039;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
                default:
                    s = sArr2[c];
                    if (RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i7;
                        i2 = ((iM45029 ^ i6) * (-22713)) ^ 1773022274;
                        i3 = -402506451;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩹") ^ i6;
                        i2 = ((iM45029 ^ i7) * 25377) ^ (-872312987);
                        i3 = 468862098;
                    }
                    i9 = iM45029 ^ i3;
                    i8 = i2;
                    break;
            }
        }
    }
}
