package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 42S7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20121 extends AbstractC2432 {

    /* JADX INFO: renamed from: ᩸۠ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f64625 = {617, -1462, 5449, -2859, -9330, 2190, -7269, -7994, 1641, -7757, -7171, -3950, -6129, -3217, -929, -2902, 3191, 25576, 25599, 25580, 25587, 25599, 25581, 3785, 16467, -21637, -20065};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f64626;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f64627;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13408 f64628;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f64629;

    /* JADX WARN: Code duplicated, block: B:26:0x00b6 A[PHI: r7 r15
      0x00b6: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:25:0x00b4, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]) binds: [B:25:0x00b4, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x021d A[PHI: r3 r4 r12 r13
      0x021d: PHI (r3v4 org.json.JSONObject) = (r3v2 org.json.JSONObject), (r3v2 org.json.JSONObject), (r3v3 org.json.JSONObject), (r3v2 org.json.JSONObject) binds: [B:56:0x021b, B:52:0x01fa, B:35:0x0132, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r4v4 org.json.JSONObject) = (r4v2 org.json.JSONObject), (r4v2 org.json.JSONObject), (r4v3 org.json.JSONObject), (r4v2 org.json.JSONObject) binds: [B:56:0x021b, B:52:0x01fa, B:35:0x0132, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:56:0x021b, B:52:0x01fa, B:35:0x0132, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r13v4 short) = (r13v2 short), (r13v3 short), (r13v2 short), (r13v2 short) binds: [B:56:0x021b, B:52:0x01fa, B:35:0x0132, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0292 A[PHI: r17
      0x0292: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:68:0x0290, B:15:0x0073, B:13:0x006f, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02c5 A[PHI: r8
      0x02c5: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:72:0x02c3, B:21:0x0090, B:13:0x006f, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02f7 A[PHI: r9 r11 r16 r22
      0x02f7: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:76:0x02f5, B:64:0x0270, B:60:0x0250] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:76:0x02f5, B:64:0x0270, B:60:0x0250] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:76:0x02f5, B:64:0x0270, B:60:0x0250] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r22v4 int) = (r22v3 int), (r22v3 int), (r22v5 int) binds: [B:76:0x02f5, B:64:0x0270, B:60:0x0250] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        int iM3169;
        int i;
        int i2;
        int i3 = AbstractC0641.f2496;
        int i4 = C3033.f9831;
        int iM2761 = C0619.m2761("ۤ֨") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-3483)) ^ 741321626;
        JSONObject jSONObject = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-128794151);
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 1955473045;
        int i13 = 0;
        JSONObject jSONObject2 = null;
        C9921 c9921M33409 = null;
        C18300 c18300 = null;
        boolean z = false;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 4123) >> 31));
            switch (i12) {
                case -2073180339:
                case -1899365058:
                    C1321.m4852();
                    C2375.m8065();
                    iM3169 = C0619.m2761("ۖۢ") ^ i4;
                    i = ((iM3169 ^ i3) * 895) ^ 412990008;
                    i2 = -1198343662;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2072184451:
                case -1706089148:
                    i13 = s * s;
                    i9 = 1520289;
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ۚۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 11195) ^ (-322867304);
                        i2 = 1987193876;
                    } else {
                        iM3169 = (C0619.m2761("᩹ᩴ") ^ i3) * (-11);
                        i = ((iM3169 ^ i4) * (-13591)) ^ 1807041061;
                        i2 = 154553747;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2016937195:
                case 885846284:
                    C0862.m3503();
                    if (C2834.m9344() < 0) {
                        iM3169 = C0619.m2761("ۖۢ") ^ i4;
                        i = ((iM3169 ^ i3) * 895) ^ 412990008;
                        i2 = -1198343662;
                    } else {
                        iM3169 = C0619.m2761("ᩳ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 23401) ^ 1218701045;
                        i2 = -1983587451;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1854788364:
                case -205302750:
                    throw new C4866(c9921M33409.m25751());
                case -1758687297:
                case 1051658507:
                    s2 = 1233;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ᩳ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 23401) ^ 1218701045;
                        i2 = -1983587451;
                    } else {
                        iM3169 = (C0773.m3169("ܽ֨") ^ i4) * 71;
                        i = ((iM3169 ^ i3) * 24251) ^ 1436745651;
                        i2 = 777591633;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1491616278:
                case 389726106:
                    c = 16;
                    if (C2288.m7767()) {
                        iM3169 = C0619.m2761("ۖۢ") ^ i4;
                        i = ((iM3169 ^ i3) * 895) ^ 412990008;
                        i2 = -1198343662;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩺ܳ")) * 87;
                        i = ((iM3169 ^ i3) * (-29929)) ^ 607255767;
                        i2 = 947739475;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1474716725:
                case -364467813:
                    i11 = 7170;
                    iM3169 = (i4 - C0773.m3169("᩵۠")) * 19;
                    i = ((iM3169 ^ i3) * (-8065)) ^ 954030724;
                    i2 = 537706709;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1469852426:
                case -1413277358:
                    int i14 = s + s2;
                    if ((i14 * i14) - i10 > 0) {
                        iM3169 = (C0773.m3169("ۛ۫") ^ i3) * (-91);
                        i = ((iM3169 ^ i4) * (-10479)) ^ 100542512;
                        i2 = 238324737;
                    } else {
                        iM3169 = (C0619.m2761("ۡۧ") ^ i3) * 49;
                        i = ((iM3169 ^ i4) * 24549) ^ 69425391;
                        i2 = 670919432;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1307779964:
                case -1056360720:
                    z = false;
                    iM3169 = C0773.m3169("۟ۗ") ^ i4;
                    i = ((iM3169 ^ i3) * 27121) ^ (-2096170588);
                    i2 = 1559036893;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1288569937:
                case -873031797:
                    jSONObject2 = this.f64627;
                    jSONObject = this.f64626;
                    if (RunnableC1848.m6360()) {
                        iM3169 = C0619.m2761("ᩳ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 23401) ^ 1218701045;
                        i2 = -1983587451;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۠۫")) * (-21);
                        i = ((iM3169 ^ i4) * (-23335)) ^ 1518412614;
                        i2 = -1527956344;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1255257444:
                case -1051782907:
                    i11 = 25498;
                    iM3169 = (i4 - C0773.m3169("᩵۠")) * 19;
                    i = ((iM3169 ^ i3) * (-8065)) ^ 954030724;
                    i2 = 537706709;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1161042316:
                case -238729088:
                    s = sArr[c];
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ۚۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 11195) ^ (-322867304);
                        i2 = 1987193876;
                    } else {
                        iM3169 = C0773.m3169("᩵ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 30223) ^ (-688870974);
                        i2 = 246044546;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -819975348:
                case 945945733:
                    c9921M33409 = C13650.m33409(c18300, jSONObject2, jSONObject, z);
                    if (c9921M33409.m25753()) {
                        iM3169 = (C0619.m2761("ܿۨ") ^ i4) * 67;
                        i = ((iM3169 ^ i3) * (-28205)) ^ (-420330949);
                        i2 = -2136027114;
                    } else {
                        iM3169 = (C0773.m3169("ܶᩳ") + i3) * 27;
                        i = ((iM3169 ^ i4) * (-16881)) ^ 1281472135;
                        i2 = 903021249;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -702631715:
                case -317357288:
                    ViewOnClickListenerC13408 viewOnClickListenerC13408 = this.f64628;
                    c18300 = viewOnClickListenerC13408.f42719;
                    if (viewOnClickListenerC13408.f42721 == 0) {
                        iM3169 = C0619.m2761("۫ۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-14773)) ^ 1774160954;
                        i2 = 2043805857;
                    } else {
                        iM3169 = C0773.m3169("֨᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-32213)) ^ 953586092;
                        i2 = 1272736466;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -161648881:
                case 1969128959:
                    this.f64629 = c9921M33409.m25747(C0773.m3166(sArr2, i7, i8, i11));
                    return;
                case -56139093:
                case 1934833764:
                    if (C3492.m11488()) {
                        iM3169 = (C0619.m2761("ܳۜ") ^ i3) * 61;
                        i = ((iM3169 ^ i4) * 21397) ^ (-231471920);
                        i2 = 537940931;
                    } else {
                        iM3169 = C0619.m2761("ܽۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 29759) ^ 480780368;
                        i2 = 68980617;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 32692846:
                case 1966494052:
                    int i15 = i13 + i9;
                    i10 = i15 + i15;
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ᩳ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 23401) ^ 1218701045;
                        i2 = -1983587451;
                    } else {
                        iM3169 = C0773.m3169("ۘܿ") ^ i4;
                        i = ((iM3169 ^ i3) * 19337) ^ 2089774339;
                        i2 = 2029025138;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 107520249:
                case 1921486703:
                    sArr = f64625;
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("ܳᩳ") + i4) * 89;
                        i = ((iM3169 ^ i3) * (-32673)) ^ 1085879703;
                        i2 = 1789342756;
                    } else {
                        iM3169 = C0773.m3169("ۚۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 11195) ^ (-322867304);
                        i2 = 1987193876;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 158866078:
                case 1419137201:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0619.m2761("ܽۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 29759) ^ 480780368;
                        i2 = 68980617;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۧᩴ")) * (-9);
                        i = ((iM3169 ^ i4) * 16209) ^ 918794425;
                        i2 = 163353033;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 483276690:
                case 1713095073:
                    C3077.m10041();
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = C0619.m2761("ۖۢ") ^ i4;
                        i = ((iM3169 ^ i3) * 895) ^ 412990008;
                        i2 = -1198343662;
                    } else {
                        iM3169 = C0619.m2761("ܽۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 29759) ^ 480780368;
                        i2 = 68980617;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 827209861:
                case 1181320511:
                    sArr2 = f64625;
                    i7 = 17;
                    if (C1343.m4943()) {
                        iM3169 = (C0773.m3169("۠ۗ") ^ i4) * 3;
                        i = ((iM3169 ^ i3) * 11929) ^ (-421113516);
                        i2 = -136113142;
                    } else {
                        iM3169 = (C0619.m2761("ܳۜ") ^ i3) * 61;
                        i = ((iM3169 ^ i4) * 21397) ^ (-231471920);
                        i2 = 537940931;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 947256605:
                case 1532323476:
                    i8 = 6;
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("ܽۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 29759) ^ 480780368;
                        i2 = 68980617;
                    } else {
                        iM3169 = (C0773.m3169("۫ۛ") + i3) * 41;
                        i = ((iM3169 ^ i4) * 21263) ^ (-810098760);
                        i2 = -905635171;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1464746868:
                case 1948344352:
                    C3779.m12264();
                    AbstractC0116.m1243();
                    return;
                default:
                    z = true;
                    iM3169 = C0773.m3169("۟ۗ") ^ i4;
                    i = ((iM3169 ^ i3) * 27121) ^ (-2096170588);
                    i2 = 1559036893;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ViewOnClickListenerC13408 viewOnClickListenerC13408 = null;
        int i = 1236070205;
        int i2 = C3033.f9831;
        int i3 = RunnableC3055.f9898;
        int iM3169 = (C0773.m3169("֡᩺") ^ i2) * (-29);
        int i4 = ((iM3169 ^ i3) * 22671) ^ 194609862;
        int i5 = 1036493695;
        while (true) {
            i = ((((i ^ i3) * 17371) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1984341860:
                case -1233256681:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("᩺᩵") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * (-24997)) ^ 1678336919;
                        i5 = -1599361175;
                    } else {
                        iM3169 = (C0773.m3169("ۛ֫") + i2) * (-9);
                        i4 = ((iM3169 ^ i3) * 17417) ^ (-712108723);
                        i5 = -1607801875;
                    }
                    break;
                case -1565494270:
                case 2113358180:
                    C1080.m4050();
                    C23916.m53419();
                    iM3169 = (C0619.m2761("᩺᩵") + i2) * 9;
                    i4 = ((iM3169 ^ i3) * (-24997)) ^ 1678336919;
                    i5 = -1599361175;
                    break;
                case -1545003501:
                case -297863962:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۨ۫")) * (-23);
                        i4 = ((iM3169 ^ i3) * 27783) ^ 1480596505;
                        i5 = 1662922062;
                    } else {
                        iM3169 = C0619.m2761("֫ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15609)) ^ 1340129485;
                        i5 = -182459897;
                    }
                    break;
                case -1498926300:
                case 1431997834:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۨ۫")) * (-23);
                        i4 = ((iM3169 ^ i3) * 27783) ^ 1480596505;
                        i5 = 1662922062;
                    } else {
                        iM3169 = C0619.m2761("ۜܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20989)) ^ (-2109315206);
                        i5 = 1448467278;
                    }
                    break;
                case -1479134086:
                case -1439385616:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0773.m3169("ۤ᩻") ^ i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-3485)) ^ (-858208633);
                        i5 = -1350215412;
                    } else {
                        iM3169 = C0773.m3169("ۤۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25215) ^ (-2110639156);
                        i5 = -1746181480;
                    }
                    break;
                case -1327340692:
                case -366500213:
                    RunnableC3055.m9930(viewOnClickListenerC13408, exc, null);
                    break;
                case -1311820297:
                case -892790495:
                    if (C4282.m13644()) {
                        iM3169 = (i2 - C0619.m2761("ۚۙ")) * (-73);
                        i4 = ((iM3169 ^ i3) * (-9941)) ^ 740422858;
                        i5 = -902074625;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֫᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * (-9317)) ^ (-1169916453);
                        i5 = -191235337;
                    }
                    break;
                case -1305765962:
                case -1136003312:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("ۤ᩻") ^ i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-3485)) ^ (-858208633);
                        i5 = -1350215412;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֨᩵")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 14647) ^ (-177129645);
                        i5 = -1424879146;
                    }
                    break;
                case -942519751:
                case 1240987331:
                    if (C1146.m4231()) {
                        iM3169 = C0619.m2761("ܿ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21887) ^ (-1799700267);
                        i5 = 1549922079;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۨ۫")) * (-23);
                        i4 = ((iM3169 ^ i3) * 27783) ^ 1480596505;
                        i5 = 1662922062;
                    }
                    break;
                case -873565397:
                case 715752107:
                    RunnableC3055.m9933();
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (i2 - C0619.m2761("ۨ۫")) * (-23);
                        i4 = ((iM3169 ^ i3) * 27783) ^ 1480596505;
                        i5 = 1662922062;
                    } else {
                        iM3169 = (C0619.m2761("᩺᩵") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * (-24997)) ^ 1678336919;
                        i5 = -1599361175;
                    }
                    break;
                case -831478428:
                case 242314048:
                    C1321.m4852();
                    C0862.m3503();
                    break;
                case -339960183:
                case 2005734359:
                    viewOnClickListenerC13408 = this.f64628;
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i2 - C0773.m3169("֫᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * (-9317)) ^ (-1169916453);
                        i5 = -191235337;
                    } else {
                        iM3169 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-5825)) ^ 1914815378;
                        i5 = 1526615949;
                    }
                    break;
                case -207074187:
                case 273845169:
                    if (!C2023.f6737) {
                        iM3169 = C0773.m3169("ۤۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25215) ^ (-2110639156);
                        i5 = -1746181480;
                    } else {
                        iM3169 = (C0619.m2761("᩺᩵") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * (-24997)) ^ 1678336919;
                        i5 = -1599361175;
                    }
                    break;
                case -165431397:
                case 1346582402:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i2 - C0773.m3169("֫᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * (-9317)) ^ (-1169916453);
                        i5 = -191235337;
                    } else {
                        iM3169 = (C0773.m3169("۫֫") + i3) * (-83);
                        i4 = ((iM3169 ^ i2) * 23183) ^ (-1571238760);
                        i5 = -544855059;
                    }
                    break;
                case 162608788:
                case 823259323:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ۤۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25215) ^ (-2110639156);
                        i5 = -1746181480;
                    } else {
                        iM3169 = (C0619.m2761("᩶ۧ") ^ i2) * (-121);
                        i4 = ((iM3169 ^ i3) * (-25373)) ^ (-1443072219);
                        i5 = -891825353;
                    }
                    break;
                default:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ۤ᩻") ^ i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-3485)) ^ (-858208633);
                        i5 = -1350215412;
                    } else {
                        iM3169 = (C0619.m2761("ۡ᩷") ^ i2) * (-65);
                        i4 = ((iM3169 ^ i3) * 10367) ^ (-20842378);
                        i5 = -768002619;
                    }
                    break;
            }
            return;
        }
    }

    public C20121(ViewOnClickListenerC13408 viewOnClickListenerC13408, JSONObject jSONObject, JSONObject jSONObject2) {
        int i = -930235336;
        int i2 = RunnableC3055.f9898;
        int i3 = C1080.f3865;
        this.f64628 = viewOnClickListenerC13408;
        this.f64627 = jSONObject;
        this.f64626 = jSONObject2;
        int iM2761 = (i2 - C0619.m2761("᩶᩺")) * (-19);
        int i4 = ((iM2761 ^ i3) * (-19237)) ^ 427412575;
        int i5 = -632912677;
        while (true) {
            i = (iM2761 ^ i5) ^ (i4 & (((i ^ i3) * (-17281)) >> 31));
            switch (i) {
                case -2105416073:
                case -574258275:
                    if (C1564.f5401 > 0) {
                        iM2761 = C0773.m3169("ۛۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31595) ^ 1439503591;
                        i5 = -340095121;
                    }
                    break;
                case -1843950094:
                case -1497298400:
                    C2375.m8065();
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("᩶᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17615) ^ 973640311;
                        i5 = 111188938;
                    }
                    break;
                case -1167130407:
                case -907178736:
                    RunnableC0334.m2063();
                    C0487.m2356();
                    break;
                case -470413608:
                case 819725017:
                    C3492.m11488();
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۘ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21621)) ^ 1089120636;
                        i5 = 1349725838;
                    }
                    break;
                case 663274274:
                case 2029680478:
                    C2878.m9491();
                    throw new RuntimeException();
                case 1305822844:
                case 2053045531:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۤۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14119)) ^ 295772710;
                        i5 = 1289560540;
                    } else {
                        iM2761 = (C0773.m3169("ܳۢ") + i2) * (-63);
                        i4 = ((iM2761 ^ i3) * (-19957)) ^ (-61853103);
                        i5 = -45716975;
                        continue;
                    }
                    break;
                default:
                    return;
            }
            iM2761 = C0773.m3169("᩻ۢ") ^ i3;
            i4 = ((iM2761 ^ i2) * (-11095)) ^ (-1648164193);
            i5 = -51532275;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e2 A[PHI: r2 r14
      0x00e2: PHI (r2v3 l.۫᩹֫) = (r2v2 l.۫᩹֫), (r2v2 l.۫᩹֫), (r2v2 l.۫᩹֫), (r2v2 l.۫᩹֫), (r2v5 l.۫᩹֫) binds: [B:17:0x006b, B:15:0x0067, B:12:0x005e, B:9:0x0058, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v5 short[]) binds: [B:17:0x006b, B:15:0x0067, B:12:0x005e, B:9:0x0058, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01df A[PHI: r3 r8 r12
      0x01df: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:56:0x01dd, B:44:0x0166, B:27:0x00a8, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:56:0x01dd, B:44:0x0166, B:27:0x00a8, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:56:0x01dd, B:44:0x0166, B:27:0x00a8, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0212 A[PHI: r4 r5 r7 r10 r11
      0x0212: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:60:0x0210, B:48:0x0187, B:23:0x0085, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:60:0x0210, B:48:0x0187, B:23:0x0085, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:60:0x0210, B:48:0x0187, B:23:0x0085, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:60:0x0210, B:48:0x0187, B:23:0x0085, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r11v4 short) = (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:60:0x0210, B:48:0x0187, B:23:0x0085, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0242 A[PHI: r15 r20
      0x0242: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:64:0x0240, B:31:0x00c6, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x0240, B:31:0x00c6, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        int iM2761;
        int i;
        int i2;
        int i3 = RunnableC0334.f1808;
        int i4 = C2375.f7641;
        int iM2762 = C0619.m2761("᩵ܳ") ^ i4;
        int i5 = ((iM2762 ^ i3) * 10393) ^ 1630657741;
        String strM8881 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ (-687159279);
        ViewOnClickListenerC13408 viewOnClickListenerC13408 = null;
        int iM2763 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -879434226;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 30995) >> 31));
            switch (i13) {
                case -2121584995:
                case -1936920733:
                    i11 = 50036;
                    iM2761 = C0619.m2761("᩶᩸") ^ i3;
                    i = ((iM2761 ^ i4) * 20829) ^ 1759110215;
                    i2 = -209310316;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1984766066:
                case 1233496433:
                    i10 = s * s2;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ܰۜ") ^ i3;
                        i = ((iM2761 ^ i4) * 19015) ^ 675094870;
                        i2 = 1049117328;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۫ۛ")) * (-29);
                        i = ((iM2761 ^ i4) * 21685) ^ 1133807870;
                        i2 = 2130284204;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1977745261:
                case -1005074892:
                    C20932.m47848();
                    C2966.m9664();
                    break;
                case -1767115153:
                case -1123425792:
                    c = 23;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("᩺ܰ") ^ i4;
                        i = ((iM2761 ^ i3) * (-26643)) ^ (-1590672127);
                        i2 = -1676214506;
                    } else {
                        iM2761 = C0773.m3169("ܺ۠") ^ i4;
                        i = ((iM2761 ^ i3) * (-29403)) ^ (-1110691695);
                        i2 = 689794778;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1751074255:
                case 899392507:
                    if ((i10 + 1) - i9 > 0) {
                        iM2761 = (C0773.m3169("֡ۛ") ^ i3) * 3;
                        i = ((iM2761 ^ i4) * 19141) ^ 1431856032;
                        i2 = 766578140;
                    } else {
                        iM2761 = C0773.m3169("ۗ֨") ^ i4;
                        i = ((iM2761 ^ i3) * 4215) ^ (-765750116);
                        i2 = -590248101;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1546164426:
                case -1301706669:
                    sArr = f64625;
                    if (C2485.f7950 != 0) {
                        iM2761 = (i4 - C0619.m2761("ۗ۠")) * 65;
                        i = ((iM2761 ^ i3) * 8881) ^ (-126656198);
                        i2 = -182231171;
                    } else {
                        iM2761 = C0619.m2761("۬ܽ") ^ i3;
                        i = ((iM2761 ^ i4) * (-5201)) ^ (-2040334330);
                        i2 = -2001288930;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1475360109:
                case 97449550:
                    i11 = 10945;
                    iM2761 = C0619.m2761("᩶᩸") ^ i3;
                    i = ((iM2761 ^ i4) * 20829) ^ 1759110215;
                    i2 = -209310316;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1322741564:
                case 1671794242:
                    i8 = s + 1;
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ܺ᩶") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i4) * 20163) ^ (-1009798229);
                        i2 = 1122113365;
                    } else {
                        iM2761 = (C0773.m3169("ۜᩳ") ^ i3) * (-19);
                        i = ((iM2761 ^ i4) * (-23161)) ^ 1301231543;
                        i2 = -738637319;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1066021493:
                case 1692679495:
                    m8191(viewOnClickListenerC13408, iM2763 ^ i7);
                    break;
                case -785849087:
                case 1146561457:
                    i9 = i8 * i8;
                    s2 = 2;
                    if (C3077.f9998) {
                        iM2761 = (i4 - C0619.m2761("֡ᩳ")) * 23;
                        i = ((iM2761 ^ i3) * (-4275)) ^ 480113257;
                        i2 = 912842832;
                    } else {
                        iM2761 = C0773.m3169("᩺ܰ") ^ i4;
                        i = ((iM2761 ^ i3) * (-26643)) ^ (-1590672127);
                        i2 = -1676214506;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -765777496:
                case 69831717:
                    i12 = 24;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i4 - C0619.m2761("ۗ۠")) * 65;
                        i = ((iM2761 ^ i3) * 8881) ^ (-126656198);
                        i2 = -182231171;
                    } else {
                        iM2761 = (C0773.m3169("᩵۬") ^ i3) * (-13);
                        i = ((iM2761 ^ i4) * (-27689)) ^ 194513798;
                        i2 = -1582395189;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -456694589:
                case 1135513250:
                    strM8881 = C2702.m8881(sArr2, i12, 3, i11);
                    if (C1080.m4050()) {
                        iM2761 = C0773.m3169("ۧ۟") ^ i4;
                        i = ((iM2761 ^ i3) * 27491) ^ (-1810632189);
                        i2 = -2057824272;
                    } else {
                        iM2761 = C0619.m2761("ܰۜ") ^ i3;
                        i = ((iM2761 ^ i4) * 19015) ^ 675094870;
                        i2 = 1049117328;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -389328743:
                case 2102062552:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ܳ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-24677)) ^ (-749511444);
                        i2 = -1328960534;
                    } else {
                        iM2761 = C0619.m2761("ܰۜ") ^ i3;
                        i = ((iM2761 ^ i4) * 19015) ^ 675094870;
                        i2 = 1049117328;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -242852015:
                case 1167862744:
                    iM2763 = C0619.m2761(strM8881);
                    i7 = 2125616437;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("᩺ܰ") ^ i4;
                        i = ((iM2761 ^ i3) * (-26643)) ^ (-1590672127);
                        i2 = -1676214506;
                    } else {
                        iM2761 = C0773.m3169("ᩳ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * 5919) ^ 413193724;
                        i2 = -171344606;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -72154026:
                case 2011687443:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ܳ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-24677)) ^ (-749511444);
                        i2 = -1328960534;
                    } else {
                        iM2761 = C0773.m3169("᩺ܰ") ^ i4;
                        i = ((iM2761 ^ i3) * (-26643)) ^ (-1590672127);
                        i2 = -1676214506;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 188176883:
                case 1986415763:
                    C1321.m4852();
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("ܳ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-24677)) ^ (-749511444);
                        i2 = -1328960534;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۗ۠")) * 65;
                        i = ((iM2761 ^ i3) * 8881) ^ (-126656198);
                        i2 = -182231171;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1092516676:
                case 1573067845:
                    s = sArr[c];
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("ܰۜ") ^ i3;
                        i = ((iM2761 ^ i4) * 19015) ^ 675094870;
                        i2 = 1049117328;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ۫") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i3) * 19373) ^ (-367078763);
                        i2 = 646185140;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1500463853:
                case 1959719288:
                    C3779.m12264();
                    iM2761 = C0773.m3169("ܳ᩺") ^ i4;
                    i = ((iM2761 ^ i3) * (-24677)) ^ (-749511444);
                    i2 = -1328960534;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    viewOnClickListenerC13408 = this.f64628;
                    sArr2 = f64625;
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("ܳ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-24677)) ^ (-749511444);
                        i2 = -1328960534;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩵") ^ i4;
                        i = ((iM2761 ^ i3) * (-17805)) ^ 1646783442;
                        i2 = 1895298959;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int iM31610;
        int i4;
        short[] sArr;
        int i5;
        int i6;
        int iM31611;
        int i7;
        int iM2762;
        int i8;
        C20121 c20121 = this;
        int i9 = C2966.f9654;
        int i10 = C1080.f3865;
        int iM2763 = (C0619.m2761("ܶۨ") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
        int i11 = ((iM2763 ^ i10) * 4201) ^ (-1371346614);
        short[] sArr2 = null;
        int i12 = iM2763 ^ (-722777841);
        ViewOnClickListenerC13408 viewOnClickListenerC13408 = null;
        int i13 = 0;
        int i14 = 0;
        boolean z = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s = 0;
        short s2 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        char c = 0;
        int i22 = 0;
        int i23 = 915551274;
        int i24 = 0;
        short[] sArr3 = null;
        String strM40377 = null;
        String strM3780 = null;
        String strM12149 = null;
        String strM3500 = null;
        int i25 = 0;
        while (true) {
            i23 = i12 ^ (i11 & (((i23 ^ i10) * (-26435)) >> 31));
            switch (i23) {
                case -2081672848:
                case 2097549040:
                    i14 = i17 ^ i25;
                    z = true;
                    if (i13 == 0) {
                        iM2761 = (C0773.m3169("᩺۠") ^ i10) * 61;
                        i = ((iM2761 ^ i9) * 23739) ^ (-724494922);
                        i2 = -2036839417;
                    } else {
                        iM2761 = C0773.m3169("᩶ۧ") ^ i9;
                        i = ((iM2761 ^ i10) * (-9243)) ^ (-1661855527);
                        i2 = -1081106203;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1986627382:
                case -770778626:
                    sArr = sArr2;
                    i5 = i22;
                    i7 = i24;
                    iM31611 = C0773.m3169(C3690.m11996(sArr, i5, i7, i18));
                    i6 = 2124482776;
                    if (C3448.f11240 >= 0) {
                        int iM2764 = (C0619.m2761("ܿۛ") ^ i9) * (-81);
                        short[] sArr4 = sArr;
                        i11 = ((iM2764 ^ i10) * 27765) ^ 1130022398;
                        i24 = i7;
                        i17 = iM31611;
                        i25 = i6;
                        sArr2 = sArr4;
                        i12 = iM2764 ^ 1163036423;
                    } else {
                        int iM2765 = C0619.m2761("ۜ۟") ^ i10;
                        i24 = i7;
                        i17 = iM31611;
                        sArr2 = sArr;
                        i25 = 2124482776;
                        i12 = iM2765 ^ 1485487131;
                        i11 = ((iM2765 ^ i9) * (-1313)) ^ 1964533208;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    }
                    i22 = i5;
                    break;
                case -1977172581:
                case 170297075:
                    viewOnClickListenerC13408.f42720 = false;
                    C24509.m54772(C0269.m1784(viewOnClickListenerC13408.f42719));
                    ActivityC9458.f30665 = z;
                    break;
                case -1872415657:
                case 1057143723:
                    iM31610 = C0773.m3169(strM3780);
                    i4 = 2128219140;
                    i16 = iM31610 ^ i4;
                    iM2761 = (i9 - C0619.m2761("֨ۢ")) * 27;
                    i = ((iM2761 ^ i10) * (-27949)) ^ 829652673;
                    i2 = 1814379917;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1868159046:
                case -574921114:
                    sArr2 = sArr2;
                    i22 = i22;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    s = sArr3[c];
                    s2 = 39084;
                    if (C0619.f2439) {
                        iM2762 = (C0773.m3169("۬ۖ") + i9) * (-61);
                        i11 = ((iM2762 ^ i10) * 1345) ^ (-1923006834);
                        i8 = 1627106728;
                    } else {
                        iM2762 = C0619.m2761("ۡ᩺") ^ i9;
                        i11 = ((iM2762 ^ i10) * 18661) ^ (-1096487002);
                        i8 = 883183554;
                    }
                    int i26 = iM2762 ^ i8;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    sArr2 = sArr2;
                    i12 = i26;
                    i22 = i22;
                    c20121 = this;
                    break;
                case -1662981214:
                case 970645175:
                    strM3500 = C0862.m3500(f64625, 4, 3, i18);
                    if (!C3077.m10041()) {
                        iM2761 = C0619.m2761("᩸᩹") ^ i9;
                        i = ((iM2761 ^ i10) * (-1583)) ^ (-1731356329);
                        i2 = -703719460;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        sArr2 = sArr2;
                        i22 = i22;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        iM2762 = (C0773.m3169("۬ۖ") + i9) * (-61);
                        i11 = ((iM2762 ^ i10) * 1345) ^ (-1923006834);
                        i8 = 1627106728;
                        int i27 = iM2762 ^ i8;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        sArr2 = sArr2;
                        i12 = i27;
                        i22 = i22;
                        c20121 = this;
                    }
                    break;
                case -1622379234:
                case 33164253:
                    strM40377 = C17202.m40377(f64625, 13, 3, i18);
                    if (C2485.f7950 == 0) {
                        iM2761 = (C0773.m3169("۟ۖ") + i9) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i10) * 1257) ^ 720477897;
                        i2 = -30261859;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        sArr2 = sArr2;
                        i22 = i22;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        iM2762 = C0619.m2761("ܶᩳ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-11757)) ^ 1807131775;
                        i8 = -1217707304;
                        int i28 = iM2762 ^ i8;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        sArr2 = sArr2;
                        i12 = i28;
                        i22 = i22;
                        c20121 = this;
                    }
                    break;
                case -1500649294:
                case 1746255909:
                    sArr2 = sArr2;
                    i22 = i22;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    sArr3 = f64625;
                    c = 0;
                    if (C13473.f42873 != 0) {
                        iM2762 = C0619.m2761("ܶᩳ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-11757)) ^ 1807131775;
                        i8 = -1217707304;
                    } else {
                        iM2762 = C0773.m3169("ۤۛ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-4901)) ^ (-2104561048);
                        i8 = 115207417;
                    }
                    int i29 = iM2762 ^ i8;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    sArr2 = sArr2;
                    i12 = i29;
                    i22 = i22;
                    c20121 = this;
                    break;
                case -1447336520:
                case 581629060:
                    sArr2 = sArr2;
                    i22 = i22;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    i19 = s * s2;
                    i20 = s * s;
                    i21 = 381889764;
                    if (C2419.f7754 >= 0) {
                        iM2762 = (C0619.m2761("᩺᩷") ^ i10) * 89;
                        i11 = ((iM2762 ^ i9) * (-5663)) ^ (-1170454213);
                        i8 = 1229413908;
                    } else {
                        iM2762 = (C0773.m3169("֨ۜ") + i10) * (-31);
                        i11 = ((iM2762 ^ i9) * 12455) ^ (-1424430637);
                        i8 = -2095567079;
                    }
                    int i210 = iM2762 ^ i8;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    sArr2 = sArr2;
                    i12 = i210;
                    i22 = i22;
                    c20121 = this;
                    break;
                case -1396838737:
                case -308459899:
                    sArr2 = sArr2;
                    i22 = i22;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    if (i19 - (i20 + i21) > 0) {
                        iM2762 = C0619.m2761("᩸֨") ^ i9;
                        i11 = ((iM2762 ^ i10) * 8455) ^ (-1553330988);
                        i8 = -1759749308;
                    } else {
                        iM2762 = C0619.m2761("᩸۟") ^ i9;
                        i11 = ((iM2762 ^ i10) * (-2637)) ^ 1855062592;
                        i8 = 724780495;
                    }
                    int i211 = iM2762 ^ i8;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    sArr2 = sArr2;
                    i12 = i211;
                    i22 = i22;
                    c20121 = this;
                    break;
                case -1285470939:
                case 208963222:
                    if (C2310.f7472 < 0) {
                        sArr2 = sArr2;
                        i22 = i22;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        iM2762 = C0619.m2761("ܶᩳ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-11757)) ^ 1807131775;
                        i8 = -1217707304;
                        int i212 = iM2762 ^ i8;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        sArr2 = sArr2;
                        i12 = i212;
                        i22 = i22;
                        c20121 = this;
                    } else {
                        iM2761 = C0773.m3169("۠ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * (-15965)) ^ 1176517850;
                        i2 = 668603741;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -1238385813:
                case -634007537:
                    i18 = 38382;
                    iM2762 = (i10 - C0773.m3169("ۗܰ")) * 5;
                    i11 = ((iM2762 ^ i9) * (-9025)) ^ (-838172719);
                    i8 = -1588247430;
                    int i213 = iM2762 ^ i8;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    sArr2 = sArr2;
                    i12 = i213;
                    i22 = i22;
                    c20121 = this;
                    break;
                case -1161491612:
                case -89597523:
                    C0773.m3161();
                    C1519.m5403();
                    break;
                case -1062526425:
                case 1321124849:
                    strM12149 = C3734.m12149(f64625, 7, 3, i18);
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("۠ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * (-15965)) ^ 1176517850;
                        i2 = 668603741;
                    } else {
                        iM2761 = (i10 - C0773.m3169("᩶ۖ")) * 21;
                        i = ((iM2761 ^ i9) * 18511) ^ (-780171276);
                        i2 = 186882224;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1045215343:
                case 1272649264:
                    if (c20121.f64629) {
                        iM2761 = C0773.m3169("ܶ᩹") ^ i10;
                        i = ((iM2761 ^ i9) * 6767) ^ 2112149147;
                        i2 = -627267786;
                    } else {
                        iM2761 = (C0773.m3169("ۘ۫") ^ i9) * (-15);
                        i = ((iM2761 ^ i10) * (-10913)) ^ 1450214959;
                        i2 = 63101059;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1015598359:
                case -201138216:
                    iM3169 = C0773.m3169(strM12149);
                    i3 = 2128090511;
                    i15 = iM3169 ^ i3;
                    iM2761 = (i10 - C0773.m3169("ۤܽ")) * (-125);
                    i = ((iM2761 ^ i9) * (-5287)) ^ (-2515742);
                    i2 = 135690635;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -970193720:
                case 1290892963:
                    ViewOnClickListenerC13408 viewOnClickListenerC13409 = viewOnClickListenerC13408;
                    short[] sArr5 = sArr2;
                    i24 = 3;
                    if (C17202.f56030) {
                        int iM31612 = (i9 - C0773.m3169("᩹᩷")) * (-57);
                        i11 = ((iM31612 ^ i10) * 14279) ^ (-971868199);
                        sArr2 = sArr5;
                        i12 = iM31612 ^ (-693678915);
                        viewOnClickListenerC13408 = viewOnClickListenerC13409;
                        i22 = 1;
                    } else {
                        viewOnClickListenerC13408 = viewOnClickListenerC13409;
                        sArr2 = sArr5;
                        i22 = 1;
                        iM2761 = C0773.m3169("۠ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * (-15965)) ^ 1176517850;
                        i2 = 668603741;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -942514900:
                case 258123033:
                    AbstractC0116.m1243();
                    iM2761 = C0773.m3169("۠ۚ") ^ i9;
                    i = ((iM2761 ^ i10) * (-15965)) ^ 1176517850;
                    i2 = 668603741;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -743361282:
                case -27025666:
                    viewOnClickListenerC13408.m40396(i14, i16, z);
                    iM2761 = C0619.m2761("ܽܽ") ^ i10;
                    i = ((iM2761 ^ i9) * 23383) ^ (-1615577259);
                    i2 = -784320581;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -681238746:
                case 115362042:
                    viewOnClickListenerC13408.m40396(i14, i15, z);
                    iM2761 = C0619.m2761("ܽܽ") ^ i10;
                    i = ((iM2761 ^ i9) * 23383) ^ (-1615577259);
                    i2 = -784320581;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -374460911:
                case 1263484824:
                    i22 = i22;
                    viewOnClickListenerC13408 = c20121.f64628;
                    i13 = viewOnClickListenerC13408.f42721;
                    sArr2 = f64625;
                    if (C3099.f10023 > 0) {
                        int iM31613 = (C0773.m3169("֫᩸") + i10) * 51;
                        i12 = iM31613 ^ (-109387380);
                        i11 = ((iM31613 ^ i9) * 10589) ^ (-168519209);
                        i22 = i22;
                        c20121 = this;
                    } else {
                        i22 = i22;
                        iM2761 = C0773.m3169("۠ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * (-15965)) ^ 1176517850;
                        i2 = 668603741;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -284304500:
                case 580083223:
                    if (c20121.f64629) {
                        iM2761 = C0619.m2761("ۘᩴ") ^ i10;
                        i = ((iM2761 ^ i9) * 23333) ^ (-785720923);
                        i2 = -1780974715;
                    } else {
                        iM2761 = (C0619.m2761("ܰ᩹") + i9) * (-61);
                        i = ((iM2761 ^ i10) * (-28685)) ^ 1092242609;
                        i2 = 332566918;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -272452625:
                case 708792846:
                    C3734.m12152();
                    if (!C17202.m40372()) {
                        sArr = sArr2;
                        i5 = i22;
                        i6 = i25;
                        iM31611 = i17;
                        i7 = i24;
                        int iM2766 = (C0619.m2761("ܿۛ") ^ i9) * (-81);
                        short[] sArr6 = sArr;
                        i11 = ((iM2766 ^ i10) * 27765) ^ 1130022398;
                        i24 = i7;
                        i17 = iM31611;
                        i25 = i6;
                        sArr2 = sArr6;
                        i12 = iM2766 ^ 1163036423;
                        i22 = i5;
                    } else {
                        iM2761 = C0773.m3169("۠ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * (-15965)) ^ 1176517850;
                        i2 = 668603741;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -268991828:
                case 836495103:
                    iM31610 = C0619.m2761(strM40377);
                    i4 = 2124414665;
                    i16 = iM31610 ^ i4;
                    iM2761 = (i9 - C0619.m2761("֨ۢ")) * 27;
                    i = ((iM2761 ^ i10) * (-27949)) ^ 829652673;
                    i2 = 1814379917;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -40395773:
                case 1259511070:
                    iM3169 = C0773.m3169(strM3500);
                    i3 = 2116792869;
                    i15 = iM3169 ^ i3;
                    iM2761 = (i10 - C0773.m3169("ۤܽ")) * (-125);
                    i = ((iM2761 ^ i9) * (-5287)) ^ (-2515742);
                    i2 = 135690635;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 167814327:
                case 340636382:
                    i18 = 36840;
                    iM2762 = (i10 - C0773.m3169("ۗܰ")) * 5;
                    i11 = ((iM2762 ^ i9) * (-9025)) ^ (-838172719);
                    i8 = -1588247430;
                    int i214 = iM2762 ^ i8;
                    viewOnClickListenerC13408 = viewOnClickListenerC13408;
                    sArr2 = sArr2;
                    i12 = i214;
                    i22 = i22;
                    c20121 = this;
                    break;
                case 1812852173:
                case 1852518480:
                    C3779.m12264();
                    if (C1564.m5509() > 0) {
                        sArr2 = sArr2;
                        i22 = i22;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        iM2762 = (C0619.m2761("᩺᩷") ^ i10) * 89;
                        i11 = ((iM2762 ^ i9) * (-5663)) ^ (-1170454213);
                        i8 = 1229413908;
                        int i215 = iM2762 ^ i8;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        sArr2 = sArr2;
                        i12 = i215;
                        i22 = i22;
                        c20121 = this;
                    } else {
                        iM2761 = C0773.m3169("۠ۚ") ^ i9;
                        i = ((iM2761 ^ i10) * (-15965)) ^ 1176517850;
                        i2 = 668603741;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                default:
                    strM3780 = C0950.m3780(f64625, 10, 3, i18);
                    if (C0950.f3488 < 0) {
                        iM2761 = C0619.m2761("֡ܶ") ^ i9;
                        i = ((iM2761 ^ i10) * 2145) ^ (-763683294);
                        i2 = -1575105571;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        sArr2 = sArr2;
                        i22 = i22;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        iM2762 = C0619.m2761("ܶᩳ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-11757)) ^ 1807131775;
                        i8 = -1217707304;
                        int i216 = iM2762 ^ i8;
                        viewOnClickListenerC13408 = viewOnClickListenerC13408;
                        sArr2 = sArr2;
                        i12 = i216;
                        i22 = i22;
                        c20121 = this;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0487.m2362(this);
    }
}
