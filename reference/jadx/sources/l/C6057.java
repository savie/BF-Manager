package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Field;

/* JADX INFO: renamed from: l.ۛ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4ND */
/* JADX INFO: loaded from: classes3.dex */
public class C6057 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۛۙۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f20558 = {8531, -13944, 8927, 12004, -20903, -20903, -20903, 7242, 19551, 19536, 19541, 19548, 19529, 19548, 19531, 19551, 19542, 19531, 19540, 19544, 19543, 19546, 19548, 19561, 19531, 19536, 19542, 19531, 19536, 19533, 19520, 19548, 19543, 19544, 19547, 19541, 19548, 19564, 19541, 19533, 19531, 19544, 19538, 19548, 19548, 19529, 19576, 19529, 19538, 19562, 19536, 19550, 19579, 19541, 19542, 19546, 19538, 19479, 19533, 19540, 19529, 8944, -11972, 15596, 19576, 19543, 19549, 19531, 19542, 19536, 19549, 19572, 19544, 19543, 19536, 19551, 19548, 19530, 19533, 19479, 19521, 19540, 19541, -12870, -9206, 11209, 7257, -10751, 6353, 19558, 19542, 19529, 19533, 3203, -11909, -11916, -11919, -11912, -18918, 17019, -29390, -23276, -23956, -16623};

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f20559;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f20560;

    /* JADX WARN: Code duplicated, block: B:17:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0143 A[PHI: r3 r4 r7
      0x0143: PHI (r3v4 java.lang.String[]) = (r3v2 java.lang.String[]), (r3v3 java.lang.String[]), (r3v2 java.lang.String[]) binds: [B:36:0x0141, B:28:0x00f8, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:36:0x0141, B:28:0x00f8, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r7v4 short[]) = (r7v2 short[]), (r7v3 short[]), (r7v2 short[]) binds: [B:36:0x0141, B:28:0x00f8, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x01a6 A[PHI: r1
      0x01a6: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v2 java.lang.String) binds: [B:44:0x01a4, B:9:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x021a A[PHI: r11 r12 r13
      0x021a: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:52:0x0218, B:18:0x00ac, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:52:0x0218, B:18:0x00ac, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:52:0x0218, B:18:0x00ac, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02a5 A[PHI: r2 r5 r6 r8 r9 r15 r16 r17 r18 r23
      0x02a5: PHI (r2v4 java.lang.String) = 
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r18v15 short) = (r18v2 short), (r18v6 short), (r18v7 short), (r18v9 short), (r18v2 short), (r18v2 short) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r23v8 int) = (r23v3 int), (r23v3 int), (r23v3 int), (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:90:0x02a5, B:66:0x02a3, B:60:0x027b, B:57:0x0250, B:32:0x011c, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        int i;
        int iM11306;
        int i2;
        int i3 = C2788.f10625;
        int i4 = RunnableC3388.f12514;
        int iM11307 = (i3 - ThreadFactoryC3888.m11306("ۡ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i5 = ((iM11307 ^ i4) * (-7875)) ^ 1081311159;
        String strM1588 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ 55265587;
        int iM45029 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 663988719;
        int i14 = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i15 = 0;
        String strM41569 = null;
        String strM5502 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-29869)) >> 31));
            switch (i13) {
                case -1915446875:
                case 2123524684:
                    iM45029 = C19806.m45029(strM1588);
                    i7 = 2122774098;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-5491)) ^ (-1135930341);
                        i2 = -210415162;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i3) * 43;
                        i = ((iM11306 ^ i4) * 5161) ^ (-1028668125);
                        i2 = -309810483;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1843955178:
                case 1748004935:
                    s = sArr[c];
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-5491)) ^ (-1135930341);
                        i2 = -210415162;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۤ᩷")) * 87;
                        i = ((iM11306 ^ i4) * 31099) ^ 1503489215;
                        i2 = -324915281;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1809859155:
                case -1036199839:
                    i15 = 53533;
                    iM11306 = (i4 - C19806.m45029("ܰܰ")) * q.h;
                    i = ((iM11306 ^ i3) * 31965) ^ (-1671657595);
                    i2 = 1725832178;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1713247089:
                case 1836402235:
                    C1189.m4368();
                    if (C3660.m10791() == 0) {
                        iM11306 = (i4 - C19806.m45029("ܽ֫")) * 119;
                        i = ((iM11306 ^ i3) * 24045) ^ 1028700405;
                        i2 = 697802961;
                    } else {
                        iM11306 = C19806.m45029("᩹֫") ^ i3;
                        i = ((iM11306 ^ i4) * (-12519)) ^ (-1086543354);
                        i2 = 100070063;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1585366253:
                case -1228843008:
                    return C0278.m1786(ThreadFactoryC3888.m11306(C0216.m1588(sArr2, i8, i9, i15)) ^ 2127819945, strArr);
                case -1373686135:
                case -1007150315:
                    i15 = 44978;
                    iM11306 = (i4 - C19806.m45029("ܰܰ")) * q.h;
                    i = ((iM11306 ^ i3) * 31965) ^ (-1671657595);
                    i2 = 1725832178;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1001602201:
                case 825995937:
                    i8 = 101;
                    i9 = 3;
                    if (C2642.m8171() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-5491)) ^ (-1135930341);
                        i2 = -210415162;
                    } else {
                        iM11306 = C19806.m45029("᩺֨") ^ i4;
                        i = ((iM11306 ^ i3) * 10901) ^ 254753792;
                        i2 = 683840465;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -964292625:
                case 1882899919:
                    short s2 = s;
                    sArr = f20558;
                    c = ']';
                    if (C1377.m4833() != 0) {
                        s = s2;
                        iM11306 = ThreadFactoryC3888.m11306("ܿ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-5491)) ^ (-1135930341);
                        i2 = -210415162;
                        i6 = iM11306 ^ i2;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ᩳۚ") ^ i4;
                        i = ((iM11308 ^ i3) * (-31077)) ^ 211907083;
                        s = s2;
                        i6 = iM11308 ^ 202682734;
                    }
                    i5 = i;
                    break;
                case -885186112:
                case 734750796:
                    C1977.m6356();
                    if (C0817.m3399()) {
                        iM11306 = (i4 - C19806.m45029("ܽ֫")) * 119;
                        i = ((iM11306 ^ i3) * 24045) ^ 1028700405;
                        i2 = 697802961;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵ۖ")) * (-103);
                        i = ((iM11306 ^ i4) * 5585) ^ (-240719297);
                        i2 = 137671152;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -803528149:
                case 1777105902:
                    AbstractC0464.m2313();
                    if (C1025.f4800 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ܽ֫")) * 119;
                        i = ((iM11306 ^ i3) * 24045) ^ 1028700405;
                        i2 = 697802961;
                    } else {
                        iM11306 = C19806.m45029("ܿۨ") ^ i3;
                        i = ((iM11306 ^ i4) * 31295) ^ 1956950700;
                        i2 = 517155999;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -434573123:
                case 683562256:
                    C3743.m10966();
                    return null;
                case -369876377:
                case 1194727528:
                    strM41569 = m41569(strM5502);
                    sArr3 = f20558;
                    if (RunnableC0195.m1431()) {
                        int iM450210 = (C19806.m45029("ܰ᩷") ^ i3) * 29;
                        i5 = ((iM450210 ^ i4) * (-18221)) ^ (-694508830);
                        i6 = iM450210 ^ (-716736616);
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-5491)) ^ (-1135930341);
                        i2 = -210415162;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case -335205119:
                case -289455883:
                    strM1588 = C0216.m1588(sArr3, 98, 3, i15);
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ܿۨ") ^ i3;
                        i = ((iM11306 ^ i4) * 31295) ^ 1956950700;
                        i2 = 517155999;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩹") ^ i4;
                        i = ((iM11306 ^ i3) * 1005) ^ (-363029604);
                        i2 = -527272653;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 57960052:
                case 217161377:
                    strArr = new String[]{strM41569, C1875.m6085(iM45029 ^ i7)};
                    sArr2 = f20558;
                    if (C3743.m10966() <= 0) {
                        iM11306 = C19806.m45029("ܿۨ") ^ i3;
                        i = ((iM11306 ^ i4) * 31295) ^ 1956950700;
                        i2 = 517155999;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܳۚ")) * (-115);
                        i = ((iM11306 ^ i3) * (-25749)) ^ 120411804;
                        i2 = 885067513;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 428104381:
                case 1059651198:
                    i10 = i14 * i14;
                    i11 = s * s;
                    i12 = 297838564;
                    if (C0797.f3386) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵ۖ")) * (-103);
                        i = ((iM11306 ^ i4) * 5585) ^ (-240719297);
                        i2 = 137671152;
                    } else {
                        iM11306 = (C19806.m45029("۫ᩳ") + i4) * (-23);
                        i = ((iM11306 ^ i3) * 5319) ^ 1838872494;
                        i2 = 1332641390;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1088137137:
                case 1285474965:
                    strM5502 = CallableC1627.m5502(f20558, 94, 4, i15);
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("᩹֫") ^ i3;
                        i = ((iM11306 ^ i4) * (-12519)) ^ (-1086543354);
                        i2 = 100070063;
                    } else {
                        iM11306 = C19806.m45029("۠ۤ") ^ i3;
                        i = ((iM11306 ^ i4) * 1497) ^ (-1450305942);
                        i2 = -1831326022;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1286032971:
                case 1598167018:
                    short s3 = s;
                    int i16 = s3 + 17258;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        s = s3;
                        i14 = i16;
                        iM11306 = ThreadFactoryC3888.m11306("ܿ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-5491)) ^ (-1135930341);
                        i2 = -210415162;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM450211 = C19806.m45029("ۚܰ") ^ i3;
                        i5 = ((iM450211 ^ i4) * (-27309)) ^ (-183412370);
                        i14 = i16;
                        i6 = iM450211 ^ (-356069570);
                        s = s3;
                    }
                    break;
                case 1536348054:
                case 1649550174:
                    RunnableC1564.m5345();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵ۖ")) * (-103);
                    i = ((iM11306 ^ i4) * 5585) ^ (-240719297);
                    i2 = 137671152;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i17 = i11 + i12;
                    if ((i17 + i17) - i10 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۜ") + i4) * (-25);
                        i = ((iM11306 ^ i3) * (-15129)) ^ (-1689207649);
                        i2 = 1408056322;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") ^ i3) * (-37);
                        i = ((iM11306 ^ i4) * 6983) ^ 947921658;
                        i2 = -682035520;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    public C6057() {
        ArrayList arrayList = null;
        int i = 1021300268;
        int i2 = C2477.f9839;
        int i3 = C1668.f6641;
        int iM11306 = ThreadFactoryC3888.m11306("ܺ۟") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-15663)) ^ 615168903;
        int i5 = -1598421839;
        while (true) {
            i = ((((i ^ i2) * 31111) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1756663427:
                case -474774335:
                    C1461.m5080();
                    if (ThreadFactoryC3888.m11300() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31615)) ^ 1794738834;
                        i5 = -772795698;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21323) ^ 75093284;
                        i5 = -1439029352;
                    }
                    break;
                case -1597769219:
                case 1733041815:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("۠᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11003)) ^ (-1635670721);
                        i5 = 1959364552;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28233) ^ 917859364;
                        i5 = 1381461114;
                    }
                    break;
                case -1581128403:
                case -525293885:
                    if (C1025.m3861() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21323) ^ 75093284;
                        i5 = -1439029352;
                    } else {
                        iM11306 = C19806.m45029("᩶᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19325)) ^ 1880485506;
                        i5 = -1700423218;
                    }
                    break;
                case -1485766684:
                case 626319565:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31615)) ^ 1794738834;
                        i5 = -772795698;
                    } else {
                        iM11306 = (C19806.m45029("᩹᩸") ^ i2) * 51;
                        i4 = ((iM11306 ^ i3) * 24427) ^ 843502368;
                        i5 = -1573113875;
                    }
                    break;
                case -1456743021:
                case -110706612:
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31615)) ^ 1794738834;
                        i5 = -772795698;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩸ۛ")) * 119;
                        i4 = ((iM11306 ^ i2) * 25095) ^ 1180772580;
                        i5 = 801829146;
                    }
                    break;
                case -1269573224:
                case 935333579:
                    arrayList = new ArrayList();
                    if (C10634.m26820()) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31615)) ^ 1794738834;
                        i5 = -772795698;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܽۙ")) * (-37);
                        i4 = ((iM11306 ^ i3) * 6585) ^ 296563237;
                        i5 = -339196445;
                    }
                    break;
                case -1265714682:
                case 232536978:
                    C0050.m946();
                    C3286.m9798();
                    iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i2;
                    i4 = ((iM11306 ^ i3) * 21323) ^ 75093284;
                    i5 = -1439029352;
                    break;
                case -1220269220:
                case 1198101502:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("۠᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11003)) ^ (-1635670721);
                        i5 = 1959364552;
                    } else {
                        iM11306 = C19806.m45029("ۙᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18413)) ^ (-1378223888);
                        i5 = -1828017724;
                    }
                    break;
                case -986880695:
                case -962562712:
                    if (C1419.m4973()) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31615)) ^ 1794738834;
                        i5 = -772795698;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7409) ^ (-1553775825);
                        i5 = -652591876;
                    }
                    break;
                case -954133279:
                case -636757132:
                    C3722.m10894();
                    C2788.m8472();
                    throw new RuntimeException();
                case -482655856:
                case 1608186481:
                    if (C1668.m5583()) {
                        iM11306 = C19806.m45029("ۡ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13763)) ^ (-879964456);
                        i5 = 806026447;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21323) ^ 75093284;
                        i5 = -1439029352;
                    }
                    break;
                case -130509586:
                case 204457466:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("۫ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20673)) ^ 1761145685;
                        i5 = -1823047789;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19811)) ^ (-2055700602);
                        i5 = 1194011271;
                    }
                    break;
                case 65493308:
                case 299647112:
                    if (CallableC1627.f6528) {
                        iM11306 = (C19806.m45029("ۜۚ") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-12691)) ^ (-1947286903);
                        i5 = -1892998777;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31615)) ^ 1794738834;
                        i5 = -772795698;
                    }
                    break;
                case 70012487:
                case 1943896148:
                    this.f20560 = arrayList;
                    return;
                case 583216805:
                case 1696677969:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31615)) ^ 1794738834;
                        i5 = -772795698;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۡ") ^ i3) * 65;
                        i4 = ((iM11306 ^ i2) * (-20569)) ^ (-1847238176);
                        i5 = 1742350826;
                    }
                    break;
                default:
                    C1377.m4833();
                    if (C1377.m4833() == 0) {
                        iM11306 = C19806.m45029("۠᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11003)) ^ (-1635670721);
                        i5 = 1959364552;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 21323) ^ 75093284;
                        i5 = -1439029352;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5722;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d1 A[PHI: r7
      0x01d1: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:53:0x01cf, B:19:0x009d, B:16:0x0081, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0224 A[PHI: r3 r5 r6 r9 r14 r15
      0x0224: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:61:0x0222, B:57:0x0205, B:45:0x018b, B:30:0x00f6, B:9:0x005d, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:61:0x0222, B:57:0x0205, B:45:0x018b, B:30:0x00f6, B:9:0x005d, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:61:0x0222, B:57:0x0205, B:45:0x018b, B:30:0x00f6, B:9:0x005d, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:61:0x0222, B:57:0x0205, B:45:0x018b, B:30:0x00f6, B:9:0x005d, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v5 short[]) binds: [B:61:0x0222, B:57:0x0205, B:45:0x018b, B:30:0x00f6, B:9:0x005d, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v5 int) binds: [B:61:0x0222, B:57:0x0205, B:45:0x018b, B:30:0x00f6, B:9:0x005d, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0254 A[PHI: r2 r8 r11 r12 r13 r20
      0x0254: PHI (r2v3 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v5 int) binds: [B:65:0x0252, B:49:0x01ad, B:34:0x0118, B:26:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:65:0x0252, B:49:0x01ad, B:34:0x0118, B:26:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:65:0x0252, B:49:0x01ad, B:34:0x0118, B:26:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:65:0x0252, B:49:0x01ad, B:34:0x0118, B:26:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:65:0x0252, B:49:0x01ad, B:34:0x0118, B:26:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:65:0x0252, B:49:0x01ad, B:34:0x0118, B:26:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM45029;
        int i;
        int i2;
        int i3 = C1937.f7317;
        int i4 = ThreadFactoryC3888.f14547;
        int iM450210 = C19806.m45029("ܿۘ") ^ i3;
        int i5 = ((iM450210 ^ i4) * 6011) ^ (-574361053);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM450210 ^ 434928795;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 639492074;
        String strM3406 = null;
        int iM450211 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-30237)) >> 31));
            switch (i13) {
                case -1776509744:
                case 1955924454:
                    i9 = 26697;
                    iM45029 = C19806.m45029("ܺ᩷") ^ i4;
                    i = ((iM45029 ^ i3) * 11283) ^ (-1602899139);
                    i2 = 774616320;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1733357551:
                case -510631042:
                    C0216.m1581(this, C0629.m2906(sArr3, i12, 3, i9));
                    break;
                case -1620756549:
                case -82917832:
                    strM3406 = C0817.m3406(sArr2, i10, i11, i9);
                    if (C1461.m5080()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-22583)) ^ 204671452;
                        i2 = -1248996922;
                    } else {
                        iM45029 = C19806.m45029("᩶ۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 16075) ^ (-646578455);
                        i2 = -483115956;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1538250889:
                case -863960958:
                    i9 = 44663;
                    iM45029 = C19806.m45029("ܺ᩷") ^ i4;
                    i = ((iM45029 ^ i3) * 11283) ^ (-1602899139);
                    i2 = 774616320;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1433598334:
                case -996209653:
                    int i14 = s + s2;
                    if ((i14 * i14) - i8 >= 0) {
                        iM45029 = C19806.m45029("ۤ۠") ^ i3;
                        i = ((iM45029 ^ i4) * 20727) ^ (-2054140234);
                        i2 = 1340903014;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ܳ") + i4) * (-75);
                        i = ((iM45029 ^ i3) * (-20309)) ^ (-374421445);
                        i2 = 972599450;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1269717448:
                case 2018035065:
                    sArr2 = f20558;
                    i10 = 1;
                    i11 = 3;
                    if (C1189.m4368() <= 0) {
                        iM45029 = C19806.m45029("᩷ۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 26407) ^ (-1025520615);
                        i2 = 316081915;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۛ") ^ i3;
                        i = ((iM45029 ^ i4) * 3067) ^ (-608240488);
                        i2 = 280122717;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -970800256:
                case 834970978:
                    i7 = s * 2;
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (C19806.m45029("ۛ᩺") ^ i3) * (-25);
                        i = ((iM45029 ^ i4) * (-8555)) ^ (-1064627344);
                        i2 = -93867919;
                    } else {
                        iM45029 = C19806.m45029("ۡ᩹") ^ i3;
                        i = ((iM45029 ^ i4) * 5777) ^ (-1039423575);
                        i2 = -1440788520;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -930704699:
                case 1074190556:
                    C2477.m7593();
                    C3660.m10791();
                    iM45029 = (C19806.m45029("ۛ᩺") ^ i3) * (-25);
                    i = ((iM45029 ^ i4) * (-8555)) ^ (-1064627344);
                    i2 = -93867919;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -731311947:
                case 143356426:
                    iM450211 = 2122704898 ^ C19806.m45029(strM3406);
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("᩺ۡ") ^ i4;
                        i = ((iM45029 ^ i3) * (-17619)) ^ (-905288247);
                        i2 = -1298684233;
                    } else {
                        iM45029 = C19806.m45029("᩷ۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 26407) ^ (-1025520615);
                        i2 = 316081915;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -714154538:
                case 1580288947:
                    RunnableC1895.m6170();
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ۛ᩺") ^ i3) * (-25);
                        i = ((iM45029 ^ i4) * (-8555)) ^ (-1064627344);
                        i2 = -93867919;
                    } else {
                        iM45029 = C19806.m45029("ܶ᩺") ^ i4;
                        i = ((iM45029 ^ i3) * (-21861)) ^ (-1442362630);
                        i2 = 433690161;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -461802313:
                case -200797110:
                    s = sArr[c];
                    if (C0797.m3359()) {
                        iM45029 = (C19806.m45029("ۤۜ") + i4) * (-75);
                        i = ((iM45029 ^ i3) * (-3525)) ^ 1258718361;
                        i2 = -2125374258;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-22583)) ^ 204671452;
                        i2 = -1248996922;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -276298188:
                case 1337648689:
                    if (C1460.f5948 < 0) {
                        iM45029 = (C19806.m45029("ۛ᩺") ^ i3) * (-25);
                        i = ((iM45029 ^ i4) * (-8555)) ^ (-1064627344);
                        i2 = -93867919;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨۜ")) * (-33);
                        i = ((iM45029 ^ i4) * (-21493)) ^ (-2144943016);
                        i2 = 1415039650;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -229577073:
                case 1791681308:
                    sArr = f20558;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ᩳ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 11383) ^ (-1354374214);
                        i2 = -2131103048;
                    } else {
                        iM45029 = C19806.m45029("᩷ۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 26407) ^ (-1025520615);
                        i2 = 316081915;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -137137024:
                case 1799798363:
                    c = 0;
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-22583)) ^ 204671452;
                        i2 = -1248996922;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-17555)) ^ (-1544266422);
                        i2 = -1570029036;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 15957711:
                case 347218429:
                    C0278.m1789();
                    break;
                case 109425687:
                case 2115842042:
                    s2 = 1;
                    if (C1377.f5749) {
                        iM45029 = (i4 - C19806.m45029("ܳ᩹")) * (-13);
                        i = ((iM45029 ^ i3) * 1863) ^ (-1984822872);
                        i2 = 1482794801;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-22583)) ^ 204671452;
                        i2 = -1248996922;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 895618757:
                case 1101255949:
                    i8 = i7 + 1;
                    if (RunnableC0195.m1431()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩻") + i3) * (-51);
                        i = ((iM45029 ^ i4) * (-20439)) ^ (-91918195);
                        i2 = 1993791902;
                    } else {
                        iM45029 = C19806.m45029("᩷ۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 26407) ^ (-1025520615);
                        i2 = 316081915;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 971420611:
                case 1152890812:
                    C0629.m2907();
                    if (C0050.f912 > 0) {
                        iM45029 = C19806.m45029("ܶ᩺") ^ i4;
                        i = ((iM45029 ^ i3) * (-21861)) ^ (-1442362630);
                        i2 = 433690161;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-22583)) ^ 204671452;
                        i2 = -1248996922;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1377.m4841(this, iM450211);
                    sArr3 = f20558;
                    i12 = 4;
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i3;
                        i = ((iM45029 ^ i4) * (-22583)) ^ 204671452;
                        i2 = -1248996922;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛᩴ") ^ i4) * (-117);
                        i = ((iM45029 ^ i3) * 29853) ^ 790998213;
                        i2 = 473811022;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        Iterator itM10563 = null;
        AbstractC20745 abstractC20745 = null;
        int i = 418416016;
        int i2 = C2788.f10625;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11306 = ThreadFactoryC3888.m11306("ۙᩴ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-14571)) ^ 1509514183;
        int i5 = -1450135076;
        while (true) {
            i = ((((i ^ i3) * (-20109)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2142489680:
                case 1791098708:
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24567)) ^ (-454674694);
                        i5 = 1339776700;
                    } else {
                        iM11306 = (C19806.m45029("֨ᩴ") + i3) * (-87);
                        i4 = ((iM11306 ^ i2) * 25201) ^ 603481318;
                        i5 = -869874857;
                    }
                    break;
                case -2074404467:
                case -1813496090:
                    C2249.m6915();
                    RunnableC1895.m6170();
                    break;
                case -1986717605:
                case -687168035:
                    C1377.m4833();
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("۠ۗ") + i2) * (-87);
                        i4 = ((iM11306 ^ i3) * (-871)) ^ 1637135256;
                        i5 = -1632856161;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۫ۤ")) * (-69);
                        i4 = ((iM11306 ^ i3) * (-10915)) ^ (-1991666496);
                        i5 = -1747923122;
                    }
                    break;
                case -1744768182:
                case 1569786831:
                    itM10563 = C3577.m10563(this.f20560);
                    iM11306 = (ThreadFactoryC3888.m11306("᩸۠") ^ i2) * (-29);
                    i4 = ((iM11306 ^ i3) * (-9115)) ^ (-710710654);
                    i5 = -463774476;
                    break;
                case -1612675799:
                case -1386254312:
                    abstractC20745 = this.f20559;
                    if (abstractC20745 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩸") ^ i3) * 47;
                        i4 = ((iM11306 ^ i2) * 19651) ^ (-2060669901);
                        i5 = 719863059;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13509)) ^ 1795881206;
                        i5 = -2005083531;
                    }
                    break;
                case -1380168479:
                case 542400910:
                    if (C0962.m3748(itM10563)) {
                        iM11306 = (C19806.m45029("ۖ᩺") ^ i3) * 65;
                        i4 = ((iM11306 ^ i2) * (-23085)) ^ 641871235;
                        i5 = -440584151;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨܽ") ^ i2) * (-53);
                        i4 = ((iM11306 ^ i3) * 26787) ^ (-86667228);
                        i5 = 2089341;
                    }
                    break;
                case -1315557907:
                case 1939620452:
                    if (C3535.m10431() <= 0) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24567)) ^ (-454674694);
                        i5 = 1339776700;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5655) ^ 1916643031;
                        i5 = -922082525;
                    }
                    break;
                case -1246666596:
                case 697437230:
                    C1148.m4233();
                    break;
                case -1227872385:
                case 783492340:
                    if (C3660.m10791() != 0) {
                        iM11306 = (C19806.m45029("۠ۗ") + i2) * (-87);
                        i4 = ((iM11306 ^ i3) * (-871)) ^ 1637135256;
                        i5 = -1632856161;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۜۧ")) * (-31);
                        i4 = ((iM11306 ^ i2) * (-12499)) ^ 1272688034;
                        i5 = -72960644;
                    }
                    break;
                case -1191862181:
                case 1622597670:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13509)) ^ 1795881206;
                        i5 = -2005083531;
                    } else {
                        iM11306 = C19806.m45029("ܶۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31279)) ^ (-498096682);
                        i5 = -468100103;
                    }
                    break;
                case -1056534015:
                case 1734389037:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24567)) ^ (-454674694);
                        i5 = 1339776700;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܺ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-1779)) ^ (-430999894);
                        i5 = -1422986571;
                    }
                    break;
                case -1053925312:
                case 110970912:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("۠ۗ") + i2) * (-87);
                        i4 = ((iM11306 ^ i3) * (-871)) ^ 1637135256;
                        i5 = -1632856161;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܺ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-1779)) ^ (-430999894);
                        i5 = -1422986571;
                    }
                    break;
                case -739840718:
                case 963697515:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ܺ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6327)) ^ (-1729432241);
                        i5 = 624208285;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܺ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-1779)) ^ (-430999894);
                        i5 = -1422986571;
                    }
                    break;
                case -728936992:
                case -612673065:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܺ") ^ i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-1779)) ^ (-430999894);
                        i5 = -1422986571;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܺܶ")) * (-105);
                        i4 = ((iM11306 ^ i3) * (-9993)) ^ 2043146520;
                        i5 = -139418967;
                    }
                    break;
                case -718280758:
                case 629933828:
                    C1461.m5080();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = (ThreadFactoryC3888.m11306("ۘܺ") ^ i3) * (-125);
                    i4 = ((iM11306 ^ i2) * (-1779)) ^ (-430999894);
                    i5 = -1422986571;
                    break;
                case -622365916:
                case 1819451023:
                    if (RunnableC1564.m5345()) {
                        iM11306 = (C19806.m45029("۠ۗ") + i2) * (-87);
                        i4 = ((iM11306 ^ i3) * (-871)) ^ 1637135256;
                        i5 = -1632856161;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܿᩴ")) * (-93);
                        i4 = ((iM11306 ^ i3) * (-4481)) ^ 1981973119;
                        i5 = -1111952760;
                    }
                    break;
                case -618593164:
                case 1746207184:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4177)) ^ 136218036;
                        i5 = 101245314;
                    } else {
                        iM11306 = C19806.m45029("ۘۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24567)) ^ (-454674694);
                        i5 = 1339776700;
                    }
                    break;
                case -180939669:
                case 1051409028:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩳ᩵")) * (-103);
                        i4 = ((iM11306 ^ i2) * (-28321)) ^ (-1411396473);
                        i5 = 1390245524;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۟") ^ i2) * (-25);
                        i4 = ((iM11306 ^ i3) * (-6813)) ^ 1540307165;
                        i5 = 1857949858;
                    }
                    break;
                case 1493989776:
                case 2042942236:
                    RunnableC3388.m10052(abstractC20745);
                    iM11306 = ThreadFactoryC3888.m11306("᩸ۤ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-13509)) ^ 1795881206;
                    i5 = -2005083531;
                    break;
                case 1743804870:
                case 1963388204:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩳ᩵")) * (-103);
                        i4 = ((iM11306 ^ i2) * (-28321)) ^ (-1411396473);
                        i5 = 1390245524;
                    } else {
                        iM11306 = (C19806.m45029("ۡܽ") + i3) * (-65);
                        i4 = ((iM11306 ^ i2) * 30911) ^ 1940978724;
                        i5 = -600280470;
                    }
                    break;
                case 1824461294:
                case 2138184094:
                    RunnableC3388.m10052((AbstractC20745) C0278.m1776(itM10563));
                    iM11306 = (ThreadFactoryC3888.m11306("᩸۠") ^ i2) * (-29);
                    i4 = ((iM11306 ^ i3) * (-9115)) ^ (-710710654);
                    i5 = -463774476;
                    break;
                default:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24567)) ^ (-454674694);
                        i5 = 1339776700;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * SecP160R2Field.PInv33) ^ (-1072228002);
                        i5 = -1502460156;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 117241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final l.C5202 mo3077() {
        /*
            Method dump skipped, instruction units count: 11724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6057.mo3077():l.ۚ۟ۜ");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        int i = -1113978927;
        int i2 = C0629.f2722;
        int i3 = C1461.f5957;
        int iM45029 = C19806.m45029("ۜ᩵") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-8653)) ^ (-866534522);
        int i5 = 187418785;
        while (true) {
            i = ((((i ^ i2) * 19631) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2042819359:
                case -1765035058:
                    C2642.m8171();
                    C1377.m4833();
                    iM45029 = (C19806.m45029("۬᩺") ^ i2) * 97;
                    i4 = ((iM45029 ^ i3) * (-22695)) ^ 1712590662;
                    i5 = -520499813;
                    break;
                case -1932915415:
                case -1405125310:
                    C19806.m45024();
                    if (C1066.f4915 > 0) {
                        iM45029 = C19806.m45029("ۗ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16049) ^ 1579882204;
                        i5 = -564600890;
                    } else {
                        iM45029 = (C19806.m45029("۬᩺") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-22695)) ^ 1712590662;
                        i5 = -520499813;
                    }
                    break;
                case -1734242845:
                case -1613076288:
                    if (m41579(c11545)) {
                        iM45029 = (C19806.m45029("᩹᩺") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i2) * (-21969)) ^ (-1145008959);
                        i5 = -515267713;
                    } else {
                        iM45029 = C19806.m45029("ܿᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22261)) ^ (-1615820100);
                        i5 = -1472031580;
                    }
                    break;
                case -1671328379:
                case -225104348:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("֨᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3979) ^ (-1056784300);
                        i5 = 556015809;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܿ") ^ i2) * (-79);
                        i4 = ((iM45029 ^ i3) * (-6809)) ^ 1412985973;
                        i5 = -644486261;
                    }
                    break;
                case -1565344278:
                case 168010473:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ۗ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16049) ^ 1579882204;
                        i5 = -564600890;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩻᩻")) * (-115);
                        i4 = ((iM45029 ^ i2) * 9727) ^ 1788796095;
                        i5 = -274191785;
                    }
                    break;
                case -1549263077:
                case 952148666:
                    C1066.m4028(c11545, C3743.m10959(this.f20559));
                    c11545.m28830();
                    iM45029 = C19806.m45029("ܿᩴ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-22261)) ^ (-1615820100);
                    i5 = -1472031580;
                    break;
                case -1549148752:
                case 861277138:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("֨᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3979) ^ (-1056784300);
                        i5 = 556015809;
                    } else {
                        iM45029 = C19806.m45029("ۛۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20607) ^ 1970719811;
                        i5 = -237687105;
                    }
                    break;
                case -1537613752:
                case -265858542:
                    break;
                case -1511114916:
                case 843790795:
                    if (C1148.m4232() > 0) {
                        iM45029 = C19806.m45029("ۙ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5727) ^ (-1795920005);
                        i5 = 994778311;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩷")) * 23;
                        i4 = ((iM45029 ^ i3) * (-7459)) ^ (-1928457649);
                        i5 = 846577406;
                    }
                    break;
                case -1374194965:
                case -654922043:
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("ۙ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5727) ^ (-1795920005);
                        i5 = 994778311;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ֨") + i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-28963)) ^ 203873169;
                        i5 = 789834387;
                    }
                    break;
                case -1109262319:
                case 475345430:
                    AbstractC0464.m2313();
                    break;
                case -1041456164:
                case 1108859836:
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("᩸ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20553) ^ (-1956394103);
                        i5 = -872866593;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩷")) * 23;
                        i4 = ((iM45029 ^ i3) * (-7459)) ^ (-1928457649);
                        i5 = 846577406;
                    }
                    break;
                case -661260425:
                case 726091229:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۙ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5727) ^ (-1795920005);
                        i5 = 994778311;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20045)) ^ (-910500149);
                        i5 = -86544842;
                    }
                    break;
                case -491117283:
                case -46271711:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM45029 = C19806.m45029("ۡ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27087)) ^ 818008972;
                        i5 = -1934272580;
                    } else {
                        iM45029 = C19806.m45029("ܿᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22261)) ^ (-1615820100);
                        i5 = -1472031580;
                    }
                    break;
                case -84636522:
                case 962307643:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("۬᩺") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-22695)) ^ 1712590662;
                        i5 = -520499813;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21887) ^ (-1878061233);
                        i5 = 1350069888;
                    }
                    break;
                case 29254279:
                case 1397627419:
                    if (C1148.m4232() <= 0) {
                        iM45029 = (C19806.m45029("۬᩺") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-22695)) ^ 1712590662;
                        i5 = -520499813;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24871)) ^ (-593746619);
                        i5 = -1006343483;
                    }
                    break;
                case 1121790182:
                case 1664012198:
                    if (C1419.f5860 < 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴ᩷")) * 23;
                        i4 = ((iM45029 ^ i3) * (-7459)) ^ (-1928457649);
                        i5 = 846577406;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16049) ^ 1579882204;
                        i5 = -564600890;
                    }
                    break;
                case 1125601687:
                case 1606763924:
                    if (C2871.m8646()) {
                        iM45029 = (i2 - C19806.m45029("ܺ۟")) * (-75);
                        i4 = ((iM45029 ^ i3) * (-12359)) ^ 993811928;
                        i5 = 1794393244;
                    } else {
                        iM45029 = C19806.m45029("֨᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3979) ^ (-1056784300);
                        i5 = 556015809;
                    }
                    break;
                default:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۙ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5727) ^ (-1795920005);
                        i5 = 994778311;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۨ")) * 79;
                        i4 = ((iM45029 ^ i2) * 21145) ^ (-1614891706);
                        i5 = 81846126;
                    }
                    break;
            }
            return;
        }
    }
}
