package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71UU */
/* JADX INFO: loaded from: classes.dex */
public class C14292 extends AbstractC16610 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45128 = 0;

    /* JADX INFO: renamed from: ܳۜ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f45129;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f45130 = true;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C15945 f45131;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f45132;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f45133;

    static {
        ApplicationC23172.m52091(114);
        f45129 = new short[]{7342, 7854, 1504, 11462, 2655, -16145, 12024, 7068, -15000, -5976, 6579, 1611, -777, -853, -27764, -27773, -27770, -27761, -27763, -27761, -27772, -27761, -27752, -27765, -27746, -27761, -27737, -27765, -27750, -27750, -27773, -27772, -27763, -27732, -27773, -27770, -27761, -27752, -27761, -27767, -27771, -27748, -27761, -27752, -27757, -27737, -27771, -27762, -27761, -27769, -27765, -27746, -27767, -27774, -27718, -27765, -27746, -27746, -27761, -27752, -27772, -27767, -27770, -27765, -27751, -27751, -27718, -27765, -27746, -27746, -27761, -27752, -27772, -27775, -27761, -27761, -27750, -27733, -27750, -27775, -27719, -27773, -27763, -27736, -27770, -27771, -27767, -27775, -27708, -27746, -27769, -27750, -27707, -27762, -27765, -27746, -27765, -27723, -27765, -27767, -27723, -27752, -27765, -27767, 2360, -6052, -6061, -6058, -6049, 31080, 27591, -18937, -28691, 30794, -18457};
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public native C12187 mo2531();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public native void mo2533(C12187 c12187);

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo2535() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ac A[PHI: r3 r14 r15
      0x00ac: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:25:0x00aa, B:12:0x0050, B:9:0x004b, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r14v3 short[]) = (r14v2 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:25:0x00aa, B:12:0x0050, B:9:0x004b, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r15v3 int) = (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:25:0x00aa, B:12:0x0050, B:9:0x004b, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x010c A[PHI: r2 r21
      0x010c: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String), (r2v1 java.lang.String) binds: [B:33:0x010a, B:21:0x008a, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r21v3 int) = (r21v2 int), (r21v1 int), (r21v1 int) binds: [B:33:0x010a, B:21:0x008a, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0216 A[PHI: r5 r6 r9 r11 r12 r13 r22
      0x0216: PHI (r5v4 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:60:0x0214, B:56:0x01f8, B:48:0x01b6, B:37:0x0142, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r6v4 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short), (r6v1 short) binds: [B:60:0x0214, B:56:0x01f8, B:48:0x01b6, B:37:0x0142, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r9v4 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:60:0x0214, B:56:0x01f8, B:48:0x01b6, B:37:0x0142, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r11v4 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:60:0x0214, B:56:0x01f8, B:48:0x01b6, B:37:0x0142, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r12v4 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:60:0x0214, B:56:0x01f8, B:48:0x01b6, B:37:0x0142, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r13v4 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:60:0x0214, B:56:0x01f8, B:48:0x01b6, B:37:0x0142, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r22v6 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:60:0x0214, B:56:0x01f8, B:48:0x01b6, B:37:0x0142, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0248 A[PHI: r7 r8 r16
      0x0248: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:64:0x0246, B:52:0x01d7, B:29:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:64:0x0246, B:52:0x01d7, B:29:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0246, B:52:0x01d7, B:29:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        int iM3169;
        int i;
        int i2;
        String strM2756 = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 939880563;
        int i11 = C20932.f66974;
        int i12 = C3492.f12043;
        int iM31610 = C0773.m3169("ܳۗ") ^ i11;
        int i13 = ((iM31610 ^ i12) * 6707) ^ (-904902330);
        int i14 = iM31610 ^ 545465040;
        short[] sArr3 = null;
        int i15 = 0;
        int iM31611 = 0;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-3741)) >> 31));
            switch (i10) {
                case -2003933406:
                case 643975689:
                    strM2756 = C0619.m2756(sArr2, i9, i15, i6);
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0773.m3169("᩸֡") ^ i11;
                        i = ((iM3169 ^ i12) * (-29083)) ^ 736445857;
                        i2 = 2114359987;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩺") ^ i12;
                        i = ((iM3169 ^ i11) * (-9749)) ^ 166003514;
                        i2 = 1501941724;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1932240683:
                case -959340442:
                    i5 = 268271641;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("֡ܶ") ^ i11;
                        i = ((iM3169 ^ i12) * 18797) ^ (-425226871);
                        i2 = 2704784;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ᩷") ^ i11) * 23;
                        i = ((iM3169 ^ i12) * 10931) ^ 1026663117;
                        i2 = -806032622;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1745131983:
                case 1248861554:
                    m43859(C0619.m2761(strM2756) ^ 2121620910);
                    break;
                case -1668050609:
                case 172952657:
                    sArr3 = f45129;
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0773.m3169("ۚ᩻") ^ i12;
                        i = ((iM3169 ^ i11) * 31043) ^ 763292834;
                        i2 = -1188024682;
                    } else {
                        iM3169 = C0773.m3169("֨᩻") ^ i12;
                        i = ((iM3169 ^ i11) * 30915) ^ 2015650094;
                        i2 = -1487986404;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1619125896:
                case -551529004:
                    i6 = 20656;
                    iM3169 = C0773.m3169("ۛ֨") ^ i11;
                    i = ((iM3169 ^ i12) * (-13653)) ^ 992194711;
                    i2 = 243196141;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1556922191:
                case 1358998037:
                    C2702.m8876();
                    C1519.m5403();
                    iM3169 = C0773.m3169("ۛ᩻") ^ i11;
                    i = ((iM3169 ^ i12) * (-5737)) ^ 2117139404;
                    i2 = 1206472288;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1429840706:
                case 992088155:
                    if (C1080.f3865 < 0) {
                        iM3169 = (C0619.m2761("᩺ۛ") + i12) * (-75);
                        i = ((iM3169 ^ i11) * 7079) ^ 527163397;
                        i2 = -2030118845;
                    } else {
                        iM3169 = C0773.m3169("᩸֡") ^ i11;
                        i = ((iM3169 ^ i12) * (-29083)) ^ 736445857;
                        i2 = 2114359987;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1262914554:
                case -585790155:
                    c = 0;
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("֡ܶ") ^ i11;
                        i = ((iM3169 ^ i12) * 18797) ^ (-425226871);
                        i2 = 2704784;
                    } else {
                        iM3169 = C0619.m2761("ۢᩳ") ^ i11;
                        i = ((iM3169 ^ i12) * 22329) ^ (-1918215033);
                        i2 = -1048062871;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1122835014:
                case 1978266592:
                    iM31611 = C0773.m3169(C3448.m11252(sArr, i7, i8, i6));
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("᩸֡") ^ i11;
                        i = ((iM3169 ^ i12) * (-29083)) ^ 736445857;
                        i2 = 2114359987;
                    } else {
                        iM3169 = (C0773.m3169("֡ۜ") + i12) * (-79);
                        i = ((iM3169 ^ i11) * (-28591)) ^ 1278155610;
                        i2 = -1197877111;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -979717959:
                case -274180262:
                    i3 = s * s2;
                    i4 = s * s;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۚ᩻") ^ i12;
                        i = ((iM3169 ^ i11) * 31043) ^ 763292834;
                        i2 = -1188024682;
                    } else {
                        iM3169 = (C0619.m2761("ܶ۫") + i11) * (-105);
                        i = ((iM3169 ^ i12) * (-5391)) ^ 2084403324;
                        i2 = -1217225968;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -931574388:
                case 391242136:
                    if (i3 - (i4 + i5) > 0) {
                        iM3169 = C0619.m2761("᩺۬") ^ i12;
                        i = ((iM3169 ^ i11) * (-13345)) ^ 2034557950;
                        i2 = -9872292;
                    } else {
                        iM3169 = (C0773.m3169("۠ܿ") ^ i12) * (-103);
                        i = ((iM3169 ^ i11) * (-6483)) ^ 1524233227;
                        i2 = 1754405598;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -717779121:
                case -347344067:
                    s = sArr3[c];
                    s2 = 32758;
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("֡ܶ") ^ i11;
                        i = ((iM3169 ^ i12) * 18797) ^ (-425226871);
                        i2 = 2704784;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩹") ^ i12;
                        i = ((iM3169 ^ i11) * 22223) ^ (-745394668);
                        i2 = -697508763;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -457142996:
                case 719665312:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("᩺ۛ") + i12) * (-75);
                        i = ((iM3169 ^ i11) * 7079) ^ 527163397;
                        i2 = -2030118845;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩻") ^ i11;
                        i = ((iM3169 ^ i12) * (-5737)) ^ 2117139404;
                        i2 = 1206472288;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -325256409:
                case 1627447451:
                    i6 = 12346;
                    iM3169 = C0773.m3169("ۛ֨") ^ i11;
                    i = ((iM3169 ^ i12) * (-13653)) ^ 992194711;
                    i2 = 243196141;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -8002023:
                case 615707205:
                    sArr = f45129;
                    i7 = 1;
                    i8 = 3;
                    if (C1519.m5403()) {
                        iM3169 = (C0619.m2761("ۘۛ") ^ i11) * 67;
                        i = ((iM3169 ^ i12) * 26757) ^ 2009989021;
                        i2 = 1182855154;
                    } else {
                        iM3169 = C0773.m3169("֡ܶ") ^ i11;
                        i = ((iM3169 ^ i12) * 18797) ^ (-425226871);
                        i2 = 2704784;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 412227974:
                case 1848933997:
                    RunnableC1848.m6364(this, iM31611 ^ 2116160933);
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ۚ᩻") ^ i12;
                        i = ((iM3169 ^ i11) * 31043) ^ 763292834;
                        i2 = -1188024682;
                    } else {
                        iM3169 = (i11 - C0773.m3169("᩻ۨ")) * (-21);
                        i = ((iM3169 ^ i12) * 19949) ^ 1612677595;
                        i2 = 1141169970;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 947517836:
                case 963881946:
                    sArr2 = f45129;
                    i9 = 4;
                    i15 = 3;
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("᩺ۛ") + i12) * (-75);
                        i = ((iM3169 ^ i11) * 7079) ^ 527163397;
                        i2 = -2030118845;
                    } else {
                        iM3169 = C0773.m3169("ۚᩴ") ^ i12;
                        i = ((iM3169 ^ i11) * (-12205)) ^ 635597705;
                        i2 = 898906138;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 1774532605:
                case 1831168485:
                    C2878.m9491();
                    C2878.m9491();
                    break;
                default:
                    if (C0269.m1775() > 0) {
                        iM3169 = (C0619.m2761("᩺ۛ") + i12) * (-75);
                        i = ((iM3169 ^ i11) * 7079) ^ 527163397;
                        i2 = -2030118845;
                    } else {
                        iM3169 = C0773.m3169("֡ܶ") ^ i11;
                        i = ((iM3169 ^ i12) * 18797) ^ (-425226871);
                        i2 = 2704784;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46057;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        int i = 343258034;
        int i2 = C1826.f6190;
        int i3 = C1542.f5343;
        int iM3169 = C0773.m3169("ۖ֨") ^ i2;
        int i4 = ((iM3169 ^ i3) * 20603) ^ (-1672228742);
        int i5 = -709049962;
        while (true) {
            i = ((((i ^ i3) * (-28071)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1975549346:
                case 569637260:
                    if (C0619.m2763()) {
                        iM3169 = C0773.m3169("ۗ᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1729)) ^ 800031131;
                        i5 = -84841369;
                    } else {
                        iM3169 = (C0773.m3169("ۜۜ") + i2) * 65;
                        i4 = ((iM3169 ^ i3) * (-1089)) ^ (-2142570516);
                        i5 = -1967170265;
                    }
                    break;
                case -1890344263:
                case 707629300:
                    break;
                case -1831296650:
                case -1348614801:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 49;
                        i4 = ((iM3169 ^ i3) * 8343) ^ 1139450532;
                        i5 = 995583789;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۬֡")) * 39;
                        i4 = ((iM3169 ^ i3) * (-3155)) ^ (-1717010516);
                        i5 = -1276493597;
                    }
                    break;
                case -1671507816:
                case 403200031:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ۗ᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1729)) ^ 800031131;
                        i5 = -84841369;
                    } else {
                        iM3169 = (C0773.m3169("ܳ᩶") ^ i3) * (-13);
                        i4 = ((iM3169 ^ i2) * (-30115)) ^ 502218592;
                        i5 = 1742989873;
                    }
                    break;
                case -1642810882:
                case 654863598:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 49;
                        i4 = ((iM3169 ^ i3) * 8343) ^ 1139450532;
                        i5 = 995583789;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֨᩺")) * (-113);
                        i4 = ((iM3169 ^ i3) * (-11083)) ^ (-133301007);
                        i5 = 630434546;
                    }
                    break;
                case -1571549680:
                case 882859419:
                    C3734.m12152();
                    iM3169 = (i2 - C0619.m2761("֨᩺")) * (-113);
                    i4 = ((iM3169 ^ i3) * (-11083)) ^ (-133301007);
                    i5 = 630434546;
                    break;
                case -1319556125:
                case 112644954:
                    if (C2023.m6964() <= 0) {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 49;
                        i4 = ((iM3169 ^ i3) * 8343) ^ 1139450532;
                        i5 = 995583789;
                    } else {
                        iM3169 = C0619.m2761("ۧ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22325)) ^ 1508571979;
                        i5 = -2134919188;
                    }
                    break;
                case -1118462852:
                case -786392961:
                    if (m43863(c8614)) {
                        iM3169 = (C0773.m3169("᩶᩺") ^ i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-11613)) ^ (-1600653326);
                        i5 = -925298146;
                    } else {
                        iM3169 = (C0619.m2761("᩺᩹") + i3) * (-25);
                        i4 = ((iM3169 ^ i2) * (-31461)) ^ (-872673693);
                        i5 = 1517476916;
                    }
                    break;
                case -1054014240:
                case -132551728:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۗܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1499) ^ (-636721806);
                        i5 = 1599986268;
                    } else {
                        iM3169 = C0619.m2761("۠ۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15779) ^ (-1978782640);
                        i5 = 1541795817;
                    }
                    break;
                case -908154087:
                case 932672276:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i3 - C0773.m3169("᩸ۛ")) * (-125);
                        i4 = ((iM3169 ^ i2) * 18459) ^ 326957023;
                        i5 = -1903351861;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۗ") ^ i2) * (-121);
                        i4 = ((iM3169 ^ i3) * 18117) ^ (-1337433407);
                        i5 = -1637640137;
                    }
                    break;
                case -786007745:
                case -72137910:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("ۗ᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1729)) ^ 800031131;
                        i5 = -84841369;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܿۤ")) * (-19);
                        i4 = ((iM3169 ^ i3) * 6127) ^ (-2133607795);
                        i5 = -1694102363;
                    }
                    break;
                case -757781543:
                case 349615104:
                    if (C0619.m2763()) {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 49;
                        i4 = ((iM3169 ^ i3) * 8343) ^ 1139450532;
                        i5 = 995583789;
                    } else {
                        iM3169 = C0619.m2761("ܺ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21485)) ^ 721402827;
                        i5 = -1654656746;
                    }
                    break;
                case -734079861:
                case -139670450:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 49;
                        i4 = ((iM3169 ^ i3) * 8343) ^ 1139450532;
                        i5 = 995583789;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۬᩻")) * 75;
                        i4 = ((iM3169 ^ i2) * 25517) ^ (-1182691167);
                        i5 = -310113271;
                    }
                    break;
                case -533696916:
                case 310703161:
                    if (C3690.m11994(c12187)) {
                        iM3169 = (C0773.m3169("ۜۘ") ^ i2) * 63;
                        i4 = ((iM3169 ^ i3) * (-10683)) ^ 1542126190;
                        i5 = 1774297689;
                    } else {
                        iM3169 = (C0619.m2761("᩺᩹") + i3) * (-25);
                        i4 = ((iM3169 ^ i2) * (-31461)) ^ (-872673693);
                        i5 = 1517476916;
                    }
                    break;
                case -352239274:
                case 522431433:
                    C0773.m3163(c8614, C3998.m12926(this.f45132));
                    c8614.m23216();
                    iM3169 = (C0619.m2761("᩺᩹") + i3) * (-25);
                    i4 = ((iM3169 ^ i2) * (-31461)) ^ (-872673693);
                    i5 = 1517476916;
                    break;
                case -316465923:
                case 428368027:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("ۗܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1499) ^ (-636721806);
                        i5 = 1599986268;
                    } else {
                        iM3169 = (C0619.m2761("ᩴᩳ") + i2) * (-51);
                        i4 = ((iM3169 ^ i3) * (-2993)) ^ (-1343245266);
                        i5 = 498560638;
                    }
                    break;
                case 373080393:
                case 1223386429:
                    C23916.m53419();
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = C0773.m3169("ۗ᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1729)) ^ 800031131;
                        i5 = -84841369;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֨᩺")) * (-113);
                        i4 = ((iM3169 ^ i3) * (-11083)) ^ (-133301007);
                        i5 = 630434546;
                    }
                    break;
                case 930391811:
                case 1801433388:
                    C0619.m2763();
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i3 - C0773.m3169("᩸ۛ")) * (-125);
                        i4 = ((iM3169 ^ i2) * 18459) ^ 326957023;
                        i5 = -1903351861;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֨᩺")) * (-113);
                        i4 = ((iM3169 ^ i3) * (-11083)) ^ (-133301007);
                        i5 = 630434546;
                    }
                    break;
                default:
                    RunnableC3055.m9933();
                    C2834.m9344();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩶ۙ */
    public final boolean mo29449() {
        return this.f45130;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d7 A[PHI: r3 r15
      0x00d7: PHI (r3v4 java.lang.String[]) = (r3v3 java.lang.String[]), (r3v2 java.lang.String[]) binds: [B:27:0x00d5, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]) binds: [B:27:0x00d5, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0183 A[PHI: r1 r2 r7 r8 r14
      0x0183: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:43:0x0181, B:23:0x00ab, B:15:0x0087, B:86:0x0183] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:43:0x0181, B:23:0x00ab, B:15:0x0087, B:86:0x0183] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:43:0x0181, B:23:0x00ab, B:15:0x0087, B:86:0x0183] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:43:0x0181, B:23:0x00ab, B:15:0x0087, B:86:0x0183] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v6 short[]) binds: [B:43:0x0181, B:23:0x00ab, B:15:0x0087, B:86:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0214 A[PHI: r5 r6 r11 r12 r22
      0x0214: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:55:0x0212, B:51:0x01f3, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:55:0x0212, B:51:0x01f3, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:55:0x0212, B:51:0x01f3, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short) binds: [B:55:0x0212, B:51:0x01f3, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r22v5 int) = (r22v4 int), (r22v3 int), (r22v3 int) binds: [B:55:0x0212, B:51:0x01f3, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0247 A[PHI: r4 r9
      0x0247: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:59:0x0245, B:35:0x0135, B:17:0x008b, B:15:0x0087, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:59:0x0245, B:35:0x0135, B:17:0x008b, B:15:0x0087, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x027d A[PHI: r16 r17
      0x027d: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x027b, B:12:0x007e, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:63:0x027b, B:12:0x007e, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        int iM3169;
        int i;
        int i2;
        int i3 = C0773.f2792;
        int i4 = C20932.f66974;
        int iM31610 = C0773.m3169("֫ܺ") ^ i4;
        int i5 = ((iM31610 ^ i3) * (-17475)) ^ 208406838;
        String strM7749 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-1845453810);
        int iM31611 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        char c = 0;
        int i11 = 1779025481;
        int i12 = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i13 = 0;
        String strM43840 = null;
        String strM47853 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * (-30429)) >> 31));
            switch (i11) {
                case -2048853181:
                case 415218625:
                    i8 = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    i9 = 3;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("ᩳܳ") ^ i3) * 95;
                        i = ((iM3169 ^ i4) * 17265) ^ (-833813249);
                        i2 = -1366615583;
                    } else {
                        iM3169 = (C0619.m2761("ۜ᩵") ^ i4) * q.h;
                        i = ((iM3169 ^ i3) * (-6019)) ^ (-1896864351);
                        i2 = 313360920;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1900731012:
                case -1052318609:
                    strM43840 = m43840(strM47853);
                    sArr3 = f45129;
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ᩳܳ") ^ i3) * 95;
                        i = ((iM3169 ^ i4) * 17265) ^ (-833813249);
                        i2 = -1366615583;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31612 = (C0773.m3169("᩸֡") ^ i4) * 23;
                        i5 = ((iM31612 ^ i3) * (-27205)) ^ (-2064708264);
                        i6 = iM31612 ^ (-421483578);
                    }
                    break;
                case -1611740086:
                case -1328326285:
                    i10 = i12 + 1;
                    s2 = 1;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۚᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-26951)) ^ (-763707444);
                        i2 = -66055006;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۜ᩻")) * (-51);
                        i = ((iM3169 ^ i4) * (-19903)) ^ (-1409420464);
                        i2 = -1323721500;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1553790655:
                case 322406001:
                    strArr = new String[]{strM43840, AbstractC0116.m1244(iM31611 ^ i7)};
                    sArr2 = f45129;
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("ۖ᩹") ^ i4) * (-115);
                        i = ((iM3169 ^ i3) * (-18255)) ^ (-2104563115);
                        i2 = 1135246829;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܳۤ")) * (-45);
                        i = ((iM3169 ^ i4) * 17773) ^ 326801176;
                        i2 = -802485756;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1407416923:
                case -1194532252:
                    sArr = f45129;
                    c = 'h';
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("۬ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * 24209) ^ (-1748604224);
                        i2 = 246880585;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۤ") ^ i4) * 43;
                        i = ((iM3169 ^ i3) * (-23701)) ^ (-1928006534);
                        i2 = -1961400925;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1354314403:
                case 753609341:
                    i13 = 59450;
                    iM3169 = C0773.m3169("᩻ۜ") ^ i4;
                    i = ((iM3169 ^ i3) * (-27431)) ^ 271652943;
                    i2 = 1684454606;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1238271888:
                case 1755519120:
                    iM31611 = C0773.m3169(strM7749);
                    i7 = 2099502291;
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("ۛ᩹") + i3) * (-125);
                        i = ((iM3169 ^ i4) * (-30027)) ^ (-377323648);
                        i2 = 454944004;
                    } else {
                        iM3169 = C0773.m3169("ۚᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-26951)) ^ (-763707444);
                        i2 = -66055006;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1141203584:
                case -428147116:
                    s = sArr[c];
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0619.m2761("ܰ۬") ^ i3) * (-45);
                        i = ((iM3169 ^ i4) * (-31755)) ^ 621488835;
                        i2 = -1194114980;
                    } else {
                        iM3169 = C0773.m3169("ۙۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-977)) ^ (-650131854);
                        i2 = 1262757260;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1131262217:
                case -690212099:
                    C23916.m53419();
                    if (C2375.f7641 > 0) {
                        iM3169 = C0619.m2761("۬ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * 24209) ^ (-1748604224);
                        i2 = 246880585;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܳۤ")) * (-45);
                        i = ((iM3169 ^ i4) * 17773) ^ 326801176;
                        i2 = -802485756;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -595931262:
                case 1657611027:
                    AbstractC0116.m1243();
                    return null;
                case -150809292:
                case 1333611364:
                    return C3734.m12148(C0773.m3169(C2287.m7749(sArr2, i8, i9, i13)) ^ 2122686578, strArr);
                case -109873152:
                case 612043938:
                    C2966.m9664();
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("ܰ۬") ^ i3) * (-45);
                        i = ((iM3169 ^ i4) * (-31755)) ^ 621488835;
                        i2 = -1194114980;
                    } else {
                        iM3169 = (C0619.m2761("ᩳܳ") ^ i3) * 95;
                        i = ((iM3169 ^ i4) * 17265) ^ (-833813249);
                        i2 = -1366615583;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 174469452:
                case 1998039325:
                    C2878.m9491();
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("۬ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * 24209) ^ (-1748604224);
                        i2 = 246880585;
                    } else {
                        iM3169 = (C0619.m2761("ܰ۬") ^ i3) * (-45);
                        i = ((iM3169 ^ i4) * (-31755)) ^ 621488835;
                        i2 = -1194114980;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 227553255:
                case 970622471:
                    i12 = s * 2;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۚᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-26951)) ^ (-763707444);
                        i2 = -66055006;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܶ֡")) * (-83);
                        i = ((iM3169 ^ i3) * 10077) ^ (-1518918762);
                        i2 = -1355411295;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 651630134:
                case 1317561339:
                    C3099.m10095();
                    iM3169 = (C0619.m2761("ܰ۬") ^ i3) * (-45);
                    i = ((iM3169 ^ i4) * (-31755)) ^ 621488835;
                    i2 = -1194114980;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 680511520:
                case 1319718794:
                    strM47853 = C20932.m47853(f45129, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 4, i13);
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ᩳܳ") ^ i3) * 95;
                        i = ((iM3169 ^ i4) * 17265) ^ (-833813249);
                        i2 = -1366615583;
                    } else {
                        iM3169 = (C0773.m3169("ۙ᩵") + i3) * 85;
                        i = ((iM3169 ^ i4) * 12039) ^ 1734523207;
                        i2 = -810831642;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1045325490:
                case 1328550533:
                    strM7749 = C2287.m7749(sArr3, 109, 3, i13);
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ܰ۬") ^ i3) * (-45);
                        i = ((iM3169 ^ i4) * (-31755)) ^ 621488835;
                        i2 = -1194114980;
                    } else {
                        iM3169 = C0619.m2761("ۜۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 22429) ^ (-206330229);
                        i2 = 440253362;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1214058169:
                case 1311227181:
                    i13 = 64731;
                    iM3169 = C0773.m3169("᩻ۜ") ^ i4;
                    i = ((iM3169 ^ i3) * (-27431)) ^ 271652943;
                    i2 = 1684454606;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i14 = s + s2;
                    if ((i14 * i14) - i10 < 0) {
                        iM3169 = C0619.m2761("۠ۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-19371)) ^ (-584943581);
                        i2 = 1693167199;
                    } else {
                        iM3169 = (C0619.m2761("۫֨") + i3) * (-59);
                        i = ((iM3169 ^ i4) * (-3673)) ^ 1079463165;
                        i2 = 973191939;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
