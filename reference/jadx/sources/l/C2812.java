package l;

import android.content.Intent;
import bin.mt.plugin.api.preference.PluginPreference;
import com.alipay.sdk.m.y.q;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2812 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩻۬ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f10685 = {3952, 23937, 23990, 23978, 23983, 23975, 24035, 23987, 23985, 23974, 23973, 23974, 23985, 23974, 23981, 23968, 23974, 24035, 23973, 23970, 23978, 23983, 23974, 23975, 7509, -3123, -3119, -3128, -3110, -3116, -3117, -3091, -3121, -3112, -3109, -3112, -3121, -3112, -3117, -3106, -3112};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19041 f10686;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11986 f10687;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public PluginPreference f10688;

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x010c A[PHI: r3
      0x010c: PHI (r3v5 l.ۧ֨ۘ) = (r3v4 l.ۧ֨ۘ), (r3v2 l.ۧ֨ۘ), (r3v2 l.ۧ֨ۘ) binds: [B:36:0x010a, B:18:0x0087, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01f2 A[PHI: r7 r8 r21
      0x01f2: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:55:0x01d7, B:9:0x005e, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:55:0x01d7, B:9:0x005e, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r21v4 char) = (r21v3 char), (r21v3 char), (r21v6 char) binds: [B:55:0x01d7, B:9:0x005e, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0227 A[PHI: r5 r10 r11 r12 r15 r16
      0x0227: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:61:0x0225, B:47:0x0197, B:28:0x00c3, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:61:0x0225, B:47:0x0197, B:28:0x00c3, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:61:0x0225, B:47:0x0197, B:28:0x00c3, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:61:0x0225, B:47:0x0197, B:28:0x00c3, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:61:0x0225, B:47:0x0197, B:28:0x00c3, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:61:0x0225, B:47:0x0197, B:28:0x00c3, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0257 A[PHI: r4 r9 r14
      0x0257: PHI (r4v3 l.ᩴ᩹ۘ) = (r4v2 l.ᩴ᩹ۘ), (r4v2 l.ᩴ᩹ۘ), (r4v2 l.ᩴ᩹ۘ), (r4v4 l.ᩴ᩹ۘ) binds: [B:65:0x0255, B:51:0x01b7, B:32:0x00e1, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:65:0x0255, B:51:0x01b7, B:32:0x00e1, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:65:0x0255, B:51:0x01b7, B:32:0x00e1, B:24:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        int iM11306;
        int i;
        int i2;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i4 = C1875.f7103;
        int iM11307 = (i4 - ThreadFactoryC3888.m11306("ۙ۬")) * 73;
        int i5 = ((iM11307 ^ i3) * (-30821)) ^ (-1833183808);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ 2065816898;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -815623424;
        char c = 0;
        ActivityC19041 activityC19041 = null;
        C10659 c10659 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-28539)) >> 31));
            switch (i14) {
                case -2103812701:
                case 691968295:
                    C2788.m8472();
                    iM11306 = (i3 - C19806.m45029("ۧ۫")) * 71;
                    i = ((iM11306 ^ i4) * 27183) ^ (-1814385742);
                    i2 = 613290586;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2082942753:
                case 330009909:
                    C2124.m6673();
                    break;
                case -1982118484:
                case -51782153:
                    c10659 = (C10659) this.f10687.m29831();
                    if (C1460.m5050() != 0) {
                        iM11306 = (i3 - C19806.m45029("ۧ۫")) * 71;
                        i = ((iM11306 ^ i4) * 27183) ^ (-1814385742);
                        i2 = 613290586;
                    } else {
                        iM11306 = C19806.m45029("ᩴᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * 12659) ^ 966274007;
                        i2 = -778585929;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1974146957:
                case -390890103:
                    C2249.m6915();
                    if (C3535.m10431() <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۧ۫")) * 71;
                        i = ((iM11306 ^ i4) * 27183) ^ (-1814385742);
                        i2 = 613290586;
                    } else {
                        iM11306 = C19806.m45029("۫ܺ") ^ i3;
                        i = ((iM11306 ^ i4) * (-1021)) ^ (-1534559333);
                        i2 = 597202363;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1834231453:
                case 983950746:
                    sArr2 = f10685;
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("֡ۜ") ^ i3;
                        i = ((iM11306 ^ i4) * 19513) ^ (-1871120656);
                        i2 = 254017447;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܳᩴ")) * 95;
                        i = ((iM11306 ^ i3) * (-28249)) ^ 1596725134;
                        i2 = -1522647034;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1813426308:
                case 575007867:
                    i9 = i8 * i8;
                    i10 = s * s;
                    i11 = 362521600;
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * (-20355)) ^ 1166776199;
                        i2 = 58806847;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۛۗ")) * (-73);
                        i = ((iM11306 ^ i3) * (-15373)) ^ (-1144045634);
                        i2 = -1559710053;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1373544629:
                case -521954110:
                    C1377.m4833();
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("۫ܺ") ^ i3;
                        i = ((iM11306 ^ i4) * (-1021)) ^ (-1534559333);
                        i2 = 597202363;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۨ") ^ i4) * 85;
                        i = ((iM11306 ^ i3) * (-10263)) ^ (-1863050060);
                        i2 = -1203356365;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1345571788:
                case 1785840816:
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("۫ܺ") ^ i3;
                        i = ((iM11306 ^ i4) * (-1021)) ^ (-1534559333);
                        i2 = 597202363;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * (-20355)) ^ 1166776199;
                        i2 = 58806847;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1327533442:
                case 297821621:
                    i8 = s + s2;
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("֡ۜ") ^ i3;
                        i = ((iM11306 ^ i4) * 19513) ^ (-1871120656);
                        i2 = 254017447;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-14925)) ^ 1546807805;
                        i2 = -2092490808;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -758474852:
                case 545845320:
                    s = sArr[c];
                    s2 = 19040;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۨ") ^ i4) * 85;
                        i = ((iM11306 ^ i3) * (-10263)) ^ (-1863050060);
                        i2 = -1203356365;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩴܰ")) * (-63);
                        i = ((iM11306 ^ i3) * (-25023)) ^ 1076209869;
                        i2 = -1352085937;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -639463391:
                case 551259328:
                    c10659.log(C1461.m5070(sArr2, i13, i7, i12), exc);
                    activityC19041 = this.f10686;
                    if (C0817.f3443) {
                        iM11306 = (C19806.m45029("ܶ᩵") ^ i4) * 33;
                        i = ((iM11306 ^ i3) * (-18919)) ^ (-102956795);
                        i2 = -1565377902;
                    } else {
                        iM11306 = C19806.m45029("֡ۜ") ^ i3;
                        i = ((iM11306 ^ i4) * 19513) ^ (-1871120656);
                        i2 = 254017447;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -471340430:
                case 1157592777:
                    i13 = 1;
                    i7 = 23;
                    if (C3286.m9798() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * (-20355)) ^ 1166776199;
                        i2 = 58806847;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۤ") ^ i3;
                        i = ((iM11306 ^ i4) * (-18287)) ^ (-1992728244);
                        i2 = -2116452816;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -451705448:
                case -203616768:
                    activityC19041.m31003((Throwable) exc, true);
                    break;
                case 64414124:
                case 819727315:
                    sArr = f10685;
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * (-20355)) ^ 1166776199;
                        i2 = 58806847;
                    } else {
                        iM11306 = (C19806.m45029("᩸ᩳ") ^ i4) * (-23);
                        i = ((iM11306 ^ i3) * (-23173)) ^ 836985175;
                        i2 = 1178894049;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 511138279:
                case 1809958792:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("֡ۜ") ^ i3;
                        i = ((iM11306 ^ i4) * 19513) ^ (-1871120656);
                        i2 = 254017447;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩻") ^ i3) * (-87);
                        i = ((iM11306 ^ i4) * (-2827)) ^ 909650145;
                        i2 = 1264523111;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 833740503:
                case 1062921721:
                    i12 = 55072;
                    iM11306 = C19806.m45029("۬ܳ") ^ i3;
                    i = ((iM11306 ^ i4) * (-7537)) ^ 704737832;
                    i2 = 1575687559;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1278690940:
                case 1927602994:
                    int i15 = i10 + i11;
                    if (i9 - (i15 + i15) > 0) {
                        iM11306 = C19806.m45029("ۙۤ") ^ i4;
                        i = ((iM11306 ^ i3) * (-26499)) ^ 664544195;
                        i2 = -629139887;
                    } else {
                        iM11306 = C19806.m45029("ۜܶ") ^ i3;
                        i = ((iM11306 ^ i4) * (-18943)) ^ 1483698448;
                        i2 = -1065552407;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1635662724:
                case 1963661140:
                    i12 = 24003;
                    iM11306 = C19806.m45029("۬ܳ") ^ i3;
                    i = ((iM11306 ^ i4) * (-7537)) ^ 704737832;
                    i2 = 1575687559;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 0;
                    if (C3286.f12186) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۨ") ^ i4) * 85;
                        i = ((iM11306 ^ i3) * (-10263)) ^ (-1863050060);
                        i2 = -1203356365;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ֡") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i4) * 1801) ^ (-448616259);
                        i2 = -1611482800;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x018e A[PHI: r4 r5 r6 r7 r13 r15
      0x018e: PHI (r4v4 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:50:0x018c, B:35:0x00f4, B:31:0x00d4, B:27:0x00b4, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r5v3 l.ۨ᩹ۘ) = (r5v2 l.ۨ᩹ۘ), (r5v2 l.ۨ᩹ۘ), (r5v2 l.ۨ᩹ۘ), (r5v2 l.ۨ᩹ۘ), (r5v4 l.ۨ᩹ۘ) binds: [B:50:0x018c, B:35:0x00f4, B:31:0x00d4, B:27:0x00b4, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r6v3 bin.mt.plugin.api.preference.PluginPreference) = 
      (r6v2 bin.mt.plugin.api.preference.PluginPreference)
      (r6v2 bin.mt.plugin.api.preference.PluginPreference)
      (r6v2 bin.mt.plugin.api.preference.PluginPreference)
      (r6v2 bin.mt.plugin.api.preference.PluginPreference)
      (r6v4 bin.mt.plugin.api.preference.PluginPreference)
     binds: [B:50:0x018c, B:35:0x00f4, B:31:0x00d4, B:27:0x00b4, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:50:0x018c, B:35:0x00f4, B:31:0x00d4, B:27:0x00b4, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:50:0x018c, B:35:0x00f4, B:31:0x00d4, B:27:0x00b4, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:50:0x018c, B:35:0x00f4, B:31:0x00d4, B:27:0x00b4, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c4 A[PHI: r11 r12
      0x01c4: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:54:0x01c2, B:15:0x006d, B:12:0x0064, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:54:0x01c2, B:15:0x006d, B:12:0x0064, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01fb A[PHI: r2 r3 r9 r10
      0x01fb: PHI (r2v4 l.ᩴ᩹ۘ) = (r2v2 l.ᩴ᩹ۘ), (r2v3 l.ᩴ᩹ۘ), (r2v2 l.ᩴ᩹ۘ), (r2v2 l.ᩴ᩹ۘ) binds: [B:58:0x01f9, B:39:0x0116, B:17:0x0071, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r3v4 android.content.Intent) = 
      (r3v2 android.content.Intent)
      (r3v3 android.content.Intent)
      (r3v2 android.content.Intent)
      (r3v2 android.content.Intent)
     binds: [B:58:0x01f9, B:39:0x0116, B:17:0x0071, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:58:0x01f9, B:39:0x0116, B:17:0x0071, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:58:0x01f9, B:39:0x0116, B:17:0x0071, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022e A[PHI: r21
      0x022e: PHI (r21v5 char) = (r21v4 char), (r21v3 char) binds: [B:62:0x022c, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x025a A[PHI: r16
      0x025a: PHI (r16v3 short[]) = (r16v2 short[]), (r16v5 short[]) binds: [B:9:0x005e, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        int iM45029;
        int i;
        int i2;
        int i3 = C2642.f10294;
        int i4 = C1937.f7317;
        int iM450210 = (C19806.m45029("ۖۜ") + i4) * (-71);
        int i5 = ((iM450210 ^ i3) * (-25435)) ^ (-363649882);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ 2824631;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 294281929;
        char c = 0;
        PluginPreference pluginPreferenceM29808 = null;
        C11986 c11986 = null;
        String strM7082 = null;
        Intent intentM6287 = null;
        ActivityC19041 activityC19041 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 19701) >> 31));
            switch (i11) {
                case -2116891816:
                case 1944254356:
                    C1977.m6356();
                    iM45029 = C19806.m45029("۠۟") ^ i4;
                    i = ((iM45029 ^ i3) * (-5973)) ^ 1088544879;
                    i2 = 1159801580;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1880707577:
                case -208327771:
                    i8 = s * s2;
                    s3 = 9722;
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("۬ܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9659)) ^ 390613661;
                        i2 = 1819889764;
                    } else {
                        iM45029 = (C19806.m45029("ܿ۬") + i4) * 65;
                        i = ((iM45029 ^ i3) * (-16969)) ^ (-1557226362);
                        i2 = -1523257539;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1781803453:
                case -54713573:
                    c = 24;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ܿ᩶") ^ i4;
                        i = ((iM45029 ^ i3) * (-30475)) ^ 642908598;
                        i2 = -1254939062;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩳۛ")) * 49;
                        i = ((iM45029 ^ i3) * (-8967)) ^ (-619450908);
                        i2 = 881215942;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1755092794:
                case 1586473008:
                    s = sArr[c];
                    s2 = 38888;
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ۘۧ") + i3) * (-17);
                        i = ((iM45029 ^ i4) * 20177) ^ 1676467912;
                        i2 = 1769535520;
                    } else {
                        iM45029 = C19806.m45029("۠۟") ^ i4;
                        i = ((iM45029 ^ i3) * (-5973)) ^ 1088544879;
                        i2 = 1159801580;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1674646068:
                case 286615771:
                    sArr2 = f10685;
                    if (C0050.f912 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ܰ")) * (-109);
                        i = ((iM45029 ^ i3) * (-8481)) ^ (-1248576979);
                        i2 = -778634888;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩷") ^ i4;
                        i = ((iM45029 ^ i3) * 21201) ^ 1634760520;
                        i2 = 1532406386;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1365408642:
                case -1260967895:
                    C2332.m7079();
                    break;
                case -1357500348:
                case 2048203034:
                    activityC19041 = this.f10686;
                    intentM6287 = C1937.m6287(activityC19041);
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("۠۟") ^ i4;
                        i = ((iM45029 ^ i3) * (-5973)) ^ 1088544879;
                        i2 = 1159801580;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩻") ^ i3) * 97;
                        i = ((iM45029 ^ i4) * 14247) ^ (-1406228134);
                        i2 = 1709007434;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1326832187:
                case -253955952:
                    i7 = 25;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ܰ")) * (-109);
                        i = ((iM45029 ^ i3) * (-8481)) ^ (-1248576979);
                        i2 = -778634888;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡ᩸")) * 97;
                        i = ((iM45029 ^ i3) * (-21169)) ^ 1196998761;
                        i2 = 480317964;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -841636736:
                case 720531539:
                    C1148.m4232();
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("۠۟") ^ i4;
                        i = ((iM45029 ^ i3) * (-5973)) ^ 1088544879;
                        i2 = 1159801580;
                    } else {
                        iM45029 = C19806.m45029("۬ܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9659)) ^ 390613661;
                        i2 = 1819889764;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -629726901:
                case -356992258:
                    i10 = 33361;
                    iM45029 = ThreadFactoryC3888.m11306("᩸ܿ") ^ i3;
                    i = ((iM45029 ^ i4) * (-17755)) ^ (-1577735794);
                    i2 = -1332842055;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -596753695:
                case 821922093:
                    String strM10060 = RunnableC3388.m10060(intentM6287, strM7082);
                    c11986 = this.f10687;
                    pluginPreferenceM29808 = c11986.m29808(strM10060);
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ܰ")) * (-109);
                        i = ((iM45029 ^ i3) * (-8481)) ^ (-1248576979);
                        i2 = -778634888;
                    } else {
                        iM45029 = (C19806.m45029("ۢۙ") + i3) * q.h;
                        i = ((iM45029 ^ i4) * (-6155)) ^ 1501945006;
                        i2 = 1536238757;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -407437655:
                case 1205175922:
                    if ((i9 * i9) - i8 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۢ") ^ i4) * 41;
                        i = ((iM45029 ^ i3) * (-1695)) ^ 1845879807;
                        i2 = 810762361;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۘ") ^ i4;
                        i = ((iM45029 ^ i3) * 15203) ^ (-222297143);
                        i2 = 17298576;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -244833421:
                case 1721039804:
                    i10 = 62397;
                    iM45029 = ThreadFactoryC3888.m11306("᩸ܿ") ^ i3;
                    i = ((iM45029 ^ i4) * (-17755)) ^ (-1577735794);
                    i2 = -1332842055;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 51661927:
                case 1319943162:
                    strM7082 = C2332.m7082(sArr2, i7, 16, i10);
                    if (C0671.f2816 != 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ܰ")) * (-109);
                        i = ((iM45029 ^ i3) * (-8481)) ^ (-1248576979);
                        i2 = -778634888;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ᩸") ^ i3) * (-125);
                        i = ((iM45029 ^ i4) * 2215) ^ 1100688068;
                        i2 = 1298536500;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 132688897:
                case 2116056135:
                    i9 = s + s3;
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ܰ")) * (-109);
                        i = ((iM45029 ^ i3) * (-8481)) ^ (-1248576979);
                        i2 = -778634888;
                    } else {
                        iM45029 = C19806.m45029("ۤܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-3899)) ^ (-988934782);
                        i2 = -131246015;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 466970000:
                case 491531055:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("۬ܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9659)) ^ 390613661;
                        i2 = 1819889764;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩳۛ")) * 49;
                        i = ((iM45029 ^ i3) * (-8967)) ^ (-619450908);
                        i2 = 881215942;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 885461384:
                case 1051455590:
                    this.f10688 = pluginPreferenceM29808;
                    activityC19041.f61593 = c11986.m29831();
                    break;
                case 1764873777:
                case 1941214359:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("۬ܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9659)) ^ 390613661;
                        i2 = 1819889764;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۡۙ")) * (-45);
                        i = ((iM45029 ^ i4) * 14977) ^ (-889685420);
                        i2 = 1778864534;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f10685;
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۡۙ")) * (-45);
                        i = ((iM45029 ^ i4) * 14977) ^ (-889685420);
                        i2 = 1778864534;
                    } else {
                        iM45029 = C19806.m45029("ܰܺ") ^ i3;
                        i = ((iM45029 ^ i4) * (-20665)) ^ 2135801491;
                        i2 = -1974449549;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C2812(ActivityC19041 activityC19041, C11986 c11986) {
        int i = -349078097;
        int i2 = C3535.f13026;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        this.f10686 = activityC19041;
        this.f10687 = c11986;
        int iM11306 = (ThreadFactoryC3888.m11306("᩷ܿ") ^ i2) * (-101);
        int i4 = ((iM11306 ^ i3) * (-18581)) ^ (-2000159166);
        int i5 = -612703107;
        while (true) {
            i = (iM11306 ^ i5) ^ (i4 & (((i ^ i3) * (-28727)) >> 31));
            switch (i) {
                case -1918395124:
                case -266923856:
                    if (C19806.m45024()) {
                        iM11306 = (C19806.m45029("᩸ܿ") ^ i3) * (-89);
                        i4 = ((iM11306 ^ i2) * (-10427)) ^ 1772718958;
                        i5 = 2014381839;
                    } else {
                        iM11306 = (C19806.m45029("᩸֨") + i3) * (-5);
                        i4 = ((iM11306 ^ i2) * (-29671)) ^ (-1783660694);
                        i5 = -1137798556;
                        continue;
                    }
                    break;
                case -1830565668:
                case 1627976632:
                    if (!C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 8531) ^ 1830213242;
                        i5 = -2048759264;
                    }
                    break;
                case -637367082:
                case 1407477183:
                    C3660.m10791();
                    break;
                case 86292346:
                case 2122832927:
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("ۖ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 8751) ^ (-422741061);
                        i5 = 1920119815;
                    }
                    break;
                case 561306547:
                case 764569212:
                    C2124.m6673();
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = (C19806.m45029("۠ۖ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * (-30773)) ^ (-1250002128);
                        i5 = -520887845;
                    }
                    break;
                case 1703710945:
                case 1724637721:
                    return;
                default:
                    RunnableC1895.m6170();
                    C2332.m7079();
                    throw new RuntimeException();
            }
            iM11306 = C19806.m45029("ܳۙ") ^ i2;
            i4 = ((iM11306 ^ i3) * 27377) ^ (-720962092);
            i5 = -1761026263;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1875.m6110(this, this.f10686);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C11986 c11986 = null;
        PluginPreference pluginPreference = null;
        int i = -910582989;
        int i2 = C2788.f10625;
        int i3 = C1025.f4800;
        int iM11306 = (ThreadFactoryC3888.m11306("֫֫") + i2) * 87;
        int i4 = ((iM11306 ^ i3) * 2743) ^ (-1162751141);
        int i5 = -478852074;
        while (true) {
            i = ((((i ^ i3) * (-30055)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1893494547:
                case 129687985:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡᩸") + i2) * (-125);
                        i4 = ((iM11306 ^ i3) * 29191) ^ (-1179856747);
                        i5 = -1411476779;
                    } else {
                        iM11306 = (i2 - C19806.m45029("֨᩺")) * (-89);
                        i4 = ((iM11306 ^ i3) * (-6039)) ^ (-731759734);
                        i5 = 2127067076;
                    }
                    break;
                case -1837232256:
                case 168645334:
                    C3743.m10966();
                    if (C1148.f5161 > 0) {
                        iM11306 = C19806.m45029("᩹֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11771)) ^ 1788779253;
                        i5 = 720130232;
                    } else {
                        iM11306 = C19806.m45029("ۗۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27745)) ^ 1438846675;
                        i5 = 1837259590;
                    }
                    break;
                case -1779144769:
                case 573285938:
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = C19806.m45029("ۗۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27745)) ^ 1438846675;
                        i5 = 1837259590;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31637)) ^ 892391551;
                        i5 = 1831384284;
                    }
                    break;
                case -1544376410:
                case 2146576378:
                    if (C3577.m10565()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܿ") ^ i3) * (-9);
                        i4 = ((iM11306 ^ i2) * 14919) ^ 742448742;
                        i5 = 49904555;
                    } else {
                        iM11306 = C19806.m45029("ۗۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27745)) ^ 1438846675;
                        i5 = 1837259590;
                    }
                    break;
                case -1501449340:
                case 810586305:
                    this.f10686.m43775(c11986, pluginPreference);
                    break;
                case -1422119484:
                case -543182099:
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("ۗۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27745)) ^ 1438846675;
                        i5 = 1837259590;
                    } else {
                        iM11306 = C19806.m45029("ۙ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29747) ^ 1152608083;
                        i5 = 114292353;
                    }
                    break;
                case -1370450186:
                case -8140125:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-10469)) ^ (-1416793582);
                        i5 = -625191412;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29901) ^ 1848498003;
                        i5 = -1441001346;
                    }
                    break;
                case -1258651389:
                case 963720888:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("ܳ᩹") + i3) * (-69);
                        i4 = ((iM11306 ^ i2) * 24101) ^ 2115590404;
                        i5 = -649968494;
                    } else {
                        iM11306 = C19806.m45029("᩹֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11771)) ^ 1788779253;
                        i5 = 720130232;
                    }
                    break;
                case -1211145396:
                case 684437164:
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31637)) ^ 892391551;
                        i5 = 1831384284;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺ۧ")) * (-109);
                        i4 = ((iM11306 ^ i3) * 6547) ^ 579299664;
                        i5 = -316896710;
                    }
                    break;
                case -1195044553:
                case 196983620:
                    RunnableC1895.m6170();
                    RunnableC0195.m1431();
                    break;
                case -1120701078:
                case 1735171839:
                    CallableC1627.m5507();
                    C19806.m45024();
                    iM11306 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-31637)) ^ 892391551;
                    i5 = 1831384284;
                    break;
                case -752761416:
                case -282923799:
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-10469)) ^ (-1416793582);
                        i5 = -625191412;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘۖ")) * (-105);
                        i4 = ((iM11306 ^ i2) * 30325) ^ 1799240357;
                        i5 = -795670005;
                    }
                    break;
                case -94462408:
                case 478496099:
                    if (C0216.f1393 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡᩸") + i2) * (-125);
                        i4 = ((iM11306 ^ i3) * 29191) ^ (-1179856747);
                        i5 = -1411476779;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31637)) ^ 892391551;
                        i5 = 1831384284;
                    }
                    break;
                case 570420116:
                case 1461337676:
                    c11986 = this.f10687;
                    if (C3660.m10791() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡᩸") + i2) * (-125);
                        i4 = ((iM11306 ^ i3) * 29191) ^ (-1179856747);
                        i5 = -1411476779;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ܽ") + i2) * 45;
                        i4 = ((iM11306 ^ i3) * 28613) ^ (-1095029944);
                        i5 = -1562251488;
                    }
                    break;
                case 658727588:
                case 1720188645:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31637)) ^ 892391551;
                        i5 = 1831384284;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩺ۗ")) * (-71);
                        i4 = ((iM11306 ^ i2) * 2671) ^ (-41106279);
                        i5 = -1311099436;
                    }
                    break;
                default:
                    pluginPreference = this.f10688;
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-10469)) ^ (-1416793582);
                        i5 = -625191412;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩳۡ")) * 81;
                        i4 = ((iM11306 ^ i2) * (-13055)) ^ 539650242;
                        i5 = -1580635691;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C1025.m3860(this);
    }
}
