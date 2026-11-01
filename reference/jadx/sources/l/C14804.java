package l;

import android.content.SharedPreferences;
import bin.mt.json.JSONArray;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;

/* JADX INFO: renamed from: l.ܳ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S3XU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14804 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48396 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5204 f48397;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5204 f48398;

    /* JADX INFO: renamed from: ᩳ᩹ۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f48399 = {2643, 25443, 25412, 25436, 25419, 25414, 25411, 25422, 25354, 25433, 25423, 25438, 25438, 25411, 25412, 25421, 25433, 25354, 25419, 25416, 25433, 25423, 25412, 25417, 25423, 25354, 25416, 25414, 25413, 25417, 25409, 25354, 25433, 25411, 25424, 25423, 1479, 1546, 1542, 1540, 1561, 1564, 1565, 1548, 1568, 1551, 1576, 1547, 1562, 1548, 1543, 1565, 1601, 1607, 1607, 1607, 1600, 9094, -18663, -30703, -18535, -9529, -9531, -9516, -9494, -9485, -9489, -9490, -9503, -9518, -9518, -9535, -9511, -9592, -9586, -9586, -9586, -9591, -9584, -9583, -9529, -9531, -9516, -9494, -9485, -9489, -9490, -9489, -9534, -9526, -9531, -9533, -9516, -9592, -9586, -9586, -9586, -9591, -9580, -9581, -9582, -9522, -9531, -9512, -9516, -9592, -9586, -9586, -9586, -9591, -9527, -9516, -9531, -9518, -9535, -9516, -9521, -9518, -9592, -9586, -9586, -9586, -9591, -9534, -9535, -9533, -9525, -9515, -9520, -9587, -9572, -9529, -9531, -9516, -9587, -9514, -9535, -9524, -9515, -9531, -9517, -9570, -9592, -9586, -9586, -9586, -9591, -9524, -9527, -9517, -9516, -9498, -9527, -9524, -9531, -9517, -9592, -9586, -9586, -9586, -9591, 482, 24902, 24897, 24902, 24904, 24906, 24923, 24941, 24918, 24923, 24906, 24924, 24839, 24833, 24833, 24833, 24838, 24954, 24897, 24924, 24922, 24927, 24927, 24896, 24925, 24923, 24906, 24907, 24847, 24927, 24925, 24906, 24905, 24906, 24925, 24906, 24897, 24908, 24906, 24847, 24923, 24918, 24927, 24906, 24853, 24847, 24898, 24902, 24897, 24902, 24940, 24903, 24906, 24908, 24900, 24847, 24905, 24910, 24902, 24899, 24906, 24907, 24833, 6670, 3559, 12350, 1882, 15677, 12185, 24902, 24923, 24906, 24925, 24910, 24923, 24896, 24925, 24839, 24833, 24833, 24833, 24838, 24897, 24906, 24919, 24923, 24839, 24833, 24833, 24833, 24838, 9860, 31754, 31789, 31797, 31778, 31791, 31786, 31783, 31843, 31792, 31782, 31799, 31799, 31786, 31789, 31780, 31792, 31843, 31778, 31777, 31792, 31782, 31789, 31776, 31782, 31843, 31777, 31786, 31799, 31790, 31778, 31795, 31843, 31792, 31786, 31801, 31782, 9764, 24329, 24336, 24406, 24379, 24340, 24325, 24336, 24332, 24395, 24343, 24320, 24327, 24325, 24342, 24320, 24395, 24361, 24368, 24406};

    /* JADX WARN: Code duplicated, block: B:32:0x00d8 A[PHI: r7
      0x00d8: PHI (r7v26 long) = (r7v24 long), (r7v1 long) binds: [B:30:0x00bf, B:22:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0262 A[PHI: r12 r13 r19 r22
      0x0262: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:66:0x0260, B:62:0x0242, B:54:0x01f8, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r13v3 short) = (r13v1 short), (r13v1 short), (r13v2 short), (r13v1 short) binds: [B:66:0x0260, B:62:0x0242, B:54:0x01f8, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r19v6 short[]) = (r19v4 short[]), (r19v5 short[]), (r19v4 short[]), (r19v4 short[]) binds: [B:66:0x0260, B:62:0x0242, B:54:0x01f8, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r22v26 long) = (r22v2 long), (r22v3 long), (r22v5 long), (r22v27 long) binds: [B:66:0x0260, B:62:0x0242, B:54:0x01f8, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0297 A[PHI: r2 r10 r11 r20 r22
      0x0297: PHI (r2v5 long) = (r2v1 long), (r2v1 long), (r2v7 long) binds: [B:70:0x0295, B:58:0x021d, B:40:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r10v5 short) = (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:70:0x0295, B:58:0x021d, B:40:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r11v5 short) = (r11v1 short), (r11v2 short), (r11v1 short) binds: [B:70:0x0295, B:58:0x021d, B:40:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r20v4 long) = (r20v1 long), (r20v1 long), (r20v6 long) binds: [B:70:0x0295, B:58:0x021d, B:40:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r22v31 long) = (r22v1 long), (r22v4 long), (r22v32 long) binds: [B:70:0x0295, B:58:0x021d, B:40:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) goto L8;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m35476(int r25, int r26, l.C17367 r27) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14804.m35476(int, int, l.ܿ۬ۨ):byte[]");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01d4 A[PHI: r5 r9 r17
      0x01d4: PHI (r5v3 java.util.function.Function) = (r5v2 java.util.function.Function), (r5v4 java.util.function.Function) binds: [B:56:0x01d2, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:56:0x01d2, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r17v17 int) = (r17v10 int), (r17v18 int) binds: [B:56:0x01d2, B:38:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13308 m35470(LinkedHashMap linkedHashMap, String str) {
        int i;
        int iM45029;
        int i2;
        int i3;
        int i4;
        String str2 = null;
        Object objComputeIfAbsent = null;
        String strM10964 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        short s3 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 1682758929;
        int i9 = C2871.f10837;
        int i10 = C2249.f8050;
        int iM450210 = C19806.m45029("ۡܶ") ^ i10;
        int i11 = ((iM450210 ^ i9) * (-15763)) ^ (-1108168981);
        int i12 = iM450210 ^ 730118911;
        short[] sArr2 = null;
        while (true) {
            Function function = null;
            while (true) {
                i = i12 ^ (i11 & (((i8 ^ i9) * (-1241)) >> 31));
                switch (i) {
                    case -2045638693:
                    case 802465389:
                        i = i;
                        i6 = i5 + 1;
                        s3 = 1;
                        if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                            iM45029 = ThreadFactoryC3888.m11306("ۙܺ") ^ i9;
                            i2 = ((iM45029 ^ i10) * 6991) ^ (-86201731);
                            i3 = 520541933;
                        } else {
                            iM45029 = C19806.m45029("᩸ۜ") ^ i9;
                            i2 = ((iM45029 ^ i10) * (-29757)) ^ 936670455;
                            i3 = 2106980410;
                        }
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case -1785561699:
                    case 1144436710:
                        i = i;
                        final C20448 c20448 = new C20448(str);
                        if (C1461.f5957 > 0) {
                            function = new Function() { // from class: l.֡᩸᩺
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo33696andThen(Function function2) {
                                    return C4277.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function2) {
                                    return C4277.$default$compose(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    C20448 c20449 = null;
                                    int i13 = -676886801;
                                    int i14 = C1398.f5802;
                                    int i15 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
                                    int iM450211 = (i14 - C19806.m45029("ۗܿ")) * 61;
                                    int i16 = ((iM450211 ^ i15) * (-10451)) ^ (-1153176704);
                                    int i17 = 1370106617;
                                    while (true) {
                                        i13 = ((((i13 ^ i15) * (-17983)) >> 31) & i16) ^ (iM450211 ^ i17);
                                        switch (i13) {
                                            case -2061384521:
                                            case 1806758157:
                                                C3722.m10894();
                                                C3286.m9798();
                                                iM450211 = ThreadFactoryC3888.m11306("ܶۜ") ^ i14;
                                                i16 = ((iM450211 ^ i15) * 31603) ^ (-1828429931);
                                                i17 = -965790549;
                                                break;
                                            case -1961551442:
                                            case -1251015814:
                                                if (C10634.m26820()) {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 22201) ^ 839562386;
                                                    i17 = 1473056528;
                                                } else {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i15;
                                                    i16 = ((iM450211 ^ i14) * 5517) ^ (-631559389);
                                                    i17 = 1937652804;
                                                }
                                                break;
                                            case -1871570480:
                                            case 1801095046:
                                                return (C13308) c20449.invoke(obj);
                                            case -1383625729:
                                            case 1702623400:
                                                C19806.m45024();
                                                if (!C0817.f3443) {
                                                    iM450211 = (i15 - ThreadFactoryC3888.m11306("᩸ۤ")) * (-117);
                                                    i16 = ((iM450211 ^ i14) * (-8723)) ^ 1700792362;
                                                    i17 = 20967578;
                                                } else {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 22201) ^ 839562386;
                                                    i17 = 1473056528;
                                                }
                                                break;
                                            case -1273088951:
                                            case 2094587244:
                                                if (C1398.f5802 <= 0) {
                                                    iM450211 = (C19806.m45029("֫ᩳ") ^ i15) * (-17);
                                                    i16 = ((iM450211 ^ i14) * (-17433)) ^ (-172407436);
                                                    i17 = -774036008;
                                                } else {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܶۜ") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 31603) ^ (-1828429931);
                                                    i17 = -965790549;
                                                }
                                                break;
                                            case -1076208214:
                                            case 1560836578:
                                                if (RunnableC1895.m6170() != 0) {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܶۜ") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 31603) ^ (-1828429931);
                                                    i17 = -965790549;
                                                } else {
                                                    iM450211 = (i14 - ThreadFactoryC3888.m11306("ۚۘ")) * (-103);
                                                    i16 = ((iM450211 ^ i15) * (-16463)) ^ 1164641896;
                                                    i17 = 2138405967;
                                                }
                                                break;
                                            case -768595743:
                                            case -209430195:
                                                C1875.m6086();
                                                if (RunnableC0195.f1321 >= 0) {
                                                    iM450211 = (i15 - ThreadFactoryC3888.m11306("᩸ۤ")) * (-117);
                                                    i16 = ((iM450211 ^ i14) * (-8723)) ^ 1700792362;
                                                    i17 = 20967578;
                                                } else {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܶۜ") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 31603) ^ (-1828429931);
                                                    i17 = -965790549;
                                                }
                                                break;
                                            case -673498700:
                                            case -618168442:
                                                if (C2249.f8050 >= 0) {
                                                    iM450211 = (i15 - ThreadFactoryC3888.m11306("᩸ۤ")) * (-117);
                                                    i16 = ((iM450211 ^ i14) * (-8723)) ^ 1700792362;
                                                    i17 = 20967578;
                                                } else {
                                                    iM450211 = C19806.m45029("ۤۚ") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * (-32149)) ^ (-1580482807);
                                                    i17 = 1550577157;
                                                }
                                                break;
                                            case -443752972:
                                            case 1817770677:
                                                if (RunnableC3388.m10064()) {
                                                    iM450211 = (C19806.m45029("ᩴ۟") ^ i14) * 53;
                                                    i16 = ((iM450211 ^ i15) * 29789) ^ (-840539555);
                                                    i17 = 1593711860;
                                                } else {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 22201) ^ 839562386;
                                                    i17 = 1473056528;
                                                }
                                                break;
                                            case -310712528:
                                            case 1689972029:
                                                C0962.m3746();
                                                return null;
                                            case -215682798:
                                            case 309573592:
                                                if (C1461.m5080()) {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܶۜ") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 31603) ^ (-1828429931);
                                                    i17 = -965790549;
                                                } else {
                                                    iM450211 = C19806.m45029("۫ܳ") ^ i15;
                                                    i16 = ((iM450211 ^ i14) * (-5691)) ^ (-750427370);
                                                    i17 = -157528687;
                                                }
                                                break;
                                            case -205519146:
                                            case 1340200085:
                                                c20449 = c20448;
                                                if (C3743.f13569) {
                                                    iM450211 = ThreadFactoryC3888.m11306("᩶᩺") ^ i15;
                                                    i16 = ((iM450211 ^ i14) * (-14793)) ^ 786179280;
                                                    i17 = -650667385;
                                                } else {
                                                    iM450211 = (i15 - ThreadFactoryC3888.m11306("ܶۛ")) * (-59);
                                                    i16 = ((iM450211 ^ i14) * (-20249)) ^ (-1144707702);
                                                    i17 = 2040021198;
                                                }
                                                break;
                                            case -95814001:
                                            case 2004748174:
                                                if (C10634.f36300 >= 0) {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܶۜ") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 31603) ^ (-1828429931);
                                                    i17 = -965790549;
                                                } else {
                                                    iM450211 = (C19806.m45029("᩺ۗ") + i14) * (-77);
                                                    i16 = ((iM450211 ^ i15) * 27795) ^ 1706441160;
                                                    i17 = 1840540214;
                                                }
                                                break;
                                            case 279625047:
                                            case 1678884504:
                                                if (C3577.f13150 >= 0) {
                                                    iM450211 = (C19806.m45029("֫ᩳ") ^ i15) * (-17);
                                                    i16 = ((iM450211 ^ i14) * (-17433)) ^ (-172407436);
                                                    i17 = -774036008;
                                                } else {
                                                    iM450211 = ThreadFactoryC3888.m11306("֫ܶ") ^ i15;
                                                    i16 = ((iM450211 ^ i14) * (-3951)) ^ (-174911980);
                                                    i17 = 622756301;
                                                }
                                                break;
                                            case 380422330:
                                            case 976750737:
                                                if (C1025.f4800 >= 0) {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܶۜ") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 31603) ^ (-1828429931);
                                                    i17 = -965790549;
                                                } else {
                                                    iM450211 = (i14 - ThreadFactoryC3888.m11306("ۨܶ")) * (-59);
                                                    i16 = ((iM450211 ^ i15) * 11387) ^ (-386555221);
                                                    i17 = 1571707710;
                                                }
                                                break;
                                            default:
                                                if (C1377.f5749) {
                                                    iM450211 = C19806.m45029("ܿ۟") ^ i15;
                                                    i16 = ((iM450211 ^ i14) * (-8575)) ^ (-1923531556);
                                                    i17 = -1839114859;
                                                } else {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                                                    i16 = ((iM450211 ^ i15) * 22201) ^ 839562386;
                                                    i17 = 1473056528;
                                                }
                                                break;
                                        }
                                    }
                                }
                            };
                            if (C2124.f7782 <= 0) {
                                iM45029 = C19806.m45029("ܳܰ") ^ i10;
                                i2 = ((iM45029 ^ i9) * 11337) ^ (-1007222659);
                                i3 = 1615744459;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("ܺۛ") + i10) * (-59);
                                i2 = ((iM45029 ^ i9) * (-22407)) ^ 1782320548;
                                i3 = 1344553256;
                            }
                            i4 = i;
                            i12 = iM45029 ^ i3;
                            i11 = i2;
                            i8 = i4;
                        }
                        break;
                    case -1779483853:
                    case -118936301:
                        if (RunnableC3388.f12514 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۨۙ") + i10) * (-11);
                            i = i;
                            i2 = ((iM45029 ^ i9) * 1157) ^ (-1584095237);
                            i3 = 93472672;
                        } else {
                            i = i;
                            iM45029 = (i9 - ThreadFactoryC3888.m11306("ܶܽ")) * (-121);
                            i2 = ((iM45029 ^ i10) * (-3801)) ^ (-1157525950);
                            i3 = -1990090924;
                        }
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case -1754496939:
                    case 126488794:
                        i = i;
                        s = sArr2[c];
                        s2 = 2;
                        if (C0050.f912 > 0) {
                            iM45029 = (C19806.m45029("ۖ֨") ^ i10) * (-93);
                            i2 = ((iM45029 ^ i9) * 17191) ^ 1426135457;
                            i3 = 219195345;
                            i4 = i;
                            i12 = iM45029 ^ i3;
                            i11 = i2;
                            i8 = i4;
                        }
                        break;
                    case -1736219600:
                    case -565701571:
                        i = i;
                        c = '$';
                        if (!RunnableC1564.f6300) {
                            iM45029 = C19806.m45029("֫᩶") ^ i9;
                            i2 = ((iM45029 ^ i10) * 19895) ^ (-686934665);
                            i3 = 631003378;
                            i4 = i;
                            i12 = iM45029 ^ i3;
                            i11 = i2;
                            i8 = i4;
                        }
                        break;
                    case -1607599367:
                    case 1867256234:
                        if (C0526.m2437() >= 0) {
                            i = i;
                            iM45029 = ThreadFactoryC3888.m11306("ۙܺ") ^ i9;
                            i2 = ((iM45029 ^ i10) * 6991) ^ (-86201731);
                            i3 = 520541933;
                            i4 = i;
                            i12 = iM45029 ^ i3;
                            i11 = i2;
                            i8 = i4;
                        } else {
                            i = i;
                        }
                        break;
                    case -1530647911:
                    case -416497876:
                        i = i;
                        sArr2 = f48399;
                        if (!C3743.f13569) {
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ۘܰ") + i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM45029 ^ i9) * 19451) ^ 783530364;
                        i3 = 2010795583;
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                        break;
                    case -1464475005:
                    case -1203251067:
                        C1937.m6286(objComputeIfAbsent, strM10964);
                        return (C13308) objComputeIfAbsent;
                    case -1376378912:
                    case -1145771613:
                        AbstractC0464.m2313();
                        if (C1875.f7103 < 0) {
                            i = i;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۙ") + i10) * (-11);
                        i = i;
                        i2 = ((iM45029 ^ i9) * 1157) ^ (-1584095237);
                        i3 = 93472672;
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case -1105181120:
                    case -938139993:
                        C3577.m10565();
                        return null;
                    case -1002127632:
                    case -815345198:
                        i = i;
                        int i13 = s + s3;
                        if ((i13 * i13) - i6 < 0) {
                            iM45029 = C19806.m45029("ۘ֡") ^ i10;
                            i2 = ((iM45029 ^ i9) * (-15537)) ^ 773211299;
                            i3 = 847556437;
                        } else {
                            iM45029 = (C19806.m45029("᩹֫") ^ i9) * (-77);
                            i2 = ((iM45029 ^ i10) * 24849) ^ 728849000;
                            i3 = 788831830;
                        }
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case -465961413:
                    case 1814764460:
                        i = i;
                        strM10964 = C3743.m10964(sArr, 37, 20, i7);
                        if (!C7105.m18985()) {
                            iM45029 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i9;
                            i2 = ((iM45029 ^ i10) * 5981) ^ (-188647991);
                            i3 = 440737527;
                            i4 = i;
                            i12 = iM45029 ^ i3;
                            i11 = i2;
                            i8 = i4;
                        }
                        break;
                    case -443166537:
                    case 783232417:
                        C1377.m4833();
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۙ") + i10) * (-11);
                        i = i;
                        i2 = ((iM45029 ^ i9) * 1157) ^ (-1584095237);
                        i3 = 93472672;
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case -337168411:
                    case 1579222992:
                        i = i;
                        if (C3722.m10894() <= 0) {
                            iM45029 = (i9 - ThreadFactoryC3888.m11306("ܶܽ")) * (-121);
                            i2 = ((iM45029 ^ i10) * (-3801)) ^ (-1157525950);
                            i3 = -1990090924;
                        } else {
                            iM45029 = (i9 - C19806.m45029("ۧܿ")) * 109;
                            i2 = ((iM45029 ^ i10) * 25229) ^ (-701276006);
                            i3 = -923464728;
                        }
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case -219731981:
                    case -215878746:
                        i7 = 62241;
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۗ") ^ i10;
                        i2 = ((iM45029 ^ i9) * 16437) ^ (-1181218930);
                        i3 = -332272962;
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case -167312096:
                    case -121420616:
                        i = i;
                        objComputeIfAbsent = C9735.computeIfAbsent(linkedHashMap, str2, function);
                        sArr = f48399;
                        if (C1419.f5860 < 0) {
                            int iM450211 = (C19806.m45029("֨۠") + i10) * (-107);
                            i11 = ((iM450211 ^ i9) * 26141) ^ (-1964140748);
                            i4 = i;
                            i12 = iM450211 ^ 1913205512;
                            i8 = i4;
                        }
                        break;
                    case 64498540:
                    case 1189818273:
                        i7 = 1641;
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۗ") ^ i10;
                        i2 = ((iM45029 ^ i9) * 16437) ^ (-1181218930);
                        i3 = -332272962;
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case 382180294:
                    case 1173104890:
                        i = i;
                        i5 = s * s2;
                        if (C3722.f13525 <= 0) {
                            iM45029 = C19806.m45029("ܳܰ") ^ i10;
                            i2 = ((iM45029 ^ i9) * 11337) ^ (-1007222659);
                            i3 = 1615744459;
                        } else {
                            iM45029 = (i10 - C19806.m45029("۬ۢ")) * 57;
                            i2 = ((iM45029 ^ i9) * 9543) ^ 844215965;
                            i3 = 1408882090;
                        }
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    case 1537208151:
                    case 1631700945:
                        i = i;
                        str2 = "";
                        iM45029 = (C19806.m45029("ᩳܶ") ^ i9) * (-99);
                        i2 = ((iM45029 ^ i10) * 30977) ^ 440845895;
                        i3 = -1883220299;
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                    default:
                        i = i;
                        if (str == null) {
                            iM45029 = C19806.m45029("ܳܳ") ^ i9;
                            i2 = ((iM45029 ^ i10) * (-16313)) ^ (-414445613);
                            i3 = -378594373;
                        } else {
                            str2 = str;
                            iM45029 = (C19806.m45029("ᩳܶ") ^ i9) * (-99);
                            i2 = ((iM45029 ^ i10) * 30977) ^ 440845895;
                            i3 = -1883220299;
                        }
                        i4 = i;
                        i12 = iM45029 ^ i3;
                        i11 = i2;
                        i8 = i4;
                        break;
                }
            }
            int iM11306 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i10;
            i8 = i;
            i12 = iM11306 ^ 1435277902;
            i11 = ((iM11306 ^ i9) * (-31971)) ^ (-1227316371);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x014b A[PHI: r3 r7
      0x014b: PHI (r3v4 boolean) = (r3v3 boolean), (r3v2 boolean) binds: [B:38:0x0149, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r7v4 short[]) = (r7v3 short[]), (r7v2 short[]) binds: [B:38:0x0149, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0238 A[PHI: r5 r11 r12
      0x0238: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:61:0x0236, B:24:0x00c9, B:12:0x0067, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:61:0x0236, B:24:0x00c9, B:12:0x0067, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:61:0x0236, B:24:0x00c9, B:12:0x0067, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02ae A[PHI: r9 r15
      0x02ae: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:70:0x02ac, B:46:0x019f, B:14:0x006b, B:12:0x0067, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:70:0x02ac, B:46:0x019f, B:14:0x006b, B:12:0x0067, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02e0 A[PHI: r1 r2 r8 r14 r16 r17
      0x02e0: PHI (r1v4 android.content.SharedPreferences) = 
      (r1v2 android.content.SharedPreferences)
      (r1v3 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
     binds: [B:74:0x02de, B:50:0x01c1, B:42:0x0181, B:34:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:74:0x02de, B:50:0x01c1, B:42:0x0181, B:34:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:74:0x02de, B:50:0x01c1, B:42:0x0181, B:34:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:74:0x02de, B:50:0x01c1, B:42:0x0181, B:34:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:74:0x02de, B:50:0x01c1, B:42:0x0181, B:34:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:74:0x02de, B:50:0x01c1, B:42:0x0181, B:34:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m35477() {
        int iM11306;
        int i;
        int i2;
        int i3 = C1148.f5161;
        int i4 = C1398.f5802;
        int iM45029 = (C19806.m45029("ۤ᩺") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i5 = ((iM45029 ^ i3) * 31989) ^ 1639643750;
        String strM6241 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM45029 ^ (-755786936);
        SharedPreferences sharedPreferences = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = -1009678084;
        int i12 = 0;
        String strM29688 = null;
        String strM10951 = null;
        String strM4832 = null;
        boolean zContains = false;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 15031) >> 31));
            switch (i11) {
                case -2051004492:
                case 1251512047:
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("ۡ۟") ^ i4;
                        i = ((iM11306 ^ i3) * (-6161)) ^ (-1754971234);
                        i2 = -1941743556;
                    } else {
                        iM11306 = (C19806.m45029("ܽ۫") ^ i3) * (-51);
                        i = ((iM11306 ^ i4) * 27931) ^ (-745779884);
                        i2 = -891597160;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2032507027:
                case 1329715181:
                    i8 = i12 * i12;
                    s2 = 76864;
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("ۙᩳ") ^ i4) * (-33);
                        i = ((iM11306 ^ i3) * 30891) ^ (-2091053724);
                        i2 = 514074494;
                    } else {
                        iM11306 = (C19806.m45029("᩷۫") + i4) * (-19);
                        i = ((iM11306 ^ i3) * 6477) ^ (-369912416);
                        i2 = -1083977042;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2028287251:
                case -1061321823:
                    sArr = f48399;
                    c = 289;
                    if (C2704.f10408) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("۟ۗ")) * (-81);
                        i = ((iM11306 ^ i3) * 16813) ^ (-337223603);
                        i2 = -1553471538;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۤ") ^ i4;
                        i = ((iM11306 ^ i3) * 351) ^ (-540515334);
                        i2 = 1636655351;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2007427133:
                case -1878232630:
                    strM29688 = C11904.m29688(strM10951);
                    if (C11904.m29687(strM29688)) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i3;
                        i = ((iM11306 ^ i4) * 28721) ^ 52502537;
                        i2 = 141923384;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨܶ") ^ i4) * 119;
                        i = ((iM11306 ^ i3) * 17557) ^ (-1854637628);
                        i2 = -1375605683;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1967624924:
                case 264259974:
                    zContains = sharedPreferences.contains(strM6241);
                    sArr3 = f48399;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("֨ܰ") ^ i3) * (-27);
                        i = ((iM11306 ^ i4) * (-21379)) ^ (-992290423);
                        i2 = -1521689163;
                    } else {
                        iM11306 = C19806.m45029("۬ۖ") ^ i4;
                        i = ((iM11306 ^ i3) * 28899) ^ (-2035306594);
                        i2 = 1198933339;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1824427743:
                case 1917600851:
                    if ((s * s2) - i8 <= 0) {
                        iM11306 = C19806.m45029("᩺ᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * 2889) ^ (-207334894);
                        i2 = -1829842251;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۙ") ^ i3;
                        i = ((iM11306 ^ i4) * (-23779)) ^ 2144890500;
                        i2 = -1716711954;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1734286341:
                case 1960440675:
                    sharedPreferences = ApplicationC0716.f2988;
                    sArr2 = f48399;
                    if (C3743.m10966() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۤ") ^ i4;
                        i = ((iM11306 ^ i3) * 351) ^ (-540515334);
                        i2 = 1636655351;
                    } else {
                        iM11306 = (i4 - C19806.m45029("֨ۡ")) * 79;
                        i = ((iM11306 ^ i3) * 31729) ^ 1350499807;
                        i2 = -1897282586;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1639052093:
                case -434205712:
                    i9 = 58626;
                    iM11306 = C19806.m45029("᩸ۡ") ^ i3;
                    i = ((iM11306 ^ i4) * 15147) ^ (-1099328055);
                    i2 = 191469037;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1487490593:
                case -264349187:
                    C2704.m8255();
                    C0797.m3359();
                    break;
                case -1456552072:
                case -84259194:
                    break;
                case -1380481292:
                case -35086971:
                    s = sArr[c];
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ۡ۟") ^ i4;
                        i = ((iM11306 ^ i3) * (-6161)) ^ (-1754971234);
                        i2 = -1941743556;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵֫") ^ i3;
                        i = ((iM11306 ^ i4) * 32269) ^ 277969570;
                        i2 = -1145243873;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1278056023:
                case 759887614:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = C19806.m45029("ۡ۟") ^ i4;
                        i = ((iM11306 ^ i3) * (-6161)) ^ (-1754971234);
                        i2 = -1941743556;
                    } else {
                        iM11306 = (C19806.m45029("ۙᩳ") ^ i4) * (-33);
                        i = ((iM11306 ^ i3) * 30891) ^ (-2091053724);
                        i2 = 514074494;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1174886287:
                case 1905939352:
                    i9 = 24420;
                    iM11306 = C19806.m45029("᩸ۡ") ^ i3;
                    i = ((iM11306 ^ i4) * 15147) ^ (-1099328055);
                    i2 = 191469037;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1077539986:
                case 968107152:
                    strM10951 = C3743.m10951(ApplicationC0716.f2988, strM6241, strM4832);
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("ۙᩳ") ^ i4) * (-33);
                        i = ((iM11306 ^ i3) * 30891) ^ (-2091053724);
                        i2 = 514074494;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۖ᩺")) * (-35);
                        i = ((iM11306 ^ i4) * 16965) ^ (-1331416805);
                        i2 = 46388948;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1063352159:
                case 1388526600:
                    C11904.m29687(strM4832);
                    break;
                case -1005808850:
                case 2117756624:
                    int i13 = s + 19216;
                    if (C2477.m7593() >= 0) {
                        i12 = i13;
                        iM11306 = (C19806.m45029("ܽ۫") ^ i3) * (-51);
                        i = ((iM11306 ^ i4) * 27931) ^ (-745779884);
                        i2 = -891597160;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i3;
                        i5 = ((iM11307 ^ i4) * 24185) ^ (-436516797);
                        i12 = i13;
                        i6 = iM11307 ^ (-110509941);
                    }
                    break;
                case -977621350:
                case -341022290:
                    i10 = 290;
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ۡ۟") ^ i4;
                        i = ((iM11306 ^ i3) * (-6161)) ^ (-1754971234);
                        i2 = -1941743556;
                    } else {
                        iM11306 = C19806.m45029("ܰ۬") ^ i3;
                        i = ((iM11306 ^ i4) * (-5005)) ^ (-192703047);
                        i2 = 1181655607;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -828496313:
                case 970791532:
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr2, i10, 8, i9);
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۤ") ^ i4;
                        i = ((iM11306 ^ i3) * 351) ^ (-540515334);
                        i2 = 1636655351;
                    } else {
                        iM11306 = C19806.m45029("۟֫") ^ i4;
                        i = ((iM11306 ^ i3) * 24959) ^ (-1391346968);
                        i2 = -1582464395;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -825709527:
                case -130635931:
                    strM4832 = C1377.m4832(sArr3, i7, 11, i9);
                    if (zContains) {
                        iM11306 = (i4 - C19806.m45029("᩹ܺ")) * (-29);
                        i = ((iM11306 ^ i3) * 24563) ^ (-900219497);
                        i2 = -1590648390;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘۚ")) * (-101);
                        i = ((iM11306 ^ i4) * (-21949)) ^ (-1862135513);
                        i2 = 1577898758;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -206419287:
                case 1821023399:
                    RunnableC0195.m1431();
                    C0671.m3008();
                    iM11306 = C19806.m45029("ۡ۟") ^ i4;
                    i = ((iM11306 ^ i3) * (-6161)) ^ (-1754971234);
                    i2 = -1941743556;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 9845260:
                case 2009434041:
                    ApplicationC0716.f2988.edit().putString(strM6241, strM29688).apply();
                    iM11306 = (ThreadFactoryC3888.m11306("ۨܶ") ^ i4) * 119;
                    i = ((iM11306 ^ i3) * 17557) ^ (-1854637628);
                    i2 = -1375605683;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 369090562:
                case 1818471884:
                    i7 = 298;
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۤ") ^ i4;
                        i = ((iM11306 ^ i3) * 351) ^ (-540515334);
                        i2 = 1636655351;
                    } else {
                        iM11306 = (C19806.m45029("֫᩹") ^ i3) * 51;
                        i = ((iM11306 ^ i4) * (-1455)) ^ 398531226;
                        i2 = -1106276062;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (RunnableC1895.m6170() == 0) {
                        iM11306 = (C19806.m45029("ۙᩳ") ^ i4) * (-33);
                        i = ((iM11306 ^ i3) * 30891) ^ (-2091053724);
                        i2 = 514074494;
                    } else {
                        iM11306 = (C19806.m45029("֨ܰ") ^ i3) * (-27);
                        i = ((iM11306 ^ i4) * (-21379)) ^ (-992290423);
                        i2 = -1521689163;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 109901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m35472(long r75, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82) {
        /*
            Method dump skipped, instruction units count: 10990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14804.m35472(long, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m35479(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -525666368;
        int i8 = RunnableC1606.f6488;
        int i9 = ThreadFactoryC3888.f14547;
        int iM11306 = ThreadFactoryC3888.m11306("ۡۘ") ^ i8;
        int i10 = ((iM11306 ^ i9) * 27853) ^ 574935208;
        int i11 = 1359116601;
        while (true) {
            i7 = ((((i7 ^ i9) * 26535) >> 31) & i10) ^ (iM11306 ^ i11);
            switch (i7) {
                case -1894244065:
                case 719328831:
                    C3286.m9798();
                    return false;
                case -1555153136:
                case 1785793584:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩹") + i9) * 77;
                        i10 = ((iM11306 ^ i8) * 31755) ^ (-1232875204);
                        i11 = -51464479;
                    } else {
                        iM11306 = C19806.m45029("ۧ᩸") ^ i9;
                        i10 = ((iM11306 ^ i8) * (-10213)) ^ (-150388355);
                        i11 = 618547692;
                    }
                    break;
                case -1337220721:
                case 382171406:
                    return false;
                case -1302780543:
                case -442649980:
                    i3 = i & i2;
                    z = true;
                    z = true;
                    if (C1377.m4833() != 0) {
                        iM11306 = C19806.m45029("ۖ۫") ^ i8;
                        i10 = ((iM11306 ^ i9) * (-8149)) ^ 1027376483;
                        i11 = 257223743;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܺ") ^ i9;
                        i10 = ((iM11306 ^ i8) * 30117) ^ 2011671676;
                        i11 = -253113694;
                    }
                    break;
                case -1195571835:
                case 1086713083:
                    return z;
                case -1093307402:
                case 1198613969:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ᩳ") ^ i8) * (-51);
                        i10 = ((iM11306 ^ i9) * (-29057)) ^ (-1044041892);
                        i11 = -1212331361;
                    } else {
                        iM11306 = C19806.m45029("᩹ܶ") ^ i8;
                        i10 = ((iM11306 ^ i9) * (-29865)) ^ (-2105557129);
                        i11 = -2052726475;
                    }
                    break;
                case -993172017:
                case -82830257:
                    if (C1461.m5080()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۤ") + i9) * 65;
                        i10 = ((iM11306 ^ i8) * (-29947)) ^ 460420737;
                        i11 = -79436785;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ۜ᩶")) * (-67);
                        i10 = ((iM11306 ^ i8) * 2465) ^ (-1993169865);
                        i11 = 68049761;
                    }
                    break;
                case -959770074:
                case 1275197987:
                    i2 = 7;
                    if (C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۤ") + i9) * 65;
                        i10 = ((iM11306 ^ i8) * (-29947)) ^ 460420737;
                        i11 = -79436785;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ۟") ^ i8) * (-55);
                        i10 = ((iM11306 ^ i9) * (-3539)) ^ (-843516568);
                        i11 = -1655594559;
                    }
                    break;
                case -895392954:
                case 573334324:
                    if (RunnableC3388.m10064()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜᩴ") ^ i8) * (-87);
                        i10 = ((iM11306 ^ i9) * 27919) ^ 2097513468;
                        i11 = -1189725681;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ᩳ") ^ i8) * (-51);
                        i10 = ((iM11306 ^ i9) * (-29057)) ^ (-1044041892);
                        i11 = -1212331361;
                    }
                    break;
                case -617883099:
                case 105577:
                    C3286.m9798();
                    C0817.m3399();
                    iM11306 = (ThreadFactoryC3888.m11306("᩻ᩳ") ^ i8) * (-51);
                    i10 = ((iM11306 ^ i9) * (-29057)) ^ (-1044041892);
                    i11 = -1212331361;
                    break;
                case -559457061:
                case 1925002137:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("ᩴ۟") ^ i9) * 115;
                        i10 = ((iM11306 ^ i8) * (-27061)) ^ 1556923269;
                        i11 = 130947099;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ᩳ") ^ i8) * (-51);
                        i10 = ((iM11306 ^ i9) * (-29057)) ^ (-1044041892);
                        i11 = -1212331361;
                    }
                    break;
                case -542518479:
                case 99510732:
                    if ((bArr[i6] & i4) != 0) {
                        iM11306 = C19806.m45029("ۘۡ") ^ i8;
                        i10 = ((iM11306 ^ i9) * (-13769)) ^ 693807549;
                        i11 = 1466566740;
                    } else {
                        iM11306 = (C19806.m45029("ۤܰ") + i9) * 77;
                        i10 = ((iM11306 ^ i8) * (-8987)) ^ 693623529;
                        i11 = -353004130;
                    }
                    break;
                case -528228302:
                case 2100168402:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۤ") + i9) * 65;
                        i10 = ((iM11306 ^ i8) * (-29947)) ^ 460420737;
                        i11 = -79436785;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺֨") ^ i8) * (-11);
                        i10 = ((iM11306 ^ i9) * (-7999)) ^ 1078658054;
                        i11 = -117925100;
                    }
                    break;
                case -21801010:
                case 1614753699:
                    if (C1419.m4973()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ᩳ") ^ i8) * (-51);
                        i10 = ((iM11306 ^ i9) * (-29057)) ^ (-1044041892);
                        i11 = -1212331361;
                    } else {
                        iM11306 = C19806.m45029("ۤۘ") ^ i8;
                        i10 = ((iM11306 ^ i9) * (-6867)) ^ 300027277;
                        i11 = 689707146;
                    }
                    break;
                case 339639645:
                case 599158894:
                    C1461.m5080();
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺֨") ^ i8) * (-11);
                        i10 = ((iM11306 ^ i9) * (-7999)) ^ 1078658054;
                        i11 = -117925100;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩹") + i9) * 77;
                        i10 = ((iM11306 ^ i8) * 31755) ^ (-1232875204);
                        i11 = -51464479;
                    }
                    break;
                case 963425626:
                case 1595539492:
                    i6 = i >>> i5;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺֨") ^ i8) * (-11);
                        i10 = ((iM11306 ^ i9) * (-7999)) ^ 1078658054;
                        i11 = -117925100;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۨ") ^ i8) * 55;
                        i10 = ((iM11306 ^ i9) * 29335) ^ (-1385676591);
                        i11 = -2099430532;
                    }
                    break;
                case 1226919738:
                case 1859253910:
                    if (!C3743.f13569) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩹") + i9) * 77;
                        i10 = ((iM11306 ^ i8) * 31755) ^ (-1232875204);
                        i11 = -51464479;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ᩳ") ^ i8) * (-51);
                        i10 = ((iM11306 ^ i9) * (-29057)) ^ (-1044041892);
                        i11 = -1212331361;
                    }
                    break;
                default:
                    i4 = (z ? 1 : 0) << i3;
                    i5 = 3;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("֨۠") ^ i9;
                        i10 = ((iM11306 ^ i8) * 32471) ^ 1694222338;
                        i11 = 1863289190;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۤ") + i9) * 65;
                        i10 = ((iM11306 ^ i8) * (-29947)) ^ 460420737;
                        i11 = -79436785;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0196 A[PHI: r4
      0x0196: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:45:0x017e, B:36:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x026b A[PHI: r5 r15 r16
      0x026b: PHI (r5v3 long) = (r5v1 long), (r5v2 long), (r5v1 long), (r5v1 long) binds: [B:68:0x0269, B:39:0x0158, B:15:0x0095, B:12:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:68:0x0269, B:39:0x0158, B:15:0x0095, B:12:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r16v4 short) = (r16v3 short), (r16v2 short), (r16v2 short), (r16v2 short) binds: [B:68:0x0269, B:39:0x0158, B:15:0x0095, B:12:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02d5 A[PHI: r14 r19
      0x02d5: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:76:0x02d3, B:49:0x01b1, B:9:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r19v4 char) = (r19v3 char), (r19v2 char), (r19v2 char) binds: [B:76:0x02d3, B:49:0x01b1, B:9:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0307 A[PHI: r3 r12 r17 r18
      0x0307: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:80:0x0305, B:64:0x0247, B:53:0x01d5, B:12:0x008c, B:9:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:80:0x0305, B:64:0x0247, B:53:0x01d5, B:12:0x008c, B:9:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:80:0x0305, B:64:0x0247, B:53:0x01d5, B:12:0x008c, B:9:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:80:0x0305, B:64:0x0247, B:53:0x01d5, B:12:0x008c, B:9:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0335 A[PHI: r7 r8 r9
      0x0335: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:84:0x0333, B:28:0x00e0, B:17:0x0099, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0335: PHI (r8v4 byte[]) = (r8v2 byte[]), (r8v3 byte[]), (r8v2 byte[]), (r8v2 byte[]) binds: [B:84:0x0333, B:28:0x00e0, B:17:0x0099, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0335: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:84:0x0333, B:28:0x00e0, B:17:0x0099, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C6336 m35469(C17367 c17367, int i) {
        int iM45029;
        int i2;
        int i3;
        int i4 = C1977.f7413;
        int i5 = C1937.f7317;
        int iM11306 = ThreadFactoryC3888.m11306("ܰ᩷") ^ i4;
        int i6 = ((iM11306 ^ i5) * 6365) ^ 1014221589;
        long jM40445 = 0;
        byte[] bArrM35476 = null;
        short[] sArr = null;
        int i7 = iM11306 ^ (-1980117898);
        int iM40454 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        int i11 = 0;
        char c = 0;
        short s2 = 0;
        int i12 = -1941417290;
        short s3 = 0;
        String strM2906 = null;
        short[] sArr2 = null;
        int iM40445 = 0;
        byte[] bArrM35477 = null;
        int iM40455 = 0;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * (-19177)) >> 31));
            switch (i12) {
                case -2142518790:
                case -1367859716:
                    if ((i11 * i11) - i10 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ܽ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-7871)) ^ 320315922;
                        i3 = -1762019337;
                    } else {
                        iM45029 = C19806.m45029("ۛᩳ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 23209) ^ (-2062605412);
                        i3 = -1198520805;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -2044212385:
                case -1502164462:
                    i9 = 1;
                    if (CallableC1627.f6528) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۚܶ")) * (-15);
                        i2 = ((iM45029 ^ i4) * 24403) ^ 356565795;
                        i3 = 1383857693;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩹ۚ")) * (-3);
                        i2 = ((iM45029 ^ i5) * 14677) ^ 1820297081;
                        i3 = 1863575252;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -2025142806:
                case -1719782933:
                    if (jM40445 <= c17367.available()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܳ") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-9751)) ^ 581624432;
                        i3 = 1311044147;
                    } else {
                        iM45029 = (C19806.m45029("᩺ۨ") + i4) * 47;
                        i2 = ((iM45029 ^ i5) * 28511) ^ (-718377664);
                        i3 = 493276623;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1886988180:
                case 1812696840:
                    C0216.m1591();
                    if (C3535.m10431() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܳ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 1441) ^ 1743355624;
                        i3 = 628845894;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩹ۚ")) * (-3);
                        i2 = ((iM45029 ^ i5) * 14677) ^ 1820297081;
                        i3 = 1863575252;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1763848132:
                case 316310833:
                    CallableC1627.m5507();
                    return null;
                case -1760300388:
                case -260951128:
                    c17367.seek(i);
                    return null;
                case -1653279782:
                case -897334365:
                    i11 = s3 + s;
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܳ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 1441) ^ 1743355624;
                        i3 = 628845894;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩸") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-19169)) ^ 1719383975;
                        i3 = -58888274;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1513668846:
                case 1667996977:
                    throw new IllegalArgumentException(strM2906);
                case -1388050904:
                case -1067377634:
                    iM40454 = c17367.m40454();
                    bArrM35476 = m35476(i, iM40454, c17367);
                    iM40455 = c17367.m40454();
                    if (C0797.m3359()) {
                        iM45029 = (i5 - C19806.m45029("ۗ۫")) * 71;
                        i2 = ((iM45029 ^ i4) * 21833) ^ (-84350581);
                        i3 = -1570076599;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩷") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-13709)) ^ (-490318321);
                        i3 = 2103528398;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1217192709:
                case 1398711095:
                    s3 = sArr2[c];
                    s2 = 16936;
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩸") ^ i5;
                        i2 = ((iM45029 ^ i4) * 19473) ^ (-1465550931);
                        i3 = 1681548497;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֡ۜ")) * (-17);
                        i2 = ((iM45029 ^ i5) * 22891) ^ (-2054681211);
                        i3 = 1538011317;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1175985569:
                case -1144017696:
                    jM40445 = i - c17367.m40445();
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܶ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 11479) ^ 16064231;
                        i3 = 1869493914;
                    } else {
                        iM45029 = C19806.m45029("ᩳۡ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 4911) ^ (-388919768);
                        i3 = 1925283400;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1034695254:
                case -825769162:
                    C0629.m2907();
                    if (C0629.f2722 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩷") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-13709)) ^ (-490318321);
                        i3 = 2103528398;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܶ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 11479) ^ 16064231;
                        i3 = 1869493914;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -925061694:
                case -359303833:
                    i8 = 25386;
                    iM45029 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i5) * (-71);
                    i2 = ((iM45029 ^ i4) * 14259) ^ 219851801;
                    i3 = -1379814693;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -784650116:
                case 318320097:
                    throw new IllegalArgumentException(strM2906);
                case -725468639:
                case 2101681960:
                    i8 = 17096;
                    iM45029 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i5) * (-71);
                    i2 = ((iM45029 ^ i4) * 14259) ^ 219851801;
                    i3 = -1379814693;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -713759751:
                case -704600590:
                    i10 = s3 * s2;
                    s = 4234;
                    if (C1937.m6279() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܶ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 11479) ^ 16064231;
                        i3 = 1869493914;
                    } else {
                        iM45029 = (C19806.m45029("ܳܳ") ^ i5) * 101;
                        i2 = ((iM45029 ^ i4) * 18295) ^ 891166410;
                        i3 = -874133630;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -604198731:
                case 1239675030:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩷") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-13709)) ^ (-490318321);
                        i3 = 2103528398;
                    } else {
                        iM45029 = C19806.m45029("۠ᩳ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 23065) ^ 336019166;
                        i3 = -1228945476;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -332228946:
                case 471970862:
                    if (c17367.m40454() != 1) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙܳ") ^ i4) * (-99);
                        i2 = ((iM45029 ^ i5) * 28947) ^ 361144453;
                        i3 = -1215842194;
                    } else {
                        iM45029 = C19806.m45029("ۛܰ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-14027)) ^ (-999570374);
                        i3 = 1190701296;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -230692932:
                case 1030453033:
                    ThreadFactoryC3888.m11300();
                    C1398.m4895();
                    iM45029 = ThreadFactoryC3888.m11306("ۘ᩷") ^ i5;
                    i2 = ((iM45029 ^ i4) * (-13709)) ^ (-490318321);
                    i3 = 2103528398;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 280946080:
                case 1652163292:
                    strM2906 = C0629.m2906(sArr, i9, 35, i8);
                    if (i > iM40445) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۟") ^ i4;
                        i2 = ((iM45029 ^ i5) * 26155) ^ (-1600389964);
                        i3 = -337558381;
                    } else {
                        iM45029 = (C19806.m45029("᩺ۨ") + i4) * 47;
                        i2 = ((iM45029 ^ i5) * 28511) ^ (-718377664);
                        i3 = 493276623;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 426166063:
                case 1528446579:
                    c = 0;
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۘ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 30179) ^ (-1208507568);
                        i3 = 1557115595;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩹ۚ")) * (-3);
                        i2 = ((iM45029 ^ i5) * 14677) ^ 1820297081;
                        i3 = 1863575252;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 862808362:
                case 1174971388:
                    iM40445 = c17367.m40445();
                    sArr = f48399;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܳ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 1441) ^ 1743355624;
                        i3 = 628845894;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۧۜ")) * 81;
                        i2 = ((iM45029 ^ i5) * (-30113)) ^ 975193539;
                        i3 = 1442200909;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 883992175:
                case 1076721560:
                    return new C6336(iM40454, iM40455, bArrM35476, bArrM35477);
                case 1560501570:
                case 1723268470:
                    sArr2 = f48399;
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܳ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 1441) ^ 1743355624;
                        i3 = 628845894;
                    } else {
                        iM45029 = C19806.m45029("֡ܰ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 10703) ^ (-1632741178);
                        i3 = 153032280;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 1638867320:
                case 1726693155:
                    if (C1419.f5860 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܶ") ^ i4;
                        i2 = ((iM45029 ^ i5) * 11479) ^ 16064231;
                        i3 = 1869493914;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܳ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 1441) ^ 1743355624;
                        i3 = 628845894;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                default:
                    bArrM35477 = m35476(i, iM40455, c17367);
                    if (c17367.m40445() == i) {
                        iM45029 = C19806.m45029("ܿ۬") ^ i4;
                        i2 = ((iM45029 ^ i5) * 3379) ^ 289142043;
                        i3 = 1723194470;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۟ۡ")) * 47;
                        i2 = ((iM45029 ^ i4) * 7829) ^ (-276664906);
                        i3 = -491384937;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x019e A[PHI: r12 r13
      0x019e: PHI (r12v2 int) = (r12v1 int), (r12v4 int) binds: [B:9:0x0052, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r13v2 byte[]) = (r13v1 byte[]), (r13v4 byte[]) binds: [B:9:0x0052, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02cd A[PHI: r2 r3 r6 r9 r10
      0x02cd: PHI (r2v3 l.ܿ᩸᩺) = (r2v2 l.ܿ᩸᩺), (r2v1 l.ܿ᩸᩺), (r2v1 l.ܿ᩸᩺), (r2v1 l.ܿ᩸᩺) binds: [B:73:0x02cb, B:65:0x0282, B:56:0x0213, B:52:0x01f0] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r3v3 int) = (r3v2 int), (r3v1 int), (r3v1 int), (r3v1 int) binds: [B:73:0x02cb, B:65:0x0282, B:56:0x0213, B:52:0x01f0] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:73:0x02cb, B:65:0x0282, B:56:0x0213, B:52:0x01f0] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r9v3 l.ۛۧ᩺) = (r9v1 l.ۛۧ᩺), (r9v1 l.ۛۧ᩺), (r9v2 l.ۛۧ᩺), (r9v1 l.ۛۧ᩺) binds: [B:73:0x02cb, B:65:0x0282, B:56:0x0213, B:52:0x01f0] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r10v2 l.ܿۧ᩺) = (r10v1 l.ܿۧ᩺), (r10v1 l.ܿۧ᩺), (r10v1 l.ܿۧ᩺), (r10v3 l.ܿۧ᩺) binds: [B:73:0x02cb, B:65:0x0282, B:56:0x0213, B:52:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x031d A[PHI: r1 r4 r5 r11 r16 r21
      0x031d: PHI (r1v3 android.content.SharedPreferences$Editor) = 
      (r1v1 android.content.SharedPreferences$Editor)
      (r1v2 android.content.SharedPreferences$Editor)
      (r1v1 android.content.SharedPreferences$Editor)
      (r1v1 android.content.SharedPreferences$Editor)
      (r1v1 android.content.SharedPreferences$Editor)
      (r1v1 android.content.SharedPreferences$Editor)
     binds: [B:81:0x031b, B:77:0x02fd, B:69:0x02a5, B:48:0x01d0, B:32:0x00f9, B:16:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r4v3 byte[]) = (r4v1 byte[]), (r4v1 byte[]), (r4v2 byte[]), (r4v1 byte[]), (r4v1 byte[]), (r4v1 byte[]) binds: [B:81:0x031b, B:77:0x02fd, B:69:0x02a5, B:48:0x01d0, B:32:0x00f9, B:16:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:81:0x031b, B:77:0x02fd, B:69:0x02a5, B:48:0x01d0, B:32:0x00f9, B:16:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r11v3 l.ܿ᩸᩺) = (r11v1 l.ܿ᩸᩺), (r11v1 l.ܿ᩸᩺), (r11v1 l.ܿ᩸᩺), (r11v2 l.ܿ᩸᩺), (r11v1 l.ܿ᩸᩺), (r11v1 l.ܿ᩸᩺) binds: [B:81:0x031b, B:77:0x02fd, B:69:0x02a5, B:48:0x01d0, B:32:0x00f9, B:16:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r16v4 l.۫᩸᩺) = (r16v1 l.۫᩸᩺), (r16v1 l.۫᩸᩺), (r16v1 l.۫᩸᩺), (r16v1 l.۫᩸᩺), (r16v3 l.۫᩸᩺), (r16v1 l.۫᩸᩺) binds: [B:81:0x031b, B:77:0x02fd, B:69:0x02a5, B:48:0x01d0, B:32:0x00f9, B:16:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r21v3 android.content.SharedPreferences) = 
      (r21v2 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
      (r21v1 android.content.SharedPreferences)
     binds: [B:81:0x031b, B:77:0x02fd, B:69:0x02a5, B:48:0x01d0, B:32:0x00f9, B:16:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m35473(C6336 c6336) {
        int iM11306;
        int i;
        int i2;
        SharedPreferences.Editor editorEdit = null;
        C17625 c17625M35471 = null;
        int iM17445 = 0;
        byte[] bArrM17443 = null;
        int iM938 = 0;
        int iM1590 = 0;
        int i3 = 0;
        InterfaceC6025 interfaceC6025 = null;
        InterfaceC17314 interfaceC17314M8257 = null;
        C17625 c17625M35478 = null;
        int iM17441 = 0;
        byte[] bArrM17444 = null;
        int iM1591 = 0;
        int i4 = 0;
        C12687 c12687 = null;
        int i5 = 1783578023;
        int i6 = RunnableC1606.f6488;
        int i7 = C3577.f13150;
        int iM45029 = (C19806.m45029("֫ܽ") + i7) * 91;
        int i8 = ((iM45029 ^ i6) * (-8753)) ^ (-693663697);
        int i9 = iM45029 ^ 1622569677;
        SharedPreferences sharedPreferences = null;
        int i10 = 0;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i6) * (-8037)) >> 31));
            switch (i5) {
                case -2098818198:
                case -701395897:
                    editorEdit = sharedPreferences.edit();
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۨۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i6) * 24571) ^ 109338238;
                        i2 = 1022687186;
                    } else {
                        iM11306 = (C19806.m45029("ۤܶ") + i7) * (-31);
                        i = ((iM11306 ^ i6) * (-12359)) ^ (-435776775);
                        i2 = 1907792158;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -2066407689:
                case 918116348:
                    interfaceC17314M8257 = C2704.m8257(interfaceC6025);
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢᩴ") ^ i7;
                        i = ((iM11306 ^ i6) * (-5611)) ^ (-814168393);
                        i2 = -606520684;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܳ") ^ i7) * 67;
                        i = ((iM11306 ^ i6) * 2839) ^ (-599993694);
                        i2 = -1170762533;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -2041785391:
                case 1535214988:
                    iM1591 = C0216.m1590(iM17441, C1377.m4837(c17625M35478));
                    i4 = i10;
                    iM11306 = (ThreadFactoryC3888.m11306("۟ᩳ") + i7) * 83;
                    i = ((iM11306 ^ i6) * 28383) ^ 1954616134;
                    i2 = 1036556696;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1826922340:
                case 1758213878:
                    C2477.m7593();
                    C1189.m4368();
                    iM11306 = ThreadFactoryC3888.m11306("ۘۘ") ^ i6;
                    i = ((iM11306 ^ i7) * (-18097)) ^ 1291277064;
                    i2 = 1036347666;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1575952474:
                case 1466801035:
                    editorEdit.remove(CallableC1627.m5506(c12687));
                    iM11306 = (ThreadFactoryC3888.m11306("ܶܰ") + i6) * 79;
                    i = ((iM11306 ^ i7) * (-1851)) ^ (-992878279);
                    i2 = 175647953;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1523188058:
                case 933227876:
                    C2249.m6906(interfaceC17314M8257);
                    break;
                case -1360599945:
                case 161131743:
                    i3++;
                    iM11306 = (C19806.m45029("᩺֫") + i6) * 37;
                    i = ((iM11306 ^ i7) * 27847) ^ 646907036;
                    i2 = -1686752602;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1140234349:
                case 1932786416:
                    bArrM17443 = c6336.m17443();
                    iM938 = C0050.m938(c17625M35471);
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۨۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i6) * 24571) ^ 109338238;
                        i2 = 1022687186;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟᩵") ^ i7) * (-75);
                        i = ((iM11306 ^ i6) * (-6169)) ^ 1938266450;
                        i2 = 457866538;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1091290365:
                case 459924006:
                    iM1590 = C0216.m1590(iM17445, iM938);
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢᩴ") ^ i7;
                        i = ((iM11306 ^ i6) * (-5611)) ^ (-814168393);
                        i2 = -606520684;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۢ") ^ i7;
                        i = ((iM11306 ^ i6) * (-17243)) ^ (-344304715);
                        i2 = 1724057754;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -770546486:
                case 1240189223:
                    C2871.m8646();
                    RunnableC1564.m5345();
                    break;
                case -711014732:
                case 1693251563:
                    i4++;
                    iM11306 = (ThreadFactoryC3888.m11306("۟ᩳ") + i7) * 83;
                    i = ((iM11306 ^ i6) * 28383) ^ 1954616134;
                    i2 = 1036556696;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -660815796:
                case -310896013:
                    if (m35479(i4, bArrM17444)) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܰ") ^ i7;
                        i = ((iM11306 ^ i6) * (-12221)) ^ (-406804787);
                        i2 = -1200970755;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۖ") ^ i6;
                        i = ((iM11306 ^ i7) * 13821) ^ (-1834721479);
                        i2 = -1959029658;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -647442167:
                case 304024261:
                    c12687 = (C12687) c17625M35471.get(i3);
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۧ") ^ i7;
                        i = ((iM11306 ^ i6) * (-14129)) ^ 464607204;
                        i2 = 954025625;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۨۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i6) * 24571) ^ 109338238;
                        i2 = 1022687186;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -620877329:
                case 1091868437:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i6;
                        i = ((iM11306 ^ i7) * 23483) ^ (-1124845198);
                        i2 = -408200623;
                    } else {
                        iM11306 = C19806.m45029("ۧۧ") ^ i7;
                        i = ((iM11306 ^ i6) * (-6567)) ^ (-223779437);
                        i2 = -1757013534;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -169169423:
                case 227247953:
                    C2124.m6673();
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۘ") ^ i6;
                        i = ((iM11306 ^ i7) * (-18097)) ^ 1291277064;
                        i2 = 1036347666;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۨۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i6) * 24571) ^ 109338238;
                        i2 = 1022687186;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -133269715:
                case 469655547:
                    if (m35479(i3, bArrM17443)) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۢ") + i6) * 95;
                        i = ((iM11306 ^ i7) * 13799) ^ 1538071461;
                        i2 = 273982905;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶܰ") + i6) * 79;
                        i = ((iM11306 ^ i7) * (-1851)) ^ (-992878279);
                        i2 = 175647953;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -66146932:
                case 1681724927:
                    i3 = 0;
                    i10 = 0;
                    iM11306 = (C19806.m45029("᩺֫") + i6) * 37;
                    i = ((iM11306 ^ i7) * 27847) ^ 646907036;
                    i2 = -1686752602;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -11143643:
                case 836717867:
                    if (i3 < iM1590) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۟") ^ i6;
                        i = ((iM11306 ^ i7) * (-8703)) ^ (-397639878);
                        i2 = 400202386;
                    } else {
                        iM11306 = (C19806.m45029("ۤ֨") ^ i7) * (-65);
                        i = ((iM11306 ^ i6) * (-8117)) ^ 517876113;
                        i2 = -849260553;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 142590549:
                case 250909098:
                    RunnableC1564.m5345();
                    if (C1148.f5161 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۘ") ^ i6;
                        i = ((iM11306 ^ i7) * (-18097)) ^ 1291277064;
                        i2 = 1036347666;
                    } else {
                        iM11306 = C19806.m45029("ۧۧ") ^ i7;
                        i = ((iM11306 ^ i6) * (-6567)) ^ (-223779437);
                        i2 = -1757013534;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 219331101:
                case 889527128:
                    if (i4 < iM1591) {
                        iM11306 = C19806.m45029("ܳ᩷") ^ i7;
                        i = ((iM11306 ^ i6) * (-29911)) ^ (-1733174344);
                        i2 = 2008392068;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ᩺") ^ i6;
                        i = ((iM11306 ^ i7) * (-27021)) ^ 1002926193;
                        i2 = 1256378676;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 334295988:
                case 1736567114:
                    sharedPreferences = ApplicationC0716.f2988;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۨۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i6) * 24571) ^ 109338238;
                        i2 = 1022687186;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i6;
                        i = ((iM11306 ^ i7) * 24451) ^ 655222404;
                        i2 = 971333751;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 549454343:
                case 972610650:
                    c17625M35478 = m35478();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۨۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i6) * 24571) ^ 109338238;
                        i2 = 1022687186;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۨ") ^ i6;
                        i = ((iM11306 ^ i7) * 4317) ^ (-1822734018);
                        i2 = 1327203896;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 581384760:
                case 1919604834:
                    interfaceC17314M8257.remove(C2704.m8251((C12687) c17625M35478.get(i4)));
                    iM11306 = ThreadFactoryC3888.m11306("֡ۖ") ^ i6;
                    i = ((iM11306 ^ i7) * 13821) ^ (-1834721479);
                    i2 = -1959029658;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 817669019:
                case 848835415:
                    c17625M35471 = m35471();
                    iM17445 = c6336.m17445();
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢᩴ") ^ i7;
                        i = ((iM11306 ^ i6) * (-5611)) ^ (-814168393);
                        i2 = -606520684;
                    } else {
                        iM11306 = C19806.m45029("ᩴۨ") ^ i6;
                        i = ((iM11306 ^ i7) * (-24635)) ^ (-1365264936);
                        i2 = 1407028159;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 1900070100:
                case 2091740894:
                    editorEdit.apply();
                    interfaceC6025 = ApplicationC0716.f2992;
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢᩴ") ^ i7;
                        i = ((iM11306 ^ i6) * (-5611)) ^ (-814168393);
                        i2 = -606520684;
                    } else {
                        iM11306 = (C19806.m45029("᩶᩻") + i6) * (-15);
                        i = ((iM11306 ^ i7) * (-773)) ^ (-259310367);
                        i2 = -997090255;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                default:
                    iM17441 = c6336.m17441();
                    bArrM17444 = c6336.m17444();
                    if (C0526.m2437() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i6;
                        i = ((iM11306 ^ i7) * 23483) ^ (-1124845198);
                        i2 = -408200623;
                    } else {
                        iM11306 = C19806.m45029("ᩳܺ") ^ i7;
                        i = ((iM11306 ^ i6) * (-31827)) ^ 1247407457;
                        i2 = -1051722504;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m35474(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws C4987 {
        JSONArray jSONArray;
        boolean z6;
        int iM45029;
        int i;
        int i2;
        String str;
        JSONArray jSONArray2;
        ArrayList arrayList;
        int i3;
        int iM11306;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int i7;
        String str2;
        boolean z7;
        float f;
        int iM450210;
        int i8;
        int i9;
        ArrayList arrayList2;
        int i10;
        int i11;
        String str3;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        byte[] bArr2;
        String str4;
        float f2;
        C1313 c1313;
        int i15;
        int i16;
        JSONArray jSONArray3;
        boolean z8;
        int i17;
        int i18;
        int i19;
        int i20;
        JSONArray jSONArray4;
        int i21;
        int i22;
        String str5;
        int i23;
        boolean z9;
        int iM4837;
        int i24;
        int iM450211;
        int i25;
        int iM11308;
        int i26;
        int i27;
        String str6;
        String str7;
        int i28;
        int iM4838;
        byte[] bArr3;
        float f3;
        JSONArray jSONArray5;
        String str8;
        JSONArray jSONArray6;
        boolean z10;
        int i29;
        int iM11309;
        int i30;
        int i31;
        int iM113010;
        int i32;
        int i33;
        int iM113011;
        int i34;
        int i35;
        String str9;
        float f4;
        boolean z11;
        int i36;
        int i37;
        int iM450212;
        int i38;
        int i39;
        int iM113012;
        int i40;
        int i41;
        int iM113013;
        int i42;
        int i43;
        boolean z12;
        int iM113014;
        int i44;
        int i45;
        int i46;
        int i47;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int iM113015;
        int i48;
        int i49;
        int iM113016;
        int i50;
        int i51;
        Iterator itM9705 = null;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        C12687 c12687 = null;
        Iterator itM4898 = null;
        int i55 = 0;
        AbstractC17131 abstractC17131 = null;
        Iterator it = null;
        Iterator itM9863 = null;
        C13308 c13308 = null;
        int[] iArr = null;
        Iterator itM9864 = null;
        int i56 = 0;
        int i57 = -721852249;
        int i58 = C0629.f2722;
        int i59 = C3660.f13403;
        int iM450213 = (i58 - C19806.m45029("ۚܰ")) * (-15);
        int i60 = ((iM450213 ^ i59) * 10349) ^ (-1792835099);
        int i61 = iM450213 ^ (-1106497947);
        C11018 c11018 = null;
        SharedPreferences sharedPreferences = null;
        Iterator itM5072 = null;
        String str10 = null;
        String strM10964 = null;
        InterfaceC6025 interfaceC6025 = null;
        byte[] bArr4 = null;
        Iterator itM10563 = null;
        Iterator itM10564 = null;
        C1313 c1314 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str11 = null;
        int length = 0;
        int iM31548 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        float f5 = 0.0f;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        int iM938 = 0;
        JSONArray jSONArray7 = null;
        boolean z13 = false;
        byte b = 0;
        float f6 = 0.0f;
        int i73 = 0;
        Iterator itM10565 = null;
        JSONArray jSONArray8 = null;
        String str12 = null;
        int i74 = 0;
        byte[] bArr5 = null;
        C12687 c12688 = null;
        int i75 = 0;
        int i76 = 0;
        while (true) {
            i57 = i61 ^ (i60 & (((i57 ^ i59) * 9019) >> 31));
            switch (i57) {
                case -2119946650:
                case -1503609788:
                    f = f6;
                    c11018.mo24508(i75);
                    C1977.m6358(c11018, interfaceC6025.mo16345(b, C2704.m8251(c12687)));
                    str12 = str12;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    z6 = z13;
                    length = length;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    str10 = str10;
                    f6 = f;
                    bArr4 = bArr4;
                    iM11306 = C19806.m45029("֨ۢ") ^ i59;
                    i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                    i5 = -55386947;
                    int i77 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i77;
                    float f7 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f7;
                    break;
                case -2115154236:
                case 84937978:
                    i37 = i74;
                    str9 = str11;
                    boolean z14 = z13;
                    i36 = length;
                    String str13 = str10;
                    f4 = f6;
                    try {
                        C15083 c15083 = new C15083(abstractC17131.mo1452(), abstractC17131.mo1448());
                        arrayList4 = arrayList5;
                        try {
                            C2249.m6905(arrayList4, c15083);
                            int length2 = ((byte[]) c15083.m36156()).length;
                            int iM450214 = (C19806.m45029("ۨܰ") ^ i59) * (-115);
                            i60 = ((iM450214 ^ i58) * 10331) ^ (-592510952);
                            i56 = length2;
                            f6 = f4;
                            str10 = str13;
                            arrayList5 = arrayList4;
                            length = i36;
                            i74 = i37;
                            z13 = z14;
                            str2 = str9;
                            i61 = iM450214 ^ 1599980438;
                            str11 = str2;
                        } catch (Exception unused) {
                            str5 = str13;
                            arrayList5 = arrayList4;
                            z11 = z14;
                            i20 = iM938;
                            iM450212 = ThreadFactoryC3888.m11306("۫ۨ") ^ i58;
                            i38 = ((iM450212 ^ i59) * 6017) ^ 803489748;
                            i39 = -1805010228;
                            int i78 = iM450212 ^ i39;
                            iM31548 = iM31548;
                            i73 = i73;
                            i75 = i75;
                            i67 = i67;
                            i60 = i38;
                            jSONArray8 = jSONArray8;
                            i64 = i64;
                            c1314 = c1314;
                            arrayList6 = arrayList6;
                            jSONArray7 = jSONArray7;
                            i71 = i71;
                            bArr4 = bArr4;
                            str11 = str9;
                            i61 = i78;
                            bArr5 = bArr5;
                            i69 = i69;
                            length = i36;
                            z13 = z11;
                            i68 = i68;
                            f6 = f4;
                            i74 = i37;
                            str10 = str5;
                            String str14 = str12;
                            iM938 = i20;
                            str12 = str14;
                        }
                    } catch (Exception unused2) {
                        arrayList4 = arrayList5;
                    }
                    break;
                case -2101975494:
                case 1072057330:
                    i74 = i74;
                    str11 = str11;
                    if (C0962.m3748(it)) {
                        iM45029 = (i59 - ThreadFactoryC3888.m11306("۠۠")) * 99;
                        i = ((iM45029 ^ i58) * (-17685)) ^ (-901732397);
                        i2 = -1901044942;
                    } else {
                        iM45029 = C19806.m45029("ܳۙ") ^ i58;
                        i = ((iM45029 ^ i59) * 7153) ^ (-1542534257);
                        i2 = 1527518538;
                    }
                    int i79 = iM45029 ^ i2;
                    str11 = str11;
                    i61 = i79;
                    i60 = i;
                    i74 = i74;
                    break;
                case -2093415271:
                case 188688808:
                    i37 = i74 + i56;
                    str9 = str11;
                    str5 = str10;
                    f4 = f6;
                    z11 = z13;
                    i36 = length;
                    i20 = iM938;
                    iM450212 = ThreadFactoryC3888.m11306("۫ۨ") ^ i58;
                    i38 = ((iM450212 ^ i59) * 6017) ^ 803489748;
                    i39 = -1805010228;
                    int i710 = iM450212 ^ i39;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    i67 = i67;
                    i60 = i38;
                    jSONArray8 = jSONArray8;
                    i64 = i64;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i71 = i71;
                    bArr4 = bArr4;
                    str11 = str9;
                    i61 = i710;
                    bArr5 = bArr5;
                    i69 = i69;
                    length = i36;
                    z13 = z11;
                    i68 = i68;
                    f6 = f4;
                    i74 = i37;
                    str10 = str5;
                    String str15 = str12;
                    iM938 = i20;
                    str12 = str15;
                    break;
                case -2045949335:
                case -1921482198:
                    i74 = i74;
                    str11 = str11;
                    z13 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    c13308 = (C13308) C0216.m1584(itM4898);
                    if (!c13308.m32809()) {
                        iM113015 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i59;
                        i48 = ((iM113015 ^ i58) * (-2717)) ^ 42023971;
                        i49 = 86353483;
                        int i80 = iM113015 ^ i49;
                        f6 = f6;
                        str11 = str11;
                        i61 = i80;
                        str10 = str10;
                        i60 = i48;
                        length = length;
                        i74 = i74;
                        z13 = z13;
                    } else {
                        z12 = z13;
                        arrayList3 = arrayList6;
                        i47 = i73;
                        int iM450215 = (C19806.m45029("۠ᩴ") + i59) * (-123);
                        str12 = str12;
                        i60 = ((iM450215 ^ i58) * (-30205)) ^ (-907134412);
                        i73 = i47;
                        jSONArray7 = jSONArray7;
                        arrayList6 = arrayList3;
                        i64 = i64;
                        str11 = str11;
                        i71 = i71;
                        i61 = iM450215 ^ (-1720733912);
                        bArr5 = bArr5;
                        bArr4 = bArr4;
                        i69 = i69;
                        i68 = i68;
                        i74 = i74;
                        float f8 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z12;
                        f6 = f8;
                        String str16 = str12;
                        iM938 = iM938;
                        str12 = str16;
                    }
                    break;
                case -2032886232:
                case 1689700061:
                    jSONArray7 = jSONArray7;
                    i67 = i67;
                    iM938 = iM938;
                    jSONArray7.add(1);
                    RunnableC1606.m5475(c11018, 1749442555);
                    c11018.m27799();
                    itM5072 = C1461.m5072(C23186.m51208());
                    i53 = 0;
                    iM450211 = C19806.m45029("ᩴᩴ") ^ i58;
                    i8 = ((iM450211 ^ i59) * (-28167)) ^ 620362560;
                    i25 = 699271807;
                    i46 = iM450211 ^ i25;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str17 = str12;
                    iM938 = iM938;
                    str12 = str17;
                    break;
                case -2029602987:
                case -390209701:
                    int i81 = i74;
                    String str18 = str11;
                    int i82 = i68;
                    byte[] bArr6 = bArr5;
                    int i83 = i69;
                    int i84 = i71;
                    byte[] bArr7 = bArr4;
                    JSONArray jSONArray9 = jSONArray7;
                    ArrayList arrayList7 = arrayList6;
                    int i85 = i64;
                    JSONArray jSONArray10 = jSONArray8;
                    int i86 = i73;
                    boolean z15 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z12 = z15;
                    int i87 = iM938;
                    str12 = str12;
                    iM938 = i87;
                    if (C0962.m3748(itM9705)) {
                        iM113014 = C19806.m45029("ܿۤ") ^ i59;
                        i44 = ((iM113014 ^ i58) * 28327) ^ 37942365;
                        i45 = 1065198811;
                    } else {
                        iM113014 = (ThreadFactoryC3888.m11306("ܶᩳ") + i58) * (-119);
                        i44 = ((iM113014 ^ i59) * 29263) ^ (-1758124167);
                        i45 = -1711772945;
                    }
                    int i88 = iM113014 ^ i45;
                    i73 = i86;
                    bArr4 = bArr7;
                    jSONArray8 = jSONArray10;
                    i69 = i83;
                    i64 = i85;
                    i68 = i82;
                    i71 = i84;
                    i74 = i81;
                    bArr5 = bArr6;
                    i61 = i88;
                    i60 = i44;
                    arrayList6 = arrayList7;
                    jSONArray7 = jSONArray9;
                    str11 = str18;
                    float f9 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z12;
                    f6 = f9;
                    String str19 = str12;
                    iM938 = iM938;
                    str12 = str19;
                    break;
                case -2022691867:
                case -1607679907:
                    jSONArray7 = jSONArray7;
                    iM938 = iM938;
                    i53++;
                    i67 = i67;
                    iM450211 = C19806.m45029("ᩴᩴ") ^ i58;
                    i8 = ((iM450211 ^ i59) * (-28167)) ^ 620362560;
                    i25 = 699271807;
                    i46 = iM450211 ^ i25;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str110 = str12;
                    iM938 = iM938;
                    str12 = str110;
                    break;
                case -2020784229:
                case 1589883594:
                    i74 = i74;
                    str11 = str11;
                    str12 = str12;
                    int i89 = i72;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    boolean z16 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z16;
                    if (RunnableC1564.m5348(itM4898)) {
                        int iM113017 = ThreadFactoryC3888.m11306("֨ۚ") ^ i58;
                        i72 = i89;
                        int i90 = ((iM113017 ^ i59) * 23229) ^ (-23962910);
                        int i91 = iM113017 ^ (-1788728161);
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i90;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f6;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i91;
                    } else {
                        i72 = i89;
                        iM11306 = C19806.m45029("ۖ᩸") ^ i59;
                        i64 = i64;
                        i4 = ((iM11306 ^ i58) * (-8749)) ^ (-591822250);
                        i5 = -1923046866;
                        int i711 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i711;
                        float f10 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f10;
                    }
                    break;
                case -2002444246:
                case 1748864441:
                    i74 = i74;
                    str11 = str11;
                    str12 = str12;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    i64 = i64;
                    boolean z17 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z17;
                    switch (c12687.m31548()) {
                        case 0:
                            iM11306 = (i58 - ThreadFactoryC3888.m11306("ۢ֫")) * (-59);
                            i4 = ((iM11306 ^ i59) * (-4447)) ^ (-924904801);
                            i5 = -57252737;
                            break;
                        case 1:
                            iM11306 = ThreadFactoryC3888.m11306("ۧ۫") ^ i58;
                            i4 = ((iM11306 ^ i59) * (-23397)) ^ 672827416;
                            i5 = 1835448434;
                            break;
                        case 2:
                            iM11306 = C19806.m45029("ۤۗ") ^ i59;
                            i4 = ((iM11306 ^ i58) * 21191) ^ (-1447090014);
                            i5 = -1652222566;
                            break;
                        case 3:
                            iM11306 = (ThreadFactoryC3888.m11306("ۙۚ") + i59) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i4 = ((iM11306 ^ i58) * 20603) ^ (-1042590091);
                            i5 = -431014798;
                            break;
                        case 4:
                            iM11306 = (ThreadFactoryC3888.m11306("۬᩷") ^ i58) * 101;
                            i4 = ((iM11306 ^ i59) * 8093) ^ 1712058;
                            i5 = -244615011;
                            break;
                        case 5:
                            iM11306 = ThreadFactoryC3888.m11306("֨ܶ") ^ i58;
                            i4 = ((iM11306 ^ i59) * 15725) ^ (-833780824);
                            i5 = -2039302968;
                            break;
                        case 6:
                            iM11306 = (C19806.m45029("֡᩹") ^ i59) * (-57);
                            i4 = ((iM11306 ^ i58) * (-28357)) ^ (-925049991);
                            i5 = 49976420;
                            break;
                        case 7:
                            iM11306 = (ThreadFactoryC3888.m11306("ۗ᩸") + i59) * (-77);
                            i4 = ((iM11306 ^ i58) * (-17075)) ^ 1704432005;
                            i5 = -2128751583;
                            break;
                        default:
                            iM11306 = (C19806.m45029("֡᩶") ^ i58) * (-29);
                            i4 = ((iM11306 ^ i59) * (-31301)) ^ (-1177185807);
                            i5 = -1151283029;
                            break;
                    }
                    int i712 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i712;
                    float f11 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f11;
                    break;
                case -1998360533:
                case -39641836:
                    arrayList2 = arrayList6;
                    i10 = iM31548;
                    i11 = i74;
                    str3 = str11;
                    i12 = i68;
                    bArr = bArr5;
                    i13 = i69;
                    i14 = i71;
                    bArr2 = bArr4;
                    str4 = str10;
                    f2 = f6;
                    c1313 = c1314;
                    i15 = i75;
                    i16 = i64;
                    jSONArray3 = jSONArray8;
                    z8 = z13;
                    i17 = i73;
                    i18 = length;
                    i19 = i66;
                    int i92 = iM938;
                    str12 = str12;
                    i20 = i92;
                    jSONArray4 = new JSONArray();
                    c11018 = new C11018();
                    i70 = 3;
                    i21 = 1;
                    i65 = 0;
                    if (z) {
                        int iM113018 = ThreadFactoryC3888.m11306("ۜۙ") ^ i58;
                        i66 = i19;
                        i73 = i17;
                        arrayList6 = arrayList2;
                        length = i18;
                        z13 = z8;
                        str11 = str3;
                        jSONArray7 = jSONArray4;
                        i61 = iM113018 ^ 51508555;
                        i60 = ((iM113018 ^ i59) * (-8027)) ^ (-786860212);
                        jSONArray8 = jSONArray3;
                        iM31548 = i10;
                        i64 = i16;
                        f6 = f2;
                        str10 = str4;
                        i75 = i15;
                        i67 = 1;
                        i71 = i14;
                        c1314 = c1313;
                        bArr5 = bArr;
                    } else {
                        int iM450216 = C19806.m45029("֨᩷") ^ i58;
                        int i93 = ((iM450216 ^ i59) * (-19865)) ^ (-1379708778);
                        i66 = i19;
                        i73 = i17;
                        length = i18;
                        z13 = z8;
                        str11 = str3;
                        i61 = iM450216 ^ (-1027109504);
                        jSONArray8 = jSONArray3;
                        iM31548 = i10;
                        i64 = i16;
                        f6 = f2;
                        str10 = str4;
                        i67 = i21;
                        i71 = i14;
                        arrayList6 = arrayList2;
                        jSONArray7 = jSONArray4;
                        i60 = i93;
                        bArr5 = bArr;
                        i75 = i15;
                        c1314 = c1313;
                    }
                    bArr4 = bArr2;
                    i69 = i13;
                    i68 = i12;
                    i74 = i11;
                    String str111 = str12;
                    iM938 = i20;
                    str12 = str111;
                    break;
                case -1988873811:
                case 418156403:
                    i74 = i74;
                    str11 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str10 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z13 = z13;
                    i73 = i73;
                    length = length;
                    i66 = i66;
                    i67 = i67;
                    iM31548 = iM31548;
                    int i94 = iM938;
                    str12 = str12;
                    iM938 = i94;
                    if (z3) {
                        iM450211 = (C19806.m45029("ۛۨ") + i58) * 81;
                        i8 = ((iM450211 ^ i59) * 24359) ^ (-888681676);
                        i25 = -1443642997;
                    } else {
                        iM450211 = C19806.m45029("ۚ۟") ^ i59;
                        i8 = ((iM450211 ^ i58) * (-8417)) ^ 1201308264;
                        i25 = 57614666;
                    }
                    i46 = iM450211 ^ i25;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str112 = str12;
                    iM938 = iM938;
                    str12 = str112;
                    break;
                case -1968294437:
                case -995027688:
                    i37 = i74;
                    str9 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str10;
                    f4 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z11 = z13;
                    i73 = i73;
                    i36 = length;
                    int i95 = iM938;
                    str12 = str12;
                    i20 = i95;
                    if (i52 >= 0) {
                        i73 = i52;
                        int iM450217 = C19806.m45029("᩶᩺") ^ i59;
                        jSONArray8 = jSONArray8;
                        iM31548 = iM31548;
                        i64 = i64;
                        i75 = i75;
                        i67 = i67;
                        i60 = ((iM450217 ^ i58) * (-24565)) ^ (-1179772275);
                        i71 = i71;
                        c1314 = c1314;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray7;
                        bArr5 = bArr5;
                        bArr4 = bArr4;
                        str11 = str9;
                        i61 = iM450217 ^ (-1659703869);
                        i69 = i69;
                        length = i36;
                        z13 = z11;
                        i68 = i68;
                        f6 = f4;
                        i74 = i37;
                        str10 = str5;
                        String str113 = str12;
                        iM938 = i20;
                        str12 = str113;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("᩶᩻") ^ i58;
                        i38 = ((iM450212 ^ i59) * (-11941)) ^ (-217983979);
                        i39 = -2133176034;
                        int i713 = iM450212 ^ i39;
                        iM31548 = iM31548;
                        i73 = i73;
                        i75 = i75;
                        i67 = i67;
                        i60 = i38;
                        jSONArray8 = jSONArray8;
                        i64 = i64;
                        c1314 = c1314;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray7;
                        i71 = i71;
                        bArr4 = bArr4;
                        str11 = str9;
                        i61 = i713;
                        bArr5 = bArr5;
                        i69 = i69;
                        length = i36;
                        z13 = z11;
                        i68 = i68;
                        f6 = f4;
                        i74 = i37;
                        str10 = str5;
                        String str114 = str12;
                        iM938 = i20;
                        str12 = str114;
                    }
                    break;
                case -1942961022:
                case 173837969:
                    throw new IllegalStateException(str12);
                case -1934595127:
                case 1869195942:
                    int i96 = i74;
                    str11 = str11;
                    str12 = str12;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    i64 = i64;
                    boolean z18 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z18;
                    if (i96 <= 102400) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩶") ^ i59;
                        i74 = i96;
                        i4 = ((iM11306 ^ i58) * (-1681)) ^ 2083383600;
                        i5 = 936396311;
                    } else {
                        i74 = i96;
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܳ") + i59) * (-55);
                        i4 = ((iM11306 ^ i58) * (-16971)) ^ 1482730823;
                        i5 = -926918373;
                    }
                    int i714 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i714;
                    float f12 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f12;
                    break;
                case -1890207222:
                case 1436655792:
                    i74 = i74;
                    str11 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str10 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z13 = z13;
                    i73 = i73;
                    length = length;
                    i66 = i66;
                    i67 = i67;
                    iM31548 = iM31548;
                    int i97 = iM938;
                    str12 = str12;
                    iM938 = i97;
                    jSONArray7.add(4);
                    RunnableC1606.m5475(c11018, 1749442557);
                    c11018.m27799();
                    c11018.m27782((CharSequence) C0817.m3407(C5717.m15756()));
                    c11018.m27777();
                    C2477.m7595(c11018, 1749442559);
                    c11018.m27799();
                    c11018.m27782((CharSequence) C2124.m6674(C4757.m13208()));
                    c11018.m27777();
                    iM450211 = C19806.m45029("ۚ۟") ^ i59;
                    i8 = ((iM450211 ^ i58) * (-8417)) ^ 1201308264;
                    i25 = 57614666;
                    i46 = iM450211 ^ i25;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str115 = str12;
                    iM938 = iM938;
                    str12 = str115;
                    break;
                case -1836364511:
                case -1725699256:
                    i74 = i74;
                    str11 = str11;
                    String strM32814 = c13308.m32814();
                    if (strM32814 != null) {
                        str11 = strM32814;
                        int iM450218 = C19806.m45029("ܿܿ") ^ i59;
                        i = ((iM450218 ^ i58) * (-17717)) ^ (-1519464954);
                        i61 = iM450218 ^ (-1304695926);
                        i60 = i;
                        i74 = i74;
                    } else {
                        iM45029 = C19806.m45029("ۙܰ") ^ i58;
                        i = ((iM45029 ^ i59) * (-31049)) ^ (-662025815);
                        i2 = -1172442447;
                        int i715 = iM45029 ^ i2;
                        str11 = str11;
                        i61 = i715;
                        i60 = i;
                        i74 = i74;
                    }
                    break;
                case -1831612623:
                case 1887356998:
                    c11018.mo24508(i75);
                    z7 = z13;
                    c11018.m27784(C1189.m4371(interfaceC6025, CallableC1627.m5506(c12687), z7));
                    z6 = z7;
                    jSONArray = jSONArray7;
                    str10 = str10;
                    arrayList6 = arrayList6;
                    f6 = f6;
                    iM11306 = C19806.m45029("֨ۢ") ^ i59;
                    i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                    i5 = -55386947;
                    int i716 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i716;
                    float f13 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f13;
                    break;
                case -1816735969:
                case 279692668:
                    i37 = i74;
                    str9 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    String str20 = str12;
                    i71 = i71;
                    bArr4 = bArr4;
                    i20 = iM938;
                    jSONArray7 = jSONArray7;
                    arrayList6 = arrayList6;
                    i64 = i64;
                    boolean z19 = z13;
                    i36 = length;
                    String str21 = str10;
                    f4 = f6;
                    z11 = z19;
                    str12 = str20;
                    str5 = str21;
                    i67 = i67;
                    jSONArray8 = jSONArray8;
                    c1314 = c1314;
                    i73 = 0;
                    iM31548 = iM31548;
                    i75 = i75;
                    int iM450219 = C19806.m45029("᩶᩺") ^ i59;
                    jSONArray8 = jSONArray8;
                    iM31548 = iM31548;
                    i64 = i64;
                    i75 = i75;
                    i67 = i67;
                    i60 = ((iM450219 ^ i58) * (-24565)) ^ (-1179772275);
                    i71 = i71;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    bArr5 = bArr5;
                    bArr4 = bArr4;
                    str11 = str9;
                    i61 = iM450219 ^ (-1659703869);
                    i69 = i69;
                    length = i36;
                    z13 = z11;
                    i68 = i68;
                    f6 = f4;
                    i74 = i37;
                    str10 = str5;
                    String str116 = str12;
                    iM938 = i20;
                    str12 = str116;
                    break;
                case -1812729172:
                case -1769102555:
                    str9 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str10;
                    f4 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z11 = z13;
                    i73 = i73;
                    i36 = length;
                    i20 = iM938;
                    arrayList5 = new ArrayList();
                    itM9705 = MenuItemOnMenuItemClickListenerC3244.m9705(C23053.m51002());
                    i37 = 0;
                    iM450212 = ThreadFactoryC3888.m11306("۫ۨ") ^ i58;
                    i38 = ((iM450212 ^ i59) * 6017) ^ 803489748;
                    i39 = -1805010228;
                    int i717 = iM450212 ^ i39;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    i67 = i67;
                    i60 = i38;
                    jSONArray8 = jSONArray8;
                    i64 = i64;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i71 = i71;
                    bArr4 = bArr4;
                    str11 = str9;
                    i61 = i717;
                    bArr5 = bArr5;
                    i69 = i69;
                    length = i36;
                    z13 = z11;
                    i68 = i68;
                    f6 = f4;
                    i74 = i37;
                    str10 = str5;
                    String str117 = str12;
                    iM938 = i20;
                    str12 = str117;
                    break;
                case -1806271652:
                case 604528073:
                    i74 = i74;
                    str11 = str11;
                    String str22 = str12;
                    byte[] bArr8 = bArr4;
                    i20 = iM938;
                    jSONArray7 = jSONArray7;
                    arrayList6 = arrayList6;
                    int i98 = i71;
                    i64 = i64;
                    boolean z20 = z13;
                    length = length;
                    String str23 = str10;
                    f6 = f6;
                    z9 = z20;
                    c11018.m27787(sharedPreferences.getInt(C2704.m8251(c12688), 0));
                    str12 = str22;
                    str5 = str23;
                    i67 = i67;
                    jSONArray8 = jSONArray8;
                    bArr5 = bArr5;
                    c1314 = c1314;
                    i73 = i73;
                    i71 = i98;
                    iM31548 = iM31548;
                    i75 = i75;
                    int i99 = i69;
                    bArr4 = bArr8;
                    i68 = i68;
                    i69 = i99;
                    i22 = i67;
                    iM4837 = i68;
                    i23 = i65;
                    i24 = i76;
                    int iM113019 = (i59 - ThreadFactoryC3888.m11306("۠᩺")) * (-113);
                    i65 = i23;
                    iM31548 = iM31548;
                    i73 = i73;
                    i74 = i74;
                    jSONArray8 = jSONArray8;
                    i67 = i22;
                    i64 = i64;
                    i66 = i24;
                    i71 = i71;
                    i75 = i75;
                    bArr5 = bArr5;
                    c1314 = c1314;
                    bArr4 = bArr4;
                    i69 = i69;
                    i68 = iM4837;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    i61 = iM113019 ^ (-81834960);
                    i60 = ((iM113019 ^ i58) * 32311) ^ (-552864510);
                    length = length;
                    z13 = z9;
                    f6 = f6;
                    str10 = str5;
                    String str118 = str12;
                    iM938 = i20;
                    str12 = str118;
                    break;
                case -1799234740:
                case -4558246:
                    i74 = i74;
                    str11 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str10 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z13 = z13;
                    i73 = i73;
                    length = length;
                    i66 = i66;
                    i67 = i67;
                    iM31548 = iM31548;
                    int i100 = iM938;
                    str12 = str12;
                    iM938 = i100;
                    if (z4) {
                        iM450211 = C19806.m45029("ۧۚ") ^ i59;
                        i8 = ((iM450211 ^ i58) * 25757) ^ (-1841553829);
                        i25 = 1019748317;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("ܳۜ") ^ i58;
                        i8 = ((iM450211 ^ i59) * 23587) ^ (-527746625);
                        i25 = 246105298;
                    }
                    i46 = iM450211 ^ i25;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str119 = str12;
                    iM938 = iM938;
                    str12 = str119;
                    break;
                case -1795762341:
                case -1602316353:
                    ArrayList arrayList8 = arrayList5;
                    jSONArray = jSONArray7;
                    jSONArray.add(5);
                    RunnableC1606.m5475(c11018, 1749442558);
                    c11018.m27799();
                    c11018.mo24508(C1377.m4837(arrayList8));
                    Iterator itM9865 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList8);
                    z6 = z13;
                    C7105.m18988(itM9865, ThreadFactoryC3888.m11312(f48399, 230, 13, i62));
                    it = itM9865;
                    iM11307 = C19806.m45029("֨᩶") ^ i58;
                    i6 = ((iM11307 ^ i59) * (-18401)) ^ 113337631;
                    i7 = -1848017104;
                    int i101 = iM11307 ^ i7;
                    i74 = i74;
                    String str24 = str11;
                    i61 = i101;
                    i60 = i6;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str24;
                    float f14 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f14;
                    break;
                case -1793207678:
                case -815254785:
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z21 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z21;
                    if (!interfaceC6025.mo16346(25, C2704.m8251(c12687))) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i718 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i718;
                        float f15 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f15;
                    } else {
                        iM11307 = C19806.m45029("᩻᩵") ^ i58;
                        i6 = ((iM11307 ^ i59) * (-11715)) ^ 549161646;
                        i7 = -108407253;
                        int i102 = iM11307 ^ i7;
                        i74 = i74;
                        String str25 = str11;
                        i61 = i102;
                        i60 = i6;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str25;
                        float f16 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f16;
                    }
                    break;
                case -1788768601:
                case -1416979767:
                    int i103 = i74;
                    str = str11;
                    int i104 = i67;
                    int i105 = i68;
                    byte[] bArr9 = bArr5;
                    int i106 = i71;
                    byte[] bArr10 = bArr4;
                    int i107 = iM938;
                    jSONArray2 = jSONArray7;
                    String str26 = str10;
                    float f17 = f6;
                    C1313 c1315 = c1314;
                    arrayList = arrayList6;
                    int i108 = iM31548;
                    int i109 = i64;
                    JSONArray jSONArray11 = jSONArray8;
                    boolean z22 = z13;
                    int i110 = i73;
                    int i111 = length;
                    c11018.mo24508(65535);
                    c11018.m27777();
                    c11018.m27777();
                    C2477.m7595(c11018, 1749442560);
                    c11018.m27799();
                    c11018.m27775(1);
                    int iM939 = C0050.m938(m35471());
                    int i112 = (iM939 + 7) / 8;
                    int i113 = i75;
                    String strM10901 = C3722.m10901(f48399, Primes.SMALL_FACTOR_LIMIT, 13, i62);
                    if (i105 == i112) {
                        iM113012 = (C19806.m45029("ۛܳ") + i59) * (-17);
                        i40 = ((iM113012 ^ i58) * (-8321)) ^ 367836105;
                        i41 = 518943417;
                    } else {
                        iM113012 = (ThreadFactoryC3888.m11306("۠ۘ") ^ i58) * (-23);
                        i40 = ((iM113012 ^ i59) * 22137) ^ 1368858908;
                        i41 = 1075934520;
                    }
                    i3 = iM113012 ^ i41;
                    i73 = i110;
                    iM938 = i107;
                    i75 = i113;
                    str12 = strM10901;
                    jSONArray8 = jSONArray11;
                    i64 = i109;
                    c1314 = c1315;
                    length = i111;
                    z13 = z22;
                    i71 = i106;
                    bArr4 = bArr10;
                    f6 = f17;
                    str10 = str26;
                    bArr5 = bArr9;
                    i69 = iM939;
                    i68 = i105;
                    i74 = i103;
                    i67 = i104;
                    i60 = i40;
                    iM31548 = i108;
                    String str27 = str;
                    i61 = i3;
                    arrayList6 = arrayList;
                    jSONArray7 = jSONArray2;
                    str11 = str27;
                    break;
                case -1734424192:
                case -515533267:
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z23 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z23;
                    if (!interfaceC6025.mo16346(23, C2704.m8251(c12687))) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i719 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i719;
                        float f18 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f18;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩷᩶") ^ i58;
                        i6 = ((iM11307 ^ i59) * 25817) ^ 583567187;
                        i7 = -1282938775;
                        int i1010 = iM11307 ^ i7;
                        i74 = i74;
                        String str28 = str11;
                        i61 = i1010;
                        i60 = i6;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str28;
                        float f19 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f19;
                    }
                    break;
                case -1728204076:
                case 1641993729:
                    i74 = i74;
                    str11 = str11;
                    if (iM31548 == i63) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۢ") ^ i59;
                        i = ((iM45029 ^ i58) * (-16853)) ^ 435028389;
                        i2 = -1121707217;
                    } else {
                        iM45029 = C19806.m45029("᩺ۨ") ^ i58;
                        i = ((iM45029 ^ i59) * 21865) ^ 706130883;
                        i2 = 578896569;
                    }
                    int i7110 = iM45029 ^ i2;
                    str11 = str11;
                    i61 = i7110;
                    i60 = i;
                    i74 = i74;
                    break;
                case -1723521025:
                case -1508536404:
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z24 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z24;
                    if (iM31548 != 6) {
                        iM11307 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i59;
                        i6 = ((iM11307 ^ i58) * 1297) ^ 1741042880;
                        i7 = 256944341;
                    } else {
                        iM11307 = (C19806.m45029("ܺۜ") ^ i58) * 67;
                        i6 = ((iM11307 ^ i59) * (-25427)) ^ (-807053668);
                        i7 = 1235549086;
                    }
                    int i1011 = iM11307 ^ i7;
                    i74 = i74;
                    String str29 = str11;
                    i61 = i1011;
                    i60 = i6;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str29;
                    float f110 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f110;
                    break;
                case -1681168843:
                case -1577392627:
                    i11 = i74;
                    str3 = str11;
                    int i114 = iM938;
                    JSONArray jSONArray12 = jSONArray7;
                    arrayList2 = arrayList6;
                    boolean z25 = z13;
                    i18 = length;
                    String str30 = str10;
                    f2 = f6;
                    z8 = z25;
                    c11018.m27775(i114);
                    int i115 = i71;
                    byte[] bArr11 = bArr4;
                    c11018.write(bArr11, i72, i115);
                    c11018.m27777();
                    str4 = str30;
                    i16 = i64;
                    i19 = i66;
                    jSONArray3 = jSONArray8;
                    bArr = bArr5;
                    str12 = str12;
                    c1313 = c1314;
                    i17 = i73;
                    i20 = i114;
                    i14 = i115;
                    i15 = i75;
                    jSONArray4 = jSONArray12;
                    i21 = i67;
                    i10 = iM31548;
                    int i116 = i69;
                    bArr2 = bArr11;
                    i12 = i68;
                    i13 = i116;
                    int iM4502110 = C19806.m45029("֨᩷") ^ i58;
                    int i910 = ((iM4502110 ^ i59) * (-19865)) ^ (-1379708778);
                    i66 = i19;
                    i73 = i17;
                    length = i18;
                    z13 = z8;
                    str11 = str3;
                    i61 = iM4502110 ^ (-1027109504);
                    jSONArray8 = jSONArray3;
                    iM31548 = i10;
                    i64 = i16;
                    f6 = f2;
                    str10 = str4;
                    i67 = i21;
                    i71 = i14;
                    arrayList6 = arrayList2;
                    jSONArray7 = jSONArray4;
                    i60 = i910;
                    bArr5 = bArr;
                    i75 = i15;
                    c1314 = c1313;
                    bArr4 = bArr2;
                    i69 = i13;
                    i68 = i12;
                    i74 = i11;
                    String str1110 = str12;
                    iM938 = i20;
                    str12 = str1110;
                    break;
                case -1650753553:
                case 1440286232:
                    C2249.m6905(arrayList6, new C16920((C11897) C0216.m1584(itM9864), str11));
                    iM113016 = ThreadFactoryC3888.m11306("ۘ֫") ^ i59;
                    i50 = ((iM113016 ^ i58) * (-3359)) ^ (-1636190752);
                    i51 = 661036621;
                    i61 = iM113016 ^ i51;
                    i60 = i50;
                    break;
                case -1606291809:
                case 1437418237:
                    iM938 = iM938;
                    i62 = 24879;
                    iM450210 = C19806.m45029("֫᩻") ^ i59;
                    i8 = ((iM450210 ^ i58) * 15075) ^ 194970746;
                    i9 = 525179736;
                    i46 = iM450210 ^ i9;
                    i65 = i65;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str1111 = str12;
                    iM938 = iM938;
                    str12 = str1111;
                    break;
                case -1595181454:
                case 435249337:
                    c11018.mo24508(i75);
                    f = f6;
                    c11018.m27778(interfaceC6025.getFloat(CallableC1627.m5506(c12687), f));
                    str12 = str12;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    z6 = z13;
                    length = length;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    str10 = str10;
                    f6 = f;
                    bArr4 = bArr4;
                    iM11306 = C19806.m45029("֨ۢ") ^ i59;
                    i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                    i5 = -55386947;
                    int i7111 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i7111;
                    float f111 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f111;
                    break;
                case -1582887108:
                case -176269564:
                    throw new C4987(ThreadFactoryC3888.m11306(C0629.m2906(f48399, 227, 3, i62)) ^ 2124290975);
                case -1565140293:
                case 2114565202:
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z26 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z26;
                    if (!interfaceC6025.mo16346(21, C2704.m8251(c12687))) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i7112 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i7112;
                        float f112 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f112;
                    } else {
                        iM11307 = (i58 - C19806.m45029("᩻ۤ")) * 115;
                        i6 = ((iM11307 ^ i59) * (-11049)) ^ (-1206769328);
                        i7 = -564703231;
                        int i1012 = iM11307 ^ i7;
                        i74 = i74;
                        String str210 = str11;
                        i61 = i1012;
                        i60 = i6;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str210;
                        float f113 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f113;
                    }
                    break;
                case -1534375404:
                case 56192258:
                    i74 = i74;
                    str11 = str11;
                    boolean z27 = z13;
                    length = length;
                    String strM7076 = C2332.m7076(interfaceC6025, C2704.m8251(c12687), null);
                    C0629.m2908(strM7076);
                    byte[] bArrM3742 = C0962.m3742(strM7076, C7590.f25134);
                    str10 = str10;
                    C7105.m18988(bArrM3742, str10);
                    c11018.mo24508(i75);
                    f6 = f6;
                    c11018.m27775(bArrM3742.length);
                    c11018.write(bArrM3742, 0, bArrM3742.length);
                    z6 = z27;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    iM11306 = C19806.m45029("֨ۢ") ^ i59;
                    i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                    i5 = -55386947;
                    int i7113 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i7113;
                    float f114 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f114;
                    break;
                case -1503141573:
                case -1452082942:
                    str11 = "";
                    i74 = i74;
                    int iM4502111 = C19806.m45029("ܿܿ") ^ i59;
                    i = ((iM4502111 ^ i58) * (-17717)) ^ (-1519464954);
                    i61 = iM4502111 ^ (-1304695926);
                    i60 = i;
                    i74 = i74;
                    break;
                case -1477080124:
                case 1749209944:
                    i74 = i74;
                    str11 = str11;
                    if (RunnableC1564.m5348(itM9863)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ֡") + i58) * 99;
                        i = ((iM45029 ^ i59) * (-22307)) ^ 374374613;
                        i2 = -147052000;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܽ") ^ i59;
                        i = ((iM45029 ^ i58) * 8313) ^ 944102916;
                        i2 = 1626720346;
                    }
                    int i7114 = iM45029 ^ i2;
                    str11 = str11;
                    i61 = i7114;
                    i60 = i;
                    i74 = i74;
                    break;
                case -1462541795:
                case 1006346510:
                    i74 = i74;
                    str11 = str11;
                    str12 = str12;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    i64 = i64;
                    boolean z28 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z28;
                    abstractC17131 = (AbstractC17131) C0216.m1584(itM9705);
                    iM11306 = (i58 - C19806.m45029("᩹ܽ")) * (-91);
                    i4 = ((iM11306 ^ i59) * (-5049)) ^ (-1403370869);
                    i5 = -1718986076;
                    int i7115 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i7115;
                    float f115 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f115;
                    break;
                case -1438188900:
                case 276758258:
                    i74 = i74;
                    str11 = str11;
                    i22 = i67;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    i23 = i65;
                    jSONArray8 = jSONArray8;
                    z9 = z13;
                    i73 = i73;
                    length = length;
                    int i117 = iM938;
                    str12 = str12;
                    i20 = i117;
                    jSONArray7.add(i23);
                    C2477.m7595(c11018, 1749442554);
                    c11018.m27799();
                    C17625 c17625M35471 = m35471();
                    SharedPreferences sharedPreferences2 = ApplicationC0716.f2988;
                    C1937.m6286(sharedPreferences2, C7105.m18989(f48399, 162, 3, i62));
                    iM4837 = (C1377.m4837(c17625M35471) + 7) / 8;
                    C2477.m7595(c11018, 1749442553);
                    c11018.m27799();
                    i24 = 0;
                    itM10565 = C3577.m10563(c17625M35471);
                    sharedPreferences = sharedPreferences2;
                    bArr5 = new byte[iM4837];
                    i63 = 7;
                    int iM1130110 = (i59 - ThreadFactoryC3888.m11306("۠᩺")) * (-113);
                    i65 = i23;
                    iM31548 = iM31548;
                    i73 = i73;
                    i74 = i74;
                    jSONArray8 = jSONArray8;
                    i67 = i22;
                    i64 = i64;
                    i66 = i24;
                    i71 = i71;
                    i75 = i75;
                    bArr5 = bArr5;
                    c1314 = c1314;
                    bArr4 = bArr4;
                    i69 = i69;
                    i68 = iM4837;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    i61 = iM1130110 ^ (-81834960);
                    i60 = ((iM1130110 ^ i58) * 32311) ^ (-552864510);
                    length = length;
                    z13 = z9;
                    f6 = f6;
                    str10 = str5;
                    String str1112 = str12;
                    iM938 = i20;
                    str12 = str1112;
                    break;
                case -1419320755:
                case -646487918:
                    jSONArray5 = jSONArray7;
                    str8 = str10;
                    i29 = i73;
                    z10 = z13;
                    iM938 = iM938;
                    jSONArray5.add(3);
                    C2477.m7595(c11018, 1749442556);
                    c11018.m27799();
                    jSONArray6 = new JSONArray();
                    itM10564 = C3577.m10563(C21512.m48156());
                    iM11309 = (ThreadFactoryC3888.m11306("۫ۚ") + i58) * (-99);
                    i30 = ((iM11309 ^ i59) * 7777) ^ 1968881437;
                    i31 = 1356717894;
                    i35 = iM11309 ^ i31;
                    i66 = i66;
                    i73 = i29;
                    length = length;
                    z13 = z10;
                    i75 = i75;
                    jSONArray8 = jSONArray6;
                    i64 = i64;
                    c1314 = c1314;
                    f6 = f6;
                    str10 = str8;
                    i71 = i71;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    int i118 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i118;
                    String str31 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str31;
                    String str120 = str12;
                    iM938 = iM938;
                    str12 = str120;
                    break;
                case -1376531226:
                case 1940823671:
                    C16920 c16920 = (C16920) C0216.m1584(itM9863);
                    c16920.m39607().m29668(c11018);
                    c11018.m27786(c16920.m39609());
                    iM113015 = C19806.m45029("ܶ۟") ^ i59;
                    i48 = ((iM113015 ^ i58) * 29283) ^ (-1662818922);
                    i49 = 811289838;
                    int i810 = iM113015 ^ i49;
                    f6 = f6;
                    str11 = str11;
                    i61 = i810;
                    str10 = str10;
                    i60 = i48;
                    length = length;
                    i74 = i74;
                    z13 = z13;
                    break;
                case -1364415564:
                case 985830459:
                    i74 = i74;
                    str11 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str10 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z13 = z13;
                    i73 = i73;
                    length = length;
                    i66 = i66;
                    i67 = i67;
                    iM31548 = iM31548;
                    int i119 = iM938;
                    str12 = str12;
                    iM938 = i119;
                    if (C0962.m3748(itM5072)) {
                        iM450211 = (i58 - C19806.m45029("ܶܶ")) * 43;
                        i8 = ((iM450211 ^ i59) * 14589) ^ 1459992345;
                        i25 = 99840036;
                    } else {
                        iM450211 = (C19806.m45029("۬۠") ^ i58) * 71;
                        i8 = ((iM450211 ^ i59) * (-21509)) ^ 1166757781;
                        i25 = -1978054943;
                    }
                    i46 = iM450211 ^ i25;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str1113 = str12;
                    iM938 = iM938;
                    str12 = str1113;
                    break;
                case -1359289921:
                case 2071752358:
                    str7 = str10;
                    iM938 = iM938;
                    c11018.mo24508(65535);
                    c11018.m27777();
                    C17625 c17625M35478 = m35478();
                    InterfaceC6025 interfaceC6026 = ApplicationC0716.f2992;
                    i28 = i67;
                    C7105.m18988(interfaceC6026, C0962.m3747(f48399, 207, 4, i62));
                    iM4838 = (C1377.m4837(c17625M35478) + i63) / 8;
                    RunnableC1606.m5475(c11018, 1749442553);
                    c11018.m27799();
                    itM10563 = C3577.m10563(c17625M35478);
                    interfaceC6025 = interfaceC6026;
                    bArr3 = new byte[iM4838];
                    f3 = f5;
                    i55 = i28;
                    i75 = 0;
                    int iM113020 = (i59 - ThreadFactoryC3888.m11306("۬ۨ")) * (-111);
                    int i120 = iM4838;
                    i60 = ((iM113020 ^ i58) * (-26647)) ^ 1043233988;
                    i73 = i73;
                    c1314 = c1314;
                    str10 = str7;
                    bArr4 = bArr3;
                    jSONArray8 = jSONArray8;
                    i64 = i64;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i71 = i120;
                    str11 = str11;
                    i69 = i69;
                    i61 = iM113020 ^ 2027939698;
                    i68 = i68;
                    bArr5 = bArr5;
                    i74 = i74;
                    int i121 = i28;
                    i66 = i66;
                    length = length;
                    z13 = z13;
                    f6 = f3;
                    iM31548 = iM31548;
                    i67 = i121;
                    String str1114 = str12;
                    iM938 = iM938;
                    str12 = str1114;
                    break;
                case -1329043747:
                case 859704041:
                    if (!C0962.m3748(itM9864)) {
                        i74 = i74;
                        str11 = str11;
                        arrayList3 = arrayList6;
                        i47 = i73;
                        boolean z29 = z13;
                        length = length;
                        str10 = str10;
                        f6 = f6;
                        z12 = z29;
                        int iM4502112 = (C19806.m45029("۠ᩴ") + i59) * (-123);
                        str12 = str12;
                        i60 = ((iM4502112 ^ i58) * (-30205)) ^ (-907134412);
                        i73 = i47;
                        jSONArray7 = jSONArray7;
                        arrayList6 = arrayList3;
                        i64 = i64;
                        str11 = str11;
                        i71 = i71;
                        i61 = iM4502112 ^ (-1720733912);
                        bArr5 = bArr5;
                        bArr4 = bArr4;
                        i69 = i69;
                        i68 = i68;
                        i74 = i74;
                        float f20 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z12;
                        f6 = f20;
                        String str1115 = str12;
                        iM938 = iM938;
                        str12 = str1115;
                    } else {
                        iM113016 = (i58 - ThreadFactoryC3888.m11306("᩶᩷")) * (-89);
                        i50 = ((iM113016 ^ i59) * (-3883)) ^ 850399641;
                        i51 = 1788857069;
                        i61 = iM113016 ^ i51;
                        i60 = i50;
                    }
                    break;
                case -1317658460:
                case 170649770:
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z30 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z30;
                    if (!interfaceC6025.mo16346(26, C2704.m8251(c12687))) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i7116 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i7116;
                        float f116 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f116;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܺ᩶") ^ i58;
                        i6 = ((iM11307 ^ i59) * (-20225)) ^ (-762002305);
                        i7 = -967973270;
                        int i1013 = iM11307 ^ i7;
                        i74 = i74;
                        String str211 = str11;
                        i61 = i1013;
                        i60 = i6;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str211;
                        float f117 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f117;
                    }
                    break;
                case -1214053741:
                case 1282951841:
                    i74 = i74;
                    str11 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    arrayList6 = arrayList6;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    boolean z31 = z13;
                    length = length;
                    String str32 = str10;
                    f6 = f6;
                    z13 = z31;
                    int i122 = iM938;
                    str12 = str12;
                    iM938 = i122;
                    c11018.m27782((CharSequence) C2124.m6674(jSONArray8));
                    c11018.m27777();
                    str10 = str32;
                    i73 = i73;
                    i66 = i66;
                    i67 = i67;
                    c1314 = c1314;
                    iM31548 = iM31548;
                    i75 = i75;
                    iM450211 = ThreadFactoryC3888.m11306("ܳۜ") ^ i58;
                    i8 = ((iM450211 ^ i59) * 23587) ^ (-527746625);
                    i25 = 246105298;
                    i46 = iM450211 ^ i25;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str1116 = str12;
                    iM938 = iM938;
                    str12 = str1116;
                    break;
                case -1154722954:
                case 1214456712:
                    i74 = i74;
                    str11 = str11;
                    c11018.m27777();
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray5 = jSONArray7;
                    str8 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray6 = jSONArray8;
                    z10 = z13;
                    i29 = i73;
                    length = length;
                    i66 = i66;
                    int i123 = iM938;
                    str12 = str12;
                    iM938 = i123;
                    iM11309 = (ThreadFactoryC3888.m11306("ۧ᩵") ^ i58) * 23;
                    i30 = ((iM11309 ^ i59) * 17481) ^ 2111531630;
                    i31 = -1712362142;
                    i35 = iM11309 ^ i31;
                    i66 = i66;
                    i73 = i29;
                    length = length;
                    z13 = z10;
                    i75 = i75;
                    jSONArray8 = jSONArray6;
                    i64 = i64;
                    c1314 = c1314;
                    f6 = f6;
                    str10 = str8;
                    i71 = i71;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    int i1110 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i1110;
                    String str33 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str33;
                    String str121 = str12;
                    iM938 = iM938;
                    str12 = str121;
                    break;
                case -1104174566:
                case -674689184:
                    return;
                case -1100864174:
                case 1010389839:
                    int i124 = i74;
                    String str34 = str11;
                    int i125 = i67;
                    int i126 = i68;
                    byte[] bArr12 = bArr5;
                    int i127 = i69;
                    int i128 = i71;
                    byte[] bArr13 = bArr4;
                    jSONArray7 = jSONArray7;
                    String str35 = str10;
                    float f21 = f6;
                    C1313 c1316 = c1314;
                    arrayList6 = arrayList6;
                    int i129 = i75;
                    int i130 = i64;
                    JSONArray jSONArray13 = jSONArray8;
                    boolean z32 = z13;
                    int i131 = i73;
                    int i132 = length;
                    int i133 = i66;
                    int i134 = iM938;
                    str12 = str12;
                    iM938 = i134;
                    c11018.mo24508(i133);
                    iM31548 = c12688.m31548();
                    if (iM31548 != 0) {
                        iM113010 = C19806.m45029("ۨۜ") ^ i59;
                        i32 = ((iM113010 ^ i58) * (-9001)) ^ (-254295327);
                        i33 = -493481384;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ۙ۟") ^ i58;
                        i32 = ((iM113010 ^ i59) * (-21521)) ^ (-454883857);
                        i33 = 1544077785;
                    }
                    int i135 = iM113010 ^ i33;
                    i67 = i125;
                    i66 = i133;
                    i60 = i32;
                    i73 = i131;
                    length = i132;
                    z13 = z32;
                    i75 = i129;
                    jSONArray8 = jSONArray13;
                    i64 = i130;
                    c1314 = c1316;
                    f6 = f21;
                    str10 = str35;
                    i71 = i128;
                    bArr4 = bArr13;
                    bArr5 = bArr12;
                    i69 = i127;
                    i68 = i126;
                    i74 = i124;
                    str6 = str34;
                    i61 = i135;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str1117 = str12;
                    iM938 = iM938;
                    str12 = str1117;
                    break;
                case -1089867741:
                case 2046507416:
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z33 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z33;
                    if (!interfaceC6025.mo16346(16, C2704.m8251(c12687))) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i7117 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i7117;
                        float f118 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f118;
                    } else {
                        iM11307 = (i59 - ThreadFactoryC3888.m11306("᩷ۨ")) * (-65);
                        i6 = ((iM11307 ^ i58) * (-31623)) ^ (-1143306004);
                        i7 = -653207654;
                        int i1014 = iM11307 ^ i7;
                        i74 = i74;
                        String str212 = str11;
                        i61 = i1014;
                        i60 = i6;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str212;
                        float f119 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f119;
                    }
                    break;
                case -1003196758:
                case 1124105157:
                    i74 = i74;
                    str11 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray5 = jSONArray7;
                    str8 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray6 = jSONArray8;
                    z10 = z13;
                    i29 = i73;
                    length = length;
                    i66 = i66;
                    int i136 = iM938;
                    str12 = str12;
                    iM938 = i136;
                    if (RunnableC1564.m5348(itM10563)) {
                        iM11309 = ThreadFactoryC3888.m11306("ۡ۟") ^ i59;
                        i30 = ((iM11309 ^ i58) * (-12625)) ^ (-1324714592);
                        i31 = -1032722954;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i58;
                        i30 = ((iM11309 ^ i59) * (-20167)) ^ (-932832448);
                        i31 = -2045857414;
                    }
                    i35 = iM11309 ^ i31;
                    i66 = i66;
                    i73 = i29;
                    length = length;
                    z13 = z10;
                    i75 = i75;
                    jSONArray8 = jSONArray6;
                    i64 = i64;
                    c1314 = c1314;
                    f6 = f6;
                    str10 = str8;
                    i71 = i71;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    int i1111 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i1111;
                    String str36 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str36;
                    String str122 = str12;
                    iM938 = iM938;
                    str12 = str122;
                    break;
                case -978905626:
                case 449735951:
                    c11018.m27775(C1377.m4837(arrayList6));
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList6);
                    iM113015 = C19806.m45029("ܶ۟") ^ i59;
                    i48 = ((iM113015 ^ i58) * 29283) ^ (-1662818922);
                    i49 = 811289838;
                    int i811 = iM113015 ^ i49;
                    f6 = f6;
                    str11 = str11;
                    i61 = i811;
                    str10 = str10;
                    i60 = i48;
                    length = length;
                    i74 = i74;
                    z13 = z13;
                    break;
                case -908785192:
                case -422694610:
                    jSONArray5 = jSONArray7;
                    z10 = z13;
                    iM938 = iM938;
                    jSONArray6 = jSONArray8;
                    jSONArray6.add(((C21512) C0278.m1776(itM10564)).m48183());
                    str8 = str10;
                    i29 = i73;
                    iM11309 = (ThreadFactoryC3888.m11306("۫ۚ") + i58) * (-99);
                    i30 = ((iM11309 ^ i59) * 7777) ^ 1968881437;
                    i31 = 1356717894;
                    i35 = iM11309 ^ i31;
                    i66 = i66;
                    i73 = i29;
                    length = length;
                    z13 = z10;
                    i75 = i75;
                    jSONArray8 = jSONArray6;
                    i64 = i64;
                    c1314 = c1314;
                    f6 = f6;
                    str10 = str8;
                    i71 = i71;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    int i1112 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i1112;
                    String str37 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str37;
                    String str123 = str12;
                    iM938 = iM938;
                    str12 = str123;
                    break;
                case -822150361:
                case 655655460:
                    int i137 = i75;
                    int i138 = i74;
                    str11 = str11;
                    i67 = i67;
                    int i139 = i68;
                    byte[] bArr14 = bArr5;
                    int i140 = i69;
                    int i141 = i71;
                    byte[] bArr15 = bArr4;
                    jSONArray5 = jSONArray7;
                    String str38 = str10;
                    float f22 = f6;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    int i142 = i64;
                    JSONArray jSONArray14 = jSONArray8;
                    boolean z34 = z13;
                    int i143 = i73;
                    int i144 = length;
                    int i145 = iM938;
                    str12 = str12;
                    iM938 = i145;
                    String strM6674 = C2124.m6674(jSONArray5);
                    byte[] bArrM27796 = c11018.m27796();
                    C2724 c2724M8469 = C2788.m8469(4178);
                    RunnableC1564.m5349(c2724M8469, strM6674);
                    c2724M8469.m8319(bArrM27796);
                    C1313 c1313M8321 = c2724M8469.m8321();
                    if (RunnableC1564.m5342(c1313M8321)) {
                        iM113011 = C19806.m45029("᩻᩸") ^ i59;
                        i30 = ((iM113011 ^ i58) * (-21161)) ^ (-1817672852);
                        i34 = 696437764;
                    } else {
                        iM113011 = (i58 - ThreadFactoryC3888.m11306("᩺۠")) * 83;
                        i30 = ((iM113011 ^ i59) * 27535) ^ (-2120407758);
                        i34 = -1312557961;
                    }
                    i35 = iM113011 ^ i34;
                    i73 = i143;
                    bArr4 = bArr15;
                    i75 = i137;
                    c1314 = c1313M8321;
                    jSONArray8 = jSONArray14;
                    i69 = i140;
                    i64 = i142;
                    length = i144;
                    z13 = z34;
                    i68 = i139;
                    i71 = i141;
                    f6 = f22;
                    i74 = i138;
                    str10 = str38;
                    bArr5 = bArr14;
                    int i1113 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i1113;
                    String str39 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str39;
                    String str124 = str12;
                    iM938 = iM938;
                    str12 = str124;
                    break;
                case -777481077:
                case -151228187:
                    i74 = i74;
                    str11 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str10 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z13 = z13;
                    i73 = i73;
                    length = length;
                    i66 = i66;
                    i67 = i67;
                    iM31548 = iM31548;
                    i65 = i65;
                    int i146 = iM938;
                    str12 = str12;
                    iM938 = i146;
                    if (z2) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۘ۟") + i58) * 11;
                        i8 = ((iM450210 ^ i59) * 12397) ^ (-340929913);
                        i9 = 1392770961;
                    } else {
                        iM450210 = (i59 - ThreadFactoryC3888.m11306("ۙۘ")) * 91;
                        i8 = ((iM450210 ^ i58) * (-20187)) ^ 337953270;
                        i9 = 1675878241;
                    }
                    i46 = iM450210 ^ i9;
                    i65 = i65;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str1118 = str12;
                    iM938 = iM938;
                    str12 = str1118;
                    break;
                case -719139630:
                case -281380952:
                    int[] iArrMo16348 = interfaceC6025.mo16348(CallableC1627.m5506(c12687));
                    C0629.m2908(iArrMo16348);
                    c11018.mo24508(i75);
                    c11018.m27775(iArrMo16348.length);
                    length = iArrMo16348.length;
                    i64 = 0;
                    iArr = iArrMo16348;
                    int iM113021 = (ThreadFactoryC3888.m11306("ܰۡ") + i58) * 73;
                    f6 = f6;
                    b = b;
                    str11 = str11;
                    i74 = i74;
                    i61 = iM113021 ^ (-1754626268);
                    i60 = ((iM113021 ^ i59) * (-12787)) ^ 1792416002;
                    length = length;
                    z13 = z13;
                    break;
                case -700984677:
                case 1966665711:
                    i74 = i74;
                    String str40 = str11;
                    int i147 = i67;
                    i68 = i68;
                    byte[] bArr16 = bArr5;
                    i69 = i69;
                    int i148 = i71;
                    bArr4 = bArr4;
                    JSONArray jSONArray15 = jSONArray7;
                    ArrayList arrayList9 = arrayList6;
                    int i149 = i64;
                    JSONArray jSONArray16 = jSONArray8;
                    C1313 c1317 = c1314;
                    int i150 = i73;
                    boolean z35 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z12 = z35;
                    int i151 = iM938;
                    str12 = str12;
                    iM938 = i151;
                    if (iM31548 == i147) {
                        int iM450220 = (i59 - C19806.m45029("᩻ᩳ")) * (-25);
                        int i152 = ((iM450220 ^ i58) * 12223) ^ 202181218;
                        int i153 = iM450220 ^ (-1542980783);
                        i73 = i150;
                        c1314 = c1317;
                        jSONArray8 = jSONArray16;
                        bArr4 = bArr4;
                        i64 = i149;
                        i69 = i69;
                        i71 = i148;
                        i68 = i68;
                        bArr5 = bArr16;
                        i74 = i74;
                        i67 = i147;
                        i60 = i152;
                        arrayList6 = arrayList9;
                        jSONArray7 = jSONArray15;
                        str11 = str40;
                        i61 = i153;
                        float f23 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z12;
                        f6 = f23;
                        String str125 = str12;
                        iM938 = iM938;
                        str12 = str125;
                    } else {
                        int iM113022 = (ThreadFactoryC3888.m11306("ܰ᩵") + i58) * 47;
                        int i154 = ((iM113022 ^ i59) * (-63)) ^ 1781045383;
                        c1314 = c1317;
                        i73 = i150;
                        arrayList6 = arrayList9;
                        jSONArray7 = jSONArray15;
                        jSONArray8 = jSONArray16;
                        i64 = i149;
                        str11 = str40;
                        i61 = iM113022 ^ (-1627241447);
                        i71 = i148;
                        i67 = i147;
                        bArr5 = bArr16;
                        i60 = i154;
                        bArr4 = bArr4;
                        i69 = i69;
                        i68 = i68;
                        i74 = i74;
                        float f24 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z12;
                        f6 = f24;
                        String str1119 = str12;
                        iM938 = iM938;
                        str12 = str1119;
                    }
                    break;
                case -669377130:
                case 507300204:
                    i74 = i74;
                    str11 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray5 = jSONArray7;
                    str8 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray6 = jSONArray8;
                    z10 = z13;
                    i29 = i73;
                    length = length;
                    i66 = i66;
                    int i155 = iM938;
                    str12 = str12;
                    iM938 = i155;
                    i76 = i66 + 1;
                    c12688 = (C12687) C0216.m1584(itM10565);
                    if (sharedPreferences.contains(CallableC1627.m5506(c12688))) {
                        iM11309 = ThreadFactoryC3888.m11306("᩹۠") ^ i58;
                        i30 = ((iM11309 ^ i59) * (-8135)) ^ (-1270510563);
                        i31 = 794146828;
                    } else {
                        iM11309 = C19806.m45029("ܳܿ") ^ i59;
                        i30 = ((iM11309 ^ i58) * 349) ^ (-1475095345);
                        i31 = -1054949284;
                    }
                    i35 = iM11309 ^ i31;
                    i66 = i66;
                    i73 = i29;
                    length = length;
                    z13 = z10;
                    i75 = i75;
                    jSONArray8 = jSONArray6;
                    i64 = i64;
                    c1314 = c1314;
                    f6 = f6;
                    str10 = str8;
                    i71 = i71;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    int i1114 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i1114;
                    String str310 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str310;
                    String str126 = str12;
                    iM938 = iM938;
                    str12 = str126;
                    break;
                case -595659880:
                case 733049313:
                    i37 = i74;
                    str9 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str10;
                    f4 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z11 = z13;
                    i73 = i73;
                    i36 = length;
                    int i156 = iM938;
                    str12 = str12;
                    i20 = i156;
                    if (RunnableC1564.m5348(itM10564)) {
                        iM450212 = C19806.m45029("᩵ۚ") ^ i59;
                        i38 = ((iM450212 ^ i58) * 14213) ^ (-38921348);
                        i39 = 1584927646;
                    } else {
                        iM450212 = (i58 - C19806.m45029("֨ۘ")) * (-45);
                        i38 = ((iM450212 ^ i59) * 18729) ^ 1623957413;
                        i39 = -654304931;
                    }
                    int i7118 = iM450212 ^ i39;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    i67 = i67;
                    i60 = i38;
                    jSONArray8 = jSONArray8;
                    i64 = i64;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i71 = i71;
                    bArr4 = bArr4;
                    str11 = str9;
                    i61 = i7118;
                    bArr5 = bArr5;
                    i69 = i69;
                    length = i36;
                    z13 = z11;
                    i68 = i68;
                    f6 = f4;
                    i74 = i37;
                    str10 = str5;
                    String str11110 = str12;
                    iM938 = i20;
                    str12 = str11110;
                    break;
                case -504159076:
                case 1440684203:
                    int i157 = i74;
                    String str41 = str11;
                    int i158 = i67;
                    int i159 = i68;
                    byte[] bArr17 = bArr5;
                    int i160 = i69;
                    int i161 = i71;
                    byte[] bArr18 = bArr4;
                    JSONArray jSONArray17 = jSONArray7;
                    str5 = str10;
                    f6 = f6;
                    C1313 c1318 = c1314;
                    ArrayList arrayList10 = arrayList6;
                    int i162 = iM31548;
                    int i163 = i64;
                    JSONArray jSONArray18 = jSONArray8;
                    boolean z36 = z13;
                    int i164 = i73;
                    int i165 = length;
                    int i166 = iM938;
                    str12 = str12;
                    i20 = i166;
                    i54 = i75 + 1;
                    c12687 = (C12687) C0278.m1776(itM10563);
                    if (interfaceC6025.contains(CallableC1627.m5506(c12687))) {
                        iM113013 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i58;
                        i42 = ((iM113013 ^ i59) * (-14397)) ^ 564621652;
                        i43 = 2068932183;
                    } else {
                        iM113013 = C19806.m45029("ᩳܳ") ^ i59;
                        i42 = ((iM113013 ^ i58) * (-5983)) ^ 1368207553;
                        i43 = -1993515489;
                    }
                    int i167 = iM113013 ^ i43;
                    iM31548 = i162;
                    i73 = i164;
                    c1314 = c1318;
                    i67 = i158;
                    i60 = i42;
                    jSONArray8 = jSONArray18;
                    bArr4 = bArr18;
                    i64 = i163;
                    arrayList6 = arrayList10;
                    jSONArray7 = jSONArray17;
                    i69 = i160;
                    i71 = i161;
                    str11 = str41;
                    i61 = i167;
                    i68 = i159;
                    bArr5 = bArr17;
                    length = i165;
                    z13 = z36;
                    i74 = i157;
                    f6 = f6;
                    str10 = str5;
                    String str11111 = str12;
                    iM938 = i20;
                    str12 = str11111;
                    break;
                case -487952734:
                case 1179795080:
                    i74 = i74;
                    str11 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray5 = jSONArray7;
                    str8 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray6 = jSONArray8;
                    z10 = z13;
                    i29 = i73;
                    length = length;
                    i66 = i66;
                    int i168 = iM938;
                    str12 = str12;
                    iM938 = i168;
                    if (((C13308) C0278.m1776(itM5072)).m32809()) {
                        i52 = i53;
                        iM11309 = (C19806.m45029("֫ۢ") + i59) * 63;
                        i30 = ((iM11309 ^ i58) * (-21063)) ^ (-775127535);
                        i31 = -559338627;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("ܶܺ") ^ i59) * (-7);
                        i30 = ((iM11309 ^ i58) * (-9593)) ^ 304500725;
                        i31 = 1565040810;
                    }
                    i35 = iM11309 ^ i31;
                    i66 = i66;
                    i73 = i29;
                    length = length;
                    z13 = z10;
                    i75 = i75;
                    jSONArray8 = jSONArray6;
                    i64 = i64;
                    c1314 = c1314;
                    f6 = f6;
                    str10 = str8;
                    i71 = i71;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    int i1115 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i1115;
                    String str311 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str311;
                    String str127 = str12;
                    iM938 = iM938;
                    str12 = str127;
                    break;
                case -440434861:
                case 2043640288:
                    f = f6;
                    c11018.mo24508(i75);
                    c11018.m27791(interfaceC6025.getLong(CallableC1627.m5506(c12687), 0L));
                    str12 = str12;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    z6 = z13;
                    length = length;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    str10 = str10;
                    f6 = f;
                    bArr4 = bArr4;
                    iM11306 = C19806.m45029("֨ۢ") ^ i59;
                    i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                    i5 = -55386947;
                    int i7119 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i7119;
                    float f1110 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f1110;
                    break;
                case -371880655:
                case 1766321541:
                    i74 = i74;
                    str11 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray5 = jSONArray7;
                    str8 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray6 = jSONArray8;
                    z10 = z13;
                    i29 = i73;
                    length = length;
                    i66 = i66;
                    int i169 = iM938;
                    str12 = str12;
                    iM938 = i169;
                    i52 = -1;
                    iM11309 = (C19806.m45029("֫ۢ") + i59) * 63;
                    i30 = ((iM11309 ^ i58) * (-21063)) ^ (-775127535);
                    i31 = -559338627;
                    i35 = iM11309 ^ i31;
                    i66 = i66;
                    i73 = i29;
                    length = length;
                    z13 = z10;
                    i75 = i75;
                    jSONArray8 = jSONArray6;
                    i64 = i64;
                    c1314 = c1314;
                    f6 = f6;
                    str10 = str8;
                    i71 = i71;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    int i1116 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i1116;
                    String str312 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str312;
                    String str128 = str12;
                    iM938 = iM938;
                    str12 = str128;
                    break;
                case -354072139:
                case 1850017714:
                    f = f6;
                    byte[] bArrMo16347 = interfaceC6025.mo16347(CallableC1627.m5506(c12687), (byte[]) null);
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(bArrMo16347);
                    c11018.mo24508(i75);
                    c11018.m27775(bArrMo16347.length);
                    c11018.write(bArrMo16347, 0, bArrMo16347.length);
                    str12 = str12;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    z6 = z13;
                    length = length;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    str10 = str10;
                    f6 = f;
                    bArr4 = bArr4;
                    iM11306 = C19806.m45029("֨ۢ") ^ i59;
                    i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                    i5 = -55386947;
                    int i71110 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i71110;
                    float f1111 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f1111;
                    break;
                case -208715284:
                case -126957110:
                    int i170 = i74;
                    str = str11;
                    int i171 = i69;
                    String str42 = str12;
                    byte[] bArr19 = bArr4;
                    jSONArray2 = jSONArray7;
                    arrayList = arrayList6;
                    int i172 = i71;
                    int i173 = i64;
                    boolean z37 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z37;
                    c11018.m27775(i171);
                    int i174 = i68;
                    byte[] bArr20 = bArr5;
                    c11018.write(bArr20, 0, i174);
                    iM938 = C0050.m938(m35478());
                    if (i172 != (iM938 + 7) / 8) {
                        int iM113023 = (i58 - ThreadFactoryC3888.m11306("ᩴۗ")) * (-105);
                        int i175 = ((iM113023 ^ i59) * (-11903)) ^ 1127915495;
                        i3 = iM113023 ^ (-2075770315);
                        str12 = str42;
                        i60 = i175;
                        bArr4 = bArr19;
                        i64 = i173;
                        i72 = 0;
                        i69 = i171;
                        i71 = i172;
                        i68 = i174;
                        bArr5 = bArr20;
                        i74 = i170;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f6;
                        String str213 = str;
                        i61 = i3;
                        arrayList6 = arrayList;
                        jSONArray7 = jSONArray2;
                        str11 = str213;
                    } else {
                        int iM113024 = ThreadFactoryC3888.m11306("ۘۘ") ^ i59;
                        str12 = str42;
                        i60 = ((iM113024 ^ i58) * 23615) ^ 752909057;
                        bArr4 = bArr19;
                        arrayList6 = arrayList;
                        i72 = 0;
                        jSONArray7 = jSONArray2;
                        i69 = i171;
                        str11 = str;
                        i68 = i174;
                        i61 = iM113024 ^ 207985782;
                        i64 = i173;
                        i74 = i170;
                        i71 = i172;
                        bArr5 = bArr20;
                        float f1112 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f1112;
                    }
                    break;
                case -201402041:
                case 1651739691:
                    i74 = i74;
                    str11 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str10 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z13 = z13;
                    i73 = i73;
                    length = length;
                    i66 = i66;
                    i67 = i67;
                    iM31548 = iM31548;
                    i65 = i65;
                    int i176 = iM938;
                    str12 = str12;
                    iM938 = i176;
                    short s = f48399[161];
                    if ((s * 38394) - ((s * s) + 368524809) <= 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("֫ۖ") ^ i59) * 45;
                        i8 = ((iM450210 ^ i58) * (-4105)) ^ (-2082904618);
                        i9 = -65147691;
                    } else {
                        iM450210 = C19806.m45029("ۙ᩻") ^ i58;
                        i8 = ((iM450210 ^ i59) * 9783) ^ 1720379595;
                        i9 = 1364353272;
                    }
                    i46 = iM450210 ^ i9;
                    i65 = i65;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str11112 = str12;
                    iM938 = iM938;
                    str12 = str11112;
                    break;
                case -145017532:
                case 706152266:
                    c11018.m27777();
                    i74 = i74;
                    str11 = str11;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str10 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z13 = z13;
                    i73 = i73;
                    length = length;
                    i66 = i66;
                    i67 = i67;
                    iM31548 = iM31548;
                    i65 = i65;
                    int i177 = iM938;
                    str12 = str12;
                    iM938 = i177;
                    iM450210 = (i59 - ThreadFactoryC3888.m11306("ۙۘ")) * 91;
                    i8 = ((iM450210 ^ i58) * (-20187)) ^ 337953270;
                    i9 = 1675878241;
                    i46 = iM450210 ^ i9;
                    i65 = i65;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str11113 = str12;
                    iM938 = iM938;
                    str12 = str11113;
                    break;
                case -141404073:
                case 1578751056:
                    int i178 = i74;
                    String str43 = str11;
                    int i179 = i68;
                    byte[] bArr21 = bArr5;
                    int i180 = i69;
                    int i181 = i71;
                    byte[] bArr22 = bArr4;
                    jSONArray7 = jSONArray7;
                    float f25 = f6;
                    C1313 c1319 = c1314;
                    arrayList6 = arrayList6;
                    int i182 = i75;
                    int i183 = i64;
                    JSONArray jSONArray19 = jSONArray8;
                    boolean z38 = z13;
                    int i184 = i73;
                    int i185 = length;
                    int i186 = i66;
                    int i187 = i67;
                    int i188 = iM31548;
                    int i189 = iM938;
                    str12 = str12;
                    iM938 = i189;
                    boolean zM5348 = RunnableC1564.m5348(itM10565);
                    String strM4832 = C1377.m4832(f48399, 165, 13, i62);
                    strM10964 = C3743.m10964(f48399, 178, 29, i62);
                    f5 = 0.0f;
                    if (zM5348) {
                        iM11308 = (i59 - C19806.m45029("ܿ᩻")) * 57;
                        i26 = ((iM11308 ^ i58) * 11911) ^ (-892870505);
                        i27 = -609110077;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i59;
                        i26 = ((iM11308 ^ i58) * 21049) ^ (-1311207013);
                        i27 = -321735440;
                    }
                    int i190 = iM11308 ^ i27;
                    i73 = i184;
                    i75 = i182;
                    jSONArray8 = jSONArray19;
                    i64 = i183;
                    c1314 = c1319;
                    i71 = i181;
                    bArr4 = bArr22;
                    bArr5 = bArr21;
                    i69 = i180;
                    i68 = i179;
                    i74 = i178;
                    str6 = str43;
                    i61 = i190;
                    i60 = i26;
                    iM31548 = i188;
                    i67 = i187;
                    i66 = i186;
                    length = i185;
                    z13 = z38;
                    f6 = f25;
                    str10 = strM4832;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str11114 = str12;
                    iM938 = iM938;
                    str12 = str11114;
                    break;
                case -133727614:
                case 630533417:
                    itM9864 = ViewTreeObserverOnPreDrawListenerC3327.m9863(c13308.m32798());
                    iM113016 = ThreadFactoryC3888.m11306("ۘ֫") ^ i59;
                    i50 = ((iM113016 ^ i58) * (-3359)) ^ (-1636190752);
                    i51 = 661036621;
                    i61 = iM113016 ^ i51;
                    i60 = i50;
                    break;
                case -34100019:
                case 1076870376:
                    throw new C4987(C0526.m2431(c1314, C19806.m45029(C2477.m7604(f48399, BERTags.FLAGS, 3, i62)) ^ 2127147274));
                case 17468157:
                case 474906745:
                    i74 = i74;
                    str11 = str11;
                    if (i64 >= length) {
                        str12 = str12;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        jSONArray = jSONArray7;
                        arrayList6 = arrayList6;
                        i71 = i71;
                        boolean z39 = z13;
                        length = length;
                        str10 = str10;
                        f6 = f6;
                        z6 = z39;
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i71111 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i71111;
                        float f1113 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f1113;
                    } else {
                        iM45029 = C19806.m45029("᩸ۡ") ^ i58;
                        i = ((iM45029 ^ i59) * 18559) ^ (-705554457);
                        i2 = 1319532790;
                        int i71112 = iM45029 ^ i2;
                        str11 = str11;
                        i61 = i71112;
                        i60 = i;
                        i74 = i74;
                    }
                    break;
                case 19171492:
                case 1675486943:
                    throw new IllegalStateException(str12);
                case 94259427:
                case 1454376819:
                    i74 = i74;
                    str11 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    str5 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    z9 = z13;
                    i73 = i73;
                    length = length;
                    int i191 = iM938;
                    str12 = str12;
                    i20 = i191;
                    int i192 = i66 >>> 3;
                    bArr5[i192] = (byte) (bArr5[i192] | (i67 << (i66 & 7)));
                    i22 = i67;
                    iM4837 = i68;
                    i23 = i65;
                    i24 = i76;
                    int iM1130111 = (i59 - ThreadFactoryC3888.m11306("۠᩺")) * (-113);
                    i65 = i23;
                    iM31548 = iM31548;
                    i73 = i73;
                    i74 = i74;
                    jSONArray8 = jSONArray8;
                    i67 = i22;
                    i64 = i64;
                    i66 = i24;
                    i71 = i71;
                    i75 = i75;
                    bArr5 = bArr5;
                    c1314 = c1314;
                    bArr4 = bArr4;
                    i69 = i69;
                    i68 = iM4837;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    i61 = iM1130111 ^ (-81834960);
                    i60 = ((iM1130111 ^ i58) * 32311) ^ (-552864510);
                    length = length;
                    z13 = z9;
                    f6 = f6;
                    str10 = str5;
                    String str11115 = str12;
                    iM938 = i20;
                    str12 = str11115;
                    break;
                case 180322884:
                case 531926824:
                    i74 = i74;
                    str11 = str11;
                    i47 = i73;
                    boolean z40 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z12 = z40;
                    c11018.m27775(i47);
                    arrayList3 = new ArrayList();
                    itM4898 = C1398.m4898(C23186.m51208());
                    int iM4502113 = (C19806.m45029("۠ᩴ") + i59) * (-123);
                    str12 = str12;
                    i60 = ((iM4502113 ^ i58) * (-30205)) ^ (-907134412);
                    i73 = i47;
                    jSONArray7 = jSONArray7;
                    arrayList6 = arrayList3;
                    i64 = i64;
                    str11 = str11;
                    i71 = i71;
                    i61 = iM4502113 ^ (-1720733912);
                    bArr5 = bArr5;
                    bArr4 = bArr4;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    float f26 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z12;
                    f6 = f26;
                    String str11116 = str12;
                    iM938 = iM938;
                    str12 = str11116;
                    break;
                case 192604419:
                case 955736377:
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z41 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z41;
                    if (!interfaceC6025.mo16346(22, C2704.m8251(c12687))) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i71113 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i71113;
                        float f1114 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f1114;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۠ܰ") ^ i59;
                        i6 = ((iM11307 ^ i58) * (-23499)) ^ (-1812644048);
                        i7 = -295598861;
                        int i1015 = iM11307 ^ i7;
                        i74 = i74;
                        String str214 = str11;
                        i61 = i1015;
                        i60 = i6;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str214;
                        float f1115 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f1115;
                    }
                    break;
                case 236731225:
                case 1474875927:
                    i74 = i74;
                    str11 = str11;
                    z9 = z13;
                    c11018.m27784(C10634.m26828(sharedPreferences, CallableC1627.m5506(c12688), false));
                    str5 = str10;
                    int i193 = iM938;
                    str12 = str12;
                    i20 = i193;
                    i22 = i67;
                    iM4837 = i68;
                    i23 = i65;
                    i24 = i76;
                    int iM1130112 = (i59 - ThreadFactoryC3888.m11306("۠᩺")) * (-113);
                    i65 = i23;
                    iM31548 = iM31548;
                    i73 = i73;
                    i74 = i74;
                    jSONArray8 = jSONArray8;
                    i67 = i22;
                    i64 = i64;
                    i66 = i24;
                    i71 = i71;
                    i75 = i75;
                    bArr5 = bArr5;
                    c1314 = c1314;
                    bArr4 = bArr4;
                    i69 = i69;
                    i68 = iM4837;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    i61 = iM1130112 ^ (-81834960);
                    i60 = ((iM1130112 ^ i58) * 32311) ^ (-552864510);
                    length = length;
                    z13 = z9;
                    f6 = f6;
                    str10 = str5;
                    String str11117 = str12;
                    iM938 = i20;
                    str12 = str11117;
                    break;
                case 246895550:
                case 466794205:
                    i74 = i74;
                    str11 = str11;
                    int i194 = i70;
                    str12 = str12;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    i64 = i64;
                    boolean z42 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z42;
                    if (iM31548 != i194) {
                        int iM113025 = ThreadFactoryC3888.m11306("ۛۖ") ^ i58;
                        i70 = i194;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = ((iM113025 ^ i59) * 9051) ^ (-1495861145);
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f6;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = iM113025 ^ (-1976947616);
                        i64 = i64;
                    } else {
                        i70 = i194;
                        iM11306 = (i58 - ThreadFactoryC3888.m11306("۬֫")) * (-91);
                        i4 = ((iM11306 ^ i59) * (-11627)) ^ (-1034577972);
                        i5 = 429076448;
                        int i71114 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i71114;
                        float f1116 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f1116;
                    }
                    break;
                case 309482582:
                case 757977475:
                    length = length;
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    str10 = str10;
                    f6 = f6;
                    arrayList6 = arrayList6;
                    if (!interfaceC6025.mo16346(17, CallableC1627.m5506(c12687))) {
                        z6 = false;
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i71115 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i71115;
                        float f1117 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f1117;
                    } else {
                        int iM450221 = C19806.m45029("ܽۤ") ^ i59;
                        i60 = ((iM450221 ^ i58) * 7427) ^ (-1887829193);
                        f6 = f6;
                        i74 = i74;
                        str10 = str10;
                        length = length;
                        z13 = false;
                        str2 = str11;
                        i61 = iM450221 ^ (-405795262);
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str2;
                    }
                    break;
                case 345392102:
                case 1111318270:
                    iM938 = iM938;
                    i62 = 25728;
                    iM450210 = C19806.m45029("֫᩻") ^ i59;
                    i8 = ((iM450210 ^ i58) * 15075) ^ 194970746;
                    i9 = 525179736;
                    i46 = iM450210 ^ i9;
                    i65 = i65;
                    iM31548 = iM31548;
                    i73 = i73;
                    i75 = i75;
                    jSONArray8 = jSONArray8;
                    i67 = i67;
                    i64 = i64;
                    c1314 = c1314;
                    i66 = i66;
                    i71 = i71;
                    bArr4 = bArr4;
                    length = length;
                    z13 = z13;
                    bArr5 = bArr5;
                    i69 = i69;
                    f6 = f6;
                    str10 = str10;
                    i68 = i68;
                    i74 = i74;
                    str6 = str11;
                    i61 = i46;
                    i60 = i8;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str6;
                    String str11118 = str12;
                    iM938 = iM938;
                    str12 = str11118;
                    break;
                case 368875873:
                case 1797016516:
                    str7 = str10;
                    i28 = i67;
                    i75 = i54;
                    iM4838 = i71;
                    bArr3 = bArr4;
                    i55 = 1;
                    f3 = 0.0f;
                    iM938 = iM938;
                    int iM113026 = (i59 - ThreadFactoryC3888.m11306("۬ۨ")) * (-111);
                    int i1210 = iM4838;
                    i60 = ((iM113026 ^ i58) * (-26647)) ^ 1043233988;
                    i73 = i73;
                    c1314 = c1314;
                    str10 = str7;
                    bArr4 = bArr3;
                    jSONArray8 = jSONArray8;
                    i64 = i64;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    i71 = i1210;
                    str11 = str11;
                    i69 = i69;
                    i61 = iM113026 ^ 2027939698;
                    i68 = i68;
                    bArr5 = bArr5;
                    i74 = i74;
                    int i1211 = i28;
                    i66 = i66;
                    length = length;
                    z13 = z13;
                    f6 = f3;
                    iM31548 = iM31548;
                    i67 = i1211;
                    String str11119 = str12;
                    iM938 = iM938;
                    str12 = str11119;
                    break;
                case 499413535:
                case 2006059978:
                    i74 = i74;
                    str11 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray5 = jSONArray7;
                    str8 = str10;
                    f6 = f6;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    iM31548 = iM31548;
                    i75 = i75;
                    i64 = i64;
                    jSONArray6 = jSONArray8;
                    z10 = z13;
                    i29 = i73;
                    length = length;
                    i66 = i66;
                    int i195 = iM938;
                    str12 = str12;
                    iM938 = i195;
                    if (z5) {
                        iM11309 = (i59 - ThreadFactoryC3888.m11306("᩻ۘ")) * 39;
                        i30 = ((iM11309 ^ i58) * 1175) ^ (-1811329493);
                        i31 = -1996814906;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("ۧ᩵") ^ i58) * 23;
                        i30 = ((iM11309 ^ i59) * 17481) ^ 2111531630;
                        i31 = -1712362142;
                    }
                    i35 = iM11309 ^ i31;
                    i66 = i66;
                    i73 = i29;
                    length = length;
                    z13 = z10;
                    i75 = i75;
                    jSONArray8 = jSONArray6;
                    i64 = i64;
                    c1314 = c1314;
                    f6 = f6;
                    str10 = str8;
                    i71 = i71;
                    bArr4 = bArr4;
                    bArr5 = bArr5;
                    i69 = i69;
                    i68 = i68;
                    i74 = i74;
                    int i1117 = iM31548;
                    i67 = i67;
                    i60 = i30;
                    iM31548 = i1117;
                    String str313 = str11;
                    i61 = i35;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray5;
                    str11 = str313;
                    String str129 = str12;
                    iM938 = iM938;
                    str12 = str129;
                    break;
                case 511722620:
                case 1955381178:
                    i74 = i74;
                    str11 = str11;
                    str12 = str12;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    i71 = i71;
                    boolean z43 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z43;
                    int i196 = i75 >>> 3;
                    bArr4[i196] = (byte) ((i55 << (i75 & 7)) | bArr4[i196]);
                    iM11306 = C19806.m45029("֨ۢ") ^ i59;
                    i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                    i5 = -55386947;
                    int i71116 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i71116;
                    float f1118 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f1118;
                    break;
                case 528668487:
                case 649171931:
                    Object objM1584 = C0216.m1584(it);
                    C7105.m18988(objM1584, C1189.m4365(f48399, 243, 9, i62));
                    C15083 c15084 = (C15083) objM1584;
                    c11018.m27786((String) c15084.m36158());
                    c11018.mo24508(((byte[]) c15084.m36156()).length);
                    c11018.write((byte[]) c15084.m36156());
                    jSONArray = jSONArray7;
                    z6 = z13;
                    iM11307 = C19806.m45029("֨᩶") ^ i58;
                    i6 = ((iM11307 ^ i59) * (-18401)) ^ 113337631;
                    i7 = -1848017104;
                    int i1016 = iM11307 ^ i7;
                    i74 = i74;
                    String str215 = str11;
                    i61 = i1016;
                    i60 = i6;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str215;
                    float f1119 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f1119;
                    break;
                case 713723661:
                case 1272432650:
                    c11018.m27778(sharedPreferences.getFloat(C2704.m8251(c12688), f5));
                    str5 = str10;
                    z9 = z13;
                    int i197 = iM938;
                    str12 = str12;
                    i20 = i197;
                    i22 = i67;
                    iM4837 = i68;
                    i23 = i65;
                    i24 = i76;
                    int iM1130113 = (i59 - ThreadFactoryC3888.m11306("۠᩺")) * (-113);
                    i65 = i23;
                    iM31548 = iM31548;
                    i73 = i73;
                    i74 = i74;
                    jSONArray8 = jSONArray8;
                    i67 = i22;
                    i64 = i64;
                    i66 = i24;
                    i71 = i71;
                    i75 = i75;
                    bArr5 = bArr5;
                    c1314 = c1314;
                    bArr4 = bArr4;
                    i69 = i69;
                    i68 = iM4837;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    i61 = iM1130113 ^ (-81834960);
                    i60 = ((iM1130113 ^ i58) * 32311) ^ (-552864510);
                    length = length;
                    z13 = z9;
                    f6 = f6;
                    str10 = str5;
                    String str111110 = str12;
                    iM938 = i20;
                    str12 = str111110;
                    break;
                case 764221614:
                case 1573557083:
                    c11018.m27787(iArr[i64]);
                    i64++;
                    int iM113027 = (ThreadFactoryC3888.m11306("ܰۡ") + i58) * 73;
                    f6 = f6;
                    b = b;
                    str11 = str11;
                    i74 = i74;
                    i61 = iM113027 ^ (-1754626268);
                    i60 = ((iM113027 ^ i59) * (-12787)) ^ 1792416002;
                    length = length;
                    z13 = z13;
                    break;
                case 837659091:
                case 989830593:
                    throw new RuntimeException(C1398.m4903(c12688.m31548(), strM10964));
                case 1332202043:
                case 1722521755:
                    i74 = i74;
                    str11 = str11;
                    i67 = i67;
                    i68 = i68;
                    bArr5 = bArr5;
                    i69 = i69;
                    i71 = i71;
                    bArr4 = bArr4;
                    jSONArray7 = jSONArray7;
                    c1314 = c1314;
                    arrayList6 = arrayList6;
                    i64 = i64;
                    jSONArray8 = jSONArray8;
                    i73 = i73;
                    boolean z44 = z13;
                    length = length;
                    String str44 = str10;
                    f6 = f6;
                    z9 = z44;
                    int i198 = iM938;
                    str12 = str12;
                    i20 = i198;
                    iM31548 = iM31548;
                    String strM10951 = C3743.m10951(sharedPreferences, C2704.m8251(c12688), null);
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(strM10951);
                    byte[] bArrM5350 = RunnableC1564.m5350(strM10951, C7590.f25134);
                    C1937.m6286(bArrM5350, str44);
                    c11018.m27775(bArrM5350.length);
                    str5 = str44;
                    c11018.write(bArrM5350, 0, bArrM5350.length);
                    i75 = i75;
                    i22 = i67;
                    iM4837 = i68;
                    i23 = i65;
                    i24 = i76;
                    int iM1130114 = (i59 - ThreadFactoryC3888.m11306("۠᩺")) * (-113);
                    i65 = i23;
                    iM31548 = iM31548;
                    i73 = i73;
                    i74 = i74;
                    jSONArray8 = jSONArray8;
                    i67 = i22;
                    i64 = i64;
                    i66 = i24;
                    i71 = i71;
                    i75 = i75;
                    bArr5 = bArr5;
                    c1314 = c1314;
                    bArr4 = bArr4;
                    i69 = i69;
                    i68 = iM4837;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    i61 = iM1130114 ^ (-81834960);
                    i60 = ((iM1130114 ^ i58) * 32311) ^ (-552864510);
                    length = length;
                    z13 = z9;
                    f6 = f6;
                    str10 = str5;
                    String str111111 = str12;
                    iM938 = i20;
                    str12 = str111111;
                    break;
                case 1367707844:
                case 1538469430:
                    i74 = i74;
                    str11 = str11;
                    jSONArray = jSONArray7;
                    arrayList6 = arrayList6;
                    boolean z45 = z13;
                    length = length;
                    str10 = str10;
                    f6 = f6;
                    z6 = z45;
                    b = 0;
                    if (!interfaceC6025.mo16346(18, CallableC1627.m5506(c12687))) {
                        iM11306 = C19806.m45029("֨ۢ") ^ i59;
                        i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                        i5 = -55386947;
                        int i71117 = iM11306 ^ i5;
                        bArr4 = bArr4;
                        iM938 = iM938;
                        i74 = i74;
                        str12 = str12;
                        i60 = i4;
                        i64 = i64;
                        i71 = i71;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str11;
                        i61 = i71117;
                        float f11110 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f11110;
                    } else {
                        iM11307 = (i59 - C19806.m45029("᩸ܽ")) * 5;
                        i6 = ((iM11307 ^ i58) * (-4843)) ^ (-1573368392);
                        i7 = 2012370192;
                        int i1017 = iM11307 ^ i7;
                        i74 = i74;
                        String str216 = str11;
                        i61 = i1017;
                        i60 = i6;
                        arrayList6 = arrayList6;
                        jSONArray7 = jSONArray;
                        str11 = str216;
                        float f11111 = f6;
                        str10 = str10;
                        length = length;
                        z13 = z6;
                        f6 = f11111;
                    }
                    break;
                case 1606406252:
                case 2138149741:
                    c11018.m27791(sharedPreferences.getLong(C2704.m8251(c12688), 0L));
                    str5 = str10;
                    z9 = z13;
                    int i199 = iM938;
                    str12 = str12;
                    i20 = i199;
                    i22 = i67;
                    iM4837 = i68;
                    i23 = i65;
                    i24 = i76;
                    int iM1130115 = (i59 - ThreadFactoryC3888.m11306("۠᩺")) * (-113);
                    i65 = i23;
                    iM31548 = iM31548;
                    i73 = i73;
                    i74 = i74;
                    jSONArray8 = jSONArray8;
                    i67 = i22;
                    i64 = i64;
                    i66 = i24;
                    i71 = i71;
                    i75 = i75;
                    bArr5 = bArr5;
                    c1314 = c1314;
                    bArr4 = bArr4;
                    i69 = i69;
                    i68 = iM4837;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray7;
                    str11 = str11;
                    i61 = iM1130115 ^ (-81834960);
                    i60 = ((iM1130115 ^ i58) * 32311) ^ (-552864510);
                    length = length;
                    z13 = z9;
                    f6 = f6;
                    str10 = str5;
                    String str111112 = str12;
                    iM938 = i20;
                    str12 = str111112;
                    break;
                case 1645438777:
                case 1997181656:
                    throw new RuntimeException(C3535.m10424(c12687.m31548(), strM10964));
                default:
                    z7 = z13;
                    c11018.mo24508(i75);
                    c11018.m27787(interfaceC6025.getInt(C2704.m8251(c12687), 0));
                    z6 = z7;
                    jSONArray = jSONArray7;
                    str10 = str10;
                    arrayList6 = arrayList6;
                    f6 = f6;
                    iM11306 = C19806.m45029("֨ۢ") ^ i59;
                    i4 = ((iM11306 ^ i58) * 24555) ^ (-370462758);
                    i5 = -55386947;
                    int i71118 = iM11306 ^ i5;
                    bArr4 = bArr4;
                    iM938 = iM938;
                    i74 = i74;
                    str12 = str12;
                    i60 = i4;
                    i64 = i64;
                    i71 = i71;
                    arrayList6 = arrayList6;
                    jSONArray7 = jSONArray;
                    str11 = str11;
                    i61 = i71118;
                    float f11112 = f6;
                    str10 = str10;
                    length = length;
                    z13 = z6;
                    f6 = f11112;
                    break;
            }
        }
    }

    static {
        C21153 c21153 = null;
        InterfaceC5204 interfaceC5204M49098 = null;
        C16215 c16215 = null;
        int i = 1183770253;
        int i2 = C0278.f1572;
        int i3 = C2477.f9839;
        int iM45029 = C19806.m45029("ۤۜ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-21963)) ^ (-470237328);
        int i5 = -1221160558;
        while (true) {
            i = ((((i ^ i3) * 17039) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2142959645:
                case -1923916651:
                    C0526.m2437();
                    throw new RuntimeException();
                case -1913306454:
                case -1258289388:
                    C3660.m10791();
                    if (!C0797.f3386) {
                        iM45029 = C19806.m45029("۠ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13045)) ^ 1562923866;
                        i5 = -1392807119;
                    } else {
                        iM45029 = C19806.m45029("֡ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-1411929179);
                        i5 = -1657615242;
                    }
                    break;
                case -1808313874:
                case -867448416:
                    f48398 = C22138.m49098(c16215);
                    return;
                case -1764865874:
                case 1563240381:
                    C2642.m8171();
                    if (C1066.f4915 > 0) {
                        iM45029 = (C19806.m45029("᩸᩶") + i2) * 85;
                        i4 = ((iM45029 ^ i3) * (-12759)) ^ 715756225;
                        i5 = 2090687645;
                    } else {
                        iM45029 = C19806.m45029("֡ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-1411929179);
                        i5 = -1657615242;
                    }
                    break;
                case -1551983053:
                case 1942086426:
                    C2124.m6673();
                    C1875.m6086();
                    iM45029 = C19806.m45029("֡ᩳ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-12663)) ^ (-1411929179);
                    i5 = -1657615242;
                    break;
                case -1375477651:
                case -160165373:
                    if (C10634.m26820()) {
                        iM45029 = C19806.m45029("֡ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-1411929179);
                        i5 = -1657615242;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28957) ^ (-1712196854);
                        i5 = 514111396;
                    }
                    break;
                case -1154653090:
                case -788544535:
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16377)) ^ 2058318437;
                        i5 = -749939200;
                    } else {
                        iM45029 = (C19806.m45029("ۡܿ") ^ i2) * (-87);
                        i4 = ((iM45029 ^ i3) * 21187) ^ 519249210;
                        i5 = -1884827310;
                    }
                    break;
                case -590698097:
                case 357030790:
                    RunnableC0195.m1431();
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16377)) ^ 2058318437;
                        i5 = -749939200;
                    } else {
                        iM45029 = C19806.m45029("֡ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-1411929179);
                        i5 = -1657615242;
                    }
                    break;
                case -551835157:
                case 1920843984:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i3 - C19806.m45029("۬ۤ")) * (-103);
                        i4 = ((iM45029 ^ i2) * 32321) ^ 1596237362;
                        i5 = -2119010757;
                    } else {
                        iM45029 = C19806.m45029("᩸ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27275)) ^ (-1804328595);
                        i5 = -887138037;
                    }
                    break;
                case -419448732:
                case 1944387539:
                    interfaceC5204M49098 = C22138.m49098(c21153);
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("۠ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13045)) ^ 1562923866;
                        i5 = -1392807119;
                    } else {
                        iM45029 = C19806.m45029("ᩴۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12681)) ^ 252403098;
                        i5 = 509885093;
                    }
                    break;
                case -123311167:
                case 263005781:
                    c16215 = new C16215();
                    if (RunnableC1564.m5345()) {
                        iM45029 = (C19806.m45029("᩸᩶") + i2) * 85;
                        i4 = ((iM45029 ^ i3) * (-12759)) ^ 715756225;
                        i5 = 2090687645;
                    } else {
                        iM45029 = C19806.m45029("᩻ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15315) ^ 1545990361;
                        i5 = -1132858518;
                    }
                    break;
                case 64192236:
                case 948913704:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("᩸᩶") + i2) * 85;
                        i4 = ((iM45029 ^ i3) * (-12759)) ^ 715756225;
                        i5 = 2090687645;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30983)) ^ 740837400;
                        i5 = 1862936005;
                    }
                    break;
                case 126615103:
                case 1559076006:
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16377)) ^ 2058318437;
                        i5 = -749939200;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۙ") ^ i3) * 57;
                        i4 = ((iM45029 ^ i2) * (-28859)) ^ (-1208761385);
                        i5 = -1886312311;
                    }
                    break;
                case 326734841:
                case 1955283646:
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("᩸᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27921)) ^ 1709125547;
                        i5 = -2042209297;
                    } else {
                        iM45029 = C19806.m45029("֡ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12663)) ^ (-1411929179);
                        i5 = -1657615242;
                    }
                    break;
                case 630221470:
                case 1851131567:
                    f48397 = interfaceC5204M49098;
                    if (C2124.m6673() <= 0) {
                        iM45029 = (i3 - C19806.m45029("۬ۤ")) * (-103);
                        i4 = ((iM45029 ^ i2) * 32321) ^ 1596237362;
                        i5 = -2119010757;
                    } else {
                        iM45029 = C19806.m45029("᩺ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19555) ^ 658488360;
                        i5 = 316219055;
                    }
                    break;
                default:
                    c21153 = new C21153();
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("۠ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13045)) ^ 1562923866;
                        i5 = -1392807119;
                    } else {
                        iM45029 = (C19806.m45029("᩻ۛ") + i2) * 55;
                        i4 = ((iM45029 ^ i3) * (-9805)) ^ (-512799388);
                        i5 = 1388867422;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17625 m35478() {
        return (C17625) f48397.getValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17625 m35471() {
        return (C17625) f48398.getValue();
    }
}
