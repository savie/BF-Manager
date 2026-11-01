package l;

import com.google.android.material.slider.BaseSlider;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C19Y */
/* JADX INFO: loaded from: classes.dex */
public final class C7857 {

    /* JADX INFO: renamed from: ֨ᩳ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f25840;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10157 f25841;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C21445 f25842;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static native C8901 m20751(byte[] bArr);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static native byte[] m20752(String str, byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m20748(String str) {
        f25842.remove(str);
    }

    static {
        ApplicationC6132.m17119(95);
        f25840 = new short[]{5963, 8655, -11307, 2892, 16049, 9542, 15716, 22906, 22849, 22852, 22849, 22848, 22872, 22849, 22799, 22858, 22877, 22877, 22848, 22877, 8068, 14660, -15477, -13242};
        C21445 c21445 = null;
        int i = 444711581;
        int i2 = C1461.f5957;
        int i3 = C0050.f912;
        int iM45029 = (i3 - C19806.m45029("ۢᩳ")) * 83;
        int i4 = ((iM45029 ^ i2) * 2611) ^ 867137386;
        int i5 = -1617461069;
        while (true) {
            i = ((((i ^ i2) * 13037) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1896530131:
                case -125279532:
                    if (C0278.m1789() <= 0) {
                        iM45029 = C19806.m45029("ۤܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23429)) ^ (-407401020);
                        i5 = 1027431344;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۖۢ")) * (-127);
                        i4 = ((iM45029 ^ i3) * (-16321)) ^ (-164494320);
                        i5 = -1750915268;
                    }
                    break;
                case -1535375329:
                case 1897340575:
                    C2124.m6673();
                    iM45029 = (ThreadFactoryC3888.m11306("ۧ֫") ^ i2) * 23;
                    i4 = ((iM45029 ^ i3) * 6153) ^ 664613081;
                    i5 = 959386393;
                    break;
                case -1532757475:
                case -1101280434:
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ֫") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 6153) ^ 664613081;
                        i5 = 959386393;
                    } else {
                        iM45029 = (C19806.m45029("ۚۡ") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * (-2649)) ^ 1952563026;
                        i5 = -2016971373;
                    }
                    break;
                case -1315843989:
                case 1207298615:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ֫") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 6153) ^ 664613081;
                        i5 = 959386393;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۙ") + i3) * (-19);
                        i4 = ((iM45029 ^ i2) * 13087) ^ (-620665799);
                        i5 = 1197049920;
                    }
                    break;
                case -1115588800:
                case 773170021:
                    c21445 = new C21445();
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۧۧ") ^ i3) * 89;
                        i4 = ((iM45029 ^ i2) * 24079) ^ (-1695470592);
                        i5 = -1123623279;
                    } else {
                        iM45029 = C19806.m45029("ۤܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23429)) ^ (-407401020);
                        i5 = 1027431344;
                    }
                    break;
                case -944299878:
                case 1997089346:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ۚܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23817)) ^ (-1941562222);
                        i5 = 1337343968;
                    } else {
                        iM45029 = (C19806.m45029("ܿ۠") ^ i2) * (-41);
                        i4 = ((iM45029 ^ i3) * (-30705)) ^ (-201680630);
                        i5 = -1325025166;
                    }
                    break;
                case -938952264:
                case 231830579:
                    C0817.m3399();
                    throw new RuntimeException();
                case -918743219:
                case 68803114:
                    if (C0797.m3359()) {
                        f25841 = new C17734(1048576);
                        return;
                    }
                    iM45029 = C19806.m45029("ۚܺ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-23817)) ^ (-1941562222);
                    i5 = 1337343968;
                    break;
                case -400932847:
                case 60587427:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("᩹ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30873) ^ 341408852;
                        i5 = 103576745;
                    } else {
                        iM45029 = (C19806.m45029("۠ۤ") + i2) * 87;
                        i4 = ((iM45029 ^ i3) * 21359) ^ (-1948130871);
                        i5 = -585142759;
                    }
                    break;
                case -251752662:
                case 1804123501:
                    f25842 = c21445;
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("᩹ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30873) ^ 341408852;
                        i5 = 103576745;
                    } else {
                        iM45029 = C19806.m45029("֫᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14877) ^ (-2128147080);
                        i5 = -2062072699;
                    }
                    break;
                case 530570068:
                case 1715888708:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ֫") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 6153) ^ 664613081;
                        i5 = 959386393;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡᩳ")) * 17;
                        i4 = ((iM45029 ^ i2) * (-6759)) ^ (-2112345719);
                        i5 = 1462290394;
                    }
                    break;
                case 955106453:
                case 1723181308:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ۤܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23429)) ^ (-407401020);
                        i5 = 1027431344;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۡ") ^ i3) * 109;
                        i4 = ((iM45029 ^ i2) * 22033) ^ 566633629;
                        i5 = -894159536;
                    }
                    break;
                case 1186154430:
                case 1581937390:
                    C3577.m10565();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("۠ۤ") + i2) * 87;
                        i4 = ((iM45029 ^ i3) * 21359) ^ (-1948130871);
                        i5 = -585142759;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ֫") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 6153) ^ 664613081;
                        i5 = 959386393;
                    }
                    break;
                case 1508674203:
                case 1684013568:
                    if (CallableC1627.f6528) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡۟")) * (-99);
                        i4 = ((iM45029 ^ i3) * 7491) ^ (-1520900399);
                        i5 = 568443515;
                    } else {
                        iM45029 = (C19806.m45029("۠ۤ") + i2) * 87;
                        i4 = ((iM45029 ^ i3) * 21359) ^ (-1948130871);
                        i5 = -585142759;
                    }
                    break;
                default:
                    if (C3722.m10894() <= 0) {
                        iM45029 = C19806.m45029("ۤܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23429)) ^ (-407401020);
                        i5 = 1027431344;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ֫") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 6153) ^ 664613081;
                        i5 = 959386393;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0215 A[PHI: r1 r4 r5
      0x0215: PHI (r1v22 int) = (r1v20 int), (r1v21 int), (r1v23 int) binds: [B:59:0x01fb, B:54:0x01d1, B:45:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r4v5 int) = (r4v4 int), (r4v2 int), (r4v2 int) binds: [B:59:0x01fb, B:54:0x01d1, B:45:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r5v18 int) = (r5v16 int), (r5v17 int), (r5v19 int) binds: [B:59:0x01fb, B:54:0x01d1, B:45:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m20753(byte[] bArr) throws IOException {
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int length;
        int i9;
        int iM45029;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM450210;
        int i17;
        int i18;
        int i19;
        int i20;
        int iM450211;
        int i21;
        int i22;
        int iM11307;
        int i23;
        int i24;
        int i25;
        byte[] bArr2 = bArr;
        int i26 = C7105.f23796;
        int i27 = C1066.f4915;
        int iM11308 = (ThreadFactoryC3888.m11306("ۨ۬") ^ i27) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
        int i28 = ((iM11308 ^ i26) * (-30779)) ^ (-1581717494);
        long j = 0;
        long j2 = 0;
        int i29 = iM11308 ^ (-980875395);
        int i30 = 0;
        int iM36347 = 0;
        int iM5351 = 0;
        int iM3739 = 0;
        int i31 = 0;
        int iM36348 = 0;
        int i32 = 0;
        int i33 = 0;
        int iM37310 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1067370463;
        int i38 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        int i39 = 0;
        int i40 = 0;
        while (true) {
            i37 = i29 ^ (i28 & (((i37 ^ i26) * 19197) >> 31));
            switch (i37) {
                case -2085356246:
                case 376358429:
                    RunnableC1895.m6170();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = C19806.m45029("ܺᩳ") ^ i26;
                        i10 = ((iM45029 ^ i27) * 26887) ^ (-108153345);
                        i11 = -407132564;
                        i29 = iM45029 ^ i11;
                        i28 = i10;
                    } else {
                        i = i32;
                        i2 = i33;
                        iM11306 = (i26 - C19806.m45029("۫ᩴ")) * (-67);
                        i3 = ((iM11306 ^ i27) * 27061) ^ (-1656236106);
                        i4 = -1679050073;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    }
                    break;
                case -2055461156:
                case 2131540966:
                    throw new IOException();
                case -1913931636:
                case 1381271568:
                    i = i32;
                    i2 = i33;
                    int i41 = i31 + iM37310;
                    i5 = i30;
                    if (iM36348 != 1) {
                        i31 = i41;
                        iM450210 = (C19806.m45029("᩵ۖ") ^ i27) * (-79);
                        i17 = ((iM450210 ^ i26) * (-17963)) ^ 1861148650;
                        i18 = -211157411;
                        int i42 = iM450210 ^ i18;
                        i33 = i2;
                        int i43 = i17;
                        i32 = i;
                        i28 = i43;
                        int i44 = i5;
                        i29 = i42;
                        i30 = i44;
                    } else {
                        i39 = i41;
                        iM450210 = C19806.m45029("ܿۘ") ^ i26;
                        i17 = ((iM450210 ^ i27) * (-11137)) ^ 1494830224;
                        i18 = -1286475397;
                        int i45 = iM450210 ^ i18;
                        i33 = i2;
                        int i46 = i17;
                        i32 = i;
                        i28 = i46;
                        int i47 = i5;
                        i29 = i45;
                        i30 = i47;
                    }
                    break;
                case -1890023331:
                case -1323515023:
                    i5 = i30;
                    i = i32;
                    i2 = i33;
                    iM37310 = C0962.m3739(i2, bArr2);
                    if (iM37310 >= 8) {
                        iM450210 = C19806.m45029("ۙۤ") ^ i27;
                        i17 = ((iM450210 ^ i26) * (-13275)) ^ 826532964;
                        i18 = -912841392;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۧۘ") ^ i27;
                        i17 = ((iM450210 ^ i26) * 23873) ^ (-1574598230);
                        i18 = 447762009;
                    }
                    int i48 = iM450210 ^ i18;
                    i33 = i2;
                    int i49 = i17;
                    i32 = i;
                    i28 = i49;
                    int i410 = i5;
                    i29 = i48;
                    i30 = i410;
                    break;
                case -1856651496:
                case -543162387:
                    i = i32;
                    i2 = i33;
                    iM5351 = RunnableC1564.m5351(i39 + i36, bArr2);
                    if (iM36347 >= 284) {
                        iM11306 = (i26 - C19806.m45029("ܳۢ")) * 57;
                        i3 = ((iM11306 ^ i27) * 32435) ^ 426919114;
                        i4 = 399812798;
                    } else {
                        iM11306 = (C19806.m45029("֨᩸") + i27) * (-43);
                        i3 = ((iM11306 ^ i26) * 31993) ^ (-1525203362);
                        i4 = 572772603;
                    }
                    i29 = iM11306 ^ i4;
                    i32 = i;
                    i28 = i3;
                    i33 = i2;
                    break;
                case -1735990798:
                case -592968222:
                    throw new IOException();
                case -1676182775:
                case 369877887:
                    C7105.m18985();
                    return 0;
                case -1619291106:
                case 529228740:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1460.m5050();
                    i = i32;
                    i2 = i33;
                    iM11306 = (i26 - C19806.m45029("۫ᩴ")) * (-67);
                    i3 = ((iM11306 ^ i27) * 27061) ^ (-1656236106);
                    i4 = -1679050073;
                    i29 = iM11306 ^ i4;
                    i32 = i;
                    i28 = i3;
                    i33 = i2;
                    break;
                case -1609104466:
                case -346954713:
                    C2788.m8472();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        i2 = i33;
                        length = i34;
                        i6 = i35;
                        i9 = i38;
                        int i50 = i40;
                        i8 = i32;
                        i7 = i50;
                        int iM450212 = (C19806.m45029("ۙ֨") + i27) * 39;
                        int i51 = ((iM450212 ^ i26) * 21045) ^ 1675492461;
                        i29 = iM450212 ^ 1207842020;
                        i35 = i6;
                        i38 = i9;
                        i34 = length;
                        i33 = i2;
                        i28 = i51;
                        bArr2 = bArr;
                        int i52 = i8;
                        i40 = i7;
                        i32 = i52;
                    } else {
                        i19 = i30;
                        i20 = i33;
                        iM450211 = C19806.m45029("۠۫") ^ i26;
                        i21 = ((iM450211 ^ i27) * 27491) ^ 573910;
                        i22 = -1490068661;
                        int i53 = iM450211 ^ i22;
                        i33 = i20;
                        i25 = i19;
                        i29 = i53;
                        i28 = i21;
                        i30 = i25;
                    }
                    break;
                case -1520430451:
                case 343049880:
                    i5 = i30;
                    i8 = i32;
                    i2 = i33;
                    int i54 = i35;
                    i12 = i38;
                    if (C15157.m36347(0, bArr2) == 2) {
                        int iM11309 = ThreadFactoryC3888.m11306("ۖܺ") ^ i26;
                        i38 = i12;
                        i35 = i54;
                        i30 = i5;
                        i29 = iM11309 ^ (-295821862);
                        i33 = i2;
                        i28 = ((iM11309 ^ i27) * 11735) ^ 180297718;
                        i32 = i8;
                        i40 = 2;
                    } else {
                        i35 = i54;
                        i13 = i34;
                        i7 = 2;
                        int iM113010 = ThreadFactoryC3888.m11306("֫ۖ") ^ i26;
                        int i55 = i12;
                        i14 = ((iM113010 ^ i27) * (-5565)) ^ 543249102;
                        i15 = iM113010 ^ 382527046;
                        i38 = i55;
                        i34 = i13;
                        i33 = i2;
                        int i56 = i5;
                        i29 = i15;
                        i28 = i14;
                        i30 = i56;
                        int i57 = i8;
                        i40 = i7;
                        i32 = i57;
                    }
                    break;
                case -1505621991:
                case -990612888:
                    i = i32;
                    i2 = i33;
                    if (j2 <= iM3739) {
                        iM11306 = (i27 - ThreadFactoryC3888.m11306("᩸ۢ")) * 65;
                        i3 = ((iM11306 ^ i26) * (-15257)) ^ (-396144706);
                        i4 = -1655755688;
                    } else {
                        iM11306 = (C19806.m45029("֨᩸") + i27) * (-43);
                        i3 = ((iM11306 ^ i26) * 31993) ^ (-1525203362);
                        i4 = 572772603;
                    }
                    i29 = iM11306 ^ i4;
                    i32 = i;
                    i28 = i3;
                    i33 = i2;
                    break;
                case -1435838230:
                case 1924304628:
                    i5 = i30;
                    i = i32;
                    i2 = i33;
                    int i58 = i38;
                    if (iM3739 < i58) {
                        i38 = i58;
                        i16 = i35;
                        i7 = i40;
                        i8 = i;
                        int iM450213 = (C19806.m45029("ܶ᩺") ^ i27) * (-37);
                        i14 = ((iM450213 ^ i26) * (-20063)) ^ 1437820351;
                        i15 = iM450213 ^ (-1258815382);
                        i35 = i16;
                        i33 = i2;
                        int i59 = i5;
                        i29 = i15;
                        i28 = i14;
                        i30 = i59;
                        int i510 = i8;
                        i40 = i7;
                        i32 = i510;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۘۚ") + i26) * 49;
                        i3 = ((iM113011 ^ i27) * 29123) ^ 1517295569;
                        i38 = i58;
                        i30 = i5;
                        i29 = iM113011 ^ 1542884555;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    }
                    break;
                case -1406413035:
                case -182019805:
                    i = i32;
                    i2 = i33;
                    j5 = i31;
                    long j7 = iM37310;
                    if (CallableC1627.f6528) {
                        int iM450214 = (C19806.m45029("֨ܶ") ^ i26) * (-77);
                        i32 = i;
                        i28 = ((iM450214 ^ i27) * (-18275)) ^ 674633532;
                        i33 = i2;
                        i30 = i30;
                        i29 = iM450214 ^ 556142220;
                        j3 = j7;
                    } else {
                        j3 = j7;
                        i33 = i2;
                        iM11307 = C19806.m45029("۟ܿ") ^ i26;
                        i23 = ((iM11307 ^ i27) * 25545) ^ 1526908295;
                        i24 = 147361472;
                        int i60 = iM11307 ^ i24;
                        i32 = i;
                        i28 = i23;
                        i25 = i30;
                        i29 = i60;
                        i30 = i25;
                    }
                    break;
                case -1343797288:
                case 1767944674:
                    i5 = i30;
                    i = i32;
                    i2 = i33;
                    if (i31 <= iM3739 - 8) {
                        iM450210 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i26;
                        i17 = ((iM450210 ^ i27) * 2419) ^ 1519734766;
                        i18 = -62172294;
                    } else {
                        iM450210 = C19806.m45029("ۨ᩵") ^ i27;
                        i17 = ((iM450210 ^ i26) * 327) ^ (-60889366);
                        i18 = 21067856;
                    }
                    int i411 = iM450210 ^ i18;
                    i33 = i2;
                    int i412 = i17;
                    i32 = i;
                    i28 = i412;
                    int i413 = i5;
                    i29 = i411;
                    i30 = i413;
                    break;
                case -1329974694:
                case -11701820:
                    throw new IOException();
                case -1301112511:
                case 1471993615:
                    i30 = i30;
                    i = i32;
                    i33 = i31 + i;
                    if (C2788.f10625 >= 0) {
                        iM11307 = C19806.m45029("۟ܿ") ^ i26;
                        i23 = ((iM11307 ^ i27) * 25545) ^ 1526908295;
                        i24 = 147361472;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۡۨ") ^ i27;
                        i23 = ((iM11307 ^ i26) * (-12177)) ^ (-1633802474);
                        i24 = -354124524;
                    }
                    int i61 = iM11307 ^ i24;
                    i32 = i;
                    i28 = i23;
                    i25 = i30;
                    i29 = i61;
                    i30 = i25;
                    break;
                case -1273176714:
                case 943044559:
                    C1937.m6279();
                    if (C3577.f13150 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۢ") ^ i26) * 87;
                        i10 = ((iM45029 ^ i27) * (-32607)) ^ 1522370927;
                        i11 = -1851740129;
                        i29 = iM45029 ^ i11;
                        i28 = i10;
                    } else {
                        i19 = i30;
                        i20 = i33;
                        iM450211 = C19806.m45029("۠۫") ^ i26;
                        i21 = ((iM450211 ^ i27) * 27491) ^ 573910;
                        i22 = -1490068661;
                        int i511 = iM450211 ^ i22;
                        i33 = i20;
                        i25 = i19;
                        i29 = i511;
                        i28 = i21;
                        i30 = i25;
                    }
                    break;
                case -1028913233:
                case 1331216865:
                    if (C3577.f13150 >= 0) {
                        i = i32;
                        i2 = i33;
                        iM11306 = C19806.m45029("֫֫") ^ i26;
                        i3 = ((iM11306 ^ i27) * 30789) ^ (-1535995997);
                        i4 = -1836035805;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    } else {
                        i19 = i30;
                        i20 = i33;
                        iM450211 = C19806.m45029("۠۫") ^ i26;
                        i21 = ((iM450211 ^ i27) * 27491) ^ 573910;
                        i22 = -1490068661;
                        int i512 = iM450211 ^ i22;
                        i33 = i20;
                        i25 = i19;
                        i29 = i512;
                        i28 = i21;
                        i30 = i25;
                    }
                    break;
                case -882838419:
                case 570749634:
                    throw new IOException();
                case -820399473:
                case -395000484:
                    i = i32;
                    i2 = i33;
                    i36 = 4;
                    if (!RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩸") ^ i26) * 49;
                        i3 = ((iM11306 ^ i27) * 4747) ^ (-828492518);
                        i4 = 1658346542;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    } else {
                        i33 = i2;
                        iM11307 = C19806.m45029("۟ܿ") ^ i26;
                        i23 = ((iM11307 ^ i27) * 25545) ^ 1526908295;
                        i24 = 147361472;
                        int i62 = iM11307 ^ i24;
                        i32 = i;
                        i28 = i23;
                        i25 = i30;
                        i29 = i62;
                        i30 = i25;
                    }
                    break;
                case -800857873:
                case -8217293:
                    i5 = i30;
                    i2 = i33;
                    i12 = i38;
                    int i63 = i40;
                    i8 = i32;
                    i7 = i63;
                    i13 = i34;
                    if (i13 < 12) {
                        i35 = 12;
                        int iM113012 = ThreadFactoryC3888.m11306("֫ۖ") ^ i26;
                        int i513 = i12;
                        i14 = ((iM113012 ^ i27) * (-5565)) ^ 543249102;
                        i15 = iM113012 ^ 382527046;
                        i38 = i513;
                        i34 = i13;
                        i33 = i2;
                        int i514 = i5;
                        i29 = i15;
                        i28 = i14;
                        i30 = i514;
                        int i515 = i8;
                        i40 = i7;
                        i32 = i515;
                    } else {
                        int iM450215 = C19806.m45029("֫ۘ") ^ i27;
                        i28 = ((iM450215 ^ i26) * (-6545)) ^ (-1955224991);
                        i38 = i12;
                        i30 = i5;
                        i35 = 12;
                        i29 = iM450215 ^ (-1059287698);
                        i34 = i13;
                        i33 = i2;
                        int i516 = i8;
                        i40 = i7;
                        i32 = i516;
                    }
                    break;
                case -712344098:
                case 133633694:
                    i = i32;
                    i2 = i33;
                    if (iM5351 >= iM36347) {
                        iM11306 = (i27 - C19806.m45029("ۘܽ")) * (-121);
                        i3 = ((iM11306 ^ i26) * (-11445)) ^ 967210657;
                        i4 = -124680987;
                    } else {
                        iM11306 = (C19806.m45029("֨᩸") + i27) * (-43);
                        i3 = ((iM11306 ^ i26) * 31993) ^ (-1525203362);
                        i4 = 572772603;
                    }
                    i29 = iM11306 ^ i4;
                    i32 = i;
                    i28 = i3;
                    i33 = i2;
                    break;
                case -642118904:
                case 908868981:
                    i19 = i30;
                    i20 = i33;
                    iM36348 = C15157.m36347(i31, bArr2);
                    i32 = 4;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM450211 = C19806.m45029("۠۫") ^ i26;
                        i21 = ((iM450211 ^ i27) * 27491) ^ 573910;
                        i22 = -1490068661;
                    } else {
                        iM450211 = (C19806.m45029("۬᩺") + i26) * 11;
                        i21 = ((iM450211 ^ i27) * 30835) ^ 69326093;
                        i22 = -437857392;
                    }
                    int i517 = iM450211 ^ i22;
                    i33 = i20;
                    i25 = i19;
                    i29 = i517;
                    i28 = i21;
                    i30 = i25;
                    break;
                case -574791761:
                case 1320895324:
                    return i39;
                case -446818118:
                case 1364176714:
                    i = i32;
                    i2 = i33;
                    i30 = i39 + 2;
                    if (!C0629.m2907()) {
                        i6 = i35;
                        i7 = i40;
                        i8 = i;
                        length = i34;
                        i9 = i38;
                        int iM450216 = (C19806.m45029("ۙ֨") + i27) * 39;
                        int i518 = ((iM450216 ^ i26) * 21045) ^ 1675492461;
                        i29 = iM450216 ^ 1207842020;
                        i35 = i6;
                        i38 = i9;
                        i34 = length;
                        i33 = i2;
                        i28 = i518;
                        bArr2 = bArr;
                        int i519 = i8;
                        i40 = i7;
                        i32 = i519;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ܰ") + i26) * (-91);
                        i3 = ((iM11306 ^ i27) * (-13447)) ^ 444230015;
                        i4 = 492719179;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    }
                    break;
                case -427296473:
                case 1833685615:
                    CallableC1627.m5507();
                    if (!C10634.m26820()) {
                        i = i32;
                        i2 = i33;
                        iM11306 = (i26 - C19806.m45029("۫ᩴ")) * (-67);
                        i3 = ((iM11306 ^ i27) * 27061) ^ (-1656236106);
                        i4 = -1679050073;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ܺ") + i27) * (-23);
                        i10 = ((iM45029 ^ i26) * 18067) ^ (-1961436982);
                        i11 = 1605639466;
                        i29 = iM45029 ^ i11;
                        i28 = i10;
                    }
                    break;
                case -425151062:
                case 1099986966:
                    i5 = i30;
                    i = i32;
                    i2 = i33;
                    if (iM3739 > bArr2.length) {
                        i16 = i35;
                        i7 = i40;
                        i8 = i;
                        int iM450217 = (C19806.m45029("ܶ᩺") ^ i27) * (-37);
                        i14 = ((iM450217 ^ i26) * (-20063)) ^ 1437820351;
                        i15 = iM450217 ^ (-1258815382);
                        i35 = i16;
                        i33 = i2;
                        int i5110 = i5;
                        i29 = i15;
                        i28 = i14;
                        i30 = i5110;
                        int i5111 = i8;
                        i40 = i7;
                        i32 = i5111;
                    } else {
                        i31 = i38;
                        iM450210 = (C19806.m45029("᩵ۖ") ^ i27) * (-79);
                        i17 = ((iM450210 ^ i26) * (-17963)) ^ 1861148650;
                        i18 = -211157411;
                        int i414 = iM450210 ^ i18;
                        i33 = i2;
                        int i415 = i17;
                        i32 = i;
                        i28 = i415;
                        int i416 = i5;
                        i29 = i414;
                        i30 = i416;
                    }
                    break;
                case -354100492:
                case 607818705:
                    i5 = i30;
                    int i64 = i32;
                    i2 = i33;
                    i7 = i40;
                    int iM36349 = C15157.m36347(i7, bArr2);
                    iM3739 = C0962.m3739(4, bArr2);
                    i16 = i35;
                    if (iM36349 < i16) {
                        i8 = i64;
                        i38 = iM36349;
                        int iM450218 = (C19806.m45029("ܶ᩺") ^ i27) * (-37);
                        i14 = ((iM450218 ^ i26) * (-20063)) ^ 1437820351;
                        i15 = iM450218 ^ (-1258815382);
                        i35 = i16;
                        i33 = i2;
                        int i5112 = i5;
                        i29 = i15;
                        i28 = i14;
                        i30 = i5112;
                        int i5113 = i8;
                        i40 = i7;
                        i32 = i5113;
                    } else {
                        int iM450219 = (C19806.m45029("᩹֫") ^ i26) * (-37);
                        i8 = i64;
                        i28 = ((iM450219 ^ i27) * 31309) ^ (-789513773);
                        i38 = iM36349;
                        i30 = i5;
                        i29 = iM450219 ^ (-843158501);
                        i35 = i16;
                        i33 = i2;
                        int i5114 = i8;
                        i40 = i7;
                        i32 = i5114;
                    }
                    break;
                case -329753846:
                case 275845279:
                    i = i32;
                    i2 = i33;
                    iM36347 = C15157.m36347(i30, bArr2);
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("֫֫") ^ i26;
                        i3 = ((iM11306 ^ i27) * 30789) ^ (-1535995997);
                        i4 = -1836035805;
                    } else {
                        iM11306 = (i27 - C19806.m45029("ᩴ۟")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM11306 ^ i26) * 21075) ^ (-332521981);
                        i4 = -1779317629;
                    }
                    i29 = iM11306 ^ i4;
                    i32 = i;
                    i28 = i3;
                    i33 = i2;
                    break;
                case -13397206:
                case 1492431212:
                    C3743.m10966();
                    if (C1419.f5860 < 0) {
                        iM45029 = (i27 - C19806.m45029("᩸ۚ")) * 49;
                        i10 = ((iM45029 ^ i26) * 10337) ^ (-221928182);
                        i11 = -663579678;
                        i29 = iM45029 ^ i11;
                        i28 = i10;
                    } else {
                        i19 = i30;
                        i20 = i33;
                        iM450211 = C19806.m45029("۠۫") ^ i26;
                        i21 = ((iM450211 ^ i27) * 27491) ^ 573910;
                        i22 = -1490068661;
                        int i5115 = iM450211 ^ i22;
                        i33 = i20;
                        i25 = i19;
                        i29 = i5115;
                        i28 = i21;
                        i30 = i25;
                    }
                    break;
                case 87597005:
                case 1694343603:
                    i5 = i30;
                    i = i32;
                    i2 = i33;
                    i39 = -1;
                    iM450210 = C19806.m45029("ܿۘ") ^ i26;
                    i17 = ((iM450210 ^ i27) * (-11137)) ^ 1494830224;
                    i18 = -1286475397;
                    int i417 = iM450210 ^ i18;
                    i33 = i2;
                    int i418 = i17;
                    i32 = i;
                    i28 = i418;
                    int i419 = i5;
                    i29 = i417;
                    i30 = i419;
                    break;
                case 149332026:
                case 486381923:
                    i = i32;
                    i2 = i33;
                    if (j > iM3739) {
                        i5 = i30;
                        iM450210 = ThreadFactoryC3888.m11306("ۧۘ") ^ i27;
                        i17 = ((iM450210 ^ i26) * 23873) ^ (-1574598230);
                        i18 = 447762009;
                        int i4110 = iM450210 ^ i18;
                        i33 = i2;
                        int i4111 = i17;
                        i32 = i;
                        i28 = i4111;
                        int i4112 = i5;
                        i29 = i4110;
                        i30 = i4112;
                    } else {
                        iM11306 = C19806.m45029("֡ܺ") ^ i26;
                        i3 = ((iM11306 ^ i27) * (-24417)) ^ 878133652;
                        i4 = 1200576538;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    }
                    break;
                case 198484234:
                case 1048675871:
                    i = i32;
                    i2 = i33;
                    j = j5 + j3;
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩺") ^ i26) * (-91);
                        i3 = ((iM11306 ^ i27) * 31257) ^ (-1414378863);
                        i4 = 114791004;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    } else {
                        i33 = i2;
                        iM11307 = C19806.m45029("۟ܿ") ^ i26;
                        i23 = ((iM11307 ^ i27) * 25545) ^ 1526908295;
                        i24 = 147361472;
                        int i65 = iM11307 ^ i24;
                        i32 = i;
                        i28 = i23;
                        i25 = i30;
                        i29 = i65;
                        i30 = i25;
                    }
                    break;
                case 317299034:
                case 1153965515:
                    int i66 = i32;
                    i20 = i33;
                    j6 = i39;
                    long j8 = iM5351;
                    if (C1377.f5749) {
                        int iM113013 = ThreadFactoryC3888.m11306("ۙۙ") ^ i27;
                        int i67 = ((iM113013 ^ i26) * (-30123)) ^ 774840784;
                        i29 = iM113013 ^ 46803329;
                        i33 = i20;
                        j4 = j8;
                        i32 = i66;
                        i28 = i67;
                    } else {
                        i19 = i30;
                        j4 = j8;
                        i32 = i66;
                        iM450211 = C19806.m45029("۠۫") ^ i26;
                        i21 = ((iM450211 ^ i27) * 27491) ^ 573910;
                        i22 = -1490068661;
                        int i5116 = iM450211 ^ i22;
                        i33 = i20;
                        i25 = i19;
                        i29 = i5116;
                        i28 = i21;
                        i30 = i25;
                    }
                    break;
                case 439631526:
                case 1804691651:
                    i = i32;
                    i2 = i33;
                    if (i39 > iM3739 - 284) {
                        i5 = i30;
                        iM450210 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i27;
                        i17 = ((iM450210 ^ i26) * 18983) ^ 584665591;
                        i18 = 44037842;
                        int i4113 = iM450210 ^ i18;
                        i33 = i2;
                        int i4114 = i17;
                        i32 = i;
                        i28 = i4114;
                        int i4115 = i5;
                        i29 = i4113;
                        i30 = i4115;
                    } else {
                        iM11306 = C19806.m45029("֨ۧ") ^ i26;
                        i3 = ((iM11306 ^ i27) * (-4893)) ^ (-1788417628);
                        i4 = -520628991;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    }
                    break;
                case 569077621:
                case 2033533741:
                    i5 = i30;
                    i = i32;
                    i2 = i33;
                    if (i39 >= 0) {
                        iM450210 = C19806.m45029("֫۟") ^ i27;
                        i17 = ((iM450210 ^ i26) * 18111) ^ 194036878;
                        i18 = 2139660636;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i27;
                        i17 = ((iM450210 ^ i26) * 18983) ^ 584665591;
                        i18 = 44037842;
                    }
                    int i4116 = iM450210 ^ i18;
                    i33 = i2;
                    int i4117 = i17;
                    i32 = i;
                    i28 = i4117;
                    int i4118 = i5;
                    i29 = i4116;
                    i30 = i4118;
                    break;
                case 714290705:
                case 1117547023:
                    i = i32;
                    i2 = i33;
                    if (C15157.m36347(i39, bArr2) != 512) {
                        i5 = i30;
                        iM450210 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i27;
                        i17 = ((iM450210 ^ i26) * 18983) ^ 584665591;
                        i18 = 44037842;
                        int i4119 = iM450210 ^ i18;
                        i33 = i2;
                        int i41110 = i17;
                        i32 = i;
                        i28 = i41110;
                        int i41111 = i5;
                        i29 = i4119;
                        i30 = i41111;
                    } else {
                        iM11306 = C19806.m45029("ܽۗ") ^ i27;
                        i3 = ((iM11306 ^ i26) * 1433) ^ (-412097421);
                        i4 = -2132617490;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    }
                    break;
                case 769591610:
                case 1235885901:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i27 - C19806.m45029("ܶۡ")) * (-13);
                        i10 = ((iM45029 ^ i26) * (-21951)) ^ (-1163112276);
                        i11 = 1241910471;
                        i29 = iM45029 ^ i11;
                        i28 = i10;
                    } else {
                        i = i32;
                        i2 = i33;
                        iM11306 = (i26 - C19806.m45029("۫ᩴ")) * (-67);
                        i3 = ((iM11306 ^ i27) * 27061) ^ (-1656236106);
                        i4 = -1679050073;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    }
                    break;
                case 926053988:
                case 2131310599:
                    int i68 = i30;
                    i2 = i33;
                    i6 = i35;
                    i9 = i38;
                    int i69 = i40;
                    i8 = i32;
                    i7 = i69;
                    length = bArr2.length;
                    if (C2124.f7782 <= 0) {
                        i30 = i68;
                        int iM4502110 = (C19806.m45029("ۙ֨") + i27) * 39;
                        int i5117 = ((iM4502110 ^ i26) * 21045) ^ 1675492461;
                        i29 = iM4502110 ^ 1207842020;
                        i35 = i6;
                        i38 = i9;
                        i34 = length;
                        i33 = i2;
                        i28 = i5117;
                    } else {
                        int iM113014 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i27;
                        i35 = i6;
                        i38 = i9;
                        i34 = length;
                        i28 = ((iM113014 ^ i26) * 16133) ^ 1242417210;
                        i33 = i2;
                        i30 = i68;
                        i29 = iM113014 ^ (-1707241678);
                    }
                    bArr2 = bArr;
                    int i5118 = i8;
                    i40 = i7;
                    i32 = i5118;
                    break;
                case 1002473854:
                case 1485193214:
                    if (C2124.m6673() <= 0) {
                        i19 = i30;
                        i20 = i33;
                        iM450211 = C19806.m45029("۠۫") ^ i26;
                        i21 = ((iM450211 ^ i27) * 27491) ^ 573910;
                        i22 = -1490068661;
                        int i5119 = iM450211 ^ i22;
                        i33 = i20;
                        i25 = i19;
                        i29 = i5119;
                        i28 = i21;
                        i30 = i25;
                    } else {
                        i = i32;
                        i2 = i33;
                        iM11306 = (i26 - C19806.m45029("۫ᩴ")) * (-67);
                        i3 = ((iM11306 ^ i27) * 27061) ^ (-1656236106);
                        i4 = -1679050073;
                        i29 = iM11306 ^ i4;
                        i32 = i;
                        i28 = i3;
                        i33 = i2;
                    }
                    break;
                case 1730208800:
                case 1758755196:
                    throw new IOException();
                default:
                    i = i32;
                    i2 = i33;
                    j2 = j6 + j4;
                    if (C0216.f1393 != 0) {
                        iM11306 = (i26 - C19806.m45029("۫ᩴ")) * (-67);
                        i3 = ((iM11306 ^ i27) * 27061) ^ (-1656236106);
                        i4 = -1679050073;
                    } else {
                        iM11306 = C19806.m45029("᩵ۜ") ^ i26;
                        i3 = ((iM11306 ^ i27) * (-63)) ^ (-608235593);
                        i4 = 244522048;
                    }
                    i29 = iM11306 ^ i4;
                    i32 = i;
                    i28 = i3;
                    i33 = i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m20749(byte[] bArr) {
        m20754(C22253.m49415(bArr), bArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized Future m20754(final String str, final byte[] bArr) {
        if (!C2871.m8642()) {
            return null;
        }
        byte[] bArr2 = (byte[]) f25841.m25800(str);
        if (bArr2 != null) {
            return new FutureC18440(bArr2);
        }
        C21445 c21445 = f25842;
        Future future = (Future) c21445.getOrDefault(str, null);
        if (future != null) {
            return future;
        }
        Future futureSubmit = C4716.f16635.submit(new Callable() { // from class: l.᩸֫ۘ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7857.m20752(str, bArr);
            }
        });
        c21445.put(str, futureSubmit);
        return futureSubmit;
    }
}
