package l;

import bin.mt.plus.Main;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71UU */
/* JADX INFO: loaded from: classes.dex */
public class C15998 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51799 = 0;

    /* JADX INFO: renamed from: ᩳۘᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f51800;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C7817 f51801;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f51802 = true;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f51803;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f51804;

    static {
        ApplicationC6132.m17119(136);
        f51800 = new short[]{3515, -9695, 7229, -1101, 3063, -15934, 8187, 6224, -31423, -28865, 27069, -26600, 26608, 18217, 6669, 6658, 6663, 6670, 6668, 6670, 6661, 6670, 6681, 6666, 6687, 6670, 6694, 6666, 6683, 6683, 6658, 6661, 6668, 6701, 6658, 6663, 6670, 6681, 6670, 6664, 6660, 6685, 6670, 6681, 6674, 6694, 6660, 6671, 6670, 6662, 6666, 6687, 6664, 6659, 6715, 6666, 6687, 6687, 6670, 6681, 6661, 6664, 6663, 6666, 6680, 6680, 6715, 6666, 6687, 6687, 6670, 6681, 6661, 6656, 6670, 6670, 6683, 6698, 6683, 6656, 6712, 6658, 6668, 6697, 6663, 6660, 6664, 6656, 6725, 6687, 6662, 6683, 6724, 6671, 6666, 6687, 6666, 6708, 6666, 6664, 6708, 6681, 6666, 6664, 465, 23608, 23607, 23602, 23611, 1841, 2357, -15852, 3751, 42, -8235};
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public native C5202 mo3077();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public native void mo3079(C5202 c5202);

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo12168() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[PHI: r13 r14 r15
      0x009a: PHI (r13v3 short[]) = (r13v2 short[]), (r13v1 short[]) binds: [B:24:0x0098, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r14v3 int) = (r14v2 int), (r14v1 int) binds: [B:24:0x0098, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r15v3 int) = (r15v2 int), (r15v1 int) binds: [B:24:0x0098, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0119 A[PHI: r10 r11 r12 r20
      0x0119: PHI (r10v4 short[]) = (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:36:0x0117, B:32:0x00f6, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r11v4 int) = (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:36:0x0117, B:32:0x00f6, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r12v4 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:36:0x0117, B:32:0x00f6, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r20v4 int) = (r20v1 int), (r20v2 int), (r20v1 int) binds: [B:36:0x0117, B:32:0x00f6, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01cb A[PHI: r7
      0x01cb: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:51:0x01c9, B:16:0x005c, B:14:0x0058, B:11:0x0050, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0201 A[PHI: r2 r5 r6
      0x0201: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:55:0x01ff, B:28:0x00d2, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:55:0x01ff, B:28:0x00d2, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:55:0x01ff, B:28:0x00d2, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x024e A[PHI: r4 r8 r21
      0x024e: PHI (r4v3 char) = (r4v1 char), (r4v2 char), (r4v1 char), (r4v1 char) binds: [B:63:0x024c, B:59:0x0230, B:47:0x01a6, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r8v3 short) = (r8v1 short), (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:63:0x024c, B:59:0x0230, B:47:0x01a6, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]) binds: [B:63:0x024c, B:59:0x0230, B:47:0x01a6, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM11306;
        int i;
        int i2;
        String strM10571 = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1264971487;
        int i11 = C1066.f4915;
        int i12 = C7105.f23796;
        int iM11307 = (i12 - ThreadFactoryC3888.m11306("᩵֫")) * (-111);
        int i13 = ((iM11307 ^ i11) * (-14223)) ^ (-1459479188);
        int i14 = iM11307 ^ (-1002419261);
        short[] sArr3 = null;
        int iM11308 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * o.a.e) >> 31));
            switch (i10) {
                case -2098971152:
                case -938890097:
                    s2 = 28834;
                    if (C0671.m3008() >= 0) {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("ۛܰ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i11) * (-25995)) ^ (-646163317);
                        i2 = -2055495963;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘᩴ") + i11) * (-3);
                        i = ((iM11306 ^ i12) * (-12213)) ^ (-2136311893);
                        i2 = -1497257418;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -2091739123:
                case 495220773:
                    C1419.m4973();
                    if (C0629.m2907()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩶") ^ i12) * 65;
                        i = ((iM11306 ^ i11) * (-11127)) ^ 613331866;
                        i2 = 809615839;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("ۛܰ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i11) * (-25995)) ^ (-646163317);
                        i2 = -2055495963;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1979819737:
                case -1023459962:
                    m41562(C19806.m45029(strM10571) ^ 2129484384);
                    break;
                case -1906060044:
                case -1659304617:
                    iM11308 = ThreadFactoryC3888.m11306(CallableC1627.m5502(sArr, i6, i7, i5));
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("᩶ᩴ") + i11) * 15;
                        i = ((iM11306 ^ i12) * 5159) ^ (-144977579);
                        i2 = 1969918617;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("֨ۨ")) * 31;
                        i = ((iM11306 ^ i11) * (-9249)) ^ (-1129343273);
                        i2 = 1332450304;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1783419592:
                case 1346952235:
                    sArr2 = f51800;
                    i8 = 4;
                    i9 = 3;
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩵") ^ i11;
                        i = ((iM11306 ^ i12) * 29619) ^ (-1413055386);
                        i2 = 1389303299;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩺") ^ i11;
                        i = ((iM11306 ^ i12) * 29345) ^ 331576550;
                        i2 = -1398333659;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1632983897:
                case -847533327:
                    C0050.m934(this, iM11308 ^ 2120008141);
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (i12 - C19806.m45029("ᩳۧ")) * (-69);
                        i = ((iM11306 ^ i11) * 14727) ^ (-959731634);
                        i2 = 1181247857;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۘ") ^ i12;
                        i = ((iM11306 ^ i11) * (-8125)) ^ 878495633;
                        i2 = 1607967744;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -920921709:
                case -768190388:
                    strM10571 = C3577.m10571(sArr2, i8, i9, i5);
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i12 - C19806.m45029("ᩳۧ")) * (-69);
                        i = ((iM11306 ^ i11) * 14727) ^ (-959731634);
                        i2 = 1181247857;
                    } else {
                        iM11306 = (i11 - C19806.m45029("ۤ۫")) * (-99);
                        i = ((iM11306 ^ i12) * (-9057)) ^ (-1242927523);
                        i2 = 560929676;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -734600807:
                case 388320281:
                    c = 0;
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۙ") ^ i11;
                        i = ((iM11306 ^ i12) * (-29171)) ^ (-562952039);
                        i2 = 399164893;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("ۛܰ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i11) * (-25995)) ^ (-646163317);
                        i2 = -2055495963;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -633125209:
                case 1920348669:
                    s = sArr3[c];
                    i3 = s * s;
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("ۨܺ") ^ i12;
                        i = ((iM11306 ^ i11) * (-25183)) ^ 386885333;
                        i2 = -439835124;
                    } else {
                        iM11306 = (i12 - C19806.m45029("ᩳۧ")) * (-69);
                        i = ((iM11306 ^ i11) * 14727) ^ (-959731634);
                        i2 = 1181247857;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -455337568:
                case 1146762499:
                    if (RunnableC3388.m10064()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩶") ^ i12) * 65;
                        i = ((iM11306 ^ i11) * (-11127)) ^ 613331866;
                        i2 = 809615839;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩵") ^ i11;
                        i = ((iM11306 ^ i12) * 29619) ^ (-1413055386);
                        i2 = 1389303299;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -397296809:
                case 799813233:
                    i4 = i3 + 207849889;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩶") ^ i12) * 65;
                        i = ((iM11306 ^ i11) * (-11127)) ^ 613331866;
                        i2 = 809615839;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۗ") ^ i11;
                        i = ((iM11306 ^ i12) * 20633) ^ (-2043254002);
                        i2 = -1380622791;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -305864689:
                case 1867792014:
                    i5 = 16722;
                    iM11306 = (i11 - C19806.m45029("ۙܶ")) * (-91);
                    i = ((iM11306 ^ i12) * 19991) ^ (-1839662515);
                    i2 = 939853119;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -294760854:
                case 1553095889:
                    sArr = f51800;
                    i6 = 1;
                    i7 = 3;
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("᩶ᩴ") + i11) * 15;
                        i = ((iM11306 ^ i12) * 5159) ^ (-144977579);
                        i2 = 1969918617;
                    } else {
                        iM11306 = (C19806.m45029("᩸۟") + i11) * 13;
                        i = ((iM11306 ^ i12) * (-22211)) ^ (-1513088987);
                        i2 = -1529099739;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -222830600:
                case 930116019:
                    C7105.m18985();
                    C2642.m8171();
                    iM11306 = (ThreadFactoryC3888.m11306("ܿ᩶") ^ i12) * 65;
                    i = ((iM11306 ^ i11) * (-11127)) ^ 613331866;
                    i2 = 809615839;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -73044054:
                case 886196945:
                    sArr3 = f51800;
                    if (C19806.f63586) {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("ۛܰ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i11) * (-25995)) ^ (-646163317);
                        i2 = -2055495963;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩶") + i12) * (-77);
                        i = ((iM11306 ^ i11) * (-1831)) ^ (-404133394);
                        i2 = 167179881;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -47565790:
                case 1400977049:
                    i5 = 36471;
                    iM11306 = (i11 - C19806.m45029("ۙܶ")) * (-91);
                    i = ((iM11306 ^ i12) * 19991) ^ (-1839662515);
                    i2 = 939853119;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 478374000:
                case 1745427924:
                    if (i4 - (s * s2) >= 0) {
                        iM11306 = C19806.m45029("ۡۧ") ^ i12;
                        i = ((iM11306 ^ i11) * (-17791)) ^ (-823678116);
                        i2 = 927907115;
                    } else {
                        iM11306 = (C19806.m45029("۠ܿ") + i12) * 101;
                        i = ((iM11306 ^ i11) * 17763) ^ 233783993;
                        i2 = 875064585;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 901483528:
                case 1242930023:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩶") ^ i12) * 65;
                        i = ((iM11306 ^ i11) * (-11127)) ^ 613331866;
                        i2 = 809615839;
                    } else {
                        iM11306 = (C19806.m45029("᩶ᩴ") + i11) * 15;
                        i = ((iM11306 ^ i12) * 5159) ^ (-144977579);
                        i2 = 1969918617;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                default:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
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

    /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0227 A[PHI: r4 r5 r6 r11 r12 r20 r21 r26
      0x0227: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:57:0x0225, B:37:0x015c, B:33:0x0137, B:25:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:57:0x0225, B:37:0x015c, B:33:0x0137, B:25:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:57:0x0225, B:37:0x015c, B:33:0x0137, B:25:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:57:0x0225, B:37:0x015c, B:33:0x0137, B:25:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:57:0x0225, B:37:0x015c, B:33:0x0137, B:25:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:57:0x0225, B:37:0x015c, B:33:0x0137, B:25:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r21v4 int) = (r21v3 int), (r21v2 int), (r21v2 int), (r21v2 int) binds: [B:57:0x0225, B:37:0x015c, B:33:0x0137, B:25:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r26v5 int) = (r26v4 int), (r26v3 int), (r26v3 int), (r26v3 int) binds: [B:57:0x0225, B:37:0x015c, B:33:0x0137, B:25:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x025e A[PHI: r2 r7 r8 r9 r15 r18 r19
      0x025e: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v6 java.lang.String)
     binds: [B:61:0x025c, B:49:0x01c7, B:16:0x00af, B:12:0x008e, B:88:0x025e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:61:0x025c, B:49:0x01c7, B:16:0x00af, B:12:0x008e, B:88:0x025e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:61:0x025c, B:49:0x01c7, B:16:0x00af, B:12:0x008e, B:88:0x025e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v6 short[]) binds: [B:61:0x025c, B:49:0x01c7, B:16:0x00af, B:12:0x008e, B:88:0x025e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r15v5 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:61:0x025c, B:49:0x01c7, B:16:0x00af, B:12:0x008e, B:88:0x025e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r18v5 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:61:0x025c, B:49:0x01c7, B:16:0x00af, B:12:0x008e, B:88:0x025e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r19v5 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:61:0x025c, B:49:0x01c7, B:16:0x00af, B:12:0x008e, B:88:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0294 A[PHI: r1 r3 r10 r16 r17
      0x0294: PHI (r1v4 java.lang.String) = (r1v2 java.lang.String), (r1v3 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:65:0x0292, B:45:0x01a4, B:29:0x0110, B:9:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r3v4 java.lang.String[]) = (r3v2 java.lang.String[]), (r3v2 java.lang.String[]), (r3v3 java.lang.String[]), (r3v2 java.lang.String[]) binds: [B:65:0x0292, B:45:0x01a4, B:29:0x0110, B:9:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:65:0x0292, B:45:0x01a4, B:29:0x0110, B:9:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x0292, B:45:0x01a4, B:29:0x0110, B:9:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:65:0x0292, B:45:0x01a4, B:29:0x0110, B:9:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        int iM11306;
        int i;
        int i2;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i4 = C3535.f13026;
        int iM11307 = (ThreadFactoryC3888.m11306("ۡܺ") ^ i3) * 15;
        int i5 = ((iM11307 ^ i4) * 27853) ^ 615035337;
        String strM10790 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = iM11307 ^ (-1477026415);
        int iM45029 = 0;
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
        int i15 = -1119188634;
        int i16 = 0;
        String[] strArr = null;
        String strM41569 = null;
        String strM4892 = null;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * (-23909)) >> 31));
            switch (i15) {
                case -2139327824:
                case -910469184:
                    s = sArr[c];
                    s2 = 12624;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۘ") + i3) * (-53);
                        i = ((iM11306 ^ i4) * (-30589)) ^ 756693361;
                        i2 = -3018286;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۢ") ^ i4;
                        i = ((iM11306 ^ i3) * 10349) ^ 482955508;
                        i2 = 1650348383;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2001919056:
                case 589331909:
                    strM41569 = m41569(strM4892);
                    sArr3 = f51800;
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۘ") + i3) * (-53);
                        i = ((iM11306 ^ i4) * (-30589)) ^ 756693361;
                        i2 = -3018286;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ۡܳ") ^ i4;
                        i5 = ((iM11308 ^ i3) * 25613) ^ 993008457;
                        i6 = iM11308 ^ 38211258;
                    }
                    break;
                case -1737318842:
                case 1576028210:
                    if (C0050.m946() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۘ") + i3) * (-53);
                        i = ((iM11306 ^ i4) * (-30589)) ^ 756693361;
                        i2 = -3018286;
                    } else {
                        iM11306 = (C19806.m45029("ۧ۟") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM11306 ^ i3) * (-16725)) ^ 1608271542;
                        i2 = -448680992;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1588714640:
                case 1394451341:
                    sArr2 = f51800;
                    i8 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i9 = 4;
                    if (C2704.m8255() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۘ") + i3) * (-53);
                        i = ((iM11306 ^ i4) * (-30589)) ^ 756693361;
                        i2 = -3018286;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩺᩺")) * (-49);
                        i = ((iM11306 ^ i3) * 6869) ^ (-556468782);
                        i2 = -1121227897;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1274309137:
                case 1376735853:
                    C1460.m5050();
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5783)) ^ 16665852;
                        i2 = 1520141366;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۘ") + i3) * (-53);
                        i = ((iM11306 ^ i4) * (-30589)) ^ 756693361;
                        i2 = -3018286;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1188540728:
                case 1035897768:
                    i13 = s * s2;
                    i14 = s * s;
                    i16 = 39841344;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i3;
                        i = ((iM11306 ^ i4) * (-10799)) ^ (-1308177053);
                        i2 = -1285416438;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۧۗ")) * 25;
                        i = ((iM11306 ^ i3) * 19219) ^ 1282158781;
                        i2 = 1841719446;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1020579474:
                case 914124059:
                    i12 = 5267;
                    iM11306 = (ThreadFactoryC3888.m11306("ܳ᩵") ^ i3) * 55;
                    i = ((iM11306 ^ i4) * 25741) ^ (-565594811);
                    i2 = 526063095;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -931742098:
                case 463323862:
                    strM4892 = C1398.m4892(sArr2, i8, i9, i12);
                    if (C3577.f13150 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡۬") + i4) * (-11);
                        i = ((iM11306 ^ i3) * 7467) ^ (-1374310689);
                        i2 = 2032599380;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ᩴ") ^ i3;
                        i = ((iM11306 ^ i4) * 26485) ^ (-1572089787);
                        i2 = -1041719073;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -840847825:
                case -356061012:
                    i12 = 23646;
                    iM11306 = (ThreadFactoryC3888.m11306("ܳ᩵") ^ i3) * 55;
                    i = ((iM11306 ^ i4) * 25741) ^ (-565594811);
                    i2 = 526063095;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -808381405:
                case 504003717:
                    strArr = new String[]{strM41569, C1875.m6085(iM45029 ^ i7)};
                    sArr4 = f51800;
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡۬") + i4) * (-11);
                        i = ((iM11306 ^ i3) * 7467) ^ (-1374310689);
                        i2 = 2032599380;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۛ") + i4) * 93;
                        i = ((iM11306 ^ i3) * (-1537)) ^ (-1149907761);
                        i2 = -35378224;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -747025242:
                case -98293996:
                    if (C2249.m6915() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5783)) ^ 16665852;
                        i2 = 1520141366;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡۬") + i4) * (-11);
                        i = ((iM11306 ^ i3) * 7467) ^ (-1374310689);
                        i2 = 2032599380;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -592120468:
                case 690070259:
                    i10 = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    i11 = 3;
                    if (C1148.m4232() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i3;
                        i = ((iM11306 ^ i4) * (-10799)) ^ (-1308177053);
                        i2 = -1285416438;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ۟") ^ i3;
                        i = ((iM11306 ^ i4) * 8017) ^ 545029335;
                        i2 = 1283350789;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -319991513:
                case 233350075:
                    sArr = f51800;
                    c = 'h';
                    if (C0671.m3008() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡۬") + i4) * (-11);
                        i = ((iM11306 ^ i3) * 7467) ^ (-1374310689);
                        i2 = 2032599380;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽ֡")) * (-83);
                        i = ((iM11306 ^ i4) * (-21919)) ^ (-1207711156);
                        i2 = -1104568813;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -211674002:
                case 746435610:
                    C7105.m18985();
                    iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i4;
                    i = ((iM11306 ^ i3) * (-5783)) ^ 16665852;
                    i2 = 1520141366;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 87584904:
                case 1868371309:
                    return C0278.m1786(C19806.m45029(C3743.m10964(sArr4, i10, i11, i12)) ^ 2119246973, strArr);
                case 91971141:
                case 1484765273:
                    C2249.m6915();
                    return null;
                case 348845345:
                case 884688777:
                    iM45029 = C19806.m45029(strM10790);
                    i7 = 2121282483;
                    if (C1148.m4232() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i3;
                        i = ((iM11306 ^ i4) * (-10799)) ^ (-1308177053);
                        i2 = -1285416438;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩺ۡ")) * 119;
                        i = ((iM11306 ^ i4) * 27537) ^ (-1240454787);
                        i2 = -1044791145;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1571286743:
                case 1995470968:
                    strM10790 = C3660.m10790(sArr3, 109, 3, i12);
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i3;
                        i = ((iM11306 ^ i4) * (-10799)) ^ (-1308177053);
                        i2 = -1285416438;
                    } else {
                        iM11306 = (C19806.m45029("᩶᩻") + i3) * (-101);
                        i = ((iM11306 ^ i4) * 12355) ^ (-740958355);
                        i2 = 561616577;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    if ((i14 + i16) - i13 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i4;
                        i = ((iM11306 ^ i3) * 18967) ^ 13807787;
                        i2 = 1772055130;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") + i3) * (-81);
                        i = ((iM11306 ^ i4) * (-3977)) ^ (-1296459234);
                        i2 = 498269883;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        int i = 169452759;
        int i2 = RunnableC1606.f6488;
        int i3 = C0629.f2722;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("֨᩺")) * (-63);
        int i4 = ((iM11306 ^ i3) * 22917) ^ (-1418317573);
        int i5 = -1321842840;
        while (true) {
            i = ((((i ^ i3) * (-1781)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1906043959:
                case -627778270:
                    if (m41579(c11545)) {
                        iM11306 = C19806.m45029("֫۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11863) ^ 1395163992;
                        i5 = 60583017;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2543) ^ (-489183482);
                        i5 = 845915054;
                    }
                    break;
                case -1834506401:
                case 1260752110:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-26137)) ^ 1715403288;
                        i5 = -1951329917;
                    } else {
                        iM11306 = (C19806.m45029("ᩴۧ") + i3) * 119;
                        i4 = ((iM11306 ^ i2) * 20081) ^ 827752991;
                        i5 = 438675252;
                    }
                    break;
                case -1480578393:
                case 1517341904:
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("֫ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11373)) ^ 263393014;
                        i5 = 577467584;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩹") ^ i3) * 21;
                        i4 = ((iM11306 ^ i2) * 11663) ^ 1728359324;
                        i5 = -749528272;
                    }
                    break;
                case -1467750484:
                case -446887386:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-26137)) ^ 1715403288;
                        i5 = -1951329917;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩵") + i2) * (-61);
                        i4 = ((iM11306 ^ i3) * 3227) ^ 1065579814;
                        i5 = -428305726;
                    }
                    break;
                case -1300775952:
                case 1155462398:
                    C0216.m1591();
                    break;
                case -1299765474:
                case 553943935:
                    break;
                case -1183957864:
                case 525067267:
                    if (C1460.f5948 < 0) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-26137)) ^ 1715403288;
                        i5 = -1951329917;
                    } else {
                        iM11306 = C19806.m45029("ܰܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4487)) ^ (-2060021847);
                        i5 = -1425423323;
                    }
                    break;
                case -1095237971:
                case 1297237857:
                    C2477.m7593();
                    if (C0050.f912 > 0) {
                        iM11306 = C19806.m45029("֫ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11373)) ^ 263393014;
                        i5 = 577467584;
                    } else {
                        iM11306 = C19806.m45029("۫ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-20611)) ^ 1325035266;
                        i5 = 1454978833;
                    }
                    break;
                case -780293491:
                case 1538346224:
                    if (C1461.m5079(c5202)) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22033)) ^ 2023499336;
                        i5 = 1639150464;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2543) ^ (-489183482);
                        i5 = 845915054;
                    }
                    break;
                case -647786999:
                case 479801480:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-26137)) ^ 1715403288;
                        i5 = -1951329917;
                    } else {
                        iM11306 = (C19806.m45029("᩷᩺") ^ i2) * 61;
                        i4 = ((iM11306 ^ i3) * (-27081)) ^ (-362711320);
                        i5 = 252219585;
                    }
                    break;
                case -548508793:
                case 1015030238:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-26137)) ^ 1715403288;
                        i5 = -1951329917;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۜۚ")) * (-95);
                        i4 = ((iM11306 ^ i2) * 30617) ^ (-589660711);
                        i5 = -1818085418;
                    }
                    break;
                case -525273157:
                case 715183822:
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("֫ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11373)) ^ 263393014;
                        i5 = 577467584;
                    } else {
                        iM11306 = C19806.m45029("᩶᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18145) ^ (-1575000085);
                        i5 = -523311640;
                    }
                    break;
                case -207455251:
                case 121267259:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = C19806.m45029("֫ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11373)) ^ 263393014;
                        i5 = 577467584;
                    } else {
                        iM11306 = (C19806.m45029("۟ۤ") + i2) * 49;
                        i4 = ((iM11306 ^ i3) * 7797) ^ (-1310745564);
                        i5 = -721807373;
                    }
                    break;
                case -119850149:
                case 1310182735:
                    C1066.m4023();
                    RunnableC0195.m1431();
                    iM11306 = C19806.m45029("ܰܳ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-4487)) ^ (-2060021847);
                    i5 = -1425423323;
                    break;
                case 274715941:
                case 1758702979:
                    if (C3660.m10791() != 0) {
                        iM11306 = C19806.m45029("ܰܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4487)) ^ (-2060021847);
                        i5 = -1425423323;
                    } else {
                        iM11306 = (C19806.m45029("ۡۤ") ^ i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-31433)) ^ 450043674;
                        i5 = -1832016272;
                    }
                    break;
                case 284363320:
                case 1369904623:
                    C10634.m26818(c11545, C3743.m10959(this.f51804));
                    c11545.m28830();
                    iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i3;
                    i4 = ((iM11306 ^ i2) * 2543) ^ (-489183482);
                    i5 = 845915054;
                    break;
                case 385273114:
                case 1153040409:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ܰܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4487)) ^ (-2060021847);
                        i5 = -1425423323;
                    } else {
                        iM11306 = C19806.m45029("᩻ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 16869) ^ (-790084919);
                        i5 = 1196887407;
                    }
                    break;
                case 731412052:
                case 1059940488:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ᩴ") ^ i3) * 19;
                        i4 = ((iM11306 ^ i2) * (-24487)) ^ (-952522431);
                        i5 = 1012767468;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21571)) ^ (-1207615655);
                        i5 = -1038966367;
                    }
                    break;
                default:
                    C3535.m10431();
                    if (C3722.f13525 > 0) {
                        iM11306 = C19806.m45029("۫ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-20611)) ^ 1325035266;
                        i5 = 1454978833;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ۬") + i3) * (-3);
                        i4 = ((iM11306 ^ i2) * (-26137)) ^ 1715403288;
                        i5 = -1951329917;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩶ۙ */
    public final boolean mo18332() {
        return this.f51802;
    }
}
