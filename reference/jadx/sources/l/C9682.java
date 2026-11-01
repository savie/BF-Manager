package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 751X */
/* JADX INFO: loaded from: classes3.dex */
public final class C9682 {

    /* JADX INFO: renamed from: ۜᩴܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f32648 = {3423, 21374, 19281, 20276, -22602, 24071, 18233, 6150, -21210, -20894, -16942, 23651, -18877, 26278, 24263, -19811, 22361, -23774, -16840, -21629, -21504, -16736, 16576, -17841, 28077, -21295, 19728, -20544, 17027, 29637, 21719, 23148, 22706, 19198, 25207, 22088, 22056, -18670, 21537, -17326, 26898, -17346, -23601, -23084, -20117, -19440, 17558, 24540, -22088, 20029, 28439, -23133, -18787, 25212, -18250, -18314, 28320, 25489, -20836, 19472, 26963, 23651, -18498, 19127, -21671, 17360, -17659, 16527, 17711, -23488, -22238, 29347, 21304, -23616, 21765, 26722, -18860, 21328, 25812, 26357, -18444, 25579, 17102, 27336, 26252, -21166, 22061, 26198, -17384, -19490, -22244, 18371, -18292, -16521, 24738, -23534, 27088, -17498, 16926, -24033, -18901, -16398, -16613, 22762, -22021, 17652, -19817, 24401, 22602, -24404, 23981, -23596, 25418, -19104, 17660, 21951, 22694, 24394, -21345, 24431, 18206, 19405, -18287, 27244, 24493};

    /* JADX WARN: Code duplicated, block: B:26:0x00d8 A[PHI: r2 r10 r11
      0x00d8: PHI (r2v4 android.content.Context) = (r2v3 android.content.Context), (r2v2 android.content.Context), (r2v2 android.content.Context) binds: [B:25:0x00d6, B:15:0x008f, B:12:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:25:0x00d6, B:15:0x008f, B:12:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:25:0x00d6, B:15:0x008f, B:12:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0158 A[PHI: r3 r6
      0x0158: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:37:0x0156, B:21:0x00af, B:17:0x0093, B:15:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v3 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:37:0x0156, B:21:0x00af, B:17:0x0093, B:15:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0207 A[PHI: r7 r8 r13 r15 r24
      0x0207: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:52:0x0205, B:41:0x018c, B:29:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:52:0x0205, B:41:0x018c, B:29:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short) binds: [B:52:0x0205, B:41:0x018c, B:29:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:52:0x0205, B:41:0x018c, B:29:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r24v5 int) = (r24v4 int), (r24v3 int), (r24v3 int) binds: [B:52:0x0205, B:41:0x018c, B:29:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0278 A[PHI: r4 r5 r9 r16 r17 r18 r19
      0x0278: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:64:0x0276, B:60:0x0258, B:56:0x023a, B:33:0x0134, B:12:0x008a, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:64:0x0276, B:60:0x0258, B:56:0x023a, B:33:0x0134, B:12:0x008a, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:64:0x0276, B:60:0x0258, B:56:0x023a, B:33:0x0134, B:12:0x008a, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0276, B:60:0x0258, B:56:0x023a, B:33:0x0134, B:12:0x008a, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:64:0x0276, B:60:0x0258, B:56:0x023a, B:33:0x0134, B:12:0x008a, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r18v4 int) = (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:64:0x0276, B:60:0x0258, B:56:0x023a, B:33:0x0134, B:12:0x008a, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:64:0x0276, B:60:0x0258, B:56:0x023a, B:33:0x0134, B:12:0x008a, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24639(TextView textView) {
        int iM11306;
        int i;
        int i2;
        int i3 = RunnableC0195.f1321;
        int i4 = C1875.f7103;
        int iM11307 = (i3 - ThreadFactoryC3888.m11306("ᩳۘ")) * 99;
        int i5 = ((iM11307 ^ i4) * (-25281)) ^ 1097138784;
        String strM7604 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ (-1960704211);
        Context contextM2423 = null;
        int iM11308 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1932507301;
        int i14 = 0;
        String strM45020 = null;
        int i15 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-29925)) >> 31));
            switch (i13) {
                case -2092447233:
                case 1484408248:
                    i10 = 13495;
                    iM11306 = ThreadFactoryC3888.m11306("ۤۙ") ^ i3;
                    i = ((iM11306 ^ i4) * (-23035)) ^ (-2014035663);
                    i2 = 1550515721;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2065037635:
                case 446936939:
                    iM11308 = ThreadFactoryC3888.m11306(strM7604);
                    i15 = 2124255642;
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i4 - C19806.m45029("֨ۘ")) * (-123);
                        i = ((iM11306 ^ i3) * 8083) ^ 1924347983;
                        i2 = -864969842;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫ܽ")) * (-61);
                        i = ((iM11306 ^ i3) * 22069) ^ 1079816781;
                        i2 = -668844967;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1643719309:
                case -1429362727:
                    int i16 = s + s2;
                    if ((i16 * i16) - i14 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹᩷") ^ i4) * (-39);
                        i = ((iM11306 ^ i3) * 17291) ^ (-1711076417);
                        i2 = 1932109059;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܶ᩺")) * 31;
                        i = ((iM11306 ^ i4) * 3495) ^ (-2147086589);
                        i2 = -1999371160;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1491013265:
                case 760994600:
                    textView.setBackgroundResource(iM11308 ^ i15);
                    textView.setBackgroundTintList(null);
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("ۙۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-11665)) ^ 649317847;
                        i2 = 925285235;
                    } else {
                        iM11306 = C19806.m45029("ۘۤ") ^ i3;
                        i = ((iM11306 ^ i4) * 8433) ^ (-343457926);
                        i2 = 2141138546;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1153456557:
                case 396119429:
                    C0050.m946();
                    iM11306 = (C19806.m45029("᩹ۚ") ^ i4) * 53;
                    i = ((iM11306 ^ i3) * (-8615)) ^ (-2000837494);
                    i2 = -2073385232;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1003051897:
                case 2131177864:
                    int i17 = i11 + i12;
                    i14 = i17 + i17;
                    s2 = 15228;
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 11827) ^ 366897785;
                        i2 = 1037061183;
                    } else {
                        iM11306 = C19806.m45029("ۙۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-11665)) ^ 649317847;
                        i2 = 925285235;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -783709267:
                case -21925959:
                    s = sArr[c];
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i4 - C19806.m45029("֨ۘ")) * (-123);
                        i = ((iM11306 ^ i3) * 8083) ^ 1924347983;
                        i2 = -864969842;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 30093) ^ 2139641375;
                        i2 = 1389716184;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -783277881:
                case 845630174:
                    sArr = f32648;
                    c = 0;
                    if (C0216.f1393 != 0) {
                        iM11306 = (i4 - C19806.m45029("֨ۘ")) * (-123);
                        i = ((iM11306 ^ i3) * 8083) ^ 1924347983;
                        i2 = -864969842;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܿ") ^ i4) * 15;
                        i = ((iM11306 ^ i3) * (-24319)) ^ 1965467656;
                        i2 = 379907554;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -778360025:
                case -655809677:
                    strM45020 = C19806.m45020(sArr3, i9, 3, i10);
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("᩹ۚ") ^ i4) * 53;
                        i = ((iM11306 ^ i3) * (-8615)) ^ (-2000837494);
                        i2 = -2073385232;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸᩸")) * 71;
                        i = ((iM11306 ^ i4) * (-16687)) ^ (-431742155);
                        i2 = 1252817790;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -602442813:
                case 1744315513:
                    CallableC1627.m5507();
                    if (C2477.m7593() >= 0) {
                        iM11306 = (i4 - C19806.m45029("֨ۘ")) * (-123);
                        i = ((iM11306 ^ i3) * 8083) ^ 1924347983;
                        i2 = -864969842;
                    } else {
                        iM11306 = (C19806.m45029("۫ܽ") ^ i3) * (-119);
                        i = ((iM11306 ^ i4) * (-24471)) ^ (-352300187);
                        i2 = -883373849;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -599121107:
                case 357727621:
                    contextM2423 = C0526.m2423(textView);
                    sArr3 = f32648;
                    i9 = 4;
                    if (C1460.m5050() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩶") + i3) * 7;
                        i = ((iM11306 ^ i4) * 16229) ^ (-122631012);
                        i2 = -1042281604;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 24873) ^ 322804083;
                        i2 = 869854447;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -548240418:
                case 1578281465:
                    i10 = 25169;
                    iM11306 = ThreadFactoryC3888.m11306("ۤۙ") ^ i3;
                    i = ((iM11306 ^ i4) * (-23035)) ^ (-2014035663);
                    i2 = 1550515721;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -475867594:
                case 867340159:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (C19806.m45029("᩹ۚ") ^ i4) * 53;
                        i = ((iM11306 ^ i3) * (-8615)) ^ (-2000837494);
                        i2 = -2073385232;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩶") + i3) * 7;
                        i = ((iM11306 ^ i4) * 16229) ^ (-122631012);
                        i2 = -1042281604;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -473111054:
                case -251634793:
                    i11 = s * s;
                    i12 = 231891984;
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i4 - C19806.m45029("֨ۘ")) * (-123);
                        i = ((iM11306 ^ i3) * 8083) ^ 1924347983;
                        i2 = -864969842;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۤ") + i4) * (-75);
                        i = ((iM11306 ^ i3) * (-14245)) ^ 429717226;
                        i2 = -744863125;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -4197329:
                case 1127355561:
                    sArr2 = f32648;
                    i7 = 1;
                    i8 = 3;
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۗܳ") ^ i4;
                        i = ((iM11306 ^ i3) * 29579) ^ 789488799;
                        i2 = -1764996382;
                    } else {
                        iM11306 = C19806.m45029("ۙۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-11665)) ^ 649317847;
                        i2 = 925285235;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 481276558:
                case 1914175631:
                    C1460.m5050();
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩶") + i3) * 7;
                        i = ((iM11306 ^ i4) * 16229) ^ (-122631012);
                        i2 = -1042281604;
                    } else {
                        iM11306 = (i4 - C19806.m45029("֨ۘ")) * (-123);
                        i = ((iM11306 ^ i3) * 8083) ^ 1924347983;
                        i2 = -864969842;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 634385275:
                case 2026116198:
                    textView.setTextColor(C10405.m26305(contextM2423, C19806.m45029(strM45020) ^ 2100508102));
                    break;
                case 1600061370:
                case 2113766003:
                    strM7604 = C2477.m7604(sArr2, i7, i8, i10);
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("᩹ۚ") ^ i4) * 53;
                        i = ((iM11306 ^ i3) * (-8615)) ^ (-2000837494);
                        i2 = -2073385232;
                    } else {
                        iM11306 = C19806.m45029("ܰۛ") ^ i3;
                        i = ((iM11306 ^ i4) * (-25147)) ^ 1095087039;
                        i2 = -1183415149;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1377.m4833();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0523 A[PHI: r1 r5 r8 r13 r14 r23 r38
      0x0523: PHI (r1v10 int) = (r1v2 int), (r1v2 int), (r1v9 int), (r1v2 int) binds: [B:11:0x00d2, B:84:0x0521, B:76:0x0466, B:64:0x034f] A[DONT_GENERATE, DONT_INLINE]
      0x0523: PHI (r5v5 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v2 short[]), (r5v10 short[]) binds: [B:11:0x00d2, B:84:0x0521, B:76:0x0466, B:64:0x034f] A[DONT_GENERATE, DONT_INLINE]
      0x0523: PHI (r8v5 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v4 short[]), (r8v2 short[]) binds: [B:11:0x00d2, B:84:0x0521, B:76:0x0466, B:64:0x034f] A[DONT_GENERATE, DONT_INLINE]
      0x0523: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:11:0x00d2, B:84:0x0521, B:76:0x0466, B:64:0x034f] A[DONT_GENERATE, DONT_INLINE]
      0x0523: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:11:0x00d2, B:84:0x0521, B:76:0x0466, B:64:0x034f] A[DONT_GENERATE, DONT_INLINE]
      0x0523: PHI (r23v3 java.lang.String) = (r23v1 java.lang.String), (r23v2 java.lang.String), (r23v1 java.lang.String), (r23v1 java.lang.String) binds: [B:11:0x00d2, B:84:0x0521, B:76:0x0466, B:64:0x034f] A[DONT_GENERATE, DONT_INLINE]
      0x0523: PHI (r38v21 float) = (r38v7 float), (r38v16 float), (r38v18 float), (r38v22 float) binds: [B:11:0x00d2, B:84:0x0521, B:76:0x0466, B:64:0x034f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24640(AbstractActivityC12483 abstractActivityC12483) {
        int iM45029;
        int i;
        int i2;
        short[] sArr;
        short[] sArr2;
        float f;
        int iM11306;
        int i3;
        int i4;
        char c;
        ?? r16;
        int iM450210;
        int i5;
        int i6;
        int i7;
        short[] sArr3;
        float f2;
        int i8;
        int i9;
        short[] sArr4;
        int i10;
        short[] sArr5;
        int i11;
        Resources resources;
        int iM450211;
        int i12;
        int i13;
        int iM11307;
        int i14;
        int i15;
        int i16;
        int iM11308;
        int i17;
        int i18;
        int i19;
        int i20;
        int iM450212;
        int i21;
        int iM11309;
        int i22;
        Resources.Theme theme = null;
        float[] fArr = null;
        int i23 = 0;
        char c2 = 0;
        float f3 = 0.0f;
        boolean z = 0;
        int i24 = 0;
        int iM113010 = 0;
        int i25 = 0;
        String strM5344 = null;
        int iM450213 = 0;
        int i26 = 1353498810;
        int i27 = C2788.f10625;
        int i28 = C1937.f7317;
        int iM450214 = C19806.m45029("۫ۖ") ^ i27;
        int i29 = ((iM450214 ^ i28) * 20909) ^ 1998417988;
        int i30 = iM450214 ^ (-1731891053);
        Resources resources2 = null;
        float[] fArr2 = null;
        ColorStateList colorStateListM38189 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i31 = 0;
        int iM113011 = 0;
        int i32 = 0;
        int i33 = 0;
        int iM113012 = 0;
        int i34 = 0;
        int i35 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        char c3 = 0;
        int i36 = 0;
        boolean zM45991 = false;
        boolean z2 = false;
        ColorStateList colorStateListM381810 = null;
        short[] sArr10 = null;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            i26 = i30 ^ (i29 & (((i26 ^ i28) * 723) >> 31));
            switch (i26) {
                case -2132674941:
                case -735642073:
                    if (C2249.m6915() <= 0) {
                        f3 = f3;
                        iM11306 = C19806.m45029("ۗᩳ") ^ i28;
                        i3 = ((iM11306 ^ i27) * (-16085)) ^ (-1582857546);
                        i4 = -991046365;
                        r16 = z;
                        f = f3;
                        i30 = iM11306 ^ i4;
                        i29 = i3;
                        z = r16;
                        f3 = f;
                    } else {
                        f3 = f3;
                        i36 = i36;
                        sArr7 = sArr7;
                        i31 = i31;
                        sArr = sArr9;
                        i20 = i38;
                        resources2 = resources2;
                        iM113011 = iM113011;
                        iM450212 = (ThreadFactoryC3888.m11306("ۖᩴ") + i28) * 69;
                        i17 = ((iM450212 ^ i27) * 4883) ^ (-1514726132);
                        i21 = -308530871;
                        i19 = iM450212 ^ i21;
                        i38 = i20;
                        sArr9 = sArr;
                        sArr7 = sArr7;
                        f3 = f3;
                        i30 = i19;
                        i29 = i17;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                    }
                    break;
                case -2117155146:
                case -232535155:
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    i31 = i31;
                    sArr = sArr9;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    C20368.f65993 = C0050.m942(theme, C19806.m45029(C3743.m10964(sArr6, 32, 3, i32)) ^ 2122911987);
                    C20368.f65966 = C16631.m39095(resources2, ThreadFactoryC3888.m11306(C1148.m4230(f32648, 35, 3, i32)) ^ 2124008142, theme);
                    if (C1025.f4800 < 0) {
                        iM11309 = (C19806.m45029("ۡۗ") + i27) * 63;
                        i17 = ((iM11309 ^ i28) * 20151) ^ (-2122998723);
                        i22 = 2047439507;
                        i19 = iM11309 ^ i22;
                        sArr9 = sArr;
                        sArr7 = sArr7;
                        f3 = f3;
                        i30 = i19;
                        i29 = i17;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                    } else {
                        sArr2 = sArr7;
                        int iM450215 = C19806.m45029("ܺۛ") ^ i27;
                        int i39 = ((iM450215 ^ i28) * 22271) ^ 715685856;
                        f3 = f3;
                        i30 = iM450215 ^ 469779651;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                        short[] sArr11 = sArr;
                        sArr7 = sArr2;
                        i29 = i39;
                        sArr9 = sArr11;
                    }
                    break;
                case -2000955965:
                case 1471711026:
                    sArr8 = sArr8;
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    i31 = i31;
                    sArr9 = sArr9;
                    i16 = i38;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    if (zM45991) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۚᩳ") + i27) * 43;
                        i17 = ((iM11308 ^ i28) * 12181) ^ 50801961;
                        i18 = -1877182453;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩺᩵") ^ i28;
                        i17 = ((iM11308 ^ i27) * 19603) ^ (-583697874);
                        i18 = -1097163179;
                    }
                    i19 = iM11308 ^ i18;
                    i38 = i16;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -1959393705:
                case 1077454960:
                    f3 = f3;
                    c = 0;
                    iM11306 = ThreadFactoryC3888.m11306("ܰ֡") ^ i28;
                    i3 = ((iM11306 ^ i27) * 6577) ^ (-1487224293);
                    i4 = 2044404472;
                    r16 = c;
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1885615484:
                case 264897812:
                    i32 = 21521;
                    iM450210 = (ThreadFactoryC3888.m11306("۟᩶") ^ i27) * (-103);
                    i5 = ((iM450210 ^ i28) * (-27971)) ^ (-63883446);
                    i6 = -1919841648;
                    int i40 = iM450210 ^ i6;
                    i35 = i35;
                    i38 = i38;
                    iM113011 = iM113011;
                    sArr9 = sArr9;
                    resources2 = resources2;
                    sArr7 = sArr7;
                    i31 = i31;
                    f3 = f3;
                    i30 = i40;
                    i29 = i5;
                    i36 = i36;
                    sArr8 = sArr8;
                    break;
                case -1857093697:
                case 2132168522:
                    f3 = f3;
                    i33 = (C20368.f65970 & i23) + ((C20368.f65975 & i23) * 31);
                    if (zM45991) {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i28;
                        i3 = ((iM11306 ^ i27) * 13351) ^ (-675820609);
                        i4 = 485167698;
                        r16 = z;
                    } else {
                        i24 = i33;
                        iM11306 = C19806.m45029("ۚ᩷") ^ i27;
                        i3 = ((iM11306 ^ i28) * 19833) ^ (-1043777850);
                        i4 = 2143339452;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1838697500:
                case 270737749:
                    f3 = f3;
                    C20368.f65967 = z;
                    C20368.f66002 = C1377.m4838(theme, ThreadFactoryC3888.m11306(C1148.m4230(f32648, 65, 3, i32)) ^ 2129155206);
                    C20368.f65961 = C1377.m4838(theme, ThreadFactoryC3888.m11306(C1377.m4832(f32648, 68, 3, i32)) ^ 2127740396);
                    strM5344 = RunnableC1564.m5344(f32648, 71, 3, i32);
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵۠") ^ i27;
                        i3 = ((iM11306 ^ i28) * (-30789)) ^ (-1716552203);
                        i4 = -1326978413;
                        r16 = z;
                    } else {
                        iM11306 = C19806.m45029("ܳ֡") ^ i27;
                        i3 = ((iM11306 ^ i28) * (-29731)) ^ (-1149634094);
                        i4 = 390598244;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1816314047:
                case 1085752092:
                    f3 = f3;
                    C20368.f65981 = C1377.m4838(theme, iM113011);
                    C20368.f65996 = C1377.m4838(theme, ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(f32648, 80, 3, i32)) ^ 2098211447);
                    C20368.f66001 = C1377.m4838(theme, ThreadFactoryC3888.m11306(C1460.m5047(f32648, 83, 3, i32)) ^ 2119220536);
                    sArr8 = f32648;
                    i31 = 86;
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵۠") ^ i27;
                        i3 = ((iM11306 ^ i28) * (-30789)) ^ (-1716552203);
                        i4 = -1326978413;
                        r16 = z;
                    } else {
                        iM11306 = C19806.m45029("ۧܺ") ^ i27;
                        i3 = ((iM11306 ^ i28) * 25187) ^ (-695461313);
                        i4 = -1731252854;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1816044830:
                case 955812894:
                    f3 = f3;
                    C20368.f65986 = C0050.m942(theme, ThreadFactoryC3888.m11306(C0797.m3361(f32648, 101, 3, i32)) ^ 2130598622);
                    C20368.f65964 = C0050.m942(theme, ThreadFactoryC3888.m11306(C0817.m3406(f32648, IShizukuService.Stub.TRANSACTION_isHidden, 3, i32)) ^ 2100895963);
                    sArr9 = f32648;
                    i37 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i34 = 3;
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵۠") ^ i27;
                        i3 = ((iM11306 ^ i28) * (-30789)) ^ (-1716552203);
                        i4 = -1326978413;
                        r16 = z;
                    } else {
                        iM11306 = (i28 - C19806.m45029("᩺ܽ")) * (-105);
                        i3 = ((iM11306 ^ i27) * 27755) ^ 298694460;
                        i4 = -419262146;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1798091893:
                case 146463335:
                    f3 = f3;
                    if (zM45991) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۘ") ^ i27;
                        i3 = ((iM11306 ^ i28) * 2499) ^ 567231742;
                        i4 = 1962427296;
                        r16 = z;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۜ") + i28) * (-51);
                        i3 = ((iM11306 ^ i27) * 9205) ^ (-1103806890);
                        i4 = -1255725674;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1715890080:
                case -1635889000:
                    RunnableC1564.m5345();
                    if (!C0817.m3399()) {
                        sArr3 = sArr8;
                        f2 = f3;
                        i9 = i36;
                        sArr4 = sArr7;
                        i10 = i31;
                        sArr5 = sArr9;
                        i11 = i38;
                        Resources resources3 = resources2;
                        i7 = iM113011;
                        i8 = i35;
                        resources = resources3;
                        iM450211 = ThreadFactoryC3888.m11306("᩷᩺") ^ i27;
                        i12 = ((iM450211 ^ i28) * (-31539)) ^ 808833076;
                        i13 = 323385285;
                        int i41 = iM450211 ^ i13;
                        i38 = i11;
                        sArr9 = sArr5;
                        sArr8 = sArr3;
                        sArr7 = sArr4;
                        f3 = f2;
                        i30 = i41;
                        i29 = i12;
                        i31 = i10;
                        i36 = i9;
                        Resources resources4 = resources;
                        i35 = i8;
                        iM113011 = i7;
                        resources2 = resources4;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۟") ^ i28;
                        i = ((iM45029 ^ i27) * (-6697)) ^ (-1650292409);
                        i2 = 707700674;
                        i30 = iM45029 ^ i2;
                        i29 = i;
                    }
                    break;
                case -1709412007:
                case 6094837:
                    z2 = true;
                    iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i28;
                    i3 = ((iM11306 ^ i27) * 4885) ^ 179462386;
                    i4 = -1786926635;
                    r16 = z;
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1695520851:
                case 1428530179:
                    i16 = i38;
                    C20368.f65992 = (C20368.f65970 & i23) | DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
                    iM11308 = (C19806.m45029("ۨۧ") ^ i28) * (-47);
                    i17 = ((iM11308 ^ i27) * 18493) ^ (-1190695399);
                    i18 = 500430792;
                    i19 = iM11308 ^ i18;
                    i38 = i16;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -1683957161:
                case -1221301381:
                    f3 = f3;
                    C20368.f65979 = C1377.m4838(theme, iM450213 ^ 2097339168);
                    C20368.f65978 = C1377.m4838(theme, C19806.m45029(ViewTreeObserverOnPreDrawListenerC3327.m9869(f32648, 95, 3, i32)) ^ 2102316893);
                    C20368.f65995 = C0050.m942(theme, ThreadFactoryC3888.m11306(RunnableC0195.m1429(f32648, 98, 3, i32)) ^ 2130080244);
                    if (C1875.m6086() == 0) {
                        iM11306 = (i27 - ThreadFactoryC3888.m11306("᩷֡")) * q.h;
                        i3 = ((iM11306 ^ i28) * (-31531)) ^ 1138326649;
                        i4 = 1290657666;
                        r16 = z;
                        f = f3;
                        i30 = iM11306 ^ i4;
                        i29 = i3;
                        z = r16;
                        f3 = f;
                    } else {
                        i36 = i36;
                        sArr7 = sArr7;
                        i31 = i31;
                        sArr = sArr9;
                        i20 = i38;
                        resources2 = resources2;
                        iM113011 = iM113011;
                        iM450212 = (ThreadFactoryC3888.m11306("ۖᩴ") + i28) * 69;
                        i17 = ((iM450212 ^ i27) * 4883) ^ (-1514726132);
                        i21 = -308530871;
                        i19 = iM450212 ^ i21;
                        i38 = i20;
                        sArr9 = sArr;
                        sArr7 = sArr7;
                        f3 = f3;
                        i30 = i19;
                        i29 = i17;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                    }
                    break;
                case -1631385124:
                case -1412851038:
                    z2 = false;
                    iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i28;
                    i3 = ((iM11306 ^ i27) * 4885) ^ 179462386;
                    i4 = -1786926635;
                    r16 = z;
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1592374050:
                case -540758183:
                    C20368.f66002 = C20368.f65975;
                    f3 = f3;
                    iM11306 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i27) * (-97);
                    i3 = ((iM11306 ^ i28) * 15019) ^ 168413534;
                    i4 = -1884715226;
                    r16 = z;
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1557139479:
                case 793857586:
                    C1148.m4232();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        f3 = f3;
                        i36 = i36;
                        sArr2 = sArr7;
                        i31 = i31;
                        sArr = sArr9;
                        resources2 = resources2;
                        iM113011 = iM113011;
                        int iM450216 = C19806.m45029("ܺۛ") ^ i27;
                        int i310 = ((iM450216 ^ i28) * 22271) ^ 715685856;
                        f3 = f3;
                        i30 = iM450216 ^ 469779651;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                        short[] sArr12 = sArr;
                        sArr7 = sArr2;
                        i29 = i310;
                        sArr9 = sArr12;
                    } else {
                        f3 = f3;
                        i36 = i36;
                        sArr7 = sArr7;
                        i31 = i31;
                        sArr = sArr9;
                        i20 = i38;
                        resources2 = resources2;
                        iM113011 = iM113011;
                        iM450212 = (ThreadFactoryC3888.m11306("ۖᩴ") + i28) * 69;
                        i17 = ((iM450212 ^ i27) * 4883) ^ (-1514726132);
                        i21 = -308530871;
                        i19 = iM450212 ^ i21;
                        i38 = i20;
                        sArr9 = sArr;
                        sArr7 = sArr7;
                        f3 = f3;
                        i30 = i19;
                        i29 = i17;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                    }
                    break;
                case -1538446493:
                case 169578737:
                    i16 = i38;
                    fArr[i16] = fArr[i16] * 0.9425f;
                    fArr[c3] = fArr[c3] * 1.3619f;
                    fArr[c2] = ((fArr2[c2] * f5) + f4) * fArr[c2];
                    C20368.f65992 = Color.HSVToColor(153, fArr);
                    iM11308 = (C19806.m45029("ۨۧ") ^ i28) * (-47);
                    i17 = ((iM11308 ^ i27) * 18493) ^ (-1190695399);
                    i18 = 500430792;
                    i19 = iM11308 ^ i18;
                    i38 = i16;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -1517344262:
                case 1591672247:
                    i36 = i36;
                    int i42 = i31;
                    Resources resources5 = resources2;
                    C3057.m9161(C20368.f65970, fArr);
                    fArr[c2] = fArr[c2] * 0.9f;
                    C20368.f65972 = Color.HSVToColor(fArr);
                    C20368.f66006 = C16631.m39095(resources5, C19806.m45029(RunnableC1895.m6164(f32648, 23, 3, i32)) ^ 2097402275, theme);
                    colorStateListM381810 = C16135.m38189(theme, R.attr.textColorPrimary);
                    int iM450217 = (i27 - C19806.m45029("ۚۡ")) * (-97);
                    i30 = iM450217 ^ (-946922899);
                    i29 = ((iM450217 ^ i28) * 23989) ^ 851595406;
                    i38 = i38;
                    iM113011 = iM113011;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    resources2 = resources5;
                    sArr7 = sArr7;
                    i31 = i42;
                    f3 = 0.9f;
                    i36 = i36;
                    break;
                case -1439774793:
                case 720680519:
                    C20368.f66000 = i24;
                    break;
                case -1333788484:
                case -961817616:
                    C1668.m5583();
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("᩺᩷") ^ i27;
                        i = ((iM45029 ^ i28) * 15031) ^ 1098736494;
                        i2 = 1426871144;
                        i30 = iM45029 ^ i2;
                        i29 = i;
                    } else {
                        f3 = f3;
                        iM11306 = C19806.m45029("ۗᩳ") ^ i28;
                        i3 = ((iM11306 ^ i27) * (-16085)) ^ (-1582857546);
                        i4 = -991046365;
                        r16 = z;
                        f = f3;
                        i30 = iM11306 ^ i4;
                        i29 = i3;
                        z = r16;
                        f3 = f;
                    }
                    break;
                case -1268765827:
                case 118926596:
                    C3057.m9161(C20368.f65975, fArr);
                    fArr[c2] = fArr[c2] * f3;
                    C20368.f66002 = Color.HSVToColor(fArr);
                    f3 = f3;
                    iM11306 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i27) * (-97);
                    i3 = ((iM11306 ^ i28) * 15019) ^ 168413534;
                    i4 = -1884715226;
                    r16 = z;
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1241128264:
                case -1114078732:
                    f3 = f3;
                    C20368.f66010 = C0050.m942(theme, C19806.m45029(ThreadFactoryC3888.m11312(sArr9, i37, i34, i32)) ^ 2121889200);
                    C20368.f65974 = C1377.m4838(theme, ThreadFactoryC3888.m11306(C1148.m4230(f32648, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i32)) ^ 2121987554);
                    iM113012 = 2097784997 ^ ThreadFactoryC3888.m11306(C0050.m940(f32648, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i32));
                    iM11306 = C19806.m45029("ۧۖ") ^ i27;
                    i3 = ((iM11306 ^ i28) * (-27297)) ^ (-1235618183);
                    i4 = -1715621592;
                    r16 = z;
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1108805855:
                case 677248674:
                    f3 = f3;
                    if (C1377.m4838(theme, C19806.m45029(RunnableC1606.m5481(f32648, 122, 3, i32)) ^ 2097528340) != 0) {
                        iM11306 = (i27 - C19806.m45029("᩹ܿ")) * 97;
                        i3 = ((iM11306 ^ i28) * (-22423)) ^ (-776811748);
                        i4 = 157017588;
                        r16 = z;
                    } else {
                        iM11306 = C19806.m45029("֡۠") ^ i28;
                        i3 = ((iM11306 ^ i27) * (-10677)) ^ (-1525925221);
                        i4 = -512877866;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -1047382547:
                case -122557771:
                    C1460.m5050();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        sArr3 = sArr8;
                        f2 = f3;
                        i9 = i36;
                        sArr4 = sArr7;
                        i10 = i31;
                        sArr5 = sArr9;
                        i11 = i38;
                        Resources resources6 = resources2;
                        i7 = iM113011;
                        i8 = i35;
                        resources = resources6;
                        iM450211 = ThreadFactoryC3888.m11306("᩷᩺") ^ i27;
                        i12 = ((iM450211 ^ i28) * (-31539)) ^ 808833076;
                        i13 = 323385285;
                        int i43 = iM450211 ^ i13;
                        i38 = i11;
                        sArr9 = sArr5;
                        sArr8 = sArr3;
                        sArr7 = sArr4;
                        f3 = f2;
                        i30 = i43;
                        i29 = i12;
                        i31 = i10;
                        i36 = i9;
                        Resources resources7 = resources;
                        i35 = i8;
                        iM113011 = i7;
                        resources2 = resources7;
                    } else {
                        f3 = f3;
                        i36 = i36;
                        sArr7 = sArr7;
                        i31 = i31;
                        sArr = sArr9;
                        i20 = i38;
                        resources2 = resources2;
                        iM113011 = iM113011;
                        iM450212 = (ThreadFactoryC3888.m11306("ۖᩴ") + i28) * 69;
                        i17 = ((iM450212 ^ i27) * 4883) ^ (-1514726132);
                        i21 = -308530871;
                        i19 = iM450212 ^ i21;
                        i38 = i20;
                        sArr9 = sArr;
                        sArr7 = sArr7;
                        f3 = f3;
                        i30 = i19;
                        i29 = i17;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                    }
                    break;
                case -1029308292:
                case 1662509743:
                    f3 = f3;
                    C20368.f65994 = C0050.m942(theme, C19806.m45029(strM5344) ^ 2117952528);
                    C20368.f65991 = C1377.m4838(theme, ThreadFactoryC3888.m11306(C1460.m5047(f32648, 74, 3, i32)) ^ 2123807731);
                    iM113011 = 2125256905 ^ ThreadFactoryC3888.m11306(C2788.m8470(f32648, 77, 3, i32));
                    if (C0671.m3008() >= 0) {
                        iM11306 = C19806.m45029("ۗᩳ") ^ i28;
                        i3 = ((iM11306 ^ i27) * (-16085)) ^ (-1582857546);
                        i4 = -991046365;
                        r16 = z;
                    } else {
                        iM11306 = C19806.m45029("֨ܶ") ^ i28;
                        i3 = ((iM11306 ^ i27) * 25611) ^ 380241178;
                        i4 = -1425309441;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case -994373313:
                case 313700538:
                    i31 = i31;
                    sArr = sArr9;
                    f3 = f3;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    short[] sArr13 = sArr10;
                    C1377.m4838(theme, ThreadFactoryC3888.m11306(C3722.m10901(sArr13, 44, 3, i32)) ^ 2098909990);
                    C20368.f65965 = C16631.m39095(resources2, ThreadFactoryC3888.m11306(C1066.m4040(f32648, 47, 3, i32)) ^ 2122521885, theme);
                    sArr2 = f32648;
                    if (C1977.f7413 > 0) {
                        int iM113013 = ThreadFactoryC3888.m11306("ۧ֫") ^ i27;
                        sArr10 = sArr13;
                        iM113011 = iM113011;
                        sArr9 = sArr;
                        sArr7 = sArr2;
                        resources2 = resources2;
                        i29 = ((iM113013 ^ i28) * (-5209)) ^ 906746511;
                        i31 = i31;
                        i36 = 50;
                        f = f3;
                        i30 = iM113013 ^ (-754033134);
                        z = z;
                        f3 = f;
                    } else {
                        sArr10 = sArr13;
                        i36 = 50;
                        int iM450218 = C19806.m45029("ܺۛ") ^ i27;
                        int i311 = ((iM450218 ^ i28) * 22271) ^ 715685856;
                        f3 = f3;
                        i30 = iM450218 ^ 469779651;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                        short[] sArr14 = sArr;
                        sArr7 = sArr2;
                        i29 = i311;
                        sArr9 = sArr14;
                    }
                    break;
                case -907130636:
                case 732769202:
                    C1419.m4973();
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    i31 = i31;
                    sArr = sArr9;
                    i20 = i38;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    iM450212 = (ThreadFactoryC3888.m11306("ۖᩴ") + i28) * 69;
                    i17 = ((iM450212 ^ i27) * 4883) ^ (-1514726132);
                    i21 = -308530871;
                    i19 = iM450212 ^ i21;
                    i38 = i20;
                    sArr9 = sArr;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -837270074:
                case 1003646484:
                    short[] sArr15 = sArr8;
                    float f6 = f3;
                    i36 = i36;
                    short[] sArr16 = sArr7;
                    i31 = i31;
                    short[] sArr17 = sArr9;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    C20368.f66008 = C1377.m4838(theme, iM113010 ^ i25);
                    C20368.f65989 = C0050.m942(theme, ThreadFactoryC3888.m11306(C1461.m5070(f32648, 17, 3, i32)) ^ 2103874745);
                    fArr = new float[3];
                    c3 = 1;
                    i23 = 16777215;
                    c2 = 2;
                    i38 = 0;
                    if (C1377.m4838(theme, C19806.m45029(C2704.m8240(f32648, 20, 3, i32)) ^ 2100703140) != 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩻ܺ") ^ i27) * (-69);
                        i14 = ((iM11307 ^ i28) * 19447) ^ 1001968035;
                        i15 = -564212208;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۜۡ") ^ i28;
                        i14 = ((iM11307 ^ i27) * 27907) ^ (-1871315277);
                        i15 = -1908803613;
                    }
                    int i44 = iM11307 ^ i15;
                    i29 = i14;
                    sArr9 = sArr17;
                    sArr8 = sArr15;
                    i35 = 3;
                    sArr7 = sArr16;
                    f3 = f6;
                    i30 = i44;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -654815018:
                case 115371872:
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    i31 = i31;
                    resources2 = resources2;
                    C20368.f65962 = C16631.m39095(resources2, ThreadFactoryC3888.m11306(C1937.m6288(sArr7, i36, 3, i32)) ^ 2119080963, theme);
                    C20368.f66004 = C1377.m4838(theme, R.attr.colorBackground);
                    iM113011 = iM113011;
                    sArr = sArr9;
                    colorStateListM38189 = C16135.m38189(theme, ThreadFactoryC3888.m11306(C0526.m2424(f32648, 53, 3, i32)) ^ 2121384733);
                    iM11309 = (ThreadFactoryC3888.m11306("ᩳۡ") ^ i28) * 93;
                    i17 = ((iM11309 ^ i27) * 19489) ^ 1741512588;
                    i22 = 479858034;
                    i19 = iM11309 ^ i22;
                    sArr9 = sArr;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -603676991:
                case 1738003710:
                    C19806.m45024();
                    break;
                case -603421049:
                case 311914949:
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    i31 = i31;
                    sArr = sArr9;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    C20368.f65998 = C16631.m39095(resources2, ThreadFactoryC3888.m11306(C0216.m1588(f32648, 38, 3, i32)) ^ 2124223774, theme);
                    C20368.f65983 = C0050.m942(theme, C19806.m45029(C1066.m4040(f32648, 41, 3, i32)) ^ 2130538811);
                    sArr10 = f32648;
                    iM11309 = ThreadFactoryC3888.m11306("ܽۘ") ^ i28;
                    i17 = ((iM11309 ^ i27) * 21005) ^ 1119928069;
                    i22 = 789021545;
                    i19 = iM11309 ^ i22;
                    sArr9 = sArr;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case -450458905:
                case 1621767849:
                    i7 = iM113011;
                    sArr3 = sArr8;
                    f2 = f3;
                    i8 = i35;
                    i9 = i36;
                    sArr4 = sArr7;
                    i10 = i31;
                    sArr5 = sArr9;
                    i11 = i38;
                    zM45991 = C20368.m45991();
                    Resources resources8 = abstractActivityC12483.getResources();
                    theme = abstractActivityC12483.getTheme();
                    resources = resources8;
                    C20368.f65975 = C0050.m942(theme, C19806.m45029(RunnableC1895.m6164(f32648, 8, 3, i32)) ^ 2100028844);
                    C20368.f65970 = C1377.m4838(theme, C19806.m45029(RunnableC1606.m5481(f32648, 11, 3, i32)) ^ 2121884085);
                    iM113010 = ThreadFactoryC3888.m11306(C1398.m4892(f32648, 14, 3, i32));
                    i25 = 2122575587;
                    if (C3286.m9798() <= 0) {
                        iM450211 = ThreadFactoryC3888.m11306("᩷᩺") ^ i27;
                        i12 = ((iM450211 ^ i28) * (-31539)) ^ 808833076;
                        i13 = 323385285;
                    } else {
                        iM450211 = C19806.m45029("ᩳ۫") ^ i28;
                        i12 = ((iM450211 ^ i27) * (-4615)) ^ 2078912409;
                        i13 = 631704179;
                    }
                    int i45 = iM450211 ^ i13;
                    i38 = i11;
                    sArr9 = sArr5;
                    sArr8 = sArr3;
                    sArr7 = sArr4;
                    f3 = f2;
                    i30 = i45;
                    i29 = i12;
                    i31 = i10;
                    i36 = i9;
                    Resources resources9 = resources;
                    i35 = i8;
                    iM113011 = i7;
                    resources2 = resources9;
                    break;
                case -145258460:
                case 495971323:
                    f3 = f3;
                    i24 = ~i33;
                    iM11306 = C19806.m45029("ۚ᩷") ^ i27;
                    i3 = ((iM11306 ^ i28) * 19833) ^ (-1043777850);
                    i4 = 2143339452;
                    r16 = z;
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case 118528664:
                case 1390151565:
                    i16 = i38;
                    fArr[i16] = fArr[i16] * 0.9424f;
                    fArr[c3] = fArr[c3] * 1.1285f;
                    fArr[c2] = ((fArr2[c2] * f5) + f4) * fArr[c2];
                    C20368.f65992 = Color.HSVToColor(72, fArr);
                    iM11308 = (C19806.m45029("ۨۧ") ^ i28) * (-47);
                    i17 = ((iM11308 ^ i27) * 18493) ^ (-1190695399);
                    i18 = 500430792;
                    i19 = iM11308 ^ i18;
                    i38 = i16;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case 165380679:
                case 1618645934:
                    i32 = 15712;
                    iM450210 = (ThreadFactoryC3888.m11306("۟᩶") ^ i27) * (-103);
                    i5 = ((iM450210 ^ i28) * (-27971)) ^ (-63883446);
                    i6 = -1919841648;
                    int i46 = iM450210 ^ i6;
                    i35 = i35;
                    i38 = i38;
                    iM113011 = iM113011;
                    sArr9 = sArr9;
                    resources2 = resources2;
                    sArr7 = sArr7;
                    i31 = i31;
                    f3 = f3;
                    i30 = i46;
                    i29 = i5;
                    i36 = i36;
                    sArr8 = sArr8;
                    break;
                case 181590756:
                case 1758972083:
                    C20368.f66002 = C20368.f65975;
                    f3 = f3;
                    iM11306 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i27) * (-97);
                    i3 = ((iM11306 ^ i28) * 15019) ^ 168413534;
                    i4 = -1884715226;
                    r16 = z;
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case 216713928:
                case 1294015087:
                    f3 = f3;
                    C20368.f65999 = C0050.m942(theme, ThreadFactoryC3888.m11306(C1398.m4892(sArr8, i31, 3, i32)) ^ 2124045147);
                    C20368.f66003 = C1377.m4838(theme, C19806.m45029(C0278.m1774(f32648, 89, 3, i32)) ^ 2100186815);
                    iM450213 = C19806.m45029(C0050.m940(f32648, 92, 3, i32));
                    if (C19806.m45024()) {
                        iM11306 = C19806.m45029("۬ۛ") ^ i27;
                        i3 = ((iM11306 ^ i28) * (-8109)) ^ (-68976430);
                        i4 = -2143022632;
                        r16 = z;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i28;
                        i3 = ((iM11306 ^ i27) * 3351) ^ (-441350853);
                        i4 = 1880899968;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case 308894251:
                case 1695169358:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ۧܿ") + i28) * (-47);
                        i = ((iM45029 ^ i27) * 11499) ^ 419789081;
                        i2 = 562318293;
                        i30 = iM45029 ^ i2;
                        i29 = i;
                    } else {
                        f3 = f3;
                        i36 = i36;
                        sArr2 = sArr7;
                        i31 = i31;
                        sArr = sArr9;
                        resources2 = resources2;
                        iM113011 = iM113011;
                        int iM450219 = C19806.m45029("ܺۛ") ^ i27;
                        int i312 = ((iM450219 ^ i28) * 22271) ^ 715685856;
                        f3 = f3;
                        i30 = iM450219 ^ 469779651;
                        iM113011 = iM113011;
                        resources2 = resources2;
                        i31 = i31;
                        i36 = i36;
                        short[] sArr18 = sArr;
                        sArr7 = sArr2;
                        i29 = i312;
                        sArr9 = sArr18;
                    }
                    break;
                case 519248762:
                case 1294681870:
                    sArr8 = sArr8;
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    i31 = i31;
                    sArr9 = sArr9;
                    i38 = i38;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    i35 = i35;
                    short s = f32648[7];
                    int i47 = (s * s) + 1069156;
                    int i48 = s + 1034;
                    if ((i47 + i47) - (i48 * i48) < 0) {
                        iM450210 = (C19806.m45029("ᩴܶ") ^ i27) * (-95);
                        i5 = ((iM450210 ^ i28) * (-9337)) ^ (-938236833);
                        i6 = -1821032704;
                    } else {
                        iM450210 = C19806.m45029("֫ۜ") ^ i28;
                        i5 = ((iM450210 ^ i27) * (-19895)) ^ (-716971757);
                        i6 = -496549445;
                    }
                    int i49 = iM450210 ^ i6;
                    i35 = i35;
                    i38 = i38;
                    iM113011 = iM113011;
                    sArr9 = sArr9;
                    resources2 = resources2;
                    sArr7 = sArr7;
                    i31 = i31;
                    f3 = f3;
                    i30 = i49;
                    i29 = i5;
                    i36 = i36;
                    sArr8 = sArr8;
                    break;
                case 927137980:
                case 982981598:
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    i31 = i31;
                    sArr = sArr9;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    C20368.f65976 = colorStateListM381810;
                    C20368.f66009 = C16135.m38189(theme, R.attr.textColorSecondary);
                    C20368.f66007 = C20368.f65976.getDefaultColor();
                    C20368.f65988 = C20368.f66009.getDefaultColor();
                    int[] iArr = {-16842910};
                    i20 = i38;
                    C20368.f65963 = C20368.f65976.getColorForState(iArr, i20);
                    C20368.f65969 = C20368.f66009.getColorForState(iArr, i20);
                    if (RunnableC0195.m1431()) {
                        iM450212 = (C19806.m45029("ᩳ֫") + i28) * 63;
                        i17 = ((iM450212 ^ i27) * 21941) ^ 135425507;
                        i21 = 1166316998;
                    } else {
                        iM450212 = (ThreadFactoryC3888.m11306("ۖᩴ") + i28) * 69;
                        i17 = ((iM450212 ^ i27) * 4883) ^ (-1514726132);
                        i21 = -308530871;
                    }
                    i19 = iM450212 ^ i21;
                    i38 = i20;
                    sArr9 = sArr;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case 938841346:
                case 1703237899:
                    short[] sArr19 = sArr8;
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    int i50 = i31;
                    sArr9 = sArr9;
                    i38 = i38;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    i35 = i35;
                    float[] fArr3 = new float[i35];
                    C3057.m9161(C20368.f65970, fArr);
                    C3057.m9161(C20368.f65975, fArr3);
                    f5 = 0.2f;
                    f4 = 0.8f;
                    if (zM45991) {
                        int iM450220 = C19806.m45029("֫ۨ") ^ i28;
                        i29 = ((iM450220 ^ i27) * (-23119)) ^ (-1209963437);
                        fArr2 = fArr3;
                        i30 = iM450220 ^ (-1184840579);
                    } else {
                        int iM113014 = (ThreadFactoryC3888.m11306("ۜ᩻") + i27) * (-57);
                        fArr2 = fArr3;
                        i30 = iM113014 ^ 1468262530;
                        i29 = ((iM113014 ^ i28) * (-18637)) ^ (-1356352152);
                    }
                    i31 = i50;
                    sArr8 = sArr19;
                    i36 = i36;
                    break;
                case 1101563901:
                case 1111120527:
                    f3 = f3;
                    i36 = i36;
                    sArr7 = sArr7;
                    i31 = i31;
                    sArr = sArr9;
                    resources2 = resources2;
                    iM113011 = iM113011;
                    C20368.f65973 = C16631.m39095(resources2, ThreadFactoryC3888.m11306(C1148.m4230(f32648, 26, 3, i32)) ^ 2126403117, theme);
                    C20368.f66005 = C0050.m942(theme, ThreadFactoryC3888.m11306(C10634.m26821(f32648, 29, 3, i32)) ^ 2117101707);
                    sArr6 = f32648;
                    iM11309 = (i27 - ThreadFactoryC3888.m11306("۫ܳ")) * 15;
                    i17 = ((iM11309 ^ i28) * 677) ^ (-319508352);
                    i22 = 2060521023;
                    i19 = iM11309 ^ i22;
                    sArr9 = sArr;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                case 1108904975:
                case 1437214305:
                    if (C1668.f6641 >= 0) {
                        f3 = f3;
                        iM11306 = ThreadFactoryC3888.m11306("᩵۠") ^ i27;
                        i3 = ((iM11306 ^ i28) * (-30789)) ^ (-1716552203);
                        i4 = -1326978413;
                        r16 = z;
                        f = f3;
                        i30 = iM11306 ^ i4;
                        i29 = i3;
                        z = r16;
                        f3 = f;
                    } else {
                        iM45029 = (C19806.m45029("ۧܿ") + i28) * (-47);
                        i = ((iM45029 ^ i27) * 11499) ^ 419789081;
                        i2 = 562318293;
                        i30 = iM45029 ^ i2;
                        i29 = i;
                    }
                    break;
                case 1135321797:
                case 2126579634:
                    f3 = f3;
                    C20368.f65997 = z2;
                    if (C1377.m4838(theme, ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(f32648, 62, 3, i32)) ^ 2099013322) != 0) {
                        c = c3;
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֡") ^ i28;
                        i3 = ((iM11306 ^ i27) * 6577) ^ (-1487224293);
                        i4 = 2044404472;
                        r16 = c;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩹") ^ i27) * 69;
                        i3 = ((iM11306 ^ i28) * (-19145)) ^ (-1382136935);
                        i4 = -382344657;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case 1147141444:
                case 1280542513:
                    f3 = f3;
                    C20368.f65980 = C0050.m942(theme, iM113012);
                    C20368.f65982 = C1377.m4838(theme, ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(f32648, 116, 3, i32)) ^ 2123268921);
                    C20368.f65977 = C1377.m4838(theme, C19806.m45029(C2249.m6918(f32648, 119, 3, i32)) ^ 2122015847);
                    if (C20368.f66002 == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺۠") ^ i28;
                        i3 = ((iM11306 ^ i27) * 8935) ^ (-1893768761);
                        i4 = -486173524;
                        r16 = z;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i27) * (-97);
                        i3 = ((iM11306 ^ i28) * 15019) ^ 168413534;
                        i4 = -1884715226;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
                case 1954021615:
                case 2136336494:
                    i16 = i38;
                    C20368.f65992 = (C20368.f65970 & i23) | 1207959552;
                    iM11308 = (C19806.m45029("ۨۧ") ^ i28) * (-47);
                    i17 = ((iM11308 ^ i27) * 18493) ^ (-1190695399);
                    i18 = 500430792;
                    i19 = iM11308 ^ i18;
                    i38 = i16;
                    sArr9 = sArr9;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    f3 = f3;
                    i30 = i19;
                    i29 = i17;
                    iM113011 = iM113011;
                    resources2 = resources2;
                    i31 = i31;
                    i36 = i36;
                    break;
                default:
                    f3 = f3;
                    C20368.f65987 = colorStateListM38189;
                    C20368.f65968 = C16135.m38189(theme, ThreadFactoryC3888.m11306(C1461.m5070(f32648, 56, 3, i32)) ^ 2118285289);
                    if (C1377.m4838(theme, ThreadFactoryC3888.m11306(CallableC1627.m5502(f32648, 59, 3, i32)) ^ 2125491269) != 0) {
                        iM11306 = C19806.m45029("ۧ᩵") ^ i27;
                        i3 = ((iM11306 ^ i28) * 20409) ^ (-531299007);
                        i4 = 1341287393;
                        r16 = z;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩵") + i28) * (-3);
                        i3 = ((iM11306 ^ i27) * (-30561)) ^ 1300018305;
                        i4 = -1576753237;
                        r16 = z;
                    }
                    f = f3;
                    i30 = iM11306 ^ i4;
                    i29 = i3;
                    z = r16;
                    f3 = f;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PorterDuffColorFilter m24638(int i) {
        int i2 = 1309487664;
        int i3 = C0278.f1572;
        int i4 = C1668.f6641;
        int iM45029 = C19806.m45029("᩵ۨ") ^ i4;
        int i5 = ((iM45029 ^ i3) * (-5161)) ^ (-1949326274);
        int i6 = -1655462564;
        while (true) {
            i2 = ((((i2 ^ i3) * (-27123)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1856289228:
                case 760446322:
                    C1460.m5050();
                    C3286.m9798();
                    return null;
                case -1574295137:
                case -180076499:
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (C19806.m45029("ܿ᩵") ^ i3) * (-7);
                        i5 = ((iM45029 ^ i4) * (-11663)) ^ 400711468;
                        i6 = -72678112;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܶ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 16387) ^ 81580232;
                        i6 = 1805215503;
                    }
                    break;
                case -1559963756:
                case -16923317:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i4) * (-105);
                        i5 = ((iM45029 ^ i3) * (-8545)) ^ (-754752527);
                        i6 = 17851303;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܿ") + i3) * (-95);
                        i5 = ((iM45029 ^ i4) * 32189) ^ 1304955906;
                        i6 = 1997281512;
                    }
                    break;
                case -1444826800:
                case 184427479:
                    if (C2477.f9839 > 0) {
                        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                    }
                    iM45029 = C19806.m45029("ܶۜ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 1429) ^ (-511345463);
                    i6 = -1582719756;
                    break;
                case -1126270475:
                case -945968182:
                    if (!C0817.f3443) {
                        iM45029 = (C19806.m45029("ۤۢ") + i4) * (-105);
                        i5 = ((iM45029 ^ i3) * (-8545)) ^ (-754752527);
                        i6 = 17851303;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۚ") + i4) * (-35);
                        i5 = ((iM45029 ^ i3) * (-29555)) ^ (-1649955980);
                        i6 = 1719742916;
                    }
                    break;
                case -1074237274:
                case -778808257:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i4) * (-105);
                        i5 = ((iM45029 ^ i3) * (-8545)) ^ (-754752527);
                        i6 = 17851303;
                    } else {
                        iM45029 = (C19806.m45029("ܿܳ") + i3) * 19;
                        i5 = ((iM45029 ^ i4) * 9851) ^ 62354053;
                        i6 = 835541920;
                    }
                    break;
                case -904711735:
                case 1156396787:
                    C1419.m4973();
                    iM45029 = C19806.m45029("᩵ܳ") ^ i4;
                    i5 = ((iM45029 ^ i3) * 12941) ^ 1404809256;
                    i6 = 102928885;
                    break;
                case -601708447:
                case 1447794841:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۚ") + i4) * (-35);
                        i5 = ((iM45029 ^ i3) * (-29555)) ^ (-1649955980);
                        i6 = 1719742916;
                    } else {
                        iM45029 = C19806.m45029("۬۬") ^ i3;
                        i5 = ((iM45029 ^ i4) * 30927) ^ (-1645500666);
                        i6 = 1028227404;
                    }
                    break;
                case -550838084:
                case 238802505:
                    if (C0671.f2816 == 0) {
                        iM45029 = (C19806.m45029("ܿ᩵") ^ i3) * (-7);
                        i5 = ((iM45029 ^ i4) * (-11663)) ^ 400711468;
                        i6 = -72678112;
                    } else {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 12941) ^ 1404809256;
                        i6 = 102928885;
                    }
                    break;
                case -422210651:
                case 1736980451:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("ۢۡ") + i3) * (-37);
                        i5 = ((iM45029 ^ i4) * 529) ^ 664930282;
                        i6 = 340597842;
                    } else {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 12941) ^ 1404809256;
                        i6 = 102928885;
                    }
                    break;
                case -276435634:
                case 506146497:
                    if (C0526.m2437() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۚ") + i4) * (-35);
                        i5 = ((iM45029 ^ i3) * (-29555)) ^ (-1649955980);
                        i6 = 1719742916;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ᩵") ^ i4) * 29;
                        i5 = ((iM45029 ^ i3) * 23105) ^ (-435011912);
                        i6 = -1948870572;
                    }
                    break;
                case 170554064:
                case 991452339:
                    int i7 = C16135.f52139;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۚ") + i4) * (-35);
                        i5 = ((iM45029 ^ i3) * (-29555)) ^ (-1649955980);
                        i6 = 1719742916;
                    } else {
                        iM45029 = C19806.m45029("ۢۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31101) ^ 797943985;
                        i6 = -1053710269;
                    }
                    break;
                case 540958635:
                case 1837234085:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("ܶۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 1429) ^ (-511345463);
                        i6 = -1582719756;
                    } else {
                        iM45029 = C19806.m45029("֨᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-16561)) ^ 338933239;
                        i6 = -1084366037;
                    }
                    break;
                case 748260521:
                case 928056415:
                    C3535.m10431();
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i4) * (-105);
                        i5 = ((iM45029 ^ i3) * (-8545)) ^ (-754752527);
                        i6 = 17851303;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩵") ^ i3) * (-7);
                        i5 = ((iM45029 ^ i4) * (-11663)) ^ 400711468;
                        i6 = -72678112;
                    }
                    break;
                default:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("ۤۢ") + i4) * (-105);
                        i5 = ((iM45029 ^ i3) * (-8545)) ^ (-754752527);
                        i6 = 17851303;
                    } else {
                        iM45029 = C19806.m45029("ۧ۬") ^ i4;
                        i5 = ((iM45029 ^ i3) * 31541) ^ (-2111397736);
                        i6 = 1190028357;
                    }
                    break;
            }
        }
    }
}
