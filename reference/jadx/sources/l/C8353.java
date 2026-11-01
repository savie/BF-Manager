package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C8353 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۫۫ۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f28962;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f28963;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f28964;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC4514 f28965;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final PackageManager f28966;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7817 f28967;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28968;

    static {
        ApplicationC6132.m17119(98);
        f28962 = new short[]{2377, -31159, -31161, -31159, -31167, -31152, -31165, -31153, -31155, -31218, -31167, -31154, -31164, -31150, -31153, -31159, -31164, -31218, -31152, -31163, -31150, -31155, -31159, -31149, -31149, -31159, -31153, -31154, -31218, -31129, -31131, -31116, -31105, -31127, -31122, -31117, -31116, -31135, -31124, -31124, -31131, -31132, -31105, -31135, -31120, -31120, -31117, 2246, -7495, -354, -9270, -7756, 5055, 6421, 7516, -12109, 2705, -4239, -10958, -4045, -1763, -4613};
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public native void mo1158(Exception exc);

    public C8353(ViewOnClickListenerC4514 viewOnClickListenerC4514, int i) {
        int i2 = -1078754177;
        int i3 = C3535.f13026;
        int i4 = C2871.f10837;
        this.f28965 = viewOnClickListenerC4514;
        this.f28968 = i;
        int iM45029 = C19806.m45029("ۨ۬") ^ i3;
        int i5 = ((iM45029 ^ i4) * 22047) ^ 683575936;
        int i6 = -727487847;
        while (true) {
            i2 = ((((i2 ^ i4) * 18653) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2021109706:
                case 1424434462:
                    RunnableC1606.m5473();
                    throw new RuntimeException();
                case -1957557417:
                case 2068695353:
                    if (!C0629.m2907()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰ۟")) * (-27);
                        i5 = ((iM45029 ^ i4) * (-24847)) ^ 865817017;
                        i6 = 1974533188;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ܺ")) * 25;
                        i5 = ((iM45029 ^ i3) * (-20699)) ^ 655722591;
                        i6 = 616062945;
                    }
                    break;
                case -1765728652:
                case 1483859761:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ܺ")) * 25;
                        i5 = ((iM45029 ^ i3) * (-20699)) ^ 655722591;
                        i6 = 616062945;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ֨")) * (-15);
                        i5 = ((iM45029 ^ i4) * 30127) ^ 839973707;
                        i6 = -429846217;
                    }
                    break;
                case -1460201768:
                case 612253560:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ֨")) * (-15);
                        i5 = ((iM45029 ^ i4) * 30127) ^ 839973707;
                        i6 = -429846217;
                    } else {
                        iM45029 = C19806.m45029("ܶۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 17365) ^ 1686657323;
                        i6 = -1601847870;
                    }
                    break;
                case -1426073183:
                case 1106969413:
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜܰ") ^ i4) * (-9);
                        i5 = ((iM45029 ^ i3) * 16869) ^ 1099758689;
                        i6 = -1571406673;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜܶ") ^ i3) * (-33);
                        i5 = ((iM45029 ^ i4) * 17303) ^ 1857786929;
                        i6 = 217385283;
                    }
                    break;
                case -1365195020:
                case 450904635:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ֨")) * (-15);
                        i5 = ((iM45029 ^ i4) * 30127) ^ 839973707;
                        i6 = -429846217;
                    } else {
                        iM45029 = C19806.m45029("᩺᩺") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-5495)) ^ 1398339074;
                        i6 = 744357745;
                    }
                    break;
                case -1321037334:
                case 815710277:
                    if (C19806.f63586) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ܺ")) * 25;
                        i5 = ((iM45029 ^ i3) * (-20699)) ^ 655722591;
                        i6 = 616062945;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۚ") + i3) * 99;
                        i5 = ((iM45029 ^ i4) * 21603) ^ (-1585732299);
                        i6 = 250640009;
                    }
                    break;
                case -1002892419:
                case -4805525:
                    if (C1875.m6086() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰ۟")) * (-27);
                        i5 = ((iM45029 ^ i4) * (-24847)) ^ 865817017;
                        i6 = 1974533188;
                    } else {
                        iM45029 = C19806.m45029("ۘۚ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 32439) ^ (-1304850324);
                        i6 = 984250029;
                    }
                    break;
                case -797382673:
                case 1444265988:
                    this.f28964 = true;
                    return;
                case -714282718:
                case 309676322:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ܺ")) * 25;
                        i5 = ((iM45029 ^ i3) * (-20699)) ^ 655722591;
                        i6 = 616062945;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫֡") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM45029 ^ i4) * 30603) ^ 203576037;
                        i6 = 477571662;
                    }
                    break;
                case -430405271:
                case 1570284320:
                    RunnableC3388.m10064();
                    if (!C0526.f2219) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ֨")) * (-15);
                        i5 = ((iM45029 ^ i4) * 30127) ^ 839973707;
                        i6 = -429846217;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜܰ") ^ i4) * (-9);
                        i5 = ((iM45029 ^ i3) * 16869) ^ 1099758689;
                        i6 = -1571406673;
                    }
                    break;
                case 243960205:
                case 1181885837:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰ۟")) * (-27);
                        i5 = ((iM45029 ^ i4) * (-24847)) ^ 865817017;
                        i6 = 1974533188;
                    } else {
                        iM45029 = (i4 - C19806.m45029("۫ܳ")) * 43;
                        i5 = ((iM45029 ^ i3) * 25321) ^ 2029297821;
                        i6 = -241480153;
                    }
                    break;
                case 336678343:
                case 1941867566:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ᩳᩳ")) * (-79);
                        i5 = ((iM45029 ^ i3) * 10457) ^ (-1618489067);
                        i6 = 1136491835;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-5599)) ^ (-1617398739);
                        i6 = -454751459;
                    }
                    break;
                case 400480071:
                case 416075221:
                    C0671.m3008();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ֨")) * (-15);
                    i5 = ((iM45029 ^ i4) * 30127) ^ 839973707;
                    i6 = -429846217;
                    break;
                case 412084603:
                case 1699385776:
                    if (C0671.m3008() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜܰ") ^ i4) * (-9);
                        i5 = ((iM45029 ^ i3) * 16869) ^ 1099758689;
                        i6 = -1571406673;
                    } else {
                        iM45029 = C19806.m45029("ᩴ֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * 28395) ^ 1436898146;
                        i6 = -2106725507;
                    }
                    break;
                default:
                    this.f28966 = viewOnClickListenerC4514.getPackageManager();
                    if (CallableC1627.f6528) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩵ۤ")) * 101;
                        i5 = ((iM45029 ^ i3) * 22625) ^ 23461738;
                        i6 = 1032773104;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ܺ")) * 25;
                        i5 = ((iM45029 ^ i3) * (-20699)) ^ 655722591;
                        i6 = 616062945;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = null;
        C12586 c12586 = null;
        C6018 c6018 = null;
        boolean z = false;
        C12586 c12587 = null;
        int i = -1321798827;
        int i2 = C1025.f4800;
        int i3 = C1937.f7317;
        int iM45029 = C19806.m45029("۬ܳ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-11203)) ^ 1488783743;
        int i5 = -737240988;
        while (true) {
            i = ((((i ^ i2) * (-27877)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1798117737:
                case -244608858:
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("۠ۛ") + i2) * 79;
                        i4 = ((iM45029 ^ i3) * (-23175)) ^ 1139936268;
                        i5 = -741852287;
                    } else {
                        iM45029 = C19806.m45029("۬ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16205)) ^ 1973722791;
                        i5 = -1424240167;
                    }
                    break;
                case -1589472864:
                case 1068642510:
                    viewOnClickListenerC4514 = this.f28965;
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("֫᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9001) ^ (-699551137);
                        i5 = -2032855549;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۙ") + i3) * 65;
                        i4 = ((iM45029 ^ i2) * 31339) ^ (-1415499050);
                        i5 = -1151399473;
                    }
                    break;
                case -1567857131:
                case 1222990370:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16675)) ^ (-871318192);
                        i5 = -1926287151;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10729) ^ 1604933597;
                        i5 = -1945479302;
                    }
                    break;
                case -1259973161:
                case 1987361848:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۙ") + i3) * 65;
                        i4 = ((iM45029 ^ i2) * 31339) ^ (-1415499050);
                        i5 = -1151399473;
                    } else {
                        iM45029 = C19806.m45029("᩻ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23243)) ^ 385160629;
                        i5 = 1228091232;
                    }
                    break;
                case -1106203604:
                case 1570635564:
                    c12586 = viewOnClickListenerC4514.f16044;
                    if (C1460.m5050() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10729) ^ 1604933597;
                        i5 = -1945479302;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16079)) ^ 1202520899;
                        i5 = 242139112;
                    }
                    break;
                case -874595767:
                case -478330577:
                    if (!C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10729) ^ 1604933597;
                        i5 = -1945479302;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۙ") + i3) * 65;
                        i4 = ((iM45029 ^ i2) * 31339) ^ (-1415499050);
                        i5 = -1151399473;
                    }
                    break;
                case -505862478:
                case 1555790196:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C1189.m4368();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢ᩵")) * 47;
                    i4 = ((iM45029 ^ i2) * 10033) ^ 987770966;
                    i5 = 574630909;
                    break;
                case -439225873:
                case 262568676:
                    c6018 = c12586.f42059;
                    z = true;
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-26643)) ^ 717188281;
                        i5 = -1547022613;
                    } else {
                        iM45029 = C19806.m45029("۬ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16205)) ^ 1973722791;
                        i5 = -1424240167;
                    }
                    break;
                case -303144458:
                case 1615783984:
                    C3660.m10791();
                    if (C2124.f7782 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10729) ^ 1604933597;
                        i5 = -1945479302;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢ᩵")) * 47;
                        i4 = ((iM45029 ^ i2) * 10033) ^ 987770966;
                        i5 = 574630909;
                    }
                    break;
                case -117022508:
                case 1697492155:
                    C1460.m5050();
                    C3660.m10791();
                    break;
                case -91396679:
                case 1341316305:
                    c12587.f42059.m16335(z);
                    break;
                case -46856863:
                case 2074802373:
                    if (C1419.f5860 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9067)) ^ 1704673592;
                        i5 = 460092482;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۙ") + i3) * 65;
                        i4 = ((iM45029 ^ i2) * 31339) ^ (-1415499050);
                        i5 = -1151399473;
                    }
                    break;
                case -44984157:
                case 1835641154:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10729) ^ 1604933597;
                        i5 = -1945479302;
                    } else {
                        iM45029 = C19806.m45029("᩻ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21365) ^ (-786443667);
                        i5 = -1335138151;
                    }
                    break;
                case 403589772:
                case 645110606:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢ᩵")) * 47;
                        i4 = ((iM45029 ^ i2) * 10033) ^ 987770966;
                        i5 = 574630909;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11461) ^ (-647401905);
                        i5 = 567984045;
                    }
                    break;
                case 1624875085:
                case 1962525357:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۙ") + i3) * 65;
                        i4 = ((iM45029 ^ i2) * 31339) ^ (-1415499050);
                        i5 = -1151399473;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩸") + i3) * 95;
                        i4 = ((iM45029 ^ i2) * (-12215)) ^ 1899811735;
                        i5 = 1564169772;
                    }
                    break;
                default:
                    c6018.m16335(z);
                    c12587 = viewOnClickListenerC4514.f16055;
                    if (C0817.m3399()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9227)) ^ (-733528823);
                        i5 = -1623169407;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9067)) ^ 1704673592;
                        i5 = 460092482;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0150 A[PHI: r4 r6 r7
      0x0150: PHI (r4v4 java.util.Iterator) = (r4v3 java.util.Iterator), (r4v2 java.util.Iterator), (r4v2 java.util.Iterator), (r4v2 java.util.Iterator) binds: [B:46:0x014a, B:30:0x00b5, B:27:0x0097, B:25:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r6v5 android.content.pm.PackageInfo) = 
      (r6v2 android.content.pm.PackageInfo)
      (r6v4 android.content.pm.PackageInfo)
      (r6v2 android.content.pm.PackageInfo)
      (r6v2 android.content.pm.PackageInfo)
     binds: [B:46:0x014a, B:30:0x00b5, B:27:0x0097, B:25:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r7v4 android.content.pm.ApplicationInfo) = 
      (r7v2 android.content.pm.ApplicationInfo)
      (r7v3 android.content.pm.ApplicationInfo)
      (r7v2 android.content.pm.ApplicationInfo)
      (r7v2 android.content.pm.ApplicationInfo)
     binds: [B:46:0x014a, B:30:0x00b5, B:27:0x0097, B:25:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ac A[PHI: r1 r5
      0x01ac: PHI (r1v4 int) = (r1v3 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int) binds: [B:57:0x01aa, B:39:0x00fd, B:23:0x0089, B:17:0x0073, B:13:0x0057, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r5v5 l.᩷᩺ۘ) = (r5v2 l.᩷᩺ۘ), (r5v4 l.᩷᩺ۘ), (r5v2 l.᩷᩺ۘ), (r5v2 l.᩷᩺ۘ), (r5v2 l.᩷᩺ۘ), (r5v2 l.᩷᩺ۘ) binds: [B:57:0x01aa, B:39:0x00fd, B:23:0x0089, B:17:0x0073, B:13:0x0057, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0221 A[PHI: r0
      0x0221: PHI (r0v6 android.content.pm.PackageManager) = 
      (r0v5 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
     binds: [B:69:0x021f, B:65:0x0205, B:19:0x0077, B:17:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        int iM11306;
        int i;
        PackageManager packageManager = null;
        int i2 = 0;
        List<PackageInfo> installedPackages = null;
        Iterator itM9705 = null;
        C21178 c21178 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        int i3 = 954753455;
        int i4 = C1668.f6641;
        int i5 = C1875.f7103;
        int iM11307 = ThreadFactoryC3888.m11306("֡ۢ") ^ i4;
        int i6 = ((iM11307 ^ i5) * (-2465)) ^ 90603361;
        int i7 = 311333676;
        while (true) {
            int i8 = iM11307 ^ i7;
            ArrayList arrayList = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 12851) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2139107933:
                    case 1484486072:
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                            iM11306 = (C19806.m45029("ܳۖ") + i5) * (-91);
                            i6 = ((iM11306 ^ i4) * (-2423)) ^ (-371353217);
                            i = 2045368211;
                        } else {
                            iM11306 = (C19806.m45029("ۗۧ") + i4) * 65;
                            i6 = ((iM11306 ^ i5) * 3317) ^ (-140224093);
                            i = -751797295;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -2047554862:
                    case -1348738178:
                        packageManager = this.f28966;
                        if (RunnableC0195.f1321 >= 0) {
                            iM11306 = (C19806.m45029("ܳۖ") + i5) * (-91);
                            i6 = ((iM11306 ^ i4) * (-2423)) ^ (-371353217);
                            i = 2045368211;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۛ") + i5) * (-77);
                            i6 = ((iM11306 ^ i4) * (-11919)) ^ (-866754436);
                            i = 676786585;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1940751330:
                    case -1240868292:
                        this.f28963 = arrayList;
                        itM9705 = MenuItemOnMenuItemClickListenerC3244.m9705(installedPackages);
                        iM11306 = (C19806.m45029("ۡܳ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i5) * 17227) ^ (-1053655483);
                        i = 1413336676;
                        i8 = iM11306 ^ i;
                        break;
                    case -1869280403:
                    case 1920912719:
                        if (C2642.f10294 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("۠ۡ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 1869) ^ 61206646;
                            i = -178178346;
                            i8 = iM11306 ^ i;
                        }
                        break;
                    case -1623435124:
                    case 1552393530:
                        RunnableC3388.m10051(c21178);
                        if (C1937.m6279() < 0) {
                            iM11306 = C19806.m45029("᩵ܶ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 28039) ^ (-701930385);
                            i = -231664304;
                            i8 = iM11306 ^ i;
                        }
                        break;
                    case -1608901121:
                    case -685601844:
                        c21178 = (C21178) C19812.m45045();
                        if (C3286.f12186) {
                            iM11306 = (C19806.m45029("ۗۧ") + i4) * 65;
                            i6 = ((iM11306 ^ i5) * 3317) ^ (-140224093);
                            i = -751797295;
                        } else {
                            iM11306 = (i4 - C19806.m45029("۟᩵")) * (-51);
                            i6 = ((iM11306 ^ i5) * (-26293)) ^ 739885470;
                            i = -1909115409;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1600257673:
                    case -1520578402:
                        CallableC1627.m5507();
                        C1977.m6356();
                        iM11306 = (C19806.m45029("ܳۖ") + i5) * (-91);
                        i6 = ((iM11306 ^ i4) * (-2423)) ^ (-371353217);
                        i = 2045368211;
                        i8 = iM11306 ^ i;
                        break;
                    case -1548223285:
                    case -430602744:
                        int iM18986 = C7105.m18986(installedPackages);
                        if (C2249.m6915() > 0) {
                            arrayList = new ArrayList(iM18986);
                            if (C1148.f5161 > 0) {
                                iM11306 = (C19806.m45029("᩷ۢ") ^ i5) * 73;
                                i6 = ((iM11306 ^ i4) * 4431) ^ 754467045;
                                i = -1488686166;
                                i8 = iM11306 ^ i;
                            }
                        }
                        break;
                    case -1150442571:
                    case 1319265643:
                        if (C2704.f10408) {
                            iM11306 = (ThreadFactoryC3888.m11306("֨ۘ") + i5) * (-69);
                            i6 = ((iM11306 ^ i4) * 24847) ^ (-957641973);
                            i = -1007689001;
                        } else {
                            iM11306 = (C19806.m45029("ۗۧ") + i4) * 65;
                            i6 = ((iM11306 ^ i5) * 3317) ^ (-140224093);
                            i = -751797295;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1077921286:
                    case 1772909182:
                        if (C1875.f7103 >= 0) {
                            iM11306 = (C19806.m45029("ܳۖ") + i5) * (-91);
                            i6 = ((iM11306 ^ i4) * (-2423)) ^ (-371353217);
                            i = 2045368211;
                        } else {
                            iM11306 = C19806.m45029("ܳۤ") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-6873)) ^ (-517872265);
                            i = -452671551;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -379254749:
                    case 1348499311:
                        if (applicationInfo.sourceDir != null) {
                            iM11306 = C19806.m45029("᩶۬") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-18029)) ^ 679121240;
                            i = -1647563074;
                        } else {
                            iM11306 = (C19806.m45029("ۡܳ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM11306 ^ i5) * 17227) ^ (-1053655483);
                            i = 1413336676;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 179697943:
                    case 228858371:
                        ArrayList arrayList2 = this.f28963;
                        if (C3722.f13525 <= 0) {
                            iM11306 = (C19806.m45029("ۗۧ") + i4) * 65;
                            i6 = ((iM11306 ^ i5) * 3317) ^ (-140224093);
                            i = -751797295;
                        } else {
                            C2249.m6905(arrayList2, new C16819(packageInfo));
                            iM11306 = (C19806.m45029("ۡܳ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM11306 ^ i5) * 17227) ^ (-1053655483);
                            i = 1413336676;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 379714427:
                    case 483781091:
                        C2124.m6673();
                        break;
                    case 419642780:
                    case 1255966518:
                        this.f28967 = C12051.m29951(C6696.m18097());
                        break;
                    case 508623226:
                    case 1836773979:
                        i2 = 0;
                        if (RunnableC0195.f1321 >= 0) {
                            iM11306 = (C19806.m45029("ۗۧ") + i4) * 65;
                            i6 = ((iM11306 ^ i5) * 3317) ^ (-140224093);
                            i = -751797295;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-18015)) ^ 1208737703;
                            i = 1582507065;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 525217089:
                    case 712854288:
                        packageInfo = (PackageInfo) C0278.m1776(itM9705);
                        applicationInfo = packageInfo.applicationInfo;
                        if (applicationInfo != null) {
                            iM11306 = C19806.m45029("ۡۛ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 31393) ^ 1124553572;
                            i = 2115975334;
                        } else {
                            iM11306 = (C19806.m45029("ۡܳ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM11306 ^ i5) * 17227) ^ (-1053655483);
                            i = 1413336676;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 1029843868:
                    case 1965285201:
                        if (C0962.m3748(itM9705)) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۨۜ") + i5) * q.h;
                            i6 = ((iM11306 ^ i4) * (-24567)) ^ 1060045891;
                            i = -936619044;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۙ۬") ^ i5) * 5;
                            i6 = ((iM11306 ^ i4) * 17081) ^ (-1798286798);
                            i = 1088053466;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 1247342291:
                    case 1999936658:
                        if (!RunnableC1564.f6300) {
                        }
                        iM11306 = (C19806.m45029("ۗۧ") + i4) * 65;
                        i6 = ((iM11306 ^ i5) * 3317) ^ (-140224093);
                        i = -751797295;
                        i8 = iM11306 ^ i;
                        break;
                    default:
                        installedPackages = packageManager.getInstalledPackages(i2);
                        C6696.m18104();
                        if (C1398.f5802 <= 0) {
                            iM11306 = (i5 - C19806.m45029("ۡۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM11306 ^ i4) * 22105) ^ (-1925195328);
                            i = 32659812;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܰ᩸") + i4) * (-79);
                            i6 = ((iM11306 ^ i5) * 17751) ^ (-997702123);
                            i = -478940804;
                        }
                        i8 = iM11306 ^ i;
                        break;
                }
                return;
            }
            iM11307 = (ThreadFactoryC3888.m11306("᩹ۧ") ^ i4) * 87;
            i6 = ((iM11307 ^ i5) * 26535) ^ 1469049080;
            i7 = -1056590478;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = null;
        C12586 c12586 = null;
        C6018 c6018 = null;
        boolean z = false;
        C12586 c12587 = null;
        C6018 c6019 = null;
        C7817 c7817 = null;
        int i = -250358572;
        int i2 = C2124.f7782;
        int i3 = RunnableC3388.f12514;
        int iM45029 = C19806.m45029("ۛ᩺") ^ i3;
        int i4 = ((iM45029 ^ i2) * 5625) ^ 1260127426;
        int i5 = 886239481;
        while (true) {
            i = ((((i ^ i2) * (-29957)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1999151771:
                case 918531475:
                    C19806.m45024();
                    C1875.m6086();
                    break;
                case -1599646989:
                case 1021044989:
                    c6018.m16335(z);
                    c12587 = viewOnClickListenerC4514.f16055;
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ܶ᩻") + i3) * (-85);
                        i4 = ((iM45029 ^ i2) * 843) ^ 1644060035;
                        i5 = -605921691;
                    } else {
                        iM45029 = C19806.m45029("ۢ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32227) ^ 30757851;
                        i5 = -495680876;
                    }
                    break;
                case -1575786313:
                case 1697419174:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۜۚ")) * (-81);
                        i4 = ((iM45029 ^ i3) * 4523) ^ (-768684877);
                        i5 = 147665632;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ᩴᩳ")) * 97;
                        i4 = ((iM45029 ^ i2) * 32399) ^ (-1928637135);
                        i5 = 1988167706;
                    }
                    break;
                case -1429016647:
                case 438676360:
                    viewOnClickListenerC4514 = this.f28965;
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۚۧ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * (-31203)) ^ 1798968977;
                        i5 = -817087959;
                    } else {
                        iM45029 = C19806.m45029("ۙ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28363)) ^ (-1816290822);
                        i5 = 633622010;
                    }
                    break;
                case -1415851174:
                case -859930482:
                    if (C1377.m4833() != 0) {
                        iM45029 = (C19806.m45029("ܶ᩻") + i3) * (-85);
                        i4 = ((iM45029 ^ i2) * 843) ^ 1644060035;
                        i5 = -605921691;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30837) ^ 693278541;
                        i5 = -1674712358;
                    }
                    break;
                case -1274283117:
                case -91544088:
                    c6018 = c12586.f42059;
                    z = false;
                    if (C0526.f2219) {
                        iM45029 = (i2 - C19806.m45029("ۚۧ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * (-31203)) ^ 1798968977;
                        i5 = -817087959;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۤۛ")) * 35;
                        i4 = ((iM45029 ^ i2) * 20205) ^ 716396889;
                        i5 = -1495728091;
                    }
                    break;
                case -894310489:
                case 1388243337:
                    C1937.m6279();
                    C1875.m6086();
                    iM45029 = (C19806.m45029("ᩳۛ") ^ i2) * (-73);
                    i4 = ((iM45029 ^ i3) * 26487) ^ 667887264;
                    i5 = -741506570;
                    break;
                case -701196076:
                case 2125943321:
                    if (C0216.f1393 != 0) {
                        iM45029 = (i2 - C19806.m45029("ۚۧ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i3) * (-31203)) ^ 1798968977;
                        i5 = -817087959;
                    } else {
                        iM45029 = C19806.m45029("֫ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22491) ^ 31246850;
                        i5 = 314031920;
                    }
                    break;
                case -463285120:
                case -340436997:
                    c12586 = viewOnClickListenerC4514.f16044;
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22571)) ^ 1434748768;
                        i5 = -122501333;
                    } else {
                        iM45029 = C19806.m45029("֨֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4747)) ^ 2050799320;
                        i5 = -1928325408;
                    }
                    break;
                case -418119209:
                case 142596235:
                    viewOnClickListenerC4514.f16062 = false;
                    viewOnClickListenerC4514.m12584();
                    break;
                case 67725303:
                case 462241179:
                    RunnableC0195.m1431();
                    if (C1461.f5957 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22571)) ^ 1434748768;
                        i5 = -122501333;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩻") + i3) * (-85);
                        i4 = ((iM45029 ^ i2) * 843) ^ 1644060035;
                        i5 = -605921691;
                    }
                    break;
                case 192526816:
                case 1722974376:
                    if (C1419.f5860 < 0) {
                        iM45029 = (i2 - C19806.m45029("ۜۚ")) * (-81);
                        i4 = ((iM45029 ^ i3) * 4523) ^ (-768684877);
                        i5 = 147665632;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۛ") ^ i2) * (-73);
                        i4 = ((iM45029 ^ i3) * 26487) ^ 667887264;
                        i5 = -741506570;
                    }
                    break;
                case 551369603:
                case 1328488900:
                    C3743.m10966();
                    if (!CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ܶ᩻") + i3) * (-85);
                        i4 = ((iM45029 ^ i2) * 843) ^ 1644060035;
                        i5 = -605921691;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۛ") ^ i2) * (-73);
                        i4 = ((iM45029 ^ i3) * 26487) ^ 667887264;
                        i5 = -741506570;
                    }
                    break;
                case 586284147:
                case 2105717969:
                    c6019.m16335(z);
                    c7817 = this.f28967;
                    if (c7817 != null) {
                        iM45029 = (C19806.m45029("۟ܰ") + i2) * (-47);
                        i4 = ((iM45029 ^ i3) * 1813) ^ (-748910712);
                        i5 = -360066182;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21103) ^ (-222954305);
                        i5 = 2031356433;
                    }
                    break;
                case 609101735:
                case 1381967155:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22571)) ^ 1434748768;
                        i5 = -122501333;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֫") + i3) * 93;
                        i4 = ((iM45029 ^ i2) * (-14577)) ^ (-1639494094);
                        i5 = 772484503;
                    }
                    break;
                case 1217567700:
                case 1421154782:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("ᩳۛ") ^ i2) * (-73);
                        i4 = ((iM45029 ^ i3) * 26487) ^ 667887264;
                        i5 = -741506570;
                    } else {
                        iM45029 = (C19806.m45029("֫᩻") + i3) * (-15);
                        i4 = ((iM45029 ^ i2) * (-15453)) ^ 1673523089;
                        i5 = -1017991450;
                    }
                    break;
                case 1426698894:
                case 2088020436:
                    c6019 = c12587.f42059;
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("۟ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4061)) ^ 1793264203;
                        i5 = 169471725;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩻") + i3) * (-85);
                        i4 = ((iM45029 ^ i2) * 843) ^ 1644060035;
                        i5 = -605921691;
                    }
                    break;
                default:
                    RunnableC1895.m6175(c7817);
                    iM45029 = ThreadFactoryC3888.m11306("ܺᩳ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 21103) ^ (-222954305);
                    i5 = 2031356433;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0160 A[PHI: r18 r27
      0x0160: PHI (r18v4 int) = (r18v3 int), (r18v2 int) binds: [B:34:0x015e, B:26:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r27v29 java.lang.String) = (r27v27 java.lang.String), (r27v30 java.lang.String) binds: [B:34:0x015e, B:26:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x01c9 A[PHI: r17 r19 r27
      0x01c9: PHI (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v2 java.lang.String), (r17v2 java.lang.String) binds: [B:39:0x01c7, B:30:0x0132, B:17:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r19v4 java.lang.String) = (r19v2 java.lang.String), (r19v3 java.lang.String), (r19v2 java.lang.String) binds: [B:39:0x01c7, B:30:0x0132, B:17:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r27v32 java.lang.String) = (r27v25 java.lang.String), (r27v28 java.lang.String), (r27v33 java.lang.String) binds: [B:39:0x01c7, B:30:0x0132, B:17:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ?? r6;
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int iM11308;
        int i5;
        int i6;
        ?? r7;
        int iM45029;
        int i7;
        ?? r8;
        int i8;
        ?? r9;
        final C8353 c8353 = this;
        int i9 = RunnableC0195.f1321;
        int i10 = C2788.f10625;
        int iM11309 = ThreadFactoryC3888.m11306("ۗ۟") ^ i9;
        int i11 = ((iM11309 ^ i10) * (-16885)) ^ (-1605474438);
        C8387 c8387M31304 = null;
        C8387 c8387M31305 = null;
        DialogInterfaceOnClickListenerC18936 dialogInterfaceOnClickListenerC18936 = null;
        String strM6685 = null;
        String strM9788 = null;
        int i12 = iM11309 ^ (-1663116612);
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = null;
        int i13 = 0;
        boolean z = false;
        int iM113010 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 856780847;
        DialogInterface.OnClickListener onClickListener = null;
        String strM6686 = null;
        int iM450210 = 0;
        C8067 c8067M5356 = null;
        String strM5502 = null;
        InterfaceC6025 interfaceC6025 = null;
        ExecutorService executorService = null;
        C0590 c0590 = null;
        String str = null;
        ?? r10 = 0;
        while (true) {
            i16 = i12 ^ (i11 & (((i16 ^ i10) * 981) >> 31));
            switch (i16) {
                case -2141608785:
                case 1100302961:
                    i13 = 34336;
                    iM11306 = (ThreadFactoryC3888.m11306("ܳᩳ") + i9) * (-71);
                    i = ((iM11306 ^ i10) * (-17995)) ^ (-1935060041);
                    i2 = -334306065;
                    r6 = r10;
                    int i17 = iM11306 ^ i2;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    strM5502 = strM5502;
                    i12 = i17;
                    i11 = i;
                    r10 = r6;
                    c8067M5356 = c8067M5356;
                    break;
                case -2021397925:
                case 58424039:
                    strM5502 = strM5502;
                    C1460.m5055(c8067M5356, iM450210 ^ 2105202566, onClickListener);
                    strM6686 = C2124.m6685(f28962, 56, 3, i13);
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (C19806.m45029("ۢܺ") + i9) * (-103);
                        i3 = ((iM45029 ^ i10) * 1129) ^ (-2008932244);
                        i7 = 1647359773;
                        r8 = r10;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۖ") + i10) * (-113);
                        i3 = ((iM45029 ^ i9) * 24067) ^ (-316669579);
                        i7 = -1027457750;
                        r8 = r10;
                    }
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -1836103181:
                case 1193882132:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    int i18 = (s * s) + 6066369;
                    if ((i18 + i18) - (i15 * i15) >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻֫") ^ i9;
                        i = ((iM11306 ^ i10) * (-8267)) ^ (-1658881785);
                        i2 = -498882894;
                        r6 = r10;
                    } else {
                        iM11306 = C19806.m45029("ۙ֡") ^ i10;
                        i = ((iM11306 ^ i9) * 30791) ^ (-846009120);
                        i2 = -1984767385;
                        r6 = r10;
                    }
                    int i19 = iM11306 ^ i2;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    strM5502 = strM5502;
                    i12 = i19;
                    i11 = i;
                    r10 = r6;
                    c8067M5356 = c8067M5356;
                    break;
                case -1750550046:
                case 1945930566:
                    strM5502 = strM5502;
                    if (viewOnClickListenerC4514.f16059) {
                        iM45029 = (C19806.m45029("᩶ۡ") ^ i10) * (-65);
                        i3 = ((iM45029 ^ i9) * 3803) ^ 1177447607;
                        i7 = 6381396;
                        r8 = r10;
                    } else {
                        iM45029 = C19806.m45029("ۨۖ") ^ i10;
                        i3 = ((iM45029 ^ i9) * 18875) ^ (-8885125);
                        i7 = 367788862;
                        r8 = r10;
                    }
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -1604954265:
                case -1581973423:
                    strM5502 = strM5502;
                    iM450210 = C19806.m45029(C7105.m18989(f28962, 53, 3, i13));
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i10;
                        i3 = ((iM45029 ^ i9) * 10711) ^ (-797399301);
                        i7 = 898102665;
                        r8 = r10;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨֨") ^ i10;
                        i3 = ((iM45029 ^ i9) * (-2775)) ^ (-463937551);
                        i7 = 1382921613;
                        r8 = r10;
                    }
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -1494981915:
                case 496725322:
                    C1668.m5583();
                    if (!C0817.f3443) {
                        strM5502 = strM5502;
                        iM45029 = (C19806.m45029("ۢܺ") + i9) * (-103);
                        i3 = ((iM45029 ^ i10) * 1129) ^ (-2008932244);
                        i7 = 1647359773;
                        r8 = r10;
                        i8 = iM45029 ^ i7;
                        strM5502 = strM5502;
                        r10 = r8;
                        i12 = i8;
                        i11 = i3;
                    }
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    iM11307 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i10) * 11;
                    i3 = ((iM11307 ^ i9) * 20909) ^ 1576319358;
                    i4 = 293196075;
                    i8 = iM11307 ^ i4;
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    r10 = r10;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -1465191124:
                case -1222255269:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    z = false;
                    c8353.f28964 = false;
                    ViewOnClickListenerC4514.m12570(viewOnClickListenerC4514, c8353.f28967, c8387M31304, c8387M31305);
                    r6 = 1;
                    r7 = 1;
                    if (RunnableC1895.m6170() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۢ") ^ i9;
                        i = ((iM11306 ^ i10) * (-15971)) ^ (-1768089890);
                        i2 = -1310221737;
                        int i110 = iM11306 ^ i2;
                        c8387M31304 = c8387M31304;
                        c8387M31305 = c8387M31305;
                        strM5502 = strM5502;
                        i12 = i110;
                        i11 = i;
                        r10 = r6;
                        c8067M5356 = c8067M5356;
                    } else {
                        c8387M31304 = c8387M31304;
                        c8387M31305 = c8387M31305;
                        c8067M5356 = c8067M5356;
                        r9 = r7;
                        iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i10;
                        i3 = ((iM45029 ^ i9) * (-16335)) ^ 223611122;
                        i7 = -549983835;
                        r8 = r9;
                        i8 = iM45029 ^ i7;
                        strM5502 = strM5502;
                        r10 = r8;
                        i12 = i8;
                        i11 = i3;
                    }
                    break;
                case -1409649566:
                case 1681272177:
                    strM5502 = strM5502;
                    C0050.m933(c8067M5356, iM113010 ^ i14);
                    strM6685 = C2124.m6685(f28962, 50, 3, i13);
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (C19806.m45029("ۢܺ") + i9) * (-103);
                        i3 = ((iM45029 ^ i10) * 1129) ^ (-2008932244);
                        i7 = 1647359773;
                        r8 = r10;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ֨") ^ i9;
                        i3 = ((iM45029 ^ i10) * (-9081)) ^ (-1926810487);
                        i7 = -1713173835;
                        r8 = r10;
                    }
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -1363779446:
                case -1269895969:
                    C1066.m4034(c8067M5356, C19806.m45029(strM9788) ^ 2128156148, dialogInterfaceOnClickListenerC18936);
                    CallableC1627.m5514(c8067M5356);
                    c8067M5356 = c8067M5356;
                    iM11308 = ThreadFactoryC3888.m11306("۟۬") ^ i9;
                    i5 = ((iM11308 ^ i10) * (-25107)) ^ 1974951118;
                    i6 = 1682958970;
                    i12 = iM11308 ^ i6;
                    i11 = i5;
                    r10 = r10;
                    c8067M5356 = c8067M5356;
                    break;
                case -1359154793:
                case -1153065456:
                    C18975.m43674(viewOnClickListenerC4514, new String[]{strM5502}, 23680);
                    break;
                case -1246738568:
                case 983214575:
                    dialogInterfaceOnClickListenerC18936 = new DialogInterfaceOnClickListenerC18936();
                    strM5502 = strM5502;
                    strM9788 = C3286.m9788(f28962, 59, 3, i13);
                    iM45029 = C19806.m45029("᩻᩺") ^ i9;
                    i3 = ((iM45029 ^ i10) * (-1205)) ^ (-1833033077);
                    i7 = 395867603;
                    r8 = r10;
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -1183903468:
                case 182040061:
                    if (!C3743.f13569) {
                        strM5502 = strM5502;
                        c8067M5356 = c8067M5356;
                        c8387M31304 = c8387M31304;
                        c8387M31305 = c8387M31305;
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") + i9) * 3;
                        i = ((iM11306 ^ i10) * 24957) ^ (-1442638431);
                        i2 = 1299142549;
                        r6 = r10;
                        int i111 = iM11306 ^ i2;
                        c8387M31304 = c8387M31304;
                        c8387M31305 = c8387M31305;
                        strM5502 = strM5502;
                        i12 = i111;
                        i11 = i;
                        r10 = r6;
                        c8067M5356 = c8067M5356;
                    } else {
                        strM5502 = strM5502;
                        c8067M5356 = c8067M5356;
                        iM11307 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i10) * 11;
                        i3 = ((iM11307 ^ i9) * 20909) ^ 1576319358;
                        i4 = 293196075;
                        i8 = iM11307 ^ i4;
                        strM5502 = strM5502;
                        c8067M5356 = c8067M5356;
                        r10 = r10;
                        i12 = i8;
                        i11 = i3;
                    }
                    break;
                case -1073597178:
                case 1338058836:
                    strM5502 = strM5502;
                    c8067M5356 = RunnableC1564.m5356(viewOnClickListenerC4514);
                    iM113010 = ThreadFactoryC3888.m11306(C0962.m3747(f28962, 47, 3, i13));
                    i14 = 2100764381;
                    r9 = r10;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i10;
                        i3 = ((iM45029 ^ i9) * (-16335)) ^ 223611122;
                        i7 = -549983835;
                        r8 = r9;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۙ") ^ i10;
                        i3 = ((iM45029 ^ i9) * (-5755)) ^ (-996265337);
                        i7 = -1311236954;
                        r8 = r10;
                    }
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -952587245:
                case 1876743326:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    if (!C1668.m5579(interfaceC6025, C2124.m6685(f28962, 1, 5, i13), z)) {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳܿ") ^ i9;
                        i3 = ((iM11307 ^ i10) * 22359) ^ 294162406;
                        i4 = 1783789734;
                        i8 = iM11307 ^ i4;
                        strM5502 = strM5502;
                        c8067M5356 = c8067M5356;
                        r10 = r10;
                        i12 = i8;
                        i11 = i3;
                    } else {
                        strM5502 = strM5502;
                        iM11308 = ThreadFactoryC3888.m11306("۟۬") ^ i9;
                        i5 = ((iM11308 ^ i10) * (-25107)) ^ 1974951118;
                        i6 = 1682958970;
                        i12 = iM11308 ^ i6;
                        i11 = i5;
                        r10 = r10;
                        c8067M5356 = c8067M5356;
                    }
                    break;
                case -946149436:
                case -120211390:
                    break;
                case -914057767:
                case -274132144:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    if (viewOnClickListenerC4514.f16044.f42057.f2562.size() > r10) {
                        strM5502 = strM5502;
                        iM11308 = ThreadFactoryC3888.m11306("۟۬") ^ i9;
                        i5 = ((iM11308 ^ i10) * (-25107)) ^ 1974951118;
                        i6 = 1682958970;
                        i12 = iM11308 ^ i6;
                        i11 = i5;
                        r10 = r10;
                        c8067M5356 = c8067M5356;
                    } else {
                        iM11307 = C19806.m45029("ܺ۠") ^ i10;
                        i3 = ((iM11307 ^ i9) * 23473) ^ 1473604753;
                        i4 = -1389129359;
                        i8 = iM11307 ^ i4;
                        strM5502 = strM5502;
                        c8067M5356 = c8067M5356;
                        r10 = r10;
                        i12 = i8;
                        i11 = i3;
                    }
                    break;
                case -529914756:
                case 1918533869:
                    C1398.m4895();
                    if (!C19806.m45024()) {
                        strM5502 = strM5502;
                        r9 = r10;
                        iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i10;
                        i3 = ((iM45029 ^ i9) * (-16335)) ^ 223611122;
                        i7 = -549983835;
                        r8 = r9;
                        i8 = iM45029 ^ i7;
                        strM5502 = strM5502;
                        r10 = r8;
                        i12 = i8;
                        i11 = i3;
                    }
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    iM11307 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i10) * 11;
                    i3 = ((iM11307 ^ i9) * 20909) ^ 1576319358;
                    i4 = 293196075;
                    i8 = iM11307 ^ i4;
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    r10 = r10;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -467993425:
                case 1991160942:
                    C1419.m4973();
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    iM11307 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i10) * 11;
                    i3 = ((iM11307 ^ i9) * 20909) ^ 1576319358;
                    i4 = 293196075;
                    i8 = iM11307 ^ i4;
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    r10 = r10;
                    i12 = i8;
                    i11 = i3;
                    break;
                case -67138920:
                case 1390375219:
                    strM5502 = strM5502;
                    C10634.m26830(c8067M5356, ThreadFactoryC3888.m11306(strM6686) ^ 2098149644, null);
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i10;
                        i3 = ((iM45029 ^ i9) * 10711) ^ (-797399301);
                        i7 = 898102665;
                        r8 = r10;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ᩳ᩶")) * 19;
                        i3 = ((iM45029 ^ i10) * 21273) ^ (-683253759);
                        i7 = -1659874904;
                        r8 = r10;
                    }
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                case 94730155:
                case 1816256845:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    ViewOnClickListenerC4514.m12575(viewOnClickListenerC4514, ViewOnClickListenerC4514.m12561(viewOnClickListenerC4514, c8387M31304, c8387M31305, str, c0590.f2560));
                    executorService = C4716.f16636;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۢ") ^ i10;
                        i = ((iM11306 ^ i9) * 8469) ^ 17794021;
                        i2 = -1742206260;
                        r6 = r10;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") + i9) * 3;
                        i = ((iM11306 ^ i10) * 24957) ^ (-1442638431);
                        i2 = 1299142549;
                        r6 = r10;
                    }
                    int i112 = iM11306 ^ i2;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    strM5502 = strM5502;
                    i12 = i112;
                    i11 = i;
                    r10 = r6;
                    c8067M5356 = c8067M5356;
                    break;
                case 305305575:
                case 1080381111:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    c8353.f28964 = r10;
                    str = viewOnClickListenerC4514.f16044.f42057.f2560;
                    c0590 = viewOnClickListenerC4514.f16055.f42057;
                    iM11306 = (i9 - C19806.m45029("ۛ᩹")) * (-31);
                    i = ((iM11306 ^ i10) * (-22153)) ^ (-1414965789);
                    i2 = 1165368824;
                    r6 = r10;
                    int i113 = iM11306 ^ i2;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    strM5502 = strM5502;
                    i12 = i113;
                    i11 = i;
                    r10 = r6;
                    c8067M5356 = c8067M5356;
                    break;
                case 541288503:
                case 1941038634:
                    C2124.m6673();
                    C1398.m4895();
                    break;
                case 655267274:
                case 1304836915:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    C19806.m45014(executorService, new RunnableC21427(1, c8353));
                    final int i20 = c8353.f28968;
                    C2642.m8165(new Thread(new Runnable(c8353) { // from class: l.ܶᩴۘ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C8353 f50230;

                        {
                            int i21 = -1129954426;
                            int i22 = C1398.f5802;
                            int i23 = C1189.f5284;
                            int iM113011 = (ThreadFactoryC3888.m11306("ۧܺ") + i23) * 101;
                            int i24 = ((iM113011 ^ i22) * 20577) ^ 772431127;
                            int i25 = 1837740428;
                            while (true) {
                                i21 = ((((i21 ^ i22) * (-24557)) >> 31) & i24) ^ (iM113011 ^ i25);
                                switch (i21) {
                                    case -2054395741:
                                    case -1243108680:
                                        C3535.m10431();
                                        throw new RuntimeException();
                                    case -1783613976:
                                    case 1692742705:
                                        if (C2477.m7593() >= 0) {
                                            iM113011 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 20967) ^ 1431324507;
                                            i25 = 350081864;
                                        } else {
                                            iM113011 = (i23 - C19806.m45029("ۖۤ")) * (-59);
                                            i24 = ((iM113011 ^ i22) * (-27973)) ^ 1681093509;
                                            i25 = 303048150;
                                        }
                                        break;
                                    case -1766810787:
                                    case -1671147144:
                                        if (C1460.m5050() != 0) {
                                            iM113011 = (i23 - C19806.m45029("֨ۚ")) * 35;
                                            i24 = ((iM113011 ^ i22) * (-30303)) ^ (-1599937019);
                                            i25 = 1117359166;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("۫ۙ") + i22) * 93;
                                            i24 = ((iM113011 ^ i23) * (-22163)) ^ 61484189;
                                            i25 = 1797119472;
                                        }
                                        break;
                                    case -1719983367:
                                    case 297080492:
                                        if (C0817.f3443) {
                                            iM113011 = (C19806.m45029("ۧ᩶") ^ i23) * 41;
                                            i24 = ((iM113011 ^ i22) * 1481) ^ 616536333;
                                            i25 = -25721616;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("᩸ۚ") + i22) * 65;
                                            i24 = ((iM113011 ^ i23) * 32397) ^ (-1600982556);
                                            i25 = 771489015;
                                        }
                                        break;
                                    case -1173067740:
                                    case 1070079176:
                                        if (C1937.m6279() >= 0) {
                                            iM113011 = (i23 - C19806.m45029("֨ۚ")) * 35;
                                            i24 = ((iM113011 ^ i22) * (-30303)) ^ (-1599937019);
                                            i25 = 1117359166;
                                        } else {
                                            iM113011 = C19806.m45029("᩶֫") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 28851) ^ (-1723195663);
                                            i25 = 1573158871;
                                        }
                                        break;
                                    case -1142856698:
                                    case 565644280:
                                        this.f50230 = c8353;
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM113011 = (i22 - C19806.m45029("ۘ۟")) * (-123);
                                            i24 = ((iM113011 ^ i23) * 27015) ^ (-1749240431);
                                            i25 = 1306908690;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("ܺ۟") ^ i23;
                                            i24 = ((iM113011 ^ i22) * 13279) ^ 468715436;
                                            i25 = -979241364;
                                        }
                                        break;
                                    case -870785073:
                                    case 1811572900:
                                        if (C1875.f7103 >= 0) {
                                            iM113011 = (i23 - C19806.m45029("֨ۚ")) * 35;
                                            i24 = ((iM113011 ^ i22) * (-30303)) ^ (-1599937019);
                                            i25 = 1117359166;
                                        } else {
                                            iM113011 = C19806.m45029("֨ۜ") ^ i23;
                                            i24 = ((iM113011 ^ i22) * 22411) ^ 1105540832;
                                            i25 = -1477996259;
                                        }
                                        break;
                                    case -677274344:
                                    case 1218931280:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                            iM113011 = C19806.m45029("᩶֫") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 28851) ^ (-1723195663);
                                            i25 = 1573158871;
                                        } else {
                                            iM113011 = (i22 - C19806.m45029("ۤۤ")) * 35;
                                            i24 = ((iM113011 ^ i23) * 26791) ^ 2105460710;
                                            i25 = -844452533;
                                        }
                                        break;
                                    case -590400024:
                                    case -588787622:
                                        C1937.m6279();
                                        if (C3722.f13525 > 0) {
                                            iM113011 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 20967) ^ 1431324507;
                                            i25 = 350081864;
                                        } else {
                                            iM113011 = C19806.m45029("᩶֫") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 28851) ^ (-1723195663);
                                            i25 = 1573158871;
                                        }
                                        break;
                                    case -397274572:
                                    case 14521308:
                                        if (C3722.f13525 <= 0) {
                                            iM113011 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 20967) ^ 1431324507;
                                            i25 = 350081864;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("ᩴᩴ") + i23) * 27;
                                            i24 = ((iM113011 ^ i22) * (-28969)) ^ (-895203829);
                                            i25 = -2124510549;
                                        }
                                        break;
                                    case -285187279:
                                    case 1452302336:
                                        if (C2871.f10837 >= 0) {
                                            iM113011 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 20967) ^ 1431324507;
                                            i25 = 350081864;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("۬ۤ") ^ i22;
                                            i24 = ((iM113011 ^ i23) * (-22047)) ^ 41256429;
                                            i25 = 1341185204;
                                        }
                                        break;
                                    case 87453182:
                                    case 461098296:
                                        return;
                                    case 234201593:
                                    case 1454340634:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM113011 = (i23 - C19806.m45029("֨ۚ")) * 35;
                                            i24 = ((iM113011 ^ i22) * (-30303)) ^ (-1599937019);
                                            i25 = 1117359166;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("᩸᩹") ^ i23;
                                            i24 = ((iM113011 ^ i22) * 26735) ^ 1820469958;
                                            i25 = -333339576;
                                        }
                                        break;
                                    case 453707747:
                                    case 1448367046:
                                        if (!RunnableC1895.f7152) {
                                            iM113011 = ThreadFactoryC3888.m11306("ܺ۟") ^ i23;
                                            i24 = ((iM113011 ^ i22) * 13279) ^ 468715436;
                                            i25 = -979241364;
                                        } else {
                                            iM113011 = C19806.m45029("᩶֫") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 28851) ^ (-1723195663);
                                            i25 = 1573158871;
                                        }
                                        break;
                                    case 778211676:
                                    case 2070193264:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM113011 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i22;
                                            i24 = ((iM113011 ^ i23) * 20967) ^ 1431324507;
                                            i25 = 350081864;
                                        } else {
                                            iM113011 = C19806.m45029("۬᩵") ^ i22;
                                            i24 = ((iM113011 ^ i23) * (-19897)) ^ 1799755510;
                                            i25 = 983618136;
                                        }
                                        break;
                                    default:
                                        C1398.m4895();
                                        iM113011 = ThreadFactoryC3888.m11306("ܺ۟") ^ i23;
                                        i24 = ((iM113011 ^ i22) * 13279) ^ 468715436;
                                        i25 = -979241364;
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            int i21 = 0;
                            C8353 c8354 = null;
                            ViewOnClickListenerC4514 viewOnClickListenerC4515 = null;
                            long j = 0;
                            int i22 = 723383559;
                            int i23 = C7105.f23796;
                            int i24 = C1025.f4800;
                            int iM113011 = ThreadFactoryC3888.m11306("֫᩻") ^ i24;
                            int i25 = ((iM113011 ^ i23) * (-25439)) ^ 1544884474;
                            int i26 = 241182920;
                            while (true) {
                                i22 = ((((i22 ^ i23) * 14901) >> 31) & i25) ^ (iM113011 ^ i26);
                                switch (i22) {
                                    case -2087479203:
                                    case -2004926152:
                                        if (C0278.f1572 <= 0) {
                                            iM113011 = (i24 - C19806.m45029("ۤۤ")) * (-95);
                                            i25 = ((iM113011 ^ i23) * 16979) ^ 483469737;
                                            i26 = -359981277;
                                        } else {
                                            iM113011 = (i24 - ThreadFactoryC3888.m11306("ۖۗ")) * 65;
                                            i25 = ((iM113011 ^ i23) * (-30851)) ^ (-1308207226);
                                            i26 = -1665687694;
                                        }
                                        break;
                                    case -2058478482:
                                    case 75061513:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM113011 = (ThreadFactoryC3888.m11306("ܺ᩻") + i23) * (-39);
                                            i25 = ((iM113011 ^ i24) * (-10237)) ^ (-703801920);
                                            i26 = -175713485;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("֡᩸") ^ i24;
                                            i25 = ((iM113011 ^ i23) * 29845) ^ (-449338827);
                                            i26 = -1307314359;
                                        }
                                        break;
                                    case -2034557079:
                                    case -935085194:
                                        C2332.m7079();
                                        C1148.m4232();
                                        iM113011 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i23;
                                        i25 = ((iM113011 ^ i24) * 20975) ^ (-1179017618);
                                        i26 = -251201892;
                                        break;
                                    case -1594640820:
                                    case 818360425:
                                        viewOnClickListenerC4515 = c8354.f28965;
                                        j = 100;
                                        iM113011 = C19806.m45029("۬ۡ") ^ i23;
                                        i25 = ((iM113011 ^ i24) * (-18095)) ^ 533803108;
                                        i26 = -1885798526;
                                        break;
                                    case -1571782092:
                                    case -864759207:
                                        c8354 = this.f50230;
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM113011 = ThreadFactoryC3888.m11306("ۡ۟") ^ i24;
                                            i25 = ((iM113011 ^ i23) * (-13771)) ^ 363530163;
                                            i26 = -529131336;
                                        } else {
                                            iM113011 = (i23 - C19806.m45029("֡ܺ")) * (-79);
                                            i25 = ((iM113011 ^ i24) * 22701) ^ (-1065726894);
                                            i26 = 1275903117;
                                        }
                                        break;
                                    case -1455995189:
                                    case -261562027:
                                        break;
                                    case -1428685493:
                                    case 1928764793:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM113011 = (i23 - C19806.m45029("֡ܺ")) * (-79);
                                            i25 = ((iM113011 ^ i24) * 22701) ^ (-1065726894);
                                            i26 = 1275903117;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("ۘۡ") ^ i23) * 19;
                                            i25 = ((iM113011 ^ i24) * (-31445)) ^ (-458570989);
                                            i26 = -318268626;
                                        }
                                        break;
                                    case -1308655508:
                                    case -951224805:
                                        C2124.m6673();
                                        if (!C0797.f3386) {
                                            iM113011 = (i24 - C19806.m45029("ۤۤ")) * (-95);
                                            i25 = ((iM113011 ^ i23) * 16979) ^ 483469737;
                                            i26 = -359981277;
                                        } else {
                                            iM113011 = (C19806.m45029("۠ۜ") ^ i24) * 45;
                                            i25 = ((iM113011 ^ i23) * (-15301)) ^ (-1311402429);
                                            i26 = 1353834846;
                                        }
                                        break;
                                    case -1291776304:
                                    case -624045035:
                                        if (C3743.f13569) {
                                            iM113011 = ThreadFactoryC3888.m11306("᩻᩶") ^ i23;
                                            i25 = ((iM113011 ^ i24) * (-29465)) ^ (-1109328176);
                                            i26 = 1748473920;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("ܺ᩻") + i23) * (-39);
                                            i25 = ((iM113011 ^ i24) * (-10237)) ^ (-703801920);
                                            i26 = -175713485;
                                        }
                                        break;
                                    case -1226737602:
                                    case -552202493:
                                        if (!C3577.m10565()) {
                                            iM113011 = (C19806.m45029("۠ۜ") ^ i24) * 45;
                                            i25 = ((iM113011 ^ i23) * (-15301)) ^ (-1311402429);
                                            i26 = 1353834846;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i23;
                                            i25 = ((iM113011 ^ i24) * 20975) ^ (-1179017618);
                                            i26 = -251201892;
                                        }
                                        break;
                                    case -1201004676:
                                    case 1234432671:
                                        if (C3743.f13569) {
                                            iM113011 = (ThreadFactoryC3888.m11306("۫۫") ^ i24) * 25;
                                            i25 = ((iM113011 ^ i23) * 13591) ^ (-2051070771);
                                            i26 = -766763833;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("ܺ᩻") + i23) * (-39);
                                            i25 = ((iM113011 ^ i24) * (-10237)) ^ (-703801920);
                                            i26 = -175713485;
                                        }
                                        break;
                                    case -700317913:
                                    case 1654836081:
                                        if (C0671.m3008() >= 0) {
                                            iM113011 = (C19806.m45029("۠ۜ") ^ i24) * 45;
                                            i25 = ((iM113011 ^ i23) * (-15301)) ^ (-1311402429);
                                            i26 = 1353834846;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("ۛᩳ") ^ i24) * 33;
                                            i25 = ((iM113011 ^ i23) * 11837) ^ (-1753226902);
                                            i26 = -1809646482;
                                        }
                                        break;
                                    case -556722633:
                                    case 14650141:
                                        i21 = i20;
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM113011 = (C19806.m45029("۠ۜ") ^ i24) * 45;
                                            i25 = ((iM113011 ^ i23) * (-15301)) ^ (-1311402429);
                                            i26 = 1353834846;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("ۘۧ") ^ i23) * (-79);
                                            i25 = ((iM113011 ^ i24) * 8165) ^ (-1078456402);
                                            i26 = 158055549;
                                        }
                                        break;
                                    case -395241476:
                                    case 487647536:
                                        if (RunnableC1564.f6300) {
                                            iM113011 = (i24 - C19806.m45029("ۤۤ")) * (-95);
                                            i25 = ((iM113011 ^ i23) * 16979) ^ 483469737;
                                            i26 = -359981277;
                                        } else {
                                            iM113011 = (C19806.m45029("ᩴۢ") ^ i23) * (-117);
                                            i25 = ((iM113011 ^ i24) * (-14131)) ^ 1724102359;
                                            i26 = -959188041;
                                        }
                                        break;
                                    case -7034199:
                                    case 1552303906:
                                        C2124.m6673();
                                        if (C3722.f13525 <= 0) {
                                            iM113011 = (i24 - C19806.m45029("ܺۡ")) * 3;
                                            i25 = ((iM113011 ^ i23) * (-8461)) ^ 1948750154;
                                            i26 = -1169124658;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i23;
                                            i25 = ((iM113011 ^ i24) * 20975) ^ (-1179017618);
                                            i26 = -251201892;
                                        }
                                        break;
                                    case 154276019:
                                    case 996299576:
                                        RunnableC0195.m1431();
                                        C2704.m8255();
                                        break;
                                    case 500326297:
                                    case 1174173656:
                                        try {
                                            SystemClock.sleep(j);
                                            ViewOnClickListenerC4514.m12571(viewOnClickListenerC4515, viewOnClickListenerC4515.f16044.f42057.f2562, viewOnClickListenerC4515.f16044.f42056, viewOnClickListenerC4515.f16048, i21);
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        iM113011 = C19806.m45029("ۖۙ") ^ i24;
                                        i25 = ((iM113011 ^ i23) * UMWorkDispatch.MSG_CHECKER_TIMER) ^ (-1985053193);
                                        i26 = 551145305;
                                        break;
                                    case 504531175:
                                    case 1614807804:
                                        if (C0050.f912 <= 0) {
                                            iM113011 = (i24 - C19806.m45029("ۤۤ")) * (-95);
                                            i25 = ((iM113011 ^ i23) * 16979) ^ 483469737;
                                            i26 = -359981277;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("۫ۡ") + i23) * (-13);
                                            i25 = ((iM113011 ^ i24) * (-29211)) ^ (-1379342121);
                                            i26 = -1130023370;
                                        }
                                        break;
                                    default:
                                        if (C3660.m10791() != 0) {
                                            iM113011 = (ThreadFactoryC3888.m11306("ܺ᩻") + i23) * (-39);
                                            i25 = ((iM113011 ^ i24) * (-10237)) ^ (-703801920);
                                            i26 = -175713485;
                                        } else {
                                            iM113011 = (i24 - C19806.m45029("ܺۡ")) * 3;
                                            i25 = ((iM113011 ^ i23) * (-8461)) ^ 1948750154;
                                            i26 = -1169124658;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }));
                    if (C0817.m3399()) {
                        C3743.m10965(new Thread(new Runnable(c8353) { // from class: l.᩸ᩴۘ

                            /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C8353 f70516;

                            {
                                int i21 = -860983178;
                                int i22 = C3722.f13525;
                                int i23 = C2871.f10837;
                                int iM113011 = ThreadFactoryC3888.m11306("ܿ֫") ^ i23;
                                int i24 = ((iM113011 ^ i22) * (-117)) ^ (-458409670);
                                int i25 = 1379919101;
                                while (true) {
                                    i21 = ((((i21 ^ i22) * 3817) >> 31) & i24) ^ (iM113011 ^ i25);
                                    switch (i21) {
                                        case -2097050135:
                                        case 235515238:
                                            if (C2788.f10625 >= 0) {
                                                iM113011 = (C19806.m45029("ۢۖ") + i23) * (-45);
                                                i24 = ((iM113011 ^ i22) * 5081) ^ 896458471;
                                                i25 = -1486185410;
                                            } else {
                                                iM113011 = (ThreadFactoryC3888.m11306("ۖ᩺") + i22) * 45;
                                                i24 = ((iM113011 ^ i23) * (-4227)) ^ (-467137052);
                                                i25 = -1060520871;
                                            }
                                            break;
                                        case -1599888639:
                                        case 1618412345:
                                            if (C0962.f3784) {
                                                iM113011 = C19806.m45029("ۘۡ") ^ i23;
                                                i24 = ((iM113011 ^ i22) * 11121) ^ 1433133144;
                                                i25 = -929974414;
                                            } else {
                                                iM113011 = ThreadFactoryC3888.m11306("ܳܿ") ^ i22;
                                                i24 = ((iM113011 ^ i23) * 25087) ^ (-22212601);
                                                i25 = -310264320;
                                            }
                                            break;
                                        case -1405148519:
                                        case 1469056191:
                                            if (RunnableC1564.f6300) {
                                                iM113011 = C19806.m45029("ۘۡ") ^ i23;
                                                i24 = ((iM113011 ^ i22) * 11121) ^ 1433133144;
                                                i25 = -929974414;
                                            } else {
                                                iM113011 = (ThreadFactoryC3888.m11306("ۧ᩶") + i23) * (-43);
                                                i24 = ((iM113011 ^ i22) * (-5117)) ^ (-120796336);
                                                i25 = -376640174;
                                            }
                                            break;
                                        case -1178162310:
                                        case -267397434:
                                            if (C3535.f13026 <= 0) {
                                                iM113011 = (ThreadFactoryC3888.m11306("ۙܳ") + i22) * 21;
                                                i24 = ((iM113011 ^ i23) * 15139) ^ (-1229924892);
                                                i25 = 2019250005;
                                            } else {
                                                iM113011 = (ThreadFactoryC3888.m11306("ۚܳ") ^ i23) * 123;
                                                i24 = ((iM113011 ^ i22) * (-18287)) ^ 716717438;
                                                i25 = -925478109;
                                            }
                                            break;
                                        case -1079837671:
                                        case -523300803:
                                            this.f70516 = c8353;
                                            if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                                iM113011 = C19806.m45029("᩺ܰ") ^ i23;
                                                i24 = ((iM113011 ^ i22) * 10973) ^ 1055985512;
                                                i25 = 1299995267;
                                            } else {
                                                iM113011 = (ThreadFactoryC3888.m11306("۠ۘ") + i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i24 = ((iM113011 ^ i23) * (-22049)) ^ 1824525691;
                                                i25 = -1027982972;
                                            }
                                            break;
                                        case -976051648:
                                        case 2053209847:
                                            C0629.m2907();
                                            if (C7105.f23796 >= 0) {
                                                iM113011 = (C19806.m45029("ۢۖ") + i23) * (-45);
                                                i24 = ((iM113011 ^ i22) * 5081) ^ 896458471;
                                                i25 = -1486185410;
                                            } else {
                                                iM113011 = (ThreadFactoryC3888.m11306("ۡ᩸") ^ i23) * (-23);
                                                i24 = ((iM113011 ^ i22) * 17179) ^ 1784875480;
                                                i25 = 776653715;
                                            }
                                            break;
                                        case -922783818:
                                        case 964628343:
                                            if (C2332.f8260) {
                                                iM113011 = ThreadFactoryC3888.m11306("۫ۤ") ^ i23;
                                                i24 = ((iM113011 ^ i22) * 31597) ^ (-1274612756);
                                                i25 = -1124506957;
                                            } else {
                                                iM113011 = C19806.m45029("ۘۡ") ^ i23;
                                                i24 = ((iM113011 ^ i22) * 11121) ^ 1433133144;
                                                i25 = -929974414;
                                            }
                                            break;
                                        case -612590445:
                                        case -584567044:
                                            if (C2704.f10408) {
                                                iM113011 = (i23 - ThreadFactoryC3888.m11306("ۖۢ")) * 47;
                                                i24 = ((iM113011 ^ i22) * 13551) ^ (-2015815378);
                                                i25 = -1105038058;
                                            } else {
                                                iM113011 = C19806.m45029("ۘۡ") ^ i23;
                                                i24 = ((iM113011 ^ i22) * 11121) ^ 1433133144;
                                                i25 = -929974414;
                                            }
                                            break;
                                        case -354687657:
                                        case 828821044:
                                            if (RunnableC3388.m10064()) {
                                                iM113011 = C19806.m45029("ܰܿ") ^ i22;
                                                i24 = ((iM113011 ^ i23) * (-31211)) ^ 1674130978;
                                                i25 = -33403578;
                                            } else {
                                                iM113011 = C19806.m45029("ۘۡ") ^ i23;
                                                i24 = ((iM113011 ^ i22) * 11121) ^ 1433133144;
                                                i25 = -929974414;
                                            }
                                            break;
                                        case -175027010:
                                        case 1741244758:
                                            return;
                                        case -165907347:
                                        case 1798822577:
                                            C2477.m7593();
                                            if (C1977.f7413 > 0) {
                                                iM113011 = (C19806.m45029("ۢۖ") + i23) * (-45);
                                                i24 = ((iM113011 ^ i22) * 5081) ^ 896458471;
                                                i25 = -1486185410;
                                            } else {
                                                iM113011 = (ThreadFactoryC3888.m11306("۠ۘ") + i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i24 = ((iM113011 ^ i23) * (-22049)) ^ 1824525691;
                                                i25 = -1027982972;
                                            }
                                            break;
                                        case -7375879:
                                        case 984075441:
                                            if (C0216.f1393 != 0) {
                                                iM113011 = C19806.m45029("ۘۡ") ^ i23;
                                                i24 = ((iM113011 ^ i22) * 11121) ^ 1433133144;
                                                i25 = -929974414;
                                            } else {
                                                iM113011 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i22;
                                                i24 = ((iM113011 ^ i23) * 20665) ^ (-441192638);
                                                i25 = -2049082425;
                                            }
                                            break;
                                        case 153259983:
                                        case 2074765254:
                                            C0671.m3008();
                                            throw new RuntimeException();
                                        case 294227442:
                                        case 403214981:
                                            if (C2788.f10625 >= 0) {
                                                iM113011 = (ThreadFactoryC3888.m11306("۠ۘ") + i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i24 = ((iM113011 ^ i23) * (-22049)) ^ 1824525691;
                                                i25 = -1027982972;
                                            } else {
                                                iM113011 = (i22 - ThreadFactoryC3888.m11306("ۖ۫")) * 75;
                                                i24 = ((iM113011 ^ i23) * 31061) ^ 1060064747;
                                                i25 = 196449969;
                                            }
                                            break;
                                        case 751604862:
                                        case 1537482003:
                                            C2788.m8472();
                                            iM113011 = (ThreadFactoryC3888.m11306("۠ۘ") + i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i24 = ((iM113011 ^ i23) * (-22049)) ^ 1824525691;
                                            i25 = -1027982972;
                                            break;
                                        default:
                                            C1977.m6356();
                                            if (C1460.f5948 < 0) {
                                                iM113011 = (ThreadFactoryC3888.m11306("ۙܳ") + i22) * 21;
                                                i24 = ((iM113011 ^ i23) * 15139) ^ (-1229924892);
                                                i25 = 2019250005;
                                            } else {
                                                iM113011 = (C19806.m45029("ۢۖ") + i23) * (-45);
                                                i24 = ((iM113011 ^ i22) * 5081) ^ 896458471;
                                                i25 = -1486185410;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                int i21 = 0;
                                C8353 c8354 = null;
                                ViewOnClickListenerC4514 viewOnClickListenerC4515 = null;
                                long j = 0;
                                int i22 = 252981860;
                                int i23 = C1398.f5802;
                                int i24 = RunnableC3388.f12514;
                                int iM450211 = C19806.m45029("ۡۨ") ^ i23;
                                int i25 = ((iM450211 ^ i24) * 26307) ^ 224264926;
                                int i26 = 27957790;
                                while (true) {
                                    i22 = ((((i22 ^ i24) * 5353) >> 31) & i25) ^ (iM450211 ^ i26);
                                    switch (i22) {
                                        case -1910527734:
                                        case -130320021:
                                            C1148.m4232();
                                            if (C1460.f5948 < 0) {
                                                iM450211 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 18771) ^ 1732808360;
                                                i26 = 13087983;
                                            } else {
                                                iM450211 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i24;
                                                i25 = ((iM450211 ^ i23) * 28395) ^ (-1623035036);
                                                i26 = -1907378610;
                                            }
                                            break;
                                        case -1857898421:
                                        case 599933891:
                                            if (C3743.f13569) {
                                                iM450211 = ThreadFactoryC3888.m11306("ܿܶ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 27569) ^ (-783890246);
                                                i26 = -801351579;
                                            } else {
                                                iM450211 = C19806.m45029("᩹᩸") ^ i24;
                                                i25 = ((iM450211 ^ i23) * (-27297)) ^ 364222121;
                                                i26 = -248867987;
                                            }
                                            break;
                                        case -1634278507:
                                        case -684520889:
                                            if (C2124.f7782 <= 0) {
                                                iM450211 = (ThreadFactoryC3888.m11306("ۜۗ") + i24) * 75;
                                                i25 = ((iM450211 ^ i23) * 26289) ^ (-991367566);
                                                i26 = -1296275819;
                                            } else {
                                                iM450211 = (C19806.m45029("֫᩷") ^ i24) * 77;
                                                i25 = ((iM450211 ^ i23) * 10947) ^ 713273909;
                                                i26 = -2134637119;
                                            }
                                            break;
                                        case -1565890221:
                                        case -599245776:
                                            C1148.m4232();
                                            if (!RunnableC1564.f6300) {
                                                iM450211 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 18771) ^ 1732808360;
                                                i26 = 13087983;
                                            } else {
                                                iM450211 = C19806.m45029("᩹᩸") ^ i24;
                                                i25 = ((iM450211 ^ i23) * (-27297)) ^ 364222121;
                                                i26 = -248867987;
                                            }
                                            break;
                                        case -1388351126:
                                        case 641313844:
                                            if (ThreadFactoryC3888.f14547 > 0) {
                                                iM450211 = (ThreadFactoryC3888.m11306("ۜۗ") + i24) * 75;
                                                i25 = ((iM450211 ^ i23) * 26289) ^ (-991367566);
                                                i26 = -1296275819;
                                            } else {
                                                iM450211 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 18771) ^ 1732808360;
                                                i26 = 13087983;
                                            }
                                            break;
                                        case -1207605404:
                                        case -876703093:
                                            if (C1460.f5948 >= 0) {
                                                iM450211 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i24;
                                                i25 = ((iM450211 ^ i23) * 28395) ^ (-1623035036);
                                                i26 = -1907378610;
                                            } else {
                                                iM450211 = (C19806.m45029("ۤܿ") ^ i23) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i25 = ((iM450211 ^ i24) * 13551) ^ 731823561;
                                                i26 = -1487775961;
                                            }
                                            break;
                                        case -1184924359:
                                        case 1786930191:
                                            try {
                                                SystemClock.sleep(j);
                                                ViewOnClickListenerC4514.m12571(viewOnClickListenerC4515, viewOnClickListenerC4515.f16055.f42057.f2562, viewOnClickListenerC4515.f16055.f42056, viewOnClickListenerC4515.f16048, i21);
                                                break;
                                            } catch (Exception unused) {
                                            }
                                            iM450211 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i23;
                                            i25 = ((iM450211 ^ i24) * (-1055)) ^ (-868050524);
                                            i26 = 1219463181;
                                            break;
                                        case -1156281571:
                                        case 114683638:
                                            if (C3577.f13150 >= 0) {
                                                iM450211 = C19806.m45029("᩹᩸") ^ i24;
                                                i25 = ((iM450211 ^ i23) * (-27297)) ^ 364222121;
                                                i26 = -248867987;
                                            } else {
                                                iM450211 = C19806.m45029("۬ܿ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 31357) ^ (-872649147);
                                                i26 = 148351981;
                                            }
                                            break;
                                        case -1115593753:
                                        case 1864969677:
                                            if (C3722.f13525 > 0) {
                                                iM450211 = C19806.m45029("᩷ۢ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 28063) ^ (-925243703);
                                                i26 = -2044100644;
                                            } else {
                                                iM450211 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i24;
                                                i25 = ((iM450211 ^ i23) * 28395) ^ (-1623035036);
                                                i26 = -1907378610;
                                            }
                                            break;
                                        case -1024924084:
                                        case 1312722430:
                                            if (C3286.f12186) {
                                                iM450211 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 18771) ^ 1732808360;
                                                i26 = 13087983;
                                            } else {
                                                iM450211 = (i24 - C19806.m45029("ᩳ֨")) * 97;
                                                i25 = ((iM450211 ^ i23) * 28289) ^ 1651268432;
                                                i26 = -916286023;
                                            }
                                            break;
                                        case -855760077:
                                        case -151031226:
                                            viewOnClickListenerC4515 = c8354.f28965;
                                            j = 100;
                                            iM450211 = C19806.m45029("ۛ᩷") ^ i24;
                                            i25 = ((iM450211 ^ i23) * (-12695)) ^ (-259493160);
                                            i26 = -192775348;
                                            break;
                                        case -675152577:
                                        case -100047407:
                                            if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                                iM450211 = C19806.m45029("᩷ۢ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 28063) ^ (-925243703);
                                                i26 = -2044100644;
                                            } else {
                                                iM450211 = (ThreadFactoryC3888.m11306("᩻ܿ") ^ i24) * 29;
                                                i25 = ((iM450211 ^ i23) * 23035) ^ 784432916;
                                                i26 = 2029562138;
                                            }
                                            break;
                                        case -598142637:
                                        case 273655881:
                                            RunnableC1564.m5345();
                                            C0797.m3359();
                                            break;
                                        case -81163697:
                                        case 588489712:
                                            c8354 = this.f70516;
                                            if (C1977.m6356()) {
                                                iM450211 = C19806.m45029("ۡ᩶") ^ i23;
                                                i25 = ((iM450211 ^ i24) * (-3221)) ^ (-494960546);
                                                i26 = -144841096;
                                            } else {
                                                iM450211 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i25 = ((iM450211 ^ i23) * 27087) ^ 449525690;
                                                i26 = 1492399290;
                                            }
                                            break;
                                        case -46844906:
                                        case 1360984304:
                                            if (C1937.f7317 >= 0) {
                                                iM450211 = C19806.m45029("᩷ۢ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 28063) ^ (-925243703);
                                                i26 = -2044100644;
                                            } else {
                                                iM450211 = (ThreadFactoryC3888.m11306("ۧܳ") ^ i24) * 109;
                                                i25 = ((iM450211 ^ i23) * 30577) ^ (-1301862875);
                                                i26 = -32006669;
                                            }
                                            break;
                                        case 160664002:
                                        case 735165405:
                                            C1419.m4973();
                                            C3660.m10791();
                                            iM450211 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i24;
                                            i25 = ((iM450211 ^ i23) * 28395) ^ (-1623035036);
                                            i26 = -1907378610;
                                            break;
                                        case 305769302:
                                        case 1673155108:
                                            break;
                                        case 717190084:
                                        case 1898488821:
                                            i21 = i20;
                                            if (C19806.f63586) {
                                                iM450211 = C19806.m45029("᩹᩸") ^ i24;
                                                i25 = ((iM450211 ^ i23) * (-27297)) ^ 364222121;
                                                i26 = -248867987;
                                            } else {
                                                iM450211 = (i23 - C19806.m45029("᩻ۛ")) * 5;
                                                i25 = ((iM450211 ^ i24) * 19409) ^ 1995560028;
                                                i26 = -1721274673;
                                            }
                                            break;
                                        default:
                                            if (C0216.m1591() <= 0) {
                                                iM450211 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i23;
                                                i25 = ((iM450211 ^ i24) * 18771) ^ 1732808360;
                                                i26 = 13087983;
                                            } else {
                                                iM450211 = (C19806.m45029("ܺᩴ") + i23) * (-59);
                                                i25 = ((iM450211 ^ i24) * 2461) ^ (-1663788262);
                                                i26 = -321396603;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        }));
                        interfaceC6025 = ApplicationC0716.f2992;
                        iM11307 = C19806.m45029("۠ܳ") ^ i10;
                        i3 = ((iM11307 ^ i9) * (-1739)) ^ 2145110723;
                        i4 = -1171070437;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i10) * 11;
                        i3 = ((iM11307 ^ i9) * 20909) ^ 1576319358;
                        i4 = 293196075;
                    }
                    i8 = iM11307 ^ i4;
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    r10 = r10;
                    i12 = i8;
                    i11 = i3;
                    break;
                case 688643747:
                case 2027789633:
                    Context applicationContext = viewOnClickListenerC4514.getApplicationContext();
                    c8067M5356 = c8067M5356;
                    strM5502 = CallableC1627.m5502(f28962, 6, 41, i13);
                    if (C10405.m26300(applicationContext, strM5502) != 0) {
                        iM11308 = ThreadFactoryC3888.m11306("۫ۙ") ^ i9;
                        i5 = ((iM11308 ^ i10) * 24531) ^ 1215389173;
                        i6 = -802586533;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("۟۬") ^ i9;
                        i5 = ((iM11308 ^ i10) * (-25107)) ^ 1974951118;
                        i6 = 1682958970;
                    }
                    i12 = iM11308 ^ i6;
                    i11 = i5;
                    r10 = r10;
                    c8067M5356 = c8067M5356;
                    break;
                case 976619488:
                case 1511627132:
                    strM5502 = strM5502;
                    C2788.m8479(c8067M5356, C19806.m45029(strM6685) ^ 2122293634);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ᩳᩴۘ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i21) {
                            C8353 c8354 = null;
                            int i22 = 1795025446;
                            int i23 = C0050.f912;
                            int i24 = ThreadFactoryC3888.f14547;
                            int iM113011 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i23) * (-49);
                            int i25 = ((iM113011 ^ i24) * (-29785)) ^ (-1187344407);
                            int i26 = 1471652646;
                            while (true) {
                                i22 = ((((i22 ^ i24) * 16909) >> 31) & i25) ^ (iM113011 ^ i26);
                                switch (i22) {
                                    case -1986361129:
                                    case -598202818:
                                        C1419.m4973();
                                        C0526.m2437();
                                        iM113011 = (C19806.m45029("᩹ۖ") + i23) * (-37);
                                        i25 = ((iM113011 ^ i24) * (-6021)) ^ (-787865933);
                                        i26 = -569636361;
                                        break;
                                    case -1956245191:
                                    case -1953757525:
                                        if (CallableC1627.f6528) {
                                            iM113011 = C19806.m45029("ܽ᩵") ^ i24;
                                            i25 = ((iM113011 ^ i23) * 14807) ^ 673711012;
                                            i26 = 29514166;
                                        } else {
                                            iM113011 = C19806.m45029("ۙۧ") ^ i23;
                                            i25 = ((iM113011 ^ i24) * (-20473)) ^ (-1123942764);
                                            i26 = 248935926;
                                        }
                                        break;
                                    case -1582940298:
                                    case -1313472752:
                                        C10634.m26820();
                                        if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                            iM113011 = C19806.m45029("ۙۧ") ^ i23;
                                            i25 = ((iM113011 ^ i24) * (-20473)) ^ (-1123942764);
                                            i26 = 248935926;
                                        } else {
                                            iM113011 = (C19806.m45029("᩹ۖ") + i23) * (-37);
                                            i25 = ((iM113011 ^ i24) * (-6021)) ^ (-787865933);
                                            i26 = -569636361;
                                        }
                                        break;
                                    case -1429466664:
                                    case -201939504:
                                        if (C2788.f10625 >= 0) {
                                            iM113011 = (C19806.m45029("᩹ۖ") + i23) * (-37);
                                            i25 = ((iM113011 ^ i24) * (-6021)) ^ (-787865933);
                                            i26 = -569636361;
                                        } else {
                                            iM113011 = C19806.m45029("ܰۗ") ^ i23;
                                            i25 = ((iM113011 ^ i24) * (-28991)) ^ (-504410989);
                                            i26 = 1533642230;
                                        }
                                        break;
                                    case -1197799240:
                                    case 753764482:
                                        C2332.m7079();
                                        if (!C3743.f13569) {
                                            iM113011 = (i24 - C19806.m45029("ۖ᩸")) * 33;
                                            i25 = ((iM113011 ^ i23) * (-14149)) ^ (-564923310);
                                            i26 = -1423145163;
                                        } else {
                                            iM113011 = (C19806.m45029("᩹ۖ") + i23) * (-37);
                                            i25 = ((iM113011 ^ i24) * (-6021)) ^ (-787865933);
                                            i26 = -569636361;
                                        }
                                        break;
                                    case -1011254899:
                                    case -360305284:
                                        c8354 = this.f58208;
                                        if (C10634.f36300 >= 0) {
                                            iM113011 = (i24 - ThreadFactoryC3888.m11306("ۤۖ")) * 127;
                                            i25 = ((iM113011 ^ i23) * (-6667)) ^ (-79834729);
                                            i26 = 1799480446;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("ۧ۠") ^ i23;
                                            i25 = ((iM113011 ^ i24) * (-13595)) ^ 1285911768;
                                            i26 = -1963561878;
                                        }
                                        break;
                                    case -958650032:
                                    case 2016809982:
                                        ViewOnClickListenerC4514 viewOnClickListenerC4515 = c8354.f28965;
                                        viewOnClickListenerC4515.f16049 = true;
                                        C20358.m45935(viewOnClickListenerC4515, viewOnClickListenerC4515.getPackageName());
                                        break;
                                    case -699044361:
                                    case 2046118561:
                                        if (C0050.f912 <= 0) {
                                            iM113011 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i24;
                                            i25 = ((iM113011 ^ i23) * (-25823)) ^ (-1731823042);
                                            i26 = -285487905;
                                        } else {
                                            iM113011 = (ThreadFactoryC3888.m11306("ۢ֨") + i23) * 27;
                                            i25 = ((iM113011 ^ i24) * (-32129)) ^ (-1711272581);
                                            i26 = -2095492552;
                                        }
                                        break;
                                    case -158810073:
                                    case 1470179690:
                                        if (C0629.m2907()) {
                                            iM113011 = (C19806.m45029("ۗۧ") ^ i23) * (-101);
                                            i25 = ((iM113011 ^ i24) * 16243) ^ 777509869;
                                            i26 = -2050096608;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i24;
                                            i25 = ((iM113011 ^ i23) * (-25823)) ^ (-1731823042);
                                            i26 = -285487905;
                                        }
                                        break;
                                    case 411918143:
                                    case 1753919087:
                                        if (C1419.f5860 >= 0) {
                                            iM113011 = C19806.m45029("ۙۧ") ^ i23;
                                            i25 = ((iM113011 ^ i24) * (-20473)) ^ (-1123942764);
                                            i26 = 248935926;
                                        } else {
                                            iM113011 = (C19806.m45029("᩹ۧ") ^ i23) * (-127);
                                            i25 = ((iM113011 ^ i24) * 4307) ^ 1306125405;
                                            i26 = 1319969100;
                                        }
                                        break;
                                    case 554843176:
                                    case 594288855:
                                        C0216.m1591();
                                        C0671.m3008();
                                        break;
                                    case 824620156:
                                    case 1340198631:
                                        if (RunnableC1606.m5473() != 0) {
                                            iM113011 = (C19806.m45029("᩹ۖ") + i23) * (-37);
                                            i25 = ((iM113011 ^ i24) * (-6021)) ^ (-787865933);
                                            i26 = -569636361;
                                        } else {
                                            iM113011 = (C19806.m45029("ۜᩴ") + i24) * (-127);
                                            i25 = ((iM113011 ^ i23) * (-7339)) ^ 1598750627;
                                            i26 = -1897137468;
                                        }
                                        break;
                                    case 1012832900:
                                    case 1141130791:
                                        if (C0817.f3443) {
                                            iM113011 = (ThreadFactoryC3888.m11306("ܰۡ") ^ i24) * 123;
                                            i25 = ((iM113011 ^ i23) * 9653) ^ (-885277324);
                                            i26 = -1723075384;
                                        } else {
                                            iM113011 = (i24 - ThreadFactoryC3888.m11306("ۤۖ")) * 127;
                                            i25 = ((iM113011 ^ i23) * (-6667)) ^ (-79834729);
                                            i26 = 1799480446;
                                        }
                                        break;
                                    case 1123825467:
                                    case 1454925008:
                                        C1875.m6086();
                                        if (!RunnableC1895.f7152) {
                                            iM113011 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i24;
                                            i25 = ((iM113011 ^ i23) * (-25823)) ^ (-1731823042);
                                            i26 = -285487905;
                                        } else {
                                            iM113011 = (i24 - C19806.m45029("ۖ᩸")) * 33;
                                            i25 = ((iM113011 ^ i23) * (-14149)) ^ (-564923310);
                                            i26 = -1423145163;
                                        }
                                        break;
                                    case 1571102707:
                                    case 1990036385:
                                        if (C1025.m3861() <= 0) {
                                            iM113011 = (i24 - C19806.m45029("ۖ᩸")) * 33;
                                            i25 = ((iM113011 ^ i23) * (-14149)) ^ (-564923310);
                                            i26 = -1423145163;
                                        } else {
                                            iM113011 = ThreadFactoryC3888.m11306("ܶۖ") ^ i24;
                                            i25 = ((iM113011 ^ i23) * 9923) ^ 2114942286;
                                            i26 = 1732630552;
                                        }
                                        break;
                                    default:
                                        if (C10634.f36300 >= 0) {
                                            iM113011 = C19806.m45029("ۙۧ") ^ i23;
                                            i25 = ((iM113011 ^ i24) * (-20473)) ^ (-1123942764);
                                            i26 = 248935926;
                                        } else {
                                            iM113011 = C19806.m45029("ܳۘ") ^ i24;
                                            i25 = ((iM113011 ^ i23) * (-27819)) ^ 367148795;
                                            i26 = -1125826179;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM45029 = (ThreadFactoryC3888.m11306("ۚۨ") ^ i9) * (-123);
                    i3 = ((iM45029 ^ i10) * (-24983)) ^ 1209136041;
                    i7 = -386603914;
                    r8 = r10;
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                case 1013939666:
                case 1057740295:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    short s2 = f28962[0];
                    int i21 = s2 + 2463;
                    if (C1461.m5080()) {
                        s = s2;
                        i15 = i21;
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") + i9) * 3;
                        i = ((iM11306 ^ i10) * 24957) ^ (-1442638431);
                        i2 = 1299142549;
                        r6 = r10;
                        int i114 = iM11306 ^ i2;
                        c8387M31304 = c8387M31304;
                        c8387M31305 = c8387M31305;
                        strM5502 = strM5502;
                        i12 = i114;
                        i11 = i;
                        r10 = r6;
                        c8067M5356 = c8067M5356;
                    } else {
                        int iM450211 = C19806.m45029("ۡۨ") ^ i10;
                        int i22 = ((iM450211 ^ i9) * (-25943)) ^ (-408894187);
                        c8387M31304 = c8387M31304;
                        c8387M31305 = c8387M31305;
                        i15 = i21;
                        strM5502 = strM5502;
                        c8067M5356 = c8067M5356;
                        i12 = iM450211 ^ (-1832450843);
                        s = s2;
                        i11 = i22;
                        c8353 = this;
                    }
                    break;
                case 1390365874:
                case 1669248884:
                    strM5502 = strM5502;
                    c8067M5356 = c8067M5356;
                    viewOnClickListenerC4514 = c8353.f28965;
                    c8387M31304 = viewOnClickListenerC4514.f16044.m31304(c8353.f28963);
                    c8387M31305 = viewOnClickListenerC4514.f16055.m31304(c8353.f28963);
                    r7 = r10;
                    if (C1148.f5161 > 0) {
                        iM11307 = C19806.m45029("ܳ۬") ^ i10;
                        i3 = ((iM11307 ^ i9) * (-7899)) ^ (-928867077);
                        i4 = 2101672419;
                        i8 = iM11307 ^ i4;
                        strM5502 = strM5502;
                        c8067M5356 = c8067M5356;
                        r10 = r10;
                        i12 = i8;
                        i11 = i3;
                    }
                    c8067M5356 = c8067M5356;
                    r9 = r7;
                    iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i10;
                    i3 = ((iM45029 ^ i9) * (-16335)) ^ 223611122;
                    i7 = -549983835;
                    r8 = r9;
                    i8 = iM45029 ^ i7;
                    strM5502 = strM5502;
                    r10 = r8;
                    i12 = i8;
                    i11 = i3;
                    break;
                default:
                    i13 = 7600;
                    iM11306 = (ThreadFactoryC3888.m11306("ܳᩳ") + i9) * (-71);
                    i = ((iM11306 ^ i10) * (-17995)) ^ (-1935060041);
                    i2 = -334306065;
                    r6 = r10;
                    int i115 = iM11306 ^ i2;
                    c8387M31304 = c8387M31304;
                    c8387M31305 = c8387M31305;
                    strM5502 = strM5502;
                    i12 = i115;
                    i11 = i;
                    r10 = r6;
                    c8067M5356 = c8067M5356;
                    break;
            }
            return;
        }
    }
}
