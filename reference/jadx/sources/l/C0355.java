package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.֡ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0355 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ܰۚᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f1863 = {9381, 15822, 6214, 13069, 2597, 1919, 1904, 1911, 1907, 1919, 1898, 1911, 1905, 1904, 9961, -28379, -28374, -28371, -28375, -28379, -28368, -28371, -28373, -28374, -28379, -28376, -28364, -28372, -28379, 4097, -14323, -14334, -14331, -14335, -14323, -14312, -14331, -14333, -14334, 5789, 4123, 4116, 4115, 4119, 4123, 4110, 4115, 4117, 4116, 31440, 24963, -28027, 4163, 4168, 4171, 4175, 4175, 4162, 4174, 4174, 4175, 4154, 4107, 4107, 4180, 4121, 4117, 4119, 4125, 4127, 4110, 4156, 4104, 4117, 4119, 4153, 4123, 4121, 4114, 4127, 4178, 4180, 4180, 4180, 4179, 4107, 4107, 4133, 4107, 4111, 4116, 4171, 4107, 4107, 4133, 4107, 4111, 4116, 4168, 4169, 4170, 4173, 4162, 4171, 4173, 4170, 4175, 4162, 4102, 4114, 4110, 4110, 4106, 4105, 4160, 4181, 4181, 4112, 4107, 4180, 4107, 4107, 4180, 4121, 4117, 4119, 4181, 4165, 4133, 4109, 4108, 4167, 4171, 4170, 4168, 4173, 4188, 4113, 4167, 4152, 4173, 4145, 4171, 4114, 4124, 4145, 4137, 4102, 4111, 4146, 4140, 4106, 4107, 4151, 4170, 4143, 4116, 4111, 4131, 4111, 4114, 4163, 4098, 4143, 4137, 4117, 4147, 4127, 4150, 4175, 4104, 4109, 4148, 4174, 4125, 4123, 4114, 4175, 4175, 4108, 4107, 4107, 4133, 4107, 4111, 4116, 4169, 4168, 4175, 4168, 4168, 4169, 4169, 4162, 4163, 4171, 4102, 4114, 4110, 4110, 4106, 4105, 4160, 4181, 4181, 4112, 4107, 4180, 4107, 4107, 4180, 4121, 4117, 4119, 4181, 4165, 4133, 4109, 4108, 4167, 4171, 4170, 4168, 4173, 4188, 4113, 4167, 4109, 4141, 4171, 4125, 4143, 4108, 4124, 4109, 4102, 4169, 4150, 4130, 4153, 4155, 4175, 4111, 4109, 4138, 4096, 4116, 4126, 4115, 4121, 4128, 4163, 4125, 4126, 4170, 4139, 4127, 4105, 4110, 4142, 4148, 4171, 4138, 4148, 4155, 4146, 4143, 4159, 4107, 4107, 4133, 4121, 4114, 4123, 4116, 4116, 4127, 4118, 4174, 4162, 4173, 4168, 4174, 4174, 4169, 4163, 4168, 4102, 4114, 4110, 4110, 4106, 4105, 4160, 4181, 4181, 4112, 4107, 4180, 4107, 4107, 4180, 4121, 4117, 4119, 4181, 4165, 4133, 4109, 4108, 4167, 4171, 4170, 4168, 4173, 4188, 4113, 4167, 4106, 4141, 4148, 4130, 4123, 4117, 4123, 4158, 4102, 4156, 4121, 4163, 4145, 4151, 4143, 4142, 4156, 4110, 4104, 4113, 4173, 4121, 4124, 4106, 4119, 4116, 4170, 4152, 4115, 4175, 4174, 4137, 4144, 4149, 4116, 4124, 4156, 4123, 4118, 4121, 4131, -29150, 16677, 26626, 24345, 30198, 29158, 19375, -32289, -30330, -26510, 31053, -25853, 27429, 26868, 31248, 19843, 25965, 32371, 24957, -31013, 32557, 4146, 4138, 4142, 4175, 4168, 4147, 4145, 4159, 4131, 4172, 4102, 4114, 4110, 4110, 4106, 4105, 4160, 4181, 4181, 4106, 4126, 4180, 4107, 4107, 4180, 4121, 4117, 4119, 4181, 4105, 4181, 4173, 4175, 4175, 4173, 4105, 4108, 4121, 4127, 4117};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f1864;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1101 f1865;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public View f1866;

    /* JADX WARN: Code duplicated, block: B:73:0x027e A[PHI: r0 r2 r3 r16
      0x027e: PHI (r0v17 short[]) = (r0v11 short[]), (r0v16 short[]), (r0v2 short[]) binds: [B:64:0x023d, B:57:0x0215, B:48:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r2v3 short) = (r2v2 short), (r2v2 short), (r2v4 short) binds: [B:64:0x023d, B:57:0x0215, B:48:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r3v3 short) = (r3v2 short), (r3v2 short), (r3v4 short) binds: [B:64:0x023d, B:57:0x0215, B:48:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r16v9 int) = (r16v6 int), (r16v8 int), (r16v10 int) binds: [B:64:0x023d, B:57:0x0215, B:48:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i;
        short[] sArr;
        int iM2761;
        int i2;
        int iM3169;
        int i3;
        int i4;
        short[] sArr2 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        short s3 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr3 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1265185343;
        int i11 = C2354.f7599;
        int i12 = C2966.f9654;
        int iM2762 = (C0619.m2761("᩸ۨ") + i11) * (-93);
        int i13 = ((iM2762 ^ i12) * (-21829)) ^ (-281191470);
        int i14 = -322949393;
        while (true) {
            int i15 = iM2762 ^ i14;
            while (true) {
                i10 = ((((i10 ^ i12) * (-11671)) >> 31) & i13) ^ i15;
                switch (i10) {
                    case -2007044729:
                    case 128644211:
                        sArr = sArr2;
                        i = i5;
                        if (AbstractC3624.f12429 > 0) {
                            iM2761 = C0619.m2761("᩸ۛ") ^ i12;
                            i13 = (-1458638073) ^ ((iM2761 ^ i11) * 13001);
                            i2 = 1588422307;
                            i15 = iM2761 ^ i2;
                            i5 = i;
                            sArr2 = sArr;
                        } else {
                            sArr2 = sArr;
                            iM3169 = (C0773.m3169("֫᩵") + i11) * 33;
                            i13 = ((iM3169 ^ i12) * 21203) ^ (-445479);
                            i3 = 1021137614;
                            i15 = iM3169 ^ i3;
                            i5 = i;
                        }
                        break;
                    case -1955804929:
                    case 1481848323:
                        i4 = 51308;
                        int iM2763 = (C0619.m2761("ᩴ᩻") ^ i11) * 31;
                        int i16 = i4;
                        i15 = iM2763 ^ 1276431030;
                        i13 = ((iM2763 ^ i12) * (-7113)) ^ (-1689862519);
                        i7 = i16;
                        break;
                    case -1931671713:
                    case 1395945236:
                        i4 = 10512;
                        int iM2764 = (C0619.m2761("ᩴ᩻") ^ i11) * 31;
                        int i17 = i4;
                        i15 = iM2764 ^ 1276431030;
                        i13 = ((iM2764 ^ i12) * (-7113)) ^ (-1689862519);
                        i7 = i17;
                        break;
                    case -1926966395:
                    case -624305247:
                        if ((i6 * i6) - i5 < 0) {
                            int iM2765 = C0619.m2761("ۖۜ") ^ i11;
                            i = i5;
                            i15 = iM2765 ^ (-1017856958);
                            i13 = ((iM2765 ^ i12) * 11777) ^ 1013232862;
                        } else {
                            i = i5;
                            iM3169 = (i12 - C0619.m2761("᩶ۨ")) * (-37);
                            i13 = ((iM3169 ^ i11) * 13821) ^ 1069489875;
                            i3 = 311217928;
                            i15 = iM3169 ^ i3;
                        }
                        i5 = i;
                        break;
                    case -1842297068:
                    case -1565918571:
                        i5 = s * s2;
                        if (RunnableC0334.m2063()) {
                            s3 = 17519;
                            int iM31610 = (C0773.m3169("᩶֡") ^ i12) * (-47);
                            sArr = sArr2;
                            i15 = iM31610 ^ 672992378;
                            i13 = ((iM31610 ^ i11) * 21875) ^ 919856764;
                            sArr2 = sArr;
                        } else {
                            int iM2766 = C0619.m2761("ۜ᩶") ^ i11;
                            i15 = iM2766 ^ (-1602751039);
                            i13 = ((iM2766 ^ i12) * (-28411)) ^ 645675966;
                            s3 = 17519;
                        }
                        break;
                    case -1780867148:
                    case -1011771389:
                        sArr = sArr2;
                        i = i5;
                        if (C1542.f5343 > 0) {
                            iM2761 = C0619.m2761("ۧۗ") ^ i12;
                            i13 = 1251689667 ^ ((iM2761 ^ i11) * (-25311));
                            i2 = -1139304250;
                            i15 = iM2761 ^ i2;
                            i5 = i;
                            sArr2 = sArr;
                        } else {
                            sArr2 = sArr;
                            iM3169 = (C0773.m3169("֫᩵") + i11) * 33;
                            i13 = ((iM3169 ^ i12) * 21203) ^ (-445479);
                            i3 = 1021137614;
                            i15 = iM3169 ^ i3;
                            i5 = i;
                        }
                        break;
                    case -1694293940:
                    case 1731183087:
                        sArr = sArr2;
                        i = i5;
                        if (!C4282.m13644()) {
                            sArr2 = sArr;
                            iM3169 = (C0773.m3169("֫᩵") + i11) * 33;
                            i13 = ((iM3169 ^ i12) * 21203) ^ (-445479);
                            i3 = 1021137614;
                            i15 = iM3169 ^ i3;
                            i5 = i;
                        } else {
                            iM2761 = C0619.m2761("ۢܿ") ^ i11;
                            i13 = 1724975426 ^ ((iM2761 ^ i12) * 6125);
                            i2 = -1748360834;
                            i15 = iM2761 ^ i2;
                            i5 = i;
                            sArr2 = sArr;
                        }
                        break;
                    case -1516176920:
                    case 422531482:
                        if (C1080.f3865 >= 0) {
                            i9 = 9;
                            int iM31611 = (C0773.m3169("᩶֡") ^ i12) * (-47);
                            sArr = sArr2;
                            i15 = iM31611 ^ 672992378;
                            i13 = ((iM31611 ^ i11) * 21875) ^ 919856764;
                            sArr2 = sArr;
                        } else {
                            int iM2767 = (C0619.m2761("ܶ۠") + i12) * (-91);
                            i15 = iM2767 ^ (-493126759);
                            i13 = ((iM2767 ^ i11) * 9493) ^ 978763718;
                            i9 = 9;
                        }
                        break;
                    case -1033428549:
                    case -939935848:
                        C17202.m40379(animator, C3492.m11486(sArr3, i8, i9, i7));
                        break;
                    case -1006799922:
                    case 1068388218:
                        C4238.m13540();
                        AbstractC0116.m1243();
                        break;
                    case -893157586:
                    case 1384631149:
                        i = i5;
                        c = 29;
                        if (C1564.f5401 > 0) {
                            sArr = sArr2;
                            iM2761 = (C0619.m2761("ۢۚ") ^ i12) * 99;
                            i13 = 11548264 ^ ((iM2761 ^ i11) * (-26613));
                            i2 = 698202773;
                            i15 = iM2761 ^ i2;
                            i5 = i;
                            sArr2 = sArr;
                        } else {
                            i5 = i;
                            int iM31612 = (C0773.m3169("᩶֡") ^ i12) * (-47);
                            sArr = sArr2;
                            i15 = iM31612 ^ 672992378;
                            i13 = ((iM31612 ^ i11) * 21875) ^ 919856764;
                            sArr2 = sArr;
                        }
                        break;
                    case -829029193:
                    case 298113089:
                        C0773.m3161();
                        if (C0773.m3161() == 0) {
                            int iM31613 = (C0773.m3169("᩶֡") ^ i12) * (-47);
                            sArr = sArr2;
                            i15 = iM31613 ^ 672992378;
                            i13 = ((iM31613 ^ i11) * 21875) ^ 919856764;
                            sArr2 = sArr;
                        } else {
                            iM2762 = (C0773.m3169("ۤ᩶") + i11) * 87;
                            i13 = ((iM2762 ^ i12) * (-23055)) ^ (-166660023);
                            i14 = -754342464;
                        }
                        break;
                    case -784927792:
                    case 806441343:
                        sArr3 = f1863;
                        if (C11235.f35427 >= 0) {
                            i = i5;
                            i8 = 30;
                            iM3169 = C0773.m3169("᩷ۢ") ^ i12;
                            i13 = ((iM3169 ^ i11) * 29381) ^ (-664794738);
                            i3 = 1401616959;
                            i15 = iM3169 ^ i3;
                            i5 = i;
                        } else {
                            int iM31614 = C0773.m3169("ܽ۠") ^ i12;
                            i15 = iM31614 ^ (-2077199590);
                            i13 = ((iM31614 ^ i11) * (-30477)) ^ (-1895184318);
                            i8 = 30;
                        }
                        break;
                    case -665008506:
                    case 263239890:
                        C2354.m7983();
                        if (C2419.f7754 >= 0) {
                            iM2762 = (i11 - C0619.m2761("ܳ֨")) * (-125);
                            i13 = ((iM2762 ^ i12) * (-26543)) ^ 426789421;
                            i14 = 2072731384;
                        } else {
                            iM2762 = (C0773.m3169("ۤ᩶") + i11) * 87;
                            i13 = ((iM2762 ^ i12) * (-23055)) ^ (-166660023);
                            i14 = -754342464;
                        }
                        break;
                    case -358959484:
                    case 1360680039:
                        i = i5;
                        s = sArr2[c];
                        s2 = 70076;
                        if (C1146.f4234 >= 0) {
                            iM3169 = (C0773.m3169("֫᩵") + i11) * 33;
                            i13 = ((iM3169 ^ i12) * 21203) ^ (-445479);
                            i3 = 1021137614;
                        } else {
                            iM3169 = C0773.m3169("ۗۜ") ^ i11;
                            i13 = ((iM3169 ^ i12) * 6787) ^ (-523360605);
                            i3 = 38802529;
                        }
                        i15 = iM3169 ^ i3;
                        i5 = i;
                        break;
                    case -227691787:
                    case 554205653:
                        i = i5;
                        sArr2 = f1863;
                        if (C0950.f3488 >= 0) {
                            iM3169 = (C0773.m3169("֫᩵") + i11) * 33;
                            i13 = ((iM3169 ^ i12) * 21203) ^ (-445479);
                            i3 = 1021137614;
                        } else {
                            iM3169 = C0773.m3169("ۚۢ") ^ i11;
                            i13 = ((iM3169 ^ i12) * (-28483)) ^ (-990082388);
                            i3 = 1520676342;
                        }
                        i15 = iM3169 ^ i3;
                        i5 = i;
                        break;
                    case -100643255:
                    case 1997618550:
                        C2419.m8174();
                        iM2762 = (C0773.m3169("ۤ᩶") + i11) * 87;
                        i13 = ((iM2762 ^ i12) * (-23055)) ^ (-166660023);
                        i14 = -754342464;
                        break;
                    case 806818635:
                    case 893657496:
                        i = i5;
                        i6 = s + s3;
                        if (C0269.f1558 <= 0) {
                            iM3169 = C0773.m3169("᩷ۢ") ^ i12;
                            i13 = ((iM3169 ^ i11) * 29381) ^ (-664794738);
                            i3 = 1401616959;
                        } else {
                            iM3169 = (i12 - C0619.m2761("ۖ᩹")) * (-37);
                            i13 = ((iM3169 ^ i11) * (-13785)) ^ (-2020565772);
                            i3 = -944894811;
                        }
                        i15 = iM3169 ^ i3;
                        i5 = i;
                        break;
                    default:
                        if (C3998.f13671 != 0) {
                            i = i5;
                            iM3169 = C0773.m3169("᩷ۢ") ^ i12;
                            i13 = ((iM3169 ^ i11) * 29381) ^ (-664794738);
                            i3 = 1401616959;
                            i15 = iM3169 ^ i3;
                            i5 = i;
                        } else {
                            iM2762 = (C0773.m3169("ۤ᩶") + i11) * 87;
                            i13 = ((iM2762 ^ i12) * (-23055)) ^ (-166660023);
                            i14 = -754342464;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ef A[PHI: r3 r4
      0x00ef: PHI (r3v4 android.view.View) = (r3v3 android.view.View), (r3v2 android.view.View) binds: [B:32:0x00ed, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r4v3 android.animation.ObjectAnimator) = (r4v2 android.animation.ObjectAnimator), (r4v4 android.animation.ObjectAnimator) binds: [B:32:0x00ed, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0211 A[PHI: r2 r9 r10 r11 r18 r23
      0x0211: PHI (r2v4 float[]) = (r2v2 float[]), (r2v2 float[]), (r2v5 float[]) binds: [B:59:0x020f, B:55:0x01ee, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:59:0x020f, B:55:0x01ee, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:59:0x020f, B:55:0x01ee, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:59:0x020f, B:55:0x01ee, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:59:0x020f, B:55:0x01ee, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r23v5 short) = (r23v4 short), (r23v3 short), (r23v3 short) binds: [B:59:0x020f, B:55:0x01ee, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0246 A[PHI: r5 r6 r7 r13 r14 r15 r17
      0x0246: PHI (r5v6 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v7 short[]) binds: [B:63:0x0244, B:45:0x0174, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r6v6 int) = (r6v2 int), (r6v2 int), (r6v7 int) binds: [B:63:0x0244, B:45:0x0174, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r7v6 int) = (r7v2 int), (r7v2 int), (r7v7 int) binds: [B:63:0x0244, B:45:0x0174, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r13v6 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:63:0x0244, B:45:0x0174, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r14v6 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:63:0x0244, B:45:0x0174, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r15v6 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:63:0x0244, B:45:0x0174, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r17v6 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:63:0x0244, B:45:0x0174, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x027e A[PHI: r16
      0x027e: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:67:0x027c, B:41:0x014b, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        int i3;
        C0355 c0355 = this;
        int i4 = C3448.f11240;
        int i5 = C3492.f12043;
        int iM31610 = C0773.m3169("ۗۢ") ^ i4;
        int i6 = ((iM31610 ^ i5) * (-24559)) ^ (-894074333);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM31610 ^ 743358211;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        int i16 = 181497864;
        short s2 = 0;
        ObjectAnimator objectAnimatorM12917 = null;
        View view = null;
        float[] fArr = null;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i5) * (-31041)) >> 31));
            switch (i16) {
                case -2072520489:
                case -946291788:
                    if (C1783.f6087 > 0) {
                        iM2761 = (C0773.m3169("ܳᩳ") ^ i4) * 99;
                        i6 = ((iM2761 ^ i5) * 1433) ^ 2036324849;
                        i = -1233456458;
                        i7 = iM2761 ^ i;
                        c0355 = this;
                    } else {
                        iM3169 = C0773.m3169("᩷ۙ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-8679)) ^ (-633451768);
                        i3 = -857526494;
                        i7 = iM3169 ^ i3;
                        i6 = i2;
                    }
                    break;
                case -1724504020:
                case -969858903:
                    view = c0355.f1866;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("᩸ۧ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-17873)) ^ 785432566;
                        i3 = -676670371;
                    } else {
                        iM3169 = (i5 - C0773.m3169("۬۫")) * 27;
                        i2 = ((iM3169 ^ i4) * 28763) ^ (-1983694986);
                        i3 = -611286917;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1692740938:
                case 1647264740:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ۤܶ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-7431)) ^ (-1973179796);
                        i = 1531903243;
                        i7 = iM2761 ^ i;
                        c0355 = this;
                    } else {
                        iM3169 = C0773.m3169("᩷ۙ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-8679)) ^ (-633451768);
                        i3 = -857526494;
                        i7 = iM3169 ^ i3;
                        i6 = i2;
                    }
                    break;
                case -1664763223:
                case 1220066576:
                    AbstractC0116.m1243();
                    iM3169 = C0773.m3169("᩷ۙ") ^ i5;
                    i2 = ((iM3169 ^ i4) * (-8679)) ^ (-633451768);
                    i3 = -857526494;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1662357820:
                case -552171351:
                    C23916.m53419();
                    break;
                case -1653177507:
                case 172085240:
                    c = 14;
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("ܳᩳ") ^ i4) * 99;
                        i6 = ((iM2761 ^ i5) * 1433) ^ 2036324849;
                        i = -1233456458;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ܺ᩷")) * (-83);
                        i6 = ((iM2761 ^ i4) * 30323) ^ (-1097235181);
                        i = 1621175826;
                    }
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
                case -1572390637:
                case -402829490:
                    s = sArr[c];
                    s2 = 8136;
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("ۤܶ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-7431)) ^ (-1973179796);
                        i = 1531903243;
                    } else {
                        iM2761 = (C0773.m3169("ܶۤ") + i4) * 29;
                        i6 = ((iM2761 ^ i5) * 8109) ^ 1671391539;
                        i = -1299351602;
                    }
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
                case -1483777822:
                case -321200631:
                    i13 = 37188;
                    iM2761 = (C0773.m3169("֡᩵") + i5) * 77;
                    i6 = ((iM2761 ^ i4) * 23353) ^ (-858353792);
                    i = 1936101406;
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
                case -1216579159:
                case -1006118578:
                    sArr = f1863;
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0619.m2761("۠ۚ") + i4) * 37;
                        i6 = ((iM2761 ^ i5) * (-21915)) ^ (-1141934194);
                        i = 1431352468;
                    } else {
                        iM2761 = (C0619.m2761("᩻ᩴ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i5) * 2239) ^ 544276375;
                        i = -970234753;
                    }
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
                case -1094279822:
                case 240443709:
                    C17202.m40379(animator, C2354.m7980(sArr2, i14, i15, i13));
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("۠ۚ") + i4) * 37;
                        i6 = ((iM2761 ^ i5) * (-21915)) ^ (-1141934194);
                        i = 1431352468;
                        i7 = iM2761 ^ i;
                    } else {
                        int iM31611 = (C0773.m3169("᩺ܶ") ^ i5) * (-39);
                        i7 = iM31611 ^ (-1446937917);
                        i6 = ((iM31611 ^ i4) * (-735)) ^ 1289750347;
                    }
                    c0355 = this;
                    break;
                case -1048859467:
                case 374230843:
                    sArr3 = f1863;
                    i8 = 24;
                    i9 = 5;
                    if (C2702.f8586 > 0) {
                        iM3169 = C0619.m2761("ۨ᩻") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-24451)) ^ 169627011;
                        i3 = 162852067;
                        i7 = iM3169 ^ i3;
                        i6 = i2;
                    } else {
                        iM2761 = (C0773.m3169("ܳᩳ") ^ i4) * 99;
                        i6 = ((iM2761 ^ i5) * 1433) ^ 2036324849;
                        i = -1233456458;
                        i7 = iM2761 ^ i;
                        c0355 = this;
                    }
                    break;
                case -1000377349:
                case 581515533:
                    C2023.m6964();
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("۠ۚ") + i4) * 37;
                        i6 = ((iM2761 ^ i5) * (-21915)) ^ (-1141934194);
                        i = 1431352468;
                        i7 = iM2761 ^ i;
                        c0355 = this;
                    }
                    iM2761 = C0619.m2761("ۤܶ") ^ i5;
                    i6 = ((iM2761 ^ i4) * (-7431)) ^ (-1973179796);
                    i = 1531903243;
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
                case -503471914:
                case 363554393:
                    objectAnimatorM12917 = C3998.m12917(view, RunnableC1848.m6366(sArr3, i8, i9, i13), fArr);
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("᩸ۧ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-17873)) ^ 785432566;
                        i3 = -676670371;
                    } else {
                        iM3169 = (C0773.m3169("۠ᩳ") + i4) * 39;
                        i2 = ((iM3169 ^ i5) * 4433) ^ (-1703102414);
                        i3 = 1603119558;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -486994294:
                case -131640080:
                    i10 = s * s2;
                    i11 = s * s;
                    i12 = 16548624;
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ۤܶ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-7431)) ^ (-1973179796);
                        i = 1531903243;
                    } else {
                        iM2761 = C0773.m3169("ܽۨ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-31529)) ^ (-1133959581);
                        i = 454095507;
                    }
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
                case -341444608:
                case 1913588167:
                    sArr2 = f1863;
                    i14 = 15;
                    i15 = 9;
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ܳᩳ") ^ i4) * 99;
                        i6 = ((iM2761 ^ i5) * 1433) ^ 2036324849;
                        i = -1233456458;
                    } else {
                        iM2761 = C0773.m3169("ۗܳ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-15945)) ^ 133252890;
                        i = -434272601;
                    }
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
                case 115256093:
                case 1022203241:
                    C1519.m5397(objectAnimatorM12917);
                    C1101 c1101 = c0355.f1865;
                    c1101.f3917 = objectAnimatorM12917;
                    c1101.f3918 = true;
                    break;
                case 149326097:
                case 1024811086:
                    if ((i11 + i12) - i10 >= 0) {
                        iM2761 = (C0619.m2761("ۤᩴ") + i4) * (-61);
                        i6 = ((iM2761 ^ i5) * (-24895)) ^ (-502196160);
                        i = 29065280;
                    } else {
                        iM2761 = C0773.m3169("۬ۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 4077) ^ 1111016093;
                        i = -424920445;
                    }
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
                case 1522555342:
                case 1548942382:
                    fArr = new float[]{0.0f, 1.0f};
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = C0619.m2761("᩹ۢ") ^ i4;
                        i2 = ((iM3169 ^ i5) * 32203) ^ 684615143;
                        i3 = 1903996675;
                        i7 = iM3169 ^ i3;
                        i6 = i2;
                    } else {
                        iM2761 = C0619.m2761("ۤܶ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-7431)) ^ (-1973179796);
                        i = 1531903243;
                        i7 = iM2761 ^ i;
                        c0355 = this;
                    }
                    break;
                default:
                    i13 = 28931;
                    iM2761 = (C0773.m3169("֡᩵") + i5) * 77;
                    i6 = ((iM2761 ^ i4) * 23353) ^ (-858353792);
                    i = 1936101406;
                    i7 = iM2761 ^ i;
                    c0355 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x024f A[PHI: r3 r4 r5 r6 r7 r8 r10 r11 r16 r17
      0x024f: PHI (r3v3 char) = (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v6 char) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r8v4 short) = (r8v2 short), (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r11v8 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r16v28 int) = (r16v6 int), (r16v7 int), (r16v8 int), (r16v9 int), (r16v14 int), (r16v32 int) binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r17v24 java.lang.String) = 
      (r17v6 java.lang.String)
      (r17v7 java.lang.String)
      (r17v8 java.lang.String)
      (r17v9 java.lang.String)
      (r17v12 java.lang.String)
      (r17v26 java.lang.String)
     binds: [B:57:0x0234, B:53:0x020e, B:49:0x01eb, B:45:0x01c6, B:35:0x0134, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        String str;
        int iM2761;
        int i;
        int i2;
        int i3 = C23916.f77426;
        int i4 = C4238.f15451;
        int iM2762 = (C0619.m2761("ۢ᩸") ^ i4) * (-93);
        int i5 = ((iM2762 ^ i3) * (-1163)) ^ 284230342;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ 1734809962;
        String strM7749 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1727586374;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i3) * (-1611)) >> 31));
            switch (i14) {
                case -2091017299:
                case -1714146450:
                    i14 = i14;
                    C3448.m11248();
                    if (C2702.f8586 > 0) {
                        str = strM7749;
                        iM2761 = C0619.m2761("۫ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 32171) ^ 1729997562;
                        i2 = -1365481512;
                    } else {
                        iM2761 = C0619.m2761("᩻ۚ") ^ i3;
                        str = strM7749;
                        i = ((iM2761 ^ i4) * (-3095)) ^ 1089648692;
                        i2 = -337752405;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -2011583306:
                case 180437754:
                    str = strM7749;
                    i14 = i14;
                    s = sArr[c];
                    i7 = s * s;
                    if (C17202.m40372()) {
                        iM2761 = (i3 - C0773.m3169("۫᩵")) * 35;
                        i = ((iM2761 ^ i4) * (-6127)) ^ 1586837521;
                        i2 = -395745894;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩸۟")) * 39;
                        i = ((iM2761 ^ i3) * 17517) ^ (-1460181660);
                        i2 = 407621979;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -1989436313:
                case -543946737:
                    i14 = i14;
                    strM7749 = C2287.m7749(sArr2, i11, i12, i10);
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("᩻ۚ") ^ i3;
                        str = strM7749;
                        i = ((iM2761 ^ i4) * (-3095)) ^ 1089648692;
                        i2 = -337752405;
                        i13 = i14;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                        strM7749 = str;
                    } else {
                        int iM3169 = (C0773.m3169("᩸ۘ") + i3) * (-51);
                        i5 = ((iM3169 ^ i4) * 27855) ^ 245661898;
                        i13 = i14;
                        i6 = iM3169 ^ 568050060;
                    }
                    break;
                case -1770724192:
                case 2105492082:
                    str = strM7749;
                    i14 = i14;
                    int i15 = s + s2;
                    if (i9 - (i15 * i15) < 0) {
                        iM2761 = C0773.m3169("۬ۢ") ^ i3;
                        i = ((iM2761 ^ i4) * (-30775)) ^ 856369217;
                        i2 = -1796909013;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩵ۖ")) * 127;
                        i = ((iM2761 ^ i4) * (-25803)) ^ 406155567;
                        i2 = 1155686782;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -1540096680:
                case -943546891:
                    str = strM7749;
                    i14 = i14;
                    sArr = f1863;
                    if (C0950.f3488 >= 0) {
                        iM2761 = (i3 - C0773.m3169("֫۬")) * 81;
                        i = ((iM2761 ^ i4) * 11991) ^ (-1551186459);
                        i2 = -717694320;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۛܳ")) * (-121);
                        i = ((iM2761 ^ i3) * 23621) ^ 1409509901;
                        i2 = 2133353073;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -1375283509:
                case -1198859941:
                    i10 = 21367;
                    iM2761 = C0619.m2761("᩸ۚ") ^ i4;
                    str = strM7749;
                    i = ((iM2761 ^ i3) * (-25143)) ^ (-52741287);
                    i2 = -568508495;
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -920909883:
                case 1267925487:
                    str = strM7749;
                    i14 = i14;
                    int i16 = i7 + i8;
                    i9 = i16 + i16;
                    if (C3998.f13671 != 0) {
                        iM2761 = (i4 - C0619.m2761("᩸۟")) * 39;
                        i = ((iM2761 ^ i3) * 17517) ^ (-1460181660);
                        i2 = 407621979;
                    } else {
                        iM2761 = C0619.m2761("۟ᩳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-14241)) ^ (-190234834);
                        i2 = 354675916;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -853043755:
                case 1742718345:
                    C1783.m6232();
                    if (C1321.f4751 >= 0) {
                        str = strM7749;
                        i14 = i14;
                        iM2761 = (i3 - C0773.m3169("֫۬")) * 81;
                        i = ((iM2761 ^ i4) * 11991) ^ (-1551186459);
                        i2 = -717694320;
                        i13 = i14;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                        strM7749 = str;
                    }
                    i14 = i14;
                    iM2761 = C0619.m2761("᩻ۚ") ^ i3;
                    str = strM7749;
                    i = ((iM2761 ^ i4) * (-3095)) ^ 1089648692;
                    i2 = -337752405;
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -784456062:
                case -572013642:
                    i14 = i14;
                    AbstractC0116.m1243();
                    C1080.m4050();
                    str = strM7749;
                    iM2761 = C0619.m2761("۫ۙ") ^ i4;
                    i = ((iM2761 ^ i3) * 32171) ^ 1729997562;
                    i2 = -1365481512;
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -531088031:
                case 1707754866:
                    C3734.m12144(animator, strM7749);
                    this.f1865.f3918 = true;
                    break;
                case -459663330:
                case 1115108210:
                    str = strM7749;
                    i14 = i14;
                    i8 = 153289161;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (i4 - C0619.m2761("᩸۟")) * 39;
                        i = ((iM2761 ^ i3) * 17517) ^ (-1460181660);
                        i2 = 407621979;
                    } else {
                        iM2761 = C0773.m3169("֨ۗ") ^ i4;
                        i = ((iM2761 ^ i3) * (-12345)) ^ 1510982106;
                        i2 = -47936791;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -259100028:
                case 1955296021:
                    C1564.m5509();
                    if (AbstractC3624.m11755() == 0) {
                        i14 = i14;
                        iM2761 = C0619.m2761("᩻ۚ") ^ i3;
                        str = strM7749;
                        i = ((iM2761 ^ i4) * (-3095)) ^ 1089648692;
                        i2 = -337752405;
                        i13 = i14;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                        strM7749 = str;
                    } else {
                        int iM31610 = (i4 - C0773.m3169("ᩳܶ")) * 87;
                        i6 = iM31610 ^ (-1804522585);
                        i5 = ((iM31610 ^ i3) * 7579) ^ 1395577783;
                        i13 = i14;
                    }
                    break;
                case -127975369:
                case 1833678134:
                    str = strM7749;
                    i14 = i14;
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("۫ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 32171) ^ 1729997562;
                        i2 = -1365481512;
                    } else {
                        iM2761 = (C0619.m2761("ܳܿ") ^ i3) * (-73);
                        i = ((iM2761 ^ i4) * 25549) ^ (-821228802);
                        i2 = -221018557;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case -30412506:
                case 1755920890:
                    i14 = i14;
                    sArr2 = f1863;
                    if (C0950.f3488 >= 0) {
                        str = strM7749;
                        i11 = 5;
                        iM2761 = (i4 - C0619.m2761("᩸۟")) * 39;
                        i = ((iM2761 ^ i3) * 17517) ^ (-1460181660);
                        i2 = 407621979;
                        i13 = i14;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                        strM7749 = str;
                    } else {
                        int iM31611 = (i3 - C0773.m3169("᩵֨")) * (-49);
                        i13 = i14;
                        i6 = iM31611 ^ (-2038499295);
                        i5 = ((iM31611 ^ i4) * 22439) ^ 1101118604;
                        i11 = 5;
                    }
                    break;
                case 313897756:
                case 1030089100:
                    i14 = i14;
                    if (C2354.f7599 >= 0) {
                        i12 = 9;
                        iM2761 = C0619.m2761("᩻ۚ") ^ i3;
                        str = strM7749;
                        i = ((iM2761 ^ i4) * (-3095)) ^ 1089648692;
                        i2 = -337752405;
                        i13 = i14;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                        strM7749 = str;
                    } else {
                        int iM2763 = C0619.m2761("ۗ᩹") ^ i4;
                        i13 = i14;
                        i6 = iM2763 ^ 1071402956;
                        i5 = ((iM2763 ^ i3) * (-6493)) ^ (-1841766209);
                        i12 = 9;
                    }
                    break;
                case 405505983:
                case 1732703166:
                    C3077.m10041();
                    break;
                case 801132590:
                case 1302244693:
                    str = strM7749;
                    i14 = i14;
                    s2 = 12381;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i4 - C0619.m2761("᩸۟")) * 39;
                        i = ((iM2761 ^ i3) * 17517) ^ (-1460181660);
                        i2 = 407621979;
                    } else {
                        iM2761 = C0773.m3169("ۗܿ") ^ i4;
                        i = ((iM2761 ^ i3) * (-27639)) ^ (-650274947);
                        i2 = 549651137;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                case 1909346453:
                case 2062171024:
                    i10 = 1822;
                    iM2761 = C0619.m2761("᩸ۚ") ^ i4;
                    str = strM7749;
                    i = ((iM2761 ^ i3) * (-25143)) ^ (-52741287);
                    i2 = -568508495;
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
                default:
                    str = strM7749;
                    i14 = i14;
                    c = 4;
                    if (C0862.f3233 != 0) {
                        iM2761 = (i4 - C0619.m2761("᩸۟")) * 39;
                        i = ((iM2761 ^ i3) * 17517) ^ (-1460181660);
                        i2 = 407621979;
                    } else {
                        iM2761 = C0619.m2761("ۨۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-175)) ^ (-1866281878);
                        i2 = 1051610470;
                    }
                    i13 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    strM7749 = str;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0145 A[PHI: r1 r2 r5
      0x0145: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v4 int) binds: [B:51:0x0143, B:47:0x0128, B:39:0x00ec, B:31:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String) binds: [B:51:0x0143, B:47:0x0128, B:39:0x00ec, B:31:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:51:0x0143, B:47:0x0128, B:39:0x00ec, B:31:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0190 A[PHI: r3 r4
      0x0190: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:59:0x018e, B:35:0x00cb, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:59:0x018e, B:35:0x00cb, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01b9 A[PHI: r6
      0x01b9: PHI (r6v5 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:43:0x010a, B:11:0x004b, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    public C0355(View view, C1101 c1101, AbstractActivityC17204 abstractActivityC17204) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        int i5 = 0;
        String strM2820 = null;
        int iM2761 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 1655670510;
        int i9 = C0773.f2792;
        int i10 = C1564.f5401;
        short s = f1863[0];
        int i11 = s + 1;
        int i12 = ((s * 2) + 1) - (i11 * i11) > 0 ? 56418 : 17708;
        int iM31611 = C0773.m3169("۬۬") ^ i9;
        int i13 = ((iM31611 ^ i10) * 11747) ^ 2098069163;
        int i14 = 103385121;
        while (true) {
            int i15 = iM31611 ^ i14;
            while (true) {
                i8 = ((((i8 ^ i10) * (-14037)) >> 31) & i13) ^ i15;
                switch (i8) {
                    case -2124338606:
                    case 1089437546:
                        C0950.m3785();
                        if (C2485.f7950 == 0) {
                            iM31610 = C0773.m3169("᩹ۘ") ^ i9;
                            i3 = ((iM31610 ^ i10) * 14679) ^ (-1980541447);
                            i4 = 742430880;
                            i15 = iM31610 ^ i4;
                            i13 = i3;
                        } else {
                            iM3169 = (i10 - C0619.m2761("ܳ۟")) * (-43);
                            i = ((iM3169 ^ i9) * 27539) ^ 2013500857;
                            i2 = 1066728921;
                            i15 = iM3169 ^ i2;
                            i13 = i;
                        }
                        break;
                    case -2035768808:
                    case -736118096:
                        if (!C2878.f9462) {
                        }
                        iM31610 = C0773.m3169("᩹ۘ") ^ i9;
                        i3 = ((iM31610 ^ i10) * 14679) ^ (-1980541447);
                        i4 = 742430880;
                        i15 = iM31610 ^ i4;
                        i13 = i3;
                        break;
                    case -1958864734:
                    case -383622661:
                        if (C2287.f7432 >= 0) {
                            iM3169 = C0773.m3169("ۙ᩹") ^ i9;
                            i = ((iM3169 ^ i10) * (-25033)) ^ 1217418110;
                            i2 = -1501483815;
                        } else {
                            iM3169 = (C0773.m3169("ۢ᩶") + i10) * (-31);
                            i = ((iM3169 ^ i9) * (-12743)) ^ 986042114;
                            i2 = 107390151;
                        }
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                    case -1715508642:
                    case 1346663086:
                        if (C1519.f5300 < 0) {
                            iM3169 = C0619.m2761("᩹᩺") ^ i10;
                            i = ((iM3169 ^ i9) * (-9577)) ^ 1082909588;
                            i2 = -1816735895;
                            i15 = iM3169 ^ i2;
                            i13 = i;
                        } else {
                            iM31610 = C0773.m3169("᩹ۘ") ^ i9;
                            i3 = ((iM31610 ^ i10) * 14679) ^ (-1980541447);
                            i4 = 742430880;
                            i15 = iM31610 ^ i4;
                            i13 = i3;
                        }
                        break;
                    case -1668048192:
                    case 1447374304:
                        i7 = 1;
                        if (C1519.f5300 >= 0) {
                            iM3169 = (C0619.m2761("᩷֫") ^ i9) * 19;
                            i = ((iM3169 ^ i10) * (-16493)) ^ (-1066166428);
                            i2 = -1052472467;
                        } else {
                            iM3169 = C0619.m2761("᩶֫") ^ i9;
                            i = ((iM3169 ^ i10) * 18661) ^ (-249487345);
                            i2 = 2064141137;
                        }
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                    case -1529266134:
                    case -1169980709:
                        if (C3734.f12817 >= 0) {
                            iM3169 = (i10 - C0619.m2761("ܳ۟")) * (-43);
                            i = ((iM3169 ^ i9) * 27539) ^ 2013500857;
                            i2 = 1066728921;
                        } else {
                            iM3169 = C0773.m3169("᩺ۢ") ^ i9;
                            i = ((iM3169 ^ i10) * 31507) ^ 2098102726;
                            i2 = 584659375;
                        }
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                    case -1440094107:
                    case -471337218:
                        C23916.m53419();
                        if (C2419.f7754 >= 0) {
                            iM3169 = (C0619.m2761("᩷֫") ^ i9) * 19;
                            i = ((iM3169 ^ i10) * (-16493)) ^ (-1066166428);
                            i2 = -1052472467;
                            i15 = iM3169 ^ i2;
                            i13 = i;
                        } else {
                            iM31610 = C0773.m3169("᩹ۘ") ^ i9;
                            i3 = ((iM31610 ^ i10) * 14679) ^ (-1980541447);
                            i4 = 742430880;
                            i15 = iM31610 ^ i4;
                            i13 = i3;
                        }
                        break;
                    case -922995411:
                    case 1958161672:
                        this.f1865 = c1101;
                        this.f1864 = abstractActivityC17204;
                        if (C3099.f10023 <= 0) {
                            iM31610 = C0773.m3169("᩹ۘ") ^ i9;
                            i3 = ((iM31610 ^ i10) * 14679) ^ (-1980541447);
                            i4 = 742430880;
                        } else {
                            iM31610 = (C0773.m3169("ۢܰ") + i10) * 85;
                            i3 = ((iM31610 ^ i9) * (-4633)) ^ (-2140606410);
                            i4 = -1327955538;
                        }
                        i15 = iM31610 ^ i4;
                        i13 = i3;
                        break;
                    case -880259320:
                    case -704628177:
                        this.f1866 = C3448.m11246(view, i5);
                        return;
                    case -830020291:
                    case 1463240490:
                        C13473.m33144();
                        throw new RuntimeException();
                    case -823450660:
                    case 1591597942:
                        C0619.m2763();
                        C1321.m4852();
                        iM3169 = (i10 - C0619.m2761("ܳ۟")) * (-43);
                        i = ((iM3169 ^ i9) * 27539) ^ 2013500857;
                        i2 = 1066728921;
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                    case -806665877:
                    case 1856200798:
                        iM2761 = C0619.m2761(strM2820);
                        i6 = 2128318039;
                        if (C3779.f12953 <= 0) {
                            iM3169 = (i10 - C0619.m2761("ܳ۟")) * (-43);
                            i = ((iM3169 ^ i9) * 27539) ^ 2013500857;
                            i2 = 1066728921;
                        } else {
                            iM3169 = C0773.m3169("᩹֫") ^ i10;
                            i = ((iM3169 ^ i9) * (-18283)) ^ 546551018;
                            i2 = 367163939;
                        }
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                    case -697235511:
                    case 160762381:
                        strM2820 = AbstractC0641.m2820(sArr, i7, 3, i12);
                        if (C17202.f56030) {
                            iM3169 = (C0619.m2761("۫۫") ^ i10) * (-41);
                            i = ((iM3169 ^ i9) * (-32225)) ^ 1908240849;
                            i2 = 862200427;
                        } else {
                            iM3169 = C0773.m3169("ۙ᩹") ^ i9;
                            i = ((iM3169 ^ i10) * (-25033)) ^ 1217418110;
                            i2 = -1501483815;
                        }
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                    case -6169152:
                    case 1870045634:
                        i5 = iM2761 ^ i6;
                        if (C4282.f15546 <= 0) {
                            iM3169 = C0773.m3169("ۙ᩹") ^ i9;
                            i = ((iM3169 ^ i10) * (-25033)) ^ 1217418110;
                            i2 = -1501483815;
                        } else {
                            iM3169 = (C0773.m3169("ۗܺ") + i9) * 15;
                            i = ((iM3169 ^ i10) * 8247) ^ 1804936710;
                            i2 = 1633014011;
                        }
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                    case 555222112:
                    case 788567164:
                        sArr = f1863;
                        if (C2375.f7641 <= 0) {
                            iM3169 = C0773.m3169("ۙ᩹") ^ i9;
                            i = ((iM3169 ^ i10) * (-25033)) ^ 1217418110;
                            i2 = -1501483815;
                        } else {
                            iM3169 = C0619.m2761("ۙܺ") ^ i9;
                            i = ((iM3169 ^ i10) * 9051) ^ (-709662407);
                            i2 = -301123096;
                        }
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                    default:
                        if (C3779.m12264()) {
                            iM3169 = (C0619.m2761("۟᩷") + i9) * (-97);
                            i = ((iM3169 ^ i10) * 2551) ^ 1378939941;
                            i2 = 893438805;
                        } else {
                            iM3169 = (C0619.m2761("᩷֫") ^ i9) * 19;
                            i = ((iM3169 ^ i10) * (-16493)) ^ (-1066166428);
                            i2 = -1052472467;
                        }
                        i15 = iM3169 ^ i2;
                        i13 = i;
                        break;
                }
            }
            iM31611 = (C0619.m2761("֡ۗ") + i10) * 79;
            i13 = ((iM31611 ^ i9) * (-4117)) ^ (-96442015);
            i14 = 921791801;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 24141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r37) {
        /*
            Method dump skipped, instruction units count: 2414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0355.onAnimationStart(android.animation.Animator):void");
    }
}
