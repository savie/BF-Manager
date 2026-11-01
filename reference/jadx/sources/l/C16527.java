package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16527 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۙ᩶ۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f53096 = {2662, 17894, 17897, 17902, 17898, 17894, 17907, 17902, 17896, 17897, 6979, 14154, 14149, 14146, 14150, 14154, 14175, 14146, 14148, 14149, 17490, 17958, -17436, -19386, 19505, -24012, 16764, 24695, -21530, -22878, 17265, 27389, 24090, -19573, 31137, -18119, 19012, -23876, 16391, 25252, 16522, 20669, -23467, 17852, 5188, 7236, 7243, 7244, 7240, 7236, 7249, 7244, 7242, 7243, 7456, -10452, -10461, -10460, -10464, -10452, -10439, -10460, -10462, -10461};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ObjectAnimator f53097;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC12294 f53098;

    /* JADX WARN: Code duplicated, block: B:56:0x0216 A[PHI: r0 r1 r8 r9 r16 r17
      0x0216: PHI (r0v3 short[]) = (r0v1 short[]), (r0v2 short[]), (r0v1 short[]), (r0v1 short[]) binds: [B:14:0x0058, B:55:0x0214, B:51:0x01f3, B:27:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r1v3 char) = (r1v1 char), (r1v1 char), (r1v2 char), (r1v1 char) binds: [B:14:0x0058, B:55:0x0214, B:51:0x01f3, B:27:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r8v2 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v1 short[]), (r8v3 short[]) binds: [B:14:0x0058, B:55:0x0214, B:51:0x01f3, B:27:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v3 int) binds: [B:14:0x0058, B:55:0x0214, B:51:0x01f3, B:27:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r16v11 int) = (r16v3 int), (r16v7 int), (r16v8 int), (r16v12 int) binds: [B:14:0x0058, B:55:0x0214, B:51:0x01f3, B:27:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r17v7 short) = (r17v0 short), (r17v4 short), (r17v5 short), (r17v8 short) binds: [B:14:0x0058, B:55:0x0214, B:51:0x01f3, B:27:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x028f A[PHI: r16 r17
      0x028f: PHI (r16v14 int) = (r16v4 int), (r16v5 int), (r16v6 int), (r16v17 int) binds: [B:67:0x028d, B:63:0x026d, B:59:0x024d, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r17v14 short) = (r17v1 short), (r17v2 short), (r17v3 short), (r17v17 short) binds: [B:67:0x028d, B:63:0x026d, B:59:0x024d, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i;
        short s;
        int i2;
        int iM45029;
        int i3;
        int iM450210;
        int i4;
        int i5;
        short[] sArr = null;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = -919639436;
        int i13 = C1066.f4915;
        int i14 = C1398.f5802;
        int iM450211 = C19806.m45029("ۛܽ") ^ i14;
        int i15 = ((iM450211 ^ i13) * (-32183)) ^ (-185849058);
        int i16 = iM450211 ^ 1074151269;
        while (true) {
            i12 = ((((i12 ^ i13) * (-20451)) >> 31) & i15) ^ i16;
            switch (i12) {
                case -1938374831:
                case 893549431:
                    C7105.m18985();
                    C0216.m1591();
                    int iM11306 = (i13 - ThreadFactoryC3888.m11306("۫᩶")) * (-71);
                    s = s2;
                    i16 = iM11306 ^ 928636590;
                    i15 = ((iM11306 ^ i14) * 14679) ^ (-9268108);
                    s2 = s;
                    break;
                case -1863935639:
                case -793400635:
                    s = s2;
                    i2 = i6;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (i14 - ThreadFactoryC3888.m11306("᩹ۚ")) * (-59);
                        i15 = (-734401443) ^ ((iM45029 ^ i13) * (-24837));
                        i3 = 464974721;
                    } else {
                        iM45029 = C19806.m45029("ܰۖ") ^ i13;
                        i15 = (-716780810) ^ ((iM45029 ^ i14) * (-1413));
                        i3 = 98590663;
                    }
                    i16 = iM45029 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case -1745662755:
                case -613737318:
                    i6 = s2 * s3;
                    i7 = s2 * s2;
                    if (C0817.m3399()) {
                        s = s2;
                        int iM450212 = C19806.m45029("ܳۜ") ^ i14;
                        i15 = ((iM450212 ^ i13) * 2703) ^ (-1821204016);
                        i16 = iM450212 ^ 1630247179;
                    } else {
                        int iM11307 = (i13 - ThreadFactoryC3888.m11306("۫᩶")) * (-71);
                        s = s2;
                        i16 = iM11307 ^ 928636590;
                        i15 = ((iM11307 ^ i14) * 14679) ^ (-9268108);
                    }
                    s2 = s;
                    break;
                case -1692965609:
                case 1724189993:
                    sArr2 = f53096;
                    if (C2704.m8255() <= 0) {
                        s = s2;
                        i2 = i6;
                        i10 = 55;
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩺") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i15 = (-481650095) ^ ((iM45029 ^ i13) * (-12815));
                        i3 = 1764415951;
                        i16 = iM45029 ^ i3;
                        i6 = i2;
                        s2 = s;
                    } else {
                        int iM450213 = C19806.m45029("֡᩻") ^ i14;
                        i16 = iM450213 ^ (-811991822);
                        i15 = ((iM450213 ^ i13) * 30629) ^ 702537069;
                        i10 = 55;
                    }
                    break;
                case -1504019642:
                case 158185197:
                    C0278.m1789();
                    if (C2249.f8050 >= 0) {
                        s = s2;
                        i2 = i6;
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩺") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i15 = (-481650095) ^ ((iM45029 ^ i13) * (-12815));
                        i3 = 1764415951;
                        i16 = iM45029 ^ i3;
                        i6 = i2;
                        s2 = s;
                    } else {
                        i = i6;
                        iM450210 = C19806.m45029("᩷᩵") ^ i13;
                        i15 = ((iM450210 ^ i14) * 7281) ^ (-484803621);
                        i4 = -372647711;
                        i16 = iM450210 ^ i4;
                        i6 = i;
                    }
                    break;
                case -1331022713:
                case -450652975:
                    if (i6 - (i7 + i8) <= 0) {
                        int iM450214 = C19806.m45029("ᩳ֫") ^ i14;
                        i = i6;
                        i16 = iM450214 ^ 281410865;
                        i15 = ((iM450214 ^ i13) * 4623) ^ (-132421744);
                    } else {
                        i = i6;
                        iM450210 = C19806.m45029("ܺ᩺") ^ i13;
                        i15 = ((iM450210 ^ i14) * 8541) ^ 1669949981;
                        i4 = 1324420931;
                        i16 = iM450210 ^ i4;
                    }
                    i6 = i;
                    break;
                case -1102574135:
                case 1079997443:
                    i = i6;
                    s2 = sArr[c];
                    s3 = 35826;
                    if (C1461.f5957 <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۙ᩶") ^ i13;
                        i15 = ((iM450210 ^ i14) * (-22427)) ^ 1895988166;
                        i4 = -1879657445;
                    } else {
                        iM450210 = (C19806.m45029("ܽ᩶") ^ i13) * (-21);
                        i15 = ((iM450210 ^ i14) * (-16747)) ^ (-1937148857);
                        i4 = 812772640;
                    }
                    i16 = iM450210 ^ i4;
                    i6 = i;
                    break;
                case -1020081907:
                case 1849512414:
                    s = s2;
                    i2 = i6;
                    sArr = f53096;
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩺") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i15 = (-481650095) ^ ((iM45029 ^ i13) * (-12815));
                        i3 = 1764415951;
                    } else {
                        iM45029 = (i13 - ThreadFactoryC3888.m11306("֨ܰ")) * (-101);
                        i15 = 1882917521 ^ ((iM45029 ^ i14) * (-30503));
                        i3 = -620657060;
                    }
                    i16 = iM45029 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case -1004246157:
                case 2088184720:
                    C1189.m4368();
                    if (AbstractC0464.f2088 > 0) {
                        i = i6;
                        iM450210 = C19806.m45029("᩷᩵") ^ i13;
                        i15 = ((iM450210 ^ i14) * 7281) ^ (-484803621);
                        i4 = -372647711;
                        i16 = iM450210 ^ i4;
                        i6 = i;
                    } else {
                        int iM11308 = (i13 - ThreadFactoryC3888.m11306("۫᩶")) * (-71);
                        s = s2;
                        i16 = iM11308 ^ 928636590;
                        i15 = ((iM11308 ^ i14) * 14679) ^ (-9268108);
                        s2 = s;
                    }
                    break;
                case -568052647:
                case 940846462:
                    C2704.m8238(animator, C2124.m6685(sArr2, i10, i11, i9));
                    break;
                case -460586507:
                case 1751214645:
                    if (C3577.f13150 >= 0) {
                        i11 = 9;
                        int iM11309 = (i13 - ThreadFactoryC3888.m11306("۫᩶")) * (-71);
                        s = s2;
                        i16 = iM11309 ^ 928636590;
                        i15 = ((iM11309 ^ i14) * 14679) ^ (-9268108);
                        s2 = s;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("ܶ۠") ^ i14) * (-39);
                        i16 = iM113010 ^ (-1316423770);
                        i15 = ((iM113010 ^ i13) * (-8997)) ^ (-582197460);
                        i11 = 9;
                    }
                    break;
                case -364219448:
                case 109360168:
                    C0278.m1789();
                    if (C2249.f8050 >= 0) {
                        s = s2;
                        i2 = i6;
                        iM45029 = (i14 - ThreadFactoryC3888.m11306("᩹ۚ")) * (-59);
                        i15 = (-734401443) ^ ((iM45029 ^ i13) * (-24837));
                        i3 = 464974721;
                        i16 = iM45029 ^ i3;
                        i6 = i2;
                        s2 = s;
                    }
                    int iM113011 = (i13 - ThreadFactoryC3888.m11306("۫᩶")) * (-71);
                    s = s2;
                    i16 = iM113011 ^ 928636590;
                    i15 = ((iM113011 ^ i14) * 14679) ^ (-9268108);
                    s2 = s;
                    break;
                case 101330206:
                case 867836008:
                    s = s2;
                    i2 = i6;
                    c = '6';
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩺") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i15 = (-481650095) ^ ((iM45029 ^ i13) * (-12815));
                        i3 = 1764415951;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩺") ^ i14;
                        i15 = 1190389342 ^ ((iM45029 ^ i13) * (-2689));
                        i3 = 1800056577;
                    }
                    i16 = iM45029 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case 726523053:
                case 849719639:
                    i5 = 53317;
                    int iM113012 = ThreadFactoryC3888.m11306("᩵ۚ") ^ i13;
                    int i17 = i5;
                    i16 = iM113012 ^ (-22513796);
                    i15 = ((iM113012 ^ i14) * 30657) ^ (-1686308312);
                    i9 = i17;
                    break;
                case 1003745620:
                case 1364879201:
                    i5 = 55117;
                    int iM113013 = ThreadFactoryC3888.m11306("᩵ۚ") ^ i13;
                    int i18 = i5;
                    i16 = iM113013 ^ (-22513796);
                    i15 = ((iM113013 ^ i14) * 30657) ^ (-1686308312);
                    i9 = i18;
                    break;
                case 1102053981:
                case 1796460890:
                    s = s2;
                    i2 = i6;
                    if (C2642.m8171() != 0) {
                        iM45029 = (i14 - ThreadFactoryC3888.m11306("᩹ۚ")) * (-59);
                        i15 = (-734401443) ^ ((iM45029 ^ i13) * (-24837));
                        i3 = 464974721;
                    } else {
                        iM45029 = C19806.m45029("۬᩸") ^ i14;
                        i15 = 204886583 ^ ((iM45029 ^ i13) * 21125);
                        i3 = -1141678696;
                    }
                    i16 = iM45029 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                case 1245596415:
                case 1307700009:
                    i = i6;
                    i8 = 320875569;
                    if (C1875.m6086() != 0) {
                        iM450210 = C19806.m45029("᩷᩵") ^ i13;
                        i15 = ((iM450210 ^ i14) * 7281) ^ (-484803621);
                        i4 = -372647711;
                    } else {
                        iM450210 = (i13 - ThreadFactoryC3888.m11306("ۚ֡")) * (-33);
                        i15 = ((iM450210 ^ i14) * (-32423)) ^ (-1414970894);
                        i4 = 133781352;
                    }
                    i16 = iM450210 ^ i4;
                    i6 = i;
                    break;
                case 1616679695:
                case 2060003214:
                    s = s2;
                    i2 = i6;
                    if (C3577.m10565()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۖ") ^ i14;
                        i15 = (-1973170485) ^ ((iM45029 ^ i13) * (-377));
                        i3 = 1160470424;
                    } else {
                        iM45029 = (i14 - ThreadFactoryC3888.m11306("᩹ۚ")) * (-59);
                        i15 = (-734401443) ^ ((iM45029 ^ i13) * (-24837));
                        i3 = 464974721;
                    }
                    i16 = iM45029 ^ i3;
                    i6 = i2;
                    s2 = s;
                    break;
                default:
                    C0629.m2907();
                    C3722.m10894();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x017e A[PHI: r4 r5 r8 r9 r10 r16
      0x017e: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int), (r4v1 int) binds: [B:47:0x017c, B:43:0x0159, B:29:0x00ab, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:47:0x017c, B:43:0x0159, B:29:0x00ab, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r8v3 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:47:0x017c, B:43:0x0159, B:29:0x00ab, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r9v7 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:47:0x017c, B:43:0x0159, B:29:0x00ab, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:47:0x017c, B:43:0x0159, B:29:0x00ab, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r16v16 short) = (r16v9 short), (r16v10 short), (r16v15 short), (r16v17 short) binds: [B:47:0x017c, B:43:0x0159, B:29:0x00ab, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (l.C1398.f5802 <= 0) goto L8;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationCancel(android.animation.Animator r19) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16527.onAnimationCancel(android.animation.Animator):void");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0174 A[PHI: r4 r6 r16
      0x0174: PHI (r4v2 int) = (r4v1 int), (r4v5 int) binds: [B:41:0x013b, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r6v3 short) = (r6v2 short), (r6v1 short) binds: [B:41:0x013b, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r16v21 int) = (r16v8 int), (r16v24 int) binds: [B:41:0x013b, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0221 A[PHI: r1 r16
      0x0221: PHI (r1v3 char) = (r1v1 char), (r1v2 char), (r1v1 char) binds: [B:63:0x021f, B:55:0x01df, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r16v17 int) = (r16v3 int), (r16v5 int), (r16v20 int) binds: [B:63:0x021f, B:55:0x01df, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0251 A[PHI: r0 r5 r8 r9 r16
      0x0251: PHI (r0v4 short[]) = (r0v1 short[]), (r0v3 short[]), (r0v1 short[]), (r0v1 short[]), (r0v1 short[]) binds: [B:67:0x024f, B:59:0x01ff, B:45:0x015b, B:29:0x00bc, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:67:0x024f, B:59:0x01ff, B:45:0x015b, B:29:0x00bc, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r8v3 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:67:0x024f, B:59:0x01ff, B:45:0x015b, B:29:0x00bc, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:67:0x024f, B:59:0x01ff, B:45:0x015b, B:29:0x00bc, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r16v13 int) = (r16v2 int), (r16v4 int), (r16v7 int), (r16v11 int), (r16v14 int) binds: [B:67:0x024f, B:59:0x01ff, B:45:0x015b, B:29:0x00bc, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (l.C1668.f6641 < 0) goto L14;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationRepeat(android.animation.Animator r19) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16527.onAnimationRepeat(android.animation.Animator):void");
    }

    public C16527(ViewOnClickListenerC12294 viewOnClickListenerC12294, ObjectAnimator objectAnimator) {
        int i = -387955488;
        int i2 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i3 = ThreadFactoryC3888.f14547;
        int iM45029 = C19806.m45029("ۢۛ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-17185)) ^ (-290183586);
        int i5 = -1309904181;
        while (true) {
            i = ((((i ^ i2) * 3041) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2103960196:
                case 1713382405:
                    this.f53097 = objectAnimator;
                    return;
                case -2062999317:
                case 842687333:
                    if (C19806.m45024()) {
                        iM45029 = (C19806.m45029("᩷ۚ") ^ i2) * (-127);
                        i4 = ((iM45029 ^ i3) * (-4947)) ^ 30899305;
                        i5 = 1196068209;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۤ") ^ i3) * 17;
                        i4 = ((iM45029 ^ i2) * 13015) ^ (-2083281832);
                        i5 = -1768041048;
                    }
                    break;
                case -1891226268:
                case -73731649:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ۧۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19637)) ^ 144481303;
                        i5 = 959357202;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩵۠")) * 99;
                        i4 = ((iM45029 ^ i3) * 2877) ^ 1999553864;
                        i5 = -820231026;
                    }
                    break;
                case -1707217386:
                case 1933267570:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܶ۟")) * 45;
                        i4 = ((iM45029 ^ i2) * 8291) ^ (-1720469722);
                        i5 = -1953777424;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21463)) ^ 2139678160;
                        i5 = -721720210;
                    }
                    break;
                case -1528988977:
                case 1199915629:
                    C3535.m10431();
                    if (C1668.f6641 < 0) {
                        iM45029 = (C19806.m45029("᩷ۚ") ^ i2) * (-127);
                        i4 = ((iM45029 ^ i3) * (-4947)) ^ 30899305;
                        i5 = 1196068209;
                    } else {
                        iM45029 = C19806.m45029("᩻᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5895) ^ 475278104;
                        i5 = -1207066122;
                    }
                    break;
                case -1214619386:
                case 1867380697:
                    C1875.m6086();
                    if (C1189.f5284 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩻") + i2) * (-43);
                        i4 = ((iM45029 ^ i3) * 16583) ^ 308726928;
                        i5 = -1186047789;
                    } else {
                        iM45029 = C19806.m45029("᩻᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5895) ^ 475278104;
                        i5 = -1207066122;
                    }
                    break;
                case -1104013039:
                case -1051210860:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܶ۟")) * 45;
                        i4 = ((iM45029 ^ i2) * 8291) ^ (-1720469722);
                        i5 = -1953777424;
                    } else {
                        iM45029 = C19806.m45029("ܳۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14885)) ^ (-905799861);
                        i5 = 54988743;
                    }
                    break;
                case -857653653:
                case -856567095:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܶ۟")) * 45;
                        i4 = ((iM45029 ^ i2) * 8291) ^ (-1720469722);
                        i5 = -1953777424;
                    } else {
                        iM45029 = C19806.m45029("۟ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4455) ^ (-1330191070);
                        i5 = 1683567234;
                    }
                    break;
                case -669371487:
                case 163044076:
                    C3743.m10966();
                    C2249.m6915();
                    iM45029 = C19806.m45029("᩻᩺") ^ i3;
                    i4 = ((iM45029 ^ i2) * 5895) ^ 475278104;
                    i5 = -1207066122;
                    break;
                case -520092767:
                case -142553972:
                    if (!C1377.f5749) {
                        iM45029 = C19806.m45029("ۧۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19637)) ^ 144481303;
                        i5 = 959357202;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩻") + i2) * (-43);
                        i4 = ((iM45029 ^ i3) * 16583) ^ 308726928;
                        i5 = -1186047789;
                    }
                    break;
                case -410049290:
                case 760440378:
                    this.f53098 = viewOnClickListenerC12294;
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("᩻᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5895) ^ 475278104;
                        i5 = -1207066122;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31465) ^ 976246021;
                        i5 = -397324542;
                    }
                    break;
                case -313844690:
                case 1875466425:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ۧۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19637)) ^ 144481303;
                        i5 = 959357202;
                    } else {
                        iM45029 = C19806.m45029("֫۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17039)) ^ 296771337;
                        i5 = 2006020422;
                    }
                    break;
                case -17235029:
                case 1054280308:
                    if (C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩻") + i2) * (-43);
                        i4 = ((iM45029 ^ i3) * 16583) ^ 308726928;
                        i5 = -1186047789;
                    } else {
                        iM45029 = (C19806.m45029("ܶ۬") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i2) * 6699) ^ 1218432032;
                        i5 = 795127901;
                    }
                    break;
                case 478272645:
                case 720770658:
                    if (C0797.f3386) {
                        iM45029 = (i3 - C19806.m45029("ܶ۟")) * 45;
                        i4 = ((iM45029 ^ i2) * 8291) ^ (-1720469722);
                        i5 = -1953777424;
                    } else {
                        iM45029 = C19806.m45029("᩸᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7385) ^ 313495400;
                        i5 = -1542545731;
                    }
                    break;
                case 1241588816:
                case 2029511898:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܶ۟")) * 45;
                        i4 = ((iM45029 ^ i2) * 8291) ^ (-1720469722);
                        i5 = -1953777424;
                    } else {
                        iM45029 = C19806.m45029("ܳ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20557)) ^ (-558506593);
                        i5 = -2051540094;
                    }
                    break;
                default:
                    C0216.m1591();
                    C1398.m4895();
                    throw new RuntimeException();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int iM11306;
        int i;
        int i2;
        boolean z;
        short[] sArr;
        ViewOnClickListenerC12294 viewOnClickListenerC12294;
        short[] sArr2;
        int iM11307;
        int i3;
        int i4;
        TextView textView;
        AbstractActivityC12483 abstractActivityC12483;
        int iM45029;
        int i5;
        int i6;
        int iM11308;
        int i7;
        int i8;
        short[] sArr3;
        AbstractActivityC12483 abstractActivityC12484;
        int iM450210;
        int i9;
        int i10;
        C16527 c16527 = this;
        int i11 = 1762939878;
        int i12 = C3660.f13403;
        int i13 = C7105.f23796;
        int iM450211 = C19806.m45029("᩸᩶") ^ i12;
        int i14 = ((iM450211 ^ i13) * 22941) ^ (-727023073);
        int i15 = iM450211 ^ 1957138428;
        TextInputLayout textInputLayout = null;
        AbstractActivityC12483 abstractActivityC12485 = null;
        TextInputLayout textInputLayout2 = null;
        AbstractActivityC12483 abstractActivityC12486 = null;
        TextInputLayout textInputLayout3 = null;
        AbstractActivityC12483 abstractActivityC12487 = null;
        String strM2424 = null;
        String str = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        ViewOnClickListenerC12294 viewOnClickListenerC12295 = null;
        boolean z2 = false;
        int iM11309 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int iM113010 = 0;
        int iM113011 = 0;
        int iM450212 = 0;
        int iM113012 = 0;
        short s = 0;
        short s2 = 0;
        int iM450213 = 0;
        int i18 = 0;
        TextView textView2 = null;
        AbstractActivityC12483 abstractActivityC12488 = null;
        TextInputLayout textInputLayout4 = null;
        short[] sArr7 = null;
        int i19 = 0;
        TextView textView3 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-13845)) >> 31));
            switch (i11) {
                case -2136767204:
                case 87529207:
                    viewOnClickListenerC12295.f41109.setErrorEnabled(z3);
                    viewOnClickListenerC12295.f41104.setErrorEnabled(z3);
                    RunnableC1606.m5469(c16527.f53097);
                    break;
                case -2071103873:
                case 1099441355:
                    abstractActivityC12486 = abstractActivityC12486;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12488 = abstractActivityC12488;
                    z = z2;
                    sArr = sArr6;
                    iM450213 = C19806.m45029(strM2424) ^ 2099430156;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("۫ܺ") ^ i12;
                        i7 = ((iM11308 ^ i13) * 9677) ^ 714886383;
                        i8 = -2075377482;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i12;
                        i7 = ((iM11308 ^ i13) * (-1555)) ^ (-1151390212);
                        i8 = 1380410758;
                    }
                    i15 = iM11308 ^ i8;
                    i14 = i7;
                    sArr6 = sArr;
                    z2 = z;
                    abstractActivityC12486 = abstractActivityC12486;
                    abstractActivityC12488 = abstractActivityC12488;
                    textInputLayout2 = textInputLayout2;
                    break;
                case -1833272304:
                case 1543690395:
                    C1977.m6356();
                    if (C1668.f6641 >= 0) {
                        viewOnClickListenerC12294 = viewOnClickListenerC12295;
                        abstractActivityC12486 = abstractActivityC12486;
                        textView2 = textView2;
                        textInputLayout2 = textInputLayout2;
                        abstractActivityC12488 = abstractActivityC12488;
                        sArr6 = sArr6;
                        z2 = z2;
                        sArr2 = sArr4;
                        int iM113013 = ThreadFactoryC3888.m11306("ۗ᩵") ^ i13;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                        sArr4 = sArr2;
                        z2 = z2;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i14 = ((iM113013 ^ i12) * (-18239)) ^ (-1919216621);
                        i15 = iM113013 ^ (-1312222479);
                        abstractActivityC12488 = abstractActivityC12488;
                        abstractActivityC12486 = abstractActivityC12486;
                        c16527 = this;
                        textInputLayout2 = textInputLayout2;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩶") ^ i12) * 77;
                        i = ((iM11306 ^ i13) * 24027) ^ 628349037;
                        i2 = -1962147025;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1779014783:
                case -1395232065:
                    EditText editTextM3740 = C0962.m3740(viewOnClickListenerC12295.f41104);
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(editTextM3740);
                    editTextM3740.setInputType(33);
                    viewOnClickListenerC12295.f41104.setEndIconVisible(z3);
                    iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩵") + i13) * (-123);
                    i = ((iM11306 ^ i12) * (-2467)) ^ 1339740268;
                    i2 = 1083694956;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1701473040:
                case 28920551:
                    z3 = false;
                    if (viewOnClickListenerC12295.f41114) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩻") + i13) * (-53);
                        i = ((iM11306 ^ i12) * (-32205)) ^ 1958887332;
                        i2 = -1921170884;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۙ") ^ i12) * 25;
                        i = ((iM11306 ^ i13) * (-20833)) ^ (-673517626);
                        i2 = -1570482896;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1684739883:
                case 1319647487:
                    abstractActivityC12486 = abstractActivityC12486;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12488 = abstractActivityC12488;
                    sArr6 = sArr6;
                    z2 = z2;
                    TextView textView4 = textView2;
                    C19806.m45022(textView4, iM113010 ^ 2127914846);
                    textInputLayout = viewOnClickListenerC12295.f41109;
                    if (C1460.f5948 < 0) {
                        int iM450214 = C19806.m45029("ۡ۠") ^ i12;
                        i15 = iM450214 ^ (-1835245434);
                        textView2 = textView4;
                        i14 = ((iM450214 ^ i13) * 10601) ^ (-1786441932);
                        z2 = z2;
                        abstractActivityC12486 = abstractActivityC12486;
                        sArr6 = sArr6;
                        abstractActivityC12488 = abstractActivityC12488;
                        textInputLayout2 = textInputLayout2;
                    } else {
                        viewOnClickListenerC12294 = viewOnClickListenerC12295;
                        textView2 = textView4;
                        sArr2 = sArr4;
                        int iM113014 = ThreadFactoryC3888.m11306("ۗ᩵") ^ i13;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                        sArr4 = sArr2;
                        z2 = z2;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i14 = ((iM113014 ^ i12) * (-18239)) ^ (-1919216621);
                        i15 = iM113014 ^ (-1312222479);
                        abstractActivityC12488 = abstractActivityC12488;
                        abstractActivityC12486 = abstractActivityC12486;
                        c16527 = this;
                        textInputLayout2 = textInputLayout2;
                    }
                    break;
                case -1435659820:
                case 1393667043:
                    abstractActivityC12484 = abstractActivityC12488;
                    textInputLayout2 = textInputLayout2;
                    textInputLayout2.setHint(C0817.m3412(abstractActivityC12484, iM113011 ^ 2122921416));
                    ThreadFactoryC3888.m11303(viewOnClickListenerC12295.f41113, i16);
                    C19806.m45022(viewOnClickListenerC12295.f41103, i19);
                    int iM113015 = (ThreadFactoryC3888.m11306("ۤܶ") ^ i13) * 15;
                    abstractActivityC12483 = abstractActivityC12484;
                    i15 = iM113015 ^ (-631414988);
                    i14 = ((iM113015 ^ i12) * (-9913)) ^ 1103003111;
                    abstractActivityC12488 = abstractActivityC12483;
                    abstractActivityC12486 = abstractActivityC12486;
                    textInputLayout2 = textInputLayout2;
                    break;
                case -1300174231:
                case 1235184717:
                    textInputLayout3.setHint(C0817.m3412(abstractActivityC12487, iM113012 ^ 2122654214));
                    C19806.m45022(viewOnClickListenerC12295.f41113, i19);
                    ThreadFactoryC3888.m11303(viewOnClickListenerC12295.f41103, i16);
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12484 = abstractActivityC12488;
                    int iM113016 = (ThreadFactoryC3888.m11306("ۤܶ") ^ i13) * 15;
                    abstractActivityC12483 = abstractActivityC12484;
                    i15 = iM113016 ^ (-631414988);
                    i14 = ((iM113016 ^ i12) * (-9913)) ^ 1103003111;
                    abstractActivityC12488 = abstractActivityC12483;
                    abstractActivityC12486 = abstractActivityC12486;
                    textInputLayout2 = textInputLayout2;
                    break;
                case -1279864216:
                case -1068560611:
                    sArr6 = sArr6;
                    textView2 = viewOnClickListenerC12295.f41106;
                    iM113010 = ThreadFactoryC3888.m11306(RunnableC3388.m10056(f53096, 26, 3, i17));
                    iM45029 = C19806.m45029("ۧۗ") ^ i13;
                    i5 = ((iM45029 ^ i12) * 20377) ^ 1292635254;
                    i6 = 1374708010;
                    i15 = iM45029 ^ i6;
                    i14 = i5;
                    z2 = z2;
                    abstractActivityC12486 = abstractActivityC12486;
                    sArr6 = sArr6;
                    abstractActivityC12488 = abstractActivityC12488;
                    textInputLayout2 = textInputLayout2;
                    break;
                case -1129486260:
                case 1208541553:
                    iM11309 = 2128100118 ^ ThreadFactoryC3888.m11306(str);
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩶") ^ i12) * 77;
                        i = ((iM11306 ^ i13) * 24027) ^ 628349037;
                        i2 = -1962147025;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ᩳ") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i13) * (-31621)) ^ 1535218895;
                        i2 = 1712243731;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1008769180:
                case 1047356892:
                    abstractActivityC12486 = abstractActivityC12486;
                    textView = textView2;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12488 = abstractActivityC12488;
                    sArr3 = sArr6;
                    z2 = true;
                    viewOnClickListenerC12295.f41114 = !z4;
                    z5 = viewOnClickListenerC12295.f41114;
                    sArr4 = f53096;
                    i18 = 20;
                    if (C1875.f7103 >= 0) {
                        iM450210 = C19806.m45029("۠ۛ") ^ i13;
                        i9 = ((iM450210 ^ i12) * (-25039)) ^ (-229936077);
                        i10 = 1996572303;
                    } else {
                        iM450210 = C19806.m45029("۬֡") ^ i13;
                        i9 = ((iM450210 ^ i12) * (-1771)) ^ (-649509379);
                        i10 = -905803386;
                    }
                    i15 = iM450210 ^ i10;
                    i14 = i9;
                    viewOnClickListenerC12295 = viewOnClickListenerC12295;
                    abstractActivityC12488 = abstractActivityC12488;
                    sArr6 = sArr3;
                    textView2 = textView;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12486 = abstractActivityC12486;
                    break;
                case -974488064:
                case 746741897:
                    AbstractActivityC12483 abstractActivityC12489 = abstractActivityC12486;
                    boolean z6 = z2;
                    AbstractActivityC12483 abstractActivityC124810 = abstractActivityC12485;
                    int i20 = iM450213;
                    TextInputLayout textInputLayout5 = textInputLayout;
                    textInputLayout5.setHint(C0817.m3412(abstractActivityC124810, i20));
                    textInputLayout2 = viewOnClickListenerC12295.f41104;
                    AbstractActivityC12483 abstractActivityC124811 = viewOnClickListenerC12295.f41110;
                    sArr6 = f53096;
                    int iM113017 = (ThreadFactoryC3888.m11306("ۨܽ") ^ i12) * (-77);
                    abstractActivityC12485 = abstractActivityC124810;
                    i14 = ((iM113017 ^ i13) * (-31629)) ^ 1713595033;
                    i15 = iM113017 ^ 926079880;
                    iM450213 = i20;
                    textInputLayout = textInputLayout5;
                    abstractActivityC12486 = abstractActivityC12489;
                    abstractActivityC12488 = abstractActivityC124811;
                    z2 = z6;
                    break;
                case -722715720:
                case -663658846:
                    ThreadFactoryC3888.m11303(textView3, iM450212 ^ 2100763836);
                    textInputLayout4 = viewOnClickListenerC12295.f41109;
                    if (C2249.m6915() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۘ") ^ i12;
                        i = ((iM11306 ^ i13) * 1949) ^ (-704589710);
                        i2 = -1540691400;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    } else {
                        viewOnClickListenerC12294 = viewOnClickListenerC12295;
                        abstractActivityC12486 = abstractActivityC12486;
                        textView2 = textView2;
                        textInputLayout2 = textInputLayout2;
                        abstractActivityC12488 = abstractActivityC12488;
                        sArr6 = sArr6;
                        z2 = z2;
                        sArr2 = sArr4;
                        int iM113018 = ThreadFactoryC3888.m11306("ۗ᩵") ^ i13;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                        sArr4 = sArr2;
                        z2 = z2;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i14 = ((iM113018 ^ i12) * (-18239)) ^ (-1919216621);
                        i15 = iM113018 ^ (-1312222479);
                        abstractActivityC12488 = abstractActivityC12488;
                        abstractActivityC12486 = abstractActivityC12486;
                        c16527 = this;
                        textInputLayout2 = textInputLayout2;
                    }
                    break;
                case -712290911:
                case 833688344:
                    i17 = 14123;
                    iM11307 = C19806.m45029("ۡᩴ") ^ i12;
                    i14 = ((iM11307 ^ i13) * (-31857)) ^ 1892921063;
                    i3 = -1125359962;
                    i4 = iM11307 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC12295 = viewOnClickListenerC12295;
                    z2 = z2;
                    abstractActivityC12486 = abstractActivityC12486;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    i15 = i4;
                    abstractActivityC12488 = abstractActivityC12488;
                    c16527 = this;
                    textInputLayout2 = textInputLayout2;
                    break;
                case -564306401:
                case 36576946:
                    abstractActivityC12486 = abstractActivityC12486;
                    TextView textView5 = textView2;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12483 = abstractActivityC12488;
                    short[] sArr8 = sArr6;
                    boolean z7 = z2;
                    short[] sArr9 = sArr5;
                    int iM450215 = C19806.m45029(C0797.m3361(sArr9, 23, 3, i17)) ^ 2129580635;
                    if (z5) {
                        int iM450216 = (C19806.m45029("ۨᩳ") + i13) * (-61);
                        i14 = ((iM450216 ^ i12) * 21335) ^ 1809033674;
                        i15 = iM450216 ^ (-1631899961);
                    } else {
                        int iM450217 = (i12 - C19806.m45029("ۚۛ")) * 61;
                        i15 = iM450217 ^ (-1744864238);
                        i14 = ((iM450217 ^ i13) * 26081) ^ 158053312;
                    }
                    sArr5 = sArr9;
                    i19 = iM450215;
                    z2 = z7;
                    sArr6 = sArr8;
                    textView2 = textView5;
                    abstractActivityC12488 = abstractActivityC12483;
                    abstractActivityC12486 = abstractActivityC12486;
                    textInputLayout2 = textInputLayout2;
                    break;
                case -529835631:
                case 887876359:
                    textInputLayout4.setHint(C0817.m3412(abstractActivityC12486, iM11309));
                    textInputLayout3 = viewOnClickListenerC12295.f41104;
                    abstractActivityC12487 = viewOnClickListenerC12295.f41110;
                    sArr7 = f53096;
                    iM11306 = ThreadFactoryC3888.m11306("᩵۟") ^ i13;
                    i = ((iM11306 ^ i12) * (-12887)) ^ 672953844;
                    i2 = -788605647;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -485826495:
                case 1315295188:
                    abstractActivityC12486 = abstractActivityC12486;
                    textView2 = textView2;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12488 = abstractActivityC12488;
                    sArr6 = sArr6;
                    viewOnClickListenerC12295 = viewOnClickListenerC12295;
                    z2 = z2;
                    sArr4 = sArr4;
                    s = f53096[10];
                    s2 = 25076;
                    if (C1460.f5948 >= 0) {
                        iM11307 = C19806.m45029("ܳۖ") ^ i12;
                        i14 = ((iM11307 ^ i13) * (-15427)) ^ 923864184;
                        i3 = -877912101;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܰ֫") ^ i12;
                        i14 = ((iM11307 ^ i13) * (-28329)) ^ (-1631263102);
                        i3 = -237557561;
                    }
                    i4 = iM11307 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC12295 = viewOnClickListenerC12295;
                    z2 = z2;
                    abstractActivityC12486 = abstractActivityC12486;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    i15 = i4;
                    abstractActivityC12488 = abstractActivityC12488;
                    c16527 = this;
                    textInputLayout2 = textInputLayout2;
                    break;
                case -216831739:
                case 345534972:
                    C0797.m3359();
                    C2332.m7079();
                    break;
                case -203295316:
                case 1719266815:
                    abstractActivityC12486 = abstractActivityC12486;
                    textView2 = textView2;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12488 = abstractActivityC12488;
                    sArr6 = sArr6;
                    viewOnClickListenerC12295 = viewOnClickListenerC12295;
                    z2 = z2;
                    sArr4 = sArr4;
                    if ((s * s2) - ((s * s) + 157201444) > 0) {
                        iM11307 = C19806.m45029("֨֨") ^ i13;
                        i14 = ((iM11307 ^ i12) * (-7551)) ^ 1059747093;
                        i3 = 902775835;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۜۛ") ^ i13;
                        i14 = ((iM11307 ^ i12) * (-7017)) ^ (-1017287028);
                        i3 = -69886648;
                    }
                    i4 = iM11307 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC12295 = viewOnClickListenerC12295;
                    z2 = z2;
                    abstractActivityC12486 = abstractActivityC12486;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    i15 = i4;
                    abstractActivityC12488 = abstractActivityC12488;
                    c16527 = this;
                    textInputLayout2 = textInputLayout2;
                    break;
                case -182079375:
                case 864321068:
                    AbstractActivityC12483 abstractActivityC124812 = viewOnClickListenerC12295.f41110;
                    String strM6105 = C1875.m6105(f53096, 38, 3, i17);
                    int iM450218 = (C19806.m45029("᩶ܺ") ^ i13) * 75;
                    i = ((iM450218 ^ i12) * (-14317)) ^ 1817609363;
                    i15 = iM450218 ^ 71667048;
                    abstractActivityC12486 = abstractActivityC124812;
                    str = strM6105;
                    i14 = i;
                    break;
                case -40773962:
                case 446282516:
                    iM113012 = ThreadFactoryC3888.m11306(C2704.m8240(sArr7, 41, 3, i17));
                    if (!C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۘ") ^ i12;
                        i = ((iM11306 ^ i13) * (-27171)) ^ (-1014384871);
                        i2 = -567149693;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    } else {
                        abstractActivityC12486 = abstractActivityC12486;
                        textInputLayout2 = textInputLayout2;
                        abstractActivityC12488 = abstractActivityC12488;
                        z = z2;
                        sArr = sArr6;
                        iM11308 = ThreadFactoryC3888.m11306("۫ܺ") ^ i12;
                        i7 = ((iM11308 ^ i13) * 9677) ^ 714886383;
                        i8 = -2075377482;
                        i15 = iM11308 ^ i8;
                        i14 = i7;
                        sArr6 = sArr;
                        z2 = z;
                        abstractActivityC12486 = abstractActivityC12486;
                        abstractActivityC12488 = abstractActivityC12488;
                        textInputLayout2 = textInputLayout2;
                    }
                    break;
                case -30792404:
                case 6684828:
                    abstractActivityC12486 = abstractActivityC12486;
                    textView = textView2;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12488 = abstractActivityC12488;
                    sArr6 = sArr6;
                    z2 = z2;
                    sArr4 = sArr4;
                    int i21 = i18;
                    int iM450219 = C19806.m45029(C1189.m4365(sArr4, i21, 3, i17)) ^ 2125315148;
                    sArr5 = f53096;
                    if (!C2704.f10408) {
                        viewOnClickListenerC12295 = viewOnClickListenerC12295;
                        textView2 = textView;
                        i18 = i21;
                        i16 = iM450219;
                        iM11307 = C19806.m45029("ܳۖ") ^ i12;
                        i14 = ((iM11307 ^ i13) * (-15427)) ^ 923864184;
                        i3 = -877912101;
                        i4 = iM11307 ^ i3;
                        sArr4 = sArr4;
                        viewOnClickListenerC12295 = viewOnClickListenerC12295;
                        z2 = z2;
                        abstractActivityC12486 = abstractActivityC12486;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i4;
                        abstractActivityC12488 = abstractActivityC12488;
                        c16527 = this;
                        textInputLayout2 = textInputLayout2;
                    } else {
                        int iM113019 = (i13 - ThreadFactoryC3888.m11306("۫ۤ")) * (-79);
                        i14 = ((iM113019 ^ i12) * 20715) ^ 1375235466;
                        sArr4 = sArr4;
                        i18 = i21;
                        z2 = z2;
                        sArr6 = sArr6;
                        i16 = iM450219;
                        i15 = iM113019 ^ 1427331817;
                        abstractActivityC12488 = abstractActivityC12488;
                        textView2 = textView;
                        textInputLayout2 = textInputLayout2;
                        abstractActivityC12486 = abstractActivityC12486;
                    }
                    break;
                case -5528524:
                case 1073815117:
                    i17 = 48310;
                    iM11307 = C19806.m45029("ۡᩴ") ^ i12;
                    i14 = ((iM11307 ^ i13) * (-31857)) ^ 1892921063;
                    i3 = -1125359962;
                    i4 = iM11307 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC12295 = viewOnClickListenerC12295;
                    z2 = z2;
                    abstractActivityC12486 = abstractActivityC12486;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    i15 = i4;
                    abstractActivityC12488 = abstractActivityC12488;
                    c16527 = this;
                    textInputLayout2 = textInputLayout2;
                    break;
                case 87203290:
                case 2108559557:
                    abstractActivityC12485 = viewOnClickListenerC12295.f41110;
                    sArr6 = sArr6;
                    strM2424 = C0526.m2424(f53096, 29, 3, i17);
                    iM45029 = (C19806.m45029("ۗᩳ") + i13) * 101;
                    i5 = ((iM45029 ^ i12) * (-16343)) ^ (-315964960);
                    i6 = -1736730948;
                    i15 = iM45029 ^ i6;
                    i14 = i5;
                    z2 = z2;
                    abstractActivityC12486 = abstractActivityC12486;
                    sArr6 = sArr6;
                    abstractActivityC12488 = abstractActivityC12488;
                    textInputLayout2 = textInputLayout2;
                    break;
                case 333626458:
                case 1554894994:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!C0797.f3386) {
                        abstractActivityC12486 = abstractActivityC12486;
                        textView = textView2;
                        textInputLayout2 = textInputLayout2;
                        abstractActivityC12488 = abstractActivityC12488;
                        sArr3 = sArr6;
                        iM450210 = C19806.m45029("۠ۛ") ^ i13;
                        i9 = ((iM450210 ^ i12) * (-25039)) ^ (-229936077);
                        i10 = 1996572303;
                        i15 = iM450210 ^ i10;
                        i14 = i9;
                        viewOnClickListenerC12295 = viewOnClickListenerC12295;
                        abstractActivityC12488 = abstractActivityC12488;
                        sArr6 = sArr3;
                        textView2 = textView;
                        textInputLayout2 = textInputLayout2;
                        abstractActivityC12486 = abstractActivityC12486;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩶") ^ i12) * 77;
                        i = ((iM11306 ^ i13) * 24027) ^ 628349037;
                        i2 = -1962147025;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    }
                    break;
                case 347155172:
                case 1466758890:
                    abstractActivityC12486 = abstractActivityC12486;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12488 = abstractActivityC12488;
                    z = z2;
                    sArr = sArr6;
                    iM113011 = ThreadFactoryC3888.m11306(C0526.m2424(sArr, 32, 3, i17));
                    if (C3722.m10894() > 0) {
                        iM11308 = C19806.m45029("ۗۨ") ^ i13;
                        i7 = ((iM11308 ^ i12) * (-26137)) ^ (-320971108);
                        i8 = -1720376259;
                        i15 = iM11308 ^ i8;
                        i14 = i7;
                        sArr6 = sArr;
                        z2 = z;
                        abstractActivityC12486 = abstractActivityC12486;
                        abstractActivityC12488 = abstractActivityC12488;
                        textInputLayout2 = textInputLayout2;
                    } else {
                        sArr3 = sArr;
                        textView = textView2;
                        z2 = z;
                        iM450210 = C19806.m45029("۠ۛ") ^ i13;
                        i9 = ((iM450210 ^ i12) * (-25039)) ^ (-229936077);
                        i10 = 1996572303;
                        i15 = iM450210 ^ i10;
                        i14 = i9;
                        viewOnClickListenerC12295 = viewOnClickListenerC12295;
                        abstractActivityC12488 = abstractActivityC12488;
                        sArr6 = sArr3;
                        textView2 = textView;
                        textInputLayout2 = textInputLayout2;
                        abstractActivityC12486 = abstractActivityC12486;
                    }
                    break;
                case 725782614:
                case 763367456:
                    abstractActivityC12486 = abstractActivityC12486;
                    textInputLayout2 = textInputLayout2;
                    abstractActivityC12488 = abstractActivityC12488;
                    sArr6 = sArr6;
                    z2 = z2;
                    sArr2 = sArr4;
                    textView2 = textView2;
                    C2704.m8238(animator, C3535.m10423(f53096, 11, 9, i17));
                    viewOnClickListenerC12294 = c16527.f53098;
                    z4 = viewOnClickListenerC12294.f41114;
                    if (C1875.f7103 >= 0) {
                        int iM1130110 = ThreadFactoryC3888.m11306("ۗ᩵") ^ i13;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                        sArr4 = sArr2;
                        z2 = z2;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i14 = ((iM1130110 ^ i12) * (-18239)) ^ (-1919216621);
                        i15 = iM1130110 ^ (-1312222479);
                        abstractActivityC12488 = abstractActivityC12488;
                        abstractActivityC12486 = abstractActivityC12486;
                    } else {
                        int iM113020 = (ThreadFactoryC3888.m11306("֨᩻") ^ i12) * 127;
                        int i22 = ((iM113020 ^ i13) * (-24123)) ^ (-1079920477);
                        i4 = iM113020 ^ 27802284;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                        i14 = i22;
                        sArr4 = sArr2;
                        z2 = z2;
                        abstractActivityC12486 = abstractActivityC12486;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i4;
                        abstractActivityC12488 = abstractActivityC12488;
                    }
                    c16527 = this;
                    textInputLayout2 = textInputLayout2;
                    break;
                case 1281337889:
                case 2074978720:
                    C1875.m6086();
                    iM11306 = (ThreadFactoryC3888.m11306("ۚ᩶") ^ i12) * 77;
                    i = ((iM11306 ^ i13) * 24027) ^ 628349037;
                    i2 = -1962147025;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case 1520044328:
                case 1533365353:
                    textView3 = viewOnClickListenerC12295.f41106;
                    abstractActivityC12486 = abstractActivityC12486;
                    iM450212 = C19806.m45029(C0797.m3361(f53096, 35, 3, i17));
                    int iM113021 = (ThreadFactoryC3888.m11306("᩺᩶") ^ i12) * 29;
                    i15 = iM113021 ^ (-153822527);
                    i14 = ((iM113021 ^ i13) * 11045) ^ (-1833539866);
                    abstractActivityC12486 = abstractActivityC12486;
                    break;
                case 1920088549:
                case 1945581669:
                    EditText editTextM3741 = C0962.m3740(viewOnClickListenerC12295.f41104);
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(editTextM3741);
                    editTextM3741.setInputType(129);
                    viewOnClickListenerC12295.f41104.setEndIconVisible(z2);
                    iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩵") + i13) * (-123);
                    i = ((iM11306 ^ i12) * (-2467)) ^ 1339740268;
                    i2 = 1083694956;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                default:
                    if (C0629.f2722 <= 0) {
                        abstractActivityC12486 = abstractActivityC12486;
                        textView2 = textView2;
                        textInputLayout2 = textInputLayout2;
                        abstractActivityC12488 = abstractActivityC12488;
                        sArr6 = sArr6;
                        viewOnClickListenerC12295 = viewOnClickListenerC12295;
                        z2 = z2;
                        sArr4 = sArr4;
                        iM11307 = C19806.m45029("ܳۖ") ^ i12;
                        i14 = ((iM11307 ^ i13) * (-15427)) ^ 923864184;
                        i3 = -877912101;
                        i4 = iM11307 ^ i3;
                        sArr4 = sArr4;
                        viewOnClickListenerC12295 = viewOnClickListenerC12295;
                        z2 = z2;
                        abstractActivityC12486 = abstractActivityC12486;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i4;
                        abstractActivityC12488 = abstractActivityC12488;
                        c16527 = this;
                        textInputLayout2 = textInputLayout2;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩶") ^ i12) * 77;
                        i = ((iM11306 ^ i13) * 24027) ^ 628349037;
                        i2 = -1962147025;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                    }
                    break;
            }
            return;
        }
    }
}
