package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.widget.CompoundButton;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۧ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5VT */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceConnectionC11301 extends AbstractActivityC12483 implements CompoundButton.OnCheckedChangeListener, ServiceConnection {

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38149 = 0;

    /* JADX INFO: renamed from: ܶۛ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f38150 = {1405, -14765, 7198, -15534, -9214, 4832, 15638, 20191, 20181, 20182, 20184, 20173, 20176, 20183, 20190, 20198, 20187, 20172, 20173, 20173, 20182, 20183, 20198, 20170, 20173, 20176, 20186, 20178, 20198, 20173, 20182, 20198, 20188, 20189, 20190, 20188, 12697, -11511, -13926, 20188, 20183, 20184, 20187, 20181, 20188, 20198, 20187, 20176, 20183, 20198, 20186, 20182, 20183, 20175, 20188, 20171, 20173, 20188, 20183, 20184, 20187, 20181, 20188, 20198, 20182, 20186, 20173, 20198, 20186, 20182, 20183, 20175, 20188, 20171, 20173, 299, 4631, 3692, -6676, 10595, 186, 1115, -597, 16269, 10271, 8348, -7407, 1958, 29091, 29097, 29098, 29092, 29105, 29100, 29099, 29090, 29082, 29095, 29104, 29105, 29105, 29098, 29099, 29082, 29110, 29105, 29100, 29094, 29102, 29082, 29105, 29098, 29082, 29088, 29089, 29090, 29088, 2987, 1704, -437, 29088, 29099, 29092, 29095, 29097, 29088, 29082, 29095, 29100, 29099, 29082, 29094, 29098, 29099, 29107, 29088, 29111, 29105, -3635, 1026, -5048, 29088, 29099, 29092, 29095, 29097, 29088, 29082, 29098, 29094, 29105, 29082, 29094, 29098, 29099, 29107, 29088, 29111, 29105, 6803, 17675, 18132, 19410, -27758, 16808, 28655, 1202, -3347, -3362, -3361, -3377, -3331, -3367, -3383, -3362, -3371, -3329, -3383, -3368, -3368, -3387, -3390, -3381, -3361};

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public BinderC12712 f38151;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۙ */
    public final void mo121(C4014 c4014) {
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -1051968399;
        int i6 = C1461.f5957;
        int i7 = RunnableC1606.f6488;
        int iM11306 = (ThreadFactoryC3888.m11306("ۧ֨") + i7) * 45;
        int i8 = ((iM11306 ^ i6) * (-1281)) ^ (-1713016413);
        int i9 = -593818483;
        while (true) {
            i5 = ((((i5 ^ i6) * (-7319)) >> 31) & i8) ^ (iM11306 ^ i9);
            switch (i5) {
                case -2058285399:
                case -662381845:
                    s = sArr[c];
                    i = s * s;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۨ") + i6) * 47;
                        i8 = ((iM11306 ^ i7) * 28603) ^ (-1490658353);
                        i9 = 1435446614;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֨") ^ i7) * (-107);
                        i8 = ((iM11306 ^ i6) * (-1939)) ^ 1941431269;
                        i9 = 1715329567;
                    }
                    break;
                case -2049753519:
                case -604172596:
                    if (i2 - (s * s2) >= 0) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۤ۟")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM11306 ^ i7) * 24387) ^ 699679888;
                        i9 = 1132565763;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 13949) ^ (-1057194343);
                        i9 = 2138745423;
                    }
                    break;
                case -2015493414:
                case 1858462226:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ۨ᩶") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17) ^ 340147397;
                        i9 = -319011727;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ۛ֡")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM11306 ^ i6) * (-9665)) ^ (-791651189);
                        i9 = -843772837;
                    }
                    break;
                case -1978810453:
                case 389259935:
                    RunnableC3388.m10064();
                    C1875.m6086();
                    return null;
                case -1844678948:
                case -1265006244:
                    C2477.m7593();
                    C19806.m45024();
                    iM11306 = C19806.m45029("ۨᩴ") ^ i6;
                    i8 = ((iM11306 ^ i7) * 8997) ^ 2075054727;
                    i9 = -764906876;
                    break;
                case -1669791169:
                case -478735060:
                    s2 = 13850;
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۨᩴ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 8997) ^ 2075054727;
                        i9 = -764906876;
                    } else {
                        iM11306 = (C19806.m45029("᩵۬") + i7) * (-125);
                        i8 = ((iM11306 ^ i6) * 23357) ^ 1920055595;
                        i9 = 1742405660;
                    }
                    break;
                case -1631136935:
                case -1614822235:
                    sArr2 = f38150;
                    i4 = 167;
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ۨ᩶") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17) ^ 340147397;
                        i9 = -319011727;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩸ᩴ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM11306 ^ i6) * (-8821)) ^ 1576312396;
                        i9 = -224962;
                    }
                    break;
                case -1534548030:
                case -1395714533:
                    return CallableC1627.m5502(sArr2, i4, 17, i3);
                case -1490836042:
                case -1409382383:
                    i2 = 47955625 + i;
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = C19806.m45029("ۨ᩶") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17) ^ 340147397;
                        i9 = -319011727;
                    } else {
                        iM11306 = (C19806.m45029("᩷ܽ") + i6) * 85;
                        i8 = ((iM11306 ^ i7) * (-10191)) ^ (-155610682);
                        i9 = -1178120175;
                    }
                    break;
                case -735291930:
                case 656190701:
                    i3 = 3984;
                    iM11306 = ThreadFactoryC3888.m11306("ܶ֡") ^ i7;
                    i8 = ((iM11306 ^ i6) * 5527) ^ (-196471092);
                    i9 = 1885927254;
                    break;
                case -712987321:
                case 398516053:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ܽ᩸") + i7) * 37;
                        i8 = ((iM11306 ^ i6) * 15499) ^ (-1527408535);
                        i9 = -1314586811;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ܳۨ")) * 41;
                        i8 = ((iM11306 ^ i7) * (-9037)) ^ 881039514;
                        i9 = 1188554668;
                    }
                    break;
                case -551173683:
                case -210857411:
                    c = 166;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("ܽ᩸") + i7) * 37;
                        i8 = ((iM11306 ^ i6) * 15499) ^ (-1527408535);
                        i9 = -1314586811;
                    } else {
                        iM11306 = (C19806.m45029("᩵ܺ") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM11306 ^ i7) * (-27853)) ^ 94932418;
                        i9 = 724454579;
                    }
                    break;
                case -409986930:
                case 1735619067:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ܿۧ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-31785)) ^ (-1804186873);
                        i9 = 978820119;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۨ") + i6) * 47;
                        i8 = ((iM11306 ^ i7) * 28603) ^ (-1490658353);
                        i9 = 1435446614;
                    }
                    break;
                case -302679445:
                case 1204778923:
                    i3 = 62124;
                    iM11306 = ThreadFactoryC3888.m11306("ܶ֡") ^ i7;
                    i8 = ((iM11306 ^ i6) * 5527) ^ (-196471092);
                    i9 = 1885927254;
                    break;
                case -175352888:
                case 1056324977:
                    sArr = f38150;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ۨ᩶") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17) ^ 340147397;
                        i9 = -319011727;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i7;
                        i8 = ((iM11306 ^ i6) * 8659) ^ 739016965;
                        i9 = 1726584675;
                    }
                    break;
                case 468890010:
                case 772271527:
                    C2871.m8646();
                    if (C2788.f10625 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩺") ^ i7;
                        i8 = ((iM11306 ^ i6) * 8723) ^ 706440060;
                        i9 = -810837410;
                    } else {
                        iM11306 = C19806.m45029("ۨᩴ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 8997) ^ 2075054727;
                        i9 = -764906876;
                    }
                    break;
                case 545039256:
                case 1286370715:
                    C1066.m4023();
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("ۨ᩶") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17) ^ 340147397;
                        i9 = -319011727;
                    } else {
                        iM11306 = C19806.m45029("ۨᩴ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 8997) ^ 2075054727;
                        i9 = -764906876;
                    }
                    break;
                case 1611603781:
                case 1867508452:
                    C1937.m6279();
                    if (!C1668.m5583()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩺") ^ i7;
                        i8 = ((iM11306 ^ i6) * 8723) ^ 706440060;
                        i9 = -810837410;
                    } else {
                        iM11306 = (C19806.m45029("ܽ᩸") + i7) * 37;
                        i8 = ((iM11306 ^ i6) * 15499) ^ (-1527408535);
                        i9 = -1314586811;
                    }
                    break;
                default:
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("ܽ᩸") + i7) * 37;
                        i8 = ((iM11306 ^ i6) * 15499) ^ (-1527408535);
                        i9 = -1314586811;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۚ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-18231)) ^ (-1871629881);
                        i9 = -1074425740;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0205 A[PHI: r2 r8 r20
      0x0205: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:56:0x0203, B:39:0x0129, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:56:0x0203, B:39:0x0129, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r20v17 int) = (r20v5 int), (r20v11 int), (r20v18 int) binds: [B:56:0x0203, B:39:0x0129, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x023f A[PHI: r7 r13 r14 r15 r20
      0x023f: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:60:0x023d, B:43:0x014e, B:11:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:60:0x023d, B:43:0x014e, B:11:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:60:0x023d, B:43:0x014e, B:11:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:60:0x023d, B:43:0x014e, B:11:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r20v19 int) = (r20v4 int), (r20v10 int), (r20v22 int) binds: [B:60:0x023d, B:43:0x014e, B:11:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x005f A[PHI: r3 r9 r10 r11 r20
      0x005f: PHI (r3v6 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:31:0x00d9, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r9v5 int) = (r9v2 int), (r9v6 int) binds: [B:31:0x00d9, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r10v5 int) = (r10v2 int), (r10v6 int) binds: [B:31:0x00d9, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r11v5 int) = (r11v2 int), (r11v6 int) binds: [B:31:0x00d9, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r20v26 int) = (r20v13 int), (r20v27 int) binds: [B:31:0x00d9, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onPause() {
        int iM11306;
        int i;
        int i2;
        int i3;
        int i4 = C1875.f7103;
        int i5 = C0278.f1572;
        int iM11307 = (i5 - ThreadFactoryC3888.m11306("ۢܳ")) * 27;
        int i6 = ((iM11307 ^ i4) * 21101) ^ 1081715200;
        String strM7604 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM11307 ^ (-2111690984);
        int i8 = 0;
        int iM45029 = 0;
        int iM450210 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1459150639;
        char c = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i4) * (-27513)) >> 31));
            switch (i16) {
                case -1960686920:
                case 1157049217:
                    i8 = i8;
                    iM45029 = C19806.m45029(C0797.m3361(sArr2, i14, i15, i13));
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨۬")) * (-49);
                        i = ((iM11306 ^ i5) * (-30791)) ^ (-1273760445);
                        i2 = 21263086;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۢ") ^ i4;
                        i = ((iM11306 ^ i5) * 373) ^ 1622532133;
                        i2 = 1358104330;
                    }
                    int i17 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i17;
                    break;
                case -1841509835:
                case -533789878:
                    i8 = i8;
                    s = sArr[c];
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܽ") ^ i4;
                        i = ((iM11306 ^ i5) * 13171) ^ (-372568095);
                        i2 = -762551439;
                    } else {
                        iM11306 = C19806.m45029("ۢۡ") ^ i4;
                        i = ((iM11306 ^ i5) * (-1571)) ^ 918828957;
                        i2 = 664484426;
                    }
                    int i18 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i18;
                    break;
                case -1722531958:
                case -688627111:
                    i8 = i8;
                    sArr = f38150;
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("ۖ֨") ^ i5;
                        i = ((iM11306 ^ i4) * 7341) ^ 1820348979;
                        i2 = 1141962697;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩺") ^ i5) * 11;
                        i = ((iM11306 ^ i4) * (-21367)) ^ (-1575893607);
                        i2 = 2060752418;
                    }
                    int i19 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i19;
                    break;
                case -1544699502:
                case 1402204917:
                    i13 = 3625;
                    iM11306 = (C19806.m45029("۠ܶ") + i4) * (-119);
                    i = ((iM11306 ^ i5) * (-29491)) ^ 26735633;
                    i2 = -159460831;
                    int i110 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i110;
                    break;
                case -1354444462:
                case -581210571:
                    i13 = 5459;
                    iM11306 = (C19806.m45029("۠ܶ") + i4) * (-119);
                    i = ((iM11306 ^ i5) * (-29491)) ^ 26735633;
                    i2 = -159460831;
                    int i111 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i111;
                    break;
                case -1144967188:
                case 163360060:
                    i3 = iM45029 ^ 2117670444;
                    sArr3 = f38150;
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("۠۠") ^ i4;
                        i8 = i3;
                        i = ((iM11306 ^ i5) * 867) ^ 1832753584;
                        i2 = -1227925438;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i5;
                        i8 = i3;
                        i = ((iM11306 ^ i4) * 16933) ^ (-1503613782);
                        i2 = 1294554;
                    }
                    int i112 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i112;
                    break;
                case -861211176:
                case 1374355140:
                    i8 = i8;
                    i9 = s + 6656;
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨۬")) * (-49);
                        i = ((iM11306 ^ i5) * (-30791)) ^ (-1273760445);
                        i2 = 21263086;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ۟") ^ i5) * (-59);
                        i = ((iM11306 ^ i4) * 21223) ^ (-707683697);
                        i2 = 97326472;
                    }
                    int i113 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i113;
                    break;
                case -704382755:
                case 493353399:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C1668.f6641 < 0) {
                        i8 = i8;
                        iM11306 = ThreadFactoryC3888.m11306("ܽܽ") ^ i4;
                        i = ((iM11306 ^ i5) * 13171) ^ (-372568095);
                        i2 = -762551439;
                        int i114 = i8;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                        i8 = i114;
                    }
                    i8 = i8;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("۠᩵")) * (-121);
                    i = ((iM11306 ^ i4) * 17407) ^ 131780585;
                    i2 = 859739842;
                    int i115 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i115;
                    break;
                case -310347680:
                case -43544723:
                    overridePendingTransition(i8, 2097520514 ^ iM450210);
                    super.onPause();
                    break;
                case -158512950:
                case -84251639:
                    RunnableC1895.m6170();
                    if (C2642.f10294 > 0) {
                        i8 = i8;
                        iM11306 = C19806.m45029("ۖ֨") ^ i5;
                        i = ((iM11306 ^ i4) * 7341) ^ 1820348979;
                        i2 = 1141962697;
                        int i116 = i8;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                        i8 = i116;
                    }
                    i8 = i8;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("۠᩵")) * (-121);
                    i = ((iM11306 ^ i4) * 17407) ^ 131780585;
                    i2 = 859739842;
                    int i117 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i117;
                    break;
                case -68547978:
                case 1056160003:
                    i8 = i8;
                    c = 159;
                    if (C2642.m8171() != 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("۠᩵")) * (-121);
                        i = ((iM11306 ^ i4) * 17407) ^ 131780585;
                        i2 = 859739842;
                    } else {
                        iM11306 = (C19806.m45029("ܽ֨") ^ i4) * (-123);
                        i = ((iM11306 ^ i5) * 17685) ^ (-1462218958);
                        i2 = 1824666379;
                    }
                    int i118 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i118;
                    break;
                case 358472195:
                case 968726396:
                    if (!C19806.f63586) {
                        i8 = i8;
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨۬")) * (-49);
                        i = ((iM11306 ^ i5) * (-30791)) ^ (-1273760445);
                        i2 = 21263086;
                        int i119 = i8;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                        i8 = i119;
                    }
                    i8 = i8;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("۠᩵")) * (-121);
                    i = ((iM11306 ^ i4) * 17407) ^ 131780585;
                    i2 = 859739842;
                    int i1110 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i1110;
                    break;
                case 507301751:
                case 1499934012:
                    C0962.m3746();
                    C3743.m10966();
                    i8 = i8;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("۠᩵")) * (-121);
                    i = ((iM11306 ^ i4) * 17407) ^ 131780585;
                    i2 = 859739842;
                    int i1111 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i1111;
                    break;
                case 537802620:
                case 1553965432:
                    RunnableC3388.m10064();
                    break;
                case 552771007:
                case 759400143:
                    i8 = i8;
                    int i20 = i11 + i12;
                    if ((i20 + i20) - i10 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩺") + i4) * (-89);
                        i = ((iM11306 ^ i5) * (-12935)) ^ (-828338151);
                        i2 = -423207748;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۙ᩻")) * 109;
                        i = ((iM11306 ^ i4) * 31869) ^ (-663909541);
                        i2 = -657114956;
                    }
                    int i1112 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i1112;
                    break;
                case 553950785:
                case 1576966127:
                    i8 = i8;
                    strM7604 = C2477.m7604(sArr3, 163, 3, i13);
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        i3 = i8;
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i5;
                        i8 = i3;
                        i = ((iM11306 ^ i4) * 16933) ^ (-1503613782);
                        i2 = 1294554;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ܶ۟")) * (-21);
                        i = ((iM11306 ^ i4) * (-26997)) ^ 14107591;
                        i2 = -19984899;
                    }
                    int i1113 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i1113;
                    break;
                case 600946269:
                case 1803588311:
                    iM450210 = C19806.m45029(strM7604);
                    if (C1977.f7413 <= 0) {
                        i8 = i8;
                        iM11306 = C19806.m45029("ۖ֨") ^ i5;
                        i = ((iM11306 ^ i4) * 7341) ^ 1820348979;
                        i2 = 1141962697;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܺ") + i4) * (-49);
                        i8 = i8;
                        i = ((iM11306 ^ i5) * 16771) ^ 1416463627;
                        i2 = 384916997;
                    }
                    int i1114 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i1114;
                    break;
                case 1351068263:
                case 1572322490:
                    i8 = i8;
                    sArr2 = f38150;
                    i14 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                    i15 = 3;
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܽ") ^ i4;
                        i = ((iM11306 ^ i5) * 13171) ^ (-372568095);
                        i2 = -762551439;
                    } else {
                        iM11306 = C19806.m45029("ۘ᩵") ^ i5;
                        i = ((iM11306 ^ i4) * 15463) ^ 1979308088;
                        i2 = 1501611643;
                    }
                    int i1115 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i1115;
                    break;
                default:
                    i8 = i8;
                    i10 = i9 * i9;
                    i11 = s * s;
                    i12 = 44302336;
                    if (C0671.f2816 != 0) {
                        i3 = i8;
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i5;
                        i8 = i3;
                        i = ((iM11306 ^ i4) * 16933) ^ (-1503613782);
                        i2 = 1294554;
                    } else {
                        iM11306 = C19806.m45029("ᩳ֫") ^ i5;
                        i = ((iM11306 ^ i4) * (-22621)) ^ (-820324794);
                        i2 = 808959024;
                    }
                    int i1116 = i8;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    i8 = i1116;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:61:0x024f A[PHI: r1 r5 r11 r12 r14 r15
      0x024f: PHI (r1v4 int) = (r1v3 int), (r1v2 int), (r1v2 int) binds: [B:60:0x024d, B:48:0x01cd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:60:0x024d, B:48:0x01cd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:60:0x024d, B:48:0x01cd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:60:0x024d, B:48:0x01cd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:60:0x024d, B:48:0x01cd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:60:0x024d, B:48:0x01cd, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x030f A[PHI: r6 r8 r9 r21
      0x030f: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:76:0x030d, B:71:0x02d7, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v5 int) binds: [B:76:0x030d, B:71:0x02d7, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:76:0x030d, B:71:0x02d7, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r21v5 short) = (r21v4 short), (r21v3 short), (r21v3 short) binds: [B:76:0x030d, B:71:0x02d7, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0344 A[PHI: r3 r4 r13 r16
      0x0344: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:80:0x0342, B:56:0x0228, B:44:0x01ab, B:34:0x0135, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:80:0x0342, B:56:0x0228, B:44:0x01ab, B:34:0x0135, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:80:0x0342, B:56:0x0228, B:44:0x01ab, B:34:0x0135, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:80:0x0342, B:56:0x0228, B:44:0x01ab, B:34:0x0135, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0374  */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int iM11306;
        int i;
        int i2;
        String strM11312;
        int i3 = C2788.f10625;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11307 = ThreadFactoryC3888.m11306("ܰۛ") ^ i3;
        int i5 = ((iM11307 ^ i4) * 16211) ^ 1073585670;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ (-2107402549);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 293404062;
        short s3 = 0;
        String strM1588 = null;
        String strM8470 = null;
        String str = null;
        int iM6354 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-21185)) >> 31));
            switch (i13) {
                case -1955325498:
                case 984615408:
                    int i14 = s + s2;
                    if (i8 - (i14 * i14) > 0) {
                        iM11306 = C19806.m45029("ۖ᩹") ^ i4;
                        i = ((iM11306 ^ i3) * (-19843)) ^ 1808423983;
                        i2 = -263651334;
                    } else {
                        iM11306 = C19806.m45029("ۗᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * 15719) ^ 1961616044;
                        i2 = 1340825203;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1868782974:
                case 1070955979:
                    strM11312 = ThreadFactoryC3888.m11312(f38150, 7, 29, i9);
                    str = strM11312;
                    iM11306 = ThreadFactoryC3888.m11306("᩺᩻") ^ i4;
                    i = ((iM11306 ^ i3) * (-3779)) ^ 801617140;
                    i2 = -1318632631;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1777114620:
                case -426761808:
                    strM11312 = C2871.m8640(f38150, 57, 18, i9);
                    str = strM11312;
                    iM11306 = ThreadFactoryC3888.m11306("᩺᩻") ^ i4;
                    i = ((iM11306 ^ i3) * (-3779)) ^ 801617140;
                    i2 = -1318632631;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1572263959:
                case -1255305920:
                    s2 = 1;
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ۠")) * q.h;
                        i = ((iM11306 ^ i4) * (-17551)) ^ (-1813390976);
                        i2 = 1311899546;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۧ") ^ i3;
                        i = ((iM11306 ^ i4) * (-12481)) ^ 589465190;
                        i2 = 1587161537;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1505875503:
                case -413521598:
                    s = sArr[0];
                    s3 = 2;
                    if (C10634.f36300 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ۠")) * q.h;
                        i = ((iM11306 ^ i4) * (-17551)) ^ (-1813390976);
                        i2 = 1311899546;
                    } else {
                        iM11306 = C19806.m45029("ܶ᩸") ^ i3;
                        i = ((iM11306 ^ i4) * (-1909)) ^ 1049827172;
                        i2 = -780382413;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1483305248:
                case -1255320772:
                    iM6354 = C1977.m6354(compoundButton);
                    sArr2 = f38150;
                    i10 = 1;
                    if (C1419.m4973()) {
                        iM11306 = (C19806.m45029("᩷۟") ^ i3) * 59;
                        i = ((iM11306 ^ i4) * 25377) ^ 1135688904;
                        i2 = -1706353527;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۜܰ")) * (-73);
                        i = ((iM11306 ^ i3) * (-9845)) ^ 1161316580;
                        i2 = 1192921672;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -866132723:
                case 2085574283:
                    C0817.m3399();
                    C0962.m3746();
                    break;
                case -787691183:
                case -286677575:
                    i9 = 20153;
                    iM11306 = (ThreadFactoryC3888.m11306("᩹ۙ") ^ i3) * (-7);
                    i = ((iM11306 ^ i4) * (-16663)) ^ 320726437;
                    i2 = -2115385274;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -749813614:
                case 826356733:
                    C0671.m3008();
                    if (C2871.m8646()) {
                        iM11306 = C19806.m45029("ۖۖ") ^ i3;
                        i = ((iM11306 ^ i4) * (-24673)) ^ (-1803954567);
                        i2 = -1449040227;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿ۠")) * 27;
                        i = ((iM11306 ^ i3) * 20829) ^ 1887121965;
                        i2 = -194548938;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -745503870:
                case 745622062:
                    sArr = f38150;
                    if (C10634.m26820()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨᩷")) * (-43);
                        i = ((iM11306 ^ i3) * (-30945)) ^ 1592013197;
                        i2 = 663126170;
                    } else {
                        iM11306 = C19806.m45029("᩷֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-6139)) ^ (-1891052668);
                        i2 = 1943271693;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -679193629:
                case 1688814166:
                    C1875.m6086();
                    if (C2704.m8255() <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿ۠")) * 27;
                        i = ((iM11306 ^ i3) * 20829) ^ 1887121965;
                        i2 = -194548938;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨᩷")) * (-43);
                        i = ((iM11306 ^ i3) * (-30945)) ^ 1592013197;
                        i2 = 663126170;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -623997572:
                case 1716618399:
                    strM11312 = C1419.m4969(f38150, 39, 18, i9);
                    str = strM11312;
                    iM11306 = ThreadFactoryC3888.m11306("᩺᩻") ^ i4;
                    i = ((iM11306 ^ i3) * (-3779)) ^ 801617140;
                    i2 = -1318632631;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -359715651:
                case 52161374:
                    C1679.m5597(ApplicationC0716.f2992, str, z);
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰ᩸")) * 57;
                    i = ((iM11306 ^ i3) * (-24597)) ^ (-1538804379);
                    i2 = -840909223;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -314377672:
                case 1371337741:
                    i11 = 3;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨᩷")) * (-43);
                        i = ((iM11306 ^ i3) * (-30945)) ^ 1592013197;
                        i2 = 663126170;
                    } else {
                        iM11306 = C19806.m45029("᩷ܳ") ^ i3;
                        i = ((iM11306 ^ i4) * 12105) ^ 1595402830;
                        i2 = -2029013240;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -294995221:
                case 275126719:
                    if (str != null) {
                        iM11306 = (i3 - C19806.m45029("ۤܽ")) * 41;
                        i = ((iM11306 ^ i4) * (-24665)) ^ 2056880509;
                        i2 = -1448144584;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰ᩸")) * 57;
                        i = ((iM11306 ^ i3) * (-24597)) ^ (-1538804379);
                        i2 = -840909223;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -282490596:
                case 697854205:
                    strM8470 = C2788.m8470(sArr3, i12, i7, i9);
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i4 - C19806.m45029("ᩳᩳ")) * 21;
                        i = ((iM11306 ^ i3) * (-10343)) ^ 775647297;
                        i2 = 165349125;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨᩷")) * (-43);
                        i = ((iM11306 ^ i3) * (-30945)) ^ 1592013197;
                        i2 = 663126170;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -183625342:
                case 266733681:
                    if (iM6354 == (C19806.m45029(strM1588) ^ 2130368115)) {
                        iM11306 = (i3 - C19806.m45029("ܿܳ")) * (-3);
                        i = ((iM11306 ^ i4) * (-21847)) ^ (-452301727);
                        i2 = -1733961910;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨܰ") + i4) * (-23);
                        i = ((iM11306 ^ i3) * 7923) ^ (-2031108446);
                        i2 = -1313922745;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -138527551:
                case 957549136:
                    strM11312 = null;
                    str = strM11312;
                    iM11306 = ThreadFactoryC3888.m11306("᩺᩻") ^ i4;
                    i = ((iM11306 ^ i3) * (-3779)) ^ 801617140;
                    i2 = -1318632631;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -106018834:
                case 465925980:
                    sArr3 = f38150;
                    i12 = 4;
                    i7 = 3;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("᩷۟") ^ i3) * 59;
                        i = ((iM11306 ^ i4) * 25377) ^ 1135688904;
                        i2 = -1706353527;
                    } else {
                        iM11306 = C19806.m45029("᩸۬") ^ i3;
                        i = ((iM11306 ^ i4) * 31221) ^ (-74091272);
                        i2 = 985946302;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -67150464:
                case 350218990:
                    break;
                case 182233098:
                case 1027431718:
                    if (iM6354 == (ThreadFactoryC3888.m11306(strM8470) ^ 2100851374)) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܳ") ^ i3;
                        i = ((iM11306 ^ i4) * (-23715)) ^ 204752684;
                        i2 = -1279281869;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟֡") ^ i3;
                        i = ((iM11306 ^ i4) * 26823) ^ (-515469123);
                        i2 = -995292830;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 259568772:
                case 545689597:
                    C1875.m6086();
                    iM11306 = C19806.m45029("ۖۖ") ^ i3;
                    i = ((iM11306 ^ i4) * (-24673)) ^ (-1803954567);
                    i2 = -1449040227;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 278260219:
                case 1363805230:
                    i9 = 10375;
                    iM11306 = (ThreadFactoryC3888.m11306("᩹ۙ") ^ i3) * (-7);
                    i = ((iM11306 ^ i4) * (-16663)) ^ 320726437;
                    i2 = -2115385274;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 289618198:
                case 585972542:
                    strM1588 = C0216.m1588(f38150, 36, 3, i9);
                    if (C0050.f912 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨᩷")) * (-43);
                        i = ((iM11306 ^ i3) * (-30945)) ^ 1592013197;
                        i2 = 663126170;
                    } else {
                        iM11306 = C19806.m45029("֨ۘ") ^ i4;
                        i = ((iM11306 ^ i3) * 31523) ^ 2037375200;
                        i2 = -1360745482;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 990477332:
                case 1270765501:
                    if (C0817.f3443) {
                        iM11306 = (C19806.m45029("᩷۟") ^ i3) * 59;
                        i = ((iM11306 ^ i4) * 25377) ^ 1135688904;
                        i2 = -1706353527;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿ۠")) * 27;
                        i = ((iM11306 ^ i3) * 20829) ^ 1887121965;
                        i2 = -194548938;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1350308649:
                case 1390569026:
                    if (iM6354 == (ThreadFactoryC3888.m11306(AbstractC0464.m2308(sArr2, i10, i11, i9)) ^ 2097579600)) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘᩴ")) * (-9);
                        i = ((iM11306 ^ i4) * (-11363)) ^ 660160916;
                        i2 = -365001868;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩷") + i4) * 5;
                        i = ((iM11306 ^ i3) * (-18281)) ^ 1785020302;
                        i2 = 1053453230;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1468897718:
                case 1800692430:
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("ۖۖ") ^ i3;
                        i = ((iM11306 ^ i4) * (-24673)) ^ (-1803954567);
                        i2 = -1449040227;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩷") ^ i4;
                        i = ((iM11306 ^ i3) * 22131) ^ 747792535;
                        i2 = 1922201933;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    i8 = (s * s3) + 1;
                    if (C2124.m6673() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ۠")) * q.h;
                        i = ((iM11306 ^ i4) * (-17551)) ^ (-1813390976);
                        i2 = 1311899546;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩸") ^ i4;
                        i = ((iM11306 ^ i3) * (-3853)) ^ 745892961;
                        i2 = 55303463;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        BinderC12712 binderC12712 = null;
        int i = -1862461615;
        int i2 = C10634.f36300;
        int i3 = C1066.f4915;
        int iM11306 = ThreadFactoryC3888.m11306("ܶۙ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-1687)) ^ 80555461;
        int i5 = 375415436;
        while (true) {
            i = ((((i ^ i3) * 2553) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1903996296:
                case 411536081:
                    C1025.m3861();
                    iM11306 = C19806.m45029("۠֨") ^ i2;
                    i4 = ((iM11306 ^ i3) * 32225) ^ 860840967;
                    i5 = -1447464529;
                    break;
                case -1903463497:
                case -1150877481:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۧܳ")) * 83;
                        i4 = ((iM11306 ^ i3) * (-29251)) ^ (-28644819);
                        i5 = 1919799840;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24171) ^ (-1559926479);
                        i5 = 1830600429;
                    }
                    break;
                case -1893851354:
                case -770138131:
                    if (RunnableC3388.m10064()) {
                        iM11306 = C19806.m45029("ۜᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11861) ^ 169234865;
                        i5 = 273453119;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽ᩺")) * 73;
                        i4 = ((iM11306 ^ i2) * (-6391)) ^ (-1002610748);
                        i5 = 2114963454;
                    }
                    break;
                case -1840263906:
                case -1732028131:
                    C0216.m1586(this);
                    iM11306 = (i2 - ThreadFactoryC3888.m11306("ۚܺ")) * 43;
                    i4 = ((iM11306 ^ i3) * (-25665)) ^ 295743617;
                    i5 = 363090394;
                    break;
                case -1673792691:
                case 1214220375:
                    AbstractC0464.m2313();
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽ᩺")) * 73;
                        i4 = ((iM11306 ^ i2) * (-6391)) ^ (-1002610748);
                        i5 = 2114963454;
                    } else {
                        iM11306 = (C19806.m45029("ۗ۫") + i3) * (-7);
                        i4 = ((iM11306 ^ i2) * 1283) ^ 1023847426;
                        i5 = 793996163;
                    }
                    break;
                case -1549608893:
                case 761548847:
                    if (!RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("ۗ۫") + i3) * (-7);
                        i4 = ((iM11306 ^ i2) * 1283) ^ 1023847426;
                        i5 = 793996163;
                    } else {
                        iM11306 = C19806.m45029("۠֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32225) ^ 860840967;
                        i5 = -1447464529;
                    }
                    break;
                case -1489628141:
                case 564058029:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9870(this)) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۚܺ")) * 43;
                        i4 = ((iM11306 ^ i3) * (-25665)) ^ 295743617;
                        i5 = 363090394;
                    } else {
                        iM11306 = C19806.m45029("ۖܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1361)) ^ 972060978;
                        i5 = -135053462;
                    }
                    break;
                case -1453033340:
                case 25960343:
                    super.onStop();
                    if (C0797.m3359()) {
                        iM11306 = (C19806.m45029("ܰ۫") ^ i3) * 59;
                        i4 = ((iM11306 ^ i2) * (-7089)) ^ (-218398346);
                        i5 = 1782843218;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽ᩺")) * 73;
                        i4 = ((iM11306 ^ i2) * (-6391)) ^ (-1002610748);
                        i5 = 2114963454;
                    }
                    break;
                case -1175217842:
                case -241702258:
                    if (C1460.m5050() != 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۧܳ")) * 83;
                        i4 = ((iM11306 ^ i3) * (-29251)) ^ (-28644819);
                        i5 = 1919799840;
                    } else {
                        iM11306 = C19806.m45029("ܶ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 31035) ^ (-168433006);
                        i5 = 276565405;
                    }
                    break;
                case -964918259:
                case 1978684998:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19739) ^ 375822322;
                        i5 = -1838966789;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-2785)) ^ (-611729005);
                        i5 = 1318308781;
                    }
                    break;
                case -841700374:
                case -564145617:
                    if (C10634.m26820()) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽ᩺")) * 73;
                        i4 = ((iM11306 ^ i2) * (-6391)) ^ (-1002610748);
                        i5 = 2114963454;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֡۬")) * 23;
                        i4 = ((iM11306 ^ i2) * 12967) ^ (-2068644606);
                        i5 = -649509454;
                    }
                    break;
                case -571908308:
                case 1223926303:
                    binderC12712.m31556();
                    iM11306 = (C19806.m45029("ۨܺ") + i3) * 15;
                    i4 = ((iM11306 ^ i2) * (-7693)) ^ 57863535;
                    i5 = 1361408339;
                    break;
                case -570368265:
                case -90297865:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۧܳ")) * 83;
                        i4 = ((iM11306 ^ i3) * (-29251)) ^ (-28644819);
                        i5 = 1919799840;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܺ֫")) * (-105);
                        i4 = ((iM11306 ^ i2) * 2393) ^ (-1304732688);
                        i5 = -927316788;
                    }
                    break;
                case -354080341:
                case 848755702:
                    binderC12712 = this.f38151;
                    if (binderC12712 != null) {
                        iM11306 = (C19806.m45029("ۗ۬") + i2) * (-23);
                        i4 = ((iM11306 ^ i3) * (-3163)) ^ 1124827957;
                        i5 = 194050380;
                    } else {
                        iM11306 = (C19806.m45029("ۨܺ") + i3) * 15;
                        i4 = ((iM11306 ^ i2) * (-7693)) ^ 57863535;
                        i5 = 1361408339;
                    }
                    break;
                case -118064738:
                case 1975567001:
                    if (C0797.f3386) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۧܳ")) * 83;
                        i4 = ((iM11306 ^ i3) * (-29251)) ^ (-28644819);
                        i5 = 1919799840;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۗ") + i2) * 85;
                        i4 = ((iM11306 ^ i3) * (-8649)) ^ 233678349;
                        i5 = 1583764648;
                    }
                    break;
                case 1430467:
                case 607754635:
                    break;
                case 381507340:
                case 1049546534:
                    C2788.m8472();
                    break;
                case 415707717:
                case 2028023415:
                    if (CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܳ") ^ i2) * 19;
                        i4 = ((iM11306 ^ i3) * 32217) ^ 1643308458;
                        i5 = -1213584761;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19739) ^ 375822322;
                        i5 = -1838966789;
                    }
                    break;
                case 1779461537:
                case 2087682215:
                    C19806.m45024();
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19739) ^ 375822322;
                        i5 = -1838966789;
                    } else {
                        iM11306 = C19806.m45029("۠֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 32225) ^ 860840967;
                        i5 = -1447464529;
                    }
                    break;
                default:
                    if (C0526.f2219) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۧܳ")) * 83;
                        i4 = ((iM11306 ^ i3) * (-29251)) ^ (-28644819);
                        i5 = 1919799840;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ᩳ") + i2) * (-97);
                        i4 = ((iM11306 ^ i3) * 16353) ^ (-37521974);
                        i5 = 1084125870;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00df, code lost:
    
        if (l.C19806.f63586 != false) goto L10;
     */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r39) {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceConnectionC11301.onCreate(android.os.Bundle):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BinderC12712 binderC12712 = null;
        int i = -1635860766;
        int i2 = C1460.f5948;
        int i3 = C0050.f912;
        int iM45029 = C19806.m45029("۫ۘ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-10455)) ^ 715585506;
        int i5 = 2139079795;
        while (true) {
            i = ((((i ^ i2) * 6957) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2134349283:
                case 303035654:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩻") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-25653)) ^ (-492679541);
                        i5 = 1904516441;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗۧ")) * (-127);
                        i4 = ((iM45029 ^ i2) * (-2125)) ^ 1941908983;
                        i5 = 324932827;
                    }
                    break;
                case -1902906443:
                case -1416613848:
                    if (C3286.f12186) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩻ۗ")) * (-83);
                        i4 = ((iM45029 ^ i3) * (-13099)) ^ (-396581023);
                        i5 = 1747048176;
                    } else {
                        iM45029 = C19806.m45029("᩵֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2507)) ^ 2000788801;
                        i5 = 211206357;
                    }
                    break;
                case -1876856727:
                case -1313255251:
                    if (!C19806.f63586) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩻ۗ")) * (-83);
                        i4 = ((iM45029 ^ i3) * (-13099)) ^ (-396581023);
                        i5 = 1747048176;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩻") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-25653)) ^ (-492679541);
                        i5 = 1904516441;
                    }
                    break;
                case -1693486776:
                case -697285910:
                    this.f38151 = binderC12712;
                    binderC12712.m31557();
                    this.f38151.m31558();
                    break;
                case -1544565178:
                case 1704908034:
                    C2704.m8255();
                    C3660.m10791();
                    break;
                case -1441637788:
                case 58149215:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩻") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-25653)) ^ (-492679541);
                        i5 = 1904516441;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-24859)) ^ 1529945635;
                        i5 = 708202997;
                    }
                    break;
                case -1103645661:
                case -907160501:
                    binderC12712 = (BinderC12712) iBinder;
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("֨ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-613)) ^ 1808060293;
                        i5 = 845574508;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧᩳ")) * 93;
                        i4 = ((iM45029 ^ i2) * 4897) ^ (-1170920170);
                        i5 = -1470768796;
                    }
                    break;
                case -858619322:
                case 976254319:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩻") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-25653)) ^ (-492679541);
                        i5 = 1904516441;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۤ") ^ i2) * q.h;
                        i4 = ((iM45029 ^ i3) * 27065) ^ 2013477497;
                        i5 = -797048494;
                    }
                    break;
                case -739553834:
                case -99126428:
                    C3535.m10431();
                    C3722.m10894();
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("᩻ۗ")) * (-83);
                    i4 = ((iM45029 ^ i3) * (-13099)) ^ (-396581023);
                    i5 = 1747048176;
                    break;
                case -380108298:
                case 1436791569:
                    if (RunnableC3388.m10064()) {
                        iM45029 = (C19806.m45029("ۛ۫") ^ i3) * (-25);
                        i4 = ((iM45029 ^ i2) * 28351) ^ 1124064837;
                        i5 = 837340038;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩻ۗ")) * (-83);
                        i4 = ((iM45029 ^ i3) * (-13099)) ^ (-396581023);
                        i5 = 1747048176;
                    }
                    break;
                case 740049525:
                case 1503456792:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۘ") ^ i2) * 93;
                        i4 = ((iM45029 ^ i3) * (-25381)) ^ (-105034040);
                        i5 = 1275283566;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩻") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-25653)) ^ (-492679541);
                        i5 = 1904516441;
                    }
                    break;
                case 792552423:
                case 861241565:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۘ") ^ i2) * 93;
                        i4 = ((iM45029 ^ i3) * (-25381)) ^ (-105034040);
                        i5 = 1275283566;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۠ᩳ")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-4653)) ^ (-1415471717);
                        i5 = -1818937674;
                    }
                    break;
                case 796443425:
                case 813044141:
                    if (RunnableC1895.f7152) {
                        iM45029 = (i3 - C19806.m45029("ᩳ᩸")) * (-99);
                        i4 = ((iM45029 ^ i2) * 26885) ^ 1117149527;
                        i5 = 1704316848;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧᩳ")) * 93;
                        i4 = ((iM45029 ^ i2) * 4897) ^ (-1170920170);
                        i5 = -1470768796;
                    }
                    break;
                case 1086284000:
                case 1785027518:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧᩳ")) * 93;
                        i4 = ((iM45029 ^ i2) * 4897) ^ (-1170920170);
                        i5 = -1470768796;
                    } else {
                        iM45029 = (C19806.m45029("᩶֡") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * 24069) ^ 863097672;
                        i5 = -987404310;
                    }
                    break;
                case 1786311163:
                case 1881606409:
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩻") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-25653)) ^ (-492679541);
                        i5 = 1904516441;
                    } else {
                        iM45029 = (C19806.m45029("ۤ᩷") ^ i2) * (-55);
                        i4 = ((iM45029 ^ i3) * 26357) ^ 1460617821;
                        i5 = -316453749;
                    }
                    break;
                default:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩻ۗ")) * (-83);
                        i4 = ((iM45029 ^ i3) * (-13099)) ^ (-396581023);
                        i5 = 1747048176;
                    } else {
                        iM45029 = C19806.m45029("ۚۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19981) ^ 282024991;
                        i5 = -731885743;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f38151 = null;
    }
}
