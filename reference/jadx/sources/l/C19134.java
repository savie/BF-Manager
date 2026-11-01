package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W78J */
/* JADX INFO: loaded from: classes4.dex */
public final class C19134 {

    /* JADX INFO: renamed from: ۤۚ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f61804 = {425, -22593, -22604, -22610, -22616, -22621, -22651, -22610, -22593, -22622, -22610, -22597, -22622, -22601, -22602, -22594, -22593, -22622, -22651, -22599, -22602, -22597, -22615, -22615, -22651, -22615, -22601, -22597, -22602, -22605, -22594, -22593, -22622, -22651, -22601, -22593, -22610, -22606, -22603, -22594, -22651, -22615, -22601, -22597, -22602, -22605, -22599, -22602, -22597, -22615, -22615, -22651, -22615, -22601, -22597, -22602, -22605, -22594, -22593, -22622, -22651, -22596, -22605, -22593, -22602, -22594, -22651, -22615, -22601, -22597, -22602, -22605, -22641, -22604, -22615, -22609, -22614, -22614, -22603, -22616, -22610, -22593, -22594, -22534, -22616, -22593, -22597, -22594, -22534, -22607, -22605, -22604, -22594, -22599, -22602, -22597, -22615, -22615, -22651, -22615, -22601, -22597, -22602, -22605, -22596, -22605, -22593, -22602, -22594, -22599, -22602, -22597, -22615, -22615, -22651, -22615, -22601, -22597, -22602, -22605};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14952 f61805;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11040 f61806;

    /* JADX WARN: Code duplicated, block: B:137:0x067c A[PHI: r2 r4 r6 r7 r16 r17 r18 r21 r22 r26
      0x067c: PHI (r2v6 java.lang.String) = (r2v3 java.lang.String), (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r4v10 java.lang.String) = (r4v5 java.lang.String), (r4v9 java.lang.String), (r4v11 java.lang.String) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r6v5 short[]) = (r6v3 short[]), (r6v4 short[]), (r6v6 short[]) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r7v5 int) = (r7v3 int), (r7v4 int), (r7v6 int) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r16v5 java.lang.String) = (r16v3 java.lang.String), (r16v4 java.lang.String), (r16v6 java.lang.String) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r17v4 short) = (r17v2 short), (r17v3 short), (r17v2 short) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r18v3 int) = (r18v2 int), (r18v2 int), (r18v4 int) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r21v6 java.lang.String) = (r21v1 java.lang.String), (r21v5 java.lang.String), (r21v7 java.lang.String) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r22v3 int) = (r22v1 int), (r22v2 int), (r22v4 int) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r26v7 l.֡֫֨) = (r26v5 l.֡֫֨), (r26v6 l.֡֫֨), (r26v8 l.֡֫֨) binds: [B:42:0x013b, B:136:0x067a, B:132:0x0646] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v65, types: [bin.mt.json.JSONArray, bin.mt.json.JSONObject, bin.mt.json.JSONValue, java.lang.String] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5022 m43955(C21956 c21956, String str, C2550 c2550, C15283 c15283) throws C12731 {
        int iM11306;
        int i;
        int iM11307;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int i5;
        C0093 c0093;
        String str2;
        String str3;
        String str4;
        String str5;
        int iM11308;
        int i6;
        int i7;
        int iM11309;
        int i8;
        int i9;
        int iM113010;
        int i10;
        int i11;
        String str6;
        Iterator it;
        C21956 c21957 = c21956;
        int i12 = -1586576096;
        int i13 = AbstractC0464.f2088;
        int i14 = C0278.f1572;
        int iM113011 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i13;
        int i15 = ((iM113011 ^ i14) * 9887) ^ (-1392328287);
        int i16 = iM113011 ^ 555875617;
        String str7 = null;
        C0093 c0094 = null;
        short[] sArr = null;
        int i17 = 0;
        int i18 = 0;
        short s = 0;
        int i19 = 0;
        String str8 = null;
        int i20 = 0;
        C14952 c14952 = null;
        String str9 = null;
        C0093 c0095 = null;
        C0093 c0096 = null;
        Iterator it2 = null;
        String str10 = null;
        String str11 = null;
        C0093 c0093M30084 = null;
        String strM20038 = null;
        short[] sArr2 = null;
        while (true) {
            i12 = i16 ^ ((((i12 ^ i14) * (-13701)) >> 31) & i15);
            switch (i12) {
                case -2145551303:
                case 549658589:
                    return c14952.m35872(c21957, str, str7);
                case -2052455588:
                case 808687486:
                    String strM20039 = C7521.m20038(c14952.m35868(c21957, str, str9, c15283));
                    C12089 c12089M30083 = C12089.m30083(str9, strM20039);
                    str6 = c2550.f10099;
                    Iterator itM10563 = C3577.m10563(c12089M30083.f40452);
                    str11 = strM20039;
                    it = itM10563;
                    int iM450210 = (C19806.m45029("ܰᩴ") + i14) * 123;
                    i5 = i17;
                    i16 = iM450210 ^ (-1324622423);
                    str10 = str6;
                    it2 = it;
                    i15 = ((iM450210 ^ i13) * (-32415)) ^ 641565662;
                    i17 = i5;
                    break;
                case -1965411838:
                case 1003636681:
                    str10 = str10;
                    if (c0096 != null) {
                        iM11306 = (C19806.m45029("֡ܽ") + i13) * (-13);
                        i15 = ((iM11306 ^ i14) * 4113) ^ 1879558816;
                        i = 1276946344;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ֫") ^ i14) * (-43);
                        i15 = ((iM11306 ^ i13) * 25713) ^ 2012677252;
                        i = -133002186;
                    }
                    i16 = iM11306 ^ i;
                    str10 = str10;
                    break;
                case -1897170218:
                case -958102939:
                    if (C2871.f10837 >= 0) {
                        str10 = str10;
                        iM11306 = (i13 - C19806.m45029("᩶᩷")) * 83;
                        i15 = ((iM11306 ^ i14) * (-24813)) ^ (-263948141);
                        i = 1665434894;
                        i16 = iM11306 ^ i;
                        str10 = str10;
                    } else {
                        iM45029 = C19806.m45029("ܽۛ") ^ i13;
                        i15 = ((iM45029 ^ i14) * 13009) ^ (-1410109366);
                        i4 = 195717552;
                        i16 = iM45029 ^ i4;
                    }
                    break;
                case -1855484835:
                case 1114269586:
                    if (C1189.m4368() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩸") ^ i13;
                        i15 = ((iM45029 ^ i14) * 827) ^ (-121082657);
                        i4 = -219035749;
                        i16 = iM45029 ^ i4;
                    } else {
                        str10 = str10;
                        iM11306 = (i13 - C19806.m45029("᩶᩷")) * 83;
                        i15 = ((iM11306 ^ i14) * (-24813)) ^ (-263948141);
                        i = 1665434894;
                        i16 = iM11306 ^ i;
                        str10 = str10;
                    }
                    break;
                case -1790261984:
                case -978691044:
                    C1398.m4895();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        str10 = str10;
                        iM11306 = C19806.m45029("ۛ֫") ^ i14;
                        i15 = ((iM11306 ^ i13) * (-12129)) ^ 1952061217;
                        i = 1395610856;
                        i16 = iM11306 ^ i;
                        str10 = str10;
                    } else {
                        i17 = i17;
                        c0095 = c0095;
                        str10 = str10;
                        int iM113012 = (i14 - ThreadFactoryC3888.m11306("ۨܳ")) * (-39);
                        i15 = ((iM113012 ^ i13) * (-28553)) ^ 1426984276;
                        str10 = str10;
                        i17 = i17;
                        c0095 = c0095;
                        i16 = iM113012 ^ 1569781303;
                        c21957 = c21956;
                    }
                    break;
                case -1716667520:
                case -1454539760:
                    str10 = str10;
                    if (RunnableC1564.m5348(it2)) {
                        iM11306 = (i14 - C19806.m45029("ܽۨ")) * 123;
                        i15 = ((iM11306 ^ i13) * 11063) ^ (-400122979);
                        i = 1278904450;
                    } else {
                        c0096 = c0094;
                        iM11306 = C19806.m45029("ܶۘ") ^ i13;
                        i15 = ((iM11306 ^ i14) * 8913) ^ (-1973885943);
                        i = -759667897;
                    }
                    i16 = iM11306 ^ i;
                    str10 = str10;
                    break;
                case -1672407260:
                case -1157359104:
                    i17 = i17;
                    c0095 = c0095;
                    str10 = str10;
                    String str12 = c2550.f10096;
                    str7 = c2550.f10100;
                    str9 = c2550.f10097;
                    sArr = f61804;
                    i20 = 1;
                    if (C3535.f13026 <= 0) {
                        str8 = str12;
                        str7 = str7;
                        int iM113013 = (i14 - ThreadFactoryC3888.m11306("ۨܳ")) * (-39);
                        i15 = ((iM113013 ^ i13) * (-28553)) ^ 1426984276;
                        str10 = str10;
                        i17 = i17;
                        c0095 = c0095;
                        i16 = iM113013 ^ 1569781303;
                        c21957 = c21956;
                    } else {
                        int iM450211 = (i14 - C19806.m45029("ۡ᩸")) * (-11);
                        i15 = ((iM450211 ^ i13) * (-13227)) ^ 1123039535;
                        str8 = str12;
                        str7 = str7;
                        str10 = str10;
                        i17 = i17;
                        c0095 = c0095;
                        c21957 = c21956;
                        i16 = iM450211 ^ 1414347742;
                    }
                    break;
                case -1603405179:
                case 2062252197:
                    throw C2664.m8205(c21957.f71244, str, str9);
                case -1592925729:
                case 976479025:
                    ?? r2 = c0094;
                    throw C12731.m31626(C1398.m4892(f61804, 72, 21, i18), (String) r2, (JSONValue) r2, (JSONArray) r2, (JSONObject) r2);
                case -1473295698:
                case 511119331:
                    i5 = i17;
                    c0093 = c0095;
                    str2 = str10;
                    str3 = str7;
                    str4 = str8;
                    str5 = str9;
                    if (C1460.m5058(C2249.m6918(f61804, 11, 4, i18), str4)) {
                        iM11308 = (ThreadFactoryC3888.m11306("᩵ܶ") ^ i13) * 123;
                        i6 = ((iM11308 ^ i14) * (-10715)) ^ 1682041757;
                        i7 = 1444772479;
                    } else {
                        iM11308 = (i13 - ThreadFactoryC3888.m11306("ۨܺ")) * 29;
                        i6 = ((iM11308 ^ i14) * 11807) ^ (-529383846);
                        i7 = 1215473765;
                    }
                    int i21 = iM11308 ^ i7;
                    str8 = str4;
                    i15 = i6;
                    str9 = str5;
                    str10 = str2;
                    c0095 = c0093;
                    str7 = str3;
                    i16 = i21;
                    i17 = i5;
                    break;
                case -1433171687:
                case 2039039745:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ۢ᩷") ^ i14) * 91;
                        i15 = ((iM45029 ^ i13) * (-153)) ^ (-1709987148);
                        i4 = -1085955805;
                        i16 = iM45029 ^ i4;
                    } else {
                        i17 = i17;
                        c0095 = c0095;
                        str10 = str10;
                        int iM113014 = (i14 - ThreadFactoryC3888.m11306("ۨܳ")) * (-39);
                        i15 = ((iM113014 ^ i13) * (-28553)) ^ 1426984276;
                        str10 = str10;
                        i17 = i17;
                        c0095 = c0095;
                        i16 = iM113014 ^ 1569781303;
                        c21957 = c21956;
                    }
                    break;
                case -1391527975:
                case -218722179:
                    i17 = i17;
                    c0095 = c0095;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    sArr = sArr;
                    str9 = str9;
                    i20 = i20;
                    i19 = (s * 2) + 1;
                    if (C1461.f5957 <= 0) {
                        iM11307 = (i14 - ThreadFactoryC3888.m11306("ۜ۟")) * (-47);
                        i2 = ((iM11307 ^ i13) * (-21047)) ^ 1103872575;
                        i3 = 2082016621;
                    } else {
                        iM11307 = (C19806.m45029("᩸֫") + i13) * 49;
                        i2 = ((iM11307 ^ i14) * 6151) ^ 391129807;
                        i3 = 88205106;
                    }
                    int i22 = iM11307 ^ i3;
                    str8 = str8;
                    sArr = sArr;
                    i20 = i20;
                    str9 = str9;
                    str10 = str10;
                    c0095 = c0095;
                    i16 = i22;
                    str7 = str7;
                    i15 = i2;
                    i17 = i17;
                    c21957 = c21956;
                    break;
                case -1291310107:
                case -177695962:
                    throw C2664.m8198(c21957.f71244, str, str9);
                case -1279968297:
                case -701014720:
                    i5 = i17;
                    String str13 = str10;
                    C0093 c0097 = c0095;
                    String str14 = str8;
                    c0094 = null;
                    if (C1460.m5058(C0797.m3361(f61804, 57, 15, i18), str14)) {
                        iM113010 = (C19806.m45029("֡ۜ") ^ i13) * (-49);
                        i10 = ((iM113010 ^ i14) * (-1691)) ^ (-1906637331);
                        i11 = -1869118184;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("۬۬") ^ i14;
                        i10 = ((iM113010 ^ i13) * 27515) ^ (-1086124626);
                        i11 = 658783702;
                    }
                    int i23 = iM113010 ^ i11;
                    str8 = str14;
                    i15 = i10;
                    str10 = str13;
                    c0095 = c0097;
                    i16 = i23;
                    i17 = i5;
                    break;
                case -1261387118:
                case 328822452:
                    i18 = 42970;
                    iM11307 = (ThreadFactoryC3888.m11306("ۚۜ") + i13) * (-119);
                    i2 = ((iM11307 ^ i14) * 8147) ^ 526789574;
                    i3 = 1387457329;
                    int i24 = iM11307 ^ i3;
                    str8 = str8;
                    sArr = sArr;
                    i20 = i20;
                    str9 = str9;
                    str10 = str10;
                    c0095 = c0095;
                    i16 = i24;
                    str7 = str7;
                    i15 = i2;
                    i17 = i17;
                    c21957 = c21956;
                    break;
                case -1034513052:
                case 1265042756:
                    i5 = i17;
                    c0093 = c0095;
                    str2 = str10;
                    str3 = str7;
                    str4 = str8;
                    str5 = str9;
                    if (C1460.m5058(C0797.m3361(f61804, 15, 15, i18), str4)) {
                        iM11308 = (C19806.m45029("᩸ۡ") ^ i14) * (-3);
                        i6 = ((iM11308 ^ i13) * 751) ^ 548343284;
                        i7 = -1049319921;
                    } else {
                        iM11308 = (C19806.m45029("۟֫") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM11308 ^ i13) * (-24083)) ^ 2130183147;
                        i7 = -415367814;
                    }
                    int i25 = iM11308 ^ i7;
                    str8 = str4;
                    i15 = i6;
                    str9 = str5;
                    str10 = str2;
                    c0095 = c0093;
                    str7 = str3;
                    i16 = i25;
                    i17 = i5;
                    break;
                case -938908318:
                case -274719570:
                    int i26 = i17;
                    C0093 c0098 = c0095;
                    String str15 = str10;
                    String str16 = str7;
                    String str17 = str8;
                    String str18 = str9;
                    short[] sArr3 = sArr;
                    int i27 = i20;
                    boolean zM2315 = AbstractC0464.m2315(C2332.m7082(sArr3, i27, 10, i18), str17);
                    C14952 c14953 = this.f61805;
                    if (zM2315) {
                        int iM450212 = (C19806.m45029("۬ܿ") + i14) * 15;
                        sArr = sArr3;
                        i20 = i27;
                        str9 = str18;
                        c14952 = c14953;
                        str10 = str15;
                        c0095 = c0098;
                        str7 = str16;
                        i16 = iM450212 ^ 1552564650;
                        str8 = str17;
                        i17 = i26;
                        i15 = ((iM450212 ^ i13) * 22137) ^ (-237846782);
                        c21957 = c21956;
                    } else {
                        int iM113015 = (i13 - ThreadFactoryC3888.m11306("ܶۗ")) * 73;
                        int i28 = ((iM113015 ^ i14) * 32335) ^ 1268911474;
                        sArr = sArr3;
                        i20 = i27;
                        str9 = str18;
                        c14952 = c14953;
                        str10 = str15;
                        c0095 = c0098;
                        i16 = iM113015 ^ (-1681145128);
                        str7 = str16;
                        str8 = str17;
                        i17 = i26;
                        c21957 = c21956;
                        i15 = i28;
                    }
                    break;
                case -823140399:
                case 1637226895:
                    int i29 = c0096.f1015;
                    str10 = str10;
                    String strM20037 = C7521.m20037(i29, c0096.f1014, str11);
                    if (C3660.f13403 < 0) {
                        Integer numM8476 = C2788.m8476(i29 - 1);
                        if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                            return new C5022(strM20037, C0671.m3009(f61804, 109, 11, i18), false, null, numM8476);
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩶֡") ^ i13;
                        i15 = ((iM11306 ^ i14) * 30063) ^ (-1869905942);
                        i = -922353007;
                        i16 = iM11306 ^ i;
                        str10 = str10;
                    } else {
                        i17 = i17;
                        c0095 = c0095;
                        str7 = str7;
                        str8 = str8;
                        sArr = sArr;
                        str9 = str9;
                        i20 = i20;
                        iM11307 = (i14 - ThreadFactoryC3888.m11306("ۜ۟")) * (-47);
                        i2 = ((iM11307 ^ i13) * (-21047)) ^ 1103872575;
                        i3 = 2082016621;
                        int i210 = iM11307 ^ i3;
                        str8 = str8;
                        sArr = sArr;
                        i20 = i20;
                        str9 = str9;
                        str10 = str10;
                        c0095 = c0095;
                        i16 = i210;
                        str7 = str7;
                        i15 = i2;
                        i17 = i17;
                        c21957 = c21956;
                    }
                    break;
                case -786948745:
                case -427002932:
                    return c14952.m35890(c21957, str, str7);
                case -644346610:
                case 1314426303:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!C0817.m3399()) {
                        i17 = i17;
                        c0095 = c0095;
                        str10 = str10;
                        int iM113016 = (i14 - ThreadFactoryC3888.m11306("ۨܳ")) * (-39);
                        i15 = ((iM113016 ^ i13) * (-28553)) ^ 1426984276;
                        str10 = str10;
                        i17 = i17;
                        c0095 = c0095;
                        i16 = iM113016 ^ 1569781303;
                        c21957 = c21956;
                    } else {
                        iM45029 = C19806.m45029("ܽۛ") ^ i13;
                        i15 = ((iM45029 ^ i14) * 13009) ^ (-1410109366);
                        i4 = 195717552;
                        i16 = iM45029 ^ i4;
                    }
                    break;
                case -634570898:
                case 1007133919:
                    i5 = i17;
                    C0093 c0099 = c0095;
                    String str19 = str10;
                    String str20 = str8;
                    if (AbstractC0464.m2315(C1066.m4040(f61804, 30, 16, i18), str20)) {
                        iM11309 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i13) * (-91);
                        i8 = ((iM11309 ^ i14) * 8535) ^ 34294820;
                        i9 = 2083140467;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("ܳ᩺") ^ i13) * (-39);
                        i8 = ((iM11309 ^ i14) * (-8191)) ^ 381046640;
                        i9 = 984822103;
                    }
                    int i30 = iM11309 ^ i9;
                    str8 = str20;
                    str10 = str19;
                    c0095 = c0099;
                    i16 = i30;
                    i15 = i8;
                    i17 = i5;
                    break;
                case -578100858:
                case -382856369:
                    i5 = i17;
                    String str21 = str10;
                    c0094 = c0094;
                    strM20038 = C7521.m20038(c14952.m35868(c21957, str, str9, c15283));
                    c0093M30084 = C12089.m30083(str9, strM20038).m30084(c2550.f10098);
                    if (c0093M30084 != null) {
                        int iM450213 = (C19806.m45029("֫᩶") + i13) * (-109);
                        i16 = iM450213 ^ (-1078149789);
                        i15 = ((iM450213 ^ i14) * 18051) ^ 2131945871;
                    } else {
                        int iM450214 = C19806.m45029("ۚܰ") ^ i14;
                        i15 = ((iM450214 ^ i13) * 8435) ^ (-1680512510);
                        i16 = iM450214 ^ 1738317908;
                    }
                    str10 = str21;
                    i17 = i5;
                    break;
                case -560937077:
                case 1417021650:
                    RunnableC1564.m5345();
                    RunnableC1564.m5345();
                    return null;
                case -552155684:
                case -220169882:
                    str10 = str10;
                    if (!AbstractC0464.m2315(CallableC1627.m5502(sArr2, i17, 5, i18), c0095.f1011)) {
                        it = it2;
                        str6 = str10;
                        int iM450215 = (C19806.m45029("ܰᩴ") + i14) * 123;
                        i5 = i17;
                        i16 = iM450215 ^ (-1324622423);
                        str10 = str6;
                        it2 = it;
                        i15 = ((iM450215 ^ i13) * (-32415)) ^ 641565662;
                        i17 = i5;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۤ") ^ i14;
                        i15 = ((iM11306 ^ i13) * (-30867)) ^ (-1942379028);
                        i = -479490927;
                        i16 = iM11306 ^ i;
                        str10 = str10;
                    }
                    break;
                case -501396107:
                case 1770052649:
                    str10 = str10;
                    int i31 = c0093M30084.f1015;
                    String strM200310 = C7521.m20037(i31, c0093M30084.f1014, strM20038);
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        Integer numM8477 = C2788.m8476(i31 - 1);
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            return new C5022(strM200310, C3660.m10790(f61804, 93, 11, i18), false, null, numM8477);
                        }
                    }
                    iM11306 = (i13 - C19806.m45029("᩶᩷")) * 83;
                    i15 = ((iM11306 ^ i14) * (-24813)) ^ (-263948141);
                    i = 1665434894;
                    i16 = iM11306 ^ i;
                    str10 = str10;
                    break;
                case -437539531:
                case 1444540163:
                    i17 = i17;
                    c0095 = c0095;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    sArr = sArr;
                    str9 = str9;
                    i20 = i20;
                    s = f61804[0];
                    if (C0278.f1572 <= 0) {
                        iM11307 = (i14 - ThreadFactoryC3888.m11306("ۜ۟")) * (-47);
                        i2 = ((iM11307 ^ i13) * (-21047)) ^ 1103872575;
                        i3 = 2082016621;
                    } else {
                        iM11307 = (i13 - ThreadFactoryC3888.m11306("ܿ᩺")) * 45;
                        i2 = ((iM11307 ^ i14) * 6607) ^ (-106262831);
                        i3 = 606140869;
                    }
                    int i211 = iM11307 ^ i3;
                    str8 = str8;
                    sArr = sArr;
                    i20 = i20;
                    str9 = str9;
                    str10 = str10;
                    c0095 = c0095;
                    i16 = i211;
                    str7 = str7;
                    i15 = i2;
                    i17 = i17;
                    c21957 = c21956;
                    break;
                case -346578871:
                case -139652819:
                    C3660.m10791();
                    if (C2477.f9839 > 0) {
                        str10 = str10;
                        iM11306 = ThreadFactoryC3888.m11306("᩶֡") ^ i13;
                        i15 = ((iM11306 ^ i14) * 30063) ^ (-1869905942);
                        i = -922353007;
                        i16 = iM11306 ^ i;
                        str10 = str10;
                    } else {
                        i17 = i17;
                        c0095 = c0095;
                        str10 = str10;
                        int iM113017 = (i14 - ThreadFactoryC3888.m11306("ۨܳ")) * (-39);
                        i15 = ((iM113017 ^ i13) * (-28553)) ^ 1426984276;
                        str10 = str10;
                        i17 = i17;
                        c0095 = c0095;
                        i16 = iM113017 ^ 1569781303;
                        c21957 = c21956;
                    }
                    break;
                case -289221368:
                case 1557982796:
                    i17 = i17;
                    c0095 = c0095;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    sArr = sArr;
                    str9 = str9;
                    i20 = i20;
                    int i32 = s + 1;
                    if ((i32 * i32) - i19 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("֡ۙ") ^ i14;
                        i2 = ((iM11307 ^ i13) * 24553) ^ 214715134;
                        i3 = 250534027;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۙۘ") ^ i14) * (-29);
                        i2 = ((iM11307 ^ i13) * (-8261)) ^ 384067219;
                        i3 = -208168345;
                    }
                    int i212 = iM11307 ^ i3;
                    str8 = str8;
                    sArr = sArr;
                    i20 = i20;
                    str9 = str9;
                    str10 = str10;
                    c0095 = c0095;
                    i16 = i212;
                    str7 = str7;
                    i15 = i2;
                    i17 = i17;
                    c21957 = c21956;
                    break;
                case -31698290:
                case 960996282:
                    if (!C1460.m5058(str10, c0095.f1010)) {
                        it = it2;
                        str6 = str10;
                        int iM450216 = (C19806.m45029("ܰᩴ") + i14) * 123;
                        i5 = i17;
                        i16 = iM450216 ^ (-1324622423);
                        str10 = str6;
                        it2 = it;
                        i15 = ((iM450216 ^ i13) * (-32415)) ^ 641565662;
                        i17 = i5;
                    } else {
                        c0096 = c0095;
                        str10 = str10;
                        iM11306 = C19806.m45029("ܶۘ") ^ i13;
                        i15 = ((iM11306 ^ i14) * 8913) ^ (-1973885943);
                        i = -759667897;
                        i16 = iM11306 ^ i;
                        str10 = str10;
                    }
                    break;
                case 263855826:
                case 1725428185:
                    i17 = i17;
                    c0095 = c0095;
                    str10 = str10;
                    String str22 = str8;
                    String strM200311 = C7521.m20038(c14952.m35868(c21957, str, str9, c15283));
                    short[] sArr4 = f61804;
                    if (AbstractC0464.f2088 > 0) {
                        return new C5022(strM200311, C1189.m4365(sArr4, 46, 11, i18), false, null, null);
                    }
                    str8 = str22;
                    int iM113018 = (i14 - ThreadFactoryC3888.m11306("ۨܳ")) * (-39);
                    i15 = ((iM113018 ^ i13) * (-28553)) ^ 1426984276;
                    str10 = str10;
                    i17 = i17;
                    c0095 = c0095;
                    i16 = iM113018 ^ 1569781303;
                    c21957 = c21956;
                    break;
                    break;
                case 587534014:
                case 1803880950:
                    str10 = str10;
                    c0095 = (C0093) C0216.m1584(it2);
                    sArr2 = f61804;
                    i17 = IShizukuService.Stub.TRANSACTION_isHidden;
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۛ֫") ^ i14;
                        i15 = ((iM11306 ^ i13) * (-12129)) ^ 1952061217;
                        i = 1395610856;
                    } else {
                        iM11306 = C19806.m45029("ܿ֨") ^ i13;
                        i15 = ((iM11306 ^ i14) * 12289) ^ 1770110643;
                        i = -1434310648;
                    }
                    i16 = iM11306 ^ i;
                    str10 = str10;
                    break;
                case 1405630889:
                case 1754041405:
                    C1025.m3861();
                    i17 = i17;
                    c0095 = c0095;
                    str10 = str10;
                    int iM113019 = (i14 - ThreadFactoryC3888.m11306("ۨܳ")) * (-39);
                    i15 = ((iM113019 ^ i13) * (-28553)) ^ 1426984276;
                    str10 = str10;
                    i17 = i17;
                    c0095 = c0095;
                    i16 = iM113019 ^ 1569781303;
                    c21957 = c21956;
                    break;
                case 1526456335:
                case 1632063273:
                    i18 = 13374;
                    iM11307 = (ThreadFactoryC3888.m11306("ۚۜ") + i13) * (-119);
                    i2 = ((iM11307 ^ i14) * 8147) ^ 526789574;
                    i3 = 1387457329;
                    int i213 = iM11307 ^ i3;
                    str8 = str8;
                    sArr = sArr;
                    i20 = i20;
                    str9 = str9;
                    str10 = str10;
                    c0095 = c0095;
                    i16 = i213;
                    str7 = str7;
                    i15 = i2;
                    i17 = i17;
                    c21957 = c21956;
                    break;
                default:
                    i17 = i17;
                    c0095 = c0095;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    sArr = sArr;
                    str9 = str9;
                    i20 = i20;
                    if (C1937.f7317 < 0) {
                        iM11307 = C19806.m45029("ۘۖ") ^ i14;
                        i2 = ((iM11307 ^ i13) * (-20001)) ^ 596416436;
                        i3 = -123964244;
                        int i214 = iM11307 ^ i3;
                        str8 = str8;
                        sArr = sArr;
                        i20 = i20;
                        str9 = str9;
                        str10 = str10;
                        c0095 = c0095;
                        i16 = i214;
                        str7 = str7;
                        i15 = i2;
                        i17 = i17;
                        c21957 = c21956;
                    } else {
                        str8 = str8;
                        sArr = sArr;
                        i20 = i20;
                        str9 = str9;
                        str7 = str7;
                        int iM1130110 = (i14 - ThreadFactoryC3888.m11306("ۨܳ")) * (-39);
                        i15 = ((iM1130110 ^ i13) * (-28553)) ^ 1426984276;
                        str10 = str10;
                        i17 = i17;
                        c0095 = c0095;
                        i16 = iM1130110 ^ 1569781303;
                        c21957 = c21956;
                    }
                    break;
            }
        }
    }

    public C19134(C14952 c14952, C11040 c11040) {
        this.f61805 = c14952;
        this.f61806 = c11040;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13572 m43960(C21956 c21956, C4667 c4667) throws C12731 {
        String str = c4667.f16488;
        C2550 c2550 = c4667.f16496;
        C22703 c22703M27844 = this.f61806.m27844(c21956, this.f61805, str);
        String str2 = c21956.f71244;
        try {
            if (c22703M27844.m50311(c2550.f10101, m43954(c21956, str)) == null) {
                throw C2664.m8204(str2, str);
            }
            c22703M27844.m50317();
            return new C13572(1);
        } catch (C12731 e) {
            if (C14952.m35723(str)) {
                C11040.m27837(c21956, e);
            }
            if (!"INVALID_ARGUMENT".equals(e.f42472)) {
                throw e;
            }
            JSONObject jSONObject = e.f42468;
            if (!"variant".equals(jSONObject.getString("argument", null)) || jSONObject.getJSONArray("availableVariants") == null) {
                throw e;
            }
            JSONObject jSONObjectAdd = C3184.m9603("workspaceId", str2, "editSessionId", str).add("reads", JSON.array().add(JSON.object().add("locator", C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, c2550.f10101)).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
            JSONArray jSONArray = new JSONArray(e.f42471);
            jSONArray.add(C11320.m28376(jSONObjectAdd, "mt_apk_resource_read", "retry", "Retry reading the same resource with batch resource_read arguments"));
            throw e.m31632(jSONArray);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9608 m43958(C21956 c21956, C11724 c11724) throws C12731 {
        String str;
        C11724 c11725 = c11724;
        String str2 = c11725.f39413;
        C22703 c22703M27844 = this.f61806.m27844(c21956, this.f61805, str2);
        HashSet hashSetM43954 = m43954(c21956, str2);
        ArrayList arrayList = c11725.f39412;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < arrayList.size()) {
            try {
                C13841 c13841 = (C13841) arrayList.get(i);
                String str3 = c13841.f45669;
                String str4 = c13841.f45669;
                int i2 = i;
                ArrayList arrayList3 = arrayList;
                str = str2;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                try {
                    C1804 c1804M50310 = c22703M27844.m50310(str3, c13841.f45670, c11725.f39417, c11725.f39415, c11725.f39416, c11725.f39414, hashSetM43954);
                    if (c1804M50310 != null) {
                        ArrayList arrayList4 = c1804M50310.f6957;
                        if (!linkedHashMap2.containsKey(str3)) {
                            linkedHashMap2.put(str3, new C11455(str3, c1804M50310.f6956));
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList2.add(new C1845(i2, str4, c13841.f45670, "RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.", c1804M50310.f6958, null));
                        } else {
                            C13531 c13531 = (C13531) arrayList4.get(0);
                            arrayList2.add(new C1845(i2, str4, c13531.f44678, null, null, c1804M50310.f6958, c13531));
                        }
                    } else {
                        arrayList2.add(new C1845(i2, str4, c13841.f45670, "RESOURCE_NOT_FOUND", "Resource not found.", null, null));
                    }
                    i = i2 + 1;
                    c11725 = c11724;
                    linkedHashMap = linkedHashMap2;
                    arrayList = arrayList3;
                    str2 = str;
                } catch (C12731 e) {
                    e = e;
                    if (C14952.m35723(str)) {
                        C11040.m27837(c21956, e);
                    }
                    throw e;
                }
            } catch (C12731 e2) {
                e = e2;
                str = str2;
            }
        }
        return new C9608(c21956.f71244, c22703M27844.m50317(), new ArrayList(linkedHashMap.values()), arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashSet m43954(C21956 c21956, String str) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f61805.m35885(c21956, str).iterator();
        while (it.hasNext()) {
            hashSet.add(((C9878) it.next()).f33725);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6515 m43957(C21956 c21956, C4667 c4667, C15283 c15283) throws C12731 {
        String str = c4667.f16488;
        String str2 = c4667.f16489;
        C2550 c2550 = c4667.f16496;
        C5022 c5022M43955 = m43955(c21956, str, c2550, c15283);
        try {
            return new C6515(c21956.f71244, c2550, c5022M43955.f17473, C14952.m35812(c5022M43955.f17472), C7521.m20039(c5022M43955.f17472, c4667.f16492, c4667.f16486, c4667.f16485, c4667.f16490), c5022M43955.f17469, c5022M43955.f17471, c4667.f16485, c4667.f16490, c5022M43955.f17470);
        } catch (C12731 e) {
            if (!"INVALID_ARGUMENT".equals(e.f42472) || !"lineCharOffset".equals(e.f42468.getString("argument", null))) {
                throw e;
            }
            JSONValue jSONValue = c4667.f16495;
            if (str2 == null) {
                throw e;
            }
            if ("startColumn".equals(str2)) {
                throw C12731.m31626("Invalid startColumn", "startColumn", jSONValue, JSON.array(0, Integer.MAX_VALUE), JSON.object().add("startColumn", 0));
            }
            if ("nextCursor".equals(str2)) {
                throw C12731.m31626("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20191 m43959(C21956 c21956, C4667 c4667) throws Throwable {
        C2455 c2455;
        Throwable th;
        InputStream inputStream;
        Throwable th2;
        C16550 c16550M35884;
        String str = c21956.f71244;
        C2550 c2550 = c4667.f16496;
        int i = c4667.f16491;
        String str2 = c4667.f16488;
        String str3 = c2550.f10100;
        int i2 = c4667.f16487;
        if (!"entry_text".equals(c2550.f10096)) {
            throw C12731.m31626("Byte reads are valid only for zip_entry locators", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        boolean zEquals = "resources.arsc".equals(str3);
        C14952 c14952 = this.f61805;
        if (zEquals && (c16550M35884 = c14952.m35884(c21956, str2)) != null) {
            return m43956(str, c4667, c16550M35884.f53144);
        }
        C12317 c12317M35867 = c14952.m35867(c21956, str2, str3);
        boolean z = false;
        if (c12317M35867 != null) {
            String str4 = c21956.f71244;
            AbstractC20745 abstractC20745 = c12317M35867.f41149;
            long jMo33964 = abstractC20745.mo33964();
            int i3 = c4667.f16491;
            long j = i3;
            if (j >= jMo33964) {
                return new C20191(str4, c2550, new byte[0], i3, c4667.f16487, jMo33964, i3, false);
            }
            int iMin = (int) Math.min(i2, jMo33964 - j);
            byte[] bArr = new byte[iMin];
            try {
                C1388 c1388M46710 = abstractC20745.m46710("r");
                try {
                    c1388M46710.seek(i);
                    c1388M46710.m4864(bArr, 0, iMin);
                    c1388M46710.close();
                    int i4 = c4667.f16491;
                    long j2 = ((long) i4) + ((long) iMin);
                    if (j2 < jMo33964 && j2 <= 2147483647L) {
                        z = true;
                    }
                    return new C20191(str4, c2550, bArr, i4, c4667.f16487, jMo33964, (int) Math.min(j2, 2147483647L), z);
                } catch (Throwable th3) {
                    try {
                        c1388M46710.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException | RuntimeException unused) {
                throw C12731.m31630("ENTRY_READ_FAILED", "Failed to read entry overlay.");
            }
        }
        C16550 c16550M35886 = c14952.m35886(c21956, str2, str3);
        if (c16550M35886 != null) {
            return m43956(str, c4667, c16550M35886.f53144);
        }
        try {
            C2455 c2456 = new C2455(c21956.m48787());
            try {
                C12107 entry = c2456.getEntry(str3);
                try {
                    if (entry == null) {
                        throw C12731.m31625("ENTRY_NOT_FOUND", "ZIP entry not found");
                    }
                    if (!entry.isDirectory()) {
                        long size = entry.getSize();
                        if (size >= 0) {
                            try {
                                int i5 = c4667.f16491;
                                if (i5 >= size) {
                                    C20191 c20191 = new C20191(c21956.f71244, c2550, new byte[0], i5, c4667.f16487, size, i5, false);
                                    c2456.close();
                                    return c20191;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c2455 = c2456;
                                try {
                                    c2455.close();
                                    throw th;
                                } catch (Throwable th6) {
                                    th.addSuppressed(th6);
                                    throw th;
                                }
                            }
                        }
                        int i6 = size >= 0 ? i2 : i2 + 1;
                        InputStream inputStreamM7471 = c2456.m7471(entry);
                        try {
                            try {
                                C20010.m45305(i, inputStreamM7471);
                                int i7 = 8192;
                                C19551 c19551 = new C19551(Math.min(i6, 8192));
                                byte[] bArr2 = new byte[8192];
                                while (i6 > 0) {
                                    int i8 = inputStreamM7471.read(bArr2, 0, Math.min(i7, i6));
                                    if (i8 == -1) {
                                        break;
                                    }
                                    c19551.write(bArr2, 0, i8);
                                    i6 -= i8;
                                    i7 = 8192;
                                }
                                byte[] bArrCopyOf = c19551.f62829;
                                int length = bArrCopyOf.length;
                                int i9 = c19551.f62830;
                                if (length != i9) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i9);
                                }
                                inputStreamM7471.close();
                                boolean z2 = size < 0 && bArrCopyOf.length > i2;
                                if (z2) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                                }
                                byte[] bArr3 = bArrCopyOf;
                                int i10 = c4667.f16491;
                                long length2 = ((long) i10) + ((long) bArr3.length);
                                if (size >= 0) {
                                    z2 = length2 < size;
                                }
                                C20191 c20192 = new C20191(c21956.f71244, c2550, bArr3, i10, c4667.f16487, size, (int) Math.min(length2, 2147483647L), (!z2 || length2 <= 2147483647L) ? z2 : false);
                                c2456.close();
                                return c20192;
                            } catch (Throwable th7) {
                                c2455 = c2456;
                                th2 = th7;
                                inputStream = inputStreamM7471;
                                try {
                                    inputStream.close();
                                    throw th2;
                                } catch (Throwable th8) {
                                    th2.addSuppressed(th8);
                                    throw th2;
                                }
                            }
                        } catch (EOFException unused2) {
                            c2455 = c2456;
                            try {
                                String str5 = c21956.f71244;
                                byte[] bArr4 = new byte[0];
                                int i11 = c4667.f16491;
                                inputStream = inputStreamM7471;
                                try {
                                    C20191 c20193 = new C20191(str5, c2550, bArr4, i11, c4667.f16487, size, i11, false);
                                    inputStream.close();
                                    c2455.close();
                                    return c20193;
                                } catch (Throwable th9) {
                                    th = th9;
                                    th2 = th;
                                    inputStream.close();
                                    throw th2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                inputStream = inputStreamM7471;
                            }
                        }
                    } else {
                        throw C12731.m31630("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                    }
                } catch (Throwable th11) {
                    th = th11;
                    th = th;
                    c2455.close();
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                c2455 = c2456;
            }
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw C12731.m31630("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20191 m43956(String str, C4667 c4667, byte[] bArr) {
        C2550 c2550 = c4667.f16496;
        int i = c4667.f16491;
        if (i >= bArr.length) {
            return new C20191(str, c2550, new byte[0], i, c4667.f16487, bArr.length, i, false);
        }
        int iMin = Math.min(c4667.f16487, bArr.length - i);
        int i2 = c4667.f16491;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i2 + iMin);
        int i3 = c4667.f16491;
        int i4 = i3 + iMin;
        return new C20191(str, c2550, bArrCopyOfRange, i3, c4667.f16487, bArr.length, i4, i4 < bArr.length);
    }
}
