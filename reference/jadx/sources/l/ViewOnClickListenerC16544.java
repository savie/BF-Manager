package l;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 44LP */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16544 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static WeakReference f53549;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53550 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f53552;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f53553;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f53554;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f53555;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f53556;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f53557;

    /* JADX INFO: renamed from: ܰܳۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f53551 = {5453, -7862, -7864, -7841, -7870, -7843, -7870, -7841, -7854, 7741, 26117, 26119, 26128, 26125, 26130, 26125, 26128, 26141, 86, 16282, 1051, 1342, -3279, -777, 26114, 26125, 26122, 26112, 26162, 26125, 26113, 26131, 26150, 26141, 26157, 26112, 26188, 26186, 26186, 26186, 26189, 12322, 15074, -4321, -4292, 2163, -4251, 15002, 30, 5035, -6726, 6244, 5705, -7815, -8130, 1122, 13115, 16354, 4248, -2673, 5369, 15948, 562, 26330, 26328, 26319, 26322, 26317, 26322, 26319, 26306, 26318, 26312, 26334, 26313, 26340, 26325, 26330, 26326, 26334, 3993, -7506, -7517, -7489, -7513, -7506, 3361, -9942, -9923, -9941, -9939, -9932, -9940, -16891, 18484, 19347, 18320, 22684, -20312, -21133, -30388, 18267, 19423, 17264, -24181, -9980, -9924, -9869, -28804, -22035, 21865, -22835, -28787, 23531, 22014, -16753, 20093, 22296, -30996, -23465, -21070, -22447, 19330, 19362, -16430, -30343, 6199, -27723, -27738, -27723, -27714, -27740, 2323, 19526, 19531, 19543, 19535, 19526, 3531, 13364, 22362, -21739, 17660, 18176, 18600, -17904, 23127, -21967, 19077, 19334, 19029, 27402, 13314, -19449, 17286, 22644, 23686, -17658, -16661, -17039, -20884, -17561, 18794, 25835, 26056, -20062, 28229, 17268};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C24720 f53548 = C24720.m55197();

    /* JADX WARN: Code duplicated, block: B:61:0x0261 A[PHI: r16 r18
      0x0261: PHI (r16v4 java.lang.ref.WeakReference) = 
      (r16v3 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
     binds: [B:59:0x0249, B:49:0x01d3, B:40:0x0185, B:37:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r18v5 l.۠ۖۧ) = (r18v2 l.۠ۖۧ), (r18v4 l.۠ۖۧ), (r18v2 l.۠ۖۧ), (r18v2 l.۠ۖۧ) binds: [B:59:0x0249, B:49:0x01d3, B:40:0x0185, B:37:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0291 A[PHI: r3 r15
      0x0291: PHI (r3v83 l.۠ۖۧ) = (r3v7 l.۠ۖۧ), (r3v82 l.۠ۖۧ), (r3v7 l.۠ۖۧ), (r3v7 l.۠ۖۧ) binds: [B:63:0x027b, B:56:0x022e, B:46:0x01b4, B:38:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r15v4 java.lang.ref.WeakReference) = 
      (r15v3 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
     binds: [B:63:0x027b, B:56:0x022e, B:46:0x01b4, B:38:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0142, code lost:
    
        if (l.C1146.f4234 < 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnClickListenerC16544(l.AbstractActivityC17204 r40, java.lang.String r41, java.lang.String r42, android.content.DialogInterface.OnCancelListener r43) {
        /*
            Method dump skipped, instruction units count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC16544.<init>(l.ܽ֡֫, java.lang.String, java.lang.String, android.content.DialogInterface$OnCancelListener):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC16544(AbstractActivityC17204 abstractActivityC17204) {
        this(abstractActivityC17204, null);
        int i = 1451849360;
        int i2 = C0950.f3488;
        int i3 = C0773.f2792;
        short s = f53551[0];
        C17202.m40379(abstractActivityC17204, C2878.m9486(f53551, 1, 8, ((s * s) + 1172889) - (s * 2166) >= 0 ? 57643 : 35729));
        int iM3169 = C0773.m3169("֡۟") ^ i3;
        int i4 = ((iM3169 ^ i2) * 2587) ^ 335755245;
        int i5 = -841093378;
        while (true) {
            i = ((((i ^ i2) * (-7897)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1790897124:
                case 1981901861:
                    return;
                case -1543148902:
                case -747962013:
                    C1542.m5459();
                    if (C2354.f7599 < 0) {
                        iM3169 = C0619.m2761("ۡۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-9177)) ^ (-1679393419);
                        i5 = -837581507;
                    }
                    break;
                case -1086119159:
                case -453563651:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("᩸ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24547)) ^ 1796659772;
                        i5 = -1852940518;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۡ") + i3) * 91;
                        i4 = ((iM3169 ^ i2) * (-13359)) ^ (-550808283);
                        i5 = -916818859;
                        continue;
                    }
                    break;
                case -684562039:
                case 1106380319:
                    C0269.m1775();
                    C17202.m40372();
                    throw new RuntimeException();
                case 597396640:
                case 1290273616:
                    C2834.m9344();
                    break;
                case 1101054337:
                case 1496895236:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۜ᩹")) * (-73);
                        i4 = ((iM3169 ^ i2) * 8903) ^ (-1893000);
                        i5 = 503039044;
                    }
                    break;
                default:
                    if (C3492.m11488()) {
                        iM3169 = (i2 - C0773.m3169("᩷ۢ")) * 97;
                        i4 = ((iM3169 ^ i3) * (-24187)) ^ (-901826447);
                        i5 = -1792971230;
                    }
                    break;
            }
            iM3169 = (C0773.m3169("ܳܶ") ^ i2) * 81;
            i4 = ((iM3169 ^ i3) * 16313) ^ (-1103972432);
            i5 = -1790144800;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewOnClickListenerC16544(AbstractActivityC17204 abstractActivityC17204, DialogInterfaceOnCancelListenerC10795 dialogInterfaceOnCancelListenerC10795) {
        int i = -977725324;
        int i2 = C2310.f7472;
        int i3 = C2375.f7641;
        short s = f53551[62];
        int i4 = s + 13124;
        int i5 = (s * s) + 172239376;
        int i6 = (i5 + i5) - (i4 * i4) >= 0 ? 26299 : 10367;
        C17202.m40379(abstractActivityC17204, C0619.m2756(f53551, 63, 8, i6));
        this(abstractActivityC17204, C2702.m8877(ApplicationC17729.f58258, AbstractC3624.m11769(f53551, 71, 9, i6), null), "", dialogInterfaceOnCancelListenerC10795);
        int iM3169 = C0773.m3169("ۗۧ") ^ i2;
        int i7 = ((iM3169 ^ i3) * 29225) ^ 274524563;
        int i8 = -1287122931;
        while (true) {
            i = (iM3169 ^ i8) ^ (i7 & (((i ^ i3) * 9997) >> 31));
            switch (i) {
                case -1925163119:
                case -1740000823:
                    C2310.m7813();
                    RunnableC1848.m6360();
                    break;
                case -1548937019:
                case 685231854:
                    if (C2354.f7599 < 0) {
                        iM3169 = (C0773.m3169("ۙ֫") ^ i2) * (-95);
                        i7 = ((iM3169 ^ i3) * 7019) ^ 1213320062;
                        i8 = 241403162;
                    }
                    break;
                case -1504822279:
                case 1716301665:
                    C4282.m13644();
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۧۙ") ^ i3;
                        i7 = ((iM3169 ^ i2) * 16843) ^ (-1512012595);
                        i8 = -680308626;
                    }
                    break;
                case -488959905:
                case 1339298396:
                    AbstractC0641.m2813();
                    throw new RuntimeException();
                case -214314743:
                case 180514029:
                    C2966.m9664();
                    if (C3690.m11987()) {
                        iM3169 = (i2 - C0619.m2761("۫ۘ")) * 11;
                        i7 = ((iM3169 ^ i3) * 1469) ^ 1538553169;
                        i8 = 1380996581;
                    }
                    break;
                case 1003218535:
                case 1702543780:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0619.m2761("᩷᩶") ^ i3) * (-93);
                        i7 = ((iM3169 ^ i2) * (-2681)) ^ 1938236681;
                        i8 = 2019442875;
                    } else {
                        iM3169 = (C0619.m2761("֡ܶ") ^ i2) * 99;
                        i7 = ((iM3169 ^ i3) * 11153) ^ 1234212582;
                        i8 = 1024706692;
                        continue;
                    }
                    break;
                default:
                    return;
            }
            iM3169 = (C0773.m3169("۬ܳ") ^ i3) * (-21);
            i7 = ((iM3169 ^ i2) * (-899)) ^ 1548379876;
            i8 = 639099190;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39187() {
        this.f53552 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x00b3 A[PHI: r8 r10
      0x00b3: PHI (r8v3 long) = (r8v2 long), (r8v1 long), (r8v1 long), (r8v1 long), (r8v1 long) binds: [B:22:0x00b1, B:16:0x0091, B:13:0x0078, B:10:0x006e, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r10v4 android.animation.ObjectAnimator) = 
      (r10v3 android.animation.ObjectAnimator)
      (r10v2 android.animation.ObjectAnimator)
      (r10v2 android.animation.ObjectAnimator)
      (r10v2 android.animation.ObjectAnimator)
      (r10v2 android.animation.ObjectAnimator)
     binds: [B:22:0x00b1, B:16:0x0091, B:13:0x0078, B:10:0x006e, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0198 A[PHI: r2
      0x0198: PHI (r2v5 l.۠ۖۧ) = (r2v4 l.۠ۖۧ), (r2v2 l.۠ۖۧ) binds: [B:46:0x0196, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x023a A[PHI: r3 r7 r13 r16 r19 r24
      0x023a: PHI (r3v4 boolean) = (r3v2 boolean), (r3v2 boolean), (r3v3 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:60:0x0238, B:56:0x0218, B:42:0x0174, B:26:0x00ec, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r7v4 android.animation.ObjectAnimator) = 
      (r7v2 android.animation.ObjectAnimator)
      (r7v2 android.animation.ObjectAnimator)
      (r7v2 android.animation.ObjectAnimator)
      (r7v3 android.animation.ObjectAnimator)
      (r7v2 android.animation.ObjectAnimator)
     binds: [B:60:0x0238, B:56:0x0218, B:42:0x0174, B:26:0x00ec, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:60:0x0238, B:56:0x0218, B:42:0x0174, B:26:0x00ec, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r16v4 short) = (r16v2 short), (r16v3 short), (r16v2 short), (r16v2 short), (r16v2 short) binds: [B:60:0x0238, B:56:0x0218, B:42:0x0174, B:26:0x00ec, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:60:0x0238, B:56:0x0218, B:42:0x0174, B:26:0x00ec, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r24v5 int) = (r24v3 int), (r24v4 int), (r24v3 int), (r24v3 int), (r24v3 int) binds: [B:60:0x0238, B:56:0x0218, B:42:0x0174, B:26:0x00ec, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x026e A[PHI: r4 r5 r6 r12 r14 r17 r18
      0x026e: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:64:0x026c, B:38:0x0153, B:34:0x0131, B:30:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r5v4 float[]) = (r5v2 float[]), (r5v2 float[]), (r5v3 float[]), (r5v2 float[]) binds: [B:64:0x026c, B:38:0x0153, B:34:0x0131, B:30:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r6v4 android.view.View) = (r6v2 android.view.View), (r6v2 android.view.View), (r6v3 android.view.View), (r6v2 android.view.View) binds: [B:64:0x026c, B:38:0x0153, B:34:0x0131, B:30:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:64:0x026c, B:38:0x0153, B:34:0x0131, B:30:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:64:0x026c, B:38:0x0153, B:34:0x0131, B:30:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:64:0x026c, B:38:0x0153, B:34:0x0131, B:30:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char), (r18v2 char) binds: [B:64:0x026c, B:38:0x0153, B:34:0x0131, B:30:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39184() {
        int iM3169;
        int i;
        int i2;
        int i3 = C1564.f5401;
        int i4 = C1146.f4234;
        int iM2761 = C0619.m2761("᩻ܰ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 235) ^ (-1463689960);
        short[] sArr = null;
        int i6 = iM2761 ^ (-1216500805);
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        boolean z = false;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        char c = 0;
        short s3 = 0;
        int i9 = -1683555624;
        int i10 = 0;
        short[] sArr2 = null;
        ObjectAnimator duration = null;
        long j = 0;
        ObjectAnimator objectAnimatorM12917 = null;
        View view = null;
        float[] fArr = null;
        int i11 = 0;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i4) * 17457) >> 31));
            switch (i9) {
                case -2104541236:
                case 1202263890:
                    z = true;
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("᩷᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-8285)) ^ 215956702;
                        i2 = 191314658;
                    } else {
                        iM3169 = C0773.m3169("ܳۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-16897)) ^ (-847536074);
                        i2 = -258785572;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2076179805:
                case -1344888451:
                    C3734.m12152();
                    if (C1321.m4852()) {
                        iM3169 = (C0619.m2761("᩺᩵") ^ i3) * 49;
                        i = ((iM3169 ^ i4) * 31121) ^ (-681782077);
                        i2 = 1024582737;
                    } else {
                        iM3169 = C0773.m3169("ۜܶ") ^ i4;
                        i = ((iM3169 ^ i3) * 3687) ^ (-117561093);
                        i2 = 19853450;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1835766759:
                case 2101268468:
                    if ((s * s2) - i10 > 0) {
                        iM3169 = C0619.m2761("֫ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * 17641) ^ (-1496229126);
                        i2 = 791376008;
                    } else {
                        iM3169 = C0619.m2761("ۘ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 26323) ^ 1147664903;
                        i2 = -798899061;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1816547613:
                case -1450608364:
                    C0619.m2763();
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("᩺᩵") ^ i3) * 49;
                        i = ((iM3169 ^ i4) * 31121) ^ (-681782077);
                        i2 = 1024582737;
                    } else {
                        iM3169 = C0773.m3169("ܳۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-16897)) ^ (-847536074);
                        i2 = -258785572;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1621976987:
                case -727663599:
                    i7 = 28559;
                    iM3169 = C0619.m2761("᩻۠") ^ i3;
                    i = ((iM3169 ^ i4) * (-25001)) ^ 1575034429;
                    i2 = -632039893;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1597567907:
                case -148535028:
                    dialogInterfaceC8327 = this.f53557;
                    dialogInterfaceC8327.m22427((DialogInterface.OnKeyListener) null);
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("᩹ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-25735)) ^ 512738726;
                        i2 = -19605351;
                    } else {
                        iM3169 = C0619.m2761("֨ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 19837) ^ 1780911435;
                        i2 = 1027489897;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1554950666:
                case 1244425822:
                    fArr = new float[i11];
                    // fill-array-data instruction
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    view = this.f53555;
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0773.m3169("۠ۡ") + i3) * 37;
                        i = ((iM3169 ^ i4) * 25607) ^ (-1918034723);
                        i2 = 295309840;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩷") + i4) * (-43);
                        i = ((iM3169 ^ i3) * (-19577)) ^ (-87911832);
                        i2 = 45983193;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1319668398:
                case -423551836:
                    C1542.m5459();
                    iM3169 = (C0619.m2761("᩺᩵") ^ i3) * 49;
                    i = ((iM3169 ^ i4) * 31121) ^ (-681782077);
                    i2 = 1024582737;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1267500839:
                case 1715648678:
                    j = 200;
                    duration = objectAnimatorM12917.setDuration(200L);
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("᩺᩵") ^ i3) * 49;
                        i = ((iM3169 ^ i4) * 31121) ^ (-681782077);
                        i2 = 1024582737;
                    } else {
                        iM3169 = C0773.m3169("ۜ֨") ^ i4;
                        i = ((iM3169 ^ i3) * (-7981)) ^ (-2137208035);
                        i2 = 1876538857;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1155716608:
                case 1051140941:
                    dialogInterfaceC8327.m22431(z);
                    i11 = 2;
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("۠ۡ") + i3) * 37;
                        i = ((iM3169 ^ i4) * 25607) ^ (-1918034723);
                        i2 = 295309840;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܰ֫")) * (-29);
                        i = ((iM3169 ^ i4) * (-18629)) ^ (-1363813242);
                        i2 = -1078721186;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1067073965:
                case 132178972:
                    s = sArr2[c];
                    s3 = 7507;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("ܳۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-16897)) ^ (-847536074);
                        i2 = -258785572;
                    } else {
                        iM3169 = (i4 - C0773.m3169("֫ܳ")) * 95;
                        i = ((iM3169 ^ i3) * 11905) ^ (-1531059860);
                        i2 = 863024885;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -840337891:
                case 758086793:
                    sArr2 = f53551;
                    c = 132;
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("۠ۡ") + i3) * 37;
                        i = ((iM3169 ^ i4) * 25607) ^ (-1918034723);
                        i2 = 295309840;
                    } else {
                        iM3169 = C0773.m3169("ᩴۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 23223) ^ 1462533073;
                        i2 = 2104770380;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -543149657:
                case 713200957:
                    RunnableC0334.m2052(duration);
                    C2419.m8178(new RunnableC15052(0, this), j);
                    break;
                case 162606938:
                case 1504927462:
                    sArr = f53551;
                    i8 = 133;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("۠ۡ") + i3) * 37;
                        i = ((iM3169 ^ i4) * 25607) ^ (-1918034723);
                        i2 = 295309840;
                    } else {
                        iM3169 = C0619.m2761("ۢۡ") ^ i4;
                        i = ((iM3169 ^ i3) * 8363) ^ 883803493;
                        i2 = -1984389883;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 219834026:
                case 1337373779:
                    int i12 = s + s3;
                    i10 = i12 * i12;
                    s2 = 30028;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ܳۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-16897)) ^ (-847536074);
                        i2 = -258785572;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ᩸") ^ i3) * (-37);
                        i = ((iM3169 ^ i4) * 14005) ^ (-1060986762);
                        i2 = 901538553;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 968957752:
                case 1422058887:
                    objectAnimatorM12917 = C3998.m12917(view, C4282.m13650(sArr, i8, 5, i7), fArr);
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("ܳۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-16897)) ^ (-847536074);
                        i2 = -258785572;
                    } else {
                        iM3169 = C0773.m3169("֫ܶ") ^ i3;
                        i = ((iM3169 ^ i4) * (-32159)) ^ 1772552037;
                        i2 = 483782654;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1089111768:
                case 1281449639:
                    C1146.m4231();
                    if (C1343.f4799 == 0) {
                        iM3169 = (C0619.m2761("᩺᩵") ^ i3) * 49;
                        i = ((iM3169 ^ i4) * 31121) ^ (-681782077);
                        i2 = 1024582737;
                    } else {
                        iM3169 = C0619.m2761("᩹ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-25735)) ^ 512738726;
                        i2 = -19605351;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1264880729:
                case 1850543408:
                    C1542.m5459();
                    C1783.m6232();
                    break;
                default:
                    i7 = 19495;
                    iM3169 = C0619.m2761("᩻۠") ^ i3;
                    i = ((iM3169 ^ i4) * (-25001)) ^ 1575034429;
                    i2 = -632039893;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39185(ViewOnClickListenerC16544 viewOnClickListenerC16544) {
        int i = 1155713909;
        int i2 = C2287.f7432;
        int i3 = C0950.f3488;
        int iM2761 = (i3 - C0619.m2761("ۛۙ")) * (-103);
        int i4 = ((iM2761 ^ i2) * 28595) ^ 861841703;
        int i5 = -994466688;
        while (true) {
            i = ((((i ^ i2) * (-10455)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1862200806:
                case 833122948:
                    C3779.m12264();
                    break;
                case -1780172259:
                case 928777763:
                    C2287.m7745();
                    if (!C1783.m6232()) {
                        iM2761 = C0619.m2761("᩺ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18005)) ^ 1598503240;
                        i5 = 286635956;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܿ᩹")) * (-113);
                        i4 = ((iM2761 ^ i2) * 24335) ^ (-1052891564);
                        i5 = 2079807759;
                    }
                    break;
                case -1661378273:
                case 1347311948:
                    if (!C1146.m4231()) {
                        iM2761 = C0619.m2761("ۢۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29875)) ^ (-1830312311);
                        i5 = -1602794439;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩸᩸")) * (-11);
                        i4 = ((iM2761 ^ i3) * (-20615)) ^ (-722692184);
                        i5 = -1865536323;
                    }
                    break;
                case -378047586:
                case 532074156:
                    if (C0487.f2131 > 0 && C2834.f9334 > 0) {
                        if (C17202.f56030) {
                            if (C2375.f7641 > 0 && C17202.f56030) {
                                if (C20932.f66974 > 0) {
                                    if (C3998.f13671 != 0) {
                                        iM2761 = C0619.m2761("᩺ۡ") ^ i2;
                                        i4 = ((iM2761 ^ i3) * (-18005)) ^ 1598503240;
                                        i5 = 286635956;
                                    } else if (C3033.m9845() <= 0) {
                                        iM2761 = (i3 - C0773.m3169("ܿ᩹")) * (-113);
                                        i4 = ((iM2761 ^ i2) * 24335) ^ (-1052891564);
                                        i5 = 2079807759;
                                    } else if (!C0619.m2763()) {
                                        AbstractActivityC17204 abstractActivityC17204 = viewOnClickListenerC16544.f53554;
                                        if (C4238.m13540() > 0) {
                                            C3033.m9858(abstractActivityC17204, new Intent(abstractActivityC17204, (Class<?>) ViewOnClickListenerC1057.class));
                                        }
                                        break;
                                    }
                                }
                            }
                            iM2761 = (i2 - C0619.m2761("᩸᩸")) * (-11);
                            i4 = ((iM2761 ^ i3) * (-20615)) ^ (-722692184);
                            i5 = -1865536323;
                        }
                        iM2761 = (C0619.m2761("᩸ۚ") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-15759)) ^ (-1743077044);
                        i5 = 303422410;
                    } else {
                        iM2761 = C0619.m2761("ۢۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29875)) ^ (-1830312311);
                        i5 = -1602794439;
                    }
                    break;
                case 1036440577:
                case 1102201916:
                    C13473.m33144();
                    iM2761 = C0619.m2761("᩺ۡ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-18005)) ^ 1598503240;
                    i5 = 286635956;
                    break;
                default:
                    C1783.m6232();
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("ۢۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29875)) ^ (-1830312311);
                        i5 = -1602794439;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܿ᩹")) * (-113);
                        i4 = ((iM2761 ^ i2) * 24335) ^ (-1052891564);
                        i5 = 2079807759;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (l.C4282.f15546 > 0) goto L26;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m39180(l.ViewOnClickListenerC16544 r34, java.lang.String r35, l.C13778 r36) {
        /*
            Method dump skipped, instruction units count: 2132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC16544.m39180(l.ܺۖ᩻, java.lang.String, l.۬ۢ᩻):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39181(C5358 c5358, ViewOnClickListenerC16544 viewOnClickListenerC16544, int i, KeyEvent keyEvent) {
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1120922427;
        int i7 = C2310.f7472;
        int i8 = C11235.f35427;
        int iM3169 = C0773.m3169("ۘۜ") ^ i7;
        int i9 = ((iM3169 ^ i8) * 13309) ^ (-22940201);
        int i10 = 549574291;
        while (true) {
            i6 = ((((i6 ^ i8) * (-29279)) >> 31) & i9) ^ (iM3169 ^ i10);
            switch (i6) {
                case -2108763314:
                case -1592545883:
                    C1783.m6232();
                    C4282.m13644();
                    iM3169 = (C0773.m3169("ᩴܳ") ^ i8) * 33;
                    i9 = ((iM3169 ^ i7) * (-11103)) ^ (-1871632524);
                    i10 = -598069681;
                    break;
                case -2053950326:
                case -1821072270:
                    c5358.m16006();
                    viewOnClickListenerC16544.m39184();
                    return true;
                case -1959855023:
                case -648090961:
                    sArr = f53551;
                    i4 = 127;
                    i5 = 5;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ۢ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 16173) ^ (-1656756936);
                        i10 = -1302534542;
                    } else {
                        iM3169 = C0773.m3169("ۚ۫") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-3887)) ^ (-1362524949);
                        i10 = 1903143119;
                    }
                    break;
                case -1745233412:
                case -151845170:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("֡᩶") + i8) * 91;
                        i9 = ((iM3169 ^ i7) * (-7767)) ^ (-1267446056);
                        i10 = -2066399572;
                    } else {
                        iM3169 = (i8 - C0619.m2761("ۧۤ")) * 29;
                        i9 = ((iM3169 ^ i7) * 15407) ^ (-1659252515);
                        i10 = 109061531;
                    }
                    break;
                case -1572050116:
                case 1179969749:
                    if ((35436 * s) - i2 > 0) {
                        iM3169 = (C0619.m2761("᩵ܿ") ^ i7) * (-119);
                        i9 = ((iM3169 ^ i8) * 11143) ^ 1302836499;
                        i10 = 481140003;
                    } else {
                        iM3169 = (i8 - C0773.m3169("᩹ۖ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((iM3169 ^ i7) * 25041) ^ 543091627;
                        i10 = 1167494275;
                    }
                    break;
                case -1526272288:
                case -1054343165:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("֫ᩳ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 3971) ^ 1309679606;
                        i10 = 1603521656;
                    } else {
                        iM3169 = C0773.m3169("۫ۗ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 14523) ^ (-1760521770);
                        i10 = -1961649559;
                    }
                    break;
                case -1412634491:
                case 320362122:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۙ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 29177) ^ 3117368;
                        i10 = 1417413425;
                    } else {
                        iM3169 = C0773.m3169("ܺܶ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 22851) ^ 252606528;
                        i10 = 1261901394;
                    }
                    break;
                case -1300589729:
                case 921349565:
                    C2834.m9344();
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("֫ᩳ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 3971) ^ 1309679606;
                        i10 = 1603521656;
                    } else {
                        iM3169 = C0619.m2761("ۙ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 29177) ^ 3117368;
                        i10 = 1417413425;
                    }
                    break;
                case -1239758120:
                case -802047956:
                    if (i == 4) {
                        iM3169 = C0619.m2761("ۘۖ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 28097) ^ (-990183221);
                        i10 = 1403118893;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۨ᩷")) * (-65);
                        i9 = ((iM3169 ^ i8) * 6767) ^ (-651508737);
                        i10 = -347795850;
                    }
                    break;
                case -903309237:
                case 165047711:
                    s = f53551[126];
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("֡᩶") + i8) * 91;
                        i9 = ((iM3169 ^ i7) * (-7767)) ^ (-1267446056);
                        i10 = -2066399572;
                    } else {
                        iM3169 = (C0619.m2761("ۡܿ") + i8) * 81;
                        i9 = ((iM3169 ^ i7) * 535) ^ (-1926034223);
                        i10 = 90874074;
                    }
                    break;
                case -856107233:
                case 881955805:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۢ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 16173) ^ (-1656756936);
                        i10 = -1302534542;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩸") ^ i7;
                        i9 = ((iM3169 ^ i8) * 27013) ^ (-1097606692);
                        i10 = -538498909;
                    }
                    break;
                case -848218876:
                case -159565539:
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۢ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 16173) ^ (-1656756936);
                        i10 = -1302534542;
                    } else {
                        iM3169 = (C0773.m3169("ᩴܳ") ^ i8) * 33;
                        i9 = ((iM3169 ^ i7) * (-11103)) ^ (-1871632524);
                        i10 = -598069681;
                    }
                    break;
                case -640302534:
                case 1989789865:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("ۙ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 29177) ^ 3117368;
                        i10 = 1417413425;
                    } else {
                        iM3169 = C0773.m3169("֡ܶ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 24471) ^ 66296650;
                        i10 = 449473011;
                    }
                    break;
                case -477282102:
                case 1830230589:
                    C17202.m40379(keyEvent, C1783.m6233(sArr, i4, i5, i3));
                    if (keyEvent.getAction() == 0) {
                        iM3169 = C0619.m2761("ۢۜ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 31245) ^ 1836498495;
                        i10 = 620242358;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۨ᩷")) * (-65);
                        i9 = ((iM3169 ^ i8) * 6767) ^ (-651508737);
                        i10 = -347795850;
                    }
                    break;
                case -476856495:
                case 1517406656:
                    i3 = 37840;
                    iM3169 = (C0619.m2761("ۚܺ") ^ i8) * (-81);
                    i9 = ((iM3169 ^ i7) * 16487) ^ (-1868975091);
                    i10 = 219854493;
                    break;
                case 288046370:
                case 861420420:
                    C2354.m7983();
                    return false;
                case 326156834:
                case 1938752872:
                    i3 = 6797;
                    iM3169 = (C0619.m2761("ۚܺ") ^ i8) * (-81);
                    i9 = ((iM3169 ^ i7) * 16487) ^ (-1868975091);
                    i10 = 219854493;
                    break;
                case 1014738731:
                case 1530799689:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۙ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 29177) ^ 3117368;
                        i10 = 1417413425;
                    } else {
                        iM3169 = (C0619.m2761("֡ᩴ") ^ i8) * (-57);
                        i9 = ((iM3169 ^ i7) * 25849) ^ (-1585611193);
                        i10 = 1483579739;
                    }
                    break;
                case 1015837649:
                case 1562463356:
                    if (C3779.m12264()) {
                        iM3169 = (C0773.m3169("ܶۗ") + i7) * 37;
                        i9 = ((iM3169 ^ i8) * 31659) ^ 1741510384;
                        i10 = -1369257557;
                    } else {
                        iM3169 = C0619.m2761("ۢ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 16173) ^ (-1656756936);
                        i10 = -1302534542;
                    }
                    break;
                case 1402639012:
                case 2092081576:
                    int i11 = s + 8859;
                    i2 = i11 * i11;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("֡᩶") + i8) * 91;
                        i9 = ((iM3169 ^ i7) * (-7767)) ^ (-1267446056);
                        i10 = -2066399572;
                    } else {
                        iM3169 = C0619.m2761("֨ۜ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-7383)) ^ (-2125278776);
                        i10 = -1872341576;
                    }
                    break;
                case 1684943126:
                case 2039363678:
                    C13473.m33144();
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۙ۟") ^ i7;
                        i9 = ((iM3169 ^ i8) * 29177) ^ 3117368;
                        i10 = 1417413425;
                    } else {
                        iM3169 = (C0773.m3169("ᩴܳ") ^ i8) * 33;
                        i9 = ((iM3169 ^ i7) * (-11103)) ^ (-1871632524);
                        i10 = -598069681;
                    }
                    break;
                default:
                    return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x019c A[PHI: r2 r3 r4 r5 r6 r20
      0x019c: PHI (r2v3 l.۠ۖۧ) = (r2v2 l.۠ۖۧ), (r2v2 l.۠ۖۧ), (r2v2 l.۠ۖۧ), (r2v6 l.۠ۖۧ) binds: [B:46:0x0182, B:42:0x0161, B:38:0x013c, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v7 int) binds: [B:46:0x0182, B:42:0x0161, B:38:0x013c, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r4v4 android.view.View) = (r4v3 android.view.View), (r4v2 android.view.View), (r4v2 android.view.View), (r4v2 android.view.View) binds: [B:46:0x0182, B:42:0x0161, B:38:0x013c, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:46:0x0182, B:42:0x0161, B:38:0x013c, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r6v4 float[]) = (r6v2 float[]), (r6v2 float[]), (r6v3 float[]), (r6v2 float[]) binds: [B:46:0x0182, B:42:0x0161, B:38:0x013c, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r20v27 short) = (r20v11 short), (r20v12 short), (r20v13 short), (r20v31 short) binds: [B:46:0x0182, B:42:0x0161, B:38:0x013c, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0262 A[PHI: r8 r10 r11 r15
      0x0262: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:63:0x0260, B:35:0x011d, B:13:0x0084, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r10v35 short) = (r10v7 short), (r10v24 short), (r10v2 short), (r10v2 short) binds: [B:63:0x0260, B:35:0x011d, B:13:0x0084, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:63:0x0260, B:35:0x011d, B:13:0x0084, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:63:0x0260, B:35:0x011d, B:13:0x0084, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02b5 A[PHI: r7 r16 r20 r21
      0x02b5: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:72:0x02b3, B:68:0x0296, B:30:0x00f5, B:17:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:72:0x02b3, B:68:0x0296, B:30:0x00f5, B:17:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r20v17 short) = (r20v2 short), (r20v3 short), (r20v15 short), (r20v18 short) binds: [B:72:0x02b3, B:68:0x0296, B:30:0x00f5, B:17:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:72:0x02b3, B:68:0x0296, B:30:0x00f5, B:17:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (l.C20932.m47848() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        if (l.C2023.f6737 == false) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final l.C5358 m39178(boolean r23) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC16544.m39178(boolean):l.ۚۖ᩻");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39179(ViewOnClickListenerC16544 viewOnClickListenerC16544) {
        C13473.m33140(viewOnClickListenerC16544.f53555, 8);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0295  */
    /* JADX WARN: Code duplicated, block: B:81:0x0334 A[PHI: r15
      0x0334: PHI (r15v4 android.text.Editable) = 
      (r15v2 android.text.Editable)
      (r15v3 android.text.Editable)
      (r15v2 android.text.Editable)
      (r15v2 android.text.Editable)
     binds: [B:202:0x0334, B:80:0x0332, B:35:0x0139, B:24:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0373 A[PHI: r14
      0x0373: PHI (r14v4 java.lang.String) = (r14v2 java.lang.String), (r14v3 java.lang.String), (r14v2 java.lang.String) binds: [B:200:0x0373, B:84:0x0371, B:13:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM3169;
        int i2;
        int i3;
        String str;
        C24750 c24750;
        int iM31610;
        int i4;
        int i5;
        int i6;
        int iM31611;
        int i7;
        short[] sArr;
        int i8;
        AbstractActivityC17204 abstractActivityC17204;
        int i9;
        int iM2761;
        int i10;
        int i11;
        String strM6952;
        C24750 c24751;
        short[] sArr2;
        int i12;
        int iM31612;
        int i13;
        ViewOnClickListenerC16544 viewOnClickListenerC16544 = this;
        int i14 = -2111830536;
        int i15 = C3033.f9831;
        int i16 = C1146.f4234;
        int iM2762 = C0619.m2761("ᩳܶ") ^ i15;
        int i17 = ((iM2762 ^ i16) * 24767) ^ (-139530084);
        int i18 = iM2762 ^ 225425531;
        C24750 c24752 = null;
        TextInputLayout[] textInputLayoutArr = null;
        final String str2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        boolean z = false;
        char c = 0;
        short s = 0;
        int i19 = 0;
        int i20 = 0;
        int iM3792 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        final AbstractActivityC17204 abstractActivityC17205 = null;
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        Editable editableM6309 = null;
        String strM8350 = null;
        int i27 = 0;
        int iM13536 = 0;
        int iM13537 = 0;
        final String strM6953 = null;
        TextInputLayout textInputLayout = null;
        TextInputLayout textInputLayout2 = null;
        boolean z2 = false;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * 27839) >> 31));
            switch (i14) {
                case -2141401641:
                case -1911212660:
                    if (C21766.m49339(strM6953)) {
                        iM3169 = (i15 - C0619.m2761("۬ۖ")) * (-117);
                        i2 = ((iM3169 ^ i16) * (-14769)) ^ 20997467;
                        i3 = 1471513670;
                    } else {
                        iM3169 = C0773.m3169("ۗۙ") ^ i15;
                        i2 = ((iM3169 ^ i16) * (-2107)) ^ 1046413753;
                        i3 = 1641804271;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -2028340869:
                case 715784036:
                    str = str2;
                    sArr5 = sArr5;
                    int i28 = i24;
                    i21 = i21;
                    i = i28;
                    c24750 = new C24750(viewOnClickListenerC16544.m39178(z), viewOnClickListenerC16544);
                    int i29 = i20;
                    if (C0950.m3792(view) == i29) {
                        iM2761 = (C0773.m3169("ܶۖ") + i15) * 13;
                        i20 = i29;
                        i10 = ((iM2761 ^ i16) * (-4495)) ^ (-1618878141);
                        i11 = -1934606387;
                    } else {
                        i20 = i29;
                        iM2761 = (C0619.m2761("۟۫") ^ i15) * 89;
                        i10 = ((iM2761 ^ i16) * (-32417)) ^ (-1965775085);
                        i11 = 1501554557;
                    }
                    i18 = iM2761 ^ i11;
                    i17 = i10;
                    c24752 = c24750;
                    str2 = str;
                    sArr5 = sArr5;
                    int i30 = i21;
                    i24 = i;
                    i21 = i30;
                    break;
                case -2014046409:
                case -1069252676:
                    C3099.m10095();
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i15;
                        i2 = ((iM3169 ^ i16) * 8589) ^ (-423989361);
                        i3 = -1060411840;
                    } else {
                        iM3169 = C0773.m3169("᩷֡") ^ i15;
                        i2 = ((iM3169 ^ i16) * 13587) ^ (-1857572340);
                        i3 = 392501295;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -1995741066:
                case -109891008:
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("ܶ᩶") ^ i16;
                        i2 = ((iM3169 ^ i15) * 22495) ^ 306854609;
                        i3 = -713039508;
                    } else {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i15;
                        i2 = ((iM3169 ^ i16) * 8589) ^ (-423989361);
                        i3 = -1060411840;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -1991826252:
                case 319137718:
                    strM6952 = str2;
                    iM13536 = C4238.m13536(view);
                    sArr6 = f53551;
                    i23 = 146;
                    i24 = 3;
                    if (C0487.f2131 > 0) {
                        iM31612 = (C0773.m3169("᩵᩶") ^ i15) * (-5);
                        i12 = ((iM31612 ^ i16) * 9601) ^ (-792837135);
                        i13 = -1765533301;
                        i18 = iM31612 ^ i13;
                        i17 = i12;
                        str2 = strM6952;
                    } else {
                        sArr2 = sArr5;
                        c24751 = c24752;
                        int iM2763 = (i16 - C0619.m2761("ۙۨ")) * 83;
                        i2 = ((iM2763 ^ i15) * (-30173)) ^ (-787928658);
                        i18 = iM2763 ^ 896383459;
                        c24752 = c24751;
                        str2 = strM6952;
                        sArr5 = sArr2;
                        i17 = i2;
                    }
                    break;
                case -1912141657:
                case 2009082092:
                    C11235.m28302(textInputLayout2, C0619.m2761(C0773.m3166(f53551, 159, 3, i27)) ^ 2097434157);
                    break;
                case -1848849818:
                case -1293224107:
                    if (C2966.m9671(strM6953) < 4) {
                        iM3169 = (C0773.m3169("֫۫") + i16) * (-109);
                        i2 = ((iM3169 ^ i15) * (-6679)) ^ 1417586078;
                        i3 = -1899569300;
                    } else {
                        iM3169 = (i15 - C0773.m3169("ܽۖ")) * (-79);
                        i2 = ((iM3169 ^ i16) * 477) ^ (-222055316);
                        i3 = 1968008365;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -1568031409:
                case 1982335116:
                    C7791.m21185(abstractActivityC17205, c24752);
                    break;
                case -1566797349:
                case -491740942:
                    str2 = str2;
                    iM13537 = iM13537;
                    sArr5 = sArr5;
                    c24752 = c24752;
                    sArr4 = sArr4;
                    i25 = i25;
                    int i31 = i24;
                    i21 = i21;
                    i = i31;
                    sArr3 = f53551;
                    c = 138;
                    if (C20932.f66974 <= 0) {
                        iM31610 = (C0773.m3169("ۘۜ") ^ i15) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM31610 ^ i16) * 21691) ^ 1430023055;
                        i5 = 550353778;
                    } else {
                        iM31610 = (C0773.m3169("ܽۗ") ^ i16) * (-39);
                        i4 = ((iM31610 ^ i15) * (-1357)) ^ (-637959819);
                        i5 = 369982053;
                    }
                    int i32 = iM31610 ^ i5;
                    i17 = i4;
                    i25 = i25;
                    str2 = str2;
                    sArr4 = sArr4;
                    iM13537 = iM13537;
                    i18 = i32;
                    c24752 = c24752;
                    viewOnClickListenerC16544 = this;
                    sArr5 = sArr5;
                    int i33 = i21;
                    i24 = i;
                    i21 = i33;
                    break;
                case -1397508745:
                case 747252975:
                    if (C17202.m40372()) {
                        iM3169 = (i16 - C0619.m2761("ۙ᩵")) * 55;
                        i2 = ((iM3169 ^ i15) * (-17583)) ^ 653064272;
                        i3 = 401181769;
                    } else {
                        iM3169 = C0773.m3169("۟᩸") ^ i16;
                        i2 = ((iM3169 ^ i15) * 31155) ^ (-363641486);
                        i3 = -2112905815;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -1369247911:
                case -425256812:
                    int iM31613 = C0773.m3169(strM8350) ^ 2128954599;
                    dialogInterfaceC8327 = viewOnClickListenerC16544.f53557;
                    if (iM13536 == iM31613) {
                        iM3169 = C0619.m2761("ۨۜ") ^ i16;
                        i2 = ((iM3169 ^ i15) * 12917) ^ (-758480327);
                        i3 = -976161391;
                    } else {
                        iM3169 = C0619.m2761("ᩳ۬") ^ i15;
                        i2 = ((iM3169 ^ i16) * 13495) ^ 1108100750;
                        i3 = 1572208265;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -1367477933:
                case -519972969:
                    break;
                case -1346962806:
                case 979002824:
                    if (!C2878.f9462) {
                        strM6952 = str2;
                        iM31612 = (C0619.m2761("ܶۚ") ^ i15) * (-3);
                        i12 = ((iM31612 ^ i16) * (-16701)) ^ (-1361542876);
                        i13 = -1663427615;
                        i18 = iM31612 ^ i13;
                        i17 = i12;
                        str2 = strM6952;
                    } else {
                        iM3169 = C0773.m3169("᩷֡") ^ i15;
                        i2 = ((iM3169 ^ i16) * 13587) ^ (-1857572340);
                        i3 = 392501295;
                        i18 = iM3169 ^ i3;
                        i17 = i2;
                    }
                    break;
                case -1301616646:
                case -704207693:
                    new ViewOnClickListenerC4612(abstractActivityC17205, dialogInterfaceC8327);
                    C2375.m8064(dialogInterfaceC8327);
                    break;
                case -1219149230:
                case 1974040423:
                    new ViewOnClickListenerC10708(abstractActivityC17205, dialogInterfaceC8327);
                    C2375.m8064(dialogInterfaceC8327);
                    break;
                case -1091178215:
                case 1987778913:
                    if (C21766.m49336(str2)) {
                        iM3169 = C0619.m2761("֨ۜ") ^ i15;
                        i2 = ((iM3169 ^ i16) * 26909) ^ (-1885433922);
                        i3 = -1563063659;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩻") ^ i15;
                        i2 = ((iM3169 ^ i16) * 24059) ^ (-765234815);
                        i3 = -1372270589;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -966342846:
                case 518109688:
                    strM6952 = str2;
                    int i34 = i23;
                    int i35 = i24;
                    if (iM13536 == (C0773.m3169(C1146.m4222(sArr6, i34, i35, i27)) ^ 2126179111)) {
                        int iM2764 = C0619.m2761("᩺᩶") ^ i15;
                        i23 = i34;
                        i17 = ((iM2764 ^ i16) * 32093) ^ 1233200529;
                        i18 = iM2764 ^ (-1277427027);
                        i24 = i35;
                    } else {
                        i23 = i34;
                        int iM2765 = C0619.m2761("ᩳۖ") ^ i16;
                        i18 = iM2765 ^ 1769770891;
                        i24 = i35;
                        i17 = ((iM2765 ^ i15) * (-28259)) ^ (-1747120071);
                    }
                    str2 = strM6952;
                    break;
                case -731596927:
                case 789872429:
                    C23916.m53419();
                    iM3169 = C0619.m2761("ܶ᩶") ^ i16;
                    i2 = ((iM3169 ^ i15) * 22495) ^ 306854609;
                    i3 = -713039508;
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -653857974:
                case -556163860:
                    strM6952 = str2;
                    strM8350 = C2485.m8350(f53551, 149, 3, i27);
                    if (C13473.m33144()) {
                        iM31612 = (C0619.m2761("ۡܺ") + i16) * (-107);
                        i12 = ((iM31612 ^ i15) * 12681) ^ 86480232;
                        i13 = -632383997;
                    } else {
                        iM31612 = (C0619.m2761("ܶۚ") ^ i15) * (-3);
                        i12 = ((iM31612 ^ i16) * (-16701)) ^ (-1361542876);
                        i13 = -1663427615;
                    }
                    i18 = iM31612 ^ i13;
                    i17 = i12;
                    str2 = strM6952;
                    break;
                case -629971513:
                case -195691804:
                    textInputLayoutArr[z2 ? 1 : 0] = textInputLayout2;
                    textInputLayout = viewOnClickListenerC16544.f53553;
                    textInputLayoutArr[z ? 1 : 0] = textInputLayout;
                    if (!C17617.m41270(textInputLayoutArr)) {
                        iM3169 = (C0773.m3169("᩹ܰ") ^ i15) * 77;
                        i2 = ((iM3169 ^ i16) * (-31189)) ^ (-640474619);
                        i3 = 534065641;
                        i18 = iM3169 ^ i3;
                        i17 = i2;
                    } else {
                        str2 = str2;
                        iM13537 = iM13537;
                        sArr5 = sArr5;
                        c24752 = c24752;
                        sArr4 = sArr4;
                        i25 = i25;
                        int i36 = i24;
                        i21 = i21;
                        i = i36;
                        iM31610 = C0619.m2761("ۤۘ") ^ i16;
                        i4 = ((iM31610 ^ i15) * (-15207)) ^ 393349816;
                        i5 = 1366840801;
                        int i37 = iM31610 ^ i5;
                        i17 = i4;
                        i25 = i25;
                        str2 = str2;
                        sArr4 = sArr4;
                        iM13537 = iM13537;
                        i18 = i37;
                        c24752 = c24752;
                        viewOnClickListenerC16544 = this;
                        sArr5 = sArr5;
                        int i38 = i21;
                        i24 = i;
                        i21 = i38;
                    }
                    break;
                case -550658254:
                case -440689771:
                    str = str2;
                    sArr5 = sArr5;
                    int i39 = i21;
                    int i40 = i22;
                    c24750 = c24752;
                    i = i24;
                    i21 = i39;
                    int iM31614 = C0773.m3169(RunnableC1848.m6366(sArr5, i39, i40, i27)) ^ 2127190434;
                    i22 = i40;
                    int i41 = iM3792;
                    if (i41 != iM31614) {
                        iM2761 = C0773.m3169("᩺ܶ") ^ i16;
                        iM3792 = i41;
                        i10 = ((iM2761 ^ i15) * 17411) ^ (-740056578);
                        i11 = 960315722;
                        i18 = iM2761 ^ i11;
                        i17 = i10;
                        c24752 = c24750;
                        str2 = str;
                        sArr5 = sArr5;
                        int i310 = i21;
                        i24 = i;
                        i21 = i310;
                    } else {
                        iM3792 = i41;
                        abstractActivityC17204 = abstractActivityC17205;
                        i9 = iM13537;
                        sArr = sArr4;
                        i8 = i25;
                        i7 = i26;
                        int iM31615 = C0773.m3169("᩶ܳ") ^ i16;
                        i17 = ((iM31615 ^ i15) * 29663) ^ (-1374067564);
                        i26 = i7;
                        i25 = i8;
                        sArr4 = sArr;
                        iM13537 = i9;
                        i18 = iM31615 ^ 929274884;
                        abstractActivityC17205 = abstractActivityC17204;
                        c24752 = c24750;
                        str2 = str;
                        viewOnClickListenerC16544 = this;
                        sArr5 = sArr5;
                        int i311 = i21;
                        i24 = i;
                        i21 = i311;
                    }
                    break;
                case -509899105:
                case 1614500330:
                    str = str2;
                    sArr5 = sArr5;
                    c24750 = c24752;
                    int i42 = i24;
                    i21 = i21;
                    i = i42;
                    iM13537 = C4238.m13536(view);
                    z = true;
                    z = true;
                    sArr4 = f53551;
                    i25 = 140;
                    i26 = 3;
                    if (C2878.m9491() <= 0) {
                        iM31611 = (C0773.m3169("۫ۤ") ^ i16) * (-91);
                        i17 = ((iM31611 ^ i15) * 25715) ^ 2073578209;
                        i6 = -842717487;
                    } else {
                        iM31611 = (i15 - C0773.m3169("ۨۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i17 = ((iM31611 ^ i16) * (-10259)) ^ 1611254739;
                        i6 = -1867354864;
                    }
                    i18 = iM31611 ^ i6;
                    viewOnClickListenerC16544 = this;
                    c24752 = c24750;
                    str2 = str;
                    sArr5 = sArr5;
                    int i312 = i21;
                    i24 = i;
                    i21 = i312;
                    break;
                case -472117273:
                case 63249549:
                    i = i24;
                    i27 = 49186;
                    iM31610 = C0773.m3169("ۗ۟") ^ i16;
                    i4 = ((iM31610 ^ i15) * (-10829)) ^ 1523301425;
                    i5 = -1710191608;
                    int i313 = iM31610 ^ i5;
                    i17 = i4;
                    i25 = i25;
                    str2 = str2;
                    sArr4 = sArr4;
                    iM13537 = iM13537;
                    i18 = i313;
                    c24752 = c24752;
                    viewOnClickListenerC16544 = this;
                    sArr5 = sArr5;
                    int i314 = i21;
                    i24 = i;
                    i21 = i314;
                    break;
                case -452510489:
                case 1694909806:
                    C3734.m12152();
                    break;
                case -271161211:
                case -122027633:
                    if (AbstractC3624.m11755() != 0) {
                        strM6952 = str2;
                        sArr2 = sArr5;
                        c24751 = c24752;
                        int iM2766 = (i16 - C0619.m2761("ۙۨ")) * 83;
                        i2 = ((iM2766 ^ i15) * (-30173)) ^ (-787928658);
                        i18 = iM2766 ^ 896383459;
                        c24752 = c24751;
                        str2 = strM6952;
                        sArr5 = sArr2;
                        i17 = i2;
                    }
                    iM3169 = C0619.m2761("ܶ᩶") ^ i16;
                    i2 = ((iM3169 ^ i15) * 22495) ^ 306854609;
                    i3 = -713039508;
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -262302839:
                case 1810727973:
                    str = str2;
                    sArr5 = sArr5;
                    c24750 = c24752;
                    short[] sArr7 = sArr4;
                    int i43 = i25;
                    i7 = i26;
                    int i44 = i24;
                    i21 = i21;
                    i = i44;
                    sArr = sArr7;
                    int iM31616 = C0773.m3169(C1783.m6233(sArr7, i43, i7, i27)) ^ 2123217298;
                    i8 = i43;
                    abstractActivityC17204 = viewOnClickListenerC16544.f53554;
                    int i45 = iM13537;
                    if (i45 != iM31616) {
                        int iM31617 = C0773.m3169("ܽۘ") ^ i15;
                        i20 = iM31616;
                        i26 = i7;
                        i25 = i8;
                        sArr4 = sArr;
                        i17 = ((iM31617 ^ i16) * (-31011)) ^ 173145218;
                        abstractActivityC17205 = abstractActivityC17204;
                        i18 = iM31617 ^ (-1243740332);
                        c24752 = c24750;
                        str2 = str;
                        iM13537 = i45;
                    } else {
                        i9 = i45;
                        i20 = iM31616;
                        int iM31618 = C0773.m3169("᩶ܳ") ^ i16;
                        i17 = ((iM31618 ^ i15) * 29663) ^ (-1374067564);
                        i26 = i7;
                        i25 = i8;
                        sArr4 = sArr;
                        iM13537 = i9;
                        i18 = iM31618 ^ 929274884;
                        abstractActivityC17205 = abstractActivityC17204;
                        c24752 = c24750;
                        str2 = str;
                    }
                    viewOnClickListenerC16544 = this;
                    sArr5 = sArr5;
                    int i315 = i21;
                    i24 = i;
                    i21 = i315;
                    break;
                case -218762372:
                case 969895024:
                    EditText editTextM2350 = C0487.m2350(textInputLayout2);
                    C1146.m4233(editTextM2350);
                    strM6953 = C2023.m6952(C1826.m6309(editTextM2350));
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i16 - C0619.m2761("ۙ᩵")) * 55;
                        i2 = ((iM3169 ^ i15) * (-17583)) ^ 653064272;
                        i3 = 401181769;
                    } else {
                        iM3169 = C0619.m2761("ۚۘ") ^ i16;
                        i2 = ((iM3169 ^ i15) * (-5941)) ^ 1282708087;
                        i3 = -870009215;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -208607122:
                case 1543728699:
                    textInputLayoutArr = new TextInputLayout[2];
                    z2 = false;
                    z2 = false;
                    textInputLayout2 = viewOnClickListenerC16544.f53556;
                    if (C2288.f7433 > 0) {
                        iM3169 = C0619.m2761("᩹᩹") ^ i16;
                        i2 = ((iM3169 ^ i15) * (-9995)) ^ (-1139834101);
                        i3 = 1143991238;
                        i18 = iM3169 ^ i3;
                        i17 = i2;
                    } else {
                        strM6952 = str2;
                        iM31612 = (C0619.m2761("ܶۚ") ^ i15) * (-3);
                        i12 = ((iM31612 ^ i16) * (-16701)) ^ (-1361542876);
                        i13 = -1663427615;
                        i18 = iM31612 ^ i13;
                        i17 = i12;
                        str2 = strM6952;
                    }
                    break;
                case -165716576:
                case 1510130629:
                    strM6952 = str2;
                    c24751 = c24752;
                    int i46 = i24;
                    iM3792 = C0950.m3792(view);
                    sArr2 = f53551;
                    i22 = 3;
                    if (C2485.f7950 == 0) {
                        int iM2767 = C0619.m2761("ۢۢ") ^ i16;
                        i12 = ((iM2767 ^ i15) * 28827) ^ 1518896095;
                        i18 = iM2767 ^ 1867783536;
                        c24752 = c24751;
                        i24 = i46;
                        i21 = 143;
                        sArr5 = sArr2;
                        i17 = i12;
                        str2 = strM6952;
                    } else {
                        i24 = i46;
                        i21 = 143;
                        int iM2768 = (i16 - C0619.m2761("ۙۨ")) * 83;
                        i2 = ((iM2768 ^ i15) * (-30173)) ^ (-787928658);
                        i18 = iM2768 ^ 896383459;
                        c24752 = c24751;
                        str2 = strM6952;
                        sArr5 = sArr2;
                        i17 = i2;
                    }
                    break;
                case -137961345:
                case 1885149853:
                    C11235.m28302(textInputLayout2, C0773.m3169(C2375.m8069(f53551, 156, 3, i27)) ^ 2122917661);
                    break;
                case -122653964:
                case 2067725091:
                    if (C21766.m49335(strM6953)) {
                        iM3169 = (i15 - C0619.m2761("۬ۖ")) * (-117);
                        i2 = ((iM3169 ^ i16) * (-14769)) ^ 20997467;
                        i3 = 1471513670;
                    } else {
                        iM3169 = C0619.m2761("ۤ֫") ^ i16;
                        i2 = ((iM3169 ^ i15) * (-17905)) ^ (-929786653);
                        i3 = 1203725626;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case -118051666:
                case 399197199:
                    i = i24;
                    i27 = 13378;
                    iM31610 = C0773.m3169("ۗ۟") ^ i16;
                    i4 = ((iM31610 ^ i15) * (-10829)) ^ 1523301425;
                    i5 = -1710191608;
                    int i316 = iM31610 ^ i5;
                    i17 = i4;
                    i25 = i25;
                    str2 = str2;
                    sArr4 = sArr4;
                    iM13537 = iM13537;
                    i18 = i316;
                    c24752 = c24752;
                    viewOnClickListenerC16544 = this;
                    sArr5 = sArr5;
                    int i317 = i21;
                    i24 = i;
                    i21 = i317;
                    break;
                case -82896765:
                case 846605522:
                    C3448.m11248();
                    if (C0773.f2792 > 0) {
                        iM3169 = (i16 - C0619.m2761("ۙ᩵")) * 55;
                        i2 = ((iM3169 ^ i15) * (-17583)) ^ 653064272;
                        i3 = 401181769;
                        i18 = iM3169 ^ i3;
                        i17 = i2;
                    } else {
                        str = str2;
                        sArr5 = sArr5;
                        c24750 = c24752;
                        int i47 = i24;
                        i21 = i21;
                        i = i47;
                        iM31611 = (C0773.m3169("۫ۤ") ^ i16) * (-91);
                        i17 = ((iM31611 ^ i15) * 25715) ^ 2073578209;
                        i6 = -842717487;
                        i18 = iM31611 ^ i6;
                        viewOnClickListenerC16544 = this;
                        c24752 = c24750;
                        str2 = str;
                        sArr5 = sArr5;
                        int i318 = i21;
                        i24 = i;
                        i21 = i318;
                    }
                    break;
                case -29989821:
                case 965464499:
                    if (C20932.f66974 > 0) {
                        str2 = str2;
                        iM13537 = iM13537;
                        sArr5 = sArr5;
                        c24752 = c24752;
                        sArr4 = sArr4;
                        i25 = i25;
                        int i48 = i24;
                        i21 = i21;
                        i = i48;
                        iM31610 = (C0773.m3169("ۘۜ") ^ i15) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM31610 ^ i16) * 21691) ^ 1430023055;
                        i5 = 550353778;
                        int i319 = iM31610 ^ i5;
                        i17 = i4;
                        i25 = i25;
                        str2 = str2;
                        sArr4 = sArr4;
                        iM13537 = iM13537;
                        i18 = i319;
                        c24752 = c24752;
                        viewOnClickListenerC16544 = this;
                        sArr5 = sArr5;
                        int i3110 = i21;
                        i24 = i;
                        i21 = i3110;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩶") ^ i16;
                        i2 = ((iM3169 ^ i15) * 22495) ^ 306854609;
                        i3 = -713039508;
                        i18 = iM3169 ^ i3;
                        i17 = i2;
                    }
                    break;
                case 2602260:
                case 984463147:
                    C7791.m21184(abstractActivityC17205, c24752);
                    break;
                case 41931658:
                case 1564658061:
                    AbstractC0641.m2813();
                    if (C1564.m5509() <= 0) {
                        str = str2;
                        sArr5 = sArr5;
                        c24750 = c24752;
                        int i49 = i24;
                        i21 = i21;
                        i = i49;
                        iM31611 = (C0773.m3169("۫ۤ") ^ i16) * (-91);
                        i17 = ((iM31611 ^ i15) * 25715) ^ 2073578209;
                        i6 = -842717487;
                        i18 = iM31611 ^ i6;
                        viewOnClickListenerC16544 = this;
                        c24752 = c24750;
                        str2 = str;
                        sArr5 = sArr5;
                        int i3111 = i21;
                        i24 = i;
                        i21 = i3111;
                    } else {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i15;
                        i2 = ((iM3169 ^ i16) * 8589) ^ (-423989361);
                        i3 = -1060411840;
                        i18 = iM3169 ^ i3;
                        i17 = i2;
                    }
                    break;
                case 192524829:
                case 1679148222:
                    str2 = str2;
                    iM13537 = iM13537;
                    sArr5 = sArr5;
                    c24752 = c24752;
                    sArr4 = sArr4;
                    i25 = i25;
                    int i50 = i24;
                    i21 = i21;
                    i = i50;
                    s = sArr3[c];
                    i19 = s * 2;
                    if (C2485.f7950 != 0) {
                        iM31610 = C0773.m3169("ܿܳ") ^ i15;
                        i4 = ((iM31610 ^ i16) * 18947) ^ 1752447030;
                        i5 = 1080704756;
                    } else {
                        iM31610 = C0619.m2761("ۘܿ") ^ i15;
                        i4 = ((iM31610 ^ i16) * 19779) ^ 3969066;
                        i5 = 1059542948;
                    }
                    int i3112 = iM31610 ^ i5;
                    i17 = i4;
                    i25 = i25;
                    str2 = str2;
                    sArr4 = sArr4;
                    iM13537 = iM13537;
                    i18 = i3112;
                    c24752 = c24752;
                    viewOnClickListenerC16544 = this;
                    sArr5 = sArr5;
                    int i3113 = i21;
                    i24 = i;
                    i21 = i3113;
                    break;
                case 219597050:
                case 1032087925:
                    C11235.m28302(textInputLayout, C0773.m3169(C2834.m9343(f53551, 162, 3, i27)) ^ 2127422966);
                    break;
                case 347449347:
                case 930963590:
                    if (C3077.m10045(str2) < 7) {
                        iM3169 = (C0619.m2761("ۗۧ") ^ i16) * 9;
                        i2 = ((iM3169 ^ i15) * 7349) ^ 1067988679;
                        i3 = 163694071;
                    } else {
                        iM3169 = C0773.m3169("᩸ܺ") ^ i16;
                        i2 = ((iM3169 ^ i15) * 15021) ^ (-2015399462);
                        i3 = -972981087;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case 350002201:
                case 1292443403:
                    viewOnClickListenerC16544.m39178(z2);
                    final C10577 c10577 = new C10577(viewOnClickListenerC16544, str2);
                    ReentrantLock reentrantLock = C11650.f37690;
                    if (C2354.m7983()) {
                        C3077.m10038(new Thread(new Runnable() { // from class: l.ܽۜ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity = null;
                                C10577 c10578 = null;
                                int i51 = 743474795;
                                int i52 = C3033.f9831;
                                int i53 = C2310.f7472;
                                int iM31619 = C0773.m3169("ۙۖ") ^ i52;
                                int i54 = ((iM31619 ^ i53) * 19649) ^ 908886393;
                                int i55 = -851466079;
                                while (true) {
                                    i51 = ((((i51 ^ i53) * (-26565)) >> 31) & i54) ^ (iM31619 ^ i55);
                                    switch (i51) {
                                        case -2008022370:
                                        case -1368114308:
                                            if (C0862.f3233 != 0) {
                                                iM31619 = C0773.m3169("ۘۨ") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-5595)) ^ 1084552886;
                                                i55 = -495141060;
                                            } else {
                                                iM31619 = C0619.m2761("ܰ֡") ^ i52;
                                                i54 = ((iM31619 ^ i53) * (-15881)) ^ (-1363692927);
                                                i55 = -174508229;
                                            }
                                            break;
                                        case -1990238463:
                                        case 585322518:
                                            activity = abstractActivityC17205;
                                            if (C3998.f13671 != 0) {
                                                iM31619 = C0773.m3169("ۘۨ") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-5595)) ^ 1084552886;
                                                i55 = -495141060;
                                            } else {
                                                iM31619 = (i52 - C0619.m2761("ܺۘ")) * (-29);
                                                i54 = ((iM31619 ^ i53) * (-24027)) ^ (-728876136);
                                                i55 = -617517121;
                                            }
                                            break;
                                        case -1780412145:
                                        case 440791264:
                                            if (C0950.f3488 >= 0) {
                                                iM31619 = (C0619.m2761("ۗᩴ") + i53) * (-63);
                                                i54 = ((iM31619 ^ i52) * 3735) ^ 1820680382;
                                                i55 = 509276788;
                                            } else {
                                                iM31619 = C0619.m2761("֡ܳ") ^ i52;
                                                i54 = ((iM31619 ^ i53) * 5243) ^ (-744446861);
                                                i55 = 1529696675;
                                            }
                                            break;
                                        case -1569119220:
                                        case 877555573:
                                            C1564.m5509();
                                            if (C0862.f3233 == 0) {
                                                iM31619 = C0619.m2761("ܺܽ") ^ i52;
                                                i54 = ((iM31619 ^ i53) * 23929) ^ (-1753791448);
                                                i55 = 1491725662;
                                            } else {
                                                iM31619 = (C0773.m3169("ܳ֫") ^ i53) * (-105);
                                                i54 = ((iM31619 ^ i52) * 9221) ^ (-1979695777);
                                                i55 = 1383436381;
                                            }
                                            break;
                                        case -1353629550:
                                        case 253457243:
                                            if (C2878.f9462) {
                                                iM31619 = (C0619.m2761("ۗᩴ") + i53) * (-63);
                                                i54 = ((iM31619 ^ i52) * 3735) ^ 1820680382;
                                                i55 = 509276788;
                                            } else {
                                                iM31619 = C0773.m3169("ۤۙ") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-6343)) ^ 212081540;
                                                i55 = -154393140;
                                            }
                                            break;
                                        case -1296863200:
                                        case 1553955059:
                                            C2485.m8357();
                                            AbstractC0116.m1243();
                                            break;
                                        case -1258138721:
                                        case -54117643:
                                            if (C1542.f5343 <= 0) {
                                                iM31619 = (i52 - C0619.m2761("ᩴᩳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i54 = ((iM31619 ^ i53) * (-243)) ^ (-1488431117);
                                                i55 = -1928173351;
                                            } else {
                                                iM31619 = C0619.m2761("ܶܺ") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-10641)) ^ 1089457229;
                                                i55 = 438133522;
                                            }
                                            break;
                                        case -1221252681:
                                        case 51476399:
                                            if (C4238.f15451 < 0) {
                                                iM31619 = (C0619.m2761("ۗᩴ") + i53) * (-63);
                                                i54 = ((iM31619 ^ i52) * 3735) ^ 1820680382;
                                                i55 = 509276788;
                                            } else {
                                                iM31619 = (C0773.m3169("ܳ֫") ^ i53) * (-105);
                                                i54 = ((iM31619 ^ i52) * 9221) ^ (-1979695777);
                                                i55 = 1383436381;
                                            }
                                            break;
                                        case -1140215118:
                                        case 553579232:
                                            if (C4238.m13540() <= 0) {
                                                iM31619 = (C0773.m3169("ܳ֫") ^ i53) * (-105);
                                                i54 = ((iM31619 ^ i52) * 9221) ^ (-1979695777);
                                                i55 = 1383436381;
                                            } else {
                                                iM31619 = (C0773.m3169("ۛ᩺") + i53) * 75;
                                                i54 = ((iM31619 ^ i52) * (-29621)) ^ (-1519220396);
                                                i55 = 1855679668;
                                            }
                                            break;
                                        case -1123955912:
                                        case 1462662690:
                                            C3779.m12264();
                                            if (!RunnableC1848.m6360()) {
                                                iM31619 = (i52 - C0619.m2761("ᩴᩳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i54 = ((iM31619 ^ i53) * (-243)) ^ (-1488431117);
                                                i55 = -1928173351;
                                            } else {
                                                iM31619 = (C0773.m3169("ܳ֫") ^ i53) * (-105);
                                                i54 = ((iM31619 ^ i52) * 9221) ^ (-1979695777);
                                                i55 = 1383436381;
                                            }
                                            break;
                                        case -869298545:
                                        case 2088116507:
                                            if (C1146.f4234 >= 0) {
                                                iM31619 = (C0773.m3169("ܳ֫") ^ i53) * (-105);
                                                i54 = ((iM31619 ^ i52) * 9221) ^ (-1979695777);
                                                i55 = 1383436381;
                                            } else {
                                                iM31619 = (C0619.m2761("۫ܿ") ^ i52) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i54 = ((iM31619 ^ i53) * (-9491)) ^ (-1414645962);
                                                i55 = -1171486825;
                                            }
                                            break;
                                        case -526474332:
                                        case -447177799:
                                            if (C3492.f12043 <= 0) {
                                                iM31619 = C0619.m2761("ܺܽ") ^ i52;
                                                i54 = ((iM31619 ^ i53) * 23929) ^ (-1753791448);
                                                i55 = 1491725662;
                                            } else {
                                                iM31619 = C0773.m3169("ܰۚ") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-29553)) ^ 404992236;
                                                i55 = -910535279;
                                            }
                                            break;
                                        case -284134492:
                                        case 2003719242:
                                            C20932.m47848();
                                            C20932.m47848();
                                            iM31619 = (i52 - C0619.m2761("ᩴᩳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i54 = ((iM31619 ^ i53) * (-243)) ^ (-1488431117);
                                            i55 = -1928173351;
                                            break;
                                        case -4061356:
                                        case 1068182247:
                                            C11650.m29301(strM6953, str2, activity, c10578);
                                            break;
                                        case 529054562:
                                        case 552823609:
                                            c10578 = c10577;
                                            if (C2878.f9462) {
                                                iM31619 = C0773.m3169("ۘۨ") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-5595)) ^ 1084552886;
                                                i55 = -495141060;
                                            } else {
                                                iM31619 = C0773.m3169("ܰۢ") ^ i52;
                                                i54 = ((iM31619 ^ i53) * (-14093)) ^ 11514112;
                                                i55 = 270451020;
                                            }
                                            break;
                                        default:
                                            if (C2878.f9462) {
                                                iM31619 = (C0619.m2761("ۗᩴ") + i53) * (-63);
                                                i54 = ((iM31619 ^ i52) * 3735) ^ 1820680382;
                                                i55 = 509276788;
                                            } else {
                                                iM31619 = C0773.m3169("ᩴ֡") ^ i53;
                                                i54 = ((iM31619 ^ i52) * 28219) ^ 2128416192;
                                                i55 = 1664311659;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }

                            {
                                int i51 = -459975778;
                                int i52 = C1783.f6087;
                                int i53 = RunnableC0334.f1808;
                                int iM31619 = C0773.m3169("ۧ᩸") ^ i52;
                                int i54 = ((iM31619 ^ i53) * (-17423)) ^ (-496472512);
                                int i55 = 1181675218;
                                while (true) {
                                    i51 = ((((i51 ^ i53) * (-3077)) >> 31) & i54) ^ (iM31619 ^ i55);
                                    switch (i51) {
                                        case -1856517155:
                                        case 207255381:
                                            if (C2834.f9334 <= 0) {
                                                iM31619 = (i53 - C0773.m3169("ۢᩳ")) * 55;
                                                i54 = ((iM31619 ^ i52) * (-31187)) ^ (-1429201946);
                                                i55 = -476246117;
                                            } else {
                                                iM31619 = (C0773.m3169("۠֫") ^ i52) * 15;
                                                i54 = ((iM31619 ^ i53) * 29999) ^ 1191605666;
                                                i55 = 568584972;
                                            }
                                            break;
                                        case -1669741634:
                                        case 132508864:
                                            return;
                                        case -1538436261:
                                        case 757275131:
                                            if (C3448.m11248() != 0) {
                                                iM31619 = C0773.m3169("ᩳ᩷") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-20437)) ^ 739625453;
                                                i55 = 413126083;
                                            } else {
                                                iM31619 = (C0773.m3169("ۤ۫") + i52) * (-97);
                                                i54 = ((iM31619 ^ i53) * 4251) ^ (-1145243340);
                                                i55 = -1617990740;
                                            }
                                            break;
                                        case -1455831526:
                                        case 757300584:
                                            C2419.m8174();
                                            C0487.m2356();
                                            iM31619 = (i52 - C0619.m2761("ۛۧ")) * 91;
                                            i54 = ((iM31619 ^ i53) * (-13603)) ^ (-1245622043);
                                            i55 = -1549649851;
                                            break;
                                        case -1122394765:
                                        case -555582162:
                                            C2354.m7983();
                                            if (C3033.f9831 >= 0) {
                                                iM31619 = (C0773.m3169("ۜۜ") + i52) * 91;
                                                i54 = ((iM31619 ^ i53) * 16301) ^ 399645001;
                                                i55 = 2113975866;
                                            } else {
                                                iM31619 = C0773.m3169("ᩳ᩷") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-20437)) ^ 739625453;
                                                i55 = 413126083;
                                            }
                                            break;
                                        case -1007578293:
                                        case 618631731:
                                            RunnableC3646.m11813();
                                            C2485.m8357();
                                            throw new RuntimeException();
                                        case -1000502661:
                                        case 1871787785:
                                            if (C2310.f7472 >= 0) {
                                                iM31619 = (C0619.m2761("ܳ֡") + i53) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i54 = ((iM31619 ^ i52) * (-1615)) ^ 273062544;
                                                i55 = 2121918725;
                                            } else {
                                                iM31619 = (C0773.m3169("ۜۜ") + i52) * 91;
                                                i54 = ((iM31619 ^ i53) * 16301) ^ 399645001;
                                                i55 = 2113975866;
                                            }
                                            break;
                                        case -959813810:
                                        case -481923294:
                                            if (C1783.f6087 <= 0) {
                                                iM31619 = C0773.m3169("ᩳ᩷") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-20437)) ^ 739625453;
                                                i55 = 413126083;
                                            } else {
                                                iM31619 = (C0619.m2761("ۘۘ") ^ i52) * (-93);
                                                i54 = ((iM31619 ^ i53) * (-31)) ^ (-609550739);
                                                i55 = 670688601;
                                            }
                                            break;
                                        case -816949441:
                                        case 125081934:
                                            if (C1564.m5509() <= 0) {
                                                iM31619 = C0773.m3169("ᩳ᩷") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-20437)) ^ 739625453;
                                                i55 = 413126083;
                                            } else {
                                                iM31619 = C0773.m3169("ۛ᩶") ^ i53;
                                                i54 = ((iM31619 ^ i52) * 11519) ^ 289912348;
                                                i55 = 1449438125;
                                            }
                                            break;
                                        case -714609813:
                                        case -99369322:
                                            if (C3077.m10041()) {
                                                iM31619 = (i52 - C0619.m2761("ۛۧ")) * 91;
                                                i54 = ((iM31619 ^ i53) * (-13603)) ^ (-1245622043);
                                                i55 = -1549649851;
                                            } else {
                                                iM31619 = C0773.m3169("֡ۗ") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-11441)) ^ (-1016195795);
                                                i55 = -210424617;
                                            }
                                            break;
                                        case 518981320:
                                        case 1673067960:
                                            if (C1519.f5300 < 0) {
                                                iM31619 = C0773.m3169("ᩳ᩷") ^ i53;
                                                i54 = ((iM31619 ^ i52) * (-20437)) ^ 739625453;
                                                i55 = 413126083;
                                            } else {
                                                iM31619 = (i52 - C0619.m2761("ۛۧ")) * 91;
                                                i54 = ((iM31619 ^ i53) * (-13603)) ^ (-1245622043);
                                                i55 = -1549649851;
                                            }
                                            break;
                                        case 1445798105:
                                        case 2029349791:
                                            if (C3448.f11240 >= 0) {
                                                iM31619 = (C0773.m3169("ۜۜ") + i52) * 91;
                                                i54 = ((iM31619 ^ i53) * 16301) ^ 399645001;
                                                i55 = 2113975866;
                                            } else {
                                                iM31619 = (i53 - C0773.m3169("֡᩸")) * 69;
                                                i54 = ((iM31619 ^ i52) * (-20857)) ^ (-1060497197);
                                                i55 = 2080184950;
                                            }
                                            break;
                                        case 1594565983:
                                        case 2120163599:
                                            if (C3998.m12920()) {
                                                iM31619 = (i53 - C0619.m2761("ۧۜ")) * 95;
                                                i54 = ((iM31619 ^ i52) * (-25697)) ^ (-1596838797);
                                                i55 = -1684185816;
                                            } else {
                                                iM31619 = (i52 - C0619.m2761("ۛۧ")) * 91;
                                                i54 = ((iM31619 ^ i53) * (-13603)) ^ (-1245622043);
                                                i55 = -1549649851;
                                            }
                                            break;
                                        case 1675344793:
                                        case 1984409019:
                                            if (C13473.f42873 != 0) {
                                                iM31619 = (i53 - C0773.m3169("ۢᩳ")) * 55;
                                                i54 = ((iM31619 ^ i52) * (-31187)) ^ (-1429201946);
                                                i55 = -476246117;
                                            } else {
                                                iM31619 = C0619.m2761("᩻ᩴ") ^ i52;
                                                i54 = ((iM31619 ^ i53) * 18463) ^ (-1055300003);
                                                i55 = -1622094396;
                                            }
                                            break;
                                        case 1702007117:
                                        case 1785775854:
                                            if (C23916.f77426 <= 0) {
                                                iM31619 = (C0619.m2761("ܳ֡") + i53) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i54 = ((iM31619 ^ i52) * (-1615)) ^ 273062544;
                                                i55 = 2121918725;
                                            } else {
                                                iM31619 = (C0619.m2761("᩷۟") + i53) * (-51);
                                                i54 = ((iM31619 ^ i52) * 26549) ^ (-1839877034);
                                                i55 = -2007271493;
                                            }
                                            break;
                                        default:
                                            if (C2485.m8357() <= 0) {
                                                iM31619 = (i53 - C0773.m3169("ۢᩳ")) * 55;
                                                i54 = ((iM31619 ^ i52) * (-31187)) ^ (-1429201946);
                                                i55 = -476246117;
                                            } else {
                                                iM31619 = C0773.m3169("᩹ᩳ") ^ i52;
                                                i54 = ((iM31619 ^ i53) * (-24617)) ^ (-644584165);
                                                i55 = -699472558;
                                            }
                                            break;
                                    }
                                }
                            }
                        }));
                    }
                    iM3169 = C0773.m3169("᩷֡") ^ i15;
                    i2 = ((iM3169 ^ i16) * 13587) ^ (-1857572340);
                    i3 = 392501295;
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case 711526626:
                case 2099152147:
                    str2 = str2;
                    iM13537 = iM13537;
                    sArr5 = sArr5;
                    c24752 = c24752;
                    sArr4 = sArr4;
                    i25 = i25;
                    int i51 = i24;
                    i21 = i21;
                    i = i51;
                    C17202.m40379(view, C1826.m6310(f53551, 139, 1, i27));
                    if (f53548.m55200()) {
                        iM31610 = C0619.m2761("ۤۘ") ^ i16;
                        i4 = ((iM31610 ^ i15) * (-15207)) ^ 393349816;
                        i5 = 1366840801;
                    } else {
                        iM31610 = (C0773.m3169("᩻᩺") + i15) * (-13);
                        i4 = ((iM31610 ^ i16) * (-17321)) ^ (-1430438918);
                        i5 = 809281044;
                    }
                    int i3114 = iM31610 ^ i5;
                    i17 = i4;
                    i25 = i25;
                    str2 = str2;
                    sArr4 = sArr4;
                    iM13537 = iM13537;
                    i18 = i3114;
                    c24752 = c24752;
                    viewOnClickListenerC16544 = this;
                    sArr5 = sArr5;
                    int i3115 = i21;
                    i24 = i;
                    i21 = i3115;
                    break;
                case 1105730826:
                case 2118731330:
                    C2375.m8071(textInputLayout, C0619.m2761(C0269.m1785(f53551, 165, 3, i27)) ^ 2098456369);
                    break;
                case 1306059128:
                case 1388570730:
                    C2375.m8071(textInputLayout2, C0619.m2761(C3492.m11486(f53551, 153, 3, i27)) ^ 2128765695);
                    break;
                case 1620355384:
                case 2086482877:
                    EditText editTextM47855 = C20932.m47855(textInputLayout);
                    C1146.m4233(editTextM47855);
                    editableM6309 = C1826.m6309(editTextM47855);
                    if (C3077.m10041()) {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i15;
                        i2 = ((iM3169 ^ i16) * 8589) ^ (-423989361);
                        i3 = -1060411840;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩹") ^ i15;
                        i2 = ((iM3169 ^ i16) * (-707)) ^ (-786968530);
                        i3 = -1652604898;
                    }
                    i18 = iM3169 ^ i3;
                    i17 = i2;
                    break;
                case 1923100114:
                case 1950946282:
                    strM6952 = C2023.m6952(editableM6309);
                    if (C0878.m3576((CharSequence) strM6953, (CharSequence) C13473.m33137(f53551, 152, 1, i27), z2)) {
                        iM31612 = C0773.m3169("ᩳܰ") ^ i16;
                        i12 = ((iM31612 ^ i15) * (-275)) ^ (-1007910330);
                        i13 = 1221203947;
                    } else {
                        iM31612 = C0619.m2761("ۘܳ") ^ i15;
                        i12 = ((iM31612 ^ i16) * 22645) ^ (-1958811588);
                        i13 = 1563824036;
                    }
                    i18 = iM31612 ^ i13;
                    i17 = i12;
                    str2 = strM6952;
                    break;
                default:
                    str2 = str2;
                    iM13537 = iM13537;
                    sArr5 = sArr5;
                    c24752 = c24752;
                    sArr4 = sArr4;
                    i25 = i25;
                    int i52 = i24;
                    i21 = i21;
                    i = i52;
                    int i53 = s + 1;
                    if ((i53 * i53) - (i19 + 1) >= 0) {
                        iM31610 = C0619.m2761("᩻ۢ") ^ i16;
                        i4 = ((iM31610 ^ i15) * (-5435)) ^ (-1076149814);
                        i5 = 1217186155;
                    } else {
                        iM31610 = (C0619.m2761("ۨۙ") + i15) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM31610 ^ i16) * (-3443)) ^ 1762844087;
                        i5 = 1650467614;
                    }
                    int i3116 = iM31610 ^ i5;
                    i17 = i4;
                    i25 = i25;
                    str2 = str2;
                    sArr4 = sArr4;
                    iM13537 = iM13537;
                    i18 = i3116;
                    c24752 = c24752;
                    viewOnClickListenerC16544 = this;
                    sArr5 = sArr5;
                    int i3117 = i21;
                    i24 = i;
                    i21 = i3117;
                    break;
            }
            return;
        }
    }
}
