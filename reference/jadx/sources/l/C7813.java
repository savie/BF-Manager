package l;

import android.animation.Animator;
import android.view.View;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7813 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫᩵ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f26029 = {1980, 8938, 8933, 8930, 8934, 8938, 8959, 8930, 8932, 8933, 318, -4830, -4819, -4822, -4818, -4830, -4809, -4822, -4820, -4819, 323, 1737, 1734, 1729, 1733, 1737, 1756, 1729, 1735, 1734, 8337, -7541, -7548, -7549, -7545, -7541, -7522, -7549, -7547, -7548, -25931, -28581, -27995};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f26030;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1101 f26031;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f26032;

    /* JADX WARN: Code duplicated, block: B:61:0x0244 A[PHI: r1 r10 r16 r17
      0x0244: PHI (r1v3 char) = (r1v1 char), (r1v1 char), (r1v2 char), (r1v1 char) binds: [B:24:0x007f, B:60:0x0242, B:52:0x01e9, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r10v7 int) = (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:24:0x007f, B:60:0x0242, B:52:0x01e9, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r16v14 int) = (r16v2 int), (r16v5 int), (r16v7 int), (r16v15 int) binds: [B:24:0x007f, B:60:0x0242, B:52:0x01e9, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r17v16 short) = (r17v0 short), (r17v5 short), (r17v7 short), (r17v17 short) binds: [B:24:0x007f, B:60:0x0242, B:52:0x01e9, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x029d A[PHI: r6 r16 r17
      0x029d: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:68:0x029b, B:64:0x0279, B:39:0x0141, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r16v16 int) = (r16v3 int), (r16v4 int), (r16v10 int), (r16v17 int) binds: [B:68:0x029b, B:64:0x0279, B:39:0x0141, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r17v18 short) = (r17v3 short), (r17v4 short), (r17v9 short), (r17v19 short) binds: [B:68:0x029b, B:64:0x0279, B:39:0x0141, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        short s;
        int i;
        int iM3169;
        int i2;
        int iM31610;
        int i3;
        int i4;
        short[] sArr = null;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1830995807;
        int i12 = C1519.f5300;
        int i13 = C3734.f12817;
        int iM31611 = C0773.m3169("ۧۢ") ^ i13;
        int i14 = ((iM31611 ^ i12) * 9383) ^ (-1782447523);
        int i15 = iM31611 ^ (-172830363);
        while (true) {
            i11 = ((((i11 ^ i12) * (-13017)) >> 31) & i14) ^ i15;
            switch (i11) {
                case -1767948434:
                case -590789407:
                    i = i5;
                    i7 = 56265001;
                    if (C1343.f4799 == 0) {
                        iM31610 = (C0773.m3169("ۛܿ") ^ i13) * (-51);
                        i14 = ((iM31610 ^ i12) * 9277) ^ 2046132005;
                        i3 = -2000113886;
                        i15 = iM31610 ^ i3;
                        i5 = i;
                    } else {
                        s = s2;
                        iM3169 = C0773.m3169("۟ܰ") ^ i12;
                        i14 = 286740180 ^ ((iM3169 ^ i13) * 19689);
                        i2 = 1779616711;
                        i15 = iM3169 ^ i2;
                        i5 = i;
                        s2 = s;
                    }
                    break;
                case -1740630577:
                case -951679122:
                    C17202.m40379(animator, C3998.m12925(sArr2, i9, i10, i8));
                    break;
                case -1483352956:
                case -1354851860:
                    i4 = 1704;
                    int iM2761 = (C0619.m2761("ܰᩴ") ^ i12) * 91;
                    int i16 = i4;
                    i15 = iM2761 ^ 1058738031;
                    i14 = ((iM2761 ^ i13) * 15565) ^ 1416282374;
                    i8 = i16;
                    break;
                case -1251178551:
                case 689472914:
                    if (C3099.f10023 <= 0) {
                        s = s2;
                        i = i5;
                        iM3169 = (i12 - C0773.m3169("ۚ֡")) * 109;
                        i14 = 1291015648 ^ ((iM3169 ^ i13) * 29977);
                        i2 = 363120565;
                        i15 = iM3169 ^ i2;
                        i5 = i;
                        s2 = s;
                    }
                    s = s2;
                    i = i5;
                    iM3169 = (i13 - C0773.m3169("᩸ܳ")) * (-103);
                    i14 = 1825746817 ^ ((iM3169 ^ i12) * (-9045));
                    i2 = 1125934356;
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
                case -1167003031:
                case -1142303113:
                    i = i5;
                    s2 = sArr[c];
                    s3 = 15002;
                    if (C2834.m9344() >= 0) {
                        iM31610 = C0773.m3169("ۙ۫") ^ i13;
                        i14 = ((iM31610 ^ i12) * 15213) ^ (-1494954692);
                        i3 = -205440931;
                    } else {
                        iM31610 = C0773.m3169("ܰۖ") ^ i13;
                        i14 = ((iM31610 ^ i12) * (-23567)) ^ (-266124337);
                        i3 = -1870348635;
                    }
                    i15 = iM31610 ^ i3;
                    i5 = i;
                    break;
                case -989653189:
                case -767983344:
                    if (i5 - (i6 + i7) <= 0) {
                        int iM2762 = C0619.m2761("ۢ᩵") ^ i13;
                        i = i5;
                        i15 = iM2762 ^ 847640046;
                        i14 = ((iM2762 ^ i12) * (-20111)) ^ (-1165474067);
                    } else {
                        i = i5;
                        iM31610 = (i12 - C0619.m2761("֡᩻")) * 39;
                        i14 = ((iM31610 ^ i13) * 15227) ^ 592581829;
                        i3 = 1008260416;
                        i15 = iM31610 ^ i3;
                    }
                    i5 = i;
                    break;
                case -968108987:
                case 1845416732:
                    s = s2;
                    i = i5;
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i12 - C0773.m3169("ۚ֡")) * 109;
                        i14 = 1291015648 ^ ((iM3169 ^ i13) * 29977);
                        i2 = 363120565;
                    } else {
                        iM3169 = (C0619.m2761("᩺֨") ^ i13) * (-65);
                        i14 = 929968693 ^ ((iM3169 ^ i12) * (-19645));
                        i2 = -750324957;
                    }
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
                case -511016393:
                case 95865712:
                    if (C2878.f9462) {
                        s = s2;
                        i = i5;
                        i10 = 9;
                        iM3169 = (i12 - C0773.m3169("ۚ֡")) * 109;
                        i14 = 1291015648 ^ ((iM3169 ^ i13) * 29977);
                        i2 = 363120565;
                        i15 = iM3169 ^ i2;
                        i5 = i;
                        s2 = s;
                    } else {
                        int iM2763 = C0619.m2761("ۢᩴ") ^ i12;
                        i15 = iM2763 ^ 406386819;
                        i14 = ((iM2763 ^ i13) * 9415) ^ 872233709;
                        i10 = 9;
                    }
                    break;
                case -370505394:
                case 1724984790:
                    C1321.m4852();
                    if (C2287.f7432 >= 0) {
                        s = s2;
                        i = i5;
                        iM3169 = C0773.m3169("۟ܰ") ^ i12;
                        i14 = 286740180 ^ ((iM3169 ^ i13) * 19689);
                        i2 = 1779616711;
                        i15 = iM3169 ^ i2;
                        i5 = i;
                        s2 = s;
                    }
                    s = s2;
                    i = i5;
                    iM3169 = (i13 - C0773.m3169("᩸ܳ")) * (-103);
                    i14 = 1825746817 ^ ((iM3169 ^ i12) * (-9045));
                    i2 = 1125934356;
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
                case -317923343:
                case 1621279495:
                    s = s2;
                    i = i5;
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = C0773.m3169("۟ܰ") ^ i12;
                        i14 = 286740180 ^ ((iM3169 ^ i13) * 19689);
                        i2 = 1779616711;
                    } else {
                        iM3169 = (C0773.m3169("ۚ᩺") ^ i13) * 63;
                        i14 = (-1723198176) ^ ((iM3169 ^ i12) * (-29139));
                        i2 = -622995939;
                    }
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
                case -283028483:
                case -156752310:
                    s = s2;
                    i = i5;
                    sArr = f26029;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i13 - C0773.m3169("᩸ܳ")) * (-103);
                        i14 = 1825746817 ^ ((iM3169 ^ i12) * (-9045));
                        i2 = 1125934356;
                    } else {
                        iM3169 = (i12 - C0619.m2761("ۙۗ")) * (-59);
                        i14 = 1465198861 ^ ((iM3169 ^ i13) * (-31075));
                        i2 = -2091877148;
                    }
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
                case -143881512:
                case 808554179:
                    i4 = 36938;
                    int iM2764 = (C0619.m2761("ܰᩴ") ^ i12) * 91;
                    int i17 = i4;
                    i15 = iM2764 ^ 1058738031;
                    i14 = ((iM2764 ^ i13) * 15565) ^ 1416282374;
                    i8 = i17;
                    break;
                case -44614271:
                case 1491498336:
                    s = s2;
                    i = i5;
                    c = 20;
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i12 - C0773.m3169("ۚ֡")) * 109;
                        i14 = 1291015648 ^ ((iM3169 ^ i13) * 29977);
                        i2 = 363120565;
                    } else {
                        iM3169 = C0619.m2761("ۚۙ") ^ i12;
                        i14 = 1862371701 ^ ((iM3169 ^ i13) * 7747);
                        i2 = 1695463785;
                    }
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
                case 93623738:
                case 770989909:
                    i5 = s2 * s3;
                    i6 = s2 * s2;
                    if (C2310.m7813() <= 0) {
                        int iM2765 = (i13 - C0619.m2761("᩻֡")) * 81;
                        s = s2;
                        i15 = iM2765 ^ 285787313;
                        i14 = ((iM2765 ^ i12) * (-24735)) ^ 1754448351;
                    } else {
                        s = s2;
                        int iM31612 = (i12 - C0773.m3169("᩵ᩳ")) * 59;
                        i14 = ((iM31612 ^ i13) * 27353) ^ 654778589;
                        i15 = iM31612 ^ 402071413;
                    }
                    s2 = s;
                    break;
                case 247907488:
                case 1150664410:
                    C2375.m8065();
                    C2834.m9344();
                    break;
                case 682393634:
                case 1948918778:
                    s = s2;
                    i = i5;
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0773.m3169("۟ܰ") ^ i12;
                        i14 = 286740180 ^ ((iM3169 ^ i13) * 19689);
                        i2 = 1779616711;
                    } else {
                        iM3169 = (C0619.m2761("֨ۨ") ^ i12) * (-101);
                        i14 = 932698613 ^ ((iM3169 ^ i13) * 24269);
                        i2 = -1094443783;
                    }
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
                case 1025659501:
                case 1252214516:
                    C20932.m47848();
                    if (C3448.f11240 < 0) {
                        int iM2766 = (i13 - C0619.m2761("᩻֡")) * 81;
                        s = s2;
                        i15 = iM2766 ^ 285787313;
                        i14 = ((iM2766 ^ i12) * (-24735)) ^ 1754448351;
                        s2 = s;
                    }
                    s = s2;
                    i = i5;
                    iM3169 = (i13 - C0773.m3169("᩸ܳ")) * (-103);
                    i14 = 1825746817 ^ ((iM3169 ^ i12) * (-9045));
                    i2 = 1125934356;
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
                case 1324642774:
                case 1465991376:
                    sArr2 = f26029;
                    if (AbstractC3624.m11755() != 0) {
                        s = s2;
                        i = i5;
                        i9 = 21;
                        iM3169 = (i13 - C0773.m3169("᩸ܳ")) * (-103);
                        i14 = 1825746817 ^ ((iM3169 ^ i12) * (-9045));
                        i2 = 1125934356;
                        i15 = iM3169 ^ i2;
                        i5 = i;
                        s2 = s;
                    } else {
                        int iM31613 = (C0773.m3169("۬ۨ") + i13) * (-97);
                        i15 = iM31613 ^ 1707556316;
                        i14 = ((iM31613 ^ i12) * (-26779)) ^ 414163939;
                        i9 = 21;
                    }
                    break;
                default:
                    C3998.m12920();
                    AbstractC0641.m2813();
                    s = s2;
                    i = i5;
                    iM3169 = (i13 - C0773.m3169("᩸ܳ")) * (-103);
                    i14 = 1825746817 ^ ((iM3169 ^ i12) * (-9045));
                    i2 = 1125934356;
                    i15 = iM3169 ^ i2;
                    i5 = i;
                    s2 = s;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0188 A[PHI: r6 r7
      0x0188: PHI (r6v5 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:46:0x0186, B:42:0x0166, B:27:0x00c5, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0188: PHI (r7v5 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:46:0x0186, B:42:0x0166, B:27:0x00c5, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01fe A[PHI: r2 r3 r4 r5 r9 r10 r11
      0x01fe: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:58:0x01fc, B:54:0x01de, B:50:0x01bb, B:31:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:58:0x01fc, B:54:0x01de, B:50:0x01bb, B:31:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r4v3 int) = (r4v1 int), (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:58:0x01fc, B:54:0x01de, B:50:0x01bb, B:31:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:58:0x01fc, B:54:0x01de, B:50:0x01bb, B:31:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r9v2 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v3 short[]) binds: [B:58:0x01fc, B:54:0x01de, B:50:0x01bb, B:31:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:58:0x01fc, B:54:0x01de, B:50:0x01bb, B:31:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:58:0x01fc, B:54:0x01de, B:50:0x01bb, B:31:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0253 A[PHI: r16
      0x0253: PHI (r16v3 short[]) = (r16v1 short[]), (r16v2 short[]), (r16v1 short[]) binds: [B:66:0x0251, B:62:0x0231, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        int i3;
        C7813 c7813 = this;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -888123424;
        int i11 = C0269.f1558;
        int i12 = C1080.f3865;
        int iM2762 = (i12 - C0619.m2761("ۧ֨")) * 75;
        int i13 = ((iM2762 ^ i11) * (-32447)) ^ (-564050392);
        int i14 = iM2762 ^ 627602323;
        short[] sArr2 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 5765) >> 31));
            switch (i10) {
                case -2049320118:
                case -2044340832:
                    s2 = 9572;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("֫᩸") ^ i11) * 3;
                        i13 = ((iM2761 ^ i12) * (-12385)) ^ 1771675450;
                        i = 1591295426;
                    } else {
                        iM2761 = C0773.m3169("᩶ܳ") ^ i11;
                        i13 = ((iM2761 ^ i12) * 23795) ^ (-2036636159);
                        i = -1749981542;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -2012675970:
                case -1082864270:
                    sArr2 = f26029;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ܶۡ") ^ i12;
                        i13 = ((iM2761 ^ i11) * 4799) ^ 562481371;
                        i = -739379139;
                    } else {
                        iM2761 = (i12 - C0619.m2761("ۗ᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i13 = ((iM2761 ^ i11) * (-973)) ^ (-1383920118);
                        i = -1642973414;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1808791033:
                case -1191918088:
                    int i15 = s + s2;
                    if ((i15 * i15) - i6 <= 0) {
                        iM2761 = C0619.m2761("ᩳۙ") ^ i12;
                        i13 = ((iM2761 ^ i11) * 13493) ^ 14861258;
                        i = 1886106530;
                    } else {
                        iM2761 = C0773.m3169("ܳ᩵") ^ i11;
                        i13 = ((iM2761 ^ i12) * (-6673)) ^ 1721126458;
                        i = -1316197500;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1787939045:
                case -1615298857:
                    i5 = 91623184;
                    if (C17202.f56030) {
                        iM2761 = (i12 - C0619.m2761("᩵ܿ")) * (-97);
                        i13 = ((iM2761 ^ i11) * 21231) ^ 1792814296;
                        i = 1823139443;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ۨۢ")) * 15;
                        i13 = ((iM2761 ^ i12) * (-28469)) ^ (-1076712918);
                        i = -367838100;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1639324636:
                case 1674800734:
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ۤۡ") ^ i11;
                        i13 = ((iM2761 ^ i12) * 26007) ^ (-1857639318);
                        i = -1487977444;
                    } else {
                        iM2761 = C0773.m3169("ܶۡ") ^ i12;
                        i13 = ((iM2761 ^ i11) * 4799) ^ 562481371;
                        i = -739379139;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1630926279:
                case 2086794584:
                    i7 = 5099;
                    iM2761 = C0773.m3169("᩷۬") ^ i12;
                    i13 = ((iM2761 ^ i11) * 25971) ^ (-1467406873);
                    i = -647538572;
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1556751887:
                case -1500938114:
                    s = sArr2[c];
                    i4 = s * s;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i11 - C0773.m3169("ۨۢ")) * 15;
                        i13 = ((iM2761 ^ i12) * (-28469)) ^ (-1076712918);
                        i = -367838100;
                    } else {
                        iM2761 = C0619.m2761("ۤۢ") ^ i12;
                        i13 = ((iM2761 ^ i11) * (-28463)) ^ 1288009749;
                        i = 1309195661;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1492472061:
                case 830410668:
                    c7813.f26031.f3918 = true;
                    break;
                case -1425088628:
                case 1089046243:
                    i7 = 60739;
                    iM2761 = C0773.m3169("᩷۬") ^ i12;
                    i13 = ((iM2761 ^ i11) * 25971) ^ (-1467406873);
                    i = -647538572;
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1277660367:
                case 904141882:
                    int i16 = i4 + i5;
                    i6 = i16 + i16;
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("֫᩸") ^ i11) * 3;
                        i13 = ((iM2761 ^ i12) * (-12385)) ^ 1771675450;
                        i = 1591295426;
                    } else {
                        iM2761 = C0773.m3169("֫ۜ") ^ i11;
                        i13 = ((iM2761 ^ i12) * (-27917)) ^ (-991266248);
                        i = -1453065426;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1091930927:
                case 889127399:
                    c = '\n';
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i11 - C0773.m3169("ۨۢ")) * 15;
                        i13 = ((iM2761 ^ i12) * (-28469)) ^ (-1076712918);
                        i = -367838100;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۛ") ^ i11) * (-59);
                        i13 = ((iM2761 ^ i12) * 29371) ^ (-1038173926);
                        i = -1178172426;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case -1066925907:
                case 1875474450:
                    C17202.m40379(animator, RunnableC1848.m6366(sArr, i8, i9, i7));
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0619.m2761("֫᩸") ^ i11) * 3;
                        i13 = ((iM2761 ^ i12) * (-12385)) ^ 1771675450;
                        i = 1591295426;
                        i14 = iM2761 ^ i;
                    } else {
                        int iM2763 = (C0619.m2761("ᩴۡ") + i11) * (-69);
                        i14 = iM2763 ^ (-2081504317);
                        i13 = ((iM2763 ^ i12) * 4715) ^ (-1641857065);
                    }
                    c7813 = this;
                    break;
                case -1024139769:
                case 334193332:
                    C2485.m8358(c7813.f26030, 8);
                    if (C2288.f7433 <= 0) {
                        iM3169 = (i11 - C0773.m3169("ۗܺ")) * 115;
                        i2 = ((iM3169 ^ i12) * 3969) ^ 1415713998;
                        i3 = -1058509954;
                    } else {
                        iM3169 = (C0773.m3169("ۚۛ") + i12) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM3169 ^ i11) * (-19111)) ^ 384578231;
                        i3 = 281129067;
                    }
                    int i17 = i2;
                    i14 = iM3169 ^ i3;
                    i13 = i17;
                    break;
                case -754201772:
                case -35273684:
                    C1519.m5403();
                    C2287.m7745();
                    iM3169 = (i11 - C0773.m3169("ۗܺ")) * 115;
                    i2 = ((iM3169 ^ i12) * 3969) ^ 1415713998;
                    i3 = -1058509954;
                    int i18 = i2;
                    i14 = iM3169 ^ i3;
                    i13 = i18;
                    break;
                case -54805078:
                case 211848024:
                    C4238.m13540();
                    C20932.m47848();
                    break;
                case 33699273:
                case 1989890536:
                    sArr = f26029;
                    i8 = 11;
                    i9 = 9;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i11 - C0773.m3169("ۨۢ")) * 15;
                        i13 = ((iM2761 ^ i12) * (-28469)) ^ (-1076712918);
                        i = -367838100;
                    } else {
                        iM2761 = (C0619.m2761("ܶ᩺") + i12) * (-101);
                        i13 = ((iM2761 ^ i11) * (-23395)) ^ (-2022473904);
                        i = -1336602039;
                    }
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case 137754742:
                case 1743596967:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ܶۡ") ^ i12;
                        i13 = ((iM2761 ^ i11) * 4799) ^ 562481371;
                        i = -739379139;
                        i14 = iM2761 ^ i;
                        c7813 = this;
                    }
                    iM2761 = (C0619.m2761("֫᩸") ^ i11) * 3;
                    i13 = ((iM2761 ^ i12) * (-12385)) ^ 1771675450;
                    i = 1591295426;
                    i14 = iM2761 ^ i;
                    c7813 = this;
                    break;
                case 143345854:
                case 1339343873:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("֫᩸") ^ i11) * 3;
                        i13 = ((iM2761 ^ i12) * (-12385)) ^ 1771675450;
                        i = 1591295426;
                        i14 = iM2761 ^ i;
                        c7813 = this;
                    } else {
                        iM3169 = (i11 - C0773.m3169("ۗܺ")) * 115;
                        i2 = ((iM3169 ^ i12) * 3969) ^ 1415713998;
                        i3 = -1058509954;
                        int i19 = i2;
                        i14 = iM3169 ^ i3;
                        i13 = i19;
                    }
                    break;
                default:
                    if (!RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("۬᩺") ^ i12) * 99;
                        i2 = ((iM3169 ^ i11) * 2105) ^ (-1228571628);
                        i3 = -796453500;
                        int i110 = i2;
                        i14 = iM3169 ^ i3;
                        i13 = i110;
                    } else {
                        iM2761 = (C0619.m2761("֫᩸") ^ i11) * 3;
                        i13 = ((iM2761 ^ i12) * (-12385)) ^ 1771675450;
                        i = 1591295426;
                        i14 = iM2761 ^ i;
                        c7813 = this;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x025a A[PHI: r9 r17 r18
      0x025a: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:62:0x0258, B:44:0x0179, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r17v21 java.lang.String) = (r17v8 java.lang.String), (r17v12 java.lang.String), (r17v22 java.lang.String) binds: [B:62:0x0258, B:44:0x0179, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:62:0x0258, B:44:0x0179, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x028e A[PHI: r3 r17
      0x028e: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char) binds: [B:66:0x028c, B:58:0x0236, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r17v19 java.lang.String) = (r17v7 java.lang.String), (r17v9 java.lang.String), (r17v20 java.lang.String) binds: [B:66:0x028c, B:58:0x0236, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (l.C0619.f2439 == false) goto L18;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationCancel(android.animation.Animator r22) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7813.onAnimationCancel(android.animation.Animator):void");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[PHI: r3
      0x0093: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:23:0x0091, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b3 A[PHI: r8 r9 r10 r12 r13 r14
      0x01b3: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v6 int) binds: [B:39:0x0144, B:17:0x0075, B:15:0x0071, B:12:0x006b, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v6 int) binds: [B:39:0x0144, B:17:0x0075, B:15:0x0071, B:12:0x006b, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v6 int) binds: [B:39:0x0144, B:17:0x0075, B:15:0x0071, B:12:0x006b, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:39:0x0144, B:17:0x0075, B:15:0x0071, B:12:0x006b, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:39:0x0144, B:17:0x0075, B:15:0x0071, B:12:0x006b, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:39:0x0144, B:17:0x0075, B:15:0x0071, B:12:0x006b, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0208 A[PHI: r2 r21
      0x0208: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:56:0x0206, B:27:0x00cc, B:15:0x0071, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:56:0x0206, B:27:0x00cc, B:15:0x0071, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x023f A[PHI: r6 r7 r16
      0x023f: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:60:0x023d, B:52:0x01e5, B:89:0x023f, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:60:0x023d, B:52:0x01e5, B:89:0x023f, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:60:0x023d, B:52:0x01e5, B:89:0x023f, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int iM2761;
        int i;
        int i2;
        int i3 = C23916.f77426;
        int i4 = C2966.f9654;
        int iM2762 = (C0619.m2761("ܽ᩵") + i3) * 63;
        int i5 = ((iM2762 ^ i4) * 909) ^ 1707719866;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2762 ^ 7889345;
        View view = null;
        int iM3169 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -944769063;
        char c = 0;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * 3437) >> 31));
            switch (i15) {
                case -1995016573:
                case 1818837079:
                    i7 = 2128097995;
                    if (C3077.m10041()) {
                        iM2761 = (C0619.m2761("ܿ֡") ^ i4) * (-79);
                        i = ((iM2761 ^ i3) * 12019) ^ 1211996384;
                        i2 = -753725561;
                    } else {
                        iM2761 = C0619.m2761("ܳ֡") ^ i3;
                        i = ((iM2761 ^ i4) * 27445) ^ (-964912852);
                        i2 = 1485326332;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1917152898:
                case -1146775682:
                    i12 = 58090;
                    iM2761 = C0773.m3169("ۙ᩺") ^ i3;
                    i = ((iM2761 ^ i4) * 3897) ^ 664350285;
                    i2 = 104822469;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1526530217:
                case -322594493:
                    iM3169 = C0773.m3169(C0773.m3166(sArr3, i8, 3, i12));
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("᩷ᩴ") ^ i3) * (-73);
                        i = ((iM2761 ^ i4) * (-14991)) ^ (-1204947087);
                        i2 = 1771938942;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩶") + i4) * (-111);
                        i = ((iM2761 ^ i3) * (-25039)) ^ (-1985352253);
                        i2 = -1314701306;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1524564818:
                case 374849391:
                    view = this.f26032;
                    sArr3 = f26029;
                    if (C1321.f4751 >= 0) {
                        i8 = 40;
                        iM2761 = C0619.m2761("ۗܿ") ^ i3;
                        i = ((iM2761 ^ i4) * 14729) ^ 340370315;
                        i2 = -507949770;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    } else {
                        int iM31610 = C0773.m3169("᩶ۡ") ^ i3;
                        i5 = ((iM31610 ^ i4) * 22741) ^ (-493236286);
                        i6 = iM31610 ^ (-1612539926);
                        i8 = 40;
                    }
                    break;
                case -1463067020:
                case 2119642323:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ۗܿ") ^ i3;
                        i = ((iM2761 ^ i4) * 14729) ^ 340370315;
                        i2 = -507949770;
                    } else {
                        iM2761 = (C0619.m2761("᩹ᩴ") ^ i3) * 115;
                        i = ((iM2761 ^ i4) * (-28257)) ^ (-244731094);
                        i2 = -1830471797;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1395771988:
                case -736130361:
                    if ((i10 + i11) - i9 >= 0) {
                        iM2761 = (i4 - C0619.m2761("ۧܿ")) * (-99);
                        i = ((iM2761 ^ i3) * 3677) ^ (-1046667675);
                        i2 = -1330216127;
                    } else {
                        iM2761 = C0773.m3169("᩷ۨ") ^ i4;
                        i = ((iM2761 ^ i3) * 21065) ^ 1950683346;
                        i2 = -331341843;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -934645879:
                case 1901912447:
                    i12 = o.a.E;
                    iM2761 = C0773.m3169("ۙ᩺") ^ i3;
                    i = ((iM2761 ^ i4) * 3897) ^ 664350285;
                    i2 = 104822469;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -614808088:
                case -601628698:
                    RunnableC0334.m2063();
                    if (C2966.m9664()) {
                        iM2761 = (i4 - C0773.m3169("ۘۗ")) * (-43);
                        i = ((iM2761 ^ i3) * 27169) ^ (-1079158038);
                        i2 = -457898507;
                    } else {
                        iM2761 = (C0619.m2761("᩷ᩴ") ^ i3) * (-73);
                        i = ((iM2761 ^ i4) * (-14991)) ^ (-1204947087);
                        i2 = 1771938942;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -587062332:
                case 1747774017:
                    C3734.m12144(animator, C2288.m7761(sArr2, i13, i14, i12));
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ۘۗ")) * (-43);
                        i = ((iM2761 ^ i3) * 27169) ^ (-1079158038);
                        i2 = -457898507;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    } else {
                        int iM31611 = C0773.m3169("֫۟") ^ i4;
                        i5 = ((iM31611 ^ i3) * (-30141)) ^ 211083074;
                        i6 = iM31611 ^ (-1958163400);
                    }
                    break;
                case -532028196:
                case 676367898:
                    sArr = f26029;
                    if (C1146.m4231()) {
                        iM2761 = (i4 - C0773.m3169("᩻ܳ")) * 31;
                        i = ((iM2761 ^ i3) * 28959) ^ 2112618561;
                        i2 = -285722358;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۘۗ")) * (-43);
                        i = ((iM2761 ^ i3) * 27169) ^ (-1079158038);
                        i2 = -457898507;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -393440577:
                case -7410237:
                    c = 30;
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = (C0619.m2761("᩷ᩴ") ^ i3) * (-73);
                        i = ((iM2761 ^ i4) * (-14991)) ^ (-1204947087);
                        i2 = 1771938942;
                    } else {
                        iM2761 = (C0619.m2761("ܿܰ") ^ i3) * 67;
                        i = ((iM2761 ^ i4) * (-15159)) ^ 1579875110;
                        i2 = 2054758799;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -281154913:
                case 1651241124:
                    ((TextureViewSurfaceTextureListenerC6431) C2834.m9333(view, iM3169 ^ i7)).m18206();
                    break;
                case 143608576:
                case 1028040942:
                    C2288.m7767();
                    break;
                case 333516570:
                case 1849977530:
                    s = sArr[c];
                    s2 = 5108;
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ۘۗ")) * (-43);
                        i = ((iM2761 ^ i3) * 27169) ^ (-1079158038);
                        i2 = -457898507;
                    } else {
                        iM2761 = (C0619.m2761("ܿ᩹") ^ i4) * 61;
                        i = ((iM2761 ^ i3) * 16263) ^ (-685029985);
                        i2 = -1532056876;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 688021803:
                case 1021102994:
                    sArr2 = f26029;
                    i13 = 31;
                    i14 = 9;
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("᩵ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 21365) ^ (-1732076821);
                        i2 = -1785481785;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܳ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i4) * (-18303)) ^ 1178104129;
                        i2 = -160343738;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1349977270:
                case 1965929683:
                    if (C1343.f4799 == 0) {
                        iM2761 = C0619.m2761("᩵ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 21365) ^ (-1732076821);
                        i2 = -1785481785;
                    } else {
                        iM2761 = (C0619.m2761("᩷ᩴ") ^ i3) * (-73);
                        i = ((iM2761 ^ i4) * (-14991)) ^ (-1204947087);
                        i2 = 1771938942;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1602879971:
                case 2010851820:
                    C2834.m9344();
                    iM2761 = C0619.m2761("᩵ۙ") ^ i4;
                    i = ((iM2761 ^ i3) * 21365) ^ (-1732076821);
                    i2 = -1785481785;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 2042177737:
                case 2138805473:
                    if (C0487.f2131 > 0) {
                        iM2761 = C0619.m2761("᩵ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 21365) ^ (-1732076821);
                        i2 = -1785481785;
                    } else {
                        iM2761 = (C0619.m2761("ܿ֡") ^ i4) * (-79);
                        i = ((iM2761 ^ i3) * 12019) ^ 1211996384;
                        i2 = -753725561;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = s * s2;
                    i10 = s * s;
                    i11 = 6522916;
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("᩵ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 21365) ^ (-1732076821);
                        i2 = -1785481785;
                    } else {
                        iM2761 = C0773.m3169("ܽܽ") ^ i3;
                        i = ((iM2761 ^ i4) * (-25111)) ^ 1012942742;
                        i2 = -1775402598;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C7813(View view, View view2, C1101 c1101) {
        int i = 1100223157;
        int i2 = C2287.f7432;
        int i3 = C2354.f7599;
        int iM2761 = (C0619.m2761("ܺ᩺") ^ i2) * (-49);
        int i4 = ((iM2761 ^ i3) * 9687) ^ 1449253964;
        int i5 = 1980746463;
        while (true) {
            i = ((((i ^ i3) * (-9617)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2139120363:
                case -2094123058:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("֨ۖ") ^ i2) * 7;
                        i4 = ((iM2761 ^ i3) * 23555) ^ (-324833840);
                        i5 = 399127071;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܶܰ")) * 5;
                        i4 = ((iM2761 ^ i3) * 24831) ^ (-990052022);
                        i5 = -1141594315;
                    }
                    break;
                case -2011002259:
                case 1814331528:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("۫᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30495) ^ (-751384473);
                        i5 = -186154109;
                    } else {
                        iM2761 = C0619.m2761("ۘۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3853)) ^ 755682654;
                        i5 = 974860133;
                    }
                    break;
                case -1946170531:
                case -1754780914:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("۫᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30495) ^ (-751384473);
                        i5 = -186154109;
                    } else {
                        iM2761 = C0773.m3169("ܶۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21441) ^ 1244680980;
                        i5 = -235614240;
                    }
                    break;
                case -1899245505:
                case -1279301331:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("ܶۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21441) ^ 1244680980;
                        i5 = -235614240;
                    } else {
                        iM2761 = C0773.m3169("۬ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7133)) ^ (-803532728);
                        i5 = 137742610;
                    }
                    break;
                case -1434714633:
                case -1425721464:
                    if (C2287.m7745() <= 0) {
                        iM2761 = (C0773.m3169("֨ۖ") ^ i2) * 7;
                        i4 = ((iM2761 ^ i3) * 23555) ^ (-324833840);
                        i5 = 399127071;
                    } else {
                        iM2761 = C0619.m2761("᩶᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6565)) ^ (-33868639);
                        i5 = 1340409685;
                    }
                    break;
                case -935476843:
                case 1686600446:
                    C23916.m53419();
                    if (C3448.f11240 < 0) {
                        iM2761 = (i3 - C0619.m2761("ۨۧ")) * (-7);
                        i4 = ((iM2761 ^ i2) * (-14373)) ^ 1428486489;
                        i5 = 684005498;
                    } else {
                        iM2761 = C0773.m3169("ܶۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21441) ^ 1244680980;
                        i5 = -235614240;
                    }
                    break;
                case -931817595:
                case 1134958227:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ܶۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21441) ^ 1244680980;
                        i5 = -235614240;
                    } else {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21723) ^ 2099518882;
                        i5 = -719883543;
                    }
                    break;
                case -929690058:
                case 1778350969:
                    this.f26031 = c1101;
                    return;
                case -914411210:
                case -806234216:
                    if (C1519.m5403()) {
                        iM2761 = C0773.m3169("ۛ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27515)) ^ (-1292021459);
                        i5 = 1214436266;
                    } else {
                        iM2761 = C0619.m2761("۫᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30495) ^ (-751384473);
                        i5 = -186154109;
                    }
                    break;
                case -413496071:
                case 55176179:
                    RunnableC3646.m11813();
                    if (!C2878.f9462) {
                        iM2761 = (C0773.m3169("֨ۖ") ^ i2) * 7;
                        i4 = ((iM2761 ^ i3) * 23555) ^ (-324833840);
                        i5 = 399127071;
                    } else {
                        iM2761 = C0773.m3169("ܶۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21441) ^ 1244680980;
                        i5 = -235614240;
                    }
                    break;
                case 134480709:
                case 227150616:
                    this.f26032 = view;
                    this.f26030 = view2;
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("ۢ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27669)) ^ (-614350171);
                        i5 = 1733164324;
                    } else {
                        iM2761 = C0619.m2761("᩹۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 32061) ^ (-528088067);
                        i5 = 323814873;
                    }
                    break;
                case 533980324:
                case 1910749063:
                    AbstractC0641.m2813();
                    throw new RuntimeException();
                case 998585278:
                case 1661841169:
                    if (C0619.f2439) {
                        iM2761 = (i3 - C0619.m2761("ۨۧ")) * (-7);
                        i4 = ((iM2761 ^ i2) * (-14373)) ^ 1428486489;
                        i5 = 684005498;
                    } else {
                        iM2761 = C0619.m2761("ܳۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11561) ^ (-1620298220);
                        i5 = 601851570;
                    }
                    break;
                case 1165246587:
                case 1680005440:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0619.m2761("۫᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30495) ^ (-751384473);
                        i5 = -186154109;
                    } else {
                        iM2761 = (C0619.m2761("ۧۧ") ^ i2) * 81;
                        i4 = ((iM2761 ^ i3) * 15835) ^ 455008486;
                        i5 = -1060322199;
                    }
                    break;
                case 1200680912:
                case 1746596133:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ۢ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27669)) ^ (-614350171);
                        i5 = 1733164324;
                    } else {
                        iM2761 = (C0619.m2761("ۖ۫") + i3) * (-87);
                        i4 = ((iM2761 ^ i2) * 2351) ^ 964675155;
                        i5 = 662990747;
                    }
                    break;
                default:
                    C1564.m5509();
                    C1783.m6232();
                    iM2761 = C0773.m3169("ܶۤ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 21441) ^ 1244680980;
                    i5 = -235614240;
                    break;
            }
        }
    }
}
