package l;

import android.content.Intent;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩸ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 42S7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21613 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۙۢۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f70105 = {1740, 4728, 4708, 4733, 4719, 4705, 4710, 4673, 4716, 4709, 4711, 4716, 4717, 4734, 4717, 4730, 4731, 4705, 4711, 4710, 4678, 4713, 4709, 4717, 4698, 4717, 4728, 4708, 4713, 4715, 4717, 4709, 4717, 4710, 4732, 4733, 4728, 4716, 4713, 4732, 4717, 4683, 4711, 4710, 4732, 4717, 4710, 4732, 2803, 1237, 1162, 1174, 1167, 1181, 1171, 1172, 1237, 1182, 1183, 1164, 1237, 1177, 1170, 1183, 1177, 1169, 1237, 1167, 1162, 1182, 1179, 1166, 1183, 1224, 1167, 1162, 1182, 1179, 1166, 1183, 1209, 1173, 1172, 1166, 1183, 1172, 1166, 1162, 1174, 1167, 1181, 1171, 1172, 1203, 1182, 1162, 1179, 1177, 1169, 1179, 1181, 1183, 1193, 1171, 1152, 1183, 1164, 1183, 1160, 1161, 1171, 1173, 1172, 1209, 1173, 1182, 1183};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f70106;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f70107;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11986 f70108;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public JSONObject f70109;

    /* JADX WARN: Code duplicated, block: B:34:0x00f5 A[PHI: r18
      0x00f5: PHI (r18v25 int) = (r18v18 int), (r18v26 int) binds: [B:31:0x00dc, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x019b A[PHI: r3 r13 r18
      0x019b: PHI (r3v3 org.json.JSONObject) = (r3v1 org.json.JSONObject), (r3v2 org.json.JSONObject), (r3v1 org.json.JSONObject), (r3v1 org.json.JSONObject) binds: [B:163:0x019b, B:49:0x0199, B:35:0x010b, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r13v3 short[]) = (r13v1 short[]), (r13v2 short[]), (r13v1 short[]), (r13v1 short[]) binds: [B:163:0x019b, B:49:0x0199, B:35:0x010b, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r18v22 int) = (r18v6 int), (r18v13 int), (r18v17 int), (r18v26 int) binds: [B:163:0x019b, B:49:0x0199, B:35:0x010b, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x03d1 A[PHI: r4 r8 r11 r15 r18 r20 r21 r22
      0x03d1: PHI (r4v18 short[]) = (r4v15 short[]), (r4v19 short[]) binds: [B:91:0x03cf, B:83:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x03d1: PHI (r8v3 int) = (r8v2 int), (r8v1 int) binds: [B:91:0x03cf, B:83:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x03d1: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:91:0x03cf, B:83:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x03d1: PHI (r15v53 int) = (r15v50 int), (r15v54 int) binds: [B:91:0x03cf, B:83:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x03d1: PHI (r18v37 int) = (r18v34 int), (r18v38 int) binds: [B:91:0x03cf, B:83:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x03d1: PHI (r20v38 l.᩹֨ۘ) = (r20v35 l.᩹֨ۘ), (r20v39 l.᩹֨ۘ) binds: [B:91:0x03cf, B:83:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x03d1: PHI (r21v13 org.json.JSONObject) = (r21v10 org.json.JSONObject), (r21v14 org.json.JSONObject) binds: [B:91:0x03cf, B:83:0x036b] A[DONT_GENERATE, DONT_INLINE]
      0x03d1: PHI (r22v13 java.lang.String) = (r22v10 java.lang.String), (r22v14 java.lang.String) binds: [B:91:0x03cf, B:83:0x036b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5;
        C21947 c21947M13910 = null;
        JSONObject jSONObjectM48779 = null;
        String strM10423 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = -1942158395;
        int i13 = C2642.f10294;
        int i14 = C3535.f13026;
        int iM450211 = C19806.m45029("ۗۖ") ^ i14;
        int i15 = ((iM450211 ^ i13) * 28091) ^ (-263047289);
        int i16 = iM450211 ^ (-951954604);
        C11986 c11986 = null;
        while (true) {
            int i17 = i16 ^ (i15 & (((i12 ^ i13) * 6825) >> 31));
            switch (i17) {
                case -2138090096:
                case -227562841:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    int i18 = i8 + i9;
                    if (i7 - (i18 + i18) <= 0) {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("۠ᩳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM450210 ^ i13) * (-7219)) ^ (-1098937283);
                        i4 = 547917884;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ᩳ᩵") ^ i13;
                        i3 = ((iM450210 ^ i14) * (-32423)) ^ 1056828593;
                        i4 = 1111883129;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -1881100090:
                case 532763067:
                    i17 = i17;
                    this.f70109 = jSONObjectM48779.getJSONObject(strM10423);
                    iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i13) * (-91);
                    i = ((iM45029 ^ i14) * (-20013)) ^ 1680490391;
                    i2 = -637405053;
                    int i19 = i17;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    i12 = i19;
                    break;
                case -1796226071:
                case -711686761:
                    i17 = i17;
                    c21947M13910 = new C21947(2);
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i11 = i11;
                    int iM11306 = ThreadFactoryC3888.m11306("᩺֫") ^ i14;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    strM10423 = strM10423;
                    i16 = iM11306 ^ (-1251538146);
                    i15 = ((iM11306 ^ i13) * 9335) ^ 365496971;
                    jSONObjectM48779 = jSONObjectM48779;
                    break;
                case -1734167148:
                case -724394355:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    sArr = f70105;
                    if (C1668.m5583()) {
                        iM450210 = (i13 - C19806.m45029("ۨۜ")) * 29;
                        i3 = ((iM450210 ^ i14) * (-26683)) ^ (-208516828);
                        i4 = -1987358405;
                    } else {
                        iM450210 = C19806.m45029("ܶ᩵") ^ i14;
                        i3 = ((iM450210 ^ i13) * (-12647)) ^ (-1222741058);
                        i4 = 1515104776;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -1676849727:
                case 2045559841:
                    i17 = i17;
                    C0797.m3359();
                    C1460.m5050();
                    iM45029 = (ThreadFactoryC3888.m11306("۟ۤ") + i13) * 33;
                    i = ((iM45029 ^ i14) * 7747) ^ 602997139;
                    i2 = -1097951402;
                    int i110 = i17;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    i12 = i110;
                    break;
                case -1632897179:
                case 1169989862:
                    i17 = i17;
                    C19806.m45024();
                    if (C2642.f10294 > 0) {
                        iM45029 = (i13 - ThreadFactoryC3888.m11306("᩵᩹")) * 79;
                        i = ((iM45029 ^ i14) * 291) ^ 615584545;
                        i2 = -1613062499;
                        int i111 = i17;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                        i12 = i111;
                    } else {
                        c21947M13910 = c21947M13910;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        sArr2 = sArr2;
                        i11 = i11;
                        iM450210 = (C19806.m45029("ۘۢ") ^ i14) * 35;
                        i3 = ((iM450210 ^ i13) * 13017) ^ 169920042;
                        i4 = 1222276156;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        i11 = i11;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    }
                    break;
                case -1527501494:
                case 478237276:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    i7 = i6 * i6;
                    i8 = s * s;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM450210 = ThreadFactoryC3888.m11306("ܽ֫") ^ i13;
                        i3 = ((iM450210 ^ i14) * (-31975)) ^ (-307068829);
                        i4 = -1497459555;
                    } else {
                        iM450210 = (C19806.m45029("ۘۢ") ^ i14) * 35;
                        i3 = ((iM450210 ^ i13) * 13017) ^ 169920042;
                        i4 = 1222276156;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -1458567079:
                case -1155220659:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    c = '0';
                    if (!RunnableC1564.m5345()) {
                        iM450210 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i14;
                        i3 = ((iM450210 ^ i13) * (-3983)) ^ 1864777734;
                        i4 = -1622634095;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        i11 = i11;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    }
                    i11 = i11;
                    int iM11307 = (ThreadFactoryC3888.m11306("֫᩷") + i14) * (-89);
                    i3 = ((iM11307 ^ i13) * 19861) ^ 174905126;
                    i5 = iM11307 ^ 1319240126;
                    sArr2 = sArr2;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -1381396823:
                case -522738022:
                    C0671.m3008();
                    C3722.m10894();
                    return;
                case -1267951530:
                case -463024557:
                    if (C1875.f7103 < 0) {
                        i17 = i17;
                        iM45029 = ThreadFactoryC3888.m11306("ܽܿ") ^ i13;
                        i = ((iM45029 ^ i14) * 31839) ^ (-1492655484);
                        i2 = -1001668599;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ۫") ^ i14) * 29;
                        i17 = i17;
                        i = ((iM45029 ^ i13) * 27527) ^ 2069618132;
                        i2 = 1109144558;
                    }
                    int i112 = i17;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    i12 = i112;
                    break;
                case -1188755287:
                case -1169543687:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    i9 = 2729104;
                    if (C2788.f10625 >= 0) {
                        iM450210 = C19806.m45029("᩹ۘ") ^ i13;
                        i3 = ((iM450210 ^ i14) * 3609) ^ 2008974884;
                        i4 = 1917114443;
                    } else {
                        iM450210 = C19806.m45029("᩷۫") ^ i14;
                        i3 = ((iM450210 ^ i13) * 1645) ^ 887025706;
                        i4 = -1383289364;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -1129852055:
                case 540011991:
                    i17 = i17;
                    RunnableC1895.m6170();
                    if (!CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۤ") + i13) * 33;
                        i = ((iM45029 ^ i14) * 7747) ^ 602997139;
                        i2 = -1097951402;
                        int i113 = i17;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                        i12 = i113;
                    } else {
                        c21947M13910 = c21947M13910;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        sArr2 = sArr2;
                        i11 = i11;
                        iM450210 = (C19806.m45029("ۘۢ") ^ i14) * 35;
                        i3 = ((iM450210 ^ i13) * 13017) ^ 169920042;
                        i4 = 1222276156;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        i11 = i11;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    }
                    break;
                case -1114734953:
                case 211841958:
                    i17 = i17;
                    try {
                        C22653 c22653M35592 = C14892.m35592(c11986);
                        c21947M13910 = c21947M13910;
                        jSONObjectM48779 = jSONObjectM48779;
                        try {
                            C5013 c5013M13902 = C5013.m13902(ViewTreeObserverOnPreDrawListenerC3327.m9869(f70105, 49, 25, i10));
                            c5013M13902.m13904();
                            strM10423 = strM10423;
                            try {
                                C3577.m10570(c5013M13902, C1398.m4892(f70105, 87, 8, i10), RunnableC1564.m5347(c11986));
                                sArr2 = sArr2;
                                i11 = i11;
                                try {
                                    C3577.m10570(c5013M13902, C3660.m10790(f70105, 95, 11, i10), String.valueOf(c22653M35592.f73800));
                                    ViewTreeObserverOnPreDrawListenerC3327.m9867(c5013M13902, C0671.m3009(f70105, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 11, i10), C2124.m6684(c11986.m29823()));
                                    c21947M13910 = c5013M13902.m13910();
                                    int iM11308 = ThreadFactoryC3888.m11306("᩺֫") ^ i14;
                                    sArr2 = sArr2;
                                    i11 = i11;
                                    i12 = i17;
                                    strM10423 = strM10423;
                                    i16 = iM11308 ^ (-1251538146);
                                    i15 = ((iM11308 ^ i13) * 9335) ^ 365496971;
                                    jSONObjectM48779 = jSONObjectM48779;
                                } catch (Exception unused) {
                                    iM450210 = ThreadFactoryC3888.m11306("۠ۘ") ^ i13;
                                    i3 = ((iM450210 ^ i14) * 16403) ^ (-237457127);
                                    i4 = -904977323;
                                    i5 = iM450210 ^ i4;
                                    sArr2 = sArr2;
                                    i11 = i11;
                                    i12 = i17;
                                    jSONObjectM48779 = jSONObjectM48779;
                                    strM10423 = strM10423;
                                    i16 = i5;
                                    i15 = i3;
                                    c21947M13910 = c21947M13910;
                                }
                            } catch (Exception unused2) {
                                sArr2 = sArr2;
                                i11 = i11;
                                iM450210 = ThreadFactoryC3888.m11306("۠ۘ") ^ i13;
                                i3 = ((iM450210 ^ i14) * 16403) ^ (-237457127);
                                i4 = -904977323;
                                i5 = iM450210 ^ i4;
                                sArr2 = sArr2;
                                i11 = i11;
                                i12 = i17;
                                jSONObjectM48779 = jSONObjectM48779;
                                strM10423 = strM10423;
                                i16 = i5;
                                i15 = i3;
                                c21947M13910 = c21947M13910;
                                break;
                            }
                        } catch (Exception unused3) {
                            strM10423 = strM10423;
                            sArr2 = sArr2;
                            i11 = i11;
                            iM450210 = ThreadFactoryC3888.m11306("۠ۘ") ^ i13;
                            i3 = ((iM450210 ^ i14) * 16403) ^ (-237457127);
                            i4 = -904977323;
                            i5 = iM450210 ^ i4;
                            sArr2 = sArr2;
                            i11 = i11;
                            i12 = i17;
                            jSONObjectM48779 = jSONObjectM48779;
                            strM10423 = strM10423;
                            i16 = i5;
                            i15 = i3;
                            c21947M13910 = c21947M13910;
                            break;
                        }
                    } catch (Exception unused4) {
                        c21947M13910 = c21947M13910;
                        jSONObjectM48779 = jSONObjectM48779;
                    }
                    break;
                case -1094745537:
                case 1574816033:
                    i10 = 49547;
                    iM450210 = (ThreadFactoryC3888.m11306("ۤۤ") + i14) * 17;
                    i3 = ((iM450210 ^ i13) * (-6387)) ^ (-922818514);
                    i4 = -1091662108;
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -1062714732:
                case 328189533:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    s = sArr[c];
                    if (C0671.f2816 == 0) {
                        iM450210 = (C19806.m45029("ۨܳ") + i13) * 47;
                        i3 = ((iM450210 ^ i14) * 1497) ^ (-1170376916);
                        i4 = -1693997604;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        i11 = i11;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    }
                    i11 = i11;
                    int iM11309 = (ThreadFactoryC3888.m11306("֫᩷") + i14) * (-89);
                    i3 = ((iM11309 ^ i13) * 19861) ^ 174905126;
                    i5 = iM11309 ^ 1319240126;
                    sArr2 = sArr2;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -607942479:
                case 1342098302:
                    i17 = i17;
                    jSONObjectM48779 = c21947M13910.m48779();
                    sArr2 = f70105;
                    if (C2642.m8171() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۤ") + i13) * 33;
                        i = ((iM45029 ^ i14) * 7747) ^ 602997139;
                        i2 = -1097951402;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ᩸") + i14) * 35;
                        i = ((iM45029 ^ i13) * (-16197)) ^ 939527430;
                        i2 = 1346090612;
                    }
                    int i114 = i17;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    i12 = i114;
                    break;
                case -546282673:
                case 597048723:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    if (RunnableC0195.f1321 >= 0) {
                        iM450210 = C19806.m45029("֨ۗ") ^ i13;
                        i3 = ((iM450210 ^ i14) * 18291) ^ 336014402;
                        i4 = 1816153882;
                    } else {
                        iM450210 = C19806.m45029("ܿ᩹") ^ i13;
                        i3 = ((iM450210 ^ i14) * (-20005)) ^ (-398409487);
                        i4 = -1232369287;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -528399148:
                case 1399186403:
                    i17 = i17;
                    C1460.m5050();
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i14;
                        i = ((iM45029 ^ i13) * 22773) ^ (-702892857);
                        i2 = -1007834160;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܿ") ^ i13;
                        i = ((iM45029 ^ i14) * 31839) ^ (-1492655484);
                        i2 = -1001668599;
                    }
                    int i115 = i17;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    i12 = i115;
                    break;
                case -484692885:
                case 584355956:
                    c21947M13910 = c21947M13910;
                    JSONObject jSONObject = jSONObjectM48779;
                    C11986 c11987 = this.f70108;
                    int iM450212 = C19806.m45029("᩵ۖ") ^ i13;
                    c11986 = c11987;
                    i15 = ((iM450212 ^ i14) * 22439) ^ (-1341205683);
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObject;
                    strM10423 = strM10423;
                    i16 = iM450212 ^ 322450077;
                    c21947M13910 = c21947M13910;
                    break;
                case -360444560:
                case 372284663:
                    i17 = i17;
                    if (c21947M13910.m48774()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i14;
                        i = ((iM45029 ^ i13) * (-29111)) ^ (-981246528);
                        i2 = 270407891;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩺") ^ i13;
                        i = ((iM45029 ^ i14) * 12881) ^ (-345315198);
                        i2 = 706722760;
                    }
                    int i116 = i17;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    i12 = i116;
                    break;
                case -322107108:
                case 95317992:
                    if (C10634.f36300 >= 0) {
                        c21947M13910 = c21947M13910;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        sArr2 = sArr2;
                        i17 = i17;
                        i11 = i11;
                        iM450210 = C19806.m45029("֨ۗ") ^ i13;
                        i3 = ((iM450210 ^ i14) * 18291) ^ 336014402;
                        i4 = 1816153882;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        i11 = i11;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    }
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    int iM113010 = (ThreadFactoryC3888.m11306("֫᩷") + i14) * (-89);
                    i3 = ((iM113010 ^ i13) * 19861) ^ 174905126;
                    i5 = iM113010 ^ 1319240126;
                    sArr2 = sArr2;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case -117623072:
                case 1843173646:
                    C2477.m7593();
                    if (C3577.f13150 < 0) {
                        c21947M13910 = c21947M13910;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        sArr2 = sArr2;
                        i17 = i17;
                        i11 = i11;
                        iM450210 = C19806.m45029("ܶ᩵") ^ i14;
                        i3 = ((iM450210 ^ i13) * (-12647)) ^ (-1222741058);
                        i4 = 1515104776;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        i11 = i11;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ۫") ^ i14) * 29;
                        i17 = i17;
                        i = ((iM45029 ^ i13) * 27527) ^ 2069618132;
                        i2 = 1109144558;
                        int i117 = i17;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                        i12 = i117;
                    }
                    break;
                case 27272355:
                case 855404216:
                    i10 = 1274;
                    iM450210 = (ThreadFactoryC3888.m11306("ۤۤ") + i14) * 17;
                    i3 = ((iM450210 ^ i13) * (-6387)) ^ (-922818514);
                    i4 = -1091662108;
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case 261146345:
                case 426258805:
                    return;
                case 487096789:
                case 1764537476:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    if (C3722.m10894() > 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("۬᩶") + i14) * 13;
                        i3 = ((iM450210 ^ i13) * (-30709)) ^ 580275161;
                        i4 = 18819162;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        i11 = i11;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    }
                    i11 = i11;
                    int iM113011 = (ThreadFactoryC3888.m11306("֫᩷") + i14) * (-89);
                    i3 = ((iM113011 ^ i13) * 19861) ^ 174905126;
                    i5 = iM113011 ^ 1319240126;
                    sArr2 = sArr2;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case 820196659:
                case 1943765775:
                    C1461.m5080();
                    if (C2124.f7782 <= 0) {
                        c21947M13910 = c21947M13910;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        sArr2 = sArr2;
                        i17 = i17;
                        int iM113012 = (ThreadFactoryC3888.m11306("֫᩷") + i14) * (-89);
                        i3 = ((iM113012 ^ i13) * 19861) ^ 174905126;
                        i5 = iM113012 ^ 1319240126;
                        sArr2 = sArr2;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    } else {
                        i17 = i17;
                        iM45029 = (i13 - ThreadFactoryC3888.m11306("᩵᩹")) * 79;
                        i = ((iM45029 ^ i14) * 291) ^ 615584545;
                        i2 = -1613062499;
                        int i118 = i17;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                        i12 = i118;
                    }
                    break;
                case 897845280:
                case 1473784709:
                    throw new C4987(c21947M13910.m48781());
                case 1028414947:
                case 1842312994:
                    i17 = i17;
                    strM10423 = C3535.m10423(sArr2, i11, 13, i10);
                    if (jSONObjectM48779.has(strM10423)) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۡ") ^ i14;
                        i = ((iM45029 ^ i13) * 7147) ^ (-1427260791);
                        i2 = -805285856;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i13) * (-91);
                        i = ((iM45029 ^ i14) * (-20013)) ^ 1680490391;
                        i2 = -637405053;
                    }
                    int i119 = i17;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    i12 = i119;
                    break;
                case 1119029455:
                case 1454617783:
                    c21947M13910 = c21947M13910;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    sArr2 = sArr2;
                    i17 = i17;
                    i11 = i11;
                    i6 = s + 1652;
                    if (C1148.f5161 <= 0) {
                        iM450210 = C19806.m45029("᩹ۘ") ^ i13;
                        i3 = ((iM450210 ^ i14) * 3609) ^ 2008974884;
                        i4 = 1917114443;
                    } else {
                        iM450210 = C19806.m45029("ۢ᩸") ^ i14;
                        i3 = ((iM450210 ^ i13) * 31959) ^ (-1235742717);
                        i4 = 1130463637;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    i11 = i11;
                    i12 = i17;
                    jSONObjectM48779 = jSONObjectM48779;
                    strM10423 = strM10423;
                    i16 = i5;
                    i15 = i3;
                    c21947M13910 = c21947M13910;
                    break;
                case 1212944914:
                case 1274247639:
                    i17 = i17;
                    i11 = 74;
                    if (AbstractC0464.m2313() == 0) {
                        iM45029 = (i13 - C19806.m45029("᩺᩷")) * 123;
                        i = ((iM45029 ^ i14) * (-32091)) ^ 1941719313;
                        i2 = 324074092;
                        int i1110 = i17;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                        i12 = i1110;
                    } else {
                        c21947M13910 = c21947M13910;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        sArr2 = sArr2;
                        int iM113013 = (ThreadFactoryC3888.m11306("֫᩷") + i14) * (-89);
                        i3 = ((iM113013 ^ i13) * 19861) ^ 174905126;
                        i5 = iM113013 ^ 1319240126;
                        sArr2 = sArr2;
                        i12 = i17;
                        jSONObjectM48779 = jSONObjectM48779;
                        strM10423 = strM10423;
                        i16 = i5;
                        i15 = i3;
                        c21947M13910 = c21947M13910;
                    }
                    break;
                default:
                    i17 = i17;
                    AbstractC0464.m2313();
                    if (C1875.f7103 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۤ") + i13) * 33;
                        i = ((iM45029 ^ i14) * 7747) ^ 602997139;
                        i2 = -1097951402;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i14;
                        i = ((iM45029 ^ i13) * 22773) ^ (-702892857);
                        i2 = -1007834160;
                    }
                    int i1111 = i17;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    i12 = i1111;
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int iM45029;
        int i;
        int i2;
        int i3;
        int i4;
        int iM11306;
        int i5;
        short[] sArr;
        int i6;
        short[] sArr2;
        short[] sArr3;
        C21613 c21613 = this;
        Intent intent = null;
        AbstractActivityC12483 abstractActivityC12483 = null;
        String strM3741 = null;
        String strM3859 = null;
        String strM5481 = null;
        int i7 = 0;
        String strM10790 = null;
        JSONObject jSONObject = null;
        int i8 = 0;
        short[] sArr4 = null;
        int i9 = 1062622416;
        int i10 = C1025.f4800;
        int i11 = C2124.f7782;
        int iM450210 = C19806.m45029("۟ܿ") ^ i11;
        int i12 = ((iM450210 ^ i10) * (-71)) ^ 1334146934;
        int i13 = iM450210 ^ (-1249318235);
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        short[] sArr7 = null;
        short[] sArr8 = null;
        while (true) {
            i9 = i13 ^ ((((i9 ^ i10) * 28025) >> 31) & i12);
            switch (i9) {
                case -2118352829:
                case -1755374595:
                    sArr6 = sArr6;
                    C1189.m4372(intent, strM3859, strM3741);
                    sArr4 = f70105;
                    if (C2788.f10625 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i10;
                        i12 = ((iM11306 ^ i11) * 12599) ^ (-917502755);
                        i5 = -1474714211;
                        sArr2 = sArr6;
                        i13 = iM11306 ^ i5;
                        sArr6 = sArr2;
                    } else {
                        intent = intent;
                        sArr6 = sArr6;
                        int iM11307 = ThreadFactoryC3888.m11306("֡ۨ") ^ i10;
                        i = ((iM11307 ^ i11) * (-5105)) ^ (-1475554376);
                        i13 = iM11307 ^ 331370097;
                        c21613 = this;
                        Intent intent2 = intent;
                        i12 = i;
                        intent = intent2;
                    }
                    break;
                case -2098976800:
                case 1515084371:
                    sArr6 = sArr6;
                    C1189.m4372(intent, C1875.m6105(sArr6, i14, i15, i8), C2124.m6674(jSONObject));
                    iM11306 = (ThreadFactoryC3888.m11306("ᩴܿ") ^ i10) * 43;
                    i12 = ((iM11306 ^ i11) * 27485) ^ (-296361073);
                    i5 = 563907182;
                    sArr2 = sArr6;
                    i13 = iM11306 ^ i5;
                    sArr6 = sArr2;
                    break;
                case -1936539975:
                case -1790640374:
                    i8 = 27228;
                    iM45029 = C19806.m45029("ܰ۬") ^ i10;
                    i = ((iM45029 ^ i11) * 31671) ^ 274689204;
                    i2 = 2146902867;
                    int i16 = iM45029 ^ i2;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    i13 = i16;
                    c21613 = this;
                    Intent intent3 = intent;
                    i12 = i;
                    intent = intent3;
                    break;
                case -1843099271:
                case 1135705109:
                    sArr6 = f70105;
                    i15 = 13;
                    if (C2332.f8260) {
                        int iM11308 = ThreadFactoryC3888.m11306("᩺۫") ^ i10;
                        i12 = ((iM11308 ^ i11) * 8599) ^ 863507632;
                        i13 = 1381427358 ^ iM11308;
                        i14 = 35;
                    } else {
                        intent = intent;
                        i14 = 35;
                        int iM11309 = ThreadFactoryC3888.m11306("֡ۨ") ^ i10;
                        i = ((iM11309 ^ i11) * (-5105)) ^ (-1475554376);
                        i13 = iM11309 ^ 331370097;
                        c21613 = this;
                        Intent intent4 = intent;
                        i12 = i;
                        intent = intent4;
                    }
                    break;
                case -1722974817:
                case 2022478136:
                    intent = intent;
                    sArr6 = sArr6;
                    strM3741 = C0962.m3741(c21613.f70108);
                    sArr5 = f70105;
                    if (C0216.m1591() > 0) {
                        int iM450211 = (C19806.m45029("ۧۢ") + i10) * (-49);
                        i3 = ((iM450211 ^ i11) * (-11761)) ^ 701182436;
                        i4 = iM450211 ^ 1883763255;
                        sArr2 = sArr6;
                        i13 = i4;
                        intent = intent;
                        i12 = i3;
                        sArr6 = sArr2;
                    } else {
                        sArr6 = sArr6;
                        int iM113010 = ThreadFactoryC3888.m11306("֡ۨ") ^ i10;
                        i = ((iM113010 ^ i11) * (-5105)) ^ (-1475554376);
                        i13 = iM113010 ^ 331370097;
                        c21613 = this;
                        Intent intent5 = intent;
                        i12 = i;
                        intent = intent5;
                    }
                    break;
                case -1473281538:
                case 834719554:
                    sArr6 = sArr6;
                    intent.putExtra(strM5481, i7);
                    sArr8 = f70105;
                    if (C0526.m2437() < 0) {
                        iM11306 = (C19806.m45029("۠ܳ") + i11) * 79;
                        i12 = ((iM11306 ^ i10) * 8383) ^ (-1171649725);
                        i5 = -1540363024;
                        sArr2 = sArr6;
                        i13 = iM11306 ^ i5;
                        sArr6 = sArr2;
                    } else {
                        sArr = sArr5;
                        int iM450212 = C19806.m45029("ܺۡ") ^ i11;
                        i12 = ((iM450212 ^ i10) * 9639) ^ 1240426314;
                        i6 = 612707450 ^ iM450212;
                        sArr5 = sArr;
                        sArr6 = sArr6;
                        i13 = i6;
                        c21613 = this;
                    }
                    break;
                case -1354354144:
                case 1226944604:
                    sArr6 = sArr6;
                    sArr = sArr5;
                    AbstractActivityC12483 abstractActivityC12484 = c21613.f70106;
                    intent = new Intent(abstractActivityC12484, (Class<?>) ViewOnClickListenerC19497.class);
                    if (C1066.f4915 <= 0) {
                        abstractActivityC12483 = abstractActivityC12484;
                        int iM450213 = C19806.m45029("ܺۡ") ^ i11;
                        i12 = ((iM450213 ^ i10) * 9639) ^ 1240426314;
                        i6 = 612707450 ^ iM450213;
                    } else {
                        int iM450214 = C19806.m45029("ۨ۟") ^ i11;
                        i12 = ((iM450214 ^ i10) * 20365) ^ (-545111120);
                        i6 = iM450214 ^ (-287955101);
                        abstractActivityC12483 = abstractActivityC12484;
                    }
                    sArr5 = sArr;
                    sArr6 = sArr6;
                    i13 = i6;
                    c21613 = this;
                    break;
                case -1205409239:
                case -143043417:
                    intent = intent;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    int i17 = s + s2;
                    if ((i17 * i17) - (51436 * s) < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i11;
                        i = ((iM45029 ^ i10) * 25073) ^ 1699439102;
                        i2 = -488668200;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۘ") ^ i10;
                        i = ((iM45029 ^ i11) * (-32483)) ^ (-1763154997);
                        i2 = -1313318575;
                    }
                    int i18 = iM45029 ^ i2;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    i13 = i18;
                    c21613 = this;
                    Intent intent6 = intent;
                    i12 = i;
                    intent = intent6;
                    break;
                case -1125338861:
                case 2024317378:
                    sArr6 = sArr6;
                    strM5481 = RunnableC1606.m5481(sArr4, 9, 4, i8);
                    i7 = 1;
                    if (!C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۖ") ^ i11;
                        i12 = ((iM11306 ^ i10) * (-18255)) ^ 179361130;
                        i5 = -541795449;
                        sArr2 = sArr6;
                        i13 = iM11306 ^ i5;
                        sArr6 = sArr2;
                    } else {
                        sArr3 = sArr5;
                        int iM113011 = (ThreadFactoryC3888.m11306("ۚܶ") + i11) * 23;
                        sArr5 = sArr3;
                        i12 = ((iM113011 ^ i10) * (-31703)) ^ 563227128;
                        intent = intent;
                        short[] sArr9 = sArr6;
                        i13 = iM113011 ^ (-790688711);
                        sArr6 = sArr9;
                    }
                    break;
                case -1038896914:
                case 784293628:
                    intent = intent;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    sArr7 = f70105;
                    c = 0;
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ۨۧ") + i11) * 3;
                        i = ((iM45029 ^ i10) * (-21659)) ^ 1830636492;
                        i2 = -1404447790;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i11;
                        i = ((iM45029 ^ i10) * 17371) ^ 1308902679;
                        i2 = -1259628478;
                    }
                    int i19 = iM45029 ^ i2;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    i13 = i19;
                    c21613 = this;
                    Intent intent7 = intent;
                    i12 = i;
                    intent = intent7;
                    break;
                case -1016000551:
                case 412429036:
                    C1377.m4833();
                    if (C1148.m4232() <= 0) {
                        intent = intent;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        iM45029 = (C19806.m45029("ۨۧ") + i11) * 3;
                        i = ((iM45029 ^ i10) * (-21659)) ^ 1830636492;
                        i2 = -1404447790;
                        int i110 = iM45029 ^ i2;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i13 = i110;
                        c21613 = this;
                        Intent intent8 = intent;
                        i12 = i;
                        intent = intent8;
                    } else {
                        sArr6 = sArr6;
                        sArr = sArr5;
                        int iM450215 = C19806.m45029("ܺۡ") ^ i11;
                        i12 = ((iM450215 ^ i10) * 9639) ^ 1240426314;
                        i6 = 612707450 ^ iM450215;
                        sArr5 = sArr;
                        sArr6 = sArr6;
                        i13 = i6;
                        c21613 = this;
                    }
                    break;
                case -895681844:
                case -542855307:
                    if (C1460.f5948 < 0) {
                        sArr6 = sArr6;
                        iM11306 = C19806.m45029("᩵ۨ") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-8781)) ^ 1046106463;
                        i5 = -1410294709;
                        sArr2 = sArr6;
                        i13 = iM11306 ^ i5;
                        sArr6 = sArr2;
                    } else {
                        sArr6 = sArr6;
                        sArr3 = sArr5;
                        int iM113012 = (ThreadFactoryC3888.m11306("ۚܶ") + i11) * 23;
                        sArr5 = sArr3;
                        i12 = ((iM113012 ^ i10) * (-31703)) ^ 563227128;
                        intent = intent;
                        short[] sArr10 = sArr6;
                        i13 = iM113012 ^ (-790688711);
                        sArr6 = sArr10;
                    }
                    break;
                case 62494438:
                case 798249282:
                    C3286.m9800(abstractActivityC12483, intent);
                    break;
                case 250657086:
                case 1876150840:
                    C0817.m3399();
                    C3286.m9798();
                    break;
                case 786340361:
                case 1394494614:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1668.m5583();
                    sArr6 = sArr6;
                    sArr3 = sArr5;
                    int iM113013 = (ThreadFactoryC3888.m11306("ۚܶ") + i11) * 23;
                    sArr5 = sArr3;
                    i12 = ((iM113013 ^ i10) * (-31703)) ^ 563227128;
                    intent = intent;
                    short[] sArr11 = sArr6;
                    i13 = iM113013 ^ (-790688711);
                    sArr6 = sArr11;
                    break;
                case 831235461:
                case 1628010367:
                    i8 = 4616;
                    iM45029 = C19806.m45029("ܰ۬") ^ i10;
                    i = ((iM45029 ^ i11) * 31671) ^ 274689204;
                    i2 = 2146902867;
                    int i111 = iM45029 ^ i2;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    i13 = i111;
                    c21613 = this;
                    Intent intent9 = intent;
                    i12 = i;
                    intent = intent9;
                    break;
                case 1166964034:
                case 1299036146:
                    sArr6 = sArr6;
                    strM10790 = C3660.m10790(sArr8, 13, 22, i8);
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("᩵ۨ") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-8781)) ^ 1046106463;
                        i5 = -1410294709;
                    } else {
                        iM11306 = (C19806.m45029("֫ۢ") ^ i10) * (-15);
                        i12 = ((iM11306 ^ i11) * 17037) ^ (-599279050);
                        i5 = -1860432592;
                    }
                    sArr2 = sArr6;
                    i13 = iM11306 ^ i5;
                    sArr6 = sArr2;
                    break;
                case 1229653993:
                case 1417744872:
                    sArr6 = sArr6;
                    C1189.m4372(intent, strM10790, c21613.f70107);
                    jSONObject = c21613.f70109;
                    if (jSONObject != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۗ") ^ i11;
                        i12 = ((iM11306 ^ i10) * (-28159)) ^ (-2088843960);
                        i5 = -440412782;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܿ") ^ i10) * 43;
                        i12 = ((iM11306 ^ i11) * 27485) ^ (-296361073);
                        i5 = 563907182;
                    }
                    sArr2 = sArr6;
                    i13 = iM11306 ^ i5;
                    sArr6 = sArr2;
                    break;
                case 1676256502:
                case 2105683009:
                    sArr6 = sArr6;
                    sArr3 = sArr5;
                    strM3859 = C1025.m3859(sArr3, 1, 8, i8);
                    if (C3660.f13403 < 0) {
                        intent = intent;
                        int iM450216 = C19806.m45029("ۙܺ") ^ i11;
                        i3 = ((iM450216 ^ i10) * (-30075)) ^ 969390439;
                        i4 = iM450216 ^ (-165159479);
                        sArr5 = sArr3;
                        sArr2 = sArr6;
                        i13 = i4;
                        intent = intent;
                        i12 = i3;
                        sArr6 = sArr2;
                    } else {
                        int iM113014 = (ThreadFactoryC3888.m11306("ۚܶ") + i11) * 23;
                        sArr5 = sArr3;
                        i12 = ((iM113014 ^ i10) * (-31703)) ^ 563227128;
                        intent = intent;
                        short[] sArr12 = sArr6;
                        i13 = iM113014 ^ (-790688711);
                        sArr6 = sArr12;
                    }
                    break;
                case 2044608157:
                case 2067944343:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1460.m5050() != 0) {
                        sArr6 = sArr6;
                        sArr = sArr5;
                        int iM450217 = C19806.m45029("ܺۡ") ^ i11;
                        i12 = ((iM450217 ^ i10) * 9639) ^ 1240426314;
                        i6 = 612707450 ^ iM450217;
                        sArr5 = sArr;
                        sArr6 = sArr6;
                        i13 = i6;
                        c21613 = this;
                    } else {
                        sArr6 = sArr6;
                        sArr3 = sArr5;
                        int iM113015 = (ThreadFactoryC3888.m11306("ۚܶ") + i11) * 23;
                        sArr5 = sArr3;
                        i12 = ((iM113015 ^ i10) * (-31703)) ^ 563227128;
                        intent = intent;
                        short[] sArr13 = sArr6;
                        i13 = iM113015 ^ (-790688711);
                        sArr6 = sArr13;
                    }
                    break;
                default:
                    intent = intent;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    s = sArr7[c];
                    s2 = 12859;
                    if (C1460.f5948 < 0) {
                        iM45029 = (C19806.m45029("᩷ᩴ") + i10) * (-23);
                        i = ((iM45029 ^ i11) * 2745) ^ (-1606102527);
                        i2 = -925909205;
                        int i112 = iM45029 ^ i2;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i13 = i112;
                        c21613 = this;
                        Intent intent10 = intent;
                        i12 = i;
                        intent = intent10;
                    } else {
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        int iM113016 = ThreadFactoryC3888.m11306("֡ۨ") ^ i10;
                        i = ((iM113016 ^ i11) * (-5105)) ^ (-1475554376);
                        i13 = iM113016 ^ 331370097;
                        c21613 = this;
                        Intent intent11 = intent;
                        i12 = i;
                        intent = intent11;
                    }
                    break;
            }
            return;
        }
    }

    public C21613(AbstractActivityC12483 abstractActivityC12483, C11986 c11986, String str) {
        int i = 863305057;
        int i2 = RunnableC1606.f6488;
        int i3 = C1668.f6641;
        this.f70106 = abstractActivityC12483;
        this.f70108 = c11986;
        this.f70107 = str;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("֫ۚ")) * 29;
        int i4 = ((iM11306 ^ i3) * (-13125)) ^ 936858644;
        int i5 = -1120219543;
        while (true) {
            i = (iM11306 ^ i5) ^ (i4 & (((i ^ i3) * 28215) >> 31));
            switch (i) {
                case -2025580305:
                case -1595302129:
                    C2477.m7593();
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10609)) ^ 757848253;
                        i5 = -1179205229;
                    }
                    break;
                case -1771805140:
                case -1322176250:
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31055)) ^ (-629044147);
                        i5 = -1425409953;
                    } else {
                        iM11306 = C19806.m45029("ܶܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32725)) ^ 1456075305;
                        i5 = -1695064780;
                        continue;
                    }
                    break;
                case -1720802337:
                case 1449249891:
                    if (!C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15565) ^ (-1615079978);
                        i5 = -1238785495;
                    }
                    break;
                case -624246561:
                case 559125855:
                    C1189.m4368();
                    C3577.m10565();
                    break;
                case -3360999:
                case 1048032887:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    throw new RuntimeException();
                case 1965059409:
                case 1969128070:
                    return;
                default:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (i2 - C19806.m45029("ܿۙ")) * 101;
                        i4 = ((iM11306 ^ i3) * (-637)) ^ 1982986491;
                        i5 = 411592953;
                    }
                    break;
            }
            iM11306 = (C19806.m45029("ܿ֡") + i3) * (-39);
            i4 = ((iM11306 ^ i2) * (-7215)) ^ (-1186485665);
            i5 = -766154290;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C0671.m3016(this, this.f70106);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C1025.m3860(this);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        int i = 1074311017;
        int i2 = C1875.f7103;
        int i3 = C2788.f10625;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨܳ")) * (-53);
        int i4 = ((iM11306 ^ i2) * (-3953)) ^ 950845465;
        int i5 = -296397639;
        while (true) {
            i = ((((i ^ i2) * 24521) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1991162880:
                case -1399365357:
                    if (exc instanceof C4987) {
                        iM11306 = C19806.m45029("᩻ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2607)) ^ (-208052110);
                        i5 = -2040691468;
                    } else {
                        iM11306 = C19806.m45029("᩷ܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24385) ^ (-252645505);
                        i5 = -137254733;
                    }
                    break;
                case -1957935693:
                case -1086500226:
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۡ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * (-29663)) ^ (-2139007983);
                        i5 = 1855149213;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29177)) ^ 190396605;
                        i5 = -1127401785;
                    }
                    break;
                case -1947943977:
                case -803404018:
                    if (C3722.m10894() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۡ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * (-29663)) ^ (-2139007983);
                        i5 = 1855149213;
                    } else {
                        iM11306 = (C19806.m45029("ܶۙ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * (-1947)) ^ (-1377394590);
                        i5 = -1741690069;
                    }
                    break;
                case -1927350649:
                case 1426761418:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (C19806.m45029("ܳۧ") + i2) * 51;
                        i4 = ((iM11306 ^ i3) * (-16761)) ^ 1319473989;
                        i5 = 783358241;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23789) ^ (-322722840);
                        i5 = -701308140;
                    }
                    break;
                case -1922289388:
                case -196749230:
                    C1875.m6086();
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠۬") ^ i3) * (-57);
                        i4 = ((iM11306 ^ i2) * (-10139)) ^ 1096883597;
                        i5 = -26754096;
                    } else {
                        iM11306 = (C19806.m45029("ܶۙ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * (-1947)) ^ (-1377394590);
                        i5 = -1741690069;
                    }
                    break;
                case -1550710106:
                case -1148504244:
                    C1461.m5080();
                    iM11306 = (C19806.m45029("ܶۙ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM11306 ^ i3) * (-1947)) ^ (-1377394590);
                    i5 = -1741690069;
                    break;
                case -1256217898:
                case 1023618043:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("֡ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8901) ^ 1376438533;
                        i5 = 1577772118;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۟ۙ")) * 75;
                        i4 = ((iM11306 ^ i2) * (-23907)) ^ (-1563240493);
                        i5 = -85064848;
                    }
                    break;
                case -1096575209:
                case -546177719:
                    if (C0216.f1393 != 0) {
                        iM11306 = (C19806.m45029("ܳۧ") + i2) * 51;
                        i4 = ((iM11306 ^ i3) * (-16761)) ^ 1319473989;
                        i5 = 783358241;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۠") ^ i2) * (-13);
                        i4 = ((iM11306 ^ i3) * (-15657)) ^ 1404262743;
                        i5 = -1320242082;
                    }
                    break;
                case -1020708030:
                case 1448108196:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("ܳۧ") + i2) * 51;
                        i4 = ((iM11306 ^ i3) * (-16761)) ^ 1319473989;
                        i5 = 783358241;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܰ") ^ i3) * 127;
                        i4 = ((iM11306 ^ i2) * 3341) ^ (-374794089);
                        i5 = 1870650892;
                    }
                    break;
                case -708022373:
                case -369913401:
                    C1148.m4232();
                    C0671.m3008();
                    break;
                case -499155256:
                case 2143171105:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ܳۧ") + i2) * 51;
                        i4 = ((iM11306 ^ i3) * (-16761)) ^ 1319473989;
                        i5 = 783358241;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠۬") ^ i3) * (-57);
                        i4 = ((iM11306 ^ i2) * (-10139)) ^ 1096883597;
                        i5 = -26754096;
                    }
                    break;
                case -130080706:
                case 1315392311:
                    if (RunnableC0195.m1431()) {
                        iM11306 = C19806.m45029("۬ۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3543)) ^ (-1129648017);
                        i5 = 1556340875;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۡ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * (-29663)) ^ (-2139007983);
                        i5 = 1855149213;
                    }
                    break;
                case -82466101:
                case 1412245855:
                    if (C1148.m4232() <= 0) {
                        iM11306 = C19806.m45029("֡ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8901) ^ 1376438533;
                        i5 = 1577772118;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩸ۖ")) * (-5);
                        i4 = ((iM11306 ^ i3) * 6789) ^ 1504025532;
                        i5 = -515145099;
                    }
                    break;
                case 161294133:
                case 1541564032:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۡ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * (-29663)) ^ (-2139007983);
                        i5 = 1855149213;
                    } else {
                        iM11306 = C19806.m45029("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15325) ^ (-769091035);
                        i5 = 1800249485;
                    }
                    break;
                case 239774554:
                case 484671670:
                    C1875.m6102(this.f70106, exc, null);
                    break;
                case 895200564:
                case 1476189229:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠۬") ^ i3) * (-57);
                        i4 = ((iM11306 ^ i2) * (-10139)) ^ 1096883597;
                        i5 = -26754096;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29533)) ^ 855976041;
                        i5 = 1492172966;
                    }
                    break;
                case 1404051834:
                case 1987342491:
                    C15829.m37619(C1398.m4893(exc));
                    break;
                default:
                    if (C3286.f12186) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠۬") ^ i3) * (-57);
                        i4 = ((iM11306 ^ i2) * (-10139)) ^ 1096883597;
                        i5 = -26754096;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۖ֡")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 13825) ^ 1088446396;
                        i5 = -1777051942;
                    }
                    break;
            }
            return;
        }
    }
}
