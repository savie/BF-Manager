package l;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 44LP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10577 implements InterfaceC5392, InterfaceC10523, InterfaceC5055, InterfaceC15379 {

    /* JADX INFO: renamed from: ۫ᩴܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f33594 = {8441, -17775, -17792, -17771, -17783, -17775, -17778, -17779, -17784, -17790, -17768, -17741, -17788, -17769, -17784, -17774, -17784, -17778, -17777, -17778, -17775, -17788, -17773, -17792, -17771, -17784, -17778, -17777, -17790, -17783, -17788, -17790, -17782, -17730, -17775, -17792, -17773, -17788, -17777, -17771, -17730, -17779, -17784, -17777, -17782, -17774, -17789, -17792, -17790, -17782, -17788, -17777, -17787, -17741, -17788, -17792, -17774, -17778, -17777, -17790, -17783, -17792, -17777, -17786, -17788, -17787, -17774, -17771, -17792, -17771, -17788, -17750, -17777, -17778, -17770, -17777, -17770, -17792, -17773, -17777, -17784, -17777, -17786, -17774, -17785, -17792, -17771, -17792, -17779};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33595;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33596;

    public /* synthetic */ C10577(Object obj, Object obj2) {
        int i = -716701449;
        int i2 = C0950.f3488;
        int i3 = C1080.f3865;
        this.f33595 = obj;
        this.f33596 = obj2;
        int iM2761 = (i2 - C0619.m2761("ܿۖ")) * (-39);
        int i4 = ((iM2761 ^ i3) * (-13283)) ^ (-947673018);
        int i5 = 1057706647;
        while (true) {
            i = (iM2761 ^ i5) ^ (i4 & (((i ^ i3) * (-29239)) >> 31));
            switch (i) {
                case -1557373349:
                case 228307683:
                    C2419.m8174();
                    C0619.m2763();
                    throw new RuntimeException();
                case -1343565596:
                case 1613983552:
                    C3734.m12152();
                    if (!C1519.m5403()) {
                        iM2761 = (C0773.m3169("ۡܰ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * (-20583)) ^ (-100478085);
                        i5 = 2070903756;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽۘ")) * (-109);
                        i4 = ((iM2761 ^ i2) * 18451) ^ (-1916333439);
                        i5 = -524604721;
                    }
                    break;
                case -948686598:
                case -606570579:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0773.m3169("ܿ᩵") ^ i2) * 25;
                        i4 = ((iM2761 ^ i3) * 24025) ^ 1476749082;
                        i5 = -1039639535;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۚۡ")) * (-77);
                        i4 = ((iM2761 ^ i3) * 24381) ^ 532620439;
                        i5 = 1807441797;
                    }
                    break;
                case 20313787:
                case 1236032595:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i3 - C0773.m3169("ܽۘ")) * (-109);
                        i4 = ((iM2761 ^ i2) * 18451) ^ (-1916333439);
                        i5 = -524604721;
                    } else {
                        iM2761 = C0773.m3169("ۙܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6269) ^ 903848015;
                        i5 = -1144199113;
                    }
                    break;
                case 692173356:
                case 1621779801:
                    C1542.m5459();
                    if (C3779.m12264()) {
                        iM2761 = C0773.m3169("ۜ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15995)) ^ 1699789217;
                        i5 = 952212621;
                    } else {
                        iM2761 = (C0773.m3169("ۡܰ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * (-20583)) ^ (-100478085);
                        i5 = 2070903756;
                    }
                    break;
                case 1865739064:
                case 1970559384:
                    C2310.m7813();
                    C1542.m5459();
                    iM2761 = (C0773.m3169("ۡܰ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM2761 ^ i2) * (-20583)) ^ (-100478085);
                    i5 = 2070903756;
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01c6 A[PHI: r5 r6 r7 r15 r22
      0x01c6: PHI (r5v7 bin.mt.json.JSONObject) = (r5v4 bin.mt.json.JSONObject), (r5v2 bin.mt.json.JSONObject), (r5v2 bin.mt.json.JSONObject) binds: [B:48:0x01c4, B:44:0x0199, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r6v6 java.lang.String) = (r6v2 java.lang.String), (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:48:0x01c4, B:44:0x0199, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r7v7 java.lang.String) = (r7v2 java.lang.String), (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:48:0x01c4, B:44:0x0199, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r15v6 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:48:0x01c4, B:44:0x0199, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r22v32 bin.mt.json.JSONObject) = (r22v16 bin.mt.json.JSONObject), (r22v17 bin.mt.json.JSONObject), (r22v33 bin.mt.json.JSONObject) binds: [B:48:0x01c4, B:44:0x0199, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02c2 A[PHI: r10 r17 r18 r22
      0x02c2: PHI (r10v5 bin.mt.json.JSONObject) = (r10v2 bin.mt.json.JSONObject), (r10v4 bin.mt.json.JSONObject), (r10v2 bin.mt.json.JSONObject) binds: [B:66:0x02c0, B:34:0x013a, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02c2: PHI (r17v14 short) = (r17v5 short), (r17v2 short), (r17v2 short) binds: [B:66:0x02c0, B:34:0x013a, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02c2: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:66:0x02c0, B:34:0x013a, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02c2: PHI (r22v27 bin.mt.json.JSONObject) = (r22v13 bin.mt.json.JSONObject), (r22v20 bin.mt.json.JSONObject), (r22v28 bin.mt.json.JSONObject) binds: [B:66:0x02c0, B:34:0x013a, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC5055
    /* JADX INFO: renamed from: ۙ */
    public C10186 mo15291(String str, String str2, String str3) {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        JSONObject jSONObject;
        short s;
        int iM31610;
        int i4;
        int iM2762;
        int i5;
        int i6;
        int i7 = C2310.f7472;
        int i8 = C2702.f8586;
        int iM2763 = (C0619.m2761("ܿᩳ") ^ i7) * 53;
        int i9 = ((iM2763 ^ i8) * 4253) ^ 759876323;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM2763 ^ 655496691;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = -1956274199;
        short[] sArr3 = null;
        JSONObject jSONObjectM9860 = null;
        JSONObject jSONObjectAdd = null;
        JSONObject jSONObjectAdd2 = null;
        String strM13650 = null;
        JSONObject jSONObjectM5469 = null;
        String strM5510 = null;
        String strM33137 = null;
        JSONObject jSONObjectM50076 = null;
        String strM53420 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            i13 = i10 ^ ((((i13 ^ i8) * 10487) >> 31) & i9);
            switch (i13) {
                case -2089186421:
                case -1369813888:
                    jSONObject = jSONObjectM5469;
                    jSONObjectM50076 = C22121.m50076(strM53420, str5, C0619.m2756(f33594, 5, 14, i11), str4);
                    sArr2 = f33594;
                    if (C0269.f1558 <= 0) {
                        iM2762 = C0773.m3169("֨᩷") ^ i7;
                        i9 = ((iM2762 ^ i8) * 26445) ^ 780072080;
                        i5 = -1494028982;
                    } else {
                        iM2762 = C0773.m3169("۟۠") ^ i8;
                        i9 = ((iM2762 ^ i7) * (-9271)) ^ 1170206250;
                        i5 = -958187147;
                    }
                    i6 = iM2762 ^ i5;
                    jSONObjectM5469 = jSONObject;
                    i10 = i6;
                    break;
                case -2034013423:
                case 1518699613:
                    jSONObject = jSONObjectM5469;
                    strM53420 = C23916.m53420(sArr, 1, 4, i11);
                    if (C13473.f42873 == 0) {
                        iM2762 = (C0619.m2761("ۘᩳ") + i7) * (-43);
                        i9 = ((iM2762 ^ i8) * (-13539)) ^ 2054780115;
                        i5 = -1423292284;
                        i6 = iM2762 ^ i5;
                        jSONObjectM5469 = jSONObject;
                        i10 = i6;
                    }
                    s = s2;
                    iM31610 = (C0619.m2761("ۧ᩻") + i7) * (-89);
                    i9 = ((iM31610 ^ i8) * (-4769)) ^ 744568639;
                    i4 = -551542378;
                    i6 = iM31610 ^ i4;
                    s2 = s;
                    jSONObjectM5469 = jSONObject;
                    i10 = i6;
                    break;
                case -1929098610:
                case -357520556:
                    jSONObjectAdd = jSONObjectAdd2.add(C2023.m6966(f33594, 66, 10, i11), true);
                    if (C2834.f9334 > 0) {
                        iM3169 = (C0619.m2761("ۢ֨") ^ i7) * 99;
                        i9 = ((iM3169 ^ i8) * (-25345)) ^ (-2050255794);
                        i3 = -240321866;
                        i10 = iM3169 ^ i3;
                    } else {
                        jSONObject = jSONObjectM5469;
                        s = s2;
                        iM31610 = (C0619.m2761("ۧ᩻") + i7) * (-89);
                        i9 = ((iM31610 ^ i8) * (-4769)) ^ 744568639;
                        i4 = -551542378;
                        i6 = iM31610 ^ i4;
                        s2 = s;
                        jSONObjectM5469 = jSONObject;
                        i10 = i6;
                    }
                    break;
                case -1903360728:
                case -918457050:
                    jSONObject = jSONObjectM5469;
                    strM33137 = C13473.m33137(sArr2, 19, 9, i11);
                    strM5510 = C1564.m5510(f33594, 28, 18, i11);
                    if (C4282.f15546 <= 0) {
                        iM2762 = C0773.m3169("֨᩷") ^ i7;
                        i9 = ((iM2762 ^ i8) * 26445) ^ 780072080;
                        i5 = -1494028982;
                    } else {
                        iM2762 = C0619.m2761("֡ܽ") ^ i8;
                        i9 = ((iM2762 ^ i7) * (-28715)) ^ 1251958470;
                        i5 = -2122594553;
                    }
                    i6 = iM2762 ^ i5;
                    jSONObjectM5469 = jSONObject;
                    i10 = i6;
                    break;
                case -1867610010:
                case 737277222:
                    jSONObject = jSONObjectM5469;
                    s2 = sArr3[0];
                    i12 = s2 * s2;
                    if (C4238.m13540() <= 0) {
                        iM2762 = (i8 - C0773.m3169("ۤۧ")) * (-107);
                        i9 = ((iM2762 ^ i7) * (-11347)) ^ 837259622;
                        i5 = -1911869586;
                    } else {
                        iM2762 = C0619.m2761("ܺ᩷") ^ i7;
                        i9 = ((iM2762 ^ i8) * 24183) ^ (-454407943);
                        i5 = -1783933943;
                    }
                    i6 = iM2762 ^ i5;
                    jSONObjectM5469 = jSONObject;
                    i10 = i6;
                    break;
                case -1493193760:
                case -391920021:
                    return C10186.m26306(str, str2, C0487.m2361(f33594, 84, 5, i11), null, jSONObjectM9860);
                case -1471464576:
                case 1659179544:
                    jSONObject = jSONObjectM5469;
                    jSONObjectAdd2 = C1542.m5469(jSONObjectM5469, strM13650, str3).add(C0619.m2756(f33594, 59, 7, i11), false);
                    if (C20932.f66974 <= 0) {
                        iM2762 = (i8 - C0773.m3169("ۤۧ")) * (-107);
                        i9 = ((iM2762 ^ i7) * (-11347)) ^ 837259622;
                        i5 = -1911869586;
                    } else {
                        iM2762 = C0773.m3169("ܿۜ") ^ i8;
                        i9 = ((iM2762 ^ i7) * (-28211)) ^ (-2128969374);
                        i5 = -1562465387;
                    }
                    i6 = iM2762 ^ i5;
                    jSONObjectM5469 = jSONObject;
                    i10 = i6;
                    break;
                case -921332473:
                case 2095891916:
                    jSONObjectM5469 = C1542.m5469(jSONObjectM50076, strM33137, strM5510);
                    strM13650 = C4282.m13650(f33594, 46, 13, i11);
                    if (C2354.f7599 < 0) {
                        iM3169 = C0773.m3169("ۡ᩺") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-22003)) ^ (-349869516);
                        i3 = 2121916256;
                        i10 = iM3169 ^ i3;
                    } else {
                        jSONObject = jSONObjectM5469;
                        s = s2;
                        iM31610 = (C0619.m2761("ۧ᩻") + i7) * (-89);
                        i9 = ((iM31610 ^ i8) * (-4769)) ^ 744568639;
                        i4 = -551542378;
                        i6 = iM31610 ^ i4;
                        s2 = s;
                        jSONObjectM5469 = jSONObject;
                        i10 = i6;
                    }
                    break;
                case -899039876:
                case 1134142765:
                    jSONObject = jSONObjectM5469;
                    int i14 = i12 + 286083396;
                    s = s2;
                    int i15 = s + 16914;
                    if ((i14 + i14) - (i15 * i15) >= 0) {
                        iM31610 = (C0619.m2761("ܰ᩻") + i7) * (-93);
                        i9 = ((iM31610 ^ i8) * (-767)) ^ 570494328;
                        i4 = 199649170;
                    } else {
                        iM31610 = (C0619.m2761("᩺۫") ^ i8) * 41;
                        i9 = ((iM31610 ^ i7) * (-8587)) ^ (-1567982564);
                        i4 = -1997377797;
                    }
                    i6 = iM31610 ^ i4;
                    s2 = s;
                    jSONObjectM5469 = jSONObject;
                    i10 = i6;
                    break;
                case -520579112:
                case 2140776962:
                    jSONObject = jSONObjectM5469;
                    s = s2;
                    sArr3 = f33594;
                    if (AbstractC0116.f1064 <= 0) {
                        iM31610 = (C0619.m2761("ۧ᩻") + i7) * (-89);
                        i9 = ((iM31610 ^ i8) * (-4769)) ^ 744568639;
                        i4 = -551542378;
                    } else {
                        iM31610 = C0773.m3169("۠᩻") ^ i8;
                        i9 = ((iM31610 ^ i7) * 30275) ^ 1626308794;
                        i4 = -658472895;
                    }
                    i6 = iM31610 ^ i4;
                    s2 = s;
                    jSONObjectM5469 = jSONObject;
                    i10 = i6;
                    break;
                case -367671058:
                case 1891643356:
                    if (C1146.f4234 < 0) {
                        jSONObject = jSONObjectM5469;
                        iM2762 = (i8 - C0773.m3169("ۤۧ")) * (-107);
                        i9 = ((iM2762 ^ i7) * (-11347)) ^ 837259622;
                        i5 = -1911869586;
                        i6 = iM2762 ^ i5;
                        jSONObjectM5469 = jSONObject;
                        i10 = i6;
                    } else {
                        iM3169 = C0773.m3169("ۖᩳ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 13741) ^ 1773175290;
                        i3 = 1116648049;
                        i10 = iM3169 ^ i3;
                    }
                    break;
                case 182500240:
                case 1944966194:
                    C2354.m7983();
                    C3099.m10095();
                    return null;
                case 292180206:
                case 2119593806:
                    i11 = 18163;
                    iM2761 = C0619.m2761("ۡܿ") ^ i8;
                    i = ((iM2761 ^ i7) * 15123) ^ (-898864858);
                    i2 = 2094230837;
                    JSONObject jSONObject2 = jSONObjectM5469;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    jSONObjectM5469 = jSONObject2;
                    break;
                case 510734145:
                case 873095235:
                    C2310.m7813();
                    iM3169 = C0773.m3169("ۖᩳ") ^ i8;
                    i9 = ((iM3169 ^ i7) * 13741) ^ 1773175290;
                    i3 = 1116648049;
                    i10 = iM3169 ^ i3;
                    break;
                case 526548310:
                case 613496830:
                    i11 = 47841;
                    iM2761 = C0619.m2761("ۡܿ") ^ i8;
                    i = ((iM2761 ^ i7) * 15123) ^ (-898864858);
                    i2 = 2094230837;
                    JSONObject jSONObject3 = jSONObjectM5469;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    jSONObjectM5469 = jSONObject3;
                    break;
                case 604663307:
                case 2088752058:
                    jSONObjectM9860 = C3033.m9860(jSONObjectAdd, C2023.m6966(f33594, 76, 8, i11), C3033.m9855());
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0773.m3169("ܿ᩷") + i7) * (-117);
                        i9 = ((iM3169 ^ i8) * 28103) ^ 970014746;
                        i3 = -1135499845;
                        i10 = iM3169 ^ i3;
                    } else {
                        jSONObjectM5469 = jSONObjectM5469;
                        iM2761 = C0773.m3169("ۗۖ") ^ i8;
                        i = ((iM2761 ^ i7) * 3745) ^ (-518743843);
                        i2 = 1001402928;
                        JSONObject jSONObject4 = jSONObjectM5469;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                        jSONObjectM5469 = jSONObject4;
                    }
                    break;
                case 809488884:
                case 1943932755:
                    C4282.m13644();
                    if (C2966.f9654 < 0) {
                        jSONObject = jSONObjectM5469;
                        iM2762 = C0773.m3169("֨᩷") ^ i7;
                        i9 = ((iM2762 ^ i8) * 26445) ^ 780072080;
                        i5 = -1494028982;
                        i6 = iM2762 ^ i5;
                        jSONObjectM5469 = jSONObject;
                        i10 = i6;
                    } else {
                        iM3169 = C0773.m3169("ۖᩳ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 13741) ^ 1773175290;
                        i3 = 1116648049;
                        i10 = iM3169 ^ i3;
                    }
                    break;
                case 925943947:
                case 1466324013:
                    C1080.m4050();
                    if (C0269.m1775() <= 0) {
                        jSONObjectM5469 = jSONObjectM5469;
                        iM2761 = C0773.m3169("ۗۖ") ^ i8;
                        i = ((iM2761 ^ i7) * 3745) ^ (-518743843);
                        i2 = 1001402928;
                        JSONObject jSONObject5 = jSONObjectM5469;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                        jSONObjectM5469 = jSONObject5;
                    } else {
                        jSONObject = jSONObjectM5469;
                        iM2762 = C0773.m3169("֨᩷") ^ i7;
                        i9 = ((iM2762 ^ i8) * 26445) ^ 780072080;
                        i5 = -1494028982;
                        i6 = iM2762 ^ i5;
                        jSONObjectM5469 = jSONObject;
                        i10 = i6;
                    }
                    break;
                default:
                    jSONObjectM5469 = jSONObjectM5469;
                    str5 = (String) this.f33596;
                    str4 = (String) this.f33595;
                    sArr = f33594;
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ۗۖ") ^ i8;
                        i = ((iM2761 ^ i7) * 3745) ^ (-518743843);
                        i2 = 1001402928;
                    } else {
                        iM2761 = (C0619.m2761("֫᩶") + i7) * 77;
                        i = ((iM2761 ^ i8) * 22947) ^ (-1538972332);
                        i2 = -343321691;
                    }
                    JSONObject jSONObject6 = jSONObjectM5469;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    jSONObjectM5469 = jSONObject6;
                    break;
            }
        }
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        Object obj = null;
        C8614 c8614 = null;
        int i = 947758868;
        int i2 = C2354.f7599;
        int i3 = AbstractC3624.f12429;
        int iM3169 = (i2 - C0773.m3169("ܶܺ")) * (-101);
        int i4 = ((iM3169 ^ i3) * (-14425)) ^ (-1263415499);
        int i5 = -964323788;
        while (true) {
            i = ((((i ^ i3) * 29501) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2090165252:
                case -1078303203:
                    if (!RunnableC1848.f6235) {
                        iM3169 = (i3 - C0619.m2761("ܰ᩶")) * 5;
                        i4 = ((iM3169 ^ i2) * 21375) ^ (-1736191902);
                        i5 = -302879079;
                    } else {
                        iM3169 = C0773.m3169("ܶ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5393)) ^ 1981874149;
                        i5 = -2081848436;
                    }
                    break;
                case -1978797870:
                case -1488427470:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 16031) ^ (-1505327969);
                        i5 = 963208088;
                    } else {
                        iM3169 = (C0619.m2761("ۢۢ") + i2) * 63;
                        i4 = ((iM3169 ^ i3) * 22907) ^ 306506223;
                        i5 = 503352694;
                    }
                    break;
                case -1771138547:
                case 453024403:
                    C2023.m6964();
                    C1542.m5459();
                    break;
                case -1713896634:
                case 1340490679:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("ܶ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5393)) ^ 1981874149;
                        i5 = -2081848436;
                    } else {
                        iM3169 = C0773.m3169("ܳۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21815) ^ (-325201750);
                        i5 = 893857472;
                    }
                    break;
                case -1698820964:
                case 1525198873:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("᩹ۘ") + i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-16819)) ^ 1384654865;
                        i5 = 1489509351;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9001) ^ (-691682696);
                        i5 = -404567363;
                    }
                    break;
                case -1408296180:
                case -191956675:
                    obj = this.f33595;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ܶ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5393)) ^ 1981874149;
                        i5 = -2081848436;
                    } else {
                        iM3169 = C0773.m3169("֨۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19861)) ^ (-732794720);
                        i5 = -570838509;
                    }
                    break;
                case -1349283972:
                case 2125128451:
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("᩹ۘ") + i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-16819)) ^ 1384654865;
                        i5 = 1489509351;
                    } else {
                        iM3169 = (C0619.m2761("۬۟") + i3) * 53;
                        i4 = ((iM3169 ^ i2) * (-29335)) ^ 1701823369;
                        i5 = 1727031685;
                    }
                    break;
                case -1094787289:
                case -821396829:
                    C1663.m5976(c8614, (InterfaceC2386) this.f33596, abstractC22044);
                    break;
                case -1024218974:
                case -417871710:
                    if (C1783.f6087 > 0) {
                        iM3169 = (C0773.m3169("ۜ᩷") ^ i2) * 123;
                        i4 = ((iM3169 ^ i3) * (-3617)) ^ (-69403780);
                        i5 = -516644140;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܰ᩶")) * 5;
                        i4 = ((iM3169 ^ i2) * 21375) ^ (-1736191902);
                        i5 = -302879079;
                    }
                    break;
                case -856501328:
                case 292391527:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 16031) ^ (-1505327969);
                        i5 = 963208088;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 20271) ^ 1965172744;
                        i5 = -1020410097;
                    }
                    break;
                case -558399452:
                case 897364660:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 16031) ^ (-1505327969);
                        i5 = 963208088;
                    } else {
                        iM3169 = C0773.m3169("᩶֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15407)) ^ (-745651499);
                        i5 = -550117989;
                    }
                    break;
                case -21804556:
                case 1331097086:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܰ᩶")) * 5;
                        i4 = ((iM3169 ^ i2) * 21375) ^ (-1736191902);
                        i5 = -302879079;
                    } else {
                        iM3169 = C0619.m2761("ۚ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6551)) ^ 1714813555;
                        i5 = 182381520;
                    }
                    break;
                case 323788105:
                case 1921479669:
                    C3077.m10041();
                    if (C3492.f12043 > 0) {
                        iM3169 = (C0619.m2761("᩹ۘ") + i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-16819)) ^ 1384654865;
                        i5 = 1489509351;
                    } else {
                        iM3169 = (C0773.m3169("ۜ᩷") ^ i2) * 123;
                        i4 = ((iM3169 ^ i3) * (-3617)) ^ (-69403780);
                        i5 = -516644140;
                    }
                    break;
                case 928319875:
                case 1397563394:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ܶ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5393)) ^ 1981874149;
                        i5 = -2081848436;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۛ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * (-12329)) ^ 1299713197;
                        i5 = -1845720263;
                    }
                    break;
                case 960016027:
                case 1301876148:
                    c8614 = (C8614) obj;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 16031) ^ (-1505327969);
                        i5 = 963208088;
                    } else {
                        iM3169 = C0619.m2761("֡۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20237)) ^ 1502816020;
                        i5 = -2065177597;
                    }
                    break;
                default:
                    C1542.m5459();
                    C0619.m2763();
                    iM3169 = (i3 - C0619.m2761("ܰ᩶")) * 5;
                    i4 = ((iM3169 ^ i2) * 21375) ^ (-1736191902);
                    i5 = -302879079;
                    break;
            }
            return;
        }
    }

    public /* synthetic */ C10577(String str, String str2) {
        int i = 708633377;
        int i2 = AbstractC3624.f12429;
        int i3 = C4282.f15546;
        int iM2761 = (C0619.m2761("֨֡") ^ i3) * (-87);
        int i4 = ((iM2761 ^ i2) * 6717) ^ 598160955;
        int i5 = 1645003547;
        while (true) {
            i = ((((i ^ i2) * (-9077)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2121658282:
                case 1257646729:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۧ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25195) ^ 194804650;
                        i5 = -634534876;
                    } else {
                        iM2761 = (C0619.m2761("᩵۠") ^ i3) * 109;
                        i4 = ((iM2761 ^ i2) * 19465) ^ (-489169897);
                        i5 = -1325594277;
                    }
                    break;
                case -1742198172:
                case -1049665807:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("᩺ܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22937) ^ 2120389547;
                        i5 = -435640507;
                    } else {
                        iM2761 = C0773.m3169("ܽᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24325)) ^ (-1452747156);
                        i5 = -455867929;
                    }
                    break;
                case -1620503493:
                case -1088638600:
                    C23916.m53419();
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("֡۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2573)) ^ 1820760383;
                        i5 = -1673475160;
                    } else {
                        iM2761 = (C0773.m3169("ۚۖ") + i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 21803) ^ 1392272028;
                        i5 = -1108660098;
                    }
                    break;
                case -1612965201:
                case -1193033245:
                    AbstractC3624.m11755();
                    C3448.m11248();
                    iM2761 = (C0773.m3169("ۚۖ") + i2) * (-123);
                    i4 = ((iM2761 ^ i3) * 21803) ^ 1392272028;
                    i5 = -1108660098;
                    break;
                case -1597170833:
                case 1865436172:
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0773.m3169("ۧ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25195) ^ 194804650;
                        i5 = -634534876;
                    } else {
                        iM2761 = C0773.m3169("ܽۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16137)) ^ 1350552596;
                        i5 = -1766170649;
                    }
                    break;
                case -1377388679:
                case 1423365203:
                    if (!RunnableC0334.m2063()) {
                        iM2761 = C0773.m3169("ۧ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25195) ^ 194804650;
                        i5 = -634534876;
                    } else {
                        iM2761 = (C0773.m3169("ۚۖ") + i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 21803) ^ 1392272028;
                        i5 = -1108660098;
                    }
                    break;
                case -1355165445:
                case -1091337148:
                    this.f33595 = str2;
                    return;
                case -1306982453:
                case 635345205:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ۚۖ") + i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 21803) ^ 1392272028;
                        i5 = -1108660098;
                    } else {
                        iM2761 = C0619.m2761("ۙ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1835) ^ (-1894758074);
                        i5 = -1131721129;
                    }
                    break;
                case -934229710:
                case 1832823218:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0773.m3169("ۚۖ") + i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 21803) ^ 1392272028;
                        i5 = -1108660098;
                    } else {
                        iM2761 = C0619.m2761("ۨܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25235) ^ (-1144955529);
                        i5 = 386138497;
                    }
                    break;
                case -776972926:
                case -291884585:
                    this.f33596 = str;
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0619.m2761("֡۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2573)) ^ 1820760383;
                        i5 = -1673475160;
                    } else {
                        iM2761 = (C0619.m2761("ܰۘ") + i2) * 85;
                        i4 = ((iM2761 ^ i3) * (-1475)) ^ (-838602732);
                        i5 = -497545592;
                    }
                    break;
                case -732707758:
                case 1697713173:
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0773.m3169("ۤܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22675)) ^ 222137802;
                        i5 = -185514400;
                    } else {
                        iM2761 = C0619.m2761("ۜ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23831) ^ (-1180374586);
                        i5 = 1851084300;
                    }
                    break;
                case -101443177:
                case 1611013663:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۤܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22675)) ^ 222137802;
                        i5 = -185514400;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۚ") ^ i3) * (-69);
                        i4 = ((iM2761 ^ i2) * (-23221)) ^ (-572730232);
                        i5 = 1300430176;
                    }
                    break;
                case -24212641:
                case 2103256846:
                    C0950.m3785();
                    if (C0950.f3488 < 0) {
                        iM2761 = C0773.m3169("ۤܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22675)) ^ 222137802;
                        i5 = -185514400;
                    } else {
                        iM2761 = (C0773.m3169("ۚۖ") + i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 21803) ^ 1392272028;
                        i5 = -1108660098;
                    }
                    break;
                case 87334809:
                case 1558837017:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("᩺ܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22937) ^ 2120389547;
                        i5 = -435640507;
                    } else {
                        iM2761 = (C0773.m3169("ۖۛ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i3) * (-32543)) ^ 358887347;
                        i5 = 481404586;
                    }
                    break;
                case 961122400:
                case 1422602021:
                    C2702.m8876();
                    throw new RuntimeException();
                default:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("֡۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2573)) ^ 1820760383;
                        i5 = -1673475160;
                    } else {
                        iM2761 = (C0619.m2761("ۛ֫") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i3) * (-26915)) ^ 243677627;
                        i5 = 2113132237;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC15379
    /* JADX INFO: renamed from: ۙ */
    public void mo5773(C13778 c13778) {
        Object obj = null;
        ViewOnClickListenerC16544 viewOnClickListenerC16544 = null;
        int i = -268681372;
        int i2 = C2702.f8586;
        int i3 = C2354.f7599;
        int iM3169 = C0773.m3169("۫ۢ") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-16663)) ^ (-1853245688);
        int i5 = -234494263;
        while (true) {
            i = ((((i ^ i3) * 135) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2076000206:
                case -2024155484:
                    obj = this.f33595;
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("ܳܽ") + i2) * (-111);
                        i4 = ((iM3169 ^ i3) * 25251) ^ 1163607783;
                        i5 = 2027317338;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۡ֫")) * (-41);
                        i4 = ((iM3169 ^ i2) * 12997) ^ 818253324;
                        i5 = 1872845321;
                    }
                    break;
                case -1981565487:
                case 1489372090:
                    if (C2287.m7745() <= 0) {
                        iM3169 = (i2 - C0619.m2761("ܽᩴ")) * (-39);
                        i4 = ((iM3169 ^ i3) * (-15381)) ^ (-1215319460);
                        i5 = 1250459349;
                    } else {
                        iM3169 = (C0619.m2761("۫ۨ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * 25557) ^ 676663415;
                        i5 = -1975146519;
                    }
                    break;
                case -1976159542:
                case -689596309:
                    C2419.m8174();
                    AbstractC0641.m2813();
                    break;
                case -1889477277:
                case -1334180927:
                    viewOnClickListenerC16544 = (ViewOnClickListenerC16544) obj;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("ܳܽ") + i2) * (-111);
                        i4 = ((iM3169 ^ i3) * 25251) ^ 1163607783;
                        i5 = 2027317338;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۚ۬")) * (-105);
                        i4 = ((iM3169 ^ i3) * 3275) ^ 360514922;
                        i5 = 308910216;
                    }
                    break;
                case -1594034222:
                case -632144523:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ᩳ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23887) ^ (-50554036);
                        i5 = 1041992594;
                    } else {
                        iM3169 = C0619.m2761("ܶ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25635)) ^ (-987570908);
                        i5 = 85421044;
                    }
                    break;
                case -1367815065:
                case -840258388:
                    C3077.m10041();
                    if (C2834.f9334 > 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4341)) ^ 1594285297;
                        i5 = -69680665;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18669)) ^ 1446177084;
                        i5 = -1635020428;
                    }
                    break;
                case -1167336414:
                case -800763943:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ۘ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18669)) ^ 1446177084;
                        i5 = -1635020428;
                    } else {
                        iM3169 = (C0619.m2761("ۚ֨") ^ i2) * 47;
                        i4 = ((iM3169 ^ i3) * (-5785)) ^ (-1332271473);
                        i5 = -1794509887;
                    }
                    break;
                case -1110927416:
                case -538202629:
                    if (!C2288.m7767()) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4341)) ^ 1594285297;
                        i5 = -69680665;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23887) ^ (-50554036);
                        i5 = 1041992594;
                    }
                    break;
                case -650862481:
                case 802175506:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ܳܽ") + i2) * (-111);
                        i4 = ((iM3169 ^ i3) * 25251) ^ 1163607783;
                        i5 = 2027317338;
                    } else {
                        iM3169 = (C0619.m2761("ܿۡ") ^ i3) * 5;
                        i4 = ((iM3169 ^ i2) * (-7159)) ^ (-57703071);
                        i5 = -1815780397;
                    }
                    break;
                case -279710244:
                case 1138064697:
                    AbstractC0641.m2813();
                    if (C13473.f42873 != 0) {
                        iM3169 = (i2 - C0619.m2761("ܽᩴ")) * (-39);
                        i4 = ((iM3169 ^ i3) * (-15381)) ^ (-1215319460);
                        i5 = 1250459349;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23887) ^ (-50554036);
                        i5 = 1041992594;
                    }
                    break;
                case -169201396:
                case 1160140839:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ܽᩴ")) * (-39);
                        i4 = ((iM3169 ^ i3) * (-15381)) ^ (-1215319460);
                        i5 = 1250459349;
                    } else {
                        iM3169 = C0773.m3169("᩷ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-12079)) ^ (-1310208362);
                        i5 = 815777039;
                    }
                    break;
                case -133600770:
                case 1109509513:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ܳܽ") + i2) * (-111);
                        i4 = ((iM3169 ^ i3) * 25251) ^ 1163607783;
                        i5 = 2027317338;
                    } else {
                        iM3169 = C0773.m3169("ۖ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21435) ^ 544702731;
                        i5 = -733574705;
                    }
                    break;
                case 60551446:
                case 1488285710:
                    ViewOnClickListenerC16544.m39180(viewOnClickListenerC16544, (String) this.f33596, c13778);
                    break;
                case 170031074:
                case 1143364042:
                    if (C23916.m53419() != 0) {
                        iM3169 = (i2 - C0619.m2761("ܽᩴ")) * (-39);
                        i4 = ((iM3169 ^ i3) * (-15381)) ^ (-1215319460);
                        i5 = 1250459349;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܽ᩺")) * 43;
                        i4 = ((iM3169 ^ i3) * (-31571)) ^ 188549098;
                        i5 = -543360903;
                    }
                    break;
                case 1807230957:
                case 1858209742:
                    C2419.m8174();
                    iM3169 = C0773.m3169("ۘ᩻") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-18669)) ^ 1446177084;
                    i5 = -1635020428;
                    break;
                default:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4341)) ^ 1594285297;
                        i5 = -69680665;
                    } else {
                        iM3169 = C0619.m2761("۠ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13863)) ^ (-971524080);
                        i5 = -928590219;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        Object obj = null;
        SpannableStringBuilder spannableStringBuilder = null;
        C8002 c8002 = null;
        int i = 1967875129;
        int i2 = C11235.f35427;
        int i3 = C2310.f7472;
        int iM3169 = (C0773.m3169("᩺ۗ") ^ i2) * (-45);
        int i4 = ((iM3169 ^ i3) * 11881) ^ 456660714;
        int i5 = 2032562400;
        while (true) {
            i = ((((i ^ i3) * 24979) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1949467700:
                case 1461047624:
                    obj = this.f33595;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("֫᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18273) ^ 1384138158;
                        i5 = -1361670815;
                    } else {
                        iM3169 = C0619.m2761("ܳܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10955)) ^ 100735725;
                        i5 = 57640293;
                    }
                    break;
                case -1942897508:
                case 100323897:
                    C23916.m53425(textView, spannableStringBuilder);
                    C17423.m40911(textView);
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("֫᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18273) ^ 1384138158;
                        i5 = -1361670815;
                    } else {
                        iM3169 = C0619.m2761("᩺֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7215) ^ 1765018316;
                        i5 = -301679920;
                    }
                    break;
                case -1853009839:
                case -1100089555:
                    spannableStringBuilder = (SpannableStringBuilder) obj;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6745)) ^ (-795191037);
                        i5 = -1941581690;
                    } else {
                        iM3169 = (C0773.m3169("ۚ᩺") ^ i2) * 89;
                        i4 = ((iM3169 ^ i3) * 29849) ^ 1551021627;
                        i5 = -1374301776;
                    }
                    break;
                case -1598720854:
                case 1562825135:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۜۜ")) * (-103);
                        i4 = ((iM3169 ^ i2) * 20217) ^ (-1478684475);
                        i5 = -1011067708;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11035)) ^ 130549321;
                        i5 = 1390373334;
                    }
                    break;
                case -1439469604:
                case 172169600:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("۫᩹") + i2) * 81;
                        i4 = ((iM3169 ^ i3) * 15979) ^ (-1864998260);
                        i5 = -943926262;
                    } else {
                        iM3169 = C0773.m3169("ۛۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14031) ^ 1232313267;
                        i5 = 844602521;
                    }
                    break;
                case -1195121437:
                case 1465320523:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("۬ۜ") + i3) * (-29);
                        i4 = ((iM3169 ^ i2) * 6437) ^ 1875899946;
                        i5 = 1771138638;
                    } else {
                        iM3169 = C0773.m3169("ۖۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28651) ^ 509788253;
                        i5 = -596522985;
                    }
                    break;
                case -1100829464:
                case -445683891:
                    C0619.m2763();
                    C23916.m53419();
                    break;
                case -1092994988:
                case -710226059:
                    C13473.m33144();
                    if (C2485.f7950 == 0) {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6745)) ^ (-795191037);
                        i5 = -1941581690;
                    } else {
                        iM3169 = (C0619.m2761("۫᩹") + i2) * 81;
                        i4 = ((iM3169 ^ i3) * 15979) ^ (-1864998260);
                        i5 = -943926262;
                    }
                    break;
                case -1069703079:
                case 1790191486:
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6745)) ^ (-795191037);
                        i5 = -1941581690;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺ᩵")) * (-15);
                        i4 = ((iM3169 ^ i2) * 579) ^ 1668740580;
                        i5 = 1518580883;
                    }
                    break;
                case -790425353:
                case 698594925:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6745)) ^ (-795191037);
                        i5 = -1941581690;
                    } else {
                        iM3169 = C0619.m2761("᩶۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9119)) ^ (-1151628768);
                        i5 = -2128289480;
                    }
                    break;
                case -436042256:
                case 943033336:
                    if (!C0619.m2763()) {
                        C2375.m8070(textView, new ViewOnClickListenerC12790(2, c8002));
                    }
                    iM3169 = (C0619.m2761("۫᩹") + i2) * 81;
                    i4 = ((iM3169 ^ i3) * 15979) ^ (-1864998260);
                    i5 = -943926262;
                    break;
                case 146877197:
                case 294251381:
                    C1564.m5509();
                    if (C20932.f66974 > 0) {
                        iM3169 = (C0619.m2761("۬ۜ") + i3) * (-29);
                        i4 = ((iM3169 ^ i2) * 6437) ^ 1875899946;
                        i5 = 1771138638;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6745)) ^ (-795191037);
                        i5 = -1941581690;
                    }
                    break;
                case 323089786:
                case 514264170:
                    C1519.m5403();
                    C3779.m12264();
                    iM3169 = (C0619.m2761("۫᩹") + i2) * 81;
                    i4 = ((iM3169 ^ i3) * 15979) ^ (-1864998260);
                    i5 = -943926262;
                    break;
                case 1010070558:
                case 1759542230:
                    if (C0862.f3233 == 0) {
                        iM3169 = (i3 - C0619.m2761("ۜۜ")) * (-103);
                        i4 = ((iM3169 ^ i2) * 20217) ^ (-1478684475);
                        i5 = -1011067708;
                    } else {
                        iM3169 = (C0619.m2761("۫᩹") + i2) * 81;
                        i4 = ((iM3169 ^ i3) * 15979) ^ (-1864998260);
                        i5 = -943926262;
                    }
                    break;
                default:
                    c8002 = (C8002) this.f33596;
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("֫᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18273) ^ 1384138158;
                        i5 = -1361670815;
                    } else {
                        iM3169 = C0619.m2761("ۢۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2043) ^ (-1496970116);
                        i5 = 1510173683;
                    }
                    break;
            }
            return;
        }
    }
}
