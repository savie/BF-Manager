package l;

import android.view.View;
import android.widget.Button;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A1FQ */
/* JADX INFO: loaded from: classes3.dex */
public class C1322 extends AbstractC18900 {

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f4752 = 0;

    /* JADX INFO: renamed from: ᩴۗۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f4753 = {9003, -21917, 29357, -17588, -2791, -2794, -2797, -2790, 7135, 18022, 18020, 18047, 18041, 18020, 18047, 18018, 18031, 17987, 18020, 18042, 18019, 18020, 18042, 18021, 18046, 18039, 17959, 18032, 18047, 18042, 18035, 17960, 17960, 17974, 18002, 18041, 18017, 18040, 18042, 18041, 18039, 18034, 17974, 17951, 18042, 18041, 18037, 18039, 18018, 18047, 18041, 18040, 17989, 18014, 18007, 17959, 17951, 17989, 18019, 18037, 18037, 18035, 18021, 18021, 17975, 17951, 18000, 18047, 18042, 18035, 17974, 17989, 18014, 18007, 17959, 17974, 18037, 18046, 18035, 18037, 18045, 17974, 18032, 18039, 18047, 18042, 18035, 18034, 17964, 17974, 18035, 18030, 18022, 18035, 18037, 18018, 18035, 18034, 17963, 17978, 17974, 18033, 18041, 18018, 17963, 17951, 17989, 18035, 18020, 18016, 18035, 18020, 17974, 18020, 18035, 18018, 18019, 18020, 18040, 18035, 18034, 17974, 18014, 17986, 17986, 17990, 17974, 17974, 17951, 17988, 18035, 18034, 18047, 18020, 18035, 18037, 18018, 17974, 18018, 18041, 17974, 5049, 8156, 8147, 8150, 8159, -29420, -27904, 19399, 6744, -5783, -1831, 4532, 25000, 25019, 25004, 25005, 25015, 25009, 25008, 24976, 25023, 25011, 25019, 25000, 25019, 25004, 25005, 25015, 25009, 25008, 24983, 25008, 25016, 25009, 6684, 3711, 6163, 25086, 14645, 16330, 7089, -5706, 13017, 15919};

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f4754 = true;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f4755;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        int i = -1931152447;
        int i2 = C3690.f12684;
        int i3 = C2354.f7599;
        int iM2761 = (C0619.m2761("᩸ۘ") + i3) * (-13);
        int i4 = ((iM2761 ^ i2) * (-21637)) ^ 468269631;
        int i5 = -994280208;
        while (true) {
            i = ((((i ^ i2) * 31735) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1872403779:
                case -134974046:
                    C20932.m47848();
                    break;
                case -1658853248:
                case 1167657184:
                    C8224.m22123(main, this.f4755, C21576.m49092());
                    iM2761 = C0773.m3169("᩵ۗ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 15629) ^ (-1943500577);
                    i5 = -1818082529;
                    break;
                case -1482034998:
                case 1012785626:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("ۢ۠") + i2) * (-95);
                        i4 = ((iM2761 ^ i3) * 263) ^ 828160547;
                        i5 = -496456100;
                    } else {
                        iM2761 = C0619.m2761("ۧܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5159) ^ 1201673115;
                        i5 = 374273;
                    }
                    break;
                case -1406820779:
                case 1958277304:
                    C2966.m9664();
                    if (C1783.m6232()) {
                        iM2761 = C0619.m2761("ۘۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-727)) ^ (-1592611252);
                        i5 = -1405275322;
                    } else {
                        iM2761 = (C0619.m2761("ۢ۠") + i2) * (-95);
                        i4 = ((iM2761 ^ i3) * 263) ^ 828160547;
                        i5 = -496456100;
                    }
                    break;
                case -1186569136:
                case 258973870:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ܽ۟")) * 47;
                        i4 = ((iM2761 ^ i2) * (-25405)) ^ (-1795953669);
                        i5 = -170935062;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10361) ^ 1031418078;
                        i5 = 1827133527;
                    }
                    break;
                case -954239976:
                case 63009165:
                    break;
                case -585467445:
                case -548094505:
                    if (C3690.m11994(c12187)) {
                        iM2761 = (C0773.m3169("ܺۤ") ^ i2) * 23;
                        i4 = ((iM2761 ^ i3) * 5089) ^ 1340112470;
                        i5 = 989586918;
                    } else {
                        iM2761 = C0773.m3169("᩵ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15629) ^ (-1943500577);
                        i5 = -1818082529;
                    }
                    break;
                case -575067188:
                case 1546264645:
                    if (C1343.m4943()) {
                        iM2761 = C0773.m3169("ۙܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17827)) ^ 319122961;
                        i5 = -509139146;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽ۟")) * 47;
                        i4 = ((iM2761 ^ i2) * (-25405)) ^ (-1795953669);
                        i5 = -170935062;
                    }
                    break;
                case -369214907:
                case 375160529:
                    if (C2287.m7745() <= 0) {
                        iM2761 = C0619.m2761("ۧܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5159) ^ 1201673115;
                        i5 = 374273;
                    } else {
                        iM2761 = (C0619.m2761("᩸۬") + i3) * (-41);
                        i4 = ((iM2761 ^ i2) * 16525) ^ (-176114811);
                        i5 = -1137454567;
                    }
                    break;
                case -242515614:
                case 654980033:
                    C3099.m10095();
                    C1343.m4943();
                    iM2761 = C0619.m2761("ۧܳ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 5159) ^ 1201673115;
                    i5 = 374273;
                    break;
                case -89195383:
                case 1377073129:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("ܺۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28417) ^ 1637356173;
                        i5 = 435786879;
                    } else {
                        iM2761 = (C0773.m3169("᩺֫") + i3) * 93;
                        i4 = ((iM2761 ^ i2) * (-30201)) ^ 1823393261;
                        i5 = 765508123;
                    }
                    break;
                case -47462697:
                case 1886435315:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("ۢ۠") + i2) * (-95);
                        i4 = ((iM2761 ^ i3) * 263) ^ 828160547;
                        i5 = -496456100;
                    } else {
                        iM2761 = C0773.m3169("֨᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30155)) ^ (-660188002);
                        i5 = -2042839405;
                    }
                    break;
                case 539697859:
                case 1097465460:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ܺۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28417) ^ 1637356173;
                        i5 = 435786879;
                    } else {
                        iM2761 = C0773.m3169("ۧۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32393)) ^ (-2110732003);
                        i5 = 1685050155;
                    }
                    break;
                case 680125264:
                case 1520193194:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ܺۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28417) ^ 1637356173;
                        i5 = 435786879;
                    } else {
                        iM2761 = C0619.m2761("ۖܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11607)) ^ (-1103752479);
                        i5 = -1186040116;
                    }
                    break;
                case 690922616:
                case 767871085:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("ۧܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5159) ^ 1201673115;
                        i5 = 374273;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۠ۖ")) * q.h;
                        i4 = ((iM2761 ^ i3) * (-28277)) ^ (-1084990302);
                        i5 = 1097875989;
                    }
                    break;
                case 1189174528:
                case 1504644678:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("ۢ۠") + i2) * (-95);
                        i4 = ((iM2761 ^ i3) * 263) ^ 828160547;
                        i5 = -496456100;
                    } else {
                        iM2761 = C0773.m3169("ۡ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13577) ^ (-800895484);
                        i5 = 2140824383;
                    }
                    break;
                case 1850278688:
                case 2039453583:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۧܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5159) ^ 1201673115;
                        i5 = 374273;
                    } else {
                        iM2761 = (C0773.m3169("ܳۛ") ^ i3) * 89;
                        i4 = ((iM2761 ^ i2) * 11093) ^ 1681503206;
                        i5 = -1997197432;
                    }
                    break;
                default:
                    C17202.m40372();
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0773.m3169("ܺۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28417) ^ 1637356173;
                        i5 = 435786879;
                    } else {
                        iM2761 = C0619.m2761("ۧܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5159) ^ 1201673115;
                        i5 = 374273;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46049;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01c3 A[PHI: r3 r9 r10 r11 r13 r14 r15
      0x01c3: PHI (r3v3 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v5 java.lang.String)
     binds: [B:49:0x01c1, B:38:0x0147, B:17:0x00a0, B:13:0x007f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:49:0x01c1, B:38:0x0147, B:17:0x00a0, B:13:0x007f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:49:0x01c1, B:38:0x0147, B:17:0x00a0, B:13:0x007f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:49:0x01c1, B:38:0x0147, B:17:0x00a0, B:13:0x007f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:49:0x01c1, B:38:0x0147, B:17:0x00a0, B:13:0x007f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:49:0x01c1, B:38:0x0147, B:17:0x00a0, B:13:0x007f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:49:0x01c1, B:38:0x0147, B:17:0x00a0, B:13:0x007f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0216 A[PHI: r2 r5 r7 r8
      0x0216: PHI (r2v4 java.lang.String[]) = (r2v2 java.lang.String[]), (r2v2 java.lang.String[]), (r2v7 java.lang.String[]) binds: [B:57:0x0214, B:53:0x01f5, B:88:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r5v4 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v6 short[]) binds: [B:57:0x0214, B:53:0x01f5, B:88:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r7v5 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:57:0x0214, B:53:0x01f5, B:88:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:57:0x0214, B:53:0x01f5, B:88:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0264 A[PHI: r1 r4 r16 r21
      0x0264: PHI (r1v4 java.lang.String) = 
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v3 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
     binds: [B:65:0x0262, B:61:0x0244, B:34:0x0126, B:25:0x00c2, B:19:0x00a4, B:17:0x00a0, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:65:0x0262, B:61:0x0244, B:34:0x0126, B:25:0x00c2, B:19:0x00a4, B:17:0x00a0, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x0262, B:61:0x0244, B:34:0x0126, B:25:0x00c2, B:19:0x00a4, B:17:0x00a0, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:65:0x0262, B:61:0x0244, B:34:0x0126, B:25:0x00c2, B:19:0x00a4, B:17:0x00a0, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        int iM3169;
        int i;
        int i2;
        int i3 = RunnableC0334.f1808;
        int i4 = C0773.f2792;
        int iM2761 = C0619.m2761("ܳۢ") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-9899)) ^ 706105729;
        String strM8166 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2761 ^ (-22086683);
        int iM31610 = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -2038916122;
        char c = 0;
        String[] strArr = null;
        String strM4939 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 3015) >> 31));
            switch (i14) {
                case -1942985405:
                case 776156959:
                    sArr = f4753;
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 6933) ^ 926112962;
                        i2 = 1605612096;
                    } else {
                        iM3169 = C0773.m3169("ۢܶ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4091)) ^ 711717511;
                        i2 = 1784954250;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1858680388:
                case -557554880:
                    strArr = new String[]{m43840(strM4939)};
                    sArr3 = f4753;
                    if (C3448.m11248() != 0) {
                        iM3169 = C0619.m2761("᩵ۘ") ^ i4;
                        i = ((iM3169 ^ i3) * 597) ^ 792383764;
                        i2 = 1844495602;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31611 = C0773.m3169("֨ۘ") ^ i3;
                        i5 = ((iM31611 ^ i4) * (-6217)) ^ 1345661238;
                        i6 = iM31611 ^ 2133677922;
                    }
                    break;
                case -1739329584:
                case 78403898:
                    iM31610 = C0773.m3169(strM8166);
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 6933) ^ 926112962;
                        i2 = 1605612096;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩷") + i4) * 33;
                        i = ((iM3169 ^ i3) * (-4991)) ^ 122606999;
                        i2 = -1345301434;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1370590764:
                case -444035207:
                    i11 = 8122;
                    iM3169 = (C0619.m2761("ۜ֡") + i4) * (-73);
                    i = ((iM3169 ^ i3) * 7809) ^ 1168216410;
                    i2 = 1802374798;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1134610060:
                case 974673979:
                    i7 = s + 9012;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("᩵ۘ") ^ i4;
                        i = ((iM3169 ^ i3) * 597) ^ 792383764;
                        i2 = 1844495602;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩵ۖ")) * 109;
                        i = ((iM3169 ^ i3) * (-28091)) ^ 240786295;
                        i2 = -1413062628;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -863601122:
                case 1767751591:
                    return C3734.m12148(2099639747 ^ iM31610, strArr);
                case -844366656:
                case 1742676116:
                    i8 = i7 * i7;
                    i9 = s * s;
                    i10 = 81216144;
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("ۘ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-16803)) ^ 2043273772;
                        i2 = 1299569525;
                    } else {
                        iM3169 = (C0773.m3169("۫۠") ^ i3) * 99;
                        i = ((iM3169 ^ i4) * 2157) ^ (-1318613747);
                        i2 = 436462613;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -765317637:
                case -577058516:
                    strM4939 = C1343.m4939(sArr2, i12, i13, i11);
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 6933) ^ 926112962;
                        i2 = 1605612096;
                    } else {
                        iM3169 = C0773.m3169("ۛ۟") ^ i3;
                        i = ((iM3169 ^ i4) * 28127) ^ 1700492354;
                        i2 = -344242453;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -756473701:
                case 1780218125:
                    int i15 = i9 + i10;
                    if ((i15 + i15) - i8 >= 0) {
                        iM3169 = (C0773.m3169("֨ۗ") + i4) * 69;
                        i = ((iM3169 ^ i3) * 4743) ^ (-679375636);
                        i2 = 24063809;
                    } else {
                        iM3169 = C0773.m3169("᩹᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 25135) ^ 1142390520;
                        i2 = 744465025;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -734273249:
                case 2101800828:
                    s = sArr[c];
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("᩵ۘ") ^ i4;
                        i = ((iM3169 ^ i3) * 597) ^ 792383764;
                        i2 = 1844495602;
                    } else {
                        iM3169 = C0773.m3169("ᩴۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 11315) ^ (-1575679184);
                        i2 = 262446103;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -732628283:
                case 527271768:
                    if (C3077.m10041()) {
                        iM3169 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 6933) ^ 926112962;
                        i2 = 1605612096;
                    } else {
                        iM3169 = C0773.m3169("ۖܶ") ^ i3;
                        i = ((iM3169 ^ i4) * (-7733)) ^ (-2074524937);
                        i2 = 808988942;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -587781484:
                case 92738785:
                    C0773.m3161();
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("ۘ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-16803)) ^ 2043273772;
                        i2 = 1299569525;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ᩳۤ")) * 87;
                        i = ((iM3169 ^ i3) * (-28519)) ^ 1192860177;
                        i2 = -1190269478;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 7698887:
                case 1779219484:
                    C2419.m8174();
                    return null;
                case 227157147:
                case 1006589100:
                    sArr2 = f4753;
                    i12 = 142;
                    i13 = 4;
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ۘ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-16803)) ^ 2043273772;
                        i2 = 1299569525;
                    } else {
                        iM3169 = C0773.m3169("᩺ۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-17325)) ^ (-634006311);
                        i2 = -1593872690;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 276287084:
                case 1271916978:
                    C1826.m6301();
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 6933) ^ 926112962;
                        i2 = 1605612096;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-16803)) ^ 2043273772;
                        i2 = 1299569525;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 419076535:
                case 2137443722:
                    c = 141;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("ۨ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 6933) ^ 926112962;
                        i2 = 1605612096;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩵") + i3) * (-125);
                        i = ((iM3169 ^ i4) * (-28623)) ^ (-874116002);
                        i2 = -1025119208;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 434312019:
                case 1030782526:
                    i11 = 43328;
                    iM3169 = (C0619.m2761("ۜ֡") + i4) * (-73);
                    i = ((iM3169 ^ i3) * 7809) ^ 1168216410;
                    i2 = 1802374798;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 991025532:
                case 2026556197:
                    C1146.m4231();
                    C1343.m4943();
                    iM3169 = C0619.m2761("ۨ᩻") ^ i3;
                    i = ((iM3169 ^ i4) * 6933) ^ 926112962;
                    i2 = 1605612096;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM8166 = C2419.m8166(sArr3, 146, 3, i11);
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ۘ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-16803)) ^ 2043273772;
                        i2 = 1299569525;
                    } else {
                        iM3169 = C0619.m2761("۬ۢ") ^ i4;
                        i = ((iM3169 ^ i3) * (-9673)) ^ (-933656934);
                        i2 = 1983053029;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0139 A[PHI: r12 r13 r14
      0x0139: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:40:0x0137, B:18:0x008b, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:40:0x0137, B:18:0x008b, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:40:0x0137, B:18:0x008b, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01dc A[PHI: r8 r22
      0x01dc: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:52:0x01da, B:32:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r22v5 int) = (r22v4 int), (r22v3 int) binds: [B:52:0x01da, B:32:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x020e A[PHI: r3 r6 r9 r10
      0x020e: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:56:0x020c, B:36:0x0117, B:12:0x0069, B:9:0x0063, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:56:0x020c, B:36:0x0117, B:12:0x0069, B:9:0x0063, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v5 int) binds: [B:56:0x020c, B:36:0x0117, B:12:0x0069, B:9:0x0063, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r10v3 short) = (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v5 short) binds: [B:56:0x020c, B:36:0x0117, B:12:0x0069, B:9:0x0063, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x025c A[PHI: r2 r4 r5 r15 r16 r17
      0x025c: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:64:0x025a, B:60:0x023e, B:28:0x00d0, B:24:0x00ae, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:64:0x025a, B:60:0x023e, B:28:0x00d0, B:24:0x00ae, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:64:0x025a, B:60:0x023e, B:28:0x00d0, B:24:0x00ae, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:64:0x025a, B:60:0x023e, B:28:0x00d0, B:24:0x00ae, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x025a, B:60:0x023e, B:28:0x00d0, B:24:0x00ae, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:64:0x025a, B:60:0x023e, B:28:0x00d0, B:24:0x00ae, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        int iM3169;
        int i;
        int i2;
        int i3 = RunnableC0334.f1808;
        int i4 = C1564.f5401;
        int iM31610 = C0773.m3169("᩷ۜ") ^ i3;
        int i5 = ((iM31610 ^ i4) * (-11003)) ^ (-732264212);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ 1952940649;
        String strM1785 = null;
        int iM2761 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = -2076467426;
        int i15 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 21603) >> 31));
            switch (i14) {
                case -2097133465:
                case -2021623915:
                    i11 = 32348;
                    iM3169 = C0773.m3169("ܺ۬") ^ i3;
                    i = ((iM3169 ^ i4) * (-26893)) ^ (-420666934);
                    i2 = -467731996;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1986756050:
                case 871930510:
                    C0862.m3503();
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0773.m3169("ۧۖ") ^ i4) * (-39);
                        i = ((iM3169 ^ i3) * 10079) ^ (-1603404351);
                        i2 = 1796434664;
                    } else {
                        iM3169 = C0619.m2761("ܶ۟") ^ i3;
                        i = ((iM3169 ^ i4) * (-12159)) ^ (-1592703115);
                        i2 = 283524751;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1706985611:
                case 1451700062:
                    C3033.m9854(this, 2120731241 ^ iM2761);
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("֨ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-13339)) ^ 413840406;
                        i2 = -48021316;
                    } else {
                        iM3169 = C0773.m3169("᩸᩸") ^ i4;
                        i = ((iM3169 ^ i3) * 9177) ^ (-1247489290);
                        i2 = -1059185170;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1568665370:
                case -504292286:
                    c = 0;
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0773.m3169("ۡ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 27221) ^ 128710869;
                        i2 = -1250481887;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * 24625) ^ (-61984019);
                        i2 = -1995626667;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1428033821:
                case 36408725:
                    strM1785 = C0269.m1785(sArr3, i7, i8, i11);
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("ۡ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 27221) ^ 128710869;
                        i2 = -1250481887;
                    } else {
                        iM3169 = (C0773.m3169("ܰ᩵") ^ i3) * (-49);
                        i = ((iM3169 ^ i4) * (-12687)) ^ (-1021333115);
                        i2 = -1414013522;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1329990967:
                case 626599465:
                    C2702.m8876();
                    C3492.m11488();
                    iM3169 = (C0773.m3169("ۧۖ") ^ i4) * (-39);
                    i = ((iM3169 ^ i3) * 10079) ^ (-1603404351);
                    i2 = 1796434664;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1268499275:
                case -929298366:
                    if (C13473.m33144()) {
                        iM3169 = C0773.m3169("ۡ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 27221) ^ 128710869;
                        i2 = -1250481887;
                    } else {
                        iM3169 = C0619.m2761("ܶۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4371)) ^ (-586760628);
                        i2 = 1232051549;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1169509539:
                case 139873463:
                    sArr3 = f4753;
                    i7 = 4;
                    i8 = 4;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("ۡ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 27221) ^ 128710869;
                        i2 = -1250481887;
                    } else {
                        iM3169 = C0773.m3169("ܶᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-30955)) ^ (-2119363108);
                        i2 = 932481700;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1157583661:
                case -500806617:
                    iM2761 = C0619.m2761(C3690.m11996(sArr2, i12, i13, i11));
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ܶۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4371)) ^ (-586760628);
                        i2 = 1232051549;
                    } else {
                        iM3169 = C0773.m3169("ۗ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-2661)) ^ (-505161932);
                        i2 = 1664616480;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1129174763:
                case -1070786949:
                    s = sArr[c];
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ܶۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4371)) ^ (-586760628);
                        i2 = 1232051549;
                    } else {
                        iM3169 = C0773.m3169("۬۟") ^ i4;
                        i = ((iM3169 ^ i3) * 10263) ^ (-473909617);
                        i2 = 801188222;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -865246104:
                case 1431705022:
                    i15 = s * s;
                    i9 = 43877376;
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("֨ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-13339)) ^ 413840406;
                        i2 = -48021316;
                    } else {
                        iM3169 = C0773.m3169("۬ܽ") ^ i3;
                        i = ((iM3169 ^ i4) * 9925) ^ 71644950;
                        i2 = 1878017431;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -807393500:
                case -201307933:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ܶ۟") ^ i3;
                        i = ((iM3169 ^ i4) * (-12159)) ^ (-1592703115);
                        i2 = 283524751;
                    } else {
                        iM3169 = C0619.m2761("ܶۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4371)) ^ (-586760628);
                        i2 = 1232051549;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -777920039:
                case 467457497:
                    sArr2 = f4753;
                    i12 = 1;
                    i13 = 3;
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("۟ۘ") ^ i4;
                        i = ((iM3169 ^ i3) * 18851) ^ 1580114683;
                        i2 = -1733200307;
                    } else {
                        iM3169 = (C0773.m3169("ۧۖ") ^ i4) * (-39);
                        i = ((iM3169 ^ i3) * 10079) ^ (-1603404351);
                        i2 = 1796434664;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -649859822:
                case 1104889827:
                    sArr = f4753;
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ۡ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 27221) ^ 128710869;
                        i2 = -1250481887;
                    } else {
                        iM3169 = (C0773.m3169("۟ۢ") + i4) * (-109);
                        i = ((iM3169 ^ i3) * 10627) ^ 1989088739;
                        i2 = 755391328;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -358848354:
                case 165928904:
                    i11 = 62847;
                    iM3169 = C0773.m3169("ܺ۬") ^ i3;
                    i = ((iM3169 ^ i4) * (-26893)) ^ (-420666934);
                    i2 = -467731996;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 491704178:
                case 1448726255:
                    int i16 = s + s2;
                    if ((i16 * i16) - i10 > 0) {
                        iM3169 = C0773.m3169("۬ۨ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4293)) ^ (-1929213454);
                        i2 = -48805030;
                    } else {
                        iM3169 = (C0619.m2761("ܽۢ") + i3) * (-55);
                        i = ((iM3169 ^ i4) * (-26587)) ^ 408284757;
                        i2 = -1726809814;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 500716344:
                case 758396904:
                    C2310.m7799(this, m43840(strM1785));
                    mo16839(0);
                    break;
                case 825729656:
                case 971426036:
                    C3033.m9845();
                    C2878.m9491();
                    break;
                default:
                    int i17 = i15 + i9;
                    i10 = i17 + i17;
                    s2 = 6624;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ܶۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4371)) ^ (-586760628);
                        i2 = 1232051549;
                    } else {
                        iM3169 = C0619.m2761("ۧۢ") ^ i4;
                        i = ((iM3169 ^ i3) * (-27033)) ^ (-1284205652);
                        i2 = 1742336538;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 mo4862(AbstractActivityC17204 abstractActivityC17204) {
        int i;
        boolean z;
        int iM2761;
        int i2;
        int i3;
        short[] sArr;
        int i4;
        String str;
        short[] sArr2;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        String str3;
        int iM2762;
        int i9;
        int i10;
        int iM3169;
        int i11;
        int i12;
        final C1322 c1322 = this;
        int iM2763 = 0;
        boolean z3 = false;
        C2361 c2361 = null;
        Object obj = null;
        DialogInterfaceOnClickListenerC7025 dialogInterfaceOnClickListenerC7025 = null;
        DialogInterfaceC8327 dialogInterfaceC8327M4860 = null;
        final Button buttonM2817 = null;
        final DialogInterfaceC8327 dialogInterfaceC8327M24917 = null;
        Button buttonM1782 = null;
        String strM11252 = null;
        int iM31610 = 0;
        String strM9670 = null;
        short s = 0;
        int i13 = 0;
        int i14 = 1330779529;
        int i15 = C3033.f9831;
        int i16 = C11235.f35427;
        int iM31611 = C0773.m3169("ᩴ᩸") ^ i16;
        int i17 = ((iM31611 ^ i15) * (-20001)) ^ 1873921595;
        int i18 = iM31611 ^ (-761517846);
        String str4 = null;
        StringBuilder sb = null;
        String strM11765 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i19 = 0;
        int i20 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i21 = 0;
        int i22 = 0;
        String strM43865 = null;
        String str5 = null;
        Button buttonM9932 = null;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * 12647) >> 31));
            switch (i14) {
                case -2074036026:
                case -1265488578:
                    i = iM2763;
                    z = z4;
                    obj = null;
                    C3492.m11487(c2361, iM31610 ^ 2118886776, null);
                    if (RunnableC3646.f12471) {
                        iM3169 = (i15 - C0619.m2761("ۢۧ")) * 59;
                        i11 = ((iM3169 ^ i16) * (-28073)) ^ (-1118221337);
                        i12 = -398364221;
                    } else {
                        iM3169 = (i15 - C0619.m2761("᩸ۡ")) * 109;
                        i11 = ((iM3169 ^ i16) * 31195) ^ (-960712039);
                        i12 = 810120095;
                    }
                    i18 = iM3169 ^ i12;
                    i17 = i11;
                    z4 = z;
                    iM2763 = i;
                    break;
                case -2047701423:
                case -280961746:
                    C23916.m53431(buttonM9932, z4);
                    C2375.m8070(buttonM9932, new ViewOnClickListenerC19221());
                    z4 = z4;
                    C2310.m7810(m43851(), dialogInterfaceC8327M24917, new C1038(2, buttonM9932));
                    if (((AbstractActivityC17204) C3200.m10534(dialogInterfaceC8327M24917.m22422())) == abstractActivityC17204) {
                        iM2762 = (i15 - C0773.m3169("᩺᩶")) * (-3);
                        i9 = ((iM2762 ^ i16) * 14253) ^ 1835316698;
                        i10 = 1632777362;
                        i18 = iM2762 ^ i10;
                        i17 = i9;
                        z4 = z4;
                    }
                    sb = sb;
                    sArr = sArr3;
                    i4 = i22;
                    str = str4;
                    sArr2 = sArr4;
                    str2 = str5;
                    i5 = i21;
                    int iM31612 = C0773.m3169("᩵۫") ^ i15;
                    i6 = iM2763;
                    i7 = ((iM31612 ^ i16) * 17909) ^ (-1007469135);
                    i8 = iM31612 ^ (-1629922439);
                    i22 = i4;
                    i21 = i5;
                    str5 = str2;
                    sArr3 = sArr;
                    i18 = i8;
                    i17 = i7;
                    sArr4 = sArr2;
                    str4 = str;
                    iM2763 = i6;
                    sb = sb;
                    z4 = z4;
                    break;
                case -1959760571:
                case 1176272234:
                    C20932.m47848();
                    C3690.m11987();
                    z4 = z4;
                    str4 = str4;
                    sArr4 = sArr4;
                    str5 = str5;
                    i21 = i21;
                    iM2761 = C0773.m3169("᩺ۗ") ^ i16;
                    i17 = ((iM2761 ^ i15) * (-18887)) ^ 1075493573;
                    i2 = 179193453;
                    i3 = iM2761 ^ i2;
                    i22 = i22;
                    i21 = i21;
                    str5 = str5;
                    iM2763 = iM2763;
                    sArr3 = sArr3;
                    z3 = z3;
                    i18 = i3;
                    sArr4 = sArr4;
                    str4 = str4;
                    c1322 = this;
                    sb = sb;
                    z4 = z4;
                    break;
                case -1878982548:
                case -1327319609:
                    i19 = 25054;
                    iM2761 = C0619.m2761("֨ۚ") ^ i16;
                    i17 = ((iM2761 ^ i15) * (-23893)) ^ (-231589959);
                    i2 = -939944210;
                    i3 = iM2761 ^ i2;
                    i22 = i22;
                    i21 = i21;
                    str5 = str5;
                    iM2763 = iM2763;
                    sArr3 = sArr3;
                    z3 = z3;
                    i18 = i3;
                    sArr4 = sArr4;
                    str4 = str4;
                    c1322 = this;
                    sb = sb;
                    z4 = z4;
                    break;
                case -1861063604:
                case 1089463729:
                    i6 = iM2763;
                    z4 = z4;
                    sb = sb;
                    str = str4;
                    sArr2 = sArr4;
                    sArr3 = f4753;
                    i21 = HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS;
                    i22 = 3;
                    if (RunnableC0334.f1808 > 0) {
                        int iM2764 = (C0619.m2761("ۗܺ") + i15) * 15;
                        i7 = ((iM2764 ^ i16) * 9869) ^ (-280648631);
                        i18 = iM2764 ^ (-1490859169);
                        i17 = i7;
                        sArr4 = sArr2;
                        str4 = str;
                        iM2763 = i6;
                        sb = sb;
                        z4 = z4;
                    }
                    z2 = z3 ? 1 : 0;
                    int iM2765 = C0619.m2761("۠֫") ^ i16;
                    i18 = iM2765 ^ 745980566;
                    i17 = ((iM2765 ^ i15) * 24731) ^ (-198683975);
                    sArr4 = sArr2;
                    str4 = str;
                    iM2763 = i6;
                    z3 = z2;
                    sb = sb;
                    z4 = z4;
                    break;
                case -1739632988:
                case -331219094:
                    C2023.m6964();
                    return null;
                case -1626024810:
                case -1153865536:
                    z4 = z4;
                    if (C1542.m5465(dialogInterfaceC8327M24917)) {
                        iM2762 = (C0773.m3169("᩸ۤ") ^ i16) * (-69);
                        i9 = ((iM2762 ^ i15) * (-3699)) ^ 1124161053;
                        i10 = 2047476635;
                        i18 = iM2762 ^ i10;
                        i17 = i9;
                        z4 = z4;
                    }
                    sb = sb;
                    sArr = sArr3;
                    i4 = i22;
                    str = str4;
                    sArr2 = sArr4;
                    str2 = str5;
                    i5 = i21;
                    int iM31613 = C0773.m3169("᩵۫") ^ i15;
                    i6 = iM2763;
                    i7 = ((iM31613 ^ i16) * 17909) ^ (-1007469135);
                    i8 = iM31613 ^ (-1629922439);
                    i22 = i4;
                    i21 = i5;
                    str5 = str2;
                    sArr3 = sArr;
                    i18 = i8;
                    i17 = i7;
                    sArr4 = sArr2;
                    str4 = str;
                    iM2763 = i6;
                    sb = sb;
                    z4 = z4;
                    break;
                case -1576821897:
                case 675824872:
                    i6 = iM2763;
                    z4 = z4;
                    short[] sArr5 = sArr4;
                    sb = sb;
                    C1783.m6234(sb, C2702.m8881(sArr5, i20, 1, i19));
                    C1783.m6234(sb, strM43865);
                    C1146.m4227(c2361, C1080.m4058(sb));
                    String str6 = str4;
                    RunnableC0334.m2055(c2361, str6);
                    if (C1080.f3865 < 0) {
                        int iM2766 = C0619.m2761("ۧܶ") ^ i15;
                        str = str6;
                        i17 = ((iM2766 ^ i16) * 26323) ^ 1149975544;
                        i18 = iM2766 ^ 371652929;
                        sArr4 = sArr5;
                        str4 = str;
                        iM2763 = i6;
                        sb = sb;
                        z4 = z4;
                    } else {
                        str = str6;
                        sArr2 = sArr5;
                        z2 = z3 ? 1 : 0;
                        int iM2767 = C0619.m2761("۠֫") ^ i16;
                        i18 = iM2767 ^ 745980566;
                        i17 = ((iM2767 ^ i15) * 24731) ^ (-198683975);
                        sArr4 = sArr2;
                        str4 = str;
                        iM2763 = i6;
                        z3 = z2;
                        sb = sb;
                        z4 = z4;
                    }
                    break;
                case -1467850339:
                case 1115591831:
                    i6 = iM2763;
                    z4 = z4;
                    sb = sb;
                    short[] sArr6 = sArr3;
                    int i23 = i21;
                    int i24 = i22;
                    str = str4;
                    sArr2 = sArr4;
                    short[] sArr7 = f4753;
                    z2 = z3 ? 1 : 0;
                    String strM7749 = C2287.m7749(sArr7, 164, 11, i19);
                    if (RunnableC3055.f9898 >= 0) {
                        i22 = i24;
                        i21 = i23;
                        sArr3 = sArr6;
                        str5 = strM7749;
                        int iM2768 = C0619.m2761("۠֫") ^ i16;
                        i18 = iM2768 ^ 745980566;
                        i17 = ((iM2768 ^ i15) * 24731) ^ (-198683975);
                        sArr4 = sArr2;
                        str4 = str;
                        iM2763 = i6;
                        z3 = z2;
                        sb = sb;
                        z4 = z4;
                    } else {
                        int iM31614 = (i15 - C0773.m3169("᩷۟")) * 21;
                        i22 = i24;
                        i21 = i23;
                        sArr4 = sArr2;
                        str4 = str;
                        sArr3 = sArr6;
                        str5 = strM7749;
                        i18 = iM31614 ^ 1707632960;
                        i17 = ((iM31614 ^ i16) * (-16123)) ^ 1757627989;
                        sb = sb;
                        z4 = z4;
                        iM2763 = i6;
                        z3 = z2 ? 1 : 0;
                    }
                    break;
                case -1429101380:
                case 1486404158:
                    int i25 = iM2763;
                    z4 = z4;
                    sb = sb;
                    short[] sArr8 = sArr3;
                    int i26 = i21;
                    int i27 = i22;
                    String str7 = str4;
                    short[] sArr9 = sArr4;
                    strM11765 = AbstractC3624.m11765(C0773.m3169(C2023.m6966(sArr8, i26, i27, i19)) ^ 2127335709);
                    int iM2769 = (C0619.m2761("᩹ܿ") + i16) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i17 = ((iM2769 ^ i15) * (-25397)) ^ 2068030201;
                    i21 = i26;
                    i22 = i27;
                    iM2763 = i25;
                    sArr3 = sArr8;
                    i18 = iM2769 ^ (-380709467);
                    sArr4 = sArr9;
                    str4 = str7;
                    sb = sb;
                    z4 = z4;
                    break;
                case -1345845884:
                case 2088481558:
                    C1080.m4050();
                    if (AbstractC3624.f12429 > 0) {
                        i = iM2763;
                        z = z4;
                        iM3169 = C0619.m2761("ۢܽ") ^ i15;
                        i11 = ((iM3169 ^ i16) * 20223) ^ 788025012;
                        i12 = -1447001509;
                        i18 = iM3169 ^ i12;
                        i17 = i11;
                        z4 = z;
                        iM2763 = i;
                    } else {
                        z4 = z4;
                        str4 = str4;
                        sArr4 = sArr4;
                        str5 = str5;
                        i21 = i21;
                        iM2761 = C0773.m3169("᩺ۗ") ^ i16;
                        i17 = ((iM2761 ^ i15) * (-18887)) ^ 1075493573;
                        i2 = 179193453;
                        i3 = iM2761 ^ i2;
                        i22 = i22;
                        i21 = i21;
                        str5 = str5;
                        iM2763 = iM2763;
                        sArr3 = sArr3;
                        z3 = z3;
                        i18 = i3;
                        sArr4 = sArr4;
                        str4 = str4;
                        c1322 = this;
                        sb = sb;
                        z4 = z4;
                    }
                    break;
                case -1277111317:
                case -793249762:
                    z4 = z4;
                    sb = sb;
                    sArr = sArr3;
                    i4 = i22;
                    str = str4;
                    sArr2 = sArr4;
                    str2 = str5;
                    i5 = i21;
                    iM2763 = 2097555623 ^ C0619.m2761(strM11252);
                    if (z5) {
                        int iM27610 = C0619.m2761("۠֨") ^ i15;
                        i22 = i4;
                        i21 = i5;
                        str5 = str2;
                        sArr3 = sArr;
                        i18 = iM27610 ^ (-785843593);
                        i17 = ((iM27610 ^ i16) * (-16151)) ^ 1065580231;
                        sArr4 = sArr2;
                        str4 = str;
                        z3 = false;
                    } else {
                        z3 = false;
                        int iM31615 = C0773.m3169("᩵۫") ^ i15;
                        i6 = iM2763;
                        i7 = ((iM31615 ^ i16) * 17909) ^ (-1007469135);
                        i8 = iM31615 ^ (-1629922439);
                        i22 = i4;
                        i21 = i5;
                        str5 = str2;
                        sArr3 = sArr;
                        i18 = i8;
                        i17 = i7;
                        sArr4 = sArr2;
                        str4 = str;
                        iM2763 = i6;
                    }
                    sb = sb;
                    z4 = z4;
                    break;
                case -1227247159:
                case -922519222:
                    z4 = z4;
                    String str8 = str5;
                    String strM43866 = c1322.m43865(str8);
                    C2361 c2361M3794 = C0950.m3794(abstractActivityC17204);
                    C11235.m28306(c2361M3794, z3);
                    sb = new StringBuilder();
                    int iM31616 = C0773.m3169("ۡ᩻") ^ i16;
                    i17 = ((iM31616 ^ i15) * 2461) ^ (-681150135);
                    i21 = i21;
                    i22 = i22;
                    iM2763 = iM2763;
                    sArr3 = sArr3;
                    i18 = iM31616 ^ (-770885281);
                    str5 = str8;
                    sArr4 = sArr4;
                    str4 = strM43866;
                    c2361 = c2361M3794;
                    z4 = z4;
                    break;
                case -1141586166:
                case 642438578:
                    C2375.m8070(buttonM1782, new ViewOnClickListenerC18937(dialogInterfaceC8327M24917, 1));
                    buttonM9932 = RunnableC3055.m9932(dialogInterfaceC8327M24917);
                    if (C2023.f6737) {
                        iM2763 = iM2763;
                        z3 = z3 ? 1 : 0;
                        z4 = true;
                        str4 = str4;
                        sArr4 = sArr4;
                        str5 = str5;
                        i21 = i21;
                        iM2761 = C0773.m3169("᩺ۗ") ^ i16;
                        i17 = ((iM2761 ^ i15) * (-18887)) ^ 1075493573;
                        i2 = 179193453;
                        i3 = iM2761 ^ i2;
                        i22 = i22;
                        i21 = i21;
                        str5 = str5;
                        iM2763 = iM2763;
                        sArr3 = sArr3;
                        z3 = z3;
                        i18 = i3;
                        sArr4 = sArr4;
                        str4 = str4;
                        c1322 = this;
                        sb = sb;
                        z4 = z4;
                    } else {
                        int iM27611 = C0619.m2761("ܽۚ") ^ i16;
                        i18 = iM27611 ^ 2107771207;
                        i17 = ((iM27611 ^ i15) * (-16391)) ^ (-1075565868);
                        z4 = true;
                    }
                    break;
                case -1097585911:
                case 711210919:
                    C2834.m9344();
                    if (C1146.f4234 >= 0) {
                        i6 = iM2763;
                        z4 = z4;
                        str3 = strM11765;
                        sb = sb;
                        str = str4;
                        int iM31617 = (C0773.m3169("ۚۜ") + i16) * 59;
                        strM11765 = str3;
                        i17 = ((iM31617 ^ i15) * 23629) ^ 870709116;
                        i18 = iM31617 ^ (-1037125086);
                        str4 = str;
                        iM2763 = i6;
                        sb = sb;
                        z4 = z4;
                    }
                    z4 = z4;
                    str4 = str4;
                    sArr4 = sArr4;
                    str5 = str5;
                    i21 = i21;
                    iM2761 = C0773.m3169("᩺ۗ") ^ i16;
                    i17 = ((iM2761 ^ i15) * (-18887)) ^ 1075493573;
                    i2 = 179193453;
                    i3 = iM2761 ^ i2;
                    i22 = i22;
                    i21 = i21;
                    str5 = str5;
                    iM2763 = iM2763;
                    sArr3 = sArr3;
                    z3 = z3;
                    i18 = i3;
                    sArr4 = sArr4;
                    str4 = str4;
                    c1322 = this;
                    sb = sb;
                    z4 = z4;
                    break;
                case -359271556:
                case 1896235973:
                    i6 = iM2763;
                    Object[] objArr = z3 ? 1 : 0;
                    z4 = z4;
                    sb = sb;
                    str = str4;
                    sArr2 = sArr4;
                    strM43865 = c1322.m43865(AbstractC0641.m2820(f4753, 153, 11, i19));
                    int iM27612 = (C0619.m2761("ܺۡ") + i16) * (-107);
                    i7 = ((iM27612 ^ i15) * (-547)) ^ (-1833906077);
                    i8 = iM27612 ^ 865495242;
                    i22 = i22;
                    i21 = i21;
                    str5 = str5;
                    sArr3 = sArr3;
                    z3 = objArr == true ? 1 : 0;
                    i18 = i8;
                    i17 = i7;
                    sArr4 = sArr2;
                    str4 = str;
                    iM2763 = i6;
                    sb = sb;
                    z4 = z4;
                    break;
                case -336535682:
                case 1479929731:
                    i6 = iM2763;
                    z4 = z4;
                    str3 = strM11765;
                    sb = sb;
                    str = str4;
                    C1783.m6234(sb, str3);
                    sArr4 = f4753;
                    i20 = 178;
                    if (C2834.f9334 <= 0) {
                        int iM31618 = (C0773.m3169("ۚۜ") + i16) * 59;
                        strM11765 = str3;
                        i17 = ((iM31618 ^ i15) * 23629) ^ 870709116;
                        i18 = iM31618 ^ (-1037125086);
                    } else {
                        strM11765 = str3;
                        int iM31619 = C0773.m3169("ܳۨ") ^ i15;
                        i18 = iM31619 ^ 1306484424;
                        i17 = ((iM31619 ^ i16) * 20549) ^ (-446029112);
                    }
                    str4 = str;
                    iM2763 = i6;
                    sb = sb;
                    z4 = z4;
                    break;
                case -321454160:
                case 1742308426:
                    iM2763 = iM2763;
                    z3 = z3 ? 1 : 0;
                    z4 = z4;
                    sb = sb;
                    sArr3 = sArr3;
                    i22 = i22;
                    str4 = str4;
                    sArr4 = sArr4;
                    str5 = str5;
                    i21 = i21;
                    int i28 = s + 1;
                    if ((i28 * i28) - (i13 + 1) < 0) {
                        iM2761 = (i15 - C0619.m2761("ۡۙ")) * (-83);
                        i17 = ((iM2761 ^ i16) * 6465) ^ 572502809;
                        i2 = 428215891;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩷") ^ i15) * (-97);
                        i17 = ((iM2761 ^ i16) * 127) ^ 1791461271;
                        i2 = -1924096772;
                    }
                    i3 = iM2761 ^ i2;
                    i22 = i22;
                    i21 = i21;
                    str5 = str5;
                    iM2763 = iM2763;
                    sArr3 = sArr3;
                    z3 = z3;
                    i18 = i3;
                    sArr4 = sArr4;
                    str4 = str4;
                    c1322 = this;
                    sb = sb;
                    z4 = z4;
                    break;
                case -101054524:
                case -38414977:
                    i = iM2763;
                    z = z4;
                    iM31610 = C0773.m3169(C3734.m12149(f4753, 179, 3, i19));
                    iM3169 = (C0773.m3169("֡᩶") + i16) * 93;
                    i11 = ((iM3169 ^ i15) * 20625) ^ (-1940813209);
                    i12 = -669704637;
                    i18 = iM3169 ^ i12;
                    i17 = i11;
                    z4 = z;
                    iM2763 = i;
                    break;
                case 11773557:
                case 1427837832:
                    iM2763 = iM2763;
                    z3 = z3 ? 1 : 0;
                    z4 = z4;
                    sb = sb;
                    sArr3 = sArr3;
                    i22 = i22;
                    str4 = str4;
                    sArr4 = sArr4;
                    str5 = str5;
                    i21 = i21;
                    boolean z6 = c1322.f4754;
                    strM11252 = C3448.m11252(f4753, 150, 3, i19);
                    int iM27613 = (C0619.m2761("ۜܿ") ^ i16) * 47;
                    int i29 = ((iM27613 ^ i15) * (-9117)) ^ 1816092236;
                    i3 = iM27613 ^ 656359815;
                    z5 = z6;
                    i17 = i29;
                    i22 = i22;
                    i21 = i21;
                    str5 = str5;
                    iM2763 = iM2763;
                    sArr3 = sArr3;
                    z3 = z3;
                    i18 = i3;
                    sArr4 = sArr4;
                    str4 = str4;
                    c1322 = this;
                    sb = sb;
                    z4 = z4;
                    break;
                case 125908295:
                case 1081955642:
                    iM2763 = iM2763;
                    z3 = z3 ? 1 : 0;
                    z4 = z4;
                    sb = sb;
                    sArr3 = sArr3;
                    i22 = i22;
                    str4 = str4;
                    sArr4 = sArr4;
                    str5 = str5;
                    i21 = i21;
                    s = f4753[149];
                    i13 = s * 2;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("᩺ۗ") ^ i16;
                        i17 = ((iM2761 ^ i15) * (-18887)) ^ 1075493573;
                        i2 = 179193453;
                    } else {
                        iM2761 = C0619.m2761("ۤ۟") ^ i16;
                        i17 = ((iM2761 ^ i15) * 4931) ^ (-74310091);
                        i2 = 2117341343;
                    }
                    i3 = iM2761 ^ i2;
                    i22 = i22;
                    i21 = i21;
                    str5 = str5;
                    iM2763 = iM2763;
                    sArr3 = sArr3;
                    z3 = z3;
                    i18 = i3;
                    sArr4 = sArr4;
                    str4 = str4;
                    c1322 = this;
                    sb = sb;
                    z4 = z4;
                    break;
                case 207188500:
                case 410707632:
                    if (C23916.f77426 > 0) {
                        i = iM2763;
                        z = z4;
                        iM3169 = (i15 - C0619.m2761("ۢۧ")) * 59;
                        i11 = ((iM3169 ^ i16) * (-28073)) ^ (-1118221337);
                        i12 = -398364221;
                        i18 = iM3169 ^ i12;
                        i17 = i11;
                        z4 = z;
                        iM2763 = i;
                    } else {
                        z4 = z4;
                        str4 = str4;
                        sArr4 = sArr4;
                        str5 = str5;
                        i21 = i21;
                        iM2761 = C0773.m3169("᩺ۗ") ^ i16;
                        i17 = ((iM2761 ^ i15) * (-18887)) ^ 1075493573;
                        i2 = 179193453;
                        i3 = iM2761 ^ i2;
                        i22 = i22;
                        i21 = i21;
                        str5 = str5;
                        iM2763 = iM2763;
                        sArr3 = sArr3;
                        z3 = z3;
                        i18 = i3;
                        sArr4 = sArr4;
                        str4 = str4;
                        c1322 = this;
                        sb = sb;
                        z4 = z4;
                    }
                    break;
                case 324193139:
                case 490678324:
                    z4 = z4;
                    C11235.m28299(dialogInterfaceC8327M24917.m22433(), new View.OnClickListener(c1322) { // from class: l.۟ܿ֫

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C1322 f26653;

                        {
                            int i30 = 752388408;
                            int i31 = C3492.f12043;
                            int i32 = C3690.f12684;
                            int iM31620 = (C0773.m3169("᩺ᩳ") + i31) * (-35);
                            int i33 = ((iM31620 ^ i32) * 30455) ^ (-1727833027);
                            int i34 = -973206693;
                            while (true) {
                                i30 = ((((i30 ^ i32) * (-30397)) >> 31) & i33) ^ (iM31620 ^ i34);
                                switch (i30) {
                                    case -2034313188:
                                    case -800382193:
                                        if (C2834.f9334 <= 0) {
                                            iM31620 = (C0619.m2761("ܿᩴ") + i31) * (-23);
                                            i33 = ((iM31620 ^ i32) * 15977) ^ 454355253;
                                            i34 = 1225198851;
                                        } else {
                                            iM31620 = C0619.m2761("ۧᩴ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * 21057) ^ 1283050459;
                                            i34 = 864272697;
                                        }
                                        break;
                                    case -2010952445:
                                    case -1024253369:
                                        if (C2419.f7754 >= 0) {
                                            iM31620 = C0773.m3169("۠۬") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-7883)) ^ (-1902642828);
                                            i34 = 1283116187;
                                        } else {
                                            iM31620 = C0773.m3169("ۛ۫") ^ i31;
                                            i33 = ((iM31620 ^ i32) * (-4083)) ^ (-725995852);
                                            i34 = -407592094;
                                        }
                                        break;
                                    case -1994694313:
                                    case -1105862060:
                                        return;
                                    case -1355237577:
                                    case 1943068992:
                                        C3690.m11987();
                                        throw new RuntimeException();
                                    case -1253148411:
                                    case -484815:
                                        if (C3998.f13671 != 0) {
                                            iM31620 = (i31 - C0619.m2761("ᩳۖ")) * (-39);
                                            i33 = ((iM31620 ^ i32) * 20467) ^ (-439086760);
                                            i34 = 260003966;
                                        } else {
                                            iM31620 = (i31 - C0773.m3169("ۗ֫")) * (-73);
                                            i33 = ((iM31620 ^ i32) * 6785) ^ (-1178032400);
                                            i34 = -933918945;
                                        }
                                        break;
                                    case -996608157:
                                    case -122392013:
                                        if (C1826.f6190 <= 0) {
                                            iM31620 = (i31 - C0619.m2761("ᩳۖ")) * (-39);
                                            i33 = ((iM31620 ^ i32) * 20467) ^ (-439086760);
                                            i34 = 260003966;
                                        } else {
                                            iM31620 = (i31 - C0773.m3169("ܽۘ")) * (-111);
                                            i33 = ((iM31620 ^ i32) * 93) ^ 721408304;
                                            i34 = -2031649268;
                                        }
                                        break;
                                    case -901915836:
                                    case -560907934:
                                        if (C2288.f7433 <= 0) {
                                            iM31620 = (C0619.m2761("ܿᩴ") + i31) * (-23);
                                            i33 = ((iM31620 ^ i32) * 15977) ^ 454355253;
                                            i34 = 1225198851;
                                        } else {
                                            iM31620 = (C0773.m3169("᩶֫") ^ i32) * 69;
                                            i33 = ((iM31620 ^ i31) * 2849) ^ 1737604052;
                                            i34 = 1134491948;
                                        }
                                        break;
                                    case -668269718:
                                    case -196942629:
                                        if (RunnableC1848.f6235) {
                                            iM31620 = (i31 - C0619.m2761("ᩳۖ")) * (-39);
                                            i33 = ((iM31620 ^ i32) * 20467) ^ (-439086760);
                                            i34 = 260003966;
                                        } else {
                                            iM31620 = C0619.m2761("ܺܺ") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-5561)) ^ 1047384988;
                                            i34 = -1209481353;
                                        }
                                        break;
                                    case -91010712:
                                    case 1741328946:
                                        C3492.m11488();
                                        if (C13473.f42873 != 0) {
                                            iM31620 = (C0619.m2761("ܿᩴ") + i31) * (-23);
                                            i33 = ((iM31620 ^ i32) * 15977) ^ 454355253;
                                            i34 = 1225198851;
                                        } else {
                                            iM31620 = C0619.m2761("ۗ᩻") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-3739)) ^ 1582256965;
                                            i34 = 1543599998;
                                        }
                                        break;
                                    case 161649914:
                                    case 1733567726:
                                        if (C0862.f3233 != 0) {
                                            iM31620 = C0619.m2761("֡۬") ^ i31;
                                            i33 = ((iM31620 ^ i32) * (-27903)) ^ 58890421;
                                            i34 = -1127309675;
                                        } else {
                                            iM31620 = C0773.m3169("۫ۢ") ^ i32;
                                            i33 = ((iM31620 ^ i31) * 7371) ^ 54465594;
                                            i34 = -968364540;
                                        }
                                        break;
                                    case 544583069:
                                    case 2062876802:
                                        if (C1519.f5300 >= 0) {
                                            iM31620 = C0773.m3169("۠۬") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-7883)) ^ (-1902642828);
                                            i34 = 1283116187;
                                        } else {
                                            iM31620 = C0773.m3169("ܺܳ") ^ i32;
                                            i33 = ((iM31620 ^ i31) * 4313) ^ 935840596;
                                            i34 = -67075042;
                                        }
                                        break;
                                    case 624748134:
                                    case 1287778079:
                                        if (C1343.f4799 != 0) {
                                            iM31620 = C0773.m3169("۠۬") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-7883)) ^ (-1902642828);
                                            i34 = 1283116187;
                                        } else {
                                            iM31620 = (C0773.m3169("᩷ۨ") + i32) * (-117);
                                            i33 = ((iM31620 ^ i31) * (-25381)) ^ (-2026307406);
                                            i34 = 1577920501;
                                        }
                                        break;
                                    case 908182566:
                                    case 2110150157:
                                        if (C1542.f5343 > 0) {
                                            iM31620 = C0773.m3169("۠۬") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-7883)) ^ (-1902642828);
                                            i34 = 1283116187;
                                        } else {
                                            iM31620 = C0619.m2761("ۗ᩻") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-3739)) ^ 1582256965;
                                            i34 = 1543599998;
                                        }
                                        break;
                                    case 1236272670:
                                    case 1660082330:
                                        C2485.m8357();
                                        C0487.m2356();
                                        iM31620 = C0619.m2761("֡۬") ^ i31;
                                        i33 = ((iM31620 ^ i32) * (-27903)) ^ 58890421;
                                        i34 = -1127309675;
                                        break;
                                    case 1254683818:
                                    case 1921602039:
                                        RunnableC3055.m9933();
                                        if (C20932.f66974 <= 0) {
                                            iM31620 = C0619.m2761("ۗ᩻") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-3739)) ^ 1582256965;
                                            i34 = 1543599998;
                                        } else {
                                            iM31620 = C0619.m2761("֡۬") ^ i31;
                                            i33 = ((iM31620 ^ i32) * (-27903)) ^ 58890421;
                                            i34 = -1127309675;
                                        }
                                        break;
                                    default:
                                        this.f26653 = c1322;
                                        if (C20932.f66974 <= 0) {
                                            iM31620 = (C0619.m2761("ܿᩴ") + i31) * (-23);
                                            i33 = ((iM31620 ^ i32) * 15977) ^ 454355253;
                                            i34 = 1225198851;
                                        } else {
                                            iM31620 = C0619.m2761("֨ۨ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * 31367) ^ 985004198;
                                            i34 = 919260399;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1322 c1323 = null;
                            int i30 = 1689626084;
                            int i31 = C23916.f77426;
                            int i32 = C4238.f15451;
                            int iM31620 = (i32 - C0773.m3169("ۙܺ")) * (-3);
                            int i33 = ((iM31620 ^ i31) * (-2329)) ^ (-1609502118);
                            int i34 = -1277013145;
                            while (true) {
                                i30 = ((((i30 ^ i31) * 10809) >> 31) & i33) ^ (iM31620 ^ i34);
                                switch (i30) {
                                    case -1994754846:
                                    case 513397043:
                                        int i35 = C1322.f4752;
                                        if (C1783.m6232()) {
                                            iM31620 = (C0619.m2761("ۤۖ") + i32) * (-85);
                                            i33 = ((iM31620 ^ i31) * (-17829)) ^ (-1643675878);
                                            i34 = -1230363581;
                                        } else {
                                            iM31620 = (C0773.m3169("ۙ᩷") + i32) * 127;
                                            i33 = ((iM31620 ^ i31) * 1757) ^ 923460342;
                                            i34 = 1063066708;
                                        }
                                        break;
                                    case -1711219763:
                                    case -202107960:
                                        C3779.m12264();
                                        if (C3734.f12817 >= 0) {
                                            iM31620 = (C0773.m3169("ۢܳ") ^ i32) * (-43);
                                            i33 = ((iM31620 ^ i31) * (-13363)) ^ (-1378241688);
                                            i34 = -275149008;
                                        } else {
                                            iM31620 = C0619.m2761("֡ۨ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * 11379) ^ 1329783577;
                                            i34 = -1026821362;
                                        }
                                        break;
                                    case -1644406263:
                                    case 1553819211:
                                        c1323.cancel();
                                        C2375.m8064(dialogInterfaceC8327M24917);
                                        break;
                                    case -1601922776:
                                    case -714447114:
                                        RunnableC3646.m11813();
                                        RunnableC3055.m9933();
                                        break;
                                    case -1337924054:
                                    case -701473416:
                                        if (C0487.f2131 <= 0) {
                                            iM31620 = (i32 - C0619.m2761("ۢۘ")) * 71;
                                            i33 = ((iM31620 ^ i31) * 28525) ^ (-1121953529);
                                            i34 = -206601077;
                                        } else {
                                            iM31620 = C0773.m3169("ۘۤ") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-23359)) ^ 1024078949;
                                            i34 = 1707358270;
                                        }
                                        break;
                                    case -1004065212:
                                    case -572070073:
                                        if (C2023.f6737) {
                                            iM31620 = (i32 - C0619.m2761("ۢۘ")) * 71;
                                            i33 = ((iM31620 ^ i31) * 28525) ^ (-1121953529);
                                            i34 = -206601077;
                                        } else {
                                            iM31620 = (C0619.m2761("᩷֫") ^ i32) * 39;
                                            i33 = ((iM31620 ^ i31) * 17939) ^ (-702284483);
                                            i34 = -1002276955;
                                        }
                                        break;
                                    case -954134059:
                                    case -495625270:
                                        c1323 = this.f26653;
                                        if (C2966.f9654 >= 0) {
                                            iM31620 = (i32 - C0619.m2761("ۢۘ")) * 71;
                                            i33 = ((iM31620 ^ i31) * 28525) ^ (-1121953529);
                                            i34 = -206601077;
                                        } else {
                                            iM31620 = (i31 - C0619.m2761("᩶ܽ")) * 87;
                                            i33 = ((iM31620 ^ i32) * 13835) ^ (-1856049582);
                                            i34 = 1588939602;
                                        }
                                        break;
                                    case -499477850:
                                    case 2130870615:
                                        C1783.m6232();
                                        if (C13473.f42873 == 0) {
                                            iM31620 = (C0773.m3169("ۙ᩷") + i32) * 127;
                                            i33 = ((iM31620 ^ i31) * 1757) ^ 923460342;
                                            i34 = 1063066708;
                                        } else {
                                            iM31620 = (C0773.m3169("ۢܳ") ^ i32) * (-43);
                                            i33 = ((iM31620 ^ i31) * (-13363)) ^ (-1378241688);
                                            i34 = -275149008;
                                        }
                                        break;
                                    case -131590657:
                                    case 680334574:
                                        C1080.m4050();
                                        C0950.m3785();
                                        iM31620 = (C0773.m3169("ۢܳ") ^ i32) * (-43);
                                        i33 = ((iM31620 ^ i31) * (-13363)) ^ (-1378241688);
                                        i34 = -275149008;
                                        break;
                                    case 185612008:
                                    case 1295548393:
                                        if (C23916.f77426 <= 0) {
                                            iM31620 = (C0773.m3169("ۙ᩷") + i32) * 127;
                                            i33 = ((iM31620 ^ i31) * 1757) ^ 923460342;
                                            i34 = 1063066708;
                                        } else {
                                            iM31620 = C0773.m3169("ۘ֫") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-15247)) ^ 1880563198;
                                            i34 = 1619507586;
                                        }
                                        break;
                                    case 214982823:
                                    case 1748928623:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM31620 = C0619.m2761("۟ܽ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * (-27021)) ^ 1696257538;
                                            i34 = -656859890;
                                        } else {
                                            iM31620 = (C0773.m3169("ۤܽ") + i31) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i33 = ((iM31620 ^ i32) * 24115) ^ (-1221141435);
                                            i34 = 1105555856;
                                        }
                                        break;
                                    case 288321006:
                                    case 1758296500:
                                        if (C17202.f56030) {
                                            iM31620 = C0773.m3169("ܺܰ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * (-31515)) ^ (-1556544242);
                                            i34 = 696292247;
                                        } else {
                                            iM31620 = (C0773.m3169("ۙ᩷") + i32) * 127;
                                            i33 = ((iM31620 ^ i31) * 1757) ^ 923460342;
                                            i34 = 1063066708;
                                        }
                                        break;
                                    case 325265207:
                                    case 626690484:
                                        if (C3099.f10023 <= 0) {
                                            iM31620 = C0619.m2761("۟ܽ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * (-27021)) ^ 1696257538;
                                            i34 = -656859890;
                                        } else {
                                            iM31620 = C0773.m3169("ۘۛ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * 3071) ^ 706237253;
                                            i34 = 2010904444;
                                        }
                                        break;
                                    case 347376286:
                                    case 1597728750:
                                        if (C1826.m6301() < 0) {
                                            iM31620 = C0619.m2761("۟ܽ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * (-27021)) ^ 1696257538;
                                            i34 = -656859890;
                                        } else {
                                            iM31620 = (C0773.m3169("ۙ᩷") + i32) * 127;
                                            i33 = ((iM31620 ^ i31) * 1757) ^ 923460342;
                                            i34 = 1063066708;
                                        }
                                        break;
                                    case 759748344:
                                    case 1718791191:
                                        if (C11235.f35427 >= 0) {
                                            iM31620 = (C0773.m3169("ۢܳ") ^ i32) * (-43);
                                            i33 = ((iM31620 ^ i31) * (-13363)) ^ (-1378241688);
                                            i34 = -275149008;
                                        } else {
                                            iM31620 = C0773.m3169("᩺᩸") ^ i32;
                                            i33 = ((iM31620 ^ i31) * (-12441)) ^ (-798687004);
                                            i34 = 1922260051;
                                        }
                                        break;
                                    default:
                                        if (C0619.f2439) {
                                            iM31620 = C0619.m2761("۟ܽ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * (-27021)) ^ 1696257538;
                                            i34 = -656859890;
                                        } else {
                                            iM31620 = C0619.m2761("ۖۨ") ^ i31;
                                            i33 = ((iM31620 ^ i32) * 17773) ^ 53581496;
                                            i34 = 611997815;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    buttonM1782 = C0269.m1782(dialogInterfaceC8327M24917);
                    C13473.m33140(buttonM1782, z3 ? 1 : 0);
                    C1080.m4060(buttonM1782, iM2763);
                    if (C3779.f12953 > 0) {
                        iM2762 = C0773.m3169("ᩳ᩵") ^ i15;
                        i9 = ((iM2762 ^ i16) * 7255) ^ (-611703364);
                        i10 = -912934790;
                        i18 = iM2762 ^ i10;
                        i17 = i9;
                        z4 = z4;
                    } else {
                        i6 = iM2763;
                        z2 = z3 ? 1 : 0;
                        sb = sb;
                        str = str4;
                        sArr2 = sArr4;
                        int iM27614 = C0619.m2761("۠֫") ^ i16;
                        i18 = iM27614 ^ 745980566;
                        i17 = ((iM27614 ^ i15) * 24731) ^ (-198683975);
                        sArr4 = sArr2;
                        str4 = str;
                        iM2763 = i6;
                        z3 = z2;
                        sb = sb;
                        z4 = z4;
                    }
                    break;
                case 576833017:
                case 2141941918:
                    i19 = 21030;
                    iM2761 = C0619.m2761("֨ۚ") ^ i16;
                    i17 = ((iM2761 ^ i15) * (-23893)) ^ (-231589959);
                    i2 = -939944210;
                    i3 = iM2761 ^ i2;
                    i22 = i22;
                    i21 = i21;
                    str5 = str5;
                    iM2763 = iM2763;
                    sArr3 = sArr3;
                    z3 = z3;
                    i18 = i3;
                    sArr4 = sArr4;
                    str4 = str4;
                    c1322 = this;
                    sb = sb;
                    z4 = z4;
                    break;
                case 650582169:
                case 2052662678:
                    z4 = z4;
                    dialogInterfaceC8327M4860 = C1321.m4860(c2361);
                    C9524.m24920(dialogInterfaceC8327M4860);
                    buttonM2817 = AbstractC0641.m2817(dialogInterfaceC8327M4860);
                    if (C2310.f7472 < 0) {
                        iM2762 = C0773.m3169("ۘ᩹") ^ i15;
                        i9 = ((iM2762 ^ i16) * (-31419)) ^ (-1808712282);
                        i10 = -1997955245;
                        i18 = iM2762 ^ i10;
                        i17 = i9;
                        z4 = z4;
                    } else {
                        str4 = str4;
                        sArr4 = sArr4;
                        str5 = str5;
                        i21 = i21;
                        iM2761 = C0773.m3169("᩺ۗ") ^ i16;
                        i17 = ((iM2761 ^ i15) * (-18887)) ^ 1075493573;
                        i2 = 179193453;
                        i3 = iM2761 ^ i2;
                        i22 = i22;
                        i21 = i21;
                        str5 = str5;
                        iM2763 = iM2763;
                        sArr3 = sArr3;
                        z3 = z3;
                        i18 = i3;
                        sArr4 = sArr4;
                        str4 = str4;
                        c1322 = this;
                        sb = sb;
                        z4 = z4;
                    }
                    break;
                case 789811250:
                case 2119128232:
                    z = z4;
                    dialogInterfaceOnClickListenerC7025 = new DialogInterfaceOnClickListenerC7025(1, c1322);
                    i = iM2763;
                    strM9670 = C2966.m9670(f4753, 182, 3, i19);
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۢܽ") ^ i15;
                        i11 = ((iM3169 ^ i16) * 20223) ^ 788025012;
                        i12 = -1447001509;
                    } else {
                        iM3169 = C0619.m2761("ۢۙ") ^ i16;
                        i11 = ((iM3169 ^ i15) * (-22119)) ^ (-581299091);
                        i12 = -493444847;
                    }
                    i18 = iM3169 ^ i12;
                    i17 = i11;
                    z4 = z;
                    iM2763 = i;
                    break;
                case 803098430:
                case 1886670450:
                    z4 = z4;
                    C3033.m9848(c2361, C0619.m2761(strM9670) ^ 2098756947, dialogInterfaceOnClickListenerC7025);
                    C2375.m8063(c2361, iM2763, obj);
                    iM2762 = C0619.m2761("ܺܳ") ^ i16;
                    i9 = ((iM2762 ^ i15) * (-5313)) ^ (-189424650);
                    i10 = -390336005;
                    i18 = iM2762 ^ i10;
                    i17 = i9;
                    z4 = z4;
                    break;
                case 1056178965:
                case 1257242356:
                    z4 = z4;
                    c1322.f4754 = z3;
                    dialogInterfaceC8327M24917 = C9524.m24917();
                    if (dialogInterfaceC8327M24917 != null) {
                        iM2762 = (C0773.m3169("᩷ۨ") ^ i16) * (-63);
                        i9 = ((iM2762 ^ i15) * 21047) ^ (-683203441);
                        i10 = 1638297093;
                        i18 = iM2762 ^ i10;
                        i17 = i9;
                        z4 = z4;
                    }
                    sb = sb;
                    sArr = sArr3;
                    i4 = i22;
                    str = str4;
                    sArr2 = sArr4;
                    str2 = str5;
                    i5 = i21;
                    int iM316110 = C0773.m3169("᩵۫") ^ i15;
                    i6 = iM2763;
                    i7 = ((iM316110 ^ i16) * 17909) ^ (-1007469135);
                    i8 = iM316110 ^ (-1629922439);
                    i22 = i4;
                    i21 = i5;
                    str5 = str2;
                    sArr3 = sArr;
                    i18 = i8;
                    i17 = i7;
                    sArr4 = sArr2;
                    str4 = str;
                    iM2763 = i6;
                    sb = sb;
                    z4 = z4;
                    break;
                case 1274658884:
                case 1361557028:
                    return dialogInterfaceC8327M24917;
                default:
                    C11235.m28299(buttonM2817, new ViewOnClickListenerC19221());
                    C2310.m7810(m43851(), dialogInterfaceC8327M4860, new InterfaceC16438() { // from class: l.ۢܿ֫

                        /* JADX INFO: renamed from: ᩺۫ۚ, reason: not valid java name and contains not printable characters */
                        private static final short[] f32801 = {4119, 15683};

                        /* JADX WARN: Code duplicated, block: B:66:0x025b A[PHI: r5 r6 r17
                          0x025b: PHI (r5v7 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:65:0x0259, B:53:0x01d8, B:24:0x007c, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
                          0x025b: PHI (r6v7 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:65:0x0259, B:53:0x01d8, B:24:0x007c, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
                          0x025b: PHI (r17v23 java.lang.StringBuilder) = 
                          (r17v3 java.lang.StringBuilder)
                          (r17v3 java.lang.StringBuilder)
                          (r17v16 java.lang.StringBuilder)
                          (r17v3 java.lang.StringBuilder)
                         binds: [B:65:0x0259, B:53:0x01d8, B:24:0x007c, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
                        
                            if (l.C2702.m8876() == false) goto L14;
                         */
                        @Override // l.InterfaceC16438
                        /* JADX INFO: renamed from: ۙ */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void mo1486(java.lang.Object r21) {
                            /*
                                Method dump skipped, instruction units count: 786
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.C10270.mo1486(java.lang.Object):void");
                        }
                    });
                    return dialogInterfaceC8327M4860;
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        int i = 1121501922;
        int i2 = C11235.f35427;
        int i3 = C20932.f66974;
        int iM3169 = (i3 - C0773.m3169("᩻ܺ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i4 = ((iM3169 ^ i2) * 28831) ^ (-1532566899);
        int i5 = 1621720628;
        while (true) {
            i = ((((i ^ i2) * 15005) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1912467515:
                case 1027091407:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۧۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15911) ^ (-1724791976);
                        i5 = -1844840825;
                    } else {
                        iM3169 = (C0773.m3169("ܽ֫") + i2) * 3;
                        i4 = ((iM3169 ^ i3) * 14265) ^ 1605950465;
                        i5 = 1364226187;
                    }
                    break;
                case -1287227973:
                case -104006750:
                    C0487.m2356();
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = C0619.m2761("ۧۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15911) ^ (-1724791976);
                        i5 = -1844840825;
                    } else {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14591)) ^ 2056362676;
                        i5 = 1780847773;
                    }
                    break;
                case -1194990894:
                case 495849133:
                    C23916.m53419();
                    if (C2287.f7432 < 0) {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14591)) ^ 2056362676;
                        i5 = 1780847773;
                    } else {
                        iM3169 = (C0773.m3169("ܿܿ") + i2) * (-125);
                        i4 = ((iM3169 ^ i3) * (-8675)) ^ (-1628387500);
                        i5 = 567345045;
                    }
                    break;
                case -1154814604:
                case 1811413459:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ܿܿ") + i2) * (-125);
                        i4 = ((iM3169 ^ i3) * (-8675)) ^ (-1628387500);
                        i5 = 567345045;
                    } else {
                        iM3169 = C0773.m3169("᩹ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31819)) ^ (-815892496);
                        i5 = 257631957;
                    }
                    break;
                case -994849455:
                case 1508516354:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3999)) ^ (-1546842036);
                        i5 = 1798189394;
                    } else {
                        iM3169 = (C0773.m3169("ܺۚ") + i2) * (-53);
                        i4 = ((iM3169 ^ i3) * (-7807)) ^ 116479416;
                        i5 = -2061065188;
                    }
                    break;
                case -817529815:
                case -765013410:
                    if (C3077.f9998) {
                        iM3169 = (i2 - C0773.m3169("ۖ᩸")) * 63;
                        i4 = ((iM3169 ^ i3) * 5071) ^ (-668042307);
                        i5 = 1775858127;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3999)) ^ (-1546842036);
                        i5 = 1798189394;
                    }
                    break;
                case -369541971:
                case 748306023:
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("ܽ᩷") + i3) * 99;
                        i4 = ((iM3169 ^ i2) * 5575) ^ (-1385289112);
                        i5 = 1121448340;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3999)) ^ (-1546842036);
                        i5 = 1798189394;
                    }
                    break;
                case -168257620:
                case -121153759:
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0773.m3169("ܿܿ") + i2) * (-125);
                        i4 = ((iM3169 ^ i3) * (-8675)) ^ (-1628387500);
                        i5 = 567345045;
                    } else {
                        iM3169 = C0773.m3169("۫᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21115)) ^ (-1340025156);
                        i5 = 697209759;
                    }
                    break;
                case -80601910:
                case 1623587431:
                    if (C3690.m11994(c12187)) {
                        iM3169 = (C0619.m2761("ۡۘ") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 14731) ^ (-77519453);
                        i5 = 2050875279;
                    } else {
                        iM3169 = C0773.m3169("ۛܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28813) ^ (-1005412600);
                        i5 = -797214904;
                    }
                    break;
                case 54701041:
                case 1898609263:
                    C1080.m4050();
                    iM3169 = (C0773.m3169("ܿܿ") + i2) * (-125);
                    i4 = ((iM3169 ^ i3) * (-8675)) ^ (-1628387500);
                    i5 = 567345045;
                    break;
                case 196453949:
                case 630511028:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3999)) ^ (-1546842036);
                        i5 = 1798189394;
                    } else {
                        iM3169 = C0773.m3169("ۘܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6367) ^ 1489528871;
                        i5 = -232320428;
                    }
                    break;
                case 333264672:
                case 921023393:
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0619.m2761("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3999)) ^ (-1546842036);
                        i5 = 1798189394;
                    } else {
                        iM3169 = (i3 - C0619.m2761("֨ۢ")) * (-111);
                        i4 = ((iM3169 ^ i2) * 20723) ^ (-655650853);
                        i5 = 75105160;
                    }
                    break;
                case 435936065:
                case 1117364184:
                    C3734.m12147(this.f4755);
                    iM3169 = (C0619.m2761("ۡۘ") + i3) * 109;
                    i4 = ((iM3169 ^ i2) * 14731) ^ (-77519453);
                    i5 = 2050875279;
                    break;
                case 462524676:
                case 830825371:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ۧۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15911) ^ (-1724791976);
                        i5 = -1844840825;
                    } else {
                        iM3169 = C0773.m3169("֨ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16751) ^ 1291969124;
                        i5 = 700999708;
                    }
                    break;
                case 716414088:
                case 1724598281:
                    RunnableC0334.m2063();
                    break;
                case 1287030337:
                case 1446328089:
                    if (C1321.m4852()) {
                        iM3169 = (i3 - C0619.m2761("ۨ᩷")) * (-55);
                        i4 = ((iM3169 ^ i2) * 17407) ^ (-2109772783);
                        i5 = -5113411;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3999)) ^ (-1546842036);
                        i5 = 1798189394;
                    }
                    break;
                case 1773453237:
                case 1979585267:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3999)) ^ (-1546842036);
                        i5 = 1798189394;
                    } else {
                        iM3169 = C0619.m2761("۟᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 16391) ^ 1029092498;
                        i5 = -1529993159;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final l.C12187 mo2531() {
        /*
            Method dump skipped, instruction units count: 2604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1322.mo2531():l.ۨۜۧ");
    }
}
