package l;

import com.alipay.sdk.m.t0.b;
import com.google.android.material.snackbar.SnackbarManager;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4820 {

    /* JADX INFO: renamed from: ۗ᩹ܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f16960 = {614, 31131, -16722, -18464, 26953, -18811, -29593, -30609, -17321, 30373, -5370, -5376, -5354, -5354, -5360, -5370, -5370, 29620, -18184, 27081, 30512, -19754, -16927, -26788, -20262, -30376, 29005, 30765, 25926, 25294, -17026, 31022, -26840, -28307, -17174, 27334, 29769, -18841, -20395, -26811, 25358, -25626, -18639, 29958, -29106, 27611, -30446, -18072, -25588, -30326, -26532, 31310, 31489, -28016, -25106, -31376, -17211, 26498, -18786, -30247, -25106, -20470, -26214, -29839, 27053, -27730, -29333, -19108, -27043, -18541, -31221, -31078, 26578, -25247, -29530, 27908, 30898, -17593, -23432, -25389, -30004, 27951, -24737, -5342, -5331, -5340, -5340, 29403, -19556, 29534, 25270, -17903, 30287, -5349, -5318, -5343, -5259, -5321, -5316, -5317, -5327, -27734, -31081, -30433, 26337, -19156, -16741, -25418, 26804, 26022, -30324, 31252, -28000, -5354, -5318, -5327, -5328, -5265, -5259, 31912, -17228, 31972, 26175, 26738, 25989};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13401(C1313 c1313, int i) {
        return m13402(c1313, C1875.m6085(i));
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0ca6 A[PHI: r1 r3 r5 r25 r27 r28 r29 r30 r31 r32 r39 r41 r42
      0x0ca6: PHI (r1v34 int) = (r1v31 int), (r1v32 int), (r1v33 int), (r1v35 int) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r3v83 short[]) = (r3v80 short[]), (r3v81 short[]), (r3v82 short[]), (r3v84 short[]) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r5v32 java.lang.String) = (r5v29 java.lang.String), (r5v30 java.lang.String), (r5v31 java.lang.String), (r5v33 java.lang.String) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r25v31 int) = (r25v28 int), (r25v29 int), (r25v30 int), (r25v32 int) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r27v34 int) = (r27v31 int), (r27v32 int), (r27v33 int), (r27v35 int) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r28v31 int) = (r28v28 int), (r28v29 int), (r28v30 int), (r28v32 int) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r29v32 short[]) = (r29v29 short[]), (r29v30 short[]), (r29v31 short[]), (r29v33 short[]) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r30v34 java.lang.String) = (r30v31 java.lang.String), (r30v32 java.lang.String), (r30v33 java.lang.String), (r30v35 java.lang.String) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r31v34 java.lang.String) = (r31v31 java.lang.String), (r31v32 java.lang.String), (r31v33 java.lang.String), (r31v35 java.lang.String) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r32v31 int) = (r32v28 int), (r32v29 int), (r32v30 int), (r32v32 int) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r39v33 short[]) = (r39v30 short[]), (r39v31 short[]), (r39v32 short[]), (r39v34 short[]) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r41v26 int) = (r41v23 int), (r41v24 int), (r41v25 int), (r41v27 int) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]
      0x0ca6: PHI (r42v28 short[]) = (r42v25 short[]), (r42v26 short[]), (r42v27 short[]), (r42v29 short[]) binds: [B:218:0x0c8f, B:213:0x0c46, B:210:0x0c10, B:207:0x0bdc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:314:0x1333 A[PHI: r1 r5 r18 r21 r23 r25 r27 r28 r29 r30 r31 r32 r33 r39 r41 r42
      0x1333: PHI (r1v12 int) = (r1v3 int), (r1v4 int), (r1v13 int) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r5v12 java.lang.String) = (r5v4 java.lang.String), (r5v5 java.lang.String), (r5v13 java.lang.String) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v2 java.lang.String), (r18v4 java.lang.String) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r21v4 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r23v10 short) = (r23v2 short), (r23v3 short), (r23v2 short) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r25v11 int) = (r25v3 int), (r25v4 int), (r25v12 int) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r27v12 int) = (r27v3 int), (r27v4 int), (r27v13 int) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r28v11 int) = (r28v3 int), (r28v4 int), (r28v12 int) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r29v11 short[]) = (r29v3 short[]), (r29v4 short[]), (r29v12 short[]) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r30v12 java.lang.String) = (r30v3 java.lang.String), (r30v4 java.lang.String), (r30v13 java.lang.String) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r31v12 java.lang.String) = (r31v3 java.lang.String), (r31v4 java.lang.String), (r31v13 java.lang.String) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r32v11 int) = (r32v3 int), (r32v4 int), (r32v12 int) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r33v12 short[]) = (r33v3 short[]), (r33v4 short[]), (r33v13 short[]) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r39v11 short[]) = (r39v2 short[]), (r39v3 short[]), (r39v12 short[]) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r41v8 int) = (r41v0 int), (r41v1 int), (r41v9 int) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]
      0x1333: PHI (r42v8 short[]) = (r42v0 short[]), (r42v1 short[]), (r42v9 short[]) binds: [B:10:0x00be, B:313:0x1331, B:282:0x10f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0197  */
    /* JADX WARN: Code duplicated, block: B:52:0x0228 A[PHI: r3 r6 r9 r13
      0x0228: PHI (r3v172 short[]) = (r3v161 short[]), (r3v2 short[]) binds: [B:51:0x0226, B:34:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:51:0x0226, B:34:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:51:0x0226, B:34:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r13v4 java.lang.Object[]) = (r13v3 java.lang.Object[]), (r13v2 java.lang.Object[]) binds: [B:51:0x0226, B:34:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x04d6. Please report as an issue. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13402(C1313 c1313, String str) {
        int iM11306;
        int i;
        int i2;
        short[] sArr;
        int i3;
        int iM11307;
        int i4;
        int i5;
        int i6;
        int iM11308;
        int i7;
        int i8;
        int iM11309;
        int i9;
        short[] sArr2;
        int iM45029;
        int i10;
        int i11;
        int iM450210;
        int i12;
        int i13;
        int i14;
        int i15;
        short[] sArr3;
        int i16;
        int i17;
        int i18;
        short[] sArr4;
        String str2;
        String str3;
        short[] sArr5;
        int i19;
        String str4;
        int iM450211;
        int i20;
        int i21;
        int i22;
        short[] sArr6;
        short[] sArr7;
        int i23;
        int i24;
        String str5;
        String str6;
        String str7;
        short[] sArr8;
        int i25;
        int iM113010;
        int i26;
        short[] sArr9;
        short[] sArr10;
        String str8;
        String str9;
        String strM9716;
        int iM113011;
        int i27;
        int i28;
        int i29;
        String str10;
        String str11;
        int iM450212;
        int i30;
        int i31;
        int i32;
        short[] sArr11;
        String str12;
        int iM113012;
        int i33;
        int i34;
        int iM113013;
        int i35;
        int i36;
        short[] sArr12;
        int i37 = C2788.f10625;
        int i38 = C7105.f23796;
        int iM450213 = (C19806.m45029("᩸֨") ^ i38) * 27;
        int i39 = ((iM450213 ^ i37) * (-31301)) ^ (-1644981648);
        String strM2906 = null;
        String strM5476 = null;
        String str13 = null;
        String strM6288 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        int i40 = iM450213 ^ 1059176128;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        short s = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int iM113014 = 0;
        int i53 = -1774194016;
        String strM6105 = null;
        String strM5477 = null;
        String strM8172 = null;
        short[] sArr17 = null;
        int i54 = 0;
        int i55 = 0;
        String strM4832 = null;
        String strM3017 = null;
        Object[] objArr = null;
        String strM3018 = null;
        Object[] objArr2 = null;
        String strM9717 = null;
        int i56 = 0;
        while (true) {
            i53 = i40 ^ (i39 & (((i53 ^ i37) * (-17843)) >> 31));
            switch (i53) {
                case -2139112091:
                case -1468090879:
                    return C1875.m6085(ThreadFactoryC3888.m11306(C2124.m6685(f16960, 50, 3, i56)) ^ 2127821919);
                case -2105599617:
                case -1599581972:
                    short[] sArr18 = sArr16;
                    int i57 = i41;
                    sArr = sArr15;
                    strM6105 = strM6105;
                    int i58 = i52;
                    i48 = i48;
                    i49 = i49;
                    i3 = i50;
                    short[] sArr19 = sArr14;
                    String str14 = str13;
                    short[] sArr20 = sArr17;
                    int i59 = i51;
                    String str15 = strM2906;
                    short s2 = s;
                    if ((i47 + 254817369) - (s2 * 31926) >= 0) {
                        iM11307 = (i37 - C19806.m45029("᩸۬")) * (-121);
                        i4 = ((iM11307 ^ i38) * 17151) ^ (-544929637);
                        i5 = 2046404659;
                    } else {
                        iM11307 = (i37 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-55);
                        i4 = ((iM11307 ^ i38) * (-4323)) ^ 1353783562;
                        i5 = -1220407075;
                    }
                    int i60 = iM11307 ^ i5;
                    s = s2;
                    str13 = str14;
                    strM2906 = str15;
                    sArr14 = sArr19;
                    i41 = i57;
                    i52 = i58;
                    i51 = i59;
                    sArr17 = sArr20;
                    sArr16 = sArr18;
                    i40 = i60;
                    i39 = i4;
                    i50 = i3;
                    sArr15 = sArr;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -2072142417:
                case 1778084906:
                    sArr9 = sArr16;
                    i15 = i41;
                    sArr10 = sArr15;
                    str10 = str13;
                    str11 = strM2906;
                    strM3018 = C0671.m3017(iM113014);
                    iM450212 = C19806.m45029("ۜ᩹") ^ i38;
                    i30 = ((iM450212 ^ i37) * 11425) ^ (-220352320);
                    i31 = -902994398;
                    i29 = iM450212 ^ i31;
                    strM2906 = str11;
                    str13 = str10;
                    i39 = i30;
                    sArr16 = sArr9;
                    sArr15 = sArr10;
                    i40 = i29;
                    i41 = i15;
                    break;
                case -2057037530:
                case -884757517:
                    return C0671.m3017(C19806.m45029(C1419.m4969(f16960, 68, 3, i56)) ^ 2129854846);
                case -2036873493:
                case 279741441:
                    return C1875.m6085(ThreadFactoryC3888.m11306(strM4832) ^ 2099502421);
                case -2034714509:
                case -254452105:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (c1313.f5598) {
                        iM11308 = C19806.m45029("ۗܰ") ^ i38;
                        i7 = ((iM11308 ^ i37) * (-24541)) ^ 1153019625;
                        i8 = -115670133;
                    } else {
                        iM11308 = C19806.m45029("᩵۠") ^ i37;
                        i7 = ((iM11308 ^ i38) * 30801) ^ (-1503282681);
                        i8 = 1939788695;
                    }
                    int i61 = iM11308 ^ i8;
                    i39 = i7;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i61;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -2023621040:
                case 288993451:
                    return C1875.m6085(ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(f16960, 101, 3, i56)) ^ 2126635703);
                case -2015333957:
                case 1404965965:
                    return C0671.m3017(ThreadFactoryC3888.m11306(C1461.m5070(f16960, 71, 3, i56)) ^ 2126492276);
                case -1899293991:
                case 1767492741:
                    short[] sArr21 = sArr16;
                    sArr = sArr15;
                    strM6105 = strM6105;
                    int i62 = i52;
                    i48 = i48;
                    i49 = i49;
                    i3 = i50;
                    short[] sArr22 = sArr14;
                    String str16 = str13;
                    short[] sArr23 = sArr17;
                    int i63 = i51;
                    String str17 = strM2906;
                    if (i62 != 1) {
                        int iM113015 = (ThreadFactoryC3888.m11306("ᩴܽ") + i38) * 11;
                        i39 = ((iM113015 ^ i37) * 22373) ^ (-373366905);
                        str13 = str16;
                        strM2906 = str17;
                        sArr14 = sArr22;
                        i41 = 1;
                        i52 = i62;
                        i51 = i63;
                        sArr17 = sArr23;
                        sArr16 = sArr21;
                        i40 = iM113015 ^ (-1841968663);
                        i50 = i3;
                        sArr15 = sArr;
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("ܽۤ") ^ i38;
                        i39 = ((iM113016 ^ i37) * (-6591)) ^ 605325291;
                        str13 = str16;
                        strM2906 = str17;
                        sArr14 = sArr22;
                        sArr15 = sArr;
                        i52 = i62;
                        i51 = i63;
                        sArr17 = sArr23;
                        sArr16 = sArr21;
                        i40 = iM113016 ^ (-1980554009);
                        i50 = i3;
                        i41 = 1;
                    }
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1861109785:
                case -1462601539:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    strM6288 = C1937.m6288(f16960, 7, 3, i56);
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩷") + i37) * (-115);
                        i = ((iM11306 ^ i38) * 18055) ^ (-597037077);
                        i2 = -385362286;
                    } else {
                        iM11306 = C19806.m45029("۟᩷") ^ i38;
                        i = ((iM11306 ^ i37) * (-31093)) ^ (-718182139);
                        i2 = 1424671114;
                    }
                    int i64 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i64;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1843969041:
                case -537273790:
                    return C0671.m3017(C19806.m45029(C3722.m10901(f16960, 80, 3, i56)) ^ 2121078984);
                case -1835127462:
                case 1134007951:
                    throw new RuntimeException(C2249.m6918(f16960, 10, 7, i56));
                case -1776401610:
                case 2086139912:
                    return C1875.m6085(C19806.m45029(C3722.m10901(f16960, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i56)) ^ 2126549743);
                case -1763085980:
                case 308197381:
                    sArr16 = sArr16;
                    i15 = i41;
                    short[] sArr24 = sArr15;
                    sArr14 = sArr14;
                    int i65 = i51;
                    str13 = str13;
                    strM2906 = strM2906;
                    int i66 = i48;
                    sArr13 = sArr13;
                    strM6105 = C1875.m6105(sArr13, i66, 2, i56);
                    short[] sArr25 = f16960;
                    i50 = 87;
                    i49 = 3;
                    if (C10634.f36300 >= 0) {
                        int iM113017 = ThreadFactoryC3888.m11306("ܳۘ") ^ i38;
                        i39 = ((iM113017 ^ i37) * (-957)) ^ 137445199;
                        i40 = iM113017 ^ (-1001983125);
                    } else {
                        int iM113018 = (ThreadFactoryC3888.m11306("ۧۜ") + i38) * 11;
                        i40 = iM113018 ^ (-1555627884);
                        i39 = ((iM113018 ^ i37) * 9349) ^ (-602596989);
                    }
                    i51 = i65;
                    sArr15 = sArr24;
                    sArr17 = sArr25;
                    i48 = i66;
                    i41 = i15;
                    break;
                case -1748983509:
                case 1618474783:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    i42 = 0;
                    if (i52 != 8) {
                        iM45029 = (C19806.m45029("ۚ᩺") + i38) * (-9);
                        i10 = ((iM45029 ^ i37) * (-21665)) ^ 260464495;
                        i11 = -704274102;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۛ") ^ i37;
                        i10 = ((iM45029 ^ i38) * (-23641)) ^ 1797985178;
                        i11 = -1093539166;
                    }
                    int i67 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i67;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1748309110:
                case 1504130167:
                    return C1875.m6085(i55);
                case -1734192036:
                case -1348142393:
                    C2788.m8472();
                    iM113013 = (C19806.m45029("ۧ۬") ^ i38) * (-73);
                    i35 = ((iM113013 ^ i37) * (-12023)) ^ 1467290528;
                    i36 = -1694716549;
                    i40 = iM113013 ^ i36;
                    i39 = i35;
                    break;
                case -1704742243:
                case 557238649:
                    i56 = 60245;
                    iM11306 = (ThreadFactoryC3888.m11306("᩻ۚ") ^ i38) * 31;
                    i = ((iM11306 ^ i37) * 32007) ^ 1210264837;
                    i2 = -543241262;
                    int i68 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i68;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1680782076:
                case 1374341573:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != -1) {
                        iM11306 = C19806.m45029("ܳܺ") ^ i37;
                        i = ((iM11306 ^ i38) * 27543) ^ (-1986185106);
                        i2 = -1128808396;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i37;
                        i = ((iM11306 ^ i38) * 2039) ^ 257756068;
                        i2 = 2101109472;
                    }
                    int i69 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i69;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1659415512:
                case -983032897:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        sArr16 = sArr16;
                        i41 = i41;
                        sArr15 = sArr15;
                        i6 = i48;
                        i49 = i49;
                        i50 = i50;
                        strM6105 = strM6105;
                        i52 = i52;
                        sArr17 = sArr17;
                        sArr14 = sArr14;
                        i51 = i51;
                        str13 = str13;
                        int iM450214 = (C19806.m45029("ۚ᩵") ^ i37) * (-63);
                        int i70 = ((iM450214 ^ i38) * 24429) ^ 481382622;
                        strM6105 = strM6105;
                        i51 = i51;
                        sArr17 = sArr17;
                        str13 = str13;
                        sArr14 = sArr14;
                        i52 = i52;
                        i50 = i50;
                        sArr16 = sArr16;
                        i40 = iM450214 ^ 992514851;
                        i49 = i49;
                        i41 = i41;
                        i48 = i6;
                        i39 = i70;
                        sArr15 = sArr15;
                    } else {
                        iM113013 = (ThreadFactoryC3888.m11306("ᩳۜ") + i37) * (-31);
                        i35 = ((iM113013 ^ i38) * 30511) ^ 1337915477;
                        i36 = -764926249;
                        i40 = iM113013 ^ i36;
                        i39 = i35;
                    }
                    break;
                case -1648647167:
                case 1799109556:
                    System.exit(i42);
                    return str;
                case -1634829347:
                case 2114137811:
                    return C0671.m3017(ThreadFactoryC3888.m11306(strM6288) ^ 2121114127);
                case -1598554311:
                case 1738032830:
                    return C0278.m1786(C19806.m45029(RunnableC1564.m5344(sArr16, i54, i44, i56)) ^ 2100380074, objArr);
                case -1594196111:
                case 145948239:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 1201) {
                        iM45029 = (i37 - C19806.m45029("ۗ᩵")) * 49;
                        i10 = ((iM45029 ^ i38) * 16743) ^ 1673843779;
                        i11 = 1568498744;
                    } else {
                        iM45029 = (C19806.m45029("ܳۙ") + i37) * (-47);
                        i10 = ((iM45029 ^ i38) * (-4983)) ^ 220639290;
                        i11 = -2077380893;
                    }
                    int i610 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i610;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1552452530:
                case -624733186:
                    return C0671.m3017(C19806.m45029(C1668.m5577(f16960, 65, 3, i56)) ^ 2126573289);
                case -1502412214:
                case 1891776735:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (!C1461.m5073()) {
                        iM11306 = (C19806.m45029("᩶᩺") ^ i37) * 55;
                        i = ((iM11306 ^ i38) * 27653) ^ (-1560238896);
                        i2 = 1549809528;
                        int i611 = iM11306 ^ i2;
                        str13 = str13;
                        strM2906 = strM2906;
                        sArr14 = sArr14;
                        sArr15 = sArr15;
                        i52 = i52;
                        i51 = i51;
                        sArr17 = sArr17;
                        sArr16 = sArr16;
                        i40 = i611;
                        i39 = i;
                        i50 = i50;
                        i41 = i41;
                        i49 = i49;
                        i48 = i48;
                        strM6105 = strM6105;
                    } else {
                        iM11308 = C19806.m45029("ۗܰ") ^ i38;
                        i7 = ((iM11308 ^ i37) * (-24541)) ^ 1153019625;
                        i8 = -115670133;
                        int i612 = iM11308 ^ i8;
                        i39 = i7;
                        str13 = str13;
                        strM2906 = strM2906;
                        sArr14 = sArr14;
                        sArr15 = sArr15;
                        i52 = i52;
                        i51 = i51;
                        sArr17 = sArr17;
                        sArr16 = sArr16;
                        i40 = i612;
                        i50 = i50;
                        i41 = i41;
                        i49 = i49;
                        i48 = i48;
                        strM6105 = strM6105;
                    }
                    break;
                case -1435629402:
                case 442461891:
                    sArr14 = sArr14;
                    iM11309 = C19806.m45029(RunnableC1606.m5481(f16960, 23, 3, i56));
                    i9 = 2127499632;
                    i55 = iM11309 ^ i9;
                    iM11306 = (ThreadFactoryC3888.m11306("ۚܿ") + i37) * (-65);
                    i = ((iM11306 ^ i38) * 5763) ^ 920346435;
                    i2 = 970223951;
                    int i613 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i613;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1386811392:
                case 1752118548:
                    return C1875.m6085(C19806.m45029(C0216.m1588(f16960, 44, 3, i56)) ^ 2123986664);
                case -1343215392:
                case -648686142:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 1400) {
                        iM45029 = C19806.m45029("۟ۧ") ^ i37;
                        i10 = ((iM45029 ^ i38) * 24159) ^ (-570949900);
                        i11 = -1675305840;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۧ") + i38) * 19;
                        i10 = ((iM45029 ^ i37) * 13471) ^ (-89825645);
                        i11 = 598242915;
                    }
                    int i614 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i614;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1298814527:
                case 2075019542:
                    return C0671.m3017(C19806.m45029(C1875.m6105(f16960, 20, 3, i56)) ^ 2101624995);
                case -1274277145:
                case 1706536586:
                    sArr16 = sArr16;
                    i15 = i41;
                    sArr15 = sArr15;
                    String str18 = strM6105;
                    String str19 = str13;
                    String str20 = strM2906;
                    short[] sArr26 = sArr14;
                    int i71 = i51;
                    int iM450215 = C19806.m45029(RunnableC1564.m5344(sArr26, i71, 3, i56)) ^ 2097289735;
                    switch (i52) {
                        case 1600:
                            iM113010 = ThreadFactoryC3888.m11306("ۛ֡") ^ i37;
                            i20 = ((iM113010 ^ i38) * (-12493)) ^ 251888285;
                            i26 = 361049259;
                            i22 = iM113010 ^ i26;
                            strM6105 = str18;
                            str13 = str19;
                            strM2906 = str20;
                            sArr14 = sArr26;
                            i51 = i71;
                            sArr15 = sArr15;
                            i45 = iM450215;
                            i41 = i15;
                            sArr12 = sArr16;
                            i40 = i22;
                            i39 = i20;
                            sArr16 = sArr12;
                            break;
                        case 1601:
                            iM113010 = ThreadFactoryC3888.m11306("֨֫") ^ i38;
                            i20 = ((iM113010 ^ i37) * 5413) ^ 177456955;
                            i26 = 750494571;
                            i22 = iM113010 ^ i26;
                            strM6105 = str18;
                            str13 = str19;
                            strM2906 = str20;
                            sArr14 = sArr26;
                            i51 = i71;
                            sArr15 = sArr15;
                            i45 = iM450215;
                            i41 = i15;
                            sArr12 = sArr16;
                            i40 = i22;
                            i39 = i20;
                            sArr16 = sArr12;
                            break;
                        case 1602:
                            int iM450216 = C19806.m45029("᩺ۜ") ^ i37;
                            i39 = ((iM450216 ^ i38) * 10931) ^ (-1027541559);
                            str13 = str19;
                            strM6105 = str18;
                            strM2906 = str20;
                            sArr16 = sArr16;
                            i51 = i71;
                            i40 = iM450216 ^ (-362074215);
                            i45 = iM450215;
                            sArr14 = sArr26;
                            i41 = i15;
                            sArr15 = sArr15;
                            break;
                        default:
                            iM113010 = C19806.m45029("᩷ۖ") ^ i38;
                            i20 = ((iM113010 ^ i37) * 22797) ^ (-1161376983);
                            i26 = -347103943;
                            i22 = iM113010 ^ i26;
                            strM6105 = str18;
                            str13 = str19;
                            strM2906 = str20;
                            sArr14 = sArr26;
                            i51 = i71;
                            sArr15 = sArr15;
                            i45 = iM450215;
                            i41 = i15;
                            sArr12 = sArr16;
                            i40 = i22;
                            i39 = i20;
                            sArr16 = sArr12;
                            break;
                    }
                    break;
                case -1252926057:
                case 1486121531:
                    sArr16 = sArr16;
                    i15 = i41;
                    sArr3 = sArr15;
                    i16 = i48;
                    i17 = i49;
                    i18 = i50;
                    sArr4 = sArr14;
                    str2 = strM6105;
                    str3 = str13;
                    sArr5 = sArr17;
                    i19 = i51;
                    str4 = strM2906;
                    switch (i52) {
                        case 1100:
                            iM450211 = ThreadFactoryC3888.m11306("֨۬") ^ i37;
                            i20 = ((iM450211 ^ i38) * (-733)) ^ 532579562;
                            i21 = 420639579;
                            break;
                        case 1101:
                            iM450211 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i38;
                            i20 = ((iM450211 ^ i37) * 19395) ^ (-1117624670);
                            i21 = 827025148;
                            break;
                        case 1102:
                            iM450211 = (C19806.m45029("ܺܽ") ^ i37) * 55;
                            i20 = ((iM450211 ^ i38) * (-12893)) ^ 785316686;
                            i21 = -202949780;
                            break;
                        case 1103:
                            iM450211 = (i38 - C19806.m45029("֨ۜ")) * (-63);
                            i20 = ((iM450211 ^ i37) * (-26811)) ^ 50633553;
                            i21 = -340216891;
                            break;
                        case 1104:
                            iM450211 = C19806.m45029("ᩳۛ") ^ i37;
                            i20 = ((iM450211 ^ i38) * (-24851)) ^ (-1015791992);
                            i21 = 1351207224;
                            break;
                        case 1105:
                            iM450211 = (C19806.m45029("۠۠") + i38) * 3;
                            i20 = ((iM450211 ^ i37) * 27333) ^ 930903281;
                            i21 = 210864064;
                            break;
                        default:
                            iM450211 = ThreadFactoryC3888.m11306("ᩳۖ") ^ i37;
                            i20 = ((iM450211 ^ i38) * 22049) ^ (-797018543);
                            i21 = -1095388535;
                            break;
                    }
                    i22 = iM450211 ^ i21;
                    strM6105 = str2;
                    str13 = str3;
                    strM2906 = str4;
                    sArr14 = sArr4;
                    i51 = i19;
                    sArr17 = sArr5;
                    sArr15 = sArr3;
                    i50 = i18;
                    i49 = i17;
                    i48 = i16;
                    i41 = i15;
                    sArr12 = sArr16;
                    i40 = i22;
                    i39 = i20;
                    sArr16 = sArr12;
                    break;
                case -1241252163:
                case -675379302:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != -2) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۘ") ^ i37) * 33;
                        i = ((iM11306 ^ i38) * (-15595)) ^ 1193871100;
                        i2 = 141079714;
                    } else {
                        iM11306 = (i38 - C19806.m45029("ۙ֡")) * (-7);
                        i = ((iM11306 ^ i37) * (-7069)) ^ 1539688188;
                        i2 = -1942429242;
                    }
                    int i615 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i615;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1237786595:
                case 588582820:
                    C3722.m10894();
                    if (C1977.f7413 > 0) {
                        iM113013 = (C19806.m45029("ۧ۬") ^ i38) * (-73);
                        i35 = ((iM113013 ^ i37) * (-12023)) ^ 1467290528;
                        i36 = -1694716549;
                    } else {
                        iM113013 = ThreadFactoryC3888.m11306("۟ᩳ") ^ i38;
                        i35 = ((iM113013 ^ i37) * 32277) ^ (-665409535);
                        i36 = 1954717844;
                    }
                    i40 = iM113013 ^ i36;
                    i39 = i35;
                    break;
                case -1236651088:
                case 1323991419:
                    return C1875.m6085(ThreadFactoryC3888.m11306(strM8172) ^ 2129014678);
                case -1221809142:
                case 1631949806:
                    C1977.m6356();
                    if (C3577.f13150 < 0) {
                        iM113013 = (ThreadFactoryC3888.m11306("ᩳۜ") + i37) * (-31);
                        i35 = ((iM113013 ^ i38) * 30511) ^ 1337915477;
                        i36 = -764926249;
                        i40 = iM113013 ^ i36;
                        i39 = i35;
                    } else {
                        sArr16 = sArr16;
                        i15 = i41;
                        sArr6 = sArr15;
                        sArr7 = sArr17;
                        i23 = i49;
                        i24 = i50;
                        sArr8 = sArr14;
                        i25 = i51;
                        str5 = strM6105;
                        str6 = str13;
                        str7 = strM2906;
                        int iM450217 = C19806.m45029("֡ۗ") ^ i38;
                        short[] sArr27 = sArr7;
                        i39 = ((iM450217 ^ i37) * 1485) ^ 1720850074;
                        strM6105 = str5;
                        str13 = str6;
                        strM2906 = str7;
                        sArr14 = sArr8;
                        i51 = i25;
                        sArr17 = sArr27;
                        sArr15 = sArr6;
                        i50 = i24;
                        sArr16 = sArr16;
                        i40 = iM450217 ^ (-378408995);
                        i49 = i23;
                        i41 = i15;
                    }
                    break;
                case -1187115910:
                case 334528017:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 1800) {
                        iM45029 = C19806.m45029("᩷ۚ") ^ i37;
                        i10 = ((iM45029 ^ i38) * 32035) ^ 113116454;
                        i11 = -714221217;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۗ") + i38) * (-7);
                        i10 = ((iM45029 ^ i37) * 22289) ^ 1392706383;
                        i11 = 642109299;
                    }
                    int i616 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i616;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1114175155:
                case -976922776:
                    C0216.m1591();
                    if (C2642.f10294 <= 0) {
                        sArr16 = sArr16;
                        i15 = i41;
                        sArr6 = sArr15;
                        sArr7 = sArr17;
                        i23 = i49;
                        i24 = i50;
                        sArr8 = sArr14;
                        i25 = i51;
                        str5 = strM6105;
                        str6 = str13;
                        str7 = strM2906;
                        int iM450218 = C19806.m45029("֡ۗ") ^ i38;
                        short[] sArr28 = sArr7;
                        i39 = ((iM450218 ^ i37) * 1485) ^ 1720850074;
                        strM6105 = str5;
                        str13 = str6;
                        strM2906 = str7;
                        sArr14 = sArr8;
                        i51 = i25;
                        sArr17 = sArr28;
                        sArr15 = sArr6;
                        i50 = i24;
                        sArr16 = sArr16;
                        i40 = iM450218 ^ (-378408995);
                        i49 = i23;
                        i41 = i15;
                    } else {
                        sArr16 = sArr16;
                        i41 = i41;
                        sArr15 = sArr15;
                        strM6105 = strM6105;
                        i52 = i52;
                        i48 = i48;
                        i49 = i49;
                        i50 = i50;
                        sArr14 = sArr14;
                        str13 = str13;
                        sArr17 = sArr17;
                        i51 = i51;
                        strM2906 = strM2906;
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩷") + i37) * (-115);
                        i = ((iM11306 ^ i38) * 18055) ^ (-597037077);
                        i2 = -385362286;
                        int i617 = iM11306 ^ i2;
                        str13 = str13;
                        strM2906 = strM2906;
                        sArr14 = sArr14;
                        sArr15 = sArr15;
                        i52 = i52;
                        i51 = i51;
                        sArr17 = sArr17;
                        sArr16 = sArr16;
                        i40 = i617;
                        i39 = i;
                        i50 = i50;
                        i41 = i41;
                        i49 = i49;
                        i48 = i48;
                        strM6105 = strM6105;
                    }
                    break;
                case -1097016641:
                case 698494220:
                    i56 = 25286;
                    iM11306 = (ThreadFactoryC3888.m11306("᩻ۚ") ^ i38) * 31;
                    i = ((iM11306 ^ i37) * 32007) ^ 1210264837;
                    i2 = -543241262;
                    int i618 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i618;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -1096984996:
                case 1462742754:
                    return RunnableC1606.m5476(c1313);
                case -1092216113:
                case -816925857:
                    if (!C1668.m5583()) {
                        iM113013 = (C19806.m45029("ۧ۬") ^ i38) * (-73);
                        i35 = ((iM113013 ^ i37) * (-12023)) ^ 1467290528;
                        i36 = -1694716549;
                        i40 = iM113013 ^ i36;
                        i39 = i35;
                    } else {
                        sArr16 = sArr16;
                        i41 = i41;
                        sArr15 = sArr15;
                        strM6105 = strM6105;
                        i52 = i52;
                        i48 = i48;
                        i49 = i49;
                        i50 = i50;
                        sArr14 = sArr14;
                        str13 = str13;
                        sArr17 = sArr17;
                        i51 = i51;
                        strM2906 = strM2906;
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩷") + i37) * (-115);
                        i = ((iM11306 ^ i38) * 18055) ^ (-597037077);
                        i2 = -385362286;
                        int i619 = iM11306 ^ i2;
                        str13 = str13;
                        strM2906 = strM2906;
                        sArr14 = sArr14;
                        sArr15 = sArr15;
                        i52 = i52;
                        i51 = i51;
                        sArr17 = sArr17;
                        sArr16 = sArr16;
                        i40 = i619;
                        i39 = i;
                        i50 = i50;
                        i41 = i41;
                        i49 = i49;
                        i48 = i48;
                        strM6105 = strM6105;
                    }
                    break;
                case -1066722213:
                case 75104939:
                    return C3577.m10571(f16960, 93, 8, i56);
                case -1042616539:
                case -40892369:
                    return C0671.m3017(ThreadFactoryC3888.m11306(C1875.m6105(f16960, 53, 3, i56)) ^ 2126897167);
                case -1038958223:
                case 1808926152:
                    strM3017 = C1875.m6085(i45);
                    sArr16 = sArr16;
                    i32 = i41;
                    sArr11 = sArr15;
                    str12 = strM2906;
                    iM113012 = ThreadFactoryC3888.m11306("ۘ᩶") ^ i37;
                    i33 = ((iM113012 ^ i38) * 30595) ^ (-440992868);
                    i34 = 797108140;
                    i14 = iM113012 ^ i34;
                    strM2906 = str12;
                    i39 = i33;
                    i41 = i32;
                    sArr15 = sArr11;
                    sArr12 = sArr16;
                    i40 = i14;
                    sArr16 = sArr12;
                    break;
                case -1013571874:
                case -75546423:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    strM8172 = C2642.m8172(f16960, 4, 3, i56);
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۙ") + i38) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i37) * 30325) ^ (-375901771);
                        i2 = 89975716;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i38) * 71;
                        i = ((iM11306 ^ i37) * 23195) ^ 1280186030;
                        i2 = -1796885095;
                    }
                    int i6110 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i6110;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -953098989:
                case 616187042:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    int i72 = i49;
                    i50 = i50;
                    short[] sArr29 = sArr14;
                    strM6105 = strM6105;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    i49 = i72;
                    strM2906 = C0629.m2906(f16960, 83, 2, i56);
                    sArr13 = f16960;
                    i6 = 85;
                    if (!C3286.f12186) {
                        int iM113019 = (ThreadFactoryC3888.m11306("۟۫") ^ i38) * 53;
                        int i73 = ((iM113019 ^ i37) * (-9265)) ^ (-1039289178);
                        i14 = iM113019 ^ 1882783547;
                        i39 = i73;
                        strM6105 = strM6105;
                        i51 = i51;
                        sArr17 = sArr17;
                        str13 = str13;
                        i41 = i41;
                        sArr14 = sArr29;
                        i50 = i50;
                        sArr15 = sArr15;
                        i49 = i49;
                        i48 = 85;
                        sArr12 = sArr16;
                        i40 = i14;
                        sArr16 = sArr12;
                    } else {
                        i52 = i52;
                        sArr14 = sArr29;
                        int iM450219 = (C19806.m45029("ۚ᩵") ^ i37) * (-63);
                        int i74 = ((iM450219 ^ i38) * 24429) ^ 481382622;
                        strM6105 = strM6105;
                        i51 = i51;
                        sArr17 = sArr17;
                        str13 = str13;
                        sArr14 = sArr14;
                        i52 = i52;
                        i50 = i50;
                        sArr16 = sArr16;
                        i40 = iM450219 ^ 992514851;
                        i49 = i49;
                        i41 = i41;
                        i48 = i6;
                        i39 = i74;
                        sArr15 = sArr15;
                    }
                    break;
                case -913070895:
                case 180600781:
                    sArr16 = sArr16;
                    i32 = i41;
                    sArr11 = sArr15;
                    str12 = strM2906;
                    if (C1460.m5058(strM9717, str12)) {
                        iM113012 = (i37 - ThreadFactoryC3888.m11306("۠ۚ")) * 77;
                        i33 = ((iM113012 ^ i38) * (-23171)) ^ (-975491634);
                        i34 = 860388836;
                    } else {
                        strM3017 = strM5477;
                        iM113012 = ThreadFactoryC3888.m11306("ۘ᩶") ^ i37;
                        i33 = ((iM113012 ^ i38) * 30595) ^ (-440992868);
                        i34 = 797108140;
                    }
                    i14 = iM113012 ^ i34;
                    strM2906 = str12;
                    i39 = i33;
                    i41 = i32;
                    sArr15 = sArr11;
                    sArr12 = sArr16;
                    i40 = i14;
                    sArr16 = sArr12;
                    break;
                case -855887927:
                case 1652602612:
                    return C1875.m6085(C19806.m45029(RunnableC1895.m6164(f16960, 56, 3, i56)) ^ 2118653326);
                case -841276652:
                case 326825187:
                    return C0671.m3017(ThreadFactoryC3888.m11306(C1668.m5577(f16960, 77, 3, i56)) ^ 2116330859);
                case -836696435:
                case -743958499:
                    RunnableC3388.m10064();
                    return null;
                case -810132683:
                case 1581082113:
                    String strM4969 = C1419.m4969(f16960, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 6, i56);
                    if (C0050.f912 > 0) {
                        StringBuilder sb = new StringBuilder(strM4969);
                        C0817.m3408(sb, C3722.m10899(c1313));
                        throw new RuntimeException(C2124.m6674(sb));
                    }
                    int iM450220 = (i37 - C19806.m45029("ܽܳ")) * (-67);
                    i20 = ((iM450220 ^ i38) * (-14945)) ^ 248826907;
                    i22 = iM450220 ^ 1422399732;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr12 = sArr16;
                    i40 = i22;
                    i39 = i20;
                    sArr16 = sArr12;
                    break;
                case -771463164:
                case 2065688001:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 1200) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֫") + i38) * 57;
                        i10 = ((iM45029 ^ i37) * 603) ^ 1752024821;
                        i11 = 431882184;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ۫") ^ i37) * 35;
                        i10 = ((iM45029 ^ i38) * 893) ^ (-492813352);
                        i11 = -653820573;
                    }
                    int i6111 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i6111;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -759062750:
                case 1372963548:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 3) {
                        iM11308 = C19806.m45029("۟֡") ^ i38;
                        i7 = ((iM11308 ^ i37) * (-20899)) ^ 1838114258;
                        i8 = -1242542457;
                    } else {
                        iM11308 = (i38 - C19806.m45029("֨ۨ")) * 73;
                        i7 = ((iM11308 ^ i37) * 1203) ^ 1537600573;
                        i8 = -515375931;
                    }
                    int i6112 = iM11308 ^ i8;
                    i39 = i7;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i6112;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -714770615:
                case 484886301:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    strM4832 = C1377.m4832(f16960, 1, 3, i56);
                    if (C1668.f6641 < 0) {
                        iM11306 = (C19806.m45029("ۖ᩹") + i37) * 21;
                        i = ((iM11306 ^ i38) * (-23907)) ^ 1584055632;
                        i2 = 171644742;
                        int i6113 = iM11306 ^ i2;
                        str13 = str13;
                        strM2906 = strM2906;
                        sArr14 = sArr14;
                        sArr15 = sArr15;
                        i52 = i52;
                        i51 = i51;
                        sArr17 = sArr17;
                        sArr16 = sArr16;
                        i40 = i6113;
                        i39 = i;
                        i50 = i50;
                        i41 = i41;
                        i49 = i49;
                        i48 = i48;
                        strM6105 = strM6105;
                    } else {
                        strM2906 = strM2906;
                        i6 = i48;
                        int iM4502110 = (C19806.m45029("ۚ᩵") ^ i37) * (-63);
                        int i75 = ((iM4502110 ^ i38) * 24429) ^ 481382622;
                        strM6105 = strM6105;
                        i51 = i51;
                        sArr17 = sArr17;
                        str13 = str13;
                        sArr14 = sArr14;
                        i52 = i52;
                        i50 = i50;
                        sArr16 = sArr16;
                        i40 = iM4502110 ^ 992514851;
                        i49 = i49;
                        i41 = i41;
                        i48 = i6;
                        i39 = i75;
                        sArr15 = sArr15;
                    }
                    break;
                case -641106686:
                case 1692516378:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 1803) {
                        iM45029 = C19806.m45029("ۖ᩷") ^ i37;
                        i10 = ((iM45029 ^ i38) * 13743) ^ (-976918308);
                        i11 = -1248201816;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۗ") + i38) * (-7);
                        i10 = ((iM45029 ^ i37) * 22289) ^ 1392706383;
                        i11 = 642109299;
                    }
                    int i6114 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i6114;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -625947703:
                case 1069993842:
                    return C0671.m3017(C19806.m45029(RunnableC1895.m6164(f16960, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i56)) ^ 2123833765);
                case -603311498:
                case -276617525:
                    sArr16 = sArr16;
                    i32 = i41;
                    sArr11 = sArr15;
                    str12 = strM2906;
                    strM3017 = C0671.m3017(iM113014);
                    iM113012 = ThreadFactoryC3888.m11306("ۘ᩶") ^ i37;
                    i33 = ((iM113012 ^ i38) * 30595) ^ (-440992868);
                    i34 = 797108140;
                    i14 = iM113012 ^ i34;
                    strM2906 = str12;
                    i39 = i33;
                    i41 = i32;
                    sArr15 = sArr11;
                    sArr12 = sArr16;
                    i40 = i14;
                    sArr16 = sArr12;
                    break;
                case -580819198:
                case 753326526:
                    return C0671.m3017(ThreadFactoryC3888.m11306(C3286.m9788(f16960, 74, 3, i56)) ^ 2122648075);
                case -499205676:
                case 965684043:
                    sArr16 = sArr16;
                    i15 = i41;
                    sArr3 = sArr15;
                    i16 = i48;
                    i17 = i49;
                    i18 = i50;
                    sArr4 = sArr14;
                    str2 = strM6105;
                    str3 = str13;
                    sArr5 = sArr17;
                    i19 = i51;
                    str4 = strM2906;
                    switch (i52) {
                        case 1000:
                            iM450211 = C19806.m45029("᩷ᩴ") ^ i37;
                            i20 = ((iM450211 ^ i38) * (-14597)) ^ 1856275288;
                            i21 = 2025542667;
                            break;
                        case 1001:
                            iM450211 = ThreadFactoryC3888.m11306("ۖۛ") ^ i37;
                            i20 = ((iM450211 ^ i38) * 7441) ^ 2106145295;
                            i21 = -1950072607;
                            break;
                        case b.c /* 1002 */:
                            iM450211 = C19806.m45029("۬۟") ^ i38;
                            i20 = ((iM450211 ^ i37) * 29663) ^ (-1949376686);
                            i21 = 1645887069;
                            break;
                        case b.d /* 1003 */:
                            iM450211 = (ThreadFactoryC3888.m11306("ܶۛ") ^ i37) * (-107);
                            i20 = ((iM450211 ^ i38) * (-17191)) ^ 1077912330;
                            i21 = 1415208458;
                            break;
                        default:
                            iM450211 = (C19806.m45029("֨ܽ") ^ i38) * (-87);
                            i20 = ((iM450211 ^ i37) * 26273) ^ 2071330096;
                            i21 = 1864561137;
                            break;
                    }
                    i22 = iM450211 ^ i21;
                    strM6105 = str2;
                    str13 = str3;
                    strM2906 = str4;
                    sArr14 = sArr4;
                    i51 = i19;
                    sArr17 = sArr5;
                    sArr15 = sArr3;
                    i50 = i18;
                    i49 = i17;
                    i48 = i16;
                    i41 = i15;
                    sArr12 = sArr16;
                    i40 = i22;
                    i39 = i20;
                    sArr16 = sArr12;
                    break;
                case -482132696:
                case -66237011:
                    return str;
                case -435433983:
                case 1579839730:
                    return C1875.m6085(ThreadFactoryC3888.m11306(CallableC1627.m5502(f16960, 47, 3, i56)) ^ 2119272097);
                case -426264554:
                case -231968196:
                    return C0671.m3017(C19806.m45029(C0050.m940(f16960, 32, 3, i56)) ^ 2129690427);
                case -421575865:
                case 227974238:
                    sArr9 = sArr16;
                    i15 = i41;
                    sArr10 = sArr15;
                    str8 = strM6105;
                    str9 = strM2906;
                    strM5476 = RunnableC1606.m5476(c1313);
                    strM9716 = MenuItemOnMenuItemClickListenerC3244.m9716(strM5476);
                    C0526.m2429(strM9716);
                    if (AbstractC0464.m2315(strM9716, str8)) {
                        iM113011 = ThreadFactoryC3888.m11306("᩵ۨ") ^ i38;
                        i27 = ((iM113011 ^ i37) * 28483) ^ 203017915;
                        i28 = 1310389139;
                    } else {
                        iM113011 = C19806.m45029("ܳᩳ") ^ i37;
                        i27 = ((iM113011 ^ i38) * (-11183)) ^ 1806821668;
                        i28 = -1731193564;
                    }
                    i29 = iM113011 ^ i28;
                    strM2906 = str9;
                    str13 = strM9716;
                    i39 = i27;
                    strM6105 = str8;
                    sArr16 = sArr9;
                    sArr15 = sArr10;
                    i40 = i29;
                    i41 = i15;
                    break;
                case -221598706:
                case 556331817:
                    sArr9 = sArr16;
                    i15 = i41;
                    sArr10 = sArr15;
                    str10 = str13;
                    str11 = strM2906;
                    switch (i52) {
                        case 1700:
                            iM450212 = (C19806.m45029("۬ܿ") + i38) * (-127);
                            i30 = ((iM450212 ^ i37) * 24547) ^ 357310727;
                            i31 = -2030959959;
                            break;
                        case 1701:
                            iM450212 = ThreadFactoryC3888.m11306("ᩴۘ") ^ i37;
                            i30 = ((iM450212 ^ i38) * 11687) ^ (-262469804);
                            i31 = -1976940393;
                            break;
                        case 1702:
                            iM450212 = (C19806.m45029("ۘۙ") ^ i37) * (-105);
                            i30 = ((iM450212 ^ i38) * 12941) ^ 961314264;
                            i31 = 1025144537;
                            break;
                        case 1703:
                            iM450212 = ThreadFactoryC3888.m11306("֨ۛ") ^ i38;
                            i30 = ((iM450212 ^ i37) * (-19459)) ^ 1125117465;
                            i31 = 282339541;
                            break;
                        default:
                            iM450212 = (C19806.m45029("ᩴ᩹") + i37) * (-17);
                            i30 = ((iM450212 ^ i38) * (-11351)) ^ (-946677794);
                            i31 = 89942976;
                            break;
                    }
                    i29 = iM450212 ^ i31;
                    strM2906 = str11;
                    str13 = str10;
                    i39 = i30;
                    sArr16 = sArr9;
                    sArr15 = sArr10;
                    i40 = i29;
                    i41 = i15;
                    break;
                case -144347401:
                case 1442314569:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 6) {
                        iM11306 = C19806.m45029("ܺۘ") ^ i37;
                        i = ((iM11306 ^ i38) * 1183) ^ 1788840274;
                        i2 = -971083239;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩵") + i38) * 39;
                        i = ((iM11306 ^ i37) * 29045) ^ 1154678513;
                        i2 = -837553089;
                    }
                    int i6115 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i6115;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case -128074569:
                case 1800954524:
                    sArr16 = sArr16;
                    i15 = i41;
                    sArr3 = sArr15;
                    i16 = i48;
                    short[] sArr30 = sArr13;
                    i17 = i49;
                    i18 = i50;
                    sArr4 = sArr14;
                    str2 = strM6105;
                    str3 = str13;
                    sArr5 = sArr17;
                    i19 = i51;
                    str4 = strM2906;
                    switch (i52) {
                        case SnackbarManager.SHORT_DURATION_MS /* 1500 */:
                            sArr13 = sArr30;
                            iM450211 = (C19806.m45029("ۢܶ") ^ i38) * 25;
                            i20 = ((iM450211 ^ i37) * 10483) ^ (-2511149);
                            i21 = -281564419;
                            break;
                        case 1501:
                            sArr13 = sArr30;
                            iM450211 = C19806.m45029("᩺ۢ") ^ i38;
                            i20 = ((iM450211 ^ i37) * 13529) ^ 1959807838;
                            i21 = -652371356;
                            break;
                        case 1502:
                            iM450211 = C19806.m45029("ۨۘ") ^ i37;
                            sArr13 = sArr30;
                            i20 = ((iM450211 ^ i38) * (-22895)) ^ 2071885748;
                            i21 = 1207530953;
                            break;
                        default:
                            sArr13 = sArr30;
                            iM450211 = (i37 - ThreadFactoryC3888.m11306("۠᩺")) * (-67);
                            i20 = ((iM450211 ^ i38) * 18755) ^ 992054104;
                            i21 = -980950433;
                            break;
                    }
                    i22 = iM450211 ^ i21;
                    strM6105 = str2;
                    str13 = str3;
                    strM2906 = str4;
                    sArr14 = sArr4;
                    i51 = i19;
                    sArr17 = sArr5;
                    sArr15 = sArr3;
                    i50 = i18;
                    i49 = i17;
                    i48 = i16;
                    i41 = i15;
                    sArr12 = sArr16;
                    i40 = i22;
                    i39 = i20;
                    sArr16 = sArr12;
                    break;
                case -93527068:
                case 1883541709:
                    objArr = new Object[i41];
                    objArr[i42] = strM3017;
                    sArr16 = f16960;
                    i54 = 122;
                    i44 = 3;
                    if (C1937.f7317 < 0) {
                        iM113013 = ThreadFactoryC3888.m11306("ܶ᩺") ^ i38;
                        i35 = ((iM113013 ^ i37) * (-14843)) ^ (-1896369546);
                        i36 = 1792233490;
                        i40 = iM113013 ^ i36;
                        i39 = i35;
                    } else {
                        sArr16 = sArr16;
                        i15 = i41;
                        sArr6 = sArr15;
                        sArr7 = sArr17;
                        i23 = i49;
                        i24 = i50;
                        sArr8 = sArr14;
                        i25 = i51;
                        str5 = strM6105;
                        str6 = str13;
                        str7 = strM2906;
                        int iM4502111 = C19806.m45029("֡ۗ") ^ i38;
                        short[] sArr210 = sArr7;
                        i39 = ((iM4502111 ^ i37) * 1485) ^ 1720850074;
                        strM6105 = str5;
                        str13 = str6;
                        strM2906 = str7;
                        sArr14 = sArr8;
                        i51 = i25;
                        sArr17 = sArr210;
                        sArr15 = sArr6;
                        i50 = i24;
                        sArr16 = sArr16;
                        i40 = iM4502111 ^ (-378408995);
                        i49 = i23;
                        i41 = i15;
                    }
                    break;
                case -81000263:
                case 165241570:
                    return C0671.m3017(C19806.m45029(C0050.m940(f16960, 59, 3, i56)) ^ 2123538796);
                case -11276541:
                case 64622404:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 1802) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۟") + i38) * 91;
                        i10 = ((iM45029 ^ i37) * (-15483)) ^ (-979552995);
                        i11 = -1775128499;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۗ") + i38) * (-7);
                        i10 = ((iM45029 ^ i37) * 22289) ^ 1392706383;
                        i11 = 642109299;
                    }
                    int i6116 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i6116;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case 4840464:
                case 1768973236:
                    objArr2 = new Object[i41];
                    objArr2[i42] = strM3018;
                    sArr15 = f16960;
                    i46 = 119;
                    i43 = 3;
                    if (AbstractC0464.f2088 <= 0) {
                        iM113013 = C19806.m45029("ܿۧ") ^ i38;
                        i35 = ((iM113013 ^ i37) * (-8819)) ^ 1109257638;
                        i36 = 1707100256;
                    } else {
                        iM113013 = ThreadFactoryC3888.m11306("ۧۗ") ^ i37;
                        i35 = ((iM113013 ^ i38) * (-1195)) ^ (-1151984117);
                        i36 = -2134105682;
                    }
                    i40 = iM113013 ^ i36;
                    i39 = i35;
                    break;
                case 8390858:
                case 1940257410:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 1801) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩻") ^ i38;
                        i10 = ((iM45029 ^ i37) * 739) ^ (-257130542);
                        i11 = -910253899;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۗ") + i38) * (-7);
                        i10 = ((iM45029 ^ i37) * 22289) ^ 1392706383;
                        i11 = 642109299;
                    }
                    int i6117 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i6117;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case 63644820:
                case 1741227653:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    s = f16960[0];
                    i47 = s * s;
                    if (C7105.m18985()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۙ") + i38) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i37) * 30325) ^ (-375901771);
                        i2 = 89975716;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۡ") + i38) * (-59);
                        i = ((iM11306 ^ i37) * 23289) ^ (-840105384);
                        i2 = -657188278;
                    }
                    int i6118 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i6118;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case 96718959:
                case 1549498661:
                    return C0671.m3017(ThreadFactoryC3888.m11306(C2871.m8640(f16960, 62, 3, i56)) ^ 2125015176);
                case 206022940:
                case 1872021008:
                    RunnableC1564.m5345();
                    if (C3660.m10791() == 0) {
                        int iM450221 = (i37 - C19806.m45029("ܽܳ")) * (-67);
                        i20 = ((iM450221 ^ i38) * (-14945)) ^ 248826907;
                        i22 = iM450221 ^ 1422399732;
                        i41 = i41;
                        sArr15 = sArr15;
                        sArr12 = sArr16;
                        i40 = i22;
                        i39 = i20;
                        sArr16 = sArr12;
                    } else {
                        iM113013 = (C19806.m45029("ۧ۬") ^ i38) * (-73);
                        i35 = ((iM113013 ^ i37) * (-12023)) ^ 1467290528;
                        i36 = -1694716549;
                        i40 = iM113013 ^ i36;
                        i39 = i35;
                    }
                    break;
                case 237125697:
                case 299820026:
                    C2477.m7593();
                    if (!C0962.f3784) {
                        sArr16 = sArr16;
                        i41 = i41;
                        sArr15 = sArr15;
                        strM6105 = strM6105;
                        i52 = i52;
                        i48 = i48;
                        i49 = i49;
                        i50 = i50;
                        sArr14 = sArr14;
                        str13 = str13;
                        sArr17 = sArr17;
                        i51 = i51;
                        strM2906 = strM2906;
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۙ") + i38) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i37) * 30325) ^ (-375901771);
                        i2 = 89975716;
                        int i6119 = iM11306 ^ i2;
                        str13 = str13;
                        strM2906 = strM2906;
                        sArr14 = sArr14;
                        sArr15 = sArr15;
                        i52 = i52;
                        i51 = i51;
                        sArr17 = sArr17;
                        sArr16 = sArr16;
                        i40 = i6119;
                        i39 = i;
                        i50 = i50;
                        i41 = i41;
                        i49 = i49;
                        i48 = i48;
                        strM6105 = strM6105;
                    } else {
                        iM113013 = (C19806.m45029("ۧ۬") ^ i38) * (-73);
                        i35 = ((iM113013 ^ i37) * (-12023)) ^ 1467290528;
                        i36 = -1694716549;
                        i40 = iM113013 ^ i36;
                        i39 = i35;
                    }
                    break;
                case 270997855:
                case 1295910482:
                    sArr9 = sArr16;
                    i15 = i41;
                    sArr10 = sArr15;
                    str10 = str13;
                    str11 = strM2906;
                    if (AbstractC0464.m2315(str10, str11)) {
                        iM450212 = C19806.m45029("ۗۤ") ^ i38;
                        i30 = ((iM450212 ^ i37) * (-12731)) ^ 347930009;
                        i31 = -1691908516;
                    } else {
                        strM3018 = strM5476;
                        iM450212 = C19806.m45029("ۜ᩹") ^ i38;
                        i30 = ((iM450212 ^ i37) * 11425) ^ (-220352320);
                        i31 = -902994398;
                    }
                    i29 = iM450212 ^ i31;
                    strM2906 = str11;
                    str13 = str10;
                    i39 = i30;
                    sArr16 = sArr9;
                    sArr15 = sArr10;
                    i40 = i29;
                    i41 = i15;
                    break;
                case 277311770:
                case 1606916261:
                    return C1875.m6085(C19806.m45029(C0526.m2424(f16960, IShizukuService.Stub.TRANSACTION_isHidden, 3, i56)) ^ 2098050960);
                case 287188664:
                case 1985714905:
                    sArr16 = sArr16;
                    i15 = i41;
                    sArr6 = sArr15;
                    sArr7 = sArr17;
                    i23 = i49;
                    i24 = i50;
                    str5 = strM6105;
                    str6 = str13;
                    str7 = strM2906;
                    iM113014 = ThreadFactoryC3888.m11306(C0526.m2424(sArr7, i24, i23, i56)) ^ 2103034296;
                    sArr8 = f16960;
                    i25 = 90;
                    if (C1066.f4915 > 0) {
                        int iM450222 = C19806.m45029("ۗܽ") ^ i37;
                        i20 = ((iM450222 ^ i38) * (-9267)) ^ (-1862750818);
                        i22 = iM450222 ^ 1642210167;
                        strM6105 = str5;
                        sArr17 = sArr7;
                        str13 = str6;
                        strM2906 = str7;
                        i51 = 90;
                        sArr14 = sArr8;
                        i50 = i24;
                        sArr15 = sArr6;
                        i49 = i23;
                        i41 = i15;
                        sArr12 = sArr16;
                        i40 = i22;
                        i39 = i20;
                        sArr16 = sArr12;
                    } else {
                        int iM4502112 = C19806.m45029("֡ۗ") ^ i38;
                        short[] sArr211 = sArr7;
                        i39 = ((iM4502112 ^ i37) * 1485) ^ 1720850074;
                        strM6105 = str5;
                        str13 = str6;
                        strM2906 = str7;
                        sArr14 = sArr8;
                        i51 = i25;
                        sArr17 = sArr211;
                        sArr15 = sArr6;
                        i50 = i24;
                        sArr16 = sArr16;
                        i40 = iM4502112 ^ (-378408995);
                        i49 = i23;
                        i41 = i15;
                    }
                    break;
                case 287601429:
                case 1238035886:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    int i76 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    i52 = i52;
                    if (i52 != 1401) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩸") ^ i38;
                        i48 = i76;
                        i10 = ((iM45029 ^ i37) * (-1031)) ^ 586081707;
                        i11 = 676996822;
                    } else {
                        i48 = i76;
                        iM45029 = (i38 - ThreadFactoryC3888.m11306("ܿۖ")) * 15;
                        i10 = ((iM45029 ^ i37) * 22493) ^ 1430428271;
                        i11 = -51308529;
                    }
                    int i61110 = iM45029 ^ i11;
                    i52 = i52;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr16 = sArr16;
                    i40 = i61110;
                    i39 = i10;
                    sArr14 = sArr2;
                    i51 = i51;
                    sArr17 = sArr17;
                    i41 = i41;
                    sArr15 = sArr15;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case 461269915:
                case 491219568:
                    return C0671.m3017(C19806.m45029(C2249.m6918(f16960, 26, 3, i56)) ^ 2101796247);
                case 501605684:
                case 863997341:
                    sArr14 = sArr14;
                    iM11309 = ThreadFactoryC3888.m11306(C1461.m5070(f16960, 17, 3, i56));
                    i9 = 2103086694;
                    i55 = iM11309 ^ i9;
                    iM11306 = (ThreadFactoryC3888.m11306("ۚܿ") + i37) * (-65);
                    i = ((iM11306 ^ i38) * 5763) ^ 920346435;
                    i2 = 970223951;
                    int i61111 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i61111;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case 541523137:
                case 1099993712:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 2) {
                        iM11308 = (C19806.m45029("ܽۧ") + i37) * 41;
                        i7 = ((iM11308 ^ i38) * 19393) ^ (-1632059471);
                        i8 = 314402300;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۨܳ") ^ i37;
                        i7 = ((iM11308 ^ i38) * (-14173)) ^ (-791963693);
                        i8 = 917310133;
                    }
                    int i61112 = iM11308 ^ i8;
                    i39 = i7;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i61112;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case 638039607:
                case 1236870682:
                    return C1875.m6085(C19806.m45029(C2332.m7082(f16960, 38, 3, i56)) ^ 2121736811);
                case 656569799:
                case 1181235534:
                    return C1875.m6085(C19806.m45029(C2871.m8640(f16960, 41, 3, i56)) ^ 2124469571);
                case 729224766:
                case 1428297640:
                    return C0216.m1574(ThreadFactoryC3888.m11306(C0526.m2424(sArr15, i46, i43, i56)) ^ 2102903413, objArr2);
                case 752217694:
                case 1451048628:
                    C3660.m10791();
                    if (C1398.m4895() <= 0) {
                        iM113013 = (C19806.m45029("ۧ۬") ^ i38) * (-73);
                        i35 = ((iM113013 ^ i37) * (-12023)) ^ 1467290528;
                        i36 = -1694716549;
                    } else {
                        iM113013 = C19806.m45029("ܿۧ") ^ i38;
                        i35 = ((iM113013 ^ i37) * (-8819)) ^ 1109257638;
                        i36 = 1707100256;
                    }
                    i40 = iM113013 ^ i36;
                    i39 = i35;
                    break;
                case 852756695:
                case 2140455178:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 4) {
                        iM11308 = (C19806.m45029("᩸᩻") ^ i37) * (-21);
                        i7 = ((iM11308 ^ i38) * (-11537)) ^ 489758631;
                        i8 = 1263203192;
                    } else {
                        iM11308 = C19806.m45029("ܰۚ") ^ i37;
                        i7 = ((iM11308 ^ i38) * (-29637)) ^ (-442969307);
                        i8 = 624644363;
                    }
                    int i61113 = iM11308 ^ i8;
                    i39 = i7;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i61113;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case 872313261:
                case 880097843:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    sArr2 = sArr14;
                    strM6105 = strM6105;
                    i52 = i52;
                    str13 = str13;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 == 9) {
                        sArr14 = sArr2;
                        iM11308 = (i38 - C19806.m45029("֨ۨ")) * 73;
                        i7 = ((iM11308 ^ i37) * 1203) ^ 1537600573;
                        i8 = -515375931;
                        int i61114 = iM11308 ^ i8;
                        i39 = i7;
                        str13 = str13;
                        strM2906 = strM2906;
                        sArr14 = sArr14;
                        sArr15 = sArr15;
                        i52 = i52;
                        i51 = i51;
                        sArr17 = sArr17;
                        sArr16 = sArr16;
                        i40 = i61114;
                        i50 = i50;
                        i41 = i41;
                        i49 = i49;
                        i48 = i48;
                        strM6105 = strM6105;
                    } else {
                        iM45029 = C19806.m45029("۟ᩴ") ^ i38;
                        i10 = ((iM45029 ^ i37) * (-9189)) ^ 1230586625;
                        i11 = 408998494;
                        int i61115 = iM45029 ^ i11;
                        i52 = i52;
                        str13 = str13;
                        strM2906 = strM2906;
                        sArr16 = sArr16;
                        i40 = i61115;
                        i39 = i10;
                        sArr14 = sArr2;
                        i51 = i51;
                        sArr17 = sArr17;
                        i41 = i41;
                        sArr15 = sArr15;
                        i50 = i50;
                        i49 = i49;
                        i48 = i48;
                        strM6105 = strM6105;
                    }
                    break;
                case 952866559:
                case 2076226944:
                    sArr16 = sArr16;
                    i41 = i41;
                    sArr15 = sArr15;
                    strM6105 = strM6105;
                    i52 = i52;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    sArr14 = sArr14;
                    str13 = str13;
                    sArr17 = sArr17;
                    i51 = i51;
                    strM2906 = strM2906;
                    if (i52 != 5) {
                        iM11306 = (C19806.m45029("۬᩸") + i38) * 5;
                        i = ((iM11306 ^ i37) * (-2077)) ^ (-1419424755);
                        i2 = -1509054866;
                    } else {
                        iM11306 = C19806.m45029("ܿ۬") ^ i38;
                        i = ((iM11306 ^ i37) * (-28979)) ^ 1868483635;
                        i2 = 2029067107;
                    }
                    int i61116 = iM11306 ^ i2;
                    str13 = str13;
                    strM2906 = strM2906;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    i52 = i52;
                    i51 = i51;
                    sArr17 = sArr17;
                    sArr16 = sArr16;
                    i40 = i61116;
                    i39 = i;
                    i50 = i50;
                    i41 = i41;
                    i49 = i49;
                    i48 = i48;
                    strM6105 = strM6105;
                    break;
                case 1030791779:
                case 1363347870:
                    strM3018 = C1875.m6085(i45);
                    sArr9 = sArr16;
                    i15 = i41;
                    sArr10 = sArr15;
                    str10 = str13;
                    str11 = strM2906;
                    iM450212 = C19806.m45029("ۜ᩹") ^ i38;
                    i30 = ((iM450212 ^ i37) * 11425) ^ (-220352320);
                    i31 = -902994398;
                    i29 = iM450212 ^ i31;
                    strM2906 = str11;
                    str13 = str10;
                    i39 = i30;
                    sArr16 = sArr9;
                    sArr15 = sArr10;
                    i40 = i29;
                    i41 = i15;
                    break;
                case 1065811693:
                case 1637380741:
                    sArr9 = sArr16;
                    i15 = i41;
                    sArr10 = sArr15;
                    strM9716 = str13;
                    str9 = strM2906;
                    strM5477 = RunnableC1606.m5476(c1313);
                    strM9717 = MenuItemOnMenuItemClickListenerC3244.m9716(strM5477);
                    C0526.m2429(strM9717);
                    str8 = strM6105;
                    if (AbstractC0464.m2315(strM9717, str8)) {
                        iM113011 = (C19806.m45029("᩹ܳ") + i37) * (-81);
                        i27 = ((iM113011 ^ i38) * (-20641)) ^ 179117468;
                        i28 = -1578965861;
                    } else {
                        iM113011 = ThreadFactoryC3888.m11306("᩻᩷") ^ i38;
                        i27 = ((iM113011 ^ i37) * 2625) ^ (-1505980167);
                        i28 = -1062951490;
                    }
                    i29 = iM113011 ^ i28;
                    strM2906 = str9;
                    str13 = strM9716;
                    i39 = i27;
                    strM6105 = str8;
                    sArr16 = sArr9;
                    sArr15 = sArr10;
                    i40 = i29;
                    i41 = i15;
                    break;
                case 1327666410:
                case 1367238789:
                    return C0671.m3017(C19806.m45029(C1668.m5577(f16960, 29, 3, i56)) ^ 2099091912);
                case 1561897122:
                case 2049594413:
                    sArr16 = sArr16;
                    int i77 = i41;
                    short[] sArr31 = sArr15;
                    short[] sArr32 = sArr14;
                    String str21 = strM6105;
                    String str22 = str13;
                    int i78 = i48;
                    int i79 = i49;
                    int i80 = i50;
                    short[] sArr33 = sArr17;
                    int i81 = i51;
                    String str23 = strM2906;
                    int iM6174 = RunnableC1895.m6174(c1313);
                    if (iM6174 != -3) {
                        iM450210 = (i37 - C19806.m45029("ܰۜ")) * 83;
                        i12 = ((iM450210 ^ i38) * (-27419)) ^ (-644950414);
                        i13 = -1953158396;
                    } else {
                        iM450210 = (i38 - C19806.m45029("ۤۛ")) * (-105);
                        i12 = ((iM450210 ^ i37) * 30601) ^ 385391130;
                        i13 = 676727745;
                    }
                    i14 = iM450210 ^ i13;
                    str13 = str22;
                    strM2906 = str23;
                    sArr14 = sArr32;
                    sArr15 = sArr31;
                    i52 = iM6174;
                    i39 = i12;
                    i51 = i81;
                    sArr17 = sArr33;
                    i41 = i77;
                    i50 = i80;
                    i49 = i79;
                    i48 = i78;
                    strM6105 = str21;
                    sArr12 = sArr16;
                    i40 = i14;
                    sArr16 = sArr12;
                    break;
                default:
                    return C1875.m6085(ThreadFactoryC3888.m11306(C0962.m3747(f16960, 35, 3, i56)) ^ 2129133949);
            }
        }
    }
}
