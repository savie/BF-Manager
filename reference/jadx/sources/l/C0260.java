package l;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֡۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0260 extends AbstractC0447 {

    /* JADX INFO: renamed from: ۛܽۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f1533 = {1775, -20468, -20805, 21092, 6233, -9683, -15965, 4571, 5633, 19269, 22730, 22819, 31612, 23697, 18188};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f1534;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AccelerateInterpolator f1535;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6606 f1536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f1537;

    /* JADX WARN: Code duplicated, block: B:28:0x00d2 A[PHI: r13
      0x00d2: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:27:0x00d0, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0103 A[PHI: r12
      0x0103: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:31:0x0101, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0208 A[PHI: r5 r6 r9
      0x0208: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:58:0x0206, B:46:0x01a8, B:12:0x005b, B:9:0x0052, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:58:0x0206, B:46:0x01a8, B:12:0x005b, B:9:0x0052, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:58:0x0206, B:46:0x01a8, B:12:0x005b, B:9:0x0052, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0237 A[PHI: r4 r8
      0x0237: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:62:0x0235, B:50:0x01c6, B:14:0x005f, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:62:0x0235, B:50:0x01c6, B:14:0x005f, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0282 A[PHI: r1 r7 r11 r18
      0x0282: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v4 int) binds: [B:70:0x0280, B:66:0x0267, B:54:0x01e5, B:35:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:70:0x0280, B:66:0x0267, B:54:0x01e5, B:35:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:70:0x0280, B:66:0x0267, B:54:0x01e5, B:35:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r18v5 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:70:0x0280, B:66:0x0267, B:54:0x01e5, B:35:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerClosed(View view) {
        int iM45029;
        int i;
        int i2;
        int i3 = C2249.f8050;
        int i4 = C3660.f13403;
        int iM11306 = ThreadFactoryC3888.m11306("ܰܰ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 23459) ^ 162150487;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 1413225781;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -27223097;
        Main main = null;
        int iM6354 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-28569)) >> 31));
            switch (i13) {
                case -1990158311:
                case 1642971046:
                    s2 = 14378;
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("۬ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16037)) ^ 706922169;
                        i2 = -237749834;
                    } else {
                        iM45029 = C19806.m45029("᩵ۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 20387) ^ 1660775570;
                        i2 = 81851573;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1827601294:
                case 2102907797:
                    if (iM6354 == (ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(sArr2, i11, i12, i10)) ^ 2123535102)) {
                        iM45029 = C19806.m45029("ۗۤ") ^ i3;
                        i = ((iM45029 ^ i4) * (-28957)) ^ (-819993041);
                        i2 = 207124496;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۡܽ")) * (-93);
                        i = ((iM45029 ^ i3) * 27413) ^ 1730872009;
                        i2 = -496510939;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1572946191:
                case 1233729539:
                    sArr = f1533;
                    if (C2332.m7079() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-513)) ^ (-60674933);
                        i2 = 1013762216;
                    } else {
                        iM45029 = C19806.m45029("ۤܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-28903)) ^ 924668760;
                        i2 = -1335635340;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1504073225:
                case -84855988:
                    i8 = 206726884;
                    if (C0797.m3359()) {
                        iM45029 = (C19806.m45029("֡۬") + i3) * (-53);
                        i = ((iM45029 ^ i4) * 18927) ^ (-36780773);
                        i2 = 515644608;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-513)) ^ (-60674933);
                        i2 = 1013762216;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1459645186:
                case -77166148:
                    s = sArr[c];
                    i7 = s * s;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("֨ۢ") ^ i3;
                        i = ((iM45029 ^ i4) * (-7745)) ^ (-886916399);
                        i2 = 1715097250;
                    } else {
                        iM45029 = C19806.m45029("۬ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16037)) ^ 706922169;
                        i2 = -237749834;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1424309775:
                case -921306724:
                    i10 = 55533;
                    iM45029 = (C19806.m45029("ۢܰ") + i3) * (-83);
                    i = ((iM45029 ^ i4) * (-13101)) ^ 208375540;
                    i2 = -1430902513;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1418927646:
                case 1664169616:
                    C19806.m45024();
                    break;
                case -1298286231:
                case 2093121923:
                    i11 = 1;
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("᩺ۢ") ^ i3;
                        i = ((iM45029 ^ i4) * 15095) ^ 1965032284;
                        i2 = 845908860;
                    } else {
                        iM45029 = C19806.m45029("֫᩸") ^ i4;
                        i = ((iM45029 ^ i3) * (-2559)) ^ 1005805174;
                        i2 = -167483531;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1143328581:
                case 74046352:
                    break;
                case -1013785994:
                case 913350693:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-513)) ^ (-60674933);
                        i2 = 1013762216;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩶ۢ")) * 109;
                        i = ((iM45029 ^ i4) * 21023) ^ (-1363189170);
                        i2 = 1255654518;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -998203683:
                case 938595118:
                    int i14 = s + s2;
                    if (i9 - (i14 * i14) >= 0) {
                        iM45029 = C19806.m45029("᩶ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-231)) ^ (-1495958246);
                        i2 = 1018682257;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܽ") ^ i4;
                        i = ((iM45029 ^ i3) * (-24553)) ^ (-404472319);
                        i2 = -1382758173;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -868486254:
                case 1181770398:
                    main = this.f1534;
                    if (main.f37 != null) {
                        int iM11307 = ThreadFactoryC3888.m11306("ܶ۫") ^ i4;
                        i5 = ((iM11307 ^ i3) * 30757) ^ (-2014086501);
                        i6 = iM11307 ^ (-1068106943);
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۡܽ")) * (-93);
                        i = ((iM45029 ^ i3) * 27413) ^ 1730872009;
                        i2 = -496510939;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -854223028:
                case 892551158:
                    iM6354 = C1977.m6354(view);
                    sArr2 = f1533;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 2905) ^ (-1832925141);
                        i2 = 1929261955;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-513)) ^ (-60674933);
                        i2 = 1013762216;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -737529132:
                case 1719321915:
                    C1977.m6356();
                    iM45029 = (ThreadFactoryC3888.m11306("᩷᩻") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM45029 ^ i4) * (-18529)) ^ 152803016;
                    i2 = -1027519321;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -647235885:
                case 667758561:
                    c = 0;
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩻") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM45029 ^ i4) * (-18529)) ^ 152803016;
                        i2 = -1027519321;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-13225)) ^ 1549884028;
                        i2 = 1062301283;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -549964751:
                case 1476082807:
                    main.f37.m31493(false);
                    iM45029 = (i4 - C19806.m45029("ۡܽ")) * (-93);
                    i = ((iM45029 ^ i3) * 27413) ^ 1730872009;
                    i2 = -496510939;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -234102341:
                case -234019141:
                    C1025.m3861();
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩻") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM45029 ^ i4) * (-18529)) ^ 152803016;
                        i2 = -1027519321;
                    } else {
                        iM45029 = C19806.m45029("۬ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16037)) ^ 706922169;
                        i2 = -237749834;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -66280792:
                case 200646814:
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("۬ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16037)) ^ 706922169;
                        i2 = -237749834;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM45029 ^ i3) * 13609) ^ 1094777226;
                        i2 = 765369175;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 349201004:
                case 1638566939:
                    i12 = 3;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۜ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM45029 ^ i3) * 13609) ^ 1094777226;
                        i2 = 765369175;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܰ") ^ i3;
                        i = ((iM45029 ^ i4) * (-12419)) ^ 1863343751;
                        i2 = 1400015313;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 521016795:
                case 976893437:
                    i10 = 49286;
                    iM45029 = (C19806.m45029("ۢܰ") + i3) * (-83);
                    i = ((iM45029 ^ i4) * (-13101)) ^ 208375540;
                    i2 = -1430902513;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 905349150:
                case 1500979094:
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۤ") ^ i4;
                        i = ((iM45029 ^ i3) * 31591) ^ (-840546122);
                        i2 = 516842873;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩻") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM45029 ^ i4) * (-18529)) ^ 152803016;
                        i2 = -1027519321;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("۬ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16037)) ^ 706922169;
                        i2 = -237749834;
                    } else {
                        iM45029 = C19806.m45029("᩺ۢ") ^ i3;
                        i = ((iM45029 ^ i4) * 15095) ^ 1965032284;
                        i2 = 845908860;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x04ae A[PHI: r2 r4 r17 r19 r20 r21 r22
      0x04ae: PHI (r2v52 int) = (r2v24 int), (r2v25 int), (r2v39 int), (r2v42 int), (r2v54 int) binds: [B:104:0x04ac, B:100:0x0488, B:76:0x0318, B:72:0x02e0, B:14:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r4v37 int) = (r4v17 int), (r4v18 int), (r4v27 int), (r4v28 int), (r4v38 int) binds: [B:104:0x04ac, B:100:0x0488, B:76:0x0318, B:72:0x02e0, B:14:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r17v8 short[]) = (r17v2 short[]), (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:104:0x04ac, B:100:0x0488, B:76:0x0318, B:72:0x02e0, B:14:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r19v25 int) = (r19v3 int), (r19v4 int), (r19v14 int), (r19v17 int), (r19v26 int) binds: [B:104:0x04ac, B:100:0x0488, B:76:0x0318, B:72:0x02e0, B:14:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r20v20 int) = (r20v2 int), (r20v2 int), (r20v6 int), (r20v10 int), (r20v2 int) binds: [B:104:0x04ac, B:100:0x0488, B:76:0x0318, B:72:0x02e0, B:14:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r21v24 short[]) = (r21v3 short[]), (r21v4 short[]), (r21v15 short[]), (r21v18 short[]), (r21v25 short[]) binds: [B:104:0x04ac, B:100:0x0488, B:76:0x0318, B:72:0x02e0, B:14:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r22v9 int) = (r22v2 int), (r22v2 int), (r22v2 int), (r22v4 int), (r22v2 int) binds: [B:104:0x04ac, B:100:0x0488, B:76:0x0318, B:72:0x02e0, B:14:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0209  */
    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerSlide(View view, float f) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5;
        this = this;
        view = view;
        int i6 = RunnableC1606.f6488;
        int i7 = C1066.f4915;
        int iM11306 = ThreadFactoryC3888.m11306("ۙۤ") ^ i7;
        int i8 = ((iM11306 ^ i6) * (-8693)) ^ 2128752562;
        Main main = null;
        C6938 c6938 = null;
        C6606 c6606 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM11306 ^ (-1531940709);
        int i10 = 0;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        int iM6354 = 0;
        float interpolation = 0.0f;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int iM450211 = 0;
        int iM6355 = 0;
        int i15 = 648943358;
        int i16 = 0;
        short[] sArr3 = null;
        int i17 = 0;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i6) * (-8571)) >> 31));
            switch (i15) {
                case -2029315451:
                case 1144200624:
                    if (this.f1537) {
                        iM45029 = C19806.m45029("ۚ֫") ^ i7;
                        i = ((iM45029 ^ i6) * (-11869)) ^ 637560907;
                        i2 = 1012177422;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۚ") ^ i6;
                        i = ((iM45029 ^ i7) * (-1293)) ^ (-138175590);
                        i2 = -681787936;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -2016715552:
                case 462136991:
                    C1460.m5050();
                    if (C1025.f4800 < 0) {
                        iM45029 = C19806.m45029("᩸ܳ") ^ i7;
                        i = ((iM45029 ^ i6) * (-27961)) ^ 719924702;
                        i2 = 2046767371;
                        i9 = iM45029 ^ i2;
                        i8 = i;
                    } else {
                        i14 = i14;
                        int iM450212 = C19806.m45029("᩸ۗ") ^ i6;
                        i3 = ((iM450212 ^ i7) * 7959) ^ (-443512671);
                        i9 = iM450212 ^ 1930350299;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    }
                    break;
                case -1932272421:
                case -937807174:
                    i14 = i14;
                    int i18 = i16;
                    iM6355 = C1977.m6354(view);
                    sArr = f1533;
                    i13 = 9;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        i16 = i18;
                        int iM450213 = C19806.m45029("᩸ۗ") ^ i6;
                        i3 = ((iM450213 ^ i7) * 7959) ^ (-443512671);
                        i9 = iM450213 ^ 1930350299;
                        i14 = i14;
                    } else {
                        int iM450214 = (C19806.m45029("ۢۙ") + i7) * (-25);
                        i3 = ((iM450214 ^ i6) * (-17553)) ^ 416245242;
                        i9 = iM450214 ^ (-2038722889);
                        this = this;
                        i14 = i14;
                        i16 = i18;
                    }
                    i8 = i3;
                    view = view;
                    break;
                case -1897041249:
                case -327422159:
                    iM6354 = C1977.m6354(view);
                    sArr2 = f1533;
                    i17 = 12;
                    i10 = 3;
                    if (C0278.m1789() > 0) {
                        iM45029 = C19806.m45029("ۖᩴ") ^ i7;
                        i = ((iM45029 ^ i6) * 2997) ^ (-419402597);
                        i2 = 929391062;
                        i9 = iM45029 ^ i2;
                        i8 = i;
                    } else {
                        i14 = i14;
                        int iM450215 = C19806.m45029("᩸ۗ") ^ i6;
                        i3 = ((iM450215 ^ i7) * 7959) ^ (-443512671);
                        i9 = iM450215 ^ 1930350299;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    }
                    break;
                case -1858811256:
                case 641982822:
                    i11 = 12070;
                    iM450210 = C19806.m45029("ۤۤ") ^ i6;
                    i13 = i13;
                    i3 = ((iM450210 ^ i7) * (-8695)) ^ (-404816249);
                    i4 = 1661261443;
                    i9 = iM450210 ^ i4;
                    i16 = i16;
                    iM6355 = iM6355;
                    sArr = sArr;
                    i14 = i14;
                    i8 = i3;
                    view = view;
                    break;
                case -1772022361:
                case -1698694197:
                    if (!C1377.f5749) {
                        i14 = i14;
                        int iM450216 = C19806.m45029("᩸ۗ") ^ i6;
                        i3 = ((iM450216 ^ i7) * 7959) ^ (-443512671);
                        i9 = iM450216 ^ 1930350299;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۘ") ^ i6;
                        i = ((iM45029 ^ i7) * (-11689)) ^ 851712386;
                        i2 = 1286546482;
                        i9 = iM45029 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1762526124:
                case -228010181:
                    sArr = sArr;
                    int i19 = i13;
                    iM6355 = iM6355;
                    i16 = i16;
                    if (RunnableC3388.m10064()) {
                        int iM450217 = C19806.m45029("᩶ۘ") ^ i6;
                        i9 = iM450217 ^ 1059930945;
                        i8 = ((iM450217 ^ i7) * 5889) ^ 1064546642;
                        i13 = i19;
                        i16 = i16;
                        iM6355 = iM6355;
                        sArr = sArr;
                        i14 = 3;
                        this = this;
                    } else {
                        i13 = i19;
                        i14 = 3;
                        iM450210 = C19806.m45029("ۙۨ") ^ i7;
                        i3 = ((iM450210 ^ i6) * 11385) ^ (-634358211);
                        i4 = -203560986;
                        i9 = iM450210 ^ i4;
                        i16 = i16;
                        iM6355 = iM6355;
                        sArr = sArr;
                        i14 = i14;
                        i8 = i3;
                    }
                    view = view;
                    break;
                case -1663425700:
                case 1712016402:
                    C1460.m5050();
                    C1189.m4368();
                    iM45029 = C19806.m45029("֫۟") ^ i7;
                    i = ((iM45029 ^ i6) * 24595) ^ 1661792502;
                    i2 = -1153259120;
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1552399142:
                case 1384363474:
                    if (!C1977.m6356()) {
                        i14 = i14;
                        int iM450218 = C19806.m45029("᩸ۗ") ^ i6;
                        i3 = ((iM450218 ^ i7) * 7959) ^ (-443512671);
                        i9 = iM450218 ^ 1930350299;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    } else {
                        iM45029 = C19806.m45029("֫۟") ^ i7;
                        i = ((iM45029 ^ i6) * 24595) ^ 1661792502;
                        i2 = -1153259120;
                        i9 = iM45029 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1523956628:
                case -232682966:
                    RunnableC1895.m6165(c6606, 4);
                    this.f1537 = z2;
                    break;
                case -1516511717:
                case 473965534:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C3577.f13150 >= 0) {
                        i14 = i14;
                        i16 = i16;
                        sArr = sArr;
                        iM6355 = iM6355;
                        iM450210 = C19806.m45029("ۙۨ") ^ i7;
                        i3 = ((iM450210 ^ i6) * 11385) ^ (-634358211);
                        i4 = -203560986;
                        i9 = iM450210 ^ i4;
                        i16 = i16;
                        iM6355 = iM6355;
                        sArr = sArr;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    }
                    i14 = i14;
                    int iM450219 = C19806.m45029("᩸ۗ") ^ i6;
                    i3 = ((iM450219 ^ i7) * 7959) ^ (-443512671);
                    i9 = iM450219 ^ 1930350299;
                    i14 = i14;
                    i8 = i3;
                    view = view;
                    break;
                case -1375195207:
                case 1211200622:
                    if (this.f1537) {
                        iM45029 = C19806.m45029("᩶ܰ") ^ i6;
                        i = ((iM45029 ^ i7) * 7441) ^ 1481368522;
                        i2 = 1258203598;
                    } else {
                        iM45029 = C19806.m45029("ۚ֫") ^ i7;
                        i = ((iM45029 ^ i6) * (-11869)) ^ 637560907;
                        i2 = 1012177422;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1325175503:
                case 1302356849:
                    c6938 = main.f41645;
                    interpolation = this.f1535.getInterpolation(f2 - f);
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = (i6 - C19806.m45029("ᩴ֡")) * (-31);
                        i = ((iM45029 ^ i7) * 18173) ^ 551507403;
                        i2 = -992446170;
                        i9 = iM45029 ^ i2;
                        i8 = i;
                    } else {
                        i14 = i14;
                        int iM4502110 = C19806.m45029("᩸ۗ") ^ i6;
                        i3 = ((iM4502110 ^ i7) * 7959) ^ (-443512671);
                        i9 = iM4502110 ^ 1930350299;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    }
                    break;
                case -1091959327:
                case 228328029:
                    if (f == 0.0f) {
                        iM45029 = C19806.m45029("ܶ᩺") ^ i7;
                        i = ((iM45029 ^ i6) * 14769) ^ (-1607131144);
                        i2 = -1766303981;
                    } else {
                        iM45029 = C19806.m45029("ۚ֫") ^ i7;
                        i = ((iM45029 ^ i6) * (-11869)) ^ 637560907;
                        i2 = 1012177422;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1056144674:
                case 139662803:
                    i14 = i14;
                    i16 = i16;
                    sArr = sArr;
                    iM6355 = iM6355;
                    if (C0050.m946() <= 0) {
                        iM450210 = C19806.m45029("ۙۨ") ^ i7;
                        i3 = ((iM450210 ^ i6) * 11385) ^ (-634358211);
                        i4 = -203560986;
                    } else {
                        iM450210 = C19806.m45029("ۚ۟") ^ i6;
                        i3 = ((iM450210 ^ i7) * (-29795)) ^ 1574714013;
                        i4 = 779323721;
                    }
                    i9 = iM450210 ^ i4;
                    i16 = i16;
                    iM6355 = iM6355;
                    sArr = sArr;
                    i14 = i14;
                    i8 = i3;
                    view = view;
                    break;
                case -1046182700:
                case 2007639118:
                    i14 = i14;
                    i16 = i16;
                    sArr = sArr;
                    iM6355 = iM6355;
                    sArr3 = f1533;
                    if (C3535.f13026 <= 0) {
                        iM450210 = C19806.m45029("ۙۨ") ^ i7;
                        i3 = ((iM450210 ^ i6) * 11385) ^ (-634358211);
                        i4 = -203560986;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܳ۫") ^ i7;
                        i3 = ((iM450210 ^ i6) * 7655) ^ (-1517521598);
                        i4 = 16729024;
                    }
                    i9 = iM450210 ^ i4;
                    i16 = i16;
                    iM6355 = iM6355;
                    sArr = sArr;
                    i14 = i14;
                    i8 = i3;
                    view = view;
                    break;
                case -1029608587:
                case 1389995750:
                    if (iM6354 == (C19806.m45029(C2249.m6918(sArr2, i17, i10, i11)) ^ 2118194324)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴᩳ") ^ i7) * 11;
                        i = ((iM45029 ^ i6) * 32731) ^ (-1925094198);
                        i2 = 633141203;
                    } else {
                        iM45029 = C19806.m45029("ۚ֫") ^ i7;
                        i = ((iM45029 ^ i6) * (-11869)) ^ 637560907;
                        i2 = 1012177422;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -935126026:
                case 1698925750:
                    i14 = i14;
                    i16 = i16;
                    sArr = sArr;
                    iM6355 = iM6355;
                    s = sArr3[8];
                    if (C7105.f23796 >= 0) {
                        iM450210 = (C19806.m45029("᩷᩺") ^ i6) * (-67);
                        i3 = ((iM450210 ^ i7) * (-17435)) ^ (-509545670);
                        i4 = 550997520;
                    } else {
                        iM450210 = C19806.m45029("֡ۗ") ^ i6;
                        i3 = ((iM450210 ^ i7) * 4845) ^ 214605898;
                        i4 = -1734606545;
                    }
                    i9 = iM450210 ^ i4;
                    i16 = i16;
                    iM6355 = iM6355;
                    sArr = sArr;
                    i14 = i14;
                    i8 = i3;
                    view = view;
                    break;
                case -887499893:
                case 2001429153:
                    i14 = i14;
                    i16 = i16;
                    sArr = sArr;
                    iM6355 = iM6355;
                    short s2 = s;
                    int i20 = s2 + 19067;
                    i12 = i20 * i20;
                    if (C0671.f2816 == 0) {
                        int iM11307 = ThreadFactoryC3888.m11306("ۚ۠") ^ i7;
                        s = s2;
                        i5 = ((iM11307 ^ i6) * 7723) ^ (-982030811);
                        i9 = iM11307 ^ 671983976;
                        i16 = i16;
                        iM6355 = iM6355;
                        sArr = sArr;
                        i14 = i14;
                        i8 = i5;
                        this = this;
                    } else {
                        s = s2;
                        iM450210 = (C19806.m45029("᩷᩺") ^ i6) * (-67);
                        i3 = ((iM450210 ^ i7) * (-17435)) ^ (-509545670);
                        i4 = 550997520;
                        i9 = iM450210 ^ i4;
                        i16 = i16;
                        iM6355 = iM6355;
                        sArr = sArr;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    }
                    break;
                case -856197377:
                case -740167986:
                    i11 = 12668;
                    iM450210 = C19806.m45029("ۤۤ") ^ i6;
                    i13 = i13;
                    i3 = ((iM450210 ^ i7) * (-8695)) ^ (-404816249);
                    i4 = 1661261443;
                    i9 = iM450210 ^ i4;
                    i16 = i16;
                    iM6355 = iM6355;
                    sArr = sArr;
                    i14 = i14;
                    i8 = i3;
                    view = view;
                    break;
                case -788943173:
                case 462950269:
                    short[] sArr4 = sArr;
                    int i21 = i13;
                    i14 = i14;
                    iM6355 = iM6355;
                    i16 = i16;
                    iM450211 = C19806.m45029(C1377.m4832(sArr4, i21, i14, i11));
                    if (C3286.m9798() > 0) {
                        int iM450220 = C19806.m45029("᩵ۘ") ^ i7;
                        i5 = ((iM450220 ^ i6) * 8707) ^ (-1288083194);
                        i9 = iM450220 ^ 1687618044;
                        i13 = i21;
                        i16 = i16;
                        iM6355 = iM6355;
                        sArr = sArr4;
                        i14 = i14;
                        i8 = i5;
                        this = this;
                    } else {
                        sArr = sArr4;
                        i13 = i21;
                        iM450210 = C19806.m45029("ۙۨ") ^ i7;
                        i3 = ((iM450210 ^ i6) * 11385) ^ (-634358211);
                        i4 = -203560986;
                        i9 = iM450210 ^ i4;
                        i16 = i16;
                        iM6355 = iM6355;
                        sArr = sArr;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    }
                    break;
                case -613283437:
                case -217807751:
                    main.f50.m40493(z ? 1 : 0, view);
                    iM45029 = C19806.m45029("ۚ֫") ^ i7;
                    i = ((iM45029 ^ i6) * (-11869)) ^ 637560907;
                    i2 = 1012177422;
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -5865654:
                case 990454767:
                    main.f50.m40493(z2 ? 1 : 0, view);
                    break;
                case 19403665:
                case 994779784:
                    int i22 = iM6355;
                    i16 = iM450211 ^ 2123223638;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM6355 = i22;
                        i14 = i14;
                        z = true;
                        int iM4502111 = C19806.m45029("᩸ۗ") ^ i6;
                        i3 = ((iM4502111 ^ i7) * 7959) ^ (-443512671);
                        i9 = iM4502111 ^ 1930350299;
                        i14 = i14;
                        i8 = i3;
                        view = view;
                    } else {
                        int iM450221 = C19806.m45029("᩺۬") ^ i6;
                        i9 = iM450221 ^ (-67338244);
                        iM6355 = i22;
                        i8 = ((iM450221 ^ i7) * 21541) ^ 1119687548;
                        z = true;
                    }
                    break;
                case 161960303:
                case 1508403569:
                    break;
                case 338203286:
                case 937436542:
                    main = this.f1534;
                    int i23 = iM6355;
                    int i24 = i16;
                    if (i23 == i24) {
                        int iM11308 = (i6 - ThreadFactoryC3888.m11306("֡᩵")) * (-101);
                        int i25 = ((iM11308 ^ i7) * (-30001)) ^ 1002977662;
                        i16 = i24;
                        i9 = iM11308 ^ 763881085;
                        z2 = false;
                        iM6355 = i23;
                        i8 = i25;
                        f2 = 1.0f;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("֨ۨ") ^ i7) * (-37);
                        iM6355 = i23;
                        i16 = i24;
                        i9 = iM11309 ^ (-984511291);
                        i8 = ((iM11309 ^ i6) * (-19737)) ^ (-724603680);
                        f2 = 1.0f;
                        z2 = false;
                    }
                    break;
                case 798043662:
                case 948678883:
                    RunnableC1895.m6165(c6606, z2 ? 1 : 0);
                    this.f1537 = z;
                    break;
                case 832081645:
                case 2140077111:
                    C1460.m5046(c6938, interpolation);
                    c6606 = this.f1536;
                    if (f > 0.7f) {
                        iM45029 = C19806.m45029("۟ܿ") ^ i7;
                        i = ((iM45029 ^ i6) * (-30217)) ^ 1502675853;
                        i2 = 764248384;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ܶۘ")) * (-25);
                        i = ((iM45029 ^ i7) * (-3271)) ^ (-409828799);
                        i2 = 319397631;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case 1022661651:
                case 2055576168:
                    if (f == f2) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۠") ^ i7) * 75;
                        i = ((iM45029 ^ i6) * (-8207)) ^ 1104800795;
                        i2 = 838710028;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܺ") + i6) * 115;
                        i = ((iM45029 ^ i7) * 6515) ^ (-1100758851);
                        i2 = 11680820;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case 1184196917:
                case 1303468864:
                    i14 = i14;
                    i16 = i16;
                    sArr = sArr;
                    iM6355 = iM6355;
                    if ((76268 * s) - i12 > 0) {
                        iM450210 = (C19806.m45029("ܺۗ") + i7) * (-71);
                        i3 = ((iM450210 ^ i6) * 14665) ^ 910127922;
                        i4 = 460428797;
                    } else {
                        iM450210 = (C19806.m45029("ۚۖ") + i6) * (-47);
                        i3 = ((iM450210 ^ i7) * 6403) ^ (-473828288);
                        i4 = -780882126;
                    }
                    i9 = iM450210 ^ i4;
                    i16 = i16;
                    iM6355 = iM6355;
                    sArr = sArr;
                    i14 = i14;
                    i8 = i3;
                    view = view;
                    break;
                default:
                    C1461.m5080();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0280 A[PHI: r5 r6 r8 r17 r18
      0x0280: PHI (r5v5 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:70:0x027e, B:62:0x0242, B:54:0x0203, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r6v5 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:70:0x027e, B:62:0x0242, B:54:0x0203, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r8v5 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:70:0x027e, B:62:0x0242, B:54:0x0203, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r17v27 bin.mt.plus.Main) = (r17v5 bin.mt.plus.Main), (r17v7 bin.mt.plus.Main), (r17v9 bin.mt.plus.Main), (r17v28 bin.mt.plus.Main) binds: [B:70:0x027e, B:62:0x0242, B:54:0x0203, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r18v6 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:70:0x027e, B:62:0x0242, B:54:0x0203, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02b0 A[PHI: r4 r7 r9 r17
      0x02b0: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:74:0x02ae, B:66:0x0260, B:58:0x0222, B:50:0x01e1, B:21:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:74:0x02ae, B:66:0x0260, B:58:0x0222, B:50:0x01e1, B:21:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:74:0x02ae, B:66:0x0260, B:58:0x0222, B:50:0x01e1, B:21:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r17v18 bin.mt.plus.Main) = 
      (r17v4 bin.mt.plus.Main)
      (r17v6 bin.mt.plus.Main)
      (r17v8 bin.mt.plus.Main)
      (r17v10 bin.mt.plus.Main)
      (r17v20 bin.mt.plus.Main)
     binds: [B:74:0x02ae, B:66:0x0260, B:58:0x0222, B:50:0x01e1, B:21:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (l.C2871.f10837 < 0) goto L14;
     */
    @Override // l.AbstractC0447, l.InterfaceC7503
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawerOpened(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0260.onDrawerOpened(android.view.View):void");
    }

    public C0260(Main main, C6606 c6606) {
        int i = -1827164220;
        int i2 = C10634.f36300;
        int i3 = C2124.f7782;
        this.f1534 = main;
        this.f1536 = c6606;
        int iM45029 = (C19806.m45029("ۘ֨") ^ i2) * (-35);
        int i4 = ((iM45029 ^ i3) * 22211) ^ 444556814;
        int i5 = 374293669;
        while (true) {
            int i6 = iM45029 ^ i5;
            AccelerateInterpolator accelerateInterpolator = null;
            while (true) {
                i = i6 ^ (i4 & (((i ^ i3) * 16277) >> 31));
                switch (i) {
                    case -1686324225:
                    case -1220728986:
                        RunnableC1564.m5345();
                        C2704.m8255();
                        throw new RuntimeException();
                    case -1147376641:
                    case -1068754832:
                        if (C1668.f6641 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("۟ۘ") + i2) * 77;
                            i4 = ((iM45029 ^ i3) * (-14635)) ^ 1405004492;
                            i5 = 1267645548;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("֨ܰ") + i2) * (-55);
                            i4 = ((iM45029 ^ i3) * 19793) ^ 397994841;
                            i5 = 1857697332;
                        }
                        break;
                    case -208238560:
                    case 1657104587:
                        if (C0671.f2816 == 0) {
                            iM45029 = C19806.m45029("ۜ֨") ^ i3;
                            i4 = ((iM45029 ^ i2) * 11115) ^ (-706504208);
                            i5 = 1610157124;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ܳ֫") ^ i3;
                            i4 = ((iM45029 ^ i2) * (-6399)) ^ 1238357303;
                            i5 = -1210615133;
                        }
                        break;
                    case -199126070:
                    case 1298817768:
                        if (RunnableC3388.m10064() && !C7105.m18985() && !C3286.f12186 && CallableC1627.f6528) {
                            if (C7105.f23796 >= 0) {
                                iM45029 = C19806.m45029("ۜ֨") ^ i3;
                                i4 = ((iM45029 ^ i2) * 11115) ^ (-706504208);
                                i5 = 1610157124;
                            } else if (C1977.m6356()) {
                                iM45029 = (ThreadFactoryC3888.m11306("۟ۘ") + i2) * 77;
                                i4 = ((iM45029 ^ i3) * (-14635)) ^ 1405004492;
                                i5 = 1267645548;
                            } else if (C1189.f5284 <= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("ܳ֫") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-6399)) ^ 1238357303;
                                i5 = -1210615133;
                            } else if (RunnableC0195.f1321 < 0) {
                                if (C2477.f9839 > 0) {
                                    accelerateInterpolator = new AccelerateInterpolator(0.4f);
                                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                                        int iM11306 = (i3 - ThreadFactoryC3888.m11306("֫֨")) * (-95);
                                        i4 = ((iM11306 ^ i2) * 20107) ^ 474435914;
                                        i6 = iM11306 ^ (-2137905011);
                                        break;
                                    }
                                }
                                iM45029 = ThreadFactoryC3888.m11306("۫᩸") ^ i2;
                                i4 = ((iM45029 ^ i3) * (-11735)) ^ (-403424642);
                                i5 = 1284670630;
                            }
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("֨ܰ") + i2) * (-55);
                        i4 = ((iM45029 ^ i3) * 19793) ^ 397994841;
                        i5 = 1857697332;
                        break;
                    case 488548323:
                    case 1383599902:
                        this.f1535 = accelerateInterpolator;
                        this.f1537 = true;
                        return;
                    case 677531651:
                    case 1461624727:
                        if (RunnableC1606.f6488 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ܳ֫") ^ i3;
                            i4 = ((iM45029 ^ i2) * (-6399)) ^ 1238357303;
                            i5 = -1210615133;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("۟ۘ") + i2) * 77;
                            i4 = ((iM45029 ^ i3) * (-14635)) ^ 1405004492;
                            i5 = 1267645548;
                        }
                        break;
                    default:
                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                        iM45029 = (ThreadFactoryC3888.m11306("֨ܰ") + i2) * (-55);
                        i4 = ((iM45029 ^ i3) * 19793) ^ 397994841;
                        i5 = 1857697332;
                        break;
                }
            }
        }
    }
}
