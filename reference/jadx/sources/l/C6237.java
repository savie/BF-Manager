package l;

import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۛ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G1XN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6237 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۜᩳۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f21169 = {3644, -17860, -18992, -20529, 24641, -16916, 25933, 14997, 15048, 15062, 15066, 15063, 15058};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10122 f21170;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3999 f21171;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10122 f21172;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f21173;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f21174;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8230 f21175;

    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0115 A[PHI: r5 r6 r7
      0x0115: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:31:0x0113, B:23:0x00a6, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r6v4 l.۟᩺᩻) = (r6v3 l.۟᩺᩻), (r6v2 l.۟᩺᩻), (r6v2 l.۟᩺᩻) binds: [B:31:0x0113, B:23:0x00a6, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r7v4 java.lang.StringBuilder) = (r7v2 java.lang.StringBuilder), (r7v3 java.lang.StringBuilder), (r7v2 java.lang.StringBuilder) binds: [B:31:0x0113, B:23:0x00a6, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01f1 A[PHI: r2 r3 r4 r8 r9 r13 r14 r15
      0x01f1: PHI (r2v4 l.ۖۚ᩸) = (r2v3 l.ۖۚ᩸), (r2v2 l.ۖۚ᩸), (r2v2 l.ۖۚ᩸), (r2v2 l.ۖۚ᩸), (r2v2 l.ۖۚ᩸) binds: [B:51:0x01ef, B:47:0x01c9, B:43:0x01a7, B:39:0x017a, B:35:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r3v4 java.lang.String) = 
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:51:0x01ef, B:47:0x01c9, B:43:0x01a7, B:39:0x017a, B:35:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:51:0x01ef, B:47:0x01c9, B:43:0x01a7, B:39:0x017a, B:35:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r8v4 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v3 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
     binds: [B:51:0x01ef, B:47:0x01c9, B:43:0x01a7, B:39:0x017a, B:35:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v4 int), (r9v2 int) binds: [B:51:0x01ef, B:47:0x01c9, B:43:0x01a7, B:39:0x017a, B:35:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:51:0x01ef, B:47:0x01c9, B:43:0x01a7, B:39:0x017a, B:35:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:51:0x01ef, B:47:0x01c9, B:43:0x01a7, B:39:0x017a, B:35:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:51:0x01ef, B:47:0x01c9, B:43:0x01a7, B:39:0x017a, B:35:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x027c A[PHI: r11
      0x027c: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:62:0x027a, B:15:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x02aa A[PHI: r20
      0x02aa: PHI (r20v4 short) = (r20v3 short), (r20v3 short), (r20v3 short), (r20v3 short), (r20v6 short) binds: [B:17:0x0078, B:15:0x0074, B:12:0x006b, B:9:0x0060, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM2761;
        int i;
        int i2;
        int i3 = C3690.f12684;
        int i4 = AbstractC0116.f1064;
        int iM2762 = (C0619.m2761("᩶ܺ") + i4) * 59;
        int i5 = ((iM2762 ^ i3) * (-19269)) ^ (-1231445849);
        String strM6310 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ (-1596652703);
        int iM2763 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -317405567;
        short s = 0;
        StringBuilder sb = null;
        C8230 c8230 = null;
        String strM8350 = null;
        String str = null;
        String str2 = null;
        C2459 c2459M8296 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * 19321) >> 31));
            switch (i10) {
                case -2054003317:
                case -651312983:
                    i7 = s * 2;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩺ۛ")) * 35;
                        i = ((iM2761 ^ i4) * (-12193)) ^ 954282550;
                        i2 = 218867292;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۜۛ")) * 55;
                        i = ((iM2761 ^ i3) * (-31899)) ^ (-1527310389);
                        i2 = 1602554702;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1970985959:
                case -1107537835:
                    int i11 = s + 1;
                    if ((i7 + 1) - (i11 * i11) <= 0) {
                        iM2761 = (C0773.m3169("۫ۘ") + i4) * 27;
                        i = ((iM2761 ^ i3) * 27887) ^ (-1529014227);
                        i2 = 36919598;
                    } else {
                        iM2761 = (C0619.m2761("ܳ᩻") ^ i3) * 55;
                        i = ((iM2761 ^ i4) * (-27899)) ^ (-635427814);
                        i2 = -2053919067;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1771790317:
                case 63904861:
                    i8 = 2511;
                    iM2761 = C0619.m2761("ܰۚ") ^ i4;
                    i = ((iM2761 ^ i3) * 31915) ^ (-977796712);
                    i2 = -556804281;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1747226815:
                case -342029624:
                    C2023.m6964();
                    iM2761 = C0619.m2761("ܺ֫") ^ i3;
                    i = ((iM2761 ^ i4) * 19189) ^ (-1170433096);
                    i2 = -1797427367;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1643144016:
                case -331176803:
                    c2459M8296.m8305(c8230.m22146());
                    c2459M8296.m8303(c8230.m22145());
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۘᩴ") + i4) * 55;
                        i = ((iM2761 ^ i3) * (-15003)) ^ 535963825;
                        i2 = 1232668737;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ᩳۧ")) * (-123);
                        i = ((iM2761 ^ i4) * (-12475)) ^ 208810070;
                        i2 = -560699979;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1582259118:
                case 627963994:
                    c2459M8296.m8299(C0773.m3169(strM6310) ^ 2129030275, str2);
                    str = this.f21173;
                    if (C2354.m7983()) {
                        iM2761 = (C0619.m2761("᩻ܶ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i4) * 26631) ^ (-339430342);
                        i2 = -981511306;
                    } else {
                        iM2761 = (C0619.m2761("᩺ܳ") ^ i3) * 79;
                        i = ((iM2761 ^ i4) * 17489) ^ 723891184;
                        i2 = 1914240476;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1439773816:
                case 286410593:
                    C2834.m9344();
                    C1783.m6232();
                    break;
                case -1415393623:
                case 814859952:
                    C1783.m6232();
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ܺ֫") ^ i3;
                        i = ((iM2761 ^ i4) * 19189) ^ (-1170433096);
                        i2 = -1797427367;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩺ۛ")) * 35;
                        i = ((iM2761 ^ i4) * (-12193)) ^ 954282550;
                        i2 = 218867292;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1282507970:
                case 1569410947:
                    C1783.m6234(sb, strM8350);
                    c2459M8296.m8300(C2023.m6952(sb));
                    c2459M8296.m8302(this.f21171);
                    break;
                case -1277716955:
                case 347472478:
                    strM6310 = C1826.m6310(sArr, i9, 3, i8);
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("᩺ܳ") ^ i3) * 79;
                        i = ((iM2761 ^ i4) * 17489) ^ 723891184;
                        i2 = 1914240476;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩸ۚ")) * 31;
                        i = ((iM2761 ^ i3) * o.a.B) ^ 1575086330;
                        i2 = -554947404;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -793998539:
                case 603067981:
                    strM8350 = C2485.m8350(sArr2, 7, 6, i8);
                    c2459M8296.m8306(strM8350);
                    c2459M8296.m8297();
                    c8230 = this.f21175;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("֡ۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-26263)) ^ (-1250315309);
                        i2 = 253689219;
                    } else {
                        iM2761 = C0773.m3169("᩻᩻") ^ i4;
                        i = ((iM2761 ^ i3) * (-27247)) ^ (-214613679);
                        i2 = -1710084500;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -669762112:
                case -641271959:
                    c2459M8296.m8304(2121549129 ^ iM2763, str);
                    sArr2 = f21169;
                    if (C1783.m6232()) {
                        iM2761 = (C0619.m2761("ۘܰ") + i3) * 37;
                        i = ((iM2761 ^ i4) * 21549) ^ 1534249004;
                        i2 = 985280725;
                    } else {
                        iM2761 = (C0619.m2761("᩺ܳ") ^ i3) * 79;
                        i = ((iM2761 ^ i4) * 17489) ^ 723891184;
                        i2 = 1914240476;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -623784111:
                case 1287005979:
                    c2459M8296 = C2459.m8296();
                    str2 = this.f21174;
                    sArr = f21169;
                    i9 = 1;
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("᩺ܳ") ^ i3) * 79;
                        i = ((iM2761 ^ i4) * 17489) ^ 723891184;
                        i2 = 1914240476;
                    } else {
                        iM2761 = C0619.m2761("᩵֫") ^ i3;
                        i = ((iM2761 ^ i4) * (-2351)) ^ 1827253585;
                        i2 = -1926762861;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -173806131:
                case 1836007645:
                    i8 = 15035;
                    iM2761 = C0619.m2761("ܰۚ") ^ i4;
                    i = ((iM2761 ^ i3) * 31915) ^ (-977796712);
                    i2 = -556804281;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 184595801:
                case 1916150208:
                    C0950.m3785();
                    if (C2288.m7767()) {
                        iM2761 = C0619.m2761("ܺ֫") ^ i3;
                        i = ((iM2761 ^ i4) * 19189) ^ (-1170433096);
                        i2 = -1797427367;
                    } else {
                        iM2761 = (C0619.m2761("ۘᩴ") + i4) * 55;
                        i = ((iM2761 ^ i3) * (-15003)) ^ 535963825;
                        i2 = 1232668737;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 223883325:
                case 414921926:
                    iM2763 = C0619.m2761(C1826.m6310(f21169, 4, 3, i8));
                    if (C3077.m10041()) {
                        iM2761 = (C0619.m2761("᩺ܳ") ^ i3) * 79;
                        i = ((iM2761 ^ i4) * 17489) ^ 723891184;
                        i2 = 1914240476;
                    } else {
                        iM2761 = (C0619.m2761("᩺ܽ") ^ i4) * (-105);
                        i = ((iM2761 ^ i3) * (-15019)) ^ (-2138348012);
                        i2 = -1777500224;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 473480969:
                case 1690766431:
                    sb = new StringBuilder();
                    C1783.m6234(sb, C11293.m28558(c8230.m22146()));
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("֡ۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-26263)) ^ (-1250315309);
                        i2 = 253689219;
                    } else {
                        iM2761 = (C0773.m3169("۬۠") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i3) * 1175) ^ 1425060493;
                        i2 = 1635891982;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 506276075:
                case 1499735264:
                    C2834.m9344();
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = C0619.m2761("ܺ֫") ^ i3;
                        i = ((iM2761 ^ i4) * 19189) ^ (-1170433096);
                        i2 = -1797427367;
                    } else {
                        iM2761 = C0619.m2761("֡ۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-26263)) ^ (-1250315309);
                        i2 = 253689219;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = f21169[0];
                    if (C1321.m4852()) {
                        iM2761 = (C0773.m3169("᩺᩶") + i3) * (-47);
                        i = ((iM2761 ^ i4) * 22311) ^ 1417232642;
                        i2 = -181856553;
                    } else {
                        iM2761 = C0619.m2761("ܺ֫") ^ i3;
                        i = ((iM2761 ^ i4) * 19189) ^ (-1170433096);
                        i2 = -1797427367;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x015a A[PHI: r1 r10 r11 r12
      0x015a: PHI (r1v4 boolean) = (r1v2 boolean), (r1v3 boolean), (r1v2 boolean), (r1v2 boolean), (r1v2 boolean), (r1v2 boolean) binds: [B:53:0x0158, B:46:0x0121, B:19:0x0068, B:17:0x0064, B:42:0x0106, B:75:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r10v6 l.ۚۢۨ) = (r10v5 l.ۚۢۨ), (r10v4 l.ۚۢۨ), (r10v4 l.ۚۢۨ), (r10v4 l.ۚۢۨ), (r10v4 l.ۚۢۨ), (r10v4 l.ۚۢۨ) binds: [B:53:0x0158, B:46:0x0121, B:19:0x0068, B:17:0x0064, B:42:0x0106, B:75:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r11v4 l.ܿܽۤ) = (r11v2 l.ܿܽۤ), (r11v2 l.ܿܽۤ), (r11v2 l.ܿܽۤ), (r11v2 l.ܿܽۤ), (r11v3 l.ܿܽۤ), (r11v2 l.ܿܽۤ) binds: [B:53:0x0158, B:46:0x0121, B:19:0x0068, B:17:0x0064, B:42:0x0106, B:75:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r12v3 l.֡ܽۤ) = (r12v1 l.֡ܽۤ), (r12v1 l.֡ܽۤ), (r12v1 l.֡ܽۤ), (r12v1 l.֡ܽۤ), (r12v2 l.֡ܽۤ), (r12v1 l.֡ܽۤ) binds: [B:53:0x0158, B:46:0x0121, B:19:0x0068, B:17:0x0064, B:42:0x0106, B:75:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        int iM2761;
        int i;
        C5564 c5564 = null;
        boolean z = false;
        int i2 = -2128045271;
        int i3 = C1080.f3865;
        int i4 = AbstractC0641.f2496;
        int iM2762 = (C0619.m2761("᩹ܳ") + i3) * (-81);
        int i5 = ((iM2762 ^ i4) * (-293)) ^ 199037957;
        int i6 = iM2762 ^ (-281244389);
        C18459 c18459 = null;
        while (true) {
            C0560 c0560 = null;
            C18459 c184510 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 14575) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -1739273819:
                    case 1927657525:
                        C4282.m13644();
                        if (!C2878.f9462) {
                        }
                        iM2761 = C0619.m2761("ۡۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27863) ^ 383970731;
                        i = -1227375043;
                        i6 = iM2761 ^ i;
                        break;
                    case -1592014310:
                    case 735558952:
                        if (C2287.f7432 < 0) {
                            iM2761 = (C0773.m3169("ᩳۖ") + i4) * (-121);
                            i5 = ((iM2761 ^ i3) * (-24307)) ^ (-1242574456);
                            i = 1456517055;
                            i6 = iM2761 ^ i;
                        } else {
                            int iM2763 = C0619.m2761("ܶܽ") ^ i3;
                            i5 = ((iM2763 ^ i4) * 27683) ^ 1439045799;
                            i6 = iM2763 ^ 1127381386;
                            c18459 = null;
                        }
                        break;
                    case -1217347536:
                    case 1913980781:
                        C13021.m32450(c0560, this.f21170, c5564);
                        if (C0862.f3233 != 0) {
                            iM2761 = C0619.m2761("᩶ۡ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-17001)) ^ 1419896533;
                            i = 2055120857;
                        } else {
                            iM2761 = C0619.m2761("ܿ᩵") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-26137)) ^ 1264702216;
                            i = -1224910950;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case -1211427845:
                    case -221397743:
                        c5564.f19335 = z;
                        if (C23916.f77426 > 0) {
                            c18459 = new C18459();
                            if (C0862.f3233 == 0) {
                                c0560 = new C0560(c18459);
                                if (C4238.f15451 >= 0) {
                                    iM2761 = C0619.m2761("ۡۡ") ^ i3;
                                    i5 = ((iM2761 ^ i4) * 27863) ^ 383970731;
                                    i = -1227375043;
                                } else {
                                    iM2761 = C0619.m2761("ܳ᩷") ^ i4;
                                    i5 = ((iM2761 ^ i3) * 8545) ^ (-903972701);
                                    i = -121607365;
                                }
                                i6 = iM2761 ^ i;
                            }
                        } else {
                            int iM2764 = C0619.m2761("ܶܽ") ^ i3;
                            i5 = ((iM2764 ^ i4) * 27683) ^ 1439045799;
                            i6 = iM2764 ^ 1127381386;
                            c18459 = null;
                        }
                        break;
                    case -1050658149:
                    case 156628428:
                        if (C3033.f9831 < 0) {
                            int iM2765 = C0619.m2761("ܶܽ") ^ i3;
                            i5 = ((iM2765 ^ i4) * 27683) ^ 1439045799;
                            i6 = iM2765 ^ 1127381386;
                            c18459 = null;
                        } else {
                            iM2761 = C0619.m2761("ۡۡ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 27863) ^ 383970731;
                            i = -1227375043;
                            i6 = iM2761 ^ i;
                        }
                        break;
                    case -532468239:
                    case 1596892572:
                        C17202.m40372();
                        iM2761 = C0619.m2761("ۡۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27863) ^ 383970731;
                        i = -1227375043;
                        i6 = iM2761 ^ i;
                        break;
                    case 74647594:
                    case 802909087:
                        z = true;
                        if (C2966.m9664()) {
                            iM2761 = C0619.m2761("ۗ֫") ^ i4;
                            i5 = ((iM2761 ^ i3) * 20353) ^ 897224004;
                            i = 2014900567;
                        } else {
                            iM2761 = C0619.m2761("ۡۡ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 27863) ^ 383970731;
                            i = -1227375043;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case 397248289:
                    case 1558401526:
                        this.f21173 = C1080.m4058(c184510);
                        break;
                    case 1439197416:
                    case 1840329973:
                        C3448.m11248();
                        break;
                    case 2091130245:
                    case 2107753188:
                        if (!C3077.f9998) {
                        }
                        c5564 = new C5564();
                        if (C4282.f15546 <= 0) {
                            iM2761 = C0619.m2761("ۡۡ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 27863) ^ 383970731;
                            i = -1227375043;
                        } else {
                            iM2761 = (C0619.m2761("ܳ᩺") ^ i3) * 45;
                            i5 = ((iM2761 ^ i4) * (-16383)) ^ (-516069724);
                            i = -1093158020;
                        }
                        i6 = iM2761 ^ i;
                        break;
                        break;
                    default:
                        this.f21174 = C1080.m4058(c18459);
                        if (C3779.f12953 > 0) {
                            c184510 = new C18459();
                            if (C20932.m47848() == 0) {
                                C13021.m32450(new C0560(c184510), this.f21172, c5564);
                                if (C1343.f4799 == 0) {
                                    iM2761 = (i4 - C0619.m2761("᩹ۘ")) * 99;
                                    i5 = ((iM2761 ^ i3) * 9345) ^ 681021382;
                                    i = -1191871144;
                                    i6 = iM2761 ^ i;
                                    break;
                                }
                            }
                            int iM2766 = C0619.m2761("ܶܽ") ^ i3;
                            i5 = ((iM2766 ^ i4) * 27683) ^ 1439045799;
                            i6 = iM2766 ^ 1127381386;
                            c18459 = null;
                        }
                        break;
                }
                return;
            }
            int iM2767 = C0619.m2761("ۚۢ") ^ i4;
            i5 = ((iM2767 ^ i3) * 30237) ^ 1897006375;
            i6 = iM2767 ^ (-704910554);
        }
    }

    public C6237(ActivityC3999 activityC3999, InterfaceC10122 interfaceC10122, InterfaceC10122 interfaceC10123, C8230 c8230) {
        int i = -703156405;
        int i2 = C3734.f12817;
        int i3 = C1146.f4234;
        this.f21171 = activityC3999;
        this.f21170 = interfaceC10122;
        this.f21172 = interfaceC10123;
        this.f21175 = c8230;
        int iM2761 = (C0619.m2761("ۗۖ") ^ i3) * 115;
        int i4 = ((iM2761 ^ i2) * (-10011)) ^ (-1152504103);
        int i5 = 1475861482;
        while (true) {
            i = (iM2761 ^ i5) ^ (i4 & (((i ^ i2) * 16179) >> 31));
            switch (i) {
                case -2030177499:
                case 1021211585:
                    C13473.m33144();
                    C3734.m12152();
                    iM2761 = C0773.m3169("᩷᩹") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-19079)) ^ 576229121;
                    i5 = -426205138;
                    break;
                case -1981666585:
                case -222132013:
                    C2288.m7767();
                    if (!RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("֡ᩴ") + i3) * 83;
                        i4 = ((iM2761 ^ i2) * (-10441)) ^ 100089886;
                        i5 = 189059758;
                    } else {
                        iM2761 = C0773.m3169("᩷᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19079)) ^ 576229121;
                        i5 = -426205138;
                    }
                    break;
                case -1647664574:
                case 291599533:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("ܰۘ") + i3) * (-27);
                        i4 = ((iM2761 ^ i2) * (-16259)) ^ (-181743107);
                        i5 = 264402977;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ᩳۡ")) * 79;
                        i4 = ((iM2761 ^ i3) * (-4503)) ^ 338411305;
                        i5 = -316296476;
                    }
                    break;
                case 133344945:
                case 1826137395:
                    C1146.m4231();
                    if (C3448.f11240 < 0) {
                        iM2761 = (C0773.m3169("֡ᩴ") + i3) * 83;
                        i4 = ((iM2761 ^ i2) * (-10441)) ^ 100089886;
                        i5 = 189059758;
                    } else {
                        iM2761 = (C0773.m3169("ۜۢ") + i2) * (-103);
                        i4 = ((iM2761 ^ i3) * (-24665)) ^ (-1680469753);
                        i5 = 1720015649;
                    }
                    break;
                case 303372129:
                case 1469449239:
                    return;
                case 1344827938:
                case 1667357574:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("֡ᩴ") + i3) * 83;
                        i4 = ((iM2761 ^ i2) * (-10441)) ^ 100089886;
                        i5 = 189059758;
                    } else {
                        iM2761 = (C0619.m2761("ۙ۟") + i2) * (-41);
                        i4 = ((iM2761 ^ i3) * (-28043)) ^ 45654899;
                        i5 = -756464742;
                    }
                    break;
                default:
                    C3077.m10041();
                    C2419.m8174();
                    throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C1783.m6242(this, this.f21171);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0487.m2362(this);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC3999 activityC3999 = null;
        int i = -304448009;
        int i2 = C1542.f5343;
        int i3 = C1080.f3865;
        int iM2761 = (i3 - C0619.m2761("ۧۛ")) * 49;
        int i4 = ((iM2761 ^ i2) * 11445) ^ (-1452602529);
        int i5 = -1223215984;
        while (true) {
            i = ((((i ^ i2) * 29521) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2029431592:
                case -759511465:
                    RunnableC3055.m9933();
                    iM2761 = C0773.m3169("ܳۗ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 16353) ^ (-540119965);
                    i5 = -1231860145;
                    break;
                case -1530902266:
                case 177844653:
                    C2310.m7813();
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0773.m3169("ۗܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17567)) ^ 158539895;
                        i5 = 1550833932;
                    } else {
                        iM2761 = C0773.m3169("ܳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16353) ^ (-540119965);
                        i5 = -1231860145;
                    }
                    break;
                case -1450226181:
                case 2086292126:
                    C0269.m1775();
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("ۗۤ") + i3) * (-5);
                        i4 = ((iM2761 ^ i2) * (-3197)) ^ (-1281142050);
                        i5 = -522772502;
                    } else {
                        iM2761 = C0773.m3169("ܳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16353) ^ (-540119965);
                        i5 = -1231860145;
                    }
                    break;
                case -1287412097:
                case 1148090556:
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("֡᩵") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * 28055) ^ (-615950272);
                        i5 = -486486848;
                    } else {
                        iM2761 = C0773.m3169("ۗܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17567)) ^ 158539895;
                        i5 = 1550833932;
                    }
                    break;
                case -640240984:
                case 125724857:
                    RunnableC3055.m9930(activityC3999, exc, null);
                    break;
                case -198815670:
                case 344381712:
                    if (C1080.m4050()) {
                        iM2761 = C0773.m3169("ۛܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-25753)) ^ (-1249951416);
                        i5 = -833539410;
                    } else {
                        iM2761 = C0773.m3169("ۗܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17567)) ^ 158539895;
                        i5 = 1550833932;
                    }
                    break;
                case 97298204:
                case 1442719156:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۗۤ") + i3) * (-5);
                        i4 = ((iM2761 ^ i2) * (-3197)) ^ (-1281142050);
                        i5 = -522772502;
                    } else {
                        iM2761 = (C0773.m3169("ۤܰ") + i2) * (-67);
                        i4 = ((iM2761 ^ i3) * (-23255)) ^ (-1123455989);
                        i5 = -560874084;
                    }
                    break;
                case 355975161:
                case 2132171724:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۨۧ")) * 33;
                        i4 = ((iM2761 ^ i2) * (-24463)) ^ 1308536880;
                        i5 = 877591959;
                    } else {
                        iM2761 = C0619.m2761("ܰᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4601)) ^ 1575598116;
                        i5 = 480061729;
                    }
                    break;
                case 362894980:
                case 1623728639:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ܳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16353) ^ (-540119965);
                        i5 = -1231860145;
                    } else {
                        iM2761 = (C0619.m2761("۬֡") ^ i2) * (-19);
                        i4 = ((iM2761 ^ i3) * 17143) ^ (-906524015);
                        i5 = 2045557359;
                    }
                    break;
                case 433357881:
                case 1533300624:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("ܳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16353) ^ (-540119965);
                        i5 = -1231860145;
                    } else {
                        iM2761 = C0619.m2761("᩷ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32301)) ^ 361320567;
                        i5 = -1940479990;
                    }
                    break;
                case 601305667:
                case 1232824644:
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("ᩳ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23671)) ^ 1621323637;
                        i5 = 1048499249;
                    } else {
                        iM2761 = C0773.m3169("ۗܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17567)) ^ 158539895;
                        i5 = 1550833932;
                    }
                    break;
                case 791304338:
                case 1445665085:
                    if (C1080.f3865 < 0) {
                        iM2761 = C0773.m3169("ۗܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17567)) ^ 158539895;
                        i5 = 1550833932;
                    } else {
                        iM2761 = C0619.m2761("ܽ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23179)) ^ (-1235896171);
                        i5 = -308187544;
                    }
                    break;
                case 1165921587:
                case 1463012783:
                    activityC3999 = this.f21171;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۨۧ")) * 33;
                        i4 = ((iM2761 ^ i2) * (-24463)) ^ 1308536880;
                        i5 = 877591959;
                    } else {
                        iM2761 = C0619.m2761("֫ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10769) ^ 57268513;
                        i5 = -1867004816;
                    }
                    break;
                case 1442582606:
                case 1883842267:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("ۗۤ") + i3) * (-5);
                        i4 = ((iM2761 ^ i2) * (-3197)) ^ (-1281142050);
                        i5 = -522772502;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֨᩸")) * 47;
                        i4 = ((iM2761 ^ i2) * (-25621)) ^ (-2066875195);
                        i5 = 482388216;
                    }
                    break;
                case 1985779676:
                case 1998346879:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("ۗۤ") + i3) * (-5);
                        i4 = ((iM2761 ^ i2) * (-3197)) ^ (-1281142050);
                        i5 = -522772502;
                    } else {
                        iM2761 = C0619.m2761("۫᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7971) ^ 726659618;
                        i5 = -1626808645;
                    }
                    break;
                default:
                    C17202.m40372();
                    C2966.m9664();
                    break;
            }
            return;
        }
    }
}
