package l;

import android.app.Application;
import android.content.DialogInterface;
import android.view.View;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC18147 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۛۡۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f58030 = {614, -15603, -15565, -15577, -15607, -15580, -15489, -15595, -15565, -15579, -15566, -15570, -15583, -15571, -15579, -15595, -15565, -15579, -15566, -15596, -15559, -15568, -15579, -15582, -15563, -15564, -15564, -15569, -15570, -15614, -15563, -15564, -15564, -15569, -15570, -15568, -15563, -15565, -15576, -15507, -15581, -15572, -15575, -15581, -15573, 7188, 29630, 29568, 29588, 29626, 29591, 29644, 29606, 29568, 29590, 29569, 29597, 29586, 29598, 29590, 29606, 29568, 29590, 29569, 29607, 29578, 29571, 29590, 29585, 29574, 29575, 29575, 29596, 29597, 29617, 29574, 29575, 29575, 29596, 29597, 29571, 29574, 29568, 29595, 29662, 29584, 29599, 29594, 29584, 29592};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f58031;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f58032;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58033;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Runnable f58034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58035;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m42261(DialogInterfaceOnClickListenerC18147 dialogInterfaceOnClickListenerC18147) {
        return dialogInterfaceOnClickListenerC18147.f58031;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ String m42263(DialogInterfaceOnClickListenerC18147 dialogInterfaceOnClickListenerC18147) {
        return dialogInterfaceOnClickListenerC18147.f58032;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01cf A[PHI: r4 r6 r10 r11 r13 r22
      0x01cf: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:53:0x01cd, B:18:0x0086, B:49:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v8 int) binds: [B:53:0x01cd, B:18:0x0086, B:49:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:53:0x01cd, B:18:0x0086, B:49:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:53:0x01cd, B:18:0x0086, B:49:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r13v7 java.lang.StringBuilder) = (r13v2 java.lang.StringBuilder), (r13v2 java.lang.StringBuilder), (r13v11 java.lang.StringBuilder) binds: [B:53:0x01cd, B:18:0x0086, B:49:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r22v40 java.lang.Runnable) = (r22v18 java.lang.Runnable), (r22v30 java.lang.Runnable), (r22v45 java.lang.Runnable) binds: [B:53:0x01cd, B:18:0x0086, B:49:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0210 A[PHI: r7 r12 r22
      0x0210: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:57:0x020e, B:39:0x0160, B:10:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:57:0x020e, B:39:0x0160, B:10:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r22v34 java.lang.Runnable) = (r22v17 java.lang.Runnable), (r22v19 java.lang.Runnable), (r22v35 java.lang.Runnable) binds: [B:57:0x020e, B:39:0x0160, B:10:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x036e A[PHI: r3 r16 r17 r18 r22 r23
      0x036e: PHI (r3v57 java.lang.String) = (r3v4 java.lang.String), (r3v12 java.lang.String), (r3v64 java.lang.String) binds: [B:81:0x0356, B:6:0x0060, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r16v6 short[]) = (r16v2 short[]), (r16v4 short[]), (r16v2 short[]) binds: [B:81:0x0356, B:6:0x0060, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r17v6 char) = (r17v2 char), (r17v4 char), (r17v2 char) binds: [B:81:0x0356, B:6:0x0060, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r18v6 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:81:0x0356, B:6:0x0060, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r22v39 java.lang.Runnable) = (r22v5 java.lang.Runnable), (r22v12 java.lang.Runnable), (r22v45 java.lang.Runnable) binds: [B:81:0x0356, B:6:0x0060, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x036e: PHI (r23v7 int) = (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:81:0x0356, B:6:0x0060, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (l.C3743.f13569 == false) goto L14;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r27) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC18147.onClick(android.view.View):void");
    }

    public DialogInterfaceOnClickListenerC18147(int i, int i2) {
        int i3 = -1281807868;
        int i4 = C0629.f2722;
        int i5 = RunnableC0195.f1321;
        int iM11306 = ThreadFactoryC3888.m11306("ۚۖ") ^ i4;
        int i6 = ((iM11306 ^ i5) * (-28025)) ^ 725204183;
        int i7 = 308500870;
        while (true) {
            i3 = ((((i3 ^ i5) * (-23939)) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -1922842855:
                case 1713592996:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (C19806.m45029("ۡۗ") ^ i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 26389) ^ 852573913;
                        i7 = 1558462353;
                    } else {
                        iM11306 = (C19806.m45029("ۢ۟") ^ i4) * 119;
                        i6 = ((iM11306 ^ i5) * (-12225)) ^ (-1836990698);
                        i7 = -1284884208;
                    }
                    break;
                case -1807702920:
                case 346303938:
                    C2477.m7593();
                    iM11306 = (C19806.m45029("ۜۢ") ^ i4) * 71;
                    i6 = ((iM11306 ^ i5) * (-2791)) ^ (-2062952771);
                    i7 = -1123913504;
                    break;
                case -1774719732:
                case 910904571:
                    C1668.m5583();
                    if (C2788.f10625 >= 0) {
                        iM11306 = (C19806.m45029("ۡۗ") ^ i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 26389) ^ 852573913;
                        i7 = 1558462353;
                    } else {
                        iM11306 = (C19806.m45029("ۜۢ") ^ i4) * 71;
                        i6 = ((iM11306 ^ i5) * (-2791)) ^ (-2062952771);
                        i7 = -1123913504;
                    }
                    break;
                case -1557733152:
                case 741084170:
                    if (!C2704.f10408) {
                        iM11306 = C19806.m45029("᩶᩻") ^ i4;
                        i6 = ((iM11306 ^ i5) * 2745) ^ 1388631733;
                        i7 = -2057604339;
                    } else {
                        iM11306 = (C19806.m45029("ۜۢ") ^ i4) * 71;
                        i6 = ((iM11306 ^ i5) * (-2791)) ^ (-2062952771);
                        i7 = -1123913504;
                    }
                    break;
                case -1407191994:
                case 1574447555:
                    if (!C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-31033)) ^ (-933441874);
                        i7 = -1879495854;
                    } else {
                        iM11306 = C19806.m45029("᩶᩻") ^ i4;
                        i6 = ((iM11306 ^ i5) * 2745) ^ 1388631733;
                        i7 = -2057604339;
                    }
                    break;
                case -1234746898:
                case 955644684:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (C19806.m45029("ۡۗ") ^ i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 26389) ^ 852573913;
                        i7 = 1558462353;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙ֡")) * (-73);
                        i6 = ((iM11306 ^ i5) * (-25151)) ^ 371586719;
                        i7 = -1792529051;
                    }
                    break;
                case -986405400:
                case 769399829:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܺ") ^ i5) * 67;
                        i6 = ((iM11306 ^ i4) * 14509) ^ 1368116774;
                        i7 = -1122791800;
                    } else {
                        iM11306 = (C19806.m45029("ᩳܰ") ^ i4) * 17;
                        i6 = ((iM11306 ^ i5) * 6807) ^ (-1135212761);
                        i7 = -1429772339;
                    }
                    break;
                case -847346300:
                case 17584766:
                    this.f58035 = i;
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("᩶᩻") ^ i4;
                        i6 = ((iM11306 ^ i5) * 2745) ^ 1388631733;
                        i7 = -2057604339;
                    } else {
                        iM11306 = (C19806.m45029("۠ۤ") ^ i5) * 91;
                        i6 = ((iM11306 ^ i4) * 11001) ^ 60212995;
                        i7 = -1965167357;
                    }
                    break;
                case -759001377:
                case 1420406404:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = C19806.m45029("᩶᩻") ^ i4;
                        i6 = ((iM11306 ^ i5) * 2745) ^ 1388631733;
                        i7 = -2057604339;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۢ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-28283)) ^ 1304823850;
                        i7 = 1664908407;
                    }
                    break;
                case -556896338:
                case -47718970:
                    C0797.m3359();
                    throw new RuntimeException();
                case -529287647:
                case 1328445929:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-31033)) ^ (-933441874);
                        i7 = -1879495854;
                    } else {
                        iM11306 = C19806.m45029("ۚܽ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-30183)) ^ (-888584279);
                        i7 = 783725289;
                    }
                    break;
                case -520302940:
                case 1748117173:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ۡۗ") ^ i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 26389) ^ 852573913;
                        i7 = 1558462353;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۠") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-31259)) ^ (-1835954739);
                        i7 = 1897161669;
                    }
                    break;
                case -482844146:
                case 1884494372:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("᩶᩻") ^ i4;
                        i6 = ((iM11306 ^ i5) * 2745) ^ 1388631733;
                        i7 = -2057604339;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩵") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-18669)) ^ (-2043988686);
                        i7 = 384550333;
                    }
                    break;
                case 58204959:
                case 2035540981:
                    this.f58033 = i2;
                    return;
                case 92597382:
                case 1218680076:
                    if (C1377.f5749) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-29);
                        i6 = ((iM11306 ^ i4) * 5509) ^ 501089031;
                        i7 = 1939447442;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܺ") ^ i5) * 67;
                        i6 = ((iM11306 ^ i4) * 14509) ^ 1368116774;
                        i7 = -1122791800;
                    }
                    break;
                default:
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("᩶᩻") ^ i4;
                        i6 = ((iM11306 ^ i5) * 2745) ^ 1388631733;
                        i7 = -2057604339;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۡ") ^ i5) * 41;
                        i6 = ((iM11306 ^ i4) * 18105) ^ 2112064951;
                        i7 = -131464010;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01c1 A[PHI: r4 r6 r7 r10 r11 r14 r15 r20
      0x01c1: PHI (r4v4 int) = (r4v2 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int) binds: [B:50:0x01bf, B:46:0x019d, B:35:0x013d, B:31:0x0115, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r6v6 int) = (r6v2 int), (r6v4 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:50:0x01bf, B:46:0x019d, B:35:0x013d, B:31:0x0115, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r7v5 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v3 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:50:0x01bf, B:46:0x019d, B:35:0x013d, B:31:0x0115, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r10v5 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:50:0x01bf, B:46:0x019d, B:35:0x013d, B:31:0x0115, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r11v5 java.lang.StringBuilder) = 
      (r11v2 java.lang.StringBuilder)
      (r11v3 java.lang.StringBuilder)
      (r11v2 java.lang.StringBuilder)
      (r11v2 java.lang.StringBuilder)
      (r11v2 java.lang.StringBuilder)
     binds: [B:50:0x01bf, B:46:0x019d, B:35:0x013d, B:31:0x0115, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r14v5 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:50:0x01bf, B:46:0x019d, B:35:0x013d, B:31:0x0115, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r15v5 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:50:0x01bf, B:46:0x019d, B:35:0x013d, B:31:0x0115, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r20v21 java.lang.Runnable) = 
      (r20v10 java.lang.Runnable)
      (r20v12 java.lang.Runnable)
      (r20v13 java.lang.Runnable)
      (r20v14 java.lang.Runnable)
      (r20v26 java.lang.Runnable)
     binds: [B:50:0x01bf, B:46:0x019d, B:35:0x013d, B:31:0x0115, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int iM45029;
        int i2;
        int i3;
        String strM6288;
        int iM11306;
        int i4;
        int iM11307;
        int i5;
        int i6;
        short s;
        String str;
        short[] sArr;
        int iM11308;
        int i7;
        int i8;
        int i9;
        int iM450210;
        int i10;
        int i11;
        Runnable runnable;
        DialogInterfaceOnClickListenerC18147 dialogInterfaceOnClickListenerC18147 = this;
        int i12 = 1321724760;
        int i13 = C1398.f5802;
        int i14 = C1875.f7103;
        int iM11309 = ThreadFactoryC3888.m11306("ܺ۠") ^ i13;
        int i15 = ((iM11309 ^ i14) * 17027) ^ (-1177419554);
        int i16 = iM11309 ^ 9820599;
        String strM6684 = null;
        String str2 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        HashMap map = null;
        int i17 = 0;
        StringBuilder sb = null;
        int i18 = 0;
        short s2 = 0;
        Runnable runnable2 = null;
        short[] sArr5 = null;
        int i19 = 0;
        Application applicationM939 = null;
        String strM6674 = null;
        int i20 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * 3777) >> 31));
            switch (i12) {
                case -2120968440:
                case -1316194211:
                    runnable2 = runnable2;
                    String str3 = strM6684;
                    s2 = sArr2[0];
                    if (C10634.f36300 >= 0) {
                        strM6684 = str3;
                        int iM450211 = (C19806.m45029("ᩴۨ") ^ i14) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i15 = ((iM450211 ^ i13) * (-13525)) ^ 308559868;
                        i9 = iM450211 ^ 386069780;
                    } else {
                        int iM113010 = ThreadFactoryC3888.m11306("ۡۢ") ^ i13;
                        i15 = ((iM113010 ^ i14) * (-17171)) ^ 1971557725;
                        i9 = iM113010 ^ (-168910747);
                        strM6684 = str3;
                    }
                    runnable2 = runnable2;
                    i16 = i9;
                    dialogInterfaceOnClickListenerC18147 = this;
                    break;
                case -1955720666:
                case 1875710370:
                    i19 = 47646;
                    iM450210 = (i13 - C19806.m45029("ܳܽ")) * (-5);
                    i10 = ((iM450210 ^ i14) * 13837) ^ (-1386096);
                    i11 = 805872546;
                    int i21 = iM450210 ^ i11;
                    strM6684 = strM6684;
                    runnable = runnable2;
                    i16 = i21;
                    i15 = i10;
                    runnable2 = runnable;
                    break;
                case -1755337551:
                case 1691679183:
                    C1189.m4368();
                    C0050.m946();
                    sArr = sArr2;
                    runnable2 = runnable2;
                    s = s2;
                    str = strM6684;
                    iM11308 = (i14 - ThreadFactoryC3888.m11306("۫۫")) * 119;
                    sArr2 = sArr;
                    i7 = ((iM11308 ^ i13) * 21983) ^ 1158566585;
                    i8 = -1551946071;
                    int i22 = iM11308 ^ i8;
                    s2 = s;
                    strM6684 = str;
                    i15 = i7;
                    dialogInterfaceOnClickListenerC18147 = this;
                    runnable = runnable2;
                    i16 = i22;
                    runnable2 = runnable;
                    break;
                case -1747102511:
                case -266988702:
                    C3722.m10894();
                    RunnableC1606.m5473();
                    break;
                case -1595895915:
                case -659842751:
                    runnable2 = runnable2;
                    applicationM939 = C0050.m939();
                    int i23 = C13184.f43886;
                    if (C15198.m36412()) {
                        iM45029 = (C19806.m45029("ۗۗ") ^ i14) * 17;
                        i2 = ((iM45029 ^ i13) * (-2477)) ^ (-515516857);
                        i3 = -100773684;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ۟") ^ i13;
                        i2 = ((iM45029 ^ i14) * (-10249)) ^ 1376497289;
                        i3 = 1816592374;
                    }
                    i6 = iM45029 ^ i3;
                    runnable2 = runnable2;
                    i16 = i6;
                    i15 = i2;
                    break;
                case -1530066311:
                case -553956935:
                    runnable2 = runnable2;
                    str = strM6684;
                    s = s2;
                    if (((s * s) + 9357481) - (s * 6118) >= 0) {
                        int iM113011 = (ThreadFactoryC3888.m11306("۟᩶") ^ i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i24 = ((iM113011 ^ i14) * 4315) ^ (-1247153507);
                        i9 = iM113011 ^ 1097149676;
                        s2 = s;
                        strM6684 = str;
                        i15 = i24;
                        runnable2 = runnable2;
                        i16 = i9;
                        dialogInterfaceOnClickListenerC18147 = this;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ᩳۧ") ^ i14;
                        i7 = ((iM11308 ^ i13) * (-21381)) ^ (-1714659096);
                        i8 = 1616657247;
                        int i25 = iM11308 ^ i8;
                        s2 = s;
                        strM6684 = str;
                        i15 = i7;
                        dialogInterfaceOnClickListenerC18147 = this;
                        runnable = runnable2;
                        i16 = i25;
                        runnable2 = runnable;
                    }
                    break;
                case -1340077703:
                case 1427302356:
                    if (!C10634.m26820()) {
                        runnable2 = runnable2;
                        int iM450212 = (C19806.m45029("ᩴۨ") ^ i14) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i15 = ((iM450212 ^ i13) * (-13525)) ^ 308559868;
                        i9 = iM450212 ^ 386069780;
                        runnable2 = runnable2;
                        i16 = i9;
                        dialogInterfaceOnClickListenerC18147 = this;
                    } else {
                        sArr = sArr2;
                        runnable2 = runnable2;
                        s = s2;
                        str = strM6684;
                        iM11308 = (i14 - ThreadFactoryC3888.m11306("۫۫")) * 119;
                        sArr2 = sArr;
                        i7 = ((iM11308 ^ i13) * 21983) ^ 1158566585;
                        i8 = -1551946071;
                        int i26 = iM11308 ^ i8;
                        s2 = s;
                        strM6684 = str;
                        i15 = i7;
                        dialogInterfaceOnClickListenerC18147 = this;
                        runnable = runnable2;
                        i16 = i26;
                        runnable2 = runnable;
                    }
                    break;
                case -1130831562:
                case 1739591377:
                    runnable2 = dialogInterfaceOnClickListenerC18147.f58034;
                    if (runnable2 != null) {
                        iM11307 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i13;
                        i2 = ((iM11307 ^ i14) * 13517) ^ (-372778449);
                        i5 = 1695263921;
                    } else {
                        iM11307 = (i14 - C19806.m45029("ܽᩳ")) * 91;
                        i2 = ((iM11307 ^ i13) * (-21853)) ^ 426173251;
                        i5 = 1468532890;
                    }
                    i16 = iM11307 ^ i5;
                    i15 = i2;
                    break;
                case -1088945286:
                case 1602706861:
                    if (C0216.m1591() <= 0) {
                        runnable2 = runnable2;
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("ܰܶ")) * (-75);
                        i2 = ((iM11306 ^ i14) * 15399) ^ (-1978227620);
                        i4 = -162316782;
                        i6 = iM11306 ^ i4;
                        runnable2 = runnable2;
                        sb = null;
                        i16 = i6;
                        i15 = i2;
                    } else {
                        sArr = sArr2;
                        runnable2 = runnable2;
                        s = s2;
                        str = strM6684;
                        iM11308 = (i14 - ThreadFactoryC3888.m11306("۫۫")) * 119;
                        sArr2 = sArr;
                        i7 = ((iM11308 ^ i13) * 21983) ^ 1158566585;
                        i8 = -1551946071;
                        int i27 = iM11308 ^ i8;
                        s2 = s;
                        strM6684 = str;
                        i15 = i7;
                        dialogInterfaceOnClickListenerC18147 = this;
                        runnable = runnable2;
                        i16 = i27;
                        runnable2 = runnable;
                    }
                    break;
                case -958004988:
                case -846144265:
                    break;
                case -777358243:
                case 1035435525:
                    C0526.m2437();
                    if (C1025.f4800 >= 0) {
                        runnable2 = runnable2;
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i13) * (-75);
                        i2 = ((iM45029 ^ i14) * (-22953)) ^ 1144797187;
                        i3 = 1058753868;
                        i6 = iM45029 ^ i3;
                        runnable2 = runnable2;
                        i16 = i6;
                        i15 = i2;
                    }
                    runnable2 = runnable2;
                    iM11306 = (i13 - ThreadFactoryC3888.m11306("ܰܶ")) * (-75);
                    i2 = ((iM11306 ^ i14) * 15399) ^ (-1978227620);
                    i4 = -162316782;
                    i6 = iM11306 ^ i4;
                    runnable2 = runnable2;
                    sb = null;
                    i16 = i6;
                    i15 = i2;
                    break;
                case -732866139:
                case 1925935376:
                    strM6288 = C0671.m3006();
                    str2 = strM6288;
                    iM45029 = (C19806.m45029("᩻ۡ") + i13) * (-29);
                    i2 = ((iM45029 ^ i14) * 1393) ^ 1867741128;
                    i3 = -1042128408;
                    i6 = iM45029 ^ i3;
                    runnable2 = runnable2;
                    i16 = i6;
                    i15 = i2;
                    break;
                case -539394815:
                case -348709939:
                    runnable2 = runnable2;
                    C3722.m10891(map, C7105.m18989(f58030, 7, 8, i19), str2);
                    if (CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ᩳ") ^ i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM45029 ^ i13) * 4567) ^ (-1487148417);
                        i3 = 1365196444;
                        i6 = iM45029 ^ i3;
                        runnable2 = runnable2;
                        i16 = i6;
                        i15 = i2;
                    }
                    iM11306 = ThreadFactoryC3888.m11306("֫۫") ^ i13;
                    i2 = ((iM11306 ^ i14) * (-32625)) ^ (-289007427);
                    i4 = -1690990044;
                    i6 = iM11306 ^ i4;
                    runnable2 = runnable2;
                    sb = null;
                    i16 = i6;
                    i15 = i2;
                    break;
                case -266778754:
                case 1638093011:
                    runnable2 = runnable2;
                    strM6684 = strM6684;
                    C3722.m10891(map, C1066.m4040(sArr5, 1, 5, i19), strM6684);
                    if (MenuItemOnMenuItemClickListenerC3244.m9707()) {
                        iM450210 = (i14 - C19806.m45029("᩸ۤ")) * (-5);
                        i10 = ((iM450210 ^ i13) * (-27073)) ^ 1085000335;
                        i11 = -1135894754;
                    } else {
                        iM450210 = (i13 - C19806.m45029("ܳۚ")) * 83;
                        i10 = ((iM450210 ^ i14) * (-22205)) ^ 672845376;
                        i11 = -688134553;
                    }
                    int i28 = iM450210 ^ i11;
                    strM6684 = strM6684;
                    runnable = runnable2;
                    i16 = i28;
                    i15 = i10;
                    runnable2 = runnable;
                    break;
                case -247565966:
                case 653723511:
                    runnable2 = runnable2;
                    sArr3 = f58030;
                    i18 = 15;
                    i17 = 8;
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۙ") ^ i13) * (-121);
                        i2 = ((iM45029 ^ i14) * (-18273)) ^ 1866924492;
                        i3 = -402806679;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i13) * (-75);
                        i2 = ((iM45029 ^ i14) * (-22953)) ^ 1144797187;
                        i3 = 1058753868;
                    }
                    i6 = iM45029 ^ i3;
                    runnable2 = runnable2;
                    i16 = i6;
                    i15 = i2;
                    break;
                case -247499761:
                case 412275075:
                    runnable2 = runnable2;
                    map = new HashMap();
                    strM6684 = C2124.m6684(dialogInterfaceOnClickListenerC18147.f58035);
                    sArr5 = f58030;
                    if (C0216.m1591() > 0) {
                        iM45029 = (C19806.m45029("ۨۨ") ^ i14) * (-101);
                        i2 = ((iM45029 ^ i13) * (-14913)) ^ (-1716605805);
                        i3 = 1425679724;
                        i6 = iM45029 ^ i3;
                        runnable2 = runnable2;
                        i16 = i6;
                        i15 = i2;
                    } else {
                        int iM450213 = (C19806.m45029("ᩴۨ") ^ i14) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i15 = ((iM450213 ^ i13) * (-13525)) ^ 308559868;
                        i9 = iM450213 ^ 386069780;
                        runnable2 = runnable2;
                        i16 = i9;
                        dialogInterfaceOnClickListenerC18147 = this;
                    }
                    break;
                case -140202906:
                case 472999894:
                    i19 = 49984;
                    iM450210 = (i13 - C19806.m45029("ܳܽ")) * (-5);
                    i10 = ((iM450210 ^ i14) * 13837) ^ (-1386096);
                    i11 = 805872546;
                    int i29 = iM450210 ^ i11;
                    strM6684 = strM6684;
                    runnable = runnable2;
                    i16 = i29;
                    i15 = i10;
                    runnable2 = runnable;
                    break;
                case 19250867:
                case 1719087340:
                    runnable2 = runnable2;
                    C0817.m3408(sb, i20);
                    strM6674 = C2124.m6674(sb);
                    sArr4 = f58030;
                    if (C0962.m3746() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i13) * (-75);
                        i2 = ((iM45029 ^ i14) * (-22953)) ^ 1144797187;
                        i3 = 1058753868;
                    } else {
                        iM45029 = (C19806.m45029("۫۟") ^ i13) * (-105);
                        i2 = ((iM45029 ^ i14) * 21109) ^ (-204045107);
                        i3 = 903145427;
                    }
                    i6 = iM45029 ^ i3;
                    runnable2 = runnable2;
                    i16 = i6;
                    i15 = i2;
                    break;
                case 493250651:
                case 1641510268:
                    runnable2 = runnable2;
                    C3722.m10891(map, C2332.m7082(sArr4, 29, 6, i19), strM6674);
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i13) * (-75);
                        i2 = ((iM45029 ^ i14) * (-22953)) ^ 1144797187;
                        i3 = 1058753868;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨۟") ^ i14;
                        i2 = ((iM45029 ^ i13) * (-7487)) ^ (-353378957);
                        i3 = 1271998991;
                    }
                    i6 = iM45029 ^ i3;
                    runnable2 = runnable2;
                    i16 = i6;
                    i15 = i2;
                    break;
                case 560859813:
                case 1695868392:
                    strM6288 = C1937.m6288(f58030, 6, 1, i19);
                    str2 = strM6288;
                    iM45029 = (C19806.m45029("᩻ۡ") + i13) * (-29);
                    i2 = ((iM45029 ^ i14) * 1393) ^ 1867741128;
                    i3 = -1042128408;
                    i6 = iM45029 ^ i3;
                    runnable2 = runnable2;
                    i16 = i6;
                    i15 = i2;
                    break;
                case 729811628:
                case 1580172112:
                    runnable2 = runnable2;
                    s = s2;
                    str = strM6684;
                    sArr = f58030;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11308 = (i14 - ThreadFactoryC3888.m11306("۫۫")) * 119;
                        sArr2 = sArr;
                        i7 = ((iM11308 ^ i13) * 21983) ^ 1158566585;
                        i8 = -1551946071;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("۬ۚ") + i14) * 119;
                        sArr2 = sArr;
                        i7 = ((iM11308 ^ i13) * 29367) ^ 648000837;
                        i8 = -710703995;
                    }
                    int i210 = iM11308 ^ i8;
                    s2 = s;
                    strM6684 = str;
                    i15 = i7;
                    dialogInterfaceOnClickListenerC18147 = this;
                    runnable = runnable2;
                    i16 = i210;
                    runnable2 = runnable;
                    break;
                case 1055572728:
                case 1164896828:
                    runnable2 = runnable2;
                    RunnableC1895.m6172(map, C0962.m3747(sArr3, i18, i17, i19), C18853.m43488());
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("ܰܶ")) * (-75);
                        i2 = ((iM11306 ^ i14) * 15399) ^ (-1978227620);
                        i4 = -162316782;
                    } else {
                        short[] sArr6 = f58030;
                        if (C0526.m2437() < 0) {
                            sb = new StringBuilder(C1668.m5577(sArr6, 23, 6, i19));
                            i20 = dialogInterfaceOnClickListenerC18147.f58033;
                            if (AbstractC0464.f2088 <= 0) {
                                iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i13) * (-75);
                                i2 = ((iM45029 ^ i14) * (-22953)) ^ 1144797187;
                                i3 = 1058753868;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۘ֡") ^ i14;
                                i2 = ((iM45029 ^ i13) * 15751) ^ 1127788784;
                                i3 = -1924728184;
                            }
                            i6 = iM45029 ^ i3;
                            runnable2 = runnable2;
                            i16 = i6;
                            i15 = i2;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("֫۫") ^ i13;
                        i2 = ((iM11306 ^ i14) * (-32625)) ^ (-289007427);
                        i4 = -1690990044;
                    }
                    i6 = iM11306 ^ i4;
                    runnable2 = runnable2;
                    sb = null;
                    i16 = i6;
                    i15 = i2;
                    break;
                case 1196626254:
                case 1652518276:
                    runnable2 = runnable2;
                    MobclickAgent.onEvent(applicationM939, C0278.m1774(f58030, 35, 10, i19), map);
                    iM45029 = (C19806.m45029("ۗۗ") ^ i14) * 17;
                    i2 = ((iM45029 ^ i13) * (-2477)) ^ (-515516857);
                    i3 = -100773684;
                    i6 = iM45029 ^ i3;
                    runnable2 = runnable2;
                    i16 = i6;
                    i15 = i2;
                    break;
                default:
                    C1977.m6365(runnable2);
                    iM11307 = (i14 - C19806.m45029("ܽᩳ")) * 91;
                    i2 = ((iM11307 ^ i13) * (-21853)) ^ 426173251;
                    i5 = 1468532890;
                    i16 = iM11307 ^ i5;
                    i15 = i2;
                    break;
            }
            return;
        }
    }
}
