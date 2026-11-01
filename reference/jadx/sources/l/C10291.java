package l;

import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5MV */
/* JADX INFO: loaded from: classes4.dex */
public class C10291 extends AbstractC23941 {

    /* JADX INFO: renamed from: ᩵ܳۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f35040 = {1771, 27590, -22210, 26271, 21766, -20310, 22990, 3634, 23235, -25938, -25911, 5897, 23828, 23835, 23838, 23831, 23810, 23827, 23825, 23833, 23827, 23829, 23831, 23868, 23827, 23839, 23831, 23836, 23831, 23813, 23842, 23827, 23825, 23833, 23827, 23829, 23831, 23868, 23827, 23839, 23831, 23815, 23809, 23831, 23869, 23838, 23830, 23871, 23831, 23814, 23834, 23837, 23830, 23833, 23831, 23831, 23810, 23859, 23810, 23833, 23841, 23835, 23829, 23856, 23838, 23837, 23825, 23833, 23853, 23825, 23838, 23837, 23836, 23831, 23900, 23814, 23839, 23810, 7640, -21166, -21155, -21160, -21167, 14765, -1627, -10364, 10422, 12858, -7229};

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f35041;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f35042;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo12168() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0198 A[PHI: r3 r9 r14 r15
      0x0198: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:48:0x0196, B:25:0x00b4, B:11:0x006c, B:7:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:48:0x0196, B:25:0x00b4, B:11:0x006c, B:7:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r14v3 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:48:0x0196, B:25:0x00b4, B:11:0x006c, B:7:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r15v3 int) = (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:48:0x0196, B:25:0x00b4, B:11:0x006c, B:7:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01cc A[PHI: r7 r8 r21
      0x01cc: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:52:0x01ca, B:33:0x00fe, B:14:0x0075, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:52:0x01ca, B:33:0x00fe, B:14:0x0075, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r21v4 int) = (r21v1 int), (r21v2 int), (r21v1 int), (r21v1 int) binds: [B:52:0x01ca, B:33:0x00fe, B:14:0x0075, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021f A[PHI: r11 r12 r13 r22
      0x021f: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:60:0x021d, B:37:0x0120, B:14:0x0075, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:60:0x021d, B:37:0x0120, B:14:0x0075, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:60:0x021d, B:37:0x0120, B:14:0x0075, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:60:0x021d, B:37:0x0120, B:14:0x0075, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024f A[PHI: r2 r5 r6 r16
      0x024f: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:64:0x024d, B:56:0x0201, B:29:0x00d8, B:21:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:64:0x024d, B:56:0x0201, B:29:0x00d8, B:21:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:64:0x024d, B:56:0x0201, B:29:0x00d8, B:21:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x024d, B:56:0x0201, B:29:0x00d8, B:21:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM45029;
        int i;
        int i2;
        String strM7082 = null;
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
        int i10 = 935204949;
        int i11 = C1461.f5957;
        int i12 = C1668.f6641;
        int iM11306 = ThreadFactoryC3888.m11306("᩺֡") ^ i12;
        int i13 = ((iM11306 ^ i11) * 20591) ^ (-555244831);
        int i14 = iM11306 ^ 347532855;
        short[] sArr3 = null;
        int i15 = 0;
        int iM11307 = 0;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 7635) >> 31));
            switch (i10) {
                case -2083571505:
                case -1975589285:
                    sArr3 = f35040;
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("᩸ۘ") + i12) * (-67);
                        i = ((iM45029 ^ i11) * 15711) ^ (-2049629578);
                        i2 = 346568925;
                    } else {
                        iM45029 = C19806.m45029("֫ۘ") ^ i12;
                        i = ((iM45029 ^ i11) * 19191) ^ (-499683678);
                        i2 = -1982719483;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1956168993:
                case 290193432:
                    i5 = 354079489;
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("᩻֨") ^ i11;
                        i = ((iM45029 ^ i12) * 18811) ^ 2059037976;
                        i2 = 1462437506;
                    } else {
                        iM45029 = C19806.m45029("֨᩹") ^ i12;
                        i = ((iM45029 ^ i11) * (-9577)) ^ 1098002945;
                        i2 = -931243369;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1814902765:
                case 1594130393:
                    if (i3 - (i4 + i5) <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۨ") ^ i11;
                        i = ((iM45029 ^ i12) * (-5233)) ^ 279747855;
                        i2 = -821929380;
                    } else {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۛ۫")) * 89;
                        i = ((iM45029 ^ i11) * (-45)) ^ (-1649115909);
                        i2 = 1658837975;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1754824121:
                case -1529569548:
                    i6 = 14695;
                    iM45029 = (ThreadFactoryC3888.m11306("ۜ᩺") ^ i11) * 21;
                    i = ((iM45029 ^ i12) * (-27783)) ^ (-1396858914);
                    i2 = -393993298;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1718697290:
                case 644268514:
                    s = sArr3[c];
                    s2 = 37634;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("᩸ۘ") + i12) * (-67);
                        i = ((iM45029 ^ i11) * 15711) ^ (-2049629578);
                        i2 = 346568925;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟۟") ^ i11;
                        i = ((iM45029 ^ i12) * 27189) ^ 730370683;
                        i2 = -1245128724;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1694707870:
                case 1332754291:
                    sArr2 = f35040;
                    i9 = 4;
                    i15 = 3;
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("᩻֨") ^ i11;
                        i = ((iM45029 ^ i12) * 18811) ^ 2059037976;
                        i2 = 1462437506;
                    } else {
                        iM45029 = C19806.m45029("᩵֨") ^ i12;
                        i = ((iM45029 ^ i11) * 11519) ^ (-633494567);
                        i2 = 1981886815;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1547875128:
                case 1297330334:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = C19806.m45029("᩻֨") ^ i11;
                        i = ((iM45029 ^ i12) * 18811) ^ 2059037976;
                        i2 = 1462437506;
                    } else {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("᩺ۚ")) * (-67);
                        i = ((iM45029 ^ i12) * (-25741)) ^ (-1412176614);
                        i2 = -955163522;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1461818833:
                case -867979041:
                    sArr = f35040;
                    i7 = 1;
                    i8 = 3;
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩸") ^ i11;
                        i = ((iM45029 ^ i12) * 32019) ^ 1011257292;
                        i2 = -1196517280;
                    } else {
                        iM45029 = C19806.m45029("ۚܺ") ^ i12;
                        i = ((iM45029 ^ i11) * (-29795)) ^ 2048315308;
                        i2 = 1049795360;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1303728306:
                case -1286801495:
                    C1377.m4841(this, iM11307 ^ 2119829869);
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("᩸ۘ") + i12) * (-67);
                        i = ((iM45029 ^ i11) * 15711) ^ (-2049629578);
                        i2 = 346568925;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽܶ") + i11) * (-65);
                        i = ((iM45029 ^ i12) * (-22725)) ^ 136042216;
                        i2 = -1050624841;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -1209148481:
                case 256704940:
                    AbstractC0464.m2313();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = (C19806.m45029("ᩳ۫") + i12) * 49;
                        i = ((iM45029 ^ i11) * 4641) ^ 75035342;
                        i2 = -1225128259;
                    } else {
                        iM45029 = C19806.m45029("ۚܺ") ^ i12;
                        i = ((iM45029 ^ i11) * (-29795)) ^ 2048315308;
                        i2 = 1049795360;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -877649280:
                case -148947097:
                    i6 = 51911;
                    iM45029 = (ThreadFactoryC3888.m11306("ۜ᩺") ^ i11) * 21;
                    i = ((iM45029 ^ i12) * (-27783)) ^ (-1396858914);
                    i2 = -393993298;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -523542595:
                case 1273151383:
                    iM11307 = ThreadFactoryC3888.m11306(C0216.m1588(sArr, i7, i8, i6));
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ᩳ۫") + i12) * 49;
                        i = ((iM45029 ^ i11) * 4641) ^ 75035342;
                        i2 = -1225128259;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ᩷") ^ i12) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM45029 ^ i11) * 4977) ^ (-1354348211);
                        i2 = -39997017;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -514268141:
                case 2125487579:
                    strM7082 = C2332.m7082(sArr2, i9, i15, i6);
                    if (C0526.m2437() >= 0) {
                        iM45029 = (C19806.m45029("᩸ۘ") + i12) * (-67);
                        i = ((iM45029 ^ i11) * 15711) ^ (-2049629578);
                        i2 = 346568925;
                    } else {
                        iM45029 = C19806.m45029("ۧۜ") ^ i11;
                        i = ((iM45029 ^ i12) * (-20979)) ^ (-1400689629);
                        i2 = 296689021;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case -307416657:
                case 2110387288:
                    i3 = s * s2;
                    i4 = s * s;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ᩳ۫") + i12) * 49;
                        i = ((iM45029 ^ i11) * 4641) ^ 75035342;
                        i2 = -1225128259;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۧ") ^ i12;
                        i = ((iM45029 ^ i11) * 26247) ^ 669619481;
                        i2 = -2043291895;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case 400104306:
                case 514342935:
                    c = 0;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("ۚܺ") ^ i12;
                        i = ((iM45029 ^ i11) * (-29795)) ^ 2048315308;
                        i2 = 1049795360;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۛ") ^ i11;
                        i = ((iM45029 ^ i12) * (-5755)) ^ 1859788440;
                        i2 = -1041554315;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case 424158537:
                case 1651192363:
                    C1937.m6279();
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ۚܺ") ^ i12;
                        i = ((iM45029 ^ i11) * (-29795)) ^ 2048315308;
                        i2 = 1049795360;
                    } else {
                        iM45029 = C19806.m45029("᩻֨") ^ i11;
                        i = ((iM45029 ^ i12) * 18811) ^ 2059037976;
                        i2 = 1462437506;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
                case 1238039563:
                case 2002174717:
                    m41562(ThreadFactoryC3888.m11306(strM7082) ^ 2125852426);
                    break;
                case 1239387002:
                case 1444592976:
                    C2871.m8646();
                    C0962.m3746();
                    break;
                default:
                    C1419.m4973();
                    iM45029 = (C19806.m45029("ᩳ۫") + i12) * 49;
                    i = ((iM45029 ^ i11) * 4641) ^ 75035342;
                    i2 = -1225128259;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5722;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        int i = 1511133793;
        int i2 = AbstractC0464.f2088;
        int i3 = C3722.f13525;
        int iM45029 = C19806.m45029("ܰ֨") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-9017)) ^ (-1712449824);
        int i5 = 130088429;
        while (true) {
            i = ((((i ^ i2) * (-4605)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2129368560:
                case -1189946892:
                    if (C2477.m7593() >= 0) {
                        iM45029 = C19806.m45029("ᩴۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2903)) ^ (-205420951);
                        i5 = -75077927;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9937)) ^ 964570248;
                        i5 = 364417566;
                    }
                    break;
                case -2038147088:
                case -848515364:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("۫۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6581)) ^ (-550277086);
                        i5 = 835011780;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5633) ^ (-1974173267);
                        i5 = -928965352;
                    }
                    break;
                case -1890840669:
                case -711970434:
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("֡ᩴ") + i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-9201)) ^ (-1945653844);
                        i5 = -956388499;
                    } else {
                        iM45029 = (C19806.m45029("ۢۖ") ^ i3) * (-61);
                        i4 = ((iM45029 ^ i2) * (-21279)) ^ 227133631;
                        i5 = -291403702;
                    }
                    break;
                case -1734887162:
                case -1543509026:
                    C0671.m3008();
                    iM45029 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * 45;
                    i4 = ((iM45029 ^ i2) * 28861) ^ 2100555789;
                    i5 = -1338952532;
                    break;
                case -1728194711:
                case 759103440:
                    if (m41579(c11545)) {
                        iM45029 = C19806.m45029("᩺᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22493) ^ (-1985836733);
                        i5 = 1683761436;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 767) ^ 912046467;
                        i5 = 2042500649;
                    }
                    break;
                case -1490485087:
                case 1456985821:
                    if (C0671.f2816 != 0) {
                        iM45029 = (i2 - C19806.m45029("ܰ۠")) * 47;
                        i4 = ((iM45029 ^ i3) * (-22127)) ^ 1365952021;
                        i5 = 1222274090;
                    } else {
                        iM45029 = C19806.m45029("ۡ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13695) ^ 723773015;
                        i5 = -1140807620;
                    }
                    break;
                case -1343946145:
                case 818315234:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13777) ^ 226365144;
                        i5 = -1115628577;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 767) ^ 912046467;
                        i5 = 2042500649;
                    }
                    break;
                case -1059128127:
                case 1166469793:
                    if (C3743.f13569) {
                        iM45029 = (i2 - C19806.m45029("ܰۤ")) * (-53);
                        i4 = ((iM45029 ^ i3) * 12137) ^ 90245054;
                        i5 = 1022602386;
                    } else {
                        iM45029 = (C19806.m45029("֡ᩴ") + i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-9201)) ^ (-1945653844);
                        i5 = -956388499;
                    }
                    break;
                case -865436430:
                case 662427368:
                    C0050.m946();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    break;
                case -810580048:
                case 568086355:
                    break;
                case -553948187:
                case 805468767:
                    C19806.m45024();
                    if (C2477.f9839 > 0) {
                        iM45029 = C19806.m45029("۫۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6581)) ^ (-550277086);
                        i5 = 835011780;
                    } else {
                        iM45029 = (C19806.m45029("֡ᩴ") + i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-9201)) ^ (-1945653844);
                        i5 = -956388499;
                    }
                    break;
                case -463277905:
                case 996426959:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("֡ᩴ") + i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-9201)) ^ (-1945653844);
                        i5 = -956388499;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟᩺")) * (-117);
                        i4 = ((iM45029 ^ i3) * 13355) ^ 1235502022;
                        i5 = 1445138616;
                    }
                    break;
                case -304344662:
                case 1354111378:
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = C19806.m45029("۫۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6581)) ^ (-550277086);
                        i5 = 835011780;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܿ᩺")) * (-49);
                        i4 = ((iM45029 ^ i2) * (-1783)) ^ (-630427572);
                        i5 = 732065426;
                    }
                    break;
                case -144756395:
                case 1898911987:
                    ThreadFactoryC3888.m11300();
                    if (!RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * 45;
                        i4 = ((iM45029 ^ i2) * 28861) ^ 2100555789;
                        i5 = -1338952532;
                    } else {
                        iM45029 = (C19806.m45029("֡ᩴ") + i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-9201)) ^ (-1945653844);
                        i5 = -956388499;
                    }
                    break;
                case -123391517:
                case 1072926889:
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("۫۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6581)) ^ (-550277086);
                        i5 = 835011780;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۢܽ")) * (-11);
                        i4 = ((iM45029 ^ i3) * (-20425)) ^ (-1637610934);
                        i5 = -216701123;
                    }
                    break;
                case -104900660:
                case 582889039:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("֡ᩴ") + i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-9201)) ^ (-1945653844);
                        i5 = -956388499;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16715) ^ 730515583;
                        i5 = 1940470483;
                    }
                    break;
                case 1010684283:
                case 1636878609:
                    C10634.m26818(c11545, C3743.m10959(this.f35041));
                    c11545.m28830();
                    iM45029 = ThreadFactoryC3888.m11306("ۖᩳ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 767) ^ 912046467;
                    i5 = 2042500649;
                    break;
                case 1772564151:
                case 1935153174:
                    if (CallableC1627.m5507() == 0) {
                        iM45029 = (i2 - C19806.m45029("ܰ۠")) * 47;
                        i4 = ((iM45029 ^ i3) * (-22127)) ^ 1365952021;
                        i5 = 1222274090;
                    } else {
                        iM45029 = (C19806.m45029("֡ᩴ") + i3) * 23;
                        i4 = ((iM45029 ^ i2) * (-9201)) ^ (-1945653844);
                        i5 = -956388499;
                    }
                    break;
                default:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("۫۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6581)) ^ (-550277086);
                        i5 = 835011780;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31395) ^ (-222443792);
                        i5 = -512535054;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Throwable {
        int i;
        short[] sArr;
        int i2;
        short s;
        String strM3859;
        int i3;
        short[] sArr2;
        int i4;
        short[] sArr3;
        int i5;
        int i6;
        String str;
        short[] sArr4;
        int i7;
        int i8;
        int iM11306;
        int i9;
        short s2;
        String str2;
        int i10;
        short[] sArr5;
        int i11;
        short[] sArr6;
        int i12;
        int i13;
        String str3;
        short[] sArr7;
        int iM45029;
        int i14;
        int i15;
        int i16;
        String str4;
        short[] sArr8;
        int i17;
        int i18;
        short s3;
        String str5;
        int i19;
        short[] sArr9;
        int i20;
        short[] sArr10;
        int i21;
        int i22;
        String str6;
        short[] sArr11;
        AbstractC20745 abstractC20745M41587;
        int iM450210;
        int i23;
        int i24;
        int i25;
        short[] sArr12;
        int i26;
        int i27;
        int iM450211;
        int i28;
        int i29;
        int iM450212;
        int i30;
        int i31;
        int iM11307;
        int i32;
        int i33;
        int iM450213;
        int i34;
        int iM450214;
        int i35;
        this = this;
        int i36 = -1247569231;
        int i37 = AbstractC0464.f2088;
        int i38 = RunnableC0195.f1321;
        int iM450215 = (C19806.m45029("᩻ۧ") ^ i38) * (-65);
        int i39 = ((iM450215 ^ i37) * 32729) ^ (-1768233437);
        int i40 = iM450215 ^ (-1503363148);
        C14558 c14558M41593 = null;
        C8880 c8880 = null;
        String strM45020 = null;
        AbstractC20745 abstractC20745 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        int i41 = 0;
        short s4 = 0;
        AbstractC20745 abstractC20746 = null;
        boolean zM7070 = false;
        boolean zM1430 = false;
        char c = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        String str7 = null;
        String strM41585 = null;
        int i48 = 0;
        String strM41586 = null;
        short[] sArr17 = null;
        AbstractC20745 abstractC20747 = null;
        while (true) {
            i36 = i40 ^ (i39 & (((i36 ^ i37) * 30227) >> 31));
            switch (i36) {
                case -2035869971:
                case -1206219936:
                    C0797.m3359();
                    if (!RunnableC1895.f7152) {
                        i18 = i41;
                        s3 = s4;
                        abstractC20745M41587 = abstractC20746;
                        str5 = str7;
                        i19 = i43;
                        sArr9 = sArr14;
                        i20 = i44;
                        sArr10 = sArr16;
                        i21 = i46;
                        i22 = i47;
                        str6 = strM45020;
                        sArr11 = sArr15;
                        int iM450216 = C19806.m45029("ᩴۧ") ^ i37;
                        i40 = iM450216 ^ (-1442045105);
                        sArr14 = sArr9;
                        i44 = i20;
                        sArr15 = sArr11;
                        strM45020 = str6;
                        i46 = i21;
                        i47 = i22;
                        sArr16 = sArr10;
                        str7 = str5;
                        s4 = s3;
                        i41 = i18;
                        i43 = i19;
                        i39 = ((iM450216 ^ i38) * (-23633)) ^ (-18518437);
                        abstractC20746 = abstractC20745M41587;
                        this = this;
                    } else {
                        i16 = i41;
                        str4 = str7;
                        i43 = i43;
                        strM45020 = strM45020;
                        sArr8 = sArr15;
                        int iM450217 = C19806.m45029("۟ܰ") ^ i37;
                        i39 = ((iM450217 ^ i38) * (-14743)) ^ 682788598;
                        i40 = iM450217 ^ 1058285215;
                        this = this;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        str7 = str4;
                        i41 = i16;
                        i43 = i43;
                    }
                    break;
                case -2021505399:
                case -227692901:
                    C1977.m6356();
                    if (C1148.f5161 <= 0) {
                        i16 = i41;
                        str4 = str7;
                        i43 = i43;
                        strM45020 = strM45020;
                        sArr8 = sArr15;
                        int iM450218 = C19806.m45029("۟ܰ") ^ i37;
                        i39 = ((iM450218 ^ i38) * (-14743)) ^ 682788598;
                        i40 = iM450218 ^ 1058285215;
                        this = this;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        str7 = str4;
                        i41 = i16;
                        i43 = i43;
                    } else {
                        i48 = i48;
                        sArr17 = sArr17;
                        i25 = i41;
                        s4 = s4;
                        i43 = i43;
                        sArr12 = sArr16;
                        i26 = i46;
                        i27 = i47;
                        str7 = str7;
                        strM45020 = strM45020;
                        iM450211 = ThreadFactoryC3888.m11306("᩹ܶ") ^ i37;
                        i28 = ((iM450211 ^ i38) * 20731) ^ (-1110476042);
                        i29 = 320153860;
                        i40 = iM450211 ^ i29;
                        i41 = i25;
                        sArr16 = sArr12;
                        i46 = i26;
                        i47 = i27;
                        i39 = i28;
                        strM45020 = strM45020;
                        str7 = str7;
                        i43 = i43;
                        i48 = i48;
                        sArr17 = sArr17;
                        s4 = s4;
                    }
                    break;
                case -1831627013:
                case 1431007636:
                    this.mo21455(0);
                    AbstractC20745 abstractC20745M46692 = abstractC20746.m46692(strM45020);
                    this.f35041 = abstractC20745M46692;
                    C11005.m27762(this.f35042, abstractC20745M46692, c14558M41593, this);
                    iM450210 = (C19806.m45029("ۗۘ") ^ i38) * (-7);
                    i23 = ((iM450210 ^ i37) * (-30753)) ^ 2033247423;
                    i24 = 542713164;
                    i40 = iM450210 ^ i24;
                    i41 = i41;
                    i39 = i23;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case -1766054020:
                case 1288337424:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9866(this)) {
                        iM450214 = (C19806.m45029("᩹ܽ") ^ i38) * (-7);
                        i14 = ((iM450214 ^ i37) * (-3485)) ^ (-509842317);
                        i35 = -1938266528;
                    } else {
                        iM450214 = (C19806.m45029("ۜᩴ") + i38) * 55;
                        i14 = ((iM450214 ^ i37) * 15019) ^ 1900861681;
                        i35 = 1718556777;
                    }
                    i40 = iM450214 ^ i35;
                    i39 = i14;
                    break;
                case -1588509759:
                case 1896565702:
                    i9 = i41;
                    short s5 = s4;
                    str2 = str7;
                    sArr5 = sArr14;
                    i11 = i44;
                    sArr6 = sArr16;
                    i12 = i46;
                    i13 = i47;
                    str3 = strM45020;
                    short[] sArr18 = sArr15;
                    sArr17 = f35040;
                    i48 = 12;
                    if (C3535.f13026 <= 0) {
                        sArr15 = sArr18;
                        s2 = s5;
                        i10 = 4;
                        int iM450219 = (i38 - C19806.m45029("֨֨")) * 7;
                        i14 = ((iM450219 ^ i37) * 3889) ^ 919032655;
                        i40 = iM450219 ^ (-1026989531);
                        sArr14 = sArr5;
                        i44 = i11;
                        strM45020 = str3;
                        i46 = i12;
                        i47 = i13;
                        sArr16 = sArr6;
                        str7 = str2;
                        i41 = i9;
                        i43 = i10;
                        s4 = s2;
                        i39 = i14;
                    } else {
                        int iM450220 = C19806.m45029("ܽۨ") ^ i38;
                        i40 = iM450220 ^ (-1173096908);
                        this = this;
                        i39 = ((iM450220 ^ i37) * 24057) ^ (-644665195);
                        sArr14 = sArr5;
                        i44 = i11;
                        sArr15 = sArr18;
                        strM45020 = str3;
                        i46 = i12;
                        i47 = i13;
                        sArr16 = sArr6;
                        str7 = str2;
                        i41 = i9;
                        s4 = s5;
                        i43 = 4;
                    }
                    break;
                case -1519025554:
                case 1026093450:
                    return m41583();
                case -1468784480:
                case 657149810:
                    int i49 = i41;
                    strM45020 = strM45020;
                    AbstractC20745 abstractC20745M46693 = abstractC20746.m46692(strM45020);
                    this.f35041 = abstractC20745M46693;
                    if (zM7070) {
                        iM11307 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i37;
                        i32 = ((iM11307 ^ i38) * 6329) ^ 2042816980;
                        i33 = 779464882;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩵۫") ^ i38;
                        i32 = ((iM11307 ^ i37) * (-10055)) ^ 1451768518;
                        i33 = 2049613310;
                    }
                    i40 = iM11307 ^ i33;
                    i41 = i49;
                    abstractC20745 = abstractC20745M46693;
                    i39 = i32;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case -1359339370:
                case 1205114626:
                    i48 = i48;
                    sArr17 = sArr17;
                    int i50 = i41;
                    s4 = s4;
                    String str8 = str7;
                    i43 = i43;
                    short[] sArr19 = sArr16;
                    int i51 = i46;
                    int i52 = i47;
                    strM45020 = strM45020;
                    sArr8 = sArr15;
                    strM41585 = this.m41585(str8);
                    sArr14 = f35040;
                    i44 = 27;
                    i45 = 14;
                    if (C3743.f13569) {
                        int iM450221 = (C19806.m45029("ۤۤ") ^ i38) * (-49);
                        int i53 = ((iM450221 ^ i37) * 16401) ^ 1800065735;
                        i40 = iM450221 ^ (-542677923);
                        i41 = i50;
                        i46 = i51;
                        i47 = i52;
                        i39 = i53;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        sArr16 = sArr19;
                        i43 = i43;
                        i48 = i48;
                        sArr17 = sArr17;
                        s4 = s4;
                        str7 = str8;
                    } else {
                        i16 = i50;
                        str4 = str8;
                        i46 = i51;
                        i47 = i52;
                        sArr16 = sArr19;
                        i48 = i48;
                        sArr17 = sArr17;
                        s4 = s4;
                        int iM4502110 = C19806.m45029("۟ܰ") ^ i37;
                        i39 = ((iM4502110 ^ i38) * (-14743)) ^ 682788598;
                        i40 = iM4502110 ^ 1058285215;
                        this = this;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        str7 = str4;
                        i41 = i16;
                        i43 = i43;
                    }
                    break;
                case -1088796848:
                case 1989916941:
                    i48 = i48;
                    sArr17 = sArr17;
                    int i54 = i41;
                    s4 = s4;
                    i43 = i43;
                    str7 = str7;
                    strM45020 = C19806.m45020(f35040, 68, 6, i54);
                    if (c14558M41593 != null) {
                        iM450212 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i37;
                        i30 = ((iM450212 ^ i38) * (-30689)) ^ (-1320378469);
                        i31 = 790901968;
                    } else {
                        iM450212 = C19806.m45029("ܽᩴ") ^ i38;
                        i30 = ((iM450212 ^ i37) * 3981) ^ (-379573739);
                        i31 = -2063703050;
                    }
                    i40 = iM450212 ^ i31;
                    i41 = i54;
                    i39 = i30;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case -1073097451:
                case 1290187680:
                    i9 = i41;
                    s2 = s4;
                    str2 = str7;
                    i10 = i43;
                    sArr5 = sArr14;
                    i11 = i44;
                    sArr6 = sArr16;
                    i12 = i46;
                    i13 = i47;
                    str3 = strM45020;
                    sArr7 = sArr15;
                    sArr13 = f35040;
                    c = 11;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        iM45029 = (i37 - C19806.m45029("ۗ᩸")) * 115;
                        i14 = ((iM45029 ^ i38) * (-21109)) ^ (-602180051);
                        i15 = 1652715308;
                        i40 = iM45029 ^ i15;
                        sArr14 = sArr5;
                        i44 = i11;
                        sArr15 = sArr7;
                        strM45020 = str3;
                        i46 = i12;
                        i47 = i13;
                        sArr16 = sArr6;
                        str7 = str2;
                        i41 = i9;
                        i43 = i10;
                        s4 = s2;
                        i39 = i14;
                    } else {
                        sArr15 = sArr7;
                        int iM4502111 = (i38 - C19806.m45029("֨֨")) * 7;
                        i14 = ((iM4502111 ^ i37) * 3889) ^ 919032655;
                        i40 = iM4502111 ^ (-1026989531);
                        sArr14 = sArr5;
                        i44 = i11;
                        strM45020 = str3;
                        i46 = i12;
                        i47 = i13;
                        sArr16 = sArr6;
                        str7 = str2;
                        i41 = i9;
                        i43 = i10;
                        s4 = s2;
                        i39 = i14;
                    }
                    break;
                case -1039812595:
                case 1981037684:
                    C7468.m19956(abstractC20746, abstractC20745, zM1430, strM41585, strM41586, c8880);
                    iM450210 = (C19806.m45029("ۗۘ") ^ i38) * (-7);
                    i23 = ((iM450210 ^ i37) * (-30753)) ^ 2033247423;
                    i24 = 542713164;
                    i40 = iM450210 ^ i24;
                    i41 = i41;
                    i39 = i23;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case -805106260:
                case 285539151:
                    C2788.m8472();
                    i48 = i48;
                    sArr17 = sArr17;
                    i25 = i41;
                    s4 = s4;
                    i43 = i43;
                    sArr12 = sArr16;
                    i26 = i46;
                    i27 = i47;
                    str7 = str7;
                    strM45020 = strM45020;
                    iM450211 = ThreadFactoryC3888.m11306("᩹ܶ") ^ i37;
                    i28 = ((iM450211 ^ i38) * 20731) ^ (-1110476042);
                    i29 = 320153860;
                    i40 = iM450211 ^ i29;
                    i41 = i25;
                    sArr16 = sArr12;
                    i46 = i26;
                    i47 = i27;
                    i39 = i28;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case -795710277:
                case 1265935870:
                    C0962.m3746();
                    RunnableC0195.m1431();
                    return null;
                case -781234754:
                case 1525049944:
                    i16 = i41;
                    str4 = str7;
                    i43 = i43;
                    short[] sArr20 = sArr14;
                    int i55 = i44;
                    short[] sArr21 = sArr16;
                    int i56 = i46;
                    int i57 = i47;
                    strM45020 = strM45020;
                    sArr8 = sArr15;
                    short s6 = sArr13[c];
                    i42 = s6 * s6;
                    if (!C3743.f13569) {
                        sArr14 = sArr20;
                        i44 = i55;
                        i46 = i56;
                        i47 = i57;
                        sArr16 = sArr21;
                        s4 = s6;
                        int iM4502112 = C19806.m45029("۟ܰ") ^ i37;
                        i39 = ((iM4502112 ^ i38) * (-14743)) ^ 682788598;
                        i40 = iM4502112 ^ 1058285215;
                        this = this;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        str7 = str4;
                        i41 = i16;
                        i43 = i43;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ᩳܿ") ^ i38;
                        i40 = iM11308 ^ (-94532160);
                        i39 = ((iM11308 ^ i37) * (-11961)) ^ (-1390581674);
                        sArr14 = sArr20;
                        i44 = i55;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        i46 = i56;
                        i47 = i57;
                        sArr16 = sArr21;
                        str7 = str4;
                        i41 = i16;
                        i43 = i43;
                        s4 = s6;
                        this = this;
                    }
                    break;
                case -758674119:
                case 1551871544:
                    C7468.m19956(abstractC20746, abstractC20747, false, strM41585, strM41586, c8880);
                    iM450210 = C19806.m45029("֨ᩳ") ^ i37;
                    i23 = ((iM450210 ^ i38) * 28439) ^ (-438524603);
                    i24 = -824288880;
                    i40 = iM450210 ^ i24;
                    i41 = i41;
                    i39 = i23;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case -712540025:
                case 737380468:
                    i17 = 53973;
                    int iM450222 = C19806.m45029("۬ܺ") ^ i37;
                    i40 = iM450222 ^ 694755631;
                    i39 = ((iM450222 ^ i38) * (-16601)) ^ 1648922193;
                    sArr14 = sArr14;
                    i44 = i44;
                    sArr15 = sArr15;
                    strM45020 = strM45020;
                    i46 = i46;
                    i47 = i47;
                    sArr16 = sArr16;
                    str7 = str7;
                    i43 = i43;
                    s4 = s4;
                    i41 = i17;
                    this = this;
                    break;
                case -670511916:
                case 1846081047:
                    i = i48;
                    sArr = sArr17;
                    i2 = i41;
                    s = s4;
                    str = strM45020;
                    i3 = i43;
                    sArr2 = sArr14;
                    i4 = i44;
                    sArr4 = sArr15;
                    sArr3 = sArr16;
                    i5 = i46;
                    i6 = i47;
                    strM3859 = C1025.m3859(f35040, 16, 11, i2);
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i38;
                        i8 = ((iM11306 ^ i37) * (-22855)) ^ (-1896375609);
                        i7 = 1943405007;
                    } else {
                        iM11306 = (C19806.m45029("ۗ֫") ^ i38) * (-125);
                        i8 = ((iM11306 ^ i37) * 11527) ^ 1554399466;
                        i7 = -1374872413;
                    }
                    i40 = iM11306 ^ i7;
                    sArr14 = sArr2;
                    i44 = i4;
                    sArr15 = sArr4;
                    strM45020 = str;
                    i46 = i5;
                    i47 = i6;
                    sArr16 = sArr3;
                    i43 = i3;
                    i48 = i;
                    s4 = s;
                    i41 = i2;
                    str7 = strM3859;
                    i39 = i8;
                    sArr17 = sArr;
                    break;
                case -637767493:
                case 943868591:
                    C7468.m19958(abstractC20746, abstractC20745, zM1430, strM41585, strM41586, c8880);
                    iM450210 = (C19806.m45029("ۗۘ") ^ i38) * (-7);
                    i23 = ((iM450210 ^ i37) * (-30753)) ^ 2033247423;
                    i24 = 542713164;
                    i40 = iM450210 ^ i24;
                    i41 = i41;
                    i39 = i23;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case -268822828:
                case -21612483:
                    i48 = i48;
                    sArr17 = sArr17;
                    i41 = i41;
                    s4 = s4;
                    i43 = i43;
                    str7 = str7;
                    strM45020 = strM45020;
                    sArr16 = f35040;
                    i46 = 53;
                    i47 = 15;
                    if (C1189.f5284 > 0) {
                        iM450210 = C19806.m45029("ۨܽ") ^ i38;
                        i23 = ((iM450210 ^ i37) * 16841) ^ 1305042797;
                        i24 = -848022396;
                        i40 = iM450210 ^ i24;
                        i41 = i41;
                        i39 = i23;
                        strM45020 = strM45020;
                        str7 = str7;
                        i43 = i43;
                        i48 = i48;
                        sArr17 = sArr17;
                        s4 = s4;
                    } else {
                        i16 = i41;
                        str4 = str7;
                        sArr8 = sArr15;
                        i48 = i48;
                        sArr17 = sArr17;
                        s4 = s4;
                        int iM4502113 = C19806.m45029("۟ܰ") ^ i37;
                        i39 = ((iM4502113 ^ i38) * (-14743)) ^ 682788598;
                        i40 = iM4502113 ^ 1058285215;
                        this = this;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        str7 = str4;
                        i41 = i16;
                        i43 = i43;
                    }
                    break;
                case -158636979:
                case 1717653859:
                    i48 = i48;
                    sArr17 = sArr17;
                    int i58 = i41;
                    s4 = s4;
                    i43 = i43;
                    short[] sArr22 = sArr16;
                    int i59 = i46;
                    int i60 = i47;
                    str7 = str7;
                    strM45020 = strM45020;
                    sArr8 = sArr15;
                    zM7070 = C2332.m7070(this, C0526.m2424(sArr8, 41, 12, i58));
                    c14558M41593 = m41593();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        int iM11309 = (ThreadFactoryC3888.m11306("᩸ܿ") ^ i37) * 59;
                        int i61 = ((iM11309 ^ i38) * (-4911)) ^ 1739003274;
                        i40 = iM11309 ^ (-1597157475);
                        i41 = i58;
                        sArr16 = sArr22;
                        i46 = i59;
                        i47 = i60;
                        i39 = i61;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        str7 = str7;
                        i43 = i43;
                        i48 = i48;
                        sArr17 = sArr17;
                        s4 = s4;
                    } else {
                        i16 = i58;
                        sArr16 = sArr22;
                        i46 = i59;
                        i47 = i60;
                        str4 = str7;
                        i48 = i48;
                        sArr17 = sArr17;
                        s4 = s4;
                        int iM4502114 = C19806.m45029("۟ܰ") ^ i37;
                        i39 = ((iM4502114 ^ i38) * (-14743)) ^ 682788598;
                        i40 = iM4502114 ^ 1058285215;
                        this = this;
                        sArr15 = sArr8;
                        strM45020 = strM45020;
                        str7 = str4;
                        i41 = i16;
                        i43 = i43;
                    }
                    break;
                case 79409455:
                case 989414965:
                    C7468.m19958(abstractC20746, abstractC20747, false, strM41585, strM41586, c8880);
                    iM450210 = C19806.m45029("֨ᩳ") ^ i37;
                    i23 = ((iM450210 ^ i38) * 28439) ^ (-438524603);
                    i24 = -824288880;
                    i40 = iM450210 ^ i24;
                    i41 = i41;
                    i39 = i23;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case 157751711:
                case 777236068:
                    return C1460.m5057();
                case 288852137:
                case 1841414232:
                    i17 = 23922;
                    int iM450223 = C19806.m45029("۬ܺ") ^ i37;
                    i40 = iM450223 ^ 694755631;
                    i39 = ((iM450223 ^ i38) * (-16601)) ^ 1648922193;
                    sArr14 = sArr14;
                    i44 = i44;
                    sArr15 = sArr15;
                    strM45020 = strM45020;
                    i46 = i46;
                    i47 = i47;
                    sArr16 = sArr16;
                    str7 = str7;
                    i43 = i43;
                    s4 = s4;
                    i41 = i17;
                    this = this;
                    break;
                case 432457516:
                case 1091797502:
                    i18 = i41;
                    s3 = s4;
                    str5 = str7;
                    i19 = i43;
                    sArr9 = sArr14;
                    i20 = i44;
                    sArr10 = sArr16;
                    i21 = i46;
                    i22 = i47;
                    str6 = strM45020;
                    sArr11 = sArr15;
                    abstractC20745M41587 = this.m41587(C7105.m18989(sArr17, i48, i19, i18));
                    if (C1937.f7317 >= 0) {
                        int iM4502115 = C19806.m45029("ᩴۧ") ^ i37;
                        i40 = iM4502115 ^ (-1442045105);
                        sArr14 = sArr9;
                        i44 = i20;
                        sArr15 = sArr11;
                        strM45020 = str6;
                        i46 = i21;
                        i47 = i22;
                        sArr16 = sArr10;
                        str7 = str5;
                        s4 = s3;
                        i41 = i18;
                        i43 = i19;
                        i39 = ((iM4502115 ^ i38) * (-23633)) ^ (-18518437);
                        abstractC20746 = abstractC20745M41587;
                        this = this;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("۫۬") + i37) * 45;
                        i39 = ((iM113010 ^ i38) * 29029) ^ (-1807446268);
                        i40 = iM113010 ^ 1367988028;
                        this = this;
                        sArr14 = sArr9;
                        i44 = i20;
                        sArr15 = sArr11;
                        strM45020 = str6;
                        i46 = i21;
                        i47 = i22;
                        sArr16 = sArr10;
                        str7 = str5;
                        i41 = i18;
                        s4 = s3;
                        i43 = i19;
                        abstractC20746 = abstractC20745M41587;
                    }
                    break;
                case 703235782:
                case 2001058082:
                    int i62 = i41;
                    strM45020 = strM45020;
                    AbstractC20745 abstractC20745M46733 = abstractC20746.m46733(C0671.m3009(f35040, 74, 4, i62));
                    this.f35042 = abstractC20745M46733;
                    if (zM7070) {
                        iM450213 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i37) * 87;
                        i32 = ((iM450213 ^ i38) * 5923) ^ (-1262589993);
                        i34 = -606004392;
                    } else {
                        iM450213 = C19806.m45029("᩻ܳ") ^ i38;
                        i32 = ((iM450213 ^ i37) * (-14357)) ^ (-611958466);
                        i34 = -1724928898;
                    }
                    i40 = iM450213 ^ i34;
                    i41 = i62;
                    abstractC20747 = abstractC20745M46733;
                    i39 = i32;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                case 1190719105:
                case 1502306495:
                    i9 = i41;
                    short s7 = s4;
                    str2 = str7;
                    i10 = i43;
                    sArr5 = sArr14;
                    i11 = i44;
                    sArr6 = sArr16;
                    i12 = i46;
                    i13 = i47;
                    str3 = strM45020;
                    sArr7 = sArr15;
                    s2 = s7;
                    if ((i42 + 149621824) - (s2 * 24464) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i37;
                        i14 = ((iM45029 ^ i38) * 7821) ^ (-1206029204);
                        i15 = 1230374059;
                    } else {
                        iM45029 = (C19806.m45029("᩵᩶") + i38) * 85;
                        i14 = ((iM45029 ^ i37) * 17909) ^ (-678026612);
                        i15 = -1298217597;
                    }
                    i40 = iM45029 ^ i15;
                    sArr14 = sArr5;
                    i44 = i11;
                    sArr15 = sArr7;
                    strM45020 = str3;
                    i46 = i12;
                    i47 = i13;
                    sArr16 = sArr6;
                    str7 = str2;
                    i41 = i9;
                    i43 = i10;
                    s4 = s2;
                    i39 = i14;
                    break;
                case 1216077149:
                case 2074053056:
                    int i63 = i48;
                    short[] sArr23 = sArr17;
                    int i64 = i41;
                    short s8 = s4;
                    i10 = i43;
                    sArr5 = sArr14;
                    i11 = i44;
                    short[] sArr24 = sArr16;
                    int i65 = i46;
                    int i66 = i47;
                    String str9 = str7;
                    str3 = strM45020;
                    int i67 = i45;
                    strM41586 = this.m41585(ThreadFactoryC3888.m11312(sArr5, i11, i67, i64));
                    sArr15 = f35040;
                    if (C2871.m8646()) {
                        int iM450224 = C19806.m45029("ۡᩳ") ^ i37;
                        i14 = ((iM450224 ^ i38) * (-30649)) ^ 1410465220;
                        i40 = iM450224 ^ 1040386550;
                        i46 = i65;
                        i47 = i66;
                        sArr14 = sArr5;
                        i44 = i11;
                        i45 = i67;
                        strM45020 = str3;
                        str7 = str9;
                        sArr16 = sArr24;
                        i43 = i10;
                        i48 = i63;
                        sArr17 = sArr23;
                        s4 = s8;
                        i41 = i64;
                    } else {
                        i9 = i64;
                        sArr6 = sArr24;
                        i13 = i66;
                        i45 = i67;
                        str2 = str9;
                        sArr17 = sArr23;
                        s2 = s8;
                        i12 = i65;
                        i48 = i63;
                        int iM4502116 = (i38 - C19806.m45029("֨֨")) * 7;
                        i14 = ((iM4502116 ^ i37) * 3889) ^ 919032655;
                        i40 = iM4502116 ^ (-1026989531);
                        sArr14 = sArr5;
                        i44 = i11;
                        strM45020 = str3;
                        i46 = i12;
                        i47 = i13;
                        sArr16 = sArr6;
                        str7 = str2;
                        i41 = i9;
                        i43 = i10;
                        s4 = s2;
                    }
                    i39 = i14;
                    break;
                case 1768912390:
                case 1856061314:
                    i48 = i48;
                    sArr17 = sArr17;
                    i25 = i41;
                    s4 = s4;
                    i43 = i43;
                    sArr12 = sArr16;
                    i26 = i46;
                    i27 = i47;
                    str7 = str7;
                    strM45020 = strM45020;
                    zM1430 = RunnableC0195.m1430(this, C2124.m6685(sArr12, i26, i27, i25));
                    c8880 = new C8880(this);
                    if (C1189.m4368() <= 0) {
                        iM450211 = ThreadFactoryC3888.m11306("᩹ܶ") ^ i37;
                        i28 = ((iM450211 ^ i38) * 20731) ^ (-1110476042);
                        i29 = 320153860;
                    } else {
                        iM450211 = C19806.m45029("᩺ۡ") ^ i37;
                        i28 = ((iM450211 ^ i38) * 28107) ^ (-1423039988);
                        i29 = -411317296;
                    }
                    i40 = iM450211 ^ i29;
                    i41 = i25;
                    sArr16 = sArr12;
                    i46 = i26;
                    i47 = i27;
                    i39 = i28;
                    strM45020 = strM45020;
                    str7 = str7;
                    i43 = i43;
                    i48 = i48;
                    sArr17 = sArr17;
                    s4 = s4;
                    break;
                default:
                    C2124.m6673();
                    if (C3535.f13026 <= 0) {
                        i = i48;
                        sArr = sArr17;
                        i2 = i41;
                        s = s4;
                        strM3859 = str7;
                        i3 = i43;
                        sArr2 = sArr14;
                        i4 = i44;
                        sArr3 = sArr16;
                        i5 = i46;
                        i6 = i47;
                        str = strM45020;
                        sArr4 = sArr15;
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i38;
                        i8 = ((iM11306 ^ i37) * (-22855)) ^ (-1896375609);
                        i7 = 1943405007;
                        i40 = iM11306 ^ i7;
                        sArr14 = sArr2;
                        i44 = i4;
                        sArr15 = sArr4;
                        strM45020 = str;
                        i46 = i5;
                        i47 = i6;
                        sArr16 = sArr3;
                        i43 = i3;
                        i48 = i;
                        s4 = s;
                        i41 = i2;
                        str7 = strM3859;
                        i39 = i8;
                        sArr17 = sArr;
                    } else {
                        i48 = i48;
                        sArr17 = sArr17;
                        i25 = i41;
                        s4 = s4;
                        i43 = i43;
                        sArr12 = sArr16;
                        i26 = i46;
                        i27 = i47;
                        str7 = str7;
                        strM45020 = strM45020;
                        iM450211 = ThreadFactoryC3888.m11306("᩹ܶ") ^ i37;
                        i28 = ((iM450211 ^ i38) * 20731) ^ (-1110476042);
                        i29 = 320153860;
                        i40 = iM450211 ^ i29;
                        i41 = i25;
                        sArr16 = sArr12;
                        i46 = i26;
                        i47 = i27;
                        i39 = i28;
                        strM45020 = strM45020;
                        str7 = str7;
                        i43 = i43;
                        i48 = i48;
                        sArr17 = sArr17;
                        s4 = s4;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745 = null;
        AbstractC20745 abstractC20746 = null;
        int i = 1785828297;
        int i2 = C1461.f5957;
        int i3 = C10634.f36300;
        int iM45029 = (C19806.m45029("ܺۛ") ^ i2) * (-101);
        int i4 = ((iM45029 ^ i3) * 27305) ^ (-730836560);
        int i5 = 377763897;
        while (true) {
            i = ((((i ^ i3) * (-3031)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2136603889:
                case -287879173:
                    RunnableC3388.m10052(abstractC20746);
                    iM45029 = (C19806.m45029("ۛۛ") ^ i2) * (-95);
                    i4 = ((iM45029 ^ i3) * (-20749)) ^ 1512133114;
                    i5 = 1054672389;
                    break;
                case -2105357507:
                case 212077877:
                    if (C0962.m3746() >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚܶ")) * 53;
                        i4 = ((iM45029 ^ i2) * 7899) ^ 1962767849;
                        i5 = 319382596;
                    } else {
                        iM45029 = C19806.m45029("֡᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24847) ^ 1593697878;
                        i5 = -1703424816;
                    }
                    break;
                case -2010283001:
                case -1746385587:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚܶ")) * 53;
                        i4 = ((iM45029 ^ i2) * 7899) ^ 1962767849;
                        i5 = 319382596;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴۗ")) * (-57);
                        i4 = ((iM45029 ^ i3) * 20499) ^ 793221375;
                        i5 = -584599785;
                    }
                    break;
                case -1895115689:
                case 999885977:
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9953) ^ 1783700094;
                        i5 = -957374761;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۨ֨")) * (-77);
                        i4 = ((iM45029 ^ i3) * (-16939)) ^ 1857904825;
                        i5 = 1820495603;
                    }
                    break;
                case -1879100898:
                case 486933450:
                    C1148.m4233();
                    break;
                case -1743951427:
                case -1456964846:
                    RunnableC3388.m10052(abstractC20745);
                    iM45029 = (ThreadFactoryC3888.m11306("ۘۨ") ^ i3) * 35;
                    i4 = ((iM45029 ^ i2) * (-9447)) ^ 384637174;
                    i5 = 9922075;
                    break;
                case -1730957665:
                case 1209407710:
                    C1377.m4833();
                    if (C0050.f912 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9953) ^ 1783700094;
                        i5 = -957374761;
                    } else {
                        iM45029 = C19806.m45029("᩸ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21463)) ^ 21625012;
                        i5 = -172453249;
                    }
                    break;
                case -1715384762:
                case -1203958529:
                    if (C3660.m10791() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚܶ")) * 53;
                        i4 = ((iM45029 ^ i2) * 7899) ^ 1962767849;
                        i5 = 319382596;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܳ") + i2) * (-93);
                        i4 = ((iM45029 ^ i3) * 27433) ^ 1712642685;
                        i5 = -1510942543;
                    }
                    break;
                case -1635101850:
                case 1023960450:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("᩸ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21463)) ^ 21625012;
                        i5 = -172453249;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܰ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * (-17407)) ^ 455122539;
                        i5 = 1400382791;
                    }
                    break;
                case -1377921860:
                case 940337376:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܰ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * (-17407)) ^ 455122539;
                        i5 = 1400382791;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23703) ^ 176648261;
                        i5 = -1135785729;
                    }
                    break;
                case -1069208241:
                case 29676891:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ۙۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9339) ^ (-860524359);
                        i5 = 686580231;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܰ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * (-17407)) ^ 455122539;
                        i5 = 1400382791;
                    }
                    break;
                case -1056978233:
                case 1192779502:
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܰ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * (-17407)) ^ 455122539;
                        i5 = 1400382791;
                    } else {
                        iM45029 = C19806.m45029("ۨۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-31931)) ^ 2143410159;
                        i5 = -622384531;
                    }
                    break;
                case -1034862595:
                case 1121298261:
                    abstractC20746 = this.f35041;
                    if (abstractC20746 != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩶") ^ i2) * 9;
                        i4 = ((iM45029 ^ i3) * (-2021)) ^ (-1194500525);
                        i5 = -180149259;
                    } else {
                        iM45029 = (C19806.m45029("ۛۛ") ^ i2) * (-95);
                        i4 = ((iM45029 ^ i3) * (-20749)) ^ 1512133114;
                        i5 = 1054672389;
                    }
                    break;
                case -778702263:
                case 88866890:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9953) ^ 1783700094;
                        i5 = -957374761;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13819)) ^ 1508591294;
                        i5 = -2123594470;
                    }
                    break;
                case -155746496:
                case 1471493775:
                    C3660.m10791();
                    iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i3;
                    i4 = ((iM45029 ^ i2) * 23703) ^ 176648261;
                    i5 = -1135785729;
                    break;
                case -142922534:
                case 156518095:
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("᩸ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21463)) ^ 21625012;
                        i5 = -172453249;
                    } else {
                        iM45029 = (C19806.m45029("ܳ۫") + i2) * (-127);
                        i4 = ((iM45029 ^ i3) * 9993) ^ 819214964;
                        i5 = -630942462;
                    }
                    break;
                case -13577415:
                case 1994151325:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9953) ^ 1783700094;
                        i5 = -957374761;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܳ") ^ i3) * (-97);
                        i4 = ((iM45029 ^ i2) * (-6097)) ^ 125239842;
                        i5 = -1633039022;
                    }
                    break;
                case 55143804:
                case 1463723993:
                    C0817.m3399();
                    break;
                case 217209766:
                case 1347127940:
                    abstractC20745 = this.f35042;
                    if (abstractC20745 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19905) ^ (-1363964554);
                        i5 = -246575264;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۨ") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-9447)) ^ 384637174;
                        i5 = 9922075;
                    }
                    break;
                case 1047041839:
                case 1667209343:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۘۧ") ^ i3) * (-85);
                        i4 = ((iM45029 ^ i2) * (-30283)) ^ 161300930;
                        i5 = 174040458;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚܶ")) * 53;
                        i4 = ((iM45029 ^ i2) * 7899) ^ 1962767849;
                        i5 = 319382596;
                    }
                    break;
                default:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM45029 = (C19806.m45029("ۛۛ") ^ i2) * (-95);
                        i4 = ((iM45029 ^ i3) * (-20749)) ^ 1512133114;
                        i5 = 1054672389;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗܺ")) * (-81);
                        i4 = ((iM45029 ^ i2) * 26831) ^ 1937877853;
                        i5 = 1306574245;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01e1 A[PHI: r2 r5 r16
      0x01e1: PHI (r2v3 char) = (r2v2 char), (r2v1 char) binds: [B:61:0x01df, B:53:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:61:0x01df, B:53:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r16v4 int) = (r16v2 int), (r16v5 int) binds: [B:61:0x01df, B:53:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0248 A[PHI: r6 r7 r8 r16
      0x0248: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:69:0x0246, B:49:0x016d, B:45:0x014b, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:69:0x0246, B:49:0x016d, B:45:0x014b, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:69:0x0246, B:49:0x016d, B:45:0x014b, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r16v19 int) = (r16v0 int), (r16v6 int), (r16v7 int), (r16v20 int) binds: [B:69:0x0246, B:49:0x016d, B:45:0x014b, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (l.C1377.m4833() != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        if (l.ThreadFactoryC3888.f14547 > 0) goto L10;
     */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C5202 mo6160(java.lang.Exception r18) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10291.mo6160(java.lang.Exception):l.ۚ۟ۜ");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0187 A[PHI: r1 r9 r11
      0x0187: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:42:0x0185, B:22:0x00b8, B:16:0x0098, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:42:0x0185, B:22:0x00b8, B:16:0x0098, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:42:0x0185, B:22:0x00b8, B:16:0x0098, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01c0 A[PHI: r5 r6 r7 r14 r15
      0x01c0: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:46:0x01be, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:46:0x01be, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:46:0x01be, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:46:0x01be, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:46:0x01be, B:30:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0296 A[PHI: r16 r17 r18 r19 r20 r25
      0x0296: PHI (r16v6 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x0294, B:61:0x0276, B:57:0x0256, B:10:0x0077, B:85:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r17v6 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:65:0x0294, B:61:0x0276, B:57:0x0256, B:10:0x0077, B:85:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r18v6 short) = (r18v2 short), (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:65:0x0294, B:61:0x0276, B:57:0x0256, B:10:0x0077, B:85:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r19v6 int) = (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:65:0x0294, B:61:0x0276, B:57:0x0256, B:10:0x0077, B:85:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r20v6 short) = (r20v2 short), (r20v3 short), (r20v2 short), (r20v2 short), (r20v2 short) binds: [B:65:0x0294, B:61:0x0276, B:57:0x0256, B:10:0x0077, B:85:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r25v7 short) = (r25v3 short), (r25v3 short), (r25v4 short), (r25v3 short), (r25v3 short) binds: [B:65:0x0294, B:61:0x0276, B:57:0x0256, B:10:0x0077, B:85:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        int iM11306;
        int i;
        int i2;
        int i3 = C1461.f5957;
        int i4 = C0278.f1572;
        int iM11307 = (ThreadFactoryC3888.m11306("ܶۨ") ^ i4) * 119;
        int i5 = ((iM11307 ^ i3) * (-12731)) ^ (-1928865558);
        String strM6164 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ (-241320506);
        int iM11308 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = -1363009912;
        short s3 = 0;
        String[] strArr = null;
        short[] sArr4 = null;
        int i14 = 0;
        String strM41569 = null;
        String strM7604 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 3063) >> 31));
            switch (i13) {
                case -2031807468:
                case 773514305:
                    strArr = new String[]{strM41569, C1875.m6085(iM11308 ^ i14)};
                    sArr3 = f35040;
                    if (C2642.f10294 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۢ") ^ i3;
                        i = ((iM11306 ^ i4) * 193) ^ (-966781475);
                        i2 = -1848064141;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM45029 = (C19806.m45029("ܺۡ") ^ i3) * 123;
                        i5 = ((iM45029 ^ i4) * 27563) ^ (-990396240);
                        i6 = iM45029 ^ (-2039062673);
                    }
                    break;
                case -2022640380:
                case 1779746448:
                    return C0216.m1574(C19806.m45029(C1977.m6363(sArr3, i9, i8, i10)) ^ 2098902150, strArr);
                case -1808574503:
                case 1671484167:
                    sArr = f35040;
                    i11 = 79;
                    i7 = 4;
                    if (C2704.f10408) {
                        iM11306 = (i4 - C19806.m45029("ۛۙ")) * 109;
                        i = ((iM11306 ^ i3) * 6117) ^ 1412663585;
                        i2 = 970229884;
                    } else {
                        iM11306 = (C19806.m45029("֡ۛ") ^ i4) * (-79);
                        i = ((iM11306 ^ i3) * (-26579)) ^ 887339876;
                        i2 = -1594951934;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1729558761:
                case 2079914300:
                    i10 = 63550;
                    iM11306 = (C19806.m45029("ۗۘ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM11306 ^ i4) * 9017) ^ (-1261743565);
                    i2 = 1545148907;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1617878738:
                case -829810572:
                    if (i12 - (s2 * s3) < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ۟") ^ i4) * 55;
                        i = ((iM11306 ^ i3) * 23005) ^ 411327151;
                        i2 = -866749728;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩺") ^ i3) * 51;
                        i = ((iM11306 ^ i4) * 12317) ^ (-487274542);
                        i2 = -1841671423;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1501281240:
                case 242438023:
                    i10 = 44340;
                    iM11306 = (C19806.m45029("ۗۘ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM11306 ^ i4) * 9017) ^ (-1261743565);
                    i2 = 1545148907;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1457600698:
                case -727810531:
                    C2332.m7079();
                    return null;
                case -1298431063:
                case 1225743110:
                    strM7604 = C2477.m7604(sArr, i11, i7, i10);
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ۫") + i3) * 33;
                        i = ((iM11306 ^ i4) * 9491) ^ 774026431;
                        i2 = 596383770;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۙܶ")) * (-95);
                        i = ((iM11306 ^ i4) * 26281) ^ 159019634;
                        i2 = -433984005;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -910350704:
                case 484570825:
                    i9 = 86;
                    i8 = 3;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۙܶ")) * (-95);
                        i = ((iM11306 ^ i4) * 26281) ^ 159019634;
                        i2 = -433984005;
                    } else {
                        iM11306 = (C19806.m45029("᩺ۖ") ^ i4) * (-23);
                        i = ((iM11306 ^ i3) * 31599) ^ 2050530724;
                        i2 = 815409123;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -677110963:
                case -242425753:
                    strM6164 = RunnableC1895.m6164(sArr2, 83, 3, i10);
                    if (C0050.f912 > 0) {
                        iM11306 = C19806.m45029("֡ۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 8313) ^ 667446606;
                        i2 = -1367239815;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM450210 = (C19806.m45029("ܺۡ") ^ i3) * 123;
                        i5 = ((iM450210 ^ i4) * 27563) ^ (-990396240);
                        i6 = iM450210 ^ (-2039062673);
                    }
                    break;
                case -525625376:
                case 703590645:
                    if (C0278.m1789() > 0) {
                        iM11306 = (i3 - C19806.m45029("ۙܶ")) * (-95);
                        i = ((iM11306 ^ i4) * 26281) ^ 159019634;
                        i2 = -433984005;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i4;
                        i = ((iM11306 ^ i3) * 16901) ^ 1288040788;
                        i2 = 348554285;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -462402830:
                case 393980593:
                    s2 = sArr4[c];
                    s = 13017;
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ۖ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 6223) ^ (-585521783);
                        i2 = 1904878390;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܶ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30779)) ^ 1443447831;
                        i2 = 1562628;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -442590550:
                case 1185227625:
                    strM41569 = m41569(strM7604);
                    sArr2 = f35040;
                    if (!C2704.f10408) {
                        int iM450211 = (C19806.m45029("ܺۡ") ^ i3) * 123;
                        i5 = ((iM450211 ^ i4) * 27563) ^ (-990396240);
                        i6 = iM450211 ^ (-2039062673);
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙᩴ")) * (-69);
                        i = ((iM11306 ^ i3) * (-28397)) ^ (-1768612689);
                        i2 = -23032381;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case -152822909:
                case 639364088:
                    iM11308 = ThreadFactoryC3888.m11306(strM6164);
                    i14 = 2099940053;
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("֡ۛ") ^ i4) * (-79);
                        i = ((iM11306 ^ i3) * (-26579)) ^ 887339876;
                        i2 = -1594951934;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-7323)) ^ (-1269854775);
                        i2 = -1684878629;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -24770877:
                case 1580054762:
                    C0797.m3359();
                    if (C0278.f1572 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i4;
                        i = ((iM11306 ^ i3) * 16901) ^ 1288040788;
                        i2 = 348554285;
                    } else {
                        iM11306 = C19806.m45029("ۖ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 6223) ^ (-585521783);
                        i2 = 1904878390;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 162626865:
                case 1969461726:
                    C0797.m3359();
                    iM11306 = (i3 - C19806.m45029("ۙܶ")) * (-95);
                    i = ((iM11306 ^ i4) * 26281) ^ 159019634;
                    i2 = -433984005;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 721667855:
                case 1126613253:
                    sArr4 = f35040;
                    c = 'N';
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ۖ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 6223) ^ (-585521783);
                        i2 = 1904878390;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("۫۠")) * 35;
                        i = ((iM11306 ^ i3) * (-14385)) ^ (-1589746056);
                        i2 = 274505415;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1483887401:
                case 1789718988:
                    int i15 = s2 + s;
                    i12 = i15 * i15;
                    s3 = 52068;
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = C19806.m45029("ۖ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 6223) ^ (-585521783);
                        i2 = 1904878390;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۜ") ^ i4) * 13;
                        i = ((iM11306 ^ i3) * (-17111)) ^ (-189494460);
                        i2 = -1335049415;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1460.m5050();
                    if (C1460.m5050() != 0) {
                        int iM450212 = (C19806.m45029("ܺۡ") ^ i3) * 123;
                        i5 = ((iM450212 ^ i4) * 27563) ^ (-990396240);
                        i6 = iM450212 ^ (-2039062673);
                    } else {
                        iM11306 = C19806.m45029("ۖ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 6223) ^ (-585521783);
                        i2 = 1904878390;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
            }
        }
    }
}
