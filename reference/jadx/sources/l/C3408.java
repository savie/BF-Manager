package l;

import android.animation.Animator;
import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۗᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3408 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۛۨ᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f12582 = {1542, -2076, -2069, -2068, -2072, -2076, -2063, -2068, -2070, -2069, 3808, -11368, -11369, -11376, -11372, -11368, -11379, -11376, -11370, -11369, -11368, -11371, -11383, -11375, -11368, 8117, 21258, 21253, 21250, 21254, 21258, 21279, 21250, 21252, 21253, 6008, 31861, 31866, 31869, 31865, 31861, 31840, 31869, 31867, 31866};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f12583;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f12584;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14015 f12585;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f12586;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f12587;

    /* JADX WARN: Code duplicated, block: B:52:0x01c7 A[PHI: r2 r3 r4 r7 r9 r10 r17
      0x01c7: PHI (r2v4 short) = (r2v2 short), (r2v1 short), (r2v1 short), (r2v1 short) binds: [B:7:0x0042, B:48:0x01a7, B:39:0x0148, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r3v4 short) = (r3v2 short), (r3v1 short), (r3v1 short), (r3v1 short) binds: [B:7:0x0042, B:48:0x01a7, B:39:0x0148, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r4v8 int) = (r4v2 int), (r4v6 int), (r4v1 int), (r4v1 int) binds: [B:7:0x0042, B:48:0x01a7, B:39:0x0148, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r7v4 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:7:0x0042, B:48:0x01a7, B:39:0x0148, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r9v3 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v4 short[]) binds: [B:7:0x0042, B:48:0x01a7, B:39:0x0148, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v4 int) binds: [B:7:0x0042, B:48:0x01a7, B:39:0x0148, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r17v8 int) = (r17v2 int), (r17v3 int), (r17v4 int), (r17v9 int) binds: [B:7:0x0042, B:48:0x01a7, B:39:0x0148, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0251 A[PHI: r11 r16 r17 r18
      0x0251: PHI (r11v10 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:63:0x024f, B:59:0x022f, B:25:0x0088, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r16v6 short[]) = (r16v1 short[]), (r16v2 short[]), (r16v1 short[]), (r16v1 short[]) binds: [B:63:0x024f, B:59:0x022f, B:25:0x0088, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r17v25 int) = (r17v11 int), (r17v12 int), (r17v17 int), (r17v26 int) binds: [B:63:0x024f, B:59:0x022f, B:25:0x0088, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r18v31 int) = (r18v15 int), (r18v16 int), (r18v21 int), (r18v32 int) binds: [B:63:0x024f, B:59:0x022f, B:25:0x0088, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (l.C2477.f9839 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (l.C1461.m5080() == false) goto L17;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationRepeat(android.animation.Animator r20) {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3408.onAnimationRepeat(android.animation.Animator):void");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0255 A[PHI: r2 r9 r10 r11
      0x0255: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:61:0x023d, B:50:0x01b7, B:14:0x006f, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r9v3 char) = (r9v2 char), (r9v2 char), (r9v2 char), (r9v4 char) binds: [B:61:0x023d, B:50:0x01b7, B:14:0x006f, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:61:0x023d, B:50:0x01b7, B:14:0x006f, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:61:0x023d, B:50:0x01b7, B:14:0x006f, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        if (l.C0629.f2722 <= 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationEnd(android.animation.Animator r22) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3408.onAnimationEnd(android.animation.Animator):void");
    }

    public C3408(View view, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356, C14015 c14015, View view2) {
        int i = -563911392;
        int i2 = RunnableC1606.f6488;
        int i3 = C1937.f7317;
        int iM45029 = C19806.m45029("᩺ۛ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 8743) ^ 1053292682;
        int i5 = 824435582;
        while (true) {
            i = ((((i ^ i3) * (-22803)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2123216902:
                case -1664106897:
                    C2249.m6915();
                    throw new RuntimeException();
                case -2113105946:
                case -1854128764:
                    this.f12585 = c14015;
                    this.f12586 = view2;
                    return;
                case -1655237078:
                case 1408655877:
                    if (C10634.m26820()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ᩵")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-2493)) ^ 1181845335;
                        i5 = 1253393733;
                    } else {
                        iM45029 = C19806.m45029("ۤᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20019)) ^ (-957024470);
                        i5 = -202211391;
                    }
                    break;
                case -1620379406:
                case 1519781062:
                    C0216.m1591();
                    C0278.m1789();
                    iM45029 = (i2 - C19806.m45029("ۢۘ")) * 45;
                    i4 = ((iM45029 ^ i3) * (-28763)) ^ (-1296705722);
                    i5 = -1274695659;
                    break;
                case -1309426174:
                case 472209673:
                    if (C3660.m10791() != 0) {
                        iM45029 = (i2 - C19806.m45029("ۢۘ")) * 45;
                        i4 = ((iM45029 ^ i3) * (-28763)) ^ (-1296705722);
                        i5 = -1274695659;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩸ۖ")) * (-13);
                        i4 = ((iM45029 ^ i3) * 19091) ^ 1670330780;
                        i5 = -1077959718;
                    }
                    break;
                case -1303324486:
                case 1080288156:
                    if (!CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ᩴۡ") + i2) * 47;
                        i4 = ((iM45029 ^ i3) * 30977) ^ 897292118;
                        i5 = -1116370889;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17819)) ^ (-427477926);
                        i5 = -1322693944;
                    }
                    break;
                case -1269970148:
                case -518189044:
                    if (C1189.f5284 > 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ᩵")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-2493)) ^ 1181845335;
                        i5 = 1253393733;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۢۘ")) * 45;
                        i4 = ((iM45029 ^ i3) * (-28763)) ^ (-1296705722);
                        i5 = -1274695659;
                    }
                    break;
                case -1071745071:
                case -145705141:
                    if (C3286.f12186) {
                        iM45029 = (C19806.m45029("ᩴۡ") + i2) * 47;
                        i4 = ((iM45029 ^ i3) * 30977) ^ 897292118;
                        i5 = -1116370889;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۚۢ")) * (-83);
                        i4 = ((iM45029 ^ i2) * (-16113)) ^ 1726849432;
                        i5 = -1042586620;
                    }
                    break;
                case -622251924:
                case 996087494:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17819)) ^ (-427477926);
                        i5 = -1322693944;
                    } else {
                        iM45029 = (C19806.m45029("۫᩸") + i3) * (-39);
                        i4 = ((iM45029 ^ i2) * (-25389)) ^ (-1422795997);
                        i5 = 2132053978;
                    }
                    break;
                case -554234361:
                case 1880171905:
                    this.f12583 = view;
                    this.f12584 = abstractActivityC12483;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ᩵")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-2493)) ^ 1181845335;
                        i5 = 1253393733;
                    } else {
                        iM45029 = C19806.m45029("ۗۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14613) ^ (-1622656225);
                        i5 = -163681849;
                    }
                    break;
                case -224250139:
                case 1764878224:
                    if (C1025.m3861() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22787)) ^ 1357928905;
                        i5 = 1508662585;
                    } else {
                        iM45029 = C19806.m45029("ܰᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30037) ^ 1276669315;
                        i5 = -667816113;
                    }
                    break;
                case -140486176:
                case 864904038:
                    this.f12587 = dialogInterfaceC19356;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22787)) ^ 1357928905;
                        i5 = 1508662585;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩵ۧ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i3) * 10061) ^ 1158183273;
                        i5 = 1817425758;
                    }
                    break;
                case 24444725:
                case 1452976026:
                    if (C2249.m6915() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17819)) ^ (-427477926);
                        i5 = -1322693944;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۢۘ")) * 45;
                        i4 = ((iM45029 ^ i3) * (-28763)) ^ (-1296705722);
                        i5 = -1274695659;
                    }
                    break;
                case 329288979:
                case 880622300:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ᩵")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-2493)) ^ 1181845335;
                        i5 = 1253393733;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4353)) ^ 987355174;
                        i5 = 893257845;
                    }
                    break;
                case 1837873428:
                case 2006562833:
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22787)) ^ 1357928905;
                        i5 = 1508662585;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽ۟")) * (-45);
                        i4 = ((iM45029 ^ i2) * 8501) ^ 1948088370;
                        i5 = -2086105246;
                    }
                    break;
                default:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (C19806.m45029("ᩴۡ") + i2) * 47;
                        i4 = ((iM45029 ^ i3) * 30977) ^ 897292118;
                        i5 = -1116370889;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18081)) ^ (-457046200);
                        i5 = 411549000;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01d1 A[PHI: r9 r10 r12 r13 r14 r18 r20
      0x01d1: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:50:0x01cf, B:40:0x0155, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:50:0x01cf, B:40:0x0155, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:50:0x01cf, B:40:0x0155, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:50:0x01cf, B:40:0x0155, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:50:0x01cf, B:40:0x0155, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r18v20 char) = (r18v8 char), (r18v11 char), (r18v21 char) binds: [B:50:0x01cf, B:40:0x0155, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r20v20 short) = (r20v6 short), (r20v9 short), (r20v21 short) binds: [B:50:0x01cf, B:40:0x0155, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int i5;
        int iM45029;
        int i6;
        int i7;
        int i8 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i9 = C1025.f4800;
        int iM450210 = C19806.m45029("ܽۨ") ^ i9;
        int i10 = ((iM450210 ^ i8) * 20471) ^ 1349560437;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM450210 ^ 1747876468;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1686761338;
        View view = null;
        String strM8172 = null;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i8) * 6123) >> 31));
            switch (i18) {
                case -2130638825:
                case 1326523165:
                    c = c;
                    s2 = s2;
                    strM8172 = C2642.m8172(sArr2, i16, i17, i15);
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("᩵ۜ") ^ i9;
                        i = ((iM11306 ^ i8) * (-28717)) ^ 2050813242;
                        i2 = -1402590309;
                    } else {
                        iM11306 = C19806.m45029("ۘۘ") ^ i8;
                        i = ((iM11306 ^ i9) * (-15593)) ^ (-1454087185);
                        i2 = 1300865039;
                    }
                    i5 = iM11306 ^ i2;
                    i10 = i;
                    c = c;
                    s2 = s2;
                    i11 = i5;
                    break;
                case -1717081343:
                case 875455531:
                    c = c;
                    s2 = s2;
                    i13 = i12 * i12;
                    i14 = s * 2;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ۗۖ") ^ i8;
                        i = ((iM11306 ^ i9) * 8663) ^ (-47019115);
                        i2 = -697499048;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۗ") ^ i8;
                        i = ((iM11306 ^ i9) * (-22733)) ^ (-1862160806);
                        i2 = 1552741453;
                    }
                    i5 = iM11306 ^ i2;
                    i10 = i;
                    c = c;
                    s2 = s2;
                    i11 = i5;
                    break;
                case -1689429947:
                case -1035880143:
                    c = c;
                    C14015 c14015 = this.f12585;
                    if (!CallableC1627.f6528) {
                        s2 = s2;
                        iM11306 = C19806.m45029("᩵ۜ") ^ i9;
                        i = ((iM11306 ^ i8) * (-28717)) ^ 2050813242;
                        i2 = -1402590309;
                        i5 = iM11306 ^ i2;
                        i10 = i;
                        c = c;
                        s2 = s2;
                        i11 = i5;
                    } else {
                        C21950 c21950 = new C21950(c14015);
                        if (C1066.f4915 > 0) {
                            s2 = s2;
                            new ViewOnClickListenerC23871(this.f12584, this.f12587, view, c21950);
                            C2332.m7086(view, view);
                            iM11306 = C19806.m45029("۟ܿ") ^ i9;
                            i = ((iM11306 ^ i8) * (-17225)) ^ 899118753;
                            i2 = 224897714;
                            i5 = iM11306 ^ i2;
                            i10 = i;
                            c = c;
                            s2 = s2;
                            i11 = i5;
                        } else {
                            iM11307 = (C19806.m45029("ۘۢ") ^ i8) * (-5);
                            i3 = ((iM11307 ^ i9) * (-16817)) ^ 1367384971;
                            i4 = -1442710023;
                            i5 = iM11307 ^ i4;
                            i10 = i3;
                            c = c;
                            i11 = i5;
                        }
                    }
                    break;
                case -1624566508:
                case 563767428:
                    c = c;
                    s2 = s2;
                    if ((i14 + 1) - i13 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩹") ^ i9;
                        i = ((iM11306 ^ i8) * 16827) ^ (-1543541790);
                        i2 = -237757487;
                    } else {
                        iM11306 = C19806.m45029("᩸᩻") ^ i8;
                        i = ((iM11306 ^ i9) * (-22861)) ^ (-374389068);
                        i2 = 117080692;
                    }
                    i5 = iM11306 ^ i2;
                    i10 = i;
                    c = c;
                    s2 = s2;
                    i11 = i5;
                    break;
                case -1244007732:
                case -690780336:
                    c = c;
                    s2 = s2;
                    sArr2 = f12582;
                    i16 = 36;
                    i17 = 9;
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۗ") ^ i8;
                        i = ((iM11306 ^ i9) * (-22733)) ^ (-1862160806);
                        i2 = 1552741453;
                    } else {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ۢ֡")) * (-29);
                        i = ((iM11306 ^ i9) * (-6559)) ^ (-1897245671);
                        i2 = -66935263;
                    }
                    i5 = iM11306 ^ i2;
                    i10 = i;
                    c = c;
                    s2 = s2;
                    i11 = i5;
                    break;
                case -1197512208:
                case -480272204:
                    c = c;
                    s2 = s2;
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("ۤ᩸") ^ i9;
                        i = ((iM11306 ^ i8) * (-28771)) ^ 821797409;
                        i2 = -1127523126;
                        i5 = iM11306 ^ i2;
                        i10 = i;
                        c = c;
                        s2 = s2;
                        i11 = i5;
                    }
                    s2 = s2;
                    iM11307 = (C19806.m45029("ۘۢ") ^ i8) * (-5);
                    i3 = ((iM11307 ^ i9) * (-16817)) ^ 1367384971;
                    i4 = -1442710023;
                    i5 = iM11307 ^ i4;
                    i10 = i3;
                    c = c;
                    i11 = i5;
                    break;
                case -1161303917:
                case 240051347:
                    C2788.m8472();
                    s2 = s2;
                    iM45029 = ThreadFactoryC3888.m11306("ۘ۠") ^ i8;
                    i6 = ((iM45029 ^ i9) * (-6059)) ^ (-645149686);
                    i7 = -1811602902;
                    i11 = iM45029 ^ i7;
                    i10 = i6;
                    s2 = s2;
                    break;
                case -1106556283:
                case 1000370938:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C1066.f4915 <= 0) {
                        c = c;
                        s2 = s2;
                        iM11306 = C19806.m45029("᩵ۜ") ^ i9;
                        i = ((iM11306 ^ i8) * (-28717)) ^ 2050813242;
                        i2 = -1402590309;
                        i5 = iM11306 ^ i2;
                        i10 = i;
                        c = c;
                        s2 = s2;
                        i11 = i5;
                    } else {
                        s2 = s2;
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۠") ^ i8;
                        i6 = ((iM45029 ^ i9) * (-6059)) ^ (-645149686);
                        i7 = -1811602902;
                        i11 = iM45029 ^ i7;
                        i10 = i6;
                        s2 = s2;
                    }
                    break;
                case -582798159:
                case -421610145:
                    C3535.m10431();
                    C0962.m3746();
                    break;
                case -573144515:
                case -552033384:
                    C3722.m10890(view, 0);
                    C1460.m5046(view, 0.0f);
                    break;
                case -405907755:
                case 678322631:
                    c = c;
                    s2 = s2;
                    i12 = s + s2;
                    if (C0671.f2816 == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۚ") ^ i9;
                        i = ((iM11306 ^ i8) * (-32431)) ^ 284836165;
                        i2 = -459322873;
                        i5 = iM11306 ^ i2;
                        i10 = i;
                        c = c;
                        s2 = s2;
                        i11 = i5;
                    }
                    s2 = s2;
                    iM11307 = (C19806.m45029("ۘۢ") ^ i8) * (-5);
                    i3 = ((iM11307 ^ i9) * (-16817)) ^ 1367384971;
                    i4 = -1442710023;
                    i5 = iM11307 ^ i4;
                    i10 = i3;
                    c = c;
                    i11 = i5;
                    break;
                case -91517438:
                case 365617951:
                    C0050.m946();
                    if (!CallableC1627.f6528) {
                        s2 = s2;
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۠") ^ i8;
                        i6 = ((iM45029 ^ i9) * (-6059)) ^ (-645149686);
                        i7 = -1811602902;
                        i11 = iM45029 ^ i7;
                        i10 = i6;
                        s2 = s2;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ܿ۠") ^ i9;
                        i11 = iM11308 ^ 1786182621;
                        i10 = ((iM11308 ^ i8) * (-12529)) ^ 659869171;
                    }
                    break;
                case 80721564:
                case 1775157047:
                    c = c;
                    s2 = s2;
                    C2704.m8238(animator, strM8172);
                    view = this.f12583;
                    if (view.getTag() == null) {
                        iM11306 = C19806.m45029("᩻᩷") ^ i9;
                        i = ((iM11306 ^ i8) * 1359) ^ 296913780;
                        i2 = 317915810;
                    } else {
                        iM11306 = C19806.m45029("۟ܿ") ^ i9;
                        i = ((iM11306 ^ i8) * (-17225)) ^ 899118753;
                        i2 = 224897714;
                    }
                    i5 = iM11306 ^ i2;
                    i10 = i;
                    c = c;
                    s2 = s2;
                    i11 = i5;
                    break;
                case 306255933:
                case 1337917668:
                    i15 = 9450;
                    iM11306 = C19806.m45029("ܿ᩻") ^ i9;
                    i = ((iM11306 ^ i8) * (-12393)) ^ 134162012;
                    i2 = 107120771;
                    i5 = iM11306 ^ i2;
                    i10 = i;
                    c = c;
                    s2 = s2;
                    i11 = i5;
                    break;
                case 704368488:
                case 2094326867:
                    if (C0050.f912 <= 0) {
                        c = c;
                        s2 = s2;
                        iM11306 = ThreadFactoryC3888.m11306("ۖۗ") ^ i8;
                        i = ((iM11306 ^ i9) * (-22733)) ^ (-1862160806);
                        i2 = 1552741453;
                        i5 = iM11306 ^ i2;
                        i10 = i;
                        c = c;
                        s2 = s2;
                        i11 = i5;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("ܿ۠") ^ i9;
                        i11 = iM11309 ^ 1786182621;
                        i10 = ((iM11309 ^ i8) * (-12529)) ^ 659869171;
                    }
                    break;
                case 1256190166:
                case 1667563201:
                    c = c;
                    s = sArr[c];
                    s2 = 1;
                    if (C0278.m1789() <= 0) {
                        iM11307 = (C19806.m45029("ۘۢ") ^ i8) * (-5);
                        i3 = ((iM11307 ^ i9) * (-16817)) ^ 1367384971;
                        i4 = -1442710023;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۫ۧ") ^ i8;
                        i3 = ((iM11307 ^ i9) * 15267) ^ (-440263918);
                        i4 = -1366800870;
                    }
                    i5 = iM11307 ^ i4;
                    i10 = i3;
                    c = c;
                    i11 = i5;
                    break;
                case 1334636919:
                case 1586432791:
                    s2 = s2;
                    c = '#';
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۠") ^ i8;
                        i6 = ((iM45029 ^ i9) * (-6059)) ^ (-645149686);
                        i7 = -1811602902;
                    } else {
                        iM45029 = (i9 - C19806.m45029("᩻۫")) * 57;
                        i6 = ((iM45029 ^ i8) * (-29489)) ^ 613075195;
                        i7 = 360959494;
                    }
                    i11 = iM45029 ^ i7;
                    i10 = i6;
                    s2 = s2;
                    break;
                case 1369199384:
                case 1819957265:
                    c = c;
                    s2 = s2;
                    sArr = f12582;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i8;
                        i = ((iM11306 ^ i9) * (-17213)) ^ 1149769160;
                        i2 = 399149280;
                        i5 = iM11306 ^ i2;
                        i10 = i;
                        c = c;
                        s2 = s2;
                        i11 = i5;
                    } else {
                        c = c;
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۠") ^ i8;
                        i6 = ((iM45029 ^ i9) * (-6059)) ^ (-645149686);
                        i7 = -1811602902;
                        i11 = iM45029 ^ i7;
                        i10 = i6;
                        s2 = s2;
                    }
                    break;
                default:
                    i15 = 31764;
                    iM11306 = C19806.m45029("ܿ᩻") ^ i9;
                    i = ((iM11306 ^ i8) * (-12393)) ^ 134162012;
                    i2 = 107120771;
                    i5 = iM11306 ^ i2;
                    i10 = i;
                    c = c;
                    s2 = s2;
                    i11 = i5;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dc A[PHI: r10 r11
      0x00dc: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:32:0x00da, B:18:0x006b, B:16:0x0067, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:32:0x00da, B:18:0x006b, B:16:0x0067, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0266 A[PHI: r2 r3 r7 r12 r16
      0x0266: PHI (r2v3 short[]) = (r2v2 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]), (r2v6 short[]) binds: [B:65:0x0264, B:60:0x0235, B:47:0x01a6, B:29:0x00b3, B:14:0x005e, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:65:0x0264, B:60:0x0235, B:47:0x01a6, B:29:0x00b3, B:14:0x005e, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:65:0x0264, B:60:0x0235, B:47:0x01a6, B:29:0x00b3, B:14:0x005e, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r12v8 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:65:0x0264, B:60:0x0235, B:47:0x01a6, B:29:0x00b3, B:14:0x005e, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r16v23 java.lang.String) = 
      (r16v4 java.lang.String)
      (r16v5 java.lang.String)
      (r16v9 java.lang.String)
      (r16v16 java.lang.String)
      (r16v19 java.lang.String)
      (r16v27 java.lang.String)
     binds: [B:65:0x0264, B:60:0x0235, B:47:0x01a6, B:29:0x00b3, B:14:0x005e, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int iM45029;
        int i;
        int i2;
        int i3 = C0629.f2722;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11306 = ThreadFactoryC3888.m11306("۠۠") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-31885)) ^ (-215580792);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 1920673167;
        String strM5502 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -923393490;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 21763) >> 31));
            switch (i12) {
                case -2140039473:
                case -1602129739:
                    strM5502 = strM5502;
                    s3 = 1;
                    if (C2704.m8255() <= 0) {
                        iM45029 = C19806.m45029("ۧ᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-23495)) ^ (-318036012);
                        i2 = -532025588;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩶") ^ i4) * 99;
                        i = ((iM45029 ^ i3) * (-27815)) ^ 359151670;
                        i2 = -1175624343;
                    }
                    String str = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str;
                    break;
                case -2047901274:
                case 1456868500:
                    strM5502 = strM5502;
                    i8 = i7 + 1;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡ֡")) * (-43);
                        i = ((iM45029 ^ i4) * 20227) ^ 1189030862;
                        i2 = -1765615918;
                    } else {
                        iM45029 = C19806.m45029("ܽ۟") ^ i4;
                        i = ((iM45029 ^ i3) * (-11545)) ^ 1151724109;
                        i2 = 25395776;
                    }
                    String str2 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str2;
                    break;
                case -1631352562:
                case 335464437:
                    sArr2 = f12582;
                    i10 = 1;
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("֫ܽ") + i4) * (-123);
                        strM5502 = strM5502;
                        i = ((iM45029 ^ i3) * 10585) ^ 1241902547;
                        i2 = 1656548979;
                    } else {
                        strM5502 = strM5502;
                        iM45029 = ThreadFactoryC3888.m11306("ۚܶ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2645)) ^ (-562541669);
                        i2 = -831169002;
                    }
                    String str3 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str3;
                    break;
                case -1575192519:
                case 607459171:
                    C2642.m8171();
                    if (RunnableC0195.f1321 >= 0) {
                        strM5502 = strM5502;
                        iM45029 = C19806.m45029("ۧ᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-23495)) ^ (-318036012);
                        i2 = -532025588;
                    } else {
                        iM45029 = (C19806.m45029("֫ܳ") + i3) * 89;
                        strM5502 = strM5502;
                        i = ((iM45029 ^ i4) * (-5277)) ^ 1985834323;
                        i2 = -1175142082;
                    }
                    String str4 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str4;
                    break;
                case -1493710830:
                case -814857329:
                    strM5502 = strM5502;
                    c = 0;
                    if (C0962.f3784) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡ֡")) * (-43);
                        i = ((iM45029 ^ i4) * 20227) ^ 1189030862;
                        i2 = -1765615918;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܳ") ^ i4;
                        i = ((iM45029 ^ i3) * 13641) ^ 1174139307;
                        i2 = 1714433442;
                    }
                    String str5 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str5;
                    break;
                case -1055177538:
                case 438531916:
                    C1875.m6086();
                    C1189.m4368();
                    break;
                case -1043672039:
                case -746984392:
                    strM5502 = strM5502;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡ֡")) * (-43);
                        i = ((iM45029 ^ i4) * 20227) ^ 1189030862;
                        i2 = -1765615918;
                    } else {
                        iM45029 = (C19806.m45029("᩹ܳ") + i3) * 85;
                        i = ((iM45029 ^ i4) * 2271) ^ (-1471308815);
                        i2 = 787088337;
                    }
                    String str6 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str6;
                    break;
                case -1019994852:
                case 451652735:
                    C2704.m8238(animator, strM5502);
                    this.f12585.f46060 = true;
                    break;
                case -952966289:
                case -90407083:
                    strM5502 = strM5502;
                    s = sArr[c];
                    s2 = 2;
                    if (C1066.f4915 <= 0) {
                        strM5502 = strM5502;
                        iM45029 = (C19806.m45029("֫ܳ") + i3) * 89;
                        strM5502 = strM5502;
                        i = ((iM45029 ^ i4) * (-5277)) ^ 1985834323;
                        i2 = -1175142082;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۟") + i3) * (-59);
                        i = ((iM45029 ^ i4) * (-601)) ^ (-1507529962);
                        i2 = 1858421319;
                    }
                    String str7 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str7;
                    break;
                case -813646077:
                case 1870106685:
                    if (C2124.f7782 <= 0) {
                        strM5502 = strM5502;
                        i11 = 9;
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡ֡")) * (-43);
                        i = ((iM45029 ^ i4) * 20227) ^ 1189030862;
                        i2 = -1765615918;
                        String str8 = strM5502;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                        strM5502 = str8;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("ܿܶ") ^ i3;
                        i6 = iM11307 ^ 30759386;
                        i5 = ((iM11307 ^ i4) * (-23545)) ^ (-1908618812);
                        i11 = 9;
                    }
                    break;
                case -687708268:
                case 1095437007:
                    C0671.m3008();
                    iM45029 = (C19806.m45029("֫ܽ") + i4) * (-123);
                    strM5502 = strM5502;
                    i = ((iM45029 ^ i3) * 10585) ^ 1241902547;
                    i2 = 1656548979;
                    String str9 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str9;
                    break;
                case -673606500:
                case 20888354:
                    i9 = 63365;
                    iM45029 = (C19806.m45029("ܳ᩸") + i4) * 87;
                    i = ((iM45029 ^ i3) * 1223) ^ 1592063355;
                    i2 = -1410007119;
                    String str10 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str10;
                    break;
                case -505107039:
                case 715023462:
                    C0629.m2907();
                    if (RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("֫ܽ") + i4) * (-123);
                        strM5502 = strM5502;
                        i = ((iM45029 ^ i3) * 10585) ^ 1241902547;
                        i2 = 1656548979;
                    } else {
                        strM5502 = strM5502;
                        iM45029 = C19806.m45029("ۧ᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-23495)) ^ (-318036012);
                        i2 = -532025588;
                    }
                    String str11 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str11;
                    break;
                case -475204816:
                case 2079058930:
                    if (C2332.f8260) {
                        strM5502 = strM5502;
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡ֡")) * (-43);
                        i = ((iM45029 ^ i4) * 20227) ^ 1189030862;
                        i2 = -1765615918;
                    } else {
                        iM45029 = (C19806.m45029("֫ܽ") + i4) * (-123);
                        strM5502 = strM5502;
                        i = ((iM45029 ^ i3) * 10585) ^ 1241902547;
                        i2 = 1656548979;
                    }
                    String str12 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str12;
                    break;
                case -338860627:
                case 702958864:
                    strM5502 = strM5502;
                    i7 = s * s2;
                    if (C2704.m8255() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 5831) ^ (-1781783009);
                        i2 = 52333422;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۬᩶")) * 43;
                        i = ((iM45029 ^ i4) * 8055) ^ (-1159774051);
                        i2 = 357144746;
                    }
                    String str13 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str13;
                    break;
                case -34199646:
                case 768113571:
                    strM5502 = strM5502;
                    int i13 = s + s3;
                    if (i8 - (i13 * i13) > 0) {
                        iM45029 = (C19806.m45029("ۘܽ") ^ i3) * 59;
                        i = ((iM45029 ^ i4) * (-24987)) ^ 666251543;
                        i2 = 258806466;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗۘ")) * 109;
                        i = ((iM45029 ^ i4) * (-13779)) ^ 233462126;
                        i2 = -1847122629;
                    }
                    String str14 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str14;
                    break;
                case 41402130:
                case 1979366617:
                    i9 = 18039;
                    iM45029 = (C19806.m45029("ܳ᩸") + i4) * 87;
                    i = ((iM45029 ^ i3) * 1223) ^ 1592063355;
                    i2 = -1410007119;
                    String str15 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str15;
                    break;
                case 314207945:
                case 873440625:
                    strM5502 = CallableC1627.m5502(sArr2, i10, i11, i9);
                    if (C0526.f2219) {
                        strM5502 = strM5502;
                        iM45029 = (C19806.m45029("֫ܳ") + i3) * 89;
                        strM5502 = strM5502;
                        i = ((iM45029 ^ i4) * (-5277)) ^ 1985834323;
                        i2 = -1175142082;
                        String str16 = strM5502;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                        strM5502 = str16;
                    } else {
                        int iM450210 = C19806.m45029("᩷ᩳ") ^ i3;
                        i5 = ((iM450210 ^ i4) * (-11221)) ^ 558945030;
                        strM5502 = strM5502;
                        i6 = iM450210 ^ (-799505660);
                    }
                    break;
                default:
                    strM5502 = strM5502;
                    sArr = f12582;
                    if (C3286.f12186) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡ֡")) * (-43);
                        i = ((iM45029 ^ i4) * 20227) ^ 1189030862;
                        i2 = -1765615918;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻֡") ^ i4;
                        i = ((iM45029 ^ i3) * (-183)) ^ 457083968;
                        i2 = 1852796094;
                    }
                    String str17 = strM5502;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    strM5502 = str17;
                    break;
            }
            return;
        }
    }
}
