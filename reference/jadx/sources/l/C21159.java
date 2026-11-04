package l;

import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩶۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4ND */
/* JADX INFO: loaded from: classes5.dex */
public class C21159 extends AbstractC16610 {

    /* JADX INFO: renamed from: ۟᩺ۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f67544 = {515, 8289, 12694, 10338, 24150, 24150, 24150, 4476, -5075, -5086, -5081, -5074, -5061, -5074, -5063, -5075, -5084, -5063, -5082, -5078, -5083, -5080, -5074, -5093, -5063, -5086, -5084, -5063, -5086, -5057, -5070, -5074, -5083, -5078, -5079, -5081, -5074, -5090, -5081, -5057, -5063, -5078, -5088, -5074, -5074, -5061, -5110, -5061, -5088, -5096, -5086, -5076, -5111, -5081, -5084, -5080, -5088, -5019, -5057, -5082, -5061, -16575, -16939, -30447, -5110, -5083, -5073, -5063, -5084, -5086, -5073, -5114, -5078, -5083, -5086, -5075, -5074, -5064, -5057, -5019, -5069, -5082, -5081, 32554, 25493, -32010, -17391, -28386, -26510, -5100, -5084, -5061, -5057, 8749, 3064, 3063, 3058, 3067, -32084, 26316, 21831, -30576, -30268, 23327};

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f67545;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f67546;

    /* JADX WARN: Code duplicated, block: B:52:0x01a1 A[PHI: r10
      0x01a1: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:51:0x019f, B:18:0x0082, B:16:0x007e, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01d9 A[PHI: r2 r3 r8 r9
      0x01d9: PHI (r2v3 int) = (r2v2 int), (r2v2 int), (r2v5 int) binds: [B:55:0x01d7, B:32:0x00e5, B:28:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:55:0x01d7, B:32:0x00e5, B:28:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:55:0x01d7, B:32:0x00e5, B:28:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:55:0x01d7, B:32:0x00e5, B:28:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0210 A[PHI: r6 r7 r14
      0x0210: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:59:0x020e, B:36:0x0106, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:59:0x020e, B:36:0x0106, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:59:0x020e, B:36:0x0106, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0259 A[PHI: r4 r12 r13 r15 r16 r21
      0x0259: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:64:0x0257, B:40:0x0127, B:24:0x00a1, B:16:0x007e, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:64:0x0257, B:40:0x0127, B:24:0x00a1, B:16:0x007e, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:64:0x0257, B:40:0x0127, B:24:0x00a1, B:16:0x007e, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:64:0x0257, B:40:0x0127, B:24:0x00a1, B:16:0x007e, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0257, B:40:0x0127, B:24:0x00a1, B:16:0x007e, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r21v4 char) = (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v6 char) binds: [B:64:0x0257, B:40:0x0127, B:24:0x00a1, B:16:0x007e, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        int iM3169;
        int i;
        int i2;
        int i3 = C3734.f12817;
        int i4 = C1080.f3865;
        int iM31610 = C0773.m3169("ۘۜ") ^ i4;
        int i5 = ((iM31610 ^ i3) * 9301) ^ (-1620436630);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ 812902687;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -817248575;
        char c = 0;
        String strM6233 = null;
        int iM31611 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 6453) >> 31));
            switch (i14) {
                case -2138427333:
                case 56204741:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * 20165) ^ 650904165;
                        i2 = -762743096;
                    } else {
                        iM3169 = C0773.m3169("ܿ۫") ^ i4;
                        i = ((iM3169 ^ i3) * (-20535)) ^ 1992281685;
                        i2 = 1259569788;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1871367400:
                case -94401848:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ۜۚ") + i4) * 19;
                        i = ((iM3169 ^ i3) * 13797) ^ 1858881535;
                        i2 = 82937238;
                    } else {
                        iM3169 = C0773.m3169("ܶۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-27507)) ^ 1791179031;
                        i2 = 1814274946;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1618038897:
                case -788248947:
                    i13 = 3;
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0773.m3169("ܶۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-27507)) ^ 1791179031;
                        i2 = 1814274946;
                    } else {
                        iM3169 = (C0773.m3169("ۜܳ") ^ i3) * (-17);
                        i = ((iM3169 ^ i4) * (-28513)) ^ (-33013023);
                        i2 = 31867268;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1524295730:
                case -1215933108:
                    i11 = 24184;
                    iM3169 = (C0619.m2761("ܿۡ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM3169 ^ i3) * 29873) ^ (-568163088);
                    i2 = -37080659;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1520800086:
                case 1367923784:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C2878.m9491() <= 0) {
                        iM3169 = (C0773.m3169("ܽ᩷") ^ i3) * 15;
                        i = ((iM3169 ^ i4) * (-28045)) ^ (-1112628639);
                        i2 = -1196782584;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩸") ^ i3;
                        i = ((iM3169 ^ i4) * 31309) ^ 2113170836;
                        i2 = -1060208508;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1488743540:
                case 1280915460:
                    C1343.m4943();
                    break;
                case -1443439675:
                case -114062504:
                    C0487.m2356();
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * 20165) ^ 650904165;
                        i2 = -762743096;
                    } else {
                        iM3169 = (C0773.m3169("ۜۚ") + i4) * 19;
                        i = ((iM3169 ^ i3) * 13797) ^ 1858881535;
                        i2 = 82937238;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1365746925:
                case -371236249:
                    C3033.m9854(this, iM31611);
                    sArr3 = f67544;
                    i7 = 4;
                    if (C1519.m5403()) {
                        iM3169 = C0773.m3169("ۖۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-18657)) ^ 682199278;
                        i2 = 647416449;
                    } else {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * 20165) ^ 650904165;
                        i2 = -762743096;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1327004712:
                case -1063841629:
                    i11 = 53751;
                    iM3169 = (C0619.m2761("ܿۡ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM3169 ^ i3) * 29873) ^ (-568163088);
                    i2 = -37080659;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1283006725:
                case 1551449019:
                    C0269.m1783(this, C3734.m12149(sArr3, i7, 3, i11));
                    break;
                case -624741728:
                case -350919437:
                    sArr = f67544;
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * 20165) ^ 650904165;
                        i2 = -762743096;
                    } else {
                        iM3169 = C0773.m3169("ۘܽ") ^ i3;
                        i = ((iM3169 ^ i4) * 29105) ^ (-472913369);
                        i2 = -754365610;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 166713945:
                case 1545756916:
                    C3448.m11248();
                    C0862.m3503();
                    iM3169 = (C0773.m3169("ۜۚ") + i4) * 19;
                    i = ((iM3169 ^ i3) * 13797) ^ 1858881535;
                    i2 = 82937238;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 211126248:
                case 1487668320:
                    iM31611 = 2130008766 ^ C0773.m3169(strM6233);
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0773.m3169("ܽ᩷") ^ i3) * 15;
                        i = ((iM3169 ^ i4) * (-28045)) ^ (-1112628639);
                        i2 = -1196782584;
                    } else {
                        iM3169 = C0619.m2761("۬᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 10263) ^ (-899844355);
                        i2 = 998794404;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 236720179:
                case 1651046969:
                    s = sArr[c];
                    s2 = 39830;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("ܶۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-27507)) ^ 1791179031;
                        i2 = 1814274946;
                    } else {
                        iM3169 = (C0619.m2761("۬ܺ") + i4) * (-5);
                        i = ((iM3169 ^ i3) * (-25839)) ^ 1657945753;
                        i2 = 329357016;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 403231286:
                case 446407217:
                    strM6233 = C1783.m6233(sArr2, i12, i13, i11);
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("ܽ᩷") ^ i3) * 15;
                        i = ((iM3169 ^ i4) * (-28045)) ^ (-1112628639);
                        i2 = -1196782584;
                    } else {
                        iM3169 = (C0773.m3169("᩹ܺ") + i4) * 79;
                        i = ((iM3169 ^ i3) * (-28357)) ^ 1574976578;
                        i2 = -315078553;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 496587683:
                case 1520971387:
                    if (i8 - (i9 + i10) <= 0) {
                        iM3169 = (C0619.m2761("֫ܽ") + i4) * (-53);
                        i = ((iM3169 ^ i3) * (-2283)) ^ (-397916431);
                        i2 = 915355152;
                    } else {
                        iM3169 = C0619.m2761("᩻֡") ^ i3;
                        i = ((iM3169 ^ i4) * (-29041)) ^ 21146466;
                        i2 = 636778471;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 626572647:
                case 1716925460:
                    sArr2 = f67544;
                    i12 = 1;
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * 20165) ^ 650904165;
                        i2 = -762743096;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩷") ^ i4) * 17;
                        i = ((iM3169 ^ i3) * (-16533)) ^ (-121899774);
                        i2 = 1085463604;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 744711272:
                case 1440659352:
                    i10 = 396607225;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ۜۚ") + i4) * 19;
                        i = ((iM3169 ^ i3) * 13797) ^ 1858881535;
                        i2 = 82937238;
                    } else {
                        iM3169 = C0773.m3169("۫ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3663)) ^ 379350124;
                        i2 = -810009241;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 0;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * 20165) ^ 650904165;
                        i2 = -762743096;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩷") + i4) * 77;
                        i = ((iM3169 ^ i3) * 4643) ^ (-2009078142);
                        i2 = -1669627560;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C21159() {
        ArrayList arrayList = null;
        int i = 373359251;
        int i2 = RunnableC0334.f1808;
        int i3 = C1519.f5300;
        int iM3169 = C0773.m3169("ۖ۟") ^ i2;
        int i4 = ((iM3169 ^ i3) * 15509) ^ 1380916369;
        int i5 = -1904189848;
        while (true) {
            i = ((((i ^ i3) * 27817) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1686425247:
                case -1013984967:
                    C2375.m8065();
                    iM3169 = (C0773.m3169("᩸ۤ") ^ i2) * (-53);
                    i4 = ((iM3169 ^ i3) * 29005) ^ 1962829833;
                    i5 = 1950895972;
                    break;
                case -1615786889:
                case 569454039:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0619.m2761("᩺ۛ") ^ i3) * 61;
                        i4 = ((iM3169 ^ i2) * 12251) ^ (-396542325);
                        i5 = -2088880737;
                    } else {
                        iM3169 = C0619.m2761("᩷ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18845)) ^ (-2130286224);
                        i5 = -1046509285;
                    }
                    break;
                case -1561060632:
                case 1313678649:
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0619.m2761("ۨۧ") + i2) * 13;
                        i4 = ((iM3169 ^ i3) * 11037) ^ 1019924574;
                        i5 = -274391121;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܽ᩺")) * 57;
                        i4 = ((iM3169 ^ i3) * 20239) ^ (-1096265915);
                        i5 = 1119688315;
                    }
                    break;
                case -1533665370:
                case -349270009:
                    C23916.m53419();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ۨۧ") + i2) * 13;
                        i4 = ((iM3169 ^ i3) * 11037) ^ 1019924574;
                        i5 = -274391121;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۤ") ^ i2) * (-53);
                        i4 = ((iM3169 ^ i3) * 29005) ^ 1962829833;
                        i5 = 1950895972;
                    }
                    break;
                case -1415357915:
                case -205982006:
                    C2834.m9344();
                    throw new RuntimeException();
                case -1260347453:
                case -299981104:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("᩺ۛ") ^ i3) * 61;
                        i4 = ((iM3169 ^ i2) * 12251) ^ (-396542325);
                        i5 = -2088880737;
                    } else {
                        iM3169 = C0619.m2761("ۖ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4745)) ^ 1406584671;
                        i5 = 2106217285;
                    }
                    break;
                case -1254426983:
                case 1810069039:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ܽ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24201) ^ (-2102230634);
                        i5 = -173771055;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩸ۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i2) * 30361) ^ (-1896765572);
                        i5 = -413834285;
                    }
                    break;
                case -1153467794:
                case -510973998:
                    arrayList = new ArrayList();
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ܽ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24201) ^ (-2102230634);
                        i5 = -173771055;
                    } else {
                        iM3169 = (C0619.m2761("۬֡") + i3) * 71;
                        i4 = ((iM3169 ^ i2) * (-28255)) ^ 1852520677;
                        i5 = -750626545;
                    }
                    break;
                case -1126351355:
                case 789925155:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("᩸ۤ") ^ i2) * (-53);
                        i4 = ((iM3169 ^ i3) * 29005) ^ 1962829833;
                        i5 = 1950895972;
                    } else {
                        iM3169 = C0773.m3169("֡ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14869)) ^ 1813571389;
                        i5 = -1441904673;
                    }
                    break;
                case -644036876:
                case -543956821:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("᩸ۤ") ^ i2) * (-53);
                        i4 = ((iM3169 ^ i3) * 29005) ^ 1962829833;
                        i5 = 1950895972;
                    } else {
                        iM3169 = C0619.m2761("ۚۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25531)) ^ (-1554201447);
                        i5 = -10111046;
                    }
                    break;
                case 59815974:
                case 518136507:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("ۨۧ") + i2) * 13;
                        i4 = ((iM3169 ^ i3) * 11037) ^ 1019924574;
                        i5 = -274391121;
                    } else {
                        iM3169 = (C0619.m2761("ܺ۬") ^ i2) * (-73);
                        i4 = ((iM3169 ^ i3) * (-9433)) ^ 705554595;
                        i5 = 1930556976;
                    }
                    break;
                case 131204184:
                case 1321249843:
                    this.f67546 = arrayList;
                    return;
                case 410863112:
                case 538705090:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("᩸ۤ") ^ i2) * (-53);
                        i4 = ((iM3169 ^ i3) * 29005) ^ 1962829833;
                        i5 = 1950895972;
                    } else {
                        iM3169 = (C0773.m3169("۬ۖ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i3) * 30925) ^ (-347691294);
                        i5 = -1716429089;
                    }
                    break;
                case 510242104:
                case 718937136:
                    C3492.m11488();
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ۚ᩻")) * (-127);
                        i4 = ((iM3169 ^ i2) * (-25953)) ^ 812353454;
                        i5 = -880647591;
                    } else {
                        iM3169 = (C0619.m2761("ۨۧ") + i2) * 13;
                        i4 = ((iM3169 ^ i3) * 11037) ^ 1019924574;
                        i5 = -274391121;
                    }
                    break;
                case 1433286361:
                case 1645323970:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("᩺ۛ") ^ i3) * 61;
                        i4 = ((iM3169 ^ i2) * 12251) ^ (-396542325);
                        i5 = -2088880737;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۤ") ^ i2) * (-53);
                        i4 = ((iM3169 ^ i3) * 29005) ^ 1962829833;
                        i5 = 1950895972;
                    }
                    break;
                default:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۚ᩻")) * (-127);
                        i4 = ((iM3169 ^ i2) * (-25953)) ^ 812353454;
                        i5 = -880647591;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۠ᩴ")) * 85;
                        i4 = ((iM3169 ^ i3) * (-19479)) ^ 1550575611;
                        i5 = 1821413716;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46057;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0084  */
    /* JADX WARN: Code duplicated, block: B:58:0x022f A[PHI: r1 r2 r5 r6 r7 r8 r9 r15 r20 r21 r26
      0x022f: PHI (r1v6 java.lang.String) = 
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v3 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
     binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v6 java.lang.String)
     binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r5v5 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r6v5 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v6 short[]) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r15v5 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r20v5 int) = (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r21v5 int) = (r21v3 int), (r21v2 int), (r21v2 int), (r21v2 int), (r21v2 int) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r26v6 int) = (r26v4 int), (r26v3 int), (r26v3 int), (r26v3 int), (r26v3 int) binds: [B:57:0x022d, B:47:0x01b7, B:43:0x0194, B:31:0x0127, B:88:0x022f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0269 A[PHI: r4 r18 r19
      0x0269: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:61:0x0267, B:35:0x014e, B:7:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:61:0x0267, B:35:0x014e, B:7:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:61:0x0267, B:35:0x014e, B:7:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x02a1 A[PHI: r3 r10 r11 r12 r16 r17
      0x02a1: PHI (r3v4 java.lang.String[]) = (r3v2 java.lang.String[]), (r3v3 java.lang.String[]), (r3v2 java.lang.String[]), (r3v2 java.lang.String[]) binds: [B:65:0x029f, B:27:0x0102, B:23:0x00da, B:10:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:65:0x029f, B:27:0x0102, B:23:0x00da, B:10:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:65:0x029f, B:27:0x0102, B:23:0x00da, B:10:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:65:0x029f, B:27:0x0102, B:23:0x00da, B:10:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x029f, B:27:0x0102, B:23:0x00da, B:10:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:65:0x029f, B:27:0x0102, B:23:0x00da, B:10:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        int iM3169;
        int i;
        int i2;
        int i3 = C0269.f1558;
        int i4 = C1146.f4234;
        int iM31610 = (C0773.m3169("ܶ᩺") ^ i3) * 13;
        int i5 = ((iM31610 ^ i4) * 9049) ^ (-1507968708);
        String strM9343 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = iM31610 ^ (-819500561);
        int iM2761 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1497865211;
        int i16 = 0;
        String[] strArr = null;
        String strM43840 = null;
        String strM9937 = null;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * 10271) >> 31));
            switch (i15) {
                case -2030829391:
                case 421937047:
                    strM9343 = C2834.m9343(sArr3, 98, 3, i12);
                    if (C1343.m4943()) {
                        iM3169 = C0773.m3169("ۛܺ") ^ i4;
                        i = ((iM3169 ^ i3) * 5253) ^ (-404370038);
                        i2 = -792684111;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۚ۠")) * 75;
                        i = ((iM3169 ^ i3) * (-11055)) ^ (-114563866);
                        i2 = 1792734967;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1983429713:
                case -34920404:
                    C1343.m4943();
                    RunnableC3055.m9933();
                    return null;
                case -1447718224:
                case -534536231:
                    sArr = f67544;
                    c = ']';
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19651)) ^ (-1163909409);
                        i2 = -2082206724;
                    } else {
                        iM3169 = C0773.m3169("ܺܽ") ^ i3;
                        i = ((iM3169 ^ i4) * (-2191)) ^ (-1568957647);
                        i2 = 2075554044;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1398648979:
                case -519473227:
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("᩸ᩳ") + i4) * (-35);
                        i = ((iM3169 ^ i3) * (-26881)) ^ (-924863735);
                        i2 = 589263173;
                    } else {
                        iM3169 = (C0773.m3169("ۤܺ") + i4) * (-83);
                        i = ((iM3169 ^ i3) * (-9767)) ^ 1141032074;
                        i2 = -276045820;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1266668032:
                case -763493660:
                    i13 = s * s2;
                    i14 = s * s;
                    i16 = 291145969;
                    if (C17202.m40372()) {
                        iM3169 = (C0619.m2761("ۡۨ") + i4) * (-3);
                        i = ((iM3169 ^ i3) * 8299) ^ (-8868104);
                        i2 = -501513358;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۤ֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i4) * 27829) ^ (-1776867116);
                        i2 = 1775217627;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1001368576:
                case 1769357869:
                    strM9937 = RunnableC3055.m9937(sArr2, i8, i9, i12);
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i4) * 27829) ^ (-1776867116);
                        i2 = 1775217627;
                    } else {
                        iM3169 = (C0773.m3169("ܰۙ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM3169 ^ i4) * 7227) ^ (-76100228);
                        i2 = 2138520523;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -644563997:
                case -30976258:
                    C0619.m2763();
                    if (C2310.m7813() <= 0) {
                        iM3169 = (C0773.m3169("ۤܺ") + i4) * (-83);
                        i = ((iM3169 ^ i3) * (-9767)) ^ 1141032074;
                        i2 = -276045820;
                    } else {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19651)) ^ (-1163909409);
                        i2 = -2082206724;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -465897233:
                case 1425018784:
                    s = sArr[c];
                    s2 = 34126;
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (i4 - C0773.m3169("ۚ۠")) * 75;
                        i = ((iM3169 ^ i3) * (-11055)) ^ (-114563866);
                        i2 = 1792734967;
                    } else {
                        iM3169 = (C0773.m3169("ۗۢ") + i4) * 119;
                        i = ((iM3169 ^ i3) * (-29007)) ^ 1337566480;
                        i2 = -626101041;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -226801744:
                case 1544648127:
                    i10 = 101;
                    i11 = 3;
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19651)) ^ (-1163909409);
                        i2 = -2082206724;
                    } else {
                        iM3169 = C0619.m2761("ۚۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 12413) ^ (-227983829);
                        i2 = 1770925316;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -216991599:
                case 1342575533:
                    C4282.m13644();
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ۤܺ") + i4) * (-83);
                        i = ((iM3169 ^ i3) * (-9767)) ^ 1141032074;
                        i2 = -276045820;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۚ۠")) * 75;
                        i = ((iM3169 ^ i3) * (-11055)) ^ (-114563866);
                        i2 = 1792734967;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -15411232:
                case 602978100:
                    strArr = new String[]{strM43840, AbstractC0116.m1244(iM2761 ^ i7)};
                    sArr4 = f67544;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19651)) ^ (-1163909409);
                        i2 = -2082206724;
                    } else {
                        iM3169 = (C0619.m2761("᩷ܿ") + i3) * 5;
                        i = ((iM3169 ^ i4) * 15321) ^ 1502840758;
                        i2 = 503997779;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 8958579:
                case 1750233297:
                    strM43840 = m43840(strM9937);
                    sArr3 = f67544;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i4) * 27829) ^ (-1776867116);
                        i2 = 1775217627;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31611 = C0773.m3169("۫۠") ^ i3;
                        i5 = ((iM31611 ^ i4) * 24421) ^ (-1596505010);
                        i6 = iM31611 ^ (-1447934469);
                    }
                    break;
                case 210424567:
                case 227999569:
                    if (i13 - (i14 + i16) > 0) {
                        iM3169 = (i3 - C0619.m2761("᩹ᩴ")) * (-7);
                        i = ((iM3169 ^ i4) * 28123) ^ (-1191293954);
                        i2 = 2018915460;
                    } else {
                        iM3169 = C0773.m3169("֫ᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * 11669) ^ (-652413248);
                        i2 = 2075637153;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 602936057:
                case 1187540563:
                    return C3734.m12148(C0773.m3169(AbstractC0641.m2820(sArr4, i10, i11, i12)) ^ 2129533699, strArr);
                case 668273660:
                case 1237697209:
                    C4238.m13540();
                    C2023.m6964();
                    iM3169 = (C0619.m2761("᩸ᩳ") + i4) * (-35);
                    i = ((iM3169 ^ i3) * (-26881)) ^ (-924863735);
                    i2 = 589263173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 759684268:
                case 1622744076:
                    iM2761 = C0619.m2761(strM9343);
                    i7 = 2097324038;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i4) * 27829) ^ (-1776867116);
                        i2 = 1775217627;
                    } else {
                        iM3169 = (C0619.m2761("ܺᩴ") + i4) * (-41);
                        i = ((iM3169 ^ i3) * 24499) ^ (-411676011);
                        i2 = -1617468656;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1000453110:
                case 1087023328:
                    sArr2 = f67544;
                    i8 = 94;
                    i9 = 4;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i4) * 27829) ^ (-1776867116);
                        i2 = 1775217627;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۫᩻")) * (-31);
                        i = ((iM3169 ^ i3) * (-23967)) ^ 893521792;
                        i2 = -937654017;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1228549907:
                case 1425139607:
                    i12 = 2974;
                    iM3169 = (C0773.m3169("۬᩵") + i4) * 115;
                    i = ((iM3169 ^ i3) * (-6227)) ^ (-195076928);
                    i2 = 104540433;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i12 = 25933;
                    iM3169 = (C0773.m3169("۬᩵") + i4) * 115;
                    i = ((iM3169 ^ i3) * (-6227)) ^ (-195076928);
                    i2 = 104540433;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        Iterator itM13647 = null;
        AbstractC22044 abstractC22044 = null;
        int i = 190200996;
        int i2 = C2834.f9334;
        int i3 = C2375.f7641;
        int iM3169 = C0773.m3169("ۨۖ") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-24763)) ^ (-1807168565);
        int i5 = -77610626;
        while (true) {
            i = ((((i ^ i3) * 23777) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2065331393:
                case 1301921176:
                    RunnableC0334.m2063();
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("᩸۬") ^ i2) * (-73);
                        i4 = ((iM3169 ^ i3) * (-32093)) ^ (-1583340892);
                        i5 = 1914337787;
                    } else {
                        iM3169 = (C0619.m2761("۫۠") + i2) * (-37);
                        i4 = ((iM3169 ^ i3) * 18119) ^ (-1423530467);
                        i5 = -899267995;
                    }
                    break;
                case -1885518584:
                case -116385029:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-81);
                        i4 = ((iM3169 ^ i2) * (-19095)) ^ 1684352946;
                        i5 = -102932762;
                    } else {
                        iM3169 = (C0773.m3169("۬᩵") + i3) * (-115);
                        i4 = ((iM3169 ^ i2) * 24265) ^ (-870423566);
                        i5 = 774042800;
                    }
                    break;
                case -1671737688:
                case 692154661:
                    C17202.m40378(abstractC22044);
                    iM3169 = C0773.m3169("ᩴۚ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-14807)) ^ 1139260835;
                    i5 = 491584124;
                    break;
                case -1623797913:
                case 254881263:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-81);
                        i4 = ((iM3169 ^ i2) * (-19095)) ^ 1684352946;
                        i5 = -102932762;
                    } else {
                        iM3169 = C0619.m2761("ܿ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7571)) ^ (-86739327);
                        i5 = 978030385;
                    }
                    break;
                case -1520908161:
                case 856829251:
                    if (C2878.m9491() <= 0) {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-81);
                        i4 = ((iM3169 ^ i2) * (-19095)) ^ 1684352946;
                        i5 = -102932762;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܳ") ^ i2) * (-95);
                        i4 = ((iM3169 ^ i3) * 28721) ^ (-1080062302);
                        i5 = -289275111;
                    }
                    break;
                case -1461730178:
                case 1669123202:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-81);
                        i4 = ((iM3169 ^ i2) * (-19095)) ^ 1684352946;
                        i5 = -102932762;
                    } else {
                        iM3169 = C0773.m3169("ۨᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10837) ^ 566190529;
                        i5 = -337073262;
                    }
                    break;
                case -1290212127:
                case 1789291046:
                    if (C3690.m11994(c12187)) {
                        iM3169 = C0773.m3169("ᩴۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14807)) ^ 1139260835;
                        i5 = 491584124;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩹") ^ i3) * (-83);
                        i4 = ((iM3169 ^ i2) * (-31551)) ^ (-1934887272);
                        i5 = 1164303290;
                    }
                    break;
                case -1273583552:
                case 1486962344:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-81);
                        i4 = ((iM3169 ^ i2) * (-19095)) ^ 1684352946;
                        i5 = -102932762;
                    } else {
                        iM3169 = C0773.m3169("ۨۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20825)) ^ 1200603331;
                        i5 = -1059836895;
                    }
                    break;
                case -1264654631:
                case 330873433:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩶") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i3) * 28393) ^ (-162275484);
                        i5 = 751105578;
                    } else {
                        iM3169 = (C0619.m2761("֡ۘ") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * (-26793)) ^ 1874731053;
                        i5 = -1556369799;
                    }
                    break;
                case -1190895422:
                case 1370878506:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-81);
                        i4 = ((iM3169 ^ i2) * (-19095)) ^ 1684352946;
                        i5 = -102932762;
                    } else {
                        iM3169 = (C0773.m3169("ܿۜ") + i2) * (-37);
                        i4 = ((iM3169 ^ i3) * (-4375)) ^ 1205152527;
                        i5 = 1407624216;
                    }
                    break;
                case -849607351:
                case 843393373:
                    if (C1826.m6317(itM13647)) {
                        iM3169 = (C0773.m3169("֫ᩴ") ^ i2) * 61;
                        i4 = ((iM3169 ^ i3) * 3381) ^ (-1181978187);
                        i5 = 211348003;
                    } else {
                        iM3169 = C0773.m3169("۬ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14607) ^ (-288203791);
                        i5 = 971753456;
                    }
                    break;
                case -640555065:
                case 263149278:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩶") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i3) * 28393) ^ (-162275484);
                        i5 = 751105578;
                    } else {
                        iM3169 = (C0773.m3169("᩺֨") ^ i3) * 35;
                        i4 = ((iM3169 ^ i2) * 26221) ^ (-977070419);
                        i5 = -1724776025;
                    }
                    break;
                case -400845706:
                case -104705313:
                    C3734.m12147((AbstractC22044) C0950.m3796(itM13647));
                    iM3169 = C0619.m2761("֨ۙ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 24477) ^ 840977452;
                    i5 = -1182652671;
                    break;
                case -311840434:
                case 1376154954:
                    itM13647 = C4282.m13647(this.f67546);
                    iM3169 = C0619.m2761("֨ۙ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 24477) ^ 840977452;
                    i5 = -1182652671;
                    break;
                case -151266593:
                case 1295355469:
                    C1519.m5412();
                    break;
                case -59381159:
                case 1389286508:
                    C13473.m33144();
                    if (!C4282.m13644()) {
                        iM3169 = (C0619.m2761("۫۠") + i2) * (-37);
                        i4 = ((iM3169 ^ i3) * 18119) ^ (-1423530467);
                        i5 = -899267995;
                    } else {
                        iM3169 = C0619.m2761("ۙܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 791) ^ 1598596683;
                        i5 = 243773242;
                    }
                    break;
                case -42092979:
                case 1079966146:
                    C1542.m5459();
                    iM3169 = C0619.m2761("ۙܶ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 791) ^ 1598596683;
                    i5 = 243773242;
                    break;
                case 296168135:
                case 2020926092:
                    C4238.m13540();
                    if (C3734.f12817 < 0) {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i3) * (-81);
                        i4 = ((iM3169 ^ i2) * (-19095)) ^ 1684352946;
                        i5 = -102932762;
                    } else {
                        iM3169 = C0619.m2761("ۙܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 791) ^ 1598596683;
                        i5 = 243773242;
                    }
                    break;
                case 431074349:
                case 1963122029:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("᩸۬") ^ i2) * (-73);
                        i4 = ((iM3169 ^ i3) * (-32093)) ^ (-1583340892);
                        i5 = 1914337787;
                    } else {
                        iM3169 = (C0773.m3169("۬᩺") ^ i3) * (-21);
                        i4 = ((iM3169 ^ i2) * (-4757)) ^ (-1757269709);
                        i5 = 1523810430;
                    }
                    break;
                case 1089671218:
                case 2107066707:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0619.m2761("ۙܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 791) ^ 1598596683;
                        i5 = 243773242;
                    } else {
                        iM3169 = C0619.m2761("ᩳ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 3819) ^ 1835187835;
                        i5 = -1069331656;
                    }
                    break;
                case 1174518130:
                case 1585942452:
                    abstractC22044 = this.f67545;
                    if (abstractC22044 != null) {
                        iM3169 = C0773.m3169("ۚۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29415) ^ (-960084136);
                        i5 = -753786830;
                    } else {
                        iM3169 = C0773.m3169("ᩴۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14807)) ^ 1139260835;
                        i5 = 491584124;
                    }
                    break;
                default:
                    C3077.m10041();
                    AbstractC0116.m1243();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        int i = -2083199951;
        int i2 = C2354.f7599;
        int i3 = C1146.f4234;
        int iM3169 = C0773.m3169("۬ܺ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-21123)) ^ (-1106530833);
        int i5 = -1688350211;
        while (true) {
            i = ((((i ^ i2) * 7779) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1965198933:
                case 221815661:
                    break;
                case -1929236342:
                case -1205959096:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ᩴ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13039)) ^ 842079529;
                        i5 = 196608096;
                    } else {
                        iM3169 = C0773.m3169("ۤۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25295) ^ (-706087627);
                        i5 = 686474180;
                    }
                    break;
                case -1875538028:
                case 95192432:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("ۤۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25295) ^ (-706087627);
                        i5 = 686474180;
                    } else {
                        iM3169 = C0773.m3169("ۜۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19121) ^ 1410274510;
                        i5 = -881323973;
                    }
                    break;
                case -1815046899:
                case 1041312346:
                    if (m43863(c8614)) {
                        iM3169 = C0773.m3169("ۚۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28531) ^ (-75299368);
                        i5 = 147800092;
                    } else {
                        iM3169 = C0619.m2761("֨ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13711) ^ (-841684139);
                        i5 = 448646676;
                    }
                    break;
                case -1759715745:
                case 222572374:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩸") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * (-16713)) ^ 893101636;
                        i5 = 2067256496;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۤ") + i3) * 15;
                        i4 = ((iM3169 ^ i2) * 5859) ^ 438920690;
                        i5 = -256807502;
                    }
                    break;
                case -1687064265:
                case 1528349397:
                    if (C3099.m10095()) {
                        iM3169 = (C0619.m2761("ۘ᩸") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * (-16713)) ^ 893101636;
                        i5 = 2067256496;
                    } else {
                        iM3169 = (C0619.m2761("ۗܺ") ^ i3) * (-79);
                        i4 = ((iM3169 ^ i2) * 12617) ^ 345894048;
                        i5 = 493043374;
                    }
                    break;
                case -1680128140:
                case 1196823083:
                    C1783.m6232();
                    iM3169 = C0773.m3169("ۤۤ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 25295) ^ (-706087627);
                    i5 = 686474180;
                    break;
                case -1655125791:
                case -1181227090:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("ܰۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32617)) ^ 1915869143;
                        i5 = 825405633;
                    } else {
                        iM3169 = C0773.m3169("ۜ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11661)) ^ (-22107879);
                        i5 = -339341148;
                    }
                    break;
                case -1588437769:
                case -982673524:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩸") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * (-16713)) ^ 893101636;
                        i5 = 2067256496;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13039)) ^ 842079529;
                        i5 = 196608096;
                    }
                    break;
                case -1476553197:
                case -998374254:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("᩻ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30099)) ^ 920692705;
                        i5 = -1877299261;
                    } else {
                        iM3169 = C0773.m3169("᩷ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 313) ^ (-693220910);
                        i5 = 1055169139;
                    }
                    break;
                case -1428412184:
                case -76441977:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ᩴ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13039)) ^ 842079529;
                        i5 = 196608096;
                    } else {
                        iM3169 = C0773.m3169("ᩳۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6859)) ^ 1315536103;
                        i5 = 542108499;
                    }
                    break;
                case -1366841175:
                case 946271587:
                    if (C1542.m5458(c12187)) {
                        iM3169 = C0773.m3169("ܽܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2695) ^ 1135232331;
                        i5 = 598289561;
                    } else {
                        iM3169 = C0619.m2761("֨ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13711) ^ (-841684139);
                        i5 = 448646676;
                    }
                    break;
                case -1255183494:
                case 543211161:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("ܰۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32617)) ^ 1915869143;
                        i5 = 825405633;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩸") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * (-16713)) ^ 893101636;
                        i5 = 2067256496;
                    }
                    break;
                case -1198909740:
                case -695749521:
                    C1542.m5459();
                    RunnableC3646.m11813();
                    break;
                case -1195981479:
                case 1019174446:
                    C0619.m2762(c8614, C3998.m12926(this.f67545));
                    c8614.m23216();
                    iM3169 = C0619.m2761("֨ۗ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 13711) ^ (-841684139);
                    i5 = 448646676;
                    break;
                case -1083909594:
                case 876660663:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("ۤۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25295) ^ (-706087627);
                        i5 = 686474180;
                    } else {
                        iM3169 = (C0773.m3169("ۖۤ") ^ i3) * 37;
                        i4 = ((iM3169 ^ i2) * (-2195)) ^ 461654494;
                        i5 = -351287145;
                    }
                    break;
                case 1079787593:
                case 1788869099:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩸") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * (-16713)) ^ 893101636;
                        i5 = 2067256496;
                    } else {
                        iM3169 = (C0773.m3169("۬ۘ") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * (-7173)) ^ (-915075435);
                        i5 = -1772818613;
                    }
                    break;
                case 1539285437:
                case 1769230127:
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("᩵֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31519) ^ 487201709;
                        i5 = -1541146639;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13039)) ^ 842079529;
                        i5 = 196608096;
                    }
                    break;
                default:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("᩻ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30099)) ^ 920692705;
                        i5 = -1877299261;
                    } else {
                        iM3169 = C0773.m3169("ۛۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22271) ^ (-1441834371);
                        i5 = 704066914;
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
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final l.C12187 mo2531() {
        /*
            Method dump skipped, instruction units count: 11724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21159.mo2531():l.ۨۜۧ");
    }
}
